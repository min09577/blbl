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

internal fun PlayerActivity.showV81ScreenshotCountDisplayToggle() {
    val enabled = !BiliClient.prefs.v81ScreenshotCountDisplay
    BiliClient.prefs.v81ScreenshotCountDisplay = enabled
    AppToast.show(this, "Screenshot Count Display: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV81VideoUpscaleAIToggle() {
    val enabled = !BiliClient.prefs.v81VideoUpscaleAI
    BiliClient.prefs.v81VideoUpscaleAI = enabled
    AppToast.show(this, "Video Upscale AI: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV82PlaylistDuplicateDetectToggle() {
    val enabled = !BiliClient.prefs.v82PlaylistDuplicateDetect
    BiliClient.prefs.v82PlaylistDuplicateDetect = enabled
    AppToast.show(this, "Playlist Duplicate Detect: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV82CacheSmartPrefetchToggle() {
    val enabled = !BiliClient.prefs.v82CacheSmartPrefetch
    BiliClient.prefs.v82CacheSmartPrefetch = enabled
    AppToast.show(this, "Cache Smart Prefetch: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV82ProgressBarSwipeSeekToggle() {
    val enabled = !BiliClient.prefs.v82ProgressBarSwipeSeek
    BiliClient.prefs.v82ProgressBarSwipeSeek = enabled
    AppToast.show(this, "Progress Bar Swipe Seek: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV82VolumeNightModeToggle() {
    val enabled = !BiliClient.prefs.v82VolumeNightMode
    BiliClient.prefs.v82VolumeNightMode = enabled
    AppToast.show(this, "Volume Night Mode: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV82HistoryGroupByDateToggle() {
    val enabled = !BiliClient.prefs.v82HistoryGroupByDate
    BiliClient.prefs.v82HistoryGroupByDate = enabled
    AppToast.show(this, "History Group By Date: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV82PlaybackSpeedMemoryToggle() {
    val enabled = !BiliClient.prefs.v82PlaybackSpeedMemory
    BiliClient.prefs.v82PlaybackSpeedMemory = enabled
    AppToast.show(this, "Playback Speed Memory: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV82ScreenshotTimestampToggle() {
    val enabled = !BiliClient.prefs.v82ScreenshotTimestamp
    BiliClient.prefs.v82ScreenshotTimestamp = enabled
    AppToast.show(this, "Screenshot Timestamp: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV82SubtitleSyncAutoToggle() {
    val enabled = !BiliClient.prefs.v82SubtitleSyncAuto
    BiliClient.prefs.v82SubtitleSyncAuto = enabled
    AppToast.show(this, "Subtitle Sync Auto: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV83SubtitleKaraokeHighlightToggle() {
    val enabled = !BiliClient.prefs.v83SubtitleKaraokeHighlight
    BiliClient.prefs.v83SubtitleKaraokeHighlight = enabled
    AppToast.show(this, "Subtitle Karaoke Highlight: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV83CacheWIFIPriorityToggle() {
    val enabled = !BiliClient.prefs.v83CacheWIFIPriority
    BiliClient.prefs.v83CacheWIFIPriority = enabled
    AppToast.show(this, "Cache WiFi Priority: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV83PlaybackAutoNextEpisodeToggle() {
    val enabled = !BiliClient.prefs.v83PlaybackAutoNextEpisode
    BiliClient.prefs.v83PlaybackAutoNextEpisode = enabled
    AppToast.show(this, "Playback Auto Next Episode: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV83ScreenshotOverlayInfoToggle() {
    val enabled = !BiliClient.prefs.v83ScreenshotOverlayInfo
    BiliClient.prefs.v83ScreenshotOverlayInfo = enabled
    AppToast.show(this, "Screenshot Overlay Info: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV84SubtitleBilingualDisplayToggle() {
    val enabled = !BiliClient.prefs.v84SubtitleBilingualDisplay
    BiliClient.prefs.v84SubtitleBilingualDisplay = enabled
    AppToast.show(this, "Subtitle Bilingual Display: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV84CastVideoHDR10CustomToggle() {
    val enabled = !BiliClient.prefs.v84CastVideoHDR10Custom
    BiliClient.prefs.v84CastVideoHDR10Custom = enabled
    AppToast.show(this, "Cast Video HDR10 Custom: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV84PlaylistAutoPlayNextToggle() {
    val enabled = !BiliClient.prefs.v84PlaylistAutoPlayNext
    BiliClient.prefs.v84PlaylistAutoPlayNext = enabled
    AppToast.show(this, "Playlist Auto Play Next: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV84CacheStorageAnalyzeToggle() {
    val enabled = !BiliClient.prefs.v84CacheStorageAnalyze
    BiliClient.prefs.v84CacheStorageAnalyze = enabled
    AppToast.show(this, "Cache Storage Analyze: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV84ProgressBarHapticFeedbackToggle() {
    val enabled = !BiliClient.prefs.v84ProgressBarHapticFeedback
    BiliClient.prefs.v84ProgressBarHapticFeedback = enabled
    AppToast.show(this, "Progress Bar Haptic Feedback: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV84HistoryAutoCleanupToggle() {
    val enabled = !BiliClient.prefs.v84HistoryAutoCleanup
    BiliClient.prefs.v84HistoryAutoCleanup = enabled
    AppToast.show(this, "History Auto Cleanup: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV84PlaybackAutoPlayOnOpenToggle() {
    val enabled = !BiliClient.prefs.v84PlaybackAutoPlayOnOpen
    BiliClient.prefs.v84PlaybackAutoPlayOnOpen = enabled
    AppToast.show(this, "Playback Auto Play On Open: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV84DanmakuFontItalicToggleToggle() {
    val enabled = !BiliClient.prefs.v84DanmakuFontItalicToggle
    BiliClient.prefs.v84DanmakuFontItalicToggle = enabled
    AppToast.show(this, "Danmaku Font Italic Toggle: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV85PlaylistAutoLoadMoreToggle() {
    val enabled = !BiliClient.prefs.v85PlaylistAutoLoadMore
    BiliClient.prefs.v85PlaylistAutoLoadMore = enabled
    AppToast.show(this, "Playlist Auto Load More: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV85CacheCleanupOnLowStorageToggle() {
    val enabled = !BiliClient.prefs.v85CacheCleanupOnLowStorage
    BiliClient.prefs.v85CacheCleanupOnLowStorage = enabled
    AppToast.show(this, "Cache Cleanup On Low Storage: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV85ProgressBarTooltipToggle() {
    val enabled = !BiliClient.prefs.v85ProgressBarTooltip
    BiliClient.prefs.v85ProgressBarTooltip = enabled
    AppToast.show(this, "Progress Bar Tooltip: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV85PlaybackAutoLoopSingleToggle() {
    val enabled = !BiliClient.prefs.v85PlaybackAutoLoopSingle
    BiliClient.prefs.v85PlaybackAutoLoopSingle = enabled
    AppToast.show(this, "Playback Auto Loop Single: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV85DanmakuBgBorderToggleToggle() {
    val enabled = !BiliClient.prefs.v85DanmakuBgBorderToggle
    BiliClient.prefs.v85DanmakuBgBorderToggle = enabled
    AppToast.show(this, "Danmaku BG Border Toggle: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV85SubtitleFontSizeAutoToggle() {
    val enabled = !BiliClient.prefs.v85SubtitleFontSizeAuto
    BiliClient.prefs.v85SubtitleFontSizeAuto = enabled
    AppToast.show(this, "Subtitle Font Size Auto: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV86PlaylistAutoRefreshToggle() {
    val enabled = !BiliClient.prefs.v86PlaylistAutoRefresh
    BiliClient.prefs.v86PlaylistAutoRefresh = enabled
    AppToast.show(this, "Playlist Auto Refresh: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV86ProgressBarLiveEdgeToggle() {
    val enabled = !BiliClient.prefs.v86ProgressBarLiveEdge
    BiliClient.prefs.v86ProgressBarLiveEdge = enabled
    AppToast.show(this, "Progress Bar Live Edge: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV86PlaybackAutoQualitySwitchToggle() {
    val enabled = !BiliClient.prefs.v86PlaybackAutoQualitySwitch
    BiliClient.prefs.v86PlaybackAutoQualitySwitch = enabled
    AppToast.show(this, "Playback Auto Quality Switch: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV86ScreenshotAutoUploadToggle() {
    val enabled = !BiliClient.prefs.v86ScreenshotAutoUpload
    BiliClient.prefs.v86ScreenshotAutoUpload = enabled
    AppToast.show(this, "Screenshot Auto Upload: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV87PlaylistAutoDownloadToggle() {
    val enabled = !BiliClient.prefs.v87PlaylistAutoDownload
    BiliClient.prefs.v87PlaylistAutoDownload = enabled
    AppToast.show(this, "Playlist Auto Download: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV87ProgressBarSnapToChapterToggle() {
    val enabled = !BiliClient.prefs.v87ProgressBarSnapToChapter
    BiliClient.prefs.v87ProgressBarSnapToChapter = enabled
    AppToast.show(this, "Progress Bar Snap To Chapter: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV87HistoryAutoDeleteExpiredToggle() {
    val enabled = !BiliClient.prefs.v87HistoryAutoDeleteExpired
    BiliClient.prefs.v87HistoryAutoDeleteExpired = enabled
    AppToast.show(this, "History Auto Delete Expired: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV87PlaybackAutoSkipFillerToggle() {
    val enabled = !BiliClient.prefs.v87PlaybackAutoSkipFiller
    BiliClient.prefs.v87PlaybackAutoSkipFiller = enabled
    AppToast.show(this, "Playback Auto Skip Filler: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV87ScreenshotCloudSyncToggle() {
    val enabled = !BiliClient.prefs.v87ScreenshotCloudSync
    BiliClient.prefs.v87ScreenshotCloudSync = enabled
    AppToast.show(this, "Screenshot Cloud Sync: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV88PlaylistAutoMarkWatchedToggle() {
    val enabled = !BiliClient.prefs.v88PlaylistAutoMarkWatched
    BiliClient.prefs.v88PlaylistAutoMarkWatched = enabled
    AppToast.show(this, "Playlist Auto Mark Watched: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV88CachePreloadNextEpisodeToggle() {
    val enabled = !BiliClient.prefs.v88CachePreloadNextEpisode
    BiliClient.prefs.v88CachePreloadNextEpisode = enabled
    AppToast.show(this, "Cache Preload Next Episode: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV88ProgressBarCustomLabelToggle() {
    val enabled = !BiliClient.prefs.v88ProgressBarCustomLabel
    BiliClient.prefs.v88ProgressBarCustomLabel = enabled
    AppToast.show(this, "Progress Bar Custom Label: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV88VolumeAutoMuteOnCallToggle() {
    val enabled = !BiliClient.prefs.v88VolumeAutoMuteOnCall
    BiliClient.prefs.v88VolumeAutoMuteOnCall = enabled
    AppToast.show(this, "Volume Auto Mute On Call: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV88HistoryShowThumbnailsToggle() {
    val enabled = !BiliClient.prefs.v88HistoryShowThumbnails
    BiliClient.prefs.v88HistoryShowThumbnails = enabled
    AppToast.show(this, "History Show Thumbnails: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV88PlaybackAutoResumePositionToggle() {
    val enabled = !BiliClient.prefs.v88PlaybackAutoResumePosition
    BiliClient.prefs.v88PlaybackAutoResumePosition = enabled
    AppToast.show(this, "Playback Auto Resume Position: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV89PlaylistAutoGroupBySeriesToggle() {
    val enabled = !BiliClient.prefs.v89PlaylistAutoGroupBySeries
    BiliClient.prefs.v89PlaylistAutoGroupBySeries = enabled
    AppToast.show(this, "Playlist Auto Group By Series: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV89CacheVerifyOnStartToggle() {
    val enabled = !BiliClient.prefs.v89CacheVerifyOnStart
    BiliClient.prefs.v89CacheVerifyOnStart = enabled
    AppToast.show(this, "Cache Verify On Start: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV89ProgressBarMidpointIndicatorToggle() {
    val enabled = !BiliClient.prefs.v89ProgressBarMidpointIndicator
    BiliClient.prefs.v89ProgressBarMidpointIndicator = enabled
    AppToast.show(this, "Progress Bar Midpoint Indicator: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV89VolumeAutoLowerOnNotificationToggle() {
    val enabled = !BiliClient.prefs.v89VolumeAutoLowerOnNotification
    BiliClient.prefs.v89VolumeAutoLowerOnNotification = enabled
    AppToast.show(this, "Volume Auto Lower On Notification: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV89PlaybackAutoSkipPreviewToggle() {
    val enabled = !BiliClient.prefs.v89PlaybackAutoSkipPreview
    BiliClient.prefs.v89PlaybackAutoSkipPreview = enabled
    AppToast.show(this, "Playback Auto Skip Preview: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV90PlaylistAutoSkipWatchedToggle() {
    val enabled = !BiliClient.prefs.v90PlaylistAutoSkipWatched
    BiliClient.prefs.v90PlaylistAutoSkipWatched = enabled
    AppToast.show(this, "Playlist Auto Skip Watched: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV90CacheBackgroundCleanupToggle() {
    val enabled = !BiliClient.prefs.v90CacheBackgroundCleanup
    BiliClient.prefs.v90CacheBackgroundCleanup = enabled
    AppToast.show(this, "Cache Background Cleanup: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV90ProgressBarEstimatedTimeToggle() {
    val enabled = !BiliClient.prefs.v90ProgressBarEstimatedTime
    BiliClient.prefs.v90ProgressBarEstimatedTime = enabled
    AppToast.show(this, "Progress Bar Estimated Time: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV90HistoryAutoSyncCloudToggle() {
    val enabled = !BiliClient.prefs.v90HistoryAutoSyncCloud
    BiliClient.prefs.v90HistoryAutoSyncCloud = enabled
    AppToast.show(this, "History Auto Sync Cloud: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV90PlaybackAutoNextOnBufferToggle() {
    val enabled = !BiliClient.prefs.v90PlaybackAutoNextOnBuffer
    BiliClient.prefs.v90PlaybackAutoNextOnBuffer = enabled
    AppToast.show(this, "Playback Auto Next On Buffer: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV90ScreenshotAutoDeleteOldToggle() {
    val enabled = !BiliClient.prefs.v90ScreenshotAutoDeleteOld
    BiliClient.prefs.v90ScreenshotAutoDeleteOld = enabled
    AppToast.show(this, "Screenshot Auto Delete Old: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV91DanmakuFontShadowToggleToggle() {
    val enabled = !BiliClient.prefs.v91danmakuFontShadowToggle
    BiliClient.prefs.v91danmakuFontShadowToggle = enabled
    AppToast.show(this, "Danmaku Font Shadow Toggle: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV91PlaylistAutoResumeLastToggle() {
    val enabled = !BiliClient.prefs.v91playlistAutoResumeLast
    BiliClient.prefs.v91playlistAutoResumeLast = enabled
    AppToast.show(this, "Playlist Auto Resume Last: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV91ProgressBarChapterLabelToggle() {
    val enabled = !BiliClient.prefs.v91progressBarChapterLabel
    BiliClient.prefs.v91progressBarChapterLabel = enabled
    AppToast.show(this, "Progress Bar Chapter Label: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV91VolumeAutoDuckingToggle() {
    val enabled = !BiliClient.prefs.v91volumeAutoDucking
    BiliClient.prefs.v91volumeAutoDucking = enabled
    AppToast.show(this, "Volume Auto Ducking: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV91HistoryGroupBySeriesToggle() {
    val enabled = !BiliClient.prefs.v91historyGroupBySeries
    BiliClient.prefs.v91historyGroupBySeries = enabled
    AppToast.show(this, "History Group By Series: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV91ScreenshotRegionCaptureToggle() {
    val enabled = !BiliClient.prefs.v91screenshotRegionCapture
    BiliClient.prefs.v91screenshotRegionCapture = enabled
    AppToast.show(this, "Screenshot Region Capture: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV92DanmakuFontUnderlineToggleToggle() {
    val enabled = !BiliClient.prefs.v92danmakuFontUnderlineToggle
    BiliClient.prefs.v92danmakuFontUnderlineToggle = enabled
    AppToast.show(this, "Danmaku Font Underline Toggle: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV92CastVideoDropFrameToggle() {
    val enabled = !BiliClient.prefs.v92castVideoDropFrame
    BiliClient.prefs.v92castVideoDropFrame = enabled
    AppToast.show(this, "Cast Video Drop Frame: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV92VolumeAutoBalanceToggle() {
    val enabled = !BiliClient.prefs.v92volumeAutoBalance
    BiliClient.prefs.v92volumeAutoBalance = enabled
    AppToast.show(this, "Volume Auto Balance: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV92HistoryAutoCleanExpiredToggle() {
    val enabled = !BiliClient.prefs.v92historyAutoCleanExpired
    BiliClient.prefs.v92historyAutoCleanExpired = enabled
    AppToast.show(this, "History Auto Clean Expired: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV92PlaybackAutoSkipSameTitleToggle() {
    val enabled = !BiliClient.prefs.v92playbackAutoSkipSameTitle
    BiliClient.prefs.v92playbackAutoSkipSameTitle = enabled
    AppToast.show(this, "Playback Auto Skip Same Title: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV93VideoScanlineEffectToggle() {
    val enabled = !BiliClient.prefs.v93videoScanlineEffect
    BiliClient.prefs.v93videoScanlineEffect = enabled
    AppToast.show(this, "Video Scanline Effect: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV93VolumeAutoGainControlToggle() {
    val enabled = !BiliClient.prefs.v93volumeAutoGainControl
    BiliClient.prefs.v93volumeAutoGainControl = enabled
    AppToast.show(this, "Volume Auto Gain Control: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV93HistoryAutoSyncDeviceToggle() {
    val enabled = !BiliClient.prefs.v93historyAutoSyncDevice
    BiliClient.prefs.v93historyAutoSyncDevice = enabled
    AppToast.show(this, "History Auto Sync Device: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV93PlaybackAutoSkipRecap93Toggle() {
    val enabled = !BiliClient.prefs.v93playbackAutoSkipRecap93
    BiliClient.prefs.v93playbackAutoSkipRecap93 = enabled
    AppToast.show(this, "Playback Auto Skip Recap93: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV93DanmakuSendConfirmToggleToggle() {
    val enabled = !BiliClient.prefs.v93danmakuSendConfirmToggle
    BiliClient.prefs.v93danmakuSendConfirmToggle = enabled
    AppToast.show(this, "Danmaku Send Confirm Toggle: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV94VideoPixelArtModeToggle() {
    val enabled = !BiliClient.prefs.v94videoPixelArtMode
    BiliClient.prefs.v94videoPixelArtMode = enabled
    AppToast.show(this, "Video Pixel Art Mode: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV94DanmakuFontMonospaceToggleToggle() {
    val enabled = !BiliClient.prefs.v94danmakuFontMonospaceToggle
    BiliClient.prefs.v94danmakuFontMonospaceToggle = enabled
    AppToast.show(this, "Danmaku Font Monospace Toggle: ${if (enabled) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV94PlaylistAutoGroupByUpToggle() {
    val enabled = !BiliClient.prefs.v94playlistAutoGroupByUp
    BiliClient.prefs.v94playlistAutoGroupByUp = enabled
    AppToast.show(this, "Playlist Auto Group By Up: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV94CacheSmartCleanupToggle() {
    val enabled = !BiliClient.prefs.v94cacheSmartCleanup
    BiliClient.prefs.v94cacheSmartCleanup = enabled
    AppToast.show(this, "Cache Smart Cleanup: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV94ProgressBarLiveIndicatorToggle() {
    val enabled = !BiliClient.prefs.v94progressBarLiveIndicator
    BiliClient.prefs.v94progressBarLiveIndicator = enabled
    AppToast.show(this, "Progress Bar Live Indicator: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV94VolumeAutoPanToggle() {
    val enabled = !BiliClient.prefs.v94volumeAutoPan
    BiliClient.prefs.v94volumeAutoPan = enabled
    AppToast.show(this, "Volume Auto Pan: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV94HistoryExportAutoToggle() {
    val enabled = !BiliClient.prefs.v94historyExportAuto
    BiliClient.prefs.v94historyExportAuto = enabled
    AppToast.show(this, "History Export Auto: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV94PlaybackAutoSkipTitleToggle() {
    val enabled = !BiliClient.prefs.v94playbackAutoSkipTitle
    BiliClient.prefs.v94playbackAutoSkipTitle = enabled
    AppToast.show(this, "Playback Auto Skip Title: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV94ScreenshotAutoCopyPathToggle() {
    val enabled = !BiliClient.prefs.v94screenshotAutoCopyPath
    BiliClient.prefs.v94screenshotAutoCopyPath = enabled
    AppToast.show(this, "Screenshot Auto Copy Path: ${if (enabled) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV94VideoAsciiArtModeToggle() {
    val enabled = !BiliClient.prefs.v94videoAsciiArtMode
    BiliClient.prefs.v94videoAsciiArtMode = enabled
    AppToast.show(this, "Video Ascii Art Mode: ${if (enabled) "ON" else "OFF"}")
}

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

