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

internal fun PlayerActivity.showV43ProgressBarAnimationEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Fade", "Slide", "Pulse")
    val currentIndex = options.indexOf(BiliClient.prefs.v43ProgressBarAnimationEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Animation Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43ProgressBarAnimationEnhanced = value; AppToast.show(this, "Progress Bar Animation Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44ColorDenoiseEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44ColorDenoiseEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Denoise Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44ColorDenoiseEnhanced = value; AppToast.show(this, "Color Denoise Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44DanmakuStrokeWidthEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44DanmakuStrokeWidthEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Width Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44DanmakuStrokeWidthEnhanced = value; AppToast.show(this, "Danmaku Stroke Width Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44GestureLongPressSpeedEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Slowest", "Slower", "Normal", "Faster", "Fastest", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44GestureLongPressSpeedEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Long Press Speed Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44GestureLongPressSpeedEnhanced = value; AppToast.show(this, "Gesture Long Press Speed Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44CastBitrateEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Auto", "Low", "Medium", "High", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44CastBitrateEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Bitrate Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44CastBitrateEnhanced = value; AppToast.show(this, "Cast Bitrate Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44ProgressBarHeightEnhancedDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v44ProgressBarHeightEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Height Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44ProgressBarHeightEnhanced = value; AppToast.show(this, "Progress Bar Height Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44DanmakuBorderEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44DanmakuBorderEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Border Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44DanmakuBorderEnhanced = value; AppToast.show(this, "Danmaku Border Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44ColorBlurEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44ColorBlurEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Blur Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44ColorBlurEnhanced = value; AppToast.show(this, "Color Blur Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44VolumeFadeEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Fast", "Normal", "Slow", "VerySlow", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44VolumeFadeEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Fade Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44VolumeFadeEnhanced = value; AppToast.show(this, "Volume Fade Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44DanmakuScrollSpeedEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44DanmakuScrollSpeedEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Scroll Speed Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44DanmakuScrollSpeedEnhanced = value; AppToast.show(this, "Danmaku Scroll Speed Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44CastLatencyEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Auto", "Low", "Medium", "High")
    val currentIndex = options.indexOf(BiliClient.prefs.v44CastLatencyEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Latency Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44CastLatencyEnhanced = value; AppToast.show(this, "Cast Latency Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44GestureSwipeSensitivityEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v44GestureSwipeSensitivityEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Swipe Sensitivity Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44GestureSwipeSensitivityEnhanced = value; AppToast.show(this, "Gesture Swipe Sensitivity Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44DanmakuVibrationFrequencyEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Low", "Medium", "High", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44DanmakuVibrationFrequencyEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Frequency Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44DanmakuVibrationFrequencyEnhanced = value; AppToast.show(this, "Danmaku Vibration Frequency Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44CacheCleanupCurveEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Log", "Exp", "SCurve", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44CacheCleanupCurveEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Cleanup Curve Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44CacheCleanupCurveEnhanced = value; AppToast.show(this, "Cache Cleanup Curve Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV44ProgressBarGradientDirectionEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("LR", "RL", "CenterOut", "Inward", "Diagonal", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v44ProgressBarGradientDirectionEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Gradient Direction Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v44ProgressBarGradientDirectionEnhanced = value; AppToast.show(this, "Progress Bar Gradient Direction Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45ColorSharpenEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45ColorSharpenEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Sharpen Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45ColorSharpenEnhanced = value; AppToast.show(this, "Color Sharpen Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45DanmakuBgRadiusEnhancedDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuBgRadiusEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Background Radius Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuBgRadiusEnhanced = value; AppToast.show(this, "Danmaku Background Radius Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45GestureDoubleTapEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "PlayPause", "Fullscreen", "Like", "Next", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v45GestureDoubleTapEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Double Tap Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45GestureDoubleTapEnhanced = value; AppToast.show(this, "Gesture Double Tap Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45DanmakuHistoryExportEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("JSON", "CSV", "TXT", "XML")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuHistoryExportEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku History Export Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuHistoryExportEnhanced = value; AppToast.show(this, "Danmaku History Export Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45CastBufferEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Small", "Medium", "Large")
    val currentIndex = options.indexOf(BiliClient.prefs.v45CastBufferEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Buffer Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45CastBufferEnhanced = value; AppToast.show(this, "Cast Buffer Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45ProgressBarStyleEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Default", "Thin", "Thick", "Gradient", "Neon", "Minimal")
    val currentIndex = options.indexOf(BiliClient.prefs.v45ProgressBarStyleEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Style Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45ProgressBarStyleEnhanced = value; AppToast.show(this, "Progress Bar Style Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45DanmakuGradientSpeedEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuGradientSpeedEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Gradient Speed Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuGradientSpeedEnhanced = value; AppToast.show(this, "Danmaku Gradient Speed Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45ColorVividnessEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45ColorVividnessEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Vividness Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45ColorVividnessEnhanced = value; AppToast.show(this, "Color Vividness Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45VolumeBalanceEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45VolumeBalanceEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Balance Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45VolumeBalanceEnhanced = value; AppToast.show(this, "Volume Balance Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45DanmakuOffsetEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuOffsetEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Offset Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuOffsetEnhanced = value; AppToast.show(this, "Danmaku Offset Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45CastAudioEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Auto", "Stereo", "Mono", "Surround")
    val currentIndex = options.indexOf(BiliClient.prefs.v45CastAudioEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45CastAudioEnhanced = value; AppToast.show(this, "Cast Audio Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45GestureVibrationEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Light", "Medium", "Strong", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v45GestureVibrationEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Vibration Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45GestureVibrationEnhanced = value; AppToast.show(this, "Gesture Vibration Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV45DanmakuVibrationIntensityEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v45DanmakuVibrationIntensityEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Intensity Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v45DanmakuVibrationIntensityEnhanced = value; AppToast.show(this, "Danmaku Vibration Intensity Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV46DanmakuFontWeightDialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100", "200", "300", "400", "500", "600", "700", "800", "900")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuFontWeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Weight", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuFontWeight = value; AppToast.show(this, "Danmaku Font Weight: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV46DanmakuStrokeOffsetDialog() {
    val options = listOf(-5,-4,-3,-2,-1,0,1,2,3,4,5)
    val labels = listOf("-5", "-4", "-3", "-2", "-1", "0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuStrokeOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Offset", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuStrokeOffset = value; AppToast.show(this, "Danmaku Stroke Offset: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV46CastColorTemperatureDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v46CastColorTemperature).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Color Temperature", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46CastColorTemperature = value; AppToast.show(this, "Cast Color Temperature: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV46GestureEdgeExclusionDialog() {
    val options = listOf(0,5,10,15,20,25,30,35,40,45,50)
    val labels = listOf("0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50")
    val currentIndex = options.indexOf(BiliClient.prefs.v46GestureEdgeExclusion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Edge Exclusion", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46GestureEdgeExclusion = value; AppToast.show(this, "Gesture Edge Exclusion: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV46DanmakuRowSpacingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuRowSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Row Spacing", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuRowSpacing = value; AppToast.show(this, "Danmaku Row Spacing: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV46ProgressBarThumbSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v46ProgressBarThumbSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Thumb Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46ProgressBarThumbSize = value; AppToast.show(this, "Progress Bar Thumb Size: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV46ColorWhiteBalanceDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v46ColorWhiteBalance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color White Balance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46ColorWhiteBalance = value; AppToast.show(this, "Color White Balance: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV46VolumeLimitThresholdDialog() {
    val options = listOf(50,60,70,80,90,100,110,120,130,140,150)
    val labels = listOf("50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150")
    val currentIndex = options.indexOf(BiliClient.prefs.v46VolumeLimitThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limit Threshold", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46VolumeLimitThreshold = value; AppToast.show(this, "Volume Limit Threshold: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV46DanmakuBgPaddingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuBgPadding).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Padding", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuBgPadding = value; AppToast.show(this, "Danmaku Bg Padding: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV46CastVideoCodecDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0", "1", "2", "3")
    val currentIndex = options.indexOf(BiliClient.prefs.v46CastVideoCodec).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Video Codec", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46CastVideoCodec = value; AppToast.show(this, "Cast Video Codec: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV47DanmakuFontSpacingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v47DanmakuFontSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Spacing", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47DanmakuFontSpacing = value; AppToast.show(this, "Danmaku Font Spacing: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV47ColorExposureCompensationDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v47ColorExposureCompensation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Exposure Compensation", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47ColorExposureCompensation = value; AppToast.show(this, "Color Exposure Compensation: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV47VolumeLoudnessEnhancerDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v47VolumeLoudnessEnhancer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Loudness Enhancer", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47VolumeLoudnessEnhancer = value; AppToast.show(this, "Volume Loudness Enhancer: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV47DanmakuStrokeBlurDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v47DanmakuStrokeBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Blur", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47DanmakuStrokeBlur = value; AppToast.show(this, "Danmaku Stroke Blur: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV47CastAudioBitrateDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v47CastAudioBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Bitrate", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47CastAudioBitrate = value; AppToast.show(this, "Cast Audio Bitrate: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV47GestureDeadZoneDialog() {
    val options = listOf(0,3,6,9,12,15,18,21,24,27,30)
    val labels = listOf("0", "3", "6", "9", "12", "15", "18", "21", "24", "27", "30")
    val currentIndex = options.indexOf(BiliClient.prefs.v47GestureDeadZone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Dead Zone", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47GestureDeadZone = value; AppToast.show(this, "Gesture Dead Zone: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV47DanmakuMaxLinesDialog() {
    val options = listOf(0,5,10,15,20,25,30,35,40,45,50)
    val labels = listOf("0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50")
    val currentIndex = options.indexOf(BiliClient.prefs.v47DanmakuMaxLines).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Max Lines", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47DanmakuMaxLines = value; AppToast.show(this, "Danmaku Max Lines: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV47CacheMaxSizeMbDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v47CacheMaxSizeMb).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Max Size Mb", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47CacheMaxSizeMb = value; AppToast.show(this, "Cache Max Size Mb: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV47ColorTintDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v47ColorTint).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Tint", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47ColorTint = value; AppToast.show(this, "Color Tint: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV47VolumeChannelBalanceDialog() {
    val options = listOf(-50,-40,-30,-20,-10,0,10,20,30,40,50)
    val labels = listOf("-50", "-40", "-30", "-20", "-10", "0", "10", "20", "30", "40", "50")
    val currentIndex = options.indexOf(BiliClient.prefs.v47VolumeChannelBalance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Channel Balance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47VolumeChannelBalance = value; AppToast.show(this, "Volume Channel Balance: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV47DanmakuBgBorderColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v47DanmakuBgBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Border Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v47DanmakuBgBorderColor = value; AppToast.show(this, "Danmaku Bg Border Color: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV48DanmakuFontLineHeightDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v48DanmakuFontLineHeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Line Height", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48DanmakuFontLineHeight = value; AppToast.show(this, "Danmaku Font Line Height: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV48ColorBlackLevelDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v48ColorBlackLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Black Level", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48ColorBlackLevel = value; AppToast.show(this, "Color Black Level: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV48VolumeBassBoostDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v48VolumeBassBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Bass Boost", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48VolumeBassBoost = value; AppToast.show(this, "Volume Bass Boost: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV48DanmakuSendMaxLengthDialog() {
    val options = listOf(20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200)
    val labels = listOf("20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200")
    val currentIndex = options.indexOf(BiliClient.prefs.v48DanmakuSendMaxLength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Max Length", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48DanmakuSendMaxLength = value; AppToast.show(this, "Danmaku Send Max Length: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV48CacheCleanupIntervalDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v48CacheCleanupInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Cleanup Interval", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48CacheCleanupInterval = value; AppToast.show(this, "Cache Cleanup Interval: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV48ProgressBarTouchAreaDialog() {
    val options = listOf(0,3,6,9,12,15,18,21,24,27,30)
    val labels = listOf("0", "3", "6", "9", "12", "15", "18", "21", "24", "27", "30")
    val currentIndex = options.indexOf(BiliClient.prefs.v48ProgressBarTouchArea).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Touch Area", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48ProgressBarTouchArea = value; AppToast.show(this, "Progress Bar Touch Area: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV48ColorWhiteLevelDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v48ColorWhiteLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color White Level", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48ColorWhiteLevel = value; AppToast.show(this, "Color White Level: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV48VolumeVirtualizerDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v48VolumeVirtualizer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Virtualizer", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48VolumeVirtualizer = value; AppToast.show(this, "Volume Virtualizer: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV48DanmakuBgShadowSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v48DanmakuBgShadowSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Shadow Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48DanmakuBgShadowSize = value; AppToast.show(this, "Danmaku Bg Shadow Size: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV48CastMirrorQualityDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0", "1", "2", "3")
    val currentIndex = options.indexOf(BiliClient.prefs.v48CastMirrorQuality).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Mirror Quality", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v48CastMirrorQuality = value; AppToast.show(this, "Cast Mirror Quality: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV49DanmakuFontLetterSpacingDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v49DanmakuFontLetterSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Letter Spacing", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49DanmakuFontLetterSpacing = value; AppToast.show(this, "Danmaku Font Letter Spacing: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV49ColorHighlightRecoveryDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49ColorHighlightRecovery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Highlight Recovery", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49ColorHighlightRecovery = value; AppToast.show(this, "Color Highlight Recovery: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV49VolumeTrebleBoostDialog() {
    val options = listOf(0,10,20,30,40,50,60,70,80,90,100)
    val labels = listOf("0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v49VolumeTrebleBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Treble Boost", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49VolumeTrebleBoost = value; AppToast.show(this, "Volume Treble Boost: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV49DanmakuSendFontSizeDialog() {
    val options = listOf(12,14,16,18,20,22,24,26,28,30,32,34,36,38,40)
    val labels = listOf("12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40")
    val currentIndex = options.indexOf(BiliClient.prefs.v49DanmakuSendFontSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Font Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49DanmakuSendFontSize = value; AppToast.show(this, "Danmaku Send Font Size: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV49CastAudioSyncDialog() {
    val options = listOf(-500,-400,-300,-200,-100,0,100,200,300,400,500)
    val labels = listOf("-500", "-400", "-300", "-200", "-100", "0", "100", "200", "300", "400", "500")
    val currentIndex = options.indexOf(BiliClient.prefs.v49CastAudioSync).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Sync", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49CastAudioSync = value; AppToast.show(this, "Cast Audio Sync: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV49GestureLongPressActionDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49GestureLongPressAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Gesture Long Press Action", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49GestureLongPressAction = value; AppToast.show(this, "Gesture Long Press Action: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV49CacheAutoCleanupThresholdDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49CacheAutoCleanupThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Auto Cleanup Threshold", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49CacheAutoCleanupThreshold = value; AppToast.show(this, "Cache Auto Cleanup Threshold: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV49ColorShadowRecoveryDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49ColorShadowRecovery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Shadow Recovery", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49ColorShadowRecovery = value; AppToast.show(this, "Color Shadow Recovery: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV49VolumeReplayGainDialog() {
    val options = listOf(-12,-10,-8,-6,-4,-2,0,2,4,6,8,10,12)
    val labels = listOf("-12", "-10", "-8", "-6", "-4", "-2", "0", "2", "4", "6", "8", "10", "12")
    val currentIndex = options.indexOf(BiliClient.prefs.v49VolumeReplayGain).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Replay Gain", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49VolumeReplayGain = value; AppToast.show(this, "Volume Replay Gain: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV49DanmakuBgGradientAngleDialog() {
    val options = listOf(0,30,60,90,120,150,180,210,240,270,300,330,360)
    val labels = listOf("0", "30", "60", "90", "120", "150", "180", "210", "240", "270", "300", "330", "360")
    val currentIndex = options.indexOf(BiliClient.prefs.v49DanmakuBgGradientAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Gradient Angle", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49DanmakuBgGradientAngle = value; AppToast.show(this, "Danmaku Bg Gradient Angle: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV50DanmakuFontShadowSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuFontShadowSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Shadow Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuFontShadowSize = value; AppToast.show(this, "Danmaku Font Shadow Size: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV50ColorMidtoneAdjustDialog() {
    val options = listOf(-100,-75,-50,-25,0,25,50,75,100)
    val labels = listOf("-100", "-75", "-50", "-25", "0", "25", "50", "75", "100")
    val currentIndex = options.indexOf(BiliClient.prefs.v50ColorMidtoneAdjust).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Midtone Adjust", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50ColorMidtoneAdjust = value; AppToast.show(this, "Color Midtone Adjust: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV50VolumeAmbientModeDialog() {
    val options = listOf(0,1,2,3)
    val labels = listOf("0", "1", "2", "3")
    val currentIndex = options.indexOf(BiliClient.prefs.v50VolumeAmbientMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Ambient Mode", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50VolumeAmbientMode = value; AppToast.show(this, "Volume Ambient Mode: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV50DanmakuSendColorCustomDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuSendColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Send Color Custom", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuSendColorCustom = value; AppToast.show(this, "Danmaku Send Color Custom: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV50DanmakuFilterColorDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuFilterColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Filter Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuFilterColor = value; AppToast.show(this, "Danmaku Filter Color: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV50CachePrebufferSecondsDialog() {
    val options = listOf(0,3,6,9,12,15,18,21,24,27,30)
    val labels = listOf("0", "3", "6", "9", "12", "15", "18", "21", "24", "27", "30")
    val currentIndex = options.indexOf(BiliClient.prefs.v50CachePrebufferSeconds).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Prebuffer Seconds", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50CachePrebufferSeconds = value; AppToast.show(this, "Cache Prebuffer Seconds: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV50ProgressBarDoubleTapSeekDialog() {
    val options = listOf(5,10,15,20,25,30,35,40,45,50,55,60)
    val labels = listOf("5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60")
    val currentIndex = options.indexOf(BiliClient.prefs.v50ProgressBarDoubleTapSeek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Double Tap Seek", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50ProgressBarDoubleTapSeek = value; AppToast.show(this, "Progress Bar Double Tap Seek: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV50ColorDynamicRangeDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v50ColorDynamicRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Dynamic Range", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50ColorDynamicRange = value; AppToast.show(this, "Color Dynamic Range: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV50DanmakuBgBlurRadiusDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuBgBlurRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Blur Radius", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuBgBlurRadius = value; AppToast.show(this, "Danmaku Bg Blur Radius: ${labels[options.indexOf(value)]}") }
}

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
// v64.2: Danmaku Fixed Position




