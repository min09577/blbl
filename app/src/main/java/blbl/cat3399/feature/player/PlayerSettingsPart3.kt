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
// ==================== v71-v80 New Unique Features ====================

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
// v76.10: History Auto Sync Source


internal fun PlayerActivity.showV76HistoryAutoSyncSourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76HistoryAutoSyncSource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Sync Source",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76HistoryAutoSyncSource = value
        AppToast.show(this, "History Auto Sync Source: $value")
    }
// v76.12: Screenshot Auto Annotate Mode


internal fun PlayerActivity.showV76ScreenshotAutoAnnotateModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76ScreenshotAutoAnnotateMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Annotate Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76ScreenshotAutoAnnotateMode = value
        AppToast.show(this, "Screenshot Auto Annotate Mode: $value")
    }
// v76.15: Subtitle Font Weight Custom


internal fun PlayerActivity.showV76SubtitleFontWeightCustomDialog() {
    val options = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v76SubtitleFontWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Weight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76SubtitleFontWeightCustom = value
        AppToast.show(this, "Subtitle Font Weight Custom: $value")
    }
// v77.2: Danmaku Priority Custom


internal fun PlayerActivity.showV77DanmakuPriorityCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77DanmakuPriorityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Priority Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77DanmakuPriorityCustom = value
        AppToast.show(this, "Danmaku Priority Custom: $value")
    }
// v77.3: Subtitle Kerning Custom


internal fun PlayerActivity.showV77SubtitleKerningCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v77SubtitleKerningCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Kerning Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77SubtitleKerningCustom = value
        AppToast.show(this, "Subtitle Kerning Custom: $value")
    }
// v77.6: Playlist Auto Recover Limit


internal fun PlayerActivity.showV77PlaylistAutoRecoverLimitDialog() {
    val options = listOf(5, 10, 15, 20, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v77PlaylistAutoRecoverLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77PlaylistAutoRecoverLimit = value
        AppToast.show(this, "Playlist Auto Recover Limit: $value")
    }
// v77.7: Cache Priority Mode


internal fun PlayerActivity.showV77CachePriorityModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77CachePriorityMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Priority Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77CachePriorityMode = value
        AppToast.show(this, "Cache Priority Mode: $value")
    }
// v77.8: Progress Bar Thumb Color


internal fun PlayerActivity.showV77ProgressBarThumbColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77ProgressBarThumbColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77ProgressBarThumbColor = value
        AppToast.show(this, "Progress Bar Thumb Color: $value")
    }
// v77.10: History Auto Backup Source


internal fun PlayerActivity.showV77HistoryAutoBackupSourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77HistoryAutoBackupSource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Backup Source",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77HistoryAutoBackupSource = value
        AppToast.show(this, "History Auto Backup Source: $value")
    }
// v77.11: Playback Auto Skip Intro Custom


internal fun PlayerActivity.showV77PlaybackAutoSkipIntroCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77PlaybackAutoSkipIntroCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Skip Intro Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77PlaybackAutoSkipIntroCustom = value
        AppToast.show(this, "Playback Auto Skip Intro Custom: $value")
    }
// v77.12: Screenshot Auto Share Mode


internal fun PlayerActivity.showV77ScreenshotAutoShareModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77ScreenshotAutoShareMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Share Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77ScreenshotAutoShareMode = value
        AppToast.show(this, "Screenshot Auto Share Mode: $value")
    }
// v77.14: Danmaku Layer Custom


internal fun PlayerActivity.showV77DanmakuLayerCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77DanmakuLayerCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Layer Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77DanmakuLayerCustom = value
        AppToast.show(this, "Danmaku Layer Custom: $value")
    }
// v77.15: Subtitle Letter Spacing Custom


internal fun PlayerActivity.showV77SubtitleLetterSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v77SubtitleLetterSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Letter Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77SubtitleLetterSpacingCustom = value
        AppToast.show(this, "Subtitle Letter Spacing Custom: $value")
    }
// v78.2: Danmaku Collision Mode


internal fun PlayerActivity.showV78DanmakuCollisionModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78DanmakuCollisionMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Collision Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78DanmakuCollisionMode = value
        AppToast.show(this, "Danmaku Collision Mode: $value")
    }
// v78.3: Subtitle Animation Delay


internal fun PlayerActivity.showV78SubtitleAnimationDelayDialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v78SubtitleAnimationDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78SubtitleAnimationDelay = value
        AppToast.show(this, "Subtitle Animation Delay: $value")
    }
// v78.4: Gesture Long Press Duration


internal fun PlayerActivity.showV78GestureLongPressDurationDialog() {
    val options = listOf(300, 400, 500, 600, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v78GestureLongPressDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78GestureLongPressDuration = value
        AppToast.show(this, "Gesture Long Press Duration: $value")
    }
// v78.6: Playlist Auto Recover Time Limit


internal fun PlayerActivity.showV78PlaylistAutoRecoverTimeLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78PlaylistAutoRecoverTimeLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Time Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78PlaylistAutoRecoverTimeLimit = value
        AppToast.show(this, "Playlist Auto Recover Time Limit: $value")
    }
// v78.7: Cache Size Limit Custom


internal fun PlayerActivity.showV78CacheSizeLimitCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78CacheSizeLimitCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Size Limit Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78CacheSizeLimitCustom = value
        AppToast.show(this, "Cache Size Limit Custom: $value")
    }
// v78.8: Progress Bar Thumb Opacity


internal fun PlayerActivity.showV78ProgressBarThumbOpacityDialog() {
    val options = listOf(50, 60, 70, 80, 90, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v78ProgressBarThumbOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78ProgressBarThumbOpacity = value
        AppToast.show(this, "Progress Bar Thumb Opacity: $value")
    }
// v78.9: Volume Auto Leveling Mode


internal fun PlayerActivity.showV78VolumeAutoLevelingModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78VolumeAutoLevelingMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Auto Leveling Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78VolumeAutoLevelingMode = value
        AppToast.show(this, "Volume Auto Leveling Mode: $value")
    }
// v78.10: History Auto Sync Time


internal fun PlayerActivity.showV78HistoryAutoSyncTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78HistoryAutoSyncTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Sync Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78HistoryAutoSyncTime = value
        AppToast.show(this, "History Auto Sync Time: $value")
    }
// v78.11: Playback Auto Skip Outro Custom


internal fun PlayerActivity.showV78PlaybackAutoSkipOutroCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78PlaybackAutoSkipOutroCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Skip Outro Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78PlaybackAutoSkipOutroCustom = value
        AppToast.show(this, "Playback Auto Skip Outro Custom: $value")
    }
// v78.12: Screenshot Auto Edit Mode


internal fun PlayerActivity.showV78ScreenshotAutoEditModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78ScreenshotAutoEditMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Edit Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78ScreenshotAutoEditMode = value
        AppToast.show(this, "Screenshot Auto Edit Mode: $value")
    }
// v78.15: Subtitle Font Stretch Custom


internal fun PlayerActivity.showV78SubtitleFontStretchCustomDialog() {
    val options = listOf(75, 80, 90, 100, 110, 120, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v78SubtitleFontStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78SubtitleFontStretchCustom = value
        AppToast.show(this, "Subtitle Font Stretch Custom: $value")
    }
// v79.3: Subtitle Animation Type


internal fun PlayerActivity.showV79SubtitleAnimationTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79SubtitleAnimationType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79SubtitleAnimationType = value
        AppToast.show(this, "Subtitle Animation Type: $value")
    }
// v79.4: Gesture Swipe Velocity


internal fun PlayerActivity.showV79GestureSwipeVelocityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v79GestureSwipeVelocity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Velocity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79GestureSwipeVelocity = value
        AppToast.show(this, "Gesture Swipe Velocity: $value")
    }
// v79.5: Cast Audio Spatial Custom


internal fun PlayerActivity.showV79CastAudioSpatialCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79CastAudioSpatialCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Spatial Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79CastAudioSpatialCustom = value
        AppToast.show(this, "Cast Audio Spatial Custom: $value")
    }
// v79.6: Playlist Auto Recover Source Mode


internal fun PlayerActivity.showV79PlaylistAutoRecoverSourceModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79PlaylistAutoRecoverSourceMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Source Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79PlaylistAutoRecoverSourceMode = value
        AppToast.show(this, "Playlist Auto Recover Source Mode: $value")
    }
// v79.7: Cache Cleanup Strategy Custom


internal fun PlayerActivity.showV79CacheCleanupStrategyCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79CacheCleanupStrategyCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Strategy Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79CacheCleanupStrategyCustom = value
        AppToast.show(this, "Cache Cleanup Strategy Custom: $value")
    }
// v79.9: Volume Auto Leveling Strength


internal fun PlayerActivity.showV79VolumeAutoLevelingStrengthDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v79VolumeAutoLevelingStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Auto Leveling Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79VolumeAutoLevelingStrength = value
        AppToast.show(this, "Volume Auto Leveling Strength: $value")
    }
// v79.10: History Auto Backup Time


internal fun PlayerActivity.showV79HistoryAutoBackupTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79HistoryAutoBackupTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Backup Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79HistoryAutoBackupTime = value
        AppToast.show(this, "History Auto Backup Time: $value")
    }
// v79.11: Playback Auto Bookmark Custom


internal fun PlayerActivity.showV79PlaybackAutoBookmarkCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79PlaybackAutoBookmarkCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Bookmark Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79PlaybackAutoBookmarkCustom = value
        AppToast.show(this, "Playback Auto Bookmark Custom: $value")
    }
// v79.12: Screenshot Auto Crop Mode


internal fun PlayerActivity.showV79ScreenshotAutoCropModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79ScreenshotAutoCropMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Crop Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79ScreenshotAutoCropMode = value
        AppToast.show(this, "Screenshot Auto Crop Mode: $value")
    }
// v79.14: Danmaku Font Weight Custom


internal fun PlayerActivity.showV79DanmakuFontWeightCustomDialog() {
    val options = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v79DanmakuFontWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Weight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79DanmakuFontWeightCustom = value
        AppToast.show(this, "Danmaku Font Weight Custom: $value")
    }
// v79.15: Subtitle Animation Duration


internal fun PlayerActivity.showV79SubtitleAnimationDurationDialog() {
    val options = listOf(100, 200, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v79SubtitleAnimationDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79SubtitleAnimationDuration = value
        AppToast.show(this, "Subtitle Animation Duration: $value")
    }
// v80.2: Danmaku Collision Strength


internal fun PlayerActivity.showV80DanmakuCollisionStrengthDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v80DanmakuCollisionStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Collision Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80DanmakuCollisionStrength = value
        AppToast.show(this, "Danmaku Collision Strength: $value")
    }
// v80.3: Subtitle Animation Easing


internal fun PlayerActivity.showV80SubtitleAnimationEasingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v80SubtitleAnimationEasing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Easing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80SubtitleAnimationEasing = value
        AppToast.show(this, "Subtitle Animation Easing: $value")
    }
// v80.4: Gesture Swipe Acceleration Custom


internal fun PlayerActivity.showV80GestureSwipeAccelerationCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v80GestureSwipeAccelerationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Acceleration Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80GestureSwipeAccelerationCustom = value
        AppToast.show(this, "Gesture Swipe Acceleration Custom: $value")
    }
// v80.5: Cast Video Dolby Vision Custom


internal fun PlayerActivity.showV80CastVideoDolbyVisionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v80CastVideoDolbyVisionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Dolby Vision Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80CastVideoDolbyVisionCustom = value
        AppToast.show(this, "Cast Video Dolby Vision Custom: $value")
    }
// v80.6: Playlist Auto Recover Strategy Custom


internal fun PlayerActivity.showV80PlaylistAutoRecoverStrategyCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v80PlaylistAutoRecoverStrategyCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Strategy Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80PlaylistAutoRecoverStrategyCustom = value
        AppToast.show(this, "Playlist Auto Recover Strategy Custom: $value")
    }
// v80.8: Progress Bar Thumb Size Custom


internal fun PlayerActivity.showV80ProgressBarThumbSizeCustomDialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v80ProgressBarThumbSizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80ProgressBarThumbSizeCustom = value
        AppToast.show(this, "Progress Bar Thumb Size Custom: $value")
    }
// v80.14: Danmaku Font Spacing Custom


internal fun PlayerActivity.showV80DanmakuFontSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v80DanmakuFontSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80DanmakuFontSpacingCustom = value
        AppToast.show(this, "Danmaku Font Spacing Custom: $value")
    }
// v81.2: Danmaku Opacity Curve Custom


internal fun PlayerActivity.showV81DanmakuOpacityCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v81DanmakuOpacityCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Opacity Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81DanmakuOpacityCurveCustom = value
        AppToast.show(this, "Danmaku Opacity Curve Custom: $value")
    }
// v81.4: Gesture Pinch Zoom Speed


internal fun PlayerActivity.showV81GesturePinchZoomSpeedDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v81GesturePinchZoomSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Zoom Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81GesturePinchZoomSpeed = value
        AppToast.show(this, "Gesture Pinch Zoom Speed: $value")
    }
// v81.7: Cache Prebuffer Size


internal fun PlayerActivity.showV81CachePrebufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v81CachePrebufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Prebuffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81CachePrebufferSize = value
        AppToast.show(this, "Cache Prebuffer Size: $value")
    }
// v81.8: Progress Bar Double Tap Seek


internal fun PlayerActivity.showV81ProgressBarDoubleTapSeekDialog() {
    val options = listOf(5, 10, 15, 30, 60)
    val currentIndex = options.indexOf(BiliClient.prefs.v81ProgressBarDoubleTapSeek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Double Tap Seek",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81ProgressBarDoubleTapSeek = value
        AppToast.show(this, "Progress Bar Double Tap Seek: $value")
    }
// v81.14: Danmaku Send Rate Limit


internal fun PlayerActivity.showV81DanmakuSendRateLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v81DanmakuSendRateLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Rate Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81DanmakuSendRateLimit = value
        AppToast.show(this, "Danmaku Send Rate Limit: $value")
    }
// v81.15: Subtitle Timing Offset


internal fun PlayerActivity.showV81SubtitleTimingOffsetDialog() {
    val options = listOf(-500, -250, 0, 250, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v81SubtitleTimingOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Timing Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81SubtitleTimingOffset = value
        AppToast.show(this, "Subtitle Timing Offset: $value")
    }
// v82.1: Video Deinterlace Mode


internal fun PlayerActivity.showV82VideoDeinterlaceModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82VideoDeinterlaceMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Deinterlace Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82VideoDeinterlaceMode = value
        AppToast.show(this, "Video Deinterlace Mode: $value")
    }
// v82.2: Danmaku Font Size Auto Range


internal fun PlayerActivity.showV82DanmakuFontSizeAutoRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82DanmakuFontSizeAutoRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Auto Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82DanmakuFontSizeAutoRange = value
        AppToast.show(this, "Danmaku Font Size Auto Range: $value")
    }
// v82.3: Subtitle BG Blur Custom


internal fun PlayerActivity.showV82SubtitleBgBlurCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v82SubtitleBgBlurCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Blur Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82SubtitleBgBlurCustom = value
        AppToast.show(this, "Subtitle BG Blur Custom: $value")
    }
// v82.4: Gesture Edge Swipe Action


internal fun PlayerActivity.showV82GestureEdgeSwipeActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82GestureEdgeSwipeAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82GestureEdgeSwipeAction = value
        AppToast.show(this, "Gesture Edge Swipe Action: $value")
    }
// v82.5: Cast Video Bitrate Limit


internal fun PlayerActivity.showV82CastVideoBitrateLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82CastVideoBitrateLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Bitrate Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82CastVideoBitrateLimit = value
        AppToast.show(this, "Cast Video Bitrate Limit: $value")
    }
// v82.13: Video Color Temperature Custom


internal fun PlayerActivity.showV82VideoColorTemperatureCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v82VideoColorTemperatureCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Temperature Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82VideoColorTemperatureCustom = value
        AppToast.show(this, "Video Color Temperature Custom: $value")
    }
// v82.14: Danmaku Merge Algorithm


internal fun PlayerActivity.showV82DanmakuMergeAlgorithmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82DanmakuMergeAlgorithm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Algorithm",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82DanmakuMergeAlgorithm = value
        AppToast.show(this, "Danmaku Merge Algorithm: $value")
    }
// v83.1: Video Noise Gate Custom


internal fun PlayerActivity.showV83VideoNoiseGateCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v83VideoNoiseGateCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Noise Gate Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83VideoNoiseGateCustom = value
        AppToast.show(this, "Video Noise Gate Custom: $value")
    }
// v83.2: Danmaku Scroll Momentum


internal fun PlayerActivity.showV83DanmakuScrollMomentumDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v83DanmakuScrollMomentum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Momentum",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83DanmakuScrollMomentum = value
        AppToast.show(this, "Danmaku Scroll Momentum: $value")
    }
// v83.4: Gesture Three Finger Action


internal fun PlayerActivity.showV83GestureThreeFingerActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83GestureThreeFingerAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Three Finger Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83GestureThreeFingerAction = value
        AppToast.show(this, "Gesture Three Finger Action: $value")
    }
// v83.5: Cast Audio Delay


internal fun PlayerActivity.showV83CastAudioDelayDialog() {
    val options = listOf(-500, -250, 0, 250, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v83CastAudioDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83CastAudioDelay = value
        AppToast.show(this, "Cast Audio Delay: $value")
    }
// v83.6: Playlist Smart Sort


internal fun PlayerActivity.showV83PlaylistSmartSortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83PlaylistSmartSort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Smart Sort",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83PlaylistSmartSort = value
        AppToast.show(this, "Playlist Smart Sort: $value")
    }
// v83.8: Progress Bar Gesture Area


internal fun PlayerActivity.showV83ProgressBarGestureAreaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83ProgressBarGestureArea).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Gesture Area",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83ProgressBarGestureArea = value
        AppToast.show(this, "Progress Bar Gesture Area: $value")
    }
// v83.9: Volume Balance L-R


internal fun PlayerActivity.showV83VolumeBalanceLRDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v83VolumeBalanceLR).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Balance L-R",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83VolumeBalanceLR = value
        AppToast.show(this, "Volume Balance L-R: $value")
    }
// v83.10: History Max Items


internal fun PlayerActivity.showV83HistoryMaxItemsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83HistoryMaxItems).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83HistoryMaxItems = value
        AppToast.show(this, "History Max Items: $value")
    }
// v83.13: VideoImageSharp Custom


internal fun PlayerActivity.showV83VideoImageSharpCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v83VideoImageSharpCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "VideoImageSharp Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83VideoImageSharpCustom = value
        AppToast.show(this, "VideoImageSharp Custom: $value")
    }
// v83.14: Danmaku Color Palette


internal fun PlayerActivity.showV83DanmakuColorPaletteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83DanmakuColorPalette).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Color Palette",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83DanmakuColorPalette = value
        AppToast.show(this, "Danmaku Color Palette: $value")
    }
// v83.15: Subtitle BG Opacity Custom


internal fun PlayerActivity.showV83SubtitleBgOpacityCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v83SubtitleBgOpacityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Opacity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83SubtitleBgOpacityCustom = value
        AppToast.show(this, "Subtitle BG Opacity Custom: $value")
    }
// v84.1: Video Detail Enhance Custom


internal fun PlayerActivity.showV84VideoDetailEnhanceCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v84VideoDetailEnhanceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Detail Enhance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84VideoDetailEnhanceCustom = value
        AppToast.show(this, "Video Detail Enhance Custom: $value")
    }
// v84.2: Danmaku Scroll Friction


internal fun PlayerActivity.showV84DanmakuScrollFrictionDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v84DanmakuScrollFriction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Friction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84DanmakuScrollFriction = value
        AppToast.show(this, "Danmaku Scroll Friction: $value")
    }
// v84.4: Gesture Four Finger Action


internal fun PlayerActivity.showV84GestureFourFingerActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v84GestureFourFingerAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Four Finger Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84GestureFourFingerAction = value
        AppToast.show(this, "Gesture Four Finger Action: $value")
    }
// v84.9: Volume Fade In Duration


internal fun PlayerActivity.showV84VolumeFadeInDurationDialog() {
    val options = listOf(0, 500, 1000, 2000, 3000)
    val currentIndex = options.indexOf(BiliClient.prefs.v84VolumeFadeInDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade In Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84VolumeFadeInDuration = value
        AppToast.show(this, "Volume Fade In Duration: $value")
    }
// v84.12: Screenshot Folder Path


internal fun PlayerActivity.showV84ScreenshotFolderPathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v84ScreenshotFolderPath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Folder Path",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84ScreenshotFolderPath = value
        AppToast.show(this, "Screenshot Folder Path: $value")
    }
// v84.13: Video Vividness Custom


internal fun PlayerActivity.showV84VideoVividnessCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v84VideoVividnessCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Vividness Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84VideoVividnessCustom = value
        AppToast.show(this, "Video Vividness Custom: $value")
    }
// v84.15: Subtitle Position Custom


internal fun PlayerActivity.showV84SubtitlePositionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v84SubtitlePositionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84SubtitlePositionCustom = value
        AppToast.show(this, "Subtitle Position Custom: $value")
    }
// v85.1: Video Luma Sharpen Custom


internal fun PlayerActivity.showV85VideoLumaSharpenCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v85VideoLumaSharpenCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Luma Sharpen Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85VideoLumaSharpenCustom = value
        AppToast.show(this, "Video Luma Sharpen Custom: $value")
    }
// v85.2: Danmaku BG Padding Custom


internal fun PlayerActivity.showV85DanmakuBgPaddingCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v85DanmakuBgPaddingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Padding Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85DanmakuBgPaddingCustom = value
        AppToast.show(this, "Danmaku BG Padding Custom: $value")
    }
// v85.3: Subtitle BG Color Custom


internal fun PlayerActivity.showV85SubtitleBgColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85SubtitleBgColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85SubtitleBgColorCustom = value
        AppToast.show(this, "Subtitle BG Color Custom: $value")
    }
// v85.4: Gesture Long Press Action


internal fun PlayerActivity.showV85GestureLongPressActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85GestureLongPressAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85GestureLongPressAction = value
        AppToast.show(this, "Gesture Long Press Action: $value")
    }
// v85.5: Cast Audio Codec Custom


internal fun PlayerActivity.showV85CastAudioCodecCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85CastAudioCodecCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Codec Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85CastAudioCodecCustom = value
        AppToast.show(this, "Cast Audio Codec Custom: $value")
    }
// v85.9: Volume Fade Out Duration


internal fun PlayerActivity.showV85VolumeFadeOutDurationDialog() {
    val options = listOf(0, 500, 1000, 2000, 3000)
    val currentIndex = options.indexOf(BiliClient.prefs.v85VolumeFadeOutDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Out Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85VolumeFadeOutDuration = value
        AppToast.show(this, "Volume Fade Out Duration: $value")
    }
// v85.10: History Export Format


internal fun PlayerActivity.showV85HistoryExportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85HistoryExportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Export Format",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85HistoryExportFormat = value
        AppToast.show(this, "History Export Format: $value")
    }
// v85.12: Screenshot Naming Rule


internal fun PlayerActivity.showV85ScreenshotNamingRuleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85ScreenshotNamingRule).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Naming Rule",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85ScreenshotNamingRule = value
        AppToast.show(this, "Screenshot Naming Rule: $value")
    }
// v85.13: Video Chroma Sharpen Custom


internal fun PlayerActivity.showV85VideoChromaSharpenCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v85VideoChromaSharpenCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Chroma Sharpen Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85VideoChromaSharpenCustom = value
        AppToast.show(this, "Video Chroma Sharpen Custom: $value")
    }
// v86.1: Video Contrast Curve Custom


internal fun PlayerActivity.showV86VideoContrastCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86VideoContrastCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Contrast Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86VideoContrastCurveCustom = value
        AppToast.show(this, "Video Contrast Curve Custom: $value")
    }
// v86.2: Danmaku Font Stretch Custom


internal fun PlayerActivity.showV86DanmakuFontStretchCustomDialog() {
    val options = listOf(75, 80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v86DanmakuFontStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86DanmakuFontStretchCustom = value
        AppToast.show(this, "Danmaku Font Stretch Custom: $value")
    }
// v86.3: Subtitle BG Radius Custom


internal fun PlayerActivity.showV86SubtitleBgRadiusCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v86SubtitleBgRadiusCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Radius Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86SubtitleBgRadiusCustom = value
        AppToast.show(this, "Subtitle BG Radius Custom: $value")
    }
// v86.4: Gesture Double Tap Action


internal fun PlayerActivity.showV86GestureDoubleTapActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86GestureDoubleTapAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86GestureDoubleTapAction = value
        AppToast.show(this, "Gesture Double Tap Action: $value")
    }
// v86.5: Cast Video Protocol


internal fun PlayerActivity.showV86CastVideoProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86CastVideoProtocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Protocol",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86CastVideoProtocol = value
        AppToast.show(this, "Cast Video Protocol: $value")
    }
// v86.7: Cache Max Size Custom


internal fun PlayerActivity.showV86CacheMaxSizeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86CacheMaxSizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86CacheMaxSizeCustom = value
        AppToast.show(this, "Cache Max Size Custom: $value")
    }
// v86.9: Volume Boost Strength


internal fun PlayerActivity.showV86VolumeBoostStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v86VolumeBoostStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86VolumeBoostStrength = value
        AppToast.show(this, "Volume Boost Strength: $value")
    }
// v86.10: History Import Format


internal fun PlayerActivity.showV86HistoryImportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86HistoryImportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Import Format",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86HistoryImportFormat = value
        AppToast.show(this, "History Import Format: $value")
    }
// v86.13: Video Saturation Curve Custom


internal fun PlayerActivity.showV86VideoSaturationCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86VideoSaturationCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Saturation Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86VideoSaturationCurveCustom = value
        AppToast.show(this, "Video Saturation Curve Custom: $value")
    }
// v86.14: Danmaku Send Cooldown


internal fun PlayerActivity.showV86DanmakuSendCooldownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86DanmakuSendCooldown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Cooldown",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86DanmakuSendCooldown = value
        AppToast.show(this, "Danmaku Send Cooldown: $value")
    }
// v86.15: Subtitle Outline Width


internal fun PlayerActivity.showV86SubtitleOutlineWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v86SubtitleOutlineWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86SubtitleOutlineWidth = value
        AppToast.show(this, "Subtitle Outline Width: $value")
    }
// v87.1: Video Brightness Curve Custom


internal fun PlayerActivity.showV87VideoBrightnessCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87VideoBrightnessCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Brightness Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87VideoBrightnessCurveCustom = value
        AppToast.show(this, "Video Brightness Curve Custom: $value")
    }
// v87.2: Danmaku Line Height Custom


internal fun PlayerActivity.showV87DanmakuLineHeightCustomDialog() {
    val options = listOf(80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v87DanmakuLineHeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Line Height Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87DanmakuLineHeightCustom = value
        AppToast.show(this, "Danmaku Line Height Custom: $value")
    }
// v87.3: Subtitle Shadow Offset X


internal fun PlayerActivity.showV87SubtitleShadowOffsetXDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v87SubtitleShadowOffsetX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87SubtitleShadowOffsetX = value
        AppToast.show(this, "Subtitle Shadow Offset X: $value")
    }
// v87.4: Gesture Swipe Threshold


internal fun PlayerActivity.showV87GestureSwipeThresholdDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v87GestureSwipeThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87GestureSwipeThreshold = value
        AppToast.show(this, "Gesture Swipe Threshold: $value")
    }
// v87.5: Cast Audio Sample Rate


internal fun PlayerActivity.showV87CastAudioSampleRateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87CastAudioSampleRate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Sample Rate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87CastAudioSampleRate = value
        AppToast.show(this, "Cast Audio Sample Rate: $value")
    }
// v87.7: Cache Cleanup Schedule


