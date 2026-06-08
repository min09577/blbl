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

internal fun PlayerActivity.showV95DanmakuScrollEasingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v95danmakuScrollEasing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Easing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95danmakuScrollEasing = value
        AppToast.show(this, "Danmaku Scroll Easing: $value")
    }
}

internal fun PlayerActivity.showV95SubtitleBgGradientAngleDialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v95subtitleBgGradientAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Angle",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95subtitleBgGradientAngle = value
        AppToast.show(this, "Subtitle BG Gradient Angle: $value")
    }
}

internal fun PlayerActivity.showV95GestureDoubleTapTimeoutDialog() {
    val options = listOf(200, 250, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v95gestureDoubleTapTimeout).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Timeout",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95gestureDoubleTapTimeout = value
        AppToast.show(this, "Gesture Double Tap Timeout: $value")
    }
}

internal fun PlayerActivity.showV95CastAudioBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v95castAudioBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95castAudioBufferSize = value
        AppToast.show(this, "Cast Audio Buffer Size: $value")
    }
}

internal fun PlayerActivity.showV95PlaylistAutoGroupByDateToggle() {
    val enabled = !BiliClient.prefs.v95playlistAutoGroupByDate
    BiliClient.prefs.v95playlistAutoGroupByDate = enabled
    AppToast.show(this, "Playlist Auto Group By Date: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV95CacheStorageLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v95cacheStorageLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Storage Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95cacheStorageLimit = value
        AppToast.show(this, "Cache Storage Limit: $value")
    }
}

internal fun PlayerActivity.showV95ProgressBarChapterColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v95progressBarChapterColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Chapter Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95progressBarChapterColor = value
        AppToast.show(this, "Progress Bar Chapter Color: $value")
    }
}

internal fun PlayerActivity.showV95VolumeAutoCrossfadeToggle() {
    val enabled = !BiliClient.prefs.v95volumeAutoCrossfade
    BiliClient.prefs.v95volumeAutoCrossfade = enabled
    AppToast.show(this, "Volume Auto Crossfade: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV95HistoryImportAutoToggle() {
    val enabled = !BiliClient.prefs.v95historyImportAuto
    BiliClient.prefs.v95historyImportAuto = enabled
    AppToast.show(this, "History Import Auto: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV95PlaybackAutoSkipEnding95Toggle() {
    val enabled = !BiliClient.prefs.v95playbackAutoSkipEnding95
    BiliClient.prefs.v95playbackAutoSkipEnding95 = enabled
    AppToast.show(this, "Playback Auto Skip Ending95: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV95ScreenshotAutoOpenAfterToggle() {
    val enabled = !BiliClient.prefs.v95screenshotAutoOpenAfter
    BiliClient.prefs.v95screenshotAutoOpenAfter = enabled
    AppToast.show(this, "Screenshot Auto Open After: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV95VideoVHSEffectCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v95videoVHSEffectCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video VHS Effect Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95videoVHSEffectCustom = value
        AppToast.show(this, "Video VHS Effect Custom: $value")
    }
}

internal fun PlayerActivity.showV95DanmakuScrollAccelerationDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v95danmakuScrollAcceleration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Acceleration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95danmakuScrollAcceleration = value
        AppToast.show(this, "Danmaku Scroll Acceleration: $value")
    }
}

internal fun PlayerActivity.showV95SubtitleBgGradientOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v95subtitleBgGradientOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95subtitleBgGradientOpacity = value
        AppToast.show(this, "Subtitle BG Gradient Opacity: $value")
    }
}

internal fun PlayerActivity.showV96VideoNeonGlowCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v96videoNeonGlowCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Neon Glow Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96videoNeonGlowCustom = value
        AppToast.show(this, "Video Neon Glow Custom: $value")
    }
}

internal fun PlayerActivity.showV96DanmakuFontLetterSpacingDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v96danmakuFontLetterSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Letter Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96danmakuFontLetterSpacing = value
        AppToast.show(this, "Danmaku Font Letter Spacing: $value")
    }
}

internal fun PlayerActivity.showV96SubtitleBgGradientTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96subtitleBgGradientType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96subtitleBgGradientType = value
        AppToast.show(this, "Subtitle BG Gradient Type: $value")
    }
}

internal fun PlayerActivity.showV96GestureSwipeMinDistanceDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v96gestureSwipeMinDistance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Min Distance",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96gestureSwipeMinDistance = value
        AppToast.show(this, "Gesture Swipe Min Distance: $value")
    }
}

internal fun PlayerActivity.showV96CastVideoDecodeThreadsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96castVideoDecodeThreads).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Decode Threads",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96castVideoDecodeThreads = value
        AppToast.show(this, "Cast Video Decode Threads: $value")
    }
}

internal fun PlayerActivity.showV96PlaylistAutoGroupByTypeToggle() {
    val enabled = !BiliClient.prefs.v96playlistAutoGroupByType
    BiliClient.prefs.v96playlistAutoGroupByType = enabled
    AppToast.show(this, "Playlist Auto Group By Type: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV96CacheCleanupIntervalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96cacheCleanupInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96cacheCleanupInterval = value
        AppToast.show(this, "Cache Cleanup Interval: $value")
    }
}

internal fun PlayerActivity.showV96ProgressBarThumbShadowToggle() {
    val enabled = !BiliClient.prefs.v96progressBarThumbShadow
    BiliClient.prefs.v96progressBarThumbShadow = enabled
    AppToast.show(this, "Progress Bar Thumb Shadow: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV96VolumeAutoReplayGainToggle() {
    val enabled = !BiliClient.prefs.v96volumeAutoReplayGain
    BiliClient.prefs.v96volumeAutoReplayGain = enabled
    AppToast.show(this, "Volume Auto Replay Gain: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV96HistoryAutoCleanMaxDaysDialog() {
    val options = listOf(30, 60, 90, 180, 365)
    val currentIndex = options.indexOf(BiliClient.prefs.v96historyAutoCleanMaxDays).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Clean Max Days",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96historyAutoCleanMaxDays = value
        AppToast.show(this, "History Auto Clean Max Days: $value")
    }
}

internal fun PlayerActivity.showV96PlaybackAutoSkipCreditsToggle() {
    val enabled = !BiliClient.prefs.v96playbackAutoSkipCredits
    BiliClient.prefs.v96playbackAutoSkipCredits = enabled
    AppToast.show(this, "Playback Auto Skip Credits: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV96ScreenshotAutoShareTargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96screenshotAutoShareTarget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Share Target",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96screenshotAutoShareTarget = value
        AppToast.show(this, "Screenshot Auto Share Target: $value")
    }
}

internal fun PlayerActivity.showV96VideoDreamyEffectCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v96videoDreamyEffectCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Dreamy Effect Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96videoDreamyEffectCustom = value
        AppToast.show(this, "Video Dreamy Effect Custom: $value")
    }
}

internal fun PlayerActivity.showV96DanmakuScrollDecelerationDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v96danmakuScrollDeceleration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Deceleration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96danmakuScrollDeceleration = value
        AppToast.show(this, "Danmaku Scroll Deceleration: $value")
    }
}

internal fun PlayerActivity.showV96SubtitleBgGradientStartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96subtitleBgGradientStart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Start",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96subtitleBgGradientStart = value
        AppToast.show(this, "Subtitle BG Gradient Start: $value")
    }
}

internal fun PlayerActivity.showV97VideoSepiaCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v97videoSepiaCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sepia Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97videoSepiaCustom = value
        AppToast.show(this, "Video Sepia Custom: $value")
    }
}

internal fun PlayerActivity.showV97DanmakuFontWeightRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v97danmakuFontWeightRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Weight Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97danmakuFontWeightRange = value
        AppToast.show(this, "Danmaku Font Weight Range: $value")
    }
}

internal fun PlayerActivity.showV97SubtitleBgGradientEndDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v97subtitleBgGradientEnd).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient End",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97subtitleBgGradientEnd = value
        AppToast.show(this, "Subtitle BG Gradient End: $value")
    }
}

internal fun PlayerActivity.showV97GestureSwipeAngleThresholdDialog() {
    val options = listOf(15, 20, 30, 45, 60)
    val currentIndex = options.indexOf(BiliClient.prefs.v97gestureSwipeAngleThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Angle Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97gestureSwipeAngleThreshold = value
        AppToast.show(this, "Gesture Swipe Angle Threshold: $value")
    }
}

internal fun PlayerActivity.showV97CastVideoPostProcessingToggle() {
    val enabled = !BiliClient.prefs.v97castVideoPostProcessing
    BiliClient.prefs.v97castVideoPostProcessing = enabled
    AppToast.show(this, "Cast Video Post Processing: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV97PlaylistAutoGroupBySeasonToggle() {
    val enabled = !BiliClient.prefs.v97playlistAutoGroupBySeason
    BiliClient.prefs.v97playlistAutoGroupBySeason = enabled
    AppToast.show(this, "Playlist Auto Group By Season: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV97CachePreloadPolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v97cachePreloadPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97cachePreloadPolicy = value
        AppToast.show(this, "Cache Preload Policy: $value")
    }
}

internal fun PlayerActivity.showV97ProgressBarThumbGlowToggle() {
    val enabled = !BiliClient.prefs.v97progressBarThumbGlow
    BiliClient.prefs.v97progressBarThumbGlow = enabled
    AppToast.show(this, "Progress Bar Thumb Glow: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV97VolumeAutoPeakLimitToggle() {
    val enabled = !BiliClient.prefs.v97volumeAutoPeakLimit
    BiliClient.prefs.v97volumeAutoPeakLimit = enabled
    AppToast.show(this, "Volume Auto Peak Limit: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV97HistoryAutoCleanMinItemsDialog() {
    val options = listOf(50, 100, 200, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v97historyAutoCleanMinItems).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Clean Min Items",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97historyAutoCleanMinItems = value
        AppToast.show(this, "History Auto Clean Min Items: $value")
    }
}

internal fun PlayerActivity.showV97PlaybackAutoSkipRecap97Toggle() {
    val enabled = !BiliClient.prefs.v97playbackAutoSkipRecap97
    BiliClient.prefs.v97playbackAutoSkipRecap97 = enabled
    AppToast.show(this, "Playback Auto Skip Recap97: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV97ScreenshotAutoAnnotateTextToggle() {
    val enabled = !BiliClient.prefs.v97screenshotAutoAnnotateText
    BiliClient.prefs.v97screenshotAutoAnnotateText = enabled
    AppToast.show(this, "Screenshot Auto Annotate Text: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV97VideoPolaroidCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v97videoPolaroidCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Polaroid Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97videoPolaroidCustom = value
        AppToast.show(this, "Video Polaroid Custom: $value")
    }
}

internal fun PlayerActivity.showV97DanmakuFontSizeMinDialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v97danmakuFontSizeMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97danmakuFontSizeMin = value
        AppToast.show(this, "Danmaku Font Size Min: $value")
    }
}

internal fun PlayerActivity.showV97SubtitleAnimationType97Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v97subtitleAnimationType97).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Type97",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97subtitleAnimationType97 = value
        AppToast.show(this, "Subtitle Animation Type97: $value")
    }
}

internal fun PlayerActivity.showV98VideoNegativeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v98videoNegativeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Negative Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98videoNegativeCustom = value
        AppToast.show(this, "Video Negative Custom: $value")
    }
}

internal fun PlayerActivity.showV98DanmakuFontSizeMaxDialog() {
    val options = listOf(24, 32, 40, 48, 64)
    val currentIndex = options.indexOf(BiliClient.prefs.v98danmakuFontSizeMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98danmakuFontSizeMax = value
        AppToast.show(this, "Danmaku Font Size Max: $value")
    }
}

internal fun PlayerActivity.showV98SubtitleAnimationSpeed98Dialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v98subtitleAnimationSpeed98).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Speed98",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98subtitleAnimationSpeed98 = value
        AppToast.show(this, "Subtitle Animation Speed98: $value")
    }
}

internal fun PlayerActivity.showV98GesturePinchMinScaleDialog() {
    val options = listOf(25, 30, 50, 70, 80)
    val currentIndex = options.indexOf(BiliClient.prefs.v98gesturePinchMinScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Min Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98gesturePinchMinScale = value
        AppToast.show(this, "Gesture Pinch Min Scale: $value")
    }
}

internal fun PlayerActivity.showV98CastAudioPostProcessingToggle() {
    val enabled = !BiliClient.prefs.v98castAudioPostProcessing
    BiliClient.prefs.v98castAudioPostProcessing = enabled
    AppToast.show(this, "Cast Audio Post Processing: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV98PlaylistAutoGroupByGenreToggle() {
    val enabled = !BiliClient.prefs.v98playlistAutoGroupByGenre
    BiliClient.prefs.v98playlistAutoGroupByGenre = enabled
    AppToast.show(this, "Playlist Auto Group By Genre: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV98CacheDownloadOnWifiToggle() {
    val enabled = !BiliClient.prefs.v98cacheDownloadOnWifi
    BiliClient.prefs.v98cacheDownloadOnWifi = enabled
    AppToast.show(this, "Cache Download On Wifi: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV98ProgressBarThumbBorderToggle() {
    val enabled = !BiliClient.prefs.v98progressBarThumbBorder
    BiliClient.prefs.v98progressBarThumbBorder = enabled
    AppToast.show(this, "Progress Bar Thumb Border: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV98VolumeAutoRMSLevelToggle() {
    val enabled = !BiliClient.prefs.v98volumeAutoRMSLevel
    BiliClient.prefs.v98volumeAutoRMSLevel = enabled
    AppToast.show(this, "Volume Auto RMS Level: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV98HistoryAutoCleanOnStartToggle() {
    val enabled = !BiliClient.prefs.v98historyAutoCleanOnStart
    BiliClient.prefs.v98historyAutoCleanOnStart = enabled
    AppToast.show(this, "History Auto Clean On Start: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV98PlaybackAutoSkipFiller98Toggle() {
    val enabled = !BiliClient.prefs.v98playbackAutoSkipFiller98
    BiliClient.prefs.v98playbackAutoSkipFiller98 = enabled
    AppToast.show(this, "Playback Auto Skip Filler98: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV98ScreenshotAutoUploadCloudToggle() {
    val enabled = !BiliClient.prefs.v98screenshotAutoUploadCloud
    BiliClient.prefs.v98screenshotAutoUploadCloud = enabled
    AppToast.show(this, "Screenshot Auto Upload Cloud: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV98VideoMonochromeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v98videoMonochromeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Monochrome Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98videoMonochromeCustom = value
        AppToast.show(this, "Video Monochrome Custom: $value")
    }
}

internal fun PlayerActivity.showV98DanmakuFontStyleCustom98Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v98danmakuFontStyleCustom98).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Style Custom98",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98danmakuFontStyleCustom98 = value
        AppToast.show(this, "Danmaku Font Style Custom98: $value")
    }
}

internal fun PlayerActivity.showV98SubtitleAnimationEasing98Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v98subtitleAnimationEasing98).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Easing98",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98subtitleAnimationEasing98 = value
        AppToast.show(this, "Subtitle Animation Easing98: $value")
    }
}

internal fun PlayerActivity.showV99VideoPosterizeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v99videoPosterizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Posterize Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99videoPosterizeCustom = value
        AppToast.show(this, "Video Posterize Custom: $value")
    }
}

internal fun PlayerActivity.showV99DanmakuFontOutlineToggleToggle() {
    val enabled = !BiliClient.prefs.v99danmakuFontOutlineToggle
    BiliClient.prefs.v99danmakuFontOutlineToggle = enabled
    AppToast.show(this, "Danmaku Font Outline Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV99SubtitleAnimationDuration99Dialog() {
    val options = listOf(100, 200, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v99subtitleAnimationDuration99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Duration99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99subtitleAnimationDuration99 = value
        AppToast.show(this, "Subtitle Animation Duration99: $value")
    }
}

internal fun PlayerActivity.showV99GesturePinchMaxScaleDialog() {
    val options = listOf(150, 200, 250, 300, 400)
    val currentIndex = options.indexOf(BiliClient.prefs.v99gesturePinchMaxScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Max Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99gesturePinchMaxScale = value
        AppToast.show(this, "Gesture Pinch Max Scale: $value")
    }
}

internal fun PlayerActivity.showV99CastVideoAutoQualityToggle() {
    val enabled = !BiliClient.prefs.v99castVideoAutoQuality
    BiliClient.prefs.v99castVideoAutoQuality = enabled
    AppToast.show(this, "Cast Video Auto Quality: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV99PlaylistAutoGroupByChannelToggle() {
    val enabled = !BiliClient.prefs.v99playlistAutoGroupByChannel
    BiliClient.prefs.v99playlistAutoGroupByChannel = enabled
    AppToast.show(this, "Playlist Auto Group By Channel: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV99CacheDownloadSpeedLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v99cacheDownloadSpeedLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99cacheDownloadSpeedLimit = value
        AppToast.show(this, "Cache Download Speed Limit: $value")
    }
}

internal fun PlayerActivity.showV99ProgressBarThumbSize99Dialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v99progressBarThumbSize99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99progressBarThumbSize99 = value
        AppToast.show(this, "Progress Bar Thumb Size99: $value")
    }
}

internal fun PlayerActivity.showV99VolumeAutoLoudness99Toggle() {
    val enabled = !BiliClient.prefs.v99volumeAutoLoudness99
    BiliClient.prefs.v99volumeAutoLoudness99 = enabled
    AppToast.show(this, "Volume Auto Loudness99: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV99HistoryAutoCleanOnExitToggle() {
    val enabled = !BiliClient.prefs.v99historyAutoCleanOnExit
    BiliClient.prefs.v99historyAutoCleanOnExit = enabled
    AppToast.show(this, "History Auto Clean On Exit: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV99PlaybackAutoSkipIntro99Toggle() {
    val enabled = !BiliClient.prefs.v99playbackAutoSkipIntro99
    BiliClient.prefs.v99playbackAutoSkipIntro99 = enabled
    AppToast.show(this, "Playback Auto Skip Intro99: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV99ScreenshotAutoShare99Toggle() {
    val enabled = !BiliClient.prefs.v99screenshotAutoShare99
    BiliClient.prefs.v99screenshotAutoShare99 = enabled
    AppToast.show(this, "Screenshot Auto Share99: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV99VideoSolarizeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v99videoSolarizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Solarize Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99videoSolarizeCustom = value
        AppToast.show(this, "Video Solarize Custom: $value")
    }
}

internal fun PlayerActivity.showV99DanmakuFontColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v99danmakuFontColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99danmakuFontColorCustom = value
        AppToast.show(this, "Danmaku Font Color Custom: $value")
    }
}

internal fun PlayerActivity.showV99SubtitleAnimationLoop99Toggle() {
    val enabled = !BiliClient.prefs.v99subtitleAnimationLoop99
    BiliClient.prefs.v99subtitleAnimationLoop99 = enabled
    AppToast.show(this, "Subtitle Animation Loop99: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV100VideoDuotoneCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v100videoDuotoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Duotone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100videoDuotoneCustom = value
        AppToast.show(this, "Video Duotone Custom: $value")
    }
}

internal fun PlayerActivity.showV100DanmakuFontBgToggleToggle() {
    val enabled = !BiliClient.prefs.v100danmakuFontBgToggle
    BiliClient.prefs.v100danmakuFontBgToggle = enabled
    AppToast.show(this, "Danmaku Font BG Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV100SubtitleAnimationDelay99Dialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v100subtitleAnimationDelay99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100subtitleAnimationDelay99 = value
        AppToast.show(this, "Subtitle Animation Delay99: $value")
    }
}

internal fun PlayerActivity.showV100GesturePinchSpeed99Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v100gesturePinchSpeed99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Speed99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100gesturePinchSpeed99 = value
        AppToast.show(this, "Gesture Pinch Speed99: $value")
    }
}

internal fun PlayerActivity.showV100CastAudioAutoQualityToggle() {
    val enabled = !BiliClient.prefs.v100castAudioAutoQuality
    BiliClient.prefs.v100castAudioAutoQuality = enabled
    AppToast.show(this, "Cast Audio Auto Quality: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV100PlaylistAutoGroupAllToggle() {
    val enabled = !BiliClient.prefs.v100playlistAutoGroupAll
    BiliClient.prefs.v100playlistAutoGroupAll = enabled
    AppToast.show(this, "Playlist Auto Group All: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV100CacheDownloadRetryDialog() {
    val options = listOf(1, 2, 3, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v100cacheDownloadRetry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Retry",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100cacheDownloadRetry = value
        AppToast.show(this, "Cache Download Retry: $value")
    }
}

internal fun PlayerActivity.showV100ProgressBarThumbColor99Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v100progressBarThumbColor99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Color99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100progressBarThumbColor99 = value
        AppToast.show(this, "Progress Bar Thumb Color99: $value")
    }
}

internal fun PlayerActivity.showV100VolumeAutoNormalize99Toggle() {
    val enabled = !BiliClient.prefs.v100volumeAutoNormalize99
    BiliClient.prefs.v100volumeAutoNormalize99 = enabled
    AppToast.show(this, "Volume Auto Normalize99: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV100HistoryAutoSync99Toggle() {
    val enabled = !BiliClient.prefs.v100historyAutoSync99
    BiliClient.prefs.v100historyAutoSync99 = enabled
    AppToast.show(this, "History Auto Sync99: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV100PlaybackAutoSkipOutro99Toggle() {
    val enabled = !BiliClient.prefs.v100playbackAutoSkipOutro99
    BiliClient.prefs.v100playbackAutoSkipOutro99 = enabled
    AppToast.show(this, "Playback Auto Skip Outro99: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV100ScreenshotAutoFormat99Dialog() {
    val options = listOf(0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v100screenshotAutoFormat99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Format99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100screenshotAutoFormat99 = value
        AppToast.show(this, "Screenshot Auto Format99: $value")
    }
}

internal fun PlayerActivity.showV100VideoTintDuotoneDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v100videoTintDuotone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Tint Duotone",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100videoTintDuotone = value
        AppToast.show(this, "Video Tint Duotone: $value")
    }
}

internal fun PlayerActivity.showV100DanmakuFontWeight99Dialog() {
    val options = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v100danmakuFontWeight99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Weight99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100danmakuFontWeight99 = value
        AppToast.show(this, "Danmaku Font Weight99: $value")
    }
}

internal fun PlayerActivity.showV100SubtitleAnimationType99Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v100subtitleAnimationType99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Type99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100subtitleAnimationType99 = value
        AppToast.show(this, "Subtitle Animation Type99: $value")
    }
}

internal fun PlayerActivity.showV101AudioSpatialWidthCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v101audioSpatialWidthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Spatial Width Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101audioSpatialWidthCustom = value
        AppToast.show(this, "Audio Spatial Width Custom: $value")
    }
}

internal fun PlayerActivity.showV101DanmakuFontStretchToggleToggle() {
    val enabled = !BiliClient.prefs.v101danmakuFontStretchToggle
    BiliClient.prefs.v101danmakuFontStretchToggle = enabled
    AppToast.show(this, "Danmaku Font Stretch Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV101SubtitleShadowColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v101subtitleShadowColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101subtitleShadowColorCustom = value
        AppToast.show(this, "Subtitle Shadow Color Custom: $value")
    }
}

internal fun PlayerActivity.showV101GestureSwipeLockHorizontalToggle() {
    val enabled = !BiliClient.prefs.v101gestureSwipeLockHorizontal
    BiliClient.prefs.v101gestureSwipeLockHorizontal = enabled
    AppToast.show(this, "Gesture Swipe Lock Horizontal: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV101CastVideoHDRModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v101castVideoHDRMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video HDR Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101castVideoHDRMode = value
        AppToast.show(this, "Cast Video HDR Mode: $value")
    }
}

internal fun PlayerActivity.showV101PlaylistAutoRemoveWatchedToggle() {
    val enabled = !BiliClient.prefs.v101playlistAutoRemoveWatched
    BiliClient.prefs.v101playlistAutoRemoveWatched = enabled
    AppToast.show(this, "Playlist Auto Remove Watched: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV101CacheEncryptToggleToggle() {
    val enabled = !BiliClient.prefs.v101cacheEncryptToggle
    BiliClient.prefs.v101cacheEncryptToggle = enabled
    AppToast.show(this, "Cache Encrypt Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV101ProgressBarChapterSnapToggle() {
    val enabled = !BiliClient.prefs.v101progressBarChapterSnap
    BiliClient.prefs.v101progressBarChapterSnap = enabled
    AppToast.show(this, "Progress Bar Chapter Snap: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV101VolumeEQPresetCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v101volumeEQPresetCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume EQ Preset Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101volumeEQPresetCustom = value
        AppToast.show(this, "Volume EQ Preset Custom: $value")
    }
}

internal fun PlayerActivity.showV101HistorySearchHighlightToggle() {
    val enabled = !BiliClient.prefs.v101historySearchHighlight
    BiliClient.prefs.v101historySearchHighlight = enabled
    AppToast.show(this, "History Search Highlight: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV101PlaybackLoopSegmentABToggle() {
    val enabled = !BiliClient.prefs.v101playbackLoopSegmentAB
    BiliClient.prefs.v101playbackLoopSegmentAB = enabled
    AppToast.show(this, "Playback Loop Segment AB: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV101ScreenshotAutoCropToggle() {
    val enabled = !BiliClient.prefs.v101screenshotAutoCrop
    BiliClient.prefs.v101screenshotAutoCrop = enabled
    AppToast.show(this, "Screenshot Auto Crop: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV101VideoEdgeEnhanceCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v101videoEdgeEnhanceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Edge Enhance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101videoEdgeEnhanceCustom = value
        AppToast.show(this, "Video Edge Enhance Custom: $value")
    }
}

internal fun PlayerActivity.showV101DanmakuFontGlowToggleToggle() {
    val enabled = !BiliClient.prefs.v101danmakuFontGlowToggle
    BiliClient.prefs.v101danmakuFontGlowToggle = enabled
    AppToast.show(this, "Danmaku Font Glow Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV101SubtitleLineSpacingDialog() {
    val options = listOf(80, 100, 120, 140, 160)
    val currentIndex = options.indexOf(BiliClient.prefs.v101subtitleLineSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Line Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101subtitleLineSpacing = value
        AppToast.show(this, "Subtitle Line Spacing: $value")
    }
}

internal fun PlayerActivity.showV102AudioBassBoostCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v102audioBassBoostCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Bass Boost Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102audioBassBoostCustom = value
        AppToast.show(this, "Audio Bass Boost Custom: $value")
    }
}

internal fun PlayerActivity.showV102DanmakuFontStrokeWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v102danmakuFontStrokeWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Stroke Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102danmakuFontStrokeWidth = value
        AppToast.show(this, "Danmaku Font Stroke Width: $value")
    }
}

internal fun PlayerActivity.showV102SubtitleTextAlignmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102subtitleTextAlignment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Text Alignment",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102subtitleTextAlignment = value
        AppToast.show(this, "Subtitle Text Alignment: $value")
    }
}

internal fun PlayerActivity.showV102GestureSwipeLockVerticalToggle() {
    val enabled = !BiliClient.prefs.v102gestureSwipeLockVertical
    BiliClient.prefs.v102gestureSwipeLockVertical = enabled
    AppToast.show(this, "Gesture Swipe Lock Vertical: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV102CastVideoAVSyncDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102castVideoAVSync).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video AV Sync",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102castVideoAVSync = value
        AppToast.show(this, "Cast Video AV Sync: $value")
    }
}

internal fun PlayerActivity.showV102PlaylistAutoReverseOrderToggle() {
    val enabled = !BiliClient.prefs.v102playlistAutoReverseOrder
    BiliClient.prefs.v102playlistAutoReverseOrder = enabled
    AppToast.show(this, "Playlist Auto Reverse Order: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV102CacheAutoClearOnFullToggle() {
    val enabled = !BiliClient.prefs.v102cacheAutoClearOnFull
    BiliClient.prefs.v102cacheAutoClearOnFull = enabled
    AppToast.show(this, "Cache Auto Clear On Full: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV102ProgressBarBufferShowToggle() {
    val enabled = !BiliClient.prefs.v102progressBarBufferShow
    BiliClient.prefs.v102progressBarBufferShow = enabled
    AppToast.show(this, "Progress Bar Buffer Show: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV102VolumeEQGainPreampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102volumeEQGainPreamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume EQ Gain Preamp",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102volumeEQGainPreamp = value
        AppToast.show(this, "Volume EQ Gain Preamp: $value")
    }
}

internal fun PlayerActivity.showV102HistoryPinRecordToggleToggle() {
    val enabled = !BiliClient.prefs.v102historyPinRecordToggle
    BiliClient.prefs.v102historyPinRecordToggle = enabled
    AppToast.show(this, "History Pin Record Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV102PlaybackLoopSegmentCountDialog() {
    val options = listOf(1, 2, 3, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v102playbackLoopSegmentCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Loop Segment Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102playbackLoopSegmentCount = value
        AppToast.show(this, "Playback Loop Segment Count: $value")
    }
}

internal fun PlayerActivity.showV102ScreenshotAutoRotateToggle() {
    val enabled = !BiliClient.prefs.v102screenshotAutoRotate
    BiliClient.prefs.v102screenshotAutoRotate = enabled
    AppToast.show(this, "Screenshot Auto Rotate: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV102VideoMosaicEffectCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v102videoMosaicEffectCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Mosaic Effect Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102videoMosaicEffectCustom = value
        AppToast.show(this, "Video Mosaic Effect Custom: $value")
    }
}

internal fun PlayerActivity.showV102DanmakuFontGlowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102danmakuFontGlowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Glow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102danmakuFontGlowColor = value
        AppToast.show(this, "Danmaku Font Glow Color: $value")
    }
}

internal fun PlayerActivity.showV102SubtitleTextTransformCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102subtitleTextTransformCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Text Transform Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102subtitleTextTransformCustom = value
        AppToast.show(this, "Subtitle Text Transform Custom: $value")
    }
}

internal fun PlayerActivity.showV103AudioTrebleBoostCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v103audioTrebleBoostCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Treble Boost Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103audioTrebleBoostCustom = value
        AppToast.show(this, "Audio Treble Boost Custom: $value")
    }
}

internal fun PlayerActivity.showV103DanmakuFontGlowRadiusDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v103danmakuFontGlowRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Glow Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103danmakuFontGlowRadius = value
        AppToast.show(this, "Danmaku Font Glow Radius: $value")
    }
}

internal fun PlayerActivity.showV103SubtitleFontVariantCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103subtitleFontVariantCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Variant Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103subtitleFontVariantCustom = value
        AppToast.show(this, "Subtitle Font Variant Custom: $value")
    }
}

internal fun PlayerActivity.showV103GestureLongPressDragActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103gestureLongPressDragAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Drag Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103gestureLongPressDragAction = value
        AppToast.show(this, "Gesture Long Press Drag Action: $value")
    }
}

internal fun PlayerActivity.showV103CastVideoBitDepthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103castVideoBitDepth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Bit Depth",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103castVideoBitDepth = value
        AppToast.show(this, "Cast Video Bit Depth: $value")
    }
}

internal fun PlayerActivity.showV103PlaylistAutoSkipDuplicateToggle() {
    val enabled = !BiliClient.prefs.v103playlistAutoSkipDuplicate
    BiliClient.prefs.v103playlistAutoSkipDuplicate = enabled
    AppToast.show(this, "Playlist Auto Skip Duplicate: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV103CacheThumbnailPreloadToggle() {
    val enabled = !BiliClient.prefs.v103cacheThumbnailPreload
    BiliClient.prefs.v103cacheThumbnailPreload = enabled
    AppToast.show(this, "Cache Thumbnail Preload: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV103ProgressBarLiveEdgeColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103progressBarLiveEdgeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Live Edge Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103progressBarLiveEdgeColor = value
        AppToast.show(this, "Progress Bar Live Edge Color: $value")
    }
}

internal fun PlayerActivity.showV103VolumeNightBoostToggleToggle() {
    val enabled = !BiliClient.prefs.v103volumeNightBoostToggle
    BiliClient.prefs.v103volumeNightBoostToggle = enabled
    AppToast.show(this, "Volume Night Boost Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV103HistoryUndoDeleteToggleToggle() {
    val enabled = !BiliClient.prefs.v103historyUndoDeleteToggle
    BiliClient.prefs.v103historyUndoDeleteToggle = enabled
    AppToast.show(this, "History Undo Delete Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV103PlaybackABLoopMemoryToggle() {
    val enabled = !BiliClient.prefs.v103playbackABLoopMemory
    BiliClient.prefs.v103playbackABLoopMemory = enabled
    AppToast.show(this, "Playback AB Loop Memory: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV103ScreenshotAutoNamingSchemeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103screenshotAutoNamingScheme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Naming Scheme",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103screenshotAutoNamingScheme = value
        AppToast.show(this, "Screenshot Auto Naming Scheme: $value")
    }
}

internal fun PlayerActivity.showV103VideoKaleidoscopeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103videoKaleidoscopeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Kaleidoscope Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103videoKaleidoscopeCustom = value
        AppToast.show(this, "Video Kaleidoscope Custom: $value")
    }
}

internal fun PlayerActivity.showV103DanmakuFontGlowIntensityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v103danmakuFontGlowIntensity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Glow Intensity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103danmakuFontGlowIntensity = value
        AppToast.show(this, "Danmaku Font Glow Intensity: $value")
    }
}

internal fun PlayerActivity.showV103SubtitleFontLoadCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103subtitleFontLoadCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Load Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103subtitleFontLoadCustom = value
        AppToast.show(this, "Subtitle Font Load Custom: $value")
    }
}

internal fun PlayerActivity.showV104AudioVocalBoostCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v104audioVocalBoostCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Vocal Boost Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104audioVocalBoostCustom = value
        AppToast.show(this, "Audio Vocal Boost Custom: $value")
    }
}

internal fun PlayerActivity.showV104DanmakuFontGlowSpreadDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v104danmakuFontGlowSpread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Glow Spread",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104danmakuFontGlowSpread = value
        AppToast.show(this, "Danmaku Font Glow Spread: $value")
    }
}

internal fun PlayerActivity.showV104SubtitleFontScaleCustomDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v104subtitleFontScaleCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Scale Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104subtitleFontScaleCustom = value
        AppToast.show(this, "Subtitle Font Scale Custom: $value")
    }
}

internal fun PlayerActivity.showV104GestureQuickScrubToggleToggle() {
    val enabled = !BiliClient.prefs.v104gestureQuickScrubToggle
    BiliClient.prefs.v104gestureQuickScrubToggle = enabled
    AppToast.show(this, "Gesture Quick Scrub Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV104CastVideoFieldOrderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104castVideoFieldOrder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Field Order",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104castVideoFieldOrder = value
        AppToast.show(this, "Cast Video Field Order: $value")
    }
}

internal fun PlayerActivity.showV104PlaylistAutoDownloadNextToggle() {
    val enabled = !BiliClient.prefs.v104playlistAutoDownloadNext
    BiliClient.prefs.v104playlistAutoDownloadNext = enabled
    AppToast.show(this, "Playlist Auto Download Next: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV104CacheVideoOnlyModeToggle() {
    val enabled = !BiliClient.prefs.v104cacheVideoOnlyMode
    BiliClient.prefs.v104cacheVideoOnlyMode = enabled
    AppToast.show(this, "Cache Video Only Mode: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV104ProgressBarTimeCodeFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104progressBarTimeCodeFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Time Code Format",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104progressBarTimeCodeFormat = value
        AppToast.show(this, "Progress Bar Time Code Format: $value")
    }
}

internal fun PlayerActivity.showV104VolumeAudioChannelMapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104volumeAudioChannelMap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Audio Channel Map",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104volumeAudioChannelMap = value
        AppToast.show(this, "Volume Audio Channel Map: $value")
    }
}

internal fun PlayerActivity.showV104HistoryBatchDeleteModeToggle() {
    val enabled = !BiliClient.prefs.v104historyBatchDeleteMode
    BiliClient.prefs.v104historyBatchDeleteMode = enabled
    AppToast.show(this, "History Batch Delete Mode: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV104PlaybackABLoopAutoSaveToggle() {
    val enabled = !BiliClient.prefs.v104playbackABLoopAutoSave
    BiliClient.prefs.v104playbackABLoopAutoSave = enabled
    AppToast.show(this, "Playback AB Loop Auto Save: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV104ScreenshotAutoOptimizeToggle() {
    val enabled = !BiliClient.prefs.v104screenshotAutoOptimize
    BiliClient.prefs.v104screenshotAutoOptimize = enabled
    AppToast.show(this, "Screenshot Auto Optimize: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV104VideoMirrorFlipCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104videoMirrorFlipCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Mirror Flip Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104videoMirrorFlipCustom = value
        AppToast.show(this, "Video Mirror Flip Custom: $value")
    }
}

internal fun PlayerActivity.showV104DanmakuFontGradientToggleToggle() {
    val enabled = !BiliClient.prefs.v104danmakuFontGradientToggle
    BiliClient.prefs.v104danmakuFontGradientToggle = enabled
    AppToast.show(this, "Danmaku Font Gradient Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV104SubtitleFontColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104subtitleFontColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104subtitleFontColorCustom = value
        AppToast.show(this, "Subtitle Font Color Custom: $value")
    }
}

internal fun PlayerActivity.showV105AudioVirtualSurroundCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v105audioVirtualSurroundCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Virtual Surround Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105audioVirtualSurroundCustom = value
        AppToast.show(this, "Audio Virtual Surround Custom: $value")
    }
}

internal fun PlayerActivity.showV105DanmakuFontGradientStartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105danmakuFontGradientStart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Gradient Start",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105danmakuFontGradientStart = value
        AppToast.show(this, "Danmaku Font Gradient Start: $value")
    }
}

internal fun PlayerActivity.showV105SubtitleFontAlphaCustomDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v105subtitleFontAlphaCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Alpha Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105subtitleFontAlphaCustom = value
        AppToast.show(this, "Subtitle Font Alpha Custom: $value")
    }
}

internal fun PlayerActivity.showV105GestureQuickSeekDistanceDialog() {
    val options = listOf(5, 10, 15, 20, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v105gestureQuickSeekDistance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Quick Seek Distance",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105gestureQuickSeekDistance = value
        AppToast.show(this, "Gesture Quick Seek Distance: $value")
    }
}

internal fun PlayerActivity.showV105CastVideoColorSpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105castVideoColorSpace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Color Space",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105castVideoColorSpace = value
        AppToast.show(this, "Cast Video Color Space: $value")
    }
}

internal fun PlayerActivity.showV105PlaylistAutoSortByPopularToggle() {
    val enabled = !BiliClient.prefs.v105playlistAutoSortByPopular
    BiliClient.prefs.v105playlistAutoSortByPopular = enabled
    AppToast.show(this, "Playlist Auto Sort By Popular: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV105CacheAudioOnlyModeToggle() {
    val enabled = !BiliClient.prefs.v105cacheAudioOnlyMode
    BiliClient.prefs.v105cacheAudioOnlyMode = enabled
    AppToast.show(this, "Cache Audio Only Mode: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV105ProgressBarCustomScaleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105progressBarCustomScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105progressBarCustomScale = value
        AppToast.show(this, "Progress Bar Custom Scale: $value")
    }
}

internal fun PlayerActivity.showV105VolumeHeadphoneOptimizeToggle() {
    val enabled = !BiliClient.prefs.v105volumeHeadphoneOptimize
    BiliClient.prefs.v105volumeHeadphoneOptimize = enabled
    AppToast.show(this, "Volume Headphone Optimize: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV105HistoryMultiSelectModeToggle() {
    val enabled = !BiliClient.prefs.v105historyMultiSelectMode
    BiliClient.prefs.v105historyMultiSelectMode = enabled
    AppToast.show(this, "History Multi Select Mode: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV105PlaybackABLoopBeatSyncToggle() {
    val enabled = !BiliClient.prefs.v105playbackABLoopBeatSync
    BiliClient.prefs.v105playbackABLoopBeatSync = enabled
    AppToast.show(this, "Playback AB Loop Beat Sync: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV105ScreenshotAutoWatermarkToggle() {
    val enabled = !BiliClient.prefs.v105screenshotAutoWatermark
    BiliClient.prefs.v105screenshotAutoWatermark = enabled
    AppToast.show(this, "Screenshot Auto Watermark: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV105VideoRotateCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105videoRotateCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105videoRotateCustom = value
        AppToast.show(this, "Video Rotate Custom: $value")
    }
}

internal fun PlayerActivity.showV105DanmakuFontGradientEndDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105danmakuFontGradientEnd).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Gradient End",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105danmakuFontGradientEnd = value
        AppToast.show(this, "Danmaku Font Gradient End: $value")
    }
}

internal fun PlayerActivity.showV105SubtitleFontStrokeWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v105subtitleFontStrokeWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stroke Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105subtitleFontStrokeWidth = value
        AppToast.show(this, "Subtitle Font Stroke Width: $value")
    }
}

internal fun PlayerActivity.showV106AudioCompressorThresholdDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v106audioCompressorThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106audioCompressorThreshold = value
        AppToast.show(this, "Audio Compressor Threshold: $value")
    }
}

internal fun PlayerActivity.showV106DanmakuFontGradientAngleDialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v106danmakuFontGradientAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Gradient Angle",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106danmakuFontGradientAngle = value
        AppToast.show(this, "Danmaku Font Gradient Angle: $value")
    }
}

internal fun PlayerActivity.showV106SubtitleFontStrokeColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106subtitleFontStrokeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stroke Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106subtitleFontStrokeColor = value
        AppToast.show(this, "Subtitle Font Stroke Color: $value")
    }
}

internal fun PlayerActivity.showV106GestureQuickVolumeGestureToggle() {
    val enabled = !BiliClient.prefs.v106gestureQuickVolumeGesture
    BiliClient.prefs.v106gestureQuickVolumeGesture = enabled
    AppToast.show(this, "Gesture Quick Volume Gesture: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV106CastVideoFrameRateLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106castVideoFrameRateLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Frame Rate Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106castVideoFrameRateLimit = value
        AppToast.show(this, "Cast Video Frame Rate Limit: $value")
    }
}

internal fun PlayerActivity.showV106PlaylistAutoSortByDateNewToggle() {
    val enabled = !BiliClient.prefs.v106playlistAutoSortByDateNew
    BiliClient.prefs.v106playlistAutoSortByDateNew = enabled
    AppToast.show(this, "Playlist Auto Sort By Date New: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV106CachePartialDownloadToggleToggle() {
    val enabled = !BiliClient.prefs.v106cachePartialDownloadToggle
    BiliClient.prefs.v106cachePartialDownloadToggle = enabled
    AppToast.show(this, "Cache Partial Download Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV106ProgressBarCustomHeightDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v106progressBarCustomHeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Height",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106progressBarCustomHeight = value
        AppToast.show(this, "Progress Bar Custom Height: $value")
    }
}

internal fun PlayerActivity.showV106VolumeBluetoothCodecDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106volumeBluetoothCodec).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Bluetooth Codec",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106volumeBluetoothCodec = value
        AppToast.show(this, "Volume Bluetooth Codec: $value")
    }
}

internal fun PlayerActivity.showV106HistoryFilterByTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106historyFilterByType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Filter By Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106historyFilterByType = value
        AppToast.show(this, "History Filter By Type: $value")
    }
}

internal fun PlayerActivity.showV106PlaybackABLoopCrossfadeToggle() {
    val enabled = !BiliClient.prefs.v106playbackABLoopCrossfade
    BiliClient.prefs.v106playbackABLoopCrossfade = enabled
    AppToast.show(this, "Playback AB Loop Crossfade: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV106ScreenshotAutoCompressToggle() {
    val enabled = !BiliClient.prefs.v106screenshotAutoCompress
    BiliClient.prefs.v106screenshotAutoCompress = enabled
    AppToast.show(this, "Screenshot Auto Compress: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV106VideoStretchCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106videoStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106videoStretchCustom = value
        AppToast.show(this, "Video Stretch Custom: $value")
    }
}

internal fun PlayerActivity.showV106DanmakuFontTextureCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106danmakuFontTextureCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Texture Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106danmakuFontTextureCustom = value
        AppToast.show(this, "Danmaku Font Texture Custom: $value")
    }
}

internal fun PlayerActivity.showV106SubtitleFontShadowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106subtitleFontShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106subtitleFontShadowColor = value
        AppToast.show(this, "Subtitle Font Shadow Color: $value")
    }
}

internal fun PlayerActivity.showV107AudioCompressorRatioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107audioCompressorRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107audioCompressorRatio = value
        AppToast.show(this, "Audio Compressor Ratio: $value")
    }
}

internal fun PlayerActivity.showV107DanmakuFontFadeEdgeSizeDialog() {
    val options = listOf(5, 10, 15, 20, 25)
    val currentIndex = options.indexOf(BiliClient.prefs.v107danmakuFontFadeEdgeSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Fade Edge Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107danmakuFontFadeEdgeSize = value
        AppToast.show(this, "Danmaku Font Fade Edge Size: $value")
    }
}

internal fun PlayerActivity.showV107SubtitleFontShadowRadiusDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v107subtitleFontShadowRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107subtitleFontShadowRadius = value
        AppToast.show(this, "Subtitle Font Shadow Radius: $value")
    }
}

internal fun PlayerActivity.showV107GestureQuickBrightGestureToggle() {
    val enabled = !BiliClient.prefs.v107gestureQuickBrightGesture
    BiliClient.prefs.v107gestureQuickBrightGesture = enabled
    AppToast.show(this, "Gesture Quick Bright Gesture: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV107CastVideoDeinterlaceModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107castVideoDeinterlaceMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Deinterlace Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107castVideoDeinterlaceMode = value
        AppToast.show(this, "Cast Video Deinterlace Mode: $value")
    }
}

internal fun PlayerActivity.showV107PlaylistAutoSortByDurationToggle() {
    val enabled = !BiliClient.prefs.v107playlistAutoSortByDuration
    BiliClient.prefs.v107playlistAutoSortByDuration = enabled
    AppToast.show(this, "Playlist Auto Sort By Duration: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV107CacheP2PDownloadToggleToggle() {
    val enabled = !BiliClient.prefs.v107cacheP2PDownloadToggle
    BiliClient.prefs.v107cacheP2PDownloadToggle = enabled
    AppToast.show(this, "Cache P2P Download Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV107ProgressBarCustomMarginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107progressBarCustomMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107progressBarCustomMargin = value
        AppToast.show(this, "Progress Bar Custom Margin: $value")
    }
}

internal fun PlayerActivity.showV107VolumeUSBDACompatibilityToggle() {
    val enabled = !BiliClient.prefs.v107volumeUSBDACompatibility
    BiliClient.prefs.v107volumeUSBDACompatibility = enabled
    AppToast.show(this, "Volume USB DAC Compatibility: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV107HistoryFilterByDurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107historyFilterByDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Filter By Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107historyFilterByDuration = value
        AppToast.show(this, "History Filter By Duration: $value")
    }
}

internal fun PlayerActivity.showV107PlaybackABLoopPitchShiftToggle() {
    val enabled = !BiliClient.prefs.v107playbackABLoopPitchShift
    BiliClient.prefs.v107playbackABLoopPitchShift = enabled
    AppToast.show(this, "Playback AB Loop Pitch Shift: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV107ScreenshotAutoShareAfterToggle() {
    val enabled = !BiliClient.prefs.v107screenshotAutoShareAfter
    BiliClient.prefs.v107screenshotAutoShareAfter = enabled
    AppToast.show(this, "Screenshot Auto Share After: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV107VideoCropCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107videoCropCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107videoCropCustom = value
        AppToast.show(this, "Video Crop Custom: $value")
    }
}

internal fun PlayerActivity.showV107DanmakuFontFadeStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107danmakuFontFadeStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Fade Style",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107danmakuFontFadeStyle = value
        AppToast.show(this, "Danmaku Font Fade Style: $value")
    }
}

internal fun PlayerActivity.showV107SubtitleFontShadowOffsetXDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v107subtitleFontShadowOffsetX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Offset X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107subtitleFontShadowOffsetX = value
        AppToast.show(this, "Subtitle Font Shadow Offset X: $value")
    }
}

internal fun PlayerActivity.showV108AudioCompressorAttackTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v108audioCompressorAttackTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Attack Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108audioCompressorAttackTime = value
        AppToast.show(this, "Audio Compressor Attack Time: $value")
    }
}

internal fun PlayerActivity.showV108DanmakuFontBgGradientToggleToggle() {
    val enabled = !BiliClient.prefs.v108danmakuFontBgGradientToggle
    BiliClient.prefs.v108danmakuFontBgGradientToggle = enabled
    AppToast.show(this, "Danmaku Font BG Gradient Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV108SubtitleFontShadowOffsetYDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v108subtitleFontShadowOffsetY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Offset Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108subtitleFontShadowOffsetY = value
        AppToast.show(this, "Subtitle Font Shadow Offset Y: $value")
    }
}

internal fun PlayerActivity.showV108GestureQuickLockScreenToggle() {
    val enabled = !BiliClient.prefs.v108gestureQuickLockScreen
    BiliClient.prefs.v108gestureQuickLockScreen = enabled
    AppToast.show(this, "Gesture Quick Lock Screen: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV108CastVideoScalingModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v108castVideoScalingMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Scaling Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108castVideoScalingMode = value
        AppToast.show(this, "Cast Video Scaling Mode: $value")
    }
}

internal fun PlayerActivity.showV108PlaylistAutoSortByViewsToggle() {
    val enabled = !BiliClient.prefs.v108playlistAutoSortByViews
    BiliClient.prefs.v108playlistAutoSortByViews = enabled
    AppToast.show(this, "Playlist Auto Sort By Views: ${if (enabled) "ON" else "OFF"}")
}

