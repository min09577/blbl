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

internal fun PlayerActivity.showV295DanmakuBottomMaxCount397Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295danmakuBottomMaxCount397).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count397",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295danmakuBottomMaxCount397 = value
        AppToast.show(this, "Danmaku Bottom Max Count397: $value")
    }
}

internal fun PlayerActivity.showV295SubtitleBgBorder404Toggle() {
    val current = BiliClient.prefs.v295subtitleBgBorder404
    BiliClient.prefs.v295subtitleBgBorder404 = !current
    AppToast.show(this, "Subtitle Bg Border404: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV295GestureShakeAction295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295gestureShakeAction295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295gestureShakeAction295 = value
        AppToast.show(this, "Gesture Shake Action295: $value")
    }
}

internal fun PlayerActivity.showV295CastAudioVolume295Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v295castAudioVolume295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295castAudioVolume295 = value
        AppToast.show(this, "Cast Audio Volume295: $value")
    }
}

internal fun PlayerActivity.showV295PlaylistAutoSkipOutro295Toggle() {
    val current = BiliClient.prefs.v295playlistAutoSkipOutro295
    BiliClient.prefs.v295playlistAutoSkipOutro295 = !current
    AppToast.show(this, "Playlist Auto Skip Outro295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV295CacheDownloadSpeed296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295cacheDownloadSpeed296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295cacheDownloadSpeed296 = value
        AppToast.show(this, "Cache Download Speed296: $value")
    }
}

internal fun PlayerActivity.showV295ProgressBarThumbBorder295Toggle() {
    val current = BiliClient.prefs.v295progressBarThumbBorder295
    BiliClient.prefs.v295progressBarThumbBorder295 = !current
    AppToast.show(this, "Progress Bar Thumb Border295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV295VolumeBoostPeak295Toggle() {
    val current = BiliClient.prefs.v295volumeBoostPeak295
    BiliClient.prefs.v295volumeBoostPeak295 = !current
    AppToast.show(this, "Volume Boost Peak295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV295HistoryBookmarkExport295Toggle() {
    val current = BiliClient.prefs.v295historyBookmarkExport295
    BiliClient.prefs.v295historyBookmarkExport295 = !current
    AppToast.show(this, "History Bookmark Export295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV295PlaybackChapterSync295Toggle() {
    val current = BiliClient.prefs.v295playbackChapterSync295
    BiliClient.prefs.v295playbackChapterSync295 = !current
    AppToast.show(this, "Playback Chapter Sync295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV295ScreenshotSavePath295Toggle() {
    val current = BiliClient.prefs.v295screenshotSavePath295
    BiliClient.prefs.v295screenshotSavePath295 = !current
    AppToast.show(this, "Screenshot Save Path295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV295VideoColorSpace295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295videoColorSpace295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295videoColorSpace295 = value
        AppToast.show(this, "Video Color Space295: $value")
    }
}

internal fun PlayerActivity.showV295DanmakuBottomMaxCount398Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v295danmakuBottomMaxCount398).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count398",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v295danmakuBottomMaxCount398 = value
        AppToast.show(this, "Danmaku Bottom Max Count398: $value")
    }
}

internal fun PlayerActivity.showV295SubtitleBgBorder405Toggle() {
    val current = BiliClient.prefs.v295subtitleBgBorder405
    BiliClient.prefs.v295subtitleBgBorder405 = !current
    AppToast.show(this, "Subtitle Bg Border405: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV296AudioEQCustom296Toggle() {
    val current = BiliClient.prefs.v296audioEQCustom296
    BiliClient.prefs.v296audioEQCustom296 = !current
    AppToast.show(this, "Audio EQ Custom296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV296DanmakuBottomMaxCount399Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296danmakuBottomMaxCount399).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count399",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296danmakuBottomMaxCount399 = value
        AppToast.show(this, "Danmaku Bottom Max Count399: $value")
    }
}

internal fun PlayerActivity.showV296SubtitleBgBorder406Toggle() {
    val current = BiliClient.prefs.v296subtitleBgBorder406
    BiliClient.prefs.v296subtitleBgBorder406 = !current
    AppToast.show(this, "Subtitle Bg Border406: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV296GestureShakeAction296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296gestureShakeAction296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296gestureShakeAction296 = value
        AppToast.show(this, "Gesture Shake Action296: $value")
    }
}

internal fun PlayerActivity.showV296CastAudioVolume296Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v296castAudioVolume296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296castAudioVolume296 = value
        AppToast.show(this, "Cast Audio Volume296: $value")
    }
}

internal fun PlayerActivity.showV296PlaylistAutoSkipOutro296Toggle() {
    val current = BiliClient.prefs.v296playlistAutoSkipOutro296
    BiliClient.prefs.v296playlistAutoSkipOutro296 = !current
    AppToast.show(this, "Playlist Auto Skip Outro296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV296CacheDownloadSpeed297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296cacheDownloadSpeed297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296cacheDownloadSpeed297 = value
        AppToast.show(this, "Cache Download Speed297: $value")
    }
}

internal fun PlayerActivity.showV296ProgressBarThumbBorder296Toggle() {
    val current = BiliClient.prefs.v296progressBarThumbBorder296
    BiliClient.prefs.v296progressBarThumbBorder296 = !current
    AppToast.show(this, "Progress Bar Thumb Border296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV296VolumeBoostPeak296Toggle() {
    val current = BiliClient.prefs.v296volumeBoostPeak296
    BiliClient.prefs.v296volumeBoostPeak296 = !current
    AppToast.show(this, "Volume Boost Peak296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV296HistoryBookmarkExport296Toggle() {
    val current = BiliClient.prefs.v296historyBookmarkExport296
    BiliClient.prefs.v296historyBookmarkExport296 = !current
    AppToast.show(this, "History Bookmark Export296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV296PlaybackChapterSync296Toggle() {
    val current = BiliClient.prefs.v296playbackChapterSync296
    BiliClient.prefs.v296playbackChapterSync296 = !current
    AppToast.show(this, "Playback Chapter Sync296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV296ScreenshotSavePath296Toggle() {
    val current = BiliClient.prefs.v296screenshotSavePath296
    BiliClient.prefs.v296screenshotSavePath296 = !current
    AppToast.show(this, "Screenshot Save Path296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV296VideoColorSpace296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296videoColorSpace296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296videoColorSpace296 = value
        AppToast.show(this, "Video Color Space296: $value")
    }
}

internal fun PlayerActivity.showV296DanmakuBottomMaxCount400Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v296danmakuBottomMaxCount400).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count400",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v296danmakuBottomMaxCount400 = value
        AppToast.show(this, "Danmaku Bottom Max Count400: $value")
    }
}

internal fun PlayerActivity.showV296SubtitleBgBorder407Toggle() {
    val current = BiliClient.prefs.v296subtitleBgBorder407
    BiliClient.prefs.v296subtitleBgBorder407 = !current
    AppToast.show(this, "Subtitle Bg Border407: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV297AudioEQCustom297Toggle() {
    val current = BiliClient.prefs.v297audioEQCustom297
    BiliClient.prefs.v297audioEQCustom297 = !current
    AppToast.show(this, "Audio EQ Custom297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV297DanmakuBottomMaxCount401Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297danmakuBottomMaxCount401).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count401",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297danmakuBottomMaxCount401 = value
        AppToast.show(this, "Danmaku Bottom Max Count401: $value")
    }
}

internal fun PlayerActivity.showV297SubtitleBgBorder408Toggle() {
    val current = BiliClient.prefs.v297subtitleBgBorder408
    BiliClient.prefs.v297subtitleBgBorder408 = !current
    AppToast.show(this, "Subtitle Bg Border408: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV297GestureShakeAction297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297gestureShakeAction297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297gestureShakeAction297 = value
        AppToast.show(this, "Gesture Shake Action297: $value")
    }
}

internal fun PlayerActivity.showV297CastAudioVolume297Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v297castAudioVolume297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297castAudioVolume297 = value
        AppToast.show(this, "Cast Audio Volume297: $value")
    }
}

internal fun PlayerActivity.showV297PlaylistAutoSkipOutro297Toggle() {
    val current = BiliClient.prefs.v297playlistAutoSkipOutro297
    BiliClient.prefs.v297playlistAutoSkipOutro297 = !current
    AppToast.show(this, "Playlist Auto Skip Outro297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV297CacheDownloadSpeed298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297cacheDownloadSpeed298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297cacheDownloadSpeed298 = value
        AppToast.show(this, "Cache Download Speed298: $value")
    }
}

internal fun PlayerActivity.showV297ProgressBarThumbBorder297Toggle() {
    val current = BiliClient.prefs.v297progressBarThumbBorder297
    BiliClient.prefs.v297progressBarThumbBorder297 = !current
    AppToast.show(this, "Progress Bar Thumb Border297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV297VolumeBoostPeak297Toggle() {
    val current = BiliClient.prefs.v297volumeBoostPeak297
    BiliClient.prefs.v297volumeBoostPeak297 = !current
    AppToast.show(this, "Volume Boost Peak297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV297HistoryBookmarkExport297Toggle() {
    val current = BiliClient.prefs.v297historyBookmarkExport297
    BiliClient.prefs.v297historyBookmarkExport297 = !current
    AppToast.show(this, "History Bookmark Export297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV297PlaybackChapterSync297Toggle() {
    val current = BiliClient.prefs.v297playbackChapterSync297
    BiliClient.prefs.v297playbackChapterSync297 = !current
    AppToast.show(this, "Playback Chapter Sync297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV297ScreenshotSavePath297Toggle() {
    val current = BiliClient.prefs.v297screenshotSavePath297
    BiliClient.prefs.v297screenshotSavePath297 = !current
    AppToast.show(this, "Screenshot Save Path297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV297VideoColorSpace297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297videoColorSpace297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297videoColorSpace297 = value
        AppToast.show(this, "Video Color Space297: $value")
    }
}

internal fun PlayerActivity.showV297DanmakuBottomMaxCount402Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v297danmakuBottomMaxCount402).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count402",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v297danmakuBottomMaxCount402 = value
        AppToast.show(this, "Danmaku Bottom Max Count402: $value")
    }
}

internal fun PlayerActivity.showV297SubtitleBgBorder409Toggle() {
    val current = BiliClient.prefs.v297subtitleBgBorder409
    BiliClient.prefs.v297subtitleBgBorder409 = !current
    AppToast.show(this, "Subtitle Bg Border409: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV298AudioEQCustom298Toggle() {
    val current = BiliClient.prefs.v298audioEQCustom298
    BiliClient.prefs.v298audioEQCustom298 = !current
    AppToast.show(this, "Audio EQ Custom298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV298DanmakuBottomMaxCount403Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298danmakuBottomMaxCount403).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count403",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298danmakuBottomMaxCount403 = value
        AppToast.show(this, "Danmaku Bottom Max Count403: $value")
    }
}

internal fun PlayerActivity.showV298SubtitleBgBorder410Toggle() {
    val current = BiliClient.prefs.v298subtitleBgBorder410
    BiliClient.prefs.v298subtitleBgBorder410 = !current
    AppToast.show(this, "Subtitle Bg Border410: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV298GestureShakeAction298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298gestureShakeAction298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298gestureShakeAction298 = value
        AppToast.show(this, "Gesture Shake Action298: $value")
    }
}

internal fun PlayerActivity.showV298CastAudioVolume298Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v298castAudioVolume298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298castAudioVolume298 = value
        AppToast.show(this, "Cast Audio Volume298: $value")
    }
}

internal fun PlayerActivity.showV298PlaylistAutoSkipOutro298Toggle() {
    val current = BiliClient.prefs.v298playlistAutoSkipOutro298
    BiliClient.prefs.v298playlistAutoSkipOutro298 = !current
    AppToast.show(this, "Playlist Auto Skip Outro298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV298CacheDownloadSpeed299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298cacheDownloadSpeed299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298cacheDownloadSpeed299 = value
        AppToast.show(this, "Cache Download Speed299: $value")
    }
}

internal fun PlayerActivity.showV298ProgressBarThumbBorder298Toggle() {
    val current = BiliClient.prefs.v298progressBarThumbBorder298
    BiliClient.prefs.v298progressBarThumbBorder298 = !current
    AppToast.show(this, "Progress Bar Thumb Border298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV298VolumeBoostPeak298Toggle() {
    val current = BiliClient.prefs.v298volumeBoostPeak298
    BiliClient.prefs.v298volumeBoostPeak298 = !current
    AppToast.show(this, "Volume Boost Peak298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV298HistoryBookmarkExport298Toggle() {
    val current = BiliClient.prefs.v298historyBookmarkExport298
    BiliClient.prefs.v298historyBookmarkExport298 = !current
    AppToast.show(this, "History Bookmark Export298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV298PlaybackChapterSync298Toggle() {
    val current = BiliClient.prefs.v298playbackChapterSync298
    BiliClient.prefs.v298playbackChapterSync298 = !current
    AppToast.show(this, "Playback Chapter Sync298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV298ScreenshotSavePath298Toggle() {
    val current = BiliClient.prefs.v298screenshotSavePath298
    BiliClient.prefs.v298screenshotSavePath298 = !current
    AppToast.show(this, "Screenshot Save Path298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV298VideoColorSpace298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298videoColorSpace298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298videoColorSpace298 = value
        AppToast.show(this, "Video Color Space298: $value")
    }
}

internal fun PlayerActivity.showV298DanmakuBottomMaxCount404Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v298danmakuBottomMaxCount404).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count404",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v298danmakuBottomMaxCount404 = value
        AppToast.show(this, "Danmaku Bottom Max Count404: $value")
    }
}

internal fun PlayerActivity.showV298SubtitleBgBorder411Toggle() {
    val current = BiliClient.prefs.v298subtitleBgBorder411
    BiliClient.prefs.v298subtitleBgBorder411 = !current
    AppToast.show(this, "Subtitle Bg Border411: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV299AudioEQCustom299Toggle() {
    val current = BiliClient.prefs.v299audioEQCustom299
    BiliClient.prefs.v299audioEQCustom299 = !current
    AppToast.show(this, "Audio EQ Custom299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV299DanmakuBottomMaxCount405Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299danmakuBottomMaxCount405).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count405",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299danmakuBottomMaxCount405 = value
        AppToast.show(this, "Danmaku Bottom Max Count405: $value")
    }
}

internal fun PlayerActivity.showV299SubtitleBgBorder412Toggle() {
    val current = BiliClient.prefs.v299subtitleBgBorder412
    BiliClient.prefs.v299subtitleBgBorder412 = !current
    AppToast.show(this, "Subtitle Bg Border412: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV299GestureShakeAction299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299gestureShakeAction299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299gestureShakeAction299 = value
        AppToast.show(this, "Gesture Shake Action299: $value")
    }
}

internal fun PlayerActivity.showV299CastAudioVolume299Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v299castAudioVolume299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299castAudioVolume299 = value
        AppToast.show(this, "Cast Audio Volume299: $value")
    }
}

internal fun PlayerActivity.showV299PlaylistAutoSkipOutro299Toggle() {
    val current = BiliClient.prefs.v299playlistAutoSkipOutro299
    BiliClient.prefs.v299playlistAutoSkipOutro299 = !current
    AppToast.show(this, "Playlist Auto Skip Outro299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV299CacheDownloadSpeed300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299cacheDownloadSpeed300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299cacheDownloadSpeed300 = value
        AppToast.show(this, "Cache Download Speed300: $value")
    }
}

internal fun PlayerActivity.showV299ProgressBarThumbBorder299Toggle() {
    val current = BiliClient.prefs.v299progressBarThumbBorder299
    BiliClient.prefs.v299progressBarThumbBorder299 = !current
    AppToast.show(this, "Progress Bar Thumb Border299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV299VolumeBoostPeak299Toggle() {
    val current = BiliClient.prefs.v299volumeBoostPeak299
    BiliClient.prefs.v299volumeBoostPeak299 = !current
    AppToast.show(this, "Volume Boost Peak299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV299HistoryBookmarkExport299Toggle() {
    val current = BiliClient.prefs.v299historyBookmarkExport299
    BiliClient.prefs.v299historyBookmarkExport299 = !current
    AppToast.show(this, "History Bookmark Export299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV299PlaybackChapterSync299Toggle() {
    val current = BiliClient.prefs.v299playbackChapterSync299
    BiliClient.prefs.v299playbackChapterSync299 = !current
    AppToast.show(this, "Playback Chapter Sync299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV299ScreenshotSavePath299Toggle() {
    val current = BiliClient.prefs.v299screenshotSavePath299
    BiliClient.prefs.v299screenshotSavePath299 = !current
    AppToast.show(this, "Screenshot Save Path299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV299VideoColorSpace299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299videoColorSpace299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299videoColorSpace299 = value
        AppToast.show(this, "Video Color Space299: $value")
    }
}

internal fun PlayerActivity.showV299DanmakuBottomMaxCount406Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v299danmakuBottomMaxCount406).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count406",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v299danmakuBottomMaxCount406 = value
        AppToast.show(this, "Danmaku Bottom Max Count406: $value")
    }
}

internal fun PlayerActivity.showV299SubtitleBgBorder413Toggle() {
    val current = BiliClient.prefs.v299subtitleBgBorder413
    BiliClient.prefs.v299subtitleBgBorder413 = !current
    AppToast.show(this, "Subtitle Bg Border413: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV300AudioEQCustom300Toggle() {
    val current = BiliClient.prefs.v300audioEQCustom300
    BiliClient.prefs.v300audioEQCustom300 = !current
    AppToast.show(this, "Audio EQ Custom300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV300DanmakuBottomMaxCount407Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300danmakuBottomMaxCount407).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count407",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300danmakuBottomMaxCount407 = value
        AppToast.show(this, "Danmaku Bottom Max Count407: $value")
    }
}

internal fun PlayerActivity.showV300SubtitleBgBorder414Toggle() {
    val current = BiliClient.prefs.v300subtitleBgBorder414
    BiliClient.prefs.v300subtitleBgBorder414 = !current
    AppToast.show(this, "Subtitle Bg Border414: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV300GestureShakeAction300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300gestureShakeAction300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300gestureShakeAction300 = value
        AppToast.show(this, "Gesture Shake Action300: $value")
    }
}

internal fun PlayerActivity.showV300CastAudioVolume300Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v300castAudioVolume300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300castAudioVolume300 = value
        AppToast.show(this, "Cast Audio Volume300: $value")
    }
}

internal fun PlayerActivity.showV300PlaylistAutoSkipOutro300Toggle() {
    val current = BiliClient.prefs.v300playlistAutoSkipOutro300
    BiliClient.prefs.v300playlistAutoSkipOutro300 = !current
    AppToast.show(this, "Playlist Auto Skip Outro300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV300CacheDownloadSpeed301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300cacheDownloadSpeed301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300cacheDownloadSpeed301 = value
        AppToast.show(this, "Cache Download Speed301: $value")
    }
}

internal fun PlayerActivity.showV300ProgressBarThumbBorder300Toggle() {
    val current = BiliClient.prefs.v300progressBarThumbBorder300
    BiliClient.prefs.v300progressBarThumbBorder300 = !current
    AppToast.show(this, "Progress Bar Thumb Border300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV300VolumeBoostPeak300Toggle() {
    val current = BiliClient.prefs.v300volumeBoostPeak300
    BiliClient.prefs.v300volumeBoostPeak300 = !current
    AppToast.show(this, "Volume Boost Peak300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV300HistoryBookmarkExport300Toggle() {
    val current = BiliClient.prefs.v300historyBookmarkExport300
    BiliClient.prefs.v300historyBookmarkExport300 = !current
    AppToast.show(this, "History Bookmark Export300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV300PlaybackChapterSync300Toggle() {
    val current = BiliClient.prefs.v300playbackChapterSync300
    BiliClient.prefs.v300playbackChapterSync300 = !current
    AppToast.show(this, "Playback Chapter Sync300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV300ScreenshotSavePath300Toggle() {
    val current = BiliClient.prefs.v300screenshotSavePath300
    BiliClient.prefs.v300screenshotSavePath300 = !current
    AppToast.show(this, "Screenshot Save Path300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV300VideoColorSpace300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300videoColorSpace300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300videoColorSpace300 = value
        AppToast.show(this, "Video Color Space300: $value")
    }
}

internal fun PlayerActivity.showV300DanmakuBottomMaxCount408Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v300danmakuBottomMaxCount408).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count408",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v300danmakuBottomMaxCount408 = value
        AppToast.show(this, "Danmaku Bottom Max Count408: $value")
    }
}

internal fun PlayerActivity.showV300SubtitleBgBorder415Toggle() {
    val current = BiliClient.prefs.v300subtitleBgBorder415
    BiliClient.prefs.v300subtitleBgBorder415 = !current
    AppToast.show(this, "Subtitle Bg Border415: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV301AudioEQCustom301Toggle() {
    val current = BiliClient.prefs.v301audioEQCustom301
    BiliClient.prefs.v301audioEQCustom301 = !current
    AppToast.show(this, "Audio EQ Custom301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV301DanmakuBottomMaxCount409Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301danmakuBottomMaxCount409).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count409",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301danmakuBottomMaxCount409 = value
        AppToast.show(this, "Danmaku Bottom Max Count409: $value")
    }
}

internal fun PlayerActivity.showV301SubtitleBgBorder416Toggle() {
    val current = BiliClient.prefs.v301subtitleBgBorder416
    BiliClient.prefs.v301subtitleBgBorder416 = !current
    AppToast.show(this, "Subtitle Bg Border416: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV301GestureShakeAction301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301gestureShakeAction301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301gestureShakeAction301 = value
        AppToast.show(this, "Gesture Shake Action301: $value")
    }
}

internal fun PlayerActivity.showV301CastAudioVolume301Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v301castAudioVolume301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301castAudioVolume301 = value
        AppToast.show(this, "Cast Audio Volume301: $value")
    }
}

internal fun PlayerActivity.showV301PlaylistAutoSkipOutro301Toggle() {
    val current = BiliClient.prefs.v301playlistAutoSkipOutro301
    BiliClient.prefs.v301playlistAutoSkipOutro301 = !current
    AppToast.show(this, "Playlist Auto Skip Outro301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV301CacheDownloadSpeed302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301cacheDownloadSpeed302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301cacheDownloadSpeed302 = value
        AppToast.show(this, "Cache Download Speed302: $value")
    }
}

internal fun PlayerActivity.showV301ProgressBarThumbBorder301Toggle() {
    val current = BiliClient.prefs.v301progressBarThumbBorder301
    BiliClient.prefs.v301progressBarThumbBorder301 = !current
    AppToast.show(this, "Progress Bar Thumb Border301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV301VolumeBoostPeak301Toggle() {
    val current = BiliClient.prefs.v301volumeBoostPeak301
    BiliClient.prefs.v301volumeBoostPeak301 = !current
    AppToast.show(this, "Volume Boost Peak301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV301HistoryBookmarkExport301Toggle() {
    val current = BiliClient.prefs.v301historyBookmarkExport301
    BiliClient.prefs.v301historyBookmarkExport301 = !current
    AppToast.show(this, "History Bookmark Export301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV301PlaybackChapterSync301Toggle() {
    val current = BiliClient.prefs.v301playbackChapterSync301
    BiliClient.prefs.v301playbackChapterSync301 = !current
    AppToast.show(this, "Playback Chapter Sync301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV301ScreenshotSavePath301Toggle() {
    val current = BiliClient.prefs.v301screenshotSavePath301
    BiliClient.prefs.v301screenshotSavePath301 = !current
    AppToast.show(this, "Screenshot Save Path301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV301VideoColorSpace301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301videoColorSpace301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301videoColorSpace301 = value
        AppToast.show(this, "Video Color Space301: $value")
    }
}

internal fun PlayerActivity.showV301DanmakuBottomMaxCount410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v301danmakuBottomMaxCount410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v301danmakuBottomMaxCount410 = value
        AppToast.show(this, "Danmaku Bottom Max Count410: $value")
    }
}

internal fun PlayerActivity.showV301SubtitleBgBorder417Toggle() {
    val current = BiliClient.prefs.v301subtitleBgBorder417
    BiliClient.prefs.v301subtitleBgBorder417 = !current
    AppToast.show(this, "Subtitle Bg Border417: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV302AudioEQCustom302Toggle() {
    val current = BiliClient.prefs.v302audioEQCustom302
    BiliClient.prefs.v302audioEQCustom302 = !current
    AppToast.show(this, "Audio EQ Custom302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV302DanmakuBottomMaxCount411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302danmakuBottomMaxCount411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302danmakuBottomMaxCount411 = value
        AppToast.show(this, "Danmaku Bottom Max Count411: $value")
    }
}

internal fun PlayerActivity.showV302SubtitleBgBorder418Toggle() {
    val current = BiliClient.prefs.v302subtitleBgBorder418
    BiliClient.prefs.v302subtitleBgBorder418 = !current
    AppToast.show(this, "Subtitle Bg Border418: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV302GestureShakeAction302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302gestureShakeAction302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302gestureShakeAction302 = value
        AppToast.show(this, "Gesture Shake Action302: $value")
    }
}

internal fun PlayerActivity.showV302CastAudioVolume302Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v302castAudioVolume302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302castAudioVolume302 = value
        AppToast.show(this, "Cast Audio Volume302: $value")
    }
}

internal fun PlayerActivity.showV302PlaylistAutoSkipOutro302Toggle() {
    val current = BiliClient.prefs.v302playlistAutoSkipOutro302
    BiliClient.prefs.v302playlistAutoSkipOutro302 = !current
    AppToast.show(this, "Playlist Auto Skip Outro302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV302CacheDownloadSpeed303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302cacheDownloadSpeed303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302cacheDownloadSpeed303 = value
        AppToast.show(this, "Cache Download Speed303: $value")
    }
}

internal fun PlayerActivity.showV302ProgressBarThumbBorder302Toggle() {
    val current = BiliClient.prefs.v302progressBarThumbBorder302
    BiliClient.prefs.v302progressBarThumbBorder302 = !current
    AppToast.show(this, "Progress Bar Thumb Border302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV302VolumeBoostPeak302Toggle() {
    val current = BiliClient.prefs.v302volumeBoostPeak302
    BiliClient.prefs.v302volumeBoostPeak302 = !current
    AppToast.show(this, "Volume Boost Peak302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV302HistoryBookmarkExport302Toggle() {
    val current = BiliClient.prefs.v302historyBookmarkExport302
    BiliClient.prefs.v302historyBookmarkExport302 = !current
    AppToast.show(this, "History Bookmark Export302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV302PlaybackChapterSync302Toggle() {
    val current = BiliClient.prefs.v302playbackChapterSync302
    BiliClient.prefs.v302playbackChapterSync302 = !current
    AppToast.show(this, "Playback Chapter Sync302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV302ScreenshotSavePath302Toggle() {
    val current = BiliClient.prefs.v302screenshotSavePath302
    BiliClient.prefs.v302screenshotSavePath302 = !current
    AppToast.show(this, "Screenshot Save Path302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV302VideoColorSpace302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302videoColorSpace302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302videoColorSpace302 = value
        AppToast.show(this, "Video Color Space302: $value")
    }
}

internal fun PlayerActivity.showV302DanmakuBottomMaxCount412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v302danmakuBottomMaxCount412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v302danmakuBottomMaxCount412 = value
        AppToast.show(this, "Danmaku Bottom Max Count412: $value")
    }
}

internal fun PlayerActivity.showV302SubtitleBgBorder419Toggle() {
    val current = BiliClient.prefs.v302subtitleBgBorder419
    BiliClient.prefs.v302subtitleBgBorder419 = !current
    AppToast.show(this, "Subtitle Bg Border419: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV303AudioEQCustom303Toggle() {
    val current = BiliClient.prefs.v303audioEQCustom303
    BiliClient.prefs.v303audioEQCustom303 = !current
    AppToast.show(this, "Audio EQ Custom303: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV303DanmakuBottomMaxCount413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303danmakuBottomMaxCount413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303danmakuBottomMaxCount413 = value
        AppToast.show(this, "Danmaku Bottom Max Count413: $value")
    }
}

internal fun PlayerActivity.showV303SubtitleBgBorder420Toggle() {
    val current = BiliClient.prefs.v303subtitleBgBorder420
    BiliClient.prefs.v303subtitleBgBorder420 = !current
    AppToast.show(this, "Subtitle Bg Border420: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV303GestureShakeAction303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303gestureShakeAction303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303gestureShakeAction303 = value
        AppToast.show(this, "Gesture Shake Action303: $value")
    }
}

internal fun PlayerActivity.showV303CastAudioVolume303Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v303castAudioVolume303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303castAudioVolume303 = value
        AppToast.show(this, "Cast Audio Volume303: $value")
    }
}

internal fun PlayerActivity.showV303PlaylistAutoSkipOutro303Toggle() {
    val current = BiliClient.prefs.v303playlistAutoSkipOutro303
    BiliClient.prefs.v303playlistAutoSkipOutro303 = !current
    AppToast.show(this, "Playlist Auto Skip Outro303: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV303CacheDownloadSpeed304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303cacheDownloadSpeed304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303cacheDownloadSpeed304 = value
        AppToast.show(this, "Cache Download Speed304: $value")
    }
}

internal fun PlayerActivity.showV303ProgressBarThumbBorder303Toggle() {
    val current = BiliClient.prefs.v303progressBarThumbBorder303
    BiliClient.prefs.v303progressBarThumbBorder303 = !current
    AppToast.show(this, "Progress Bar Thumb Border303: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV303VolumeBoostPeak303Toggle() {
    val current = BiliClient.prefs.v303volumeBoostPeak303
    BiliClient.prefs.v303volumeBoostPeak303 = !current
    AppToast.show(this, "Volume Boost Peak303: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV303HistoryBookmarkExport303Toggle() {
    val current = BiliClient.prefs.v303historyBookmarkExport303
    BiliClient.prefs.v303historyBookmarkExport303 = !current
    AppToast.show(this, "History Bookmark Export303: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV303PlaybackChapterSync303Toggle() {
    val current = BiliClient.prefs.v303playbackChapterSync303
    BiliClient.prefs.v303playbackChapterSync303 = !current
    AppToast.show(this, "Playback Chapter Sync303: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV303ScreenshotSavePath303Toggle() {
    val current = BiliClient.prefs.v303screenshotSavePath303
    BiliClient.prefs.v303screenshotSavePath303 = !current
    AppToast.show(this, "Screenshot Save Path303: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV303VideoColorSpace303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303videoColorSpace303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303videoColorSpace303 = value
        AppToast.show(this, "Video Color Space303: $value")
    }
}

internal fun PlayerActivity.showV303DanmakuBottomMaxCount414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303danmakuBottomMaxCount414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303danmakuBottomMaxCount414 = value
        AppToast.show(this, "Danmaku Bottom Max Count414: $value")
    }
}

internal fun PlayerActivity.showV303SubtitleBgBorder421Toggle() {
    val current = BiliClient.prefs.v303subtitleBgBorder421
    BiliClient.prefs.v303subtitleBgBorder421 = !current
    AppToast.show(this, "Subtitle Bg Border421: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV304AudioEQCustom304Toggle() {
    val current = BiliClient.prefs.v304audioEQCustom304
    BiliClient.prefs.v304audioEQCustom304 = !current
    AppToast.show(this, "Audio EQ Custom304: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV304DanmakuBottomMaxCount415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304danmakuBottomMaxCount415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304danmakuBottomMaxCount415 = value
        AppToast.show(this, "Danmaku Bottom Max Count415: $value")
    }
}

internal fun PlayerActivity.showV304SubtitleBgBorder422Toggle() {
    val current = BiliClient.prefs.v304subtitleBgBorder422
    BiliClient.prefs.v304subtitleBgBorder422 = !current
    AppToast.show(this, "Subtitle Bg Border422: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV304GestureShakeAction304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304gestureShakeAction304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304gestureShakeAction304 = value
        AppToast.show(this, "Gesture Shake Action304: $value")
    }
}

internal fun PlayerActivity.showV304CastAudioVolume304Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v304castAudioVolume304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304castAudioVolume304 = value
        AppToast.show(this, "Cast Audio Volume304: $value")
    }
}

internal fun PlayerActivity.showV304PlaylistAutoSkipOutro304Toggle() {
    val current = BiliClient.prefs.v304playlistAutoSkipOutro304
    BiliClient.prefs.v304playlistAutoSkipOutro304 = !current
    AppToast.show(this, "Playlist Auto Skip Outro304: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV304CacheDownloadSpeed305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304cacheDownloadSpeed305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304cacheDownloadSpeed305 = value
        AppToast.show(this, "Cache Download Speed305: $value")
    }
}

internal fun PlayerActivity.showV304ProgressBarThumbBorder304Toggle() {
    val current = BiliClient.prefs.v304progressBarThumbBorder304
    BiliClient.prefs.v304progressBarThumbBorder304 = !current
    AppToast.show(this, "Progress Bar Thumb Border304: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV304VolumeBoostPeak304Toggle() {
    val current = BiliClient.prefs.v304volumeBoostPeak304
    BiliClient.prefs.v304volumeBoostPeak304 = !current
    AppToast.show(this, "Volume Boost Peak304: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV304HistoryBookmarkExport304Toggle() {
    val current = BiliClient.prefs.v304historyBookmarkExport304
    BiliClient.prefs.v304historyBookmarkExport304 = !current
    AppToast.show(this, "History Bookmark Export304: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV304PlaybackChapterSync304Toggle() {
    val current = BiliClient.prefs.v304playbackChapterSync304
    BiliClient.prefs.v304playbackChapterSync304 = !current
    AppToast.show(this, "Playback Chapter Sync304: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV304ScreenshotSavePath304Toggle() {
    val current = BiliClient.prefs.v304screenshotSavePath304
    BiliClient.prefs.v304screenshotSavePath304 = !current
    AppToast.show(this, "Screenshot Save Path304: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV304VideoColorSpace304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304videoColorSpace304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304videoColorSpace304 = value
        AppToast.show(this, "Video Color Space304: $value")
    }
}

internal fun PlayerActivity.showV304DanmakuBottomMaxCount416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304danmakuBottomMaxCount416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304danmakuBottomMaxCount416 = value
        AppToast.show(this, "Danmaku Bottom Max Count416: $value")
    }
}

internal fun PlayerActivity.showV304SubtitleBgBorder423Toggle() {
    val current = BiliClient.prefs.v304subtitleBgBorder423
    BiliClient.prefs.v304subtitleBgBorder423 = !current
    AppToast.show(this, "Subtitle Bg Border423: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV305AudioEQCustom305Toggle() {
    val current = BiliClient.prefs.v305audioEQCustom305
    BiliClient.prefs.v305audioEQCustom305 = !current
    AppToast.show(this, "Audio EQ Custom305: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV305DanmakuBottomMaxCount417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305danmakuBottomMaxCount417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305danmakuBottomMaxCount417 = value
        AppToast.show(this, "Danmaku Bottom Max Count417: $value")
    }
}

internal fun PlayerActivity.showV305SubtitleBgBorder424Toggle() {
    val current = BiliClient.prefs.v305subtitleBgBorder424
    BiliClient.prefs.v305subtitleBgBorder424 = !current
    AppToast.show(this, "Subtitle Bg Border424: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV305GestureShakeAction305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305gestureShakeAction305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305gestureShakeAction305 = value
        AppToast.show(this, "Gesture Shake Action305: $value")
    }
}

internal fun PlayerActivity.showV305CastAudioVolume305Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v305castAudioVolume305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305castAudioVolume305 = value
        AppToast.show(this, "Cast Audio Volume305: $value")
    }
}

internal fun PlayerActivity.showV305PlaylistAutoSkipOutro305Toggle() {
    val current = BiliClient.prefs.v305playlistAutoSkipOutro305
    BiliClient.prefs.v305playlistAutoSkipOutro305 = !current
    AppToast.show(this, "Playlist Auto Skip Outro305: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV305CacheDownloadSpeed306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305cacheDownloadSpeed306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305cacheDownloadSpeed306 = value
        AppToast.show(this, "Cache Download Speed306: $value")
    }
}

internal fun PlayerActivity.showV305ProgressBarThumbBorder305Toggle() {
    val current = BiliClient.prefs.v305progressBarThumbBorder305
    BiliClient.prefs.v305progressBarThumbBorder305 = !current
    AppToast.show(this, "Progress Bar Thumb Border305: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV305VolumeBoostPeak305Toggle() {
    val current = BiliClient.prefs.v305volumeBoostPeak305
    BiliClient.prefs.v305volumeBoostPeak305 = !current
    AppToast.show(this, "Volume Boost Peak305: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV305HistoryBookmarkExport305Toggle() {
    val current = BiliClient.prefs.v305historyBookmarkExport305
    BiliClient.prefs.v305historyBookmarkExport305 = !current
    AppToast.show(this, "History Bookmark Export305: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV305PlaybackChapterSync305Toggle() {
    val current = BiliClient.prefs.v305playbackChapterSync305
    BiliClient.prefs.v305playbackChapterSync305 = !current
    AppToast.show(this, "Playback Chapter Sync305: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV305ScreenshotSavePath305Toggle() {
    val current = BiliClient.prefs.v305screenshotSavePath305
    BiliClient.prefs.v305screenshotSavePath305 = !current
    AppToast.show(this, "Screenshot Save Path305: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV305VideoColorSpace305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305videoColorSpace305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305videoColorSpace305 = value
        AppToast.show(this, "Video Color Space305: $value")
    }
}

internal fun PlayerActivity.showV305DanmakuBottomMaxCount418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305danmakuBottomMaxCount418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305danmakuBottomMaxCount418 = value
        AppToast.show(this, "Danmaku Bottom Max Count418: $value")
    }
}

internal fun PlayerActivity.showV305SubtitleBgBorder425Toggle() {
    val current = BiliClient.prefs.v305subtitleBgBorder425
    BiliClient.prefs.v305subtitleBgBorder425 = !current
    AppToast.show(this, "Subtitle Bg Border425: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV306AudioEQCustom306Toggle() {
    val current = BiliClient.prefs.v306audioEQCustom306
    BiliClient.prefs.v306audioEQCustom306 = !current
    AppToast.show(this, "Audio EQ Custom306: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV306DanmakuBottomMaxCount419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306danmakuBottomMaxCount419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306danmakuBottomMaxCount419 = value
        AppToast.show(this, "Danmaku Bottom Max Count419: $value")
    }
}

internal fun PlayerActivity.showV306SubtitleBgBorder426Toggle() {
    val current = BiliClient.prefs.v306subtitleBgBorder426
    BiliClient.prefs.v306subtitleBgBorder426 = !current
    AppToast.show(this, "Subtitle Bg Border426: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV306GestureShakeAction306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306gestureShakeAction306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306gestureShakeAction306 = value
        AppToast.show(this, "Gesture Shake Action306: $value")
    }
}

internal fun PlayerActivity.showV306CastAudioVolume306Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v306castAudioVolume306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306castAudioVolume306 = value
        AppToast.show(this, "Cast Audio Volume306: $value")
    }
}

internal fun PlayerActivity.showV306PlaylistAutoSkipOutro306Toggle() {
    val current = BiliClient.prefs.v306playlistAutoSkipOutro306
    BiliClient.prefs.v306playlistAutoSkipOutro306 = !current
    AppToast.show(this, "Playlist Auto Skip Outro306: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV306CacheDownloadSpeed307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306cacheDownloadSpeed307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306cacheDownloadSpeed307 = value
        AppToast.show(this, "Cache Download Speed307: $value")
    }
}

internal fun PlayerActivity.showV306ProgressBarThumbBorder306Toggle() {
    val current = BiliClient.prefs.v306progressBarThumbBorder306
    BiliClient.prefs.v306progressBarThumbBorder306 = !current
    AppToast.show(this, "Progress Bar Thumb Border306: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV306VolumeBoostPeak306Toggle() {
    val current = BiliClient.prefs.v306volumeBoostPeak306
    BiliClient.prefs.v306volumeBoostPeak306 = !current
    AppToast.show(this, "Volume Boost Peak306: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV306HistoryBookmarkExport306Toggle() {
    val current = BiliClient.prefs.v306historyBookmarkExport306
    BiliClient.prefs.v306historyBookmarkExport306 = !current
    AppToast.show(this, "History Bookmark Export306: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV306PlaybackChapterSync306Toggle() {
    val current = BiliClient.prefs.v306playbackChapterSync306
    BiliClient.prefs.v306playbackChapterSync306 = !current
    AppToast.show(this, "Playback Chapter Sync306: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV306ScreenshotSavePath306Toggle() {
    val current = BiliClient.prefs.v306screenshotSavePath306
    BiliClient.prefs.v306screenshotSavePath306 = !current
    AppToast.show(this, "Screenshot Save Path306: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV306VideoColorSpace306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306videoColorSpace306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306videoColorSpace306 = value
        AppToast.show(this, "Video Color Space306: $value")
    }
}

internal fun PlayerActivity.showV306DanmakuBottomMaxCount420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306danmakuBottomMaxCount420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306danmakuBottomMaxCount420 = value
        AppToast.show(this, "Danmaku Bottom Max Count420: $value")
    }
}

internal fun PlayerActivity.showV306SubtitleBgBorder427Toggle() {
    val current = BiliClient.prefs.v306subtitleBgBorder427
    BiliClient.prefs.v306subtitleBgBorder427 = !current
    AppToast.show(this, "Subtitle Bg Border427: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV307AudioEQCustom307Toggle() {
    val current = BiliClient.prefs.v307audioEQCustom307
    BiliClient.prefs.v307audioEQCustom307 = !current
    AppToast.show(this, "Audio EQ Custom307: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV307DanmakuBottomMaxCount421Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307danmakuBottomMaxCount421).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count421",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307danmakuBottomMaxCount421 = value
        AppToast.show(this, "Danmaku Bottom Max Count421: $value")
    }
}

internal fun PlayerActivity.showV307SubtitleBgBorder428Toggle() {
    val current = BiliClient.prefs.v307subtitleBgBorder428
    BiliClient.prefs.v307subtitleBgBorder428 = !current
    AppToast.show(this, "Subtitle Bg Border428: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV307GestureShakeAction307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307gestureShakeAction307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307gestureShakeAction307 = value
        AppToast.show(this, "Gesture Shake Action307: $value")
    }
}

internal fun PlayerActivity.showV307CastAudioVolume307Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v307castAudioVolume307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307castAudioVolume307 = value
        AppToast.show(this, "Cast Audio Volume307: $value")
    }
}

internal fun PlayerActivity.showV307PlaylistAutoSkipOutro307Toggle() {
    val current = BiliClient.prefs.v307playlistAutoSkipOutro307
    BiliClient.prefs.v307playlistAutoSkipOutro307 = !current
    AppToast.show(this, "Playlist Auto Skip Outro307: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV307CacheDownloadSpeed308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307cacheDownloadSpeed308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307cacheDownloadSpeed308 = value
        AppToast.show(this, "Cache Download Speed308: $value")
    }
}

internal fun PlayerActivity.showV307ProgressBarThumbBorder307Toggle() {
    val current = BiliClient.prefs.v307progressBarThumbBorder307
    BiliClient.prefs.v307progressBarThumbBorder307 = !current
    AppToast.show(this, "Progress Bar Thumb Border307: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV307VolumeBoostPeak307Toggle() {
    val current = BiliClient.prefs.v307volumeBoostPeak307
    BiliClient.prefs.v307volumeBoostPeak307 = !current
    AppToast.show(this, "Volume Boost Peak307: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV307HistoryBookmarkExport307Toggle() {
    val current = BiliClient.prefs.v307historyBookmarkExport307
    BiliClient.prefs.v307historyBookmarkExport307 = !current
    AppToast.show(this, "History Bookmark Export307: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV307PlaybackChapterSync307Toggle() {
    val current = BiliClient.prefs.v307playbackChapterSync307
    BiliClient.prefs.v307playbackChapterSync307 = !current
    AppToast.show(this, "Playback Chapter Sync307: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV307ScreenshotSavePath307Toggle() {
    val current = BiliClient.prefs.v307screenshotSavePath307
    BiliClient.prefs.v307screenshotSavePath307 = !current
    AppToast.show(this, "Screenshot Save Path307: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV307VideoColorSpace307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307videoColorSpace307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307videoColorSpace307 = value
        AppToast.show(this, "Video Color Space307: $value")
    }
}

internal fun PlayerActivity.showV307DanmakuBottomMaxCount422Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307danmakuBottomMaxCount422).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count422",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307danmakuBottomMaxCount422 = value
        AppToast.show(this, "Danmaku Bottom Max Count422: $value")
    }
}

internal fun PlayerActivity.showV307SubtitleBgBorder429Toggle() {
    val current = BiliClient.prefs.v307subtitleBgBorder429
    BiliClient.prefs.v307subtitleBgBorder429 = !current
    AppToast.show(this, "Subtitle Bg Border429: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV308AudioEQCustom308Toggle() {
    val current = BiliClient.prefs.v308audioEQCustom308
    BiliClient.prefs.v308audioEQCustom308 = !current
    AppToast.show(this, "Audio EQ Custom308: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV308DanmakuBottomMaxCount423Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308danmakuBottomMaxCount423).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count423",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308danmakuBottomMaxCount423 = value
        AppToast.show(this, "Danmaku Bottom Max Count423: $value")
    }
}

internal fun PlayerActivity.showV308SubtitleBgBorder430Toggle() {
    val current = BiliClient.prefs.v308subtitleBgBorder430
    BiliClient.prefs.v308subtitleBgBorder430 = !current
    AppToast.show(this, "Subtitle Bg Border430: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV308GestureShakeAction308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308gestureShakeAction308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308gestureShakeAction308 = value
        AppToast.show(this, "Gesture Shake Action308: $value")
    }
}

internal fun PlayerActivity.showV308CastAudioVolume308Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v308castAudioVolume308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308castAudioVolume308 = value
        AppToast.show(this, "Cast Audio Volume308: $value")
    }
}

internal fun PlayerActivity.showV308PlaylistAutoSkipOutro308Toggle() {
    val current = BiliClient.prefs.v308playlistAutoSkipOutro308
    BiliClient.prefs.v308playlistAutoSkipOutro308 = !current
    AppToast.show(this, "Playlist Auto Skip Outro308: ${if (!current) "ON" else "OFF"}")
}

