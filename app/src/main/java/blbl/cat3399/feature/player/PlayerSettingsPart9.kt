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

internal fun PlayerActivity.showV216DanmakuBottomMaxCount240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v216danmakuBottomMaxCount240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v216danmakuBottomMaxCount240 = value
        AppToast.show(this, "Danmaku Bottom Max Count240: $value")
    }
// v217: Danmaku Bottom Max Count241


internal fun PlayerActivity.showV217DanmakuBottomMaxCount241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v217danmakuBottomMaxCount241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v217danmakuBottomMaxCount241 = value
        AppToast.show(this, "Danmaku Bottom Max Count241: $value")
    }
// v217: Gesture Shake Action217


internal fun PlayerActivity.showV217GestureShakeAction217Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v217gestureShakeAction217).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action217",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v217gestureShakeAction217 = value
        AppToast.show(this, "Gesture Shake Action217: $value")
    }
// v217: Cast Audio Volume217


internal fun PlayerActivity.showV217CastAudioVolume217Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v217castAudioVolume217).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume217",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v217castAudioVolume217 = value
        AppToast.show(this, "Cast Audio Volume217: $value")
    }
// v217: Cache Download Speed218


internal fun PlayerActivity.showV217CacheDownloadSpeed218Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v217cacheDownloadSpeed218).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed218",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v217cacheDownloadSpeed218 = value
        AppToast.show(this, "Cache Download Speed218: $value")
    }
// v217: Video Color Space217


internal fun PlayerActivity.showV217VideoColorSpace217Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v217videoColorSpace217).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space217",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v217videoColorSpace217 = value
        AppToast.show(this, "Video Color Space217: $value")
    }
// v217: Danmaku Bottom Max Count242


internal fun PlayerActivity.showV217DanmakuBottomMaxCount242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v217danmakuBottomMaxCount242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v217danmakuBottomMaxCount242 = value
        AppToast.show(this, "Danmaku Bottom Max Count242: $value")
    }
// v218: Danmaku Bottom Max Count243


internal fun PlayerActivity.showV218DanmakuBottomMaxCount243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v218danmakuBottomMaxCount243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v218danmakuBottomMaxCount243 = value
        AppToast.show(this, "Danmaku Bottom Max Count243: $value")
    }
// v218: Gesture Shake Action218


internal fun PlayerActivity.showV218GestureShakeAction218Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v218gestureShakeAction218).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action218",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v218gestureShakeAction218 = value
        AppToast.show(this, "Gesture Shake Action218: $value")
    }
// v218: Cast Audio Volume218


internal fun PlayerActivity.showV218CastAudioVolume218Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v218castAudioVolume218).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume218",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v218castAudioVolume218 = value
        AppToast.show(this, "Cast Audio Volume218: $value")
    }
// v218: Cache Download Speed219


internal fun PlayerActivity.showV218CacheDownloadSpeed219Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v218cacheDownloadSpeed219).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed219",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v218cacheDownloadSpeed219 = value
        AppToast.show(this, "Cache Download Speed219: $value")
    }
// v218: Video Color Space218


internal fun PlayerActivity.showV218VideoColorSpace218Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v218videoColorSpace218).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space218",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v218videoColorSpace218 = value
        AppToast.show(this, "Video Color Space218: $value")
    }
// v218: Danmaku Bottom Max Count244


internal fun PlayerActivity.showV218DanmakuBottomMaxCount244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v218danmakuBottomMaxCount244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v218danmakuBottomMaxCount244 = value
        AppToast.show(this, "Danmaku Bottom Max Count244: $value")
    }
// v219: Danmaku Bottom Max Count245


internal fun PlayerActivity.showV219DanmakuBottomMaxCount245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v219danmakuBottomMaxCount245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v219danmakuBottomMaxCount245 = value
        AppToast.show(this, "Danmaku Bottom Max Count245: $value")
    }
// v219: Gesture Shake Action219


internal fun PlayerActivity.showV219GestureShakeAction219Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v219gestureShakeAction219).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action219",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v219gestureShakeAction219 = value
        AppToast.show(this, "Gesture Shake Action219: $value")
    }
// v219: Cast Audio Volume219


internal fun PlayerActivity.showV219CastAudioVolume219Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v219castAudioVolume219).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume219",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v219castAudioVolume219 = value
        AppToast.show(this, "Cast Audio Volume219: $value")
    }
// v219: Cache Download Speed220


internal fun PlayerActivity.showV219CacheDownloadSpeed220Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v219cacheDownloadSpeed220).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed220",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v219cacheDownloadSpeed220 = value
        AppToast.show(this, "Cache Download Speed220: $value")
    }
// v219: Video Color Space219


internal fun PlayerActivity.showV219VideoColorSpace219Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v219videoColorSpace219).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space219",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v219videoColorSpace219 = value
        AppToast.show(this, "Video Color Space219: $value")
    }
// v219: Danmaku Bottom Max Count246


internal fun PlayerActivity.showV219DanmakuBottomMaxCount246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v219danmakuBottomMaxCount246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v219danmakuBottomMaxCount246 = value
        AppToast.show(this, "Danmaku Bottom Max Count246: $value")
    }
// v220: Danmaku Bottom Max Count247


internal fun PlayerActivity.showV220DanmakuBottomMaxCount247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v220danmakuBottomMaxCount247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v220danmakuBottomMaxCount247 = value
        AppToast.show(this, "Danmaku Bottom Max Count247: $value")
    }
// v220: Gesture Shake Action220


internal fun PlayerActivity.showV220GestureShakeAction220Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v220gestureShakeAction220).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action220",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v220gestureShakeAction220 = value
        AppToast.show(this, "Gesture Shake Action220: $value")
    }
// v220: Cast Audio Volume220


internal fun PlayerActivity.showV220CastAudioVolume220Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v220castAudioVolume220).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume220",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v220castAudioVolume220 = value
        AppToast.show(this, "Cast Audio Volume220: $value")
    }
// v220: Cache Download Speed221


internal fun PlayerActivity.showV220CacheDownloadSpeed221Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v220cacheDownloadSpeed221).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed221",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v220cacheDownloadSpeed221 = value
        AppToast.show(this, "Cache Download Speed221: $value")
    }
// v220: Video Color Space220


internal fun PlayerActivity.showV220VideoColorSpace220Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v220videoColorSpace220).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space220",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v220videoColorSpace220 = value
        AppToast.show(this, "Video Color Space220: $value")
    }
// v220: Danmaku Bottom Max Count248


internal fun PlayerActivity.showV220DanmakuBottomMaxCount248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v220danmakuBottomMaxCount248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v220danmakuBottomMaxCount248 = value
        AppToast.show(this, "Danmaku Bottom Max Count248: $value")
    }
// v221: Danmaku Bottom Max Count249


internal fun PlayerActivity.showV221DanmakuBottomMaxCount249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v221danmakuBottomMaxCount249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v221danmakuBottomMaxCount249 = value
        AppToast.show(this, "Danmaku Bottom Max Count249: $value")
    }
// v221: Gesture Shake Action221


internal fun PlayerActivity.showV221GestureShakeAction221Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v221gestureShakeAction221).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action221",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v221gestureShakeAction221 = value
        AppToast.show(this, "Gesture Shake Action221: $value")
    }
// v221: Cast Audio Volume221


internal fun PlayerActivity.showV221CastAudioVolume221Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v221castAudioVolume221).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume221",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v221castAudioVolume221 = value
        AppToast.show(this, "Cast Audio Volume221: $value")
    }
// v221: Cache Download Speed222


internal fun PlayerActivity.showV221CacheDownloadSpeed222Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v221cacheDownloadSpeed222).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed222",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v221cacheDownloadSpeed222 = value
        AppToast.show(this, "Cache Download Speed222: $value")
    }
// v221: Video Color Space221


internal fun PlayerActivity.showV221VideoColorSpace221Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v221videoColorSpace221).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space221",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v221videoColorSpace221 = value
        AppToast.show(this, "Video Color Space221: $value")
    }
// v221: Danmaku Bottom Max Count250


internal fun PlayerActivity.showV221DanmakuBottomMaxCount250Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v221danmakuBottomMaxCount250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v221danmakuBottomMaxCount250 = value
        AppToast.show(this, "Danmaku Bottom Max Count250: $value")
    }
// v222: Danmaku Bottom Max Count251


internal fun PlayerActivity.showV222DanmakuBottomMaxCount251Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v222danmakuBottomMaxCount251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v222danmakuBottomMaxCount251 = value
        AppToast.show(this, "Danmaku Bottom Max Count251: $value")
    }
// v222: Gesture Shake Action222


internal fun PlayerActivity.showV222GestureShakeAction222Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v222gestureShakeAction222).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action222",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v222gestureShakeAction222 = value
        AppToast.show(this, "Gesture Shake Action222: $value")
    }
// v222: Cast Audio Volume222


internal fun PlayerActivity.showV222CastAudioVolume222Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v222castAudioVolume222).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume222",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v222castAudioVolume222 = value
        AppToast.show(this, "Cast Audio Volume222: $value")
    }
// v222: Cache Download Speed223


internal fun PlayerActivity.showV222CacheDownloadSpeed223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v222cacheDownloadSpeed223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v222cacheDownloadSpeed223 = value
        AppToast.show(this, "Cache Download Speed223: $value")
    }
// v222: Video Color Space222


internal fun PlayerActivity.showV222VideoColorSpace222Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v222videoColorSpace222).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space222",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v222videoColorSpace222 = value
        AppToast.show(this, "Video Color Space222: $value")
    }
// v222: Danmaku Bottom Max Count252


internal fun PlayerActivity.showV222DanmakuBottomMaxCount252Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v222danmakuBottomMaxCount252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v222danmakuBottomMaxCount252 = value
        AppToast.show(this, "Danmaku Bottom Max Count252: $value")
    }
// v223: Danmaku Bottom Max Count253


internal fun PlayerActivity.showV223DanmakuBottomMaxCount253Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223danmakuBottomMaxCount253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223danmakuBottomMaxCount253 = value
        AppToast.show(this, "Danmaku Bottom Max Count253: $value")
    }
// v223: Gesture Shake Action223


internal fun PlayerActivity.showV223GestureShakeAction223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223gestureShakeAction223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223gestureShakeAction223 = value
        AppToast.show(this, "Gesture Shake Action223: $value")
    }
// v223: Cast Audio Volume223


internal fun PlayerActivity.showV223CastAudioVolume223Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v223castAudioVolume223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223castAudioVolume223 = value
        AppToast.show(this, "Cast Audio Volume223: $value")
    }
// v223: Cache Download Speed224


internal fun PlayerActivity.showV223CacheDownloadSpeed224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223cacheDownloadSpeed224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223cacheDownloadSpeed224 = value
        AppToast.show(this, "Cache Download Speed224: $value")
    }
// v223: Video Color Space223


internal fun PlayerActivity.showV223VideoColorSpace223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223videoColorSpace223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223videoColorSpace223 = value
        AppToast.show(this, "Video Color Space223: $value")
    }
// v223: Danmaku Bottom Max Count254


internal fun PlayerActivity.showV223DanmakuBottomMaxCount254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223danmakuBottomMaxCount254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223danmakuBottomMaxCount254 = value
        AppToast.show(this, "Danmaku Bottom Max Count254: $value")
    }
// v224: Danmaku Bottom Max Count255


internal fun PlayerActivity.showV224DanmakuBottomMaxCount255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224danmakuBottomMaxCount255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224danmakuBottomMaxCount255 = value
        AppToast.show(this, "Danmaku Bottom Max Count255: $value")
    }
// v224: Gesture Shake Action224


internal fun PlayerActivity.showV224GestureShakeAction224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224gestureShakeAction224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224gestureShakeAction224 = value
        AppToast.show(this, "Gesture Shake Action224: $value")
    }
// v224: Cast Audio Volume224


internal fun PlayerActivity.showV224CastAudioVolume224Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v224castAudioVolume224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224castAudioVolume224 = value
        AppToast.show(this, "Cast Audio Volume224: $value")
    }
// v224: Cache Download Speed225


internal fun PlayerActivity.showV224CacheDownloadSpeed225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224cacheDownloadSpeed225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224cacheDownloadSpeed225 = value
        AppToast.show(this, "Cache Download Speed225: $value")
    }
// v224: Video Color Space224


internal fun PlayerActivity.showV224VideoColorSpace224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224videoColorSpace224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224videoColorSpace224 = value
        AppToast.show(this, "Video Color Space224: $value")
    }
// v224: Danmaku Bottom Max Count256


internal fun PlayerActivity.showV224DanmakuBottomMaxCount256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224danmakuBottomMaxCount256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224danmakuBottomMaxCount256 = value
        AppToast.show(this, "Danmaku Bottom Max Count256: $value")
    }
// v225: Danmaku Bottom Max Count257


internal fun PlayerActivity.showV225DanmakuBottomMaxCount257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225danmakuBottomMaxCount257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225danmakuBottomMaxCount257 = value
        AppToast.show(this, "Danmaku Bottom Max Count257: $value")
    }
// v225: Gesture Shake Action225


internal fun PlayerActivity.showV225GestureShakeAction225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225gestureShakeAction225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225gestureShakeAction225 = value
        AppToast.show(this, "Gesture Shake Action225: $value")
    }
// v225: Cast Audio Volume225


internal fun PlayerActivity.showV225CastAudioVolume225Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v225castAudioVolume225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225castAudioVolume225 = value
        AppToast.show(this, "Cast Audio Volume225: $value")
    }
// v225: Cache Download Speed226


internal fun PlayerActivity.showV225CacheDownloadSpeed226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225cacheDownloadSpeed226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225cacheDownloadSpeed226 = value
        AppToast.show(this, "Cache Download Speed226: $value")
    }
// v225: Video Color Space225


internal fun PlayerActivity.showV225VideoColorSpace225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225videoColorSpace225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225videoColorSpace225 = value
        AppToast.show(this, "Video Color Space225: $value")
    }
// v225: Danmaku Bottom Max Count258


internal fun PlayerActivity.showV225DanmakuBottomMaxCount258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225danmakuBottomMaxCount258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225danmakuBottomMaxCount258 = value
        AppToast.show(this, "Danmaku Bottom Max Count258: $value")
    }
// v226: Danmaku Bottom Max Count259


internal fun PlayerActivity.showV226DanmakuBottomMaxCount259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226danmakuBottomMaxCount259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226danmakuBottomMaxCount259 = value
        AppToast.show(this, "Danmaku Bottom Max Count259: $value")
    }
// v226: Gesture Shake Action226


internal fun PlayerActivity.showV226GestureShakeAction226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226gestureShakeAction226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226gestureShakeAction226 = value
        AppToast.show(this, "Gesture Shake Action226: $value")
    }
// v226: Cast Audio Volume226


internal fun PlayerActivity.showV226CastAudioVolume226Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v226castAudioVolume226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226castAudioVolume226 = value
        AppToast.show(this, "Cast Audio Volume226: $value")
    }
// v226: Cache Download Speed227


internal fun PlayerActivity.showV226CacheDownloadSpeed227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226cacheDownloadSpeed227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226cacheDownloadSpeed227 = value
        AppToast.show(this, "Cache Download Speed227: $value")
    }
// v226: Video Color Space226


internal fun PlayerActivity.showV226VideoColorSpace226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226videoColorSpace226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226videoColorSpace226 = value
        AppToast.show(this, "Video Color Space226: $value")
    }
// v226: Danmaku Bottom Max Count260


internal fun PlayerActivity.showV226DanmakuBottomMaxCount260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226danmakuBottomMaxCount260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226danmakuBottomMaxCount260 = value
        AppToast.show(this, "Danmaku Bottom Max Count260: $value")
    }
// v227: Danmaku Bottom Max Count261


internal fun PlayerActivity.showV227DanmakuBottomMaxCount261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227danmakuBottomMaxCount261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227danmakuBottomMaxCount261 = value
        AppToast.show(this, "Danmaku Bottom Max Count261: $value")
    }
// v227: Gesture Shake Action227


internal fun PlayerActivity.showV227GestureShakeAction227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227gestureShakeAction227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227gestureShakeAction227 = value
        AppToast.show(this, "Gesture Shake Action227: $value")
    }
// v227: Cast Audio Volume227


internal fun PlayerActivity.showV227CastAudioVolume227Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v227castAudioVolume227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227castAudioVolume227 = value
        AppToast.show(this, "Cast Audio Volume227: $value")
    }
// v227: Cache Download Speed228


internal fun PlayerActivity.showV227CacheDownloadSpeed228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227cacheDownloadSpeed228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227cacheDownloadSpeed228 = value
        AppToast.show(this, "Cache Download Speed228: $value")
    }
// v227: Video Color Space227


internal fun PlayerActivity.showV227VideoColorSpace227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227videoColorSpace227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227videoColorSpace227 = value
        AppToast.show(this, "Video Color Space227: $value")
    }
// v227: Danmaku Bottom Max Count262


internal fun PlayerActivity.showV227DanmakuBottomMaxCount262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227danmakuBottomMaxCount262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227danmakuBottomMaxCount262 = value
        AppToast.show(this, "Danmaku Bottom Max Count262: $value")
    }
// v228: Danmaku Bottom Max Count263


internal fun PlayerActivity.showV228DanmakuBottomMaxCount263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228danmakuBottomMaxCount263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228danmakuBottomMaxCount263 = value
        AppToast.show(this, "Danmaku Bottom Max Count263: $value")
    }
// v228: Gesture Shake Action228


internal fun PlayerActivity.showV228GestureShakeAction228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228gestureShakeAction228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228gestureShakeAction228 = value
        AppToast.show(this, "Gesture Shake Action228: $value")
    }
// v228: Cast Audio Volume228


internal fun PlayerActivity.showV228CastAudioVolume228Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v228castAudioVolume228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228castAudioVolume228 = value
        AppToast.show(this, "Cast Audio Volume228: $value")
    }
// v228: Cache Download Speed229


internal fun PlayerActivity.showV228CacheDownloadSpeed229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228cacheDownloadSpeed229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228cacheDownloadSpeed229 = value
        AppToast.show(this, "Cache Download Speed229: $value")
    }
// v228: Video Color Space228


internal fun PlayerActivity.showV228VideoColorSpace228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228videoColorSpace228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228videoColorSpace228 = value
        AppToast.show(this, "Video Color Space228: $value")
    }
// v228: Danmaku Bottom Max Count264


internal fun PlayerActivity.showV228DanmakuBottomMaxCount264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228danmakuBottomMaxCount264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228danmakuBottomMaxCount264 = value
        AppToast.show(this, "Danmaku Bottom Max Count264: $value")
    }
// v229: Danmaku Bottom Max Count265


internal fun PlayerActivity.showV229DanmakuBottomMaxCount265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229danmakuBottomMaxCount265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229danmakuBottomMaxCount265 = value
        AppToast.show(this, "Danmaku Bottom Max Count265: $value")
    }
// v229: Gesture Shake Action229


internal fun PlayerActivity.showV229GestureShakeAction229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229gestureShakeAction229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229gestureShakeAction229 = value
        AppToast.show(this, "Gesture Shake Action229: $value")
    }
// v229: Cast Audio Volume229


internal fun PlayerActivity.showV229CastAudioVolume229Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v229castAudioVolume229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229castAudioVolume229 = value
        AppToast.show(this, "Cast Audio Volume229: $value")
    }
// v229: Cache Download Speed230


internal fun PlayerActivity.showV229CacheDownloadSpeed230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229cacheDownloadSpeed230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229cacheDownloadSpeed230 = value
        AppToast.show(this, "Cache Download Speed230: $value")
    }
// v229: Video Color Space229


internal fun PlayerActivity.showV229VideoColorSpace229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229videoColorSpace229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229videoColorSpace229 = value
        AppToast.show(this, "Video Color Space229: $value")
    }
// v229: Danmaku Bottom Max Count266


internal fun PlayerActivity.showV229DanmakuBottomMaxCount266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229danmakuBottomMaxCount266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229danmakuBottomMaxCount266 = value
        AppToast.show(this, "Danmaku Bottom Max Count266: $value")
    }
// v230: Danmaku Bottom Max Count267


internal fun PlayerActivity.showV230DanmakuBottomMaxCount267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230danmakuBottomMaxCount267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230danmakuBottomMaxCount267 = value
        AppToast.show(this, "Danmaku Bottom Max Count267: $value")
    }
// v230: Gesture Shake Action230


internal fun PlayerActivity.showV230GestureShakeAction230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230gestureShakeAction230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230gestureShakeAction230 = value
        AppToast.show(this, "Gesture Shake Action230: $value")
    }
// v230: Cast Audio Volume230


internal fun PlayerActivity.showV230CastAudioVolume230Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v230castAudioVolume230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230castAudioVolume230 = value
        AppToast.show(this, "Cast Audio Volume230: $value")
    }
// v230: Cache Download Speed231


internal fun PlayerActivity.showV230CacheDownloadSpeed231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230cacheDownloadSpeed231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230cacheDownloadSpeed231 = value
        AppToast.show(this, "Cache Download Speed231: $value")
    }
// v230: Video Color Space230


internal fun PlayerActivity.showV230VideoColorSpace230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230videoColorSpace230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230videoColorSpace230 = value
        AppToast.show(this, "Video Color Space230: $value")
    }
// v230: Danmaku Bottom Max Count268


internal fun PlayerActivity.showV230DanmakuBottomMaxCount268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230danmakuBottomMaxCount268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230danmakuBottomMaxCount268 = value
        AppToast.show(this, "Danmaku Bottom Max Count268: $value")
    }
// v231: Danmaku Bottom Max Count269


internal fun PlayerActivity.showV231DanmakuBottomMaxCount269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231danmakuBottomMaxCount269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231danmakuBottomMaxCount269 = value
        AppToast.show(this, "Danmaku Bottom Max Count269: $value")
    }
// v231: Gesture Shake Action231


internal fun PlayerActivity.showV231GestureShakeAction231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231gestureShakeAction231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231gestureShakeAction231 = value
        AppToast.show(this, "Gesture Shake Action231: $value")
    }
// v231: Cast Audio Volume231


internal fun PlayerActivity.showV231CastAudioVolume231Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v231castAudioVolume231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231castAudioVolume231 = value
        AppToast.show(this, "Cast Audio Volume231: $value")
    }
// v231: Cache Download Speed232


internal fun PlayerActivity.showV231CacheDownloadSpeed232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231cacheDownloadSpeed232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231cacheDownloadSpeed232 = value
        AppToast.show(this, "Cache Download Speed232: $value")
    }
// v231: Video Color Space231


internal fun PlayerActivity.showV231VideoColorSpace231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231videoColorSpace231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231videoColorSpace231 = value
        AppToast.show(this, "Video Color Space231: $value")
    }
// v231: Danmaku Bottom Max Count270


internal fun PlayerActivity.showV231DanmakuBottomMaxCount270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231danmakuBottomMaxCount270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231danmakuBottomMaxCount270 = value
        AppToast.show(this, "Danmaku Bottom Max Count270: $value")
    }
// v232: Danmaku Bottom Max Count271


internal fun PlayerActivity.showV232DanmakuBottomMaxCount271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232danmakuBottomMaxCount271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232danmakuBottomMaxCount271 = value
        AppToast.show(this, "Danmaku Bottom Max Count271: $value")
    }
// v232: Gesture Shake Action232


internal fun PlayerActivity.showV232GestureShakeAction232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232gestureShakeAction232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232gestureShakeAction232 = value
        AppToast.show(this, "Gesture Shake Action232: $value")
    }
// v232: Cast Audio Volume232


internal fun PlayerActivity.showV232CastAudioVolume232Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v232castAudioVolume232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232castAudioVolume232 = value
        AppToast.show(this, "Cast Audio Volume232: $value")
    }
// v232: Cache Download Speed233


internal fun PlayerActivity.showV232CacheDownloadSpeed233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232cacheDownloadSpeed233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232cacheDownloadSpeed233 = value
        AppToast.show(this, "Cache Download Speed233: $value")
    }
// v232: Video Color Space232


internal fun PlayerActivity.showV232VideoColorSpace232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232videoColorSpace232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232videoColorSpace232 = value
        AppToast.show(this, "Video Color Space232: $value")
    }
// v232: Danmaku Bottom Max Count272


internal fun PlayerActivity.showV232DanmakuBottomMaxCount272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232danmakuBottomMaxCount272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232danmakuBottomMaxCount272 = value
        AppToast.show(this, "Danmaku Bottom Max Count272: $value")
    }
// v233: Danmaku Bottom Max Count273


internal fun PlayerActivity.showV233DanmakuBottomMaxCount273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233danmakuBottomMaxCount273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233danmakuBottomMaxCount273 = value
        AppToast.show(this, "Danmaku Bottom Max Count273: $value")
    }
// v233: Gesture Shake Action233


internal fun PlayerActivity.showV233GestureShakeAction233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233gestureShakeAction233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233gestureShakeAction233 = value
        AppToast.show(this, "Gesture Shake Action233: $value")
    }
// v233: Cast Audio Volume233


internal fun PlayerActivity.showV233CastAudioVolume233Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v233castAudioVolume233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233castAudioVolume233 = value
        AppToast.show(this, "Cast Audio Volume233: $value")
    }
// v233: Cache Download Speed234


internal fun PlayerActivity.showV233CacheDownloadSpeed234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233cacheDownloadSpeed234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233cacheDownloadSpeed234 = value
        AppToast.show(this, "Cache Download Speed234: $value")
    }
// v233: Video Color Space233


internal fun PlayerActivity.showV233VideoColorSpace233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233videoColorSpace233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233videoColorSpace233 = value
        AppToast.show(this, "Video Color Space233: $value")
    }
// v233: Danmaku Bottom Max Count274


internal fun PlayerActivity.showV233DanmakuBottomMaxCount274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233danmakuBottomMaxCount274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233danmakuBottomMaxCount274 = value
        AppToast.show(this, "Danmaku Bottom Max Count274: $value")
    }
// v234: Danmaku Bottom Max Count275


internal fun PlayerActivity.showV234DanmakuBottomMaxCount275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234danmakuBottomMaxCount275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234danmakuBottomMaxCount275 = value
        AppToast.show(this, "Danmaku Bottom Max Count275: $value")
    }
// v234: Gesture Shake Action234


internal fun PlayerActivity.showV234GestureShakeAction234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234gestureShakeAction234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234gestureShakeAction234 = value
        AppToast.show(this, "Gesture Shake Action234: $value")
    }
// v234: Cast Audio Volume234


internal fun PlayerActivity.showV234CastAudioVolume234Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v234castAudioVolume234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234castAudioVolume234 = value
        AppToast.show(this, "Cast Audio Volume234: $value")
    }
// v234: Cache Download Speed235


internal fun PlayerActivity.showV234CacheDownloadSpeed235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234cacheDownloadSpeed235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234cacheDownloadSpeed235 = value
        AppToast.show(this, "Cache Download Speed235: $value")
    }
// v234: Video Color Space234


internal fun PlayerActivity.showV234VideoColorSpace234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234videoColorSpace234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234videoColorSpace234 = value
        AppToast.show(this, "Video Color Space234: $value")
    }
// v234: Danmaku Bottom Max Count276


internal fun PlayerActivity.showV234DanmakuBottomMaxCount276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234danmakuBottomMaxCount276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234danmakuBottomMaxCount276 = value
        AppToast.show(this, "Danmaku Bottom Max Count276: $value")
    }
// v235: Danmaku Bottom Max Count277


internal fun PlayerActivity.showV235DanmakuBottomMaxCount277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235danmakuBottomMaxCount277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235danmakuBottomMaxCount277 = value
        AppToast.show(this, "Danmaku Bottom Max Count277: $value")
    }
// v235: Gesture Shake Action235


internal fun PlayerActivity.showV235GestureShakeAction235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235gestureShakeAction235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235gestureShakeAction235 = value
        AppToast.show(this, "Gesture Shake Action235: $value")
    }
// v235: Cast Audio Volume235


internal fun PlayerActivity.showV235CastAudioVolume235Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v235castAudioVolume235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235castAudioVolume235 = value
        AppToast.show(this, "Cast Audio Volume235: $value")
    }
// v235: Cache Download Speed236


internal fun PlayerActivity.showV235CacheDownloadSpeed236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235cacheDownloadSpeed236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235cacheDownloadSpeed236 = value
        AppToast.show(this, "Cache Download Speed236: $value")
    }
// v235: Video Color Space235


internal fun PlayerActivity.showV235VideoColorSpace235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235videoColorSpace235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235videoColorSpace235 = value
        AppToast.show(this, "Video Color Space235: $value")
    }
// v235: Danmaku Bottom Max Count278


internal fun PlayerActivity.showV235DanmakuBottomMaxCount278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235danmakuBottomMaxCount278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235danmakuBottomMaxCount278 = value
        AppToast.show(this, "Danmaku Bottom Max Count278: $value")
    }
// v236: Danmaku Bottom Max Count279


internal fun PlayerActivity.showV236DanmakuBottomMaxCount279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236danmakuBottomMaxCount279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236danmakuBottomMaxCount279 = value
        AppToast.show(this, "Danmaku Bottom Max Count279: $value")
    }
// v236: Gesture Shake Action236


internal fun PlayerActivity.showV236GestureShakeAction236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236gestureShakeAction236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236gestureShakeAction236 = value
        AppToast.show(this, "Gesture Shake Action236: $value")
    }
// v236: Cast Audio Volume236


internal fun PlayerActivity.showV236CastAudioVolume236Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v236castAudioVolume236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236castAudioVolume236 = value
        AppToast.show(this, "Cast Audio Volume236: $value")
    }
// v236: Cache Download Speed237


internal fun PlayerActivity.showV236CacheDownloadSpeed237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236cacheDownloadSpeed237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236cacheDownloadSpeed237 = value
        AppToast.show(this, "Cache Download Speed237: $value")
    }
// v236: Video Color Space236


internal fun PlayerActivity.showV236VideoColorSpace236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236videoColorSpace236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236videoColorSpace236 = value
        AppToast.show(this, "Video Color Space236: $value")
    }
// v236: Danmaku Bottom Max Count280


internal fun PlayerActivity.showV236DanmakuBottomMaxCount280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236danmakuBottomMaxCount280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236danmakuBottomMaxCount280 = value
        AppToast.show(this, "Danmaku Bottom Max Count280: $value")
    }
// v237: Danmaku Bottom Max Count281


internal fun PlayerActivity.showV237DanmakuBottomMaxCount281Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237danmakuBottomMaxCount281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237danmakuBottomMaxCount281 = value
        AppToast.show(this, "Danmaku Bottom Max Count281: $value")
    }
// v237: Gesture Shake Action237


internal fun PlayerActivity.showV237GestureShakeAction237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237gestureShakeAction237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237gestureShakeAction237 = value
        AppToast.show(this, "Gesture Shake Action237: $value")
    }
// v237: Cast Audio Volume237


internal fun PlayerActivity.showV237CastAudioVolume237Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v237castAudioVolume237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237castAudioVolume237 = value
        AppToast.show(this, "Cast Audio Volume237: $value")
    }
// v237: Cache Download Speed238


internal fun PlayerActivity.showV237CacheDownloadSpeed238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237cacheDownloadSpeed238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237cacheDownloadSpeed238 = value
        AppToast.show(this, "Cache Download Speed238: $value")
    }
// v237: Video Color Space237


internal fun PlayerActivity.showV237VideoColorSpace237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237videoColorSpace237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237videoColorSpace237 = value
        AppToast.show(this, "Video Color Space237: $value")
    }
// v237: Danmaku Bottom Max Count282


internal fun PlayerActivity.showV237DanmakuBottomMaxCount282Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237danmakuBottomMaxCount282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237danmakuBottomMaxCount282 = value
        AppToast.show(this, "Danmaku Bottom Max Count282: $value")
    }
// v238: Danmaku Bottom Max Count283


internal fun PlayerActivity.showV238DanmakuBottomMaxCount283Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238danmakuBottomMaxCount283).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count283",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238danmakuBottomMaxCount283 = value
        AppToast.show(this, "Danmaku Bottom Max Count283: $value")
    }
// v238: Gesture Shake Action238


internal fun PlayerActivity.showV238GestureShakeAction238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238gestureShakeAction238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238gestureShakeAction238 = value
        AppToast.show(this, "Gesture Shake Action238: $value")
    }
// v238: Cast Audio Volume238


internal fun PlayerActivity.showV238CastAudioVolume238Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v238castAudioVolume238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238castAudioVolume238 = value
        AppToast.show(this, "Cast Audio Volume238: $value")
    }
// v238: Cache Download Speed239


internal fun PlayerActivity.showV238CacheDownloadSpeed239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238cacheDownloadSpeed239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238cacheDownloadSpeed239 = value
        AppToast.show(this, "Cache Download Speed239: $value")
    }
// v238: Video Color Space238


internal fun PlayerActivity.showV238VideoColorSpace238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238videoColorSpace238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238videoColorSpace238 = value
        AppToast.show(this, "Video Color Space238: $value")
    }
// v238: Danmaku Bottom Max Count284


internal fun PlayerActivity.showV238DanmakuBottomMaxCount284Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238danmakuBottomMaxCount284).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count284",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238danmakuBottomMaxCount284 = value
        AppToast.show(this, "Danmaku Bottom Max Count284: $value")
    }
// v239: Danmaku Bottom Max Count285


internal fun PlayerActivity.showV239DanmakuBottomMaxCount285Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239danmakuBottomMaxCount285).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count285",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239danmakuBottomMaxCount285 = value
        AppToast.show(this, "Danmaku Bottom Max Count285: $value")
    }
// v239: Gesture Shake Action239


internal fun PlayerActivity.showV239GestureShakeAction239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239gestureShakeAction239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239gestureShakeAction239 = value
        AppToast.show(this, "Gesture Shake Action239: $value")
    }
// v239: Cast Audio Volume239


internal fun PlayerActivity.showV239CastAudioVolume239Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v239castAudioVolume239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239castAudioVolume239 = value
        AppToast.show(this, "Cast Audio Volume239: $value")
    }
// v239: Cache Download Speed240


internal fun PlayerActivity.showV239CacheDownloadSpeed240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239cacheDownloadSpeed240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239cacheDownloadSpeed240 = value
        AppToast.show(this, "Cache Download Speed240: $value")
    }
// v239: Video Color Space239


internal fun PlayerActivity.showV239VideoColorSpace239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239videoColorSpace239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239videoColorSpace239 = value
        AppToast.show(this, "Video Color Space239: $value")
    }
// v239: Danmaku Bottom Max Count286


internal fun PlayerActivity.showV239DanmakuBottomMaxCount286Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239danmakuBottomMaxCount286).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count286",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239danmakuBottomMaxCount286 = value
        AppToast.show(this, "Danmaku Bottom Max Count286: $value")
    }
// v240: Danmaku Bottom Max Count287


internal fun PlayerActivity.showV240DanmakuBottomMaxCount287Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240danmakuBottomMaxCount287).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count287",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240danmakuBottomMaxCount287 = value
        AppToast.show(this, "Danmaku Bottom Max Count287: $value")
    }
// v240: Gesture Shake Action240


internal fun PlayerActivity.showV240GestureShakeAction240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240gestureShakeAction240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240gestureShakeAction240 = value
        AppToast.show(this, "Gesture Shake Action240: $value")
    }
// v240: Cast Audio Volume240


internal fun PlayerActivity.showV240CastAudioVolume240Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v240castAudioVolume240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240castAudioVolume240 = value
        AppToast.show(this, "Cast Audio Volume240: $value")
    }
// v240: Cache Download Speed241


internal fun PlayerActivity.showV240CacheDownloadSpeed241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240cacheDownloadSpeed241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240cacheDownloadSpeed241 = value
        AppToast.show(this, "Cache Download Speed241: $value")
    }
// v240: Video Color Space240


internal fun PlayerActivity.showV240VideoColorSpace240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240videoColorSpace240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240videoColorSpace240 = value
        AppToast.show(this, "Video Color Space240: $value")
    }
// v240: Danmaku Bottom Max Count288


internal fun PlayerActivity.showV240DanmakuBottomMaxCount288Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240danmakuBottomMaxCount288).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count288",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240danmakuBottomMaxCount288 = value
        AppToast.show(this, "Danmaku Bottom Max Count288: $value")
    }
// v241: Danmaku Bottom Max Count289


internal fun PlayerActivity.showV241DanmakuBottomMaxCount289Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241danmakuBottomMaxCount289).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count289",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241danmakuBottomMaxCount289 = value
        AppToast.show(this, "Danmaku Bottom Max Count289: $value")
    }
// v241: Gesture Shake Action241


internal fun PlayerActivity.showV241GestureShakeAction241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241gestureShakeAction241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241gestureShakeAction241 = value
        AppToast.show(this, "Gesture Shake Action241: $value")
    }
// v241: Cast Audio Volume241


internal fun PlayerActivity.showV241CastAudioVolume241Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v241castAudioVolume241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241castAudioVolume241 = value
        AppToast.show(this, "Cast Audio Volume241: $value")
    }
// v241: Cache Download Speed242


internal fun PlayerActivity.showV241CacheDownloadSpeed242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241cacheDownloadSpeed242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241cacheDownloadSpeed242 = value
        AppToast.show(this, "Cache Download Speed242: $value")
    }
// v241: Video Color Space241


internal fun PlayerActivity.showV241VideoColorSpace241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241videoColorSpace241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241videoColorSpace241 = value
        AppToast.show(this, "Video Color Space241: $value")
    }
// v241: Danmaku Bottom Max Count290


internal fun PlayerActivity.showV241DanmakuBottomMaxCount290Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241danmakuBottomMaxCount290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241danmakuBottomMaxCount290 = value
        AppToast.show(this, "Danmaku Bottom Max Count290: $value")
    }
// v242: Danmaku Bottom Max Count291


internal fun PlayerActivity.showV242DanmakuBottomMaxCount291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242danmakuBottomMaxCount291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242danmakuBottomMaxCount291 = value
        AppToast.show(this, "Danmaku Bottom Max Count291: $value")
    }
// v242: Gesture Shake Action242


internal fun PlayerActivity.showV242GestureShakeAction242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242gestureShakeAction242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242gestureShakeAction242 = value
        AppToast.show(this, "Gesture Shake Action242: $value")
    }
// v242: Cast Audio Volume242


internal fun PlayerActivity.showV242CastAudioVolume242Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v242castAudioVolume242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242castAudioVolume242 = value
        AppToast.show(this, "Cast Audio Volume242: $value")
    }
// v242: Cache Download Speed243


internal fun PlayerActivity.showV242CacheDownloadSpeed243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242cacheDownloadSpeed243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242cacheDownloadSpeed243 = value
        AppToast.show(this, "Cache Download Speed243: $value")
    }
// v242: Video Color Space242


internal fun PlayerActivity.showV242VideoColorSpace242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242videoColorSpace242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242videoColorSpace242 = value
        AppToast.show(this, "Video Color Space242: $value")
    }
// v242: Danmaku Bottom Max Count292


internal fun PlayerActivity.showV242DanmakuBottomMaxCount292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242danmakuBottomMaxCount292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242danmakuBottomMaxCount292 = value
        AppToast.show(this, "Danmaku Bottom Max Count292: $value")
    }
// v243: Danmaku Bottom Max Count293


internal fun PlayerActivity.showV243DanmakuBottomMaxCount293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243danmakuBottomMaxCount293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243danmakuBottomMaxCount293 = value
        AppToast.show(this, "Danmaku Bottom Max Count293: $value")
    }
// v243: Gesture Shake Action243


internal fun PlayerActivity.showV243GestureShakeAction243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243gestureShakeAction243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243gestureShakeAction243 = value
        AppToast.show(this, "Gesture Shake Action243: $value")
    }
// v243: Cast Audio Volume243


internal fun PlayerActivity.showV243CastAudioVolume243Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v243castAudioVolume243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243castAudioVolume243 = value
        AppToast.show(this, "Cast Audio Volume243: $value")
    }
// v243: Cache Download Speed244


internal fun PlayerActivity.showV243CacheDownloadSpeed244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243cacheDownloadSpeed244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243cacheDownloadSpeed244 = value
        AppToast.show(this, "Cache Download Speed244: $value")
    }
// v243: Video Color Space243


internal fun PlayerActivity.showV243VideoColorSpace243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243videoColorSpace243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243videoColorSpace243 = value
        AppToast.show(this, "Video Color Space243: $value")
    }
// v243: Danmaku Bottom Max Count294


internal fun PlayerActivity.showV243DanmakuBottomMaxCount294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243danmakuBottomMaxCount294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243danmakuBottomMaxCount294 = value
        AppToast.show(this, "Danmaku Bottom Max Count294: $value")
    }
// v244: Danmaku Bottom Max Count295


internal fun PlayerActivity.showV244DanmakuBottomMaxCount295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244danmakuBottomMaxCount295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244danmakuBottomMaxCount295 = value
        AppToast.show(this, "Danmaku Bottom Max Count295: $value")
    }
// v244: Gesture Shake Action244


internal fun PlayerActivity.showV244GestureShakeAction244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244gestureShakeAction244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244gestureShakeAction244 = value
        AppToast.show(this, "Gesture Shake Action244: $value")
    }
// v244: Cast Audio Volume244


internal fun PlayerActivity.showV244CastAudioVolume244Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v244castAudioVolume244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244castAudioVolume244 = value
        AppToast.show(this, "Cast Audio Volume244: $value")
    }
// v244: Cache Download Speed245


internal fun PlayerActivity.showV244CacheDownloadSpeed245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244cacheDownloadSpeed245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244cacheDownloadSpeed245 = value
        AppToast.show(this, "Cache Download Speed245: $value")
    }
// v244: Video Color Space244


internal fun PlayerActivity.showV244VideoColorSpace244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244videoColorSpace244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244videoColorSpace244 = value
        AppToast.show(this, "Video Color Space244: $value")
    }
// v244: Danmaku Bottom Max Count296


internal fun PlayerActivity.showV244DanmakuBottomMaxCount296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244danmakuBottomMaxCount296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244danmakuBottomMaxCount296 = value
        AppToast.show(this, "Danmaku Bottom Max Count296: $value")
    }
// v245: Danmaku Bottom Max Count297


internal fun PlayerActivity.showV245DanmakuBottomMaxCount297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245danmakuBottomMaxCount297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245danmakuBottomMaxCount297 = value
        AppToast.show(this, "Danmaku Bottom Max Count297: $value")
    }
// v245: Gesture Shake Action245


internal fun PlayerActivity.showV245GestureShakeAction245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245gestureShakeAction245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245gestureShakeAction245 = value
        AppToast.show(this, "Gesture Shake Action245: $value")
    }
// v245: Cast Audio Volume245


internal fun PlayerActivity.showV245CastAudioVolume245Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v245castAudioVolume245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245castAudioVolume245 = value
        AppToast.show(this, "Cast Audio Volume245: $value")
    }
// v245: Cache Download Speed246


internal fun PlayerActivity.showV245CacheDownloadSpeed246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245cacheDownloadSpeed246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245cacheDownloadSpeed246 = value
        AppToast.show(this, "Cache Download Speed246: $value")
    }
// v245: Video Color Space245


internal fun PlayerActivity.showV245VideoColorSpace245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245videoColorSpace245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245videoColorSpace245 = value
        AppToast.show(this, "Video Color Space245: $value")
    }
// v245: Danmaku Bottom Max Count298


internal fun PlayerActivity.showV245DanmakuBottomMaxCount298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245danmakuBottomMaxCount298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245danmakuBottomMaxCount298 = value
        AppToast.show(this, "Danmaku Bottom Max Count298: $value")
    }
// v246: Danmaku Bottom Max Count299


internal fun PlayerActivity.showV246DanmakuBottomMaxCount299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246danmakuBottomMaxCount299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246danmakuBottomMaxCount299 = value
        AppToast.show(this, "Danmaku Bottom Max Count299: $value")
    }
// v246: Gesture Shake Action246


internal fun PlayerActivity.showV246GestureShakeAction246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246gestureShakeAction246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246gestureShakeAction246 = value
        AppToast.show(this, "Gesture Shake Action246: $value")
    }
// v246: Cast Audio Volume246


internal fun PlayerActivity.showV246CastAudioVolume246Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v246castAudioVolume246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246castAudioVolume246 = value
        AppToast.show(this, "Cast Audio Volume246: $value")
    }
// v246: Cache Download Speed247


internal fun PlayerActivity.showV246CacheDownloadSpeed247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246cacheDownloadSpeed247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246cacheDownloadSpeed247 = value
        AppToast.show(this, "Cache Download Speed247: $value")
    }
// v246: Video Color Space246


internal fun PlayerActivity.showV246VideoColorSpace246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246videoColorSpace246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246videoColorSpace246 = value
        AppToast.show(this, "Video Color Space246: $value")
    }
// v246: Danmaku Bottom Max Count300


internal fun PlayerActivity.showV246DanmakuBottomMaxCount300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246danmakuBottomMaxCount300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246danmakuBottomMaxCount300 = value
        AppToast.show(this, "Danmaku Bottom Max Count300: $value")
    }
// v247: Danmaku Bottom Max Count301


internal fun PlayerActivity.showV247DanmakuBottomMaxCount301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247danmakuBottomMaxCount301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247danmakuBottomMaxCount301 = value
        AppToast.show(this, "Danmaku Bottom Max Count301: $value")
    }
// v247: Gesture Shake Action247


internal fun PlayerActivity.showV247GestureShakeAction247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247gestureShakeAction247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247gestureShakeAction247 = value
        AppToast.show(this, "Gesture Shake Action247: $value")
    }
// v247: Cast Audio Volume247


internal fun PlayerActivity.showV247CastAudioVolume247Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v247castAudioVolume247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247castAudioVolume247 = value
        AppToast.show(this, "Cast Audio Volume247: $value")
    }
// v247: Cache Download Speed248


internal fun PlayerActivity.showV247CacheDownloadSpeed248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247cacheDownloadSpeed248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247cacheDownloadSpeed248 = value
        AppToast.show(this, "Cache Download Speed248: $value")
    }
// v247: Video Color Space247


internal fun PlayerActivity.showV247VideoColorSpace247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247videoColorSpace247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247videoColorSpace247 = value
        AppToast.show(this, "Video Color Space247: $value")
    }
// v247: Danmaku Bottom Max Count302


internal fun PlayerActivity.showV247DanmakuBottomMaxCount302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247danmakuBottomMaxCount302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247danmakuBottomMaxCount302 = value
        AppToast.show(this, "Danmaku Bottom Max Count302: $value")
    }
// v248: Danmaku Bottom Max Count303


internal fun PlayerActivity.showV248DanmakuBottomMaxCount303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248danmakuBottomMaxCount303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248danmakuBottomMaxCount303 = value
        AppToast.show(this, "Danmaku Bottom Max Count303: $value")
    }
// v248: Gesture Shake Action248


internal fun PlayerActivity.showV248GestureShakeAction248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248gestureShakeAction248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248gestureShakeAction248 = value
        AppToast.show(this, "Gesture Shake Action248: $value")
    }
// v248: Cast Audio Volume248


internal fun PlayerActivity.showV248CastAudioVolume248Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v248castAudioVolume248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248castAudioVolume248 = value
        AppToast.show(this, "Cast Audio Volume248: $value")
    }
// v248: Cache Download Speed249


internal fun PlayerActivity.showV248CacheDownloadSpeed249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248cacheDownloadSpeed249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248cacheDownloadSpeed249 = value
        AppToast.show(this, "Cache Download Speed249: $value")
    }
// v248: Video Color Space248


internal fun PlayerActivity.showV248VideoColorSpace248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248videoColorSpace248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248videoColorSpace248 = value
        AppToast.show(this, "Video Color Space248: $value")
    }
// v248: Danmaku Bottom Max Count304


internal fun PlayerActivity.showV248DanmakuBottomMaxCount304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248danmakuBottomMaxCount304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248danmakuBottomMaxCount304 = value
        AppToast.show(this, "Danmaku Bottom Max Count304: $value")
    }
// v249: Danmaku Bottom Max Count305


internal fun PlayerActivity.showV249DanmakuBottomMaxCount305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249danmakuBottomMaxCount305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249danmakuBottomMaxCount305 = value
        AppToast.show(this, "Danmaku Bottom Max Count305: $value")
    }
// v249: Gesture Shake Action249


internal fun PlayerActivity.showV249GestureShakeAction249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249gestureShakeAction249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249gestureShakeAction249 = value
        AppToast.show(this, "Gesture Shake Action249: $value")
    }
// v249: Cast Audio Volume249


internal fun PlayerActivity.showV249CastAudioVolume249Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v249castAudioVolume249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249castAudioVolume249 = value
        AppToast.show(this, "Cast Audio Volume249: $value")
    }
// v249: Cache Download Speed250


internal fun PlayerActivity.showV249CacheDownloadSpeed250Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249cacheDownloadSpeed250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249cacheDownloadSpeed250 = value
        AppToast.show(this, "Cache Download Speed250: $value")
    }
// v249: Video Color Space249


internal fun PlayerActivity.showV249VideoColorSpace249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249videoColorSpace249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249videoColorSpace249 = value
        AppToast.show(this, "Video Color Space249: $value")
    }
// v249: Danmaku Bottom Max Count306


internal fun PlayerActivity.showV249DanmakuBottomMaxCount306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249danmakuBottomMaxCount306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249danmakuBottomMaxCount306 = value
        AppToast.show(this, "Danmaku Bottom Max Count306: $value")
    }
// v250: Danmaku Bottom Max Count307


internal fun PlayerActivity.showV250DanmakuBottomMaxCount307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250danmakuBottomMaxCount307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250danmakuBottomMaxCount307 = value
        AppToast.show(this, "Danmaku Bottom Max Count307: $value")
    }
// v250: Gesture Shake Action250


