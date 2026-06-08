package blbl.cat3399.feature.player

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

// v941: Scan Auto Barcode941
internal fun PlayerActivity.showV941ScanAutoBarcode941Toggle() {
    val current = BiliClient.prefs.v941scanAutoBarcode941
    BiliClient.prefs.v941scanAutoBarcode941 = !current
    AppToast.show(this, "Scan Auto Barcode941: ${if (!current) "ON" else "OFF"}")
}

// v941: Scene Auto Detect941
internal fun PlayerActivity.showV941SceneAutoDetect941Toggle() {
    val current = BiliClient.prefs.v941sceneAutoDetect941
    BiliClient.prefs.v941sceneAutoDetect941 = !current
    AppToast.show(this, "Scene Auto Detect941: ${if (!current) "ON" else "OFF"}")
}

// v941: Scheme Auto DeepLink941
internal fun PlayerActivity.showV941SchemeAutoDeepLink941Toggle() {
    val current = BiliClient.prefs.v941schemeAutoDeepLink941
    BiliClient.prefs.v941schemeAutoDeepLink941 = !current
    AppToast.show(this, "Scheme Auto DeepLink941: ${if (!current) "ON" else "OFF"}")
}

// v941: Scope Auto Lifecycle941
internal fun PlayerActivity.showV941ScopeAutoLifecycle941Toggle() {
    val current = BiliClient.prefs.v941scopeAutoLifecycle941
    BiliClient.prefs.v941scopeAutoLifecycle941 = !current
    AppToast.show(this, "Scope Auto Lifecycle941: ${if (!current) "ON" else "OFF"}")
}

// v941: Score Auto Weight941
internal fun PlayerActivity.showV941ScoreAutoWeight941Toggle() {
    val current = BiliClient.prefs.v941scoreAutoWeight941
    BiliClient.prefs.v941scoreAutoWeight941 = !current
    AppToast.show(this, "Score Auto Weight941: ${if (!current) "ON" else "OFF"}")
}

// v941: Screen Auto Brightness941
internal fun PlayerActivity.showV941ScreenAutoBrightness941Toggle() {
    val current = BiliClient.prefs.v941screenAutoBrightness941
    BiliClient.prefs.v941screenAutoBrightness941 = !current
    AppToast.show(this, "Screen Auto Brightness941: ${if (!current) "ON" else "OFF"}")
}

// v941: Scroll Auto Position941
internal fun PlayerActivity.showV941ScrollAutoPosition941Toggle() {
    val current = BiliClient.prefs.v941scrollAutoPosition941
    BiliClient.prefs.v941scrollAutoPosition941 = !current
    AppToast.show(this, "Scroll Auto Position941: ${if (!current) "ON" else "OFF"}")
}

// v941: Search Auto Suggest941
internal fun PlayerActivity.showV941SearchAutoSuggest941Toggle() {
    val current = BiliClient.prefs.v941searchAutoSuggest941
    BiliClient.prefs.v941searchAutoSuggest941 = !current
    AppToast.show(this, "Search Auto Suggest941: ${if (!current) "ON" else "OFF"}")
}

// v941: Section Auto Header941
internal fun PlayerActivity.showV941SectionAutoHeader941Toggle() {
    val current = BiliClient.prefs.v941sectionAutoHeader941
    BiliClient.prefs.v941sectionAutoHeader941 = !current
    AppToast.show(this, "Section Auto Header941: ${if (!current) "ON" else "OFF"}")
}

// v941: Secure Auto Lock941
internal fun PlayerActivity.showV941SecureAutoLock941Toggle() {
    val current = BiliClient.prefs.v941secureAutoLock941
    BiliClient.prefs.v941secureAutoLock941 = !current
    AppToast.show(this, "Secure Auto Lock941: ${if (!current) "ON" else "OFF"}")
}

// v941: Seek Auto Frame941
internal fun PlayerActivity.showV941SeekAutoFrame941Toggle() {
    val current = BiliClient.prefs.v941seekAutoFrame941
    BiliClient.prefs.v941seekAutoFrame941 = !current
    AppToast.show(this, "Seek Auto Frame941: ${if (!current) "ON" else "OFF"}")
}

// v941: Segment Auto Merge941
internal fun PlayerActivity.showV941SegmentAutoMerge941Toggle() {
    val current = BiliClient.prefs.v941segmentAutoMerge941
    BiliClient.prefs.v941segmentAutoMerge941 = !current
    AppToast.show(this, "Segment Auto Merge941: ${if (!current) "ON" else "OFF"}")
}

// v941: Select Auto Multi941
internal fun PlayerActivity.showV941SelectAutoMulti941Toggle() {
    val current = BiliClient.prefs.v941selectAutoMulti941
    BiliClient.prefs.v941selectAutoMulti941 = !current
    AppToast.show(this, "Select Auto Multi941: ${if (!current) "ON" else "OFF"}")
}

// v941: Send Auto Batch941
internal fun PlayerActivity.showV941SendAutoBatch941Toggle() {
    val current = BiliClient.prefs.v941sendAutoBatch941
    BiliClient.prefs.v941sendAutoBatch941 = !current
    AppToast.show(this, "Send Auto Batch941: ${if (!current) "ON" else "OFF"}")
}

// v941: Sensor Auto Gyro941
internal fun PlayerActivity.showV941SensorAutoGyro941Toggle() {
    val current = BiliClient.prefs.v941sensorAutoGyro941
    BiliClient.prefs.v941sensorAutoGyro941 = !current
    AppToast.show(this, "Sensor Auto Gyro941: ${if (!current) "ON" else "OFF"}")
}

// v942: Scan Auto Barcode942
internal fun PlayerActivity.showV942ScanAutoBarcode942Toggle() {
    val current = BiliClient.prefs.v942scanAutoBarcode942
    BiliClient.prefs.v942scanAutoBarcode942 = !current
    AppToast.show(this, "Scan Auto Barcode942: ${if (!current) "ON" else "OFF"}")
}

// v942: Scene Auto Detect942
internal fun PlayerActivity.showV942SceneAutoDetect942Toggle() {
    val current = BiliClient.prefs.v942sceneAutoDetect942
    BiliClient.prefs.v942sceneAutoDetect942 = !current
    AppToast.show(this, "Scene Auto Detect942: ${if (!current) "ON" else "OFF"}")
}

// v942: Scheme Auto DeepLink942
internal fun PlayerActivity.showV942SchemeAutoDeepLink942Toggle() {
    val current = BiliClient.prefs.v942schemeAutoDeepLink942
    BiliClient.prefs.v942schemeAutoDeepLink942 = !current
    AppToast.show(this, "Scheme Auto DeepLink942: ${if (!current) "ON" else "OFF"}")
}

// v942: Scope Auto Lifecycle942
internal fun PlayerActivity.showV942ScopeAutoLifecycle942Toggle() {
    val current = BiliClient.prefs.v942scopeAutoLifecycle942
    BiliClient.prefs.v942scopeAutoLifecycle942 = !current
    AppToast.show(this, "Scope Auto Lifecycle942: ${if (!current) "ON" else "OFF"}")
}

// v942: Score Auto Weight942
internal fun PlayerActivity.showV942ScoreAutoWeight942Toggle() {
    val current = BiliClient.prefs.v942scoreAutoWeight942
    BiliClient.prefs.v942scoreAutoWeight942 = !current
    AppToast.show(this, "Score Auto Weight942: ${if (!current) "ON" else "OFF"}")
}

// v942: Screen Auto Brightness942
internal fun PlayerActivity.showV942ScreenAutoBrightness942Toggle() {
    val current = BiliClient.prefs.v942screenAutoBrightness942
    BiliClient.prefs.v942screenAutoBrightness942 = !current
    AppToast.show(this, "Screen Auto Brightness942: ${if (!current) "ON" else "OFF"}")
}

// v942: Scroll Auto Position942
internal fun PlayerActivity.showV942ScrollAutoPosition942Toggle() {
    val current = BiliClient.prefs.v942scrollAutoPosition942
    BiliClient.prefs.v942scrollAutoPosition942 = !current
    AppToast.show(this, "Scroll Auto Position942: ${if (!current) "ON" else "OFF"}")
}

// v942: Search Auto Suggest942
internal fun PlayerActivity.showV942SearchAutoSuggest942Toggle() {
    val current = BiliClient.prefs.v942searchAutoSuggest942
    BiliClient.prefs.v942searchAutoSuggest942 = !current
    AppToast.show(this, "Search Auto Suggest942: ${if (!current) "ON" else "OFF"}")
}

// v942: Section Auto Header942
internal fun PlayerActivity.showV942SectionAutoHeader942Toggle() {
    val current = BiliClient.prefs.v942sectionAutoHeader942
    BiliClient.prefs.v942sectionAutoHeader942 = !current
    AppToast.show(this, "Section Auto Header942: ${if (!current) "ON" else "OFF"}")
}

// v942: Secure Auto Lock942
internal fun PlayerActivity.showV942SecureAutoLock942Toggle() {
    val current = BiliClient.prefs.v942secureAutoLock942
    BiliClient.prefs.v942secureAutoLock942 = !current
    AppToast.show(this, "Secure Auto Lock942: ${if (!current) "ON" else "OFF"}")
}

// v942: Seek Auto Frame942
internal fun PlayerActivity.showV942SeekAutoFrame942Toggle() {
    val current = BiliClient.prefs.v942seekAutoFrame942
    BiliClient.prefs.v942seekAutoFrame942 = !current
    AppToast.show(this, "Seek Auto Frame942: ${if (!current) "ON" else "OFF"}")
}

// v942: Segment Auto Merge942
internal fun PlayerActivity.showV942SegmentAutoMerge942Toggle() {
    val current = BiliClient.prefs.v942segmentAutoMerge942
    BiliClient.prefs.v942segmentAutoMerge942 = !current
    AppToast.show(this, "Segment Auto Merge942: ${if (!current) "ON" else "OFF"}")
}

// v942: Select Auto Multi942
internal fun PlayerActivity.showV942SelectAutoMulti942Toggle() {
    val current = BiliClient.prefs.v942selectAutoMulti942
    BiliClient.prefs.v942selectAutoMulti942 = !current
    AppToast.show(this, "Select Auto Multi942: ${if (!current) "ON" else "OFF"}")
}

// v942: Send Auto Batch942
internal fun PlayerActivity.showV942SendAutoBatch942Toggle() {
    val current = BiliClient.prefs.v942sendAutoBatch942
    BiliClient.prefs.v942sendAutoBatch942 = !current
    AppToast.show(this, "Send Auto Batch942: ${if (!current) "ON" else "OFF"}")
}

// v942: Sensor Auto Gyro942
internal fun PlayerActivity.showV942SensorAutoGyro942Toggle() {
    val current = BiliClient.prefs.v942sensorAutoGyro942
    BiliClient.prefs.v942sensorAutoGyro942 = !current
    AppToast.show(this, "Sensor Auto Gyro942: ${if (!current) "ON" else "OFF"}")
}

// v943: Scan Auto Barcode943
internal fun PlayerActivity.showV943ScanAutoBarcode943Toggle() {
    val current = BiliClient.prefs.v943scanAutoBarcode943
    BiliClient.prefs.v943scanAutoBarcode943 = !current
    AppToast.show(this, "Scan Auto Barcode943: ${if (!current) "ON" else "OFF"}")
}

// v943: Scene Auto Detect943
internal fun PlayerActivity.showV943SceneAutoDetect943Toggle() {
    val current = BiliClient.prefs.v943sceneAutoDetect943
    BiliClient.prefs.v943sceneAutoDetect943 = !current
    AppToast.show(this, "Scene Auto Detect943: ${if (!current) "ON" else "OFF"}")
}

// v943: Scheme Auto DeepLink943
internal fun PlayerActivity.showV943SchemeAutoDeepLink943Toggle() {
    val current = BiliClient.prefs.v943schemeAutoDeepLink943
    BiliClient.prefs.v943schemeAutoDeepLink943 = !current
    AppToast.show(this, "Scheme Auto DeepLink943: ${if (!current) "ON" else "OFF"}")
}

// v943: Scope Auto Lifecycle943
internal fun PlayerActivity.showV943ScopeAutoLifecycle943Toggle() {
    val current = BiliClient.prefs.v943scopeAutoLifecycle943
    BiliClient.prefs.v943scopeAutoLifecycle943 = !current
    AppToast.show(this, "Scope Auto Lifecycle943: ${if (!current) "ON" else "OFF"}")
}

// v943: Score Auto Weight943
internal fun PlayerActivity.showV943ScoreAutoWeight943Toggle() {
    val current = BiliClient.prefs.v943scoreAutoWeight943
    BiliClient.prefs.v943scoreAutoWeight943 = !current
    AppToast.show(this, "Score Auto Weight943: ${if (!current) "ON" else "OFF"}")
}

// v943: Screen Auto Brightness943
internal fun PlayerActivity.showV943ScreenAutoBrightness943Toggle() {
    val current = BiliClient.prefs.v943screenAutoBrightness943
    BiliClient.prefs.v943screenAutoBrightness943 = !current
    AppToast.show(this, "Screen Auto Brightness943: ${if (!current) "ON" else "OFF"}")
}

// v943: Scroll Auto Position943
internal fun PlayerActivity.showV943ScrollAutoPosition943Toggle() {
    val current = BiliClient.prefs.v943scrollAutoPosition943
    BiliClient.prefs.v943scrollAutoPosition943 = !current
    AppToast.show(this, "Scroll Auto Position943: ${if (!current) "ON" else "OFF"}")
}

// v943: Search Auto Suggest943
internal fun PlayerActivity.showV943SearchAutoSuggest943Toggle() {
    val current = BiliClient.prefs.v943searchAutoSuggest943
    BiliClient.prefs.v943searchAutoSuggest943 = !current
    AppToast.show(this, "Search Auto Suggest943: ${if (!current) "ON" else "OFF"}")
}

// v943: Section Auto Header943
internal fun PlayerActivity.showV943SectionAutoHeader943Toggle() {
    val current = BiliClient.prefs.v943sectionAutoHeader943
    BiliClient.prefs.v943sectionAutoHeader943 = !current
    AppToast.show(this, "Section Auto Header943: ${if (!current) "ON" else "OFF"}")
}

// v943: Secure Auto Lock943
internal fun PlayerActivity.showV943SecureAutoLock943Toggle() {
    val current = BiliClient.prefs.v943secureAutoLock943
    BiliClient.prefs.v943secureAutoLock943 = !current
    AppToast.show(this, "Secure Auto Lock943: ${if (!current) "ON" else "OFF"}")
}

// v943: Seek Auto Frame943
internal fun PlayerActivity.showV943SeekAutoFrame943Toggle() {
    val current = BiliClient.prefs.v943seekAutoFrame943
    BiliClient.prefs.v943seekAutoFrame943 = !current
    AppToast.show(this, "Seek Auto Frame943: ${if (!current) "ON" else "OFF"}")
}

// v943: Segment Auto Merge943
internal fun PlayerActivity.showV943SegmentAutoMerge943Toggle() {
    val current = BiliClient.prefs.v943segmentAutoMerge943
    BiliClient.prefs.v943segmentAutoMerge943 = !current
    AppToast.show(this, "Segment Auto Merge943: ${if (!current) "ON" else "OFF"}")
}

// v943: Select Auto Multi943
internal fun PlayerActivity.showV943SelectAutoMulti943Toggle() {
    val current = BiliClient.prefs.v943selectAutoMulti943
    BiliClient.prefs.v943selectAutoMulti943 = !current
    AppToast.show(this, "Select Auto Multi943: ${if (!current) "ON" else "OFF"}")
}

// v943: Send Auto Batch943
internal fun PlayerActivity.showV943SendAutoBatch943Toggle() {
    val current = BiliClient.prefs.v943sendAutoBatch943
    BiliClient.prefs.v943sendAutoBatch943 = !current
    AppToast.show(this, "Send Auto Batch943: ${if (!current) "ON" else "OFF"}")
}

// v943: Sensor Auto Gyro943
internal fun PlayerActivity.showV943SensorAutoGyro943Toggle() {
    val current = BiliClient.prefs.v943sensorAutoGyro943
    BiliClient.prefs.v943sensorAutoGyro943 = !current
    AppToast.show(this, "Sensor Auto Gyro943: ${if (!current) "ON" else "OFF"}")
}

// v944: Scan Auto Barcode944
internal fun PlayerActivity.showV944ScanAutoBarcode944Toggle() {
    val current = BiliClient.prefs.v944scanAutoBarcode944
    BiliClient.prefs.v944scanAutoBarcode944 = !current
    AppToast.show(this, "Scan Auto Barcode944: ${if (!current) "ON" else "OFF"}")
}

// v944: Scene Auto Detect944
internal fun PlayerActivity.showV944SceneAutoDetect944Toggle() {
    val current = BiliClient.prefs.v944sceneAutoDetect944
    BiliClient.prefs.v944sceneAutoDetect944 = !current
    AppToast.show(this, "Scene Auto Detect944: ${if (!current) "ON" else "OFF"}")
}

// v944: Scheme Auto DeepLink944
internal fun PlayerActivity.showV944SchemeAutoDeepLink944Toggle() {
    val current = BiliClient.prefs.v944schemeAutoDeepLink944
    BiliClient.prefs.v944schemeAutoDeepLink944 = !current
    AppToast.show(this, "Scheme Auto DeepLink944: ${if (!current) "ON" else "OFF"}")
}

// v944: Scope Auto Lifecycle944
internal fun PlayerActivity.showV944ScopeAutoLifecycle944Toggle() {
    val current = BiliClient.prefs.v944scopeAutoLifecycle944
    BiliClient.prefs.v944scopeAutoLifecycle944 = !current
    AppToast.show(this, "Scope Auto Lifecycle944: ${if (!current) "ON" else "OFF"}")
}

// v944: Score Auto Weight944
internal fun PlayerActivity.showV944ScoreAutoWeight944Toggle() {
    val current = BiliClient.prefs.v944scoreAutoWeight944
    BiliClient.prefs.v944scoreAutoWeight944 = !current
    AppToast.show(this, "Score Auto Weight944: ${if (!current) "ON" else "OFF"}")
}

// v944: Screen Auto Brightness944
internal fun PlayerActivity.showV944ScreenAutoBrightness944Toggle() {
    val current = BiliClient.prefs.v944screenAutoBrightness944
    BiliClient.prefs.v944screenAutoBrightness944 = !current
    AppToast.show(this, "Screen Auto Brightness944: ${if (!current) "ON" else "OFF"}")
}

// v944: Scroll Auto Position944
internal fun PlayerActivity.showV944ScrollAutoPosition944Toggle() {
    val current = BiliClient.prefs.v944scrollAutoPosition944
    BiliClient.prefs.v944scrollAutoPosition944 = !current
    AppToast.show(this, "Scroll Auto Position944: ${if (!current) "ON" else "OFF"}")
}

// v944: Search Auto Suggest944
internal fun PlayerActivity.showV944SearchAutoSuggest944Toggle() {
    val current = BiliClient.prefs.v944searchAutoSuggest944
    BiliClient.prefs.v944searchAutoSuggest944 = !current
    AppToast.show(this, "Search Auto Suggest944: ${if (!current) "ON" else "OFF"}")
}

// v944: Section Auto Header944
internal fun PlayerActivity.showV944SectionAutoHeader944Toggle() {
    val current = BiliClient.prefs.v944sectionAutoHeader944
    BiliClient.prefs.v944sectionAutoHeader944 = !current
    AppToast.show(this, "Section Auto Header944: ${if (!current) "ON" else "OFF"}")
}

// v944: Secure Auto Lock944
internal fun PlayerActivity.showV944SecureAutoLock944Toggle() {
    val current = BiliClient.prefs.v944secureAutoLock944
    BiliClient.prefs.v944secureAutoLock944 = !current
    AppToast.show(this, "Secure Auto Lock944: ${if (!current) "ON" else "OFF"}")
}

// v944: Seek Auto Frame944
internal fun PlayerActivity.showV944SeekAutoFrame944Toggle() {
    val current = BiliClient.prefs.v944seekAutoFrame944
    BiliClient.prefs.v944seekAutoFrame944 = !current
    AppToast.show(this, "Seek Auto Frame944: ${if (!current) "ON" else "OFF"}")
}

// v944: Segment Auto Merge944
internal fun PlayerActivity.showV944SegmentAutoMerge944Toggle() {
    val current = BiliClient.prefs.v944segmentAutoMerge944
    BiliClient.prefs.v944segmentAutoMerge944 = !current
    AppToast.show(this, "Segment Auto Merge944: ${if (!current) "ON" else "OFF"}")
}

// v944: Select Auto Multi944
internal fun PlayerActivity.showV944SelectAutoMulti944Toggle() {
    val current = BiliClient.prefs.v944selectAutoMulti944
    BiliClient.prefs.v944selectAutoMulti944 = !current
    AppToast.show(this, "Select Auto Multi944: ${if (!current) "ON" else "OFF"}")
}

// v944: Send Auto Batch944
internal fun PlayerActivity.showV944SendAutoBatch944Toggle() {
    val current = BiliClient.prefs.v944sendAutoBatch944
    BiliClient.prefs.v944sendAutoBatch944 = !current
    AppToast.show(this, "Send Auto Batch944: ${if (!current) "ON" else "OFF"}")
}

// v944: Sensor Auto Gyro944
internal fun PlayerActivity.showV944SensorAutoGyro944Toggle() {
    val current = BiliClient.prefs.v944sensorAutoGyro944
    BiliClient.prefs.v944sensorAutoGyro944 = !current
    AppToast.show(this, "Sensor Auto Gyro944: ${if (!current) "ON" else "OFF"}")
}

// v945: Scan Auto Barcode945
internal fun PlayerActivity.showV945ScanAutoBarcode945Toggle() {
    val current = BiliClient.prefs.v945scanAutoBarcode945
    BiliClient.prefs.v945scanAutoBarcode945 = !current
    AppToast.show(this, "Scan Auto Barcode945: ${if (!current) "ON" else "OFF"}")
}

// v945: Scene Auto Detect945
internal fun PlayerActivity.showV945SceneAutoDetect945Toggle() {
    val current = BiliClient.prefs.v945sceneAutoDetect945
    BiliClient.prefs.v945sceneAutoDetect945 = !current
    AppToast.show(this, "Scene Auto Detect945: ${if (!current) "ON" else "OFF"}")
}

// v945: Scheme Auto DeepLink945
internal fun PlayerActivity.showV945SchemeAutoDeepLink945Toggle() {
    val current = BiliClient.prefs.v945schemeAutoDeepLink945
    BiliClient.prefs.v945schemeAutoDeepLink945 = !current
    AppToast.show(this, "Scheme Auto DeepLink945: ${if (!current) "ON" else "OFF"}")
}

// v945: Scope Auto Lifecycle945
internal fun PlayerActivity.showV945ScopeAutoLifecycle945Toggle() {
    val current = BiliClient.prefs.v945scopeAutoLifecycle945
    BiliClient.prefs.v945scopeAutoLifecycle945 = !current
    AppToast.show(this, "Scope Auto Lifecycle945: ${if (!current) "ON" else "OFF"}")
}

// v945: Score Auto Weight945
internal fun PlayerActivity.showV945ScoreAutoWeight945Toggle() {
    val current = BiliClient.prefs.v945scoreAutoWeight945
    BiliClient.prefs.v945scoreAutoWeight945 = !current
    AppToast.show(this, "Score Auto Weight945: ${if (!current) "ON" else "OFF"}")
}

// v945: Screen Auto Brightness945
internal fun PlayerActivity.showV945ScreenAutoBrightness945Toggle() {
    val current = BiliClient.prefs.v945screenAutoBrightness945
    BiliClient.prefs.v945screenAutoBrightness945 = !current
    AppToast.show(this, "Screen Auto Brightness945: ${if (!current) "ON" else "OFF"}")
}

// v945: Scroll Auto Position945
internal fun PlayerActivity.showV945ScrollAutoPosition945Toggle() {
    val current = BiliClient.prefs.v945scrollAutoPosition945
    BiliClient.prefs.v945scrollAutoPosition945 = !current
    AppToast.show(this, "Scroll Auto Position945: ${if (!current) "ON" else "OFF"}")
}

// v945: Search Auto Suggest945
internal fun PlayerActivity.showV945SearchAutoSuggest945Toggle() {
    val current = BiliClient.prefs.v945searchAutoSuggest945
    BiliClient.prefs.v945searchAutoSuggest945 = !current
    AppToast.show(this, "Search Auto Suggest945: ${if (!current) "ON" else "OFF"}")
}

// v945: Section Auto Header945
internal fun PlayerActivity.showV945SectionAutoHeader945Toggle() {
    val current = BiliClient.prefs.v945sectionAutoHeader945
    BiliClient.prefs.v945sectionAutoHeader945 = !current
    AppToast.show(this, "Section Auto Header945: ${if (!current) "ON" else "OFF"}")
}

// v945: Secure Auto Lock945
internal fun PlayerActivity.showV945SecureAutoLock945Toggle() {
    val current = BiliClient.prefs.v945secureAutoLock945
    BiliClient.prefs.v945secureAutoLock945 = !current
    AppToast.show(this, "Secure Auto Lock945: ${if (!current) "ON" else "OFF"}")
}

// v945: Seek Auto Frame945
internal fun PlayerActivity.showV945SeekAutoFrame945Toggle() {
    val current = BiliClient.prefs.v945seekAutoFrame945
    BiliClient.prefs.v945seekAutoFrame945 = !current
    AppToast.show(this, "Seek Auto Frame945: ${if (!current) "ON" else "OFF"}")
}

// v945: Segment Auto Merge945
internal fun PlayerActivity.showV945SegmentAutoMerge945Toggle() {
    val current = BiliClient.prefs.v945segmentAutoMerge945
    BiliClient.prefs.v945segmentAutoMerge945 = !current
    AppToast.show(this, "Segment Auto Merge945: ${if (!current) "ON" else "OFF"}")
}

// v945: Select Auto Multi945
internal fun PlayerActivity.showV945SelectAutoMulti945Toggle() {
    val current = BiliClient.prefs.v945selectAutoMulti945
    BiliClient.prefs.v945selectAutoMulti945 = !current
    AppToast.show(this, "Select Auto Multi945: ${if (!current) "ON" else "OFF"}")
}

// v945: Send Auto Batch945
internal fun PlayerActivity.showV945SendAutoBatch945Toggle() {
    val current = BiliClient.prefs.v945sendAutoBatch945
    BiliClient.prefs.v945sendAutoBatch945 = !current
    AppToast.show(this, "Send Auto Batch945: ${if (!current) "ON" else "OFF"}")
}

// v945: Sensor Auto Gyro945
internal fun PlayerActivity.showV945SensorAutoGyro945Toggle() {
    val current = BiliClient.prefs.v945sensorAutoGyro945
    BiliClient.prefs.v945sensorAutoGyro945 = !current
    AppToast.show(this, "Sensor Auto Gyro945: ${if (!current) "ON" else "OFF"}")
}

// v946: Scan Auto Barcode946
internal fun PlayerActivity.showV946ScanAutoBarcode946Toggle() {
    val current = BiliClient.prefs.v946scanAutoBarcode946
    BiliClient.prefs.v946scanAutoBarcode946 = !current
    AppToast.show(this, "Scan Auto Barcode946: ${if (!current) "ON" else "OFF"}")
}

// v946: Scene Auto Detect946
internal fun PlayerActivity.showV946SceneAutoDetect946Toggle() {
    val current = BiliClient.prefs.v946sceneAutoDetect946
    BiliClient.prefs.v946sceneAutoDetect946 = !current
    AppToast.show(this, "Scene Auto Detect946: ${if (!current) "ON" else "OFF"}")
}

// v946: Scheme Auto DeepLink946
internal fun PlayerActivity.showV946SchemeAutoDeepLink946Toggle() {
    val current = BiliClient.prefs.v946schemeAutoDeepLink946
    BiliClient.prefs.v946schemeAutoDeepLink946 = !current
    AppToast.show(this, "Scheme Auto DeepLink946: ${if (!current) "ON" else "OFF"}")
}

// v946: Scope Auto Lifecycle946
internal fun PlayerActivity.showV946ScopeAutoLifecycle946Toggle() {
    val current = BiliClient.prefs.v946scopeAutoLifecycle946
    BiliClient.prefs.v946scopeAutoLifecycle946 = !current
    AppToast.show(this, "Scope Auto Lifecycle946: ${if (!current) "ON" else "OFF"}")
}

// v946: Score Auto Weight946
internal fun PlayerActivity.showV946ScoreAutoWeight946Toggle() {
    val current = BiliClient.prefs.v946scoreAutoWeight946
    BiliClient.prefs.v946scoreAutoWeight946 = !current
    AppToast.show(this, "Score Auto Weight946: ${if (!current) "ON" else "OFF"}")
}

// v946: Screen Auto Brightness946
internal fun PlayerActivity.showV946ScreenAutoBrightness946Toggle() {
    val current = BiliClient.prefs.v946screenAutoBrightness946
    BiliClient.prefs.v946screenAutoBrightness946 = !current
    AppToast.show(this, "Screen Auto Brightness946: ${if (!current) "ON" else "OFF"}")
}

// v946: Scroll Auto Position946
internal fun PlayerActivity.showV946ScrollAutoPosition946Toggle() {
    val current = BiliClient.prefs.v946scrollAutoPosition946
    BiliClient.prefs.v946scrollAutoPosition946 = !current
    AppToast.show(this, "Scroll Auto Position946: ${if (!current) "ON" else "OFF"}")
}

// v946: Search Auto Suggest946
internal fun PlayerActivity.showV946SearchAutoSuggest946Toggle() {
    val current = BiliClient.prefs.v946searchAutoSuggest946
    BiliClient.prefs.v946searchAutoSuggest946 = !current
    AppToast.show(this, "Search Auto Suggest946: ${if (!current) "ON" else "OFF"}")
}

// v946: Section Auto Header946
internal fun PlayerActivity.showV946SectionAutoHeader946Toggle() {
    val current = BiliClient.prefs.v946sectionAutoHeader946
    BiliClient.prefs.v946sectionAutoHeader946 = !current
    AppToast.show(this, "Section Auto Header946: ${if (!current) "ON" else "OFF"}")
}

// v946: Secure Auto Lock946
internal fun PlayerActivity.showV946SecureAutoLock946Toggle() {
    val current = BiliClient.prefs.v946secureAutoLock946
    BiliClient.prefs.v946secureAutoLock946 = !current
    AppToast.show(this, "Secure Auto Lock946: ${if (!current) "ON" else "OFF"}")
}

// v946: Seek Auto Frame946
internal fun PlayerActivity.showV946SeekAutoFrame946Toggle() {
    val current = BiliClient.prefs.v946seekAutoFrame946
    BiliClient.prefs.v946seekAutoFrame946 = !current
    AppToast.show(this, "Seek Auto Frame946: ${if (!current) "ON" else "OFF"}")
}

// v946: Segment Auto Merge946
internal fun PlayerActivity.showV946SegmentAutoMerge946Toggle() {
    val current = BiliClient.prefs.v946segmentAutoMerge946
    BiliClient.prefs.v946segmentAutoMerge946 = !current
    AppToast.show(this, "Segment Auto Merge946: ${if (!current) "ON" else "OFF"}")
}

// v946: Select Auto Multi946
internal fun PlayerActivity.showV946SelectAutoMulti946Toggle() {
    val current = BiliClient.prefs.v946selectAutoMulti946
    BiliClient.prefs.v946selectAutoMulti946 = !current
    AppToast.show(this, "Select Auto Multi946: ${if (!current) "ON" else "OFF"}")
}

// v946: Send Auto Batch946
internal fun PlayerActivity.showV946SendAutoBatch946Toggle() {
    val current = BiliClient.prefs.v946sendAutoBatch946
    BiliClient.prefs.v946sendAutoBatch946 = !current
    AppToast.show(this, "Send Auto Batch946: ${if (!current) "ON" else "OFF"}")
}

// v946: Sensor Auto Gyro946
internal fun PlayerActivity.showV946SensorAutoGyro946Toggle() {
    val current = BiliClient.prefs.v946sensorAutoGyro946
    BiliClient.prefs.v946sensorAutoGyro946 = !current
    AppToast.show(this, "Sensor Auto Gyro946: ${if (!current) "ON" else "OFF"}")
}

// v947: Scan Auto Barcode947
internal fun PlayerActivity.showV947ScanAutoBarcode947Toggle() {
    val current = BiliClient.prefs.v947scanAutoBarcode947
    BiliClient.prefs.v947scanAutoBarcode947 = !current
    AppToast.show(this, "Scan Auto Barcode947: ${if (!current) "ON" else "OFF"}")
}

// v947: Scene Auto Detect947
internal fun PlayerActivity.showV947SceneAutoDetect947Toggle() {
    val current = BiliClient.prefs.v947sceneAutoDetect947
    BiliClient.prefs.v947sceneAutoDetect947 = !current
    AppToast.show(this, "Scene Auto Detect947: ${if (!current) "ON" else "OFF"}")
}

// v947: Scheme Auto DeepLink947
internal fun PlayerActivity.showV947SchemeAutoDeepLink947Toggle() {
    val current = BiliClient.prefs.v947schemeAutoDeepLink947
    BiliClient.prefs.v947schemeAutoDeepLink947 = !current
    AppToast.show(this, "Scheme Auto DeepLink947: ${if (!current) "ON" else "OFF"}")
}

// v947: Scope Auto Lifecycle947
internal fun PlayerActivity.showV947ScopeAutoLifecycle947Toggle() {
    val current = BiliClient.prefs.v947scopeAutoLifecycle947
    BiliClient.prefs.v947scopeAutoLifecycle947 = !current
    AppToast.show(this, "Scope Auto Lifecycle947: ${if (!current) "ON" else "OFF"}")
}

// v947: Score Auto Weight947
internal fun PlayerActivity.showV947ScoreAutoWeight947Toggle() {
    val current = BiliClient.prefs.v947scoreAutoWeight947
    BiliClient.prefs.v947scoreAutoWeight947 = !current
    AppToast.show(this, "Score Auto Weight947: ${if (!current) "ON" else "OFF"}")
}

// v947: Screen Auto Brightness947
internal fun PlayerActivity.showV947ScreenAutoBrightness947Toggle() {
    val current = BiliClient.prefs.v947screenAutoBrightness947
    BiliClient.prefs.v947screenAutoBrightness947 = !current
    AppToast.show(this, "Screen Auto Brightness947: ${if (!current) "ON" else "OFF"}")
}

// v947: Scroll Auto Position947
internal fun PlayerActivity.showV947ScrollAutoPosition947Toggle() {
    val current = BiliClient.prefs.v947scrollAutoPosition947
    BiliClient.prefs.v947scrollAutoPosition947 = !current
    AppToast.show(this, "Scroll Auto Position947: ${if (!current) "ON" else "OFF"}")
}

// v947: Search Auto Suggest947
internal fun PlayerActivity.showV947SearchAutoSuggest947Toggle() {
    val current = BiliClient.prefs.v947searchAutoSuggest947
    BiliClient.prefs.v947searchAutoSuggest947 = !current
    AppToast.show(this, "Search Auto Suggest947: ${if (!current) "ON" else "OFF"}")
}

// v947: Section Auto Header947
internal fun PlayerActivity.showV947SectionAutoHeader947Toggle() {
    val current = BiliClient.prefs.v947sectionAutoHeader947
    BiliClient.prefs.v947sectionAutoHeader947 = !current
    AppToast.show(this, "Section Auto Header947: ${if (!current) "ON" else "OFF"}")
}

// v947: Secure Auto Lock947
internal fun PlayerActivity.showV947SecureAutoLock947Toggle() {
    val current = BiliClient.prefs.v947secureAutoLock947
    BiliClient.prefs.v947secureAutoLock947 = !current
    AppToast.show(this, "Secure Auto Lock947: ${if (!current) "ON" else "OFF"}")
}

// v947: Seek Auto Frame947
internal fun PlayerActivity.showV947SeekAutoFrame947Toggle() {
    val current = BiliClient.prefs.v947seekAutoFrame947
    BiliClient.prefs.v947seekAutoFrame947 = !current
    AppToast.show(this, "Seek Auto Frame947: ${if (!current) "ON" else "OFF"}")
}

// v947: Segment Auto Merge947
internal fun PlayerActivity.showV947SegmentAutoMerge947Toggle() {
    val current = BiliClient.prefs.v947segmentAutoMerge947
    BiliClient.prefs.v947segmentAutoMerge947 = !current
    AppToast.show(this, "Segment Auto Merge947: ${if (!current) "ON" else "OFF"}")
}

// v947: Select Auto Multi947
internal fun PlayerActivity.showV947SelectAutoMulti947Toggle() {
    val current = BiliClient.prefs.v947selectAutoMulti947
    BiliClient.prefs.v947selectAutoMulti947 = !current
    AppToast.show(this, "Select Auto Multi947: ${if (!current) "ON" else "OFF"}")
}

// v947: Send Auto Batch947
internal fun PlayerActivity.showV947SendAutoBatch947Toggle() {
    val current = BiliClient.prefs.v947sendAutoBatch947
    BiliClient.prefs.v947sendAutoBatch947 = !current
    AppToast.show(this, "Send Auto Batch947: ${if (!current) "ON" else "OFF"}")
}

// v947: Sensor Auto Gyro947
internal fun PlayerActivity.showV947SensorAutoGyro947Toggle() {
    val current = BiliClient.prefs.v947sensorAutoGyro947
    BiliClient.prefs.v947sensorAutoGyro947 = !current
    AppToast.show(this, "Sensor Auto Gyro947: ${if (!current) "ON" else "OFF"}")
}

// v948: Scan Auto Barcode948
internal fun PlayerActivity.showV948ScanAutoBarcode948Toggle() {
    val current = BiliClient.prefs.v948scanAutoBarcode948
    BiliClient.prefs.v948scanAutoBarcode948 = !current
    AppToast.show(this, "Scan Auto Barcode948: ${if (!current) "ON" else "OFF"}")
}

// v948: Scene Auto Detect948
internal fun PlayerActivity.showV948SceneAutoDetect948Toggle() {
    val current = BiliClient.prefs.v948sceneAutoDetect948
    BiliClient.prefs.v948sceneAutoDetect948 = !current
    AppToast.show(this, "Scene Auto Detect948: ${if (!current) "ON" else "OFF"}")
}

// v948: Scheme Auto DeepLink948
internal fun PlayerActivity.showV948SchemeAutoDeepLink948Toggle() {
    val current = BiliClient.prefs.v948schemeAutoDeepLink948
    BiliClient.prefs.v948schemeAutoDeepLink948 = !current
    AppToast.show(this, "Scheme Auto DeepLink948: ${if (!current) "ON" else "OFF"}")
}

// v948: Scope Auto Lifecycle948
internal fun PlayerActivity.showV948ScopeAutoLifecycle948Toggle() {
    val current = BiliClient.prefs.v948scopeAutoLifecycle948
    BiliClient.prefs.v948scopeAutoLifecycle948 = !current
    AppToast.show(this, "Scope Auto Lifecycle948: ${if (!current) "ON" else "OFF"}")
}

// v948: Score Auto Weight948
internal fun PlayerActivity.showV948ScoreAutoWeight948Toggle() {
    val current = BiliClient.prefs.v948scoreAutoWeight948
    BiliClient.prefs.v948scoreAutoWeight948 = !current
    AppToast.show(this, "Score Auto Weight948: ${if (!current) "ON" else "OFF"}")
}

// v948: Screen Auto Brightness948
internal fun PlayerActivity.showV948ScreenAutoBrightness948Toggle() {
    val current = BiliClient.prefs.v948screenAutoBrightness948
    BiliClient.prefs.v948screenAutoBrightness948 = !current
    AppToast.show(this, "Screen Auto Brightness948: ${if (!current) "ON" else "OFF"}")
}

// v948: Scroll Auto Position948
internal fun PlayerActivity.showV948ScrollAutoPosition948Toggle() {
    val current = BiliClient.prefs.v948scrollAutoPosition948
    BiliClient.prefs.v948scrollAutoPosition948 = !current
    AppToast.show(this, "Scroll Auto Position948: ${if (!current) "ON" else "OFF"}")
}

// v948: Search Auto Suggest948
internal fun PlayerActivity.showV948SearchAutoSuggest948Toggle() {
    val current = BiliClient.prefs.v948searchAutoSuggest948
    BiliClient.prefs.v948searchAutoSuggest948 = !current
    AppToast.show(this, "Search Auto Suggest948: ${if (!current) "ON" else "OFF"}")
}

// v948: Section Auto Header948
internal fun PlayerActivity.showV948SectionAutoHeader948Toggle() {
    val current = BiliClient.prefs.v948sectionAutoHeader948
    BiliClient.prefs.v948sectionAutoHeader948 = !current
    AppToast.show(this, "Section Auto Header948: ${if (!current) "ON" else "OFF"}")
}

// v948: Secure Auto Lock948
internal fun PlayerActivity.showV948SecureAutoLock948Toggle() {
    val current = BiliClient.prefs.v948secureAutoLock948
    BiliClient.prefs.v948secureAutoLock948 = !current
    AppToast.show(this, "Secure Auto Lock948: ${if (!current) "ON" else "OFF"}")
}

// v948: Seek Auto Frame948
internal fun PlayerActivity.showV948SeekAutoFrame948Toggle() {
    val current = BiliClient.prefs.v948seekAutoFrame948
    BiliClient.prefs.v948seekAutoFrame948 = !current
    AppToast.show(this, "Seek Auto Frame948: ${if (!current) "ON" else "OFF"}")
}

// v948: Segment Auto Merge948
internal fun PlayerActivity.showV948SegmentAutoMerge948Toggle() {
    val current = BiliClient.prefs.v948segmentAutoMerge948
    BiliClient.prefs.v948segmentAutoMerge948 = !current
    AppToast.show(this, "Segment Auto Merge948: ${if (!current) "ON" else "OFF"}")
}

// v948: Select Auto Multi948
internal fun PlayerActivity.showV948SelectAutoMulti948Toggle() {
    val current = BiliClient.prefs.v948selectAutoMulti948
    BiliClient.prefs.v948selectAutoMulti948 = !current
    AppToast.show(this, "Select Auto Multi948: ${if (!current) "ON" else "OFF"}")
}

// v948: Send Auto Batch948
internal fun PlayerActivity.showV948SendAutoBatch948Toggle() {
    val current = BiliClient.prefs.v948sendAutoBatch948
    BiliClient.prefs.v948sendAutoBatch948 = !current
    AppToast.show(this, "Send Auto Batch948: ${if (!current) "ON" else "OFF"}")
}

// v948: Sensor Auto Gyro948
internal fun PlayerActivity.showV948SensorAutoGyro948Toggle() {
    val current = BiliClient.prefs.v948sensorAutoGyro948
    BiliClient.prefs.v948sensorAutoGyro948 = !current
    AppToast.show(this, "Sensor Auto Gyro948: ${if (!current) "ON" else "OFF"}")
}

// v949: Scan Auto Barcode949
internal fun PlayerActivity.showV949ScanAutoBarcode949Toggle() {
    val current = BiliClient.prefs.v949scanAutoBarcode949
    BiliClient.prefs.v949scanAutoBarcode949 = !current
    AppToast.show(this, "Scan Auto Barcode949: ${if (!current) "ON" else "OFF"}")
}

// v949: Scene Auto Detect949
internal fun PlayerActivity.showV949SceneAutoDetect949Toggle() {
    val current = BiliClient.prefs.v949sceneAutoDetect949
    BiliClient.prefs.v949sceneAutoDetect949 = !current
    AppToast.show(this, "Scene Auto Detect949: ${if (!current) "ON" else "OFF"}")
}

// v949: Scheme Auto DeepLink949
internal fun PlayerActivity.showV949SchemeAutoDeepLink949Toggle() {
    val current = BiliClient.prefs.v949schemeAutoDeepLink949
    BiliClient.prefs.v949schemeAutoDeepLink949 = !current
    AppToast.show(this, "Scheme Auto DeepLink949: ${if (!current) "ON" else "OFF"}")
}

// v949: Scope Auto Lifecycle949
internal fun PlayerActivity.showV949ScopeAutoLifecycle949Toggle() {
    val current = BiliClient.prefs.v949scopeAutoLifecycle949
    BiliClient.prefs.v949scopeAutoLifecycle949 = !current
    AppToast.show(this, "Scope Auto Lifecycle949: ${if (!current) "ON" else "OFF"}")
}

// v949: Score Auto Weight949
internal fun PlayerActivity.showV949ScoreAutoWeight949Toggle() {
    val current = BiliClient.prefs.v949scoreAutoWeight949
    BiliClient.prefs.v949scoreAutoWeight949 = !current
    AppToast.show(this, "Score Auto Weight949: ${if (!current) "ON" else "OFF"}")
}

// v949: Screen Auto Brightness949
internal fun PlayerActivity.showV949ScreenAutoBrightness949Toggle() {
    val current = BiliClient.prefs.v949screenAutoBrightness949
    BiliClient.prefs.v949screenAutoBrightness949 = !current
    AppToast.show(this, "Screen Auto Brightness949: ${if (!current) "ON" else "OFF"}")
}

// v949: Scroll Auto Position949
internal fun PlayerActivity.showV949ScrollAutoPosition949Toggle() {
    val current = BiliClient.prefs.v949scrollAutoPosition949
    BiliClient.prefs.v949scrollAutoPosition949 = !current
    AppToast.show(this, "Scroll Auto Position949: ${if (!current) "ON" else "OFF"}")
}

// v949: Search Auto Suggest949
internal fun PlayerActivity.showV949SearchAutoSuggest949Toggle() {
    val current = BiliClient.prefs.v949searchAutoSuggest949
    BiliClient.prefs.v949searchAutoSuggest949 = !current
    AppToast.show(this, "Search Auto Suggest949: ${if (!current) "ON" else "OFF"}")
}

// v949: Section Auto Header949
internal fun PlayerActivity.showV949SectionAutoHeader949Toggle() {
    val current = BiliClient.prefs.v949sectionAutoHeader949
    BiliClient.prefs.v949sectionAutoHeader949 = !current
    AppToast.show(this, "Section Auto Header949: ${if (!current) "ON" else "OFF"}")
}

// v949: Secure Auto Lock949
internal fun PlayerActivity.showV949SecureAutoLock949Toggle() {
    val current = BiliClient.prefs.v949secureAutoLock949
    BiliClient.prefs.v949secureAutoLock949 = !current
    AppToast.show(this, "Secure Auto Lock949: ${if (!current) "ON" else "OFF"}")
}

// v949: Seek Auto Frame949
internal fun PlayerActivity.showV949SeekAutoFrame949Toggle() {
    val current = BiliClient.prefs.v949seekAutoFrame949
    BiliClient.prefs.v949seekAutoFrame949 = !current
    AppToast.show(this, "Seek Auto Frame949: ${if (!current) "ON" else "OFF"}")
}

// v949: Segment Auto Merge949
internal fun PlayerActivity.showV949SegmentAutoMerge949Toggle() {
    val current = BiliClient.prefs.v949segmentAutoMerge949
    BiliClient.prefs.v949segmentAutoMerge949 = !current
    AppToast.show(this, "Segment Auto Merge949: ${if (!current) "ON" else "OFF"}")
}

// v949: Select Auto Multi949
internal fun PlayerActivity.showV949SelectAutoMulti949Toggle() {
    val current = BiliClient.prefs.v949selectAutoMulti949
    BiliClient.prefs.v949selectAutoMulti949 = !current
    AppToast.show(this, "Select Auto Multi949: ${if (!current) "ON" else "OFF"}")
}

// v949: Send Auto Batch949
internal fun PlayerActivity.showV949SendAutoBatch949Toggle() {
    val current = BiliClient.prefs.v949sendAutoBatch949
    BiliClient.prefs.v949sendAutoBatch949 = !current
    AppToast.show(this, "Send Auto Batch949: ${if (!current) "ON" else "OFF"}")
}

// v949: Sensor Auto Gyro949
internal fun PlayerActivity.showV949SensorAutoGyro949Toggle() {
    val current = BiliClient.prefs.v949sensorAutoGyro949
    BiliClient.prefs.v949sensorAutoGyro949 = !current
    AppToast.show(this, "Sensor Auto Gyro949: ${if (!current) "ON" else "OFF"}")
}

// v950: Scan Auto Barcode950
internal fun PlayerActivity.showV950ScanAutoBarcode950Toggle() {
    val current = BiliClient.prefs.v950scanAutoBarcode950
    BiliClient.prefs.v950scanAutoBarcode950 = !current
    AppToast.show(this, "Scan Auto Barcode950: ${if (!current) "ON" else "OFF"}")
}

// v950: Scene Auto Detect950
internal fun PlayerActivity.showV950SceneAutoDetect950Toggle() {
    val current = BiliClient.prefs.v950sceneAutoDetect950
    BiliClient.prefs.v950sceneAutoDetect950 = !current
    AppToast.show(this, "Scene Auto Detect950: ${if (!current) "ON" else "OFF"}")
}

// v950: Scheme Auto DeepLink950
internal fun PlayerActivity.showV950SchemeAutoDeepLink950Toggle() {
    val current = BiliClient.prefs.v950schemeAutoDeepLink950
    BiliClient.prefs.v950schemeAutoDeepLink950 = !current
    AppToast.show(this, "Scheme Auto DeepLink950: ${if (!current) "ON" else "OFF"}")
}

// v950: Scope Auto Lifecycle950
internal fun PlayerActivity.showV950ScopeAutoLifecycle950Toggle() {
    val current = BiliClient.prefs.v950scopeAutoLifecycle950
    BiliClient.prefs.v950scopeAutoLifecycle950 = !current
    AppToast.show(this, "Scope Auto Lifecycle950: ${if (!current) "ON" else "OFF"}")
}

// v950: Score Auto Weight950
internal fun PlayerActivity.showV950ScoreAutoWeight950Toggle() {
    val current = BiliClient.prefs.v950scoreAutoWeight950
    BiliClient.prefs.v950scoreAutoWeight950 = !current
    AppToast.show(this, "Score Auto Weight950: ${if (!current) "ON" else "OFF"}")
}

// v950: Screen Auto Brightness950
internal fun PlayerActivity.showV950ScreenAutoBrightness950Toggle() {
    val current = BiliClient.prefs.v950screenAutoBrightness950
    BiliClient.prefs.v950screenAutoBrightness950 = !current
    AppToast.show(this, "Screen Auto Brightness950: ${if (!current) "ON" else "OFF"}")
}

// v950: Scroll Auto Position950
internal fun PlayerActivity.showV950ScrollAutoPosition950Toggle() {
    val current = BiliClient.prefs.v950scrollAutoPosition950
    BiliClient.prefs.v950scrollAutoPosition950 = !current
    AppToast.show(this, "Scroll Auto Position950: ${if (!current) "ON" else "OFF"}")
}

// v950: Search Auto Suggest950
internal fun PlayerActivity.showV950SearchAutoSuggest950Toggle() {
    val current = BiliClient.prefs.v950searchAutoSuggest950
    BiliClient.prefs.v950searchAutoSuggest950 = !current
    AppToast.show(this, "Search Auto Suggest950: ${if (!current) "ON" else "OFF"}")
}

// v950: Section Auto Header950
internal fun PlayerActivity.showV950SectionAutoHeader950Toggle() {
    val current = BiliClient.prefs.v950sectionAutoHeader950
    BiliClient.prefs.v950sectionAutoHeader950 = !current
    AppToast.show(this, "Section Auto Header950: ${if (!current) "ON" else "OFF"}")
}

// v950: Secure Auto Lock950
internal fun PlayerActivity.showV950SecureAutoLock950Toggle() {
    val current = BiliClient.prefs.v950secureAutoLock950
    BiliClient.prefs.v950secureAutoLock950 = !current
    AppToast.show(this, "Secure Auto Lock950: ${if (!current) "ON" else "OFF"}")
}

// v950: Seek Auto Frame950
internal fun PlayerActivity.showV950SeekAutoFrame950Toggle() {
    val current = BiliClient.prefs.v950seekAutoFrame950
    BiliClient.prefs.v950seekAutoFrame950 = !current
    AppToast.show(this, "Seek Auto Frame950: ${if (!current) "ON" else "OFF"}")
}

// v950: Segment Auto Merge950
internal fun PlayerActivity.showV950SegmentAutoMerge950Toggle() {
    val current = BiliClient.prefs.v950segmentAutoMerge950
    BiliClient.prefs.v950segmentAutoMerge950 = !current
    AppToast.show(this, "Segment Auto Merge950: ${if (!current) "ON" else "OFF"}")
}

// v950: Select Auto Multi950
internal fun PlayerActivity.showV950SelectAutoMulti950Toggle() {
    val current = BiliClient.prefs.v950selectAutoMulti950
    BiliClient.prefs.v950selectAutoMulti950 = !current
    AppToast.show(this, "Select Auto Multi950: ${if (!current) "ON" else "OFF"}")
}

// v950: Send Auto Batch950
internal fun PlayerActivity.showV950SendAutoBatch950Toggle() {
    val current = BiliClient.prefs.v950sendAutoBatch950
    BiliClient.prefs.v950sendAutoBatch950 = !current
    AppToast.show(this, "Send Auto Batch950: ${if (!current) "ON" else "OFF"}")
}

// v950: Sensor Auto Gyro950
internal fun PlayerActivity.showV950SensorAutoGyro950Toggle() {
    val current = BiliClient.prefs.v950sensorAutoGyro950
    BiliClient.prefs.v950sensorAutoGyro950 = !current
    AppToast.show(this, "Sensor Auto Gyro950: ${if (!current) "ON" else "OFF"}")
}

