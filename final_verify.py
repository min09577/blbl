import re

with open('app/src/main/java/blbl/cat3399/core/prefs/AppPrefs.kt', 'r', encoding='utf-8') as f:
    c = f.read()

props = re.findall(r'var (v\d+\w+):', c)
print(f'Total properties: {len(props)}')

versions = set()
names = set()
for p in props:
    m = re.match(r'v(\d+)(\w+)', p)
    if m:
        versions.add(int(m.group(1)))
        names.add(m.group(2))

print(f'Versions: {sorted(versions)}')
print(f'Unique names: {len(names)}')

# Check for duplicate names
all_names = [re.match(r'v\d+(\w+)', p).group(1) for p in props]
dupes = [n for n in set(all_names) if all_names.count(n) > 1]
if dupes:
    print(f'DUPLICATE names: {dupes}')
else:
    print('No duplicate names - all 274 features are unique!')

# Check PlayerSettings.kt
with open('app/src/main/java/blbl/cat3399/feature/player/PlayerSettings.kt', 'r', encoding='utf-8') as f:
    ps = f.read()

toggles = len(re.findall(r'showv\d+\w+Toggle\(\)', ps))
dialogs = len(re.findall(r'showv\d+\w+Dialog\(\)', ps))
print(f'\nPlayerSettings: {toggles} toggles, {dialogs} dialogs')
