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

internal fun PlayerActivity.showV68CastVideoSurroundToggle() {
    val enabled = !BiliClient.prefs.v68CastVideoSurround
    BiliClient.prefs.v68CastVideoSurround = enabled
    AppToast.show(this, "Cast Video Surround: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV68VideoAdaptiveNoiseReduceToggle() {
    val enabled = !BiliClient.prefs.v68VideoAdaptiveNoiseReduce
    BiliClient.prefs.v68VideoAdaptiveNoiseReduce = enabled
    AppToast.show(this, "Video Adaptive Noise Reduce: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV68DanmakuFilterByTitleToggle() {
    val enabled = !BiliClient.prefs.v68DanmakuFilterByTitle
    BiliClient.prefs.v68DanmakuFilterByTitle = enabled
    AppToast.show(this, "Danmaku Filter By Title: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV68PlaylistAutoNextOnEndToggle() {
    val enabled = !BiliClient.prefs.v68PlaylistAutoNextOnEnd
    BiliClient.prefs.v68PlaylistAutoNextOnEnd = enabled
    AppToast.show(this, "Playlist Auto Next On End: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV68DanmakuHistoryImportToggle() {
    val enabled = !BiliClient.prefs.v68DanmakuHistoryImport
    BiliClient.prefs.v68DanmakuHistoryImport = enabled
    AppToast.show(this, "Danmaku History Import: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV68CastAudioSurroundToggle() {
    val enabled = !BiliClient.prefs.v68CastAudioSurround
    BiliClient.prefs.v68CastAudioSurround = enabled
    AppToast.show(this, "Cast Audio Surround: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV69VideoAdaptiveDetailEnhanceToggle() {
    val enabled = !BiliClient.prefs.v69VideoAdaptiveDetailEnhance
    BiliClient.prefs.v69VideoAdaptiveDetailEnhance = enabled
    AppToast.show(this, "Video Adaptive Detail Enhance: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV69SubtitleAnimationTypewriterToggle() {
    val enabled = !BiliClient.prefs.v69SubtitleAnimationTypewriter
    BiliClient.prefs.v69SubtitleAnimationTypewriter = enabled
    AppToast.show(this, "Subtitle Animation Typewriter: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV69CastVideoMultiViewToggle() {
    val enabled = !BiliClient.prefs.v69CastVideoMultiView
    BiliClient.prefs.v69CastVideoMultiView = enabled
    AppToast.show(this, "Cast Video Multi View: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV69VideoAdaptiveChromaEnhanceToggle() {
    val enabled = !BiliClient.prefs.v69VideoAdaptiveChromaEnhance
    BiliClient.prefs.v69VideoAdaptiveChromaEnhance = enabled
    AppToast.show(this, "Video Adaptive Chroma Enhance: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV69DanmakuFilterByContentToggle() {
    val enabled = !BiliClient.prefs.v69DanmakuFilterByContent
    BiliClient.prefs.v69DanmakuFilterByContent = enabled
    AppToast.show(this, "Danmaku Filter By Content: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV69PlaylistAutoResumeToggle() {
    val enabled = !BiliClient.prefs.v69PlaylistAutoResume
    BiliClient.prefs.v69PlaylistAutoResume = enabled
    AppToast.show(this, "Playlist Auto Resume: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV69DanmakuHistoryClearToggle() {
    val enabled = !BiliClient.prefs.v69DanmakuHistoryClear
    BiliClient.prefs.v69DanmakuHistoryClear = enabled
    AppToast.show(this, "Danmaku History Clear: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV69CastAudioMultiViewToggle() {
    val enabled = !BiliClient.prefs.v69CastAudioMultiView
    BiliClient.prefs.v69CastAudioMultiView = enabled
    AppToast.show(this, "Cast Audio Multi View: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV70VideoAdaptiveLumaEnhanceToggle() {
    val enabled = !BiliClient.prefs.v70VideoAdaptiveLumaEnhance
    BiliClient.prefs.v70VideoAdaptiveLumaEnhance = enabled
    AppToast.show(this, "Video Adaptive Luma Enhance: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV70SubtitleAnimationHighlightToggle() {
    val enabled = !BiliClient.prefs.v70SubtitleAnimationHighlight
    BiliClient.prefs.v70SubtitleAnimationHighlight = enabled
    AppToast.show(this, "Subtitle Animation Highlight: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV70CastVideoMultiScreenToggle() {
    val enabled = !BiliClient.prefs.v70CastVideoMultiScreen
    BiliClient.prefs.v70CastVideoMultiScreen = enabled
    AppToast.show(this, "Cast Video Multi Screen: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV70DanmakuFilterByGiftToggle() {
    val enabled = !BiliClient.prefs.v70DanmakuFilterByGift
    BiliClient.prefs.v70DanmakuFilterByGift = enabled
    AppToast.show(this, "Danmaku Filter By Gift: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV70PlaylistAutoCreateToggle() {
    val enabled = !BiliClient.prefs.v70PlaylistAutoCreate
    BiliClient.prefs.v70PlaylistAutoCreate = enabled
    AppToast.show(this, "Playlist Auto Create: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV70DanmakuHistoryStatsToggle() {
    val enabled = !BiliClient.prefs.v70DanmakuHistoryStats
    BiliClient.prefs.v70DanmakuHistoryStats = enabled
    AppToast.show(this, "Danmaku History Stats: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV70CastAudioMultiScreenToggle() {
    val enabled = !BiliClient.prefs.v70CastAudioMultiScreen
    BiliClient.prefs.v70CastAudioMultiScreen = enabled
    AppToast.show(this, "Cast Audio Multi Screen: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV71DanmakuCollisionAvoidanceToggle() {
    val enabled = !BiliClient.prefs.v71DanmakuCollisionAvoidance
    BiliClient.prefs.v71DanmakuCollisionAvoidance = enabled
    AppToast.show(this, "Danmaku Collision Avoidance: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV71CastVideoStabilizationToggle() {
    val enabled = !BiliClient.prefs.v71CastVideoStabilization
    BiliClient.prefs.v71CastVideoStabilization = enabled
    AppToast.show(this, "Cast Video Stabilization: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV71PlaylistAutoRecoverToggle() {
    val enabled = !BiliClient.prefs.v71PlaylistAutoRecover
    BiliClient.prefs.v71PlaylistAutoRecover = enabled
    AppToast.show(this, "Playlist Auto Recover: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV71CacheIntegrityCheckToggle() {
    val enabled = !BiliClient.prefs.v71CacheIntegrityCheck
    BiliClient.prefs.v71CacheIntegrityCheck = enabled
    AppToast.show(this, "Cache Integrity Check: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV71ProgressBarChapterMarksToggle() {
    val enabled = !BiliClient.prefs.v71ProgressBarChapterMarks
    BiliClient.prefs.v71ProgressBarChapterMarks = enabled
    AppToast.show(this, "Progress Bar Chapter Marks: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV71VolumeNormalizationAutoToggle() {
    val enabled = !BiliClient.prefs.v71VolumeNormalizationAuto
    BiliClient.prefs.v71VolumeNormalizationAuto = enabled
    AppToast.show(this, "Volume Normalization Auto: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV71HistoryAutoSyncToggle() {
    val enabled = !BiliClient.prefs.v71HistoryAutoSync
    BiliClient.prefs.v71HistoryAutoSync = enabled
    AppToast.show(this, "History Auto Sync: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV71PlaybackResumeFromBookmarkToggle() {
    val enabled = !BiliClient.prefs.v71PlaybackResumeFromBookmark
    BiliClient.prefs.v71PlaybackResumeFromBookmark = enabled
    AppToast.show(this, "Playback Resume From Bookmark: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV71ScreenshotAutoAnnotateToggle() {
    val enabled = !BiliClient.prefs.v71ScreenshotAutoAnnotate
    BiliClient.prefs.v71ScreenshotAutoAnnotate = enabled
    AppToast.show(this, "Screenshot Auto Annotate: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV71VideoHDR10PlusToggle() {
    val enabled = !BiliClient.prefs.v71VideoHDR10Plus
    BiliClient.prefs.v71VideoHDR10Plus = enabled
    AppToast.show(this, "Video HDR10+: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV72CastAudioNormalizationToggle() {
    val enabled = !BiliClient.prefs.v72CastAudioNormalization
    BiliClient.prefs.v72CastAudioNormalization = enabled
    AppToast.show(this, "Cast Audio Normalization: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV72CacheDeduplicationToggle() {
    val enabled = !BiliClient.prefs.v72CacheDeduplication
    BiliClient.prefs.v72CacheDeduplication = enabled
    AppToast.show(this, "Cache Deduplication: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV72ProgressBarBufferIndicatorToggle() {
    val enabled = !BiliClient.prefs.v72ProgressBarBufferIndicator
    BiliClient.prefs.v72ProgressBarBufferIndicator = enabled
    AppToast.show(this, "Progress Bar Buffer Indicator: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV72HistoryAutoBackupToggle() {
    val enabled = !BiliClient.prefs.v72HistoryAutoBackup
    BiliClient.prefs.v72HistoryAutoBackup = enabled
    AppToast.show(this, "History Auto Backup: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV72PlaybackAutoBookmarkToggle() {
    val enabled = !BiliClient.prefs.v72PlaybackAutoBookmark
    BiliClient.prefs.v72PlaybackAutoBookmark = enabled
    AppToast.show(this, "Playback Auto Bookmark: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV72ScreenshotAutoShareToggle() {
    val enabled = !BiliClient.prefs.v72ScreenshotAutoShare
    BiliClient.prefs.v72ScreenshotAutoShare = enabled
    AppToast.show(this, "Screenshot Auto Share: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV72SubtitleBgGradientCustomToggle() {
    val enabled = !BiliClient.prefs.v72SubtitleBgGradientCustom
    BiliClient.prefs.v72SubtitleBgGradientCustom = enabled
    AppToast.show(this, "Subtitle BG Gradient Custom: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV73ScreenshotAutoEditToggle() {
    val enabled = !BiliClient.prefs.v73ScreenshotAutoEdit
    BiliClient.prefs.v73ScreenshotAutoEdit = enabled
    AppToast.show(this, "Screenshot Auto Edit: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV73VideoAlphaChannelToggle() {
    val enabled = !BiliClient.prefs.v73VideoAlphaChannel
    BiliClient.prefs.v73VideoAlphaChannel = enabled
    AppToast.show(this, "Video Alpha Channel: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV73DanmakuFontWeightAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v73DanmakuFontWeightAdaptive
    BiliClient.prefs.v73DanmakuFontWeightAdaptive = enabled
    AppToast.show(this, "Danmaku Font Weight Adaptive: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV74VideoDepthOfFieldToggle() {
    val enabled = !BiliClient.prefs.v74VideoDepthOfField
    BiliClient.prefs.v74VideoDepthOfField = enabled
    AppToast.show(this, "Video Depth Of Field: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV74CastVideoHDR10PlusToggle() {
    val enabled = !BiliClient.prefs.v74CastVideoHDR10Plus
    BiliClient.prefs.v74CastVideoHDR10Plus = enabled
    AppToast.show(this, "Cast Video HDR10+: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV74ProgressBarSeekPreviewToggle() {
    val enabled = !BiliClient.prefs.v74ProgressBarSeekPreview
    BiliClient.prefs.v74ProgressBarSeekPreview = enabled
    AppToast.show(this, "Progress Bar Seek Preview: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV74PlaybackAutoPauseOnFocusToggle() {
    val enabled = !BiliClient.prefs.v74PlaybackAutoPauseOnFocus
    BiliClient.prefs.v74PlaybackAutoPauseOnFocus = enabled
    AppToast.show(this, "Playback Auto Pause On Focus: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV74ScreenshotAutoCropToggle() {
    val enabled = !BiliClient.prefs.v74ScreenshotAutoCrop
    BiliClient.prefs.v74ScreenshotAutoCrop = enabled
    AppToast.show(this, "Screenshot Auto Crop: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV74VideoBokehEffectToggle() {
    val enabled = !BiliClient.prefs.v74VideoBokehEffect
    BiliClient.prefs.v74VideoBokehEffect = enabled
    AppToast.show(this, "Video Bokeh Effect: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV75VideoChromaKeyToggle() {
    val enabled = !BiliClient.prefs.v75VideoChromaKey
    BiliClient.prefs.v75VideoChromaKey = enabled
    AppToast.show(this, "Video Chroma Key: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV75GestureSoundFeedbackToggle() {
    val enabled = !BiliClient.prefs.v75GestureSoundFeedback
    BiliClient.prefs.v75GestureSoundFeedback = enabled
    AppToast.show(this, "Gesture Sound Feedback: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV75CastAudioSpatialToggle() {
    val enabled = !BiliClient.prefs.v75CastAudioSpatial
    BiliClient.prefs.v75CastAudioSpatial = enabled
    AppToast.show(this, "Cast Audio Spatial: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV75ProgressBarChapterPreviewToggle() {
    val enabled = !BiliClient.prefs.v75ProgressBarChapterPreview
    BiliClient.prefs.v75ProgressBarChapterPreview = enabled
    AppToast.show(this, "Progress Bar Chapter Preview: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV75VolumeSpatialAudioToggle() {
    val enabled = !BiliClient.prefs.v75VolumeSpatialAudio
    BiliClient.prefs.v75VolumeSpatialAudio = enabled
    AppToast.show(this, "Volume Spatial Audio: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV75HistoryAutoRestoreToggle() {
    val enabled = !BiliClient.prefs.v75HistoryAutoRestore
    BiliClient.prefs.v75HistoryAutoRestore = enabled
    AppToast.show(this, "History Auto Restore: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV75PlaybackAutoResumeOnReturnToggle() {
    val enabled = !BiliClient.prefs.v75PlaybackAutoResumeOnReturn
    BiliClient.prefs.v75PlaybackAutoResumeOnReturn = enabled
    AppToast.show(this, "Playback Auto Resume On Return: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV75ScreenshotAutoFilterToggle() {
    val enabled = !BiliClient.prefs.v75ScreenshotAutoFilter
    BiliClient.prefs.v75ScreenshotAutoFilter = enabled
    AppToast.show(this, "Screenshot Auto Filter: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV75VideoFrameBlendToggle() {
    val enabled = !BiliClient.prefs.v75VideoFrameBlend
    BiliClient.prefs.v75VideoFrameBlend = enabled
    AppToast.show(this, "Video Frame Blend: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV76GestureVibrationFeedbackToggle() {
    val enabled = !BiliClient.prefs.v76GestureVibrationFeedback
    BiliClient.prefs.v76GestureVibrationFeedback = enabled
    AppToast.show(this, "Gesture Vibration Feedback: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV76CastVideoDolbyAtmosToggle() {
    val enabled = !BiliClient.prefs.v76CastVideoDolbyAtmos
    BiliClient.prefs.v76CastVideoDolbyAtmos = enabled
    AppToast.show(this, "Cast Video Dolby Atmos: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV76Volume3DAudioToggle() {
    val enabled = !BiliClient.prefs.v76Volume3DAudio
    BiliClient.prefs.v76Volume3DAudio = enabled
    AppToast.show(this, "Volume 3D Audio: ${if (enabled) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV76PlaybackAutoSkipSilenceToggle() {
    val enabled = !BiliClient.prefs.v76PlaybackAutoSkipSilence
    BiliClient.prefs.v76PlaybackAutoSkipSilence = enabled
    AppToast.show(this, "Playback Auto Skip Silence: ${if (enabled) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV76VideoLUTCustomToggle() {
    val enabled = !BiliClient.prefs.v76VideoLUTCustom
    BiliClient.prefs.v76VideoLUTCustom = enabled
    AppToast.show(this, "Video LUT Custom: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV76DanmakuFontCustomPathToggle() {
    val enabled = !BiliClient.prefs.v76DanmakuFontCustomPath
    BiliClient.prefs.v76DanmakuFontCustomPath = enabled
    AppToast.show(this, "Danmaku Font Custom Path: ${if (enabled) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV77VideoFrameInterpolationToggle() {
    val enabled = !BiliClient.prefs.v77VideoFrameInterpolation
    BiliClient.prefs.v77VideoFrameInterpolation = enabled
    AppToast.show(this, "Video Frame Interpolation: ${if (enabled) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV77GestureVisualFeedbackToggle() {
    val enabled = !BiliClient.prefs.v77GestureVisualFeedback
    BiliClient.prefs.v77GestureVisualFeedback = enabled
    AppToast.show(this, "Gesture Visual Feedback: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV77CastAudio3DToggle() {
    val enabled = !BiliClient.prefs.v77CastAudio3D
    BiliClient.prefs.v77CastAudio3D = enabled
    AppToast.show(this, "Cast Audio 3D: ${if (enabled) "ON" else "OFF"}")
}

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
}

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
}

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
}

internal fun PlayerActivity.showV77VolumeAutoLevelingToggle() {
    val enabled = !BiliClient.prefs.v77VolumeAutoLeveling
    BiliClient.prefs.v77VolumeAutoLeveling = enabled
    AppToast.show(this, "Volume Auto Leveling: ${if (enabled) "ON" else "OFF"}")
}

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
}

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
}

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
}

internal fun PlayerActivity.showV77VideoMotionBlurToggle() {
    val enabled = !BiliClient.prefs.v77VideoMotionBlur
    BiliClient.prefs.v77VideoMotionBlur = enabled
    AppToast.show(this, "Video Motion Blur: ${if (enabled) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV78VideoAdaptiveResolutionToggle() {
    val enabled = !BiliClient.prefs.v78VideoAdaptiveResolution
    BiliClient.prefs.v78VideoAdaptiveResolution = enabled
    AppToast.show(this, "Video Adaptive Resolution: ${if (enabled) "ON" else "OFF"}")
}

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
}

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
}

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
}

internal fun PlayerActivity.showV78CastVideoDolbyVisionIQToggle() {
    val enabled = !BiliClient.prefs.v78CastVideoDolbyVisionIQ
    BiliClient.prefs.v78CastVideoDolbyVisionIQ = enabled
    AppToast.show(this, "Cast Video Dolby Vision IQ: ${if (enabled) "ON" else "OFF"}")
}

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
}

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
}

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
}

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
}

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
}

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
}

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
}

internal fun PlayerActivity.showV78VideoAdaptiveBitrateToggle() {
    val enabled = !BiliClient.prefs.v78VideoAdaptiveBitrate
    BiliClient.prefs.v78VideoAdaptiveBitrate = enabled
    AppToast.show(this, "Video Adaptive Bitrate: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV78DanmakuScrollSpeedAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v78DanmakuScrollSpeedAdaptive
    BiliClient.prefs.v78DanmakuScrollSpeedAdaptive = enabled
    AppToast.show(this, "Danmaku Scroll Speed Adaptive: ${if (enabled) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV79VideoColorGradingCustomToggle() {
    val enabled = !BiliClient.prefs.v79VideoColorGradingCustom
    BiliClient.prefs.v79VideoColorGradingCustom = enabled
    AppToast.show(this, "Video Color Grading Custom: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV79DanmakuFontSpacingAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v79DanmakuFontSpacingAdaptive
    BiliClient.prefs.v79DanmakuFontSpacingAdaptive = enabled
    AppToast.show(this, "Danmaku Font Spacing Adaptive: ${if (enabled) "ON" else "OFF"}")
}

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
}

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
}

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
}

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
}

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
}

internal fun PlayerActivity.showV79ProgressBarThumbAnimationToggle() {
    val enabled = !BiliClient.prefs.v79ProgressBarThumbAnimation
    BiliClient.prefs.v79ProgressBarThumbAnimation = enabled
    AppToast.show(this, "Progress Bar Thumb Animation: ${if (enabled) "ON" else "OFF"}")
}

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
}

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
}

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
}

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
}

internal fun PlayerActivity.showV79VideoAdaptiveFrameRateToggle() {
    val enabled = !BiliClient.prefs.v79VideoAdaptiveFrameRate
    BiliClient.prefs.v79VideoAdaptiveFrameRate = enabled
    AppToast.show(this, "Video Adaptive Frame Rate: ${if (enabled) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV80VideoAdaptiveColorGradingToggle() {
    val enabled = !BiliClient.prefs.v80VideoAdaptiveColorGrading
    BiliClient.prefs.v80VideoAdaptiveColorGrading = enabled
    AppToast.show(this, "Video Adaptive Color Grading: ${if (enabled) "ON" else "OFF"}")
}

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
}

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
}

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
}

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
}

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
}

internal fun PlayerActivity.showV80CacheEncryptionCustomToggle() {
    val enabled = !BiliClient.prefs.v80CacheEncryptionCustom
    BiliClient.prefs.v80CacheEncryptionCustom = enabled
    AppToast.show(this, "Cache Encryption Custom: ${if (enabled) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV80VolumeAutoLevelingCustomToggle() {
    val enabled = !BiliClient.prefs.v80VolumeAutoLevelingCustom
    BiliClient.prefs.v80VolumeAutoLevelingCustom = enabled
    AppToast.show(this, "Volume Auto Leveling Custom: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV80HistoryAutoSyncCustomToggle() {
    val enabled = !BiliClient.prefs.v80HistoryAutoSyncCustom
    BiliClient.prefs.v80HistoryAutoSyncCustom = enabled
    AppToast.show(this, "History Auto Sync Custom: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV80PlaybackAutoResumeCustomToggle() {
    val enabled = !BiliClient.prefs.v80PlaybackAutoResumeCustom
    BiliClient.prefs.v80PlaybackAutoResumeCustom = enabled
    AppToast.show(this, "Playback Auto Resume Custom: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV80ScreenshotAutoShareCustomToggle() {
    val enabled = !BiliClient.prefs.v80ScreenshotAutoShareCustom
    BiliClient.prefs.v80ScreenshotAutoShareCustom = enabled
    AppToast.show(this, "Screenshot Auto Share Custom: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV80VideoAdaptiveMotionBlurToggle() {
    val enabled = !BiliClient.prefs.v80VideoAdaptiveMotionBlur
    BiliClient.prefs.v80VideoAdaptiveMotionBlur = enabled
    AppToast.show(this, "Video Adaptive Motion Blur: ${if (enabled) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV80SubtitleAnimationLoopToggle() {
    val enabled = !BiliClient.prefs.v80SubtitleAnimationLoop
    BiliClient.prefs.v80SubtitleAnimationLoop = enabled
    AppToast.show(this, "Subtitle Animation Loop: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV81NetworkBandwidthAdaptToggle() {
    val enabled = !BiliClient.prefs.v81NetworkBandwidthAdapt
    BiliClient.prefs.v81NetworkBandwidthAdapt = enabled
    AppToast.show(this, "Network Bandwidth Adapt: ${if (enabled) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV81SubtitlePositionLockToggle() {
    val enabled = !BiliClient.prefs.v81SubtitlePositionLock
    BiliClient.prefs.v81SubtitlePositionLock = enabled
    AppToast.show(this, "Subtitle Position Lock: ${if (enabled) "ON" else "OFF"}")
}

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
}

internal fun PlayerActivity.showV81CastReconnectAutoToggle() {
    val enabled = !BiliClient.prefs.v81CastReconnectAuto
    BiliClient.prefs.v81CastReconnectAuto = enabled
    AppToast.show(this, "Cast Reconnect Auto: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV81PlaylistBookmarkSyncToggle() {
    val enabled = !BiliClient.prefs.v81PlaylistBookmarkSync
    BiliClient.prefs.v81PlaylistBookmarkSync = enabled
    AppToast.show(this, "Playlist Bookmark Sync: ${if (enabled) "ON" else "OFF"}")
}

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
}

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
}

internal fun PlayerActivity.showV81VolumeLoudnessNormalizeToggle() {
    val enabled = !BiliClient.prefs.v81VolumeLoudnessNormalize
    BiliClient.prefs.v81VolumeLoudnessNormalize = enabled
    AppToast.show(this, "Volume Loudness Normalize: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV81HistorySearchFilterToggle() {
    val enabled = !BiliClient.prefs.v81HistorySearchFilter
    BiliClient.prefs.v81HistorySearchFilter = enabled
    AppToast.show(this, "History Search Filter: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV81PlaybackSkipAdAutoToggle() {
    val enabled = !BiliClient.prefs.v81PlaybackSkipAdAuto
    BiliClient.prefs.v81PlaybackSkipAdAuto = enabled
    AppToast.show(this, "Playback Skip Ad Auto: ${if (enabled) "ON" else "OFF"}")
}

