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

internal fun PlayerActivity.showV161ScreenshotFormatPNGToggle() {
    val current = BiliClient.prefs.v161screenshotFormatPNG
    BiliClient.prefs.v161screenshotFormatPNG = !current
    AppToast.show(this, "Screenshot Format PNG: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV161VideoDenoiseToggle161Toggle() {
    val current = BiliClient.prefs.v161videoDenoiseToggle161
    BiliClient.prefs.v161videoDenoiseToggle161 = !current
    AppToast.show(this, "Video Denoise Toggle161: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV161DanmakuRenderThreadCountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v161danmakuRenderThreadCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Thread Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v161danmakuRenderThreadCount = value
        AppToast.show(this, "Danmaku Render Thread Count: $value")
    }
}

internal fun PlayerActivity.showV161SubtitleKaraokeHighlightToggle() {
    val current = BiliClient.prefs.v161subtitleKaraokeHighlight
    BiliClient.prefs.v161subtitleKaraokeHighlight = !current
    AppToast.show(this, "Subtitle Karaoke Highlight: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV162AudioGateThreshold162Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v162audioGateThreshold162).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Threshold162",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162audioGateThreshold162 = value
        AppToast.show(this, "Audio Gate Threshold162: $value")
    }
}

internal fun PlayerActivity.showV162DanmakuRenderThreadCount162Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v162danmakuRenderThreadCount162).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Thread Count162",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162danmakuRenderThreadCount162 = value
        AppToast.show(this, "Danmaku Render Thread Count162: $value")
    }
}

internal fun PlayerActivity.showV162SubtitleKaraokeHighlight162Toggle() {
    val current = BiliClient.prefs.v162subtitleKaraokeHighlight162
    BiliClient.prefs.v162subtitleKaraokeHighlight162 = !current
    AppToast.show(this, "Subtitle Karaoke Highlight162: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV162GestureLongPressDurationDialog() {
    val options = listOf(300, 500, 700, 1000, 1500)
    val currentIndex = options.indexOf(BiliClient.prefs.v162gestureLongPressDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162gestureLongPressDuration = value
        AppToast.show(this, "Gesture Long Press Duration: $value")
    }
}

internal fun PlayerActivity.showV162CastVideoPIPMaxResolution162Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v162castVideoPIPMaxResolution162).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Max Resolution162",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162castVideoPIPMaxResolution162 = value
        AppToast.show(this, "Cast Video PIP Max Resolution162: $value")
    }
}

internal fun PlayerActivity.showV162PlaylistContinuePlayNext162Toggle() {
    val current = BiliClient.prefs.v162playlistContinuePlayNext162
    BiliClient.prefs.v162playlistContinuePlayNext162 = !current
    AppToast.show(this, "Playlist Continue Play Next162: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV162CachePreloadNextEpisode162Toggle() {
    val current = BiliClient.prefs.v162cachePreloadNextEpisode162
    BiliClient.prefs.v162cachePreloadNextEpisode162 = !current
    AppToast.show(this, "Cache Preload Next Episode162: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV162ProgressBarBufferedColor162Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v162progressBarBufferedColor162).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffered Color162",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162progressBarBufferedColor162 = value
        AppToast.show(this, "Progress Bar Buffered Color162: $value")
    }
}

internal fun PlayerActivity.showV162VolumeFadeInOnResume162Toggle() {
    val current = BiliClient.prefs.v162volumeFadeInOnResume162
    BiliClient.prefs.v162volumeFadeInOnResume162 = !current
    AppToast.show(this, "Volume Fade In On Resume162: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV162HistoryImportExport162Toggle() {
    val current = BiliClient.prefs.v162historyImportExport162
    BiliClient.prefs.v162historyImportExport162 = !current
    AppToast.show(this, "History Import Export162: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV162PlaybackAutoRotateLandscape162Toggle() {
    val current = BiliClient.prefs.v162playbackAutoRotateLandscape162
    BiliClient.prefs.v162playbackAutoRotateLandscape162 = !current
    AppToast.show(this, "Playback Auto Rotate Landscape162: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV162ScreenshotFormatJPEGToggle() {
    val current = BiliClient.prefs.v162screenshotFormatJPEG
    BiliClient.prefs.v162screenshotFormatJPEG = !current
    AppToast.show(this, "Screenshot Format JPEG: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV162VideoDenoiseStrength162Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v162videoDenoiseStrength162).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Denoise Strength162",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162videoDenoiseStrength162 = value
        AppToast.show(this, "Video Denoise Strength162: $value")
    }
}

internal fun PlayerActivity.showV162DanmakuRenderCacheToggleToggle() {
    val current = BiliClient.prefs.v162danmakuRenderCacheToggle
    BiliClient.prefs.v162danmakuRenderCacheToggle = !current
    AppToast.show(this, "Danmaku Render Cache Toggle: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV162SubtitleKaraokeSpeedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v162subtitleKaraokeSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v162subtitleKaraokeSpeed = value
        AppToast.show(this, "Subtitle Karaoke Speed: $value")
    }
}

internal fun PlayerActivity.showV163AudioGateRelease163Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163audioGateRelease163).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Release163",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163audioGateRelease163 = value
        AppToast.show(this, "Audio Gate Release163: $value")
    }
}

internal fun PlayerActivity.showV163DanmakuRenderCacheToggle163Toggle() {
    val current = BiliClient.prefs.v163danmakuRenderCacheToggle163
    BiliClient.prefs.v163danmakuRenderCacheToggle163 = !current
    AppToast.show(this, "Danmaku Render Cache Toggle163: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV163SubtitleKaraokeSpeed163Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163subtitleKaraokeSpeed163).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Speed163",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163subtitleKaraokeSpeed163 = value
        AppToast.show(this, "Subtitle Karaoke Speed163: $value")
    }
}

internal fun PlayerActivity.showV163GestureLongPressVibrateToggle() {
    val current = BiliClient.prefs.v163gestureLongPressVibrate
    BiliClient.prefs.v163gestureLongPressVibrate = !current
    AppToast.show(this, "Gesture Long Press Vibrate: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV163CastVideoPIPBitrateLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163castVideoPIPBitrateLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Bitrate Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163castVideoPIPBitrateLimit = value
        AppToast.show(this, "Cast Video PIP Bitrate Limit: $value")
    }
}

internal fun PlayerActivity.showV163PlaylistContinueOnWifiToggle() {
    val current = BiliClient.prefs.v163playlistContinueOnWifi
    BiliClient.prefs.v163playlistContinueOnWifi = !current
    AppToast.show(this, "Playlist Continue On Wifi: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV163CachePreloadSizeMBDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163cachePreloadSizeMB).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size MB",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163cachePreloadSizeMB = value
        AppToast.show(this, "Cache Preload Size MB: $value")
    }
}

internal fun PlayerActivity.showV163ProgressBarBufferedWidthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163progressBarBufferedWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffered Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163progressBarBufferedWidth = value
        AppToast.show(this, "Progress Bar Buffered Width: $value")
    }
}

internal fun PlayerActivity.showV163VolumeFadeOutOnPauseToggle() {
    val current = BiliClient.prefs.v163volumeFadeOutOnPause
    BiliClient.prefs.v163volumeFadeOutOnPause = !current
    AppToast.show(this, "Volume Fade Out On Pause: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV163HistorySyncCloudToggle() {
    val current = BiliClient.prefs.v163historySyncCloud
    BiliClient.prefs.v163historySyncCloud = !current
    AppToast.show(this, "History Sync Cloud: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV163PlaybackAutoRotatePortraitToggle() {
    val current = BiliClient.prefs.v163playbackAutoRotatePortrait
    BiliClient.prefs.v163playbackAutoRotatePortrait = !current
    AppToast.show(this, "Playback Auto Rotate Portrait: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV163ScreenshotQualityLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163screenshotQualityLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Quality Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163screenshotQualityLevel = value
        AppToast.show(this, "Screenshot Quality Level: $value")
    }
}

internal fun PlayerActivity.showV163VideoDenoiseStrength163Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163videoDenoiseStrength163).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Denoise Strength163",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163videoDenoiseStrength163 = value
        AppToast.show(this, "Video Denoise Strength163: $value")
    }
}

internal fun PlayerActivity.showV163DanmakuRenderCacheSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163danmakuRenderCacheSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Cache Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163danmakuRenderCacheSize = value
        AppToast.show(this, "Danmaku Render Cache Size: $value")
    }
}

internal fun PlayerActivity.showV163SubtitleKaraokeColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v163subtitleKaraokeColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v163subtitleKaraokeColor = value
        AppToast.show(this, "Subtitle Karaoke Color: $value")
    }
}

internal fun PlayerActivity.showV164AudioGateRange164Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164audioGateRange164).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Range164",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164audioGateRange164 = value
        AppToast.show(this, "Audio Gate Range164: $value")
    }
}

internal fun PlayerActivity.showV164DanmakuRenderCacheSize164Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164danmakuRenderCacheSize164).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Cache Size164",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164danmakuRenderCacheSize164 = value
        AppToast.show(this, "Danmaku Render Cache Size164: $value")
    }
}

internal fun PlayerActivity.showV164SubtitleKaraokeColor164Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164subtitleKaraokeColor164).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Color164",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164subtitleKaraokeColor164 = value
        AppToast.show(this, "Subtitle Karaoke Color164: $value")
    }
}

internal fun PlayerActivity.showV164GestureLongPressVibrate164Toggle() {
    val current = BiliClient.prefs.v164gestureLongPressVibrate164
    BiliClient.prefs.v164gestureLongPressVibrate164 = !current
    AppToast.show(this, "Gesture Long Press Vibrate164: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV164CastVideoPIPBitrateLimit164Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164castVideoPIPBitrateLimit164).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Bitrate Limit164",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164castVideoPIPBitrateLimit164 = value
        AppToast.show(this, "Cast Video PIP Bitrate Limit164: $value")
    }
}

internal fun PlayerActivity.showV164PlaylistContinueOnWifi164Toggle() {
    val current = BiliClient.prefs.v164playlistContinueOnWifi164
    BiliClient.prefs.v164playlistContinueOnWifi164 = !current
    AppToast.show(this, "Playlist Continue On Wifi164: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV164CachePreloadOnWifiToggle() {
    val current = BiliClient.prefs.v164cachePreloadOnWifi
    BiliClient.prefs.v164cachePreloadOnWifi = !current
    AppToast.show(this, "Cache Preload On Wifi: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV164ProgressBarBufferedOpacityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164progressBarBufferedOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffered Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164progressBarBufferedOpacity = value
        AppToast.show(this, "Progress Bar Buffered Opacity: $value")
    }
}

internal fun PlayerActivity.showV164VolumeFadeOutOnPause164Toggle() {
    val current = BiliClient.prefs.v164volumeFadeOutOnPause164
    BiliClient.prefs.v164volumeFadeOutOnPause164 = !current
    AppToast.show(this, "Volume Fade Out On Pause164: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV164HistorySyncCloud164Toggle() {
    val current = BiliClient.prefs.v164historySyncCloud164
    BiliClient.prefs.v164historySyncCloud164 = !current
    AppToast.show(this, "History Sync Cloud164: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV164PlaybackRememberSpeedToggle() {
    val current = BiliClient.prefs.v164playbackRememberSpeed
    BiliClient.prefs.v164playbackRememberSpeed = !current
    AppToast.show(this, "Playback Remember Speed: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV164ScreenshotAutoNameToggle() {
    val current = BiliClient.prefs.v164screenshotAutoName
    BiliClient.prefs.v164screenshotAutoName = !current
    AppToast.show(this, "Screenshot Auto Name: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV164VideoSharpenToggle164Toggle() {
    val current = BiliClient.prefs.v164videoSharpenToggle164
    BiliClient.prefs.v164videoSharpenToggle164 = !current
    AppToast.show(this, "Video Sharpen Toggle164: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV164DanmakuRenderCachePolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164danmakuRenderCachePolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Cache Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164danmakuRenderCachePolicy = value
        AppToast.show(this, "Danmaku Render Cache Policy: $value")
    }
}

internal fun PlayerActivity.showV164SubtitleKaraokeFontDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v164subtitleKaraokeFont).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Font",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v164subtitleKaraokeFont = value
        AppToast.show(this, "Subtitle Karaoke Font: $value")
    }
}

internal fun PlayerActivity.showV165AudioGateAttack165Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165audioGateAttack165).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Attack165",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165audioGateAttack165 = value
        AppToast.show(this, "Audio Gate Attack165: $value")
    }
}

internal fun PlayerActivity.showV165DanmakuRenderCachePolicy165Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165danmakuRenderCachePolicy165).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Cache Policy165",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165danmakuRenderCachePolicy165 = value
        AppToast.show(this, "Danmaku Render Cache Policy165: $value")
    }
}

internal fun PlayerActivity.showV165SubtitleKaraokeFont165Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165subtitleKaraokeFont165).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Font165",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165subtitleKaraokeFont165 = value
        AppToast.show(this, "Subtitle Karaoke Font165: $value")
    }
}

internal fun PlayerActivity.showV165GestureSwipeLeftActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165gestureSwipeLeftAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Left Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165gestureSwipeLeftAction = value
        AppToast.show(this, "Gesture Swipe Left Action: $value")
    }
}

internal fun PlayerActivity.showV165CastVideoPIPFrameDropToggle() {
    val current = BiliClient.prefs.v165castVideoPIPFrameDrop
    BiliClient.prefs.v165castVideoPIPFrameDrop = !current
    AppToast.show(this, "Cast Video PIP Frame Drop: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV165PlaylistShuffleModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165playlistShuffleMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Shuffle Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165playlistShuffleMode = value
        AppToast.show(this, "Playlist Shuffle Mode: $value")
    }
}

internal fun PlayerActivity.showV165CachePreloadOnWifi165Toggle() {
    val current = BiliClient.prefs.v165cachePreloadOnWifi165
    BiliClient.prefs.v165cachePreloadOnWifi165 = !current
    AppToast.show(this, "Cache Preload On Wifi165: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV165ProgressBarBufferedAnimToggle() {
    val current = BiliClient.prefs.v165progressBarBufferedAnim
    BiliClient.prefs.v165progressBarBufferedAnim = !current
    AppToast.show(this, "Progress Bar Buffered Anim: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV165VolumeFadeDurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165volumeFadeDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165volumeFadeDuration = value
        AppToast.show(this, "Volume Fade Duration: $value")
    }
}

internal fun PlayerActivity.showV165HistorySyncWifiToggle() {
    val current = BiliClient.prefs.v165historySyncWifi
    BiliClient.prefs.v165historySyncWifi = !current
    AppToast.show(this, "History Sync Wifi: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV165PlaybackRememberSpeed165Toggle() {
    val current = BiliClient.prefs.v165playbackRememberSpeed165
    BiliClient.prefs.v165playbackRememberSpeed165 = !current
    AppToast.show(this, "Playback Remember Speed165: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV165ScreenshotAutoName165Toggle() {
    val current = BiliClient.prefs.v165screenshotAutoName165
    BiliClient.prefs.v165screenshotAutoName165 = !current
    AppToast.show(this, "Screenshot Auto Name165: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV165VideoSharpenStrength165Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165videoSharpenStrength165).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Strength165",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165videoSharpenStrength165 = value
        AppToast.show(this, "Video Sharpen Strength165: $value")
    }
}

internal fun PlayerActivity.showV165DanmakuRenderBatchToggle() {
    val current = BiliClient.prefs.v165danmakuRenderBatch
    BiliClient.prefs.v165danmakuRenderBatch = !current
    AppToast.show(this, "Danmaku Render Batch: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV165SubtitleKaraokeTimingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v165subtitleKaraokeTiming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Timing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v165subtitleKaraokeTiming = value
        AppToast.show(this, "Subtitle Karaoke Timing: $value")
    }
}

internal fun PlayerActivity.showV166AudioGateHysteresisDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166audioGateHysteresis).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Hysteresis",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166audioGateHysteresis = value
        AppToast.show(this, "Audio Gate Hysteresis: $value")
    }
}

internal fun PlayerActivity.showV166DanmakuRenderBatch166Toggle() {
    val current = BiliClient.prefs.v166danmakuRenderBatch166
    BiliClient.prefs.v166danmakuRenderBatch166 = !current
    AppToast.show(this, "Danmaku Render Batch166: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV166SubtitleKaraokeTiming166Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166subtitleKaraokeTiming166).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Timing166",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166subtitleKaraokeTiming166 = value
        AppToast.show(this, "Subtitle Karaoke Timing166: $value")
    }
}

internal fun PlayerActivity.showV166GestureSwipeRightActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166gestureSwipeRightAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Right Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166gestureSwipeRightAction = value
        AppToast.show(this, "Gesture Swipe Right Action: $value")
    }
}

internal fun PlayerActivity.showV166CastVideoPIPFrameDrop166Toggle() {
    val current = BiliClient.prefs.v166castVideoPIPFrameDrop166
    BiliClient.prefs.v166castVideoPIPFrameDrop166 = !current
    AppToast.show(this, "Cast Video PIP Frame Drop166: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV166PlaylistShuffleMode166Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166playlistShuffleMode166).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Shuffle Mode166",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166playlistShuffleMode166 = value
        AppToast.show(this, "Playlist Shuffle Mode166: $value")
    }
}

internal fun PlayerActivity.showV166CachePreloadPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166cachePreloadPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166cachePreloadPriority = value
        AppToast.show(this, "Cache Preload Priority: $value")
    }
}

internal fun PlayerActivity.showV166ProgressBarBufferedAnim166Toggle() {
    val current = BiliClient.prefs.v166progressBarBufferedAnim166
    BiliClient.prefs.v166progressBarBufferedAnim166 = !current
    AppToast.show(this, "Progress Bar Buffered Anim166: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV166VolumeFadeDuration166Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166volumeFadeDuration166).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Duration166",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166volumeFadeDuration166 = value
        AppToast.show(this, "Volume Fade Duration166: $value")
    }
}

internal fun PlayerActivity.showV166HistorySyncWifi166Toggle() {
    val current = BiliClient.prefs.v166historySyncWifi166
    BiliClient.prefs.v166historySyncWifi166 = !current
    AppToast.show(this, "History Sync Wifi166: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV166PlaybackRememberQualityToggle() {
    val current = BiliClient.prefs.v166playbackRememberQuality
    BiliClient.prefs.v166playbackRememberQuality = !current
    AppToast.show(this, "Playback Remember Quality: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV166ScreenshotPrefixCustomToggle() {
    val current = BiliClient.prefs.v166screenshotPrefixCustom
    BiliClient.prefs.v166screenshotPrefixCustom = !current
    AppToast.show(this, "Screenshot Prefix Custom: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV166VideoSharpenStrength166Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166videoSharpenStrength166).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Strength166",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166videoSharpenStrength166 = value
        AppToast.show(this, "Video Sharpen Strength166: $value")
    }
}

internal fun PlayerActivity.showV166DanmakuRenderBatchSize166Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166danmakuRenderBatchSize166).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Batch Size166",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166danmakuRenderBatchSize166 = value
        AppToast.show(this, "Danmaku Render Batch Size166: $value")
    }
}

internal fun PlayerActivity.showV166SubtitleKaraokeModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v166subtitleKaraokeMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v166subtitleKaraokeMode = value
        AppToast.show(this, "Subtitle Karaoke Mode: $value")
    }
}

internal fun PlayerActivity.showV167AudioGateRatioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167audioGateRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Ratio",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167audioGateRatio = value
        AppToast.show(this, "Audio Gate Ratio: $value")
    }
}

internal fun PlayerActivity.showV167DanmakuRenderBatchSize167Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167danmakuRenderBatchSize167).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Batch Size167",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167danmakuRenderBatchSize167 = value
        AppToast.show(this, "Danmaku Render Batch Size167: $value")
    }
}

internal fun PlayerActivity.showV167SubtitleKaraokeMode167Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167subtitleKaraokeMode167).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Mode167",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167subtitleKaraokeMode167 = value
        AppToast.show(this, "Subtitle Karaoke Mode167: $value")
    }
}

internal fun PlayerActivity.showV167GestureSwipeUpActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167gestureSwipeUpAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167gestureSwipeUpAction = value
        AppToast.show(this, "Gesture Swipe Up Action: $value")
    }
}

internal fun PlayerActivity.showV167CastVideoPIPAdaptiveBitrateToggle() {
    val current = BiliClient.prefs.v167castVideoPIPAdaptiveBitrate
    BiliClient.prefs.v167castVideoPIPAdaptiveBitrate = !current
    AppToast.show(this, "Cast Video PIP Adaptive Bitrate: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV167PlaylistRepeatModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167playlistRepeatMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167playlistRepeatMode = value
        AppToast.show(this, "Playlist Repeat Mode: $value")
    }
}

internal fun PlayerActivity.showV167CachePreloadPriority167Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167cachePreloadPriority167).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Priority167",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167cachePreloadPriority167 = value
        AppToast.show(this, "Cache Preload Priority167: $value")
    }
}

internal fun PlayerActivity.showV167ProgressBarLoadedColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167progressBarLoadedColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Loaded Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167progressBarLoadedColor = value
        AppToast.show(this, "Progress Bar Loaded Color: $value")
    }
}

internal fun PlayerActivity.showV167VolumeFadeCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167volumeFadeCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167volumeFadeCurve = value
        AppToast.show(this, "Volume Fade Curve: $value")
    }
}

internal fun PlayerActivity.showV167HistorySyncBluetoothToggle() {
    val current = BiliClient.prefs.v167historySyncBluetooth
    BiliClient.prefs.v167historySyncBluetooth = !current
    AppToast.show(this, "History Sync Bluetooth: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV167PlaybackRememberQuality167Toggle() {
    val current = BiliClient.prefs.v167playbackRememberQuality167
    BiliClient.prefs.v167playbackRememberQuality167 = !current
    AppToast.show(this, "Playback Remember Quality167: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV167ScreenshotPrefixCustom167Toggle() {
    val current = BiliClient.prefs.v167screenshotPrefixCustom167
    BiliClient.prefs.v167screenshotPrefixCustom167 = !current
    AppToast.show(this, "Screenshot Prefix Custom167: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV167VideoSharpenRadiusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167videoSharpenRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167videoSharpenRadius = value
        AppToast.show(this, "Video Sharpen Radius: $value")
    }
}

internal fun PlayerActivity.showV167DanmakuRenderBatchTimeoutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167danmakuRenderBatchTimeout).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Batch Timeout",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167danmakuRenderBatchTimeout = value
        AppToast.show(this, "Danmaku Render Batch Timeout: $value")
    }
}

internal fun PlayerActivity.showV167SubtitleKaraokeFontSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v167subtitleKaraokeFontSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Font Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v167subtitleKaraokeFontSize = value
        AppToast.show(this, "Subtitle Karaoke Font Size: $value")
    }
}

internal fun PlayerActivity.showV168AudioGateRange168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168audioGateRange168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Range168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168audioGateRange168 = value
        AppToast.show(this, "Audio Gate Range168: $value")
    }
}

internal fun PlayerActivity.showV168DanmakuRenderBatchTimeout168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168danmakuRenderBatchTimeout168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Batch Timeout168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168danmakuRenderBatchTimeout168 = value
        AppToast.show(this, "Danmaku Render Batch Timeout168: $value")
    }
}

internal fun PlayerActivity.showV168SubtitleKaraokeFontSize168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168subtitleKaraokeFontSize168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Font Size168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168subtitleKaraokeFontSize168 = value
        AppToast.show(this, "Subtitle Karaoke Font Size168: $value")
    }
}

internal fun PlayerActivity.showV168GestureSwipeDownActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168gestureSwipeDownAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Down Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168gestureSwipeDownAction = value
        AppToast.show(this, "Gesture Swipe Down Action: $value")
    }
}

internal fun PlayerActivity.showV168CastVideoPIPAdaptiveBitrate168Toggle() {
    val current = BiliClient.prefs.v168castVideoPIPAdaptiveBitrate168
    BiliClient.prefs.v168castVideoPIPAdaptiveBitrate168 = !current
    AppToast.show(this, "Cast Video PIP Adaptive Bitrate168: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV168PlaylistRepeatMode168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168playlistRepeatMode168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168playlistRepeatMode168 = value
        AppToast.show(this, "Playlist Repeat Mode168: $value")
    }
}

internal fun PlayerActivity.showV168CacheCleanupOnLowStorageToggle() {
    val current = BiliClient.prefs.v168cacheCleanupOnLowStorage
    BiliClient.prefs.v168cacheCleanupOnLowStorage = !current
    AppToast.show(this, "Cache Cleanup On Low Storage: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV168ProgressBarLoadedColor168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168progressBarLoadedColor168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Loaded Color168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168progressBarLoadedColor168 = value
        AppToast.show(this, "Progress Bar Loaded Color168: $value")
    }
}

internal fun PlayerActivity.showV168VolumeFadeCurve168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168volumeFadeCurve168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Curve168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168volumeFadeCurve168 = value
        AppToast.show(this, "Volume Fade Curve168: $value")
    }
}

internal fun PlayerActivity.showV168HistorySyncBluetooth168Toggle() {
    val current = BiliClient.prefs.v168historySyncBluetooth168
    BiliClient.prefs.v168historySyncBluetooth168 = !current
    AppToast.show(this, "History Sync Bluetooth168: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV168PlaybackAutoNextToggle() {
    val current = BiliClient.prefs.v168playbackAutoNext
    BiliClient.prefs.v168playbackAutoNext = !current
    AppToast.show(this, "Playback Auto Next: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV168ScreenshotTimestampToggleToggle() {
    val current = BiliClient.prefs.v168screenshotTimestampToggle
    BiliClient.prefs.v168screenshotTimestampToggle = !current
    AppToast.show(this, "Screenshot Timestamp Toggle: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV168VideoSharpenRadius168Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168videoSharpenRadius168).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Radius168",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168videoSharpenRadius168 = value
        AppToast.show(this, "Video Sharpen Radius168: $value")
    }
}

internal fun PlayerActivity.showV168DanmakuRenderFlushPolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168danmakuRenderFlushPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Flush Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168danmakuRenderFlushPolicy = value
        AppToast.show(this, "Danmaku Render Flush Policy: $value")
    }
}

internal fun PlayerActivity.showV168SubtitleKaraokeAlignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v168subtitleKaraokeAlign).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Align",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v168subtitleKaraokeAlign = value
        AppToast.show(this, "Subtitle Karaoke Align: $value")
    }
}

internal fun PlayerActivity.showV169AudioGateKneeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169audioGateKnee).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Gate Knee",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169audioGateKnee = value
        AppToast.show(this, "Audio Gate Knee: $value")
    }
}

internal fun PlayerActivity.showV169DanmakuRenderFlushPolicy169Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169danmakuRenderFlushPolicy169).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Render Flush Policy169",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169danmakuRenderFlushPolicy169 = value
        AppToast.show(this, "Danmaku Render Flush Policy169: $value")
    }
}

internal fun PlayerActivity.showV169SubtitleKaraokeAlign169Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169subtitleKaraokeAlign169).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Karaoke Align169",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169subtitleKaraokeAlign169 = value
        AppToast.show(this, "Subtitle Karaoke Align169: $value")
    }
}

internal fun PlayerActivity.showV169GesturePinchInActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169gesturePinchInAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch In Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169gesturePinchInAction = value
        AppToast.show(this, "Gesture Pinch In Action: $value")
    }
}

internal fun PlayerActivity.showV169CastVideoPIPResolutionScaleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169castVideoPIPResolutionScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Resolution Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169castVideoPIPResolutionScale = value
        AppToast.show(this, "Cast Video PIP Resolution Scale: $value")
    }
}

internal fun PlayerActivity.showV169PlaylistAutoPlayRelatedToggle() {
    val current = BiliClient.prefs.v169playlistAutoPlayRelated
    BiliClient.prefs.v169playlistAutoPlayRelated = !current
    AppToast.show(this, "Playlist Auto Play Related: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV169CacheCleanupOnLowStorage169Toggle() {
    val current = BiliClient.prefs.v169cacheCleanupOnLowStorage169
    BiliClient.prefs.v169cacheCleanupOnLowStorage169 = !current
    AppToast.show(this, "Cache Cleanup On Low Storage169: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV169ProgressBarLoadedOpacityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169progressBarLoadedOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Loaded Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169progressBarLoadedOpacity = value
        AppToast.show(this, "Progress Bar Loaded Opacity: $value")
    }
}

internal fun PlayerActivity.showV169VolumeSpatialToggle169Toggle() {
    val current = BiliClient.prefs.v169volumeSpatialToggle169
    BiliClient.prefs.v169volumeSpatialToggle169 = !current
    AppToast.show(this, "Volume Spatial Toggle169: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV169HistorySearchFullTextToggle() {
    val current = BiliClient.prefs.v169historySearchFullText
    BiliClient.prefs.v169historySearchFullText = !current
    AppToast.show(this, "History Search Full Text: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV169PlaybackAutoNext169Toggle() {
    val current = BiliClient.prefs.v169playbackAutoNext169
    BiliClient.prefs.v169playbackAutoNext169 = !current
    AppToast.show(this, "Playback Auto Next169: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV169ScreenshotTimestampToggle169Toggle() {
    val current = BiliClient.prefs.v169screenshotTimestampToggle169
    BiliClient.prefs.v169screenshotTimestampToggle169 = !current
    AppToast.show(this, "Screenshot Timestamp Toggle169: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV169VideoSharpenThresholdDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v169videoSharpenThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sharpen Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v169videoSharpenThreshold = value
        AppToast.show(this, "Video Sharpen Threshold: $value")
    }
}

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

internal fun PlayerActivity.showV169SubtitleKaraokeShadowToggle() {
    val current = BiliClient.prefs.v169subtitleKaraokeShadow
    BiliClient.prefs.v169subtitleKaraokeShadow = !current
    AppToast.show(this, "Subtitle Karaoke Shadow: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV170SubtitleKaraokeShadow170Toggle() {
    val current = BiliClient.prefs.v170subtitleKaraokeShadow170
    BiliClient.prefs.v170subtitleKaraokeShadow170 = !current
    AppToast.show(this, "Subtitle Karaoke Shadow170: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV170PlaylistAutoPlayRelated170Toggle() {
    val current = BiliClient.prefs.v170playlistAutoPlayRelated170
    BiliClient.prefs.v170playlistAutoPlayRelated170 = !current
    AppToast.show(this, "Playlist Auto Play Related170: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV170HistorySearchFullText170Toggle() {
    val current = BiliClient.prefs.v170historySearchFullText170
    BiliClient.prefs.v170historySearchFullText170 = !current
    AppToast.show(this, "History Search Full Text170: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV170PlaybackLoopABToggle170Toggle() {
    val current = BiliClient.prefs.v170playbackLoopABToggle170
    BiliClient.prefs.v170playbackLoopABToggle170 = !current
    AppToast.show(this, "Playback Loop AB Toggle170: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV170ScreenshotWatermarkToggle170Toggle() {
    val current = BiliClient.prefs.v170screenshotWatermarkToggle170
    BiliClient.prefs.v170screenshotWatermarkToggle170 = !current
    AppToast.show(this, "Screenshot Watermark Toggle170: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV170DanmakuRenderFlushAllToggle() {
    val current = BiliClient.prefs.v170danmakuRenderFlushAll
    BiliClient.prefs.v170danmakuRenderFlushAll = !current
    AppToast.show(this, "Danmaku Render Flush All: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV170SubtitleKaraokeBorderToggle() {
    val current = BiliClient.prefs.v170subtitleKaraokeBorder
    BiliClient.prefs.v170subtitleKaraokeBorder = !current
    AppToast.show(this, "Subtitle Karaoke Border: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV171AudioNormalizerToggle171Toggle() {
    val current = BiliClient.prefs.v171audioNormalizerToggle171
    BiliClient.prefs.v171audioNormalizerToggle171 = !current
    AppToast.show(this, "Audio Normalizer Toggle171: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV171PlaylistAutoAddRelatedToggle() {
    val current = BiliClient.prefs.v171playlistAutoAddRelated
    BiliClient.prefs.v171playlistAutoAddRelated = !current
    AppToast.show(this, "Playlist Auto Add Related: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV171ProgressBarScrubPreviewToggle() {
    val current = BiliClient.prefs.v171progressBarScrubPreview
    BiliClient.prefs.v171progressBarScrubPreview = !current
    AppToast.show(this, "Progress Bar Scrub Preview: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV171HistoryGroupByDateToggle() {
    val current = BiliClient.prefs.v171historyGroupByDate
    BiliClient.prefs.v171historyGroupByDate = !current
    AppToast.show(this, "History Group By Date: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV171ScreenshotOverlayInfoToggle() {
    val current = BiliClient.prefs.v171screenshotOverlayInfo
    BiliClient.prefs.v171screenshotOverlayInfo = !current
    AppToast.show(this, "Screenshot Overlay Info: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV171VideoContrastToggle171Toggle() {
    val current = BiliClient.prefs.v171videoContrastToggle171
    BiliClient.prefs.v171videoContrastToggle171 = !current
    AppToast.show(this, "Video Contrast Toggle171: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV172PlaylistAutoAddRelated172Toggle() {
    val current = BiliClient.prefs.v172playlistAutoAddRelated172
    BiliClient.prefs.v172playlistAutoAddRelated172 = !current
    AppToast.show(this, "Playlist Auto Add Related172: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV172ProgressBarScrubPreview172Toggle() {
    val current = BiliClient.prefs.v172progressBarScrubPreview172
    BiliClient.prefs.v172progressBarScrubPreview172 = !current
    AppToast.show(this, "Progress Bar Scrub Preview172: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV172HistoryGroupByDate172Toggle() {
    val current = BiliClient.prefs.v172historyGroupByDate172
    BiliClient.prefs.v172historyGroupByDate172 = !current
    AppToast.show(this, "History Group By Date172: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV172ScreenshotOverlayInfo172Toggle() {
    val current = BiliClient.prefs.v172screenshotOverlayInfo172
    BiliClient.prefs.v172screenshotOverlayInfo172 = !current
    AppToast.show(this, "Screenshot Overlay Info172: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV172DanmakuScrollOverlapToggle() {
    val current = BiliClient.prefs.v172danmakuScrollOverlap
    BiliClient.prefs.v172danmakuScrollOverlap = !current
    AppToast.show(this, "Danmaku Scroll Overlap: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV173DanmakuScrollOverlap173Toggle() {
    val current = BiliClient.prefs.v173danmakuScrollOverlap173
    BiliClient.prefs.v173danmakuScrollOverlap173 = !current
    AppToast.show(this, "Danmaku Scroll Overlap173: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV173CastVideoPIPConnectAutoToggle() {
    val current = BiliClient.prefs.v173castVideoPIPConnectAuto
    BiliClient.prefs.v173castVideoPIPConnectAuto = !current
    AppToast.show(this, "Cast Video PIP Connect Auto: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV173PlaylistAutoNextOnEndToggle() {
    val current = BiliClient.prefs.v173playlistAutoNextOnEnd
    BiliClient.prefs.v173playlistAutoNextOnEnd = !current
    AppToast.show(this, "Playlist Auto Next On End: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV173CacheCompressToggle173Toggle() {
    val current = BiliClient.prefs.v173cacheCompressToggle173
    BiliClient.prefs.v173cacheCompressToggle173 = !current
    AppToast.show(this, "Cache Compress Toggle173: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV173VolumeNormalizeTrackToggle() {
    val current = BiliClient.prefs.v173volumeNormalizeTrack
    BiliClient.prefs.v173volumeNormalizeTrack = !current
    AppToast.show(this, "Volume Normalize Track: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV173HistoryGroupByUploaderToggle() {
    val current = BiliClient.prefs.v173historyGroupByUploader
    BiliClient.prefs.v173historyGroupByUploader = !current
    AppToast.show(this, "History Group By Uploader: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV173ScreenshotOverlayDateToggle() {
    val current = BiliClient.prefs.v173screenshotOverlayDate
    BiliClient.prefs.v173screenshotOverlayDate = !current
    AppToast.show(this, "Screenshot Overlay Date: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV174CastVideoPIPConnectAuto174Toggle() {
    val current = BiliClient.prefs.v174castVideoPIPConnectAuto174
    BiliClient.prefs.v174castVideoPIPConnectAuto174 = !current
    AppToast.show(this, "Cast Video PIP Connect Auto174: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV174PlaylistAutoNextOnEnd174Toggle() {
    val current = BiliClient.prefs.v174playlistAutoNextOnEnd174
    BiliClient.prefs.v174playlistAutoNextOnEnd174 = !current
    AppToast.show(this, "Playlist Auto Next On End174: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV174ProgressBarScrubPreviewTextToggle() {
    val current = BiliClient.prefs.v174progressBarScrubPreviewText
    BiliClient.prefs.v174progressBarScrubPreviewText = !current
    AppToast.show(this, "Progress Bar Scrub Preview Text: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV174VolumeNormalizeTrack174Toggle() {
    val current = BiliClient.prefs.v174volumeNormalizeTrack174
    BiliClient.prefs.v174volumeNormalizeTrack174 = !current
    AppToast.show(this, "Volume Normalize Track174: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV174HistoryGroupByUploader174Toggle() {
    val current = BiliClient.prefs.v174historyGroupByUploader174
    BiliClient.prefs.v174historyGroupByUploader174 = !current
    AppToast.show(this, "History Group By Uploader174: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV174ScreenshotOverlayTitleToggle() {
    val current = BiliClient.prefs.v174screenshotOverlayTitle
    BiliClient.prefs.v174screenshotOverlayTitle = !current
    AppToast.show(this, "Screenshot Overlay Title: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV174VideoSaturationToggle174Toggle() {
    val current = BiliClient.prefs.v174videoSaturationToggle174
    BiliClient.prefs.v174videoSaturationToggle174 = !current
    AppToast.show(this, "Video Saturation Toggle174: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV174SubtitleShadowToggle174Toggle() {
    val current = BiliClient.prefs.v174subtitleShadowToggle174
    BiliClient.prefs.v174subtitleShadowToggle174 = !current
    AppToast.show(this, "Subtitle Shadow Toggle174: ${if (!current) "ON" else "OFF"}")
}

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

