package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.feature.player.danmaku.DanmakuFontWeight


// v89.14: Danmaku Scroll Speed Min
internal fun PlayerActivity.showV89DanmakuScrollSpeedMinDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v89DanmakuScrollSpeedMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89DanmakuScrollSpeedMin = value
        AppToast.show(this, "Danmaku Scroll Speed Min: $value")
    }
}

// v89.15: Subtitle Position Y Custom
internal fun PlayerActivity.showV89SubtitlePositionYCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89SubtitlePositionYCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position Y Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89SubtitlePositionYCustom = value
        AppToast.show(this, "Subtitle Position Y Custom: $value")
    }
}

// v90.1: Video Midtone Custom
internal fun PlayerActivity.showV90VideoMidtoneCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v90VideoMidtoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Midtone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90VideoMidtoneCustom = value
        AppToast.show(this, "Video Midtone Custom: $value")
    }
}

// v90.2: Danmaku Scroll Speed Max
internal fun PlayerActivity.showV90DanmakuScrollSpeedMaxDialog() {
    val options = listOf(100, 125, 150, 175, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v90DanmakuScrollSpeedMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90DanmakuScrollSpeedMax = value
        AppToast.show(this, "Danmaku Scroll Speed Max: $value")
    }
}

// v90.3: Subtitle Position X Custom
internal fun PlayerActivity.showV90SubtitlePositionXCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v90SubtitlePositionXCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position X Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90SubtitlePositionXCustom = value
        AppToast.show(this, "Subtitle Position X Custom: $value")
    }
}

// v90.4: Gesture Rotation Action
internal fun PlayerActivity.showV90GestureRotationActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v90GestureRotationAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Rotation Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90GestureRotationAction = value
        AppToast.show(this, "Gesture Rotation Action: $value")
    }
}

// v90.5: Cast Video Codec Custom
internal fun PlayerActivity.showV90CastVideoCodecCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v90CastVideoCodecCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Codec Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90CastVideoCodecCustom = value
        AppToast.show(this, "Cast Video Codec Custom: $value")
    }
}

// v90.6: Playlist Auto Skip Watched
internal fun PlayerActivity.showV90PlaylistAutoSkipWatchedToggle() {
    val enabled = !BiliClient.prefs.v90PlaylistAutoSkipWatched
    BiliClient.prefs.v90PlaylistAutoSkipWatched = enabled
    AppToast.show(this, "Playlist Auto Skip Watched: ${if (enabled) "ON" else "OFF"}")
}

// v90.7: Cache Background Cleanup
internal fun PlayerActivity.showV90CacheBackgroundCleanupToggle() {
    val enabled = !BiliClient.prefs.v90CacheBackgroundCleanup
    BiliClient.prefs.v90CacheBackgroundCleanup = enabled
    AppToast.show(this, "Cache Background Cleanup: ${if (enabled) "ON" else "OFF"}")
}

// v90.8: Progress Bar Estimated Time
internal fun PlayerActivity.showV90ProgressBarEstimatedTimeToggle() {
    val enabled = !BiliClient.prefs.v90ProgressBarEstimatedTime
    BiliClient.prefs.v90ProgressBarEstimatedTime = enabled
    AppToast.show(this, "Progress Bar Estimated Time: ${if (enabled) "ON" else "OFF"}")
}

// v90.9: Volume Spatial Width
internal fun PlayerActivity.showV90VolumeSpatialWidthDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v90VolumeSpatialWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Spatial Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90VolumeSpatialWidth = value
        AppToast.show(this, "Volume Spatial Width: $value")
    }
}

// v90.10: History Auto Sync Cloud
internal fun PlayerActivity.showV90HistoryAutoSyncCloudToggle() {
    val enabled = !BiliClient.prefs.v90HistoryAutoSyncCloud
    BiliClient.prefs.v90HistoryAutoSyncCloud = enabled
    AppToast.show(this, "History Auto Sync Cloud: ${if (enabled) "ON" else "OFF"}")
}

// v90.11: Playback Auto Next On Buffer
internal fun PlayerActivity.showV90PlaybackAutoNextOnBufferToggle() {
    val enabled = !BiliClient.prefs.v90PlaybackAutoNextOnBuffer
    BiliClient.prefs.v90PlaybackAutoNextOnBuffer = enabled
    AppToast.show(this, "Playback Auto Next On Buffer: ${if (enabled) "ON" else "OFF"}")
}

// v90.12: Screenshot Auto Delete Old
internal fun PlayerActivity.showV90ScreenshotAutoDeleteOldToggle() {
    val enabled = !BiliClient.prefs.v90ScreenshotAutoDeleteOld
    BiliClient.prefs.v90ScreenshotAutoDeleteOld = enabled
    AppToast.show(this, "Screenshot Auto Delete Old: ${if (enabled) "ON" else "OFF"}")
}

// v90.13: Video Highlight Custom
internal fun PlayerActivity.showV90VideoHighlightCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v90VideoHighlightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Highlight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90VideoHighlightCustom = value
        AppToast.show(this, "Video Highlight Custom: $value")
    }
}

// v90.14: Danmaku Send Max Length
internal fun PlayerActivity.showV90DanmakuSendMaxLengthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v90DanmakuSendMaxLength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90DanmakuSendMaxLength = value
        AppToast.show(this, "Danmaku Send Max Length: $value")
    }
}

// v90.15: Subtitle Animation Delay Custom
internal fun PlayerActivity.showV90SubtitleAnimationDelayCustomDialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v90SubtitleAnimationDelayCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90SubtitleAnimationDelayCustom = value
        AppToast.show(this, "Subtitle Animation Delay Custom: $value")
    }
}

// v91.1: Video Dithering Mode
internal fun PlayerActivity.showV91VideoDitheringModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v91videoDitheringMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Dithering Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91videoDitheringMode = value
        AppToast.show(this, "Video Dithering Mode: $value")
    }
}

// v91.2: Danmaku Font Shadow Toggle
internal fun PlayerActivity.showV91DanmakuFontShadowToggleToggle() {
    val enabled = !BiliClient.prefs.v91danmakuFontShadowToggle
    BiliClient.prefs.v91danmakuFontShadowToggle = enabled
    AppToast.show(this, "Danmaku Font Shadow Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v91.3: Subtitle Fade In Out Custom
internal fun PlayerActivity.showV91SubtitleFadeInOutCustomDialog() {
    val options = listOf(0, 200, 400, 600, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v91subtitleFadeInOutCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Fade In Out Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91subtitleFadeInOutCustom = value
        AppToast.show(this, "Subtitle Fade In Out Custom: $value")
    }
}

// v91.4: Gesture Edge Dead Zone
internal fun PlayerActivity.showV91GestureEdgeDeadZoneDialog() {
    val options = listOf(5, 10, 15, 20, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v91gestureEdgeDeadZone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Dead Zone",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91gestureEdgeDeadZone = value
        AppToast.show(this, "Gesture Edge Dead Zone: $value")
    }
}

// v91.5: Cast Video Latency Mode
internal fun PlayerActivity.showV91CastVideoLatencyModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v91castVideoLatencyMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Latency Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91castVideoLatencyMode = value
        AppToast.show(this, "Cast Video Latency Mode: $value")
    }
}

// v91.6: Playlist Auto Resume Last
internal fun PlayerActivity.showV91PlaylistAutoResumeLastToggle() {
    val enabled = !BiliClient.prefs.v91playlistAutoResumeLast
    BiliClient.prefs.v91playlistAutoResumeLast = enabled
    AppToast.show(this, "Playlist Auto Resume Last: ${if (enabled) "ON" else "OFF"}")
}

// v91.7: Cache Segment Size
internal fun PlayerActivity.showV91CacheSegmentSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v91cacheSegmentSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Segment Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91cacheSegmentSize = value
        AppToast.show(this, "Cache Segment Size: $value")
    }
}

// v91.8: Progress Bar Chapter Label
internal fun PlayerActivity.showV91ProgressBarChapterLabelToggle() {
    val enabled = !BiliClient.prefs.v91progressBarChapterLabel
    BiliClient.prefs.v91progressBarChapterLabel = enabled
    AppToast.show(this, "Progress Bar Chapter Label: ${if (enabled) "ON" else "OFF"}")
}

// v91.9: Volume Auto Ducking
internal fun PlayerActivity.showV91VolumeAutoDuckingToggle() {
    val enabled = !BiliClient.prefs.v91volumeAutoDucking
    BiliClient.prefs.v91volumeAutoDucking = enabled
    AppToast.show(this, "Volume Auto Ducking: ${if (enabled) "ON" else "OFF"}")
}

// v91.10: History Group By Series
internal fun PlayerActivity.showV91HistoryGroupBySeriesToggle() {
    val enabled = !BiliClient.prefs.v91historyGroupBySeries
    BiliClient.prefs.v91historyGroupBySeries = enabled
    AppToast.show(this, "History Group By Series: ${if (enabled) "ON" else "OFF"}")
}

// v91.11: Playback Auto Skip Next Countdown
internal fun PlayerActivity.showV91PlaybackAutoSkipNextCountdownDialog() {
    val options = listOf(3, 5, 10, 15, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v91playbackAutoSkipNextCountdown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Skip Next Countdown",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91playbackAutoSkipNextCountdown = value
        AppToast.show(this, "Playback Auto Skip Next Countdown: $value")
    }
}

// v91.12: Screenshot Region Capture
internal fun PlayerActivity.showV91ScreenshotRegionCaptureToggle() {
    val enabled = !BiliClient.prefs.v91screenshotRegionCapture
    BiliClient.prefs.v91screenshotRegionCapture = enabled
    AppToast.show(this, "Screenshot Region Capture: ${if (enabled) "ON" else "OFF"}")
}

// v91.13: Video Film Grain Custom
internal fun PlayerActivity.showV91VideoFilmGrainCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v91videoFilmGrainCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Film Grain Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91videoFilmGrainCustom = value
        AppToast.show(this, "Video Film Grain Custom: $value")
    }
}

// v91.14: Danmaku BG Corner Radius
internal fun PlayerActivity.showV91DanmakuBgCornerRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v91danmakuBgCornerRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Corner Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91danmakuBgCornerRadius = value
        AppToast.show(this, "Danmaku BG Corner Radius: $value")
    }
}

// v91.15: Subtitle BG Margin Bottom
internal fun PlayerActivity.showV91SubtitleBgMarginBottomDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v91subtitleBgMarginBottom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Margin Bottom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91subtitleBgMarginBottom = value
        AppToast.show(this, "Subtitle BG Margin Bottom: $value")
    }
}

// v92.16: Video Vignette Custom
internal fun PlayerActivity.showV92VideoVignetteCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v92videoVignetteCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Vignette Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92videoVignetteCustom = value
        AppToast.show(this, "Video Vignette Custom: $value")
    }
}

// v92.17: Danmaku Font Underline Toggle
internal fun PlayerActivity.showV92DanmakuFontUnderlineToggleToggle() {
    val enabled = !BiliClient.prefs.v92danmakuFontUnderlineToggle
    BiliClient.prefs.v92danmakuFontUnderlineToggle = enabled
    AppToast.show(this, "Danmaku Font Underline Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v92.18: Subtitle BG Padding Custom
internal fun PlayerActivity.showV92SubtitleBgPaddingCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v92subtitleBgPaddingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Padding Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92subtitleBgPaddingCustom = value
        AppToast.show(this, "Subtitle BG Padding Custom: $value")
    }
}

// v92.19: Gesture Swipe Back Action
internal fun PlayerActivity.showV92GestureSwipeBackActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v92gestureSwipeBackAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Back Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92gestureSwipeBackAction = value
        AppToast.show(this, "Gesture Swipe Back Action: $value")
    }
}

// v92.20: Cast Video Drop Frame
internal fun PlayerActivity.showV92CastVideoDropFrameToggle() {
    val enabled = !BiliClient.prefs.v92castVideoDropFrame
    BiliClient.prefs.v92castVideoDropFrame = enabled
    AppToast.show(this, "Cast Video Drop Frame: ${if (enabled) "ON" else "OFF"}")
}

// v92.21: Playlist Auto Skip Short
internal fun PlayerActivity.showV92PlaylistAutoSkipShortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v92playlistAutoSkipShort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Skip Short",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92playlistAutoSkipShort = value
        AppToast.show(this, "Playlist Auto Skip Short: $value")
    }
}

// v92.22: Cache Download Policy
internal fun PlayerActivity.showV92CacheDownloadPolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v92cacheDownloadPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92cacheDownloadPolicy = value
        AppToast.show(this, "Cache Download Policy: $value")
    }
}

// v92.23: Progress Bar Thumb Shape
internal fun PlayerActivity.showV92ProgressBarThumbShapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v92progressBarThumbShape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Shape",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92progressBarThumbShape = value
        AppToast.show(this, "Progress Bar Thumb Shape: $value")
    }
}

// v92.24: Volume Auto Balance
internal fun PlayerActivity.showV92VolumeAutoBalanceToggle() {
    val enabled = !BiliClient.prefs.v92volumeAutoBalance
    BiliClient.prefs.v92volumeAutoBalance = enabled
    AppToast.show(this, "Volume Auto Balance: ${if (enabled) "ON" else "OFF"}")
}

// v92.25: History Auto Clean Expired
internal fun PlayerActivity.showV92HistoryAutoCleanExpiredToggle() {
    val enabled = !BiliClient.prefs.v92historyAutoCleanExpired
    BiliClient.prefs.v92historyAutoCleanExpired = enabled
    AppToast.show(this, "History Auto Clean Expired: ${if (enabled) "ON" else "OFF"}")
}

// v92.26: Playback Auto Skip Same Title
internal fun PlayerActivity.showV92PlaybackAutoSkipSameTitleToggle() {
    val enabled = !BiliClient.prefs.v92playbackAutoSkipSameTitle
    BiliClient.prefs.v92playbackAutoSkipSameTitle = enabled
    AppToast.show(this, "Playback Auto Skip Same Title: ${if (enabled) "ON" else "OFF"}")
}

// v92.27: Screenshot Auto Delete Days
internal fun PlayerActivity.showV92ScreenshotAutoDeleteDaysDialog() {
    val options = listOf(7, 14, 30, 60, 90)
    val currentIndex = options.indexOf(BiliClient.prefs.v92screenshotAutoDeleteDays).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Delete Days",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92screenshotAutoDeleteDays = value
        AppToast.show(this, "Screenshot Auto Delete Days: $value")
    }
}

// v92.28: Video Color Fringe Custom
internal fun PlayerActivity.showV92VideoColorFringeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v92videoColorFringeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Fringe Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92videoColorFringeCustom = value
        AppToast.show(this, "Video Color Fringe Custom: $value")
    }
}

// v92.29: Danmaku BG Opacity Custom
internal fun PlayerActivity.showV92DanmakuBgOpacityCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v92danmakuBgOpacityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Opacity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92danmakuBgOpacityCustom = value
        AppToast.show(this, "Danmaku BG Opacity Custom: $value")
    }
}

// v92.30: Subtitle BG Margin Top
internal fun PlayerActivity.showV92SubtitleBgMarginTopDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v92subtitleBgMarginTop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Margin Top",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92subtitleBgMarginTop = value
        AppToast.show(this, "Subtitle BG Margin Top: $value")
    }
}

// v93.31: Video Scanline Effect
internal fun PlayerActivity.showV93VideoScanlineEffectToggle() {
    val enabled = !BiliClient.prefs.v93videoScanlineEffect
    BiliClient.prefs.v93videoScanlineEffect = enabled
    AppToast.show(this, "Video Scanline Effect: ${if (enabled) "ON" else "OFF"}")
}

// v93.32: Danmaku Send Max Length Custom
internal fun PlayerActivity.showV93DanmakuSendMaxLengthCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93danmakuSendMaxLengthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93danmakuSendMaxLengthCustom = value
        AppToast.show(this, "Danmaku Send Max Length Custom: $value")
    }
}

// v93.33: Subtitle BG Border Color Custom
internal fun PlayerActivity.showV93SubtitleBgBorderColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93subtitleBgBorderColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93subtitleBgBorderColorCustom = value
        AppToast.show(this, "Subtitle BG Border Color Custom: $value")
    }
}

// v93.34: Gesture Swipe Forward Action
internal fun PlayerActivity.showV93GestureSwipeForwardActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93gestureSwipeForwardAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Forward Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93gestureSwipeForwardAction = value
        AppToast.show(this, "Gesture Swipe Forward Action: $value")
    }
}

// v93.35: Cast Audio Dynamic Range
internal fun PlayerActivity.showV93CastAudioDynamicRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93castAudioDynamicRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Dynamic Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93castAudioDynamicRange = value
        AppToast.show(this, "Cast Audio Dynamic Range: $value")
    }
}

// v93.36: Playlist Auto Skip Long
internal fun PlayerActivity.showV93PlaylistAutoSkipLongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93playlistAutoSkipLong).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Skip Long",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93playlistAutoSkipLong = value
        AppToast.show(this, "Playlist Auto Skip Long: $value")
    }
}

// v93.37: Cache Network Policy
internal fun PlayerActivity.showV93CacheNetworkPolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93cacheNetworkPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Network Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93cacheNetworkPolicy = value
        AppToast.show(this, "Cache Network Policy: $value")
    }
}

// v93.38: Progress Bar Buffer Color Custom
internal fun PlayerActivity.showV93ProgressBarBufferColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93progressBarBufferColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffer Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93progressBarBufferColorCustom = value
        AppToast.show(this, "Progress Bar Buffer Color Custom: $value")
    }
}

// v93.39: Volume Auto Gain Control
internal fun PlayerActivity.showV93VolumeAutoGainControlToggle() {
    val enabled = !BiliClient.prefs.v93volumeAutoGainControl
    BiliClient.prefs.v93volumeAutoGainControl = enabled
    AppToast.show(this, "Volume Auto Gain Control: ${if (enabled) "ON" else "OFF"}")
}

// v93.40: History Auto Sync Device
internal fun PlayerActivity.showV93HistoryAutoSyncDeviceToggle() {
    val enabled = !BiliClient.prefs.v93historyAutoSyncDevice
    BiliClient.prefs.v93historyAutoSyncDevice = enabled
    AppToast.show(this, "History Auto Sync Device: ${if (enabled) "ON" else "OFF"}")
}

// v93.41: Playback Auto Skip Recap93
internal fun PlayerActivity.showV93PlaybackAutoSkipRecap93Toggle() {
    val enabled = !BiliClient.prefs.v93playbackAutoSkipRecap93
    BiliClient.prefs.v93playbackAutoSkipRecap93 = enabled
    AppToast.show(this, "Playback Auto Skip Recap93: ${if (enabled) "ON" else "OFF"}")
}

// v93.42: Screenshot Naming Template
internal fun PlayerActivity.showV93ScreenshotNamingTemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93screenshotNamingTemplate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Naming Template",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93screenshotNamingTemplate = value
        AppToast.show(this, "Screenshot Naming Template: $value")
    }
}

// v93.43: Video CRT Filter Custom
internal fun PlayerActivity.showV93VideoCRTFilterCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v93videoCRTFilterCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video CRT Filter Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93videoCRTFilterCustom = value
        AppToast.show(this, "Video CRT Filter Custom: $value")
    }
}

// v93.44: Danmaku Send Confirm Toggle
internal fun PlayerActivity.showV93DanmakuSendConfirmToggleToggle() {
    val enabled = !BiliClient.prefs.v93danmakuSendConfirmToggle
    BiliClient.prefs.v93danmakuSendConfirmToggle = enabled
    AppToast.show(this, "Danmaku Send Confirm Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v93.45: Subtitle BG Border Width Custom
internal fun PlayerActivity.showV93SubtitleBgBorderWidthCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93subtitleBgBorderWidthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Width Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93subtitleBgBorderWidthCustom = value
        AppToast.show(this, "Subtitle BG Border Width Custom: $value")
    }
}

// v94.46: Video Pixel Art Mode
internal fun PlayerActivity.showV94VideoPixelArtModeToggle() {
    val enabled = !BiliClient.prefs.v94videoPixelArtMode
    BiliClient.prefs.v94videoPixelArtMode = enabled
    AppToast.show(this, "Video Pixel Art Mode: ${if (enabled) "ON" else "OFF"}")
}

// v94.47: Danmaku Font Monospace Toggle
internal fun PlayerActivity.showV94DanmakuFontMonospaceToggleToggle() {
    val enabled = !BiliClient.prefs.v94danmakuFontMonospaceToggle
    BiliClient.prefs.v94danmakuFontMonospaceToggle = enabled
    AppToast.show(this, "Danmaku Font Monospace Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v94.48: Subtitle BG Border Radius Custom
internal fun PlayerActivity.showV94SubtitleBgBorderRadiusCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v94subtitleBgBorderRadiusCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Radius Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94subtitleBgBorderRadiusCustom = value
        AppToast.show(this, "Subtitle BG Border Radius Custom: $value")
    }
}

// v94.49: Gesture Long Press Timeout
internal fun PlayerActivity.showV94GestureLongPressTimeoutDialog() {
    val options = listOf(300, 400, 500, 700, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v94gestureLongPressTimeout).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Timeout",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94gestureLongPressTimeout = value
        AppToast.show(this, "Gesture Long Press Timeout: $value")
    }
}

// v94.50: Cast Video Buffer Size
internal fun PlayerActivity.showV94CastVideoBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v94castVideoBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94castVideoBufferSize = value
        AppToast.show(this, "Cast Video Buffer Size: $value")
    }
}

// v94.51: Playlist Auto Group By Up
internal fun PlayerActivity.showV94PlaylistAutoGroupByUpToggle() {
    val enabled = !BiliClient.prefs.v94playlistAutoGroupByUp
    BiliClient.prefs.v94playlistAutoGroupByUp = enabled
    AppToast.show(this, "Playlist Auto Group By Up: ${if (enabled) "ON" else "OFF"}")
}

// v94.52: Cache Smart Cleanup
internal fun PlayerActivity.showV94CacheSmartCleanupToggle() {
    val enabled = !BiliClient.prefs.v94cacheSmartCleanup
    BiliClient.prefs.v94cacheSmartCleanup = enabled
    AppToast.show(this, "Cache Smart Cleanup: ${if (enabled) "ON" else "OFF"}")
}

// v94.53: Progress Bar Live Indicator
internal fun PlayerActivity.showV94ProgressBarLiveIndicatorToggle() {
    val enabled = !BiliClient.prefs.v94progressBarLiveIndicator
    BiliClient.prefs.v94progressBarLiveIndicator = enabled
    AppToast.show(this, "Progress Bar Live Indicator: ${if (enabled) "ON" else "OFF"}")
}

// v94.54: Volume Auto Pan
internal fun PlayerActivity.showV94VolumeAutoPanToggle() {
    val enabled = !BiliClient.prefs.v94volumeAutoPan
    BiliClient.prefs.v94volumeAutoPan = enabled
    AppToast.show(this, "Volume Auto Pan: ${if (enabled) "ON" else "OFF"}")
}

// v94.55: History Export Auto
internal fun PlayerActivity.showV94HistoryExportAutoToggle() {
    val enabled = !BiliClient.prefs.v94historyExportAuto
    BiliClient.prefs.v94historyExportAuto = enabled
    AppToast.show(this, "History Export Auto: ${if (enabled) "ON" else "OFF"}")
}

// v94.56: Playback Auto Skip Title
internal fun PlayerActivity.showV94PlaybackAutoSkipTitleToggle() {
    val enabled = !BiliClient.prefs.v94playbackAutoSkipTitle
    BiliClient.prefs.v94playbackAutoSkipTitle = enabled
    AppToast.show(this, "Playback Auto Skip Title: ${if (enabled) "ON" else "OFF"}")
}

// v94.57: Screenshot Auto Copy Path
internal fun PlayerActivity.showV94ScreenshotAutoCopyPathToggle() {
    val enabled = !BiliClient.prefs.v94screenshotAutoCopyPath
    BiliClient.prefs.v94screenshotAutoCopyPath = enabled
    AppToast.show(this, "Screenshot Auto Copy Path: ${if (enabled) "ON" else "OFF"}")
}

// v94.58: Video Ascii Art Mode
internal fun PlayerActivity.showV94VideoAsciiArtModeToggle() {
    val enabled = !BiliClient.prefs.v94videoAsciiArtMode
    BiliClient.prefs.v94videoAsciiArtMode = enabled
    AppToast.show(this, "Video Ascii Art Mode: ${if (enabled) "ON" else "OFF"}")
}

// v94.59: Danmaku Font Size Step
internal fun PlayerActivity.showV94DanmakuFontSizeStepDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v94danmakuFontSizeStep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Step",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94danmakuFontSizeStep = value
        AppToast.show(this, "Danmaku Font Size Step: $value")
    }
}

// v94.60: Subtitle Animation Fade Time
internal fun PlayerActivity.showV94SubtitleAnimationFadeTimeDialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v94subtitleAnimationFadeTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94subtitleAnimationFadeTime = value
        AppToast.show(this, "Subtitle Animation Fade Time: $value")
    }
}

// v95.61: Video Glitch Effect Custom
internal fun PlayerActivity.showV95VideoGlitchEffectCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v95videoGlitchEffectCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Glitch Effect Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95videoGlitchEffectCustom = value
        AppToast.show(this, "Video Glitch Effect Custom: $value")
    }
}

// v95.62: Danmaku Scroll Easing
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

// v95.63: Subtitle BG Gradient Angle
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

// v95.64: Gesture Double Tap Timeout
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

// v95.65: Cast Audio Buffer Size
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

// v95.66: Playlist Auto Group By Date
internal fun PlayerActivity.showV95PlaylistAutoGroupByDateToggle() {
    val enabled = !BiliClient.prefs.v95playlistAutoGroupByDate
    BiliClient.prefs.v95playlistAutoGroupByDate = enabled
    AppToast.show(this, "Playlist Auto Group By Date: ${if (enabled) "ON" else "OFF"}")
}

// v95.67: Cache Storage Limit
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

// v95.68: Progress Bar Chapter Color
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

// v95.69: Volume Auto Crossfade
internal fun PlayerActivity.showV95VolumeAutoCrossfadeToggle() {
    val enabled = !BiliClient.prefs.v95volumeAutoCrossfade
    BiliClient.prefs.v95volumeAutoCrossfade = enabled
    AppToast.show(this, "Volume Auto Crossfade: ${if (enabled) "ON" else "OFF"}")
}

// v95.70: History Import Auto
internal fun PlayerActivity.showV95HistoryImportAutoToggle() {
    val enabled = !BiliClient.prefs.v95historyImportAuto
    BiliClient.prefs.v95historyImportAuto = enabled
    AppToast.show(this, "History Import Auto: ${if (enabled) "ON" else "OFF"}")
}

// v95.71: Playback Auto Skip Ending95
internal fun PlayerActivity.showV95PlaybackAutoSkipEnding95Toggle() {
    val enabled = !BiliClient.prefs.v95playbackAutoSkipEnding95
    BiliClient.prefs.v95playbackAutoSkipEnding95 = enabled
    AppToast.show(this, "Playback Auto Skip Ending95: ${if (enabled) "ON" else "OFF"}")
}

// v95.72: Screenshot Auto Open After
internal fun PlayerActivity.showV95ScreenshotAutoOpenAfterToggle() {
    val enabled = !BiliClient.prefs.v95screenshotAutoOpenAfter
    BiliClient.prefs.v95screenshotAutoOpenAfter = enabled
    AppToast.show(this, "Screenshot Auto Open After: ${if (enabled) "ON" else "OFF"}")
}

// v95.73: Video VHS Effect Custom
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

// v95.74: Danmaku Scroll Acceleration
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

// v95.75: Subtitle BG Gradient Opacity
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

// v96.76: Video Neon Glow Custom
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

// v96.77: Danmaku Font Letter Spacing
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

// v96.78: Subtitle BG Gradient Type
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

// v96.79: Gesture Swipe Min Distance
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

// v96.80: Cast Video Decode Threads
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

// v96.81: Playlist Auto Group By Type
internal fun PlayerActivity.showV96PlaylistAutoGroupByTypeToggle() {
    val enabled = !BiliClient.prefs.v96playlistAutoGroupByType
    BiliClient.prefs.v96playlistAutoGroupByType = enabled
    AppToast.show(this, "Playlist Auto Group By Type: ${if (enabled) "ON" else "OFF"}")
}

// v96.82: Cache Cleanup Interval
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

// v96.83: Progress Bar Thumb Shadow
internal fun PlayerActivity.showV96ProgressBarThumbShadowToggle() {
    val enabled = !BiliClient.prefs.v96progressBarThumbShadow
    BiliClient.prefs.v96progressBarThumbShadow = enabled
    AppToast.show(this, "Progress Bar Thumb Shadow: ${if (enabled) "ON" else "OFF"}")
}

// v96.84: Volume Auto Replay Gain
internal fun PlayerActivity.showV96VolumeAutoReplayGainToggle() {
    val enabled = !BiliClient.prefs.v96volumeAutoReplayGain
    BiliClient.prefs.v96volumeAutoReplayGain = enabled
    AppToast.show(this, "Volume Auto Replay Gain: ${if (enabled) "ON" else "OFF"}")
}

// v96.85: History Auto Clean Max Days
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

// v96.86: Playback Auto Skip Credits
internal fun PlayerActivity.showV96PlaybackAutoSkipCreditsToggle() {
    val enabled = !BiliClient.prefs.v96playbackAutoSkipCredits
    BiliClient.prefs.v96playbackAutoSkipCredits = enabled
    AppToast.show(this, "Playback Auto Skip Credits: ${if (enabled) "ON" else "OFF"}")
}

// v96.87: Screenshot Auto Share Target
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

// v96.88: Video Dreamy Effect Custom
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

// v96.89: Danmaku Scroll Deceleration
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

// v96.90: Subtitle BG Gradient Start
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

// v97.91: Video Sepia Custom
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

// v97.92: Danmaku Font Weight Range
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

// v97.93: Subtitle BG Gradient End
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

// v97.94: Gesture Swipe Angle Threshold
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

// v97.95: Cast Video Post Processing
internal fun PlayerActivity.showV97CastVideoPostProcessingToggle() {
    val enabled = !BiliClient.prefs.v97castVideoPostProcessing
    BiliClient.prefs.v97castVideoPostProcessing = enabled
    AppToast.show(this, "Cast Video Post Processing: ${if (enabled) "ON" else "OFF"}")
}

// v97.96: Playlist Auto Group By Season
internal fun PlayerActivity.showV97PlaylistAutoGroupBySeasonToggle() {
    val enabled = !BiliClient.prefs.v97playlistAutoGroupBySeason
    BiliClient.prefs.v97playlistAutoGroupBySeason = enabled
    AppToast.show(this, "Playlist Auto Group By Season: ${if (enabled) "ON" else "OFF"}")
}

// v97.97: Cache Preload Policy
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

// v97.98: Progress Bar Thumb Glow
internal fun PlayerActivity.showV97ProgressBarThumbGlowToggle() {
    val enabled = !BiliClient.prefs.v97progressBarThumbGlow
    BiliClient.prefs.v97progressBarThumbGlow = enabled
    AppToast.show(this, "Progress Bar Thumb Glow: ${if (enabled) "ON" else "OFF"}")
}

// v97.99: Volume Auto Peak Limit
internal fun PlayerActivity.showV97VolumeAutoPeakLimitToggle() {
    val enabled = !BiliClient.prefs.v97volumeAutoPeakLimit
    BiliClient.prefs.v97volumeAutoPeakLimit = enabled
    AppToast.show(this, "Volume Auto Peak Limit: ${if (enabled) "ON" else "OFF"}")
}

// v97.100: History Auto Clean Min Items
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

// v97.101: Playback Auto Skip Recap97
internal fun PlayerActivity.showV97PlaybackAutoSkipRecap97Toggle() {
    val enabled = !BiliClient.prefs.v97playbackAutoSkipRecap97
    BiliClient.prefs.v97playbackAutoSkipRecap97 = enabled
    AppToast.show(this, "Playback Auto Skip Recap97: ${if (enabled) "ON" else "OFF"}")
}

// v97.102: Screenshot Auto Annotate Text
internal fun PlayerActivity.showV97ScreenshotAutoAnnotateTextToggle() {
    val enabled = !BiliClient.prefs.v97screenshotAutoAnnotateText
    BiliClient.prefs.v97screenshotAutoAnnotateText = enabled
    AppToast.show(this, "Screenshot Auto Annotate Text: ${if (enabled) "ON" else "OFF"}")
}

// v97.103: Video Polaroid Custom
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

// v97.104: Danmaku Font Size Min
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

// v97.105: Subtitle Animation Type97
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

// v98.106: Video Negative Custom
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

// v98.107: Danmaku Font Size Max
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

// v98.108: Subtitle Animation Speed98
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

// v98.109: Gesture Pinch Min Scale
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

// v98.110: Cast Audio Post Processing
internal fun PlayerActivity.showV98CastAudioPostProcessingToggle() {
    val enabled = !BiliClient.prefs.v98castAudioPostProcessing
    BiliClient.prefs.v98castAudioPostProcessing = enabled
    AppToast.show(this, "Cast Audio Post Processing: ${if (enabled) "ON" else "OFF"}")
}

// v98.111: Playlist Auto Group By Genre
internal fun PlayerActivity.showV98PlaylistAutoGroupByGenreToggle() {
    val enabled = !BiliClient.prefs.v98playlistAutoGroupByGenre
    BiliClient.prefs.v98playlistAutoGroupByGenre = enabled
    AppToast.show(this, "Playlist Auto Group By Genre: ${if (enabled) "ON" else "OFF"}")
}

// v98.112: Cache Download On Wifi
internal fun PlayerActivity.showV98CacheDownloadOnWifiToggle() {
    val enabled = !BiliClient.prefs.v98cacheDownloadOnWifi
    BiliClient.prefs.v98cacheDownloadOnWifi = enabled
    AppToast.show(this, "Cache Download On Wifi: ${if (enabled) "ON" else "OFF"}")
}

// v98.113: Progress Bar Thumb Border
internal fun PlayerActivity.showV98ProgressBarThumbBorderToggle() {
    val enabled = !BiliClient.prefs.v98progressBarThumbBorder
    BiliClient.prefs.v98progressBarThumbBorder = enabled
    AppToast.show(this, "Progress Bar Thumb Border: ${if (enabled) "ON" else "OFF"}")
}

// v98.114: Volume Auto RMS Level
internal fun PlayerActivity.showV98VolumeAutoRMSLevelToggle() {
    val enabled = !BiliClient.prefs.v98volumeAutoRMSLevel
    BiliClient.prefs.v98volumeAutoRMSLevel = enabled
    AppToast.show(this, "Volume Auto RMS Level: ${if (enabled) "ON" else "OFF"}")
}

// v98.115: History Auto Clean On Start
internal fun PlayerActivity.showV98HistoryAutoCleanOnStartToggle() {
    val enabled = !BiliClient.prefs.v98historyAutoCleanOnStart
    BiliClient.prefs.v98historyAutoCleanOnStart = enabled
    AppToast.show(this, "History Auto Clean On Start: ${if (enabled) "ON" else "OFF"}")
}

// v98.116: Playback Auto Skip Filler98
internal fun PlayerActivity.showV98PlaybackAutoSkipFiller98Toggle() {
    val enabled = !BiliClient.prefs.v98playbackAutoSkipFiller98
    BiliClient.prefs.v98playbackAutoSkipFiller98 = enabled
    AppToast.show(this, "Playback Auto Skip Filler98: ${if (enabled) "ON" else "OFF"}")
}

// v98.117: Screenshot Auto Upload Cloud
internal fun PlayerActivity.showV98ScreenshotAutoUploadCloudToggle() {
    val enabled = !BiliClient.prefs.v98screenshotAutoUploadCloud
    BiliClient.prefs.v98screenshotAutoUploadCloud = enabled
    AppToast.show(this, "Screenshot Auto Upload Cloud: ${if (enabled) "ON" else "OFF"}")
}

// v98.118: Video Monochrome Custom
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

// v98.119: Danmaku Font Style Custom98
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

// v98.120: Subtitle Animation Easing98
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

// v99.121: Video Posterize Custom
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

// v99.122: Danmaku Font Outline Toggle
internal fun PlayerActivity.showV99DanmakuFontOutlineToggleToggle() {
    val enabled = !BiliClient.prefs.v99danmakuFontOutlineToggle
    BiliClient.prefs.v99danmakuFontOutlineToggle = enabled
    AppToast.show(this, "Danmaku Font Outline Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v99.123: Subtitle Animation Duration99
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

// v99.124: Gesture Pinch Max Scale
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

// v99.125: Cast Video Auto Quality
internal fun PlayerActivity.showV99CastVideoAutoQualityToggle() {
    val enabled = !BiliClient.prefs.v99castVideoAutoQuality
    BiliClient.prefs.v99castVideoAutoQuality = enabled
    AppToast.show(this, "Cast Video Auto Quality: ${if (enabled) "ON" else "OFF"}")
}

// v99.126: Playlist Auto Group By Channel
internal fun PlayerActivity.showV99PlaylistAutoGroupByChannelToggle() {
    val enabled = !BiliClient.prefs.v99playlistAutoGroupByChannel
    BiliClient.prefs.v99playlistAutoGroupByChannel = enabled
    AppToast.show(this, "Playlist Auto Group By Channel: ${if (enabled) "ON" else "OFF"}")
}

// v99.127: Cache Download Speed Limit
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

// v99.128: Progress Bar Thumb Size99
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

// v99.129: Volume Auto Loudness99
internal fun PlayerActivity.showV99VolumeAutoLoudness99Toggle() {
    val enabled = !BiliClient.prefs.v99volumeAutoLoudness99
    BiliClient.prefs.v99volumeAutoLoudness99 = enabled
    AppToast.show(this, "Volume Auto Loudness99: ${if (enabled) "ON" else "OFF"}")
}

// v99.130: History Auto Clean On Exit
internal fun PlayerActivity.showV99HistoryAutoCleanOnExitToggle() {
    val enabled = !BiliClient.prefs.v99historyAutoCleanOnExit
    BiliClient.prefs.v99historyAutoCleanOnExit = enabled
    AppToast.show(this, "History Auto Clean On Exit: ${if (enabled) "ON" else "OFF"}")
}

// v99.131: Playback Auto Skip Intro99
internal fun PlayerActivity.showV99PlaybackAutoSkipIntro99Toggle() {
    val enabled = !BiliClient.prefs.v99playbackAutoSkipIntro99
    BiliClient.prefs.v99playbackAutoSkipIntro99 = enabled
    AppToast.show(this, "Playback Auto Skip Intro99: ${if (enabled) "ON" else "OFF"}")
}

// v99.132: Screenshot Auto Share99
internal fun PlayerActivity.showV99ScreenshotAutoShare99Toggle() {
    val enabled = !BiliClient.prefs.v99screenshotAutoShare99
    BiliClient.prefs.v99screenshotAutoShare99 = enabled
    AppToast.show(this, "Screenshot Auto Share99: ${if (enabled) "ON" else "OFF"}")
}

// v99.133: Video Solarize Custom
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

// v99.134: Danmaku Font Color Custom
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

// v99.135: Subtitle Animation Loop99
internal fun PlayerActivity.showV99SubtitleAnimationLoop99Toggle() {
    val enabled = !BiliClient.prefs.v99subtitleAnimationLoop99
    BiliClient.prefs.v99subtitleAnimationLoop99 = enabled
    AppToast.show(this, "Subtitle Animation Loop99: ${if (enabled) "ON" else "OFF"}")
}

// v100.136: Video Duotone Custom
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

// v100.137: Danmaku Font BG Toggle
internal fun PlayerActivity.showV100DanmakuFontBgToggleToggle() {
    val enabled = !BiliClient.prefs.v100danmakuFontBgToggle
    BiliClient.prefs.v100danmakuFontBgToggle = enabled
    AppToast.show(this, "Danmaku Font BG Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v100.138: Subtitle Animation Delay99
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

// v100.139: Gesture Pinch Speed99
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

// v100.140: Cast Audio Auto Quality
internal fun PlayerActivity.showV100CastAudioAutoQualityToggle() {
    val enabled = !BiliClient.prefs.v100castAudioAutoQuality
    BiliClient.prefs.v100castAudioAutoQuality = enabled
    AppToast.show(this, "Cast Audio Auto Quality: ${if (enabled) "ON" else "OFF"}")
}

// v100.141: Playlist Auto Group All
internal fun PlayerActivity.showV100PlaylistAutoGroupAllToggle() {
    val enabled = !BiliClient.prefs.v100playlistAutoGroupAll
    BiliClient.prefs.v100playlistAutoGroupAll = enabled
    AppToast.show(this, "Playlist Auto Group All: ${if (enabled) "ON" else "OFF"}")
}

// v100.142: Cache Download Retry
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

// v100.143: Progress Bar Thumb Color99
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

// v100.144: Volume Auto Normalize99
internal fun PlayerActivity.showV100VolumeAutoNormalize99Toggle() {
    val enabled = !BiliClient.prefs.v100volumeAutoNormalize99
    BiliClient.prefs.v100volumeAutoNormalize99 = enabled
    AppToast.show(this, "Volume Auto Normalize99: ${if (enabled) "ON" else "OFF"}")
}

// v100.145: History Auto Sync99
internal fun PlayerActivity.showV100HistoryAutoSync99Toggle() {
    val enabled = !BiliClient.prefs.v100historyAutoSync99
    BiliClient.prefs.v100historyAutoSync99 = enabled
    AppToast.show(this, "History Auto Sync99: ${if (enabled) "ON" else "OFF"}")
}

// v100.146: Playback Auto Skip Outro99
internal fun PlayerActivity.showV100PlaybackAutoSkipOutro99Toggle() {
    val enabled = !BiliClient.prefs.v100playbackAutoSkipOutro99
    BiliClient.prefs.v100playbackAutoSkipOutro99 = enabled
    AppToast.show(this, "Playback Auto Skip Outro99: ${if (enabled) "ON" else "OFF"}")
}

// v100.147: Screenshot Auto Format99
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

// v100.148: Video Tint Duotone
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

// v100.149: Danmaku Font Weight99
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

// v100.150: Subtitle Animation Type99
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

// v101.1: Audio Spatial Width Custom
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

// v101.2: Danmaku Font Stretch Toggle
internal fun PlayerActivity.showV101DanmakuFontStretchToggleToggle() {
    val enabled = !BiliClient.prefs.v101danmakuFontStretchToggle
    BiliClient.prefs.v101danmakuFontStretchToggle = enabled
    AppToast.show(this, "Danmaku Font Stretch Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v101.3: Subtitle Shadow Color Custom
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

// v101.4: Gesture Swipe Lock Horizontal
internal fun PlayerActivity.showV101GestureSwipeLockHorizontalToggle() {
    val enabled = !BiliClient.prefs.v101gestureSwipeLockHorizontal
    BiliClient.prefs.v101gestureSwipeLockHorizontal = enabled
    AppToast.show(this, "Gesture Swipe Lock Horizontal: ${if (enabled) "ON" else "OFF"}")
}

// v101.5: Cast Video HDR Mode
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

// v101.6: Playlist Auto Remove Watched
internal fun PlayerActivity.showV101PlaylistAutoRemoveWatchedToggle() {
    val enabled = !BiliClient.prefs.v101playlistAutoRemoveWatched
    BiliClient.prefs.v101playlistAutoRemoveWatched = enabled
    AppToast.show(this, "Playlist Auto Remove Watched: ${if (enabled) "ON" else "OFF"}")
}

// v101.7: Cache Encrypt Toggle
internal fun PlayerActivity.showV101CacheEncryptToggleToggle() {
    val enabled = !BiliClient.prefs.v101cacheEncryptToggle
    BiliClient.prefs.v101cacheEncryptToggle = enabled
    AppToast.show(this, "Cache Encrypt Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v101.8: Progress Bar Chapter Snap
internal fun PlayerActivity.showV101ProgressBarChapterSnapToggle() {
    val enabled = !BiliClient.prefs.v101progressBarChapterSnap
    BiliClient.prefs.v101progressBarChapterSnap = enabled
    AppToast.show(this, "Progress Bar Chapter Snap: ${if (enabled) "ON" else "OFF"}")
}

// v101.9: Volume EQ Preset Custom
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

// v101.10: History Search Highlight
internal fun PlayerActivity.showV101HistorySearchHighlightToggle() {
    val enabled = !BiliClient.prefs.v101historySearchHighlight
    BiliClient.prefs.v101historySearchHighlight = enabled
    AppToast.show(this, "History Search Highlight: ${if (enabled) "ON" else "OFF"}")
}

// v101.11: Playback Loop Segment AB
internal fun PlayerActivity.showV101PlaybackLoopSegmentABToggle() {
    val enabled = !BiliClient.prefs.v101playbackLoopSegmentAB
    BiliClient.prefs.v101playbackLoopSegmentAB = enabled
    AppToast.show(this, "Playback Loop Segment AB: ${if (enabled) "ON" else "OFF"}")
}

// v101.12: Screenshot Auto Crop
internal fun PlayerActivity.showV101ScreenshotAutoCropToggle() {
    val enabled = !BiliClient.prefs.v101screenshotAutoCrop
    BiliClient.prefs.v101screenshotAutoCrop = enabled
    AppToast.show(this, "Screenshot Auto Crop: ${if (enabled) "ON" else "OFF"}")
}

// v101.13: Video Edge Enhance Custom
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

// v101.14: Danmaku Font Glow Toggle
internal fun PlayerActivity.showV101DanmakuFontGlowToggleToggle() {
    val enabled = !BiliClient.prefs.v101danmakuFontGlowToggle
    BiliClient.prefs.v101danmakuFontGlowToggle = enabled
    AppToast.show(this, "Danmaku Font Glow Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v101.15: Subtitle Line Spacing
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

// v102.16: Audio Bass Boost Custom
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

// v102.17: Danmaku Font Stroke Width
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

// v102.18: Subtitle Text Alignment
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

// v102.19: Gesture Swipe Lock Vertical
internal fun PlayerActivity.showV102GestureSwipeLockVerticalToggle() {
    val enabled = !BiliClient.prefs.v102gestureSwipeLockVertical
    BiliClient.prefs.v102gestureSwipeLockVertical = enabled
    AppToast.show(this, "Gesture Swipe Lock Vertical: ${if (enabled) "ON" else "OFF"}")
}

// v102.20: Cast Video AV Sync
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

// v102.21: Playlist Auto Reverse Order
internal fun PlayerActivity.showV102PlaylistAutoReverseOrderToggle() {
    val enabled = !BiliClient.prefs.v102playlistAutoReverseOrder
    BiliClient.prefs.v102playlistAutoReverseOrder = enabled
    AppToast.show(this, "Playlist Auto Reverse Order: ${if (enabled) "ON" else "OFF"}")
}

// v102.22: Cache Auto Clear On Full
internal fun PlayerActivity.showV102CacheAutoClearOnFullToggle() {
    val enabled = !BiliClient.prefs.v102cacheAutoClearOnFull
    BiliClient.prefs.v102cacheAutoClearOnFull = enabled
    AppToast.show(this, "Cache Auto Clear On Full: ${if (enabled) "ON" else "OFF"}")
}

// v102.23: Progress Bar Buffer Show
internal fun PlayerActivity.showV102ProgressBarBufferShowToggle() {
    val enabled = !BiliClient.prefs.v102progressBarBufferShow
    BiliClient.prefs.v102progressBarBufferShow = enabled
    AppToast.show(this, "Progress Bar Buffer Show: ${if (enabled) "ON" else "OFF"}")
}

// v102.24: Volume EQ Gain Preamp
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

// v102.25: History Pin Record Toggle
internal fun PlayerActivity.showV102HistoryPinRecordToggleToggle() {
    val enabled = !BiliClient.prefs.v102historyPinRecordToggle
    BiliClient.prefs.v102historyPinRecordToggle = enabled
    AppToast.show(this, "History Pin Record Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v102.26: Playback Loop Segment Count
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

// v102.27: Screenshot Auto Rotate
internal fun PlayerActivity.showV102ScreenshotAutoRotateToggle() {
    val enabled = !BiliClient.prefs.v102screenshotAutoRotate
    BiliClient.prefs.v102screenshotAutoRotate = enabled
    AppToast.show(this, "Screenshot Auto Rotate: ${if (enabled) "ON" else "OFF"}")
}

// v102.28: Video Mosaic Effect Custom
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

// v102.29: Danmaku Font Glow Color
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

// v102.30: Subtitle Text Transform Custom
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

// v103.31: Audio Treble Boost Custom
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

// v103.32: Danmaku Font Glow Radius
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

// v103.33: Subtitle Font Variant Custom
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

