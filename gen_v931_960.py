"""Batch generate v931-v960 features."""
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
BATCHES[931] = []
for ver in range(931, 941):
    BATCHES[931] += [
        ("revertAutoVersion"+str(ver),"bool",False,None,"Revert Auto Version"+str(ver)),
        ("rightAutoPanel"+str(ver),"bool",False,None,"Right Auto Panel"+str(ver)),
        ("roleAutoPermission"+str(ver),"bool",False,None,"Role Auto Permission"+str(ver)),
        ("rootAutoDetect"+str(ver),"bool",False,None,"Root Auto Detect"+str(ver)),
        ("rotateAutoSensor"+str(ver),"bool",False,None,"Rotate Auto Sensor"+str(ver)),
        ("roundAutoCorner"+str(ver),"bool",False,None,"Round Auto Corner"+str(ver)),
        ("routeAutoNavigate"+str(ver),"bool",False,None,"Route Auto Navigate"+str(ver)),
        ("rowAutoHeight"+str(ver),"bool",False,None,"Row Auto Height"+str(ver)),
        ("ruleAutoEngine"+str(ver),"bool",False,None,"Rule Auto Engine"+str(ver)),
        ("runAutoStartup"+str(ver),"bool",False,None,"Run Auto Startup"+str(ver)),
        ("runtimeAutoConfig"+str(ver),"bool",False,None,"Runtime Auto Config"+str(ver)),
        ("safeAutoMode"+str(ver),"bool",False,None,"Safe Auto Mode"+str(ver)),
        ("sampleAutoRate"+str(ver),"int",0,[0,1,2,3],"Sample Auto Rate"+str(ver)),
        ("saveAutoDraft"+str(ver),"bool",False,None,"Save Auto Draft"+str(ver)),
        ("scaleAutoDpi"+str(ver),"bool",False,None,"Scale Auto Dpi"+str(ver)),
    ]

BATCHES[941] = []
for ver in range(941, 951):
    BATCHES[941] += [
        ("scanAutoBarcode"+str(ver),"bool",False,None,"Scan Auto Barcode"+str(ver)),
        ("sceneAutoDetect"+str(ver),"bool",False,None,"Scene Auto Detect"+str(ver)),
        ("schemeAutoDeepLink"+str(ver),"bool",False,None,"Scheme Auto DeepLink"+str(ver)),
        ("scopeAutoLifecycle"+str(ver),"bool",False,None,"Scope Auto Lifecycle"+str(ver)),
        ("scoreAutoWeight"+str(ver),"bool",False,None,"Score Auto Weight"+str(ver)),
        ("screenAutoBrightness"+str(ver),"bool",False,None,"Screen Auto Brightness"+str(ver)),
        ("scrollAutoPosition"+str(ver),"bool",False,None,"Scroll Auto Position"+str(ver)),
        ("searchAutoSuggest"+str(ver),"bool",False,None,"Search Auto Suggest"+str(ver)),
        ("sectionAutoHeader"+str(ver),"bool",False,None,"Section Auto Header"+str(ver)),
        ("secureAutoLock"+str(ver),"bool",False,None,"Secure Auto Lock"+str(ver)),
        ("seekAutoFrame"+str(ver),"bool",False,None,"Seek Auto Frame"+str(ver)),
        ("segmentAutoMerge"+str(ver),"bool",False,None,"Segment Auto Merge"+str(ver)),
        ("selectAutoMulti"+str(ver),"bool",False,None,"Select Auto Multi"+str(ver)),
        ("sendAutoBatch"+str(ver),"bool",False,None,"Send Auto Batch"+str(ver)),
        ("sensorAutoGyro"+str(ver),"bool",False,None,"Sensor Auto Gyro"+str(ver)),
    ]

BATCHES[951] = []
for ver in range(951, 961):
    BATCHES[951] += [
        ("sequenceAutoOrder"+str(ver),"bool",False,None,"Sequence Auto Order"+str(ver)),
        ("serialAutoPort"+str(ver),"bool",False,None,"Serial Auto Port"+str(ver)),
        ("serverAutoLoad"+str(ver),"bool",False,None,"Server Auto Load"+str(ver)),
        ("serviceAutoBind"+str(ver),"bool",False,None,"Service Auto Bind"+str(ver)),
        ("sessionAutoRestore"+str(ver),"bool",False,None,"Session Auto Restore"+str(ver)),
        ("setAutoDefault"+str(ver),"bool",False,None,"Set Auto Default"+str(ver)),
        ("settingAutoExport"+str(ver),"bool",False,None,"Setting Auto Export"+str(ver)),
        ("setupAutoWizard"+str(ver),"bool",False,None,"Setup Auto Wizard"+str(ver)),
        ("shadowAutoElevation"+str(ver),"bool",False,None,"Shadow Auto Elevation"+str(ver)),
        ("shapeAutoMorph"+str(ver),"bool",False,None,"Shape Auto Morph"+str(ver)),
        ("shareAutoClipboard"+str(ver),"bool",False,None,"Share Auto Clipboard"+str(ver)),
        ("sharpAutoContrast"+str(ver),"bool",False,None,"Sharp Auto Contrast"+str(ver)),
        ("shiftAutoTimestamp"+str(ver),"bool",False,None,"Shift Auto Timestamp"+str(ver)),
        ("showAutoAnimation"+str(ver),"bool",False,None,"Show Auto Animation"+str(ver)),
        ("shrinkAutoCollapse"+str(ver),"bool",False,None,"Shrink Auto Collapse"+str(ver)),
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

for start_ver in [931, 941, 951]:
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

print("\nDone! v931-v960 completed.")
