import re

with open('app/src/main/java/blbl/cat3399/core/prefs/AppPrefs.kt', 'r', encoding='utf-8') as f:
    lines = f.readlines()

# Find last v30 property setter
last_v30 = 0
for i, line in enumerate(lines):
    if 'var v30' in line:
        for j in range(i, min(i+5, len(lines))):
            if '.apply()' in lines[j]:
                last_v30 = j
                break

# Find companion object
comp_idx = 0
for i, line in enumerate(lines):
    if 'companion object' in line:
        comp_idx = i
        break

# Find last KEY constant
last_key = 0
for i, line in enumerate(lines):
    if 'private const val KEY_V' in line or 'const val KEY_' in line:
        last_key = i

print(f"Last v30 property setter at line {last_v30+1}")
print(f"Companion object at line {comp_idx+1}")
print(f"Last KEY at line {last_key+1}")
print(f"Total lines: {len(lines)}")
