import re

# Clean v150 from AppPrefs.kt
filepath = r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl\app\src\main\java\blbl\cat3399\core\prefs\AppPrefs.kt"

with open(filepath, 'r', encoding='utf-8') as f:
    lines = f.readlines()

new_lines = []
skip = False
for line in lines:
    if re.match(r'\s+var v150\w+:', line):
        skip = True
        continue
    if re.match(r'\s+// v150[.:]', line) or re.match(r'\s+// ===== v150', line):
        continue
    if re.match(r'\s+private const val KEY_V150_', line):
        continue
    if skip:
        if re.match(r'\s+get\(\)', line) or re.match(r'\s+set\(value\)', line):
            continue
        if re.match(r'\s+\.coerceIn', line) or re.match(r'\s+\.coerceAtLeast', line):
            continue
        skip = False
    new_lines.append(line)

with open(filepath, 'w', encoding='utf-8') as f:
    f.writelines(new_lines)

# Clean v150 from PlayerSettings.kt
ps_path = r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl\app\src\main\java\blbl\cat3399\feature\player\PlayerSettings.kt"

with open(ps_path, 'r', encoding='utf-8') as f:
    content = f.read()

func_pattern = re.compile(
    r'(?:// \d+\.\d+: [^\n]*\n)?'
    r'internal fun PlayerActivity\.show(v150\w+)(?:Toggle|Dialog)\(\)',
    re.DOTALL
)

matches = list(func_pattern.finditer(content))
for m in reversed(matches):
    start = m.start()
    if start > 0 and content[start-1] == '\n':
        comment_start = content.rfind('\n//', 0, start)
        if comment_start > 0 and start - comment_start < 100:
            start = comment_start + 1
    
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

with open(ps_path, 'w', encoding='utf-8') as f:
    f.write(content)

# Verify
import subprocess
result = subprocess.run(
    ['git', 'show', '0f9f82e9:app/src/main/java/blbl/cat3399/core/prefs/AppPrefs.kt'],
    cwd=r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl",
    capture_output=True,
    encoding='utf-8',
    errors='ignore',
    timeout=15
)
orig_props = set()
for line in result.stdout.split('\n'):
    m = re.match(r'\s+var (\w+):', line)
    if m:
        orig_props.add(m.group(1))

with open(filepath, 'r', encoding='utf-8') as f:
    curr = f.read()

curr_props = set()
for line in curr.split('\n'):
    m = re.match(r'\s+var (\w+):', line)
    if m:
        curr_props.add(m.group(1))

missing = orig_props - curr_props
# Filter out v31+ from missing
real_missing = [p for p in missing if not re.match(r'v(?:3[1-9]|[4-9]\d|1[0-4]\d)\w+', p)]

print(f"Original props: {len(orig_props)}")
print(f"Current props: {len(curr_props)}")
print(f"Missing (non-v31+): {len(real_missing)}")
if real_missing:
    for p in sorted(real_missing):
        print(f"  {p}")
