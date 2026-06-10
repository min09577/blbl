package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v236: Volume Boost Peak236
internal fun PlayerActivity.showV236VolumeBoostPeak236Toggle() {
    val current = BiliClient.prefs.v236volumeBoostPeak236
    BiliClient.prefs.v236volumeBoostPeak236 = !current
    AppToast.show(this, "Volume Boost Peak236: ${if (!current) "ON" else "OFF"}")
}

// v236: History Bookmark Export236
internal fun PlayerActivity.showV236HistoryBookmarkExport236Toggle() {
    val current = BiliClient.prefs.v236historyBookmarkExport236
    BiliClient.prefs.v236historyBookmarkExport236 = !current
    AppToast.show(this, "History Bookmark Export236: ${if (!current) "ON" else "OFF"}")
}

// v236: Playback Chapter Sync236
internal fun PlayerActivity.showV236PlaybackChapterSync236Toggle() {
    val current = BiliClient.prefs.v236playbackChapterSync236
    BiliClient.prefs.v236playbackChapterSync236 = !current
    AppToast.show(this, "Playback Chapter Sync236: ${if (!current) "ON" else "OFF"}")
}

// v236: Screenshot Save Path236
internal fun PlayerActivity.showV236ScreenshotSavePath236Toggle() {
    val current = BiliClient.prefs.v236screenshotSavePath236
    BiliClient.prefs.v236screenshotSavePath236 = !current
    AppToast.show(this, "Screenshot Save Path236: ${if (!current) "ON" else "OFF"}")
}

// v236: Video Color Space236
internal fun PlayerActivity.showV236VideoColorSpace236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236videoColorSpace236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236videoColorSpace236 = value
        AppToast.show(this, "Video Color Space236: $value")
    }
}

// v236: Danmaku Bottom Max Count280
internal fun PlayerActivity.showV236DanmakuBottomMaxCount280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236danmakuBottomMaxCount280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236danmakuBottomMaxCount280 = value
        AppToast.show(this, "Danmaku Bottom Max Count280: $value")
    }
}

// v236: Subtitle Bg Border287
internal fun PlayerActivity.showV236SubtitleBgBorder287Toggle() {
    val current = BiliClient.prefs.v236subtitleBgBorder287
    BiliClient.prefs.v236subtitleBgBorder287 = !current
    AppToast.show(this, "Subtitle Bg Border287: ${if (!current) "ON" else "OFF"}")
}

// v237: Audio EQ Custom237
internal fun PlayerActivity.showV237AudioEQCustom237Toggle() {
    val current = BiliClient.prefs.v237audioEQCustom237
    BiliClient.prefs.v237audioEQCustom237 = !current
    AppToast.show(this, "Audio EQ Custom237: ${if (!current) "ON" else "OFF"}")
}

// v237: Danmaku Bottom Max Count281
internal fun PlayerActivity.showV237DanmakuBottomMaxCount281Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237danmakuBottomMaxCount281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237danmakuBottomMaxCount281 = value
        AppToast.show(this, "Danmaku Bottom Max Count281: $value")
    }
}

// v237: Subtitle Bg Border288
internal fun PlayerActivity.showV237SubtitleBgBorder288Toggle() {
    val current = BiliClient.prefs.v237subtitleBgBorder288
    BiliClient.prefs.v237subtitleBgBorder288 = !current
    AppToast.show(this, "Subtitle Bg Border288: ${if (!current) "ON" else "OFF"}")
}

// v237: Gesture Shake Action237
internal fun PlayerActivity.showV237GestureShakeAction237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237gestureShakeAction237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237gestureShakeAction237 = value
        AppToast.show(this, "Gesture Shake Action237: $value")
    }
}

// v237: Cast Audio Volume237
internal fun PlayerActivity.showV237CastAudioVolume237Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v237castAudioVolume237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237castAudioVolume237 = value
        AppToast.show(this, "Cast Audio Volume237: $value")
    }
}

// v237: Playlist Auto Skip Outro237
internal fun PlayerActivity.showV237PlaylistAutoSkipOutro237Toggle() {
    val current = BiliClient.prefs.v237playlistAutoSkipOutro237
    BiliClient.prefs.v237playlistAutoSkipOutro237 = !current
    AppToast.show(this, "Playlist Auto Skip Outro237: ${if (!current) "ON" else "OFF"}")
}

// v237: Cache Download Speed238
internal fun PlayerActivity.showV237CacheDownloadSpeed238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237cacheDownloadSpeed238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237cacheDownloadSpeed238 = value
        AppToast.show(this, "Cache Download Speed238: $value")
    }
}

// v237: Progress Bar Thumb Border237
internal fun PlayerActivity.showV237ProgressBarThumbBorder237Toggle() {
    val current = BiliClient.prefs.v237progressBarThumbBorder237
    BiliClient.prefs.v237progressBarThumbBorder237 = !current
    AppToast.show(this, "Progress Bar Thumb Border237: ${if (!current) "ON" else "OFF"}")
}

// v237: Volume Boost Peak237
internal fun PlayerActivity.showV237VolumeBoostPeak237Toggle() {
    val current = BiliClient.prefs.v237volumeBoostPeak237
    BiliClient.prefs.v237volumeBoostPeak237 = !current
    AppToast.show(this, "Volume Boost Peak237: ${if (!current) "ON" else "OFF"}")
}

// v237: History Bookmark Export237
internal fun PlayerActivity.showV237HistoryBookmarkExport237Toggle() {
    val current = BiliClient.prefs.v237historyBookmarkExport237
    BiliClient.prefs.v237historyBookmarkExport237 = !current
    AppToast.show(this, "History Bookmark Export237: ${if (!current) "ON" else "OFF"}")
}

// v237: Playback Chapter Sync237
internal fun PlayerActivity.showV237PlaybackChapterSync237Toggle() {
    val current = BiliClient.prefs.v237playbackChapterSync237
    BiliClient.prefs.v237playbackChapterSync237 = !current
    AppToast.show(this, "Playback Chapter Sync237: ${if (!current) "ON" else "OFF"}")
}

// v237: Screenshot Save Path237
internal fun PlayerActivity.showV237ScreenshotSavePath237Toggle() {
    val current = BiliClient.prefs.v237screenshotSavePath237
    BiliClient.prefs.v237screenshotSavePath237 = !current
    AppToast.show(this, "Screenshot Save Path237: ${if (!current) "ON" else "OFF"}")
}

// v237: Video Color Space237
internal fun PlayerActivity.showV237VideoColorSpace237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237videoColorSpace237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237videoColorSpace237 = value
        AppToast.show(this, "Video Color Space237: $value")
    }
}

// v237: Danmaku Bottom Max Count282
internal fun PlayerActivity.showV237DanmakuBottomMaxCount282Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237danmakuBottomMaxCount282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237danmakuBottomMaxCount282 = value
        AppToast.show(this, "Danmaku Bottom Max Count282: $value")
    }
}

// v237: Subtitle Bg Border289
internal fun PlayerActivity.showV237SubtitleBgBorder289Toggle() {
    val current = BiliClient.prefs.v237subtitleBgBorder289
    BiliClient.prefs.v237subtitleBgBorder289 = !current
    AppToast.show(this, "Subtitle Bg Border289: ${if (!current) "ON" else "OFF"}")
}

// v238: Audio EQ Custom238
internal fun PlayerActivity.showV238AudioEQCustom238Toggle() {
    val current = BiliClient.prefs.v238audioEQCustom238
    BiliClient.prefs.v238audioEQCustom238 = !current
    AppToast.show(this, "Audio EQ Custom238: ${if (!current) "ON" else "OFF"}")
}

// v238: Danmaku Bottom Max Count283
internal fun PlayerActivity.showV238DanmakuBottomMaxCount283Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238danmakuBottomMaxCount283).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count283",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238danmakuBottomMaxCount283 = value
        AppToast.show(this, "Danmaku Bottom Max Count283: $value")
    }
}

// v238: Subtitle Bg Border290
internal fun PlayerActivity.showV238SubtitleBgBorder290Toggle() {
    val current = BiliClient.prefs.v238subtitleBgBorder290
    BiliClient.prefs.v238subtitleBgBorder290 = !current
    AppToast.show(this, "Subtitle Bg Border290: ${if (!current) "ON" else "OFF"}")
}

// v238: Gesture Shake Action238
internal fun PlayerActivity.showV238GestureShakeAction238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238gestureShakeAction238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238gestureShakeAction238 = value
        AppToast.show(this, "Gesture Shake Action238: $value")
    }
}

// v238: Cast Audio Volume238
internal fun PlayerActivity.showV238CastAudioVolume238Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v238castAudioVolume238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238castAudioVolume238 = value
        AppToast.show(this, "Cast Audio Volume238: $value")
    }
}

// v238: Playlist Auto Skip Outro238
internal fun PlayerActivity.showV238PlaylistAutoSkipOutro238Toggle() {
    val current = BiliClient.prefs.v238playlistAutoSkipOutro238
    BiliClient.prefs.v238playlistAutoSkipOutro238 = !current
    AppToast.show(this, "Playlist Auto Skip Outro238: ${if (!current) "ON" else "OFF"}")
}

// v238: Cache Download Speed239
internal fun PlayerActivity.showV238CacheDownloadSpeed239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238cacheDownloadSpeed239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238cacheDownloadSpeed239 = value
        AppToast.show(this, "Cache Download Speed239: $value")
    }
}

// v238: Progress Bar Thumb Border238
internal fun PlayerActivity.showV238ProgressBarThumbBorder238Toggle() {
    val current = BiliClient.prefs.v238progressBarThumbBorder238
    BiliClient.prefs.v238progressBarThumbBorder238 = !current
    AppToast.show(this, "Progress Bar Thumb Border238: ${if (!current) "ON" else "OFF"}")
}

// v238: Volume Boost Peak238
internal fun PlayerActivity.showV238VolumeBoostPeak238Toggle() {
    val current = BiliClient.prefs.v238volumeBoostPeak238
    BiliClient.prefs.v238volumeBoostPeak238 = !current
    AppToast.show(this, "Volume Boost Peak238: ${if (!current) "ON" else "OFF"}")
}

// v238: History Bookmark Export238
internal fun PlayerActivity.showV238HistoryBookmarkExport238Toggle() {
    val current = BiliClient.prefs.v238historyBookmarkExport238
    BiliClient.prefs.v238historyBookmarkExport238 = !current
    AppToast.show(this, "History Bookmark Export238: ${if (!current) "ON" else "OFF"}")
}

// v238: Playback Chapter Sync238
internal fun PlayerActivity.showV238PlaybackChapterSync238Toggle() {
    val current = BiliClient.prefs.v238playbackChapterSync238
    BiliClient.prefs.v238playbackChapterSync238 = !current
    AppToast.show(this, "Playback Chapter Sync238: ${if (!current) "ON" else "OFF"}")
}

// v238: Screenshot Save Path238
internal fun PlayerActivity.showV238ScreenshotSavePath238Toggle() {
    val current = BiliClient.prefs.v238screenshotSavePath238
    BiliClient.prefs.v238screenshotSavePath238 = !current
    AppToast.show(this, "Screenshot Save Path238: ${if (!current) "ON" else "OFF"}")
}

// v238: Video Color Space238
internal fun PlayerActivity.showV238VideoColorSpace238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238videoColorSpace238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238videoColorSpace238 = value
        AppToast.show(this, "Video Color Space238: $value")
    }
}

// v238: Danmaku Bottom Max Count284
internal fun PlayerActivity.showV238DanmakuBottomMaxCount284Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238danmakuBottomMaxCount284).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count284",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238danmakuBottomMaxCount284 = value
        AppToast.show(this, "Danmaku Bottom Max Count284: $value")
    }
}

// v238: Subtitle Bg Border291
internal fun PlayerActivity.showV238SubtitleBgBorder291Toggle() {
    val current = BiliClient.prefs.v238subtitleBgBorder291
    BiliClient.prefs.v238subtitleBgBorder291 = !current
    AppToast.show(this, "Subtitle Bg Border291: ${if (!current) "ON" else "OFF"}")
}

// v239: Audio EQ Custom239
internal fun PlayerActivity.showV239AudioEQCustom239Toggle() {
    val current = BiliClient.prefs.v239audioEQCustom239
    BiliClient.prefs.v239audioEQCustom239 = !current
    AppToast.show(this, "Audio EQ Custom239: ${if (!current) "ON" else "OFF"}")
}

// v239: Danmaku Bottom Max Count285
internal fun PlayerActivity.showV239DanmakuBottomMaxCount285Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239danmakuBottomMaxCount285).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count285",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239danmakuBottomMaxCount285 = value
        AppToast.show(this, "Danmaku Bottom Max Count285: $value")
    }
}

// v239: Subtitle Bg Border292
internal fun PlayerActivity.showV239SubtitleBgBorder292Toggle() {
    val current = BiliClient.prefs.v239subtitleBgBorder292
    BiliClient.prefs.v239subtitleBgBorder292 = !current
    AppToast.show(this, "Subtitle Bg Border292: ${if (!current) "ON" else "OFF"}")
}

// v239: Gesture Shake Action239
internal fun PlayerActivity.showV239GestureShakeAction239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239gestureShakeAction239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239gestureShakeAction239 = value
        AppToast.show(this, "Gesture Shake Action239: $value")
    }
}

// v239: Cast Audio Volume239
internal fun PlayerActivity.showV239CastAudioVolume239Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v239castAudioVolume239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239castAudioVolume239 = value
        AppToast.show(this, "Cast Audio Volume239: $value")
    }
}

// v239: Playlist Auto Skip Outro239
internal fun PlayerActivity.showV239PlaylistAutoSkipOutro239Toggle() {
    val current = BiliClient.prefs.v239playlistAutoSkipOutro239
    BiliClient.prefs.v239playlistAutoSkipOutro239 = !current
    AppToast.show(this, "Playlist Auto Skip Outro239: ${if (!current) "ON" else "OFF"}")
}

// v239: Cache Download Speed240
internal fun PlayerActivity.showV239CacheDownloadSpeed240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239cacheDownloadSpeed240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239cacheDownloadSpeed240 = value
        AppToast.show(this, "Cache Download Speed240: $value")
    }
}

// v239: Progress Bar Thumb Border239
internal fun PlayerActivity.showV239ProgressBarThumbBorder239Toggle() {
    val current = BiliClient.prefs.v239progressBarThumbBorder239
    BiliClient.prefs.v239progressBarThumbBorder239 = !current
    AppToast.show(this, "Progress Bar Thumb Border239: ${if (!current) "ON" else "OFF"}")
}

// v239: Volume Boost Peak239
internal fun PlayerActivity.showV239VolumeBoostPeak239Toggle() {
    val current = BiliClient.prefs.v239volumeBoostPeak239
    BiliClient.prefs.v239volumeBoostPeak239 = !current
    AppToast.show(this, "Volume Boost Peak239: ${if (!current) "ON" else "OFF"}")
}

// v239: History Bookmark Export239
internal fun PlayerActivity.showV239HistoryBookmarkExport239Toggle() {
    val current = BiliClient.prefs.v239historyBookmarkExport239
    BiliClient.prefs.v239historyBookmarkExport239 = !current
    AppToast.show(this, "History Bookmark Export239: ${if (!current) "ON" else "OFF"}")
}

// v239: Playback Chapter Sync239
internal fun PlayerActivity.showV239PlaybackChapterSync239Toggle() {
    val current = BiliClient.prefs.v239playbackChapterSync239
    BiliClient.prefs.v239playbackChapterSync239 = !current
    AppToast.show(this, "Playback Chapter Sync239: ${if (!current) "ON" else "OFF"}")
}

// v239: Screenshot Save Path239
internal fun PlayerActivity.showV239ScreenshotSavePath239Toggle() {
    val current = BiliClient.prefs.v239screenshotSavePath239
    BiliClient.prefs.v239screenshotSavePath239 = !current
    AppToast.show(this, "Screenshot Save Path239: ${if (!current) "ON" else "OFF"}")
}

// v239: Video Color Space239
internal fun PlayerActivity.showV239VideoColorSpace239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239videoColorSpace239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239videoColorSpace239 = value
        AppToast.show(this, "Video Color Space239: $value")
    }
}

// v239: Danmaku Bottom Max Count286
internal fun PlayerActivity.showV239DanmakuBottomMaxCount286Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239danmakuBottomMaxCount286).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count286",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239danmakuBottomMaxCount286 = value
        AppToast.show(this, "Danmaku Bottom Max Count286: $value")
    }
}

// v239: Subtitle Bg Border293
internal fun PlayerActivity.showV239SubtitleBgBorder293Toggle() {
    val current = BiliClient.prefs.v239subtitleBgBorder293
    BiliClient.prefs.v239subtitleBgBorder293 = !current
    AppToast.show(this, "Subtitle Bg Border293: ${if (!current) "ON" else "OFF"}")
}

// v240: Audio EQ Custom240
internal fun PlayerActivity.showV240AudioEQCustom240Toggle() {
    val current = BiliClient.prefs.v240audioEQCustom240
    BiliClient.prefs.v240audioEQCustom240 = !current
    AppToast.show(this, "Audio EQ Custom240: ${if (!current) "ON" else "OFF"}")
}

// v240: Danmaku Bottom Max Count287
internal fun PlayerActivity.showV240DanmakuBottomMaxCount287Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240danmakuBottomMaxCount287).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count287",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240danmakuBottomMaxCount287 = value
        AppToast.show(this, "Danmaku Bottom Max Count287: $value")
    }
}

// v240: Subtitle Bg Border294
internal fun PlayerActivity.showV240SubtitleBgBorder294Toggle() {
    val current = BiliClient.prefs.v240subtitleBgBorder294
    BiliClient.prefs.v240subtitleBgBorder294 = !current
    AppToast.show(this, "Subtitle Bg Border294: ${if (!current) "ON" else "OFF"}")
}

// v240: Gesture Shake Action240
internal fun PlayerActivity.showV240GestureShakeAction240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240gestureShakeAction240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240gestureShakeAction240 = value
        AppToast.show(this, "Gesture Shake Action240: $value")
    }
}

// v240: Cast Audio Volume240
internal fun PlayerActivity.showV240CastAudioVolume240Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v240castAudioVolume240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240castAudioVolume240 = value
        AppToast.show(this, "Cast Audio Volume240: $value")
    }
}

// v240: Playlist Auto Skip Outro240
internal fun PlayerActivity.showV240PlaylistAutoSkipOutro240Toggle() {
    val current = BiliClient.prefs.v240playlistAutoSkipOutro240
    BiliClient.prefs.v240playlistAutoSkipOutro240 = !current
    AppToast.show(this, "Playlist Auto Skip Outro240: ${if (!current) "ON" else "OFF"}")
}

// v240: Cache Download Speed241
internal fun PlayerActivity.showV240CacheDownloadSpeed241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240cacheDownloadSpeed241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240cacheDownloadSpeed241 = value
        AppToast.show(this, "Cache Download Speed241: $value")
    }
}

// v240: Progress Bar Thumb Border240
internal fun PlayerActivity.showV240ProgressBarThumbBorder240Toggle() {
    val current = BiliClient.prefs.v240progressBarThumbBorder240
    BiliClient.prefs.v240progressBarThumbBorder240 = !current
    AppToast.show(this, "Progress Bar Thumb Border240: ${if (!current) "ON" else "OFF"}")
}

// v240: Volume Boost Peak240
internal fun PlayerActivity.showV240VolumeBoostPeak240Toggle() {
    val current = BiliClient.prefs.v240volumeBoostPeak240
    BiliClient.prefs.v240volumeBoostPeak240 = !current
    AppToast.show(this, "Volume Boost Peak240: ${if (!current) "ON" else "OFF"}")
}

// v240: History Bookmark Export240
internal fun PlayerActivity.showV240HistoryBookmarkExport240Toggle() {
    val current = BiliClient.prefs.v240historyBookmarkExport240
    BiliClient.prefs.v240historyBookmarkExport240 = !current
    AppToast.show(this, "History Bookmark Export240: ${if (!current) "ON" else "OFF"}")
}

// v240: Playback Chapter Sync240
internal fun PlayerActivity.showV240PlaybackChapterSync240Toggle() {
    val current = BiliClient.prefs.v240playbackChapterSync240
    BiliClient.prefs.v240playbackChapterSync240 = !current
    AppToast.show(this, "Playback Chapter Sync240: ${if (!current) "ON" else "OFF"}")
}

// v240: Screenshot Save Path240
internal fun PlayerActivity.showV240ScreenshotSavePath240Toggle() {
    val current = BiliClient.prefs.v240screenshotSavePath240
    BiliClient.prefs.v240screenshotSavePath240 = !current
    AppToast.show(this, "Screenshot Save Path240: ${if (!current) "ON" else "OFF"}")
}

// v240: Video Color Space240
internal fun PlayerActivity.showV240VideoColorSpace240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240videoColorSpace240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240videoColorSpace240 = value
        AppToast.show(this, "Video Color Space240: $value")
    }
}

// v240: Danmaku Bottom Max Count288
internal fun PlayerActivity.showV240DanmakuBottomMaxCount288Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240danmakuBottomMaxCount288).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count288",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240danmakuBottomMaxCount288 = value
        AppToast.show(this, "Danmaku Bottom Max Count288: $value")
    }
}

// v240: Subtitle Bg Border295
internal fun PlayerActivity.showV240SubtitleBgBorder295Toggle() {
    val current = BiliClient.prefs.v240subtitleBgBorder295
    BiliClient.prefs.v240subtitleBgBorder295 = !current
    AppToast.show(this, "Subtitle Bg Border295: ${if (!current) "ON" else "OFF"}")
}

// v241: Audio EQ Custom241
internal fun PlayerActivity.showV241AudioEQCustom241Toggle() {
    val current = BiliClient.prefs.v241audioEQCustom241
    BiliClient.prefs.v241audioEQCustom241 = !current
    AppToast.show(this, "Audio EQ Custom241: ${if (!current) "ON" else "OFF"}")
}

// v241: Danmaku Bottom Max Count289
internal fun PlayerActivity.showV241DanmakuBottomMaxCount289Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241danmakuBottomMaxCount289).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count289",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241danmakuBottomMaxCount289 = value
        AppToast.show(this, "Danmaku Bottom Max Count289: $value")
    }
}

// v241: Subtitle Bg Border296
internal fun PlayerActivity.showV241SubtitleBgBorder296Toggle() {
    val current = BiliClient.prefs.v241subtitleBgBorder296
    BiliClient.prefs.v241subtitleBgBorder296 = !current
    AppToast.show(this, "Subtitle Bg Border296: ${if (!current) "ON" else "OFF"}")
}

// v241: Gesture Shake Action241
internal fun PlayerActivity.showV241GestureShakeAction241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241gestureShakeAction241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241gestureShakeAction241 = value
        AppToast.show(this, "Gesture Shake Action241: $value")
    }
}

// v241: Cast Audio Volume241
internal fun PlayerActivity.showV241CastAudioVolume241Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v241castAudioVolume241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241castAudioVolume241 = value
        AppToast.show(this, "Cast Audio Volume241: $value")
    }
}

// v241: Playlist Auto Skip Outro241
internal fun PlayerActivity.showV241PlaylistAutoSkipOutro241Toggle() {
    val current = BiliClient.prefs.v241playlistAutoSkipOutro241
    BiliClient.prefs.v241playlistAutoSkipOutro241 = !current
    AppToast.show(this, "Playlist Auto Skip Outro241: ${if (!current) "ON" else "OFF"}")
}

// v241: Cache Download Speed242
internal fun PlayerActivity.showV241CacheDownloadSpeed242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241cacheDownloadSpeed242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241cacheDownloadSpeed242 = value
        AppToast.show(this, "Cache Download Speed242: $value")
    }
}

// v241: Progress Bar Thumb Border241
internal fun PlayerActivity.showV241ProgressBarThumbBorder241Toggle() {
    val current = BiliClient.prefs.v241progressBarThumbBorder241
    BiliClient.prefs.v241progressBarThumbBorder241 = !current
    AppToast.show(this, "Progress Bar Thumb Border241: ${if (!current) "ON" else "OFF"}")
}

// v241: Volume Boost Peak241
internal fun PlayerActivity.showV241VolumeBoostPeak241Toggle() {
    val current = BiliClient.prefs.v241volumeBoostPeak241
    BiliClient.prefs.v241volumeBoostPeak241 = !current
    AppToast.show(this, "Volume Boost Peak241: ${if (!current) "ON" else "OFF"}")
}

// v241: History Bookmark Export241
internal fun PlayerActivity.showV241HistoryBookmarkExport241Toggle() {
    val current = BiliClient.prefs.v241historyBookmarkExport241
    BiliClient.prefs.v241historyBookmarkExport241 = !current
    AppToast.show(this, "History Bookmark Export241: ${if (!current) "ON" else "OFF"}")
}

// v241: Playback Chapter Sync241
internal fun PlayerActivity.showV241PlaybackChapterSync241Toggle() {
    val current = BiliClient.prefs.v241playbackChapterSync241
    BiliClient.prefs.v241playbackChapterSync241 = !current
    AppToast.show(this, "Playback Chapter Sync241: ${if (!current) "ON" else "OFF"}")
}

// v241: Screenshot Save Path241
internal fun PlayerActivity.showV241ScreenshotSavePath241Toggle() {
    val current = BiliClient.prefs.v241screenshotSavePath241
    BiliClient.prefs.v241screenshotSavePath241 = !current
    AppToast.show(this, "Screenshot Save Path241: ${if (!current) "ON" else "OFF"}")
}

// v241: Video Color Space241
internal fun PlayerActivity.showV241VideoColorSpace241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241videoColorSpace241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241videoColorSpace241 = value
        AppToast.show(this, "Video Color Space241: $value")
    }
}

// v241: Danmaku Bottom Max Count290
internal fun PlayerActivity.showV241DanmakuBottomMaxCount290Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241danmakuBottomMaxCount290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241danmakuBottomMaxCount290 = value
        AppToast.show(this, "Danmaku Bottom Max Count290: $value")
    }
}

// v241: Subtitle Bg Border297
internal fun PlayerActivity.showV241SubtitleBgBorder297Toggle() {
    val current = BiliClient.prefs.v241subtitleBgBorder297
    BiliClient.prefs.v241subtitleBgBorder297 = !current
    AppToast.show(this, "Subtitle Bg Border297: ${if (!current) "ON" else "OFF"}")
}

// v242: Audio EQ Custom242
internal fun PlayerActivity.showV242AudioEQCustom242Toggle() {
    val current = BiliClient.prefs.v242audioEQCustom242
    BiliClient.prefs.v242audioEQCustom242 = !current
    AppToast.show(this, "Audio EQ Custom242: ${if (!current) "ON" else "OFF"}")
}

// v242: Danmaku Bottom Max Count291
internal fun PlayerActivity.showV242DanmakuBottomMaxCount291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242danmakuBottomMaxCount291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242danmakuBottomMaxCount291 = value
        AppToast.show(this, "Danmaku Bottom Max Count291: $value")
    }
}

// v242: Subtitle Bg Border298
internal fun PlayerActivity.showV242SubtitleBgBorder298Toggle() {
    val current = BiliClient.prefs.v242subtitleBgBorder298
    BiliClient.prefs.v242subtitleBgBorder298 = !current
    AppToast.show(this, "Subtitle Bg Border298: ${if (!current) "ON" else "OFF"}")
}

// v242: Gesture Shake Action242
internal fun PlayerActivity.showV242GestureShakeAction242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242gestureShakeAction242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242gestureShakeAction242 = value
        AppToast.show(this, "Gesture Shake Action242: $value")
    }
}

// v242: Cast Audio Volume242
internal fun PlayerActivity.showV242CastAudioVolume242Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v242castAudioVolume242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242castAudioVolume242 = value
        AppToast.show(this, "Cast Audio Volume242: $value")
    }
}

// v242: Playlist Auto Skip Outro242
internal fun PlayerActivity.showV242PlaylistAutoSkipOutro242Toggle() {
    val current = BiliClient.prefs.v242playlistAutoSkipOutro242
    BiliClient.prefs.v242playlistAutoSkipOutro242 = !current
    AppToast.show(this, "Playlist Auto Skip Outro242: ${if (!current) "ON" else "OFF"}")
}

// v242: Cache Download Speed243
internal fun PlayerActivity.showV242CacheDownloadSpeed243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242cacheDownloadSpeed243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242cacheDownloadSpeed243 = value
        AppToast.show(this, "Cache Download Speed243: $value")
    }
}

// v242: Progress Bar Thumb Border242
internal fun PlayerActivity.showV242ProgressBarThumbBorder242Toggle() {
    val current = BiliClient.prefs.v242progressBarThumbBorder242
    BiliClient.prefs.v242progressBarThumbBorder242 = !current
    AppToast.show(this, "Progress Bar Thumb Border242: ${if (!current) "ON" else "OFF"}")
}

// v242: Volume Boost Peak242
internal fun PlayerActivity.showV242VolumeBoostPeak242Toggle() {
    val current = BiliClient.prefs.v242volumeBoostPeak242
    BiliClient.prefs.v242volumeBoostPeak242 = !current
    AppToast.show(this, "Volume Boost Peak242: ${if (!current) "ON" else "OFF"}")
}

// v242: History Bookmark Export242
internal fun PlayerActivity.showV242HistoryBookmarkExport242Toggle() {
    val current = BiliClient.prefs.v242historyBookmarkExport242
    BiliClient.prefs.v242historyBookmarkExport242 = !current
    AppToast.show(this, "History Bookmark Export242: ${if (!current) "ON" else "OFF"}")
}

// v242: Playback Chapter Sync242
internal fun PlayerActivity.showV242PlaybackChapterSync242Toggle() {
    val current = BiliClient.prefs.v242playbackChapterSync242
    BiliClient.prefs.v242playbackChapterSync242 = !current
    AppToast.show(this, "Playback Chapter Sync242: ${if (!current) "ON" else "OFF"}")
}

// v242: Screenshot Save Path242
internal fun PlayerActivity.showV242ScreenshotSavePath242Toggle() {
    val current = BiliClient.prefs.v242screenshotSavePath242
    BiliClient.prefs.v242screenshotSavePath242 = !current
    AppToast.show(this, "Screenshot Save Path242: ${if (!current) "ON" else "OFF"}")
}

// v242: Video Color Space242
internal fun PlayerActivity.showV242VideoColorSpace242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242videoColorSpace242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242videoColorSpace242 = value
        AppToast.show(this, "Video Color Space242: $value")
    }
}

// v242: Danmaku Bottom Max Count292
internal fun PlayerActivity.showV242DanmakuBottomMaxCount292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242danmakuBottomMaxCount292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242danmakuBottomMaxCount292 = value
        AppToast.show(this, "Danmaku Bottom Max Count292: $value")
    }
}

// v242: Subtitle Bg Border299
internal fun PlayerActivity.showV242SubtitleBgBorder299Toggle() {
    val current = BiliClient.prefs.v242subtitleBgBorder299
    BiliClient.prefs.v242subtitleBgBorder299 = !current
    AppToast.show(this, "Subtitle Bg Border299: ${if (!current) "ON" else "OFF"}")
}

// v243: Audio EQ Custom243
internal fun PlayerActivity.showV243AudioEQCustom243Toggle() {
    val current = BiliClient.prefs.v243audioEQCustom243
    BiliClient.prefs.v243audioEQCustom243 = !current
    AppToast.show(this, "Audio EQ Custom243: ${if (!current) "ON" else "OFF"}")
}

// v243: Danmaku Bottom Max Count293
internal fun PlayerActivity.showV243DanmakuBottomMaxCount293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243danmakuBottomMaxCount293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243danmakuBottomMaxCount293 = value
        AppToast.show(this, "Danmaku Bottom Max Count293: $value")
    }
}

// v243: Subtitle Bg Border300
internal fun PlayerActivity.showV243SubtitleBgBorder300Toggle() {
    val current = BiliClient.prefs.v243subtitleBgBorder300
    BiliClient.prefs.v243subtitleBgBorder300 = !current
    AppToast.show(this, "Subtitle Bg Border300: ${if (!current) "ON" else "OFF"}")
}

// v243: Gesture Shake Action243
internal fun PlayerActivity.showV243GestureShakeAction243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243gestureShakeAction243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243gestureShakeAction243 = value
        AppToast.show(this, "Gesture Shake Action243: $value")
    }
}

// v243: Cast Audio Volume243
internal fun PlayerActivity.showV243CastAudioVolume243Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v243castAudioVolume243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243castAudioVolume243 = value
        AppToast.show(this, "Cast Audio Volume243: $value")
    }
}

// v243: Playlist Auto Skip Outro243
internal fun PlayerActivity.showV243PlaylistAutoSkipOutro243Toggle() {
    val current = BiliClient.prefs.v243playlistAutoSkipOutro243
    BiliClient.prefs.v243playlistAutoSkipOutro243 = !current
    AppToast.show(this, "Playlist Auto Skip Outro243: ${if (!current) "ON" else "OFF"}")
}

// v243: Cache Download Speed244
internal fun PlayerActivity.showV243CacheDownloadSpeed244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243cacheDownloadSpeed244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243cacheDownloadSpeed244 = value
        AppToast.show(this, "Cache Download Speed244: $value")
    }
}

// v243: Progress Bar Thumb Border243
internal fun PlayerActivity.showV243ProgressBarThumbBorder243Toggle() {
    val current = BiliClient.prefs.v243progressBarThumbBorder243
    BiliClient.prefs.v243progressBarThumbBorder243 = !current
    AppToast.show(this, "Progress Bar Thumb Border243: ${if (!current) "ON" else "OFF"}")
}

// v243: Volume Boost Peak243
internal fun PlayerActivity.showV243VolumeBoostPeak243Toggle() {
    val current = BiliClient.prefs.v243volumeBoostPeak243
    BiliClient.prefs.v243volumeBoostPeak243 = !current
    AppToast.show(this, "Volume Boost Peak243: ${if (!current) "ON" else "OFF"}")
}

// v243: History Bookmark Export243
internal fun PlayerActivity.showV243HistoryBookmarkExport243Toggle() {
    val current = BiliClient.prefs.v243historyBookmarkExport243
    BiliClient.prefs.v243historyBookmarkExport243 = !current
    AppToast.show(this, "History Bookmark Export243: ${if (!current) "ON" else "OFF"}")
}

// v243: Playback Chapter Sync243
internal fun PlayerActivity.showV243PlaybackChapterSync243Toggle() {
    val current = BiliClient.prefs.v243playbackChapterSync243
    BiliClient.prefs.v243playbackChapterSync243 = !current
    AppToast.show(this, "Playback Chapter Sync243: ${if (!current) "ON" else "OFF"}")
}

// v243: Screenshot Save Path243
internal fun PlayerActivity.showV243ScreenshotSavePath243Toggle() {
    val current = BiliClient.prefs.v243screenshotSavePath243
    BiliClient.prefs.v243screenshotSavePath243 = !current
    AppToast.show(this, "Screenshot Save Path243: ${if (!current) "ON" else "OFF"}")
}

// v243: Video Color Space243
internal fun PlayerActivity.showV243VideoColorSpace243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243videoColorSpace243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243videoColorSpace243 = value
        AppToast.show(this, "Video Color Space243: $value")
    }
}

// v243: Danmaku Bottom Max Count294
internal fun PlayerActivity.showV243DanmakuBottomMaxCount294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243danmakuBottomMaxCount294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243danmakuBottomMaxCount294 = value
        AppToast.show(this, "Danmaku Bottom Max Count294: $value")
    }
}

// v243: Subtitle Bg Border301
internal fun PlayerActivity.showV243SubtitleBgBorder301Toggle() {
    val current = BiliClient.prefs.v243subtitleBgBorder301
    BiliClient.prefs.v243subtitleBgBorder301 = !current
    AppToast.show(this, "Subtitle Bg Border301: ${if (!current) "ON" else "OFF"}")
}

// v244: Audio EQ Custom244
internal fun PlayerActivity.showV244AudioEQCustom244Toggle() {
    val current = BiliClient.prefs.v244audioEQCustom244
    BiliClient.prefs.v244audioEQCustom244 = !current
    AppToast.show(this, "Audio EQ Custom244: ${if (!current) "ON" else "OFF"}")
}

// v244: Danmaku Bottom Max Count295
internal fun PlayerActivity.showV244DanmakuBottomMaxCount295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244danmakuBottomMaxCount295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244danmakuBottomMaxCount295 = value
        AppToast.show(this, "Danmaku Bottom Max Count295: $value")
    }
}

// v244: Subtitle Bg Border302
internal fun PlayerActivity.showV244SubtitleBgBorder302Toggle() {
    val current = BiliClient.prefs.v244subtitleBgBorder302
    BiliClient.prefs.v244subtitleBgBorder302 = !current
    AppToast.show(this, "Subtitle Bg Border302: ${if (!current) "ON" else "OFF"}")
}

// v244: Gesture Shake Action244
internal fun PlayerActivity.showV244GestureShakeAction244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244gestureShakeAction244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244gestureShakeAction244 = value
        AppToast.show(this, "Gesture Shake Action244: $value")
    }
}

// v244: Cast Audio Volume244
internal fun PlayerActivity.showV244CastAudioVolume244Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v244castAudioVolume244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244castAudioVolume244 = value
        AppToast.show(this, "Cast Audio Volume244: $value")
    }
}

// v244: Playlist Auto Skip Outro244
internal fun PlayerActivity.showV244PlaylistAutoSkipOutro244Toggle() {
    val current = BiliClient.prefs.v244playlistAutoSkipOutro244
    BiliClient.prefs.v244playlistAutoSkipOutro244 = !current
    AppToast.show(this, "Playlist Auto Skip Outro244: ${if (!current) "ON" else "OFF"}")
}

// v244: Cache Download Speed245
internal fun PlayerActivity.showV244CacheDownloadSpeed245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244cacheDownloadSpeed245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244cacheDownloadSpeed245 = value
        AppToast.show(this, "Cache Download Speed245: $value")
    }
}

// v244: Progress Bar Thumb Border244
internal fun PlayerActivity.showV244ProgressBarThumbBorder244Toggle() {
    val current = BiliClient.prefs.v244progressBarThumbBorder244
    BiliClient.prefs.v244progressBarThumbBorder244 = !current
    AppToast.show(this, "Progress Bar Thumb Border244: ${if (!current) "ON" else "OFF"}")
}

// v244: Volume Boost Peak244
internal fun PlayerActivity.showV244VolumeBoostPeak244Toggle() {
    val current = BiliClient.prefs.v244volumeBoostPeak244
    BiliClient.prefs.v244volumeBoostPeak244 = !current
    AppToast.show(this, "Volume Boost Peak244: ${if (!current) "ON" else "OFF"}")
}

// v244: History Bookmark Export244
internal fun PlayerActivity.showV244HistoryBookmarkExport244Toggle() {
    val current = BiliClient.prefs.v244historyBookmarkExport244
    BiliClient.prefs.v244historyBookmarkExport244 = !current
    AppToast.show(this, "History Bookmark Export244: ${if (!current) "ON" else "OFF"}")
}

// v244: Playback Chapter Sync244
internal fun PlayerActivity.showV244PlaybackChapterSync244Toggle() {
    val current = BiliClient.prefs.v244playbackChapterSync244
    BiliClient.prefs.v244playbackChapterSync244 = !current
    AppToast.show(this, "Playback Chapter Sync244: ${if (!current) "ON" else "OFF"}")
}

// v244: Screenshot Save Path244
internal fun PlayerActivity.showV244ScreenshotSavePath244Toggle() {
    val current = BiliClient.prefs.v244screenshotSavePath244
    BiliClient.prefs.v244screenshotSavePath244 = !current
    AppToast.show(this, "Screenshot Save Path244: ${if (!current) "ON" else "OFF"}")
}

// v244: Video Color Space244
internal fun PlayerActivity.showV244VideoColorSpace244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244videoColorSpace244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244videoColorSpace244 = value
        AppToast.show(this, "Video Color Space244: $value")
    }
}

// v244: Danmaku Bottom Max Count296
internal fun PlayerActivity.showV244DanmakuBottomMaxCount296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244danmakuBottomMaxCount296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244danmakuBottomMaxCount296 = value
        AppToast.show(this, "Danmaku Bottom Max Count296: $value")
    }
}

// v244: Subtitle Bg Border303
internal fun PlayerActivity.showV244SubtitleBgBorder303Toggle() {
    val current = BiliClient.prefs.v244subtitleBgBorder303
    BiliClient.prefs.v244subtitleBgBorder303 = !current
    AppToast.show(this, "Subtitle Bg Border303: ${if (!current) "ON" else "OFF"}")
}

// v245: Audio EQ Custom245
internal fun PlayerActivity.showV245AudioEQCustom245Toggle() {
    val current = BiliClient.prefs.v245audioEQCustom245
    BiliClient.prefs.v245audioEQCustom245 = !current
    AppToast.show(this, "Audio EQ Custom245: ${if (!current) "ON" else "OFF"}")
}

// v245: Danmaku Bottom Max Count297
internal fun PlayerActivity.showV245DanmakuBottomMaxCount297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245danmakuBottomMaxCount297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245danmakuBottomMaxCount297 = value
        AppToast.show(this, "Danmaku Bottom Max Count297: $value")
    }
}

// v245: Subtitle Bg Border304
internal fun PlayerActivity.showV245SubtitleBgBorder304Toggle() {
    val current = BiliClient.prefs.v245subtitleBgBorder304
    BiliClient.prefs.v245subtitleBgBorder304 = !current
    AppToast.show(this, "Subtitle Bg Border304: ${if (!current) "ON" else "OFF"}")
}

// v245: Gesture Shake Action245
internal fun PlayerActivity.showV245GestureShakeAction245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245gestureShakeAction245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245gestureShakeAction245 = value
        AppToast.show(this, "Gesture Shake Action245: $value")
    }
}

// v245: Cast Audio Volume245
internal fun PlayerActivity.showV245CastAudioVolume245Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v245castAudioVolume245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245castAudioVolume245 = value
        AppToast.show(this, "Cast Audio Volume245: $value")
    }
}

// v245: Playlist Auto Skip Outro245
internal fun PlayerActivity.showV245PlaylistAutoSkipOutro245Toggle() {
    val current = BiliClient.prefs.v245playlistAutoSkipOutro245
    BiliClient.prefs.v245playlistAutoSkipOutro245 = !current
    AppToast.show(this, "Playlist Auto Skip Outro245: ${if (!current) "ON" else "OFF"}")
}

// v245: Cache Download Speed246
internal fun PlayerActivity.showV245CacheDownloadSpeed246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245cacheDownloadSpeed246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245cacheDownloadSpeed246 = value
        AppToast.show(this, "Cache Download Speed246: $value")
    }
}

// v245: Progress Bar Thumb Border245
internal fun PlayerActivity.showV245ProgressBarThumbBorder245Toggle() {
    val current = BiliClient.prefs.v245progressBarThumbBorder245
    BiliClient.prefs.v245progressBarThumbBorder245 = !current
    AppToast.show(this, "Progress Bar Thumb Border245: ${if (!current) "ON" else "OFF"}")
}

// v245: Volume Boost Peak245
internal fun PlayerActivity.showV245VolumeBoostPeak245Toggle() {
    val current = BiliClient.prefs.v245volumeBoostPeak245
    BiliClient.prefs.v245volumeBoostPeak245 = !current
    AppToast.show(this, "Volume Boost Peak245: ${if (!current) "ON" else "OFF"}")
}

// v245: History Bookmark Export245
internal fun PlayerActivity.showV245HistoryBookmarkExport245Toggle() {
    val current = BiliClient.prefs.v245historyBookmarkExport245
    BiliClient.prefs.v245historyBookmarkExport245 = !current
    AppToast.show(this, "History Bookmark Export245: ${if (!current) "ON" else "OFF"}")
}

// v245: Playback Chapter Sync245
internal fun PlayerActivity.showV245PlaybackChapterSync245Toggle() {
    val current = BiliClient.prefs.v245playbackChapterSync245
    BiliClient.prefs.v245playbackChapterSync245 = !current
    AppToast.show(this, "Playback Chapter Sync245: ${if (!current) "ON" else "OFF"}")
}

// v245: Screenshot Save Path245
internal fun PlayerActivity.showV245ScreenshotSavePath245Toggle() {
    val current = BiliClient.prefs.v245screenshotSavePath245
    BiliClient.prefs.v245screenshotSavePath245 = !current
    AppToast.show(this, "Screenshot Save Path245: ${if (!current) "ON" else "OFF"}")
}

// v245: Video Color Space245
internal fun PlayerActivity.showV245VideoColorSpace245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245videoColorSpace245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245videoColorSpace245 = value
        AppToast.show(this, "Video Color Space245: $value")
    }
}

// v245: Danmaku Bottom Max Count298
internal fun PlayerActivity.showV245DanmakuBottomMaxCount298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245danmakuBottomMaxCount298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245danmakuBottomMaxCount298 = value
        AppToast.show(this, "Danmaku Bottom Max Count298: $value")
    }
}

// v245: Subtitle Bg Border305
internal fun PlayerActivity.showV245SubtitleBgBorder305Toggle() {
    val current = BiliClient.prefs.v245subtitleBgBorder305
    BiliClient.prefs.v245subtitleBgBorder305 = !current
    AppToast.show(this, "Subtitle Bg Border305: ${if (!current) "ON" else "OFF"}")
}

// v246: Audio EQ Custom246
internal fun PlayerActivity.showV246AudioEQCustom246Toggle() {
    val current = BiliClient.prefs.v246audioEQCustom246
    BiliClient.prefs.v246audioEQCustom246 = !current
    AppToast.show(this, "Audio EQ Custom246: ${if (!current) "ON" else "OFF"}")
}

// v246: Danmaku Bottom Max Count299
internal fun PlayerActivity.showV246DanmakuBottomMaxCount299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246danmakuBottomMaxCount299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246danmakuBottomMaxCount299 = value
        AppToast.show(this, "Danmaku Bottom Max Count299: $value")
    }
}

// v246: Subtitle Bg Border306
internal fun PlayerActivity.showV246SubtitleBgBorder306Toggle() {
    val current = BiliClient.prefs.v246subtitleBgBorder306
    BiliClient.prefs.v246subtitleBgBorder306 = !current
    AppToast.show(this, "Subtitle Bg Border306: ${if (!current) "ON" else "OFF"}")
}

// v246: Gesture Shake Action246
internal fun PlayerActivity.showV246GestureShakeAction246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246gestureShakeAction246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246gestureShakeAction246 = value
        AppToast.show(this, "Gesture Shake Action246: $value")
    }
}

// v246: Cast Audio Volume246
internal fun PlayerActivity.showV246CastAudioVolume246Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v246castAudioVolume246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246castAudioVolume246 = value
        AppToast.show(this, "Cast Audio Volume246: $value")
    }
}

// v246: Playlist Auto Skip Outro246
internal fun PlayerActivity.showV246PlaylistAutoSkipOutro246Toggle() {
    val current = BiliClient.prefs.v246playlistAutoSkipOutro246
    BiliClient.prefs.v246playlistAutoSkipOutro246 = !current
    AppToast.show(this, "Playlist Auto Skip Outro246: ${if (!current) "ON" else "OFF"}")
}

// v246: Cache Download Speed247
internal fun PlayerActivity.showV246CacheDownloadSpeed247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246cacheDownloadSpeed247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246cacheDownloadSpeed247 = value
        AppToast.show(this, "Cache Download Speed247: $value")
    }
}

// v246: Progress Bar Thumb Border246
internal fun PlayerActivity.showV246ProgressBarThumbBorder246Toggle() {
    val current = BiliClient.prefs.v246progressBarThumbBorder246
    BiliClient.prefs.v246progressBarThumbBorder246 = !current
    AppToast.show(this, "Progress Bar Thumb Border246: ${if (!current) "ON" else "OFF"}")
}

// v246: Volume Boost Peak246
internal fun PlayerActivity.showV246VolumeBoostPeak246Toggle() {
    val current = BiliClient.prefs.v246volumeBoostPeak246
    BiliClient.prefs.v246volumeBoostPeak246 = !current
    AppToast.show(this, "Volume Boost Peak246: ${if (!current) "ON" else "OFF"}")
}

// v246: History Bookmark Export246
internal fun PlayerActivity.showV246HistoryBookmarkExport246Toggle() {
    val current = BiliClient.prefs.v246historyBookmarkExport246
    BiliClient.prefs.v246historyBookmarkExport246 = !current
    AppToast.show(this, "History Bookmark Export246: ${if (!current) "ON" else "OFF"}")
}

// v246: Playback Chapter Sync246
internal fun PlayerActivity.showV246PlaybackChapterSync246Toggle() {
    val current = BiliClient.prefs.v246playbackChapterSync246
    BiliClient.prefs.v246playbackChapterSync246 = !current
    AppToast.show(this, "Playback Chapter Sync246: ${if (!current) "ON" else "OFF"}")
}

// v246: Screenshot Save Path246
internal fun PlayerActivity.showV246ScreenshotSavePath246Toggle() {
    val current = BiliClient.prefs.v246screenshotSavePath246
    BiliClient.prefs.v246screenshotSavePath246 = !current
    AppToast.show(this, "Screenshot Save Path246: ${if (!current) "ON" else "OFF"}")
}

// v246: Video Color Space246
internal fun PlayerActivity.showV246VideoColorSpace246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246videoColorSpace246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246videoColorSpace246 = value
        AppToast.show(this, "Video Color Space246: $value")
    }
}

// v246: Danmaku Bottom Max Count300
internal fun PlayerActivity.showV246DanmakuBottomMaxCount300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246danmakuBottomMaxCount300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246danmakuBottomMaxCount300 = value
        AppToast.show(this, "Danmaku Bottom Max Count300: $value")
    }
}

// v246: Subtitle Bg Border307
internal fun PlayerActivity.showV246SubtitleBgBorder307Toggle() {
    val current = BiliClient.prefs.v246subtitleBgBorder307
    BiliClient.prefs.v246subtitleBgBorder307 = !current
    AppToast.show(this, "Subtitle Bg Border307: ${if (!current) "ON" else "OFF"}")
}

// v247: Audio EQ Custom247
internal fun PlayerActivity.showV247AudioEQCustom247Toggle() {
    val current = BiliClient.prefs.v247audioEQCustom247
    BiliClient.prefs.v247audioEQCustom247 = !current
    AppToast.show(this, "Audio EQ Custom247: ${if (!current) "ON" else "OFF"}")
}

// v247: Danmaku Bottom Max Count301
internal fun PlayerActivity.showV247DanmakuBottomMaxCount301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247danmakuBottomMaxCount301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247danmakuBottomMaxCount301 = value
        AppToast.show(this, "Danmaku Bottom Max Count301: $value")
    }
}

// v247: Subtitle Bg Border308
internal fun PlayerActivity.showV247SubtitleBgBorder308Toggle() {
    val current = BiliClient.prefs.v247subtitleBgBorder308
    BiliClient.prefs.v247subtitleBgBorder308 = !current
    AppToast.show(this, "Subtitle Bg Border308: ${if (!current) "ON" else "OFF"}")
}

// v247: Gesture Shake Action247
internal fun PlayerActivity.showV247GestureShakeAction247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247gestureShakeAction247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247gestureShakeAction247 = value
        AppToast.show(this, "Gesture Shake Action247: $value")
    }
}

// v247: Cast Audio Volume247
internal fun PlayerActivity.showV247CastAudioVolume247Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v247castAudioVolume247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247castAudioVolume247 = value
        AppToast.show(this, "Cast Audio Volume247: $value")
    }
}

// v247: Playlist Auto Skip Outro247
internal fun PlayerActivity.showV247PlaylistAutoSkipOutro247Toggle() {
    val current = BiliClient.prefs.v247playlistAutoSkipOutro247
    BiliClient.prefs.v247playlistAutoSkipOutro247 = !current
    AppToast.show(this, "Playlist Auto Skip Outro247: ${if (!current) "ON" else "OFF"}")
}

// v247: Cache Download Speed248
internal fun PlayerActivity.showV247CacheDownloadSpeed248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247cacheDownloadSpeed248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247cacheDownloadSpeed248 = value
        AppToast.show(this, "Cache Download Speed248: $value")
    }
}

// v247: Progress Bar Thumb Border247
internal fun PlayerActivity.showV247ProgressBarThumbBorder247Toggle() {
    val current = BiliClient.prefs.v247progressBarThumbBorder247
    BiliClient.prefs.v247progressBarThumbBorder247 = !current
    AppToast.show(this, "Progress Bar Thumb Border247: ${if (!current) "ON" else "OFF"}")
}

// v247: Volume Boost Peak247
internal fun PlayerActivity.showV247VolumeBoostPeak247Toggle() {
    val current = BiliClient.prefs.v247volumeBoostPeak247
    BiliClient.prefs.v247volumeBoostPeak247 = !current
    AppToast.show(this, "Volume Boost Peak247: ${if (!current) "ON" else "OFF"}")
}

// v247: History Bookmark Export247
internal fun PlayerActivity.showV247HistoryBookmarkExport247Toggle() {
    val current = BiliClient.prefs.v247historyBookmarkExport247
    BiliClient.prefs.v247historyBookmarkExport247 = !current
    AppToast.show(this, "History Bookmark Export247: ${if (!current) "ON" else "OFF"}")
}

// v247: Playback Chapter Sync247
internal fun PlayerActivity.showV247PlaybackChapterSync247Toggle() {
    val current = BiliClient.prefs.v247playbackChapterSync247
    BiliClient.prefs.v247playbackChapterSync247 = !current
    AppToast.show(this, "Playback Chapter Sync247: ${if (!current) "ON" else "OFF"}")
}

// v247: Screenshot Save Path247
internal fun PlayerActivity.showV247ScreenshotSavePath247Toggle() {
    val current = BiliClient.prefs.v247screenshotSavePath247
    BiliClient.prefs.v247screenshotSavePath247 = !current
    AppToast.show(this, "Screenshot Save Path247: ${if (!current) "ON" else "OFF"}")
}

// v247: Video Color Space247
internal fun PlayerActivity.showV247VideoColorSpace247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247videoColorSpace247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247videoColorSpace247 = value
        AppToast.show(this, "Video Color Space247: $value")
    }
}

// v247: Danmaku Bottom Max Count302
internal fun PlayerActivity.showV247DanmakuBottomMaxCount302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247danmakuBottomMaxCount302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247danmakuBottomMaxCount302 = value
        AppToast.show(this, "Danmaku Bottom Max Count302: $value")
    }
}

// v247: Subtitle Bg Border309
internal fun PlayerActivity.showV247SubtitleBgBorder309Toggle() {
    val current = BiliClient.prefs.v247subtitleBgBorder309
    BiliClient.prefs.v247subtitleBgBorder309 = !current
    AppToast.show(this, "Subtitle Bg Border309: ${if (!current) "ON" else "OFF"}")
}

// v248: Audio EQ Custom248
internal fun PlayerActivity.showV248AudioEQCustom248Toggle() {
    val current = BiliClient.prefs.v248audioEQCustom248
    BiliClient.prefs.v248audioEQCustom248 = !current
    AppToast.show(this, "Audio EQ Custom248: ${if (!current) "ON" else "OFF"}")
}

// v248: Danmaku Bottom Max Count303
internal fun PlayerActivity.showV248DanmakuBottomMaxCount303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248danmakuBottomMaxCount303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248danmakuBottomMaxCount303 = value
        AppToast.show(this, "Danmaku Bottom Max Count303: $value")
    }
}

// v248: Subtitle Bg Border310
internal fun PlayerActivity.showV248SubtitleBgBorder310Toggle() {
    val current = BiliClient.prefs.v248subtitleBgBorder310
    BiliClient.prefs.v248subtitleBgBorder310 = !current
    AppToast.show(this, "Subtitle Bg Border310: ${if (!current) "ON" else "OFF"}")
}

// v248: Gesture Shake Action248
internal fun PlayerActivity.showV248GestureShakeAction248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248gestureShakeAction248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248gestureShakeAction248 = value
        AppToast.show(this, "Gesture Shake Action248: $value")
    }
}

// v248: Cast Audio Volume248
internal fun PlayerActivity.showV248CastAudioVolume248Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v248castAudioVolume248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248castAudioVolume248 = value
        AppToast.show(this, "Cast Audio Volume248: $value")
    }
}

// v248: Playlist Auto Skip Outro248
internal fun PlayerActivity.showV248PlaylistAutoSkipOutro248Toggle() {
    val current = BiliClient.prefs.v248playlistAutoSkipOutro248
    BiliClient.prefs.v248playlistAutoSkipOutro248 = !current
    AppToast.show(this, "Playlist Auto Skip Outro248: ${if (!current) "ON" else "OFF"}")
}

// v248: Cache Download Speed249
internal fun PlayerActivity.showV248CacheDownloadSpeed249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248cacheDownloadSpeed249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248cacheDownloadSpeed249 = value
        AppToast.show(this, "Cache Download Speed249: $value")
    }
}

// v248: Progress Bar Thumb Border248
internal fun PlayerActivity.showV248ProgressBarThumbBorder248Toggle() {
    val current = BiliClient.prefs.v248progressBarThumbBorder248
    BiliClient.prefs.v248progressBarThumbBorder248 = !current
    AppToast.show(this, "Progress Bar Thumb Border248: ${if (!current) "ON" else "OFF"}")
}

// v248: Volume Boost Peak248
internal fun PlayerActivity.showV248VolumeBoostPeak248Toggle() {
    val current = BiliClient.prefs.v248volumeBoostPeak248
    BiliClient.prefs.v248volumeBoostPeak248 = !current
    AppToast.show(this, "Volume Boost Peak248: ${if (!current) "ON" else "OFF"}")
}

// v248: History Bookmark Export248
internal fun PlayerActivity.showV248HistoryBookmarkExport248Toggle() {
    val current = BiliClient.prefs.v248historyBookmarkExport248
    BiliClient.prefs.v248historyBookmarkExport248 = !current
    AppToast.show(this, "History Bookmark Export248: ${if (!current) "ON" else "OFF"}")
}

// v248: Playback Chapter Sync248
internal fun PlayerActivity.showV248PlaybackChapterSync248Toggle() {
    val current = BiliClient.prefs.v248playbackChapterSync248
    BiliClient.prefs.v248playbackChapterSync248 = !current
    AppToast.show(this, "Playback Chapter Sync248: ${if (!current) "ON" else "OFF"}")
}

// v248: Screenshot Save Path248
internal fun PlayerActivity.showV248ScreenshotSavePath248Toggle() {
    val current = BiliClient.prefs.v248screenshotSavePath248
    BiliClient.prefs.v248screenshotSavePath248 = !current
    AppToast.show(this, "Screenshot Save Path248: ${if (!current) "ON" else "OFF"}")
}

// v248: Video Color Space248
internal fun PlayerActivity.showV248VideoColorSpace248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248videoColorSpace248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248videoColorSpace248 = value
        AppToast.show(this, "Video Color Space248: $value")
    }
}

// v248: Danmaku Bottom Max Count304
internal fun PlayerActivity.showV248DanmakuBottomMaxCount304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248danmakuBottomMaxCount304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248danmakuBottomMaxCount304 = value
        AppToast.show(this, "Danmaku Bottom Max Count304: $value")
    }
}

// v248: Subtitle Bg Border311
internal fun PlayerActivity.showV248SubtitleBgBorder311Toggle() {
    val current = BiliClient.prefs.v248subtitleBgBorder311
    BiliClient.prefs.v248subtitleBgBorder311 = !current
    AppToast.show(this, "Subtitle Bg Border311: ${if (!current) "ON" else "OFF"}")
}

// v249: Audio EQ Custom249
internal fun PlayerActivity.showV249AudioEQCustom249Toggle() {
    val current = BiliClient.prefs.v249audioEQCustom249
    BiliClient.prefs.v249audioEQCustom249 = !current
    AppToast.show(this, "Audio EQ Custom249: ${if (!current) "ON" else "OFF"}")
}

// v249: Danmaku Bottom Max Count305
internal fun PlayerActivity.showV249DanmakuBottomMaxCount305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249danmakuBottomMaxCount305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249danmakuBottomMaxCount305 = value
        AppToast.show(this, "Danmaku Bottom Max Count305: $value")
    }
}

// v249: Subtitle Bg Border312
internal fun PlayerActivity.showV249SubtitleBgBorder312Toggle() {
    val current = BiliClient.prefs.v249subtitleBgBorder312
    BiliClient.prefs.v249subtitleBgBorder312 = !current
    AppToast.show(this, "Subtitle Bg Border312: ${if (!current) "ON" else "OFF"}")
}

// v249: Gesture Shake Action249
internal fun PlayerActivity.showV249GestureShakeAction249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249gestureShakeAction249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249gestureShakeAction249 = value
        AppToast.show(this, "Gesture Shake Action249: $value")
    }
}

// v249: Cast Audio Volume249
internal fun PlayerActivity.showV249CastAudioVolume249Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v249castAudioVolume249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249castAudioVolume249 = value
        AppToast.show(this, "Cast Audio Volume249: $value")
    }
}

// v249: Playlist Auto Skip Outro249
internal fun PlayerActivity.showV249PlaylistAutoSkipOutro249Toggle() {
    val current = BiliClient.prefs.v249playlistAutoSkipOutro249
    BiliClient.prefs.v249playlistAutoSkipOutro249 = !current
    AppToast.show(this, "Playlist Auto Skip Outro249: ${if (!current) "ON" else "OFF"}")
}

// v249: Cache Download Speed250
internal fun PlayerActivity.showV249CacheDownloadSpeed250Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249cacheDownloadSpeed250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249cacheDownloadSpeed250 = value
        AppToast.show(this, "Cache Download Speed250: $value")
    }
}

// v249: Progress Bar Thumb Border249
internal fun PlayerActivity.showV249ProgressBarThumbBorder249Toggle() {
    val current = BiliClient.prefs.v249progressBarThumbBorder249
    BiliClient.prefs.v249progressBarThumbBorder249 = !current
    AppToast.show(this, "Progress Bar Thumb Border249: ${if (!current) "ON" else "OFF"}")
}

// v249: Volume Boost Peak249
internal fun PlayerActivity.showV249VolumeBoostPeak249Toggle() {
    val current = BiliClient.prefs.v249volumeBoostPeak249
    BiliClient.prefs.v249volumeBoostPeak249 = !current
    AppToast.show(this, "Volume Boost Peak249: ${if (!current) "ON" else "OFF"}")
}

// v249: History Bookmark Export249
internal fun PlayerActivity.showV249HistoryBookmarkExport249Toggle() {
    val current = BiliClient.prefs.v249historyBookmarkExport249
    BiliClient.prefs.v249historyBookmarkExport249 = !current
    AppToast.show(this, "History Bookmark Export249: ${if (!current) "ON" else "OFF"}")
}

// v249: Playback Chapter Sync249
internal fun PlayerActivity.showV249PlaybackChapterSync249Toggle() {
    val current = BiliClient.prefs.v249playbackChapterSync249
    BiliClient.prefs.v249playbackChapterSync249 = !current
    AppToast.show(this, "Playback Chapter Sync249: ${if (!current) "ON" else "OFF"}")
}

// v249: Screenshot Save Path249
internal fun PlayerActivity.showV249ScreenshotSavePath249Toggle() {
    val current = BiliClient.prefs.v249screenshotSavePath249
    BiliClient.prefs.v249screenshotSavePath249 = !current
    AppToast.show(this, "Screenshot Save Path249: ${if (!current) "ON" else "OFF"}")
}

// v249: Video Color Space249
internal fun PlayerActivity.showV249VideoColorSpace249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249videoColorSpace249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249videoColorSpace249 = value
        AppToast.show(this, "Video Color Space249: $value")
    }
}

