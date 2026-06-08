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

internal fun PlayerActivity.showV55DanmakuTextGlowCustomToggle() {
    val enabled = !BiliClient.prefs.v55DanmakuTextGlowCustom
    BiliClient.prefs.v55DanmakuTextGlowCustom = enabled
    AppToast.show(this, "Danmaku Text Glow Custom: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV55VideoAdaptiveGammaToggle() {
    val enabled = !BiliClient.prefs.v55VideoAdaptiveGamma
    BiliClient.prefs.v55VideoAdaptiveGamma = enabled
    AppToast.show(this, "Video Adaptive Gamma: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV55CastVideoBitrateAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v55CastVideoBitrateAdaptive
    BiliClient.prefs.v55CastVideoBitrateAdaptive = enabled
    AppToast.show(this, "Cast Video Bitrate Adaptive: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV55VideoFrameBlendToggle() {
    val enabled = !BiliClient.prefs.v55VideoFrameBlend
    BiliClient.prefs.v55VideoFrameBlend = enabled
    AppToast.show(this, "Video Frame Blend: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV55PlaylistAutoSyncToggle() {
    val enabled = !BiliClient.prefs.v55PlaylistAutoSync
    BiliClient.prefs.v55PlaylistAutoSync = enabled
    AppToast.show(this, "Playlist Auto Sync: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV55VideoColorTintEnhancedToggle() {
    val enabled = !BiliClient.prefs.v55VideoColorTintEnhanced
    BiliClient.prefs.v55VideoColorTintEnhanced = enabled
    AppToast.show(this, "Video Color Tint Enhanced: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV55DanmakuFontCustomPathToggle() {
    val enabled = !BiliClient.prefs.v55DanmakuFontCustomPath
    BiliClient.prefs.v55DanmakuFontCustomPath = enabled
    AppToast.show(this, "Danmaku Font Custom Path: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV55CastAudioLatencyAutoToggle() {
    val enabled = !BiliClient.prefs.v55CastAudioLatencyAuto
    BiliClient.prefs.v55CastAudioLatencyAuto = enabled
    AppToast.show(this, "Cast Audio Latency Auto: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV56VideoAdaptiveDetailToggle() {
    val enabled = !BiliClient.prefs.v56VideoAdaptiveDetail
    BiliClient.prefs.v56VideoAdaptiveDetail = enabled
    AppToast.show(this, "Video Adaptive Detail: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV56DanmakuSendFontCustomToggle() {
    val enabled = !BiliClient.prefs.v56DanmakuSendFontCustom
    BiliClient.prefs.v56DanmakuSendFontCustom = enabled
    AppToast.show(this, "Danmaku Send Font Custom: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV56DanmakuFilterByColorToggle() {
    val enabled = !BiliClient.prefs.v56DanmakuFilterByColor
    BiliClient.prefs.v56DanmakuFilterByColor = enabled
    AppToast.show(this, "Danmaku Filter By Color: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV56PlaylistAutoDeleteExpiredToggle() {
    val enabled = !BiliClient.prefs.v56PlaylistAutoDeleteExpired
    BiliClient.prefs.v56PlaylistAutoDeleteExpired = enabled
    AppToast.show(this, "Playlist Auto Delete Expired: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV56CastAudioVolumeSyncToggle() {
    val enabled = !BiliClient.prefs.v56CastAudioVolumeSync
    BiliClient.prefs.v56CastAudioVolumeSync = enabled
    AppToast.show(this, "Cast Audio Volume Sync: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV57VideoTemporalEnhanceToggle() {
    val enabled = !BiliClient.prefs.v57VideoTemporalEnhance
    BiliClient.prefs.v57VideoTemporalEnhance = enabled
    AppToast.show(this, "Video Temporal Enhance: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV57DanmakuSendEffectCustomToggle() {
    val enabled = !BiliClient.prefs.v57DanmakuSendEffectCustom
    BiliClient.prefs.v57DanmakuSendEffectCustom = enabled
    AppToast.show(this, "Danmaku Send Effect Custom: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV57PlaylistAutoSortByRatingToggle() {
    val enabled = !BiliClient.prefs.v57PlaylistAutoSortByRating
    BiliClient.prefs.v57PlaylistAutoSortByRating = enabled
    AppToast.show(this, "Playlist Auto Sort By Rating: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV57CastAudioNormalizationAutoToggle() {
    val enabled = !BiliClient.prefs.v57CastAudioNormalizationAuto
    BiliClient.prefs.v57CastAudioNormalizationAuto = enabled
    AppToast.show(this, "Cast Audio Normalization Auto: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV58VideoSpatialEnhanceToggle() {
    val enabled = !BiliClient.prefs.v58VideoSpatialEnhance
    BiliClient.prefs.v58VideoSpatialEnhance = enabled
    AppToast.show(this, "Video Spatial Enhance: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV58DanmakuFontSizeAdaptiveCustomToggle() {
    val enabled = !BiliClient.prefs.v58DanmakuFontSizeAdaptiveCustom
    BiliClient.prefs.v58DanmakuFontSizeAdaptiveCustom = enabled
    AppToast.show(this, "Danmaku Font Size Adaptive Custom: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV58SubtitleFontKerningCustomToggle() {
    val enabled = !BiliClient.prefs.v58SubtitleFontKerningCustom
    BiliClient.prefs.v58SubtitleFontKerningCustom = enabled
    AppToast.show(this, "Subtitle Font Kerning Custom: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV58DanmakuMergeWindowAutoToggle() {
    val enabled = !BiliClient.prefs.v58DanmakuMergeWindowAuto
    BiliClient.prefs.v58DanmakuMergeWindowAuto = enabled
    AppToast.show(this, "Danmaku Merge Window Auto: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV58PlaylistAutoMarkExpiredToggle() {
    val enabled = !BiliClient.prefs.v58PlaylistAutoMarkExpired
    BiliClient.prefs.v58PlaylistAutoMarkExpired = enabled
    AppToast.show(this, "Playlist Auto Mark Expired: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV59VideoColorMatrixCustomToggle() {
    val enabled = !BiliClient.prefs.v59VideoColorMatrixCustom
    BiliClient.prefs.v59VideoColorMatrixCustom = enabled
    AppToast.show(this, "Video Color Matrix Custom: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV59DanmakuSendEffectPreviewToggle() {
    val enabled = !BiliClient.prefs.v59DanmakuSendEffectPreview
    BiliClient.prefs.v59DanmakuSendEffectPreview = enabled
    AppToast.show(this, "Danmaku Send Effect Preview: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV59SubtitleBgGradientCustomToggle() {
    val enabled = !BiliClient.prefs.v59SubtitleBgGradientCustom
    BiliClient.prefs.v59SubtitleBgGradientCustom = enabled
    AppToast.show(this, "Subtitle BG Gradient Custom: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV59DanmakuHistorySearchCustomToggle() {
    val enabled = !BiliClient.prefs.v59DanmakuHistorySearchCustom
    BiliClient.prefs.v59DanmakuHistorySearchCustom = enabled
    AppToast.show(this, "Danmaku History Search Custom: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV59PlaylistAutoBackupToggle() {
    val enabled = !BiliClient.prefs.v59PlaylistAutoBackup
    BiliClient.prefs.v59PlaylistAutoBackup = enabled
    AppToast.show(this, "Playlist Auto Backup: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV59CastAudioChannelSyncToggle() {
    val enabled = !BiliClient.prefs.v59CastAudioChannelSync
    BiliClient.prefs.v59CastAudioChannelSync = enabled
    AppToast.show(this, "Cast Audio Channel Sync: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV60VideoAdaptiveColorEnhanceToggle() {
    val enabled = !BiliClient.prefs.v60VideoAdaptiveColorEnhance
    BiliClient.prefs.v60VideoAdaptiveColorEnhance = enabled
    AppToast.show(this, "Video Adaptive Color Enhance: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV60CastVideoAutoResolutionToggle() {
    val enabled = !BiliClient.prefs.v60CastVideoAutoResolution
    BiliClient.prefs.v60CastVideoAutoResolution = enabled
    AppToast.show(this, "Cast Video Auto Resolution: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV60VideoColorLUTCustomToggle() {
    val enabled = !BiliClient.prefs.v60VideoColorLUTCustom
    BiliClient.prefs.v60VideoColorLUTCustom = enabled
    AppToast.show(this, "Video Color LUT Custom: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV60PlaylistAutoRestoreToggle() {
    val enabled = !BiliClient.prefs.v60PlaylistAutoRestore
    BiliClient.prefs.v60PlaylistAutoRestore = enabled
    AppToast.show(this, "Playlist Auto Restore: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV61VideoEdgeEnhanceStrengthToggle() {
    val enabled = !BiliClient.prefs.v61VideoEdgeEnhanceStrength
    BiliClient.prefs.v61VideoEdgeEnhanceStrength = enabled
    AppToast.show(this, "Video Edge Enhance Strength: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV61DanmakuCollisionDetectionToggle() {
    val enabled = !BiliClient.prefs.v61DanmakuCollisionDetection
    BiliClient.prefs.v61DanmakuCollisionDetection = enabled
    AppToast.show(this, "Danmaku Collision Detection: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV61VideoMotionCompensationToggle() {
    val enabled = !BiliClient.prefs.v61VideoMotionCompensation
    BiliClient.prefs.v61VideoMotionCompensation = enabled
    AppToast.show(this, "Video Motion Compensation: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV61VideoAdaptiveSharpnessToggle() {
    val enabled = !BiliClient.prefs.v61VideoAdaptiveSharpness
    BiliClient.prefs.v61VideoAdaptiveSharpness = enabled
    AppToast.show(this, "Video Adaptive Sharpness: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV61PlaylistSmartFilterToggle() {
    val enabled = !BiliClient.prefs.v61PlaylistSmartFilter
    BiliClient.prefs.v61PlaylistSmartFilter = enabled
    AppToast.show(this, "Playlist Smart Filter: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV62VideoTemporalDenoiseToggle() {
    val enabled = !BiliClient.prefs.v62VideoTemporalDenoise
    BiliClient.prefs.v62VideoTemporalDenoise = enabled
    AppToast.show(this, "Video Temporal Denoise: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV62VideoAdaptiveNoiseGateToggle() {
    val enabled = !BiliClient.prefs.v62VideoAdaptiveNoiseGate
    BiliClient.prefs.v62VideoAdaptiveNoiseGate = enabled
    AppToast.show(this, "Video Adaptive Noise Gate: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV62PlaylistAutoGroupToggle() {
    val enabled = !BiliClient.prefs.v62PlaylistAutoGroup
    BiliClient.prefs.v62PlaylistAutoGroup = enabled
    AppToast.show(this, "Playlist Auto Group: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV63VideoSpatialDenoiseToggle() {
    val enabled = !BiliClient.prefs.v63VideoSpatialDenoise
    BiliClient.prefs.v63VideoSpatialDenoise = enabled
    AppToast.show(this, "Video Spatial Denoise: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV63SubtitleAnimationFadeInToggle() {
    val enabled = !BiliClient.prefs.v63SubtitleAnimationFadeIn
    BiliClient.prefs.v63SubtitleAnimationFadeIn = enabled
    AppToast.show(this, "Subtitle Animation Fade In: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV63GestureLongPressVibrationToggle() {
    val enabled = !BiliClient.prefs.v63GestureLongPressVibration
    BiliClient.prefs.v63GestureLongPressVibration = enabled
    AppToast.show(this, "Gesture Long Press Vibration: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV63PlaylistAutoMergeToggle() {
    val enabled = !BiliClient.prefs.v63PlaylistAutoMerge
    BiliClient.prefs.v63PlaylistAutoMerge = enabled
    AppToast.show(this, "Playlist Auto Merge: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV63VideoColorInvertToggle() {
    val enabled = !BiliClient.prefs.v63VideoColorInvert
    BiliClient.prefs.v63VideoColorInvert = enabled
    AppToast.show(this, "Video Color Invert: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV64VideoAdaptiveEdgePreserveToggle() {
    val enabled = !BiliClient.prefs.v64VideoAdaptiveEdgePreserve
    BiliClient.prefs.v64VideoAdaptiveEdgePreserve = enabled
    AppToast.show(this, "Video Adaptive Edge Preserve: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV64SubtitleAnimationFadeOutToggle() {
    val enabled = !BiliClient.prefs.v64SubtitleAnimationFadeOut
    BiliClient.prefs.v64SubtitleAnimationFadeOut = enabled
    AppToast.show(this, "Subtitle Animation Fade Out: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV64VideoColorGrayscaleToggle() {
    val enabled = !BiliClient.prefs.v64VideoColorGrayscale
    BiliClient.prefs.v64VideoColorGrayscale = enabled
    AppToast.show(this, "Video Color Grayscale: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV64CastVideoPostProcessToggle() {
    val enabled = !BiliClient.prefs.v64CastVideoPostProcess
    BiliClient.prefs.v64CastVideoPostProcess = enabled
    AppToast.show(this, "Cast Video Post Process: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV64PlaylistAutoSplitToggle() {
    val enabled = !BiliClient.prefs.v64PlaylistAutoSplit
    BiliClient.prefs.v64PlaylistAutoSplit = enabled
    AppToast.show(this, "Playlist Auto Split: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV64CastAudioPostProcessToggle() {
    val enabled = !BiliClient.prefs.v64CastAudioPostProcess
    BiliClient.prefs.v64CastAudioPostProcess = enabled
    AppToast.show(this, "Cast Audio Post Process: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV65VideoAdaptiveMotionBlurToggle() {
    val enabled = !BiliClient.prefs.v65VideoAdaptiveMotionBlur
    BiliClient.prefs.v65VideoAdaptiveMotionBlur = enabled
    AppToast.show(this, "Video Adaptive Motion Blur: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV65CastVideoHDRToggle() {
    val enabled = !BiliClient.prefs.v65CastVideoHDR
    BiliClient.prefs.v65CastVideoHDR = enabled
    AppToast.show(this, "Cast Video HDR: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV65DanmakuFilterByBadgeToggle() {
    val enabled = !BiliClient.prefs.v65DanmakuFilterByBadge
    BiliClient.prefs.v65DanmakuFilterByBadge = enabled
    AppToast.show(this, "Danmaku Filter By Badge: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV65PlaylistAutoDeduplicateToggle() {
    val enabled = !BiliClient.prefs.v65PlaylistAutoDeduplicate
    BiliClient.prefs.v65PlaylistAutoDeduplicate = enabled
    AppToast.show(this, "Playlist Auto Deduplicate: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV65DanmakuHistoryAutoExportToggle() {
    val enabled = !BiliClient.prefs.v65DanmakuHistoryAutoExport
    BiliClient.prefs.v65DanmakuHistoryAutoExport = enabled
    AppToast.show(this, "Danmaku History Auto Export: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV65CastAudioHDRToggle() {
    val enabled = !BiliClient.prefs.v65CastAudioHDR
    BiliClient.prefs.v65CastAudioHDR = enabled
    AppToast.show(this, "Cast Audio HDR: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV66VideoAdaptiveFrameBlendToggle() {
    val enabled = !BiliClient.prefs.v66VideoAdaptiveFrameBlend
    BiliClient.prefs.v66VideoAdaptiveFrameBlend = enabled
    AppToast.show(this, "Video Adaptive Frame Blend: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV66SubtitleAnimationBounceToggle() {
    val enabled = !BiliClient.prefs.v66SubtitleAnimationBounce
    BiliClient.prefs.v66SubtitleAnimationBounce = enabled
    AppToast.show(this, "Subtitle Animation Bounce: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV66CastVideoDolbyVisionToggle() {
    val enabled = !BiliClient.prefs.v66CastVideoDolbyVision
    BiliClient.prefs.v66CastVideoDolbyVision = enabled
    AppToast.show(this, "Cast Video Dolby Vision: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV66DanmakuFilterByMedalToggle() {
    val enabled = !BiliClient.prefs.v66DanmakuFilterByMedal
    BiliClient.prefs.v66DanmakuFilterByMedal = enabled
    AppToast.show(this, "Danmaku Filter By Medal: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV66PlaylistAutoShuffleOnStartToggle() {
    val enabled = !BiliClient.prefs.v66PlaylistAutoShuffleOnStart
    BiliClient.prefs.v66PlaylistAutoShuffleOnStart = enabled
    AppToast.show(this, "Playlist Auto Shuffle On Start: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV66CastAudioDolbyAtmosToggle() {
    val enabled = !BiliClient.prefs.v66CastAudioDolbyAtmos
    BiliClient.prefs.v66CastAudioDolbyAtmos = enabled
    AppToast.show(this, "Cast Audio Dolby Atmos: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV67VideoAdaptiveTemporalBlendToggle() {
    val enabled = !BiliClient.prefs.v67VideoAdaptiveTemporalBlend
    BiliClient.prefs.v67VideoAdaptiveTemporalBlend = enabled
    AppToast.show(this, "Video Adaptive Temporal Blend: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV67SubtitleAnimationZoomToggle() {
    val enabled = !BiliClient.prefs.v67SubtitleAnimationZoom
    BiliClient.prefs.v67SubtitleAnimationZoom = enabled
    AppToast.show(this, "Subtitle Animation Zoom: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV67VideoColorTiltShiftToggle() {
    val enabled = !BiliClient.prefs.v67VideoColorTiltShift
    BiliClient.prefs.v67VideoColorTiltShift = enabled
    AppToast.show(this, "Video Color Tilt Shift: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV67CastVideo3DToggle() {
    val enabled = !BiliClient.prefs.v67CastVideo3D
    BiliClient.prefs.v67CastVideo3D = enabled
    AppToast.show(this, "Cast Video 3D: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV67VideoAdaptiveSpatialBlendToggle() {
    val enabled = !BiliClient.prefs.v67VideoAdaptiveSpatialBlend
    BiliClient.prefs.v67VideoAdaptiveSpatialBlend = enabled
    AppToast.show(this, "Video Adaptive Spatial Blend: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV67VideoColorCrossProcessToggle() {
    val enabled = !BiliClient.prefs.v67VideoColorCrossProcess
    BiliClient.prefs.v67VideoColorCrossProcess = enabled
    AppToast.show(this, "Video Color Cross Process: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV67DanmakuHistoryExportAutoToggle() {
    val enabled = !BiliClient.prefs.v67DanmakuHistoryExportAuto
    BiliClient.prefs.v67DanmakuHistoryExportAuto = enabled
    AppToast.show(this, "Danmaku History Export Auto: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV67CastAudioSpatialToggle() {
    val enabled = !BiliClient.prefs.v67CastAudioSpatial
    BiliClient.prefs.v67CastAudioSpatial = enabled
    AppToast.show(this, "Cast Audio Spatial: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV68VideoAdaptiveColorBalanceToggle() {
    val enabled = !BiliClient.prefs.v68VideoAdaptiveColorBalance
    BiliClient.prefs.v68VideoAdaptiveColorBalance = enabled
    AppToast.show(this, "Video Adaptive Color Balance: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV68SubtitleAnimationRotateToggle() {
    val enabled = !BiliClient.prefs.v68SubtitleAnimationRotate
    BiliClient.prefs.v68SubtitleAnimationRotate = enabled
    AppToast.show(this, "Subtitle Animation Rotate: ${if (enabled) "ON" else "OFF"}")
}

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

