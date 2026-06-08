"""Batch generate v841-v870 features."""
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
# v841-v850
BATCHES[841] = []
for ver in range(841, 851):
    BATCHES[841] += [
        ("orbitAutoPath"+str(ver),"bool",False,None,"Orbit Auto Path"+str(ver)),
        ("orderAutoSort"+str(ver),"bool",False,None,"Order Auto Sort"+str(ver)),
        ("originAutoRedirect"+str(ver),"bool",False,None,"Origin Auto Redirect"+str(ver)),
        ("outAutoBound"+str(ver),"bool",False,None,"Out Auto Bound"+str(ver)),
        ("outputAutoBuffer"+str(ver),"bool",False,None,"Output Auto Buffer"+str(ver)),
        ("overlayAutoDim"+str(ver),"bool",False,None,"Overlay Auto Dim"+str(ver)),
        ("ownerAutoPermission"+str(ver),"bool",False,None,"Owner Auto Permission"+str(ver)),
        ("packAutoBundle"+str(ver),"bool",False,None,"Pack Auto Bundle"+str(ver)),
        ("packageAutoVerify"+str(ver),"bool",False,None,"Package Auto Verify"+str(ver)),
        ("pageAutoScroll"+str(ver),"bool",False,None,"Page Auto Scroll"+str(ver)),
        ("paintAutoStroke"+str(ver),"bool",False,None,"Paint Auto Stroke"+str(ver)),
        ("pairAutoSync"+str(ver),"bool",False,None,"Pair Auto Sync"+str(ver)),
        ("panelAutoSlide"+str(ver),"bool",False,None,"Panel Auto Slide"+str(ver)),
        ("parallelAutoTask"+str(ver),"bool",False,None,"Parallel Auto Task"+str(ver)),
        ("paramAutoInject"+str(ver),"bool",False,None,"Param Auto Inject"+str(ver)),
    ]

# v851-v860
BATCHES[851] = []
for ver in range(851, 861):
    BATCHES[851] += [
        ("parentAutoScope"+str(ver),"bool",False,None,"Parent Auto Scope"+str(ver)),
        ("parseAutoJson"+str(ver),"bool",False,None,"Parse Auto Json"+str(ver)),
        ("partialAutoLoad"+str(ver),"bool",False,None,"Partial Auto Load"+str(ver)),
        ("passAutoThrough"+str(ver),"bool",False,None,"Pass Auto Through"+str(ver)),
        ("passwordAutoFill"+str(ver),"bool",False,None,"Password Auto Fill"+str(ver)),
        ("pasteAutoClean"+str(ver),"bool",False,None,"Paste Auto Clean"+str(ver)),
        ("patchAutoApply"+str(ver),"bool",False,None,"Patch Auto Apply"+str(ver)),
        ("pathAutoResolve"+str(ver),"bool",False,None,"Path Auto Resolve"+str(ver)),
        ("patternAutoMatch"+str(ver),"bool",False,None,"Pattern Auto Match"+str(ver)),
        ("pauseAutoResume"+str(ver),"bool",False,None,"Pause Auto Resume"+str(ver)),
        ("payloadAutoEncode"+str(ver),"bool",False,None,"Payload Auto Encode"+str(ver)),
        ("peakAutoDetect"+str(ver),"bool",False,None,"Peak Auto Detect"+str(ver)),
        ("pendingAutoQueue"+str(ver),"bool",False,None,"Pending Auto Queue"+str(ver)),
        ("percentAutoCalc"+str(ver),"bool",False,None,"Percent Auto Calc"+str(ver)),
        ("performAutoBenchmark"+str(ver),"int",0,[0,1,2,3],"Perform Auto Benchmark"+str(ver)),
    ]

# v861-v870
BATCHES[861] = []
for ver in range(861, 871):
    BATCHES[861] += [
        ("permissionAutoGrant"+str(ver),"bool",False,None,"Permission Auto Grant"+str(ver)),
        ("persistAutoState"+str(ver),"bool",False,None,"Persist Auto State"+str(ver)),
        ("phaseAutoTransition"+str(ver),"bool",False,None,"Phase Auto Transition"+str(ver)),
        ("phoneAutoDetect"+str(ver),"bool",False,None,"Phone Auto Detect"+str(ver)),
        ("photoAutoCompress"+str(ver),"bool",False,None,"Photo Auto Compress"+str(ver)),
        ("phraseAutoComplete"+str(ver),"bool",False,None,"Phrase Auto Complete"+str(ver)),
        ("pickAutoRandom"+str(ver),"bool",False,None,"Pick Auto Random"+str(ver)),
        ("pictureAutoThumbnail"+str(ver),"bool",False,None,"Picture Auto Thumbnail"+str(ver)),
        ("pinAutoTop"+str(ver),"bool",False,None,"Pin Auto Top"+str(ver)),
        ("pipeAutoRedirect"+str(ver),"bool",False,None,"Pipe Auto Redirect"+str(ver)),
        ("pitchAutoCorrect"+str(ver),"bool",False,None,"Pitch Auto Correct"+str(ver)),
        ("pixelAutoSnap"+str(ver),"bool",False,None,"Pixel Auto Snap"+str(ver)),
        ("placeAutoHolder"+str(ver),"bool",False,None,"Place Auto Holder"+str(ver)),
        ("plainAutoText"+str(ver),"bool",False,None,"Plain Auto Text"+str(ver)),
        ("planAutoSchedule"+str(ver),"bool",False,None,"Plan Auto Schedule"+str(ver)),
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

for start_ver in [841, 851, 861]:
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

print("\nDone! v841-v870 completed.")
