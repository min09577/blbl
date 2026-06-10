package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v303: Gesture Shake Action303
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

// v303: Cast Audio Volume303
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

// v303: Playlist Auto Skip Outro303
internal fun PlayerActivity.showV303PlaylistAutoSkipOutro303Toggle() {
    val current = BiliClient.prefs.v303playlistAutoSkipOutro303
    BiliClient.prefs.v303playlistAutoSkipOutro303 = !current
    AppToast.show(this, "Playlist Auto Skip Outro303: ${if (!current) "ON" else "OFF"}")
}

// v303: Cache Download Speed304
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

// v303: Progress Bar Thumb Border303
internal fun PlayerActivity.showV303ProgressBarThumbBorder303Toggle() {
    val current = BiliClient.prefs.v303progressBarThumbBorder303
    BiliClient.prefs.v303progressBarThumbBorder303 = !current
    AppToast.show(this, "Progress Bar Thumb Border303: ${if (!current) "ON" else "OFF"}")
}

// v303: Volume Boost Peak303
internal fun PlayerActivity.showV303VolumeBoostPeak303Toggle() {
    val current = BiliClient.prefs.v303volumeBoostPeak303
    BiliClient.prefs.v303volumeBoostPeak303 = !current
    AppToast.show(this, "Volume Boost Peak303: ${if (!current) "ON" else "OFF"}")
}

// v303: History Bookmark Export303
internal fun PlayerActivity.showV303HistoryBookmarkExport303Toggle() {
    val current = BiliClient.prefs.v303historyBookmarkExport303
    BiliClient.prefs.v303historyBookmarkExport303 = !current
    AppToast.show(this, "History Bookmark Export303: ${if (!current) "ON" else "OFF"}")
}

// v303: Playback Chapter Sync303
internal fun PlayerActivity.showV303PlaybackChapterSync303Toggle() {
    val current = BiliClient.prefs.v303playbackChapterSync303
    BiliClient.prefs.v303playbackChapterSync303 = !current
    AppToast.show(this, "Playback Chapter Sync303: ${if (!current) "ON" else "OFF"}")
}

// v303: Screenshot Save Path303
internal fun PlayerActivity.showV303ScreenshotSavePath303Toggle() {
    val current = BiliClient.prefs.v303screenshotSavePath303
    BiliClient.prefs.v303screenshotSavePath303 = !current
    AppToast.show(this, "Screenshot Save Path303: ${if (!current) "ON" else "OFF"}")
}

// v303: Video Color Space303
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

// v303: Danmaku Bottom Max Count414
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

// v303: Subtitle Bg Border421
internal fun PlayerActivity.showV303SubtitleBgBorder421Toggle() {
    val current = BiliClient.prefs.v303subtitleBgBorder421
    BiliClient.prefs.v303subtitleBgBorder421 = !current
    AppToast.show(this, "Subtitle Bg Border421: ${if (!current) "ON" else "OFF"}")
}

// v304: Audio EQ Custom304
internal fun PlayerActivity.showV304AudioEQCustom304Toggle() {
    val current = BiliClient.prefs.v304audioEQCustom304
    BiliClient.prefs.v304audioEQCustom304 = !current
    AppToast.show(this, "Audio EQ Custom304: ${if (!current) "ON" else "OFF"}")
}

// v304: Danmaku Bottom Max Count415
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

// v304: Subtitle Bg Border422
internal fun PlayerActivity.showV304SubtitleBgBorder422Toggle() {
    val current = BiliClient.prefs.v304subtitleBgBorder422
    BiliClient.prefs.v304subtitleBgBorder422 = !current
    AppToast.show(this, "Subtitle Bg Border422: ${if (!current) "ON" else "OFF"}")
}

// v304: Gesture Shake Action304
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

// v304: Cast Audio Volume304
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

// v304: Playlist Auto Skip Outro304
internal fun PlayerActivity.showV304PlaylistAutoSkipOutro304Toggle() {
    val current = BiliClient.prefs.v304playlistAutoSkipOutro304
    BiliClient.prefs.v304playlistAutoSkipOutro304 = !current
    AppToast.show(this, "Playlist Auto Skip Outro304: ${if (!current) "ON" else "OFF"}")
}

// v304: Cache Download Speed305
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

// v304: Progress Bar Thumb Border304
internal fun PlayerActivity.showV304ProgressBarThumbBorder304Toggle() {
    val current = BiliClient.prefs.v304progressBarThumbBorder304
    BiliClient.prefs.v304progressBarThumbBorder304 = !current
    AppToast.show(this, "Progress Bar Thumb Border304: ${if (!current) "ON" else "OFF"}")
}

// v304: Volume Boost Peak304
internal fun PlayerActivity.showV304VolumeBoostPeak304Toggle() {
    val current = BiliClient.prefs.v304volumeBoostPeak304
    BiliClient.prefs.v304volumeBoostPeak304 = !current
    AppToast.show(this, "Volume Boost Peak304: ${if (!current) "ON" else "OFF"}")
}

// v304: History Bookmark Export304
internal fun PlayerActivity.showV304HistoryBookmarkExport304Toggle() {
    val current = BiliClient.prefs.v304historyBookmarkExport304
    BiliClient.prefs.v304historyBookmarkExport304 = !current
    AppToast.show(this, "History Bookmark Export304: ${if (!current) "ON" else "OFF"}")
}

// v304: Playback Chapter Sync304
internal fun PlayerActivity.showV304PlaybackChapterSync304Toggle() {
    val current = BiliClient.prefs.v304playbackChapterSync304
    BiliClient.prefs.v304playbackChapterSync304 = !current
    AppToast.show(this, "Playback Chapter Sync304: ${if (!current) "ON" else "OFF"}")
}

// v304: Screenshot Save Path304
internal fun PlayerActivity.showV304ScreenshotSavePath304Toggle() {
    val current = BiliClient.prefs.v304screenshotSavePath304
    BiliClient.prefs.v304screenshotSavePath304 = !current
    AppToast.show(this, "Screenshot Save Path304: ${if (!current) "ON" else "OFF"}")
}

// v304: Video Color Space304
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

// v304: Danmaku Bottom Max Count416
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

// v304: Subtitle Bg Border423
internal fun PlayerActivity.showV304SubtitleBgBorder423Toggle() {
    val current = BiliClient.prefs.v304subtitleBgBorder423
    BiliClient.prefs.v304subtitleBgBorder423 = !current
    AppToast.show(this, "Subtitle Bg Border423: ${if (!current) "ON" else "OFF"}")
}

// v305: Audio EQ Custom305
internal fun PlayerActivity.showV305AudioEQCustom305Toggle() {
    val current = BiliClient.prefs.v305audioEQCustom305
    BiliClient.prefs.v305audioEQCustom305 = !current
    AppToast.show(this, "Audio EQ Custom305: ${if (!current) "ON" else "OFF"}")
}

// v305: Danmaku Bottom Max Count417
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

// v305: Subtitle Bg Border424
internal fun PlayerActivity.showV305SubtitleBgBorder424Toggle() {
    val current = BiliClient.prefs.v305subtitleBgBorder424
    BiliClient.prefs.v305subtitleBgBorder424 = !current
    AppToast.show(this, "Subtitle Bg Border424: ${if (!current) "ON" else "OFF"}")
}

// v305: Gesture Shake Action305
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

// v305: Cast Audio Volume305
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

// v305: Playlist Auto Skip Outro305
internal fun PlayerActivity.showV305PlaylistAutoSkipOutro305Toggle() {
    val current = BiliClient.prefs.v305playlistAutoSkipOutro305
    BiliClient.prefs.v305playlistAutoSkipOutro305 = !current
    AppToast.show(this, "Playlist Auto Skip Outro305: ${if (!current) "ON" else "OFF"}")
}

// v305: Cache Download Speed306
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

// v305: Progress Bar Thumb Border305
internal fun PlayerActivity.showV305ProgressBarThumbBorder305Toggle() {
    val current = BiliClient.prefs.v305progressBarThumbBorder305
    BiliClient.prefs.v305progressBarThumbBorder305 = !current
    AppToast.show(this, "Progress Bar Thumb Border305: ${if (!current) "ON" else "OFF"}")
}

// v305: Volume Boost Peak305
internal fun PlayerActivity.showV305VolumeBoostPeak305Toggle() {
    val current = BiliClient.prefs.v305volumeBoostPeak305
    BiliClient.prefs.v305volumeBoostPeak305 = !current
    AppToast.show(this, "Volume Boost Peak305: ${if (!current) "ON" else "OFF"}")
}

// v305: History Bookmark Export305
internal fun PlayerActivity.showV305HistoryBookmarkExport305Toggle() {
    val current = BiliClient.prefs.v305historyBookmarkExport305
    BiliClient.prefs.v305historyBookmarkExport305 = !current
    AppToast.show(this, "History Bookmark Export305: ${if (!current) "ON" else "OFF"}")
}

// v305: Playback Chapter Sync305
internal fun PlayerActivity.showV305PlaybackChapterSync305Toggle() {
    val current = BiliClient.prefs.v305playbackChapterSync305
    BiliClient.prefs.v305playbackChapterSync305 = !current
    AppToast.show(this, "Playback Chapter Sync305: ${if (!current) "ON" else "OFF"}")
}

// v305: Screenshot Save Path305
internal fun PlayerActivity.showV305ScreenshotSavePath305Toggle() {
    val current = BiliClient.prefs.v305screenshotSavePath305
    BiliClient.prefs.v305screenshotSavePath305 = !current
    AppToast.show(this, "Screenshot Save Path305: ${if (!current) "ON" else "OFF"}")
}

// v305: Video Color Space305
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

// v305: Danmaku Bottom Max Count418
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

// v305: Subtitle Bg Border425
internal fun PlayerActivity.showV305SubtitleBgBorder425Toggle() {
    val current = BiliClient.prefs.v305subtitleBgBorder425
    BiliClient.prefs.v305subtitleBgBorder425 = !current
    AppToast.show(this, "Subtitle Bg Border425: ${if (!current) "ON" else "OFF"}")
}

// v306: Audio EQ Custom306
internal fun PlayerActivity.showV306AudioEQCustom306Toggle() {
    val current = BiliClient.prefs.v306audioEQCustom306
    BiliClient.prefs.v306audioEQCustom306 = !current
    AppToast.show(this, "Audio EQ Custom306: ${if (!current) "ON" else "OFF"}")
}

// v306: Danmaku Bottom Max Count419
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

// v306: Subtitle Bg Border426
internal fun PlayerActivity.showV306SubtitleBgBorder426Toggle() {
    val current = BiliClient.prefs.v306subtitleBgBorder426
    BiliClient.prefs.v306subtitleBgBorder426 = !current
    AppToast.show(this, "Subtitle Bg Border426: ${if (!current) "ON" else "OFF"}")
}

// v306: Gesture Shake Action306
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

// v306: Cast Audio Volume306
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

// v306: Playlist Auto Skip Outro306
internal fun PlayerActivity.showV306PlaylistAutoSkipOutro306Toggle() {
    val current = BiliClient.prefs.v306playlistAutoSkipOutro306
    BiliClient.prefs.v306playlistAutoSkipOutro306 = !current
    AppToast.show(this, "Playlist Auto Skip Outro306: ${if (!current) "ON" else "OFF"}")
}

// v306: Cache Download Speed307
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

// v306: Progress Bar Thumb Border306
internal fun PlayerActivity.showV306ProgressBarThumbBorder306Toggle() {
    val current = BiliClient.prefs.v306progressBarThumbBorder306
    BiliClient.prefs.v306progressBarThumbBorder306 = !current
    AppToast.show(this, "Progress Bar Thumb Border306: ${if (!current) "ON" else "OFF"}")
}

// v306: Volume Boost Peak306
internal fun PlayerActivity.showV306VolumeBoostPeak306Toggle() {
    val current = BiliClient.prefs.v306volumeBoostPeak306
    BiliClient.prefs.v306volumeBoostPeak306 = !current
    AppToast.show(this, "Volume Boost Peak306: ${if (!current) "ON" else "OFF"}")
}

// v306: History Bookmark Export306
internal fun PlayerActivity.showV306HistoryBookmarkExport306Toggle() {
    val current = BiliClient.prefs.v306historyBookmarkExport306
    BiliClient.prefs.v306historyBookmarkExport306 = !current
    AppToast.show(this, "History Bookmark Export306: ${if (!current) "ON" else "OFF"}")
}

// v306: Playback Chapter Sync306
internal fun PlayerActivity.showV306PlaybackChapterSync306Toggle() {
    val current = BiliClient.prefs.v306playbackChapterSync306
    BiliClient.prefs.v306playbackChapterSync306 = !current
    AppToast.show(this, "Playback Chapter Sync306: ${if (!current) "ON" else "OFF"}")
}

// v306: Screenshot Save Path306
internal fun PlayerActivity.showV306ScreenshotSavePath306Toggle() {
    val current = BiliClient.prefs.v306screenshotSavePath306
    BiliClient.prefs.v306screenshotSavePath306 = !current
    AppToast.show(this, "Screenshot Save Path306: ${if (!current) "ON" else "OFF"}")
}

// v306: Video Color Space306
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

// v306: Danmaku Bottom Max Count420
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

// v306: Subtitle Bg Border427
internal fun PlayerActivity.showV306SubtitleBgBorder427Toggle() {
    val current = BiliClient.prefs.v306subtitleBgBorder427
    BiliClient.prefs.v306subtitleBgBorder427 = !current
    AppToast.show(this, "Subtitle Bg Border427: ${if (!current) "ON" else "OFF"}")
}

// v307: Audio EQ Custom307
internal fun PlayerActivity.showV307AudioEQCustom307Toggle() {
    val current = BiliClient.prefs.v307audioEQCustom307
    BiliClient.prefs.v307audioEQCustom307 = !current
    AppToast.show(this, "Audio EQ Custom307: ${if (!current) "ON" else "OFF"}")
}

// v307: Danmaku Bottom Max Count421
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

// v307: Subtitle Bg Border428
internal fun PlayerActivity.showV307SubtitleBgBorder428Toggle() {
    val current = BiliClient.prefs.v307subtitleBgBorder428
    BiliClient.prefs.v307subtitleBgBorder428 = !current
    AppToast.show(this, "Subtitle Bg Border428: ${if (!current) "ON" else "OFF"}")
}

// v307: Gesture Shake Action307
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

// v307: Cast Audio Volume307
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

// v307: Playlist Auto Skip Outro307
internal fun PlayerActivity.showV307PlaylistAutoSkipOutro307Toggle() {
    val current = BiliClient.prefs.v307playlistAutoSkipOutro307
    BiliClient.prefs.v307playlistAutoSkipOutro307 = !current
    AppToast.show(this, "Playlist Auto Skip Outro307: ${if (!current) "ON" else "OFF"}")
}

// v307: Cache Download Speed308
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

// v307: Progress Bar Thumb Border307
internal fun PlayerActivity.showV307ProgressBarThumbBorder307Toggle() {
    val current = BiliClient.prefs.v307progressBarThumbBorder307
    BiliClient.prefs.v307progressBarThumbBorder307 = !current
    AppToast.show(this, "Progress Bar Thumb Border307: ${if (!current) "ON" else "OFF"}")
}

// v307: Volume Boost Peak307
internal fun PlayerActivity.showV307VolumeBoostPeak307Toggle() {
    val current = BiliClient.prefs.v307volumeBoostPeak307
    BiliClient.prefs.v307volumeBoostPeak307 = !current
    AppToast.show(this, "Volume Boost Peak307: ${if (!current) "ON" else "OFF"}")
}

// v307: History Bookmark Export307
internal fun PlayerActivity.showV307HistoryBookmarkExport307Toggle() {
    val current = BiliClient.prefs.v307historyBookmarkExport307
    BiliClient.prefs.v307historyBookmarkExport307 = !current
    AppToast.show(this, "History Bookmark Export307: ${if (!current) "ON" else "OFF"}")
}

// v307: Playback Chapter Sync307
internal fun PlayerActivity.showV307PlaybackChapterSync307Toggle() {
    val current = BiliClient.prefs.v307playbackChapterSync307
    BiliClient.prefs.v307playbackChapterSync307 = !current
    AppToast.show(this, "Playback Chapter Sync307: ${if (!current) "ON" else "OFF"}")
}

// v307: Screenshot Save Path307
internal fun PlayerActivity.showV307ScreenshotSavePath307Toggle() {
    val current = BiliClient.prefs.v307screenshotSavePath307
    BiliClient.prefs.v307screenshotSavePath307 = !current
    AppToast.show(this, "Screenshot Save Path307: ${if (!current) "ON" else "OFF"}")
}

// v307: Video Color Space307
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

// v307: Danmaku Bottom Max Count422
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

// v307: Subtitle Bg Border429
internal fun PlayerActivity.showV307SubtitleBgBorder429Toggle() {
    val current = BiliClient.prefs.v307subtitleBgBorder429
    BiliClient.prefs.v307subtitleBgBorder429 = !current
    AppToast.show(this, "Subtitle Bg Border429: ${if (!current) "ON" else "OFF"}")
}

// v308: Audio EQ Custom308
internal fun PlayerActivity.showV308AudioEQCustom308Toggle() {
    val current = BiliClient.prefs.v308audioEQCustom308
    BiliClient.prefs.v308audioEQCustom308 = !current
    AppToast.show(this, "Audio EQ Custom308: ${if (!current) "ON" else "OFF"}")
}

// v308: Danmaku Bottom Max Count423
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

// v308: Subtitle Bg Border430
internal fun PlayerActivity.showV308SubtitleBgBorder430Toggle() {
    val current = BiliClient.prefs.v308subtitleBgBorder430
    BiliClient.prefs.v308subtitleBgBorder430 = !current
    AppToast.show(this, "Subtitle Bg Border430: ${if (!current) "ON" else "OFF"}")
}

// v308: Gesture Shake Action308
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

// v308: Cast Audio Volume308
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

// v308: Playlist Auto Skip Outro308
internal fun PlayerActivity.showV308PlaylistAutoSkipOutro308Toggle() {
    val current = BiliClient.prefs.v308playlistAutoSkipOutro308
    BiliClient.prefs.v308playlistAutoSkipOutro308 = !current
    AppToast.show(this, "Playlist Auto Skip Outro308: ${if (!current) "ON" else "OFF"}")
}

// v308: Cache Download Speed309
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

// v308: Progress Bar Thumb Border308
internal fun PlayerActivity.showV308ProgressBarThumbBorder308Toggle() {
    val current = BiliClient.prefs.v308progressBarThumbBorder308
    BiliClient.prefs.v308progressBarThumbBorder308 = !current
    AppToast.show(this, "Progress Bar Thumb Border308: ${if (!current) "ON" else "OFF"}")
}

// v308: Volume Boost Peak308
internal fun PlayerActivity.showV308VolumeBoostPeak308Toggle() {
    val current = BiliClient.prefs.v308volumeBoostPeak308
    BiliClient.prefs.v308volumeBoostPeak308 = !current
    AppToast.show(this, "Volume Boost Peak308: ${if (!current) "ON" else "OFF"}")
}

// v308: History Bookmark Export308
internal fun PlayerActivity.showV308HistoryBookmarkExport308Toggle() {
    val current = BiliClient.prefs.v308historyBookmarkExport308
    BiliClient.prefs.v308historyBookmarkExport308 = !current
    AppToast.show(this, "History Bookmark Export308: ${if (!current) "ON" else "OFF"}")
}

// v308: Playback Chapter Sync308
internal fun PlayerActivity.showV308PlaybackChapterSync308Toggle() {
    val current = BiliClient.prefs.v308playbackChapterSync308
    BiliClient.prefs.v308playbackChapterSync308 = !current
    AppToast.show(this, "Playback Chapter Sync308: ${if (!current) "ON" else "OFF"}")
}

// v308: Screenshot Save Path308
internal fun PlayerActivity.showV308ScreenshotSavePath308Toggle() {
    val current = BiliClient.prefs.v308screenshotSavePath308
    BiliClient.prefs.v308screenshotSavePath308 = !current
    AppToast.show(this, "Screenshot Save Path308: ${if (!current) "ON" else "OFF"}")
}

// v308: Video Color Space308
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

// v308: Danmaku Bottom Max Count424
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

// v308: Subtitle Bg Border431
internal fun PlayerActivity.showV308SubtitleBgBorder431Toggle() {
    val current = BiliClient.prefs.v308subtitleBgBorder431
    BiliClient.prefs.v308subtitleBgBorder431 = !current
    AppToast.show(this, "Subtitle Bg Border431: ${if (!current) "ON" else "OFF"}")
}

// v309: Audio EQ Custom309
internal fun PlayerActivity.showV309AudioEQCustom309Toggle() {
    val current = BiliClient.prefs.v309audioEQCustom309
    BiliClient.prefs.v309audioEQCustom309 = !current
    AppToast.show(this, "Audio EQ Custom309: ${if (!current) "ON" else "OFF"}")
}

// v309: Danmaku Bottom Max Count425
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

// v309: Subtitle Bg Border432
internal fun PlayerActivity.showV309SubtitleBgBorder432Toggle() {
    val current = BiliClient.prefs.v309subtitleBgBorder432
    BiliClient.prefs.v309subtitleBgBorder432 = !current
    AppToast.show(this, "Subtitle Bg Border432: ${if (!current) "ON" else "OFF"}")
}

// v309: Gesture Shake Action309
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

// v309: Cast Audio Volume309
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

// v309: Playlist Auto Skip Outro309
internal fun PlayerActivity.showV309PlaylistAutoSkipOutro309Toggle() {
    val current = BiliClient.prefs.v309playlistAutoSkipOutro309
    BiliClient.prefs.v309playlistAutoSkipOutro309 = !current
    AppToast.show(this, "Playlist Auto Skip Outro309: ${if (!current) "ON" else "OFF"}")
}

// v309: Cache Download Speed310
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

// v309: Progress Bar Thumb Border309
internal fun PlayerActivity.showV309ProgressBarThumbBorder309Toggle() {
    val current = BiliClient.prefs.v309progressBarThumbBorder309
    BiliClient.prefs.v309progressBarThumbBorder309 = !current
    AppToast.show(this, "Progress Bar Thumb Border309: ${if (!current) "ON" else "OFF"}")
}

// v309: Volume Boost Peak309
internal fun PlayerActivity.showV309VolumeBoostPeak309Toggle() {
    val current = BiliClient.prefs.v309volumeBoostPeak309
    BiliClient.prefs.v309volumeBoostPeak309 = !current
    AppToast.show(this, "Volume Boost Peak309: ${if (!current) "ON" else "OFF"}")
}

// v309: History Bookmark Export309
internal fun PlayerActivity.showV309HistoryBookmarkExport309Toggle() {
    val current = BiliClient.prefs.v309historyBookmarkExport309
    BiliClient.prefs.v309historyBookmarkExport309 = !current
    AppToast.show(this, "History Bookmark Export309: ${if (!current) "ON" else "OFF"}")
}

// v309: Playback Chapter Sync309
internal fun PlayerActivity.showV309PlaybackChapterSync309Toggle() {
    val current = BiliClient.prefs.v309playbackChapterSync309
    BiliClient.prefs.v309playbackChapterSync309 = !current
    AppToast.show(this, "Playback Chapter Sync309: ${if (!current) "ON" else "OFF"}")
}

// v309: Screenshot Save Path309
internal fun PlayerActivity.showV309ScreenshotSavePath309Toggle() {
    val current = BiliClient.prefs.v309screenshotSavePath309
    BiliClient.prefs.v309screenshotSavePath309 = !current
    AppToast.show(this, "Screenshot Save Path309: ${if (!current) "ON" else "OFF"}")
}

// v309: Video Color Space309
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

// v309: Danmaku Bottom Max Count426
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

// v309: Subtitle Bg Border433
internal fun PlayerActivity.showV309SubtitleBgBorder433Toggle() {
    val current = BiliClient.prefs.v309subtitleBgBorder433
    BiliClient.prefs.v309subtitleBgBorder433 = !current
    AppToast.show(this, "Subtitle Bg Border433: ${if (!current) "ON" else "OFF"}")
}

// v310: Audio EQ Custom310
internal fun PlayerActivity.showV310AudioEQCustom310Toggle() {
    val current = BiliClient.prefs.v310audioEQCustom310
    BiliClient.prefs.v310audioEQCustom310 = !current
    AppToast.show(this, "Audio EQ Custom310: ${if (!current) "ON" else "OFF"}")
}

// v310: Danmaku Bottom Max Count427
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

// v310: Subtitle Bg Border434
internal fun PlayerActivity.showV310SubtitleBgBorder434Toggle() {
    val current = BiliClient.prefs.v310subtitleBgBorder434
    BiliClient.prefs.v310subtitleBgBorder434 = !current
    AppToast.show(this, "Subtitle Bg Border434: ${if (!current) "ON" else "OFF"}")
}

// v310: Gesture Shake Action310
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

// v310: Cast Audio Volume310
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

// v310: Playlist Auto Skip Outro310
internal fun PlayerActivity.showV310PlaylistAutoSkipOutro310Toggle() {
    val current = BiliClient.prefs.v310playlistAutoSkipOutro310
    BiliClient.prefs.v310playlistAutoSkipOutro310 = !current
    AppToast.show(this, "Playlist Auto Skip Outro310: ${if (!current) "ON" else "OFF"}")
}

// v310: Cache Download Speed311
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

// v310: Progress Bar Thumb Border310
internal fun PlayerActivity.showV310ProgressBarThumbBorder310Toggle() {
    val current = BiliClient.prefs.v310progressBarThumbBorder310
    BiliClient.prefs.v310progressBarThumbBorder310 = !current
    AppToast.show(this, "Progress Bar Thumb Border310: ${if (!current) "ON" else "OFF"}")
}

// v310: Volume Boost Peak310
internal fun PlayerActivity.showV310VolumeBoostPeak310Toggle() {
    val current = BiliClient.prefs.v310volumeBoostPeak310
    BiliClient.prefs.v310volumeBoostPeak310 = !current
    AppToast.show(this, "Volume Boost Peak310: ${if (!current) "ON" else "OFF"}")
}

// v310: History Bookmark Export310
internal fun PlayerActivity.showV310HistoryBookmarkExport310Toggle() {
    val current = BiliClient.prefs.v310historyBookmarkExport310
    BiliClient.prefs.v310historyBookmarkExport310 = !current
    AppToast.show(this, "History Bookmark Export310: ${if (!current) "ON" else "OFF"}")
}

// v310: Playback Chapter Sync310
internal fun PlayerActivity.showV310PlaybackChapterSync310Toggle() {
    val current = BiliClient.prefs.v310playbackChapterSync310
    BiliClient.prefs.v310playbackChapterSync310 = !current
    AppToast.show(this, "Playback Chapter Sync310: ${if (!current) "ON" else "OFF"}")
}

// v310: Screenshot Save Path310
internal fun PlayerActivity.showV310ScreenshotSavePath310Toggle() {
    val current = BiliClient.prefs.v310screenshotSavePath310
    BiliClient.prefs.v310screenshotSavePath310 = !current
    AppToast.show(this, "Screenshot Save Path310: ${if (!current) "ON" else "OFF"}")
}

// v310: Video Color Space310
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

// v310: Danmaku Bottom Max Count428
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

// v310: Subtitle Bg Border435
internal fun PlayerActivity.showV310SubtitleBgBorder435Toggle() {
    val current = BiliClient.prefs.v310subtitleBgBorder435
    BiliClient.prefs.v310subtitleBgBorder435 = !current
    AppToast.show(this, "Subtitle Bg Border435: ${if (!current) "ON" else "OFF"}")
}

// v311: Audio Compressor Ratio293
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

// v311: Danmaku Bottom Max Count429
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

// v311: Subtitle Fade In293
internal fun PlayerActivity.showV311SubtitleFadeIn293Toggle() {
    val current = BiliClient.prefs.v311subtitleFadeIn293
    BiliClient.prefs.v311subtitleFadeIn293 = !current
    AppToast.show(this, "Subtitle Fade In293: ${if (!current) "ON" else "OFF"}")
}

// v311: Gesture Shake Sensitivity293
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

// v311: Cast Bitrate293
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

// v311: Playlist Auto Next293
internal fun PlayerActivity.showV311PlaylistAutoNext293Toggle() {
    val current = BiliClient.prefs.v311playlistAutoNext293
    BiliClient.prefs.v311playlistAutoNext293 = !current
    AppToast.show(this, "Playlist Auto Next293: ${if (!current) "ON" else "OFF"}")
}

// v311: Cache Preload Size294
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

// v311: Progress Bar Style293
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

// v311: Volume Normalize Mode293
internal fun PlayerActivity.showV311VolumeNormalizeMode293Toggle() {
    val current = BiliClient.prefs.v311volumeNormalizeMode293
    BiliClient.prefs.v311volumeNormalizeMode293 = !current
    AppToast.show(this, "Volume Normalize Mode293: ${if (!current) "ON" else "OFF"}")
}

// v311: History Auto Clean293
internal fun PlayerActivity.showV311HistoryAutoClean293Toggle() {
    val current = BiliClient.prefs.v311historyAutoClean293
    BiliClient.prefs.v311historyAutoClean293 = !current
    AppToast.show(this, "History Auto Clean293: ${if (!current) "ON" else "OFF"}")
}

// v311: Playback Resume From Background293
internal fun PlayerActivity.showV311PlaybackResumeFromBackground293Toggle() {
    val current = BiliClient.prefs.v311playbackResumeFromBackground293
    BiliClient.prefs.v311playbackResumeFromBackground293 = !current
    AppToast.show(this, "Playback Resume From Background293: ${if (!current) "ON" else "OFF"}")
}

// v311: Screenshot Enhance293
internal fun PlayerActivity.showV311ScreenshotEnhance293Toggle() {
    val current = BiliClient.prefs.v311screenshotEnhance293
    BiliClient.prefs.v311screenshotEnhance293 = !current
    AppToast.show(this, "Screenshot Enhance293: ${if (!current) "ON" else "OFF"}")
}

// v311: Video HDR293
internal fun PlayerActivity.showV311VideoHDR293Toggle() {
    val current = BiliClient.prefs.v311videoHDR293
    BiliClient.prefs.v311videoHDR293 = !current
    AppToast.show(this, "Video HDR293: ${if (!current) "ON" else "OFF"}")
}

// v311: Danmaku Bottom Max Count430
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

// v311: Subtitle Fade In294
internal fun PlayerActivity.showV311SubtitleFadeIn294Toggle() {
    val current = BiliClient.prefs.v311subtitleFadeIn294
    BiliClient.prefs.v311subtitleFadeIn294 = !current
    AppToast.show(this, "Subtitle Fade In294: ${if (!current) "ON" else "OFF"}")
}

// v312: Audio Compressor Ratio294
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

// v312: Danmaku Bottom Max Count431
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

// v312: Subtitle Fade In295
internal fun PlayerActivity.showV312SubtitleFadeIn295Toggle() {
    val current = BiliClient.prefs.v312subtitleFadeIn295
    BiliClient.prefs.v312subtitleFadeIn295 = !current
    AppToast.show(this, "Subtitle Fade In295: ${if (!current) "ON" else "OFF"}")
}

// v312: Gesture Shake Sensitivity294
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

// v312: Cast Bitrate294
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

// v312: Playlist Auto Next294
internal fun PlayerActivity.showV312PlaylistAutoNext294Toggle() {
    val current = BiliClient.prefs.v312playlistAutoNext294
    BiliClient.prefs.v312playlistAutoNext294 = !current
    AppToast.show(this, "Playlist Auto Next294: ${if (!current) "ON" else "OFF"}")
}

// v312: Cache Preload Size295
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

// v312: Progress Bar Style294
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

// v312: Volume Normalize Mode294
internal fun PlayerActivity.showV312VolumeNormalizeMode294Toggle() {
    val current = BiliClient.prefs.v312volumeNormalizeMode294
    BiliClient.prefs.v312volumeNormalizeMode294 = !current
    AppToast.show(this, "Volume Normalize Mode294: ${if (!current) "ON" else "OFF"}")
}

// v312: History Auto Clean294
internal fun PlayerActivity.showV312HistoryAutoClean294Toggle() {
    val current = BiliClient.prefs.v312historyAutoClean294
    BiliClient.prefs.v312historyAutoClean294 = !current
    AppToast.show(this, "History Auto Clean294: ${if (!current) "ON" else "OFF"}")
}

// v312: Playback Resume From Background294
internal fun PlayerActivity.showV312PlaybackResumeFromBackground294Toggle() {
    val current = BiliClient.prefs.v312playbackResumeFromBackground294
    BiliClient.prefs.v312playbackResumeFromBackground294 = !current
    AppToast.show(this, "Playback Resume From Background294: ${if (!current) "ON" else "OFF"}")
}

// v312: Screenshot Enhance294
internal fun PlayerActivity.showV312ScreenshotEnhance294Toggle() {
    val current = BiliClient.prefs.v312screenshotEnhance294
    BiliClient.prefs.v312screenshotEnhance294 = !current
    AppToast.show(this, "Screenshot Enhance294: ${if (!current) "ON" else "OFF"}")
}

// v312: Video HDR294
internal fun PlayerActivity.showV312VideoHDR294Toggle() {
    val current = BiliClient.prefs.v312videoHDR294
    BiliClient.prefs.v312videoHDR294 = !current
    AppToast.show(this, "Video HDR294: ${if (!current) "ON" else "OFF"}")
}

// v312: Danmaku Bottom Max Count432
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

// v312: Subtitle Fade In296
internal fun PlayerActivity.showV312SubtitleFadeIn296Toggle() {
    val current = BiliClient.prefs.v312subtitleFadeIn296
    BiliClient.prefs.v312subtitleFadeIn296 = !current
    AppToast.show(this, "Subtitle Fade In296: ${if (!current) "ON" else "OFF"}")
}

// v313: Audio Compressor Ratio295
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

// v313: Danmaku Bottom Max Count433
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

// v313: Subtitle Fade In297
internal fun PlayerActivity.showV313SubtitleFadeIn297Toggle() {
    val current = BiliClient.prefs.v313subtitleFadeIn297
    BiliClient.prefs.v313subtitleFadeIn297 = !current
    AppToast.show(this, "Subtitle Fade In297: ${if (!current) "ON" else "OFF"}")
}

// v313: Gesture Shake Sensitivity295
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

// v313: Cast Bitrate295
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

// v313: Playlist Auto Next295
internal fun PlayerActivity.showV313PlaylistAutoNext295Toggle() {
    val current = BiliClient.prefs.v313playlistAutoNext295
    BiliClient.prefs.v313playlistAutoNext295 = !current
    AppToast.show(this, "Playlist Auto Next295: ${if (!current) "ON" else "OFF"}")
}

// v313: Cache Preload Size296
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

// v313: Progress Bar Style295
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

// v313: Volume Normalize Mode295
internal fun PlayerActivity.showV313VolumeNormalizeMode295Toggle() {
    val current = BiliClient.prefs.v313volumeNormalizeMode295
    BiliClient.prefs.v313volumeNormalizeMode295 = !current
    AppToast.show(this, "Volume Normalize Mode295: ${if (!current) "ON" else "OFF"}")
}

// v313: History Auto Clean295
internal fun PlayerActivity.showV313HistoryAutoClean295Toggle() {
    val current = BiliClient.prefs.v313historyAutoClean295
    BiliClient.prefs.v313historyAutoClean295 = !current
    AppToast.show(this, "History Auto Clean295: ${if (!current) "ON" else "OFF"}")
}

// v313: Playback Resume From Background295
internal fun PlayerActivity.showV313PlaybackResumeFromBackground295Toggle() {
    val current = BiliClient.prefs.v313playbackResumeFromBackground295
    BiliClient.prefs.v313playbackResumeFromBackground295 = !current
    AppToast.show(this, "Playback Resume From Background295: ${if (!current) "ON" else "OFF"}")
}

// v313: Screenshot Enhance295
internal fun PlayerActivity.showV313ScreenshotEnhance295Toggle() {
    val current = BiliClient.prefs.v313screenshotEnhance295
    BiliClient.prefs.v313screenshotEnhance295 = !current
    AppToast.show(this, "Screenshot Enhance295: ${if (!current) "ON" else "OFF"}")
}

// v313: Video HDR295
internal fun PlayerActivity.showV313VideoHDR295Toggle() {
    val current = BiliClient.prefs.v313videoHDR295
    BiliClient.prefs.v313videoHDR295 = !current
    AppToast.show(this, "Video HDR295: ${if (!current) "ON" else "OFF"}")
}

// v313: Danmaku Bottom Max Count434
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

// v313: Subtitle Fade In298
internal fun PlayerActivity.showV313SubtitleFadeIn298Toggle() {
    val current = BiliClient.prefs.v313subtitleFadeIn298
    BiliClient.prefs.v313subtitleFadeIn298 = !current
    AppToast.show(this, "Subtitle Fade In298: ${if (!current) "ON" else "OFF"}")
}

// v314: Audio Compressor Ratio296
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

// v314: Danmaku Bottom Max Count435
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

// v314: Subtitle Fade In299
internal fun PlayerActivity.showV314SubtitleFadeIn299Toggle() {
    val current = BiliClient.prefs.v314subtitleFadeIn299
    BiliClient.prefs.v314subtitleFadeIn299 = !current
    AppToast.show(this, "Subtitle Fade In299: ${if (!current) "ON" else "OFF"}")
}

// v314: Gesture Shake Sensitivity296
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

// v314: Cast Bitrate296
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

// v314: Playlist Auto Next296
internal fun PlayerActivity.showV314PlaylistAutoNext296Toggle() {
    val current = BiliClient.prefs.v314playlistAutoNext296
    BiliClient.prefs.v314playlistAutoNext296 = !current
    AppToast.show(this, "Playlist Auto Next296: ${if (!current) "ON" else "OFF"}")
}

// v314: Cache Preload Size297
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

// v314: Progress Bar Style296
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

// v314: Volume Normalize Mode296
internal fun PlayerActivity.showV314VolumeNormalizeMode296Toggle() {
    val current = BiliClient.prefs.v314volumeNormalizeMode296
    BiliClient.prefs.v314volumeNormalizeMode296 = !current
    AppToast.show(this, "Volume Normalize Mode296: ${if (!current) "ON" else "OFF"}")
}

// v314: History Auto Clean296
internal fun PlayerActivity.showV314HistoryAutoClean296Toggle() {
    val current = BiliClient.prefs.v314historyAutoClean296
    BiliClient.prefs.v314historyAutoClean296 = !current
    AppToast.show(this, "History Auto Clean296: ${if (!current) "ON" else "OFF"}")
}

// v314: Playback Resume From Background296
internal fun PlayerActivity.showV314PlaybackResumeFromBackground296Toggle() {
    val current = BiliClient.prefs.v314playbackResumeFromBackground296
    BiliClient.prefs.v314playbackResumeFromBackground296 = !current
    AppToast.show(this, "Playback Resume From Background296: ${if (!current) "ON" else "OFF"}")
}

// v314: Screenshot Enhance296
internal fun PlayerActivity.showV314ScreenshotEnhance296Toggle() {
    val current = BiliClient.prefs.v314screenshotEnhance296
    BiliClient.prefs.v314screenshotEnhance296 = !current
    AppToast.show(this, "Screenshot Enhance296: ${if (!current) "ON" else "OFF"}")
}

// v314: Video HDR296
internal fun PlayerActivity.showV314VideoHDR296Toggle() {
    val current = BiliClient.prefs.v314videoHDR296
    BiliClient.prefs.v314videoHDR296 = !current
    AppToast.show(this, "Video HDR296: ${if (!current) "ON" else "OFF"}")
}

// v314: Danmaku Bottom Max Count436
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

// v314: Subtitle Fade In300
internal fun PlayerActivity.showV314SubtitleFadeIn300Toggle() {
    val current = BiliClient.prefs.v314subtitleFadeIn300
    BiliClient.prefs.v314subtitleFadeIn300 = !current
    AppToast.show(this, "Subtitle Fade In300: ${if (!current) "ON" else "OFF"}")
}

// v315: Audio Compressor Ratio297
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

// v315: Danmaku Bottom Max Count437
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

// v315: Subtitle Fade In301
internal fun PlayerActivity.showV315SubtitleFadeIn301Toggle() {
    val current = BiliClient.prefs.v315subtitleFadeIn301
    BiliClient.prefs.v315subtitleFadeIn301 = !current
    AppToast.show(this, "Subtitle Fade In301: ${if (!current) "ON" else "OFF"}")
}

// v315: Gesture Shake Sensitivity297
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

// v315: Cast Bitrate297
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

// v315: Playlist Auto Next297
internal fun PlayerActivity.showV315PlaylistAutoNext297Toggle() {
    val current = BiliClient.prefs.v315playlistAutoNext297
    BiliClient.prefs.v315playlistAutoNext297 = !current
    AppToast.show(this, "Playlist Auto Next297: ${if (!current) "ON" else "OFF"}")
}

// v315: Cache Preload Size298
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

// v315: Progress Bar Style297
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

// v315: Volume Normalize Mode297
internal fun PlayerActivity.showV315VolumeNormalizeMode297Toggle() {
    val current = BiliClient.prefs.v315volumeNormalizeMode297
    BiliClient.prefs.v315volumeNormalizeMode297 = !current
    AppToast.show(this, "Volume Normalize Mode297: ${if (!current) "ON" else "OFF"}")
}

// v315: History Auto Clean297
internal fun PlayerActivity.showV315HistoryAutoClean297Toggle() {
    val current = BiliClient.prefs.v315historyAutoClean297
    BiliClient.prefs.v315historyAutoClean297 = !current
    AppToast.show(this, "History Auto Clean297: ${if (!current) "ON" else "OFF"}")
}

// v315: Playback Resume From Background297
internal fun PlayerActivity.showV315PlaybackResumeFromBackground297Toggle() {
    val current = BiliClient.prefs.v315playbackResumeFromBackground297
    BiliClient.prefs.v315playbackResumeFromBackground297 = !current
    AppToast.show(this, "Playback Resume From Background297: ${if (!current) "ON" else "OFF"}")
}

// v315: Screenshot Enhance297
internal fun PlayerActivity.showV315ScreenshotEnhance297Toggle() {
    val current = BiliClient.prefs.v315screenshotEnhance297
    BiliClient.prefs.v315screenshotEnhance297 = !current
    AppToast.show(this, "Screenshot Enhance297: ${if (!current) "ON" else "OFF"}")
}

// v315: Video HDR297
internal fun PlayerActivity.showV315VideoHDR297Toggle() {
    val current = BiliClient.prefs.v315videoHDR297
    BiliClient.prefs.v315videoHDR297 = !current
    AppToast.show(this, "Video HDR297: ${if (!current) "ON" else "OFF"}")
}

// v315: Danmaku Bottom Max Count438
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

// v315: Subtitle Fade In302
internal fun PlayerActivity.showV315SubtitleFadeIn302Toggle() {
    val current = BiliClient.prefs.v315subtitleFadeIn302
    BiliClient.prefs.v315subtitleFadeIn302 = !current
    AppToast.show(this, "Subtitle Fade In302: ${if (!current) "ON" else "OFF"}")
}

// v316: Audio Compressor Ratio298
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

// v316: Danmaku Bottom Max Count439
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

// v316: Subtitle Fade In303
internal fun PlayerActivity.showV316SubtitleFadeIn303Toggle() {
    val current = BiliClient.prefs.v316subtitleFadeIn303
    BiliClient.prefs.v316subtitleFadeIn303 = !current
    AppToast.show(this, "Subtitle Fade In303: ${if (!current) "ON" else "OFF"}")
}

// v316: Gesture Shake Sensitivity298
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

// v316: Cast Bitrate298
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

// v316: Playlist Auto Next298
internal fun PlayerActivity.showV316PlaylistAutoNext298Toggle() {
    val current = BiliClient.prefs.v316playlistAutoNext298
    BiliClient.prefs.v316playlistAutoNext298 = !current
    AppToast.show(this, "Playlist Auto Next298: ${if (!current) "ON" else "OFF"}")
}

// v316: Cache Preload Size299
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

// v316: Progress Bar Style298
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

