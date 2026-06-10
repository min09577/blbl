package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v343: Gesture Double Tap Rewind335
internal fun PlayerActivity.showV343GestureDoubleTapRewind335Toggle() {
    val current = BiliClient.prefs.v343gestureDoubleTapRewind335
    BiliClient.prefs.v343gestureDoubleTapRewind335 = !current
    AppToast.show(this, "Gesture Double Tap Rewind335: ${if (!current) "ON" else "OFF"}")
}

// v343: Cast Audio Delay335
internal fun PlayerActivity.showV343CastAudioDelay335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343castAudioDelay335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343castAudioDelay335 = value
        AppToast.show(this, "Cast Audio Delay335: $value")
    }
}

// v343: Playlist Auto Mark Watched335
internal fun PlayerActivity.showV343PlaylistAutoMarkWatched335Toggle() {
    val current = BiliClient.prefs.v343playlistAutoMarkWatched335
    BiliClient.prefs.v343playlistAutoMarkWatched335 = !current
    AppToast.show(this, "Playlist Auto Mark Watched335: ${if (!current) "ON" else "OFF"}")
}

// v343: Cache Preload On Wifi335
internal fun PlayerActivity.showV343CachePreloadOnWifi335Toggle() {
    val current = BiliClient.prefs.v343cachePreloadOnWifi335
    BiliClient.prefs.v343cachePreloadOnWifi335 = !current
    AppToast.show(this, "Cache Preload On Wifi335: ${if (!current) "ON" else "OFF"}")
}

// v343: Progress Bar Show Chapter335
internal fun PlayerActivity.showV343ProgressBarShowChapter335Toggle() {
    val current = BiliClient.prefs.v343progressBarShowChapter335
    BiliClient.prefs.v343progressBarShowChapter335 = !current
    AppToast.show(this, "Progress Bar Show Chapter335: ${if (!current) "ON" else "OFF"}")
}

// v343: Volume Balance LR335
internal fun PlayerActivity.showV343VolumeBalanceLR335Toggle() {
    val current = BiliClient.prefs.v343volumeBalanceLR335
    BiliClient.prefs.v343volumeBalanceLR335 = !current
    AppToast.show(this, "Volume Balance LR335: ${if (!current) "ON" else "OFF"}")
}

// v343: History Max Items335
internal fun PlayerActivity.showV343HistoryMaxItems335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343historyMaxItems335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343historyMaxItems335 = value
        AppToast.show(this, "History Max Items335: $value")
    }
}

// v343: Playback AB Repeat335
internal fun PlayerActivity.showV343PlaybackABRepeat335Toggle() {
    val current = BiliClient.prefs.v343playbackABRepeat335
    BiliClient.prefs.v343playbackABRepeat335 = !current
    AppToast.show(this, "Playback AB Repeat335: ${if (!current) "ON" else "OFF"}")
}

// v343: Screenshot Share Target335
internal fun PlayerActivity.showV343ScreenshotShareTarget335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343screenshotShareTarget335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343screenshotShareTarget335 = value
        AppToast.show(this, "Screenshot Share Target335: $value")
    }
}

// v343: Video Rotate Angle335
internal fun PlayerActivity.showV343VideoRotateAngle335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343videoRotateAngle335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343videoRotateAngle335 = value
        AppToast.show(this, "Video Rotate Angle335: $value")
    }
}

// v343: Danmaku Merge Threshold338
internal fun PlayerActivity.showV343DanmakuMergeThreshold338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343danmakuMergeThreshold338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343danmakuMergeThreshold338 = value
        AppToast.show(this, "Danmaku Merge Threshold338: $value")
    }
}

// v343: Subtitle Font Size338
internal fun PlayerActivity.showV343SubtitleFontSize338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343subtitleFontSize338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343subtitleFontSize338 = value
        AppToast.show(this, "Subtitle Font Size338: $value")
    }
}

// v344: Audio Bass Extract326
internal fun PlayerActivity.showV344AudioBassExtract326Toggle() {
    val current = BiliClient.prefs.v344audioBassExtract326
    BiliClient.prefs.v344audioBassExtract326 = !current
    AppToast.show(this, "Audio Bass Extract326: ${if (!current) "ON" else "OFF"}")
}

// v344: Danmaku Merge Threshold339
internal fun PlayerActivity.showV344DanmakuMergeThreshold339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344danmakuMergeThreshold339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344danmakuMergeThreshold339 = value
        AppToast.show(this, "Danmaku Merge Threshold339: $value")
    }
}

// v344: Subtitle Font Size339
internal fun PlayerActivity.showV344SubtitleFontSize339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344subtitleFontSize339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344subtitleFontSize339 = value
        AppToast.show(this, "Subtitle Font Size339: $value")
    }
}

// v344: Gesture Double Tap Rewind336
internal fun PlayerActivity.showV344GestureDoubleTapRewind336Toggle() {
    val current = BiliClient.prefs.v344gestureDoubleTapRewind336
    BiliClient.prefs.v344gestureDoubleTapRewind336 = !current
    AppToast.show(this, "Gesture Double Tap Rewind336: ${if (!current) "ON" else "OFF"}")
}

// v344: Cast Audio Delay336
internal fun PlayerActivity.showV344CastAudioDelay336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344castAudioDelay336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344castAudioDelay336 = value
        AppToast.show(this, "Cast Audio Delay336: $value")
    }
}

// v344: Playlist Auto Mark Watched336
internal fun PlayerActivity.showV344PlaylistAutoMarkWatched336Toggle() {
    val current = BiliClient.prefs.v344playlistAutoMarkWatched336
    BiliClient.prefs.v344playlistAutoMarkWatched336 = !current
    AppToast.show(this, "Playlist Auto Mark Watched336: ${if (!current) "ON" else "OFF"}")
}

// v344: Cache Preload On Wifi336
internal fun PlayerActivity.showV344CachePreloadOnWifi336Toggle() {
    val current = BiliClient.prefs.v344cachePreloadOnWifi336
    BiliClient.prefs.v344cachePreloadOnWifi336 = !current
    AppToast.show(this, "Cache Preload On Wifi336: ${if (!current) "ON" else "OFF"}")
}

// v344: Progress Bar Show Chapter336
internal fun PlayerActivity.showV344ProgressBarShowChapter336Toggle() {
    val current = BiliClient.prefs.v344progressBarShowChapter336
    BiliClient.prefs.v344progressBarShowChapter336 = !current
    AppToast.show(this, "Progress Bar Show Chapter336: ${if (!current) "ON" else "OFF"}")
}

// v344: Volume Balance LR336
internal fun PlayerActivity.showV344VolumeBalanceLR336Toggle() {
    val current = BiliClient.prefs.v344volumeBalanceLR336
    BiliClient.prefs.v344volumeBalanceLR336 = !current
    AppToast.show(this, "Volume Balance LR336: ${if (!current) "ON" else "OFF"}")
}

// v344: History Max Items336
internal fun PlayerActivity.showV344HistoryMaxItems336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344historyMaxItems336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344historyMaxItems336 = value
        AppToast.show(this, "History Max Items336: $value")
    }
}

// v344: Playback AB Repeat336
internal fun PlayerActivity.showV344PlaybackABRepeat336Toggle() {
    val current = BiliClient.prefs.v344playbackABRepeat336
    BiliClient.prefs.v344playbackABRepeat336 = !current
    AppToast.show(this, "Playback AB Repeat336: ${if (!current) "ON" else "OFF"}")
}

// v344: Screenshot Share Target336
internal fun PlayerActivity.showV344ScreenshotShareTarget336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344screenshotShareTarget336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344screenshotShareTarget336 = value
        AppToast.show(this, "Screenshot Share Target336: $value")
    }
}

// v344: Video Rotate Angle336
internal fun PlayerActivity.showV344VideoRotateAngle336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344videoRotateAngle336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344videoRotateAngle336 = value
        AppToast.show(this, "Video Rotate Angle336: $value")
    }
}

// v344: Danmaku Merge Threshold340
internal fun PlayerActivity.showV344DanmakuMergeThreshold340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344danmakuMergeThreshold340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344danmakuMergeThreshold340 = value
        AppToast.show(this, "Danmaku Merge Threshold340: $value")
    }
}

// v344: Subtitle Font Size340
internal fun PlayerActivity.showV344SubtitleFontSize340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344subtitleFontSize340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344subtitleFontSize340 = value
        AppToast.show(this, "Subtitle Font Size340: $value")
    }
}

// v345: Audio Bass Extract327
internal fun PlayerActivity.showV345AudioBassExtract327Toggle() {
    val current = BiliClient.prefs.v345audioBassExtract327
    BiliClient.prefs.v345audioBassExtract327 = !current
    AppToast.show(this, "Audio Bass Extract327: ${if (!current) "ON" else "OFF"}")
}

// v345: Danmaku Merge Threshold341
internal fun PlayerActivity.showV345DanmakuMergeThreshold341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345danmakuMergeThreshold341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345danmakuMergeThreshold341 = value
        AppToast.show(this, "Danmaku Merge Threshold341: $value")
    }
}

// v345: Subtitle Font Size341
internal fun PlayerActivity.showV345SubtitleFontSize341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345subtitleFontSize341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345subtitleFontSize341 = value
        AppToast.show(this, "Subtitle Font Size341: $value")
    }
}

// v345: Gesture Double Tap Rewind337
internal fun PlayerActivity.showV345GestureDoubleTapRewind337Toggle() {
    val current = BiliClient.prefs.v345gestureDoubleTapRewind337
    BiliClient.prefs.v345gestureDoubleTapRewind337 = !current
    AppToast.show(this, "Gesture Double Tap Rewind337: ${if (!current) "ON" else "OFF"}")
}

// v345: Cast Audio Delay337
internal fun PlayerActivity.showV345CastAudioDelay337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345castAudioDelay337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345castAudioDelay337 = value
        AppToast.show(this, "Cast Audio Delay337: $value")
    }
}

// v345: Playlist Auto Mark Watched337
internal fun PlayerActivity.showV345PlaylistAutoMarkWatched337Toggle() {
    val current = BiliClient.prefs.v345playlistAutoMarkWatched337
    BiliClient.prefs.v345playlistAutoMarkWatched337 = !current
    AppToast.show(this, "Playlist Auto Mark Watched337: ${if (!current) "ON" else "OFF"}")
}

// v345: Cache Preload On Wifi337
internal fun PlayerActivity.showV345CachePreloadOnWifi337Toggle() {
    val current = BiliClient.prefs.v345cachePreloadOnWifi337
    BiliClient.prefs.v345cachePreloadOnWifi337 = !current
    AppToast.show(this, "Cache Preload On Wifi337: ${if (!current) "ON" else "OFF"}")
}

// v345: Progress Bar Show Chapter337
internal fun PlayerActivity.showV345ProgressBarShowChapter337Toggle() {
    val current = BiliClient.prefs.v345progressBarShowChapter337
    BiliClient.prefs.v345progressBarShowChapter337 = !current
    AppToast.show(this, "Progress Bar Show Chapter337: ${if (!current) "ON" else "OFF"}")
}

// v345: Volume Balance LR337
internal fun PlayerActivity.showV345VolumeBalanceLR337Toggle() {
    val current = BiliClient.prefs.v345volumeBalanceLR337
    BiliClient.prefs.v345volumeBalanceLR337 = !current
    AppToast.show(this, "Volume Balance LR337: ${if (!current) "ON" else "OFF"}")
}

// v345: History Max Items337
internal fun PlayerActivity.showV345HistoryMaxItems337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345historyMaxItems337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345historyMaxItems337 = value
        AppToast.show(this, "History Max Items337: $value")
    }
}

// v345: Playback AB Repeat337
internal fun PlayerActivity.showV345PlaybackABRepeat337Toggle() {
    val current = BiliClient.prefs.v345playbackABRepeat337
    BiliClient.prefs.v345playbackABRepeat337 = !current
    AppToast.show(this, "Playback AB Repeat337: ${if (!current) "ON" else "OFF"}")
}

// v345: Screenshot Share Target337
internal fun PlayerActivity.showV345ScreenshotShareTarget337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345screenshotShareTarget337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345screenshotShareTarget337 = value
        AppToast.show(this, "Screenshot Share Target337: $value")
    }
}

// v345: Video Rotate Angle337
internal fun PlayerActivity.showV345VideoRotateAngle337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345videoRotateAngle337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345videoRotateAngle337 = value
        AppToast.show(this, "Video Rotate Angle337: $value")
    }
}

// v345: Danmaku Merge Threshold342
internal fun PlayerActivity.showV345DanmakuMergeThreshold342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345danmakuMergeThreshold342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345danmakuMergeThreshold342 = value
        AppToast.show(this, "Danmaku Merge Threshold342: $value")
    }
}

// v345: Subtitle Font Size342
internal fun PlayerActivity.showV345SubtitleFontSize342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345subtitleFontSize342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345subtitleFontSize342 = value
        AppToast.show(this, "Subtitle Font Size342: $value")
    }
}

// v346: Audio Bass Extract328
internal fun PlayerActivity.showV346AudioBassExtract328Toggle() {
    val current = BiliClient.prefs.v346audioBassExtract328
    BiliClient.prefs.v346audioBassExtract328 = !current
    AppToast.show(this, "Audio Bass Extract328: ${if (!current) "ON" else "OFF"}")
}

// v346: Danmaku Merge Threshold343
internal fun PlayerActivity.showV346DanmakuMergeThreshold343Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346danmakuMergeThreshold343).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold343",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346danmakuMergeThreshold343 = value
        AppToast.show(this, "Danmaku Merge Threshold343: $value")
    }
}

// v346: Subtitle Font Size343
internal fun PlayerActivity.showV346SubtitleFontSize343Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346subtitleFontSize343).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size343",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346subtitleFontSize343 = value
        AppToast.show(this, "Subtitle Font Size343: $value")
    }
}

// v346: Gesture Double Tap Rewind338
internal fun PlayerActivity.showV346GestureDoubleTapRewind338Toggle() {
    val current = BiliClient.prefs.v346gestureDoubleTapRewind338
    BiliClient.prefs.v346gestureDoubleTapRewind338 = !current
    AppToast.show(this, "Gesture Double Tap Rewind338: ${if (!current) "ON" else "OFF"}")
}

// v346: Cast Audio Delay338
internal fun PlayerActivity.showV346CastAudioDelay338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346castAudioDelay338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346castAudioDelay338 = value
        AppToast.show(this, "Cast Audio Delay338: $value")
    }
}

// v346: Playlist Auto Mark Watched338
internal fun PlayerActivity.showV346PlaylistAutoMarkWatched338Toggle() {
    val current = BiliClient.prefs.v346playlistAutoMarkWatched338
    BiliClient.prefs.v346playlistAutoMarkWatched338 = !current
    AppToast.show(this, "Playlist Auto Mark Watched338: ${if (!current) "ON" else "OFF"}")
}

// v346: Cache Preload On Wifi338
internal fun PlayerActivity.showV346CachePreloadOnWifi338Toggle() {
    val current = BiliClient.prefs.v346cachePreloadOnWifi338
    BiliClient.prefs.v346cachePreloadOnWifi338 = !current
    AppToast.show(this, "Cache Preload On Wifi338: ${if (!current) "ON" else "OFF"}")
}

// v346: Progress Bar Show Chapter338
internal fun PlayerActivity.showV346ProgressBarShowChapter338Toggle() {
    val current = BiliClient.prefs.v346progressBarShowChapter338
    BiliClient.prefs.v346progressBarShowChapter338 = !current
    AppToast.show(this, "Progress Bar Show Chapter338: ${if (!current) "ON" else "OFF"}")
}

// v346: Volume Balance LR338
internal fun PlayerActivity.showV346VolumeBalanceLR338Toggle() {
    val current = BiliClient.prefs.v346volumeBalanceLR338
    BiliClient.prefs.v346volumeBalanceLR338 = !current
    AppToast.show(this, "Volume Balance LR338: ${if (!current) "ON" else "OFF"}")
}

// v346: History Max Items338
internal fun PlayerActivity.showV346HistoryMaxItems338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346historyMaxItems338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346historyMaxItems338 = value
        AppToast.show(this, "History Max Items338: $value")
    }
}

// v346: Playback AB Repeat338
internal fun PlayerActivity.showV346PlaybackABRepeat338Toggle() {
    val current = BiliClient.prefs.v346playbackABRepeat338
    BiliClient.prefs.v346playbackABRepeat338 = !current
    AppToast.show(this, "Playback AB Repeat338: ${if (!current) "ON" else "OFF"}")
}

// v346: Screenshot Share Target338
internal fun PlayerActivity.showV346ScreenshotShareTarget338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346screenshotShareTarget338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346screenshotShareTarget338 = value
        AppToast.show(this, "Screenshot Share Target338: $value")
    }
}

// v346: Video Rotate Angle338
internal fun PlayerActivity.showV346VideoRotateAngle338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346videoRotateAngle338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346videoRotateAngle338 = value
        AppToast.show(this, "Video Rotate Angle338: $value")
    }
}

// v346: Danmaku Merge Threshold344
internal fun PlayerActivity.showV346DanmakuMergeThreshold344Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346danmakuMergeThreshold344).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold344",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346danmakuMergeThreshold344 = value
        AppToast.show(this, "Danmaku Merge Threshold344: $value")
    }
}

// v346: Subtitle Font Size344
internal fun PlayerActivity.showV346SubtitleFontSize344Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346subtitleFontSize344).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size344",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346subtitleFontSize344 = value
        AppToast.show(this, "Subtitle Font Size344: $value")
    }
}

// v347: Audio Bass Extract329
internal fun PlayerActivity.showV347AudioBassExtract329Toggle() {
    val current = BiliClient.prefs.v347audioBassExtract329
    BiliClient.prefs.v347audioBassExtract329 = !current
    AppToast.show(this, "Audio Bass Extract329: ${if (!current) "ON" else "OFF"}")
}

// v347: Danmaku Merge Threshold345
internal fun PlayerActivity.showV347DanmakuMergeThreshold345Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347danmakuMergeThreshold345).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold345",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347danmakuMergeThreshold345 = value
        AppToast.show(this, "Danmaku Merge Threshold345: $value")
    }
}

// v347: Subtitle Font Size345
internal fun PlayerActivity.showV347SubtitleFontSize345Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347subtitleFontSize345).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size345",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347subtitleFontSize345 = value
        AppToast.show(this, "Subtitle Font Size345: $value")
    }
}

// v347: Gesture Double Tap Rewind339
internal fun PlayerActivity.showV347GestureDoubleTapRewind339Toggle() {
    val current = BiliClient.prefs.v347gestureDoubleTapRewind339
    BiliClient.prefs.v347gestureDoubleTapRewind339 = !current
    AppToast.show(this, "Gesture Double Tap Rewind339: ${if (!current) "ON" else "OFF"}")
}

// v347: Cast Audio Delay339
internal fun PlayerActivity.showV347CastAudioDelay339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347castAudioDelay339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347castAudioDelay339 = value
        AppToast.show(this, "Cast Audio Delay339: $value")
    }
}

// v347: Playlist Auto Mark Watched339
internal fun PlayerActivity.showV347PlaylistAutoMarkWatched339Toggle() {
    val current = BiliClient.prefs.v347playlistAutoMarkWatched339
    BiliClient.prefs.v347playlistAutoMarkWatched339 = !current
    AppToast.show(this, "Playlist Auto Mark Watched339: ${if (!current) "ON" else "OFF"}")
}

// v347: Cache Preload On Wifi339
internal fun PlayerActivity.showV347CachePreloadOnWifi339Toggle() {
    val current = BiliClient.prefs.v347cachePreloadOnWifi339
    BiliClient.prefs.v347cachePreloadOnWifi339 = !current
    AppToast.show(this, "Cache Preload On Wifi339: ${if (!current) "ON" else "OFF"}")
}

// v347: Progress Bar Show Chapter339
internal fun PlayerActivity.showV347ProgressBarShowChapter339Toggle() {
    val current = BiliClient.prefs.v347progressBarShowChapter339
    BiliClient.prefs.v347progressBarShowChapter339 = !current
    AppToast.show(this, "Progress Bar Show Chapter339: ${if (!current) "ON" else "OFF"}")
}

// v347: Volume Balance LR339
internal fun PlayerActivity.showV347VolumeBalanceLR339Toggle() {
    val current = BiliClient.prefs.v347volumeBalanceLR339
    BiliClient.prefs.v347volumeBalanceLR339 = !current
    AppToast.show(this, "Volume Balance LR339: ${if (!current) "ON" else "OFF"}")
}

// v347: History Max Items339
internal fun PlayerActivity.showV347HistoryMaxItems339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347historyMaxItems339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347historyMaxItems339 = value
        AppToast.show(this, "History Max Items339: $value")
    }
}

// v347: Playback AB Repeat339
internal fun PlayerActivity.showV347PlaybackABRepeat339Toggle() {
    val current = BiliClient.prefs.v347playbackABRepeat339
    BiliClient.prefs.v347playbackABRepeat339 = !current
    AppToast.show(this, "Playback AB Repeat339: ${if (!current) "ON" else "OFF"}")
}

// v347: Screenshot Share Target339
internal fun PlayerActivity.showV347ScreenshotShareTarget339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347screenshotShareTarget339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347screenshotShareTarget339 = value
        AppToast.show(this, "Screenshot Share Target339: $value")
    }
}

// v347: Video Rotate Angle339
internal fun PlayerActivity.showV347VideoRotateAngle339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347videoRotateAngle339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347videoRotateAngle339 = value
        AppToast.show(this, "Video Rotate Angle339: $value")
    }
}

// v347: Danmaku Merge Threshold346
internal fun PlayerActivity.showV347DanmakuMergeThreshold346Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347danmakuMergeThreshold346).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold346",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347danmakuMergeThreshold346 = value
        AppToast.show(this, "Danmaku Merge Threshold346: $value")
    }
}

// v347: Subtitle Font Size346
internal fun PlayerActivity.showV347SubtitleFontSize346Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347subtitleFontSize346).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size346",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347subtitleFontSize346 = value
        AppToast.show(this, "Subtitle Font Size346: $value")
    }
}

// v348: Audio Bass Extract330
internal fun PlayerActivity.showV348AudioBassExtract330Toggle() {
    val current = BiliClient.prefs.v348audioBassExtract330
    BiliClient.prefs.v348audioBassExtract330 = !current
    AppToast.show(this, "Audio Bass Extract330: ${if (!current) "ON" else "OFF"}")
}

// v348: Danmaku Merge Threshold347
internal fun PlayerActivity.showV348DanmakuMergeThreshold347Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348danmakuMergeThreshold347).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold347",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348danmakuMergeThreshold347 = value
        AppToast.show(this, "Danmaku Merge Threshold347: $value")
    }
}

// v348: Subtitle Font Size347
internal fun PlayerActivity.showV348SubtitleFontSize347Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348subtitleFontSize347).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size347",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348subtitleFontSize347 = value
        AppToast.show(this, "Subtitle Font Size347: $value")
    }
}

// v348: Gesture Double Tap Rewind340
internal fun PlayerActivity.showV348GestureDoubleTapRewind340Toggle() {
    val current = BiliClient.prefs.v348gestureDoubleTapRewind340
    BiliClient.prefs.v348gestureDoubleTapRewind340 = !current
    AppToast.show(this, "Gesture Double Tap Rewind340: ${if (!current) "ON" else "OFF"}")
}

// v348: Cast Audio Delay340
internal fun PlayerActivity.showV348CastAudioDelay340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348castAudioDelay340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348castAudioDelay340 = value
        AppToast.show(this, "Cast Audio Delay340: $value")
    }
}

// v348: Playlist Auto Mark Watched340
internal fun PlayerActivity.showV348PlaylistAutoMarkWatched340Toggle() {
    val current = BiliClient.prefs.v348playlistAutoMarkWatched340
    BiliClient.prefs.v348playlistAutoMarkWatched340 = !current
    AppToast.show(this, "Playlist Auto Mark Watched340: ${if (!current) "ON" else "OFF"}")
}

// v348: Cache Preload On Wifi340
internal fun PlayerActivity.showV348CachePreloadOnWifi340Toggle() {
    val current = BiliClient.prefs.v348cachePreloadOnWifi340
    BiliClient.prefs.v348cachePreloadOnWifi340 = !current
    AppToast.show(this, "Cache Preload On Wifi340: ${if (!current) "ON" else "OFF"}")
}

// v348: Progress Bar Show Chapter340
internal fun PlayerActivity.showV348ProgressBarShowChapter340Toggle() {
    val current = BiliClient.prefs.v348progressBarShowChapter340
    BiliClient.prefs.v348progressBarShowChapter340 = !current
    AppToast.show(this, "Progress Bar Show Chapter340: ${if (!current) "ON" else "OFF"}")
}

// v348: Volume Balance LR340
internal fun PlayerActivity.showV348VolumeBalanceLR340Toggle() {
    val current = BiliClient.prefs.v348volumeBalanceLR340
    BiliClient.prefs.v348volumeBalanceLR340 = !current
    AppToast.show(this, "Volume Balance LR340: ${if (!current) "ON" else "OFF"}")
}

// v348: History Max Items340
internal fun PlayerActivity.showV348HistoryMaxItems340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348historyMaxItems340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348historyMaxItems340 = value
        AppToast.show(this, "History Max Items340: $value")
    }
}

// v348: Playback AB Repeat340
internal fun PlayerActivity.showV348PlaybackABRepeat340Toggle() {
    val current = BiliClient.prefs.v348playbackABRepeat340
    BiliClient.prefs.v348playbackABRepeat340 = !current
    AppToast.show(this, "Playback AB Repeat340: ${if (!current) "ON" else "OFF"}")
}

// v348: Screenshot Share Target340
internal fun PlayerActivity.showV348ScreenshotShareTarget340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348screenshotShareTarget340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348screenshotShareTarget340 = value
        AppToast.show(this, "Screenshot Share Target340: $value")
    }
}

// v348: Video Rotate Angle340
internal fun PlayerActivity.showV348VideoRotateAngle340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348videoRotateAngle340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348videoRotateAngle340 = value
        AppToast.show(this, "Video Rotate Angle340: $value")
    }
}

// v348: Danmaku Merge Threshold348
internal fun PlayerActivity.showV348DanmakuMergeThreshold348Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348danmakuMergeThreshold348).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold348",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348danmakuMergeThreshold348 = value
        AppToast.show(this, "Danmaku Merge Threshold348: $value")
    }
}

// v348: Subtitle Font Size348
internal fun PlayerActivity.showV348SubtitleFontSize348Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348subtitleFontSize348).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size348",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348subtitleFontSize348 = value
        AppToast.show(this, "Subtitle Font Size348: $value")
    }
}

// v349: Audio Bass Extract331
internal fun PlayerActivity.showV349AudioBassExtract331Toggle() {
    val current = BiliClient.prefs.v349audioBassExtract331
    BiliClient.prefs.v349audioBassExtract331 = !current
    AppToast.show(this, "Audio Bass Extract331: ${if (!current) "ON" else "OFF"}")
}

// v349: Danmaku Merge Threshold349
internal fun PlayerActivity.showV349DanmakuMergeThreshold349Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349danmakuMergeThreshold349).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold349",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349danmakuMergeThreshold349 = value
        AppToast.show(this, "Danmaku Merge Threshold349: $value")
    }
}

// v349: Subtitle Font Size349
internal fun PlayerActivity.showV349SubtitleFontSize349Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349subtitleFontSize349).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size349",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349subtitleFontSize349 = value
        AppToast.show(this, "Subtitle Font Size349: $value")
    }
}

// v349: Gesture Double Tap Rewind341
internal fun PlayerActivity.showV349GestureDoubleTapRewind341Toggle() {
    val current = BiliClient.prefs.v349gestureDoubleTapRewind341
    BiliClient.prefs.v349gestureDoubleTapRewind341 = !current
    AppToast.show(this, "Gesture Double Tap Rewind341: ${if (!current) "ON" else "OFF"}")
}

// v349: Cast Audio Delay341
internal fun PlayerActivity.showV349CastAudioDelay341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349castAudioDelay341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349castAudioDelay341 = value
        AppToast.show(this, "Cast Audio Delay341: $value")
    }
}

// v349: Playlist Auto Mark Watched341
internal fun PlayerActivity.showV349PlaylistAutoMarkWatched341Toggle() {
    val current = BiliClient.prefs.v349playlistAutoMarkWatched341
    BiliClient.prefs.v349playlistAutoMarkWatched341 = !current
    AppToast.show(this, "Playlist Auto Mark Watched341: ${if (!current) "ON" else "OFF"}")
}

// v349: Cache Preload On Wifi341
internal fun PlayerActivity.showV349CachePreloadOnWifi341Toggle() {
    val current = BiliClient.prefs.v349cachePreloadOnWifi341
    BiliClient.prefs.v349cachePreloadOnWifi341 = !current
    AppToast.show(this, "Cache Preload On Wifi341: ${if (!current) "ON" else "OFF"}")
}

// v349: Progress Bar Show Chapter341
internal fun PlayerActivity.showV349ProgressBarShowChapter341Toggle() {
    val current = BiliClient.prefs.v349progressBarShowChapter341
    BiliClient.prefs.v349progressBarShowChapter341 = !current
    AppToast.show(this, "Progress Bar Show Chapter341: ${if (!current) "ON" else "OFF"}")
}

// v349: Volume Balance LR341
internal fun PlayerActivity.showV349VolumeBalanceLR341Toggle() {
    val current = BiliClient.prefs.v349volumeBalanceLR341
    BiliClient.prefs.v349volumeBalanceLR341 = !current
    AppToast.show(this, "Volume Balance LR341: ${if (!current) "ON" else "OFF"}")
}

// v349: History Max Items341
internal fun PlayerActivity.showV349HistoryMaxItems341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349historyMaxItems341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349historyMaxItems341 = value
        AppToast.show(this, "History Max Items341: $value")
    }
}

// v349: Playback AB Repeat341
internal fun PlayerActivity.showV349PlaybackABRepeat341Toggle() {
    val current = BiliClient.prefs.v349playbackABRepeat341
    BiliClient.prefs.v349playbackABRepeat341 = !current
    AppToast.show(this, "Playback AB Repeat341: ${if (!current) "ON" else "OFF"}")
}

// v349: Screenshot Share Target341
internal fun PlayerActivity.showV349ScreenshotShareTarget341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349screenshotShareTarget341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349screenshotShareTarget341 = value
        AppToast.show(this, "Screenshot Share Target341: $value")
    }
}

// v349: Video Rotate Angle341
internal fun PlayerActivity.showV349VideoRotateAngle341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349videoRotateAngle341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349videoRotateAngle341 = value
        AppToast.show(this, "Video Rotate Angle341: $value")
    }
}

// v349: Danmaku Merge Threshold350
internal fun PlayerActivity.showV349DanmakuMergeThreshold350Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349danmakuMergeThreshold350).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold350",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349danmakuMergeThreshold350 = value
        AppToast.show(this, "Danmaku Merge Threshold350: $value")
    }
}

// v349: Subtitle Font Size350
internal fun PlayerActivity.showV349SubtitleFontSize350Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349subtitleFontSize350).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size350",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349subtitleFontSize350 = value
        AppToast.show(this, "Subtitle Font Size350: $value")
    }
}

// v350: Audio Bass Extract332
internal fun PlayerActivity.showV350AudioBassExtract332Toggle() {
    val current = BiliClient.prefs.v350audioBassExtract332
    BiliClient.prefs.v350audioBassExtract332 = !current
    AppToast.show(this, "Audio Bass Extract332: ${if (!current) "ON" else "OFF"}")
}

// v350: Danmaku Merge Threshold351
internal fun PlayerActivity.showV350DanmakuMergeThreshold351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350danmakuMergeThreshold351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350danmakuMergeThreshold351 = value
        AppToast.show(this, "Danmaku Merge Threshold351: $value")
    }
}

// v350: Subtitle Font Size351
internal fun PlayerActivity.showV350SubtitleFontSize351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350subtitleFontSize351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350subtitleFontSize351 = value
        AppToast.show(this, "Subtitle Font Size351: $value")
    }
}

// v350: Gesture Double Tap Rewind342
internal fun PlayerActivity.showV350GestureDoubleTapRewind342Toggle() {
    val current = BiliClient.prefs.v350gestureDoubleTapRewind342
    BiliClient.prefs.v350gestureDoubleTapRewind342 = !current
    AppToast.show(this, "Gesture Double Tap Rewind342: ${if (!current) "ON" else "OFF"}")
}

// v350: Cast Audio Delay342
internal fun PlayerActivity.showV350CastAudioDelay342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350castAudioDelay342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350castAudioDelay342 = value
        AppToast.show(this, "Cast Audio Delay342: $value")
    }
}

// v350: Playlist Auto Mark Watched342
internal fun PlayerActivity.showV350PlaylistAutoMarkWatched342Toggle() {
    val current = BiliClient.prefs.v350playlistAutoMarkWatched342
    BiliClient.prefs.v350playlistAutoMarkWatched342 = !current
    AppToast.show(this, "Playlist Auto Mark Watched342: ${if (!current) "ON" else "OFF"}")
}

// v350: Cache Preload On Wifi342
internal fun PlayerActivity.showV350CachePreloadOnWifi342Toggle() {
    val current = BiliClient.prefs.v350cachePreloadOnWifi342
    BiliClient.prefs.v350cachePreloadOnWifi342 = !current
    AppToast.show(this, "Cache Preload On Wifi342: ${if (!current) "ON" else "OFF"}")
}

// v350: Progress Bar Show Chapter342
internal fun PlayerActivity.showV350ProgressBarShowChapter342Toggle() {
    val current = BiliClient.prefs.v350progressBarShowChapter342
    BiliClient.prefs.v350progressBarShowChapter342 = !current
    AppToast.show(this, "Progress Bar Show Chapter342: ${if (!current) "ON" else "OFF"}")
}

// v350: Volume Balance LR342
internal fun PlayerActivity.showV350VolumeBalanceLR342Toggle() {
    val current = BiliClient.prefs.v350volumeBalanceLR342
    BiliClient.prefs.v350volumeBalanceLR342 = !current
    AppToast.show(this, "Volume Balance LR342: ${if (!current) "ON" else "OFF"}")
}

// v350: History Max Items342
internal fun PlayerActivity.showV350HistoryMaxItems342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350historyMaxItems342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350historyMaxItems342 = value
        AppToast.show(this, "History Max Items342: $value")
    }
}

// v350: Playback AB Repeat342
internal fun PlayerActivity.showV350PlaybackABRepeat342Toggle() {
    val current = BiliClient.prefs.v350playbackABRepeat342
    BiliClient.prefs.v350playbackABRepeat342 = !current
    AppToast.show(this, "Playback AB Repeat342: ${if (!current) "ON" else "OFF"}")
}

// v350: Screenshot Share Target342
internal fun PlayerActivity.showV350ScreenshotShareTarget342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350screenshotShareTarget342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350screenshotShareTarget342 = value
        AppToast.show(this, "Screenshot Share Target342: $value")
    }
}

// v350: Video Rotate Angle342
internal fun PlayerActivity.showV350VideoRotateAngle342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350videoRotateAngle342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350videoRotateAngle342 = value
        AppToast.show(this, "Video Rotate Angle342: $value")
    }
}

// v350: Danmaku Merge Threshold352
internal fun PlayerActivity.showV350DanmakuMergeThreshold352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350danmakuMergeThreshold352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350danmakuMergeThreshold352 = value
        AppToast.show(this, "Danmaku Merge Threshold352: $value")
    }
}

// v350: Subtitle Font Size352
internal fun PlayerActivity.showV350SubtitleFontSize352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350subtitleFontSize352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350subtitleFontSize352 = value
        AppToast.show(this, "Subtitle Font Size352: $value")
    }
}

// v351: Network Quality Indicator351
internal fun PlayerActivity.showV351NetworkQualityIndicator351Toggle() {
    val current = BiliClient.prefs.v351networkQualityIndicator351
    BiliClient.prefs.v351networkQualityIndicator351 = !current
    AppToast.show(this, "Network Quality Indicator351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Auto Switch351
internal fun PlayerActivity.showV351NetworkAutoSwitch351Toggle() {
    val current = BiliClient.prefs.v351networkAutoSwitch351
    BiliClient.prefs.v351networkAutoSwitch351 = !current
    AppToast.show(this, "Network Auto Switch351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Bandwidth Limit351
internal fun PlayerActivity.showV351NetworkBandwidthLimit351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkBandwidthLimit351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkBandwidthLimit351 = value
        AppToast.show(this, "Network Bandwidth Limit351: $value")
    }
}

// v351: Network Latency Display351
internal fun PlayerActivity.showV351NetworkLatencyDisplay351Toggle() {
    val current = BiliClient.prefs.v351networkLatencyDisplay351
    BiliClient.prefs.v351networkLatencyDisplay351 = !current
    AppToast.show(this, "Network Latency Display351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Packet Loss Alert351
internal fun PlayerActivity.showV351NetworkPacketLossAlert351Toggle() {
    val current = BiliClient.prefs.v351networkPacketLossAlert351
    BiliClient.prefs.v351networkPacketLossAlert351 = !current
    AppToast.show(this, "Network Packet Loss Alert351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Retry Strategy351
internal fun PlayerActivity.showV351NetworkRetryStrategy351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkRetryStrategy351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkRetryStrategy351 = value
        AppToast.show(this, "Network Retry Strategy351: $value")
    }
}

// v351: Network Timeout Custom351
internal fun PlayerActivity.showV351NetworkTimeoutCustom351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkTimeoutCustom351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkTimeoutCustom351 = value
        AppToast.show(this, "Network Timeout Custom351: $value")
    }
}

// v351: Network DNS优选351
internal fun PlayerActivity.showV351NetworkDNS优选351Toggle() {
    val current = BiliClient.prefs.v351networkDNS优选351
    BiliClient.prefs.v351networkDNS优选351 = !current
    AppToast.show(this, "Network DNS优选351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network IPv6优先351
internal fun PlayerActivity.showV351NetworkIPv6优先351Toggle() {
    val current = BiliClient.prefs.v351networkIPv6优先351
    BiliClient.prefs.v351networkIPv6优先351 = !current
    AppToast.show(this, "Network IPv6优先351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Proxy Custom351
internal fun PlayerActivity.showV351NetworkProxyCustom351Toggle() {
    val current = BiliClient.prefs.v351networkProxyCustom351
    BiliClient.prefs.v351networkProxyCustom351 = !current
    AppToast.show(this, "Network Proxy Custom351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Cache Strategy351
internal fun PlayerActivity.showV351NetworkCacheStrategy351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkCacheStrategy351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkCacheStrategy351 = value
        AppToast.show(this, "Network Cache Strategy351: $value")
    }
}

// v351: Network Connection Pool351
internal fun PlayerActivity.showV351NetworkConnectionPool351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkConnectionPool351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkConnectionPool351 = value
        AppToast.show(this, "Network Connection Pool351: $value")
    }
}

// v351: Network Keep Alive351
internal fun PlayerActivity.showV351NetworkKeepAlive351Toggle() {
    val current = BiliClient.prefs.v351networkKeepAlive351
    BiliClient.prefs.v351networkKeepAlive351 = !current
    AppToast.show(this, "Network Keep Alive351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Compression351
internal fun PlayerActivity.showV351NetworkCompression351Toggle() {
    val current = BiliClient.prefs.v351networkCompression351
    BiliClient.prefs.v351networkCompression351 = !current
    AppToast.show(this, "Network Compression351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Encryption351
internal fun PlayerActivity.showV351NetworkEncryption351Toggle() {
    val current = BiliClient.prefs.v351networkEncryption351
    BiliClient.prefs.v351networkEncryption351 = !current
    AppToast.show(this, "Network Encryption351: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Quality Indicator352
internal fun PlayerActivity.showV352NetworkQualityIndicator352Toggle() {
    val current = BiliClient.prefs.v352networkQualityIndicator352
    BiliClient.prefs.v352networkQualityIndicator352 = !current
    AppToast.show(this, "Network Quality Indicator352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Auto Switch352
internal fun PlayerActivity.showV352NetworkAutoSwitch352Toggle() {
    val current = BiliClient.prefs.v352networkAutoSwitch352
    BiliClient.prefs.v352networkAutoSwitch352 = !current
    AppToast.show(this, "Network Auto Switch352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Bandwidth Limit352
internal fun PlayerActivity.showV352NetworkBandwidthLimit352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkBandwidthLimit352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkBandwidthLimit352 = value
        AppToast.show(this, "Network Bandwidth Limit352: $value")
    }
}

// v352: Network Latency Display352
internal fun PlayerActivity.showV352NetworkLatencyDisplay352Toggle() {
    val current = BiliClient.prefs.v352networkLatencyDisplay352
    BiliClient.prefs.v352networkLatencyDisplay352 = !current
    AppToast.show(this, "Network Latency Display352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Packet Loss Alert352
internal fun PlayerActivity.showV352NetworkPacketLossAlert352Toggle() {
    val current = BiliClient.prefs.v352networkPacketLossAlert352
    BiliClient.prefs.v352networkPacketLossAlert352 = !current
    AppToast.show(this, "Network Packet Loss Alert352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Retry Strategy352
internal fun PlayerActivity.showV352NetworkRetryStrategy352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkRetryStrategy352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkRetryStrategy352 = value
        AppToast.show(this, "Network Retry Strategy352: $value")
    }
}

// v352: Network Timeout Custom352
internal fun PlayerActivity.showV352NetworkTimeoutCustom352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkTimeoutCustom352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkTimeoutCustom352 = value
        AppToast.show(this, "Network Timeout Custom352: $value")
    }
}

// v352: Network DNS优选352
internal fun PlayerActivity.showV352NetworkDNS优选352Toggle() {
    val current = BiliClient.prefs.v352networkDNS优选352
    BiliClient.prefs.v352networkDNS优选352 = !current
    AppToast.show(this, "Network DNS优选352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network IPv6优先352
internal fun PlayerActivity.showV352NetworkIPv6优先352Toggle() {
    val current = BiliClient.prefs.v352networkIPv6优先352
    BiliClient.prefs.v352networkIPv6优先352 = !current
    AppToast.show(this, "Network IPv6优先352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Proxy Custom352
internal fun PlayerActivity.showV352NetworkProxyCustom352Toggle() {
    val current = BiliClient.prefs.v352networkProxyCustom352
    BiliClient.prefs.v352networkProxyCustom352 = !current
    AppToast.show(this, "Network Proxy Custom352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Cache Strategy352
internal fun PlayerActivity.showV352NetworkCacheStrategy352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkCacheStrategy352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkCacheStrategy352 = value
        AppToast.show(this, "Network Cache Strategy352: $value")
    }
}

// v352: Network Connection Pool352
internal fun PlayerActivity.showV352NetworkConnectionPool352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkConnectionPool352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkConnectionPool352 = value
        AppToast.show(this, "Network Connection Pool352: $value")
    }
}

// v352: Network Keep Alive352
internal fun PlayerActivity.showV352NetworkKeepAlive352Toggle() {
    val current = BiliClient.prefs.v352networkKeepAlive352
    BiliClient.prefs.v352networkKeepAlive352 = !current
    AppToast.show(this, "Network Keep Alive352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Compression352
internal fun PlayerActivity.showV352NetworkCompression352Toggle() {
    val current = BiliClient.prefs.v352networkCompression352
    BiliClient.prefs.v352networkCompression352 = !current
    AppToast.show(this, "Network Compression352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Encryption352
internal fun PlayerActivity.showV352NetworkEncryption352Toggle() {
    val current = BiliClient.prefs.v352networkEncryption352
    BiliClient.prefs.v352networkEncryption352 = !current
    AppToast.show(this, "Network Encryption352: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Quality Indicator353
internal fun PlayerActivity.showV353NetworkQualityIndicator353Toggle() {
    val current = BiliClient.prefs.v353networkQualityIndicator353
    BiliClient.prefs.v353networkQualityIndicator353 = !current
    AppToast.show(this, "Network Quality Indicator353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Auto Switch353
internal fun PlayerActivity.showV353NetworkAutoSwitch353Toggle() {
    val current = BiliClient.prefs.v353networkAutoSwitch353
    BiliClient.prefs.v353networkAutoSwitch353 = !current
    AppToast.show(this, "Network Auto Switch353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Bandwidth Limit353
internal fun PlayerActivity.showV353NetworkBandwidthLimit353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkBandwidthLimit353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkBandwidthLimit353 = value
        AppToast.show(this, "Network Bandwidth Limit353: $value")
    }
}

// v353: Network Latency Display353
internal fun PlayerActivity.showV353NetworkLatencyDisplay353Toggle() {
    val current = BiliClient.prefs.v353networkLatencyDisplay353
    BiliClient.prefs.v353networkLatencyDisplay353 = !current
    AppToast.show(this, "Network Latency Display353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Packet Loss Alert353
internal fun PlayerActivity.showV353NetworkPacketLossAlert353Toggle() {
    val current = BiliClient.prefs.v353networkPacketLossAlert353
    BiliClient.prefs.v353networkPacketLossAlert353 = !current
    AppToast.show(this, "Network Packet Loss Alert353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Retry Strategy353
internal fun PlayerActivity.showV353NetworkRetryStrategy353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkRetryStrategy353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkRetryStrategy353 = value
        AppToast.show(this, "Network Retry Strategy353: $value")
    }
}

// v353: Network Timeout Custom353
internal fun PlayerActivity.showV353NetworkTimeoutCustom353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkTimeoutCustom353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkTimeoutCustom353 = value
        AppToast.show(this, "Network Timeout Custom353: $value")
    }
}

// v353: Network DNS优选353
internal fun PlayerActivity.showV353NetworkDNS优选353Toggle() {
    val current = BiliClient.prefs.v353networkDNS优选353
    BiliClient.prefs.v353networkDNS优选353 = !current
    AppToast.show(this, "Network DNS优选353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network IPv6优先353
internal fun PlayerActivity.showV353NetworkIPv6优先353Toggle() {
    val current = BiliClient.prefs.v353networkIPv6优先353
    BiliClient.prefs.v353networkIPv6优先353 = !current
    AppToast.show(this, "Network IPv6优先353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Proxy Custom353
internal fun PlayerActivity.showV353NetworkProxyCustom353Toggle() {
    val current = BiliClient.prefs.v353networkProxyCustom353
    BiliClient.prefs.v353networkProxyCustom353 = !current
    AppToast.show(this, "Network Proxy Custom353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Cache Strategy353
internal fun PlayerActivity.showV353NetworkCacheStrategy353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkCacheStrategy353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkCacheStrategy353 = value
        AppToast.show(this, "Network Cache Strategy353: $value")
    }
}

// v353: Network Connection Pool353
internal fun PlayerActivity.showV353NetworkConnectionPool353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkConnectionPool353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkConnectionPool353 = value
        AppToast.show(this, "Network Connection Pool353: $value")
    }
}

// v353: Network Keep Alive353
internal fun PlayerActivity.showV353NetworkKeepAlive353Toggle() {
    val current = BiliClient.prefs.v353networkKeepAlive353
    BiliClient.prefs.v353networkKeepAlive353 = !current
    AppToast.show(this, "Network Keep Alive353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Compression353
internal fun PlayerActivity.showV353NetworkCompression353Toggle() {
    val current = BiliClient.prefs.v353networkCompression353
    BiliClient.prefs.v353networkCompression353 = !current
    AppToast.show(this, "Network Compression353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Encryption353
internal fun PlayerActivity.showV353NetworkEncryption353Toggle() {
    val current = BiliClient.prefs.v353networkEncryption353
    BiliClient.prefs.v353networkEncryption353 = !current
    AppToast.show(this, "Network Encryption353: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Quality Indicator354
internal fun PlayerActivity.showV354NetworkQualityIndicator354Toggle() {
    val current = BiliClient.prefs.v354networkQualityIndicator354
    BiliClient.prefs.v354networkQualityIndicator354 = !current
    AppToast.show(this, "Network Quality Indicator354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Auto Switch354
internal fun PlayerActivity.showV354NetworkAutoSwitch354Toggle() {
    val current = BiliClient.prefs.v354networkAutoSwitch354
    BiliClient.prefs.v354networkAutoSwitch354 = !current
    AppToast.show(this, "Network Auto Switch354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Bandwidth Limit354
internal fun PlayerActivity.showV354NetworkBandwidthLimit354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkBandwidthLimit354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkBandwidthLimit354 = value
        AppToast.show(this, "Network Bandwidth Limit354: $value")
    }
}

// v354: Network Latency Display354
internal fun PlayerActivity.showV354NetworkLatencyDisplay354Toggle() {
    val current = BiliClient.prefs.v354networkLatencyDisplay354
    BiliClient.prefs.v354networkLatencyDisplay354 = !current
    AppToast.show(this, "Network Latency Display354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Packet Loss Alert354
internal fun PlayerActivity.showV354NetworkPacketLossAlert354Toggle() {
    val current = BiliClient.prefs.v354networkPacketLossAlert354
    BiliClient.prefs.v354networkPacketLossAlert354 = !current
    AppToast.show(this, "Network Packet Loss Alert354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Retry Strategy354
internal fun PlayerActivity.showV354NetworkRetryStrategy354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkRetryStrategy354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkRetryStrategy354 = value
        AppToast.show(this, "Network Retry Strategy354: $value")
    }
}

// v354: Network Timeout Custom354
internal fun PlayerActivity.showV354NetworkTimeoutCustom354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkTimeoutCustom354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkTimeoutCustom354 = value
        AppToast.show(this, "Network Timeout Custom354: $value")
    }
}

// v354: Network DNS优选354
internal fun PlayerActivity.showV354NetworkDNS优选354Toggle() {
    val current = BiliClient.prefs.v354networkDNS优选354
    BiliClient.prefs.v354networkDNS优选354 = !current
    AppToast.show(this, "Network DNS优选354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network IPv6优先354
internal fun PlayerActivity.showV354NetworkIPv6优先354Toggle() {
    val current = BiliClient.prefs.v354networkIPv6优先354
    BiliClient.prefs.v354networkIPv6优先354 = !current
    AppToast.show(this, "Network IPv6优先354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Proxy Custom354
internal fun PlayerActivity.showV354NetworkProxyCustom354Toggle() {
    val current = BiliClient.prefs.v354networkProxyCustom354
    BiliClient.prefs.v354networkProxyCustom354 = !current
    AppToast.show(this, "Network Proxy Custom354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Cache Strategy354
internal fun PlayerActivity.showV354NetworkCacheStrategy354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkCacheStrategy354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkCacheStrategy354 = value
        AppToast.show(this, "Network Cache Strategy354: $value")
    }
}

// v354: Network Connection Pool354
internal fun PlayerActivity.showV354NetworkConnectionPool354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkConnectionPool354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkConnectionPool354 = value
        AppToast.show(this, "Network Connection Pool354: $value")
    }
}

// v354: Network Keep Alive354
internal fun PlayerActivity.showV354NetworkKeepAlive354Toggle() {
    val current = BiliClient.prefs.v354networkKeepAlive354
    BiliClient.prefs.v354networkKeepAlive354 = !current
    AppToast.show(this, "Network Keep Alive354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Compression354
internal fun PlayerActivity.showV354NetworkCompression354Toggle() {
    val current = BiliClient.prefs.v354networkCompression354
    BiliClient.prefs.v354networkCompression354 = !current
    AppToast.show(this, "Network Compression354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Encryption354
internal fun PlayerActivity.showV354NetworkEncryption354Toggle() {
    val current = BiliClient.prefs.v354networkEncryption354
    BiliClient.prefs.v354networkEncryption354 = !current
    AppToast.show(this, "Network Encryption354: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Quality Indicator355
internal fun PlayerActivity.showV355NetworkQualityIndicator355Toggle() {
    val current = BiliClient.prefs.v355networkQualityIndicator355
    BiliClient.prefs.v355networkQualityIndicator355 = !current
    AppToast.show(this, "Network Quality Indicator355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Auto Switch355
internal fun PlayerActivity.showV355NetworkAutoSwitch355Toggle() {
    val current = BiliClient.prefs.v355networkAutoSwitch355
    BiliClient.prefs.v355networkAutoSwitch355 = !current
    AppToast.show(this, "Network Auto Switch355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Bandwidth Limit355
internal fun PlayerActivity.showV355NetworkBandwidthLimit355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkBandwidthLimit355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkBandwidthLimit355 = value
        AppToast.show(this, "Network Bandwidth Limit355: $value")
    }
}

// v355: Network Latency Display355
internal fun PlayerActivity.showV355NetworkLatencyDisplay355Toggle() {
    val current = BiliClient.prefs.v355networkLatencyDisplay355
    BiliClient.prefs.v355networkLatencyDisplay355 = !current
    AppToast.show(this, "Network Latency Display355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Packet Loss Alert355
internal fun PlayerActivity.showV355NetworkPacketLossAlert355Toggle() {
    val current = BiliClient.prefs.v355networkPacketLossAlert355
    BiliClient.prefs.v355networkPacketLossAlert355 = !current
    AppToast.show(this, "Network Packet Loss Alert355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Retry Strategy355
internal fun PlayerActivity.showV355NetworkRetryStrategy355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkRetryStrategy355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkRetryStrategy355 = value
        AppToast.show(this, "Network Retry Strategy355: $value")
    }
}

// v355: Network Timeout Custom355
internal fun PlayerActivity.showV355NetworkTimeoutCustom355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkTimeoutCustom355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkTimeoutCustom355 = value
        AppToast.show(this, "Network Timeout Custom355: $value")
    }
}

// v355: Network DNS优选355
internal fun PlayerActivity.showV355NetworkDNS优选355Toggle() {
    val current = BiliClient.prefs.v355networkDNS优选355
    BiliClient.prefs.v355networkDNS优选355 = !current
    AppToast.show(this, "Network DNS优选355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network IPv6优先355
internal fun PlayerActivity.showV355NetworkIPv6优先355Toggle() {
    val current = BiliClient.prefs.v355networkIPv6优先355
    BiliClient.prefs.v355networkIPv6优先355 = !current
    AppToast.show(this, "Network IPv6优先355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Proxy Custom355
internal fun PlayerActivity.showV355NetworkProxyCustom355Toggle() {
    val current = BiliClient.prefs.v355networkProxyCustom355
    BiliClient.prefs.v355networkProxyCustom355 = !current
    AppToast.show(this, "Network Proxy Custom355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Cache Strategy355
internal fun PlayerActivity.showV355NetworkCacheStrategy355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkCacheStrategy355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkCacheStrategy355 = value
        AppToast.show(this, "Network Cache Strategy355: $value")
    }
}

// v355: Network Connection Pool355
internal fun PlayerActivity.showV355NetworkConnectionPool355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkConnectionPool355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkConnectionPool355 = value
        AppToast.show(this, "Network Connection Pool355: $value")
    }
}

// v355: Network Keep Alive355
internal fun PlayerActivity.showV355NetworkKeepAlive355Toggle() {
    val current = BiliClient.prefs.v355networkKeepAlive355
    BiliClient.prefs.v355networkKeepAlive355 = !current
    AppToast.show(this, "Network Keep Alive355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Compression355
internal fun PlayerActivity.showV355NetworkCompression355Toggle() {
    val current = BiliClient.prefs.v355networkCompression355
    BiliClient.prefs.v355networkCompression355 = !current
    AppToast.show(this, "Network Compression355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Encryption355
internal fun PlayerActivity.showV355NetworkEncryption355Toggle() {
    val current = BiliClient.prefs.v355networkEncryption355
    BiliClient.prefs.v355networkEncryption355 = !current
    AppToast.show(this, "Network Encryption355: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Quality Indicator356
internal fun PlayerActivity.showV356NetworkQualityIndicator356Toggle() {
    val current = BiliClient.prefs.v356networkQualityIndicator356
    BiliClient.prefs.v356networkQualityIndicator356 = !current
    AppToast.show(this, "Network Quality Indicator356: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Auto Switch356
internal fun PlayerActivity.showV356NetworkAutoSwitch356Toggle() {
    val current = BiliClient.prefs.v356networkAutoSwitch356
    BiliClient.prefs.v356networkAutoSwitch356 = !current
    AppToast.show(this, "Network Auto Switch356: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Bandwidth Limit356
internal fun PlayerActivity.showV356NetworkBandwidthLimit356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkBandwidthLimit356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkBandwidthLimit356 = value
        AppToast.show(this, "Network Bandwidth Limit356: $value")
    }
}

// v356: Network Latency Display356
internal fun PlayerActivity.showV356NetworkLatencyDisplay356Toggle() {
    val current = BiliClient.prefs.v356networkLatencyDisplay356
    BiliClient.prefs.v356networkLatencyDisplay356 = !current
    AppToast.show(this, "Network Latency Display356: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Packet Loss Alert356
internal fun PlayerActivity.showV356NetworkPacketLossAlert356Toggle() {
    val current = BiliClient.prefs.v356networkPacketLossAlert356
    BiliClient.prefs.v356networkPacketLossAlert356 = !current
    AppToast.show(this, "Network Packet Loss Alert356: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Retry Strategy356
internal fun PlayerActivity.showV356NetworkRetryStrategy356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkRetryStrategy356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkRetryStrategy356 = value
        AppToast.show(this, "Network Retry Strategy356: $value")
    }
}

// v356: Network Timeout Custom356
internal fun PlayerActivity.showV356NetworkTimeoutCustom356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkTimeoutCustom356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkTimeoutCustom356 = value
        AppToast.show(this, "Network Timeout Custom356: $value")
    }
}

// v356: Network DNS优选356
internal fun PlayerActivity.showV356NetworkDNS优选356Toggle() {
    val current = BiliClient.prefs.v356networkDNS优选356
    BiliClient.prefs.v356networkDNS优选356 = !current
    AppToast.show(this, "Network DNS优选356: ${if (!current) "ON" else "OFF"}")
}

