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

// v316: Volume Normalize Mode298
internal fun PlayerActivity.showV316VolumeNormalizeMode298Toggle() {
    val current = BiliClient.prefs.v316volumeNormalizeMode298
    BiliClient.prefs.v316volumeNormalizeMode298 = !current
    AppToast.show(this, "Volume Normalize Mode298: ${if (!current) "ON" else "OFF"}")
}

// v316: History Auto Clean298
internal fun PlayerActivity.showV316HistoryAutoClean298Toggle() {
    val current = BiliClient.prefs.v316historyAutoClean298
    BiliClient.prefs.v316historyAutoClean298 = !current
    AppToast.show(this, "History Auto Clean298: ${if (!current) "ON" else "OFF"}")
}

// v316: Playback Resume From Background298
internal fun PlayerActivity.showV316PlaybackResumeFromBackground298Toggle() {
    val current = BiliClient.prefs.v316playbackResumeFromBackground298
    BiliClient.prefs.v316playbackResumeFromBackground298 = !current
    AppToast.show(this, "Playback Resume From Background298: ${if (!current) "ON" else "OFF"}")
}

// v316: Screenshot Enhance298
internal fun PlayerActivity.showV316ScreenshotEnhance298Toggle() {
    val current = BiliClient.prefs.v316screenshotEnhance298
    BiliClient.prefs.v316screenshotEnhance298 = !current
    AppToast.show(this, "Screenshot Enhance298: ${if (!current) "ON" else "OFF"}")
}

// v316: Video HDR298
internal fun PlayerActivity.showV316VideoHDR298Toggle() {
    val current = BiliClient.prefs.v316videoHDR298
    BiliClient.prefs.v316videoHDR298 = !current
    AppToast.show(this, "Video HDR298: ${if (!current) "ON" else "OFF"}")
}

// v316: Danmaku Bottom Max Count440
internal fun PlayerActivity.showV316DanmakuBottomMaxCount440Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316danmakuBottomMaxCount440).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count440",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316danmakuBottomMaxCount440 = value
        AppToast.show(this, "Danmaku Bottom Max Count440: $value")
    }
}

// v316: Subtitle Fade In304
internal fun PlayerActivity.showV316SubtitleFadeIn304Toggle() {
    val current = BiliClient.prefs.v316subtitleFadeIn304
    BiliClient.prefs.v316subtitleFadeIn304 = !current
    AppToast.show(this, "Subtitle Fade In304: ${if (!current) "ON" else "OFF"}")
}

// v317: Audio Compressor Ratio299
internal fun PlayerActivity.showV317AudioCompressorRatio299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317audioCompressorRatio299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317audioCompressorRatio299 = value
        AppToast.show(this, "Audio Compressor Ratio299: $value")
    }
}

// v317: Danmaku Bottom Max Count441
internal fun PlayerActivity.showV317DanmakuBottomMaxCount441Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317danmakuBottomMaxCount441).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count441",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317danmakuBottomMaxCount441 = value
        AppToast.show(this, "Danmaku Bottom Max Count441: $value")
    }
}

// v317: Subtitle Fade In305
internal fun PlayerActivity.showV317SubtitleFadeIn305Toggle() {
    val current = BiliClient.prefs.v317subtitleFadeIn305
    BiliClient.prefs.v317subtitleFadeIn305 = !current
    AppToast.show(this, "Subtitle Fade In305: ${if (!current) "ON" else "OFF"}")
}

// v317: Gesture Shake Sensitivity299
internal fun PlayerActivity.showV317GestureShakeSensitivity299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317gestureShakeSensitivity299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317gestureShakeSensitivity299 = value
        AppToast.show(this, "Gesture Shake Sensitivity299: $value")
    }
}

// v317: Cast Bitrate299
internal fun PlayerActivity.showV317CastBitrate299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317castBitrate299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317castBitrate299 = value
        AppToast.show(this, "Cast Bitrate299: $value")
    }
}

// v317: Playlist Auto Next299
internal fun PlayerActivity.showV317PlaylistAutoNext299Toggle() {
    val current = BiliClient.prefs.v317playlistAutoNext299
    BiliClient.prefs.v317playlistAutoNext299 = !current
    AppToast.show(this, "Playlist Auto Next299: ${if (!current) "ON" else "OFF"}")
}

// v317: Cache Preload Size300
internal fun PlayerActivity.showV317CachePreloadSize300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317cachePreloadSize300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317cachePreloadSize300 = value
        AppToast.show(this, "Cache Preload Size300: $value")
    }
}

// v317: Progress Bar Style299
internal fun PlayerActivity.showV317ProgressBarStyle299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317progressBarStyle299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317progressBarStyle299 = value
        AppToast.show(this, "Progress Bar Style299: $value")
    }
}

// v317: Volume Normalize Mode299
internal fun PlayerActivity.showV317VolumeNormalizeMode299Toggle() {
    val current = BiliClient.prefs.v317volumeNormalizeMode299
    BiliClient.prefs.v317volumeNormalizeMode299 = !current
    AppToast.show(this, "Volume Normalize Mode299: ${if (!current) "ON" else "OFF"}")
}

// v317: History Auto Clean299
internal fun PlayerActivity.showV317HistoryAutoClean299Toggle() {
    val current = BiliClient.prefs.v317historyAutoClean299
    BiliClient.prefs.v317historyAutoClean299 = !current
    AppToast.show(this, "History Auto Clean299: ${if (!current) "ON" else "OFF"}")
}

// v317: Playback Resume From Background299
internal fun PlayerActivity.showV317PlaybackResumeFromBackground299Toggle() {
    val current = BiliClient.prefs.v317playbackResumeFromBackground299
    BiliClient.prefs.v317playbackResumeFromBackground299 = !current
    AppToast.show(this, "Playback Resume From Background299: ${if (!current) "ON" else "OFF"}")
}

// v317: Screenshot Enhance299
internal fun PlayerActivity.showV317ScreenshotEnhance299Toggle() {
    val current = BiliClient.prefs.v317screenshotEnhance299
    BiliClient.prefs.v317screenshotEnhance299 = !current
    AppToast.show(this, "Screenshot Enhance299: ${if (!current) "ON" else "OFF"}")
}

// v317: Video HDR299
internal fun PlayerActivity.showV317VideoHDR299Toggle() {
    val current = BiliClient.prefs.v317videoHDR299
    BiliClient.prefs.v317videoHDR299 = !current
    AppToast.show(this, "Video HDR299: ${if (!current) "ON" else "OFF"}")
}

// v317: Danmaku Bottom Max Count442
internal fun PlayerActivity.showV317DanmakuBottomMaxCount442Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317danmakuBottomMaxCount442).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count442",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317danmakuBottomMaxCount442 = value
        AppToast.show(this, "Danmaku Bottom Max Count442: $value")
    }
}

// v317: Subtitle Fade In306
internal fun PlayerActivity.showV317SubtitleFadeIn306Toggle() {
    val current = BiliClient.prefs.v317subtitleFadeIn306
    BiliClient.prefs.v317subtitleFadeIn306 = !current
    AppToast.show(this, "Subtitle Fade In306: ${if (!current) "ON" else "OFF"}")
}

// v318: Audio Compressor Ratio300
internal fun PlayerActivity.showV318AudioCompressorRatio300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318audioCompressorRatio300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318audioCompressorRatio300 = value
        AppToast.show(this, "Audio Compressor Ratio300: $value")
    }
}

// v318: Danmaku Bottom Max Count443
internal fun PlayerActivity.showV318DanmakuBottomMaxCount443Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318danmakuBottomMaxCount443).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count443",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318danmakuBottomMaxCount443 = value
        AppToast.show(this, "Danmaku Bottom Max Count443: $value")
    }
}

// v318: Subtitle Fade In307
internal fun PlayerActivity.showV318SubtitleFadeIn307Toggle() {
    val current = BiliClient.prefs.v318subtitleFadeIn307
    BiliClient.prefs.v318subtitleFadeIn307 = !current
    AppToast.show(this, "Subtitle Fade In307: ${if (!current) "ON" else "OFF"}")
}

// v318: Gesture Shake Sensitivity300
internal fun PlayerActivity.showV318GestureShakeSensitivity300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318gestureShakeSensitivity300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318gestureShakeSensitivity300 = value
        AppToast.show(this, "Gesture Shake Sensitivity300: $value")
    }
}

// v318: Cast Bitrate300
internal fun PlayerActivity.showV318CastBitrate300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318castBitrate300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318castBitrate300 = value
        AppToast.show(this, "Cast Bitrate300: $value")
    }
}

// v318: Playlist Auto Next300
internal fun PlayerActivity.showV318PlaylistAutoNext300Toggle() {
    val current = BiliClient.prefs.v318playlistAutoNext300
    BiliClient.prefs.v318playlistAutoNext300 = !current
    AppToast.show(this, "Playlist Auto Next300: ${if (!current) "ON" else "OFF"}")
}

// v318: Cache Preload Size301
internal fun PlayerActivity.showV318CachePreloadSize301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318cachePreloadSize301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318cachePreloadSize301 = value
        AppToast.show(this, "Cache Preload Size301: $value")
    }
}

// v318: Progress Bar Style300
internal fun PlayerActivity.showV318ProgressBarStyle300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318progressBarStyle300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318progressBarStyle300 = value
        AppToast.show(this, "Progress Bar Style300: $value")
    }
}

// v318: Volume Normalize Mode300
internal fun PlayerActivity.showV318VolumeNormalizeMode300Toggle() {
    val current = BiliClient.prefs.v318volumeNormalizeMode300
    BiliClient.prefs.v318volumeNormalizeMode300 = !current
    AppToast.show(this, "Volume Normalize Mode300: ${if (!current) "ON" else "OFF"}")
}

// v318: History Auto Clean300
internal fun PlayerActivity.showV318HistoryAutoClean300Toggle() {
    val current = BiliClient.prefs.v318historyAutoClean300
    BiliClient.prefs.v318historyAutoClean300 = !current
    AppToast.show(this, "History Auto Clean300: ${if (!current) "ON" else "OFF"}")
}

// v318: Playback Resume From Background300
internal fun PlayerActivity.showV318PlaybackResumeFromBackground300Toggle() {
    val current = BiliClient.prefs.v318playbackResumeFromBackground300
    BiliClient.prefs.v318playbackResumeFromBackground300 = !current
    AppToast.show(this, "Playback Resume From Background300: ${if (!current) "ON" else "OFF"}")
}

// v318: Screenshot Enhance300
internal fun PlayerActivity.showV318ScreenshotEnhance300Toggle() {
    val current = BiliClient.prefs.v318screenshotEnhance300
    BiliClient.prefs.v318screenshotEnhance300 = !current
    AppToast.show(this, "Screenshot Enhance300: ${if (!current) "ON" else "OFF"}")
}

// v318: Video HDR300
internal fun PlayerActivity.showV318VideoHDR300Toggle() {
    val current = BiliClient.prefs.v318videoHDR300
    BiliClient.prefs.v318videoHDR300 = !current
    AppToast.show(this, "Video HDR300: ${if (!current) "ON" else "OFF"}")
}

// v318: Danmaku Bottom Max Count444
internal fun PlayerActivity.showV318DanmakuBottomMaxCount444Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318danmakuBottomMaxCount444).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count444",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318danmakuBottomMaxCount444 = value
        AppToast.show(this, "Danmaku Bottom Max Count444: $value")
    }
}

// v318: Subtitle Fade In308
internal fun PlayerActivity.showV318SubtitleFadeIn308Toggle() {
    val current = BiliClient.prefs.v318subtitleFadeIn308
    BiliClient.prefs.v318subtitleFadeIn308 = !current
    AppToast.show(this, "Subtitle Fade In308: ${if (!current) "ON" else "OFF"}")
}

// v319: Audio Compressor Ratio301
internal fun PlayerActivity.showV319AudioCompressorRatio301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319audioCompressorRatio301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319audioCompressorRatio301 = value
        AppToast.show(this, "Audio Compressor Ratio301: $value")
    }
}

// v319: Danmaku Bottom Max Count445
internal fun PlayerActivity.showV319DanmakuBottomMaxCount445Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319danmakuBottomMaxCount445).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count445",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319danmakuBottomMaxCount445 = value
        AppToast.show(this, "Danmaku Bottom Max Count445: $value")
    }
}

// v319: Subtitle Fade In309
internal fun PlayerActivity.showV319SubtitleFadeIn309Toggle() {
    val current = BiliClient.prefs.v319subtitleFadeIn309
    BiliClient.prefs.v319subtitleFadeIn309 = !current
    AppToast.show(this, "Subtitle Fade In309: ${if (!current) "ON" else "OFF"}")
}

// v319: Gesture Shake Sensitivity301
internal fun PlayerActivity.showV319GestureShakeSensitivity301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319gestureShakeSensitivity301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319gestureShakeSensitivity301 = value
        AppToast.show(this, "Gesture Shake Sensitivity301: $value")
    }
}

// v319: Cast Bitrate301
internal fun PlayerActivity.showV319CastBitrate301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319castBitrate301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319castBitrate301 = value
        AppToast.show(this, "Cast Bitrate301: $value")
    }
}

// v319: Playlist Auto Next301
internal fun PlayerActivity.showV319PlaylistAutoNext301Toggle() {
    val current = BiliClient.prefs.v319playlistAutoNext301
    BiliClient.prefs.v319playlistAutoNext301 = !current
    AppToast.show(this, "Playlist Auto Next301: ${if (!current) "ON" else "OFF"}")
}

// v319: Cache Preload Size302
internal fun PlayerActivity.showV319CachePreloadSize302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319cachePreloadSize302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319cachePreloadSize302 = value
        AppToast.show(this, "Cache Preload Size302: $value")
    }
}

// v319: Progress Bar Style301
internal fun PlayerActivity.showV319ProgressBarStyle301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319progressBarStyle301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319progressBarStyle301 = value
        AppToast.show(this, "Progress Bar Style301: $value")
    }
}

// v319: Volume Normalize Mode301
internal fun PlayerActivity.showV319VolumeNormalizeMode301Toggle() {
    val current = BiliClient.prefs.v319volumeNormalizeMode301
    BiliClient.prefs.v319volumeNormalizeMode301 = !current
    AppToast.show(this, "Volume Normalize Mode301: ${if (!current) "ON" else "OFF"}")
}

// v319: History Auto Clean301
internal fun PlayerActivity.showV319HistoryAutoClean301Toggle() {
    val current = BiliClient.prefs.v319historyAutoClean301
    BiliClient.prefs.v319historyAutoClean301 = !current
    AppToast.show(this, "History Auto Clean301: ${if (!current) "ON" else "OFF"}")
}

// v319: Playback Resume From Background301
internal fun PlayerActivity.showV319PlaybackResumeFromBackground301Toggle() {
    val current = BiliClient.prefs.v319playbackResumeFromBackground301
    BiliClient.prefs.v319playbackResumeFromBackground301 = !current
    AppToast.show(this, "Playback Resume From Background301: ${if (!current) "ON" else "OFF"}")
}

// v319: Screenshot Enhance301
internal fun PlayerActivity.showV319ScreenshotEnhance301Toggle() {
    val current = BiliClient.prefs.v319screenshotEnhance301
    BiliClient.prefs.v319screenshotEnhance301 = !current
    AppToast.show(this, "Screenshot Enhance301: ${if (!current) "ON" else "OFF"}")
}

// v319: Video HDR301
internal fun PlayerActivity.showV319VideoHDR301Toggle() {
    val current = BiliClient.prefs.v319videoHDR301
    BiliClient.prefs.v319videoHDR301 = !current
    AppToast.show(this, "Video HDR301: ${if (!current) "ON" else "OFF"}")
}

// v319: Danmaku Bottom Max Count446
internal fun PlayerActivity.showV319DanmakuBottomMaxCount446Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319danmakuBottomMaxCount446).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count446",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319danmakuBottomMaxCount446 = value
        AppToast.show(this, "Danmaku Bottom Max Count446: $value")
    }
}

// v319: Subtitle Fade In310
internal fun PlayerActivity.showV319SubtitleFadeIn310Toggle() {
    val current = BiliClient.prefs.v319subtitleFadeIn310
    BiliClient.prefs.v319subtitleFadeIn310 = !current
    AppToast.show(this, "Subtitle Fade In310: ${if (!current) "ON" else "OFF"}")
}

// v320: Audio Compressor Ratio302
internal fun PlayerActivity.showV320AudioCompressorRatio302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320audioCompressorRatio302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320audioCompressorRatio302 = value
        AppToast.show(this, "Audio Compressor Ratio302: $value")
    }
}

// v320: Danmaku Bottom Max Count447
internal fun PlayerActivity.showV320DanmakuBottomMaxCount447Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320danmakuBottomMaxCount447).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count447",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320danmakuBottomMaxCount447 = value
        AppToast.show(this, "Danmaku Bottom Max Count447: $value")
    }
}

// v320: Subtitle Fade In311
internal fun PlayerActivity.showV320SubtitleFadeIn311Toggle() {
    val current = BiliClient.prefs.v320subtitleFadeIn311
    BiliClient.prefs.v320subtitleFadeIn311 = !current
    AppToast.show(this, "Subtitle Fade In311: ${if (!current) "ON" else "OFF"}")
}

// v320: Gesture Shake Sensitivity302
internal fun PlayerActivity.showV320GestureShakeSensitivity302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320gestureShakeSensitivity302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320gestureShakeSensitivity302 = value
        AppToast.show(this, "Gesture Shake Sensitivity302: $value")
    }
}

// v320: Cast Bitrate302
internal fun PlayerActivity.showV320CastBitrate302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320castBitrate302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320castBitrate302 = value
        AppToast.show(this, "Cast Bitrate302: $value")
    }
}

// v320: Playlist Auto Next302
internal fun PlayerActivity.showV320PlaylistAutoNext302Toggle() {
    val current = BiliClient.prefs.v320playlistAutoNext302
    BiliClient.prefs.v320playlistAutoNext302 = !current
    AppToast.show(this, "Playlist Auto Next302: ${if (!current) "ON" else "OFF"}")
}

// v320: Cache Preload Size303
internal fun PlayerActivity.showV320CachePreloadSize303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320cachePreloadSize303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320cachePreloadSize303 = value
        AppToast.show(this, "Cache Preload Size303: $value")
    }
}

// v320: Progress Bar Style302
internal fun PlayerActivity.showV320ProgressBarStyle302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320progressBarStyle302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320progressBarStyle302 = value
        AppToast.show(this, "Progress Bar Style302: $value")
    }
}

// v320: Volume Normalize Mode302
internal fun PlayerActivity.showV320VolumeNormalizeMode302Toggle() {
    val current = BiliClient.prefs.v320volumeNormalizeMode302
    BiliClient.prefs.v320volumeNormalizeMode302 = !current
    AppToast.show(this, "Volume Normalize Mode302: ${if (!current) "ON" else "OFF"}")
}

// v320: History Auto Clean302
internal fun PlayerActivity.showV320HistoryAutoClean302Toggle() {
    val current = BiliClient.prefs.v320historyAutoClean302
    BiliClient.prefs.v320historyAutoClean302 = !current
    AppToast.show(this, "History Auto Clean302: ${if (!current) "ON" else "OFF"}")
}

// v320: Playback Resume From Background302
internal fun PlayerActivity.showV320PlaybackResumeFromBackground302Toggle() {
    val current = BiliClient.prefs.v320playbackResumeFromBackground302
    BiliClient.prefs.v320playbackResumeFromBackground302 = !current
    AppToast.show(this, "Playback Resume From Background302: ${if (!current) "ON" else "OFF"}")
}

// v320: Screenshot Enhance302
internal fun PlayerActivity.showV320ScreenshotEnhance302Toggle() {
    val current = BiliClient.prefs.v320screenshotEnhance302
    BiliClient.prefs.v320screenshotEnhance302 = !current
    AppToast.show(this, "Screenshot Enhance302: ${if (!current) "ON" else "OFF"}")
}

// v320: Video HDR302
internal fun PlayerActivity.showV320VideoHDR302Toggle() {
    val current = BiliClient.prefs.v320videoHDR302
    BiliClient.prefs.v320videoHDR302 = !current
    AppToast.show(this, "Video HDR302: ${if (!current) "ON" else "OFF"}")
}

// v320: Danmaku Bottom Max Count448
internal fun PlayerActivity.showV320DanmakuBottomMaxCount448Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320danmakuBottomMaxCount448).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count448",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320danmakuBottomMaxCount448 = value
        AppToast.show(this, "Danmaku Bottom Max Count448: $value")
    }
}

// v320: Subtitle Fade In312
internal fun PlayerActivity.showV320SubtitleFadeIn312Toggle() {
    val current = BiliClient.prefs.v320subtitleFadeIn312
    BiliClient.prefs.v320subtitleFadeIn312 = !current
    AppToast.show(this, "Subtitle Fade In312: ${if (!current) "ON" else "OFF"}")
}

// v321: Audio Dynamic Range303
internal fun PlayerActivity.showV321AudioDynamicRange303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321audioDynamicRange303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321audioDynamicRange303 = value
        AppToast.show(this, "Audio Dynamic Range303: $value")
    }
}

// v321: Danmaku Top Count Max303
internal fun PlayerActivity.showV321DanmakuTopCountMax303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321danmakuTopCountMax303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321danmakuTopCountMax303 = value
        AppToast.show(this, "Danmaku Top Count Max303: $value")
    }
}

// v321: Subtitle Stroke Width303
internal fun PlayerActivity.showV321SubtitleStrokeWidth303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321subtitleStrokeWidth303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321subtitleStrokeWidth303 = value
        AppToast.show(this, "Subtitle Stroke Width303: $value")
    }
}

// v321: Gesture Long Press Action303
internal fun PlayerActivity.showV321GestureLongPressAction303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321gestureLongPressAction303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321gestureLongPressAction303 = value
        AppToast.show(this, "Gesture Long Press Action303: $value")
    }
}

// v321: Cast Quality303
internal fun PlayerActivity.showV321CastQuality303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321castQuality303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321castQuality303 = value
        AppToast.show(this, "Cast Quality303: $value")
    }
}

// v321: Playlist Repeat Mode303
internal fun PlayerActivity.showV321PlaylistRepeatMode303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321playlistRepeatMode303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321playlistRepeatMode303 = value
        AppToast.show(this, "Playlist Repeat Mode303: $value")
    }
}

// v321: Cache Max Size303
internal fun PlayerActivity.showV321CacheMaxSize303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321cacheMaxSize303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321cacheMaxSize303 = value
        AppToast.show(this, "Cache Max Size303: $value")
    }
}

// v321: Progress Bar Height303
internal fun PlayerActivity.showV321ProgressBarHeight303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321progressBarHeight303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321progressBarHeight303 = value
        AppToast.show(this, "Progress Bar Height303: $value")
    }
}

// v321: Volume Level Indicator303
internal fun PlayerActivity.showV321VolumeLevelIndicator303Toggle() {
    val current = BiliClient.prefs.v321volumeLevelIndicator303
    BiliClient.prefs.v321volumeLevelIndicator303 = !current
    AppToast.show(this, "Volume Level Indicator303: ${if (!current) "ON" else "OFF"}")
}

// v321: History Search Enabled303
internal fun PlayerActivity.showV321HistorySearchEnabled303Toggle() {
    val current = BiliClient.prefs.v321historySearchEnabled303
    BiliClient.prefs.v321historySearchEnabled303 = !current
    AppToast.show(this, "History Search Enabled303: ${if (!current) "ON" else "OFF"}")
}

// v321: Playback Speed Memory303
internal fun PlayerActivity.showV321PlaybackSpeedMemory303Toggle() {
    val current = BiliClient.prefs.v321playbackSpeedMemory303
    BiliClient.prefs.v321playbackSpeedMemory303 = !current
    AppToast.show(this, "Playback Speed Memory303: ${if (!current) "ON" else "OFF"}")
}

// v321: Screenshot Format303
internal fun PlayerActivity.showV321ScreenshotFormat303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321screenshotFormat303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321screenshotFormat303 = value
        AppToast.show(this, "Screenshot Format303: $value")
    }
}

// v321: Video Deinterlace303
internal fun PlayerActivity.showV321VideoDeinterlace303Toggle() {
    val current = BiliClient.prefs.v321videoDeinterlace303
    BiliClient.prefs.v321videoDeinterlace303 = !current
    AppToast.show(this, "Video Deinterlace303: ${if (!current) "ON" else "OFF"}")
}

// v321: Danmaku Top Count Max304
internal fun PlayerActivity.showV321DanmakuTopCountMax304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321danmakuTopCountMax304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321danmakuTopCountMax304 = value
        AppToast.show(this, "Danmaku Top Count Max304: $value")
    }
}

// v321: Subtitle Stroke Width304
internal fun PlayerActivity.showV321SubtitleStrokeWidth304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321subtitleStrokeWidth304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321subtitleStrokeWidth304 = value
        AppToast.show(this, "Subtitle Stroke Width304: $value")
    }
}

// v322: Audio Dynamic Range304
internal fun PlayerActivity.showV322AudioDynamicRange304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322audioDynamicRange304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322audioDynamicRange304 = value
        AppToast.show(this, "Audio Dynamic Range304: $value")
    }
}

// v322: Danmaku Top Count Max305
internal fun PlayerActivity.showV322DanmakuTopCountMax305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322danmakuTopCountMax305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322danmakuTopCountMax305 = value
        AppToast.show(this, "Danmaku Top Count Max305: $value")
    }
}

// v322: Subtitle Stroke Width305
internal fun PlayerActivity.showV322SubtitleStrokeWidth305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322subtitleStrokeWidth305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322subtitleStrokeWidth305 = value
        AppToast.show(this, "Subtitle Stroke Width305: $value")
    }
}

// v322: Gesture Long Press Action304
internal fun PlayerActivity.showV322GestureLongPressAction304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322gestureLongPressAction304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322gestureLongPressAction304 = value
        AppToast.show(this, "Gesture Long Press Action304: $value")
    }
}

// v322: Cast Quality304
internal fun PlayerActivity.showV322CastQuality304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322castQuality304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322castQuality304 = value
        AppToast.show(this, "Cast Quality304: $value")
    }
}

// v322: Playlist Repeat Mode304
internal fun PlayerActivity.showV322PlaylistRepeatMode304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322playlistRepeatMode304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322playlistRepeatMode304 = value
        AppToast.show(this, "Playlist Repeat Mode304: $value")
    }
}

// v322: Cache Max Size304
internal fun PlayerActivity.showV322CacheMaxSize304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322cacheMaxSize304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322cacheMaxSize304 = value
        AppToast.show(this, "Cache Max Size304: $value")
    }
}

// v322: Progress Bar Height304
internal fun PlayerActivity.showV322ProgressBarHeight304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322progressBarHeight304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322progressBarHeight304 = value
        AppToast.show(this, "Progress Bar Height304: $value")
    }
}

// v322: Volume Level Indicator304
internal fun PlayerActivity.showV322VolumeLevelIndicator304Toggle() {
    val current = BiliClient.prefs.v322volumeLevelIndicator304
    BiliClient.prefs.v322volumeLevelIndicator304 = !current
    AppToast.show(this, "Volume Level Indicator304: ${if (!current) "ON" else "OFF"}")
}

// v322: History Search Enabled304
internal fun PlayerActivity.showV322HistorySearchEnabled304Toggle() {
    val current = BiliClient.prefs.v322historySearchEnabled304
    BiliClient.prefs.v322historySearchEnabled304 = !current
    AppToast.show(this, "History Search Enabled304: ${if (!current) "ON" else "OFF"}")
}

// v322: Playback Speed Memory304
internal fun PlayerActivity.showV322PlaybackSpeedMemory304Toggle() {
    val current = BiliClient.prefs.v322playbackSpeedMemory304
    BiliClient.prefs.v322playbackSpeedMemory304 = !current
    AppToast.show(this, "Playback Speed Memory304: ${if (!current) "ON" else "OFF"}")
}

// v322: Screenshot Format304
internal fun PlayerActivity.showV322ScreenshotFormat304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322screenshotFormat304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322screenshotFormat304 = value
        AppToast.show(this, "Screenshot Format304: $value")
    }
}

// v322: Video Deinterlace304
internal fun PlayerActivity.showV322VideoDeinterlace304Toggle() {
    val current = BiliClient.prefs.v322videoDeinterlace304
    BiliClient.prefs.v322videoDeinterlace304 = !current
    AppToast.show(this, "Video Deinterlace304: ${if (!current) "ON" else "OFF"}")
}

// v322: Danmaku Top Count Max306
internal fun PlayerActivity.showV322DanmakuTopCountMax306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322danmakuTopCountMax306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322danmakuTopCountMax306 = value
        AppToast.show(this, "Danmaku Top Count Max306: $value")
    }
}

// v322: Subtitle Stroke Width306
internal fun PlayerActivity.showV322SubtitleStrokeWidth306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322subtitleStrokeWidth306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322subtitleStrokeWidth306 = value
        AppToast.show(this, "Subtitle Stroke Width306: $value")
    }
}

// v323: Audio Dynamic Range305
internal fun PlayerActivity.showV323AudioDynamicRange305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323audioDynamicRange305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323audioDynamicRange305 = value
        AppToast.show(this, "Audio Dynamic Range305: $value")
    }
}

// v323: Danmaku Top Count Max307
internal fun PlayerActivity.showV323DanmakuTopCountMax307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323danmakuTopCountMax307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323danmakuTopCountMax307 = value
        AppToast.show(this, "Danmaku Top Count Max307: $value")
    }
}

// v323: Subtitle Stroke Width307
internal fun PlayerActivity.showV323SubtitleStrokeWidth307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323subtitleStrokeWidth307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323subtitleStrokeWidth307 = value
        AppToast.show(this, "Subtitle Stroke Width307: $value")
    }
}

// v323: Gesture Long Press Action305
internal fun PlayerActivity.showV323GestureLongPressAction305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323gestureLongPressAction305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323gestureLongPressAction305 = value
        AppToast.show(this, "Gesture Long Press Action305: $value")
    }
}

// v323: Cast Quality305
internal fun PlayerActivity.showV323CastQuality305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323castQuality305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323castQuality305 = value
        AppToast.show(this, "Cast Quality305: $value")
    }
}

// v323: Playlist Repeat Mode305
internal fun PlayerActivity.showV323PlaylistRepeatMode305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323playlistRepeatMode305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323playlistRepeatMode305 = value
        AppToast.show(this, "Playlist Repeat Mode305: $value")
    }
}

// v323: Cache Max Size305
internal fun PlayerActivity.showV323CacheMaxSize305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323cacheMaxSize305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323cacheMaxSize305 = value
        AppToast.show(this, "Cache Max Size305: $value")
    }
}

// v323: Progress Bar Height305
internal fun PlayerActivity.showV323ProgressBarHeight305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323progressBarHeight305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323progressBarHeight305 = value
        AppToast.show(this, "Progress Bar Height305: $value")
    }
}

// v323: Volume Level Indicator305
internal fun PlayerActivity.showV323VolumeLevelIndicator305Toggle() {
    val current = BiliClient.prefs.v323volumeLevelIndicator305
    BiliClient.prefs.v323volumeLevelIndicator305 = !current
    AppToast.show(this, "Volume Level Indicator305: ${if (!current) "ON" else "OFF"}")
}

// v323: History Search Enabled305
internal fun PlayerActivity.showV323HistorySearchEnabled305Toggle() {
    val current = BiliClient.prefs.v323historySearchEnabled305
    BiliClient.prefs.v323historySearchEnabled305 = !current
    AppToast.show(this, "History Search Enabled305: ${if (!current) "ON" else "OFF"}")
}

// v323: Playback Speed Memory305
internal fun PlayerActivity.showV323PlaybackSpeedMemory305Toggle() {
    val current = BiliClient.prefs.v323playbackSpeedMemory305
    BiliClient.prefs.v323playbackSpeedMemory305 = !current
    AppToast.show(this, "Playback Speed Memory305: ${if (!current) "ON" else "OFF"}")
}

// v323: Screenshot Format305
internal fun PlayerActivity.showV323ScreenshotFormat305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323screenshotFormat305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323screenshotFormat305 = value
        AppToast.show(this, "Screenshot Format305: $value")
    }
}

// v323: Video Deinterlace305
internal fun PlayerActivity.showV323VideoDeinterlace305Toggle() {
    val current = BiliClient.prefs.v323videoDeinterlace305
    BiliClient.prefs.v323videoDeinterlace305 = !current
    AppToast.show(this, "Video Deinterlace305: ${if (!current) "ON" else "OFF"}")
}

// v323: Danmaku Top Count Max308
internal fun PlayerActivity.showV323DanmakuTopCountMax308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323danmakuTopCountMax308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323danmakuTopCountMax308 = value
        AppToast.show(this, "Danmaku Top Count Max308: $value")
    }
}

// v323: Subtitle Stroke Width308
internal fun PlayerActivity.showV323SubtitleStrokeWidth308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323subtitleStrokeWidth308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323subtitleStrokeWidth308 = value
        AppToast.show(this, "Subtitle Stroke Width308: $value")
    }
}

// v324: Audio Dynamic Range306
internal fun PlayerActivity.showV324AudioDynamicRange306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324audioDynamicRange306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324audioDynamicRange306 = value
        AppToast.show(this, "Audio Dynamic Range306: $value")
    }
}

// v324: Danmaku Top Count Max309
internal fun PlayerActivity.showV324DanmakuTopCountMax309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324danmakuTopCountMax309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324danmakuTopCountMax309 = value
        AppToast.show(this, "Danmaku Top Count Max309: $value")
    }
}

// v324: Subtitle Stroke Width309
internal fun PlayerActivity.showV324SubtitleStrokeWidth309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324subtitleStrokeWidth309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324subtitleStrokeWidth309 = value
        AppToast.show(this, "Subtitle Stroke Width309: $value")
    }
}

// v324: Gesture Long Press Action306
internal fun PlayerActivity.showV324GestureLongPressAction306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324gestureLongPressAction306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324gestureLongPressAction306 = value
        AppToast.show(this, "Gesture Long Press Action306: $value")
    }
}

// v324: Cast Quality306
internal fun PlayerActivity.showV324CastQuality306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324castQuality306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324castQuality306 = value
        AppToast.show(this, "Cast Quality306: $value")
    }
}

// v324: Playlist Repeat Mode306
internal fun PlayerActivity.showV324PlaylistRepeatMode306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324playlistRepeatMode306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324playlistRepeatMode306 = value
        AppToast.show(this, "Playlist Repeat Mode306: $value")
    }
}

// v324: Cache Max Size306
internal fun PlayerActivity.showV324CacheMaxSize306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324cacheMaxSize306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324cacheMaxSize306 = value
        AppToast.show(this, "Cache Max Size306: $value")
    }
}

// v324: Progress Bar Height306
internal fun PlayerActivity.showV324ProgressBarHeight306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324progressBarHeight306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324progressBarHeight306 = value
        AppToast.show(this, "Progress Bar Height306: $value")
    }
}

// v324: Volume Level Indicator306
internal fun PlayerActivity.showV324VolumeLevelIndicator306Toggle() {
    val current = BiliClient.prefs.v324volumeLevelIndicator306
    BiliClient.prefs.v324volumeLevelIndicator306 = !current
    AppToast.show(this, "Volume Level Indicator306: ${if (!current) "ON" else "OFF"}")
}

// v324: History Search Enabled306
internal fun PlayerActivity.showV324HistorySearchEnabled306Toggle() {
    val current = BiliClient.prefs.v324historySearchEnabled306
    BiliClient.prefs.v324historySearchEnabled306 = !current
    AppToast.show(this, "History Search Enabled306: ${if (!current) "ON" else "OFF"}")
}

// v324: Playback Speed Memory306
internal fun PlayerActivity.showV324PlaybackSpeedMemory306Toggle() {
    val current = BiliClient.prefs.v324playbackSpeedMemory306
    BiliClient.prefs.v324playbackSpeedMemory306 = !current
    AppToast.show(this, "Playback Speed Memory306: ${if (!current) "ON" else "OFF"}")
}

// v324: Screenshot Format306
internal fun PlayerActivity.showV324ScreenshotFormat306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324screenshotFormat306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324screenshotFormat306 = value
        AppToast.show(this, "Screenshot Format306: $value")
    }
}

// v324: Video Deinterlace306
internal fun PlayerActivity.showV324VideoDeinterlace306Toggle() {
    val current = BiliClient.prefs.v324videoDeinterlace306
    BiliClient.prefs.v324videoDeinterlace306 = !current
    AppToast.show(this, "Video Deinterlace306: ${if (!current) "ON" else "OFF"}")
}

// v324: Danmaku Top Count Max310
internal fun PlayerActivity.showV324DanmakuTopCountMax310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324danmakuTopCountMax310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324danmakuTopCountMax310 = value
        AppToast.show(this, "Danmaku Top Count Max310: $value")
    }
}

// v324: Subtitle Stroke Width310
internal fun PlayerActivity.showV324SubtitleStrokeWidth310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324subtitleStrokeWidth310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324subtitleStrokeWidth310 = value
        AppToast.show(this, "Subtitle Stroke Width310: $value")
    }
}

// v325: Audio Dynamic Range307
internal fun PlayerActivity.showV325AudioDynamicRange307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325audioDynamicRange307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325audioDynamicRange307 = value
        AppToast.show(this, "Audio Dynamic Range307: $value")
    }
}

// v325: Danmaku Top Count Max311
internal fun PlayerActivity.showV325DanmakuTopCountMax311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325danmakuTopCountMax311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325danmakuTopCountMax311 = value
        AppToast.show(this, "Danmaku Top Count Max311: $value")
    }
}

// v325: Subtitle Stroke Width311
internal fun PlayerActivity.showV325SubtitleStrokeWidth311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325subtitleStrokeWidth311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325subtitleStrokeWidth311 = value
        AppToast.show(this, "Subtitle Stroke Width311: $value")
    }
}

// v325: Gesture Long Press Action307
internal fun PlayerActivity.showV325GestureLongPressAction307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325gestureLongPressAction307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325gestureLongPressAction307 = value
        AppToast.show(this, "Gesture Long Press Action307: $value")
    }
}

// v325: Cast Quality307
internal fun PlayerActivity.showV325CastQuality307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325castQuality307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325castQuality307 = value
        AppToast.show(this, "Cast Quality307: $value")
    }
}

// v325: Playlist Repeat Mode307
internal fun PlayerActivity.showV325PlaylistRepeatMode307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325playlistRepeatMode307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325playlistRepeatMode307 = value
        AppToast.show(this, "Playlist Repeat Mode307: $value")
    }
}

// v325: Cache Max Size307
internal fun PlayerActivity.showV325CacheMaxSize307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325cacheMaxSize307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325cacheMaxSize307 = value
        AppToast.show(this, "Cache Max Size307: $value")
    }
}

// v325: Progress Bar Height307
internal fun PlayerActivity.showV325ProgressBarHeight307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325progressBarHeight307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325progressBarHeight307 = value
        AppToast.show(this, "Progress Bar Height307: $value")
    }
}

// v325: Volume Level Indicator307
internal fun PlayerActivity.showV325VolumeLevelIndicator307Toggle() {
    val current = BiliClient.prefs.v325volumeLevelIndicator307
    BiliClient.prefs.v325volumeLevelIndicator307 = !current
    AppToast.show(this, "Volume Level Indicator307: ${if (!current) "ON" else "OFF"}")
}

// v325: History Search Enabled307
internal fun PlayerActivity.showV325HistorySearchEnabled307Toggle() {
    val current = BiliClient.prefs.v325historySearchEnabled307
    BiliClient.prefs.v325historySearchEnabled307 = !current
    AppToast.show(this, "History Search Enabled307: ${if (!current) "ON" else "OFF"}")
}

// v325: Playback Speed Memory307
internal fun PlayerActivity.showV325PlaybackSpeedMemory307Toggle() {
    val current = BiliClient.prefs.v325playbackSpeedMemory307
    BiliClient.prefs.v325playbackSpeedMemory307 = !current
    AppToast.show(this, "Playback Speed Memory307: ${if (!current) "ON" else "OFF"}")
}

// v325: Screenshot Format307
internal fun PlayerActivity.showV325ScreenshotFormat307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325screenshotFormat307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325screenshotFormat307 = value
        AppToast.show(this, "Screenshot Format307: $value")
    }
}

// v325: Video Deinterlace307
internal fun PlayerActivity.showV325VideoDeinterlace307Toggle() {
    val current = BiliClient.prefs.v325videoDeinterlace307
    BiliClient.prefs.v325videoDeinterlace307 = !current
    AppToast.show(this, "Video Deinterlace307: ${if (!current) "ON" else "OFF"}")
}

// v325: Danmaku Top Count Max312
internal fun PlayerActivity.showV325DanmakuTopCountMax312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325danmakuTopCountMax312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325danmakuTopCountMax312 = value
        AppToast.show(this, "Danmaku Top Count Max312: $value")
    }
}

// v325: Subtitle Stroke Width312
internal fun PlayerActivity.showV325SubtitleStrokeWidth312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325subtitleStrokeWidth312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325subtitleStrokeWidth312 = value
        AppToast.show(this, "Subtitle Stroke Width312: $value")
    }
}

// v326: Audio Dynamic Range308
internal fun PlayerActivity.showV326AudioDynamicRange308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326audioDynamicRange308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326audioDynamicRange308 = value
        AppToast.show(this, "Audio Dynamic Range308: $value")
    }
}

// v326: Danmaku Top Count Max313
internal fun PlayerActivity.showV326DanmakuTopCountMax313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326danmakuTopCountMax313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326danmakuTopCountMax313 = value
        AppToast.show(this, "Danmaku Top Count Max313: $value")
    }
}

// v326: Subtitle Stroke Width313
internal fun PlayerActivity.showV326SubtitleStrokeWidth313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326subtitleStrokeWidth313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326subtitleStrokeWidth313 = value
        AppToast.show(this, "Subtitle Stroke Width313: $value")
    }
}

// v326: Gesture Long Press Action308
internal fun PlayerActivity.showV326GestureLongPressAction308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326gestureLongPressAction308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326gestureLongPressAction308 = value
        AppToast.show(this, "Gesture Long Press Action308: $value")
    }
}

// v326: Cast Quality308
internal fun PlayerActivity.showV326CastQuality308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326castQuality308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326castQuality308 = value
        AppToast.show(this, "Cast Quality308: $value")
    }
}

// v326: Playlist Repeat Mode308
internal fun PlayerActivity.showV326PlaylistRepeatMode308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326playlistRepeatMode308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326playlistRepeatMode308 = value
        AppToast.show(this, "Playlist Repeat Mode308: $value")
    }
}

// v326: Cache Max Size308
internal fun PlayerActivity.showV326CacheMaxSize308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326cacheMaxSize308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326cacheMaxSize308 = value
        AppToast.show(this, "Cache Max Size308: $value")
    }
}

// v326: Progress Bar Height308
internal fun PlayerActivity.showV326ProgressBarHeight308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326progressBarHeight308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326progressBarHeight308 = value
        AppToast.show(this, "Progress Bar Height308: $value")
    }
}

// v326: Volume Level Indicator308
internal fun PlayerActivity.showV326VolumeLevelIndicator308Toggle() {
    val current = BiliClient.prefs.v326volumeLevelIndicator308
    BiliClient.prefs.v326volumeLevelIndicator308 = !current
    AppToast.show(this, "Volume Level Indicator308: ${if (!current) "ON" else "OFF"}")
}

// v326: History Search Enabled308
internal fun PlayerActivity.showV326HistorySearchEnabled308Toggle() {
    val current = BiliClient.prefs.v326historySearchEnabled308
    BiliClient.prefs.v326historySearchEnabled308 = !current
    AppToast.show(this, "History Search Enabled308: ${if (!current) "ON" else "OFF"}")
}

// v326: Playback Speed Memory308
internal fun PlayerActivity.showV326PlaybackSpeedMemory308Toggle() {
    val current = BiliClient.prefs.v326playbackSpeedMemory308
    BiliClient.prefs.v326playbackSpeedMemory308 = !current
    AppToast.show(this, "Playback Speed Memory308: ${if (!current) "ON" else "OFF"}")
}

// v326: Screenshot Format308
internal fun PlayerActivity.showV326ScreenshotFormat308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326screenshotFormat308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326screenshotFormat308 = value
        AppToast.show(this, "Screenshot Format308: $value")
    }
}

// v326: Video Deinterlace308
internal fun PlayerActivity.showV326VideoDeinterlace308Toggle() {
    val current = BiliClient.prefs.v326videoDeinterlace308
    BiliClient.prefs.v326videoDeinterlace308 = !current
    AppToast.show(this, "Video Deinterlace308: ${if (!current) "ON" else "OFF"}")
}

// v326: Danmaku Top Count Max314
internal fun PlayerActivity.showV326DanmakuTopCountMax314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326danmakuTopCountMax314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326danmakuTopCountMax314 = value
        AppToast.show(this, "Danmaku Top Count Max314: $value")
    }
}

// v326: Subtitle Stroke Width314
internal fun PlayerActivity.showV326SubtitleStrokeWidth314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326subtitleStrokeWidth314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326subtitleStrokeWidth314 = value
        AppToast.show(this, "Subtitle Stroke Width314: $value")
    }
}

// v327: Audio Dynamic Range309
internal fun PlayerActivity.showV327AudioDynamicRange309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327audioDynamicRange309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327audioDynamicRange309 = value
        AppToast.show(this, "Audio Dynamic Range309: $value")
    }
}

// v327: Danmaku Top Count Max315
internal fun PlayerActivity.showV327DanmakuTopCountMax315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327danmakuTopCountMax315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327danmakuTopCountMax315 = value
        AppToast.show(this, "Danmaku Top Count Max315: $value")
    }
}

// v327: Subtitle Stroke Width315
internal fun PlayerActivity.showV327SubtitleStrokeWidth315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327subtitleStrokeWidth315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327subtitleStrokeWidth315 = value
        AppToast.show(this, "Subtitle Stroke Width315: $value")
    }
}

// v327: Gesture Long Press Action309
internal fun PlayerActivity.showV327GestureLongPressAction309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327gestureLongPressAction309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327gestureLongPressAction309 = value
        AppToast.show(this, "Gesture Long Press Action309: $value")
    }
}

// v327: Cast Quality309
internal fun PlayerActivity.showV327CastQuality309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327castQuality309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327castQuality309 = value
        AppToast.show(this, "Cast Quality309: $value")
    }
}

// v327: Playlist Repeat Mode309
internal fun PlayerActivity.showV327PlaylistRepeatMode309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327playlistRepeatMode309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327playlistRepeatMode309 = value
        AppToast.show(this, "Playlist Repeat Mode309: $value")
    }
}

// v327: Cache Max Size309
internal fun PlayerActivity.showV327CacheMaxSize309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327cacheMaxSize309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327cacheMaxSize309 = value
        AppToast.show(this, "Cache Max Size309: $value")
    }
}

// v327: Progress Bar Height309
internal fun PlayerActivity.showV327ProgressBarHeight309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327progressBarHeight309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327progressBarHeight309 = value
        AppToast.show(this, "Progress Bar Height309: $value")
    }
}

// v327: Volume Level Indicator309
internal fun PlayerActivity.showV327VolumeLevelIndicator309Toggle() {
    val current = BiliClient.prefs.v327volumeLevelIndicator309
    BiliClient.prefs.v327volumeLevelIndicator309 = !current
    AppToast.show(this, "Volume Level Indicator309: ${if (!current) "ON" else "OFF"}")
}

// v327: History Search Enabled309
internal fun PlayerActivity.showV327HistorySearchEnabled309Toggle() {
    val current = BiliClient.prefs.v327historySearchEnabled309
    BiliClient.prefs.v327historySearchEnabled309 = !current
    AppToast.show(this, "History Search Enabled309: ${if (!current) "ON" else "OFF"}")
}

// v327: Playback Speed Memory309
internal fun PlayerActivity.showV327PlaybackSpeedMemory309Toggle() {
    val current = BiliClient.prefs.v327playbackSpeedMemory309
    BiliClient.prefs.v327playbackSpeedMemory309 = !current
    AppToast.show(this, "Playback Speed Memory309: ${if (!current) "ON" else "OFF"}")
}

// v327: Screenshot Format309
internal fun PlayerActivity.showV327ScreenshotFormat309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327screenshotFormat309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327screenshotFormat309 = value
        AppToast.show(this, "Screenshot Format309: $value")
    }
}

// v327: Video Deinterlace309
internal fun PlayerActivity.showV327VideoDeinterlace309Toggle() {
    val current = BiliClient.prefs.v327videoDeinterlace309
    BiliClient.prefs.v327videoDeinterlace309 = !current
    AppToast.show(this, "Video Deinterlace309: ${if (!current) "ON" else "OFF"}")
}

// v327: Danmaku Top Count Max316
internal fun PlayerActivity.showV327DanmakuTopCountMax316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327danmakuTopCountMax316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327danmakuTopCountMax316 = value
        AppToast.show(this, "Danmaku Top Count Max316: $value")
    }
}

// v327: Subtitle Stroke Width316
internal fun PlayerActivity.showV327SubtitleStrokeWidth316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327subtitleStrokeWidth316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327subtitleStrokeWidth316 = value
        AppToast.show(this, "Subtitle Stroke Width316: $value")
    }
}

// v328: Audio Dynamic Range310
internal fun PlayerActivity.showV328AudioDynamicRange310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328audioDynamicRange310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328audioDynamicRange310 = value
        AppToast.show(this, "Audio Dynamic Range310: $value")
    }
}

// v328: Danmaku Top Count Max317
internal fun PlayerActivity.showV328DanmakuTopCountMax317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328danmakuTopCountMax317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328danmakuTopCountMax317 = value
        AppToast.show(this, "Danmaku Top Count Max317: $value")
    }
}

// v328: Subtitle Stroke Width317
internal fun PlayerActivity.showV328SubtitleStrokeWidth317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328subtitleStrokeWidth317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328subtitleStrokeWidth317 = value
        AppToast.show(this, "Subtitle Stroke Width317: $value")
    }
}

// v328: Gesture Long Press Action310
internal fun PlayerActivity.showV328GestureLongPressAction310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328gestureLongPressAction310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328gestureLongPressAction310 = value
        AppToast.show(this, "Gesture Long Press Action310: $value")
    }
}

// v328: Cast Quality310
internal fun PlayerActivity.showV328CastQuality310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328castQuality310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328castQuality310 = value
        AppToast.show(this, "Cast Quality310: $value")
    }
}

// v328: Playlist Repeat Mode310
internal fun PlayerActivity.showV328PlaylistRepeatMode310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328playlistRepeatMode310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328playlistRepeatMode310 = value
        AppToast.show(this, "Playlist Repeat Mode310: $value")
    }
}

// v328: Cache Max Size310
internal fun PlayerActivity.showV328CacheMaxSize310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328cacheMaxSize310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328cacheMaxSize310 = value
        AppToast.show(this, "Cache Max Size310: $value")
    }
}

// v328: Progress Bar Height310
internal fun PlayerActivity.showV328ProgressBarHeight310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328progressBarHeight310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328progressBarHeight310 = value
        AppToast.show(this, "Progress Bar Height310: $value")
    }
}

// v328: Volume Level Indicator310
internal fun PlayerActivity.showV328VolumeLevelIndicator310Toggle() {
    val current = BiliClient.prefs.v328volumeLevelIndicator310
    BiliClient.prefs.v328volumeLevelIndicator310 = !current
    AppToast.show(this, "Volume Level Indicator310: ${if (!current) "ON" else "OFF"}")
}

// v328: History Search Enabled310
internal fun PlayerActivity.showV328HistorySearchEnabled310Toggle() {
    val current = BiliClient.prefs.v328historySearchEnabled310
    BiliClient.prefs.v328historySearchEnabled310 = !current
    AppToast.show(this, "History Search Enabled310: ${if (!current) "ON" else "OFF"}")
}

// v328: Playback Speed Memory310
internal fun PlayerActivity.showV328PlaybackSpeedMemory310Toggle() {
    val current = BiliClient.prefs.v328playbackSpeedMemory310
    BiliClient.prefs.v328playbackSpeedMemory310 = !current
    AppToast.show(this, "Playback Speed Memory310: ${if (!current) "ON" else "OFF"}")
}

// v328: Screenshot Format310
internal fun PlayerActivity.showV328ScreenshotFormat310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328screenshotFormat310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328screenshotFormat310 = value
        AppToast.show(this, "Screenshot Format310: $value")
    }
}

// v328: Video Deinterlace310
internal fun PlayerActivity.showV328VideoDeinterlace310Toggle() {
    val current = BiliClient.prefs.v328videoDeinterlace310
    BiliClient.prefs.v328videoDeinterlace310 = !current
    AppToast.show(this, "Video Deinterlace310: ${if (!current) "ON" else "OFF"}")
}

// v328: Danmaku Top Count Max318
internal fun PlayerActivity.showV328DanmakuTopCountMax318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328danmakuTopCountMax318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328danmakuTopCountMax318 = value
        AppToast.show(this, "Danmaku Top Count Max318: $value")
    }
}

// v328: Subtitle Stroke Width318
internal fun PlayerActivity.showV328SubtitleStrokeWidth318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328subtitleStrokeWidth318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328subtitleStrokeWidth318 = value
        AppToast.show(this, "Subtitle Stroke Width318: $value")
    }
}

// v329: Audio Dynamic Range311
internal fun PlayerActivity.showV329AudioDynamicRange311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329audioDynamicRange311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329audioDynamicRange311 = value
        AppToast.show(this, "Audio Dynamic Range311: $value")
    }
}

// v329: Danmaku Top Count Max319
internal fun PlayerActivity.showV329DanmakuTopCountMax319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329danmakuTopCountMax319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329danmakuTopCountMax319 = value
        AppToast.show(this, "Danmaku Top Count Max319: $value")
    }
}

// v329: Subtitle Stroke Width319
internal fun PlayerActivity.showV329SubtitleStrokeWidth319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329subtitleStrokeWidth319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329subtitleStrokeWidth319 = value
        AppToast.show(this, "Subtitle Stroke Width319: $value")
    }
}

// v329: Gesture Long Press Action311
internal fun PlayerActivity.showV329GestureLongPressAction311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329gestureLongPressAction311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329gestureLongPressAction311 = value
        AppToast.show(this, "Gesture Long Press Action311: $value")
    }
}

// v329: Cast Quality311
internal fun PlayerActivity.showV329CastQuality311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329castQuality311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329castQuality311 = value
        AppToast.show(this, "Cast Quality311: $value")
    }
}

// v329: Playlist Repeat Mode311
internal fun PlayerActivity.showV329PlaylistRepeatMode311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329playlistRepeatMode311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329playlistRepeatMode311 = value
        AppToast.show(this, "Playlist Repeat Mode311: $value")
    }
}

// v329: Cache Max Size311
internal fun PlayerActivity.showV329CacheMaxSize311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329cacheMaxSize311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329cacheMaxSize311 = value
        AppToast.show(this, "Cache Max Size311: $value")
    }
}

// v329: Progress Bar Height311
internal fun PlayerActivity.showV329ProgressBarHeight311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329progressBarHeight311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329progressBarHeight311 = value
        AppToast.show(this, "Progress Bar Height311: $value")
    }
}

// v329: Volume Level Indicator311
internal fun PlayerActivity.showV329VolumeLevelIndicator311Toggle() {
    val current = BiliClient.prefs.v329volumeLevelIndicator311
    BiliClient.prefs.v329volumeLevelIndicator311 = !current
    AppToast.show(this, "Volume Level Indicator311: ${if (!current) "ON" else "OFF"}")
}

// v329: History Search Enabled311
internal fun PlayerActivity.showV329HistorySearchEnabled311Toggle() {
    val current = BiliClient.prefs.v329historySearchEnabled311
    BiliClient.prefs.v329historySearchEnabled311 = !current
    AppToast.show(this, "History Search Enabled311: ${if (!current) "ON" else "OFF"}")
}

// v329: Playback Speed Memory311
internal fun PlayerActivity.showV329PlaybackSpeedMemory311Toggle() {
    val current = BiliClient.prefs.v329playbackSpeedMemory311
    BiliClient.prefs.v329playbackSpeedMemory311 = !current
    AppToast.show(this, "Playback Speed Memory311: ${if (!current) "ON" else "OFF"}")
}

// v329: Screenshot Format311
internal fun PlayerActivity.showV329ScreenshotFormat311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329screenshotFormat311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329screenshotFormat311 = value
        AppToast.show(this, "Screenshot Format311: $value")
    }
}

// v329: Video Deinterlace311
internal fun PlayerActivity.showV329VideoDeinterlace311Toggle() {
    val current = BiliClient.prefs.v329videoDeinterlace311
    BiliClient.prefs.v329videoDeinterlace311 = !current
    AppToast.show(this, "Video Deinterlace311: ${if (!current) "ON" else "OFF"}")
}

