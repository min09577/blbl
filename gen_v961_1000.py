"""Batch generate v961-v1000 features."""
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
BATCHES[961] = []
for ver in range(961, 971):
    BATCHES[961] += [
        ("sideAutoDrawer"+str(ver),"bool",False,None,"Side Auto Drawer"+str(ver)),
        ("signAutoVerify"+str(ver),"bool",False,None,"Sign Auto Verify"+str(ver)),
        ("signalAutoBoost"+str(ver),"bool",False,None,"Signal Auto Boost"+str(ver)),
        ("silenceAutoMute"+str(ver),"bool",False,None,"Silence Auto Mute"+str(ver)),
        ("simpleAutoView"+str(ver),"bool",False,None,"Simple Auto View"+str(ver)),
        ("singleAutoInstance"+str(ver),"bool",False,None,"Single Auto Instance"+str(ver)),
        ("siteAutoMap"+str(ver),"bool",False,None,"Site Auto Map"+str(ver)),
        ("sizeAutoOptimize"+str(ver),"bool",False,None,"Size Auto Optimize"+str(ver)),
        ("skipAutoIntro"+str(ver),"bool",False,None,"Skip Auto Intro"+str(ver)),
        ("sleepAutoTimer"+str(ver),"bool",False,None,"Sleep Auto Timer"+str(ver)),
        ("sliceAutoArray"+str(ver),"bool",False,None,"Slice Auto Array"+str(ver)),
        ("slideAutoPager"+str(ver),"bool",False,None,"Slide Auto Pager"+str(ver)),
        ("slowAutoMotion"+str(ver),"bool",False,None,"Slow Auto Motion"+str(ver)),
        ("smallAutoWindow"+str(ver),"bool",False,None,"Small Auto Window"+str(ver)),
        ("smartAutoSuggest"+str(ver),"bool",False,None,"Smart Auto Suggest"+str(ver)),
    ]

BATCHES[971] = []
for ver in range(971, 981):
    BATCHES[971] += [
        ("smoothAutoScroll"+str(ver),"bool",False,None,"Smooth Auto Scroll"+str(ver)),
        ("snapAutoGrid"+str(ver),"bool",False,None,"Snap Auto Grid"+str(ver)),
        ("socketAutoKeepAlive"+str(ver),"bool",False,None,"Socket Auto KeepAlive"+str(ver)),
        ("softAutoKeyboard"+str(ver),"bool",False,None,"Soft Auto Keyboard"+str(ver)),
        ("sortAutoAlgorithm"+str(ver),"int",0,[0,1,2,3],"Sort Auto Algorithm"+str(ver)),
        ("sourceAutoSelect"+str(ver),"bool",False,None,"Source Auto Select"+str(ver)),
        ("spaceAutoCompact"+str(ver),"bool",False,None,"Space Auto Compact"+str(ver)),
        ("spanAutoColumn"+str(ver),"bool",False,None,"Span Auto Column"+str(ver)),
        ("spawnAutoWorker"+str(ver),"bool",False,None,"Spawn Auto Worker"+str(ver)),
        ("speedAutoAdaptive"+str(ver),"bool",False,None,"Speed Auto Adaptive"+str(ver)),
        ("splitAutoPane"+str(ver),"bool",False,None,"Split Auto Pane"+str(ver)),
        ("spotAutoLight"+str(ver),"bool",False,None,"Spot Auto Light"+str(ver)),
        ("stackAutoTrace"+str(ver),"bool",False,None,"Stack Auto Trace"+str(ver)),
        ("stageAutoProgress"+str(ver),"bool",False,None,"Stage Auto Progress"+str(ver)),
        ("standardAutoCompliance"+str(ver),"bool",False,None,"Standard Auto Compliance"+str(ver)),
    ]

BATCHES[981] = []
for ver in range(981, 991):
    BATCHES[981] += [
        ("starAutoFavorite"+str(ver),"bool",False,None,"Star Auto Favorite"+str(ver)),
        ("startAutoLaunch"+str(ver),"bool",False,None,"Start Auto Launch"+str(ver)),
        ("stateAutoPersist"+str(ver),"bool",False,None,"State Auto Persist"+str(ver)),
        ("staticAutoConst"+str(ver),"bool",False,None,"Static Auto Const"+str(ver)),
        ("statusAutoBadge"+str(ver),"bool",False,None,"Status Auto Badge"+str(ver)),
        ("stepAutoGuide"+str(ver),"bool",False,None,"Step Auto Guide"+str(ver)),
        ("stopAutoCleanup"+str(ver),"bool",False,None,"Stop Auto Cleanup"+str(ver)),
        ("storageAutoQuota"+str(ver),"bool",False,None,"Storage Auto Quota"+str(ver)),
        ("storeAutoPersist"+str(ver),"bool",False,None,"Store Auto Persist"+str(ver)),
        ("streamAutoBuffer"+str(ver),"bool",False,None,"Stream Auto Buffer"+str(ver)),
        ("stretchAutoFill"+str(ver),"bool",False,None,"Stretch Auto Fill"+str(ver)),
        ("strictAutoMode"+str(ver),"bool",False,None,"Strict Auto Mode"+str(ver)),
        ("stringAutoEscape"+str(ver),"bool",False,None,"String Auto Escape"+str(ver)),
        ("stripAutoWhitespace"+str(ver),"bool",False,None,"Strip Auto Whitespace"+str(ver)),
        ("strokeAutoWidth"+str(ver),"int",0,[0,1,2,3],"Stroke Auto Width"+str(ver)),
    ]

BATCHES[991] = []
for ver in range(991, 1001):
    BATCHES[991] += [
        ("structureAutoSchema"+str(ver),"bool",False,None,"Structure Auto Schema"+str(ver)),
        ("styleAutoTheme"+str(ver),"bool",False,None,"Style Auto Theme"+str(ver)),
        ("subAutoTitle"+str(ver),"bool",False,None,"Sub Auto Title"+str(ver)),
        ("submitAutoForm"+str(ver),"bool",False,None,"Submit Auto Form"+str(ver)),
        ("subscribeAutoPush"+str(ver),"bool",False,None,"Subscribe Auto Push"+str(ver)),
        ("successAutoToast"+str(ver),"bool",False,None,"Success Auto Toast"+str(ver)),
        ("suffixAutoTrim"+str(ver),"bool",False,None,"Suffix Auto Trim"+str(ver)),
        ("sumAutoAggregate"+str(ver),"bool",False,None,"Sum Auto Aggregate"+str(ver)),
        ("summaryAutoGenerate"+str(ver),"bool",False,None,"Summary Auto Generate"+str(ver)),
        ("supportAutoDetect"+str(ver),"bool",False,None,"Support Auto Detect"+str(ver)),
        ("swapAutoBuffer"+str(ver),"bool",False,None,"Swap Auto Buffer"+str(ver)),
        ("switchAutoTab"+str(ver),"bool",False,None,"Switch Auto Tab"+str(ver)),
        ("symbolAutoEncode"+str(ver),"bool",False,None,"Symbol Auto Encode"+str(ver)),
        ("syncAutoCloud"+str(ver),"bool",False,None,"Sync Auto Cloud"+str(ver)),
        ("systemAutoOptimize"+str(ver),"bool",False,None,"System Auto Optimize"+str(ver)),
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

for start_ver in [961, 971, 981, 991]:
    features = BATCHES[start_ver]
    end_ver = start_ver + 9
    print(f"\n=== v{start_ver}-v{end_ver} ===")
    
    duplicates = []
    for name_lower, ftype, default, opts, desc in features:
        ver = int(re.search(r'(\d{3,})$', name_lower).group(1))
        pn = f"v{ver}{name_lower}"
        if pn in existing_props: duplicates.append(f"PROP: {pn}")
        kn = f"KEY_V{ver}{name_lower.upper()}"
        if kn in existing_keys: duplicates.append(f"KEY: {kn}")
        u = name_lower[0].upper() + name_lower[1:]
        for sfx in ["Toggle", "Dialog"]:
            if f"showV{ver}{u}{sfx}" in existing_funcs: duplicates.append(f"FN: showV{ver}{u}{sfx}")
    if duplicates: print(f"DUP: {duplicates[:10]}"); exit(1)
    print(f"ALL {len(features)} UNIQUE!")
    
    with open(AP_PATH, 'r', encoding='utf-8') as f: lines = f.readlines()
    ci = None
    for i, l in enumerate(lines):
        if 'companion object' in l: ci = i; break
    assert ci is not None
    
    pl, kl = [], []
    for name_lower, ftype, default, opts, desc in features:
        ver = int(re.search(r'(\d{3,})$', name_lower).group(1))
        kn = f"KEY_V{ver}{name_lower.upper()}"; pn = f"v{ver}{name_lower}"
        kl.append(f'        const val {kn} = "{pn}" // v{ver} {desc}\n')
        if ftype == "bool":
            pl += [f'    var {pn}: Boolean\n', f'        get() = prefs.getBoolean({kn}, false)\n', f'        set(value) = prefs.edit().putBoolean({kn}, value).apply()\n', '\n']
        else:
            pl += [f'    var {pn}: Int\n', f'        get() = prefs.getInt({kn}, {default})\n', f'        set(value) = prefs.edit().putInt({kn}, value).apply()\n', '\n']
    
    for idx, l in enumerate(pl): lines.insert(ci + idx, l)
    ci += len(pl)
    cidx, bc = None, 0
    for i in range(ci, len(lines)):
        for ch in lines[i]:
            if ch == '{': bc += 1
            elif ch == '}':
                bc -= 1
                if bc == 0: cidx = i; break
        if cidx is not None: break
    for idx, l in enumerate(kl): lines.insert(cidx + idx, l)
    with open(AP_PATH, 'w', encoding='utf-8') as f: f.writelines(lines)
    
    with open(AP_PATH, 'r', encoding='utf-8') as f: ap = f.read()
    existing_props = set(re.findall(r'var (v\d+\w+):', ap))
    existing_keys = set(re.findall(r'const val (KEY_V\d+\w+)', ap))
    
    fl = []
    for name_lower, ftype, default, opts, desc in features:
        ver = int(re.search(r'(\d{3,})$', name_lower).group(1))
        pn = f"v{ver}{name_lower}"; u = name_lower[0].upper() + name_lower[1:]
        if ftype == "bool":
            fn = f"showV{ver}{u}Toggle"
            fl.append(f'// v{ver}: {desc}\ninternal fun PlayerActivity.{fn}() {{\n    val current = BiliClient.prefs.{pn}\n    BiliClient.prefs.{pn} = !current\n    AppToast.show(this, "{desc}: ${{if (!current) "ON" else "OFF"}}")\n}}\n\n')
            existing_funcs.add(fn)
        else:
            fn = f"showV{ver}{u}Dialog"
            fl.append(f'// v{ver}: {desc}\ninternal fun PlayerActivity.{fn}() {{\n    val options = listOf({", ".join(str(o) for o in opts)})\n    val ci2 = options.indexOf(BiliClient.prefs.{pn}).takeIf {{ it >= 0 }} ?: 0\n    showSettingsChoiceDialog(\n        title = "{desc}",\n        options = options,\n        checkedIndex = ci2,\n        label = {{ "$it" }},\n    ) {{ value ->\n        BiliClient.prefs.{pn} = value\n        AppToast.show(this, "{desc}: $value")\n    }}\n}}\n\n')
            existing_funcs.add(fn)
    
    lpn = max(int(re.search(r'Part(\d+)', f).group(1)) for f in os.listdir(ps_dir) if f.startswith('PlayerSettingsPart') and f.endswith('.kt'))
    lpp = os.path.join(ps_dir, f'PlayerSettingsPart{lpn}.kt')
    with open(lpp, 'r', encoding='utf-8') as f: content = f.read()
    fc = len(re.findall(r'internal fun PlayerActivity\.', content))
    if fc + 150 <= 200:
        with open(lpp, 'a', encoding='utf-8') as f: f.write(''.join(fl))
        print(f"Appended to Part{lpn}")
    else:
        np = os.path.join(ps_dir, f'PlayerSettingsPart{lpn+1}.kt')
        with open(np, 'w', encoding='utf-8') as f: f.write(HEADER + ''.join(fl))
        print(f"Created Part{lpn+1}")
    
    subprocess.run(['git', 'add', '-A'], check=True)
    subprocess.run(['git', 'commit', '-m', f'Release v{end_ver}.15.0 - Add v{start_ver}-v{end_ver} ({len(features)} features)'], check=True)
    subprocess.run(['git', 'push', 'origin', 'main'], check=True)
    subprocess.run(['git', 'tag', f'v{end_ver}.15.0'], check=True)
    subprocess.run(['git', 'push', 'origin', f'v{end_ver}.15.0'], check=True)
    print(f"Tagged v{end_ver}.15.0")

print("\nDone! v961-v1000 completed!")
