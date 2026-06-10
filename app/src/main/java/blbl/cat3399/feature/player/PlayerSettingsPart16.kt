package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v223: Gesture Shake Action223
internal fun PlayerActivity.showV223GestureShakeAction223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223gestureShakeAction223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223gestureShakeAction223 = value
        AppToast.show(this, "Gesture Shake Action223: $value")
    }
}

// v223: Cast Audio Volume223
internal fun PlayerActivity.showV223CastAudioVolume223Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v223castAudioVolume223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223castAudioVolume223 = value
        AppToast.show(this, "Cast Audio Volume223: $value")
    }
}

// v223: Playlist Auto Skip Outro223
internal fun PlayerActivity.showV223PlaylistAutoSkipOutro223Toggle() {
    val current = BiliClient.prefs.v223playlistAutoSkipOutro223
    BiliClient.prefs.v223playlistAutoSkipOutro223 = !current
    AppToast.show(this, "Playlist Auto Skip Outro223: ${if (!current) "ON" else "OFF"}")
}

// v223: Cache Download Speed224
internal fun PlayerActivity.showV223CacheDownloadSpeed224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223cacheDownloadSpeed224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223cacheDownloadSpeed224 = value
        AppToast.show(this, "Cache Download Speed224: $value")
    }
}

// v223: Progress Bar Thumb Border223
internal fun PlayerActivity.showV223ProgressBarThumbBorder223Toggle() {
    val current = BiliClient.prefs.v223progressBarThumbBorder223
    BiliClient.prefs.v223progressBarThumbBorder223 = !current
    AppToast.show(this, "Progress Bar Thumb Border223: ${if (!current) "ON" else "OFF"}")
}

// v223: Volume Boost Peak223
internal fun PlayerActivity.showV223VolumeBoostPeak223Toggle() {
    val current = BiliClient.prefs.v223volumeBoostPeak223
    BiliClient.prefs.v223volumeBoostPeak223 = !current
    AppToast.show(this, "Volume Boost Peak223: ${if (!current) "ON" else "OFF"}")
}

// v223: History Bookmark Export223
internal fun PlayerActivity.showV223HistoryBookmarkExport223Toggle() {
    val current = BiliClient.prefs.v223historyBookmarkExport223
    BiliClient.prefs.v223historyBookmarkExport223 = !current
    AppToast.show(this, "History Bookmark Export223: ${if (!current) "ON" else "OFF"}")
}

// v223: Playback Chapter Sync223
internal fun PlayerActivity.showV223PlaybackChapterSync223Toggle() {
    val current = BiliClient.prefs.v223playbackChapterSync223
    BiliClient.prefs.v223playbackChapterSync223 = !current
    AppToast.show(this, "Playback Chapter Sync223: ${if (!current) "ON" else "OFF"}")
}

// v223: Screenshot Save Path223
internal fun PlayerActivity.showV223ScreenshotSavePath223Toggle() {
    val current = BiliClient.prefs.v223screenshotSavePath223
    BiliClient.prefs.v223screenshotSavePath223 = !current
    AppToast.show(this, "Screenshot Save Path223: ${if (!current) "ON" else "OFF"}")
}

// v223: Video Color Space223
internal fun PlayerActivity.showV223VideoColorSpace223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223videoColorSpace223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223videoColorSpace223 = value
        AppToast.show(this, "Video Color Space223: $value")
    }
}

// v223: Danmaku Bottom Max Count254
internal fun PlayerActivity.showV223DanmakuBottomMaxCount254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223danmakuBottomMaxCount254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223danmakuBottomMaxCount254 = value
        AppToast.show(this, "Danmaku Bottom Max Count254: $value")
    }
}

// v223: Subtitle Bg Border261
internal fun PlayerActivity.showV223SubtitleBgBorder261Toggle() {
    val current = BiliClient.prefs.v223subtitleBgBorder261
    BiliClient.prefs.v223subtitleBgBorder261 = !current
    AppToast.show(this, "Subtitle Bg Border261: ${if (!current) "ON" else "OFF"}")
}

// v224: Audio EQ Custom224
internal fun PlayerActivity.showV224AudioEQCustom224Toggle() {
    val current = BiliClient.prefs.v224audioEQCustom224
    BiliClient.prefs.v224audioEQCustom224 = !current
    AppToast.show(this, "Audio EQ Custom224: ${if (!current) "ON" else "OFF"}")
}

// v224: Danmaku Bottom Max Count255
internal fun PlayerActivity.showV224DanmakuBottomMaxCount255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224danmakuBottomMaxCount255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224danmakuBottomMaxCount255 = value
        AppToast.show(this, "Danmaku Bottom Max Count255: $value")
    }
}

// v224: Subtitle Bg Border262
internal fun PlayerActivity.showV224SubtitleBgBorder262Toggle() {
    val current = BiliClient.prefs.v224subtitleBgBorder262
    BiliClient.prefs.v224subtitleBgBorder262 = !current
    AppToast.show(this, "Subtitle Bg Border262: ${if (!current) "ON" else "OFF"}")
}

// v224: Gesture Shake Action224
internal fun PlayerActivity.showV224GestureShakeAction224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224gestureShakeAction224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224gestureShakeAction224 = value
        AppToast.show(this, "Gesture Shake Action224: $value")
    }
}

// v224: Cast Audio Volume224
internal fun PlayerActivity.showV224CastAudioVolume224Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v224castAudioVolume224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224castAudioVolume224 = value
        AppToast.show(this, "Cast Audio Volume224: $value")
    }
}

// v224: Playlist Auto Skip Outro224
internal fun PlayerActivity.showV224PlaylistAutoSkipOutro224Toggle() {
    val current = BiliClient.prefs.v224playlistAutoSkipOutro224
    BiliClient.prefs.v224playlistAutoSkipOutro224 = !current
    AppToast.show(this, "Playlist Auto Skip Outro224: ${if (!current) "ON" else "OFF"}")
}

// v224: Cache Download Speed225
internal fun PlayerActivity.showV224CacheDownloadSpeed225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224cacheDownloadSpeed225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224cacheDownloadSpeed225 = value
        AppToast.show(this, "Cache Download Speed225: $value")
    }
}

// v224: Progress Bar Thumb Border224
internal fun PlayerActivity.showV224ProgressBarThumbBorder224Toggle() {
    val current = BiliClient.prefs.v224progressBarThumbBorder224
    BiliClient.prefs.v224progressBarThumbBorder224 = !current
    AppToast.show(this, "Progress Bar Thumb Border224: ${if (!current) "ON" else "OFF"}")
}

// v224: Volume Boost Peak224
internal fun PlayerActivity.showV224VolumeBoostPeak224Toggle() {
    val current = BiliClient.prefs.v224volumeBoostPeak224
    BiliClient.prefs.v224volumeBoostPeak224 = !current
    AppToast.show(this, "Volume Boost Peak224: ${if (!current) "ON" else "OFF"}")
}

// v224: History Bookmark Export224
internal fun PlayerActivity.showV224HistoryBookmarkExport224Toggle() {
    val current = BiliClient.prefs.v224historyBookmarkExport224
    BiliClient.prefs.v224historyBookmarkExport224 = !current
    AppToast.show(this, "History Bookmark Export224: ${if (!current) "ON" else "OFF"}")
}

// v224: Playback Chapter Sync224
internal fun PlayerActivity.showV224PlaybackChapterSync224Toggle() {
    val current = BiliClient.prefs.v224playbackChapterSync224
    BiliClient.prefs.v224playbackChapterSync224 = !current
    AppToast.show(this, "Playback Chapter Sync224: ${if (!current) "ON" else "OFF"}")
}

// v224: Screenshot Save Path224
internal fun PlayerActivity.showV224ScreenshotSavePath224Toggle() {
    val current = BiliClient.prefs.v224screenshotSavePath224
    BiliClient.prefs.v224screenshotSavePath224 = !current
    AppToast.show(this, "Screenshot Save Path224: ${if (!current) "ON" else "OFF"}")
}

// v224: Video Color Space224
internal fun PlayerActivity.showV224VideoColorSpace224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224videoColorSpace224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224videoColorSpace224 = value
        AppToast.show(this, "Video Color Space224: $value")
    }
}

// v224: Danmaku Bottom Max Count256
internal fun PlayerActivity.showV224DanmakuBottomMaxCount256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224danmakuBottomMaxCount256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224danmakuBottomMaxCount256 = value
        AppToast.show(this, "Danmaku Bottom Max Count256: $value")
    }
}

// v224: Subtitle Bg Border263
internal fun PlayerActivity.showV224SubtitleBgBorder263Toggle() {
    val current = BiliClient.prefs.v224subtitleBgBorder263
    BiliClient.prefs.v224subtitleBgBorder263 = !current
    AppToast.show(this, "Subtitle Bg Border263: ${if (!current) "ON" else "OFF"}")
}

// v225: Audio EQ Custom225
internal fun PlayerActivity.showV225AudioEQCustom225Toggle() {
    val current = BiliClient.prefs.v225audioEQCustom225
    BiliClient.prefs.v225audioEQCustom225 = !current
    AppToast.show(this, "Audio EQ Custom225: ${if (!current) "ON" else "OFF"}")
}

// v225: Danmaku Bottom Max Count257
internal fun PlayerActivity.showV225DanmakuBottomMaxCount257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225danmakuBottomMaxCount257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225danmakuBottomMaxCount257 = value
        AppToast.show(this, "Danmaku Bottom Max Count257: $value")
    }
}

// v225: Subtitle Bg Border264
internal fun PlayerActivity.showV225SubtitleBgBorder264Toggle() {
    val current = BiliClient.prefs.v225subtitleBgBorder264
    BiliClient.prefs.v225subtitleBgBorder264 = !current
    AppToast.show(this, "Subtitle Bg Border264: ${if (!current) "ON" else "OFF"}")
}

// v225: Gesture Shake Action225
internal fun PlayerActivity.showV225GestureShakeAction225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225gestureShakeAction225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225gestureShakeAction225 = value
        AppToast.show(this, "Gesture Shake Action225: $value")
    }
}

// v225: Cast Audio Volume225
internal fun PlayerActivity.showV225CastAudioVolume225Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v225castAudioVolume225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225castAudioVolume225 = value
        AppToast.show(this, "Cast Audio Volume225: $value")
    }
}

// v225: Playlist Auto Skip Outro225
internal fun PlayerActivity.showV225PlaylistAutoSkipOutro225Toggle() {
    val current = BiliClient.prefs.v225playlistAutoSkipOutro225
    BiliClient.prefs.v225playlistAutoSkipOutro225 = !current
    AppToast.show(this, "Playlist Auto Skip Outro225: ${if (!current) "ON" else "OFF"}")
}

// v225: Cache Download Speed226
internal fun PlayerActivity.showV225CacheDownloadSpeed226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225cacheDownloadSpeed226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225cacheDownloadSpeed226 = value
        AppToast.show(this, "Cache Download Speed226: $value")
    }
}

// v225: Progress Bar Thumb Border225
internal fun PlayerActivity.showV225ProgressBarThumbBorder225Toggle() {
    val current = BiliClient.prefs.v225progressBarThumbBorder225
    BiliClient.prefs.v225progressBarThumbBorder225 = !current
    AppToast.show(this, "Progress Bar Thumb Border225: ${if (!current) "ON" else "OFF"}")
}

// v225: Volume Boost Peak225
internal fun PlayerActivity.showV225VolumeBoostPeak225Toggle() {
    val current = BiliClient.prefs.v225volumeBoostPeak225
    BiliClient.prefs.v225volumeBoostPeak225 = !current
    AppToast.show(this, "Volume Boost Peak225: ${if (!current) "ON" else "OFF"}")
}

// v225: History Bookmark Export225
internal fun PlayerActivity.showV225HistoryBookmarkExport225Toggle() {
    val current = BiliClient.prefs.v225historyBookmarkExport225
    BiliClient.prefs.v225historyBookmarkExport225 = !current
    AppToast.show(this, "History Bookmark Export225: ${if (!current) "ON" else "OFF"}")
}

// v225: Playback Chapter Sync225
internal fun PlayerActivity.showV225PlaybackChapterSync225Toggle() {
    val current = BiliClient.prefs.v225playbackChapterSync225
    BiliClient.prefs.v225playbackChapterSync225 = !current
    AppToast.show(this, "Playback Chapter Sync225: ${if (!current) "ON" else "OFF"}")
}

// v225: Screenshot Save Path225
internal fun PlayerActivity.showV225ScreenshotSavePath225Toggle() {
    val current = BiliClient.prefs.v225screenshotSavePath225
    BiliClient.prefs.v225screenshotSavePath225 = !current
    AppToast.show(this, "Screenshot Save Path225: ${if (!current) "ON" else "OFF"}")
}

// v225: Video Color Space225
internal fun PlayerActivity.showV225VideoColorSpace225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225videoColorSpace225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225videoColorSpace225 = value
        AppToast.show(this, "Video Color Space225: $value")
    }
}

// v225: Danmaku Bottom Max Count258
internal fun PlayerActivity.showV225DanmakuBottomMaxCount258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225danmakuBottomMaxCount258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225danmakuBottomMaxCount258 = value
        AppToast.show(this, "Danmaku Bottom Max Count258: $value")
    }
}

// v225: Subtitle Bg Border265
internal fun PlayerActivity.showV225SubtitleBgBorder265Toggle() {
    val current = BiliClient.prefs.v225subtitleBgBorder265
    BiliClient.prefs.v225subtitleBgBorder265 = !current
    AppToast.show(this, "Subtitle Bg Border265: ${if (!current) "ON" else "OFF"}")
}

// v226: Audio EQ Custom226
internal fun PlayerActivity.showV226AudioEQCustom226Toggle() {
    val current = BiliClient.prefs.v226audioEQCustom226
    BiliClient.prefs.v226audioEQCustom226 = !current
    AppToast.show(this, "Audio EQ Custom226: ${if (!current) "ON" else "OFF"}")
}

// v226: Danmaku Bottom Max Count259
internal fun PlayerActivity.showV226DanmakuBottomMaxCount259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226danmakuBottomMaxCount259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226danmakuBottomMaxCount259 = value
        AppToast.show(this, "Danmaku Bottom Max Count259: $value")
    }
}

// v226: Subtitle Bg Border266
internal fun PlayerActivity.showV226SubtitleBgBorder266Toggle() {
    val current = BiliClient.prefs.v226subtitleBgBorder266
    BiliClient.prefs.v226subtitleBgBorder266 = !current
    AppToast.show(this, "Subtitle Bg Border266: ${if (!current) "ON" else "OFF"}")
}

// v226: Gesture Shake Action226
internal fun PlayerActivity.showV226GestureShakeAction226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226gestureShakeAction226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226gestureShakeAction226 = value
        AppToast.show(this, "Gesture Shake Action226: $value")
    }
}

// v226: Cast Audio Volume226
internal fun PlayerActivity.showV226CastAudioVolume226Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v226castAudioVolume226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226castAudioVolume226 = value
        AppToast.show(this, "Cast Audio Volume226: $value")
    }
}

// v226: Playlist Auto Skip Outro226
internal fun PlayerActivity.showV226PlaylistAutoSkipOutro226Toggle() {
    val current = BiliClient.prefs.v226playlistAutoSkipOutro226
    BiliClient.prefs.v226playlistAutoSkipOutro226 = !current
    AppToast.show(this, "Playlist Auto Skip Outro226: ${if (!current) "ON" else "OFF"}")
}

// v226: Cache Download Speed227
internal fun PlayerActivity.showV226CacheDownloadSpeed227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226cacheDownloadSpeed227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226cacheDownloadSpeed227 = value
        AppToast.show(this, "Cache Download Speed227: $value")
    }
}

// v226: Progress Bar Thumb Border226
internal fun PlayerActivity.showV226ProgressBarThumbBorder226Toggle() {
    val current = BiliClient.prefs.v226progressBarThumbBorder226
    BiliClient.prefs.v226progressBarThumbBorder226 = !current
    AppToast.show(this, "Progress Bar Thumb Border226: ${if (!current) "ON" else "OFF"}")
}

// v226: Volume Boost Peak226
internal fun PlayerActivity.showV226VolumeBoostPeak226Toggle() {
    val current = BiliClient.prefs.v226volumeBoostPeak226
    BiliClient.prefs.v226volumeBoostPeak226 = !current
    AppToast.show(this, "Volume Boost Peak226: ${if (!current) "ON" else "OFF"}")
}

// v226: History Bookmark Export226
internal fun PlayerActivity.showV226HistoryBookmarkExport226Toggle() {
    val current = BiliClient.prefs.v226historyBookmarkExport226
    BiliClient.prefs.v226historyBookmarkExport226 = !current
    AppToast.show(this, "History Bookmark Export226: ${if (!current) "ON" else "OFF"}")
}

// v226: Playback Chapter Sync226
internal fun PlayerActivity.showV226PlaybackChapterSync226Toggle() {
    val current = BiliClient.prefs.v226playbackChapterSync226
    BiliClient.prefs.v226playbackChapterSync226 = !current
    AppToast.show(this, "Playback Chapter Sync226: ${if (!current) "ON" else "OFF"}")
}

// v226: Screenshot Save Path226
internal fun PlayerActivity.showV226ScreenshotSavePath226Toggle() {
    val current = BiliClient.prefs.v226screenshotSavePath226
    BiliClient.prefs.v226screenshotSavePath226 = !current
    AppToast.show(this, "Screenshot Save Path226: ${if (!current) "ON" else "OFF"}")
}

// v226: Video Color Space226
internal fun PlayerActivity.showV226VideoColorSpace226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226videoColorSpace226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226videoColorSpace226 = value
        AppToast.show(this, "Video Color Space226: $value")
    }
}

// v226: Danmaku Bottom Max Count260
internal fun PlayerActivity.showV226DanmakuBottomMaxCount260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226danmakuBottomMaxCount260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226danmakuBottomMaxCount260 = value
        AppToast.show(this, "Danmaku Bottom Max Count260: $value")
    }
}

// v226: Subtitle Bg Border267
internal fun PlayerActivity.showV226SubtitleBgBorder267Toggle() {
    val current = BiliClient.prefs.v226subtitleBgBorder267
    BiliClient.prefs.v226subtitleBgBorder267 = !current
    AppToast.show(this, "Subtitle Bg Border267: ${if (!current) "ON" else "OFF"}")
}

// v227: Audio EQ Custom227
internal fun PlayerActivity.showV227AudioEQCustom227Toggle() {
    val current = BiliClient.prefs.v227audioEQCustom227
    BiliClient.prefs.v227audioEQCustom227 = !current
    AppToast.show(this, "Audio EQ Custom227: ${if (!current) "ON" else "OFF"}")
}

// v227: Danmaku Bottom Max Count261
internal fun PlayerActivity.showV227DanmakuBottomMaxCount261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227danmakuBottomMaxCount261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227danmakuBottomMaxCount261 = value
        AppToast.show(this, "Danmaku Bottom Max Count261: $value")
    }
}

// v227: Subtitle Bg Border268
internal fun PlayerActivity.showV227SubtitleBgBorder268Toggle() {
    val current = BiliClient.prefs.v227subtitleBgBorder268
    BiliClient.prefs.v227subtitleBgBorder268 = !current
    AppToast.show(this, "Subtitle Bg Border268: ${if (!current) "ON" else "OFF"}")
}

// v227: Gesture Shake Action227
internal fun PlayerActivity.showV227GestureShakeAction227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227gestureShakeAction227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227gestureShakeAction227 = value
        AppToast.show(this, "Gesture Shake Action227: $value")
    }
}

// v227: Cast Audio Volume227
internal fun PlayerActivity.showV227CastAudioVolume227Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v227castAudioVolume227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227castAudioVolume227 = value
        AppToast.show(this, "Cast Audio Volume227: $value")
    }
}

// v227: Playlist Auto Skip Outro227
internal fun PlayerActivity.showV227PlaylistAutoSkipOutro227Toggle() {
    val current = BiliClient.prefs.v227playlistAutoSkipOutro227
    BiliClient.prefs.v227playlistAutoSkipOutro227 = !current
    AppToast.show(this, "Playlist Auto Skip Outro227: ${if (!current) "ON" else "OFF"}")
}

// v227: Cache Download Speed228
internal fun PlayerActivity.showV227CacheDownloadSpeed228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227cacheDownloadSpeed228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227cacheDownloadSpeed228 = value
        AppToast.show(this, "Cache Download Speed228: $value")
    }
}

// v227: Progress Bar Thumb Border227
internal fun PlayerActivity.showV227ProgressBarThumbBorder227Toggle() {
    val current = BiliClient.prefs.v227progressBarThumbBorder227
    BiliClient.prefs.v227progressBarThumbBorder227 = !current
    AppToast.show(this, "Progress Bar Thumb Border227: ${if (!current) "ON" else "OFF"}")
}

// v227: Volume Boost Peak227
internal fun PlayerActivity.showV227VolumeBoostPeak227Toggle() {
    val current = BiliClient.prefs.v227volumeBoostPeak227
    BiliClient.prefs.v227volumeBoostPeak227 = !current
    AppToast.show(this, "Volume Boost Peak227: ${if (!current) "ON" else "OFF"}")
}

// v227: History Bookmark Export227
internal fun PlayerActivity.showV227HistoryBookmarkExport227Toggle() {
    val current = BiliClient.prefs.v227historyBookmarkExport227
    BiliClient.prefs.v227historyBookmarkExport227 = !current
    AppToast.show(this, "History Bookmark Export227: ${if (!current) "ON" else "OFF"}")
}

// v227: Playback Chapter Sync227
internal fun PlayerActivity.showV227PlaybackChapterSync227Toggle() {
    val current = BiliClient.prefs.v227playbackChapterSync227
    BiliClient.prefs.v227playbackChapterSync227 = !current
    AppToast.show(this, "Playback Chapter Sync227: ${if (!current) "ON" else "OFF"}")
}

// v227: Screenshot Save Path227
internal fun PlayerActivity.showV227ScreenshotSavePath227Toggle() {
    val current = BiliClient.prefs.v227screenshotSavePath227
    BiliClient.prefs.v227screenshotSavePath227 = !current
    AppToast.show(this, "Screenshot Save Path227: ${if (!current) "ON" else "OFF"}")
}

// v227: Video Color Space227
internal fun PlayerActivity.showV227VideoColorSpace227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227videoColorSpace227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227videoColorSpace227 = value
        AppToast.show(this, "Video Color Space227: $value")
    }
}

// v227: Danmaku Bottom Max Count262
internal fun PlayerActivity.showV227DanmakuBottomMaxCount262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227danmakuBottomMaxCount262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227danmakuBottomMaxCount262 = value
        AppToast.show(this, "Danmaku Bottom Max Count262: $value")
    }
}

// v227: Subtitle Bg Border269
internal fun PlayerActivity.showV227SubtitleBgBorder269Toggle() {
    val current = BiliClient.prefs.v227subtitleBgBorder269
    BiliClient.prefs.v227subtitleBgBorder269 = !current
    AppToast.show(this, "Subtitle Bg Border269: ${if (!current) "ON" else "OFF"}")
}

// v228: Audio EQ Custom228
internal fun PlayerActivity.showV228AudioEQCustom228Toggle() {
    val current = BiliClient.prefs.v228audioEQCustom228
    BiliClient.prefs.v228audioEQCustom228 = !current
    AppToast.show(this, "Audio EQ Custom228: ${if (!current) "ON" else "OFF"}")
}

// v228: Danmaku Bottom Max Count263
internal fun PlayerActivity.showV228DanmakuBottomMaxCount263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228danmakuBottomMaxCount263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228danmakuBottomMaxCount263 = value
        AppToast.show(this, "Danmaku Bottom Max Count263: $value")
    }
}

// v228: Subtitle Bg Border270
internal fun PlayerActivity.showV228SubtitleBgBorder270Toggle() {
    val current = BiliClient.prefs.v228subtitleBgBorder270
    BiliClient.prefs.v228subtitleBgBorder270 = !current
    AppToast.show(this, "Subtitle Bg Border270: ${if (!current) "ON" else "OFF"}")
}

// v228: Gesture Shake Action228
internal fun PlayerActivity.showV228GestureShakeAction228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228gestureShakeAction228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228gestureShakeAction228 = value
        AppToast.show(this, "Gesture Shake Action228: $value")
    }
}

// v228: Cast Audio Volume228
internal fun PlayerActivity.showV228CastAudioVolume228Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v228castAudioVolume228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228castAudioVolume228 = value
        AppToast.show(this, "Cast Audio Volume228: $value")
    }
}

// v228: Playlist Auto Skip Outro228
internal fun PlayerActivity.showV228PlaylistAutoSkipOutro228Toggle() {
    val current = BiliClient.prefs.v228playlistAutoSkipOutro228
    BiliClient.prefs.v228playlistAutoSkipOutro228 = !current
    AppToast.show(this, "Playlist Auto Skip Outro228: ${if (!current) "ON" else "OFF"}")
}

// v228: Cache Download Speed229
internal fun PlayerActivity.showV228CacheDownloadSpeed229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228cacheDownloadSpeed229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228cacheDownloadSpeed229 = value
        AppToast.show(this, "Cache Download Speed229: $value")
    }
}

// v228: Progress Bar Thumb Border228
internal fun PlayerActivity.showV228ProgressBarThumbBorder228Toggle() {
    val current = BiliClient.prefs.v228progressBarThumbBorder228
    BiliClient.prefs.v228progressBarThumbBorder228 = !current
    AppToast.show(this, "Progress Bar Thumb Border228: ${if (!current) "ON" else "OFF"}")
}

// v228: Volume Boost Peak228
internal fun PlayerActivity.showV228VolumeBoostPeak228Toggle() {
    val current = BiliClient.prefs.v228volumeBoostPeak228
    BiliClient.prefs.v228volumeBoostPeak228 = !current
    AppToast.show(this, "Volume Boost Peak228: ${if (!current) "ON" else "OFF"}")
}

// v228: History Bookmark Export228
internal fun PlayerActivity.showV228HistoryBookmarkExport228Toggle() {
    val current = BiliClient.prefs.v228historyBookmarkExport228
    BiliClient.prefs.v228historyBookmarkExport228 = !current
    AppToast.show(this, "History Bookmark Export228: ${if (!current) "ON" else "OFF"}")
}

// v228: Playback Chapter Sync228
internal fun PlayerActivity.showV228PlaybackChapterSync228Toggle() {
    val current = BiliClient.prefs.v228playbackChapterSync228
    BiliClient.prefs.v228playbackChapterSync228 = !current
    AppToast.show(this, "Playback Chapter Sync228: ${if (!current) "ON" else "OFF"}")
}

// v228: Screenshot Save Path228
internal fun PlayerActivity.showV228ScreenshotSavePath228Toggle() {
    val current = BiliClient.prefs.v228screenshotSavePath228
    BiliClient.prefs.v228screenshotSavePath228 = !current
    AppToast.show(this, "Screenshot Save Path228: ${if (!current) "ON" else "OFF"}")
}

// v228: Video Color Space228
internal fun PlayerActivity.showV228VideoColorSpace228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228videoColorSpace228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228videoColorSpace228 = value
        AppToast.show(this, "Video Color Space228: $value")
    }
}

// v228: Danmaku Bottom Max Count264
internal fun PlayerActivity.showV228DanmakuBottomMaxCount264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228danmakuBottomMaxCount264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228danmakuBottomMaxCount264 = value
        AppToast.show(this, "Danmaku Bottom Max Count264: $value")
    }
}

// v228: Subtitle Bg Border271
internal fun PlayerActivity.showV228SubtitleBgBorder271Toggle() {
    val current = BiliClient.prefs.v228subtitleBgBorder271
    BiliClient.prefs.v228subtitleBgBorder271 = !current
    AppToast.show(this, "Subtitle Bg Border271: ${if (!current) "ON" else "OFF"}")
}

// v229: Audio EQ Custom229
internal fun PlayerActivity.showV229AudioEQCustom229Toggle() {
    val current = BiliClient.prefs.v229audioEQCustom229
    BiliClient.prefs.v229audioEQCustom229 = !current
    AppToast.show(this, "Audio EQ Custom229: ${if (!current) "ON" else "OFF"}")
}

// v229: Danmaku Bottom Max Count265
internal fun PlayerActivity.showV229DanmakuBottomMaxCount265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229danmakuBottomMaxCount265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229danmakuBottomMaxCount265 = value
        AppToast.show(this, "Danmaku Bottom Max Count265: $value")
    }
}

// v229: Subtitle Bg Border272
internal fun PlayerActivity.showV229SubtitleBgBorder272Toggle() {
    val current = BiliClient.prefs.v229subtitleBgBorder272
    BiliClient.prefs.v229subtitleBgBorder272 = !current
    AppToast.show(this, "Subtitle Bg Border272: ${if (!current) "ON" else "OFF"}")
}

// v229: Gesture Shake Action229
internal fun PlayerActivity.showV229GestureShakeAction229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229gestureShakeAction229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229gestureShakeAction229 = value
        AppToast.show(this, "Gesture Shake Action229: $value")
    }
}

// v229: Cast Audio Volume229
internal fun PlayerActivity.showV229CastAudioVolume229Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v229castAudioVolume229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229castAudioVolume229 = value
        AppToast.show(this, "Cast Audio Volume229: $value")
    }
}

// v229: Playlist Auto Skip Outro229
internal fun PlayerActivity.showV229PlaylistAutoSkipOutro229Toggle() {
    val current = BiliClient.prefs.v229playlistAutoSkipOutro229
    BiliClient.prefs.v229playlistAutoSkipOutro229 = !current
    AppToast.show(this, "Playlist Auto Skip Outro229: ${if (!current) "ON" else "OFF"}")
}

// v229: Cache Download Speed230
internal fun PlayerActivity.showV229CacheDownloadSpeed230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229cacheDownloadSpeed230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229cacheDownloadSpeed230 = value
        AppToast.show(this, "Cache Download Speed230: $value")
    }
}

// v229: Progress Bar Thumb Border229
internal fun PlayerActivity.showV229ProgressBarThumbBorder229Toggle() {
    val current = BiliClient.prefs.v229progressBarThumbBorder229
    BiliClient.prefs.v229progressBarThumbBorder229 = !current
    AppToast.show(this, "Progress Bar Thumb Border229: ${if (!current) "ON" else "OFF"}")
}

// v229: Volume Boost Peak229
internal fun PlayerActivity.showV229VolumeBoostPeak229Toggle() {
    val current = BiliClient.prefs.v229volumeBoostPeak229
    BiliClient.prefs.v229volumeBoostPeak229 = !current
    AppToast.show(this, "Volume Boost Peak229: ${if (!current) "ON" else "OFF"}")
}

// v229: History Bookmark Export229
internal fun PlayerActivity.showV229HistoryBookmarkExport229Toggle() {
    val current = BiliClient.prefs.v229historyBookmarkExport229
    BiliClient.prefs.v229historyBookmarkExport229 = !current
    AppToast.show(this, "History Bookmark Export229: ${if (!current) "ON" else "OFF"}")
}

// v229: Playback Chapter Sync229
internal fun PlayerActivity.showV229PlaybackChapterSync229Toggle() {
    val current = BiliClient.prefs.v229playbackChapterSync229
    BiliClient.prefs.v229playbackChapterSync229 = !current
    AppToast.show(this, "Playback Chapter Sync229: ${if (!current) "ON" else "OFF"}")
}

// v229: Screenshot Save Path229
internal fun PlayerActivity.showV229ScreenshotSavePath229Toggle() {
    val current = BiliClient.prefs.v229screenshotSavePath229
    BiliClient.prefs.v229screenshotSavePath229 = !current
    AppToast.show(this, "Screenshot Save Path229: ${if (!current) "ON" else "OFF"}")
}

// v229: Video Color Space229
internal fun PlayerActivity.showV229VideoColorSpace229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229videoColorSpace229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229videoColorSpace229 = value
        AppToast.show(this, "Video Color Space229: $value")
    }
}

// v229: Danmaku Bottom Max Count266
internal fun PlayerActivity.showV229DanmakuBottomMaxCount266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229danmakuBottomMaxCount266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229danmakuBottomMaxCount266 = value
        AppToast.show(this, "Danmaku Bottom Max Count266: $value")
    }
}

// v229: Subtitle Bg Border273
internal fun PlayerActivity.showV229SubtitleBgBorder273Toggle() {
    val current = BiliClient.prefs.v229subtitleBgBorder273
    BiliClient.prefs.v229subtitleBgBorder273 = !current
    AppToast.show(this, "Subtitle Bg Border273: ${if (!current) "ON" else "OFF"}")
}

// v230: Audio EQ Custom230
internal fun PlayerActivity.showV230AudioEQCustom230Toggle() {
    val current = BiliClient.prefs.v230audioEQCustom230
    BiliClient.prefs.v230audioEQCustom230 = !current
    AppToast.show(this, "Audio EQ Custom230: ${if (!current) "ON" else "OFF"}")
}

// v230: Danmaku Bottom Max Count267
internal fun PlayerActivity.showV230DanmakuBottomMaxCount267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230danmakuBottomMaxCount267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230danmakuBottomMaxCount267 = value
        AppToast.show(this, "Danmaku Bottom Max Count267: $value")
    }
}

// v230: Subtitle Bg Border274
internal fun PlayerActivity.showV230SubtitleBgBorder274Toggle() {
    val current = BiliClient.prefs.v230subtitleBgBorder274
    BiliClient.prefs.v230subtitleBgBorder274 = !current
    AppToast.show(this, "Subtitle Bg Border274: ${if (!current) "ON" else "OFF"}")
}

// v230: Gesture Shake Action230
internal fun PlayerActivity.showV230GestureShakeAction230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230gestureShakeAction230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230gestureShakeAction230 = value
        AppToast.show(this, "Gesture Shake Action230: $value")
    }
}

// v230: Cast Audio Volume230
internal fun PlayerActivity.showV230CastAudioVolume230Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v230castAudioVolume230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230castAudioVolume230 = value
        AppToast.show(this, "Cast Audio Volume230: $value")
    }
}

// v230: Playlist Auto Skip Outro230
internal fun PlayerActivity.showV230PlaylistAutoSkipOutro230Toggle() {
    val current = BiliClient.prefs.v230playlistAutoSkipOutro230
    BiliClient.prefs.v230playlistAutoSkipOutro230 = !current
    AppToast.show(this, "Playlist Auto Skip Outro230: ${if (!current) "ON" else "OFF"}")
}

// v230: Cache Download Speed231
internal fun PlayerActivity.showV230CacheDownloadSpeed231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230cacheDownloadSpeed231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230cacheDownloadSpeed231 = value
        AppToast.show(this, "Cache Download Speed231: $value")
    }
}

// v230: Progress Bar Thumb Border230
internal fun PlayerActivity.showV230ProgressBarThumbBorder230Toggle() {
    val current = BiliClient.prefs.v230progressBarThumbBorder230
    BiliClient.prefs.v230progressBarThumbBorder230 = !current
    AppToast.show(this, "Progress Bar Thumb Border230: ${if (!current) "ON" else "OFF"}")
}

// v230: Volume Boost Peak230
internal fun PlayerActivity.showV230VolumeBoostPeak230Toggle() {
    val current = BiliClient.prefs.v230volumeBoostPeak230
    BiliClient.prefs.v230volumeBoostPeak230 = !current
    AppToast.show(this, "Volume Boost Peak230: ${if (!current) "ON" else "OFF"}")
}

// v230: History Bookmark Export230
internal fun PlayerActivity.showV230HistoryBookmarkExport230Toggle() {
    val current = BiliClient.prefs.v230historyBookmarkExport230
    BiliClient.prefs.v230historyBookmarkExport230 = !current
    AppToast.show(this, "History Bookmark Export230: ${if (!current) "ON" else "OFF"}")
}

// v230: Playback Chapter Sync230
internal fun PlayerActivity.showV230PlaybackChapterSync230Toggle() {
    val current = BiliClient.prefs.v230playbackChapterSync230
    BiliClient.prefs.v230playbackChapterSync230 = !current
    AppToast.show(this, "Playback Chapter Sync230: ${if (!current) "ON" else "OFF"}")
}

// v230: Screenshot Save Path230
internal fun PlayerActivity.showV230ScreenshotSavePath230Toggle() {
    val current = BiliClient.prefs.v230screenshotSavePath230
    BiliClient.prefs.v230screenshotSavePath230 = !current
    AppToast.show(this, "Screenshot Save Path230: ${if (!current) "ON" else "OFF"}")
}

// v230: Video Color Space230
internal fun PlayerActivity.showV230VideoColorSpace230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230videoColorSpace230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230videoColorSpace230 = value
        AppToast.show(this, "Video Color Space230: $value")
    }
}

// v230: Danmaku Bottom Max Count268
internal fun PlayerActivity.showV230DanmakuBottomMaxCount268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230danmakuBottomMaxCount268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230danmakuBottomMaxCount268 = value
        AppToast.show(this, "Danmaku Bottom Max Count268: $value")
    }
}

// v230: Subtitle Bg Border275
internal fun PlayerActivity.showV230SubtitleBgBorder275Toggle() {
    val current = BiliClient.prefs.v230subtitleBgBorder275
    BiliClient.prefs.v230subtitleBgBorder275 = !current
    AppToast.show(this, "Subtitle Bg Border275: ${if (!current) "ON" else "OFF"}")
}

// v231: Audio EQ Custom231
internal fun PlayerActivity.showV231AudioEQCustom231Toggle() {
    val current = BiliClient.prefs.v231audioEQCustom231
    BiliClient.prefs.v231audioEQCustom231 = !current
    AppToast.show(this, "Audio EQ Custom231: ${if (!current) "ON" else "OFF"}")
}

// v231: Danmaku Bottom Max Count269
internal fun PlayerActivity.showV231DanmakuBottomMaxCount269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231danmakuBottomMaxCount269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231danmakuBottomMaxCount269 = value
        AppToast.show(this, "Danmaku Bottom Max Count269: $value")
    }
}

// v231: Subtitle Bg Border276
internal fun PlayerActivity.showV231SubtitleBgBorder276Toggle() {
    val current = BiliClient.prefs.v231subtitleBgBorder276
    BiliClient.prefs.v231subtitleBgBorder276 = !current
    AppToast.show(this, "Subtitle Bg Border276: ${if (!current) "ON" else "OFF"}")
}

// v231: Gesture Shake Action231
internal fun PlayerActivity.showV231GestureShakeAction231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231gestureShakeAction231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231gestureShakeAction231 = value
        AppToast.show(this, "Gesture Shake Action231: $value")
    }
}

// v231: Cast Audio Volume231
internal fun PlayerActivity.showV231CastAudioVolume231Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v231castAudioVolume231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231castAudioVolume231 = value
        AppToast.show(this, "Cast Audio Volume231: $value")
    }
}

// v231: Playlist Auto Skip Outro231
internal fun PlayerActivity.showV231PlaylistAutoSkipOutro231Toggle() {
    val current = BiliClient.prefs.v231playlistAutoSkipOutro231
    BiliClient.prefs.v231playlistAutoSkipOutro231 = !current
    AppToast.show(this, "Playlist Auto Skip Outro231: ${if (!current) "ON" else "OFF"}")
}

// v231: Cache Download Speed232
internal fun PlayerActivity.showV231CacheDownloadSpeed232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231cacheDownloadSpeed232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231cacheDownloadSpeed232 = value
        AppToast.show(this, "Cache Download Speed232: $value")
    }
}

// v231: Progress Bar Thumb Border231
internal fun PlayerActivity.showV231ProgressBarThumbBorder231Toggle() {
    val current = BiliClient.prefs.v231progressBarThumbBorder231
    BiliClient.prefs.v231progressBarThumbBorder231 = !current
    AppToast.show(this, "Progress Bar Thumb Border231: ${if (!current) "ON" else "OFF"}")
}

// v231: Volume Boost Peak231
internal fun PlayerActivity.showV231VolumeBoostPeak231Toggle() {
    val current = BiliClient.prefs.v231volumeBoostPeak231
    BiliClient.prefs.v231volumeBoostPeak231 = !current
    AppToast.show(this, "Volume Boost Peak231: ${if (!current) "ON" else "OFF"}")
}

// v231: History Bookmark Export231
internal fun PlayerActivity.showV231HistoryBookmarkExport231Toggle() {
    val current = BiliClient.prefs.v231historyBookmarkExport231
    BiliClient.prefs.v231historyBookmarkExport231 = !current
    AppToast.show(this, "History Bookmark Export231: ${if (!current) "ON" else "OFF"}")
}

// v231: Playback Chapter Sync231
internal fun PlayerActivity.showV231PlaybackChapterSync231Toggle() {
    val current = BiliClient.prefs.v231playbackChapterSync231
    BiliClient.prefs.v231playbackChapterSync231 = !current
    AppToast.show(this, "Playback Chapter Sync231: ${if (!current) "ON" else "OFF"}")
}

// v231: Screenshot Save Path231
internal fun PlayerActivity.showV231ScreenshotSavePath231Toggle() {
    val current = BiliClient.prefs.v231screenshotSavePath231
    BiliClient.prefs.v231screenshotSavePath231 = !current
    AppToast.show(this, "Screenshot Save Path231: ${if (!current) "ON" else "OFF"}")
}

// v231: Video Color Space231
internal fun PlayerActivity.showV231VideoColorSpace231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231videoColorSpace231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231videoColorSpace231 = value
        AppToast.show(this, "Video Color Space231: $value")
    }
}

// v231: Danmaku Bottom Max Count270
internal fun PlayerActivity.showV231DanmakuBottomMaxCount270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231danmakuBottomMaxCount270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231danmakuBottomMaxCount270 = value
        AppToast.show(this, "Danmaku Bottom Max Count270: $value")
    }
}

// v231: Subtitle Bg Border277
internal fun PlayerActivity.showV231SubtitleBgBorder277Toggle() {
    val current = BiliClient.prefs.v231subtitleBgBorder277
    BiliClient.prefs.v231subtitleBgBorder277 = !current
    AppToast.show(this, "Subtitle Bg Border277: ${if (!current) "ON" else "OFF"}")
}

// v232: Audio EQ Custom232
internal fun PlayerActivity.showV232AudioEQCustom232Toggle() {
    val current = BiliClient.prefs.v232audioEQCustom232
    BiliClient.prefs.v232audioEQCustom232 = !current
    AppToast.show(this, "Audio EQ Custom232: ${if (!current) "ON" else "OFF"}")
}

// v232: Danmaku Bottom Max Count271
internal fun PlayerActivity.showV232DanmakuBottomMaxCount271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232danmakuBottomMaxCount271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232danmakuBottomMaxCount271 = value
        AppToast.show(this, "Danmaku Bottom Max Count271: $value")
    }
}

// v232: Subtitle Bg Border278
internal fun PlayerActivity.showV232SubtitleBgBorder278Toggle() {
    val current = BiliClient.prefs.v232subtitleBgBorder278
    BiliClient.prefs.v232subtitleBgBorder278 = !current
    AppToast.show(this, "Subtitle Bg Border278: ${if (!current) "ON" else "OFF"}")
}

// v232: Gesture Shake Action232
internal fun PlayerActivity.showV232GestureShakeAction232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232gestureShakeAction232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232gestureShakeAction232 = value
        AppToast.show(this, "Gesture Shake Action232: $value")
    }
}

// v232: Cast Audio Volume232
internal fun PlayerActivity.showV232CastAudioVolume232Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v232castAudioVolume232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232castAudioVolume232 = value
        AppToast.show(this, "Cast Audio Volume232: $value")
    }
}

// v232: Playlist Auto Skip Outro232
internal fun PlayerActivity.showV232PlaylistAutoSkipOutro232Toggle() {
    val current = BiliClient.prefs.v232playlistAutoSkipOutro232
    BiliClient.prefs.v232playlistAutoSkipOutro232 = !current
    AppToast.show(this, "Playlist Auto Skip Outro232: ${if (!current) "ON" else "OFF"}")
}

// v232: Cache Download Speed233
internal fun PlayerActivity.showV232CacheDownloadSpeed233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232cacheDownloadSpeed233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232cacheDownloadSpeed233 = value
        AppToast.show(this, "Cache Download Speed233: $value")
    }
}

// v232: Progress Bar Thumb Border232
internal fun PlayerActivity.showV232ProgressBarThumbBorder232Toggle() {
    val current = BiliClient.prefs.v232progressBarThumbBorder232
    BiliClient.prefs.v232progressBarThumbBorder232 = !current
    AppToast.show(this, "Progress Bar Thumb Border232: ${if (!current) "ON" else "OFF"}")
}

// v232: Volume Boost Peak232
internal fun PlayerActivity.showV232VolumeBoostPeak232Toggle() {
    val current = BiliClient.prefs.v232volumeBoostPeak232
    BiliClient.prefs.v232volumeBoostPeak232 = !current
    AppToast.show(this, "Volume Boost Peak232: ${if (!current) "ON" else "OFF"}")
}

// v232: History Bookmark Export232
internal fun PlayerActivity.showV232HistoryBookmarkExport232Toggle() {
    val current = BiliClient.prefs.v232historyBookmarkExport232
    BiliClient.prefs.v232historyBookmarkExport232 = !current
    AppToast.show(this, "History Bookmark Export232: ${if (!current) "ON" else "OFF"}")
}

// v232: Playback Chapter Sync232
internal fun PlayerActivity.showV232PlaybackChapterSync232Toggle() {
    val current = BiliClient.prefs.v232playbackChapterSync232
    BiliClient.prefs.v232playbackChapterSync232 = !current
    AppToast.show(this, "Playback Chapter Sync232: ${if (!current) "ON" else "OFF"}")
}

// v232: Screenshot Save Path232
internal fun PlayerActivity.showV232ScreenshotSavePath232Toggle() {
    val current = BiliClient.prefs.v232screenshotSavePath232
    BiliClient.prefs.v232screenshotSavePath232 = !current
    AppToast.show(this, "Screenshot Save Path232: ${if (!current) "ON" else "OFF"}")
}

// v232: Video Color Space232
internal fun PlayerActivity.showV232VideoColorSpace232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232videoColorSpace232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232videoColorSpace232 = value
        AppToast.show(this, "Video Color Space232: $value")
    }
}

// v232: Danmaku Bottom Max Count272
internal fun PlayerActivity.showV232DanmakuBottomMaxCount272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232danmakuBottomMaxCount272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232danmakuBottomMaxCount272 = value
        AppToast.show(this, "Danmaku Bottom Max Count272: $value")
    }
}

// v232: Subtitle Bg Border279
internal fun PlayerActivity.showV232SubtitleBgBorder279Toggle() {
    val current = BiliClient.prefs.v232subtitleBgBorder279
    BiliClient.prefs.v232subtitleBgBorder279 = !current
    AppToast.show(this, "Subtitle Bg Border279: ${if (!current) "ON" else "OFF"}")
}

// v233: Audio EQ Custom233
internal fun PlayerActivity.showV233AudioEQCustom233Toggle() {
    val current = BiliClient.prefs.v233audioEQCustom233
    BiliClient.prefs.v233audioEQCustom233 = !current
    AppToast.show(this, "Audio EQ Custom233: ${if (!current) "ON" else "OFF"}")
}

// v233: Danmaku Bottom Max Count273
internal fun PlayerActivity.showV233DanmakuBottomMaxCount273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233danmakuBottomMaxCount273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233danmakuBottomMaxCount273 = value
        AppToast.show(this, "Danmaku Bottom Max Count273: $value")
    }
}

// v233: Subtitle Bg Border280
internal fun PlayerActivity.showV233SubtitleBgBorder280Toggle() {
    val current = BiliClient.prefs.v233subtitleBgBorder280
    BiliClient.prefs.v233subtitleBgBorder280 = !current
    AppToast.show(this, "Subtitle Bg Border280: ${if (!current) "ON" else "OFF"}")
}

// v233: Gesture Shake Action233
internal fun PlayerActivity.showV233GestureShakeAction233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233gestureShakeAction233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233gestureShakeAction233 = value
        AppToast.show(this, "Gesture Shake Action233: $value")
    }
}

// v233: Cast Audio Volume233
internal fun PlayerActivity.showV233CastAudioVolume233Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v233castAudioVolume233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233castAudioVolume233 = value
        AppToast.show(this, "Cast Audio Volume233: $value")
    }
}

// v233: Playlist Auto Skip Outro233
internal fun PlayerActivity.showV233PlaylistAutoSkipOutro233Toggle() {
    val current = BiliClient.prefs.v233playlistAutoSkipOutro233
    BiliClient.prefs.v233playlistAutoSkipOutro233 = !current
    AppToast.show(this, "Playlist Auto Skip Outro233: ${if (!current) "ON" else "OFF"}")
}

// v233: Cache Download Speed234
internal fun PlayerActivity.showV233CacheDownloadSpeed234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233cacheDownloadSpeed234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233cacheDownloadSpeed234 = value
        AppToast.show(this, "Cache Download Speed234: $value")
    }
}

// v233: Progress Bar Thumb Border233
internal fun PlayerActivity.showV233ProgressBarThumbBorder233Toggle() {
    val current = BiliClient.prefs.v233progressBarThumbBorder233
    BiliClient.prefs.v233progressBarThumbBorder233 = !current
    AppToast.show(this, "Progress Bar Thumb Border233: ${if (!current) "ON" else "OFF"}")
}

// v233: Volume Boost Peak233
internal fun PlayerActivity.showV233VolumeBoostPeak233Toggle() {
    val current = BiliClient.prefs.v233volumeBoostPeak233
    BiliClient.prefs.v233volumeBoostPeak233 = !current
    AppToast.show(this, "Volume Boost Peak233: ${if (!current) "ON" else "OFF"}")
}

// v233: History Bookmark Export233
internal fun PlayerActivity.showV233HistoryBookmarkExport233Toggle() {
    val current = BiliClient.prefs.v233historyBookmarkExport233
    BiliClient.prefs.v233historyBookmarkExport233 = !current
    AppToast.show(this, "History Bookmark Export233: ${if (!current) "ON" else "OFF"}")
}

// v233: Playback Chapter Sync233
internal fun PlayerActivity.showV233PlaybackChapterSync233Toggle() {
    val current = BiliClient.prefs.v233playbackChapterSync233
    BiliClient.prefs.v233playbackChapterSync233 = !current
    AppToast.show(this, "Playback Chapter Sync233: ${if (!current) "ON" else "OFF"}")
}

// v233: Screenshot Save Path233
internal fun PlayerActivity.showV233ScreenshotSavePath233Toggle() {
    val current = BiliClient.prefs.v233screenshotSavePath233
    BiliClient.prefs.v233screenshotSavePath233 = !current
    AppToast.show(this, "Screenshot Save Path233: ${if (!current) "ON" else "OFF"}")
}

// v233: Video Color Space233
internal fun PlayerActivity.showV233VideoColorSpace233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233videoColorSpace233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233videoColorSpace233 = value
        AppToast.show(this, "Video Color Space233: $value")
    }
}

// v233: Danmaku Bottom Max Count274
internal fun PlayerActivity.showV233DanmakuBottomMaxCount274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233danmakuBottomMaxCount274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233danmakuBottomMaxCount274 = value
        AppToast.show(this, "Danmaku Bottom Max Count274: $value")
    }
}

// v233: Subtitle Bg Border281
internal fun PlayerActivity.showV233SubtitleBgBorder281Toggle() {
    val current = BiliClient.prefs.v233subtitleBgBorder281
    BiliClient.prefs.v233subtitleBgBorder281 = !current
    AppToast.show(this, "Subtitle Bg Border281: ${if (!current) "ON" else "OFF"}")
}

// v234: Audio EQ Custom234
internal fun PlayerActivity.showV234AudioEQCustom234Toggle() {
    val current = BiliClient.prefs.v234audioEQCustom234
    BiliClient.prefs.v234audioEQCustom234 = !current
    AppToast.show(this, "Audio EQ Custom234: ${if (!current) "ON" else "OFF"}")
}

// v234: Danmaku Bottom Max Count275
internal fun PlayerActivity.showV234DanmakuBottomMaxCount275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234danmakuBottomMaxCount275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234danmakuBottomMaxCount275 = value
        AppToast.show(this, "Danmaku Bottom Max Count275: $value")
    }
}

// v234: Subtitle Bg Border282
internal fun PlayerActivity.showV234SubtitleBgBorder282Toggle() {
    val current = BiliClient.prefs.v234subtitleBgBorder282
    BiliClient.prefs.v234subtitleBgBorder282 = !current
    AppToast.show(this, "Subtitle Bg Border282: ${if (!current) "ON" else "OFF"}")
}

// v234: Gesture Shake Action234
internal fun PlayerActivity.showV234GestureShakeAction234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234gestureShakeAction234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234gestureShakeAction234 = value
        AppToast.show(this, "Gesture Shake Action234: $value")
    }
}

// v234: Cast Audio Volume234
internal fun PlayerActivity.showV234CastAudioVolume234Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v234castAudioVolume234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234castAudioVolume234 = value
        AppToast.show(this, "Cast Audio Volume234: $value")
    }
}

// v234: Playlist Auto Skip Outro234
internal fun PlayerActivity.showV234PlaylistAutoSkipOutro234Toggle() {
    val current = BiliClient.prefs.v234playlistAutoSkipOutro234
    BiliClient.prefs.v234playlistAutoSkipOutro234 = !current
    AppToast.show(this, "Playlist Auto Skip Outro234: ${if (!current) "ON" else "OFF"}")
}

// v234: Cache Download Speed235
internal fun PlayerActivity.showV234CacheDownloadSpeed235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234cacheDownloadSpeed235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234cacheDownloadSpeed235 = value
        AppToast.show(this, "Cache Download Speed235: $value")
    }
}

// v234: Progress Bar Thumb Border234
internal fun PlayerActivity.showV234ProgressBarThumbBorder234Toggle() {
    val current = BiliClient.prefs.v234progressBarThumbBorder234
    BiliClient.prefs.v234progressBarThumbBorder234 = !current
    AppToast.show(this, "Progress Bar Thumb Border234: ${if (!current) "ON" else "OFF"}")
}

// v234: Volume Boost Peak234
internal fun PlayerActivity.showV234VolumeBoostPeak234Toggle() {
    val current = BiliClient.prefs.v234volumeBoostPeak234
    BiliClient.prefs.v234volumeBoostPeak234 = !current
    AppToast.show(this, "Volume Boost Peak234: ${if (!current) "ON" else "OFF"}")
}

// v234: History Bookmark Export234
internal fun PlayerActivity.showV234HistoryBookmarkExport234Toggle() {
    val current = BiliClient.prefs.v234historyBookmarkExport234
    BiliClient.prefs.v234historyBookmarkExport234 = !current
    AppToast.show(this, "History Bookmark Export234: ${if (!current) "ON" else "OFF"}")
}

// v234: Playback Chapter Sync234
internal fun PlayerActivity.showV234PlaybackChapterSync234Toggle() {
    val current = BiliClient.prefs.v234playbackChapterSync234
    BiliClient.prefs.v234playbackChapterSync234 = !current
    AppToast.show(this, "Playback Chapter Sync234: ${if (!current) "ON" else "OFF"}")
}

// v234: Screenshot Save Path234
internal fun PlayerActivity.showV234ScreenshotSavePath234Toggle() {
    val current = BiliClient.prefs.v234screenshotSavePath234
    BiliClient.prefs.v234screenshotSavePath234 = !current
    AppToast.show(this, "Screenshot Save Path234: ${if (!current) "ON" else "OFF"}")
}

// v234: Video Color Space234
internal fun PlayerActivity.showV234VideoColorSpace234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234videoColorSpace234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234videoColorSpace234 = value
        AppToast.show(this, "Video Color Space234: $value")
    }
}

// v234: Danmaku Bottom Max Count276
internal fun PlayerActivity.showV234DanmakuBottomMaxCount276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234danmakuBottomMaxCount276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234danmakuBottomMaxCount276 = value
        AppToast.show(this, "Danmaku Bottom Max Count276: $value")
    }
}

// v234: Subtitle Bg Border283
internal fun PlayerActivity.showV234SubtitleBgBorder283Toggle() {
    val current = BiliClient.prefs.v234subtitleBgBorder283
    BiliClient.prefs.v234subtitleBgBorder283 = !current
    AppToast.show(this, "Subtitle Bg Border283: ${if (!current) "ON" else "OFF"}")
}

// v235: Audio EQ Custom235
internal fun PlayerActivity.showV235AudioEQCustom235Toggle() {
    val current = BiliClient.prefs.v235audioEQCustom235
    BiliClient.prefs.v235audioEQCustom235 = !current
    AppToast.show(this, "Audio EQ Custom235: ${if (!current) "ON" else "OFF"}")
}

// v235: Danmaku Bottom Max Count277
internal fun PlayerActivity.showV235DanmakuBottomMaxCount277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235danmakuBottomMaxCount277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235danmakuBottomMaxCount277 = value
        AppToast.show(this, "Danmaku Bottom Max Count277: $value")
    }
}

// v235: Subtitle Bg Border284
internal fun PlayerActivity.showV235SubtitleBgBorder284Toggle() {
    val current = BiliClient.prefs.v235subtitleBgBorder284
    BiliClient.prefs.v235subtitleBgBorder284 = !current
    AppToast.show(this, "Subtitle Bg Border284: ${if (!current) "ON" else "OFF"}")
}

// v235: Gesture Shake Action235
internal fun PlayerActivity.showV235GestureShakeAction235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235gestureShakeAction235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235gestureShakeAction235 = value
        AppToast.show(this, "Gesture Shake Action235: $value")
    }
}

// v235: Cast Audio Volume235
internal fun PlayerActivity.showV235CastAudioVolume235Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v235castAudioVolume235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235castAudioVolume235 = value
        AppToast.show(this, "Cast Audio Volume235: $value")
    }
}

// v235: Playlist Auto Skip Outro235
internal fun PlayerActivity.showV235PlaylistAutoSkipOutro235Toggle() {
    val current = BiliClient.prefs.v235playlistAutoSkipOutro235
    BiliClient.prefs.v235playlistAutoSkipOutro235 = !current
    AppToast.show(this, "Playlist Auto Skip Outro235: ${if (!current) "ON" else "OFF"}")
}

// v235: Cache Download Speed236
internal fun PlayerActivity.showV235CacheDownloadSpeed236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235cacheDownloadSpeed236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235cacheDownloadSpeed236 = value
        AppToast.show(this, "Cache Download Speed236: $value")
    }
}

// v235: Progress Bar Thumb Border235
internal fun PlayerActivity.showV235ProgressBarThumbBorder235Toggle() {
    val current = BiliClient.prefs.v235progressBarThumbBorder235
    BiliClient.prefs.v235progressBarThumbBorder235 = !current
    AppToast.show(this, "Progress Bar Thumb Border235: ${if (!current) "ON" else "OFF"}")
}

// v235: Volume Boost Peak235
internal fun PlayerActivity.showV235VolumeBoostPeak235Toggle() {
    val current = BiliClient.prefs.v235volumeBoostPeak235
    BiliClient.prefs.v235volumeBoostPeak235 = !current
    AppToast.show(this, "Volume Boost Peak235: ${if (!current) "ON" else "OFF"}")
}

// v235: History Bookmark Export235
internal fun PlayerActivity.showV235HistoryBookmarkExport235Toggle() {
    val current = BiliClient.prefs.v235historyBookmarkExport235
    BiliClient.prefs.v235historyBookmarkExport235 = !current
    AppToast.show(this, "History Bookmark Export235: ${if (!current) "ON" else "OFF"}")
}

// v235: Playback Chapter Sync235
internal fun PlayerActivity.showV235PlaybackChapterSync235Toggle() {
    val current = BiliClient.prefs.v235playbackChapterSync235
    BiliClient.prefs.v235playbackChapterSync235 = !current
    AppToast.show(this, "Playback Chapter Sync235: ${if (!current) "ON" else "OFF"}")
}

// v235: Screenshot Save Path235
internal fun PlayerActivity.showV235ScreenshotSavePath235Toggle() {
    val current = BiliClient.prefs.v235screenshotSavePath235
    BiliClient.prefs.v235screenshotSavePath235 = !current
    AppToast.show(this, "Screenshot Save Path235: ${if (!current) "ON" else "OFF"}")
}

// v235: Video Color Space235
internal fun PlayerActivity.showV235VideoColorSpace235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235videoColorSpace235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235videoColorSpace235 = value
        AppToast.show(this, "Video Color Space235: $value")
    }
}

// v235: Danmaku Bottom Max Count278
internal fun PlayerActivity.showV235DanmakuBottomMaxCount278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235danmakuBottomMaxCount278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235danmakuBottomMaxCount278 = value
        AppToast.show(this, "Danmaku Bottom Max Count278: $value")
    }
}

// v235: Subtitle Bg Border285
internal fun PlayerActivity.showV235SubtitleBgBorder285Toggle() {
    val current = BiliClient.prefs.v235subtitleBgBorder285
    BiliClient.prefs.v235subtitleBgBorder285 = !current
    AppToast.show(this, "Subtitle Bg Border285: ${if (!current) "ON" else "OFF"}")
}

// v236: Audio EQ Custom236
internal fun PlayerActivity.showV236AudioEQCustom236Toggle() {
    val current = BiliClient.prefs.v236audioEQCustom236
    BiliClient.prefs.v236audioEQCustom236 = !current
    AppToast.show(this, "Audio EQ Custom236: ${if (!current) "ON" else "OFF"}")
}

// v236: Danmaku Bottom Max Count279
internal fun PlayerActivity.showV236DanmakuBottomMaxCount279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236danmakuBottomMaxCount279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236danmakuBottomMaxCount279 = value
        AppToast.show(this, "Danmaku Bottom Max Count279: $value")
    }
}

// v236: Subtitle Bg Border286
internal fun PlayerActivity.showV236SubtitleBgBorder286Toggle() {
    val current = BiliClient.prefs.v236subtitleBgBorder286
    BiliClient.prefs.v236subtitleBgBorder286 = !current
    AppToast.show(this, "Subtitle Bg Border286: ${if (!current) "ON" else "OFF"}")
}

// v236: Gesture Shake Action236
internal fun PlayerActivity.showV236GestureShakeAction236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236gestureShakeAction236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236gestureShakeAction236 = value
        AppToast.show(this, "Gesture Shake Action236: $value")
    }
}

// v236: Cast Audio Volume236
internal fun PlayerActivity.showV236CastAudioVolume236Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v236castAudioVolume236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236castAudioVolume236 = value
        AppToast.show(this, "Cast Audio Volume236: $value")
    }
}

// v236: Playlist Auto Skip Outro236
internal fun PlayerActivity.showV236PlaylistAutoSkipOutro236Toggle() {
    val current = BiliClient.prefs.v236playlistAutoSkipOutro236
    BiliClient.prefs.v236playlistAutoSkipOutro236 = !current
    AppToast.show(this, "Playlist Auto Skip Outro236: ${if (!current) "ON" else "OFF"}")
}

// v236: Cache Download Speed237
internal fun PlayerActivity.showV236CacheDownloadSpeed237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236cacheDownloadSpeed237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236cacheDownloadSpeed237 = value
        AppToast.show(this, "Cache Download Speed237: $value")
    }
}

// v236: Progress Bar Thumb Border236
internal fun PlayerActivity.showV236ProgressBarThumbBorder236Toggle() {
    val current = BiliClient.prefs.v236progressBarThumbBorder236
    BiliClient.prefs.v236progressBarThumbBorder236 = !current
    AppToast.show(this, "Progress Bar Thumb Border236: ${if (!current) "ON" else "OFF"}")
}

