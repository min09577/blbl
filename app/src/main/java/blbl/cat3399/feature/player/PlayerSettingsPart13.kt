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

internal fun PlayerActivity.showV188CacheDownloadPause188Toggle() {
    val current = BiliClient.prefs.v188cacheDownloadPause188
    BiliClient.prefs.v188cacheDownloadPause188 = !current
    AppToast.show(this, "Cache Download Pause188: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV188ProgressBarThumbBorder188Toggle() {
    val current = BiliClient.prefs.v188progressBarThumbBorder188
    BiliClient.prefs.v188progressBarThumbBorder188 = !current
    AppToast.show(this, "Progress Bar Thumb Border188: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV188VolumeBoostPeak188Toggle() {
    val current = BiliClient.prefs.v188volumeBoostPeak188
    BiliClient.prefs.v188volumeBoostPeak188 = !current
    AppToast.show(this, "Volume Boost Peak188: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV188HistoryBookmarkShare188Toggle() {
    val current = BiliClient.prefs.v188historyBookmarkShare188
    BiliClient.prefs.v188historyBookmarkShare188 = !current
    AppToast.show(this, "History Bookmark Share188: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV188PlaybackChapterAutoDetect188Toggle() {
    val current = BiliClient.prefs.v188playbackChapterAutoDetect188
    BiliClient.prefs.v188playbackChapterAutoDetect188 = !current
    AppToast.show(this, "Playback Chapter Auto Detect188: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV188ScreenshotCropFreeform188Toggle() {
    val current = BiliClient.prefs.v188screenshotCropFreeform188
    BiliClient.prefs.v188screenshotCropFreeform188 = !current
    AppToast.show(this, "Screenshot Crop Freeform188: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV188VideoWideGamut188Toggle() {
    val current = BiliClient.prefs.v188videoWideGamut188
    BiliClient.prefs.v188videoWideGamut188 = !current
    AppToast.show(this, "Video Wide Gamut188: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV188DanmakuFixedOutline190Toggle() {
    val current = BiliClient.prefs.v188danmakuFixedOutline190
    BiliClient.prefs.v188danmakuFixedOutline190 = !current
    AppToast.show(this, "Danmaku Fixed Outline190: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV188SubtitleBgBorder192Toggle() {
    val current = BiliClient.prefs.v188subtitleBgBorder192
    BiliClient.prefs.v188subtitleBgBorder192 = !current
    AppToast.show(this, "Subtitle Bg Border192: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV189AudioMonoToggle189Toggle() {
    val current = BiliClient.prefs.v189audioMonoToggle189
    BiliClient.prefs.v189audioMonoToggle189 = !current
    AppToast.show(this, "Audio Mono Toggle189: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV189DanmakuFixedOutline191Toggle() {
    val current = BiliClient.prefs.v189danmakuFixedOutline191
    BiliClient.prefs.v189danmakuFixedOutline191 = !current
    AppToast.show(this, "Danmaku Fixed Outline191: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV189SubtitleBgBorder193Toggle() {
    val current = BiliClient.prefs.v189subtitleBgBorder193
    BiliClient.prefs.v189subtitleBgBorder193 = !current
    AppToast.show(this, "Subtitle Bg Border193: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV189PlaylistAutoSkipOutro189Toggle() {
    val current = BiliClient.prefs.v189playlistAutoSkipOutro189
    BiliClient.prefs.v189playlistAutoSkipOutro189 = !current
    AppToast.show(this, "Playlist Auto Skip Outro189: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV189ProgressBarThumbBorder189Toggle() {
    val current = BiliClient.prefs.v189progressBarThumbBorder189
    BiliClient.prefs.v189progressBarThumbBorder189 = !current
    AppToast.show(this, "Progress Bar Thumb Border189: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV189VolumeBoostPeak189Toggle() {
    val current = BiliClient.prefs.v189volumeBoostPeak189
    BiliClient.prefs.v189volumeBoostPeak189 = !current
    AppToast.show(this, "Volume Boost Peak189: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV189HistoryBookmarkExportToggle() {
    val current = BiliClient.prefs.v189historyBookmarkExport
    BiliClient.prefs.v189historyBookmarkExport = !current
    AppToast.show(this, "History Bookmark Export: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV189PlaybackChapterSyncToggle() {
    val current = BiliClient.prefs.v189playbackChapterSync
    BiliClient.prefs.v189playbackChapterSync = !current
    AppToast.show(this, "Playback Chapter Sync: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV189ScreenshotSavePathToggle() {
    val current = BiliClient.prefs.v189screenshotSavePath
    BiliClient.prefs.v189screenshotSavePath = !current
    AppToast.show(this, "Screenshot Save Path: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV189VideoWideGamut189Toggle() {
    val current = BiliClient.prefs.v189videoWideGamut189
    BiliClient.prefs.v189videoWideGamut189 = !current
    AppToast.show(this, "Video Wide Gamut189: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV189DanmakuFixedBorder189Toggle() {
    val current = BiliClient.prefs.v189danmakuFixedBorder189
    BiliClient.prefs.v189danmakuFixedBorder189 = !current
    AppToast.show(this, "Danmaku Fixed Border189: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV189SubtitleBgBorder194Toggle() {
    val current = BiliClient.prefs.v189subtitleBgBorder194
    BiliClient.prefs.v189subtitleBgBorder194 = !current
    AppToast.show(this, "Subtitle Bg Border194: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV190AudioMonoToggle190Toggle() {
    val current = BiliClient.prefs.v190audioMonoToggle190
    BiliClient.prefs.v190audioMonoToggle190 = !current
    AppToast.show(this, "Audio Mono Toggle190: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV190DanmakuFixedBorder190Toggle() {
    val current = BiliClient.prefs.v190danmakuFixedBorder190
    BiliClient.prefs.v190danmakuFixedBorder190 = !current
    AppToast.show(this, "Danmaku Fixed Border190: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV190SubtitleBgBorder195Toggle() {
    val current = BiliClient.prefs.v190subtitleBgBorder195
    BiliClient.prefs.v190subtitleBgBorder195 = !current
    AppToast.show(this, "Subtitle Bg Border195: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV190PlaylistAutoSkipIntro190Toggle() {
    val current = BiliClient.prefs.v190playlistAutoSkipIntro190
    BiliClient.prefs.v190playlistAutoSkipIntro190 = !current
    AppToast.show(this, "Playlist Auto Skip Intro190: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV190ProgressBarThumbBorder190Toggle() {
    val current = BiliClient.prefs.v190progressBarThumbBorder190
    BiliClient.prefs.v190progressBarThumbBorder190 = !current
    AppToast.show(this, "Progress Bar Thumb Border190: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV190VolumeBoostPeak190Toggle() {
    val current = BiliClient.prefs.v190volumeBoostPeak190
    BiliClient.prefs.v190volumeBoostPeak190 = !current
    AppToast.show(this, "Volume Boost Peak190: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV190HistoryBookmarkExport190Toggle() {
    val current = BiliClient.prefs.v190historyBookmarkExport190
    BiliClient.prefs.v190historyBookmarkExport190 = !current
    AppToast.show(this, "History Bookmark Export190: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV190PlaybackChapterSync190Toggle() {
    val current = BiliClient.prefs.v190playbackChapterSync190
    BiliClient.prefs.v190playbackChapterSync190 = !current
    AppToast.show(this, "Playback Chapter Sync190: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV190ScreenshotSavePath190Toggle() {
    val current = BiliClient.prefs.v190screenshotSavePath190
    BiliClient.prefs.v190screenshotSavePath190 = !current
    AppToast.show(this, "Screenshot Save Path190: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV190DanmakuFixedBorder191Toggle() {
    val current = BiliClient.prefs.v190danmakuFixedBorder191
    BiliClient.prefs.v190danmakuFixedBorder191 = !current
    AppToast.show(this, "Danmaku Fixed Border191: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV190SubtitleBgBorder196Toggle() {
    val current = BiliClient.prefs.v190subtitleBgBorder196
    BiliClient.prefs.v190subtitleBgBorder196 = !current
    AppToast.show(this, "Subtitle Bg Border196: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV191PlaylistAutoSkipOutro191Toggle() {
    val current = BiliClient.prefs.v191playlistAutoSkipOutro191
    BiliClient.prefs.v191playlistAutoSkipOutro191 = !current
    AppToast.show(this, "Playlist Auto Skip Outro191: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV191ProgressBarThumbBorder191Toggle() {
    val current = BiliClient.prefs.v191progressBarThumbBorder191
    BiliClient.prefs.v191progressBarThumbBorder191 = !current
    AppToast.show(this, "Progress Bar Thumb Border191: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV191VolumeBoostPeak191Toggle() {
    val current = BiliClient.prefs.v191volumeBoostPeak191
    BiliClient.prefs.v191volumeBoostPeak191 = !current
    AppToast.show(this, "Volume Boost Peak191: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV191HistoryBookmarkExport191Toggle() {
    val current = BiliClient.prefs.v191historyBookmarkExport191
    BiliClient.prefs.v191historyBookmarkExport191 = !current
    AppToast.show(this, "History Bookmark Export191: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV191PlaybackChapterSync191Toggle() {
    val current = BiliClient.prefs.v191playbackChapterSync191
    BiliClient.prefs.v191playbackChapterSync191 = !current
    AppToast.show(this, "Playback Chapter Sync191: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV191ScreenshotSavePath191Toggle() {
    val current = BiliClient.prefs.v191screenshotSavePath191
    BiliClient.prefs.v191screenshotSavePath191 = !current
    AppToast.show(this, "Screenshot Save Path191: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV191SubtitleBgBorder197Toggle() {
    val current = BiliClient.prefs.v191subtitleBgBorder197
    BiliClient.prefs.v191subtitleBgBorder197 = !current
    AppToast.show(this, "Subtitle Bg Border197: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV192SubtitleBgBorder198Toggle() {
    val current = BiliClient.prefs.v192subtitleBgBorder198
    BiliClient.prefs.v192subtitleBgBorder198 = !current
    AppToast.show(this, "Subtitle Bg Border198: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV192PlaylistAutoSkipOutro192Toggle() {
    val current = BiliClient.prefs.v192playlistAutoSkipOutro192
    BiliClient.prefs.v192playlistAutoSkipOutro192 = !current
    AppToast.show(this, "Playlist Auto Skip Outro192: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV192ProgressBarThumbBorder192Toggle() {
    val current = BiliClient.prefs.v192progressBarThumbBorder192
    BiliClient.prefs.v192progressBarThumbBorder192 = !current
    AppToast.show(this, "Progress Bar Thumb Border192: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV192VolumeBoostPeak192Toggle() {
    val current = BiliClient.prefs.v192volumeBoostPeak192
    BiliClient.prefs.v192volumeBoostPeak192 = !current
    AppToast.show(this, "Volume Boost Peak192: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV192HistoryBookmarkExport192Toggle() {
    val current = BiliClient.prefs.v192historyBookmarkExport192
    BiliClient.prefs.v192historyBookmarkExport192 = !current
    AppToast.show(this, "History Bookmark Export192: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV192PlaybackChapterSync192Toggle() {
    val current = BiliClient.prefs.v192playbackChapterSync192
    BiliClient.prefs.v192playbackChapterSync192 = !current
    AppToast.show(this, "Playback Chapter Sync192: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV192ScreenshotSavePath192Toggle() {
    val current = BiliClient.prefs.v192screenshotSavePath192
    BiliClient.prefs.v192screenshotSavePath192 = !current
    AppToast.show(this, "Screenshot Save Path192: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV192SubtitleBgBorder199Toggle() {
    val current = BiliClient.prefs.v192subtitleBgBorder199
    BiliClient.prefs.v192subtitleBgBorder199 = !current
    AppToast.show(this, "Subtitle Bg Border199: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV193SubtitleBgBorder200Toggle() {
    val current = BiliClient.prefs.v193subtitleBgBorder200
    BiliClient.prefs.v193subtitleBgBorder200 = !current
    AppToast.show(this, "Subtitle Bg Border200: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV193PlaylistAutoSkipOutro193Toggle() {
    val current = BiliClient.prefs.v193playlistAutoSkipOutro193
    BiliClient.prefs.v193playlistAutoSkipOutro193 = !current
    AppToast.show(this, "Playlist Auto Skip Outro193: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV193ProgressBarThumbBorder193Toggle() {
    val current = BiliClient.prefs.v193progressBarThumbBorder193
    BiliClient.prefs.v193progressBarThumbBorder193 = !current
    AppToast.show(this, "Progress Bar Thumb Border193: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV193VolumeBoostPeak193Toggle() {
    val current = BiliClient.prefs.v193volumeBoostPeak193
    BiliClient.prefs.v193volumeBoostPeak193 = !current
    AppToast.show(this, "Volume Boost Peak193: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV193HistoryBookmarkExport193Toggle() {
    val current = BiliClient.prefs.v193historyBookmarkExport193
    BiliClient.prefs.v193historyBookmarkExport193 = !current
    AppToast.show(this, "History Bookmark Export193: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV193PlaybackChapterSync193Toggle() {
    val current = BiliClient.prefs.v193playbackChapterSync193
    BiliClient.prefs.v193playbackChapterSync193 = !current
    AppToast.show(this, "Playback Chapter Sync193: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV193ScreenshotSavePath193Toggle() {
    val current = BiliClient.prefs.v193screenshotSavePath193
    BiliClient.prefs.v193screenshotSavePath193 = !current
    AppToast.show(this, "Screenshot Save Path193: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV193SubtitleBgBorder201Toggle() {
    val current = BiliClient.prefs.v193subtitleBgBorder201
    BiliClient.prefs.v193subtitleBgBorder201 = !current
    AppToast.show(this, "Subtitle Bg Border201: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV194SubtitleBgBorder202Toggle() {
    val current = BiliClient.prefs.v194subtitleBgBorder202
    BiliClient.prefs.v194subtitleBgBorder202 = !current
    AppToast.show(this, "Subtitle Bg Border202: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV194PlaylistAutoSkipOutro194Toggle() {
    val current = BiliClient.prefs.v194playlistAutoSkipOutro194
    BiliClient.prefs.v194playlistAutoSkipOutro194 = !current
    AppToast.show(this, "Playlist Auto Skip Outro194: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV194ProgressBarThumbBorder194Toggle() {
    val current = BiliClient.prefs.v194progressBarThumbBorder194
    BiliClient.prefs.v194progressBarThumbBorder194 = !current
    AppToast.show(this, "Progress Bar Thumb Border194: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV194VolumeBoostPeak194Toggle() {
    val current = BiliClient.prefs.v194volumeBoostPeak194
    BiliClient.prefs.v194volumeBoostPeak194 = !current
    AppToast.show(this, "Volume Boost Peak194: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV194HistoryBookmarkExport194Toggle() {
    val current = BiliClient.prefs.v194historyBookmarkExport194
    BiliClient.prefs.v194historyBookmarkExport194 = !current
    AppToast.show(this, "History Bookmark Export194: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV194PlaybackChapterSync194Toggle() {
    val current = BiliClient.prefs.v194playbackChapterSync194
    BiliClient.prefs.v194playbackChapterSync194 = !current
    AppToast.show(this, "Playback Chapter Sync194: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV194ScreenshotSavePath194Toggle() {
    val current = BiliClient.prefs.v194screenshotSavePath194
    BiliClient.prefs.v194screenshotSavePath194 = !current
    AppToast.show(this, "Screenshot Save Path194: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV194SubtitleBgBorder203Toggle() {
    val current = BiliClient.prefs.v194subtitleBgBorder203
    BiliClient.prefs.v194subtitleBgBorder203 = !current
    AppToast.show(this, "Subtitle Bg Border203: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV195SubtitleBgBorder204Toggle() {
    val current = BiliClient.prefs.v195subtitleBgBorder204
    BiliClient.prefs.v195subtitleBgBorder204 = !current
    AppToast.show(this, "Subtitle Bg Border204: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV195PlaylistAutoSkipOutro195Toggle() {
    val current = BiliClient.prefs.v195playlistAutoSkipOutro195
    BiliClient.prefs.v195playlistAutoSkipOutro195 = !current
    AppToast.show(this, "Playlist Auto Skip Outro195: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV195ProgressBarThumbBorder195Toggle() {
    val current = BiliClient.prefs.v195progressBarThumbBorder195
    BiliClient.prefs.v195progressBarThumbBorder195 = !current
    AppToast.show(this, "Progress Bar Thumb Border195: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV195VolumeBoostPeak195Toggle() {
    val current = BiliClient.prefs.v195volumeBoostPeak195
    BiliClient.prefs.v195volumeBoostPeak195 = !current
    AppToast.show(this, "Volume Boost Peak195: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV195HistoryBookmarkExport195Toggle() {
    val current = BiliClient.prefs.v195historyBookmarkExport195
    BiliClient.prefs.v195historyBookmarkExport195 = !current
    AppToast.show(this, "History Bookmark Export195: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV195PlaybackChapterSync195Toggle() {
    val current = BiliClient.prefs.v195playbackChapterSync195
    BiliClient.prefs.v195playbackChapterSync195 = !current
    AppToast.show(this, "Playback Chapter Sync195: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV195ScreenshotSavePath195Toggle() {
    val current = BiliClient.prefs.v195screenshotSavePath195
    BiliClient.prefs.v195screenshotSavePath195 = !current
    AppToast.show(this, "Screenshot Save Path195: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV195SubtitleBgBorder205Toggle() {
    val current = BiliClient.prefs.v195subtitleBgBorder205
    BiliClient.prefs.v195subtitleBgBorder205 = !current
    AppToast.show(this, "Subtitle Bg Border205: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV196SubtitleBgBorder206Toggle() {
    val current = BiliClient.prefs.v196subtitleBgBorder206
    BiliClient.prefs.v196subtitleBgBorder206 = !current
    AppToast.show(this, "Subtitle Bg Border206: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV196PlaylistAutoSkipOutro196Toggle() {
    val current = BiliClient.prefs.v196playlistAutoSkipOutro196
    BiliClient.prefs.v196playlistAutoSkipOutro196 = !current
    AppToast.show(this, "Playlist Auto Skip Outro196: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV196ProgressBarThumbBorder196Toggle() {
    val current = BiliClient.prefs.v196progressBarThumbBorder196
    BiliClient.prefs.v196progressBarThumbBorder196 = !current
    AppToast.show(this, "Progress Bar Thumb Border196: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV196VolumeBoostPeak196Toggle() {
    val current = BiliClient.prefs.v196volumeBoostPeak196
    BiliClient.prefs.v196volumeBoostPeak196 = !current
    AppToast.show(this, "Volume Boost Peak196: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV196HistoryBookmarkExport196Toggle() {
    val current = BiliClient.prefs.v196historyBookmarkExport196
    BiliClient.prefs.v196historyBookmarkExport196 = !current
    AppToast.show(this, "History Bookmark Export196: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV196PlaybackChapterSync196Toggle() {
    val current = BiliClient.prefs.v196playbackChapterSync196
    BiliClient.prefs.v196playbackChapterSync196 = !current
    AppToast.show(this, "Playback Chapter Sync196: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV196ScreenshotSavePath196Toggle() {
    val current = BiliClient.prefs.v196screenshotSavePath196
    BiliClient.prefs.v196screenshotSavePath196 = !current
    AppToast.show(this, "Screenshot Save Path196: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV196VideoColorSpace196Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196videoColorSpace196).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space196",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196videoColorSpace196 = value
        AppToast.show(this, "Video Color Space196: $value")
    }
}

internal fun PlayerActivity.showV196DanmakuBottomMaxCount200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v196danmakuBottomMaxCount200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v196danmakuBottomMaxCount200 = value
        AppToast.show(this, "Danmaku Bottom Max Count200: $value")
    }
}

internal fun PlayerActivity.showV196SubtitleBgBorder207Toggle() {
    val current = BiliClient.prefs.v196subtitleBgBorder207
    BiliClient.prefs.v196subtitleBgBorder207 = !current
    AppToast.show(this, "Subtitle Bg Border207: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV197AudioDelayCompensate197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197audioDelayCompensate197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197audioDelayCompensate197 = value
        AppToast.show(this, "Audio Delay Compensate197: $value")
    }
}

internal fun PlayerActivity.showV197DanmakuBottomMaxCount201Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197danmakuBottomMaxCount201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197danmakuBottomMaxCount201 = value
        AppToast.show(this, "Danmaku Bottom Max Count201: $value")
    }
}

internal fun PlayerActivity.showV197SubtitleBgBorder208Toggle() {
    val current = BiliClient.prefs.v197subtitleBgBorder208
    BiliClient.prefs.v197subtitleBgBorder208 = !current
    AppToast.show(this, "Subtitle Bg Border208: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV197GestureShakeAction197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197gestureShakeAction197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197gestureShakeAction197 = value
        AppToast.show(this, "Gesture Shake Action197: $value")
    }
}

internal fun PlayerActivity.showV197CastAudioVolume197Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v197castAudioVolume197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197castAudioVolume197 = value
        AppToast.show(this, "Cast Audio Volume197: $value")
    }
}

internal fun PlayerActivity.showV197PlaylistAutoSkipOutro197Toggle() {
    val current = BiliClient.prefs.v197playlistAutoSkipOutro197
    BiliClient.prefs.v197playlistAutoSkipOutro197 = !current
    AppToast.show(this, "Playlist Auto Skip Outro197: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV197CacheDownloadSpeed198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197cacheDownloadSpeed198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197cacheDownloadSpeed198 = value
        AppToast.show(this, "Cache Download Speed198: $value")
    }
}

internal fun PlayerActivity.showV197ProgressBarThumbBorder197Toggle() {
    val current = BiliClient.prefs.v197progressBarThumbBorder197
    BiliClient.prefs.v197progressBarThumbBorder197 = !current
    AppToast.show(this, "Progress Bar Thumb Border197: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV197VolumeBoostPeak197Toggle() {
    val current = BiliClient.prefs.v197volumeBoostPeak197
    BiliClient.prefs.v197volumeBoostPeak197 = !current
    AppToast.show(this, "Volume Boost Peak197: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV197HistoryBookmarkExport197Toggle() {
    val current = BiliClient.prefs.v197historyBookmarkExport197
    BiliClient.prefs.v197historyBookmarkExport197 = !current
    AppToast.show(this, "History Bookmark Export197: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV197PlaybackChapterSync197Toggle() {
    val current = BiliClient.prefs.v197playbackChapterSync197
    BiliClient.prefs.v197playbackChapterSync197 = !current
    AppToast.show(this, "Playback Chapter Sync197: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV197ScreenshotSavePath197Toggle() {
    val current = BiliClient.prefs.v197screenshotSavePath197
    BiliClient.prefs.v197screenshotSavePath197 = !current
    AppToast.show(this, "Screenshot Save Path197: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV197VideoColorSpace197Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197videoColorSpace197).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space197",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197videoColorSpace197 = value
        AppToast.show(this, "Video Color Space197: $value")
    }
}

internal fun PlayerActivity.showV197DanmakuBottomMaxCount202Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v197danmakuBottomMaxCount202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v197danmakuBottomMaxCount202 = value
        AppToast.show(this, "Danmaku Bottom Max Count202: $value")
    }
}

internal fun PlayerActivity.showV197SubtitleBgBorder209Toggle() {
    val current = BiliClient.prefs.v197subtitleBgBorder209
    BiliClient.prefs.v197subtitleBgBorder209 = !current
    AppToast.show(this, "Subtitle Bg Border209: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV198AudioDelayCompensate198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198audioDelayCompensate198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198audioDelayCompensate198 = value
        AppToast.show(this, "Audio Delay Compensate198: $value")
    }
}

internal fun PlayerActivity.showV198DanmakuBottomMaxCount203Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198danmakuBottomMaxCount203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198danmakuBottomMaxCount203 = value
        AppToast.show(this, "Danmaku Bottom Max Count203: $value")
    }
}

internal fun PlayerActivity.showV198SubtitleBgBorder210Toggle() {
    val current = BiliClient.prefs.v198subtitleBgBorder210
    BiliClient.prefs.v198subtitleBgBorder210 = !current
    AppToast.show(this, "Subtitle Bg Border210: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV198GestureShakeAction198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198gestureShakeAction198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198gestureShakeAction198 = value
        AppToast.show(this, "Gesture Shake Action198: $value")
    }
}

internal fun PlayerActivity.showV198CastAudioVolume198Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v198castAudioVolume198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198castAudioVolume198 = value
        AppToast.show(this, "Cast Audio Volume198: $value")
    }
}

internal fun PlayerActivity.showV198PlaylistAutoSkipOutro198Toggle() {
    val current = BiliClient.prefs.v198playlistAutoSkipOutro198
    BiliClient.prefs.v198playlistAutoSkipOutro198 = !current
    AppToast.show(this, "Playlist Auto Skip Outro198: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV198CacheDownloadSpeed199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198cacheDownloadSpeed199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198cacheDownloadSpeed199 = value
        AppToast.show(this, "Cache Download Speed199: $value")
    }
}

internal fun PlayerActivity.showV198ProgressBarThumbBorder198Toggle() {
    val current = BiliClient.prefs.v198progressBarThumbBorder198
    BiliClient.prefs.v198progressBarThumbBorder198 = !current
    AppToast.show(this, "Progress Bar Thumb Border198: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV198VolumeBoostPeak198Toggle() {
    val current = BiliClient.prefs.v198volumeBoostPeak198
    BiliClient.prefs.v198volumeBoostPeak198 = !current
    AppToast.show(this, "Volume Boost Peak198: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV198HistoryBookmarkExport198Toggle() {
    val current = BiliClient.prefs.v198historyBookmarkExport198
    BiliClient.prefs.v198historyBookmarkExport198 = !current
    AppToast.show(this, "History Bookmark Export198: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV198PlaybackChapterSync198Toggle() {
    val current = BiliClient.prefs.v198playbackChapterSync198
    BiliClient.prefs.v198playbackChapterSync198 = !current
    AppToast.show(this, "Playback Chapter Sync198: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV198ScreenshotSavePath198Toggle() {
    val current = BiliClient.prefs.v198screenshotSavePath198
    BiliClient.prefs.v198screenshotSavePath198 = !current
    AppToast.show(this, "Screenshot Save Path198: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV198VideoColorSpace198Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198videoColorSpace198).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space198",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198videoColorSpace198 = value
        AppToast.show(this, "Video Color Space198: $value")
    }
}

internal fun PlayerActivity.showV198DanmakuBottomMaxCount204Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v198danmakuBottomMaxCount204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v198danmakuBottomMaxCount204 = value
        AppToast.show(this, "Danmaku Bottom Max Count204: $value")
    }
}

internal fun PlayerActivity.showV198SubtitleBgBorder211Toggle() {
    val current = BiliClient.prefs.v198subtitleBgBorder211
    BiliClient.prefs.v198subtitleBgBorder211 = !current
    AppToast.show(this, "Subtitle Bg Border211: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV199AudioDelayCompensate199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199audioDelayCompensate199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199audioDelayCompensate199 = value
        AppToast.show(this, "Audio Delay Compensate199: $value")
    }
}

internal fun PlayerActivity.showV199DanmakuBottomMaxCount205Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199danmakuBottomMaxCount205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199danmakuBottomMaxCount205 = value
        AppToast.show(this, "Danmaku Bottom Max Count205: $value")
    }
}

internal fun PlayerActivity.showV199SubtitleBgBorder212Toggle() {
    val current = BiliClient.prefs.v199subtitleBgBorder212
    BiliClient.prefs.v199subtitleBgBorder212 = !current
    AppToast.show(this, "Subtitle Bg Border212: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV199GestureShakeAction199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199gestureShakeAction199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199gestureShakeAction199 = value
        AppToast.show(this, "Gesture Shake Action199: $value")
    }
}

internal fun PlayerActivity.showV199CastAudioVolume199Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v199castAudioVolume199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199castAudioVolume199 = value
        AppToast.show(this, "Cast Audio Volume199: $value")
    }
}

internal fun PlayerActivity.showV199PlaylistAutoSkipOutro199Toggle() {
    val current = BiliClient.prefs.v199playlistAutoSkipOutro199
    BiliClient.prefs.v199playlistAutoSkipOutro199 = !current
    AppToast.show(this, "Playlist Auto Skip Outro199: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV199CacheDownloadSpeed200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199cacheDownloadSpeed200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199cacheDownloadSpeed200 = value
        AppToast.show(this, "Cache Download Speed200: $value")
    }
}

internal fun PlayerActivity.showV199ProgressBarThumbBorder199Toggle() {
    val current = BiliClient.prefs.v199progressBarThumbBorder199
    BiliClient.prefs.v199progressBarThumbBorder199 = !current
    AppToast.show(this, "Progress Bar Thumb Border199: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV199VolumeBoostPeak199Toggle() {
    val current = BiliClient.prefs.v199volumeBoostPeak199
    BiliClient.prefs.v199volumeBoostPeak199 = !current
    AppToast.show(this, "Volume Boost Peak199: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV199HistoryBookmarkExport199Toggle() {
    val current = BiliClient.prefs.v199historyBookmarkExport199
    BiliClient.prefs.v199historyBookmarkExport199 = !current
    AppToast.show(this, "History Bookmark Export199: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV199PlaybackChapterSync199Toggle() {
    val current = BiliClient.prefs.v199playbackChapterSync199
    BiliClient.prefs.v199playbackChapterSync199 = !current
    AppToast.show(this, "Playback Chapter Sync199: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV199ScreenshotSavePath199Toggle() {
    val current = BiliClient.prefs.v199screenshotSavePath199
    BiliClient.prefs.v199screenshotSavePath199 = !current
    AppToast.show(this, "Screenshot Save Path199: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV199VideoColorSpace199Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199videoColorSpace199).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space199",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199videoColorSpace199 = value
        AppToast.show(this, "Video Color Space199: $value")
    }
}

internal fun PlayerActivity.showV199DanmakuBottomMaxCount206Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v199danmakuBottomMaxCount206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v199danmakuBottomMaxCount206 = value
        AppToast.show(this, "Danmaku Bottom Max Count206: $value")
    }
}

internal fun PlayerActivity.showV199SubtitleBgBorder213Toggle() {
    val current = BiliClient.prefs.v199subtitleBgBorder213
    BiliClient.prefs.v199subtitleBgBorder213 = !current
    AppToast.show(this, "Subtitle Bg Border213: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV200AudioDelayCompensate200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200audioDelayCompensate200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Delay Compensate200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200audioDelayCompensate200 = value
        AppToast.show(this, "Audio Delay Compensate200: $value")
    }
}

internal fun PlayerActivity.showV200DanmakuBottomMaxCount207Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200danmakuBottomMaxCount207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200danmakuBottomMaxCount207 = value
        AppToast.show(this, "Danmaku Bottom Max Count207: $value")
    }
}

internal fun PlayerActivity.showV200SubtitleBgBorder214Toggle() {
    val current = BiliClient.prefs.v200subtitleBgBorder214
    BiliClient.prefs.v200subtitleBgBorder214 = !current
    AppToast.show(this, "Subtitle Bg Border214: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV200GestureShakeAction200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200gestureShakeAction200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200gestureShakeAction200 = value
        AppToast.show(this, "Gesture Shake Action200: $value")
    }
}

internal fun PlayerActivity.showV200CastAudioVolume200Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v200castAudioVolume200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200castAudioVolume200 = value
        AppToast.show(this, "Cast Audio Volume200: $value")
    }
}

internal fun PlayerActivity.showV200PlaylistAutoSkipOutro200Toggle() {
    val current = BiliClient.prefs.v200playlistAutoSkipOutro200
    BiliClient.prefs.v200playlistAutoSkipOutro200 = !current
    AppToast.show(this, "Playlist Auto Skip Outro200: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV200CacheDownloadSpeed201Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200cacheDownloadSpeed201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200cacheDownloadSpeed201 = value
        AppToast.show(this, "Cache Download Speed201: $value")
    }
}

internal fun PlayerActivity.showV200ProgressBarThumbBorder200Toggle() {
    val current = BiliClient.prefs.v200progressBarThumbBorder200
    BiliClient.prefs.v200progressBarThumbBorder200 = !current
    AppToast.show(this, "Progress Bar Thumb Border200: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV200VolumeBoostPeak200Toggle() {
    val current = BiliClient.prefs.v200volumeBoostPeak200
    BiliClient.prefs.v200volumeBoostPeak200 = !current
    AppToast.show(this, "Volume Boost Peak200: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV200HistoryBookmarkExport200Toggle() {
    val current = BiliClient.prefs.v200historyBookmarkExport200
    BiliClient.prefs.v200historyBookmarkExport200 = !current
    AppToast.show(this, "History Bookmark Export200: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV200PlaybackChapterSync200Toggle() {
    val current = BiliClient.prefs.v200playbackChapterSync200
    BiliClient.prefs.v200playbackChapterSync200 = !current
    AppToast.show(this, "Playback Chapter Sync200: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV200ScreenshotSavePath200Toggle() {
    val current = BiliClient.prefs.v200screenshotSavePath200
    BiliClient.prefs.v200screenshotSavePath200 = !current
    AppToast.show(this, "Screenshot Save Path200: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV200VideoColorSpace200Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200videoColorSpace200).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space200",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200videoColorSpace200 = value
        AppToast.show(this, "Video Color Space200: $value")
    }
}

internal fun PlayerActivity.showV200DanmakuBottomMaxCount208Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v200danmakuBottomMaxCount208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v200danmakuBottomMaxCount208 = value
        AppToast.show(this, "Danmaku Bottom Max Count208: $value")
    }
}

internal fun PlayerActivity.showV200SubtitleBgBorder215Toggle() {
    val current = BiliClient.prefs.v200subtitleBgBorder215
    BiliClient.prefs.v200subtitleBgBorder215 = !current
    AppToast.show(this, "Subtitle Bg Border215: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV201AudioEQCustom201Toggle() {
    val current = BiliClient.prefs.v201audioEQCustom201
    BiliClient.prefs.v201audioEQCustom201 = !current
    AppToast.show(this, "Audio EQ Custom201: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV201DanmakuBottomMaxCount209Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201danmakuBottomMaxCount209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201danmakuBottomMaxCount209 = value
        AppToast.show(this, "Danmaku Bottom Max Count209: $value")
    }
}

internal fun PlayerActivity.showV201SubtitleBgBorder216Toggle() {
    val current = BiliClient.prefs.v201subtitleBgBorder216
    BiliClient.prefs.v201subtitleBgBorder216 = !current
    AppToast.show(this, "Subtitle Bg Border216: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV201GestureShakeAction201Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201gestureShakeAction201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201gestureShakeAction201 = value
        AppToast.show(this, "Gesture Shake Action201: $value")
    }
}

internal fun PlayerActivity.showV201CastAudioVolume201Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v201castAudioVolume201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201castAudioVolume201 = value
        AppToast.show(this, "Cast Audio Volume201: $value")
    }
}

internal fun PlayerActivity.showV201PlaylistAutoSkipOutro201Toggle() {
    val current = BiliClient.prefs.v201playlistAutoSkipOutro201
    BiliClient.prefs.v201playlistAutoSkipOutro201 = !current
    AppToast.show(this, "Playlist Auto Skip Outro201: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV201CacheDownloadSpeed202Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201cacheDownloadSpeed202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201cacheDownloadSpeed202 = value
        AppToast.show(this, "Cache Download Speed202: $value")
    }
}

internal fun PlayerActivity.showV201ProgressBarThumbBorder201Toggle() {
    val current = BiliClient.prefs.v201progressBarThumbBorder201
    BiliClient.prefs.v201progressBarThumbBorder201 = !current
    AppToast.show(this, "Progress Bar Thumb Border201: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV201VolumeBoostPeak201Toggle() {
    val current = BiliClient.prefs.v201volumeBoostPeak201
    BiliClient.prefs.v201volumeBoostPeak201 = !current
    AppToast.show(this, "Volume Boost Peak201: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV201HistoryBookmarkExport201Toggle() {
    val current = BiliClient.prefs.v201historyBookmarkExport201
    BiliClient.prefs.v201historyBookmarkExport201 = !current
    AppToast.show(this, "History Bookmark Export201: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV201PlaybackChapterSync201Toggle() {
    val current = BiliClient.prefs.v201playbackChapterSync201
    BiliClient.prefs.v201playbackChapterSync201 = !current
    AppToast.show(this, "Playback Chapter Sync201: ${if (!current) "ON" else "OFF"}")
}

