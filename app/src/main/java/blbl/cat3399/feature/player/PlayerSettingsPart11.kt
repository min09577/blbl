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

internal fun PlayerActivity.showV283CacheDownloadSpeed284Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v283cacheDownloadSpeed284).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed284",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v283cacheDownloadSpeed284 = value
        AppToast.show(this, "Cache Download Speed284: $value")
    }
// v283: Video Color Space283


internal fun PlayerActivity.showV283VideoColorSpace283Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v283videoColorSpace283).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space283",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v283videoColorSpace283 = value
        AppToast.show(this, "Video Color Space283: $value")
    }
// v283: Danmaku Bottom Max Count374


internal fun PlayerActivity.showV283DanmakuBottomMaxCount374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v283danmakuBottomMaxCount374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v283danmakuBottomMaxCount374 = value
        AppToast.show(this, "Danmaku Bottom Max Count374: $value")
    }
// v284: Danmaku Bottom Max Count375


internal fun PlayerActivity.showV284DanmakuBottomMaxCount375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v284danmakuBottomMaxCount375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v284danmakuBottomMaxCount375 = value
        AppToast.show(this, "Danmaku Bottom Max Count375: $value")
    }
// v284: Gesture Shake Action284


internal fun PlayerActivity.showV284GestureShakeAction284Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v284gestureShakeAction284).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action284",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v284gestureShakeAction284 = value
        AppToast.show(this, "Gesture Shake Action284: $value")
    }
// v284: Cast Audio Volume284


internal fun PlayerActivity.showV284CastAudioVolume284Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v284castAudioVolume284).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume284",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v284castAudioVolume284 = value
        AppToast.show(this, "Cast Audio Volume284: $value")
    }
// v284: Cache Download Speed285


internal fun PlayerActivity.showV284CacheDownloadSpeed285Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v284cacheDownloadSpeed285).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed285",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v284cacheDownloadSpeed285 = value
        AppToast.show(this, "Cache Download Speed285: $value")
    }
// v284: Video Color Space284


internal fun PlayerActivity.showV284VideoColorSpace284Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v284videoColorSpace284).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space284",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v284videoColorSpace284 = value
        AppToast.show(this, "Video Color Space284: $value")
    }
// v284: Danmaku Bottom Max Count376


internal fun PlayerActivity.showV284DanmakuBottomMaxCount376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v284danmakuBottomMaxCount376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v284danmakuBottomMaxCount376 = value
        AppToast.show(this, "Danmaku Bottom Max Count376: $value")
    }
// v285: Danmaku Bottom Max Count377


internal fun PlayerActivity.showV285DanmakuBottomMaxCount377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v285danmakuBottomMaxCount377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v285danmakuBottomMaxCount377 = value
        AppToast.show(this, "Danmaku Bottom Max Count377: $value")
    }
// v285: Gesture Shake Action285


internal fun PlayerActivity.showV285GestureShakeAction285Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v285gestureShakeAction285).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action285",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v285gestureShakeAction285 = value
        AppToast.show(this, "Gesture Shake Action285: $value")
    }
// v285: Cast Audio Volume285


internal fun PlayerActivity.showV285CastAudioVolume285Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v285castAudioVolume285).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume285",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v285castAudioVolume285 = value
        AppToast.show(this, "Cast Audio Volume285: $value")
    }
// v285: Cache Download Speed286


internal fun PlayerActivity.showV285CacheDownloadSpeed286Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v285cacheDownloadSpeed286).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed286",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v285cacheDownloadSpeed286 = value
        AppToast.show(this, "Cache Download Speed286: $value")
    }
// v285: Video Color Space285


internal fun PlayerActivity.showV285VideoColorSpace285Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v285videoColorSpace285).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space285",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v285videoColorSpace285 = value
        AppToast.show(this, "Video Color Space285: $value")
    }
// v285: Danmaku Bottom Max Count378


internal fun PlayerActivity.showV285DanmakuBottomMaxCount378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v285danmakuBottomMaxCount378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v285danmakuBottomMaxCount378 = value
        AppToast.show(this, "Danmaku Bottom Max Count378: $value")
    }
// v286: Danmaku Bottom Max Count379


internal fun PlayerActivity.showV286DanmakuBottomMaxCount379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v286danmakuBottomMaxCount379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v286danmakuBottomMaxCount379 = value
        AppToast.show(this, "Danmaku Bottom Max Count379: $value")
    }
// v286: Gesture Shake Action286


internal fun PlayerActivity.showV286GestureShakeAction286Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v286gestureShakeAction286).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action286",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v286gestureShakeAction286 = value
        AppToast.show(this, "Gesture Shake Action286: $value")
    }
// v286: Cast Audio Volume286


internal fun PlayerActivity.showV286CastAudioVolume286Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v286castAudioVolume286).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume286",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v286castAudioVolume286 = value
        AppToast.show(this, "Cast Audio Volume286: $value")
    }
// v286: Cache Download Speed287


internal fun PlayerActivity.showV286CacheDownloadSpeed287Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v286cacheDownloadSpeed287).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed287",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v286cacheDownloadSpeed287 = value
        AppToast.show(this, "Cache Download Speed287: $value")
    }
// v286: Video Color Space286


internal fun PlayerActivity.showV286VideoColorSpace286Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v286videoColorSpace286).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space286",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v286videoColorSpace286 = value
        AppToast.show(this, "Video Color Space286: $value")
    }
// v286: Danmaku Bottom Max Count380


internal fun PlayerActivity.showV286DanmakuBottomMaxCount380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v286danmakuBottomMaxCount380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v286danmakuBottomMaxCount380 = value
        AppToast.show(this, "Danmaku Bottom Max Count380: $value")
    }
// v287: Danmaku Bottom Max Count381


internal fun PlayerActivity.showV287DanmakuBottomMaxCount381Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v287danmakuBottomMaxCount381).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count381",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v287danmakuBottomMaxCount381 = value
        AppToast.show(this, "Danmaku Bottom Max Count381: $value")
    }
// v287: Gesture Shake Action287


internal fun PlayerActivity.showV287GestureShakeAction287Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v287gestureShakeAction287).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action287",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v287gestureShakeAction287 = value
        AppToast.show(this, "Gesture Shake Action287: $value")
    }
// v287: Cast Audio Volume287


internal fun PlayerActivity.showV287CastAudioVolume287Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v287castAudioVolume287).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume287",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v287castAudioVolume287 = value
        AppToast.show(this, "Cast Audio Volume287: $value")
    }
// v287: Cache Download Speed288


internal fun PlayerActivity.showV287CacheDownloadSpeed288Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v287cacheDownloadSpeed288).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed288",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v287cacheDownloadSpeed288 = value
        AppToast.show(this, "Cache Download Speed288: $value")
    }
// v287: Video Color Space287


internal fun PlayerActivity.showV287VideoColorSpace287Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v287videoColorSpace287).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space287",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v287videoColorSpace287 = value
        AppToast.show(this, "Video Color Space287: $value")
    }
// v287: Danmaku Bottom Max Count382


internal fun PlayerActivity.showV287DanmakuBottomMaxCount382Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v287danmakuBottomMaxCount382).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count382",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v287danmakuBottomMaxCount382 = value
        AppToast.show(this, "Danmaku Bottom Max Count382: $value")
    }
// v288: Danmaku Bottom Max Count383


internal fun PlayerActivity.showV288DanmakuBottomMaxCount383Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v288danmakuBottomMaxCount383).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count383",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v288danmakuBottomMaxCount383 = value
        AppToast.show(this, "Danmaku Bottom Max Count383: $value")
    }
// v288: Gesture Shake Action288


internal fun PlayerActivity.showV288GestureShakeAction288Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v288gestureShakeAction288).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action288",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v288gestureShakeAction288 = value
        AppToast.show(this, "Gesture Shake Action288: $value")
    }
// v288: Cast Audio Volume288


internal fun PlayerActivity.showV288CastAudioVolume288Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v288castAudioVolume288).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume288",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v288castAudioVolume288 = value
        AppToast.show(this, "Cast Audio Volume288: $value")
    }
// v288: Cache Download Speed289


internal fun PlayerActivity.showV288CacheDownloadSpeed289Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v288cacheDownloadSpeed289).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed289",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v288cacheDownloadSpeed289 = value
        AppToast.show(this, "Cache Download Speed289: $value")
    }
// v288: Video Color Space288


internal fun PlayerActivity.showV288VideoColorSpace288Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v288videoColorSpace288).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space288",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v288videoColorSpace288 = value
        AppToast.show(this, "Video Color Space288: $value")
    }
// v288: Danmaku Bottom Max Count384


internal fun PlayerActivity.showV288DanmakuBottomMaxCount384Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v288danmakuBottomMaxCount384).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count384",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v288danmakuBottomMaxCount384 = value
        AppToast.show(this, "Danmaku Bottom Max Count384: $value")
    }
// v289: Danmaku Bottom Max Count385


internal fun PlayerActivity.showV289DanmakuBottomMaxCount385Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v289danmakuBottomMaxCount385).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count385",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289danmakuBottomMaxCount385 = value
        AppToast.show(this, "Danmaku Bottom Max Count385: $value")
    }
// v289: Gesture Shake Action289


internal fun PlayerActivity.showV289GestureShakeAction289Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v289gestureShakeAction289).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action289",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289gestureShakeAction289 = value
        AppToast.show(this, "Gesture Shake Action289: $value")
    }
// v289: Cast Audio Volume289


internal fun PlayerActivity.showV289CastAudioVolume289Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v289castAudioVolume289).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume289",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289castAudioVolume289 = value
        AppToast.show(this, "Cast Audio Volume289: $value")
    }
// v289: Cache Download Speed290


internal fun PlayerActivity.showV289CacheDownloadSpeed290Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v289cacheDownloadSpeed290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289cacheDownloadSpeed290 = value
        AppToast.show(this, "Cache Download Speed290: $value")
    }
// v289: Video Color Space289


internal fun PlayerActivity.showV289VideoColorSpace289Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v289videoColorSpace289).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space289",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289videoColorSpace289 = value
        AppToast.show(this, "Video Color Space289: $value")
    }
// v289: Danmaku Bottom Max Count386


internal fun PlayerActivity.showV289DanmakuBottomMaxCount386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v289danmakuBottomMaxCount386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289danmakuBottomMaxCount386 = value
        AppToast.show(this, "Danmaku Bottom Max Count386: $value")
    }
// v290: Danmaku Bottom Max Count387


internal fun PlayerActivity.showV290DanmakuBottomMaxCount387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290danmakuBottomMaxCount387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290danmakuBottomMaxCount387 = value
        AppToast.show(this, "Danmaku Bottom Max Count387: $value")
    }
// v290: Gesture Shake Action290


internal fun PlayerActivity.showV290GestureShakeAction290Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290gestureShakeAction290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290gestureShakeAction290 = value
        AppToast.show(this, "Gesture Shake Action290: $value")
    }
// v290: Cast Audio Volume290


internal fun PlayerActivity.showV290CastAudioVolume290Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v290castAudioVolume290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290castAudioVolume290 = value
        AppToast.show(this, "Cast Audio Volume290: $value")
    }
// v290: Cache Download Speed291


internal fun PlayerActivity.showV290CacheDownloadSpeed291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290cacheDownloadSpeed291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290cacheDownloadSpeed291 = value
        AppToast.show(this, "Cache Download Speed291: $value")
    }
// v290: Video Color Space290


internal fun PlayerActivity.showV290VideoColorSpace290Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290videoColorSpace290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290videoColorSpace290 = value
        AppToast.show(this, "Video Color Space290: $value")
    }
// v290: Danmaku Bottom Max Count388


internal fun PlayerActivity.showV290DanmakuBottomMaxCount388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290danmakuBottomMaxCount388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290danmakuBottomMaxCount388 = value
        AppToast.show(this, "Danmaku Bottom Max Count388: $value")
    }
// v291: Danmaku Bottom Max Count389


internal fun PlayerActivity.showV291DanmakuBottomMaxCount389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291danmakuBottomMaxCount389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291danmakuBottomMaxCount389 = value
        AppToast.show(this, "Danmaku Bottom Max Count389: $value")
    }
// v291: Gesture Shake Action291


internal fun PlayerActivity.showV291GestureShakeAction291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291gestureShakeAction291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291gestureShakeAction291 = value
        AppToast.show(this, "Gesture Shake Action291: $value")
    }
// v291: Cast Audio Volume291


internal fun PlayerActivity.showV291CastAudioVolume291Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v291castAudioVolume291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291castAudioVolume291 = value
        AppToast.show(this, "Cast Audio Volume291: $value")
    }
// v291: Cache Download Speed292


internal fun PlayerActivity.showV291CacheDownloadSpeed292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291cacheDownloadSpeed292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291cacheDownloadSpeed292 = value
        AppToast.show(this, "Cache Download Speed292: $value")
    }
// v291: Video Color Space291


internal fun PlayerActivity.showV291VideoColorSpace291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291videoColorSpace291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291videoColorSpace291 = value
        AppToast.show(this, "Video Color Space291: $value")
    }
// v291: Danmaku Bottom Max Count390


internal fun PlayerActivity.showV291DanmakuBottomMaxCount390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291danmakuBottomMaxCount390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291danmakuBottomMaxCount390 = value
        AppToast.show(this, "Danmaku Bottom Max Count390: $value")
    }
// v292: Danmaku Bottom Max Count391


internal fun PlayerActivity.showV292DanmakuBottomMaxCount391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292danmakuBottomMaxCount391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292danmakuBottomMaxCount391 = value
        AppToast.show(this, "Danmaku Bottom Max Count391: $value")
    }
// v292: Gesture Shake Action292


internal fun PlayerActivity.showV292GestureShakeAction292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292gestureShakeAction292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292gestureShakeAction292 = value
        AppToast.show(this, "Gesture Shake Action292: $value")
    }
// v292: Cast Audio Volume292


internal fun PlayerActivity.showV292CastAudioVolume292Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v292castAudioVolume292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292castAudioVolume292 = value
        AppToast.show(this, "Cast Audio Volume292: $value")
    }
// v292: Cache Download Speed293


internal fun PlayerActivity.showV292CacheDownloadSpeed293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292cacheDownloadSpeed293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292cacheDownloadSpeed293 = value
        AppToast.show(this, "Cache Download Speed293: $value")
    }
// v292: Video Color Space292


internal fun PlayerActivity.showV292VideoColorSpace292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292videoColorSpace292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292videoColorSpace292 = value
        AppToast.show(this, "Video Color Space292: $value")
    }
// v292: Danmaku Bottom Max Count392


internal fun PlayerActivity.showV292DanmakuBottomMaxCount392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292danmakuBottomMaxCount392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292danmakuBottomMaxCount392 = value
        AppToast.show(this, "Danmaku Bottom Max Count392: $value")
    }
// v293: Danmaku Bottom Max Count393


internal fun PlayerActivity.showV293DanmakuBottomMaxCount393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293danmakuBottomMaxCount393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293danmakuBottomMaxCount393 = value
        AppToast.show(this, "Danmaku Bottom Max Count393: $value")
    }
// v293: Gesture Shake Action293


internal fun PlayerActivity.showV293GestureShakeAction293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293gestureShakeAction293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293gestureShakeAction293 = value
        AppToast.show(this, "Gesture Shake Action293: $value")
    }
// v293: Cast Audio Volume293


internal fun PlayerActivity.showV293CastAudioVolume293Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v293castAudioVolume293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293castAudioVolume293 = value
        AppToast.show(this, "Cast Audio Volume293: $value")
    }
// v293: Cache Download Speed294


internal fun PlayerActivity.showV293CacheDownloadSpeed294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293cacheDownloadSpeed294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293cacheDownloadSpeed294 = value
        AppToast.show(this, "Cache Download Speed294: $value")
    }
// v293: Video Color Space293


internal fun PlayerActivity.showV293VideoColorSpace293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293videoColorSpace293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293videoColorSpace293 = value
        AppToast.show(this, "Video Color Space293: $value")
    }
// v293: Danmaku Bottom Max Count394


internal fun PlayerActivity.showV293DanmakuBottomMaxCount394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293danmakuBottomMaxCount394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293danmakuBottomMaxCount394 = value
        AppToast.show(this, "Danmaku Bottom Max Count394: $value")
    }
// v294: Danmaku Bottom Max Count395


internal fun PlayerActivity.showV294DanmakuBottomMaxCount395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294danmakuBottomMaxCount395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294danmakuBottomMaxCount395 = value
        AppToast.show(this, "Danmaku Bottom Max Count395: $value")
    }
// v294: Gesture Shake Action294


internal fun PlayerActivity.showV294GestureShakeAction294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294gestureShakeAction294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294gestureShakeAction294 = value
        AppToast.show(this, "Gesture Shake Action294: $value")
    }
// v294: Cast Audio Volume294


internal fun PlayerActivity.showV294CastAudioVolume294Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v294castAudioVolume294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294castAudioVolume294 = value
        AppToast.show(this, "Cast Audio Volume294: $value")
    }
// v294: Cache Download Speed295


internal fun PlayerActivity.showV294CacheDownloadSpeed295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294cacheDownloadSpeed295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294cacheDownloadSpeed295 = value
        AppToast.show(this, "Cache Download Speed295: $value")
    }
// v294: Video Color Space294


internal fun PlayerActivity.showV294VideoColorSpace294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294videoColorSpace294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294videoColorSpace294 = value
        AppToast.show(this, "Video Color Space294: $value")
    }
// v294: Danmaku Bottom Max Count396


internal fun PlayerActivity.showV294DanmakuBottomMaxCount396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294danmakuBottomMaxCount396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294danmakuBottomMaxCount396 = value
        AppToast.show(this, "Danmaku Bottom Max Count396: $value")
    }
// v295: Danmaku Bottom Max Count397


internal fun PlayerActivity.showV295DanmakuBottomMaxCount397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295danmakuBottomMaxCount397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295danmakuBottomMaxCount397 = value
        AppToast.show(this, "Danmaku Bottom Max Count397: $value")
    }
// v295: Gesture Shake Action295


internal fun PlayerActivity.showV295GestureShakeAction295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295gestureShakeAction295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295gestureShakeAction295 = value
        AppToast.show(this, "Gesture Shake Action295: $value")
    }
// v295: Cast Audio Volume295


internal fun PlayerActivity.showV295CastAudioVolume295Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v295castAudioVolume295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295castAudioVolume295 = value
        AppToast.show(this, "Cast Audio Volume295: $value")
    }
// v295: Cache Download Speed296


internal fun PlayerActivity.showV295CacheDownloadSpeed296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295cacheDownloadSpeed296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295cacheDownloadSpeed296 = value
        AppToast.show(this, "Cache Download Speed296: $value")
    }
// v295: Video Color Space295


internal fun PlayerActivity.showV295VideoColorSpace295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295videoColorSpace295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295videoColorSpace295 = value
        AppToast.show(this, "Video Color Space295: $value")
    }
// v295: Danmaku Bottom Max Count398


internal fun PlayerActivity.showV295DanmakuBottomMaxCount398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295danmakuBottomMaxCount398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295danmakuBottomMaxCount398 = value
        AppToast.show(this, "Danmaku Bottom Max Count398: $value")
    }
// v296: Danmaku Bottom Max Count399


internal fun PlayerActivity.showV296DanmakuBottomMaxCount399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296danmakuBottomMaxCount399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296danmakuBottomMaxCount399 = value
        AppToast.show(this, "Danmaku Bottom Max Count399: $value")
    }
// v296: Gesture Shake Action296


internal fun PlayerActivity.showV296GestureShakeAction296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296gestureShakeAction296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296gestureShakeAction296 = value
        AppToast.show(this, "Gesture Shake Action296: $value")
    }
// v296: Cast Audio Volume296


internal fun PlayerActivity.showV296CastAudioVolume296Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v296castAudioVolume296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296castAudioVolume296 = value
        AppToast.show(this, "Cast Audio Volume296: $value")
    }
// v296: Cache Download Speed297


internal fun PlayerActivity.showV296CacheDownloadSpeed297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296cacheDownloadSpeed297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296cacheDownloadSpeed297 = value
        AppToast.show(this, "Cache Download Speed297: $value")
    }
// v296: Video Color Space296


internal fun PlayerActivity.showV296VideoColorSpace296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296videoColorSpace296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296videoColorSpace296 = value
        AppToast.show(this, "Video Color Space296: $value")
    }
// v296: Danmaku Bottom Max Count400


internal fun PlayerActivity.showV296DanmakuBottomMaxCount400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296danmakuBottomMaxCount400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296danmakuBottomMaxCount400 = value
        AppToast.show(this, "Danmaku Bottom Max Count400: $value")
    }
// v297: Danmaku Bottom Max Count401


internal fun PlayerActivity.showV297DanmakuBottomMaxCount401Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297danmakuBottomMaxCount401).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count401",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297danmakuBottomMaxCount401 = value
        AppToast.show(this, "Danmaku Bottom Max Count401: $value")
    }
// v297: Gesture Shake Action297


internal fun PlayerActivity.showV297GestureShakeAction297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297gestureShakeAction297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297gestureShakeAction297 = value
        AppToast.show(this, "Gesture Shake Action297: $value")
    }
// v297: Cast Audio Volume297


internal fun PlayerActivity.showV297CastAudioVolume297Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v297castAudioVolume297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297castAudioVolume297 = value
        AppToast.show(this, "Cast Audio Volume297: $value")
    }
// v297: Cache Download Speed298


internal fun PlayerActivity.showV297CacheDownloadSpeed298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297cacheDownloadSpeed298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297cacheDownloadSpeed298 = value
        AppToast.show(this, "Cache Download Speed298: $value")
    }
// v297: Video Color Space297


internal fun PlayerActivity.showV297VideoColorSpace297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297videoColorSpace297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297videoColorSpace297 = value
        AppToast.show(this, "Video Color Space297: $value")
    }
// v297: Danmaku Bottom Max Count402


internal fun PlayerActivity.showV297DanmakuBottomMaxCount402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297danmakuBottomMaxCount402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297danmakuBottomMaxCount402 = value
        AppToast.show(this, "Danmaku Bottom Max Count402: $value")
    }
// v298: Danmaku Bottom Max Count403


internal fun PlayerActivity.showV298DanmakuBottomMaxCount403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298danmakuBottomMaxCount403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298danmakuBottomMaxCount403 = value
        AppToast.show(this, "Danmaku Bottom Max Count403: $value")
    }
// v298: Gesture Shake Action298


internal fun PlayerActivity.showV298GestureShakeAction298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298gestureShakeAction298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298gestureShakeAction298 = value
        AppToast.show(this, "Gesture Shake Action298: $value")
    }
// v298: Cast Audio Volume298


internal fun PlayerActivity.showV298CastAudioVolume298Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v298castAudioVolume298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298castAudioVolume298 = value
        AppToast.show(this, "Cast Audio Volume298: $value")
    }
// v298: Cache Download Speed299


internal fun PlayerActivity.showV298CacheDownloadSpeed299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298cacheDownloadSpeed299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298cacheDownloadSpeed299 = value
        AppToast.show(this, "Cache Download Speed299: $value")
    }
// v298: Video Color Space298


internal fun PlayerActivity.showV298VideoColorSpace298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298videoColorSpace298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298videoColorSpace298 = value
        AppToast.show(this, "Video Color Space298: $value")
    }
// v298: Danmaku Bottom Max Count404


internal fun PlayerActivity.showV298DanmakuBottomMaxCount404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298danmakuBottomMaxCount404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298danmakuBottomMaxCount404 = value
        AppToast.show(this, "Danmaku Bottom Max Count404: $value")
    }
// v299: Danmaku Bottom Max Count405


internal fun PlayerActivity.showV299DanmakuBottomMaxCount405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299danmakuBottomMaxCount405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299danmakuBottomMaxCount405 = value
        AppToast.show(this, "Danmaku Bottom Max Count405: $value")
    }
// v299: Gesture Shake Action299


internal fun PlayerActivity.showV299GestureShakeAction299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299gestureShakeAction299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299gestureShakeAction299 = value
        AppToast.show(this, "Gesture Shake Action299: $value")
    }
// v299: Cast Audio Volume299


internal fun PlayerActivity.showV299CastAudioVolume299Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v299castAudioVolume299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299castAudioVolume299 = value
        AppToast.show(this, "Cast Audio Volume299: $value")
    }
// v299: Cache Download Speed300


internal fun PlayerActivity.showV299CacheDownloadSpeed300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299cacheDownloadSpeed300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299cacheDownloadSpeed300 = value
        AppToast.show(this, "Cache Download Speed300: $value")
    }
// v299: Video Color Space299


internal fun PlayerActivity.showV299VideoColorSpace299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299videoColorSpace299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299videoColorSpace299 = value
        AppToast.show(this, "Video Color Space299: $value")
    }
// v299: Danmaku Bottom Max Count406


internal fun PlayerActivity.showV299DanmakuBottomMaxCount406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299danmakuBottomMaxCount406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299danmakuBottomMaxCount406 = value
        AppToast.show(this, "Danmaku Bottom Max Count406: $value")
    }
// v300: Danmaku Bottom Max Count407


internal fun PlayerActivity.showV300DanmakuBottomMaxCount407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300danmakuBottomMaxCount407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300danmakuBottomMaxCount407 = value
        AppToast.show(this, "Danmaku Bottom Max Count407: $value")
    }
// v300: Gesture Shake Action300


internal fun PlayerActivity.showV300GestureShakeAction300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300gestureShakeAction300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300gestureShakeAction300 = value
        AppToast.show(this, "Gesture Shake Action300: $value")
    }
// v300: Cast Audio Volume300


internal fun PlayerActivity.showV300CastAudioVolume300Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v300castAudioVolume300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300castAudioVolume300 = value
        AppToast.show(this, "Cast Audio Volume300: $value")
    }
// v300: Cache Download Speed301


internal fun PlayerActivity.showV300CacheDownloadSpeed301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300cacheDownloadSpeed301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300cacheDownloadSpeed301 = value
        AppToast.show(this, "Cache Download Speed301: $value")
    }
// v300: Video Color Space300


internal fun PlayerActivity.showV300VideoColorSpace300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300videoColorSpace300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300videoColorSpace300 = value
        AppToast.show(this, "Video Color Space300: $value")
    }
// v300: Danmaku Bottom Max Count408


internal fun PlayerActivity.showV300DanmakuBottomMaxCount408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300danmakuBottomMaxCount408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300danmakuBottomMaxCount408 = value
        AppToast.show(this, "Danmaku Bottom Max Count408: $value")
    }
// v301: Danmaku Bottom Max Count409


internal fun PlayerActivity.showV301DanmakuBottomMaxCount409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301danmakuBottomMaxCount409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301danmakuBottomMaxCount409 = value
        AppToast.show(this, "Danmaku Bottom Max Count409: $value")
    }
// v301: Gesture Shake Action301


internal fun PlayerActivity.showV301GestureShakeAction301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301gestureShakeAction301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301gestureShakeAction301 = value
        AppToast.show(this, "Gesture Shake Action301: $value")
    }
// v301: Cast Audio Volume301


internal fun PlayerActivity.showV301CastAudioVolume301Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v301castAudioVolume301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301castAudioVolume301 = value
        AppToast.show(this, "Cast Audio Volume301: $value")
    }
// v301: Cache Download Speed302


internal fun PlayerActivity.showV301CacheDownloadSpeed302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301cacheDownloadSpeed302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301cacheDownloadSpeed302 = value
        AppToast.show(this, "Cache Download Speed302: $value")
    }
// v301: Video Color Space301


internal fun PlayerActivity.showV301VideoColorSpace301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301videoColorSpace301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301videoColorSpace301 = value
        AppToast.show(this, "Video Color Space301: $value")
    }
// v301: Danmaku Bottom Max Count410


internal fun PlayerActivity.showV301DanmakuBottomMaxCount410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301danmakuBottomMaxCount410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301danmakuBottomMaxCount410 = value
        AppToast.show(this, "Danmaku Bottom Max Count410: $value")
    }
// v302: Danmaku Bottom Max Count411


internal fun PlayerActivity.showV302DanmakuBottomMaxCount411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302danmakuBottomMaxCount411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302danmakuBottomMaxCount411 = value
        AppToast.show(this, "Danmaku Bottom Max Count411: $value")
    }
// v302: Gesture Shake Action302


internal fun PlayerActivity.showV302GestureShakeAction302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302gestureShakeAction302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302gestureShakeAction302 = value
        AppToast.show(this, "Gesture Shake Action302: $value")
    }
// v302: Cast Audio Volume302


internal fun PlayerActivity.showV302CastAudioVolume302Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v302castAudioVolume302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302castAudioVolume302 = value
        AppToast.show(this, "Cast Audio Volume302: $value")
    }
// v302: Cache Download Speed303


internal fun PlayerActivity.showV302CacheDownloadSpeed303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302cacheDownloadSpeed303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302cacheDownloadSpeed303 = value
        AppToast.show(this, "Cache Download Speed303: $value")
    }
// v302: Video Color Space302


internal fun PlayerActivity.showV302VideoColorSpace302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302videoColorSpace302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302videoColorSpace302 = value
        AppToast.show(this, "Video Color Space302: $value")
    }
// v302: Danmaku Bottom Max Count412


internal fun PlayerActivity.showV302DanmakuBottomMaxCount412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302danmakuBottomMaxCount412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302danmakuBottomMaxCount412 = value
        AppToast.show(this, "Danmaku Bottom Max Count412: $value")
    }
// v303: Danmaku Bottom Max Count413


internal fun PlayerActivity.showV303DanmakuBottomMaxCount413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303danmakuBottomMaxCount413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303danmakuBottomMaxCount413 = value
        AppToast.show(this, "Danmaku Bottom Max Count413: $value")
    }
// v303: Gesture Shake Action303


internal fun PlayerActivity.showV303GestureShakeAction303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303gestureShakeAction303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303gestureShakeAction303 = value
        AppToast.show(this, "Gesture Shake Action303: $value")
    }
// v303: Cast Audio Volume303


internal fun PlayerActivity.showV303CastAudioVolume303Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v303castAudioVolume303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303castAudioVolume303 = value
        AppToast.show(this, "Cast Audio Volume303: $value")
    }
// v303: Cache Download Speed304


internal fun PlayerActivity.showV303CacheDownloadSpeed304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303cacheDownloadSpeed304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303cacheDownloadSpeed304 = value
        AppToast.show(this, "Cache Download Speed304: $value")
    }
// v303: Video Color Space303


internal fun PlayerActivity.showV303VideoColorSpace303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303videoColorSpace303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303videoColorSpace303 = value
        AppToast.show(this, "Video Color Space303: $value")
    }
// v303: Danmaku Bottom Max Count414


internal fun PlayerActivity.showV303DanmakuBottomMaxCount414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303danmakuBottomMaxCount414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303danmakuBottomMaxCount414 = value
        AppToast.show(this, "Danmaku Bottom Max Count414: $value")
    }
// v304: Danmaku Bottom Max Count415


internal fun PlayerActivity.showV304DanmakuBottomMaxCount415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304danmakuBottomMaxCount415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304danmakuBottomMaxCount415 = value
        AppToast.show(this, "Danmaku Bottom Max Count415: $value")
    }
// v304: Gesture Shake Action304


internal fun PlayerActivity.showV304GestureShakeAction304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304gestureShakeAction304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304gestureShakeAction304 = value
        AppToast.show(this, "Gesture Shake Action304: $value")
    }
// v304: Cast Audio Volume304


internal fun PlayerActivity.showV304CastAudioVolume304Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v304castAudioVolume304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304castAudioVolume304 = value
        AppToast.show(this, "Cast Audio Volume304: $value")
    }
// v304: Cache Download Speed305


internal fun PlayerActivity.showV304CacheDownloadSpeed305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304cacheDownloadSpeed305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304cacheDownloadSpeed305 = value
        AppToast.show(this, "Cache Download Speed305: $value")
    }
// v304: Video Color Space304


internal fun PlayerActivity.showV304VideoColorSpace304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304videoColorSpace304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304videoColorSpace304 = value
        AppToast.show(this, "Video Color Space304: $value")
    }
// v304: Danmaku Bottom Max Count416


internal fun PlayerActivity.showV304DanmakuBottomMaxCount416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304danmakuBottomMaxCount416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304danmakuBottomMaxCount416 = value
        AppToast.show(this, "Danmaku Bottom Max Count416: $value")
    }
// v305: Danmaku Bottom Max Count417


internal fun PlayerActivity.showV305DanmakuBottomMaxCount417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305danmakuBottomMaxCount417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305danmakuBottomMaxCount417 = value
        AppToast.show(this, "Danmaku Bottom Max Count417: $value")
    }
// v305: Gesture Shake Action305


internal fun PlayerActivity.showV305GestureShakeAction305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305gestureShakeAction305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305gestureShakeAction305 = value
        AppToast.show(this, "Gesture Shake Action305: $value")
    }
// v305: Cast Audio Volume305


internal fun PlayerActivity.showV305CastAudioVolume305Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v305castAudioVolume305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305castAudioVolume305 = value
        AppToast.show(this, "Cast Audio Volume305: $value")
    }
// v305: Cache Download Speed306


internal fun PlayerActivity.showV305CacheDownloadSpeed306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305cacheDownloadSpeed306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305cacheDownloadSpeed306 = value
        AppToast.show(this, "Cache Download Speed306: $value")
    }
// v305: Video Color Space305


internal fun PlayerActivity.showV305VideoColorSpace305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305videoColorSpace305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305videoColorSpace305 = value
        AppToast.show(this, "Video Color Space305: $value")
    }
// v305: Danmaku Bottom Max Count418


internal fun PlayerActivity.showV305DanmakuBottomMaxCount418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305danmakuBottomMaxCount418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305danmakuBottomMaxCount418 = value
        AppToast.show(this, "Danmaku Bottom Max Count418: $value")
    }
// v306: Danmaku Bottom Max Count419


internal fun PlayerActivity.showV306DanmakuBottomMaxCount419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306danmakuBottomMaxCount419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306danmakuBottomMaxCount419 = value
        AppToast.show(this, "Danmaku Bottom Max Count419: $value")
    }
// v306: Gesture Shake Action306


internal fun PlayerActivity.showV306GestureShakeAction306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306gestureShakeAction306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306gestureShakeAction306 = value
        AppToast.show(this, "Gesture Shake Action306: $value")
    }
// v306: Cast Audio Volume306


internal fun PlayerActivity.showV306CastAudioVolume306Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v306castAudioVolume306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306castAudioVolume306 = value
        AppToast.show(this, "Cast Audio Volume306: $value")
    }
// v306: Cache Download Speed307


internal fun PlayerActivity.showV306CacheDownloadSpeed307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306cacheDownloadSpeed307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306cacheDownloadSpeed307 = value
        AppToast.show(this, "Cache Download Speed307: $value")
    }
// v306: Video Color Space306


internal fun PlayerActivity.showV306VideoColorSpace306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306videoColorSpace306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306videoColorSpace306 = value
        AppToast.show(this, "Video Color Space306: $value")
    }
// v306: Danmaku Bottom Max Count420


internal fun PlayerActivity.showV306DanmakuBottomMaxCount420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306danmakuBottomMaxCount420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306danmakuBottomMaxCount420 = value
        AppToast.show(this, "Danmaku Bottom Max Count420: $value")
    }
// v307: Danmaku Bottom Max Count421


internal fun PlayerActivity.showV307DanmakuBottomMaxCount421Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307danmakuBottomMaxCount421).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count421",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307danmakuBottomMaxCount421 = value
        AppToast.show(this, "Danmaku Bottom Max Count421: $value")
    }
// v307: Gesture Shake Action307


internal fun PlayerActivity.showV307GestureShakeAction307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307gestureShakeAction307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307gestureShakeAction307 = value
        AppToast.show(this, "Gesture Shake Action307: $value")
    }
// v307: Cast Audio Volume307


internal fun PlayerActivity.showV307CastAudioVolume307Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v307castAudioVolume307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307castAudioVolume307 = value
        AppToast.show(this, "Cast Audio Volume307: $value")
    }
// v307: Cache Download Speed308


internal fun PlayerActivity.showV307CacheDownloadSpeed308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307cacheDownloadSpeed308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307cacheDownloadSpeed308 = value
        AppToast.show(this, "Cache Download Speed308: $value")
    }
// v307: Video Color Space307


internal fun PlayerActivity.showV307VideoColorSpace307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307videoColorSpace307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307videoColorSpace307 = value
        AppToast.show(this, "Video Color Space307: $value")
    }
// v307: Danmaku Bottom Max Count422


internal fun PlayerActivity.showV307DanmakuBottomMaxCount422Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307danmakuBottomMaxCount422).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count422",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307danmakuBottomMaxCount422 = value
        AppToast.show(this, "Danmaku Bottom Max Count422: $value")
    }
// v308: Danmaku Bottom Max Count423


internal fun PlayerActivity.showV308DanmakuBottomMaxCount423Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308danmakuBottomMaxCount423).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count423",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308danmakuBottomMaxCount423 = value
        AppToast.show(this, "Danmaku Bottom Max Count423: $value")
    }
// v308: Gesture Shake Action308


internal fun PlayerActivity.showV308GestureShakeAction308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308gestureShakeAction308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308gestureShakeAction308 = value
        AppToast.show(this, "Gesture Shake Action308: $value")
    }
// v308: Cast Audio Volume308


internal fun PlayerActivity.showV308CastAudioVolume308Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v308castAudioVolume308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308castAudioVolume308 = value
        AppToast.show(this, "Cast Audio Volume308: $value")
    }
// v308: Cache Download Speed309


internal fun PlayerActivity.showV308CacheDownloadSpeed309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308cacheDownloadSpeed309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308cacheDownloadSpeed309 = value
        AppToast.show(this, "Cache Download Speed309: $value")
    }
// v308: Video Color Space308


internal fun PlayerActivity.showV308VideoColorSpace308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308videoColorSpace308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308videoColorSpace308 = value
        AppToast.show(this, "Video Color Space308: $value")
    }
// v308: Danmaku Bottom Max Count424


internal fun PlayerActivity.showV308DanmakuBottomMaxCount424Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308danmakuBottomMaxCount424).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count424",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308danmakuBottomMaxCount424 = value
        AppToast.show(this, "Danmaku Bottom Max Count424: $value")
    }
// v309: Danmaku Bottom Max Count425


internal fun PlayerActivity.showV309DanmakuBottomMaxCount425Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309danmakuBottomMaxCount425).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count425",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309danmakuBottomMaxCount425 = value
        AppToast.show(this, "Danmaku Bottom Max Count425: $value")
    }
// v309: Gesture Shake Action309


internal fun PlayerActivity.showV309GestureShakeAction309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309gestureShakeAction309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309gestureShakeAction309 = value
        AppToast.show(this, "Gesture Shake Action309: $value")
    }
// v309: Cast Audio Volume309


internal fun PlayerActivity.showV309CastAudioVolume309Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v309castAudioVolume309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309castAudioVolume309 = value
        AppToast.show(this, "Cast Audio Volume309: $value")
    }
// v309: Cache Download Speed310


internal fun PlayerActivity.showV309CacheDownloadSpeed310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309cacheDownloadSpeed310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309cacheDownloadSpeed310 = value
        AppToast.show(this, "Cache Download Speed310: $value")
    }
// v309: Video Color Space309


internal fun PlayerActivity.showV309VideoColorSpace309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309videoColorSpace309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309videoColorSpace309 = value
        AppToast.show(this, "Video Color Space309: $value")
    }
// v309: Danmaku Bottom Max Count426


internal fun PlayerActivity.showV309DanmakuBottomMaxCount426Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309danmakuBottomMaxCount426).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count426",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309danmakuBottomMaxCount426 = value
        AppToast.show(this, "Danmaku Bottom Max Count426: $value")
    }
// v310: Danmaku Bottom Max Count427


internal fun PlayerActivity.showV310DanmakuBottomMaxCount427Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310danmakuBottomMaxCount427).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count427",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310danmakuBottomMaxCount427 = value
        AppToast.show(this, "Danmaku Bottom Max Count427: $value")
    }
// v310: Gesture Shake Action310


internal fun PlayerActivity.showV310GestureShakeAction310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310gestureShakeAction310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310gestureShakeAction310 = value
        AppToast.show(this, "Gesture Shake Action310: $value")
    }
// v310: Cast Audio Volume310


internal fun PlayerActivity.showV310CastAudioVolume310Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v310castAudioVolume310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310castAudioVolume310 = value
        AppToast.show(this, "Cast Audio Volume310: $value")
    }
// v310: Cache Download Speed311


internal fun PlayerActivity.showV310CacheDownloadSpeed311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310cacheDownloadSpeed311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310cacheDownloadSpeed311 = value
        AppToast.show(this, "Cache Download Speed311: $value")
    }
// v310: Video Color Space310


internal fun PlayerActivity.showV310VideoColorSpace310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310videoColorSpace310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310videoColorSpace310 = value
        AppToast.show(this, "Video Color Space310: $value")
    }
// v310: Danmaku Bottom Max Count428


internal fun PlayerActivity.showV310DanmakuBottomMaxCount428Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310danmakuBottomMaxCount428).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count428",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310danmakuBottomMaxCount428 = value
        AppToast.show(this, "Danmaku Bottom Max Count428: $value")
    }
// v311: Audio Compressor Ratio293


internal fun PlayerActivity.showV311AudioCompressorRatio293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311audioCompressorRatio293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311audioCompressorRatio293 = value
        AppToast.show(this, "Audio Compressor Ratio293: $value")
    }
// v311: Danmaku Bottom Max Count429


internal fun PlayerActivity.showV311DanmakuBottomMaxCount429Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311danmakuBottomMaxCount429).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count429",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311danmakuBottomMaxCount429 = value
        AppToast.show(this, "Danmaku Bottom Max Count429: $value")
    }
// v311: Gesture Shake Sensitivity293


internal fun PlayerActivity.showV311GestureShakeSensitivity293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311gestureShakeSensitivity293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311gestureShakeSensitivity293 = value
        AppToast.show(this, "Gesture Shake Sensitivity293: $value")
    }
// v311: Cast Bitrate293


internal fun PlayerActivity.showV311CastBitrate293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311castBitrate293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311castBitrate293 = value
        AppToast.show(this, "Cast Bitrate293: $value")
    }
// v311: Cache Preload Size294


internal fun PlayerActivity.showV311CachePreloadSize294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311cachePreloadSize294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311cachePreloadSize294 = value
        AppToast.show(this, "Cache Preload Size294: $value")
    }
// v311: Progress Bar Style293


internal fun PlayerActivity.showV311ProgressBarStyle293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311progressBarStyle293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311progressBarStyle293 = value
        AppToast.show(this, "Progress Bar Style293: $value")
    }
// v311: Danmaku Bottom Max Count430


internal fun PlayerActivity.showV311DanmakuBottomMaxCount430Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311danmakuBottomMaxCount430).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count430",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311danmakuBottomMaxCount430 = value
        AppToast.show(this, "Danmaku Bottom Max Count430: $value")
    }
// v312: Audio Compressor Ratio294


internal fun PlayerActivity.showV312AudioCompressorRatio294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312audioCompressorRatio294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312audioCompressorRatio294 = value
        AppToast.show(this, "Audio Compressor Ratio294: $value")
    }
// v312: Danmaku Bottom Max Count431


internal fun PlayerActivity.showV312DanmakuBottomMaxCount431Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312danmakuBottomMaxCount431).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count431",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312danmakuBottomMaxCount431 = value
        AppToast.show(this, "Danmaku Bottom Max Count431: $value")
    }
// v312: Gesture Shake Sensitivity294


internal fun PlayerActivity.showV312GestureShakeSensitivity294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312gestureShakeSensitivity294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312gestureShakeSensitivity294 = value
        AppToast.show(this, "Gesture Shake Sensitivity294: $value")
    }
// v312: Cast Bitrate294


internal fun PlayerActivity.showV312CastBitrate294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312castBitrate294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312castBitrate294 = value
        AppToast.show(this, "Cast Bitrate294: $value")
    }
// v312: Cache Preload Size295


internal fun PlayerActivity.showV312CachePreloadSize295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312cachePreloadSize295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312cachePreloadSize295 = value
        AppToast.show(this, "Cache Preload Size295: $value")
    }
// v312: Progress Bar Style294


internal fun PlayerActivity.showV312ProgressBarStyle294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312progressBarStyle294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312progressBarStyle294 = value
        AppToast.show(this, "Progress Bar Style294: $value")
    }
// v312: Danmaku Bottom Max Count432


internal fun PlayerActivity.showV312DanmakuBottomMaxCount432Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312danmakuBottomMaxCount432).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count432",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312danmakuBottomMaxCount432 = value
        AppToast.show(this, "Danmaku Bottom Max Count432: $value")
    }
// v313: Audio Compressor Ratio295


internal fun PlayerActivity.showV313AudioCompressorRatio295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313audioCompressorRatio295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313audioCompressorRatio295 = value
        AppToast.show(this, "Audio Compressor Ratio295: $value")
    }
// v313: Danmaku Bottom Max Count433


internal fun PlayerActivity.showV313DanmakuBottomMaxCount433Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313danmakuBottomMaxCount433).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count433",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313danmakuBottomMaxCount433 = value
        AppToast.show(this, "Danmaku Bottom Max Count433: $value")
    }
// v313: Gesture Shake Sensitivity295


internal fun PlayerActivity.showV313GestureShakeSensitivity295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313gestureShakeSensitivity295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313gestureShakeSensitivity295 = value
        AppToast.show(this, "Gesture Shake Sensitivity295: $value")
    }
// v313: Cast Bitrate295


internal fun PlayerActivity.showV313CastBitrate295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313castBitrate295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313castBitrate295 = value
        AppToast.show(this, "Cast Bitrate295: $value")
    }
// v313: Cache Preload Size296


internal fun PlayerActivity.showV313CachePreloadSize296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313cachePreloadSize296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313cachePreloadSize296 = value
        AppToast.show(this, "Cache Preload Size296: $value")
    }
// v313: Progress Bar Style295


internal fun PlayerActivity.showV313ProgressBarStyle295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313progressBarStyle295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313progressBarStyle295 = value
        AppToast.show(this, "Progress Bar Style295: $value")
    }
// v313: Danmaku Bottom Max Count434


internal fun PlayerActivity.showV313DanmakuBottomMaxCount434Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313danmakuBottomMaxCount434).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count434",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313danmakuBottomMaxCount434 = value
        AppToast.show(this, "Danmaku Bottom Max Count434: $value")
    }
// v314: Audio Compressor Ratio296


internal fun PlayerActivity.showV314AudioCompressorRatio296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314audioCompressorRatio296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314audioCompressorRatio296 = value
        AppToast.show(this, "Audio Compressor Ratio296: $value")
    }
// v314: Danmaku Bottom Max Count435


internal fun PlayerActivity.showV314DanmakuBottomMaxCount435Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314danmakuBottomMaxCount435).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count435",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314danmakuBottomMaxCount435 = value
        AppToast.show(this, "Danmaku Bottom Max Count435: $value")
    }
// v314: Gesture Shake Sensitivity296


internal fun PlayerActivity.showV314GestureShakeSensitivity296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314gestureShakeSensitivity296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314gestureShakeSensitivity296 = value
        AppToast.show(this, "Gesture Shake Sensitivity296: $value")
    }
// v314: Cast Bitrate296


internal fun PlayerActivity.showV314CastBitrate296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314castBitrate296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314castBitrate296 = value
        AppToast.show(this, "Cast Bitrate296: $value")
    }
// v314: Cache Preload Size297


internal fun PlayerActivity.showV314CachePreloadSize297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314cachePreloadSize297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314cachePreloadSize297 = value
        AppToast.show(this, "Cache Preload Size297: $value")
    }
// v314: Progress Bar Style296


internal fun PlayerActivity.showV314ProgressBarStyle296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314progressBarStyle296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314progressBarStyle296 = value
        AppToast.show(this, "Progress Bar Style296: $value")
    }
// v314: Danmaku Bottom Max Count436


internal fun PlayerActivity.showV314DanmakuBottomMaxCount436Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314danmakuBottomMaxCount436).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count436",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314danmakuBottomMaxCount436 = value
        AppToast.show(this, "Danmaku Bottom Max Count436: $value")
    }
// v315: Audio Compressor Ratio297


internal fun PlayerActivity.showV315AudioCompressorRatio297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315audioCompressorRatio297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315audioCompressorRatio297 = value
        AppToast.show(this, "Audio Compressor Ratio297: $value")
    }
// v315: Danmaku Bottom Max Count437


internal fun PlayerActivity.showV315DanmakuBottomMaxCount437Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315danmakuBottomMaxCount437).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count437",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315danmakuBottomMaxCount437 = value
        AppToast.show(this, "Danmaku Bottom Max Count437: $value")
    }
// v315: Gesture Shake Sensitivity297


internal fun PlayerActivity.showV315GestureShakeSensitivity297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315gestureShakeSensitivity297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315gestureShakeSensitivity297 = value
        AppToast.show(this, "Gesture Shake Sensitivity297: $value")
    }
// v315: Cast Bitrate297


internal fun PlayerActivity.showV315CastBitrate297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315castBitrate297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315castBitrate297 = value
        AppToast.show(this, "Cast Bitrate297: $value")
    }
// v315: Cache Preload Size298


internal fun PlayerActivity.showV315CachePreloadSize298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315cachePreloadSize298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315cachePreloadSize298 = value
        AppToast.show(this, "Cache Preload Size298: $value")
    }
// v315: Progress Bar Style297


internal fun PlayerActivity.showV315ProgressBarStyle297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315progressBarStyle297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315progressBarStyle297 = value
        AppToast.show(this, "Progress Bar Style297: $value")
    }
// v315: Danmaku Bottom Max Count438


internal fun PlayerActivity.showV315DanmakuBottomMaxCount438Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315danmakuBottomMaxCount438).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count438",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315danmakuBottomMaxCount438 = value
        AppToast.show(this, "Danmaku Bottom Max Count438: $value")
    }
// v316: Audio Compressor Ratio298


