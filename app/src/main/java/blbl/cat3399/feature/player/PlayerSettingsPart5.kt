package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.feature.player.danmaku.DanmakuFontWeight


// v76.9: Volume 3D Audio
internal fun PlayerActivity.showV76Volume3DAudioToggle() {
    val enabled = !BiliClient.prefs.v76Volume3DAudio
    BiliClient.prefs.v76Volume3DAudio = enabled
    AppToast.show(this, "Volume 3D Audio: ${if (enabled) "ON" else "OFF"}")
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
}

// v76.11: Playback Auto Skip Silence
internal fun PlayerActivity.showV76PlaybackAutoSkipSilenceToggle() {
    val enabled = !BiliClient.prefs.v76PlaybackAutoSkipSilence
    BiliClient.prefs.v76PlaybackAutoSkipSilence = enabled
    AppToast.show(this, "Playback Auto Skip Silence: ${if (enabled) "ON" else "OFF"}")
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
}

// v76.13: Video LUT Custom
internal fun PlayerActivity.showV76VideoLUTCustomToggle() {
    val enabled = !BiliClient.prefs.v76VideoLUTCustom
    BiliClient.prefs.v76VideoLUTCustom = enabled
    AppToast.show(this, "Video LUT Custom: ${if (enabled) "ON" else "OFF"}")
}

// v76.14: Danmaku Font Custom Path
internal fun PlayerActivity.showV76DanmakuFontCustomPathToggle() {
    val enabled = !BiliClient.prefs.v76DanmakuFontCustomPath
    BiliClient.prefs.v76DanmakuFontCustomPath = enabled
    AppToast.show(this, "Danmaku Font Custom Path: ${if (enabled) "ON" else "OFF"}")
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
}

// v77.1: Video Frame Interpolation
internal fun PlayerActivity.showV77VideoFrameInterpolationToggle() {
    val enabled = !BiliClient.prefs.v77VideoFrameInterpolation
    BiliClient.prefs.v77VideoFrameInterpolation = enabled
    AppToast.show(this, "Video Frame Interpolation: ${if (enabled) "ON" else "OFF"}")
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
}

// v77.4: Gesture Visual Feedback
internal fun PlayerActivity.showV77GestureVisualFeedbackToggle() {
    val enabled = !BiliClient.prefs.v77GestureVisualFeedback
    BiliClient.prefs.v77GestureVisualFeedback = enabled
    AppToast.show(this, "Gesture Visual Feedback: ${if (enabled) "ON" else "OFF"}")
}

// v77.5: Cast Audio 3D
internal fun PlayerActivity.showV77CastAudio3DToggle() {
    val enabled = !BiliClient.prefs.v77CastAudio3D
    BiliClient.prefs.v77CastAudio3D = enabled
    AppToast.show(this, "Cast Audio 3D: ${if (enabled) "ON" else "OFF"}")
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
}

// v77.9: Volume Auto Leveling
internal fun PlayerActivity.showV77VolumeAutoLevelingToggle() {
    val enabled = !BiliClient.prefs.v77VolumeAutoLeveling
    BiliClient.prefs.v77VolumeAutoLeveling = enabled
    AppToast.show(this, "Volume Auto Leveling: ${if (enabled) "ON" else "OFF"}")
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
}

// v77.13: Video Motion Blur
internal fun PlayerActivity.showV77VideoMotionBlurToggle() {
    val enabled = !BiliClient.prefs.v77VideoMotionBlur
    BiliClient.prefs.v77VideoMotionBlur = enabled
    AppToast.show(this, "Video Motion Blur: ${if (enabled) "ON" else "OFF"}")
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
}

// v78.1: Video Adaptive Resolution
internal fun PlayerActivity.showV78VideoAdaptiveResolutionToggle() {
    val enabled = !BiliClient.prefs.v78VideoAdaptiveResolution
    BiliClient.prefs.v78VideoAdaptiveResolution = enabled
    AppToast.show(this, "Video Adaptive Resolution: ${if (enabled) "ON" else "OFF"}")
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
}

// v78.5: Cast Video Dolby Vision IQ
internal fun PlayerActivity.showV78CastVideoDolbyVisionIQToggle() {
    val enabled = !BiliClient.prefs.v78CastVideoDolbyVisionIQ
    BiliClient.prefs.v78CastVideoDolbyVisionIQ = enabled
    AppToast.show(this, "Cast Video Dolby Vision IQ: ${if (enabled) "ON" else "OFF"}")
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
}

// v78.13: Video Adaptive Bitrate
internal fun PlayerActivity.showV78VideoAdaptiveBitrateToggle() {
    val enabled = !BiliClient.prefs.v78VideoAdaptiveBitrate
    BiliClient.prefs.v78VideoAdaptiveBitrate = enabled
    AppToast.show(this, "Video Adaptive Bitrate: ${if (enabled) "ON" else "OFF"}")
}

// v78.14: Danmaku Scroll Speed Adaptive
internal fun PlayerActivity.showV78DanmakuScrollSpeedAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v78DanmakuScrollSpeedAdaptive
    BiliClient.prefs.v78DanmakuScrollSpeedAdaptive = enabled
    AppToast.show(this, "Danmaku Scroll Speed Adaptive: ${if (enabled) "ON" else "OFF"}")
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
}

// v79.1: Video Color Grading Custom
internal fun PlayerActivity.showV79VideoColorGradingCustomToggle() {
    val enabled = !BiliClient.prefs.v79VideoColorGradingCustom
    BiliClient.prefs.v79VideoColorGradingCustom = enabled
    AppToast.show(this, "Video Color Grading Custom: ${if (enabled) "ON" else "OFF"}")
}

// v79.2: Danmaku Font Spacing Adaptive
internal fun PlayerActivity.showV79DanmakuFontSpacingAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v79DanmakuFontSpacingAdaptive
    BiliClient.prefs.v79DanmakuFontSpacingAdaptive = enabled
    AppToast.show(this, "Danmaku Font Spacing Adaptive: ${if (enabled) "ON" else "OFF"}")
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
}

// v79.8: Progress Bar Thumb Animation
internal fun PlayerActivity.showV79ProgressBarThumbAnimationToggle() {
    val enabled = !BiliClient.prefs.v79ProgressBarThumbAnimation
    BiliClient.prefs.v79ProgressBarThumbAnimation = enabled
    AppToast.show(this, "Progress Bar Thumb Animation: ${if (enabled) "ON" else "OFF"}")
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
}

// v79.13: Video Adaptive Frame Rate
internal fun PlayerActivity.showV79VideoAdaptiveFrameRateToggle() {
    val enabled = !BiliClient.prefs.v79VideoAdaptiveFrameRate
    BiliClient.prefs.v79VideoAdaptiveFrameRate = enabled
    AppToast.show(this, "Video Adaptive Frame Rate: ${if (enabled) "ON" else "OFF"}")
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
}

// v80.1: Video Adaptive Color Grading
internal fun PlayerActivity.showV80VideoAdaptiveColorGradingToggle() {
    val enabled = !BiliClient.prefs.v80VideoAdaptiveColorGrading
    BiliClient.prefs.v80VideoAdaptiveColorGrading = enabled
    AppToast.show(this, "Video Adaptive Color Grading: ${if (enabled) "ON" else "OFF"}")
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
}

// v80.7: Cache Encryption Custom
internal fun PlayerActivity.showV80CacheEncryptionCustomToggle() {
    val enabled = !BiliClient.prefs.v80CacheEncryptionCustom
    BiliClient.prefs.v80CacheEncryptionCustom = enabled
    AppToast.show(this, "Cache Encryption Custom: ${if (enabled) "ON" else "OFF"}")
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
}

// v80.9: Volume Auto Leveling Custom
internal fun PlayerActivity.showV80VolumeAutoLevelingCustomToggle() {
    val enabled = !BiliClient.prefs.v80VolumeAutoLevelingCustom
    BiliClient.prefs.v80VolumeAutoLevelingCustom = enabled
    AppToast.show(this, "Volume Auto Leveling Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.10: History Auto Sync Custom
internal fun PlayerActivity.showV80HistoryAutoSyncCustomToggle() {
    val enabled = !BiliClient.prefs.v80HistoryAutoSyncCustom
    BiliClient.prefs.v80HistoryAutoSyncCustom = enabled
    AppToast.show(this, "History Auto Sync Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.11: Playback Auto Resume Custom
internal fun PlayerActivity.showV80PlaybackAutoResumeCustomToggle() {
    val enabled = !BiliClient.prefs.v80PlaybackAutoResumeCustom
    BiliClient.prefs.v80PlaybackAutoResumeCustom = enabled
    AppToast.show(this, "Playback Auto Resume Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.12: Screenshot Auto Share Custom
internal fun PlayerActivity.showV80ScreenshotAutoShareCustomToggle() {
    val enabled = !BiliClient.prefs.v80ScreenshotAutoShareCustom
    BiliClient.prefs.v80ScreenshotAutoShareCustom = enabled
    AppToast.show(this, "Screenshot Auto Share Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.13: Video Adaptive Motion Blur
internal fun PlayerActivity.showV80VideoAdaptiveMotionBlurToggle() {
    val enabled = !BiliClient.prefs.v80VideoAdaptiveMotionBlur
    BiliClient.prefs.v80VideoAdaptiveMotionBlur = enabled
    AppToast.show(this, "Video Adaptive Motion Blur: ${if (enabled) "ON" else "OFF"}")
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
}

// v80.15: Subtitle Animation Loop
internal fun PlayerActivity.showV80SubtitleAnimationLoopToggle() {
    val enabled = !BiliClient.prefs.v80SubtitleAnimationLoop
    BiliClient.prefs.v80SubtitleAnimationLoop = enabled
    AppToast.show(this, "Subtitle Animation Loop: ${if (enabled) "ON" else "OFF"}")
}

// v81.1: Network Bandwidth Adapt
internal fun PlayerActivity.showV81NetworkBandwidthAdaptToggle() {
    val enabled = !BiliClient.prefs.v81NetworkBandwidthAdapt
    BiliClient.prefs.v81NetworkBandwidthAdapt = enabled
    AppToast.show(this, "Network Bandwidth Adapt: ${if (enabled) "ON" else "OFF"}")
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
}

// v81.3: Subtitle Position Lock
internal fun PlayerActivity.showV81SubtitlePositionLockToggle() {
    val enabled = !BiliClient.prefs.v81SubtitlePositionLock
    BiliClient.prefs.v81SubtitlePositionLock = enabled
    AppToast.show(this, "Subtitle Position Lock: ${if (enabled) "ON" else "OFF"}")
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
}

// v81.5: Cast Reconnect Auto
internal fun PlayerActivity.showV81CastReconnectAutoToggle() {
    val enabled = !BiliClient.prefs.v81CastReconnectAuto
    BiliClient.prefs.v81CastReconnectAuto = enabled
    AppToast.show(this, "Cast Reconnect Auto: ${if (enabled) "ON" else "OFF"}")
}

// v81.6: Playlist Bookmark Sync
internal fun PlayerActivity.showV81PlaylistBookmarkSyncToggle() {
    val enabled = !BiliClient.prefs.v81PlaylistBookmarkSync
    BiliClient.prefs.v81PlaylistBookmarkSync = enabled
    AppToast.show(this, "Playlist Bookmark Sync: ${if (enabled) "ON" else "OFF"}")
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
}

// v81.9: Volume Loudness Normalize
internal fun PlayerActivity.showV81VolumeLoudnessNormalizeToggle() {
    val enabled = !BiliClient.prefs.v81VolumeLoudnessNormalize
    BiliClient.prefs.v81VolumeLoudnessNormalize = enabled
    AppToast.show(this, "Volume Loudness Normalize: ${if (enabled) "ON" else "OFF"}")
}

// v81.10: History Search Filter
internal fun PlayerActivity.showV81HistorySearchFilterToggle() {
    val enabled = !BiliClient.prefs.v81HistorySearchFilter
    BiliClient.prefs.v81HistorySearchFilter = enabled
    AppToast.show(this, "History Search Filter: ${if (enabled) "ON" else "OFF"}")
}

// v81.11: Playback Skip Ad Auto
internal fun PlayerActivity.showV81PlaybackSkipAdAutoToggle() {
    val enabled = !BiliClient.prefs.v81PlaybackSkipAdAuto
    BiliClient.prefs.v81PlaybackSkipAdAuto = enabled
    AppToast.show(this, "Playback Skip Ad Auto: ${if (enabled) "ON" else "OFF"}")
}

// v81.12: Screenshot Count Display
internal fun PlayerActivity.showV81ScreenshotCountDisplayToggle() {
    val enabled = !BiliClient.prefs.v81ScreenshotCountDisplay
    BiliClient.prefs.v81ScreenshotCountDisplay = enabled
    AppToast.show(this, "Screenshot Count Display: ${if (enabled) "ON" else "OFF"}")
}

// v81.13: Video Upscale AI
internal fun PlayerActivity.showV81VideoUpscaleAIToggle() {
    val enabled = !BiliClient.prefs.v81VideoUpscaleAI
    BiliClient.prefs.v81VideoUpscaleAI = enabled
    AppToast.show(this, "Video Upscale AI: ${if (enabled) "ON" else "OFF"}")
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
}

// v82.6: Playlist Duplicate Detect
internal fun PlayerActivity.showV82PlaylistDuplicateDetectToggle() {
    val enabled = !BiliClient.prefs.v82PlaylistDuplicateDetect
    BiliClient.prefs.v82PlaylistDuplicateDetect = enabled
    AppToast.show(this, "Playlist Duplicate Detect: ${if (enabled) "ON" else "OFF"}")
}

// v82.7: Cache Smart Prefetch
internal fun PlayerActivity.showV82CacheSmartPrefetchToggle() {
    val enabled = !BiliClient.prefs.v82CacheSmartPrefetch
    BiliClient.prefs.v82CacheSmartPrefetch = enabled
    AppToast.show(this, "Cache Smart Prefetch: ${if (enabled) "ON" else "OFF"}")
}

// v82.8: Progress Bar Swipe Seek
internal fun PlayerActivity.showV82ProgressBarSwipeSeekToggle() {
    val enabled = !BiliClient.prefs.v82ProgressBarSwipeSeek
    BiliClient.prefs.v82ProgressBarSwipeSeek = enabled
    AppToast.show(this, "Progress Bar Swipe Seek: ${if (enabled) "ON" else "OFF"}")
}

// v82.9: Volume Night Mode
internal fun PlayerActivity.showV82VolumeNightModeToggle() {
    val enabled = !BiliClient.prefs.v82VolumeNightMode
    BiliClient.prefs.v82VolumeNightMode = enabled
    AppToast.show(this, "Volume Night Mode: ${if (enabled) "ON" else "OFF"}")
}

// v82.10: History Group By Date
internal fun PlayerActivity.showV82HistoryGroupByDateToggle() {
    val enabled = !BiliClient.prefs.v82HistoryGroupByDate
    BiliClient.prefs.v82HistoryGroupByDate = enabled
    AppToast.show(this, "History Group By Date: ${if (enabled) "ON" else "OFF"}")
}

// v82.11: Playback Speed Memory
internal fun PlayerActivity.showV82PlaybackSpeedMemoryToggle() {
    val enabled = !BiliClient.prefs.v82PlaybackSpeedMemory
    BiliClient.prefs.v82PlaybackSpeedMemory = enabled
    AppToast.show(this, "Playback Speed Memory: ${if (enabled) "ON" else "OFF"}")
}

// v82.12: Screenshot Timestamp
internal fun PlayerActivity.showV82ScreenshotTimestampToggle() {
    val enabled = !BiliClient.prefs.v82ScreenshotTimestamp
    BiliClient.prefs.v82ScreenshotTimestamp = enabled
    AppToast.show(this, "Screenshot Timestamp: ${if (enabled) "ON" else "OFF"}")
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
}

// v82.15: Subtitle Sync Auto
internal fun PlayerActivity.showV82SubtitleSyncAutoToggle() {
    val enabled = !BiliClient.prefs.v82SubtitleSyncAuto
    BiliClient.prefs.v82SubtitleSyncAuto = enabled
    AppToast.show(this, "Subtitle Sync Auto: ${if (enabled) "ON" else "OFF"}")
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
}

// v83.3: Subtitle Karaoke Highlight
internal fun PlayerActivity.showV83SubtitleKaraokeHighlightToggle() {
    val enabled = !BiliClient.prefs.v83SubtitleKaraokeHighlight
    BiliClient.prefs.v83SubtitleKaraokeHighlight = enabled
    AppToast.show(this, "Subtitle Karaoke Highlight: ${if (enabled) "ON" else "OFF"}")
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
}

// v83.7: Cache WiFi Priority
internal fun PlayerActivity.showV83CacheWIFIPriorityToggle() {
    val enabled = !BiliClient.prefs.v83CacheWIFIPriority
    BiliClient.prefs.v83CacheWIFIPriority = enabled
    AppToast.show(this, "Cache WiFi Priority: ${if (enabled) "ON" else "OFF"}")
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
}

// v83.11: Playback Auto Next Episode
internal fun PlayerActivity.showV83PlaybackAutoNextEpisodeToggle() {
    val enabled = !BiliClient.prefs.v83PlaybackAutoNextEpisode
    BiliClient.prefs.v83PlaybackAutoNextEpisode = enabled
    AppToast.show(this, "Playback Auto Next Episode: ${if (enabled) "ON" else "OFF"}")
}

// v83.12: Screenshot Overlay Info
internal fun PlayerActivity.showV83ScreenshotOverlayInfoToggle() {
    val enabled = !BiliClient.prefs.v83ScreenshotOverlayInfo
    BiliClient.prefs.v83ScreenshotOverlayInfo = enabled
    AppToast.show(this, "Screenshot Overlay Info: ${if (enabled) "ON" else "OFF"}")
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
}

// v84.3: Subtitle Bilingual Display
internal fun PlayerActivity.showV84SubtitleBilingualDisplayToggle() {
    val enabled = !BiliClient.prefs.v84SubtitleBilingualDisplay
    BiliClient.prefs.v84SubtitleBilingualDisplay = enabled
    AppToast.show(this, "Subtitle Bilingual Display: ${if (enabled) "ON" else "OFF"}")
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
}

// v84.5: Cast Video HDR10 Custom
internal fun PlayerActivity.showV84CastVideoHDR10CustomToggle() {
    val enabled = !BiliClient.prefs.v84CastVideoHDR10Custom
    BiliClient.prefs.v84CastVideoHDR10Custom = enabled
    AppToast.show(this, "Cast Video HDR10 Custom: ${if (enabled) "ON" else "OFF"}")
}

// v84.6: Playlist Auto Play Next
internal fun PlayerActivity.showV84PlaylistAutoPlayNextToggle() {
    val enabled = !BiliClient.prefs.v84PlaylistAutoPlayNext
    BiliClient.prefs.v84PlaylistAutoPlayNext = enabled
    AppToast.show(this, "Playlist Auto Play Next: ${if (enabled) "ON" else "OFF"}")
}

// v84.7: Cache Storage Analyze
internal fun PlayerActivity.showV84CacheStorageAnalyzeToggle() {
    val enabled = !BiliClient.prefs.v84CacheStorageAnalyze
    BiliClient.prefs.v84CacheStorageAnalyze = enabled
    AppToast.show(this, "Cache Storage Analyze: ${if (enabled) "ON" else "OFF"}")
}

// v84.8: Progress Bar Haptic Feedback
internal fun PlayerActivity.showV84ProgressBarHapticFeedbackToggle() {
    val enabled = !BiliClient.prefs.v84ProgressBarHapticFeedback
    BiliClient.prefs.v84ProgressBarHapticFeedback = enabled
    AppToast.show(this, "Progress Bar Haptic Feedback: ${if (enabled) "ON" else "OFF"}")
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
}

// v84.10: History Auto Cleanup
internal fun PlayerActivity.showV84HistoryAutoCleanupToggle() {
    val enabled = !BiliClient.prefs.v84HistoryAutoCleanup
    BiliClient.prefs.v84HistoryAutoCleanup = enabled
    AppToast.show(this, "History Auto Cleanup: ${if (enabled) "ON" else "OFF"}")
}

// v84.11: Playback Auto Play On Open
internal fun PlayerActivity.showV84PlaybackAutoPlayOnOpenToggle() {
    val enabled = !BiliClient.prefs.v84PlaybackAutoPlayOnOpen
    BiliClient.prefs.v84PlaybackAutoPlayOnOpen = enabled
    AppToast.show(this, "Playback Auto Play On Open: ${if (enabled) "ON" else "OFF"}")
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
}

// v84.14: Danmaku Font Italic Toggle
internal fun PlayerActivity.showV84DanmakuFontItalicToggleToggle() {
    val enabled = !BiliClient.prefs.v84DanmakuFontItalicToggle
    BiliClient.prefs.v84DanmakuFontItalicToggle = enabled
    AppToast.show(this, "Danmaku Font Italic Toggle: ${if (enabled) "ON" else "OFF"}")
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
}

// v85.6: Playlist Auto Load More
internal fun PlayerActivity.showV85PlaylistAutoLoadMoreToggle() {
    val enabled = !BiliClient.prefs.v85PlaylistAutoLoadMore
    BiliClient.prefs.v85PlaylistAutoLoadMore = enabled
    AppToast.show(this, "Playlist Auto Load More: ${if (enabled) "ON" else "OFF"}")
}

// v85.7: Cache Cleanup On Low Storage
internal fun PlayerActivity.showV85CacheCleanupOnLowStorageToggle() {
    val enabled = !BiliClient.prefs.v85CacheCleanupOnLowStorage
    BiliClient.prefs.v85CacheCleanupOnLowStorage = enabled
    AppToast.show(this, "Cache Cleanup On Low Storage: ${if (enabled) "ON" else "OFF"}")
}

// v85.8: Progress Bar Tooltip
internal fun PlayerActivity.showV85ProgressBarTooltipToggle() {
    val enabled = !BiliClient.prefs.v85ProgressBarTooltip
    BiliClient.prefs.v85ProgressBarTooltip = enabled
    AppToast.show(this, "Progress Bar Tooltip: ${if (enabled) "ON" else "OFF"}")
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
}

// v85.11: Playback Auto Loop Single
internal fun PlayerActivity.showV85PlaybackAutoLoopSingleToggle() {
    val enabled = !BiliClient.prefs.v85PlaybackAutoLoopSingle
    BiliClient.prefs.v85PlaybackAutoLoopSingle = enabled
    AppToast.show(this, "Playback Auto Loop Single: ${if (enabled) "ON" else "OFF"}")
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
}

// v85.14: Danmaku BG Border Toggle
internal fun PlayerActivity.showV85DanmakuBgBorderToggleToggle() {
    val enabled = !BiliClient.prefs.v85DanmakuBgBorderToggle
    BiliClient.prefs.v85DanmakuBgBorderToggle = enabled
    AppToast.show(this, "Danmaku BG Border Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v85.15: Subtitle Font Size Auto
internal fun PlayerActivity.showV85SubtitleFontSizeAutoToggle() {
    val enabled = !BiliClient.prefs.v85SubtitleFontSizeAuto
    BiliClient.prefs.v85SubtitleFontSizeAuto = enabled
    AppToast.show(this, "Subtitle Font Size Auto: ${if (enabled) "ON" else "OFF"}")
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
}

// v86.6: Playlist Auto Refresh
internal fun PlayerActivity.showV86PlaylistAutoRefreshToggle() {
    val enabled = !BiliClient.prefs.v86PlaylistAutoRefresh
    BiliClient.prefs.v86PlaylistAutoRefresh = enabled
    AppToast.show(this, "Playlist Auto Refresh: ${if (enabled) "ON" else "OFF"}")
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
}

// v86.8: Progress Bar Live Edge
internal fun PlayerActivity.showV86ProgressBarLiveEdgeToggle() {
    val enabled = !BiliClient.prefs.v86ProgressBarLiveEdge
    BiliClient.prefs.v86ProgressBarLiveEdge = enabled
    AppToast.show(this, "Progress Bar Live Edge: ${if (enabled) "ON" else "OFF"}")
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
}

// v86.11: Playback Auto Quality Switch
internal fun PlayerActivity.showV86PlaybackAutoQualitySwitchToggle() {
    val enabled = !BiliClient.prefs.v86PlaybackAutoQualitySwitch
    BiliClient.prefs.v86PlaybackAutoQualitySwitch = enabled
    AppToast.show(this, "Playback Auto Quality Switch: ${if (enabled) "ON" else "OFF"}")
}

// v86.12: Screenshot Auto Upload
internal fun PlayerActivity.showV86ScreenshotAutoUploadToggle() {
    val enabled = !BiliClient.prefs.v86ScreenshotAutoUpload
    BiliClient.prefs.v86ScreenshotAutoUpload = enabled
    AppToast.show(this, "Screenshot Auto Upload: ${if (enabled) "ON" else "OFF"}")
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
}

// v87.6: Playlist Auto Download
internal fun PlayerActivity.showV87PlaylistAutoDownloadToggle() {
    val enabled = !BiliClient.prefs.v87PlaylistAutoDownload
    BiliClient.prefs.v87PlaylistAutoDownload = enabled
    AppToast.show(this, "Playlist Auto Download: ${if (enabled) "ON" else "OFF"}")
}

// v87.7: Cache Cleanup Schedule
internal fun PlayerActivity.showV87CacheCleanupScheduleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87CacheCleanupSchedule).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Schedule",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87CacheCleanupSchedule = value
        AppToast.show(this, "Cache Cleanup Schedule: $value")
    }
}

// v87.8: Progress Bar Snap To Chapter
internal fun PlayerActivity.showV87ProgressBarSnapToChapterToggle() {
    val enabled = !BiliClient.prefs.v87ProgressBarSnapToChapter
    BiliClient.prefs.v87ProgressBarSnapToChapter = enabled
    AppToast.show(this, "Progress Bar Snap To Chapter: ${if (enabled) "ON" else "OFF"}")
}

// v87.9: Volume Limit Max
internal fun PlayerActivity.showV87VolumeLimitMaxDialog() {
    val options = listOf(50, 60, 70, 80, 90, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v87VolumeLimitMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Limit Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87VolumeLimitMax = value
        AppToast.show(this, "Volume Limit Max: $value")
    }
}

// v87.10: History Auto Delete Expired
internal fun PlayerActivity.showV87HistoryAutoDeleteExpiredToggle() {
    val enabled = !BiliClient.prefs.v87HistoryAutoDeleteExpired
    BiliClient.prefs.v87HistoryAutoDeleteExpired = enabled
    AppToast.show(this, "History Auto Delete Expired: ${if (enabled) "ON" else "OFF"}")
}

// v87.11: Playback Auto Skip Filler
internal fun PlayerActivity.showV87PlaybackAutoSkipFillerToggle() {
    val enabled = !BiliClient.prefs.v87PlaybackAutoSkipFiller
    BiliClient.prefs.v87PlaybackAutoSkipFiller = enabled
    AppToast.show(this, "Playback Auto Skip Filler: ${if (enabled) "ON" else "OFF"}")
}

// v87.12: Screenshot Cloud Sync
internal fun PlayerActivity.showV87ScreenshotCloudSyncToggle() {
    val enabled = !BiliClient.prefs.v87ScreenshotCloudSync
    BiliClient.prefs.v87ScreenshotCloudSync = enabled
    AppToast.show(this, "Screenshot Cloud Sync: ${if (enabled) "ON" else "OFF"}")
}

// v87.13: Video Gamma Curve Custom
internal fun PlayerActivity.showV87VideoGammaCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87VideoGammaCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Gamma Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87VideoGammaCurveCustom = value
        AppToast.show(this, "Video Gamma Curve Custom: $value")
    }
}

// v87.14: Danmaku Max On Screen
internal fun PlayerActivity.showV87DanmakuMaxOnScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87DanmakuMaxOnScreen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Max On Screen",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87DanmakuMaxOnScreen = value
        AppToast.show(this, "Danmaku Max On Screen: $value")
    }
}

// v87.15: Subtitle Shadow Offset Y
internal fun PlayerActivity.showV87SubtitleShadowOffsetYDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v87SubtitleShadowOffsetY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87SubtitleShadowOffsetY = value
        AppToast.show(this, "Subtitle Shadow Offset Y: $value")
    }
}

// v88.1: Video White Balance Custom
internal fun PlayerActivity.showV88VideoWhiteBalanceCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v88VideoWhiteBalanceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video White Balance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88VideoWhiteBalanceCustom = value
        AppToast.show(this, "Video White Balance Custom: $value")
    }
}

// v88.2: Danmaku Send Animation
internal fun PlayerActivity.showV88DanmakuSendAnimationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88DanmakuSendAnimation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Animation",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88DanmakuSendAnimation = value
        AppToast.show(this, "Danmaku Send Animation: $value")
    }
}

// v88.3: Subtitle Outline Color
internal fun PlayerActivity.showV88SubtitleOutlineColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88SubtitleOutlineColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88SubtitleOutlineColor = value
        AppToast.show(this, "Subtitle Outline Color: $value")
    }
}

// v88.4: Gesture Tap Action
internal fun PlayerActivity.showV88GestureTapActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88GestureTapAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88GestureTapAction = value
        AppToast.show(this, "Gesture Tap Action: $value")
    }
}

// v88.5: Cast Video Resolution
internal fun PlayerActivity.showV88CastVideoResolutionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88CastVideoResolution).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Resolution",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88CastVideoResolution = value
        AppToast.show(this, "Cast Video Resolution: $value")
    }
}

// v88.6: Playlist Auto Mark Watched
internal fun PlayerActivity.showV88PlaylistAutoMarkWatchedToggle() {
    val enabled = !BiliClient.prefs.v88PlaylistAutoMarkWatched
    BiliClient.prefs.v88PlaylistAutoMarkWatched = enabled
    AppToast.show(this, "Playlist Auto Mark Watched: ${if (enabled) "ON" else "OFF"}")
}

// v88.7: Cache Preload Next Episode
internal fun PlayerActivity.showV88CachePreloadNextEpisodeToggle() {
    val enabled = !BiliClient.prefs.v88CachePreloadNextEpisode
    BiliClient.prefs.v88CachePreloadNextEpisode = enabled
    AppToast.show(this, "Cache Preload Next Episode: ${if (enabled) "ON" else "OFF"}")
}

// v88.8: Progress Bar Custom Label
internal fun PlayerActivity.showV88ProgressBarCustomLabelToggle() {
    val enabled = !BiliClient.prefs.v88ProgressBarCustomLabel
    BiliClient.prefs.v88ProgressBarCustomLabel = enabled
    AppToast.show(this, "Progress Bar Custom Label: ${if (enabled) "ON" else "OFF"}")
}

// v88.9: Volume Auto Mute On Call
internal fun PlayerActivity.showV88VolumeAutoMuteOnCallToggle() {
    val enabled = !BiliClient.prefs.v88VolumeAutoMuteOnCall
    BiliClient.prefs.v88VolumeAutoMuteOnCall = enabled
    AppToast.show(this, "Volume Auto Mute On Call: ${if (enabled) "ON" else "OFF"}")
}

// v88.10: History Show Thumbnails
internal fun PlayerActivity.showV88HistoryShowThumbnailsToggle() {
    val enabled = !BiliClient.prefs.v88HistoryShowThumbnails
    BiliClient.prefs.v88HistoryShowThumbnails = enabled
    AppToast.show(this, "History Show Thumbnails: ${if (enabled) "ON" else "OFF"}")
}

// v88.11: Playback Auto Resume Position
internal fun PlayerActivity.showV88PlaybackAutoResumePositionToggle() {
    val enabled = !BiliClient.prefs.v88PlaybackAutoResumePosition
    BiliClient.prefs.v88PlaybackAutoResumePosition = enabled
    AppToast.show(this, "Playback Auto Resume Position: ${if (enabled) "ON" else "OFF"}")
}

// v88.12: Screenshot Format Custom
internal fun PlayerActivity.showV88ScreenshotFormatCustomDialog() {
    val options = listOf(0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v88ScreenshotFormatCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88ScreenshotFormatCustom = value
        AppToast.show(this, "Screenshot Format Custom: $value")
    }
}

// v88.13: Video Tint Custom
internal fun PlayerActivity.showV88VideoTintCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v88VideoTintCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Tint Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88VideoTintCustom = value
        AppToast.show(this, "Video Tint Custom: $value")
    }
}

// v88.14: Danmaku Scroll Speed Curve
internal fun PlayerActivity.showV88DanmakuScrollSpeedCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88DanmakuScrollSpeedCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88DanmakuScrollSpeedCurve = value
        AppToast.show(this, "Danmaku Scroll Speed Curve: $value")
    }
}

// v88.15: Subtitle Shadow Blur
internal fun PlayerActivity.showV88SubtitleShadowBlurDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v88SubtitleShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88SubtitleShadowBlur = value
        AppToast.show(this, "Subtitle Shadow Blur: $value")
    }
}

// v89.1: Video Black Level Custom
internal fun PlayerActivity.showV89VideoBlackLevelCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v89VideoBlackLevelCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Black Level Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89VideoBlackLevelCustom = value
        AppToast.show(this, "Video Black Level Custom: $value")
    }
}

// v89.2: Danmaku Font Kerning Custom
internal fun PlayerActivity.showV89DanmakuFontKerningCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v89DanmakuFontKerningCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Kerning Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89DanmakuFontKerningCustom = value
        AppToast.show(this, "Danmaku Font Kerning Custom: $value")
    }
}

// v89.3: Subtitle Animation Loop Count
internal fun PlayerActivity.showV89SubtitleAnimationLoopCountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89SubtitleAnimationLoopCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Loop Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89SubtitleAnimationLoopCount = value
        AppToast.show(this, "Subtitle Animation Loop Count: $value")
    }
}

// v89.4: Gesture Pinch Action
internal fun PlayerActivity.showV89GesturePinchActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89GesturePinchAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89GesturePinchAction = value
        AppToast.show(this, "Gesture Pinch Action: $value")
    }
}

// v89.5: Cast Audio Bitrate
internal fun PlayerActivity.showV89CastAudioBitrateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89CastAudioBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Bitrate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89CastAudioBitrate = value
        AppToast.show(this, "Cast Audio Bitrate: $value")
    }
}

// v89.6: Playlist Auto Group By Series
internal fun PlayerActivity.showV89PlaylistAutoGroupBySeriesToggle() {
    val enabled = !BiliClient.prefs.v89PlaylistAutoGroupBySeries
    BiliClient.prefs.v89PlaylistAutoGroupBySeries = enabled
    AppToast.show(this, "Playlist Auto Group By Series: ${if (enabled) "ON" else "OFF"}")
}

// v89.7: Cache Verify On Start
internal fun PlayerActivity.showV89CacheVerifyOnStartToggle() {
    val enabled = !BiliClient.prefs.v89CacheVerifyOnStart
    BiliClient.prefs.v89CacheVerifyOnStart = enabled
    AppToast.show(this, "Cache Verify On Start: ${if (enabled) "ON" else "OFF"}")
}

// v89.8: Progress Bar Midpoint Indicator
internal fun PlayerActivity.showV89ProgressBarMidpointIndicatorToggle() {
    val enabled = !BiliClient.prefs.v89ProgressBarMidpointIndicator
    BiliClient.prefs.v89ProgressBarMidpointIndicator = enabled
    AppToast.show(this, "Progress Bar Midpoint Indicator: ${if (enabled) "ON" else "OFF"}")
}

// v89.9: Volume Auto Lower On Notification
internal fun PlayerActivity.showV89VolumeAutoLowerOnNotificationToggle() {
    val enabled = !BiliClient.prefs.v89VolumeAutoLowerOnNotification
    BiliClient.prefs.v89VolumeAutoLowerOnNotification = enabled
    AppToast.show(this, "Volume Auto Lower On Notification: ${if (enabled) "ON" else "OFF"}")
}

// v89.10: History Sort Order
internal fun PlayerActivity.showV89HistorySortOrderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89HistorySortOrder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Sort Order",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89HistorySortOrder = value
        AppToast.show(this, "History Sort Order: $value")
    }
}

// v89.11: Playback Auto Skip Preview
internal fun PlayerActivity.showV89PlaybackAutoSkipPreviewToggle() {
    val enabled = !BiliClient.prefs.v89PlaybackAutoSkipPreview
    BiliClient.prefs.v89PlaybackAutoSkipPreview = enabled
    AppToast.show(this, "Playback Auto Skip Preview: ${if (enabled) "ON" else "OFF"}")
}

// v89.12: Screenshot Quality Custom
internal fun PlayerActivity.showV89ScreenshotQualityCustomDialog() {
    val options = listOf(50, 60, 70, 80, 90, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v89ScreenshotQualityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Quality Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89ScreenshotQualityCustom = value
        AppToast.show(this, "Screenshot Quality Custom: $value")
    }
}

// v89.13: Video White Point Custom
internal fun PlayerActivity.showV89VideoWhitePointCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v89VideoWhitePointCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video White Point Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89VideoWhitePointCustom = value
        AppToast.show(this, "Video White Point Custom: $value")
    }
}

