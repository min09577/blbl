package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.FeaturePrefsStore
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

// v2081: linked mode
internal fun PlayerActivity.showV2081LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081linked
    FeaturePrefsStore.batch2081.v2081linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2081: listed mode
internal fun PlayerActivity.showV2081ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081listed
    FeaturePrefsStore.batch2081.v2081listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2081: listened mode
internal fun PlayerActivity.showV2081ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081listened
    FeaturePrefsStore.batch2081.v2081listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2081: loaded mode
internal fun PlayerActivity.showV2081LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081loaded
    FeaturePrefsStore.batch2081.v2081loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2081: located mode
internal fun PlayerActivity.showV2081LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081located
    FeaturePrefsStore.batch2081.v2081located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2081: locked level
internal fun PlayerActivity.showV2081LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2081locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2081locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2081: logged level
internal fun PlayerActivity.showV2081LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2081logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2081logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2081: looked level
internal fun PlayerActivity.showV2081LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2081looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2081looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2081: loosened level
internal fun PlayerActivity.showV2081LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2081loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2081loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2081: lowered level
internal fun PlayerActivity.showV2081LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2081lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2081lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2081: maintained mode
internal fun PlayerActivity.showV2081MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081maintained
    FeaturePrefsStore.batch2081.v2081maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2081: managed mode
internal fun PlayerActivity.showV2081ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081managed
    FeaturePrefsStore.batch2081.v2081managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2081: manifested mode
internal fun PlayerActivity.showV2081ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081manifested
    FeaturePrefsStore.batch2081.v2081manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2081: manipulated mode
internal fun PlayerActivity.showV2081ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081manipulated
    FeaturePrefsStore.batch2081.v2081manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2081: manufactured mode
internal fun PlayerActivity.showV2081ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2081manufactured
    FeaturePrefsStore.batch2081.v2081manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2082: linked mode
internal fun PlayerActivity.showV2082LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082linked
    FeaturePrefsStore.batch2081.v2082linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2082: listed mode
internal fun PlayerActivity.showV2082ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082listed
    FeaturePrefsStore.batch2081.v2082listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2082: listened mode
internal fun PlayerActivity.showV2082ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082listened
    FeaturePrefsStore.batch2081.v2082listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2082: loaded mode
internal fun PlayerActivity.showV2082LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082loaded
    FeaturePrefsStore.batch2081.v2082loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2082: located mode
internal fun PlayerActivity.showV2082LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082located
    FeaturePrefsStore.batch2081.v2082located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2082: locked level
internal fun PlayerActivity.showV2082LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2082locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2082locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2082: logged level
internal fun PlayerActivity.showV2082LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2082logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2082logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2082: looked level
internal fun PlayerActivity.showV2082LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2082looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2082looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2082: loosened level
internal fun PlayerActivity.showV2082LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2082loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2082loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2082: lowered level
internal fun PlayerActivity.showV2082LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2082lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2082lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2082: maintained mode
internal fun PlayerActivity.showV2082MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082maintained
    FeaturePrefsStore.batch2081.v2082maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2082: managed mode
internal fun PlayerActivity.showV2082ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082managed
    FeaturePrefsStore.batch2081.v2082managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2082: manifested mode
internal fun PlayerActivity.showV2082ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082manifested
    FeaturePrefsStore.batch2081.v2082manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2082: manipulated mode
internal fun PlayerActivity.showV2082ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082manipulated
    FeaturePrefsStore.batch2081.v2082manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2082: manufactured mode
internal fun PlayerActivity.showV2082ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2082manufactured
    FeaturePrefsStore.batch2081.v2082manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2083: linked mode
internal fun PlayerActivity.showV2083LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083linked
    FeaturePrefsStore.batch2081.v2083linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2083: listed mode
internal fun PlayerActivity.showV2083ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083listed
    FeaturePrefsStore.batch2081.v2083listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2083: listened mode
internal fun PlayerActivity.showV2083ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083listened
    FeaturePrefsStore.batch2081.v2083listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2083: loaded mode
internal fun PlayerActivity.showV2083LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083loaded
    FeaturePrefsStore.batch2081.v2083loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2083: located mode
internal fun PlayerActivity.showV2083LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083located
    FeaturePrefsStore.batch2081.v2083located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2083: locked level
internal fun PlayerActivity.showV2083LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2083locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2083locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2083: logged level
internal fun PlayerActivity.showV2083LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2083logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2083logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2083: looked level
internal fun PlayerActivity.showV2083LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2083looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2083looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2083: loosened level
internal fun PlayerActivity.showV2083LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2083loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2083loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2083: lowered level
internal fun PlayerActivity.showV2083LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2083lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2083lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2083: maintained mode
internal fun PlayerActivity.showV2083MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083maintained
    FeaturePrefsStore.batch2081.v2083maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2083: managed mode
internal fun PlayerActivity.showV2083ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083managed
    FeaturePrefsStore.batch2081.v2083managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2083: manifested mode
internal fun PlayerActivity.showV2083ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083manifested
    FeaturePrefsStore.batch2081.v2083manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2083: manipulated mode
internal fun PlayerActivity.showV2083ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083manipulated
    FeaturePrefsStore.batch2081.v2083manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2083: manufactured mode
internal fun PlayerActivity.showV2083ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2083manufactured
    FeaturePrefsStore.batch2081.v2083manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2084: linked mode
internal fun PlayerActivity.showV2084LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084linked
    FeaturePrefsStore.batch2081.v2084linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2084: listed mode
internal fun PlayerActivity.showV2084ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084listed
    FeaturePrefsStore.batch2081.v2084listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2084: listened mode
internal fun PlayerActivity.showV2084ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084listened
    FeaturePrefsStore.batch2081.v2084listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2084: loaded mode
internal fun PlayerActivity.showV2084LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084loaded
    FeaturePrefsStore.batch2081.v2084loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2084: located mode
internal fun PlayerActivity.showV2084LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084located
    FeaturePrefsStore.batch2081.v2084located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2084: locked level
internal fun PlayerActivity.showV2084LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2084locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2084locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2084: logged level
internal fun PlayerActivity.showV2084LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2084logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2084logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2084: looked level
internal fun PlayerActivity.showV2084LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2084looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2084looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2084: loosened level
internal fun PlayerActivity.showV2084LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2084loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2084loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2084: lowered level
internal fun PlayerActivity.showV2084LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2084lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2084lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2084: maintained mode
internal fun PlayerActivity.showV2084MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084maintained
    FeaturePrefsStore.batch2081.v2084maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2084: managed mode
internal fun PlayerActivity.showV2084ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084managed
    FeaturePrefsStore.batch2081.v2084managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2084: manifested mode
internal fun PlayerActivity.showV2084ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084manifested
    FeaturePrefsStore.batch2081.v2084manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2084: manipulated mode
internal fun PlayerActivity.showV2084ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084manipulated
    FeaturePrefsStore.batch2081.v2084manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2084: manufactured mode
internal fun PlayerActivity.showV2084ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2084manufactured
    FeaturePrefsStore.batch2081.v2084manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2085: linked mode
internal fun PlayerActivity.showV2085LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085linked
    FeaturePrefsStore.batch2081.v2085linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2085: listed mode
internal fun PlayerActivity.showV2085ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085listed
    FeaturePrefsStore.batch2081.v2085listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2085: listened mode
internal fun PlayerActivity.showV2085ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085listened
    FeaturePrefsStore.batch2081.v2085listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2085: loaded mode
internal fun PlayerActivity.showV2085LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085loaded
    FeaturePrefsStore.batch2081.v2085loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2085: located mode
internal fun PlayerActivity.showV2085LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085located
    FeaturePrefsStore.batch2081.v2085located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2085: locked level
internal fun PlayerActivity.showV2085LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2085locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2085locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2085: logged level
internal fun PlayerActivity.showV2085LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2085logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2085logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2085: looked level
internal fun PlayerActivity.showV2085LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2085looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2085looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2085: loosened level
internal fun PlayerActivity.showV2085LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2085loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2085loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2085: lowered level
internal fun PlayerActivity.showV2085LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2085lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2085lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2085: maintained mode
internal fun PlayerActivity.showV2085MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085maintained
    FeaturePrefsStore.batch2081.v2085maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2085: managed mode
internal fun PlayerActivity.showV2085ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085managed
    FeaturePrefsStore.batch2081.v2085managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2085: manifested mode
internal fun PlayerActivity.showV2085ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085manifested
    FeaturePrefsStore.batch2081.v2085manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2085: manipulated mode
internal fun PlayerActivity.showV2085ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085manipulated
    FeaturePrefsStore.batch2081.v2085manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2085: manufactured mode
internal fun PlayerActivity.showV2085ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2085manufactured
    FeaturePrefsStore.batch2081.v2085manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2086: linked mode
internal fun PlayerActivity.showV2086LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086linked
    FeaturePrefsStore.batch2081.v2086linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2086: listed mode
internal fun PlayerActivity.showV2086ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086listed
    FeaturePrefsStore.batch2081.v2086listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2086: listened mode
internal fun PlayerActivity.showV2086ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086listened
    FeaturePrefsStore.batch2081.v2086listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2086: loaded mode
internal fun PlayerActivity.showV2086LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086loaded
    FeaturePrefsStore.batch2081.v2086loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2086: located mode
internal fun PlayerActivity.showV2086LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086located
    FeaturePrefsStore.batch2081.v2086located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2086: locked level
internal fun PlayerActivity.showV2086LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2086locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2086locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2086: logged level
internal fun PlayerActivity.showV2086LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2086logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2086logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2086: looked level
internal fun PlayerActivity.showV2086LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2086looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2086looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2086: loosened level
internal fun PlayerActivity.showV2086LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2086loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2086loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2086: lowered level
internal fun PlayerActivity.showV2086LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2086lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2086lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2086: maintained mode
internal fun PlayerActivity.showV2086MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086maintained
    FeaturePrefsStore.batch2081.v2086maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2086: managed mode
internal fun PlayerActivity.showV2086ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086managed
    FeaturePrefsStore.batch2081.v2086managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2086: manifested mode
internal fun PlayerActivity.showV2086ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086manifested
    FeaturePrefsStore.batch2081.v2086manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2086: manipulated mode
internal fun PlayerActivity.showV2086ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086manipulated
    FeaturePrefsStore.batch2081.v2086manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2086: manufactured mode
internal fun PlayerActivity.showV2086ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2086manufactured
    FeaturePrefsStore.batch2081.v2086manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2087: linked mode
internal fun PlayerActivity.showV2087LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087linked
    FeaturePrefsStore.batch2081.v2087linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2087: listed mode
internal fun PlayerActivity.showV2087ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087listed
    FeaturePrefsStore.batch2081.v2087listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2087: listened mode
internal fun PlayerActivity.showV2087ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087listened
    FeaturePrefsStore.batch2081.v2087listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2087: loaded mode
internal fun PlayerActivity.showV2087LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087loaded
    FeaturePrefsStore.batch2081.v2087loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2087: located mode
internal fun PlayerActivity.showV2087LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087located
    FeaturePrefsStore.batch2081.v2087located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2087: locked level
internal fun PlayerActivity.showV2087LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2087locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2087locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2087: logged level
internal fun PlayerActivity.showV2087LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2087logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2087logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2087: looked level
internal fun PlayerActivity.showV2087LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2087looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2087looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2087: loosened level
internal fun PlayerActivity.showV2087LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2087loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2087loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2087: lowered level
internal fun PlayerActivity.showV2087LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2087lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2087lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2087: maintained mode
internal fun PlayerActivity.showV2087MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087maintained
    FeaturePrefsStore.batch2081.v2087maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2087: managed mode
internal fun PlayerActivity.showV2087ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087managed
    FeaturePrefsStore.batch2081.v2087managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2087: manifested mode
internal fun PlayerActivity.showV2087ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087manifested
    FeaturePrefsStore.batch2081.v2087manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2087: manipulated mode
internal fun PlayerActivity.showV2087ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087manipulated
    FeaturePrefsStore.batch2081.v2087manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2087: manufactured mode
internal fun PlayerActivity.showV2087ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2087manufactured
    FeaturePrefsStore.batch2081.v2087manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2088: linked mode
internal fun PlayerActivity.showV2088LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088linked
    FeaturePrefsStore.batch2081.v2088linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2088: listed mode
internal fun PlayerActivity.showV2088ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088listed
    FeaturePrefsStore.batch2081.v2088listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2088: listened mode
internal fun PlayerActivity.showV2088ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088listened
    FeaturePrefsStore.batch2081.v2088listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2088: loaded mode
internal fun PlayerActivity.showV2088LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088loaded
    FeaturePrefsStore.batch2081.v2088loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2088: located mode
internal fun PlayerActivity.showV2088LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088located
    FeaturePrefsStore.batch2081.v2088located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2088: locked level
internal fun PlayerActivity.showV2088LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2088locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2088locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2088: logged level
internal fun PlayerActivity.showV2088LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2088logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2088logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2088: looked level
internal fun PlayerActivity.showV2088LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2088looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2088looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2088: loosened level
internal fun PlayerActivity.showV2088LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2088loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2088loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2088: lowered level
internal fun PlayerActivity.showV2088LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2088lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2088lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2088: maintained mode
internal fun PlayerActivity.showV2088MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088maintained
    FeaturePrefsStore.batch2081.v2088maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2088: managed mode
internal fun PlayerActivity.showV2088ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088managed
    FeaturePrefsStore.batch2081.v2088managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2088: manifested mode
internal fun PlayerActivity.showV2088ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088manifested
    FeaturePrefsStore.batch2081.v2088manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2088: manipulated mode
internal fun PlayerActivity.showV2088ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088manipulated
    FeaturePrefsStore.batch2081.v2088manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2088: manufactured mode
internal fun PlayerActivity.showV2088ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2088manufactured
    FeaturePrefsStore.batch2081.v2088manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2089: linked mode
internal fun PlayerActivity.showV2089LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089linked
    FeaturePrefsStore.batch2081.v2089linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2089: listed mode
internal fun PlayerActivity.showV2089ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089listed
    FeaturePrefsStore.batch2081.v2089listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2089: listened mode
internal fun PlayerActivity.showV2089ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089listened
    FeaturePrefsStore.batch2081.v2089listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2089: loaded mode
internal fun PlayerActivity.showV2089LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089loaded
    FeaturePrefsStore.batch2081.v2089loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2089: located mode
internal fun PlayerActivity.showV2089LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089located
    FeaturePrefsStore.batch2081.v2089located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2089: locked level
internal fun PlayerActivity.showV2089LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2089locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2089locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2089: logged level
internal fun PlayerActivity.showV2089LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2089logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2089logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2089: looked level
internal fun PlayerActivity.showV2089LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2089looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2089looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2089: loosened level
internal fun PlayerActivity.showV2089LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2089loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2089loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2089: lowered level
internal fun PlayerActivity.showV2089LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2089lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2089lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2089: maintained mode
internal fun PlayerActivity.showV2089MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089maintained
    FeaturePrefsStore.batch2081.v2089maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2089: managed mode
internal fun PlayerActivity.showV2089ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089managed
    FeaturePrefsStore.batch2081.v2089managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2089: manifested mode
internal fun PlayerActivity.showV2089ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089manifested
    FeaturePrefsStore.batch2081.v2089manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2089: manipulated mode
internal fun PlayerActivity.showV2089ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089manipulated
    FeaturePrefsStore.batch2081.v2089manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2089: manufactured mode
internal fun PlayerActivity.showV2089ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2089manufactured
    FeaturePrefsStore.batch2081.v2089manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2090: linked mode
internal fun PlayerActivity.showV2090LinkedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090linked
    FeaturePrefsStore.batch2081.v2090linked = !current
    AppToast.show(this, "linked: ${if (!current) "ON" else "OFF"}")
}

// v2090: listed mode
internal fun PlayerActivity.showV2090ListedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090listed
    FeaturePrefsStore.batch2081.v2090listed = !current
    AppToast.show(this, "listed: ${if (!current) "ON" else "OFF"}")
}

// v2090: listened mode
internal fun PlayerActivity.showV2090ListenedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090listened
    FeaturePrefsStore.batch2081.v2090listened = !current
    AppToast.show(this, "listened: ${if (!current) "ON" else "OFF"}")
}

// v2090: loaded mode
internal fun PlayerActivity.showV2090LoadedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090loaded
    FeaturePrefsStore.batch2081.v2090loaded = !current
    AppToast.show(this, "loaded: ${if (!current) "ON" else "OFF"}")
}

// v2090: located mode
internal fun PlayerActivity.showV2090LocatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090located
    FeaturePrefsStore.batch2081.v2090located = !current
    AppToast.show(this, "located: ${if (!current) "ON" else "OFF"}")
}

// v2090: locked level
internal fun PlayerActivity.showV2090LockedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2090locked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "locked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2090locked = value
        AppToast.show(this, "locked: $value")
    }
}

// v2090: logged level
internal fun PlayerActivity.showV2090LoggedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2090logged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "logged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2090logged = value
        AppToast.show(this, "logged: $value")
    }
}

// v2090: looked level
internal fun PlayerActivity.showV2090LookedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2090looked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "looked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2090looked = value
        AppToast.show(this, "looked: $value")
    }
}

// v2090: loosened level
internal fun PlayerActivity.showV2090LoosenedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2090loosened).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "loosened level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2090loosened = value
        AppToast.show(this, "loosened: $value")
    }
}

// v2090: lowered level
internal fun PlayerActivity.showV2090LoweredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2081.v2090lowered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lowered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2081.v2090lowered = value
        AppToast.show(this, "lowered: $value")
    }
}

// v2090: maintained mode
internal fun PlayerActivity.showV2090MaintainedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090maintained
    FeaturePrefsStore.batch2081.v2090maintained = !current
    AppToast.show(this, "maintained: ${if (!current) "ON" else "OFF"}")
}

// v2090: managed mode
internal fun PlayerActivity.showV2090ManagedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090managed
    FeaturePrefsStore.batch2081.v2090managed = !current
    AppToast.show(this, "managed: ${if (!current) "ON" else "OFF"}")
}

// v2090: manifested mode
internal fun PlayerActivity.showV2090ManifestedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090manifested
    FeaturePrefsStore.batch2081.v2090manifested = !current
    AppToast.show(this, "manifested: ${if (!current) "ON" else "OFF"}")
}

// v2090: manipulated mode
internal fun PlayerActivity.showV2090ManipulatedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090manipulated
    FeaturePrefsStore.batch2081.v2090manipulated = !current
    AppToast.show(this, "manipulated: ${if (!current) "ON" else "OFF"}")
}

// v2090: manufactured mode
internal fun PlayerActivity.showV2090ManufacturedToggle() {
    val current = FeaturePrefsStore.batch2081.v2090manufactured
    FeaturePrefsStore.batch2081.v2090manufactured = !current
    AppToast.show(this, "manufactured: ${if (!current) "ON" else "OFF"}")
}

// v2091: mapped mode
internal fun PlayerActivity.showV2091MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091mapped
    FeaturePrefsStore.batch2091.v2091mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2091: marked mode
internal fun PlayerActivity.showV2091MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091marked
    FeaturePrefsStore.batch2091.v2091marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2091: matched mode
internal fun PlayerActivity.showV2091MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091matched
    FeaturePrefsStore.batch2091.v2091matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2091: measured mode
internal fun PlayerActivity.showV2091MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2091measured
    FeaturePrefsStore.batch2091.v2091measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2091: mediated mode
internal fun PlayerActivity.showV2091MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091mediated
    FeaturePrefsStore.batch2091.v2091mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2091: merged level
internal fun PlayerActivity.showV2091MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2091merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2091merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2091: metered level
internal fun PlayerActivity.showV2091MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2091metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2091metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2091: migrated level
internal fun PlayerActivity.showV2091MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2091migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2091migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2091: minimized level
internal fun PlayerActivity.showV2091MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2091minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2091minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2091: missed level
internal fun PlayerActivity.showV2091MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2091missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2091missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2091: mixed mode
internal fun PlayerActivity.showV2091MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091mixed
    FeaturePrefsStore.batch2091.v2091mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2091: modeled mode
internal fun PlayerActivity.showV2091ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2091modeled
    FeaturePrefsStore.batch2091.v2091modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2091: modified mode
internal fun PlayerActivity.showV2091ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091modified
    FeaturePrefsStore.batch2091.v2091modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2091: monitored mode
internal fun PlayerActivity.showV2091MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2091monitored
    FeaturePrefsStore.batch2091.v2091monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2091: motivated mode
internal fun PlayerActivity.showV2091MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2091motivated
    FeaturePrefsStore.batch2091.v2091motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2092: mapped mode
internal fun PlayerActivity.showV2092MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092mapped
    FeaturePrefsStore.batch2091.v2092mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2092: marked mode
internal fun PlayerActivity.showV2092MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092marked
    FeaturePrefsStore.batch2091.v2092marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2092: matched mode
internal fun PlayerActivity.showV2092MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092matched
    FeaturePrefsStore.batch2091.v2092matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2092: measured mode
internal fun PlayerActivity.showV2092MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2092measured
    FeaturePrefsStore.batch2091.v2092measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2092: mediated mode
internal fun PlayerActivity.showV2092MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092mediated
    FeaturePrefsStore.batch2091.v2092mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2092: merged level
internal fun PlayerActivity.showV2092MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2092merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2092merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2092: metered level
internal fun PlayerActivity.showV2092MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2092metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2092metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2092: migrated level
internal fun PlayerActivity.showV2092MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2092migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2092migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2092: minimized level
internal fun PlayerActivity.showV2092MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2092minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2092minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2092: missed level
internal fun PlayerActivity.showV2092MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2092missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2092missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2092: mixed mode
internal fun PlayerActivity.showV2092MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092mixed
    FeaturePrefsStore.batch2091.v2092mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2092: modeled mode
internal fun PlayerActivity.showV2092ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2092modeled
    FeaturePrefsStore.batch2091.v2092modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2092: modified mode
internal fun PlayerActivity.showV2092ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092modified
    FeaturePrefsStore.batch2091.v2092modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2092: monitored mode
internal fun PlayerActivity.showV2092MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2092monitored
    FeaturePrefsStore.batch2091.v2092monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2092: motivated mode
internal fun PlayerActivity.showV2092MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2092motivated
    FeaturePrefsStore.batch2091.v2092motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2093: mapped mode
internal fun PlayerActivity.showV2093MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093mapped
    FeaturePrefsStore.batch2091.v2093mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2093: marked mode
internal fun PlayerActivity.showV2093MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093marked
    FeaturePrefsStore.batch2091.v2093marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2093: matched mode
internal fun PlayerActivity.showV2093MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093matched
    FeaturePrefsStore.batch2091.v2093matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2093: measured mode
internal fun PlayerActivity.showV2093MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2093measured
    FeaturePrefsStore.batch2091.v2093measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2093: mediated mode
internal fun PlayerActivity.showV2093MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093mediated
    FeaturePrefsStore.batch2091.v2093mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2093: merged level
internal fun PlayerActivity.showV2093MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2093merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2093merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2093: metered level
internal fun PlayerActivity.showV2093MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2093metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2093metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2093: migrated level
internal fun PlayerActivity.showV2093MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2093migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2093migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2093: minimized level
internal fun PlayerActivity.showV2093MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2093minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2093minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2093: missed level
internal fun PlayerActivity.showV2093MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2093missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2093missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2093: mixed mode
internal fun PlayerActivity.showV2093MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093mixed
    FeaturePrefsStore.batch2091.v2093mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2093: modeled mode
internal fun PlayerActivity.showV2093ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2093modeled
    FeaturePrefsStore.batch2091.v2093modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2093: modified mode
internal fun PlayerActivity.showV2093ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093modified
    FeaturePrefsStore.batch2091.v2093modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2093: monitored mode
internal fun PlayerActivity.showV2093MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2093monitored
    FeaturePrefsStore.batch2091.v2093monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2093: motivated mode
internal fun PlayerActivity.showV2093MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2093motivated
    FeaturePrefsStore.batch2091.v2093motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2094: mapped mode
internal fun PlayerActivity.showV2094MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094mapped
    FeaturePrefsStore.batch2091.v2094mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2094: marked mode
internal fun PlayerActivity.showV2094MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094marked
    FeaturePrefsStore.batch2091.v2094marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2094: matched mode
internal fun PlayerActivity.showV2094MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094matched
    FeaturePrefsStore.batch2091.v2094matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2094: measured mode
internal fun PlayerActivity.showV2094MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2094measured
    FeaturePrefsStore.batch2091.v2094measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2094: mediated mode
internal fun PlayerActivity.showV2094MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094mediated
    FeaturePrefsStore.batch2091.v2094mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2094: merged level
internal fun PlayerActivity.showV2094MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2094merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2094merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2094: metered level
internal fun PlayerActivity.showV2094MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2094metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2094metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2094: migrated level
internal fun PlayerActivity.showV2094MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2094migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2094migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2094: minimized level
internal fun PlayerActivity.showV2094MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2094minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2094minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2094: missed level
internal fun PlayerActivity.showV2094MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2094missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2094missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2094: mixed mode
internal fun PlayerActivity.showV2094MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094mixed
    FeaturePrefsStore.batch2091.v2094mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2094: modeled mode
internal fun PlayerActivity.showV2094ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2094modeled
    FeaturePrefsStore.batch2091.v2094modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2094: modified mode
internal fun PlayerActivity.showV2094ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094modified
    FeaturePrefsStore.batch2091.v2094modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2094: monitored mode
internal fun PlayerActivity.showV2094MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2094monitored
    FeaturePrefsStore.batch2091.v2094monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2094: motivated mode
internal fun PlayerActivity.showV2094MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2094motivated
    FeaturePrefsStore.batch2091.v2094motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2095: mapped mode
internal fun PlayerActivity.showV2095MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095mapped
    FeaturePrefsStore.batch2091.v2095mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2095: marked mode
internal fun PlayerActivity.showV2095MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095marked
    FeaturePrefsStore.batch2091.v2095marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2095: matched mode
internal fun PlayerActivity.showV2095MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095matched
    FeaturePrefsStore.batch2091.v2095matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2095: measured mode
internal fun PlayerActivity.showV2095MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2095measured
    FeaturePrefsStore.batch2091.v2095measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2095: mediated mode
internal fun PlayerActivity.showV2095MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095mediated
    FeaturePrefsStore.batch2091.v2095mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2095: merged level
internal fun PlayerActivity.showV2095MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2095merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2095merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2095: metered level
internal fun PlayerActivity.showV2095MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2095metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2095metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2095: migrated level
internal fun PlayerActivity.showV2095MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2095migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2095migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2095: minimized level
internal fun PlayerActivity.showV2095MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2095minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2095minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2095: missed level
internal fun PlayerActivity.showV2095MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2095missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2095missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2095: mixed mode
internal fun PlayerActivity.showV2095MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095mixed
    FeaturePrefsStore.batch2091.v2095mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2095: modeled mode
internal fun PlayerActivity.showV2095ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2095modeled
    FeaturePrefsStore.batch2091.v2095modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2095: modified mode
internal fun PlayerActivity.showV2095ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095modified
    FeaturePrefsStore.batch2091.v2095modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2095: monitored mode
internal fun PlayerActivity.showV2095MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2095monitored
    FeaturePrefsStore.batch2091.v2095monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2095: motivated mode
internal fun PlayerActivity.showV2095MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2095motivated
    FeaturePrefsStore.batch2091.v2095motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2096: mapped mode
internal fun PlayerActivity.showV2096MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096mapped
    FeaturePrefsStore.batch2091.v2096mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2096: marked mode
internal fun PlayerActivity.showV2096MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096marked
    FeaturePrefsStore.batch2091.v2096marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2096: matched mode
internal fun PlayerActivity.showV2096MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096matched
    FeaturePrefsStore.batch2091.v2096matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2096: measured mode
internal fun PlayerActivity.showV2096MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2096measured
    FeaturePrefsStore.batch2091.v2096measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2096: mediated mode
internal fun PlayerActivity.showV2096MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096mediated
    FeaturePrefsStore.batch2091.v2096mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2096: merged level
internal fun PlayerActivity.showV2096MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2096merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2096merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2096: metered level
internal fun PlayerActivity.showV2096MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2096metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2096metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2096: migrated level
internal fun PlayerActivity.showV2096MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2096migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2096migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2096: minimized level
internal fun PlayerActivity.showV2096MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2096minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2096minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2096: missed level
internal fun PlayerActivity.showV2096MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2096missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2096missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2096: mixed mode
internal fun PlayerActivity.showV2096MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096mixed
    FeaturePrefsStore.batch2091.v2096mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2096: modeled mode
internal fun PlayerActivity.showV2096ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2096modeled
    FeaturePrefsStore.batch2091.v2096modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2096: modified mode
internal fun PlayerActivity.showV2096ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096modified
    FeaturePrefsStore.batch2091.v2096modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2096: monitored mode
internal fun PlayerActivity.showV2096MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2096monitored
    FeaturePrefsStore.batch2091.v2096monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2096: motivated mode
internal fun PlayerActivity.showV2096MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2096motivated
    FeaturePrefsStore.batch2091.v2096motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2097: mapped mode
internal fun PlayerActivity.showV2097MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097mapped
    FeaturePrefsStore.batch2091.v2097mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2097: marked mode
internal fun PlayerActivity.showV2097MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097marked
    FeaturePrefsStore.batch2091.v2097marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2097: matched mode
internal fun PlayerActivity.showV2097MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097matched
    FeaturePrefsStore.batch2091.v2097matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2097: measured mode
internal fun PlayerActivity.showV2097MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2097measured
    FeaturePrefsStore.batch2091.v2097measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2097: mediated mode
internal fun PlayerActivity.showV2097MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097mediated
    FeaturePrefsStore.batch2091.v2097mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2097: merged level
internal fun PlayerActivity.showV2097MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2097merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2097merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2097: metered level
internal fun PlayerActivity.showV2097MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2097metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2097metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2097: migrated level
internal fun PlayerActivity.showV2097MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2097migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2097migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2097: minimized level
internal fun PlayerActivity.showV2097MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2097minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2097minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2097: missed level
internal fun PlayerActivity.showV2097MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2097missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2097missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2097: mixed mode
internal fun PlayerActivity.showV2097MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097mixed
    FeaturePrefsStore.batch2091.v2097mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2097: modeled mode
internal fun PlayerActivity.showV2097ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2097modeled
    FeaturePrefsStore.batch2091.v2097modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2097: modified mode
internal fun PlayerActivity.showV2097ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097modified
    FeaturePrefsStore.batch2091.v2097modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2097: monitored mode
internal fun PlayerActivity.showV2097MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2097monitored
    FeaturePrefsStore.batch2091.v2097monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2097: motivated mode
internal fun PlayerActivity.showV2097MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2097motivated
    FeaturePrefsStore.batch2091.v2097motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2098: mapped mode
internal fun PlayerActivity.showV2098MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098mapped
    FeaturePrefsStore.batch2091.v2098mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2098: marked mode
internal fun PlayerActivity.showV2098MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098marked
    FeaturePrefsStore.batch2091.v2098marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2098: matched mode
internal fun PlayerActivity.showV2098MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098matched
    FeaturePrefsStore.batch2091.v2098matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2098: measured mode
internal fun PlayerActivity.showV2098MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2098measured
    FeaturePrefsStore.batch2091.v2098measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2098: mediated mode
internal fun PlayerActivity.showV2098MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098mediated
    FeaturePrefsStore.batch2091.v2098mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2098: merged level
internal fun PlayerActivity.showV2098MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2098merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2098merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2098: metered level
internal fun PlayerActivity.showV2098MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2098metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2098metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2098: migrated level
internal fun PlayerActivity.showV2098MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2098migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2098migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2098: minimized level
internal fun PlayerActivity.showV2098MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2098minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2098minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2098: missed level
internal fun PlayerActivity.showV2098MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2098missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2098missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2098: mixed mode
internal fun PlayerActivity.showV2098MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098mixed
    FeaturePrefsStore.batch2091.v2098mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2098: modeled mode
internal fun PlayerActivity.showV2098ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2098modeled
    FeaturePrefsStore.batch2091.v2098modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2098: modified mode
internal fun PlayerActivity.showV2098ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098modified
    FeaturePrefsStore.batch2091.v2098modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2098: monitored mode
internal fun PlayerActivity.showV2098MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2098monitored
    FeaturePrefsStore.batch2091.v2098monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2098: motivated mode
internal fun PlayerActivity.showV2098MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2098motivated
    FeaturePrefsStore.batch2091.v2098motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2099: mapped mode
internal fun PlayerActivity.showV2099MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099mapped
    FeaturePrefsStore.batch2091.v2099mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2099: marked mode
internal fun PlayerActivity.showV2099MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099marked
    FeaturePrefsStore.batch2091.v2099marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2099: matched mode
internal fun PlayerActivity.showV2099MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099matched
    FeaturePrefsStore.batch2091.v2099matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2099: measured mode
internal fun PlayerActivity.showV2099MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2099measured
    FeaturePrefsStore.batch2091.v2099measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2099: mediated mode
internal fun PlayerActivity.showV2099MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099mediated
    FeaturePrefsStore.batch2091.v2099mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2099: merged level
internal fun PlayerActivity.showV2099MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2099merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2099merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2099: metered level
internal fun PlayerActivity.showV2099MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2099metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2099metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2099: migrated level
internal fun PlayerActivity.showV2099MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2099migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2099migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2099: minimized level
internal fun PlayerActivity.showV2099MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2099minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2099minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2099: missed level
internal fun PlayerActivity.showV2099MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2099missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2099missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2099: mixed mode
internal fun PlayerActivity.showV2099MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099mixed
    FeaturePrefsStore.batch2091.v2099mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2099: modeled mode
internal fun PlayerActivity.showV2099ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2099modeled
    FeaturePrefsStore.batch2091.v2099modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2099: modified mode
internal fun PlayerActivity.showV2099ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099modified
    FeaturePrefsStore.batch2091.v2099modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2099: monitored mode
internal fun PlayerActivity.showV2099MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2099monitored
    FeaturePrefsStore.batch2091.v2099monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2099: motivated mode
internal fun PlayerActivity.showV2099MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2099motivated
    FeaturePrefsStore.batch2091.v2099motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2100: mapped mode
internal fun PlayerActivity.showV2100MappedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100mapped
    FeaturePrefsStore.batch2091.v2100mapped = !current
    AppToast.show(this, "mapped: ${if (!current) "ON" else "OFF"}")
}

// v2100: marked mode
internal fun PlayerActivity.showV2100MarkedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100marked
    FeaturePrefsStore.batch2091.v2100marked = !current
    AppToast.show(this, "marked: ${if (!current) "ON" else "OFF"}")
}

// v2100: matched mode
internal fun PlayerActivity.showV2100MatchedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100matched
    FeaturePrefsStore.batch2091.v2100matched = !current
    AppToast.show(this, "matched: ${if (!current) "ON" else "OFF"}")
}

// v2100: measured mode
internal fun PlayerActivity.showV2100MeasuredToggle() {
    val current = FeaturePrefsStore.batch2091.v2100measured
    FeaturePrefsStore.batch2091.v2100measured = !current
    AppToast.show(this, "measured: ${if (!current) "ON" else "OFF"}")
}

// v2100: mediated mode
internal fun PlayerActivity.showV2100MediatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100mediated
    FeaturePrefsStore.batch2091.v2100mediated = !current
    AppToast.show(this, "mediated: ${if (!current) "ON" else "OFF"}")
}

// v2100: merged level
internal fun PlayerActivity.showV2100MergedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2100merged).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "merged level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2100merged = value
        AppToast.show(this, "merged: $value")
    }
}

// v2100: metered level
internal fun PlayerActivity.showV2100MeteredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2100metered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "metered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2100metered = value
        AppToast.show(this, "metered: $value")
    }
}

// v2100: migrated level
internal fun PlayerActivity.showV2100MigratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2100migrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "migrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2100migrated = value
        AppToast.show(this, "migrated: $value")
    }
}

// v2100: minimized level
internal fun PlayerActivity.showV2100MinimizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2100minimized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "minimized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2100minimized = value
        AppToast.show(this, "minimized: $value")
    }
}

// v2100: missed level
internal fun PlayerActivity.showV2100MissedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2091.v2100missed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "missed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2091.v2100missed = value
        AppToast.show(this, "missed: $value")
    }
}

// v2100: mixed mode
internal fun PlayerActivity.showV2100MixedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100mixed
    FeaturePrefsStore.batch2091.v2100mixed = !current
    AppToast.show(this, "mixed: ${if (!current) "ON" else "OFF"}")
}

// v2100: modeled mode
internal fun PlayerActivity.showV2100ModeledToggle() {
    val current = FeaturePrefsStore.batch2091.v2100modeled
    FeaturePrefsStore.batch2091.v2100modeled = !current
    AppToast.show(this, "modeled: ${if (!current) "ON" else "OFF"}")
}

// v2100: modified mode
internal fun PlayerActivity.showV2100ModifiedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100modified
    FeaturePrefsStore.batch2091.v2100modified = !current
    AppToast.show(this, "modified: ${if (!current) "ON" else "OFF"}")
}

// v2100: monitored mode
internal fun PlayerActivity.showV2100MonitoredToggle() {
    val current = FeaturePrefsStore.batch2091.v2100monitored
    FeaturePrefsStore.batch2091.v2100monitored = !current
    AppToast.show(this, "monitored: ${if (!current) "ON" else "OFF"}")
}

// v2100: motivated mode
internal fun PlayerActivity.showV2100MotivatedToggle() {
    val current = FeaturePrefsStore.batch2091.v2100motivated
    FeaturePrefsStore.batch2091.v2100motivated = !current
    AppToast.show(this, "motivated: ${if (!current) "ON" else "OFF"}")
}

// v2101: mounted mode
internal fun PlayerActivity.showV2101MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101mounted
    FeaturePrefsStore.batch2101.v2101mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2101: moved mode
internal fun PlayerActivity.showV2101MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101moved
    FeaturePrefsStore.batch2101.v2101moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2101: multiplied mode
internal fun PlayerActivity.showV2101MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101multiplied
    FeaturePrefsStore.batch2101.v2101multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2101: narrowed mode
internal fun PlayerActivity.showV2101NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101narrowed
    FeaturePrefsStore.batch2101.v2101narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2101: navigated mode
internal fun PlayerActivity.showV2101NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101navigated
    FeaturePrefsStore.batch2101.v2101navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2101: needed level
internal fun PlayerActivity.showV2101NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2101needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2101needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2101: negotiated level
internal fun PlayerActivity.showV2101NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2101negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2101negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2101: neutralized level
internal fun PlayerActivity.showV2101NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2101neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2101neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2101: normalized level
internal fun PlayerActivity.showV2101NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2101normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2101normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2101: noted level
internal fun PlayerActivity.showV2101NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2101noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2101noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2101: noticed mode
internal fun PlayerActivity.showV2101NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101noticed
    FeaturePrefsStore.batch2101.v2101noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2101: notified mode
internal fun PlayerActivity.showV2101NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101notified
    FeaturePrefsStore.batch2101.v2101notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2101: nourished mode
internal fun PlayerActivity.showV2101NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101nourished
    FeaturePrefsStore.batch2101.v2101nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2101: numbered mode
internal fun PlayerActivity.showV2101NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101numbered
    FeaturePrefsStore.batch2101.v2101numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2101: obeyed mode
internal fun PlayerActivity.showV2101ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2101obeyed
    FeaturePrefsStore.batch2101.v2101obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2102: mounted mode
internal fun PlayerActivity.showV2102MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102mounted
    FeaturePrefsStore.batch2101.v2102mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2102: moved mode
internal fun PlayerActivity.showV2102MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102moved
    FeaturePrefsStore.batch2101.v2102moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2102: multiplied mode
internal fun PlayerActivity.showV2102MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102multiplied
    FeaturePrefsStore.batch2101.v2102multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2102: narrowed mode
internal fun PlayerActivity.showV2102NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102narrowed
    FeaturePrefsStore.batch2101.v2102narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2102: navigated mode
internal fun PlayerActivity.showV2102NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102navigated
    FeaturePrefsStore.batch2101.v2102navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2102: needed level
internal fun PlayerActivity.showV2102NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2102needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2102needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2102: negotiated level
internal fun PlayerActivity.showV2102NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2102negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2102negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2102: neutralized level
internal fun PlayerActivity.showV2102NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2102neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2102neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2102: normalized level
internal fun PlayerActivity.showV2102NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2102normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2102normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2102: noted level
internal fun PlayerActivity.showV2102NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2102noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2102noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2102: noticed mode
internal fun PlayerActivity.showV2102NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102noticed
    FeaturePrefsStore.batch2101.v2102noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2102: notified mode
internal fun PlayerActivity.showV2102NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102notified
    FeaturePrefsStore.batch2101.v2102notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2102: nourished mode
internal fun PlayerActivity.showV2102NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102nourished
    FeaturePrefsStore.batch2101.v2102nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2102: numbered mode
internal fun PlayerActivity.showV2102NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102numbered
    FeaturePrefsStore.batch2101.v2102numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2102: obeyed mode
internal fun PlayerActivity.showV2102ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2102obeyed
    FeaturePrefsStore.batch2101.v2102obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2103: mounted mode
internal fun PlayerActivity.showV2103MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103mounted
    FeaturePrefsStore.batch2101.v2103mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2103: moved mode
internal fun PlayerActivity.showV2103MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103moved
    FeaturePrefsStore.batch2101.v2103moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2103: multiplied mode
internal fun PlayerActivity.showV2103MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103multiplied
    FeaturePrefsStore.batch2101.v2103multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2103: narrowed mode
internal fun PlayerActivity.showV2103NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103narrowed
    FeaturePrefsStore.batch2101.v2103narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2103: navigated mode
internal fun PlayerActivity.showV2103NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103navigated
    FeaturePrefsStore.batch2101.v2103navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2103: needed level
internal fun PlayerActivity.showV2103NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2103needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2103needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2103: negotiated level
internal fun PlayerActivity.showV2103NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2103negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2103negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2103: neutralized level
internal fun PlayerActivity.showV2103NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2103neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2103neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2103: normalized level
internal fun PlayerActivity.showV2103NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2103normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2103normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2103: noted level
internal fun PlayerActivity.showV2103NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2103noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2103noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2103: noticed mode
internal fun PlayerActivity.showV2103NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103noticed
    FeaturePrefsStore.batch2101.v2103noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2103: notified mode
internal fun PlayerActivity.showV2103NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103notified
    FeaturePrefsStore.batch2101.v2103notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2103: nourished mode
internal fun PlayerActivity.showV2103NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103nourished
    FeaturePrefsStore.batch2101.v2103nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2103: numbered mode
internal fun PlayerActivity.showV2103NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103numbered
    FeaturePrefsStore.batch2101.v2103numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2103: obeyed mode
internal fun PlayerActivity.showV2103ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2103obeyed
    FeaturePrefsStore.batch2101.v2103obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2104: mounted mode
internal fun PlayerActivity.showV2104MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104mounted
    FeaturePrefsStore.batch2101.v2104mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2104: moved mode
internal fun PlayerActivity.showV2104MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104moved
    FeaturePrefsStore.batch2101.v2104moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2104: multiplied mode
internal fun PlayerActivity.showV2104MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104multiplied
    FeaturePrefsStore.batch2101.v2104multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2104: narrowed mode
internal fun PlayerActivity.showV2104NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104narrowed
    FeaturePrefsStore.batch2101.v2104narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2104: navigated mode
internal fun PlayerActivity.showV2104NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104navigated
    FeaturePrefsStore.batch2101.v2104navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2104: needed level
internal fun PlayerActivity.showV2104NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2104needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2104needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2104: negotiated level
internal fun PlayerActivity.showV2104NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2104negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2104negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2104: neutralized level
internal fun PlayerActivity.showV2104NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2104neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2104neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2104: normalized level
internal fun PlayerActivity.showV2104NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2104normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2104normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2104: noted level
internal fun PlayerActivity.showV2104NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2104noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2104noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2104: noticed mode
internal fun PlayerActivity.showV2104NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104noticed
    FeaturePrefsStore.batch2101.v2104noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2104: notified mode
internal fun PlayerActivity.showV2104NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104notified
    FeaturePrefsStore.batch2101.v2104notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2104: nourished mode
internal fun PlayerActivity.showV2104NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104nourished
    FeaturePrefsStore.batch2101.v2104nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2104: numbered mode
internal fun PlayerActivity.showV2104NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104numbered
    FeaturePrefsStore.batch2101.v2104numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2104: obeyed mode
internal fun PlayerActivity.showV2104ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2104obeyed
    FeaturePrefsStore.batch2101.v2104obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2105: mounted mode
internal fun PlayerActivity.showV2105MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105mounted
    FeaturePrefsStore.batch2101.v2105mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2105: moved mode
internal fun PlayerActivity.showV2105MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105moved
    FeaturePrefsStore.batch2101.v2105moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2105: multiplied mode
internal fun PlayerActivity.showV2105MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105multiplied
    FeaturePrefsStore.batch2101.v2105multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2105: narrowed mode
internal fun PlayerActivity.showV2105NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105narrowed
    FeaturePrefsStore.batch2101.v2105narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2105: navigated mode
internal fun PlayerActivity.showV2105NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105navigated
    FeaturePrefsStore.batch2101.v2105navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2105: needed level
internal fun PlayerActivity.showV2105NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2105needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2105needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2105: negotiated level
internal fun PlayerActivity.showV2105NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2105negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2105negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2105: neutralized level
internal fun PlayerActivity.showV2105NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2105neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2105neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2105: normalized level
internal fun PlayerActivity.showV2105NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2105normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2105normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2105: noted level
internal fun PlayerActivity.showV2105NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2105noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2105noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2105: noticed mode
internal fun PlayerActivity.showV2105NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105noticed
    FeaturePrefsStore.batch2101.v2105noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2105: notified mode
internal fun PlayerActivity.showV2105NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105notified
    FeaturePrefsStore.batch2101.v2105notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2105: nourished mode
internal fun PlayerActivity.showV2105NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105nourished
    FeaturePrefsStore.batch2101.v2105nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2105: numbered mode
internal fun PlayerActivity.showV2105NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105numbered
    FeaturePrefsStore.batch2101.v2105numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2105: obeyed mode
internal fun PlayerActivity.showV2105ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2105obeyed
    FeaturePrefsStore.batch2101.v2105obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2106: mounted mode
internal fun PlayerActivity.showV2106MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106mounted
    FeaturePrefsStore.batch2101.v2106mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2106: moved mode
internal fun PlayerActivity.showV2106MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106moved
    FeaturePrefsStore.batch2101.v2106moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2106: multiplied mode
internal fun PlayerActivity.showV2106MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106multiplied
    FeaturePrefsStore.batch2101.v2106multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2106: narrowed mode
internal fun PlayerActivity.showV2106NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106narrowed
    FeaturePrefsStore.batch2101.v2106narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2106: navigated mode
internal fun PlayerActivity.showV2106NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106navigated
    FeaturePrefsStore.batch2101.v2106navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2106: needed level
internal fun PlayerActivity.showV2106NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2106needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2106needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2106: negotiated level
internal fun PlayerActivity.showV2106NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2106negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2106negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2106: neutralized level
internal fun PlayerActivity.showV2106NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2106neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2106neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2106: normalized level
internal fun PlayerActivity.showV2106NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2106normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2106normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2106: noted level
internal fun PlayerActivity.showV2106NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2106noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2106noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2106: noticed mode
internal fun PlayerActivity.showV2106NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106noticed
    FeaturePrefsStore.batch2101.v2106noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2106: notified mode
internal fun PlayerActivity.showV2106NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106notified
    FeaturePrefsStore.batch2101.v2106notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2106: nourished mode
internal fun PlayerActivity.showV2106NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106nourished
    FeaturePrefsStore.batch2101.v2106nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2106: numbered mode
internal fun PlayerActivity.showV2106NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106numbered
    FeaturePrefsStore.batch2101.v2106numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2106: obeyed mode
internal fun PlayerActivity.showV2106ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2106obeyed
    FeaturePrefsStore.batch2101.v2106obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2107: mounted mode
internal fun PlayerActivity.showV2107MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107mounted
    FeaturePrefsStore.batch2101.v2107mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2107: moved mode
internal fun PlayerActivity.showV2107MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107moved
    FeaturePrefsStore.batch2101.v2107moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2107: multiplied mode
internal fun PlayerActivity.showV2107MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107multiplied
    FeaturePrefsStore.batch2101.v2107multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2107: narrowed mode
internal fun PlayerActivity.showV2107NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107narrowed
    FeaturePrefsStore.batch2101.v2107narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2107: navigated mode
internal fun PlayerActivity.showV2107NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107navigated
    FeaturePrefsStore.batch2101.v2107navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2107: needed level
internal fun PlayerActivity.showV2107NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2107needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2107needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2107: negotiated level
internal fun PlayerActivity.showV2107NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2107negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2107negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2107: neutralized level
internal fun PlayerActivity.showV2107NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2107neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2107neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2107: normalized level
internal fun PlayerActivity.showV2107NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2107normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2107normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2107: noted level
internal fun PlayerActivity.showV2107NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2107noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2107noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2107: noticed mode
internal fun PlayerActivity.showV2107NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107noticed
    FeaturePrefsStore.batch2101.v2107noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2107: notified mode
internal fun PlayerActivity.showV2107NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107notified
    FeaturePrefsStore.batch2101.v2107notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2107: nourished mode
internal fun PlayerActivity.showV2107NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107nourished
    FeaturePrefsStore.batch2101.v2107nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2107: numbered mode
internal fun PlayerActivity.showV2107NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107numbered
    FeaturePrefsStore.batch2101.v2107numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2107: obeyed mode
internal fun PlayerActivity.showV2107ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2107obeyed
    FeaturePrefsStore.batch2101.v2107obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2108: mounted mode
internal fun PlayerActivity.showV2108MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108mounted
    FeaturePrefsStore.batch2101.v2108mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2108: moved mode
internal fun PlayerActivity.showV2108MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108moved
    FeaturePrefsStore.batch2101.v2108moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2108: multiplied mode
internal fun PlayerActivity.showV2108MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108multiplied
    FeaturePrefsStore.batch2101.v2108multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2108: narrowed mode
internal fun PlayerActivity.showV2108NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108narrowed
    FeaturePrefsStore.batch2101.v2108narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2108: navigated mode
internal fun PlayerActivity.showV2108NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108navigated
    FeaturePrefsStore.batch2101.v2108navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2108: needed level
internal fun PlayerActivity.showV2108NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2108needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2108needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2108: negotiated level
internal fun PlayerActivity.showV2108NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2108negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2108negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2108: neutralized level
internal fun PlayerActivity.showV2108NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2108neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2108neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2108: normalized level
internal fun PlayerActivity.showV2108NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2108normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2108normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2108: noted level
internal fun PlayerActivity.showV2108NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2108noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2108noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2108: noticed mode
internal fun PlayerActivity.showV2108NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108noticed
    FeaturePrefsStore.batch2101.v2108noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2108: notified mode
internal fun PlayerActivity.showV2108NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108notified
    FeaturePrefsStore.batch2101.v2108notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2108: nourished mode
internal fun PlayerActivity.showV2108NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108nourished
    FeaturePrefsStore.batch2101.v2108nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2108: numbered mode
internal fun PlayerActivity.showV2108NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108numbered
    FeaturePrefsStore.batch2101.v2108numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2108: obeyed mode
internal fun PlayerActivity.showV2108ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2108obeyed
    FeaturePrefsStore.batch2101.v2108obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2109: mounted mode
internal fun PlayerActivity.showV2109MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109mounted
    FeaturePrefsStore.batch2101.v2109mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2109: moved mode
internal fun PlayerActivity.showV2109MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109moved
    FeaturePrefsStore.batch2101.v2109moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2109: multiplied mode
internal fun PlayerActivity.showV2109MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109multiplied
    FeaturePrefsStore.batch2101.v2109multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2109: narrowed mode
internal fun PlayerActivity.showV2109NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109narrowed
    FeaturePrefsStore.batch2101.v2109narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2109: navigated mode
internal fun PlayerActivity.showV2109NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109navigated
    FeaturePrefsStore.batch2101.v2109navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2109: needed level
internal fun PlayerActivity.showV2109NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2109needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2109needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2109: negotiated level
internal fun PlayerActivity.showV2109NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2109negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2109negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2109: neutralized level
internal fun PlayerActivity.showV2109NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2109neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2109neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2109: normalized level
internal fun PlayerActivity.showV2109NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2109normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2109normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2109: noted level
internal fun PlayerActivity.showV2109NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2109noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2109noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2109: noticed mode
internal fun PlayerActivity.showV2109NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109noticed
    FeaturePrefsStore.batch2101.v2109noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2109: notified mode
internal fun PlayerActivity.showV2109NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109notified
    FeaturePrefsStore.batch2101.v2109notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2109: nourished mode
internal fun PlayerActivity.showV2109NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109nourished
    FeaturePrefsStore.batch2101.v2109nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2109: numbered mode
internal fun PlayerActivity.showV2109NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109numbered
    FeaturePrefsStore.batch2101.v2109numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2109: obeyed mode
internal fun PlayerActivity.showV2109ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2109obeyed
    FeaturePrefsStore.batch2101.v2109obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}

// v2110: mounted mode
internal fun PlayerActivity.showV2110MountedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110mounted
    FeaturePrefsStore.batch2101.v2110mounted = !current
    AppToast.show(this, "mounted: ${if (!current) "ON" else "OFF"}")
}

// v2110: moved mode
internal fun PlayerActivity.showV2110MovedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110moved
    FeaturePrefsStore.batch2101.v2110moved = !current
    AppToast.show(this, "moved: ${if (!current) "ON" else "OFF"}")
}

// v2110: multiplied mode
internal fun PlayerActivity.showV2110MultipliedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110multiplied
    FeaturePrefsStore.batch2101.v2110multiplied = !current
    AppToast.show(this, "multiplied: ${if (!current) "ON" else "OFF"}")
}

// v2110: narrowed mode
internal fun PlayerActivity.showV2110NarrowedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110narrowed
    FeaturePrefsStore.batch2101.v2110narrowed = !current
    AppToast.show(this, "narrowed: ${if (!current) "ON" else "OFF"}")
}

// v2110: navigated mode
internal fun PlayerActivity.showV2110NavigatedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110navigated
    FeaturePrefsStore.batch2101.v2110navigated = !current
    AppToast.show(this, "navigated: ${if (!current) "ON" else "OFF"}")
}

// v2110: needed level
internal fun PlayerActivity.showV2110NeededDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2110needed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "needed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2110needed = value
        AppToast.show(this, "needed: $value")
    }
}

// v2110: negotiated level
internal fun PlayerActivity.showV2110NegotiatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2110negotiated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "negotiated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2110negotiated = value
        AppToast.show(this, "negotiated: $value")
    }
}

// v2110: neutralized level
internal fun PlayerActivity.showV2110NeutralizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2110neutralized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "neutralized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2110neutralized = value
        AppToast.show(this, "neutralized: $value")
    }
}

// v2110: normalized level
internal fun PlayerActivity.showV2110NormalizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2110normalized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normalized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2110normalized = value
        AppToast.show(this, "normalized: $value")
    }
}

// v2110: noted level
internal fun PlayerActivity.showV2110NotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2101.v2110noted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "noted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2101.v2110noted = value
        AppToast.show(this, "noted: $value")
    }
}

// v2110: noticed mode
internal fun PlayerActivity.showV2110NoticedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110noticed
    FeaturePrefsStore.batch2101.v2110noticed = !current
    AppToast.show(this, "noticed: ${if (!current) "ON" else "OFF"}")
}

// v2110: notified mode
internal fun PlayerActivity.showV2110NotifiedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110notified
    FeaturePrefsStore.batch2101.v2110notified = !current
    AppToast.show(this, "notified: ${if (!current) "ON" else "OFF"}")
}

// v2110: nourished mode
internal fun PlayerActivity.showV2110NourishedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110nourished
    FeaturePrefsStore.batch2101.v2110nourished = !current
    AppToast.show(this, "nourished: ${if (!current) "ON" else "OFF"}")
}

// v2110: numbered mode
internal fun PlayerActivity.showV2110NumberedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110numbered
    FeaturePrefsStore.batch2101.v2110numbered = !current
    AppToast.show(this, "numbered: ${if (!current) "ON" else "OFF"}")
}

// v2110: obeyed mode
internal fun PlayerActivity.showV2110ObeyedToggle() {
    val current = FeaturePrefsStore.batch2101.v2110obeyed
    FeaturePrefsStore.batch2101.v2110obeyed = !current
    AppToast.show(this, "obeyed: ${if (!current) "ON" else "OFF"}")
}
