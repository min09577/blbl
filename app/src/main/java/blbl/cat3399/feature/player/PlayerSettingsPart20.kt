package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v276: Volume Boost Peak276
internal fun PlayerActivity.showV276VolumeBoostPeak276Toggle() {
    val current = BiliClient.prefs.v276volumeBoostPeak276
    BiliClient.prefs.v276volumeBoostPeak276 = !current
    AppToast.show(this, "Volume Boost Peak276: ${if (!current) "ON" else "OFF"}")
}

// v276: History Bookmark Export276
internal fun PlayerActivity.showV276HistoryBookmarkExport276Toggle() {
    val current = BiliClient.prefs.v276historyBookmarkExport276
    BiliClient.prefs.v276historyBookmarkExport276 = !current
    AppToast.show(this, "History Bookmark Export276: ${if (!current) "ON" else "OFF"}")
}

// v276: Playback Chapter Sync276
internal fun PlayerActivity.showV276PlaybackChapterSync276Toggle() {
    val current = BiliClient.prefs.v276playbackChapterSync276
    BiliClient.prefs.v276playbackChapterSync276 = !current
    AppToast.show(this, "Playback Chapter Sync276: ${if (!current) "ON" else "OFF"}")
}

// v276: Screenshot Save Path276
internal fun PlayerActivity.showV276ScreenshotSavePath276Toggle() {
    val current = BiliClient.prefs.v276screenshotSavePath276
    BiliClient.prefs.v276screenshotSavePath276 = !current
    AppToast.show(this, "Screenshot Save Path276: ${if (!current) "ON" else "OFF"}")
}

// v276: Video Color Space276
internal fun PlayerActivity.showV276VideoColorSpace276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276videoColorSpace276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276videoColorSpace276 = value
        AppToast.show(this, "Video Color Space276: $value")
    }
}

// v276: Danmaku Bottom Max Count360
internal fun PlayerActivity.showV276DanmakuBottomMaxCount360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276danmakuBottomMaxCount360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276danmakuBottomMaxCount360 = value
        AppToast.show(this, "Danmaku Bottom Max Count360: $value")
    }
}

// v276: Subtitle Bg Border367
internal fun PlayerActivity.showV276SubtitleBgBorder367Toggle() {
    val current = BiliClient.prefs.v276subtitleBgBorder367
    BiliClient.prefs.v276subtitleBgBorder367 = !current
    AppToast.show(this, "Subtitle Bg Border367: ${if (!current) "ON" else "OFF"}")
}

// v277: Audio EQ Custom277
internal fun PlayerActivity.showV277AudioEQCustom277Toggle() {
    val current = BiliClient.prefs.v277audioEQCustom277
    BiliClient.prefs.v277audioEQCustom277 = !current
    AppToast.show(this, "Audio EQ Custom277: ${if (!current) "ON" else "OFF"}")
}

// v277: Danmaku Bottom Max Count361
internal fun PlayerActivity.showV277DanmakuBottomMaxCount361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277danmakuBottomMaxCount361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277danmakuBottomMaxCount361 = value
        AppToast.show(this, "Danmaku Bottom Max Count361: $value")
    }
}

// v277: Subtitle Bg Border368
internal fun PlayerActivity.showV277SubtitleBgBorder368Toggle() {
    val current = BiliClient.prefs.v277subtitleBgBorder368
    BiliClient.prefs.v277subtitleBgBorder368 = !current
    AppToast.show(this, "Subtitle Bg Border368: ${if (!current) "ON" else "OFF"}")
}

// v277: Gesture Shake Action277
internal fun PlayerActivity.showV277GestureShakeAction277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277gestureShakeAction277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277gestureShakeAction277 = value
        AppToast.show(this, "Gesture Shake Action277: $value")
    }
}

// v277: Cast Audio Volume277
internal fun PlayerActivity.showV277CastAudioVolume277Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v277castAudioVolume277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277castAudioVolume277 = value
        AppToast.show(this, "Cast Audio Volume277: $value")
    }
}

// v277: Playlist Auto Skip Outro277
internal fun PlayerActivity.showV277PlaylistAutoSkipOutro277Toggle() {
    val current = BiliClient.prefs.v277playlistAutoSkipOutro277
    BiliClient.prefs.v277playlistAutoSkipOutro277 = !current
    AppToast.show(this, "Playlist Auto Skip Outro277: ${if (!current) "ON" else "OFF"}")
}

// v277: Cache Download Speed278
internal fun PlayerActivity.showV277CacheDownloadSpeed278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277cacheDownloadSpeed278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277cacheDownloadSpeed278 = value
        AppToast.show(this, "Cache Download Speed278: $value")
    }
}

// v277: Progress Bar Thumb Border277
internal fun PlayerActivity.showV277ProgressBarThumbBorder277Toggle() {
    val current = BiliClient.prefs.v277progressBarThumbBorder277
    BiliClient.prefs.v277progressBarThumbBorder277 = !current
    AppToast.show(this, "Progress Bar Thumb Border277: ${if (!current) "ON" else "OFF"}")
}

// v277: Volume Boost Peak277
internal fun PlayerActivity.showV277VolumeBoostPeak277Toggle() {
    val current = BiliClient.prefs.v277volumeBoostPeak277
    BiliClient.prefs.v277volumeBoostPeak277 = !current
    AppToast.show(this, "Volume Boost Peak277: ${if (!current) "ON" else "OFF"}")
}

// v277: History Bookmark Export277
internal fun PlayerActivity.showV277HistoryBookmarkExport277Toggle() {
    val current = BiliClient.prefs.v277historyBookmarkExport277
    BiliClient.prefs.v277historyBookmarkExport277 = !current
    AppToast.show(this, "History Bookmark Export277: ${if (!current) "ON" else "OFF"}")
}

// v277: Playback Chapter Sync277
internal fun PlayerActivity.showV277PlaybackChapterSync277Toggle() {
    val current = BiliClient.prefs.v277playbackChapterSync277
    BiliClient.prefs.v277playbackChapterSync277 = !current
    AppToast.show(this, "Playback Chapter Sync277: ${if (!current) "ON" else "OFF"}")
}

// v277: Screenshot Save Path277
internal fun PlayerActivity.showV277ScreenshotSavePath277Toggle() {
    val current = BiliClient.prefs.v277screenshotSavePath277
    BiliClient.prefs.v277screenshotSavePath277 = !current
    AppToast.show(this, "Screenshot Save Path277: ${if (!current) "ON" else "OFF"}")
}

// v277: Video Color Space277
internal fun PlayerActivity.showV277VideoColorSpace277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277videoColorSpace277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277videoColorSpace277 = value
        AppToast.show(this, "Video Color Space277: $value")
    }
}

// v277: Danmaku Bottom Max Count362
internal fun PlayerActivity.showV277DanmakuBottomMaxCount362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277danmakuBottomMaxCount362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277danmakuBottomMaxCount362 = value
        AppToast.show(this, "Danmaku Bottom Max Count362: $value")
    }
}

// v277: Subtitle Bg Border369
internal fun PlayerActivity.showV277SubtitleBgBorder369Toggle() {
    val current = BiliClient.prefs.v277subtitleBgBorder369
    BiliClient.prefs.v277subtitleBgBorder369 = !current
    AppToast.show(this, "Subtitle Bg Border369: ${if (!current) "ON" else "OFF"}")
}

// v278: Audio EQ Custom278
internal fun PlayerActivity.showV278AudioEQCustom278Toggle() {
    val current = BiliClient.prefs.v278audioEQCustom278
    BiliClient.prefs.v278audioEQCustom278 = !current
    AppToast.show(this, "Audio EQ Custom278: ${if (!current) "ON" else "OFF"}")
}

// v278: Danmaku Bottom Max Count363
internal fun PlayerActivity.showV278DanmakuBottomMaxCount363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278danmakuBottomMaxCount363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278danmakuBottomMaxCount363 = value
        AppToast.show(this, "Danmaku Bottom Max Count363: $value")
    }
}

// v278: Subtitle Bg Border370
internal fun PlayerActivity.showV278SubtitleBgBorder370Toggle() {
    val current = BiliClient.prefs.v278subtitleBgBorder370
    BiliClient.prefs.v278subtitleBgBorder370 = !current
    AppToast.show(this, "Subtitle Bg Border370: ${if (!current) "ON" else "OFF"}")
}

// v278: Gesture Shake Action278
internal fun PlayerActivity.showV278GestureShakeAction278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278gestureShakeAction278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278gestureShakeAction278 = value
        AppToast.show(this, "Gesture Shake Action278: $value")
    }
}

// v278: Cast Audio Volume278
internal fun PlayerActivity.showV278CastAudioVolume278Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v278castAudioVolume278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278castAudioVolume278 = value
        AppToast.show(this, "Cast Audio Volume278: $value")
    }
}

// v278: Playlist Auto Skip Outro278
internal fun PlayerActivity.showV278PlaylistAutoSkipOutro278Toggle() {
    val current = BiliClient.prefs.v278playlistAutoSkipOutro278
    BiliClient.prefs.v278playlistAutoSkipOutro278 = !current
    AppToast.show(this, "Playlist Auto Skip Outro278: ${if (!current) "ON" else "OFF"}")
}

// v278: Cache Download Speed279
internal fun PlayerActivity.showV278CacheDownloadSpeed279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278cacheDownloadSpeed279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278cacheDownloadSpeed279 = value
        AppToast.show(this, "Cache Download Speed279: $value")
    }
}

// v278: Progress Bar Thumb Border278
internal fun PlayerActivity.showV278ProgressBarThumbBorder278Toggle() {
    val current = BiliClient.prefs.v278progressBarThumbBorder278
    BiliClient.prefs.v278progressBarThumbBorder278 = !current
    AppToast.show(this, "Progress Bar Thumb Border278: ${if (!current) "ON" else "OFF"}")
}

// v278: Volume Boost Peak278
internal fun PlayerActivity.showV278VolumeBoostPeak278Toggle() {
    val current = BiliClient.prefs.v278volumeBoostPeak278
    BiliClient.prefs.v278volumeBoostPeak278 = !current
    AppToast.show(this, "Volume Boost Peak278: ${if (!current) "ON" else "OFF"}")
}

// v278: History Bookmark Export278
internal fun PlayerActivity.showV278HistoryBookmarkExport278Toggle() {
    val current = BiliClient.prefs.v278historyBookmarkExport278
    BiliClient.prefs.v278historyBookmarkExport278 = !current
    AppToast.show(this, "History Bookmark Export278: ${if (!current) "ON" else "OFF"}")
}

// v278: Playback Chapter Sync278
internal fun PlayerActivity.showV278PlaybackChapterSync278Toggle() {
    val current = BiliClient.prefs.v278playbackChapterSync278
    BiliClient.prefs.v278playbackChapterSync278 = !current
    AppToast.show(this, "Playback Chapter Sync278: ${if (!current) "ON" else "OFF"}")
}

// v278: Screenshot Save Path278
internal fun PlayerActivity.showV278ScreenshotSavePath278Toggle() {
    val current = BiliClient.prefs.v278screenshotSavePath278
    BiliClient.prefs.v278screenshotSavePath278 = !current
    AppToast.show(this, "Screenshot Save Path278: ${if (!current) "ON" else "OFF"}")
}

// v278: Video Color Space278
internal fun PlayerActivity.showV278VideoColorSpace278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278videoColorSpace278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278videoColorSpace278 = value
        AppToast.show(this, "Video Color Space278: $value")
    }
}

// v278: Danmaku Bottom Max Count364
internal fun PlayerActivity.showV278DanmakuBottomMaxCount364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278danmakuBottomMaxCount364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278danmakuBottomMaxCount364 = value
        AppToast.show(this, "Danmaku Bottom Max Count364: $value")
    }
}

// v278: Subtitle Bg Border371
internal fun PlayerActivity.showV278SubtitleBgBorder371Toggle() {
    val current = BiliClient.prefs.v278subtitleBgBorder371
    BiliClient.prefs.v278subtitleBgBorder371 = !current
    AppToast.show(this, "Subtitle Bg Border371: ${if (!current) "ON" else "OFF"}")
}

// v279: Audio EQ Custom279
internal fun PlayerActivity.showV279AudioEQCustom279Toggle() {
    val current = BiliClient.prefs.v279audioEQCustom279
    BiliClient.prefs.v279audioEQCustom279 = !current
    AppToast.show(this, "Audio EQ Custom279: ${if (!current) "ON" else "OFF"}")
}

// v279: Danmaku Bottom Max Count365
internal fun PlayerActivity.showV279DanmakuBottomMaxCount365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279danmakuBottomMaxCount365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279danmakuBottomMaxCount365 = value
        AppToast.show(this, "Danmaku Bottom Max Count365: $value")
    }
}

// v279: Subtitle Bg Border372
internal fun PlayerActivity.showV279SubtitleBgBorder372Toggle() {
    val current = BiliClient.prefs.v279subtitleBgBorder372
    BiliClient.prefs.v279subtitleBgBorder372 = !current
    AppToast.show(this, "Subtitle Bg Border372: ${if (!current) "ON" else "OFF"}")
}

// v279: Gesture Shake Action279
internal fun PlayerActivity.showV279GestureShakeAction279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279gestureShakeAction279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279gestureShakeAction279 = value
        AppToast.show(this, "Gesture Shake Action279: $value")
    }
}

// v279: Cast Audio Volume279
internal fun PlayerActivity.showV279CastAudioVolume279Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v279castAudioVolume279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279castAudioVolume279 = value
        AppToast.show(this, "Cast Audio Volume279: $value")
    }
}

// v279: Playlist Auto Skip Outro279
internal fun PlayerActivity.showV279PlaylistAutoSkipOutro279Toggle() {
    val current = BiliClient.prefs.v279playlistAutoSkipOutro279
    BiliClient.prefs.v279playlistAutoSkipOutro279 = !current
    AppToast.show(this, "Playlist Auto Skip Outro279: ${if (!current) "ON" else "OFF"}")
}

// v279: Cache Download Speed280
internal fun PlayerActivity.showV279CacheDownloadSpeed280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279cacheDownloadSpeed280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279cacheDownloadSpeed280 = value
        AppToast.show(this, "Cache Download Speed280: $value")
    }
}

// v279: Progress Bar Thumb Border279
internal fun PlayerActivity.showV279ProgressBarThumbBorder279Toggle() {
    val current = BiliClient.prefs.v279progressBarThumbBorder279
    BiliClient.prefs.v279progressBarThumbBorder279 = !current
    AppToast.show(this, "Progress Bar Thumb Border279: ${if (!current) "ON" else "OFF"}")
}

// v279: Volume Boost Peak279
internal fun PlayerActivity.showV279VolumeBoostPeak279Toggle() {
    val current = BiliClient.prefs.v279volumeBoostPeak279
    BiliClient.prefs.v279volumeBoostPeak279 = !current
    AppToast.show(this, "Volume Boost Peak279: ${if (!current) "ON" else "OFF"}")
}

// v279: History Bookmark Export279
internal fun PlayerActivity.showV279HistoryBookmarkExport279Toggle() {
    val current = BiliClient.prefs.v279historyBookmarkExport279
    BiliClient.prefs.v279historyBookmarkExport279 = !current
    AppToast.show(this, "History Bookmark Export279: ${if (!current) "ON" else "OFF"}")
}

// v279: Playback Chapter Sync279
internal fun PlayerActivity.showV279PlaybackChapterSync279Toggle() {
    val current = BiliClient.prefs.v279playbackChapterSync279
    BiliClient.prefs.v279playbackChapterSync279 = !current
    AppToast.show(this, "Playback Chapter Sync279: ${if (!current) "ON" else "OFF"}")
}

// v279: Screenshot Save Path279
internal fun PlayerActivity.showV279ScreenshotSavePath279Toggle() {
    val current = BiliClient.prefs.v279screenshotSavePath279
    BiliClient.prefs.v279screenshotSavePath279 = !current
    AppToast.show(this, "Screenshot Save Path279: ${if (!current) "ON" else "OFF"}")
}

// v279: Video Color Space279
internal fun PlayerActivity.showV279VideoColorSpace279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279videoColorSpace279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279videoColorSpace279 = value
        AppToast.show(this, "Video Color Space279: $value")
    }
}

// v279: Danmaku Bottom Max Count366
internal fun PlayerActivity.showV279DanmakuBottomMaxCount366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279danmakuBottomMaxCount366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279danmakuBottomMaxCount366 = value
        AppToast.show(this, "Danmaku Bottom Max Count366: $value")
    }
}

// v279: Subtitle Bg Border373
internal fun PlayerActivity.showV279SubtitleBgBorder373Toggle() {
    val current = BiliClient.prefs.v279subtitleBgBorder373
    BiliClient.prefs.v279subtitleBgBorder373 = !current
    AppToast.show(this, "Subtitle Bg Border373: ${if (!current) "ON" else "OFF"}")
}

// v280: Audio EQ Custom280
internal fun PlayerActivity.showV280AudioEQCustom280Toggle() {
    val current = BiliClient.prefs.v280audioEQCustom280
    BiliClient.prefs.v280audioEQCustom280 = !current
    AppToast.show(this, "Audio EQ Custom280: ${if (!current) "ON" else "OFF"}")
}

// v280: Danmaku Bottom Max Count367
internal fun PlayerActivity.showV280DanmakuBottomMaxCount367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280danmakuBottomMaxCount367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280danmakuBottomMaxCount367 = value
        AppToast.show(this, "Danmaku Bottom Max Count367: $value")
    }
}

// v280: Subtitle Bg Border374
internal fun PlayerActivity.showV280SubtitleBgBorder374Toggle() {
    val current = BiliClient.prefs.v280subtitleBgBorder374
    BiliClient.prefs.v280subtitleBgBorder374 = !current
    AppToast.show(this, "Subtitle Bg Border374: ${if (!current) "ON" else "OFF"}")
}

// v280: Gesture Shake Action280
internal fun PlayerActivity.showV280GestureShakeAction280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280gestureShakeAction280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280gestureShakeAction280 = value
        AppToast.show(this, "Gesture Shake Action280: $value")
    }
}

// v280: Cast Audio Volume280
internal fun PlayerActivity.showV280CastAudioVolume280Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v280castAudioVolume280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280castAudioVolume280 = value
        AppToast.show(this, "Cast Audio Volume280: $value")
    }
}

// v280: Playlist Auto Skip Outro280
internal fun PlayerActivity.showV280PlaylistAutoSkipOutro280Toggle() {
    val current = BiliClient.prefs.v280playlistAutoSkipOutro280
    BiliClient.prefs.v280playlistAutoSkipOutro280 = !current
    AppToast.show(this, "Playlist Auto Skip Outro280: ${if (!current) "ON" else "OFF"}")
}

// v280: Cache Download Speed281
internal fun PlayerActivity.showV280CacheDownloadSpeed281Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280cacheDownloadSpeed281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280cacheDownloadSpeed281 = value
        AppToast.show(this, "Cache Download Speed281: $value")
    }
}

// v280: Progress Bar Thumb Border280
internal fun PlayerActivity.showV280ProgressBarThumbBorder280Toggle() {
    val current = BiliClient.prefs.v280progressBarThumbBorder280
    BiliClient.prefs.v280progressBarThumbBorder280 = !current
    AppToast.show(this, "Progress Bar Thumb Border280: ${if (!current) "ON" else "OFF"}")
}

// v280: Volume Boost Peak280
internal fun PlayerActivity.showV280VolumeBoostPeak280Toggle() {
    val current = BiliClient.prefs.v280volumeBoostPeak280
    BiliClient.prefs.v280volumeBoostPeak280 = !current
    AppToast.show(this, "Volume Boost Peak280: ${if (!current) "ON" else "OFF"}")
}

// v280: History Bookmark Export280
internal fun PlayerActivity.showV280HistoryBookmarkExport280Toggle() {
    val current = BiliClient.prefs.v280historyBookmarkExport280
    BiliClient.prefs.v280historyBookmarkExport280 = !current
    AppToast.show(this, "History Bookmark Export280: ${if (!current) "ON" else "OFF"}")
}

// v280: Playback Chapter Sync280
internal fun PlayerActivity.showV280PlaybackChapterSync280Toggle() {
    val current = BiliClient.prefs.v280playbackChapterSync280
    BiliClient.prefs.v280playbackChapterSync280 = !current
    AppToast.show(this, "Playback Chapter Sync280: ${if (!current) "ON" else "OFF"}")
}

// v280: Screenshot Save Path280
internal fun PlayerActivity.showV280ScreenshotSavePath280Toggle() {
    val current = BiliClient.prefs.v280screenshotSavePath280
    BiliClient.prefs.v280screenshotSavePath280 = !current
    AppToast.show(this, "Screenshot Save Path280: ${if (!current) "ON" else "OFF"}")
}

// v280: Video Color Space280
internal fun PlayerActivity.showV280VideoColorSpace280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280videoColorSpace280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280videoColorSpace280 = value
        AppToast.show(this, "Video Color Space280: $value")
    }
}

// v280: Danmaku Bottom Max Count368
internal fun PlayerActivity.showV280DanmakuBottomMaxCount368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280danmakuBottomMaxCount368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280danmakuBottomMaxCount368 = value
        AppToast.show(this, "Danmaku Bottom Max Count368: $value")
    }
}

// v280: Subtitle Bg Border375
internal fun PlayerActivity.showV280SubtitleBgBorder375Toggle() {
    val current = BiliClient.prefs.v280subtitleBgBorder375
    BiliClient.prefs.v280subtitleBgBorder375 = !current
    AppToast.show(this, "Subtitle Bg Border375: ${if (!current) "ON" else "OFF"}")
}

// v281: Audio EQ Custom281
internal fun PlayerActivity.showV281AudioEQCustom281Toggle() {
    val current = BiliClient.prefs.v281audioEQCustom281
    BiliClient.prefs.v281audioEQCustom281 = !current
    AppToast.show(this, "Audio EQ Custom281: ${if (!current) "ON" else "OFF"}")
}

// v281: Danmaku Bottom Max Count369
internal fun PlayerActivity.showV281DanmakuBottomMaxCount369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281danmakuBottomMaxCount369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281danmakuBottomMaxCount369 = value
        AppToast.show(this, "Danmaku Bottom Max Count369: $value")
    }
}

// v281: Subtitle Bg Border376
internal fun PlayerActivity.showV281SubtitleBgBorder376Toggle() {
    val current = BiliClient.prefs.v281subtitleBgBorder376
    BiliClient.prefs.v281subtitleBgBorder376 = !current
    AppToast.show(this, "Subtitle Bg Border376: ${if (!current) "ON" else "OFF"}")
}

// v281: Gesture Shake Action281
internal fun PlayerActivity.showV281GestureShakeAction281Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281gestureShakeAction281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281gestureShakeAction281 = value
        AppToast.show(this, "Gesture Shake Action281: $value")
    }
}

// v281: Cast Audio Volume281
internal fun PlayerActivity.showV281CastAudioVolume281Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v281castAudioVolume281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281castAudioVolume281 = value
        AppToast.show(this, "Cast Audio Volume281: $value")
    }
}

// v281: Playlist Auto Skip Outro281
internal fun PlayerActivity.showV281PlaylistAutoSkipOutro281Toggle() {
    val current = BiliClient.prefs.v281playlistAutoSkipOutro281
    BiliClient.prefs.v281playlistAutoSkipOutro281 = !current
    AppToast.show(this, "Playlist Auto Skip Outro281: ${if (!current) "ON" else "OFF"}")
}

// v281: Cache Download Speed282
internal fun PlayerActivity.showV281CacheDownloadSpeed282Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281cacheDownloadSpeed282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281cacheDownloadSpeed282 = value
        AppToast.show(this, "Cache Download Speed282: $value")
    }
}

// v281: Progress Bar Thumb Border281
internal fun PlayerActivity.showV281ProgressBarThumbBorder281Toggle() {
    val current = BiliClient.prefs.v281progressBarThumbBorder281
    BiliClient.prefs.v281progressBarThumbBorder281 = !current
    AppToast.show(this, "Progress Bar Thumb Border281: ${if (!current) "ON" else "OFF"}")
}

// v281: Volume Boost Peak281
internal fun PlayerActivity.showV281VolumeBoostPeak281Toggle() {
    val current = BiliClient.prefs.v281volumeBoostPeak281
    BiliClient.prefs.v281volumeBoostPeak281 = !current
    AppToast.show(this, "Volume Boost Peak281: ${if (!current) "ON" else "OFF"}")
}

// v281: History Bookmark Export281
internal fun PlayerActivity.showV281HistoryBookmarkExport281Toggle() {
    val current = BiliClient.prefs.v281historyBookmarkExport281
    BiliClient.prefs.v281historyBookmarkExport281 = !current
    AppToast.show(this, "History Bookmark Export281: ${if (!current) "ON" else "OFF"}")
}

// v281: Playback Chapter Sync281
internal fun PlayerActivity.showV281PlaybackChapterSync281Toggle() {
    val current = BiliClient.prefs.v281playbackChapterSync281
    BiliClient.prefs.v281playbackChapterSync281 = !current
    AppToast.show(this, "Playback Chapter Sync281: ${if (!current) "ON" else "OFF"}")
}

// v281: Screenshot Save Path281
internal fun PlayerActivity.showV281ScreenshotSavePath281Toggle() {
    val current = BiliClient.prefs.v281screenshotSavePath281
    BiliClient.prefs.v281screenshotSavePath281 = !current
    AppToast.show(this, "Screenshot Save Path281: ${if (!current) "ON" else "OFF"}")
}

// v281: Video Color Space281
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

// v281: Danmaku Bottom Max Count370
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

// v281: Subtitle Bg Border377
internal fun PlayerActivity.showV281SubtitleBgBorder377Toggle() {
    val current = BiliClient.prefs.v281subtitleBgBorder377
    BiliClient.prefs.v281subtitleBgBorder377 = !current
    AppToast.show(this, "Subtitle Bg Border377: ${if (!current) "ON" else "OFF"}")
}

// v282: Audio EQ Custom282
internal fun PlayerActivity.showV282AudioEQCustom282Toggle() {
    val current = BiliClient.prefs.v282audioEQCustom282
    BiliClient.prefs.v282audioEQCustom282 = !current
    AppToast.show(this, "Audio EQ Custom282: ${if (!current) "ON" else "OFF"}")
}

// v282: Danmaku Bottom Max Count371
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

// v282: Subtitle Bg Border378
internal fun PlayerActivity.showV282SubtitleBgBorder378Toggle() {
    val current = BiliClient.prefs.v282subtitleBgBorder378
    BiliClient.prefs.v282subtitleBgBorder378 = !current
    AppToast.show(this, "Subtitle Bg Border378: ${if (!current) "ON" else "OFF"}")
}

// v282: Gesture Shake Action282
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

// v282: Cast Audio Volume282
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

// v282: Playlist Auto Skip Outro282
internal fun PlayerActivity.showV282PlaylistAutoSkipOutro282Toggle() {
    val current = BiliClient.prefs.v282playlistAutoSkipOutro282
    BiliClient.prefs.v282playlistAutoSkipOutro282 = !current
    AppToast.show(this, "Playlist Auto Skip Outro282: ${if (!current) "ON" else "OFF"}")
}

// v282: Cache Download Speed283
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

// v282: Progress Bar Thumb Border282
internal fun PlayerActivity.showV282ProgressBarThumbBorder282Toggle() {
    val current = BiliClient.prefs.v282progressBarThumbBorder282
    BiliClient.prefs.v282progressBarThumbBorder282 = !current
    AppToast.show(this, "Progress Bar Thumb Border282: ${if (!current) "ON" else "OFF"}")
}

// v282: Volume Boost Peak282
internal fun PlayerActivity.showV282VolumeBoostPeak282Toggle() {
    val current = BiliClient.prefs.v282volumeBoostPeak282
    BiliClient.prefs.v282volumeBoostPeak282 = !current
    AppToast.show(this, "Volume Boost Peak282: ${if (!current) "ON" else "OFF"}")
}

// v282: History Bookmark Export282
internal fun PlayerActivity.showV282HistoryBookmarkExport282Toggle() {
    val current = BiliClient.prefs.v282historyBookmarkExport282
    BiliClient.prefs.v282historyBookmarkExport282 = !current
    AppToast.show(this, "History Bookmark Export282: ${if (!current) "ON" else "OFF"}")
}

// v282: Playback Chapter Sync282
internal fun PlayerActivity.showV282PlaybackChapterSync282Toggle() {
    val current = BiliClient.prefs.v282playbackChapterSync282
    BiliClient.prefs.v282playbackChapterSync282 = !current
    AppToast.show(this, "Playback Chapter Sync282: ${if (!current) "ON" else "OFF"}")
}

// v282: Screenshot Save Path282
internal fun PlayerActivity.showV282ScreenshotSavePath282Toggle() {
    val current = BiliClient.prefs.v282screenshotSavePath282
    BiliClient.prefs.v282screenshotSavePath282 = !current
    AppToast.show(this, "Screenshot Save Path282: ${if (!current) "ON" else "OFF"}")
}

// v282: Video Color Space282
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

// v282: Danmaku Bottom Max Count372
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

// v282: Subtitle Bg Border379
internal fun PlayerActivity.showV282SubtitleBgBorder379Toggle() {
    val current = BiliClient.prefs.v282subtitleBgBorder379
    BiliClient.prefs.v282subtitleBgBorder379 = !current
    AppToast.show(this, "Subtitle Bg Border379: ${if (!current) "ON" else "OFF"}")
}

// v283: Audio EQ Custom283
internal fun PlayerActivity.showV283AudioEQCustom283Toggle() {
    val current = BiliClient.prefs.v283audioEQCustom283
    BiliClient.prefs.v283audioEQCustom283 = !current
    AppToast.show(this, "Audio EQ Custom283: ${if (!current) "ON" else "OFF"}")
}

// v283: Danmaku Bottom Max Count373
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

// v283: Subtitle Bg Border380
internal fun PlayerActivity.showV283SubtitleBgBorder380Toggle() {
    val current = BiliClient.prefs.v283subtitleBgBorder380
    BiliClient.prefs.v283subtitleBgBorder380 = !current
    AppToast.show(this, "Subtitle Bg Border380: ${if (!current) "ON" else "OFF"}")
}

// v283: Gesture Shake Action283
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

// v283: Cast Audio Volume283
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

// v283: Playlist Auto Skip Outro283
internal fun PlayerActivity.showV283PlaylistAutoSkipOutro283Toggle() {
    val current = BiliClient.prefs.v283playlistAutoSkipOutro283
    BiliClient.prefs.v283playlistAutoSkipOutro283 = !current
    AppToast.show(this, "Playlist Auto Skip Outro283: ${if (!current) "ON" else "OFF"}")
}

// v283: Cache Download Speed284
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

// v283: Progress Bar Thumb Border283
internal fun PlayerActivity.showV283ProgressBarThumbBorder283Toggle() {
    val current = BiliClient.prefs.v283progressBarThumbBorder283
    BiliClient.prefs.v283progressBarThumbBorder283 = !current
    AppToast.show(this, "Progress Bar Thumb Border283: ${if (!current) "ON" else "OFF"}")
}

// v283: Volume Boost Peak283
internal fun PlayerActivity.showV283VolumeBoostPeak283Toggle() {
    val current = BiliClient.prefs.v283volumeBoostPeak283
    BiliClient.prefs.v283volumeBoostPeak283 = !current
    AppToast.show(this, "Volume Boost Peak283: ${if (!current) "ON" else "OFF"}")
}

// v283: History Bookmark Export283
internal fun PlayerActivity.showV283HistoryBookmarkExport283Toggle() {
    val current = BiliClient.prefs.v283historyBookmarkExport283
    BiliClient.prefs.v283historyBookmarkExport283 = !current
    AppToast.show(this, "History Bookmark Export283: ${if (!current) "ON" else "OFF"}")
}

// v283: Playback Chapter Sync283
internal fun PlayerActivity.showV283PlaybackChapterSync283Toggle() {
    val current = BiliClient.prefs.v283playbackChapterSync283
    BiliClient.prefs.v283playbackChapterSync283 = !current
    AppToast.show(this, "Playback Chapter Sync283: ${if (!current) "ON" else "OFF"}")
}

// v283: Screenshot Save Path283
internal fun PlayerActivity.showV283ScreenshotSavePath283Toggle() {
    val current = BiliClient.prefs.v283screenshotSavePath283
    BiliClient.prefs.v283screenshotSavePath283 = !current
    AppToast.show(this, "Screenshot Save Path283: ${if (!current) "ON" else "OFF"}")
}

// v283: Video Color Space283
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

// v283: Danmaku Bottom Max Count374
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

// v283: Subtitle Bg Border381
internal fun PlayerActivity.showV283SubtitleBgBorder381Toggle() {
    val current = BiliClient.prefs.v283subtitleBgBorder381
    BiliClient.prefs.v283subtitleBgBorder381 = !current
    AppToast.show(this, "Subtitle Bg Border381: ${if (!current) "ON" else "OFF"}")
}

// v284: Audio EQ Custom284
internal fun PlayerActivity.showV284AudioEQCustom284Toggle() {
    val current = BiliClient.prefs.v284audioEQCustom284
    BiliClient.prefs.v284audioEQCustom284 = !current
    AppToast.show(this, "Audio EQ Custom284: ${if (!current) "ON" else "OFF"}")
}

// v284: Danmaku Bottom Max Count375
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

// v284: Subtitle Bg Border382
internal fun PlayerActivity.showV284SubtitleBgBorder382Toggle() {
    val current = BiliClient.prefs.v284subtitleBgBorder382
    BiliClient.prefs.v284subtitleBgBorder382 = !current
    AppToast.show(this, "Subtitle Bg Border382: ${if (!current) "ON" else "OFF"}")
}

// v284: Gesture Shake Action284
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

// v284: Cast Audio Volume284
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

// v284: Playlist Auto Skip Outro284
internal fun PlayerActivity.showV284PlaylistAutoSkipOutro284Toggle() {
    val current = BiliClient.prefs.v284playlistAutoSkipOutro284
    BiliClient.prefs.v284playlistAutoSkipOutro284 = !current
    AppToast.show(this, "Playlist Auto Skip Outro284: ${if (!current) "ON" else "OFF"}")
}

// v284: Cache Download Speed285
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

// v284: Progress Bar Thumb Border284
internal fun PlayerActivity.showV284ProgressBarThumbBorder284Toggle() {
    val current = BiliClient.prefs.v284progressBarThumbBorder284
    BiliClient.prefs.v284progressBarThumbBorder284 = !current
    AppToast.show(this, "Progress Bar Thumb Border284: ${if (!current) "ON" else "OFF"}")
}

// v284: Volume Boost Peak284
internal fun PlayerActivity.showV284VolumeBoostPeak284Toggle() {
    val current = BiliClient.prefs.v284volumeBoostPeak284
    BiliClient.prefs.v284volumeBoostPeak284 = !current
    AppToast.show(this, "Volume Boost Peak284: ${if (!current) "ON" else "OFF"}")
}

// v284: History Bookmark Export284
internal fun PlayerActivity.showV284HistoryBookmarkExport284Toggle() {
    val current = BiliClient.prefs.v284historyBookmarkExport284
    BiliClient.prefs.v284historyBookmarkExport284 = !current
    AppToast.show(this, "History Bookmark Export284: ${if (!current) "ON" else "OFF"}")
}

// v284: Playback Chapter Sync284
internal fun PlayerActivity.showV284PlaybackChapterSync284Toggle() {
    val current = BiliClient.prefs.v284playbackChapterSync284
    BiliClient.prefs.v284playbackChapterSync284 = !current
    AppToast.show(this, "Playback Chapter Sync284: ${if (!current) "ON" else "OFF"}")
}

// v284: Screenshot Save Path284
internal fun PlayerActivity.showV284ScreenshotSavePath284Toggle() {
    val current = BiliClient.prefs.v284screenshotSavePath284
    BiliClient.prefs.v284screenshotSavePath284 = !current
    AppToast.show(this, "Screenshot Save Path284: ${if (!current) "ON" else "OFF"}")
}

// v284: Video Color Space284
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

// v284: Danmaku Bottom Max Count376
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

// v284: Subtitle Bg Border383
internal fun PlayerActivity.showV284SubtitleBgBorder383Toggle() {
    val current = BiliClient.prefs.v284subtitleBgBorder383
    BiliClient.prefs.v284subtitleBgBorder383 = !current
    AppToast.show(this, "Subtitle Bg Border383: ${if (!current) "ON" else "OFF"}")
}

// v285: Audio EQ Custom285
internal fun PlayerActivity.showV285AudioEQCustom285Toggle() {
    val current = BiliClient.prefs.v285audioEQCustom285
    BiliClient.prefs.v285audioEQCustom285 = !current
    AppToast.show(this, "Audio EQ Custom285: ${if (!current) "ON" else "OFF"}")
}

// v285: Danmaku Bottom Max Count377
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

// v285: Subtitle Bg Border384
internal fun PlayerActivity.showV285SubtitleBgBorder384Toggle() {
    val current = BiliClient.prefs.v285subtitleBgBorder384
    BiliClient.prefs.v285subtitleBgBorder384 = !current
    AppToast.show(this, "Subtitle Bg Border384: ${if (!current) "ON" else "OFF"}")
}

// v285: Gesture Shake Action285
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

// v285: Cast Audio Volume285
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

// v285: Playlist Auto Skip Outro285
internal fun PlayerActivity.showV285PlaylistAutoSkipOutro285Toggle() {
    val current = BiliClient.prefs.v285playlistAutoSkipOutro285
    BiliClient.prefs.v285playlistAutoSkipOutro285 = !current
    AppToast.show(this, "Playlist Auto Skip Outro285: ${if (!current) "ON" else "OFF"}")
}

// v285: Cache Download Speed286
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

// v285: Progress Bar Thumb Border285
internal fun PlayerActivity.showV285ProgressBarThumbBorder285Toggle() {
    val current = BiliClient.prefs.v285progressBarThumbBorder285
    BiliClient.prefs.v285progressBarThumbBorder285 = !current
    AppToast.show(this, "Progress Bar Thumb Border285: ${if (!current) "ON" else "OFF"}")
}

// v285: Volume Boost Peak285
internal fun PlayerActivity.showV285VolumeBoostPeak285Toggle() {
    val current = BiliClient.prefs.v285volumeBoostPeak285
    BiliClient.prefs.v285volumeBoostPeak285 = !current
    AppToast.show(this, "Volume Boost Peak285: ${if (!current) "ON" else "OFF"}")
}

// v285: History Bookmark Export285
internal fun PlayerActivity.showV285HistoryBookmarkExport285Toggle() {
    val current = BiliClient.prefs.v285historyBookmarkExport285
    BiliClient.prefs.v285historyBookmarkExport285 = !current
    AppToast.show(this, "History Bookmark Export285: ${if (!current) "ON" else "OFF"}")
}

// v285: Playback Chapter Sync285
internal fun PlayerActivity.showV285PlaybackChapterSync285Toggle() {
    val current = BiliClient.prefs.v285playbackChapterSync285
    BiliClient.prefs.v285playbackChapterSync285 = !current
    AppToast.show(this, "Playback Chapter Sync285: ${if (!current) "ON" else "OFF"}")
}

// v285: Screenshot Save Path285
internal fun PlayerActivity.showV285ScreenshotSavePath285Toggle() {
    val current = BiliClient.prefs.v285screenshotSavePath285
    BiliClient.prefs.v285screenshotSavePath285 = !current
    AppToast.show(this, "Screenshot Save Path285: ${if (!current) "ON" else "OFF"}")
}

// v285: Video Color Space285
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

// v285: Danmaku Bottom Max Count378
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

// v285: Subtitle Bg Border385
internal fun PlayerActivity.showV285SubtitleBgBorder385Toggle() {
    val current = BiliClient.prefs.v285subtitleBgBorder385
    BiliClient.prefs.v285subtitleBgBorder385 = !current
    AppToast.show(this, "Subtitle Bg Border385: ${if (!current) "ON" else "OFF"}")
}

// v286: Audio EQ Custom286
internal fun PlayerActivity.showV286AudioEQCustom286Toggle() {
    val current = BiliClient.prefs.v286audioEQCustom286
    BiliClient.prefs.v286audioEQCustom286 = !current
    AppToast.show(this, "Audio EQ Custom286: ${if (!current) "ON" else "OFF"}")
}

// v286: Danmaku Bottom Max Count379
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

// v286: Subtitle Bg Border386
internal fun PlayerActivity.showV286SubtitleBgBorder386Toggle() {
    val current = BiliClient.prefs.v286subtitleBgBorder386
    BiliClient.prefs.v286subtitleBgBorder386 = !current
    AppToast.show(this, "Subtitle Bg Border386: ${if (!current) "ON" else "OFF"}")
}

// v286: Gesture Shake Action286
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

// v286: Cast Audio Volume286
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

// v286: Playlist Auto Skip Outro286
internal fun PlayerActivity.showV286PlaylistAutoSkipOutro286Toggle() {
    val current = BiliClient.prefs.v286playlistAutoSkipOutro286
    BiliClient.prefs.v286playlistAutoSkipOutro286 = !current
    AppToast.show(this, "Playlist Auto Skip Outro286: ${if (!current) "ON" else "OFF"}")
}

// v286: Cache Download Speed287
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

// v286: Progress Bar Thumb Border286
internal fun PlayerActivity.showV286ProgressBarThumbBorder286Toggle() {
    val current = BiliClient.prefs.v286progressBarThumbBorder286
    BiliClient.prefs.v286progressBarThumbBorder286 = !current
    AppToast.show(this, "Progress Bar Thumb Border286: ${if (!current) "ON" else "OFF"}")
}

// v286: Volume Boost Peak286
internal fun PlayerActivity.showV286VolumeBoostPeak286Toggle() {
    val current = BiliClient.prefs.v286volumeBoostPeak286
    BiliClient.prefs.v286volumeBoostPeak286 = !current
    AppToast.show(this, "Volume Boost Peak286: ${if (!current) "ON" else "OFF"}")
}

// v286: History Bookmark Export286
internal fun PlayerActivity.showV286HistoryBookmarkExport286Toggle() {
    val current = BiliClient.prefs.v286historyBookmarkExport286
    BiliClient.prefs.v286historyBookmarkExport286 = !current
    AppToast.show(this, "History Bookmark Export286: ${if (!current) "ON" else "OFF"}")
}

// v286: Playback Chapter Sync286
internal fun PlayerActivity.showV286PlaybackChapterSync286Toggle() {
    val current = BiliClient.prefs.v286playbackChapterSync286
    BiliClient.prefs.v286playbackChapterSync286 = !current
    AppToast.show(this, "Playback Chapter Sync286: ${if (!current) "ON" else "OFF"}")
}

// v286: Screenshot Save Path286
internal fun PlayerActivity.showV286ScreenshotSavePath286Toggle() {
    val current = BiliClient.prefs.v286screenshotSavePath286
    BiliClient.prefs.v286screenshotSavePath286 = !current
    AppToast.show(this, "Screenshot Save Path286: ${if (!current) "ON" else "OFF"}")
}

// v286: Video Color Space286
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

// v286: Danmaku Bottom Max Count380
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

// v286: Subtitle Bg Border387
internal fun PlayerActivity.showV286SubtitleBgBorder387Toggle() {
    val current = BiliClient.prefs.v286subtitleBgBorder387
    BiliClient.prefs.v286subtitleBgBorder387 = !current
    AppToast.show(this, "Subtitle Bg Border387: ${if (!current) "ON" else "OFF"}")
}

// v287: Audio EQ Custom287
internal fun PlayerActivity.showV287AudioEQCustom287Toggle() {
    val current = BiliClient.prefs.v287audioEQCustom287
    BiliClient.prefs.v287audioEQCustom287 = !current
    AppToast.show(this, "Audio EQ Custom287: ${if (!current) "ON" else "OFF"}")
}

// v287: Danmaku Bottom Max Count381
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

// v287: Subtitle Bg Border388
internal fun PlayerActivity.showV287SubtitleBgBorder388Toggle() {
    val current = BiliClient.prefs.v287subtitleBgBorder388
    BiliClient.prefs.v287subtitleBgBorder388 = !current
    AppToast.show(this, "Subtitle Bg Border388: ${if (!current) "ON" else "OFF"}")
}

// v287: Gesture Shake Action287
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

// v287: Cast Audio Volume287
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

// v287: Playlist Auto Skip Outro287
internal fun PlayerActivity.showV287PlaylistAutoSkipOutro287Toggle() {
    val current = BiliClient.prefs.v287playlistAutoSkipOutro287
    BiliClient.prefs.v287playlistAutoSkipOutro287 = !current
    AppToast.show(this, "Playlist Auto Skip Outro287: ${if (!current) "ON" else "OFF"}")
}

// v287: Cache Download Speed288
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

// v287: Progress Bar Thumb Border287
internal fun PlayerActivity.showV287ProgressBarThumbBorder287Toggle() {
    val current = BiliClient.prefs.v287progressBarThumbBorder287
    BiliClient.prefs.v287progressBarThumbBorder287 = !current
    AppToast.show(this, "Progress Bar Thumb Border287: ${if (!current) "ON" else "OFF"}")
}

// v287: Volume Boost Peak287
internal fun PlayerActivity.showV287VolumeBoostPeak287Toggle() {
    val current = BiliClient.prefs.v287volumeBoostPeak287
    BiliClient.prefs.v287volumeBoostPeak287 = !current
    AppToast.show(this, "Volume Boost Peak287: ${if (!current) "ON" else "OFF"}")
}

// v287: History Bookmark Export287
internal fun PlayerActivity.showV287HistoryBookmarkExport287Toggle() {
    val current = BiliClient.prefs.v287historyBookmarkExport287
    BiliClient.prefs.v287historyBookmarkExport287 = !current
    AppToast.show(this, "History Bookmark Export287: ${if (!current) "ON" else "OFF"}")
}

// v287: Playback Chapter Sync287
internal fun PlayerActivity.showV287PlaybackChapterSync287Toggle() {
    val current = BiliClient.prefs.v287playbackChapterSync287
    BiliClient.prefs.v287playbackChapterSync287 = !current
    AppToast.show(this, "Playback Chapter Sync287: ${if (!current) "ON" else "OFF"}")
}

// v287: Screenshot Save Path287
internal fun PlayerActivity.showV287ScreenshotSavePath287Toggle() {
    val current = BiliClient.prefs.v287screenshotSavePath287
    BiliClient.prefs.v287screenshotSavePath287 = !current
    AppToast.show(this, "Screenshot Save Path287: ${if (!current) "ON" else "OFF"}")
}

// v287: Video Color Space287
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

// v287: Danmaku Bottom Max Count382
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

// v287: Subtitle Bg Border389
internal fun PlayerActivity.showV287SubtitleBgBorder389Toggle() {
    val current = BiliClient.prefs.v287subtitleBgBorder389
    BiliClient.prefs.v287subtitleBgBorder389 = !current
    AppToast.show(this, "Subtitle Bg Border389: ${if (!current) "ON" else "OFF"}")
}

// v288: Audio EQ Custom288
internal fun PlayerActivity.showV288AudioEQCustom288Toggle() {
    val current = BiliClient.prefs.v288audioEQCustom288
    BiliClient.prefs.v288audioEQCustom288 = !current
    AppToast.show(this, "Audio EQ Custom288: ${if (!current) "ON" else "OFF"}")
}

// v288: Danmaku Bottom Max Count383
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

// v288: Subtitle Bg Border390
internal fun PlayerActivity.showV288SubtitleBgBorder390Toggle() {
    val current = BiliClient.prefs.v288subtitleBgBorder390
    BiliClient.prefs.v288subtitleBgBorder390 = !current
    AppToast.show(this, "Subtitle Bg Border390: ${if (!current) "ON" else "OFF"}")
}

// v288: Gesture Shake Action288
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

// v288: Cast Audio Volume288
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

// v288: Playlist Auto Skip Outro288
internal fun PlayerActivity.showV288PlaylistAutoSkipOutro288Toggle() {
    val current = BiliClient.prefs.v288playlistAutoSkipOutro288
    BiliClient.prefs.v288playlistAutoSkipOutro288 = !current
    AppToast.show(this, "Playlist Auto Skip Outro288: ${if (!current) "ON" else "OFF"}")
}

// v288: Cache Download Speed289
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

// v288: Progress Bar Thumb Border288
internal fun PlayerActivity.showV288ProgressBarThumbBorder288Toggle() {
    val current = BiliClient.prefs.v288progressBarThumbBorder288
    BiliClient.prefs.v288progressBarThumbBorder288 = !current
    AppToast.show(this, "Progress Bar Thumb Border288: ${if (!current) "ON" else "OFF"}")
}

// v288: Volume Boost Peak288
internal fun PlayerActivity.showV288VolumeBoostPeak288Toggle() {
    val current = BiliClient.prefs.v288volumeBoostPeak288
    BiliClient.prefs.v288volumeBoostPeak288 = !current
    AppToast.show(this, "Volume Boost Peak288: ${if (!current) "ON" else "OFF"}")
}

// v288: History Bookmark Export288
internal fun PlayerActivity.showV288HistoryBookmarkExport288Toggle() {
    val current = BiliClient.prefs.v288historyBookmarkExport288
    BiliClient.prefs.v288historyBookmarkExport288 = !current
    AppToast.show(this, "History Bookmark Export288: ${if (!current) "ON" else "OFF"}")
}

// v288: Playback Chapter Sync288
internal fun PlayerActivity.showV288PlaybackChapterSync288Toggle() {
    val current = BiliClient.prefs.v288playbackChapterSync288
    BiliClient.prefs.v288playbackChapterSync288 = !current
    AppToast.show(this, "Playback Chapter Sync288: ${if (!current) "ON" else "OFF"}")
}

// v288: Screenshot Save Path288
internal fun PlayerActivity.showV288ScreenshotSavePath288Toggle() {
    val current = BiliClient.prefs.v288screenshotSavePath288
    BiliClient.prefs.v288screenshotSavePath288 = !current
    AppToast.show(this, "Screenshot Save Path288: ${if (!current) "ON" else "OFF"}")
}

// v288: Video Color Space288
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

// v288: Danmaku Bottom Max Count384
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

// v288: Subtitle Bg Border391
internal fun PlayerActivity.showV288SubtitleBgBorder391Toggle() {
    val current = BiliClient.prefs.v288subtitleBgBorder391
    BiliClient.prefs.v288subtitleBgBorder391 = !current
    AppToast.show(this, "Subtitle Bg Border391: ${if (!current) "ON" else "OFF"}")
}

// v289: Audio EQ Custom289
internal fun PlayerActivity.showV289AudioEQCustom289Toggle() {
    val current = BiliClient.prefs.v289audioEQCustom289
    BiliClient.prefs.v289audioEQCustom289 = !current
    AppToast.show(this, "Audio EQ Custom289: ${if (!current) "ON" else "OFF"}")
}

// v289: Danmaku Bottom Max Count385
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

// v289: Subtitle Bg Border392
internal fun PlayerActivity.showV289SubtitleBgBorder392Toggle() {
    val current = BiliClient.prefs.v289subtitleBgBorder392
    BiliClient.prefs.v289subtitleBgBorder392 = !current
    AppToast.show(this, "Subtitle Bg Border392: ${if (!current) "ON" else "OFF"}")
}

// v289: Gesture Shake Action289
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

// v289: Cast Audio Volume289
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

// v289: Playlist Auto Skip Outro289
internal fun PlayerActivity.showV289PlaylistAutoSkipOutro289Toggle() {
    val current = BiliClient.prefs.v289playlistAutoSkipOutro289
    BiliClient.prefs.v289playlistAutoSkipOutro289 = !current
    AppToast.show(this, "Playlist Auto Skip Outro289: ${if (!current) "ON" else "OFF"}")
}

// v289: Cache Download Speed290
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

// v289: Progress Bar Thumb Border289
internal fun PlayerActivity.showV289ProgressBarThumbBorder289Toggle() {
    val current = BiliClient.prefs.v289progressBarThumbBorder289
    BiliClient.prefs.v289progressBarThumbBorder289 = !current
    AppToast.show(this, "Progress Bar Thumb Border289: ${if (!current) "ON" else "OFF"}")
}

// v289: Volume Boost Peak289
internal fun PlayerActivity.showV289VolumeBoostPeak289Toggle() {
    val current = BiliClient.prefs.v289volumeBoostPeak289
    BiliClient.prefs.v289volumeBoostPeak289 = !current
    AppToast.show(this, "Volume Boost Peak289: ${if (!current) "ON" else "OFF"}")
}

// v289: History Bookmark Export289
internal fun PlayerActivity.showV289HistoryBookmarkExport289Toggle() {
    val current = BiliClient.prefs.v289historyBookmarkExport289
    BiliClient.prefs.v289historyBookmarkExport289 = !current
    AppToast.show(this, "History Bookmark Export289: ${if (!current) "ON" else "OFF"}")
}

// v289: Playback Chapter Sync289
internal fun PlayerActivity.showV289PlaybackChapterSync289Toggle() {
    val current = BiliClient.prefs.v289playbackChapterSync289
    BiliClient.prefs.v289playbackChapterSync289 = !current
    AppToast.show(this, "Playback Chapter Sync289: ${if (!current) "ON" else "OFF"}")
}

// v289: Screenshot Save Path289
internal fun PlayerActivity.showV289ScreenshotSavePath289Toggle() {
    val current = BiliClient.prefs.v289screenshotSavePath289
    BiliClient.prefs.v289screenshotSavePath289 = !current
    AppToast.show(this, "Screenshot Save Path289: ${if (!current) "ON" else "OFF"}")
}

// v289: Video Color Space289
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

