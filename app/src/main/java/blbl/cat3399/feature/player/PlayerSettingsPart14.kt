package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v196: Volume Boost Peak196
internal fun PlayerActivity.showV196VolumeBoostPeak196Toggle() {
    val current = BiliClient.prefs.v196volumeBoostPeak196
    BiliClient.prefs.v196volumeBoostPeak196 = !current
    AppToast.show(this, "Volume Boost Peak196: ${if (!current) "ON" else "OFF"}")
}

// v196: History Bookmark Export196
internal fun PlayerActivity.showV196HistoryBookmarkExport196Toggle() {
    val current = BiliClient.prefs.v196historyBookmarkExport196
    BiliClient.prefs.v196historyBookmarkExport196 = !current
    AppToast.show(this, "History Bookmark Export196: ${if (!current) "ON" else "OFF"}")
}

// v196: Playback Chapter Sync196
internal fun PlayerActivity.showV196PlaybackChapterSync196Toggle() {
    val current = BiliClient.prefs.v196playbackChapterSync196
    BiliClient.prefs.v196playbackChapterSync196 = !current
    AppToast.show(this, "Playback Chapter Sync196: ${if (!current) "ON" else "OFF"}")
}

// v196: Screenshot Save Path196
internal fun PlayerActivity.showV196ScreenshotSavePath196Toggle() {
    val current = BiliClient.prefs.v196screenshotSavePath196
    BiliClient.prefs.v196screenshotSavePath196 = !current
    AppToast.show(this, "Screenshot Save Path196: ${if (!current) "ON" else "OFF"}")
}

// v196: Video Color Space196
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

// v196: Danmaku Bottom Max Count200
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

// v196: Subtitle Bg Border207
internal fun PlayerActivity.showV196SubtitleBgBorder207Toggle() {
    val current = BiliClient.prefs.v196subtitleBgBorder207
    BiliClient.prefs.v196subtitleBgBorder207 = !current
    AppToast.show(this, "Subtitle Bg Border207: ${if (!current) "ON" else "OFF"}")
}

// v197: Audio Delay Compensate197
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

// v197: Danmaku Bottom Max Count201
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

// v197: Subtitle Bg Border208
internal fun PlayerActivity.showV197SubtitleBgBorder208Toggle() {
    val current = BiliClient.prefs.v197subtitleBgBorder208
    BiliClient.prefs.v197subtitleBgBorder208 = !current
    AppToast.show(this, "Subtitle Bg Border208: ${if (!current) "ON" else "OFF"}")
}

// v197: Gesture Shake Action197
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

// v197: Cast Audio Volume197
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

// v197: Playlist Auto Skip Outro197
internal fun PlayerActivity.showV197PlaylistAutoSkipOutro197Toggle() {
    val current = BiliClient.prefs.v197playlistAutoSkipOutro197
    BiliClient.prefs.v197playlistAutoSkipOutro197 = !current
    AppToast.show(this, "Playlist Auto Skip Outro197: ${if (!current) "ON" else "OFF"}")
}

// v197: Cache Download Speed198
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

// v197: Progress Bar Thumb Border197
internal fun PlayerActivity.showV197ProgressBarThumbBorder197Toggle() {
    val current = BiliClient.prefs.v197progressBarThumbBorder197
    BiliClient.prefs.v197progressBarThumbBorder197 = !current
    AppToast.show(this, "Progress Bar Thumb Border197: ${if (!current) "ON" else "OFF"}")
}

// v197: Volume Boost Peak197
internal fun PlayerActivity.showV197VolumeBoostPeak197Toggle() {
    val current = BiliClient.prefs.v197volumeBoostPeak197
    BiliClient.prefs.v197volumeBoostPeak197 = !current
    AppToast.show(this, "Volume Boost Peak197: ${if (!current) "ON" else "OFF"}")
}

// v197: History Bookmark Export197
internal fun PlayerActivity.showV197HistoryBookmarkExport197Toggle() {
    val current = BiliClient.prefs.v197historyBookmarkExport197
    BiliClient.prefs.v197historyBookmarkExport197 = !current
    AppToast.show(this, "History Bookmark Export197: ${if (!current) "ON" else "OFF"}")
}

// v197: Playback Chapter Sync197
internal fun PlayerActivity.showV197PlaybackChapterSync197Toggle() {
    val current = BiliClient.prefs.v197playbackChapterSync197
    BiliClient.prefs.v197playbackChapterSync197 = !current
    AppToast.show(this, "Playback Chapter Sync197: ${if (!current) "ON" else "OFF"}")
}

// v197: Screenshot Save Path197
internal fun PlayerActivity.showV197ScreenshotSavePath197Toggle() {
    val current = BiliClient.prefs.v197screenshotSavePath197
    BiliClient.prefs.v197screenshotSavePath197 = !current
    AppToast.show(this, "Screenshot Save Path197: ${if (!current) "ON" else "OFF"}")
}

// v197: Video Color Space197
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

// v197: Danmaku Bottom Max Count202
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

// v197: Subtitle Bg Border209
internal fun PlayerActivity.showV197SubtitleBgBorder209Toggle() {
    val current = BiliClient.prefs.v197subtitleBgBorder209
    BiliClient.prefs.v197subtitleBgBorder209 = !current
    AppToast.show(this, "Subtitle Bg Border209: ${if (!current) "ON" else "OFF"}")
}

// v198: Audio Delay Compensate198
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

// v198: Danmaku Bottom Max Count203
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

// v198: Subtitle Bg Border210
internal fun PlayerActivity.showV198SubtitleBgBorder210Toggle() {
    val current = BiliClient.prefs.v198subtitleBgBorder210
    BiliClient.prefs.v198subtitleBgBorder210 = !current
    AppToast.show(this, "Subtitle Bg Border210: ${if (!current) "ON" else "OFF"}")
}

// v198: Gesture Shake Action198
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

// v198: Cast Audio Volume198
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

// v198: Playlist Auto Skip Outro198
internal fun PlayerActivity.showV198PlaylistAutoSkipOutro198Toggle() {
    val current = BiliClient.prefs.v198playlistAutoSkipOutro198
    BiliClient.prefs.v198playlistAutoSkipOutro198 = !current
    AppToast.show(this, "Playlist Auto Skip Outro198: ${if (!current) "ON" else "OFF"}")
}

// v198: Cache Download Speed199
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

// v198: Progress Bar Thumb Border198
internal fun PlayerActivity.showV198ProgressBarThumbBorder198Toggle() {
    val current = BiliClient.prefs.v198progressBarThumbBorder198
    BiliClient.prefs.v198progressBarThumbBorder198 = !current
    AppToast.show(this, "Progress Bar Thumb Border198: ${if (!current) "ON" else "OFF"}")
}

// v198: Volume Boost Peak198
internal fun PlayerActivity.showV198VolumeBoostPeak198Toggle() {
    val current = BiliClient.prefs.v198volumeBoostPeak198
    BiliClient.prefs.v198volumeBoostPeak198 = !current
    AppToast.show(this, "Volume Boost Peak198: ${if (!current) "ON" else "OFF"}")
}

// v198: History Bookmark Export198
internal fun PlayerActivity.showV198HistoryBookmarkExport198Toggle() {
    val current = BiliClient.prefs.v198historyBookmarkExport198
    BiliClient.prefs.v198historyBookmarkExport198 = !current
    AppToast.show(this, "History Bookmark Export198: ${if (!current) "ON" else "OFF"}")
}

// v198: Playback Chapter Sync198
internal fun PlayerActivity.showV198PlaybackChapterSync198Toggle() {
    val current = BiliClient.prefs.v198playbackChapterSync198
    BiliClient.prefs.v198playbackChapterSync198 = !current
    AppToast.show(this, "Playback Chapter Sync198: ${if (!current) "ON" else "OFF"}")
}

// v198: Screenshot Save Path198
internal fun PlayerActivity.showV198ScreenshotSavePath198Toggle() {
    val current = BiliClient.prefs.v198screenshotSavePath198
    BiliClient.prefs.v198screenshotSavePath198 = !current
    AppToast.show(this, "Screenshot Save Path198: ${if (!current) "ON" else "OFF"}")
}

// v198: Video Color Space198
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

// v198: Danmaku Bottom Max Count204
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

// v198: Subtitle Bg Border211
internal fun PlayerActivity.showV198SubtitleBgBorder211Toggle() {
    val current = BiliClient.prefs.v198subtitleBgBorder211
    BiliClient.prefs.v198subtitleBgBorder211 = !current
    AppToast.show(this, "Subtitle Bg Border211: ${if (!current) "ON" else "OFF"}")
}

// v199: Audio Delay Compensate199
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

// v199: Danmaku Bottom Max Count205
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

// v199: Subtitle Bg Border212
internal fun PlayerActivity.showV199SubtitleBgBorder212Toggle() {
    val current = BiliClient.prefs.v199subtitleBgBorder212
    BiliClient.prefs.v199subtitleBgBorder212 = !current
    AppToast.show(this, "Subtitle Bg Border212: ${if (!current) "ON" else "OFF"}")
}

// v199: Gesture Shake Action199
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

// v199: Cast Audio Volume199
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

// v199: Playlist Auto Skip Outro199
internal fun PlayerActivity.showV199PlaylistAutoSkipOutro199Toggle() {
    val current = BiliClient.prefs.v199playlistAutoSkipOutro199
    BiliClient.prefs.v199playlistAutoSkipOutro199 = !current
    AppToast.show(this, "Playlist Auto Skip Outro199: ${if (!current) "ON" else "OFF"}")
}

// v199: Cache Download Speed200
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

// v199: Progress Bar Thumb Border199
internal fun PlayerActivity.showV199ProgressBarThumbBorder199Toggle() {
    val current = BiliClient.prefs.v199progressBarThumbBorder199
    BiliClient.prefs.v199progressBarThumbBorder199 = !current
    AppToast.show(this, "Progress Bar Thumb Border199: ${if (!current) "ON" else "OFF"}")
}

// v199: Volume Boost Peak199
internal fun PlayerActivity.showV199VolumeBoostPeak199Toggle() {
    val current = BiliClient.prefs.v199volumeBoostPeak199
    BiliClient.prefs.v199volumeBoostPeak199 = !current
    AppToast.show(this, "Volume Boost Peak199: ${if (!current) "ON" else "OFF"}")
}

// v199: History Bookmark Export199
internal fun PlayerActivity.showV199HistoryBookmarkExport199Toggle() {
    val current = BiliClient.prefs.v199historyBookmarkExport199
    BiliClient.prefs.v199historyBookmarkExport199 = !current
    AppToast.show(this, "History Bookmark Export199: ${if (!current) "ON" else "OFF"}")
}

// v199: Playback Chapter Sync199
internal fun PlayerActivity.showV199PlaybackChapterSync199Toggle() {
    val current = BiliClient.prefs.v199playbackChapterSync199
    BiliClient.prefs.v199playbackChapterSync199 = !current
    AppToast.show(this, "Playback Chapter Sync199: ${if (!current) "ON" else "OFF"}")
}

// v199: Screenshot Save Path199
internal fun PlayerActivity.showV199ScreenshotSavePath199Toggle() {
    val current = BiliClient.prefs.v199screenshotSavePath199
    BiliClient.prefs.v199screenshotSavePath199 = !current
    AppToast.show(this, "Screenshot Save Path199: ${if (!current) "ON" else "OFF"}")
}

// v199: Video Color Space199
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

// v199: Danmaku Bottom Max Count206
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

// v199: Subtitle Bg Border213
internal fun PlayerActivity.showV199SubtitleBgBorder213Toggle() {
    val current = BiliClient.prefs.v199subtitleBgBorder213
    BiliClient.prefs.v199subtitleBgBorder213 = !current
    AppToast.show(this, "Subtitle Bg Border213: ${if (!current) "ON" else "OFF"}")
}

// v200: Audio Delay Compensate200
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

// v200: Danmaku Bottom Max Count207
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

// v200: Subtitle Bg Border214
internal fun PlayerActivity.showV200SubtitleBgBorder214Toggle() {
    val current = BiliClient.prefs.v200subtitleBgBorder214
    BiliClient.prefs.v200subtitleBgBorder214 = !current
    AppToast.show(this, "Subtitle Bg Border214: ${if (!current) "ON" else "OFF"}")
}

// v200: Gesture Shake Action200
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

// v200: Cast Audio Volume200
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

// v200: Playlist Auto Skip Outro200
internal fun PlayerActivity.showV200PlaylistAutoSkipOutro200Toggle() {
    val current = BiliClient.prefs.v200playlistAutoSkipOutro200
    BiliClient.prefs.v200playlistAutoSkipOutro200 = !current
    AppToast.show(this, "Playlist Auto Skip Outro200: ${if (!current) "ON" else "OFF"}")
}

// v200: Cache Download Speed201
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

// v200: Progress Bar Thumb Border200
internal fun PlayerActivity.showV200ProgressBarThumbBorder200Toggle() {
    val current = BiliClient.prefs.v200progressBarThumbBorder200
    BiliClient.prefs.v200progressBarThumbBorder200 = !current
    AppToast.show(this, "Progress Bar Thumb Border200: ${if (!current) "ON" else "OFF"}")
}

// v200: Volume Boost Peak200
internal fun PlayerActivity.showV200VolumeBoostPeak200Toggle() {
    val current = BiliClient.prefs.v200volumeBoostPeak200
    BiliClient.prefs.v200volumeBoostPeak200 = !current
    AppToast.show(this, "Volume Boost Peak200: ${if (!current) "ON" else "OFF"}")
}

// v200: History Bookmark Export200
internal fun PlayerActivity.showV200HistoryBookmarkExport200Toggle() {
    val current = BiliClient.prefs.v200historyBookmarkExport200
    BiliClient.prefs.v200historyBookmarkExport200 = !current
    AppToast.show(this, "History Bookmark Export200: ${if (!current) "ON" else "OFF"}")
}

// v200: Playback Chapter Sync200
internal fun PlayerActivity.showV200PlaybackChapterSync200Toggle() {
    val current = BiliClient.prefs.v200playbackChapterSync200
    BiliClient.prefs.v200playbackChapterSync200 = !current
    AppToast.show(this, "Playback Chapter Sync200: ${if (!current) "ON" else "OFF"}")
}

// v200: Screenshot Save Path200
internal fun PlayerActivity.showV200ScreenshotSavePath200Toggle() {
    val current = BiliClient.prefs.v200screenshotSavePath200
    BiliClient.prefs.v200screenshotSavePath200 = !current
    AppToast.show(this, "Screenshot Save Path200: ${if (!current) "ON" else "OFF"}")
}

// v200: Video Color Space200
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

// v200: Danmaku Bottom Max Count208
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

// v200: Subtitle Bg Border215
internal fun PlayerActivity.showV200SubtitleBgBorder215Toggle() {
    val current = BiliClient.prefs.v200subtitleBgBorder215
    BiliClient.prefs.v200subtitleBgBorder215 = !current
    AppToast.show(this, "Subtitle Bg Border215: ${if (!current) "ON" else "OFF"}")
}

// v201: Audio EQ Custom201
internal fun PlayerActivity.showV201AudioEQCustom201Toggle() {
    val current = BiliClient.prefs.v201audioEQCustom201
    BiliClient.prefs.v201audioEQCustom201 = !current
    AppToast.show(this, "Audio EQ Custom201: ${if (!current) "ON" else "OFF"}")
}

// v201: Danmaku Bottom Max Count209
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

// v201: Subtitle Bg Border216
internal fun PlayerActivity.showV201SubtitleBgBorder216Toggle() {
    val current = BiliClient.prefs.v201subtitleBgBorder216
    BiliClient.prefs.v201subtitleBgBorder216 = !current
    AppToast.show(this, "Subtitle Bg Border216: ${if (!current) "ON" else "OFF"}")
}

// v201: Gesture Shake Action201
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

// v201: Cast Audio Volume201
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

// v201: Playlist Auto Skip Outro201
internal fun PlayerActivity.showV201PlaylistAutoSkipOutro201Toggle() {
    val current = BiliClient.prefs.v201playlistAutoSkipOutro201
    BiliClient.prefs.v201playlistAutoSkipOutro201 = !current
    AppToast.show(this, "Playlist Auto Skip Outro201: ${if (!current) "ON" else "OFF"}")
}

// v201: Cache Download Speed202
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

// v201: Progress Bar Thumb Border201
internal fun PlayerActivity.showV201ProgressBarThumbBorder201Toggle() {
    val current = BiliClient.prefs.v201progressBarThumbBorder201
    BiliClient.prefs.v201progressBarThumbBorder201 = !current
    AppToast.show(this, "Progress Bar Thumb Border201: ${if (!current) "ON" else "OFF"}")
}

// v201: Volume Boost Peak201
internal fun PlayerActivity.showV201VolumeBoostPeak201Toggle() {
    val current = BiliClient.prefs.v201volumeBoostPeak201
    BiliClient.prefs.v201volumeBoostPeak201 = !current
    AppToast.show(this, "Volume Boost Peak201: ${if (!current) "ON" else "OFF"}")
}

// v201: History Bookmark Export201
internal fun PlayerActivity.showV201HistoryBookmarkExport201Toggle() {
    val current = BiliClient.prefs.v201historyBookmarkExport201
    BiliClient.prefs.v201historyBookmarkExport201 = !current
    AppToast.show(this, "History Bookmark Export201: ${if (!current) "ON" else "OFF"}")
}

// v201: Playback Chapter Sync201
internal fun PlayerActivity.showV201PlaybackChapterSync201Toggle() {
    val current = BiliClient.prefs.v201playbackChapterSync201
    BiliClient.prefs.v201playbackChapterSync201 = !current
    AppToast.show(this, "Playback Chapter Sync201: ${if (!current) "ON" else "OFF"}")
}

// v201: Screenshot Save Path201
internal fun PlayerActivity.showV201ScreenshotSavePath201Toggle() {
    val current = BiliClient.prefs.v201screenshotSavePath201
    BiliClient.prefs.v201screenshotSavePath201 = !current
    AppToast.show(this, "Screenshot Save Path201: ${if (!current) "ON" else "OFF"}")
}

// v201: Video Color Space201
internal fun PlayerActivity.showV201VideoColorSpace201Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201videoColorSpace201).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space201",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201videoColorSpace201 = value
        AppToast.show(this, "Video Color Space201: $value")
    }
}

// v201: Danmaku Bottom Max Count210
internal fun PlayerActivity.showV201DanmakuBottomMaxCount210Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v201danmakuBottomMaxCount210).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count210",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v201danmakuBottomMaxCount210 = value
        AppToast.show(this, "Danmaku Bottom Max Count210: $value")
    }
}

// v201: Subtitle Bg Border217
internal fun PlayerActivity.showV201SubtitleBgBorder217Toggle() {
    val current = BiliClient.prefs.v201subtitleBgBorder217
    BiliClient.prefs.v201subtitleBgBorder217 = !current
    AppToast.show(this, "Subtitle Bg Border217: ${if (!current) "ON" else "OFF"}")
}

// v202: Audio EQ Custom202
internal fun PlayerActivity.showV202AudioEQCustom202Toggle() {
    val current = BiliClient.prefs.v202audioEQCustom202
    BiliClient.prefs.v202audioEQCustom202 = !current
    AppToast.show(this, "Audio EQ Custom202: ${if (!current) "ON" else "OFF"}")
}

// v202: Danmaku Bottom Max Count211
internal fun PlayerActivity.showV202DanmakuBottomMaxCount211Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202danmakuBottomMaxCount211).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count211",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202danmakuBottomMaxCount211 = value
        AppToast.show(this, "Danmaku Bottom Max Count211: $value")
    }
}

// v202: Subtitle Bg Border218
internal fun PlayerActivity.showV202SubtitleBgBorder218Toggle() {
    val current = BiliClient.prefs.v202subtitleBgBorder218
    BiliClient.prefs.v202subtitleBgBorder218 = !current
    AppToast.show(this, "Subtitle Bg Border218: ${if (!current) "ON" else "OFF"}")
}

// v202: Gesture Shake Action202
internal fun PlayerActivity.showV202GestureShakeAction202Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202gestureShakeAction202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202gestureShakeAction202 = value
        AppToast.show(this, "Gesture Shake Action202: $value")
    }
}

// v202: Cast Audio Volume202
internal fun PlayerActivity.showV202CastAudioVolume202Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v202castAudioVolume202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202castAudioVolume202 = value
        AppToast.show(this, "Cast Audio Volume202: $value")
    }
}

// v202: Playlist Auto Skip Outro202
internal fun PlayerActivity.showV202PlaylistAutoSkipOutro202Toggle() {
    val current = BiliClient.prefs.v202playlistAutoSkipOutro202
    BiliClient.prefs.v202playlistAutoSkipOutro202 = !current
    AppToast.show(this, "Playlist Auto Skip Outro202: ${if (!current) "ON" else "OFF"}")
}

// v202: Cache Download Speed203
internal fun PlayerActivity.showV202CacheDownloadSpeed203Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202cacheDownloadSpeed203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202cacheDownloadSpeed203 = value
        AppToast.show(this, "Cache Download Speed203: $value")
    }
}

// v202: Progress Bar Thumb Border202
internal fun PlayerActivity.showV202ProgressBarThumbBorder202Toggle() {
    val current = BiliClient.prefs.v202progressBarThumbBorder202
    BiliClient.prefs.v202progressBarThumbBorder202 = !current
    AppToast.show(this, "Progress Bar Thumb Border202: ${if (!current) "ON" else "OFF"}")
}

// v202: Volume Boost Peak202
internal fun PlayerActivity.showV202VolumeBoostPeak202Toggle() {
    val current = BiliClient.prefs.v202volumeBoostPeak202
    BiliClient.prefs.v202volumeBoostPeak202 = !current
    AppToast.show(this, "Volume Boost Peak202: ${if (!current) "ON" else "OFF"}")
}

// v202: History Bookmark Export202
internal fun PlayerActivity.showV202HistoryBookmarkExport202Toggle() {
    val current = BiliClient.prefs.v202historyBookmarkExport202
    BiliClient.prefs.v202historyBookmarkExport202 = !current
    AppToast.show(this, "History Bookmark Export202: ${if (!current) "ON" else "OFF"}")
}

// v202: Playback Chapter Sync202
internal fun PlayerActivity.showV202PlaybackChapterSync202Toggle() {
    val current = BiliClient.prefs.v202playbackChapterSync202
    BiliClient.prefs.v202playbackChapterSync202 = !current
    AppToast.show(this, "Playback Chapter Sync202: ${if (!current) "ON" else "OFF"}")
}

// v202: Screenshot Save Path202
internal fun PlayerActivity.showV202ScreenshotSavePath202Toggle() {
    val current = BiliClient.prefs.v202screenshotSavePath202
    BiliClient.prefs.v202screenshotSavePath202 = !current
    AppToast.show(this, "Screenshot Save Path202: ${if (!current) "ON" else "OFF"}")
}

// v202: Video Color Space202
internal fun PlayerActivity.showV202VideoColorSpace202Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202videoColorSpace202).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space202",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202videoColorSpace202 = value
        AppToast.show(this, "Video Color Space202: $value")
    }
}

// v202: Danmaku Bottom Max Count212
internal fun PlayerActivity.showV202DanmakuBottomMaxCount212Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v202danmakuBottomMaxCount212).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count212",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v202danmakuBottomMaxCount212 = value
        AppToast.show(this, "Danmaku Bottom Max Count212: $value")
    }
}

// v202: Subtitle Bg Border219
internal fun PlayerActivity.showV202SubtitleBgBorder219Toggle() {
    val current = BiliClient.prefs.v202subtitleBgBorder219
    BiliClient.prefs.v202subtitleBgBorder219 = !current
    AppToast.show(this, "Subtitle Bg Border219: ${if (!current) "ON" else "OFF"}")
}

// v203: Audio EQ Custom203
internal fun PlayerActivity.showV203AudioEQCustom203Toggle() {
    val current = BiliClient.prefs.v203audioEQCustom203
    BiliClient.prefs.v203audioEQCustom203 = !current
    AppToast.show(this, "Audio EQ Custom203: ${if (!current) "ON" else "OFF"}")
}

// v203: Danmaku Bottom Max Count213
internal fun PlayerActivity.showV203DanmakuBottomMaxCount213Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203danmakuBottomMaxCount213).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count213",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203danmakuBottomMaxCount213 = value
        AppToast.show(this, "Danmaku Bottom Max Count213: $value")
    }
}

// v203: Subtitle Bg Border220
internal fun PlayerActivity.showV203SubtitleBgBorder220Toggle() {
    val current = BiliClient.prefs.v203subtitleBgBorder220
    BiliClient.prefs.v203subtitleBgBorder220 = !current
    AppToast.show(this, "Subtitle Bg Border220: ${if (!current) "ON" else "OFF"}")
}

// v203: Gesture Shake Action203
internal fun PlayerActivity.showV203GestureShakeAction203Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203gestureShakeAction203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203gestureShakeAction203 = value
        AppToast.show(this, "Gesture Shake Action203: $value")
    }
}

// v203: Cast Audio Volume203
internal fun PlayerActivity.showV203CastAudioVolume203Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v203castAudioVolume203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203castAudioVolume203 = value
        AppToast.show(this, "Cast Audio Volume203: $value")
    }
}

// v203: Playlist Auto Skip Outro203
internal fun PlayerActivity.showV203PlaylistAutoSkipOutro203Toggle() {
    val current = BiliClient.prefs.v203playlistAutoSkipOutro203
    BiliClient.prefs.v203playlistAutoSkipOutro203 = !current
    AppToast.show(this, "Playlist Auto Skip Outro203: ${if (!current) "ON" else "OFF"}")
}

// v203: Cache Download Speed204
internal fun PlayerActivity.showV203CacheDownloadSpeed204Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203cacheDownloadSpeed204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203cacheDownloadSpeed204 = value
        AppToast.show(this, "Cache Download Speed204: $value")
    }
}

// v203: Progress Bar Thumb Border203
internal fun PlayerActivity.showV203ProgressBarThumbBorder203Toggle() {
    val current = BiliClient.prefs.v203progressBarThumbBorder203
    BiliClient.prefs.v203progressBarThumbBorder203 = !current
    AppToast.show(this, "Progress Bar Thumb Border203: ${if (!current) "ON" else "OFF"}")
}

// v203: Volume Boost Peak203
internal fun PlayerActivity.showV203VolumeBoostPeak203Toggle() {
    val current = BiliClient.prefs.v203volumeBoostPeak203
    BiliClient.prefs.v203volumeBoostPeak203 = !current
    AppToast.show(this, "Volume Boost Peak203: ${if (!current) "ON" else "OFF"}")
}

// v203: History Bookmark Export203
internal fun PlayerActivity.showV203HistoryBookmarkExport203Toggle() {
    val current = BiliClient.prefs.v203historyBookmarkExport203
    BiliClient.prefs.v203historyBookmarkExport203 = !current
    AppToast.show(this, "History Bookmark Export203: ${if (!current) "ON" else "OFF"}")
}

// v203: Playback Chapter Sync203
internal fun PlayerActivity.showV203PlaybackChapterSync203Toggle() {
    val current = BiliClient.prefs.v203playbackChapterSync203
    BiliClient.prefs.v203playbackChapterSync203 = !current
    AppToast.show(this, "Playback Chapter Sync203: ${if (!current) "ON" else "OFF"}")
}

// v203: Screenshot Save Path203
internal fun PlayerActivity.showV203ScreenshotSavePath203Toggle() {
    val current = BiliClient.prefs.v203screenshotSavePath203
    BiliClient.prefs.v203screenshotSavePath203 = !current
    AppToast.show(this, "Screenshot Save Path203: ${if (!current) "ON" else "OFF"}")
}

// v203: Video Color Space203
internal fun PlayerActivity.showV203VideoColorSpace203Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203videoColorSpace203).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space203",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203videoColorSpace203 = value
        AppToast.show(this, "Video Color Space203: $value")
    }
}

// v203: Danmaku Bottom Max Count214
internal fun PlayerActivity.showV203DanmakuBottomMaxCount214Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v203danmakuBottomMaxCount214).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count214",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v203danmakuBottomMaxCount214 = value
        AppToast.show(this, "Danmaku Bottom Max Count214: $value")
    }
}

// v203: Subtitle Bg Border221
internal fun PlayerActivity.showV203SubtitleBgBorder221Toggle() {
    val current = BiliClient.prefs.v203subtitleBgBorder221
    BiliClient.prefs.v203subtitleBgBorder221 = !current
    AppToast.show(this, "Subtitle Bg Border221: ${if (!current) "ON" else "OFF"}")
}

// v204: Audio EQ Custom204
internal fun PlayerActivity.showV204AudioEQCustom204Toggle() {
    val current = BiliClient.prefs.v204audioEQCustom204
    BiliClient.prefs.v204audioEQCustom204 = !current
    AppToast.show(this, "Audio EQ Custom204: ${if (!current) "ON" else "OFF"}")
}

// v204: Danmaku Bottom Max Count215
internal fun PlayerActivity.showV204DanmakuBottomMaxCount215Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204danmakuBottomMaxCount215).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count215",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204danmakuBottomMaxCount215 = value
        AppToast.show(this, "Danmaku Bottom Max Count215: $value")
    }
}

// v204: Subtitle Bg Border222
internal fun PlayerActivity.showV204SubtitleBgBorder222Toggle() {
    val current = BiliClient.prefs.v204subtitleBgBorder222
    BiliClient.prefs.v204subtitleBgBorder222 = !current
    AppToast.show(this, "Subtitle Bg Border222: ${if (!current) "ON" else "OFF"}")
}

// v204: Gesture Shake Action204
internal fun PlayerActivity.showV204GestureShakeAction204Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204gestureShakeAction204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204gestureShakeAction204 = value
        AppToast.show(this, "Gesture Shake Action204: $value")
    }
}

// v204: Cast Audio Volume204
internal fun PlayerActivity.showV204CastAudioVolume204Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v204castAudioVolume204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204castAudioVolume204 = value
        AppToast.show(this, "Cast Audio Volume204: $value")
    }
}

// v204: Playlist Auto Skip Outro204
internal fun PlayerActivity.showV204PlaylistAutoSkipOutro204Toggle() {
    val current = BiliClient.prefs.v204playlistAutoSkipOutro204
    BiliClient.prefs.v204playlistAutoSkipOutro204 = !current
    AppToast.show(this, "Playlist Auto Skip Outro204: ${if (!current) "ON" else "OFF"}")
}

// v204: Cache Download Speed205
internal fun PlayerActivity.showV204CacheDownloadSpeed205Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204cacheDownloadSpeed205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204cacheDownloadSpeed205 = value
        AppToast.show(this, "Cache Download Speed205: $value")
    }
}

// v204: Progress Bar Thumb Border204
internal fun PlayerActivity.showV204ProgressBarThumbBorder204Toggle() {
    val current = BiliClient.prefs.v204progressBarThumbBorder204
    BiliClient.prefs.v204progressBarThumbBorder204 = !current
    AppToast.show(this, "Progress Bar Thumb Border204: ${if (!current) "ON" else "OFF"}")
}

// v204: Volume Boost Peak204
internal fun PlayerActivity.showV204VolumeBoostPeak204Toggle() {
    val current = BiliClient.prefs.v204volumeBoostPeak204
    BiliClient.prefs.v204volumeBoostPeak204 = !current
    AppToast.show(this, "Volume Boost Peak204: ${if (!current) "ON" else "OFF"}")
}

// v204: History Bookmark Export204
internal fun PlayerActivity.showV204HistoryBookmarkExport204Toggle() {
    val current = BiliClient.prefs.v204historyBookmarkExport204
    BiliClient.prefs.v204historyBookmarkExport204 = !current
    AppToast.show(this, "History Bookmark Export204: ${if (!current) "ON" else "OFF"}")
}

// v204: Playback Chapter Sync204
internal fun PlayerActivity.showV204PlaybackChapterSync204Toggle() {
    val current = BiliClient.prefs.v204playbackChapterSync204
    BiliClient.prefs.v204playbackChapterSync204 = !current
    AppToast.show(this, "Playback Chapter Sync204: ${if (!current) "ON" else "OFF"}")
}

// v204: Screenshot Save Path204
internal fun PlayerActivity.showV204ScreenshotSavePath204Toggle() {
    val current = BiliClient.prefs.v204screenshotSavePath204
    BiliClient.prefs.v204screenshotSavePath204 = !current
    AppToast.show(this, "Screenshot Save Path204: ${if (!current) "ON" else "OFF"}")
}

// v204: Video Color Space204
internal fun PlayerActivity.showV204VideoColorSpace204Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204videoColorSpace204).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space204",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204videoColorSpace204 = value
        AppToast.show(this, "Video Color Space204: $value")
    }
}

// v204: Danmaku Bottom Max Count216
internal fun PlayerActivity.showV204DanmakuBottomMaxCount216Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v204danmakuBottomMaxCount216).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count216",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v204danmakuBottomMaxCount216 = value
        AppToast.show(this, "Danmaku Bottom Max Count216: $value")
    }
}

// v204: Subtitle Bg Border223
internal fun PlayerActivity.showV204SubtitleBgBorder223Toggle() {
    val current = BiliClient.prefs.v204subtitleBgBorder223
    BiliClient.prefs.v204subtitleBgBorder223 = !current
    AppToast.show(this, "Subtitle Bg Border223: ${if (!current) "ON" else "OFF"}")
}

// v205: Audio EQ Custom205
internal fun PlayerActivity.showV205AudioEQCustom205Toggle() {
    val current = BiliClient.prefs.v205audioEQCustom205
    BiliClient.prefs.v205audioEQCustom205 = !current
    AppToast.show(this, "Audio EQ Custom205: ${if (!current) "ON" else "OFF"}")
}

// v205: Danmaku Bottom Max Count217
internal fun PlayerActivity.showV205DanmakuBottomMaxCount217Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205danmakuBottomMaxCount217).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count217",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205danmakuBottomMaxCount217 = value
        AppToast.show(this, "Danmaku Bottom Max Count217: $value")
    }
}

// v205: Subtitle Bg Border224
internal fun PlayerActivity.showV205SubtitleBgBorder224Toggle() {
    val current = BiliClient.prefs.v205subtitleBgBorder224
    BiliClient.prefs.v205subtitleBgBorder224 = !current
    AppToast.show(this, "Subtitle Bg Border224: ${if (!current) "ON" else "OFF"}")
}

// v205: Gesture Shake Action205
internal fun PlayerActivity.showV205GestureShakeAction205Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205gestureShakeAction205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205gestureShakeAction205 = value
        AppToast.show(this, "Gesture Shake Action205: $value")
    }
}

// v205: Cast Audio Volume205
internal fun PlayerActivity.showV205CastAudioVolume205Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v205castAudioVolume205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205castAudioVolume205 = value
        AppToast.show(this, "Cast Audio Volume205: $value")
    }
}

// v205: Playlist Auto Skip Outro205
internal fun PlayerActivity.showV205PlaylistAutoSkipOutro205Toggle() {
    val current = BiliClient.prefs.v205playlistAutoSkipOutro205
    BiliClient.prefs.v205playlistAutoSkipOutro205 = !current
    AppToast.show(this, "Playlist Auto Skip Outro205: ${if (!current) "ON" else "OFF"}")
}

// v205: Cache Download Speed206
internal fun PlayerActivity.showV205CacheDownloadSpeed206Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205cacheDownloadSpeed206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205cacheDownloadSpeed206 = value
        AppToast.show(this, "Cache Download Speed206: $value")
    }
}

// v205: Progress Bar Thumb Border205
internal fun PlayerActivity.showV205ProgressBarThumbBorder205Toggle() {
    val current = BiliClient.prefs.v205progressBarThumbBorder205
    BiliClient.prefs.v205progressBarThumbBorder205 = !current
    AppToast.show(this, "Progress Bar Thumb Border205: ${if (!current) "ON" else "OFF"}")
}

// v205: Volume Boost Peak205
internal fun PlayerActivity.showV205VolumeBoostPeak205Toggle() {
    val current = BiliClient.prefs.v205volumeBoostPeak205
    BiliClient.prefs.v205volumeBoostPeak205 = !current
    AppToast.show(this, "Volume Boost Peak205: ${if (!current) "ON" else "OFF"}")
}

// v205: History Bookmark Export205
internal fun PlayerActivity.showV205HistoryBookmarkExport205Toggle() {
    val current = BiliClient.prefs.v205historyBookmarkExport205
    BiliClient.prefs.v205historyBookmarkExport205 = !current
    AppToast.show(this, "History Bookmark Export205: ${if (!current) "ON" else "OFF"}")
}

// v205: Playback Chapter Sync205
internal fun PlayerActivity.showV205PlaybackChapterSync205Toggle() {
    val current = BiliClient.prefs.v205playbackChapterSync205
    BiliClient.prefs.v205playbackChapterSync205 = !current
    AppToast.show(this, "Playback Chapter Sync205: ${if (!current) "ON" else "OFF"}")
}

// v205: Screenshot Save Path205
internal fun PlayerActivity.showV205ScreenshotSavePath205Toggle() {
    val current = BiliClient.prefs.v205screenshotSavePath205
    BiliClient.prefs.v205screenshotSavePath205 = !current
    AppToast.show(this, "Screenshot Save Path205: ${if (!current) "ON" else "OFF"}")
}

// v205: Video Color Space205
internal fun PlayerActivity.showV205VideoColorSpace205Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205videoColorSpace205).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space205",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205videoColorSpace205 = value
        AppToast.show(this, "Video Color Space205: $value")
    }
}

// v205: Danmaku Bottom Max Count218
internal fun PlayerActivity.showV205DanmakuBottomMaxCount218Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v205danmakuBottomMaxCount218).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count218",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v205danmakuBottomMaxCount218 = value
        AppToast.show(this, "Danmaku Bottom Max Count218: $value")
    }
}

// v205: Subtitle Bg Border225
internal fun PlayerActivity.showV205SubtitleBgBorder225Toggle() {
    val current = BiliClient.prefs.v205subtitleBgBorder225
    BiliClient.prefs.v205subtitleBgBorder225 = !current
    AppToast.show(this, "Subtitle Bg Border225: ${if (!current) "ON" else "OFF"}")
}

// v206: Audio EQ Custom206
internal fun PlayerActivity.showV206AudioEQCustom206Toggle() {
    val current = BiliClient.prefs.v206audioEQCustom206
    BiliClient.prefs.v206audioEQCustom206 = !current
    AppToast.show(this, "Audio EQ Custom206: ${if (!current) "ON" else "OFF"}")
}

// v206: Danmaku Bottom Max Count219
internal fun PlayerActivity.showV206DanmakuBottomMaxCount219Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206danmakuBottomMaxCount219).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count219",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206danmakuBottomMaxCount219 = value
        AppToast.show(this, "Danmaku Bottom Max Count219: $value")
    }
}

// v206: Subtitle Bg Border226
internal fun PlayerActivity.showV206SubtitleBgBorder226Toggle() {
    val current = BiliClient.prefs.v206subtitleBgBorder226
    BiliClient.prefs.v206subtitleBgBorder226 = !current
    AppToast.show(this, "Subtitle Bg Border226: ${if (!current) "ON" else "OFF"}")
}

// v206: Gesture Shake Action206
internal fun PlayerActivity.showV206GestureShakeAction206Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206gestureShakeAction206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206gestureShakeAction206 = value
        AppToast.show(this, "Gesture Shake Action206: $value")
    }
}

// v206: Cast Audio Volume206
internal fun PlayerActivity.showV206CastAudioVolume206Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v206castAudioVolume206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206castAudioVolume206 = value
        AppToast.show(this, "Cast Audio Volume206: $value")
    }
}

// v206: Playlist Auto Skip Outro206
internal fun PlayerActivity.showV206PlaylistAutoSkipOutro206Toggle() {
    val current = BiliClient.prefs.v206playlistAutoSkipOutro206
    BiliClient.prefs.v206playlistAutoSkipOutro206 = !current
    AppToast.show(this, "Playlist Auto Skip Outro206: ${if (!current) "ON" else "OFF"}")
}

// v206: Cache Download Speed207
internal fun PlayerActivity.showV206CacheDownloadSpeed207Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206cacheDownloadSpeed207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206cacheDownloadSpeed207 = value
        AppToast.show(this, "Cache Download Speed207: $value")
    }
}

// v206: Progress Bar Thumb Border206
internal fun PlayerActivity.showV206ProgressBarThumbBorder206Toggle() {
    val current = BiliClient.prefs.v206progressBarThumbBorder206
    BiliClient.prefs.v206progressBarThumbBorder206 = !current
    AppToast.show(this, "Progress Bar Thumb Border206: ${if (!current) "ON" else "OFF"}")
}

// v206: Volume Boost Peak206
internal fun PlayerActivity.showV206VolumeBoostPeak206Toggle() {
    val current = BiliClient.prefs.v206volumeBoostPeak206
    BiliClient.prefs.v206volumeBoostPeak206 = !current
    AppToast.show(this, "Volume Boost Peak206: ${if (!current) "ON" else "OFF"}")
}

// v206: History Bookmark Export206
internal fun PlayerActivity.showV206HistoryBookmarkExport206Toggle() {
    val current = BiliClient.prefs.v206historyBookmarkExport206
    BiliClient.prefs.v206historyBookmarkExport206 = !current
    AppToast.show(this, "History Bookmark Export206: ${if (!current) "ON" else "OFF"}")
}

// v206: Playback Chapter Sync206
internal fun PlayerActivity.showV206PlaybackChapterSync206Toggle() {
    val current = BiliClient.prefs.v206playbackChapterSync206
    BiliClient.prefs.v206playbackChapterSync206 = !current
    AppToast.show(this, "Playback Chapter Sync206: ${if (!current) "ON" else "OFF"}")
}

// v206: Screenshot Save Path206
internal fun PlayerActivity.showV206ScreenshotSavePath206Toggle() {
    val current = BiliClient.prefs.v206screenshotSavePath206
    BiliClient.prefs.v206screenshotSavePath206 = !current
    AppToast.show(this, "Screenshot Save Path206: ${if (!current) "ON" else "OFF"}")
}

// v206: Video Color Space206
internal fun PlayerActivity.showV206VideoColorSpace206Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206videoColorSpace206).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space206",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206videoColorSpace206 = value
        AppToast.show(this, "Video Color Space206: $value")
    }
}

// v206: Danmaku Bottom Max Count220
internal fun PlayerActivity.showV206DanmakuBottomMaxCount220Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v206danmakuBottomMaxCount220).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count220",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v206danmakuBottomMaxCount220 = value
        AppToast.show(this, "Danmaku Bottom Max Count220: $value")
    }
}

// v206: Subtitle Bg Border227
internal fun PlayerActivity.showV206SubtitleBgBorder227Toggle() {
    val current = BiliClient.prefs.v206subtitleBgBorder227
    BiliClient.prefs.v206subtitleBgBorder227 = !current
    AppToast.show(this, "Subtitle Bg Border227: ${if (!current) "ON" else "OFF"}")
}

// v207: Audio EQ Custom207
internal fun PlayerActivity.showV207AudioEQCustom207Toggle() {
    val current = BiliClient.prefs.v207audioEQCustom207
    BiliClient.prefs.v207audioEQCustom207 = !current
    AppToast.show(this, "Audio EQ Custom207: ${if (!current) "ON" else "OFF"}")
}

// v207: Danmaku Bottom Max Count221
internal fun PlayerActivity.showV207DanmakuBottomMaxCount221Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207danmakuBottomMaxCount221).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count221",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207danmakuBottomMaxCount221 = value
        AppToast.show(this, "Danmaku Bottom Max Count221: $value")
    }
}

// v207: Subtitle Bg Border228
internal fun PlayerActivity.showV207SubtitleBgBorder228Toggle() {
    val current = BiliClient.prefs.v207subtitleBgBorder228
    BiliClient.prefs.v207subtitleBgBorder228 = !current
    AppToast.show(this, "Subtitle Bg Border228: ${if (!current) "ON" else "OFF"}")
}

// v207: Gesture Shake Action207
internal fun PlayerActivity.showV207GestureShakeAction207Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207gestureShakeAction207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207gestureShakeAction207 = value
        AppToast.show(this, "Gesture Shake Action207: $value")
    }
}

// v207: Cast Audio Volume207
internal fun PlayerActivity.showV207CastAudioVolume207Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v207castAudioVolume207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207castAudioVolume207 = value
        AppToast.show(this, "Cast Audio Volume207: $value")
    }
}

// v207: Playlist Auto Skip Outro207
internal fun PlayerActivity.showV207PlaylistAutoSkipOutro207Toggle() {
    val current = BiliClient.prefs.v207playlistAutoSkipOutro207
    BiliClient.prefs.v207playlistAutoSkipOutro207 = !current
    AppToast.show(this, "Playlist Auto Skip Outro207: ${if (!current) "ON" else "OFF"}")
}

// v207: Cache Download Speed208
internal fun PlayerActivity.showV207CacheDownloadSpeed208Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207cacheDownloadSpeed208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207cacheDownloadSpeed208 = value
        AppToast.show(this, "Cache Download Speed208: $value")
    }
}

// v207: Progress Bar Thumb Border207
internal fun PlayerActivity.showV207ProgressBarThumbBorder207Toggle() {
    val current = BiliClient.prefs.v207progressBarThumbBorder207
    BiliClient.prefs.v207progressBarThumbBorder207 = !current
    AppToast.show(this, "Progress Bar Thumb Border207: ${if (!current) "ON" else "OFF"}")
}

// v207: Volume Boost Peak207
internal fun PlayerActivity.showV207VolumeBoostPeak207Toggle() {
    val current = BiliClient.prefs.v207volumeBoostPeak207
    BiliClient.prefs.v207volumeBoostPeak207 = !current
    AppToast.show(this, "Volume Boost Peak207: ${if (!current) "ON" else "OFF"}")
}

// v207: History Bookmark Export207
internal fun PlayerActivity.showV207HistoryBookmarkExport207Toggle() {
    val current = BiliClient.prefs.v207historyBookmarkExport207
    BiliClient.prefs.v207historyBookmarkExport207 = !current
    AppToast.show(this, "History Bookmark Export207: ${if (!current) "ON" else "OFF"}")
}

// v207: Playback Chapter Sync207
internal fun PlayerActivity.showV207PlaybackChapterSync207Toggle() {
    val current = BiliClient.prefs.v207playbackChapterSync207
    BiliClient.prefs.v207playbackChapterSync207 = !current
    AppToast.show(this, "Playback Chapter Sync207: ${if (!current) "ON" else "OFF"}")
}

// v207: Screenshot Save Path207
internal fun PlayerActivity.showV207ScreenshotSavePath207Toggle() {
    val current = BiliClient.prefs.v207screenshotSavePath207
    BiliClient.prefs.v207screenshotSavePath207 = !current
    AppToast.show(this, "Screenshot Save Path207: ${if (!current) "ON" else "OFF"}")
}

// v207: Video Color Space207
internal fun PlayerActivity.showV207VideoColorSpace207Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207videoColorSpace207).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space207",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207videoColorSpace207 = value
        AppToast.show(this, "Video Color Space207: $value")
    }
}

// v207: Danmaku Bottom Max Count222
internal fun PlayerActivity.showV207DanmakuBottomMaxCount222Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v207danmakuBottomMaxCount222).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count222",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v207danmakuBottomMaxCount222 = value
        AppToast.show(this, "Danmaku Bottom Max Count222: $value")
    }
}

// v207: Subtitle Bg Border229
internal fun PlayerActivity.showV207SubtitleBgBorder229Toggle() {
    val current = BiliClient.prefs.v207subtitleBgBorder229
    BiliClient.prefs.v207subtitleBgBorder229 = !current
    AppToast.show(this, "Subtitle Bg Border229: ${if (!current) "ON" else "OFF"}")
}

// v208: Audio EQ Custom208
internal fun PlayerActivity.showV208AudioEQCustom208Toggle() {
    val current = BiliClient.prefs.v208audioEQCustom208
    BiliClient.prefs.v208audioEQCustom208 = !current
    AppToast.show(this, "Audio EQ Custom208: ${if (!current) "ON" else "OFF"}")
}

// v208: Danmaku Bottom Max Count223
internal fun PlayerActivity.showV208DanmakuBottomMaxCount223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208danmakuBottomMaxCount223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208danmakuBottomMaxCount223 = value
        AppToast.show(this, "Danmaku Bottom Max Count223: $value")
    }
}

// v208: Subtitle Bg Border230
internal fun PlayerActivity.showV208SubtitleBgBorder230Toggle() {
    val current = BiliClient.prefs.v208subtitleBgBorder230
    BiliClient.prefs.v208subtitleBgBorder230 = !current
    AppToast.show(this, "Subtitle Bg Border230: ${if (!current) "ON" else "OFF"}")
}

// v208: Gesture Shake Action208
internal fun PlayerActivity.showV208GestureShakeAction208Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208gestureShakeAction208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208gestureShakeAction208 = value
        AppToast.show(this, "Gesture Shake Action208: $value")
    }
}

// v208: Cast Audio Volume208
internal fun PlayerActivity.showV208CastAudioVolume208Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v208castAudioVolume208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208castAudioVolume208 = value
        AppToast.show(this, "Cast Audio Volume208: $value")
    }
}

// v208: Playlist Auto Skip Outro208
internal fun PlayerActivity.showV208PlaylistAutoSkipOutro208Toggle() {
    val current = BiliClient.prefs.v208playlistAutoSkipOutro208
    BiliClient.prefs.v208playlistAutoSkipOutro208 = !current
    AppToast.show(this, "Playlist Auto Skip Outro208: ${if (!current) "ON" else "OFF"}")
}

// v208: Cache Download Speed209
internal fun PlayerActivity.showV208CacheDownloadSpeed209Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208cacheDownloadSpeed209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208cacheDownloadSpeed209 = value
        AppToast.show(this, "Cache Download Speed209: $value")
    }
}

// v208: Progress Bar Thumb Border208
internal fun PlayerActivity.showV208ProgressBarThumbBorder208Toggle() {
    val current = BiliClient.prefs.v208progressBarThumbBorder208
    BiliClient.prefs.v208progressBarThumbBorder208 = !current
    AppToast.show(this, "Progress Bar Thumb Border208: ${if (!current) "ON" else "OFF"}")
}

// v208: Volume Boost Peak208
internal fun PlayerActivity.showV208VolumeBoostPeak208Toggle() {
    val current = BiliClient.prefs.v208volumeBoostPeak208
    BiliClient.prefs.v208volumeBoostPeak208 = !current
    AppToast.show(this, "Volume Boost Peak208: ${if (!current) "ON" else "OFF"}")
}

// v208: History Bookmark Export208
internal fun PlayerActivity.showV208HistoryBookmarkExport208Toggle() {
    val current = BiliClient.prefs.v208historyBookmarkExport208
    BiliClient.prefs.v208historyBookmarkExport208 = !current
    AppToast.show(this, "History Bookmark Export208: ${if (!current) "ON" else "OFF"}")
}

// v208: Playback Chapter Sync208
internal fun PlayerActivity.showV208PlaybackChapterSync208Toggle() {
    val current = BiliClient.prefs.v208playbackChapterSync208
    BiliClient.prefs.v208playbackChapterSync208 = !current
    AppToast.show(this, "Playback Chapter Sync208: ${if (!current) "ON" else "OFF"}")
}

// v208: Screenshot Save Path208
internal fun PlayerActivity.showV208ScreenshotSavePath208Toggle() {
    val current = BiliClient.prefs.v208screenshotSavePath208
    BiliClient.prefs.v208screenshotSavePath208 = !current
    AppToast.show(this, "Screenshot Save Path208: ${if (!current) "ON" else "OFF"}")
}

// v208: Video Color Space208
internal fun PlayerActivity.showV208VideoColorSpace208Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208videoColorSpace208).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space208",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208videoColorSpace208 = value
        AppToast.show(this, "Video Color Space208: $value")
    }
}

// v208: Danmaku Bottom Max Count224
internal fun PlayerActivity.showV208DanmakuBottomMaxCount224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v208danmakuBottomMaxCount224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v208danmakuBottomMaxCount224 = value
        AppToast.show(this, "Danmaku Bottom Max Count224: $value")
    }
}

// v208: Subtitle Bg Border231
internal fun PlayerActivity.showV208SubtitleBgBorder231Toggle() {
    val current = BiliClient.prefs.v208subtitleBgBorder231
    BiliClient.prefs.v208subtitleBgBorder231 = !current
    AppToast.show(this, "Subtitle Bg Border231: ${if (!current) "ON" else "OFF"}")
}

// v209: Audio EQ Custom209
internal fun PlayerActivity.showV209AudioEQCustom209Toggle() {
    val current = BiliClient.prefs.v209audioEQCustom209
    BiliClient.prefs.v209audioEQCustom209 = !current
    AppToast.show(this, "Audio EQ Custom209: ${if (!current) "ON" else "OFF"}")
}

// v209: Danmaku Bottom Max Count225
internal fun PlayerActivity.showV209DanmakuBottomMaxCount225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209danmakuBottomMaxCount225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209danmakuBottomMaxCount225 = value
        AppToast.show(this, "Danmaku Bottom Max Count225: $value")
    }
}

// v209: Subtitle Bg Border232
internal fun PlayerActivity.showV209SubtitleBgBorder232Toggle() {
    val current = BiliClient.prefs.v209subtitleBgBorder232
    BiliClient.prefs.v209subtitleBgBorder232 = !current
    AppToast.show(this, "Subtitle Bg Border232: ${if (!current) "ON" else "OFF"}")
}

// v209: Gesture Shake Action209
internal fun PlayerActivity.showV209GestureShakeAction209Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209gestureShakeAction209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209gestureShakeAction209 = value
        AppToast.show(this, "Gesture Shake Action209: $value")
    }
}

// v209: Cast Audio Volume209
internal fun PlayerActivity.showV209CastAudioVolume209Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v209castAudioVolume209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209castAudioVolume209 = value
        AppToast.show(this, "Cast Audio Volume209: $value")
    }
}

// v209: Playlist Auto Skip Outro209
internal fun PlayerActivity.showV209PlaylistAutoSkipOutro209Toggle() {
    val current = BiliClient.prefs.v209playlistAutoSkipOutro209
    BiliClient.prefs.v209playlistAutoSkipOutro209 = !current
    AppToast.show(this, "Playlist Auto Skip Outro209: ${if (!current) "ON" else "OFF"}")
}

// v209: Cache Download Speed210
internal fun PlayerActivity.showV209CacheDownloadSpeed210Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209cacheDownloadSpeed210).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed210",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209cacheDownloadSpeed210 = value
        AppToast.show(this, "Cache Download Speed210: $value")
    }
}

// v209: Progress Bar Thumb Border209
internal fun PlayerActivity.showV209ProgressBarThumbBorder209Toggle() {
    val current = BiliClient.prefs.v209progressBarThumbBorder209
    BiliClient.prefs.v209progressBarThumbBorder209 = !current
    AppToast.show(this, "Progress Bar Thumb Border209: ${if (!current) "ON" else "OFF"}")
}

// v209: Volume Boost Peak209
internal fun PlayerActivity.showV209VolumeBoostPeak209Toggle() {
    val current = BiliClient.prefs.v209volumeBoostPeak209
    BiliClient.prefs.v209volumeBoostPeak209 = !current
    AppToast.show(this, "Volume Boost Peak209: ${if (!current) "ON" else "OFF"}")
}

// v209: History Bookmark Export209
internal fun PlayerActivity.showV209HistoryBookmarkExport209Toggle() {
    val current = BiliClient.prefs.v209historyBookmarkExport209
    BiliClient.prefs.v209historyBookmarkExport209 = !current
    AppToast.show(this, "History Bookmark Export209: ${if (!current) "ON" else "OFF"}")
}

// v209: Playback Chapter Sync209
internal fun PlayerActivity.showV209PlaybackChapterSync209Toggle() {
    val current = BiliClient.prefs.v209playbackChapterSync209
    BiliClient.prefs.v209playbackChapterSync209 = !current
    AppToast.show(this, "Playback Chapter Sync209: ${if (!current) "ON" else "OFF"}")
}

// v209: Screenshot Save Path209
internal fun PlayerActivity.showV209ScreenshotSavePath209Toggle() {
    val current = BiliClient.prefs.v209screenshotSavePath209
    BiliClient.prefs.v209screenshotSavePath209 = !current
    AppToast.show(this, "Screenshot Save Path209: ${if (!current) "ON" else "OFF"}")
}

// v209: Video Color Space209
internal fun PlayerActivity.showV209VideoColorSpace209Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209videoColorSpace209).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space209",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209videoColorSpace209 = value
        AppToast.show(this, "Video Color Space209: $value")
    }
}

