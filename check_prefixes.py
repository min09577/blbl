"""Find remaining unused prefixes."""
import re, os
os.chdir(r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl")

with open('app/src/main/java/blbl/cat3399/core/prefs/AppPrefs.kt', 'r', encoding='utf-8') as f:
    ap = f.read()

# Find all existing feature names (without version prefix)
props = re.findall(r'var v\d+(\w+):', ap)

# Get the base concept names
concepts = set()
for p in props:
    # Remove trailing digits (version numbers)
    base = re.sub(r'\d+$', '', p)
    concepts.add(base.lower())

print(f"Total concepts used: {len(concepts)}")
print(f"\nAll concepts sorted:")
for c in sorted(concepts):
    print(f"  {c}")
