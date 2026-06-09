"""
Simple, reliable split of PlayerSettings.kt into multiple files.
Uses simple brace-depth tracking to find function boundaries.
"""
import os, re, glob

os.chdir(r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl")

PS_PATH = 'app/src/main/java/blbl/cat3399/feature/player/PlayerSettings.kt'

with open(PS_PATH, 'r', encoding='utf-8') as f:
    lines = f.readlines()

# Step 1: Extract package and imports (first non-empty lines before first function)
header_lines = []
first_func_idx = len(lines)

for i, line in enumerate(lines):
    stripped = line.strip()
    if stripped.startswith('package ') or stripped.startswith('import '):
        header_lines.append(line)
    elif stripped == '' and not header_lines:
        continue  # skip leading blank lines
    elif stripped == '':
        header_lines.append(line)  # keep blank lines in header
    elif stripped.startswith('//') and not any('fun ' in l for l in lines[max(0,i-2):i+3]):
        header_lines.append(line)  # comments before functions
    else:
        # This is likely the start of a function or other code
        # Check if it's a function start
        if 'fun ' in stripped and ('{' in stripped or (i+1 < len(lines) and '{' in lines[i+1].strip())):
            first_func_idx = i
            break
        elif stripped.startswith('private var ') or stripped.startswith('internal var ') or stripped.startswith('private val ') or stripped.startswith('internal val '):
            header_lines.append(line)  # keep variable declarations in header
        else:
            header_lines.append(line)

header = ''.join(header_lines)
print(f"Header: {len(header_lines)} lines")

# Step 2: Parse functions using brace depth tracking
functions = []  # List of (func_text, is_versioned)
current_func_lines = []
brace_depth = 0
in_function = False
i = first_func_idx

while i < len(lines):
    line = lines[i]
    stripped = line.strip()
    
    # Detect function start
    if not in_function:
        if (stripped.startswith('internal fun ') or 
            stripped.startswith('private inline fun ') or
            stripped.startswith('private var ') or
            stripped.startswith('internal var ') or
            stripped.startswith('private val ') or
            stripped.startswith('internal val ')):
            in_function = True
            current_func_lines = [line]
            # Count braces in this line
            brace_depth += line.count('{') - line.count('}')
        else:
            i += 1
            continue
    else:
        current_func_lines.append(line)
        brace_depth += line.count('{') - line.count('}')
    
    # Check if function ended (brace depth back to 0)
    if in_function and brace_depth <= 0:
        func_text = ''.join(current_func_lines)
        func_name_match = re.search(r'fun\s+(\w+)', func_text)
        func_name = func_name_match.group(1) if func_name_match else 'unknown'
        
        # Determine if it's a versioned function
        is_versioned = bool(re.match(r'showV\d+', func_name))
        
        functions.append((func_text, is_versioned, func_name))
        in_function = False
        brace_depth = 0
        current_func_lines = []
    
    i += 1

print(f"Total functions: {len(functions)}")

# Separate helper and versioned functions
helper_funcs = [(t, n) for t, v, n in functions if not v]
versioned_funcs = [(t, n) for t, v, n in functions if v]

print(f"Helper functions: {len(helper_funcs)}")
print(f"Versioned functions: {len(versioned_funcs)}")

# Step 3: Write main PlayerSettings.kt with helpers
main_content = header + '\n' + ''.join([t for t, n in helper_funcs])
with open(PS_PATH, 'w', encoding='utf-8') as f:
    f.write(main_content)
print(f"\nMain PlayerSettings.kt: {len(helper_funcs)} helper functions")

# Step 4: Split versioned functions into Part files (200 per file)
PART_SIZE = 200
base_dir = os.path.dirname(PS_PATH)

# Delete old Part files
for old_file in glob.glob(os.path.join(base_dir, 'PlayerSettingsPart*.kt')):
    os.remove(old_file)
    print(f"Deleted old {os.path.basename(old_file)}")

num_parts = (len(versioned_funcs) + PART_SIZE - 1) // PART_SIZE
print(f"\nSplitting into {num_parts} Part files")

for part_idx in range(num_parts):
    start = part_idx * PART_SIZE
    end = min(start + PART_SIZE, len(versioned_funcs))
    part_funcs = versioned_funcs[start:end]
    
    part_content = header + '\n' + ''.join([t for t, n in part_funcs])
    part_path = os.path.join(base_dir, f'PlayerSettingsPart{part_idx + 1}.kt')
    
    with open(part_path, 'w', encoding='utf-8') as f:
        f.write(part_content)
    
    print(f"  Written PlayerSettingsPart{part_idx + 1}.kt with {len(part_funcs)} functions")

# Step 5: Change private inline fun to internal inline fun in main file
with open(PS_PATH, 'r', encoding='utf-8') as f:
    content = f.read()
content = content.replace('private inline fun PlayerActivity.', 'internal inline fun PlayerActivity.')
with open(PS_PATH, 'w', encoding='utf-8') as f:
    f.write(content)

print(f"\nDone! Files created:")
print(f"  PlayerSettings.kt ({len(helper_funcs)} helpers)")
for i in range(num_parts):
    print(f"  PlayerSettingsPart{i+1}.kt")
