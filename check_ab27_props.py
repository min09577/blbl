import subprocess

os_chdir = r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl"

result = subprocess.run(
    ['git', 'show', 'ab2702de:app/src/main/java/blbl/cat3399/core/prefs/AppPrefs.kt'],
    cwd=os_chdir,
    capture_output=True,
    encoding='utf-8',
    errors='ignore',
    timeout=15
)

# Check for v26-v30 properties
for prop in ['v26ContrastCurveMode', 'v26BrightnessCurveMode', 'v26SaturationCurveMode', 
             'v27ToneCurveMode', 'v27DoubleTapFunction', 'v27DanmakuFontSpacing',
             'v29DanmakuPositionOffset', 'v29ProgressBarStyle']:
    if prop in result.stdout:
        # Find the line
        for line in result.stdout.split('\n'):
            if f'var {prop}' in line:
                print(f"  FOUND: {prop} - {line.strip()}")
                break
    else:
        print(f"  MISSING: {prop}")

# Count v26, v27, v28, v29, v30 properties
import re
v26_count = len(re.findall(r'var v26\w+:', result.stdout))
v27_count = len(re.findall(r'var v27\w+:', result.stdout))
v28_count = len(re.findall(r'var v28\w+:', result.stdout))
v29_count = len(re.findall(r'var v29\w+:', result.stdout))
v30_count = len(re.findall(r'var v30\w+:', result.stdout))
print(f"\nv26: {v26_count}, v27: {v27_count}, v28: {v28_count}, v29: {v29_count}, v30: {v30_count}")
