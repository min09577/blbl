package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v263: Gesture Shake Action263
internal fun PlayerActivity.showV263GestureShakeAction263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263gestureShakeAction263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263gestureShakeAction263 = value
        AppToast.show(this, "Gesture Shake Action263: $value")
    }
}

// v263: Cast Audio Volume263
internal fun PlayerActivity.showV263CastAudioVolume263Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v263castAudioVolume263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263castAudioVolume263 = value
        AppToast.show(this, "Cast Audio Volume263: $value")
    }
}

// v263: Playlist Auto Skip Outro263
internal fun PlayerActivity.showV263PlaylistAutoSkipOutro263Toggle() {
    val current = BiliClient.prefs.v263playlistAutoSkipOutro263
    BiliClient.prefs.v263playlistAutoSkipOutro263 = !current
    AppToast.show(this, "Playlist Auto Skip Outro263: ${if (!current) "ON" else "OFF"}")
}

// v263: Cache Download Speed264
internal fun PlayerActivity.showV263CacheDownloadSpeed264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263cacheDownloadSpeed264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263cacheDownloadSpeed264 = value
        AppToast.show(this, "Cache Download Speed264: $value")
    }
}

// v263: Progress Bar Thumb Border263
internal fun PlayerActivity.showV263ProgressBarThumbBorder263Toggle() {
    val current = BiliClient.prefs.v263progressBarThumbBorder263
    BiliClient.prefs.v263progressBarThumbBorder263 = !current
    AppToast.show(this, "Progress Bar Thumb Border263: ${if (!current) "ON" else "OFF"}")
}

// v263: Volume Boost Peak263
internal fun PlayerActivity.showV263VolumeBoostPeak263Toggle() {
    val current = BiliClient.prefs.v263volumeBoostPeak263
    BiliClient.prefs.v263volumeBoostPeak263 = !current
    AppToast.show(this, "Volume Boost Peak263: ${if (!current) "ON" else "OFF"}")
}

// v263: History Bookmark Export263
internal fun PlayerActivity.showV263HistoryBookmarkExport263Toggle() {
    val current = BiliClient.prefs.v263historyBookmarkExport263
    BiliClient.prefs.v263historyBookmarkExport263 = !current
    AppToast.show(this, "History Bookmark Export263: ${if (!current) "ON" else "OFF"}")
}

// v263: Playback Chapter Sync263
internal fun PlayerActivity.showV263PlaybackChapterSync263Toggle() {
    val current = BiliClient.prefs.v263playbackChapterSync263
    BiliClient.prefs.v263playbackChapterSync263 = !current
    AppToast.show(this, "Playback Chapter Sync263: ${if (!current) "ON" else "OFF"}")
}

// v263: Screenshot Save Path263
internal fun PlayerActivity.showV263ScreenshotSavePath263Toggle() {
    val current = BiliClient.prefs.v263screenshotSavePath263
    BiliClient.prefs.v263screenshotSavePath263 = !current
    AppToast.show(this, "Screenshot Save Path263: ${if (!current) "ON" else "OFF"}")
}

// v263: Video Color Space263
internal fun PlayerActivity.showV263VideoColorSpace263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263videoColorSpace263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263videoColorSpace263 = value
        AppToast.show(this, "Video Color Space263: $value")
    }
}

// v263: Danmaku Bottom Max Count334
internal fun PlayerActivity.showV263DanmakuBottomMaxCount334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263danmakuBottomMaxCount334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263danmakuBottomMaxCount334 = value
        AppToast.show(this, "Danmaku Bottom Max Count334: $value")
    }
}

// v263: Subtitle Bg Border341
internal fun PlayerActivity.showV263SubtitleBgBorder341Toggle() {
    val current = BiliClient.prefs.v263subtitleBgBorder341
    BiliClient.prefs.v263subtitleBgBorder341 = !current
    AppToast.show(this, "Subtitle Bg Border341: ${if (!current) "ON" else "OFF"}")
}

// v264: Audio EQ Custom264
internal fun PlayerActivity.showV264AudioEQCustom264Toggle() {
    val current = BiliClient.prefs.v264audioEQCustom264
    BiliClient.prefs.v264audioEQCustom264 = !current
    AppToast.show(this, "Audio EQ Custom264: ${if (!current) "ON" else "OFF"}")
}

// v264: Danmaku Bottom Max Count335
internal fun PlayerActivity.showV264DanmakuBottomMaxCount335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264danmakuBottomMaxCount335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264danmakuBottomMaxCount335 = value
        AppToast.show(this, "Danmaku Bottom Max Count335: $value")
    }
}

// v264: Subtitle Bg Border342
internal fun PlayerActivity.showV264SubtitleBgBorder342Toggle() {
    val current = BiliClient.prefs.v264subtitleBgBorder342
    BiliClient.prefs.v264subtitleBgBorder342 = !current
    AppToast.show(this, "Subtitle Bg Border342: ${if (!current) "ON" else "OFF"}")
}

// v264: Gesture Shake Action264
internal fun PlayerActivity.showV264GestureShakeAction264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264gestureShakeAction264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264gestureShakeAction264 = value
        AppToast.show(this, "Gesture Shake Action264: $value")
    }
}

// v264: Cast Audio Volume264
internal fun PlayerActivity.showV264CastAudioVolume264Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v264castAudioVolume264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264castAudioVolume264 = value
        AppToast.show(this, "Cast Audio Volume264: $value")
    }
}

// v264: Playlist Auto Skip Outro264
internal fun PlayerActivity.showV264PlaylistAutoSkipOutro264Toggle() {
    val current = BiliClient.prefs.v264playlistAutoSkipOutro264
    BiliClient.prefs.v264playlistAutoSkipOutro264 = !current
    AppToast.show(this, "Playlist Auto Skip Outro264: ${if (!current) "ON" else "OFF"}")
}

// v264: Cache Download Speed265
internal fun PlayerActivity.showV264CacheDownloadSpeed265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264cacheDownloadSpeed265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264cacheDownloadSpeed265 = value
        AppToast.show(this, "Cache Download Speed265: $value")
    }
}

// v264: Progress Bar Thumb Border264
internal fun PlayerActivity.showV264ProgressBarThumbBorder264Toggle() {
    val current = BiliClient.prefs.v264progressBarThumbBorder264
    BiliClient.prefs.v264progressBarThumbBorder264 = !current
    AppToast.show(this, "Progress Bar Thumb Border264: ${if (!current) "ON" else "OFF"}")
}

// v264: Volume Boost Peak264
internal fun PlayerActivity.showV264VolumeBoostPeak264Toggle() {
    val current = BiliClient.prefs.v264volumeBoostPeak264
    BiliClient.prefs.v264volumeBoostPeak264 = !current
    AppToast.show(this, "Volume Boost Peak264: ${if (!current) "ON" else "OFF"}")
}

// v264: History Bookmark Export264
internal fun PlayerActivity.showV264HistoryBookmarkExport264Toggle() {
    val current = BiliClient.prefs.v264historyBookmarkExport264
    BiliClient.prefs.v264historyBookmarkExport264 = !current
    AppToast.show(this, "History Bookmark Export264: ${if (!current) "ON" else "OFF"}")
}

// v264: Playback Chapter Sync264
internal fun PlayerActivity.showV264PlaybackChapterSync264Toggle() {
    val current = BiliClient.prefs.v264playbackChapterSync264
    BiliClient.prefs.v264playbackChapterSync264 = !current
    AppToast.show(this, "Playback Chapter Sync264: ${if (!current) "ON" else "OFF"}")
}

// v264: Screenshot Save Path264
internal fun PlayerActivity.showV264ScreenshotSavePath264Toggle() {
    val current = BiliClient.prefs.v264screenshotSavePath264
    BiliClient.prefs.v264screenshotSavePath264 = !current
    AppToast.show(this, "Screenshot Save Path264: ${if (!current) "ON" else "OFF"}")
}

// v264: Video Color Space264
internal fun PlayerActivity.showV264VideoColorSpace264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264videoColorSpace264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264videoColorSpace264 = value
        AppToast.show(this, "Video Color Space264: $value")
    }
}

// v264: Danmaku Bottom Max Count336
internal fun PlayerActivity.showV264DanmakuBottomMaxCount336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264danmakuBottomMaxCount336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264danmakuBottomMaxCount336 = value
        AppToast.show(this, "Danmaku Bottom Max Count336: $value")
    }
}

// v264: Subtitle Bg Border343
internal fun PlayerActivity.showV264SubtitleBgBorder343Toggle() {
    val current = BiliClient.prefs.v264subtitleBgBorder343
    BiliClient.prefs.v264subtitleBgBorder343 = !current
    AppToast.show(this, "Subtitle Bg Border343: ${if (!current) "ON" else "OFF"}")
}

// v265: Audio EQ Custom265
internal fun PlayerActivity.showV265AudioEQCustom265Toggle() {
    val current = BiliClient.prefs.v265audioEQCustom265
    BiliClient.prefs.v265audioEQCustom265 = !current
    AppToast.show(this, "Audio EQ Custom265: ${if (!current) "ON" else "OFF"}")
}

// v265: Danmaku Bottom Max Count337
internal fun PlayerActivity.showV265DanmakuBottomMaxCount337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265danmakuBottomMaxCount337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265danmakuBottomMaxCount337 = value
        AppToast.show(this, "Danmaku Bottom Max Count337: $value")
    }
}

// v265: Subtitle Bg Border344
internal fun PlayerActivity.showV265SubtitleBgBorder344Toggle() {
    val current = BiliClient.prefs.v265subtitleBgBorder344
    BiliClient.prefs.v265subtitleBgBorder344 = !current
    AppToast.show(this, "Subtitle Bg Border344: ${if (!current) "ON" else "OFF"}")
}

// v265: Gesture Shake Action265
internal fun PlayerActivity.showV265GestureShakeAction265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265gestureShakeAction265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265gestureShakeAction265 = value
        AppToast.show(this, "Gesture Shake Action265: $value")
    }
}

// v265: Cast Audio Volume265
internal fun PlayerActivity.showV265CastAudioVolume265Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v265castAudioVolume265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265castAudioVolume265 = value
        AppToast.show(this, "Cast Audio Volume265: $value")
    }
}

// v265: Playlist Auto Skip Outro265
internal fun PlayerActivity.showV265PlaylistAutoSkipOutro265Toggle() {
    val current = BiliClient.prefs.v265playlistAutoSkipOutro265
    BiliClient.prefs.v265playlistAutoSkipOutro265 = !current
    AppToast.show(this, "Playlist Auto Skip Outro265: ${if (!current) "ON" else "OFF"}")
}

// v265: Cache Download Speed266
internal fun PlayerActivity.showV265CacheDownloadSpeed266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265cacheDownloadSpeed266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265cacheDownloadSpeed266 = value
        AppToast.show(this, "Cache Download Speed266: $value")
    }
}

// v265: Progress Bar Thumb Border265
internal fun PlayerActivity.showV265ProgressBarThumbBorder265Toggle() {
    val current = BiliClient.prefs.v265progressBarThumbBorder265
    BiliClient.prefs.v265progressBarThumbBorder265 = !current
    AppToast.show(this, "Progress Bar Thumb Border265: ${if (!current) "ON" else "OFF"}")
}

// v265: Volume Boost Peak265
internal fun PlayerActivity.showV265VolumeBoostPeak265Toggle() {
    val current = BiliClient.prefs.v265volumeBoostPeak265
    BiliClient.prefs.v265volumeBoostPeak265 = !current
    AppToast.show(this, "Volume Boost Peak265: ${if (!current) "ON" else "OFF"}")
}

// v265: History Bookmark Export265
internal fun PlayerActivity.showV265HistoryBookmarkExport265Toggle() {
    val current = BiliClient.prefs.v265historyBookmarkExport265
    BiliClient.prefs.v265historyBookmarkExport265 = !current
    AppToast.show(this, "History Bookmark Export265: ${if (!current) "ON" else "OFF"}")
}

// v265: Playback Chapter Sync265
internal fun PlayerActivity.showV265PlaybackChapterSync265Toggle() {
    val current = BiliClient.prefs.v265playbackChapterSync265
    BiliClient.prefs.v265playbackChapterSync265 = !current
    AppToast.show(this, "Playback Chapter Sync265: ${if (!current) "ON" else "OFF"}")
}

// v265: Screenshot Save Path265
internal fun PlayerActivity.showV265ScreenshotSavePath265Toggle() {
    val current = BiliClient.prefs.v265screenshotSavePath265
    BiliClient.prefs.v265screenshotSavePath265 = !current
    AppToast.show(this, "Screenshot Save Path265: ${if (!current) "ON" else "OFF"}")
}

// v265: Video Color Space265
internal fun PlayerActivity.showV265VideoColorSpace265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265videoColorSpace265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265videoColorSpace265 = value
        AppToast.show(this, "Video Color Space265: $value")
    }
}

// v265: Danmaku Bottom Max Count338
internal fun PlayerActivity.showV265DanmakuBottomMaxCount338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265danmakuBottomMaxCount338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265danmakuBottomMaxCount338 = value
        AppToast.show(this, "Danmaku Bottom Max Count338: $value")
    }
}

// v265: Subtitle Bg Border345
internal fun PlayerActivity.showV265SubtitleBgBorder345Toggle() {
    val current = BiliClient.prefs.v265subtitleBgBorder345
    BiliClient.prefs.v265subtitleBgBorder345 = !current
    AppToast.show(this, "Subtitle Bg Border345: ${if (!current) "ON" else "OFF"}")
}

// v266: Audio EQ Custom266
internal fun PlayerActivity.showV266AudioEQCustom266Toggle() {
    val current = BiliClient.prefs.v266audioEQCustom266
    BiliClient.prefs.v266audioEQCustom266 = !current
    AppToast.show(this, "Audio EQ Custom266: ${if (!current) "ON" else "OFF"}")
}

// v266: Danmaku Bottom Max Count339
internal fun PlayerActivity.showV266DanmakuBottomMaxCount339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266danmakuBottomMaxCount339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266danmakuBottomMaxCount339 = value
        AppToast.show(this, "Danmaku Bottom Max Count339: $value")
    }
}

// v266: Subtitle Bg Border346
internal fun PlayerActivity.showV266SubtitleBgBorder346Toggle() {
    val current = BiliClient.prefs.v266subtitleBgBorder346
    BiliClient.prefs.v266subtitleBgBorder346 = !current
    AppToast.show(this, "Subtitle Bg Border346: ${if (!current) "ON" else "OFF"}")
}

// v266: Gesture Shake Action266
internal fun PlayerActivity.showV266GestureShakeAction266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266gestureShakeAction266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266gestureShakeAction266 = value
        AppToast.show(this, "Gesture Shake Action266: $value")
    }
}

// v266: Cast Audio Volume266
internal fun PlayerActivity.showV266CastAudioVolume266Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v266castAudioVolume266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266castAudioVolume266 = value
        AppToast.show(this, "Cast Audio Volume266: $value")
    }
}

// v266: Playlist Auto Skip Outro266
internal fun PlayerActivity.showV266PlaylistAutoSkipOutro266Toggle() {
    val current = BiliClient.prefs.v266playlistAutoSkipOutro266
    BiliClient.prefs.v266playlistAutoSkipOutro266 = !current
    AppToast.show(this, "Playlist Auto Skip Outro266: ${if (!current) "ON" else "OFF"}")
}

// v266: Cache Download Speed267
internal fun PlayerActivity.showV266CacheDownloadSpeed267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266cacheDownloadSpeed267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266cacheDownloadSpeed267 = value
        AppToast.show(this, "Cache Download Speed267: $value")
    }
}

// v266: Progress Bar Thumb Border266
internal fun PlayerActivity.showV266ProgressBarThumbBorder266Toggle() {
    val current = BiliClient.prefs.v266progressBarThumbBorder266
    BiliClient.prefs.v266progressBarThumbBorder266 = !current
    AppToast.show(this, "Progress Bar Thumb Border266: ${if (!current) "ON" else "OFF"}")
}

// v266: Volume Boost Peak266
internal fun PlayerActivity.showV266VolumeBoostPeak266Toggle() {
    val current = BiliClient.prefs.v266volumeBoostPeak266
    BiliClient.prefs.v266volumeBoostPeak266 = !current
    AppToast.show(this, "Volume Boost Peak266: ${if (!current) "ON" else "OFF"}")
}

// v266: History Bookmark Export266
internal fun PlayerActivity.showV266HistoryBookmarkExport266Toggle() {
    val current = BiliClient.prefs.v266historyBookmarkExport266
    BiliClient.prefs.v266historyBookmarkExport266 = !current
    AppToast.show(this, "History Bookmark Export266: ${if (!current) "ON" else "OFF"}")
}

// v266: Playback Chapter Sync266
internal fun PlayerActivity.showV266PlaybackChapterSync266Toggle() {
    val current = BiliClient.prefs.v266playbackChapterSync266
    BiliClient.prefs.v266playbackChapterSync266 = !current
    AppToast.show(this, "Playback Chapter Sync266: ${if (!current) "ON" else "OFF"}")
}

// v266: Screenshot Save Path266
internal fun PlayerActivity.showV266ScreenshotSavePath266Toggle() {
    val current = BiliClient.prefs.v266screenshotSavePath266
    BiliClient.prefs.v266screenshotSavePath266 = !current
    AppToast.show(this, "Screenshot Save Path266: ${if (!current) "ON" else "OFF"}")
}

// v266: Video Color Space266
internal fun PlayerActivity.showV266VideoColorSpace266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266videoColorSpace266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266videoColorSpace266 = value
        AppToast.show(this, "Video Color Space266: $value")
    }
}

// v266: Danmaku Bottom Max Count340
internal fun PlayerActivity.showV266DanmakuBottomMaxCount340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266danmakuBottomMaxCount340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266danmakuBottomMaxCount340 = value
        AppToast.show(this, "Danmaku Bottom Max Count340: $value")
    }
}

// v266: Subtitle Bg Border347
internal fun PlayerActivity.showV266SubtitleBgBorder347Toggle() {
    val current = BiliClient.prefs.v266subtitleBgBorder347
    BiliClient.prefs.v266subtitleBgBorder347 = !current
    AppToast.show(this, "Subtitle Bg Border347: ${if (!current) "ON" else "OFF"}")
}

// v267: Audio EQ Custom267
internal fun PlayerActivity.showV267AudioEQCustom267Toggle() {
    val current = BiliClient.prefs.v267audioEQCustom267
    BiliClient.prefs.v267audioEQCustom267 = !current
    AppToast.show(this, "Audio EQ Custom267: ${if (!current) "ON" else "OFF"}")
}

// v267: Danmaku Bottom Max Count341
internal fun PlayerActivity.showV267DanmakuBottomMaxCount341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267danmakuBottomMaxCount341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267danmakuBottomMaxCount341 = value
        AppToast.show(this, "Danmaku Bottom Max Count341: $value")
    }
}

// v267: Subtitle Bg Border348
internal fun PlayerActivity.showV267SubtitleBgBorder348Toggle() {
    val current = BiliClient.prefs.v267subtitleBgBorder348
    BiliClient.prefs.v267subtitleBgBorder348 = !current
    AppToast.show(this, "Subtitle Bg Border348: ${if (!current) "ON" else "OFF"}")
}

// v267: Gesture Shake Action267
internal fun PlayerActivity.showV267GestureShakeAction267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267gestureShakeAction267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267gestureShakeAction267 = value
        AppToast.show(this, "Gesture Shake Action267: $value")
    }
}

// v267: Cast Audio Volume267
internal fun PlayerActivity.showV267CastAudioVolume267Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v267castAudioVolume267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267castAudioVolume267 = value
        AppToast.show(this, "Cast Audio Volume267: $value")
    }
}

// v267: Playlist Auto Skip Outro267
internal fun PlayerActivity.showV267PlaylistAutoSkipOutro267Toggle() {
    val current = BiliClient.prefs.v267playlistAutoSkipOutro267
    BiliClient.prefs.v267playlistAutoSkipOutro267 = !current
    AppToast.show(this, "Playlist Auto Skip Outro267: ${if (!current) "ON" else "OFF"}")
}

// v267: Cache Download Speed268
internal fun PlayerActivity.showV267CacheDownloadSpeed268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267cacheDownloadSpeed268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267cacheDownloadSpeed268 = value
        AppToast.show(this, "Cache Download Speed268: $value")
    }
}

// v267: Progress Bar Thumb Border267
internal fun PlayerActivity.showV267ProgressBarThumbBorder267Toggle() {
    val current = BiliClient.prefs.v267progressBarThumbBorder267
    BiliClient.prefs.v267progressBarThumbBorder267 = !current
    AppToast.show(this, "Progress Bar Thumb Border267: ${if (!current) "ON" else "OFF"}")
}

// v267: Volume Boost Peak267
internal fun PlayerActivity.showV267VolumeBoostPeak267Toggle() {
    val current = BiliClient.prefs.v267volumeBoostPeak267
    BiliClient.prefs.v267volumeBoostPeak267 = !current
    AppToast.show(this, "Volume Boost Peak267: ${if (!current) "ON" else "OFF"}")
}

// v267: History Bookmark Export267
internal fun PlayerActivity.showV267HistoryBookmarkExport267Toggle() {
    val current = BiliClient.prefs.v267historyBookmarkExport267
    BiliClient.prefs.v267historyBookmarkExport267 = !current
    AppToast.show(this, "History Bookmark Export267: ${if (!current) "ON" else "OFF"}")
}

// v267: Playback Chapter Sync267
internal fun PlayerActivity.showV267PlaybackChapterSync267Toggle() {
    val current = BiliClient.prefs.v267playbackChapterSync267
    BiliClient.prefs.v267playbackChapterSync267 = !current
    AppToast.show(this, "Playback Chapter Sync267: ${if (!current) "ON" else "OFF"}")
}

// v267: Screenshot Save Path267
internal fun PlayerActivity.showV267ScreenshotSavePath267Toggle() {
    val current = BiliClient.prefs.v267screenshotSavePath267
    BiliClient.prefs.v267screenshotSavePath267 = !current
    AppToast.show(this, "Screenshot Save Path267: ${if (!current) "ON" else "OFF"}")
}

// v267: Video Color Space267
internal fun PlayerActivity.showV267VideoColorSpace267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267videoColorSpace267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267videoColorSpace267 = value
        AppToast.show(this, "Video Color Space267: $value")
    }
}

// v267: Danmaku Bottom Max Count342
internal fun PlayerActivity.showV267DanmakuBottomMaxCount342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267danmakuBottomMaxCount342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267danmakuBottomMaxCount342 = value
        AppToast.show(this, "Danmaku Bottom Max Count342: $value")
    }
}

// v267: Subtitle Bg Border349
internal fun PlayerActivity.showV267SubtitleBgBorder349Toggle() {
    val current = BiliClient.prefs.v267subtitleBgBorder349
    BiliClient.prefs.v267subtitleBgBorder349 = !current
    AppToast.show(this, "Subtitle Bg Border349: ${if (!current) "ON" else "OFF"}")
}

// v268: Audio EQ Custom268
internal fun PlayerActivity.showV268AudioEQCustom268Toggle() {
    val current = BiliClient.prefs.v268audioEQCustom268
    BiliClient.prefs.v268audioEQCustom268 = !current
    AppToast.show(this, "Audio EQ Custom268: ${if (!current) "ON" else "OFF"}")
}

// v268: Danmaku Bottom Max Count343
internal fun PlayerActivity.showV268DanmakuBottomMaxCount343Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268danmakuBottomMaxCount343).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count343",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268danmakuBottomMaxCount343 = value
        AppToast.show(this, "Danmaku Bottom Max Count343: $value")
    }
}

// v268: Subtitle Bg Border350
internal fun PlayerActivity.showV268SubtitleBgBorder350Toggle() {
    val current = BiliClient.prefs.v268subtitleBgBorder350
    BiliClient.prefs.v268subtitleBgBorder350 = !current
    AppToast.show(this, "Subtitle Bg Border350: ${if (!current) "ON" else "OFF"}")
}

// v268: Gesture Shake Action268
internal fun PlayerActivity.showV268GestureShakeAction268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268gestureShakeAction268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268gestureShakeAction268 = value
        AppToast.show(this, "Gesture Shake Action268: $value")
    }
}

// v268: Cast Audio Volume268
internal fun PlayerActivity.showV268CastAudioVolume268Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v268castAudioVolume268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268castAudioVolume268 = value
        AppToast.show(this, "Cast Audio Volume268: $value")
    }
}

// v268: Playlist Auto Skip Outro268
internal fun PlayerActivity.showV268PlaylistAutoSkipOutro268Toggle() {
    val current = BiliClient.prefs.v268playlistAutoSkipOutro268
    BiliClient.prefs.v268playlistAutoSkipOutro268 = !current
    AppToast.show(this, "Playlist Auto Skip Outro268: ${if (!current) "ON" else "OFF"}")
}

// v268: Cache Download Speed269
internal fun PlayerActivity.showV268CacheDownloadSpeed269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268cacheDownloadSpeed269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268cacheDownloadSpeed269 = value
        AppToast.show(this, "Cache Download Speed269: $value")
    }
}

// v268: Progress Bar Thumb Border268
internal fun PlayerActivity.showV268ProgressBarThumbBorder268Toggle() {
    val current = BiliClient.prefs.v268progressBarThumbBorder268
    BiliClient.prefs.v268progressBarThumbBorder268 = !current
    AppToast.show(this, "Progress Bar Thumb Border268: ${if (!current) "ON" else "OFF"}")
}

// v268: Volume Boost Peak268
internal fun PlayerActivity.showV268VolumeBoostPeak268Toggle() {
    val current = BiliClient.prefs.v268volumeBoostPeak268
    BiliClient.prefs.v268volumeBoostPeak268 = !current
    AppToast.show(this, "Volume Boost Peak268: ${if (!current) "ON" else "OFF"}")
}

// v268: History Bookmark Export268
internal fun PlayerActivity.showV268HistoryBookmarkExport268Toggle() {
    val current = BiliClient.prefs.v268historyBookmarkExport268
    BiliClient.prefs.v268historyBookmarkExport268 = !current
    AppToast.show(this, "History Bookmark Export268: ${if (!current) "ON" else "OFF"}")
}

// v268: Playback Chapter Sync268
internal fun PlayerActivity.showV268PlaybackChapterSync268Toggle() {
    val current = BiliClient.prefs.v268playbackChapterSync268
    BiliClient.prefs.v268playbackChapterSync268 = !current
    AppToast.show(this, "Playback Chapter Sync268: ${if (!current) "ON" else "OFF"}")
}

// v268: Screenshot Save Path268
internal fun PlayerActivity.showV268ScreenshotSavePath268Toggle() {
    val current = BiliClient.prefs.v268screenshotSavePath268
    BiliClient.prefs.v268screenshotSavePath268 = !current
    AppToast.show(this, "Screenshot Save Path268: ${if (!current) "ON" else "OFF"}")
}

// v268: Video Color Space268
internal fun PlayerActivity.showV268VideoColorSpace268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268videoColorSpace268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268videoColorSpace268 = value
        AppToast.show(this, "Video Color Space268: $value")
    }
}

// v268: Danmaku Bottom Max Count344
internal fun PlayerActivity.showV268DanmakuBottomMaxCount344Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268danmakuBottomMaxCount344).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count344",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268danmakuBottomMaxCount344 = value
        AppToast.show(this, "Danmaku Bottom Max Count344: $value")
    }
}

// v268: Subtitle Bg Border351
internal fun PlayerActivity.showV268SubtitleBgBorder351Toggle() {
    val current = BiliClient.prefs.v268subtitleBgBorder351
    BiliClient.prefs.v268subtitleBgBorder351 = !current
    AppToast.show(this, "Subtitle Bg Border351: ${if (!current) "ON" else "OFF"}")
}

// v269: Audio EQ Custom269
internal fun PlayerActivity.showV269AudioEQCustom269Toggle() {
    val current = BiliClient.prefs.v269audioEQCustom269
    BiliClient.prefs.v269audioEQCustom269 = !current
    AppToast.show(this, "Audio EQ Custom269: ${if (!current) "ON" else "OFF"}")
}

// v269: Danmaku Bottom Max Count345
internal fun PlayerActivity.showV269DanmakuBottomMaxCount345Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269danmakuBottomMaxCount345).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count345",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269danmakuBottomMaxCount345 = value
        AppToast.show(this, "Danmaku Bottom Max Count345: $value")
    }
}

// v269: Subtitle Bg Border352
internal fun PlayerActivity.showV269SubtitleBgBorder352Toggle() {
    val current = BiliClient.prefs.v269subtitleBgBorder352
    BiliClient.prefs.v269subtitleBgBorder352 = !current
    AppToast.show(this, "Subtitle Bg Border352: ${if (!current) "ON" else "OFF"}")
}

// v269: Gesture Shake Action269
internal fun PlayerActivity.showV269GestureShakeAction269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269gestureShakeAction269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269gestureShakeAction269 = value
        AppToast.show(this, "Gesture Shake Action269: $value")
    }
}

// v269: Cast Audio Volume269
internal fun PlayerActivity.showV269CastAudioVolume269Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v269castAudioVolume269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269castAudioVolume269 = value
        AppToast.show(this, "Cast Audio Volume269: $value")
    }
}

// v269: Playlist Auto Skip Outro269
internal fun PlayerActivity.showV269PlaylistAutoSkipOutro269Toggle() {
    val current = BiliClient.prefs.v269playlistAutoSkipOutro269
    BiliClient.prefs.v269playlistAutoSkipOutro269 = !current
    AppToast.show(this, "Playlist Auto Skip Outro269: ${if (!current) "ON" else "OFF"}")
}

// v269: Cache Download Speed270
internal fun PlayerActivity.showV269CacheDownloadSpeed270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269cacheDownloadSpeed270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269cacheDownloadSpeed270 = value
        AppToast.show(this, "Cache Download Speed270: $value")
    }
}

// v269: Progress Bar Thumb Border269
internal fun PlayerActivity.showV269ProgressBarThumbBorder269Toggle() {
    val current = BiliClient.prefs.v269progressBarThumbBorder269
    BiliClient.prefs.v269progressBarThumbBorder269 = !current
    AppToast.show(this, "Progress Bar Thumb Border269: ${if (!current) "ON" else "OFF"}")
}

// v269: Volume Boost Peak269
internal fun PlayerActivity.showV269VolumeBoostPeak269Toggle() {
    val current = BiliClient.prefs.v269volumeBoostPeak269
    BiliClient.prefs.v269volumeBoostPeak269 = !current
    AppToast.show(this, "Volume Boost Peak269: ${if (!current) "ON" else "OFF"}")
}

// v269: History Bookmark Export269
internal fun PlayerActivity.showV269HistoryBookmarkExport269Toggle() {
    val current = BiliClient.prefs.v269historyBookmarkExport269
    BiliClient.prefs.v269historyBookmarkExport269 = !current
    AppToast.show(this, "History Bookmark Export269: ${if (!current) "ON" else "OFF"}")
}

// v269: Playback Chapter Sync269
internal fun PlayerActivity.showV269PlaybackChapterSync269Toggle() {
    val current = BiliClient.prefs.v269playbackChapterSync269
    BiliClient.prefs.v269playbackChapterSync269 = !current
    AppToast.show(this, "Playback Chapter Sync269: ${if (!current) "ON" else "OFF"}")
}

// v269: Screenshot Save Path269
internal fun PlayerActivity.showV269ScreenshotSavePath269Toggle() {
    val current = BiliClient.prefs.v269screenshotSavePath269
    BiliClient.prefs.v269screenshotSavePath269 = !current
    AppToast.show(this, "Screenshot Save Path269: ${if (!current) "ON" else "OFF"}")
}

// v269: Video Color Space269
internal fun PlayerActivity.showV269VideoColorSpace269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269videoColorSpace269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269videoColorSpace269 = value
        AppToast.show(this, "Video Color Space269: $value")
    }
}

// v269: Danmaku Bottom Max Count346
internal fun PlayerActivity.showV269DanmakuBottomMaxCount346Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269danmakuBottomMaxCount346).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count346",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269danmakuBottomMaxCount346 = value
        AppToast.show(this, "Danmaku Bottom Max Count346: $value")
    }
}

// v269: Subtitle Bg Border353
internal fun PlayerActivity.showV269SubtitleBgBorder353Toggle() {
    val current = BiliClient.prefs.v269subtitleBgBorder353
    BiliClient.prefs.v269subtitleBgBorder353 = !current
    AppToast.show(this, "Subtitle Bg Border353: ${if (!current) "ON" else "OFF"}")
}

// v270: Audio EQ Custom270
internal fun PlayerActivity.showV270AudioEQCustom270Toggle() {
    val current = BiliClient.prefs.v270audioEQCustom270
    BiliClient.prefs.v270audioEQCustom270 = !current
    AppToast.show(this, "Audio EQ Custom270: ${if (!current) "ON" else "OFF"}")
}

// v270: Danmaku Bottom Max Count347
internal fun PlayerActivity.showV270DanmakuBottomMaxCount347Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270danmakuBottomMaxCount347).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count347",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270danmakuBottomMaxCount347 = value
        AppToast.show(this, "Danmaku Bottom Max Count347: $value")
    }
}

// v270: Subtitle Bg Border354
internal fun PlayerActivity.showV270SubtitleBgBorder354Toggle() {
    val current = BiliClient.prefs.v270subtitleBgBorder354
    BiliClient.prefs.v270subtitleBgBorder354 = !current
    AppToast.show(this, "Subtitle Bg Border354: ${if (!current) "ON" else "OFF"}")
}

// v270: Gesture Shake Action270
internal fun PlayerActivity.showV270GestureShakeAction270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270gestureShakeAction270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270gestureShakeAction270 = value
        AppToast.show(this, "Gesture Shake Action270: $value")
    }
}

// v270: Cast Audio Volume270
internal fun PlayerActivity.showV270CastAudioVolume270Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v270castAudioVolume270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270castAudioVolume270 = value
        AppToast.show(this, "Cast Audio Volume270: $value")
    }
}

// v270: Playlist Auto Skip Outro270
internal fun PlayerActivity.showV270PlaylistAutoSkipOutro270Toggle() {
    val current = BiliClient.prefs.v270playlistAutoSkipOutro270
    BiliClient.prefs.v270playlistAutoSkipOutro270 = !current
    AppToast.show(this, "Playlist Auto Skip Outro270: ${if (!current) "ON" else "OFF"}")
}

// v270: Cache Download Speed271
internal fun PlayerActivity.showV270CacheDownloadSpeed271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270cacheDownloadSpeed271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270cacheDownloadSpeed271 = value
        AppToast.show(this, "Cache Download Speed271: $value")
    }
}

// v270: Progress Bar Thumb Border270
internal fun PlayerActivity.showV270ProgressBarThumbBorder270Toggle() {
    val current = BiliClient.prefs.v270progressBarThumbBorder270
    BiliClient.prefs.v270progressBarThumbBorder270 = !current
    AppToast.show(this, "Progress Bar Thumb Border270: ${if (!current) "ON" else "OFF"}")
}

// v270: Volume Boost Peak270
internal fun PlayerActivity.showV270VolumeBoostPeak270Toggle() {
    val current = BiliClient.prefs.v270volumeBoostPeak270
    BiliClient.prefs.v270volumeBoostPeak270 = !current
    AppToast.show(this, "Volume Boost Peak270: ${if (!current) "ON" else "OFF"}")
}

// v270: History Bookmark Export270
internal fun PlayerActivity.showV270HistoryBookmarkExport270Toggle() {
    val current = BiliClient.prefs.v270historyBookmarkExport270
    BiliClient.prefs.v270historyBookmarkExport270 = !current
    AppToast.show(this, "History Bookmark Export270: ${if (!current) "ON" else "OFF"}")
}

// v270: Playback Chapter Sync270
internal fun PlayerActivity.showV270PlaybackChapterSync270Toggle() {
    val current = BiliClient.prefs.v270playbackChapterSync270
    BiliClient.prefs.v270playbackChapterSync270 = !current
    AppToast.show(this, "Playback Chapter Sync270: ${if (!current) "ON" else "OFF"}")
}

// v270: Screenshot Save Path270
internal fun PlayerActivity.showV270ScreenshotSavePath270Toggle() {
    val current = BiliClient.prefs.v270screenshotSavePath270
    BiliClient.prefs.v270screenshotSavePath270 = !current
    AppToast.show(this, "Screenshot Save Path270: ${if (!current) "ON" else "OFF"}")
}

// v270: Video Color Space270
internal fun PlayerActivity.showV270VideoColorSpace270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270videoColorSpace270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270videoColorSpace270 = value
        AppToast.show(this, "Video Color Space270: $value")
    }
}

// v270: Danmaku Bottom Max Count348
internal fun PlayerActivity.showV270DanmakuBottomMaxCount348Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270danmakuBottomMaxCount348).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count348",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270danmakuBottomMaxCount348 = value
        AppToast.show(this, "Danmaku Bottom Max Count348: $value")
    }
}

// v270: Subtitle Bg Border355
internal fun PlayerActivity.showV270SubtitleBgBorder355Toggle() {
    val current = BiliClient.prefs.v270subtitleBgBorder355
    BiliClient.prefs.v270subtitleBgBorder355 = !current
    AppToast.show(this, "Subtitle Bg Border355: ${if (!current) "ON" else "OFF"}")
}

// v271: Audio EQ Custom271
internal fun PlayerActivity.showV271AudioEQCustom271Toggle() {
    val current = BiliClient.prefs.v271audioEQCustom271
    BiliClient.prefs.v271audioEQCustom271 = !current
    AppToast.show(this, "Audio EQ Custom271: ${if (!current) "ON" else "OFF"}")
}

// v271: Danmaku Bottom Max Count349
internal fun PlayerActivity.showV271DanmakuBottomMaxCount349Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271danmakuBottomMaxCount349).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count349",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271danmakuBottomMaxCount349 = value
        AppToast.show(this, "Danmaku Bottom Max Count349: $value")
    }
}

// v271: Subtitle Bg Border356
internal fun PlayerActivity.showV271SubtitleBgBorder356Toggle() {
    val current = BiliClient.prefs.v271subtitleBgBorder356
    BiliClient.prefs.v271subtitleBgBorder356 = !current
    AppToast.show(this, "Subtitle Bg Border356: ${if (!current) "ON" else "OFF"}")
}

// v271: Gesture Shake Action271
internal fun PlayerActivity.showV271GestureShakeAction271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271gestureShakeAction271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271gestureShakeAction271 = value
        AppToast.show(this, "Gesture Shake Action271: $value")
    }
}

// v271: Cast Audio Volume271
internal fun PlayerActivity.showV271CastAudioVolume271Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v271castAudioVolume271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271castAudioVolume271 = value
        AppToast.show(this, "Cast Audio Volume271: $value")
    }
}

// v271: Playlist Auto Skip Outro271
internal fun PlayerActivity.showV271PlaylistAutoSkipOutro271Toggle() {
    val current = BiliClient.prefs.v271playlistAutoSkipOutro271
    BiliClient.prefs.v271playlistAutoSkipOutro271 = !current
    AppToast.show(this, "Playlist Auto Skip Outro271: ${if (!current) "ON" else "OFF"}")
}

// v271: Cache Download Speed272
internal fun PlayerActivity.showV271CacheDownloadSpeed272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271cacheDownloadSpeed272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271cacheDownloadSpeed272 = value
        AppToast.show(this, "Cache Download Speed272: $value")
    }
}

// v271: Progress Bar Thumb Border271
internal fun PlayerActivity.showV271ProgressBarThumbBorder271Toggle() {
    val current = BiliClient.prefs.v271progressBarThumbBorder271
    BiliClient.prefs.v271progressBarThumbBorder271 = !current
    AppToast.show(this, "Progress Bar Thumb Border271: ${if (!current) "ON" else "OFF"}")
}

// v271: Volume Boost Peak271
internal fun PlayerActivity.showV271VolumeBoostPeak271Toggle() {
    val current = BiliClient.prefs.v271volumeBoostPeak271
    BiliClient.prefs.v271volumeBoostPeak271 = !current
    AppToast.show(this, "Volume Boost Peak271: ${if (!current) "ON" else "OFF"}")
}

// v271: History Bookmark Export271
internal fun PlayerActivity.showV271HistoryBookmarkExport271Toggle() {
    val current = BiliClient.prefs.v271historyBookmarkExport271
    BiliClient.prefs.v271historyBookmarkExport271 = !current
    AppToast.show(this, "History Bookmark Export271: ${if (!current) "ON" else "OFF"}")
}

// v271: Playback Chapter Sync271
internal fun PlayerActivity.showV271PlaybackChapterSync271Toggle() {
    val current = BiliClient.prefs.v271playbackChapterSync271
    BiliClient.prefs.v271playbackChapterSync271 = !current
    AppToast.show(this, "Playback Chapter Sync271: ${if (!current) "ON" else "OFF"}")
}

// v271: Screenshot Save Path271
internal fun PlayerActivity.showV271ScreenshotSavePath271Toggle() {
    val current = BiliClient.prefs.v271screenshotSavePath271
    BiliClient.prefs.v271screenshotSavePath271 = !current
    AppToast.show(this, "Screenshot Save Path271: ${if (!current) "ON" else "OFF"}")
}

// v271: Video Color Space271
internal fun PlayerActivity.showV271VideoColorSpace271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271videoColorSpace271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271videoColorSpace271 = value
        AppToast.show(this, "Video Color Space271: $value")
    }
}

// v271: Danmaku Bottom Max Count350
internal fun PlayerActivity.showV271DanmakuBottomMaxCount350Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271danmakuBottomMaxCount350).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count350",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271danmakuBottomMaxCount350 = value
        AppToast.show(this, "Danmaku Bottom Max Count350: $value")
    }
}

// v271: Subtitle Bg Border357
internal fun PlayerActivity.showV271SubtitleBgBorder357Toggle() {
    val current = BiliClient.prefs.v271subtitleBgBorder357
    BiliClient.prefs.v271subtitleBgBorder357 = !current
    AppToast.show(this, "Subtitle Bg Border357: ${if (!current) "ON" else "OFF"}")
}

// v272: Audio EQ Custom272
internal fun PlayerActivity.showV272AudioEQCustom272Toggle() {
    val current = BiliClient.prefs.v272audioEQCustom272
    BiliClient.prefs.v272audioEQCustom272 = !current
    AppToast.show(this, "Audio EQ Custom272: ${if (!current) "ON" else "OFF"}")
}

// v272: Danmaku Bottom Max Count351
internal fun PlayerActivity.showV272DanmakuBottomMaxCount351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272danmakuBottomMaxCount351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272danmakuBottomMaxCount351 = value
        AppToast.show(this, "Danmaku Bottom Max Count351: $value")
    }
}

// v272: Subtitle Bg Border358
internal fun PlayerActivity.showV272SubtitleBgBorder358Toggle() {
    val current = BiliClient.prefs.v272subtitleBgBorder358
    BiliClient.prefs.v272subtitleBgBorder358 = !current
    AppToast.show(this, "Subtitle Bg Border358: ${if (!current) "ON" else "OFF"}")
}

// v272: Gesture Shake Action272
internal fun PlayerActivity.showV272GestureShakeAction272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272gestureShakeAction272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272gestureShakeAction272 = value
        AppToast.show(this, "Gesture Shake Action272: $value")
    }
}

// v272: Cast Audio Volume272
internal fun PlayerActivity.showV272CastAudioVolume272Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v272castAudioVolume272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272castAudioVolume272 = value
        AppToast.show(this, "Cast Audio Volume272: $value")
    }
}

// v272: Playlist Auto Skip Outro272
internal fun PlayerActivity.showV272PlaylistAutoSkipOutro272Toggle() {
    val current = BiliClient.prefs.v272playlistAutoSkipOutro272
    BiliClient.prefs.v272playlistAutoSkipOutro272 = !current
    AppToast.show(this, "Playlist Auto Skip Outro272: ${if (!current) "ON" else "OFF"}")
}

// v272: Cache Download Speed273
internal fun PlayerActivity.showV272CacheDownloadSpeed273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272cacheDownloadSpeed273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272cacheDownloadSpeed273 = value
        AppToast.show(this, "Cache Download Speed273: $value")
    }
}

// v272: Progress Bar Thumb Border272
internal fun PlayerActivity.showV272ProgressBarThumbBorder272Toggle() {
    val current = BiliClient.prefs.v272progressBarThumbBorder272
    BiliClient.prefs.v272progressBarThumbBorder272 = !current
    AppToast.show(this, "Progress Bar Thumb Border272: ${if (!current) "ON" else "OFF"}")
}

// v272: Volume Boost Peak272
internal fun PlayerActivity.showV272VolumeBoostPeak272Toggle() {
    val current = BiliClient.prefs.v272volumeBoostPeak272
    BiliClient.prefs.v272volumeBoostPeak272 = !current
    AppToast.show(this, "Volume Boost Peak272: ${if (!current) "ON" else "OFF"}")
}

// v272: History Bookmark Export272
internal fun PlayerActivity.showV272HistoryBookmarkExport272Toggle() {
    val current = BiliClient.prefs.v272historyBookmarkExport272
    BiliClient.prefs.v272historyBookmarkExport272 = !current
    AppToast.show(this, "History Bookmark Export272: ${if (!current) "ON" else "OFF"}")
}

// v272: Playback Chapter Sync272
internal fun PlayerActivity.showV272PlaybackChapterSync272Toggle() {
    val current = BiliClient.prefs.v272playbackChapterSync272
    BiliClient.prefs.v272playbackChapterSync272 = !current
    AppToast.show(this, "Playback Chapter Sync272: ${if (!current) "ON" else "OFF"}")
}

// v272: Screenshot Save Path272
internal fun PlayerActivity.showV272ScreenshotSavePath272Toggle() {
    val current = BiliClient.prefs.v272screenshotSavePath272
    BiliClient.prefs.v272screenshotSavePath272 = !current
    AppToast.show(this, "Screenshot Save Path272: ${if (!current) "ON" else "OFF"}")
}

// v272: Video Color Space272
internal fun PlayerActivity.showV272VideoColorSpace272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272videoColorSpace272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272videoColorSpace272 = value
        AppToast.show(this, "Video Color Space272: $value")
    }
}

// v272: Danmaku Bottom Max Count352
internal fun PlayerActivity.showV272DanmakuBottomMaxCount352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272danmakuBottomMaxCount352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272danmakuBottomMaxCount352 = value
        AppToast.show(this, "Danmaku Bottom Max Count352: $value")
    }
}

// v272: Subtitle Bg Border359
internal fun PlayerActivity.showV272SubtitleBgBorder359Toggle() {
    val current = BiliClient.prefs.v272subtitleBgBorder359
    BiliClient.prefs.v272subtitleBgBorder359 = !current
    AppToast.show(this, "Subtitle Bg Border359: ${if (!current) "ON" else "OFF"}")
}

// v273: Audio EQ Custom273
internal fun PlayerActivity.showV273AudioEQCustom273Toggle() {
    val current = BiliClient.prefs.v273audioEQCustom273
    BiliClient.prefs.v273audioEQCustom273 = !current
    AppToast.show(this, "Audio EQ Custom273: ${if (!current) "ON" else "OFF"}")
}

// v273: Danmaku Bottom Max Count353
internal fun PlayerActivity.showV273DanmakuBottomMaxCount353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273danmakuBottomMaxCount353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273danmakuBottomMaxCount353 = value
        AppToast.show(this, "Danmaku Bottom Max Count353: $value")
    }
}

// v273: Subtitle Bg Border360
internal fun PlayerActivity.showV273SubtitleBgBorder360Toggle() {
    val current = BiliClient.prefs.v273subtitleBgBorder360
    BiliClient.prefs.v273subtitleBgBorder360 = !current
    AppToast.show(this, "Subtitle Bg Border360: ${if (!current) "ON" else "OFF"}")
}

// v273: Gesture Shake Action273
internal fun PlayerActivity.showV273GestureShakeAction273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273gestureShakeAction273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273gestureShakeAction273 = value
        AppToast.show(this, "Gesture Shake Action273: $value")
    }
}

// v273: Cast Audio Volume273
internal fun PlayerActivity.showV273CastAudioVolume273Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v273castAudioVolume273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273castAudioVolume273 = value
        AppToast.show(this, "Cast Audio Volume273: $value")
    }
}

// v273: Playlist Auto Skip Outro273
internal fun PlayerActivity.showV273PlaylistAutoSkipOutro273Toggle() {
    val current = BiliClient.prefs.v273playlistAutoSkipOutro273
    BiliClient.prefs.v273playlistAutoSkipOutro273 = !current
    AppToast.show(this, "Playlist Auto Skip Outro273: ${if (!current) "ON" else "OFF"}")
}

// v273: Cache Download Speed274
internal fun PlayerActivity.showV273CacheDownloadSpeed274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273cacheDownloadSpeed274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273cacheDownloadSpeed274 = value
        AppToast.show(this, "Cache Download Speed274: $value")
    }
}

// v273: Progress Bar Thumb Border273
internal fun PlayerActivity.showV273ProgressBarThumbBorder273Toggle() {
    val current = BiliClient.prefs.v273progressBarThumbBorder273
    BiliClient.prefs.v273progressBarThumbBorder273 = !current
    AppToast.show(this, "Progress Bar Thumb Border273: ${if (!current) "ON" else "OFF"}")
}

// v273: Volume Boost Peak273
internal fun PlayerActivity.showV273VolumeBoostPeak273Toggle() {
    val current = BiliClient.prefs.v273volumeBoostPeak273
    BiliClient.prefs.v273volumeBoostPeak273 = !current
    AppToast.show(this, "Volume Boost Peak273: ${if (!current) "ON" else "OFF"}")
}

// v273: History Bookmark Export273
internal fun PlayerActivity.showV273HistoryBookmarkExport273Toggle() {
    val current = BiliClient.prefs.v273historyBookmarkExport273
    BiliClient.prefs.v273historyBookmarkExport273 = !current
    AppToast.show(this, "History Bookmark Export273: ${if (!current) "ON" else "OFF"}")
}

// v273: Playback Chapter Sync273
internal fun PlayerActivity.showV273PlaybackChapterSync273Toggle() {
    val current = BiliClient.prefs.v273playbackChapterSync273
    BiliClient.prefs.v273playbackChapterSync273 = !current
    AppToast.show(this, "Playback Chapter Sync273: ${if (!current) "ON" else "OFF"}")
}

// v273: Screenshot Save Path273
internal fun PlayerActivity.showV273ScreenshotSavePath273Toggle() {
    val current = BiliClient.prefs.v273screenshotSavePath273
    BiliClient.prefs.v273screenshotSavePath273 = !current
    AppToast.show(this, "Screenshot Save Path273: ${if (!current) "ON" else "OFF"}")
}

// v273: Video Color Space273
internal fun PlayerActivity.showV273VideoColorSpace273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273videoColorSpace273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273videoColorSpace273 = value
        AppToast.show(this, "Video Color Space273: $value")
    }
}

// v273: Danmaku Bottom Max Count354
internal fun PlayerActivity.showV273DanmakuBottomMaxCount354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273danmakuBottomMaxCount354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273danmakuBottomMaxCount354 = value
        AppToast.show(this, "Danmaku Bottom Max Count354: $value")
    }
}

// v273: Subtitle Bg Border361
internal fun PlayerActivity.showV273SubtitleBgBorder361Toggle() {
    val current = BiliClient.prefs.v273subtitleBgBorder361
    BiliClient.prefs.v273subtitleBgBorder361 = !current
    AppToast.show(this, "Subtitle Bg Border361: ${if (!current) "ON" else "OFF"}")
}

// v274: Audio EQ Custom274
internal fun PlayerActivity.showV274AudioEQCustom274Toggle() {
    val current = BiliClient.prefs.v274audioEQCustom274
    BiliClient.prefs.v274audioEQCustom274 = !current
    AppToast.show(this, "Audio EQ Custom274: ${if (!current) "ON" else "OFF"}")
}

// v274: Danmaku Bottom Max Count355
internal fun PlayerActivity.showV274DanmakuBottomMaxCount355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274danmakuBottomMaxCount355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274danmakuBottomMaxCount355 = value
        AppToast.show(this, "Danmaku Bottom Max Count355: $value")
    }
}

// v274: Subtitle Bg Border362
internal fun PlayerActivity.showV274SubtitleBgBorder362Toggle() {
    val current = BiliClient.prefs.v274subtitleBgBorder362
    BiliClient.prefs.v274subtitleBgBorder362 = !current
    AppToast.show(this, "Subtitle Bg Border362: ${if (!current) "ON" else "OFF"}")
}

// v274: Gesture Shake Action274
internal fun PlayerActivity.showV274GestureShakeAction274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274gestureShakeAction274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274gestureShakeAction274 = value
        AppToast.show(this, "Gesture Shake Action274: $value")
    }
}

// v274: Cast Audio Volume274
internal fun PlayerActivity.showV274CastAudioVolume274Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v274castAudioVolume274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274castAudioVolume274 = value
        AppToast.show(this, "Cast Audio Volume274: $value")
    }
}

// v274: Playlist Auto Skip Outro274
internal fun PlayerActivity.showV274PlaylistAutoSkipOutro274Toggle() {
    val current = BiliClient.prefs.v274playlistAutoSkipOutro274
    BiliClient.prefs.v274playlistAutoSkipOutro274 = !current
    AppToast.show(this, "Playlist Auto Skip Outro274: ${if (!current) "ON" else "OFF"}")
}

// v274: Cache Download Speed275
internal fun PlayerActivity.showV274CacheDownloadSpeed275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274cacheDownloadSpeed275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274cacheDownloadSpeed275 = value
        AppToast.show(this, "Cache Download Speed275: $value")
    }
}

// v274: Progress Bar Thumb Border274
internal fun PlayerActivity.showV274ProgressBarThumbBorder274Toggle() {
    val current = BiliClient.prefs.v274progressBarThumbBorder274
    BiliClient.prefs.v274progressBarThumbBorder274 = !current
    AppToast.show(this, "Progress Bar Thumb Border274: ${if (!current) "ON" else "OFF"}")
}

// v274: Volume Boost Peak274
internal fun PlayerActivity.showV274VolumeBoostPeak274Toggle() {
    val current = BiliClient.prefs.v274volumeBoostPeak274
    BiliClient.prefs.v274volumeBoostPeak274 = !current
    AppToast.show(this, "Volume Boost Peak274: ${if (!current) "ON" else "OFF"}")
}

// v274: History Bookmark Export274
internal fun PlayerActivity.showV274HistoryBookmarkExport274Toggle() {
    val current = BiliClient.prefs.v274historyBookmarkExport274
    BiliClient.prefs.v274historyBookmarkExport274 = !current
    AppToast.show(this, "History Bookmark Export274: ${if (!current) "ON" else "OFF"}")
}

// v274: Playback Chapter Sync274
internal fun PlayerActivity.showV274PlaybackChapterSync274Toggle() {
    val current = BiliClient.prefs.v274playbackChapterSync274
    BiliClient.prefs.v274playbackChapterSync274 = !current
    AppToast.show(this, "Playback Chapter Sync274: ${if (!current) "ON" else "OFF"}")
}

// v274: Screenshot Save Path274
internal fun PlayerActivity.showV274ScreenshotSavePath274Toggle() {
    val current = BiliClient.prefs.v274screenshotSavePath274
    BiliClient.prefs.v274screenshotSavePath274 = !current
    AppToast.show(this, "Screenshot Save Path274: ${if (!current) "ON" else "OFF"}")
}

// v274: Video Color Space274
internal fun PlayerActivity.showV274VideoColorSpace274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274videoColorSpace274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274videoColorSpace274 = value
        AppToast.show(this, "Video Color Space274: $value")
    }
}

// v274: Danmaku Bottom Max Count356
internal fun PlayerActivity.showV274DanmakuBottomMaxCount356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274danmakuBottomMaxCount356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274danmakuBottomMaxCount356 = value
        AppToast.show(this, "Danmaku Bottom Max Count356: $value")
    }
}

// v274: Subtitle Bg Border363
internal fun PlayerActivity.showV274SubtitleBgBorder363Toggle() {
    val current = BiliClient.prefs.v274subtitleBgBorder363
    BiliClient.prefs.v274subtitleBgBorder363 = !current
    AppToast.show(this, "Subtitle Bg Border363: ${if (!current) "ON" else "OFF"}")
}

// v275: Audio EQ Custom275
internal fun PlayerActivity.showV275AudioEQCustom275Toggle() {
    val current = BiliClient.prefs.v275audioEQCustom275
    BiliClient.prefs.v275audioEQCustom275 = !current
    AppToast.show(this, "Audio EQ Custom275: ${if (!current) "ON" else "OFF"}")
}

// v275: Danmaku Bottom Max Count357
internal fun PlayerActivity.showV275DanmakuBottomMaxCount357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275danmakuBottomMaxCount357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275danmakuBottomMaxCount357 = value
        AppToast.show(this, "Danmaku Bottom Max Count357: $value")
    }
}

// v275: Subtitle Bg Border364
internal fun PlayerActivity.showV275SubtitleBgBorder364Toggle() {
    val current = BiliClient.prefs.v275subtitleBgBorder364
    BiliClient.prefs.v275subtitleBgBorder364 = !current
    AppToast.show(this, "Subtitle Bg Border364: ${if (!current) "ON" else "OFF"}")
}

// v275: Gesture Shake Action275
internal fun PlayerActivity.showV275GestureShakeAction275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275gestureShakeAction275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275gestureShakeAction275 = value
        AppToast.show(this, "Gesture Shake Action275: $value")
    }
}

// v275: Cast Audio Volume275
internal fun PlayerActivity.showV275CastAudioVolume275Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v275castAudioVolume275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275castAudioVolume275 = value
        AppToast.show(this, "Cast Audio Volume275: $value")
    }
}

// v275: Playlist Auto Skip Outro275
internal fun PlayerActivity.showV275PlaylistAutoSkipOutro275Toggle() {
    val current = BiliClient.prefs.v275playlistAutoSkipOutro275
    BiliClient.prefs.v275playlistAutoSkipOutro275 = !current
    AppToast.show(this, "Playlist Auto Skip Outro275: ${if (!current) "ON" else "OFF"}")
}

// v275: Cache Download Speed276
internal fun PlayerActivity.showV275CacheDownloadSpeed276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275cacheDownloadSpeed276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275cacheDownloadSpeed276 = value
        AppToast.show(this, "Cache Download Speed276: $value")
    }
}

// v275: Progress Bar Thumb Border275
internal fun PlayerActivity.showV275ProgressBarThumbBorder275Toggle() {
    val current = BiliClient.prefs.v275progressBarThumbBorder275
    BiliClient.prefs.v275progressBarThumbBorder275 = !current
    AppToast.show(this, "Progress Bar Thumb Border275: ${if (!current) "ON" else "OFF"}")
}

// v275: Volume Boost Peak275
internal fun PlayerActivity.showV275VolumeBoostPeak275Toggle() {
    val current = BiliClient.prefs.v275volumeBoostPeak275
    BiliClient.prefs.v275volumeBoostPeak275 = !current
    AppToast.show(this, "Volume Boost Peak275: ${if (!current) "ON" else "OFF"}")
}

// v275: History Bookmark Export275
internal fun PlayerActivity.showV275HistoryBookmarkExport275Toggle() {
    val current = BiliClient.prefs.v275historyBookmarkExport275
    BiliClient.prefs.v275historyBookmarkExport275 = !current
    AppToast.show(this, "History Bookmark Export275: ${if (!current) "ON" else "OFF"}")
}

// v275: Playback Chapter Sync275
internal fun PlayerActivity.showV275PlaybackChapterSync275Toggle() {
    val current = BiliClient.prefs.v275playbackChapterSync275
    BiliClient.prefs.v275playbackChapterSync275 = !current
    AppToast.show(this, "Playback Chapter Sync275: ${if (!current) "ON" else "OFF"}")
}

// v275: Screenshot Save Path275
internal fun PlayerActivity.showV275ScreenshotSavePath275Toggle() {
    val current = BiliClient.prefs.v275screenshotSavePath275
    BiliClient.prefs.v275screenshotSavePath275 = !current
    AppToast.show(this, "Screenshot Save Path275: ${if (!current) "ON" else "OFF"}")
}

// v275: Video Color Space275
internal fun PlayerActivity.showV275VideoColorSpace275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275videoColorSpace275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275videoColorSpace275 = value
        AppToast.show(this, "Video Color Space275: $value")
    }
}

// v275: Danmaku Bottom Max Count358
internal fun PlayerActivity.showV275DanmakuBottomMaxCount358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275danmakuBottomMaxCount358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275danmakuBottomMaxCount358 = value
        AppToast.show(this, "Danmaku Bottom Max Count358: $value")
    }
}

// v275: Subtitle Bg Border365
internal fun PlayerActivity.showV275SubtitleBgBorder365Toggle() {
    val current = BiliClient.prefs.v275subtitleBgBorder365
    BiliClient.prefs.v275subtitleBgBorder365 = !current
    AppToast.show(this, "Subtitle Bg Border365: ${if (!current) "ON" else "OFF"}")
}

// v276: Audio EQ Custom276
internal fun PlayerActivity.showV276AudioEQCustom276Toggle() {
    val current = BiliClient.prefs.v276audioEQCustom276
    BiliClient.prefs.v276audioEQCustom276 = !current
    AppToast.show(this, "Audio EQ Custom276: ${if (!current) "ON" else "OFF"}")
}

// v276: Danmaku Bottom Max Count359
internal fun PlayerActivity.showV276DanmakuBottomMaxCount359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276danmakuBottomMaxCount359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276danmakuBottomMaxCount359 = value
        AppToast.show(this, "Danmaku Bottom Max Count359: $value")
    }
}

// v276: Subtitle Bg Border366
internal fun PlayerActivity.showV276SubtitleBgBorder366Toggle() {
    val current = BiliClient.prefs.v276subtitleBgBorder366
    BiliClient.prefs.v276subtitleBgBorder366 = !current
    AppToast.show(this, "Subtitle Bg Border366: ${if (!current) "ON" else "OFF"}")
}

// v276: Gesture Shake Action276
internal fun PlayerActivity.showV276GestureShakeAction276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276gestureShakeAction276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276gestureShakeAction276 = value
        AppToast.show(this, "Gesture Shake Action276: $value")
    }
}

// v276: Cast Audio Volume276
internal fun PlayerActivity.showV276CastAudioVolume276Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v276castAudioVolume276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276castAudioVolume276 = value
        AppToast.show(this, "Cast Audio Volume276: $value")
    }
}

// v276: Playlist Auto Skip Outro276
internal fun PlayerActivity.showV276PlaylistAutoSkipOutro276Toggle() {
    val current = BiliClient.prefs.v276playlistAutoSkipOutro276
    BiliClient.prefs.v276playlistAutoSkipOutro276 = !current
    AppToast.show(this, "Playlist Auto Skip Outro276: ${if (!current) "ON" else "OFF"}")
}

// v276: Cache Download Speed277
internal fun PlayerActivity.showV276CacheDownloadSpeed277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276cacheDownloadSpeed277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276cacheDownloadSpeed277 = value
        AppToast.show(this, "Cache Download Speed277: $value")
    }
}

// v276: Progress Bar Thumb Border276
internal fun PlayerActivity.showV276ProgressBarThumbBorder276Toggle() {
    val current = BiliClient.prefs.v276progressBarThumbBorder276
    BiliClient.prefs.v276progressBarThumbBorder276 = !current
    AppToast.show(this, "Progress Bar Thumb Border276: ${if (!current) "ON" else "OFF"}")
}

