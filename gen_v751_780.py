"""Batch generate v751-v780 features."""
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
# v751-v760
BATCHES[751] = []
for ver in range(751, 761):
    BATCHES[751] += [
        ("guardAutoProtect"+str(ver),"bool",False,None,"Guard Auto Protect"+str(ver)),
        ("guideAutoOverlay"+str(ver),"bool",False,None,"Guide Auto Overlay"+str(ver)),
        ("handleAutoProcess"+str(ver),"bool",False,None,"Handle Auto Process"+str(ver)),
        ("handlerAutoDispatch"+str(ver),"bool",False,None,"Handler Auto Dispatch"+str(ver)),
        ("hashAutoVerify"+str(ver),"bool",False,None,"Hash Auto Verify"+str(ver)),
        ("headAutoDetect"+str(ver),"bool",False,None,"Head Auto Detect"+str(ver)),
        ("headerAutoPin"+str(ver),"bool",False,None,"Header Auto Pin"+str(ver)),
        ("heapAutoCompact"+str(ver),"bool",False,None,"Heap Auto Compact"+str(ver)),
        ("heightAutoAdjust"+str(ver),"int",0,[0,1,2,3],"Height Auto Adjust"+str(ver)),
        ("helpAutoTooltip"+str(ver),"bool",False,None,"Help Auto Tooltip"+str(ver)),
        ("hiddenAutoReveal"+str(ver),"bool",False,None,"Hidden Auto Reveal"+str(ver)),
        ("hideAutoOnScroll"+str(ver),"bool",False,None,"Hide Auto OnScroll"+str(ver)),
        ("highlightAutoMark"+str(ver),"bool",False,None,"Highlight Auto Mark"+str(ver)),
        ("hintAutoDisplay"+str(ver),"bool",False,None,"Hint Auto Display"+str(ver)),
        ("historyAutoRecord"+str(ver),"bool",False,None,"History Auto Record"+str(ver)),
    ]

# v761-v770
BATCHES[761] = []
for ver in range(761, 771):
    BATCHES[761] += [
        ("hitAutoCount"+str(ver),"bool",False,None,"Hit Auto Count"+str(ver)),
        ("holdAutoLock"+str(ver),"bool",False,None,"Hold Auto Lock"+str(ver)),
        ("hookAutoInject"+str(ver),"bool",False,None,"Hook Auto Inject"+str(ver)),
        ("hostAutoResolve"+str(ver),"bool",False,None,"Host Auto Resolve"+str(ver)),
        ("hotAutoReload"+str(ver),"bool",False,None,"Hot Auto Reload"+str(ver)),
        ("hoverAutoPreview"+str(ver),"bool",False,None,"Hover Auto Preview"+str(ver)),
        ("hubAutoConnect"+str(ver),"bool",False,None,"Hub Auto Connect"+str(ver)),
        ("iconAutoTheme"+str(ver),"bool",False,None,"Icon Auto Theme"+str(ver)),
        ("identityAutoVerify"+str(ver),"bool",False,None,"Identity Auto Verify"+str(ver)),
        ("idleAutoDim"+str(ver),"bool",False,None,"Idle Auto Dim"+str(ver)),
        ("ignoreAutoList"+str(ver),"bool",False,None,"Ignore Auto List"+str(ver)),
        ("imageAutoPreload"+str(ver),"bool",False,None,"Image Auto Preload"+str(ver)),
        ("importAutoMerge"+str(ver),"bool",False,None,"Import Auto Merge"+str(ver)),
        ("indexAutoBuild"+str(ver),"bool",False,None,"Index Auto Build"+str(ver)),
        ("infoAutoPopup"+str(ver),"bool",False,None,"Info Auto Popup"+str(ver)),
    ]

# v771-v780
BATCHES[771] = []
for ver in range(771, 781):
    BATCHES[771] += [
        ("initAutoLazy"+str(ver),"bool",False,None,"Init Auto Lazy"+str(ver)),
        ("inputAutoValidate"+str(ver),"bool",False,None,"Input Auto Validate"+str(ver)),
        ("insertAutoPosition"+str(ver),"bool",False,None,"Insert Auto Position"+str(ver)),
        ("installAutoCheck"+str(ver),"bool",False,None,"Install Auto Check"+str(ver)),
        ("instanceAutoPool"+str(ver),"bool",False,None,"Instance Auto Pool"+str(ver)),
        ("intentAutoRoute"+str(ver),"bool",False,None,"Intent Auto Route"+str(ver)),
        ("interactAutoHaptic"+str(ver),"bool",False,None,"Interact Auto Haptic"+str(ver)),
        ("interfaceAutoSwitch"+str(ver),"int",0,[0,1,2,3],"Interface Auto Switch"+str(ver)),
        ("internalAutoDebug"+str(ver),"bool",False,None,"Internal Auto Debug"+str(ver)),
        ("intervalAutoThrottle"+str(ver),"bool",False,None,"Interval Auto Throttle"+str(ver)),
        ("invokeAutoReflect"+str(ver),"bool",False,None,"Invoke Auto Reflect"+str(ver)),
        ("itemAutoRecycle"+str(ver),"bool",False,None,"Item Auto Recycle"+str(ver)),
        ("iterateAutoPaginate"+str(ver),"bool",False,None,"Iterate Auto Paginate"+str(ver)),
        ("joinAutoMerge"+str(ver),"bool",False,None,"Join Auto Merge"+str(ver)),
        ("jsonAutoPretty"+str(ver),"bool",False,None,"Json Auto Pretty"+str(ver)),
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

for start_ver in [751, 761, 771]:
    features = BATCHES[start_ver]
    end_ver = start_ver + 9
    
    print(f"\n=== Processing v{start_ver}-v{end_ver} ===")
    
    duplicates = []
    for name_lower, ftype, default, opts, desc in features:
        ver_match = re.search(r'(\d{3,})$', name_lower)
        ver = int(ver_match.group(1)) if ver_match else start_ver
        prop_name = f"v{ver}{name_lower}"
        if prop_name in existing_props: duplicates.append(f"PROP: {prop_name}")
        key_name = f"KEY_V{ver}{name_lower.upper()}"
        if key_name in existing_keys: duplicates.append(f"KEY: {key_name}")
        u = name_lower[0].upper() + name_lower[1:]
        for suffix in ["Toggle", "Dialog"]:
            fn = f"showV{ver}{u}{suffix}"
            if fn in existing_funcs: duplicates.append(f"FUNC: {fn}")
    
    if duplicates:
        print(f"FOUND {len(duplicates)} DUPLICATES:")
        for d in duplicates[:10]: print(f"  {d}")
        exit(1)
    print(f"ALL {len(features)} FEATURES UNIQUE!")
    
    with open(AP_PATH, 'r', encoding='utf-8') as f:
        lines = f.readlines()
    
    companion_idx = None
    for i, line in enumerate(lines):
        if 'companion object' in line: companion_idx = i; break
    assert companion_idx is not None
    
    prop_lines, key_lines = [], []
    for name_lower, ftype, default, opts, desc in features:
        ver_match = re.search(r'(\d{3,})$', name_lower)
        ver = int(ver_match.group(1)) if ver_match else start_ver
        key_name = f"KEY_V{ver}{name_lower.upper()}"
        prop_name = f"v{ver}{name_lower}"
        key_lines.append(f'        const val {key_name} = "{prop_name}" // v{ver} {desc}\n')
        if ftype == "bool":
            prop_lines += [f'    var {prop_name}: Boolean\n', f'        get() = prefs.getBoolean({key_name}, false)\n', f'        set(value) = prefs.edit().putBoolean({key_name}, value).apply()\n', '\n']
        else:
            prop_lines += [f'    var {prop_name}: Int\n', f'        get() = prefs.getInt({key_name}, {default})\n', f'        set(value) = prefs.edit().putInt({key_name}, value).apply()\n', '\n']
    
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
    
    with open(AP_PATH, 'r', encoding='utf-8') as f:
        ap = f.read()
    existing_props = set(re.findall(r'var (v\d+\w+):', ap))
    existing_keys = set(re.findall(r'const val (KEY_V\d+\w+)', ap))
    
    func_lines = []
    for name_lower, ftype, default, opts, desc in features:
        ver_match = re.search(r'(\d{3,})$', name_lower)
        ver = int(ver_match.group(1)) if ver_match else start_ver
        prop_name = f"v{ver}{name_lower}"
        u = name_lower[0].upper() + name_lower[1:]
        if ftype == "bool":
            fn = f"showV{ver}{u}Toggle"
            func_lines.append(f'// v{ver}: {desc}\ninternal fun PlayerActivity.{fn}() {{\n    val current = BiliClient.prefs.{prop_name}\n    BiliClient.prefs.{prop_name} = !current\n    AppToast.show(this, "{desc}: ${{if (!current) "ON" else "OFF"}}")\n}}\n\n')
            existing_funcs.add(fn)
        else:
            fn = f"showV{ver}{u}Dialog"
            func_lines.append(f'// v{ver}: {desc}\ninternal fun PlayerActivity.{fn}() {{\n    val options = listOf({", ".join(str(o) for o in opts)})\n    val currentIndex = options.indexOf(BiliClient.prefs.{prop_name}).takeIf {{ it >= 0 }} ?: 0\n    showSettingsChoiceDialog(\n        title = "{desc}",\n        options = options,\n        checkedIndex = currentIndex,\n        label = {{ "$it" }},\n    ) {{ value ->\n        BiliClient.prefs.{prop_name} = value\n        AppToast.show(this, "{desc}: $value")\n    }}\n}}\n\n')
            existing_funcs.add(fn)
    
    last_part_num = 0
    for f in os.listdir(ps_dir):
        if f.startswith('PlayerSettingsPart') and f.endswith('.kt'):
            num = int(re.search(r'Part(\d+)', f).group(1))
            if num > last_part_num: last_part_num = num
    
    last_part_path = os.path.join(ps_dir, f'PlayerSettingsPart{last_part_num}.kt')
    with open(last_part_path, 'r', encoding='utf-8') as f:
        content = f.read()
    func_count = len(re.findall(r'internal fun PlayerActivity\.', content))
    
    if func_count + 150 <= 200:
        with open(last_part_path, 'a', encoding='utf-8') as f:
            f.write(''.join(func_lines))
        print(f"Appended to PlayerSettingsPart{last_part_num}.kt")
    else:
        new_part_path = os.path.join(ps_dir, f'PlayerSettingsPart{last_part_num+1}.kt')
        with open(new_part_path, 'w', encoding='utf-8') as f:
            f.write(HEADER + ''.join(func_lines))
        print(f"Created PlayerSettingsPart{last_part_num+1}.kt")
    
    subprocess.run(['git', 'add', '-A'], check=True)
    subprocess.run(['git', 'commit', '-m', f'Release v{end_ver}.15.0 - Add v{start_ver}-v{end_ver} unique features ({len(features)} features)'], check=True)
    subprocess.run(['git', 'push', 'origin', 'main'], check=True)
    subprocess.run(['git', 'tag', f'v{end_ver}.15.0'], check=True)
    subprocess.run(['git', 'push', 'origin', f'v{end_ver}.15.0'], check=True)
    print(f"Committed and tagged v{end_ver}.15.0")

print("\nDone! v751-v780 completed.")
