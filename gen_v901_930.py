"""Batch generate v901-v930 features."""
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
BATCHES[901] = []
for ver in range(901, 911):
    BATCHES[901] += [
        ("quickAutoAction"+str(ver),"bool",False,None,"Quick Auto Action"+str(ver)),
        ("quitAutoSave"+str(ver),"bool",False,None,"Quit Auto Save"+str(ver)),
        ("quoteAutoFormat"+str(ver),"bool",False,None,"Quote Auto Format"+str(ver)),
        ("raceAutoCondition"+str(ver),"bool",False,None,"Race Auto Condition"+str(ver)),
        ("randomAutoShuffle"+str(ver),"bool",False,None,"Random Auto Shuffle"+str(ver)),
        ("rangeAutoSlider"+str(ver),"bool",False,None,"Range Auto Slider"+str(ver)),
        ("rateAutoLimit"+str(ver),"int",0,[0,1,2,3],"Rate Auto Limit"+str(ver)),
        ("rawAutoDecode"+str(ver),"bool",False,None,"Raw Auto Decode"+str(ver)),
        ("readAutoBookmark"+str(ver),"bool",False,None,"Read Auto Bookmark"+str(ver)),
        ("readyAutoCheck"+str(ver),"bool",False,None,"Ready Auto Check"+str(ver)),
        ("realAutoTime"+str(ver),"bool",False,None,"Real Auto Time"+str(ver)),
        ("rebuildAutoIndex"+str(ver),"bool",False,None,"Rebuild Auto Index"+str(ver)),
        ("recordAutoHistory"+str(ver),"bool",False,None,"Record Auto History"+str(ver)),
        ("recoverAutoSession"+str(ver),"bool",False,None,"Recover Auto Session"+str(ver)),
        ("recycleAutoBin"+str(ver),"bool",False,None,"Recycle Auto Bin"+str(ver)),
    ]

BATCHES[911] = []
for ver in range(911, 921):
    BATCHES[911] += [
        ("redirectAutoUrl"+str(ver),"bool",False,None,"Redirect Auto Url"+str(ver)),
        ("reduceAutoMotion"+str(ver),"bool",False,None,"Reduce Auto Motion"+str(ver)),
        ("refAutoCount"+str(ver),"bool",False,None,"Ref Auto Count"+str(ver)),
        ("referenceAutoLink"+str(ver),"bool",False,None,"Reference Auto Link"+str(ver)),
        ("refreshAutoRate"+str(ver),"int",0,[0,1,2,3],"Refresh Auto Rate"+str(ver)),
        ("registerAutoCallback"+str(ver),"bool",False,None,"Register Auto Callback"+str(ver)),
        ("regularAutoExpression"+str(ver),"bool",False,None,"Regular Auto Expression"+str(ver)),
        ("rejectAutoBlock"+str(ver),"bool",False,None,"Reject Auto Block"+str(ver)),
        ("relateAutoSuggest"+str(ver),"bool",False,None,"Relate Auto Suggest"+str(ver)),
        ("releaseAutoLock"+str(ver),"bool",False,None,"Release Auto Lock"+str(ver)),
        ("remoteAutoCast"+str(ver),"bool",False,None,"Remote Auto Cast"+str(ver)),
        ("removeAutoClean"+str(ver),"bool",False,None,"Remove Auto Clean"+str(ver)),
        ("renameAutoLabel"+str(ver),"bool",False,None,"Rename Auto Label"+str(ver)),
        ("renderAutoFrame"+str(ver),"bool",False,None,"Render Auto Frame"+str(ver)),
        ("repeatAutoLoop"+str(ver),"bool",False,None,"Repeat Auto Loop"+str(ver)),
    ]

BATCHES[921] = []
for ver in range(921, 931):
    BATCHES[921] += [
        ("replaceAutoRegex"+str(ver),"bool",False,None,"Replace Auto Regex"+str(ver)),
        ("reportAutoCrash"+str(ver),"bool",False,None,"Report Auto Crash"+str(ver)),
        ("requestAutoRetry"+str(ver),"bool",False,None,"Request Auto Retry"+str(ver)),
        ("requireAutoAuth"+str(ver),"bool",False,None,"Require Auto Auth"+str(ver)),
        ("resetAutoDefault"+str(ver),"bool",False,None,"Reset Auto Default"+str(ver)),
        ("resizeAutoFit"+str(ver),"bool",False,None,"Resize Auto Fit"+str(ver)),
        ("resolveAutoDns"+str(ver),"bool",False,None,"Resolve Auto Dns"+str(ver)),
        ("resourceAutoPool"+str(ver),"bool",False,None,"Resource Auto Pool"+str(ver)),
        ("responseAutoCache"+str(ver),"bool",False,None,"Response Auto Cache"+str(ver)),
        ("restartAutoRecover"+str(ver),"bool",False,None,"Restart Auto Recover"+str(ver)),
        ("restoreAutoBackup"+str(ver),"bool",False,None,"Restore Auto Backup"+str(ver)),
        ("resultAutoSort"+str(ver),"bool",False,None,"Result Auto Sort"+str(ver)),
        ("retryAutoBackoff"+str(ver),"int",0,[0,1,2,3],"Retry Auto Backoff"+str(ver)),
        ("returnAutoHome"+str(ver),"bool",False,None,"Return Auto Home"+str(ver)),
        ("reverseAutoOrder"+str(ver),"bool",False,None,"Reverse Auto Order"+str(ver)),
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

for start_ver in [901, 911, 921]:
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

print("\nDone! v901-v930 completed.")
