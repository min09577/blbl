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

internal fun PlayerActivity.showV201ScreenshotSavePath201Toggle() {
    val current = BiliClient.prefs.v201screenshotSavePath201
    BiliClient.prefs.v201screenshotSavePath201 = !current
    AppToast.show(this, "Screenshot Save Path201: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV201SubtitleBgBorder217Toggle() {
    val current = BiliClient.prefs.v201subtitleBgBorder217
    BiliClient.prefs.v201subtitleBgBorder217 = !current
    AppToast.show(this, "Subtitle Bg Border217: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV202AudioEQCustom202Toggle() {
    val current = BiliClient.prefs.v202audioEQCustom202
    BiliClient.prefs.v202audioEQCustom202 = !current
    AppToast.show(this, "Audio EQ Custom202: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV202SubtitleBgBorder218Toggle() {
    val current = BiliClient.prefs.v202subtitleBgBorder218
    BiliClient.prefs.v202subtitleBgBorder218 = !current
    AppToast.show(this, "Subtitle Bg Border218: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV202PlaylistAutoSkipOutro202Toggle() {
    val current = BiliClient.prefs.v202playlistAutoSkipOutro202
    BiliClient.prefs.v202playlistAutoSkipOutro202 = !current
    AppToast.show(this, "Playlist Auto Skip Outro202: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV202ProgressBarThumbBorder202Toggle() {
    val current = BiliClient.prefs.v202progressBarThumbBorder202
    BiliClient.prefs.v202progressBarThumbBorder202 = !current
    AppToast.show(this, "Progress Bar Thumb Border202: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV202VolumeBoostPeak202Toggle() {
    val current = BiliClient.prefs.v202volumeBoostPeak202
    BiliClient.prefs.v202volumeBoostPeak202 = !current
    AppToast.show(this, "Volume Boost Peak202: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV202HistoryBookmarkExport202Toggle() {
    val current = BiliClient.prefs.v202historyBookmarkExport202
    BiliClient.prefs.v202historyBookmarkExport202 = !current
    AppToast.show(this, "History Bookmark Export202: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV202PlaybackChapterSync202Toggle() {
    val current = BiliClient.prefs.v202playbackChapterSync202
    BiliClient.prefs.v202playbackChapterSync202 = !current
    AppToast.show(this, "Playback Chapter Sync202: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV202ScreenshotSavePath202Toggle() {
    val current = BiliClient.prefs.v202screenshotSavePath202
    BiliClient.prefs.v202screenshotSavePath202 = !current
    AppToast.show(this, "Screenshot Save Path202: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV202SubtitleBgBorder219Toggle() {
    val current = BiliClient.prefs.v202subtitleBgBorder219
    BiliClient.prefs.v202subtitleBgBorder219 = !current
    AppToast.show(this, "Subtitle Bg Border219: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV203AudioEQCustom203Toggle() {
    val current = BiliClient.prefs.v203audioEQCustom203
    BiliClient.prefs.v203audioEQCustom203 = !current
    AppToast.show(this, "Audio EQ Custom203: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV203SubtitleBgBorder220Toggle() {
    val current = BiliClient.prefs.v203subtitleBgBorder220
    BiliClient.prefs.v203subtitleBgBorder220 = !current
    AppToast.show(this, "Subtitle Bg Border220: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV203PlaylistAutoSkipOutro203Toggle() {
    val current = BiliClient.prefs.v203playlistAutoSkipOutro203
    BiliClient.prefs.v203playlistAutoSkipOutro203 = !current
    AppToast.show(this, "Playlist Auto Skip Outro203: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV203ProgressBarThumbBorder203Toggle() {
    val current = BiliClient.prefs.v203progressBarThumbBorder203
    BiliClient.prefs.v203progressBarThumbBorder203 = !current
    AppToast.show(this, "Progress Bar Thumb Border203: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV203VolumeBoostPeak203Toggle() {
    val current = BiliClient.prefs.v203volumeBoostPeak203
    BiliClient.prefs.v203volumeBoostPeak203 = !current
    AppToast.show(this, "Volume Boost Peak203: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV203HistoryBookmarkExport203Toggle() {
    val current = BiliClient.prefs.v203historyBookmarkExport203
    BiliClient.prefs.v203historyBookmarkExport203 = !current
    AppToast.show(this, "History Bookmark Export203: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV203PlaybackChapterSync203Toggle() {
    val current = BiliClient.prefs.v203playbackChapterSync203
    BiliClient.prefs.v203playbackChapterSync203 = !current
    AppToast.show(this, "Playback Chapter Sync203: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV203ScreenshotSavePath203Toggle() {
    val current = BiliClient.prefs.v203screenshotSavePath203
    BiliClient.prefs.v203screenshotSavePath203 = !current
    AppToast.show(this, "Screenshot Save Path203: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV203SubtitleBgBorder221Toggle() {
    val current = BiliClient.prefs.v203subtitleBgBorder221
    BiliClient.prefs.v203subtitleBgBorder221 = !current
    AppToast.show(this, "Subtitle Bg Border221: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV204AudioEQCustom204Toggle() {
    val current = BiliClient.prefs.v204audioEQCustom204
    BiliClient.prefs.v204audioEQCustom204 = !current
    AppToast.show(this, "Audio EQ Custom204: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV204SubtitleBgBorder222Toggle() {
    val current = BiliClient.prefs.v204subtitleBgBorder222
    BiliClient.prefs.v204subtitleBgBorder222 = !current
    AppToast.show(this, "Subtitle Bg Border222: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV204PlaylistAutoSkipOutro204Toggle() {
    val current = BiliClient.prefs.v204playlistAutoSkipOutro204
    BiliClient.prefs.v204playlistAutoSkipOutro204 = !current
    AppToast.show(this, "Playlist Auto Skip Outro204: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV204ProgressBarThumbBorder204Toggle() {
    val current = BiliClient.prefs.v204progressBarThumbBorder204
    BiliClient.prefs.v204progressBarThumbBorder204 = !current
    AppToast.show(this, "Progress Bar Thumb Border204: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV204VolumeBoostPeak204Toggle() {
    val current = BiliClient.prefs.v204volumeBoostPeak204
    BiliClient.prefs.v204volumeBoostPeak204 = !current
    AppToast.show(this, "Volume Boost Peak204: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV204HistoryBookmarkExport204Toggle() {
    val current = BiliClient.prefs.v204historyBookmarkExport204
    BiliClient.prefs.v204historyBookmarkExport204 = !current
    AppToast.show(this, "History Bookmark Export204: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV204PlaybackChapterSync204Toggle() {
    val current = BiliClient.prefs.v204playbackChapterSync204
    BiliClient.prefs.v204playbackChapterSync204 = !current
    AppToast.show(this, "Playback Chapter Sync204: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV204ScreenshotSavePath204Toggle() {
    val current = BiliClient.prefs.v204screenshotSavePath204
    BiliClient.prefs.v204screenshotSavePath204 = !current
    AppToast.show(this, "Screenshot Save Path204: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV204SubtitleBgBorder223Toggle() {
    val current = BiliClient.prefs.v204subtitleBgBorder223
    BiliClient.prefs.v204subtitleBgBorder223 = !current
    AppToast.show(this, "Subtitle Bg Border223: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV205AudioEQCustom205Toggle() {
    val current = BiliClient.prefs.v205audioEQCustom205
    BiliClient.prefs.v205audioEQCustom205 = !current
    AppToast.show(this, "Audio EQ Custom205: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV205SubtitleBgBorder224Toggle() {
    val current = BiliClient.prefs.v205subtitleBgBorder224
    BiliClient.prefs.v205subtitleBgBorder224 = !current
    AppToast.show(this, "Subtitle Bg Border224: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV205PlaylistAutoSkipOutro205Toggle() {
    val current = BiliClient.prefs.v205playlistAutoSkipOutro205
    BiliClient.prefs.v205playlistAutoSkipOutro205 = !current
    AppToast.show(this, "Playlist Auto Skip Outro205: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV205ProgressBarThumbBorder205Toggle() {
    val current = BiliClient.prefs.v205progressBarThumbBorder205
    BiliClient.prefs.v205progressBarThumbBorder205 = !current
    AppToast.show(this, "Progress Bar Thumb Border205: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV205VolumeBoostPeak205Toggle() {
    val current = BiliClient.prefs.v205volumeBoostPeak205
    BiliClient.prefs.v205volumeBoostPeak205 = !current
    AppToast.show(this, "Volume Boost Peak205: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV205HistoryBookmarkExport205Toggle() {
    val current = BiliClient.prefs.v205historyBookmarkExport205
    BiliClient.prefs.v205historyBookmarkExport205 = !current
    AppToast.show(this, "History Bookmark Export205: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV205PlaybackChapterSync205Toggle() {
    val current = BiliClient.prefs.v205playbackChapterSync205
    BiliClient.prefs.v205playbackChapterSync205 = !current
    AppToast.show(this, "Playback Chapter Sync205: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV205ScreenshotSavePath205Toggle() {
    val current = BiliClient.prefs.v205screenshotSavePath205
    BiliClient.prefs.v205screenshotSavePath205 = !current
    AppToast.show(this, "Screenshot Save Path205: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV205SubtitleBgBorder225Toggle() {
    val current = BiliClient.prefs.v205subtitleBgBorder225
    BiliClient.prefs.v205subtitleBgBorder225 = !current
    AppToast.show(this, "Subtitle Bg Border225: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV206AudioEQCustom206Toggle() {
    val current = BiliClient.prefs.v206audioEQCustom206
    BiliClient.prefs.v206audioEQCustom206 = !current
    AppToast.show(this, "Audio EQ Custom206: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV206SubtitleBgBorder226Toggle() {
    val current = BiliClient.prefs.v206subtitleBgBorder226
    BiliClient.prefs.v206subtitleBgBorder226 = !current
    AppToast.show(this, "Subtitle Bg Border226: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV206PlaylistAutoSkipOutro206Toggle() {
    val current = BiliClient.prefs.v206playlistAutoSkipOutro206
    BiliClient.prefs.v206playlistAutoSkipOutro206 = !current
    AppToast.show(this, "Playlist Auto Skip Outro206: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV206ProgressBarThumbBorder206Toggle() {
    val current = BiliClient.prefs.v206progressBarThumbBorder206
    BiliClient.prefs.v206progressBarThumbBorder206 = !current
    AppToast.show(this, "Progress Bar Thumb Border206: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV206VolumeBoostPeak206Toggle() {
    val current = BiliClient.prefs.v206volumeBoostPeak206
    BiliClient.prefs.v206volumeBoostPeak206 = !current
    AppToast.show(this, "Volume Boost Peak206: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV206HistoryBookmarkExport206Toggle() {
    val current = BiliClient.prefs.v206historyBookmarkExport206
    BiliClient.prefs.v206historyBookmarkExport206 = !current
    AppToast.show(this, "History Bookmark Export206: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV206PlaybackChapterSync206Toggle() {
    val current = BiliClient.prefs.v206playbackChapterSync206
    BiliClient.prefs.v206playbackChapterSync206 = !current
    AppToast.show(this, "Playback Chapter Sync206: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV206ScreenshotSavePath206Toggle() {
    val current = BiliClient.prefs.v206screenshotSavePath206
    BiliClient.prefs.v206screenshotSavePath206 = !current
    AppToast.show(this, "Screenshot Save Path206: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV206SubtitleBgBorder227Toggle() {
    val current = BiliClient.prefs.v206subtitleBgBorder227
    BiliClient.prefs.v206subtitleBgBorder227 = !current
    AppToast.show(this, "Subtitle Bg Border227: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV207AudioEQCustom207Toggle() {
    val current = BiliClient.prefs.v207audioEQCustom207
    BiliClient.prefs.v207audioEQCustom207 = !current
    AppToast.show(this, "Audio EQ Custom207: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV207SubtitleBgBorder228Toggle() {
    val current = BiliClient.prefs.v207subtitleBgBorder228
    BiliClient.prefs.v207subtitleBgBorder228 = !current
    AppToast.show(this, "Subtitle Bg Border228: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV207PlaylistAutoSkipOutro207Toggle() {
    val current = BiliClient.prefs.v207playlistAutoSkipOutro207
    BiliClient.prefs.v207playlistAutoSkipOutro207 = !current
    AppToast.show(this, "Playlist Auto Skip Outro207: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV207ProgressBarThumbBorder207Toggle() {
    val current = BiliClient.prefs.v207progressBarThumbBorder207
    BiliClient.prefs.v207progressBarThumbBorder207 = !current
    AppToast.show(this, "Progress Bar Thumb Border207: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV207VolumeBoostPeak207Toggle() {
    val current = BiliClient.prefs.v207volumeBoostPeak207
    BiliClient.prefs.v207volumeBoostPeak207 = !current
    AppToast.show(this, "Volume Boost Peak207: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV207HistoryBookmarkExport207Toggle() {
    val current = BiliClient.prefs.v207historyBookmarkExport207
    BiliClient.prefs.v207historyBookmarkExport207 = !current
    AppToast.show(this, "History Bookmark Export207: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV207PlaybackChapterSync207Toggle() {
    val current = BiliClient.prefs.v207playbackChapterSync207
    BiliClient.prefs.v207playbackChapterSync207 = !current
    AppToast.show(this, "Playback Chapter Sync207: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV207ScreenshotSavePath207Toggle() {
    val current = BiliClient.prefs.v207screenshotSavePath207
    BiliClient.prefs.v207screenshotSavePath207 = !current
    AppToast.show(this, "Screenshot Save Path207: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV207SubtitleBgBorder229Toggle() {
    val current = BiliClient.prefs.v207subtitleBgBorder229
    BiliClient.prefs.v207subtitleBgBorder229 = !current
    AppToast.show(this, "Subtitle Bg Border229: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV208AudioEQCustom208Toggle() {
    val current = BiliClient.prefs.v208audioEQCustom208
    BiliClient.prefs.v208audioEQCustom208 = !current
    AppToast.show(this, "Audio EQ Custom208: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV208SubtitleBgBorder230Toggle() {
    val current = BiliClient.prefs.v208subtitleBgBorder230
    BiliClient.prefs.v208subtitleBgBorder230 = !current
    AppToast.show(this, "Subtitle Bg Border230: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV208PlaylistAutoSkipOutro208Toggle() {
    val current = BiliClient.prefs.v208playlistAutoSkipOutro208
    BiliClient.prefs.v208playlistAutoSkipOutro208 = !current
    AppToast.show(this, "Playlist Auto Skip Outro208: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV208ProgressBarThumbBorder208Toggle() {
    val current = BiliClient.prefs.v208progressBarThumbBorder208
    BiliClient.prefs.v208progressBarThumbBorder208 = !current
    AppToast.show(this, "Progress Bar Thumb Border208: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV208VolumeBoostPeak208Toggle() {
    val current = BiliClient.prefs.v208volumeBoostPeak208
    BiliClient.prefs.v208volumeBoostPeak208 = !current
    AppToast.show(this, "Volume Boost Peak208: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV208HistoryBookmarkExport208Toggle() {
    val current = BiliClient.prefs.v208historyBookmarkExport208
    BiliClient.prefs.v208historyBookmarkExport208 = !current
    AppToast.show(this, "History Bookmark Export208: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV208PlaybackChapterSync208Toggle() {
    val current = BiliClient.prefs.v208playbackChapterSync208
    BiliClient.prefs.v208playbackChapterSync208 = !current
    AppToast.show(this, "Playback Chapter Sync208: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV208ScreenshotSavePath208Toggle() {
    val current = BiliClient.prefs.v208screenshotSavePath208
    BiliClient.prefs.v208screenshotSavePath208 = !current
    AppToast.show(this, "Screenshot Save Path208: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV208SubtitleBgBorder231Toggle() {
    val current = BiliClient.prefs.v208subtitleBgBorder231
    BiliClient.prefs.v208subtitleBgBorder231 = !current
    AppToast.show(this, "Subtitle Bg Border231: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV209AudioEQCustom209Toggle() {
    val current = BiliClient.prefs.v209audioEQCustom209
    BiliClient.prefs.v209audioEQCustom209 = !current
    AppToast.show(this, "Audio EQ Custom209: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV209SubtitleBgBorder232Toggle() {
    val current = BiliClient.prefs.v209subtitleBgBorder232
    BiliClient.prefs.v209subtitleBgBorder232 = !current
    AppToast.show(this, "Subtitle Bg Border232: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV209PlaylistAutoSkipOutro209Toggle() {
    val current = BiliClient.prefs.v209playlistAutoSkipOutro209
    BiliClient.prefs.v209playlistAutoSkipOutro209 = !current
    AppToast.show(this, "Playlist Auto Skip Outro209: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV209ProgressBarThumbBorder209Toggle() {
    val current = BiliClient.prefs.v209progressBarThumbBorder209
    BiliClient.prefs.v209progressBarThumbBorder209 = !current
    AppToast.show(this, "Progress Bar Thumb Border209: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV209VolumeBoostPeak209Toggle() {
    val current = BiliClient.prefs.v209volumeBoostPeak209
    BiliClient.prefs.v209volumeBoostPeak209 = !current
    AppToast.show(this, "Volume Boost Peak209: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV209HistoryBookmarkExport209Toggle() {
    val current = BiliClient.prefs.v209historyBookmarkExport209
    BiliClient.prefs.v209historyBookmarkExport209 = !current
    AppToast.show(this, "History Bookmark Export209: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV209PlaybackChapterSync209Toggle() {
    val current = BiliClient.prefs.v209playbackChapterSync209
    BiliClient.prefs.v209playbackChapterSync209 = !current
    AppToast.show(this, "Playback Chapter Sync209: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV209ScreenshotSavePath209Toggle() {
    val current = BiliClient.prefs.v209screenshotSavePath209
    BiliClient.prefs.v209screenshotSavePath209 = !current
    AppToast.show(this, "Screenshot Save Path209: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV209DanmakuBottomMaxCount226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v209danmakuBottomMaxCount226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v209danmakuBottomMaxCount226 = value
        AppToast.show(this, "Danmaku Bottom Max Count226: $value")
    }
}

internal fun PlayerActivity.showV209SubtitleBgBorder233Toggle() {
    val current = BiliClient.prefs.v209subtitleBgBorder233
    BiliClient.prefs.v209subtitleBgBorder233 = !current
    AppToast.show(this, "Subtitle Bg Border233: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV210AudioEQCustom210Toggle() {
    val current = BiliClient.prefs.v210audioEQCustom210
    BiliClient.prefs.v210audioEQCustom210 = !current
    AppToast.show(this, "Audio EQ Custom210: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV210DanmakuBottomMaxCount227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v210danmakuBottomMaxCount227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v210danmakuBottomMaxCount227 = value
        AppToast.show(this, "Danmaku Bottom Max Count227: $value")
    }
}

internal fun PlayerActivity.showV210SubtitleBgBorder234Toggle() {
    val current = BiliClient.prefs.v210subtitleBgBorder234
    BiliClient.prefs.v210subtitleBgBorder234 = !current
    AppToast.show(this, "Subtitle Bg Border234: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV210GestureShakeAction210Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v210gestureShakeAction210).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action210",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v210gestureShakeAction210 = value
        AppToast.show(this, "Gesture Shake Action210: $value")
    }
}

internal fun PlayerActivity.showV210CastAudioVolume210Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v210castAudioVolume210).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume210",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v210castAudioVolume210 = value
        AppToast.show(this, "Cast Audio Volume210: $value")
    }
}

internal fun PlayerActivity.showV210PlaylistAutoSkipOutro210Toggle() {
    val current = BiliClient.prefs.v210playlistAutoSkipOutro210
    BiliClient.prefs.v210playlistAutoSkipOutro210 = !current
    AppToast.show(this, "Playlist Auto Skip Outro210: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV210CacheDownloadSpeed211Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v210cacheDownloadSpeed211).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed211",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v210cacheDownloadSpeed211 = value
        AppToast.show(this, "Cache Download Speed211: $value")
    }
}

internal fun PlayerActivity.showV210ProgressBarThumbBorder210Toggle() {
    val current = BiliClient.prefs.v210progressBarThumbBorder210
    BiliClient.prefs.v210progressBarThumbBorder210 = !current
    AppToast.show(this, "Progress Bar Thumb Border210: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV210VolumeBoostPeak210Toggle() {
    val current = BiliClient.prefs.v210volumeBoostPeak210
    BiliClient.prefs.v210volumeBoostPeak210 = !current
    AppToast.show(this, "Volume Boost Peak210: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV210HistoryBookmarkExport210Toggle() {
    val current = BiliClient.prefs.v210historyBookmarkExport210
    BiliClient.prefs.v210historyBookmarkExport210 = !current
    AppToast.show(this, "History Bookmark Export210: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV210PlaybackChapterSync210Toggle() {
    val current = BiliClient.prefs.v210playbackChapterSync210
    BiliClient.prefs.v210playbackChapterSync210 = !current
    AppToast.show(this, "Playback Chapter Sync210: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV210ScreenshotSavePath210Toggle() {
    val current = BiliClient.prefs.v210screenshotSavePath210
    BiliClient.prefs.v210screenshotSavePath210 = !current
    AppToast.show(this, "Screenshot Save Path210: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV210VideoColorSpace210Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v210videoColorSpace210).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space210",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v210videoColorSpace210 = value
        AppToast.show(this, "Video Color Space210: $value")
    }
}

internal fun PlayerActivity.showV210DanmakuBottomMaxCount228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v210danmakuBottomMaxCount228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v210danmakuBottomMaxCount228 = value
        AppToast.show(this, "Danmaku Bottom Max Count228: $value")
    }
}

internal fun PlayerActivity.showV210SubtitleBgBorder235Toggle() {
    val current = BiliClient.prefs.v210subtitleBgBorder235
    BiliClient.prefs.v210subtitleBgBorder235 = !current
    AppToast.show(this, "Subtitle Bg Border235: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV211AudioEQCustom211Toggle() {
    val current = BiliClient.prefs.v211audioEQCustom211
    BiliClient.prefs.v211audioEQCustom211 = !current
    AppToast.show(this, "Audio EQ Custom211: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV211DanmakuBottomMaxCount229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v211danmakuBottomMaxCount229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v211danmakuBottomMaxCount229 = value
        AppToast.show(this, "Danmaku Bottom Max Count229: $value")
    }
}

internal fun PlayerActivity.showV211SubtitleBgBorder236Toggle() {
    val current = BiliClient.prefs.v211subtitleBgBorder236
    BiliClient.prefs.v211subtitleBgBorder236 = !current
    AppToast.show(this, "Subtitle Bg Border236: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV211GestureShakeAction211Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v211gestureShakeAction211).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action211",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v211gestureShakeAction211 = value
        AppToast.show(this, "Gesture Shake Action211: $value")
    }
}

internal fun PlayerActivity.showV211CastAudioVolume211Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v211castAudioVolume211).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume211",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v211castAudioVolume211 = value
        AppToast.show(this, "Cast Audio Volume211: $value")
    }
}

internal fun PlayerActivity.showV211PlaylistAutoSkipOutro211Toggle() {
    val current = BiliClient.prefs.v211playlistAutoSkipOutro211
    BiliClient.prefs.v211playlistAutoSkipOutro211 = !current
    AppToast.show(this, "Playlist Auto Skip Outro211: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV211CacheDownloadSpeed212Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v211cacheDownloadSpeed212).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed212",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v211cacheDownloadSpeed212 = value
        AppToast.show(this, "Cache Download Speed212: $value")
    }
}

internal fun PlayerActivity.showV211ProgressBarThumbBorder211Toggle() {
    val current = BiliClient.prefs.v211progressBarThumbBorder211
    BiliClient.prefs.v211progressBarThumbBorder211 = !current
    AppToast.show(this, "Progress Bar Thumb Border211: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV211VolumeBoostPeak211Toggle() {
    val current = BiliClient.prefs.v211volumeBoostPeak211
    BiliClient.prefs.v211volumeBoostPeak211 = !current
    AppToast.show(this, "Volume Boost Peak211: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV211HistoryBookmarkExport211Toggle() {
    val current = BiliClient.prefs.v211historyBookmarkExport211
    BiliClient.prefs.v211historyBookmarkExport211 = !current
    AppToast.show(this, "History Bookmark Export211: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV211PlaybackChapterSync211Toggle() {
    val current = BiliClient.prefs.v211playbackChapterSync211
    BiliClient.prefs.v211playbackChapterSync211 = !current
    AppToast.show(this, "Playback Chapter Sync211: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV211ScreenshotSavePath211Toggle() {
    val current = BiliClient.prefs.v211screenshotSavePath211
    BiliClient.prefs.v211screenshotSavePath211 = !current
    AppToast.show(this, "Screenshot Save Path211: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV211VideoColorSpace211Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v211videoColorSpace211).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space211",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v211videoColorSpace211 = value
        AppToast.show(this, "Video Color Space211: $value")
    }
}

internal fun PlayerActivity.showV211DanmakuBottomMaxCount230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v211danmakuBottomMaxCount230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v211danmakuBottomMaxCount230 = value
        AppToast.show(this, "Danmaku Bottom Max Count230: $value")
    }
}

internal fun PlayerActivity.showV211SubtitleBgBorder237Toggle() {
    val current = BiliClient.prefs.v211subtitleBgBorder237
    BiliClient.prefs.v211subtitleBgBorder237 = !current
    AppToast.show(this, "Subtitle Bg Border237: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV212AudioEQCustom212Toggle() {
    val current = BiliClient.prefs.v212audioEQCustom212
    BiliClient.prefs.v212audioEQCustom212 = !current
    AppToast.show(this, "Audio EQ Custom212: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV212DanmakuBottomMaxCount231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v212danmakuBottomMaxCount231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v212danmakuBottomMaxCount231 = value
        AppToast.show(this, "Danmaku Bottom Max Count231: $value")
    }
}

internal fun PlayerActivity.showV212SubtitleBgBorder238Toggle() {
    val current = BiliClient.prefs.v212subtitleBgBorder238
    BiliClient.prefs.v212subtitleBgBorder238 = !current
    AppToast.show(this, "Subtitle Bg Border238: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV212GestureShakeAction212Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v212gestureShakeAction212).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action212",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v212gestureShakeAction212 = value
        AppToast.show(this, "Gesture Shake Action212: $value")
    }
}

internal fun PlayerActivity.showV212CastAudioVolume212Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v212castAudioVolume212).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume212",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v212castAudioVolume212 = value
        AppToast.show(this, "Cast Audio Volume212: $value")
    }
}

internal fun PlayerActivity.showV212PlaylistAutoSkipOutro212Toggle() {
    val current = BiliClient.prefs.v212playlistAutoSkipOutro212
    BiliClient.prefs.v212playlistAutoSkipOutro212 = !current
    AppToast.show(this, "Playlist Auto Skip Outro212: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV212CacheDownloadSpeed213Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v212cacheDownloadSpeed213).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed213",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v212cacheDownloadSpeed213 = value
        AppToast.show(this, "Cache Download Speed213: $value")
    }
}

internal fun PlayerActivity.showV212ProgressBarThumbBorder212Toggle() {
    val current = BiliClient.prefs.v212progressBarThumbBorder212
    BiliClient.prefs.v212progressBarThumbBorder212 = !current
    AppToast.show(this, "Progress Bar Thumb Border212: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV212VolumeBoostPeak212Toggle() {
    val current = BiliClient.prefs.v212volumeBoostPeak212
    BiliClient.prefs.v212volumeBoostPeak212 = !current
    AppToast.show(this, "Volume Boost Peak212: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV212HistoryBookmarkExport212Toggle() {
    val current = BiliClient.prefs.v212historyBookmarkExport212
    BiliClient.prefs.v212historyBookmarkExport212 = !current
    AppToast.show(this, "History Bookmark Export212: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV212PlaybackChapterSync212Toggle() {
    val current = BiliClient.prefs.v212playbackChapterSync212
    BiliClient.prefs.v212playbackChapterSync212 = !current
    AppToast.show(this, "Playback Chapter Sync212: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV212ScreenshotSavePath212Toggle() {
    val current = BiliClient.prefs.v212screenshotSavePath212
    BiliClient.prefs.v212screenshotSavePath212 = !current
    AppToast.show(this, "Screenshot Save Path212: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV212VideoColorSpace212Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v212videoColorSpace212).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space212",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v212videoColorSpace212 = value
        AppToast.show(this, "Video Color Space212: $value")
    }
}

internal fun PlayerActivity.showV212DanmakuBottomMaxCount232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v212danmakuBottomMaxCount232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v212danmakuBottomMaxCount232 = value
        AppToast.show(this, "Danmaku Bottom Max Count232: $value")
    }
}

internal fun PlayerActivity.showV212SubtitleBgBorder239Toggle() {
    val current = BiliClient.prefs.v212subtitleBgBorder239
    BiliClient.prefs.v212subtitleBgBorder239 = !current
    AppToast.show(this, "Subtitle Bg Border239: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV213AudioEQCustom213Toggle() {
    val current = BiliClient.prefs.v213audioEQCustom213
    BiliClient.prefs.v213audioEQCustom213 = !current
    AppToast.show(this, "Audio EQ Custom213: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV213DanmakuBottomMaxCount233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v213danmakuBottomMaxCount233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v213danmakuBottomMaxCount233 = value
        AppToast.show(this, "Danmaku Bottom Max Count233: $value")
    }
}

internal fun PlayerActivity.showV213SubtitleBgBorder240Toggle() {
    val current = BiliClient.prefs.v213subtitleBgBorder240
    BiliClient.prefs.v213subtitleBgBorder240 = !current
    AppToast.show(this, "Subtitle Bg Border240: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV213GestureShakeAction213Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v213gestureShakeAction213).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action213",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v213gestureShakeAction213 = value
        AppToast.show(this, "Gesture Shake Action213: $value")
    }
}

internal fun PlayerActivity.showV213CastAudioVolume213Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v213castAudioVolume213).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume213",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v213castAudioVolume213 = value
        AppToast.show(this, "Cast Audio Volume213: $value")
    }
}

internal fun PlayerActivity.showV213PlaylistAutoSkipOutro213Toggle() {
    val current = BiliClient.prefs.v213playlistAutoSkipOutro213
    BiliClient.prefs.v213playlistAutoSkipOutro213 = !current
    AppToast.show(this, "Playlist Auto Skip Outro213: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV213CacheDownloadSpeed214Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v213cacheDownloadSpeed214).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed214",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v213cacheDownloadSpeed214 = value
        AppToast.show(this, "Cache Download Speed214: $value")
    }
}

internal fun PlayerActivity.showV213ProgressBarThumbBorder213Toggle() {
    val current = BiliClient.prefs.v213progressBarThumbBorder213
    BiliClient.prefs.v213progressBarThumbBorder213 = !current
    AppToast.show(this, "Progress Bar Thumb Border213: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV213VolumeBoostPeak213Toggle() {
    val current = BiliClient.prefs.v213volumeBoostPeak213
    BiliClient.prefs.v213volumeBoostPeak213 = !current
    AppToast.show(this, "Volume Boost Peak213: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV213HistoryBookmarkExport213Toggle() {
    val current = BiliClient.prefs.v213historyBookmarkExport213
    BiliClient.prefs.v213historyBookmarkExport213 = !current
    AppToast.show(this, "History Bookmark Export213: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV213PlaybackChapterSync213Toggle() {
    val current = BiliClient.prefs.v213playbackChapterSync213
    BiliClient.prefs.v213playbackChapterSync213 = !current
    AppToast.show(this, "Playback Chapter Sync213: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV213ScreenshotSavePath213Toggle() {
    val current = BiliClient.prefs.v213screenshotSavePath213
    BiliClient.prefs.v213screenshotSavePath213 = !current
    AppToast.show(this, "Screenshot Save Path213: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV213VideoColorSpace213Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v213videoColorSpace213).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space213",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v213videoColorSpace213 = value
        AppToast.show(this, "Video Color Space213: $value")
    }
}

internal fun PlayerActivity.showV213DanmakuBottomMaxCount234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v213danmakuBottomMaxCount234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v213danmakuBottomMaxCount234 = value
        AppToast.show(this, "Danmaku Bottom Max Count234: $value")
    }
}

internal fun PlayerActivity.showV213SubtitleBgBorder241Toggle() {
    val current = BiliClient.prefs.v213subtitleBgBorder241
    BiliClient.prefs.v213subtitleBgBorder241 = !current
    AppToast.show(this, "Subtitle Bg Border241: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV214AudioEQCustom214Toggle() {
    val current = BiliClient.prefs.v214audioEQCustom214
    BiliClient.prefs.v214audioEQCustom214 = !current
    AppToast.show(this, "Audio EQ Custom214: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV214DanmakuBottomMaxCount235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v214danmakuBottomMaxCount235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v214danmakuBottomMaxCount235 = value
        AppToast.show(this, "Danmaku Bottom Max Count235: $value")
    }
}

internal fun PlayerActivity.showV214SubtitleBgBorder242Toggle() {
    val current = BiliClient.prefs.v214subtitleBgBorder242
    BiliClient.prefs.v214subtitleBgBorder242 = !current
    AppToast.show(this, "Subtitle Bg Border242: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV214GestureShakeAction214Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v214gestureShakeAction214).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action214",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v214gestureShakeAction214 = value
        AppToast.show(this, "Gesture Shake Action214: $value")
    }
}

internal fun PlayerActivity.showV214CastAudioVolume214Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v214castAudioVolume214).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume214",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v214castAudioVolume214 = value
        AppToast.show(this, "Cast Audio Volume214: $value")
    }
}

internal fun PlayerActivity.showV214PlaylistAutoSkipOutro214Toggle() {
    val current = BiliClient.prefs.v214playlistAutoSkipOutro214
    BiliClient.prefs.v214playlistAutoSkipOutro214 = !current
    AppToast.show(this, "Playlist Auto Skip Outro214: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV214CacheDownloadSpeed215Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v214cacheDownloadSpeed215).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed215",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v214cacheDownloadSpeed215 = value
        AppToast.show(this, "Cache Download Speed215: $value")
    }
}

internal fun PlayerActivity.showV214ProgressBarThumbBorder214Toggle() {
    val current = BiliClient.prefs.v214progressBarThumbBorder214
    BiliClient.prefs.v214progressBarThumbBorder214 = !current
    AppToast.show(this, "Progress Bar Thumb Border214: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV214VolumeBoostPeak214Toggle() {
    val current = BiliClient.prefs.v214volumeBoostPeak214
    BiliClient.prefs.v214volumeBoostPeak214 = !current
    AppToast.show(this, "Volume Boost Peak214: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV214HistoryBookmarkExport214Toggle() {
    val current = BiliClient.prefs.v214historyBookmarkExport214
    BiliClient.prefs.v214historyBookmarkExport214 = !current
    AppToast.show(this, "History Bookmark Export214: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV214PlaybackChapterSync214Toggle() {
    val current = BiliClient.prefs.v214playbackChapterSync214
    BiliClient.prefs.v214playbackChapterSync214 = !current
    AppToast.show(this, "Playback Chapter Sync214: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV214ScreenshotSavePath214Toggle() {
    val current = BiliClient.prefs.v214screenshotSavePath214
    BiliClient.prefs.v214screenshotSavePath214 = !current
    AppToast.show(this, "Screenshot Save Path214: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV214VideoColorSpace214Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v214videoColorSpace214).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space214",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v214videoColorSpace214 = value
        AppToast.show(this, "Video Color Space214: $value")
    }
}

internal fun PlayerActivity.showV214DanmakuBottomMaxCount236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v214danmakuBottomMaxCount236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v214danmakuBottomMaxCount236 = value
        AppToast.show(this, "Danmaku Bottom Max Count236: $value")
    }
}

internal fun PlayerActivity.showV214SubtitleBgBorder243Toggle() {
    val current = BiliClient.prefs.v214subtitleBgBorder243
    BiliClient.prefs.v214subtitleBgBorder243 = !current
    AppToast.show(this, "Subtitle Bg Border243: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV215AudioEQCustom215Toggle() {
    val current = BiliClient.prefs.v215audioEQCustom215
    BiliClient.prefs.v215audioEQCustom215 = !current
    AppToast.show(this, "Audio EQ Custom215: ${if (!current) "ON" else "OFF"}")
}

