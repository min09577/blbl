package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.AppPrefs
import blbl.cat3399.core.prefs.PlayerPlaybackModes
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.core.ui.popup.AppPopup
import blbl.cat3399.feature.player.danmaku.DanmakuFontWeight
import blbl.cat3399.feature.player.danmaku.DanmakuLaneDensity
import blbl.cat3399.feature.player.danmaku.DanmakuSessionSettings
import blbl.cat3399.feature.player.engine.BlblPlayerEngine
import blbl.cat3399.feature.player.engine.ExoPlayerEngine
import blbl.cat3399.feature.player.engine.IjkPlayerPluginUi
import blbl.cat3399.feature.player.engine.PlayerEngineKind

// v329: Danmaku Top Count Max320
internal fun PlayerActivity.showV329DanmakuTopCountMax320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329danmakuTopCountMax320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329danmakuTopCountMax320 = value
        AppToast.show(this, "Danmaku Top Count Max320: $value")
    }
}

// v329: Subtitle Stroke Width320
internal fun PlayerActivity.showV329SubtitleStrokeWidth320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329subtitleStrokeWidth320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329subtitleStrokeWidth320 = value
        AppToast.show(this, "Subtitle Stroke Width320: $value")
    }
}

// v330: Audio Dynamic Range312
internal fun PlayerActivity.showV330AudioDynamicRange312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330audioDynamicRange312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330audioDynamicRange312 = value
        AppToast.show(this, "Audio Dynamic Range312: $value")
    }
}

// v330: Danmaku Top Count Max321
internal fun PlayerActivity.showV330DanmakuTopCountMax321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330danmakuTopCountMax321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330danmakuTopCountMax321 = value
        AppToast.show(this, "Danmaku Top Count Max321: $value")
    }
}

// v330: Subtitle Stroke Width321
internal fun PlayerActivity.showV330SubtitleStrokeWidth321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330subtitleStrokeWidth321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330subtitleStrokeWidth321 = value
        AppToast.show(this, "Subtitle Stroke Width321: $value")
    }
}

// v330: Gesture Long Press Action312
internal fun PlayerActivity.showV330GestureLongPressAction312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330gestureLongPressAction312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330gestureLongPressAction312 = value
        AppToast.show(this, "Gesture Long Press Action312: $value")
    }
}

// v330: Cast Quality312
internal fun PlayerActivity.showV330CastQuality312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330castQuality312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330castQuality312 = value
        AppToast.show(this, "Cast Quality312: $value")
    }
}

// v330: Playlist Repeat Mode312
internal fun PlayerActivity.showV330PlaylistRepeatMode312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330playlistRepeatMode312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330playlistRepeatMode312 = value
        AppToast.show(this, "Playlist Repeat Mode312: $value")
    }
}

// v330: Cache Max Size312
internal fun PlayerActivity.showV330CacheMaxSize312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330cacheMaxSize312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330cacheMaxSize312 = value
        AppToast.show(this, "Cache Max Size312: $value")
    }
}

// v330: Progress Bar Height312
internal fun PlayerActivity.showV330ProgressBarHeight312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330progressBarHeight312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330progressBarHeight312 = value
        AppToast.show(this, "Progress Bar Height312: $value")
    }
}

// v330: Volume Level Indicator312
internal fun PlayerActivity.showV330VolumeLevelIndicator312Toggle() {
    val current = BiliClient.prefs.v330volumeLevelIndicator312
    BiliClient.prefs.v330volumeLevelIndicator312 = !current
    AppToast.show(this, "Volume Level Indicator312: ${if (!current) "ON" else "OFF"}")
}

// v330: History Search Enabled312
internal fun PlayerActivity.showV330HistorySearchEnabled312Toggle() {
    val current = BiliClient.prefs.v330historySearchEnabled312
    BiliClient.prefs.v330historySearchEnabled312 = !current
    AppToast.show(this, "History Search Enabled312: ${if (!current) "ON" else "OFF"}")
}

// v330: Playback Speed Memory312
internal fun PlayerActivity.showV330PlaybackSpeedMemory312Toggle() {
    val current = BiliClient.prefs.v330playbackSpeedMemory312
    BiliClient.prefs.v330playbackSpeedMemory312 = !current
    AppToast.show(this, "Playback Speed Memory312: ${if (!current) "ON" else "OFF"}")
}

// v330: Screenshot Format312
internal fun PlayerActivity.showV330ScreenshotFormat312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330screenshotFormat312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330screenshotFormat312 = value
        AppToast.show(this, "Screenshot Format312: $value")
    }
}

// v330: Video Deinterlace312
internal fun PlayerActivity.showV330VideoDeinterlace312Toggle() {
    val current = BiliClient.prefs.v330videoDeinterlace312
    BiliClient.prefs.v330videoDeinterlace312 = !current
    AppToast.show(this, "Video Deinterlace312: ${if (!current) "ON" else "OFF"}")
}

// v330: Danmaku Top Count Max322
internal fun PlayerActivity.showV330DanmakuTopCountMax322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330danmakuTopCountMax322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330danmakuTopCountMax322 = value
        AppToast.show(this, "Danmaku Top Count Max322: $value")
    }
}

// v330: Subtitle Stroke Width322
internal fun PlayerActivity.showV330SubtitleStrokeWidth322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330subtitleStrokeWidth322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330subtitleStrokeWidth322 = value
        AppToast.show(this, "Subtitle Stroke Width322: $value")
    }
}

// v331: Audio Stereo Width313
internal fun PlayerActivity.showV331AudioStereoWidth313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331audioStereoWidth313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331audioStereoWidth313 = value
        AppToast.show(this, "Audio Stereo Width313: $value")
    }
}

// v331: Danmaku Scroll Speed313
internal fun PlayerActivity.showV331DanmakuScrollSpeed313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331danmakuScrollSpeed313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331danmakuScrollSpeed313 = value
        AppToast.show(this, "Danmaku Scroll Speed313: $value")
    }
}

// v331: Subtitle Delay Sync313
internal fun PlayerActivity.showV331SubtitleDelaySync313Toggle() {
    val current = BiliClient.prefs.v331subtitleDelaySync313
    BiliClient.prefs.v331subtitleDelaySync313 = !current
    AppToast.show(this, "Subtitle Delay Sync313: ${if (!current) "ON" else "OFF"}")
}

// v331: Gesture Swipe Up Action313
internal fun PlayerActivity.showV331GestureSwipeUpAction313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331gestureSwipeUpAction313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331gestureSwipeUpAction313 = value
        AppToast.show(this, "Gesture Swipe Up Action313: $value")
    }
}

// v331: Cast Subtitles313
internal fun PlayerActivity.showV331CastSubtitles313Toggle() {
    val current = BiliClient.prefs.v331castSubtitles313
    BiliClient.prefs.v331castSubtitles313 = !current
    AppToast.show(this, "Cast Subtitles313: ${if (!current) "ON" else "OFF"}")
}

// v331: Playlist Shuffle Mode313
internal fun PlayerActivity.showV331PlaylistShuffleMode313Toggle() {
    val current = BiliClient.prefs.v331playlistShuffleMode313
    BiliClient.prefs.v331playlistShuffleMode313 = !current
    AppToast.show(this, "Playlist Shuffle Mode313: ${if (!current) "ON" else "OFF"}")
}

// v331: Cache Cleanup Interval313
internal fun PlayerActivity.showV331CacheCleanupInterval313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331cacheCleanupInterval313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331cacheCleanupInterval313 = value
        AppToast.show(this, "Cache Cleanup Interval313: $value")
    }
}

// v331: Progress Bar Buffered Color313
internal fun PlayerActivity.showV331ProgressBarBufferedColor313Toggle() {
    val current = BiliClient.prefs.v331progressBarBufferedColor313
    BiliClient.prefs.v331progressBarBufferedColor313 = !current
    AppToast.show(this, "Progress Bar Buffered Color313: ${if (!current) "ON" else "OFF"}")
}

// v331: Volume Step Size313
internal fun PlayerActivity.showV331VolumeStepSize313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331volumeStepSize313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331volumeStepSize313 = value
        AppToast.show(this, "Volume Step Size313: $value")
    }
}

// v331: History Group By Date313
internal fun PlayerActivity.showV331HistoryGroupByDate313Toggle() {
    val current = BiliClient.prefs.v331historyGroupByDate313
    BiliClient.prefs.v331historyGroupByDate313 = !current
    AppToast.show(this, "History Group By Date313: ${if (!current) "ON" else "OFF"}")
}

// v331: Playback Auto Resume313
internal fun PlayerActivity.showV331PlaybackAutoResume313Toggle() {
    val current = BiliClient.prefs.v331playbackAutoResume313
    BiliClient.prefs.v331playbackAutoResume313 = !current
    AppToast.show(this, "Playback Auto Resume313: ${if (!current) "ON" else "OFF"}")
}

// v331: Screenshot Notification313
internal fun PlayerActivity.showV331ScreenshotNotification313Toggle() {
    val current = BiliClient.prefs.v331screenshotNotification313
    BiliClient.prefs.v331screenshotNotification313 = !current
    AppToast.show(this, "Screenshot Notification313: ${if (!current) "ON" else "OFF"}")
}

// v331: Video Crop Ratio313
internal fun PlayerActivity.showV331VideoCropRatio313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331videoCropRatio313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331videoCropRatio313 = value
        AppToast.show(this, "Video Crop Ratio313: $value")
    }
}

// v331: Danmaku Scroll Speed314
internal fun PlayerActivity.showV331DanmakuScrollSpeed314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331danmakuScrollSpeed314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331danmakuScrollSpeed314 = value
        AppToast.show(this, "Danmaku Scroll Speed314: $value")
    }
}

// v331: Subtitle Delay Sync314
internal fun PlayerActivity.showV331SubtitleDelaySync314Toggle() {
    val current = BiliClient.prefs.v331subtitleDelaySync314
    BiliClient.prefs.v331subtitleDelaySync314 = !current
    AppToast.show(this, "Subtitle Delay Sync314: ${if (!current) "ON" else "OFF"}")
}

// v332: Audio Stereo Width314
internal fun PlayerActivity.showV332AudioStereoWidth314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332audioStereoWidth314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332audioStereoWidth314 = value
        AppToast.show(this, "Audio Stereo Width314: $value")
    }
}

// v332: Danmaku Scroll Speed315
internal fun PlayerActivity.showV332DanmakuScrollSpeed315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332danmakuScrollSpeed315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332danmakuScrollSpeed315 = value
        AppToast.show(this, "Danmaku Scroll Speed315: $value")
    }
}

// v332: Subtitle Delay Sync315
internal fun PlayerActivity.showV332SubtitleDelaySync315Toggle() {
    val current = BiliClient.prefs.v332subtitleDelaySync315
    BiliClient.prefs.v332subtitleDelaySync315 = !current
    AppToast.show(this, "Subtitle Delay Sync315: ${if (!current) "ON" else "OFF"}")
}

// v332: Gesture Swipe Up Action314
internal fun PlayerActivity.showV332GestureSwipeUpAction314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332gestureSwipeUpAction314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332gestureSwipeUpAction314 = value
        AppToast.show(this, "Gesture Swipe Up Action314: $value")
    }
}

// v332: Cast Subtitles314
internal fun PlayerActivity.showV332CastSubtitles314Toggle() {
    val current = BiliClient.prefs.v332castSubtitles314
    BiliClient.prefs.v332castSubtitles314 = !current
    AppToast.show(this, "Cast Subtitles314: ${if (!current) "ON" else "OFF"}")
}

// v332: Playlist Shuffle Mode314
internal fun PlayerActivity.showV332PlaylistShuffleMode314Toggle() {
    val current = BiliClient.prefs.v332playlistShuffleMode314
    BiliClient.prefs.v332playlistShuffleMode314 = !current
    AppToast.show(this, "Playlist Shuffle Mode314: ${if (!current) "ON" else "OFF"}")
}

// v332: Cache Cleanup Interval314
internal fun PlayerActivity.showV332CacheCleanupInterval314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332cacheCleanupInterval314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332cacheCleanupInterval314 = value
        AppToast.show(this, "Cache Cleanup Interval314: $value")
    }
}

// v332: Progress Bar Buffered Color314
internal fun PlayerActivity.showV332ProgressBarBufferedColor314Toggle() {
    val current = BiliClient.prefs.v332progressBarBufferedColor314
    BiliClient.prefs.v332progressBarBufferedColor314 = !current
    AppToast.show(this, "Progress Bar Buffered Color314: ${if (!current) "ON" else "OFF"}")
}

// v332: Volume Step Size314
internal fun PlayerActivity.showV332VolumeStepSize314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332volumeStepSize314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332volumeStepSize314 = value
        AppToast.show(this, "Volume Step Size314: $value")
    }
}

// v332: History Group By Date314
internal fun PlayerActivity.showV332HistoryGroupByDate314Toggle() {
    val current = BiliClient.prefs.v332historyGroupByDate314
    BiliClient.prefs.v332historyGroupByDate314 = !current
    AppToast.show(this, "History Group By Date314: ${if (!current) "ON" else "OFF"}")
}

// v332: Playback Auto Resume314
internal fun PlayerActivity.showV332PlaybackAutoResume314Toggle() {
    val current = BiliClient.prefs.v332playbackAutoResume314
    BiliClient.prefs.v332playbackAutoResume314 = !current
    AppToast.show(this, "Playback Auto Resume314: ${if (!current) "ON" else "OFF"}")
}

// v332: Screenshot Notification314
internal fun PlayerActivity.showV332ScreenshotNotification314Toggle() {
    val current = BiliClient.prefs.v332screenshotNotification314
    BiliClient.prefs.v332screenshotNotification314 = !current
    AppToast.show(this, "Screenshot Notification314: ${if (!current) "ON" else "OFF"}")
}

// v332: Video Crop Ratio314
internal fun PlayerActivity.showV332VideoCropRatio314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332videoCropRatio314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332videoCropRatio314 = value
        AppToast.show(this, "Video Crop Ratio314: $value")
    }
}

// v332: Danmaku Scroll Speed316
internal fun PlayerActivity.showV332DanmakuScrollSpeed316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332danmakuScrollSpeed316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332danmakuScrollSpeed316 = value
        AppToast.show(this, "Danmaku Scroll Speed316: $value")
    }
}

// v332: Subtitle Delay Sync316
internal fun PlayerActivity.showV332SubtitleDelaySync316Toggle() {
    val current = BiliClient.prefs.v332subtitleDelaySync316
    BiliClient.prefs.v332subtitleDelaySync316 = !current
    AppToast.show(this, "Subtitle Delay Sync316: ${if (!current) "ON" else "OFF"}")
}

// v333: Audio Stereo Width315
internal fun PlayerActivity.showV333AudioStereoWidth315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333audioStereoWidth315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333audioStereoWidth315 = value
        AppToast.show(this, "Audio Stereo Width315: $value")
    }
}

// v333: Danmaku Scroll Speed317
internal fun PlayerActivity.showV333DanmakuScrollSpeed317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333danmakuScrollSpeed317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333danmakuScrollSpeed317 = value
        AppToast.show(this, "Danmaku Scroll Speed317: $value")
    }
}

// v333: Subtitle Delay Sync317
internal fun PlayerActivity.showV333SubtitleDelaySync317Toggle() {
    val current = BiliClient.prefs.v333subtitleDelaySync317
    BiliClient.prefs.v333subtitleDelaySync317 = !current
    AppToast.show(this, "Subtitle Delay Sync317: ${if (!current) "ON" else "OFF"}")
}

// v333: Gesture Swipe Up Action315
internal fun PlayerActivity.showV333GestureSwipeUpAction315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333gestureSwipeUpAction315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333gestureSwipeUpAction315 = value
        AppToast.show(this, "Gesture Swipe Up Action315: $value")
    }
}

// v333: Cast Subtitles315
internal fun PlayerActivity.showV333CastSubtitles315Toggle() {
    val current = BiliClient.prefs.v333castSubtitles315
    BiliClient.prefs.v333castSubtitles315 = !current
    AppToast.show(this, "Cast Subtitles315: ${if (!current) "ON" else "OFF"}")
}

// v333: Playlist Shuffle Mode315
internal fun PlayerActivity.showV333PlaylistShuffleMode315Toggle() {
    val current = BiliClient.prefs.v333playlistShuffleMode315
    BiliClient.prefs.v333playlistShuffleMode315 = !current
    AppToast.show(this, "Playlist Shuffle Mode315: ${if (!current) "ON" else "OFF"}")
}

// v333: Cache Cleanup Interval315
internal fun PlayerActivity.showV333CacheCleanupInterval315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333cacheCleanupInterval315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333cacheCleanupInterval315 = value
        AppToast.show(this, "Cache Cleanup Interval315: $value")
    }
}

// v333: Progress Bar Buffered Color315
internal fun PlayerActivity.showV333ProgressBarBufferedColor315Toggle() {
    val current = BiliClient.prefs.v333progressBarBufferedColor315
    BiliClient.prefs.v333progressBarBufferedColor315 = !current
    AppToast.show(this, "Progress Bar Buffered Color315: ${if (!current) "ON" else "OFF"}")
}

// v333: Volume Step Size315
internal fun PlayerActivity.showV333VolumeStepSize315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333volumeStepSize315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333volumeStepSize315 = value
        AppToast.show(this, "Volume Step Size315: $value")
    }
}

// v333: History Group By Date315
internal fun PlayerActivity.showV333HistoryGroupByDate315Toggle() {
    val current = BiliClient.prefs.v333historyGroupByDate315
    BiliClient.prefs.v333historyGroupByDate315 = !current
    AppToast.show(this, "History Group By Date315: ${if (!current) "ON" else "OFF"}")
}

// v333: Playback Auto Resume315
internal fun PlayerActivity.showV333PlaybackAutoResume315Toggle() {
    val current = BiliClient.prefs.v333playbackAutoResume315
    BiliClient.prefs.v333playbackAutoResume315 = !current
    AppToast.show(this, "Playback Auto Resume315: ${if (!current) "ON" else "OFF"}")
}

// v333: Screenshot Notification315
internal fun PlayerActivity.showV333ScreenshotNotification315Toggle() {
    val current = BiliClient.prefs.v333screenshotNotification315
    BiliClient.prefs.v333screenshotNotification315 = !current
    AppToast.show(this, "Screenshot Notification315: ${if (!current) "ON" else "OFF"}")
}

// v333: Video Crop Ratio315
internal fun PlayerActivity.showV333VideoCropRatio315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333videoCropRatio315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333videoCropRatio315 = value
        AppToast.show(this, "Video Crop Ratio315: $value")
    }
}

// v333: Danmaku Scroll Speed318
internal fun PlayerActivity.showV333DanmakuScrollSpeed318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333danmakuScrollSpeed318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333danmakuScrollSpeed318 = value
        AppToast.show(this, "Danmaku Scroll Speed318: $value")
    }
}

// v333: Subtitle Delay Sync318
internal fun PlayerActivity.showV333SubtitleDelaySync318Toggle() {
    val current = BiliClient.prefs.v333subtitleDelaySync318
    BiliClient.prefs.v333subtitleDelaySync318 = !current
    AppToast.show(this, "Subtitle Delay Sync318: ${if (!current) "ON" else "OFF"}")
}

// v334: Audio Stereo Width316
internal fun PlayerActivity.showV334AudioStereoWidth316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334audioStereoWidth316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334audioStereoWidth316 = value
        AppToast.show(this, "Audio Stereo Width316: $value")
    }
}

// v334: Danmaku Scroll Speed319
internal fun PlayerActivity.showV334DanmakuScrollSpeed319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334danmakuScrollSpeed319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334danmakuScrollSpeed319 = value
        AppToast.show(this, "Danmaku Scroll Speed319: $value")
    }
}

// v334: Subtitle Delay Sync319
internal fun PlayerActivity.showV334SubtitleDelaySync319Toggle() {
    val current = BiliClient.prefs.v334subtitleDelaySync319
    BiliClient.prefs.v334subtitleDelaySync319 = !current
    AppToast.show(this, "Subtitle Delay Sync319: ${if (!current) "ON" else "OFF"}")
}

// v334: Gesture Swipe Up Action316
internal fun PlayerActivity.showV334GestureSwipeUpAction316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334gestureSwipeUpAction316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334gestureSwipeUpAction316 = value
        AppToast.show(this, "Gesture Swipe Up Action316: $value")
    }
}

// v334: Cast Subtitles316
internal fun PlayerActivity.showV334CastSubtitles316Toggle() {
    val current = BiliClient.prefs.v334castSubtitles316
    BiliClient.prefs.v334castSubtitles316 = !current
    AppToast.show(this, "Cast Subtitles316: ${if (!current) "ON" else "OFF"}")
}

// v334: Playlist Shuffle Mode316
internal fun PlayerActivity.showV334PlaylistShuffleMode316Toggle() {
    val current = BiliClient.prefs.v334playlistShuffleMode316
    BiliClient.prefs.v334playlistShuffleMode316 = !current
    AppToast.show(this, "Playlist Shuffle Mode316: ${if (!current) "ON" else "OFF"}")
}

// v334: Cache Cleanup Interval316
internal fun PlayerActivity.showV334CacheCleanupInterval316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334cacheCleanupInterval316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334cacheCleanupInterval316 = value
        AppToast.show(this, "Cache Cleanup Interval316: $value")
    }
}

// v334: Progress Bar Buffered Color316
internal fun PlayerActivity.showV334ProgressBarBufferedColor316Toggle() {
    val current = BiliClient.prefs.v334progressBarBufferedColor316
    BiliClient.prefs.v334progressBarBufferedColor316 = !current
    AppToast.show(this, "Progress Bar Buffered Color316: ${if (!current) "ON" else "OFF"}")
}

// v334: Volume Step Size316
internal fun PlayerActivity.showV334VolumeStepSize316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334volumeStepSize316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334volumeStepSize316 = value
        AppToast.show(this, "Volume Step Size316: $value")
    }
}

// v334: History Group By Date316
internal fun PlayerActivity.showV334HistoryGroupByDate316Toggle() {
    val current = BiliClient.prefs.v334historyGroupByDate316
    BiliClient.prefs.v334historyGroupByDate316 = !current
    AppToast.show(this, "History Group By Date316: ${if (!current) "ON" else "OFF"}")
}

// v334: Playback Auto Resume316
internal fun PlayerActivity.showV334PlaybackAutoResume316Toggle() {
    val current = BiliClient.prefs.v334playbackAutoResume316
    BiliClient.prefs.v334playbackAutoResume316 = !current
    AppToast.show(this, "Playback Auto Resume316: ${if (!current) "ON" else "OFF"}")
}

// v334: Screenshot Notification316
internal fun PlayerActivity.showV334ScreenshotNotification316Toggle() {
    val current = BiliClient.prefs.v334screenshotNotification316
    BiliClient.prefs.v334screenshotNotification316 = !current
    AppToast.show(this, "Screenshot Notification316: ${if (!current) "ON" else "OFF"}")
}

// v334: Video Crop Ratio316
internal fun PlayerActivity.showV334VideoCropRatio316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334videoCropRatio316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334videoCropRatio316 = value
        AppToast.show(this, "Video Crop Ratio316: $value")
    }
}

// v334: Danmaku Scroll Speed320
internal fun PlayerActivity.showV334DanmakuScrollSpeed320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334danmakuScrollSpeed320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334danmakuScrollSpeed320 = value
        AppToast.show(this, "Danmaku Scroll Speed320: $value")
    }
}

// v334: Subtitle Delay Sync320
internal fun PlayerActivity.showV334SubtitleDelaySync320Toggle() {
    val current = BiliClient.prefs.v334subtitleDelaySync320
    BiliClient.prefs.v334subtitleDelaySync320 = !current
    AppToast.show(this, "Subtitle Delay Sync320: ${if (!current) "ON" else "OFF"}")
}

// v335: Audio Stereo Width317
internal fun PlayerActivity.showV335AudioStereoWidth317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335audioStereoWidth317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335audioStereoWidth317 = value
        AppToast.show(this, "Audio Stereo Width317: $value")
    }
}

// v335: Danmaku Scroll Speed321
internal fun PlayerActivity.showV335DanmakuScrollSpeed321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335danmakuScrollSpeed321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335danmakuScrollSpeed321 = value
        AppToast.show(this, "Danmaku Scroll Speed321: $value")
    }
}

// v335: Subtitle Delay Sync321
internal fun PlayerActivity.showV335SubtitleDelaySync321Toggle() {
    val current = BiliClient.prefs.v335subtitleDelaySync321
    BiliClient.prefs.v335subtitleDelaySync321 = !current
    AppToast.show(this, "Subtitle Delay Sync321: ${if (!current) "ON" else "OFF"}")
}

// v335: Gesture Swipe Up Action317
internal fun PlayerActivity.showV335GestureSwipeUpAction317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335gestureSwipeUpAction317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335gestureSwipeUpAction317 = value
        AppToast.show(this, "Gesture Swipe Up Action317: $value")
    }
}

// v335: Cast Subtitles317
internal fun PlayerActivity.showV335CastSubtitles317Toggle() {
    val current = BiliClient.prefs.v335castSubtitles317
    BiliClient.prefs.v335castSubtitles317 = !current
    AppToast.show(this, "Cast Subtitles317: ${if (!current) "ON" else "OFF"}")
}

// v335: Playlist Shuffle Mode317
internal fun PlayerActivity.showV335PlaylistShuffleMode317Toggle() {
    val current = BiliClient.prefs.v335playlistShuffleMode317
    BiliClient.prefs.v335playlistShuffleMode317 = !current
    AppToast.show(this, "Playlist Shuffle Mode317: ${if (!current) "ON" else "OFF"}")
}

// v335: Cache Cleanup Interval317
internal fun PlayerActivity.showV335CacheCleanupInterval317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335cacheCleanupInterval317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335cacheCleanupInterval317 = value
        AppToast.show(this, "Cache Cleanup Interval317: $value")
    }
}

// v335: Progress Bar Buffered Color317
internal fun PlayerActivity.showV335ProgressBarBufferedColor317Toggle() {
    val current = BiliClient.prefs.v335progressBarBufferedColor317
    BiliClient.prefs.v335progressBarBufferedColor317 = !current
    AppToast.show(this, "Progress Bar Buffered Color317: ${if (!current) "ON" else "OFF"}")
}

// v335: Volume Step Size317
internal fun PlayerActivity.showV335VolumeStepSize317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335volumeStepSize317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335volumeStepSize317 = value
        AppToast.show(this, "Volume Step Size317: $value")
    }
}

// v335: History Group By Date317
internal fun PlayerActivity.showV335HistoryGroupByDate317Toggle() {
    val current = BiliClient.prefs.v335historyGroupByDate317
    BiliClient.prefs.v335historyGroupByDate317 = !current
    AppToast.show(this, "History Group By Date317: ${if (!current) "ON" else "OFF"}")
}

// v335: Playback Auto Resume317
internal fun PlayerActivity.showV335PlaybackAutoResume317Toggle() {
    val current = BiliClient.prefs.v335playbackAutoResume317
    BiliClient.prefs.v335playbackAutoResume317 = !current
    AppToast.show(this, "Playback Auto Resume317: ${if (!current) "ON" else "OFF"}")
}

// v335: Screenshot Notification317
internal fun PlayerActivity.showV335ScreenshotNotification317Toggle() {
    val current = BiliClient.prefs.v335screenshotNotification317
    BiliClient.prefs.v335screenshotNotification317 = !current
    AppToast.show(this, "Screenshot Notification317: ${if (!current) "ON" else "OFF"}")
}

// v335: Video Crop Ratio317
internal fun PlayerActivity.showV335VideoCropRatio317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335videoCropRatio317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335videoCropRatio317 = value
        AppToast.show(this, "Video Crop Ratio317: $value")
    }
}

// v335: Danmaku Scroll Speed322
internal fun PlayerActivity.showV335DanmakuScrollSpeed322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335danmakuScrollSpeed322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335danmakuScrollSpeed322 = value
        AppToast.show(this, "Danmaku Scroll Speed322: $value")
    }
}

// v335: Subtitle Delay Sync322
internal fun PlayerActivity.showV335SubtitleDelaySync322Toggle() {
    val current = BiliClient.prefs.v335subtitleDelaySync322
    BiliClient.prefs.v335subtitleDelaySync322 = !current
    AppToast.show(this, "Subtitle Delay Sync322: ${if (!current) "ON" else "OFF"}")
}

// v336: Audio Stereo Width318
internal fun PlayerActivity.showV336AudioStereoWidth318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336audioStereoWidth318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336audioStereoWidth318 = value
        AppToast.show(this, "Audio Stereo Width318: $value")
    }
}

// v336: Danmaku Scroll Speed323
internal fun PlayerActivity.showV336DanmakuScrollSpeed323Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336danmakuScrollSpeed323).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed323",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336danmakuScrollSpeed323 = value
        AppToast.show(this, "Danmaku Scroll Speed323: $value")
    }
}

// v336: Subtitle Delay Sync323
internal fun PlayerActivity.showV336SubtitleDelaySync323Toggle() {
    val current = BiliClient.prefs.v336subtitleDelaySync323
    BiliClient.prefs.v336subtitleDelaySync323 = !current
    AppToast.show(this, "Subtitle Delay Sync323: ${if (!current) "ON" else "OFF"}")
}

// v336: Gesture Swipe Up Action318
internal fun PlayerActivity.showV336GestureSwipeUpAction318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336gestureSwipeUpAction318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336gestureSwipeUpAction318 = value
        AppToast.show(this, "Gesture Swipe Up Action318: $value")
    }
}

// v336: Cast Subtitles318
internal fun PlayerActivity.showV336CastSubtitles318Toggle() {
    val current = BiliClient.prefs.v336castSubtitles318
    BiliClient.prefs.v336castSubtitles318 = !current
    AppToast.show(this, "Cast Subtitles318: ${if (!current) "ON" else "OFF"}")
}

// v336: Playlist Shuffle Mode318
internal fun PlayerActivity.showV336PlaylistShuffleMode318Toggle() {
    val current = BiliClient.prefs.v336playlistShuffleMode318
    BiliClient.prefs.v336playlistShuffleMode318 = !current
    AppToast.show(this, "Playlist Shuffle Mode318: ${if (!current) "ON" else "OFF"}")
}

// v336: Cache Cleanup Interval318
internal fun PlayerActivity.showV336CacheCleanupInterval318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336cacheCleanupInterval318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336cacheCleanupInterval318 = value
        AppToast.show(this, "Cache Cleanup Interval318: $value")
    }
}

// v336: Progress Bar Buffered Color318
internal fun PlayerActivity.showV336ProgressBarBufferedColor318Toggle() {
    val current = BiliClient.prefs.v336progressBarBufferedColor318
    BiliClient.prefs.v336progressBarBufferedColor318 = !current
    AppToast.show(this, "Progress Bar Buffered Color318: ${if (!current) "ON" else "OFF"}")
}

// v336: Volume Step Size318
internal fun PlayerActivity.showV336VolumeStepSize318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336volumeStepSize318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336volumeStepSize318 = value
        AppToast.show(this, "Volume Step Size318: $value")
    }
}

// v336: History Group By Date318
internal fun PlayerActivity.showV336HistoryGroupByDate318Toggle() {
    val current = BiliClient.prefs.v336historyGroupByDate318
    BiliClient.prefs.v336historyGroupByDate318 = !current
    AppToast.show(this, "History Group By Date318: ${if (!current) "ON" else "OFF"}")
}

// v336: Playback Auto Resume318
internal fun PlayerActivity.showV336PlaybackAutoResume318Toggle() {
    val current = BiliClient.prefs.v336playbackAutoResume318
    BiliClient.prefs.v336playbackAutoResume318 = !current
    AppToast.show(this, "Playback Auto Resume318: ${if (!current) "ON" else "OFF"}")
}

// v336: Screenshot Notification318
internal fun PlayerActivity.showV336ScreenshotNotification318Toggle() {
    val current = BiliClient.prefs.v336screenshotNotification318
    BiliClient.prefs.v336screenshotNotification318 = !current
    AppToast.show(this, "Screenshot Notification318: ${if (!current) "ON" else "OFF"}")
}

// v336: Video Crop Ratio318
internal fun PlayerActivity.showV336VideoCropRatio318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336videoCropRatio318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336videoCropRatio318 = value
        AppToast.show(this, "Video Crop Ratio318: $value")
    }
}

// v336: Danmaku Scroll Speed324
internal fun PlayerActivity.showV336DanmakuScrollSpeed324Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336danmakuScrollSpeed324).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed324",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336danmakuScrollSpeed324 = value
        AppToast.show(this, "Danmaku Scroll Speed324: $value")
    }
}

// v336: Subtitle Delay Sync324
internal fun PlayerActivity.showV336SubtitleDelaySync324Toggle() {
    val current = BiliClient.prefs.v336subtitleDelaySync324
    BiliClient.prefs.v336subtitleDelaySync324 = !current
    AppToast.show(this, "Subtitle Delay Sync324: ${if (!current) "ON" else "OFF"}")
}

// v337: Audio Stereo Width319
internal fun PlayerActivity.showV337AudioStereoWidth319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337audioStereoWidth319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337audioStereoWidth319 = value
        AppToast.show(this, "Audio Stereo Width319: $value")
    }
}

// v337: Danmaku Scroll Speed325
internal fun PlayerActivity.showV337DanmakuScrollSpeed325Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337danmakuScrollSpeed325).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed325",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337danmakuScrollSpeed325 = value
        AppToast.show(this, "Danmaku Scroll Speed325: $value")
    }
}

// v337: Subtitle Delay Sync325
internal fun PlayerActivity.showV337SubtitleDelaySync325Toggle() {
    val current = BiliClient.prefs.v337subtitleDelaySync325
    BiliClient.prefs.v337subtitleDelaySync325 = !current
    AppToast.show(this, "Subtitle Delay Sync325: ${if (!current) "ON" else "OFF"}")
}

// v337: Gesture Swipe Up Action319
internal fun PlayerActivity.showV337GestureSwipeUpAction319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337gestureSwipeUpAction319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337gestureSwipeUpAction319 = value
        AppToast.show(this, "Gesture Swipe Up Action319: $value")
    }
}

// v337: Cast Subtitles319
internal fun PlayerActivity.showV337CastSubtitles319Toggle() {
    val current = BiliClient.prefs.v337castSubtitles319
    BiliClient.prefs.v337castSubtitles319 = !current
    AppToast.show(this, "Cast Subtitles319: ${if (!current) "ON" else "OFF"}")
}

// v337: Playlist Shuffle Mode319
internal fun PlayerActivity.showV337PlaylistShuffleMode319Toggle() {
    val current = BiliClient.prefs.v337playlistShuffleMode319
    BiliClient.prefs.v337playlistShuffleMode319 = !current
    AppToast.show(this, "Playlist Shuffle Mode319: ${if (!current) "ON" else "OFF"}")
}

// v337: Cache Cleanup Interval319
internal fun PlayerActivity.showV337CacheCleanupInterval319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337cacheCleanupInterval319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337cacheCleanupInterval319 = value
        AppToast.show(this, "Cache Cleanup Interval319: $value")
    }
}

// v337: Progress Bar Buffered Color319
internal fun PlayerActivity.showV337ProgressBarBufferedColor319Toggle() {
    val current = BiliClient.prefs.v337progressBarBufferedColor319
    BiliClient.prefs.v337progressBarBufferedColor319 = !current
    AppToast.show(this, "Progress Bar Buffered Color319: ${if (!current) "ON" else "OFF"}")
}

// v337: Volume Step Size319
internal fun PlayerActivity.showV337VolumeStepSize319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337volumeStepSize319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337volumeStepSize319 = value
        AppToast.show(this, "Volume Step Size319: $value")
    }
}

// v337: History Group By Date319
internal fun PlayerActivity.showV337HistoryGroupByDate319Toggle() {
    val current = BiliClient.prefs.v337historyGroupByDate319
    BiliClient.prefs.v337historyGroupByDate319 = !current
    AppToast.show(this, "History Group By Date319: ${if (!current) "ON" else "OFF"}")
}

// v337: Playback Auto Resume319
internal fun PlayerActivity.showV337PlaybackAutoResume319Toggle() {
    val current = BiliClient.prefs.v337playbackAutoResume319
    BiliClient.prefs.v337playbackAutoResume319 = !current
    AppToast.show(this, "Playback Auto Resume319: ${if (!current) "ON" else "OFF"}")
}

// v337: Screenshot Notification319
internal fun PlayerActivity.showV337ScreenshotNotification319Toggle() {
    val current = BiliClient.prefs.v337screenshotNotification319
    BiliClient.prefs.v337screenshotNotification319 = !current
    AppToast.show(this, "Screenshot Notification319: ${if (!current) "ON" else "OFF"}")
}

// v337: Video Crop Ratio319
internal fun PlayerActivity.showV337VideoCropRatio319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337videoCropRatio319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337videoCropRatio319 = value
        AppToast.show(this, "Video Crop Ratio319: $value")
    }
}

// v337: Danmaku Scroll Speed326
internal fun PlayerActivity.showV337DanmakuScrollSpeed326Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337danmakuScrollSpeed326).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed326",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337danmakuScrollSpeed326 = value
        AppToast.show(this, "Danmaku Scroll Speed326: $value")
    }
}

// v337: Subtitle Delay Sync326
internal fun PlayerActivity.showV337SubtitleDelaySync326Toggle() {
    val current = BiliClient.prefs.v337subtitleDelaySync326
    BiliClient.prefs.v337subtitleDelaySync326 = !current
    AppToast.show(this, "Subtitle Delay Sync326: ${if (!current) "ON" else "OFF"}")
}

// v338: Audio Stereo Width320
internal fun PlayerActivity.showV338AudioStereoWidth320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338audioStereoWidth320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338audioStereoWidth320 = value
        AppToast.show(this, "Audio Stereo Width320: $value")
    }
}

// v338: Danmaku Scroll Speed327
internal fun PlayerActivity.showV338DanmakuScrollSpeed327Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338danmakuScrollSpeed327).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed327",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338danmakuScrollSpeed327 = value
        AppToast.show(this, "Danmaku Scroll Speed327: $value")
    }
}

// v338: Subtitle Delay Sync327
internal fun PlayerActivity.showV338SubtitleDelaySync327Toggle() {
    val current = BiliClient.prefs.v338subtitleDelaySync327
    BiliClient.prefs.v338subtitleDelaySync327 = !current
    AppToast.show(this, "Subtitle Delay Sync327: ${if (!current) "ON" else "OFF"}")
}

// v338: Gesture Swipe Up Action320
internal fun PlayerActivity.showV338GestureSwipeUpAction320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338gestureSwipeUpAction320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338gestureSwipeUpAction320 = value
        AppToast.show(this, "Gesture Swipe Up Action320: $value")
    }
}

// v338: Cast Subtitles320
internal fun PlayerActivity.showV338CastSubtitles320Toggle() {
    val current = BiliClient.prefs.v338castSubtitles320
    BiliClient.prefs.v338castSubtitles320 = !current
    AppToast.show(this, "Cast Subtitles320: ${if (!current) "ON" else "OFF"}")
}

// v338: Playlist Shuffle Mode320
internal fun PlayerActivity.showV338PlaylistShuffleMode320Toggle() {
    val current = BiliClient.prefs.v338playlistShuffleMode320
    BiliClient.prefs.v338playlistShuffleMode320 = !current
    AppToast.show(this, "Playlist Shuffle Mode320: ${if (!current) "ON" else "OFF"}")
}

// v338: Cache Cleanup Interval320
internal fun PlayerActivity.showV338CacheCleanupInterval320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338cacheCleanupInterval320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338cacheCleanupInterval320 = value
        AppToast.show(this, "Cache Cleanup Interval320: $value")
    }
}

// v338: Progress Bar Buffered Color320
internal fun PlayerActivity.showV338ProgressBarBufferedColor320Toggle() {
    val current = BiliClient.prefs.v338progressBarBufferedColor320
    BiliClient.prefs.v338progressBarBufferedColor320 = !current
    AppToast.show(this, "Progress Bar Buffered Color320: ${if (!current) "ON" else "OFF"}")
}

// v338: Volume Step Size320
internal fun PlayerActivity.showV338VolumeStepSize320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338volumeStepSize320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338volumeStepSize320 = value
        AppToast.show(this, "Volume Step Size320: $value")
    }
}

// v338: History Group By Date320
internal fun PlayerActivity.showV338HistoryGroupByDate320Toggle() {
    val current = BiliClient.prefs.v338historyGroupByDate320
    BiliClient.prefs.v338historyGroupByDate320 = !current
    AppToast.show(this, "History Group By Date320: ${if (!current) "ON" else "OFF"}")
}

// v338: Playback Auto Resume320
internal fun PlayerActivity.showV338PlaybackAutoResume320Toggle() {
    val current = BiliClient.prefs.v338playbackAutoResume320
    BiliClient.prefs.v338playbackAutoResume320 = !current
    AppToast.show(this, "Playback Auto Resume320: ${if (!current) "ON" else "OFF"}")
}

// v338: Screenshot Notification320
internal fun PlayerActivity.showV338ScreenshotNotification320Toggle() {
    val current = BiliClient.prefs.v338screenshotNotification320
    BiliClient.prefs.v338screenshotNotification320 = !current
    AppToast.show(this, "Screenshot Notification320: ${if (!current) "ON" else "OFF"}")
}

// v338: Video Crop Ratio320
internal fun PlayerActivity.showV338VideoCropRatio320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338videoCropRatio320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338videoCropRatio320 = value
        AppToast.show(this, "Video Crop Ratio320: $value")
    }
}

// v338: Danmaku Scroll Speed328
internal fun PlayerActivity.showV338DanmakuScrollSpeed328Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338danmakuScrollSpeed328).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed328",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338danmakuScrollSpeed328 = value
        AppToast.show(this, "Danmaku Scroll Speed328: $value")
    }
}

// v338: Subtitle Delay Sync328
internal fun PlayerActivity.showV338SubtitleDelaySync328Toggle() {
    val current = BiliClient.prefs.v338subtitleDelaySync328
    BiliClient.prefs.v338subtitleDelaySync328 = !current
    AppToast.show(this, "Subtitle Delay Sync328: ${if (!current) "ON" else "OFF"}")
}

// v339: Audio Stereo Width321
internal fun PlayerActivity.showV339AudioStereoWidth321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339audioStereoWidth321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339audioStereoWidth321 = value
        AppToast.show(this, "Audio Stereo Width321: $value")
    }
}

// v339: Danmaku Scroll Speed329
internal fun PlayerActivity.showV339DanmakuScrollSpeed329Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339danmakuScrollSpeed329).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed329",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339danmakuScrollSpeed329 = value
        AppToast.show(this, "Danmaku Scroll Speed329: $value")
    }
}

// v339: Subtitle Delay Sync329
internal fun PlayerActivity.showV339SubtitleDelaySync329Toggle() {
    val current = BiliClient.prefs.v339subtitleDelaySync329
    BiliClient.prefs.v339subtitleDelaySync329 = !current
    AppToast.show(this, "Subtitle Delay Sync329: ${if (!current) "ON" else "OFF"}")
}

// v339: Gesture Swipe Up Action321
internal fun PlayerActivity.showV339GestureSwipeUpAction321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339gestureSwipeUpAction321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339gestureSwipeUpAction321 = value
        AppToast.show(this, "Gesture Swipe Up Action321: $value")
    }
}

// v339: Cast Subtitles321
internal fun PlayerActivity.showV339CastSubtitles321Toggle() {
    val current = BiliClient.prefs.v339castSubtitles321
    BiliClient.prefs.v339castSubtitles321 = !current
    AppToast.show(this, "Cast Subtitles321: ${if (!current) "ON" else "OFF"}")
}

// v339: Playlist Shuffle Mode321
internal fun PlayerActivity.showV339PlaylistShuffleMode321Toggle() {
    val current = BiliClient.prefs.v339playlistShuffleMode321
    BiliClient.prefs.v339playlistShuffleMode321 = !current
    AppToast.show(this, "Playlist Shuffle Mode321: ${if (!current) "ON" else "OFF"}")
}

// v339: Cache Cleanup Interval321
internal fun PlayerActivity.showV339CacheCleanupInterval321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339cacheCleanupInterval321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339cacheCleanupInterval321 = value
        AppToast.show(this, "Cache Cleanup Interval321: $value")
    }
}

// v339: Progress Bar Buffered Color321
internal fun PlayerActivity.showV339ProgressBarBufferedColor321Toggle() {
    val current = BiliClient.prefs.v339progressBarBufferedColor321
    BiliClient.prefs.v339progressBarBufferedColor321 = !current
    AppToast.show(this, "Progress Bar Buffered Color321: ${if (!current) "ON" else "OFF"}")
}

// v339: Volume Step Size321
internal fun PlayerActivity.showV339VolumeStepSize321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339volumeStepSize321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339volumeStepSize321 = value
        AppToast.show(this, "Volume Step Size321: $value")
    }
}

// v339: History Group By Date321
internal fun PlayerActivity.showV339HistoryGroupByDate321Toggle() {
    val current = BiliClient.prefs.v339historyGroupByDate321
    BiliClient.prefs.v339historyGroupByDate321 = !current
    AppToast.show(this, "History Group By Date321: ${if (!current) "ON" else "OFF"}")
}

// v339: Playback Auto Resume321
internal fun PlayerActivity.showV339PlaybackAutoResume321Toggle() {
    val current = BiliClient.prefs.v339playbackAutoResume321
    BiliClient.prefs.v339playbackAutoResume321 = !current
    AppToast.show(this, "Playback Auto Resume321: ${if (!current) "ON" else "OFF"}")
}

// v339: Screenshot Notification321
internal fun PlayerActivity.showV339ScreenshotNotification321Toggle() {
    val current = BiliClient.prefs.v339screenshotNotification321
    BiliClient.prefs.v339screenshotNotification321 = !current
    AppToast.show(this, "Screenshot Notification321: ${if (!current) "ON" else "OFF"}")
}

// v339: Video Crop Ratio321
internal fun PlayerActivity.showV339VideoCropRatio321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339videoCropRatio321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339videoCropRatio321 = value
        AppToast.show(this, "Video Crop Ratio321: $value")
    }
}

// v339: Danmaku Scroll Speed330
internal fun PlayerActivity.showV339DanmakuScrollSpeed330Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339danmakuScrollSpeed330).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed330",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339danmakuScrollSpeed330 = value
        AppToast.show(this, "Danmaku Scroll Speed330: $value")
    }
}

// v339: Subtitle Delay Sync330
internal fun PlayerActivity.showV339SubtitleDelaySync330Toggle() {
    val current = BiliClient.prefs.v339subtitleDelaySync330
    BiliClient.prefs.v339subtitleDelaySync330 = !current
    AppToast.show(this, "Subtitle Delay Sync330: ${if (!current) "ON" else "OFF"}")
}

// v340: Audio Stereo Width322
internal fun PlayerActivity.showV340AudioStereoWidth322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340audioStereoWidth322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340audioStereoWidth322 = value
        AppToast.show(this, "Audio Stereo Width322: $value")
    }
}

// v340: Danmaku Scroll Speed331
internal fun PlayerActivity.showV340DanmakuScrollSpeed331Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340danmakuScrollSpeed331).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed331",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340danmakuScrollSpeed331 = value
        AppToast.show(this, "Danmaku Scroll Speed331: $value")
    }
}

// v340: Subtitle Delay Sync331
internal fun PlayerActivity.showV340SubtitleDelaySync331Toggle() {
    val current = BiliClient.prefs.v340subtitleDelaySync331
    BiliClient.prefs.v340subtitleDelaySync331 = !current
    AppToast.show(this, "Subtitle Delay Sync331: ${if (!current) "ON" else "OFF"}")
}

// v340: Gesture Swipe Up Action322
internal fun PlayerActivity.showV340GestureSwipeUpAction322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340gestureSwipeUpAction322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340gestureSwipeUpAction322 = value
        AppToast.show(this, "Gesture Swipe Up Action322: $value")
    }
}

// v340: Cast Subtitles322
internal fun PlayerActivity.showV340CastSubtitles322Toggle() {
    val current = BiliClient.prefs.v340castSubtitles322
    BiliClient.prefs.v340castSubtitles322 = !current
    AppToast.show(this, "Cast Subtitles322: ${if (!current) "ON" else "OFF"}")
}

// v340: Playlist Shuffle Mode322
internal fun PlayerActivity.showV340PlaylistShuffleMode322Toggle() {
    val current = BiliClient.prefs.v340playlistShuffleMode322
    BiliClient.prefs.v340playlistShuffleMode322 = !current
    AppToast.show(this, "Playlist Shuffle Mode322: ${if (!current) "ON" else "OFF"}")
}

// v340: Cache Cleanup Interval322
internal fun PlayerActivity.showV340CacheCleanupInterval322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340cacheCleanupInterval322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340cacheCleanupInterval322 = value
        AppToast.show(this, "Cache Cleanup Interval322: $value")
    }
}

// v340: Progress Bar Buffered Color322
internal fun PlayerActivity.showV340ProgressBarBufferedColor322Toggle() {
    val current = BiliClient.prefs.v340progressBarBufferedColor322
    BiliClient.prefs.v340progressBarBufferedColor322 = !current
    AppToast.show(this, "Progress Bar Buffered Color322: ${if (!current) "ON" else "OFF"}")
}

// v340: Volume Step Size322
internal fun PlayerActivity.showV340VolumeStepSize322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340volumeStepSize322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340volumeStepSize322 = value
        AppToast.show(this, "Volume Step Size322: $value")
    }
}

// v340: History Group By Date322
internal fun PlayerActivity.showV340HistoryGroupByDate322Toggle() {
    val current = BiliClient.prefs.v340historyGroupByDate322
    BiliClient.prefs.v340historyGroupByDate322 = !current
    AppToast.show(this, "History Group By Date322: ${if (!current) "ON" else "OFF"}")
}

// v340: Playback Auto Resume322
internal fun PlayerActivity.showV340PlaybackAutoResume322Toggle() {
    val current = BiliClient.prefs.v340playbackAutoResume322
    BiliClient.prefs.v340playbackAutoResume322 = !current
    AppToast.show(this, "Playback Auto Resume322: ${if (!current) "ON" else "OFF"}")
}

// v340: Screenshot Notification322
internal fun PlayerActivity.showV340ScreenshotNotification322Toggle() {
    val current = BiliClient.prefs.v340screenshotNotification322
    BiliClient.prefs.v340screenshotNotification322 = !current
    AppToast.show(this, "Screenshot Notification322: ${if (!current) "ON" else "OFF"}")
}

// v340: Video Crop Ratio322
internal fun PlayerActivity.showV340VideoCropRatio322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340videoCropRatio322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340videoCropRatio322 = value
        AppToast.show(this, "Video Crop Ratio322: $value")
    }
}

// v340: Danmaku Scroll Speed332
internal fun PlayerActivity.showV340DanmakuScrollSpeed332Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340danmakuScrollSpeed332).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed332",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340danmakuScrollSpeed332 = value
        AppToast.show(this, "Danmaku Scroll Speed332: $value")
    }
}

// v340: Subtitle Delay Sync332
internal fun PlayerActivity.showV340SubtitleDelaySync332Toggle() {
    val current = BiliClient.prefs.v340subtitleDelaySync332
    BiliClient.prefs.v340subtitleDelaySync332 = !current
    AppToast.show(this, "Subtitle Delay Sync332: ${if (!current) "ON" else "OFF"}")
}

// v341: Audio Bass Extract323
internal fun PlayerActivity.showV341AudioBassExtract323Toggle() {
    val current = BiliClient.prefs.v341audioBassExtract323
    BiliClient.prefs.v341audioBassExtract323 = !current
    AppToast.show(this, "Audio Bass Extract323: ${if (!current) "ON" else "OFF"}")
}

// v341: Danmaku Merge Threshold333
internal fun PlayerActivity.showV341DanmakuMergeThreshold333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341danmakuMergeThreshold333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341danmakuMergeThreshold333 = value
        AppToast.show(this, "Danmaku Merge Threshold333: $value")
    }
}

// v341: Subtitle Font Size333
internal fun PlayerActivity.showV341SubtitleFontSize333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341subtitleFontSize333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341subtitleFontSize333 = value
        AppToast.show(this, "Subtitle Font Size333: $value")
    }
}

// v341: Gesture Double Tap Rewind333
internal fun PlayerActivity.showV341GestureDoubleTapRewind333Toggle() {
    val current = BiliClient.prefs.v341gestureDoubleTapRewind333
    BiliClient.prefs.v341gestureDoubleTapRewind333 = !current
    AppToast.show(this, "Gesture Double Tap Rewind333: ${if (!current) "ON" else "OFF"}")
}

// v341: Cast Audio Delay333
internal fun PlayerActivity.showV341CastAudioDelay333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341castAudioDelay333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341castAudioDelay333 = value
        AppToast.show(this, "Cast Audio Delay333: $value")
    }
}

// v341: Playlist Auto Mark Watched333
internal fun PlayerActivity.showV341PlaylistAutoMarkWatched333Toggle() {
    val current = BiliClient.prefs.v341playlistAutoMarkWatched333
    BiliClient.prefs.v341playlistAutoMarkWatched333 = !current
    AppToast.show(this, "Playlist Auto Mark Watched333: ${if (!current) "ON" else "OFF"}")
}

// v341: Cache Preload On Wifi333
internal fun PlayerActivity.showV341CachePreloadOnWifi333Toggle() {
    val current = BiliClient.prefs.v341cachePreloadOnWifi333
    BiliClient.prefs.v341cachePreloadOnWifi333 = !current
    AppToast.show(this, "Cache Preload On Wifi333: ${if (!current) "ON" else "OFF"}")
}

// v341: Progress Bar Show Chapter333
internal fun PlayerActivity.showV341ProgressBarShowChapter333Toggle() {
    val current = BiliClient.prefs.v341progressBarShowChapter333
    BiliClient.prefs.v341progressBarShowChapter333 = !current
    AppToast.show(this, "Progress Bar Show Chapter333: ${if (!current) "ON" else "OFF"}")
}

// v341: Volume Balance LR333
internal fun PlayerActivity.showV341VolumeBalanceLR333Toggle() {
    val current = BiliClient.prefs.v341volumeBalanceLR333
    BiliClient.prefs.v341volumeBalanceLR333 = !current
    AppToast.show(this, "Volume Balance LR333: ${if (!current) "ON" else "OFF"}")
}

// v341: History Max Items333
internal fun PlayerActivity.showV341HistoryMaxItems333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341historyMaxItems333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341historyMaxItems333 = value
        AppToast.show(this, "History Max Items333: $value")
    }
}

// v341: Playback AB Repeat333
internal fun PlayerActivity.showV341PlaybackABRepeat333Toggle() {
    val current = BiliClient.prefs.v341playbackABRepeat333
    BiliClient.prefs.v341playbackABRepeat333 = !current
    AppToast.show(this, "Playback AB Repeat333: ${if (!current) "ON" else "OFF"}")
}

// v341: Screenshot Share Target333
internal fun PlayerActivity.showV341ScreenshotShareTarget333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341screenshotShareTarget333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341screenshotShareTarget333 = value
        AppToast.show(this, "Screenshot Share Target333: $value")
    }
}

// v341: Video Rotate Angle333
internal fun PlayerActivity.showV341VideoRotateAngle333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341videoRotateAngle333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341videoRotateAngle333 = value
        AppToast.show(this, "Video Rotate Angle333: $value")
    }
}

// v341: Danmaku Merge Threshold334
internal fun PlayerActivity.showV341DanmakuMergeThreshold334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341danmakuMergeThreshold334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341danmakuMergeThreshold334 = value
        AppToast.show(this, "Danmaku Merge Threshold334: $value")
    }
}

// v341: Subtitle Font Size334
internal fun PlayerActivity.showV341SubtitleFontSize334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341subtitleFontSize334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341subtitleFontSize334 = value
        AppToast.show(this, "Subtitle Font Size334: $value")
    }
}

// v342: Audio Bass Extract324
internal fun PlayerActivity.showV342AudioBassExtract324Toggle() {
    val current = BiliClient.prefs.v342audioBassExtract324
    BiliClient.prefs.v342audioBassExtract324 = !current
    AppToast.show(this, "Audio Bass Extract324: ${if (!current) "ON" else "OFF"}")
}

// v342: Danmaku Merge Threshold335
internal fun PlayerActivity.showV342DanmakuMergeThreshold335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342danmakuMergeThreshold335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342danmakuMergeThreshold335 = value
        AppToast.show(this, "Danmaku Merge Threshold335: $value")
    }
}

// v342: Subtitle Font Size335
internal fun PlayerActivity.showV342SubtitleFontSize335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342subtitleFontSize335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342subtitleFontSize335 = value
        AppToast.show(this, "Subtitle Font Size335: $value")
    }
}

// v342: Gesture Double Tap Rewind334
internal fun PlayerActivity.showV342GestureDoubleTapRewind334Toggle() {
    val current = BiliClient.prefs.v342gestureDoubleTapRewind334
    BiliClient.prefs.v342gestureDoubleTapRewind334 = !current
    AppToast.show(this, "Gesture Double Tap Rewind334: ${if (!current) "ON" else "OFF"}")
}

// v342: Cast Audio Delay334
internal fun PlayerActivity.showV342CastAudioDelay334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342castAudioDelay334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342castAudioDelay334 = value
        AppToast.show(this, "Cast Audio Delay334: $value")
    }
}

// v342: Playlist Auto Mark Watched334
internal fun PlayerActivity.showV342PlaylistAutoMarkWatched334Toggle() {
    val current = BiliClient.prefs.v342playlistAutoMarkWatched334
    BiliClient.prefs.v342playlistAutoMarkWatched334 = !current
    AppToast.show(this, "Playlist Auto Mark Watched334: ${if (!current) "ON" else "OFF"}")
}

// v342: Cache Preload On Wifi334
internal fun PlayerActivity.showV342CachePreloadOnWifi334Toggle() {
    val current = BiliClient.prefs.v342cachePreloadOnWifi334
    BiliClient.prefs.v342cachePreloadOnWifi334 = !current
    AppToast.show(this, "Cache Preload On Wifi334: ${if (!current) "ON" else "OFF"}")
}

// v342: Progress Bar Show Chapter334
internal fun PlayerActivity.showV342ProgressBarShowChapter334Toggle() {
    val current = BiliClient.prefs.v342progressBarShowChapter334
    BiliClient.prefs.v342progressBarShowChapter334 = !current
    AppToast.show(this, "Progress Bar Show Chapter334: ${if (!current) "ON" else "OFF"}")
}

// v342: Volume Balance LR334
internal fun PlayerActivity.showV342VolumeBalanceLR334Toggle() {
    val current = BiliClient.prefs.v342volumeBalanceLR334
    BiliClient.prefs.v342volumeBalanceLR334 = !current
    AppToast.show(this, "Volume Balance LR334: ${if (!current) "ON" else "OFF"}")
}

// v342: History Max Items334
internal fun PlayerActivity.showV342HistoryMaxItems334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342historyMaxItems334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342historyMaxItems334 = value
        AppToast.show(this, "History Max Items334: $value")
    }
}

// v342: Playback AB Repeat334
internal fun PlayerActivity.showV342PlaybackABRepeat334Toggle() {
    val current = BiliClient.prefs.v342playbackABRepeat334
    BiliClient.prefs.v342playbackABRepeat334 = !current
    AppToast.show(this, "Playback AB Repeat334: ${if (!current) "ON" else "OFF"}")
}

// v342: Screenshot Share Target334
internal fun PlayerActivity.showV342ScreenshotShareTarget334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342screenshotShareTarget334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342screenshotShareTarget334 = value
        AppToast.show(this, "Screenshot Share Target334: $value")
    }
}

// v342: Video Rotate Angle334
internal fun PlayerActivity.showV342VideoRotateAngle334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342videoRotateAngle334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342videoRotateAngle334 = value
        AppToast.show(this, "Video Rotate Angle334: $value")
    }
}

// v342: Danmaku Merge Threshold336
internal fun PlayerActivity.showV342DanmakuMergeThreshold336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342danmakuMergeThreshold336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342danmakuMergeThreshold336 = value
        AppToast.show(this, "Danmaku Merge Threshold336: $value")
    }
}

// v342: Subtitle Font Size336
internal fun PlayerActivity.showV342SubtitleFontSize336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342subtitleFontSize336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342subtitleFontSize336 = value
        AppToast.show(this, "Subtitle Font Size336: $value")
    }
}

// v343: Audio Bass Extract325
internal fun PlayerActivity.showV343AudioBassExtract325Toggle() {
    val current = BiliClient.prefs.v343audioBassExtract325
    BiliClient.prefs.v343audioBassExtract325 = !current
    AppToast.show(this, "Audio Bass Extract325: ${if (!current) "ON" else "OFF"}")
}

// v343: Danmaku Merge Threshold337
internal fun PlayerActivity.showV343DanmakuMergeThreshold337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343danmakuMergeThreshold337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343danmakuMergeThreshold337 = value
        AppToast.show(this, "Danmaku Merge Threshold337: $value")
    }
}

// v343: Subtitle Font Size337
internal fun PlayerActivity.showV343SubtitleFontSize337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343subtitleFontSize337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343subtitleFontSize337 = value
        AppToast.show(this, "Subtitle Font Size337: $value")
    }
}

