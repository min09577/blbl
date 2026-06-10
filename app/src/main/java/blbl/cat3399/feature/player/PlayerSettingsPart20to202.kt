package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.FeaturePrefsStore
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

// v2181: received mode
internal fun PlayerActivity.showV2181ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181received
    FeaturePrefsStore.batch2181.v2181received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2181: recognized mode
internal fun PlayerActivity.showV2181RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181recognized
    FeaturePrefsStore.batch2181.v2181recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2181: recommended mode
internal fun PlayerActivity.showV2181RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181recommended
    FeaturePrefsStore.batch2181.v2181recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2181: reconciled mode
internal fun PlayerActivity.showV2181ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2181reconciled
    FeaturePrefsStore.batch2181.v2181reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2181: recorded mode
internal fun PlayerActivity.showV2181RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181recorded
    FeaturePrefsStore.batch2181.v2181recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2181: recovered level
internal fun PlayerActivity.showV2181RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2181recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2181recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2181: recruited level
internal fun PlayerActivity.showV2181RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2181recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2181recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2181: recycled level
internal fun PlayerActivity.showV2181RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2181recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2181recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2181: redirected level
internal fun PlayerActivity.showV2181RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2181redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2181redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2181: reduced level
internal fun PlayerActivity.showV2181ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2181reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2181reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2181: referenced mode
internal fun PlayerActivity.showV2181ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181referenced
    FeaturePrefsStore.batch2181.v2181referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2181: reflected mode
internal fun PlayerActivity.showV2181ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181reflected
    FeaturePrefsStore.batch2181.v2181reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2181: reformed mode
internal fun PlayerActivity.showV2181ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181reformed
    FeaturePrefsStore.batch2181.v2181reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2181: refreshed mode
internal fun PlayerActivity.showV2181RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181refreshed
    FeaturePrefsStore.batch2181.v2181refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2181: refused mode
internal fun PlayerActivity.showV2181RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2181refused
    FeaturePrefsStore.batch2181.v2181refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2182: received mode
internal fun PlayerActivity.showV2182ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182received
    FeaturePrefsStore.batch2181.v2182received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2182: recognized mode
internal fun PlayerActivity.showV2182RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182recognized
    FeaturePrefsStore.batch2181.v2182recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2182: recommended mode
internal fun PlayerActivity.showV2182RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182recommended
    FeaturePrefsStore.batch2181.v2182recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2182: reconciled mode
internal fun PlayerActivity.showV2182ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2182reconciled
    FeaturePrefsStore.batch2181.v2182reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2182: recorded mode
internal fun PlayerActivity.showV2182RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182recorded
    FeaturePrefsStore.batch2181.v2182recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2182: recovered level
internal fun PlayerActivity.showV2182RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2182recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2182recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2182: recruited level
internal fun PlayerActivity.showV2182RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2182recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2182recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2182: recycled level
internal fun PlayerActivity.showV2182RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2182recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2182recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2182: redirected level
internal fun PlayerActivity.showV2182RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2182redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2182redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2182: reduced level
internal fun PlayerActivity.showV2182ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2182reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2182reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2182: referenced mode
internal fun PlayerActivity.showV2182ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182referenced
    FeaturePrefsStore.batch2181.v2182referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2182: reflected mode
internal fun PlayerActivity.showV2182ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182reflected
    FeaturePrefsStore.batch2181.v2182reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2182: reformed mode
internal fun PlayerActivity.showV2182ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182reformed
    FeaturePrefsStore.batch2181.v2182reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2182: refreshed mode
internal fun PlayerActivity.showV2182RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182refreshed
    FeaturePrefsStore.batch2181.v2182refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2182: refused mode
internal fun PlayerActivity.showV2182RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2182refused
    FeaturePrefsStore.batch2181.v2182refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2183: received mode
internal fun PlayerActivity.showV2183ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183received
    FeaturePrefsStore.batch2181.v2183received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2183: recognized mode
internal fun PlayerActivity.showV2183RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183recognized
    FeaturePrefsStore.batch2181.v2183recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2183: recommended mode
internal fun PlayerActivity.showV2183RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183recommended
    FeaturePrefsStore.batch2181.v2183recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2183: reconciled mode
internal fun PlayerActivity.showV2183ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2183reconciled
    FeaturePrefsStore.batch2181.v2183reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2183: recorded mode
internal fun PlayerActivity.showV2183RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183recorded
    FeaturePrefsStore.batch2181.v2183recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2183: recovered level
internal fun PlayerActivity.showV2183RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2183recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2183recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2183: recruited level
internal fun PlayerActivity.showV2183RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2183recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2183recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2183: recycled level
internal fun PlayerActivity.showV2183RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2183recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2183recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2183: redirected level
internal fun PlayerActivity.showV2183RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2183redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2183redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2183: reduced level
internal fun PlayerActivity.showV2183ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2183reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2183reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2183: referenced mode
internal fun PlayerActivity.showV2183ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183referenced
    FeaturePrefsStore.batch2181.v2183referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2183: reflected mode
internal fun PlayerActivity.showV2183ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183reflected
    FeaturePrefsStore.batch2181.v2183reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2183: reformed mode
internal fun PlayerActivity.showV2183ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183reformed
    FeaturePrefsStore.batch2181.v2183reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2183: refreshed mode
internal fun PlayerActivity.showV2183RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183refreshed
    FeaturePrefsStore.batch2181.v2183refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2183: refused mode
internal fun PlayerActivity.showV2183RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2183refused
    FeaturePrefsStore.batch2181.v2183refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2184: received mode
internal fun PlayerActivity.showV2184ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184received
    FeaturePrefsStore.batch2181.v2184received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2184: recognized mode
internal fun PlayerActivity.showV2184RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184recognized
    FeaturePrefsStore.batch2181.v2184recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2184: recommended mode
internal fun PlayerActivity.showV2184RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184recommended
    FeaturePrefsStore.batch2181.v2184recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2184: reconciled mode
internal fun PlayerActivity.showV2184ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2184reconciled
    FeaturePrefsStore.batch2181.v2184reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2184: recorded mode
internal fun PlayerActivity.showV2184RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184recorded
    FeaturePrefsStore.batch2181.v2184recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2184: recovered level
internal fun PlayerActivity.showV2184RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2184recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2184recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2184: recruited level
internal fun PlayerActivity.showV2184RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2184recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2184recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2184: recycled level
internal fun PlayerActivity.showV2184RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2184recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2184recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2184: redirected level
internal fun PlayerActivity.showV2184RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2184redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2184redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2184: reduced level
internal fun PlayerActivity.showV2184ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2184reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2184reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2184: referenced mode
internal fun PlayerActivity.showV2184ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184referenced
    FeaturePrefsStore.batch2181.v2184referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2184: reflected mode
internal fun PlayerActivity.showV2184ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184reflected
    FeaturePrefsStore.batch2181.v2184reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2184: reformed mode
internal fun PlayerActivity.showV2184ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184reformed
    FeaturePrefsStore.batch2181.v2184reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2184: refreshed mode
internal fun PlayerActivity.showV2184RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184refreshed
    FeaturePrefsStore.batch2181.v2184refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2184: refused mode
internal fun PlayerActivity.showV2184RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2184refused
    FeaturePrefsStore.batch2181.v2184refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2185: received mode
internal fun PlayerActivity.showV2185ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185received
    FeaturePrefsStore.batch2181.v2185received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2185: recognized mode
internal fun PlayerActivity.showV2185RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185recognized
    FeaturePrefsStore.batch2181.v2185recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2185: recommended mode
internal fun PlayerActivity.showV2185RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185recommended
    FeaturePrefsStore.batch2181.v2185recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2185: reconciled mode
internal fun PlayerActivity.showV2185ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2185reconciled
    FeaturePrefsStore.batch2181.v2185reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2185: recorded mode
internal fun PlayerActivity.showV2185RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185recorded
    FeaturePrefsStore.batch2181.v2185recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2185: recovered level
internal fun PlayerActivity.showV2185RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2185recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2185recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2185: recruited level
internal fun PlayerActivity.showV2185RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2185recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2185recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2185: recycled level
internal fun PlayerActivity.showV2185RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2185recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2185recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2185: redirected level
internal fun PlayerActivity.showV2185RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2185redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2185redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2185: reduced level
internal fun PlayerActivity.showV2185ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2185reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2185reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2185: referenced mode
internal fun PlayerActivity.showV2185ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185referenced
    FeaturePrefsStore.batch2181.v2185referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2185: reflected mode
internal fun PlayerActivity.showV2185ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185reflected
    FeaturePrefsStore.batch2181.v2185reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2185: reformed mode
internal fun PlayerActivity.showV2185ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185reformed
    FeaturePrefsStore.batch2181.v2185reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2185: refreshed mode
internal fun PlayerActivity.showV2185RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185refreshed
    FeaturePrefsStore.batch2181.v2185refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2185: refused mode
internal fun PlayerActivity.showV2185RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2185refused
    FeaturePrefsStore.batch2181.v2185refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2186: received mode
internal fun PlayerActivity.showV2186ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186received
    FeaturePrefsStore.batch2181.v2186received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2186: recognized mode
internal fun PlayerActivity.showV2186RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186recognized
    FeaturePrefsStore.batch2181.v2186recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2186: recommended mode
internal fun PlayerActivity.showV2186RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186recommended
    FeaturePrefsStore.batch2181.v2186recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2186: reconciled mode
internal fun PlayerActivity.showV2186ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2186reconciled
    FeaturePrefsStore.batch2181.v2186reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2186: recorded mode
internal fun PlayerActivity.showV2186RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186recorded
    FeaturePrefsStore.batch2181.v2186recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2186: recovered level
internal fun PlayerActivity.showV2186RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2186recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2186recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2186: recruited level
internal fun PlayerActivity.showV2186RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2186recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2186recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2186: recycled level
internal fun PlayerActivity.showV2186RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2186recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2186recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2186: redirected level
internal fun PlayerActivity.showV2186RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2186redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2186redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2186: reduced level
internal fun PlayerActivity.showV2186ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2186reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2186reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2186: referenced mode
internal fun PlayerActivity.showV2186ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186referenced
    FeaturePrefsStore.batch2181.v2186referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2186: reflected mode
internal fun PlayerActivity.showV2186ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186reflected
    FeaturePrefsStore.batch2181.v2186reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2186: reformed mode
internal fun PlayerActivity.showV2186ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186reformed
    FeaturePrefsStore.batch2181.v2186reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2186: refreshed mode
internal fun PlayerActivity.showV2186RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186refreshed
    FeaturePrefsStore.batch2181.v2186refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2186: refused mode
internal fun PlayerActivity.showV2186RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2186refused
    FeaturePrefsStore.batch2181.v2186refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2187: received mode
internal fun PlayerActivity.showV2187ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187received
    FeaturePrefsStore.batch2181.v2187received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2187: recognized mode
internal fun PlayerActivity.showV2187RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187recognized
    FeaturePrefsStore.batch2181.v2187recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2187: recommended mode
internal fun PlayerActivity.showV2187RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187recommended
    FeaturePrefsStore.batch2181.v2187recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2187: reconciled mode
internal fun PlayerActivity.showV2187ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2187reconciled
    FeaturePrefsStore.batch2181.v2187reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2187: recorded mode
internal fun PlayerActivity.showV2187RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187recorded
    FeaturePrefsStore.batch2181.v2187recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2187: recovered level
internal fun PlayerActivity.showV2187RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2187recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2187recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2187: recruited level
internal fun PlayerActivity.showV2187RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2187recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2187recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2187: recycled level
internal fun PlayerActivity.showV2187RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2187recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2187recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2187: redirected level
internal fun PlayerActivity.showV2187RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2187redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2187redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2187: reduced level
internal fun PlayerActivity.showV2187ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2187reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2187reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2187: referenced mode
internal fun PlayerActivity.showV2187ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187referenced
    FeaturePrefsStore.batch2181.v2187referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2187: reflected mode
internal fun PlayerActivity.showV2187ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187reflected
    FeaturePrefsStore.batch2181.v2187reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2187: reformed mode
internal fun PlayerActivity.showV2187ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187reformed
    FeaturePrefsStore.batch2181.v2187reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2187: refreshed mode
internal fun PlayerActivity.showV2187RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187refreshed
    FeaturePrefsStore.batch2181.v2187refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2187: refused mode
internal fun PlayerActivity.showV2187RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2187refused
    FeaturePrefsStore.batch2181.v2187refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2188: received mode
internal fun PlayerActivity.showV2188ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188received
    FeaturePrefsStore.batch2181.v2188received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2188: recognized mode
internal fun PlayerActivity.showV2188RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188recognized
    FeaturePrefsStore.batch2181.v2188recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2188: recommended mode
internal fun PlayerActivity.showV2188RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188recommended
    FeaturePrefsStore.batch2181.v2188recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2188: reconciled mode
internal fun PlayerActivity.showV2188ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2188reconciled
    FeaturePrefsStore.batch2181.v2188reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2188: recorded mode
internal fun PlayerActivity.showV2188RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188recorded
    FeaturePrefsStore.batch2181.v2188recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2188: recovered level
internal fun PlayerActivity.showV2188RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2188recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2188recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2188: recruited level
internal fun PlayerActivity.showV2188RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2188recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2188recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2188: recycled level
internal fun PlayerActivity.showV2188RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2188recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2188recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2188: redirected level
internal fun PlayerActivity.showV2188RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2188redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2188redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2188: reduced level
internal fun PlayerActivity.showV2188ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2188reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2188reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2188: referenced mode
internal fun PlayerActivity.showV2188ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188referenced
    FeaturePrefsStore.batch2181.v2188referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2188: reflected mode
internal fun PlayerActivity.showV2188ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188reflected
    FeaturePrefsStore.batch2181.v2188reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2188: reformed mode
internal fun PlayerActivity.showV2188ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188reformed
    FeaturePrefsStore.batch2181.v2188reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2188: refreshed mode
internal fun PlayerActivity.showV2188RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188refreshed
    FeaturePrefsStore.batch2181.v2188refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2188: refused mode
internal fun PlayerActivity.showV2188RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2188refused
    FeaturePrefsStore.batch2181.v2188refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2189: received mode
internal fun PlayerActivity.showV2189ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189received
    FeaturePrefsStore.batch2181.v2189received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2189: recognized mode
internal fun PlayerActivity.showV2189RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189recognized
    FeaturePrefsStore.batch2181.v2189recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2189: recommended mode
internal fun PlayerActivity.showV2189RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189recommended
    FeaturePrefsStore.batch2181.v2189recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2189: reconciled mode
internal fun PlayerActivity.showV2189ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2189reconciled
    FeaturePrefsStore.batch2181.v2189reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2189: recorded mode
internal fun PlayerActivity.showV2189RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189recorded
    FeaturePrefsStore.batch2181.v2189recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2189: recovered level
internal fun PlayerActivity.showV2189RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2189recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2189recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2189: recruited level
internal fun PlayerActivity.showV2189RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2189recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2189recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2189: recycled level
internal fun PlayerActivity.showV2189RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2189recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2189recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2189: redirected level
internal fun PlayerActivity.showV2189RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2189redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2189redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2189: reduced level
internal fun PlayerActivity.showV2189ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2189reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2189reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2189: referenced mode
internal fun PlayerActivity.showV2189ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189referenced
    FeaturePrefsStore.batch2181.v2189referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2189: reflected mode
internal fun PlayerActivity.showV2189ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189reflected
    FeaturePrefsStore.batch2181.v2189reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2189: reformed mode
internal fun PlayerActivity.showV2189ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189reformed
    FeaturePrefsStore.batch2181.v2189reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2189: refreshed mode
internal fun PlayerActivity.showV2189RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189refreshed
    FeaturePrefsStore.batch2181.v2189refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2189: refused mode
internal fun PlayerActivity.showV2189RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2189refused
    FeaturePrefsStore.batch2181.v2189refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2190: received mode
internal fun PlayerActivity.showV2190ReceivedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190received
    FeaturePrefsStore.batch2181.v2190received = !current
    AppToast.show(this, "received: ${if (!current) "ON" else "OFF"}")
}

// v2190: recognized mode
internal fun PlayerActivity.showV2190RecognizedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190recognized
    FeaturePrefsStore.batch2181.v2190recognized = !current
    AppToast.show(this, "recognized: ${if (!current) "ON" else "OFF"}")
}

// v2190: recommended mode
internal fun PlayerActivity.showV2190RecommendedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190recommended
    FeaturePrefsStore.batch2181.v2190recommended = !current
    AppToast.show(this, "recommended: ${if (!current) "ON" else "OFF"}")
}

// v2190: reconciled mode
internal fun PlayerActivity.showV2190ReconciledToggle() {
    val current = FeaturePrefsStore.batch2181.v2190reconciled
    FeaturePrefsStore.batch2181.v2190reconciled = !current
    AppToast.show(this, "reconciled: ${if (!current) "ON" else "OFF"}")
}

// v2190: recorded mode
internal fun PlayerActivity.showV2190RecordedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190recorded
    FeaturePrefsStore.batch2181.v2190recorded = !current
    AppToast.show(this, "recorded: ${if (!current) "ON" else "OFF"}")
}

// v2190: recovered level
internal fun PlayerActivity.showV2190RecoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2190recovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2190recovered = value
        AppToast.show(this, "recovered: $value")
    }
}

// v2190: recruited level
internal fun PlayerActivity.showV2190RecruitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2190recruited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recruited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2190recruited = value
        AppToast.show(this, "recruited: $value")
    }
}

// v2190: recycled level
internal fun PlayerActivity.showV2190RecycledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2190recycled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "recycled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2190recycled = value
        AppToast.show(this, "recycled: $value")
    }
}

// v2190: redirected level
internal fun PlayerActivity.showV2190RedirectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2190redirected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "redirected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2190redirected = value
        AppToast.show(this, "redirected: $value")
    }
}

// v2190: reduced level
internal fun PlayerActivity.showV2190ReducedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2181.v2190reduced).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reduced level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2181.v2190reduced = value
        AppToast.show(this, "reduced: $value")
    }
}

// v2190: referenced mode
internal fun PlayerActivity.showV2190ReferencedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190referenced
    FeaturePrefsStore.batch2181.v2190referenced = !current
    AppToast.show(this, "referenced: ${if (!current) "ON" else "OFF"}")
}

// v2190: reflected mode
internal fun PlayerActivity.showV2190ReflectedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190reflected
    FeaturePrefsStore.batch2181.v2190reflected = !current
    AppToast.show(this, "reflected: ${if (!current) "ON" else "OFF"}")
}

// v2190: reformed mode
internal fun PlayerActivity.showV2190ReformedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190reformed
    FeaturePrefsStore.batch2181.v2190reformed = !current
    AppToast.show(this, "reformed: ${if (!current) "ON" else "OFF"}")
}

// v2190: refreshed mode
internal fun PlayerActivity.showV2190RefreshedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190refreshed
    FeaturePrefsStore.batch2181.v2190refreshed = !current
    AppToast.show(this, "refreshed: ${if (!current) "ON" else "OFF"}")
}

// v2190: refused mode
internal fun PlayerActivity.showV2190RefusedToggle() {
    val current = FeaturePrefsStore.batch2181.v2190refused
    FeaturePrefsStore.batch2181.v2190refused = !current
    AppToast.show(this, "refused: ${if (!current) "ON" else "OFF"}")
}

// v2191: registered mode
internal fun PlayerActivity.showV2191RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2191registered
    FeaturePrefsStore.batch2191.v2191registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2191: regulated mode
internal fun PlayerActivity.showV2191RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191regulated
    FeaturePrefsStore.batch2191.v2191regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2191: reinforced mode
internal fun PlayerActivity.showV2191ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191reinforced
    FeaturePrefsStore.batch2191.v2191reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2191: rejected mode
internal fun PlayerActivity.showV2191RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191rejected
    FeaturePrefsStore.batch2191.v2191rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2191: related mode
internal fun PlayerActivity.showV2191RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191related
    FeaturePrefsStore.batch2191.v2191related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2191: relayed level
internal fun PlayerActivity.showV2191RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2191relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2191relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2191: released level
internal fun PlayerActivity.showV2191ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2191released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2191released = value
        AppToast.show(this, "released: $value")
    }
}

// v2191: relied level
internal fun PlayerActivity.showV2191ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2191relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2191relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2191: relocated level
internal fun PlayerActivity.showV2191RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2191relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2191relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2191: remained level
internal fun PlayerActivity.showV2191RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2191remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2191remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2191: remembered mode
internal fun PlayerActivity.showV2191RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191remembered
    FeaturePrefsStore.batch2191.v2191remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2191: removed mode
internal fun PlayerActivity.showV2191RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191removed
    FeaturePrefsStore.batch2191.v2191removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2191: rendered mode
internal fun PlayerActivity.showV2191RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191rendered
    FeaturePrefsStore.batch2191.v2191rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2191: renewed mode
internal fun PlayerActivity.showV2191RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191renewed
    FeaturePrefsStore.batch2191.v2191renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2191: reopened mode
internal fun PlayerActivity.showV2191ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2191reopened
    FeaturePrefsStore.batch2191.v2191reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2192: registered mode
internal fun PlayerActivity.showV2192RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2192registered
    FeaturePrefsStore.batch2191.v2192registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2192: regulated mode
internal fun PlayerActivity.showV2192RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192regulated
    FeaturePrefsStore.batch2191.v2192regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2192: reinforced mode
internal fun PlayerActivity.showV2192ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192reinforced
    FeaturePrefsStore.batch2191.v2192reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2192: rejected mode
internal fun PlayerActivity.showV2192RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192rejected
    FeaturePrefsStore.batch2191.v2192rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2192: related mode
internal fun PlayerActivity.showV2192RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192related
    FeaturePrefsStore.batch2191.v2192related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2192: relayed level
internal fun PlayerActivity.showV2192RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2192relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2192relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2192: released level
internal fun PlayerActivity.showV2192ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2192released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2192released = value
        AppToast.show(this, "released: $value")
    }
}

// v2192: relied level
internal fun PlayerActivity.showV2192ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2192relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2192relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2192: relocated level
internal fun PlayerActivity.showV2192RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2192relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2192relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2192: remained level
internal fun PlayerActivity.showV2192RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2192remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2192remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2192: remembered mode
internal fun PlayerActivity.showV2192RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192remembered
    FeaturePrefsStore.batch2191.v2192remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2192: removed mode
internal fun PlayerActivity.showV2192RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192removed
    FeaturePrefsStore.batch2191.v2192removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2192: rendered mode
internal fun PlayerActivity.showV2192RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192rendered
    FeaturePrefsStore.batch2191.v2192rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2192: renewed mode
internal fun PlayerActivity.showV2192RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192renewed
    FeaturePrefsStore.batch2191.v2192renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2192: reopened mode
internal fun PlayerActivity.showV2192ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2192reopened
    FeaturePrefsStore.batch2191.v2192reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2193: registered mode
internal fun PlayerActivity.showV2193RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2193registered
    FeaturePrefsStore.batch2191.v2193registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2193: regulated mode
internal fun PlayerActivity.showV2193RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193regulated
    FeaturePrefsStore.batch2191.v2193regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2193: reinforced mode
internal fun PlayerActivity.showV2193ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193reinforced
    FeaturePrefsStore.batch2191.v2193reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2193: rejected mode
internal fun PlayerActivity.showV2193RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193rejected
    FeaturePrefsStore.batch2191.v2193rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2193: related mode
internal fun PlayerActivity.showV2193RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193related
    FeaturePrefsStore.batch2191.v2193related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2193: relayed level
internal fun PlayerActivity.showV2193RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2193relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2193relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2193: released level
internal fun PlayerActivity.showV2193ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2193released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2193released = value
        AppToast.show(this, "released: $value")
    }
}

// v2193: relied level
internal fun PlayerActivity.showV2193ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2193relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2193relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2193: relocated level
internal fun PlayerActivity.showV2193RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2193relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2193relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2193: remained level
internal fun PlayerActivity.showV2193RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2193remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2193remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2193: remembered mode
internal fun PlayerActivity.showV2193RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193remembered
    FeaturePrefsStore.batch2191.v2193remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2193: removed mode
internal fun PlayerActivity.showV2193RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193removed
    FeaturePrefsStore.batch2191.v2193removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2193: rendered mode
internal fun PlayerActivity.showV2193RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193rendered
    FeaturePrefsStore.batch2191.v2193rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2193: renewed mode
internal fun PlayerActivity.showV2193RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193renewed
    FeaturePrefsStore.batch2191.v2193renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2193: reopened mode
internal fun PlayerActivity.showV2193ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2193reopened
    FeaturePrefsStore.batch2191.v2193reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2194: registered mode
internal fun PlayerActivity.showV2194RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2194registered
    FeaturePrefsStore.batch2191.v2194registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2194: regulated mode
internal fun PlayerActivity.showV2194RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194regulated
    FeaturePrefsStore.batch2191.v2194regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2194: reinforced mode
internal fun PlayerActivity.showV2194ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194reinforced
    FeaturePrefsStore.batch2191.v2194reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2194: rejected mode
internal fun PlayerActivity.showV2194RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194rejected
    FeaturePrefsStore.batch2191.v2194rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2194: related mode
internal fun PlayerActivity.showV2194RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194related
    FeaturePrefsStore.batch2191.v2194related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2194: relayed level
internal fun PlayerActivity.showV2194RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2194relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2194relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2194: released level
internal fun PlayerActivity.showV2194ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2194released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2194released = value
        AppToast.show(this, "released: $value")
    }
}

// v2194: relied level
internal fun PlayerActivity.showV2194ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2194relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2194relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2194: relocated level
internal fun PlayerActivity.showV2194RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2194relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2194relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2194: remained level
internal fun PlayerActivity.showV2194RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2194remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2194remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2194: remembered mode
internal fun PlayerActivity.showV2194RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194remembered
    FeaturePrefsStore.batch2191.v2194remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2194: removed mode
internal fun PlayerActivity.showV2194RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194removed
    FeaturePrefsStore.batch2191.v2194removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2194: rendered mode
internal fun PlayerActivity.showV2194RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194rendered
    FeaturePrefsStore.batch2191.v2194rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2194: renewed mode
internal fun PlayerActivity.showV2194RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194renewed
    FeaturePrefsStore.batch2191.v2194renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2194: reopened mode
internal fun PlayerActivity.showV2194ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2194reopened
    FeaturePrefsStore.batch2191.v2194reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2195: registered mode
internal fun PlayerActivity.showV2195RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2195registered
    FeaturePrefsStore.batch2191.v2195registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2195: regulated mode
internal fun PlayerActivity.showV2195RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195regulated
    FeaturePrefsStore.batch2191.v2195regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2195: reinforced mode
internal fun PlayerActivity.showV2195ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195reinforced
    FeaturePrefsStore.batch2191.v2195reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2195: rejected mode
internal fun PlayerActivity.showV2195RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195rejected
    FeaturePrefsStore.batch2191.v2195rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2195: related mode
internal fun PlayerActivity.showV2195RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195related
    FeaturePrefsStore.batch2191.v2195related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2195: relayed level
internal fun PlayerActivity.showV2195RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2195relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2195relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2195: released level
internal fun PlayerActivity.showV2195ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2195released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2195released = value
        AppToast.show(this, "released: $value")
    }
}

// v2195: relied level
internal fun PlayerActivity.showV2195ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2195relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2195relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2195: relocated level
internal fun PlayerActivity.showV2195RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2195relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2195relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2195: remained level
internal fun PlayerActivity.showV2195RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2195remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2195remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2195: remembered mode
internal fun PlayerActivity.showV2195RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195remembered
    FeaturePrefsStore.batch2191.v2195remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2195: removed mode
internal fun PlayerActivity.showV2195RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195removed
    FeaturePrefsStore.batch2191.v2195removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2195: rendered mode
internal fun PlayerActivity.showV2195RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195rendered
    FeaturePrefsStore.batch2191.v2195rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2195: renewed mode
internal fun PlayerActivity.showV2195RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195renewed
    FeaturePrefsStore.batch2191.v2195renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2195: reopened mode
internal fun PlayerActivity.showV2195ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2195reopened
    FeaturePrefsStore.batch2191.v2195reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2196: registered mode
internal fun PlayerActivity.showV2196RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2196registered
    FeaturePrefsStore.batch2191.v2196registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2196: regulated mode
internal fun PlayerActivity.showV2196RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196regulated
    FeaturePrefsStore.batch2191.v2196regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2196: reinforced mode
internal fun PlayerActivity.showV2196ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196reinforced
    FeaturePrefsStore.batch2191.v2196reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2196: rejected mode
internal fun PlayerActivity.showV2196RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196rejected
    FeaturePrefsStore.batch2191.v2196rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2196: related mode
internal fun PlayerActivity.showV2196RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196related
    FeaturePrefsStore.batch2191.v2196related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2196: relayed level
internal fun PlayerActivity.showV2196RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2196relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2196relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2196: released level
internal fun PlayerActivity.showV2196ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2196released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2196released = value
        AppToast.show(this, "released: $value")
    }
}

// v2196: relied level
internal fun PlayerActivity.showV2196ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2196relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2196relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2196: relocated level
internal fun PlayerActivity.showV2196RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2196relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2196relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2196: remained level
internal fun PlayerActivity.showV2196RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2196remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2196remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2196: remembered mode
internal fun PlayerActivity.showV2196RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196remembered
    FeaturePrefsStore.batch2191.v2196remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2196: removed mode
internal fun PlayerActivity.showV2196RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196removed
    FeaturePrefsStore.batch2191.v2196removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2196: rendered mode
internal fun PlayerActivity.showV2196RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196rendered
    FeaturePrefsStore.batch2191.v2196rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2196: renewed mode
internal fun PlayerActivity.showV2196RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196renewed
    FeaturePrefsStore.batch2191.v2196renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2196: reopened mode
internal fun PlayerActivity.showV2196ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2196reopened
    FeaturePrefsStore.batch2191.v2196reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2197: registered mode
internal fun PlayerActivity.showV2197RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2197registered
    FeaturePrefsStore.batch2191.v2197registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2197: regulated mode
internal fun PlayerActivity.showV2197RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197regulated
    FeaturePrefsStore.batch2191.v2197regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2197: reinforced mode
internal fun PlayerActivity.showV2197ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197reinforced
    FeaturePrefsStore.batch2191.v2197reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2197: rejected mode
internal fun PlayerActivity.showV2197RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197rejected
    FeaturePrefsStore.batch2191.v2197rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2197: related mode
internal fun PlayerActivity.showV2197RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197related
    FeaturePrefsStore.batch2191.v2197related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2197: relayed level
internal fun PlayerActivity.showV2197RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2197relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2197relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2197: released level
internal fun PlayerActivity.showV2197ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2197released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2197released = value
        AppToast.show(this, "released: $value")
    }
}

// v2197: relied level
internal fun PlayerActivity.showV2197ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2197relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2197relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2197: relocated level
internal fun PlayerActivity.showV2197RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2197relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2197relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2197: remained level
internal fun PlayerActivity.showV2197RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2197remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2197remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2197: remembered mode
internal fun PlayerActivity.showV2197RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197remembered
    FeaturePrefsStore.batch2191.v2197remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2197: removed mode
internal fun PlayerActivity.showV2197RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197removed
    FeaturePrefsStore.batch2191.v2197removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2197: rendered mode
internal fun PlayerActivity.showV2197RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197rendered
    FeaturePrefsStore.batch2191.v2197rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2197: renewed mode
internal fun PlayerActivity.showV2197RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197renewed
    FeaturePrefsStore.batch2191.v2197renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2197: reopened mode
internal fun PlayerActivity.showV2197ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2197reopened
    FeaturePrefsStore.batch2191.v2197reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2198: registered mode
internal fun PlayerActivity.showV2198RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2198registered
    FeaturePrefsStore.batch2191.v2198registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2198: regulated mode
internal fun PlayerActivity.showV2198RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198regulated
    FeaturePrefsStore.batch2191.v2198regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2198: reinforced mode
internal fun PlayerActivity.showV2198ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198reinforced
    FeaturePrefsStore.batch2191.v2198reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2198: rejected mode
internal fun PlayerActivity.showV2198RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198rejected
    FeaturePrefsStore.batch2191.v2198rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2198: related mode
internal fun PlayerActivity.showV2198RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198related
    FeaturePrefsStore.batch2191.v2198related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2198: relayed level
internal fun PlayerActivity.showV2198RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2198relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2198relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2198: released level
internal fun PlayerActivity.showV2198ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2198released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2198released = value
        AppToast.show(this, "released: $value")
    }
}

// v2198: relied level
internal fun PlayerActivity.showV2198ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2198relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2198relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2198: relocated level
internal fun PlayerActivity.showV2198RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2198relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2198relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2198: remained level
internal fun PlayerActivity.showV2198RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2198remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2198remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2198: remembered mode
internal fun PlayerActivity.showV2198RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198remembered
    FeaturePrefsStore.batch2191.v2198remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2198: removed mode
internal fun PlayerActivity.showV2198RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198removed
    FeaturePrefsStore.batch2191.v2198removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2198: rendered mode
internal fun PlayerActivity.showV2198RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198rendered
    FeaturePrefsStore.batch2191.v2198rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2198: renewed mode
internal fun PlayerActivity.showV2198RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198renewed
    FeaturePrefsStore.batch2191.v2198renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2198: reopened mode
internal fun PlayerActivity.showV2198ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2198reopened
    FeaturePrefsStore.batch2191.v2198reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2199: registered mode
internal fun PlayerActivity.showV2199RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2199registered
    FeaturePrefsStore.batch2191.v2199registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2199: regulated mode
internal fun PlayerActivity.showV2199RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199regulated
    FeaturePrefsStore.batch2191.v2199regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2199: reinforced mode
internal fun PlayerActivity.showV2199ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199reinforced
    FeaturePrefsStore.batch2191.v2199reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2199: rejected mode
internal fun PlayerActivity.showV2199RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199rejected
    FeaturePrefsStore.batch2191.v2199rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2199: related mode
internal fun PlayerActivity.showV2199RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199related
    FeaturePrefsStore.batch2191.v2199related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2199: relayed level
internal fun PlayerActivity.showV2199RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2199relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2199relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2199: released level
internal fun PlayerActivity.showV2199ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2199released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2199released = value
        AppToast.show(this, "released: $value")
    }
}

// v2199: relied level
internal fun PlayerActivity.showV2199ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2199relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2199relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2199: relocated level
internal fun PlayerActivity.showV2199RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2199relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2199relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2199: remained level
internal fun PlayerActivity.showV2199RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2199remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2199remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2199: remembered mode
internal fun PlayerActivity.showV2199RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199remembered
    FeaturePrefsStore.batch2191.v2199remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2199: removed mode
internal fun PlayerActivity.showV2199RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199removed
    FeaturePrefsStore.batch2191.v2199removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2199: rendered mode
internal fun PlayerActivity.showV2199RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199rendered
    FeaturePrefsStore.batch2191.v2199rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2199: renewed mode
internal fun PlayerActivity.showV2199RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199renewed
    FeaturePrefsStore.batch2191.v2199renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2199: reopened mode
internal fun PlayerActivity.showV2199ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2199reopened
    FeaturePrefsStore.batch2191.v2199reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2200: registered mode
internal fun PlayerActivity.showV2200RegisteredToggle() {
    val current = FeaturePrefsStore.batch2191.v2200registered
    FeaturePrefsStore.batch2191.v2200registered = !current
    AppToast.show(this, "registered: ${if (!current) "ON" else "OFF"}")
}

// v2200: regulated mode
internal fun PlayerActivity.showV2200RegulatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200regulated
    FeaturePrefsStore.batch2191.v2200regulated = !current
    AppToast.show(this, "regulated: ${if (!current) "ON" else "OFF"}")
}

// v2200: reinforced mode
internal fun PlayerActivity.showV2200ReinforcedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200reinforced
    FeaturePrefsStore.batch2191.v2200reinforced = !current
    AppToast.show(this, "reinforced: ${if (!current) "ON" else "OFF"}")
}

// v2200: rejected mode
internal fun PlayerActivity.showV2200RejectedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200rejected
    FeaturePrefsStore.batch2191.v2200rejected = !current
    AppToast.show(this, "rejected: ${if (!current) "ON" else "OFF"}")
}

// v2200: related mode
internal fun PlayerActivity.showV2200RelatedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200related
    FeaturePrefsStore.batch2191.v2200related = !current
    AppToast.show(this, "related: ${if (!current) "ON" else "OFF"}")
}

// v2200: relayed level
internal fun PlayerActivity.showV2200RelayedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2200relayed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relayed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2200relayed = value
        AppToast.show(this, "relayed: $value")
    }
}

// v2200: released level
internal fun PlayerActivity.showV2200ReleasedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2200released).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "released level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2200released = value
        AppToast.show(this, "released: $value")
    }
}

// v2200: relied level
internal fun PlayerActivity.showV2200ReliedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2200relied).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relied level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2200relied = value
        AppToast.show(this, "relied: $value")
    }
}

// v2200: relocated level
internal fun PlayerActivity.showV2200RelocatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2200relocated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "relocated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2200relocated = value
        AppToast.show(this, "relocated: $value")
    }
}

// v2200: remained level
internal fun PlayerActivity.showV2200RemainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2191.v2200remained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "remained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2191.v2200remained = value
        AppToast.show(this, "remained: $value")
    }
}

// v2200: remembered mode
internal fun PlayerActivity.showV2200RememberedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200remembered
    FeaturePrefsStore.batch2191.v2200remembered = !current
    AppToast.show(this, "remembered: ${if (!current) "ON" else "OFF"}")
}

// v2200: removed mode
internal fun PlayerActivity.showV2200RemovedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200removed
    FeaturePrefsStore.batch2191.v2200removed = !current
    AppToast.show(this, "removed: ${if (!current) "ON" else "OFF"}")
}

// v2200: rendered mode
internal fun PlayerActivity.showV2200RenderedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200rendered
    FeaturePrefsStore.batch2191.v2200rendered = !current
    AppToast.show(this, "rendered: ${if (!current) "ON" else "OFF"}")
}

// v2200: renewed mode
internal fun PlayerActivity.showV2200RenewedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200renewed
    FeaturePrefsStore.batch2191.v2200renewed = !current
    AppToast.show(this, "renewed: ${if (!current) "ON" else "OFF"}")
}

// v2200: reopened mode
internal fun PlayerActivity.showV2200ReopenedToggle() {
    val current = FeaturePrefsStore.batch2191.v2200reopened
    FeaturePrefsStore.batch2191.v2200reopened = !current
    AppToast.show(this, "reopened: ${if (!current) "ON" else "OFF"}")
}

// v2201: replaced mode
internal fun PlayerActivity.showV2201ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201replaced
    FeaturePrefsStore.batch2201.v2201replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2201: replied mode
internal fun PlayerActivity.showV2201RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201replied
    FeaturePrefsStore.batch2201.v2201replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2201: reported mode
internal fun PlayerActivity.showV2201ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201reported
    FeaturePrefsStore.batch2201.v2201reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2201: represented mode
internal fun PlayerActivity.showV2201RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201represented
    FeaturePrefsStore.batch2201.v2201represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2201: reproduced mode
internal fun PlayerActivity.showV2201ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201reproduced
    FeaturePrefsStore.batch2201.v2201reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2201: requested level
internal fun PlayerActivity.showV2201RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2201requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2201requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2201: required level
internal fun PlayerActivity.showV2201RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2201required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2201required = value
        AppToast.show(this, "required: $value")
    }
}

// v2201: researched level
internal fun PlayerActivity.showV2201ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2201researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2201researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2201: reserved level
internal fun PlayerActivity.showV2201ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2201reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2201reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2201: resided level
internal fun PlayerActivity.showV2201ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2201resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2201resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2201: resigned mode
internal fun PlayerActivity.showV2201ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201resigned
    FeaturePrefsStore.batch2201.v2201resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2201: resisted mode
internal fun PlayerActivity.showV2201ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201resisted
    FeaturePrefsStore.batch2201.v2201resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2201: resolved mode
internal fun PlayerActivity.showV2201ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201resolved
    FeaturePrefsStore.batch2201.v2201resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2201: responded mode
internal fun PlayerActivity.showV2201RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2201responded
    FeaturePrefsStore.batch2201.v2201responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2201: restored mode
internal fun PlayerActivity.showV2201RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2201restored
    FeaturePrefsStore.batch2201.v2201restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2202: replaced mode
internal fun PlayerActivity.showV2202ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202replaced
    FeaturePrefsStore.batch2201.v2202replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2202: replied mode
internal fun PlayerActivity.showV2202RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202replied
    FeaturePrefsStore.batch2201.v2202replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2202: reported mode
internal fun PlayerActivity.showV2202ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202reported
    FeaturePrefsStore.batch2201.v2202reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2202: represented mode
internal fun PlayerActivity.showV2202RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202represented
    FeaturePrefsStore.batch2201.v2202represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2202: reproduced mode
internal fun PlayerActivity.showV2202ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202reproduced
    FeaturePrefsStore.batch2201.v2202reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2202: requested level
internal fun PlayerActivity.showV2202RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2202requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2202requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2202: required level
internal fun PlayerActivity.showV2202RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2202required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2202required = value
        AppToast.show(this, "required: $value")
    }
}

// v2202: researched level
internal fun PlayerActivity.showV2202ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2202researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2202researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2202: reserved level
internal fun PlayerActivity.showV2202ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2202reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2202reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2202: resided level
internal fun PlayerActivity.showV2202ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2202resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2202resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2202: resigned mode
internal fun PlayerActivity.showV2202ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202resigned
    FeaturePrefsStore.batch2201.v2202resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2202: resisted mode
internal fun PlayerActivity.showV2202ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202resisted
    FeaturePrefsStore.batch2201.v2202resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2202: resolved mode
internal fun PlayerActivity.showV2202ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202resolved
    FeaturePrefsStore.batch2201.v2202resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2202: responded mode
internal fun PlayerActivity.showV2202RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2202responded
    FeaturePrefsStore.batch2201.v2202responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2202: restored mode
internal fun PlayerActivity.showV2202RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2202restored
    FeaturePrefsStore.batch2201.v2202restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2203: replaced mode
internal fun PlayerActivity.showV2203ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203replaced
    FeaturePrefsStore.batch2201.v2203replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2203: replied mode
internal fun PlayerActivity.showV2203RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203replied
    FeaturePrefsStore.batch2201.v2203replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2203: reported mode
internal fun PlayerActivity.showV2203ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203reported
    FeaturePrefsStore.batch2201.v2203reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2203: represented mode
internal fun PlayerActivity.showV2203RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203represented
    FeaturePrefsStore.batch2201.v2203represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2203: reproduced mode
internal fun PlayerActivity.showV2203ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203reproduced
    FeaturePrefsStore.batch2201.v2203reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2203: requested level
internal fun PlayerActivity.showV2203RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2203requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2203requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2203: required level
internal fun PlayerActivity.showV2203RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2203required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2203required = value
        AppToast.show(this, "required: $value")
    }
}

// v2203: researched level
internal fun PlayerActivity.showV2203ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2203researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2203researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2203: reserved level
internal fun PlayerActivity.showV2203ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2203reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2203reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2203: resided level
internal fun PlayerActivity.showV2203ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2203resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2203resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2203: resigned mode
internal fun PlayerActivity.showV2203ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203resigned
    FeaturePrefsStore.batch2201.v2203resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2203: resisted mode
internal fun PlayerActivity.showV2203ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203resisted
    FeaturePrefsStore.batch2201.v2203resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2203: resolved mode
internal fun PlayerActivity.showV2203ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203resolved
    FeaturePrefsStore.batch2201.v2203resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2203: responded mode
internal fun PlayerActivity.showV2203RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2203responded
    FeaturePrefsStore.batch2201.v2203responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2203: restored mode
internal fun PlayerActivity.showV2203RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2203restored
    FeaturePrefsStore.batch2201.v2203restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2204: replaced mode
internal fun PlayerActivity.showV2204ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204replaced
    FeaturePrefsStore.batch2201.v2204replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2204: replied mode
internal fun PlayerActivity.showV2204RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204replied
    FeaturePrefsStore.batch2201.v2204replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2204: reported mode
internal fun PlayerActivity.showV2204ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204reported
    FeaturePrefsStore.batch2201.v2204reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2204: represented mode
internal fun PlayerActivity.showV2204RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204represented
    FeaturePrefsStore.batch2201.v2204represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2204: reproduced mode
internal fun PlayerActivity.showV2204ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204reproduced
    FeaturePrefsStore.batch2201.v2204reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2204: requested level
internal fun PlayerActivity.showV2204RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2204requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2204requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2204: required level
internal fun PlayerActivity.showV2204RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2204required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2204required = value
        AppToast.show(this, "required: $value")
    }
}

// v2204: researched level
internal fun PlayerActivity.showV2204ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2204researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2204researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2204: reserved level
internal fun PlayerActivity.showV2204ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2204reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2204reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2204: resided level
internal fun PlayerActivity.showV2204ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2204resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2204resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2204: resigned mode
internal fun PlayerActivity.showV2204ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204resigned
    FeaturePrefsStore.batch2201.v2204resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2204: resisted mode
internal fun PlayerActivity.showV2204ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204resisted
    FeaturePrefsStore.batch2201.v2204resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2204: resolved mode
internal fun PlayerActivity.showV2204ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204resolved
    FeaturePrefsStore.batch2201.v2204resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2204: responded mode
internal fun PlayerActivity.showV2204RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2204responded
    FeaturePrefsStore.batch2201.v2204responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2204: restored mode
internal fun PlayerActivity.showV2204RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2204restored
    FeaturePrefsStore.batch2201.v2204restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2205: replaced mode
internal fun PlayerActivity.showV2205ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205replaced
    FeaturePrefsStore.batch2201.v2205replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2205: replied mode
internal fun PlayerActivity.showV2205RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205replied
    FeaturePrefsStore.batch2201.v2205replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2205: reported mode
internal fun PlayerActivity.showV2205ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205reported
    FeaturePrefsStore.batch2201.v2205reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2205: represented mode
internal fun PlayerActivity.showV2205RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205represented
    FeaturePrefsStore.batch2201.v2205represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2205: reproduced mode
internal fun PlayerActivity.showV2205ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205reproduced
    FeaturePrefsStore.batch2201.v2205reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2205: requested level
internal fun PlayerActivity.showV2205RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2205requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2205requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2205: required level
internal fun PlayerActivity.showV2205RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2205required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2205required = value
        AppToast.show(this, "required: $value")
    }
}

// v2205: researched level
internal fun PlayerActivity.showV2205ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2205researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2205researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2205: reserved level
internal fun PlayerActivity.showV2205ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2205reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2205reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2205: resided level
internal fun PlayerActivity.showV2205ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2205resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2205resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2205: resigned mode
internal fun PlayerActivity.showV2205ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205resigned
    FeaturePrefsStore.batch2201.v2205resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2205: resisted mode
internal fun PlayerActivity.showV2205ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205resisted
    FeaturePrefsStore.batch2201.v2205resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2205: resolved mode
internal fun PlayerActivity.showV2205ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205resolved
    FeaturePrefsStore.batch2201.v2205resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2205: responded mode
internal fun PlayerActivity.showV2205RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2205responded
    FeaturePrefsStore.batch2201.v2205responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2205: restored mode
internal fun PlayerActivity.showV2205RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2205restored
    FeaturePrefsStore.batch2201.v2205restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2206: replaced mode
internal fun PlayerActivity.showV2206ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206replaced
    FeaturePrefsStore.batch2201.v2206replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2206: replied mode
internal fun PlayerActivity.showV2206RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206replied
    FeaturePrefsStore.batch2201.v2206replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2206: reported mode
internal fun PlayerActivity.showV2206ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206reported
    FeaturePrefsStore.batch2201.v2206reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2206: represented mode
internal fun PlayerActivity.showV2206RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206represented
    FeaturePrefsStore.batch2201.v2206represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2206: reproduced mode
internal fun PlayerActivity.showV2206ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206reproduced
    FeaturePrefsStore.batch2201.v2206reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2206: requested level
internal fun PlayerActivity.showV2206RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2206requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2206requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2206: required level
internal fun PlayerActivity.showV2206RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2206required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2206required = value
        AppToast.show(this, "required: $value")
    }
}

// v2206: researched level
internal fun PlayerActivity.showV2206ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2206researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2206researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2206: reserved level
internal fun PlayerActivity.showV2206ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2206reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2206reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2206: resided level
internal fun PlayerActivity.showV2206ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2206resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2206resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2206: resigned mode
internal fun PlayerActivity.showV2206ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206resigned
    FeaturePrefsStore.batch2201.v2206resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2206: resisted mode
internal fun PlayerActivity.showV2206ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206resisted
    FeaturePrefsStore.batch2201.v2206resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2206: resolved mode
internal fun PlayerActivity.showV2206ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206resolved
    FeaturePrefsStore.batch2201.v2206resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2206: responded mode
internal fun PlayerActivity.showV2206RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2206responded
    FeaturePrefsStore.batch2201.v2206responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2206: restored mode
internal fun PlayerActivity.showV2206RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2206restored
    FeaturePrefsStore.batch2201.v2206restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2207: replaced mode
internal fun PlayerActivity.showV2207ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207replaced
    FeaturePrefsStore.batch2201.v2207replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2207: replied mode
internal fun PlayerActivity.showV2207RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207replied
    FeaturePrefsStore.batch2201.v2207replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2207: reported mode
internal fun PlayerActivity.showV2207ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207reported
    FeaturePrefsStore.batch2201.v2207reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2207: represented mode
internal fun PlayerActivity.showV2207RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207represented
    FeaturePrefsStore.batch2201.v2207represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2207: reproduced mode
internal fun PlayerActivity.showV2207ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207reproduced
    FeaturePrefsStore.batch2201.v2207reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2207: requested level
internal fun PlayerActivity.showV2207RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2207requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2207requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2207: required level
internal fun PlayerActivity.showV2207RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2207required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2207required = value
        AppToast.show(this, "required: $value")
    }
}

// v2207: researched level
internal fun PlayerActivity.showV2207ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2207researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2207researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2207: reserved level
internal fun PlayerActivity.showV2207ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2207reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2207reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2207: resided level
internal fun PlayerActivity.showV2207ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2207resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2207resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2207: resigned mode
internal fun PlayerActivity.showV2207ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207resigned
    FeaturePrefsStore.batch2201.v2207resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2207: resisted mode
internal fun PlayerActivity.showV2207ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207resisted
    FeaturePrefsStore.batch2201.v2207resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2207: resolved mode
internal fun PlayerActivity.showV2207ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207resolved
    FeaturePrefsStore.batch2201.v2207resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2207: responded mode
internal fun PlayerActivity.showV2207RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2207responded
    FeaturePrefsStore.batch2201.v2207responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2207: restored mode
internal fun PlayerActivity.showV2207RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2207restored
    FeaturePrefsStore.batch2201.v2207restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2208: replaced mode
internal fun PlayerActivity.showV2208ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208replaced
    FeaturePrefsStore.batch2201.v2208replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2208: replied mode
internal fun PlayerActivity.showV2208RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208replied
    FeaturePrefsStore.batch2201.v2208replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2208: reported mode
internal fun PlayerActivity.showV2208ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208reported
    FeaturePrefsStore.batch2201.v2208reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2208: represented mode
internal fun PlayerActivity.showV2208RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208represented
    FeaturePrefsStore.batch2201.v2208represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2208: reproduced mode
internal fun PlayerActivity.showV2208ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208reproduced
    FeaturePrefsStore.batch2201.v2208reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2208: requested level
internal fun PlayerActivity.showV2208RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2208requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2208requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2208: required level
internal fun PlayerActivity.showV2208RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2208required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2208required = value
        AppToast.show(this, "required: $value")
    }
}

// v2208: researched level
internal fun PlayerActivity.showV2208ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2208researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2208researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2208: reserved level
internal fun PlayerActivity.showV2208ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2208reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2208reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2208: resided level
internal fun PlayerActivity.showV2208ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2208resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2208resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2208: resigned mode
internal fun PlayerActivity.showV2208ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208resigned
    FeaturePrefsStore.batch2201.v2208resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2208: resisted mode
internal fun PlayerActivity.showV2208ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208resisted
    FeaturePrefsStore.batch2201.v2208resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2208: resolved mode
internal fun PlayerActivity.showV2208ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208resolved
    FeaturePrefsStore.batch2201.v2208resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2208: responded mode
internal fun PlayerActivity.showV2208RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2208responded
    FeaturePrefsStore.batch2201.v2208responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2208: restored mode
internal fun PlayerActivity.showV2208RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2208restored
    FeaturePrefsStore.batch2201.v2208restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2209: replaced mode
internal fun PlayerActivity.showV2209ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209replaced
    FeaturePrefsStore.batch2201.v2209replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2209: replied mode
internal fun PlayerActivity.showV2209RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209replied
    FeaturePrefsStore.batch2201.v2209replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2209: reported mode
internal fun PlayerActivity.showV2209ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209reported
    FeaturePrefsStore.batch2201.v2209reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2209: represented mode
internal fun PlayerActivity.showV2209RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209represented
    FeaturePrefsStore.batch2201.v2209represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2209: reproduced mode
internal fun PlayerActivity.showV2209ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209reproduced
    FeaturePrefsStore.batch2201.v2209reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2209: requested level
internal fun PlayerActivity.showV2209RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2209requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2209requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2209: required level
internal fun PlayerActivity.showV2209RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2209required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2209required = value
        AppToast.show(this, "required: $value")
    }
}

// v2209: researched level
internal fun PlayerActivity.showV2209ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2209researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2209researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2209: reserved level
internal fun PlayerActivity.showV2209ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2209reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2209reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2209: resided level
internal fun PlayerActivity.showV2209ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2209resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2209resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2209: resigned mode
internal fun PlayerActivity.showV2209ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209resigned
    FeaturePrefsStore.batch2201.v2209resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2209: resisted mode
internal fun PlayerActivity.showV2209ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209resisted
    FeaturePrefsStore.batch2201.v2209resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2209: resolved mode
internal fun PlayerActivity.showV2209ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209resolved
    FeaturePrefsStore.batch2201.v2209resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2209: responded mode
internal fun PlayerActivity.showV2209RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2209responded
    FeaturePrefsStore.batch2201.v2209responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2209: restored mode
internal fun PlayerActivity.showV2209RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2209restored
    FeaturePrefsStore.batch2201.v2209restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}

// v2210: replaced mode
internal fun PlayerActivity.showV2210ReplacedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210replaced
    FeaturePrefsStore.batch2201.v2210replaced = !current
    AppToast.show(this, "replaced: ${if (!current) "ON" else "OFF"}")
}

// v2210: replied mode
internal fun PlayerActivity.showV2210RepliedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210replied
    FeaturePrefsStore.batch2201.v2210replied = !current
    AppToast.show(this, "replied: ${if (!current) "ON" else "OFF"}")
}

// v2210: reported mode
internal fun PlayerActivity.showV2210ReportedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210reported
    FeaturePrefsStore.batch2201.v2210reported = !current
    AppToast.show(this, "reported: ${if (!current) "ON" else "OFF"}")
}

// v2210: represented mode
internal fun PlayerActivity.showV2210RepresentedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210represented
    FeaturePrefsStore.batch2201.v2210represented = !current
    AppToast.show(this, "represented: ${if (!current) "ON" else "OFF"}")
}

// v2210: reproduced mode
internal fun PlayerActivity.showV2210ReproducedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210reproduced
    FeaturePrefsStore.batch2201.v2210reproduced = !current
    AppToast.show(this, "reproduced: ${if (!current) "ON" else "OFF"}")
}

// v2210: requested level
internal fun PlayerActivity.showV2210RequestedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2210requested).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "requested level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2210requested = value
        AppToast.show(this, "requested: $value")
    }
}

// v2210: required level
internal fun PlayerActivity.showV2210RequiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2210required).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "required level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2210required = value
        AppToast.show(this, "required: $value")
    }
}

// v2210: researched level
internal fun PlayerActivity.showV2210ResearchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2210researched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "researched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2210researched = value
        AppToast.show(this, "researched: $value")
    }
}

// v2210: reserved level
internal fun PlayerActivity.showV2210ReservedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2210reserved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reserved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2210reserved = value
        AppToast.show(this, "reserved: $value")
    }
}

// v2210: resided level
internal fun PlayerActivity.showV2210ResidedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2201.v2210resided).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resided level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2201.v2210resided = value
        AppToast.show(this, "resided: $value")
    }
}

// v2210: resigned mode
internal fun PlayerActivity.showV2210ResignedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210resigned
    FeaturePrefsStore.batch2201.v2210resigned = !current
    AppToast.show(this, "resigned: ${if (!current) "ON" else "OFF"}")
}

// v2210: resisted mode
internal fun PlayerActivity.showV2210ResistedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210resisted
    FeaturePrefsStore.batch2201.v2210resisted = !current
    AppToast.show(this, "resisted: ${if (!current) "ON" else "OFF"}")
}

// v2210: resolved mode
internal fun PlayerActivity.showV2210ResolvedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210resolved
    FeaturePrefsStore.batch2201.v2210resolved = !current
    AppToast.show(this, "resolved: ${if (!current) "ON" else "OFF"}")
}

// v2210: responded mode
internal fun PlayerActivity.showV2210RespondedToggle() {
    val current = FeaturePrefsStore.batch2201.v2210responded
    FeaturePrefsStore.batch2201.v2210responded = !current
    AppToast.show(this, "responded: ${if (!current) "ON" else "OFF"}")
}

// v2210: restored mode
internal fun PlayerActivity.showV2210RestoredToggle() {
    val current = FeaturePrefsStore.batch2201.v2210restored
    FeaturePrefsStore.batch2201.v2210restored = !current
    AppToast.show(this, "restored: ${if (!current) "ON" else "OFF"}")
}
