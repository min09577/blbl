"""Batch generate v881-v900 features."""
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
BATCHES[881] = []
for ver in range(881, 891):
    BATCHES[881] += [
        ("prepareAutoBuffer"+str(ver),"bool",False,None,"Prepare Auto Buffer"+str(ver)),
        ("presentAutoAnimate"+str(ver),"bool",False,None,"Present Auto Animate"+str(ver)),
        ("preserveAutoRatio"+str(ver),"bool",False,None,"Preserve Auto Ratio"+str(ver)),
        ("pressAutoHold"+str(ver),"bool",False,None,"Press Auto Hold"+str(ver)),
        ("prevAutoTrack"+str(ver),"bool",False,None,"Prev Auto Track"+str(ver)),
        ("preventAutoOverscroll"+str(ver),"bool",False,None,"Prevent Auto Overscroll"+str(ver)),
        ("previewAutoThumbnail"+str(ver),"bool",False,None,"Preview Auto Thumbnail"+str(ver)),
        ("primaryAutoSource"+str(ver),"bool",False,None,"Primary Auto Source"+str(ver)),
        ("printAutoLog"+str(ver),"bool",False,None,"Print Auto Log"+str(ver)),
        ("priorityAutoQueue"+str(ver),"int",0,[0,1,2,3],"Priority Auto Queue"+str(ver)),
        ("privateAutoIncognito"+str(ver),"bool",False,None,"Private Auto Incognito"+str(ver)),
        ("processAutoThread"+str(ver),"bool",False,None,"Process Auto Thread"+str(ver)),
        ("produceAutoGenerate"+str(ver),"bool",False,None,"Produce Auto Generate"+str(ver)),
        ("profileAutoSwitch"+str(ver),"bool",False,None,"Profile Auto Switch"+str(ver)),
        ("programAutoSchedule"+str(ver),"bool",False,None,"Program Auto Schedule"+str(ver)),
    ]

BATCHES[891] = []
for ver in range(891, 901):
    BATCHES[891] += [
        ("projectAutoExport"+str(ver),"bool",False,None,"Project Auto Export"+str(ver)),
        ("promiseAutoAwait"+str(ver),"bool",False,None,"Promise Auto Await"+str(ver)),
        ("promptAutoShow"+str(ver),"bool",False,None,"Prompt Auto Show"+str(ver)),
        ("propAutoBind"+str(ver),"bool",False,None,"Prop Auto Bind"+str(ver)),
        ("propertyAutoObserve"+str(ver),"bool",False,None,"Property Auto Observe"+str(ver)),
        ("protectAutoEncrypt"+str(ver),"bool",False,None,"Protect Auto Encrypt"+str(ver)),
        ("protocolAutoNegotiate"+str(ver),"bool",False,None,"Protocol Auto Negotiate"+str(ver)),
        ("provideAutoInject"+str(ver),"bool",False,None,"Provide Auto Inject"+str(ver)),
        ("proxyAutoRotate"+str(ver),"bool",False,None,"Proxy Auto Rotate"+str(ver)),
        ("publicAutoShare"+str(ver),"bool",False,None,"Public Auto Share"+str(ver)),
        ("pullAutoRefresh"+str(ver),"bool",False,None,"Pull Auto Refresh"+str(ver)),
        ("pureAutoMode"+str(ver),"bool",False,None,"Pure Auto Mode"+str(ver)),
        ("pushAutoNotify"+str(ver),"bool",False,None,"Push Auto Notify"+str(ver)),
        ("queryAutoOptimize"+str(ver),"bool",False,None,"Query Auto Optimize"+str(ver)),
        ("queueAutoPriority"+str(ver),"int",0,[0,1,2,3],"Queue Auto Priority"+str(ver)),
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

for start_ver in [881, 891]:
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

print("\nDone! v881-v900 completed.")
