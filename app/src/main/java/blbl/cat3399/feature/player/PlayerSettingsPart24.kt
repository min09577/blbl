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

internal fun PlayerActivity.showV335SubtitleDelaySync321Toggle() {
    val current = BiliClient.prefs.v335subtitleDelaySync321
    BiliClient.prefs.v335subtitleDelaySync321 = !current
    AppToast.show(this, "Subtitle Delay Sync321: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV335CastSubtitles317Toggle() {
    val current = BiliClient.prefs.v335castSubtitles317
    BiliClient.prefs.v335castSubtitles317 = !current
    AppToast.show(this, "Cast Subtitles317: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV335PlaylistShuffleMode317Toggle() {
    val current = BiliClient.prefs.v335playlistShuffleMode317
    BiliClient.prefs.v335playlistShuffleMode317 = !current
    AppToast.show(this, "Playlist Shuffle Mode317: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV335ProgressBarBufferedColor317Toggle() {
    val current = BiliClient.prefs.v335progressBarBufferedColor317
    BiliClient.prefs.v335progressBarBufferedColor317 = !current
    AppToast.show(this, "Progress Bar Buffered Color317: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV335HistoryGroupByDate317Toggle() {
    val current = BiliClient.prefs.v335historyGroupByDate317
    BiliClient.prefs.v335historyGroupByDate317 = !current
    AppToast.show(this, "History Group By Date317: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV335PlaybackAutoResume317Toggle() {
    val current = BiliClient.prefs.v335playbackAutoResume317
    BiliClient.prefs.v335playbackAutoResume317 = !current
    AppToast.show(this, "Playback Auto Resume317: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV335ScreenshotNotification317Toggle() {
    val current = BiliClient.prefs.v335screenshotNotification317
    BiliClient.prefs.v335screenshotNotification317 = !current
    AppToast.show(this, "Screenshot Notification317: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV335SubtitleDelaySync322Toggle() {
    val current = BiliClient.prefs.v335subtitleDelaySync322
    BiliClient.prefs.v335subtitleDelaySync322 = !current
    AppToast.show(this, "Subtitle Delay Sync322: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV336SubtitleDelaySync323Toggle() {
    val current = BiliClient.prefs.v336subtitleDelaySync323
    BiliClient.prefs.v336subtitleDelaySync323 = !current
    AppToast.show(this, "Subtitle Delay Sync323: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV336CastSubtitles318Toggle() {
    val current = BiliClient.prefs.v336castSubtitles318
    BiliClient.prefs.v336castSubtitles318 = !current
    AppToast.show(this, "Cast Subtitles318: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV336PlaylistShuffleMode318Toggle() {
    val current = BiliClient.prefs.v336playlistShuffleMode318
    BiliClient.prefs.v336playlistShuffleMode318 = !current
    AppToast.show(this, "Playlist Shuffle Mode318: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV336ProgressBarBufferedColor318Toggle() {
    val current = BiliClient.prefs.v336progressBarBufferedColor318
    BiliClient.prefs.v336progressBarBufferedColor318 = !current
    AppToast.show(this, "Progress Bar Buffered Color318: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV336HistoryGroupByDate318Toggle() {
    val current = BiliClient.prefs.v336historyGroupByDate318
    BiliClient.prefs.v336historyGroupByDate318 = !current
    AppToast.show(this, "History Group By Date318: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV336PlaybackAutoResume318Toggle() {
    val current = BiliClient.prefs.v336playbackAutoResume318
    BiliClient.prefs.v336playbackAutoResume318 = !current
    AppToast.show(this, "Playback Auto Resume318: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV336ScreenshotNotification318Toggle() {
    val current = BiliClient.prefs.v336screenshotNotification318
    BiliClient.prefs.v336screenshotNotification318 = !current
    AppToast.show(this, "Screenshot Notification318: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV336SubtitleDelaySync324Toggle() {
    val current = BiliClient.prefs.v336subtitleDelaySync324
    BiliClient.prefs.v336subtitleDelaySync324 = !current
    AppToast.show(this, "Subtitle Delay Sync324: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV337SubtitleDelaySync325Toggle() {
    val current = BiliClient.prefs.v337subtitleDelaySync325
    BiliClient.prefs.v337subtitleDelaySync325 = !current
    AppToast.show(this, "Subtitle Delay Sync325: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV337CastSubtitles319Toggle() {
    val current = BiliClient.prefs.v337castSubtitles319
    BiliClient.prefs.v337castSubtitles319 = !current
    AppToast.show(this, "Cast Subtitles319: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV337PlaylistShuffleMode319Toggle() {
    val current = BiliClient.prefs.v337playlistShuffleMode319
    BiliClient.prefs.v337playlistShuffleMode319 = !current
    AppToast.show(this, "Playlist Shuffle Mode319: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV337ProgressBarBufferedColor319Toggle() {
    val current = BiliClient.prefs.v337progressBarBufferedColor319
    BiliClient.prefs.v337progressBarBufferedColor319 = !current
    AppToast.show(this, "Progress Bar Buffered Color319: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV337HistoryGroupByDate319Toggle() {
    val current = BiliClient.prefs.v337historyGroupByDate319
    BiliClient.prefs.v337historyGroupByDate319 = !current
    AppToast.show(this, "History Group By Date319: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV337PlaybackAutoResume319Toggle() {
    val current = BiliClient.prefs.v337playbackAutoResume319
    BiliClient.prefs.v337playbackAutoResume319 = !current
    AppToast.show(this, "Playback Auto Resume319: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV337ScreenshotNotification319Toggle() {
    val current = BiliClient.prefs.v337screenshotNotification319
    BiliClient.prefs.v337screenshotNotification319 = !current
    AppToast.show(this, "Screenshot Notification319: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV337SubtitleDelaySync326Toggle() {
    val current = BiliClient.prefs.v337subtitleDelaySync326
    BiliClient.prefs.v337subtitleDelaySync326 = !current
    AppToast.show(this, "Subtitle Delay Sync326: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV338SubtitleDelaySync327Toggle() {
    val current = BiliClient.prefs.v338subtitleDelaySync327
    BiliClient.prefs.v338subtitleDelaySync327 = !current
    AppToast.show(this, "Subtitle Delay Sync327: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV338CastSubtitles320Toggle() {
    val current = BiliClient.prefs.v338castSubtitles320
    BiliClient.prefs.v338castSubtitles320 = !current
    AppToast.show(this, "Cast Subtitles320: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV338PlaylistShuffleMode320Toggle() {
    val current = BiliClient.prefs.v338playlistShuffleMode320
    BiliClient.prefs.v338playlistShuffleMode320 = !current
    AppToast.show(this, "Playlist Shuffle Mode320: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV338ProgressBarBufferedColor320Toggle() {
    val current = BiliClient.prefs.v338progressBarBufferedColor320
    BiliClient.prefs.v338progressBarBufferedColor320 = !current
    AppToast.show(this, "Progress Bar Buffered Color320: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV338HistoryGroupByDate320Toggle() {
    val current = BiliClient.prefs.v338historyGroupByDate320
    BiliClient.prefs.v338historyGroupByDate320 = !current
    AppToast.show(this, "History Group By Date320: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV338PlaybackAutoResume320Toggle() {
    val current = BiliClient.prefs.v338playbackAutoResume320
    BiliClient.prefs.v338playbackAutoResume320 = !current
    AppToast.show(this, "Playback Auto Resume320: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV338ScreenshotNotification320Toggle() {
    val current = BiliClient.prefs.v338screenshotNotification320
    BiliClient.prefs.v338screenshotNotification320 = !current
    AppToast.show(this, "Screenshot Notification320: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV338SubtitleDelaySync328Toggle() {
    val current = BiliClient.prefs.v338subtitleDelaySync328
    BiliClient.prefs.v338subtitleDelaySync328 = !current
    AppToast.show(this, "Subtitle Delay Sync328: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV339SubtitleDelaySync329Toggle() {
    val current = BiliClient.prefs.v339subtitleDelaySync329
    BiliClient.prefs.v339subtitleDelaySync329 = !current
    AppToast.show(this, "Subtitle Delay Sync329: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV339CastSubtitles321Toggle() {
    val current = BiliClient.prefs.v339castSubtitles321
    BiliClient.prefs.v339castSubtitles321 = !current
    AppToast.show(this, "Cast Subtitles321: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV339PlaylistShuffleMode321Toggle() {
    val current = BiliClient.prefs.v339playlistShuffleMode321
    BiliClient.prefs.v339playlistShuffleMode321 = !current
    AppToast.show(this, "Playlist Shuffle Mode321: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV339ProgressBarBufferedColor321Toggle() {
    val current = BiliClient.prefs.v339progressBarBufferedColor321
    BiliClient.prefs.v339progressBarBufferedColor321 = !current
    AppToast.show(this, "Progress Bar Buffered Color321: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV339HistoryGroupByDate321Toggle() {
    val current = BiliClient.prefs.v339historyGroupByDate321
    BiliClient.prefs.v339historyGroupByDate321 = !current
    AppToast.show(this, "History Group By Date321: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV339PlaybackAutoResume321Toggle() {
    val current = BiliClient.prefs.v339playbackAutoResume321
    BiliClient.prefs.v339playbackAutoResume321 = !current
    AppToast.show(this, "Playback Auto Resume321: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV339ScreenshotNotification321Toggle() {
    val current = BiliClient.prefs.v339screenshotNotification321
    BiliClient.prefs.v339screenshotNotification321 = !current
    AppToast.show(this, "Screenshot Notification321: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV339SubtitleDelaySync330Toggle() {
    val current = BiliClient.prefs.v339subtitleDelaySync330
    BiliClient.prefs.v339subtitleDelaySync330 = !current
    AppToast.show(this, "Subtitle Delay Sync330: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV340SubtitleDelaySync331Toggle() {
    val current = BiliClient.prefs.v340subtitleDelaySync331
    BiliClient.prefs.v340subtitleDelaySync331 = !current
    AppToast.show(this, "Subtitle Delay Sync331: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV340CastSubtitles322Toggle() {
    val current = BiliClient.prefs.v340castSubtitles322
    BiliClient.prefs.v340castSubtitles322 = !current
    AppToast.show(this, "Cast Subtitles322: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV340PlaylistShuffleMode322Toggle() {
    val current = BiliClient.prefs.v340playlistShuffleMode322
    BiliClient.prefs.v340playlistShuffleMode322 = !current
    AppToast.show(this, "Playlist Shuffle Mode322: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV340ProgressBarBufferedColor322Toggle() {
    val current = BiliClient.prefs.v340progressBarBufferedColor322
    BiliClient.prefs.v340progressBarBufferedColor322 = !current
    AppToast.show(this, "Progress Bar Buffered Color322: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV340HistoryGroupByDate322Toggle() {
    val current = BiliClient.prefs.v340historyGroupByDate322
    BiliClient.prefs.v340historyGroupByDate322 = !current
    AppToast.show(this, "History Group By Date322: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV340PlaybackAutoResume322Toggle() {
    val current = BiliClient.prefs.v340playbackAutoResume322
    BiliClient.prefs.v340playbackAutoResume322 = !current
    AppToast.show(this, "Playback Auto Resume322: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV340ScreenshotNotification322Toggle() {
    val current = BiliClient.prefs.v340screenshotNotification322
    BiliClient.prefs.v340screenshotNotification322 = !current
    AppToast.show(this, "Screenshot Notification322: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV340SubtitleDelaySync332Toggle() {
    val current = BiliClient.prefs.v340subtitleDelaySync332
    BiliClient.prefs.v340subtitleDelaySync332 = !current
    AppToast.show(this, "Subtitle Delay Sync332: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV341AudioBassExtract323Toggle() {
    val current = BiliClient.prefs.v341audioBassExtract323
    BiliClient.prefs.v341audioBassExtract323 = !current
    AppToast.show(this, "Audio Bass Extract323: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV341GestureDoubleTapRewind333Toggle() {
    val current = BiliClient.prefs.v341gestureDoubleTapRewind333
    BiliClient.prefs.v341gestureDoubleTapRewind333 = !current
    AppToast.show(this, "Gesture Double Tap Rewind333: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV341PlaylistAutoMarkWatched333Toggle() {
    val current = BiliClient.prefs.v341playlistAutoMarkWatched333
    BiliClient.prefs.v341playlistAutoMarkWatched333 = !current
    AppToast.show(this, "Playlist Auto Mark Watched333: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV341CachePreloadOnWifi333Toggle() {
    val current = BiliClient.prefs.v341cachePreloadOnWifi333
    BiliClient.prefs.v341cachePreloadOnWifi333 = !current
    AppToast.show(this, "Cache Preload On Wifi333: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV341ProgressBarShowChapter333Toggle() {
    val current = BiliClient.prefs.v341progressBarShowChapter333
    BiliClient.prefs.v341progressBarShowChapter333 = !current
    AppToast.show(this, "Progress Bar Show Chapter333: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV341VolumeBalanceLR333Toggle() {
    val current = BiliClient.prefs.v341volumeBalanceLR333
    BiliClient.prefs.v341volumeBalanceLR333 = !current
    AppToast.show(this, "Volume Balance LR333: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV341PlaybackABRepeat333Toggle() {
    val current = BiliClient.prefs.v341playbackABRepeat333
    BiliClient.prefs.v341playbackABRepeat333 = !current
    AppToast.show(this, "Playback AB Repeat333: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV342AudioBassExtract324Toggle() {
    val current = BiliClient.prefs.v342audioBassExtract324
    BiliClient.prefs.v342audioBassExtract324 = !current
    AppToast.show(this, "Audio Bass Extract324: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV342GestureDoubleTapRewind334Toggle() {
    val current = BiliClient.prefs.v342gestureDoubleTapRewind334
    BiliClient.prefs.v342gestureDoubleTapRewind334 = !current
    AppToast.show(this, "Gesture Double Tap Rewind334: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV342PlaylistAutoMarkWatched334Toggle() {
    val current = BiliClient.prefs.v342playlistAutoMarkWatched334
    BiliClient.prefs.v342playlistAutoMarkWatched334 = !current
    AppToast.show(this, "Playlist Auto Mark Watched334: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV342CachePreloadOnWifi334Toggle() {
    val current = BiliClient.prefs.v342cachePreloadOnWifi334
    BiliClient.prefs.v342cachePreloadOnWifi334 = !current
    AppToast.show(this, "Cache Preload On Wifi334: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV342ProgressBarShowChapter334Toggle() {
    val current = BiliClient.prefs.v342progressBarShowChapter334
    BiliClient.prefs.v342progressBarShowChapter334 = !current
    AppToast.show(this, "Progress Bar Show Chapter334: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV342VolumeBalanceLR334Toggle() {
    val current = BiliClient.prefs.v342volumeBalanceLR334
    BiliClient.prefs.v342volumeBalanceLR334 = !current
    AppToast.show(this, "Volume Balance LR334: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV342PlaybackABRepeat334Toggle() {
    val current = BiliClient.prefs.v342playbackABRepeat334
    BiliClient.prefs.v342playbackABRepeat334 = !current
    AppToast.show(this, "Playback AB Repeat334: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV343AudioBassExtract325Toggle() {
    val current = BiliClient.prefs.v343audioBassExtract325
    BiliClient.prefs.v343audioBassExtract325 = !current
    AppToast.show(this, "Audio Bass Extract325: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV343GestureDoubleTapRewind335Toggle() {
    val current = BiliClient.prefs.v343gestureDoubleTapRewind335
    BiliClient.prefs.v343gestureDoubleTapRewind335 = !current
    AppToast.show(this, "Gesture Double Tap Rewind335: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV343PlaylistAutoMarkWatched335Toggle() {
    val current = BiliClient.prefs.v343playlistAutoMarkWatched335
    BiliClient.prefs.v343playlistAutoMarkWatched335 = !current
    AppToast.show(this, "Playlist Auto Mark Watched335: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV343CachePreloadOnWifi335Toggle() {
    val current = BiliClient.prefs.v343cachePreloadOnWifi335
    BiliClient.prefs.v343cachePreloadOnWifi335 = !current
    AppToast.show(this, "Cache Preload On Wifi335: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV343ProgressBarShowChapter335Toggle() {
    val current = BiliClient.prefs.v343progressBarShowChapter335
    BiliClient.prefs.v343progressBarShowChapter335 = !current
    AppToast.show(this, "Progress Bar Show Chapter335: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV343VolumeBalanceLR335Toggle() {
    val current = BiliClient.prefs.v343volumeBalanceLR335
    BiliClient.prefs.v343volumeBalanceLR335 = !current
    AppToast.show(this, "Volume Balance LR335: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV343PlaybackABRepeat335Toggle() {
    val current = BiliClient.prefs.v343playbackABRepeat335
    BiliClient.prefs.v343playbackABRepeat335 = !current
    AppToast.show(this, "Playback AB Repeat335: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV344AudioBassExtract326Toggle() {
    val current = BiliClient.prefs.v344audioBassExtract326
    BiliClient.prefs.v344audioBassExtract326 = !current
    AppToast.show(this, "Audio Bass Extract326: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV344GestureDoubleTapRewind336Toggle() {
    val current = BiliClient.prefs.v344gestureDoubleTapRewind336
    BiliClient.prefs.v344gestureDoubleTapRewind336 = !current
    AppToast.show(this, "Gesture Double Tap Rewind336: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV344PlaylistAutoMarkWatched336Toggle() {
    val current = BiliClient.prefs.v344playlistAutoMarkWatched336
    BiliClient.prefs.v344playlistAutoMarkWatched336 = !current
    AppToast.show(this, "Playlist Auto Mark Watched336: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV344CachePreloadOnWifi336Toggle() {
    val current = BiliClient.prefs.v344cachePreloadOnWifi336
    BiliClient.prefs.v344cachePreloadOnWifi336 = !current
    AppToast.show(this, "Cache Preload On Wifi336: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV344ProgressBarShowChapter336Toggle() {
    val current = BiliClient.prefs.v344progressBarShowChapter336
    BiliClient.prefs.v344progressBarShowChapter336 = !current
    AppToast.show(this, "Progress Bar Show Chapter336: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV344VolumeBalanceLR336Toggle() {
    val current = BiliClient.prefs.v344volumeBalanceLR336
    BiliClient.prefs.v344volumeBalanceLR336 = !current
    AppToast.show(this, "Volume Balance LR336: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV344PlaybackABRepeat336Toggle() {
    val current = BiliClient.prefs.v344playbackABRepeat336
    BiliClient.prefs.v344playbackABRepeat336 = !current
    AppToast.show(this, "Playback AB Repeat336: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV345AudioBassExtract327Toggle() {
    val current = BiliClient.prefs.v345audioBassExtract327
    BiliClient.prefs.v345audioBassExtract327 = !current
    AppToast.show(this, "Audio Bass Extract327: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV345GestureDoubleTapRewind337Toggle() {
    val current = BiliClient.prefs.v345gestureDoubleTapRewind337
    BiliClient.prefs.v345gestureDoubleTapRewind337 = !current
    AppToast.show(this, "Gesture Double Tap Rewind337: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV345PlaylistAutoMarkWatched337Toggle() {
    val current = BiliClient.prefs.v345playlistAutoMarkWatched337
    BiliClient.prefs.v345playlistAutoMarkWatched337 = !current
    AppToast.show(this, "Playlist Auto Mark Watched337: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV345CachePreloadOnWifi337Toggle() {
    val current = BiliClient.prefs.v345cachePreloadOnWifi337
    BiliClient.prefs.v345cachePreloadOnWifi337 = !current
    AppToast.show(this, "Cache Preload On Wifi337: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV345ProgressBarShowChapter337Toggle() {
    val current = BiliClient.prefs.v345progressBarShowChapter337
    BiliClient.prefs.v345progressBarShowChapter337 = !current
    AppToast.show(this, "Progress Bar Show Chapter337: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV345VolumeBalanceLR337Toggle() {
    val current = BiliClient.prefs.v345volumeBalanceLR337
    BiliClient.prefs.v345volumeBalanceLR337 = !current
    AppToast.show(this, "Volume Balance LR337: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV345PlaybackABRepeat337Toggle() {
    val current = BiliClient.prefs.v345playbackABRepeat337
    BiliClient.prefs.v345playbackABRepeat337 = !current
    AppToast.show(this, "Playback AB Repeat337: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV346AudioBassExtract328Toggle() {
    val current = BiliClient.prefs.v346audioBassExtract328
    BiliClient.prefs.v346audioBassExtract328 = !current
    AppToast.show(this, "Audio Bass Extract328: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV346GestureDoubleTapRewind338Toggle() {
    val current = BiliClient.prefs.v346gestureDoubleTapRewind338
    BiliClient.prefs.v346gestureDoubleTapRewind338 = !current
    AppToast.show(this, "Gesture Double Tap Rewind338: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV346PlaylistAutoMarkWatched338Toggle() {
    val current = BiliClient.prefs.v346playlistAutoMarkWatched338
    BiliClient.prefs.v346playlistAutoMarkWatched338 = !current
    AppToast.show(this, "Playlist Auto Mark Watched338: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV346CachePreloadOnWifi338Toggle() {
    val current = BiliClient.prefs.v346cachePreloadOnWifi338
    BiliClient.prefs.v346cachePreloadOnWifi338 = !current
    AppToast.show(this, "Cache Preload On Wifi338: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV346ProgressBarShowChapter338Toggle() {
    val current = BiliClient.prefs.v346progressBarShowChapter338
    BiliClient.prefs.v346progressBarShowChapter338 = !current
    AppToast.show(this, "Progress Bar Show Chapter338: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV346VolumeBalanceLR338Toggle() {
    val current = BiliClient.prefs.v346volumeBalanceLR338
    BiliClient.prefs.v346volumeBalanceLR338 = !current
    AppToast.show(this, "Volume Balance LR338: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV346PlaybackABRepeat338Toggle() {
    val current = BiliClient.prefs.v346playbackABRepeat338
    BiliClient.prefs.v346playbackABRepeat338 = !current
    AppToast.show(this, "Playback AB Repeat338: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV347AudioBassExtract329Toggle() {
    val current = BiliClient.prefs.v347audioBassExtract329
    BiliClient.prefs.v347audioBassExtract329 = !current
    AppToast.show(this, "Audio Bass Extract329: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV347GestureDoubleTapRewind339Toggle() {
    val current = BiliClient.prefs.v347gestureDoubleTapRewind339
    BiliClient.prefs.v347gestureDoubleTapRewind339 = !current
    AppToast.show(this, "Gesture Double Tap Rewind339: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV347PlaylistAutoMarkWatched339Toggle() {
    val current = BiliClient.prefs.v347playlistAutoMarkWatched339
    BiliClient.prefs.v347playlistAutoMarkWatched339 = !current
    AppToast.show(this, "Playlist Auto Mark Watched339: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV347CachePreloadOnWifi339Toggle() {
    val current = BiliClient.prefs.v347cachePreloadOnWifi339
    BiliClient.prefs.v347cachePreloadOnWifi339 = !current
    AppToast.show(this, "Cache Preload On Wifi339: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV347ProgressBarShowChapter339Toggle() {
    val current = BiliClient.prefs.v347progressBarShowChapter339
    BiliClient.prefs.v347progressBarShowChapter339 = !current
    AppToast.show(this, "Progress Bar Show Chapter339: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV347VolumeBalanceLR339Toggle() {
    val current = BiliClient.prefs.v347volumeBalanceLR339
    BiliClient.prefs.v347volumeBalanceLR339 = !current
    AppToast.show(this, "Volume Balance LR339: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV347PlaybackABRepeat339Toggle() {
    val current = BiliClient.prefs.v347playbackABRepeat339
    BiliClient.prefs.v347playbackABRepeat339 = !current
    AppToast.show(this, "Playback AB Repeat339: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV348AudioBassExtract330Toggle() {
    val current = BiliClient.prefs.v348audioBassExtract330
    BiliClient.prefs.v348audioBassExtract330 = !current
    AppToast.show(this, "Audio Bass Extract330: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV348GestureDoubleTapRewind340Toggle() {
    val current = BiliClient.prefs.v348gestureDoubleTapRewind340
    BiliClient.prefs.v348gestureDoubleTapRewind340 = !current
    AppToast.show(this, "Gesture Double Tap Rewind340: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV348PlaylistAutoMarkWatched340Toggle() {
    val current = BiliClient.prefs.v348playlistAutoMarkWatched340
    BiliClient.prefs.v348playlistAutoMarkWatched340 = !current
    AppToast.show(this, "Playlist Auto Mark Watched340: ${if (!current) "ON" else "OFF"}")
}

