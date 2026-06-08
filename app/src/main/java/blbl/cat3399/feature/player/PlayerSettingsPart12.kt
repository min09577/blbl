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

internal fun PlayerActivity.showV316AudioCompressorRatio298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316audioCompressorRatio298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316audioCompressorRatio298 = value
        AppToast.show(this, "Audio Compressor Ratio298: $value")
    }
// v316: Danmaku Bottom Max Count439


internal fun PlayerActivity.showV316DanmakuBottomMaxCount439Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316danmakuBottomMaxCount439).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count439",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316danmakuBottomMaxCount439 = value
        AppToast.show(this, "Danmaku Bottom Max Count439: $value")
    }
// v316: Gesture Shake Sensitivity298


internal fun PlayerActivity.showV316GestureShakeSensitivity298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316gestureShakeSensitivity298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316gestureShakeSensitivity298 = value
        AppToast.show(this, "Gesture Shake Sensitivity298: $value")
    }
// v316: Cast Bitrate298


internal fun PlayerActivity.showV316CastBitrate298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316castBitrate298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316castBitrate298 = value
        AppToast.show(this, "Cast Bitrate298: $value")
    }
// v316: Cache Preload Size299


internal fun PlayerActivity.showV316CachePreloadSize299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316cachePreloadSize299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316cachePreloadSize299 = value
        AppToast.show(this, "Cache Preload Size299: $value")
    }
// v316: Progress Bar Style298


internal fun PlayerActivity.showV316ProgressBarStyle298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316progressBarStyle298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316progressBarStyle298 = value
        AppToast.show(this, "Progress Bar Style298: $value")
    }
// v316: Danmaku Bottom Max Count440


internal fun PlayerActivity.showV316DanmakuBottomMaxCount440Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316danmakuBottomMaxCount440).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count440",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316danmakuBottomMaxCount440 = value
        AppToast.show(this, "Danmaku Bottom Max Count440: $value")
    }
// v317: Audio Compressor Ratio299


internal fun PlayerActivity.showV317AudioCompressorRatio299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317audioCompressorRatio299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317audioCompressorRatio299 = value
        AppToast.show(this, "Audio Compressor Ratio299: $value")
    }
// v317: Danmaku Bottom Max Count441


internal fun PlayerActivity.showV317DanmakuBottomMaxCount441Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317danmakuBottomMaxCount441).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count441",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317danmakuBottomMaxCount441 = value
        AppToast.show(this, "Danmaku Bottom Max Count441: $value")
    }
// v317: Gesture Shake Sensitivity299


internal fun PlayerActivity.showV317GestureShakeSensitivity299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317gestureShakeSensitivity299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317gestureShakeSensitivity299 = value
        AppToast.show(this, "Gesture Shake Sensitivity299: $value")
    }
// v317: Cast Bitrate299


internal fun PlayerActivity.showV317CastBitrate299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317castBitrate299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317castBitrate299 = value
        AppToast.show(this, "Cast Bitrate299: $value")
    }
// v317: Cache Preload Size300


internal fun PlayerActivity.showV317CachePreloadSize300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317cachePreloadSize300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317cachePreloadSize300 = value
        AppToast.show(this, "Cache Preload Size300: $value")
    }
// v317: Progress Bar Style299


internal fun PlayerActivity.showV317ProgressBarStyle299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317progressBarStyle299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317progressBarStyle299 = value
        AppToast.show(this, "Progress Bar Style299: $value")
    }
// v317: Danmaku Bottom Max Count442


internal fun PlayerActivity.showV317DanmakuBottomMaxCount442Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317danmakuBottomMaxCount442).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count442",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317danmakuBottomMaxCount442 = value
        AppToast.show(this, "Danmaku Bottom Max Count442: $value")
    }
// v318: Audio Compressor Ratio300


internal fun PlayerActivity.showV318AudioCompressorRatio300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318audioCompressorRatio300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318audioCompressorRatio300 = value
        AppToast.show(this, "Audio Compressor Ratio300: $value")
    }
// v318: Danmaku Bottom Max Count443


internal fun PlayerActivity.showV318DanmakuBottomMaxCount443Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318danmakuBottomMaxCount443).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count443",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318danmakuBottomMaxCount443 = value
        AppToast.show(this, "Danmaku Bottom Max Count443: $value")
    }
// v318: Gesture Shake Sensitivity300


internal fun PlayerActivity.showV318GestureShakeSensitivity300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318gestureShakeSensitivity300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318gestureShakeSensitivity300 = value
        AppToast.show(this, "Gesture Shake Sensitivity300: $value")
    }
// v318: Cast Bitrate300


internal fun PlayerActivity.showV318CastBitrate300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318castBitrate300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318castBitrate300 = value
        AppToast.show(this, "Cast Bitrate300: $value")
    }
// v318: Cache Preload Size301


internal fun PlayerActivity.showV318CachePreloadSize301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318cachePreloadSize301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318cachePreloadSize301 = value
        AppToast.show(this, "Cache Preload Size301: $value")
    }
// v318: Progress Bar Style300


internal fun PlayerActivity.showV318ProgressBarStyle300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318progressBarStyle300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318progressBarStyle300 = value
        AppToast.show(this, "Progress Bar Style300: $value")
    }
// v318: Danmaku Bottom Max Count444


internal fun PlayerActivity.showV318DanmakuBottomMaxCount444Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318danmakuBottomMaxCount444).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count444",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318danmakuBottomMaxCount444 = value
        AppToast.show(this, "Danmaku Bottom Max Count444: $value")
    }
// v319: Audio Compressor Ratio301


internal fun PlayerActivity.showV319AudioCompressorRatio301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319audioCompressorRatio301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319audioCompressorRatio301 = value
        AppToast.show(this, "Audio Compressor Ratio301: $value")
    }
// v319: Danmaku Bottom Max Count445


internal fun PlayerActivity.showV319DanmakuBottomMaxCount445Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319danmakuBottomMaxCount445).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count445",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319danmakuBottomMaxCount445 = value
        AppToast.show(this, "Danmaku Bottom Max Count445: $value")
    }
// v319: Gesture Shake Sensitivity301


internal fun PlayerActivity.showV319GestureShakeSensitivity301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319gestureShakeSensitivity301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319gestureShakeSensitivity301 = value
        AppToast.show(this, "Gesture Shake Sensitivity301: $value")
    }
// v319: Cast Bitrate301


internal fun PlayerActivity.showV319CastBitrate301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319castBitrate301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319castBitrate301 = value
        AppToast.show(this, "Cast Bitrate301: $value")
    }
// v319: Cache Preload Size302


internal fun PlayerActivity.showV319CachePreloadSize302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319cachePreloadSize302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319cachePreloadSize302 = value
        AppToast.show(this, "Cache Preload Size302: $value")
    }
// v319: Progress Bar Style301


internal fun PlayerActivity.showV319ProgressBarStyle301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319progressBarStyle301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319progressBarStyle301 = value
        AppToast.show(this, "Progress Bar Style301: $value")
    }
// v319: Danmaku Bottom Max Count446


internal fun PlayerActivity.showV319DanmakuBottomMaxCount446Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319danmakuBottomMaxCount446).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count446",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319danmakuBottomMaxCount446 = value
        AppToast.show(this, "Danmaku Bottom Max Count446: $value")
    }
// v320: Audio Compressor Ratio302


internal fun PlayerActivity.showV320AudioCompressorRatio302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320audioCompressorRatio302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320audioCompressorRatio302 = value
        AppToast.show(this, "Audio Compressor Ratio302: $value")
    }
// v320: Danmaku Bottom Max Count447


internal fun PlayerActivity.showV320DanmakuBottomMaxCount447Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320danmakuBottomMaxCount447).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count447",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320danmakuBottomMaxCount447 = value
        AppToast.show(this, "Danmaku Bottom Max Count447: $value")
    }
// v320: Gesture Shake Sensitivity302


internal fun PlayerActivity.showV320GestureShakeSensitivity302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320gestureShakeSensitivity302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320gestureShakeSensitivity302 = value
        AppToast.show(this, "Gesture Shake Sensitivity302: $value")
    }
// v320: Cast Bitrate302


internal fun PlayerActivity.showV320CastBitrate302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320castBitrate302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320castBitrate302 = value
        AppToast.show(this, "Cast Bitrate302: $value")
    }
// v320: Cache Preload Size303


internal fun PlayerActivity.showV320CachePreloadSize303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320cachePreloadSize303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320cachePreloadSize303 = value
        AppToast.show(this, "Cache Preload Size303: $value")
    }
// v320: Progress Bar Style302


internal fun PlayerActivity.showV320ProgressBarStyle302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320progressBarStyle302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320progressBarStyle302 = value
        AppToast.show(this, "Progress Bar Style302: $value")
    }
// v320: Danmaku Bottom Max Count448


internal fun PlayerActivity.showV320DanmakuBottomMaxCount448Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320danmakuBottomMaxCount448).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count448",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320danmakuBottomMaxCount448 = value
        AppToast.show(this, "Danmaku Bottom Max Count448: $value")
    }
// v321: Audio Dynamic Range303


internal fun PlayerActivity.showV321AudioDynamicRange303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321audioDynamicRange303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321audioDynamicRange303 = value
        AppToast.show(this, "Audio Dynamic Range303: $value")
    }
// v321: Danmaku Top Count Max303


internal fun PlayerActivity.showV321DanmakuTopCountMax303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321danmakuTopCountMax303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321danmakuTopCountMax303 = value
        AppToast.show(this, "Danmaku Top Count Max303: $value")
    }
// v321: Subtitle Stroke Width303


internal fun PlayerActivity.showV321SubtitleStrokeWidth303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321subtitleStrokeWidth303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321subtitleStrokeWidth303 = value
        AppToast.show(this, "Subtitle Stroke Width303: $value")
    }
// v321: Gesture Long Press Action303


internal fun PlayerActivity.showV321GestureLongPressAction303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321gestureLongPressAction303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321gestureLongPressAction303 = value
        AppToast.show(this, "Gesture Long Press Action303: $value")
    }
// v321: Cast Quality303


internal fun PlayerActivity.showV321CastQuality303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321castQuality303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321castQuality303 = value
        AppToast.show(this, "Cast Quality303: $value")
    }
// v321: Playlist Repeat Mode303


internal fun PlayerActivity.showV321PlaylistRepeatMode303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321playlistRepeatMode303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321playlistRepeatMode303 = value
        AppToast.show(this, "Playlist Repeat Mode303: $value")
    }
// v321: Cache Max Size303


internal fun PlayerActivity.showV321CacheMaxSize303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321cacheMaxSize303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321cacheMaxSize303 = value
        AppToast.show(this, "Cache Max Size303: $value")
    }
// v321: Progress Bar Height303


internal fun PlayerActivity.showV321ProgressBarHeight303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321progressBarHeight303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321progressBarHeight303 = value
        AppToast.show(this, "Progress Bar Height303: $value")
    }
// v321: Screenshot Format303


internal fun PlayerActivity.showV321ScreenshotFormat303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321screenshotFormat303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321screenshotFormat303 = value
        AppToast.show(this, "Screenshot Format303: $value")
    }
// v321: Danmaku Top Count Max304


internal fun PlayerActivity.showV321DanmakuTopCountMax304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321danmakuTopCountMax304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321danmakuTopCountMax304 = value
        AppToast.show(this, "Danmaku Top Count Max304: $value")
    }
// v321: Subtitle Stroke Width304


internal fun PlayerActivity.showV321SubtitleStrokeWidth304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321subtitleStrokeWidth304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321subtitleStrokeWidth304 = value
        AppToast.show(this, "Subtitle Stroke Width304: $value")
    }
// v322: Audio Dynamic Range304


internal fun PlayerActivity.showV322AudioDynamicRange304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322audioDynamicRange304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322audioDynamicRange304 = value
        AppToast.show(this, "Audio Dynamic Range304: $value")
    }
// v322: Danmaku Top Count Max305


internal fun PlayerActivity.showV322DanmakuTopCountMax305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322danmakuTopCountMax305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322danmakuTopCountMax305 = value
        AppToast.show(this, "Danmaku Top Count Max305: $value")
    }
// v322: Subtitle Stroke Width305


internal fun PlayerActivity.showV322SubtitleStrokeWidth305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322subtitleStrokeWidth305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322subtitleStrokeWidth305 = value
        AppToast.show(this, "Subtitle Stroke Width305: $value")
    }
// v322: Gesture Long Press Action304


internal fun PlayerActivity.showV322GestureLongPressAction304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322gestureLongPressAction304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322gestureLongPressAction304 = value
        AppToast.show(this, "Gesture Long Press Action304: $value")
    }
// v322: Cast Quality304


internal fun PlayerActivity.showV322CastQuality304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322castQuality304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322castQuality304 = value
        AppToast.show(this, "Cast Quality304: $value")
    }
// v322: Playlist Repeat Mode304


internal fun PlayerActivity.showV322PlaylistRepeatMode304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322playlistRepeatMode304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322playlistRepeatMode304 = value
        AppToast.show(this, "Playlist Repeat Mode304: $value")
    }
// v322: Cache Max Size304


internal fun PlayerActivity.showV322CacheMaxSize304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322cacheMaxSize304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322cacheMaxSize304 = value
        AppToast.show(this, "Cache Max Size304: $value")
    }
// v322: Progress Bar Height304


internal fun PlayerActivity.showV322ProgressBarHeight304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322progressBarHeight304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322progressBarHeight304 = value
        AppToast.show(this, "Progress Bar Height304: $value")
    }
// v322: Screenshot Format304


internal fun PlayerActivity.showV322ScreenshotFormat304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322screenshotFormat304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322screenshotFormat304 = value
        AppToast.show(this, "Screenshot Format304: $value")
    }
// v322: Danmaku Top Count Max306


internal fun PlayerActivity.showV322DanmakuTopCountMax306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322danmakuTopCountMax306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322danmakuTopCountMax306 = value
        AppToast.show(this, "Danmaku Top Count Max306: $value")
    }
// v322: Subtitle Stroke Width306


internal fun PlayerActivity.showV322SubtitleStrokeWidth306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322subtitleStrokeWidth306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322subtitleStrokeWidth306 = value
        AppToast.show(this, "Subtitle Stroke Width306: $value")
    }
// v323: Audio Dynamic Range305


internal fun PlayerActivity.showV323AudioDynamicRange305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323audioDynamicRange305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323audioDynamicRange305 = value
        AppToast.show(this, "Audio Dynamic Range305: $value")
    }
// v323: Danmaku Top Count Max307


internal fun PlayerActivity.showV323DanmakuTopCountMax307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323danmakuTopCountMax307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323danmakuTopCountMax307 = value
        AppToast.show(this, "Danmaku Top Count Max307: $value")
    }
// v323: Subtitle Stroke Width307


internal fun PlayerActivity.showV323SubtitleStrokeWidth307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323subtitleStrokeWidth307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323subtitleStrokeWidth307 = value
        AppToast.show(this, "Subtitle Stroke Width307: $value")
    }
// v323: Gesture Long Press Action305


internal fun PlayerActivity.showV323GestureLongPressAction305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323gestureLongPressAction305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323gestureLongPressAction305 = value
        AppToast.show(this, "Gesture Long Press Action305: $value")
    }
// v323: Cast Quality305


internal fun PlayerActivity.showV323CastQuality305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323castQuality305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323castQuality305 = value
        AppToast.show(this, "Cast Quality305: $value")
    }
// v323: Playlist Repeat Mode305


internal fun PlayerActivity.showV323PlaylistRepeatMode305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323playlistRepeatMode305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323playlistRepeatMode305 = value
        AppToast.show(this, "Playlist Repeat Mode305: $value")
    }
// v323: Cache Max Size305


internal fun PlayerActivity.showV323CacheMaxSize305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323cacheMaxSize305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323cacheMaxSize305 = value
        AppToast.show(this, "Cache Max Size305: $value")
    }
// v323: Progress Bar Height305


internal fun PlayerActivity.showV323ProgressBarHeight305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323progressBarHeight305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323progressBarHeight305 = value
        AppToast.show(this, "Progress Bar Height305: $value")
    }
// v323: Screenshot Format305


internal fun PlayerActivity.showV323ScreenshotFormat305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323screenshotFormat305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323screenshotFormat305 = value
        AppToast.show(this, "Screenshot Format305: $value")
    }
// v323: Danmaku Top Count Max308


internal fun PlayerActivity.showV323DanmakuTopCountMax308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323danmakuTopCountMax308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323danmakuTopCountMax308 = value
        AppToast.show(this, "Danmaku Top Count Max308: $value")
    }
// v323: Subtitle Stroke Width308


internal fun PlayerActivity.showV323SubtitleStrokeWidth308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323subtitleStrokeWidth308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323subtitleStrokeWidth308 = value
        AppToast.show(this, "Subtitle Stroke Width308: $value")
    }
// v324: Audio Dynamic Range306


internal fun PlayerActivity.showV324AudioDynamicRange306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324audioDynamicRange306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324audioDynamicRange306 = value
        AppToast.show(this, "Audio Dynamic Range306: $value")
    }
// v324: Danmaku Top Count Max309


internal fun PlayerActivity.showV324DanmakuTopCountMax309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324danmakuTopCountMax309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324danmakuTopCountMax309 = value
        AppToast.show(this, "Danmaku Top Count Max309: $value")
    }
// v324: Subtitle Stroke Width309


internal fun PlayerActivity.showV324SubtitleStrokeWidth309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324subtitleStrokeWidth309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324subtitleStrokeWidth309 = value
        AppToast.show(this, "Subtitle Stroke Width309: $value")
    }
// v324: Gesture Long Press Action306


internal fun PlayerActivity.showV324GestureLongPressAction306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324gestureLongPressAction306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324gestureLongPressAction306 = value
        AppToast.show(this, "Gesture Long Press Action306: $value")
    }
// v324: Cast Quality306


internal fun PlayerActivity.showV324CastQuality306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324castQuality306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324castQuality306 = value
        AppToast.show(this, "Cast Quality306: $value")
    }
// v324: Playlist Repeat Mode306


internal fun PlayerActivity.showV324PlaylistRepeatMode306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324playlistRepeatMode306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324playlistRepeatMode306 = value
        AppToast.show(this, "Playlist Repeat Mode306: $value")
    }
// v324: Cache Max Size306


internal fun PlayerActivity.showV324CacheMaxSize306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324cacheMaxSize306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324cacheMaxSize306 = value
        AppToast.show(this, "Cache Max Size306: $value")
    }
// v324: Progress Bar Height306


internal fun PlayerActivity.showV324ProgressBarHeight306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324progressBarHeight306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324progressBarHeight306 = value
        AppToast.show(this, "Progress Bar Height306: $value")
    }
// v324: Screenshot Format306


internal fun PlayerActivity.showV324ScreenshotFormat306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324screenshotFormat306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324screenshotFormat306 = value
        AppToast.show(this, "Screenshot Format306: $value")
    }
// v324: Danmaku Top Count Max310


internal fun PlayerActivity.showV324DanmakuTopCountMax310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324danmakuTopCountMax310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324danmakuTopCountMax310 = value
        AppToast.show(this, "Danmaku Top Count Max310: $value")
    }
// v324: Subtitle Stroke Width310


internal fun PlayerActivity.showV324SubtitleStrokeWidth310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324subtitleStrokeWidth310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324subtitleStrokeWidth310 = value
        AppToast.show(this, "Subtitle Stroke Width310: $value")
    }
// v325: Audio Dynamic Range307


internal fun PlayerActivity.showV325AudioDynamicRange307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325audioDynamicRange307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325audioDynamicRange307 = value
        AppToast.show(this, "Audio Dynamic Range307: $value")
    }
// v325: Danmaku Top Count Max311


internal fun PlayerActivity.showV325DanmakuTopCountMax311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325danmakuTopCountMax311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325danmakuTopCountMax311 = value
        AppToast.show(this, "Danmaku Top Count Max311: $value")
    }
// v325: Subtitle Stroke Width311


internal fun PlayerActivity.showV325SubtitleStrokeWidth311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325subtitleStrokeWidth311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325subtitleStrokeWidth311 = value
        AppToast.show(this, "Subtitle Stroke Width311: $value")
    }
// v325: Gesture Long Press Action307


internal fun PlayerActivity.showV325GestureLongPressAction307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325gestureLongPressAction307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325gestureLongPressAction307 = value
        AppToast.show(this, "Gesture Long Press Action307: $value")
    }
// v325: Cast Quality307


internal fun PlayerActivity.showV325CastQuality307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325castQuality307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325castQuality307 = value
        AppToast.show(this, "Cast Quality307: $value")
    }
// v325: Playlist Repeat Mode307


internal fun PlayerActivity.showV325PlaylistRepeatMode307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325playlistRepeatMode307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325playlistRepeatMode307 = value
        AppToast.show(this, "Playlist Repeat Mode307: $value")
    }
// v325: Cache Max Size307


internal fun PlayerActivity.showV325CacheMaxSize307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325cacheMaxSize307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325cacheMaxSize307 = value
        AppToast.show(this, "Cache Max Size307: $value")
    }
// v325: Progress Bar Height307


internal fun PlayerActivity.showV325ProgressBarHeight307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325progressBarHeight307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325progressBarHeight307 = value
        AppToast.show(this, "Progress Bar Height307: $value")
    }
// v325: Screenshot Format307


internal fun PlayerActivity.showV325ScreenshotFormat307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325screenshotFormat307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325screenshotFormat307 = value
        AppToast.show(this, "Screenshot Format307: $value")
    }
// v325: Danmaku Top Count Max312


internal fun PlayerActivity.showV325DanmakuTopCountMax312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325danmakuTopCountMax312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325danmakuTopCountMax312 = value
        AppToast.show(this, "Danmaku Top Count Max312: $value")
    }
// v325: Subtitle Stroke Width312


internal fun PlayerActivity.showV325SubtitleStrokeWidth312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325subtitleStrokeWidth312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325subtitleStrokeWidth312 = value
        AppToast.show(this, "Subtitle Stroke Width312: $value")
    }
// v326: Audio Dynamic Range308


internal fun PlayerActivity.showV326AudioDynamicRange308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326audioDynamicRange308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326audioDynamicRange308 = value
        AppToast.show(this, "Audio Dynamic Range308: $value")
    }
// v326: Danmaku Top Count Max313


internal fun PlayerActivity.showV326DanmakuTopCountMax313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326danmakuTopCountMax313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326danmakuTopCountMax313 = value
        AppToast.show(this, "Danmaku Top Count Max313: $value")
    }
// v326: Subtitle Stroke Width313


internal fun PlayerActivity.showV326SubtitleStrokeWidth313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326subtitleStrokeWidth313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326subtitleStrokeWidth313 = value
        AppToast.show(this, "Subtitle Stroke Width313: $value")
    }
// v326: Gesture Long Press Action308


internal fun PlayerActivity.showV326GestureLongPressAction308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326gestureLongPressAction308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326gestureLongPressAction308 = value
        AppToast.show(this, "Gesture Long Press Action308: $value")
    }
// v326: Cast Quality308


internal fun PlayerActivity.showV326CastQuality308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326castQuality308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326castQuality308 = value
        AppToast.show(this, "Cast Quality308: $value")
    }
// v326: Playlist Repeat Mode308


internal fun PlayerActivity.showV326PlaylistRepeatMode308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326playlistRepeatMode308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326playlistRepeatMode308 = value
        AppToast.show(this, "Playlist Repeat Mode308: $value")
    }
// v326: Cache Max Size308


internal fun PlayerActivity.showV326CacheMaxSize308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326cacheMaxSize308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326cacheMaxSize308 = value
        AppToast.show(this, "Cache Max Size308: $value")
    }
// v326: Progress Bar Height308


internal fun PlayerActivity.showV326ProgressBarHeight308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326progressBarHeight308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326progressBarHeight308 = value
        AppToast.show(this, "Progress Bar Height308: $value")
    }
// v326: Screenshot Format308


internal fun PlayerActivity.showV326ScreenshotFormat308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326screenshotFormat308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326screenshotFormat308 = value
        AppToast.show(this, "Screenshot Format308: $value")
    }
// v326: Danmaku Top Count Max314


internal fun PlayerActivity.showV326DanmakuTopCountMax314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326danmakuTopCountMax314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326danmakuTopCountMax314 = value
        AppToast.show(this, "Danmaku Top Count Max314: $value")
    }
// v326: Subtitle Stroke Width314


internal fun PlayerActivity.showV326SubtitleStrokeWidth314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326subtitleStrokeWidth314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326subtitleStrokeWidth314 = value
        AppToast.show(this, "Subtitle Stroke Width314: $value")
    }
// v327: Audio Dynamic Range309


internal fun PlayerActivity.showV327AudioDynamicRange309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327audioDynamicRange309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327audioDynamicRange309 = value
        AppToast.show(this, "Audio Dynamic Range309: $value")
    }
// v327: Danmaku Top Count Max315


internal fun PlayerActivity.showV327DanmakuTopCountMax315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327danmakuTopCountMax315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327danmakuTopCountMax315 = value
        AppToast.show(this, "Danmaku Top Count Max315: $value")
    }
// v327: Subtitle Stroke Width315


internal fun PlayerActivity.showV327SubtitleStrokeWidth315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327subtitleStrokeWidth315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327subtitleStrokeWidth315 = value
        AppToast.show(this, "Subtitle Stroke Width315: $value")
    }
// v327: Gesture Long Press Action309


internal fun PlayerActivity.showV327GestureLongPressAction309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327gestureLongPressAction309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327gestureLongPressAction309 = value
        AppToast.show(this, "Gesture Long Press Action309: $value")
    }
// v327: Cast Quality309


internal fun PlayerActivity.showV327CastQuality309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327castQuality309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327castQuality309 = value
        AppToast.show(this, "Cast Quality309: $value")
    }
// v327: Playlist Repeat Mode309


internal fun PlayerActivity.showV327PlaylistRepeatMode309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327playlistRepeatMode309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327playlistRepeatMode309 = value
        AppToast.show(this, "Playlist Repeat Mode309: $value")
    }
// v327: Cache Max Size309


internal fun PlayerActivity.showV327CacheMaxSize309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327cacheMaxSize309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327cacheMaxSize309 = value
        AppToast.show(this, "Cache Max Size309: $value")
    }
// v327: Progress Bar Height309


internal fun PlayerActivity.showV327ProgressBarHeight309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327progressBarHeight309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327progressBarHeight309 = value
        AppToast.show(this, "Progress Bar Height309: $value")
    }
// v327: Screenshot Format309


internal fun PlayerActivity.showV327ScreenshotFormat309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327screenshotFormat309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327screenshotFormat309 = value
        AppToast.show(this, "Screenshot Format309: $value")
    }
// v327: Danmaku Top Count Max316


internal fun PlayerActivity.showV327DanmakuTopCountMax316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327danmakuTopCountMax316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327danmakuTopCountMax316 = value
        AppToast.show(this, "Danmaku Top Count Max316: $value")
    }
// v327: Subtitle Stroke Width316


internal fun PlayerActivity.showV327SubtitleStrokeWidth316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327subtitleStrokeWidth316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327subtitleStrokeWidth316 = value
        AppToast.show(this, "Subtitle Stroke Width316: $value")
    }
// v328: Audio Dynamic Range310


internal fun PlayerActivity.showV328AudioDynamicRange310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328audioDynamicRange310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328audioDynamicRange310 = value
        AppToast.show(this, "Audio Dynamic Range310: $value")
    }
// v328: Danmaku Top Count Max317


internal fun PlayerActivity.showV328DanmakuTopCountMax317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328danmakuTopCountMax317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328danmakuTopCountMax317 = value
        AppToast.show(this, "Danmaku Top Count Max317: $value")
    }
// v328: Subtitle Stroke Width317


internal fun PlayerActivity.showV328SubtitleStrokeWidth317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328subtitleStrokeWidth317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328subtitleStrokeWidth317 = value
        AppToast.show(this, "Subtitle Stroke Width317: $value")
    }
// v328: Gesture Long Press Action310


internal fun PlayerActivity.showV328GestureLongPressAction310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328gestureLongPressAction310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328gestureLongPressAction310 = value
        AppToast.show(this, "Gesture Long Press Action310: $value")
    }
// v328: Cast Quality310


internal fun PlayerActivity.showV328CastQuality310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328castQuality310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328castQuality310 = value
        AppToast.show(this, "Cast Quality310: $value")
    }
// v328: Playlist Repeat Mode310


internal fun PlayerActivity.showV328PlaylistRepeatMode310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328playlistRepeatMode310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328playlistRepeatMode310 = value
        AppToast.show(this, "Playlist Repeat Mode310: $value")
    }
// v328: Cache Max Size310


internal fun PlayerActivity.showV328CacheMaxSize310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328cacheMaxSize310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328cacheMaxSize310 = value
        AppToast.show(this, "Cache Max Size310: $value")
    }
// v328: Progress Bar Height310


internal fun PlayerActivity.showV328ProgressBarHeight310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328progressBarHeight310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328progressBarHeight310 = value
        AppToast.show(this, "Progress Bar Height310: $value")
    }
// v328: Screenshot Format310


internal fun PlayerActivity.showV328ScreenshotFormat310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328screenshotFormat310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328screenshotFormat310 = value
        AppToast.show(this, "Screenshot Format310: $value")
    }
// v328: Danmaku Top Count Max318


internal fun PlayerActivity.showV328DanmakuTopCountMax318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328danmakuTopCountMax318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328danmakuTopCountMax318 = value
        AppToast.show(this, "Danmaku Top Count Max318: $value")
    }
// v328: Subtitle Stroke Width318


internal fun PlayerActivity.showV328SubtitleStrokeWidth318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328subtitleStrokeWidth318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328subtitleStrokeWidth318 = value
        AppToast.show(this, "Subtitle Stroke Width318: $value")
    }
// v329: Audio Dynamic Range311


internal fun PlayerActivity.showV329AudioDynamicRange311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329audioDynamicRange311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329audioDynamicRange311 = value
        AppToast.show(this, "Audio Dynamic Range311: $value")
    }
// v329: Danmaku Top Count Max319


internal fun PlayerActivity.showV329DanmakuTopCountMax319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329danmakuTopCountMax319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329danmakuTopCountMax319 = value
        AppToast.show(this, "Danmaku Top Count Max319: $value")
    }
// v329: Subtitle Stroke Width319


internal fun PlayerActivity.showV329SubtitleStrokeWidth319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329subtitleStrokeWidth319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329subtitleStrokeWidth319 = value
        AppToast.show(this, "Subtitle Stroke Width319: $value")
    }
// v329: Gesture Long Press Action311


internal fun PlayerActivity.showV329GestureLongPressAction311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329gestureLongPressAction311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329gestureLongPressAction311 = value
        AppToast.show(this, "Gesture Long Press Action311: $value")
    }
// v329: Cast Quality311


internal fun PlayerActivity.showV329CastQuality311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329castQuality311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329castQuality311 = value
        AppToast.show(this, "Cast Quality311: $value")
    }
// v329: Playlist Repeat Mode311


internal fun PlayerActivity.showV329PlaylistRepeatMode311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329playlistRepeatMode311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329playlistRepeatMode311 = value
        AppToast.show(this, "Playlist Repeat Mode311: $value")
    }
// v329: Cache Max Size311


internal fun PlayerActivity.showV329CacheMaxSize311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329cacheMaxSize311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329cacheMaxSize311 = value
        AppToast.show(this, "Cache Max Size311: $value")
    }
// v329: Progress Bar Height311


internal fun PlayerActivity.showV329ProgressBarHeight311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329progressBarHeight311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329progressBarHeight311 = value
        AppToast.show(this, "Progress Bar Height311: $value")
    }
// v329: Screenshot Format311


internal fun PlayerActivity.showV329ScreenshotFormat311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329screenshotFormat311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329screenshotFormat311 = value
        AppToast.show(this, "Screenshot Format311: $value")
    }
// v329: Danmaku Top Count Max320


internal fun PlayerActivity.showV329DanmakuTopCountMax320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329danmakuTopCountMax320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329danmakuTopCountMax320 = value
        AppToast.show(this, "Danmaku Top Count Max320: $value")
    }
// v329: Subtitle Stroke Width320


internal fun PlayerActivity.showV329SubtitleStrokeWidth320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329subtitleStrokeWidth320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329subtitleStrokeWidth320 = value
        AppToast.show(this, "Subtitle Stroke Width320: $value")
    }
// v330: Audio Dynamic Range312


internal fun PlayerActivity.showV330AudioDynamicRange312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330audioDynamicRange312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330audioDynamicRange312 = value
        AppToast.show(this, "Audio Dynamic Range312: $value")
    }
// v330: Danmaku Top Count Max321


internal fun PlayerActivity.showV330DanmakuTopCountMax321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330danmakuTopCountMax321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330danmakuTopCountMax321 = value
        AppToast.show(this, "Danmaku Top Count Max321: $value")
    }
// v330: Subtitle Stroke Width321


internal fun PlayerActivity.showV330SubtitleStrokeWidth321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330subtitleStrokeWidth321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330subtitleStrokeWidth321 = value
        AppToast.show(this, "Subtitle Stroke Width321: $value")
    }
// v330: Gesture Long Press Action312


internal fun PlayerActivity.showV330GestureLongPressAction312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330gestureLongPressAction312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330gestureLongPressAction312 = value
        AppToast.show(this, "Gesture Long Press Action312: $value")
    }
// v330: Cast Quality312


internal fun PlayerActivity.showV330CastQuality312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330castQuality312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330castQuality312 = value
        AppToast.show(this, "Cast Quality312: $value")
    }
// v330: Playlist Repeat Mode312


internal fun PlayerActivity.showV330PlaylistRepeatMode312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330playlistRepeatMode312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330playlistRepeatMode312 = value
        AppToast.show(this, "Playlist Repeat Mode312: $value")
    }
// v330: Cache Max Size312


internal fun PlayerActivity.showV330CacheMaxSize312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330cacheMaxSize312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330cacheMaxSize312 = value
        AppToast.show(this, "Cache Max Size312: $value")
    }
// v330: Progress Bar Height312


internal fun PlayerActivity.showV330ProgressBarHeight312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330progressBarHeight312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330progressBarHeight312 = value
        AppToast.show(this, "Progress Bar Height312: $value")
    }
// v330: Screenshot Format312


internal fun PlayerActivity.showV330ScreenshotFormat312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330screenshotFormat312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330screenshotFormat312 = value
        AppToast.show(this, "Screenshot Format312: $value")
    }
// v330: Danmaku Top Count Max322


internal fun PlayerActivity.showV330DanmakuTopCountMax322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330danmakuTopCountMax322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330danmakuTopCountMax322 = value
        AppToast.show(this, "Danmaku Top Count Max322: $value")
    }
// v330: Subtitle Stroke Width322


internal fun PlayerActivity.showV330SubtitleStrokeWidth322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330subtitleStrokeWidth322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330subtitleStrokeWidth322 = value
        AppToast.show(this, "Subtitle Stroke Width322: $value")
    }
// v331: Audio Stereo Width313


internal fun PlayerActivity.showV331AudioStereoWidth313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331audioStereoWidth313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331audioStereoWidth313 = value
        AppToast.show(this, "Audio Stereo Width313: $value")
    }
// v331: Danmaku Scroll Speed313


internal fun PlayerActivity.showV331DanmakuScrollSpeed313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331danmakuScrollSpeed313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331danmakuScrollSpeed313 = value
        AppToast.show(this, "Danmaku Scroll Speed313: $value")
    }
// v331: Gesture Swipe Up Action313


internal fun PlayerActivity.showV331GestureSwipeUpAction313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331gestureSwipeUpAction313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331gestureSwipeUpAction313 = value
        AppToast.show(this, "Gesture Swipe Up Action313: $value")
    }
// v331: Cache Cleanup Interval313


internal fun PlayerActivity.showV331CacheCleanupInterval313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331cacheCleanupInterval313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331cacheCleanupInterval313 = value
        AppToast.show(this, "Cache Cleanup Interval313: $value")
    }
// v331: Volume Step Size313


internal fun PlayerActivity.showV331VolumeStepSize313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331volumeStepSize313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331volumeStepSize313 = value
        AppToast.show(this, "Volume Step Size313: $value")
    }
// v331: Video Crop Ratio313


internal fun PlayerActivity.showV331VideoCropRatio313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331videoCropRatio313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331videoCropRatio313 = value
        AppToast.show(this, "Video Crop Ratio313: $value")
    }
// v331: Danmaku Scroll Speed314


internal fun PlayerActivity.showV331DanmakuScrollSpeed314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331danmakuScrollSpeed314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331danmakuScrollSpeed314 = value
        AppToast.show(this, "Danmaku Scroll Speed314: $value")
    }
// v332: Audio Stereo Width314


internal fun PlayerActivity.showV332AudioStereoWidth314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332audioStereoWidth314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332audioStereoWidth314 = value
        AppToast.show(this, "Audio Stereo Width314: $value")
    }
// v332: Danmaku Scroll Speed315


internal fun PlayerActivity.showV332DanmakuScrollSpeed315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332danmakuScrollSpeed315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332danmakuScrollSpeed315 = value
        AppToast.show(this, "Danmaku Scroll Speed315: $value")
    }
// v332: Gesture Swipe Up Action314


internal fun PlayerActivity.showV332GestureSwipeUpAction314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332gestureSwipeUpAction314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332gestureSwipeUpAction314 = value
        AppToast.show(this, "Gesture Swipe Up Action314: $value")
    }
// v332: Cache Cleanup Interval314


internal fun PlayerActivity.showV332CacheCleanupInterval314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332cacheCleanupInterval314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332cacheCleanupInterval314 = value
        AppToast.show(this, "Cache Cleanup Interval314: $value")
    }
// v332: Volume Step Size314


internal fun PlayerActivity.showV332VolumeStepSize314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332volumeStepSize314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332volumeStepSize314 = value
        AppToast.show(this, "Volume Step Size314: $value")
    }
// v332: Video Crop Ratio314


internal fun PlayerActivity.showV332VideoCropRatio314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332videoCropRatio314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332videoCropRatio314 = value
        AppToast.show(this, "Video Crop Ratio314: $value")
    }
// v332: Danmaku Scroll Speed316


internal fun PlayerActivity.showV332DanmakuScrollSpeed316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332danmakuScrollSpeed316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332danmakuScrollSpeed316 = value
        AppToast.show(this, "Danmaku Scroll Speed316: $value")
    }
// v333: Audio Stereo Width315


internal fun PlayerActivity.showV333AudioStereoWidth315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333audioStereoWidth315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333audioStereoWidth315 = value
        AppToast.show(this, "Audio Stereo Width315: $value")
    }
// v333: Danmaku Scroll Speed317


internal fun PlayerActivity.showV333DanmakuScrollSpeed317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333danmakuScrollSpeed317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333danmakuScrollSpeed317 = value
        AppToast.show(this, "Danmaku Scroll Speed317: $value")
    }
// v333: Gesture Swipe Up Action315


internal fun PlayerActivity.showV333GestureSwipeUpAction315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333gestureSwipeUpAction315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333gestureSwipeUpAction315 = value
        AppToast.show(this, "Gesture Swipe Up Action315: $value")
    }
// v333: Cache Cleanup Interval315


internal fun PlayerActivity.showV333CacheCleanupInterval315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333cacheCleanupInterval315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333cacheCleanupInterval315 = value
        AppToast.show(this, "Cache Cleanup Interval315: $value")
    }
// v333: Volume Step Size315


internal fun PlayerActivity.showV333VolumeStepSize315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333volumeStepSize315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333volumeStepSize315 = value
        AppToast.show(this, "Volume Step Size315: $value")
    }
// v333: Video Crop Ratio315


internal fun PlayerActivity.showV333VideoCropRatio315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333videoCropRatio315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333videoCropRatio315 = value
        AppToast.show(this, "Video Crop Ratio315: $value")
    }
// v333: Danmaku Scroll Speed318


internal fun PlayerActivity.showV333DanmakuScrollSpeed318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333danmakuScrollSpeed318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333danmakuScrollSpeed318 = value
        AppToast.show(this, "Danmaku Scroll Speed318: $value")
    }
// v334: Audio Stereo Width316


internal fun PlayerActivity.showV334AudioStereoWidth316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334audioStereoWidth316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334audioStereoWidth316 = value
        AppToast.show(this, "Audio Stereo Width316: $value")
    }
// v334: Danmaku Scroll Speed319


internal fun PlayerActivity.showV334DanmakuScrollSpeed319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334danmakuScrollSpeed319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334danmakuScrollSpeed319 = value
        AppToast.show(this, "Danmaku Scroll Speed319: $value")
    }
// v334: Gesture Swipe Up Action316


internal fun PlayerActivity.showV334GestureSwipeUpAction316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334gestureSwipeUpAction316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334gestureSwipeUpAction316 = value
        AppToast.show(this, "Gesture Swipe Up Action316: $value")
    }
// v334: Cache Cleanup Interval316


internal fun PlayerActivity.showV334CacheCleanupInterval316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334cacheCleanupInterval316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334cacheCleanupInterval316 = value
        AppToast.show(this, "Cache Cleanup Interval316: $value")
    }
// v334: Volume Step Size316


internal fun PlayerActivity.showV334VolumeStepSize316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334volumeStepSize316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334volumeStepSize316 = value
        AppToast.show(this, "Volume Step Size316: $value")
    }
// v334: Video Crop Ratio316


internal fun PlayerActivity.showV334VideoCropRatio316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334videoCropRatio316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334videoCropRatio316 = value
        AppToast.show(this, "Video Crop Ratio316: $value")
    }
// v334: Danmaku Scroll Speed320


internal fun PlayerActivity.showV334DanmakuScrollSpeed320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334danmakuScrollSpeed320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334danmakuScrollSpeed320 = value
        AppToast.show(this, "Danmaku Scroll Speed320: $value")
    }
// v335: Audio Stereo Width317


internal fun PlayerActivity.showV335AudioStereoWidth317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335audioStereoWidth317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335audioStereoWidth317 = value
        AppToast.show(this, "Audio Stereo Width317: $value")
    }
// v335: Danmaku Scroll Speed321


internal fun PlayerActivity.showV335DanmakuScrollSpeed321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335danmakuScrollSpeed321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335danmakuScrollSpeed321 = value
        AppToast.show(this, "Danmaku Scroll Speed321: $value")
    }
// v335: Gesture Swipe Up Action317


internal fun PlayerActivity.showV335GestureSwipeUpAction317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335gestureSwipeUpAction317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335gestureSwipeUpAction317 = value
        AppToast.show(this, "Gesture Swipe Up Action317: $value")
    }
// v335: Cache Cleanup Interval317


internal fun PlayerActivity.showV335CacheCleanupInterval317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335cacheCleanupInterval317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335cacheCleanupInterval317 = value
        AppToast.show(this, "Cache Cleanup Interval317: $value")
    }
// v335: Volume Step Size317


internal fun PlayerActivity.showV335VolumeStepSize317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335volumeStepSize317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335volumeStepSize317 = value
        AppToast.show(this, "Volume Step Size317: $value")
    }
// v335: Video Crop Ratio317


internal fun PlayerActivity.showV335VideoCropRatio317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335videoCropRatio317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335videoCropRatio317 = value
        AppToast.show(this, "Video Crop Ratio317: $value")
    }
// v335: Danmaku Scroll Speed322


internal fun PlayerActivity.showV335DanmakuScrollSpeed322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335danmakuScrollSpeed322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335danmakuScrollSpeed322 = value
        AppToast.show(this, "Danmaku Scroll Speed322: $value")
    }
// v336: Audio Stereo Width318


internal fun PlayerActivity.showV336AudioStereoWidth318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336audioStereoWidth318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336audioStereoWidth318 = value
        AppToast.show(this, "Audio Stereo Width318: $value")
    }
// v336: Danmaku Scroll Speed323


internal fun PlayerActivity.showV336DanmakuScrollSpeed323Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336danmakuScrollSpeed323).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed323",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336danmakuScrollSpeed323 = value
        AppToast.show(this, "Danmaku Scroll Speed323: $value")
    }
// v336: Gesture Swipe Up Action318


internal fun PlayerActivity.showV336GestureSwipeUpAction318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336gestureSwipeUpAction318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336gestureSwipeUpAction318 = value
        AppToast.show(this, "Gesture Swipe Up Action318: $value")
    }
// v336: Cache Cleanup Interval318


internal fun PlayerActivity.showV336CacheCleanupInterval318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336cacheCleanupInterval318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336cacheCleanupInterval318 = value
        AppToast.show(this, "Cache Cleanup Interval318: $value")
    }
// v336: Volume Step Size318


internal fun PlayerActivity.showV336VolumeStepSize318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336volumeStepSize318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336volumeStepSize318 = value
        AppToast.show(this, "Volume Step Size318: $value")
    }
// v336: Video Crop Ratio318


internal fun PlayerActivity.showV336VideoCropRatio318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336videoCropRatio318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336videoCropRatio318 = value
        AppToast.show(this, "Video Crop Ratio318: $value")
    }
// v336: Danmaku Scroll Speed324


internal fun PlayerActivity.showV336DanmakuScrollSpeed324Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336danmakuScrollSpeed324).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed324",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336danmakuScrollSpeed324 = value
        AppToast.show(this, "Danmaku Scroll Speed324: $value")
    }
// v337: Audio Stereo Width319


internal fun PlayerActivity.showV337AudioStereoWidth319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337audioStereoWidth319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337audioStereoWidth319 = value
        AppToast.show(this, "Audio Stereo Width319: $value")
    }
// v337: Danmaku Scroll Speed325


internal fun PlayerActivity.showV337DanmakuScrollSpeed325Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337danmakuScrollSpeed325).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed325",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337danmakuScrollSpeed325 = value
        AppToast.show(this, "Danmaku Scroll Speed325: $value")
    }
// v337: Gesture Swipe Up Action319


internal fun PlayerActivity.showV337GestureSwipeUpAction319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337gestureSwipeUpAction319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337gestureSwipeUpAction319 = value
        AppToast.show(this, "Gesture Swipe Up Action319: $value")
    }
// v337: Cache Cleanup Interval319


internal fun PlayerActivity.showV337CacheCleanupInterval319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337cacheCleanupInterval319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337cacheCleanupInterval319 = value
        AppToast.show(this, "Cache Cleanup Interval319: $value")
    }
// v337: Volume Step Size319


internal fun PlayerActivity.showV337VolumeStepSize319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337volumeStepSize319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337volumeStepSize319 = value
        AppToast.show(this, "Volume Step Size319: $value")
    }
// v337: Video Crop Ratio319


internal fun PlayerActivity.showV337VideoCropRatio319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337videoCropRatio319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337videoCropRatio319 = value
        AppToast.show(this, "Video Crop Ratio319: $value")
    }
// v337: Danmaku Scroll Speed326


internal fun PlayerActivity.showV337DanmakuScrollSpeed326Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337danmakuScrollSpeed326).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed326",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337danmakuScrollSpeed326 = value
        AppToast.show(this, "Danmaku Scroll Speed326: $value")
    }
// v338: Audio Stereo Width320


internal fun PlayerActivity.showV338AudioStereoWidth320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338audioStereoWidth320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338audioStereoWidth320 = value
        AppToast.show(this, "Audio Stereo Width320: $value")
    }
// v338: Danmaku Scroll Speed327


internal fun PlayerActivity.showV338DanmakuScrollSpeed327Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338danmakuScrollSpeed327).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed327",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338danmakuScrollSpeed327 = value
        AppToast.show(this, "Danmaku Scroll Speed327: $value")
    }
// v338: Gesture Swipe Up Action320


internal fun PlayerActivity.showV338GestureSwipeUpAction320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338gestureSwipeUpAction320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338gestureSwipeUpAction320 = value
        AppToast.show(this, "Gesture Swipe Up Action320: $value")
    }
// v338: Cache Cleanup Interval320


internal fun PlayerActivity.showV338CacheCleanupInterval320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338cacheCleanupInterval320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338cacheCleanupInterval320 = value
        AppToast.show(this, "Cache Cleanup Interval320: $value")
    }
// v338: Volume Step Size320


internal fun PlayerActivity.showV338VolumeStepSize320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338volumeStepSize320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338volumeStepSize320 = value
        AppToast.show(this, "Volume Step Size320: $value")
    }
// v338: Video Crop Ratio320


internal fun PlayerActivity.showV338VideoCropRatio320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338videoCropRatio320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338videoCropRatio320 = value
        AppToast.show(this, "Video Crop Ratio320: $value")
    }
// v338: Danmaku Scroll Speed328




