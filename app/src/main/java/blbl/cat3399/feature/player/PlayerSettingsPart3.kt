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

