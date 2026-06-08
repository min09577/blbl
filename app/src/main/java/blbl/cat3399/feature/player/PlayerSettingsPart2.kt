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

internal fun PlayerActivity.showV41ColorHdrSimulationDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "HDR10", "HLG", "Dolby Vision")
    val currentIndex = options.indexOf(BiliClient.prefs.v41ColorHdrSimulation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color HDR Simulation", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41ColorHdrSimulation = value; AppToast.show(this, "Color HDR Simulation: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV41VolumeLimitEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Low", "Medium", "High")
    val currentIndex = options.indexOf(BiliClient.prefs.v41VolumeLimitEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limit Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41VolumeLimitEnhanced = value; AppToast.show(this, "Volume Limit Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV41DanmakuBgRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v41DanmakuBgRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Background Radius", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41DanmakuBgRadius = value; AppToast.show(this, "Danmaku Background Radius: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV41CastAudioCodecDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Auto", "AAC", "OPUS", "FLAC")
    val currentIndex = options.indexOf(BiliClient.prefs.v41CastAudioCodec).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Audio Codec", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v41CastAudioCodec = value; AppToast.show(this, "Cast Audio Codec: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42DanmakuStrokeColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("White", "Black", "Red", "Blue", "Green", "Yellow", "Cyan", "Magenta", "Orange", "Purple", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42DanmakuStrokeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Stroke Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42DanmakuStrokeColor = value; AppToast.show(this, "Danmaku Stroke Color: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42ColorAutoContrastToggle() {
    val current = BiliClient.prefs.v42ColorAutoContrast
    BiliClient.prefs.v42ColorAutoContrast = !current
    AppToast.show(this, "Color Auto Contrast: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV42GestureVibrationToggle() {
    val current = BiliClient.prefs.v42GestureVibration
    BiliClient.prefs.v42GestureVibration = !current
    AppToast.show(this, "Gesture Vibration: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV42DanmakuHistoryStatsToggle() {
    val current = BiliClient.prefs.v42DanmakuHistoryStats
    BiliClient.prefs.v42DanmakuHistoryStats = !current
    AppToast.show(this, "Danmaku History Stats: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV42CacheAutoSizeToggle() {
    val current = BiliClient.prefs.v42CacheAutoSize
    BiliClient.prefs.v42CacheAutoSize = !current
    AppToast.show(this, "Cache Auto Size: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV42ProgressBarColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Default", "Red", "Blue", "Green", "Yellow", "Cyan", "Magenta", "Orange", "Purple", "Pink", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42ProgressBarColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42ProgressBarColor = value; AppToast.show(this, "Progress Bar Color: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42DanmakuGradientEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Radial", "Diagonal", "Reflect", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42DanmakuGradientEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Gradient Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42DanmakuGradientEnhanced = value; AppToast.show(this, "Danmaku Gradient Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42CastColorEnhanceDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Low", "Medium", "High", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42CastColorEnhance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Color Enhance", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42CastColorEnhance = value; AppToast.show(this, "Cast Color Enhance: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42VolumeStepCustomDialog() {
    val options = listOf(0, 1, 2, 3, 5, 10, 15, 20)
    val labels = listOf("Off", "1", "2", "3", "5", "10", "15", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v42VolumeStepCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Step Custom", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42VolumeStepCustom = value; AppToast.show(this, "Volume Step Custom: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42DanmakuSmartPositionToggle() {
    val current = BiliClient.prefs.v42DanmakuSmartPosition
    BiliClient.prefs.v42DanmakuSmartPosition = !current
    AppToast.show(this, "Danmaku Smart Position: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV42ColorAutoSaturationToggle() {
    val current = BiliClient.prefs.v42ColorAutoSaturation
    BiliClient.prefs.v42ColorAutoSaturation = !current
    AppToast.show(this, "Color Auto Saturation: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV42GestureLongPressVibrationToggle() {
    val current = BiliClient.prefs.v42GestureLongPressVibration
    BiliClient.prefs.v42GestureLongPressVibration = !current
    AppToast.show(this, "Gesture Long Press Vibration: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV42DanmakuVibrationDurationDialog() {
    val options = listOf(0, 50, 100, 150, 200, 250, 300, 500)
    val labels = listOf("Off", "50ms", "100ms", "150ms", "200ms", "250ms", "300ms", "500ms")
    val currentIndex = options.indexOf(BiliClient.prefs.v42DanmakuVibrationDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Duration", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42DanmakuVibrationDuration = value; AppToast.show(this, "Danmaku Vibration Duration: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42CachePreloadStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Conservative", "Moderate", "Aggressive")
    val currentIndex = options.indexOf(BiliClient.prefs.v42CachePreloadStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Preload Strategy", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42CachePreloadStrategy = value; AppToast.show(this, "Cache Preload Strategy: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV42ProgressBarBufferColorDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Default", "Red", "Blue", "Green", "Yellow", "Cyan", "Magenta", "Orange", "Purple", "Pink", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v42ProgressBarBufferColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Buffer Color", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v42ProgressBarBufferColor = value; AppToast.show(this, "Progress Bar Buffer Color: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43ColorAutoHueToggle() {
    val current = BiliClient.prefs.v43ColorAutoHue
    BiliClient.prefs.v43ColorAutoHue = !current
    AppToast.show(this, "Color Auto Hue: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV43DanmakuBgAlphaDialog() {
    val options = listOf(0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val labels = listOf("Off", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuBgAlpha).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Background Alpha", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuBgAlpha = value; AppToast.show(this, "Danmaku Background Alpha: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43GestureDoubleTapVibrationToggle() {
    val current = BiliClient.prefs.v43GestureDoubleTapVibration
    BiliClient.prefs.v43GestureDoubleTapVibration = !current
    AppToast.show(this, "Gesture Double Tap Vibration: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV43DanmakuHistoryBackupToggle() {
    val current = BiliClient.prefs.v43DanmakuHistoryBackup
    BiliClient.prefs.v43DanmakuHistoryBackup = !current
    AppToast.show(this, "Danmaku History Backup: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV43CacheCleanupEnhancedDialog() {
    val options = listOf(0, 1, 2, 3)
    val labels = listOf("Off", "Light", "Moderate", "Aggressive")
    val currentIndex = options.indexOf(BiliClient.prefs.v43CacheCleanupEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Cleanup Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43CacheCleanupEnhanced = value; AppToast.show(this, "Cache Cleanup Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43ProgressBarGradientEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Radial", "Diagonal", "Reflect", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v43ProgressBarGradientEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Gradient Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43ProgressBarGradientEnhanced = value; AppToast.show(this, "Progress Bar Gradient Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43DanmakuShadowEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val labels = listOf("Off", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuShadowEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Shadow Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuShadowEnhanced = value; AppToast.show(this, "Danmaku Shadow Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43CastResolutionEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Auto", "480p", "720p", "1080p", "1440p", "4K")
    val currentIndex = options.indexOf(BiliClient.prefs.v43CastResolutionEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cast Resolution Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43CastResolutionEnhanced = value; AppToast.show(this, "Cast Resolution Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43VolumeLimitCurveEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Linear", "Log", "Exp", "SCurve", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v43VolumeLimitCurveEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Volume Limit Curve Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43VolumeLimitCurveEnhanced = value; AppToast.show(this, "Volume Limit Curve Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43DanmakuGlowEnhancedDialog() {
    val options = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16)
    val labels = listOf("Off", "2", "4", "6", "8", "10", "12", "14", "16")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuGlowEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Glow Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuGlowEnhanced = value; AppToast.show(this, "Danmaku Glow Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43ColorAutoBrightnessToggle() {
    val current = BiliClient.prefs.v43ColorAutoBrightness
    BiliClient.prefs.v43ColorAutoBrightness = !current
    AppToast.show(this, "Color Auto Brightness: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV43GestureSwipeVibrationToggle() {
    val current = BiliClient.prefs.v43GestureSwipeVibration
    BiliClient.prefs.v43GestureSwipeVibration = !current
    AppToast.show(this, "Gesture Swipe Vibration: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV43DanmakuVibrationModeEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Light", "Medium", "Strong", "Ultra", "Custom")
    val currentIndex = options.indexOf(BiliClient.prefs.v43DanmakuVibrationModeEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Vibration Mode Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43DanmakuVibrationModeEnhanced = value; AppToast.show(this, "Danmaku Vibration Mode Enhanced: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV43CachePreloadSizeEnhancedDialog() {
    val options = listOf(0, 1, 2, 3, 4, 5)
    val labels = listOf("Off", "Small", "Medium", "Large", "XL", "XXL")
    val currentIndex = options.indexOf(BiliClient.prefs.v43CachePreloadSizeEnhanced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Preload Size Enhanced", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v43CachePreloadSizeEnhanced = value; AppToast.show(this, "Cache Preload Size Enhanced: ${labels[options.indexOf(value)]}") }
}

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

internal fun PlayerActivity.showV44DanmakuHistorySearchEnhancedToggle() {
    val current = BiliClient.prefs.v44DanmakuHistorySearchEnhanced
    BiliClient.prefs.v44DanmakuHistorySearchEnhanced = !current
    AppToast.show(this, "Danmaku History Search Enhanced: ${if (!current) "ON" else "OFF"}")
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

internal fun PlayerActivity.showV45CacheSmartCleanupEnhancedToggle() {
    val current = BiliClient.prefs.v45CacheSmartCleanupEnhanced
    BiliClient.prefs.v45CacheSmartCleanupEnhanced = !current
    AppToast.show(this, "Cache Smart Cleanup Enhanced: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV45ProgressBarBufferEnhancedToggle() {
    val current = BiliClient.prefs.v45ProgressBarBufferEnhanced
    BiliClient.prefs.v45ProgressBarBufferEnhanced = !current
    AppToast.show(this, "Progress Bar Buffer Enhanced: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV46PlaybackLoopMemoryToggle() {
    val current = BiliClient.prefs.v46PlaybackLoopMemory
    BiliClient.prefs.v46PlaybackLoopMemory = !current
    AppToast.show(this, "Playback Loop Memory: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV46DanmakuFontWeightDialog() {
    val options = listOf(100,200,300,400,500,600,700,800,900)
    val labels = listOf("100", "200", "300", "400", "500", "600", "700", "800", "900")
    val currentIndex = options.indexOf(BiliClient.prefs.v46DanmakuFontWeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Font Weight", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46DanmakuFontWeight = value; AppToast.show(this, "Danmaku Font Weight: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV46ColorAutoGammaToggle() {
    val current = BiliClient.prefs.v46ColorAutoGamma
    BiliClient.prefs.v46ColorAutoGamma = !current
    AppToast.show(this, "Color Auto Gamma: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV46VolumeNormalizationToggle() {
    val current = BiliClient.prefs.v46VolumeNormalization
    BiliClient.prefs.v46VolumeNormalization = !current
    AppToast.show(this, "Volume Normalization: ${if (!current) "ON" else "OFF"}")
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

internal fun PlayerActivity.showV46CachePrefetchOnWifiToggle() {
    val current = BiliClient.prefs.v46CachePrefetchOnWifi
    BiliClient.prefs.v46CachePrefetchOnWifi = !current
    AppToast.show(this, "Cache Prefetch On Wifi: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV46ProgressBarThumbSizeDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v46ProgressBarThumbSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Progress Bar Thumb Size", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v46ProgressBarThumbSize = value; AppToast.show(this, "Progress Bar Thumb Size: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV46DanmakuSendConfirmDialogToggle() {
    val current = BiliClient.prefs.v46DanmakuSendConfirmDialog
    BiliClient.prefs.v46DanmakuSendConfirmDialog = !current
    AppToast.show(this, "Danmaku Send Confirm Dialog: ${if (!current) "ON" else "OFF"}")
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

internal fun PlayerActivity.showV47PlaybackResumePromptToggle() {
    val current = BiliClient.prefs.v47PlaybackResumePrompt
    BiliClient.prefs.v47PlaybackResumePrompt = !current
    AppToast.show(this, "Playback Resume Prompt: ${if (!current) "ON" else "OFF"}")
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

internal fun PlayerActivity.showV47ProgressBarSeekPreviewToggle() {
    val current = BiliClient.prefs.v47ProgressBarSeekPreview
    BiliClient.prefs.v47ProgressBarSeekPreview = !current
    AppToast.show(this, "Progress Bar Seek Preview: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV47DanmakuHighlightMentionToggle() {
    val current = BiliClient.prefs.v47DanmakuHighlightMention
    BiliClient.prefs.v47DanmakuHighlightMention = !current
    AppToast.show(this, "Danmaku Highlight Mention: ${if (!current) "ON" else "OFF"}")
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

internal fun PlayerActivity.showV47CastSubtitleEnabledToggle() {
    val current = BiliClient.prefs.v47CastSubtitleEnabled
    BiliClient.prefs.v47CastSubtitleEnabled = !current
    AppToast.show(this, "Cast Subtitle Enabled: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV48PlaybackAutoSkipIntroToggle() {
    val current = BiliClient.prefs.v48PlaybackAutoSkipIntro
    BiliClient.prefs.v48PlaybackAutoSkipIntro = !current
    AppToast.show(this, "Playback Auto Skip Intro: ${if (!current) "ON" else "OFF"}")
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

internal fun PlayerActivity.showV48CastResolutionAutoToggle() {
    val current = BiliClient.prefs.v48CastResolutionAuto
    BiliClient.prefs.v48CastResolutionAuto = !current
    AppToast.show(this, "Cast Resolution Auto: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV48GestureTapFeedbackToggle() {
    val current = BiliClient.prefs.v48GestureTapFeedback
    BiliClient.prefs.v48GestureTapFeedback = !current
    AppToast.show(this, "Gesture Tap Feedback: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV48DanmakuFilterRegexToggle() {
    val current = BiliClient.prefs.v48DanmakuFilterRegex
    BiliClient.prefs.v48DanmakuFilterRegex = !current
    AppToast.show(this, "Danmaku Filter Regex: ${if (!current) "ON" else "OFF"}")
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

internal fun PlayerActivity.showV48DanmakuFontSizeAdaptiveToggle() {
    val current = BiliClient.prefs.v48DanmakuFontSizeAdaptive
    BiliClient.prefs.v48DanmakuFontSizeAdaptive = !current
    AppToast.show(this, "Danmaku Font Size Adaptive: ${if (!current) "ON" else "OFF"}")
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

internal fun PlayerActivity.showV49PlaybackAutoSkipOutroToggle() {
    val current = BiliClient.prefs.v49PlaybackAutoSkipOutro
    BiliClient.prefs.v49PlaybackAutoSkipOutro = !current
    AppToast.show(this, "Playback Auto Skip Outro: ${if (!current) "ON" else "OFF"}")
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

internal fun PlayerActivity.showV49DanmakuFilterDuplicateToggle() {
    val current = BiliClient.prefs.v49DanmakuFilterDuplicate
    BiliClient.prefs.v49DanmakuFilterDuplicate = !current
    AppToast.show(this, "Danmaku Filter Duplicate: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV49CacheAutoCleanupThresholdDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v49CacheAutoCleanupThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Cache Auto Cleanup Threshold", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v49CacheAutoCleanupThreshold = value; AppToast.show(this, "Cache Auto Cleanup Threshold: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV49ProgressBarChapterMarkToggle() {
    val current = BiliClient.prefs.v49ProgressBarChapterMark
    BiliClient.prefs.v49ProgressBarChapterMark = !current
    AppToast.show(this, "Progress Bar Chapter Mark: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV49DanmakuHighlightKeywordToggle() {
    val current = BiliClient.prefs.v49DanmakuHighlightKeyword
    BiliClient.prefs.v49DanmakuHighlightKeyword = !current
    AppToast.show(this, "Danmaku Highlight Keyword: ${if (!current) "ON" else "OFF"}")
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

internal fun PlayerActivity.showV49CastAutoReconnectToggle() {
    val current = BiliClient.prefs.v49CastAutoReconnect
    BiliClient.prefs.v49CastAutoReconnect = !current
    AppToast.show(this, "Cast Auto Reconnect: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV50PlaybackAutoNextEpisodeToggle() {
    val current = BiliClient.prefs.v50PlaybackAutoNextEpisode
    BiliClient.prefs.v50PlaybackAutoNextEpisode = !current
    AppToast.show(this, "Playback Auto Next Episode: ${if (!current) "ON" else "OFF"}")
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

internal fun PlayerActivity.showV50CastVolumeSyncToggle() {
    val current = BiliClient.prefs.v50CastVolumeSync
    BiliClient.prefs.v50CastVolumeSync = !current
    AppToast.show(this, "Cast Volume Sync: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV50GesturePinchZoomToggle() {
    val current = BiliClient.prefs.v50GesturePinchZoom
    BiliClient.prefs.v50GesturePinchZoom = !current
    AppToast.show(this, "Gesture Pinch Zoom: ${if (!current) "ON" else "OFF"}")
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

internal fun PlayerActivity.showV50DanmakuFontSizeAutoToggle() {
    val current = BiliClient.prefs.v50DanmakuFontSizeAuto
    BiliClient.prefs.v50DanmakuFontSizeAuto = !current
    AppToast.show(this, "Danmaku Font Size Auto: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV50ColorDynamicRangeDialog() {
    val options = listOf(0,1,2,3,4,5)
    val labels = listOf("0", "1", "2", "3", "4", "5")
    val currentIndex = options.indexOf(BiliClient.prefs.v50ColorDynamicRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Color Dynamic Range", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50ColorDynamicRange = value; AppToast.show(this, "Color Dynamic Range: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV50VolumeNightModeToggle() {
    val current = BiliClient.prefs.v50VolumeNightMode
    BiliClient.prefs.v50VolumeNightMode = !current
    AppToast.show(this, "Volume Night Mode: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV50DanmakuBgBlurRadiusDialog() {
    val options = listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val labels = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
    val currentIndex = options.indexOf(BiliClient.prefs.v50DanmakuBgBlurRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(title = "Danmaku Bg Blur Radius", options = options, checkedIndex = currentIndex, label = { v -> labels[options.indexOf(v)] }) { value -> BiliClient.prefs.v50DanmakuBgBlurRadius = value; AppToast.show(this, "Danmaku Bg Blur Radius: ${labels[options.indexOf(value)]}") }
}

internal fun PlayerActivity.showV50CastAutoDiscoverToggle() {
    val current = BiliClient.prefs.v50CastAutoDiscover
    BiliClient.prefs.v50CastAutoDiscover = !current
    AppToast.show(this, "Cast Auto Discover: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV51PlaybackAutoNextEpisodeToggle() {
    val enabled = !BiliClient.prefs.v51PlaybackAutoNextEpisode
    BiliClient.prefs.v51PlaybackAutoNextEpisode = enabled
    AppToast.show(this, "Playback Auto Next Episode: ${if (enabled) "ON" else "OFF"}")
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
}

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

internal fun PlayerActivity.showV51SubtitleFontItalicToggle() {
    val enabled = !BiliClient.prefs.v51SubtitleFontItalic
    BiliClient.prefs.v51SubtitleFontItalic = enabled
    AppToast.show(this, "Subtitle Font Italic: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV51VideoAdaptiveContrastEnhancedToggle() {
    val enabled = !BiliClient.prefs.v51VideoAdaptiveContrastEnhanced
    BiliClient.prefs.v51VideoAdaptiveContrastEnhanced = enabled
    AppToast.show(this, "Video Adaptive Contrast Enhanced: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV51DanmakuFilterMutedUsersToggle() {
    val enabled = !BiliClient.prefs.v51DanmakuFilterMutedUsers
    BiliClient.prefs.v51DanmakuFilterMutedUsers = enabled
    AppToast.show(this, "Danmaku Filter Muted Users: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV51PlaylistAutoContinueToggle() {
    val enabled = !BiliClient.prefs.v51PlaylistAutoContinue
    BiliClient.prefs.v51PlaylistAutoContinue = enabled
    AppToast.show(this, "Playlist Auto Continue: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV51VideoLumaAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v51VideoLumaAdaptive
    BiliClient.prefs.v51VideoLumaAdaptive = enabled
    AppToast.show(this, "Video Luma Adaptive: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV51VideoChromaAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v51VideoChromaAdaptive
    BiliClient.prefs.v51VideoChromaAdaptive = enabled
    AppToast.show(this, "Video Chroma Adaptive: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV51CastAudioSyncToggle() {
    val enabled = !BiliClient.prefs.v51CastAudioSync
    BiliClient.prefs.v51CastAudioSync = enabled
    AppToast.show(this, "Cast Audio Sync: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV52VideoTemporalNoiseReduceToggle() {
    val enabled = !BiliClient.prefs.v52VideoTemporalNoiseReduce
    BiliClient.prefs.v52VideoTemporalNoiseReduce = enabled
    AppToast.show(this, "Video Temporal Noise Reduce: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV52SubtitleFontSizeAutoToggle() {
    val enabled = !BiliClient.prefs.v52SubtitleFontSizeAuto
    BiliClient.prefs.v52SubtitleFontSizeAuto = enabled
    AppToast.show(this, "Subtitle Font Size Auto: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV52VideoColorHighlightRecoveryToggle() {
    val enabled = !BiliClient.prefs.v52VideoColorHighlightRecovery
    BiliClient.prefs.v52VideoColorHighlightRecovery = enabled
    AppToast.show(this, "Video Color Highlight Recovery: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV52DanmakuSendPreviewToggle() {
    val enabled = !BiliClient.prefs.v52DanmakuSendPreview
    BiliClient.prefs.v52DanmakuSendPreview = enabled
    AppToast.show(this, "Danmaku Send Preview: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV52CastVideoAutoQualityToggle() {
    val enabled = !BiliClient.prefs.v52CastVideoAutoQuality
    BiliClient.prefs.v52CastVideoAutoQuality = enabled
    AppToast.show(this, "Cast Video Auto Quality: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV52VideoFrameInterpolationToggle() {
    val enabled = !BiliClient.prefs.v52VideoFrameInterpolation
    BiliClient.prefs.v52VideoFrameInterpolation = enabled
    AppToast.show(this, "Video Frame Interpolation: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV52PlaylistShuffleWeightedToggle() {
    val enabled = !BiliClient.prefs.v52PlaylistShuffleWeighted
    BiliClient.prefs.v52PlaylistShuffleWeighted = enabled
    AppToast.show(this, "Playlist Shuffle Weighted: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV52DanmakuFontWeightAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v52DanmakuFontWeightAdaptive
    BiliClient.prefs.v52DanmakuFontWeightAdaptive = enabled
    AppToast.show(this, "Danmaku Font Weight Adaptive: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV53VideoSpatialNoiseReduceToggle() {
    val enabled = !BiliClient.prefs.v53VideoSpatialNoiseReduce
    BiliClient.prefs.v53VideoSpatialNoiseReduce = enabled
    AppToast.show(this, "Video Spatial Noise Reduce: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV53DanmakuOpacityAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v53DanmakuOpacityAdaptive
    BiliClient.prefs.v53DanmakuOpacityAdaptive = enabled
    AppToast.show(this, "Danmaku Opacity Adaptive: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV53SubtitleSyncAutoDetectToggle() {
    val enabled = !BiliClient.prefs.v53SubtitleSyncAutoDetect
    BiliClient.prefs.v53SubtitleSyncAutoDetect = enabled
    AppToast.show(this, "Subtitle Sync Auto Detect: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV53VideoColorHighlightCompressToggle() {
    val enabled = !BiliClient.prefs.v53VideoColorHighlightCompress
    BiliClient.prefs.v53VideoColorHighlightCompress = enabled
    AppToast.show(this, "Video Color Highlight Compress: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV53DanmakuSendTimerToggle() {
    val enabled = !BiliClient.prefs.v53DanmakuSendTimer
    BiliClient.prefs.v53DanmakuSendTimer = enabled
    AppToast.show(this, "Danmaku Send Timer: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV53VideoDetailEnhanceToggle() {
    val enabled = !BiliClient.prefs.v53VideoDetailEnhance
    BiliClient.prefs.v53VideoDetailEnhance = enabled
    AppToast.show(this, "Video Detail Enhance: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV53VideoColorShadowCompressToggle() {
    val enabled = !BiliClient.prefs.v53VideoColorShadowCompress
    BiliClient.prefs.v53VideoColorShadowCompress = enabled
    AppToast.show(this, "Video Color Shadow Compress: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV54VideoColorGradingCustomToggle() {
    val enabled = !BiliClient.prefs.v54VideoColorGradingCustom
    BiliClient.prefs.v54VideoColorGradingCustom = enabled
    AppToast.show(this, "Video Color Grading Custom: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV54VideoAdaptiveSaturationToggle() {
    val enabled = !BiliClient.prefs.v54VideoAdaptiveSaturation
    BiliClient.prefs.v54VideoAdaptiveSaturation = enabled
    AppToast.show(this, "Video Adaptive Saturation: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV54CastVideoFrameRateSyncToggle() {
    val enabled = !BiliClient.prefs.v54CastVideoFrameRateSync
    BiliClient.prefs.v54CastVideoFrameRateSync = enabled
    AppToast.show(this, "Cast Video Frame Rate Sync: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV54DanmakuHistoryFilterToggle() {
    val enabled = !BiliClient.prefs.v54DanmakuHistoryFilter
    BiliClient.prefs.v54DanmakuHistoryFilter = enabled
    AppToast.show(this, "Danmaku History Filter: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV54PlaylistAutoSkipWatchedToggle() {
    val enabled = !BiliClient.prefs.v54PlaylistAutoSkipWatched
    BiliClient.prefs.v54PlaylistAutoSkipWatched = enabled
    AppToast.show(this, "Playlist Auto Skip Watched: ${if (enabled) "ON" else "OFF"}")
}

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

