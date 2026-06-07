import re

filepath = r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl\app\src\main\java\blbl\cat3399\core\prefs\AppPrefs.kt"

with open(filepath, 'r', encoding='utf-8') as f:
    lines = f.readlines()

new_lines = []
skip = False
for line in lines:
    if re.match(r'\s+var v15\w+:', line):
        skip = True
        continue
    if re.match(r'\s+// v15[.:]', line) or re.match(r'\s+// ===== v15', line):
        continue
    if re.match(r'\s+private const val KEY_V15\w+', line):
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

# Verify
with open(filepath, 'r', encoding='utf-8') as f:
    curr = f.read()

curr_props = set()
for line in curr.split('\n'):
    m = re.match(r'\s+var (\w+):', line)
    if m:
        curr_props.add(m.group(1))

versions = set()
for p in curr_props:
    m = re.match(r'v(\d+)', p)
    if m:
        versions.add(int(m.group(1)))
    else:
        versions.add(0)

print(f"Total props: {len(curr_props)}")
print(f"Versions: {sorted(versions)}")

# Check critical
checks = ['fullscreenEnabled', 'v22DanmakuSize', 'v26ContrastCurveMode', 'v27ToneCurveMode', 'v29DanmakuPositionOffset', 'v30DanmakuFontGlow']
for c in checks:
    print(f"  {'OK' if c in curr else 'MISSING'}: {c}")
