package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v289: Danmaku Bottom Max Count386
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

// v289: Subtitle Bg Border393
internal fun PlayerActivity.showV289SubtitleBgBorder393Toggle() {
    val current = BiliClient.prefs.v289subtitleBgBorder393
    BiliClient.prefs.v289subtitleBgBorder393 = !current
    AppToast.show(this, "Subtitle Bg Border393: ${if (!current) "ON" else "OFF"}")
}

// v290: Audio EQ Custom290
internal fun PlayerActivity.showV290AudioEQCustom290Toggle() {
    val current = BiliClient.prefs.v290audioEQCustom290
    BiliClient.prefs.v290audioEQCustom290 = !current
    AppToast.show(this, "Audio EQ Custom290: ${if (!current) "ON" else "OFF"}")
}

// v290: Danmaku Bottom Max Count387
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

// v290: Subtitle Bg Border394
internal fun PlayerActivity.showV290SubtitleBgBorder394Toggle() {
    val current = BiliClient.prefs.v290subtitleBgBorder394
    BiliClient.prefs.v290subtitleBgBorder394 = !current
    AppToast.show(this, "Subtitle Bg Border394: ${if (!current) "ON" else "OFF"}")
}

// v290: Gesture Shake Action290
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

// v290: Cast Audio Volume290
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

// v290: Playlist Auto Skip Outro290
internal fun PlayerActivity.showV290PlaylistAutoSkipOutro290Toggle() {
    val current = BiliClient.prefs.v290playlistAutoSkipOutro290
    BiliClient.prefs.v290playlistAutoSkipOutro290 = !current
    AppToast.show(this, "Playlist Auto Skip Outro290: ${if (!current) "ON" else "OFF"}")
}

// v290: Cache Download Speed291
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

// v290: Progress Bar Thumb Border290
internal fun PlayerActivity.showV290ProgressBarThumbBorder290Toggle() {
    val current = BiliClient.prefs.v290progressBarThumbBorder290
    BiliClient.prefs.v290progressBarThumbBorder290 = !current
    AppToast.show(this, "Progress Bar Thumb Border290: ${if (!current) "ON" else "OFF"}")
}

// v290: Volume Boost Peak290
internal fun PlayerActivity.showV290VolumeBoostPeak290Toggle() {
    val current = BiliClient.prefs.v290volumeBoostPeak290
    BiliClient.prefs.v290volumeBoostPeak290 = !current
    AppToast.show(this, "Volume Boost Peak290: ${if (!current) "ON" else "OFF"}")
}

// v290: History Bookmark Export290
internal fun PlayerActivity.showV290HistoryBookmarkExport290Toggle() {
    val current = BiliClient.prefs.v290historyBookmarkExport290
    BiliClient.prefs.v290historyBookmarkExport290 = !current
    AppToast.show(this, "History Bookmark Export290: ${if (!current) "ON" else "OFF"}")
}

// v290: Playback Chapter Sync290
internal fun PlayerActivity.showV290PlaybackChapterSync290Toggle() {
    val current = BiliClient.prefs.v290playbackChapterSync290
    BiliClient.prefs.v290playbackChapterSync290 = !current
    AppToast.show(this, "Playback Chapter Sync290: ${if (!current) "ON" else "OFF"}")
}

// v290: Screenshot Save Path290
internal fun PlayerActivity.showV290ScreenshotSavePath290Toggle() {
    val current = BiliClient.prefs.v290screenshotSavePath290
    BiliClient.prefs.v290screenshotSavePath290 = !current
    AppToast.show(this, "Screenshot Save Path290: ${if (!current) "ON" else "OFF"}")
}

// v290: Video Color Space290
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

// v290: Danmaku Bottom Max Count388
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

// v290: Subtitle Bg Border395
internal fun PlayerActivity.showV290SubtitleBgBorder395Toggle() {
    val current = BiliClient.prefs.v290subtitleBgBorder395
    BiliClient.prefs.v290subtitleBgBorder395 = !current
    AppToast.show(this, "Subtitle Bg Border395: ${if (!current) "ON" else "OFF"}")
}

// v291: Audio EQ Custom291
internal fun PlayerActivity.showV291AudioEQCustom291Toggle() {
    val current = BiliClient.prefs.v291audioEQCustom291
    BiliClient.prefs.v291audioEQCustom291 = !current
    AppToast.show(this, "Audio EQ Custom291: ${if (!current) "ON" else "OFF"}")
}

// v291: Danmaku Bottom Max Count389
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

// v291: Subtitle Bg Border396
internal fun PlayerActivity.showV291SubtitleBgBorder396Toggle() {
    val current = BiliClient.prefs.v291subtitleBgBorder396
    BiliClient.prefs.v291subtitleBgBorder396 = !current
    AppToast.show(this, "Subtitle Bg Border396: ${if (!current) "ON" else "OFF"}")
}

// v291: Gesture Shake Action291
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

// v291: Cast Audio Volume291
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

// v291: Playlist Auto Skip Outro291
internal fun PlayerActivity.showV291PlaylistAutoSkipOutro291Toggle() {
    val current = BiliClient.prefs.v291playlistAutoSkipOutro291
    BiliClient.prefs.v291playlistAutoSkipOutro291 = !current
    AppToast.show(this, "Playlist Auto Skip Outro291: ${if (!current) "ON" else "OFF"}")
}

// v291: Cache Download Speed292
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

// v291: Progress Bar Thumb Border291
internal fun PlayerActivity.showV291ProgressBarThumbBorder291Toggle() {
    val current = BiliClient.prefs.v291progressBarThumbBorder291
    BiliClient.prefs.v291progressBarThumbBorder291 = !current
    AppToast.show(this, "Progress Bar Thumb Border291: ${if (!current) "ON" else "OFF"}")
}

// v291: Volume Boost Peak291
internal fun PlayerActivity.showV291VolumeBoostPeak291Toggle() {
    val current = BiliClient.prefs.v291volumeBoostPeak291
    BiliClient.prefs.v291volumeBoostPeak291 = !current
    AppToast.show(this, "Volume Boost Peak291: ${if (!current) "ON" else "OFF"}")
}

// v291: History Bookmark Export291
internal fun PlayerActivity.showV291HistoryBookmarkExport291Toggle() {
    val current = BiliClient.prefs.v291historyBookmarkExport291
    BiliClient.prefs.v291historyBookmarkExport291 = !current
    AppToast.show(this, "History Bookmark Export291: ${if (!current) "ON" else "OFF"}")
}

// v291: Playback Chapter Sync291
internal fun PlayerActivity.showV291PlaybackChapterSync291Toggle() {
    val current = BiliClient.prefs.v291playbackChapterSync291
    BiliClient.prefs.v291playbackChapterSync291 = !current
    AppToast.show(this, "Playback Chapter Sync291: ${if (!current) "ON" else "OFF"}")
}

// v291: Screenshot Save Path291
internal fun PlayerActivity.showV291ScreenshotSavePath291Toggle() {
    val current = BiliClient.prefs.v291screenshotSavePath291
    BiliClient.prefs.v291screenshotSavePath291 = !current
    AppToast.show(this, "Screenshot Save Path291: ${if (!current) "ON" else "OFF"}")
}

// v291: Video Color Space291
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

// v291: Danmaku Bottom Max Count390
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

// v291: Subtitle Bg Border397
internal fun PlayerActivity.showV291SubtitleBgBorder397Toggle() {
    val current = BiliClient.prefs.v291subtitleBgBorder397
    BiliClient.prefs.v291subtitleBgBorder397 = !current
    AppToast.show(this, "Subtitle Bg Border397: ${if (!current) "ON" else "OFF"}")
}

// v292: Audio EQ Custom292
internal fun PlayerActivity.showV292AudioEQCustom292Toggle() {
    val current = BiliClient.prefs.v292audioEQCustom292
    BiliClient.prefs.v292audioEQCustom292 = !current
    AppToast.show(this, "Audio EQ Custom292: ${if (!current) "ON" else "OFF"}")
}

// v292: Danmaku Bottom Max Count391
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

// v292: Subtitle Bg Border398
internal fun PlayerActivity.showV292SubtitleBgBorder398Toggle() {
    val current = BiliClient.prefs.v292subtitleBgBorder398
    BiliClient.prefs.v292subtitleBgBorder398 = !current
    AppToast.show(this, "Subtitle Bg Border398: ${if (!current) "ON" else "OFF"}")
}

// v292: Gesture Shake Action292
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

// v292: Cast Audio Volume292
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

// v292: Playlist Auto Skip Outro292
internal fun PlayerActivity.showV292PlaylistAutoSkipOutro292Toggle() {
    val current = BiliClient.prefs.v292playlistAutoSkipOutro292
    BiliClient.prefs.v292playlistAutoSkipOutro292 = !current
    AppToast.show(this, "Playlist Auto Skip Outro292: ${if (!current) "ON" else "OFF"}")
}

// v292: Cache Download Speed293
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

// v292: Progress Bar Thumb Border292
internal fun PlayerActivity.showV292ProgressBarThumbBorder292Toggle() {
    val current = BiliClient.prefs.v292progressBarThumbBorder292
    BiliClient.prefs.v292progressBarThumbBorder292 = !current
    AppToast.show(this, "Progress Bar Thumb Border292: ${if (!current) "ON" else "OFF"}")
}

// v292: Volume Boost Peak292
internal fun PlayerActivity.showV292VolumeBoostPeak292Toggle() {
    val current = BiliClient.prefs.v292volumeBoostPeak292
    BiliClient.prefs.v292volumeBoostPeak292 = !current
    AppToast.show(this, "Volume Boost Peak292: ${if (!current) "ON" else "OFF"}")
}

// v292: History Bookmark Export292
internal fun PlayerActivity.showV292HistoryBookmarkExport292Toggle() {
    val current = BiliClient.prefs.v292historyBookmarkExport292
    BiliClient.prefs.v292historyBookmarkExport292 = !current
    AppToast.show(this, "History Bookmark Export292: ${if (!current) "ON" else "OFF"}")
}

// v292: Playback Chapter Sync292
internal fun PlayerActivity.showV292PlaybackChapterSync292Toggle() {
    val current = BiliClient.prefs.v292playbackChapterSync292
    BiliClient.prefs.v292playbackChapterSync292 = !current
    AppToast.show(this, "Playback Chapter Sync292: ${if (!current) "ON" else "OFF"}")
}

// v292: Screenshot Save Path292
internal fun PlayerActivity.showV292ScreenshotSavePath292Toggle() {
    val current = BiliClient.prefs.v292screenshotSavePath292
    BiliClient.prefs.v292screenshotSavePath292 = !current
    AppToast.show(this, "Screenshot Save Path292: ${if (!current) "ON" else "OFF"}")
}

// v292: Video Color Space292
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

// v292: Danmaku Bottom Max Count392
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

// v292: Subtitle Bg Border399
internal fun PlayerActivity.showV292SubtitleBgBorder399Toggle() {
    val current = BiliClient.prefs.v292subtitleBgBorder399
    BiliClient.prefs.v292subtitleBgBorder399 = !current
    AppToast.show(this, "Subtitle Bg Border399: ${if (!current) "ON" else "OFF"}")
}

// v293: Audio EQ Custom293
internal fun PlayerActivity.showV293AudioEQCustom293Toggle() {
    val current = BiliClient.prefs.v293audioEQCustom293
    BiliClient.prefs.v293audioEQCustom293 = !current
    AppToast.show(this, "Audio EQ Custom293: ${if (!current) "ON" else "OFF"}")
}

// v293: Danmaku Bottom Max Count393
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

// v293: Subtitle Bg Border400
internal fun PlayerActivity.showV293SubtitleBgBorder400Toggle() {
    val current = BiliClient.prefs.v293subtitleBgBorder400
    BiliClient.prefs.v293subtitleBgBorder400 = !current
    AppToast.show(this, "Subtitle Bg Border400: ${if (!current) "ON" else "OFF"}")
}

// v293: Gesture Shake Action293
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

// v293: Cast Audio Volume293
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

// v293: Playlist Auto Skip Outro293
internal fun PlayerActivity.showV293PlaylistAutoSkipOutro293Toggle() {
    val current = BiliClient.prefs.v293playlistAutoSkipOutro293
    BiliClient.prefs.v293playlistAutoSkipOutro293 = !current
    AppToast.show(this, "Playlist Auto Skip Outro293: ${if (!current) "ON" else "OFF"}")
}

// v293: Cache Download Speed294
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

// v293: Progress Bar Thumb Border293
internal fun PlayerActivity.showV293ProgressBarThumbBorder293Toggle() {
    val current = BiliClient.prefs.v293progressBarThumbBorder293
    BiliClient.prefs.v293progressBarThumbBorder293 = !current
    AppToast.show(this, "Progress Bar Thumb Border293: ${if (!current) "ON" else "OFF"}")
}

// v293: Volume Boost Peak293
internal fun PlayerActivity.showV293VolumeBoostPeak293Toggle() {
    val current = BiliClient.prefs.v293volumeBoostPeak293
    BiliClient.prefs.v293volumeBoostPeak293 = !current
    AppToast.show(this, "Volume Boost Peak293: ${if (!current) "ON" else "OFF"}")
}

// v293: History Bookmark Export293
internal fun PlayerActivity.showV293HistoryBookmarkExport293Toggle() {
    val current = BiliClient.prefs.v293historyBookmarkExport293
    BiliClient.prefs.v293historyBookmarkExport293 = !current
    AppToast.show(this, "History Bookmark Export293: ${if (!current) "ON" else "OFF"}")
}

// v293: Playback Chapter Sync293
internal fun PlayerActivity.showV293PlaybackChapterSync293Toggle() {
    val current = BiliClient.prefs.v293playbackChapterSync293
    BiliClient.prefs.v293playbackChapterSync293 = !current
    AppToast.show(this, "Playback Chapter Sync293: ${if (!current) "ON" else "OFF"}")
}

// v293: Screenshot Save Path293
internal fun PlayerActivity.showV293ScreenshotSavePath293Toggle() {
    val current = BiliClient.prefs.v293screenshotSavePath293
    BiliClient.prefs.v293screenshotSavePath293 = !current
    AppToast.show(this, "Screenshot Save Path293: ${if (!current) "ON" else "OFF"}")
}

// v293: Video Color Space293
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

// v293: Danmaku Bottom Max Count394
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

// v293: Subtitle Bg Border401
internal fun PlayerActivity.showV293SubtitleBgBorder401Toggle() {
    val current = BiliClient.prefs.v293subtitleBgBorder401
    BiliClient.prefs.v293subtitleBgBorder401 = !current
    AppToast.show(this, "Subtitle Bg Border401: ${if (!current) "ON" else "OFF"}")
}

// v294: Audio EQ Custom294
internal fun PlayerActivity.showV294AudioEQCustom294Toggle() {
    val current = BiliClient.prefs.v294audioEQCustom294
    BiliClient.prefs.v294audioEQCustom294 = !current
    AppToast.show(this, "Audio EQ Custom294: ${if (!current) "ON" else "OFF"}")
}

// v294: Danmaku Bottom Max Count395
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

// v294: Subtitle Bg Border402
internal fun PlayerActivity.showV294SubtitleBgBorder402Toggle() {
    val current = BiliClient.prefs.v294subtitleBgBorder402
    BiliClient.prefs.v294subtitleBgBorder402 = !current
    AppToast.show(this, "Subtitle Bg Border402: ${if (!current) "ON" else "OFF"}")
}

// v294: Gesture Shake Action294
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

// v294: Cast Audio Volume294
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

// v294: Playlist Auto Skip Outro294
internal fun PlayerActivity.showV294PlaylistAutoSkipOutro294Toggle() {
    val current = BiliClient.prefs.v294playlistAutoSkipOutro294
    BiliClient.prefs.v294playlistAutoSkipOutro294 = !current
    AppToast.show(this, "Playlist Auto Skip Outro294: ${if (!current) "ON" else "OFF"}")
}

// v294: Cache Download Speed295
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

// v294: Progress Bar Thumb Border294
internal fun PlayerActivity.showV294ProgressBarThumbBorder294Toggle() {
    val current = BiliClient.prefs.v294progressBarThumbBorder294
    BiliClient.prefs.v294progressBarThumbBorder294 = !current
    AppToast.show(this, "Progress Bar Thumb Border294: ${if (!current) "ON" else "OFF"}")
}

// v294: Volume Boost Peak294
internal fun PlayerActivity.showV294VolumeBoostPeak294Toggle() {
    val current = BiliClient.prefs.v294volumeBoostPeak294
    BiliClient.prefs.v294volumeBoostPeak294 = !current
    AppToast.show(this, "Volume Boost Peak294: ${if (!current) "ON" else "OFF"}")
}

// v294: History Bookmark Export294
internal fun PlayerActivity.showV294HistoryBookmarkExport294Toggle() {
    val current = BiliClient.prefs.v294historyBookmarkExport294
    BiliClient.prefs.v294historyBookmarkExport294 = !current
    AppToast.show(this, "History Bookmark Export294: ${if (!current) "ON" else "OFF"}")
}

// v294: Playback Chapter Sync294
internal fun PlayerActivity.showV294PlaybackChapterSync294Toggle() {
    val current = BiliClient.prefs.v294playbackChapterSync294
    BiliClient.prefs.v294playbackChapterSync294 = !current
    AppToast.show(this, "Playback Chapter Sync294: ${if (!current) "ON" else "OFF"}")
}

// v294: Screenshot Save Path294
internal fun PlayerActivity.showV294ScreenshotSavePath294Toggle() {
    val current = BiliClient.prefs.v294screenshotSavePath294
    BiliClient.prefs.v294screenshotSavePath294 = !current
    AppToast.show(this, "Screenshot Save Path294: ${if (!current) "ON" else "OFF"}")
}

// v294: Video Color Space294
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

// v294: Danmaku Bottom Max Count396
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

// v294: Subtitle Bg Border403
internal fun PlayerActivity.showV294SubtitleBgBorder403Toggle() {
    val current = BiliClient.prefs.v294subtitleBgBorder403
    BiliClient.prefs.v294subtitleBgBorder403 = !current
    AppToast.show(this, "Subtitle Bg Border403: ${if (!current) "ON" else "OFF"}")
}

// v295: Audio EQ Custom295
internal fun PlayerActivity.showV295AudioEQCustom295Toggle() {
    val current = BiliClient.prefs.v295audioEQCustom295
    BiliClient.prefs.v295audioEQCustom295 = !current
    AppToast.show(this, "Audio EQ Custom295: ${if (!current) "ON" else "OFF"}")
}

// v295: Danmaku Bottom Max Count397
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

// v295: Subtitle Bg Border404
internal fun PlayerActivity.showV295SubtitleBgBorder404Toggle() {
    val current = BiliClient.prefs.v295subtitleBgBorder404
    BiliClient.prefs.v295subtitleBgBorder404 = !current
    AppToast.show(this, "Subtitle Bg Border404: ${if (!current) "ON" else "OFF"}")
}

// v295: Gesture Shake Action295
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

// v295: Cast Audio Volume295
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

// v295: Playlist Auto Skip Outro295
internal fun PlayerActivity.showV295PlaylistAutoSkipOutro295Toggle() {
    val current = BiliClient.prefs.v295playlistAutoSkipOutro295
    BiliClient.prefs.v295playlistAutoSkipOutro295 = !current
    AppToast.show(this, "Playlist Auto Skip Outro295: ${if (!current) "ON" else "OFF"}")
}

// v295: Cache Download Speed296
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

// v295: Progress Bar Thumb Border295
internal fun PlayerActivity.showV295ProgressBarThumbBorder295Toggle() {
    val current = BiliClient.prefs.v295progressBarThumbBorder295
    BiliClient.prefs.v295progressBarThumbBorder295 = !current
    AppToast.show(this, "Progress Bar Thumb Border295: ${if (!current) "ON" else "OFF"}")
}

// v295: Volume Boost Peak295
internal fun PlayerActivity.showV295VolumeBoostPeak295Toggle() {
    val current = BiliClient.prefs.v295volumeBoostPeak295
    BiliClient.prefs.v295volumeBoostPeak295 = !current
    AppToast.show(this, "Volume Boost Peak295: ${if (!current) "ON" else "OFF"}")
}

// v295: History Bookmark Export295
internal fun PlayerActivity.showV295HistoryBookmarkExport295Toggle() {
    val current = BiliClient.prefs.v295historyBookmarkExport295
    BiliClient.prefs.v295historyBookmarkExport295 = !current
    AppToast.show(this, "History Bookmark Export295: ${if (!current) "ON" else "OFF"}")
}

// v295: Playback Chapter Sync295
internal fun PlayerActivity.showV295PlaybackChapterSync295Toggle() {
    val current = BiliClient.prefs.v295playbackChapterSync295
    BiliClient.prefs.v295playbackChapterSync295 = !current
    AppToast.show(this, "Playback Chapter Sync295: ${if (!current) "ON" else "OFF"}")
}

// v295: Screenshot Save Path295
internal fun PlayerActivity.showV295ScreenshotSavePath295Toggle() {
    val current = BiliClient.prefs.v295screenshotSavePath295
    BiliClient.prefs.v295screenshotSavePath295 = !current
    AppToast.show(this, "Screenshot Save Path295: ${if (!current) "ON" else "OFF"}")
}

// v295: Video Color Space295
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

// v295: Danmaku Bottom Max Count398
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

// v295: Subtitle Bg Border405
internal fun PlayerActivity.showV295SubtitleBgBorder405Toggle() {
    val current = BiliClient.prefs.v295subtitleBgBorder405
    BiliClient.prefs.v295subtitleBgBorder405 = !current
    AppToast.show(this, "Subtitle Bg Border405: ${if (!current) "ON" else "OFF"}")
}

// v296: Audio EQ Custom296
internal fun PlayerActivity.showV296AudioEQCustom296Toggle() {
    val current = BiliClient.prefs.v296audioEQCustom296
    BiliClient.prefs.v296audioEQCustom296 = !current
    AppToast.show(this, "Audio EQ Custom296: ${if (!current) "ON" else "OFF"}")
}

// v296: Danmaku Bottom Max Count399
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

// v296: Subtitle Bg Border406
internal fun PlayerActivity.showV296SubtitleBgBorder406Toggle() {
    val current = BiliClient.prefs.v296subtitleBgBorder406
    BiliClient.prefs.v296subtitleBgBorder406 = !current
    AppToast.show(this, "Subtitle Bg Border406: ${if (!current) "ON" else "OFF"}")
}

// v296: Gesture Shake Action296
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

// v296: Cast Audio Volume296
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

// v296: Playlist Auto Skip Outro296
internal fun PlayerActivity.showV296PlaylistAutoSkipOutro296Toggle() {
    val current = BiliClient.prefs.v296playlistAutoSkipOutro296
    BiliClient.prefs.v296playlistAutoSkipOutro296 = !current
    AppToast.show(this, "Playlist Auto Skip Outro296: ${if (!current) "ON" else "OFF"}")
}

// v296: Cache Download Speed297
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

// v296: Progress Bar Thumb Border296
internal fun PlayerActivity.showV296ProgressBarThumbBorder296Toggle() {
    val current = BiliClient.prefs.v296progressBarThumbBorder296
    BiliClient.prefs.v296progressBarThumbBorder296 = !current
    AppToast.show(this, "Progress Bar Thumb Border296: ${if (!current) "ON" else "OFF"}")
}

// v296: Volume Boost Peak296
internal fun PlayerActivity.showV296VolumeBoostPeak296Toggle() {
    val current = BiliClient.prefs.v296volumeBoostPeak296
    BiliClient.prefs.v296volumeBoostPeak296 = !current
    AppToast.show(this, "Volume Boost Peak296: ${if (!current) "ON" else "OFF"}")
}

// v296: History Bookmark Export296
internal fun PlayerActivity.showV296HistoryBookmarkExport296Toggle() {
    val current = BiliClient.prefs.v296historyBookmarkExport296
    BiliClient.prefs.v296historyBookmarkExport296 = !current
    AppToast.show(this, "History Bookmark Export296: ${if (!current) "ON" else "OFF"}")
}

// v296: Playback Chapter Sync296
internal fun PlayerActivity.showV296PlaybackChapterSync296Toggle() {
    val current = BiliClient.prefs.v296playbackChapterSync296
    BiliClient.prefs.v296playbackChapterSync296 = !current
    AppToast.show(this, "Playback Chapter Sync296: ${if (!current) "ON" else "OFF"}")
}

// v296: Screenshot Save Path296
internal fun PlayerActivity.showV296ScreenshotSavePath296Toggle() {
    val current = BiliClient.prefs.v296screenshotSavePath296
    BiliClient.prefs.v296screenshotSavePath296 = !current
    AppToast.show(this, "Screenshot Save Path296: ${if (!current) "ON" else "OFF"}")
}

// v296: Video Color Space296
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

// v296: Danmaku Bottom Max Count400
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

// v296: Subtitle Bg Border407
internal fun PlayerActivity.showV296SubtitleBgBorder407Toggle() {
    val current = BiliClient.prefs.v296subtitleBgBorder407
    BiliClient.prefs.v296subtitleBgBorder407 = !current
    AppToast.show(this, "Subtitle Bg Border407: ${if (!current) "ON" else "OFF"}")
}

// v297: Audio EQ Custom297
internal fun PlayerActivity.showV297AudioEQCustom297Toggle() {
    val current = BiliClient.prefs.v297audioEQCustom297
    BiliClient.prefs.v297audioEQCustom297 = !current
    AppToast.show(this, "Audio EQ Custom297: ${if (!current) "ON" else "OFF"}")
}

// v297: Danmaku Bottom Max Count401
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

// v297: Subtitle Bg Border408
internal fun PlayerActivity.showV297SubtitleBgBorder408Toggle() {
    val current = BiliClient.prefs.v297subtitleBgBorder408
    BiliClient.prefs.v297subtitleBgBorder408 = !current
    AppToast.show(this, "Subtitle Bg Border408: ${if (!current) "ON" else "OFF"}")
}

// v297: Gesture Shake Action297
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

// v297: Cast Audio Volume297
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

// v297: Playlist Auto Skip Outro297
internal fun PlayerActivity.showV297PlaylistAutoSkipOutro297Toggle() {
    val current = BiliClient.prefs.v297playlistAutoSkipOutro297
    BiliClient.prefs.v297playlistAutoSkipOutro297 = !current
    AppToast.show(this, "Playlist Auto Skip Outro297: ${if (!current) "ON" else "OFF"}")
}

// v297: Cache Download Speed298
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

// v297: Progress Bar Thumb Border297
internal fun PlayerActivity.showV297ProgressBarThumbBorder297Toggle() {
    val current = BiliClient.prefs.v297progressBarThumbBorder297
    BiliClient.prefs.v297progressBarThumbBorder297 = !current
    AppToast.show(this, "Progress Bar Thumb Border297: ${if (!current) "ON" else "OFF"}")
}

// v297: Volume Boost Peak297
internal fun PlayerActivity.showV297VolumeBoostPeak297Toggle() {
    val current = BiliClient.prefs.v297volumeBoostPeak297
    BiliClient.prefs.v297volumeBoostPeak297 = !current
    AppToast.show(this, "Volume Boost Peak297: ${if (!current) "ON" else "OFF"}")
}

// v297: History Bookmark Export297
internal fun PlayerActivity.showV297HistoryBookmarkExport297Toggle() {
    val current = BiliClient.prefs.v297historyBookmarkExport297
    BiliClient.prefs.v297historyBookmarkExport297 = !current
    AppToast.show(this, "History Bookmark Export297: ${if (!current) "ON" else "OFF"}")
}

// v297: Playback Chapter Sync297
internal fun PlayerActivity.showV297PlaybackChapterSync297Toggle() {
    val current = BiliClient.prefs.v297playbackChapterSync297
    BiliClient.prefs.v297playbackChapterSync297 = !current
    AppToast.show(this, "Playback Chapter Sync297: ${if (!current) "ON" else "OFF"}")
}

// v297: Screenshot Save Path297
internal fun PlayerActivity.showV297ScreenshotSavePath297Toggle() {
    val current = BiliClient.prefs.v297screenshotSavePath297
    BiliClient.prefs.v297screenshotSavePath297 = !current
    AppToast.show(this, "Screenshot Save Path297: ${if (!current) "ON" else "OFF"}")
}

// v297: Video Color Space297
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

// v297: Danmaku Bottom Max Count402
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

// v297: Subtitle Bg Border409
internal fun PlayerActivity.showV297SubtitleBgBorder409Toggle() {
    val current = BiliClient.prefs.v297subtitleBgBorder409
    BiliClient.prefs.v297subtitleBgBorder409 = !current
    AppToast.show(this, "Subtitle Bg Border409: ${if (!current) "ON" else "OFF"}")
}

// v298: Audio EQ Custom298
internal fun PlayerActivity.showV298AudioEQCustom298Toggle() {
    val current = BiliClient.prefs.v298audioEQCustom298
    BiliClient.prefs.v298audioEQCustom298 = !current
    AppToast.show(this, "Audio EQ Custom298: ${if (!current) "ON" else "OFF"}")
}

// v298: Danmaku Bottom Max Count403
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

// v298: Subtitle Bg Border410
internal fun PlayerActivity.showV298SubtitleBgBorder410Toggle() {
    val current = BiliClient.prefs.v298subtitleBgBorder410
    BiliClient.prefs.v298subtitleBgBorder410 = !current
    AppToast.show(this, "Subtitle Bg Border410: ${if (!current) "ON" else "OFF"}")
}

// v298: Gesture Shake Action298
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

// v298: Cast Audio Volume298
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

// v298: Playlist Auto Skip Outro298
internal fun PlayerActivity.showV298PlaylistAutoSkipOutro298Toggle() {
    val current = BiliClient.prefs.v298playlistAutoSkipOutro298
    BiliClient.prefs.v298playlistAutoSkipOutro298 = !current
    AppToast.show(this, "Playlist Auto Skip Outro298: ${if (!current) "ON" else "OFF"}")
}

// v298: Cache Download Speed299
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

// v298: Progress Bar Thumb Border298
internal fun PlayerActivity.showV298ProgressBarThumbBorder298Toggle() {
    val current = BiliClient.prefs.v298progressBarThumbBorder298
    BiliClient.prefs.v298progressBarThumbBorder298 = !current
    AppToast.show(this, "Progress Bar Thumb Border298: ${if (!current) "ON" else "OFF"}")
}

// v298: Volume Boost Peak298
internal fun PlayerActivity.showV298VolumeBoostPeak298Toggle() {
    val current = BiliClient.prefs.v298volumeBoostPeak298
    BiliClient.prefs.v298volumeBoostPeak298 = !current
    AppToast.show(this, "Volume Boost Peak298: ${if (!current) "ON" else "OFF"}")
}

// v298: History Bookmark Export298
internal fun PlayerActivity.showV298HistoryBookmarkExport298Toggle() {
    val current = BiliClient.prefs.v298historyBookmarkExport298
    BiliClient.prefs.v298historyBookmarkExport298 = !current
    AppToast.show(this, "History Bookmark Export298: ${if (!current) "ON" else "OFF"}")
}

// v298: Playback Chapter Sync298
internal fun PlayerActivity.showV298PlaybackChapterSync298Toggle() {
    val current = BiliClient.prefs.v298playbackChapterSync298
    BiliClient.prefs.v298playbackChapterSync298 = !current
    AppToast.show(this, "Playback Chapter Sync298: ${if (!current) "ON" else "OFF"}")
}

// v298: Screenshot Save Path298
internal fun PlayerActivity.showV298ScreenshotSavePath298Toggle() {
    val current = BiliClient.prefs.v298screenshotSavePath298
    BiliClient.prefs.v298screenshotSavePath298 = !current
    AppToast.show(this, "Screenshot Save Path298: ${if (!current) "ON" else "OFF"}")
}

// v298: Video Color Space298
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

// v298: Danmaku Bottom Max Count404
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

// v298: Subtitle Bg Border411
internal fun PlayerActivity.showV298SubtitleBgBorder411Toggle() {
    val current = BiliClient.prefs.v298subtitleBgBorder411
    BiliClient.prefs.v298subtitleBgBorder411 = !current
    AppToast.show(this, "Subtitle Bg Border411: ${if (!current) "ON" else "OFF"}")
}

// v299: Audio EQ Custom299
internal fun PlayerActivity.showV299AudioEQCustom299Toggle() {
    val current = BiliClient.prefs.v299audioEQCustom299
    BiliClient.prefs.v299audioEQCustom299 = !current
    AppToast.show(this, "Audio EQ Custom299: ${if (!current) "ON" else "OFF"}")
}

// v299: Danmaku Bottom Max Count405
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

// v299: Subtitle Bg Border412
internal fun PlayerActivity.showV299SubtitleBgBorder412Toggle() {
    val current = BiliClient.prefs.v299subtitleBgBorder412
    BiliClient.prefs.v299subtitleBgBorder412 = !current
    AppToast.show(this, "Subtitle Bg Border412: ${if (!current) "ON" else "OFF"}")
}

// v299: Gesture Shake Action299
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

// v299: Cast Audio Volume299
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

// v299: Playlist Auto Skip Outro299
internal fun PlayerActivity.showV299PlaylistAutoSkipOutro299Toggle() {
    val current = BiliClient.prefs.v299playlistAutoSkipOutro299
    BiliClient.prefs.v299playlistAutoSkipOutro299 = !current
    AppToast.show(this, "Playlist Auto Skip Outro299: ${if (!current) "ON" else "OFF"}")
}

// v299: Cache Download Speed300
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

// v299: Progress Bar Thumb Border299
internal fun PlayerActivity.showV299ProgressBarThumbBorder299Toggle() {
    val current = BiliClient.prefs.v299progressBarThumbBorder299
    BiliClient.prefs.v299progressBarThumbBorder299 = !current
    AppToast.show(this, "Progress Bar Thumb Border299: ${if (!current) "ON" else "OFF"}")
}

// v299: Volume Boost Peak299
internal fun PlayerActivity.showV299VolumeBoostPeak299Toggle() {
    val current = BiliClient.prefs.v299volumeBoostPeak299
    BiliClient.prefs.v299volumeBoostPeak299 = !current
    AppToast.show(this, "Volume Boost Peak299: ${if (!current) "ON" else "OFF"}")
}

// v299: History Bookmark Export299
internal fun PlayerActivity.showV299HistoryBookmarkExport299Toggle() {
    val current = BiliClient.prefs.v299historyBookmarkExport299
    BiliClient.prefs.v299historyBookmarkExport299 = !current
    AppToast.show(this, "History Bookmark Export299: ${if (!current) "ON" else "OFF"}")
}

// v299: Playback Chapter Sync299
internal fun PlayerActivity.showV299PlaybackChapterSync299Toggle() {
    val current = BiliClient.prefs.v299playbackChapterSync299
    BiliClient.prefs.v299playbackChapterSync299 = !current
    AppToast.show(this, "Playback Chapter Sync299: ${if (!current) "ON" else "OFF"}")
}

// v299: Screenshot Save Path299
internal fun PlayerActivity.showV299ScreenshotSavePath299Toggle() {
    val current = BiliClient.prefs.v299screenshotSavePath299
    BiliClient.prefs.v299screenshotSavePath299 = !current
    AppToast.show(this, "Screenshot Save Path299: ${if (!current) "ON" else "OFF"}")
}

// v299: Video Color Space299
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

// v299: Danmaku Bottom Max Count406
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

// v299: Subtitle Bg Border413
internal fun PlayerActivity.showV299SubtitleBgBorder413Toggle() {
    val current = BiliClient.prefs.v299subtitleBgBorder413
    BiliClient.prefs.v299subtitleBgBorder413 = !current
    AppToast.show(this, "Subtitle Bg Border413: ${if (!current) "ON" else "OFF"}")
}

// v300: Audio EQ Custom300
internal fun PlayerActivity.showV300AudioEQCustom300Toggle() {
    val current = BiliClient.prefs.v300audioEQCustom300
    BiliClient.prefs.v300audioEQCustom300 = !current
    AppToast.show(this, "Audio EQ Custom300: ${if (!current) "ON" else "OFF"}")
}

// v300: Danmaku Bottom Max Count407
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

// v300: Subtitle Bg Border414
internal fun PlayerActivity.showV300SubtitleBgBorder414Toggle() {
    val current = BiliClient.prefs.v300subtitleBgBorder414
    BiliClient.prefs.v300subtitleBgBorder414 = !current
    AppToast.show(this, "Subtitle Bg Border414: ${if (!current) "ON" else "OFF"}")
}

// v300: Gesture Shake Action300
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

// v300: Cast Audio Volume300
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

// v300: Playlist Auto Skip Outro300
internal fun PlayerActivity.showV300PlaylistAutoSkipOutro300Toggle() {
    val current = BiliClient.prefs.v300playlistAutoSkipOutro300
    BiliClient.prefs.v300playlistAutoSkipOutro300 = !current
    AppToast.show(this, "Playlist Auto Skip Outro300: ${if (!current) "ON" else "OFF"}")
}

// v300: Cache Download Speed301
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

// v300: Progress Bar Thumb Border300
internal fun PlayerActivity.showV300ProgressBarThumbBorder300Toggle() {
    val current = BiliClient.prefs.v300progressBarThumbBorder300
    BiliClient.prefs.v300progressBarThumbBorder300 = !current
    AppToast.show(this, "Progress Bar Thumb Border300: ${if (!current) "ON" else "OFF"}")
}

// v300: Volume Boost Peak300
internal fun PlayerActivity.showV300VolumeBoostPeak300Toggle() {
    val current = BiliClient.prefs.v300volumeBoostPeak300
    BiliClient.prefs.v300volumeBoostPeak300 = !current
    AppToast.show(this, "Volume Boost Peak300: ${if (!current) "ON" else "OFF"}")
}

// v300: History Bookmark Export300
internal fun PlayerActivity.showV300HistoryBookmarkExport300Toggle() {
    val current = BiliClient.prefs.v300historyBookmarkExport300
    BiliClient.prefs.v300historyBookmarkExport300 = !current
    AppToast.show(this, "History Bookmark Export300: ${if (!current) "ON" else "OFF"}")
}

// v300: Playback Chapter Sync300
internal fun PlayerActivity.showV300PlaybackChapterSync300Toggle() {
    val current = BiliClient.prefs.v300playbackChapterSync300
    BiliClient.prefs.v300playbackChapterSync300 = !current
    AppToast.show(this, "Playback Chapter Sync300: ${if (!current) "ON" else "OFF"}")
}

// v300: Screenshot Save Path300
internal fun PlayerActivity.showV300ScreenshotSavePath300Toggle() {
    val current = BiliClient.prefs.v300screenshotSavePath300
    BiliClient.prefs.v300screenshotSavePath300 = !current
    AppToast.show(this, "Screenshot Save Path300: ${if (!current) "ON" else "OFF"}")
}

// v300: Video Color Space300
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

// v300: Danmaku Bottom Max Count408
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

// v300: Subtitle Bg Border415
internal fun PlayerActivity.showV300SubtitleBgBorder415Toggle() {
    val current = BiliClient.prefs.v300subtitleBgBorder415
    BiliClient.prefs.v300subtitleBgBorder415 = !current
    AppToast.show(this, "Subtitle Bg Border415: ${if (!current) "ON" else "OFF"}")
}

// v301: Audio EQ Custom301
internal fun PlayerActivity.showV301AudioEQCustom301Toggle() {
    val current = BiliClient.prefs.v301audioEQCustom301
    BiliClient.prefs.v301audioEQCustom301 = !current
    AppToast.show(this, "Audio EQ Custom301: ${if (!current) "ON" else "OFF"}")
}

// v301: Danmaku Bottom Max Count409
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

// v301: Subtitle Bg Border416
internal fun PlayerActivity.showV301SubtitleBgBorder416Toggle() {
    val current = BiliClient.prefs.v301subtitleBgBorder416
    BiliClient.prefs.v301subtitleBgBorder416 = !current
    AppToast.show(this, "Subtitle Bg Border416: ${if (!current) "ON" else "OFF"}")
}

// v301: Gesture Shake Action301
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

// v301: Cast Audio Volume301
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

// v301: Playlist Auto Skip Outro301
internal fun PlayerActivity.showV301PlaylistAutoSkipOutro301Toggle() {
    val current = BiliClient.prefs.v301playlistAutoSkipOutro301
    BiliClient.prefs.v301playlistAutoSkipOutro301 = !current
    AppToast.show(this, "Playlist Auto Skip Outro301: ${if (!current) "ON" else "OFF"}")
}

// v301: Cache Download Speed302
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

// v301: Progress Bar Thumb Border301
internal fun PlayerActivity.showV301ProgressBarThumbBorder301Toggle() {
    val current = BiliClient.prefs.v301progressBarThumbBorder301
    BiliClient.prefs.v301progressBarThumbBorder301 = !current
    AppToast.show(this, "Progress Bar Thumb Border301: ${if (!current) "ON" else "OFF"}")
}

// v301: Volume Boost Peak301
internal fun PlayerActivity.showV301VolumeBoostPeak301Toggle() {
    val current = BiliClient.prefs.v301volumeBoostPeak301
    BiliClient.prefs.v301volumeBoostPeak301 = !current
    AppToast.show(this, "Volume Boost Peak301: ${if (!current) "ON" else "OFF"}")
}

// v301: History Bookmark Export301
internal fun PlayerActivity.showV301HistoryBookmarkExport301Toggle() {
    val current = BiliClient.prefs.v301historyBookmarkExport301
    BiliClient.prefs.v301historyBookmarkExport301 = !current
    AppToast.show(this, "History Bookmark Export301: ${if (!current) "ON" else "OFF"}")
}

// v301: Playback Chapter Sync301
internal fun PlayerActivity.showV301PlaybackChapterSync301Toggle() {
    val current = BiliClient.prefs.v301playbackChapterSync301
    BiliClient.prefs.v301playbackChapterSync301 = !current
    AppToast.show(this, "Playback Chapter Sync301: ${if (!current) "ON" else "OFF"}")
}

// v301: Screenshot Save Path301
internal fun PlayerActivity.showV301ScreenshotSavePath301Toggle() {
    val current = BiliClient.prefs.v301screenshotSavePath301
    BiliClient.prefs.v301screenshotSavePath301 = !current
    AppToast.show(this, "Screenshot Save Path301: ${if (!current) "ON" else "OFF"}")
}

// v301: Video Color Space301
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

// v301: Danmaku Bottom Max Count410
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

// v301: Subtitle Bg Border417
internal fun PlayerActivity.showV301SubtitleBgBorder417Toggle() {
    val current = BiliClient.prefs.v301subtitleBgBorder417
    BiliClient.prefs.v301subtitleBgBorder417 = !current
    AppToast.show(this, "Subtitle Bg Border417: ${if (!current) "ON" else "OFF"}")
}

// v302: Audio EQ Custom302
internal fun PlayerActivity.showV302AudioEQCustom302Toggle() {
    val current = BiliClient.prefs.v302audioEQCustom302
    BiliClient.prefs.v302audioEQCustom302 = !current
    AppToast.show(this, "Audio EQ Custom302: ${if (!current) "ON" else "OFF"}")
}

// v302: Danmaku Bottom Max Count411
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

// v302: Subtitle Bg Border418
internal fun PlayerActivity.showV302SubtitleBgBorder418Toggle() {
    val current = BiliClient.prefs.v302subtitleBgBorder418
    BiliClient.prefs.v302subtitleBgBorder418 = !current
    AppToast.show(this, "Subtitle Bg Border418: ${if (!current) "ON" else "OFF"}")
}

// v302: Gesture Shake Action302
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

// v302: Cast Audio Volume302
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

// v302: Playlist Auto Skip Outro302
internal fun PlayerActivity.showV302PlaylistAutoSkipOutro302Toggle() {
    val current = BiliClient.prefs.v302playlistAutoSkipOutro302
    BiliClient.prefs.v302playlistAutoSkipOutro302 = !current
    AppToast.show(this, "Playlist Auto Skip Outro302: ${if (!current) "ON" else "OFF"}")
}

// v302: Cache Download Speed303
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

// v302: Progress Bar Thumb Border302
internal fun PlayerActivity.showV302ProgressBarThumbBorder302Toggle() {
    val current = BiliClient.prefs.v302progressBarThumbBorder302
    BiliClient.prefs.v302progressBarThumbBorder302 = !current
    AppToast.show(this, "Progress Bar Thumb Border302: ${if (!current) "ON" else "OFF"}")
}

// v302: Volume Boost Peak302
internal fun PlayerActivity.showV302VolumeBoostPeak302Toggle() {
    val current = BiliClient.prefs.v302volumeBoostPeak302
    BiliClient.prefs.v302volumeBoostPeak302 = !current
    AppToast.show(this, "Volume Boost Peak302: ${if (!current) "ON" else "OFF"}")
}

// v302: History Bookmark Export302
internal fun PlayerActivity.showV302HistoryBookmarkExport302Toggle() {
    val current = BiliClient.prefs.v302historyBookmarkExport302
    BiliClient.prefs.v302historyBookmarkExport302 = !current
    AppToast.show(this, "History Bookmark Export302: ${if (!current) "ON" else "OFF"}")
}

// v302: Playback Chapter Sync302
internal fun PlayerActivity.showV302PlaybackChapterSync302Toggle() {
    val current = BiliClient.prefs.v302playbackChapterSync302
    BiliClient.prefs.v302playbackChapterSync302 = !current
    AppToast.show(this, "Playback Chapter Sync302: ${if (!current) "ON" else "OFF"}")
}

// v302: Screenshot Save Path302
internal fun PlayerActivity.showV302ScreenshotSavePath302Toggle() {
    val current = BiliClient.prefs.v302screenshotSavePath302
    BiliClient.prefs.v302screenshotSavePath302 = !current
    AppToast.show(this, "Screenshot Save Path302: ${if (!current) "ON" else "OFF"}")
}

// v302: Video Color Space302
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

// v302: Danmaku Bottom Max Count412
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

// v302: Subtitle Bg Border419
internal fun PlayerActivity.showV302SubtitleBgBorder419Toggle() {
    val current = BiliClient.prefs.v302subtitleBgBorder419
    BiliClient.prefs.v302subtitleBgBorder419 = !current
    AppToast.show(this, "Subtitle Bg Border419: ${if (!current) "ON" else "OFF"}")
}

// v303: Audio EQ Custom303
internal fun PlayerActivity.showV303AudioEQCustom303Toggle() {
    val current = BiliClient.prefs.v303audioEQCustom303
    BiliClient.prefs.v303audioEQCustom303 = !current
    AppToast.show(this, "Audio EQ Custom303: ${if (!current) "ON" else "OFF"}")
}

// v303: Danmaku Bottom Max Count413
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

// v303: Subtitle Bg Border420
internal fun PlayerActivity.showV303SubtitleBgBorder420Toggle() {
    val current = BiliClient.prefs.v303subtitleBgBorder420
    BiliClient.prefs.v303subtitleBgBorder420 = !current
    AppToast.show(this, "Subtitle Bg Border420: ${if (!current) "ON" else "OFF"}")
}

