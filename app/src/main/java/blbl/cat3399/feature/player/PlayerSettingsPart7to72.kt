package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v103.34: Gesture Long Press Drag Action
internal fun PlayerActivity.showV103GestureLongPressDragActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103gestureLongPressDragAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Drag Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103gestureLongPressDragAction = value
        AppToast.show(this, "Gesture Long Press Drag Action: $value")
    }
}

// v103.35: Cast Video Bit Depth
internal fun PlayerActivity.showV103CastVideoBitDepthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103castVideoBitDepth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Bit Depth",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103castVideoBitDepth = value
        AppToast.show(this, "Cast Video Bit Depth: $value")
    }
}

// v103.36: Playlist Auto Skip Duplicate
internal fun PlayerActivity.showV103PlaylistAutoSkipDuplicateToggle() {
    val enabled = !BiliClient.prefs.v103playlistAutoSkipDuplicate
    BiliClient.prefs.v103playlistAutoSkipDuplicate = enabled
    AppToast.show(this, "Playlist Auto Skip Duplicate: ${if (enabled) "ON" else "OFF"}")
}

// v103.37: Cache Thumbnail Preload
internal fun PlayerActivity.showV103CacheThumbnailPreloadToggle() {
    val enabled = !BiliClient.prefs.v103cacheThumbnailPreload
    BiliClient.prefs.v103cacheThumbnailPreload = enabled
    AppToast.show(this, "Cache Thumbnail Preload: ${if (enabled) "ON" else "OFF"}")
}

// v103.38: Progress Bar Live Edge Color
internal fun PlayerActivity.showV103ProgressBarLiveEdgeColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103progressBarLiveEdgeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Live Edge Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103progressBarLiveEdgeColor = value
        AppToast.show(this, "Progress Bar Live Edge Color: $value")
    }
}

// v103.39: Volume Night Boost Toggle
internal fun PlayerActivity.showV103VolumeNightBoostToggleToggle() {
    val enabled = !BiliClient.prefs.v103volumeNightBoostToggle
    BiliClient.prefs.v103volumeNightBoostToggle = enabled
    AppToast.show(this, "Volume Night Boost Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v103.40: History Undo Delete Toggle
internal fun PlayerActivity.showV103HistoryUndoDeleteToggleToggle() {
    val enabled = !BiliClient.prefs.v103historyUndoDeleteToggle
    BiliClient.prefs.v103historyUndoDeleteToggle = enabled
    AppToast.show(this, "History Undo Delete Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v103.41: Playback AB Loop Memory
internal fun PlayerActivity.showV103PlaybackABLoopMemoryToggle() {
    val enabled = !BiliClient.prefs.v103playbackABLoopMemory
    BiliClient.prefs.v103playbackABLoopMemory = enabled
    AppToast.show(this, "Playback AB Loop Memory: ${if (enabled) "ON" else "OFF"}")
}

// v103.42: Screenshot Auto Naming Scheme
internal fun PlayerActivity.showV103ScreenshotAutoNamingSchemeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103screenshotAutoNamingScheme).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Naming Scheme",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103screenshotAutoNamingScheme = value
        AppToast.show(this, "Screenshot Auto Naming Scheme: $value")
    }
}

// v103.43: Video Kaleidoscope Custom
internal fun PlayerActivity.showV103VideoKaleidoscopeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103videoKaleidoscopeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Kaleidoscope Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103videoKaleidoscopeCustom = value
        AppToast.show(this, "Video Kaleidoscope Custom: $value")
    }
}

// v103.44: Danmaku Font Glow Intensity
internal fun PlayerActivity.showV103DanmakuFontGlowIntensityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v103danmakuFontGlowIntensity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Glow Intensity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103danmakuFontGlowIntensity = value
        AppToast.show(this, "Danmaku Font Glow Intensity: $value")
    }
}

// v103.45: Subtitle Font Load Custom
internal fun PlayerActivity.showV103SubtitleFontLoadCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103subtitleFontLoadCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Load Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103subtitleFontLoadCustom = value
        AppToast.show(this, "Subtitle Font Load Custom: $value")
    }
}

// v104.46: Audio Vocal Boost Custom
internal fun PlayerActivity.showV104AudioVocalBoostCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v104audioVocalBoostCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Vocal Boost Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104audioVocalBoostCustom = value
        AppToast.show(this, "Audio Vocal Boost Custom: $value")
    }
}

// v104.47: Danmaku Font Glow Spread
internal fun PlayerActivity.showV104DanmakuFontGlowSpreadDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v104danmakuFontGlowSpread).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Glow Spread",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104danmakuFontGlowSpread = value
        AppToast.show(this, "Danmaku Font Glow Spread: $value")
    }
}

// v104.48: Subtitle Font Scale Custom
internal fun PlayerActivity.showV104SubtitleFontScaleCustomDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v104subtitleFontScaleCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Scale Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104subtitleFontScaleCustom = value
        AppToast.show(this, "Subtitle Font Scale Custom: $value")
    }
}

// v104.49: Gesture Quick Scrub Toggle
internal fun PlayerActivity.showV104GestureQuickScrubToggleToggle() {
    val enabled = !BiliClient.prefs.v104gestureQuickScrubToggle
    BiliClient.prefs.v104gestureQuickScrubToggle = enabled
    AppToast.show(this, "Gesture Quick Scrub Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v104.50: Cast Video Field Order
internal fun PlayerActivity.showV104CastVideoFieldOrderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104castVideoFieldOrder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Field Order",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104castVideoFieldOrder = value
        AppToast.show(this, "Cast Video Field Order: $value")
    }
}

// v104.51: Playlist Auto Download Next
internal fun PlayerActivity.showV104PlaylistAutoDownloadNextToggle() {
    val enabled = !BiliClient.prefs.v104playlistAutoDownloadNext
    BiliClient.prefs.v104playlistAutoDownloadNext = enabled
    AppToast.show(this, "Playlist Auto Download Next: ${if (enabled) "ON" else "OFF"}")
}

// v104.52: Cache Video Only Mode
internal fun PlayerActivity.showV104CacheVideoOnlyModeToggle() {
    val enabled = !BiliClient.prefs.v104cacheVideoOnlyMode
    BiliClient.prefs.v104cacheVideoOnlyMode = enabled
    AppToast.show(this, "Cache Video Only Mode: ${if (enabled) "ON" else "OFF"}")
}

// v104.53: Progress Bar Time Code Format
internal fun PlayerActivity.showV104ProgressBarTimeCodeFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104progressBarTimeCodeFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Time Code Format",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104progressBarTimeCodeFormat = value
        AppToast.show(this, "Progress Bar Time Code Format: $value")
    }
}

// v104.54: Volume Audio Channel Map
internal fun PlayerActivity.showV104VolumeAudioChannelMapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104volumeAudioChannelMap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Audio Channel Map",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104volumeAudioChannelMap = value
        AppToast.show(this, "Volume Audio Channel Map: $value")
    }
}

// v104.55: History Batch Delete Mode
internal fun PlayerActivity.showV104HistoryBatchDeleteModeToggle() {
    val enabled = !BiliClient.prefs.v104historyBatchDeleteMode
    BiliClient.prefs.v104historyBatchDeleteMode = enabled
    AppToast.show(this, "History Batch Delete Mode: ${if (enabled) "ON" else "OFF"}")
}

// v104.56: Playback AB Loop Auto Save
internal fun PlayerActivity.showV104PlaybackABLoopAutoSaveToggle() {
    val enabled = !BiliClient.prefs.v104playbackABLoopAutoSave
    BiliClient.prefs.v104playbackABLoopAutoSave = enabled
    AppToast.show(this, "Playback AB Loop Auto Save: ${if (enabled) "ON" else "OFF"}")
}

// v104.57: Screenshot Auto Optimize
internal fun PlayerActivity.showV104ScreenshotAutoOptimizeToggle() {
    val enabled = !BiliClient.prefs.v104screenshotAutoOptimize
    BiliClient.prefs.v104screenshotAutoOptimize = enabled
    AppToast.show(this, "Screenshot Auto Optimize: ${if (enabled) "ON" else "OFF"}")
}

// v104.58: Video Mirror Flip Custom
internal fun PlayerActivity.showV104VideoMirrorFlipCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104videoMirrorFlipCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Mirror Flip Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104videoMirrorFlipCustom = value
        AppToast.show(this, "Video Mirror Flip Custom: $value")
    }
}

// v104.59: Danmaku Font Gradient Toggle
internal fun PlayerActivity.showV104DanmakuFontGradientToggleToggle() {
    val enabled = !BiliClient.prefs.v104danmakuFontGradientToggle
    BiliClient.prefs.v104danmakuFontGradientToggle = enabled
    AppToast.show(this, "Danmaku Font Gradient Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v104.60: Subtitle Font Color Custom
internal fun PlayerActivity.showV104SubtitleFontColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v104subtitleFontColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v104subtitleFontColorCustom = value
        AppToast.show(this, "Subtitle Font Color Custom: $value")
    }
}

// v105.61: Audio Virtual Surround Custom
internal fun PlayerActivity.showV105AudioVirtualSurroundCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v105audioVirtualSurroundCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Virtual Surround Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105audioVirtualSurroundCustom = value
        AppToast.show(this, "Audio Virtual Surround Custom: $value")
    }
}

// v105.62: Danmaku Font Gradient Start
internal fun PlayerActivity.showV105DanmakuFontGradientStartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105danmakuFontGradientStart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Gradient Start",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105danmakuFontGradientStart = value
        AppToast.show(this, "Danmaku Font Gradient Start: $value")
    }
}

// v105.63: Subtitle Font Alpha Custom
internal fun PlayerActivity.showV105SubtitleFontAlphaCustomDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v105subtitleFontAlphaCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Alpha Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105subtitleFontAlphaCustom = value
        AppToast.show(this, "Subtitle Font Alpha Custom: $value")
    }
}

// v105.64: Gesture Quick Seek Distance
internal fun PlayerActivity.showV105GestureQuickSeekDistanceDialog() {
    val options = listOf(5, 10, 15, 20, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v105gestureQuickSeekDistance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Quick Seek Distance",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105gestureQuickSeekDistance = value
        AppToast.show(this, "Gesture Quick Seek Distance: $value")
    }
}

// v105.65: Cast Video Color Space
internal fun PlayerActivity.showV105CastVideoColorSpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105castVideoColorSpace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Color Space",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105castVideoColorSpace = value
        AppToast.show(this, "Cast Video Color Space: $value")
    }
}

// v105.66: Playlist Auto Sort By Popular
internal fun PlayerActivity.showV105PlaylistAutoSortByPopularToggle() {
    val enabled = !BiliClient.prefs.v105playlistAutoSortByPopular
    BiliClient.prefs.v105playlistAutoSortByPopular = enabled
    AppToast.show(this, "Playlist Auto Sort By Popular: ${if (enabled) "ON" else "OFF"}")
}

// v105.67: Cache Audio Only Mode
internal fun PlayerActivity.showV105CacheAudioOnlyModeToggle() {
    val enabled = !BiliClient.prefs.v105cacheAudioOnlyMode
    BiliClient.prefs.v105cacheAudioOnlyMode = enabled
    AppToast.show(this, "Cache Audio Only Mode: ${if (enabled) "ON" else "OFF"}")
}

// v105.68: Progress Bar Custom Scale
internal fun PlayerActivity.showV105ProgressBarCustomScaleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105progressBarCustomScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105progressBarCustomScale = value
        AppToast.show(this, "Progress Bar Custom Scale: $value")
    }
}

// v105.69: Volume Headphone Optimize
internal fun PlayerActivity.showV105VolumeHeadphoneOptimizeToggle() {
    val enabled = !BiliClient.prefs.v105volumeHeadphoneOptimize
    BiliClient.prefs.v105volumeHeadphoneOptimize = enabled
    AppToast.show(this, "Volume Headphone Optimize: ${if (enabled) "ON" else "OFF"}")
}

// v105.70: History Multi Select Mode
internal fun PlayerActivity.showV105HistoryMultiSelectModeToggle() {
    val enabled = !BiliClient.prefs.v105historyMultiSelectMode
    BiliClient.prefs.v105historyMultiSelectMode = enabled
    AppToast.show(this, "History Multi Select Mode: ${if (enabled) "ON" else "OFF"}")
}

// v105.71: Playback AB Loop Beat Sync
internal fun PlayerActivity.showV105PlaybackABLoopBeatSyncToggle() {
    val enabled = !BiliClient.prefs.v105playbackABLoopBeatSync
    BiliClient.prefs.v105playbackABLoopBeatSync = enabled
    AppToast.show(this, "Playback AB Loop Beat Sync: ${if (enabled) "ON" else "OFF"}")
}

// v105.72: Screenshot Auto Watermark
internal fun PlayerActivity.showV105ScreenshotAutoWatermarkToggle() {
    val enabled = !BiliClient.prefs.v105screenshotAutoWatermark
    BiliClient.prefs.v105screenshotAutoWatermark = enabled
    AppToast.show(this, "Screenshot Auto Watermark: ${if (enabled) "ON" else "OFF"}")
}

// v105.73: Video Rotate Custom
internal fun PlayerActivity.showV105VideoRotateCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105videoRotateCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105videoRotateCustom = value
        AppToast.show(this, "Video Rotate Custom: $value")
    }
}

// v105.74: Danmaku Font Gradient End
internal fun PlayerActivity.showV105DanmakuFontGradientEndDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v105danmakuFontGradientEnd).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Gradient End",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105danmakuFontGradientEnd = value
        AppToast.show(this, "Danmaku Font Gradient End: $value")
    }
}

// v105.75: Subtitle Font Stroke Width
internal fun PlayerActivity.showV105SubtitleFontStrokeWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v105subtitleFontStrokeWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stroke Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v105subtitleFontStrokeWidth = value
        AppToast.show(this, "Subtitle Font Stroke Width: $value")
    }
}

// v106.76: Audio Compressor Threshold
internal fun PlayerActivity.showV106AudioCompressorThresholdDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v106audioCompressorThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106audioCompressorThreshold = value
        AppToast.show(this, "Audio Compressor Threshold: $value")
    }
}

// v106.77: Danmaku Font Gradient Angle
internal fun PlayerActivity.showV106DanmakuFontGradientAngleDialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v106danmakuFontGradientAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Gradient Angle",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106danmakuFontGradientAngle = value
        AppToast.show(this, "Danmaku Font Gradient Angle: $value")
    }
}

// v106.78: Subtitle Font Stroke Color
internal fun PlayerActivity.showV106SubtitleFontStrokeColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106subtitleFontStrokeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stroke Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106subtitleFontStrokeColor = value
        AppToast.show(this, "Subtitle Font Stroke Color: $value")
    }
}

// v106.79: Gesture Quick Volume Gesture
internal fun PlayerActivity.showV106GestureQuickVolumeGestureToggle() {
    val enabled = !BiliClient.prefs.v106gestureQuickVolumeGesture
    BiliClient.prefs.v106gestureQuickVolumeGesture = enabled
    AppToast.show(this, "Gesture Quick Volume Gesture: ${if (enabled) "ON" else "OFF"}")
}

// v106.80: Cast Video Frame Rate Limit
internal fun PlayerActivity.showV106CastVideoFrameRateLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106castVideoFrameRateLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Frame Rate Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106castVideoFrameRateLimit = value
        AppToast.show(this, "Cast Video Frame Rate Limit: $value")
    }
}

// v106.81: Playlist Auto Sort By Date New
internal fun PlayerActivity.showV106PlaylistAutoSortByDateNewToggle() {
    val enabled = !BiliClient.prefs.v106playlistAutoSortByDateNew
    BiliClient.prefs.v106playlistAutoSortByDateNew = enabled
    AppToast.show(this, "Playlist Auto Sort By Date New: ${if (enabled) "ON" else "OFF"}")
}

// v106.82: Cache Partial Download Toggle
internal fun PlayerActivity.showV106CachePartialDownloadToggleToggle() {
    val enabled = !BiliClient.prefs.v106cachePartialDownloadToggle
    BiliClient.prefs.v106cachePartialDownloadToggle = enabled
    AppToast.show(this, "Cache Partial Download Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v106.83: Progress Bar Custom Height
internal fun PlayerActivity.showV106ProgressBarCustomHeightDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v106progressBarCustomHeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Height",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106progressBarCustomHeight = value
        AppToast.show(this, "Progress Bar Custom Height: $value")
    }
}

// v106.84: Volume Bluetooth Codec
internal fun PlayerActivity.showV106VolumeBluetoothCodecDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106volumeBluetoothCodec).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Bluetooth Codec",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106volumeBluetoothCodec = value
        AppToast.show(this, "Volume Bluetooth Codec: $value")
    }
}

// v106.85: History Filter By Type
internal fun PlayerActivity.showV106HistoryFilterByTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106historyFilterByType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Filter By Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106historyFilterByType = value
        AppToast.show(this, "History Filter By Type: $value")
    }
}

// v106.86: Playback AB Loop Crossfade
internal fun PlayerActivity.showV106PlaybackABLoopCrossfadeToggle() {
    val enabled = !BiliClient.prefs.v106playbackABLoopCrossfade
    BiliClient.prefs.v106playbackABLoopCrossfade = enabled
    AppToast.show(this, "Playback AB Loop Crossfade: ${if (enabled) "ON" else "OFF"}")
}

// v106.87: Screenshot Auto Compress
internal fun PlayerActivity.showV106ScreenshotAutoCompressToggle() {
    val enabled = !BiliClient.prefs.v106screenshotAutoCompress
    BiliClient.prefs.v106screenshotAutoCompress = enabled
    AppToast.show(this, "Screenshot Auto Compress: ${if (enabled) "ON" else "OFF"}")
}

// v106.88: Video Stretch Custom
internal fun PlayerActivity.showV106VideoStretchCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106videoStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106videoStretchCustom = value
        AppToast.show(this, "Video Stretch Custom: $value")
    }
}

// v106.89: Danmaku Font Texture Custom
internal fun PlayerActivity.showV106DanmakuFontTextureCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106danmakuFontTextureCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Texture Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106danmakuFontTextureCustom = value
        AppToast.show(this, "Danmaku Font Texture Custom: $value")
    }
}

// v106.90: Subtitle Font Shadow Color
internal fun PlayerActivity.showV106SubtitleFontShadowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v106subtitleFontShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v106subtitleFontShadowColor = value
        AppToast.show(this, "Subtitle Font Shadow Color: $value")
    }
}

// v107.91: Audio Compressor Ratio
internal fun PlayerActivity.showV107AudioCompressorRatioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107audioCompressorRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107audioCompressorRatio = value
        AppToast.show(this, "Audio Compressor Ratio: $value")
    }
}

// v107.92: Danmaku Font Fade Edge Size
internal fun PlayerActivity.showV107DanmakuFontFadeEdgeSizeDialog() {
    val options = listOf(5, 10, 15, 20, 25)
    val currentIndex = options.indexOf(BiliClient.prefs.v107danmakuFontFadeEdgeSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Fade Edge Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107danmakuFontFadeEdgeSize = value
        AppToast.show(this, "Danmaku Font Fade Edge Size: $value")
    }
}

// v107.93: Subtitle Font Shadow Radius
internal fun PlayerActivity.showV107SubtitleFontShadowRadiusDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v107subtitleFontShadowRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107subtitleFontShadowRadius = value
        AppToast.show(this, "Subtitle Font Shadow Radius: $value")
    }
}

// v107.94: Gesture Quick Bright Gesture
internal fun PlayerActivity.showV107GestureQuickBrightGestureToggle() {
    val enabled = !BiliClient.prefs.v107gestureQuickBrightGesture
    BiliClient.prefs.v107gestureQuickBrightGesture = enabled
    AppToast.show(this, "Gesture Quick Bright Gesture: ${if (enabled) "ON" else "OFF"}")
}

// v107.95: Cast Video Deinterlace Mode
internal fun PlayerActivity.showV107CastVideoDeinterlaceModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107castVideoDeinterlaceMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Deinterlace Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107castVideoDeinterlaceMode = value
        AppToast.show(this, "Cast Video Deinterlace Mode: $value")
    }
}

// v107.96: Playlist Auto Sort By Duration
internal fun PlayerActivity.showV107PlaylistAutoSortByDurationToggle() {
    val enabled = !BiliClient.prefs.v107playlistAutoSortByDuration
    BiliClient.prefs.v107playlistAutoSortByDuration = enabled
    AppToast.show(this, "Playlist Auto Sort By Duration: ${if (enabled) "ON" else "OFF"}")
}

// v107.97: Cache P2P Download Toggle
internal fun PlayerActivity.showV107CacheP2PDownloadToggleToggle() {
    val enabled = !BiliClient.prefs.v107cacheP2PDownloadToggle
    BiliClient.prefs.v107cacheP2PDownloadToggle = enabled
    AppToast.show(this, "Cache P2P Download Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v107.98: Progress Bar Custom Margin
internal fun PlayerActivity.showV107ProgressBarCustomMarginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107progressBarCustomMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107progressBarCustomMargin = value
        AppToast.show(this, "Progress Bar Custom Margin: $value")
    }
}

// v107.99: Volume USB DAC Compatibility
internal fun PlayerActivity.showV107VolumeUSBDACompatibilityToggle() {
    val enabled = !BiliClient.prefs.v107volumeUSBDACompatibility
    BiliClient.prefs.v107volumeUSBDACompatibility = enabled
    AppToast.show(this, "Volume USB DAC Compatibility: ${if (enabled) "ON" else "OFF"}")
}

// v107.100: History Filter By Duration
internal fun PlayerActivity.showV107HistoryFilterByDurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107historyFilterByDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Filter By Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107historyFilterByDuration = value
        AppToast.show(this, "History Filter By Duration: $value")
    }
}

// v107.101: Playback AB Loop Pitch Shift
internal fun PlayerActivity.showV107PlaybackABLoopPitchShiftToggle() {
    val enabled = !BiliClient.prefs.v107playbackABLoopPitchShift
    BiliClient.prefs.v107playbackABLoopPitchShift = enabled
    AppToast.show(this, "Playback AB Loop Pitch Shift: ${if (enabled) "ON" else "OFF"}")
}

// v107.102: Screenshot Auto Share After
internal fun PlayerActivity.showV107ScreenshotAutoShareAfterToggle() {
    val enabled = !BiliClient.prefs.v107screenshotAutoShareAfter
    BiliClient.prefs.v107screenshotAutoShareAfter = enabled
    AppToast.show(this, "Screenshot Auto Share After: ${if (enabled) "ON" else "OFF"}")
}

// v107.103: Video Crop Custom
internal fun PlayerActivity.showV107VideoCropCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107videoCropCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107videoCropCustom = value
        AppToast.show(this, "Video Crop Custom: $value")
    }
}

// v107.104: Danmaku Font Fade Style
internal fun PlayerActivity.showV107DanmakuFontFadeStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v107danmakuFontFadeStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Fade Style",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107danmakuFontFadeStyle = value
        AppToast.show(this, "Danmaku Font Fade Style: $value")
    }
}

// v107.105: Subtitle Font Shadow Offset X
internal fun PlayerActivity.showV107SubtitleFontShadowOffsetXDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v107subtitleFontShadowOffsetX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Offset X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v107subtitleFontShadowOffsetX = value
        AppToast.show(this, "Subtitle Font Shadow Offset X: $value")
    }
}

// v108.106: Audio Compressor Attack Time
internal fun PlayerActivity.showV108AudioCompressorAttackTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v108audioCompressorAttackTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Attack Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108audioCompressorAttackTime = value
        AppToast.show(this, "Audio Compressor Attack Time: $value")
    }
}

// v108.107: Danmaku Font BG Gradient Toggle
internal fun PlayerActivity.showV108DanmakuFontBgGradientToggleToggle() {
    val enabled = !BiliClient.prefs.v108danmakuFontBgGradientToggle
    BiliClient.prefs.v108danmakuFontBgGradientToggle = enabled
    AppToast.show(this, "Danmaku Font BG Gradient Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v108.108: Subtitle Font Shadow Offset Y
internal fun PlayerActivity.showV108SubtitleFontShadowOffsetYDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v108subtitleFontShadowOffsetY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Shadow Offset Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108subtitleFontShadowOffsetY = value
        AppToast.show(this, "Subtitle Font Shadow Offset Y: $value")
    }
}

// v108.109: Gesture Quick Lock Screen
internal fun PlayerActivity.showV108GestureQuickLockScreenToggle() {
    val enabled = !BiliClient.prefs.v108gestureQuickLockScreen
    BiliClient.prefs.v108gestureQuickLockScreen = enabled
    AppToast.show(this, "Gesture Quick Lock Screen: ${if (enabled) "ON" else "OFF"}")
}

// v108.110: Cast Video Scaling Mode
internal fun PlayerActivity.showV108CastVideoScalingModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v108castVideoScalingMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Scaling Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108castVideoScalingMode = value
        AppToast.show(this, "Cast Video Scaling Mode: $value")
    }
}

// v108.111: Playlist Auto Sort By Views
internal fun PlayerActivity.showV108PlaylistAutoSortByViewsToggle() {
    val enabled = !BiliClient.prefs.v108playlistAutoSortByViews
    BiliClient.prefs.v108playlistAutoSortByViews = enabled
    AppToast.show(this, "Playlist Auto Sort By Views: ${if (enabled) "ON" else "OFF"}")
}

// v108.112: Cache Proxy Mode Custom
internal fun PlayerActivity.showV108CacheProxyModeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v108cacheProxyModeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Proxy Mode Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108cacheProxyModeCustom = value
        AppToast.show(this, "Cache Proxy Mode Custom: $value")
    }
}

// v108.113: Progress Bar Custom Opacity
internal fun PlayerActivity.showV108ProgressBarCustomOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v108progressBarCustomOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108progressBarCustomOpacity = value
        AppToast.show(this, "Progress Bar Custom Opacity: $value")
    }
}

// v108.114: Volume Speaker Phone Toggle
internal fun PlayerActivity.showV108VolumeSpeakerPhoneToggleToggle() {
    val enabled = !BiliClient.prefs.v108volumeSpeakerPhoneToggle
    BiliClient.prefs.v108volumeSpeakerPhoneToggle = enabled
    AppToast.show(this, "Volume Speaker Phone Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v108.115: History Filter By Date
internal fun PlayerActivity.showV108HistoryFilterByDateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v108historyFilterByDate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Filter By Date",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108historyFilterByDate = value
        AppToast.show(this, "History Filter By Date: $value")
    }
}

// v108.116: Playback AB Loop Tempo Sync
internal fun PlayerActivity.showV108PlaybackABLoopTempoSyncToggle() {
    val enabled = !BiliClient.prefs.v108playbackABLoopTempoSync
    BiliClient.prefs.v108playbackABLoopTempoSync = enabled
    AppToast.show(this, "Playback AB Loop Tempo Sync: ${if (enabled) "ON" else "OFF"}")
}

// v108.117: Screenshot Album Auto Create
internal fun PlayerActivity.showV108ScreenshotAlbumAutoCreateToggle() {
    val enabled = !BiliClient.prefs.v108screenshotAlbumAutoCreate
    BiliClient.prefs.v108screenshotAlbumAutoCreate = enabled
    AppToast.show(this, "Screenshot Album Auto Create: ${if (enabled) "ON" else "OFF"}")
}

// v108.118: Video Zoom Custom
internal fun PlayerActivity.showV108VideoZoomCustomDialog() {
    val options = listOf(100, 125, 150, 175, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v108videoZoomCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Zoom Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108videoZoomCustom = value
        AppToast.show(this, "Video Zoom Custom: $value")
    }
}

// v108.119: Danmaku Font BG Gradient Type
internal fun PlayerActivity.showV108DanmakuFontBgGradientTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v108danmakuFontBgGradientType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Gradient Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v108danmakuFontBgGradientType = value
        AppToast.show(this, "Danmaku Font BG Gradient Type: $value")
    }
}

// v108.120: Subtitle Font Bold Toggle108
internal fun PlayerActivity.showV108SubtitleFontBoldToggle108Toggle() {
    val enabled = !BiliClient.prefs.v108subtitleFontBoldToggle108
    BiliClient.prefs.v108subtitleFontBoldToggle108 = enabled
    AppToast.show(this, "Subtitle Font Bold Toggle108: ${if (enabled) "ON" else "OFF"}")
}

// v109.121: Audio Compressor Release Time
internal fun PlayerActivity.showV109AudioCompressorReleaseTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v109audioCompressorReleaseTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Release Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109audioCompressorReleaseTime = value
        AppToast.show(this, "Audio Compressor Release Time: $value")
    }
}

// v109.122: Danmaku Font BG Gradient Angle
internal fun PlayerActivity.showV109DanmakuFontBgGradientAngleDialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v109danmakuFontBgGradientAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Gradient Angle",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109danmakuFontBgGradientAngle = value
        AppToast.show(this, "Danmaku Font BG Gradient Angle: $value")
    }
}

// v109.123: Subtitle Font Italic Toggle109
internal fun PlayerActivity.showV109SubtitleFontItalicToggle109Toggle() {
    val enabled = !BiliClient.prefs.v109subtitleFontItalicToggle109
    BiliClient.prefs.v109subtitleFontItalicToggle109 = enabled
    AppToast.show(this, "Subtitle Font Italic Toggle109: ${if (enabled) "ON" else "OFF"}")
}

// v109.124: Gesture Quick Screenshot
internal fun PlayerActivity.showV109GestureQuickScreenshotToggle() {
    val enabled = !BiliClient.prefs.v109gestureQuickScreenshot
    BiliClient.prefs.v109gestureQuickScreenshot = enabled
    AppToast.show(this, "Gesture Quick Screenshot: ${if (enabled) "ON" else "OFF"}")
}

// v109.125: Cast Video Hardware Decoding
internal fun PlayerActivity.showV109CastVideoHardwareDecodingToggle() {
    val enabled = !BiliClient.prefs.v109castVideoHardwareDecoding
    BiliClient.prefs.v109castVideoHardwareDecoding = enabled
    AppToast.show(this, "Cast Video Hardware Decoding: ${if (enabled) "ON" else "OFF"}")
}

// v109.126: Playlist Auto Sort By Rating
internal fun PlayerActivity.showV109PlaylistAutoSortByRatingToggle() {
    val enabled = !BiliClient.prefs.v109playlistAutoSortByRating
    BiliClient.prefs.v109playlistAutoSortByRating = enabled
    AppToast.show(this, "Playlist Auto Sort By Rating: ${if (enabled) "ON" else "OFF"}")
}

// v109.127: Cache Clean On App Exit
internal fun PlayerActivity.showV109CacheCleanOnAppExitToggle() {
    val enabled = !BiliClient.prefs.v109cacheCleanOnAppExit
    BiliClient.prefs.v109cacheCleanOnAppExit = enabled
    AppToast.show(this, "Cache Clean On App Exit: ${if (enabled) "ON" else "OFF"}")
}

// v109.128: Progress Bar Custom Thumb Delay
internal fun PlayerActivity.showV109ProgressBarCustomThumbDelayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v109progressBarCustomThumbDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109progressBarCustomThumbDelay = value
        AppToast.show(this, "Progress Bar Custom Thumb Delay: $value")
    }
}

// v109.129: Volume Audio Focus Priority
internal fun PlayerActivity.showV109VolumeAudioFocusPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v109volumeAudioFocusPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Audio Focus Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109volumeAudioFocusPriority = value
        AppToast.show(this, "Volume Audio Focus Priority: $value")
    }
}

// v109.130: History Filter By Up
internal fun PlayerActivity.showV109HistoryFilterByUpDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v109historyFilterByUp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Filter By Up",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109historyFilterByUp = value
        AppToast.show(this, "History Filter By Up: $value")
    }
}

// v109.131: Playback AB Loop Preset Toggle
internal fun PlayerActivity.showV109PlaybackABLoopPresetToggleToggle() {
    val enabled = !BiliClient.prefs.v109playbackABLoopPresetToggle
    BiliClient.prefs.v109playbackABLoopPresetToggle = enabled
    AppToast.show(this, "Playback AB Loop Preset Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v109.132: Screenshot Crop Auto Ratio
internal fun PlayerActivity.showV109ScreenshotCropAutoRatioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v109screenshotCropAutoRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Crop Auto Ratio",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109screenshotCropAutoRatio = value
        AppToast.show(this, "Screenshot Crop Auto Ratio: $value")
    }
}

// v109.133: Video Blur Background Custom
internal fun PlayerActivity.showV109VideoBlurBackgroundCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v109videoBlurBackgroundCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Blur Background Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109videoBlurBackgroundCustom = value
        AppToast.show(this, "Video Blur Background Custom: $value")
    }
}

// v109.134: Danmaku Font BG Gradient Opacity
internal fun PlayerActivity.showV109DanmakuFontBgGradientOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v109danmakuFontBgGradientOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Gradient Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v109danmakuFontBgGradientOpacity = value
        AppToast.show(this, "Danmaku Font BG Gradient Opacity: $value")
    }
}

// v109.135: Subtitle Font Underline109
internal fun PlayerActivity.showV109SubtitleFontUnderline109Toggle() {
    val enabled = !BiliClient.prefs.v109subtitleFontUnderline109
    BiliClient.prefs.v109subtitleFontUnderline109 = enabled
    AppToast.show(this, "Subtitle Font Underline109: ${if (enabled) "ON" else "OFF"}")
}

// v110.136: Audio Limiter Threshold
internal fun PlayerActivity.showV110AudioLimiterThresholdDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v110audioLimiterThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Limiter Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110audioLimiterThreshold = value
        AppToast.show(this, "Audio Limiter Threshold: $value")
    }
}

// v110.137: Danmaku Font Texture Blend Mode
internal fun PlayerActivity.showV110DanmakuFontTextureBlendModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v110danmakuFontTextureBlendMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Texture Blend Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110danmakuFontTextureBlendMode = value
        AppToast.show(this, "Danmaku Font Texture Blend Mode: $value")
    }
}

// v110.138: Subtitle Font Strike Through110
internal fun PlayerActivity.showV110SubtitleFontStrikeThrough110Toggle() {
    val enabled = !BiliClient.prefs.v110subtitleFontStrikeThrough110
    BiliClient.prefs.v110subtitleFontStrikeThrough110 = enabled
    AppToast.show(this, "Subtitle Font Strike Through110: ${if (enabled) "ON" else "OFF"}")
}

// v110.139: Gesture Quick Speed Toggle
internal fun PlayerActivity.showV110GestureQuickSpeedToggleToggle() {
    val enabled = !BiliClient.prefs.v110gestureQuickSpeedToggle
    BiliClient.prefs.v110gestureQuickSpeedToggle = enabled
    AppToast.show(this, "Gesture Quick Speed Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v110.140: Cast Video Software Decoding
internal fun PlayerActivity.showV110CastVideoSoftwareDecodingToggle() {
    val enabled = !BiliClient.prefs.v110castVideoSoftwareDecoding
    BiliClient.prefs.v110castVideoSoftwareDecoding = enabled
    AppToast.show(this, "Cast Video Software Decoding: ${if (enabled) "ON" else "OFF"}")
}

// v110.141: Playlist Auto Sort By Bilingual
internal fun PlayerActivity.showV110PlaylistAutoSortByBilingualToggle() {
    val enabled = !BiliClient.prefs.v110playlistAutoSortByBilingual
    BiliClient.prefs.v110playlistAutoSortByBilingual = enabled
    AppToast.show(this, "Playlist Auto Sort By Bilingual: ${if (enabled) "ON" else "OFF"}")
}

// v110.142: Cache Clean On Low Battery
internal fun PlayerActivity.showV110CacheCleanOnLowBatteryToggle() {
    val enabled = !BiliClient.prefs.v110cacheCleanOnLowBattery
    BiliClient.prefs.v110cacheCleanOnLowBattery = enabled
    AppToast.show(this, "Cache Clean On Low Battery: ${if (enabled) "ON" else "OFF"}")
}

// v110.143: Progress Bar Custom Thumb Scale
internal fun PlayerActivity.showV110ProgressBarCustomThumbScaleDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v110progressBarCustomThumbScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110progressBarCustomThumbScale = value
        AppToast.show(this, "Progress Bar Custom Thumb Scale: $value")
    }
}

// v110.144: Volume Audio Focus Duck
internal fun PlayerActivity.showV110VolumeAudioFocusDuckToggle() {
    val enabled = !BiliClient.prefs.v110volumeAudioFocusDuck
    BiliClient.prefs.v110volumeAudioFocusDuck = enabled
    AppToast.show(this, "Volume Audio Focus Duck: ${if (enabled) "ON" else "OFF"}")
}

// v110.145: History Filter By Season
internal fun PlayerActivity.showV110HistoryFilterBySeasonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v110historyFilterBySeason).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Filter By Season",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110historyFilterBySeason = value
        AppToast.show(this, "History Filter By Season: $value")
    }
}

// v110.146: Playback AB Loop Export Wav
internal fun PlayerActivity.showV110PlaybackABLoopExportWavToggle() {
    val enabled = !BiliClient.prefs.v110playbackABLoopExportWav
    BiliClient.prefs.v110playbackABLoopExportWav = enabled
    AppToast.show(this, "Playback AB Loop Export Wav: ${if (enabled) "ON" else "OFF"}")
}

// v110.147: Screenshot Delay Timer
internal fun PlayerActivity.showV110ScreenshotDelayTimerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v110screenshotDelayTimer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Delay Timer",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110screenshotDelayTimer = value
        AppToast.show(this, "Screenshot Delay Timer: $value")
    }
}

// v110.148: Video Ambient Light Custom
internal fun PlayerActivity.showV110VideoAmbientLightCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v110videoAmbientLightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Ambient Light Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110videoAmbientLightCustom = value
        AppToast.show(this, "Video Ambient Light Custom: $value")
    }
}

// v110.149: Danmaku Font Texture Pattern Custom
internal fun PlayerActivity.showV110DanmakuFontTexturePatternCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v110danmakuFontTexturePatternCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Texture Pattern Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110danmakuFontTexturePatternCustom = value
        AppToast.show(this, "Danmaku Font Texture Pattern Custom: $value")
    }
}

// v110.150: Subtitle Font Case Override110
internal fun PlayerActivity.showV110SubtitleFontCaseOverride110Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v110subtitleFontCaseOverride110).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Case Override110",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v110subtitleFontCaseOverride110 = value
        AppToast.show(this, "Subtitle Font Case Override110: $value")
    }
}

// v111.1: Audio Delay Sync Custom
internal fun PlayerActivity.showV111AudioDelaySyncCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v111audioDelaySyncCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Sync Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111audioDelaySyncCustom = value
        AppToast.show(this, "Audio Delay Sync Custom: $value")
    }
}

// v111.2: Danmaku Font Blur Toggle111
internal fun PlayerActivity.showV111DanmakuFontBlurToggle111Toggle() {
    val enabled = !BiliClient.prefs.v111danmakuFontBlurToggle111
    BiliClient.prefs.v111danmakuFontBlurToggle111 = enabled
    AppToast.show(this, "Danmaku Font Blur Toggle111: ${if (enabled) "ON" else "OFF"}")
}

// v111.3: Subtitle BG Shadow Size
internal fun PlayerActivity.showV111SubtitleBgShadowSizeDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v111subtitleBgShadowSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Shadow Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111subtitleBgShadowSize = value
        AppToast.show(this, "Subtitle BG Shadow Size: $value")
    }
}

// v111.4: Gesture Tap Seek Step
internal fun PlayerActivity.showV111GestureTapSeekStepDialog() {
    val options = listOf(3, 5, 10, 15, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v111gestureTapSeekStep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Seek Step",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111gestureTapSeekStep = value
        AppToast.show(this, "Gesture Tap Seek Step: $value")
    }
}

// v111.5: Cast Video Saturation Custom
internal fun PlayerActivity.showV111CastVideoSaturationCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v111castVideoSaturationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Saturation Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111castVideoSaturationCustom = value
        AppToast.show(this, "Cast Video Saturation Custom: $value")
    }
}

// v111.6: Playlist Auto Shuffle On Repeat
internal fun PlayerActivity.showV111PlaylistAutoShuffleOnRepeatToggle() {
    val enabled = !BiliClient.prefs.v111playlistAutoShuffleOnRepeat
    BiliClient.prefs.v111playlistAutoShuffleOnRepeat = enabled
    AppToast.show(this, "Playlist Auto Shuffle On Repeat: ${if (enabled) "ON" else "OFF"}")
}

// v111.7: Cache Download Bandwidth Limit
internal fun PlayerActivity.showV111CacheDownloadBandwidthLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v111cacheDownloadBandwidthLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Bandwidth Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111cacheDownloadBandwidthLimit = value
        AppToast.show(this, "Cache Download Bandwidth Limit: $value")
    }
}

// v111.8: Progress Bar Custom Buffer Color
internal fun PlayerActivity.showV111ProgressBarCustomBufferColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v111progressBarCustomBufferColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Buffer Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111progressBarCustomBufferColor = value
        AppToast.show(this, "Progress Bar Custom Buffer Color: $value")
    }
}

// v111.9: Volume Loudness Target
internal fun PlayerActivity.showV111VolumeLoudnessTargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v111volumeLoudnessTarget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Loudness Target",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111volumeLoudnessTarget = value
        AppToast.show(this, "Volume Loudness Target: $value")
    }
}

// v111.10: History Auto Backup Toggle111
internal fun PlayerActivity.showV111HistoryAutoBackupToggle111Toggle() {
    val enabled = !BiliClient.prefs.v111historyAutoBackupToggle111
    BiliClient.prefs.v111historyAutoBackupToggle111 = enabled
    AppToast.show(this, "History Auto Backup Toggle111: ${if (enabled) "ON" else "OFF"}")
}

// v111.11: Playback Speed Auto Adjust
internal fun PlayerActivity.showV111PlaybackSpeedAutoAdjustToggle() {
    val enabled = !BiliClient.prefs.v111playbackSpeedAutoAdjust
    BiliClient.prefs.v111playbackSpeedAutoAdjust = enabled
    AppToast.show(this, "Playback Speed Auto Adjust: ${if (enabled) "ON" else "OFF"}")
}

// v111.12: Screenshot Auto Share Weibo
internal fun PlayerActivity.showV111ScreenshotAutoShareWeiboToggle() {
    val enabled = !BiliClient.prefs.v111screenshotAutoShareWeibo
    BiliClient.prefs.v111screenshotAutoShareWeibo = enabled
    AppToast.show(this, "Screenshot Auto Share Weibo: ${if (enabled) "ON" else "OFF"}")
}

// v111.13: Video Blend Mode Custom
internal fun PlayerActivity.showV111VideoBlendModeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v111videoBlendModeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Blend Mode Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v111videoBlendModeCustom = value
        AppToast.show(this, "Video Blend Mode Custom: $value")
    }
}

// v111.14: Danmaku Font Drop Shadow Toggle
internal fun PlayerActivity.showV111DanmakuFontDropShadowToggleToggle() {
    val enabled = !BiliClient.prefs.v111danmakuFontDropShadowToggle
    BiliClient.prefs.v111danmakuFontDropShadowToggle = enabled
    AppToast.show(this, "Danmaku Font Drop Shadow Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v111.15: Subtitle BG Border Color Auto
internal fun PlayerActivity.showV111SubtitleBgBorderColorAutoToggle() {
    val enabled = !BiliClient.prefs.v111subtitleBgBorderColorAuto
    BiliClient.prefs.v111subtitleBgBorderColorAuto = enabled
    AppToast.show(this, "Subtitle BG Border Color Auto: ${if (enabled) "ON" else "OFF"}")
}

// v112.16: Audio Crossfeed Toggle112
internal fun PlayerActivity.showV112AudioCrossfeedToggle112Toggle() {
    val enabled = !BiliClient.prefs.v112audioCrossfeedToggle112
    BiliClient.prefs.v112audioCrossfeedToggle112 = enabled
    AppToast.show(this, "Audio Crossfeed Toggle112: ${if (enabled) "ON" else "OFF"}")
}

// v112.17: Danmaku Font Drop Shadow X
internal fun PlayerActivity.showV112DanmakuFontDropShadowXDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v112danmakuFontDropShadowX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Drop Shadow X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112danmakuFontDropShadowX = value
        AppToast.show(this, "Danmaku Font Drop Shadow X: $value")
    }
}

// v112.18: Subtitle BG Border Color Contrast
internal fun PlayerActivity.showV112SubtitleBgBorderColorContrastDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v112subtitleBgBorderColorContrast).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Color Contrast",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112subtitleBgBorderColorContrast = value
        AppToast.show(this, "Subtitle BG Border Color Contrast: $value")
    }
}

// v112.19: Gesture Tap Volume Step
internal fun PlayerActivity.showV112GestureTapVolumeStepDialog() {
    val options = listOf(3, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v112gestureTapVolumeStep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Volume Step",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112gestureTapVolumeStep = value
        AppToast.show(this, "Gesture Tap Volume Step: $value")
    }
}

// v112.20: Cast Video Contrast Custom
internal fun PlayerActivity.showV112CastVideoContrastCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v112castVideoContrastCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Contrast Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112castVideoContrastCustom = value
        AppToast.show(this, "Cast Video Contrast Custom: $value")
    }
}

// v112.21: Playlist Auto Next On Wifi
internal fun PlayerActivity.showV112PlaylistAutoNextOnWifiToggle() {
    val enabled = !BiliClient.prefs.v112playlistAutoNextOnWifi
    BiliClient.prefs.v112playlistAutoNextOnWifi = enabled
    AppToast.show(this, "Playlist Auto Next On Wifi: ${if (enabled) "ON" else "OFF"}")
}

// v112.22: Cache Smart Prefetch Toggle112
internal fun PlayerActivity.showV112CacheSmartPrefetchToggle112Toggle() {
    val enabled = !BiliClient.prefs.v112cacheSmartPrefetchToggle112
    BiliClient.prefs.v112cacheSmartPrefetchToggle112 = enabled
    AppToast.show(this, "Cache Smart Prefetch Toggle112: ${if (enabled) "ON" else "OFF"}")
}

// v112.23: Progress Bar Custom Chapter Style
internal fun PlayerActivity.showV112ProgressBarCustomChapterStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v112progressBarCustomChapterStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Chapter Style",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112progressBarCustomChapterStyle = value
        AppToast.show(this, "Progress Bar Custom Chapter Style: $value")
    }
}

// v112.24: Volume Dynamic Range Control
internal fun PlayerActivity.showV112VolumeDynamicRangeControlToggle() {
    val enabled = !BiliClient.prefs.v112volumeDynamicRangeControl
    BiliClient.prefs.v112volumeDynamicRangeControl = enabled
    AppToast.show(this, "Volume Dynamic Range Control: ${if (enabled) "ON" else "OFF"}")
}

// v112.25: History Auto Backup Interval
internal fun PlayerActivity.showV112HistoryAutoBackupIntervalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v112historyAutoBackupInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Backup Interval",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112historyAutoBackupInterval = value
        AppToast.show(this, "History Auto Backup Interval: $value")
    }
}

// v112.26: Playback Speed Auto Adjust Range
internal fun PlayerActivity.showV112PlaybackSpeedAutoAdjustRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v112playbackSpeedAutoAdjustRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Auto Adjust Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112playbackSpeedAutoAdjustRange = value
        AppToast.show(this, "Playback Speed Auto Adjust Range: $value")
    }
}

// v112.27: Screenshot Auto Share Twitter
internal fun PlayerActivity.showV112ScreenshotAutoShareTwitterToggle() {
    val enabled = !BiliClient.prefs.v112screenshotAutoShareTwitter
    BiliClient.prefs.v112screenshotAutoShareTwitter = enabled
    AppToast.show(this, "Screenshot Auto Share Twitter: ${if (enabled) "ON" else "OFF"}")
}

// v112.28: Video Color LUT Custom
internal fun PlayerActivity.showV112VideoColorLUTCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v112videoColorLUTCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color LUT Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112videoColorLUTCustom = value
        AppToast.show(this, "Video Color LUT Custom: $value")
    }
}

// v112.29: Danmaku Font Drop Shadow Y
internal fun PlayerActivity.showV112DanmakuFontDropShadowYDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v112danmakuFontDropShadowY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Drop Shadow Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112danmakuFontDropShadowY = value
        AppToast.show(this, "Danmaku Font Drop Shadow Y: $value")
    }
}

// v112.30: Subtitle BG Border Color Auto Threshold
internal fun PlayerActivity.showV112SubtitleBgBorderColorAutoThresholdDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v112subtitleBgBorderColorAutoThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Color Auto Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v112subtitleBgBorderColorAutoThreshold = value
        AppToast.show(this, "Subtitle BG Border Color Auto Threshold: $value")
    }
}

// v113.31: Audio Crossfeed Strength
internal fun PlayerActivity.showV113AudioCrossfeedStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v113audioCrossfeedStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Crossfeed Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113audioCrossfeedStrength = value
        AppToast.show(this, "Audio Crossfeed Strength: $value")
    }
}

// v113.32: Danmaku Font Drop Shadow Blur
internal fun PlayerActivity.showV113DanmakuFontDropShadowBlurDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v113danmakuFontDropShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Drop Shadow Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113danmakuFontDropShadowBlur = value
        AppToast.show(this, "Danmaku Font Drop Shadow Blur: $value")
    }
}

// v113.33: Subtitle Font Weight Custom
internal fun PlayerActivity.showV113SubtitleFontWeightCustomDialog() {
    val options = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v113subtitleFontWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Weight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113subtitleFontWeightCustom = value
        AppToast.show(this, "Subtitle Font Weight Custom: $value")
    }
}

// v113.34: Gesture Tap Brightness Step
internal fun PlayerActivity.showV113GestureTapBrightnessStepDialog() {
    val options = listOf(3, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v113gestureTapBrightnessStep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Brightness Step",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113gestureTapBrightnessStep = value
        AppToast.show(this, "Gesture Tap Brightness Step: $value")
    }
}

// v113.35: Cast Video Brightness Custom
internal fun PlayerActivity.showV113CastVideoBrightnessCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v113castVideoBrightnessCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Brightness Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113castVideoBrightnessCustom = value
        AppToast.show(this, "Cast Video Brightness Custom: $value")
    }
}

// v113.36: Playlist Auto Play On Connect
internal fun PlayerActivity.showV113PlaylistAutoPlayOnConnectToggle() {
    val enabled = !BiliClient.prefs.v113playlistAutoPlayOnConnect
    BiliClient.prefs.v113playlistAutoPlayOnConnect = enabled
    AppToast.show(this, "Playlist Auto Play On Connect: ${if (enabled) "ON" else "OFF"}")
}

// v113.37: Cache Cleanup On Start Toggle113
internal fun PlayerActivity.showV113CacheCleanupOnStartToggle113Toggle() {
    val enabled = !BiliClient.prefs.v113cacheCleanupOnStartToggle113
    BiliClient.prefs.v113cacheCleanupOnStartToggle113 = enabled
    AppToast.show(this, "Cache Cleanup On Start Toggle113: ${if (enabled) "ON" else "OFF"}")
}

// v113.38: Progress Bar Custom Live Edge Style
internal fun PlayerActivity.showV113ProgressBarCustomLiveEdgeStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v113progressBarCustomLiveEdgeStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Live Edge Style",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113progressBarCustomLiveEdgeStyle = value
        AppToast.show(this, "Progress Bar Custom Live Edge Style: $value")
    }
}

// v113.39: Volume Auto Gain Compensation
internal fun PlayerActivity.showV113VolumeAutoGainCompensationToggle() {
    val enabled = !BiliClient.prefs.v113volumeAutoGainCompensation
    BiliClient.prefs.v113volumeAutoGainCompensation = enabled
    AppToast.show(this, "Volume Auto Gain Compensation: ${if (enabled) "ON" else "OFF"}")
}

// v113.40: History Auto Backup Cloud
internal fun PlayerActivity.showV113HistoryAutoBackupCloudToggle() {
    val enabled = !BiliClient.prefs.v113historyAutoBackupCloud
    BiliClient.prefs.v113historyAutoBackupCloud = enabled
    AppToast.show(this, "History Auto Backup Cloud: ${if (enabled) "ON" else "OFF"}")
}

// v113.41: Playback Speed Auto Adjust Silence
internal fun PlayerActivity.showV113PlaybackSpeedAutoAdjustSilenceToggle() {
    val enabled = !BiliClient.prefs.v113playbackSpeedAutoAdjustSilence
    BiliClient.prefs.v113playbackSpeedAutoAdjustSilence = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Silence: ${if (enabled) "ON" else "OFF"}")
}

// v113.42: Screenshot Auto Share Instagram
internal fun PlayerActivity.showV113ScreenshotAutoShareInstagramToggle() {
    val enabled = !BiliClient.prefs.v113screenshotAutoShareInstagram
    BiliClient.prefs.v113screenshotAutoShareInstagram = enabled
    AppToast.show(this, "Screenshot Auto Share Instagram: ${if (enabled) "ON" else "OFF"}")
}

// v113.43: Video Color Temperature Custom113
internal fun PlayerActivity.showV113VideoColorTemperatureCustom113Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v113videoColorTemperatureCustom113).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Temperature Custom113",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113videoColorTemperatureCustom113 = value
        AppToast.show(this, "Video Color Temperature Custom113: $value")
    }
}

// v113.44: Danmaku Font Drop Shadow Color
internal fun PlayerActivity.showV113DanmakuFontDropShadowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v113danmakuFontDropShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Drop Shadow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113danmakuFontDropShadowColor = value
        AppToast.show(this, "Danmaku Font Drop Shadow Color: $value")
    }
}

// v113.45: Subtitle Font Stretch Custom
internal fun PlayerActivity.showV113SubtitleFontStretchCustomDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v113subtitleFontStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v113subtitleFontStretchCustom = value
        AppToast.show(this, "Subtitle Font Stretch Custom: $value")
    }
}

// v114.46: Audio Dynamic Bass Boost
internal fun PlayerActivity.showV114AudioDynamicBassBoostDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v114audioDynamicBassBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Bass Boost",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114audioDynamicBassBoost = value
        AppToast.show(this, "Audio Dynamic Bass Boost: $value")
    }
}

// v114.47: Danmaku Font Drop Shadow Opacity
internal fun PlayerActivity.showV114DanmakuFontDropShadowOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v114danmakuFontDropShadowOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Drop Shadow Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114danmakuFontDropShadowOpacity = value
        AppToast.show(this, "Danmaku Font Drop Shadow Opacity: $value")
    }
}

// v114.48: Subtitle Font Letter Spacing114
internal fun PlayerActivity.showV114SubtitleFontLetterSpacing114Dialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v114subtitleFontLetterSpacing114).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Letter Spacing114",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114subtitleFontLetterSpacing114 = value
        AppToast.show(this, "Subtitle Font Letter Spacing114: $value")
    }
}

// v114.49: Gesture Tap Play Pause Toggle
internal fun PlayerActivity.showV114GestureTapPlayPauseToggleToggle() {
    val enabled = !BiliClient.prefs.v114gestureTapPlayPauseToggle
    BiliClient.prefs.v114gestureTapPlayPauseToggle = enabled
    AppToast.show(this, "Gesture Tap Play Pause Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v114.50: Cast Video Gamma Custom
internal fun PlayerActivity.showV114CastVideoGammaCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v114castVideoGammaCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Gamma Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114castVideoGammaCustom = value
        AppToast.show(this, "Cast Video Gamma Custom: $value")
    }
}

// v114.51: Playlist Auto Pause On Headset
internal fun PlayerActivity.showV114PlaylistAutoPauseOnHeadsetToggle() {
    val enabled = !BiliClient.prefs.v114playlistAutoPauseOnHeadset
    BiliClient.prefs.v114playlistAutoPauseOnHeadset = enabled
    AppToast.show(this, "Playlist Auto Pause On Headset: ${if (enabled) "ON" else "OFF"}")
}

// v114.52: Cache Write Buffer Size
internal fun PlayerActivity.showV114CacheWriteBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v114cacheWriteBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Write Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114cacheWriteBufferSize = value
        AppToast.show(this, "Cache Write Buffer Size: $value")
    }
}

// v114.53: Progress Bar Custom Thumb Opacity
internal fun PlayerActivity.showV114ProgressBarCustomThumbOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v114progressBarCustomThumbOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114progressBarCustomThumbOpacity = value
        AppToast.show(this, "Progress Bar Custom Thumb Opacity: $value")
    }
}

// v114.54: Volume Fade In On Resume
internal fun PlayerActivity.showV114VolumeFadeInOnResumeToggle() {
    val enabled = !BiliClient.prefs.v114volumeFadeInOnResume
    BiliClient.prefs.v114volumeFadeInOnResume = enabled
    AppToast.show(this, "Volume Fade In On Resume: ${if (enabled) "ON" else "OFF"}")
}

// v114.55: History Auto Backup File
internal fun PlayerActivity.showV114HistoryAutoBackupFileToggle() {
    val enabled = !BiliClient.prefs.v114historyAutoBackupFile
    BiliClient.prefs.v114historyAutoBackupFile = enabled
    AppToast.show(this, "History Auto Backup File: ${if (enabled) "ON" else "OFF"}")
}

// v114.56: Playback Speed Auto Adjust Pitch
internal fun PlayerActivity.showV114PlaybackSpeedAutoAdjustPitchToggle() {
    val enabled = !BiliClient.prefs.v114playbackSpeedAutoAdjustPitch
    BiliClient.prefs.v114playbackSpeedAutoAdjustPitch = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Pitch: ${if (enabled) "ON" else "OFF"}")
}

// v114.57: Screenshot Auto Share Facebook
internal fun PlayerActivity.showV114ScreenshotAutoShareFacebookToggle() {
    val enabled = !BiliClient.prefs.v114screenshotAutoShareFacebook
    BiliClient.prefs.v114screenshotAutoShareFacebook = enabled
    AppToast.show(this, "Screenshot Auto Share Facebook: ${if (enabled) "ON" else "OFF"}")
}

// v114.58: Video Tint Custom114
internal fun PlayerActivity.showV114VideoTintCustom114Dialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v114videoTintCustom114).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Tint Custom114",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114videoTintCustom114 = value
        AppToast.show(this, "Video Tint Custom114: $value")
    }
}

// v114.59: Danmaku Font BG Opacity Custom114
internal fun PlayerActivity.showV114DanmakuFontBgOpacityCustom114Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v114danmakuFontBgOpacityCustom114).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Opacity Custom114",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114danmakuFontBgOpacityCustom114 = value
        AppToast.show(this, "Danmaku Font BG Opacity Custom114: $value")
    }
}

// v114.60: Subtitle Font Word Spacing114
internal fun PlayerActivity.showV114SubtitleFontWordSpacing114Dialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v114subtitleFontWordSpacing114).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Word Spacing114",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v114subtitleFontWordSpacing114 = value
        AppToast.show(this, "Subtitle Font Word Spacing114: $value")
    }
}

// v115.61: Audio Dynamic Treble Boost
internal fun PlayerActivity.showV115AudioDynamicTrebleBoostDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v115audioDynamicTrebleBoost).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Treble Boost",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115audioDynamicTrebleBoost = value
        AppToast.show(this, "Audio Dynamic Treble Boost: $value")
    }
}

// v115.62: Danmaku Font BG Border Toggle115
internal fun PlayerActivity.showV115DanmakuFontBgBorderToggle115Toggle() {
    val enabled = !BiliClient.prefs.v115danmakuFontBgBorderToggle115
    BiliClient.prefs.v115danmakuFontBgBorderToggle115 = enabled
    AppToast.show(this, "Danmaku Font BG Border Toggle115: ${if (enabled) "ON" else "OFF"}")
}

// v115.63: Subtitle Font Word Spacing115
internal fun PlayerActivity.showV115SubtitleFontWordSpacing115Dialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v115subtitleFontWordSpacing115).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Word Spacing115",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115subtitleFontWordSpacing115 = value
        AppToast.show(this, "Subtitle Font Word Spacing115: $value")
    }
}

// v115.64: Gesture Tap Double Action
internal fun PlayerActivity.showV115GestureTapDoubleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v115gestureTapDoubleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Double Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115gestureTapDoubleAction = value
        AppToast.show(this, "Gesture Tap Double Action: $value")
    }
}

// v115.65: Cast Video Tint Custom
internal fun PlayerActivity.showV115CastVideoTintCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v115castVideoTintCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Tint Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115castVideoTintCustom = value
        AppToast.show(this, "Cast Video Tint Custom: $value")
    }
}

// v115.66: Playlist Auto Resume On Launch
internal fun PlayerActivity.showV115PlaylistAutoResumeOnLaunchToggle() {
    val enabled = !BiliClient.prefs.v115playlistAutoResumeOnLaunch
    BiliClient.prefs.v115playlistAutoResumeOnLaunch = enabled
    AppToast.show(this, "Playlist Auto Resume On Launch: ${if (enabled) "ON" else "OFF"}")
}

// v115.67: Cache Read Buffer Size
internal fun PlayerActivity.showV115CacheReadBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v115cacheReadBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Read Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115cacheReadBufferSize = value
        AppToast.show(this, "Cache Read Buffer Size: $value")
    }
}

// v115.68: Progress Bar Custom Chapter Opacity
internal fun PlayerActivity.showV115ProgressBarCustomChapterOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v115progressBarCustomChapterOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Chapter Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115progressBarCustomChapterOpacity = value
        AppToast.show(this, "Progress Bar Custom Chapter Opacity: $value")
    }
}

// v115.69: Volume Fade Out On Pause
internal fun PlayerActivity.showV115VolumeFadeOutOnPauseToggle() {
    val enabled = !BiliClient.prefs.v115volumeFadeOutOnPause
    BiliClient.prefs.v115volumeFadeOutOnPause = enabled
    AppToast.show(this, "Volume Fade Out On Pause: ${if (enabled) "ON" else "OFF"}")
}

// v115.70: History Search Auto Complete
internal fun PlayerActivity.showV115HistorySearchAutoCompleteToggle() {
    val enabled = !BiliClient.prefs.v115historySearchAutoComplete
    BiliClient.prefs.v115historySearchAutoComplete = enabled
    AppToast.show(this, "History Search Auto Complete: ${if (enabled) "ON" else "OFF"}")
}

// v115.71: Playback Speed Auto Adjust Min
internal fun PlayerActivity.showV115PlaybackSpeedAutoAdjustMinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v115playbackSpeedAutoAdjustMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Auto Adjust Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115playbackSpeedAutoAdjustMin = value
        AppToast.show(this, "Playback Speed Auto Adjust Min: $value")
    }
}

// v115.72: Screenshot Auto Share LinkedIn
internal fun PlayerActivity.showV115ScreenshotAutoShareLinkedInToggle() {
    val enabled = !BiliClient.prefs.v115screenshotAutoShareLinkedIn
    BiliClient.prefs.v115screenshotAutoShareLinkedIn = enabled
    AppToast.show(this, "Screenshot Auto Share LinkedIn: ${if (enabled) "ON" else "OFF"}")
}

// v115.73: Video Split Screen Custom
internal fun PlayerActivity.showV115VideoSplitScreenCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v115videoSplitScreenCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Split Screen Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115videoSplitScreenCustom = value
        AppToast.show(this, "Video Split Screen Custom: $value")
    }
}

// v115.74: Danmaku Font BG Border Width115
internal fun PlayerActivity.showV115DanmakuFontBgBorderWidth115Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v115danmakuFontBgBorderWidth115).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Border Width115",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115danmakuFontBgBorderWidth115 = value
        AppToast.show(this, "Danmaku Font BG Border Width115: $value")
    }
}

// v115.75: Subtitle Font Features115
internal fun PlayerActivity.showV115SubtitleFontFeatures115Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v115subtitleFontFeatures115).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Features115",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v115subtitleFontFeatures115 = value
        AppToast.show(this, "Subtitle Font Features115: $value")
    }
}

// v116.76: Audio Dynamic Compressor Toggle116
internal fun PlayerActivity.showV116AudioDynamicCompressorToggle116Toggle() {
    val enabled = !BiliClient.prefs.v116audioDynamicCompressorToggle116
    BiliClient.prefs.v116audioDynamicCompressorToggle116 = enabled
    AppToast.show(this, "Audio Dynamic Compressor Toggle116: ${if (enabled) "ON" else "OFF"}")
}

// v116.77: Danmaku Font BG Border Color115
internal fun PlayerActivity.showV116DanmakuFontBgBorderColor115Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116danmakuFontBgBorderColor115).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Border Color115",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116danmakuFontBgBorderColor115 = value
        AppToast.show(this, "Danmaku Font BG Border Color115: $value")
    }
}

// v116.78: Subtitle Font Features116
internal fun PlayerActivity.showV116SubtitleFontFeatures116Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116subtitleFontFeatures116).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Features116",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116subtitleFontFeatures116 = value
        AppToast.show(this, "Subtitle Font Features116: $value")
    }
}

// v116.79: Gesture Tap Triple Action
internal fun PlayerActivity.showV116GestureTapTripleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116gestureTapTripleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Triple Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116gestureTapTripleAction = value
        AppToast.show(this, "Gesture Tap Triple Action: $value")
    }
}

// v116.80: Cast Video Sepia Custom
internal fun PlayerActivity.showV116CastVideoSepiaCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v116castVideoSepiaCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Sepia Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116castVideoSepiaCustom = value
        AppToast.show(this, "Cast Video Sepia Custom: $value")
    }
}

// v116.81: Playlist Auto Shuffle Seed
internal fun PlayerActivity.showV116PlaylistAutoShuffleSeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116playlistAutoShuffleSeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Shuffle Seed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116playlistAutoShuffleSeed = value
        AppToast.show(this, "Playlist Auto Shuffle Seed: $value")
    }
}

// v116.82: Cache Preload On Start Toggle
internal fun PlayerActivity.showV116CachePreloadOnStartToggleToggle() {
    val enabled = !BiliClient.prefs.v116cachePreloadOnStartToggle
    BiliClient.prefs.v116cachePreloadOnStartToggle = enabled
    AppToast.show(this, "Cache Preload On Start Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v116.83: Progress Bar Custom Buffer Opacity
internal fun PlayerActivity.showV116ProgressBarCustomBufferOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v116progressBarCustomBufferOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Buffer Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116progressBarCustomBufferOpacity = value
        AppToast.show(this, "Progress Bar Custom Buffer Opacity: $value")
    }
}

// v891: join mode
internal fun PlayerActivity.showV891JoinToggle() {
    val current = FeaturePrefsStore.batch891.v891join
    FeaturePrefsStore.batch891.v891join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v891: json mode
internal fun PlayerActivity.showV891JsonToggle() {
    val current = FeaturePrefsStore.batch891.v891json
    FeaturePrefsStore.batch891.v891json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v891: jump mode
internal fun PlayerActivity.showV891JumpToggle() {
    val current = FeaturePrefsStore.batch891.v891jump
    FeaturePrefsStore.batch891.v891jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v891: kernel mode
internal fun PlayerActivity.showV891KernelToggle() {
    val current = FeaturePrefsStore.batch891.v891kernel
    FeaturePrefsStore.batch891.v891kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v891: key mode
internal fun PlayerActivity.showV891KeyToggle() {
    val current = FeaturePrefsStore.batch891.v891key
    FeaturePrefsStore.batch891.v891key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v891: kill level
internal fun PlayerActivity.showV891KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v891kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v891kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v891: kit level
internal fun PlayerActivity.showV891KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v891kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v891kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v891: label level
internal fun PlayerActivity.showV891LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v891label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v891label = value
        AppToast.show(this, "label: $value")
    }
}

// v891: lag level
internal fun PlayerActivity.showV891LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v891lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v891lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v891: language level
internal fun PlayerActivity.showV891LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v891language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v891language = value
        AppToast.show(this, "language: $value")
    }
}

// v891: layer mode
internal fun PlayerActivity.showV891LayerToggle() {
    val current = FeaturePrefsStore.batch891.v891layer
    FeaturePrefsStore.batch891.v891layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v891: layout mode
internal fun PlayerActivity.showV891LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v891layout
    FeaturePrefsStore.batch891.v891layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v891: lazy mode
internal fun PlayerActivity.showV891LazyToggle() {
    val current = FeaturePrefsStore.batch891.v891lazy
    FeaturePrefsStore.batch891.v891lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v891: lead mode
internal fun PlayerActivity.showV891LeadToggle() {
    val current = FeaturePrefsStore.batch891.v891lead
    FeaturePrefsStore.batch891.v891lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v891: leaf mode
internal fun PlayerActivity.showV891LeafToggle() {
    val current = FeaturePrefsStore.batch891.v891leaf
    FeaturePrefsStore.batch891.v891leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v892: join mode
internal fun PlayerActivity.showV892JoinToggle() {
    val current = FeaturePrefsStore.batch891.v892join
    FeaturePrefsStore.batch891.v892join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v892: json mode
internal fun PlayerActivity.showV892JsonToggle() {
    val current = FeaturePrefsStore.batch891.v892json
    FeaturePrefsStore.batch891.v892json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v892: jump mode
internal fun PlayerActivity.showV892JumpToggle() {
    val current = FeaturePrefsStore.batch891.v892jump
    FeaturePrefsStore.batch891.v892jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v892: kernel mode
internal fun PlayerActivity.showV892KernelToggle() {
    val current = FeaturePrefsStore.batch891.v892kernel
    FeaturePrefsStore.batch891.v892kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v892: key mode
internal fun PlayerActivity.showV892KeyToggle() {
    val current = FeaturePrefsStore.batch891.v892key
    FeaturePrefsStore.batch891.v892key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v892: kill level
internal fun PlayerActivity.showV892KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v892kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v892kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v892: kit level
internal fun PlayerActivity.showV892KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v892kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v892kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v892: label level
internal fun PlayerActivity.showV892LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v892label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v892label = value
        AppToast.show(this, "label: $value")
    }
}

// v892: lag level
internal fun PlayerActivity.showV892LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v892lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v892lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v892: language level
internal fun PlayerActivity.showV892LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v892language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v892language = value
        AppToast.show(this, "language: $value")
    }
}

// v892: layer mode
internal fun PlayerActivity.showV892LayerToggle() {
    val current = FeaturePrefsStore.batch891.v892layer
    FeaturePrefsStore.batch891.v892layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v892: layout mode
internal fun PlayerActivity.showV892LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v892layout
    FeaturePrefsStore.batch891.v892layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v892: lazy mode
internal fun PlayerActivity.showV892LazyToggle() {
    val current = FeaturePrefsStore.batch891.v892lazy
    FeaturePrefsStore.batch891.v892lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v892: lead mode
internal fun PlayerActivity.showV892LeadToggle() {
    val current = FeaturePrefsStore.batch891.v892lead
    FeaturePrefsStore.batch891.v892lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v892: leaf mode
internal fun PlayerActivity.showV892LeafToggle() {
    val current = FeaturePrefsStore.batch891.v892leaf
    FeaturePrefsStore.batch891.v892leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v893: join mode
internal fun PlayerActivity.showV893JoinToggle() {
    val current = FeaturePrefsStore.batch891.v893join
    FeaturePrefsStore.batch891.v893join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v893: json mode
internal fun PlayerActivity.showV893JsonToggle() {
    val current = FeaturePrefsStore.batch891.v893json
    FeaturePrefsStore.batch891.v893json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v893: jump mode
internal fun PlayerActivity.showV893JumpToggle() {
    val current = FeaturePrefsStore.batch891.v893jump
    FeaturePrefsStore.batch891.v893jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v893: kernel mode
internal fun PlayerActivity.showV893KernelToggle() {
    val current = FeaturePrefsStore.batch891.v893kernel
    FeaturePrefsStore.batch891.v893kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v893: key mode
internal fun PlayerActivity.showV893KeyToggle() {
    val current = FeaturePrefsStore.batch891.v893key
    FeaturePrefsStore.batch891.v893key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v893: kill level
internal fun PlayerActivity.showV893KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v893kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v893kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v893: kit level
internal fun PlayerActivity.showV893KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v893kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v893kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v893: label level
internal fun PlayerActivity.showV893LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v893label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v893label = value
        AppToast.show(this, "label: $value")
    }
}

// v893: lag level
internal fun PlayerActivity.showV893LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v893lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v893lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v893: language level
internal fun PlayerActivity.showV893LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v893language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v893language = value
        AppToast.show(this, "language: $value")
    }
}

// v893: layer mode
internal fun PlayerActivity.showV893LayerToggle() {
    val current = FeaturePrefsStore.batch891.v893layer
    FeaturePrefsStore.batch891.v893layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v893: layout mode
internal fun PlayerActivity.showV893LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v893layout
    FeaturePrefsStore.batch891.v893layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v893: lazy mode
internal fun PlayerActivity.showV893LazyToggle() {
    val current = FeaturePrefsStore.batch891.v893lazy
    FeaturePrefsStore.batch891.v893lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v893: lead mode
internal fun PlayerActivity.showV893LeadToggle() {
    val current = FeaturePrefsStore.batch891.v893lead
    FeaturePrefsStore.batch891.v893lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v893: leaf mode
internal fun PlayerActivity.showV893LeafToggle() {
    val current = FeaturePrefsStore.batch891.v893leaf
    FeaturePrefsStore.batch891.v893leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v894: join mode
internal fun PlayerActivity.showV894JoinToggle() {
    val current = FeaturePrefsStore.batch891.v894join
    FeaturePrefsStore.batch891.v894join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v894: json mode
internal fun PlayerActivity.showV894JsonToggle() {
    val current = FeaturePrefsStore.batch891.v894json
    FeaturePrefsStore.batch891.v894json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v894: jump mode
internal fun PlayerActivity.showV894JumpToggle() {
    val current = FeaturePrefsStore.batch891.v894jump
    FeaturePrefsStore.batch891.v894jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v894: kernel mode
internal fun PlayerActivity.showV894KernelToggle() {
    val current = FeaturePrefsStore.batch891.v894kernel
    FeaturePrefsStore.batch891.v894kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v894: key mode
internal fun PlayerActivity.showV894KeyToggle() {
    val current = FeaturePrefsStore.batch891.v894key
    FeaturePrefsStore.batch891.v894key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v894: kill level
internal fun PlayerActivity.showV894KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v894kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v894kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v894: kit level
internal fun PlayerActivity.showV894KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v894kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v894kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v894: label level
internal fun PlayerActivity.showV894LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v894label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v894label = value
        AppToast.show(this, "label: $value")
    }
}

// v894: lag level
internal fun PlayerActivity.showV894LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v894lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v894lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v894: language level
internal fun PlayerActivity.showV894LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v894language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v894language = value
        AppToast.show(this, "language: $value")
    }
}

// v894: layer mode
internal fun PlayerActivity.showV894LayerToggle() {
    val current = FeaturePrefsStore.batch891.v894layer
    FeaturePrefsStore.batch891.v894layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v894: layout mode
internal fun PlayerActivity.showV894LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v894layout
    FeaturePrefsStore.batch891.v894layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v894: lazy mode
internal fun PlayerActivity.showV894LazyToggle() {
    val current = FeaturePrefsStore.batch891.v894lazy
    FeaturePrefsStore.batch891.v894lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v894: lead mode
internal fun PlayerActivity.showV894LeadToggle() {
    val current = FeaturePrefsStore.batch891.v894lead
    FeaturePrefsStore.batch891.v894lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v894: leaf mode
internal fun PlayerActivity.showV894LeafToggle() {
    val current = FeaturePrefsStore.batch891.v894leaf
    FeaturePrefsStore.batch891.v894leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v895: join mode
internal fun PlayerActivity.showV895JoinToggle() {
    val current = FeaturePrefsStore.batch891.v895join
    FeaturePrefsStore.batch891.v895join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v895: json mode
internal fun PlayerActivity.showV895JsonToggle() {
    val current = FeaturePrefsStore.batch891.v895json
    FeaturePrefsStore.batch891.v895json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v895: jump mode
internal fun PlayerActivity.showV895JumpToggle() {
    val current = FeaturePrefsStore.batch891.v895jump
    FeaturePrefsStore.batch891.v895jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v895: kernel mode
internal fun PlayerActivity.showV895KernelToggle() {
    val current = FeaturePrefsStore.batch891.v895kernel
    FeaturePrefsStore.batch891.v895kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v895: key mode
internal fun PlayerActivity.showV895KeyToggle() {
    val current = FeaturePrefsStore.batch891.v895key
    FeaturePrefsStore.batch891.v895key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v895: kill level
internal fun PlayerActivity.showV895KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v895kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v895kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v895: kit level
internal fun PlayerActivity.showV895KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v895kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v895kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v895: label level
internal fun PlayerActivity.showV895LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v895label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v895label = value
        AppToast.show(this, "label: $value")
    }
}

// v895: lag level
internal fun PlayerActivity.showV895LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v895lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v895lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v895: language level
internal fun PlayerActivity.showV895LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v895language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v895language = value
        AppToast.show(this, "language: $value")
    }
}

// v895: layer mode
internal fun PlayerActivity.showV895LayerToggle() {
    val current = FeaturePrefsStore.batch891.v895layer
    FeaturePrefsStore.batch891.v895layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v895: layout mode
internal fun PlayerActivity.showV895LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v895layout
    FeaturePrefsStore.batch891.v895layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v895: lazy mode
internal fun PlayerActivity.showV895LazyToggle() {
    val current = FeaturePrefsStore.batch891.v895lazy
    FeaturePrefsStore.batch891.v895lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v895: lead mode
internal fun PlayerActivity.showV895LeadToggle() {
    val current = FeaturePrefsStore.batch891.v895lead
    FeaturePrefsStore.batch891.v895lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v895: leaf mode
internal fun PlayerActivity.showV895LeafToggle() {
    val current = FeaturePrefsStore.batch891.v895leaf
    FeaturePrefsStore.batch891.v895leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v896: join mode
internal fun PlayerActivity.showV896JoinToggle() {
    val current = FeaturePrefsStore.batch891.v896join
    FeaturePrefsStore.batch891.v896join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v896: json mode
internal fun PlayerActivity.showV896JsonToggle() {
    val current = FeaturePrefsStore.batch891.v896json
    FeaturePrefsStore.batch891.v896json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v896: jump mode
internal fun PlayerActivity.showV896JumpToggle() {
    val current = FeaturePrefsStore.batch891.v896jump
    FeaturePrefsStore.batch891.v896jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v896: kernel mode
internal fun PlayerActivity.showV896KernelToggle() {
    val current = FeaturePrefsStore.batch891.v896kernel
    FeaturePrefsStore.batch891.v896kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v896: key mode
internal fun PlayerActivity.showV896KeyToggle() {
    val current = FeaturePrefsStore.batch891.v896key
    FeaturePrefsStore.batch891.v896key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v896: kill level
internal fun PlayerActivity.showV896KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v896kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v896kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v896: kit level
internal fun PlayerActivity.showV896KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v896kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v896kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v896: label level
internal fun PlayerActivity.showV896LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v896label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v896label = value
        AppToast.show(this, "label: $value")
    }
}

// v896: lag level
internal fun PlayerActivity.showV896LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v896lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v896lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v896: language level
internal fun PlayerActivity.showV896LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v896language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v896language = value
        AppToast.show(this, "language: $value")
    }
}

// v896: layer mode
internal fun PlayerActivity.showV896LayerToggle() {
    val current = FeaturePrefsStore.batch891.v896layer
    FeaturePrefsStore.batch891.v896layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v896: layout mode
internal fun PlayerActivity.showV896LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v896layout
    FeaturePrefsStore.batch891.v896layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v896: lazy mode
internal fun PlayerActivity.showV896LazyToggle() {
    val current = FeaturePrefsStore.batch891.v896lazy
    FeaturePrefsStore.batch891.v896lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v896: lead mode
internal fun PlayerActivity.showV896LeadToggle() {
    val current = FeaturePrefsStore.batch891.v896lead
    FeaturePrefsStore.batch891.v896lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v896: leaf mode
internal fun PlayerActivity.showV896LeafToggle() {
    val current = FeaturePrefsStore.batch891.v896leaf
    FeaturePrefsStore.batch891.v896leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v897: join mode
internal fun PlayerActivity.showV897JoinToggle() {
    val current = FeaturePrefsStore.batch891.v897join
    FeaturePrefsStore.batch891.v897join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v897: json mode
internal fun PlayerActivity.showV897JsonToggle() {
    val current = FeaturePrefsStore.batch891.v897json
    FeaturePrefsStore.batch891.v897json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v897: jump mode
internal fun PlayerActivity.showV897JumpToggle() {
    val current = FeaturePrefsStore.batch891.v897jump
    FeaturePrefsStore.batch891.v897jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v897: kernel mode
internal fun PlayerActivity.showV897KernelToggle() {
    val current = FeaturePrefsStore.batch891.v897kernel
    FeaturePrefsStore.batch891.v897kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v897: key mode
internal fun PlayerActivity.showV897KeyToggle() {
    val current = FeaturePrefsStore.batch891.v897key
    FeaturePrefsStore.batch891.v897key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v897: kill level
internal fun PlayerActivity.showV897KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v897kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v897kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v897: kit level
internal fun PlayerActivity.showV897KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v897kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v897kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v897: label level
internal fun PlayerActivity.showV897LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v897label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v897label = value
        AppToast.show(this, "label: $value")
    }
}

// v897: lag level
internal fun PlayerActivity.showV897LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v897lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v897lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v897: language level
internal fun PlayerActivity.showV897LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v897language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v897language = value
        AppToast.show(this, "language: $value")
    }
}

// v897: layer mode
internal fun PlayerActivity.showV897LayerToggle() {
    val current = FeaturePrefsStore.batch891.v897layer
    FeaturePrefsStore.batch891.v897layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v897: layout mode
internal fun PlayerActivity.showV897LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v897layout
    FeaturePrefsStore.batch891.v897layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v897: lazy mode
internal fun PlayerActivity.showV897LazyToggle() {
    val current = FeaturePrefsStore.batch891.v897lazy
    FeaturePrefsStore.batch891.v897lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v897: lead mode
internal fun PlayerActivity.showV897LeadToggle() {
    val current = FeaturePrefsStore.batch891.v897lead
    FeaturePrefsStore.batch891.v897lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v897: leaf mode
internal fun PlayerActivity.showV897LeafToggle() {
    val current = FeaturePrefsStore.batch891.v897leaf
    FeaturePrefsStore.batch891.v897leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v898: join mode
internal fun PlayerActivity.showV898JoinToggle() {
    val current = FeaturePrefsStore.batch891.v898join
    FeaturePrefsStore.batch891.v898join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v898: json mode
internal fun PlayerActivity.showV898JsonToggle() {
    val current = FeaturePrefsStore.batch891.v898json
    FeaturePrefsStore.batch891.v898json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v898: jump mode
internal fun PlayerActivity.showV898JumpToggle() {
    val current = FeaturePrefsStore.batch891.v898jump
    FeaturePrefsStore.batch891.v898jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v898: kernel mode
internal fun PlayerActivity.showV898KernelToggle() {
    val current = FeaturePrefsStore.batch891.v898kernel
    FeaturePrefsStore.batch891.v898kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v898: key mode
internal fun PlayerActivity.showV898KeyToggle() {
    val current = FeaturePrefsStore.batch891.v898key
    FeaturePrefsStore.batch891.v898key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v898: kill level
internal fun PlayerActivity.showV898KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v898kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v898kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v898: kit level
internal fun PlayerActivity.showV898KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v898kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v898kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v898: label level
internal fun PlayerActivity.showV898LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v898label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v898label = value
        AppToast.show(this, "label: $value")
    }
}

// v898: lag level
internal fun PlayerActivity.showV898LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v898lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v898lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v898: language level
internal fun PlayerActivity.showV898LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v898language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v898language = value
        AppToast.show(this, "language: $value")
    }
}

// v898: layer mode
internal fun PlayerActivity.showV898LayerToggle() {
    val current = FeaturePrefsStore.batch891.v898layer
    FeaturePrefsStore.batch891.v898layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v898: layout mode
internal fun PlayerActivity.showV898LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v898layout
    FeaturePrefsStore.batch891.v898layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v898: lazy mode
internal fun PlayerActivity.showV898LazyToggle() {
    val current = FeaturePrefsStore.batch891.v898lazy
    FeaturePrefsStore.batch891.v898lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v898: lead mode
internal fun PlayerActivity.showV898LeadToggle() {
    val current = FeaturePrefsStore.batch891.v898lead
    FeaturePrefsStore.batch891.v898lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v898: leaf mode
internal fun PlayerActivity.showV898LeafToggle() {
    val current = FeaturePrefsStore.batch891.v898leaf
    FeaturePrefsStore.batch891.v898leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v899: join mode
internal fun PlayerActivity.showV899JoinToggle() {
    val current = FeaturePrefsStore.batch891.v899join
    FeaturePrefsStore.batch891.v899join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v899: json mode
internal fun PlayerActivity.showV899JsonToggle() {
    val current = FeaturePrefsStore.batch891.v899json
    FeaturePrefsStore.batch891.v899json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v899: jump mode
internal fun PlayerActivity.showV899JumpToggle() {
    val current = FeaturePrefsStore.batch891.v899jump
    FeaturePrefsStore.batch891.v899jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v899: kernel mode
internal fun PlayerActivity.showV899KernelToggle() {
    val current = FeaturePrefsStore.batch891.v899kernel
    FeaturePrefsStore.batch891.v899kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v899: key mode
internal fun PlayerActivity.showV899KeyToggle() {
    val current = FeaturePrefsStore.batch891.v899key
    FeaturePrefsStore.batch891.v899key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v899: kill level
internal fun PlayerActivity.showV899KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v899kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v899kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v899: kit level
internal fun PlayerActivity.showV899KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v899kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v899kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v899: label level
internal fun PlayerActivity.showV899LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v899label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v899label = value
        AppToast.show(this, "label: $value")
    }
}

// v899: lag level
internal fun PlayerActivity.showV899LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v899lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v899lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v899: language level
internal fun PlayerActivity.showV899LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v899language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v899language = value
        AppToast.show(this, "language: $value")
    }
}

// v899: layer mode
internal fun PlayerActivity.showV899LayerToggle() {
    val current = FeaturePrefsStore.batch891.v899layer
    FeaturePrefsStore.batch891.v899layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v899: layout mode
internal fun PlayerActivity.showV899LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v899layout
    FeaturePrefsStore.batch891.v899layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v899: lazy mode
internal fun PlayerActivity.showV899LazyToggle() {
    val current = FeaturePrefsStore.batch891.v899lazy
    FeaturePrefsStore.batch891.v899lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v899: lead mode
internal fun PlayerActivity.showV899LeadToggle() {
    val current = FeaturePrefsStore.batch891.v899lead
    FeaturePrefsStore.batch891.v899lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v899: leaf mode
internal fun PlayerActivity.showV899LeafToggle() {
    val current = FeaturePrefsStore.batch891.v899leaf
    FeaturePrefsStore.batch891.v899leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v900: join mode
internal fun PlayerActivity.showV900JoinToggle() {
    val current = FeaturePrefsStore.batch891.v900join
    FeaturePrefsStore.batch891.v900join = !current
    AppToast.show(this, "join: ${if (!current) "ON" else "OFF"}")
}

// v900: json mode
internal fun PlayerActivity.showV900JsonToggle() {
    val current = FeaturePrefsStore.batch891.v900json
    FeaturePrefsStore.batch891.v900json = !current
    AppToast.show(this, "json: ${if (!current) "ON" else "OFF"}")
}

// v900: jump mode
internal fun PlayerActivity.showV900JumpToggle() {
    val current = FeaturePrefsStore.batch891.v900jump
    FeaturePrefsStore.batch891.v900jump = !current
    AppToast.show(this, "jump: ${if (!current) "ON" else "OFF"}")
}

// v900: kernel mode
internal fun PlayerActivity.showV900KernelToggle() {
    val current = FeaturePrefsStore.batch891.v900kernel
    FeaturePrefsStore.batch891.v900kernel = !current
    AppToast.show(this, "kernel: ${if (!current) "ON" else "OFF"}")
}

// v900: key mode
internal fun PlayerActivity.showV900KeyToggle() {
    val current = FeaturePrefsStore.batch891.v900key
    FeaturePrefsStore.batch891.v900key = !current
    AppToast.show(this, "key: ${if (!current) "ON" else "OFF"}")
}

// v900: kill level
internal fun PlayerActivity.showV900KillDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v900kill).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kill level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v900kill = value
        AppToast.show(this, "kill: $value")
    }
}

// v900: kit level
internal fun PlayerActivity.showV900KitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v900kit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "kit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v900kit = value
        AppToast.show(this, "kit: $value")
    }
}

// v900: label level
internal fun PlayerActivity.showV900LabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v900label).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "label level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v900label = value
        AppToast.show(this, "label: $value")
    }
}

// v900: lag level
internal fun PlayerActivity.showV900LagDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v900lag).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lag level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v900lag = value
        AppToast.show(this, "lag: $value")
    }
}

// v900: language level
internal fun PlayerActivity.showV900LanguageDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch891.v900language).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "language level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch891.v900language = value
        AppToast.show(this, "language: $value")
    }
}

// v900: layer mode
internal fun PlayerActivity.showV900LayerToggle() {
    val current = FeaturePrefsStore.batch891.v900layer
    FeaturePrefsStore.batch891.v900layer = !current
    AppToast.show(this, "layer: ${if (!current) "ON" else "OFF"}")
}

// v900: layout mode
internal fun PlayerActivity.showV900LayoutToggle() {
    val current = FeaturePrefsStore.batch891.v900layout
    FeaturePrefsStore.batch891.v900layout = !current
    AppToast.show(this, "layout: ${if (!current) "ON" else "OFF"}")
}

// v900: lazy mode
internal fun PlayerActivity.showV900LazyToggle() {
    val current = FeaturePrefsStore.batch891.v900lazy
    FeaturePrefsStore.batch891.v900lazy = !current
    AppToast.show(this, "lazy: ${if (!current) "ON" else "OFF"}")
}

// v900: lead mode
internal fun PlayerActivity.showV900LeadToggle() {
    val current = FeaturePrefsStore.batch891.v900lead
    FeaturePrefsStore.batch891.v900lead = !current
    AppToast.show(this, "lead: ${if (!current) "ON" else "OFF"}")
}

// v900: leaf mode
internal fun PlayerActivity.showV900LeafToggle() {
    val current = FeaturePrefsStore.batch891.v900leaf
    FeaturePrefsStore.batch891.v900leaf = !current
    AppToast.show(this, "leaf: ${if (!current) "ON" else "OFF"}")
}

// v901: learn mode
internal fun PlayerActivity.showV901LearnToggle() {
    val current = FeaturePrefsStore.batch901.v901learn
    FeaturePrefsStore.batch901.v901learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v901: left mode
internal fun PlayerActivity.showV901LeftToggle() {
    val current = FeaturePrefsStore.batch901.v901left
    FeaturePrefsStore.batch901.v901left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v901: length mode
internal fun PlayerActivity.showV901LengthToggle() {
    val current = FeaturePrefsStore.batch901.v901length
    FeaturePrefsStore.batch901.v901length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v901: level mode
internal fun PlayerActivity.showV901LevelToggle() {
    val current = FeaturePrefsStore.batch901.v901level
    FeaturePrefsStore.batch901.v901level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v901: library mode
internal fun PlayerActivity.showV901LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v901library
    FeaturePrefsStore.batch901.v901library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v901: license level
internal fun PlayerActivity.showV901LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v901license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v901license = value
        AppToast.show(this, "license: $value")
    }
}

// v901: life level
internal fun PlayerActivity.showV901LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v901life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v901life = value
        AppToast.show(this, "life: $value")
    }
}

// v901: lifetime level
internal fun PlayerActivity.showV901LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v901lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v901lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v901: light level
internal fun PlayerActivity.showV901LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v901light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v901light = value
        AppToast.show(this, "light: $value")
    }
}

// v901: limit level
internal fun PlayerActivity.showV901LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v901limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v901limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v901: line mode
internal fun PlayerActivity.showV901LineToggle() {
    val current = FeaturePrefsStore.batch901.v901line
    FeaturePrefsStore.batch901.v901line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v901: link mode
internal fun PlayerActivity.showV901LinkToggle() {
    val current = FeaturePrefsStore.batch901.v901link
    FeaturePrefsStore.batch901.v901link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v901: list mode
internal fun PlayerActivity.showV901ListToggle() {
    val current = FeaturePrefsStore.batch901.v901list
    FeaturePrefsStore.batch901.v901list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v901: live mode
internal fun PlayerActivity.showV901LiveToggle() {
    val current = FeaturePrefsStore.batch901.v901live
    FeaturePrefsStore.batch901.v901live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v901: load mode
internal fun PlayerActivity.showV901LoadToggle() {
    val current = FeaturePrefsStore.batch901.v901load
    FeaturePrefsStore.batch901.v901load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v902: learn mode
internal fun PlayerActivity.showV902LearnToggle() {
    val current = FeaturePrefsStore.batch901.v902learn
    FeaturePrefsStore.batch901.v902learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v902: left mode
internal fun PlayerActivity.showV902LeftToggle() {
    val current = FeaturePrefsStore.batch901.v902left
    FeaturePrefsStore.batch901.v902left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v902: length mode
internal fun PlayerActivity.showV902LengthToggle() {
    val current = FeaturePrefsStore.batch901.v902length
    FeaturePrefsStore.batch901.v902length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v902: level mode
internal fun PlayerActivity.showV902LevelToggle() {
    val current = FeaturePrefsStore.batch901.v902level
    FeaturePrefsStore.batch901.v902level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v902: library mode
internal fun PlayerActivity.showV902LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v902library
    FeaturePrefsStore.batch901.v902library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v902: license level
internal fun PlayerActivity.showV902LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v902license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v902license = value
        AppToast.show(this, "license: $value")
    }
}

// v902: life level
internal fun PlayerActivity.showV902LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v902life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v902life = value
        AppToast.show(this, "life: $value")
    }
}

// v902: lifetime level
internal fun PlayerActivity.showV902LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v902lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v902lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v902: light level
internal fun PlayerActivity.showV902LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v902light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v902light = value
        AppToast.show(this, "light: $value")
    }
}

// v902: limit level
internal fun PlayerActivity.showV902LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v902limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v902limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v902: line mode
internal fun PlayerActivity.showV902LineToggle() {
    val current = FeaturePrefsStore.batch901.v902line
    FeaturePrefsStore.batch901.v902line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v902: link mode
internal fun PlayerActivity.showV902LinkToggle() {
    val current = FeaturePrefsStore.batch901.v902link
    FeaturePrefsStore.batch901.v902link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v902: list mode
internal fun PlayerActivity.showV902ListToggle() {
    val current = FeaturePrefsStore.batch901.v902list
    FeaturePrefsStore.batch901.v902list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v902: live mode
internal fun PlayerActivity.showV902LiveToggle() {
    val current = FeaturePrefsStore.batch901.v902live
    FeaturePrefsStore.batch901.v902live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v902: load mode
internal fun PlayerActivity.showV902LoadToggle() {
    val current = FeaturePrefsStore.batch901.v902load
    FeaturePrefsStore.batch901.v902load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v903: learn mode
internal fun PlayerActivity.showV903LearnToggle() {
    val current = FeaturePrefsStore.batch901.v903learn
    FeaturePrefsStore.batch901.v903learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v903: left mode
internal fun PlayerActivity.showV903LeftToggle() {
    val current = FeaturePrefsStore.batch901.v903left
    FeaturePrefsStore.batch901.v903left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v903: length mode
internal fun PlayerActivity.showV903LengthToggle() {
    val current = FeaturePrefsStore.batch901.v903length
    FeaturePrefsStore.batch901.v903length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v903: level mode
internal fun PlayerActivity.showV903LevelToggle() {
    val current = FeaturePrefsStore.batch901.v903level
    FeaturePrefsStore.batch901.v903level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v903: library mode
internal fun PlayerActivity.showV903LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v903library
    FeaturePrefsStore.batch901.v903library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v903: license level
internal fun PlayerActivity.showV903LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v903license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v903license = value
        AppToast.show(this, "license: $value")
    }
}

// v903: life level
internal fun PlayerActivity.showV903LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v903life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v903life = value
        AppToast.show(this, "life: $value")
    }
}

// v903: lifetime level
internal fun PlayerActivity.showV903LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v903lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v903lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v903: light level
internal fun PlayerActivity.showV903LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v903light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v903light = value
        AppToast.show(this, "light: $value")
    }
}

// v903: limit level
internal fun PlayerActivity.showV903LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v903limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v903limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v903: line mode
internal fun PlayerActivity.showV903LineToggle() {
    val current = FeaturePrefsStore.batch901.v903line
    FeaturePrefsStore.batch901.v903line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v903: link mode
internal fun PlayerActivity.showV903LinkToggle() {
    val current = FeaturePrefsStore.batch901.v903link
    FeaturePrefsStore.batch901.v903link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v903: list mode
internal fun PlayerActivity.showV903ListToggle() {
    val current = FeaturePrefsStore.batch901.v903list
    FeaturePrefsStore.batch901.v903list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v903: live mode
internal fun PlayerActivity.showV903LiveToggle() {
    val current = FeaturePrefsStore.batch901.v903live
    FeaturePrefsStore.batch901.v903live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v903: load mode
internal fun PlayerActivity.showV903LoadToggle() {
    val current = FeaturePrefsStore.batch901.v903load
    FeaturePrefsStore.batch901.v903load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v904: learn mode
internal fun PlayerActivity.showV904LearnToggle() {
    val current = FeaturePrefsStore.batch901.v904learn
    FeaturePrefsStore.batch901.v904learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v904: left mode
internal fun PlayerActivity.showV904LeftToggle() {
    val current = FeaturePrefsStore.batch901.v904left
    FeaturePrefsStore.batch901.v904left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v904: length mode
internal fun PlayerActivity.showV904LengthToggle() {
    val current = FeaturePrefsStore.batch901.v904length
    FeaturePrefsStore.batch901.v904length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v904: level mode
internal fun PlayerActivity.showV904LevelToggle() {
    val current = FeaturePrefsStore.batch901.v904level
    FeaturePrefsStore.batch901.v904level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v904: library mode
internal fun PlayerActivity.showV904LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v904library
    FeaturePrefsStore.batch901.v904library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v904: license level
internal fun PlayerActivity.showV904LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v904license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v904license = value
        AppToast.show(this, "license: $value")
    }
}

// v904: life level
internal fun PlayerActivity.showV904LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v904life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v904life = value
        AppToast.show(this, "life: $value")
    }
}

// v904: lifetime level
internal fun PlayerActivity.showV904LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v904lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v904lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v904: light level
internal fun PlayerActivity.showV904LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v904light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v904light = value
        AppToast.show(this, "light: $value")
    }
}

// v904: limit level
internal fun PlayerActivity.showV904LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v904limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v904limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v904: line mode
internal fun PlayerActivity.showV904LineToggle() {
    val current = FeaturePrefsStore.batch901.v904line
    FeaturePrefsStore.batch901.v904line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v904: link mode
internal fun PlayerActivity.showV904LinkToggle() {
    val current = FeaturePrefsStore.batch901.v904link
    FeaturePrefsStore.batch901.v904link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v904: list mode
internal fun PlayerActivity.showV904ListToggle() {
    val current = FeaturePrefsStore.batch901.v904list
    FeaturePrefsStore.batch901.v904list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v904: live mode
internal fun PlayerActivity.showV904LiveToggle() {
    val current = FeaturePrefsStore.batch901.v904live
    FeaturePrefsStore.batch901.v904live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v904: load mode
internal fun PlayerActivity.showV904LoadToggle() {
    val current = FeaturePrefsStore.batch901.v904load
    FeaturePrefsStore.batch901.v904load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v905: learn mode
internal fun PlayerActivity.showV905LearnToggle() {
    val current = FeaturePrefsStore.batch901.v905learn
    FeaturePrefsStore.batch901.v905learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v905: left mode
internal fun PlayerActivity.showV905LeftToggle() {
    val current = FeaturePrefsStore.batch901.v905left
    FeaturePrefsStore.batch901.v905left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v905: length mode
internal fun PlayerActivity.showV905LengthToggle() {
    val current = FeaturePrefsStore.batch901.v905length
    FeaturePrefsStore.batch901.v905length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v905: level mode
internal fun PlayerActivity.showV905LevelToggle() {
    val current = FeaturePrefsStore.batch901.v905level
    FeaturePrefsStore.batch901.v905level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v905: library mode
internal fun PlayerActivity.showV905LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v905library
    FeaturePrefsStore.batch901.v905library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v905: license level
internal fun PlayerActivity.showV905LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v905license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v905license = value
        AppToast.show(this, "license: $value")
    }
}

// v905: life level
internal fun PlayerActivity.showV905LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v905life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v905life = value
        AppToast.show(this, "life: $value")
    }
}

// v905: lifetime level
internal fun PlayerActivity.showV905LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v905lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v905lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v905: light level
internal fun PlayerActivity.showV905LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v905light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v905light = value
        AppToast.show(this, "light: $value")
    }
}

// v905: limit level
internal fun PlayerActivity.showV905LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v905limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v905limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v905: line mode
internal fun PlayerActivity.showV905LineToggle() {
    val current = FeaturePrefsStore.batch901.v905line
    FeaturePrefsStore.batch901.v905line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v905: link mode
internal fun PlayerActivity.showV905LinkToggle() {
    val current = FeaturePrefsStore.batch901.v905link
    FeaturePrefsStore.batch901.v905link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v905: list mode
internal fun PlayerActivity.showV905ListToggle() {
    val current = FeaturePrefsStore.batch901.v905list
    FeaturePrefsStore.batch901.v905list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v905: live mode
internal fun PlayerActivity.showV905LiveToggle() {
    val current = FeaturePrefsStore.batch901.v905live
    FeaturePrefsStore.batch901.v905live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v905: load mode
internal fun PlayerActivity.showV905LoadToggle() {
    val current = FeaturePrefsStore.batch901.v905load
    FeaturePrefsStore.batch901.v905load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v906: learn mode
internal fun PlayerActivity.showV906LearnToggle() {
    val current = FeaturePrefsStore.batch901.v906learn
    FeaturePrefsStore.batch901.v906learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v906: left mode
internal fun PlayerActivity.showV906LeftToggle() {
    val current = FeaturePrefsStore.batch901.v906left
    FeaturePrefsStore.batch901.v906left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v906: length mode
internal fun PlayerActivity.showV906LengthToggle() {
    val current = FeaturePrefsStore.batch901.v906length
    FeaturePrefsStore.batch901.v906length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v906: level mode
internal fun PlayerActivity.showV906LevelToggle() {
    val current = FeaturePrefsStore.batch901.v906level
    FeaturePrefsStore.batch901.v906level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v906: library mode
internal fun PlayerActivity.showV906LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v906library
    FeaturePrefsStore.batch901.v906library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v906: license level
internal fun PlayerActivity.showV906LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v906license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v906license = value
        AppToast.show(this, "license: $value")
    }
}

// v906: life level
internal fun PlayerActivity.showV906LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v906life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v906life = value
        AppToast.show(this, "life: $value")
    }
}

// v906: lifetime level
internal fun PlayerActivity.showV906LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v906lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v906lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v906: light level
internal fun PlayerActivity.showV906LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v906light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v906light = value
        AppToast.show(this, "light: $value")
    }
}

// v906: limit level
internal fun PlayerActivity.showV906LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v906limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v906limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v906: line mode
internal fun PlayerActivity.showV906LineToggle() {
    val current = FeaturePrefsStore.batch901.v906line
    FeaturePrefsStore.batch901.v906line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v906: link mode
internal fun PlayerActivity.showV906LinkToggle() {
    val current = FeaturePrefsStore.batch901.v906link
    FeaturePrefsStore.batch901.v906link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v906: list mode
internal fun PlayerActivity.showV906ListToggle() {
    val current = FeaturePrefsStore.batch901.v906list
    FeaturePrefsStore.batch901.v906list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v906: live mode
internal fun PlayerActivity.showV906LiveToggle() {
    val current = FeaturePrefsStore.batch901.v906live
    FeaturePrefsStore.batch901.v906live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v906: load mode
internal fun PlayerActivity.showV906LoadToggle() {
    val current = FeaturePrefsStore.batch901.v906load
    FeaturePrefsStore.batch901.v906load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v907: learn mode
internal fun PlayerActivity.showV907LearnToggle() {
    val current = FeaturePrefsStore.batch901.v907learn
    FeaturePrefsStore.batch901.v907learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v907: left mode
internal fun PlayerActivity.showV907LeftToggle() {
    val current = FeaturePrefsStore.batch901.v907left
    FeaturePrefsStore.batch901.v907left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v907: length mode
internal fun PlayerActivity.showV907LengthToggle() {
    val current = FeaturePrefsStore.batch901.v907length
    FeaturePrefsStore.batch901.v907length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v907: level mode
internal fun PlayerActivity.showV907LevelToggle() {
    val current = FeaturePrefsStore.batch901.v907level
    FeaturePrefsStore.batch901.v907level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v907: library mode
internal fun PlayerActivity.showV907LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v907library
    FeaturePrefsStore.batch901.v907library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v907: license level
internal fun PlayerActivity.showV907LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v907license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v907license = value
        AppToast.show(this, "license: $value")
    }
}

// v907: life level
internal fun PlayerActivity.showV907LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v907life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v907life = value
        AppToast.show(this, "life: $value")
    }
}

// v907: lifetime level
internal fun PlayerActivity.showV907LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v907lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v907lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v907: light level
internal fun PlayerActivity.showV907LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v907light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v907light = value
        AppToast.show(this, "light: $value")
    }
}

// v907: limit level
internal fun PlayerActivity.showV907LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v907limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v907limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v907: line mode
internal fun PlayerActivity.showV907LineToggle() {
    val current = FeaturePrefsStore.batch901.v907line
    FeaturePrefsStore.batch901.v907line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v907: link mode
internal fun PlayerActivity.showV907LinkToggle() {
    val current = FeaturePrefsStore.batch901.v907link
    FeaturePrefsStore.batch901.v907link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v907: list mode
internal fun PlayerActivity.showV907ListToggle() {
    val current = FeaturePrefsStore.batch901.v907list
    FeaturePrefsStore.batch901.v907list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v907: live mode
internal fun PlayerActivity.showV907LiveToggle() {
    val current = FeaturePrefsStore.batch901.v907live
    FeaturePrefsStore.batch901.v907live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v907: load mode
internal fun PlayerActivity.showV907LoadToggle() {
    val current = FeaturePrefsStore.batch901.v907load
    FeaturePrefsStore.batch901.v907load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v908: learn mode
internal fun PlayerActivity.showV908LearnToggle() {
    val current = FeaturePrefsStore.batch901.v908learn
    FeaturePrefsStore.batch901.v908learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v908: left mode
internal fun PlayerActivity.showV908LeftToggle() {
    val current = FeaturePrefsStore.batch901.v908left
    FeaturePrefsStore.batch901.v908left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v908: length mode
internal fun PlayerActivity.showV908LengthToggle() {
    val current = FeaturePrefsStore.batch901.v908length
    FeaturePrefsStore.batch901.v908length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v908: level mode
internal fun PlayerActivity.showV908LevelToggle() {
    val current = FeaturePrefsStore.batch901.v908level
    FeaturePrefsStore.batch901.v908level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v908: library mode
internal fun PlayerActivity.showV908LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v908library
    FeaturePrefsStore.batch901.v908library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v908: license level
internal fun PlayerActivity.showV908LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v908license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v908license = value
        AppToast.show(this, "license: $value")
    }
}

// v908: life level
internal fun PlayerActivity.showV908LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v908life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v908life = value
        AppToast.show(this, "life: $value")
    }
}

// v908: lifetime level
internal fun PlayerActivity.showV908LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v908lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v908lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v908: light level
internal fun PlayerActivity.showV908LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v908light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v908light = value
        AppToast.show(this, "light: $value")
    }
}

// v908: limit level
internal fun PlayerActivity.showV908LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v908limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v908limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v908: line mode
internal fun PlayerActivity.showV908LineToggle() {
    val current = FeaturePrefsStore.batch901.v908line
    FeaturePrefsStore.batch901.v908line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v908: link mode
internal fun PlayerActivity.showV908LinkToggle() {
    val current = FeaturePrefsStore.batch901.v908link
    FeaturePrefsStore.batch901.v908link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v908: list mode
internal fun PlayerActivity.showV908ListToggle() {
    val current = FeaturePrefsStore.batch901.v908list
    FeaturePrefsStore.batch901.v908list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v908: live mode
internal fun PlayerActivity.showV908LiveToggle() {
    val current = FeaturePrefsStore.batch901.v908live
    FeaturePrefsStore.batch901.v908live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v908: load mode
internal fun PlayerActivity.showV908LoadToggle() {
    val current = FeaturePrefsStore.batch901.v908load
    FeaturePrefsStore.batch901.v908load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v909: learn mode
internal fun PlayerActivity.showV909LearnToggle() {
    val current = FeaturePrefsStore.batch901.v909learn
    FeaturePrefsStore.batch901.v909learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v909: left mode
internal fun PlayerActivity.showV909LeftToggle() {
    val current = FeaturePrefsStore.batch901.v909left
    FeaturePrefsStore.batch901.v909left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v909: length mode
internal fun PlayerActivity.showV909LengthToggle() {
    val current = FeaturePrefsStore.batch901.v909length
    FeaturePrefsStore.batch901.v909length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v909: level mode
internal fun PlayerActivity.showV909LevelToggle() {
    val current = FeaturePrefsStore.batch901.v909level
    FeaturePrefsStore.batch901.v909level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v909: library mode
internal fun PlayerActivity.showV909LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v909library
    FeaturePrefsStore.batch901.v909library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v909: license level
internal fun PlayerActivity.showV909LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v909license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v909license = value
        AppToast.show(this, "license: $value")
    }
}

// v909: life level
internal fun PlayerActivity.showV909LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v909life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v909life = value
        AppToast.show(this, "life: $value")
    }
}

// v909: lifetime level
internal fun PlayerActivity.showV909LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v909lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v909lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v909: light level
internal fun PlayerActivity.showV909LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v909light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v909light = value
        AppToast.show(this, "light: $value")
    }
}

// v909: limit level
internal fun PlayerActivity.showV909LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v909limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v909limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v909: line mode
internal fun PlayerActivity.showV909LineToggle() {
    val current = FeaturePrefsStore.batch901.v909line
    FeaturePrefsStore.batch901.v909line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v909: link mode
internal fun PlayerActivity.showV909LinkToggle() {
    val current = FeaturePrefsStore.batch901.v909link
    FeaturePrefsStore.batch901.v909link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v909: list mode
internal fun PlayerActivity.showV909ListToggle() {
    val current = FeaturePrefsStore.batch901.v909list
    FeaturePrefsStore.batch901.v909list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v909: live mode
internal fun PlayerActivity.showV909LiveToggle() {
    val current = FeaturePrefsStore.batch901.v909live
    FeaturePrefsStore.batch901.v909live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v909: load mode
internal fun PlayerActivity.showV909LoadToggle() {
    val current = FeaturePrefsStore.batch901.v909load
    FeaturePrefsStore.batch901.v909load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v910: learn mode
internal fun PlayerActivity.showV910LearnToggle() {
    val current = FeaturePrefsStore.batch901.v910learn
    FeaturePrefsStore.batch901.v910learn = !current
    AppToast.show(this, "learn: ${if (!current) "ON" else "OFF"}")
}

// v910: left mode
internal fun PlayerActivity.showV910LeftToggle() {
    val current = FeaturePrefsStore.batch901.v910left
    FeaturePrefsStore.batch901.v910left = !current
    AppToast.show(this, "left: ${if (!current) "ON" else "OFF"}")
}

// v910: length mode
internal fun PlayerActivity.showV910LengthToggle() {
    val current = FeaturePrefsStore.batch901.v910length
    FeaturePrefsStore.batch901.v910length = !current
    AppToast.show(this, "length: ${if (!current) "ON" else "OFF"}")
}

// v910: level mode
internal fun PlayerActivity.showV910LevelToggle() {
    val current = FeaturePrefsStore.batch901.v910level
    FeaturePrefsStore.batch901.v910level = !current
    AppToast.show(this, "level: ${if (!current) "ON" else "OFF"}")
}

// v910: library mode
internal fun PlayerActivity.showV910LibraryToggle() {
    val current = FeaturePrefsStore.batch901.v910library
    FeaturePrefsStore.batch901.v910library = !current
    AppToast.show(this, "library: ${if (!current) "ON" else "OFF"}")
}

// v910: license level
internal fun PlayerActivity.showV910LicenseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v910license).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "license level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v910license = value
        AppToast.show(this, "license: $value")
    }
}

// v910: life level
internal fun PlayerActivity.showV910LifeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v910life).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "life level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v910life = value
        AppToast.show(this, "life: $value")
    }
}

// v910: lifetime level
internal fun PlayerActivity.showV910LifetimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v910lifetime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lifetime level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v910lifetime = value
        AppToast.show(this, "lifetime: $value")
    }
}

// v910: light level
internal fun PlayerActivity.showV910LightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v910light).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "light level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v910light = value
        AppToast.show(this, "light: $value")
    }
}

// v910: limit level
internal fun PlayerActivity.showV910LimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch901.v910limit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "limit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch901.v910limit = value
        AppToast.show(this, "limit: $value")
    }
}

// v910: line mode
internal fun PlayerActivity.showV910LineToggle() {
    val current = FeaturePrefsStore.batch901.v910line
    FeaturePrefsStore.batch901.v910line = !current
    AppToast.show(this, "line: ${if (!current) "ON" else "OFF"}")
}

// v910: link mode
internal fun PlayerActivity.showV910LinkToggle() {
    val current = FeaturePrefsStore.batch901.v910link
    FeaturePrefsStore.batch901.v910link = !current
    AppToast.show(this, "link: ${if (!current) "ON" else "OFF"}")
}

// v910: list mode
internal fun PlayerActivity.showV910ListToggle() {
    val current = FeaturePrefsStore.batch901.v910list
    FeaturePrefsStore.batch901.v910list = !current
    AppToast.show(this, "list: ${if (!current) "ON" else "OFF"}")
}

// v910: live mode
internal fun PlayerActivity.showV910LiveToggle() {
    val current = FeaturePrefsStore.batch901.v910live
    FeaturePrefsStore.batch901.v910live = !current
    AppToast.show(this, "live: ${if (!current) "ON" else "OFF"}")
}

// v910: load mode
internal fun PlayerActivity.showV910LoadToggle() {
    val current = FeaturePrefsStore.batch901.v910load
    FeaturePrefsStore.batch901.v910load = !current
    AppToast.show(this, "load: ${if (!current) "ON" else "OFF"}")
}

// v911: local mode
internal fun PlayerActivity.showV911LocalToggle() {
    val current = FeaturePrefsStore.batch911.v911local
    FeaturePrefsStore.batch911.v911local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v911: lock mode
internal fun PlayerActivity.showV911LockToggle() {
    val current = FeaturePrefsStore.batch911.v911lock
    FeaturePrefsStore.batch911.v911lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v911: log mode
internal fun PlayerActivity.showV911LogToggle() {
    val current = FeaturePrefsStore.batch911.v911log
    FeaturePrefsStore.batch911.v911log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v911: logic mode
internal fun PlayerActivity.showV911LogicToggle() {
    val current = FeaturePrefsStore.batch911.v911logic
    FeaturePrefsStore.batch911.v911logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v911: login mode
internal fun PlayerActivity.showV911LoginToggle() {
    val current = FeaturePrefsStore.batch911.v911login
    FeaturePrefsStore.batch911.v911login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v911: long level
internal fun PlayerActivity.showV911LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v911long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v911long = value
        AppToast.show(this, "long: $value")
    }
}

// v911: loop level
internal fun PlayerActivity.showV911LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v911loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v911loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v911: low level
internal fun PlayerActivity.showV911LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v911low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v911low = value
        AppToast.show(this, "low: $value")
    }
}

// v911: lower level
internal fun PlayerActivity.showV911LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v911lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v911lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v911: main level
internal fun PlayerActivity.showV911MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v911main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v911main = value
        AppToast.show(this, "main: $value")
    }
}

// v911: make mode
internal fun PlayerActivity.showV911MakeToggle() {
    val current = FeaturePrefsStore.batch911.v911make
    FeaturePrefsStore.batch911.v911make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v911: manage mode
internal fun PlayerActivity.showV911ManageToggle() {
    val current = FeaturePrefsStore.batch911.v911manage
    FeaturePrefsStore.batch911.v911manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v911: manifest mode
internal fun PlayerActivity.showV911ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v911manifest
    FeaturePrefsStore.batch911.v911manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v911: map mode
internal fun PlayerActivity.showV911MapToggle() {
    val current = FeaturePrefsStore.batch911.v911map
    FeaturePrefsStore.batch911.v911map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v911: margin mode
internal fun PlayerActivity.showV911MarginToggle() {
    val current = FeaturePrefsStore.batch911.v911margin
    FeaturePrefsStore.batch911.v911margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v912: local mode
internal fun PlayerActivity.showV912LocalToggle() {
    val current = FeaturePrefsStore.batch911.v912local
    FeaturePrefsStore.batch911.v912local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v912: lock mode
internal fun PlayerActivity.showV912LockToggle() {
    val current = FeaturePrefsStore.batch911.v912lock
    FeaturePrefsStore.batch911.v912lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v912: log mode
internal fun PlayerActivity.showV912LogToggle() {
    val current = FeaturePrefsStore.batch911.v912log
    FeaturePrefsStore.batch911.v912log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v912: logic mode
internal fun PlayerActivity.showV912LogicToggle() {
    val current = FeaturePrefsStore.batch911.v912logic
    FeaturePrefsStore.batch911.v912logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v912: login mode
internal fun PlayerActivity.showV912LoginToggle() {
    val current = FeaturePrefsStore.batch911.v912login
    FeaturePrefsStore.batch911.v912login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v912: long level
internal fun PlayerActivity.showV912LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v912long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v912long = value
        AppToast.show(this, "long: $value")
    }
}

// v912: loop level
internal fun PlayerActivity.showV912LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v912loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v912loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v912: low level
internal fun PlayerActivity.showV912LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v912low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v912low = value
        AppToast.show(this, "low: $value")
    }
}

// v912: lower level
internal fun PlayerActivity.showV912LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v912lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v912lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v912: main level
internal fun PlayerActivity.showV912MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v912main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v912main = value
        AppToast.show(this, "main: $value")
    }
}

// v912: make mode
internal fun PlayerActivity.showV912MakeToggle() {
    val current = FeaturePrefsStore.batch911.v912make
    FeaturePrefsStore.batch911.v912make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v912: manage mode
internal fun PlayerActivity.showV912ManageToggle() {
    val current = FeaturePrefsStore.batch911.v912manage
    FeaturePrefsStore.batch911.v912manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v912: manifest mode
internal fun PlayerActivity.showV912ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v912manifest
    FeaturePrefsStore.batch911.v912manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v912: map mode
internal fun PlayerActivity.showV912MapToggle() {
    val current = FeaturePrefsStore.batch911.v912map
    FeaturePrefsStore.batch911.v912map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v912: margin mode
internal fun PlayerActivity.showV912MarginToggle() {
    val current = FeaturePrefsStore.batch911.v912margin
    FeaturePrefsStore.batch911.v912margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v913: local mode
internal fun PlayerActivity.showV913LocalToggle() {
    val current = FeaturePrefsStore.batch911.v913local
    FeaturePrefsStore.batch911.v913local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v913: lock mode
internal fun PlayerActivity.showV913LockToggle() {
    val current = FeaturePrefsStore.batch911.v913lock
    FeaturePrefsStore.batch911.v913lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v913: log mode
internal fun PlayerActivity.showV913LogToggle() {
    val current = FeaturePrefsStore.batch911.v913log
    FeaturePrefsStore.batch911.v913log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v913: logic mode
internal fun PlayerActivity.showV913LogicToggle() {
    val current = FeaturePrefsStore.batch911.v913logic
    FeaturePrefsStore.batch911.v913logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v913: login mode
internal fun PlayerActivity.showV913LoginToggle() {
    val current = FeaturePrefsStore.batch911.v913login
    FeaturePrefsStore.batch911.v913login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v913: long level
internal fun PlayerActivity.showV913LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v913long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v913long = value
        AppToast.show(this, "long: $value")
    }
}

// v913: loop level
internal fun PlayerActivity.showV913LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v913loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v913loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v913: low level
internal fun PlayerActivity.showV913LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v913low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v913low = value
        AppToast.show(this, "low: $value")
    }
}

// v913: lower level
internal fun PlayerActivity.showV913LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v913lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v913lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v913: main level
internal fun PlayerActivity.showV913MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v913main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v913main = value
        AppToast.show(this, "main: $value")
    }
}

// v913: make mode
internal fun PlayerActivity.showV913MakeToggle() {
    val current = FeaturePrefsStore.batch911.v913make
    FeaturePrefsStore.batch911.v913make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v913: manage mode
internal fun PlayerActivity.showV913ManageToggle() {
    val current = FeaturePrefsStore.batch911.v913manage
    FeaturePrefsStore.batch911.v913manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v913: manifest mode
internal fun PlayerActivity.showV913ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v913manifest
    FeaturePrefsStore.batch911.v913manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v913: map mode
internal fun PlayerActivity.showV913MapToggle() {
    val current = FeaturePrefsStore.batch911.v913map
    FeaturePrefsStore.batch911.v913map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v913: margin mode
internal fun PlayerActivity.showV913MarginToggle() {
    val current = FeaturePrefsStore.batch911.v913margin
    FeaturePrefsStore.batch911.v913margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v914: local mode
internal fun PlayerActivity.showV914LocalToggle() {
    val current = FeaturePrefsStore.batch911.v914local
    FeaturePrefsStore.batch911.v914local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v914: lock mode
internal fun PlayerActivity.showV914LockToggle() {
    val current = FeaturePrefsStore.batch911.v914lock
    FeaturePrefsStore.batch911.v914lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v914: log mode
internal fun PlayerActivity.showV914LogToggle() {
    val current = FeaturePrefsStore.batch911.v914log
    FeaturePrefsStore.batch911.v914log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v914: logic mode
internal fun PlayerActivity.showV914LogicToggle() {
    val current = FeaturePrefsStore.batch911.v914logic
    FeaturePrefsStore.batch911.v914logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v914: login mode
internal fun PlayerActivity.showV914LoginToggle() {
    val current = FeaturePrefsStore.batch911.v914login
    FeaturePrefsStore.batch911.v914login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v914: long level
internal fun PlayerActivity.showV914LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v914long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v914long = value
        AppToast.show(this, "long: $value")
    }
}

// v914: loop level
internal fun PlayerActivity.showV914LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v914loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v914loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v914: low level
internal fun PlayerActivity.showV914LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v914low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v914low = value
        AppToast.show(this, "low: $value")
    }
}

// v914: lower level
internal fun PlayerActivity.showV914LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v914lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v914lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v914: main level
internal fun PlayerActivity.showV914MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v914main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v914main = value
        AppToast.show(this, "main: $value")
    }
}

// v914: make mode
internal fun PlayerActivity.showV914MakeToggle() {
    val current = FeaturePrefsStore.batch911.v914make
    FeaturePrefsStore.batch911.v914make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v914: manage mode
internal fun PlayerActivity.showV914ManageToggle() {
    val current = FeaturePrefsStore.batch911.v914manage
    FeaturePrefsStore.batch911.v914manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v914: manifest mode
internal fun PlayerActivity.showV914ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v914manifest
    FeaturePrefsStore.batch911.v914manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v914: map mode
internal fun PlayerActivity.showV914MapToggle() {
    val current = FeaturePrefsStore.batch911.v914map
    FeaturePrefsStore.batch911.v914map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v914: margin mode
internal fun PlayerActivity.showV914MarginToggle() {
    val current = FeaturePrefsStore.batch911.v914margin
    FeaturePrefsStore.batch911.v914margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v915: local mode
internal fun PlayerActivity.showV915LocalToggle() {
    val current = FeaturePrefsStore.batch911.v915local
    FeaturePrefsStore.batch911.v915local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v915: lock mode
internal fun PlayerActivity.showV915LockToggle() {
    val current = FeaturePrefsStore.batch911.v915lock
    FeaturePrefsStore.batch911.v915lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v915: log mode
internal fun PlayerActivity.showV915LogToggle() {
    val current = FeaturePrefsStore.batch911.v915log
    FeaturePrefsStore.batch911.v915log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v915: logic mode
internal fun PlayerActivity.showV915LogicToggle() {
    val current = FeaturePrefsStore.batch911.v915logic
    FeaturePrefsStore.batch911.v915logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v915: login mode
internal fun PlayerActivity.showV915LoginToggle() {
    val current = FeaturePrefsStore.batch911.v915login
    FeaturePrefsStore.batch911.v915login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v915: long level
internal fun PlayerActivity.showV915LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v915long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v915long = value
        AppToast.show(this, "long: $value")
    }
}

// v915: loop level
internal fun PlayerActivity.showV915LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v915loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v915loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v915: low level
internal fun PlayerActivity.showV915LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v915low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v915low = value
        AppToast.show(this, "low: $value")
    }
}

// v915: lower level
internal fun PlayerActivity.showV915LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v915lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v915lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v915: main level
internal fun PlayerActivity.showV915MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v915main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v915main = value
        AppToast.show(this, "main: $value")
    }
}

// v915: make mode
internal fun PlayerActivity.showV915MakeToggle() {
    val current = FeaturePrefsStore.batch911.v915make
    FeaturePrefsStore.batch911.v915make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v915: manage mode
internal fun PlayerActivity.showV915ManageToggle() {
    val current = FeaturePrefsStore.batch911.v915manage
    FeaturePrefsStore.batch911.v915manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v915: manifest mode
internal fun PlayerActivity.showV915ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v915manifest
    FeaturePrefsStore.batch911.v915manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v915: map mode
internal fun PlayerActivity.showV915MapToggle() {
    val current = FeaturePrefsStore.batch911.v915map
    FeaturePrefsStore.batch911.v915map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v915: margin mode
internal fun PlayerActivity.showV915MarginToggle() {
    val current = FeaturePrefsStore.batch911.v915margin
    FeaturePrefsStore.batch911.v915margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v916: local mode
internal fun PlayerActivity.showV916LocalToggle() {
    val current = FeaturePrefsStore.batch911.v916local
    FeaturePrefsStore.batch911.v916local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v916: lock mode
internal fun PlayerActivity.showV916LockToggle() {
    val current = FeaturePrefsStore.batch911.v916lock
    FeaturePrefsStore.batch911.v916lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v916: log mode
internal fun PlayerActivity.showV916LogToggle() {
    val current = FeaturePrefsStore.batch911.v916log
    FeaturePrefsStore.batch911.v916log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v916: logic mode
internal fun PlayerActivity.showV916LogicToggle() {
    val current = FeaturePrefsStore.batch911.v916logic
    FeaturePrefsStore.batch911.v916logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v916: login mode
internal fun PlayerActivity.showV916LoginToggle() {
    val current = FeaturePrefsStore.batch911.v916login
    FeaturePrefsStore.batch911.v916login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v916: long level
internal fun PlayerActivity.showV916LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v916long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v916long = value
        AppToast.show(this, "long: $value")
    }
}

// v916: loop level
internal fun PlayerActivity.showV916LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v916loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v916loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v916: low level
internal fun PlayerActivity.showV916LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v916low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v916low = value
        AppToast.show(this, "low: $value")
    }
}

// v916: lower level
internal fun PlayerActivity.showV916LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v916lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v916lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v916: main level
internal fun PlayerActivity.showV916MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v916main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v916main = value
        AppToast.show(this, "main: $value")
    }
}

// v916: make mode
internal fun PlayerActivity.showV916MakeToggle() {
    val current = FeaturePrefsStore.batch911.v916make
    FeaturePrefsStore.batch911.v916make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v916: manage mode
internal fun PlayerActivity.showV916ManageToggle() {
    val current = FeaturePrefsStore.batch911.v916manage
    FeaturePrefsStore.batch911.v916manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v916: manifest mode
internal fun PlayerActivity.showV916ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v916manifest
    FeaturePrefsStore.batch911.v916manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v916: map mode
internal fun PlayerActivity.showV916MapToggle() {
    val current = FeaturePrefsStore.batch911.v916map
    FeaturePrefsStore.batch911.v916map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v916: margin mode
internal fun PlayerActivity.showV916MarginToggle() {
    val current = FeaturePrefsStore.batch911.v916margin
    FeaturePrefsStore.batch911.v916margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v917: local mode
internal fun PlayerActivity.showV917LocalToggle() {
    val current = FeaturePrefsStore.batch911.v917local
    FeaturePrefsStore.batch911.v917local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v917: lock mode
internal fun PlayerActivity.showV917LockToggle() {
    val current = FeaturePrefsStore.batch911.v917lock
    FeaturePrefsStore.batch911.v917lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v917: log mode
internal fun PlayerActivity.showV917LogToggle() {
    val current = FeaturePrefsStore.batch911.v917log
    FeaturePrefsStore.batch911.v917log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v917: logic mode
internal fun PlayerActivity.showV917LogicToggle() {
    val current = FeaturePrefsStore.batch911.v917logic
    FeaturePrefsStore.batch911.v917logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v917: login mode
internal fun PlayerActivity.showV917LoginToggle() {
    val current = FeaturePrefsStore.batch911.v917login
    FeaturePrefsStore.batch911.v917login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v917: long level
internal fun PlayerActivity.showV917LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v917long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v917long = value
        AppToast.show(this, "long: $value")
    }
}

// v917: loop level
internal fun PlayerActivity.showV917LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v917loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v917loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v917: low level
internal fun PlayerActivity.showV917LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v917low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v917low = value
        AppToast.show(this, "low: $value")
    }
}

// v917: lower level
internal fun PlayerActivity.showV917LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v917lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v917lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v917: main level
internal fun PlayerActivity.showV917MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v917main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v917main = value
        AppToast.show(this, "main: $value")
    }
}

// v917: make mode
internal fun PlayerActivity.showV917MakeToggle() {
    val current = FeaturePrefsStore.batch911.v917make
    FeaturePrefsStore.batch911.v917make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v917: manage mode
internal fun PlayerActivity.showV917ManageToggle() {
    val current = FeaturePrefsStore.batch911.v917manage
    FeaturePrefsStore.batch911.v917manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v917: manifest mode
internal fun PlayerActivity.showV917ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v917manifest
    FeaturePrefsStore.batch911.v917manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v917: map mode
internal fun PlayerActivity.showV917MapToggle() {
    val current = FeaturePrefsStore.batch911.v917map
    FeaturePrefsStore.batch911.v917map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v917: margin mode
internal fun PlayerActivity.showV917MarginToggle() {
    val current = FeaturePrefsStore.batch911.v917margin
    FeaturePrefsStore.batch911.v917margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v918: local mode
internal fun PlayerActivity.showV918LocalToggle() {
    val current = FeaturePrefsStore.batch911.v918local
    FeaturePrefsStore.batch911.v918local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v918: lock mode
internal fun PlayerActivity.showV918LockToggle() {
    val current = FeaturePrefsStore.batch911.v918lock
    FeaturePrefsStore.batch911.v918lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v918: log mode
internal fun PlayerActivity.showV918LogToggle() {
    val current = FeaturePrefsStore.batch911.v918log
    FeaturePrefsStore.batch911.v918log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v918: logic mode
internal fun PlayerActivity.showV918LogicToggle() {
    val current = FeaturePrefsStore.batch911.v918logic
    FeaturePrefsStore.batch911.v918logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v918: login mode
internal fun PlayerActivity.showV918LoginToggle() {
    val current = FeaturePrefsStore.batch911.v918login
    FeaturePrefsStore.batch911.v918login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v918: long level
internal fun PlayerActivity.showV918LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v918long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v918long = value
        AppToast.show(this, "long: $value")
    }
}

// v918: loop level
internal fun PlayerActivity.showV918LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v918loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v918loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v918: low level
internal fun PlayerActivity.showV918LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v918low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v918low = value
        AppToast.show(this, "low: $value")
    }
}

// v918: lower level
internal fun PlayerActivity.showV918LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v918lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v918lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v918: main level
internal fun PlayerActivity.showV918MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v918main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v918main = value
        AppToast.show(this, "main: $value")
    }
}

// v918: make mode
internal fun PlayerActivity.showV918MakeToggle() {
    val current = FeaturePrefsStore.batch911.v918make
    FeaturePrefsStore.batch911.v918make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v918: manage mode
internal fun PlayerActivity.showV918ManageToggle() {
    val current = FeaturePrefsStore.batch911.v918manage
    FeaturePrefsStore.batch911.v918manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v918: manifest mode
internal fun PlayerActivity.showV918ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v918manifest
    FeaturePrefsStore.batch911.v918manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v918: map mode
internal fun PlayerActivity.showV918MapToggle() {
    val current = FeaturePrefsStore.batch911.v918map
    FeaturePrefsStore.batch911.v918map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v918: margin mode
internal fun PlayerActivity.showV918MarginToggle() {
    val current = FeaturePrefsStore.batch911.v918margin
    FeaturePrefsStore.batch911.v918margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v919: local mode
internal fun PlayerActivity.showV919LocalToggle() {
    val current = FeaturePrefsStore.batch911.v919local
    FeaturePrefsStore.batch911.v919local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v919: lock mode
internal fun PlayerActivity.showV919LockToggle() {
    val current = FeaturePrefsStore.batch911.v919lock
    FeaturePrefsStore.batch911.v919lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v919: log mode
internal fun PlayerActivity.showV919LogToggle() {
    val current = FeaturePrefsStore.batch911.v919log
    FeaturePrefsStore.batch911.v919log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v919: logic mode
internal fun PlayerActivity.showV919LogicToggle() {
    val current = FeaturePrefsStore.batch911.v919logic
    FeaturePrefsStore.batch911.v919logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v919: login mode
internal fun PlayerActivity.showV919LoginToggle() {
    val current = FeaturePrefsStore.batch911.v919login
    FeaturePrefsStore.batch911.v919login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v919: long level
internal fun PlayerActivity.showV919LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v919long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v919long = value
        AppToast.show(this, "long: $value")
    }
}

// v919: loop level
internal fun PlayerActivity.showV919LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v919loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v919loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v919: low level
internal fun PlayerActivity.showV919LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v919low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v919low = value
        AppToast.show(this, "low: $value")
    }
}

// v919: lower level
internal fun PlayerActivity.showV919LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v919lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v919lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v919: main level
internal fun PlayerActivity.showV919MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v919main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v919main = value
        AppToast.show(this, "main: $value")
    }
}

// v919: make mode
internal fun PlayerActivity.showV919MakeToggle() {
    val current = FeaturePrefsStore.batch911.v919make
    FeaturePrefsStore.batch911.v919make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v919: manage mode
internal fun PlayerActivity.showV919ManageToggle() {
    val current = FeaturePrefsStore.batch911.v919manage
    FeaturePrefsStore.batch911.v919manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v919: manifest mode
internal fun PlayerActivity.showV919ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v919manifest
    FeaturePrefsStore.batch911.v919manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v919: map mode
internal fun PlayerActivity.showV919MapToggle() {
    val current = FeaturePrefsStore.batch911.v919map
    FeaturePrefsStore.batch911.v919map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v919: margin mode
internal fun PlayerActivity.showV919MarginToggle() {
    val current = FeaturePrefsStore.batch911.v919margin
    FeaturePrefsStore.batch911.v919margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}

// v920: local mode
internal fun PlayerActivity.showV920LocalToggle() {
    val current = FeaturePrefsStore.batch911.v920local
    FeaturePrefsStore.batch911.v920local = !current
    AppToast.show(this, "local: ${if (!current) "ON" else "OFF"}")
}

// v920: lock mode
internal fun PlayerActivity.showV920LockToggle() {
    val current = FeaturePrefsStore.batch911.v920lock
    FeaturePrefsStore.batch911.v920lock = !current
    AppToast.show(this, "lock: ${if (!current) "ON" else "OFF"}")
}

// v920: log mode
internal fun PlayerActivity.showV920LogToggle() {
    val current = FeaturePrefsStore.batch911.v920log
    FeaturePrefsStore.batch911.v920log = !current
    AppToast.show(this, "log: ${if (!current) "ON" else "OFF"}")
}

// v920: logic mode
internal fun PlayerActivity.showV920LogicToggle() {
    val current = FeaturePrefsStore.batch911.v920logic
    FeaturePrefsStore.batch911.v920logic = !current
    AppToast.show(this, "logic: ${if (!current) "ON" else "OFF"}")
}

// v920: login mode
internal fun PlayerActivity.showV920LoginToggle() {
    val current = FeaturePrefsStore.batch911.v920login
    FeaturePrefsStore.batch911.v920login = !current
    AppToast.show(this, "login: ${if (!current) "ON" else "OFF"}")
}

// v920: long level
internal fun PlayerActivity.showV920LongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v920long).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "long level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v920long = value
        AppToast.show(this, "long: $value")
    }
}

// v920: loop level
internal fun PlayerActivity.showV920LoopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v920loop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v920loop = value
        AppToast.show(this, "loop: $value")
    }
}

// v920: low level
internal fun PlayerActivity.showV920LowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v920low).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "low level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v920low = value
        AppToast.show(this, "low: $value")
    }
}

// v920: lower level
internal fun PlayerActivity.showV920LowerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v920lower).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lower level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v920lower = value
        AppToast.show(this, "lower: $value")
    }
}

// v920: main level
internal fun PlayerActivity.showV920MainDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch911.v920main).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "main level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch911.v920main = value
        AppToast.show(this, "main: $value")
    }
}

// v920: make mode
internal fun PlayerActivity.showV920MakeToggle() {
    val current = FeaturePrefsStore.batch911.v920make
    FeaturePrefsStore.batch911.v920make = !current
    AppToast.show(this, "make: ${if (!current) "ON" else "OFF"}")
}

// v920: manage mode
internal fun PlayerActivity.showV920ManageToggle() {
    val current = FeaturePrefsStore.batch911.v920manage
    FeaturePrefsStore.batch911.v920manage = !current
    AppToast.show(this, "manage: ${if (!current) "ON" else "OFF"}")
}

// v920: manifest mode
internal fun PlayerActivity.showV920ManifestToggle() {
    val current = FeaturePrefsStore.batch911.v920manifest
    FeaturePrefsStore.batch911.v920manifest = !current
    AppToast.show(this, "manifest: ${if (!current) "ON" else "OFF"}")
}

// v920: map mode
internal fun PlayerActivity.showV920MapToggle() {
    val current = FeaturePrefsStore.batch911.v920map
    FeaturePrefsStore.batch911.v920map = !current
    AppToast.show(this, "map: ${if (!current) "ON" else "OFF"}")
}

// v920: margin mode
internal fun PlayerActivity.showV920MarginToggle() {
    val current = FeaturePrefsStore.batch911.v920margin
    FeaturePrefsStore.batch911.v920margin = !current
    AppToast.show(this, "margin: ${if (!current) "ON" else "OFF"}")
}
