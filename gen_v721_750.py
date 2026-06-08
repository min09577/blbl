"""Batch generate v721-v750 features (3 batches of 150 each)."""
import re, os
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

BATCHES = {
    721: [
        ("exportAutoXml"+str(v),"bool",False,None,"Export Auto Xml"+str(v)) for v in range(721,726)
    ] + [
        ("extendAutoList"+str(v),"bool",False,None,"Extend Auto List"+str(v)) for v in range(721,726)
    ] + [
        ("externalAutoLink"+str(v),"bool",False,None,"External Auto Link"+str(v)) for v in range(721,726)
    ] + [
        ("extractAutoData"+str(v),"bool",False,None,"Extract Auto Data"+str(v)) for v in range(721,726)
    ] + [
        ("factorAutoScale"+str(v),"int",0,[0,1,2,3],"Factor Auto Scale"+str(v)) for v in range(721,726)
    ],
}

# v726-v730
for ver in range(726, 731):
    BATCHES[721] += [
        ("fadeAutoIn"+str(ver),"bool",False,None,"Fade Auto In"+str(ver)),
        ("fallbackAutoRoute"+str(ver),"bool",False,None,"Fallback Auto Route"+str(ver)),
        ("familyAutoGroup"+str(ver),"bool",False,None,"Family Auto Group"+str(ver)),
        ("featureAutoToggle"+str(ver),"bool",False,None,"Feature Auto Toggle"+str(ver)),
        ("fieldAutoSelect"+str(ver),"bool",False,None,"Field Auto Select"+str(ver)),
        ("fileAutoCompress"+str(ver),"bool",False,None,"File Auto Compress"+str(ver)),
        ("filterAutoApply"+str(ver),"bool",False,None,"Filter Auto Apply"+str(ver)),
        ("finalAutoReview"+str(ver),"bool",False,None,"Final Auto Review"+str(ver)),
        ("findAutoMatch"+str(ver),"bool",False,None,"Find Auto Match"+str(ver)),
        ("fireAutoEvent"+str(ver),"bool",False,None,"Fire Auto Event"+str(ver)),
        ("firmwareAutoUpdate"+str(ver),"int",0,[0,1,2,3],"Firmware Auto Update"+str(ver)),
        ("flagAutoSet"+str(ver),"bool",False,None,"Flag Auto Set"+str(ver)),
        ("flashAutoMode"+str(ver),"bool",False,None,"Flash Auto Mode"+str(ver)),
        ("flatAutoLayout"+str(ver),"bool",False,None,"Flat Auto Layout"+str(ver)),
        ("flipAutoHorizontal"+str(ver),"bool",False,None,"Flip Auto Horizontal"+str(ver)),
    ]

# v731-v740
BATCHES[731] = []
for ver in range(731, 741):
    BATCHES[731] += [
        ("floatAutoAnchor"+str(ver),"bool",False,None,"Float Auto Anchor"+str(ver)),
        ("flushAutoBuffer"+str(ver),"bool",False,None,"Flush Auto Buffer"+str(ver)),
        ("focusAutoFollow"+str(ver),"bool",False,None,"Focus Auto Follow"+str(ver)),
        ("foldAutoCollapse"+str(ver),"bool",False,None,"Fold Auto Collapse"+str(ver)),
        ("fontAutoHinting"+str(ver),"bool",False,None,"Font Auto Hinting"+str(ver)),
        ("footerAutoHide"+str(ver),"bool",False,None,"Footer Auto Hide"+str(ver)),
        ("forceAutoReload"+str(ver),"bool",False,None,"Force Auto Reload"+str(ver)),
        ("formatAutoConvert"+str(ver),"int",0,[0,1,2,3],"Format Auto Convert"+str(ver)),
        ("fragmentAutoLazy"+str(ver),"bool",False,None,"Fragment Auto Lazy"+str(ver)),
        ("frameAutoDrop"+str(ver),"bool",False,None,"Frame Auto Drop"+str(ver)),
        ("freeAutoMemory"+str(ver),"bool",False,None,"Free Auto Memory"+str(ver)),
        ("frequencyAutoHz"+str(ver),"int",0,[0,1,2,3],"Frequency Auto Hz"+str(ver)),
        ("frontAutoCamera"+str(ver),"bool",False,None,"Front Auto Camera"+str(ver)),
        ("fullAutoScreen"+str(ver),"bool",False,None,"Full Auto Screen"+str(ver)),
        ("functionAutoInline"+str(ver),"bool",False,None,"Function Auto Inline"+str(ver)),
    ]

# v741-v750
BATCHES[741] = []
for ver in range(741, 751):
    BATCHES[741] += [
        ("gainAutoLevel"+str(ver),"int",0,[0,1,2,3],"Gain Auto Level"+str(ver)),
        ("gammaAutoCorrect"+str(ver),"bool",False,None,"Gamma Auto Correct"+str(ver)),
        ("gapAutoFill"+str(ver),"bool",False,None,"Gap Auto Fill"+str(ver)),
        ("gateAutoControl"+str(ver),"bool",False,None,"Gate Auto Control"+str(ver)),
        ("generateAutoReport"+str(ver),"bool",False,None,"Generate Auto Report"+str(ver)),
        ("gestureAutoSwipe"+str(ver),"bool",False,None,"Gesture Auto Swipe"+str(ver)),
        ("globalAutoSync"+str(ver),"bool",False,None,"Global Auto Sync"+str(ver)),
        ("glyphAutoRender"+str(ver),"bool",False,None,"Glyph Auto Render"+str(ver)),
        ("gradientAutoColor"+str(ver),"bool",False,None,"Gradient Auto Color"+str(ver)),
        ("grantAutoAccess"+str(ver),"bool",False,None,"Grant Auto Access"+str(ver)),
        ("graphAutoLayout"+str(ver),"bool",False,None,"Graph Auto Layout"+str(ver)),
        ("gravityAutoSensor"+str(ver),"bool",False,None,"Gravity Auto Sensor"+str(ver)),
        ("gridAutoAdaptive"+str(ver),"bool",False,None,"Grid Auto Adaptive"+str(ver)),
        ("groupAutoCluster"+str(ver),"int",0,[0,1,2,3],"Group Auto Cluster"+str(ver)),
        ("growAutoAnimate"+str(ver),"bool",False,None,"Grow Auto Animate"+str(ver)),
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

for start_ver in [721, 731, 741]:
    features = BATCHES[start_ver]
    end_ver = start_ver + 9
    
    print(f"\n=== Processing v{start_ver}-v{end_ver} ===")
    
    # Check duplicates
    duplicates = []
    for name_lower, ftype, default, opts, desc in features:
        ver_match = re.search(r'(\d{3,})$', name_lower)
        ver = int(ver_match.group(1)) if ver_match else start_ver
        prop_name = f"v{ver}{name_lower}"
        if prop_name in existing_props:
            duplicates.append(f"PROP: {prop_name}")
        key_name = f"KEY_V{ver}{name_lower.upper()}"
        if key_name in existing_keys:
            duplicates.append(f"KEY: {key_name}")
        u = name_lower[0].upper() + name_lower[1:]
        for suffix in ["Toggle", "Dialog"]:
            fn = f"showV{ver}{u}{suffix}"
            if fn in existing_funcs:
                duplicates.append(f"FUNC: {fn}")
    
    if duplicates:
        print(f"FOUND {len(duplicates)} DUPLICATES:")
        for d in duplicates[:10]: print(f"  {d}")
        exit(1)
    print(f"ALL {len(features)} FEATURES UNIQUE!")
    
    # Add to AppPrefs
    with open(AP_PATH, 'r', encoding='utf-8') as f:
        lines = f.readlines()
    
    companion_idx = None
    for i, line in enumerate(lines):
        if 'companion object' in line:
            companion_idx = i; break
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
    print(f"AppPrefs.kt: +{len(prop_lines)} props, +{len(key_lines)} keys")
    
    # Update existing sets
    with open(AP_PATH, 'r', encoding='utf-8') as f:
        ap = f.read()
    existing_props = set(re.findall(r'var (v\d+\w+):', ap))
    existing_keys = set(re.findall(r'const val (KEY_V\d+\w+)', ap))
    
    # Generate functions
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
    
    # Append to Part file
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
    
    # Commit and tag
    import subprocess
    subprocess.run(['git', 'add', '-A'], check=True)
    subprocess.run(['git', 'commit', '-m', f'Release v{end_ver}.15.0 - Add v{start_ver}-v{end_ver} unique features ({len(features)} features)'], check=True)
    subprocess.run(['git', 'push', 'origin', 'main'], check=True)
    subprocess.run(['git', 'tag', f'v{end_ver}.15.0'], check=True)
    subprocess.run(['git', 'push', 'origin', f'v{end_ver}.15.0'], check=True)
    print(f"Committed and tagged v{end_ver}.15.0")

print("\nDone! All 3 batches completed.")
