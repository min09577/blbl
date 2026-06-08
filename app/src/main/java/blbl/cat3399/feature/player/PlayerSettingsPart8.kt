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

internal fun PlayerActivity.showV183VolumeBoostLevel183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183volumeBoostLevel183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Level183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183volumeBoostLevel183 = value
        AppToast.show(this, "Volume Boost Level183: $value")
    }
// v183: History Bookmark Color


internal fun PlayerActivity.showV183HistoryBookmarkColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183historyBookmarkColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Bookmark Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183historyBookmarkColor = value
        AppToast.show(this, "History Bookmark Color: $value")
    }
// v183: Video HDR10 Level183


internal fun PlayerActivity.showV183VideoHDR10Level183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183videoHDR10Level183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 Level183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183videoHDR10Level183 = value
        AppToast.show(this, "Video HDR10 Level183: $value")
    }
// v183: Danmaku Fixed Color


internal fun PlayerActivity.showV183DanmakuFixedColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183danmakuFixedColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183danmakuFixedColor = value
        AppToast.show(this, "Danmaku Fixed Color: $value")
    }
// v183: Subtitle Bg Color184


internal fun PlayerActivity.showV183SubtitleBgColor184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183subtitleBgColor184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183subtitleBgColor184 = value
        AppToast.show(this, "Subtitle Bg Color184: $value")
    }
// v184: Audio Reverb Mix184


internal fun PlayerActivity.showV184AudioReverbMix184Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v184audioReverbMix184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Mix184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184audioReverbMix184 = value
        AppToast.show(this, "Audio Reverb Mix184: $value")
    }
// v184: Danmaku Fixed Color184


internal fun PlayerActivity.showV184DanmakuFixedColor184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184danmakuFixedColor184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Color184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184danmakuFixedColor184 = value
        AppToast.show(this, "Danmaku Fixed Color184: $value")
    }
// v184: Subtitle Bg Color185


internal fun PlayerActivity.showV184SubtitleBgColor185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184subtitleBgColor185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184subtitleBgColor185 = value
        AppToast.show(this, "Subtitle Bg Color185: $value")
    }
// v184: Gesture Edge Swipe Down184


internal fun PlayerActivity.showV184GestureEdgeSwipeDown184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184gestureEdgeSwipeDown184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Down184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184gestureEdgeSwipeDown184 = value
        AppToast.show(this, "Gesture Edge Swipe Down184: $value")
    }
// v184: Cast Audio Channel184


internal fun PlayerActivity.showV184CastAudioChannel184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184castAudioChannel184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Channel184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184castAudioChannel184 = value
        AppToast.show(this, "Cast Audio Channel184: $value")
    }
// v184: Volume Boost Gain184


internal fun PlayerActivity.showV184VolumeBoostGain184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184volumeBoostGain184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Gain184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184volumeBoostGain184 = value
        AppToast.show(this, "Volume Boost Gain184: $value")
    }
// v184: History Bookmark Color184


internal fun PlayerActivity.showV184HistoryBookmarkColor184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184historyBookmarkColor184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Bookmark Color184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184historyBookmarkColor184 = value
        AppToast.show(this, "History Bookmark Color184: $value")
    }
// v184: Video HDR10 ToneMap184


internal fun PlayerActivity.showV184VideoHDR10ToneMap184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184videoHDR10ToneMap184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 ToneMap184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184videoHDR10ToneMap184 = value
        AppToast.show(this, "Video HDR10 ToneMap184: $value")
    }
// v184: Danmaku Fixed Size184


internal fun PlayerActivity.showV184DanmakuFixedSize184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184danmakuFixedSize184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Size184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184danmakuFixedSize184 = value
        AppToast.show(this, "Danmaku Fixed Size184: $value")
    }
// v185: Audio Stereo Widen185


internal fun PlayerActivity.showV185AudioStereoWiden185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185audioStereoWiden185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185audioStereoWiden185 = value
        AppToast.show(this, "Audio Stereo Widen185: $value")
    }
// v185: Danmaku Fixed Size185


internal fun PlayerActivity.showV185DanmakuFixedSize185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185danmakuFixedSize185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Size185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185danmakuFixedSize185 = value
        AppToast.show(this, "Danmaku Fixed Size185: $value")
    }
// v185: Cast Audio Channel185


internal fun PlayerActivity.showV185CastAudioChannel185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185castAudioChannel185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Channel185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185castAudioChannel185 = value
        AppToast.show(this, "Cast Audio Channel185: $value")
    }
// v185: Cache Download Concurrent


internal fun PlayerActivity.showV185CacheDownloadConcurrentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185cacheDownloadConcurrent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Concurrent",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185cacheDownloadConcurrent = value
        AppToast.show(this, "Cache Download Concurrent: $value")
    }
// v185: Volume Boost Gain185


internal fun PlayerActivity.showV185VolumeBoostGain185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185volumeBoostGain185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Gain185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185volumeBoostGain185 = value
        AppToast.show(this, "Volume Boost Gain185: $value")
    }
// v185: Screenshot Crop Ratio


internal fun PlayerActivity.showV185ScreenshotCropRatioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185screenshotCropRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Crop Ratio",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185screenshotCropRatio = value
        AppToast.show(this, "Screenshot Crop Ratio: $value")
    }
// v185: Video HDR10 ToneMap185


internal fun PlayerActivity.showV185VideoHDR10ToneMap185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185videoHDR10ToneMap185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 ToneMap185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185videoHDR10ToneMap185 = value
        AppToast.show(this, "Video HDR10 ToneMap185: $value")
    }
// v186: Audio Stereo Widen186


internal fun PlayerActivity.showV186AudioStereoWiden186Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v186audioStereoWiden186).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen186",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v186audioStereoWiden186 = value
        AppToast.show(this, "Audio Stereo Widen186: $value")
    }
// v186: Cache Download Concurrent186


internal fun PlayerActivity.showV186CacheDownloadConcurrent186Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v186cacheDownloadConcurrent186).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Concurrent186",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v186cacheDownloadConcurrent186 = value
        AppToast.show(this, "Cache Download Concurrent186: $value")
    }
// v186: Screenshot Crop Ratio186


internal fun PlayerActivity.showV186ScreenshotCropRatio186Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v186screenshotCropRatio186).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Crop Ratio186",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v186screenshotCropRatio186 = value
        AppToast.show(this, "Screenshot Crop Ratio186: $value")
    }
// v187: Audio Stereo Widen187


internal fun PlayerActivity.showV187AudioStereoWiden187Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v187audioStereoWiden187).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen187",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v187audioStereoWiden187 = value
        AppToast.show(this, "Audio Stereo Widen187: $value")
    }
// v188: Audio Stereo Widen188


internal fun PlayerActivity.showV188AudioStereoWiden188Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v188audioStereoWiden188).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen188",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v188audioStereoWiden188 = value
        AppToast.show(this, "Audio Stereo Widen188: $value")
    }
// v188: Cast Audio Delay


internal fun PlayerActivity.showV188CastAudioDelayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v188castAudioDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v188castAudioDelay = value
        AppToast.show(this, "Cast Audio Delay: $value")
    }
// v189: Gesture Rotation Sensitivity


internal fun PlayerActivity.showV189GestureRotationSensitivityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v189gestureRotationSensitivity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Rotation Sensitivity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v189gestureRotationSensitivity = value
        AppToast.show(this, "Gesture Rotation Sensitivity: $value")
    }
// v189: Cast Audio Delay189


internal fun PlayerActivity.showV189CastAudioDelay189Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v189castAudioDelay189).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay189",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v189castAudioDelay189 = value
        AppToast.show(this, "Cast Audio Delay189: $value")
    }
// v189: Cache Download Speed189


internal fun PlayerActivity.showV189CacheDownloadSpeed189Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v189cacheDownloadSpeed189).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed189",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v189cacheDownloadSpeed189 = value
        AppToast.show(this, "Cache Download Speed189: $value")
    }
// v190: Gesture Rotation Sensitivity190


internal fun PlayerActivity.showV190GestureRotationSensitivity190Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v190gestureRotationSensitivity190).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Rotation Sensitivity190",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v190gestureRotationSensitivity190 = value
        AppToast.show(this, "Gesture Rotation Sensitivity190: $value")
    }
// v190: Cast Audio Volume


internal fun PlayerActivity.showV190CastAudioVolumeDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v190castAudioVolume).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v190castAudioVolume = value
        AppToast.show(this, "Cast Audio Volume: $value")
    }
// v190: Cache Download Speed190


internal fun PlayerActivity.showV190CacheDownloadSpeed190Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v190cacheDownloadSpeed190).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed190",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v190cacheDownloadSpeed190 = value
        AppToast.show(this, "Cache Download Speed190: $value")
    }
// v190: Video Color Space190


internal fun PlayerActivity.showV190VideoColorSpace190Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v190videoColorSpace190).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space190",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v190videoColorSpace190 = value
        AppToast.show(this, "Video Color Space190: $value")
    }
// v191: Audio Delay Compensate191


internal fun PlayerActivity.showV191AudioDelayCompensate191Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191audioDelayCompensate191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191audioDelayCompensate191 = value
        AppToast.show(this, "Audio Delay Compensate191: $value")
    }
// v191: Danmaku Top Max Count191


internal fun PlayerActivity.showV191DanmakuTopMaxCount191Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191danmakuTopMaxCount191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Max Count191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191danmakuTopMaxCount191 = value
        AppToast.show(this, "Danmaku Top Max Count191: $value")
    }
// v191: Subtitle Bg Color192


internal fun PlayerActivity.showV191SubtitleBgColor192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191subtitleBgColor192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191subtitleBgColor192 = value
        AppToast.show(this, "Subtitle Bg Color192: $value")
    }
// v191: Gesture Shake Action191


internal fun PlayerActivity.showV191GestureShakeAction191Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191gestureShakeAction191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191gestureShakeAction191 = value
        AppToast.show(this, "Gesture Shake Action191: $value")
    }
// v191: Cast Audio Volume191


internal fun PlayerActivity.showV191CastAudioVolume191Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v191castAudioVolume191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191castAudioVolume191 = value
        AppToast.show(this, "Cast Audio Volume191: $value")
    }
// v191: Cache Download Speed192


internal fun PlayerActivity.showV191CacheDownloadSpeed192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191cacheDownloadSpeed192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191cacheDownloadSpeed192 = value
        AppToast.show(this, "Cache Download Speed192: $value")
    }
// v191: Video Color Space191


internal fun PlayerActivity.showV191VideoColorSpace191Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191videoColorSpace191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191videoColorSpace191 = value
        AppToast.show(this, "Video Color Space191: $value")
    }
// v191: Danmaku Top Max Count192


internal fun PlayerActivity.showV191DanmakuTopMaxCount192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191danmakuTopMaxCount192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Max Count192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191danmakuTopMaxCount192 = value
        AppToast.show(this, "Danmaku Top Max Count192: $value")
    }
// v192: Audio Delay Compensate192


internal fun PlayerActivity.showV192AudioDelayCompensate192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192audioDelayCompensate192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192audioDelayCompensate192 = value
        AppToast.show(this, "Audio Delay Compensate192: $value")
    }
// v192: Danmaku Top Max Count193


internal fun PlayerActivity.showV192DanmakuTopMaxCount193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192danmakuTopMaxCount193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Max Count193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192danmakuTopMaxCount193 = value
        AppToast.show(this, "Danmaku Top Max Count193: $value")
    }
// v192: Gesture Shake Action192


internal fun PlayerActivity.showV192GestureShakeAction192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192gestureShakeAction192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192gestureShakeAction192 = value
        AppToast.show(this, "Gesture Shake Action192: $value")
    }
// v192: Cast Audio Volume192


internal fun PlayerActivity.showV192CastAudioVolume192Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v192castAudioVolume192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192castAudioVolume192 = value
        AppToast.show(this, "Cast Audio Volume192: $value")
    }
// v192: Cache Download Speed193


internal fun PlayerActivity.showV192CacheDownloadSpeed193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192cacheDownloadSpeed193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192cacheDownloadSpeed193 = value
        AppToast.show(this, "Cache Download Speed193: $value")
    }
// v192: Video Color Space192


internal fun PlayerActivity.showV192VideoColorSpace192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192videoColorSpace192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192videoColorSpace192 = value
        AppToast.show(this, "Video Color Space192: $value")
    }
// v192: Danmaku Bottom Max Count192


internal fun PlayerActivity.showV192DanmakuBottomMaxCount192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192danmakuBottomMaxCount192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192danmakuBottomMaxCount192 = value
        AppToast.show(this, "Danmaku Bottom Max Count192: $value")
    }
// v193: Audio Delay Compensate193


internal fun PlayerActivity.showV193AudioDelayCompensate193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193audioDelayCompensate193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193audioDelayCompensate193 = value
        AppToast.show(this, "Audio Delay Compensate193: $value")
    }
// v193: Danmaku Bottom Max Count193


internal fun PlayerActivity.showV193DanmakuBottomMaxCount193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193danmakuBottomMaxCount193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193danmakuBottomMaxCount193 = value
        AppToast.show(this, "Danmaku Bottom Max Count193: $value")
    }
// v193: Gesture Shake Action193


internal fun PlayerActivity.showV193GestureShakeAction193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193gestureShakeAction193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193gestureShakeAction193 = value
        AppToast.show(this, "Gesture Shake Action193: $value")
    }
// v193: Cast Audio Volume193


internal fun PlayerActivity.showV193CastAudioVolume193Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v193castAudioVolume193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193castAudioVolume193 = value
        AppToast.show(this, "Cast Audio Volume193: $value")
    }
// v193: Cache Download Speed194


internal fun PlayerActivity.showV193CacheDownloadSpeed194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193cacheDownloadSpeed194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193cacheDownloadSpeed194 = value
        AppToast.show(this, "Cache Download Speed194: $value")
    }
// v193: Video Color Space193


internal fun PlayerActivity.showV193VideoColorSpace193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193videoColorSpace193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193videoColorSpace193 = value
        AppToast.show(this, "Video Color Space193: $value")
    }
// v193: Danmaku Bottom Max Count194


internal fun PlayerActivity.showV193DanmakuBottomMaxCount194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193danmakuBottomMaxCount194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193danmakuBottomMaxCount194 = value
        AppToast.show(this, "Danmaku Bottom Max Count194: $value")
    }
// v194: Audio Delay Compensate194


internal fun PlayerActivity.showV194AudioDelayCompensate194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194audioDelayCompensate194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194audioDelayCompensate194 = value
        AppToast.show(this, "Audio Delay Compensate194: $value")
    }
// v194: Danmaku Bottom Max Count195


internal fun PlayerActivity.showV194DanmakuBottomMaxCount195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194danmakuBottomMaxCount195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194danmakuBottomMaxCount195 = value
        AppToast.show(this, "Danmaku Bottom Max Count195: $value")
    }
// v194: Gesture Shake Action194


internal fun PlayerActivity.showV194GestureShakeAction194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194gestureShakeAction194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194gestureShakeAction194 = value
        AppToast.show(this, "Gesture Shake Action194: $value")
    }
// v194: Cast Audio Volume194


internal fun PlayerActivity.showV194CastAudioVolume194Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v194castAudioVolume194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194castAudioVolume194 = value
        AppToast.show(this, "Cast Audio Volume194: $value")
    }
// v194: Cache Download Speed195


internal fun PlayerActivity.showV194CacheDownloadSpeed195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194cacheDownloadSpeed195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194cacheDownloadSpeed195 = value
        AppToast.show(this, "Cache Download Speed195: $value")
    }
// v194: Video Color Space194


internal fun PlayerActivity.showV194VideoColorSpace194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194videoColorSpace194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194videoColorSpace194 = value
        AppToast.show(this, "Video Color Space194: $value")
    }
// v194: Danmaku Bottom Max Count196


internal fun PlayerActivity.showV194DanmakuBottomMaxCount196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194danmakuBottomMaxCount196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194danmakuBottomMaxCount196 = value
        AppToast.show(this, "Danmaku Bottom Max Count196: $value")
    }
// v195: Audio Delay Compensate195


internal fun PlayerActivity.showV195AudioDelayCompensate195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195audioDelayCompensate195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195audioDelayCompensate195 = value
        AppToast.show(this, "Audio Delay Compensate195: $value")
    }
// v195: Danmaku Bottom Max Count197


internal fun PlayerActivity.showV195DanmakuBottomMaxCount197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195danmakuBottomMaxCount197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195danmakuBottomMaxCount197 = value
        AppToast.show(this, "Danmaku Bottom Max Count197: $value")
    }
// v195: Gesture Shake Action195


internal fun PlayerActivity.showV195GestureShakeAction195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195gestureShakeAction195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195gestureShakeAction195 = value
        AppToast.show(this, "Gesture Shake Action195: $value")
    }
// v195: Cast Audio Volume195


internal fun PlayerActivity.showV195CastAudioVolume195Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v195castAudioVolume195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195castAudioVolume195 = value
        AppToast.show(this, "Cast Audio Volume195: $value")
    }
// v195: Cache Download Speed196


internal fun PlayerActivity.showV195CacheDownloadSpeed196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195cacheDownloadSpeed196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195cacheDownloadSpeed196 = value
        AppToast.show(this, "Cache Download Speed196: $value")
    }
// v195: Video Color Space195


internal fun PlayerActivity.showV195VideoColorSpace195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195videoColorSpace195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195videoColorSpace195 = value
        AppToast.show(this, "Video Color Space195: $value")
    }
// v195: Danmaku Bottom Max Count198


internal fun PlayerActivity.showV195DanmakuBottomMaxCount198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195danmakuBottomMaxCount198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195danmakuBottomMaxCount198 = value
        AppToast.show(this, "Danmaku Bottom Max Count198: $value")
    }
// v196: Audio Delay Compensate196


internal fun PlayerActivity.showV196AudioDelayCompensate196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196audioDelayCompensate196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196audioDelayCompensate196 = value
        AppToast.show(this, "Audio Delay Compensate196: $value")
    }
// v196: Danmaku Bottom Max Count199


internal fun PlayerActivity.showV196DanmakuBottomMaxCount199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196danmakuBottomMaxCount199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196danmakuBottomMaxCount199 = value
        AppToast.show(this, "Danmaku Bottom Max Count199: $value")
    }
// v196: Gesture Shake Action196


internal fun PlayerActivity.showV196GestureShakeAction196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196gestureShakeAction196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196gestureShakeAction196 = value
        AppToast.show(this, "Gesture Shake Action196: $value")
    }
// v196: Cast Audio Volume196


internal fun PlayerActivity.showV196CastAudioVolume196Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v196castAudioVolume196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196castAudioVolume196 = value
        AppToast.show(this, "Cast Audio Volume196: $value")
    }
// v196: Cache Download Speed197


internal fun PlayerActivity.showV196CacheDownloadSpeed197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196cacheDownloadSpeed197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196cacheDownloadSpeed197 = value
        AppToast.show(this, "Cache Download Speed197: $value")
    }
// v196: Video Color Space196


internal fun PlayerActivity.showV196VideoColorSpace196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196videoColorSpace196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196videoColorSpace196 = value
        AppToast.show(this, "Video Color Space196: $value")
    }
// v196: Danmaku Bottom Max Count200


internal fun PlayerActivity.showV196DanmakuBottomMaxCount200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196danmakuBottomMaxCount200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196danmakuBottomMaxCount200 = value
        AppToast.show(this, "Danmaku Bottom Max Count200: $value")
    }
// v197: Audio Delay Compensate197


internal fun PlayerActivity.showV197AudioDelayCompensate197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197audioDelayCompensate197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197audioDelayCompensate197 = value
        AppToast.show(this, "Audio Delay Compensate197: $value")
    }
// v197: Danmaku Bottom Max Count201


internal fun PlayerActivity.showV197DanmakuBottomMaxCount201Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197danmakuBottomMaxCount201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197danmakuBottomMaxCount201 = value
        AppToast.show(this, "Danmaku Bottom Max Count201: $value")
    }
// v197: Gesture Shake Action197


internal fun PlayerActivity.showV197GestureShakeAction197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197gestureShakeAction197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197gestureShakeAction197 = value
        AppToast.show(this, "Gesture Shake Action197: $value")
    }
// v197: Cast Audio Volume197


internal fun PlayerActivity.showV197CastAudioVolume197Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v197castAudioVolume197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197castAudioVolume197 = value
        AppToast.show(this, "Cast Audio Volume197: $value")
    }
// v197: Cache Download Speed198


internal fun PlayerActivity.showV197CacheDownloadSpeed198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197cacheDownloadSpeed198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197cacheDownloadSpeed198 = value
        AppToast.show(this, "Cache Download Speed198: $value")
    }
// v197: Video Color Space197


internal fun PlayerActivity.showV197VideoColorSpace197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197videoColorSpace197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197videoColorSpace197 = value
        AppToast.show(this, "Video Color Space197: $value")
    }
// v197: Danmaku Bottom Max Count202


internal fun PlayerActivity.showV197DanmakuBottomMaxCount202Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197danmakuBottomMaxCount202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197danmakuBottomMaxCount202 = value
        AppToast.show(this, "Danmaku Bottom Max Count202: $value")
    }
// v198: Audio Delay Compensate198


internal fun PlayerActivity.showV198AudioDelayCompensate198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198audioDelayCompensate198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198audioDelayCompensate198 = value
        AppToast.show(this, "Audio Delay Compensate198: $value")
    }
// v198: Danmaku Bottom Max Count203


internal fun PlayerActivity.showV198DanmakuBottomMaxCount203Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198danmakuBottomMaxCount203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198danmakuBottomMaxCount203 = value
        AppToast.show(this, "Danmaku Bottom Max Count203: $value")
    }
// v198: Gesture Shake Action198


internal fun PlayerActivity.showV198GestureShakeAction198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198gestureShakeAction198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198gestureShakeAction198 = value
        AppToast.show(this, "Gesture Shake Action198: $value")
    }
// v198: Cast Audio Volume198


internal fun PlayerActivity.showV198CastAudioVolume198Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v198castAudioVolume198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198castAudioVolume198 = value
        AppToast.show(this, "Cast Audio Volume198: $value")
    }
// v198: Cache Download Speed199


internal fun PlayerActivity.showV198CacheDownloadSpeed199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198cacheDownloadSpeed199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198cacheDownloadSpeed199 = value
        AppToast.show(this, "Cache Download Speed199: $value")
    }
// v198: Video Color Space198


internal fun PlayerActivity.showV198VideoColorSpace198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198videoColorSpace198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198videoColorSpace198 = value
        AppToast.show(this, "Video Color Space198: $value")
    }
// v198: Danmaku Bottom Max Count204


internal fun PlayerActivity.showV198DanmakuBottomMaxCount204Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198danmakuBottomMaxCount204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198danmakuBottomMaxCount204 = value
        AppToast.show(this, "Danmaku Bottom Max Count204: $value")
    }
// v199: Audio Delay Compensate199


internal fun PlayerActivity.showV199AudioDelayCompensate199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199audioDelayCompensate199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199audioDelayCompensate199 = value
        AppToast.show(this, "Audio Delay Compensate199: $value")
    }
// v199: Danmaku Bottom Max Count205


internal fun PlayerActivity.showV199DanmakuBottomMaxCount205Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199danmakuBottomMaxCount205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199danmakuBottomMaxCount205 = value
        AppToast.show(this, "Danmaku Bottom Max Count205: $value")
    }
// v199: Gesture Shake Action199


internal fun PlayerActivity.showV199GestureShakeAction199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199gestureShakeAction199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199gestureShakeAction199 = value
        AppToast.show(this, "Gesture Shake Action199: $value")
    }
// v199: Cast Audio Volume199


internal fun PlayerActivity.showV199CastAudioVolume199Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v199castAudioVolume199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199castAudioVolume199 = value
        AppToast.show(this, "Cast Audio Volume199: $value")
    }
// v199: Cache Download Speed200


internal fun PlayerActivity.showV199CacheDownloadSpeed200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199cacheDownloadSpeed200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199cacheDownloadSpeed200 = value
        AppToast.show(this, "Cache Download Speed200: $value")
    }
// v199: Video Color Space199


internal fun PlayerActivity.showV199VideoColorSpace199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199videoColorSpace199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199videoColorSpace199 = value
        AppToast.show(this, "Video Color Space199: $value")
    }
// v199: Danmaku Bottom Max Count206


internal fun PlayerActivity.showV199DanmakuBottomMaxCount206Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199danmakuBottomMaxCount206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199danmakuBottomMaxCount206 = value
        AppToast.show(this, "Danmaku Bottom Max Count206: $value")
    }
// v200: Audio Delay Compensate200


internal fun PlayerActivity.showV200AudioDelayCompensate200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200audioDelayCompensate200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200audioDelayCompensate200 = value
        AppToast.show(this, "Audio Delay Compensate200: $value")
    }
// v200: Danmaku Bottom Max Count207


internal fun PlayerActivity.showV200DanmakuBottomMaxCount207Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200danmakuBottomMaxCount207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200danmakuBottomMaxCount207 = value
        AppToast.show(this, "Danmaku Bottom Max Count207: $value")
    }
// v200: Gesture Shake Action200


internal fun PlayerActivity.showV200GestureShakeAction200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200gestureShakeAction200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200gestureShakeAction200 = value
        AppToast.show(this, "Gesture Shake Action200: $value")
    }
// v200: Cast Audio Volume200


internal fun PlayerActivity.showV200CastAudioVolume200Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v200castAudioVolume200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200castAudioVolume200 = value
        AppToast.show(this, "Cast Audio Volume200: $value")
    }
// v200: Cache Download Speed201


internal fun PlayerActivity.showV200CacheDownloadSpeed201Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200cacheDownloadSpeed201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200cacheDownloadSpeed201 = value
        AppToast.show(this, "Cache Download Speed201: $value")
    }
// v200: Video Color Space200


internal fun PlayerActivity.showV200VideoColorSpace200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200videoColorSpace200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200videoColorSpace200 = value
        AppToast.show(this, "Video Color Space200: $value")
    }
// v200: Danmaku Bottom Max Count208


internal fun PlayerActivity.showV200DanmakuBottomMaxCount208Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200danmakuBottomMaxCount208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200danmakuBottomMaxCount208 = value
        AppToast.show(this, "Danmaku Bottom Max Count208: $value")
    }
// v201: Danmaku Bottom Max Count209


internal fun PlayerActivity.showV201DanmakuBottomMaxCount209Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201danmakuBottomMaxCount209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201danmakuBottomMaxCount209 = value
        AppToast.show(this, "Danmaku Bottom Max Count209: $value")
    }
// v201: Gesture Shake Action201


internal fun PlayerActivity.showV201GestureShakeAction201Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201gestureShakeAction201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201gestureShakeAction201 = value
        AppToast.show(this, "Gesture Shake Action201: $value")
    }
// v201: Cast Audio Volume201


internal fun PlayerActivity.showV201CastAudioVolume201Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v201castAudioVolume201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201castAudioVolume201 = value
        AppToast.show(this, "Cast Audio Volume201: $value")
    }
// v201: Cache Download Speed202


internal fun PlayerActivity.showV201CacheDownloadSpeed202Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201cacheDownloadSpeed202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201cacheDownloadSpeed202 = value
        AppToast.show(this, "Cache Download Speed202: $value")
    }
// v201: Video Color Space201


internal fun PlayerActivity.showV201VideoColorSpace201Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201videoColorSpace201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201videoColorSpace201 = value
        AppToast.show(this, "Video Color Space201: $value")
    }
// v201: Danmaku Bottom Max Count210


internal fun PlayerActivity.showV201DanmakuBottomMaxCount210Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201danmakuBottomMaxCount210).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count210",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201danmakuBottomMaxCount210 = value
        AppToast.show(this, "Danmaku Bottom Max Count210: $value")
    }
// v202: Danmaku Bottom Max Count211


internal fun PlayerActivity.showV202DanmakuBottomMaxCount211Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202danmakuBottomMaxCount211).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count211",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202danmakuBottomMaxCount211 = value
        AppToast.show(this, "Danmaku Bottom Max Count211: $value")
    }
// v202: Gesture Shake Action202


internal fun PlayerActivity.showV202GestureShakeAction202Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202gestureShakeAction202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202gestureShakeAction202 = value
        AppToast.show(this, "Gesture Shake Action202: $value")
    }
// v202: Cast Audio Volume202


internal fun PlayerActivity.showV202CastAudioVolume202Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v202castAudioVolume202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202castAudioVolume202 = value
        AppToast.show(this, "Cast Audio Volume202: $value")
    }
// v202: Cache Download Speed203


internal fun PlayerActivity.showV202CacheDownloadSpeed203Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202cacheDownloadSpeed203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202cacheDownloadSpeed203 = value
        AppToast.show(this, "Cache Download Speed203: $value")
    }
// v202: Video Color Space202


internal fun PlayerActivity.showV202VideoColorSpace202Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202videoColorSpace202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202videoColorSpace202 = value
        AppToast.show(this, "Video Color Space202: $value")
    }
// v202: Danmaku Bottom Max Count212


internal fun PlayerActivity.showV202DanmakuBottomMaxCount212Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202danmakuBottomMaxCount212).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count212",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202danmakuBottomMaxCount212 = value
        AppToast.show(this, "Danmaku Bottom Max Count212: $value")
    }
// v203: Danmaku Bottom Max Count213


internal fun PlayerActivity.showV203DanmakuBottomMaxCount213Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203danmakuBottomMaxCount213).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count213",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203danmakuBottomMaxCount213 = value
        AppToast.show(this, "Danmaku Bottom Max Count213: $value")
    }
// v203: Gesture Shake Action203


internal fun PlayerActivity.showV203GestureShakeAction203Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203gestureShakeAction203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203gestureShakeAction203 = value
        AppToast.show(this, "Gesture Shake Action203: $value")
    }
// v203: Cast Audio Volume203


internal fun PlayerActivity.showV203CastAudioVolume203Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v203castAudioVolume203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203castAudioVolume203 = value
        AppToast.show(this, "Cast Audio Volume203: $value")
    }
// v203: Cache Download Speed204


internal fun PlayerActivity.showV203CacheDownloadSpeed204Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203cacheDownloadSpeed204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203cacheDownloadSpeed204 = value
        AppToast.show(this, "Cache Download Speed204: $value")
    }
// v203: Video Color Space203


internal fun PlayerActivity.showV203VideoColorSpace203Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203videoColorSpace203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203videoColorSpace203 = value
        AppToast.show(this, "Video Color Space203: $value")
    }
// v203: Danmaku Bottom Max Count214


internal fun PlayerActivity.showV203DanmakuBottomMaxCount214Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203danmakuBottomMaxCount214).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count214",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203danmakuBottomMaxCount214 = value
        AppToast.show(this, "Danmaku Bottom Max Count214: $value")
    }
// v204: Danmaku Bottom Max Count215


internal fun PlayerActivity.showV204DanmakuBottomMaxCount215Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204danmakuBottomMaxCount215).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count215",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204danmakuBottomMaxCount215 = value
        AppToast.show(this, "Danmaku Bottom Max Count215: $value")
    }
// v204: Gesture Shake Action204


internal fun PlayerActivity.showV204GestureShakeAction204Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204gestureShakeAction204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204gestureShakeAction204 = value
        AppToast.show(this, "Gesture Shake Action204: $value")
    }
// v204: Cast Audio Volume204


internal fun PlayerActivity.showV204CastAudioVolume204Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v204castAudioVolume204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204castAudioVolume204 = value
        AppToast.show(this, "Cast Audio Volume204: $value")
    }
// v204: Cache Download Speed205


internal fun PlayerActivity.showV204CacheDownloadSpeed205Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204cacheDownloadSpeed205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204cacheDownloadSpeed205 = value
        AppToast.show(this, "Cache Download Speed205: $value")
    }
// v204: Video Color Space204


internal fun PlayerActivity.showV204VideoColorSpace204Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204videoColorSpace204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204videoColorSpace204 = value
        AppToast.show(this, "Video Color Space204: $value")
    }
// v204: Danmaku Bottom Max Count216


internal fun PlayerActivity.showV204DanmakuBottomMaxCount216Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204danmakuBottomMaxCount216).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count216",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204danmakuBottomMaxCount216 = value
        AppToast.show(this, "Danmaku Bottom Max Count216: $value")
    }
// v205: Danmaku Bottom Max Count217


internal fun PlayerActivity.showV205DanmakuBottomMaxCount217Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205danmakuBottomMaxCount217).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count217",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205danmakuBottomMaxCount217 = value
        AppToast.show(this, "Danmaku Bottom Max Count217: $value")
    }
// v205: Gesture Shake Action205


internal fun PlayerActivity.showV205GestureShakeAction205Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205gestureShakeAction205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205gestureShakeAction205 = value
        AppToast.show(this, "Gesture Shake Action205: $value")
    }
// v205: Cast Audio Volume205


internal fun PlayerActivity.showV205CastAudioVolume205Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v205castAudioVolume205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205castAudioVolume205 = value
        AppToast.show(this, "Cast Audio Volume205: $value")
    }
// v205: Cache Download Speed206


internal fun PlayerActivity.showV205CacheDownloadSpeed206Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205cacheDownloadSpeed206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205cacheDownloadSpeed206 = value
        AppToast.show(this, "Cache Download Speed206: $value")
    }
// v205: Video Color Space205


internal fun PlayerActivity.showV205VideoColorSpace205Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205videoColorSpace205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205videoColorSpace205 = value
        AppToast.show(this, "Video Color Space205: $value")
    }
// v205: Danmaku Bottom Max Count218


internal fun PlayerActivity.showV205DanmakuBottomMaxCount218Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205danmakuBottomMaxCount218).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count218",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205danmakuBottomMaxCount218 = value
        AppToast.show(this, "Danmaku Bottom Max Count218: $value")
    }
// v206: Danmaku Bottom Max Count219


internal fun PlayerActivity.showV206DanmakuBottomMaxCount219Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206danmakuBottomMaxCount219).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count219",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206danmakuBottomMaxCount219 = value
        AppToast.show(this, "Danmaku Bottom Max Count219: $value")
    }
// v206: Gesture Shake Action206


internal fun PlayerActivity.showV206GestureShakeAction206Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206gestureShakeAction206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206gestureShakeAction206 = value
        AppToast.show(this, "Gesture Shake Action206: $value")
    }
// v206: Cast Audio Volume206


internal fun PlayerActivity.showV206CastAudioVolume206Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v206castAudioVolume206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206castAudioVolume206 = value
        AppToast.show(this, "Cast Audio Volume206: $value")
    }
// v206: Cache Download Speed207


internal fun PlayerActivity.showV206CacheDownloadSpeed207Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206cacheDownloadSpeed207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206cacheDownloadSpeed207 = value
        AppToast.show(this, "Cache Download Speed207: $value")
    }
// v206: Video Color Space206


internal fun PlayerActivity.showV206VideoColorSpace206Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206videoColorSpace206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206videoColorSpace206 = value
        AppToast.show(this, "Video Color Space206: $value")
    }
// v206: Danmaku Bottom Max Count220


internal fun PlayerActivity.showV206DanmakuBottomMaxCount220Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206danmakuBottomMaxCount220).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count220",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206danmakuBottomMaxCount220 = value
        AppToast.show(this, "Danmaku Bottom Max Count220: $value")
    }
// v207: Danmaku Bottom Max Count221


internal fun PlayerActivity.showV207DanmakuBottomMaxCount221Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207danmakuBottomMaxCount221).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count221",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207danmakuBottomMaxCount221 = value
        AppToast.show(this, "Danmaku Bottom Max Count221: $value")
    }
// v207: Gesture Shake Action207


internal fun PlayerActivity.showV207GestureShakeAction207Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207gestureShakeAction207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207gestureShakeAction207 = value
        AppToast.show(this, "Gesture Shake Action207: $value")
    }
// v207: Cast Audio Volume207


internal fun PlayerActivity.showV207CastAudioVolume207Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v207castAudioVolume207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207castAudioVolume207 = value
        AppToast.show(this, "Cast Audio Volume207: $value")
    }
// v207: Cache Download Speed208


internal fun PlayerActivity.showV207CacheDownloadSpeed208Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207cacheDownloadSpeed208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207cacheDownloadSpeed208 = value
        AppToast.show(this, "Cache Download Speed208: $value")
    }
// v207: Video Color Space207


internal fun PlayerActivity.showV207VideoColorSpace207Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207videoColorSpace207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207videoColorSpace207 = value
        AppToast.show(this, "Video Color Space207: $value")
    }
// v207: Danmaku Bottom Max Count222


internal fun PlayerActivity.showV207DanmakuBottomMaxCount222Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207danmakuBottomMaxCount222).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count222",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207danmakuBottomMaxCount222 = value
        AppToast.show(this, "Danmaku Bottom Max Count222: $value")
    }
// v208: Danmaku Bottom Max Count223


internal fun PlayerActivity.showV208DanmakuBottomMaxCount223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208danmakuBottomMaxCount223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208danmakuBottomMaxCount223 = value
        AppToast.show(this, "Danmaku Bottom Max Count223: $value")
    }
// v208: Gesture Shake Action208


internal fun PlayerActivity.showV208GestureShakeAction208Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208gestureShakeAction208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208gestureShakeAction208 = value
        AppToast.show(this, "Gesture Shake Action208: $value")
    }
// v208: Cast Audio Volume208


internal fun PlayerActivity.showV208CastAudioVolume208Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v208castAudioVolume208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208castAudioVolume208 = value
        AppToast.show(this, "Cast Audio Volume208: $value")
    }
// v208: Cache Download Speed209


internal fun PlayerActivity.showV208CacheDownloadSpeed209Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208cacheDownloadSpeed209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208cacheDownloadSpeed209 = value
        AppToast.show(this, "Cache Download Speed209: $value")
    }
// v208: Video Color Space208


internal fun PlayerActivity.showV208VideoColorSpace208Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208videoColorSpace208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208videoColorSpace208 = value
        AppToast.show(this, "Video Color Space208: $value")
    }
// v208: Danmaku Bottom Max Count224


internal fun PlayerActivity.showV208DanmakuBottomMaxCount224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208danmakuBottomMaxCount224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208danmakuBottomMaxCount224 = value
        AppToast.show(this, "Danmaku Bottom Max Count224: $value")
    }
// v209: Danmaku Bottom Max Count225


internal fun PlayerActivity.showV209DanmakuBottomMaxCount225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209danmakuBottomMaxCount225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209danmakuBottomMaxCount225 = value
        AppToast.show(this, "Danmaku Bottom Max Count225: $value")
    }
// v209: Gesture Shake Action209


internal fun PlayerActivity.showV209GestureShakeAction209Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209gestureShakeAction209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209gestureShakeAction209 = value
        AppToast.show(this, "Gesture Shake Action209: $value")
    }
// v209: Cast Audio Volume209


internal fun PlayerActivity.showV209CastAudioVolume209Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v209castAudioVolume209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209castAudioVolume209 = value
        AppToast.show(this, "Cast Audio Volume209: $value")
    }
// v209: Cache Download Speed210


internal fun PlayerActivity.showV209CacheDownloadSpeed210Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209cacheDownloadSpeed210).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed210",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209cacheDownloadSpeed210 = value
        AppToast.show(this, "Cache Download Speed210: $value")
    }
// v209: Video Color Space209


internal fun PlayerActivity.showV209VideoColorSpace209Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209videoColorSpace209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209videoColorSpace209 = value
        AppToast.show(this, "Video Color Space209: $value")
    }
// v209: Danmaku Bottom Max Count226


internal fun PlayerActivity.showV209DanmakuBottomMaxCount226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209danmakuBottomMaxCount226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209danmakuBottomMaxCount226 = value
        AppToast.show(this, "Danmaku Bottom Max Count226: $value")
    }
// v210: Danmaku Bottom Max Count227


internal fun PlayerActivity.showV210DanmakuBottomMaxCount227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v210danmakuBottomMaxCount227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v210danmakuBottomMaxCount227 = value
        AppToast.show(this, "Danmaku Bottom Max Count227: $value")
    }
// v210: Gesture Shake Action210


internal fun PlayerActivity.showV210GestureShakeAction210Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v210gestureShakeAction210).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action210",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v210gestureShakeAction210 = value
        AppToast.show(this, "Gesture Shake Action210: $value")
    }
// v210: Cast Audio Volume210


internal fun PlayerActivity.showV210CastAudioVolume210Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v210castAudioVolume210).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume210",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v210castAudioVolume210 = value
        AppToast.show(this, "Cast Audio Volume210: $value")
    }
// v210: Cache Download Speed211


internal fun PlayerActivity.showV210CacheDownloadSpeed211Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v210cacheDownloadSpeed211).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed211",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v210cacheDownloadSpeed211 = value
        AppToast.show(this, "Cache Download Speed211: $value")
    }
// v210: Video Color Space210


internal fun PlayerActivity.showV210VideoColorSpace210Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v210videoColorSpace210).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space210",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v210videoColorSpace210 = value
        AppToast.show(this, "Video Color Space210: $value")
    }
// v210: Danmaku Bottom Max Count228


internal fun PlayerActivity.showV210DanmakuBottomMaxCount228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v210danmakuBottomMaxCount228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v210danmakuBottomMaxCount228 = value
        AppToast.show(this, "Danmaku Bottom Max Count228: $value")
    }
// v211: Danmaku Bottom Max Count229


internal fun PlayerActivity.showV211DanmakuBottomMaxCount229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v211danmakuBottomMaxCount229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v211danmakuBottomMaxCount229 = value
        AppToast.show(this, "Danmaku Bottom Max Count229: $value")
    }
// v211: Gesture Shake Action211


internal fun PlayerActivity.showV211GestureShakeAction211Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v211gestureShakeAction211).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action211",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v211gestureShakeAction211 = value
        AppToast.show(this, "Gesture Shake Action211: $value")
    }
// v211: Cast Audio Volume211


internal fun PlayerActivity.showV211CastAudioVolume211Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v211castAudioVolume211).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume211",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v211castAudioVolume211 = value
        AppToast.show(this, "Cast Audio Volume211: $value")
    }
// v211: Cache Download Speed212


internal fun PlayerActivity.showV211CacheDownloadSpeed212Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v211cacheDownloadSpeed212).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed212",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v211cacheDownloadSpeed212 = value
        AppToast.show(this, "Cache Download Speed212: $value")
    }
// v211: Video Color Space211


internal fun PlayerActivity.showV211VideoColorSpace211Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v211videoColorSpace211).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space211",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v211videoColorSpace211 = value
        AppToast.show(this, "Video Color Space211: $value")
    }
// v211: Danmaku Bottom Max Count230


internal fun PlayerActivity.showV211DanmakuBottomMaxCount230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v211danmakuBottomMaxCount230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v211danmakuBottomMaxCount230 = value
        AppToast.show(this, "Danmaku Bottom Max Count230: $value")
    }
// v212: Danmaku Bottom Max Count231


internal fun PlayerActivity.showV212DanmakuBottomMaxCount231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v212danmakuBottomMaxCount231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v212danmakuBottomMaxCount231 = value
        AppToast.show(this, "Danmaku Bottom Max Count231: $value")
    }
// v212: Gesture Shake Action212


internal fun PlayerActivity.showV212GestureShakeAction212Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v212gestureShakeAction212).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action212",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v212gestureShakeAction212 = value
        AppToast.show(this, "Gesture Shake Action212: $value")
    }
// v212: Cast Audio Volume212


internal fun PlayerActivity.showV212CastAudioVolume212Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v212castAudioVolume212).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume212",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v212castAudioVolume212 = value
        AppToast.show(this, "Cast Audio Volume212: $value")
    }
// v212: Cache Download Speed213


internal fun PlayerActivity.showV212CacheDownloadSpeed213Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v212cacheDownloadSpeed213).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed213",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v212cacheDownloadSpeed213 = value
        AppToast.show(this, "Cache Download Speed213: $value")
    }
// v212: Video Color Space212


internal fun PlayerActivity.showV212VideoColorSpace212Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v212videoColorSpace212).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space212",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v212videoColorSpace212 = value
        AppToast.show(this, "Video Color Space212: $value")
    }
// v212: Danmaku Bottom Max Count232


internal fun PlayerActivity.showV212DanmakuBottomMaxCount232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v212danmakuBottomMaxCount232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v212danmakuBottomMaxCount232 = value
        AppToast.show(this, "Danmaku Bottom Max Count232: $value")
    }
// v213: Danmaku Bottom Max Count233


internal fun PlayerActivity.showV213DanmakuBottomMaxCount233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v213danmakuBottomMaxCount233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v213danmakuBottomMaxCount233 = value
        AppToast.show(this, "Danmaku Bottom Max Count233: $value")
    }
// v213: Gesture Shake Action213


internal fun PlayerActivity.showV213GestureShakeAction213Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v213gestureShakeAction213).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action213",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v213gestureShakeAction213 = value
        AppToast.show(this, "Gesture Shake Action213: $value")
    }
// v213: Cast Audio Volume213


internal fun PlayerActivity.showV213CastAudioVolume213Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v213castAudioVolume213).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume213",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v213castAudioVolume213 = value
        AppToast.show(this, "Cast Audio Volume213: $value")
    }
// v213: Cache Download Speed214


internal fun PlayerActivity.showV213CacheDownloadSpeed214Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v213cacheDownloadSpeed214).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed214",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v213cacheDownloadSpeed214 = value
        AppToast.show(this, "Cache Download Speed214: $value")
    }
// v213: Video Color Space213


internal fun PlayerActivity.showV213VideoColorSpace213Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v213videoColorSpace213).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space213",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v213videoColorSpace213 = value
        AppToast.show(this, "Video Color Space213: $value")
    }
// v213: Danmaku Bottom Max Count234


internal fun PlayerActivity.showV213DanmakuBottomMaxCount234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v213danmakuBottomMaxCount234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v213danmakuBottomMaxCount234 = value
        AppToast.show(this, "Danmaku Bottom Max Count234: $value")
    }
// v214: Danmaku Bottom Max Count235


internal fun PlayerActivity.showV214DanmakuBottomMaxCount235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v214danmakuBottomMaxCount235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v214danmakuBottomMaxCount235 = value
        AppToast.show(this, "Danmaku Bottom Max Count235: $value")
    }
// v214: Gesture Shake Action214


internal fun PlayerActivity.showV214GestureShakeAction214Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v214gestureShakeAction214).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action214",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v214gestureShakeAction214 = value
        AppToast.show(this, "Gesture Shake Action214: $value")
    }
// v214: Cast Audio Volume214


internal fun PlayerActivity.showV214CastAudioVolume214Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v214castAudioVolume214).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume214",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v214castAudioVolume214 = value
        AppToast.show(this, "Cast Audio Volume214: $value")
    }
// v214: Cache Download Speed215


internal fun PlayerActivity.showV214CacheDownloadSpeed215Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v214cacheDownloadSpeed215).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed215",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v214cacheDownloadSpeed215 = value
        AppToast.show(this, "Cache Download Speed215: $value")
    }
// v214: Video Color Space214


internal fun PlayerActivity.showV214VideoColorSpace214Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v214videoColorSpace214).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space214",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v214videoColorSpace214 = value
        AppToast.show(this, "Video Color Space214: $value")
    }
// v214: Danmaku Bottom Max Count236


internal fun PlayerActivity.showV214DanmakuBottomMaxCount236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v214danmakuBottomMaxCount236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v214danmakuBottomMaxCount236 = value
        AppToast.show(this, "Danmaku Bottom Max Count236: $value")
    }
// v215: Danmaku Bottom Max Count237


internal fun PlayerActivity.showV215DanmakuBottomMaxCount237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v215danmakuBottomMaxCount237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v215danmakuBottomMaxCount237 = value
        AppToast.show(this, "Danmaku Bottom Max Count237: $value")
    }
// v215: Gesture Shake Action215


internal fun PlayerActivity.showV215GestureShakeAction215Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v215gestureShakeAction215).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action215",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v215gestureShakeAction215 = value
        AppToast.show(this, "Gesture Shake Action215: $value")
    }
// v215: Cast Audio Volume215


internal fun PlayerActivity.showV215CastAudioVolume215Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v215castAudioVolume215).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume215",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v215castAudioVolume215 = value
        AppToast.show(this, "Cast Audio Volume215: $value")
    }
// v215: Cache Download Speed216


internal fun PlayerActivity.showV215CacheDownloadSpeed216Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v215cacheDownloadSpeed216).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed216",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v215cacheDownloadSpeed216 = value
        AppToast.show(this, "Cache Download Speed216: $value")
    }
// v215: Video Color Space215


internal fun PlayerActivity.showV215VideoColorSpace215Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v215videoColorSpace215).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space215",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v215videoColorSpace215 = value
        AppToast.show(this, "Video Color Space215: $value")
    }
// v215: Danmaku Bottom Max Count238


internal fun PlayerActivity.showV215DanmakuBottomMaxCount238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v215danmakuBottomMaxCount238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v215danmakuBottomMaxCount238 = value
        AppToast.show(this, "Danmaku Bottom Max Count238: $value")
    }
// v216: Danmaku Bottom Max Count239


internal fun PlayerActivity.showV216DanmakuBottomMaxCount239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v216danmakuBottomMaxCount239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v216danmakuBottomMaxCount239 = value
        AppToast.show(this, "Danmaku Bottom Max Count239: $value")
    }
// v216: Gesture Shake Action216


internal fun PlayerActivity.showV216GestureShakeAction216Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v216gestureShakeAction216).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action216",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v216gestureShakeAction216 = value
        AppToast.show(this, "Gesture Shake Action216: $value")
    }
// v216: Cast Audio Volume216


internal fun PlayerActivity.showV216CastAudioVolume216Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v216castAudioVolume216).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume216",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v216castAudioVolume216 = value
        AppToast.show(this, "Cast Audio Volume216: $value")
    }
// v216: Cache Download Speed217


internal fun PlayerActivity.showV216CacheDownloadSpeed217Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v216cacheDownloadSpeed217).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed217",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v216cacheDownloadSpeed217 = value
        AppToast.show(this, "Cache Download Speed217: $value")
    }
// v216: Video Color Space216


internal fun PlayerActivity.showV216VideoColorSpace216Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v216videoColorSpace216).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space216",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v216videoColorSpace216 = value
        AppToast.show(this, "Video Color Space216: $value")
    }
// v216: Danmaku Bottom Max Count240




