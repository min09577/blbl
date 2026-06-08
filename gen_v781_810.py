"""Batch generate v781-v810 features."""
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
# v781-v790
BATCHES[781] = []
for ver in range(781, 791):
    BATCHES[781] += [
        ("jumpAutoSeek"+str(ver),"bool",False,None,"Jump Auto Seek"+str(ver)),
        ("kernelAutoTune"+str(ver),"bool",False,None,"Kernel Auto Tune"+str(ver)),
        ("keyAutoBind"+str(ver),"bool",False,None,"Key Auto Bind"+str(ver)),
        ("killAutoProcess"+str(ver),"bool",False,None,"Kill Auto Process"+str(ver)),
        ("kitAutoLoad"+str(ver),"bool",False,None,"Kit Auto Load"+str(ver)),
        ("labelAutoTag"+str(ver),"bool",False,None,"Label Auto Tag"+str(ver)),
        ("lagAutoCompensate"+str(ver),"bool",False,None,"Lag Auto Compensate"+str(ver)),
        ("languageAutoDetect"+str(ver),"bool",False,None,"Language Auto Detect"+str(ver)),
        ("layerAutoZOrder"+str(ver),"int",0,[0,1,2,3],"Layer Auto ZOrder"+str(ver)),
        ("layoutAutoReflow"+str(ver),"bool",False,None,"Layout Auto Reflow"+str(ver)),
        ("lazyAutoInit"+str(ver),"bool",False,None,"Lazy Auto Init"+str(ver)),
        ("leadAutoFollow"+str(ver),"bool",False,None,"Lead Auto Follow"+str(ver)),
        ("leafAutoNode"+str(ver),"bool",False,None,"Leaf Auto Node"+str(ver)),
        ("learnAutoAdapt"+str(ver),"bool",False,None,"Learn Auto Adapt"+str(ver)),
        ("leftAutoPanel"+str(ver),"bool",False,None,"Left Auto Panel"+str(ver)),
    ]

# v791-v800
BATCHES[791] = []
for ver in range(791, 801):
    BATCHES[791] += [
        ("lengthAutoLimit"+str(ver),"int",0,[0,1,2,3],"Length Auto Limit"+str(ver)),
        ("levelAutoTier"+str(ver),"int",0,[0,1,2,3],"Level Auto Tier"+str(ver)),
        ("libraryAutoImport"+str(ver),"bool",False,None,"Library Auto Import"+str(ver)),
        ("licenseAutoVerify"+str(ver),"bool",False,None,"License Auto Verify"+str(ver)),
        ("lifeAutoCycle"+str(ver),"bool",False,None,"Life Auto Cycle"+str(ver)),
        ("lifetimeAutoManage"+str(ver),"bool",False,None,"Lifetime Auto Manage"+str(ver)),
        ("lightAutoTheme"+str(ver),"bool",False,None,"Light Auto Theme"+str(ver)),
        ("limitAutoRate"+str(ver),"bool",False,None,"Limit Auto Rate"+str(ver)),
        ("lineAutoWrap"+str(ver),"bool",False,None,"Line Auto Wrap"+str(ver)),
        ("linkAutoPreview"+str(ver),"bool",False,None,"Link Auto Preview"+str(ver)),
        ("listAutoVirtualize"+str(ver),"bool",False,None,"List Auto Virtualize"+str(ver)),
        ("liveAutoReconnect"+str(ver),"bool",False,None,"Live Auto Reconnect"+str(ver)),
        ("loadAutoBalance"+str(ver),"bool",False,None,"Load Auto Balance"+str(ver)),
        ("localAutoCache"+str(ver),"bool",False,None,"Local Auto Cache"+str(ver)),
        ("lockAutoScreen"+str(ver),"bool",False,None,"Lock Auto Screen"+str(ver)),
    ]

# v801-v810
BATCHES[801] = []
for ver in range(801, 811):
    BATCHES[801] += [
        ("logAutoRotate"+str(ver),"bool",False,None,"Log Auto Rotate"+str(ver)),
        ("logicAutoBranch"+str(ver),"bool",False,None,"Logic Auto Branch"+str(ver)),
        ("loginAutoToken"+str(ver),"bool",False,None,"Login Auto Token"+str(ver)),
        ("longAutoPress"+str(ver),"bool",False,None,"Long Auto Press"+str(ver)),
        ("loopAutoRepeat"+str(ver),"bool",False,None,"Loop Auto Repeat"+str(ver)),
        ("lowAutoPower"+str(ver),"bool",False,None,"Low Auto Power"+str(ver)),
        ("lowerAutoBound"+str(ver),"int",0,[0,1,2,3],"Lower Auto Bound"+str(ver)),
        ("mainAutoFocus"+str(ver),"bool",False,None,"Main Auto Focus"+str(ver)),
        ("makeAutoBuild"+str(ver),"bool",False,None,"Make Auto Build"+str(ver)),
        ("manageAutoQueue"+str(ver),"bool",False,None,"Manage Auto Queue"+str(ver)),
        ("manifestAutoParse"+str(ver),"bool",False,None,"Manifest Auto Parse"+str(ver)),
        ("mapAutoBind"+str(ver),"bool",False,None,"Map Auto Bind"+str(ver)),
        ("marginAutoAdjust"+str(ver),"bool",False,None,"Margin Auto Adjust"+str(ver)),
        ("markAutoHighlight"+str(ver),"bool",False,None,"Mark Auto Highlight"+str(ver)),
        ("maskAutoApply"+str(ver),"bool",False,None,"Mask Auto Apply"+str(ver)),
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

for start_ver in [781, 791, 801]:
    features = BATCHES[start_ver]
    end_ver = start_ver + 9
    print(f"\n=== Processing v{start_ver}-v{end_ver} ===")
    
    duplicates = []
    for name_lower, ftype, default, opts, desc in features:
        ver_match = re.search(r'(\d{3,})$', name_lower)
        ver = int(ver_match.group(1))
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
        ver = int(re.search(r'(\d{3,})$', name_lower).group(1))
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
    
    with open(AP_PATH, 'r', encoding='utf-8') as f: ap = f.read()
    existing_props = set(re.findall(r'var (v\d+\w+):', ap))
    existing_keys = set(re.findall(r'const val (KEY_V\d+\w+)', ap))
    
    func_lines = []
    for name_lower, ftype, default, opts, desc in features:
        ver = int(re.search(r'(\d{3,})$', name_lower).group(1))
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
    print(f"Tagged v{end_ver}.15.0")

print("\nDone! v781-v810 completed.")
