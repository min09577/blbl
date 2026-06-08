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

