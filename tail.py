with open('app/src/main/java/blbl/cat3399/core/prefs/AppPrefs.kt', 'r', encoding='utf-8') as f:
    lines = f.readlines()
print(f'Total lines: {len(lines)}')
for i in range(max(0, len(lines)-20), len(lines)):
    print(f'{i+1}: {lines[i].rstrip()}')
