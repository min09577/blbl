# -*- coding: utf-8 -*-
"""Clean AppPrefs.kt and PlayerSettings.kt from 0f9f82e9: remove only v31+ features"""
import re

# 1. Clean AppPrefs.kt
filepath = r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl\app\src\main\java\blbl\cat3399\core\prefs\AppPrefs.kt"

with open(filepath, 'r', encoding='utf-8') as f:
    lines = f.readlines()

new_lines = []
removed = 0
skip = False

for line in lines:
    # Check if this line starts a v31+ property
    if re.match(r'\s+var v(?:3[1-9]|[4-9]\d|1[0-4]\d)\w+:', line):
        skip = True
        removed += 1
        continue
    
    # Check if this is a comment for v31+
    if re.match(r'\s+// v(?:3[1-9]|[4-9]\d|1[0-4]\d)[.:]', line):
        removed += 1
        continue
    
    # Check if this is a section header for v31+
    if re.match(r'\s+// ===== v(?:3[1-9]|[4-9]\d|1[0-4]\d)\.x', line):
        removed += 1
        continue
    
    # Check if this is a v31+ KEY constant
    if re.match(r'\s+private const val KEY_V(?:3[1-9]|[4-9]\d|1[0-4]\d)_', line):
        removed += 1
        continue
    
    # If we were in skip mode, check if we've exited
    if skip:
        if re.match(r'\s+get\(\)', line) or re.match(r'\s+set\(value\)', line):
            removed += 1
            continue
        if re.match(r'\s+\.coerceIn', line) or re.match(r'\s+\.coerceAtLeast', line):
            removed += 1
            continue
        skip = False
    
    new_lines.append(line)

content = ''.join(new_lines)
content = re.sub(r'\n{4,}', '\n\n\n', content)

with open(filepath, 'w', encoding='utf-8') as f:
    f.write(content)

print(f"AppPrefs.kt: Removed {removed} v31+ lines")

# 2. Clean PlayerSettings.kt
ps_path = r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl\app\src\main\java\blbl\cat3399\feature\player\PlayerSettings.kt"

with open(ps_path, 'r', encoding='utf-8') as f:
    content = f.read()

# Remove v31+ function blocks
func_pattern = re.compile(
    r'(?:// \d+\.\d+: [^\n]*\n)?'
    r'internal fun PlayerActivity\.show(v(?:3[1-9]|[4-9]\d|1[0-4]\d)\w+)(?:Toggle|Dialog)\(\)',
    re.DOTALL
)

matches = list(func_pattern.finditer(content))
print(f"PlayerSettings.kt: Found {len(matches)} v31+ functions to remove")

for m in reversed(matches):
    start = m.start()
    if start > 0 and content[start-1] == '\n':
        comment_start = content.rfind('\n//', 0, start)
        if comment_start > 0 and start - comment_start < 100:
            start = comment_start + 1
    
    brace_count = 0
    pos = content.find('{', m.start())
    if pos < 0:
        continue
    brace_count = 1
    pos += 1
    while pos < len(content) and brace_count > 0:
        if content[pos] == '{':
            brace_count += 1
        elif content[pos] == '}':
            brace_count -= 1
        pos += 1
    
    end = pos
    while end < len(content) and content[end] == '\n':
        end += 1
    
    content = content[:start] + content[end:]

content = re.sub(r'\n{4,}', '\n\n\n', content)

with open(ps_path, 'w', encoding='utf-8') as f:
    f.write(content)

# Verify
with open(filepath, 'r', encoding='utf-8') as f:
    app_content = f.read()

props = re.findall(r'var (v\d+)\w+:', app_content)
versions = sorted(set(int(p[1:]) for p in props))
print(f"\nAppPrefs.kt versions: {versions}")

# Check critical properties
checks = ['fullscreenEnabled', 'v26ContrastCurveMode', 'v27ToneCurveMode', 
           'v29DanmakuPositionOffset', 'v30DanmakuFontGlow']
for c in checks:
    print(f"  {'OK' if c in app_content else 'MISSING'}: {c}")

with open(ps_path, 'r', encoding='utf-8') as f:
    ps_content = f.read()

ps_funcs = re.findall(r'showv(\d+)\w+(?:Toggle|Dialog)\(\)', ps_content)
ps_versions = sorted(set(int(v) for v in ps_funcs))
print(f"\nPlayerSettings.kt versions: {ps_versions}")
print(f"Functions: {len(ps_funcs)}")
