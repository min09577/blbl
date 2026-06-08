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

internal fun PlayerActivity.showV338DanmakuScrollSpeed328Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338danmakuScrollSpeed328).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed328",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338danmakuScrollSpeed328 = value
        AppToast.show(this, "Danmaku Scroll Speed328: $value")
    }
// v339: Audio Stereo Width321


internal fun PlayerActivity.showV339AudioStereoWidth321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339audioStereoWidth321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339audioStereoWidth321 = value
        AppToast.show(this, "Audio Stereo Width321: $value")
    }
// v339: Danmaku Scroll Speed329


internal fun PlayerActivity.showV339DanmakuScrollSpeed329Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339danmakuScrollSpeed329).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed329",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339danmakuScrollSpeed329 = value
        AppToast.show(this, "Danmaku Scroll Speed329: $value")
    }
// v339: Gesture Swipe Up Action321


internal fun PlayerActivity.showV339GestureSwipeUpAction321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339gestureSwipeUpAction321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339gestureSwipeUpAction321 = value
        AppToast.show(this, "Gesture Swipe Up Action321: $value")
    }
// v339: Cache Cleanup Interval321


internal fun PlayerActivity.showV339CacheCleanupInterval321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339cacheCleanupInterval321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339cacheCleanupInterval321 = value
        AppToast.show(this, "Cache Cleanup Interval321: $value")
    }
// v339: Volume Step Size321


internal fun PlayerActivity.showV339VolumeStepSize321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339volumeStepSize321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339volumeStepSize321 = value
        AppToast.show(this, "Volume Step Size321: $value")
    }
// v339: Video Crop Ratio321


internal fun PlayerActivity.showV339VideoCropRatio321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339videoCropRatio321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339videoCropRatio321 = value
        AppToast.show(this, "Video Crop Ratio321: $value")
    }
// v339: Danmaku Scroll Speed330


internal fun PlayerActivity.showV339DanmakuScrollSpeed330Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339danmakuScrollSpeed330).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed330",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339danmakuScrollSpeed330 = value
        AppToast.show(this, "Danmaku Scroll Speed330: $value")
    }
// v340: Audio Stereo Width322


internal fun PlayerActivity.showV340AudioStereoWidth322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340audioStereoWidth322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340audioStereoWidth322 = value
        AppToast.show(this, "Audio Stereo Width322: $value")
    }
// v340: Danmaku Scroll Speed331


internal fun PlayerActivity.showV340DanmakuScrollSpeed331Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340danmakuScrollSpeed331).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed331",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340danmakuScrollSpeed331 = value
        AppToast.show(this, "Danmaku Scroll Speed331: $value")
    }
// v340: Gesture Swipe Up Action322


internal fun PlayerActivity.showV340GestureSwipeUpAction322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340gestureSwipeUpAction322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340gestureSwipeUpAction322 = value
        AppToast.show(this, "Gesture Swipe Up Action322: $value")
    }
// v340: Cache Cleanup Interval322


internal fun PlayerActivity.showV340CacheCleanupInterval322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340cacheCleanupInterval322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340cacheCleanupInterval322 = value
        AppToast.show(this, "Cache Cleanup Interval322: $value")
    }
// v340: Volume Step Size322


internal fun PlayerActivity.showV340VolumeStepSize322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340volumeStepSize322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340volumeStepSize322 = value
        AppToast.show(this, "Volume Step Size322: $value")
    }
// v340: Video Crop Ratio322


internal fun PlayerActivity.showV340VideoCropRatio322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340videoCropRatio322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340videoCropRatio322 = value
        AppToast.show(this, "Video Crop Ratio322: $value")
    }
// v340: Danmaku Scroll Speed332


internal fun PlayerActivity.showV340DanmakuScrollSpeed332Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340danmakuScrollSpeed332).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed332",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340danmakuScrollSpeed332 = value
        AppToast.show(this, "Danmaku Scroll Speed332: $value")
    }
// v341: Danmaku Merge Threshold333


internal fun PlayerActivity.showV341DanmakuMergeThreshold333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341danmakuMergeThreshold333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341danmakuMergeThreshold333 = value
        AppToast.show(this, "Danmaku Merge Threshold333: $value")
    }
// v341: Subtitle Font Size333


internal fun PlayerActivity.showV341SubtitleFontSize333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341subtitleFontSize333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341subtitleFontSize333 = value
        AppToast.show(this, "Subtitle Font Size333: $value")
    }
// v341: Cast Audio Delay333


internal fun PlayerActivity.showV341CastAudioDelay333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341castAudioDelay333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341castAudioDelay333 = value
        AppToast.show(this, "Cast Audio Delay333: $value")
    }
// v341: History Max Items333


internal fun PlayerActivity.showV341HistoryMaxItems333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341historyMaxItems333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341historyMaxItems333 = value
        AppToast.show(this, "History Max Items333: $value")
    }
// v341: Screenshot Share Target333


internal fun PlayerActivity.showV341ScreenshotShareTarget333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341screenshotShareTarget333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341screenshotShareTarget333 = value
        AppToast.show(this, "Screenshot Share Target333: $value")
    }
// v341: Video Rotate Angle333


internal fun PlayerActivity.showV341VideoRotateAngle333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341videoRotateAngle333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341videoRotateAngle333 = value
        AppToast.show(this, "Video Rotate Angle333: $value")
    }
// v341: Danmaku Merge Threshold334


internal fun PlayerActivity.showV341DanmakuMergeThreshold334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341danmakuMergeThreshold334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341danmakuMergeThreshold334 = value
        AppToast.show(this, "Danmaku Merge Threshold334: $value")
    }
// v341: Subtitle Font Size334


internal fun PlayerActivity.showV341SubtitleFontSize334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341subtitleFontSize334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341subtitleFontSize334 = value
        AppToast.show(this, "Subtitle Font Size334: $value")
    }
// v342: Danmaku Merge Threshold335


internal fun PlayerActivity.showV342DanmakuMergeThreshold335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342danmakuMergeThreshold335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342danmakuMergeThreshold335 = value
        AppToast.show(this, "Danmaku Merge Threshold335: $value")
    }
// v342: Subtitle Font Size335


internal fun PlayerActivity.showV342SubtitleFontSize335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342subtitleFontSize335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342subtitleFontSize335 = value
        AppToast.show(this, "Subtitle Font Size335: $value")
    }
// v342: Cast Audio Delay334


internal fun PlayerActivity.showV342CastAudioDelay334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342castAudioDelay334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342castAudioDelay334 = value
        AppToast.show(this, "Cast Audio Delay334: $value")
    }
// v342: History Max Items334


internal fun PlayerActivity.showV342HistoryMaxItems334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342historyMaxItems334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342historyMaxItems334 = value
        AppToast.show(this, "History Max Items334: $value")
    }
// v342: Screenshot Share Target334


internal fun PlayerActivity.showV342ScreenshotShareTarget334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342screenshotShareTarget334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342screenshotShareTarget334 = value
        AppToast.show(this, "Screenshot Share Target334: $value")
    }
// v342: Video Rotate Angle334


internal fun PlayerActivity.showV342VideoRotateAngle334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342videoRotateAngle334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342videoRotateAngle334 = value
        AppToast.show(this, "Video Rotate Angle334: $value")
    }
// v342: Danmaku Merge Threshold336


internal fun PlayerActivity.showV342DanmakuMergeThreshold336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342danmakuMergeThreshold336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342danmakuMergeThreshold336 = value
        AppToast.show(this, "Danmaku Merge Threshold336: $value")
    }
// v342: Subtitle Font Size336


internal fun PlayerActivity.showV342SubtitleFontSize336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342subtitleFontSize336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342subtitleFontSize336 = value
        AppToast.show(this, "Subtitle Font Size336: $value")
    }
// v343: Danmaku Merge Threshold337


internal fun PlayerActivity.showV343DanmakuMergeThreshold337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343danmakuMergeThreshold337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343danmakuMergeThreshold337 = value
        AppToast.show(this, "Danmaku Merge Threshold337: $value")
    }
// v343: Subtitle Font Size337


internal fun PlayerActivity.showV343SubtitleFontSize337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343subtitleFontSize337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343subtitleFontSize337 = value
        AppToast.show(this, "Subtitle Font Size337: $value")
    }
// v343: Cast Audio Delay335


internal fun PlayerActivity.showV343CastAudioDelay335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343castAudioDelay335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343castAudioDelay335 = value
        AppToast.show(this, "Cast Audio Delay335: $value")
    }
// v343: History Max Items335


internal fun PlayerActivity.showV343HistoryMaxItems335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343historyMaxItems335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343historyMaxItems335 = value
        AppToast.show(this, "History Max Items335: $value")
    }
// v343: Screenshot Share Target335


internal fun PlayerActivity.showV343ScreenshotShareTarget335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343screenshotShareTarget335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343screenshotShareTarget335 = value
        AppToast.show(this, "Screenshot Share Target335: $value")
    }
// v343: Video Rotate Angle335


internal fun PlayerActivity.showV343VideoRotateAngle335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343videoRotateAngle335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343videoRotateAngle335 = value
        AppToast.show(this, "Video Rotate Angle335: $value")
    }
// v343: Danmaku Merge Threshold338


internal fun PlayerActivity.showV343DanmakuMergeThreshold338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343danmakuMergeThreshold338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343danmakuMergeThreshold338 = value
        AppToast.show(this, "Danmaku Merge Threshold338: $value")
    }
// v343: Subtitle Font Size338


internal fun PlayerActivity.showV343SubtitleFontSize338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343subtitleFontSize338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343subtitleFontSize338 = value
        AppToast.show(this, "Subtitle Font Size338: $value")
    }
// v344: Danmaku Merge Threshold339


internal fun PlayerActivity.showV344DanmakuMergeThreshold339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344danmakuMergeThreshold339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344danmakuMergeThreshold339 = value
        AppToast.show(this, "Danmaku Merge Threshold339: $value")
    }
// v344: Subtitle Font Size339


internal fun PlayerActivity.showV344SubtitleFontSize339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344subtitleFontSize339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344subtitleFontSize339 = value
        AppToast.show(this, "Subtitle Font Size339: $value")
    }
// v344: Cast Audio Delay336


internal fun PlayerActivity.showV344CastAudioDelay336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344castAudioDelay336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344castAudioDelay336 = value
        AppToast.show(this, "Cast Audio Delay336: $value")
    }
// v344: History Max Items336


internal fun PlayerActivity.showV344HistoryMaxItems336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344historyMaxItems336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344historyMaxItems336 = value
        AppToast.show(this, "History Max Items336: $value")
    }
// v344: Screenshot Share Target336


internal fun PlayerActivity.showV344ScreenshotShareTarget336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344screenshotShareTarget336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344screenshotShareTarget336 = value
        AppToast.show(this, "Screenshot Share Target336: $value")
    }
// v344: Video Rotate Angle336


internal fun PlayerActivity.showV344VideoRotateAngle336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344videoRotateAngle336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344videoRotateAngle336 = value
        AppToast.show(this, "Video Rotate Angle336: $value")
    }
// v344: Danmaku Merge Threshold340


internal fun PlayerActivity.showV344DanmakuMergeThreshold340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344danmakuMergeThreshold340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344danmakuMergeThreshold340 = value
        AppToast.show(this, "Danmaku Merge Threshold340: $value")
    }
// v344: Subtitle Font Size340


internal fun PlayerActivity.showV344SubtitleFontSize340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344subtitleFontSize340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344subtitleFontSize340 = value
        AppToast.show(this, "Subtitle Font Size340: $value")
    }
// v345: Danmaku Merge Threshold341


internal fun PlayerActivity.showV345DanmakuMergeThreshold341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345danmakuMergeThreshold341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345danmakuMergeThreshold341 = value
        AppToast.show(this, "Danmaku Merge Threshold341: $value")
    }
// v345: Subtitle Font Size341


internal fun PlayerActivity.showV345SubtitleFontSize341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345subtitleFontSize341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345subtitleFontSize341 = value
        AppToast.show(this, "Subtitle Font Size341: $value")
    }
// v345: Cast Audio Delay337


internal fun PlayerActivity.showV345CastAudioDelay337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345castAudioDelay337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345castAudioDelay337 = value
        AppToast.show(this, "Cast Audio Delay337: $value")
    }
// v345: History Max Items337


internal fun PlayerActivity.showV345HistoryMaxItems337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345historyMaxItems337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345historyMaxItems337 = value
        AppToast.show(this, "History Max Items337: $value")
    }
// v345: Screenshot Share Target337


internal fun PlayerActivity.showV345ScreenshotShareTarget337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345screenshotShareTarget337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345screenshotShareTarget337 = value
        AppToast.show(this, "Screenshot Share Target337: $value")
    }
// v345: Video Rotate Angle337


internal fun PlayerActivity.showV345VideoRotateAngle337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345videoRotateAngle337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345videoRotateAngle337 = value
        AppToast.show(this, "Video Rotate Angle337: $value")
    }
// v345: Danmaku Merge Threshold342


internal fun PlayerActivity.showV345DanmakuMergeThreshold342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345danmakuMergeThreshold342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345danmakuMergeThreshold342 = value
        AppToast.show(this, "Danmaku Merge Threshold342: $value")
    }
// v345: Subtitle Font Size342


internal fun PlayerActivity.showV345SubtitleFontSize342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345subtitleFontSize342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345subtitleFontSize342 = value
        AppToast.show(this, "Subtitle Font Size342: $value")
    }
// v346: Danmaku Merge Threshold343


internal fun PlayerActivity.showV346DanmakuMergeThreshold343Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346danmakuMergeThreshold343).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold343",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346danmakuMergeThreshold343 = value
        AppToast.show(this, "Danmaku Merge Threshold343: $value")
    }
// v346: Subtitle Font Size343


internal fun PlayerActivity.showV346SubtitleFontSize343Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346subtitleFontSize343).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size343",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346subtitleFontSize343 = value
        AppToast.show(this, "Subtitle Font Size343: $value")
    }
// v346: Cast Audio Delay338


internal fun PlayerActivity.showV346CastAudioDelay338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346castAudioDelay338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346castAudioDelay338 = value
        AppToast.show(this, "Cast Audio Delay338: $value")
    }
// v346: History Max Items338


internal fun PlayerActivity.showV346HistoryMaxItems338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346historyMaxItems338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346historyMaxItems338 = value
        AppToast.show(this, "History Max Items338: $value")
    }
// v346: Screenshot Share Target338


internal fun PlayerActivity.showV346ScreenshotShareTarget338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346screenshotShareTarget338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346screenshotShareTarget338 = value
        AppToast.show(this, "Screenshot Share Target338: $value")
    }
// v346: Video Rotate Angle338


internal fun PlayerActivity.showV346VideoRotateAngle338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346videoRotateAngle338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346videoRotateAngle338 = value
        AppToast.show(this, "Video Rotate Angle338: $value")
    }
// v346: Danmaku Merge Threshold344


internal fun PlayerActivity.showV346DanmakuMergeThreshold344Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346danmakuMergeThreshold344).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold344",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346danmakuMergeThreshold344 = value
        AppToast.show(this, "Danmaku Merge Threshold344: $value")
    }
// v346: Subtitle Font Size344


internal fun PlayerActivity.showV346SubtitleFontSize344Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346subtitleFontSize344).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size344",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346subtitleFontSize344 = value
        AppToast.show(this, "Subtitle Font Size344: $value")
    }
// v347: Danmaku Merge Threshold345


internal fun PlayerActivity.showV347DanmakuMergeThreshold345Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347danmakuMergeThreshold345).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold345",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347danmakuMergeThreshold345 = value
        AppToast.show(this, "Danmaku Merge Threshold345: $value")
    }
// v347: Subtitle Font Size345


internal fun PlayerActivity.showV347SubtitleFontSize345Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347subtitleFontSize345).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size345",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347subtitleFontSize345 = value
        AppToast.show(this, "Subtitle Font Size345: $value")
    }
// v347: Cast Audio Delay339


internal fun PlayerActivity.showV347CastAudioDelay339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347castAudioDelay339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347castAudioDelay339 = value
        AppToast.show(this, "Cast Audio Delay339: $value")
    }
// v347: History Max Items339


internal fun PlayerActivity.showV347HistoryMaxItems339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347historyMaxItems339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347historyMaxItems339 = value
        AppToast.show(this, "History Max Items339: $value")
    }
// v347: Screenshot Share Target339


internal fun PlayerActivity.showV347ScreenshotShareTarget339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347screenshotShareTarget339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347screenshotShareTarget339 = value
        AppToast.show(this, "Screenshot Share Target339: $value")
    }
// v347: Video Rotate Angle339


internal fun PlayerActivity.showV347VideoRotateAngle339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347videoRotateAngle339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347videoRotateAngle339 = value
        AppToast.show(this, "Video Rotate Angle339: $value")
    }
// v347: Danmaku Merge Threshold346


internal fun PlayerActivity.showV347DanmakuMergeThreshold346Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347danmakuMergeThreshold346).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold346",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347danmakuMergeThreshold346 = value
        AppToast.show(this, "Danmaku Merge Threshold346: $value")
    }
// v347: Subtitle Font Size346


internal fun PlayerActivity.showV347SubtitleFontSize346Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347subtitleFontSize346).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size346",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347subtitleFontSize346 = value
        AppToast.show(this, "Subtitle Font Size346: $value")
    }
// v348: Danmaku Merge Threshold347


internal fun PlayerActivity.showV348DanmakuMergeThreshold347Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348danmakuMergeThreshold347).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold347",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348danmakuMergeThreshold347 = value
        AppToast.show(this, "Danmaku Merge Threshold347: $value")
    }
// v348: Subtitle Font Size347


internal fun PlayerActivity.showV348SubtitleFontSize347Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348subtitleFontSize347).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size347",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348subtitleFontSize347 = value
        AppToast.show(this, "Subtitle Font Size347: $value")
    }
// v348: Cast Audio Delay340


internal fun PlayerActivity.showV348CastAudioDelay340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348castAudioDelay340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348castAudioDelay340 = value
        AppToast.show(this, "Cast Audio Delay340: $value")
    }
// v348: History Max Items340


internal fun PlayerActivity.showV348HistoryMaxItems340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348historyMaxItems340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348historyMaxItems340 = value
        AppToast.show(this, "History Max Items340: $value")
    }
// v348: Screenshot Share Target340


internal fun PlayerActivity.showV348ScreenshotShareTarget340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348screenshotShareTarget340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348screenshotShareTarget340 = value
        AppToast.show(this, "Screenshot Share Target340: $value")
    }
// v348: Video Rotate Angle340


internal fun PlayerActivity.showV348VideoRotateAngle340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348videoRotateAngle340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348videoRotateAngle340 = value
        AppToast.show(this, "Video Rotate Angle340: $value")
    }
// v348: Danmaku Merge Threshold348


internal fun PlayerActivity.showV348DanmakuMergeThreshold348Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348danmakuMergeThreshold348).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold348",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348danmakuMergeThreshold348 = value
        AppToast.show(this, "Danmaku Merge Threshold348: $value")
    }
// v348: Subtitle Font Size348


internal fun PlayerActivity.showV348SubtitleFontSize348Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348subtitleFontSize348).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size348",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348subtitleFontSize348 = value
        AppToast.show(this, "Subtitle Font Size348: $value")
    }
// v349: Danmaku Merge Threshold349


internal fun PlayerActivity.showV349DanmakuMergeThreshold349Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349danmakuMergeThreshold349).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold349",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349danmakuMergeThreshold349 = value
        AppToast.show(this, "Danmaku Merge Threshold349: $value")
    }
// v349: Subtitle Font Size349


internal fun PlayerActivity.showV349SubtitleFontSize349Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349subtitleFontSize349).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size349",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349subtitleFontSize349 = value
        AppToast.show(this, "Subtitle Font Size349: $value")
    }
// v349: Cast Audio Delay341


internal fun PlayerActivity.showV349CastAudioDelay341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349castAudioDelay341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349castAudioDelay341 = value
        AppToast.show(this, "Cast Audio Delay341: $value")
    }
// v349: History Max Items341


internal fun PlayerActivity.showV349HistoryMaxItems341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349historyMaxItems341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349historyMaxItems341 = value
        AppToast.show(this, "History Max Items341: $value")
    }
// v349: Screenshot Share Target341


internal fun PlayerActivity.showV349ScreenshotShareTarget341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349screenshotShareTarget341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349screenshotShareTarget341 = value
        AppToast.show(this, "Screenshot Share Target341: $value")
    }
// v349: Video Rotate Angle341


internal fun PlayerActivity.showV349VideoRotateAngle341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349videoRotateAngle341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349videoRotateAngle341 = value
        AppToast.show(this, "Video Rotate Angle341: $value")
    }
// v349: Danmaku Merge Threshold350


internal fun PlayerActivity.showV349DanmakuMergeThreshold350Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349danmakuMergeThreshold350).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold350",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349danmakuMergeThreshold350 = value
        AppToast.show(this, "Danmaku Merge Threshold350: $value")
    }
// v349: Subtitle Font Size350


internal fun PlayerActivity.showV349SubtitleFontSize350Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349subtitleFontSize350).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size350",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349subtitleFontSize350 = value
        AppToast.show(this, "Subtitle Font Size350: $value")
    }
// v350: Danmaku Merge Threshold351


internal fun PlayerActivity.showV350DanmakuMergeThreshold351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350danmakuMergeThreshold351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350danmakuMergeThreshold351 = value
        AppToast.show(this, "Danmaku Merge Threshold351: $value")
    }
// v350: Subtitle Font Size351


internal fun PlayerActivity.showV350SubtitleFontSize351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350subtitleFontSize351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350subtitleFontSize351 = value
        AppToast.show(this, "Subtitle Font Size351: $value")
    }
// v350: Cast Audio Delay342


internal fun PlayerActivity.showV350CastAudioDelay342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350castAudioDelay342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350castAudioDelay342 = value
        AppToast.show(this, "Cast Audio Delay342: $value")
    }
// v350: History Max Items342


internal fun PlayerActivity.showV350HistoryMaxItems342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350historyMaxItems342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350historyMaxItems342 = value
        AppToast.show(this, "History Max Items342: $value")
    }
// v350: Screenshot Share Target342


internal fun PlayerActivity.showV350ScreenshotShareTarget342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350screenshotShareTarget342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350screenshotShareTarget342 = value
        AppToast.show(this, "Screenshot Share Target342: $value")
    }
// v350: Video Rotate Angle342


internal fun PlayerActivity.showV350VideoRotateAngle342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350videoRotateAngle342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350videoRotateAngle342 = value
        AppToast.show(this, "Video Rotate Angle342: $value")
    }
// v350: Danmaku Merge Threshold352


internal fun PlayerActivity.showV350DanmakuMergeThreshold352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350danmakuMergeThreshold352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350danmakuMergeThreshold352 = value
        AppToast.show(this, "Danmaku Merge Threshold352: $value")
    }
// v350: Subtitle Font Size352


internal fun PlayerActivity.showV350SubtitleFontSize352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350subtitleFontSize352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350subtitleFontSize352 = value
        AppToast.show(this, "Subtitle Font Size352: $value")
    }
// v351: Network Bandwidth Limit351


internal fun PlayerActivity.showV351NetworkBandwidthLimit351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkBandwidthLimit351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkBandwidthLimit351 = value
        AppToast.show(this, "Network Bandwidth Limit351: $value")
    }
// v351: Network Retry Strategy351


internal fun PlayerActivity.showV351NetworkRetryStrategy351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkRetryStrategy351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkRetryStrategy351 = value
        AppToast.show(this, "Network Retry Strategy351: $value")
    }
// v351: Network Timeout Custom351


internal fun PlayerActivity.showV351NetworkTimeoutCustom351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkTimeoutCustom351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkTimeoutCustom351 = value
        AppToast.show(this, "Network Timeout Custom351: $value")
    }
// v351: Network Cache Strategy351


internal fun PlayerActivity.showV351NetworkCacheStrategy351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkCacheStrategy351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkCacheStrategy351 = value
        AppToast.show(this, "Network Cache Strategy351: $value")
    }
// v351: Network Connection Pool351


internal fun PlayerActivity.showV351NetworkConnectionPool351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkConnectionPool351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkConnectionPool351 = value
        AppToast.show(this, "Network Connection Pool351: $value")
    }
// v352: Network Bandwidth Limit352


internal fun PlayerActivity.showV352NetworkBandwidthLimit352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkBandwidthLimit352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkBandwidthLimit352 = value
        AppToast.show(this, "Network Bandwidth Limit352: $value")
    }
// v352: Network Retry Strategy352


internal fun PlayerActivity.showV352NetworkRetryStrategy352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkRetryStrategy352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkRetryStrategy352 = value
        AppToast.show(this, "Network Retry Strategy352: $value")
    }
// v352: Network Timeout Custom352


internal fun PlayerActivity.showV352NetworkTimeoutCustom352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkTimeoutCustom352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkTimeoutCustom352 = value
        AppToast.show(this, "Network Timeout Custom352: $value")
    }
// v352: Network Cache Strategy352


internal fun PlayerActivity.showV352NetworkCacheStrategy352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkCacheStrategy352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkCacheStrategy352 = value
        AppToast.show(this, "Network Cache Strategy352: $value")
    }
// v352: Network Connection Pool352


internal fun PlayerActivity.showV352NetworkConnectionPool352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkConnectionPool352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkConnectionPool352 = value
        AppToast.show(this, "Network Connection Pool352: $value")
    }
// v353: Network Bandwidth Limit353


internal fun PlayerActivity.showV353NetworkBandwidthLimit353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkBandwidthLimit353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkBandwidthLimit353 = value
        AppToast.show(this, "Network Bandwidth Limit353: $value")
    }
// v353: Network Retry Strategy353


internal fun PlayerActivity.showV353NetworkRetryStrategy353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkRetryStrategy353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkRetryStrategy353 = value
        AppToast.show(this, "Network Retry Strategy353: $value")
    }
// v353: Network Timeout Custom353


internal fun PlayerActivity.showV353NetworkTimeoutCustom353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkTimeoutCustom353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkTimeoutCustom353 = value
        AppToast.show(this, "Network Timeout Custom353: $value")
    }
// v353: Network Cache Strategy353


internal fun PlayerActivity.showV353NetworkCacheStrategy353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkCacheStrategy353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkCacheStrategy353 = value
        AppToast.show(this, "Network Cache Strategy353: $value")
    }
// v353: Network Connection Pool353


internal fun PlayerActivity.showV353NetworkConnectionPool353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkConnectionPool353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkConnectionPool353 = value
        AppToast.show(this, "Network Connection Pool353: $value")
    }
// v354: Network Bandwidth Limit354


internal fun PlayerActivity.showV354NetworkBandwidthLimit354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkBandwidthLimit354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkBandwidthLimit354 = value
        AppToast.show(this, "Network Bandwidth Limit354: $value")
    }
// v354: Network Retry Strategy354


internal fun PlayerActivity.showV354NetworkRetryStrategy354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkRetryStrategy354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkRetryStrategy354 = value
        AppToast.show(this, "Network Retry Strategy354: $value")
    }
// v354: Network Timeout Custom354


internal fun PlayerActivity.showV354NetworkTimeoutCustom354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkTimeoutCustom354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkTimeoutCustom354 = value
        AppToast.show(this, "Network Timeout Custom354: $value")
    }
// v354: Network Cache Strategy354


internal fun PlayerActivity.showV354NetworkCacheStrategy354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkCacheStrategy354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkCacheStrategy354 = value
        AppToast.show(this, "Network Cache Strategy354: $value")
    }
// v354: Network Connection Pool354


internal fun PlayerActivity.showV354NetworkConnectionPool354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkConnectionPool354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkConnectionPool354 = value
        AppToast.show(this, "Network Connection Pool354: $value")
    }
// v355: Network Bandwidth Limit355


internal fun PlayerActivity.showV355NetworkBandwidthLimit355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkBandwidthLimit355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkBandwidthLimit355 = value
        AppToast.show(this, "Network Bandwidth Limit355: $value")
    }
// v355: Network Retry Strategy355


internal fun PlayerActivity.showV355NetworkRetryStrategy355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkRetryStrategy355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkRetryStrategy355 = value
        AppToast.show(this, "Network Retry Strategy355: $value")
    }
// v355: Network Timeout Custom355


internal fun PlayerActivity.showV355NetworkTimeoutCustom355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkTimeoutCustom355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkTimeoutCustom355 = value
        AppToast.show(this, "Network Timeout Custom355: $value")
    }
// v355: Network Cache Strategy355


internal fun PlayerActivity.showV355NetworkCacheStrategy355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkCacheStrategy355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkCacheStrategy355 = value
        AppToast.show(this, "Network Cache Strategy355: $value")
    }
// v355: Network Connection Pool355


internal fun PlayerActivity.showV355NetworkConnectionPool355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkConnectionPool355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkConnectionPool355 = value
        AppToast.show(this, "Network Connection Pool355: $value")
    }
// v356: Network Bandwidth Limit356


internal fun PlayerActivity.showV356NetworkBandwidthLimit356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkBandwidthLimit356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkBandwidthLimit356 = value
        AppToast.show(this, "Network Bandwidth Limit356: $value")
    }
// v356: Network Retry Strategy356


internal fun PlayerActivity.showV356NetworkRetryStrategy356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkRetryStrategy356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkRetryStrategy356 = value
        AppToast.show(this, "Network Retry Strategy356: $value")
    }
// v356: Network Timeout Custom356


internal fun PlayerActivity.showV356NetworkTimeoutCustom356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkTimeoutCustom356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkTimeoutCustom356 = value
        AppToast.show(this, "Network Timeout Custom356: $value")
    }
// v356: Network Cache Strategy356


internal fun PlayerActivity.showV356NetworkCacheStrategy356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkCacheStrategy356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkCacheStrategy356 = value
        AppToast.show(this, "Network Cache Strategy356: $value")
    }
// v356: Network Connection Pool356


internal fun PlayerActivity.showV356NetworkConnectionPool356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkConnectionPool356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkConnectionPool356 = value
        AppToast.show(this, "Network Connection Pool356: $value")
    }
// v357: Network Bandwidth Limit357


internal fun PlayerActivity.showV357NetworkBandwidthLimit357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkBandwidthLimit357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkBandwidthLimit357 = value
        AppToast.show(this, "Network Bandwidth Limit357: $value")
    }
// v357: Network Retry Strategy357


internal fun PlayerActivity.showV357NetworkRetryStrategy357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkRetryStrategy357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkRetryStrategy357 = value
        AppToast.show(this, "Network Retry Strategy357: $value")
    }
// v357: Network Timeout Custom357


internal fun PlayerActivity.showV357NetworkTimeoutCustom357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkTimeoutCustom357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkTimeoutCustom357 = value
        AppToast.show(this, "Network Timeout Custom357: $value")
    }
// v357: Network Cache Strategy357


internal fun PlayerActivity.showV357NetworkCacheStrategy357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkCacheStrategy357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkCacheStrategy357 = value
        AppToast.show(this, "Network Cache Strategy357: $value")
    }
// v357: Network Connection Pool357


internal fun PlayerActivity.showV357NetworkConnectionPool357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkConnectionPool357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkConnectionPool357 = value
        AppToast.show(this, "Network Connection Pool357: $value")
    }
// v358: Network Bandwidth Limit358


internal fun PlayerActivity.showV358NetworkBandwidthLimit358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkBandwidthLimit358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkBandwidthLimit358 = value
        AppToast.show(this, "Network Bandwidth Limit358: $value")
    }
// v358: Network Retry Strategy358


internal fun PlayerActivity.showV358NetworkRetryStrategy358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkRetryStrategy358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkRetryStrategy358 = value
        AppToast.show(this, "Network Retry Strategy358: $value")
    }
// v358: Network Timeout Custom358


internal fun PlayerActivity.showV358NetworkTimeoutCustom358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkTimeoutCustom358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkTimeoutCustom358 = value
        AppToast.show(this, "Network Timeout Custom358: $value")
    }
// v358: Network Cache Strategy358


internal fun PlayerActivity.showV358NetworkCacheStrategy358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkCacheStrategy358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkCacheStrategy358 = value
        AppToast.show(this, "Network Cache Strategy358: $value")
    }
// v358: Network Connection Pool358


internal fun PlayerActivity.showV358NetworkConnectionPool358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkConnectionPool358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkConnectionPool358 = value
        AppToast.show(this, "Network Connection Pool358: $value")
    }
// v359: Network Bandwidth Limit359


internal fun PlayerActivity.showV359NetworkBandwidthLimit359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkBandwidthLimit359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkBandwidthLimit359 = value
        AppToast.show(this, "Network Bandwidth Limit359: $value")
    }
// v359: Network Retry Strategy359


internal fun PlayerActivity.showV359NetworkRetryStrategy359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkRetryStrategy359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkRetryStrategy359 = value
        AppToast.show(this, "Network Retry Strategy359: $value")
    }
// v359: Network Timeout Custom359


internal fun PlayerActivity.showV359NetworkTimeoutCustom359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkTimeoutCustom359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkTimeoutCustom359 = value
        AppToast.show(this, "Network Timeout Custom359: $value")
    }
// v359: Network Cache Strategy359


internal fun PlayerActivity.showV359NetworkCacheStrategy359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkCacheStrategy359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkCacheStrategy359 = value
        AppToast.show(this, "Network Cache Strategy359: $value")
    }
// v359: Network Connection Pool359


internal fun PlayerActivity.showV359NetworkConnectionPool359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkConnectionPool359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkConnectionPool359 = value
        AppToast.show(this, "Network Connection Pool359: $value")
    }
// v360: Network Bandwidth Limit360


internal fun PlayerActivity.showV360NetworkBandwidthLimit360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkBandwidthLimit360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkBandwidthLimit360 = value
        AppToast.show(this, "Network Bandwidth Limit360: $value")
    }
// v360: Network Retry Strategy360


internal fun PlayerActivity.showV360NetworkRetryStrategy360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkRetryStrategy360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkRetryStrategy360 = value
        AppToast.show(this, "Network Retry Strategy360: $value")
    }
// v360: Network Timeout Custom360


internal fun PlayerActivity.showV360NetworkTimeoutCustom360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkTimeoutCustom360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkTimeoutCustom360 = value
        AppToast.show(this, "Network Timeout Custom360: $value")
    }
// v360: Network Cache Strategy360


internal fun PlayerActivity.showV360NetworkCacheStrategy360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkCacheStrategy360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkCacheStrategy360 = value
        AppToast.show(this, "Network Cache Strategy360: $value")
    }
// v360: Network Connection Pool360


internal fun PlayerActivity.showV360NetworkConnectionPool360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkConnectionPool360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkConnectionPool360 = value
        AppToast.show(this, "Network Connection Pool360: $value")
    }
// v361: Sleep Timer Duration361


internal fun PlayerActivity.showV361SleepTimerDuration361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361sleepTimerDuration361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361sleepTimerDuration361 = value
        AppToast.show(this, "Sleep Timer Duration361: $value")
    }
// v361: Parental Time Limit361


internal fun PlayerActivity.showV361ParentalTimeLimit361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361parentalTimeLimit361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361parentalTimeLimit361 = value
        AppToast.show(this, "Parental Time Limit361: $value")
    }
// v361: Theme Accent Color361


internal fun PlayerActivity.showV361ThemeAccentColor361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361themeAccentColor361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361themeAccentColor361 = value
        AppToast.show(this, "Theme Accent Color361: $value")
    }
// v361: Theme Dark Mode361


internal fun PlayerActivity.showV361ThemeDarkMode361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361themeDarkMode361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361themeDarkMode361 = value
        AppToast.show(this, "Theme Dark Mode361: $value")
    }
// v361: Voice Control Language361


internal fun PlayerActivity.showV361VoiceControlLanguage361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361voiceControlLanguage361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361voiceControlLanguage361 = value
        AppToast.show(this, "Voice Control Language361: $value")
    }
// v362: Sleep Timer Duration362


internal fun PlayerActivity.showV362SleepTimerDuration362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v362sleepTimerDuration362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v362sleepTimerDuration362 = value
        AppToast.show(this, "Sleep Timer Duration362: $value")
    }
// v362: Parental Time Limit362


internal fun PlayerActivity.showV362ParentalTimeLimit362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v362parentalTimeLimit362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v362parentalTimeLimit362 = value
        AppToast.show(this, "Parental Time Limit362: $value")
    }
// v362: Theme Accent Color362


internal fun PlayerActivity.showV362ThemeAccentColor362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v362themeAccentColor362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v362themeAccentColor362 = value
        AppToast.show(this, "Theme Accent Color362: $value")
    }
// v362: Theme Dark Mode362


internal fun PlayerActivity.showV362ThemeDarkMode362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v362themeDarkMode362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v362themeDarkMode362 = value
        AppToast.show(this, "Theme Dark Mode362: $value")
    }
// v362: Voice Control Language362


internal fun PlayerActivity.showV362VoiceControlLanguage362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v362voiceControlLanguage362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v362voiceControlLanguage362 = value
        AppToast.show(this, "Voice Control Language362: $value")
    }
// v363: Sleep Timer Duration363


internal fun PlayerActivity.showV363SleepTimerDuration363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v363sleepTimerDuration363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v363sleepTimerDuration363 = value
        AppToast.show(this, "Sleep Timer Duration363: $value")
    }
// v363: Parental Time Limit363


internal fun PlayerActivity.showV363ParentalTimeLimit363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v363parentalTimeLimit363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v363parentalTimeLimit363 = value
        AppToast.show(this, "Parental Time Limit363: $value")
    }
// v363: Theme Accent Color363


internal fun PlayerActivity.showV363ThemeAccentColor363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v363themeAccentColor363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v363themeAccentColor363 = value
        AppToast.show(this, "Theme Accent Color363: $value")
    }
// v363: Theme Dark Mode363


internal fun PlayerActivity.showV363ThemeDarkMode363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v363themeDarkMode363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v363themeDarkMode363 = value
        AppToast.show(this, "Theme Dark Mode363: $value")
    }
// v363: Voice Control Language363


internal fun PlayerActivity.showV363VoiceControlLanguage363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v363voiceControlLanguage363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v363voiceControlLanguage363 = value
        AppToast.show(this, "Voice Control Language363: $value")
    }
// v364: Sleep Timer Duration364


internal fun PlayerActivity.showV364SleepTimerDuration364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v364sleepTimerDuration364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v364sleepTimerDuration364 = value
        AppToast.show(this, "Sleep Timer Duration364: $value")
    }
// v364: Parental Time Limit364


internal fun PlayerActivity.showV364ParentalTimeLimit364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v364parentalTimeLimit364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v364parentalTimeLimit364 = value
        AppToast.show(this, "Parental Time Limit364: $value")
    }
// v364: Theme Accent Color364


internal fun PlayerActivity.showV364ThemeAccentColor364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v364themeAccentColor364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v364themeAccentColor364 = value
        AppToast.show(this, "Theme Accent Color364: $value")
    }
// v364: Theme Dark Mode364


internal fun PlayerActivity.showV364ThemeDarkMode364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v364themeDarkMode364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v364themeDarkMode364 = value
        AppToast.show(this, "Theme Dark Mode364: $value")
    }
// v364: Voice Control Language364


internal fun PlayerActivity.showV364VoiceControlLanguage364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v364voiceControlLanguage364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v364voiceControlLanguage364 = value
        AppToast.show(this, "Voice Control Language364: $value")
    }
// v365: Sleep Timer Duration365


internal fun PlayerActivity.showV365SleepTimerDuration365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v365sleepTimerDuration365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v365sleepTimerDuration365 = value
        AppToast.show(this, "Sleep Timer Duration365: $value")
    }
// v365: Parental Time Limit365


internal fun PlayerActivity.showV365ParentalTimeLimit365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v365parentalTimeLimit365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v365parentalTimeLimit365 = value
        AppToast.show(this, "Parental Time Limit365: $value")
    }
// v365: Theme Accent Color365


internal fun PlayerActivity.showV365ThemeAccentColor365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v365themeAccentColor365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v365themeAccentColor365 = value
        AppToast.show(this, "Theme Accent Color365: $value")
    }
// v365: Theme Dark Mode365


internal fun PlayerActivity.showV365ThemeDarkMode365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v365themeDarkMode365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v365themeDarkMode365 = value
        AppToast.show(this, "Theme Dark Mode365: $value")
    }
// v365: Voice Control Language365


internal fun PlayerActivity.showV365VoiceControlLanguage365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v365voiceControlLanguage365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v365voiceControlLanguage365 = value
        AppToast.show(this, "Voice Control Language365: $value")
    }
// v366: Sleep Timer Duration366


internal fun PlayerActivity.showV366SleepTimerDuration366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v366sleepTimerDuration366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v366sleepTimerDuration366 = value
        AppToast.show(this, "Sleep Timer Duration366: $value")
    }
// v366: Parental Time Limit366


internal fun PlayerActivity.showV366ParentalTimeLimit366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v366parentalTimeLimit366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v366parentalTimeLimit366 = value
        AppToast.show(this, "Parental Time Limit366: $value")
    }
// v366: Theme Accent Color366


internal fun PlayerActivity.showV366ThemeAccentColor366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v366themeAccentColor366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v366themeAccentColor366 = value
        AppToast.show(this, "Theme Accent Color366: $value")
    }
// v366: Theme Dark Mode366


internal fun PlayerActivity.showV366ThemeDarkMode366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v366themeDarkMode366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v366themeDarkMode366 = value
        AppToast.show(this, "Theme Dark Mode366: $value")
    }
// v366: Voice Control Language366


internal fun PlayerActivity.showV366VoiceControlLanguage366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v366voiceControlLanguage366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v366voiceControlLanguage366 = value
        AppToast.show(this, "Voice Control Language366: $value")
    }
// v367: Sleep Timer Duration367


internal fun PlayerActivity.showV367SleepTimerDuration367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v367sleepTimerDuration367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v367sleepTimerDuration367 = value
        AppToast.show(this, "Sleep Timer Duration367: $value")
    }
// v367: Parental Time Limit367


internal fun PlayerActivity.showV367ParentalTimeLimit367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v367parentalTimeLimit367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v367parentalTimeLimit367 = value
        AppToast.show(this, "Parental Time Limit367: $value")
    }
// v367: Theme Accent Color367


internal fun PlayerActivity.showV367ThemeAccentColor367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v367themeAccentColor367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v367themeAccentColor367 = value
        AppToast.show(this, "Theme Accent Color367: $value")
    }
// v367: Theme Dark Mode367


internal fun PlayerActivity.showV367ThemeDarkMode367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v367themeDarkMode367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v367themeDarkMode367 = value
        AppToast.show(this, "Theme Dark Mode367: $value")
    }
// v367: Voice Control Language367


internal fun PlayerActivity.showV367VoiceControlLanguage367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v367voiceControlLanguage367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v367voiceControlLanguage367 = value
        AppToast.show(this, "Voice Control Language367: $value")
    }
// v368: Sleep Timer Duration368


internal fun PlayerActivity.showV368SleepTimerDuration368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v368sleepTimerDuration368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v368sleepTimerDuration368 = value
        AppToast.show(this, "Sleep Timer Duration368: $value")
    }
// v368: Parental Time Limit368


internal fun PlayerActivity.showV368ParentalTimeLimit368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v368parentalTimeLimit368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v368parentalTimeLimit368 = value
        AppToast.show(this, "Parental Time Limit368: $value")
    }
// v368: Theme Accent Color368


internal fun PlayerActivity.showV368ThemeAccentColor368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v368themeAccentColor368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v368themeAccentColor368 = value
        AppToast.show(this, "Theme Accent Color368: $value")
    }
// v368: Theme Dark Mode368


internal fun PlayerActivity.showV368ThemeDarkMode368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v368themeDarkMode368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v368themeDarkMode368 = value
        AppToast.show(this, "Theme Dark Mode368: $value")
    }
// v368: Voice Control Language368


internal fun PlayerActivity.showV368VoiceControlLanguage368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v368voiceControlLanguage368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v368voiceControlLanguage368 = value
        AppToast.show(this, "Voice Control Language368: $value")
    }
// v369: Sleep Timer Duration369


internal fun PlayerActivity.showV369SleepTimerDuration369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v369sleepTimerDuration369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v369sleepTimerDuration369 = value
        AppToast.show(this, "Sleep Timer Duration369: $value")
    }
// v369: Parental Time Limit369


internal fun PlayerActivity.showV369ParentalTimeLimit369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v369parentalTimeLimit369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v369parentalTimeLimit369 = value
        AppToast.show(this, "Parental Time Limit369: $value")
    }
// v369: Theme Accent Color369


internal fun PlayerActivity.showV369ThemeAccentColor369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v369themeAccentColor369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v369themeAccentColor369 = value
        AppToast.show(this, "Theme Accent Color369: $value")
    }
// v369: Theme Dark Mode369


internal fun PlayerActivity.showV369ThemeDarkMode369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v369themeDarkMode369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v369themeDarkMode369 = value
        AppToast.show(this, "Theme Dark Mode369: $value")
    }
// v369: Voice Control Language369


internal fun PlayerActivity.showV369VoiceControlLanguage369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v369voiceControlLanguage369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v369voiceControlLanguage369 = value
        AppToast.show(this, "Voice Control Language369: $value")
    }
// v370: Sleep Timer Duration370


internal fun PlayerActivity.showV370SleepTimerDuration370Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v370sleepTimerDuration370).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration370",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v370sleepTimerDuration370 = value
        AppToast.show(this, "Sleep Timer Duration370: $value")
    }
// v370: Parental Time Limit370


internal fun PlayerActivity.showV370ParentalTimeLimit370Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v370parentalTimeLimit370).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit370",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v370parentalTimeLimit370 = value
        AppToast.show(this, "Parental Time Limit370: $value")
    }
// v370: Theme Accent Color370


internal fun PlayerActivity.showV370ThemeAccentColor370Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v370themeAccentColor370).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color370",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v370themeAccentColor370 = value
        AppToast.show(this, "Theme Accent Color370: $value")
    }
// v370: Theme Dark Mode370


internal fun PlayerActivity.showV370ThemeDarkMode370Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v370themeDarkMode370).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode370",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v370themeDarkMode370 = value
        AppToast.show(this, "Theme Dark Mode370: $value")
    }
// v370: Voice Control Language370


internal fun PlayerActivity.showV370VoiceControlLanguage370Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v370voiceControlLanguage370).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Voice Control Language370",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v370voiceControlLanguage370 = value
        AppToast.show(this, "Voice Control Language370: $value")
    }
// v371: Caption Font Size371


internal fun PlayerActivity.showV371CaptionFontSize371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v371captionFontSize371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Font Size371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v371captionFontSize371 = value
        AppToast.show(this, "Caption Font Size371: $value")
    }
// v371: Caption Position371


internal fun PlayerActivity.showV371CaptionPosition371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v371captionPosition371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Caption Position371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v371captionPosition371 = value
        AppToast.show(this, "Caption Position371: $value")
    }
// v371: Chromecast Quality371


internal fun PlayerActivity.showV371ChromecastQuality371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v371chromecastQuality371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Chromecast Quality371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v371chromecastQuality371 = value
        AppToast.show(this, "Chromecast Quality371: $value")
    }
// v371: Floating Window Size371


internal fun PlayerActivity.showV371FloatingWindowSize371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v371floatingWindowSize371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Floating Window Size371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v371floatingWindowSize371 = value
        AppToast.show(this, "Floating Window Size371: $value")
    }
// v371: Recommend Algorithm371


internal fun PlayerActivity.showV371RecommendAlgorithm371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v371recommendAlgorithm371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Recommend Algorithm371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v371recommendAlgorithm371 = value
        AppToast.show(this, "Recommend Algorithm371: $value")
    }
// v371: Data Usage Limit371


