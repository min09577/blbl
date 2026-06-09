"""Split AppPrefs.kt - make prefs internal, extract properties as extensions."""
import re, os
os.chdir(r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl")

AP_PATH = 'app/src/main/java/blbl/cat3399/core/prefs/AppPrefs.kt'

with open(AP_PATH, 'r', encoding='utf-8') as f:
    content = f.read()
    lines = content.split('\n')

# Step 1: Change private val prefs to internal val prefs
new_content = content.replace('private val prefs = ', 'internal val prefs = ')
with open(AP_PATH, 'w', encoding='utf-8') as f:
    f.write(new_content)
print("Changed prefs to internal")

# Step 2: Find and extract versioned properties (v31+)
# Find companion object
companion_line = None
for i, line in enumerate(lines):
    if 'companion object' in line and '{' in line:
        companion_line = i
        break

print(f"companion object at line {companion_line + 1}")

# Find where versioned properties start (first var v31...)
first_v_prop = None
for i, line in enumerate(lines):
    if re.match(r'\s+var v\d+\w+:', line):
        first_v_prop = i
        break

print(f"First versioned property at line {first_v_prop + 1}")

# Find the KEY constants section (const val KEY_V...)
first_key_line = None
last_key_line = None
for i, line in enumerate(lines):
    if 'const val KEY_V' in line:
        if first_key_line is None:
            first_key_line = i
        last_key_line = i

print(f"KEY constants: lines {first_key_line + 1} to {last_key_line + 1}")

# The properties are between first_v_prop and companion_line
# The KEY constants are between first_key_line and last_key_line (inside companion object)

# Extract versioned property blocks
prop_blocks = []
current_block = []
in_block = False

for i in range(first_v_prop, companion_line):
    line = lines[i]
    stripped = line.strip()
    if re.match(r'var v\d+\w+:', stripped):
        if current_block:
            prop_blocks.append('\n'.join(current_block))
        current_block = [line]
        in_block = True
    elif in_block:
        current_block.append(line)

if current_block:
    prop_blocks.append('\n'.join(current_block))

print(f"Extracted {len(prop_blocks)} versioned property blocks")

# Extract KEY constant lines
key_lines = []
for i in range(first_key_line, last_key_line + 1):
    key_lines.append(lines[i])

print(f"Extracted {len(key_lines)} KEY constant lines")

# Step 3: Rewrite AppPrefs.kt without versioned properties and KEY constants
# Keep: class header, original properties, companion object (without KEY lines)
new_lines = lines[:first_v_prop]  # Everything before versioned props

# Add companion object (skip KEY lines)
# Find closing brace of companion object
brace_count = 0
companion_end = None
for i in range(companion_line, len(lines)):
    for ch in lines[i]:
        if ch == '{': brace_count += 1
        elif ch == '}':
            brace_count -= 1
            if brace_count == 0:
                companion_end = i
                break
    if companion_end is not None: break

# Add companion object without KEY lines
new_lines.append(lines[companion_line])  # companion object {
for i in range(companion_line + 1, companion_end):
    if 'const val KEY_V' not in lines[i]:
        new_lines.append(lines[i])
new_lines.append(lines[companion_end])  # }

# Add remaining lines after companion object
for i in range(companion_end + 1, len(lines)):
    new_lines.append(lines[i])

with open(AP_PATH, 'w', encoding='utf-8') as f:
    f.write('\n'.join(new_lines))
print(f"Rewritten AppPrefs.kt ({len(new_lines)} lines)")

# Step 4: Write extension property files
HEADER = """package blbl.cat3399.core.prefs

// Auto-generated extension properties for AppPrefs

"""

CHUNK = 500  # properties per file
base_dir = os.path.dirname(AP_PATH)

for chunk_idx in range(0, len(prop_blocks), CHUNK):
    chunk = prop_blocks[chunk_idx:chunk_idx + CHUNK]
    file_num = chunk_idx // CHUNK + 1
    filename = f"AppPrefsProperties{file_num}.kt"
    filepath = os.path.join(base_dir, filename)
    
    with open(filepath, 'w', encoding='utf-8') as f:
        f.write(HEADER)
        for prop in chunk:
            # Change from class property to extension property
            # "    var v701acknowledge701: Boolean" -> "var AppPrefs.v701acknowledge701: Boolean"
            prop = re.sub(r'^    var (v\d+\w+):', r'var AppPrefs.\1:', prop, count=1)
            f.write(prop)
            f.write('\n\n')
    
    print(f"  Written {filename} with {len(chunk)} properties")

# Step 5: Write KEY constants file
KEY_HEADER = """package blbl.cat3399.core.prefs

// Auto-generated KEY constants for AppPrefs

"""

key_filename = "AppPrefsKeys.kt"
key_filepath = os.path.join(base_dir, key_filename)

with open(key_filepath, 'w', encoding='utf-8') as f:
    f.write(KEY_HEADER)
    # Convert companion object const vals to top-level const vals
    for key_line in key_lines:
        # Remove leading spaces (from companion object indentation)
        f.write(key_line.strip() + '\n')

print(f"  Written {key_filename} with {len(key_lines)} KEY constants")

print("\nDone! AppPrefs split complete.")
