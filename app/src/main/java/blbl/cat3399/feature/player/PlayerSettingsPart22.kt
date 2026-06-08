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

internal fun PlayerActivity.showV308CacheDownloadSpeed309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308cacheDownloadSpeed309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308cacheDownloadSpeed309 = value
        AppToast.show(this, "Cache Download Speed309: $value")
    }
}

internal fun PlayerActivity.showV308ProgressBarThumbBorder308Toggle() {
    val current = BiliClient.prefs.v308progressBarThumbBorder308
    BiliClient.prefs.v308progressBarThumbBorder308 = !current
    AppToast.show(this, "Progress Bar Thumb Border308: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV308VolumeBoostPeak308Toggle() {
    val current = BiliClient.prefs.v308volumeBoostPeak308
    BiliClient.prefs.v308volumeBoostPeak308 = !current
    AppToast.show(this, "Volume Boost Peak308: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV308HistoryBookmarkExport308Toggle() {
    val current = BiliClient.prefs.v308historyBookmarkExport308
    BiliClient.prefs.v308historyBookmarkExport308 = !current
    AppToast.show(this, "History Bookmark Export308: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV308PlaybackChapterSync308Toggle() {
    val current = BiliClient.prefs.v308playbackChapterSync308
    BiliClient.prefs.v308playbackChapterSync308 = !current
    AppToast.show(this, "Playback Chapter Sync308: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV308ScreenshotSavePath308Toggle() {
    val current = BiliClient.prefs.v308screenshotSavePath308
    BiliClient.prefs.v308screenshotSavePath308 = !current
    AppToast.show(this, "Screenshot Save Path308: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV308VideoColorSpace308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308videoColorSpace308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308videoColorSpace308 = value
        AppToast.show(this, "Video Color Space308: $value")
    }
}

internal fun PlayerActivity.showV308DanmakuBottomMaxCount424Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308danmakuBottomMaxCount424).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count424",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308danmakuBottomMaxCount424 = value
        AppToast.show(this, "Danmaku Bottom Max Count424: $value")
    }
}

internal fun PlayerActivity.showV308SubtitleBgBorder431Toggle() {
    val current = BiliClient.prefs.v308subtitleBgBorder431
    BiliClient.prefs.v308subtitleBgBorder431 = !current
    AppToast.show(this, "Subtitle Bg Border431: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV309AudioEQCustom309Toggle() {
    val current = BiliClient.prefs.v309audioEQCustom309
    BiliClient.prefs.v309audioEQCustom309 = !current
    AppToast.show(this, "Audio EQ Custom309: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV309DanmakuBottomMaxCount425Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309danmakuBottomMaxCount425).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count425",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309danmakuBottomMaxCount425 = value
        AppToast.show(this, "Danmaku Bottom Max Count425: $value")
    }
}

internal fun PlayerActivity.showV309SubtitleBgBorder432Toggle() {
    val current = BiliClient.prefs.v309subtitleBgBorder432
    BiliClient.prefs.v309subtitleBgBorder432 = !current
    AppToast.show(this, "Subtitle Bg Border432: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV309GestureShakeAction309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309gestureShakeAction309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309gestureShakeAction309 = value
        AppToast.show(this, "Gesture Shake Action309: $value")
    }
}

internal fun PlayerActivity.showV309CastAudioVolume309Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v309castAudioVolume309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309castAudioVolume309 = value
        AppToast.show(this, "Cast Audio Volume309: $value")
    }
}

internal fun PlayerActivity.showV309PlaylistAutoSkipOutro309Toggle() {
    val current = BiliClient.prefs.v309playlistAutoSkipOutro309
    BiliClient.prefs.v309playlistAutoSkipOutro309 = !current
    AppToast.show(this, "Playlist Auto Skip Outro309: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV309CacheDownloadSpeed310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309cacheDownloadSpeed310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309cacheDownloadSpeed310 = value
        AppToast.show(this, "Cache Download Speed310: $value")
    }
}

internal fun PlayerActivity.showV309ProgressBarThumbBorder309Toggle() {
    val current = BiliClient.prefs.v309progressBarThumbBorder309
    BiliClient.prefs.v309progressBarThumbBorder309 = !current
    AppToast.show(this, "Progress Bar Thumb Border309: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV309VolumeBoostPeak309Toggle() {
    val current = BiliClient.prefs.v309volumeBoostPeak309
    BiliClient.prefs.v309volumeBoostPeak309 = !current
    AppToast.show(this, "Volume Boost Peak309: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV309HistoryBookmarkExport309Toggle() {
    val current = BiliClient.prefs.v309historyBookmarkExport309
    BiliClient.prefs.v309historyBookmarkExport309 = !current
    AppToast.show(this, "History Bookmark Export309: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV309PlaybackChapterSync309Toggle() {
    val current = BiliClient.prefs.v309playbackChapterSync309
    BiliClient.prefs.v309playbackChapterSync309 = !current
    AppToast.show(this, "Playback Chapter Sync309: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV309ScreenshotSavePath309Toggle() {
    val current = BiliClient.prefs.v309screenshotSavePath309
    BiliClient.prefs.v309screenshotSavePath309 = !current
    AppToast.show(this, "Screenshot Save Path309: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV309VideoColorSpace309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309videoColorSpace309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309videoColorSpace309 = value
        AppToast.show(this, "Video Color Space309: $value")
    }
}

internal fun PlayerActivity.showV309DanmakuBottomMaxCount426Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309danmakuBottomMaxCount426).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count426",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309danmakuBottomMaxCount426 = value
        AppToast.show(this, "Danmaku Bottom Max Count426: $value")
    }
}

internal fun PlayerActivity.showV309SubtitleBgBorder433Toggle() {
    val current = BiliClient.prefs.v309subtitleBgBorder433
    BiliClient.prefs.v309subtitleBgBorder433 = !current
    AppToast.show(this, "Subtitle Bg Border433: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV310AudioEQCustom310Toggle() {
    val current = BiliClient.prefs.v310audioEQCustom310
    BiliClient.prefs.v310audioEQCustom310 = !current
    AppToast.show(this, "Audio EQ Custom310: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV310DanmakuBottomMaxCount427Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310danmakuBottomMaxCount427).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count427",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310danmakuBottomMaxCount427 = value
        AppToast.show(this, "Danmaku Bottom Max Count427: $value")
    }
}

internal fun PlayerActivity.showV310SubtitleBgBorder434Toggle() {
    val current = BiliClient.prefs.v310subtitleBgBorder434
    BiliClient.prefs.v310subtitleBgBorder434 = !current
    AppToast.show(this, "Subtitle Bg Border434: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV310GestureShakeAction310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310gestureShakeAction310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310gestureShakeAction310 = value
        AppToast.show(this, "Gesture Shake Action310: $value")
    }
}

internal fun PlayerActivity.showV310CastAudioVolume310Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v310castAudioVolume310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310castAudioVolume310 = value
        AppToast.show(this, "Cast Audio Volume310: $value")
    }
}

internal fun PlayerActivity.showV310PlaylistAutoSkipOutro310Toggle() {
    val current = BiliClient.prefs.v310playlistAutoSkipOutro310
    BiliClient.prefs.v310playlistAutoSkipOutro310 = !current
    AppToast.show(this, "Playlist Auto Skip Outro310: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV310CacheDownloadSpeed311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310cacheDownloadSpeed311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310cacheDownloadSpeed311 = value
        AppToast.show(this, "Cache Download Speed311: $value")
    }
}

internal fun PlayerActivity.showV310ProgressBarThumbBorder310Toggle() {
    val current = BiliClient.prefs.v310progressBarThumbBorder310
    BiliClient.prefs.v310progressBarThumbBorder310 = !current
    AppToast.show(this, "Progress Bar Thumb Border310: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV310VolumeBoostPeak310Toggle() {
    val current = BiliClient.prefs.v310volumeBoostPeak310
    BiliClient.prefs.v310volumeBoostPeak310 = !current
    AppToast.show(this, "Volume Boost Peak310: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV310HistoryBookmarkExport310Toggle() {
    val current = BiliClient.prefs.v310historyBookmarkExport310
    BiliClient.prefs.v310historyBookmarkExport310 = !current
    AppToast.show(this, "History Bookmark Export310: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV310PlaybackChapterSync310Toggle() {
    val current = BiliClient.prefs.v310playbackChapterSync310
    BiliClient.prefs.v310playbackChapterSync310 = !current
    AppToast.show(this, "Playback Chapter Sync310: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV310ScreenshotSavePath310Toggle() {
    val current = BiliClient.prefs.v310screenshotSavePath310
    BiliClient.prefs.v310screenshotSavePath310 = !current
    AppToast.show(this, "Screenshot Save Path310: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV310VideoColorSpace310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310videoColorSpace310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310videoColorSpace310 = value
        AppToast.show(this, "Video Color Space310: $value")
    }
}

internal fun PlayerActivity.showV310DanmakuBottomMaxCount428Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310danmakuBottomMaxCount428).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count428",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310danmakuBottomMaxCount428 = value
        AppToast.show(this, "Danmaku Bottom Max Count428: $value")
    }
}

internal fun PlayerActivity.showV310SubtitleBgBorder435Toggle() {
    val current = BiliClient.prefs.v310subtitleBgBorder435
    BiliClient.prefs.v310subtitleBgBorder435 = !current
    AppToast.show(this, "Subtitle Bg Border435: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV311AudioCompressorRatio293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311audioCompressorRatio293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311audioCompressorRatio293 = value
        AppToast.show(this, "Audio Compressor Ratio293: $value")
    }
}

internal fun PlayerActivity.showV311DanmakuBottomMaxCount429Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311danmakuBottomMaxCount429).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count429",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311danmakuBottomMaxCount429 = value
        AppToast.show(this, "Danmaku Bottom Max Count429: $value")
    }
}

internal fun PlayerActivity.showV311SubtitleFadeIn293Toggle() {
    val current = BiliClient.prefs.v311subtitleFadeIn293
    BiliClient.prefs.v311subtitleFadeIn293 = !current
    AppToast.show(this, "Subtitle Fade In293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV311GestureShakeSensitivity293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311gestureShakeSensitivity293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311gestureShakeSensitivity293 = value
        AppToast.show(this, "Gesture Shake Sensitivity293: $value")
    }
}

internal fun PlayerActivity.showV311CastBitrate293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311castBitrate293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311castBitrate293 = value
        AppToast.show(this, "Cast Bitrate293: $value")
    }
}

internal fun PlayerActivity.showV311PlaylistAutoNext293Toggle() {
    val current = BiliClient.prefs.v311playlistAutoNext293
    BiliClient.prefs.v311playlistAutoNext293 = !current
    AppToast.show(this, "Playlist Auto Next293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV311CachePreloadSize294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311cachePreloadSize294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311cachePreloadSize294 = value
        AppToast.show(this, "Cache Preload Size294: $value")
    }
}

internal fun PlayerActivity.showV311ProgressBarStyle293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311progressBarStyle293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311progressBarStyle293 = value
        AppToast.show(this, "Progress Bar Style293: $value")
    }
}

internal fun PlayerActivity.showV311VolumeNormalizeMode293Toggle() {
    val current = BiliClient.prefs.v311volumeNormalizeMode293
    BiliClient.prefs.v311volumeNormalizeMode293 = !current
    AppToast.show(this, "Volume Normalize Mode293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV311HistoryAutoClean293Toggle() {
    val current = BiliClient.prefs.v311historyAutoClean293
    BiliClient.prefs.v311historyAutoClean293 = !current
    AppToast.show(this, "History Auto Clean293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV311PlaybackResumeFromBackground293Toggle() {
    val current = BiliClient.prefs.v311playbackResumeFromBackground293
    BiliClient.prefs.v311playbackResumeFromBackground293 = !current
    AppToast.show(this, "Playback Resume From Background293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV311ScreenshotEnhance293Toggle() {
    val current = BiliClient.prefs.v311screenshotEnhance293
    BiliClient.prefs.v311screenshotEnhance293 = !current
    AppToast.show(this, "Screenshot Enhance293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV311VideoHDR293Toggle() {
    val current = BiliClient.prefs.v311videoHDR293
    BiliClient.prefs.v311videoHDR293 = !current
    AppToast.show(this, "Video HDR293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV311DanmakuBottomMaxCount430Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311danmakuBottomMaxCount430).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count430",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311danmakuBottomMaxCount430 = value
        AppToast.show(this, "Danmaku Bottom Max Count430: $value")
    }
}

internal fun PlayerActivity.showV311SubtitleFadeIn294Toggle() {
    val current = BiliClient.prefs.v311subtitleFadeIn294
    BiliClient.prefs.v311subtitleFadeIn294 = !current
    AppToast.show(this, "Subtitle Fade In294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV312AudioCompressorRatio294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312audioCompressorRatio294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312audioCompressorRatio294 = value
        AppToast.show(this, "Audio Compressor Ratio294: $value")
    }
}

internal fun PlayerActivity.showV312DanmakuBottomMaxCount431Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312danmakuBottomMaxCount431).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count431",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312danmakuBottomMaxCount431 = value
        AppToast.show(this, "Danmaku Bottom Max Count431: $value")
    }
}

internal fun PlayerActivity.showV312SubtitleFadeIn295Toggle() {
    val current = BiliClient.prefs.v312subtitleFadeIn295
    BiliClient.prefs.v312subtitleFadeIn295 = !current
    AppToast.show(this, "Subtitle Fade In295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV312GestureShakeSensitivity294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312gestureShakeSensitivity294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312gestureShakeSensitivity294 = value
        AppToast.show(this, "Gesture Shake Sensitivity294: $value")
    }
}

internal fun PlayerActivity.showV312CastBitrate294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312castBitrate294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312castBitrate294 = value
        AppToast.show(this, "Cast Bitrate294: $value")
    }
}

internal fun PlayerActivity.showV312PlaylistAutoNext294Toggle() {
    val current = BiliClient.prefs.v312playlistAutoNext294
    BiliClient.prefs.v312playlistAutoNext294 = !current
    AppToast.show(this, "Playlist Auto Next294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV312CachePreloadSize295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312cachePreloadSize295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312cachePreloadSize295 = value
        AppToast.show(this, "Cache Preload Size295: $value")
    }
}

internal fun PlayerActivity.showV312ProgressBarStyle294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312progressBarStyle294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312progressBarStyle294 = value
        AppToast.show(this, "Progress Bar Style294: $value")
    }
}

internal fun PlayerActivity.showV312VolumeNormalizeMode294Toggle() {
    val current = BiliClient.prefs.v312volumeNormalizeMode294
    BiliClient.prefs.v312volumeNormalizeMode294 = !current
    AppToast.show(this, "Volume Normalize Mode294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV312HistoryAutoClean294Toggle() {
    val current = BiliClient.prefs.v312historyAutoClean294
    BiliClient.prefs.v312historyAutoClean294 = !current
    AppToast.show(this, "History Auto Clean294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV312PlaybackResumeFromBackground294Toggle() {
    val current = BiliClient.prefs.v312playbackResumeFromBackground294
    BiliClient.prefs.v312playbackResumeFromBackground294 = !current
    AppToast.show(this, "Playback Resume From Background294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV312ScreenshotEnhance294Toggle() {
    val current = BiliClient.prefs.v312screenshotEnhance294
    BiliClient.prefs.v312screenshotEnhance294 = !current
    AppToast.show(this, "Screenshot Enhance294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV312VideoHDR294Toggle() {
    val current = BiliClient.prefs.v312videoHDR294
    BiliClient.prefs.v312videoHDR294 = !current
    AppToast.show(this, "Video HDR294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV312DanmakuBottomMaxCount432Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312danmakuBottomMaxCount432).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count432",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312danmakuBottomMaxCount432 = value
        AppToast.show(this, "Danmaku Bottom Max Count432: $value")
    }
}

internal fun PlayerActivity.showV312SubtitleFadeIn296Toggle() {
    val current = BiliClient.prefs.v312subtitleFadeIn296
    BiliClient.prefs.v312subtitleFadeIn296 = !current
    AppToast.show(this, "Subtitle Fade In296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV313AudioCompressorRatio295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313audioCompressorRatio295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313audioCompressorRatio295 = value
        AppToast.show(this, "Audio Compressor Ratio295: $value")
    }
}

internal fun PlayerActivity.showV313DanmakuBottomMaxCount433Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313danmakuBottomMaxCount433).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count433",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313danmakuBottomMaxCount433 = value
        AppToast.show(this, "Danmaku Bottom Max Count433: $value")
    }
}

internal fun PlayerActivity.showV313SubtitleFadeIn297Toggle() {
    val current = BiliClient.prefs.v313subtitleFadeIn297
    BiliClient.prefs.v313subtitleFadeIn297 = !current
    AppToast.show(this, "Subtitle Fade In297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV313GestureShakeSensitivity295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313gestureShakeSensitivity295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313gestureShakeSensitivity295 = value
        AppToast.show(this, "Gesture Shake Sensitivity295: $value")
    }
}

internal fun PlayerActivity.showV313CastBitrate295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313castBitrate295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313castBitrate295 = value
        AppToast.show(this, "Cast Bitrate295: $value")
    }
}

internal fun PlayerActivity.showV313PlaylistAutoNext295Toggle() {
    val current = BiliClient.prefs.v313playlistAutoNext295
    BiliClient.prefs.v313playlistAutoNext295 = !current
    AppToast.show(this, "Playlist Auto Next295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV313CachePreloadSize296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313cachePreloadSize296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313cachePreloadSize296 = value
        AppToast.show(this, "Cache Preload Size296: $value")
    }
}

internal fun PlayerActivity.showV313ProgressBarStyle295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313progressBarStyle295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313progressBarStyle295 = value
        AppToast.show(this, "Progress Bar Style295: $value")
    }
}

internal fun PlayerActivity.showV313VolumeNormalizeMode295Toggle() {
    val current = BiliClient.prefs.v313volumeNormalizeMode295
    BiliClient.prefs.v313volumeNormalizeMode295 = !current
    AppToast.show(this, "Volume Normalize Mode295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV313HistoryAutoClean295Toggle() {
    val current = BiliClient.prefs.v313historyAutoClean295
    BiliClient.prefs.v313historyAutoClean295 = !current
    AppToast.show(this, "History Auto Clean295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV313PlaybackResumeFromBackground295Toggle() {
    val current = BiliClient.prefs.v313playbackResumeFromBackground295
    BiliClient.prefs.v313playbackResumeFromBackground295 = !current
    AppToast.show(this, "Playback Resume From Background295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV313ScreenshotEnhance295Toggle() {
    val current = BiliClient.prefs.v313screenshotEnhance295
    BiliClient.prefs.v313screenshotEnhance295 = !current
    AppToast.show(this, "Screenshot Enhance295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV313VideoHDR295Toggle() {
    val current = BiliClient.prefs.v313videoHDR295
    BiliClient.prefs.v313videoHDR295 = !current
    AppToast.show(this, "Video HDR295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV313DanmakuBottomMaxCount434Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313danmakuBottomMaxCount434).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count434",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313danmakuBottomMaxCount434 = value
        AppToast.show(this, "Danmaku Bottom Max Count434: $value")
    }
}

internal fun PlayerActivity.showV313SubtitleFadeIn298Toggle() {
    val current = BiliClient.prefs.v313subtitleFadeIn298
    BiliClient.prefs.v313subtitleFadeIn298 = !current
    AppToast.show(this, "Subtitle Fade In298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV314AudioCompressorRatio296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314audioCompressorRatio296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314audioCompressorRatio296 = value
        AppToast.show(this, "Audio Compressor Ratio296: $value")
    }
}

internal fun PlayerActivity.showV314DanmakuBottomMaxCount435Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314danmakuBottomMaxCount435).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count435",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314danmakuBottomMaxCount435 = value
        AppToast.show(this, "Danmaku Bottom Max Count435: $value")
    }
}

internal fun PlayerActivity.showV314SubtitleFadeIn299Toggle() {
    val current = BiliClient.prefs.v314subtitleFadeIn299
    BiliClient.prefs.v314subtitleFadeIn299 = !current
    AppToast.show(this, "Subtitle Fade In299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV314GestureShakeSensitivity296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314gestureShakeSensitivity296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314gestureShakeSensitivity296 = value
        AppToast.show(this, "Gesture Shake Sensitivity296: $value")
    }
}

internal fun PlayerActivity.showV314CastBitrate296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314castBitrate296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314castBitrate296 = value
        AppToast.show(this, "Cast Bitrate296: $value")
    }
}

internal fun PlayerActivity.showV314PlaylistAutoNext296Toggle() {
    val current = BiliClient.prefs.v314playlistAutoNext296
    BiliClient.prefs.v314playlistAutoNext296 = !current
    AppToast.show(this, "Playlist Auto Next296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV314CachePreloadSize297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314cachePreloadSize297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314cachePreloadSize297 = value
        AppToast.show(this, "Cache Preload Size297: $value")
    }
}

internal fun PlayerActivity.showV314ProgressBarStyle296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314progressBarStyle296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314progressBarStyle296 = value
        AppToast.show(this, "Progress Bar Style296: $value")
    }
}

internal fun PlayerActivity.showV314VolumeNormalizeMode296Toggle() {
    val current = BiliClient.prefs.v314volumeNormalizeMode296
    BiliClient.prefs.v314volumeNormalizeMode296 = !current
    AppToast.show(this, "Volume Normalize Mode296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV314HistoryAutoClean296Toggle() {
    val current = BiliClient.prefs.v314historyAutoClean296
    BiliClient.prefs.v314historyAutoClean296 = !current
    AppToast.show(this, "History Auto Clean296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV314PlaybackResumeFromBackground296Toggle() {
    val current = BiliClient.prefs.v314playbackResumeFromBackground296
    BiliClient.prefs.v314playbackResumeFromBackground296 = !current
    AppToast.show(this, "Playback Resume From Background296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV314ScreenshotEnhance296Toggle() {
    val current = BiliClient.prefs.v314screenshotEnhance296
    BiliClient.prefs.v314screenshotEnhance296 = !current
    AppToast.show(this, "Screenshot Enhance296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV314VideoHDR296Toggle() {
    val current = BiliClient.prefs.v314videoHDR296
    BiliClient.prefs.v314videoHDR296 = !current
    AppToast.show(this, "Video HDR296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV314DanmakuBottomMaxCount436Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314danmakuBottomMaxCount436).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count436",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314danmakuBottomMaxCount436 = value
        AppToast.show(this, "Danmaku Bottom Max Count436: $value")
    }
}

internal fun PlayerActivity.showV314SubtitleFadeIn300Toggle() {
    val current = BiliClient.prefs.v314subtitleFadeIn300
    BiliClient.prefs.v314subtitleFadeIn300 = !current
    AppToast.show(this, "Subtitle Fade In300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV315AudioCompressorRatio297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315audioCompressorRatio297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315audioCompressorRatio297 = value
        AppToast.show(this, "Audio Compressor Ratio297: $value")
    }
}

internal fun PlayerActivity.showV315DanmakuBottomMaxCount437Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315danmakuBottomMaxCount437).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count437",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315danmakuBottomMaxCount437 = value
        AppToast.show(this, "Danmaku Bottom Max Count437: $value")
    }
}

internal fun PlayerActivity.showV315SubtitleFadeIn301Toggle() {
    val current = BiliClient.prefs.v315subtitleFadeIn301
    BiliClient.prefs.v315subtitleFadeIn301 = !current
    AppToast.show(this, "Subtitle Fade In301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV315GestureShakeSensitivity297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315gestureShakeSensitivity297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315gestureShakeSensitivity297 = value
        AppToast.show(this, "Gesture Shake Sensitivity297: $value")
    }
}

internal fun PlayerActivity.showV315CastBitrate297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315castBitrate297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315castBitrate297 = value
        AppToast.show(this, "Cast Bitrate297: $value")
    }
}

internal fun PlayerActivity.showV315PlaylistAutoNext297Toggle() {
    val current = BiliClient.prefs.v315playlistAutoNext297
    BiliClient.prefs.v315playlistAutoNext297 = !current
    AppToast.show(this, "Playlist Auto Next297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV315CachePreloadSize298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315cachePreloadSize298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315cachePreloadSize298 = value
        AppToast.show(this, "Cache Preload Size298: $value")
    }
}

internal fun PlayerActivity.showV315ProgressBarStyle297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315progressBarStyle297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315progressBarStyle297 = value
        AppToast.show(this, "Progress Bar Style297: $value")
    }
}

internal fun PlayerActivity.showV315VolumeNormalizeMode297Toggle() {
    val current = BiliClient.prefs.v315volumeNormalizeMode297
    BiliClient.prefs.v315volumeNormalizeMode297 = !current
    AppToast.show(this, "Volume Normalize Mode297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV315HistoryAutoClean297Toggle() {
    val current = BiliClient.prefs.v315historyAutoClean297
    BiliClient.prefs.v315historyAutoClean297 = !current
    AppToast.show(this, "History Auto Clean297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV315PlaybackResumeFromBackground297Toggle() {
    val current = BiliClient.prefs.v315playbackResumeFromBackground297
    BiliClient.prefs.v315playbackResumeFromBackground297 = !current
    AppToast.show(this, "Playback Resume From Background297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV315ScreenshotEnhance297Toggle() {
    val current = BiliClient.prefs.v315screenshotEnhance297
    BiliClient.prefs.v315screenshotEnhance297 = !current
    AppToast.show(this, "Screenshot Enhance297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV315VideoHDR297Toggle() {
    val current = BiliClient.prefs.v315videoHDR297
    BiliClient.prefs.v315videoHDR297 = !current
    AppToast.show(this, "Video HDR297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV315DanmakuBottomMaxCount438Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315danmakuBottomMaxCount438).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count438",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315danmakuBottomMaxCount438 = value
        AppToast.show(this, "Danmaku Bottom Max Count438: $value")
    }
}

internal fun PlayerActivity.showV315SubtitleFadeIn302Toggle() {
    val current = BiliClient.prefs.v315subtitleFadeIn302
    BiliClient.prefs.v315subtitleFadeIn302 = !current
    AppToast.show(this, "Subtitle Fade In302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV316AudioCompressorRatio298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316audioCompressorRatio298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316audioCompressorRatio298 = value
        AppToast.show(this, "Audio Compressor Ratio298: $value")
    }
}

internal fun PlayerActivity.showV316DanmakuBottomMaxCount439Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316danmakuBottomMaxCount439).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count439",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316danmakuBottomMaxCount439 = value
        AppToast.show(this, "Danmaku Bottom Max Count439: $value")
    }
}

internal fun PlayerActivity.showV316SubtitleFadeIn303Toggle() {
    val current = BiliClient.prefs.v316subtitleFadeIn303
    BiliClient.prefs.v316subtitleFadeIn303 = !current
    AppToast.show(this, "Subtitle Fade In303: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV316GestureShakeSensitivity298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316gestureShakeSensitivity298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316gestureShakeSensitivity298 = value
        AppToast.show(this, "Gesture Shake Sensitivity298: $value")
    }
}

internal fun PlayerActivity.showV316CastBitrate298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316castBitrate298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316castBitrate298 = value
        AppToast.show(this, "Cast Bitrate298: $value")
    }
}

internal fun PlayerActivity.showV316PlaylistAutoNext298Toggle() {
    val current = BiliClient.prefs.v316playlistAutoNext298
    BiliClient.prefs.v316playlistAutoNext298 = !current
    AppToast.show(this, "Playlist Auto Next298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV316CachePreloadSize299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316cachePreloadSize299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316cachePreloadSize299 = value
        AppToast.show(this, "Cache Preload Size299: $value")
    }
}

internal fun PlayerActivity.showV316ProgressBarStyle298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316progressBarStyle298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316progressBarStyle298 = value
        AppToast.show(this, "Progress Bar Style298: $value")
    }
}

internal fun PlayerActivity.showV316VolumeNormalizeMode298Toggle() {
    val current = BiliClient.prefs.v316volumeNormalizeMode298
    BiliClient.prefs.v316volumeNormalizeMode298 = !current
    AppToast.show(this, "Volume Normalize Mode298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV316HistoryAutoClean298Toggle() {
    val current = BiliClient.prefs.v316historyAutoClean298
    BiliClient.prefs.v316historyAutoClean298 = !current
    AppToast.show(this, "History Auto Clean298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV316PlaybackResumeFromBackground298Toggle() {
    val current = BiliClient.prefs.v316playbackResumeFromBackground298
    BiliClient.prefs.v316playbackResumeFromBackground298 = !current
    AppToast.show(this, "Playback Resume From Background298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV316ScreenshotEnhance298Toggle() {
    val current = BiliClient.prefs.v316screenshotEnhance298
    BiliClient.prefs.v316screenshotEnhance298 = !current
    AppToast.show(this, "Screenshot Enhance298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV316VideoHDR298Toggle() {
    val current = BiliClient.prefs.v316videoHDR298
    BiliClient.prefs.v316videoHDR298 = !current
    AppToast.show(this, "Video HDR298: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV316SubtitleFadeIn304Toggle() {
    val current = BiliClient.prefs.v316subtitleFadeIn304
    BiliClient.prefs.v316subtitleFadeIn304 = !current
    AppToast.show(this, "Subtitle Fade In304: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV317SubtitleFadeIn305Toggle() {
    val current = BiliClient.prefs.v317subtitleFadeIn305
    BiliClient.prefs.v317subtitleFadeIn305 = !current
    AppToast.show(this, "Subtitle Fade In305: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV317PlaylistAutoNext299Toggle() {
    val current = BiliClient.prefs.v317playlistAutoNext299
    BiliClient.prefs.v317playlistAutoNext299 = !current
    AppToast.show(this, "Playlist Auto Next299: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV317VolumeNormalizeMode299Toggle() {
    val current = BiliClient.prefs.v317volumeNormalizeMode299
    BiliClient.prefs.v317volumeNormalizeMode299 = !current
    AppToast.show(this, "Volume Normalize Mode299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV317HistoryAutoClean299Toggle() {
    val current = BiliClient.prefs.v317historyAutoClean299
    BiliClient.prefs.v317historyAutoClean299 = !current
    AppToast.show(this, "History Auto Clean299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV317PlaybackResumeFromBackground299Toggle() {
    val current = BiliClient.prefs.v317playbackResumeFromBackground299
    BiliClient.prefs.v317playbackResumeFromBackground299 = !current
    AppToast.show(this, "Playback Resume From Background299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV317ScreenshotEnhance299Toggle() {
    val current = BiliClient.prefs.v317screenshotEnhance299
    BiliClient.prefs.v317screenshotEnhance299 = !current
    AppToast.show(this, "Screenshot Enhance299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV317VideoHDR299Toggle() {
    val current = BiliClient.prefs.v317videoHDR299
    BiliClient.prefs.v317videoHDR299 = !current
    AppToast.show(this, "Video HDR299: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV317SubtitleFadeIn306Toggle() {
    val current = BiliClient.prefs.v317subtitleFadeIn306
    BiliClient.prefs.v317subtitleFadeIn306 = !current
    AppToast.show(this, "Subtitle Fade In306: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV318SubtitleFadeIn307Toggle() {
    val current = BiliClient.prefs.v318subtitleFadeIn307
    BiliClient.prefs.v318subtitleFadeIn307 = !current
    AppToast.show(this, "Subtitle Fade In307: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV318PlaylistAutoNext300Toggle() {
    val current = BiliClient.prefs.v318playlistAutoNext300
    BiliClient.prefs.v318playlistAutoNext300 = !current
    AppToast.show(this, "Playlist Auto Next300: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV318VolumeNormalizeMode300Toggle() {
    val current = BiliClient.prefs.v318volumeNormalizeMode300
    BiliClient.prefs.v318volumeNormalizeMode300 = !current
    AppToast.show(this, "Volume Normalize Mode300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV318HistoryAutoClean300Toggle() {
    val current = BiliClient.prefs.v318historyAutoClean300
    BiliClient.prefs.v318historyAutoClean300 = !current
    AppToast.show(this, "History Auto Clean300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV318PlaybackResumeFromBackground300Toggle() {
    val current = BiliClient.prefs.v318playbackResumeFromBackground300
    BiliClient.prefs.v318playbackResumeFromBackground300 = !current
    AppToast.show(this, "Playback Resume From Background300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV318ScreenshotEnhance300Toggle() {
    val current = BiliClient.prefs.v318screenshotEnhance300
    BiliClient.prefs.v318screenshotEnhance300 = !current
    AppToast.show(this, "Screenshot Enhance300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV318VideoHDR300Toggle() {
    val current = BiliClient.prefs.v318videoHDR300
    BiliClient.prefs.v318videoHDR300 = !current
    AppToast.show(this, "Video HDR300: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV318SubtitleFadeIn308Toggle() {
    val current = BiliClient.prefs.v318subtitleFadeIn308
    BiliClient.prefs.v318subtitleFadeIn308 = !current
    AppToast.show(this, "Subtitle Fade In308: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV319SubtitleFadeIn309Toggle() {
    val current = BiliClient.prefs.v319subtitleFadeIn309
    BiliClient.prefs.v319subtitleFadeIn309 = !current
    AppToast.show(this, "Subtitle Fade In309: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV319PlaylistAutoNext301Toggle() {
    val current = BiliClient.prefs.v319playlistAutoNext301
    BiliClient.prefs.v319playlistAutoNext301 = !current
    AppToast.show(this, "Playlist Auto Next301: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV319VolumeNormalizeMode301Toggle() {
    val current = BiliClient.prefs.v319volumeNormalizeMode301
    BiliClient.prefs.v319volumeNormalizeMode301 = !current
    AppToast.show(this, "Volume Normalize Mode301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV319HistoryAutoClean301Toggle() {
    val current = BiliClient.prefs.v319historyAutoClean301
    BiliClient.prefs.v319historyAutoClean301 = !current
    AppToast.show(this, "History Auto Clean301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV319PlaybackResumeFromBackground301Toggle() {
    val current = BiliClient.prefs.v319playbackResumeFromBackground301
    BiliClient.prefs.v319playbackResumeFromBackground301 = !current
    AppToast.show(this, "Playback Resume From Background301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV319ScreenshotEnhance301Toggle() {
    val current = BiliClient.prefs.v319screenshotEnhance301
    BiliClient.prefs.v319screenshotEnhance301 = !current
    AppToast.show(this, "Screenshot Enhance301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV319VideoHDR301Toggle() {
    val current = BiliClient.prefs.v319videoHDR301
    BiliClient.prefs.v319videoHDR301 = !current
    AppToast.show(this, "Video HDR301: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV319SubtitleFadeIn310Toggle() {
    val current = BiliClient.prefs.v319subtitleFadeIn310
    BiliClient.prefs.v319subtitleFadeIn310 = !current
    AppToast.show(this, "Subtitle Fade In310: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV320SubtitleFadeIn311Toggle() {
    val current = BiliClient.prefs.v320subtitleFadeIn311
    BiliClient.prefs.v320subtitleFadeIn311 = !current
    AppToast.show(this, "Subtitle Fade In311: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV320PlaylistAutoNext302Toggle() {
    val current = BiliClient.prefs.v320playlistAutoNext302
    BiliClient.prefs.v320playlistAutoNext302 = !current
    AppToast.show(this, "Playlist Auto Next302: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV320VolumeNormalizeMode302Toggle() {
    val current = BiliClient.prefs.v320volumeNormalizeMode302
    BiliClient.prefs.v320volumeNormalizeMode302 = !current
    AppToast.show(this, "Volume Normalize Mode302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV320HistoryAutoClean302Toggle() {
    val current = BiliClient.prefs.v320historyAutoClean302
    BiliClient.prefs.v320historyAutoClean302 = !current
    AppToast.show(this, "History Auto Clean302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV320PlaybackResumeFromBackground302Toggle() {
    val current = BiliClient.prefs.v320playbackResumeFromBackground302
    BiliClient.prefs.v320playbackResumeFromBackground302 = !current
    AppToast.show(this, "Playback Resume From Background302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV320ScreenshotEnhance302Toggle() {
    val current = BiliClient.prefs.v320screenshotEnhance302
    BiliClient.prefs.v320screenshotEnhance302 = !current
    AppToast.show(this, "Screenshot Enhance302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV320VideoHDR302Toggle() {
    val current = BiliClient.prefs.v320videoHDR302
    BiliClient.prefs.v320videoHDR302 = !current
    AppToast.show(this, "Video HDR302: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV320SubtitleFadeIn312Toggle() {
    val current = BiliClient.prefs.v320subtitleFadeIn312
    BiliClient.prefs.v320subtitleFadeIn312 = !current
    AppToast.show(this, "Subtitle Fade In312: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV321VolumeLevelIndicator303Toggle() {
    val current = BiliClient.prefs.v321volumeLevelIndicator303
    BiliClient.prefs.v321volumeLevelIndicator303 = !current
    AppToast.show(this, "Volume Level Indicator303: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV321HistorySearchEnabled303Toggle() {
    val current = BiliClient.prefs.v321historySearchEnabled303
    BiliClient.prefs.v321historySearchEnabled303 = !current
    AppToast.show(this, "History Search Enabled303: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV321PlaybackSpeedMemory303Toggle() {
    val current = BiliClient.prefs.v321playbackSpeedMemory303
    BiliClient.prefs.v321playbackSpeedMemory303 = !current
    AppToast.show(this, "Playback Speed Memory303: ${if (!current) "ON" else "OFF"}")
}

