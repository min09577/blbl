package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

// v49.14: Danmaku Bg Gradient Angle
internal fun PlayerActivity.showV49DanmakuBgGradientAngleDialog() {
    val options = listOf(0,30,60,90,120,150,180,210,240,270,300,330,360)
    val labels = listOf("0", "30", "60", "90", "120", "150", "180", "210", "240", "270", "300", "330", "360")
    val currentIndex = options.indexOf(BiliClient.prefs.v49DanmakuBgGradientAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Gradient Angle", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49DanmakuBgGradientAngle = value; AppToast.show(this, "Danmaku Bg Gradient Angle: ${labels[options.indexOf(value)]}") }
}

// v49.15: Cast Auto Reconnect
internal fun PlayerActivity.showV49CastAutoReconnectToggle() {
    val current = BiliClient.prefs.v49CastAutoReconnect
    BiliClient.prefs.v49CastAutoReconnect = !current
    AppToast.show(this, "Cast Auto Reconnect: ${if (!current) "ON" else "OFF"}")
}

// v50.1: Playback Auto Next Episode
internal fun PlayerActivity.showV50PlaybackAutoNextEpisodeToggle() {
    val current = BiliClient.prefs.v50PlaybackAutoNextEpisode
    BiliClient.prefs.v50PlaybackAutoNextEpisode = !current
    AppToast.show(this, "Playback Auto Next Episode: ${if (!current) "ON" else "OFF"}")
}

// v50.2: Danmaku Font Shadow Size
internal fun PlayerActivity.showV50DanmakuFontShadowSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuFontShadowSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Shadow Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuFontShadowSize = value; AppToast.show(this, "Danmaku Font Shadow Size: ${labels[options.indexOf(value)]}") }
}

// v50.3: Color Midtone Adjust
internal fun PlayerActivity.showV50ColorMidtoneAdjustDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v50ColorMidtoneAdjust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Midtone Adjust", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50ColorMidtoneAdjust = value; AppToast.show(this, "Color Midtone Adjust: ${labels[options.indexOf(value)]}") }
}

// v50.4: Volume Ambient Mode
internal fun PlayerActivity.showV50VolumeAmbientModeDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0", "1", "2", "3")
    val currentIndex = options.indexOf(BiliClient.prefs.v50VolumeAmbientMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Ambient Mode", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50VolumeAmbientMode = value; AppToast.show(this, "Volume Ambient Mode: ${labels[options.indexOf(value)]}") }
}

// v50.5: Danmaku Send Color Custom
internal fun PlayerActivity.showV50DanmakuSendColorCustomDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuSendColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Color Custom", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuSendColorCustom = value; AppToast.show(this, "Danmaku Send Color Custom: ${labels[options.indexOf(value)]}") }
}

// v50.6: Cast Volume Sync
internal fun PlayerActivity.showV50CastVolumeSyncToggle() {
    val current = BiliClient.prefs.v50CastVolumeSync
    BiliClient.prefs.v50CastVolumeSync = !current
    AppToast.show(this, "Cast Volume Sync: ${if (!current) "ON" else "OFF"}")
}

// v50.7: Gesture Pinch Zoom
internal fun PlayerActivity.showV50GesturePinchZoomToggle() {
    val current = BiliClient.prefs.v50GesturePinchZoom
    BiliClient.prefs.v50GesturePinchZoom = !current
    AppToast.show(this, "Gesture Pinch Zoom: ${if (!current) "ON" else "OFF"}")
}

// v50.8: Danmaku Filter Color
internal fun PlayerActivity.showV50DanmakuFilterColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuFilterColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Filter Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuFilterColor = value; AppToast.show(this, "Danmaku Filter Color: ${labels[options.indexOf(value)]}") }
}

// v50.9: Cache Prebuffer Seconds
internal fun PlayerActivity.showV50CachePrebufferSecondsDialog() {
    val options = listOf(0,3,6,9,12,15,18,21,24,27,30)
    val labels = listOf("0", "3", "6", "9", "12", "15", "18", "21", "24", "27", "30")
    val currentIndex = options.indexOf(BiliClient.prefs.v50CachePrebufferSeconds).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Prebuffer Seconds", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50CachePrebufferSeconds = value; AppToast.show(this, "Cache Prebuffer Seconds: ${labels[options.indexOf(value)]}") }
}

// v50.10: Progress Bar Double Tap Seek
internal fun PlayerActivity.showV50ProgressBarDoubleTapSeekDialog() {
    val options = listOf(5,10,15,20,25,30,35,40,45,50,55,60)
    val labels = listOf("5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60")
    val currentIndex = options.indexOf(BiliClient.prefs.v50ProgressBarDoubleTapSeek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Double Tap Seek", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50ProgressBarDoubleTapSeek = value; AppToast.show(this, "Progress Bar Double Tap Seek: ${labels[options.indexOf(value)]}") }
}

// v50.11: Danmaku Font Size Auto
internal fun PlayerActivity.showV50DanmakuFontSizeAutoToggle() {
    val current = BiliClient.prefs.v50DanmakuFontSizeAuto
    BiliClient.prefs.v50DanmakuFontSizeAuto = !current
    AppToast.show(this, "Danmaku Font Size Auto: ${if (!current) "ON" else "OFF"}")
}

// v50.12: Color Dynamic Range
internal fun PlayerActivity.showV50ColorDynamicRangeDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v50ColorDynamicRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Dynamic Range", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50ColorDynamicRange = value; AppToast.show(this, "Color Dynamic Range: ${labels[options.indexOf(value)]}") }
}

// v50.13: Volume Night Mode
internal fun PlayerActivity.showV50VolumeNightModeToggle() {
    val current = BiliClient.prefs.v50VolumeNightMode
    BiliClient.prefs.v50VolumeNightMode = !current
    AppToast.show(this, "Volume Night Mode: ${if (!current) "ON" else "OFF"}")
}

// v50.14: Danmaku Bg Blur Radius
internal fun PlayerActivity.showV50DanmakuBgBlurRadiusDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuBgBlurRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Blur Radius", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuBgBlurRadius = value; AppToast.show(this, "Danmaku Bg Blur Radius: ${labels[options.indexOf(value)]}") }
}

// v50.15: Cast Auto Discover
internal fun PlayerActivity.showV50CastAutoDiscoverToggle() {
    val current = BiliClient.prefs.v50CastAutoDiscover
    BiliClient.prefs.v50CastAutoDiscover = !current
    AppToast.show(this, "Cast Auto Discover: ${if (!current) "ON" else "OFF"}")
}

// v51.1: 自动跳片头

// ==================== v51-v60 New Unique Features ====================

// v51.1: Playback Auto Next Episode
internal fun PlayerActivity.showV51PlaybackAutoNextEpisodeToggle() {
    val enabled = !BiliClient.prefs.v51PlaybackAutoNextEpisode
    BiliClient.prefs.v51PlaybackAutoNextEpisode = enabled
    AppToast.show(this, "Playback Auto Next Episode: ${if (enabled) "ON" else "OFF"}")
}

// v51.2: Danmaku Font Shadow Size
internal fun PlayerActivity.showV51DanmakuFontShadowSizeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v51DanmakuFontShadowSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Shadow Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51DanmakuFontShadowSize = value
        AppToast.show(this, "Danmaku Font Shadow Size: $value")
    }
}

// v51.3: Color Midtone Adjust
internal fun PlayerActivity.showV51ColorMidtoneAdjustDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v51ColorMidtoneAdjust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Color Midtone Adjust",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51ColorMidtoneAdjust = value
        AppToast.show(this, "Color Midtone Adjust: $value")
    }
}

// v51.4: Gesture Custom Action 3
internal fun PlayerActivity.showV51GestureCustomAction3Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v51GestureCustomAction3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Action 3",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51GestureCustomAction3 = value
        AppToast.show(this, "Gesture Custom Action 3: $value")
    }
}

// v51.5: Subtitle Font Italic
internal fun PlayerActivity.showV51SubtitleFontItalicToggle() {
    val enabled = !BiliClient.prefs.v51SubtitleFontItalic
    BiliClient.prefs.v51SubtitleFontItalic = enabled
    AppToast.show(this, "Subtitle Font Italic: ${if (enabled) "ON" else "OFF"}")
}

// v51.6: Video Adaptive Contrast Enhanced
internal fun PlayerActivity.showV51VideoAdaptiveContrastEnhancedToggle() {
    val enabled = !BiliClient.prefs.v51VideoAdaptiveContrastEnhanced
    BiliClient.prefs.v51VideoAdaptiveContrastEnhanced = enabled
    AppToast.show(this, "Video Adaptive Contrast Enhanced: ${if (enabled) "ON" else "OFF"}")
}

// v51.7: Danmaku Filter Muted Users
internal fun PlayerActivity.showV51DanmakuFilterMutedUsersToggle() {
    val enabled = !BiliClient.prefs.v51DanmakuFilterMutedUsers
    BiliClient.prefs.v51DanmakuFilterMutedUsers = enabled
    AppToast.show(this, "Danmaku Filter Muted Users: ${if (enabled) "ON" else "OFF"}")
}

// v51.8: Cast Video Upscale Mode
internal fun PlayerActivity.showV51CastVideoUpscaleModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v51CastVideoUpscaleMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Upscale Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51CastVideoUpscaleMode = value
        AppToast.show(this, "Cast Video Upscale Mode: $value")
    }
}

// v51.9: Playlist Auto Continue
internal fun PlayerActivity.showV51PlaylistAutoContinueToggle() {
    val enabled = !BiliClient.prefs.v51PlaylistAutoContinue
    BiliClient.prefs.v51PlaylistAutoContinue = enabled
    AppToast.show(this, "Playlist Auto Continue: ${if (enabled) "ON" else "OFF"}")
}

// v51.10: Video Luma Adaptive
internal fun PlayerActivity.showV51VideoLumaAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v51VideoLumaAdaptive
    BiliClient.prefs.v51VideoLumaAdaptive = enabled
    AppToast.show(this, "Video Luma Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v51.11: Danmaku Font Spacing Custom
internal fun PlayerActivity.showV51DanmakuFontSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v51DanmakuFontSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51DanmakuFontSpacingCustom = value
        AppToast.show(this, "Danmaku Font Spacing Custom: $value")
    }
}

// v51.12: Subtitle Font Color Custom
internal fun PlayerActivity.showV51SubtitleFontColorCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v51SubtitleFontColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51SubtitleFontColorCustom = value
        AppToast.show(this, "Subtitle Font Color Custom: $value")
    }
}

// v51.13: Gesture Long Press Action
internal fun PlayerActivity.showV51GestureLongPressActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v51GestureLongPressAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v51GestureLongPressAction = value
        AppToast.show(this, "Gesture Long Press Action: $value")
    }
}

// v51.14: Video Chroma Adaptive
internal fun PlayerActivity.showV51VideoChromaAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v51VideoChromaAdaptive
    BiliClient.prefs.v51VideoChromaAdaptive = enabled
    AppToast.show(this, "Video Chroma Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v51.15: Cast Audio Sync
internal fun PlayerActivity.showV51CastAudioSyncToggle() {
    val enabled = !BiliClient.prefs.v51CastAudioSync
    BiliClient.prefs.v51CastAudioSync = enabled
    AppToast.show(this, "Cast Audio Sync: ${if (enabled) "ON" else "OFF"}")
}

// v52.1: Video Temporal Noise Reduce
internal fun PlayerActivity.showV52VideoTemporalNoiseReduceToggle() {
    val enabled = !BiliClient.prefs.v52VideoTemporalNoiseReduce
    BiliClient.prefs.v52VideoTemporalNoiseReduce = enabled
    AppToast.show(this, "Video Temporal Noise Reduce: ${if (enabled) "ON" else "OFF"}")
}

// v52.2: Danmaku BG Color Custom
internal fun PlayerActivity.showV52DanmakuBgColorCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v52DanmakuBgColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52DanmakuBgColorCustom = value
        AppToast.show(this, "Danmaku BG Color Custom: $value")
    }
}

// v52.3: Subtitle Font Size Auto
internal fun PlayerActivity.showV52SubtitleFontSizeAutoToggle() {
    val enabled = !BiliClient.prefs.v52SubtitleFontSizeAuto
    BiliClient.prefs.v52SubtitleFontSizeAuto = enabled
    AppToast.show(this, "Subtitle Font Size Auto: ${if (enabled) "ON" else "OFF"}")
}

// v52.4: Gesture Swipe Feedback
internal fun PlayerActivity.showV52GestureSwipeFeedbackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v52GestureSwipeFeedback).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Feedback",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52GestureSwipeFeedback = value
        AppToast.show(this, "Gesture Swipe Feedback: $value")
    }
}

// v52.5: Video Color Highlight Recovery
internal fun PlayerActivity.showV52VideoColorHighlightRecoveryToggle() {
    val enabled = !BiliClient.prefs.v52VideoColorHighlightRecovery
    BiliClient.prefs.v52VideoColorHighlightRecovery = enabled
    AppToast.show(this, "Video Color Highlight Recovery: ${if (enabled) "ON" else "OFF"}")
}

// v52.6: Danmaku Send Preview
internal fun PlayerActivity.showV52DanmakuSendPreviewToggle() {
    val enabled = !BiliClient.prefs.v52DanmakuSendPreview
    BiliClient.prefs.v52DanmakuSendPreview = enabled
    AppToast.show(this, "Danmaku Send Preview: ${if (enabled) "ON" else "OFF"}")
}

// v52.7: Cast Video Auto Quality
internal fun PlayerActivity.showV52CastVideoAutoQualityToggle() {
    val enabled = !BiliClient.prefs.v52CastVideoAutoQuality
    BiliClient.prefs.v52CastVideoAutoQuality = enabled
    AppToast.show(this, "Cast Video Auto Quality: ${if (enabled) "ON" else "OFF"}")
}

// v52.8: Subtitle BG Padding Custom
internal fun PlayerActivity.showV52SubtitleBgPaddingCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v52SubtitleBgPaddingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Padding Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52SubtitleBgPaddingCustom = value
        AppToast.show(this, "Subtitle BG Padding Custom: $value")
    }
}

// v52.9: Video Frame Interpolation
internal fun PlayerActivity.showV52VideoFrameInterpolationToggle() {
    val enabled = !BiliClient.prefs.v52VideoFrameInterpolation
    BiliClient.prefs.v52VideoFrameInterpolation = enabled
    AppToast.show(this, "Video Frame Interpolation: ${if (enabled) "ON" else "OFF"}")
}

// v52.10: Danmaku Merge Algorithm
internal fun PlayerActivity.showV52DanmakuMergeAlgorithmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v52DanmakuMergeAlgorithm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Algorithm",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52DanmakuMergeAlgorithm = value
        AppToast.show(this, "Danmaku Merge Algorithm: $value")
    }
}

// v52.11: Playlist Shuffle Weighted
internal fun PlayerActivity.showV52PlaylistShuffleWeightedToggle() {
    val enabled = !BiliClient.prefs.v52PlaylistShuffleWeighted
    BiliClient.prefs.v52PlaylistShuffleWeighted = enabled
    AppToast.show(this, "Playlist Shuffle Weighted: ${if (enabled) "ON" else "OFF"}")
}

// v52.12: Gesture Pinch Action
internal fun PlayerActivity.showV52GesturePinchActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v52GesturePinchAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52GesturePinchAction = value
        AppToast.show(this, "Gesture Pinch Action: $value")
    }
}

// v52.13: Video Color Temperature
internal fun PlayerActivity.showV52VideoColorTemperatureDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v52VideoColorTemperature).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Temperature",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52VideoColorTemperature = value
        AppToast.show(this, "Video Color Temperature: $value")
    }
}

// v52.14: Danmaku Font Weight Adaptive
internal fun PlayerActivity.showV52DanmakuFontWeightAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v52DanmakuFontWeightAdaptive
    BiliClient.prefs.v52DanmakuFontWeightAdaptive = enabled
    AppToast.show(this, "Danmaku Font Weight Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v52.15: Cast Screen Mirror Mode
internal fun PlayerActivity.showV52CastScreenMirrorModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v52CastScreenMirrorMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Screen Mirror Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v52CastScreenMirrorMode = value
        AppToast.show(this, "Cast Screen Mirror Mode: $value")
    }
}

// v53.1: Video Spatial Noise Reduce
internal fun PlayerActivity.showV53VideoSpatialNoiseReduceToggle() {
    val enabled = !BiliClient.prefs.v53VideoSpatialNoiseReduce
    BiliClient.prefs.v53VideoSpatialNoiseReduce = enabled
    AppToast.show(this, "Video Spatial Noise Reduce: ${if (enabled) "ON" else "OFF"}")
}

// v53.2: Danmaku Opacity Adaptive
internal fun PlayerActivity.showV53DanmakuOpacityAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v53DanmakuOpacityAdaptive
    BiliClient.prefs.v53DanmakuOpacityAdaptive = enabled
    AppToast.show(this, "Danmaku Opacity Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v53.3: Subtitle Sync Auto Detect
internal fun PlayerActivity.showV53SubtitleSyncAutoDetectToggle() {
    val enabled = !BiliClient.prefs.v53SubtitleSyncAutoDetect
    BiliClient.prefs.v53SubtitleSyncAutoDetect = enabled
    AppToast.show(this, "Subtitle Sync Auto Detect: ${if (enabled) "ON" else "OFF"}")
}

// v53.4: Gesture Triple Tap Action
internal fun PlayerActivity.showV53GestureTripleTapActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v53GestureTripleTapAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Triple Tap Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53GestureTripleTapAction = value
        AppToast.show(this, "Gesture Triple Tap Action: $value")
    }
}

// v53.5: Video Color Highlight Compress
internal fun PlayerActivity.showV53VideoColorHighlightCompressToggle() {
    val enabled = !BiliClient.prefs.v53VideoColorHighlightCompress
    BiliClient.prefs.v53VideoColorHighlightCompress = enabled
    AppToast.show(this, "Video Color Highlight Compress: ${if (enabled) "ON" else "OFF"}")
}

// v53.6: Danmaku Send Timer
internal fun PlayerActivity.showV53DanmakuSendTimerToggle() {
    val enabled = !BiliClient.prefs.v53DanmakuSendTimer
    BiliClient.prefs.v53DanmakuSendTimer = enabled
    AppToast.show(this, "Danmaku Send Timer: ${if (enabled) "ON" else "OFF"}")
}

// v53.7: Cast Video Latency Mode
internal fun PlayerActivity.showV53CastVideoLatencyModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v53CastVideoLatencyMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Latency Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53CastVideoLatencyMode = value
        AppToast.show(this, "Cast Video Latency Mode: $value")
    }
}

// v53.8: Subtitle BG Radius Custom
internal fun PlayerActivity.showV53SubtitleBgRadiusCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v53SubtitleBgRadiusCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Radius Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53SubtitleBgRadiusCustom = value
        AppToast.show(this, "Subtitle BG Radius Custom: $value")
    }
}

// v53.9: Video Detail Enhance
internal fun PlayerActivity.showV53VideoDetailEnhanceToggle() {
    val enabled = !BiliClient.prefs.v53VideoDetailEnhance
    BiliClient.prefs.v53VideoDetailEnhance = enabled
    AppToast.show(this, "Video Detail Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v53.10: Danmaku Font Size Curve
internal fun PlayerActivity.showV53DanmakuFontSizeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v53DanmakuFontSizeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53DanmakuFontSizeCurve = value
        AppToast.show(this, "Danmaku Font Size Curve: $value")
    }
}

// v53.11: Playlist Auto Download Quality
internal fun PlayerActivity.showV53PlaylistAutoDownloadQualityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v53PlaylistAutoDownloadQuality).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Download Quality",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53PlaylistAutoDownloadQuality = value
        AppToast.show(this, "Playlist Auto Download Quality: $value")
    }
}

// v53.12: Gesture Swipe Threshold
internal fun PlayerActivity.showV53GestureSwipeThresholdDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v53GestureSwipeThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53GestureSwipeThreshold = value
        AppToast.show(this, "Gesture Swipe Threshold: $value")
    }
}

// v53.13: Video Color Shadow Compress
internal fun PlayerActivity.showV53VideoColorShadowCompressToggle() {
    val enabled = !BiliClient.prefs.v53VideoColorShadowCompress
    BiliClient.prefs.v53VideoColorShadowCompress = enabled
    AppToast.show(this, "Video Color Shadow Compress: ${if (enabled) "ON" else "OFF"}")
}

// v53.14: Danmaku Stroke Color Custom
internal fun PlayerActivity.showV53DanmakuStrokeColorCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v53DanmakuStrokeColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Stroke Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53DanmakuStrokeColorCustom = value
        AppToast.show(this, "Danmaku Stroke Color Custom: $value")
    }
}

// v53.15: Cast Audio Fade Mode
internal fun PlayerActivity.showV53CastAudioFadeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v53CastAudioFadeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Fade Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v53CastAudioFadeMode = value
        AppToast.show(this, "Cast Audio Fade Mode: $value")
    }
}

// v54.1: Video Color Grading Custom
internal fun PlayerActivity.showV54VideoColorGradingCustomToggle() {
    val enabled = !BiliClient.prefs.v54VideoColorGradingCustom
    BiliClient.prefs.v54VideoColorGradingCustom = enabled
    AppToast.show(this, "Video Color Grading Custom: ${if (enabled) "ON" else "OFF"}")
}

// v54.2: Danmaku Border Weight
internal fun PlayerActivity.showV54DanmakuBorderWeightDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v54DanmakuBorderWeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Border Weight",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54DanmakuBorderWeight = value
        AppToast.show(this, "Danmaku Border Weight: $value")
    }
}

// v54.3: Subtitle Font Weight
internal fun PlayerActivity.showV54SubtitleFontWeightDialog() {
    val options = listOf(300, 400, 500, 700, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v54SubtitleFontWeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Weight",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54SubtitleFontWeight = value
        AppToast.show(this, "Subtitle Font Weight: $value")
    }
}

// v54.4: Gesture Edge Swipe Speed
internal fun PlayerActivity.showV54GestureEdgeSwipeSpeedDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v54GestureEdgeSwipeSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54GestureEdgeSwipeSpeed = value
        AppToast.show(this, "Gesture Edge Swipe Speed: $value")
    }
}

// v54.5: Video Adaptive Saturation
internal fun PlayerActivity.showV54VideoAdaptiveSaturationToggle() {
    val enabled = !BiliClient.prefs.v54VideoAdaptiveSaturation
    BiliClient.prefs.v54VideoAdaptiveSaturation = enabled
    AppToast.show(this, "Video Adaptive Saturation: ${if (enabled) "ON" else "OFF"}")
}

// v54.6: Danmaku Send Max Length Custom
internal fun PlayerActivity.showV54DanmakuSendMaxLengthCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v54DanmakuSendMaxLengthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54DanmakuSendMaxLengthCustom = value
        AppToast.show(this, "Danmaku Send Max Length Custom: $value")
    }
}

// v54.7: Cast Video Frame Rate Sync
internal fun PlayerActivity.showV54CastVideoFrameRateSyncToggle() {
    val enabled = !BiliClient.prefs.v54CastVideoFrameRateSync
    BiliClient.prefs.v54CastVideoFrameRateSync = enabled
    AppToast.show(this, "Cast Video Frame Rate Sync: ${if (enabled) "ON" else "OFF"}")
}

// v54.8: Subtitle Outline Color Custom
internal fun PlayerActivity.showV54SubtitleOutlineColorCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v54SubtitleOutlineColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54SubtitleOutlineColorCustom = value
        AppToast.show(this, "Subtitle Outline Color Custom: $value")
    }
}

// v54.9: Video Luma Curve Custom
internal fun PlayerActivity.showV54VideoLumaCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v54VideoLumaCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Luma Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54VideoLumaCurveCustom = value
        AppToast.show(this, "Video Luma Curve Custom: $value")
    }
}

// v54.10: Danmaku History Filter
internal fun PlayerActivity.showV54DanmakuHistoryFilterToggle() {
    val enabled = !BiliClient.prefs.v54DanmakuHistoryFilter
    BiliClient.prefs.v54DanmakuHistoryFilter = enabled
    AppToast.show(this, "Danmaku History Filter: ${if (enabled) "ON" else "OFF"}")
}

// v54.11: Playlist Auto Skip Watched
internal fun PlayerActivity.showV54PlaylistAutoSkipWatchedToggle() {
    val enabled = !BiliClient.prefs.v54PlaylistAutoSkipWatched
    BiliClient.prefs.v54PlaylistAutoSkipWatched = enabled
    AppToast.show(this, "Playlist Auto Skip Watched: ${if (enabled) "ON" else "OFF"}")
}

// v54.12: Gesture Double Tap Action
internal fun PlayerActivity.showV54GestureDoubleTapActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v54GestureDoubleTapAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54GestureDoubleTapAction = value
        AppToast.show(this, "Gesture Double Tap Action: $value")
    }
}

// v54.13: Video Chroma Curve Custom
internal fun PlayerActivity.showV54VideoChromaCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v54VideoChromaCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Chroma Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54VideoChromaCurveCustom = value
        AppToast.show(this, "Video Chroma Curve Custom: $value")
    }
}

// v54.14: Danmaku BG Opacity Custom
internal fun PlayerActivity.showV54DanmakuBgOpacityCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v54DanmakuBgOpacityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Opacity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54DanmakuBgOpacityCustom = value
        AppToast.show(this, "Danmaku BG Opacity Custom: $value")
    }
}

// v54.15: Cast Audio Codec Custom
internal fun PlayerActivity.showV54CastAudioCodecCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v54CastAudioCodecCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Codec Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v54CastAudioCodecCustom = value
        AppToast.show(this, "Cast Audio Codec Custom: $value")
    }
}

// v55.1: Video Color Fade
internal fun PlayerActivity.showV55VideoColorFadeDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v55VideoColorFade).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Fade",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55VideoColorFade = value
        AppToast.show(this, "Video Color Fade: $value")
    }
}

// v55.2: Danmaku Text Glow Custom
internal fun PlayerActivity.showV55DanmakuTextGlowCustomToggle() {
    val enabled = !BiliClient.prefs.v55DanmakuTextGlowCustom
    BiliClient.prefs.v55DanmakuTextGlowCustom = enabled
    AppToast.show(this, "Danmaku Text Glow Custom: ${if (enabled) "ON" else "OFF"}")
}

// v55.3: Subtitle Animation Speed
internal fun PlayerActivity.showV55SubtitleAnimationSpeedDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v55SubtitleAnimationSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55SubtitleAnimationSpeed = value
        AppToast.show(this, "Subtitle Animation Speed: $value")
    }
}

// v55.4: Gesture Pinch Zoom Mode
internal fun PlayerActivity.showV55GesturePinchZoomModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v55GesturePinchZoomMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Zoom Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55GesturePinchZoomMode = value
        AppToast.show(this, "Gesture Pinch Zoom Mode: $value")
    }
}

// v55.5: Video Adaptive Gamma
internal fun PlayerActivity.showV55VideoAdaptiveGammaToggle() {
    val enabled = !BiliClient.prefs.v55VideoAdaptiveGamma
    BiliClient.prefs.v55VideoAdaptiveGamma = enabled
    AppToast.show(this, "Video Adaptive Gamma: ${if (enabled) "ON" else "OFF"}")
}

// v55.6: Danmaku Send Rate Custom
internal fun PlayerActivity.showV55DanmakuSendRateCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v55DanmakuSendRateCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Rate Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55DanmakuSendRateCustom = value
        AppToast.show(this, "Danmaku Send Rate Custom: $value")
    }
}

// v55.7: Cast Video Bitrate Adaptive
internal fun PlayerActivity.showV55CastVideoBitrateAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v55CastVideoBitrateAdaptive
    BiliClient.prefs.v55CastVideoBitrateAdaptive = enabled
    AppToast.show(this, "Cast Video Bitrate Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v55.8: Subtitle BG Opacity Custom
internal fun PlayerActivity.showV55SubtitleBgOpacityCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v55SubtitleBgOpacityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Opacity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55SubtitleBgOpacityCustom = value
        AppToast.show(this, "Subtitle BG Opacity Custom: $value")
    }
}

// v55.9: Video Frame Blend
internal fun PlayerActivity.showV55VideoFrameBlendToggle() {
    val enabled = !BiliClient.prefs.v55VideoFrameBlend
    BiliClient.prefs.v55VideoFrameBlend = enabled
    AppToast.show(this, "Video Frame Blend: ${if (enabled) "ON" else "OFF"}")
}

// v55.10: Danmaku Lane Count
internal fun PlayerActivity.showV55DanmakuLaneCountDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v55DanmakuLaneCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Lane Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55DanmakuLaneCount = value
        AppToast.show(this, "Danmaku Lane Count: $value")
    }
}

// v55.11: Playlist Auto Sync
internal fun PlayerActivity.showV55PlaylistAutoSyncToggle() {
    val enabled = !BiliClient.prefs.v55PlaylistAutoSync
    BiliClient.prefs.v55PlaylistAutoSync = enabled
    AppToast.show(this, "Playlist Auto Sync: ${if (enabled) "ON" else "OFF"}")
}

// v55.12: Gesture Rotate Action
internal fun PlayerActivity.showV55GestureRotateActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v55GestureRotateAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Rotate Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v55GestureRotateAction = value
        AppToast.show(this, "Gesture Rotate Action: $value")
    }
}

// v55.13: Video Color Tint Enhanced
internal fun PlayerActivity.showV55VideoColorTintEnhancedToggle() {
    val enabled = !BiliClient.prefs.v55VideoColorTintEnhanced
    BiliClient.prefs.v55VideoColorTintEnhanced = enabled
    AppToast.show(this, "Video Color Tint Enhanced: ${if (enabled) "ON" else "OFF"}")
}

// v55.14: Danmaku Font Custom Path
internal fun PlayerActivity.showV55DanmakuFontCustomPathToggle() {
    val enabled = !BiliClient.prefs.v55DanmakuFontCustomPath
    BiliClient.prefs.v55DanmakuFontCustomPath = enabled
    AppToast.show(this, "Danmaku Font Custom Path: ${if (enabled) "ON" else "OFF"}")
}

// v55.15: Cast Audio Latency Auto
internal fun PlayerActivity.showV55CastAudioLatencyAutoToggle() {
    val enabled = !BiliClient.prefs.v55CastAudioLatencyAuto
    BiliClient.prefs.v55CastAudioLatencyAuto = enabled
    AppToast.show(this, "Cast Audio Latency Auto: ${if (enabled) "ON" else "OFF"}")
}

// v56.1: Video Adaptive Detail
internal fun PlayerActivity.showV56VideoAdaptiveDetailToggle() {
    val enabled = !BiliClient.prefs.v56VideoAdaptiveDetail
    BiliClient.prefs.v56VideoAdaptiveDetail = enabled
    AppToast.show(this, "Video Adaptive Detail: ${if (enabled) "ON" else "OFF"}")
}

// v56.2: Danmaku Stroke Blur
internal fun PlayerActivity.showV56DanmakuStrokeBlurDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v56DanmakuStrokeBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Stroke Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56DanmakuStrokeBlur = value
        AppToast.show(this, "Danmaku Stroke Blur: $value")
    }
}

// v56.3: Subtitle Word Spacing
internal fun PlayerActivity.showV56SubtitleWordSpacingDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v56SubtitleWordSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Word Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56SubtitleWordSpacing = value
        AppToast.show(this, "Subtitle Word Spacing: $value")
    }
}

// v56.4: Gesture Multi Finger Action
internal fun PlayerActivity.showV56GestureMultiFingerActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v56GestureMultiFingerAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Multi Finger Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56GestureMultiFingerAction = value
        AppToast.show(this, "Gesture Multi Finger Action: $value")
    }
}

// v56.5: Video Color Black Level Custom
internal fun PlayerActivity.showV56VideoColorBlackLevelCustomDialog() {
    val options = listOf(-10, -5, 0, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v56VideoColorBlackLevelCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Black Level Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56VideoColorBlackLevelCustom = value
        AppToast.show(this, "Video Color Black Level Custom: $value")
    }
}

// v56.6: Danmaku Send Font Custom
internal fun PlayerActivity.showV56DanmakuSendFontCustomToggle() {
    val enabled = !BiliClient.prefs.v56DanmakuSendFontCustom
    BiliClient.prefs.v56DanmakuSendFontCustom = enabled
    AppToast.show(this, "Danmaku Send Font Custom: ${if (enabled) "ON" else "OFF"}")
}

// v56.7: Cast Video Resolution Custom
internal fun PlayerActivity.showV56CastVideoResolutionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v56CastVideoResolutionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Resolution Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56CastVideoResolutionCustom = value
        AppToast.show(this, "Cast Video Resolution Custom: $value")
    }
}

// v56.8: Subtitle Font Stretch Custom
internal fun PlayerActivity.showV56SubtitleFontStretchCustomDialog() {
    val options = listOf(80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v56SubtitleFontStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56SubtitleFontStretchCustom = value
        AppToast.show(this, "Subtitle Font Stretch Custom: $value")
    }
}

// v56.9: Video Color White Level Custom
internal fun PlayerActivity.showV56VideoColorWhiteLevelCustomDialog() {
    val options = listOf(-10, -5, 0, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v56VideoColorWhiteLevelCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color White Level Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56VideoColorWhiteLevelCustom = value
        AppToast.show(this, "Video Color White Level Custom: $value")
    }
}

// v56.10: Danmaku Filter By Color
internal fun PlayerActivity.showV56DanmakuFilterByColorToggle() {
    val enabled = !BiliClient.prefs.v56DanmakuFilterByColor
    BiliClient.prefs.v56DanmakuFilterByColor = enabled
    AppToast.show(this, "Danmaku Filter By Color: ${if (enabled) "ON" else "OFF"}")
}

// v56.11: Playlist Auto Delete Expired
internal fun PlayerActivity.showV56PlaylistAutoDeleteExpiredToggle() {
    val enabled = !BiliClient.prefs.v56PlaylistAutoDeleteExpired
    BiliClient.prefs.v56PlaylistAutoDeleteExpired = enabled
    AppToast.show(this, "Playlist Auto Delete Expired: ${if (enabled) "ON" else "OFF"}")
}

// v56.12: Gesture Swipe Direction Lock
internal fun PlayerActivity.showV56GestureSwipeDirectionLockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v56GestureSwipeDirectionLock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Direction Lock",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56GestureSwipeDirectionLock = value
        AppToast.show(this, "Gesture Swipe Direction Lock: $value")
    }
}

// v56.13: Video Color Midtone Custom
internal fun PlayerActivity.showV56VideoColorMidtoneCustomDialog() {
    val options = listOf(-10, -5, 0, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v56VideoColorMidtoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Midtone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56VideoColorMidtoneCustom = value
        AppToast.show(this, "Video Color Midtone Custom: $value")
    }
}

// v56.14: Danmaku BG Padding Custom
internal fun PlayerActivity.showV56DanmakuBgPaddingCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v56DanmakuBgPaddingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Padding Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v56DanmakuBgPaddingCustom = value
        AppToast.show(this, "Danmaku BG Padding Custom: $value")
    }
}

// v56.15: Cast Audio Volume Sync
internal fun PlayerActivity.showV56CastAudioVolumeSyncToggle() {
    val enabled = !BiliClient.prefs.v56CastAudioVolumeSync
    BiliClient.prefs.v56CastAudioVolumeSync = enabled
    AppToast.show(this, "Cast Audio Volume Sync: ${if (enabled) "ON" else "OFF"}")
}

// v57.1: Video Temporal Enhance
internal fun PlayerActivity.showV57VideoTemporalEnhanceToggle() {
    val enabled = !BiliClient.prefs.v57VideoTemporalEnhance
    BiliClient.prefs.v57VideoTemporalEnhance = enabled
    AppToast.show(this, "Video Temporal Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v57.2: Danmaku Font Line Height Custom
internal fun PlayerActivity.showV57DanmakuFontLineHeightCustomDialog() {
    val options = listOf(100, 110, 120, 130, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v57DanmakuFontLineHeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Line Height Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57DanmakuFontLineHeightCustom = value
        AppToast.show(this, "Danmaku Font Line Height Custom: $value")
    }
}

// v57.3: Subtitle Outline Width Custom
internal fun PlayerActivity.showV57SubtitleOutlineWidthCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v57SubtitleOutlineWidthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Width Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57SubtitleOutlineWidthCustom = value
        AppToast.show(this, "Subtitle Outline Width Custom: $value")
    }
}

// v57.4: Gesture Long Press Feedback
internal fun PlayerActivity.showV57GestureLongPressFeedbackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v57GestureLongPressFeedback).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Feedback",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57GestureLongPressFeedback = value
        AppToast.show(this, "Gesture Long Press Feedback: $value")
    }
}

// v57.5: Video Color Highlight Custom
internal fun PlayerActivity.showV57VideoColorHighlightCustomDialog() {
    val options = listOf(-10, -5, 0, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v57VideoColorHighlightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Highlight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57VideoColorHighlightCustom = value
        AppToast.show(this, "Video Color Highlight Custom: $value")
    }
}

// v57.6: Danmaku Send Effect Custom
internal fun PlayerActivity.showV57DanmakuSendEffectCustomToggle() {
    val enabled = !BiliClient.prefs.v57DanmakuSendEffectCustom
    BiliClient.prefs.v57DanmakuSendEffectCustom = enabled
    AppToast.show(this, "Danmaku Send Effect Custom: ${if (enabled) "ON" else "OFF"}")
}

// v57.7: Cast Video Color Profile
internal fun PlayerActivity.showV57CastVideoColorProfileDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v57CastVideoColorProfile).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Color Profile",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57CastVideoColorProfile = value
        AppToast.show(this, "Cast Video Color Profile: $value")
    }
}

// v57.8: Subtitle BG Blur Mode
internal fun PlayerActivity.showV57SubtitleBgBlurModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v57SubtitleBgBlurMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Blur Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57SubtitleBgBlurMode = value
        AppToast.show(this, "Subtitle BG Blur Mode: $value")
    }
}

// v57.9: Video Color Shadow Custom
internal fun PlayerActivity.showV57VideoColorShadowCustomDialog() {
    val options = listOf(-10, -5, 0, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v57VideoColorShadowCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Shadow Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57VideoColorShadowCustom = value
        AppToast.show(this, "Video Color Shadow Custom: $value")
    }
}

// v57.10: Danmaku History Export Format
internal fun PlayerActivity.showV57DanmakuHistoryExportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v57DanmakuHistoryExportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku History Export Format",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57DanmakuHistoryExportFormat = value
        AppToast.show(this, "Danmaku History Export Format: $value")
    }
}

// v57.11: Playlist Auto Sort By Rating
internal fun PlayerActivity.showV57PlaylistAutoSortByRatingToggle() {
    val enabled = !BiliClient.prefs.v57PlaylistAutoSortByRating
    BiliClient.prefs.v57PlaylistAutoSortByRating = enabled
    AppToast.show(this, "Playlist Auto Sort By Rating: ${if (enabled) "ON" else "OFF"}")
}

// v57.12: Gesture Dead Zone Mode
internal fun PlayerActivity.showV57GestureDeadZoneModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v57GestureDeadZoneMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Dead Zone Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57GestureDeadZoneMode = value
        AppToast.show(this, "Gesture Dead Zone Mode: $value")
    }
}

// v57.13: Video Color Gamma Custom
internal fun PlayerActivity.showV57VideoColorGammaCustomDialog() {
    val options = listOf(-10, -5, 0, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v57VideoColorGammaCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Gamma Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57VideoColorGammaCustom = value
        AppToast.show(this, "Video Color Gamma Custom: $value")
    }
}

// v57.14: Danmaku Border Radius Custom
internal fun PlayerActivity.showV57DanmakuBorderRadiusCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v57DanmakuBorderRadiusCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Border Radius Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v57DanmakuBorderRadiusCustom = value
        AppToast.show(this, "Danmaku Border Radius Custom: $value")
    }
}

// v57.15: Cast Audio Normalization Auto
internal fun PlayerActivity.showV57CastAudioNormalizationAutoToggle() {
    val enabled = !BiliClient.prefs.v57CastAudioNormalizationAuto
    BiliClient.prefs.v57CastAudioNormalizationAuto = enabled
    AppToast.show(this, "Cast Audio Normalization Auto: ${if (enabled) "ON" else "OFF"}")
}

// v58.1: Video Spatial Enhance
internal fun PlayerActivity.showV58VideoSpatialEnhanceToggle() {
    val enabled = !BiliClient.prefs.v58VideoSpatialEnhance
    BiliClient.prefs.v58VideoSpatialEnhance = enabled
    AppToast.show(this, "Video Spatial Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v58.2: Danmaku Font Size Adaptive Custom
internal fun PlayerActivity.showV58DanmakuFontSizeAdaptiveCustomToggle() {
    val enabled = !BiliClient.prefs.v58DanmakuFontSizeAdaptiveCustom
    BiliClient.prefs.v58DanmakuFontSizeAdaptiveCustom = enabled
    AppToast.show(this, "Danmaku Font Size Adaptive Custom: ${if (enabled) "ON" else "OFF"}")
}

// v58.3: Subtitle Font Kerning Custom
internal fun PlayerActivity.showV58SubtitleFontKerningCustomToggle() {
    val enabled = !BiliClient.prefs.v58SubtitleFontKerningCustom
    BiliClient.prefs.v58SubtitleFontKerningCustom = enabled
    AppToast.show(this, "Subtitle Font Kerning Custom: ${if (enabled) "ON" else "OFF"}")
}

// v58.4: Gesture Custom Action 4
internal fun PlayerActivity.showV58GestureCustomAction4Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v58GestureCustomAction4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Action 4",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58GestureCustomAction4 = value
        AppToast.show(this, "Gesture Custom Action 4: $value")
    }
}

// v58.5: Video Color Saturation Custom
internal fun PlayerActivity.showV58VideoColorSaturationCustomDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v58VideoColorSaturationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Saturation Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58VideoColorSaturationCustom = value
        AppToast.show(this, "Video Color Saturation Custom: $value")
    }
}

// v58.6: Danmaku Send Color Preset
internal fun PlayerActivity.showV58DanmakuSendColorPresetDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v58DanmakuSendColorPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Color Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58DanmakuSendColorPreset = value
        AppToast.show(this, "Danmaku Send Color Preset: $value")
    }
}

// v58.7: Cast Video Upscale Mode Custom
internal fun PlayerActivity.showV58CastVideoUpscaleModeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v58CastVideoUpscaleModeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Upscale Mode Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58CastVideoUpscaleModeCustom = value
        AppToast.show(this, "Cast Video Upscale Mode Custom: $value")
    }
}

// v58.8: Subtitle Font Letter Spacing Custom
internal fun PlayerActivity.showV58SubtitleFontLetterSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v58SubtitleFontLetterSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Letter Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58SubtitleFontLetterSpacingCustom = value
        AppToast.show(this, "Subtitle Font Letter Spacing Custom: $value")
    }
}

// v58.9: Video Color Contrast Custom
internal fun PlayerActivity.showV58VideoColorContrastCustomDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v58VideoColorContrastCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Contrast Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58VideoColorContrastCustom = value
        AppToast.show(this, "Video Color Contrast Custom: $value")
    }
}

// v58.10: Danmaku Merge Window Auto
internal fun PlayerActivity.showV58DanmakuMergeWindowAutoToggle() {
    val enabled = !BiliClient.prefs.v58DanmakuMergeWindowAuto
    BiliClient.prefs.v58DanmakuMergeWindowAuto = enabled
    AppToast.show(this, "Danmaku Merge Window Auto: ${if (enabled) "ON" else "OFF"}")
}

// v58.11: Playlist Auto Mark Expired
internal fun PlayerActivity.showV58PlaylistAutoMarkExpiredToggle() {
    val enabled = !BiliClient.prefs.v58PlaylistAutoMarkExpired
    BiliClient.prefs.v58PlaylistAutoMarkExpired = enabled
    AppToast.show(this, "Playlist Auto Mark Expired: ${if (enabled) "ON" else "OFF"}")
}

// v58.12: Gesture Swipe Velocity Custom
internal fun PlayerActivity.showV58GestureSwipeVelocityCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v58GestureSwipeVelocityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Velocity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58GestureSwipeVelocityCustom = value
        AppToast.show(this, "Gesture Swipe Velocity Custom: $value")
    }
}

// v58.13: Video Color Brightness Custom
internal fun PlayerActivity.showV58VideoColorBrightnessCustomDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v58VideoColorBrightnessCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Brightness Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58VideoColorBrightnessCustom = value
        AppToast.show(this, "Video Color Brightness Custom: $value")
    }
}

// v58.14: Danmaku BG Radius Custom
internal fun PlayerActivity.showV58DanmakuBgRadiusCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v58DanmakuBgRadiusCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Radius Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58DanmakuBgRadiusCustom = value
        AppToast.show(this, "Danmaku BG Radius Custom: $value")
    }
}

// v58.15: Cast Audio Delay Custom (ms)
internal fun PlayerActivity.showV58CastAudioDelayCustomDialog() {
    val options = listOf(-200, -100, 0, 100, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v58CastAudioDelayCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay Custom (ms)",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v58CastAudioDelayCustom = value
        AppToast.show(this, "Cast Audio Delay Custom (ms): $value")
    }
}

// v59.1: Video Color Matrix Custom
internal fun PlayerActivity.showV59VideoColorMatrixCustomToggle() {
    val enabled = !BiliClient.prefs.v59VideoColorMatrixCustom
    BiliClient.prefs.v59VideoColorMatrixCustom = enabled
    AppToast.show(this, "Video Color Matrix Custom: ${if (enabled) "ON" else "OFF"}")
}

// v59.2: Danmaku Text Shadow Custom
internal fun PlayerActivity.showV59DanmakuTextShadowCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v59DanmakuTextShadowCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Text Shadow Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59DanmakuTextShadowCustom = value
        AppToast.show(this, "Danmaku Text Shadow Custom: $value")
    }
}

// v59.3: Subtitle Animation Delay
internal fun PlayerActivity.showV59SubtitleAnimationDelayDialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v59SubtitleAnimationDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59SubtitleAnimationDelay = value
        AppToast.show(this, "Subtitle Animation Delay: $value")
    }
}

// v59.4: Gesture Edge Swipe Custom
internal fun PlayerActivity.showV59GestureEdgeSwipeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v59GestureEdgeSwipeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59GestureEdgeSwipeCustom = value
        AppToast.show(this, "Gesture Edge Swipe Custom: $value")
    }
}

// v59.5: Video Color Denoise Strength
internal fun PlayerActivity.showV59VideoColorDenoiseStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v59VideoColorDenoiseStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Denoise Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59VideoColorDenoiseStrength = value
        AppToast.show(this, "Video Color Denoise Strength: $value")
    }
}

// v59.6: Danmaku Send Effect Preview
internal fun PlayerActivity.showV59DanmakuSendEffectPreviewToggle() {
    val enabled = !BiliClient.prefs.v59DanmakuSendEffectPreview
    BiliClient.prefs.v59DanmakuSendEffectPreview = enabled
    AppToast.show(this, "Danmaku Send Effect Preview: ${if (enabled) "ON" else "OFF"}")
}

// v59.7: Cast Video Color Space
internal fun PlayerActivity.showV59CastVideoColorSpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v59CastVideoColorSpace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Color Space",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59CastVideoColorSpace = value
        AppToast.show(this, "Cast Video Color Space: $value")
    }
}

// v59.8: Subtitle BG Gradient Custom
internal fun PlayerActivity.showV59SubtitleBgGradientCustomToggle() {
    val enabled = !BiliClient.prefs.v59SubtitleBgGradientCustom
    BiliClient.prefs.v59SubtitleBgGradientCustom = enabled
    AppToast.show(this, "Subtitle BG Gradient Custom: ${if (enabled) "ON" else "OFF"}")
}

// v59.9: Video Color Vibrance Custom
internal fun PlayerActivity.showV59VideoColorVibranceCustomDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v59VideoColorVibranceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Vibrance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59VideoColorVibranceCustom = value
        AppToast.show(this, "Video Color Vibrance Custom: $value")
    }
}

// v59.10: Danmaku History Search Custom
internal fun PlayerActivity.showV59DanmakuHistorySearchCustomToggle() {
    val enabled = !BiliClient.prefs.v59DanmakuHistorySearchCustom
    BiliClient.prefs.v59DanmakuHistorySearchCustom = enabled
    AppToast.show(this, "Danmaku History Search Custom: ${if (enabled) "ON" else "OFF"}")
}

// v59.11: Playlist Auto Backup
internal fun PlayerActivity.showV59PlaylistAutoBackupToggle() {
    val enabled = !BiliClient.prefs.v59PlaylistAutoBackup
    BiliClient.prefs.v59PlaylistAutoBackup = enabled
    AppToast.show(this, "Playlist Auto Backup: ${if (enabled) "ON" else "OFF"}")
}

// v59.12: Gesture Pinch Sensitivity Custom
internal fun PlayerActivity.showV59GesturePinchSensitivityCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v59GesturePinchSensitivityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Sensitivity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59GesturePinchSensitivityCustom = value
        AppToast.show(this, "Gesture Pinch Sensitivity Custom: $value")
    }
}

// v59.13: Video Color Temperature Custom
internal fun PlayerActivity.showV59VideoColorTemperatureCustomDialog() {
    val options = listOf(-20, -10, 0, 10, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v59VideoColorTemperatureCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Temperature Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59VideoColorTemperatureCustom = value
        AppToast.show(this, "Video Color Temperature Custom: $value")
    }
}

// v59.14: Danmaku Font Weight Custom
internal fun PlayerActivity.showV59DanmakuFontWeightCustomDialog() {
    val options = listOf(300, 400, 500, 700, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v59DanmakuFontWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Weight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v59DanmakuFontWeightCustom = value
        AppToast.show(this, "Danmaku Font Weight Custom: $value")
    }
}

// v59.15: Cast Audio Channel Sync
internal fun PlayerActivity.showV59CastAudioChannelSyncToggle() {
    val enabled = !BiliClient.prefs.v59CastAudioChannelSync
    BiliClient.prefs.v59CastAudioChannelSync = enabled
    AppToast.show(this, "Cast Audio Channel Sync: ${if (enabled) "ON" else "OFF"}")
}

// v60.1: Video Adaptive Color Enhance
internal fun PlayerActivity.showV60VideoAdaptiveColorEnhanceToggle() {
    val enabled = !BiliClient.prefs.v60VideoAdaptiveColorEnhance
    BiliClient.prefs.v60VideoAdaptiveColorEnhance = enabled
    AppToast.show(this, "Video Adaptive Color Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v60.2: Danmaku Border Weight Custom
internal fun PlayerActivity.showV60DanmakuBorderWeightCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuBorderWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Border Weight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60DanmakuBorderWeightCustom = value
        AppToast.show(this, "Danmaku Border Weight Custom: $value")
    }
}

// v60.3: Subtitle Font Shadow Custom
internal fun PlayerActivity.showV60SubtitleFontShadowCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v60SubtitleFontShadowCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60SubtitleFontShadowCustom = value
        AppToast.show(this, "Subtitle Font Shadow Custom: $value")
    }
}

// v60.4: Gesture Multi Touch Custom
internal fun PlayerActivity.showV60GestureMultiTouchCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v60GestureMultiTouchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Multi Touch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60GestureMultiTouchCustom = value
        AppToast.show(this, "Gesture Multi Touch Custom: $value")
    }
}

// v60.5: Video Color Tint Preset
internal fun PlayerActivity.showV60VideoColorTintPresetDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v60VideoColorTintPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Tint Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60VideoColorTintPreset = value
        AppToast.show(this, "Video Color Tint Preset: $value")
    }
}

// v60.6: Danmaku Send Max Length Enhanced
internal fun PlayerActivity.showV60DanmakuSendMaxLengthEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuSendMaxLengthEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Enhanced",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60DanmakuSendMaxLengthEnhanced = value
        AppToast.show(this, "Danmaku Send Max Length Enhanced: $value")
    }
}

// v60.7: Cast Video Auto Resolution
internal fun PlayerActivity.showV60CastVideoAutoResolutionToggle() {
    val enabled = !BiliClient.prefs.v60CastVideoAutoResolution
    BiliClient.prefs.v60CastVideoAutoResolution = enabled
    AppToast.show(this, "Cast Video Auto Resolution: ${if (enabled) "ON" else "OFF"}")
}

// v60.8: Subtitle BG Color Preset
internal fun PlayerActivity.showV60SubtitleBgColorPresetDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v60SubtitleBgColorPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Color Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60SubtitleBgColorPreset = value
        AppToast.show(this, "Subtitle BG Color Preset: $value")
    }
}

// v60.9: Video Color LUT Custom
internal fun PlayerActivity.showV60VideoColorLUTCustomToggle() {
    val enabled = !BiliClient.prefs.v60VideoColorLUTCustom
    BiliClient.prefs.v60VideoColorLUTCustom = enabled
    AppToast.show(this, "Video Color LUT Custom: ${if (enabled) "ON" else "OFF"}")
}

// v60.10: Danmaku Font Size Preset
internal fun PlayerActivity.showV60DanmakuFontSizePresetDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuFontSizePreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60DanmakuFontSizePreset = value
        AppToast.show(this, "Danmaku Font Size Preset: $value")
    }
}

// v60.11: Playlist Auto Restore
internal fun PlayerActivity.showV60PlaylistAutoRestoreToggle() {
    val enabled = !BiliClient.prefs.v60PlaylistAutoRestore
    BiliClient.prefs.v60PlaylistAutoRestore = enabled
    AppToast.show(this, "Playlist Auto Restore: ${if (enabled) "ON" else "OFF"}")
}

// v60.12: Gesture Custom Sensitivity Enhanced
internal fun PlayerActivity.showV60GestureCustomSensitivityEnhancedDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v60GestureCustomSensitivityEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Sensitivity Enhanced",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60GestureCustomSensitivityEnhanced = value
        AppToast.show(this, "Gesture Custom Sensitivity Enhanced: $value")
    }
}

// v60.13: Video Color Grading Preset
internal fun PlayerActivity.showV60VideoColorGradingPresetDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v60VideoColorGradingPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Grading Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60VideoColorGradingPreset = value
        AppToast.show(this, "Video Color Grading Preset: $value")
    }
}

// v60.14: Danmaku BG Color Preset
internal fun PlayerActivity.showV60DanmakuBgColorPresetDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v60DanmakuBgColorPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Color Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60DanmakuBgColorPreset = value
        AppToast.show(this, "Danmaku BG Color Preset: $value")
    }
}

// v60.15: Cast Audio Fade Mode Custom
internal fun PlayerActivity.showV60CastAudioFadeModeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v60CastAudioFadeModeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Fade Mode Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v60CastAudioFadeModeCustom = value
        AppToast.show(this, "Cast Audio Fade Mode Custom: $value")
    }
}

// v61.1: Video Edge Enhance Strength
internal fun PlayerActivity.showV61VideoEdgeEnhanceStrengthToggle() {
    val enabled = !BiliClient.prefs.v61VideoEdgeEnhanceStrength
    BiliClient.prefs.v61VideoEdgeEnhanceStrength = enabled
    AppToast.show(this, "Video Edge Enhance Strength: ${if (enabled) "ON" else "OFF"}")
}

// v61.2: Danmaku Collision Detection
internal fun PlayerActivity.showV61DanmakuCollisionDetectionToggle() {
    val enabled = !BiliClient.prefs.v61DanmakuCollisionDetection
    BiliClient.prefs.v61DanmakuCollisionDetection = enabled
    AppToast.show(this, "Danmaku Collision Detection: ${if (enabled) "ON" else "OFF"}")
}

// v61.3: Subtitle Position Offset X
internal fun PlayerActivity.showV61SubtitlePositionOffsetXDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v61SubtitlePositionOffsetX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position Offset X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61SubtitlePositionOffsetX = value
        AppToast.show(this, "Subtitle Position Offset X: $value")
    }
}

// v61.4: Gesture Fling Velocity
internal fun PlayerActivity.showV61GestureFlingVelocityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v61GestureFlingVelocity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Fling Velocity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61GestureFlingVelocity = value
        AppToast.show(this, "Gesture Fling Velocity: $value")
    }
}

// v61.5: Video Motion Compensation
internal fun PlayerActivity.showV61VideoMotionCompensationToggle() {
    val enabled = !BiliClient.prefs.v61VideoMotionCompensation
    BiliClient.prefs.v61VideoMotionCompensation = enabled
    AppToast.show(this, "Video Motion Compensation: ${if (enabled) "ON" else "OFF"}")
}

// v61.6: Danmaku Animation Type
internal fun PlayerActivity.showV61DanmakuAnimationTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v61DanmakuAnimationType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Animation Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61DanmakuAnimationType = value
        AppToast.show(this, "Danmaku Animation Type: $value")
    }
}

// v61.7: Cast Video Buffer (ms)
internal fun PlayerActivity.showV61CastVideoBufferMsDialog() {
    val options = listOf(0, 500, 1000, 2000, 5000)
    val currentIndex = options.indexOf(BiliClient.prefs.v61CastVideoBufferMs).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Buffer (ms)",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61CastVideoBufferMs = value
        AppToast.show(this, "Cast Video Buffer (ms): $value")
    }
}

// v61.8: Subtitle Font Size Min
internal fun PlayerActivity.showV61SubtitleFontSizeMinDialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v61SubtitleFontSizeMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61SubtitleFontSizeMin = value
        AppToast.show(this, "Subtitle Font Size Min: $value")
    }
}

// v61.9: Video Adaptive Sharpness
internal fun PlayerActivity.showV61VideoAdaptiveSharpnessToggle() {
    val enabled = !BiliClient.prefs.v61VideoAdaptiveSharpness
    BiliClient.prefs.v61VideoAdaptiveSharpness = enabled
    AppToast.show(this, "Video Adaptive Sharpness: ${if (enabled) "ON" else "OFF"}")
}

// v61.10: Danmaku Filter By Length
internal fun PlayerActivity.showV61DanmakuFilterByLengthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v61DanmakuFilterByLength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By Length",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61DanmakuFilterByLength = value
        AppToast.show(this, "Danmaku Filter By Length: $value")
    }
}

// v61.11: Playlist Smart Filter
internal fun PlayerActivity.showV61PlaylistSmartFilterToggle() {
    val enabled = !BiliClient.prefs.v61PlaylistSmartFilter
    BiliClient.prefs.v61PlaylistSmartFilter = enabled
    AppToast.show(this, "Playlist Smart Filter: ${if (enabled) "ON" else "OFF"}")
}

// v61.12: Gesture Swipe Curve
internal fun PlayerActivity.showV61GestureSwipeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v61GestureSwipeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61GestureSwipeCurve = value
        AppToast.show(this, "Gesture Swipe Curve: $value")
    }
}

// v61.13: Video Color Balance RGB
internal fun PlayerActivity.showV61VideoColorBalanceRGBDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v61VideoColorBalanceRGB).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Balance RGB",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61VideoColorBalanceRGB = value
        AppToast.show(this, "Video Color Balance RGB: $value")
    }
}

// v61.14: Danmaku Font Size Auto Min
internal fun PlayerActivity.showV61DanmakuFontSizeAutoMinDialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v61DanmakuFontSizeAutoMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Auto Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61DanmakuFontSizeAutoMin = value
        AppToast.show(this, "Danmaku Font Size Auto Min: $value")
    }
}

// v61.15: Cast Audio Buffer (ms)
internal fun PlayerActivity.showV61CastAudioBufferMsDialog() {
    val options = listOf(0, 100, 200, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v61CastAudioBufferMs).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Buffer (ms)",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v61CastAudioBufferMs = value
        AppToast.show(this, "Cast Audio Buffer (ms): $value")
    }
}

// v62.1: Video Temporal Denoise
internal fun PlayerActivity.showV62VideoTemporalDenoiseToggle() {
    val enabled = !BiliClient.prefs.v62VideoTemporalDenoise
    BiliClient.prefs.v62VideoTemporalDenoise = enabled
    AppToast.show(this, "Video Temporal Denoise: ${if (enabled) "ON" else "OFF"}")
}

// v62.2: Danmaku Scroll Speed Custom
internal fun PlayerActivity.showV62DanmakuScrollSpeedCustomDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v62DanmakuScrollSpeedCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62DanmakuScrollSpeedCustom = value
        AppToast.show(this, "Danmaku Scroll Speed Custom: $value")
    }
}

// v62.3: Subtitle Position Offset Y
internal fun PlayerActivity.showV62SubtitlePositionOffsetYDialog() {
    val options = listOf(-100, -50, 0, 50, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v62SubtitlePositionOffsetY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position Offset Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62SubtitlePositionOffsetY = value
        AppToast.show(this, "Subtitle Position Offset Y: $value")
    }
}

// v62.4: Gesture Tap Feedback
internal fun PlayerActivity.showV62GestureTapFeedbackDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v62GestureTapFeedback).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Feedback",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62GestureTapFeedback = value
        AppToast.show(this, "Gesture Tap Feedback: $value")
    }
}

// v62.5: Video Adaptive Noise Gate
internal fun PlayerActivity.showV62VideoAdaptiveNoiseGateToggle() {
    val enabled = !BiliClient.prefs.v62VideoAdaptiveNoiseGate
    BiliClient.prefs.v62VideoAdaptiveNoiseGate = enabled
    AppToast.show(this, "Video Adaptive Noise Gate: ${if (enabled) "ON" else "OFF"}")
}

// v62.6: Danmaku Merge Distance Custom
internal fun PlayerActivity.showV62DanmakuMergeDistanceCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v62DanmakuMergeDistanceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Distance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62DanmakuMergeDistanceCustom = value
        AppToast.show(this, "Danmaku Merge Distance Custom: $value")
    }
}

// v62.7: Cast Video Decode Mode
internal fun PlayerActivity.showV62CastVideoDecodeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v62CastVideoDecodeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Decode Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62CastVideoDecodeMode = value
        AppToast.show(this, "Cast Video Decode Mode: $value")
    }
}

// v62.8: Subtitle Font Size Max
internal fun PlayerActivity.showV62SubtitleFontSizeMaxDialog() {
    val options = listOf(24, 32, 40, 48, 64)
    val currentIndex = options.indexOf(BiliClient.prefs.v62SubtitleFontSizeMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62SubtitleFontSizeMax = value
        AppToast.show(this, "Subtitle Font Size Max: $value")
    }
}

// v62.9: Video Adaptive Contrast Curve
internal fun PlayerActivity.showV62VideoAdaptiveContrastCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v62VideoAdaptiveContrastCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Contrast Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62VideoAdaptiveContrastCurve = value
        AppToast.show(this, "Video Adaptive Contrast Curve: $value")
    }
}

// v62.10: Danmaku Filter By Speed
internal fun PlayerActivity.showV62DanmakuFilterBySpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v62DanmakuFilterBySpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62DanmakuFilterBySpeed = value
        AppToast.show(this, "Danmaku Filter By Speed: $value")
    }
}

// v62.11: Playlist Auto Group
internal fun PlayerActivity.showV62PlaylistAutoGroupToggle() {
    val enabled = !BiliClient.prefs.v62PlaylistAutoGroup
    BiliClient.prefs.v62PlaylistAutoGroup = enabled
    AppToast.show(this, "Playlist Auto Group: ${if (enabled) "ON" else "OFF"}")
}

// v62.12: Gesture Swipe Acceleration
internal fun PlayerActivity.showV62GestureSwipeAccelerationDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v62GestureSwipeAcceleration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Acceleration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62GestureSwipeAcceleration = value
        AppToast.show(this, "Gesture Swipe Acceleration: $value")
    }
}

// v62.13: Video Color Hue Rotate
internal fun PlayerActivity.showV62VideoColorHueRotateDialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v62VideoColorHueRotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Hue Rotate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62VideoColorHueRotate = value
        AppToast.show(this, "Video Color Hue Rotate: $value")
    }
}

// v62.14: Danmaku Font Size Auto Max
internal fun PlayerActivity.showV62DanmakuFontSizeAutoMaxDialog() {
    val options = listOf(24, 28, 32, 36, 48)
    val currentIndex = options.indexOf(BiliClient.prefs.v62DanmakuFontSizeAutoMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Auto Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62DanmakuFontSizeAutoMax = value
        AppToast.show(this, "Danmaku Font Size Auto Max: $value")
    }
}

// v62.15: Cast Audio Decode Mode
internal fun PlayerActivity.showV62CastAudioDecodeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v62CastAudioDecodeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Decode Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v62CastAudioDecodeMode = value
        AppToast.show(this, "Cast Audio Decode Mode: $value")
    }
}

// v63.1: Video Spatial Denoise
internal fun PlayerActivity.showV63VideoSpatialDenoiseToggle() {
    val enabled = !BiliClient.prefs.v63VideoSpatialDenoise
    BiliClient.prefs.v63VideoSpatialDenoise = enabled
    AppToast.show(this, "Video Spatial Denoise: ${if (enabled) "ON" else "OFF"}")
}

// v63.2: Danmaku Top Bottom Margin
internal fun PlayerActivity.showV63DanmakuTopBottomMarginDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuTopBottomMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Bottom Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63DanmakuTopBottomMargin = value
        AppToast.show(this, "Danmaku Top Bottom Margin: $value")
    }
}

// v63.3: Subtitle Animation Fade In
internal fun PlayerActivity.showV63SubtitleAnimationFadeInToggle() {
    val enabled = !BiliClient.prefs.v63SubtitleAnimationFadeIn
    BiliClient.prefs.v63SubtitleAnimationFadeIn = enabled
    AppToast.show(this, "Subtitle Animation Fade In: ${if (enabled) "ON" else "OFF"}")
}

// v409: Detect Motion Enabled409
internal fun PlayerActivity.showV409DetectMotionEnabled409Toggle() {
    val current = BiliClient.prefs.v409detectMotionEnabled409
    BiliClient.prefs.v409detectMotionEnabled409 = !current
    AppToast.show(this, "Detect Motion Enabled409: ${if (!current) "ON" else "OFF"}")
}

// v409: Dim Screen On Idle409
internal fun PlayerActivity.showV409DimScreenOnIdle409Toggle() {
    val current = BiliClient.prefs.v409dimScreenOnIdle409
    BiliClient.prefs.v409dimScreenOnIdle409 = !current
    AppToast.show(this, "Dim Screen On Idle409: ${if (!current) "ON" else "OFF"}")
}

// v410: Cloud Auto Sync410
internal fun PlayerActivity.showV410CloudAutoSync410Toggle() {
    val current = BiliClient.prefs.v410cloudAutoSync410
    BiliClient.prefs.v410cloudAutoSync410 = !current
    AppToast.show(this, "Cloud Auto Sync410: ${if (!current) "ON" else "OFF"}")
}

// v410: Cloud Storage Limit410
internal fun PlayerActivity.showV410CloudStorageLimit410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410cloudStorageLimit410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410cloudStorageLimit410 = value
        AppToast.show(this, "Cloud Storage Limit410: $value")
    }
}

// v410: Collect Auto Categorize410
internal fun PlayerActivity.showV410CollectAutoCategorize410Toggle() {
    val current = BiliClient.prefs.v410collectAutoCategorize410
    BiliClient.prefs.v410collectAutoCategorize410 = !current
    AppToast.show(this, "Collect Auto Categorize410: ${if (!current) "ON" else "OFF"}")
}

// v410: Compact Mode Enabled410
internal fun PlayerActivity.showV410CompactModeEnabled410Toggle() {
    val current = BiliClient.prefs.v410compactModeEnabled410
    BiliClient.prefs.v410compactModeEnabled410 = !current
    AppToast.show(this, "Compact Mode Enabled410: ${if (!current) "ON" else "OFF"}")
}

// v410: Compress Auto Quality410
internal fun PlayerActivity.showV410CompressAutoQuality410Toggle() {
    val current = BiliClient.prefs.v410compressAutoQuality410
    BiliClient.prefs.v410compressAutoQuality410 = !current
    AppToast.show(this, "Compress Auto Quality410: ${if (!current) "ON" else "OFF"}")
}

// v410: Connect Auto Retry410
internal fun PlayerActivity.showV410ConnectAutoRetry410Toggle() {
    val current = BiliClient.prefs.v410connectAutoRetry410
    BiliClient.prefs.v410connectAutoRetry410 = !current
    AppToast.show(this, "Connect Auto Retry410: ${if (!current) "ON" else "OFF"}")
}

// v410: Dashboard Widget Layout410
internal fun PlayerActivity.showV410DashboardWidgetLayout410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410dashboardWidgetLayout410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410dashboardWidgetLayout410 = value
        AppToast.show(this, "Dashboard Widget Layout410: $value")
    }
}

// v410: Debug Log Verbose410
internal fun PlayerActivity.showV410DebugLogVerbose410Toggle() {
    val current = BiliClient.prefs.v410debugLogVerbose410
    BiliClient.prefs.v410debugLogVerbose410 = !current
    AppToast.show(this, "Debug Log Verbose410: ${if (!current) "ON" else "OFF"}")
}

// v410: Deep Color Enabled410
internal fun PlayerActivity.showV410DeepColorEnabled410Toggle() {
    val current = BiliClient.prefs.v410deepColorEnabled410
    BiliClient.prefs.v410deepColorEnabled410 = !current
    AppToast.show(this, "Deep Color Enabled410: ${if (!current) "ON" else "OFF"}")
}

// v410: Default Player Engine410
internal fun PlayerActivity.showV410DefaultPlayerEngine410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410defaultPlayerEngine410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410defaultPlayerEngine410 = value
        AppToast.show(this, "Default Player Engine410: $value")
    }
}

// v410: Delay Start Ms410
internal fun PlayerActivity.showV410DelayStartMs410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410delayStartMs410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410delayStartMs410 = value
        AppToast.show(this, "Delay Start Ms410: $value")
    }
}

// v410: Density Auto Adjust410
internal fun PlayerActivity.showV410DensityAutoAdjust410Toggle() {
    val current = BiliClient.prefs.v410densityAutoAdjust410
    BiliClient.prefs.v410densityAutoAdjust410 = !current
    AppToast.show(this, "Density Auto Adjust410: ${if (!current) "ON" else "OFF"}")
}

// v410: Deploy Auto Update410
internal fun PlayerActivity.showV410DeployAutoUpdate410Toggle() {
    val current = BiliClient.prefs.v410deployAutoUpdate410
    BiliClient.prefs.v410deployAutoUpdate410 = !current
    AppToast.show(this, "Deploy Auto Update410: ${if (!current) "ON" else "OFF"}")
}

// v410: Detect Motion Enabled410
internal fun PlayerActivity.showV410DetectMotionEnabled410Toggle() {
    val current = BiliClient.prefs.v410detectMotionEnabled410
    BiliClient.prefs.v410detectMotionEnabled410 = !current
    AppToast.show(this, "Detect Motion Enabled410: ${if (!current) "ON" else "OFF"}")
}

// v410: Dim Screen On Idle410
internal fun PlayerActivity.showV410DimScreenOnIdle410Toggle() {
    val current = BiliClient.prefs.v410dimScreenOnIdle410
    BiliClient.prefs.v410dimScreenOnIdle410 = !current
    AppToast.show(this, "Dim Screen On Idle410: ${if (!current) "ON" else "OFF"}")
}

// v411: Display Refresh Rate411
internal fun PlayerActivity.showV411DisplayRefreshRate411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v411displayRefreshRate411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v411displayRefreshRate411 = value
        AppToast.show(this, "Display Refresh Rate411: $value")
    }
}

// v411: Display Color Temp411
internal fun PlayerActivity.showV411DisplayColorTemp411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v411displayColorTemp411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v411displayColorTemp411 = value
        AppToast.show(this, "Display Color Temp411: $value")
    }
}

// v411: Divider Auto Insert411
internal fun PlayerActivity.showV411DividerAutoInsert411Toggle() {
    val current = BiliClient.prefs.v411dividerAutoInsert411
    BiliClient.prefs.v411dividerAutoInsert411 = !current
    AppToast.show(this, "Divider Auto Insert411: ${if (!current) "ON" else "OFF"}")
}

// v411: Domain Auto Block411
internal fun PlayerActivity.showV411DomainAutoBlock411Toggle() {
    val current = BiliClient.prefs.v411domainAutoBlock411
    BiliClient.prefs.v411domainAutoBlock411 = !current
    AppToast.show(this, "Domain Auto Block411: ${if (!current) "ON" else "OFF"}")
}

// v411: Drag Drop Enabled411
internal fun PlayerActivity.showV411DragDropEnabled411Toggle() {
    val current = BiliClient.prefs.v411dragDropEnabled411
    BiliClient.prefs.v411dragDropEnabled411 = !current
    AppToast.show(this, "Drag Drop Enabled411: ${if (!current) "ON" else "OFF"}")
}

// v411: Drawer Auto Collapse411
internal fun PlayerActivity.showV411DrawerAutoCollapse411Toggle() {
    val current = BiliClient.prefs.v411drawerAutoCollapse411
    BiliClient.prefs.v411drawerAutoCollapse411 = !current
    AppToast.show(this, "Drawer Auto Collapse411: ${if (!current) "ON" else "OFF"}")
}

// v411: DRM Auto Detect411
internal fun PlayerActivity.showV411DrmAutoDetect411Toggle() {
    val current = BiliClient.prefs.v411drmAutoDetect411
    BiliClient.prefs.v411drmAutoDetect411 = !current
    AppToast.show(this, "DRM Auto Detect411: ${if (!current) "ON" else "OFF"}")
}

// v411: Duplicate Auto Remove411
internal fun PlayerActivity.showV411DuplicateAutoRemove411Toggle() {
    val current = BiliClient.prefs.v411duplicateAutoRemove411
    BiliClient.prefs.v411duplicateAutoRemove411 = !current
    AppToast.show(this, "Duplicate Auto Remove411: ${if (!current) "ON" else "OFF"}")
}

// v411: Dynamic Island411
internal fun PlayerActivity.showV411DynamicIsland411Toggle() {
    val current = BiliClient.prefs.v411dynamicIsland411
    BiliClient.prefs.v411dynamicIsland411 = !current
    AppToast.show(this, "Dynamic Island411: ${if (!current) "ON" else "OFF"}")
}

// v411: Dynamic Theme Color411
internal fun PlayerActivity.showV411DynamicThemeColor411Toggle() {
    val current = BiliClient.prefs.v411dynamicThemeColor411
    BiliClient.prefs.v411dynamicThemeColor411 = !current
    AppToast.show(this, "Dynamic Theme Color411: ${if (!current) "ON" else "OFF"}")
}

// v411: Edge Touch Reject411
internal fun PlayerActivity.showV411EdgeTouchReject411Toggle() {
    val current = BiliClient.prefs.v411edgeTouchReject411
    BiliClient.prefs.v411edgeTouchReject411 = !current
    AppToast.show(this, "Edge Touch Reject411: ${if (!current) "ON" else "OFF"}")
}

// v411: Embed Subtitle Track411
internal fun PlayerActivity.showV411EmbedSubtitleTrack411Toggle() {
    val current = BiliClient.prefs.v411embedSubtitleTrack411
    BiliClient.prefs.v411embedSubtitleTrack411 = !current
    AppToast.show(this, "Embed Subtitle Track411: ${if (!current) "ON" else "OFF"}")
}

// v411: Encode Auto Select411
internal fun PlayerActivity.showV411EncodeAutoSelect411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v411encodeAutoSelect411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v411encodeAutoSelect411 = value
        AppToast.show(this, "Encode Auto Select411: $value")
    }
}

// v411: Endpoint Auto Switch411
internal fun PlayerActivity.showV411EndpointAutoSwitch411Toggle() {
    val current = BiliClient.prefs.v411endpointAutoSwitch411
    BiliClient.prefs.v411endpointAutoSwitch411 = !current
    AppToast.show(this, "Endpoint Auto Switch411: ${if (!current) "ON" else "OFF"}")
}

// v411: Engine Auto Optimize411
internal fun PlayerActivity.showV411EngineAutoOptimize411Toggle() {
    val current = BiliClient.prefs.v411engineAutoOptimize411
    BiliClient.prefs.v411engineAutoOptimize411 = !current
    AppToast.show(this, "Engine Auto Optimize411: ${if (!current) "ON" else "OFF"}")
}

// v412: Display Refresh Rate412
internal fun PlayerActivity.showV412DisplayRefreshRate412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v412displayRefreshRate412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v412displayRefreshRate412 = value
        AppToast.show(this, "Display Refresh Rate412: $value")
    }
}

// v412: Display Color Temp412
internal fun PlayerActivity.showV412DisplayColorTemp412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v412displayColorTemp412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v412displayColorTemp412 = value
        AppToast.show(this, "Display Color Temp412: $value")
    }
}

// v412: Divider Auto Insert412
internal fun PlayerActivity.showV412DividerAutoInsert412Toggle() {
    val current = BiliClient.prefs.v412dividerAutoInsert412
    BiliClient.prefs.v412dividerAutoInsert412 = !current
    AppToast.show(this, "Divider Auto Insert412: ${if (!current) "ON" else "OFF"}")
}

// v412: Domain Auto Block412
internal fun PlayerActivity.showV412DomainAutoBlock412Toggle() {
    val current = BiliClient.prefs.v412domainAutoBlock412
    BiliClient.prefs.v412domainAutoBlock412 = !current
    AppToast.show(this, "Domain Auto Block412: ${if (!current) "ON" else "OFF"}")
}

// v412: Drag Drop Enabled412
internal fun PlayerActivity.showV412DragDropEnabled412Toggle() {
    val current = BiliClient.prefs.v412dragDropEnabled412
    BiliClient.prefs.v412dragDropEnabled412 = !current
    AppToast.show(this, "Drag Drop Enabled412: ${if (!current) "ON" else "OFF"}")
}

// v412: Drawer Auto Collapse412
internal fun PlayerActivity.showV412DrawerAutoCollapse412Toggle() {
    val current = BiliClient.prefs.v412drawerAutoCollapse412
    BiliClient.prefs.v412drawerAutoCollapse412 = !current
    AppToast.show(this, "Drawer Auto Collapse412: ${if (!current) "ON" else "OFF"}")
}

// v412: DRM Auto Detect412
internal fun PlayerActivity.showV412DrmAutoDetect412Toggle() {
    val current = BiliClient.prefs.v412drmAutoDetect412
    BiliClient.prefs.v412drmAutoDetect412 = !current
    AppToast.show(this, "DRM Auto Detect412: ${if (!current) "ON" else "OFF"}")
}

// v412: Duplicate Auto Remove412
internal fun PlayerActivity.showV412DuplicateAutoRemove412Toggle() {
    val current = BiliClient.prefs.v412duplicateAutoRemove412
    BiliClient.prefs.v412duplicateAutoRemove412 = !current
    AppToast.show(this, "Duplicate Auto Remove412: ${if (!current) "ON" else "OFF"}")
}

// v412: Dynamic Island412
internal fun PlayerActivity.showV412DynamicIsland412Toggle() {
    val current = BiliClient.prefs.v412dynamicIsland412
    BiliClient.prefs.v412dynamicIsland412 = !current
    AppToast.show(this, "Dynamic Island412: ${if (!current) "ON" else "OFF"}")
}

// v412: Dynamic Theme Color412
internal fun PlayerActivity.showV412DynamicThemeColor412Toggle() {
    val current = BiliClient.prefs.v412dynamicThemeColor412
    BiliClient.prefs.v412dynamicThemeColor412 = !current
    AppToast.show(this, "Dynamic Theme Color412: ${if (!current) "ON" else "OFF"}")
}

// v412: Edge Touch Reject412
internal fun PlayerActivity.showV412EdgeTouchReject412Toggle() {
    val current = BiliClient.prefs.v412edgeTouchReject412
    BiliClient.prefs.v412edgeTouchReject412 = !current
    AppToast.show(this, "Edge Touch Reject412: ${if (!current) "ON" else "OFF"}")
}

// v412: Embed Subtitle Track412
internal fun PlayerActivity.showV412EmbedSubtitleTrack412Toggle() {
    val current = BiliClient.prefs.v412embedSubtitleTrack412
    BiliClient.prefs.v412embedSubtitleTrack412 = !current
    AppToast.show(this, "Embed Subtitle Track412: ${if (!current) "ON" else "OFF"}")
}

// v412: Encode Auto Select412
internal fun PlayerActivity.showV412EncodeAutoSelect412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v412encodeAutoSelect412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v412encodeAutoSelect412 = value
        AppToast.show(this, "Encode Auto Select412: $value")
    }
}

// v412: Endpoint Auto Switch412
internal fun PlayerActivity.showV412EndpointAutoSwitch412Toggle() {
    val current = BiliClient.prefs.v412endpointAutoSwitch412
    BiliClient.prefs.v412endpointAutoSwitch412 = !current
    AppToast.show(this, "Endpoint Auto Switch412: ${if (!current) "ON" else "OFF"}")
}

// v412: Engine Auto Optimize412
internal fun PlayerActivity.showV412EngineAutoOptimize412Toggle() {
    val current = BiliClient.prefs.v412engineAutoOptimize412
    BiliClient.prefs.v412engineAutoOptimize412 = !current
    AppToast.show(this, "Engine Auto Optimize412: ${if (!current) "ON" else "OFF"}")
}

// v413: Display Refresh Rate413
internal fun PlayerActivity.showV413DisplayRefreshRate413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v413displayRefreshRate413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v413displayRefreshRate413 = value
        AppToast.show(this, "Display Refresh Rate413: $value")
    }
}

// v413: Display Color Temp413
internal fun PlayerActivity.showV413DisplayColorTemp413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v413displayColorTemp413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v413displayColorTemp413 = value
        AppToast.show(this, "Display Color Temp413: $value")
    }
}

// v413: Divider Auto Insert413
internal fun PlayerActivity.showV413DividerAutoInsert413Toggle() {
    val current = BiliClient.prefs.v413dividerAutoInsert413
    BiliClient.prefs.v413dividerAutoInsert413 = !current
    AppToast.show(this, "Divider Auto Insert413: ${if (!current) "ON" else "OFF"}")
}

// v413: Domain Auto Block413
internal fun PlayerActivity.showV413DomainAutoBlock413Toggle() {
    val current = BiliClient.prefs.v413domainAutoBlock413
    BiliClient.prefs.v413domainAutoBlock413 = !current
    AppToast.show(this, "Domain Auto Block413: ${if (!current) "ON" else "OFF"}")
}

// v413: Drag Drop Enabled413
internal fun PlayerActivity.showV413DragDropEnabled413Toggle() {
    val current = BiliClient.prefs.v413dragDropEnabled413
    BiliClient.prefs.v413dragDropEnabled413 = !current
    AppToast.show(this, "Drag Drop Enabled413: ${if (!current) "ON" else "OFF"}")
}

// v413: Drawer Auto Collapse413
internal fun PlayerActivity.showV413DrawerAutoCollapse413Toggle() {
    val current = BiliClient.prefs.v413drawerAutoCollapse413
    BiliClient.prefs.v413drawerAutoCollapse413 = !current
    AppToast.show(this, "Drawer Auto Collapse413: ${if (!current) "ON" else "OFF"}")
}

// v413: DRM Auto Detect413
internal fun PlayerActivity.showV413DrmAutoDetect413Toggle() {
    val current = BiliClient.prefs.v413drmAutoDetect413
    BiliClient.prefs.v413drmAutoDetect413 = !current
    AppToast.show(this, "DRM Auto Detect413: ${if (!current) "ON" else "OFF"}")
}

// v413: Duplicate Auto Remove413
internal fun PlayerActivity.showV413DuplicateAutoRemove413Toggle() {
    val current = BiliClient.prefs.v413duplicateAutoRemove413
    BiliClient.prefs.v413duplicateAutoRemove413 = !current
    AppToast.show(this, "Duplicate Auto Remove413: ${if (!current) "ON" else "OFF"}")
}

// v413: Dynamic Island413
internal fun PlayerActivity.showV413DynamicIsland413Toggle() {
    val current = BiliClient.prefs.v413dynamicIsland413
    BiliClient.prefs.v413dynamicIsland413 = !current
    AppToast.show(this, "Dynamic Island413: ${if (!current) "ON" else "OFF"}")
}

// v413: Dynamic Theme Color413
internal fun PlayerActivity.showV413DynamicThemeColor413Toggle() {
    val current = BiliClient.prefs.v413dynamicThemeColor413
    BiliClient.prefs.v413dynamicThemeColor413 = !current
    AppToast.show(this, "Dynamic Theme Color413: ${if (!current) "ON" else "OFF"}")
}

// v413: Edge Touch Reject413
internal fun PlayerActivity.showV413EdgeTouchReject413Toggle() {
    val current = BiliClient.prefs.v413edgeTouchReject413
    BiliClient.prefs.v413edgeTouchReject413 = !current
    AppToast.show(this, "Edge Touch Reject413: ${if (!current) "ON" else "OFF"}")
}

// v413: Embed Subtitle Track413
internal fun PlayerActivity.showV413EmbedSubtitleTrack413Toggle() {
    val current = BiliClient.prefs.v413embedSubtitleTrack413
    BiliClient.prefs.v413embedSubtitleTrack413 = !current
    AppToast.show(this, "Embed Subtitle Track413: ${if (!current) "ON" else "OFF"}")
}

// v413: Encode Auto Select413
internal fun PlayerActivity.showV413EncodeAutoSelect413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v413encodeAutoSelect413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v413encodeAutoSelect413 = value
        AppToast.show(this, "Encode Auto Select413: $value")
    }
}

// v413: Endpoint Auto Switch413
internal fun PlayerActivity.showV413EndpointAutoSwitch413Toggle() {
    val current = BiliClient.prefs.v413endpointAutoSwitch413
    BiliClient.prefs.v413endpointAutoSwitch413 = !current
    AppToast.show(this, "Endpoint Auto Switch413: ${if (!current) "ON" else "OFF"}")
}

// v413: Engine Auto Optimize413
internal fun PlayerActivity.showV413EngineAutoOptimize413Toggle() {
    val current = BiliClient.prefs.v413engineAutoOptimize413
    BiliClient.prefs.v413engineAutoOptimize413 = !current
    AppToast.show(this, "Engine Auto Optimize413: ${if (!current) "ON" else "OFF"}")
}

// v414: Display Refresh Rate414
internal fun PlayerActivity.showV414DisplayRefreshRate414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v414displayRefreshRate414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v414displayRefreshRate414 = value
        AppToast.show(this, "Display Refresh Rate414: $value")
    }
}

// v414: Display Color Temp414
internal fun PlayerActivity.showV414DisplayColorTemp414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v414displayColorTemp414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v414displayColorTemp414 = value
        AppToast.show(this, "Display Color Temp414: $value")
    }
}

// v414: Divider Auto Insert414
internal fun PlayerActivity.showV414DividerAutoInsert414Toggle() {
    val current = BiliClient.prefs.v414dividerAutoInsert414
    BiliClient.prefs.v414dividerAutoInsert414 = !current
    AppToast.show(this, "Divider Auto Insert414: ${if (!current) "ON" else "OFF"}")
}

// v414: Domain Auto Block414
internal fun PlayerActivity.showV414DomainAutoBlock414Toggle() {
    val current = BiliClient.prefs.v414domainAutoBlock414
    BiliClient.prefs.v414domainAutoBlock414 = !current
    AppToast.show(this, "Domain Auto Block414: ${if (!current) "ON" else "OFF"}")
}

// v414: Drag Drop Enabled414
internal fun PlayerActivity.showV414DragDropEnabled414Toggle() {
    val current = BiliClient.prefs.v414dragDropEnabled414
    BiliClient.prefs.v414dragDropEnabled414 = !current
    AppToast.show(this, "Drag Drop Enabled414: ${if (!current) "ON" else "OFF"}")
}

// v414: Drawer Auto Collapse414
internal fun PlayerActivity.showV414DrawerAutoCollapse414Toggle() {
    val current = BiliClient.prefs.v414drawerAutoCollapse414
    BiliClient.prefs.v414drawerAutoCollapse414 = !current
    AppToast.show(this, "Drawer Auto Collapse414: ${if (!current) "ON" else "OFF"}")
}

// v414: DRM Auto Detect414
internal fun PlayerActivity.showV414DrmAutoDetect414Toggle() {
    val current = BiliClient.prefs.v414drmAutoDetect414
    BiliClient.prefs.v414drmAutoDetect414 = !current
    AppToast.show(this, "DRM Auto Detect414: ${if (!current) "ON" else "OFF"}")
}

// v414: Duplicate Auto Remove414
internal fun PlayerActivity.showV414DuplicateAutoRemove414Toggle() {
    val current = BiliClient.prefs.v414duplicateAutoRemove414
    BiliClient.prefs.v414duplicateAutoRemove414 = !current
    AppToast.show(this, "Duplicate Auto Remove414: ${if (!current) "ON" else "OFF"}")
}

// v414: Dynamic Island414
internal fun PlayerActivity.showV414DynamicIsland414Toggle() {
    val current = BiliClient.prefs.v414dynamicIsland414
    BiliClient.prefs.v414dynamicIsland414 = !current
    AppToast.show(this, "Dynamic Island414: ${if (!current) "ON" else "OFF"}")
}

// v414: Dynamic Theme Color414
internal fun PlayerActivity.showV414DynamicThemeColor414Toggle() {
    val current = BiliClient.prefs.v414dynamicThemeColor414
    BiliClient.prefs.v414dynamicThemeColor414 = !current
    AppToast.show(this, "Dynamic Theme Color414: ${if (!current) "ON" else "OFF"}")
}

// v414: Edge Touch Reject414
internal fun PlayerActivity.showV414EdgeTouchReject414Toggle() {
    val current = BiliClient.prefs.v414edgeTouchReject414
    BiliClient.prefs.v414edgeTouchReject414 = !current
    AppToast.show(this, "Edge Touch Reject414: ${if (!current) "ON" else "OFF"}")
}

// v414: Embed Subtitle Track414
internal fun PlayerActivity.showV414EmbedSubtitleTrack414Toggle() {
    val current = BiliClient.prefs.v414embedSubtitleTrack414
    BiliClient.prefs.v414embedSubtitleTrack414 = !current
    AppToast.show(this, "Embed Subtitle Track414: ${if (!current) "ON" else "OFF"}")
}

// v414: Encode Auto Select414
internal fun PlayerActivity.showV414EncodeAutoSelect414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v414encodeAutoSelect414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v414encodeAutoSelect414 = value
        AppToast.show(this, "Encode Auto Select414: $value")
    }
}

// v414: Endpoint Auto Switch414
internal fun PlayerActivity.showV414EndpointAutoSwitch414Toggle() {
    val current = BiliClient.prefs.v414endpointAutoSwitch414
    BiliClient.prefs.v414endpointAutoSwitch414 = !current
    AppToast.show(this, "Endpoint Auto Switch414: ${if (!current) "ON" else "OFF"}")
}

// v414: Engine Auto Optimize414
internal fun PlayerActivity.showV414EngineAutoOptimize414Toggle() {
    val current = BiliClient.prefs.v414engineAutoOptimize414
    BiliClient.prefs.v414engineAutoOptimize414 = !current
    AppToast.show(this, "Engine Auto Optimize414: ${if (!current) "ON" else "OFF"}")
}

// v415: Display Refresh Rate415
internal fun PlayerActivity.showV415DisplayRefreshRate415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v415displayRefreshRate415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v415displayRefreshRate415 = value
        AppToast.show(this, "Display Refresh Rate415: $value")
    }
}

// v415: Display Color Temp415
internal fun PlayerActivity.showV415DisplayColorTemp415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v415displayColorTemp415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v415displayColorTemp415 = value
        AppToast.show(this, "Display Color Temp415: $value")
    }
}

// v415: Divider Auto Insert415
internal fun PlayerActivity.showV415DividerAutoInsert415Toggle() {
    val current = BiliClient.prefs.v415dividerAutoInsert415
    BiliClient.prefs.v415dividerAutoInsert415 = !current
    AppToast.show(this, "Divider Auto Insert415: ${if (!current) "ON" else "OFF"}")
}

// v415: Domain Auto Block415
internal fun PlayerActivity.showV415DomainAutoBlock415Toggle() {
    val current = BiliClient.prefs.v415domainAutoBlock415
    BiliClient.prefs.v415domainAutoBlock415 = !current
    AppToast.show(this, "Domain Auto Block415: ${if (!current) "ON" else "OFF"}")
}

// v415: Drag Drop Enabled415
internal fun PlayerActivity.showV415DragDropEnabled415Toggle() {
    val current = BiliClient.prefs.v415dragDropEnabled415
    BiliClient.prefs.v415dragDropEnabled415 = !current
    AppToast.show(this, "Drag Drop Enabled415: ${if (!current) "ON" else "OFF"}")
}

// v415: Drawer Auto Collapse415
internal fun PlayerActivity.showV415DrawerAutoCollapse415Toggle() {
    val current = BiliClient.prefs.v415drawerAutoCollapse415
    BiliClient.prefs.v415drawerAutoCollapse415 = !current
    AppToast.show(this, "Drawer Auto Collapse415: ${if (!current) "ON" else "OFF"}")
}

// v415: DRM Auto Detect415
internal fun PlayerActivity.showV415DrmAutoDetect415Toggle() {
    val current = BiliClient.prefs.v415drmAutoDetect415
    BiliClient.prefs.v415drmAutoDetect415 = !current
    AppToast.show(this, "DRM Auto Detect415: ${if (!current) "ON" else "OFF"}")
}

// v415: Duplicate Auto Remove415
internal fun PlayerActivity.showV415DuplicateAutoRemove415Toggle() {
    val current = BiliClient.prefs.v415duplicateAutoRemove415
    BiliClient.prefs.v415duplicateAutoRemove415 = !current
    AppToast.show(this, "Duplicate Auto Remove415: ${if (!current) "ON" else "OFF"}")
}

// v415: Dynamic Island415
internal fun PlayerActivity.showV415DynamicIsland415Toggle() {
    val current = BiliClient.prefs.v415dynamicIsland415
    BiliClient.prefs.v415dynamicIsland415 = !current
    AppToast.show(this, "Dynamic Island415: ${if (!current) "ON" else "OFF"}")
}

// v415: Dynamic Theme Color415
internal fun PlayerActivity.showV415DynamicThemeColor415Toggle() {
    val current = BiliClient.prefs.v415dynamicThemeColor415
    BiliClient.prefs.v415dynamicThemeColor415 = !current
    AppToast.show(this, "Dynamic Theme Color415: ${if (!current) "ON" else "OFF"}")
}

// v415: Edge Touch Reject415
internal fun PlayerActivity.showV415EdgeTouchReject415Toggle() {
    val current = BiliClient.prefs.v415edgeTouchReject415
    BiliClient.prefs.v415edgeTouchReject415 = !current
    AppToast.show(this, "Edge Touch Reject415: ${if (!current) "ON" else "OFF"}")
}

// v415: Embed Subtitle Track415
internal fun PlayerActivity.showV415EmbedSubtitleTrack415Toggle() {
    val current = BiliClient.prefs.v415embedSubtitleTrack415
    BiliClient.prefs.v415embedSubtitleTrack415 = !current
    AppToast.show(this, "Embed Subtitle Track415: ${if (!current) "ON" else "OFF"}")
}

// v415: Encode Auto Select415
internal fun PlayerActivity.showV415EncodeAutoSelect415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v415encodeAutoSelect415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v415encodeAutoSelect415 = value
        AppToast.show(this, "Encode Auto Select415: $value")
    }
}

// v415: Endpoint Auto Switch415
internal fun PlayerActivity.showV415EndpointAutoSwitch415Toggle() {
    val current = BiliClient.prefs.v415endpointAutoSwitch415
    BiliClient.prefs.v415endpointAutoSwitch415 = !current
    AppToast.show(this, "Endpoint Auto Switch415: ${if (!current) "ON" else "OFF"}")
}

// v415: Engine Auto Optimize415
internal fun PlayerActivity.showV415EngineAutoOptimize415Toggle() {
    val current = BiliClient.prefs.v415engineAutoOptimize415
    BiliClient.prefs.v415engineAutoOptimize415 = !current
    AppToast.show(this, "Engine Auto Optimize415: ${if (!current) "ON" else "OFF"}")
}

// v416: Display Refresh Rate416
internal fun PlayerActivity.showV416DisplayRefreshRate416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v416displayRefreshRate416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v416displayRefreshRate416 = value
        AppToast.show(this, "Display Refresh Rate416: $value")
    }
}

// v416: Display Color Temp416
internal fun PlayerActivity.showV416DisplayColorTemp416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v416displayColorTemp416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v416displayColorTemp416 = value
        AppToast.show(this, "Display Color Temp416: $value")
    }
}

// v416: Divider Auto Insert416
internal fun PlayerActivity.showV416DividerAutoInsert416Toggle() {
    val current = BiliClient.prefs.v416dividerAutoInsert416
    BiliClient.prefs.v416dividerAutoInsert416 = !current
    AppToast.show(this, "Divider Auto Insert416: ${if (!current) "ON" else "OFF"}")
}

// v416: Domain Auto Block416
internal fun PlayerActivity.showV416DomainAutoBlock416Toggle() {
    val current = BiliClient.prefs.v416domainAutoBlock416
    BiliClient.prefs.v416domainAutoBlock416 = !current
    AppToast.show(this, "Domain Auto Block416: ${if (!current) "ON" else "OFF"}")
}

// v416: Drag Drop Enabled416
internal fun PlayerActivity.showV416DragDropEnabled416Toggle() {
    val current = BiliClient.prefs.v416dragDropEnabled416
    BiliClient.prefs.v416dragDropEnabled416 = !current
    AppToast.show(this, "Drag Drop Enabled416: ${if (!current) "ON" else "OFF"}")
}

// v416: Drawer Auto Collapse416
internal fun PlayerActivity.showV416DrawerAutoCollapse416Toggle() {
    val current = BiliClient.prefs.v416drawerAutoCollapse416
    BiliClient.prefs.v416drawerAutoCollapse416 = !current
    AppToast.show(this, "Drawer Auto Collapse416: ${if (!current) "ON" else "OFF"}")
}

// v416: DRM Auto Detect416
internal fun PlayerActivity.showV416DrmAutoDetect416Toggle() {
    val current = BiliClient.prefs.v416drmAutoDetect416
    BiliClient.prefs.v416drmAutoDetect416 = !current
    AppToast.show(this, "DRM Auto Detect416: ${if (!current) "ON" else "OFF"}")
}

// v416: Duplicate Auto Remove416
internal fun PlayerActivity.showV416DuplicateAutoRemove416Toggle() {
    val current = BiliClient.prefs.v416duplicateAutoRemove416
    BiliClient.prefs.v416duplicateAutoRemove416 = !current
    AppToast.show(this, "Duplicate Auto Remove416: ${if (!current) "ON" else "OFF"}")
}

// v416: Dynamic Island416
internal fun PlayerActivity.showV416DynamicIsland416Toggle() {
    val current = BiliClient.prefs.v416dynamicIsland416
    BiliClient.prefs.v416dynamicIsland416 = !current
    AppToast.show(this, "Dynamic Island416: ${if (!current) "ON" else "OFF"}")
}

// v416: Dynamic Theme Color416
internal fun PlayerActivity.showV416DynamicThemeColor416Toggle() {
    val current = BiliClient.prefs.v416dynamicThemeColor416
    BiliClient.prefs.v416dynamicThemeColor416 = !current
    AppToast.show(this, "Dynamic Theme Color416: ${if (!current) "ON" else "OFF"}")
}

// v416: Edge Touch Reject416
internal fun PlayerActivity.showV416EdgeTouchReject416Toggle() {
    val current = BiliClient.prefs.v416edgeTouchReject416
    BiliClient.prefs.v416edgeTouchReject416 = !current
    AppToast.show(this, "Edge Touch Reject416: ${if (!current) "ON" else "OFF"}")
}

// v416: Embed Subtitle Track416
internal fun PlayerActivity.showV416EmbedSubtitleTrack416Toggle() {
    val current = BiliClient.prefs.v416embedSubtitleTrack416
    BiliClient.prefs.v416embedSubtitleTrack416 = !current
    AppToast.show(this, "Embed Subtitle Track416: ${if (!current) "ON" else "OFF"}")
}

// v416: Encode Auto Select416
internal fun PlayerActivity.showV416EncodeAutoSelect416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v416encodeAutoSelect416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v416encodeAutoSelect416 = value
        AppToast.show(this, "Encode Auto Select416: $value")
    }
}

// v416: Endpoint Auto Switch416
internal fun PlayerActivity.showV416EndpointAutoSwitch416Toggle() {
    val current = BiliClient.prefs.v416endpointAutoSwitch416
    BiliClient.prefs.v416endpointAutoSwitch416 = !current
    AppToast.show(this, "Endpoint Auto Switch416: ${if (!current) "ON" else "OFF"}")
}

// v416: Engine Auto Optimize416
internal fun PlayerActivity.showV416EngineAutoOptimize416Toggle() {
    val current = BiliClient.prefs.v416engineAutoOptimize416
    BiliClient.prefs.v416engineAutoOptimize416 = !current
    AppToast.show(this, "Engine Auto Optimize416: ${if (!current) "ON" else "OFF"}")
}

// v417: Display Refresh Rate417
internal fun PlayerActivity.showV417DisplayRefreshRate417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v417displayRefreshRate417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v417displayRefreshRate417 = value
        AppToast.show(this, "Display Refresh Rate417: $value")
    }
}

// v417: Display Color Temp417
internal fun PlayerActivity.showV417DisplayColorTemp417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v417displayColorTemp417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v417displayColorTemp417 = value
        AppToast.show(this, "Display Color Temp417: $value")
    }
}

// v417: Divider Auto Insert417
internal fun PlayerActivity.showV417DividerAutoInsert417Toggle() {
    val current = BiliClient.prefs.v417dividerAutoInsert417
    BiliClient.prefs.v417dividerAutoInsert417 = !current
    AppToast.show(this, "Divider Auto Insert417: ${if (!current) "ON" else "OFF"}")
}

// v417: Domain Auto Block417
internal fun PlayerActivity.showV417DomainAutoBlock417Toggle() {
    val current = BiliClient.prefs.v417domainAutoBlock417
    BiliClient.prefs.v417domainAutoBlock417 = !current
    AppToast.show(this, "Domain Auto Block417: ${if (!current) "ON" else "OFF"}")
}

// v417: Drag Drop Enabled417
internal fun PlayerActivity.showV417DragDropEnabled417Toggle() {
    val current = BiliClient.prefs.v417dragDropEnabled417
    BiliClient.prefs.v417dragDropEnabled417 = !current
    AppToast.show(this, "Drag Drop Enabled417: ${if (!current) "ON" else "OFF"}")
}

// v417: Drawer Auto Collapse417
internal fun PlayerActivity.showV417DrawerAutoCollapse417Toggle() {
    val current = BiliClient.prefs.v417drawerAutoCollapse417
    BiliClient.prefs.v417drawerAutoCollapse417 = !current
    AppToast.show(this, "Drawer Auto Collapse417: ${if (!current) "ON" else "OFF"}")
}

// v417: DRM Auto Detect417
internal fun PlayerActivity.showV417DrmAutoDetect417Toggle() {
    val current = BiliClient.prefs.v417drmAutoDetect417
    BiliClient.prefs.v417drmAutoDetect417 = !current
    AppToast.show(this, "DRM Auto Detect417: ${if (!current) "ON" else "OFF"}")
}

// v417: Duplicate Auto Remove417
internal fun PlayerActivity.showV417DuplicateAutoRemove417Toggle() {
    val current = BiliClient.prefs.v417duplicateAutoRemove417
    BiliClient.prefs.v417duplicateAutoRemove417 = !current
    AppToast.show(this, "Duplicate Auto Remove417: ${if (!current) "ON" else "OFF"}")
}

// v417: Dynamic Island417
internal fun PlayerActivity.showV417DynamicIsland417Toggle() {
    val current = BiliClient.prefs.v417dynamicIsland417
    BiliClient.prefs.v417dynamicIsland417 = !current
    AppToast.show(this, "Dynamic Island417: ${if (!current) "ON" else "OFF"}")
}

// v417: Dynamic Theme Color417
internal fun PlayerActivity.showV417DynamicThemeColor417Toggle() {
    val current = BiliClient.prefs.v417dynamicThemeColor417
    BiliClient.prefs.v417dynamicThemeColor417 = !current
    AppToast.show(this, "Dynamic Theme Color417: ${if (!current) "ON" else "OFF"}")
}

// v417: Edge Touch Reject417
internal fun PlayerActivity.showV417EdgeTouchReject417Toggle() {
    val current = BiliClient.prefs.v417edgeTouchReject417
    BiliClient.prefs.v417edgeTouchReject417 = !current
    AppToast.show(this, "Edge Touch Reject417: ${if (!current) "ON" else "OFF"}")
}

// v417: Embed Subtitle Track417
internal fun PlayerActivity.showV417EmbedSubtitleTrack417Toggle() {
    val current = BiliClient.prefs.v417embedSubtitleTrack417
    BiliClient.prefs.v417embedSubtitleTrack417 = !current
    AppToast.show(this, "Embed Subtitle Track417: ${if (!current) "ON" else "OFF"}")
}

// v417: Encode Auto Select417
internal fun PlayerActivity.showV417EncodeAutoSelect417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v417encodeAutoSelect417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v417encodeAutoSelect417 = value
        AppToast.show(this, "Encode Auto Select417: $value")
    }
}

// v417: Endpoint Auto Switch417
internal fun PlayerActivity.showV417EndpointAutoSwitch417Toggle() {
    val current = BiliClient.prefs.v417endpointAutoSwitch417
    BiliClient.prefs.v417endpointAutoSwitch417 = !current
    AppToast.show(this, "Endpoint Auto Switch417: ${if (!current) "ON" else "OFF"}")
}

// v417: Engine Auto Optimize417
internal fun PlayerActivity.showV417EngineAutoOptimize417Toggle() {
    val current = BiliClient.prefs.v417engineAutoOptimize417
    BiliClient.prefs.v417engineAutoOptimize417 = !current
    AppToast.show(this, "Engine Auto Optimize417: ${if (!current) "ON" else "OFF"}")
}

// v418: Display Refresh Rate418
internal fun PlayerActivity.showV418DisplayRefreshRate418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v418displayRefreshRate418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v418displayRefreshRate418 = value
        AppToast.show(this, "Display Refresh Rate418: $value")
    }
}

// v418: Display Color Temp418
internal fun PlayerActivity.showV418DisplayColorTemp418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v418displayColorTemp418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v418displayColorTemp418 = value
        AppToast.show(this, "Display Color Temp418: $value")
    }
}

// v418: Divider Auto Insert418
internal fun PlayerActivity.showV418DividerAutoInsert418Toggle() {
    val current = BiliClient.prefs.v418dividerAutoInsert418
    BiliClient.prefs.v418dividerAutoInsert418 = !current
    AppToast.show(this, "Divider Auto Insert418: ${if (!current) "ON" else "OFF"}")
}

// v418: Domain Auto Block418
internal fun PlayerActivity.showV418DomainAutoBlock418Toggle() {
    val current = BiliClient.prefs.v418domainAutoBlock418
    BiliClient.prefs.v418domainAutoBlock418 = !current
    AppToast.show(this, "Domain Auto Block418: ${if (!current) "ON" else "OFF"}")
}

// v418: Drag Drop Enabled418
internal fun PlayerActivity.showV418DragDropEnabled418Toggle() {
    val current = BiliClient.prefs.v418dragDropEnabled418
    BiliClient.prefs.v418dragDropEnabled418 = !current
    AppToast.show(this, "Drag Drop Enabled418: ${if (!current) "ON" else "OFF"}")
}

// v418: Drawer Auto Collapse418
internal fun PlayerActivity.showV418DrawerAutoCollapse418Toggle() {
    val current = BiliClient.prefs.v418drawerAutoCollapse418
    BiliClient.prefs.v418drawerAutoCollapse418 = !current
    AppToast.show(this, "Drawer Auto Collapse418: ${if (!current) "ON" else "OFF"}")
}

// v418: DRM Auto Detect418
internal fun PlayerActivity.showV418DrmAutoDetect418Toggle() {
    val current = BiliClient.prefs.v418drmAutoDetect418
    BiliClient.prefs.v418drmAutoDetect418 = !current
    AppToast.show(this, "DRM Auto Detect418: ${if (!current) "ON" else "OFF"}")
}

// v418: Duplicate Auto Remove418
internal fun PlayerActivity.showV418DuplicateAutoRemove418Toggle() {
    val current = BiliClient.prefs.v418duplicateAutoRemove418
    BiliClient.prefs.v418duplicateAutoRemove418 = !current
    AppToast.show(this, "Duplicate Auto Remove418: ${if (!current) "ON" else "OFF"}")
}

// v418: Dynamic Island418
internal fun PlayerActivity.showV418DynamicIsland418Toggle() {
    val current = BiliClient.prefs.v418dynamicIsland418
    BiliClient.prefs.v418dynamicIsland418 = !current
    AppToast.show(this, "Dynamic Island418: ${if (!current) "ON" else "OFF"}")
}

// v418: Dynamic Theme Color418
internal fun PlayerActivity.showV418DynamicThemeColor418Toggle() {
    val current = BiliClient.prefs.v418dynamicThemeColor418
    BiliClient.prefs.v418dynamicThemeColor418 = !current
    AppToast.show(this, "Dynamic Theme Color418: ${if (!current) "ON" else "OFF"}")
}

// v418: Edge Touch Reject418
internal fun PlayerActivity.showV418EdgeTouchReject418Toggle() {
    val current = BiliClient.prefs.v418edgeTouchReject418
    BiliClient.prefs.v418edgeTouchReject418 = !current
    AppToast.show(this, "Edge Touch Reject418: ${if (!current) "ON" else "OFF"}")
}

// v418: Embed Subtitle Track418
internal fun PlayerActivity.showV418EmbedSubtitleTrack418Toggle() {
    val current = BiliClient.prefs.v418embedSubtitleTrack418
    BiliClient.prefs.v418embedSubtitleTrack418 = !current
    AppToast.show(this, "Embed Subtitle Track418: ${if (!current) "ON" else "OFF"}")
}

// v418: Encode Auto Select418
internal fun PlayerActivity.showV418EncodeAutoSelect418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v418encodeAutoSelect418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v418encodeAutoSelect418 = value
        AppToast.show(this, "Encode Auto Select418: $value")
    }
}

// v418: Endpoint Auto Switch418
internal fun PlayerActivity.showV418EndpointAutoSwitch418Toggle() {
    val current = BiliClient.prefs.v418endpointAutoSwitch418
    BiliClient.prefs.v418endpointAutoSwitch418 = !current
    AppToast.show(this, "Endpoint Auto Switch418: ${if (!current) "ON" else "OFF"}")
}

// v418: Engine Auto Optimize418
internal fun PlayerActivity.showV418EngineAutoOptimize418Toggle() {
    val current = BiliClient.prefs.v418engineAutoOptimize418
    BiliClient.prefs.v418engineAutoOptimize418 = !current
    AppToast.show(this, "Engine Auto Optimize418: ${if (!current) "ON" else "OFF"}")
}

// v419: Display Refresh Rate419
internal fun PlayerActivity.showV419DisplayRefreshRate419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v419displayRefreshRate419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v419displayRefreshRate419 = value
        AppToast.show(this, "Display Refresh Rate419: $value")
    }
}

// v419: Display Color Temp419
internal fun PlayerActivity.showV419DisplayColorTemp419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v419displayColorTemp419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v419displayColorTemp419 = value
        AppToast.show(this, "Display Color Temp419: $value")
    }
}

// v419: Divider Auto Insert419
internal fun PlayerActivity.showV419DividerAutoInsert419Toggle() {
    val current = BiliClient.prefs.v419dividerAutoInsert419
    BiliClient.prefs.v419dividerAutoInsert419 = !current
    AppToast.show(this, "Divider Auto Insert419: ${if (!current) "ON" else "OFF"}")
}

// v419: Domain Auto Block419
internal fun PlayerActivity.showV419DomainAutoBlock419Toggle() {
    val current = BiliClient.prefs.v419domainAutoBlock419
    BiliClient.prefs.v419domainAutoBlock419 = !current
    AppToast.show(this, "Domain Auto Block419: ${if (!current) "ON" else "OFF"}")
}

// v419: Drag Drop Enabled419
internal fun PlayerActivity.showV419DragDropEnabled419Toggle() {
    val current = BiliClient.prefs.v419dragDropEnabled419
    BiliClient.prefs.v419dragDropEnabled419 = !current
    AppToast.show(this, "Drag Drop Enabled419: ${if (!current) "ON" else "OFF"}")
}

// v419: Drawer Auto Collapse419
internal fun PlayerActivity.showV419DrawerAutoCollapse419Toggle() {
    val current = BiliClient.prefs.v419drawerAutoCollapse419
    BiliClient.prefs.v419drawerAutoCollapse419 = !current
    AppToast.show(this, "Drawer Auto Collapse419: ${if (!current) "ON" else "OFF"}")
}

// v419: DRM Auto Detect419
internal fun PlayerActivity.showV419DrmAutoDetect419Toggle() {
    val current = BiliClient.prefs.v419drmAutoDetect419
    BiliClient.prefs.v419drmAutoDetect419 = !current
    AppToast.show(this, "DRM Auto Detect419: ${if (!current) "ON" else "OFF"}")
}

// v419: Duplicate Auto Remove419
internal fun PlayerActivity.showV419DuplicateAutoRemove419Toggle() {
    val current = BiliClient.prefs.v419duplicateAutoRemove419
    BiliClient.prefs.v419duplicateAutoRemove419 = !current
    AppToast.show(this, "Duplicate Auto Remove419: ${if (!current) "ON" else "OFF"}")
}

// v419: Dynamic Island419
internal fun PlayerActivity.showV419DynamicIsland419Toggle() {
    val current = BiliClient.prefs.v419dynamicIsland419
    BiliClient.prefs.v419dynamicIsland419 = !current
    AppToast.show(this, "Dynamic Island419: ${if (!current) "ON" else "OFF"}")
}

// v419: Dynamic Theme Color419
internal fun PlayerActivity.showV419DynamicThemeColor419Toggle() {
    val current = BiliClient.prefs.v419dynamicThemeColor419
    BiliClient.prefs.v419dynamicThemeColor419 = !current
    AppToast.show(this, "Dynamic Theme Color419: ${if (!current) "ON" else "OFF"}")
}

// v419: Edge Touch Reject419
internal fun PlayerActivity.showV419EdgeTouchReject419Toggle() {
    val current = BiliClient.prefs.v419edgeTouchReject419
    BiliClient.prefs.v419edgeTouchReject419 = !current
    AppToast.show(this, "Edge Touch Reject419: ${if (!current) "ON" else "OFF"}")
}

// v419: Embed Subtitle Track419
internal fun PlayerActivity.showV419EmbedSubtitleTrack419Toggle() {
    val current = BiliClient.prefs.v419embedSubtitleTrack419
    BiliClient.prefs.v419embedSubtitleTrack419 = !current
    AppToast.show(this, "Embed Subtitle Track419: ${if (!current) "ON" else "OFF"}")
}

// v419: Encode Auto Select419
internal fun PlayerActivity.showV419EncodeAutoSelect419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v419encodeAutoSelect419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v419encodeAutoSelect419 = value
        AppToast.show(this, "Encode Auto Select419: $value")
    }
}

// v419: Endpoint Auto Switch419
internal fun PlayerActivity.showV419EndpointAutoSwitch419Toggle() {
    val current = BiliClient.prefs.v419endpointAutoSwitch419
    BiliClient.prefs.v419endpointAutoSwitch419 = !current
    AppToast.show(this, "Endpoint Auto Switch419: ${if (!current) "ON" else "OFF"}")
}

// v419: Engine Auto Optimize419
internal fun PlayerActivity.showV419EngineAutoOptimize419Toggle() {
    val current = BiliClient.prefs.v419engineAutoOptimize419
    BiliClient.prefs.v419engineAutoOptimize419 = !current
    AppToast.show(this, "Engine Auto Optimize419: ${if (!current) "ON" else "OFF"}")
}

// v420: Display Refresh Rate420
internal fun PlayerActivity.showV420DisplayRefreshRate420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v420displayRefreshRate420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v420displayRefreshRate420 = value
        AppToast.show(this, "Display Refresh Rate420: $value")
    }
}

// v420: Display Color Temp420
internal fun PlayerActivity.showV420DisplayColorTemp420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v420displayColorTemp420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v420displayColorTemp420 = value
        AppToast.show(this, "Display Color Temp420: $value")
    }
}

// v420: Divider Auto Insert420
internal fun PlayerActivity.showV420DividerAutoInsert420Toggle() {
    val current = BiliClient.prefs.v420dividerAutoInsert420
    BiliClient.prefs.v420dividerAutoInsert420 = !current
    AppToast.show(this, "Divider Auto Insert420: ${if (!current) "ON" else "OFF"}")
}

// v420: Domain Auto Block420
internal fun PlayerActivity.showV420DomainAutoBlock420Toggle() {
    val current = BiliClient.prefs.v420domainAutoBlock420
    BiliClient.prefs.v420domainAutoBlock420 = !current
    AppToast.show(this, "Domain Auto Block420: ${if (!current) "ON" else "OFF"}")
}

// v420: Drag Drop Enabled420
internal fun PlayerActivity.showV420DragDropEnabled420Toggle() {
    val current = BiliClient.prefs.v420dragDropEnabled420
    BiliClient.prefs.v420dragDropEnabled420 = !current
    AppToast.show(this, "Drag Drop Enabled420: ${if (!current) "ON" else "OFF"}")
}

// v420: Drawer Auto Collapse420
internal fun PlayerActivity.showV420DrawerAutoCollapse420Toggle() {
    val current = BiliClient.prefs.v420drawerAutoCollapse420
    BiliClient.prefs.v420drawerAutoCollapse420 = !current
    AppToast.show(this, "Drawer Auto Collapse420: ${if (!current) "ON" else "OFF"}")
}

// v420: DRM Auto Detect420
internal fun PlayerActivity.showV420DrmAutoDetect420Toggle() {
    val current = BiliClient.prefs.v420drmAutoDetect420
    BiliClient.prefs.v420drmAutoDetect420 = !current
    AppToast.show(this, "DRM Auto Detect420: ${if (!current) "ON" else "OFF"}")
}

// v420: Duplicate Auto Remove420
internal fun PlayerActivity.showV420DuplicateAutoRemove420Toggle() {
    val current = BiliClient.prefs.v420duplicateAutoRemove420
    BiliClient.prefs.v420duplicateAutoRemove420 = !current
    AppToast.show(this, "Duplicate Auto Remove420: ${if (!current) "ON" else "OFF"}")
}

// v420: Dynamic Island420
internal fun PlayerActivity.showV420DynamicIsland420Toggle() {
    val current = BiliClient.prefs.v420dynamicIsland420
    BiliClient.prefs.v420dynamicIsland420 = !current
    AppToast.show(this, "Dynamic Island420: ${if (!current) "ON" else "OFF"}")
}

// v420: Dynamic Theme Color420
internal fun PlayerActivity.showV420DynamicThemeColor420Toggle() {
    val current = BiliClient.prefs.v420dynamicThemeColor420
    BiliClient.prefs.v420dynamicThemeColor420 = !current
    AppToast.show(this, "Dynamic Theme Color420: ${if (!current) "ON" else "OFF"}")
}

// v420: Edge Touch Reject420
internal fun PlayerActivity.showV420EdgeTouchReject420Toggle() {
    val current = BiliClient.prefs.v420edgeTouchReject420
    BiliClient.prefs.v420edgeTouchReject420 = !current
    AppToast.show(this, "Edge Touch Reject420: ${if (!current) "ON" else "OFF"}")
}

// v420: Embed Subtitle Track420
internal fun PlayerActivity.showV420EmbedSubtitleTrack420Toggle() {
    val current = BiliClient.prefs.v420embedSubtitleTrack420
    BiliClient.prefs.v420embedSubtitleTrack420 = !current
    AppToast.show(this, "Embed Subtitle Track420: ${if (!current) "ON" else "OFF"}")
}

// v420: Encode Auto Select420
internal fun PlayerActivity.showV420EncodeAutoSelect420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v420encodeAutoSelect420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v420encodeAutoSelect420 = value
        AppToast.show(this, "Encode Auto Select420: $value")
    }
}

// v420: Endpoint Auto Switch420
internal fun PlayerActivity.showV420EndpointAutoSwitch420Toggle() {
    val current = BiliClient.prefs.v420endpointAutoSwitch420
    BiliClient.prefs.v420endpointAutoSwitch420 = !current
    AppToast.show(this, "Endpoint Auto Switch420: ${if (!current) "ON" else "OFF"}")
}

// v420: Engine Auto Optimize420
internal fun PlayerActivity.showV420EngineAutoOptimize420Toggle() {
    val current = BiliClient.prefs.v420engineAutoOptimize420
    BiliClient.prefs.v420engineAutoOptimize420 = !current
    AppToast.show(this, "Engine Auto Optimize420: ${if (!current) "ON" else "OFF"}")
}

// v421: Enter Animation421
internal fun PlayerActivity.showV421EnterAnimation421Toggle() {
    val current = BiliClient.prefs.v421enterAnimation421
    BiliClient.prefs.v421enterAnimation421 = !current
    AppToast.show(this, "Enter Animation421: ${if (!current) "ON" else "OFF"}")
}

// v421: Environment Light Sensor421
internal fun PlayerActivity.showV421EnvironmentLightSensor421Toggle() {
    val current = BiliClient.prefs.v421environmentLightSensor421
    BiliClient.prefs.v421environmentLightSensor421 = !current
    AppToast.show(this, "Environment Light Sensor421: ${if (!current) "ON" else "OFF"}")
}

// v421: Error Auto Retry421
internal fun PlayerActivity.showV421ErrorAutoRetry421Toggle() {
    val current = BiliClient.prefs.v421errorAutoRetry421
    BiliClient.prefs.v421errorAutoRetry421 = !current
    AppToast.show(this, "Error Auto Retry421: ${if (!current) "ON" else "OFF"}")
}

// v421: Error Report Auto421
internal fun PlayerActivity.showV421ErrorReportAuto421Toggle() {
    val current = BiliClient.prefs.v421errorReportAuto421
    BiliClient.prefs.v421errorReportAuto421 = !current
    AppToast.show(this, "Error Report Auto421: ${if (!current) "ON" else "OFF"}")
}

// v421: Event Auto Notify421
internal fun PlayerActivity.showV421EventAutoNotify421Toggle() {
    val current = BiliClient.prefs.v421eventAutoNotify421
    BiliClient.prefs.v421eventAutoNotify421 = !current
    AppToast.show(this, "Event Auto Notify421: ${if (!current) "ON" else "OFF"}")
}

// v421: Exit Confirmation421
internal fun PlayerActivity.showV421ExitConfirmation421Toggle() {
    val current = BiliClient.prefs.v421exitConfirmation421
    BiliClient.prefs.v421exitConfirmation421 = !current
    AppToast.show(this, "Exit Confirmation421: ${if (!current) "ON" else "OFF"}")
}

// v421: Expand On Double Tap421
internal fun PlayerActivity.showV421ExpandOnDoubleTap421Toggle() {
    val current = BiliClient.prefs.v421expandOnDoubleTap421
    BiliClient.prefs.v421expandOnDoubleTap421 = !current
    AppToast.show(this, "Expand On Double Tap421: ${if (!current) "ON" else "OFF"}")
}

// v421: Export Format Default421
internal fun PlayerActivity.showV421ExportFormatDefault421Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v421exportFormatDefault421).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default421",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v421exportFormatDefault421 = value
        AppToast.show(this, "Export Format Default421: $value")
    }
}

// v421: Extract Audio Auto421
internal fun PlayerActivity.showV421ExtractAudioAuto421Toggle() {
    val current = BiliClient.prefs.v421extractAudioAuto421
    BiliClient.prefs.v421extractAudioAuto421 = !current
    AppToast.show(this, "Extract Audio Auto421: ${if (!current) "ON" else "OFF"}")
}

// v421: Fade Transition421
internal fun PlayerActivity.showV421FadeTransition421Toggle() {
    val current = BiliClient.prefs.v421fadeTransition421
    BiliClient.prefs.v421fadeTransition421 = !current
    AppToast.show(this, "Fade Transition421: ${if (!current) "ON" else "OFF"}")
}

// v421: Feed Auto Refresh421
internal fun PlayerActivity.showV421FeedAutoRefresh421Toggle() {
    val current = BiliClient.prefs.v421feedAutoRefresh421
    BiliClient.prefs.v421feedAutoRefresh421 = !current
    AppToast.show(this, "Feed Auto Refresh421: ${if (!current) "ON" else "OFF"}")
}

// v421: Feed Layout Style421
internal fun PlayerActivity.showV421FeedLayoutStyle421Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v421feedLayoutStyle421).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style421",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v421feedLayoutStyle421 = value
        AppToast.show(this, "Feed Layout Style421: $value")
    }
}

// v421: File Auto Organize421
internal fun PlayerActivity.showV421FileAutoOrganize421Toggle() {
    val current = BiliClient.prefs.v421fileAutoOrganize421
    BiliClient.prefs.v421fileAutoOrganize421 = !current
    AppToast.show(this, "File Auto Organize421: ${if (!current) "ON" else "OFF"}")
}

// v421: Find In Page Highlight421
internal fun PlayerActivity.showV421FindInPageHighlight421Toggle() {
    val current = BiliClient.prefs.v421findInPageHighlight421
    BiliClient.prefs.v421findInPageHighlight421 = !current
    AppToast.show(this, "Find In Page Highlight421: ${if (!current) "ON" else "OFF"}")
}

// v421: Fix Corrupt Auto421
internal fun PlayerActivity.showV421FixCorruptAuto421Toggle() {
    val current = BiliClient.prefs.v421fixCorruptAuto421
    BiliClient.prefs.v421fixCorruptAuto421 = !current
    AppToast.show(this, "Fix Corrupt Auto421: ${if (!current) "ON" else "OFF"}")
}

// v422: Enter Animation422
internal fun PlayerActivity.showV422EnterAnimation422Toggle() {
    val current = BiliClient.prefs.v422enterAnimation422
    BiliClient.prefs.v422enterAnimation422 = !current
    AppToast.show(this, "Enter Animation422: ${if (!current) "ON" else "OFF"}")
}

// v422: Environment Light Sensor422
internal fun PlayerActivity.showV422EnvironmentLightSensor422Toggle() {
    val current = BiliClient.prefs.v422environmentLightSensor422
    BiliClient.prefs.v422environmentLightSensor422 = !current
    AppToast.show(this, "Environment Light Sensor422: ${if (!current) "ON" else "OFF"}")
}

// v422: Error Auto Retry422
internal fun PlayerActivity.showV422ErrorAutoRetry422Toggle() {
    val current = BiliClient.prefs.v422errorAutoRetry422
    BiliClient.prefs.v422errorAutoRetry422 = !current
    AppToast.show(this, "Error Auto Retry422: ${if (!current) "ON" else "OFF"}")
}

// v422: Error Report Auto422
internal fun PlayerActivity.showV422ErrorReportAuto422Toggle() {
    val current = BiliClient.prefs.v422errorReportAuto422
    BiliClient.prefs.v422errorReportAuto422 = !current
    AppToast.show(this, "Error Report Auto422: ${if (!current) "ON" else "OFF"}")
}

// v422: Event Auto Notify422
internal fun PlayerActivity.showV422EventAutoNotify422Toggle() {
    val current = BiliClient.prefs.v422eventAutoNotify422
    BiliClient.prefs.v422eventAutoNotify422 = !current
    AppToast.show(this, "Event Auto Notify422: ${if (!current) "ON" else "OFF"}")
}

// v422: Exit Confirmation422
internal fun PlayerActivity.showV422ExitConfirmation422Toggle() {
    val current = BiliClient.prefs.v422exitConfirmation422
    BiliClient.prefs.v422exitConfirmation422 = !current
    AppToast.show(this, "Exit Confirmation422: ${if (!current) "ON" else "OFF"}")
}

// v422: Expand On Double Tap422
internal fun PlayerActivity.showV422ExpandOnDoubleTap422Toggle() {
    val current = BiliClient.prefs.v422expandOnDoubleTap422
    BiliClient.prefs.v422expandOnDoubleTap422 = !current
    AppToast.show(this, "Expand On Double Tap422: ${if (!current) "ON" else "OFF"}")
}

// v422: Export Format Default422
internal fun PlayerActivity.showV422ExportFormatDefault422Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v422exportFormatDefault422).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default422",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v422exportFormatDefault422 = value
        AppToast.show(this, "Export Format Default422: $value")
    }
}

// v422: Extract Audio Auto422
internal fun PlayerActivity.showV422ExtractAudioAuto422Toggle() {
    val current = BiliClient.prefs.v422extractAudioAuto422
    BiliClient.prefs.v422extractAudioAuto422 = !current
    AppToast.show(this, "Extract Audio Auto422: ${if (!current) "ON" else "OFF"}")
}

// v422: Fade Transition422
internal fun PlayerActivity.showV422FadeTransition422Toggle() {
    val current = BiliClient.prefs.v422fadeTransition422
    BiliClient.prefs.v422fadeTransition422 = !current
    AppToast.show(this, "Fade Transition422: ${if (!current) "ON" else "OFF"}")
}

// v422: Feed Auto Refresh422
internal fun PlayerActivity.showV422FeedAutoRefresh422Toggle() {
    val current = BiliClient.prefs.v422feedAutoRefresh422
    BiliClient.prefs.v422feedAutoRefresh422 = !current
    AppToast.show(this, "Feed Auto Refresh422: ${if (!current) "ON" else "OFF"}")
}

// v422: Feed Layout Style422
internal fun PlayerActivity.showV422FeedLayoutStyle422Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v422feedLayoutStyle422).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style422",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v422feedLayoutStyle422 = value
        AppToast.show(this, "Feed Layout Style422: $value")
    }
}

// v422: File Auto Organize422
internal fun PlayerActivity.showV422FileAutoOrganize422Toggle() {
    val current = BiliClient.prefs.v422fileAutoOrganize422
    BiliClient.prefs.v422fileAutoOrganize422 = !current
    AppToast.show(this, "File Auto Organize422: ${if (!current) "ON" else "OFF"}")
}

// v422: Find In Page Highlight422
internal fun PlayerActivity.showV422FindInPageHighlight422Toggle() {
    val current = BiliClient.prefs.v422findInPageHighlight422
    BiliClient.prefs.v422findInPageHighlight422 = !current
    AppToast.show(this, "Find In Page Highlight422: ${if (!current) "ON" else "OFF"}")
}

// v422: Fix Corrupt Auto422
internal fun PlayerActivity.showV422FixCorruptAuto422Toggle() {
    val current = BiliClient.prefs.v422fixCorruptAuto422
    BiliClient.prefs.v422fixCorruptAuto422 = !current
    AppToast.show(this, "Fix Corrupt Auto422: ${if (!current) "ON" else "OFF"}")
}

// v423: Enter Animation423
internal fun PlayerActivity.showV423EnterAnimation423Toggle() {
    val current = BiliClient.prefs.v423enterAnimation423
    BiliClient.prefs.v423enterAnimation423 = !current
    AppToast.show(this, "Enter Animation423: ${if (!current) "ON" else "OFF"}")
}

// v423: Environment Light Sensor423
internal fun PlayerActivity.showV423EnvironmentLightSensor423Toggle() {
    val current = BiliClient.prefs.v423environmentLightSensor423
    BiliClient.prefs.v423environmentLightSensor423 = !current
    AppToast.show(this, "Environment Light Sensor423: ${if (!current) "ON" else "OFF"}")
}

// v423: Error Auto Retry423
internal fun PlayerActivity.showV423ErrorAutoRetry423Toggle() {
    val current = BiliClient.prefs.v423errorAutoRetry423
    BiliClient.prefs.v423errorAutoRetry423 = !current
    AppToast.show(this, "Error Auto Retry423: ${if (!current) "ON" else "OFF"}")
}

// v423: Error Report Auto423
internal fun PlayerActivity.showV423ErrorReportAuto423Toggle() {
    val current = BiliClient.prefs.v423errorReportAuto423
    BiliClient.prefs.v423errorReportAuto423 = !current
    AppToast.show(this, "Error Report Auto423: ${if (!current) "ON" else "OFF"}")
}

// v423: Event Auto Notify423
internal fun PlayerActivity.showV423EventAutoNotify423Toggle() {
    val current = BiliClient.prefs.v423eventAutoNotify423
    BiliClient.prefs.v423eventAutoNotify423 = !current
    AppToast.show(this, "Event Auto Notify423: ${if (!current) "ON" else "OFF"}")
}

// v423: Exit Confirmation423
internal fun PlayerActivity.showV423ExitConfirmation423Toggle() {
    val current = BiliClient.prefs.v423exitConfirmation423
    BiliClient.prefs.v423exitConfirmation423 = !current
    AppToast.show(this, "Exit Confirmation423: ${if (!current) "ON" else "OFF"}")
}

// v423: Expand On Double Tap423
internal fun PlayerActivity.showV423ExpandOnDoubleTap423Toggle() {
    val current = BiliClient.prefs.v423expandOnDoubleTap423
    BiliClient.prefs.v423expandOnDoubleTap423 = !current
    AppToast.show(this, "Expand On Double Tap423: ${if (!current) "ON" else "OFF"}")
}

// v423: Export Format Default423
internal fun PlayerActivity.showV423ExportFormatDefault423Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v423exportFormatDefault423).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default423",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v423exportFormatDefault423 = value
        AppToast.show(this, "Export Format Default423: $value")
    }
}

// v423: Extract Audio Auto423
internal fun PlayerActivity.showV423ExtractAudioAuto423Toggle() {
    val current = BiliClient.prefs.v423extractAudioAuto423
    BiliClient.prefs.v423extractAudioAuto423 = !current
    AppToast.show(this, "Extract Audio Auto423: ${if (!current) "ON" else "OFF"}")
}

// v423: Fade Transition423
internal fun PlayerActivity.showV423FadeTransition423Toggle() {
    val current = BiliClient.prefs.v423fadeTransition423
    BiliClient.prefs.v423fadeTransition423 = !current
    AppToast.show(this, "Fade Transition423: ${if (!current) "ON" else "OFF"}")
}

// v423: Feed Auto Refresh423
internal fun PlayerActivity.showV423FeedAutoRefresh423Toggle() {
    val current = BiliClient.prefs.v423feedAutoRefresh423
    BiliClient.prefs.v423feedAutoRefresh423 = !current
    AppToast.show(this, "Feed Auto Refresh423: ${if (!current) "ON" else "OFF"}")
}

// v423: Feed Layout Style423
internal fun PlayerActivity.showV423FeedLayoutStyle423Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v423feedLayoutStyle423).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style423",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v423feedLayoutStyle423 = value
        AppToast.show(this, "Feed Layout Style423: $value")
    }
}

// v423: File Auto Organize423
internal fun PlayerActivity.showV423FileAutoOrganize423Toggle() {
    val current = BiliClient.prefs.v423fileAutoOrganize423
    BiliClient.prefs.v423fileAutoOrganize423 = !current
    AppToast.show(this, "File Auto Organize423: ${if (!current) "ON" else "OFF"}")
}

// v423: Find In Page Highlight423
internal fun PlayerActivity.showV423FindInPageHighlight423Toggle() {
    val current = BiliClient.prefs.v423findInPageHighlight423
    BiliClient.prefs.v423findInPageHighlight423 = !current
    AppToast.show(this, "Find In Page Highlight423: ${if (!current) "ON" else "OFF"}")
}

// v423: Fix Corrupt Auto423
internal fun PlayerActivity.showV423FixCorruptAuto423Toggle() {
    val current = BiliClient.prefs.v423fixCorruptAuto423
    BiliClient.prefs.v423fixCorruptAuto423 = !current
    AppToast.show(this, "Fix Corrupt Auto423: ${if (!current) "ON" else "OFF"}")
}

// v424: Enter Animation424
internal fun PlayerActivity.showV424EnterAnimation424Toggle() {
    val current = BiliClient.prefs.v424enterAnimation424
    BiliClient.prefs.v424enterAnimation424 = !current
    AppToast.show(this, "Enter Animation424: ${if (!current) "ON" else "OFF"}")
}

// v424: Environment Light Sensor424
internal fun PlayerActivity.showV424EnvironmentLightSensor424Toggle() {
    val current = BiliClient.prefs.v424environmentLightSensor424
    BiliClient.prefs.v424environmentLightSensor424 = !current
    AppToast.show(this, "Environment Light Sensor424: ${if (!current) "ON" else "OFF"}")
}

// v424: Error Auto Retry424
internal fun PlayerActivity.showV424ErrorAutoRetry424Toggle() {
    val current = BiliClient.prefs.v424errorAutoRetry424
    BiliClient.prefs.v424errorAutoRetry424 = !current
    AppToast.show(this, "Error Auto Retry424: ${if (!current) "ON" else "OFF"}")
}

// v424: Error Report Auto424
internal fun PlayerActivity.showV424ErrorReportAuto424Toggle() {
    val current = BiliClient.prefs.v424errorReportAuto424
    BiliClient.prefs.v424errorReportAuto424 = !current
    AppToast.show(this, "Error Report Auto424: ${if (!current) "ON" else "OFF"}")
}

// v424: Event Auto Notify424
internal fun PlayerActivity.showV424EventAutoNotify424Toggle() {
    val current = BiliClient.prefs.v424eventAutoNotify424
    BiliClient.prefs.v424eventAutoNotify424 = !current
    AppToast.show(this, "Event Auto Notify424: ${if (!current) "ON" else "OFF"}")
}

// v424: Exit Confirmation424
internal fun PlayerActivity.showV424ExitConfirmation424Toggle() {
    val current = BiliClient.prefs.v424exitConfirmation424
    BiliClient.prefs.v424exitConfirmation424 = !current
    AppToast.show(this, "Exit Confirmation424: ${if (!current) "ON" else "OFF"}")
}

// v424: Expand On Double Tap424
internal fun PlayerActivity.showV424ExpandOnDoubleTap424Toggle() {
    val current = BiliClient.prefs.v424expandOnDoubleTap424
    BiliClient.prefs.v424expandOnDoubleTap424 = !current
    AppToast.show(this, "Expand On Double Tap424: ${if (!current) "ON" else "OFF"}")
}

// v424: Export Format Default424
internal fun PlayerActivity.showV424ExportFormatDefault424Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v424exportFormatDefault424).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default424",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v424exportFormatDefault424 = value
        AppToast.show(this, "Export Format Default424: $value")
    }
}

// v424: Extract Audio Auto424
internal fun PlayerActivity.showV424ExtractAudioAuto424Toggle() {
    val current = BiliClient.prefs.v424extractAudioAuto424
    BiliClient.prefs.v424extractAudioAuto424 = !current
    AppToast.show(this, "Extract Audio Auto424: ${if (!current) "ON" else "OFF"}")
}

// v424: Fade Transition424
internal fun PlayerActivity.showV424FadeTransition424Toggle() {
    val current = BiliClient.prefs.v424fadeTransition424
    BiliClient.prefs.v424fadeTransition424 = !current
    AppToast.show(this, "Fade Transition424: ${if (!current) "ON" else "OFF"}")
}

// v424: Feed Auto Refresh424
internal fun PlayerActivity.showV424FeedAutoRefresh424Toggle() {
    val current = BiliClient.prefs.v424feedAutoRefresh424
    BiliClient.prefs.v424feedAutoRefresh424 = !current
    AppToast.show(this, "Feed Auto Refresh424: ${if (!current) "ON" else "OFF"}")
}

// v424: Feed Layout Style424
internal fun PlayerActivity.showV424FeedLayoutStyle424Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v424feedLayoutStyle424).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style424",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v424feedLayoutStyle424 = value
        AppToast.show(this, "Feed Layout Style424: $value")
    }
}

// v424: File Auto Organize424
internal fun PlayerActivity.showV424FileAutoOrganize424Toggle() {
    val current = BiliClient.prefs.v424fileAutoOrganize424
    BiliClient.prefs.v424fileAutoOrganize424 = !current
    AppToast.show(this, "File Auto Organize424: ${if (!current) "ON" else "OFF"}")
}

// v424: Find In Page Highlight424
internal fun PlayerActivity.showV424FindInPageHighlight424Toggle() {
    val current = BiliClient.prefs.v424findInPageHighlight424
    BiliClient.prefs.v424findInPageHighlight424 = !current
    AppToast.show(this, "Find In Page Highlight424: ${if (!current) "ON" else "OFF"}")
}

// v424: Fix Corrupt Auto424
internal fun PlayerActivity.showV424FixCorruptAuto424Toggle() {
    val current = BiliClient.prefs.v424fixCorruptAuto424
    BiliClient.prefs.v424fixCorruptAuto424 = !current
    AppToast.show(this, "Fix Corrupt Auto424: ${if (!current) "ON" else "OFF"}")
}

// v425: Enter Animation425
internal fun PlayerActivity.showV425EnterAnimation425Toggle() {
    val current = BiliClient.prefs.v425enterAnimation425
    BiliClient.prefs.v425enterAnimation425 = !current
    AppToast.show(this, "Enter Animation425: ${if (!current) "ON" else "OFF"}")
}

// v425: Environment Light Sensor425
internal fun PlayerActivity.showV425EnvironmentLightSensor425Toggle() {
    val current = BiliClient.prefs.v425environmentLightSensor425
    BiliClient.prefs.v425environmentLightSensor425 = !current
    AppToast.show(this, "Environment Light Sensor425: ${if (!current) "ON" else "OFF"}")
}

// v425: Error Auto Retry425
internal fun PlayerActivity.showV425ErrorAutoRetry425Toggle() {
    val current = BiliClient.prefs.v425errorAutoRetry425
    BiliClient.prefs.v425errorAutoRetry425 = !current
    AppToast.show(this, "Error Auto Retry425: ${if (!current) "ON" else "OFF"}")
}

// v425: Error Report Auto425
internal fun PlayerActivity.showV425ErrorReportAuto425Toggle() {
    val current = BiliClient.prefs.v425errorReportAuto425
    BiliClient.prefs.v425errorReportAuto425 = !current
    AppToast.show(this, "Error Report Auto425: ${if (!current) "ON" else "OFF"}")
}

// v425: Event Auto Notify425
internal fun PlayerActivity.showV425EventAutoNotify425Toggle() {
    val current = BiliClient.prefs.v425eventAutoNotify425
    BiliClient.prefs.v425eventAutoNotify425 = !current
    AppToast.show(this, "Event Auto Notify425: ${if (!current) "ON" else "OFF"}")
}

// v425: Exit Confirmation425
internal fun PlayerActivity.showV425ExitConfirmation425Toggle() {
    val current = BiliClient.prefs.v425exitConfirmation425
    BiliClient.prefs.v425exitConfirmation425 = !current
    AppToast.show(this, "Exit Confirmation425: ${if (!current) "ON" else "OFF"}")
}

// v425: Expand On Double Tap425
internal fun PlayerActivity.showV425ExpandOnDoubleTap425Toggle() {
    val current = BiliClient.prefs.v425expandOnDoubleTap425
    BiliClient.prefs.v425expandOnDoubleTap425 = !current
    AppToast.show(this, "Expand On Double Tap425: ${if (!current) "ON" else "OFF"}")
}

// v425: Export Format Default425
internal fun PlayerActivity.showV425ExportFormatDefault425Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v425exportFormatDefault425).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default425",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v425exportFormatDefault425 = value
        AppToast.show(this, "Export Format Default425: $value")
    }
}

// v425: Extract Audio Auto425
internal fun PlayerActivity.showV425ExtractAudioAuto425Toggle() {
    val current = BiliClient.prefs.v425extractAudioAuto425
    BiliClient.prefs.v425extractAudioAuto425 = !current
    AppToast.show(this, "Extract Audio Auto425: ${if (!current) "ON" else "OFF"}")
}

// v425: Fade Transition425
internal fun PlayerActivity.showV425FadeTransition425Toggle() {
    val current = BiliClient.prefs.v425fadeTransition425
    BiliClient.prefs.v425fadeTransition425 = !current
    AppToast.show(this, "Fade Transition425: ${if (!current) "ON" else "OFF"}")
}

// v425: Feed Auto Refresh425
internal fun PlayerActivity.showV425FeedAutoRefresh425Toggle() {
    val current = BiliClient.prefs.v425feedAutoRefresh425
    BiliClient.prefs.v425feedAutoRefresh425 = !current
    AppToast.show(this, "Feed Auto Refresh425: ${if (!current) "ON" else "OFF"}")
}

// v425: Feed Layout Style425
internal fun PlayerActivity.showV425FeedLayoutStyle425Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v425feedLayoutStyle425).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style425",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v425feedLayoutStyle425 = value
        AppToast.show(this, "Feed Layout Style425: $value")
    }
}

// v425: File Auto Organize425
internal fun PlayerActivity.showV425FileAutoOrganize425Toggle() {
    val current = BiliClient.prefs.v425fileAutoOrganize425
    BiliClient.prefs.v425fileAutoOrganize425 = !current
    AppToast.show(this, "File Auto Organize425: ${if (!current) "ON" else "OFF"}")
}

// v425: Find In Page Highlight425
internal fun PlayerActivity.showV425FindInPageHighlight425Toggle() {
    val current = BiliClient.prefs.v425findInPageHighlight425
    BiliClient.prefs.v425findInPageHighlight425 = !current
    AppToast.show(this, "Find In Page Highlight425: ${if (!current) "ON" else "OFF"}")
}

// v425: Fix Corrupt Auto425
internal fun PlayerActivity.showV425FixCorruptAuto425Toggle() {
    val current = BiliClient.prefs.v425fixCorruptAuto425
    BiliClient.prefs.v425fixCorruptAuto425 = !current
    AppToast.show(this, "Fix Corrupt Auto425: ${if (!current) "ON" else "OFF"}")
}

// v426: Enter Animation426
internal fun PlayerActivity.showV426EnterAnimation426Toggle() {
    val current = BiliClient.prefs.v426enterAnimation426
    BiliClient.prefs.v426enterAnimation426 = !current
    AppToast.show(this, "Enter Animation426: ${if (!current) "ON" else "OFF"}")
}

// v426: Environment Light Sensor426
internal fun PlayerActivity.showV426EnvironmentLightSensor426Toggle() {
    val current = BiliClient.prefs.v426environmentLightSensor426
    BiliClient.prefs.v426environmentLightSensor426 = !current
    AppToast.show(this, "Environment Light Sensor426: ${if (!current) "ON" else "OFF"}")
}

// v426: Error Auto Retry426
internal fun PlayerActivity.showV426ErrorAutoRetry426Toggle() {
    val current = BiliClient.prefs.v426errorAutoRetry426
    BiliClient.prefs.v426errorAutoRetry426 = !current
    AppToast.show(this, "Error Auto Retry426: ${if (!current) "ON" else "OFF"}")
}

// v426: Error Report Auto426
internal fun PlayerActivity.showV426ErrorReportAuto426Toggle() {
    val current = BiliClient.prefs.v426errorReportAuto426
    BiliClient.prefs.v426errorReportAuto426 = !current
    AppToast.show(this, "Error Report Auto426: ${if (!current) "ON" else "OFF"}")
}

// v426: Event Auto Notify426
internal fun PlayerActivity.showV426EventAutoNotify426Toggle() {
    val current = BiliClient.prefs.v426eventAutoNotify426
    BiliClient.prefs.v426eventAutoNotify426 = !current
    AppToast.show(this, "Event Auto Notify426: ${if (!current) "ON" else "OFF"}")
}

// v426: Exit Confirmation426
internal fun PlayerActivity.showV426ExitConfirmation426Toggle() {
    val current = BiliClient.prefs.v426exitConfirmation426
    BiliClient.prefs.v426exitConfirmation426 = !current
    AppToast.show(this, "Exit Confirmation426: ${if (!current) "ON" else "OFF"}")
}

// v426: Expand On Double Tap426
internal fun PlayerActivity.showV426ExpandOnDoubleTap426Toggle() {
    val current = BiliClient.prefs.v426expandOnDoubleTap426
    BiliClient.prefs.v426expandOnDoubleTap426 = !current
    AppToast.show(this, "Expand On Double Tap426: ${if (!current) "ON" else "OFF"}")
}

// v426: Export Format Default426
internal fun PlayerActivity.showV426ExportFormatDefault426Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v426exportFormatDefault426).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default426",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v426exportFormatDefault426 = value
        AppToast.show(this, "Export Format Default426: $value")
    }
}

// v426: Extract Audio Auto426
internal fun PlayerActivity.showV426ExtractAudioAuto426Toggle() {
    val current = BiliClient.prefs.v426extractAudioAuto426
    BiliClient.prefs.v426extractAudioAuto426 = !current
    AppToast.show(this, "Extract Audio Auto426: ${if (!current) "ON" else "OFF"}")
}

// v426: Fade Transition426
internal fun PlayerActivity.showV426FadeTransition426Toggle() {
    val current = BiliClient.prefs.v426fadeTransition426
    BiliClient.prefs.v426fadeTransition426 = !current
    AppToast.show(this, "Fade Transition426: ${if (!current) "ON" else "OFF"}")
}

// v426: Feed Auto Refresh426
internal fun PlayerActivity.showV426FeedAutoRefresh426Toggle() {
    val current = BiliClient.prefs.v426feedAutoRefresh426
    BiliClient.prefs.v426feedAutoRefresh426 = !current
    AppToast.show(this, "Feed Auto Refresh426: ${if (!current) "ON" else "OFF"}")
}

// v426: Feed Layout Style426
internal fun PlayerActivity.showV426FeedLayoutStyle426Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v426feedLayoutStyle426).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style426",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v426feedLayoutStyle426 = value
        AppToast.show(this, "Feed Layout Style426: $value")
    }
}

// v426: File Auto Organize426
internal fun PlayerActivity.showV426FileAutoOrganize426Toggle() {
    val current = BiliClient.prefs.v426fileAutoOrganize426
    BiliClient.prefs.v426fileAutoOrganize426 = !current
    AppToast.show(this, "File Auto Organize426: ${if (!current) "ON" else "OFF"}")
}

// v426: Find In Page Highlight426
internal fun PlayerActivity.showV426FindInPageHighlight426Toggle() {
    val current = BiliClient.prefs.v426findInPageHighlight426
    BiliClient.prefs.v426findInPageHighlight426 = !current
    AppToast.show(this, "Find In Page Highlight426: ${if (!current) "ON" else "OFF"}")
}

// v426: Fix Corrupt Auto426
internal fun PlayerActivity.showV426FixCorruptAuto426Toggle() {
    val current = BiliClient.prefs.v426fixCorruptAuto426
    BiliClient.prefs.v426fixCorruptAuto426 = !current
    AppToast.show(this, "Fix Corrupt Auto426: ${if (!current) "ON" else "OFF"}")
}

// v427: Enter Animation427
internal fun PlayerActivity.showV427EnterAnimation427Toggle() {
    val current = BiliClient.prefs.v427enterAnimation427
    BiliClient.prefs.v427enterAnimation427 = !current
    AppToast.show(this, "Enter Animation427: ${if (!current) "ON" else "OFF"}")
}

// v427: Environment Light Sensor427
internal fun PlayerActivity.showV427EnvironmentLightSensor427Toggle() {
    val current = BiliClient.prefs.v427environmentLightSensor427
    BiliClient.prefs.v427environmentLightSensor427 = !current
    AppToast.show(this, "Environment Light Sensor427: ${if (!current) "ON" else "OFF"}")
}

// v427: Error Auto Retry427
internal fun PlayerActivity.showV427ErrorAutoRetry427Toggle() {
    val current = BiliClient.prefs.v427errorAutoRetry427
    BiliClient.prefs.v427errorAutoRetry427 = !current
    AppToast.show(this, "Error Auto Retry427: ${if (!current) "ON" else "OFF"}")
}

// v427: Error Report Auto427
internal fun PlayerActivity.showV427ErrorReportAuto427Toggle() {
    val current = BiliClient.prefs.v427errorReportAuto427
    BiliClient.prefs.v427errorReportAuto427 = !current
    AppToast.show(this, "Error Report Auto427: ${if (!current) "ON" else "OFF"}")
}

// v427: Event Auto Notify427
internal fun PlayerActivity.showV427EventAutoNotify427Toggle() {
    val current = BiliClient.prefs.v427eventAutoNotify427
    BiliClient.prefs.v427eventAutoNotify427 = !current
    AppToast.show(this, "Event Auto Notify427: ${if (!current) "ON" else "OFF"}")
}

// v427: Exit Confirmation427
internal fun PlayerActivity.showV427ExitConfirmation427Toggle() {
    val current = BiliClient.prefs.v427exitConfirmation427
    BiliClient.prefs.v427exitConfirmation427 = !current
    AppToast.show(this, "Exit Confirmation427: ${if (!current) "ON" else "OFF"}")
}

// v427: Expand On Double Tap427
internal fun PlayerActivity.showV427ExpandOnDoubleTap427Toggle() {
    val current = BiliClient.prefs.v427expandOnDoubleTap427
    BiliClient.prefs.v427expandOnDoubleTap427 = !current
    AppToast.show(this, "Expand On Double Tap427: ${if (!current) "ON" else "OFF"}")
}

// v427: Export Format Default427
internal fun PlayerActivity.showV427ExportFormatDefault427Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v427exportFormatDefault427).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default427",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v427exportFormatDefault427 = value
        AppToast.show(this, "Export Format Default427: $value")
    }
}

// v427: Extract Audio Auto427
internal fun PlayerActivity.showV427ExtractAudioAuto427Toggle() {
    val current = BiliClient.prefs.v427extractAudioAuto427
    BiliClient.prefs.v427extractAudioAuto427 = !current
    AppToast.show(this, "Extract Audio Auto427: ${if (!current) "ON" else "OFF"}")
}

// v427: Fade Transition427
internal fun PlayerActivity.showV427FadeTransition427Toggle() {
    val current = BiliClient.prefs.v427fadeTransition427
    BiliClient.prefs.v427fadeTransition427 = !current
    AppToast.show(this, "Fade Transition427: ${if (!current) "ON" else "OFF"}")
}

// v427: Feed Auto Refresh427
internal fun PlayerActivity.showV427FeedAutoRefresh427Toggle() {
    val current = BiliClient.prefs.v427feedAutoRefresh427
    BiliClient.prefs.v427feedAutoRefresh427 = !current
    AppToast.show(this, "Feed Auto Refresh427: ${if (!current) "ON" else "OFF"}")
}

// v427: Feed Layout Style427
internal fun PlayerActivity.showV427FeedLayoutStyle427Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v427feedLayoutStyle427).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style427",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v427feedLayoutStyle427 = value
        AppToast.show(this, "Feed Layout Style427: $value")
    }
}

// v427: File Auto Organize427
internal fun PlayerActivity.showV427FileAutoOrganize427Toggle() {
    val current = BiliClient.prefs.v427fileAutoOrganize427
    BiliClient.prefs.v427fileAutoOrganize427 = !current
    AppToast.show(this, "File Auto Organize427: ${if (!current) "ON" else "OFF"}")
}

// v427: Find In Page Highlight427
internal fun PlayerActivity.showV427FindInPageHighlight427Toggle() {
    val current = BiliClient.prefs.v427findInPageHighlight427
    BiliClient.prefs.v427findInPageHighlight427 = !current
    AppToast.show(this, "Find In Page Highlight427: ${if (!current) "ON" else "OFF"}")
}

// v427: Fix Corrupt Auto427
internal fun PlayerActivity.showV427FixCorruptAuto427Toggle() {
    val current = BiliClient.prefs.v427fixCorruptAuto427
    BiliClient.prefs.v427fixCorruptAuto427 = !current
    AppToast.show(this, "Fix Corrupt Auto427: ${if (!current) "ON" else "OFF"}")
}

// v428: Enter Animation428
internal fun PlayerActivity.showV428EnterAnimation428Toggle() {
    val current = BiliClient.prefs.v428enterAnimation428
    BiliClient.prefs.v428enterAnimation428 = !current
    AppToast.show(this, "Enter Animation428: ${if (!current) "ON" else "OFF"}")
}

// v428: Environment Light Sensor428
internal fun PlayerActivity.showV428EnvironmentLightSensor428Toggle() {
    val current = BiliClient.prefs.v428environmentLightSensor428
    BiliClient.prefs.v428environmentLightSensor428 = !current
    AppToast.show(this, "Environment Light Sensor428: ${if (!current) "ON" else "OFF"}")
}

// v428: Error Auto Retry428
internal fun PlayerActivity.showV428ErrorAutoRetry428Toggle() {
    val current = BiliClient.prefs.v428errorAutoRetry428
    BiliClient.prefs.v428errorAutoRetry428 = !current
    AppToast.show(this, "Error Auto Retry428: ${if (!current) "ON" else "OFF"}")
}

// v428: Error Report Auto428
internal fun PlayerActivity.showV428ErrorReportAuto428Toggle() {
    val current = BiliClient.prefs.v428errorReportAuto428
    BiliClient.prefs.v428errorReportAuto428 = !current
    AppToast.show(this, "Error Report Auto428: ${if (!current) "ON" else "OFF"}")
}

// v428: Event Auto Notify428
internal fun PlayerActivity.showV428EventAutoNotify428Toggle() {
    val current = BiliClient.prefs.v428eventAutoNotify428
    BiliClient.prefs.v428eventAutoNotify428 = !current
    AppToast.show(this, "Event Auto Notify428: ${if (!current) "ON" else "OFF"}")
}

// v428: Exit Confirmation428
internal fun PlayerActivity.showV428ExitConfirmation428Toggle() {
    val current = BiliClient.prefs.v428exitConfirmation428
    BiliClient.prefs.v428exitConfirmation428 = !current
    AppToast.show(this, "Exit Confirmation428: ${if (!current) "ON" else "OFF"}")
}

// v428: Expand On Double Tap428
internal fun PlayerActivity.showV428ExpandOnDoubleTap428Toggle() {
    val current = BiliClient.prefs.v428expandOnDoubleTap428
    BiliClient.prefs.v428expandOnDoubleTap428 = !current
    AppToast.show(this, "Expand On Double Tap428: ${if (!current) "ON" else "OFF"}")
}

// v428: Export Format Default428
internal fun PlayerActivity.showV428ExportFormatDefault428Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v428exportFormatDefault428).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default428",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v428exportFormatDefault428 = value
        AppToast.show(this, "Export Format Default428: $value")
    }
}

// v428: Extract Audio Auto428
internal fun PlayerActivity.showV428ExtractAudioAuto428Toggle() {
    val current = BiliClient.prefs.v428extractAudioAuto428
    BiliClient.prefs.v428extractAudioAuto428 = !current
    AppToast.show(this, "Extract Audio Auto428: ${if (!current) "ON" else "OFF"}")
}

// v428: Fade Transition428
internal fun PlayerActivity.showV428FadeTransition428Toggle() {
    val current = BiliClient.prefs.v428fadeTransition428
    BiliClient.prefs.v428fadeTransition428 = !current
    AppToast.show(this, "Fade Transition428: ${if (!current) "ON" else "OFF"}")
}

// v428: Feed Auto Refresh428
internal fun PlayerActivity.showV428FeedAutoRefresh428Toggle() {
    val current = BiliClient.prefs.v428feedAutoRefresh428
    BiliClient.prefs.v428feedAutoRefresh428 = !current
    AppToast.show(this, "Feed Auto Refresh428: ${if (!current) "ON" else "OFF"}")
}

// v428: Feed Layout Style428
internal fun PlayerActivity.showV428FeedLayoutStyle428Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v428feedLayoutStyle428).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style428",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v428feedLayoutStyle428 = value
        AppToast.show(this, "Feed Layout Style428: $value")
    }
}

// v428: File Auto Organize428
internal fun PlayerActivity.showV428FileAutoOrganize428Toggle() {
    val current = BiliClient.prefs.v428fileAutoOrganize428
    BiliClient.prefs.v428fileAutoOrganize428 = !current
    AppToast.show(this, "File Auto Organize428: ${if (!current) "ON" else "OFF"}")
}

// v428: Find In Page Highlight428
internal fun PlayerActivity.showV428FindInPageHighlight428Toggle() {
    val current = BiliClient.prefs.v428findInPageHighlight428
    BiliClient.prefs.v428findInPageHighlight428 = !current
    AppToast.show(this, "Find In Page Highlight428: ${if (!current) "ON" else "OFF"}")
}

// v428: Fix Corrupt Auto428
internal fun PlayerActivity.showV428FixCorruptAuto428Toggle() {
    val current = BiliClient.prefs.v428fixCorruptAuto428
    BiliClient.prefs.v428fixCorruptAuto428 = !current
    AppToast.show(this, "Fix Corrupt Auto428: ${if (!current) "ON" else "OFF"}")
}

// v429: Enter Animation429
internal fun PlayerActivity.showV429EnterAnimation429Toggle() {
    val current = BiliClient.prefs.v429enterAnimation429
    BiliClient.prefs.v429enterAnimation429 = !current
    AppToast.show(this, "Enter Animation429: ${if (!current) "ON" else "OFF"}")
}

// v429: Environment Light Sensor429
internal fun PlayerActivity.showV429EnvironmentLightSensor429Toggle() {
    val current = BiliClient.prefs.v429environmentLightSensor429
    BiliClient.prefs.v429environmentLightSensor429 = !current
    AppToast.show(this, "Environment Light Sensor429: ${if (!current) "ON" else "OFF"}")
}

// v429: Error Auto Retry429
internal fun PlayerActivity.showV429ErrorAutoRetry429Toggle() {
    val current = BiliClient.prefs.v429errorAutoRetry429
    BiliClient.prefs.v429errorAutoRetry429 = !current
    AppToast.show(this, "Error Auto Retry429: ${if (!current) "ON" else "OFF"}")
}

// v429: Error Report Auto429
internal fun PlayerActivity.showV429ErrorReportAuto429Toggle() {
    val current = BiliClient.prefs.v429errorReportAuto429
    BiliClient.prefs.v429errorReportAuto429 = !current
    AppToast.show(this, "Error Report Auto429: ${if (!current) "ON" else "OFF"}")
}

// v429: Event Auto Notify429
internal fun PlayerActivity.showV429EventAutoNotify429Toggle() {
    val current = BiliClient.prefs.v429eventAutoNotify429
    BiliClient.prefs.v429eventAutoNotify429 = !current
    AppToast.show(this, "Event Auto Notify429: ${if (!current) "ON" else "OFF"}")
}

// v429: Exit Confirmation429
internal fun PlayerActivity.showV429ExitConfirmation429Toggle() {
    val current = BiliClient.prefs.v429exitConfirmation429
    BiliClient.prefs.v429exitConfirmation429 = !current
    AppToast.show(this, "Exit Confirmation429: ${if (!current) "ON" else "OFF"}")
}

// v429: Expand On Double Tap429
internal fun PlayerActivity.showV429ExpandOnDoubleTap429Toggle() {
    val current = BiliClient.prefs.v429expandOnDoubleTap429
    BiliClient.prefs.v429expandOnDoubleTap429 = !current
    AppToast.show(this, "Expand On Double Tap429: ${if (!current) "ON" else "OFF"}")
}

// v429: Export Format Default429
internal fun PlayerActivity.showV429ExportFormatDefault429Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v429exportFormatDefault429).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default429",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v429exportFormatDefault429 = value
        AppToast.show(this, "Export Format Default429: $value")
    }
}

// v429: Extract Audio Auto429
internal fun PlayerActivity.showV429ExtractAudioAuto429Toggle() {
    val current = BiliClient.prefs.v429extractAudioAuto429
    BiliClient.prefs.v429extractAudioAuto429 = !current
    AppToast.show(this, "Extract Audio Auto429: ${if (!current) "ON" else "OFF"}")
}

// v429: Fade Transition429
internal fun PlayerActivity.showV429FadeTransition429Toggle() {
    val current = BiliClient.prefs.v429fadeTransition429
    BiliClient.prefs.v429fadeTransition429 = !current
    AppToast.show(this, "Fade Transition429: ${if (!current) "ON" else "OFF"}")
}

// v429: Feed Auto Refresh429
internal fun PlayerActivity.showV429FeedAutoRefresh429Toggle() {
    val current = BiliClient.prefs.v429feedAutoRefresh429
    BiliClient.prefs.v429feedAutoRefresh429 = !current
    AppToast.show(this, "Feed Auto Refresh429: ${if (!current) "ON" else "OFF"}")
}

// v429: Feed Layout Style429
internal fun PlayerActivity.showV429FeedLayoutStyle429Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v429feedLayoutStyle429).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style429",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v429feedLayoutStyle429 = value
        AppToast.show(this, "Feed Layout Style429: $value")
    }
}

// v429: File Auto Organize429
internal fun PlayerActivity.showV429FileAutoOrganize429Toggle() {
    val current = BiliClient.prefs.v429fileAutoOrganize429
    BiliClient.prefs.v429fileAutoOrganize429 = !current
    AppToast.show(this, "File Auto Organize429: ${if (!current) "ON" else "OFF"}")
}

// v429: Find In Page Highlight429
internal fun PlayerActivity.showV429FindInPageHighlight429Toggle() {
    val current = BiliClient.prefs.v429findInPageHighlight429
    BiliClient.prefs.v429findInPageHighlight429 = !current
    AppToast.show(this, "Find In Page Highlight429: ${if (!current) "ON" else "OFF"}")
}

// v429: Fix Corrupt Auto429
internal fun PlayerActivity.showV429FixCorruptAuto429Toggle() {
    val current = BiliClient.prefs.v429fixCorruptAuto429
    BiliClient.prefs.v429fixCorruptAuto429 = !current
    AppToast.show(this, "Fix Corrupt Auto429: ${if (!current) "ON" else "OFF"}")
}

// v430: Enter Animation430
internal fun PlayerActivity.showV430EnterAnimation430Toggle() {
    val current = BiliClient.prefs.v430enterAnimation430
    BiliClient.prefs.v430enterAnimation430 = !current
    AppToast.show(this, "Enter Animation430: ${if (!current) "ON" else "OFF"}")
}

// v430: Environment Light Sensor430
internal fun PlayerActivity.showV430EnvironmentLightSensor430Toggle() {
    val current = BiliClient.prefs.v430environmentLightSensor430
    BiliClient.prefs.v430environmentLightSensor430 = !current
    AppToast.show(this, "Environment Light Sensor430: ${if (!current) "ON" else "OFF"}")
}

// v430: Error Auto Retry430
internal fun PlayerActivity.showV430ErrorAutoRetry430Toggle() {
    val current = BiliClient.prefs.v430errorAutoRetry430
    BiliClient.prefs.v430errorAutoRetry430 = !current
    AppToast.show(this, "Error Auto Retry430: ${if (!current) "ON" else "OFF"}")
}

// v430: Error Report Auto430
internal fun PlayerActivity.showV430ErrorReportAuto430Toggle() {
    val current = BiliClient.prefs.v430errorReportAuto430
    BiliClient.prefs.v430errorReportAuto430 = !current
    AppToast.show(this, "Error Report Auto430: ${if (!current) "ON" else "OFF"}")
}

// v430: Event Auto Notify430
internal fun PlayerActivity.showV430EventAutoNotify430Toggle() {
    val current = BiliClient.prefs.v430eventAutoNotify430
    BiliClient.prefs.v430eventAutoNotify430 = !current
    AppToast.show(this, "Event Auto Notify430: ${if (!current) "ON" else "OFF"}")
}

// v430: Exit Confirmation430
internal fun PlayerActivity.showV430ExitConfirmation430Toggle() {
    val current = BiliClient.prefs.v430exitConfirmation430
    BiliClient.prefs.v430exitConfirmation430 = !current
    AppToast.show(this, "Exit Confirmation430: ${if (!current) "ON" else "OFF"}")
}

// v430: Expand On Double Tap430
internal fun PlayerActivity.showV430ExpandOnDoubleTap430Toggle() {
    val current = BiliClient.prefs.v430expandOnDoubleTap430
    BiliClient.prefs.v430expandOnDoubleTap430 = !current
    AppToast.show(this, "Expand On Double Tap430: ${if (!current) "ON" else "OFF"}")
}

// v430: Export Format Default430
internal fun PlayerActivity.showV430ExportFormatDefault430Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v430exportFormatDefault430).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default430",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v430exportFormatDefault430 = value
        AppToast.show(this, "Export Format Default430: $value")
    }
}

// v430: Extract Audio Auto430
internal fun PlayerActivity.showV430ExtractAudioAuto430Toggle() {
    val current = BiliClient.prefs.v430extractAudioAuto430
    BiliClient.prefs.v430extractAudioAuto430 = !current
    AppToast.show(this, "Extract Audio Auto430: ${if (!current) "ON" else "OFF"}")
}

// v430: Fade Transition430
internal fun PlayerActivity.showV430FadeTransition430Toggle() {
    val current = BiliClient.prefs.v430fadeTransition430
    BiliClient.prefs.v430fadeTransition430 = !current
    AppToast.show(this, "Fade Transition430: ${if (!current) "ON" else "OFF"}")
}

// v430: Feed Auto Refresh430
internal fun PlayerActivity.showV430FeedAutoRefresh430Toggle() {
    val current = BiliClient.prefs.v430feedAutoRefresh430
    BiliClient.prefs.v430feedAutoRefresh430 = !current
    AppToast.show(this, "Feed Auto Refresh430: ${if (!current) "ON" else "OFF"}")
}

// v430: Feed Layout Style430
internal fun PlayerActivity.showV430FeedLayoutStyle430Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v430feedLayoutStyle430).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style430",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v430feedLayoutStyle430 = value
        AppToast.show(this, "Feed Layout Style430: $value")
    }
}

// v430: File Auto Organize430
internal fun PlayerActivity.showV430FileAutoOrganize430Toggle() {
    val current = BiliClient.prefs.v430fileAutoOrganize430
    BiliClient.prefs.v430fileAutoOrganize430 = !current
    AppToast.show(this, "File Auto Organize430: ${if (!current) "ON" else "OFF"}")
}

// v430: Find In Page Highlight430
internal fun PlayerActivity.showV430FindInPageHighlight430Toggle() {
    val current = BiliClient.prefs.v430findInPageHighlight430
    BiliClient.prefs.v430findInPageHighlight430 = !current
    AppToast.show(this, "Find In Page Highlight430: ${if (!current) "ON" else "OFF"}")
}

// v430: Fix Corrupt Auto430
internal fun PlayerActivity.showV430FixCorruptAuto430Toggle() {
    val current = BiliClient.prefs.v430fixCorruptAuto430
    BiliClient.prefs.v430fixCorruptAuto430 = !current
    AppToast.show(this, "Fix Corrupt Auto430: ${if (!current) "ON" else "OFF"}")
}

// v431: Flash Screen On Notify431
internal fun PlayerActivity.showV431FlashScreenOnNotify431Toggle() {
    val current = BiliClient.prefs.v431flashScreenOnNotify431
    BiliClient.prefs.v431flashScreenOnNotify431 = !current
    AppToast.show(this, "Flash Screen On Notify431: ${if (!current) "ON" else "OFF"}")
}

// v431: Flex Layout Enabled431
internal fun PlayerActivity.showV431FlexLayoutEnabled431Toggle() {
    val current = BiliClient.prefs.v431flexLayoutEnabled431
    BiliClient.prefs.v431flexLayoutEnabled431 = !current
    AppToast.show(this, "Flex Layout Enabled431: ${if (!current) "ON" else "OFF"}")
}

// v431: Flip Gesture Enabled431
internal fun PlayerActivity.showV431FlipGestureEnabled431Toggle() {
    val current = BiliClient.prefs.v431flipGestureEnabled431
    BiliClient.prefs.v431flipGestureEnabled431 = !current
    AppToast.show(this, "Flip Gesture Enabled431: ${if (!current) "ON" else "OFF"}")
}

// v431: Flow Auto Redirect431
internal fun PlayerActivity.showV431FlowAutoRedirect431Toggle() {
    val current = BiliClient.prefs.v431flowAutoRedirect431
    BiliClient.prefs.v431flowAutoRedirect431 = !current
    AppToast.show(this, "Flow Auto Redirect431: ${if (!current) "ON" else "OFF"}")
}

// v431: Fly Mode Speed431
internal fun PlayerActivity.showV431FlyModeSpeed431Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v431flyModeSpeed431).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed431",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v431flyModeSpeed431 = value
        AppToast.show(this, "Fly Mode Speed431: $value")
    }
}

// v431: Focus Auto Enhance431
internal fun PlayerActivity.showV431FocusAutoEnhance431Toggle() {
    val current = BiliClient.prefs.v431focusAutoEnhance431
    BiliClient.prefs.v431focusAutoEnhance431 = !current
    AppToast.show(this, "Focus Auto Enhance431: ${if (!current) "ON" else "OFF"}")
}

// v431: Follow Auto Subscribe431
internal fun PlayerActivity.showV431FollowAutoSubscribe431Toggle() {
    val current = BiliClient.prefs.v431followAutoSubscribe431
    BiliClient.prefs.v431followAutoSubscribe431 = !current
    AppToast.show(this, "Follow Auto Subscribe431: ${if (!current) "ON" else "OFF"}")
}

// v431: Force Decode HW431
internal fun PlayerActivity.showV431ForceDecodeHw431Toggle() {
    val current = BiliClient.prefs.v431forceDecodeHw431
    BiliClient.prefs.v431forceDecodeHw431 = !current
    AppToast.show(this, "Force Decode HW431: ${if (!current) "ON" else "OFF"}")
}

// v431: Format Auto Convert431
internal fun PlayerActivity.showV431FormatAutoConvert431Toggle() {
    val current = BiliClient.prefs.v431formatAutoConvert431
    BiliClient.prefs.v431formatAutoConvert431 = !current
    AppToast.show(this, "Format Auto Convert431: ${if (!current) "ON" else "OFF"}")
}

// v431: Frame Interpolation431
internal fun PlayerActivity.showV431FrameInterpolation431Toggle() {
    val current = BiliClient.prefs.v431frameInterpolation431
    BiliClient.prefs.v431frameInterpolation431 = !current
    AppToast.show(this, "Frame Interpolation431: ${if (!current) "ON" else "OFF"}")
}

// v431: Free Memory Auto431
internal fun PlayerActivity.showV431FreeMemoryAuto431Toggle() {
    val current = BiliClient.prefs.v431freeMemoryAuto431
    BiliClient.prefs.v431freeMemoryAuto431 = !current
    AppToast.show(this, "Free Memory Auto431: ${if (!current) "ON" else "OFF"}")
}

// v431: Freeze On Buffering431
internal fun PlayerActivity.showV431FreezeOnBuffering431Toggle() {
    val current = BiliClient.prefs.v431freezeOnBuffering431
    BiliClient.prefs.v431freezeOnBuffering431 = !current
    AppToast.show(this, "Freeze On Buffering431: ${if (!current) "ON" else "OFF"}")
}

// v431: Fullscreen Auto Rotate431
internal fun PlayerActivity.showV431FullscreenAutoRotate431Toggle() {
    val current = BiliClient.prefs.v431fullscreenAutoRotate431
    BiliClient.prefs.v431fullscreenAutoRotate431 = !current
    AppToast.show(this, "Fullscreen Auto Rotate431: ${if (!current) "ON" else "OFF"}")
}

// v431: Gain Auto Balance431
internal fun PlayerActivity.showV431GainAutoBalance431Toggle() {
    val current = BiliClient.prefs.v431gainAutoBalance431
    BiliClient.prefs.v431gainAutoBalance431 = !current
    AppToast.show(this, "Gain Auto Balance431: ${if (!current) "ON" else "OFF"}")
}

// v431: Gallery Auto Layout431
internal fun PlayerActivity.showV431GalleryAutoLayout431Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v431galleryAutoLayout431).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout431",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v431galleryAutoLayout431 = value
        AppToast.show(this, "Gallery Auto Layout431: $value")
    }
}

// v432: Flash Screen On Notify432
internal fun PlayerActivity.showV432FlashScreenOnNotify432Toggle() {
    val current = BiliClient.prefs.v432flashScreenOnNotify432
    BiliClient.prefs.v432flashScreenOnNotify432 = !current
    AppToast.show(this, "Flash Screen On Notify432: ${if (!current) "ON" else "OFF"}")
}

// v432: Flex Layout Enabled432
internal fun PlayerActivity.showV432FlexLayoutEnabled432Toggle() {
    val current = BiliClient.prefs.v432flexLayoutEnabled432
    BiliClient.prefs.v432flexLayoutEnabled432 = !current
    AppToast.show(this, "Flex Layout Enabled432: ${if (!current) "ON" else "OFF"}")
}

// v432: Flip Gesture Enabled432
internal fun PlayerActivity.showV432FlipGestureEnabled432Toggle() {
    val current = BiliClient.prefs.v432flipGestureEnabled432
    BiliClient.prefs.v432flipGestureEnabled432 = !current
    AppToast.show(this, "Flip Gesture Enabled432: ${if (!current) "ON" else "OFF"}")
}

// v432: Flow Auto Redirect432
internal fun PlayerActivity.showV432FlowAutoRedirect432Toggle() {
    val current = BiliClient.prefs.v432flowAutoRedirect432
    BiliClient.prefs.v432flowAutoRedirect432 = !current
    AppToast.show(this, "Flow Auto Redirect432: ${if (!current) "ON" else "OFF"}")
}

// v432: Fly Mode Speed432
internal fun PlayerActivity.showV432FlyModeSpeed432Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v432flyModeSpeed432).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed432",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v432flyModeSpeed432 = value
        AppToast.show(this, "Fly Mode Speed432: $value")
    }
}

// v432: Focus Auto Enhance432
internal fun PlayerActivity.showV432FocusAutoEnhance432Toggle() {
    val current = BiliClient.prefs.v432focusAutoEnhance432
    BiliClient.prefs.v432focusAutoEnhance432 = !current
    AppToast.show(this, "Focus Auto Enhance432: ${if (!current) "ON" else "OFF"}")
}

// v432: Follow Auto Subscribe432
internal fun PlayerActivity.showV432FollowAutoSubscribe432Toggle() {
    val current = BiliClient.prefs.v432followAutoSubscribe432
    BiliClient.prefs.v432followAutoSubscribe432 = !current
    AppToast.show(this, "Follow Auto Subscribe432: ${if (!current) "ON" else "OFF"}")
}

// v432: Force Decode HW432
internal fun PlayerActivity.showV432ForceDecodeHw432Toggle() {
    val current = BiliClient.prefs.v432forceDecodeHw432
    BiliClient.prefs.v432forceDecodeHw432 = !current
    AppToast.show(this, "Force Decode HW432: ${if (!current) "ON" else "OFF"}")
}

// v432: Format Auto Convert432
internal fun PlayerActivity.showV432FormatAutoConvert432Toggle() {
    val current = BiliClient.prefs.v432formatAutoConvert432
    BiliClient.prefs.v432formatAutoConvert432 = !current
    AppToast.show(this, "Format Auto Convert432: ${if (!current) "ON" else "OFF"}")
}

// v432: Frame Interpolation432
internal fun PlayerActivity.showV432FrameInterpolation432Toggle() {
    val current = BiliClient.prefs.v432frameInterpolation432
    BiliClient.prefs.v432frameInterpolation432 = !current
    AppToast.show(this, "Frame Interpolation432: ${if (!current) "ON" else "OFF"}")
}

// v432: Free Memory Auto432
internal fun PlayerActivity.showV432FreeMemoryAuto432Toggle() {
    val current = BiliClient.prefs.v432freeMemoryAuto432
    BiliClient.prefs.v432freeMemoryAuto432 = !current
    AppToast.show(this, "Free Memory Auto432: ${if (!current) "ON" else "OFF"}")
}

// v432: Freeze On Buffering432
internal fun PlayerActivity.showV432FreezeOnBuffering432Toggle() {
    val current = BiliClient.prefs.v432freezeOnBuffering432
    BiliClient.prefs.v432freezeOnBuffering432 = !current
    AppToast.show(this, "Freeze On Buffering432: ${if (!current) "ON" else "OFF"}")
}

// v432: Fullscreen Auto Rotate432
internal fun PlayerActivity.showV432FullscreenAutoRotate432Toggle() {
    val current = BiliClient.prefs.v432fullscreenAutoRotate432
    BiliClient.prefs.v432fullscreenAutoRotate432 = !current
    AppToast.show(this, "Fullscreen Auto Rotate432: ${if (!current) "ON" else "OFF"}")
}

// v432: Gain Auto Balance432
internal fun PlayerActivity.showV432GainAutoBalance432Toggle() {
    val current = BiliClient.prefs.v432gainAutoBalance432
    BiliClient.prefs.v432gainAutoBalance432 = !current
    AppToast.show(this, "Gain Auto Balance432: ${if (!current) "ON" else "OFF"}")
}

// v432: Gallery Auto Layout432
internal fun PlayerActivity.showV432GalleryAutoLayout432Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v432galleryAutoLayout432).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout432",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v432galleryAutoLayout432 = value
        AppToast.show(this, "Gallery Auto Layout432: $value")
    }
}

// v433: Flash Screen On Notify433
internal fun PlayerActivity.showV433FlashScreenOnNotify433Toggle() {
    val current = BiliClient.prefs.v433flashScreenOnNotify433
    BiliClient.prefs.v433flashScreenOnNotify433 = !current
    AppToast.show(this, "Flash Screen On Notify433: ${if (!current) "ON" else "OFF"}")
}

// v433: Flex Layout Enabled433
internal fun PlayerActivity.showV433FlexLayoutEnabled433Toggle() {
    val current = BiliClient.prefs.v433flexLayoutEnabled433
    BiliClient.prefs.v433flexLayoutEnabled433 = !current
    AppToast.show(this, "Flex Layout Enabled433: ${if (!current) "ON" else "OFF"}")
}

// v433: Flip Gesture Enabled433
internal fun PlayerActivity.showV433FlipGestureEnabled433Toggle() {
    val current = BiliClient.prefs.v433flipGestureEnabled433
    BiliClient.prefs.v433flipGestureEnabled433 = !current
    AppToast.show(this, "Flip Gesture Enabled433: ${if (!current) "ON" else "OFF"}")
}

// v433: Flow Auto Redirect433
internal fun PlayerActivity.showV433FlowAutoRedirect433Toggle() {
    val current = BiliClient.prefs.v433flowAutoRedirect433
    BiliClient.prefs.v433flowAutoRedirect433 = !current
    AppToast.show(this, "Flow Auto Redirect433: ${if (!current) "ON" else "OFF"}")
}

// v433: Fly Mode Speed433
internal fun PlayerActivity.showV433FlyModeSpeed433Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v433flyModeSpeed433).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed433",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v433flyModeSpeed433 = value
        AppToast.show(this, "Fly Mode Speed433: $value")
    }
}

// v433: Focus Auto Enhance433
internal fun PlayerActivity.showV433FocusAutoEnhance433Toggle() {
    val current = BiliClient.prefs.v433focusAutoEnhance433
    BiliClient.prefs.v433focusAutoEnhance433 = !current
    AppToast.show(this, "Focus Auto Enhance433: ${if (!current) "ON" else "OFF"}")
}

// v433: Follow Auto Subscribe433
internal fun PlayerActivity.showV433FollowAutoSubscribe433Toggle() {
    val current = BiliClient.prefs.v433followAutoSubscribe433
    BiliClient.prefs.v433followAutoSubscribe433 = !current
    AppToast.show(this, "Follow Auto Subscribe433: ${if (!current) "ON" else "OFF"}")
}

// v433: Force Decode HW433
internal fun PlayerActivity.showV433ForceDecodeHw433Toggle() {
    val current = BiliClient.prefs.v433forceDecodeHw433
    BiliClient.prefs.v433forceDecodeHw433 = !current
    AppToast.show(this, "Force Decode HW433: ${if (!current) "ON" else "OFF"}")
}

// v433: Format Auto Convert433
internal fun PlayerActivity.showV433FormatAutoConvert433Toggle() {
    val current = BiliClient.prefs.v433formatAutoConvert433
    BiliClient.prefs.v433formatAutoConvert433 = !current
    AppToast.show(this, "Format Auto Convert433: ${if (!current) "ON" else "OFF"}")
}

// v433: Frame Interpolation433
internal fun PlayerActivity.showV433FrameInterpolation433Toggle() {
    val current = BiliClient.prefs.v433frameInterpolation433
    BiliClient.prefs.v433frameInterpolation433 = !current
    AppToast.show(this, "Frame Interpolation433: ${if (!current) "ON" else "OFF"}")
}

// v433: Free Memory Auto433
internal fun PlayerActivity.showV433FreeMemoryAuto433Toggle() {
    val current = BiliClient.prefs.v433freeMemoryAuto433
    BiliClient.prefs.v433freeMemoryAuto433 = !current
    AppToast.show(this, "Free Memory Auto433: ${if (!current) "ON" else "OFF"}")
}

// v433: Freeze On Buffering433
internal fun PlayerActivity.showV433FreezeOnBuffering433Toggle() {
    val current = BiliClient.prefs.v433freezeOnBuffering433
    BiliClient.prefs.v433freezeOnBuffering433 = !current
    AppToast.show(this, "Freeze On Buffering433: ${if (!current) "ON" else "OFF"}")
}

// v433: Fullscreen Auto Rotate433
internal fun PlayerActivity.showV433FullscreenAutoRotate433Toggle() {
    val current = BiliClient.prefs.v433fullscreenAutoRotate433
    BiliClient.prefs.v433fullscreenAutoRotate433 = !current
    AppToast.show(this, "Fullscreen Auto Rotate433: ${if (!current) "ON" else "OFF"}")
}

// v433: Gain Auto Balance433
internal fun PlayerActivity.showV433GainAutoBalance433Toggle() {
    val current = BiliClient.prefs.v433gainAutoBalance433
    BiliClient.prefs.v433gainAutoBalance433 = !current
    AppToast.show(this, "Gain Auto Balance433: ${if (!current) "ON" else "OFF"}")
}

// v433: Gallery Auto Layout433
internal fun PlayerActivity.showV433GalleryAutoLayout433Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v433galleryAutoLayout433).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout433",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v433galleryAutoLayout433 = value
        AppToast.show(this, "Gallery Auto Layout433: $value")
    }
}

// v434: Flash Screen On Notify434
internal fun PlayerActivity.showV434FlashScreenOnNotify434Toggle() {
    val current = BiliClient.prefs.v434flashScreenOnNotify434
    BiliClient.prefs.v434flashScreenOnNotify434 = !current
    AppToast.show(this, "Flash Screen On Notify434: ${if (!current) "ON" else "OFF"}")
}

// v434: Flex Layout Enabled434
internal fun PlayerActivity.showV434FlexLayoutEnabled434Toggle() {
    val current = BiliClient.prefs.v434flexLayoutEnabled434
    BiliClient.prefs.v434flexLayoutEnabled434 = !current
    AppToast.show(this, "Flex Layout Enabled434: ${if (!current) "ON" else "OFF"}")
}

// v434: Flip Gesture Enabled434
internal fun PlayerActivity.showV434FlipGestureEnabled434Toggle() {
    val current = BiliClient.prefs.v434flipGestureEnabled434
    BiliClient.prefs.v434flipGestureEnabled434 = !current
    AppToast.show(this, "Flip Gesture Enabled434: ${if (!current) "ON" else "OFF"}")
}

// v434: Flow Auto Redirect434
internal fun PlayerActivity.showV434FlowAutoRedirect434Toggle() {
    val current = BiliClient.prefs.v434flowAutoRedirect434
    BiliClient.prefs.v434flowAutoRedirect434 = !current
    AppToast.show(this, "Flow Auto Redirect434: ${if (!current) "ON" else "OFF"}")
}

// v434: Fly Mode Speed434
internal fun PlayerActivity.showV434FlyModeSpeed434Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v434flyModeSpeed434).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed434",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v434flyModeSpeed434 = value
        AppToast.show(this, "Fly Mode Speed434: $value")
    }
}

// v434: Focus Auto Enhance434
internal fun PlayerActivity.showV434FocusAutoEnhance434Toggle() {
    val current = BiliClient.prefs.v434focusAutoEnhance434
    BiliClient.prefs.v434focusAutoEnhance434 = !current
    AppToast.show(this, "Focus Auto Enhance434: ${if (!current) "ON" else "OFF"}")
}

// v434: Follow Auto Subscribe434
internal fun PlayerActivity.showV434FollowAutoSubscribe434Toggle() {
    val current = BiliClient.prefs.v434followAutoSubscribe434
    BiliClient.prefs.v434followAutoSubscribe434 = !current
    AppToast.show(this, "Follow Auto Subscribe434: ${if (!current) "ON" else "OFF"}")
}

// v434: Force Decode HW434
internal fun PlayerActivity.showV434ForceDecodeHw434Toggle() {
    val current = BiliClient.prefs.v434forceDecodeHw434
    BiliClient.prefs.v434forceDecodeHw434 = !current
    AppToast.show(this, "Force Decode HW434: ${if (!current) "ON" else "OFF"}")
}

// v434: Format Auto Convert434
internal fun PlayerActivity.showV434FormatAutoConvert434Toggle() {
    val current = BiliClient.prefs.v434formatAutoConvert434
    BiliClient.prefs.v434formatAutoConvert434 = !current
    AppToast.show(this, "Format Auto Convert434: ${if (!current) "ON" else "OFF"}")
}

// v434: Frame Interpolation434
internal fun PlayerActivity.showV434FrameInterpolation434Toggle() {
    val current = BiliClient.prefs.v434frameInterpolation434
    BiliClient.prefs.v434frameInterpolation434 = !current
    AppToast.show(this, "Frame Interpolation434: ${if (!current) "ON" else "OFF"}")
}

// v434: Free Memory Auto434
internal fun PlayerActivity.showV434FreeMemoryAuto434Toggle() {
    val current = BiliClient.prefs.v434freeMemoryAuto434
    BiliClient.prefs.v434freeMemoryAuto434 = !current
    AppToast.show(this, "Free Memory Auto434: ${if (!current) "ON" else "OFF"}")
}

// v434: Freeze On Buffering434
internal fun PlayerActivity.showV434FreezeOnBuffering434Toggle() {
    val current = BiliClient.prefs.v434freezeOnBuffering434
    BiliClient.prefs.v434freezeOnBuffering434 = !current
    AppToast.show(this, "Freeze On Buffering434: ${if (!current) "ON" else "OFF"}")
}

// v434: Fullscreen Auto Rotate434
internal fun PlayerActivity.showV434FullscreenAutoRotate434Toggle() {
    val current = BiliClient.prefs.v434fullscreenAutoRotate434
    BiliClient.prefs.v434fullscreenAutoRotate434 = !current
    AppToast.show(this, "Fullscreen Auto Rotate434: ${if (!current) "ON" else "OFF"}")
}

// v434: Gain Auto Balance434
internal fun PlayerActivity.showV434GainAutoBalance434Toggle() {
    val current = BiliClient.prefs.v434gainAutoBalance434
    BiliClient.prefs.v434gainAutoBalance434 = !current
    AppToast.show(this, "Gain Auto Balance434: ${if (!current) "ON" else "OFF"}")
}

// v434: Gallery Auto Layout434
internal fun PlayerActivity.showV434GalleryAutoLayout434Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v434galleryAutoLayout434).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout434",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v434galleryAutoLayout434 = value
        AppToast.show(this, "Gallery Auto Layout434: $value")
    }
}

// v435: Flash Screen On Notify435
internal fun PlayerActivity.showV435FlashScreenOnNotify435Toggle() {
    val current = BiliClient.prefs.v435flashScreenOnNotify435
    BiliClient.prefs.v435flashScreenOnNotify435 = !current
    AppToast.show(this, "Flash Screen On Notify435: ${if (!current) "ON" else "OFF"}")
}

// v435: Flex Layout Enabled435
internal fun PlayerActivity.showV435FlexLayoutEnabled435Toggle() {
    val current = BiliClient.prefs.v435flexLayoutEnabled435
    BiliClient.prefs.v435flexLayoutEnabled435 = !current
    AppToast.show(this, "Flex Layout Enabled435: ${if (!current) "ON" else "OFF"}")
}

// v435: Flip Gesture Enabled435
internal fun PlayerActivity.showV435FlipGestureEnabled435Toggle() {
    val current = BiliClient.prefs.v435flipGestureEnabled435
    BiliClient.prefs.v435flipGestureEnabled435 = !current
    AppToast.show(this, "Flip Gesture Enabled435: ${if (!current) "ON" else "OFF"}")
}

// v435: Flow Auto Redirect435
internal fun PlayerActivity.showV435FlowAutoRedirect435Toggle() {
    val current = BiliClient.prefs.v435flowAutoRedirect435
    BiliClient.prefs.v435flowAutoRedirect435 = !current
    AppToast.show(this, "Flow Auto Redirect435: ${if (!current) "ON" else "OFF"}")
}

// v435: Fly Mode Speed435
internal fun PlayerActivity.showV435FlyModeSpeed435Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v435flyModeSpeed435).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed435",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v435flyModeSpeed435 = value
        AppToast.show(this, "Fly Mode Speed435: $value")
    }
}

// v435: Focus Auto Enhance435
internal fun PlayerActivity.showV435FocusAutoEnhance435Toggle() {
    val current = BiliClient.prefs.v435focusAutoEnhance435
    BiliClient.prefs.v435focusAutoEnhance435 = !current
    AppToast.show(this, "Focus Auto Enhance435: ${if (!current) "ON" else "OFF"}")
}

// v435: Follow Auto Subscribe435
internal fun PlayerActivity.showV435FollowAutoSubscribe435Toggle() {
    val current = BiliClient.prefs.v435followAutoSubscribe435
    BiliClient.prefs.v435followAutoSubscribe435 = !current
    AppToast.show(this, "Follow Auto Subscribe435: ${if (!current) "ON" else "OFF"}")
}

// v435: Force Decode HW435
internal fun PlayerActivity.showV435ForceDecodeHw435Toggle() {
    val current = BiliClient.prefs.v435forceDecodeHw435
    BiliClient.prefs.v435forceDecodeHw435 = !current
    AppToast.show(this, "Force Decode HW435: ${if (!current) "ON" else "OFF"}")
}

// v435: Format Auto Convert435
internal fun PlayerActivity.showV435FormatAutoConvert435Toggle() {
    val current = BiliClient.prefs.v435formatAutoConvert435
    BiliClient.prefs.v435formatAutoConvert435 = !current
    AppToast.show(this, "Format Auto Convert435: ${if (!current) "ON" else "OFF"}")
}

// v435: Frame Interpolation435
internal fun PlayerActivity.showV435FrameInterpolation435Toggle() {
    val current = BiliClient.prefs.v435frameInterpolation435
    BiliClient.prefs.v435frameInterpolation435 = !current
    AppToast.show(this, "Frame Interpolation435: ${if (!current) "ON" else "OFF"}")
}

// v435: Free Memory Auto435
internal fun PlayerActivity.showV435FreeMemoryAuto435Toggle() {
    val current = BiliClient.prefs.v435freeMemoryAuto435
    BiliClient.prefs.v435freeMemoryAuto435 = !current
    AppToast.show(this, "Free Memory Auto435: ${if (!current) "ON" else "OFF"}")
}

// v435: Freeze On Buffering435
internal fun PlayerActivity.showV435FreezeOnBuffering435Toggle() {
    val current = BiliClient.prefs.v435freezeOnBuffering435
    BiliClient.prefs.v435freezeOnBuffering435 = !current
    AppToast.show(this, "Freeze On Buffering435: ${if (!current) "ON" else "OFF"}")
}

// v435: Fullscreen Auto Rotate435
internal fun PlayerActivity.showV435FullscreenAutoRotate435Toggle() {
    val current = BiliClient.prefs.v435fullscreenAutoRotate435
    BiliClient.prefs.v435fullscreenAutoRotate435 = !current
    AppToast.show(this, "Fullscreen Auto Rotate435: ${if (!current) "ON" else "OFF"}")
}

// v435: Gain Auto Balance435
internal fun PlayerActivity.showV435GainAutoBalance435Toggle() {
    val current = BiliClient.prefs.v435gainAutoBalance435
    BiliClient.prefs.v435gainAutoBalance435 = !current
    AppToast.show(this, "Gain Auto Balance435: ${if (!current) "ON" else "OFF"}")
}

// v435: Gallery Auto Layout435
internal fun PlayerActivity.showV435GalleryAutoLayout435Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v435galleryAutoLayout435).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout435",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v435galleryAutoLayout435 = value
        AppToast.show(this, "Gallery Auto Layout435: $value")
    }
}

// v436: Flash Screen On Notify436
internal fun PlayerActivity.showV436FlashScreenOnNotify436Toggle() {
    val current = BiliClient.prefs.v436flashScreenOnNotify436
    BiliClient.prefs.v436flashScreenOnNotify436 = !current
    AppToast.show(this, "Flash Screen On Notify436: ${if (!current) "ON" else "OFF"}")
}

// v436: Flex Layout Enabled436
internal fun PlayerActivity.showV436FlexLayoutEnabled436Toggle() {
    val current = BiliClient.prefs.v436flexLayoutEnabled436
    BiliClient.prefs.v436flexLayoutEnabled436 = !current
    AppToast.show(this, "Flex Layout Enabled436: ${if (!current) "ON" else "OFF"}")
}

// v436: Flip Gesture Enabled436
internal fun PlayerActivity.showV436FlipGestureEnabled436Toggle() {
    val current = BiliClient.prefs.v436flipGestureEnabled436
    BiliClient.prefs.v436flipGestureEnabled436 = !current
    AppToast.show(this, "Flip Gesture Enabled436: ${if (!current) "ON" else "OFF"}")
}

// v436: Flow Auto Redirect436
internal fun PlayerActivity.showV436FlowAutoRedirect436Toggle() {
    val current = BiliClient.prefs.v436flowAutoRedirect436
    BiliClient.prefs.v436flowAutoRedirect436 = !current
    AppToast.show(this, "Flow Auto Redirect436: ${if (!current) "ON" else "OFF"}")
}

// v436: Fly Mode Speed436
internal fun PlayerActivity.showV436FlyModeSpeed436Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v436flyModeSpeed436).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed436",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v436flyModeSpeed436 = value
        AppToast.show(this, "Fly Mode Speed436: $value")
    }
}

// v436: Focus Auto Enhance436
internal fun PlayerActivity.showV436FocusAutoEnhance436Toggle() {
    val current = BiliClient.prefs.v436focusAutoEnhance436
    BiliClient.prefs.v436focusAutoEnhance436 = !current
    AppToast.show(this, "Focus Auto Enhance436: ${if (!current) "ON" else "OFF"}")
}

// v436: Follow Auto Subscribe436
internal fun PlayerActivity.showV436FollowAutoSubscribe436Toggle() {
    val current = BiliClient.prefs.v436followAutoSubscribe436
    BiliClient.prefs.v436followAutoSubscribe436 = !current
    AppToast.show(this, "Follow Auto Subscribe436: ${if (!current) "ON" else "OFF"}")
}

// v436: Force Decode HW436
internal fun PlayerActivity.showV436ForceDecodeHw436Toggle() {
    val current = BiliClient.prefs.v436forceDecodeHw436
    BiliClient.prefs.v436forceDecodeHw436 = !current
    AppToast.show(this, "Force Decode HW436: ${if (!current) "ON" else "OFF"}")
}

// v436: Format Auto Convert436
internal fun PlayerActivity.showV436FormatAutoConvert436Toggle() {
    val current = BiliClient.prefs.v436formatAutoConvert436
    BiliClient.prefs.v436formatAutoConvert436 = !current
    AppToast.show(this, "Format Auto Convert436: ${if (!current) "ON" else "OFF"}")
}

// v436: Frame Interpolation436
internal fun PlayerActivity.showV436FrameInterpolation436Toggle() {
    val current = BiliClient.prefs.v436frameInterpolation436
    BiliClient.prefs.v436frameInterpolation436 = !current
    AppToast.show(this, "Frame Interpolation436: ${if (!current) "ON" else "OFF"}")
}

// v436: Free Memory Auto436
internal fun PlayerActivity.showV436FreeMemoryAuto436Toggle() {
    val current = BiliClient.prefs.v436freeMemoryAuto436
    BiliClient.prefs.v436freeMemoryAuto436 = !current
    AppToast.show(this, "Free Memory Auto436: ${if (!current) "ON" else "OFF"}")
}

// v436: Freeze On Buffering436
internal fun PlayerActivity.showV436FreezeOnBuffering436Toggle() {
    val current = BiliClient.prefs.v436freezeOnBuffering436
    BiliClient.prefs.v436freezeOnBuffering436 = !current
    AppToast.show(this, "Freeze On Buffering436: ${if (!current) "ON" else "OFF"}")
}

// v436: Fullscreen Auto Rotate436
internal fun PlayerActivity.showV436FullscreenAutoRotate436Toggle() {
    val current = BiliClient.prefs.v436fullscreenAutoRotate436
    BiliClient.prefs.v436fullscreenAutoRotate436 = !current
    AppToast.show(this, "Fullscreen Auto Rotate436: ${if (!current) "ON" else "OFF"}")
}

// v436: Gain Auto Balance436
internal fun PlayerActivity.showV436GainAutoBalance436Toggle() {
    val current = BiliClient.prefs.v436gainAutoBalance436
    BiliClient.prefs.v436gainAutoBalance436 = !current
    AppToast.show(this, "Gain Auto Balance436: ${if (!current) "ON" else "OFF"}")
}

// v436: Gallery Auto Layout436
internal fun PlayerActivity.showV436GalleryAutoLayout436Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v436galleryAutoLayout436).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout436",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v436galleryAutoLayout436 = value
        AppToast.show(this, "Gallery Auto Layout436: $value")
    }
}

// v437: Flash Screen On Notify437
internal fun PlayerActivity.showV437FlashScreenOnNotify437Toggle() {
    val current = BiliClient.prefs.v437flashScreenOnNotify437
    BiliClient.prefs.v437flashScreenOnNotify437 = !current
    AppToast.show(this, "Flash Screen On Notify437: ${if (!current) "ON" else "OFF"}")
}

// v437: Flex Layout Enabled437
internal fun PlayerActivity.showV437FlexLayoutEnabled437Toggle() {
    val current = BiliClient.prefs.v437flexLayoutEnabled437
    BiliClient.prefs.v437flexLayoutEnabled437 = !current
    AppToast.show(this, "Flex Layout Enabled437: ${if (!current) "ON" else "OFF"}")
}

// v437: Flip Gesture Enabled437
internal fun PlayerActivity.showV437FlipGestureEnabled437Toggle() {
    val current = BiliClient.prefs.v437flipGestureEnabled437
    BiliClient.prefs.v437flipGestureEnabled437 = !current
    AppToast.show(this, "Flip Gesture Enabled437: ${if (!current) "ON" else "OFF"}")
}

// v437: Flow Auto Redirect437
internal fun PlayerActivity.showV437FlowAutoRedirect437Toggle() {
    val current = BiliClient.prefs.v437flowAutoRedirect437
    BiliClient.prefs.v437flowAutoRedirect437 = !current
    AppToast.show(this, "Flow Auto Redirect437: ${if (!current) "ON" else "OFF"}")
}

// v437: Fly Mode Speed437
internal fun PlayerActivity.showV437FlyModeSpeed437Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v437flyModeSpeed437).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed437",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v437flyModeSpeed437 = value
        AppToast.show(this, "Fly Mode Speed437: $value")
    }
}

// v437: Focus Auto Enhance437
internal fun PlayerActivity.showV437FocusAutoEnhance437Toggle() {
    val current = BiliClient.prefs.v437focusAutoEnhance437
    BiliClient.prefs.v437focusAutoEnhance437 = !current
    AppToast.show(this, "Focus Auto Enhance437: ${if (!current) "ON" else "OFF"}")
}

// v437: Follow Auto Subscribe437
internal fun PlayerActivity.showV437FollowAutoSubscribe437Toggle() {
    val current = BiliClient.prefs.v437followAutoSubscribe437
    BiliClient.prefs.v437followAutoSubscribe437 = !current
    AppToast.show(this, "Follow Auto Subscribe437: ${if (!current) "ON" else "OFF"}")
}

// v437: Force Decode HW437
internal fun PlayerActivity.showV437ForceDecodeHw437Toggle() {
    val current = BiliClient.prefs.v437forceDecodeHw437
    BiliClient.prefs.v437forceDecodeHw437 = !current
    AppToast.show(this, "Force Decode HW437: ${if (!current) "ON" else "OFF"}")
}

// v437: Format Auto Convert437
internal fun PlayerActivity.showV437FormatAutoConvert437Toggle() {
    val current = BiliClient.prefs.v437formatAutoConvert437
    BiliClient.prefs.v437formatAutoConvert437 = !current
    AppToast.show(this, "Format Auto Convert437: ${if (!current) "ON" else "OFF"}")
}

// v437: Frame Interpolation437
internal fun PlayerActivity.showV437FrameInterpolation437Toggle() {
    val current = BiliClient.prefs.v437frameInterpolation437
    BiliClient.prefs.v437frameInterpolation437 = !current
    AppToast.show(this, "Frame Interpolation437: ${if (!current) "ON" else "OFF"}")
}

// v437: Free Memory Auto437
internal fun PlayerActivity.showV437FreeMemoryAuto437Toggle() {
    val current = BiliClient.prefs.v437freeMemoryAuto437
    BiliClient.prefs.v437freeMemoryAuto437 = !current
    AppToast.show(this, "Free Memory Auto437: ${if (!current) "ON" else "OFF"}")
}

// v437: Freeze On Buffering437
internal fun PlayerActivity.showV437FreezeOnBuffering437Toggle() {
    val current = BiliClient.prefs.v437freezeOnBuffering437
    BiliClient.prefs.v437freezeOnBuffering437 = !current
    AppToast.show(this, "Freeze On Buffering437: ${if (!current) "ON" else "OFF"}")
}

// v437: Fullscreen Auto Rotate437
internal fun PlayerActivity.showV437FullscreenAutoRotate437Toggle() {
    val current = BiliClient.prefs.v437fullscreenAutoRotate437
    BiliClient.prefs.v437fullscreenAutoRotate437 = !current
    AppToast.show(this, "Fullscreen Auto Rotate437: ${if (!current) "ON" else "OFF"}")
}

// v437: Gain Auto Balance437
internal fun PlayerActivity.showV437GainAutoBalance437Toggle() {
    val current = BiliClient.prefs.v437gainAutoBalance437
    BiliClient.prefs.v437gainAutoBalance437 = !current
    AppToast.show(this, "Gain Auto Balance437: ${if (!current) "ON" else "OFF"}")
}

// v437: Gallery Auto Layout437
internal fun PlayerActivity.showV437GalleryAutoLayout437Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v437galleryAutoLayout437).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout437",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v437galleryAutoLayout437 = value
        AppToast.show(this, "Gallery Auto Layout437: $value")
    }
}

// v438: Flash Screen On Notify438
internal fun PlayerActivity.showV438FlashScreenOnNotify438Toggle() {
    val current = BiliClient.prefs.v438flashScreenOnNotify438
    BiliClient.prefs.v438flashScreenOnNotify438 = !current
    AppToast.show(this, "Flash Screen On Notify438: ${if (!current) "ON" else "OFF"}")
}

// v438: Flex Layout Enabled438
internal fun PlayerActivity.showV438FlexLayoutEnabled438Toggle() {
    val current = BiliClient.prefs.v438flexLayoutEnabled438
    BiliClient.prefs.v438flexLayoutEnabled438 = !current
    AppToast.show(this, "Flex Layout Enabled438: ${if (!current) "ON" else "OFF"}")
}

// v438: Flip Gesture Enabled438
internal fun PlayerActivity.showV438FlipGestureEnabled438Toggle() {
    val current = BiliClient.prefs.v438flipGestureEnabled438
    BiliClient.prefs.v438flipGestureEnabled438 = !current
    AppToast.show(this, "Flip Gesture Enabled438: ${if (!current) "ON" else "OFF"}")
}

// v438: Flow Auto Redirect438
internal fun PlayerActivity.showV438FlowAutoRedirect438Toggle() {
    val current = BiliClient.prefs.v438flowAutoRedirect438
    BiliClient.prefs.v438flowAutoRedirect438 = !current
    AppToast.show(this, "Flow Auto Redirect438: ${if (!current) "ON" else "OFF"}")
}

// v438: Fly Mode Speed438
internal fun PlayerActivity.showV438FlyModeSpeed438Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v438flyModeSpeed438).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed438",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v438flyModeSpeed438 = value
        AppToast.show(this, "Fly Mode Speed438: $value")
    }
}

// v438: Focus Auto Enhance438
internal fun PlayerActivity.showV438FocusAutoEnhance438Toggle() {
    val current = BiliClient.prefs.v438focusAutoEnhance438
    BiliClient.prefs.v438focusAutoEnhance438 = !current
    AppToast.show(this, "Focus Auto Enhance438: ${if (!current) "ON" else "OFF"}")
}

// v438: Follow Auto Subscribe438
internal fun PlayerActivity.showV438FollowAutoSubscribe438Toggle() {
    val current = BiliClient.prefs.v438followAutoSubscribe438
    BiliClient.prefs.v438followAutoSubscribe438 = !current
    AppToast.show(this, "Follow Auto Subscribe438: ${if (!current) "ON" else "OFF"}")
}

// v438: Force Decode HW438
internal fun PlayerActivity.showV438ForceDecodeHw438Toggle() {
    val current = BiliClient.prefs.v438forceDecodeHw438
    BiliClient.prefs.v438forceDecodeHw438 = !current
    AppToast.show(this, "Force Decode HW438: ${if (!current) "ON" else "OFF"}")
}

// v438: Format Auto Convert438
internal fun PlayerActivity.showV438FormatAutoConvert438Toggle() {
    val current = BiliClient.prefs.v438formatAutoConvert438
    BiliClient.prefs.v438formatAutoConvert438 = !current
    AppToast.show(this, "Format Auto Convert438: ${if (!current) "ON" else "OFF"}")
}

// v438: Frame Interpolation438
internal fun PlayerActivity.showV438FrameInterpolation438Toggle() {
    val current = BiliClient.prefs.v438frameInterpolation438
    BiliClient.prefs.v438frameInterpolation438 = !current
    AppToast.show(this, "Frame Interpolation438: ${if (!current) "ON" else "OFF"}")
}

// v438: Free Memory Auto438
internal fun PlayerActivity.showV438FreeMemoryAuto438Toggle() {
    val current = BiliClient.prefs.v438freeMemoryAuto438
    BiliClient.prefs.v438freeMemoryAuto438 = !current
    AppToast.show(this, "Free Memory Auto438: ${if (!current) "ON" else "OFF"}")
}

// v438: Freeze On Buffering438
internal fun PlayerActivity.showV438FreezeOnBuffering438Toggle() {
    val current = BiliClient.prefs.v438freezeOnBuffering438
    BiliClient.prefs.v438freezeOnBuffering438 = !current
    AppToast.show(this, "Freeze On Buffering438: ${if (!current) "ON" else "OFF"}")
}

// v438: Fullscreen Auto Rotate438
internal fun PlayerActivity.showV438FullscreenAutoRotate438Toggle() {
    val current = BiliClient.prefs.v438fullscreenAutoRotate438
    BiliClient.prefs.v438fullscreenAutoRotate438 = !current
    AppToast.show(this, "Fullscreen Auto Rotate438: ${if (!current) "ON" else "OFF"}")
}

// v438: Gain Auto Balance438
internal fun PlayerActivity.showV438GainAutoBalance438Toggle() {
    val current = BiliClient.prefs.v438gainAutoBalance438
    BiliClient.prefs.v438gainAutoBalance438 = !current
    AppToast.show(this, "Gain Auto Balance438: ${if (!current) "ON" else "OFF"}")
}

// v438: Gallery Auto Layout438
internal fun PlayerActivity.showV438GalleryAutoLayout438Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v438galleryAutoLayout438).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout438",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v438galleryAutoLayout438 = value
        AppToast.show(this, "Gallery Auto Layout438: $value")
    }
}

// v439: Flash Screen On Notify439
internal fun PlayerActivity.showV439FlashScreenOnNotify439Toggle() {
    val current = BiliClient.prefs.v439flashScreenOnNotify439
    BiliClient.prefs.v439flashScreenOnNotify439 = !current
    AppToast.show(this, "Flash Screen On Notify439: ${if (!current) "ON" else "OFF"}")
}

// v439: Flex Layout Enabled439
internal fun PlayerActivity.showV439FlexLayoutEnabled439Toggle() {
    val current = BiliClient.prefs.v439flexLayoutEnabled439
    BiliClient.prefs.v439flexLayoutEnabled439 = !current
    AppToast.show(this, "Flex Layout Enabled439: ${if (!current) "ON" else "OFF"}")
}

// v439: Flip Gesture Enabled439
internal fun PlayerActivity.showV439FlipGestureEnabled439Toggle() {
    val current = BiliClient.prefs.v439flipGestureEnabled439
    BiliClient.prefs.v439flipGestureEnabled439 = !current
    AppToast.show(this, "Flip Gesture Enabled439: ${if (!current) "ON" else "OFF"}")
}

// v439: Flow Auto Redirect439
internal fun PlayerActivity.showV439FlowAutoRedirect439Toggle() {
    val current = BiliClient.prefs.v439flowAutoRedirect439
    BiliClient.prefs.v439flowAutoRedirect439 = !current
    AppToast.show(this, "Flow Auto Redirect439: ${if (!current) "ON" else "OFF"}")
}

// v439: Fly Mode Speed439
internal fun PlayerActivity.showV439FlyModeSpeed439Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v439flyModeSpeed439).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed439",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v439flyModeSpeed439 = value
        AppToast.show(this, "Fly Mode Speed439: $value")
    }
}

// v439: Focus Auto Enhance439
internal fun PlayerActivity.showV439FocusAutoEnhance439Toggle() {
    val current = BiliClient.prefs.v439focusAutoEnhance439
    BiliClient.prefs.v439focusAutoEnhance439 = !current
    AppToast.show(this, "Focus Auto Enhance439: ${if (!current) "ON" else "OFF"}")
}

// v439: Follow Auto Subscribe439
internal fun PlayerActivity.showV439FollowAutoSubscribe439Toggle() {
    val current = BiliClient.prefs.v439followAutoSubscribe439
    BiliClient.prefs.v439followAutoSubscribe439 = !current
    AppToast.show(this, "Follow Auto Subscribe439: ${if (!current) "ON" else "OFF"}")
}

// v439: Force Decode HW439
internal fun PlayerActivity.showV439ForceDecodeHw439Toggle() {
    val current = BiliClient.prefs.v439forceDecodeHw439
    BiliClient.prefs.v439forceDecodeHw439 = !current
    AppToast.show(this, "Force Decode HW439: ${if (!current) "ON" else "OFF"}")
}

// v439: Format Auto Convert439
internal fun PlayerActivity.showV439FormatAutoConvert439Toggle() {
    val current = BiliClient.prefs.v439formatAutoConvert439
    BiliClient.prefs.v439formatAutoConvert439 = !current
    AppToast.show(this, "Format Auto Convert439: ${if (!current) "ON" else "OFF"}")
}

// v439: Frame Interpolation439
internal fun PlayerActivity.showV439FrameInterpolation439Toggle() {
    val current = BiliClient.prefs.v439frameInterpolation439
    BiliClient.prefs.v439frameInterpolation439 = !current
    AppToast.show(this, "Frame Interpolation439: ${if (!current) "ON" else "OFF"}")
}

// v439: Free Memory Auto439
internal fun PlayerActivity.showV439FreeMemoryAuto439Toggle() {
    val current = BiliClient.prefs.v439freeMemoryAuto439
    BiliClient.prefs.v439freeMemoryAuto439 = !current
    AppToast.show(this, "Free Memory Auto439: ${if (!current) "ON" else "OFF"}")
}

// v439: Freeze On Buffering439
internal fun PlayerActivity.showV439FreezeOnBuffering439Toggle() {
    val current = BiliClient.prefs.v439freezeOnBuffering439
    BiliClient.prefs.v439freezeOnBuffering439 = !current
    AppToast.show(this, "Freeze On Buffering439: ${if (!current) "ON" else "OFF"}")
}

// v439: Fullscreen Auto Rotate439
internal fun PlayerActivity.showV439FullscreenAutoRotate439Toggle() {
    val current = BiliClient.prefs.v439fullscreenAutoRotate439
    BiliClient.prefs.v439fullscreenAutoRotate439 = !current
    AppToast.show(this, "Fullscreen Auto Rotate439: ${if (!current) "ON" else "OFF"}")
}

// v439: Gain Auto Balance439
internal fun PlayerActivity.showV439GainAutoBalance439Toggle() {
    val current = BiliClient.prefs.v439gainAutoBalance439
    BiliClient.prefs.v439gainAutoBalance439 = !current
    AppToast.show(this, "Gain Auto Balance439: ${if (!current) "ON" else "OFF"}")
}

// v439: Gallery Auto Layout439
internal fun PlayerActivity.showV439GalleryAutoLayout439Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v439galleryAutoLayout439).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout439",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v439galleryAutoLayout439 = value
        AppToast.show(this, "Gallery Auto Layout439: $value")
    }
}

// v440: Flash Screen On Notify440
internal fun PlayerActivity.showV440FlashScreenOnNotify440Toggle() {
    val current = BiliClient.prefs.v440flashScreenOnNotify440
    BiliClient.prefs.v440flashScreenOnNotify440 = !current
    AppToast.show(this, "Flash Screen On Notify440: ${if (!current) "ON" else "OFF"}")
}

// v440: Flex Layout Enabled440
internal fun PlayerActivity.showV440FlexLayoutEnabled440Toggle() {
    val current = BiliClient.prefs.v440flexLayoutEnabled440
    BiliClient.prefs.v440flexLayoutEnabled440 = !current
    AppToast.show(this, "Flex Layout Enabled440: ${if (!current) "ON" else "OFF"}")
}

// v440: Flip Gesture Enabled440
internal fun PlayerActivity.showV440FlipGestureEnabled440Toggle() {
    val current = BiliClient.prefs.v440flipGestureEnabled440
    BiliClient.prefs.v440flipGestureEnabled440 = !current
    AppToast.show(this, "Flip Gesture Enabled440: ${if (!current) "ON" else "OFF"}")
}

// v440: Flow Auto Redirect440
internal fun PlayerActivity.showV440FlowAutoRedirect440Toggle() {
    val current = BiliClient.prefs.v440flowAutoRedirect440
    BiliClient.prefs.v440flowAutoRedirect440 = !current
    AppToast.show(this, "Flow Auto Redirect440: ${if (!current) "ON" else "OFF"}")
}

// v440: Fly Mode Speed440
internal fun PlayerActivity.showV440FlyModeSpeed440Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v440flyModeSpeed440).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed440",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v440flyModeSpeed440 = value
        AppToast.show(this, "Fly Mode Speed440: $value")
    }
}

// v440: Focus Auto Enhance440
internal fun PlayerActivity.showV440FocusAutoEnhance440Toggle() {
    val current = BiliClient.prefs.v440focusAutoEnhance440
    BiliClient.prefs.v440focusAutoEnhance440 = !current
    AppToast.show(this, "Focus Auto Enhance440: ${if (!current) "ON" else "OFF"}")
}

// v440: Follow Auto Subscribe440
internal fun PlayerActivity.showV440FollowAutoSubscribe440Toggle() {
    val current = BiliClient.prefs.v440followAutoSubscribe440
    BiliClient.prefs.v440followAutoSubscribe440 = !current
    AppToast.show(this, "Follow Auto Subscribe440: ${if (!current) "ON" else "OFF"}")
}

// v440: Force Decode HW440
internal fun PlayerActivity.showV440ForceDecodeHw440Toggle() {
    val current = BiliClient.prefs.v440forceDecodeHw440
    BiliClient.prefs.v440forceDecodeHw440 = !current
    AppToast.show(this, "Force Decode HW440: ${if (!current) "ON" else "OFF"}")
}

// v440: Format Auto Convert440
internal fun PlayerActivity.showV440FormatAutoConvert440Toggle() {
    val current = BiliClient.prefs.v440formatAutoConvert440
    BiliClient.prefs.v440formatAutoConvert440 = !current
    AppToast.show(this, "Format Auto Convert440: ${if (!current) "ON" else "OFF"}")
}

// v440: Frame Interpolation440
internal fun PlayerActivity.showV440FrameInterpolation440Toggle() {
    val current = BiliClient.prefs.v440frameInterpolation440
    BiliClient.prefs.v440frameInterpolation440 = !current
    AppToast.show(this, "Frame Interpolation440: ${if (!current) "ON" else "OFF"}")
}

// v440: Free Memory Auto440
internal fun PlayerActivity.showV440FreeMemoryAuto440Toggle() {
    val current = BiliClient.prefs.v440freeMemoryAuto440
    BiliClient.prefs.v440freeMemoryAuto440 = !current
    AppToast.show(this, "Free Memory Auto440: ${if (!current) "ON" else "OFF"}")
}

// v440: Freeze On Buffering440
internal fun PlayerActivity.showV440FreezeOnBuffering440Toggle() {
    val current = BiliClient.prefs.v440freezeOnBuffering440
    BiliClient.prefs.v440freezeOnBuffering440 = !current
    AppToast.show(this, "Freeze On Buffering440: ${if (!current) "ON" else "OFF"}")
}

// v440: Fullscreen Auto Rotate440
internal fun PlayerActivity.showV440FullscreenAutoRotate440Toggle() {
    val current = BiliClient.prefs.v440fullscreenAutoRotate440
    BiliClient.prefs.v440fullscreenAutoRotate440 = !current
    AppToast.show(this, "Fullscreen Auto Rotate440: ${if (!current) "ON" else "OFF"}")
}

// v440: Gain Auto Balance440
internal fun PlayerActivity.showV440GainAutoBalance440Toggle() {
    val current = BiliClient.prefs.v440gainAutoBalance440
    BiliClient.prefs.v440gainAutoBalance440 = !current
    AppToast.show(this, "Gain Auto Balance440: ${if (!current) "ON" else "OFF"}")
}

// v440: Gallery Auto Layout440
internal fun PlayerActivity.showV440GalleryAutoLayout440Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v440galleryAutoLayout440).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout440",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v440galleryAutoLayout440 = value
        AppToast.show(this, "Gallery Auto Layout440: $value")
    }
}

// v441: Gate Auto Auth441
internal fun PlayerActivity.showV441GateAutoAuth441Toggle() {
    val current = BiliClient.prefs.v441gateAutoAuth441
    BiliClient.prefs.v441gateAutoAuth441 = !current
    AppToast.show(this, "Gate Auto Auth441: ${if (!current) "ON" else "OFF"}")
}

// v441: Global Sync Enabled441
internal fun PlayerActivity.showV441GlobalSyncEnabled441Toggle() {
    val current = BiliClient.prefs.v441globalSyncEnabled441
    BiliClient.prefs.v441globalSyncEnabled441 = !current
    AppToast.show(this, "Global Sync Enabled441: ${if (!current) "ON" else "OFF"}")
}

// v441: Group Auto Create441
internal fun PlayerActivity.showV441GroupAutoCreate441Toggle() {
    val current = BiliClient.prefs.v441groupAutoCreate441
    BiliClient.prefs.v441groupAutoCreate441 = !current
    AppToast.show(this, "Group Auto Create441: ${if (!current) "ON" else "OFF"}")
}

// v441: Grow Shrink Enabled441
internal fun PlayerActivity.showV441GrowShrinkEnabled441Toggle() {
    val current = BiliClient.prefs.v441growShrinkEnabled441
    BiliClient.prefs.v441growShrinkEnabled441 = !current
    AppToast.show(this, "Grow Shrink Enabled441: ${if (!current) "ON" else "OFF"}")
}

// v441: Guide Auto Show441
internal fun PlayerActivity.showV441GuideAutoShow441Toggle() {
    val current = BiliClient.prefs.v441guideAutoShow441
    BiliClient.prefs.v441guideAutoShow441 = !current
    AppToast.show(this, "Guide Auto Show441: ${if (!current) "ON" else "OFF"}")
}

// v441: Hang Detection Ms441
internal fun PlayerActivity.showV441HangDetectionMs441Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v441hangDetectionMs441).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms441",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v441hangDetectionMs441 = value
        AppToast.show(this, "Hang Detection Ms441: $value")
    }
}

// v441: Hash Verify Auto441
internal fun PlayerActivity.showV441HashVerifyAuto441Toggle() {
    val current = BiliClient.prefs.v441hashVerifyAuto441
    BiliClient.prefs.v441hashVerifyAuto441 = !current
    AppToast.show(this, "Hash Verify Auto441: ${if (!current) "ON" else "OFF"}")
}

// v441: HeadPhone Auto Pause441
internal fun PlayerActivity.showV441HeadPhoneAutoPause441Toggle() {
    val current = BiliClient.prefs.v441headPhoneAutoPause441
    BiliClient.prefs.v441headPhoneAutoPause441 = !current
    AppToast.show(this, "HeadPhone Auto Pause441: ${if (!current) "ON" else "OFF"}")
}

// v441: Heart Beat Interval441
internal fun PlayerActivity.showV441HeartBeatInterval441Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v441heartBeatInterval441).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval441",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v441heartBeatInterval441 = value
        AppToast.show(this, "Heart Beat Interval441: $value")
    }
}

// v441: Heat Monitor Enabled441
internal fun PlayerActivity.showV441HeatMonitorEnabled441Toggle() {
    val current = BiliClient.prefs.v441heatMonitorEnabled441
    BiliClient.prefs.v441heatMonitorEnabled441 = !current
    AppToast.show(this, "Heat Monitor Enabled441: ${if (!current) "ON" else "OFF"}")
}

// v441: Hide On Scroll441
internal fun PlayerActivity.showV441HideOnScroll441Toggle() {
    val current = BiliClient.prefs.v441hideOnScroll441
    BiliClient.prefs.v441hideOnScroll441 = !current
    AppToast.show(this, "Hide On Scroll441: ${if (!current) "ON" else "OFF"}")
}

// v441: Hold To Fast Forward441
internal fun PlayerActivity.showV441HoldToFastForward441Toggle() {
    val current = BiliClient.prefs.v441holdToFastForward441
    BiliClient.prefs.v441holdToFastForward441 = !current
    AppToast.show(this, "Hold To Fast Forward441: ${if (!current) "ON" else "OFF"}")
}

// v441: Hook Auto Register441
internal fun PlayerActivity.showV441HookAutoRegister441Toggle() {
    val current = BiliClient.prefs.v441hookAutoRegister441
    BiliClient.prefs.v441hookAutoRegister441 = !current
    AppToast.show(this, "Hook Auto Register441: ${if (!current) "ON" else "OFF"}")
}

// v441: Hot Reload Enabled441
internal fun PlayerActivity.showV441HotReloadEnabled441Toggle() {
    val current = BiliClient.prefs.v441hotReloadEnabled441
    BiliClient.prefs.v441hotReloadEnabled441 = !current
    AppToast.show(this, "Hot Reload Enabled441: ${if (!current) "ON" else "OFF"}")
}

// v441: Hub Auto Discover441
internal fun PlayerActivity.showV441HubAutoDiscover441Toggle() {
    val current = BiliClient.prefs.v441hubAutoDiscover441
    BiliClient.prefs.v441hubAutoDiscover441 = !current
    AppToast.show(this, "Hub Auto Discover441: ${if (!current) "ON" else "OFF"}")
}

// v442: Gate Auto Auth442
internal fun PlayerActivity.showV442GateAutoAuth442Toggle() {
    val current = BiliClient.prefs.v442gateAutoAuth442
    BiliClient.prefs.v442gateAutoAuth442 = !current
    AppToast.show(this, "Gate Auto Auth442: ${if (!current) "ON" else "OFF"}")
}

// v442: Global Sync Enabled442
internal fun PlayerActivity.showV442GlobalSyncEnabled442Toggle() {
    val current = BiliClient.prefs.v442globalSyncEnabled442
    BiliClient.prefs.v442globalSyncEnabled442 = !current
    AppToast.show(this, "Global Sync Enabled442: ${if (!current) "ON" else "OFF"}")
}

// v442: Group Auto Create442
internal fun PlayerActivity.showV442GroupAutoCreate442Toggle() {
    val current = BiliClient.prefs.v442groupAutoCreate442
    BiliClient.prefs.v442groupAutoCreate442 = !current
    AppToast.show(this, "Group Auto Create442: ${if (!current) "ON" else "OFF"}")
}

// v442: Grow Shrink Enabled442
internal fun PlayerActivity.showV442GrowShrinkEnabled442Toggle() {
    val current = BiliClient.prefs.v442growShrinkEnabled442
    BiliClient.prefs.v442growShrinkEnabled442 = !current
    AppToast.show(this, "Grow Shrink Enabled442: ${if (!current) "ON" else "OFF"}")
}

// v442: Guide Auto Show442
internal fun PlayerActivity.showV442GuideAutoShow442Toggle() {
    val current = BiliClient.prefs.v442guideAutoShow442
    BiliClient.prefs.v442guideAutoShow442 = !current
    AppToast.show(this, "Guide Auto Show442: ${if (!current) "ON" else "OFF"}")
}

// v442: Hang Detection Ms442
internal fun PlayerActivity.showV442HangDetectionMs442Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v442hangDetectionMs442).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms442",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v442hangDetectionMs442 = value
        AppToast.show(this, "Hang Detection Ms442: $value")
    }
}

// v442: Hash Verify Auto442
internal fun PlayerActivity.showV442HashVerifyAuto442Toggle() {
    val current = BiliClient.prefs.v442hashVerifyAuto442
    BiliClient.prefs.v442hashVerifyAuto442 = !current
    AppToast.show(this, "Hash Verify Auto442: ${if (!current) "ON" else "OFF"}")
}

// v442: HeadPhone Auto Pause442
internal fun PlayerActivity.showV442HeadPhoneAutoPause442Toggle() {
    val current = BiliClient.prefs.v442headPhoneAutoPause442
    BiliClient.prefs.v442headPhoneAutoPause442 = !current
    AppToast.show(this, "HeadPhone Auto Pause442: ${if (!current) "ON" else "OFF"}")
}

// v442: Heart Beat Interval442
internal fun PlayerActivity.showV442HeartBeatInterval442Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v442heartBeatInterval442).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval442",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v442heartBeatInterval442 = value
        AppToast.show(this, "Heart Beat Interval442: $value")
    }
}

// v442: Heat Monitor Enabled442
internal fun PlayerActivity.showV442HeatMonitorEnabled442Toggle() {
    val current = BiliClient.prefs.v442heatMonitorEnabled442
    BiliClient.prefs.v442heatMonitorEnabled442 = !current
    AppToast.show(this, "Heat Monitor Enabled442: ${if (!current) "ON" else "OFF"}")
}

// v442: Hide On Scroll442
internal fun PlayerActivity.showV442HideOnScroll442Toggle() {
    val current = BiliClient.prefs.v442hideOnScroll442
    BiliClient.prefs.v442hideOnScroll442 = !current
    AppToast.show(this, "Hide On Scroll442: ${if (!current) "ON" else "OFF"}")
}

// v442: Hold To Fast Forward442
internal fun PlayerActivity.showV442HoldToFastForward442Toggle() {
    val current = BiliClient.prefs.v442holdToFastForward442
    BiliClient.prefs.v442holdToFastForward442 = !current
    AppToast.show(this, "Hold To Fast Forward442: ${if (!current) "ON" else "OFF"}")
}

// v442: Hook Auto Register442
internal fun PlayerActivity.showV442HookAutoRegister442Toggle() {
    val current = BiliClient.prefs.v442hookAutoRegister442
    BiliClient.prefs.v442hookAutoRegister442 = !current
    AppToast.show(this, "Hook Auto Register442: ${if (!current) "ON" else "OFF"}")
}

// v442: Hot Reload Enabled442
internal fun PlayerActivity.showV442HotReloadEnabled442Toggle() {
    val current = BiliClient.prefs.v442hotReloadEnabled442
    BiliClient.prefs.v442hotReloadEnabled442 = !current
    AppToast.show(this, "Hot Reload Enabled442: ${if (!current) "ON" else "OFF"}")
}

// v442: Hub Auto Discover442
internal fun PlayerActivity.showV442HubAutoDiscover442Toggle() {
    val current = BiliClient.prefs.v442hubAutoDiscover442
    BiliClient.prefs.v442hubAutoDiscover442 = !current
    AppToast.show(this, "Hub Auto Discover442: ${if (!current) "ON" else "OFF"}")
}

// v443: Gate Auto Auth443
internal fun PlayerActivity.showV443GateAutoAuth443Toggle() {
    val current = BiliClient.prefs.v443gateAutoAuth443
    BiliClient.prefs.v443gateAutoAuth443 = !current
    AppToast.show(this, "Gate Auto Auth443: ${if (!current) "ON" else "OFF"}")
}

// v443: Global Sync Enabled443
internal fun PlayerActivity.showV443GlobalSyncEnabled443Toggle() {
    val current = BiliClient.prefs.v443globalSyncEnabled443
    BiliClient.prefs.v443globalSyncEnabled443 = !current
    AppToast.show(this, "Global Sync Enabled443: ${if (!current) "ON" else "OFF"}")
}

// v443: Group Auto Create443
internal fun PlayerActivity.showV443GroupAutoCreate443Toggle() {
    val current = BiliClient.prefs.v443groupAutoCreate443
    BiliClient.prefs.v443groupAutoCreate443 = !current
    AppToast.show(this, "Group Auto Create443: ${if (!current) "ON" else "OFF"}")
}

// v443: Grow Shrink Enabled443
internal fun PlayerActivity.showV443GrowShrinkEnabled443Toggle() {
    val current = BiliClient.prefs.v443growShrinkEnabled443
    BiliClient.prefs.v443growShrinkEnabled443 = !current
    AppToast.show(this, "Grow Shrink Enabled443: ${if (!current) "ON" else "OFF"}")
}

// v443: Guide Auto Show443
internal fun PlayerActivity.showV443GuideAutoShow443Toggle() {
    val current = BiliClient.prefs.v443guideAutoShow443
    BiliClient.prefs.v443guideAutoShow443 = !current
    AppToast.show(this, "Guide Auto Show443: ${if (!current) "ON" else "OFF"}")
}

// v443: Hang Detection Ms443
internal fun PlayerActivity.showV443HangDetectionMs443Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v443hangDetectionMs443).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms443",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v443hangDetectionMs443 = value
        AppToast.show(this, "Hang Detection Ms443: $value")
    }
}

// v443: Hash Verify Auto443
internal fun PlayerActivity.showV443HashVerifyAuto443Toggle() {
    val current = BiliClient.prefs.v443hashVerifyAuto443
    BiliClient.prefs.v443hashVerifyAuto443 = !current
    AppToast.show(this, "Hash Verify Auto443: ${if (!current) "ON" else "OFF"}")
}

// v443: HeadPhone Auto Pause443
internal fun PlayerActivity.showV443HeadPhoneAutoPause443Toggle() {
    val current = BiliClient.prefs.v443headPhoneAutoPause443
    BiliClient.prefs.v443headPhoneAutoPause443 = !current
    AppToast.show(this, "HeadPhone Auto Pause443: ${if (!current) "ON" else "OFF"}")
}

// v443: Heart Beat Interval443
internal fun PlayerActivity.showV443HeartBeatInterval443Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v443heartBeatInterval443).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval443",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v443heartBeatInterval443 = value
        AppToast.show(this, "Heart Beat Interval443: $value")
    }
}

// v443: Heat Monitor Enabled443
internal fun PlayerActivity.showV443HeatMonitorEnabled443Toggle() {
    val current = BiliClient.prefs.v443heatMonitorEnabled443
    BiliClient.prefs.v443heatMonitorEnabled443 = !current
    AppToast.show(this, "Heat Monitor Enabled443: ${if (!current) "ON" else "OFF"}")
}

// v443: Hide On Scroll443
internal fun PlayerActivity.showV443HideOnScroll443Toggle() {
    val current = BiliClient.prefs.v443hideOnScroll443
    BiliClient.prefs.v443hideOnScroll443 = !current
    AppToast.show(this, "Hide On Scroll443: ${if (!current) "ON" else "OFF"}")
}

// v443: Hold To Fast Forward443
internal fun PlayerActivity.showV443HoldToFastForward443Toggle() {
    val current = BiliClient.prefs.v443holdToFastForward443
    BiliClient.prefs.v443holdToFastForward443 = !current
    AppToast.show(this, "Hold To Fast Forward443: ${if (!current) "ON" else "OFF"}")
}

// v443: Hook Auto Register443
internal fun PlayerActivity.showV443HookAutoRegister443Toggle() {
    val current = BiliClient.prefs.v443hookAutoRegister443
    BiliClient.prefs.v443hookAutoRegister443 = !current
    AppToast.show(this, "Hook Auto Register443: ${if (!current) "ON" else "OFF"}")
}

// v443: Hot Reload Enabled443
internal fun PlayerActivity.showV443HotReloadEnabled443Toggle() {
    val current = BiliClient.prefs.v443hotReloadEnabled443
    BiliClient.prefs.v443hotReloadEnabled443 = !current
    AppToast.show(this, "Hot Reload Enabled443: ${if (!current) "ON" else "OFF"}")
}

// v443: Hub Auto Discover443
internal fun PlayerActivity.showV443HubAutoDiscover443Toggle() {
    val current = BiliClient.prefs.v443hubAutoDiscover443
    BiliClient.prefs.v443hubAutoDiscover443 = !current
    AppToast.show(this, "Hub Auto Discover443: ${if (!current) "ON" else "OFF"}")
}

// v444: Gate Auto Auth444
internal fun PlayerActivity.showV444GateAutoAuth444Toggle() {
    val current = BiliClient.prefs.v444gateAutoAuth444
    BiliClient.prefs.v444gateAutoAuth444 = !current
    AppToast.show(this, "Gate Auto Auth444: ${if (!current) "ON" else "OFF"}")
}

// v444: Global Sync Enabled444
internal fun PlayerActivity.showV444GlobalSyncEnabled444Toggle() {
    val current = BiliClient.prefs.v444globalSyncEnabled444
    BiliClient.prefs.v444globalSyncEnabled444 = !current
    AppToast.show(this, "Global Sync Enabled444: ${if (!current) "ON" else "OFF"}")
}

// v444: Group Auto Create444
internal fun PlayerActivity.showV444GroupAutoCreate444Toggle() {
    val current = BiliClient.prefs.v444groupAutoCreate444
    BiliClient.prefs.v444groupAutoCreate444 = !current
    AppToast.show(this, "Group Auto Create444: ${if (!current) "ON" else "OFF"}")
}

// v444: Grow Shrink Enabled444
internal fun PlayerActivity.showV444GrowShrinkEnabled444Toggle() {
    val current = BiliClient.prefs.v444growShrinkEnabled444
    BiliClient.prefs.v444growShrinkEnabled444 = !current
    AppToast.show(this, "Grow Shrink Enabled444: ${if (!current) "ON" else "OFF"}")
}

// v444: Guide Auto Show444
internal fun PlayerActivity.showV444GuideAutoShow444Toggle() {
    val current = BiliClient.prefs.v444guideAutoShow444
    BiliClient.prefs.v444guideAutoShow444 = !current
    AppToast.show(this, "Guide Auto Show444: ${if (!current) "ON" else "OFF"}")
}

// v444: Hang Detection Ms444
internal fun PlayerActivity.showV444HangDetectionMs444Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v444hangDetectionMs444).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms444",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v444hangDetectionMs444 = value
        AppToast.show(this, "Hang Detection Ms444: $value")
    }
}

// v444: Hash Verify Auto444
internal fun PlayerActivity.showV444HashVerifyAuto444Toggle() {
    val current = BiliClient.prefs.v444hashVerifyAuto444
    BiliClient.prefs.v444hashVerifyAuto444 = !current
    AppToast.show(this, "Hash Verify Auto444: ${if (!current) "ON" else "OFF"}")
}

// v444: HeadPhone Auto Pause444
internal fun PlayerActivity.showV444HeadPhoneAutoPause444Toggle() {
    val current = BiliClient.prefs.v444headPhoneAutoPause444
    BiliClient.prefs.v444headPhoneAutoPause444 = !current
    AppToast.show(this, "HeadPhone Auto Pause444: ${if (!current) "ON" else "OFF"}")
}

// v444: Heart Beat Interval444
internal fun PlayerActivity.showV444HeartBeatInterval444Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v444heartBeatInterval444).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval444",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v444heartBeatInterval444 = value
        AppToast.show(this, "Heart Beat Interval444: $value")
    }
}

// v444: Heat Monitor Enabled444
internal fun PlayerActivity.showV444HeatMonitorEnabled444Toggle() {
    val current = BiliClient.prefs.v444heatMonitorEnabled444
    BiliClient.prefs.v444heatMonitorEnabled444 = !current
    AppToast.show(this, "Heat Monitor Enabled444: ${if (!current) "ON" else "OFF"}")
}

// v444: Hide On Scroll444
internal fun PlayerActivity.showV444HideOnScroll444Toggle() {
    val current = BiliClient.prefs.v444hideOnScroll444
    BiliClient.prefs.v444hideOnScroll444 = !current
    AppToast.show(this, "Hide On Scroll444: ${if (!current) "ON" else "OFF"}")
}

// v444: Hold To Fast Forward444
internal fun PlayerActivity.showV444HoldToFastForward444Toggle() {
    val current = BiliClient.prefs.v444holdToFastForward444
    BiliClient.prefs.v444holdToFastForward444 = !current
    AppToast.show(this, "Hold To Fast Forward444: ${if (!current) "ON" else "OFF"}")
}

// v444: Hook Auto Register444
internal fun PlayerActivity.showV444HookAutoRegister444Toggle() {
    val current = BiliClient.prefs.v444hookAutoRegister444
    BiliClient.prefs.v444hookAutoRegister444 = !current
    AppToast.show(this, "Hook Auto Register444: ${if (!current) "ON" else "OFF"}")
}

// v444: Hot Reload Enabled444
internal fun PlayerActivity.showV444HotReloadEnabled444Toggle() {
    val current = BiliClient.prefs.v444hotReloadEnabled444
    BiliClient.prefs.v444hotReloadEnabled444 = !current
    AppToast.show(this, "Hot Reload Enabled444: ${if (!current) "ON" else "OFF"}")
}

// v444: Hub Auto Discover444
internal fun PlayerActivity.showV444HubAutoDiscover444Toggle() {
    val current = BiliClient.prefs.v444hubAutoDiscover444
    BiliClient.prefs.v444hubAutoDiscover444 = !current
    AppToast.show(this, "Hub Auto Discover444: ${if (!current) "ON" else "OFF"}")
}

// v445: Gate Auto Auth445
internal fun PlayerActivity.showV445GateAutoAuth445Toggle() {
    val current = BiliClient.prefs.v445gateAutoAuth445
    BiliClient.prefs.v445gateAutoAuth445 = !current
    AppToast.show(this, "Gate Auto Auth445: ${if (!current) "ON" else "OFF"}")
}

// v445: Global Sync Enabled445
internal fun PlayerActivity.showV445GlobalSyncEnabled445Toggle() {
    val current = BiliClient.prefs.v445globalSyncEnabled445
    BiliClient.prefs.v445globalSyncEnabled445 = !current
    AppToast.show(this, "Global Sync Enabled445: ${if (!current) "ON" else "OFF"}")
}

// v445: Group Auto Create445
internal fun PlayerActivity.showV445GroupAutoCreate445Toggle() {
    val current = BiliClient.prefs.v445groupAutoCreate445
    BiliClient.prefs.v445groupAutoCreate445 = !current
    AppToast.show(this, "Group Auto Create445: ${if (!current) "ON" else "OFF"}")
}

// v445: Grow Shrink Enabled445
internal fun PlayerActivity.showV445GrowShrinkEnabled445Toggle() {
    val current = BiliClient.prefs.v445growShrinkEnabled445
    BiliClient.prefs.v445growShrinkEnabled445 = !current
    AppToast.show(this, "Grow Shrink Enabled445: ${if (!current) "ON" else "OFF"}")
}

// v445: Guide Auto Show445
internal fun PlayerActivity.showV445GuideAutoShow445Toggle() {
    val current = BiliClient.prefs.v445guideAutoShow445
    BiliClient.prefs.v445guideAutoShow445 = !current
    AppToast.show(this, "Guide Auto Show445: ${if (!current) "ON" else "OFF"}")
}

// v445: Hang Detection Ms445
internal fun PlayerActivity.showV445HangDetectionMs445Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v445hangDetectionMs445).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms445",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v445hangDetectionMs445 = value
        AppToast.show(this, "Hang Detection Ms445: $value")
    }
}

// v445: Hash Verify Auto445
internal fun PlayerActivity.showV445HashVerifyAuto445Toggle() {
    val current = BiliClient.prefs.v445hashVerifyAuto445
    BiliClient.prefs.v445hashVerifyAuto445 = !current
    AppToast.show(this, "Hash Verify Auto445: ${if (!current) "ON" else "OFF"}")
}

// v445: HeadPhone Auto Pause445
internal fun PlayerActivity.showV445HeadPhoneAutoPause445Toggle() {
    val current = BiliClient.prefs.v445headPhoneAutoPause445
    BiliClient.prefs.v445headPhoneAutoPause445 = !current
    AppToast.show(this, "HeadPhone Auto Pause445: ${if (!current) "ON" else "OFF"}")
}

// v445: Heart Beat Interval445
internal fun PlayerActivity.showV445HeartBeatInterval445Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v445heartBeatInterval445).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval445",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v445heartBeatInterval445 = value
        AppToast.show(this, "Heart Beat Interval445: $value")
    }
}

// v445: Heat Monitor Enabled445
internal fun PlayerActivity.showV445HeatMonitorEnabled445Toggle() {
    val current = BiliClient.prefs.v445heatMonitorEnabled445
    BiliClient.prefs.v445heatMonitorEnabled445 = !current
    AppToast.show(this, "Heat Monitor Enabled445: ${if (!current) "ON" else "OFF"}")
}

// v445: Hide On Scroll445
internal fun PlayerActivity.showV445HideOnScroll445Toggle() {
    val current = BiliClient.prefs.v445hideOnScroll445
    BiliClient.prefs.v445hideOnScroll445 = !current
    AppToast.show(this, "Hide On Scroll445: ${if (!current) "ON" else "OFF"}")
}

// v445: Hold To Fast Forward445
internal fun PlayerActivity.showV445HoldToFastForward445Toggle() {
    val current = BiliClient.prefs.v445holdToFastForward445
    BiliClient.prefs.v445holdToFastForward445 = !current
    AppToast.show(this, "Hold To Fast Forward445: ${if (!current) "ON" else "OFF"}")
}

// v445: Hook Auto Register445
internal fun PlayerActivity.showV445HookAutoRegister445Toggle() {
    val current = BiliClient.prefs.v445hookAutoRegister445
    BiliClient.prefs.v445hookAutoRegister445 = !current
    AppToast.show(this, "Hook Auto Register445: ${if (!current) "ON" else "OFF"}")
}

// v445: Hot Reload Enabled445
internal fun PlayerActivity.showV445HotReloadEnabled445Toggle() {
    val current = BiliClient.prefs.v445hotReloadEnabled445
    BiliClient.prefs.v445hotReloadEnabled445 = !current
    AppToast.show(this, "Hot Reload Enabled445: ${if (!current) "ON" else "OFF"}")
}

// v445: Hub Auto Discover445
internal fun PlayerActivity.showV445HubAutoDiscover445Toggle() {
    val current = BiliClient.prefs.v445hubAutoDiscover445
    BiliClient.prefs.v445hubAutoDiscover445 = !current
    AppToast.show(this, "Hub Auto Discover445: ${if (!current) "ON" else "OFF"}")
}

// v446: Gate Auto Auth446
internal fun PlayerActivity.showV446GateAutoAuth446Toggle() {
    val current = BiliClient.prefs.v446gateAutoAuth446
    BiliClient.prefs.v446gateAutoAuth446 = !current
    AppToast.show(this, "Gate Auto Auth446: ${if (!current) "ON" else "OFF"}")
}

// v446: Global Sync Enabled446
internal fun PlayerActivity.showV446GlobalSyncEnabled446Toggle() {
    val current = BiliClient.prefs.v446globalSyncEnabled446
    BiliClient.prefs.v446globalSyncEnabled446 = !current
    AppToast.show(this, "Global Sync Enabled446: ${if (!current) "ON" else "OFF"}")
}

// v446: Group Auto Create446
internal fun PlayerActivity.showV446GroupAutoCreate446Toggle() {
    val current = BiliClient.prefs.v446groupAutoCreate446
    BiliClient.prefs.v446groupAutoCreate446 = !current
    AppToast.show(this, "Group Auto Create446: ${if (!current) "ON" else "OFF"}")
}

// v446: Grow Shrink Enabled446
internal fun PlayerActivity.showV446GrowShrinkEnabled446Toggle() {
    val current = BiliClient.prefs.v446growShrinkEnabled446
    BiliClient.prefs.v446growShrinkEnabled446 = !current
    AppToast.show(this, "Grow Shrink Enabled446: ${if (!current) "ON" else "OFF"}")
}

// v446: Guide Auto Show446
internal fun PlayerActivity.showV446GuideAutoShow446Toggle() {
    val current = BiliClient.prefs.v446guideAutoShow446
    BiliClient.prefs.v446guideAutoShow446 = !current
    AppToast.show(this, "Guide Auto Show446: ${if (!current) "ON" else "OFF"}")
}

// v446: Hang Detection Ms446
internal fun PlayerActivity.showV446HangDetectionMs446Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v446hangDetectionMs446).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms446",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v446hangDetectionMs446 = value
        AppToast.show(this, "Hang Detection Ms446: $value")
    }
}

// v446: Hash Verify Auto446
internal fun PlayerActivity.showV446HashVerifyAuto446Toggle() {
    val current = BiliClient.prefs.v446hashVerifyAuto446
    BiliClient.prefs.v446hashVerifyAuto446 = !current
    AppToast.show(this, "Hash Verify Auto446: ${if (!current) "ON" else "OFF"}")
}

// v446: HeadPhone Auto Pause446
internal fun PlayerActivity.showV446HeadPhoneAutoPause446Toggle() {
    val current = BiliClient.prefs.v446headPhoneAutoPause446
    BiliClient.prefs.v446headPhoneAutoPause446 = !current
    AppToast.show(this, "HeadPhone Auto Pause446: ${if (!current) "ON" else "OFF"}")
}

// v446: Heart Beat Interval446
internal fun PlayerActivity.showV446HeartBeatInterval446Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v446heartBeatInterval446).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval446",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v446heartBeatInterval446 = value
        AppToast.show(this, "Heart Beat Interval446: $value")
    }
}

// v446: Heat Monitor Enabled446
internal fun PlayerActivity.showV446HeatMonitorEnabled446Toggle() {
    val current = BiliClient.prefs.v446heatMonitorEnabled446
    BiliClient.prefs.v446heatMonitorEnabled446 = !current
    AppToast.show(this, "Heat Monitor Enabled446: ${if (!current) "ON" else "OFF"}")
}

// v446: Hide On Scroll446
internal fun PlayerActivity.showV446HideOnScroll446Toggle() {
    val current = BiliClient.prefs.v446hideOnScroll446
    BiliClient.prefs.v446hideOnScroll446 = !current
    AppToast.show(this, "Hide On Scroll446: ${if (!current) "ON" else "OFF"}")
}

// v446: Hold To Fast Forward446
internal fun PlayerActivity.showV446HoldToFastForward446Toggle() {
    val current = BiliClient.prefs.v446holdToFastForward446
    BiliClient.prefs.v446holdToFastForward446 = !current
    AppToast.show(this, "Hold To Fast Forward446: ${if (!current) "ON" else "OFF"}")
}

// v446: Hook Auto Register446
internal fun PlayerActivity.showV446HookAutoRegister446Toggle() {
    val current = BiliClient.prefs.v446hookAutoRegister446
    BiliClient.prefs.v446hookAutoRegister446 = !current
    AppToast.show(this, "Hook Auto Register446: ${if (!current) "ON" else "OFF"}")
}

// v446: Hot Reload Enabled446
internal fun PlayerActivity.showV446HotReloadEnabled446Toggle() {
    val current = BiliClient.prefs.v446hotReloadEnabled446
    BiliClient.prefs.v446hotReloadEnabled446 = !current
    AppToast.show(this, "Hot Reload Enabled446: ${if (!current) "ON" else "OFF"}")
}

// v446: Hub Auto Discover446
internal fun PlayerActivity.showV446HubAutoDiscover446Toggle() {
    val current = BiliClient.prefs.v446hubAutoDiscover446
    BiliClient.prefs.v446hubAutoDiscover446 = !current
    AppToast.show(this, "Hub Auto Discover446: ${if (!current) "ON" else "OFF"}")
}

// v447: Gate Auto Auth447
internal fun PlayerActivity.showV447GateAutoAuth447Toggle() {
    val current = BiliClient.prefs.v447gateAutoAuth447
    BiliClient.prefs.v447gateAutoAuth447 = !current
    AppToast.show(this, "Gate Auto Auth447: ${if (!current) "ON" else "OFF"}")
}

// v447: Global Sync Enabled447
internal fun PlayerActivity.showV447GlobalSyncEnabled447Toggle() {
    val current = BiliClient.prefs.v447globalSyncEnabled447
    BiliClient.prefs.v447globalSyncEnabled447 = !current
    AppToast.show(this, "Global Sync Enabled447: ${if (!current) "ON" else "OFF"}")
}

// v447: Group Auto Create447
internal fun PlayerActivity.showV447GroupAutoCreate447Toggle() {
    val current = BiliClient.prefs.v447groupAutoCreate447
    BiliClient.prefs.v447groupAutoCreate447 = !current
    AppToast.show(this, "Group Auto Create447: ${if (!current) "ON" else "OFF"}")
}

// v447: Grow Shrink Enabled447
internal fun PlayerActivity.showV447GrowShrinkEnabled447Toggle() {
    val current = BiliClient.prefs.v447growShrinkEnabled447
    BiliClient.prefs.v447growShrinkEnabled447 = !current
    AppToast.show(this, "Grow Shrink Enabled447: ${if (!current) "ON" else "OFF"}")
}

// v447: Guide Auto Show447
internal fun PlayerActivity.showV447GuideAutoShow447Toggle() {
    val current = BiliClient.prefs.v447guideAutoShow447
    BiliClient.prefs.v447guideAutoShow447 = !current
    AppToast.show(this, "Guide Auto Show447: ${if (!current) "ON" else "OFF"}")
}

// v447: Hang Detection Ms447
internal fun PlayerActivity.showV447HangDetectionMs447Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v447hangDetectionMs447).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms447",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v447hangDetectionMs447 = value
        AppToast.show(this, "Hang Detection Ms447: $value")
    }
}

// v447: Hash Verify Auto447
internal fun PlayerActivity.showV447HashVerifyAuto447Toggle() {
    val current = BiliClient.prefs.v447hashVerifyAuto447
    BiliClient.prefs.v447hashVerifyAuto447 = !current
    AppToast.show(this, "Hash Verify Auto447: ${if (!current) "ON" else "OFF"}")
}

// v447: HeadPhone Auto Pause447
internal fun PlayerActivity.showV447HeadPhoneAutoPause447Toggle() {
    val current = BiliClient.prefs.v447headPhoneAutoPause447
    BiliClient.prefs.v447headPhoneAutoPause447 = !current
    AppToast.show(this, "HeadPhone Auto Pause447: ${if (!current) "ON" else "OFF"}")
}

// v447: Heart Beat Interval447
internal fun PlayerActivity.showV447HeartBeatInterval447Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v447heartBeatInterval447).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval447",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v447heartBeatInterval447 = value
        AppToast.show(this, "Heart Beat Interval447: $value")
    }
}

// v447: Heat Monitor Enabled447
internal fun PlayerActivity.showV447HeatMonitorEnabled447Toggle() {
    val current = BiliClient.prefs.v447heatMonitorEnabled447
    BiliClient.prefs.v447heatMonitorEnabled447 = !current
    AppToast.show(this, "Heat Monitor Enabled447: ${if (!current) "ON" else "OFF"}")
}

// v447: Hide On Scroll447
internal fun PlayerActivity.showV447HideOnScroll447Toggle() {
    val current = BiliClient.prefs.v447hideOnScroll447
    BiliClient.prefs.v447hideOnScroll447 = !current
    AppToast.show(this, "Hide On Scroll447: ${if (!current) "ON" else "OFF"}")
}

// v447: Hold To Fast Forward447
internal fun PlayerActivity.showV447HoldToFastForward447Toggle() {
    val current = BiliClient.prefs.v447holdToFastForward447
    BiliClient.prefs.v447holdToFastForward447 = !current
    AppToast.show(this, "Hold To Fast Forward447: ${if (!current) "ON" else "OFF"}")
}

// v447: Hook Auto Register447
internal fun PlayerActivity.showV447HookAutoRegister447Toggle() {
    val current = BiliClient.prefs.v447hookAutoRegister447
    BiliClient.prefs.v447hookAutoRegister447 = !current
    AppToast.show(this, "Hook Auto Register447: ${if (!current) "ON" else "OFF"}")
}

// v447: Hot Reload Enabled447
internal fun PlayerActivity.showV447HotReloadEnabled447Toggle() {
    val current = BiliClient.prefs.v447hotReloadEnabled447
    BiliClient.prefs.v447hotReloadEnabled447 = !current
    AppToast.show(this, "Hot Reload Enabled447: ${if (!current) "ON" else "OFF"}")
}

// v447: Hub Auto Discover447
internal fun PlayerActivity.showV447HubAutoDiscover447Toggle() {
    val current = BiliClient.prefs.v447hubAutoDiscover447
    BiliClient.prefs.v447hubAutoDiscover447 = !current
    AppToast.show(this, "Hub Auto Discover447: ${if (!current) "ON" else "OFF"}")
}

// v448: Gate Auto Auth448
internal fun PlayerActivity.showV448GateAutoAuth448Toggle() {
    val current = BiliClient.prefs.v448gateAutoAuth448
    BiliClient.prefs.v448gateAutoAuth448 = !current
    AppToast.show(this, "Gate Auto Auth448: ${if (!current) "ON" else "OFF"}")
}

// v448: Global Sync Enabled448
internal fun PlayerActivity.showV448GlobalSyncEnabled448Toggle() {
    val current = BiliClient.prefs.v448globalSyncEnabled448
    BiliClient.prefs.v448globalSyncEnabled448 = !current
    AppToast.show(this, "Global Sync Enabled448: ${if (!current) "ON" else "OFF"}")
}

// v448: Group Auto Create448
internal fun PlayerActivity.showV448GroupAutoCreate448Toggle() {
    val current = BiliClient.prefs.v448groupAutoCreate448
    BiliClient.prefs.v448groupAutoCreate448 = !current
    AppToast.show(this, "Group Auto Create448: ${if (!current) "ON" else "OFF"}")
}

// v448: Grow Shrink Enabled448
internal fun PlayerActivity.showV448GrowShrinkEnabled448Toggle() {
    val current = BiliClient.prefs.v448growShrinkEnabled448
    BiliClient.prefs.v448growShrinkEnabled448 = !current
    AppToast.show(this, "Grow Shrink Enabled448: ${if (!current) "ON" else "OFF"}")
}

// v448: Guide Auto Show448
internal fun PlayerActivity.showV448GuideAutoShow448Toggle() {
    val current = BiliClient.prefs.v448guideAutoShow448
    BiliClient.prefs.v448guideAutoShow448 = !current
    AppToast.show(this, "Guide Auto Show448: ${if (!current) "ON" else "OFF"}")
}

// v448: Hang Detection Ms448
internal fun PlayerActivity.showV448HangDetectionMs448Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v448hangDetectionMs448).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms448",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v448hangDetectionMs448 = value
        AppToast.show(this, "Hang Detection Ms448: $value")
    }
}

// v448: Hash Verify Auto448
internal fun PlayerActivity.showV448HashVerifyAuto448Toggle() {
    val current = BiliClient.prefs.v448hashVerifyAuto448
    BiliClient.prefs.v448hashVerifyAuto448 = !current
    AppToast.show(this, "Hash Verify Auto448: ${if (!current) "ON" else "OFF"}")
}

// v448: HeadPhone Auto Pause448
internal fun PlayerActivity.showV448HeadPhoneAutoPause448Toggle() {
    val current = BiliClient.prefs.v448headPhoneAutoPause448
    BiliClient.prefs.v448headPhoneAutoPause448 = !current
    AppToast.show(this, "HeadPhone Auto Pause448: ${if (!current) "ON" else "OFF"}")
}

// v448: Heart Beat Interval448
internal fun PlayerActivity.showV448HeartBeatInterval448Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v448heartBeatInterval448).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval448",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v448heartBeatInterval448 = value
        AppToast.show(this, "Heart Beat Interval448: $value")
    }
}

// v448: Heat Monitor Enabled448
internal fun PlayerActivity.showV448HeatMonitorEnabled448Toggle() {
    val current = BiliClient.prefs.v448heatMonitorEnabled448
    BiliClient.prefs.v448heatMonitorEnabled448 = !current
    AppToast.show(this, "Heat Monitor Enabled448: ${if (!current) "ON" else "OFF"}")
}

// v448: Hide On Scroll448
internal fun PlayerActivity.showV448HideOnScroll448Toggle() {
    val current = BiliClient.prefs.v448hideOnScroll448
    BiliClient.prefs.v448hideOnScroll448 = !current
    AppToast.show(this, "Hide On Scroll448: ${if (!current) "ON" else "OFF"}")
}

// v448: Hold To Fast Forward448
internal fun PlayerActivity.showV448HoldToFastForward448Toggle() {
    val current = BiliClient.prefs.v448holdToFastForward448
    BiliClient.prefs.v448holdToFastForward448 = !current
    AppToast.show(this, "Hold To Fast Forward448: ${if (!current) "ON" else "OFF"}")
}

// v448: Hook Auto Register448
internal fun PlayerActivity.showV448HookAutoRegister448Toggle() {
    val current = BiliClient.prefs.v448hookAutoRegister448
    BiliClient.prefs.v448hookAutoRegister448 = !current
    AppToast.show(this, "Hook Auto Register448: ${if (!current) "ON" else "OFF"}")
}

// v448: Hot Reload Enabled448
internal fun PlayerActivity.showV448HotReloadEnabled448Toggle() {
    val current = BiliClient.prefs.v448hotReloadEnabled448
    BiliClient.prefs.v448hotReloadEnabled448 = !current
    AppToast.show(this, "Hot Reload Enabled448: ${if (!current) "ON" else "OFF"}")
}

// v448: Hub Auto Discover448
internal fun PlayerActivity.showV448HubAutoDiscover448Toggle() {
    val current = BiliClient.prefs.v448hubAutoDiscover448
    BiliClient.prefs.v448hubAutoDiscover448 = !current
    AppToast.show(this, "Hub Auto Discover448: ${if (!current) "ON" else "OFF"}")
}

// v449: Gate Auto Auth449
internal fun PlayerActivity.showV449GateAutoAuth449Toggle() {
    val current = BiliClient.prefs.v449gateAutoAuth449
    BiliClient.prefs.v449gateAutoAuth449 = !current
    AppToast.show(this, "Gate Auto Auth449: ${if (!current) "ON" else "OFF"}")
}

// v449: Global Sync Enabled449
internal fun PlayerActivity.showV449GlobalSyncEnabled449Toggle() {
    val current = BiliClient.prefs.v449globalSyncEnabled449
    BiliClient.prefs.v449globalSyncEnabled449 = !current
    AppToast.show(this, "Global Sync Enabled449: ${if (!current) "ON" else "OFF"}")
}

// v449: Group Auto Create449
internal fun PlayerActivity.showV449GroupAutoCreate449Toggle() {
    val current = BiliClient.prefs.v449groupAutoCreate449
    BiliClient.prefs.v449groupAutoCreate449 = !current
    AppToast.show(this, "Group Auto Create449: ${if (!current) "ON" else "OFF"}")
}

// v449: Grow Shrink Enabled449
internal fun PlayerActivity.showV449GrowShrinkEnabled449Toggle() {
    val current = BiliClient.prefs.v449growShrinkEnabled449
    BiliClient.prefs.v449growShrinkEnabled449 = !current
    AppToast.show(this, "Grow Shrink Enabled449: ${if (!current) "ON" else "OFF"}")
}

// v449: Guide Auto Show449
internal fun PlayerActivity.showV449GuideAutoShow449Toggle() {
    val current = BiliClient.prefs.v449guideAutoShow449
    BiliClient.prefs.v449guideAutoShow449 = !current
    AppToast.show(this, "Guide Auto Show449: ${if (!current) "ON" else "OFF"}")
}

// v449: Hang Detection Ms449
internal fun PlayerActivity.showV449HangDetectionMs449Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v449hangDetectionMs449).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms449",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v449hangDetectionMs449 = value
        AppToast.show(this, "Hang Detection Ms449: $value")
    }
}

// v449: Hash Verify Auto449
internal fun PlayerActivity.showV449HashVerifyAuto449Toggle() {
    val current = BiliClient.prefs.v449hashVerifyAuto449
    BiliClient.prefs.v449hashVerifyAuto449 = !current
    AppToast.show(this, "Hash Verify Auto449: ${if (!current) "ON" else "OFF"}")
}

// v449: HeadPhone Auto Pause449
internal fun PlayerActivity.showV449HeadPhoneAutoPause449Toggle() {
    val current = BiliClient.prefs.v449headPhoneAutoPause449
    BiliClient.prefs.v449headPhoneAutoPause449 = !current
    AppToast.show(this, "HeadPhone Auto Pause449: ${if (!current) "ON" else "OFF"}")
}

// v449: Heart Beat Interval449
internal fun PlayerActivity.showV449HeartBeatInterval449Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v449heartBeatInterval449).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval449",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v449heartBeatInterval449 = value
        AppToast.show(this, "Heart Beat Interval449: $value")
    }
}

// v449: Heat Monitor Enabled449
internal fun PlayerActivity.showV449HeatMonitorEnabled449Toggle() {
    val current = BiliClient.prefs.v449heatMonitorEnabled449
    BiliClient.prefs.v449heatMonitorEnabled449 = !current
    AppToast.show(this, "Heat Monitor Enabled449: ${if (!current) "ON" else "OFF"}")
}

// v449: Hide On Scroll449
internal fun PlayerActivity.showV449HideOnScroll449Toggle() {
    val current = BiliClient.prefs.v449hideOnScroll449
    BiliClient.prefs.v449hideOnScroll449 = !current
    AppToast.show(this, "Hide On Scroll449: ${if (!current) "ON" else "OFF"}")
}

// v449: Hold To Fast Forward449
internal fun PlayerActivity.showV449HoldToFastForward449Toggle() {
    val current = BiliClient.prefs.v449holdToFastForward449
    BiliClient.prefs.v449holdToFastForward449 = !current
    AppToast.show(this, "Hold To Fast Forward449: ${if (!current) "ON" else "OFF"}")
}

// v449: Hook Auto Register449
internal fun PlayerActivity.showV449HookAutoRegister449Toggle() {
    val current = BiliClient.prefs.v449hookAutoRegister449
    BiliClient.prefs.v449hookAutoRegister449 = !current
    AppToast.show(this, "Hook Auto Register449: ${if (!current) "ON" else "OFF"}")
}
