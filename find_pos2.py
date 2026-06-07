import re

filepath = r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl\app\src\main\java\blbl\cat3399\core\prefs\AppPrefs.kt"
with open(filepath, 'r', encoding='utf-8') as f:
    lines = f.readlines()

last_v30 = 0
last_key = 0
for i, line in enumerate(lines):
    if 'var v30' in line:
        for j in range(i, min(i+5, len(lines))):
            if '.apply()' in lines[j]:
                last_v30 = j
                break
    if 'private const val KEY_' in line:
        last_key = i

print(f'Last v30 setter: {last_v30}')
print(f'Last KEY: {last_key}')
print(f'Total: {len(lines)}')
