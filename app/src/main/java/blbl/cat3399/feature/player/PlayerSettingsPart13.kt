package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v183: Gesture Edge Swipe Up183
internal fun PlayerActivity.showV183GestureEdgeSwipeUp183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183gestureEdgeSwipeUp183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Up183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183gestureEdgeSwipeUp183 = value
        AppToast.show(this, "Gesture Edge Swipe Up183: $value")
    }
}

// v183: Cast Audio Channel
internal fun PlayerActivity.showV183CastAudioChannelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183castAudioChannel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Channel",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183castAudioChannel = value
        AppToast.show(this, "Cast Audio Channel: $value")
    }
}

// v183: Playlist Loop All183
internal fun PlayerActivity.showV183PlaylistLoopAll183Toggle() {
    val current = BiliClient.prefs.v183playlistLoopAll183
    BiliClient.prefs.v183playlistLoopAll183 = !current
    AppToast.show(this, "Playlist Loop All183: ${if (!current) "ON" else "OFF"}")
}

// v183: Cache Download Batch183
internal fun PlayerActivity.showV183CacheDownloadBatch183Toggle() {
    val current = BiliClient.prefs.v183cacheDownloadBatch183
    BiliClient.prefs.v183cacheDownloadBatch183 = !current
    AppToast.show(this, "Cache Download Batch183: ${if (!current) "ON" else "OFF"}")
}

// v183: Progress Bar Thumb Glow183
internal fun PlayerActivity.showV183ProgressBarThumbGlow183Toggle() {
    val current = BiliClient.prefs.v183progressBarThumbGlow183
    BiliClient.prefs.v183progressBarThumbGlow183 = !current
    AppToast.show(this, "Progress Bar Thumb Glow183: ${if (!current) "ON" else "OFF"}")
}

// v183: Volume Boost Level183
internal fun PlayerActivity.showV183VolumeBoostLevel183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183volumeBoostLevel183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Level183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183volumeBoostLevel183 = value
        AppToast.show(this, "Volume Boost Level183: $value")
    }
}

// v183: History Bookmark Color
internal fun PlayerActivity.showV183HistoryBookmarkColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183historyBookmarkColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Bookmark Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183historyBookmarkColor = value
        AppToast.show(this, "History Bookmark Color: $value")
    }
}

// v183: Playback Chapter Prev
internal fun PlayerActivity.showV183PlaybackChapterPrevToggle() {
    val current = BiliClient.prefs.v183playbackChapterPrev
    BiliClient.prefs.v183playbackChapterPrev = !current
    AppToast.show(this, "Playback Chapter Prev: ${if (!current) "ON" else "OFF"}")
}

// v183: Screenshot Crop Toggle
internal fun PlayerActivity.showV183ScreenshotCropToggleToggle() {
    val current = BiliClient.prefs.v183screenshotCropToggle
    BiliClient.prefs.v183screenshotCropToggle = !current
    AppToast.show(this, "Screenshot Crop Toggle: ${if (!current) "ON" else "OFF"}")
}

// v183: Video HDR10 Level183
internal fun PlayerActivity.showV183VideoHDR10Level183Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183videoHDR10Level183).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 Level183",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183videoHDR10Level183 = value
        AppToast.show(this, "Video HDR10 Level183: $value")
    }
}

// v183: Danmaku Fixed Color
internal fun PlayerActivity.showV183DanmakuFixedColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183danmakuFixedColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183danmakuFixedColor = value
        AppToast.show(this, "Danmaku Fixed Color: $value")
    }
}

// v183: Subtitle Bg Color184
internal fun PlayerActivity.showV183SubtitleBgColor184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v183subtitleBgColor184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v183subtitleBgColor184 = value
        AppToast.show(this, "Subtitle Bg Color184: $value")
    }
}

// v184: Audio Reverb Mix184
internal fun PlayerActivity.showV184AudioReverbMix184Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v184audioReverbMix184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Mix184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184audioReverbMix184 = value
        AppToast.show(this, "Audio Reverb Mix184: $value")
    }
}

// v184: Danmaku Fixed Color184
internal fun PlayerActivity.showV184DanmakuFixedColor184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184danmakuFixedColor184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Color184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184danmakuFixedColor184 = value
        AppToast.show(this, "Danmaku Fixed Color184: $value")
    }
}

// v184: Subtitle Bg Color185
internal fun PlayerActivity.showV184SubtitleBgColor185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184subtitleBgColor185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184subtitleBgColor185 = value
        AppToast.show(this, "Subtitle Bg Color185: $value")
    }
}

// v184: Gesture Edge Swipe Down184
internal fun PlayerActivity.showV184GestureEdgeSwipeDown184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184gestureEdgeSwipeDown184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Down184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184gestureEdgeSwipeDown184 = value
        AppToast.show(this, "Gesture Edge Swipe Down184: $value")
    }
}

// v184: Cast Audio Channel184
internal fun PlayerActivity.showV184CastAudioChannel184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184castAudioChannel184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Channel184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184castAudioChannel184 = value
        AppToast.show(this, "Cast Audio Channel184: $value")
    }
}

// v184: Playlist Loop All184
internal fun PlayerActivity.showV184PlaylistLoopAll184Toggle() {
    val current = BiliClient.prefs.v184playlistLoopAll184
    BiliClient.prefs.v184playlistLoopAll184 = !current
    AppToast.show(this, "Playlist Loop All184: ${if (!current) "ON" else "OFF"}")
}

// v184: Cache Download Batch184
internal fun PlayerActivity.showV184CacheDownloadBatch184Toggle() {
    val current = BiliClient.prefs.v184cacheDownloadBatch184
    BiliClient.prefs.v184cacheDownloadBatch184 = !current
    AppToast.show(this, "Cache Download Batch184: ${if (!current) "ON" else "OFF"}")
}

// v184: Progress Bar Thumb Glow184
internal fun PlayerActivity.showV184ProgressBarThumbGlow184Toggle() {
    val current = BiliClient.prefs.v184progressBarThumbGlow184
    BiliClient.prefs.v184progressBarThumbGlow184 = !current
    AppToast.show(this, "Progress Bar Thumb Glow184: ${if (!current) "ON" else "OFF"}")
}

// v184: Volume Boost Gain184
internal fun PlayerActivity.showV184VolumeBoostGain184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184volumeBoostGain184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Gain184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184volumeBoostGain184 = value
        AppToast.show(this, "Volume Boost Gain184: $value")
    }
}

// v184: History Bookmark Color184
internal fun PlayerActivity.showV184HistoryBookmarkColor184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184historyBookmarkColor184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Bookmark Color184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184historyBookmarkColor184 = value
        AppToast.show(this, "History Bookmark Color184: $value")
    }
}

// v184: Playback Chapter Prev184
internal fun PlayerActivity.showV184PlaybackChapterPrev184Toggle() {
    val current = BiliClient.prefs.v184playbackChapterPrev184
    BiliClient.prefs.v184playbackChapterPrev184 = !current
    AppToast.show(this, "Playback Chapter Prev184: ${if (!current) "ON" else "OFF"}")
}

// v184: Screenshot Crop Toggle184
internal fun PlayerActivity.showV184ScreenshotCropToggle184Toggle() {
    val current = BiliClient.prefs.v184screenshotCropToggle184
    BiliClient.prefs.v184screenshotCropToggle184 = !current
    AppToast.show(this, "Screenshot Crop Toggle184: ${if (!current) "ON" else "OFF"}")
}

// v184: Video HDR10 ToneMap184
internal fun PlayerActivity.showV184VideoHDR10ToneMap184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184videoHDR10ToneMap184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 ToneMap184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184videoHDR10ToneMap184 = value
        AppToast.show(this, "Video HDR10 ToneMap184: $value")
    }
}

// v184: Danmaku Fixed Size184
internal fun PlayerActivity.showV184DanmakuFixedSize184Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v184danmakuFixedSize184).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Size184",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v184danmakuFixedSize184 = value
        AppToast.show(this, "Danmaku Fixed Size184: $value")
    }
}

// v184: Subtitle Bg Border184
internal fun PlayerActivity.showV184SubtitleBgBorder184Toggle() {
    val current = BiliClient.prefs.v184subtitleBgBorder184
    BiliClient.prefs.v184subtitleBgBorder184 = !current
    AppToast.show(this, "Subtitle Bg Border184: ${if (!current) "ON" else "OFF"}")
}

// v185: Audio Stereo Widen185
internal fun PlayerActivity.showV185AudioStereoWiden185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185audioStereoWiden185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185audioStereoWiden185 = value
        AppToast.show(this, "Audio Stereo Widen185: $value")
    }
}

// v185: Danmaku Fixed Size185
internal fun PlayerActivity.showV185DanmakuFixedSize185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185danmakuFixedSize185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Size185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185danmakuFixedSize185 = value
        AppToast.show(this, "Danmaku Fixed Size185: $value")
    }
}

// v185: Subtitle Bg Border185
internal fun PlayerActivity.showV185SubtitleBgBorder185Toggle() {
    val current = BiliClient.prefs.v185subtitleBgBorder185
    BiliClient.prefs.v185subtitleBgBorder185 = !current
    AppToast.show(this, "Subtitle Bg Border185: ${if (!current) "ON" else "OFF"}")
}

// v185: Gesture Rotation Detect
internal fun PlayerActivity.showV185GestureRotationDetectToggle() {
    val current = BiliClient.prefs.v185gestureRotationDetect
    BiliClient.prefs.v185gestureRotationDetect = !current
    AppToast.show(this, "Gesture Rotation Detect: ${if (!current) "ON" else "OFF"}")
}

// v185: Cast Audio Channel185
internal fun PlayerActivity.showV185CastAudioChannel185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185castAudioChannel185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Channel185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185castAudioChannel185 = value
        AppToast.show(this, "Cast Audio Channel185: $value")
    }
}

// v185: Playlist Auto Skip Intro
internal fun PlayerActivity.showV185PlaylistAutoSkipIntroToggle() {
    val current = BiliClient.prefs.v185playlistAutoSkipIntro
    BiliClient.prefs.v185playlistAutoSkipIntro = !current
    AppToast.show(this, "Playlist Auto Skip Intro: ${if (!current) "ON" else "OFF"}")
}

// v185: Cache Download Concurrent
internal fun PlayerActivity.showV185CacheDownloadConcurrentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185cacheDownloadConcurrent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Concurrent",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185cacheDownloadConcurrent = value
        AppToast.show(this, "Cache Download Concurrent: $value")
    }
}

// v185: Progress Bar Thumb Shadow185
internal fun PlayerActivity.showV185ProgressBarThumbShadow185Toggle() {
    val current = BiliClient.prefs.v185progressBarThumbShadow185
    BiliClient.prefs.v185progressBarThumbShadow185 = !current
    AppToast.show(this, "Progress Bar Thumb Shadow185: ${if (!current) "ON" else "OFF"}")
}

// v185: Volume Boost Gain185
internal fun PlayerActivity.showV185VolumeBoostGain185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185volumeBoostGain185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Gain185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185volumeBoostGain185 = value
        AppToast.show(this, "Volume Boost Gain185: $value")
    }
}

// v185: History Bookmark Note
internal fun PlayerActivity.showV185HistoryBookmarkNoteToggle() {
    val current = BiliClient.prefs.v185historyBookmarkNote
    BiliClient.prefs.v185historyBookmarkNote = !current
    AppToast.show(this, "History Bookmark Note: ${if (!current) "ON" else "OFF"}")
}

// v185: Playback Chapter List
internal fun PlayerActivity.showV185PlaybackChapterListToggle() {
    val current = BiliClient.prefs.v185playbackChapterList
    BiliClient.prefs.v185playbackChapterList = !current
    AppToast.show(this, "Playback Chapter List: ${if (!current) "ON" else "OFF"}")
}

// v185: Screenshot Crop Ratio
internal fun PlayerActivity.showV185ScreenshotCropRatioDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185screenshotCropRatio).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Crop Ratio",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185screenshotCropRatio = value
        AppToast.show(this, "Screenshot Crop Ratio: $value")
    }
}

// v185: Video HDR10 ToneMap185
internal fun PlayerActivity.showV185VideoHDR10ToneMap185Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v185videoHDR10ToneMap185).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video HDR10 ToneMap185",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v185videoHDR10ToneMap185 = value
        AppToast.show(this, "Video HDR10 ToneMap185: $value")
    }
}

// v185: Danmaku Fixed Shadow
internal fun PlayerActivity.showV185DanmakuFixedShadowToggle() {
    val current = BiliClient.prefs.v185danmakuFixedShadow
    BiliClient.prefs.v185danmakuFixedShadow = !current
    AppToast.show(this, "Danmaku Fixed Shadow: ${if (!current) "ON" else "OFF"}")
}

// v185: Subtitle Bg Border186
internal fun PlayerActivity.showV185SubtitleBgBorder186Toggle() {
    val current = BiliClient.prefs.v185subtitleBgBorder186
    BiliClient.prefs.v185subtitleBgBorder186 = !current
    AppToast.show(this, "Subtitle Bg Border186: ${if (!current) "ON" else "OFF"}")
}

// v186: Audio Stereo Widen186
internal fun PlayerActivity.showV186AudioStereoWiden186Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v186audioStereoWiden186).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen186",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v186audioStereoWiden186 = value
        AppToast.show(this, "Audio Stereo Widen186: $value")
    }
}

// v186: Danmaku Fixed Shadow186
internal fun PlayerActivity.showV186DanmakuFixedShadow186Toggle() {
    val current = BiliClient.prefs.v186danmakuFixedShadow186
    BiliClient.prefs.v186danmakuFixedShadow186 = !current
    AppToast.show(this, "Danmaku Fixed Shadow186: ${if (!current) "ON" else "OFF"}")
}

// v186: Subtitle Bg Border187
internal fun PlayerActivity.showV186SubtitleBgBorder187Toggle() {
    val current = BiliClient.prefs.v186subtitleBgBorder187
    BiliClient.prefs.v186subtitleBgBorder187 = !current
    AppToast.show(this, "Subtitle Bg Border187: ${if (!current) "ON" else "OFF"}")
}

// v186: Gesture Rotation Detect186
internal fun PlayerActivity.showV186GestureRotationDetect186Toggle() {
    val current = BiliClient.prefs.v186gestureRotationDetect186
    BiliClient.prefs.v186gestureRotationDetect186 = !current
    AppToast.show(this, "Gesture Rotation Detect186: ${if (!current) "ON" else "OFF"}")
}

// v186: Cast Audio Sync
internal fun PlayerActivity.showV186CastAudioSyncToggle() {
    val current = BiliClient.prefs.v186castAudioSync
    BiliClient.prefs.v186castAudioSync = !current
    AppToast.show(this, "Cast Audio Sync: ${if (!current) "ON" else "OFF"}")
}

// v186: Playlist Auto Skip Intro186
internal fun PlayerActivity.showV186PlaylistAutoSkipIntro186Toggle() {
    val current = BiliClient.prefs.v186playlistAutoSkipIntro186
    BiliClient.prefs.v186playlistAutoSkipIntro186 = !current
    AppToast.show(this, "Playlist Auto Skip Intro186: ${if (!current) "ON" else "OFF"}")
}

// v186: Cache Download Concurrent186
internal fun PlayerActivity.showV186CacheDownloadConcurrent186Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v186cacheDownloadConcurrent186).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Concurrent186",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v186cacheDownloadConcurrent186 = value
        AppToast.show(this, "Cache Download Concurrent186: $value")
    }
}

// v186: Progress Bar Thumb Shadow186
internal fun PlayerActivity.showV186ProgressBarThumbShadow186Toggle() {
    val current = BiliClient.prefs.v186progressBarThumbShadow186
    BiliClient.prefs.v186progressBarThumbShadow186 = !current
    AppToast.show(this, "Progress Bar Thumb Shadow186: ${if (!current) "ON" else "OFF"}")
}

// v186: Volume Boost Auto186
internal fun PlayerActivity.showV186VolumeBoostAuto186Toggle() {
    val current = BiliClient.prefs.v186volumeBoostAuto186
    BiliClient.prefs.v186volumeBoostAuto186 = !current
    AppToast.show(this, "Volume Boost Auto186: ${if (!current) "ON" else "OFF"}")
}

// v186: History Bookmark Note186
internal fun PlayerActivity.showV186HistoryBookmarkNote186Toggle() {
    val current = BiliClient.prefs.v186historyBookmarkNote186
    BiliClient.prefs.v186historyBookmarkNote186 = !current
    AppToast.show(this, "History Bookmark Note186: ${if (!current) "ON" else "OFF"}")
}

// v186: Playback Chapter List186
internal fun PlayerActivity.showV186PlaybackChapterList186Toggle() {
    val current = BiliClient.prefs.v186playbackChapterList186
    BiliClient.prefs.v186playbackChapterList186 = !current
    AppToast.show(this, "Playback Chapter List186: ${if (!current) "ON" else "OFF"}")
}

// v186: Screenshot Crop Ratio186
internal fun PlayerActivity.showV186ScreenshotCropRatio186Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v186screenshotCropRatio186).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Crop Ratio186",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v186screenshotCropRatio186 = value
        AppToast.show(this, "Screenshot Crop Ratio186: $value")
    }
}

// v186: Video Wide Gamut186
internal fun PlayerActivity.showV186VideoWideGamut186Toggle() {
    val current = BiliClient.prefs.v186videoWideGamut186
    BiliClient.prefs.v186videoWideGamut186 = !current
    AppToast.show(this, "Video Wide Gamut186: ${if (!current) "ON" else "OFF"}")
}

// v186: Danmaku Fixed Outline
internal fun PlayerActivity.showV186DanmakuFixedOutlineToggle() {
    val current = BiliClient.prefs.v186danmakuFixedOutline
    BiliClient.prefs.v186danmakuFixedOutline = !current
    AppToast.show(this, "Danmaku Fixed Outline: ${if (!current) "ON" else "OFF"}")
}

// v186: Subtitle Bg Border188
internal fun PlayerActivity.showV186SubtitleBgBorder188Toggle() {
    val current = BiliClient.prefs.v186subtitleBgBorder188
    BiliClient.prefs.v186subtitleBgBorder188 = !current
    AppToast.show(this, "Subtitle Bg Border188: ${if (!current) "ON" else "OFF"}")
}

// v187: Audio Stereo Widen187
internal fun PlayerActivity.showV187AudioStereoWiden187Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v187audioStereoWiden187).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen187",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v187audioStereoWiden187 = value
        AppToast.show(this, "Audio Stereo Widen187: $value")
    }
}

// v187: Danmaku Fixed Outline187
internal fun PlayerActivity.showV187DanmakuFixedOutline187Toggle() {
    val current = BiliClient.prefs.v187danmakuFixedOutline187
    BiliClient.prefs.v187danmakuFixedOutline187 = !current
    AppToast.show(this, "Danmaku Fixed Outline187: ${if (!current) "ON" else "OFF"}")
}

// v187: Subtitle Bg Border189
internal fun PlayerActivity.showV187SubtitleBgBorder189Toggle() {
    val current = BiliClient.prefs.v187subtitleBgBorder189
    BiliClient.prefs.v187subtitleBgBorder189 = !current
    AppToast.show(this, "Subtitle Bg Border189: ${if (!current) "ON" else "OFF"}")
}

// v187: Gesture Rotation Lock
internal fun PlayerActivity.showV187GestureRotationLockToggle() {
    val current = BiliClient.prefs.v187gestureRotationLock
    BiliClient.prefs.v187gestureRotationLock = !current
    AppToast.show(this, "Gesture Rotation Lock: ${if (!current) "ON" else "OFF"}")
}

// v187: Cast Audio Sync187
internal fun PlayerActivity.showV187CastAudioSync187Toggle() {
    val current = BiliClient.prefs.v187castAudioSync187
    BiliClient.prefs.v187castAudioSync187 = !current
    AppToast.show(this, "Cast Audio Sync187: ${if (!current) "ON" else "OFF"}")
}

// v187: Playlist Auto Skip Outro
internal fun PlayerActivity.showV187PlaylistAutoSkipOutroToggle() {
    val current = BiliClient.prefs.v187playlistAutoSkipOutro
    BiliClient.prefs.v187playlistAutoSkipOutro = !current
    AppToast.show(this, "Playlist Auto Skip Outro: ${if (!current) "ON" else "OFF"}")
}

// v187: Cache Download Pause
internal fun PlayerActivity.showV187CacheDownloadPauseToggle() {
    val current = BiliClient.prefs.v187cacheDownloadPause
    BiliClient.prefs.v187cacheDownloadPause = !current
    AppToast.show(this, "Cache Download Pause: ${if (!current) "ON" else "OFF"}")
}

// v187: Progress Bar Thumb Border187
internal fun PlayerActivity.showV187ProgressBarThumbBorder187Toggle() {
    val current = BiliClient.prefs.v187progressBarThumbBorder187
    BiliClient.prefs.v187progressBarThumbBorder187 = !current
    AppToast.show(this, "Progress Bar Thumb Border187: ${if (!current) "ON" else "OFF"}")
}

// v187: Volume Boost Auto187
internal fun PlayerActivity.showV187VolumeBoostAuto187Toggle() {
    val current = BiliClient.prefs.v187volumeBoostAuto187
    BiliClient.prefs.v187volumeBoostAuto187 = !current
    AppToast.show(this, "Volume Boost Auto187: ${if (!current) "ON" else "OFF"}")
}

// v187: History Bookmark Share
internal fun PlayerActivity.showV187HistoryBookmarkShareToggle() {
    val current = BiliClient.prefs.v187historyBookmarkShare
    BiliClient.prefs.v187historyBookmarkShare = !current
    AppToast.show(this, "History Bookmark Share: ${if (!current) "ON" else "OFF"}")
}

// v187: Playback Chapter Auto Detect
internal fun PlayerActivity.showV187PlaybackChapterAutoDetectToggle() {
    val current = BiliClient.prefs.v187playbackChapterAutoDetect
    BiliClient.prefs.v187playbackChapterAutoDetect = !current
    AppToast.show(this, "Playback Chapter Auto Detect: ${if (!current) "ON" else "OFF"}")
}

// v187: Screenshot Crop Freeform
internal fun PlayerActivity.showV187ScreenshotCropFreeformToggle() {
    val current = BiliClient.prefs.v187screenshotCropFreeform
    BiliClient.prefs.v187screenshotCropFreeform = !current
    AppToast.show(this, "Screenshot Crop Freeform: ${if (!current) "ON" else "OFF"}")
}

// v187: Video Wide Gamut187
internal fun PlayerActivity.showV187VideoWideGamut187Toggle() {
    val current = BiliClient.prefs.v187videoWideGamut187
    BiliClient.prefs.v187videoWideGamut187 = !current
    AppToast.show(this, "Video Wide Gamut187: ${if (!current) "ON" else "OFF"}")
}

// v187: Danmaku Fixed Outline188
internal fun PlayerActivity.showV187DanmakuFixedOutline188Toggle() {
    val current = BiliClient.prefs.v187danmakuFixedOutline188
    BiliClient.prefs.v187danmakuFixedOutline188 = !current
    AppToast.show(this, "Danmaku Fixed Outline188: ${if (!current) "ON" else "OFF"}")
}

// v187: Subtitle Bg Border190
internal fun PlayerActivity.showV187SubtitleBgBorder190Toggle() {
    val current = BiliClient.prefs.v187subtitleBgBorder190
    BiliClient.prefs.v187subtitleBgBorder190 = !current
    AppToast.show(this, "Subtitle Bg Border190: ${if (!current) "ON" else "OFF"}")
}

// v188: Audio Stereo Widen188
internal fun PlayerActivity.showV188AudioStereoWiden188Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v188audioStereoWiden188).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Widen188",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v188audioStereoWiden188 = value
        AppToast.show(this, "Audio Stereo Widen188: $value")
    }
}

// v188: Danmaku Fixed Outline189
internal fun PlayerActivity.showV188DanmakuFixedOutline189Toggle() {
    val current = BiliClient.prefs.v188danmakuFixedOutline189
    BiliClient.prefs.v188danmakuFixedOutline189 = !current
    AppToast.show(this, "Danmaku Fixed Outline189: ${if (!current) "ON" else "OFF"}")
}

// v188: Subtitle Bg Border191
internal fun PlayerActivity.showV188SubtitleBgBorder191Toggle() {
    val current = BiliClient.prefs.v188subtitleBgBorder191
    BiliClient.prefs.v188subtitleBgBorder191 = !current
    AppToast.show(this, "Subtitle Bg Border191: ${if (!current) "ON" else "OFF"}")
}

// v188: Gesture Rotation Lock188
internal fun PlayerActivity.showV188GestureRotationLock188Toggle() {
    val current = BiliClient.prefs.v188gestureRotationLock188
    BiliClient.prefs.v188gestureRotationLock188 = !current
    AppToast.show(this, "Gesture Rotation Lock188: ${if (!current) "ON" else "OFF"}")
}

// v188: Cast Audio Delay
internal fun PlayerActivity.showV188CastAudioDelayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v188castAudioDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v188castAudioDelay = value
        AppToast.show(this, "Cast Audio Delay: $value")
    }
}

// v188: Playlist Auto Skip Outro188
internal fun PlayerActivity.showV188PlaylistAutoSkipOutro188Toggle() {
    val current = BiliClient.prefs.v188playlistAutoSkipOutro188
    BiliClient.prefs.v188playlistAutoSkipOutro188 = !current
    AppToast.show(this, "Playlist Auto Skip Outro188: ${if (!current) "ON" else "OFF"}")
}

// v188: Cache Download Pause188
internal fun PlayerActivity.showV188CacheDownloadPause188Toggle() {
    val current = BiliClient.prefs.v188cacheDownloadPause188
    BiliClient.prefs.v188cacheDownloadPause188 = !current
    AppToast.show(this, "Cache Download Pause188: ${if (!current) "ON" else "OFF"}")
}

// v188: Progress Bar Thumb Border188
internal fun PlayerActivity.showV188ProgressBarThumbBorder188Toggle() {
    val current = BiliClient.prefs.v188progressBarThumbBorder188
    BiliClient.prefs.v188progressBarThumbBorder188 = !current
    AppToast.show(this, "Progress Bar Thumb Border188: ${if (!current) "ON" else "OFF"}")
}

// v188: Volume Boost Peak188
internal fun PlayerActivity.showV188VolumeBoostPeak188Toggle() {
    val current = BiliClient.prefs.v188volumeBoostPeak188
    BiliClient.prefs.v188volumeBoostPeak188 = !current
    AppToast.show(this, "Volume Boost Peak188: ${if (!current) "ON" else "OFF"}")
}

// v188: History Bookmark Share188
internal fun PlayerActivity.showV188HistoryBookmarkShare188Toggle() {
    val current = BiliClient.prefs.v188historyBookmarkShare188
    BiliClient.prefs.v188historyBookmarkShare188 = !current
    AppToast.show(this, "History Bookmark Share188: ${if (!current) "ON" else "OFF"}")
}

// v188: Playback Chapter Auto Detect188
internal fun PlayerActivity.showV188PlaybackChapterAutoDetect188Toggle() {
    val current = BiliClient.prefs.v188playbackChapterAutoDetect188
    BiliClient.prefs.v188playbackChapterAutoDetect188 = !current
    AppToast.show(this, "Playback Chapter Auto Detect188: ${if (!current) "ON" else "OFF"}")
}

// v188: Screenshot Crop Freeform188
internal fun PlayerActivity.showV188ScreenshotCropFreeform188Toggle() {
    val current = BiliClient.prefs.v188screenshotCropFreeform188
    BiliClient.prefs.v188screenshotCropFreeform188 = !current
    AppToast.show(this, "Screenshot Crop Freeform188: ${if (!current) "ON" else "OFF"}")
}

// v188: Video Wide Gamut188
internal fun PlayerActivity.showV188VideoWideGamut188Toggle() {
    val current = BiliClient.prefs.v188videoWideGamut188
    BiliClient.prefs.v188videoWideGamut188 = !current
    AppToast.show(this, "Video Wide Gamut188: ${if (!current) "ON" else "OFF"}")
}

// v188: Danmaku Fixed Outline190
internal fun PlayerActivity.showV188DanmakuFixedOutline190Toggle() {
    val current = BiliClient.prefs.v188danmakuFixedOutline190
    BiliClient.prefs.v188danmakuFixedOutline190 = !current
    AppToast.show(this, "Danmaku Fixed Outline190: ${if (!current) "ON" else "OFF"}")
}

// v188: Subtitle Bg Border192
internal fun PlayerActivity.showV188SubtitleBgBorder192Toggle() {
    val current = BiliClient.prefs.v188subtitleBgBorder192
    BiliClient.prefs.v188subtitleBgBorder192 = !current
    AppToast.show(this, "Subtitle Bg Border192: ${if (!current) "ON" else "OFF"}")
}

// v189: Audio Mono Toggle189
internal fun PlayerActivity.showV189AudioMonoToggle189Toggle() {
    val current = BiliClient.prefs.v189audioMonoToggle189
    BiliClient.prefs.v189audioMonoToggle189 = !current
    AppToast.show(this, "Audio Mono Toggle189: ${if (!current) "ON" else "OFF"}")
}

// v189: Danmaku Fixed Outline191
internal fun PlayerActivity.showV189DanmakuFixedOutline191Toggle() {
    val current = BiliClient.prefs.v189danmakuFixedOutline191
    BiliClient.prefs.v189danmakuFixedOutline191 = !current
    AppToast.show(this, "Danmaku Fixed Outline191: ${if (!current) "ON" else "OFF"}")
}

// v189: Subtitle Bg Border193
internal fun PlayerActivity.showV189SubtitleBgBorder193Toggle() {
    val current = BiliClient.prefs.v189subtitleBgBorder193
    BiliClient.prefs.v189subtitleBgBorder193 = !current
    AppToast.show(this, "Subtitle Bg Border193: ${if (!current) "ON" else "OFF"}")
}

// v189: Gesture Rotation Sensitivity
internal fun PlayerActivity.showV189GestureRotationSensitivityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v189gestureRotationSensitivity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Rotation Sensitivity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v189gestureRotationSensitivity = value
        AppToast.show(this, "Gesture Rotation Sensitivity: $value")
    }
}

// v189: Cast Audio Delay189
internal fun PlayerActivity.showV189CastAudioDelay189Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v189castAudioDelay189).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay189",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v189castAudioDelay189 = value
        AppToast.show(this, "Cast Audio Delay189: $value")
    }
}

// v189: Playlist Auto Skip Outro189
internal fun PlayerActivity.showV189PlaylistAutoSkipOutro189Toggle() {
    val current = BiliClient.prefs.v189playlistAutoSkipOutro189
    BiliClient.prefs.v189playlistAutoSkipOutro189 = !current
    AppToast.show(this, "Playlist Auto Skip Outro189: ${if (!current) "ON" else "OFF"}")
}

// v189: Cache Download Speed189
internal fun PlayerActivity.showV189CacheDownloadSpeed189Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v189cacheDownloadSpeed189).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed189",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v189cacheDownloadSpeed189 = value
        AppToast.show(this, "Cache Download Speed189: $value")
    }
}

// v189: Progress Bar Thumb Border189
internal fun PlayerActivity.showV189ProgressBarThumbBorder189Toggle() {
    val current = BiliClient.prefs.v189progressBarThumbBorder189
    BiliClient.prefs.v189progressBarThumbBorder189 = !current
    AppToast.show(this, "Progress Bar Thumb Border189: ${if (!current) "ON" else "OFF"}")
}

// v189: Volume Boost Peak189
internal fun PlayerActivity.showV189VolumeBoostPeak189Toggle() {
    val current = BiliClient.prefs.v189volumeBoostPeak189
    BiliClient.prefs.v189volumeBoostPeak189 = !current
    AppToast.show(this, "Volume Boost Peak189: ${if (!current) "ON" else "OFF"}")
}

// v189: History Bookmark Export
internal fun PlayerActivity.showV189HistoryBookmarkExportToggle() {
    val current = BiliClient.prefs.v189historyBookmarkExport
    BiliClient.prefs.v189historyBookmarkExport = !current
    AppToast.show(this, "History Bookmark Export: ${if (!current) "ON" else "OFF"}")
}

// v189: Playback Chapter Sync
internal fun PlayerActivity.showV189PlaybackChapterSyncToggle() {
    val current = BiliClient.prefs.v189playbackChapterSync
    BiliClient.prefs.v189playbackChapterSync = !current
    AppToast.show(this, "Playback Chapter Sync: ${if (!current) "ON" else "OFF"}")
}

// v189: Screenshot Save Path
internal fun PlayerActivity.showV189ScreenshotSavePathToggle() {
    val current = BiliClient.prefs.v189screenshotSavePath
    BiliClient.prefs.v189screenshotSavePath = !current
    AppToast.show(this, "Screenshot Save Path: ${if (!current) "ON" else "OFF"}")
}

// v189: Video Wide Gamut189
internal fun PlayerActivity.showV189VideoWideGamut189Toggle() {
    val current = BiliClient.prefs.v189videoWideGamut189
    BiliClient.prefs.v189videoWideGamut189 = !current
    AppToast.show(this, "Video Wide Gamut189: ${if (!current) "ON" else "OFF"}")
}

// v189: Danmaku Fixed Border189
internal fun PlayerActivity.showV189DanmakuFixedBorder189Toggle() {
    val current = BiliClient.prefs.v189danmakuFixedBorder189
    BiliClient.prefs.v189danmakuFixedBorder189 = !current
    AppToast.show(this, "Danmaku Fixed Border189: ${if (!current) "ON" else "OFF"}")
}

// v189: Subtitle Bg Border194
internal fun PlayerActivity.showV189SubtitleBgBorder194Toggle() {
    val current = BiliClient.prefs.v189subtitleBgBorder194
    BiliClient.prefs.v189subtitleBgBorder194 = !current
    AppToast.show(this, "Subtitle Bg Border194: ${if (!current) "ON" else "OFF"}")
}

// v190: Audio Mono Toggle190
internal fun PlayerActivity.showV190AudioMonoToggle190Toggle() {
    val current = BiliClient.prefs.v190audioMonoToggle190
    BiliClient.prefs.v190audioMonoToggle190 = !current
    AppToast.show(this, "Audio Mono Toggle190: ${if (!current) "ON" else "OFF"}")
}

// v190: Danmaku Fixed Border190
internal fun PlayerActivity.showV190DanmakuFixedBorder190Toggle() {
    val current = BiliClient.prefs.v190danmakuFixedBorder190
    BiliClient.prefs.v190danmakuFixedBorder190 = !current
    AppToast.show(this, "Danmaku Fixed Border190: ${if (!current) "ON" else "OFF"}")
}

// v190: Subtitle Bg Border195
internal fun PlayerActivity.showV190SubtitleBgBorder195Toggle() {
    val current = BiliClient.prefs.v190subtitleBgBorder195
    BiliClient.prefs.v190subtitleBgBorder195 = !current
    AppToast.show(this, "Subtitle Bg Border195: ${if (!current) "ON" else "OFF"}")
}

// v190: Gesture Rotation Sensitivity190
internal fun PlayerActivity.showV190GestureRotationSensitivity190Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v190gestureRotationSensitivity190).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Rotation Sensitivity190",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v190gestureRotationSensitivity190 = value
        AppToast.show(this, "Gesture Rotation Sensitivity190: $value")
    }
}

// v190: Cast Audio Volume
internal fun PlayerActivity.showV190CastAudioVolumeDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v190castAudioVolume).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v190castAudioVolume = value
        AppToast.show(this, "Cast Audio Volume: $value")
    }
}

// v190: Playlist Auto Skip Intro190
internal fun PlayerActivity.showV190PlaylistAutoSkipIntro190Toggle() {
    val current = BiliClient.prefs.v190playlistAutoSkipIntro190
    BiliClient.prefs.v190playlistAutoSkipIntro190 = !current
    AppToast.show(this, "Playlist Auto Skip Intro190: ${if (!current) "ON" else "OFF"}")
}

// v190: Cache Download Speed190
internal fun PlayerActivity.showV190CacheDownloadSpeed190Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v190cacheDownloadSpeed190).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed190",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v190cacheDownloadSpeed190 = value
        AppToast.show(this, "Cache Download Speed190: $value")
    }
}

// v190: Progress Bar Thumb Border190
internal fun PlayerActivity.showV190ProgressBarThumbBorder190Toggle() {
    val current = BiliClient.prefs.v190progressBarThumbBorder190
    BiliClient.prefs.v190progressBarThumbBorder190 = !current
    AppToast.show(this, "Progress Bar Thumb Border190: ${if (!current) "ON" else "OFF"}")
}

// v190: Volume Boost Peak190
internal fun PlayerActivity.showV190VolumeBoostPeak190Toggle() {
    val current = BiliClient.prefs.v190volumeBoostPeak190
    BiliClient.prefs.v190volumeBoostPeak190 = !current
    AppToast.show(this, "Volume Boost Peak190: ${if (!current) "ON" else "OFF"}")
}

// v190: History Bookmark Export190
internal fun PlayerActivity.showV190HistoryBookmarkExport190Toggle() {
    val current = BiliClient.prefs.v190historyBookmarkExport190
    BiliClient.prefs.v190historyBookmarkExport190 = !current
    AppToast.show(this, "History Bookmark Export190: ${if (!current) "ON" else "OFF"}")
}

// v190: Playback Chapter Sync190
internal fun PlayerActivity.showV190PlaybackChapterSync190Toggle() {
    val current = BiliClient.prefs.v190playbackChapterSync190
    BiliClient.prefs.v190playbackChapterSync190 = !current
    AppToast.show(this, "Playback Chapter Sync190: ${if (!current) "ON" else "OFF"}")
}

// v190: Screenshot Save Path190
internal fun PlayerActivity.showV190ScreenshotSavePath190Toggle() {
    val current = BiliClient.prefs.v190screenshotSavePath190
    BiliClient.prefs.v190screenshotSavePath190 = !current
    AppToast.show(this, "Screenshot Save Path190: ${if (!current) "ON" else "OFF"}")
}

// v190: Video Color Space190
internal fun PlayerActivity.showV190VideoColorSpace190Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v190videoColorSpace190).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space190",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v190videoColorSpace190 = value
        AppToast.show(this, "Video Color Space190: $value")
    }
}

// v190: Danmaku Fixed Border191
internal fun PlayerActivity.showV190DanmakuFixedBorder191Toggle() {
    val current = BiliClient.prefs.v190danmakuFixedBorder191
    BiliClient.prefs.v190danmakuFixedBorder191 = !current
    AppToast.show(this, "Danmaku Fixed Border191: ${if (!current) "ON" else "OFF"}")
}

// v190: Subtitle Bg Border196
internal fun PlayerActivity.showV190SubtitleBgBorder196Toggle() {
    val current = BiliClient.prefs.v190subtitleBgBorder196
    BiliClient.prefs.v190subtitleBgBorder196 = !current
    AppToast.show(this, "Subtitle Bg Border196: ${if (!current) "ON" else "OFF"}")
}

// v191: Audio Delay Compensate191
internal fun PlayerActivity.showV191AudioDelayCompensate191Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191audioDelayCompensate191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191audioDelayCompensate191 = value
        AppToast.show(this, "Audio Delay Compensate191: $value")
    }
}

// v191: Danmaku Top Max Count191
internal fun PlayerActivity.showV191DanmakuTopMaxCount191Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191danmakuTopMaxCount191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Max Count191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191danmakuTopMaxCount191 = value
        AppToast.show(this, "Danmaku Top Max Count191: $value")
    }
}

// v191: Subtitle Bg Color192
internal fun PlayerActivity.showV191SubtitleBgColor192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191subtitleBgColor192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Bg Color192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191subtitleBgColor192 = value
        AppToast.show(this, "Subtitle Bg Color192: $value")
    }
}

// v191: Gesture Shake Action191
internal fun PlayerActivity.showV191GestureShakeAction191Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191gestureShakeAction191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191gestureShakeAction191 = value
        AppToast.show(this, "Gesture Shake Action191: $value")
    }
}

// v191: Cast Audio Volume191
internal fun PlayerActivity.showV191CastAudioVolume191Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v191castAudioVolume191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191castAudioVolume191 = value
        AppToast.show(this, "Cast Audio Volume191: $value")
    }
}

// v191: Playlist Auto Skip Outro191
internal fun PlayerActivity.showV191PlaylistAutoSkipOutro191Toggle() {
    val current = BiliClient.prefs.v191playlistAutoSkipOutro191
    BiliClient.prefs.v191playlistAutoSkipOutro191 = !current
    AppToast.show(this, "Playlist Auto Skip Outro191: ${if (!current) "ON" else "OFF"}")
}

// v191: Cache Download Speed192
internal fun PlayerActivity.showV191CacheDownloadSpeed192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191cacheDownloadSpeed192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191cacheDownloadSpeed192 = value
        AppToast.show(this, "Cache Download Speed192: $value")
    }
}

// v191: Progress Bar Thumb Border191
internal fun PlayerActivity.showV191ProgressBarThumbBorder191Toggle() {
    val current = BiliClient.prefs.v191progressBarThumbBorder191
    BiliClient.prefs.v191progressBarThumbBorder191 = !current
    AppToast.show(this, "Progress Bar Thumb Border191: ${if (!current) "ON" else "OFF"}")
}

// v191: Volume Boost Peak191
internal fun PlayerActivity.showV191VolumeBoostPeak191Toggle() {
    val current = BiliClient.prefs.v191volumeBoostPeak191
    BiliClient.prefs.v191volumeBoostPeak191 = !current
    AppToast.show(this, "Volume Boost Peak191: ${if (!current) "ON" else "OFF"}")
}

// v191: History Bookmark Export191
internal fun PlayerActivity.showV191HistoryBookmarkExport191Toggle() {
    val current = BiliClient.prefs.v191historyBookmarkExport191
    BiliClient.prefs.v191historyBookmarkExport191 = !current
    AppToast.show(this, "History Bookmark Export191: ${if (!current) "ON" else "OFF"}")
}

// v191: Playback Chapter Sync191
internal fun PlayerActivity.showV191PlaybackChapterSync191Toggle() {
    val current = BiliClient.prefs.v191playbackChapterSync191
    BiliClient.prefs.v191playbackChapterSync191 = !current
    AppToast.show(this, "Playback Chapter Sync191: ${if (!current) "ON" else "OFF"}")
}

// v191: Screenshot Save Path191
internal fun PlayerActivity.showV191ScreenshotSavePath191Toggle() {
    val current = BiliClient.prefs.v191screenshotSavePath191
    BiliClient.prefs.v191screenshotSavePath191 = !current
    AppToast.show(this, "Screenshot Save Path191: ${if (!current) "ON" else "OFF"}")
}

// v191: Video Color Space191
internal fun PlayerActivity.showV191VideoColorSpace191Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191videoColorSpace191).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space191",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191videoColorSpace191 = value
        AppToast.show(this, "Video Color Space191: $value")
    }
}

// v191: Danmaku Top Max Count192
internal fun PlayerActivity.showV191DanmakuTopMaxCount192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v191danmakuTopMaxCount192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Max Count192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v191danmakuTopMaxCount192 = value
        AppToast.show(this, "Danmaku Top Max Count192: $value")
    }
}

// v191: Subtitle Bg Border197
internal fun PlayerActivity.showV191SubtitleBgBorder197Toggle() {
    val current = BiliClient.prefs.v191subtitleBgBorder197
    BiliClient.prefs.v191subtitleBgBorder197 = !current
    AppToast.show(this, "Subtitle Bg Border197: ${if (!current) "ON" else "OFF"}")
}

// v192: Audio Delay Compensate192
internal fun PlayerActivity.showV192AudioDelayCompensate192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192audioDelayCompensate192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192audioDelayCompensate192 = value
        AppToast.show(this, "Audio Delay Compensate192: $value")
    }
}

// v192: Danmaku Top Max Count193
internal fun PlayerActivity.showV192DanmakuTopMaxCount193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192danmakuTopMaxCount193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Max Count193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192danmakuTopMaxCount193 = value
        AppToast.show(this, "Danmaku Top Max Count193: $value")
    }
}

// v192: Subtitle Bg Border198
internal fun PlayerActivity.showV192SubtitleBgBorder198Toggle() {
    val current = BiliClient.prefs.v192subtitleBgBorder198
    BiliClient.prefs.v192subtitleBgBorder198 = !current
    AppToast.show(this, "Subtitle Bg Border198: ${if (!current) "ON" else "OFF"}")
}

// v192: Gesture Shake Action192
internal fun PlayerActivity.showV192GestureShakeAction192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192gestureShakeAction192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192gestureShakeAction192 = value
        AppToast.show(this, "Gesture Shake Action192: $value")
    }
}

// v192: Cast Audio Volume192
internal fun PlayerActivity.showV192CastAudioVolume192Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v192castAudioVolume192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192castAudioVolume192 = value
        AppToast.show(this, "Cast Audio Volume192: $value")
    }
}

// v192: Playlist Auto Skip Outro192
internal fun PlayerActivity.showV192PlaylistAutoSkipOutro192Toggle() {
    val current = BiliClient.prefs.v192playlistAutoSkipOutro192
    BiliClient.prefs.v192playlistAutoSkipOutro192 = !current
    AppToast.show(this, "Playlist Auto Skip Outro192: ${if (!current) "ON" else "OFF"}")
}

// v192: Cache Download Speed193
internal fun PlayerActivity.showV192CacheDownloadSpeed193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192cacheDownloadSpeed193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192cacheDownloadSpeed193 = value
        AppToast.show(this, "Cache Download Speed193: $value")
    }
}

// v192: Progress Bar Thumb Border192
internal fun PlayerActivity.showV192ProgressBarThumbBorder192Toggle() {
    val current = BiliClient.prefs.v192progressBarThumbBorder192
    BiliClient.prefs.v192progressBarThumbBorder192 = !current
    AppToast.show(this, "Progress Bar Thumb Border192: ${if (!current) "ON" else "OFF"}")
}

// v192: Volume Boost Peak192
internal fun PlayerActivity.showV192VolumeBoostPeak192Toggle() {
    val current = BiliClient.prefs.v192volumeBoostPeak192
    BiliClient.prefs.v192volumeBoostPeak192 = !current
    AppToast.show(this, "Volume Boost Peak192: ${if (!current) "ON" else "OFF"}")
}

// v192: History Bookmark Export192
internal fun PlayerActivity.showV192HistoryBookmarkExport192Toggle() {
    val current = BiliClient.prefs.v192historyBookmarkExport192
    BiliClient.prefs.v192historyBookmarkExport192 = !current
    AppToast.show(this, "History Bookmark Export192: ${if (!current) "ON" else "OFF"}")
}

// v192: Playback Chapter Sync192
internal fun PlayerActivity.showV192PlaybackChapterSync192Toggle() {
    val current = BiliClient.prefs.v192playbackChapterSync192
    BiliClient.prefs.v192playbackChapterSync192 = !current
    AppToast.show(this, "Playback Chapter Sync192: ${if (!current) "ON" else "OFF"}")
}

// v192: Screenshot Save Path192
internal fun PlayerActivity.showV192ScreenshotSavePath192Toggle() {
    val current = BiliClient.prefs.v192screenshotSavePath192
    BiliClient.prefs.v192screenshotSavePath192 = !current
    AppToast.show(this, "Screenshot Save Path192: ${if (!current) "ON" else "OFF"}")
}

// v192: Video Color Space192
internal fun PlayerActivity.showV192VideoColorSpace192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192videoColorSpace192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192videoColorSpace192 = value
        AppToast.show(this, "Video Color Space192: $value")
    }
}

// v192: Danmaku Bottom Max Count192
internal fun PlayerActivity.showV192DanmakuBottomMaxCount192Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v192danmakuBottomMaxCount192).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count192",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v192danmakuBottomMaxCount192 = value
        AppToast.show(this, "Danmaku Bottom Max Count192: $value")
    }
}

// v192: Subtitle Bg Border199
internal fun PlayerActivity.showV192SubtitleBgBorder199Toggle() {
    val current = BiliClient.prefs.v192subtitleBgBorder199
    BiliClient.prefs.v192subtitleBgBorder199 = !current
    AppToast.show(this, "Subtitle Bg Border199: ${if (!current) "ON" else "OFF"}")
}

// v193: Audio Delay Compensate193
internal fun PlayerActivity.showV193AudioDelayCompensate193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193audioDelayCompensate193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193audioDelayCompensate193 = value
        AppToast.show(this, "Audio Delay Compensate193: $value")
    }
}

// v193: Danmaku Bottom Max Count193
internal fun PlayerActivity.showV193DanmakuBottomMaxCount193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193danmakuBottomMaxCount193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193danmakuBottomMaxCount193 = value
        AppToast.show(this, "Danmaku Bottom Max Count193: $value")
    }
}

// v193: Subtitle Bg Border200
internal fun PlayerActivity.showV193SubtitleBgBorder200Toggle() {
    val current = BiliClient.prefs.v193subtitleBgBorder200
    BiliClient.prefs.v193subtitleBgBorder200 = !current
    AppToast.show(this, "Subtitle Bg Border200: ${if (!current) "ON" else "OFF"}")
}

// v193: Gesture Shake Action193
internal fun PlayerActivity.showV193GestureShakeAction193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193gestureShakeAction193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193gestureShakeAction193 = value
        AppToast.show(this, "Gesture Shake Action193: $value")
    }
}

// v193: Cast Audio Volume193
internal fun PlayerActivity.showV193CastAudioVolume193Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v193castAudioVolume193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193castAudioVolume193 = value
        AppToast.show(this, "Cast Audio Volume193: $value")
    }
}

// v193: Playlist Auto Skip Outro193
internal fun PlayerActivity.showV193PlaylistAutoSkipOutro193Toggle() {
    val current = BiliClient.prefs.v193playlistAutoSkipOutro193
    BiliClient.prefs.v193playlistAutoSkipOutro193 = !current
    AppToast.show(this, "Playlist Auto Skip Outro193: ${if (!current) "ON" else "OFF"}")
}

// v193: Cache Download Speed194
internal fun PlayerActivity.showV193CacheDownloadSpeed194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193cacheDownloadSpeed194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193cacheDownloadSpeed194 = value
        AppToast.show(this, "Cache Download Speed194: $value")
    }
}

// v193: Progress Bar Thumb Border193
internal fun PlayerActivity.showV193ProgressBarThumbBorder193Toggle() {
    val current = BiliClient.prefs.v193progressBarThumbBorder193
    BiliClient.prefs.v193progressBarThumbBorder193 = !current
    AppToast.show(this, "Progress Bar Thumb Border193: ${if (!current) "ON" else "OFF"}")
}

// v193: Volume Boost Peak193
internal fun PlayerActivity.showV193VolumeBoostPeak193Toggle() {
    val current = BiliClient.prefs.v193volumeBoostPeak193
    BiliClient.prefs.v193volumeBoostPeak193 = !current
    AppToast.show(this, "Volume Boost Peak193: ${if (!current) "ON" else "OFF"}")
}

// v193: History Bookmark Export193
internal fun PlayerActivity.showV193HistoryBookmarkExport193Toggle() {
    val current = BiliClient.prefs.v193historyBookmarkExport193
    BiliClient.prefs.v193historyBookmarkExport193 = !current
    AppToast.show(this, "History Bookmark Export193: ${if (!current) "ON" else "OFF"}")
}

// v193: Playback Chapter Sync193
internal fun PlayerActivity.showV193PlaybackChapterSync193Toggle() {
    val current = BiliClient.prefs.v193playbackChapterSync193
    BiliClient.prefs.v193playbackChapterSync193 = !current
    AppToast.show(this, "Playback Chapter Sync193: ${if (!current) "ON" else "OFF"}")
}

// v193: Screenshot Save Path193
internal fun PlayerActivity.showV193ScreenshotSavePath193Toggle() {
    val current = BiliClient.prefs.v193screenshotSavePath193
    BiliClient.prefs.v193screenshotSavePath193 = !current
    AppToast.show(this, "Screenshot Save Path193: ${if (!current) "ON" else "OFF"}")
}

// v193: Video Color Space193
internal fun PlayerActivity.showV193VideoColorSpace193Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193videoColorSpace193).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space193",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193videoColorSpace193 = value
        AppToast.show(this, "Video Color Space193: $value")
    }
}

// v193: Danmaku Bottom Max Count194
internal fun PlayerActivity.showV193DanmakuBottomMaxCount194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v193danmakuBottomMaxCount194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v193danmakuBottomMaxCount194 = value
        AppToast.show(this, "Danmaku Bottom Max Count194: $value")
    }
}

// v193: Subtitle Bg Border201
internal fun PlayerActivity.showV193SubtitleBgBorder201Toggle() {
    val current = BiliClient.prefs.v193subtitleBgBorder201
    BiliClient.prefs.v193subtitleBgBorder201 = !current
    AppToast.show(this, "Subtitle Bg Border201: ${if (!current) "ON" else "OFF"}")
}

// v194: Audio Delay Compensate194
internal fun PlayerActivity.showV194AudioDelayCompensate194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194audioDelayCompensate194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194audioDelayCompensate194 = value
        AppToast.show(this, "Audio Delay Compensate194: $value")
    }
}

// v194: Danmaku Bottom Max Count195
internal fun PlayerActivity.showV194DanmakuBottomMaxCount195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194danmakuBottomMaxCount195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194danmakuBottomMaxCount195 = value
        AppToast.show(this, "Danmaku Bottom Max Count195: $value")
    }
}

// v194: Subtitle Bg Border202
internal fun PlayerActivity.showV194SubtitleBgBorder202Toggle() {
    val current = BiliClient.prefs.v194subtitleBgBorder202
    BiliClient.prefs.v194subtitleBgBorder202 = !current
    AppToast.show(this, "Subtitle Bg Border202: ${if (!current) "ON" else "OFF"}")
}

// v194: Gesture Shake Action194
internal fun PlayerActivity.showV194GestureShakeAction194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194gestureShakeAction194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194gestureShakeAction194 = value
        AppToast.show(this, "Gesture Shake Action194: $value")
    }
}

// v194: Cast Audio Volume194
internal fun PlayerActivity.showV194CastAudioVolume194Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v194castAudioVolume194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194castAudioVolume194 = value
        AppToast.show(this, "Cast Audio Volume194: $value")
    }
}

// v194: Playlist Auto Skip Outro194
internal fun PlayerActivity.showV194PlaylistAutoSkipOutro194Toggle() {
    val current = BiliClient.prefs.v194playlistAutoSkipOutro194
    BiliClient.prefs.v194playlistAutoSkipOutro194 = !current
    AppToast.show(this, "Playlist Auto Skip Outro194: ${if (!current) "ON" else "OFF"}")
}

// v194: Cache Download Speed195
internal fun PlayerActivity.showV194CacheDownloadSpeed195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194cacheDownloadSpeed195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194cacheDownloadSpeed195 = value
        AppToast.show(this, "Cache Download Speed195: $value")
    }
}

// v194: Progress Bar Thumb Border194
internal fun PlayerActivity.showV194ProgressBarThumbBorder194Toggle() {
    val current = BiliClient.prefs.v194progressBarThumbBorder194
    BiliClient.prefs.v194progressBarThumbBorder194 = !current
    AppToast.show(this, "Progress Bar Thumb Border194: ${if (!current) "ON" else "OFF"}")
}

// v194: Volume Boost Peak194
internal fun PlayerActivity.showV194VolumeBoostPeak194Toggle() {
    val current = BiliClient.prefs.v194volumeBoostPeak194
    BiliClient.prefs.v194volumeBoostPeak194 = !current
    AppToast.show(this, "Volume Boost Peak194: ${if (!current) "ON" else "OFF"}")
}

// v194: History Bookmark Export194
internal fun PlayerActivity.showV194HistoryBookmarkExport194Toggle() {
    val current = BiliClient.prefs.v194historyBookmarkExport194
    BiliClient.prefs.v194historyBookmarkExport194 = !current
    AppToast.show(this, "History Bookmark Export194: ${if (!current) "ON" else "OFF"}")
}

// v194: Playback Chapter Sync194
internal fun PlayerActivity.showV194PlaybackChapterSync194Toggle() {
    val current = BiliClient.prefs.v194playbackChapterSync194
    BiliClient.prefs.v194playbackChapterSync194 = !current
    AppToast.show(this, "Playback Chapter Sync194: ${if (!current) "ON" else "OFF"}")
}

// v194: Screenshot Save Path194
internal fun PlayerActivity.showV194ScreenshotSavePath194Toggle() {
    val current = BiliClient.prefs.v194screenshotSavePath194
    BiliClient.prefs.v194screenshotSavePath194 = !current
    AppToast.show(this, "Screenshot Save Path194: ${if (!current) "ON" else "OFF"}")
}

// v194: Video Color Space194
internal fun PlayerActivity.showV194VideoColorSpace194Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194videoColorSpace194).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space194",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194videoColorSpace194 = value
        AppToast.show(this, "Video Color Space194: $value")
    }
}

// v194: Danmaku Bottom Max Count196
internal fun PlayerActivity.showV194DanmakuBottomMaxCount196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v194danmakuBottomMaxCount196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v194danmakuBottomMaxCount196 = value
        AppToast.show(this, "Danmaku Bottom Max Count196: $value")
    }
}

// v194: Subtitle Bg Border203
internal fun PlayerActivity.showV194SubtitleBgBorder203Toggle() {
    val current = BiliClient.prefs.v194subtitleBgBorder203
    BiliClient.prefs.v194subtitleBgBorder203 = !current
    AppToast.show(this, "Subtitle Bg Border203: ${if (!current) "ON" else "OFF"}")
}

// v195: Audio Delay Compensate195
internal fun PlayerActivity.showV195AudioDelayCompensate195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195audioDelayCompensate195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195audioDelayCompensate195 = value
        AppToast.show(this, "Audio Delay Compensate195: $value")
    }
}

// v195: Danmaku Bottom Max Count197
internal fun PlayerActivity.showV195DanmakuBottomMaxCount197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195danmakuBottomMaxCount197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195danmakuBottomMaxCount197 = value
        AppToast.show(this, "Danmaku Bottom Max Count197: $value")
    }
}

// v195: Subtitle Bg Border204
internal fun PlayerActivity.showV195SubtitleBgBorder204Toggle() {
    val current = BiliClient.prefs.v195subtitleBgBorder204
    BiliClient.prefs.v195subtitleBgBorder204 = !current
    AppToast.show(this, "Subtitle Bg Border204: ${if (!current) "ON" else "OFF"}")
}

// v195: Gesture Shake Action195
internal fun PlayerActivity.showV195GestureShakeAction195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195gestureShakeAction195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195gestureShakeAction195 = value
        AppToast.show(this, "Gesture Shake Action195: $value")
    }
}

// v195: Cast Audio Volume195
internal fun PlayerActivity.showV195CastAudioVolume195Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v195castAudioVolume195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195castAudioVolume195 = value
        AppToast.show(this, "Cast Audio Volume195: $value")
    }
}

// v195: Playlist Auto Skip Outro195
internal fun PlayerActivity.showV195PlaylistAutoSkipOutro195Toggle() {
    val current = BiliClient.prefs.v195playlistAutoSkipOutro195
    BiliClient.prefs.v195playlistAutoSkipOutro195 = !current
    AppToast.show(this, "Playlist Auto Skip Outro195: ${if (!current) "ON" else "OFF"}")
}

// v195: Cache Download Speed196
internal fun PlayerActivity.showV195CacheDownloadSpeed196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195cacheDownloadSpeed196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195cacheDownloadSpeed196 = value
        AppToast.show(this, "Cache Download Speed196: $value")
    }
}

// v195: Progress Bar Thumb Border195
internal fun PlayerActivity.showV195ProgressBarThumbBorder195Toggle() {
    val current = BiliClient.prefs.v195progressBarThumbBorder195
    BiliClient.prefs.v195progressBarThumbBorder195 = !current
    AppToast.show(this, "Progress Bar Thumb Border195: ${if (!current) "ON" else "OFF"}")
}

// v195: Volume Boost Peak195
internal fun PlayerActivity.showV195VolumeBoostPeak195Toggle() {
    val current = BiliClient.prefs.v195volumeBoostPeak195
    BiliClient.prefs.v195volumeBoostPeak195 = !current
    AppToast.show(this, "Volume Boost Peak195: ${if (!current) "ON" else "OFF"}")
}

// v195: History Bookmark Export195
internal fun PlayerActivity.showV195HistoryBookmarkExport195Toggle() {
    val current = BiliClient.prefs.v195historyBookmarkExport195
    BiliClient.prefs.v195historyBookmarkExport195 = !current
    AppToast.show(this, "History Bookmark Export195: ${if (!current) "ON" else "OFF"}")
}

// v195: Playback Chapter Sync195
internal fun PlayerActivity.showV195PlaybackChapterSync195Toggle() {
    val current = BiliClient.prefs.v195playbackChapterSync195
    BiliClient.prefs.v195playbackChapterSync195 = !current
    AppToast.show(this, "Playback Chapter Sync195: ${if (!current) "ON" else "OFF"}")
}

// v195: Screenshot Save Path195
internal fun PlayerActivity.showV195ScreenshotSavePath195Toggle() {
    val current = BiliClient.prefs.v195screenshotSavePath195
    BiliClient.prefs.v195screenshotSavePath195 = !current
    AppToast.show(this, "Screenshot Save Path195: ${if (!current) "ON" else "OFF"}")
}

// v195: Video Color Space195
internal fun PlayerActivity.showV195VideoColorSpace195Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195videoColorSpace195).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space195",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195videoColorSpace195 = value
        AppToast.show(this, "Video Color Space195: $value")
    }
}

// v195: Danmaku Bottom Max Count198
internal fun PlayerActivity.showV195DanmakuBottomMaxCount198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v195danmakuBottomMaxCount198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v195danmakuBottomMaxCount198 = value
        AppToast.show(this, "Danmaku Bottom Max Count198: $value")
    }
}

// v195: Subtitle Bg Border205
internal fun PlayerActivity.showV195SubtitleBgBorder205Toggle() {
    val current = BiliClient.prefs.v195subtitleBgBorder205
    BiliClient.prefs.v195subtitleBgBorder205 = !current
    AppToast.show(this, "Subtitle Bg Border205: ${if (!current) "ON" else "OFF"}")
}

// v196: Audio Delay Compensate196
internal fun PlayerActivity.showV196AudioDelayCompensate196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196audioDelayCompensate196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196audioDelayCompensate196 = value
        AppToast.show(this, "Audio Delay Compensate196: $value")
    }
}

// v196: Danmaku Bottom Max Count199
internal fun PlayerActivity.showV196DanmakuBottomMaxCount199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196danmakuBottomMaxCount199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196danmakuBottomMaxCount199 = value
        AppToast.show(this, "Danmaku Bottom Max Count199: $value")
    }
}

// v196: Subtitle Bg Border206
internal fun PlayerActivity.showV196SubtitleBgBorder206Toggle() {
    val current = BiliClient.prefs.v196subtitleBgBorder206
    BiliClient.prefs.v196subtitleBgBorder206 = !current
    AppToast.show(this, "Subtitle Bg Border206: ${if (!current) "ON" else "OFF"}")
}

// v196: Gesture Shake Action196
internal fun PlayerActivity.showV196GestureShakeAction196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196gestureShakeAction196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196gestureShakeAction196 = value
        AppToast.show(this, "Gesture Shake Action196: $value")
    }
}

// v196: Cast Audio Volume196
internal fun PlayerActivity.showV196CastAudioVolume196Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v196castAudioVolume196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196castAudioVolume196 = value
        AppToast.show(this, "Cast Audio Volume196: $value")
    }
}

// v196: Playlist Auto Skip Outro196
internal fun PlayerActivity.showV196PlaylistAutoSkipOutro196Toggle() {
    val current = BiliClient.prefs.v196playlistAutoSkipOutro196
    BiliClient.prefs.v196playlistAutoSkipOutro196 = !current
    AppToast.show(this, "Playlist Auto Skip Outro196: ${if (!current) "ON" else "OFF"}")
}

// v196: Cache Download Speed197
internal fun PlayerActivity.showV196CacheDownloadSpeed197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196cacheDownloadSpeed197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196cacheDownloadSpeed197 = value
        AppToast.show(this, "Cache Download Speed197: $value")
    }
}

// v196: Progress Bar Thumb Border196
internal fun PlayerActivity.showV196ProgressBarThumbBorder196Toggle() {
    val current = BiliClient.prefs.v196progressBarThumbBorder196
    BiliClient.prefs.v196progressBarThumbBorder196 = !current
    AppToast.show(this, "Progress Bar Thumb Border196: ${if (!current) "ON" else "OFF"}")
}

