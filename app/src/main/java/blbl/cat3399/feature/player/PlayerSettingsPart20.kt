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

internal fun PlayerActivity.showV281ScreenshotSavePath281Toggle() {
    val current = BiliClient.prefs.v281screenshotSavePath281
    BiliClient.prefs.v281screenshotSavePath281 = !current
    AppToast.show(this, "Screenshot Save Path281: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV281VideoColorSpace281Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281videoColorSpace281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281videoColorSpace281 = value
        AppToast.show(this, "Video Color Space281: $value")
    }
}

internal fun PlayerActivity.showV281DanmakuBottomMaxCount370Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281danmakuBottomMaxCount370).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count370",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281danmakuBottomMaxCount370 = value
        AppToast.show(this, "Danmaku Bottom Max Count370: $value")
    }
}

internal fun PlayerActivity.showV281SubtitleBgBorder377Toggle() {
    val current = BiliClient.prefs.v281subtitleBgBorder377
    BiliClient.prefs.v281subtitleBgBorder377 = !current
    AppToast.show(this, "Subtitle Bg Border377: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV282AudioEQCustom282Toggle() {
    val current = BiliClient.prefs.v282audioEQCustom282
    BiliClient.prefs.v282audioEQCustom282 = !current
    AppToast.show(this, "Audio EQ Custom282: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV282DanmakuBottomMaxCount371Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v282danmakuBottomMaxCount371).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count371",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v282danmakuBottomMaxCount371 = value
        AppToast.show(this, "Danmaku Bottom Max Count371: $value")
    }
}

internal fun PlayerActivity.showV282SubtitleBgBorder378Toggle() {
    val current = BiliClient.prefs.v282subtitleBgBorder378
    BiliClient.prefs.v282subtitleBgBorder378 = !current
    AppToast.show(this, "Subtitle Bg Border378: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV282GestureShakeAction282Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v282gestureShakeAction282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v282gestureShakeAction282 = value
        AppToast.show(this, "Gesture Shake Action282: $value")
    }
}

internal fun PlayerActivity.showV282CastAudioVolume282Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v282castAudioVolume282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v282castAudioVolume282 = value
        AppToast.show(this, "Cast Audio Volume282: $value")
    }
}

internal fun PlayerActivity.showV282PlaylistAutoSkipOutro282Toggle() {
    val current = BiliClient.prefs.v282playlistAutoSkipOutro282
    BiliClient.prefs.v282playlistAutoSkipOutro282 = !current
    AppToast.show(this, "Playlist Auto Skip Outro282: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV282CacheDownloadSpeed283Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v282cacheDownloadSpeed283).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed283",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v282cacheDownloadSpeed283 = value
        AppToast.show(this, "Cache Download Speed283: $value")
    }
}

internal fun PlayerActivity.showV282ProgressBarThumbBorder282Toggle() {
    val current = BiliClient.prefs.v282progressBarThumbBorder282
    BiliClient.prefs.v282progressBarThumbBorder282 = !current
    AppToast.show(this, "Progress Bar Thumb Border282: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV282VolumeBoostPeak282Toggle() {
    val current = BiliClient.prefs.v282volumeBoostPeak282
    BiliClient.prefs.v282volumeBoostPeak282 = !current
    AppToast.show(this, "Volume Boost Peak282: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV282HistoryBookmarkExport282Toggle() {
    val current = BiliClient.prefs.v282historyBookmarkExport282
    BiliClient.prefs.v282historyBookmarkExport282 = !current
    AppToast.show(this, "History Bookmark Export282: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV282PlaybackChapterSync282Toggle() {
    val current = BiliClient.prefs.v282playbackChapterSync282
    BiliClient.prefs.v282playbackChapterSync282 = !current
    AppToast.show(this, "Playback Chapter Sync282: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV282ScreenshotSavePath282Toggle() {
    val current = BiliClient.prefs.v282screenshotSavePath282
    BiliClient.prefs.v282screenshotSavePath282 = !current
    AppToast.show(this, "Screenshot Save Path282: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV282VideoColorSpace282Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v282videoColorSpace282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v282videoColorSpace282 = value
        AppToast.show(this, "Video Color Space282: $value")
    }
}

internal fun PlayerActivity.showV282DanmakuBottomMaxCount372Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v282danmakuBottomMaxCount372).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count372",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v282danmakuBottomMaxCount372 = value
        AppToast.show(this, "Danmaku Bottom Max Count372: $value")
    }
}

internal fun PlayerActivity.showV282SubtitleBgBorder379Toggle() {
    val current = BiliClient.prefs.v282subtitleBgBorder379
    BiliClient.prefs.v282subtitleBgBorder379 = !current
    AppToast.show(this, "Subtitle Bg Border379: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV283AudioEQCustom283Toggle() {
    val current = BiliClient.prefs.v283audioEQCustom283
    BiliClient.prefs.v283audioEQCustom283 = !current
    AppToast.show(this, "Audio EQ Custom283: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV283DanmakuBottomMaxCount373Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v283danmakuBottomMaxCount373).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count373",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v283danmakuBottomMaxCount373 = value
        AppToast.show(this, "Danmaku Bottom Max Count373: $value")
    }
}

internal fun PlayerActivity.showV283SubtitleBgBorder380Toggle() {
    val current = BiliClient.prefs.v283subtitleBgBorder380
    BiliClient.prefs.v283subtitleBgBorder380 = !current
    AppToast.show(this, "Subtitle Bg Border380: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV283GestureShakeAction283Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v283gestureShakeAction283).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action283",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v283gestureShakeAction283 = value
        AppToast.show(this, "Gesture Shake Action283: $value")
    }
}

internal fun PlayerActivity.showV283CastAudioVolume283Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v283castAudioVolume283).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume283",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v283castAudioVolume283 = value
        AppToast.show(this, "Cast Audio Volume283: $value")
    }
}

internal fun PlayerActivity.showV283PlaylistAutoSkipOutro283Toggle() {
    val current = BiliClient.prefs.v283playlistAutoSkipOutro283
    BiliClient.prefs.v283playlistAutoSkipOutro283 = !current
    AppToast.show(this, "Playlist Auto Skip Outro283: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV283CacheDownloadSpeed284Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v283cacheDownloadSpeed284).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed284",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v283cacheDownloadSpeed284 = value
        AppToast.show(this, "Cache Download Speed284: $value")
    }
}

internal fun PlayerActivity.showV283ProgressBarThumbBorder283Toggle() {
    val current = BiliClient.prefs.v283progressBarThumbBorder283
    BiliClient.prefs.v283progressBarThumbBorder283 = !current
    AppToast.show(this, "Progress Bar Thumb Border283: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV283VolumeBoostPeak283Toggle() {
    val current = BiliClient.prefs.v283volumeBoostPeak283
    BiliClient.prefs.v283volumeBoostPeak283 = !current
    AppToast.show(this, "Volume Boost Peak283: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV283HistoryBookmarkExport283Toggle() {
    val current = BiliClient.prefs.v283historyBookmarkExport283
    BiliClient.prefs.v283historyBookmarkExport283 = !current
    AppToast.show(this, "History Bookmark Export283: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV283PlaybackChapterSync283Toggle() {
    val current = BiliClient.prefs.v283playbackChapterSync283
    BiliClient.prefs.v283playbackChapterSync283 = !current
    AppToast.show(this, "Playback Chapter Sync283: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV283ScreenshotSavePath283Toggle() {
    val current = BiliClient.prefs.v283screenshotSavePath283
    BiliClient.prefs.v283screenshotSavePath283 = !current
    AppToast.show(this, "Screenshot Save Path283: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV283VideoColorSpace283Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v283videoColorSpace283).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space283",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v283videoColorSpace283 = value
        AppToast.show(this, "Video Color Space283: $value")
    }
}

internal fun PlayerActivity.showV283DanmakuBottomMaxCount374Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v283danmakuBottomMaxCount374).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count374",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v283danmakuBottomMaxCount374 = value
        AppToast.show(this, "Danmaku Bottom Max Count374: $value")
    }
}

internal fun PlayerActivity.showV283SubtitleBgBorder381Toggle() {
    val current = BiliClient.prefs.v283subtitleBgBorder381
    BiliClient.prefs.v283subtitleBgBorder381 = !current
    AppToast.show(this, "Subtitle Bg Border381: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV284AudioEQCustom284Toggle() {
    val current = BiliClient.prefs.v284audioEQCustom284
    BiliClient.prefs.v284audioEQCustom284 = !current
    AppToast.show(this, "Audio EQ Custom284: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV284DanmakuBottomMaxCount375Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v284danmakuBottomMaxCount375).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count375",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v284danmakuBottomMaxCount375 = value
        AppToast.show(this, "Danmaku Bottom Max Count375: $value")
    }
}

internal fun PlayerActivity.showV284SubtitleBgBorder382Toggle() {
    val current = BiliClient.prefs.v284subtitleBgBorder382
    BiliClient.prefs.v284subtitleBgBorder382 = !current
    AppToast.show(this, "Subtitle Bg Border382: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV284GestureShakeAction284Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v284gestureShakeAction284).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action284",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v284gestureShakeAction284 = value
        AppToast.show(this, "Gesture Shake Action284: $value")
    }
}

internal fun PlayerActivity.showV284CastAudioVolume284Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v284castAudioVolume284).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume284",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v284castAudioVolume284 = value
        AppToast.show(this, "Cast Audio Volume284: $value")
    }
}

internal fun PlayerActivity.showV284PlaylistAutoSkipOutro284Toggle() {
    val current = BiliClient.prefs.v284playlistAutoSkipOutro284
    BiliClient.prefs.v284playlistAutoSkipOutro284 = !current
    AppToast.show(this, "Playlist Auto Skip Outro284: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV284CacheDownloadSpeed285Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v284cacheDownloadSpeed285).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed285",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v284cacheDownloadSpeed285 = value
        AppToast.show(this, "Cache Download Speed285: $value")
    }
}

internal fun PlayerActivity.showV284ProgressBarThumbBorder284Toggle() {
    val current = BiliClient.prefs.v284progressBarThumbBorder284
    BiliClient.prefs.v284progressBarThumbBorder284 = !current
    AppToast.show(this, "Progress Bar Thumb Border284: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV284VolumeBoostPeak284Toggle() {
    val current = BiliClient.prefs.v284volumeBoostPeak284
    BiliClient.prefs.v284volumeBoostPeak284 = !current
    AppToast.show(this, "Volume Boost Peak284: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV284HistoryBookmarkExport284Toggle() {
    val current = BiliClient.prefs.v284historyBookmarkExport284
    BiliClient.prefs.v284historyBookmarkExport284 = !current
    AppToast.show(this, "History Bookmark Export284: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV284PlaybackChapterSync284Toggle() {
    val current = BiliClient.prefs.v284playbackChapterSync284
    BiliClient.prefs.v284playbackChapterSync284 = !current
    AppToast.show(this, "Playback Chapter Sync284: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV284ScreenshotSavePath284Toggle() {
    val current = BiliClient.prefs.v284screenshotSavePath284
    BiliClient.prefs.v284screenshotSavePath284 = !current
    AppToast.show(this, "Screenshot Save Path284: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV284VideoColorSpace284Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v284videoColorSpace284).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space284",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v284videoColorSpace284 = value
        AppToast.show(this, "Video Color Space284: $value")
    }
}

internal fun PlayerActivity.showV284DanmakuBottomMaxCount376Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v284danmakuBottomMaxCount376).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count376",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v284danmakuBottomMaxCount376 = value
        AppToast.show(this, "Danmaku Bottom Max Count376: $value")
    }
}

internal fun PlayerActivity.showV284SubtitleBgBorder383Toggle() {
    val current = BiliClient.prefs.v284subtitleBgBorder383
    BiliClient.prefs.v284subtitleBgBorder383 = !current
    AppToast.show(this, "Subtitle Bg Border383: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV285AudioEQCustom285Toggle() {
    val current = BiliClient.prefs.v285audioEQCustom285
    BiliClient.prefs.v285audioEQCustom285 = !current
    AppToast.show(this, "Audio EQ Custom285: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV285DanmakuBottomMaxCount377Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v285danmakuBottomMaxCount377).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count377",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v285danmakuBottomMaxCount377 = value
        AppToast.show(this, "Danmaku Bottom Max Count377: $value")
    }
}

internal fun PlayerActivity.showV285SubtitleBgBorder384Toggle() {
    val current = BiliClient.prefs.v285subtitleBgBorder384
    BiliClient.prefs.v285subtitleBgBorder384 = !current
    AppToast.show(this, "Subtitle Bg Border384: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV285GestureShakeAction285Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v285gestureShakeAction285).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action285",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v285gestureShakeAction285 = value
        AppToast.show(this, "Gesture Shake Action285: $value")
    }
}

internal fun PlayerActivity.showV285CastAudioVolume285Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v285castAudioVolume285).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume285",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v285castAudioVolume285 = value
        AppToast.show(this, "Cast Audio Volume285: $value")
    }
}

internal fun PlayerActivity.showV285PlaylistAutoSkipOutro285Toggle() {
    val current = BiliClient.prefs.v285playlistAutoSkipOutro285
    BiliClient.prefs.v285playlistAutoSkipOutro285 = !current
    AppToast.show(this, "Playlist Auto Skip Outro285: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV285CacheDownloadSpeed286Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v285cacheDownloadSpeed286).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed286",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v285cacheDownloadSpeed286 = value
        AppToast.show(this, "Cache Download Speed286: $value")
    }
}

internal fun PlayerActivity.showV285ProgressBarThumbBorder285Toggle() {
    val current = BiliClient.prefs.v285progressBarThumbBorder285
    BiliClient.prefs.v285progressBarThumbBorder285 = !current
    AppToast.show(this, "Progress Bar Thumb Border285: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV285VolumeBoostPeak285Toggle() {
    val current = BiliClient.prefs.v285volumeBoostPeak285
    BiliClient.prefs.v285volumeBoostPeak285 = !current
    AppToast.show(this, "Volume Boost Peak285: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV285HistoryBookmarkExport285Toggle() {
    val current = BiliClient.prefs.v285historyBookmarkExport285
    BiliClient.prefs.v285historyBookmarkExport285 = !current
    AppToast.show(this, "History Bookmark Export285: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV285PlaybackChapterSync285Toggle() {
    val current = BiliClient.prefs.v285playbackChapterSync285
    BiliClient.prefs.v285playbackChapterSync285 = !current
    AppToast.show(this, "Playback Chapter Sync285: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV285ScreenshotSavePath285Toggle() {
    val current = BiliClient.prefs.v285screenshotSavePath285
    BiliClient.prefs.v285screenshotSavePath285 = !current
    AppToast.show(this, "Screenshot Save Path285: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV285VideoColorSpace285Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v285videoColorSpace285).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space285",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v285videoColorSpace285 = value
        AppToast.show(this, "Video Color Space285: $value")
    }
}

internal fun PlayerActivity.showV285DanmakuBottomMaxCount378Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v285danmakuBottomMaxCount378).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count378",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v285danmakuBottomMaxCount378 = value
        AppToast.show(this, "Danmaku Bottom Max Count378: $value")
    }
}

internal fun PlayerActivity.showV285SubtitleBgBorder385Toggle() {
    val current = BiliClient.prefs.v285subtitleBgBorder385
    BiliClient.prefs.v285subtitleBgBorder385 = !current
    AppToast.show(this, "Subtitle Bg Border385: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV286AudioEQCustom286Toggle() {
    val current = BiliClient.prefs.v286audioEQCustom286
    BiliClient.prefs.v286audioEQCustom286 = !current
    AppToast.show(this, "Audio EQ Custom286: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV286DanmakuBottomMaxCount379Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v286danmakuBottomMaxCount379).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count379",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v286danmakuBottomMaxCount379 = value
        AppToast.show(this, "Danmaku Bottom Max Count379: $value")
    }
}

internal fun PlayerActivity.showV286SubtitleBgBorder386Toggle() {
    val current = BiliClient.prefs.v286subtitleBgBorder386
    BiliClient.prefs.v286subtitleBgBorder386 = !current
    AppToast.show(this, "Subtitle Bg Border386: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV286GestureShakeAction286Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v286gestureShakeAction286).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action286",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v286gestureShakeAction286 = value
        AppToast.show(this, "Gesture Shake Action286: $value")
    }
}

internal fun PlayerActivity.showV286CastAudioVolume286Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v286castAudioVolume286).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume286",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v286castAudioVolume286 = value
        AppToast.show(this, "Cast Audio Volume286: $value")
    }
}

internal fun PlayerActivity.showV286PlaylistAutoSkipOutro286Toggle() {
    val current = BiliClient.prefs.v286playlistAutoSkipOutro286
    BiliClient.prefs.v286playlistAutoSkipOutro286 = !current
    AppToast.show(this, "Playlist Auto Skip Outro286: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV286CacheDownloadSpeed287Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v286cacheDownloadSpeed287).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed287",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v286cacheDownloadSpeed287 = value
        AppToast.show(this, "Cache Download Speed287: $value")
    }
}

internal fun PlayerActivity.showV286ProgressBarThumbBorder286Toggle() {
    val current = BiliClient.prefs.v286progressBarThumbBorder286
    BiliClient.prefs.v286progressBarThumbBorder286 = !current
    AppToast.show(this, "Progress Bar Thumb Border286: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV286VolumeBoostPeak286Toggle() {
    val current = BiliClient.prefs.v286volumeBoostPeak286
    BiliClient.prefs.v286volumeBoostPeak286 = !current
    AppToast.show(this, "Volume Boost Peak286: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV286HistoryBookmarkExport286Toggle() {
    val current = BiliClient.prefs.v286historyBookmarkExport286
    BiliClient.prefs.v286historyBookmarkExport286 = !current
    AppToast.show(this, "History Bookmark Export286: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV286PlaybackChapterSync286Toggle() {
    val current = BiliClient.prefs.v286playbackChapterSync286
    BiliClient.prefs.v286playbackChapterSync286 = !current
    AppToast.show(this, "Playback Chapter Sync286: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV286ScreenshotSavePath286Toggle() {
    val current = BiliClient.prefs.v286screenshotSavePath286
    BiliClient.prefs.v286screenshotSavePath286 = !current
    AppToast.show(this, "Screenshot Save Path286: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV286VideoColorSpace286Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v286videoColorSpace286).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space286",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v286videoColorSpace286 = value
        AppToast.show(this, "Video Color Space286: $value")
    }
}

internal fun PlayerActivity.showV286DanmakuBottomMaxCount380Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v286danmakuBottomMaxCount380).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count380",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v286danmakuBottomMaxCount380 = value
        AppToast.show(this, "Danmaku Bottom Max Count380: $value")
    }
}

internal fun PlayerActivity.showV286SubtitleBgBorder387Toggle() {
    val current = BiliClient.prefs.v286subtitleBgBorder387
    BiliClient.prefs.v286subtitleBgBorder387 = !current
    AppToast.show(this, "Subtitle Bg Border387: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV287AudioEQCustom287Toggle() {
    val current = BiliClient.prefs.v287audioEQCustom287
    BiliClient.prefs.v287audioEQCustom287 = !current
    AppToast.show(this, "Audio EQ Custom287: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV287DanmakuBottomMaxCount381Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v287danmakuBottomMaxCount381).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count381",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v287danmakuBottomMaxCount381 = value
        AppToast.show(this, "Danmaku Bottom Max Count381: $value")
    }
}

internal fun PlayerActivity.showV287SubtitleBgBorder388Toggle() {
    val current = BiliClient.prefs.v287subtitleBgBorder388
    BiliClient.prefs.v287subtitleBgBorder388 = !current
    AppToast.show(this, "Subtitle Bg Border388: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV287GestureShakeAction287Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v287gestureShakeAction287).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action287",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v287gestureShakeAction287 = value
        AppToast.show(this, "Gesture Shake Action287: $value")
    }
}

internal fun PlayerActivity.showV287CastAudioVolume287Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v287castAudioVolume287).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume287",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v287castAudioVolume287 = value
        AppToast.show(this, "Cast Audio Volume287: $value")
    }
}

internal fun PlayerActivity.showV287PlaylistAutoSkipOutro287Toggle() {
    val current = BiliClient.prefs.v287playlistAutoSkipOutro287
    BiliClient.prefs.v287playlistAutoSkipOutro287 = !current
    AppToast.show(this, "Playlist Auto Skip Outro287: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV287CacheDownloadSpeed288Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v287cacheDownloadSpeed288).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed288",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v287cacheDownloadSpeed288 = value
        AppToast.show(this, "Cache Download Speed288: $value")
    }
}

internal fun PlayerActivity.showV287ProgressBarThumbBorder287Toggle() {
    val current = BiliClient.prefs.v287progressBarThumbBorder287
    BiliClient.prefs.v287progressBarThumbBorder287 = !current
    AppToast.show(this, "Progress Bar Thumb Border287: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV287VolumeBoostPeak287Toggle() {
    val current = BiliClient.prefs.v287volumeBoostPeak287
    BiliClient.prefs.v287volumeBoostPeak287 = !current
    AppToast.show(this, "Volume Boost Peak287: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV287HistoryBookmarkExport287Toggle() {
    val current = BiliClient.prefs.v287historyBookmarkExport287
    BiliClient.prefs.v287historyBookmarkExport287 = !current
    AppToast.show(this, "History Bookmark Export287: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV287PlaybackChapterSync287Toggle() {
    val current = BiliClient.prefs.v287playbackChapterSync287
    BiliClient.prefs.v287playbackChapterSync287 = !current
    AppToast.show(this, "Playback Chapter Sync287: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV287ScreenshotSavePath287Toggle() {
    val current = BiliClient.prefs.v287screenshotSavePath287
    BiliClient.prefs.v287screenshotSavePath287 = !current
    AppToast.show(this, "Screenshot Save Path287: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV287VideoColorSpace287Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v287videoColorSpace287).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space287",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v287videoColorSpace287 = value
        AppToast.show(this, "Video Color Space287: $value")
    }
}

internal fun PlayerActivity.showV287DanmakuBottomMaxCount382Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v287danmakuBottomMaxCount382).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count382",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v287danmakuBottomMaxCount382 = value
        AppToast.show(this, "Danmaku Bottom Max Count382: $value")
    }
}

internal fun PlayerActivity.showV287SubtitleBgBorder389Toggle() {
    val current = BiliClient.prefs.v287subtitleBgBorder389
    BiliClient.prefs.v287subtitleBgBorder389 = !current
    AppToast.show(this, "Subtitle Bg Border389: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV288AudioEQCustom288Toggle() {
    val current = BiliClient.prefs.v288audioEQCustom288
    BiliClient.prefs.v288audioEQCustom288 = !current
    AppToast.show(this, "Audio EQ Custom288: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV288DanmakuBottomMaxCount383Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v288danmakuBottomMaxCount383).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count383",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v288danmakuBottomMaxCount383 = value
        AppToast.show(this, "Danmaku Bottom Max Count383: $value")
    }
}

internal fun PlayerActivity.showV288SubtitleBgBorder390Toggle() {
    val current = BiliClient.prefs.v288subtitleBgBorder390
    BiliClient.prefs.v288subtitleBgBorder390 = !current
    AppToast.show(this, "Subtitle Bg Border390: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV288GestureShakeAction288Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v288gestureShakeAction288).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action288",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v288gestureShakeAction288 = value
        AppToast.show(this, "Gesture Shake Action288: $value")
    }
}

internal fun PlayerActivity.showV288CastAudioVolume288Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v288castAudioVolume288).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume288",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v288castAudioVolume288 = value
        AppToast.show(this, "Cast Audio Volume288: $value")
    }
}

internal fun PlayerActivity.showV288PlaylistAutoSkipOutro288Toggle() {
    val current = BiliClient.prefs.v288playlistAutoSkipOutro288
    BiliClient.prefs.v288playlistAutoSkipOutro288 = !current
    AppToast.show(this, "Playlist Auto Skip Outro288: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV288CacheDownloadSpeed289Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v288cacheDownloadSpeed289).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed289",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v288cacheDownloadSpeed289 = value
        AppToast.show(this, "Cache Download Speed289: $value")
    }
}

internal fun PlayerActivity.showV288ProgressBarThumbBorder288Toggle() {
    val current = BiliClient.prefs.v288progressBarThumbBorder288
    BiliClient.prefs.v288progressBarThumbBorder288 = !current
    AppToast.show(this, "Progress Bar Thumb Border288: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV288VolumeBoostPeak288Toggle() {
    val current = BiliClient.prefs.v288volumeBoostPeak288
    BiliClient.prefs.v288volumeBoostPeak288 = !current
    AppToast.show(this, "Volume Boost Peak288: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV288HistoryBookmarkExport288Toggle() {
    val current = BiliClient.prefs.v288historyBookmarkExport288
    BiliClient.prefs.v288historyBookmarkExport288 = !current
    AppToast.show(this, "History Bookmark Export288: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV288PlaybackChapterSync288Toggle() {
    val current = BiliClient.prefs.v288playbackChapterSync288
    BiliClient.prefs.v288playbackChapterSync288 = !current
    AppToast.show(this, "Playback Chapter Sync288: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV288ScreenshotSavePath288Toggle() {
    val current = BiliClient.prefs.v288screenshotSavePath288
    BiliClient.prefs.v288screenshotSavePath288 = !current
    AppToast.show(this, "Screenshot Save Path288: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV288VideoColorSpace288Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v288videoColorSpace288).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space288",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v288videoColorSpace288 = value
        AppToast.show(this, "Video Color Space288: $value")
    }
}

internal fun PlayerActivity.showV288DanmakuBottomMaxCount384Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v288danmakuBottomMaxCount384).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count384",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v288danmakuBottomMaxCount384 = value
        AppToast.show(this, "Danmaku Bottom Max Count384: $value")
    }
}

internal fun PlayerActivity.showV288SubtitleBgBorder391Toggle() {
    val current = BiliClient.prefs.v288subtitleBgBorder391
    BiliClient.prefs.v288subtitleBgBorder391 = !current
    AppToast.show(this, "Subtitle Bg Border391: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV289AudioEQCustom289Toggle() {
    val current = BiliClient.prefs.v289audioEQCustom289
    BiliClient.prefs.v289audioEQCustom289 = !current
    AppToast.show(this, "Audio EQ Custom289: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV289DanmakuBottomMaxCount385Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v289danmakuBottomMaxCount385).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count385",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289danmakuBottomMaxCount385 = value
        AppToast.show(this, "Danmaku Bottom Max Count385: $value")
    }
}

internal fun PlayerActivity.showV289SubtitleBgBorder392Toggle() {
    val current = BiliClient.prefs.v289subtitleBgBorder392
    BiliClient.prefs.v289subtitleBgBorder392 = !current
    AppToast.show(this, "Subtitle Bg Border392: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV289GestureShakeAction289Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v289gestureShakeAction289).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action289",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289gestureShakeAction289 = value
        AppToast.show(this, "Gesture Shake Action289: $value")
    }
}

internal fun PlayerActivity.showV289CastAudioVolume289Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v289castAudioVolume289).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume289",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289castAudioVolume289 = value
        AppToast.show(this, "Cast Audio Volume289: $value")
    }
}

internal fun PlayerActivity.showV289PlaylistAutoSkipOutro289Toggle() {
    val current = BiliClient.prefs.v289playlistAutoSkipOutro289
    BiliClient.prefs.v289playlistAutoSkipOutro289 = !current
    AppToast.show(this, "Playlist Auto Skip Outro289: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV289CacheDownloadSpeed290Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v289cacheDownloadSpeed290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289cacheDownloadSpeed290 = value
        AppToast.show(this, "Cache Download Speed290: $value")
    }
}

internal fun PlayerActivity.showV289ProgressBarThumbBorder289Toggle() {
    val current = BiliClient.prefs.v289progressBarThumbBorder289
    BiliClient.prefs.v289progressBarThumbBorder289 = !current
    AppToast.show(this, "Progress Bar Thumb Border289: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV289VolumeBoostPeak289Toggle() {
    val current = BiliClient.prefs.v289volumeBoostPeak289
    BiliClient.prefs.v289volumeBoostPeak289 = !current
    AppToast.show(this, "Volume Boost Peak289: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV289HistoryBookmarkExport289Toggle() {
    val current = BiliClient.prefs.v289historyBookmarkExport289
    BiliClient.prefs.v289historyBookmarkExport289 = !current
    AppToast.show(this, "History Bookmark Export289: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV289PlaybackChapterSync289Toggle() {
    val current = BiliClient.prefs.v289playbackChapterSync289
    BiliClient.prefs.v289playbackChapterSync289 = !current
    AppToast.show(this, "Playback Chapter Sync289: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV289ScreenshotSavePath289Toggle() {
    val current = BiliClient.prefs.v289screenshotSavePath289
    BiliClient.prefs.v289screenshotSavePath289 = !current
    AppToast.show(this, "Screenshot Save Path289: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV289VideoColorSpace289Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v289videoColorSpace289).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space289",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289videoColorSpace289 = value
        AppToast.show(this, "Video Color Space289: $value")
    }
}

internal fun PlayerActivity.showV289DanmakuBottomMaxCount386Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v289danmakuBottomMaxCount386).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count386",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v289danmakuBottomMaxCount386 = value
        AppToast.show(this, "Danmaku Bottom Max Count386: $value")
    }
}

internal fun PlayerActivity.showV289SubtitleBgBorder393Toggle() {
    val current = BiliClient.prefs.v289subtitleBgBorder393
    BiliClient.prefs.v289subtitleBgBorder393 = !current
    AppToast.show(this, "Subtitle Bg Border393: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV290AudioEQCustom290Toggle() {
    val current = BiliClient.prefs.v290audioEQCustom290
    BiliClient.prefs.v290audioEQCustom290 = !current
    AppToast.show(this, "Audio EQ Custom290: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV290DanmakuBottomMaxCount387Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290danmakuBottomMaxCount387).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count387",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290danmakuBottomMaxCount387 = value
        AppToast.show(this, "Danmaku Bottom Max Count387: $value")
    }
}

internal fun PlayerActivity.showV290SubtitleBgBorder394Toggle() {
    val current = BiliClient.prefs.v290subtitleBgBorder394
    BiliClient.prefs.v290subtitleBgBorder394 = !current
    AppToast.show(this, "Subtitle Bg Border394: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV290GestureShakeAction290Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290gestureShakeAction290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290gestureShakeAction290 = value
        AppToast.show(this, "Gesture Shake Action290: $value")
    }
}

internal fun PlayerActivity.showV290CastAudioVolume290Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v290castAudioVolume290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290castAudioVolume290 = value
        AppToast.show(this, "Cast Audio Volume290: $value")
    }
}

internal fun PlayerActivity.showV290PlaylistAutoSkipOutro290Toggle() {
    val current = BiliClient.prefs.v290playlistAutoSkipOutro290
    BiliClient.prefs.v290playlistAutoSkipOutro290 = !current
    AppToast.show(this, "Playlist Auto Skip Outro290: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV290CacheDownloadSpeed291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290cacheDownloadSpeed291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290cacheDownloadSpeed291 = value
        AppToast.show(this, "Cache Download Speed291: $value")
    }
}

internal fun PlayerActivity.showV290ProgressBarThumbBorder290Toggle() {
    val current = BiliClient.prefs.v290progressBarThumbBorder290
    BiliClient.prefs.v290progressBarThumbBorder290 = !current
    AppToast.show(this, "Progress Bar Thumb Border290: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV290VolumeBoostPeak290Toggle() {
    val current = BiliClient.prefs.v290volumeBoostPeak290
    BiliClient.prefs.v290volumeBoostPeak290 = !current
    AppToast.show(this, "Volume Boost Peak290: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV290HistoryBookmarkExport290Toggle() {
    val current = BiliClient.prefs.v290historyBookmarkExport290
    BiliClient.prefs.v290historyBookmarkExport290 = !current
    AppToast.show(this, "History Bookmark Export290: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV290PlaybackChapterSync290Toggle() {
    val current = BiliClient.prefs.v290playbackChapterSync290
    BiliClient.prefs.v290playbackChapterSync290 = !current
    AppToast.show(this, "Playback Chapter Sync290: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV290ScreenshotSavePath290Toggle() {
    val current = BiliClient.prefs.v290screenshotSavePath290
    BiliClient.prefs.v290screenshotSavePath290 = !current
    AppToast.show(this, "Screenshot Save Path290: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV290VideoColorSpace290Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290videoColorSpace290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290videoColorSpace290 = value
        AppToast.show(this, "Video Color Space290: $value")
    }
}

internal fun PlayerActivity.showV290DanmakuBottomMaxCount388Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v290danmakuBottomMaxCount388).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count388",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v290danmakuBottomMaxCount388 = value
        AppToast.show(this, "Danmaku Bottom Max Count388: $value")
    }
}

internal fun PlayerActivity.showV290SubtitleBgBorder395Toggle() {
    val current = BiliClient.prefs.v290subtitleBgBorder395
    BiliClient.prefs.v290subtitleBgBorder395 = !current
    AppToast.show(this, "Subtitle Bg Border395: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV291AudioEQCustom291Toggle() {
    val current = BiliClient.prefs.v291audioEQCustom291
    BiliClient.prefs.v291audioEQCustom291 = !current
    AppToast.show(this, "Audio EQ Custom291: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV291DanmakuBottomMaxCount389Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291danmakuBottomMaxCount389).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count389",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291danmakuBottomMaxCount389 = value
        AppToast.show(this, "Danmaku Bottom Max Count389: $value")
    }
}

internal fun PlayerActivity.showV291SubtitleBgBorder396Toggle() {
    val current = BiliClient.prefs.v291subtitleBgBorder396
    BiliClient.prefs.v291subtitleBgBorder396 = !current
    AppToast.show(this, "Subtitle Bg Border396: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV291GestureShakeAction291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291gestureShakeAction291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291gestureShakeAction291 = value
        AppToast.show(this, "Gesture Shake Action291: $value")
    }
}

internal fun PlayerActivity.showV291CastAudioVolume291Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v291castAudioVolume291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291castAudioVolume291 = value
        AppToast.show(this, "Cast Audio Volume291: $value")
    }
}

internal fun PlayerActivity.showV291PlaylistAutoSkipOutro291Toggle() {
    val current = BiliClient.prefs.v291playlistAutoSkipOutro291
    BiliClient.prefs.v291playlistAutoSkipOutro291 = !current
    AppToast.show(this, "Playlist Auto Skip Outro291: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV291CacheDownloadSpeed292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291cacheDownloadSpeed292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291cacheDownloadSpeed292 = value
        AppToast.show(this, "Cache Download Speed292: $value")
    }
}

internal fun PlayerActivity.showV291ProgressBarThumbBorder291Toggle() {
    val current = BiliClient.prefs.v291progressBarThumbBorder291
    BiliClient.prefs.v291progressBarThumbBorder291 = !current
    AppToast.show(this, "Progress Bar Thumb Border291: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV291VolumeBoostPeak291Toggle() {
    val current = BiliClient.prefs.v291volumeBoostPeak291
    BiliClient.prefs.v291volumeBoostPeak291 = !current
    AppToast.show(this, "Volume Boost Peak291: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV291HistoryBookmarkExport291Toggle() {
    val current = BiliClient.prefs.v291historyBookmarkExport291
    BiliClient.prefs.v291historyBookmarkExport291 = !current
    AppToast.show(this, "History Bookmark Export291: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV291PlaybackChapterSync291Toggle() {
    val current = BiliClient.prefs.v291playbackChapterSync291
    BiliClient.prefs.v291playbackChapterSync291 = !current
    AppToast.show(this, "Playback Chapter Sync291: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV291ScreenshotSavePath291Toggle() {
    val current = BiliClient.prefs.v291screenshotSavePath291
    BiliClient.prefs.v291screenshotSavePath291 = !current
    AppToast.show(this, "Screenshot Save Path291: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV291VideoColorSpace291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291videoColorSpace291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291videoColorSpace291 = value
        AppToast.show(this, "Video Color Space291: $value")
    }
}

internal fun PlayerActivity.showV291DanmakuBottomMaxCount390Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v291danmakuBottomMaxCount390).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count390",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v291danmakuBottomMaxCount390 = value
        AppToast.show(this, "Danmaku Bottom Max Count390: $value")
    }
}

internal fun PlayerActivity.showV291SubtitleBgBorder397Toggle() {
    val current = BiliClient.prefs.v291subtitleBgBorder397
    BiliClient.prefs.v291subtitleBgBorder397 = !current
    AppToast.show(this, "Subtitle Bg Border397: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV292AudioEQCustom292Toggle() {
    val current = BiliClient.prefs.v292audioEQCustom292
    BiliClient.prefs.v292audioEQCustom292 = !current
    AppToast.show(this, "Audio EQ Custom292: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV292DanmakuBottomMaxCount391Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292danmakuBottomMaxCount391).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count391",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292danmakuBottomMaxCount391 = value
        AppToast.show(this, "Danmaku Bottom Max Count391: $value")
    }
}

internal fun PlayerActivity.showV292SubtitleBgBorder398Toggle() {
    val current = BiliClient.prefs.v292subtitleBgBorder398
    BiliClient.prefs.v292subtitleBgBorder398 = !current
    AppToast.show(this, "Subtitle Bg Border398: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV292GestureShakeAction292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292gestureShakeAction292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292gestureShakeAction292 = value
        AppToast.show(this, "Gesture Shake Action292: $value")
    }
}

internal fun PlayerActivity.showV292CastAudioVolume292Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v292castAudioVolume292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292castAudioVolume292 = value
        AppToast.show(this, "Cast Audio Volume292: $value")
    }
}

internal fun PlayerActivity.showV292PlaylistAutoSkipOutro292Toggle() {
    val current = BiliClient.prefs.v292playlistAutoSkipOutro292
    BiliClient.prefs.v292playlistAutoSkipOutro292 = !current
    AppToast.show(this, "Playlist Auto Skip Outro292: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV292CacheDownloadSpeed293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292cacheDownloadSpeed293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292cacheDownloadSpeed293 = value
        AppToast.show(this, "Cache Download Speed293: $value")
    }
}

internal fun PlayerActivity.showV292ProgressBarThumbBorder292Toggle() {
    val current = BiliClient.prefs.v292progressBarThumbBorder292
    BiliClient.prefs.v292progressBarThumbBorder292 = !current
    AppToast.show(this, "Progress Bar Thumb Border292: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV292VolumeBoostPeak292Toggle() {
    val current = BiliClient.prefs.v292volumeBoostPeak292
    BiliClient.prefs.v292volumeBoostPeak292 = !current
    AppToast.show(this, "Volume Boost Peak292: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV292HistoryBookmarkExport292Toggle() {
    val current = BiliClient.prefs.v292historyBookmarkExport292
    BiliClient.prefs.v292historyBookmarkExport292 = !current
    AppToast.show(this, "History Bookmark Export292: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV292PlaybackChapterSync292Toggle() {
    val current = BiliClient.prefs.v292playbackChapterSync292
    BiliClient.prefs.v292playbackChapterSync292 = !current
    AppToast.show(this, "Playback Chapter Sync292: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV292ScreenshotSavePath292Toggle() {
    val current = BiliClient.prefs.v292screenshotSavePath292
    BiliClient.prefs.v292screenshotSavePath292 = !current
    AppToast.show(this, "Screenshot Save Path292: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV292VideoColorSpace292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292videoColorSpace292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292videoColorSpace292 = value
        AppToast.show(this, "Video Color Space292: $value")
    }
}

internal fun PlayerActivity.showV292DanmakuBottomMaxCount392Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v292danmakuBottomMaxCount392).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count392",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v292danmakuBottomMaxCount392 = value
        AppToast.show(this, "Danmaku Bottom Max Count392: $value")
    }
}

internal fun PlayerActivity.showV292SubtitleBgBorder399Toggle() {
    val current = BiliClient.prefs.v292subtitleBgBorder399
    BiliClient.prefs.v292subtitleBgBorder399 = !current
    AppToast.show(this, "Subtitle Bg Border399: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV293AudioEQCustom293Toggle() {
    val current = BiliClient.prefs.v293audioEQCustom293
    BiliClient.prefs.v293audioEQCustom293 = !current
    AppToast.show(this, "Audio EQ Custom293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV293DanmakuBottomMaxCount393Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293danmakuBottomMaxCount393).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count393",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293danmakuBottomMaxCount393 = value
        AppToast.show(this, "Danmaku Bottom Max Count393: $value")
    }
}

internal fun PlayerActivity.showV293SubtitleBgBorder400Toggle() {
    val current = BiliClient.prefs.v293subtitleBgBorder400
    BiliClient.prefs.v293subtitleBgBorder400 = !current
    AppToast.show(this, "Subtitle Bg Border400: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV293GestureShakeAction293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293gestureShakeAction293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293gestureShakeAction293 = value
        AppToast.show(this, "Gesture Shake Action293: $value")
    }
}

internal fun PlayerActivity.showV293CastAudioVolume293Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v293castAudioVolume293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293castAudioVolume293 = value
        AppToast.show(this, "Cast Audio Volume293: $value")
    }
}

internal fun PlayerActivity.showV293PlaylistAutoSkipOutro293Toggle() {
    val current = BiliClient.prefs.v293playlistAutoSkipOutro293
    BiliClient.prefs.v293playlistAutoSkipOutro293 = !current
    AppToast.show(this, "Playlist Auto Skip Outro293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV293CacheDownloadSpeed294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293cacheDownloadSpeed294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293cacheDownloadSpeed294 = value
        AppToast.show(this, "Cache Download Speed294: $value")
    }
}

internal fun PlayerActivity.showV293ProgressBarThumbBorder293Toggle() {
    val current = BiliClient.prefs.v293progressBarThumbBorder293
    BiliClient.prefs.v293progressBarThumbBorder293 = !current
    AppToast.show(this, "Progress Bar Thumb Border293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV293VolumeBoostPeak293Toggle() {
    val current = BiliClient.prefs.v293volumeBoostPeak293
    BiliClient.prefs.v293volumeBoostPeak293 = !current
    AppToast.show(this, "Volume Boost Peak293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV293HistoryBookmarkExport293Toggle() {
    val current = BiliClient.prefs.v293historyBookmarkExport293
    BiliClient.prefs.v293historyBookmarkExport293 = !current
    AppToast.show(this, "History Bookmark Export293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV293PlaybackChapterSync293Toggle() {
    val current = BiliClient.prefs.v293playbackChapterSync293
    BiliClient.prefs.v293playbackChapterSync293 = !current
    AppToast.show(this, "Playback Chapter Sync293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV293ScreenshotSavePath293Toggle() {
    val current = BiliClient.prefs.v293screenshotSavePath293
    BiliClient.prefs.v293screenshotSavePath293 = !current
    AppToast.show(this, "Screenshot Save Path293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV293VideoColorSpace293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293videoColorSpace293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293videoColorSpace293 = value
        AppToast.show(this, "Video Color Space293: $value")
    }
}

internal fun PlayerActivity.showV293DanmakuBottomMaxCount394Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v293danmakuBottomMaxCount394).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count394",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v293danmakuBottomMaxCount394 = value
        AppToast.show(this, "Danmaku Bottom Max Count394: $value")
    }
}

internal fun PlayerActivity.showV293SubtitleBgBorder401Toggle() {
    val current = BiliClient.prefs.v293subtitleBgBorder401
    BiliClient.prefs.v293subtitleBgBorder401 = !current
    AppToast.show(this, "Subtitle Bg Border401: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV294AudioEQCustom294Toggle() {
    val current = BiliClient.prefs.v294audioEQCustom294
    BiliClient.prefs.v294audioEQCustom294 = !current
    AppToast.show(this, "Audio EQ Custom294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV294DanmakuBottomMaxCount395Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294danmakuBottomMaxCount395).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count395",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294danmakuBottomMaxCount395 = value
        AppToast.show(this, "Danmaku Bottom Max Count395: $value")
    }
}

internal fun PlayerActivity.showV294SubtitleBgBorder402Toggle() {
    val current = BiliClient.prefs.v294subtitleBgBorder402
    BiliClient.prefs.v294subtitleBgBorder402 = !current
    AppToast.show(this, "Subtitle Bg Border402: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV294GestureShakeAction294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294gestureShakeAction294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294gestureShakeAction294 = value
        AppToast.show(this, "Gesture Shake Action294: $value")
    }
}

internal fun PlayerActivity.showV294CastAudioVolume294Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v294castAudioVolume294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294castAudioVolume294 = value
        AppToast.show(this, "Cast Audio Volume294: $value")
    }
}

internal fun PlayerActivity.showV294PlaylistAutoSkipOutro294Toggle() {
    val current = BiliClient.prefs.v294playlistAutoSkipOutro294
    BiliClient.prefs.v294playlistAutoSkipOutro294 = !current
    AppToast.show(this, "Playlist Auto Skip Outro294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV294CacheDownloadSpeed295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294cacheDownloadSpeed295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294cacheDownloadSpeed295 = value
        AppToast.show(this, "Cache Download Speed295: $value")
    }
}

internal fun PlayerActivity.showV294ProgressBarThumbBorder294Toggle() {
    val current = BiliClient.prefs.v294progressBarThumbBorder294
    BiliClient.prefs.v294progressBarThumbBorder294 = !current
    AppToast.show(this, "Progress Bar Thumb Border294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV294VolumeBoostPeak294Toggle() {
    val current = BiliClient.prefs.v294volumeBoostPeak294
    BiliClient.prefs.v294volumeBoostPeak294 = !current
    AppToast.show(this, "Volume Boost Peak294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV294HistoryBookmarkExport294Toggle() {
    val current = BiliClient.prefs.v294historyBookmarkExport294
    BiliClient.prefs.v294historyBookmarkExport294 = !current
    AppToast.show(this, "History Bookmark Export294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV294PlaybackChapterSync294Toggle() {
    val current = BiliClient.prefs.v294playbackChapterSync294
    BiliClient.prefs.v294playbackChapterSync294 = !current
    AppToast.show(this, "Playback Chapter Sync294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV294ScreenshotSavePath294Toggle() {
    val current = BiliClient.prefs.v294screenshotSavePath294
    BiliClient.prefs.v294screenshotSavePath294 = !current
    AppToast.show(this, "Screenshot Save Path294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV294VideoColorSpace294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294videoColorSpace294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294videoColorSpace294 = value
        AppToast.show(this, "Video Color Space294: $value")
    }
}

internal fun PlayerActivity.showV294DanmakuBottomMaxCount396Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v294danmakuBottomMaxCount396).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count396",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v294danmakuBottomMaxCount396 = value
        AppToast.show(this, "Danmaku Bottom Max Count396: $value")
    }
}

internal fun PlayerActivity.showV294SubtitleBgBorder403Toggle() {
    val current = BiliClient.prefs.v294subtitleBgBorder403
    BiliClient.prefs.v294subtitleBgBorder403 = !current
    AppToast.show(this, "Subtitle Bg Border403: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV295AudioEQCustom295Toggle() {
    val current = BiliClient.prefs.v295audioEQCustom295
    BiliClient.prefs.v295audioEQCustom295 = !current
    AppToast.show(this, "Audio EQ Custom295: ${if (!current) "ON" else "OFF"}")
}

