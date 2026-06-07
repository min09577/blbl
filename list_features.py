import re

with open('app/src/main/java/blbl/cat3399/core/prefs/AppPrefs.kt', 'r', encoding='utf-8') as f:
    c = f.read()

# Extract all existing feature names (without version prefix)
props = re.findall(r'var v\d+(\w+):', c)
print(f'Total existing features: {len(props)}')
print(f'All feature names (sorted):')
for p in sorted(props):
    print(f'  {p}')
