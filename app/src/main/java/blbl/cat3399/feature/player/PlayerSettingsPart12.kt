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

// v169: Danmaku Render Flush Interval
internal fun PlayerActivity.showV169DanmakuRenderFlushIntervalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169danmakuRenderFlushInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Flush Interval",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169danmakuRenderFlushInterval = value
        AppToast.show(this, "Danmaku Render Flush Interval: $value")
    }
}

// v169: Subtitle Karaoke Shadow
internal fun PlayerActivity.showV169SubtitleKaraokeShadowToggle() {
    val current = BiliClient.prefs.v169subtitleKaraokeShadow
    BiliClient.prefs.v169subtitleKaraokeShadow = !current
    AppToast.show(this, "Subtitle Karaoke Shadow: ${if (!current) "ON" else "OFF"}")
}

// v170: Audio Gate Mix
internal fun PlayerActivity.showV170AudioGateMixDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v170audioGateMix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Mix",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170audioGateMix = value
        AppToast.show(this, "Audio Gate Mix: $value")
    }
}

// v170: Danmaku Render Flush Interval170
internal fun PlayerActivity.showV170DanmakuRenderFlushInterval170Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170danmakuRenderFlushInterval170).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Flush Interval170",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170danmakuRenderFlushInterval170 = value
        AppToast.show(this, "Danmaku Render Flush Interval170: $value")
    }
}

// v170: Subtitle Karaoke Shadow170
internal fun PlayerActivity.showV170SubtitleKaraokeShadow170Toggle() {
    val current = BiliClient.prefs.v170subtitleKaraokeShadow170
    BiliClient.prefs.v170subtitleKaraokeShadow170 = !current
    AppToast.show(this, "Subtitle Karaoke Shadow170: ${if (!current) "ON" else "OFF"}")
}

// v170: Gesture Pinch Out Action
internal fun PlayerActivity.showV170GesturePinchOutActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170gesturePinchOutAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Out Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170gesturePinchOutAction = value
        AppToast.show(this, "Gesture Pinch Out Action: $value")
    }
}

// v170: Cast Video PIP Resolution Scale170
internal fun PlayerActivity.showV170CastVideoPIPResolutionScale170Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170castVideoPIPResolutionScale170).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Resolution Scale170",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170castVideoPIPResolutionScale170 = value
        AppToast.show(this, "Cast Video PIP Resolution Scale170: $value")
    }
}

// v170: Playlist Auto Play Related170
internal fun PlayerActivity.showV170PlaylistAutoPlayRelated170Toggle() {
    val current = BiliClient.prefs.v170playlistAutoPlayRelated170
    BiliClient.prefs.v170playlistAutoPlayRelated170 = !current
    AppToast.show(this, "Playlist Auto Play Related170: ${if (!current) "ON" else "OFF"}")
}

// v170: Cache Cleanup Max Age
internal fun PlayerActivity.showV170CacheCleanupMaxAgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170cacheCleanupMaxAge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Max Age",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170cacheCleanupMaxAge = value
        AppToast.show(this, "Cache Cleanup Max Age: $value")
    }
}

// v170: Progress Bar Loaded Opacity170
internal fun PlayerActivity.showV170ProgressBarLoadedOpacity170Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170progressBarLoadedOpacity170).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Loaded Opacity170",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170progressBarLoadedOpacity170 = value
        AppToast.show(this, "Progress Bar Loaded Opacity170: $value")
    }
}

// v170: Volume Spatial Mode
internal fun PlayerActivity.showV170VolumeSpatialModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170volumeSpatialMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Spatial Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170volumeSpatialMode = value
        AppToast.show(this, "Volume Spatial Mode: $value")
    }
}

// v170: History Search Full Text170
internal fun PlayerActivity.showV170HistorySearchFullText170Toggle() {
    val current = BiliClient.prefs.v170historySearchFullText170
    BiliClient.prefs.v170historySearchFullText170 = !current
    AppToast.show(this, "History Search Full Text170: ${if (!current) "ON" else "OFF"}")
}

// v170: Playback Loop AB Toggle170
internal fun PlayerActivity.showV170PlaybackLoopABToggle170Toggle() {
    val current = BiliClient.prefs.v170playbackLoopABToggle170
    BiliClient.prefs.v170playbackLoopABToggle170 = !current
    AppToast.show(this, "Playback Loop AB Toggle170: ${if (!current) "ON" else "OFF"}")
}

// v170: Screenshot Watermark Toggle170
internal fun PlayerActivity.showV170ScreenshotWatermarkToggle170Toggle() {
    val current = BiliClient.prefs.v170screenshotWatermarkToggle170
    BiliClient.prefs.v170screenshotWatermarkToggle170 = !current
    AppToast.show(this, "Screenshot Watermark Toggle170: ${if (!current) "ON" else "OFF"}")
}

// v170: Video Sharpen Threshold170
internal fun PlayerActivity.showV170VideoSharpenThreshold170Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v170videoSharpenThreshold170).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Threshold170",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v170videoSharpenThreshold170 = value
        AppToast.show(this, "Video Sharpen Threshold170: $value")
    }
}

// v170: Danmaku Render Flush All
internal fun PlayerActivity.showV170DanmakuRenderFlushAllToggle() {
    val current = BiliClient.prefs.v170danmakuRenderFlushAll
    BiliClient.prefs.v170danmakuRenderFlushAll = !current
    AppToast.show(this, "Danmaku Render Flush All: ${if (!current) "ON" else "OFF"}")
}

// v170: Subtitle Karaoke Border
internal fun PlayerActivity.showV170SubtitleKaraokeBorderToggle() {
    val current = BiliClient.prefs.v170subtitleKaraokeBorder
    BiliClient.prefs.v170subtitleKaraokeBorder = !current
    AppToast.show(this, "Subtitle Karaoke Border: ${if (!current) "ON" else "OFF"}")
}

// v171: Audio Normalizer Toggle171
internal fun PlayerActivity.showV171AudioNormalizerToggle171Toggle() {
    val current = BiliClient.prefs.v171audioNormalizerToggle171
    BiliClient.prefs.v171audioNormalizerToggle171 = !current
    AppToast.show(this, "Audio Normalizer Toggle171: ${if (!current) "ON" else "OFF"}")
}

// v171: Danmaku Scroll Direction
internal fun PlayerActivity.showV171DanmakuScrollDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171danmakuScrollDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Direction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171danmakuScrollDirection = value
        AppToast.show(this, "Danmaku Scroll Direction: $value")
    }
}

// v171: Subtitle Font Spacing
internal fun PlayerActivity.showV171SubtitleFontSpacingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171subtitleFontSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171subtitleFontSpacing = value
        AppToast.show(this, "Subtitle Font Spacing: $value")
    }
}

// v171: Gesture Tap Double Action
internal fun PlayerActivity.showV171GestureTapDoubleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171gestureTapDoubleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Double Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171gestureTapDoubleAction = value
        AppToast.show(this, "Gesture Tap Double Action: $value")
    }
}

// v171: Cast Video PIP FPS Limit
internal fun PlayerActivity.showV171CastVideoPIPFPSLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171castVideoPIPFPSLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP FPS Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171castVideoPIPFPSLimit = value
        AppToast.show(this, "Cast Video PIP FPS Limit: $value")
    }
}

// v171: Playlist Auto Add Related
internal fun PlayerActivity.showV171PlaylistAutoAddRelatedToggle() {
    val current = BiliClient.prefs.v171playlistAutoAddRelated
    BiliClient.prefs.v171playlistAutoAddRelated = !current
    AppToast.show(this, "Playlist Auto Add Related: ${if (!current) "ON" else "OFF"}")
}

// v171: Cache Disk Quota MB
internal fun PlayerActivity.showV171CacheDiskQuotaMBDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171cacheDiskQuotaMB).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Disk Quota MB",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171cacheDiskQuotaMB = value
        AppToast.show(this, "Cache Disk Quota MB: $value")
    }
}

// v171: Progress Bar Scrub Preview
internal fun PlayerActivity.showV171ProgressBarScrubPreviewToggle() {
    val current = BiliClient.prefs.v171progressBarScrubPreview
    BiliClient.prefs.v171progressBarScrubPreview = !current
    AppToast.show(this, "Progress Bar Scrub Preview: ${if (!current) "ON" else "OFF"}")
}

// v171: Volume Balance LR
internal fun PlayerActivity.showV171VolumeBalanceLRDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v171volumeBalanceLR).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Balance LR",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171volumeBalanceLR = value
        AppToast.show(this, "Volume Balance LR: $value")
    }
}

// v171: History Group By Date
internal fun PlayerActivity.showV171HistoryGroupByDateToggle() {
    val current = BiliClient.prefs.v171historyGroupByDate
    BiliClient.prefs.v171historyGroupByDate = !current
    AppToast.show(this, "History Group By Date: ${if (!current) "ON" else "OFF"}")
}

// v171: Playback Audio Offset
internal fun PlayerActivity.showV171PlaybackAudioOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171playbackAudioOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Audio Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171playbackAudioOffset = value
        AppToast.show(this, "Playback Audio Offset: $value")
    }
}

// v171: Screenshot Overlay Info
internal fun PlayerActivity.showV171ScreenshotOverlayInfoToggle() {
    val current = BiliClient.prefs.v171screenshotOverlayInfo
    BiliClient.prefs.v171screenshotOverlayInfo = !current
    AppToast.show(this, "Screenshot Overlay Info: ${if (!current) "ON" else "OFF"}")
}

// v171: Video Contrast Toggle171
internal fun PlayerActivity.showV171VideoContrastToggle171Toggle() {
    val current = BiliClient.prefs.v171videoContrastToggle171
    BiliClient.prefs.v171videoContrastToggle171 = !current
    AppToast.show(this, "Video Contrast Toggle171: ${if (!current) "ON" else "OFF"}")
}

// v171: Danmaku Scroll Speed
internal fun PlayerActivity.showV171DanmakuScrollSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171danmakuScrollSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171danmakuScrollSpeed = value
        AppToast.show(this, "Danmaku Scroll Speed: $value")
    }
}

// v171: Subtitle Line Spacing
internal fun PlayerActivity.showV171SubtitleLineSpacingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v171subtitleLineSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Line Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v171subtitleLineSpacing = value
        AppToast.show(this, "Subtitle Line Spacing: $value")
    }
}

// v172: Audio Normalizer Target172
internal fun PlayerActivity.showV172AudioNormalizerTarget172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172audioNormalizerTarget172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Normalizer Target172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172audioNormalizerTarget172 = value
        AppToast.show(this, "Audio Normalizer Target172: $value")
    }
}

// v172: Danmaku Scroll Speed172
internal fun PlayerActivity.showV172DanmakuScrollSpeed172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172danmakuScrollSpeed172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172danmakuScrollSpeed172 = value
        AppToast.show(this, "Danmaku Scroll Speed172: $value")
    }
}

// v172: Subtitle Line Spacing172
internal fun PlayerActivity.showV172SubtitleLineSpacing172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172subtitleLineSpacing172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Line Spacing172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172subtitleLineSpacing172 = value
        AppToast.show(this, "Subtitle Line Spacing172: $value")
    }
}

// v172: Gesture Tap Double Action172
internal fun PlayerActivity.showV172GestureTapDoubleAction172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172gestureTapDoubleAction172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Double Action172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172gestureTapDoubleAction172 = value
        AppToast.show(this, "Gesture Tap Double Action172: $value")
    }
}

// v172: Cast Video PIP FPS Limit172
internal fun PlayerActivity.showV172CastVideoPIPFPSLimit172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172castVideoPIPFPSLimit172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP FPS Limit172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172castVideoPIPFPSLimit172 = value
        AppToast.show(this, "Cast Video PIP FPS Limit172: $value")
    }
}

// v172: Playlist Auto Add Related172
internal fun PlayerActivity.showV172PlaylistAutoAddRelated172Toggle() {
    val current = BiliClient.prefs.v172playlistAutoAddRelated172
    BiliClient.prefs.v172playlistAutoAddRelated172 = !current
    AppToast.show(this, "Playlist Auto Add Related172: ${if (!current) "ON" else "OFF"}")
}

// v172: Cache Disk Quota MB172
internal fun PlayerActivity.showV172CacheDiskQuotaMB172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172cacheDiskQuotaMB172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Disk Quota MB172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172cacheDiskQuotaMB172 = value
        AppToast.show(this, "Cache Disk Quota MB172: $value")
    }
}

// v172: Progress Bar Scrub Preview172
internal fun PlayerActivity.showV172ProgressBarScrubPreview172Toggle() {
    val current = BiliClient.prefs.v172progressBarScrubPreview172
    BiliClient.prefs.v172progressBarScrubPreview172 = !current
    AppToast.show(this, "Progress Bar Scrub Preview172: ${if (!current) "ON" else "OFF"}")
}

// v172: Volume Balance LR172
internal fun PlayerActivity.showV172VolumeBalanceLR172Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v172volumeBalanceLR172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Balance LR172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172volumeBalanceLR172 = value
        AppToast.show(this, "Volume Balance LR172: $value")
    }
}

// v172: History Group By Date172
internal fun PlayerActivity.showV172HistoryGroupByDate172Toggle() {
    val current = BiliClient.prefs.v172historyGroupByDate172
    BiliClient.prefs.v172historyGroupByDate172 = !current
    AppToast.show(this, "History Group By Date172: ${if (!current) "ON" else "OFF"}")
}

// v172: Playback Audio Offset172
internal fun PlayerActivity.showV172PlaybackAudioOffset172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172playbackAudioOffset172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Audio Offset172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172playbackAudioOffset172 = value
        AppToast.show(this, "Playback Audio Offset172: $value")
    }
}

// v172: Screenshot Overlay Info172
internal fun PlayerActivity.showV172ScreenshotOverlayInfo172Toggle() {
    val current = BiliClient.prefs.v172screenshotOverlayInfo172
    BiliClient.prefs.v172screenshotOverlayInfo172 = !current
    AppToast.show(this, "Screenshot Overlay Info172: ${if (!current) "ON" else "OFF"}")
}

// v172: Video Contrast Level172
internal fun PlayerActivity.showV172VideoContrastLevel172Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172videoContrastLevel172).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Contrast Level172",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172videoContrastLevel172 = value
        AppToast.show(this, "Video Contrast Level172: $value")
    }
}

// v172: Danmaku Scroll Overlap
internal fun PlayerActivity.showV172DanmakuScrollOverlapToggle() {
    val current = BiliClient.prefs.v172danmakuScrollOverlap
    BiliClient.prefs.v172danmakuScrollOverlap = !current
    AppToast.show(this, "Danmaku Scroll Overlap: ${if (!current) "ON" else "OFF"}")
}

// v172: Subtitle Background Padding
internal fun PlayerActivity.showV172SubtitleBackgroundPaddingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v172subtitleBackgroundPadding).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Background Padding",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v172subtitleBackgroundPadding = value
        AppToast.show(this, "Subtitle Background Padding: $value")
    }
}

// v173: Audio Normalizer Strength173
internal fun PlayerActivity.showV173AudioNormalizerStrength173Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173audioNormalizerStrength173).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Normalizer Strength173",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173audioNormalizerStrength173 = value
        AppToast.show(this, "Audio Normalizer Strength173: $value")
    }
}

// v173: Danmaku Scroll Overlap173
internal fun PlayerActivity.showV173DanmakuScrollOverlap173Toggle() {
    val current = BiliClient.prefs.v173danmakuScrollOverlap173
    BiliClient.prefs.v173danmakuScrollOverlap173 = !current
    AppToast.show(this, "Danmaku Scroll Overlap173: ${if (!current) "ON" else "OFF"}")
}

// v173: Subtitle Background Padding173
internal fun PlayerActivity.showV173SubtitleBackgroundPadding173Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173subtitleBackgroundPadding173).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Background Padding173",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173subtitleBackgroundPadding173 = value
        AppToast.show(this, "Subtitle Background Padding173: $value")
    }
}

// v173: Gesture Tap Triple Action
internal fun PlayerActivity.showV173GestureTapTripleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173gestureTapTripleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Triple Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173gestureTapTripleAction = value
        AppToast.show(this, "Gesture Tap Triple Action: $value")
    }
}

// v173: Cast Video PIP Connect Auto
internal fun PlayerActivity.showV173CastVideoPIPConnectAutoToggle() {
    val current = BiliClient.prefs.v173castVideoPIPConnectAuto
    BiliClient.prefs.v173castVideoPIPConnectAuto = !current
    AppToast.show(this, "Cast Video PIP Connect Auto: ${if (!current) "ON" else "OFF"}")
}

// v173: Playlist Auto Next On End
internal fun PlayerActivity.showV173PlaylistAutoNextOnEndToggle() {
    val current = BiliClient.prefs.v173playlistAutoNextOnEnd
    BiliClient.prefs.v173playlistAutoNextOnEnd = !current
    AppToast.show(this, "Playlist Auto Next On End: ${if (!current) "ON" else "OFF"}")
}

// v173: Cache Compress Toggle173
internal fun PlayerActivity.showV173CacheCompressToggle173Toggle() {
    val current = BiliClient.prefs.v173cacheCompressToggle173
    BiliClient.prefs.v173cacheCompressToggle173 = !current
    AppToast.show(this, "Cache Compress Toggle173: ${if (!current) "ON" else "OFF"}")
}

// v173: Progress Bar Scrub Preview Size
internal fun PlayerActivity.showV173ProgressBarScrubPreviewSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173progressBarScrubPreviewSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Scrub Preview Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173progressBarScrubPreviewSize = value
        AppToast.show(this, "Progress Bar Scrub Preview Size: $value")
    }
}

// v173: Volume Normalize Track
internal fun PlayerActivity.showV173VolumeNormalizeTrackToggle() {
    val current = BiliClient.prefs.v173volumeNormalizeTrack
    BiliClient.prefs.v173volumeNormalizeTrack = !current
    AppToast.show(this, "Volume Normalize Track: ${if (!current) "ON" else "OFF"}")
}

// v173: History Group By Uploader
internal fun PlayerActivity.showV173HistoryGroupByUploaderToggle() {
    val current = BiliClient.prefs.v173historyGroupByUploader
    BiliClient.prefs.v173historyGroupByUploader = !current
    AppToast.show(this, "History Group By Uploader: ${if (!current) "ON" else "OFF"}")
}

// v173: Playback Subtitle Offset
internal fun PlayerActivity.showV173PlaybackSubtitleOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173playbackSubtitleOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Subtitle Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173playbackSubtitleOffset = value
        AppToast.show(this, "Playback Subtitle Offset: $value")
    }
}

// v173: Screenshot Overlay Date
internal fun PlayerActivity.showV173ScreenshotOverlayDateToggle() {
    val current = BiliClient.prefs.v173screenshotOverlayDate
    BiliClient.prefs.v173screenshotOverlayDate = !current
    AppToast.show(this, "Screenshot Overlay Date: ${if (!current) "ON" else "OFF"}")
}

// v173: Video Contrast Level173
internal fun PlayerActivity.showV173VideoContrastLevel173Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173videoContrastLevel173).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Contrast Level173",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173videoContrastLevel173 = value
        AppToast.show(this, "Video Contrast Level173: $value")
    }
}

// v173: Danmaku Scroll Max Lines
internal fun PlayerActivity.showV173DanmakuScrollMaxLinesDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173danmakuScrollMaxLines).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Max Lines",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173danmakuScrollMaxLines = value
        AppToast.show(this, "Danmaku Scroll Max Lines: $value")
    }
}

// v173: Subtitle Background Round
internal fun PlayerActivity.showV173SubtitleBackgroundRoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v173subtitleBackgroundRound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Background Round",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v173subtitleBackgroundRound = value
        AppToast.show(this, "Subtitle Background Round: $value")
    }
}

// v174: Audio Normalizer Attack174
internal fun PlayerActivity.showV174AudioNormalizerAttack174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174audioNormalizerAttack174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Normalizer Attack174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174audioNormalizerAttack174 = value
        AppToast.show(this, "Audio Normalizer Attack174: $value")
    }
}

// v174: Danmaku Scroll Max Lines174
internal fun PlayerActivity.showV174DanmakuScrollMaxLines174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174danmakuScrollMaxLines174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Max Lines174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174danmakuScrollMaxLines174 = value
        AppToast.show(this, "Danmaku Scroll Max Lines174: $value")
    }
}

// v174: Subtitle Background Round174
internal fun PlayerActivity.showV174SubtitleBackgroundRound174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174subtitleBackgroundRound174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Background Round174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174subtitleBackgroundRound174 = value
        AppToast.show(this, "Subtitle Background Round174: $value")
    }
}

// v174: Gesture Tap Triple Action174
internal fun PlayerActivity.showV174GestureTapTripleAction174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174gestureTapTripleAction174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Triple Action174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174gestureTapTripleAction174 = value
        AppToast.show(this, "Gesture Tap Triple Action174: $value")
    }
}

// v174: Cast Video PIP Connect Auto174
internal fun PlayerActivity.showV174CastVideoPIPConnectAuto174Toggle() {
    val current = BiliClient.prefs.v174castVideoPIPConnectAuto174
    BiliClient.prefs.v174castVideoPIPConnectAuto174 = !current
    AppToast.show(this, "Cast Video PIP Connect Auto174: ${if (!current) "ON" else "OFF"}")
}

// v174: Playlist Auto Next On End174
internal fun PlayerActivity.showV174PlaylistAutoNextOnEnd174Toggle() {
    val current = BiliClient.prefs.v174playlistAutoNextOnEnd174
    BiliClient.prefs.v174playlistAutoNextOnEnd174 = !current
    AppToast.show(this, "Playlist Auto Next On End174: ${if (!current) "ON" else "OFF"}")
}

// v174: Cache Compress Level174
internal fun PlayerActivity.showV174CacheCompressLevel174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174cacheCompressLevel174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Compress Level174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174cacheCompressLevel174 = value
        AppToast.show(this, "Cache Compress Level174: $value")
    }
}

// v174: Progress Bar Scrub Preview Text
internal fun PlayerActivity.showV174ProgressBarScrubPreviewTextToggle() {
    val current = BiliClient.prefs.v174progressBarScrubPreviewText
    BiliClient.prefs.v174progressBarScrubPreviewText = !current
    AppToast.show(this, "Progress Bar Scrub Preview Text: ${if (!current) "ON" else "OFF"}")
}

// v174: Volume Normalize Track174
internal fun PlayerActivity.showV174VolumeNormalizeTrack174Toggle() {
    val current = BiliClient.prefs.v174volumeNormalizeTrack174
    BiliClient.prefs.v174volumeNormalizeTrack174 = !current
    AppToast.show(this, "Volume Normalize Track174: ${if (!current) "ON" else "OFF"}")
}

// v174: History Group By Uploader174
internal fun PlayerActivity.showV174HistoryGroupByUploader174Toggle() {
    val current = BiliClient.prefs.v174historyGroupByUploader174
    BiliClient.prefs.v174historyGroupByUploader174 = !current
    AppToast.show(this, "History Group By Uploader174: ${if (!current) "ON" else "OFF"}")
}

// v174: Playback Subtitle Offset174
internal fun PlayerActivity.showV174PlaybackSubtitleOffset174Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174playbackSubtitleOffset174).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Subtitle Offset174",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174playbackSubtitleOffset174 = value
        AppToast.show(this, "Playback Subtitle Offset174: $value")
    }
}

// v174: Screenshot Overlay Title
internal fun PlayerActivity.showV174ScreenshotOverlayTitleToggle() {
    val current = BiliClient.prefs.v174screenshotOverlayTitle
    BiliClient.prefs.v174screenshotOverlayTitle = !current
    AppToast.show(this, "Screenshot Overlay Title: ${if (!current) "ON" else "OFF"}")
}

// v174: Video Saturation Toggle174
internal fun PlayerActivity.showV174VideoSaturationToggle174Toggle() {
    val current = BiliClient.prefs.v174videoSaturationToggle174
    BiliClient.prefs.v174videoSaturationToggle174 = !current
    AppToast.show(this, "Video Saturation Toggle174: ${if (!current) "ON" else "OFF"}")
}

// v174: Danmaku Scroll Overlap Mode
internal fun PlayerActivity.showV174DanmakuScrollOverlapModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v174danmakuScrollOverlapMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Overlap Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v174danmakuScrollOverlapMode = value
        AppToast.show(this, "Danmaku Scroll Overlap Mode: $value")
    }
}

// v174: Subtitle Shadow Toggle174
internal fun PlayerActivity.showV174SubtitleShadowToggle174Toggle() {
    val current = BiliClient.prefs.v174subtitleShadowToggle174
    BiliClient.prefs.v174subtitleShadowToggle174 = !current
    AppToast.show(this, "Subtitle Shadow Toggle174: ${if (!current) "ON" else "OFF"}")
}

// v175: Audio Compressor Ratio175
internal fun PlayerActivity.showV175AudioCompressorRatio175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175audioCompressorRatio175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175audioCompressorRatio175 = value
        AppToast.show(this, "Audio Compressor Ratio175: $value")
    }
}

// v175: Danmaku Scroll Overlap Mode175
internal fun PlayerActivity.showV175DanmakuScrollOverlapMode175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175danmakuScrollOverlapMode175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Overlap Mode175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175danmakuScrollOverlapMode175 = value
        AppToast.show(this, "Danmaku Scroll Overlap Mode175: $value")
    }
}

// v175: Subtitle Shadow Toggle175
internal fun PlayerActivity.showV175SubtitleShadowToggle175Toggle() {
    val current = BiliClient.prefs.v175subtitleShadowToggle175
    BiliClient.prefs.v175subtitleShadowToggle175 = !current
    AppToast.show(this, "Subtitle Shadow Toggle175: ${if (!current) "ON" else "OFF"}")
}

// v175: Gesture Double Tap Seek
internal fun PlayerActivity.showV175GestureDoubleTapSeekDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175gestureDoubleTapSeek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Seek",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175gestureDoubleTapSeek = value
        AppToast.show(this, "Gesture Double Tap Seek: $value")
    }
}

// v175: Cast Video PIP Disconnect Action
internal fun PlayerActivity.showV175CastVideoPIPDisconnectActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175castVideoPIPDisconnectAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Disconnect Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175castVideoPIPDisconnectAction = value
        AppToast.show(this, "Cast Video PIP Disconnect Action: $value")
    }
}

// v175: Playlist Skip On Error
internal fun PlayerActivity.showV175PlaylistSkipOnErrorToggle() {
    val current = BiliClient.prefs.v175playlistSkipOnError
    BiliClient.prefs.v175playlistSkipOnError = !current
    AppToast.show(this, "Playlist Skip On Error: ${if (!current) "ON" else "OFF"}")
}

// v175: Cache Compress Level175
internal fun PlayerActivity.showV175CacheCompressLevel175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175cacheCompressLevel175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Compress Level175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175cacheCompressLevel175 = value
        AppToast.show(this, "Cache Compress Level175: $value")
    }
}

// v175: Progress Bar Scrub Haptic
internal fun PlayerActivity.showV175ProgressBarScrubHapticToggle() {
    val current = BiliClient.prefs.v175progressBarScrubHaptic
    BiliClient.prefs.v175progressBarScrubHaptic = !current
    AppToast.show(this, "Progress Bar Scrub Haptic: ${if (!current) "ON" else "OFF"}")
}

// v175: Volume Normalize Album
internal fun PlayerActivity.showV175VolumeNormalizeAlbumToggle() {
    val current = BiliClient.prefs.v175volumeNormalizeAlbum
    BiliClient.prefs.v175volumeNormalizeAlbum = !current
    AppToast.show(this, "Volume Normalize Album: ${if (!current) "ON" else "OFF"}")
}

// v175: History Filter By Duration
internal fun PlayerActivity.showV175HistoryFilterByDurationToggle() {
    val current = BiliClient.prefs.v175historyFilterByDuration
    BiliClient.prefs.v175historyFilterByDuration = !current
    AppToast.show(this, "History Filter By Duration: ${if (!current) "ON" else "OFF"}")
}

// v175: Playback Video Offset
internal fun PlayerActivity.showV175PlaybackVideoOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175playbackVideoOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Video Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175playbackVideoOffset = value
        AppToast.show(this, "Playback Video Offset: $value")
    }
}

// v175: Screenshot Overlay Channel
internal fun PlayerActivity.showV175ScreenshotOverlayChannelToggle() {
    val current = BiliClient.prefs.v175screenshotOverlayChannel
    BiliClient.prefs.v175screenshotOverlayChannel = !current
    AppToast.show(this, "Screenshot Overlay Channel: ${if (!current) "ON" else "OFF"}")
}

// v175: Video Saturation Level175
internal fun PlayerActivity.showV175VideoSaturationLevel175Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175videoSaturationLevel175).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Saturation Level175",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175videoSaturationLevel175 = value
        AppToast.show(this, "Video Saturation Level175: $value")
    }
}

// v175: Danmaku Scroll Filter
internal fun PlayerActivity.showV175DanmakuScrollFilterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175danmakuScrollFilter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Filter",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175danmakuScrollFilter = value
        AppToast.show(this, "Danmaku Scroll Filter: $value")
    }
}

// v175: Subtitle Shadow Color
internal fun PlayerActivity.showV175SubtitleShadowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v175subtitleShadowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v175subtitleShadowColor = value
        AppToast.show(this, "Subtitle Shadow Color: $value")
    }
}

// v176: Audio Compressor Ratio176
internal fun PlayerActivity.showV176AudioCompressorRatio176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176audioCompressorRatio176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176audioCompressorRatio176 = value
        AppToast.show(this, "Audio Compressor Ratio176: $value")
    }
}

// v176: Danmaku Scroll Filter176
internal fun PlayerActivity.showV176DanmakuScrollFilter176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176danmakuScrollFilter176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Filter176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176danmakuScrollFilter176 = value
        AppToast.show(this, "Danmaku Scroll Filter176: $value")
    }
}

// v176: Subtitle Shadow Color176
internal fun PlayerActivity.showV176SubtitleShadowColor176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176subtitleShadowColor176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Color176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176subtitleShadowColor176 = value
        AppToast.show(this, "Subtitle Shadow Color176: $value")
    }
}

// v176: Gesture Double Tap Seek176
internal fun PlayerActivity.showV176GestureDoubleTapSeek176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176gestureDoubleTapSeek176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Seek176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176gestureDoubleTapSeek176 = value
        AppToast.show(this, "Gesture Double Tap Seek176: $value")
    }
}

// v176: Cast Video PIP Reconnect
internal fun PlayerActivity.showV176CastVideoPIPReconnectToggle() {
    val current = BiliClient.prefs.v176castVideoPIPReconnect
    BiliClient.prefs.v176castVideoPIPReconnect = !current
    AppToast.show(this, "Cast Video PIP Reconnect: ${if (!current) "ON" else "OFF"}")
}

// v176: Playlist Skip On Error176
internal fun PlayerActivity.showV176PlaylistSkipOnError176Toggle() {
    val current = BiliClient.prefs.v176playlistSkipOnError176
    BiliClient.prefs.v176playlistSkipOnError176 = !current
    AppToast.show(this, "Playlist Skip On Error176: ${if (!current) "ON" else "OFF"}")
}

// v176: Cache Stream Buffer Size
internal fun PlayerActivity.showV176CacheStreamBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176cacheStreamBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Stream Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176cacheStreamBufferSize = value
        AppToast.show(this, "Cache Stream Buffer Size: $value")
    }
}

// v176: Progress Bar Scrub Haptic176
internal fun PlayerActivity.showV176ProgressBarScrubHaptic176Toggle() {
    val current = BiliClient.prefs.v176progressBarScrubHaptic176
    BiliClient.prefs.v176progressBarScrubHaptic176 = !current
    AppToast.show(this, "Progress Bar Scrub Haptic176: ${if (!current) "ON" else "OFF"}")
}

// v176: Volume Normalize Album176
internal fun PlayerActivity.showV176VolumeNormalizeAlbum176Toggle() {
    val current = BiliClient.prefs.v176volumeNormalizeAlbum176
    BiliClient.prefs.v176volumeNormalizeAlbum176 = !current
    AppToast.show(this, "Volume Normalize Album176: ${if (!current) "ON" else "OFF"}")
}

// v176: History Filter By Duration176
internal fun PlayerActivity.showV176HistoryFilterByDuration176Toggle() {
    val current = BiliClient.prefs.v176historyFilterByDuration176
    BiliClient.prefs.v176historyFilterByDuration176 = !current
    AppToast.show(this, "History Filter By Duration176: ${if (!current) "ON" else "OFF"}")
}

// v176: Playback Video Offset176
internal fun PlayerActivity.showV176PlaybackVideoOffset176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176playbackVideoOffset176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Video Offset176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176playbackVideoOffset176 = value
        AppToast.show(this, "Playback Video Offset176: $value")
    }
}

// v176: Screenshot Overlay Quality
internal fun PlayerActivity.showV176ScreenshotOverlayQualityToggle() {
    val current = BiliClient.prefs.v176screenshotOverlayQuality
    BiliClient.prefs.v176screenshotOverlayQuality = !current
    AppToast.show(this, "Screenshot Overlay Quality: ${if (!current) "ON" else "OFF"}")
}

// v176: Video Saturation Level176
internal fun PlayerActivity.showV176VideoSaturationLevel176Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176videoSaturationLevel176).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Saturation Level176",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176videoSaturationLevel176 = value
        AppToast.show(this, "Video Saturation Level176: $value")
    }
}

// v176: Danmaku Scroll Hide On Action
internal fun PlayerActivity.showV176DanmakuScrollHideOnActionToggle() {
    val current = BiliClient.prefs.v176danmakuScrollHideOnAction
    BiliClient.prefs.v176danmakuScrollHideOnAction = !current
    AppToast.show(this, "Danmaku Scroll Hide On Action: ${if (!current) "ON" else "OFF"}")
}

// v176: Subtitle Shadow Blur
internal fun PlayerActivity.showV176SubtitleShadowBlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v176subtitleShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v176subtitleShadowBlur = value
        AppToast.show(this, "Subtitle Shadow Blur: $value")
    }
}

// v177: Audio Compressor Knee177
internal fun PlayerActivity.showV177AudioCompressorKnee177Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177audioCompressorKnee177).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Knee177",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177audioCompressorKnee177 = value
        AppToast.show(this, "Audio Compressor Knee177: $value")
    }
}

// v177: Danmaku Scroll Hide On Action177
internal fun PlayerActivity.showV177DanmakuScrollHideOnAction177Toggle() {
    val current = BiliClient.prefs.v177danmakuScrollHideOnAction177
    BiliClient.prefs.v177danmakuScrollHideOnAction177 = !current
    AppToast.show(this, "Danmaku Scroll Hide On Action177: ${if (!current) "ON" else "OFF"}")
}

// v177: Subtitle Shadow Blur177
internal fun PlayerActivity.showV177SubtitleShadowBlur177Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177subtitleShadowBlur177).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Blur177",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177subtitleShadowBlur177 = value
        AppToast.show(this, "Subtitle Shadow Blur177: $value")
    }
}

// v177: Gesture Double Tap Play Pause
internal fun PlayerActivity.showV177GestureDoubleTapPlayPauseToggle() {
    val current = BiliClient.prefs.v177gestureDoubleTapPlayPause
    BiliClient.prefs.v177gestureDoubleTapPlayPause = !current
    AppToast.show(this, "Gesture Double Tap Play Pause: ${if (!current) "ON" else "OFF"}")
}

// v177: Cast Video PIP Reconnect177
internal fun PlayerActivity.showV177CastVideoPIPReconnect177Toggle() {
    val current = BiliClient.prefs.v177castVideoPIPReconnect177
    BiliClient.prefs.v177castVideoPIPReconnect177 = !current
    AppToast.show(this, "Cast Video PIP Reconnect177: ${if (!current) "ON" else "OFF"}")
}

// v177: Playlist Max History Size
internal fun PlayerActivity.showV177PlaylistMaxHistorySizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177playlistMaxHistorySize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Max History Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177playlistMaxHistorySize = value
        AppToast.show(this, "Playlist Max History Size: $value")
    }
}

// v177: Cache Stream Buffer Size177
internal fun PlayerActivity.showV177CacheStreamBufferSize177Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177cacheStreamBufferSize177).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Stream Buffer Size177",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177cacheStreamBufferSize177 = value
        AppToast.show(this, "Cache Stream Buffer Size177: $value")
    }
}

// v177: Progress Bar Scrub Timeline
internal fun PlayerActivity.showV177ProgressBarScrubTimelineToggle() {
    val current = BiliClient.prefs.v177progressBarScrubTimeline
    BiliClient.prefs.v177progressBarScrubTimeline = !current
    AppToast.show(this, "Progress Bar Scrub Timeline: ${if (!current) "ON" else "OFF"}")
}

// v177: Volume Normalize Track177
internal fun PlayerActivity.showV177VolumeNormalizeTrack177Toggle() {
    val current = BiliClient.prefs.v177volumeNormalizeTrack177
    BiliClient.prefs.v177volumeNormalizeTrack177 = !current
    AppToast.show(this, "Volume Normalize Track177: ${if (!current) "ON" else "OFF"}")
}

// v177: History Filter By Uploader
internal fun PlayerActivity.showV177HistoryFilterByUploaderToggle() {
    val current = BiliClient.prefs.v177historyFilterByUploader
    BiliClient.prefs.v177historyFilterByUploader = !current
    AppToast.show(this, "History Filter By Uploader: ${if (!current) "ON" else "OFF"}")
}

// v177: Playback Deinterlace Toggle
internal fun PlayerActivity.showV177PlaybackDeinterlaceToggleToggle() {
    val current = BiliClient.prefs.v177playbackDeinterlaceToggle
    BiliClient.prefs.v177playbackDeinterlaceToggle = !current
    AppToast.show(this, "Playback Deinterlace Toggle: ${if (!current) "ON" else "OFF"}")
}

// v177: Screenshot Overlay Bitrate
internal fun PlayerActivity.showV177ScreenshotOverlayBitrateToggle() {
    val current = BiliClient.prefs.v177screenshotOverlayBitrate
    BiliClient.prefs.v177screenshotOverlayBitrate = !current
    AppToast.show(this, "Screenshot Overlay Bitrate: ${if (!current) "ON" else "OFF"}")
}

// v177: Video Brightness Toggle177
internal fun PlayerActivity.showV177VideoBrightnessToggle177Toggle() {
    val current = BiliClient.prefs.v177videoBrightnessToggle177
    BiliClient.prefs.v177videoBrightnessToggle177 = !current
    AppToast.show(this, "Video Brightness Toggle177: ${if (!current) "ON" else "OFF"}")
}

// v177: Danmaku Scroll Auto Speed
internal fun PlayerActivity.showV177DanmakuScrollAutoSpeedToggle() {
    val current = BiliClient.prefs.v177danmakuScrollAutoSpeed
    BiliClient.prefs.v177danmakuScrollAutoSpeed = !current
    AppToast.show(this, "Danmaku Scroll Auto Speed: ${if (!current) "ON" else "OFF"}")
}

// v177: Subtitle Shadow Offset
internal fun PlayerActivity.showV177SubtitleShadowOffsetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v177subtitleShadowOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v177subtitleShadowOffset = value
        AppToast.show(this, "Subtitle Shadow Offset: $value")
    }
}

// v178: Audio Compressor Attack178
internal fun PlayerActivity.showV178AudioCompressorAttack178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178audioCompressorAttack178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Attack178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178audioCompressorAttack178 = value
        AppToast.show(this, "Audio Compressor Attack178: $value")
    }
}

// v178: Danmaku Scroll Auto Speed178
internal fun PlayerActivity.showV178DanmakuScrollAutoSpeed178Toggle() {
    val current = BiliClient.prefs.v178danmakuScrollAutoSpeed178
    BiliClient.prefs.v178danmakuScrollAutoSpeed178 = !current
    AppToast.show(this, "Danmaku Scroll Auto Speed178: ${if (!current) "ON" else "OFF"}")
}

// v178: Subtitle Shadow Offset178
internal fun PlayerActivity.showV178SubtitleShadowOffset178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178subtitleShadowOffset178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178subtitleShadowOffset178 = value
        AppToast.show(this, "Subtitle Shadow Offset178: $value")
    }
}

// v178: Gesture Double Tap Play Pause178
internal fun PlayerActivity.showV178GestureDoubleTapPlayPause178Toggle() {
    val current = BiliClient.prefs.v178gestureDoubleTapPlayPause178
    BiliClient.prefs.v178gestureDoubleTapPlayPause178 = !current
    AppToast.show(this, "Gesture Double Tap Play Pause178: ${if (!current) "ON" else "OFF"}")
}

// v178: Cast Video PIP Resolution Lock
internal fun PlayerActivity.showV178CastVideoPIPResolutionLockToggle() {
    val current = BiliClient.prefs.v178castVideoPIPResolutionLock
    BiliClient.prefs.v178castVideoPIPResolutionLock = !current
    AppToast.show(this, "Cast Video PIP Resolution Lock: ${if (!current) "ON" else "OFF"}")
}

// v178: Playlist Max History Size178
internal fun PlayerActivity.showV178PlaylistMaxHistorySize178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178playlistMaxHistorySize178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Max History Size178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178playlistMaxHistorySize178 = value
        AppToast.show(this, "Playlist Max History Size178: $value")
    }
}

// v178: Cache Stream Prefetch
internal fun PlayerActivity.showV178CacheStreamPrefetchToggle() {
    val current = BiliClient.prefs.v178cacheStreamPrefetch
    BiliClient.prefs.v178cacheStreamPrefetch = !current
    AppToast.show(this, "Cache Stream Prefetch: ${if (!current) "ON" else "OFF"}")
}

// v178: Progress Bar Scrub Timeline178
internal fun PlayerActivity.showV178ProgressBarScrubTimeline178Toggle() {
    val current = BiliClient.prefs.v178progressBarScrubTimeline178
    BiliClient.prefs.v178progressBarScrubTimeline178 = !current
    AppToast.show(this, "Progress Bar Scrub Timeline178: ${if (!current) "ON" else "OFF"}")
}

// v178: Volume Normalize Track178
internal fun PlayerActivity.showV178VolumeNormalizeTrack178Toggle() {
    val current = BiliClient.prefs.v178volumeNormalizeTrack178
    BiliClient.prefs.v178volumeNormalizeTrack178 = !current
    AppToast.show(this, "Volume Normalize Track178: ${if (!current) "ON" else "OFF"}")
}

// v178: History Filter By Uploader178
internal fun PlayerActivity.showV178HistoryFilterByUploader178Toggle() {
    val current = BiliClient.prefs.v178historyFilterByUploader178
    BiliClient.prefs.v178historyFilterByUploader178 = !current
    AppToast.show(this, "History Filter By Uploader178: ${if (!current) "ON" else "OFF"}")
}

// v178: Playback Deinterlace Toggle178
internal fun PlayerActivity.showV178PlaybackDeinterlaceToggle178Toggle() {
    val current = BiliClient.prefs.v178playbackDeinterlaceToggle178
    BiliClient.prefs.v178playbackDeinterlaceToggle178 = !current
    AppToast.show(this, "Playback Deinterlace Toggle178: ${if (!current) "ON" else "OFF"}")
}

// v178: Screenshot Overlay FPS
internal fun PlayerActivity.showV178ScreenshotOverlayFPSToggle() {
    val current = BiliClient.prefs.v178screenshotOverlayFPS
    BiliClient.prefs.v178screenshotOverlayFPS = !current
    AppToast.show(this, "Screenshot Overlay FPS: ${if (!current) "ON" else "OFF"}")
}

// v178: Video Brightness Level178
internal fun PlayerActivity.showV178VideoBrightnessLevel178Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178videoBrightnessLevel178).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Brightness Level178",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178videoBrightnessLevel178 = value
        AppToast.show(this, "Video Brightness Level178: $value")
    }
}

// v178: Danmaku Scroll Priority
internal fun PlayerActivity.showV178DanmakuScrollPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v178danmakuScrollPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v178danmakuScrollPriority = value
        AppToast.show(this, "Danmaku Scroll Priority: $value")
    }
}

// v178: Subtitle Outline Toggle178
internal fun PlayerActivity.showV178SubtitleOutlineToggle178Toggle() {
    val current = BiliClient.prefs.v178subtitleOutlineToggle178
    BiliClient.prefs.v178subtitleOutlineToggle178 = !current
    AppToast.show(this, "Subtitle Outline Toggle178: ${if (!current) "ON" else "OFF"}")
}

// v179: Audio Compressor Release179
internal fun PlayerActivity.showV179AudioCompressorRelease179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179audioCompressorRelease179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Release179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179audioCompressorRelease179 = value
        AppToast.show(this, "Audio Compressor Release179: $value")
    }
}

// v179: Danmaku Scroll Priority179
internal fun PlayerActivity.showV179DanmakuScrollPriority179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179danmakuScrollPriority179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Priority179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179danmakuScrollPriority179 = value
        AppToast.show(this, "Danmaku Scroll Priority179: $value")
    }
}

// v179: Subtitle Outline Toggle179
internal fun PlayerActivity.showV179SubtitleOutlineToggle179Toggle() {
    val current = BiliClient.prefs.v179subtitleOutlineToggle179
    BiliClient.prefs.v179subtitleOutlineToggle179 = !current
    AppToast.show(this, "Subtitle Outline Toggle179: ${if (!current) "ON" else "OFF"}")
}

// v179: Gesture Tap Feedback
internal fun PlayerActivity.showV179GestureTapFeedbackToggle() {
    val current = BiliClient.prefs.v179gestureTapFeedback
    BiliClient.prefs.v179gestureTapFeedback = !current
    AppToast.show(this, "Gesture Tap Feedback: ${if (!current) "ON" else "OFF"}")
}

// v179: Cast Video PIP Resolution Lock179
internal fun PlayerActivity.showV179CastVideoPIPResolutionLock179Toggle() {
    val current = BiliClient.prefs.v179castVideoPIPResolutionLock179
    BiliClient.prefs.v179castVideoPIPResolutionLock179 = !current
    AppToast.show(this, "Cast Video PIP Resolution Lock179: ${if (!current) "ON" else "OFF"}")
}

// v179: Playlist Smart Queue
internal fun PlayerActivity.showV179PlaylistSmartQueueToggle() {
    val current = BiliClient.prefs.v179playlistSmartQueue
    BiliClient.prefs.v179playlistSmartQueue = !current
    AppToast.show(this, "Playlist Smart Queue: ${if (!current) "ON" else "OFF"}")
}

// v179: Cache Stream Prefetch179
internal fun PlayerActivity.showV179CacheStreamPrefetch179Toggle() {
    val current = BiliClient.prefs.v179cacheStreamPrefetch179
    BiliClient.prefs.v179cacheStreamPrefetch179 = !current
    AppToast.show(this, "Cache Stream Prefetch179: ${if (!current) "ON" else "OFF"}")
}

// v179: Progress Bar Scrub Gesture
internal fun PlayerActivity.showV179ProgressBarScrubGestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179progressBarScrubGesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Scrub Gesture",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179progressBarScrubGesture = value
        AppToast.show(this, "Progress Bar Scrub Gesture: $value")
    }
}

// v179: Volume Normalize Track179
internal fun PlayerActivity.showV179VolumeNormalizeTrack179Toggle() {
    val current = BiliClient.prefs.v179volumeNormalizeTrack179
    BiliClient.prefs.v179volumeNormalizeTrack179 = !current
    AppToast.show(this, "Volume Normalize Track179: ${if (!current) "ON" else "OFF"}")
}

// v179: History Filter By Quality
internal fun PlayerActivity.showV179HistoryFilterByQualityToggle() {
    val current = BiliClient.prefs.v179historyFilterByQuality
    BiliClient.prefs.v179historyFilterByQuality = !current
    AppToast.show(this, "History Filter By Quality: ${if (!current) "ON" else "OFF"}")
}

// v179: Playback Rotate Video
internal fun PlayerActivity.showV179PlaybackRotateVideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179playbackRotateVideo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Rotate Video",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179playbackRotateVideo = value
        AppToast.show(this, "Playback Rotate Video: $value")
    }
}

// v179: Screenshot Overlay FPS179
internal fun PlayerActivity.showV179ScreenshotOverlayFPS179Toggle() {
    val current = BiliClient.prefs.v179screenshotOverlayFPS179
    BiliClient.prefs.v179screenshotOverlayFPS179 = !current
    AppToast.show(this, "Screenshot Overlay FPS179: ${if (!current) "ON" else "OFF"}")
}

// v179: Video Brightness Level179
internal fun PlayerActivity.showV179VideoBrightnessLevel179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179videoBrightnessLevel179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Brightness Level179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179videoBrightnessLevel179 = value
        AppToast.show(this, "Video Brightness Level179: $value")
    }
}

// v179: Danmaku Scroll Merge
internal fun PlayerActivity.showV179DanmakuScrollMergeToggle() {
    val current = BiliClient.prefs.v179danmakuScrollMerge
    BiliClient.prefs.v179danmakuScrollMerge = !current
    AppToast.show(this, "Danmaku Scroll Merge: ${if (!current) "ON" else "OFF"}")
}

// v179: Subtitle Outline Color179
internal fun PlayerActivity.showV179SubtitleOutlineColor179Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v179subtitleOutlineColor179).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color179",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v179subtitleOutlineColor179 = value
        AppToast.show(this, "Subtitle Outline Color179: $value")
    }
}

// v180: Audio Compressor Mix180
internal fun PlayerActivity.showV180AudioCompressorMix180Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v180audioCompressorMix180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Mix180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180audioCompressorMix180 = value
        AppToast.show(this, "Audio Compressor Mix180: $value")
    }
}

// v180: Danmaku Scroll Merge180
internal fun PlayerActivity.showV180DanmakuScrollMerge180Toggle() {
    val current = BiliClient.prefs.v180danmakuScrollMerge180
    BiliClient.prefs.v180danmakuScrollMerge180 = !current
    AppToast.show(this, "Danmaku Scroll Merge180: ${if (!current) "ON" else "OFF"}")
}

// v180: Subtitle Outline Color180
internal fun PlayerActivity.showV180SubtitleOutlineColor180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180subtitleOutlineColor180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180subtitleOutlineColor180 = value
        AppToast.show(this, "Subtitle Outline Color180: $value")
    }
}

// v180: Gesture Tap Feedback180
internal fun PlayerActivity.showV180GestureTapFeedback180Toggle() {
    val current = BiliClient.prefs.v180gestureTapFeedback180
    BiliClient.prefs.v180gestureTapFeedback180 = !current
    AppToast.show(this, "Gesture Tap Feedback180: ${if (!current) "ON" else "OFF"}")
}

// v180: Cast Video PIP Sync Mode
internal fun PlayerActivity.showV180CastVideoPIPSyncModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180castVideoPIPSyncMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Sync Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180castVideoPIPSyncMode = value
        AppToast.show(this, "Cast Video PIP Sync Mode: $value")
    }
}

// v180: Playlist Smart Queue180
internal fun PlayerActivity.showV180PlaylistSmartQueue180Toggle() {
    val current = BiliClient.prefs.v180playlistSmartQueue180
    BiliClient.prefs.v180playlistSmartQueue180 = !current
    AppToast.show(this, "Playlist Smart Queue180: ${if (!current) "ON" else "OFF"}")
}

// v180: Cache Stream Read Ahead
internal fun PlayerActivity.showV180CacheStreamReadAheadToggle() {
    val current = BiliClient.prefs.v180cacheStreamReadAhead
    BiliClient.prefs.v180cacheStreamReadAhead = !current
    AppToast.show(this, "Cache Stream Read Ahead: ${if (!current) "ON" else "OFF"}")
}

// v180: Progress Bar Scrub Gesture180
internal fun PlayerActivity.showV180ProgressBarScrubGesture180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180progressBarScrubGesture180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Scrub Gesture180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180progressBarScrubGesture180 = value
        AppToast.show(this, "Progress Bar Scrub Gesture180: $value")
    }
}

// v180: Volume Normalize Track180
internal fun PlayerActivity.showV180VolumeNormalizeTrack180Toggle() {
    val current = BiliClient.prefs.v180volumeNormalizeTrack180
    BiliClient.prefs.v180volumeNormalizeTrack180 = !current
    AppToast.show(this, "Volume Normalize Track180: ${if (!current) "ON" else "OFF"}")
}

// v180: History Filter By Quality180
internal fun PlayerActivity.showV180HistoryFilterByQuality180Toggle() {
    val current = BiliClient.prefs.v180historyFilterByQuality180
    BiliClient.prefs.v180historyFilterByQuality180 = !current
    AppToast.show(this, "History Filter By Quality180: ${if (!current) "ON" else "OFF"}")
}

// v180: Playback Rotate Video180
internal fun PlayerActivity.showV180PlaybackRotateVideo180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180playbackRotateVideo180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Rotate Video180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180playbackRotateVideo180 = value
        AppToast.show(this, "Playback Rotate Video180: $value")
    }
}

// v180: Screenshot Overlay Codec
internal fun PlayerActivity.showV180ScreenshotOverlayCodecToggle() {
    val current = BiliClient.prefs.v180screenshotOverlayCodec
    BiliClient.prefs.v180screenshotOverlayCodec = !current
    AppToast.show(this, "Screenshot Overlay Codec: ${if (!current) "ON" else "OFF"}")
}

// v180: Video Gamma Toggle180
internal fun PlayerActivity.showV180VideoGammaToggle180Toggle() {
    val current = BiliClient.prefs.v180videoGammaToggle180
    BiliClient.prefs.v180videoGammaToggle180 = !current
    AppToast.show(this, "Video Gamma Toggle180: ${if (!current) "ON" else "OFF"}")
}

// v180: Danmaku Scroll Merge Mode
internal fun PlayerActivity.showV180DanmakuScrollMergeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180danmakuScrollMergeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Merge Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180danmakuScrollMergeMode = value
        AppToast.show(this, "Danmaku Scroll Merge Mode: $value")
    }
}

// v180: Subtitle Outline Width180
internal fun PlayerActivity.showV180SubtitleOutlineWidth180Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v180subtitleOutlineWidth180).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Width180",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v180subtitleOutlineWidth180 = value
        AppToast.show(this, "Subtitle Outline Width180: $value")
    }
}

// v181: Audio Reverb Toggle181
internal fun PlayerActivity.showV181AudioReverbToggle181Toggle() {
    val current = BiliClient.prefs.v181audioReverbToggle181
    BiliClient.prefs.v181audioReverbToggle181 = !current
    AppToast.show(this, "Audio Reverb Toggle181: ${if (!current) "ON" else "OFF"}")
}

// v181: Danmaku Fixed Position
internal fun PlayerActivity.showV181DanmakuFixedPositionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181danmakuFixedPosition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Position",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181danmakuFixedPosition = value
        AppToast.show(this, "Danmaku Fixed Position: $value")
    }
}

// v181: Subtitle Bg Color Alpha
internal fun PlayerActivity.showV181SubtitleBgColorAlphaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181subtitleBgColorAlpha).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color Alpha",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181subtitleBgColorAlpha = value
        AppToast.show(this, "Subtitle Bg Color Alpha: $value")
    }
}

// v181: Gesture Edge Swipe Left
internal fun PlayerActivity.showV181GestureEdgeSwipeLeftDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181gestureEdgeSwipeLeft).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Left",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181gestureEdgeSwipeLeft = value
        AppToast.show(this, "Gesture Edge Swipe Left: $value")
    }
}

// v181: Cast Audio Bitrate
internal fun PlayerActivity.showV181CastAudioBitrateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181castAudioBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Bitrate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181castAudioBitrate = value
        AppToast.show(this, "Cast Audio Bitrate: $value")
    }
}

// v181: Playlist Loop Single
internal fun PlayerActivity.showV181PlaylistLoopSingleToggle() {
    val current = BiliClient.prefs.v181playlistLoopSingle
    BiliClient.prefs.v181playlistLoopSingle = !current
    AppToast.show(this, "Playlist Loop Single: ${if (!current) "ON" else "OFF"}")
}

// v181: Cache Download Resume
internal fun PlayerActivity.showV181CacheDownloadResumeToggle() {
    val current = BiliClient.prefs.v181cacheDownloadResume
    BiliClient.prefs.v181cacheDownloadResume = !current
    AppToast.show(this, "Cache Download Resume: ${if (!current) "ON" else "OFF"}")
}

// v181: Progress Bar Thumb Size
internal fun PlayerActivity.showV181ProgressBarThumbSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181progressBarThumbSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181progressBarThumbSize = value
        AppToast.show(this, "Progress Bar Thumb Size: $value")
    }
}

// v181: Volume Boost Toggle181
internal fun PlayerActivity.showV181VolumeBoostToggle181Toggle() {
    val current = BiliClient.prefs.v181volumeBoostToggle181
    BiliClient.prefs.v181volumeBoostToggle181 = !current
    AppToast.show(this, "Volume Boost Toggle181: ${if (!current) "ON" else "OFF"}")
}

// v181: History Bookmark Toggle
internal fun PlayerActivity.showV181HistoryBookmarkToggleToggle() {
    val current = BiliClient.prefs.v181historyBookmarkToggle
    BiliClient.prefs.v181historyBookmarkToggle = !current
    AppToast.show(this, "History Bookmark Toggle: ${if (!current) "ON" else "OFF"}")
}

// v181: Playback Chapter Skip
internal fun PlayerActivity.showV181PlaybackChapterSkipToggle() {
    val current = BiliClient.prefs.v181playbackChapterSkip
    BiliClient.prefs.v181playbackChapterSkip = !current
    AppToast.show(this, "Playback Chapter Skip: ${if (!current) "ON" else "OFF"}")
}

// v181: Screenshot Region Select
internal fun PlayerActivity.showV181ScreenshotRegionSelectToggle() {
    val current = BiliClient.prefs.v181screenshotRegionSelect
    BiliClient.prefs.v181screenshotRegionSelect = !current
    AppToast.show(this, "Screenshot Region Select: ${if (!current) "ON" else "OFF"}")
}

// v181: Video HDR10 Toggle181
internal fun PlayerActivity.showV181VideoHDR10Toggle181Toggle() {
    val current = BiliClient.prefs.v181videoHDR10Toggle181
    BiliClient.prefs.v181videoHDR10Toggle181 = !current
    AppToast.show(this, "Video HDR10 Toggle181: ${if (!current) "ON" else "OFF"}")
}

// v181: Danmaku Fixed Position181
internal fun PlayerActivity.showV181DanmakuFixedPosition181Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181danmakuFixedPosition181).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Position181",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181danmakuFixedPosition181 = value
        AppToast.show(this, "Danmaku Fixed Position181: $value")
    }
}

// v181: Subtitle Bg Color Alpha181
internal fun PlayerActivity.showV181SubtitleBgColorAlpha181Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v181subtitleBgColorAlpha181).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color Alpha181",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v181subtitleBgColorAlpha181 = value
        AppToast.show(this, "Subtitle Bg Color Alpha181: $value")
    }
}

// v182: Audio Reverb Decay182
internal fun PlayerActivity.showV182AudioReverbDecay182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182audioReverbDecay182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Decay182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182audioReverbDecay182 = value
        AppToast.show(this, "Audio Reverb Decay182: $value")
    }
}

// v182: Danmaku Fixed Font182
internal fun PlayerActivity.showV182DanmakuFixedFont182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182danmakuFixedFont182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Font182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182danmakuFixedFont182 = value
        AppToast.show(this, "Danmaku Fixed Font182: $value")
    }
}

// v182: Subtitle Bg Color Alpha182
internal fun PlayerActivity.showV182SubtitleBgColorAlpha182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182subtitleBgColorAlpha182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color Alpha182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182subtitleBgColorAlpha182 = value
        AppToast.show(this, "Subtitle Bg Color Alpha182: $value")
    }
}

// v182: Gesture Edge Swipe Right182
internal fun PlayerActivity.showV182GestureEdgeSwipeRight182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182gestureEdgeSwipeRight182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Right182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182gestureEdgeSwipeRight182 = value
        AppToast.show(this, "Gesture Edge Swipe Right182: $value")
    }
}

// v182: Cast Audio Bitrate182
internal fun PlayerActivity.showV182CastAudioBitrate182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182castAudioBitrate182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Bitrate182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182castAudioBitrate182 = value
        AppToast.show(this, "Cast Audio Bitrate182: $value")
    }
}

// v182: Playlist Loop Single182
internal fun PlayerActivity.showV182PlaylistLoopSingle182Toggle() {
    val current = BiliClient.prefs.v182playlistLoopSingle182
    BiliClient.prefs.v182playlistLoopSingle182 = !current
    AppToast.show(this, "Playlist Loop Single182: ${if (!current) "ON" else "OFF"}")
}

// v182: Cache Download Resume182
internal fun PlayerActivity.showV182CacheDownloadResume182Toggle() {
    val current = BiliClient.prefs.v182cacheDownloadResume182
    BiliClient.prefs.v182cacheDownloadResume182 = !current
    AppToast.show(this, "Cache Download Resume182: ${if (!current) "ON" else "OFF"}")
}

// v182: Progress Bar Thumb Size182
internal fun PlayerActivity.showV182ProgressBarThumbSize182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182progressBarThumbSize182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182progressBarThumbSize182 = value
        AppToast.show(this, "Progress Bar Thumb Size182: $value")
    }
}

// v182: Volume Boost Level182
internal fun PlayerActivity.showV182VolumeBoostLevel182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182volumeBoostLevel182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Level182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182volumeBoostLevel182 = value
        AppToast.show(this, "Volume Boost Level182: $value")
    }
}

// v182: History Bookmark Toggle182
internal fun PlayerActivity.showV182HistoryBookmarkToggle182Toggle() {
    val current = BiliClient.prefs.v182historyBookmarkToggle182
    BiliClient.prefs.v182historyBookmarkToggle182 = !current
    AppToast.show(this, "History Bookmark Toggle182: ${if (!current) "ON" else "OFF"}")
}

// v182: Playback Chapter Skip182
internal fun PlayerActivity.showV182PlaybackChapterSkip182Toggle() {
    val current = BiliClient.prefs.v182playbackChapterSkip182
    BiliClient.prefs.v182playbackChapterSkip182 = !current
    AppToast.show(this, "Playback Chapter Skip182: ${if (!current) "ON" else "OFF"}")
}

// v182: Screenshot Region Select182
internal fun PlayerActivity.showV182ScreenshotRegionSelect182Toggle() {
    val current = BiliClient.prefs.v182screenshotRegionSelect182
    BiliClient.prefs.v182screenshotRegionSelect182 = !current
    AppToast.show(this, "Screenshot Region Select182: ${if (!current) "ON" else "OFF"}")
}

// v182: Video HDR10 Level182
internal fun PlayerActivity.showV182VideoHDR10Level182Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182videoHDR10Level182).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 Level182",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182videoHDR10Level182 = value
        AppToast.show(this, "Video HDR10 Level182: $value")
    }
}

// v182: Danmaku Fixed Speed
internal fun PlayerActivity.showV182DanmakuFixedSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182danmakuFixedSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182danmakuFixedSpeed = value
        AppToast.show(this, "Danmaku Fixed Speed: $value")
    }
}

// v182: Subtitle Bg Color
internal fun PlayerActivity.showV182SubtitleBgColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v182subtitleBgColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v182subtitleBgColor = value
        AppToast.show(this, "Subtitle Bg Color: $value")
    }
}

// v183: Audio Reverb Decay183
internal fun PlayerActivity.showV183AudioReverbDecay183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183audioReverbDecay183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Decay183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183audioReverbDecay183 = value
        AppToast.show(this, "Audio Reverb Decay183: $value")
    }
}

// v183: Danmaku Fixed Speed183
internal fun PlayerActivity.showV183DanmakuFixedSpeed183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183danmakuFixedSpeed183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Speed183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183danmakuFixedSpeed183 = value
        AppToast.show(this, "Danmaku Fixed Speed183: $value")
    }
}

// v183: Subtitle Bg Color183
internal fun PlayerActivity.showV183SubtitleBgColor183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183subtitleBgColor183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183subtitleBgColor183 = value
        AppToast.show(this, "Subtitle Bg Color183: $value")
    }
}

