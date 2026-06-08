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

internal fun PlayerActivity.showV215DanmakuBottomMaxCount237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v215danmakuBottomMaxCount237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v215danmakuBottomMaxCount237 = value
        AppToast.show(this, "Danmaku Bottom Max Count237: $value")
    }
}

internal fun PlayerActivity.showV215SubtitleBgBorder244Toggle() {
    val current = BiliClient.prefs.v215subtitleBgBorder244
    BiliClient.prefs.v215subtitleBgBorder244 = !current
    AppToast.show(this, "Subtitle Bg Border244: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV215GestureShakeAction215Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v215gestureShakeAction215).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action215",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v215gestureShakeAction215 = value
        AppToast.show(this, "Gesture Shake Action215: $value")
    }
}

internal fun PlayerActivity.showV215CastAudioVolume215Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v215castAudioVolume215).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume215",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v215castAudioVolume215 = value
        AppToast.show(this, "Cast Audio Volume215: $value")
    }
}

internal fun PlayerActivity.showV215PlaylistAutoSkipOutro215Toggle() {
    val current = BiliClient.prefs.v215playlistAutoSkipOutro215
    BiliClient.prefs.v215playlistAutoSkipOutro215 = !current
    AppToast.show(this, "Playlist Auto Skip Outro215: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV215CacheDownloadSpeed216Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v215cacheDownloadSpeed216).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed216",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v215cacheDownloadSpeed216 = value
        AppToast.show(this, "Cache Download Speed216: $value")
    }
}

internal fun PlayerActivity.showV215ProgressBarThumbBorder215Toggle() {
    val current = BiliClient.prefs.v215progressBarThumbBorder215
    BiliClient.prefs.v215progressBarThumbBorder215 = !current
    AppToast.show(this, "Progress Bar Thumb Border215: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV215VolumeBoostPeak215Toggle() {
    val current = BiliClient.prefs.v215volumeBoostPeak215
    BiliClient.prefs.v215volumeBoostPeak215 = !current
    AppToast.show(this, "Volume Boost Peak215: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV215HistoryBookmarkExport215Toggle() {
    val current = BiliClient.prefs.v215historyBookmarkExport215
    BiliClient.prefs.v215historyBookmarkExport215 = !current
    AppToast.show(this, "History Bookmark Export215: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV215PlaybackChapterSync215Toggle() {
    val current = BiliClient.prefs.v215playbackChapterSync215
    BiliClient.prefs.v215playbackChapterSync215 = !current
    AppToast.show(this, "Playback Chapter Sync215: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV215ScreenshotSavePath215Toggle() {
    val current = BiliClient.prefs.v215screenshotSavePath215
    BiliClient.prefs.v215screenshotSavePath215 = !current
    AppToast.show(this, "Screenshot Save Path215: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV215VideoColorSpace215Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v215videoColorSpace215).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space215",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v215videoColorSpace215 = value
        AppToast.show(this, "Video Color Space215: $value")
    }
}

internal fun PlayerActivity.showV215DanmakuBottomMaxCount238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v215danmakuBottomMaxCount238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v215danmakuBottomMaxCount238 = value
        AppToast.show(this, "Danmaku Bottom Max Count238: $value")
    }
}

internal fun PlayerActivity.showV215SubtitleBgBorder245Toggle() {
    val current = BiliClient.prefs.v215subtitleBgBorder245
    BiliClient.prefs.v215subtitleBgBorder245 = !current
    AppToast.show(this, "Subtitle Bg Border245: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV216AudioEQCustom216Toggle() {
    val current = BiliClient.prefs.v216audioEQCustom216
    BiliClient.prefs.v216audioEQCustom216 = !current
    AppToast.show(this, "Audio EQ Custom216: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV216DanmakuBottomMaxCount239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v216danmakuBottomMaxCount239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v216danmakuBottomMaxCount239 = value
        AppToast.show(this, "Danmaku Bottom Max Count239: $value")
    }
}

internal fun PlayerActivity.showV216SubtitleBgBorder246Toggle() {
    val current = BiliClient.prefs.v216subtitleBgBorder246
    BiliClient.prefs.v216subtitleBgBorder246 = !current
    AppToast.show(this, "Subtitle Bg Border246: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV216GestureShakeAction216Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v216gestureShakeAction216).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action216",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v216gestureShakeAction216 = value
        AppToast.show(this, "Gesture Shake Action216: $value")
    }
}

internal fun PlayerActivity.showV216CastAudioVolume216Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v216castAudioVolume216).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume216",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v216castAudioVolume216 = value
        AppToast.show(this, "Cast Audio Volume216: $value")
    }
}

internal fun PlayerActivity.showV216PlaylistAutoSkipOutro216Toggle() {
    val current = BiliClient.prefs.v216playlistAutoSkipOutro216
    BiliClient.prefs.v216playlistAutoSkipOutro216 = !current
    AppToast.show(this, "Playlist Auto Skip Outro216: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV216CacheDownloadSpeed217Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v216cacheDownloadSpeed217).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed217",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v216cacheDownloadSpeed217 = value
        AppToast.show(this, "Cache Download Speed217: $value")
    }
}

internal fun PlayerActivity.showV216ProgressBarThumbBorder216Toggle() {
    val current = BiliClient.prefs.v216progressBarThumbBorder216
    BiliClient.prefs.v216progressBarThumbBorder216 = !current
    AppToast.show(this, "Progress Bar Thumb Border216: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV216VolumeBoostPeak216Toggle() {
    val current = BiliClient.prefs.v216volumeBoostPeak216
    BiliClient.prefs.v216volumeBoostPeak216 = !current
    AppToast.show(this, "Volume Boost Peak216: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV216HistoryBookmarkExport216Toggle() {
    val current = BiliClient.prefs.v216historyBookmarkExport216
    BiliClient.prefs.v216historyBookmarkExport216 = !current
    AppToast.show(this, "History Bookmark Export216: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV216PlaybackChapterSync216Toggle() {
    val current = BiliClient.prefs.v216playbackChapterSync216
    BiliClient.prefs.v216playbackChapterSync216 = !current
    AppToast.show(this, "Playback Chapter Sync216: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV216ScreenshotSavePath216Toggle() {
    val current = BiliClient.prefs.v216screenshotSavePath216
    BiliClient.prefs.v216screenshotSavePath216 = !current
    AppToast.show(this, "Screenshot Save Path216: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV216VideoColorSpace216Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v216videoColorSpace216).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space216",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v216videoColorSpace216 = value
        AppToast.show(this, "Video Color Space216: $value")
    }
}

internal fun PlayerActivity.showV216DanmakuBottomMaxCount240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v216danmakuBottomMaxCount240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v216danmakuBottomMaxCount240 = value
        AppToast.show(this, "Danmaku Bottom Max Count240: $value")
    }
}

internal fun PlayerActivity.showV216SubtitleBgBorder247Toggle() {
    val current = BiliClient.prefs.v216subtitleBgBorder247
    BiliClient.prefs.v216subtitleBgBorder247 = !current
    AppToast.show(this, "Subtitle Bg Border247: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV217AudioEQCustom217Toggle() {
    val current = BiliClient.prefs.v217audioEQCustom217
    BiliClient.prefs.v217audioEQCustom217 = !current
    AppToast.show(this, "Audio EQ Custom217: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV217DanmakuBottomMaxCount241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v217danmakuBottomMaxCount241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v217danmakuBottomMaxCount241 = value
        AppToast.show(this, "Danmaku Bottom Max Count241: $value")
    }
}

internal fun PlayerActivity.showV217SubtitleBgBorder248Toggle() {
    val current = BiliClient.prefs.v217subtitleBgBorder248
    BiliClient.prefs.v217subtitleBgBorder248 = !current
    AppToast.show(this, "Subtitle Bg Border248: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV217GestureShakeAction217Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v217gestureShakeAction217).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action217",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v217gestureShakeAction217 = value
        AppToast.show(this, "Gesture Shake Action217: $value")
    }
}

internal fun PlayerActivity.showV217CastAudioVolume217Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v217castAudioVolume217).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume217",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v217castAudioVolume217 = value
        AppToast.show(this, "Cast Audio Volume217: $value")
    }
}

internal fun PlayerActivity.showV217PlaylistAutoSkipOutro217Toggle() {
    val current = BiliClient.prefs.v217playlistAutoSkipOutro217
    BiliClient.prefs.v217playlistAutoSkipOutro217 = !current
    AppToast.show(this, "Playlist Auto Skip Outro217: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV217CacheDownloadSpeed218Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v217cacheDownloadSpeed218).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed218",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v217cacheDownloadSpeed218 = value
        AppToast.show(this, "Cache Download Speed218: $value")
    }
}

internal fun PlayerActivity.showV217ProgressBarThumbBorder217Toggle() {
    val current = BiliClient.prefs.v217progressBarThumbBorder217
    BiliClient.prefs.v217progressBarThumbBorder217 = !current
    AppToast.show(this, "Progress Bar Thumb Border217: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV217VolumeBoostPeak217Toggle() {
    val current = BiliClient.prefs.v217volumeBoostPeak217
    BiliClient.prefs.v217volumeBoostPeak217 = !current
    AppToast.show(this, "Volume Boost Peak217: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV217HistoryBookmarkExport217Toggle() {
    val current = BiliClient.prefs.v217historyBookmarkExport217
    BiliClient.prefs.v217historyBookmarkExport217 = !current
    AppToast.show(this, "History Bookmark Export217: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV217PlaybackChapterSync217Toggle() {
    val current = BiliClient.prefs.v217playbackChapterSync217
    BiliClient.prefs.v217playbackChapterSync217 = !current
    AppToast.show(this, "Playback Chapter Sync217: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV217ScreenshotSavePath217Toggle() {
    val current = BiliClient.prefs.v217screenshotSavePath217
    BiliClient.prefs.v217screenshotSavePath217 = !current
    AppToast.show(this, "Screenshot Save Path217: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV217VideoColorSpace217Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v217videoColorSpace217).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space217",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v217videoColorSpace217 = value
        AppToast.show(this, "Video Color Space217: $value")
    }
}

internal fun PlayerActivity.showV217DanmakuBottomMaxCount242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v217danmakuBottomMaxCount242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v217danmakuBottomMaxCount242 = value
        AppToast.show(this, "Danmaku Bottom Max Count242: $value")
    }
}

internal fun PlayerActivity.showV217SubtitleBgBorder249Toggle() {
    val current = BiliClient.prefs.v217subtitleBgBorder249
    BiliClient.prefs.v217subtitleBgBorder249 = !current
    AppToast.show(this, "Subtitle Bg Border249: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV218AudioEQCustom218Toggle() {
    val current = BiliClient.prefs.v218audioEQCustom218
    BiliClient.prefs.v218audioEQCustom218 = !current
    AppToast.show(this, "Audio EQ Custom218: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV218DanmakuBottomMaxCount243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v218danmakuBottomMaxCount243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v218danmakuBottomMaxCount243 = value
        AppToast.show(this, "Danmaku Bottom Max Count243: $value")
    }
}

internal fun PlayerActivity.showV218SubtitleBgBorder250Toggle() {
    val current = BiliClient.prefs.v218subtitleBgBorder250
    BiliClient.prefs.v218subtitleBgBorder250 = !current
    AppToast.show(this, "Subtitle Bg Border250: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV218GestureShakeAction218Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v218gestureShakeAction218).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action218",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v218gestureShakeAction218 = value
        AppToast.show(this, "Gesture Shake Action218: $value")
    }
}

internal fun PlayerActivity.showV218CastAudioVolume218Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v218castAudioVolume218).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume218",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v218castAudioVolume218 = value
        AppToast.show(this, "Cast Audio Volume218: $value")
    }
}

internal fun PlayerActivity.showV218PlaylistAutoSkipOutro218Toggle() {
    val current = BiliClient.prefs.v218playlistAutoSkipOutro218
    BiliClient.prefs.v218playlistAutoSkipOutro218 = !current
    AppToast.show(this, "Playlist Auto Skip Outro218: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV218CacheDownloadSpeed219Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v218cacheDownloadSpeed219).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed219",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v218cacheDownloadSpeed219 = value
        AppToast.show(this, "Cache Download Speed219: $value")
    }
}

internal fun PlayerActivity.showV218ProgressBarThumbBorder218Toggle() {
    val current = BiliClient.prefs.v218progressBarThumbBorder218
    BiliClient.prefs.v218progressBarThumbBorder218 = !current
    AppToast.show(this, "Progress Bar Thumb Border218: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV218VolumeBoostPeak218Toggle() {
    val current = BiliClient.prefs.v218volumeBoostPeak218
    BiliClient.prefs.v218volumeBoostPeak218 = !current
    AppToast.show(this, "Volume Boost Peak218: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV218HistoryBookmarkExport218Toggle() {
    val current = BiliClient.prefs.v218historyBookmarkExport218
    BiliClient.prefs.v218historyBookmarkExport218 = !current
    AppToast.show(this, "History Bookmark Export218: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV218PlaybackChapterSync218Toggle() {
    val current = BiliClient.prefs.v218playbackChapterSync218
    BiliClient.prefs.v218playbackChapterSync218 = !current
    AppToast.show(this, "Playback Chapter Sync218: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV218ScreenshotSavePath218Toggle() {
    val current = BiliClient.prefs.v218screenshotSavePath218
    BiliClient.prefs.v218screenshotSavePath218 = !current
    AppToast.show(this, "Screenshot Save Path218: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV218VideoColorSpace218Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v218videoColorSpace218).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space218",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v218videoColorSpace218 = value
        AppToast.show(this, "Video Color Space218: $value")
    }
}

internal fun PlayerActivity.showV218DanmakuBottomMaxCount244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v218danmakuBottomMaxCount244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v218danmakuBottomMaxCount244 = value
        AppToast.show(this, "Danmaku Bottom Max Count244: $value")
    }
}

internal fun PlayerActivity.showV218SubtitleBgBorder251Toggle() {
    val current = BiliClient.prefs.v218subtitleBgBorder251
    BiliClient.prefs.v218subtitleBgBorder251 = !current
    AppToast.show(this, "Subtitle Bg Border251: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV219AudioEQCustom219Toggle() {
    val current = BiliClient.prefs.v219audioEQCustom219
    BiliClient.prefs.v219audioEQCustom219 = !current
    AppToast.show(this, "Audio EQ Custom219: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV219DanmakuBottomMaxCount245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v219danmakuBottomMaxCount245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v219danmakuBottomMaxCount245 = value
        AppToast.show(this, "Danmaku Bottom Max Count245: $value")
    }
}

internal fun PlayerActivity.showV219SubtitleBgBorder252Toggle() {
    val current = BiliClient.prefs.v219subtitleBgBorder252
    BiliClient.prefs.v219subtitleBgBorder252 = !current
    AppToast.show(this, "Subtitle Bg Border252: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV219GestureShakeAction219Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v219gestureShakeAction219).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action219",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v219gestureShakeAction219 = value
        AppToast.show(this, "Gesture Shake Action219: $value")
    }
}

internal fun PlayerActivity.showV219CastAudioVolume219Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v219castAudioVolume219).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume219",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v219castAudioVolume219 = value
        AppToast.show(this, "Cast Audio Volume219: $value")
    }
}

internal fun PlayerActivity.showV219PlaylistAutoSkipOutro219Toggle() {
    val current = BiliClient.prefs.v219playlistAutoSkipOutro219
    BiliClient.prefs.v219playlistAutoSkipOutro219 = !current
    AppToast.show(this, "Playlist Auto Skip Outro219: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV219CacheDownloadSpeed220Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v219cacheDownloadSpeed220).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed220",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v219cacheDownloadSpeed220 = value
        AppToast.show(this, "Cache Download Speed220: $value")
    }
}

internal fun PlayerActivity.showV219ProgressBarThumbBorder219Toggle() {
    val current = BiliClient.prefs.v219progressBarThumbBorder219
    BiliClient.prefs.v219progressBarThumbBorder219 = !current
    AppToast.show(this, "Progress Bar Thumb Border219: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV219VolumeBoostPeak219Toggle() {
    val current = BiliClient.prefs.v219volumeBoostPeak219
    BiliClient.prefs.v219volumeBoostPeak219 = !current
    AppToast.show(this, "Volume Boost Peak219: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV219HistoryBookmarkExport219Toggle() {
    val current = BiliClient.prefs.v219historyBookmarkExport219
    BiliClient.prefs.v219historyBookmarkExport219 = !current
    AppToast.show(this, "History Bookmark Export219: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV219PlaybackChapterSync219Toggle() {
    val current = BiliClient.prefs.v219playbackChapterSync219
    BiliClient.prefs.v219playbackChapterSync219 = !current
    AppToast.show(this, "Playback Chapter Sync219: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV219ScreenshotSavePath219Toggle() {
    val current = BiliClient.prefs.v219screenshotSavePath219
    BiliClient.prefs.v219screenshotSavePath219 = !current
    AppToast.show(this, "Screenshot Save Path219: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV219VideoColorSpace219Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v219videoColorSpace219).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space219",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v219videoColorSpace219 = value
        AppToast.show(this, "Video Color Space219: $value")
    }
}

internal fun PlayerActivity.showV219DanmakuBottomMaxCount246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v219danmakuBottomMaxCount246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v219danmakuBottomMaxCount246 = value
        AppToast.show(this, "Danmaku Bottom Max Count246: $value")
    }
}

internal fun PlayerActivity.showV219SubtitleBgBorder253Toggle() {
    val current = BiliClient.prefs.v219subtitleBgBorder253
    BiliClient.prefs.v219subtitleBgBorder253 = !current
    AppToast.show(this, "Subtitle Bg Border253: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV220AudioEQCustom220Toggle() {
    val current = BiliClient.prefs.v220audioEQCustom220
    BiliClient.prefs.v220audioEQCustom220 = !current
    AppToast.show(this, "Audio EQ Custom220: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV220DanmakuBottomMaxCount247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v220danmakuBottomMaxCount247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v220danmakuBottomMaxCount247 = value
        AppToast.show(this, "Danmaku Bottom Max Count247: $value")
    }
}

internal fun PlayerActivity.showV220SubtitleBgBorder254Toggle() {
    val current = BiliClient.prefs.v220subtitleBgBorder254
    BiliClient.prefs.v220subtitleBgBorder254 = !current
    AppToast.show(this, "Subtitle Bg Border254: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV220GestureShakeAction220Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v220gestureShakeAction220).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action220",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v220gestureShakeAction220 = value
        AppToast.show(this, "Gesture Shake Action220: $value")
    }
}

internal fun PlayerActivity.showV220CastAudioVolume220Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v220castAudioVolume220).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume220",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v220castAudioVolume220 = value
        AppToast.show(this, "Cast Audio Volume220: $value")
    }
}

internal fun PlayerActivity.showV220PlaylistAutoSkipOutro220Toggle() {
    val current = BiliClient.prefs.v220playlistAutoSkipOutro220
    BiliClient.prefs.v220playlistAutoSkipOutro220 = !current
    AppToast.show(this, "Playlist Auto Skip Outro220: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV220CacheDownloadSpeed221Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v220cacheDownloadSpeed221).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed221",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v220cacheDownloadSpeed221 = value
        AppToast.show(this, "Cache Download Speed221: $value")
    }
}

internal fun PlayerActivity.showV220ProgressBarThumbBorder220Toggle() {
    val current = BiliClient.prefs.v220progressBarThumbBorder220
    BiliClient.prefs.v220progressBarThumbBorder220 = !current
    AppToast.show(this, "Progress Bar Thumb Border220: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV220VolumeBoostPeak220Toggle() {
    val current = BiliClient.prefs.v220volumeBoostPeak220
    BiliClient.prefs.v220volumeBoostPeak220 = !current
    AppToast.show(this, "Volume Boost Peak220: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV220HistoryBookmarkExport220Toggle() {
    val current = BiliClient.prefs.v220historyBookmarkExport220
    BiliClient.prefs.v220historyBookmarkExport220 = !current
    AppToast.show(this, "History Bookmark Export220: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV220PlaybackChapterSync220Toggle() {
    val current = BiliClient.prefs.v220playbackChapterSync220
    BiliClient.prefs.v220playbackChapterSync220 = !current
    AppToast.show(this, "Playback Chapter Sync220: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV220ScreenshotSavePath220Toggle() {
    val current = BiliClient.prefs.v220screenshotSavePath220
    BiliClient.prefs.v220screenshotSavePath220 = !current
    AppToast.show(this, "Screenshot Save Path220: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV220VideoColorSpace220Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v220videoColorSpace220).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space220",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v220videoColorSpace220 = value
        AppToast.show(this, "Video Color Space220: $value")
    }
}

internal fun PlayerActivity.showV220DanmakuBottomMaxCount248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v220danmakuBottomMaxCount248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v220danmakuBottomMaxCount248 = value
        AppToast.show(this, "Danmaku Bottom Max Count248: $value")
    }
}

internal fun PlayerActivity.showV220SubtitleBgBorder255Toggle() {
    val current = BiliClient.prefs.v220subtitleBgBorder255
    BiliClient.prefs.v220subtitleBgBorder255 = !current
    AppToast.show(this, "Subtitle Bg Border255: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV221AudioEQCustom221Toggle() {
    val current = BiliClient.prefs.v221audioEQCustom221
    BiliClient.prefs.v221audioEQCustom221 = !current
    AppToast.show(this, "Audio EQ Custom221: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV221DanmakuBottomMaxCount249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v221danmakuBottomMaxCount249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v221danmakuBottomMaxCount249 = value
        AppToast.show(this, "Danmaku Bottom Max Count249: $value")
    }
}

internal fun PlayerActivity.showV221SubtitleBgBorder256Toggle() {
    val current = BiliClient.prefs.v221subtitleBgBorder256
    BiliClient.prefs.v221subtitleBgBorder256 = !current
    AppToast.show(this, "Subtitle Bg Border256: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV221GestureShakeAction221Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v221gestureShakeAction221).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action221",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v221gestureShakeAction221 = value
        AppToast.show(this, "Gesture Shake Action221: $value")
    }
}

internal fun PlayerActivity.showV221CastAudioVolume221Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v221castAudioVolume221).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume221",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v221castAudioVolume221 = value
        AppToast.show(this, "Cast Audio Volume221: $value")
    }
}

internal fun PlayerActivity.showV221PlaylistAutoSkipOutro221Toggle() {
    val current = BiliClient.prefs.v221playlistAutoSkipOutro221
    BiliClient.prefs.v221playlistAutoSkipOutro221 = !current
    AppToast.show(this, "Playlist Auto Skip Outro221: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV221CacheDownloadSpeed222Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v221cacheDownloadSpeed222).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed222",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v221cacheDownloadSpeed222 = value
        AppToast.show(this, "Cache Download Speed222: $value")
    }
}

internal fun PlayerActivity.showV221ProgressBarThumbBorder221Toggle() {
    val current = BiliClient.prefs.v221progressBarThumbBorder221
    BiliClient.prefs.v221progressBarThumbBorder221 = !current
    AppToast.show(this, "Progress Bar Thumb Border221: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV221VolumeBoostPeak221Toggle() {
    val current = BiliClient.prefs.v221volumeBoostPeak221
    BiliClient.prefs.v221volumeBoostPeak221 = !current
    AppToast.show(this, "Volume Boost Peak221: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV221HistoryBookmarkExport221Toggle() {
    val current = BiliClient.prefs.v221historyBookmarkExport221
    BiliClient.prefs.v221historyBookmarkExport221 = !current
    AppToast.show(this, "History Bookmark Export221: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV221PlaybackChapterSync221Toggle() {
    val current = BiliClient.prefs.v221playbackChapterSync221
    BiliClient.prefs.v221playbackChapterSync221 = !current
    AppToast.show(this, "Playback Chapter Sync221: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV221ScreenshotSavePath221Toggle() {
    val current = BiliClient.prefs.v221screenshotSavePath221
    BiliClient.prefs.v221screenshotSavePath221 = !current
    AppToast.show(this, "Screenshot Save Path221: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV221VideoColorSpace221Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v221videoColorSpace221).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space221",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v221videoColorSpace221 = value
        AppToast.show(this, "Video Color Space221: $value")
    }
}

internal fun PlayerActivity.showV221DanmakuBottomMaxCount250Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v221danmakuBottomMaxCount250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v221danmakuBottomMaxCount250 = value
        AppToast.show(this, "Danmaku Bottom Max Count250: $value")
    }
}

internal fun PlayerActivity.showV221SubtitleBgBorder257Toggle() {
    val current = BiliClient.prefs.v221subtitleBgBorder257
    BiliClient.prefs.v221subtitleBgBorder257 = !current
    AppToast.show(this, "Subtitle Bg Border257: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV222AudioEQCustom222Toggle() {
    val current = BiliClient.prefs.v222audioEQCustom222
    BiliClient.prefs.v222audioEQCustom222 = !current
    AppToast.show(this, "Audio EQ Custom222: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV222DanmakuBottomMaxCount251Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v222danmakuBottomMaxCount251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v222danmakuBottomMaxCount251 = value
        AppToast.show(this, "Danmaku Bottom Max Count251: $value")
    }
}

internal fun PlayerActivity.showV222SubtitleBgBorder258Toggle() {
    val current = BiliClient.prefs.v222subtitleBgBorder258
    BiliClient.prefs.v222subtitleBgBorder258 = !current
    AppToast.show(this, "Subtitle Bg Border258: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV222GestureShakeAction222Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v222gestureShakeAction222).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action222",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v222gestureShakeAction222 = value
        AppToast.show(this, "Gesture Shake Action222: $value")
    }
}

internal fun PlayerActivity.showV222CastAudioVolume222Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v222castAudioVolume222).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume222",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v222castAudioVolume222 = value
        AppToast.show(this, "Cast Audio Volume222: $value")
    }
}

internal fun PlayerActivity.showV222PlaylistAutoSkipOutro222Toggle() {
    val current = BiliClient.prefs.v222playlistAutoSkipOutro222
    BiliClient.prefs.v222playlistAutoSkipOutro222 = !current
    AppToast.show(this, "Playlist Auto Skip Outro222: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV222CacheDownloadSpeed223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v222cacheDownloadSpeed223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v222cacheDownloadSpeed223 = value
        AppToast.show(this, "Cache Download Speed223: $value")
    }
}

internal fun PlayerActivity.showV222ProgressBarThumbBorder222Toggle() {
    val current = BiliClient.prefs.v222progressBarThumbBorder222
    BiliClient.prefs.v222progressBarThumbBorder222 = !current
    AppToast.show(this, "Progress Bar Thumb Border222: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV222VolumeBoostPeak222Toggle() {
    val current = BiliClient.prefs.v222volumeBoostPeak222
    BiliClient.prefs.v222volumeBoostPeak222 = !current
    AppToast.show(this, "Volume Boost Peak222: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV222HistoryBookmarkExport222Toggle() {
    val current = BiliClient.prefs.v222historyBookmarkExport222
    BiliClient.prefs.v222historyBookmarkExport222 = !current
    AppToast.show(this, "History Bookmark Export222: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV222PlaybackChapterSync222Toggle() {
    val current = BiliClient.prefs.v222playbackChapterSync222
    BiliClient.prefs.v222playbackChapterSync222 = !current
    AppToast.show(this, "Playback Chapter Sync222: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV222ScreenshotSavePath222Toggle() {
    val current = BiliClient.prefs.v222screenshotSavePath222
    BiliClient.prefs.v222screenshotSavePath222 = !current
    AppToast.show(this, "Screenshot Save Path222: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV222VideoColorSpace222Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v222videoColorSpace222).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space222",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v222videoColorSpace222 = value
        AppToast.show(this, "Video Color Space222: $value")
    }
}

internal fun PlayerActivity.showV222DanmakuBottomMaxCount252Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v222danmakuBottomMaxCount252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v222danmakuBottomMaxCount252 = value
        AppToast.show(this, "Danmaku Bottom Max Count252: $value")
    }
}

internal fun PlayerActivity.showV222SubtitleBgBorder259Toggle() {
    val current = BiliClient.prefs.v222subtitleBgBorder259
    BiliClient.prefs.v222subtitleBgBorder259 = !current
    AppToast.show(this, "Subtitle Bg Border259: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV223AudioEQCustom223Toggle() {
    val current = BiliClient.prefs.v223audioEQCustom223
    BiliClient.prefs.v223audioEQCustom223 = !current
    AppToast.show(this, "Audio EQ Custom223: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV223DanmakuBottomMaxCount253Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223danmakuBottomMaxCount253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223danmakuBottomMaxCount253 = value
        AppToast.show(this, "Danmaku Bottom Max Count253: $value")
    }
}

internal fun PlayerActivity.showV223SubtitleBgBorder260Toggle() {
    val current = BiliClient.prefs.v223subtitleBgBorder260
    BiliClient.prefs.v223subtitleBgBorder260 = !current
    AppToast.show(this, "Subtitle Bg Border260: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV223GestureShakeAction223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223gestureShakeAction223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223gestureShakeAction223 = value
        AppToast.show(this, "Gesture Shake Action223: $value")
    }
}

internal fun PlayerActivity.showV223CastAudioVolume223Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v223castAudioVolume223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223castAudioVolume223 = value
        AppToast.show(this, "Cast Audio Volume223: $value")
    }
}

internal fun PlayerActivity.showV223PlaylistAutoSkipOutro223Toggle() {
    val current = BiliClient.prefs.v223playlistAutoSkipOutro223
    BiliClient.prefs.v223playlistAutoSkipOutro223 = !current
    AppToast.show(this, "Playlist Auto Skip Outro223: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV223CacheDownloadSpeed224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223cacheDownloadSpeed224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223cacheDownloadSpeed224 = value
        AppToast.show(this, "Cache Download Speed224: $value")
    }
}

internal fun PlayerActivity.showV223ProgressBarThumbBorder223Toggle() {
    val current = BiliClient.prefs.v223progressBarThumbBorder223
    BiliClient.prefs.v223progressBarThumbBorder223 = !current
    AppToast.show(this, "Progress Bar Thumb Border223: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV223VolumeBoostPeak223Toggle() {
    val current = BiliClient.prefs.v223volumeBoostPeak223
    BiliClient.prefs.v223volumeBoostPeak223 = !current
    AppToast.show(this, "Volume Boost Peak223: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV223HistoryBookmarkExport223Toggle() {
    val current = BiliClient.prefs.v223historyBookmarkExport223
    BiliClient.prefs.v223historyBookmarkExport223 = !current
    AppToast.show(this, "History Bookmark Export223: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV223PlaybackChapterSync223Toggle() {
    val current = BiliClient.prefs.v223playbackChapterSync223
    BiliClient.prefs.v223playbackChapterSync223 = !current
    AppToast.show(this, "Playback Chapter Sync223: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV223ScreenshotSavePath223Toggle() {
    val current = BiliClient.prefs.v223screenshotSavePath223
    BiliClient.prefs.v223screenshotSavePath223 = !current
    AppToast.show(this, "Screenshot Save Path223: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV223VideoColorSpace223Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223videoColorSpace223).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space223",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223videoColorSpace223 = value
        AppToast.show(this, "Video Color Space223: $value")
    }
}

internal fun PlayerActivity.showV223DanmakuBottomMaxCount254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v223danmakuBottomMaxCount254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v223danmakuBottomMaxCount254 = value
        AppToast.show(this, "Danmaku Bottom Max Count254: $value")
    }
}

internal fun PlayerActivity.showV223SubtitleBgBorder261Toggle() {
    val current = BiliClient.prefs.v223subtitleBgBorder261
    BiliClient.prefs.v223subtitleBgBorder261 = !current
    AppToast.show(this, "Subtitle Bg Border261: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV224AudioEQCustom224Toggle() {
    val current = BiliClient.prefs.v224audioEQCustom224
    BiliClient.prefs.v224audioEQCustom224 = !current
    AppToast.show(this, "Audio EQ Custom224: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV224DanmakuBottomMaxCount255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224danmakuBottomMaxCount255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224danmakuBottomMaxCount255 = value
        AppToast.show(this, "Danmaku Bottom Max Count255: $value")
    }
}

internal fun PlayerActivity.showV224SubtitleBgBorder262Toggle() {
    val current = BiliClient.prefs.v224subtitleBgBorder262
    BiliClient.prefs.v224subtitleBgBorder262 = !current
    AppToast.show(this, "Subtitle Bg Border262: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV224GestureShakeAction224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224gestureShakeAction224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224gestureShakeAction224 = value
        AppToast.show(this, "Gesture Shake Action224: $value")
    }
}

internal fun PlayerActivity.showV224CastAudioVolume224Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v224castAudioVolume224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224castAudioVolume224 = value
        AppToast.show(this, "Cast Audio Volume224: $value")
    }
}

internal fun PlayerActivity.showV224PlaylistAutoSkipOutro224Toggle() {
    val current = BiliClient.prefs.v224playlistAutoSkipOutro224
    BiliClient.prefs.v224playlistAutoSkipOutro224 = !current
    AppToast.show(this, "Playlist Auto Skip Outro224: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV224CacheDownloadSpeed225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224cacheDownloadSpeed225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224cacheDownloadSpeed225 = value
        AppToast.show(this, "Cache Download Speed225: $value")
    }
}

internal fun PlayerActivity.showV224ProgressBarThumbBorder224Toggle() {
    val current = BiliClient.prefs.v224progressBarThumbBorder224
    BiliClient.prefs.v224progressBarThumbBorder224 = !current
    AppToast.show(this, "Progress Bar Thumb Border224: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV224VolumeBoostPeak224Toggle() {
    val current = BiliClient.prefs.v224volumeBoostPeak224
    BiliClient.prefs.v224volumeBoostPeak224 = !current
    AppToast.show(this, "Volume Boost Peak224: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV224HistoryBookmarkExport224Toggle() {
    val current = BiliClient.prefs.v224historyBookmarkExport224
    BiliClient.prefs.v224historyBookmarkExport224 = !current
    AppToast.show(this, "History Bookmark Export224: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV224PlaybackChapterSync224Toggle() {
    val current = BiliClient.prefs.v224playbackChapterSync224
    BiliClient.prefs.v224playbackChapterSync224 = !current
    AppToast.show(this, "Playback Chapter Sync224: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV224ScreenshotSavePath224Toggle() {
    val current = BiliClient.prefs.v224screenshotSavePath224
    BiliClient.prefs.v224screenshotSavePath224 = !current
    AppToast.show(this, "Screenshot Save Path224: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV224VideoColorSpace224Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224videoColorSpace224).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space224",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224videoColorSpace224 = value
        AppToast.show(this, "Video Color Space224: $value")
    }
}

internal fun PlayerActivity.showV224DanmakuBottomMaxCount256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v224danmakuBottomMaxCount256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v224danmakuBottomMaxCount256 = value
        AppToast.show(this, "Danmaku Bottom Max Count256: $value")
    }
}

internal fun PlayerActivity.showV224SubtitleBgBorder263Toggle() {
    val current = BiliClient.prefs.v224subtitleBgBorder263
    BiliClient.prefs.v224subtitleBgBorder263 = !current
    AppToast.show(this, "Subtitle Bg Border263: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV225AudioEQCustom225Toggle() {
    val current = BiliClient.prefs.v225audioEQCustom225
    BiliClient.prefs.v225audioEQCustom225 = !current
    AppToast.show(this, "Audio EQ Custom225: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV225DanmakuBottomMaxCount257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225danmakuBottomMaxCount257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225danmakuBottomMaxCount257 = value
        AppToast.show(this, "Danmaku Bottom Max Count257: $value")
    }
}

internal fun PlayerActivity.showV225SubtitleBgBorder264Toggle() {
    val current = BiliClient.prefs.v225subtitleBgBorder264
    BiliClient.prefs.v225subtitleBgBorder264 = !current
    AppToast.show(this, "Subtitle Bg Border264: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV225GestureShakeAction225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225gestureShakeAction225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225gestureShakeAction225 = value
        AppToast.show(this, "Gesture Shake Action225: $value")
    }
}

internal fun PlayerActivity.showV225CastAudioVolume225Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v225castAudioVolume225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225castAudioVolume225 = value
        AppToast.show(this, "Cast Audio Volume225: $value")
    }
}

internal fun PlayerActivity.showV225PlaylistAutoSkipOutro225Toggle() {
    val current = BiliClient.prefs.v225playlistAutoSkipOutro225
    BiliClient.prefs.v225playlistAutoSkipOutro225 = !current
    AppToast.show(this, "Playlist Auto Skip Outro225: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV225CacheDownloadSpeed226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225cacheDownloadSpeed226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225cacheDownloadSpeed226 = value
        AppToast.show(this, "Cache Download Speed226: $value")
    }
}

internal fun PlayerActivity.showV225ProgressBarThumbBorder225Toggle() {
    val current = BiliClient.prefs.v225progressBarThumbBorder225
    BiliClient.prefs.v225progressBarThumbBorder225 = !current
    AppToast.show(this, "Progress Bar Thumb Border225: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV225VolumeBoostPeak225Toggle() {
    val current = BiliClient.prefs.v225volumeBoostPeak225
    BiliClient.prefs.v225volumeBoostPeak225 = !current
    AppToast.show(this, "Volume Boost Peak225: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV225HistoryBookmarkExport225Toggle() {
    val current = BiliClient.prefs.v225historyBookmarkExport225
    BiliClient.prefs.v225historyBookmarkExport225 = !current
    AppToast.show(this, "History Bookmark Export225: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV225PlaybackChapterSync225Toggle() {
    val current = BiliClient.prefs.v225playbackChapterSync225
    BiliClient.prefs.v225playbackChapterSync225 = !current
    AppToast.show(this, "Playback Chapter Sync225: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV225ScreenshotSavePath225Toggle() {
    val current = BiliClient.prefs.v225screenshotSavePath225
    BiliClient.prefs.v225screenshotSavePath225 = !current
    AppToast.show(this, "Screenshot Save Path225: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV225VideoColorSpace225Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225videoColorSpace225).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space225",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225videoColorSpace225 = value
        AppToast.show(this, "Video Color Space225: $value")
    }
}

internal fun PlayerActivity.showV225DanmakuBottomMaxCount258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v225danmakuBottomMaxCount258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v225danmakuBottomMaxCount258 = value
        AppToast.show(this, "Danmaku Bottom Max Count258: $value")
    }
}

internal fun PlayerActivity.showV225SubtitleBgBorder265Toggle() {
    val current = BiliClient.prefs.v225subtitleBgBorder265
    BiliClient.prefs.v225subtitleBgBorder265 = !current
    AppToast.show(this, "Subtitle Bg Border265: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV226AudioEQCustom226Toggle() {
    val current = BiliClient.prefs.v226audioEQCustom226
    BiliClient.prefs.v226audioEQCustom226 = !current
    AppToast.show(this, "Audio EQ Custom226: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV226DanmakuBottomMaxCount259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226danmakuBottomMaxCount259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226danmakuBottomMaxCount259 = value
        AppToast.show(this, "Danmaku Bottom Max Count259: $value")
    }
}

internal fun PlayerActivity.showV226SubtitleBgBorder266Toggle() {
    val current = BiliClient.prefs.v226subtitleBgBorder266
    BiliClient.prefs.v226subtitleBgBorder266 = !current
    AppToast.show(this, "Subtitle Bg Border266: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV226GestureShakeAction226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226gestureShakeAction226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226gestureShakeAction226 = value
        AppToast.show(this, "Gesture Shake Action226: $value")
    }
}

internal fun PlayerActivity.showV226CastAudioVolume226Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v226castAudioVolume226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226castAudioVolume226 = value
        AppToast.show(this, "Cast Audio Volume226: $value")
    }
}

internal fun PlayerActivity.showV226PlaylistAutoSkipOutro226Toggle() {
    val current = BiliClient.prefs.v226playlistAutoSkipOutro226
    BiliClient.prefs.v226playlistAutoSkipOutro226 = !current
    AppToast.show(this, "Playlist Auto Skip Outro226: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV226CacheDownloadSpeed227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226cacheDownloadSpeed227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226cacheDownloadSpeed227 = value
        AppToast.show(this, "Cache Download Speed227: $value")
    }
}

internal fun PlayerActivity.showV226ProgressBarThumbBorder226Toggle() {
    val current = BiliClient.prefs.v226progressBarThumbBorder226
    BiliClient.prefs.v226progressBarThumbBorder226 = !current
    AppToast.show(this, "Progress Bar Thumb Border226: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV226VolumeBoostPeak226Toggle() {
    val current = BiliClient.prefs.v226volumeBoostPeak226
    BiliClient.prefs.v226volumeBoostPeak226 = !current
    AppToast.show(this, "Volume Boost Peak226: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV226HistoryBookmarkExport226Toggle() {
    val current = BiliClient.prefs.v226historyBookmarkExport226
    BiliClient.prefs.v226historyBookmarkExport226 = !current
    AppToast.show(this, "History Bookmark Export226: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV226PlaybackChapterSync226Toggle() {
    val current = BiliClient.prefs.v226playbackChapterSync226
    BiliClient.prefs.v226playbackChapterSync226 = !current
    AppToast.show(this, "Playback Chapter Sync226: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV226ScreenshotSavePath226Toggle() {
    val current = BiliClient.prefs.v226screenshotSavePath226
    BiliClient.prefs.v226screenshotSavePath226 = !current
    AppToast.show(this, "Screenshot Save Path226: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV226VideoColorSpace226Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226videoColorSpace226).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space226",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226videoColorSpace226 = value
        AppToast.show(this, "Video Color Space226: $value")
    }
}

internal fun PlayerActivity.showV226DanmakuBottomMaxCount260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v226danmakuBottomMaxCount260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v226danmakuBottomMaxCount260 = value
        AppToast.show(this, "Danmaku Bottom Max Count260: $value")
    }
}

internal fun PlayerActivity.showV226SubtitleBgBorder267Toggle() {
    val current = BiliClient.prefs.v226subtitleBgBorder267
    BiliClient.prefs.v226subtitleBgBorder267 = !current
    AppToast.show(this, "Subtitle Bg Border267: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV227AudioEQCustom227Toggle() {
    val current = BiliClient.prefs.v227audioEQCustom227
    BiliClient.prefs.v227audioEQCustom227 = !current
    AppToast.show(this, "Audio EQ Custom227: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV227DanmakuBottomMaxCount261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227danmakuBottomMaxCount261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227danmakuBottomMaxCount261 = value
        AppToast.show(this, "Danmaku Bottom Max Count261: $value")
    }
}

internal fun PlayerActivity.showV227SubtitleBgBorder268Toggle() {
    val current = BiliClient.prefs.v227subtitleBgBorder268
    BiliClient.prefs.v227subtitleBgBorder268 = !current
    AppToast.show(this, "Subtitle Bg Border268: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV227GestureShakeAction227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227gestureShakeAction227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227gestureShakeAction227 = value
        AppToast.show(this, "Gesture Shake Action227: $value")
    }
}

internal fun PlayerActivity.showV227CastAudioVolume227Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v227castAudioVolume227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227castAudioVolume227 = value
        AppToast.show(this, "Cast Audio Volume227: $value")
    }
}

internal fun PlayerActivity.showV227PlaylistAutoSkipOutro227Toggle() {
    val current = BiliClient.prefs.v227playlistAutoSkipOutro227
    BiliClient.prefs.v227playlistAutoSkipOutro227 = !current
    AppToast.show(this, "Playlist Auto Skip Outro227: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV227CacheDownloadSpeed228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227cacheDownloadSpeed228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227cacheDownloadSpeed228 = value
        AppToast.show(this, "Cache Download Speed228: $value")
    }
}

internal fun PlayerActivity.showV227ProgressBarThumbBorder227Toggle() {
    val current = BiliClient.prefs.v227progressBarThumbBorder227
    BiliClient.prefs.v227progressBarThumbBorder227 = !current
    AppToast.show(this, "Progress Bar Thumb Border227: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV227VolumeBoostPeak227Toggle() {
    val current = BiliClient.prefs.v227volumeBoostPeak227
    BiliClient.prefs.v227volumeBoostPeak227 = !current
    AppToast.show(this, "Volume Boost Peak227: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV227HistoryBookmarkExport227Toggle() {
    val current = BiliClient.prefs.v227historyBookmarkExport227
    BiliClient.prefs.v227historyBookmarkExport227 = !current
    AppToast.show(this, "History Bookmark Export227: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV227PlaybackChapterSync227Toggle() {
    val current = BiliClient.prefs.v227playbackChapterSync227
    BiliClient.prefs.v227playbackChapterSync227 = !current
    AppToast.show(this, "Playback Chapter Sync227: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV227ScreenshotSavePath227Toggle() {
    val current = BiliClient.prefs.v227screenshotSavePath227
    BiliClient.prefs.v227screenshotSavePath227 = !current
    AppToast.show(this, "Screenshot Save Path227: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV227VideoColorSpace227Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227videoColorSpace227).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space227",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227videoColorSpace227 = value
        AppToast.show(this, "Video Color Space227: $value")
    }
}

internal fun PlayerActivity.showV227DanmakuBottomMaxCount262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v227danmakuBottomMaxCount262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v227danmakuBottomMaxCount262 = value
        AppToast.show(this, "Danmaku Bottom Max Count262: $value")
    }
}

internal fun PlayerActivity.showV227SubtitleBgBorder269Toggle() {
    val current = BiliClient.prefs.v227subtitleBgBorder269
    BiliClient.prefs.v227subtitleBgBorder269 = !current
    AppToast.show(this, "Subtitle Bg Border269: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV228AudioEQCustom228Toggle() {
    val current = BiliClient.prefs.v228audioEQCustom228
    BiliClient.prefs.v228audioEQCustom228 = !current
    AppToast.show(this, "Audio EQ Custom228: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV228DanmakuBottomMaxCount263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228danmakuBottomMaxCount263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228danmakuBottomMaxCount263 = value
        AppToast.show(this, "Danmaku Bottom Max Count263: $value")
    }
}

internal fun PlayerActivity.showV228SubtitleBgBorder270Toggle() {
    val current = BiliClient.prefs.v228subtitleBgBorder270
    BiliClient.prefs.v228subtitleBgBorder270 = !current
    AppToast.show(this, "Subtitle Bg Border270: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV228GestureShakeAction228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228gestureShakeAction228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228gestureShakeAction228 = value
        AppToast.show(this, "Gesture Shake Action228: $value")
    }
}

internal fun PlayerActivity.showV228CastAudioVolume228Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v228castAudioVolume228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228castAudioVolume228 = value
        AppToast.show(this, "Cast Audio Volume228: $value")
    }
}

internal fun PlayerActivity.showV228PlaylistAutoSkipOutro228Toggle() {
    val current = BiliClient.prefs.v228playlistAutoSkipOutro228
    BiliClient.prefs.v228playlistAutoSkipOutro228 = !current
    AppToast.show(this, "Playlist Auto Skip Outro228: ${if (!current) "ON" else "OFF"}")
}

