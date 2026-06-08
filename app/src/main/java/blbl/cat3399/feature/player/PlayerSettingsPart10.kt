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

internal fun PlayerActivity.showV250GestureShakeAction250Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250gestureShakeAction250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250gestureShakeAction250 = value
        AppToast.show(this, "Gesture Shake Action250: $value")
    }
// v250: Cast Audio Volume250


internal fun PlayerActivity.showV250CastAudioVolume250Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v250castAudioVolume250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250castAudioVolume250 = value
        AppToast.show(this, "Cast Audio Volume250: $value")
    }
// v250: Cache Download Speed251


internal fun PlayerActivity.showV250CacheDownloadSpeed251Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250cacheDownloadSpeed251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250cacheDownloadSpeed251 = value
        AppToast.show(this, "Cache Download Speed251: $value")
    }
// v250: Video Color Space250


internal fun PlayerActivity.showV250VideoColorSpace250Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250videoColorSpace250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250videoColorSpace250 = value
        AppToast.show(this, "Video Color Space250: $value")
    }
// v250: Danmaku Bottom Max Count308


internal fun PlayerActivity.showV250DanmakuBottomMaxCount308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250danmakuBottomMaxCount308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250danmakuBottomMaxCount308 = value
        AppToast.show(this, "Danmaku Bottom Max Count308: $value")
    }
// v251: Danmaku Bottom Max Count309


internal fun PlayerActivity.showV251DanmakuBottomMaxCount309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251danmakuBottomMaxCount309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251danmakuBottomMaxCount309 = value
        AppToast.show(this, "Danmaku Bottom Max Count309: $value")
    }
// v251: Gesture Shake Action251


internal fun PlayerActivity.showV251GestureShakeAction251Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251gestureShakeAction251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251gestureShakeAction251 = value
        AppToast.show(this, "Gesture Shake Action251: $value")
    }
// v251: Cast Audio Volume251


internal fun PlayerActivity.showV251CastAudioVolume251Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v251castAudioVolume251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251castAudioVolume251 = value
        AppToast.show(this, "Cast Audio Volume251: $value")
    }
// v251: Cache Download Speed252


internal fun PlayerActivity.showV251CacheDownloadSpeed252Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251cacheDownloadSpeed252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251cacheDownloadSpeed252 = value
        AppToast.show(this, "Cache Download Speed252: $value")
    }
// v251: Video Color Space251


internal fun PlayerActivity.showV251VideoColorSpace251Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251videoColorSpace251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251videoColorSpace251 = value
        AppToast.show(this, "Video Color Space251: $value")
    }
// v251: Danmaku Bottom Max Count310


internal fun PlayerActivity.showV251DanmakuBottomMaxCount310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251danmakuBottomMaxCount310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251danmakuBottomMaxCount310 = value
        AppToast.show(this, "Danmaku Bottom Max Count310: $value")
    }
// v252: Danmaku Bottom Max Count311


internal fun PlayerActivity.showV252DanmakuBottomMaxCount311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252danmakuBottomMaxCount311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252danmakuBottomMaxCount311 = value
        AppToast.show(this, "Danmaku Bottom Max Count311: $value")
    }
// v252: Gesture Shake Action252


internal fun PlayerActivity.showV252GestureShakeAction252Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252gestureShakeAction252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252gestureShakeAction252 = value
        AppToast.show(this, "Gesture Shake Action252: $value")
    }
// v252: Cast Audio Volume252


internal fun PlayerActivity.showV252CastAudioVolume252Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v252castAudioVolume252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252castAudioVolume252 = value
        AppToast.show(this, "Cast Audio Volume252: $value")
    }
// v252: Cache Download Speed253


internal fun PlayerActivity.showV252CacheDownloadSpeed253Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252cacheDownloadSpeed253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252cacheDownloadSpeed253 = value
        AppToast.show(this, "Cache Download Speed253: $value")
    }
// v252: Video Color Space252


internal fun PlayerActivity.showV252VideoColorSpace252Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252videoColorSpace252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252videoColorSpace252 = value
        AppToast.show(this, "Video Color Space252: $value")
    }
// v252: Danmaku Bottom Max Count312


internal fun PlayerActivity.showV252DanmakuBottomMaxCount312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252danmakuBottomMaxCount312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252danmakuBottomMaxCount312 = value
        AppToast.show(this, "Danmaku Bottom Max Count312: $value")
    }
// v253: Danmaku Bottom Max Count313


internal fun PlayerActivity.showV253DanmakuBottomMaxCount313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253danmakuBottomMaxCount313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253danmakuBottomMaxCount313 = value
        AppToast.show(this, "Danmaku Bottom Max Count313: $value")
    }
// v253: Gesture Shake Action253


internal fun PlayerActivity.showV253GestureShakeAction253Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253gestureShakeAction253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253gestureShakeAction253 = value
        AppToast.show(this, "Gesture Shake Action253: $value")
    }
// v253: Cast Audio Volume253


internal fun PlayerActivity.showV253CastAudioVolume253Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v253castAudioVolume253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253castAudioVolume253 = value
        AppToast.show(this, "Cast Audio Volume253: $value")
    }
// v253: Cache Download Speed254


internal fun PlayerActivity.showV253CacheDownloadSpeed254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253cacheDownloadSpeed254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253cacheDownloadSpeed254 = value
        AppToast.show(this, "Cache Download Speed254: $value")
    }
// v253: Video Color Space253


internal fun PlayerActivity.showV253VideoColorSpace253Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253videoColorSpace253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253videoColorSpace253 = value
        AppToast.show(this, "Video Color Space253: $value")
    }
// v253: Danmaku Bottom Max Count314


internal fun PlayerActivity.showV253DanmakuBottomMaxCount314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253danmakuBottomMaxCount314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253danmakuBottomMaxCount314 = value
        AppToast.show(this, "Danmaku Bottom Max Count314: $value")
    }
// v254: Danmaku Bottom Max Count315


internal fun PlayerActivity.showV254DanmakuBottomMaxCount315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254danmakuBottomMaxCount315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254danmakuBottomMaxCount315 = value
        AppToast.show(this, "Danmaku Bottom Max Count315: $value")
    }
// v254: Gesture Shake Action254


internal fun PlayerActivity.showV254GestureShakeAction254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254gestureShakeAction254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254gestureShakeAction254 = value
        AppToast.show(this, "Gesture Shake Action254: $value")
    }
// v254: Cast Audio Volume254


internal fun PlayerActivity.showV254CastAudioVolume254Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v254castAudioVolume254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254castAudioVolume254 = value
        AppToast.show(this, "Cast Audio Volume254: $value")
    }
// v254: Cache Download Speed255


internal fun PlayerActivity.showV254CacheDownloadSpeed255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254cacheDownloadSpeed255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254cacheDownloadSpeed255 = value
        AppToast.show(this, "Cache Download Speed255: $value")
    }
// v254: Video Color Space254


internal fun PlayerActivity.showV254VideoColorSpace254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254videoColorSpace254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254videoColorSpace254 = value
        AppToast.show(this, "Video Color Space254: $value")
    }
// v254: Danmaku Bottom Max Count316


internal fun PlayerActivity.showV254DanmakuBottomMaxCount316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254danmakuBottomMaxCount316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254danmakuBottomMaxCount316 = value
        AppToast.show(this, "Danmaku Bottom Max Count316: $value")
    }
// v255: Danmaku Bottom Max Count317


internal fun PlayerActivity.showV255DanmakuBottomMaxCount317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255danmakuBottomMaxCount317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255danmakuBottomMaxCount317 = value
        AppToast.show(this, "Danmaku Bottom Max Count317: $value")
    }
// v255: Gesture Shake Action255


internal fun PlayerActivity.showV255GestureShakeAction255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255gestureShakeAction255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255gestureShakeAction255 = value
        AppToast.show(this, "Gesture Shake Action255: $value")
    }
// v255: Cast Audio Volume255


internal fun PlayerActivity.showV255CastAudioVolume255Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v255castAudioVolume255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255castAudioVolume255 = value
        AppToast.show(this, "Cast Audio Volume255: $value")
    }
// v255: Cache Download Speed256


internal fun PlayerActivity.showV255CacheDownloadSpeed256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255cacheDownloadSpeed256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255cacheDownloadSpeed256 = value
        AppToast.show(this, "Cache Download Speed256: $value")
    }
// v255: Video Color Space255


internal fun PlayerActivity.showV255VideoColorSpace255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255videoColorSpace255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255videoColorSpace255 = value
        AppToast.show(this, "Video Color Space255: $value")
    }
// v255: Danmaku Bottom Max Count318


internal fun PlayerActivity.showV255DanmakuBottomMaxCount318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255danmakuBottomMaxCount318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255danmakuBottomMaxCount318 = value
        AppToast.show(this, "Danmaku Bottom Max Count318: $value")
    }
// v256: Danmaku Bottom Max Count319


internal fun PlayerActivity.showV256DanmakuBottomMaxCount319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256danmakuBottomMaxCount319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256danmakuBottomMaxCount319 = value
        AppToast.show(this, "Danmaku Bottom Max Count319: $value")
    }
// v256: Gesture Shake Action256


internal fun PlayerActivity.showV256GestureShakeAction256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256gestureShakeAction256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256gestureShakeAction256 = value
        AppToast.show(this, "Gesture Shake Action256: $value")
    }
// v256: Cast Audio Volume256


internal fun PlayerActivity.showV256CastAudioVolume256Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v256castAudioVolume256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256castAudioVolume256 = value
        AppToast.show(this, "Cast Audio Volume256: $value")
    }
// v256: Cache Download Speed257


internal fun PlayerActivity.showV256CacheDownloadSpeed257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256cacheDownloadSpeed257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256cacheDownloadSpeed257 = value
        AppToast.show(this, "Cache Download Speed257: $value")
    }
// v256: Video Color Space256


internal fun PlayerActivity.showV256VideoColorSpace256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256videoColorSpace256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256videoColorSpace256 = value
        AppToast.show(this, "Video Color Space256: $value")
    }
// v256: Danmaku Bottom Max Count320


internal fun PlayerActivity.showV256DanmakuBottomMaxCount320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256danmakuBottomMaxCount320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256danmakuBottomMaxCount320 = value
        AppToast.show(this, "Danmaku Bottom Max Count320: $value")
    }
// v257: Danmaku Bottom Max Count321


internal fun PlayerActivity.showV257DanmakuBottomMaxCount321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257danmakuBottomMaxCount321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257danmakuBottomMaxCount321 = value
        AppToast.show(this, "Danmaku Bottom Max Count321: $value")
    }
// v257: Gesture Shake Action257


internal fun PlayerActivity.showV257GestureShakeAction257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257gestureShakeAction257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257gestureShakeAction257 = value
        AppToast.show(this, "Gesture Shake Action257: $value")
    }
// v257: Cast Audio Volume257


internal fun PlayerActivity.showV257CastAudioVolume257Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v257castAudioVolume257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257castAudioVolume257 = value
        AppToast.show(this, "Cast Audio Volume257: $value")
    }
// v257: Cache Download Speed258


internal fun PlayerActivity.showV257CacheDownloadSpeed258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257cacheDownloadSpeed258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257cacheDownloadSpeed258 = value
        AppToast.show(this, "Cache Download Speed258: $value")
    }
// v257: Video Color Space257


internal fun PlayerActivity.showV257VideoColorSpace257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257videoColorSpace257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257videoColorSpace257 = value
        AppToast.show(this, "Video Color Space257: $value")
    }
// v257: Danmaku Bottom Max Count322


internal fun PlayerActivity.showV257DanmakuBottomMaxCount322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257danmakuBottomMaxCount322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257danmakuBottomMaxCount322 = value
        AppToast.show(this, "Danmaku Bottom Max Count322: $value")
    }
// v258: Danmaku Bottom Max Count323


internal fun PlayerActivity.showV258DanmakuBottomMaxCount323Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258danmakuBottomMaxCount323).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count323",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258danmakuBottomMaxCount323 = value
        AppToast.show(this, "Danmaku Bottom Max Count323: $value")
    }
// v258: Gesture Shake Action258


internal fun PlayerActivity.showV258GestureShakeAction258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258gestureShakeAction258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258gestureShakeAction258 = value
        AppToast.show(this, "Gesture Shake Action258: $value")
    }
// v258: Cast Audio Volume258


internal fun PlayerActivity.showV258CastAudioVolume258Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v258castAudioVolume258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258castAudioVolume258 = value
        AppToast.show(this, "Cast Audio Volume258: $value")
    }
// v258: Cache Download Speed259


internal fun PlayerActivity.showV258CacheDownloadSpeed259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258cacheDownloadSpeed259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258cacheDownloadSpeed259 = value
        AppToast.show(this, "Cache Download Speed259: $value")
    }
// v258: Video Color Space258


internal fun PlayerActivity.showV258VideoColorSpace258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258videoColorSpace258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258videoColorSpace258 = value
        AppToast.show(this, "Video Color Space258: $value")
    }
// v258: Danmaku Bottom Max Count324


internal fun PlayerActivity.showV258DanmakuBottomMaxCount324Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258danmakuBottomMaxCount324).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count324",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258danmakuBottomMaxCount324 = value
        AppToast.show(this, "Danmaku Bottom Max Count324: $value")
    }
// v259: Danmaku Bottom Max Count325


internal fun PlayerActivity.showV259DanmakuBottomMaxCount325Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259danmakuBottomMaxCount325).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count325",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259danmakuBottomMaxCount325 = value
        AppToast.show(this, "Danmaku Bottom Max Count325: $value")
    }
// v259: Gesture Shake Action259


internal fun PlayerActivity.showV259GestureShakeAction259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259gestureShakeAction259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259gestureShakeAction259 = value
        AppToast.show(this, "Gesture Shake Action259: $value")
    }
// v259: Cast Audio Volume259


internal fun PlayerActivity.showV259CastAudioVolume259Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v259castAudioVolume259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259castAudioVolume259 = value
        AppToast.show(this, "Cast Audio Volume259: $value")
    }
// v259: Cache Download Speed260


internal fun PlayerActivity.showV259CacheDownloadSpeed260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259cacheDownloadSpeed260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259cacheDownloadSpeed260 = value
        AppToast.show(this, "Cache Download Speed260: $value")
    }
// v259: Video Color Space259


internal fun PlayerActivity.showV259VideoColorSpace259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259videoColorSpace259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259videoColorSpace259 = value
        AppToast.show(this, "Video Color Space259: $value")
    }
// v259: Danmaku Bottom Max Count326


internal fun PlayerActivity.showV259DanmakuBottomMaxCount326Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259danmakuBottomMaxCount326).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count326",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259danmakuBottomMaxCount326 = value
        AppToast.show(this, "Danmaku Bottom Max Count326: $value")
    }
// v260: Danmaku Bottom Max Count327


internal fun PlayerActivity.showV260DanmakuBottomMaxCount327Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260danmakuBottomMaxCount327).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count327",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260danmakuBottomMaxCount327 = value
        AppToast.show(this, "Danmaku Bottom Max Count327: $value")
    }
// v260: Gesture Shake Action260


internal fun PlayerActivity.showV260GestureShakeAction260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260gestureShakeAction260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260gestureShakeAction260 = value
        AppToast.show(this, "Gesture Shake Action260: $value")
    }
// v260: Cast Audio Volume260


internal fun PlayerActivity.showV260CastAudioVolume260Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v260castAudioVolume260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260castAudioVolume260 = value
        AppToast.show(this, "Cast Audio Volume260: $value")
    }
// v260: Cache Download Speed261


internal fun PlayerActivity.showV260CacheDownloadSpeed261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260cacheDownloadSpeed261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260cacheDownloadSpeed261 = value
        AppToast.show(this, "Cache Download Speed261: $value")
    }
// v260: Video Color Space260


internal fun PlayerActivity.showV260VideoColorSpace260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260videoColorSpace260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260videoColorSpace260 = value
        AppToast.show(this, "Video Color Space260: $value")
    }
// v260: Danmaku Bottom Max Count328


internal fun PlayerActivity.showV260DanmakuBottomMaxCount328Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260danmakuBottomMaxCount328).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count328",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260danmakuBottomMaxCount328 = value
        AppToast.show(this, "Danmaku Bottom Max Count328: $value")
    }
// v261: Danmaku Bottom Max Count329


internal fun PlayerActivity.showV261DanmakuBottomMaxCount329Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261danmakuBottomMaxCount329).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count329",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261danmakuBottomMaxCount329 = value
        AppToast.show(this, "Danmaku Bottom Max Count329: $value")
    }
// v261: Gesture Shake Action261


internal fun PlayerActivity.showV261GestureShakeAction261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261gestureShakeAction261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261gestureShakeAction261 = value
        AppToast.show(this, "Gesture Shake Action261: $value")
    }
// v261: Cast Audio Volume261


internal fun PlayerActivity.showV261CastAudioVolume261Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v261castAudioVolume261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261castAudioVolume261 = value
        AppToast.show(this, "Cast Audio Volume261: $value")
    }
// v261: Cache Download Speed262


internal fun PlayerActivity.showV261CacheDownloadSpeed262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261cacheDownloadSpeed262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261cacheDownloadSpeed262 = value
        AppToast.show(this, "Cache Download Speed262: $value")
    }
// v261: Video Color Space261


internal fun PlayerActivity.showV261VideoColorSpace261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261videoColorSpace261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261videoColorSpace261 = value
        AppToast.show(this, "Video Color Space261: $value")
    }
// v261: Danmaku Bottom Max Count330


internal fun PlayerActivity.showV261DanmakuBottomMaxCount330Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261danmakuBottomMaxCount330).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count330",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261danmakuBottomMaxCount330 = value
        AppToast.show(this, "Danmaku Bottom Max Count330: $value")
    }
// v262: Danmaku Bottom Max Count331


internal fun PlayerActivity.showV262DanmakuBottomMaxCount331Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262danmakuBottomMaxCount331).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count331",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262danmakuBottomMaxCount331 = value
        AppToast.show(this, "Danmaku Bottom Max Count331: $value")
    }
// v262: Gesture Shake Action262


internal fun PlayerActivity.showV262GestureShakeAction262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262gestureShakeAction262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262gestureShakeAction262 = value
        AppToast.show(this, "Gesture Shake Action262: $value")
    }
// v262: Cast Audio Volume262


internal fun PlayerActivity.showV262CastAudioVolume262Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v262castAudioVolume262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262castAudioVolume262 = value
        AppToast.show(this, "Cast Audio Volume262: $value")
    }
// v262: Cache Download Speed263


internal fun PlayerActivity.showV262CacheDownloadSpeed263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262cacheDownloadSpeed263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262cacheDownloadSpeed263 = value
        AppToast.show(this, "Cache Download Speed263: $value")
    }
// v262: Video Color Space262


internal fun PlayerActivity.showV262VideoColorSpace262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262videoColorSpace262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262videoColorSpace262 = value
        AppToast.show(this, "Video Color Space262: $value")
    }
// v262: Danmaku Bottom Max Count332


internal fun PlayerActivity.showV262DanmakuBottomMaxCount332Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262danmakuBottomMaxCount332).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count332",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262danmakuBottomMaxCount332 = value
        AppToast.show(this, "Danmaku Bottom Max Count332: $value")
    }
// v263: Danmaku Bottom Max Count333


internal fun PlayerActivity.showV263DanmakuBottomMaxCount333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263danmakuBottomMaxCount333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263danmakuBottomMaxCount333 = value
        AppToast.show(this, "Danmaku Bottom Max Count333: $value")
    }
// v263: Gesture Shake Action263


internal fun PlayerActivity.showV263GestureShakeAction263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263gestureShakeAction263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263gestureShakeAction263 = value
        AppToast.show(this, "Gesture Shake Action263: $value")
    }
// v263: Cast Audio Volume263


internal fun PlayerActivity.showV263CastAudioVolume263Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v263castAudioVolume263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263castAudioVolume263 = value
        AppToast.show(this, "Cast Audio Volume263: $value")
    }
// v263: Cache Download Speed264


internal fun PlayerActivity.showV263CacheDownloadSpeed264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263cacheDownloadSpeed264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263cacheDownloadSpeed264 = value
        AppToast.show(this, "Cache Download Speed264: $value")
    }
// v263: Video Color Space263


internal fun PlayerActivity.showV263VideoColorSpace263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263videoColorSpace263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263videoColorSpace263 = value
        AppToast.show(this, "Video Color Space263: $value")
    }
// v263: Danmaku Bottom Max Count334


internal fun PlayerActivity.showV263DanmakuBottomMaxCount334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263danmakuBottomMaxCount334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263danmakuBottomMaxCount334 = value
        AppToast.show(this, "Danmaku Bottom Max Count334: $value")
    }
// v264: Danmaku Bottom Max Count335


internal fun PlayerActivity.showV264DanmakuBottomMaxCount335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264danmakuBottomMaxCount335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264danmakuBottomMaxCount335 = value
        AppToast.show(this, "Danmaku Bottom Max Count335: $value")
    }
// v264: Gesture Shake Action264


internal fun PlayerActivity.showV264GestureShakeAction264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264gestureShakeAction264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264gestureShakeAction264 = value
        AppToast.show(this, "Gesture Shake Action264: $value")
    }
// v264: Cast Audio Volume264


internal fun PlayerActivity.showV264CastAudioVolume264Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v264castAudioVolume264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264castAudioVolume264 = value
        AppToast.show(this, "Cast Audio Volume264: $value")
    }
// v264: Cache Download Speed265


internal fun PlayerActivity.showV264CacheDownloadSpeed265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264cacheDownloadSpeed265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264cacheDownloadSpeed265 = value
        AppToast.show(this, "Cache Download Speed265: $value")
    }
// v264: Video Color Space264


internal fun PlayerActivity.showV264VideoColorSpace264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264videoColorSpace264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264videoColorSpace264 = value
        AppToast.show(this, "Video Color Space264: $value")
    }
// v264: Danmaku Bottom Max Count336


internal fun PlayerActivity.showV264DanmakuBottomMaxCount336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264danmakuBottomMaxCount336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264danmakuBottomMaxCount336 = value
        AppToast.show(this, "Danmaku Bottom Max Count336: $value")
    }
// v265: Danmaku Bottom Max Count337


internal fun PlayerActivity.showV265DanmakuBottomMaxCount337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265danmakuBottomMaxCount337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265danmakuBottomMaxCount337 = value
        AppToast.show(this, "Danmaku Bottom Max Count337: $value")
    }
// v265: Gesture Shake Action265


internal fun PlayerActivity.showV265GestureShakeAction265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265gestureShakeAction265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265gestureShakeAction265 = value
        AppToast.show(this, "Gesture Shake Action265: $value")
    }
// v265: Cast Audio Volume265


internal fun PlayerActivity.showV265CastAudioVolume265Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v265castAudioVolume265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265castAudioVolume265 = value
        AppToast.show(this, "Cast Audio Volume265: $value")
    }
// v265: Cache Download Speed266


internal fun PlayerActivity.showV265CacheDownloadSpeed266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265cacheDownloadSpeed266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265cacheDownloadSpeed266 = value
        AppToast.show(this, "Cache Download Speed266: $value")
    }
// v265: Video Color Space265


internal fun PlayerActivity.showV265VideoColorSpace265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265videoColorSpace265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265videoColorSpace265 = value
        AppToast.show(this, "Video Color Space265: $value")
    }
// v265: Danmaku Bottom Max Count338


internal fun PlayerActivity.showV265DanmakuBottomMaxCount338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265danmakuBottomMaxCount338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265danmakuBottomMaxCount338 = value
        AppToast.show(this, "Danmaku Bottom Max Count338: $value")
    }
// v266: Danmaku Bottom Max Count339


internal fun PlayerActivity.showV266DanmakuBottomMaxCount339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266danmakuBottomMaxCount339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266danmakuBottomMaxCount339 = value
        AppToast.show(this, "Danmaku Bottom Max Count339: $value")
    }
// v266: Gesture Shake Action266


internal fun PlayerActivity.showV266GestureShakeAction266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266gestureShakeAction266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266gestureShakeAction266 = value
        AppToast.show(this, "Gesture Shake Action266: $value")
    }
// v266: Cast Audio Volume266


internal fun PlayerActivity.showV266CastAudioVolume266Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v266castAudioVolume266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266castAudioVolume266 = value
        AppToast.show(this, "Cast Audio Volume266: $value")
    }
// v266: Cache Download Speed267


internal fun PlayerActivity.showV266CacheDownloadSpeed267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266cacheDownloadSpeed267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266cacheDownloadSpeed267 = value
        AppToast.show(this, "Cache Download Speed267: $value")
    }
// v266: Video Color Space266


internal fun PlayerActivity.showV266VideoColorSpace266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266videoColorSpace266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266videoColorSpace266 = value
        AppToast.show(this, "Video Color Space266: $value")
    }
// v266: Danmaku Bottom Max Count340


internal fun PlayerActivity.showV266DanmakuBottomMaxCount340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266danmakuBottomMaxCount340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266danmakuBottomMaxCount340 = value
        AppToast.show(this, "Danmaku Bottom Max Count340: $value")
    }
// v267: Danmaku Bottom Max Count341


internal fun PlayerActivity.showV267DanmakuBottomMaxCount341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267danmakuBottomMaxCount341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267danmakuBottomMaxCount341 = value
        AppToast.show(this, "Danmaku Bottom Max Count341: $value")
    }
// v267: Gesture Shake Action267


internal fun PlayerActivity.showV267GestureShakeAction267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267gestureShakeAction267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267gestureShakeAction267 = value
        AppToast.show(this, "Gesture Shake Action267: $value")
    }
// v267: Cast Audio Volume267


internal fun PlayerActivity.showV267CastAudioVolume267Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v267castAudioVolume267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267castAudioVolume267 = value
        AppToast.show(this, "Cast Audio Volume267: $value")
    }
// v267: Cache Download Speed268


internal fun PlayerActivity.showV267CacheDownloadSpeed268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267cacheDownloadSpeed268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267cacheDownloadSpeed268 = value
        AppToast.show(this, "Cache Download Speed268: $value")
    }
// v267: Video Color Space267


internal fun PlayerActivity.showV267VideoColorSpace267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267videoColorSpace267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267videoColorSpace267 = value
        AppToast.show(this, "Video Color Space267: $value")
    }
// v267: Danmaku Bottom Max Count342


internal fun PlayerActivity.showV267DanmakuBottomMaxCount342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267danmakuBottomMaxCount342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267danmakuBottomMaxCount342 = value
        AppToast.show(this, "Danmaku Bottom Max Count342: $value")
    }
// v268: Danmaku Bottom Max Count343


internal fun PlayerActivity.showV268DanmakuBottomMaxCount343Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268danmakuBottomMaxCount343).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count343",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268danmakuBottomMaxCount343 = value
        AppToast.show(this, "Danmaku Bottom Max Count343: $value")
    }
// v268: Gesture Shake Action268


internal fun PlayerActivity.showV268GestureShakeAction268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268gestureShakeAction268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268gestureShakeAction268 = value
        AppToast.show(this, "Gesture Shake Action268: $value")
    }
// v268: Cast Audio Volume268


internal fun PlayerActivity.showV268CastAudioVolume268Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v268castAudioVolume268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268castAudioVolume268 = value
        AppToast.show(this, "Cast Audio Volume268: $value")
    }
// v268: Cache Download Speed269


internal fun PlayerActivity.showV268CacheDownloadSpeed269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268cacheDownloadSpeed269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268cacheDownloadSpeed269 = value
        AppToast.show(this, "Cache Download Speed269: $value")
    }
// v268: Video Color Space268


internal fun PlayerActivity.showV268VideoColorSpace268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268videoColorSpace268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268videoColorSpace268 = value
        AppToast.show(this, "Video Color Space268: $value")
    }
// v268: Danmaku Bottom Max Count344


internal fun PlayerActivity.showV268DanmakuBottomMaxCount344Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268danmakuBottomMaxCount344).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count344",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268danmakuBottomMaxCount344 = value
        AppToast.show(this, "Danmaku Bottom Max Count344: $value")
    }
// v269: Danmaku Bottom Max Count345


internal fun PlayerActivity.showV269DanmakuBottomMaxCount345Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269danmakuBottomMaxCount345).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count345",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269danmakuBottomMaxCount345 = value
        AppToast.show(this, "Danmaku Bottom Max Count345: $value")
    }
// v269: Gesture Shake Action269


internal fun PlayerActivity.showV269GestureShakeAction269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269gestureShakeAction269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269gestureShakeAction269 = value
        AppToast.show(this, "Gesture Shake Action269: $value")
    }
// v269: Cast Audio Volume269


internal fun PlayerActivity.showV269CastAudioVolume269Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v269castAudioVolume269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269castAudioVolume269 = value
        AppToast.show(this, "Cast Audio Volume269: $value")
    }
// v269: Cache Download Speed270


internal fun PlayerActivity.showV269CacheDownloadSpeed270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269cacheDownloadSpeed270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269cacheDownloadSpeed270 = value
        AppToast.show(this, "Cache Download Speed270: $value")
    }
// v269: Video Color Space269


internal fun PlayerActivity.showV269VideoColorSpace269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269videoColorSpace269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269videoColorSpace269 = value
        AppToast.show(this, "Video Color Space269: $value")
    }
// v269: Danmaku Bottom Max Count346


internal fun PlayerActivity.showV269DanmakuBottomMaxCount346Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269danmakuBottomMaxCount346).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count346",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269danmakuBottomMaxCount346 = value
        AppToast.show(this, "Danmaku Bottom Max Count346: $value")
    }
// v270: Danmaku Bottom Max Count347


internal fun PlayerActivity.showV270DanmakuBottomMaxCount347Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270danmakuBottomMaxCount347).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count347",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270danmakuBottomMaxCount347 = value
        AppToast.show(this, "Danmaku Bottom Max Count347: $value")
    }
// v270: Gesture Shake Action270


internal fun PlayerActivity.showV270GestureShakeAction270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270gestureShakeAction270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270gestureShakeAction270 = value
        AppToast.show(this, "Gesture Shake Action270: $value")
    }
// v270: Cast Audio Volume270


internal fun PlayerActivity.showV270CastAudioVolume270Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v270castAudioVolume270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270castAudioVolume270 = value
        AppToast.show(this, "Cast Audio Volume270: $value")
    }
// v270: Cache Download Speed271


internal fun PlayerActivity.showV270CacheDownloadSpeed271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270cacheDownloadSpeed271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270cacheDownloadSpeed271 = value
        AppToast.show(this, "Cache Download Speed271: $value")
    }
// v270: Video Color Space270


internal fun PlayerActivity.showV270VideoColorSpace270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270videoColorSpace270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270videoColorSpace270 = value
        AppToast.show(this, "Video Color Space270: $value")
    }
// v270: Danmaku Bottom Max Count348


internal fun PlayerActivity.showV270DanmakuBottomMaxCount348Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270danmakuBottomMaxCount348).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count348",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270danmakuBottomMaxCount348 = value
        AppToast.show(this, "Danmaku Bottom Max Count348: $value")
    }
// v271: Danmaku Bottom Max Count349


internal fun PlayerActivity.showV271DanmakuBottomMaxCount349Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271danmakuBottomMaxCount349).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count349",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271danmakuBottomMaxCount349 = value
        AppToast.show(this, "Danmaku Bottom Max Count349: $value")
    }
// v271: Gesture Shake Action271


internal fun PlayerActivity.showV271GestureShakeAction271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271gestureShakeAction271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271gestureShakeAction271 = value
        AppToast.show(this, "Gesture Shake Action271: $value")
    }
// v271: Cast Audio Volume271


internal fun PlayerActivity.showV271CastAudioVolume271Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v271castAudioVolume271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271castAudioVolume271 = value
        AppToast.show(this, "Cast Audio Volume271: $value")
    }
// v271: Cache Download Speed272


internal fun PlayerActivity.showV271CacheDownloadSpeed272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271cacheDownloadSpeed272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271cacheDownloadSpeed272 = value
        AppToast.show(this, "Cache Download Speed272: $value")
    }
// v271: Video Color Space271


internal fun PlayerActivity.showV271VideoColorSpace271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271videoColorSpace271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271videoColorSpace271 = value
        AppToast.show(this, "Video Color Space271: $value")
    }
// v271: Danmaku Bottom Max Count350


internal fun PlayerActivity.showV271DanmakuBottomMaxCount350Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271danmakuBottomMaxCount350).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count350",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271danmakuBottomMaxCount350 = value
        AppToast.show(this, "Danmaku Bottom Max Count350: $value")
    }
// v272: Danmaku Bottom Max Count351


internal fun PlayerActivity.showV272DanmakuBottomMaxCount351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272danmakuBottomMaxCount351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272danmakuBottomMaxCount351 = value
        AppToast.show(this, "Danmaku Bottom Max Count351: $value")
    }
// v272: Gesture Shake Action272


internal fun PlayerActivity.showV272GestureShakeAction272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272gestureShakeAction272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272gestureShakeAction272 = value
        AppToast.show(this, "Gesture Shake Action272: $value")
    }
// v272: Cast Audio Volume272


internal fun PlayerActivity.showV272CastAudioVolume272Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v272castAudioVolume272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272castAudioVolume272 = value
        AppToast.show(this, "Cast Audio Volume272: $value")
    }
// v272: Cache Download Speed273


internal fun PlayerActivity.showV272CacheDownloadSpeed273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272cacheDownloadSpeed273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272cacheDownloadSpeed273 = value
        AppToast.show(this, "Cache Download Speed273: $value")
    }
// v272: Video Color Space272


internal fun PlayerActivity.showV272VideoColorSpace272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272videoColorSpace272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272videoColorSpace272 = value
        AppToast.show(this, "Video Color Space272: $value")
    }
// v272: Danmaku Bottom Max Count352


internal fun PlayerActivity.showV272DanmakuBottomMaxCount352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272danmakuBottomMaxCount352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272danmakuBottomMaxCount352 = value
        AppToast.show(this, "Danmaku Bottom Max Count352: $value")
    }
// v273: Danmaku Bottom Max Count353


internal fun PlayerActivity.showV273DanmakuBottomMaxCount353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273danmakuBottomMaxCount353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273danmakuBottomMaxCount353 = value
        AppToast.show(this, "Danmaku Bottom Max Count353: $value")
    }
// v273: Gesture Shake Action273


internal fun PlayerActivity.showV273GestureShakeAction273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273gestureShakeAction273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273gestureShakeAction273 = value
        AppToast.show(this, "Gesture Shake Action273: $value")
    }
// v273: Cast Audio Volume273


internal fun PlayerActivity.showV273CastAudioVolume273Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v273castAudioVolume273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273castAudioVolume273 = value
        AppToast.show(this, "Cast Audio Volume273: $value")
    }
// v273: Cache Download Speed274


internal fun PlayerActivity.showV273CacheDownloadSpeed274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273cacheDownloadSpeed274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273cacheDownloadSpeed274 = value
        AppToast.show(this, "Cache Download Speed274: $value")
    }
// v273: Video Color Space273


internal fun PlayerActivity.showV273VideoColorSpace273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273videoColorSpace273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273videoColorSpace273 = value
        AppToast.show(this, "Video Color Space273: $value")
    }
// v273: Danmaku Bottom Max Count354


internal fun PlayerActivity.showV273DanmakuBottomMaxCount354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273danmakuBottomMaxCount354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273danmakuBottomMaxCount354 = value
        AppToast.show(this, "Danmaku Bottom Max Count354: $value")
    }
// v274: Danmaku Bottom Max Count355


internal fun PlayerActivity.showV274DanmakuBottomMaxCount355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274danmakuBottomMaxCount355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274danmakuBottomMaxCount355 = value
        AppToast.show(this, "Danmaku Bottom Max Count355: $value")
    }
// v274: Gesture Shake Action274


internal fun PlayerActivity.showV274GestureShakeAction274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274gestureShakeAction274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274gestureShakeAction274 = value
        AppToast.show(this, "Gesture Shake Action274: $value")
    }
// v274: Cast Audio Volume274


internal fun PlayerActivity.showV274CastAudioVolume274Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v274castAudioVolume274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274castAudioVolume274 = value
        AppToast.show(this, "Cast Audio Volume274: $value")
    }
// v274: Cache Download Speed275


internal fun PlayerActivity.showV274CacheDownloadSpeed275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274cacheDownloadSpeed275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274cacheDownloadSpeed275 = value
        AppToast.show(this, "Cache Download Speed275: $value")
    }
// v274: Video Color Space274


internal fun PlayerActivity.showV274VideoColorSpace274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274videoColorSpace274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274videoColorSpace274 = value
        AppToast.show(this, "Video Color Space274: $value")
    }
// v274: Danmaku Bottom Max Count356


internal fun PlayerActivity.showV274DanmakuBottomMaxCount356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274danmakuBottomMaxCount356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274danmakuBottomMaxCount356 = value
        AppToast.show(this, "Danmaku Bottom Max Count356: $value")
    }
// v275: Danmaku Bottom Max Count357


internal fun PlayerActivity.showV275DanmakuBottomMaxCount357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275danmakuBottomMaxCount357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275danmakuBottomMaxCount357 = value
        AppToast.show(this, "Danmaku Bottom Max Count357: $value")
    }
// v275: Gesture Shake Action275


internal fun PlayerActivity.showV275GestureShakeAction275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275gestureShakeAction275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275gestureShakeAction275 = value
        AppToast.show(this, "Gesture Shake Action275: $value")
    }
// v275: Cast Audio Volume275


internal fun PlayerActivity.showV275CastAudioVolume275Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v275castAudioVolume275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275castAudioVolume275 = value
        AppToast.show(this, "Cast Audio Volume275: $value")
    }
// v275: Cache Download Speed276


internal fun PlayerActivity.showV275CacheDownloadSpeed276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275cacheDownloadSpeed276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275cacheDownloadSpeed276 = value
        AppToast.show(this, "Cache Download Speed276: $value")
    }
// v275: Video Color Space275


internal fun PlayerActivity.showV275VideoColorSpace275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275videoColorSpace275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275videoColorSpace275 = value
        AppToast.show(this, "Video Color Space275: $value")
    }
// v275: Danmaku Bottom Max Count358


internal fun PlayerActivity.showV275DanmakuBottomMaxCount358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275danmakuBottomMaxCount358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275danmakuBottomMaxCount358 = value
        AppToast.show(this, "Danmaku Bottom Max Count358: $value")
    }
// v276: Danmaku Bottom Max Count359


internal fun PlayerActivity.showV276DanmakuBottomMaxCount359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276danmakuBottomMaxCount359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276danmakuBottomMaxCount359 = value
        AppToast.show(this, "Danmaku Bottom Max Count359: $value")
    }
// v276: Gesture Shake Action276


internal fun PlayerActivity.showV276GestureShakeAction276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276gestureShakeAction276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276gestureShakeAction276 = value
        AppToast.show(this, "Gesture Shake Action276: $value")
    }
// v276: Cast Audio Volume276


internal fun PlayerActivity.showV276CastAudioVolume276Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v276castAudioVolume276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276castAudioVolume276 = value
        AppToast.show(this, "Cast Audio Volume276: $value")
    }
// v276: Cache Download Speed277


internal fun PlayerActivity.showV276CacheDownloadSpeed277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276cacheDownloadSpeed277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276cacheDownloadSpeed277 = value
        AppToast.show(this, "Cache Download Speed277: $value")
    }
// v276: Video Color Space276


internal fun PlayerActivity.showV276VideoColorSpace276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276videoColorSpace276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276videoColorSpace276 = value
        AppToast.show(this, "Video Color Space276: $value")
    }
// v276: Danmaku Bottom Max Count360


internal fun PlayerActivity.showV276DanmakuBottomMaxCount360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276danmakuBottomMaxCount360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276danmakuBottomMaxCount360 = value
        AppToast.show(this, "Danmaku Bottom Max Count360: $value")
    }
// v277: Danmaku Bottom Max Count361


internal fun PlayerActivity.showV277DanmakuBottomMaxCount361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277danmakuBottomMaxCount361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277danmakuBottomMaxCount361 = value
        AppToast.show(this, "Danmaku Bottom Max Count361: $value")
    }
// v277: Gesture Shake Action277


internal fun PlayerActivity.showV277GestureShakeAction277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277gestureShakeAction277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277gestureShakeAction277 = value
        AppToast.show(this, "Gesture Shake Action277: $value")
    }
// v277: Cast Audio Volume277


internal fun PlayerActivity.showV277CastAudioVolume277Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v277castAudioVolume277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277castAudioVolume277 = value
        AppToast.show(this, "Cast Audio Volume277: $value")
    }
// v277: Cache Download Speed278


internal fun PlayerActivity.showV277CacheDownloadSpeed278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277cacheDownloadSpeed278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277cacheDownloadSpeed278 = value
        AppToast.show(this, "Cache Download Speed278: $value")
    }
// v277: Video Color Space277


internal fun PlayerActivity.showV277VideoColorSpace277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277videoColorSpace277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277videoColorSpace277 = value
        AppToast.show(this, "Video Color Space277: $value")
    }
// v277: Danmaku Bottom Max Count362


internal fun PlayerActivity.showV277DanmakuBottomMaxCount362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277danmakuBottomMaxCount362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277danmakuBottomMaxCount362 = value
        AppToast.show(this, "Danmaku Bottom Max Count362: $value")
    }
// v278: Danmaku Bottom Max Count363


internal fun PlayerActivity.showV278DanmakuBottomMaxCount363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278danmakuBottomMaxCount363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278danmakuBottomMaxCount363 = value
        AppToast.show(this, "Danmaku Bottom Max Count363: $value")
    }
// v278: Gesture Shake Action278


internal fun PlayerActivity.showV278GestureShakeAction278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278gestureShakeAction278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278gestureShakeAction278 = value
        AppToast.show(this, "Gesture Shake Action278: $value")
    }
// v278: Cast Audio Volume278


internal fun PlayerActivity.showV278CastAudioVolume278Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v278castAudioVolume278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278castAudioVolume278 = value
        AppToast.show(this, "Cast Audio Volume278: $value")
    }
// v278: Cache Download Speed279


internal fun PlayerActivity.showV278CacheDownloadSpeed279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278cacheDownloadSpeed279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278cacheDownloadSpeed279 = value
        AppToast.show(this, "Cache Download Speed279: $value")
    }
// v278: Video Color Space278


internal fun PlayerActivity.showV278VideoColorSpace278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278videoColorSpace278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278videoColorSpace278 = value
        AppToast.show(this, "Video Color Space278: $value")
    }
// v278: Danmaku Bottom Max Count364


internal fun PlayerActivity.showV278DanmakuBottomMaxCount364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278danmakuBottomMaxCount364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278danmakuBottomMaxCount364 = value
        AppToast.show(this, "Danmaku Bottom Max Count364: $value")
    }
// v279: Danmaku Bottom Max Count365


internal fun PlayerActivity.showV279DanmakuBottomMaxCount365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279danmakuBottomMaxCount365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279danmakuBottomMaxCount365 = value
        AppToast.show(this, "Danmaku Bottom Max Count365: $value")
    }
// v279: Gesture Shake Action279


internal fun PlayerActivity.showV279GestureShakeAction279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279gestureShakeAction279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279gestureShakeAction279 = value
        AppToast.show(this, "Gesture Shake Action279: $value")
    }
// v279: Cast Audio Volume279


internal fun PlayerActivity.showV279CastAudioVolume279Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v279castAudioVolume279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279castAudioVolume279 = value
        AppToast.show(this, "Cast Audio Volume279: $value")
    }
// v279: Cache Download Speed280


internal fun PlayerActivity.showV279CacheDownloadSpeed280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279cacheDownloadSpeed280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279cacheDownloadSpeed280 = value
        AppToast.show(this, "Cache Download Speed280: $value")
    }
// v279: Video Color Space279


internal fun PlayerActivity.showV279VideoColorSpace279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279videoColorSpace279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279videoColorSpace279 = value
        AppToast.show(this, "Video Color Space279: $value")
    }
// v279: Danmaku Bottom Max Count366


internal fun PlayerActivity.showV279DanmakuBottomMaxCount366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279danmakuBottomMaxCount366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279danmakuBottomMaxCount366 = value
        AppToast.show(this, "Danmaku Bottom Max Count366: $value")
    }
// v280: Danmaku Bottom Max Count367


internal fun PlayerActivity.showV280DanmakuBottomMaxCount367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280danmakuBottomMaxCount367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280danmakuBottomMaxCount367 = value
        AppToast.show(this, "Danmaku Bottom Max Count367: $value")
    }
// v280: Gesture Shake Action280


internal fun PlayerActivity.showV280GestureShakeAction280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280gestureShakeAction280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280gestureShakeAction280 = value
        AppToast.show(this, "Gesture Shake Action280: $value")
    }
// v280: Cast Audio Volume280


internal fun PlayerActivity.showV280CastAudioVolume280Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v280castAudioVolume280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280castAudioVolume280 = value
        AppToast.show(this, "Cast Audio Volume280: $value")
    }
// v280: Cache Download Speed281


internal fun PlayerActivity.showV280CacheDownloadSpeed281Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280cacheDownloadSpeed281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280cacheDownloadSpeed281 = value
        AppToast.show(this, "Cache Download Speed281: $value")
    }
// v280: Video Color Space280


internal fun PlayerActivity.showV280VideoColorSpace280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280videoColorSpace280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280videoColorSpace280 = value
        AppToast.show(this, "Video Color Space280: $value")
    }
// v280: Danmaku Bottom Max Count368


internal fun PlayerActivity.showV280DanmakuBottomMaxCount368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280danmakuBottomMaxCount368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280danmakuBottomMaxCount368 = value
        AppToast.show(this, "Danmaku Bottom Max Count368: $value")
    }
// v281: Danmaku Bottom Max Count369


internal fun PlayerActivity.showV281DanmakuBottomMaxCount369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281danmakuBottomMaxCount369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281danmakuBottomMaxCount369 = value
        AppToast.show(this, "Danmaku Bottom Max Count369: $value")
    }
// v281: Gesture Shake Action281


internal fun PlayerActivity.showV281GestureShakeAction281Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281gestureShakeAction281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281gestureShakeAction281 = value
        AppToast.show(this, "Gesture Shake Action281: $value")
    }
// v281: Cast Audio Volume281


internal fun PlayerActivity.showV281CastAudioVolume281Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v281castAudioVolume281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281castAudioVolume281 = value
        AppToast.show(this, "Cast Audio Volume281: $value")
    }
// v281: Cache Download Speed282


internal fun PlayerActivity.showV281CacheDownloadSpeed282Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281cacheDownloadSpeed282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281cacheDownloadSpeed282 = value
        AppToast.show(this, "Cache Download Speed282: $value")
    }
// v281: Video Color Space281


internal fun PlayerActivity.showV281VideoColorSpace281Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281videoColorSpace281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281videoColorSpace281 = value
        AppToast.show(this, "Video Color Space281: $value")
    }
// v281: Danmaku Bottom Max Count370


internal fun PlayerActivity.showV281DanmakuBottomMaxCount370Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281danmakuBottomMaxCount370).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count370",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281danmakuBottomMaxCount370 = value
        AppToast.show(this, "Danmaku Bottom Max Count370: $value")
    }
// v282: Danmaku Bottom Max Count371


internal fun PlayerActivity.showV282DanmakuBottomMaxCount371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v282danmakuBottomMaxCount371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v282danmakuBottomMaxCount371 = value
        AppToast.show(this, "Danmaku Bottom Max Count371: $value")
    }
// v282: Gesture Shake Action282


internal fun PlayerActivity.showV282GestureShakeAction282Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v282gestureShakeAction282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v282gestureShakeAction282 = value
        AppToast.show(this, "Gesture Shake Action282: $value")
    }
// v282: Cast Audio Volume282


internal fun PlayerActivity.showV282CastAudioVolume282Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v282castAudioVolume282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v282castAudioVolume282 = value
        AppToast.show(this, "Cast Audio Volume282: $value")
    }
// v282: Cache Download Speed283


internal fun PlayerActivity.showV282CacheDownloadSpeed283Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v282cacheDownloadSpeed283).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed283",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v282cacheDownloadSpeed283 = value
        AppToast.show(this, "Cache Download Speed283: $value")
    }
// v282: Video Color Space282


internal fun PlayerActivity.showV282VideoColorSpace282Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v282videoColorSpace282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v282videoColorSpace282 = value
        AppToast.show(this, "Video Color Space282: $value")
    }
// v282: Danmaku Bottom Max Count372


internal fun PlayerActivity.showV282DanmakuBottomMaxCount372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v282danmakuBottomMaxCount372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v282danmakuBottomMaxCount372 = value
        AppToast.show(this, "Danmaku Bottom Max Count372: $value")
    }
// v283: Danmaku Bottom Max Count373


internal fun PlayerActivity.showV283DanmakuBottomMaxCount373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v283danmakuBottomMaxCount373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v283danmakuBottomMaxCount373 = value
        AppToast.show(this, "Danmaku Bottom Max Count373: $value")
    }
// v283: Gesture Shake Action283


internal fun PlayerActivity.showV283GestureShakeAction283Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v283gestureShakeAction283).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action283",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v283gestureShakeAction283 = value
        AppToast.show(this, "Gesture Shake Action283: $value")
    }
// v283: Cast Audio Volume283


internal fun PlayerActivity.showV283CastAudioVolume283Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v283castAudioVolume283).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume283",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v283castAudioVolume283 = value
        AppToast.show(this, "Cast Audio Volume283: $value")
    }
// v283: Cache Download Speed284




