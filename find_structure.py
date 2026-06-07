import re

with open('app/src/main/java/blbl/cat3399/core/prefs/AppPrefs.kt', 'r', encoding='utf-8') as f:
    lines = f.readlines()

# Find companion object start
comp_start = None
for i, l in enumerate(lines):
    if 'companion object' in l:
        comp_start = i
        break

print(f'Companion object starts at line {comp_start+1}')

# Find last KEY_V30 line
last_key_line = None
for i, l in enumerate(lines):
    if 'KEY_V30_' in l:
        last_key_line = i

print(f'Last KEY_V30 at line {last_key_line+1}: {lines[last_key_line].rstrip()}')

# Find last v30 property
last_prop_line = None
for i, l in enumerate(lines):
    if 'var v30' in l:
        last_prop_line = i

print(f'Last v30 property at line {last_prop_line+1}: {lines[last_prop_line].rstrip()}')

# Find end of last v30 property block (setter line)
last_setter_line = None
for i in range(last_prop_line, min(last_prop_line+10, len(lines))):
    if 'prefs.edit()' in lines[i] and 'v30' in lines[i].lower():
        last_setter_line = i

if last_setter_line is None:
    for i in range(last_prop_line, min(last_prop_line+10, len(lines))):
        if '.apply()' in lines[i]:
            last_setter_line = i

print(f'Last setter at line {last_setter_line+1}: {lines[last_setter_line].rstrip()}')

# Find KEY_V30 end
last_key_v30 = None
for i in range(comp_start, len(lines)):
    if 'KEY_V30_' in lines[i]:
        last_key_v30 = i

print(f'Last KEY_V30 in companion at line {last_key_v30+1}: {lines[last_key_v30].rstrip()}')
