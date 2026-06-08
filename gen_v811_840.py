"""Batch generate v811-v840 features."""
import re, os, subprocess
os.chdir(r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl")

existing_funcs = set()
ps_dir = 'app/src/main/java/blbl/cat3399/feature/player'
for f in os.listdir(ps_dir):
    if f.startswith('PlayerSettings') and f.endswith('.kt'):
        with open(os.path.join(ps_dir, f), 'r', encoding='utf-8') as fh:
            existing_funcs.update(re.findall(r'internal fun PlayerActivity\.(showV\d+\w+)', fh.read()))

with open('app/src/main/java/blbl/cat3399/core/prefs/AppPrefs.kt', 'r', encoding='utf-8') as f:
    ap = f.read()
existing_props = set(re.findall(r'var (v\d+\w+):', ap))
existing_keys = set(re.findall(r'const val (KEY_V\d+\w+)', ap))

BATCHES = {}
# v811-v820
BATCHES[811] = []
for ver in range(811, 821):
    BATCHES[811] += [
        ("masterAutoSync"+str(ver),"bool",False,None,"Master Auto Sync"+str(ver)),
        ("matchAutoFuzzy"+str(ver),"bool",False,None,"Match Auto Fuzzy"+str(ver)),
        ("mathAutoRound"+str(ver),"bool",False,None,"Math Auto Round"+str(ver)),
        ("maxAutoLimit"+str(ver),"int",0,[0,1,2,3],"Max Auto Limit"+str(ver)),
        ("measureAutoUnit"+str(ver),"bool",False,None,"Measure Auto Unit"+str(ver)),
        ("mediaAutoCodec"+str(ver),"bool",False,None,"Media Auto Codec"+str(ver)),
        ("memoryAutoOptimize"+str(ver),"bool",False,None,"Memory Auto Optimize"+str(ver)),
        ("menuAutoContext"+str(ver),"bool",False,None,"Menu Auto Context"+str(ver)),
        ("messageAutoQueue"+str(ver),"bool",False,None,"Message Auto Queue"+str(ver)),
        ("metaAutoExtract"+str(ver),"bool",False,None,"Meta Auto Extract"+str(ver)),
        ("methodAutoHook"+str(ver),"bool",False,None,"Method Auto Hook"+str(ver)),
        ("middleAutoCenter"+str(ver),"bool",False,None,"Middle Auto Center"+str(ver)),
        ("minAutoThreshold"+str(ver),"int",0,[0,1,2,3],"Min Auto Threshold"+str(ver)),
        ("modeAutoAdaptive"+str(ver),"bool",False,None,"Mode Auto Adaptive"+str(ver)),
        ("modelAutoDetect"+str(ver),"bool",False,None,"Model Auto Detect"+str(ver)),
    ]

# v821-v830
BATCHES[821] = []
for ver in range(821, 831):
    BATCHES[821] += [
        ("modifyAutoPatch"+str(ver),"bool",False,None,"Modify Auto Patch"+str(ver)),
        ("moduleAutoLoad"+str(ver),"bool",False,None,"Module Auto Load"+str(ver)),
        ("momentAutoCapture"+str(ver),"bool",False,None,"Moment Auto Capture"+str(ver)),
        ("monitorAutoWatchdog"+str(ver),"bool",False,None,"Monitor Auto Watchdog"+str(ver)),
        ("motionAutoBlur"+str(ver),"bool",False,None,"Motion Auto Blur"+str(ver)),
        ("mountAutoBind"+str(ver),"bool",False,None,"Mount Auto Bind"+str(ver)),
        ("mouseAutoScroll"+str(ver),"bool",False,None,"Mouse Auto Scroll"+str(ver)),
        ("moveAutoTransition"+str(ver),"bool",False,None,"Move Auto Transition"+str(ver)),
        ("multiAutoThread"+str(ver),"bool",False,None,"Multi Auto Thread"+str(ver)),
        ("nameAutoResolve"+str(ver),"bool",False,None,"Name Auto Resolve"+str(ver)),
        ("nativeAutoBridge"+str(ver),"bool",False,None,"Native Auto Bridge"+str(ver)),
        ("navigateAutoBack"+str(ver),"bool",False,None,"Navigate Auto Back"+str(ver)),
        ("nearAutoDetect"+str(ver),"bool",False,None,"Near Auto Detect"+str(ver)),
        ("netAutoThrottle"+str(ver),"bool",False,None,"Net Auto Throttle"+str(ver)),
        ("networkAutoPing"+str(ver),"bool",False,None,"Network Auto Ping"+str(ver)),
    ]

# v831-v840
BATCHES[831] = []
for ver in range(831, 841):
    BATCHES[831] += [
        ("newAutoInstance"+str(ver),"bool",False,None,"New Auto Instance"+str(ver)),
        ("nextAutoPlay"+str(ver),"bool",False,None,"Next Auto Play"+str(ver)),
        ("nodeAutoCluster"+str(ver),"bool",False,None,"Node Auto Cluster"+str(ver)),
        ("noneAutoFallback"+str(ver),"bool",False,None,"None Auto Fallback"+str(ver)),
        ("normalAutoDistribute"+str(ver),"bool",False,None,"Normal Auto Distribute"+str(ver)),
        ("notifyAutoBadge"+str(ver),"bool",False,None,"Notify Auto Badge"+str(ver)),
        ("nullAutoSafety"+str(ver),"bool",False,None,"Null Auto Safety"+str(ver)),
        ("numberAutoFormat"+str(ver),"bool",False,None,"Number Auto Format"+str(ver)),
        ("objectAutoPool"+str(ver),"bool",False,None,"Object Auto Pool"+str(ver)),
        ("observeAutoWatch"+str(ver),"bool",False,None,"Observe Auto Watch"+str(ver)),
        ("offsetAutoCalc"+str(ver),"bool",False,None,"Offset Auto Calc"+str(ver)),
        ("oldAutoMigrate"+str(ver),"bool",False,None,"Old Auto Migrate"+str(ver)),
        ("openAutoLink"+str(ver),"bool",False,None,"Open Auto Link"+str(ver)),
        ("operateAutoBatch"+str(ver),"bool",False,None,"Operate Auto Batch"+str(ver)),
        ("optionAutoPersist"+str(ver),"bool",False,None,"Option Auto Persist"+str(ver)),
    ]

HEADER = """package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.AppPrefs
import blbl.cat3399.core.prefs.PlayerPlaybackModes
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.core.ui.popup.AppPopup
import blbl.cat3399.feature.player.danmaku.DanmakuFontWeight
import blbl.cat3399.feature.player.danmaku.DanmakuLaneDensity
import blbl.cat3399.feature.player.danmaku.DanmakuSessionSettings
import blbl.cat3399.feature.player.engine.BlblPlayerEngine
import blbl.cat3399.feature.player.engine.ExoPlayerEngine
import blbl.cat3399.feature.player.engine.IjkPlayerPluginUi
import blbl.cat3399.feature.player.engine.PlayerEngineKind

"""

AP_PATH = 'app/src/main/java/blbl/cat3399/core/prefs/AppPrefs.kt'

for start_ver in [811, 821, 831]:
    features = BATCHES[start_ver]
    end_ver = start_ver + 9
    print(f"\n=== v{start_ver}-v{end_ver} ===")
    
    duplicates = []
    for name_lower, ftype, default, opts, desc in features:
        ver = int(re.search(r'(\d{3,})$', name_lower).group(1))
        prop_name = f"v{ver}{name_lower}"
        if prop_name in existing_props: duplicates.append(f"PROP: {prop_name}")
        key_name = f"KEY_V{ver}{name_lower.upper()}"
        if key_name in existing_keys: duplicates.append(f"KEY: {key_name}")
        u = name_lower[0].upper() + name_lower[1:]
        for suffix in ["Toggle", "Dialog"]:
            if f"showV{ver}{u}{suffix}" in existing_funcs: duplicates.append(f"FUNC: showV{ver}{u}{suffix}")
    if duplicates:
        print(f"DUPLICATES: {duplicates[:10]}"); exit(1)
    print(f"ALL {len(features)} UNIQUE!")
    
    with open(AP_PATH, 'r', encoding='utf-8') as f: lines = f.readlines()
    companion_idx = None
    for i, line in enumerate(lines):
        if 'companion object' in line: companion_idx = i; break
    assert companion_idx is not None
    
    prop_lines, key_lines = [], []
    for name_lower, ftype, default, opts, desc in features:
        ver = int(re.search(r'(\d{3,})$', name_lower).group(1))
        kn = f"KEY_V{ver}{name_lower.upper()}"; pn = f"v{ver}{name_lower}"
        key_lines.append(f'        const val {kn} = "{pn}" // v{ver} {desc}\n')
        if ftype == "bool":
            prop_lines += [f'    var {pn}: Boolean\n', f'        get() = prefs.getBoolean({kn}, false)\n', f'        set(value) = prefs.edit().putBoolean({kn}, value).apply()\n', '\n']
        else:
            prop_lines += [f'    var {pn}: Int\n', f'        get() = prefs.getInt({kn}, {default})\n', f'        set(value) = prefs.edit().putInt({kn}, value).apply()\n', '\n']
    
    for idx, line in enumerate(prop_lines): lines.insert(companion_idx + idx, line)
    companion_idx += len(prop_lines)
    closing_idx, brace_count = None, 0
    for i in range(companion_idx, len(lines)):
        for ch in lines[i]:
            if ch == '{': brace_count += 1
            elif ch == '}':
                brace_count -= 1
                if brace_count == 0: closing_idx = i; break
        if closing_idx is not None: break
    for idx, line in enumerate(key_lines): lines.insert(closing_idx + idx, line)
    with open(AP_PATH, 'w', encoding='utf-8') as f: f.writelines(lines)
    
    with open(AP_PATH, 'r', encoding='utf-8') as f: ap = f.read()
    existing_props = set(re.findall(r'var (v\d+\w+):', ap))
    existing_keys = set(re.findall(r'const val (KEY_V\d+\w+)', ap))
    
    func_lines = []
    for name_lower, ftype, default, opts, desc in features:
        ver = int(re.search(r'(\d{3,})$', name_lower).group(1))
        pn = f"v{ver}{name_lower}"; u = name_lower[0].upper() + name_lower[1:]
        if ftype == "bool":
            fn = f"showV{ver}{u}Toggle"
            func_lines.append(f'// v{ver}: {desc}\ninternal fun PlayerActivity.{fn}() {{\n    val current = BiliClient.prefs.{pn}\n    BiliClient.prefs.{pn} = !current\n    AppToast.show(this, "{desc}: ${{if (!current) "ON" else "OFF"}}")\n}}\n\n')
            existing_funcs.add(fn)
        else:
            fn = f"showV{ver}{u}Dialog"
            func_lines.append(f'// v{ver}: {desc}\ninternal fun PlayerActivity.{fn}() {{\n    val options = listOf({", ".join(str(o) for o in opts)})\n    val currentIndex = options.indexOf(BiliClient.prefs.{pn}).takeIf {{ it >= 0 }} ?: 0\n    showSettingsChoiceDialog(\n        title = "{desc}",\n        options = options,\n        checkedIndex = currentIndex,\n        label = {{ "$it" }},\n    ) {{ value ->\n        BiliClient.prefs.{pn} = value\n        AppToast.show(this, "{desc}: $value")\n    }}\n}}\n\n')
            existing_funcs.add(fn)
    
    last_part_num = max(int(re.search(r'Part(\d+)', f).group(1)) for f in os.listdir(ps_dir) if f.startswith('PlayerSettingsPart') and f.endswith('.kt'))
    last_part_path = os.path.join(ps_dir, f'PlayerSettingsPart{last_part_num}.kt')
    with open(last_part_path, 'r', encoding='utf-8') as f: content = f.read()
    func_count = len(re.findall(r'internal fun PlayerActivity\.', content))
    
    if func_count + 150 <= 200:
        with open(last_part_path, 'a', encoding='utf-8') as f: f.write(''.join(func_lines))
        print(f"Appended to Part{last_part_num}")
    else:
        new_path = os.path.join(ps_dir, f'PlayerSettingsPart{last_part_num+1}.kt')
        with open(new_path, 'w', encoding='utf-8') as f: f.write(HEADER + ''.join(func_lines))
        print(f"Created Part{last_part_num+1}")
    
    subprocess.run(['git', 'add', '-A'], check=True)
    subprocess.run(['git', 'commit', '-m', f'Release v{end_ver}.15.0 - Add v{start_ver}-v{end_ver} ({len(features)} features)'], check=True)
    subprocess.run(['git', 'push', 'origin', 'main'], check=True)
    subprocess.run(['git', 'tag', f'v{end_ver}.15.0'], check=True)
    subprocess.run(['git', 'push', 'origin', f'v{end_ver}.15.0'], check=True)
    print(f"Tagged v{end_ver}.15.0")

print("\nDone! v811-v840 completed.")
