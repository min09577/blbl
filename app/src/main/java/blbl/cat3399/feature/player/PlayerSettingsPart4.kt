package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.feature.player.danmaku.DanmakuFontWeight


// v63.4: Gesture Long Press Vibration
internal fun PlayerActivity.showV63GestureLongPressVibrationToggle() {
    val enabled = !BiliClient.prefs.v63GestureLongPressVibration
    BiliClient.prefs.v63GestureLongPressVibration = enabled
    AppToast.show(this, "Gesture Long Press Vibration: ${if (enabled) "ON" else "OFF"}")
}

// v63.5: Video Adaptive Saturation Curve
internal fun PlayerActivity.showV63VideoAdaptiveSaturationCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63VideoAdaptiveSaturationCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Saturation Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63VideoAdaptiveSaturationCurve = value
        AppToast.show(this, "Video Adaptive Saturation Curve: $value")
    }
}

// v63.6: Danmaku Send Queue Size
internal fun PlayerActivity.showV63DanmakuSendQueueSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuSendQueueSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Queue Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63DanmakuSendQueueSize = value
        AppToast.show(this, "Danmaku Send Queue Size: $value")
    }
}

// v63.7: Cast Video Render Mode
internal fun PlayerActivity.showV63CastVideoRenderModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63CastVideoRenderMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Render Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63CastVideoRenderMode = value
        AppToast.show(this, "Cast Video Render Mode: $value")
    }
}

// v63.8: Subtitle BG Border Width
internal fun PlayerActivity.showV63SubtitleBgBorderWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v63SubtitleBgBorderWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63SubtitleBgBorderWidth = value
        AppToast.show(this, "Subtitle BG Border Width: $value")
    }
}

// v63.9: Video Adaptive Gamma Curve
internal fun PlayerActivity.showV63VideoAdaptiveGammaCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63VideoAdaptiveGammaCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Gamma Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63VideoAdaptiveGammaCurve = value
        AppToast.show(this, "Video Adaptive Gamma Curve: $value")
    }
}

// v63.10: Danmaku Filter By Type
internal fun PlayerActivity.showV63DanmakuFilterByTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuFilterByType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63DanmakuFilterByType = value
        AppToast.show(this, "Danmaku Filter By Type: $value")
    }
}

// v63.11: Playlist Auto Merge
internal fun PlayerActivity.showV63PlaylistAutoMergeToggle() {
    val enabled = !BiliClient.prefs.v63PlaylistAutoMerge
    BiliClient.prefs.v63PlaylistAutoMerge = enabled
    AppToast.show(this, "Playlist Auto Merge: ${if (enabled) "ON" else "OFF"}")
}

// v63.12: Gesture Swipe Deceleration Custom
internal fun PlayerActivity.showV63GestureSwipeDecelerationCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v63GestureSwipeDecelerationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Deceleration Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63GestureSwipeDecelerationCustom = value
        AppToast.show(this, "Gesture Swipe Deceleration Custom: $value")
    }
}

// v63.13: Video Color Invert
internal fun PlayerActivity.showV63VideoColorInvertToggle() {
    val enabled = !BiliClient.prefs.v63VideoColorInvert
    BiliClient.prefs.v63VideoColorInvert = enabled
    AppToast.show(this, "Video Color Invert: ${if (enabled) "ON" else "OFF"}")
}

// v63.14: Danmaku History Sort Order
internal fun PlayerActivity.showV63DanmakuHistorySortOrderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuHistorySortOrder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku History Sort Order",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63DanmakuHistorySortOrder = value
        AppToast.show(this, "Danmaku History Sort Order: $value")
    }
}

// v63.15: Cast Audio Render Mode
internal fun PlayerActivity.showV63CastAudioRenderModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63CastAudioRenderMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Render Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63CastAudioRenderMode = value
        AppToast.show(this, "Cast Audio Render Mode: $value")
    }
}

// v64.1: Video Adaptive Edge Preserve
internal fun PlayerActivity.showV64VideoAdaptiveEdgePreserveToggle() {
    val enabled = !BiliClient.prefs.v64VideoAdaptiveEdgePreserve
    BiliClient.prefs.v64VideoAdaptiveEdgePreserve = enabled
    AppToast.show(this, "Video Adaptive Edge Preserve: ${if (enabled) "ON" else "OFF"}")
}

// v64.2: Danmaku Fixed Position
internal fun PlayerActivity.showV64DanmakuFixedPositionDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuFixedPosition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Position",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64DanmakuFixedPosition = value
        AppToast.show(this, "Danmaku Fixed Position: $value")
    }
}

// v64.3: Subtitle Animation Fade Out
internal fun PlayerActivity.showV64SubtitleAnimationFadeOutToggle() {
    val enabled = !BiliClient.prefs.v64SubtitleAnimationFadeOut
    BiliClient.prefs.v64SubtitleAnimationFadeOut = enabled
    AppToast.show(this, "Subtitle Animation Fade Out: ${if (enabled) "ON" else "OFF"}")
}

// v64.4: Gesture Multi Finger Gesture
internal fun PlayerActivity.showV64GestureMultiFingerGestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v64GestureMultiFingerGesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Multi Finger Gesture",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64GestureMultiFingerGesture = value
        AppToast.show(this, "Gesture Multi Finger Gesture: $value")
    }
}

// v64.5: Video Color Grayscale
internal fun PlayerActivity.showV64VideoColorGrayscaleToggle() {
    val enabled = !BiliClient.prefs.v64VideoColorGrayscale
    BiliClient.prefs.v64VideoColorGrayscale = enabled
    AppToast.show(this, "Video Color Grayscale: ${if (enabled) "ON" else "OFF"}")
}

// v64.6: Danmaku Send Delay
internal fun PlayerActivity.showV64DanmakuSendDelayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuSendDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64DanmakuSendDelay = value
        AppToast.show(this, "Danmaku Send Delay: $value")
    }
}

// v64.7: Cast Video Post Process
internal fun PlayerActivity.showV64CastVideoPostProcessToggle() {
    val enabled = !BiliClient.prefs.v64CastVideoPostProcess
    BiliClient.prefs.v64CastVideoPostProcess = enabled
    AppToast.show(this, "Cast Video Post Process: ${if (enabled) "ON" else "OFF"}")
}

// v64.8: Subtitle BG Border Color
internal fun PlayerActivity.showV64SubtitleBgBorderColorDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v64SubtitleBgBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64SubtitleBgBorderColor = value
        AppToast.show(this, "Subtitle BG Border Color: $value")
    }
}

// v64.9: Video Adaptive Detail Curve
internal fun PlayerActivity.showV64VideoAdaptiveDetailCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v64VideoAdaptiveDetailCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Detail Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64VideoAdaptiveDetailCurve = value
        AppToast.show(this, "Video Adaptive Detail Curve: $value")
    }
}

// v64.10: Danmaku Filter By User Level
internal fun PlayerActivity.showV64DanmakuFilterByUserLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuFilterByUserLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By User Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64DanmakuFilterByUserLevel = value
        AppToast.show(this, "Danmaku Filter By User Level: $value")
    }
}

// v64.11: Playlist Auto Split
internal fun PlayerActivity.showV64PlaylistAutoSplitToggle() {
    val enabled = !BiliClient.prefs.v64PlaylistAutoSplit
    BiliClient.prefs.v64PlaylistAutoSplit = enabled
    AppToast.show(this, "Playlist Auto Split: ${if (enabled) "ON" else "OFF"}")
}

// v64.12: Gesture Swipe Friction
internal fun PlayerActivity.showV64GestureSwipeFrictionDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v64GestureSwipeFriction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Friction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64GestureSwipeFriction = value
        AppToast.show(this, "Gesture Swipe Friction: $value")
    }
}

// v64.13: Video Color Sepia Strength
internal fun PlayerActivity.showV64VideoColorSepiaStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v64VideoColorSepiaStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Sepia Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64VideoColorSepiaStrength = value
        AppToast.show(this, "Video Color Sepia Strength: $value")
    }
}

// v64.14: Danmaku History Max Items
internal fun PlayerActivity.showV64DanmakuHistoryMaxItemsDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuHistoryMaxItems).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku History Max Items",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64DanmakuHistoryMaxItems = value
        AppToast.show(this, "Danmaku History Max Items: $value")
    }
}

// v64.15: Cast Audio Post Process
internal fun PlayerActivity.showV64CastAudioPostProcessToggle() {
    val enabled = !BiliClient.prefs.v64CastAudioPostProcess
    BiliClient.prefs.v64CastAudioPostProcess = enabled
    AppToast.show(this, "Cast Audio Post Process: ${if (enabled) "ON" else "OFF"}")
}

// v65.1: Video Adaptive Motion Blur
internal fun PlayerActivity.showV65VideoAdaptiveMotionBlurToggle() {
    val enabled = !BiliClient.prefs.v65VideoAdaptiveMotionBlur
    BiliClient.prefs.v65VideoAdaptiveMotionBlur = enabled
    AppToast.show(this, "Video Adaptive Motion Blur: ${if (enabled) "ON" else "OFF"}")
}

// v65.2: Danmaku Scroll Direction
internal fun PlayerActivity.showV65DanmakuScrollDirectionDialog() {
    val options = listOf(0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v65DanmakuScrollDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Direction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65DanmakuScrollDirection = value
        AppToast.show(this, "Danmaku Scroll Direction: $value")
    }
}

// v65.3: Subtitle Animation Slide
internal fun PlayerActivity.showV65SubtitleAnimationSlideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v65SubtitleAnimationSlide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Slide",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65SubtitleAnimationSlide = value
        AppToast.show(this, "Subtitle Animation Slide: $value")
    }
}

// v65.4: Gesture Custom Gesture 1
internal fun PlayerActivity.showV65GestureCustomGesture1Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v65GestureCustomGesture1).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Gesture 1",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65GestureCustomGesture1 = value
        AppToast.show(this, "Gesture Custom Gesture 1: $value")
    }
}

// v65.5: Video Color Posterize Level
internal fun PlayerActivity.showV65VideoColorPosterizeLevelDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v65VideoColorPosterizeLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Posterize Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65VideoColorPosterizeLevel = value
        AppToast.show(this, "Video Color Posterize Level: $value")
    }
}

// v65.6: Danmaku Send Priority Level
internal fun PlayerActivity.showV65DanmakuSendPriorityLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v65DanmakuSendPriorityLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Priority Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65DanmakuSendPriorityLevel = value
        AppToast.show(this, "Danmaku Send Priority Level: $value")
    }
}

// v65.7: Cast Video HDR
internal fun PlayerActivity.showV65CastVideoHDRToggle() {
    val enabled = !BiliClient.prefs.v65CastVideoHDR
    BiliClient.prefs.v65CastVideoHDR = enabled
    AppToast.show(this, "Cast Video HDR: ${if (enabled) "ON" else "OFF"}")
}

// v65.8: Subtitle BG Blur Strength
internal fun PlayerActivity.showV65SubtitleBgBlurStrengthDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v65SubtitleBgBlurStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Blur Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65SubtitleBgBlurStrength = value
        AppToast.show(this, "Subtitle BG Blur Strength: $value")
    }
}

// v65.9: Video Adaptive Luma Curve
internal fun PlayerActivity.showV65VideoAdaptiveLumaCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v65VideoAdaptiveLumaCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Luma Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65VideoAdaptiveLumaCurve = value
        AppToast.show(this, "Video Adaptive Luma Curve: $value")
    }
}

// v65.10: Danmaku Filter By Badge
internal fun PlayerActivity.showV65DanmakuFilterByBadgeToggle() {
    val enabled = !BiliClient.prefs.v65DanmakuFilterByBadge
    BiliClient.prefs.v65DanmakuFilterByBadge = enabled
    AppToast.show(this, "Danmaku Filter By Badge: ${if (enabled) "ON" else "OFF"}")
}

// v65.11: Playlist Auto Deduplicate
internal fun PlayerActivity.showV65PlaylistAutoDeduplicateToggle() {
    val enabled = !BiliClient.prefs.v65PlaylistAutoDeduplicate
    BiliClient.prefs.v65PlaylistAutoDeduplicate = enabled
    AppToast.show(this, "Playlist Auto Deduplicate: ${if (enabled) "ON" else "OFF"}")
}

// v65.12: Gesture Swipe Sensitivity Custom
internal fun PlayerActivity.showV65GestureSwipeSensitivityCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v65GestureSwipeSensitivityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Sensitivity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65GestureSwipeSensitivityCustom = value
        AppToast.show(this, "Gesture Swipe Sensitivity Custom: $value")
    }
}

// v65.13: Video Color Solarize Strength
internal fun PlayerActivity.showV65VideoColorSolarizeStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v65VideoColorSolarizeStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Solarize Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65VideoColorSolarizeStrength = value
        AppToast.show(this, "Video Color Solarize Strength: $value")
    }
}

// v65.14: Danmaku History Auto Export
internal fun PlayerActivity.showV65DanmakuHistoryAutoExportToggle() {
    val enabled = !BiliClient.prefs.v65DanmakuHistoryAutoExport
    BiliClient.prefs.v65DanmakuHistoryAutoExport = enabled
    AppToast.show(this, "Danmaku History Auto Export: ${if (enabled) "ON" else "OFF"}")
}

// v65.15: Cast Audio HDR
internal fun PlayerActivity.showV65CastAudioHDRToggle() {
    val enabled = !BiliClient.prefs.v65CastAudioHDR
    BiliClient.prefs.v65CastAudioHDR = enabled
    AppToast.show(this, "Cast Audio HDR: ${if (enabled) "ON" else "OFF"}")
}

// v66.1: Video Adaptive Frame Blend
internal fun PlayerActivity.showV66VideoAdaptiveFrameBlendToggle() {
    val enabled = !BiliClient.prefs.v66VideoAdaptiveFrameBlend
    BiliClient.prefs.v66VideoAdaptiveFrameBlend = enabled
    AppToast.show(this, "Video Adaptive Frame Blend: ${if (enabled) "ON" else "OFF"}")
}

// v66.2: Danmaku Top Margin
internal fun PlayerActivity.showV66DanmakuTopMarginDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v66DanmakuTopMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66DanmakuTopMargin = value
        AppToast.show(this, "Danmaku Top Margin: $value")
    }
}

// v66.3: Subtitle Animation Bounce
internal fun PlayerActivity.showV66SubtitleAnimationBounceToggle() {
    val enabled = !BiliClient.prefs.v66SubtitleAnimationBounce
    BiliClient.prefs.v66SubtitleAnimationBounce = enabled
    AppToast.show(this, "Subtitle Animation Bounce: ${if (enabled) "ON" else "OFF"}")
}

// v66.4: Gesture Custom Gesture 2
internal fun PlayerActivity.showV66GestureCustomGesture2Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v66GestureCustomGesture2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Gesture 2",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66GestureCustomGesture2 = value
        AppToast.show(this, "Gesture Custom Gesture 2: $value")
    }
}

// v66.5: Video Color Vignette
internal fun PlayerActivity.showV66VideoColorVignetteDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v66VideoColorVignette).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Vignette",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66VideoColorVignette = value
        AppToast.show(this, "Video Color Vignette: $value")
    }
}

// v66.6: Danmaku Send Max Length Per Second
internal fun PlayerActivity.showV66DanmakuSendMaxLengthPerSecondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v66DanmakuSendMaxLengthPerSecond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Per Second",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66DanmakuSendMaxLengthPerSecond = value
        AppToast.show(this, "Danmaku Send Max Length Per Second: $value")
    }
}

// v66.7: Cast Video Dolby Vision
internal fun PlayerActivity.showV66CastVideoDolbyVisionToggle() {
    val enabled = !BiliClient.prefs.v66CastVideoDolbyVision
    BiliClient.prefs.v66CastVideoDolbyVision = enabled
    AppToast.show(this, "Cast Video Dolby Vision: ${if (enabled) "ON" else "OFF"}")
}

// v66.8: Subtitle BG Border Radius
internal fun PlayerActivity.showV66SubtitleBgBorderRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v66SubtitleBgBorderRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66SubtitleBgBorderRadius = value
        AppToast.show(this, "Subtitle BG Border Radius: $value")
    }
}

// v66.9: Video Adaptive Color Curve
internal fun PlayerActivity.showV66VideoAdaptiveColorCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v66VideoAdaptiveColorCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Color Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66VideoAdaptiveColorCurve = value
        AppToast.show(this, "Video Adaptive Color Curve: $value")
    }
}

// v66.10: Danmaku Filter By Medal
internal fun PlayerActivity.showV66DanmakuFilterByMedalToggle() {
    val enabled = !BiliClient.prefs.v66DanmakuFilterByMedal
    BiliClient.prefs.v66DanmakuFilterByMedal = enabled
    AppToast.show(this, "Danmaku Filter By Medal: ${if (enabled) "ON" else "OFF"}")
}

// v66.11: Playlist Auto Shuffle On Start
internal fun PlayerActivity.showV66PlaylistAutoShuffleOnStartToggle() {
    val enabled = !BiliClient.prefs.v66PlaylistAutoShuffleOnStart
    BiliClient.prefs.v66PlaylistAutoShuffleOnStart = enabled
    AppToast.show(this, "Playlist Auto Shuffle On Start: ${if (enabled) "ON" else "OFF"}")
}

// v66.12: Gesture Swipe Momentum
internal fun PlayerActivity.showV66GestureSwipeMomentumDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v66GestureSwipeMomentum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Momentum",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66GestureSwipeMomentum = value
        AppToast.show(this, "Gesture Swipe Momentum: $value")
    }
}

// v66.13: Video Color Duotone
internal fun PlayerActivity.showV66VideoColorDuotoneDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v66VideoColorDuotone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Duotone",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66VideoColorDuotone = value
        AppToast.show(this, "Video Color Duotone: $value")
    }
}

// v66.14: Danmaku History Search Mode
internal fun PlayerActivity.showV66DanmakuHistorySearchModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v66DanmakuHistorySearchMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku History Search Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66DanmakuHistorySearchMode = value
        AppToast.show(this, "Danmaku History Search Mode: $value")
    }
}

// v66.15: Cast Audio Dolby Atmos
internal fun PlayerActivity.showV66CastAudioDolbyAtmosToggle() {
    val enabled = !BiliClient.prefs.v66CastAudioDolbyAtmos
    BiliClient.prefs.v66CastAudioDolbyAtmos = enabled
    AppToast.show(this, "Cast Audio Dolby Atmos: ${if (enabled) "ON" else "OFF"}")
}

// v67.1: Video Adaptive Temporal Blend
internal fun PlayerActivity.showV67VideoAdaptiveTemporalBlendToggle() {
    val enabled = !BiliClient.prefs.v67VideoAdaptiveTemporalBlend
    BiliClient.prefs.v67VideoAdaptiveTemporalBlend = enabled
    AppToast.show(this, "Video Adaptive Temporal Blend: ${if (enabled) "ON" else "OFF"}")
}

// v67.2: Danmaku Bottom Margin
internal fun PlayerActivity.showV67DanmakuBottomMarginDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuBottomMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67DanmakuBottomMargin = value
        AppToast.show(this, "Danmaku Bottom Margin: $value")
    }
}

// v67.3: Subtitle Animation Zoom
internal fun PlayerActivity.showV67SubtitleAnimationZoomToggle() {
    val enabled = !BiliClient.prefs.v67SubtitleAnimationZoom
    BiliClient.prefs.v67SubtitleAnimationZoom = enabled
    AppToast.show(this, "Subtitle Animation Zoom: ${if (enabled) "ON" else "OFF"}")
}

// v67.4: Gesture Custom Gesture 3
internal fun PlayerActivity.showV67GestureCustomGesture3Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67GestureCustomGesture3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Gesture 3",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67GestureCustomGesture3 = value
        AppToast.show(this, "Gesture Custom Gesture 3: $value")
    }
}

// v67.5: Video Color Tilt Shift
internal fun PlayerActivity.showV67VideoColorTiltShiftToggle() {
    val enabled = !BiliClient.prefs.v67VideoColorTiltShift
    BiliClient.prefs.v67VideoColorTiltShift = enabled
    AppToast.show(this, "Video Color Tilt Shift: ${if (enabled) "ON" else "OFF"}")
}

// v67.6: Danmaku Send Rate Per User
internal fun PlayerActivity.showV67DanmakuSendRatePerUserDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuSendRatePerUser).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Rate Per User",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67DanmakuSendRatePerUser = value
        AppToast.show(this, "Danmaku Send Rate Per User: $value")
    }
}

// v67.7: Cast Video 3D
internal fun PlayerActivity.showV67CastVideo3DToggle() {
    val enabled = !BiliClient.prefs.v67CastVideo3D
    BiliClient.prefs.v67CastVideo3D = enabled
    AppToast.show(this, "Cast Video 3D: ${if (enabled) "ON" else "OFF"}")
}

// v67.8: Subtitle BG Gradient Direction
internal fun PlayerActivity.showV67SubtitleBgGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67SubtitleBgGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Direction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67SubtitleBgGradientDirection = value
        AppToast.show(this, "Subtitle BG Gradient Direction: $value")
    }
}

// v67.9: Video Adaptive Spatial Blend
internal fun PlayerActivity.showV67VideoAdaptiveSpatialBlendToggle() {
    val enabled = !BiliClient.prefs.v67VideoAdaptiveSpatialBlend
    BiliClient.prefs.v67VideoAdaptiveSpatialBlend = enabled
    AppToast.show(this, "Video Adaptive Spatial Blend: ${if (enabled) "ON" else "OFF"}")
}

// v67.10: Danmaku Filter By Level
internal fun PlayerActivity.showV67DanmakuFilterByLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuFilterByLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67DanmakuFilterByLevel = value
        AppToast.show(this, "Danmaku Filter By Level: $value")
    }
}

// v67.11: Playlist Auto Repeat Mode
internal fun PlayerActivity.showV67PlaylistAutoRepeatModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67PlaylistAutoRepeatMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Repeat Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67PlaylistAutoRepeatMode = value
        AppToast.show(this, "Playlist Auto Repeat Mode: $value")
    }
}

// v67.12: Gesture Swipe Bounce
internal fun PlayerActivity.showV67GestureSwipeBounceDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v67GestureSwipeBounce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Bounce",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67GestureSwipeBounce = value
        AppToast.show(this, "Gesture Swipe Bounce: $value")
    }
}

// v67.13: Video Color Cross Process
internal fun PlayerActivity.showV67VideoColorCrossProcessToggle() {
    val enabled = !BiliClient.prefs.v67VideoColorCrossProcess
    BiliClient.prefs.v67VideoColorCrossProcess = enabled
    AppToast.show(this, "Video Color Cross Process: ${if (enabled) "ON" else "OFF"}")
}

// v67.14: Danmaku History Export Auto
internal fun PlayerActivity.showV67DanmakuHistoryExportAutoToggle() {
    val enabled = !BiliClient.prefs.v67DanmakuHistoryExportAuto
    BiliClient.prefs.v67DanmakuHistoryExportAuto = enabled
    AppToast.show(this, "Danmaku History Export Auto: ${if (enabled) "ON" else "OFF"}")
}

// v67.15: Cast Audio Spatial
internal fun PlayerActivity.showV67CastAudioSpatialToggle() {
    val enabled = !BiliClient.prefs.v67CastAudioSpatial
    BiliClient.prefs.v67CastAudioSpatial = enabled
    AppToast.show(this, "Cast Audio Spatial: ${if (enabled) "ON" else "OFF"}")
}

// v68.1: Video Adaptive Color Balance
internal fun PlayerActivity.showV68VideoAdaptiveColorBalanceToggle() {
    val enabled = !BiliClient.prefs.v68VideoAdaptiveColorBalance
    BiliClient.prefs.v68VideoAdaptiveColorBalance = enabled
    AppToast.show(this, "Video Adaptive Color Balance: ${if (enabled) "ON" else "OFF"}")
}

// v68.2: Danmaku Left Right Margin
internal fun PlayerActivity.showV68DanmakuLeftRightMarginDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v68DanmakuLeftRightMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Left Right Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68DanmakuLeftRightMargin = value
        AppToast.show(this, "Danmaku Left Right Margin: $value")
    }
}

// v68.3: Subtitle Animation Rotate
internal fun PlayerActivity.showV68SubtitleAnimationRotateToggle() {
    val enabled = !BiliClient.prefs.v68SubtitleAnimationRotate
    BiliClient.prefs.v68SubtitleAnimationRotate = enabled
    AppToast.show(this, "Subtitle Animation Rotate: ${if (enabled) "ON" else "OFF"}")
}

// v68.4: Gesture Custom Gesture 4
internal fun PlayerActivity.showV68GestureCustomGesture4Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v68GestureCustomGesture4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Gesture 4",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68GestureCustomGesture4 = value
        AppToast.show(this, "Gesture Custom Gesture 4: $value")
    }
}

// v68.5: Video Color Fisheye
internal fun PlayerActivity.showV68VideoColorFisheyeDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v68VideoColorFisheye).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Fisheye",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68VideoColorFisheye = value
        AppToast.show(this, "Video Color Fisheye: $value")
    }
}

// v68.6: Danmaku Send Max Length Per Minute
internal fun PlayerActivity.showV68DanmakuSendMaxLengthPerMinuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v68DanmakuSendMaxLengthPerMinute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Per Minute",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68DanmakuSendMaxLengthPerMinute = value
        AppToast.show(this, "Danmaku Send Max Length Per Minute: $value")
    }
}

// v68.7: Cast Video Surround
internal fun PlayerActivity.showV68CastVideoSurroundToggle() {
    val enabled = !BiliClient.prefs.v68CastVideoSurround
    BiliClient.prefs.v68CastVideoSurround = enabled
    AppToast.show(this, "Cast Video Surround: ${if (enabled) "ON" else "OFF"}")
}

// v68.8: Subtitle BG Gradient Color
internal fun PlayerActivity.showV68SubtitleBgGradientColorDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v68SubtitleBgGradientColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68SubtitleBgGradientColor = value
        AppToast.show(this, "Subtitle BG Gradient Color: $value")
    }
}

// v68.9: Video Adaptive Noise Reduce
internal fun PlayerActivity.showV68VideoAdaptiveNoiseReduceToggle() {
    val enabled = !BiliClient.prefs.v68VideoAdaptiveNoiseReduce
    BiliClient.prefs.v68VideoAdaptiveNoiseReduce = enabled
    AppToast.show(this, "Video Adaptive Noise Reduce: ${if (enabled) "ON" else "OFF"}")
}

// v68.10: Danmaku Filter By Title
internal fun PlayerActivity.showV68DanmakuFilterByTitleToggle() {
    val enabled = !BiliClient.prefs.v68DanmakuFilterByTitle
    BiliClient.prefs.v68DanmakuFilterByTitle = enabled
    AppToast.show(this, "Danmaku Filter By Title: ${if (enabled) "ON" else "OFF"}")
}

// v68.11: Playlist Auto Next On End
internal fun PlayerActivity.showV68PlaylistAutoNextOnEndToggle() {
    val enabled = !BiliClient.prefs.v68PlaylistAutoNextOnEnd
    BiliClient.prefs.v68PlaylistAutoNextOnEnd = enabled
    AppToast.show(this, "Playlist Auto Next On End: ${if (enabled) "ON" else "OFF"}")
}

// v68.12: Gesture Swipe Elastic
internal fun PlayerActivity.showV68GestureSwipeElasticDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v68GestureSwipeElastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Elastic",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68GestureSwipeElastic = value
        AppToast.show(this, "Gesture Swipe Elastic: $value")
    }
}

// v68.13: Video Color Chromatic Aberration
internal fun PlayerActivity.showV68VideoColorChromaticAberrationDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v68VideoColorChromaticAberration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Chromatic Aberration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68VideoColorChromaticAberration = value
        AppToast.show(this, "Video Color Chromatic Aberration: $value")
    }
}

// v68.14: Danmaku History Import
internal fun PlayerActivity.showV68DanmakuHistoryImportToggle() {
    val enabled = !BiliClient.prefs.v68DanmakuHistoryImport
    BiliClient.prefs.v68DanmakuHistoryImport = enabled
    AppToast.show(this, "Danmaku History Import: ${if (enabled) "ON" else "OFF"}")
}

// v68.15: Cast Audio Surround
internal fun PlayerActivity.showV68CastAudioSurroundToggle() {
    val enabled = !BiliClient.prefs.v68CastAudioSurround
    BiliClient.prefs.v68CastAudioSurround = enabled
    AppToast.show(this, "Cast Audio Surround: ${if (enabled) "ON" else "OFF"}")
}

// v69.1: Video Adaptive Detail Enhance
internal fun PlayerActivity.showV69VideoAdaptiveDetailEnhanceToggle() {
    val enabled = !BiliClient.prefs.v69VideoAdaptiveDetailEnhance
    BiliClient.prefs.v69VideoAdaptiveDetailEnhance = enabled
    AppToast.show(this, "Video Adaptive Detail Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v69.2: Danmaku Line Spacing
internal fun PlayerActivity.showV69DanmakuLineSpacingDialog() {
    val options = listOf(80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v69DanmakuLineSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Line Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69DanmakuLineSpacing = value
        AppToast.show(this, "Danmaku Line Spacing: $value")
    }
}

// v69.3: Subtitle Animation Typewriter
internal fun PlayerActivity.showV69SubtitleAnimationTypewriterToggle() {
    val enabled = !BiliClient.prefs.v69SubtitleAnimationTypewriter
    BiliClient.prefs.v69SubtitleAnimationTypewriter = enabled
    AppToast.show(this, "Subtitle Animation Typewriter: ${if (enabled) "ON" else "OFF"}")
}

// v69.4: Gesture Custom Action 5
internal fun PlayerActivity.showV69GestureCustomAction5Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v69GestureCustomAction5).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Action 5",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69GestureCustomAction5 = value
        AppToast.show(this, "Gesture Custom Action 5: $value")
    }
}

// v69.5: Video Color Barrel Distortion
internal fun PlayerActivity.showV69VideoColorBarrelDistortionDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v69VideoColorBarrelDistortion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Barrel Distortion",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69VideoColorBarrelDistortion = value
        AppToast.show(this, "Video Color Barrel Distortion: $value")
    }
}

// v69.6: Danmaku Send Max Length Total
internal fun PlayerActivity.showV69DanmakuSendMaxLengthTotalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v69DanmakuSendMaxLengthTotal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Total",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69DanmakuSendMaxLengthTotal = value
        AppToast.show(this, "Danmaku Send Max Length Total: $value")
    }
}

// v69.7: Cast Video Multi View
internal fun PlayerActivity.showV69CastVideoMultiViewToggle() {
    val enabled = !BiliClient.prefs.v69CastVideoMultiView
    BiliClient.prefs.v69CastVideoMultiView = enabled
    AppToast.show(this, "Cast Video Multi View: ${if (enabled) "ON" else "OFF"}")
}

// v69.8: Subtitle BG Padding X
internal fun PlayerActivity.showV69SubtitleBgPaddingXDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v69SubtitleBgPaddingX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Padding X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69SubtitleBgPaddingX = value
        AppToast.show(this, "Subtitle BG Padding X: $value")
    }
}

// v69.9: Video Adaptive Chroma Enhance
internal fun PlayerActivity.showV69VideoAdaptiveChromaEnhanceToggle() {
    val enabled = !BiliClient.prefs.v69VideoAdaptiveChromaEnhance
    BiliClient.prefs.v69VideoAdaptiveChromaEnhance = enabled
    AppToast.show(this, "Video Adaptive Chroma Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v69.10: Danmaku Filter By Content
internal fun PlayerActivity.showV69DanmakuFilterByContentToggle() {
    val enabled = !BiliClient.prefs.v69DanmakuFilterByContent
    BiliClient.prefs.v69DanmakuFilterByContent = enabled
    AppToast.show(this, "Danmaku Filter By Content: ${if (enabled) "ON" else "OFF"}")
}

// v69.11: Playlist Auto Resume
internal fun PlayerActivity.showV69PlaylistAutoResumeToggle() {
    val enabled = !BiliClient.prefs.v69PlaylistAutoResume
    BiliClient.prefs.v69PlaylistAutoResume = enabled
    AppToast.show(this, "Playlist Auto Resume: ${if (enabled) "ON" else "OFF"}")
}

// v69.12: Gesture Swipe Rubber Band
internal fun PlayerActivity.showV69GestureSwipeRubberBandDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v69GestureSwipeRubberBand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Rubber Band",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69GestureSwipeRubberBand = value
        AppToast.show(this, "Gesture Swipe Rubber Band: $value")
    }
}

// v69.13: Video Color Pincushion
internal fun PlayerActivity.showV69VideoColorPincushionDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v69VideoColorPincushion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Pincushion",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69VideoColorPincushion = value
        AppToast.show(this, "Video Color Pincushion: $value")
    }
}

// v69.14: Danmaku History Clear
internal fun PlayerActivity.showV69DanmakuHistoryClearToggle() {
    val enabled = !BiliClient.prefs.v69DanmakuHistoryClear
    BiliClient.prefs.v69DanmakuHistoryClear = enabled
    AppToast.show(this, "Danmaku History Clear: ${if (enabled) "ON" else "OFF"}")
}

// v69.15: Cast Audio Multi View
internal fun PlayerActivity.showV69CastAudioMultiViewToggle() {
    val enabled = !BiliClient.prefs.v69CastAudioMultiView
    BiliClient.prefs.v69CastAudioMultiView = enabled
    AppToast.show(this, "Cast Audio Multi View: ${if (enabled) "ON" else "OFF"}")
}

// v70.1: Video Adaptive Luma Enhance
internal fun PlayerActivity.showV70VideoAdaptiveLumaEnhanceToggle() {
    val enabled = !BiliClient.prefs.v70VideoAdaptiveLumaEnhance
    BiliClient.prefs.v70VideoAdaptiveLumaEnhance = enabled
    AppToast.show(this, "Video Adaptive Luma Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v70.2: Danmaku Character Spacing
internal fun PlayerActivity.showV70DanmakuCharacterSpacingDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v70DanmakuCharacterSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Character Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70DanmakuCharacterSpacing = value
        AppToast.show(this, "Danmaku Character Spacing: $value")
    }
}

// v70.3: Subtitle Animation Highlight
internal fun PlayerActivity.showV70SubtitleAnimationHighlightToggle() {
    val enabled = !BiliClient.prefs.v70SubtitleAnimationHighlight
    BiliClient.prefs.v70SubtitleAnimationHighlight = enabled
    AppToast.show(this, "Subtitle Animation Highlight: ${if (enabled) "ON" else "OFF"}")
}

// v70.4: Gesture Custom Action 6
internal fun PlayerActivity.showV70GestureCustomAction6Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v70GestureCustomAction6).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Action 6",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70GestureCustomAction6 = value
        AppToast.show(this, "Gesture Custom Action 6: $value")
    }
}

// v70.5: Video Color Wave Distortion
internal fun PlayerActivity.showV70VideoColorWaveDistortionDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v70VideoColorWaveDistortion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Wave Distortion",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70VideoColorWaveDistortion = value
        AppToast.show(this, "Video Color Wave Distortion: $value")
    }
}

// v70.6: Danmaku Send Max Length VIP
internal fun PlayerActivity.showV70DanmakuSendMaxLengthVIPDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v70DanmakuSendMaxLengthVIP).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length VIP",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70DanmakuSendMaxLengthVIP = value
        AppToast.show(this, "Danmaku Send Max Length VIP: $value")
    }
}

// v70.7: Cast Video Multi Screen
internal fun PlayerActivity.showV70CastVideoMultiScreenToggle() {
    val enabled = !BiliClient.prefs.v70CastVideoMultiScreen
    BiliClient.prefs.v70CastVideoMultiScreen = enabled
    AppToast.show(this, "Cast Video Multi Screen: ${if (enabled) "ON" else "OFF"}")
}

// v70.8: Subtitle BG Padding Y
internal fun PlayerActivity.showV70SubtitleBgPaddingYDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v70SubtitleBgPaddingY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Padding Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70SubtitleBgPaddingY = value
        AppToast.show(this, "Subtitle BG Padding Y: $value")
    }
}

// v70.9: Video Adaptive Color Enhance Curve
internal fun PlayerActivity.showV70VideoAdaptiveColorEnhanceCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v70VideoAdaptiveColorEnhanceCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Color Enhance Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70VideoAdaptiveColorEnhanceCurve = value
        AppToast.show(this, "Video Adaptive Color Enhance Curve: $value")
    }
}

// v70.10: Danmaku Filter By Gift
internal fun PlayerActivity.showV70DanmakuFilterByGiftToggle() {
    val enabled = !BiliClient.prefs.v70DanmakuFilterByGift
    BiliClient.prefs.v70DanmakuFilterByGift = enabled
    AppToast.show(this, "Danmaku Filter By Gift: ${if (enabled) "ON" else "OFF"}")
}

// v70.11: Playlist Auto Create
internal fun PlayerActivity.showV70PlaylistAutoCreateToggle() {
    val enabled = !BiliClient.prefs.v70PlaylistAutoCreate
    BiliClient.prefs.v70PlaylistAutoCreate = enabled
    AppToast.show(this, "Playlist Auto Create: ${if (enabled) "ON" else "OFF"}")
}

// v70.12: Gesture Swipe Spring
internal fun PlayerActivity.showV70GestureSwipeSpringDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v70GestureSwipeSpring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Spring",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70GestureSwipeSpring = value
        AppToast.show(this, "Gesture Swipe Spring: $value")
    }
}

// v70.13: Video Color Glitch
internal fun PlayerActivity.showV70VideoColorGlitchDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v70VideoColorGlitch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Glitch",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70VideoColorGlitch = value
        AppToast.show(this, "Video Color Glitch: $value")
    }
}

// v70.14: Danmaku History Stats
internal fun PlayerActivity.showV70DanmakuHistoryStatsToggle() {
    val enabled = !BiliClient.prefs.v70DanmakuHistoryStats
    BiliClient.prefs.v70DanmakuHistoryStats = enabled
    AppToast.show(this, "Danmaku History Stats: ${if (enabled) "ON" else "OFF"}")
}

// v70.15: Cast Audio Multi Screen
internal fun PlayerActivity.showV70CastAudioMultiScreenToggle() {
    val enabled = !BiliClient.prefs.v70CastAudioMultiScreen
    BiliClient.prefs.v70CastAudioMultiScreen = enabled
    AppToast.show(this, "Cast Audio Multi Screen: ${if (enabled) "ON" else "OFF"}")
}

// v71.1: Video Stabilization Strength
internal fun PlayerActivity.showV71VideoStabilizationStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v71VideoStabilizationStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Stabilization Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71VideoStabilizationStrength = value
        AppToast.show(this, "Video Stabilization Strength: $value")
    }
}

// v71.2: Danmaku Collision Avoidance
internal fun PlayerActivity.showV71DanmakuCollisionAvoidanceToggle() {
    val enabled = !BiliClient.prefs.v71DanmakuCollisionAvoidance
    BiliClient.prefs.v71DanmakuCollisionAvoidance = enabled
    AppToast.show(this, "Danmaku Collision Avoidance: ${if (enabled) "ON" else "OFF"}")
}

// v71.3: Subtitle Word Wrap Mode
internal fun PlayerActivity.showV71SubtitleWordWrapModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v71SubtitleWordWrapMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Word Wrap Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71SubtitleWordWrapMode = value
        AppToast.show(this, "Subtitle Word Wrap Mode: $value")
    }
}

// v71.4: Gesture Sensitivity Profile
internal fun PlayerActivity.showV71GestureSensitivityProfileDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v71GestureSensitivityProfile).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Sensitivity Profile",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71GestureSensitivityProfile = value
        AppToast.show(this, "Gesture Sensitivity Profile: $value")
    }
}

// v71.5: Cast Video Stabilization
internal fun PlayerActivity.showV71CastVideoStabilizationToggle() {
    val enabled = !BiliClient.prefs.v71CastVideoStabilization
    BiliClient.prefs.v71CastVideoStabilization = enabled
    AppToast.show(this, "Cast Video Stabilization: ${if (enabled) "ON" else "OFF"}")
}

// v71.6: Playlist Auto Recover
internal fun PlayerActivity.showV71PlaylistAutoRecoverToggle() {
    val enabled = !BiliClient.prefs.v71PlaylistAutoRecover
    BiliClient.prefs.v71PlaylistAutoRecover = enabled
    AppToast.show(this, "Playlist Auto Recover: ${if (enabled) "ON" else "OFF"}")
}

// v71.7: Cache Integrity Check
internal fun PlayerActivity.showV71CacheIntegrityCheckToggle() {
    val enabled = !BiliClient.prefs.v71CacheIntegrityCheck
    BiliClient.prefs.v71CacheIntegrityCheck = enabled
    AppToast.show(this, "Cache Integrity Check: ${if (enabled) "ON" else "OFF"}")
}

// v71.8: Progress Bar Chapter Marks
internal fun PlayerActivity.showV71ProgressBarChapterMarksToggle() {
    val enabled = !BiliClient.prefs.v71ProgressBarChapterMarks
    BiliClient.prefs.v71ProgressBarChapterMarks = enabled
    AppToast.show(this, "Progress Bar Chapter Marks: ${if (enabled) "ON" else "OFF"}")
}

// v71.9: Volume Normalization Auto
internal fun PlayerActivity.showV71VolumeNormalizationAutoToggle() {
    val enabled = !BiliClient.prefs.v71VolumeNormalizationAuto
    BiliClient.prefs.v71VolumeNormalizationAuto = enabled
    AppToast.show(this, "Volume Normalization Auto: ${if (enabled) "ON" else "OFF"}")
}

// v71.10: History Auto Sync
internal fun PlayerActivity.showV71HistoryAutoSyncToggle() {
    val enabled = !BiliClient.prefs.v71HistoryAutoSync
    BiliClient.prefs.v71HistoryAutoSync = enabled
    AppToast.show(this, "History Auto Sync: ${if (enabled) "ON" else "OFF"}")
}

// v71.11: Playback Resume From Bookmark
internal fun PlayerActivity.showV71PlaybackResumeFromBookmarkToggle() {
    val enabled = !BiliClient.prefs.v71PlaybackResumeFromBookmark
    BiliClient.prefs.v71PlaybackResumeFromBookmark = enabled
    AppToast.show(this, "Playback Resume From Bookmark: ${if (enabled) "ON" else "OFF"}")
}

// v71.12: Screenshot Auto Annotate
internal fun PlayerActivity.showV71ScreenshotAutoAnnotateToggle() {
    val enabled = !BiliClient.prefs.v71ScreenshotAutoAnnotate
    BiliClient.prefs.v71ScreenshotAutoAnnotate = enabled
    AppToast.show(this, "Screenshot Auto Annotate: ${if (enabled) "ON" else "OFF"}")
}

// v71.13: Video HDR10+
internal fun PlayerActivity.showV71VideoHDR10PlusToggle() {
    val enabled = !BiliClient.prefs.v71VideoHDR10Plus
    BiliClient.prefs.v71VideoHDR10Plus = enabled
    AppToast.show(this, "Video HDR10+: ${if (enabled) "ON" else "OFF"}")
}

// v71.14: Danmaku Layer Management
internal fun PlayerActivity.showV71DanmakuLayerManagementDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v71DanmakuLayerManagement).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Layer Management",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71DanmakuLayerManagement = value
        AppToast.show(this, "Danmaku Layer Management: $value")
    }
}

// v71.15: Subtitle Line Spacing Custom
internal fun PlayerActivity.showV71SubtitleLineSpacingCustomDialog() {
    val options = listOf(80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v71SubtitleLineSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Line Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71SubtitleLineSpacingCustom = value
        AppToast.show(this, "Subtitle Line Spacing Custom: $value")
    }
}

// v72.1: Video Frame Rate Convert
internal fun PlayerActivity.showV72VideoFrameRateConvertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72VideoFrameRateConvert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Frame Rate Convert",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72VideoFrameRateConvert = value
        AppToast.show(this, "Video Frame Rate Convert: $value")
    }
}

// v72.2: Danmaku Priority System
internal fun PlayerActivity.showV72DanmakuPrioritySystemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72DanmakuPrioritySystem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Priority System",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72DanmakuPrioritySystem = value
        AppToast.show(this, "Danmaku Priority System: $value")
    }
}

// v72.3: Subtitle Char Spacing Custom
internal fun PlayerActivity.showV72SubtitleCharSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v72SubtitleCharSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Char Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72SubtitleCharSpacingCustom = value
        AppToast.show(this, "Subtitle Char Spacing Custom: $value")
    }
}

// v72.4: Gesture Dead Zone Custom
internal fun PlayerActivity.showV72GestureDeadZoneCustomDialog() {
    val options = listOf(5, 10, 15, 20, 25)
    val currentIndex = options.indexOf(BiliClient.prefs.v72GestureDeadZoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Dead Zone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72GestureDeadZoneCustom = value
        AppToast.show(this, "Gesture Dead Zone Custom: $value")
    }
}

// v72.5: Cast Audio Normalization
internal fun PlayerActivity.showV72CastAudioNormalizationToggle() {
    val enabled = !BiliClient.prefs.v72CastAudioNormalization
    BiliClient.prefs.v72CastAudioNormalization = enabled
    AppToast.show(this, "Cast Audio Normalization: ${if (enabled) "ON" else "OFF"}")
}

// v72.6: Playlist Auto Recover Mode
internal fun PlayerActivity.showV72PlaylistAutoRecoverModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72PlaylistAutoRecoverMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72PlaylistAutoRecoverMode = value
        AppToast.show(this, "Playlist Auto Recover Mode: $value")
    }
}

// v72.7: Cache Deduplication
internal fun PlayerActivity.showV72CacheDeduplicationToggle() {
    val enabled = !BiliClient.prefs.v72CacheDeduplication
    BiliClient.prefs.v72CacheDeduplication = enabled
    AppToast.show(this, "Cache Deduplication: ${if (enabled) "ON" else "OFF"}")
}

// v72.8: Progress Bar Buffer Indicator
internal fun PlayerActivity.showV72ProgressBarBufferIndicatorToggle() {
    val enabled = !BiliClient.prefs.v72ProgressBarBufferIndicator
    BiliClient.prefs.v72ProgressBarBufferIndicator = enabled
    AppToast.show(this, "Progress Bar Buffer Indicator: ${if (enabled) "ON" else "OFF"}")
}

// v72.9: Volume Compression Strength
internal fun PlayerActivity.showV72VolumeCompressionStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v72VolumeCompressionStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Compression Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72VolumeCompressionStrength = value
        AppToast.show(this, "Volume Compression Strength: $value")
    }
}

// v72.10: History Auto Backup
internal fun PlayerActivity.showV72HistoryAutoBackupToggle() {
    val enabled = !BiliClient.prefs.v72HistoryAutoBackup
    BiliClient.prefs.v72HistoryAutoBackup = enabled
    AppToast.show(this, "History Auto Backup: ${if (enabled) "ON" else "OFF"}")
}

// v72.11: Playback Auto Bookmark
internal fun PlayerActivity.showV72PlaybackAutoBookmarkToggle() {
    val enabled = !BiliClient.prefs.v72PlaybackAutoBookmark
    BiliClient.prefs.v72PlaybackAutoBookmark = enabled
    AppToast.show(this, "Playback Auto Bookmark: ${if (enabled) "ON" else "OFF"}")
}

// v72.12: Screenshot Auto Share
internal fun PlayerActivity.showV72ScreenshotAutoShareToggle() {
    val enabled = !BiliClient.prefs.v72ScreenshotAutoShare
    BiliClient.prefs.v72ScreenshotAutoShare = enabled
    AppToast.show(this, "Screenshot Auto Share: ${if (enabled) "ON" else "OFF"}")
}

// v72.13: Video Dolby Vision Profile
internal fun PlayerActivity.showV72VideoDolbyVisionProfileDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72VideoDolbyVisionProfile).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Dolby Vision Profile",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72VideoDolbyVisionProfile = value
        AppToast.show(this, "Video Dolby Vision Profile: $value")
    }
}

// v72.14: Danmaku Animation Effects
internal fun PlayerActivity.showV72DanmakuAnimationEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72DanmakuAnimationEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Animation Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72DanmakuAnimationEffects = value
        AppToast.show(this, "Danmaku Animation Effects: $value")
    }
}

// v72.15: Subtitle BG Gradient Custom
internal fun PlayerActivity.showV72SubtitleBgGradientCustomToggle() {
    val enabled = !BiliClient.prefs.v72SubtitleBgGradientCustom
    BiliClient.prefs.v72SubtitleBgGradientCustom = enabled
    AppToast.show(this, "Subtitle BG Gradient Custom: ${if (enabled) "ON" else "OFF"}")
}

// v73.1: Video Color Space Convert
internal fun PlayerActivity.showV73VideoColorSpaceConvertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73VideoColorSpaceConvert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space Convert",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73VideoColorSpaceConvert = value
        AppToast.show(this, "Video Color Space Convert: $value")
    }
}

// v73.2: Danmaku Scroll Direction Custom
internal fun PlayerActivity.showV73DanmakuScrollDirectionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73DanmakuScrollDirectionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Direction Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73DanmakuScrollDirectionCustom = value
        AppToast.show(this, "Danmaku Scroll Direction Custom: $value")
    }
}

// v73.3: Subtitle Animation Custom
internal fun PlayerActivity.showV73SubtitleAnimationCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73SubtitleAnimationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73SubtitleAnimationCustom = value
        AppToast.show(this, "Subtitle Animation Custom: $value")
    }
}

// v73.4: Gesture Feedback Mode
internal fun PlayerActivity.showV73GestureFeedbackModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73GestureFeedbackMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Feedback Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73GestureFeedbackMode = value
        AppToast.show(this, "Gesture Feedback Mode: $value")
    }
}

// v73.5: Cast Video Color Space
internal fun PlayerActivity.showV73CastVideoColorSpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73CastVideoColorSpace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Color Space",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73CastVideoColorSpace = value
        AppToast.show(this, "Cast Video Color Space: $value")
    }
}

// v73.6: Playlist Auto Recover Priority
internal fun PlayerActivity.showV73PlaylistAutoRecoverPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73PlaylistAutoRecoverPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73PlaylistAutoRecoverPriority = value
        AppToast.show(this, "Playlist Auto Recover Priority: $value")
    }
}

// v73.7: Cache Verification Mode
internal fun PlayerActivity.showV73CacheVerificationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73CacheVerificationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Verification Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73CacheVerificationMode = value
        AppToast.show(this, "Cache Verification Mode: $value")
    }
}

// v73.8: Progress Bar Thumb Style
internal fun PlayerActivity.showV73ProgressBarThumbStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73ProgressBarThumbStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Style",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73ProgressBarThumbStyle = value
        AppToast.show(this, "Progress Bar Thumb Style: $value")
    }
}

// v73.9: Volume Expansion Strength
internal fun PlayerActivity.showV73VolumeExpansionStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v73VolumeExpansionStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Expansion Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73VolumeExpansionStrength = value
        AppToast.show(this, "Volume Expansion Strength: $value")
    }
}

// v73.10: History Auto Sync Mode
internal fun PlayerActivity.showV73HistoryAutoSyncModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73HistoryAutoSyncMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Sync Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73HistoryAutoSyncMode = value
        AppToast.show(this, "History Auto Sync Mode: $value")
    }
}

// v73.11: Playback Auto Bookmark Mode
internal fun PlayerActivity.showV73PlaybackAutoBookmarkModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73PlaybackAutoBookmarkMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Bookmark Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73PlaybackAutoBookmarkMode = value
        AppToast.show(this, "Playback Auto Bookmark Mode: $value")
    }
}

// v73.12: Screenshot Auto Edit
internal fun PlayerActivity.showV73ScreenshotAutoEditToggle() {
    val enabled = !BiliClient.prefs.v73ScreenshotAutoEdit
    BiliClient.prefs.v73ScreenshotAutoEdit = enabled
    AppToast.show(this, "Screenshot Auto Edit: ${if (enabled) "ON" else "OFF"}")
}

// v73.13: Video Alpha Channel
internal fun PlayerActivity.showV73VideoAlphaChannelToggle() {
    val enabled = !BiliClient.prefs.v73VideoAlphaChannel
    BiliClient.prefs.v73VideoAlphaChannel = enabled
    AppToast.show(this, "Video Alpha Channel: ${if (enabled) "ON" else "OFF"}")
}

// v73.14: Danmaku Font Weight Adaptive
internal fun PlayerActivity.showV73DanmakuFontWeightAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v73DanmakuFontWeightAdaptive
    BiliClient.prefs.v73DanmakuFontWeightAdaptive = enabled
    AppToast.show(this, "Danmaku Font Weight Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v73.15: Subtitle Outline Effects
internal fun PlayerActivity.showV73SubtitleOutlineEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73SubtitleOutlineEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73SubtitleOutlineEffects = value
        AppToast.show(this, "Subtitle Outline Effects: $value")
    }
}

// v74.1: Video Depth Of Field
internal fun PlayerActivity.showV74VideoDepthOfFieldToggle() {
    val enabled = !BiliClient.prefs.v74VideoDepthOfField
    BiliClient.prefs.v74VideoDepthOfField = enabled
    AppToast.show(this, "Video Depth Of Field: ${if (enabled) "ON" else "OFF"}")
}

// v74.2: Danmaku Background Blur
internal fun PlayerActivity.showV74DanmakuBackgroundBlurDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v74DanmakuBackgroundBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Background Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74DanmakuBackgroundBlur = value
        AppToast.show(this, "Danmaku Background Blur: $value")
    }
}

// v74.3: Subtitle Shadow Effects
internal fun PlayerActivity.showV74SubtitleShadowEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74SubtitleShadowEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74SubtitleShadowEffects = value
        AppToast.show(this, "Subtitle Shadow Effects: $value")
    }
}

// v74.4: Gesture Animation Mode
internal fun PlayerActivity.showV74GestureAnimationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74GestureAnimationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Animation Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74GestureAnimationMode = value
        AppToast.show(this, "Gesture Animation Mode: $value")
    }
}

// v74.5: Cast Video HDR10+
internal fun PlayerActivity.showV74CastVideoHDR10PlusToggle() {
    val enabled = !BiliClient.prefs.v74CastVideoHDR10Plus
    BiliClient.prefs.v74CastVideoHDR10Plus = enabled
    AppToast.show(this, "Cast Video HDR10+: ${if (enabled) "ON" else "OFF"}")
}

// v74.6: Playlist Auto Recover Time
internal fun PlayerActivity.showV74PlaylistAutoRecoverTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74PlaylistAutoRecoverTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74PlaylistAutoRecoverTime = value
        AppToast.show(this, "Playlist Auto Recover Time: $value")
    }
}

// v74.7: Cache Compression Mode
internal fun PlayerActivity.showV74CacheCompressionModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74CacheCompressionMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Compression Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74CacheCompressionMode = value
        AppToast.show(this, "Cache Compression Mode: $value")
    }
}

// v74.8: Progress Bar Seek Preview
internal fun PlayerActivity.showV74ProgressBarSeekPreviewToggle() {
    val enabled = !BiliClient.prefs.v74ProgressBarSeekPreview
    BiliClient.prefs.v74ProgressBarSeekPreview = enabled
    AppToast.show(this, "Progress Bar Seek Preview: ${if (enabled) "ON" else "OFF"}")
}

// v74.9: Volume Equalizer Preset
internal fun PlayerActivity.showV74VolumeEqualizerPresetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74VolumeEqualizerPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Equalizer Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74VolumeEqualizerPreset = value
        AppToast.show(this, "Volume Equalizer Preset: $value")
    }
}

// v74.10: History Auto Backup Mode
internal fun PlayerActivity.showV74HistoryAutoBackupModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74HistoryAutoBackupMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Backup Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74HistoryAutoBackupMode = value
        AppToast.show(this, "History Auto Backup Mode: $value")
    }
}

// v74.11: Playback Auto Pause On Focus
internal fun PlayerActivity.showV74PlaybackAutoPauseOnFocusToggle() {
    val enabled = !BiliClient.prefs.v74PlaybackAutoPauseOnFocus
    BiliClient.prefs.v74PlaybackAutoPauseOnFocus = enabled
    AppToast.show(this, "Playback Auto Pause On Focus: ${if (enabled) "ON" else "OFF"}")
}

// v74.12: Screenshot Auto Crop
internal fun PlayerActivity.showV74ScreenshotAutoCropToggle() {
    val enabled = !BiliClient.prefs.v74ScreenshotAutoCrop
    BiliClient.prefs.v74ScreenshotAutoCrop = enabled
    AppToast.show(this, "Screenshot Auto Crop: ${if (enabled) "ON" else "OFF"}")
}

// v74.13: Video Bokeh Effect
internal fun PlayerActivity.showV74VideoBokehEffectToggle() {
    val enabled = !BiliClient.prefs.v74VideoBokehEffect
    BiliClient.prefs.v74VideoBokehEffect = enabled
    AppToast.show(this, "Video Bokeh Effect: ${if (enabled) "ON" else "OFF"}")
}

// v74.14: Danmaku Shadow Effects
internal fun PlayerActivity.showV74DanmakuShadowEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74DanmakuShadowEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Shadow Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74DanmakuShadowEffects = value
        AppToast.show(this, "Danmaku Shadow Effects: $value")
    }
}

// v74.15: Subtitle Glow Effects
internal fun PlayerActivity.showV74SubtitleGlowEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74SubtitleGlowEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Glow Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74SubtitleGlowEffects = value
        AppToast.show(this, "Subtitle Glow Effects: $value")
    }
}

// v75.1: Video Chroma Key
internal fun PlayerActivity.showV75VideoChromaKeyToggle() {
    val enabled = !BiliClient.prefs.v75VideoChromaKey
    BiliClient.prefs.v75VideoChromaKey = enabled
    AppToast.show(this, "Video Chroma Key: ${if (enabled) "ON" else "OFF"}")
}

// v75.2: Danmaku Glow Effects
internal fun PlayerActivity.showV75DanmakuGlowEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75DanmakuGlowEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Glow Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75DanmakuGlowEffects = value
        AppToast.show(this, "Danmaku Glow Effects: $value")
    }
}

// v75.3: Subtitle Border Effects
internal fun PlayerActivity.showV75SubtitleBorderEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75SubtitleBorderEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Border Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75SubtitleBorderEffects = value
        AppToast.show(this, "Subtitle Border Effects: $value")
    }
}

// v75.4: Gesture Sound Feedback
internal fun PlayerActivity.showV75GestureSoundFeedbackToggle() {
    val enabled = !BiliClient.prefs.v75GestureSoundFeedback
    BiliClient.prefs.v75GestureSoundFeedback = enabled
    AppToast.show(this, "Gesture Sound Feedback: ${if (enabled) "ON" else "OFF"}")
}

// v75.5: Cast Audio Spatial
internal fun PlayerActivity.showV75CastAudioSpatialToggle() {
    val enabled = !BiliClient.prefs.v75CastAudioSpatial
    BiliClient.prefs.v75CastAudioSpatial = enabled
    AppToast.show(this, "Cast Audio Spatial: ${if (enabled) "ON" else "OFF"}")
}

// v75.6: Playlist Auto Recover Source
internal fun PlayerActivity.showV75PlaylistAutoRecoverSourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75PlaylistAutoRecoverSource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Source",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75PlaylistAutoRecoverSource = value
        AppToast.show(this, "Playlist Auto Recover Source: $value")
    }
}

// v75.7: Cache Encryption Mode
internal fun PlayerActivity.showV75CacheEncryptionModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75CacheEncryptionMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Encryption Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75CacheEncryptionMode = value
        AppToast.show(this, "Cache Encryption Mode: $value")
    }
}

// v75.8: Progress Bar Chapter Preview
internal fun PlayerActivity.showV75ProgressBarChapterPreviewToggle() {
    val enabled = !BiliClient.prefs.v75ProgressBarChapterPreview
    BiliClient.prefs.v75ProgressBarChapterPreview = enabled
    AppToast.show(this, "Progress Bar Chapter Preview: ${if (enabled) "ON" else "OFF"}")
}

// v75.9: Volume Spatial Audio
internal fun PlayerActivity.showV75VolumeSpatialAudioToggle() {
    val enabled = !BiliClient.prefs.v75VolumeSpatialAudio
    BiliClient.prefs.v75VolumeSpatialAudio = enabled
    AppToast.show(this, "Volume Spatial Audio: ${if (enabled) "ON" else "OFF"}")
}

// v75.10: History Auto Restore
internal fun PlayerActivity.showV75HistoryAutoRestoreToggle() {
    val enabled = !BiliClient.prefs.v75HistoryAutoRestore
    BiliClient.prefs.v75HistoryAutoRestore = enabled
    AppToast.show(this, "History Auto Restore: ${if (enabled) "ON" else "OFF"}")
}

// v75.11: Playback Auto Resume On Return
internal fun PlayerActivity.showV75PlaybackAutoResumeOnReturnToggle() {
    val enabled = !BiliClient.prefs.v75PlaybackAutoResumeOnReturn
    BiliClient.prefs.v75PlaybackAutoResumeOnReturn = enabled
    AppToast.show(this, "Playback Auto Resume On Return: ${if (enabled) "ON" else "OFF"}")
}

// v75.12: Screenshot Auto Filter
internal fun PlayerActivity.showV75ScreenshotAutoFilterToggle() {
    val enabled = !BiliClient.prefs.v75ScreenshotAutoFilter
    BiliClient.prefs.v75ScreenshotAutoFilter = enabled
    AppToast.show(this, "Screenshot Auto Filter: ${if (enabled) "ON" else "OFF"}")
}

// v75.13: Video Frame Blend
internal fun PlayerActivity.showV75VideoFrameBlendToggle() {
    val enabled = !BiliClient.prefs.v75VideoFrameBlend
    BiliClient.prefs.v75VideoFrameBlend = enabled
    AppToast.show(this, "Video Frame Blend: ${if (enabled) "ON" else "OFF"}")
}

// v75.14: Danmaku Border Effects
internal fun PlayerActivity.showV75DanmakuBorderEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75DanmakuBorderEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Border Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75DanmakuBorderEffects = value
        AppToast.show(this, "Danmaku Border Effects: $value")
    }
}

// v75.15: Subtitle Animation Speed
internal fun PlayerActivity.showV75SubtitleAnimationSpeedDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v75SubtitleAnimationSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75SubtitleAnimationSpeed = value
        AppToast.show(this, "Subtitle Animation Speed: $value")
    }
}

// v76.1: Video Color Grading Preset
internal fun PlayerActivity.showV76VideoColorGradingPresetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76VideoColorGradingPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Grading Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76VideoColorGradingPreset = value
        AppToast.show(this, "Video Color Grading Preset: $value")
    }
}

// v76.2: Danmaku Font Style Custom
internal fun PlayerActivity.showV76DanmakuFontStyleCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76DanmakuFontStyleCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Style Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76DanmakuFontStyleCustom = value
        AppToast.show(this, "Danmaku Font Style Custom: $value")
    }
}

// v76.3: Subtitle Font Style Custom
internal fun PlayerActivity.showV76SubtitleFontStyleCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76SubtitleFontStyleCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Style Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76SubtitleFontStyleCustom = value
        AppToast.show(this, "Subtitle Font Style Custom: $value")
    }
}

// v76.4: Gesture Vibration Feedback
internal fun PlayerActivity.showV76GestureVibrationFeedbackToggle() {
    val enabled = !BiliClient.prefs.v76GestureVibrationFeedback
    BiliClient.prefs.v76GestureVibrationFeedback = enabled
    AppToast.show(this, "Gesture Vibration Feedback: ${if (enabled) "ON" else "OFF"}")
}

// v76.5: Cast Video Dolby Atmos
internal fun PlayerActivity.showV76CastVideoDolbyAtmosToggle() {
    val enabled = !BiliClient.prefs.v76CastVideoDolbyAtmos
    BiliClient.prefs.v76CastVideoDolbyAtmos = enabled
    AppToast.show(this, "Cast Video Dolby Atmos: ${if (enabled) "ON" else "OFF"}")
}

// v76.6: Playlist Auto Recover Strategy
internal fun PlayerActivity.showV76PlaylistAutoRecoverStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76PlaylistAutoRecoverStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Strategy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76PlaylistAutoRecoverStrategy = value
        AppToast.show(this, "Playlist Auto Recover Strategy: $value")
    }
}

// v76.7: Cache Location Mode
internal fun PlayerActivity.showV76CacheLocationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76CacheLocationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Location Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76CacheLocationMode = value
        AppToast.show(this, "Cache Location Mode: $value")
    }
}

// v76.8: Progress Bar Buffer Color
internal fun PlayerActivity.showV76ProgressBarBufferColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76ProgressBarBufferColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffer Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76ProgressBarBufferColor = value
        AppToast.show(this, "Progress Bar Buffer Color: $value")
    }
}

