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

internal fun PlayerActivity.showV241ScreenshotSavePath241Toggle() {
    val current = BiliClient.prefs.v241screenshotSavePath241
    BiliClient.prefs.v241screenshotSavePath241 = !current
    AppToast.show(this, "Screenshot Save Path241: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV241VideoColorSpace241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241videoColorSpace241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241videoColorSpace241 = value
        AppToast.show(this, "Video Color Space241: $value")
    }
}

internal fun PlayerActivity.showV241DanmakuBottomMaxCount290Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241danmakuBottomMaxCount290).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count290",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241danmakuBottomMaxCount290 = value
        AppToast.show(this, "Danmaku Bottom Max Count290: $value")
    }
}

internal fun PlayerActivity.showV241SubtitleBgBorder297Toggle() {
    val current = BiliClient.prefs.v241subtitleBgBorder297
    BiliClient.prefs.v241subtitleBgBorder297 = !current
    AppToast.show(this, "Subtitle Bg Border297: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV242AudioEQCustom242Toggle() {
    val current = BiliClient.prefs.v242audioEQCustom242
    BiliClient.prefs.v242audioEQCustom242 = !current
    AppToast.show(this, "Audio EQ Custom242: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV242DanmakuBottomMaxCount291Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242danmakuBottomMaxCount291).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count291",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242danmakuBottomMaxCount291 = value
        AppToast.show(this, "Danmaku Bottom Max Count291: $value")
    }
}

internal fun PlayerActivity.showV242SubtitleBgBorder298Toggle() {
    val current = BiliClient.prefs.v242subtitleBgBorder298
    BiliClient.prefs.v242subtitleBgBorder298 = !current
    AppToast.show(this, "Subtitle Bg Border298: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV242GestureShakeAction242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242gestureShakeAction242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242gestureShakeAction242 = value
        AppToast.show(this, "Gesture Shake Action242: $value")
    }
}

internal fun PlayerActivity.showV242CastAudioVolume242Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v242castAudioVolume242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242castAudioVolume242 = value
        AppToast.show(this, "Cast Audio Volume242: $value")
    }
}

internal fun PlayerActivity.showV242PlaylistAutoSkipOutro242Toggle() {
    val current = BiliClient.prefs.v242playlistAutoSkipOutro242
    BiliClient.prefs.v242playlistAutoSkipOutro242 = !current
    AppToast.show(this, "Playlist Auto Skip Outro242: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV242CacheDownloadSpeed243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242cacheDownloadSpeed243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242cacheDownloadSpeed243 = value
        AppToast.show(this, "Cache Download Speed243: $value")
    }
}

internal fun PlayerActivity.showV242ProgressBarThumbBorder242Toggle() {
    val current = BiliClient.prefs.v242progressBarThumbBorder242
    BiliClient.prefs.v242progressBarThumbBorder242 = !current
    AppToast.show(this, "Progress Bar Thumb Border242: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV242VolumeBoostPeak242Toggle() {
    val current = BiliClient.prefs.v242volumeBoostPeak242
    BiliClient.prefs.v242volumeBoostPeak242 = !current
    AppToast.show(this, "Volume Boost Peak242: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV242HistoryBookmarkExport242Toggle() {
    val current = BiliClient.prefs.v242historyBookmarkExport242
    BiliClient.prefs.v242historyBookmarkExport242 = !current
    AppToast.show(this, "History Bookmark Export242: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV242PlaybackChapterSync242Toggle() {
    val current = BiliClient.prefs.v242playbackChapterSync242
    BiliClient.prefs.v242playbackChapterSync242 = !current
    AppToast.show(this, "Playback Chapter Sync242: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV242ScreenshotSavePath242Toggle() {
    val current = BiliClient.prefs.v242screenshotSavePath242
    BiliClient.prefs.v242screenshotSavePath242 = !current
    AppToast.show(this, "Screenshot Save Path242: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV242VideoColorSpace242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242videoColorSpace242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242videoColorSpace242 = value
        AppToast.show(this, "Video Color Space242: $value")
    }
}

internal fun PlayerActivity.showV242DanmakuBottomMaxCount292Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v242danmakuBottomMaxCount292).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count292",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v242danmakuBottomMaxCount292 = value
        AppToast.show(this, "Danmaku Bottom Max Count292: $value")
    }
}

internal fun PlayerActivity.showV242SubtitleBgBorder299Toggle() {
    val current = BiliClient.prefs.v242subtitleBgBorder299
    BiliClient.prefs.v242subtitleBgBorder299 = !current
    AppToast.show(this, "Subtitle Bg Border299: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV243AudioEQCustom243Toggle() {
    val current = BiliClient.prefs.v243audioEQCustom243
    BiliClient.prefs.v243audioEQCustom243 = !current
    AppToast.show(this, "Audio EQ Custom243: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV243DanmakuBottomMaxCount293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243danmakuBottomMaxCount293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243danmakuBottomMaxCount293 = value
        AppToast.show(this, "Danmaku Bottom Max Count293: $value")
    }
}

internal fun PlayerActivity.showV243SubtitleBgBorder300Toggle() {
    val current = BiliClient.prefs.v243subtitleBgBorder300
    BiliClient.prefs.v243subtitleBgBorder300 = !current
    AppToast.show(this, "Subtitle Bg Border300: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV243GestureShakeAction243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243gestureShakeAction243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243gestureShakeAction243 = value
        AppToast.show(this, "Gesture Shake Action243: $value")
    }
}

internal fun PlayerActivity.showV243CastAudioVolume243Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v243castAudioVolume243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243castAudioVolume243 = value
        AppToast.show(this, "Cast Audio Volume243: $value")
    }
}

internal fun PlayerActivity.showV243PlaylistAutoSkipOutro243Toggle() {
    val current = BiliClient.prefs.v243playlistAutoSkipOutro243
    BiliClient.prefs.v243playlistAutoSkipOutro243 = !current
    AppToast.show(this, "Playlist Auto Skip Outro243: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV243CacheDownloadSpeed244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243cacheDownloadSpeed244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243cacheDownloadSpeed244 = value
        AppToast.show(this, "Cache Download Speed244: $value")
    }
}

internal fun PlayerActivity.showV243ProgressBarThumbBorder243Toggle() {
    val current = BiliClient.prefs.v243progressBarThumbBorder243
    BiliClient.prefs.v243progressBarThumbBorder243 = !current
    AppToast.show(this, "Progress Bar Thumb Border243: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV243VolumeBoostPeak243Toggle() {
    val current = BiliClient.prefs.v243volumeBoostPeak243
    BiliClient.prefs.v243volumeBoostPeak243 = !current
    AppToast.show(this, "Volume Boost Peak243: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV243HistoryBookmarkExport243Toggle() {
    val current = BiliClient.prefs.v243historyBookmarkExport243
    BiliClient.prefs.v243historyBookmarkExport243 = !current
    AppToast.show(this, "History Bookmark Export243: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV243PlaybackChapterSync243Toggle() {
    val current = BiliClient.prefs.v243playbackChapterSync243
    BiliClient.prefs.v243playbackChapterSync243 = !current
    AppToast.show(this, "Playback Chapter Sync243: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV243ScreenshotSavePath243Toggle() {
    val current = BiliClient.prefs.v243screenshotSavePath243
    BiliClient.prefs.v243screenshotSavePath243 = !current
    AppToast.show(this, "Screenshot Save Path243: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV243VideoColorSpace243Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243videoColorSpace243).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space243",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243videoColorSpace243 = value
        AppToast.show(this, "Video Color Space243: $value")
    }
}

internal fun PlayerActivity.showV243DanmakuBottomMaxCount294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v243danmakuBottomMaxCount294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v243danmakuBottomMaxCount294 = value
        AppToast.show(this, "Danmaku Bottom Max Count294: $value")
    }
}

internal fun PlayerActivity.showV243SubtitleBgBorder301Toggle() {
    val current = BiliClient.prefs.v243subtitleBgBorder301
    BiliClient.prefs.v243subtitleBgBorder301 = !current
    AppToast.show(this, "Subtitle Bg Border301: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV244AudioEQCustom244Toggle() {
    val current = BiliClient.prefs.v244audioEQCustom244
    BiliClient.prefs.v244audioEQCustom244 = !current
    AppToast.show(this, "Audio EQ Custom244: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV244DanmakuBottomMaxCount295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244danmakuBottomMaxCount295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244danmakuBottomMaxCount295 = value
        AppToast.show(this, "Danmaku Bottom Max Count295: $value")
    }
}

internal fun PlayerActivity.showV244SubtitleBgBorder302Toggle() {
    val current = BiliClient.prefs.v244subtitleBgBorder302
    BiliClient.prefs.v244subtitleBgBorder302 = !current
    AppToast.show(this, "Subtitle Bg Border302: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV244GestureShakeAction244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244gestureShakeAction244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244gestureShakeAction244 = value
        AppToast.show(this, "Gesture Shake Action244: $value")
    }
}

internal fun PlayerActivity.showV244CastAudioVolume244Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v244castAudioVolume244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244castAudioVolume244 = value
        AppToast.show(this, "Cast Audio Volume244: $value")
    }
}

internal fun PlayerActivity.showV244PlaylistAutoSkipOutro244Toggle() {
    val current = BiliClient.prefs.v244playlistAutoSkipOutro244
    BiliClient.prefs.v244playlistAutoSkipOutro244 = !current
    AppToast.show(this, "Playlist Auto Skip Outro244: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV244CacheDownloadSpeed245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244cacheDownloadSpeed245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244cacheDownloadSpeed245 = value
        AppToast.show(this, "Cache Download Speed245: $value")
    }
}

internal fun PlayerActivity.showV244ProgressBarThumbBorder244Toggle() {
    val current = BiliClient.prefs.v244progressBarThumbBorder244
    BiliClient.prefs.v244progressBarThumbBorder244 = !current
    AppToast.show(this, "Progress Bar Thumb Border244: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV244VolumeBoostPeak244Toggle() {
    val current = BiliClient.prefs.v244volumeBoostPeak244
    BiliClient.prefs.v244volumeBoostPeak244 = !current
    AppToast.show(this, "Volume Boost Peak244: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV244HistoryBookmarkExport244Toggle() {
    val current = BiliClient.prefs.v244historyBookmarkExport244
    BiliClient.prefs.v244historyBookmarkExport244 = !current
    AppToast.show(this, "History Bookmark Export244: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV244PlaybackChapterSync244Toggle() {
    val current = BiliClient.prefs.v244playbackChapterSync244
    BiliClient.prefs.v244playbackChapterSync244 = !current
    AppToast.show(this, "Playback Chapter Sync244: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV244ScreenshotSavePath244Toggle() {
    val current = BiliClient.prefs.v244screenshotSavePath244
    BiliClient.prefs.v244screenshotSavePath244 = !current
    AppToast.show(this, "Screenshot Save Path244: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV244VideoColorSpace244Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244videoColorSpace244).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space244",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244videoColorSpace244 = value
        AppToast.show(this, "Video Color Space244: $value")
    }
}

internal fun PlayerActivity.showV244DanmakuBottomMaxCount296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v244danmakuBottomMaxCount296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v244danmakuBottomMaxCount296 = value
        AppToast.show(this, "Danmaku Bottom Max Count296: $value")
    }
}

internal fun PlayerActivity.showV244SubtitleBgBorder303Toggle() {
    val current = BiliClient.prefs.v244subtitleBgBorder303
    BiliClient.prefs.v244subtitleBgBorder303 = !current
    AppToast.show(this, "Subtitle Bg Border303: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV245AudioEQCustom245Toggle() {
    val current = BiliClient.prefs.v245audioEQCustom245
    BiliClient.prefs.v245audioEQCustom245 = !current
    AppToast.show(this, "Audio EQ Custom245: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV245DanmakuBottomMaxCount297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245danmakuBottomMaxCount297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245danmakuBottomMaxCount297 = value
        AppToast.show(this, "Danmaku Bottom Max Count297: $value")
    }
}

internal fun PlayerActivity.showV245SubtitleBgBorder304Toggle() {
    val current = BiliClient.prefs.v245subtitleBgBorder304
    BiliClient.prefs.v245subtitleBgBorder304 = !current
    AppToast.show(this, "Subtitle Bg Border304: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV245GestureShakeAction245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245gestureShakeAction245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245gestureShakeAction245 = value
        AppToast.show(this, "Gesture Shake Action245: $value")
    }
}

internal fun PlayerActivity.showV245CastAudioVolume245Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v245castAudioVolume245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245castAudioVolume245 = value
        AppToast.show(this, "Cast Audio Volume245: $value")
    }
}

internal fun PlayerActivity.showV245PlaylistAutoSkipOutro245Toggle() {
    val current = BiliClient.prefs.v245playlistAutoSkipOutro245
    BiliClient.prefs.v245playlistAutoSkipOutro245 = !current
    AppToast.show(this, "Playlist Auto Skip Outro245: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV245CacheDownloadSpeed246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245cacheDownloadSpeed246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245cacheDownloadSpeed246 = value
        AppToast.show(this, "Cache Download Speed246: $value")
    }
}

internal fun PlayerActivity.showV245ProgressBarThumbBorder245Toggle() {
    val current = BiliClient.prefs.v245progressBarThumbBorder245
    BiliClient.prefs.v245progressBarThumbBorder245 = !current
    AppToast.show(this, "Progress Bar Thumb Border245: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV245VolumeBoostPeak245Toggle() {
    val current = BiliClient.prefs.v245volumeBoostPeak245
    BiliClient.prefs.v245volumeBoostPeak245 = !current
    AppToast.show(this, "Volume Boost Peak245: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV245HistoryBookmarkExport245Toggle() {
    val current = BiliClient.prefs.v245historyBookmarkExport245
    BiliClient.prefs.v245historyBookmarkExport245 = !current
    AppToast.show(this, "History Bookmark Export245: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV245PlaybackChapterSync245Toggle() {
    val current = BiliClient.prefs.v245playbackChapterSync245
    BiliClient.prefs.v245playbackChapterSync245 = !current
    AppToast.show(this, "Playback Chapter Sync245: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV245ScreenshotSavePath245Toggle() {
    val current = BiliClient.prefs.v245screenshotSavePath245
    BiliClient.prefs.v245screenshotSavePath245 = !current
    AppToast.show(this, "Screenshot Save Path245: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV245VideoColorSpace245Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245videoColorSpace245).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space245",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245videoColorSpace245 = value
        AppToast.show(this, "Video Color Space245: $value")
    }
}

internal fun PlayerActivity.showV245DanmakuBottomMaxCount298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v245danmakuBottomMaxCount298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v245danmakuBottomMaxCount298 = value
        AppToast.show(this, "Danmaku Bottom Max Count298: $value")
    }
}

internal fun PlayerActivity.showV245SubtitleBgBorder305Toggle() {
    val current = BiliClient.prefs.v245subtitleBgBorder305
    BiliClient.prefs.v245subtitleBgBorder305 = !current
    AppToast.show(this, "Subtitle Bg Border305: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV246AudioEQCustom246Toggle() {
    val current = BiliClient.prefs.v246audioEQCustom246
    BiliClient.prefs.v246audioEQCustom246 = !current
    AppToast.show(this, "Audio EQ Custom246: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV246DanmakuBottomMaxCount299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246danmakuBottomMaxCount299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246danmakuBottomMaxCount299 = value
        AppToast.show(this, "Danmaku Bottom Max Count299: $value")
    }
}

internal fun PlayerActivity.showV246SubtitleBgBorder306Toggle() {
    val current = BiliClient.prefs.v246subtitleBgBorder306
    BiliClient.prefs.v246subtitleBgBorder306 = !current
    AppToast.show(this, "Subtitle Bg Border306: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV246GestureShakeAction246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246gestureShakeAction246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246gestureShakeAction246 = value
        AppToast.show(this, "Gesture Shake Action246: $value")
    }
}

internal fun PlayerActivity.showV246CastAudioVolume246Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v246castAudioVolume246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246castAudioVolume246 = value
        AppToast.show(this, "Cast Audio Volume246: $value")
    }
}

internal fun PlayerActivity.showV246PlaylistAutoSkipOutro246Toggle() {
    val current = BiliClient.prefs.v246playlistAutoSkipOutro246
    BiliClient.prefs.v246playlistAutoSkipOutro246 = !current
    AppToast.show(this, "Playlist Auto Skip Outro246: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV246CacheDownloadSpeed247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246cacheDownloadSpeed247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246cacheDownloadSpeed247 = value
        AppToast.show(this, "Cache Download Speed247: $value")
    }
}

internal fun PlayerActivity.showV246ProgressBarThumbBorder246Toggle() {
    val current = BiliClient.prefs.v246progressBarThumbBorder246
    BiliClient.prefs.v246progressBarThumbBorder246 = !current
    AppToast.show(this, "Progress Bar Thumb Border246: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV246VolumeBoostPeak246Toggle() {
    val current = BiliClient.prefs.v246volumeBoostPeak246
    BiliClient.prefs.v246volumeBoostPeak246 = !current
    AppToast.show(this, "Volume Boost Peak246: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV246HistoryBookmarkExport246Toggle() {
    val current = BiliClient.prefs.v246historyBookmarkExport246
    BiliClient.prefs.v246historyBookmarkExport246 = !current
    AppToast.show(this, "History Bookmark Export246: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV246PlaybackChapterSync246Toggle() {
    val current = BiliClient.prefs.v246playbackChapterSync246
    BiliClient.prefs.v246playbackChapterSync246 = !current
    AppToast.show(this, "Playback Chapter Sync246: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV246ScreenshotSavePath246Toggle() {
    val current = BiliClient.prefs.v246screenshotSavePath246
    BiliClient.prefs.v246screenshotSavePath246 = !current
    AppToast.show(this, "Screenshot Save Path246: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV246VideoColorSpace246Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246videoColorSpace246).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space246",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246videoColorSpace246 = value
        AppToast.show(this, "Video Color Space246: $value")
    }
}

internal fun PlayerActivity.showV246DanmakuBottomMaxCount300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v246danmakuBottomMaxCount300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v246danmakuBottomMaxCount300 = value
        AppToast.show(this, "Danmaku Bottom Max Count300: $value")
    }
}

internal fun PlayerActivity.showV246SubtitleBgBorder307Toggle() {
    val current = BiliClient.prefs.v246subtitleBgBorder307
    BiliClient.prefs.v246subtitleBgBorder307 = !current
    AppToast.show(this, "Subtitle Bg Border307: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV247AudioEQCustom247Toggle() {
    val current = BiliClient.prefs.v247audioEQCustom247
    BiliClient.prefs.v247audioEQCustom247 = !current
    AppToast.show(this, "Audio EQ Custom247: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV247DanmakuBottomMaxCount301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247danmakuBottomMaxCount301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247danmakuBottomMaxCount301 = value
        AppToast.show(this, "Danmaku Bottom Max Count301: $value")
    }
}

internal fun PlayerActivity.showV247SubtitleBgBorder308Toggle() {
    val current = BiliClient.prefs.v247subtitleBgBorder308
    BiliClient.prefs.v247subtitleBgBorder308 = !current
    AppToast.show(this, "Subtitle Bg Border308: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV247GestureShakeAction247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247gestureShakeAction247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247gestureShakeAction247 = value
        AppToast.show(this, "Gesture Shake Action247: $value")
    }
}

internal fun PlayerActivity.showV247CastAudioVolume247Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v247castAudioVolume247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247castAudioVolume247 = value
        AppToast.show(this, "Cast Audio Volume247: $value")
    }
}

internal fun PlayerActivity.showV247PlaylistAutoSkipOutro247Toggle() {
    val current = BiliClient.prefs.v247playlistAutoSkipOutro247
    BiliClient.prefs.v247playlistAutoSkipOutro247 = !current
    AppToast.show(this, "Playlist Auto Skip Outro247: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV247CacheDownloadSpeed248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247cacheDownloadSpeed248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247cacheDownloadSpeed248 = value
        AppToast.show(this, "Cache Download Speed248: $value")
    }
}

internal fun PlayerActivity.showV247ProgressBarThumbBorder247Toggle() {
    val current = BiliClient.prefs.v247progressBarThumbBorder247
    BiliClient.prefs.v247progressBarThumbBorder247 = !current
    AppToast.show(this, "Progress Bar Thumb Border247: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV247VolumeBoostPeak247Toggle() {
    val current = BiliClient.prefs.v247volumeBoostPeak247
    BiliClient.prefs.v247volumeBoostPeak247 = !current
    AppToast.show(this, "Volume Boost Peak247: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV247HistoryBookmarkExport247Toggle() {
    val current = BiliClient.prefs.v247historyBookmarkExport247
    BiliClient.prefs.v247historyBookmarkExport247 = !current
    AppToast.show(this, "History Bookmark Export247: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV247PlaybackChapterSync247Toggle() {
    val current = BiliClient.prefs.v247playbackChapterSync247
    BiliClient.prefs.v247playbackChapterSync247 = !current
    AppToast.show(this, "Playback Chapter Sync247: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV247ScreenshotSavePath247Toggle() {
    val current = BiliClient.prefs.v247screenshotSavePath247
    BiliClient.prefs.v247screenshotSavePath247 = !current
    AppToast.show(this, "Screenshot Save Path247: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV247VideoColorSpace247Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247videoColorSpace247).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space247",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247videoColorSpace247 = value
        AppToast.show(this, "Video Color Space247: $value")
    }
}

internal fun PlayerActivity.showV247DanmakuBottomMaxCount302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v247danmakuBottomMaxCount302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v247danmakuBottomMaxCount302 = value
        AppToast.show(this, "Danmaku Bottom Max Count302: $value")
    }
}

internal fun PlayerActivity.showV247SubtitleBgBorder309Toggle() {
    val current = BiliClient.prefs.v247subtitleBgBorder309
    BiliClient.prefs.v247subtitleBgBorder309 = !current
    AppToast.show(this, "Subtitle Bg Border309: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV248AudioEQCustom248Toggle() {
    val current = BiliClient.prefs.v248audioEQCustom248
    BiliClient.prefs.v248audioEQCustom248 = !current
    AppToast.show(this, "Audio EQ Custom248: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV248DanmakuBottomMaxCount303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248danmakuBottomMaxCount303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248danmakuBottomMaxCount303 = value
        AppToast.show(this, "Danmaku Bottom Max Count303: $value")
    }
}

internal fun PlayerActivity.showV248SubtitleBgBorder310Toggle() {
    val current = BiliClient.prefs.v248subtitleBgBorder310
    BiliClient.prefs.v248subtitleBgBorder310 = !current
    AppToast.show(this, "Subtitle Bg Border310: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV248GestureShakeAction248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248gestureShakeAction248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248gestureShakeAction248 = value
        AppToast.show(this, "Gesture Shake Action248: $value")
    }
}

internal fun PlayerActivity.showV248CastAudioVolume248Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v248castAudioVolume248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248castAudioVolume248 = value
        AppToast.show(this, "Cast Audio Volume248: $value")
    }
}

internal fun PlayerActivity.showV248PlaylistAutoSkipOutro248Toggle() {
    val current = BiliClient.prefs.v248playlistAutoSkipOutro248
    BiliClient.prefs.v248playlistAutoSkipOutro248 = !current
    AppToast.show(this, "Playlist Auto Skip Outro248: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV248CacheDownloadSpeed249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248cacheDownloadSpeed249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248cacheDownloadSpeed249 = value
        AppToast.show(this, "Cache Download Speed249: $value")
    }
}

internal fun PlayerActivity.showV248ProgressBarThumbBorder248Toggle() {
    val current = BiliClient.prefs.v248progressBarThumbBorder248
    BiliClient.prefs.v248progressBarThumbBorder248 = !current
    AppToast.show(this, "Progress Bar Thumb Border248: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV248VolumeBoostPeak248Toggle() {
    val current = BiliClient.prefs.v248volumeBoostPeak248
    BiliClient.prefs.v248volumeBoostPeak248 = !current
    AppToast.show(this, "Volume Boost Peak248: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV248HistoryBookmarkExport248Toggle() {
    val current = BiliClient.prefs.v248historyBookmarkExport248
    BiliClient.prefs.v248historyBookmarkExport248 = !current
    AppToast.show(this, "History Bookmark Export248: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV248PlaybackChapterSync248Toggle() {
    val current = BiliClient.prefs.v248playbackChapterSync248
    BiliClient.prefs.v248playbackChapterSync248 = !current
    AppToast.show(this, "Playback Chapter Sync248: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV248ScreenshotSavePath248Toggle() {
    val current = BiliClient.prefs.v248screenshotSavePath248
    BiliClient.prefs.v248screenshotSavePath248 = !current
    AppToast.show(this, "Screenshot Save Path248: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV248VideoColorSpace248Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248videoColorSpace248).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space248",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248videoColorSpace248 = value
        AppToast.show(this, "Video Color Space248: $value")
    }
}

internal fun PlayerActivity.showV248DanmakuBottomMaxCount304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v248danmakuBottomMaxCount304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v248danmakuBottomMaxCount304 = value
        AppToast.show(this, "Danmaku Bottom Max Count304: $value")
    }
}

internal fun PlayerActivity.showV248SubtitleBgBorder311Toggle() {
    val current = BiliClient.prefs.v248subtitleBgBorder311
    BiliClient.prefs.v248subtitleBgBorder311 = !current
    AppToast.show(this, "Subtitle Bg Border311: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV249AudioEQCustom249Toggle() {
    val current = BiliClient.prefs.v249audioEQCustom249
    BiliClient.prefs.v249audioEQCustom249 = !current
    AppToast.show(this, "Audio EQ Custom249: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV249DanmakuBottomMaxCount305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249danmakuBottomMaxCount305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249danmakuBottomMaxCount305 = value
        AppToast.show(this, "Danmaku Bottom Max Count305: $value")
    }
}

internal fun PlayerActivity.showV249SubtitleBgBorder312Toggle() {
    val current = BiliClient.prefs.v249subtitleBgBorder312
    BiliClient.prefs.v249subtitleBgBorder312 = !current
    AppToast.show(this, "Subtitle Bg Border312: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV249GestureShakeAction249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249gestureShakeAction249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249gestureShakeAction249 = value
        AppToast.show(this, "Gesture Shake Action249: $value")
    }
}

internal fun PlayerActivity.showV249CastAudioVolume249Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v249castAudioVolume249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249castAudioVolume249 = value
        AppToast.show(this, "Cast Audio Volume249: $value")
    }
}

internal fun PlayerActivity.showV249PlaylistAutoSkipOutro249Toggle() {
    val current = BiliClient.prefs.v249playlistAutoSkipOutro249
    BiliClient.prefs.v249playlistAutoSkipOutro249 = !current
    AppToast.show(this, "Playlist Auto Skip Outro249: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV249CacheDownloadSpeed250Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249cacheDownloadSpeed250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249cacheDownloadSpeed250 = value
        AppToast.show(this, "Cache Download Speed250: $value")
    }
}

internal fun PlayerActivity.showV249ProgressBarThumbBorder249Toggle() {
    val current = BiliClient.prefs.v249progressBarThumbBorder249
    BiliClient.prefs.v249progressBarThumbBorder249 = !current
    AppToast.show(this, "Progress Bar Thumb Border249: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV249VolumeBoostPeak249Toggle() {
    val current = BiliClient.prefs.v249volumeBoostPeak249
    BiliClient.prefs.v249volumeBoostPeak249 = !current
    AppToast.show(this, "Volume Boost Peak249: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV249HistoryBookmarkExport249Toggle() {
    val current = BiliClient.prefs.v249historyBookmarkExport249
    BiliClient.prefs.v249historyBookmarkExport249 = !current
    AppToast.show(this, "History Bookmark Export249: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV249PlaybackChapterSync249Toggle() {
    val current = BiliClient.prefs.v249playbackChapterSync249
    BiliClient.prefs.v249playbackChapterSync249 = !current
    AppToast.show(this, "Playback Chapter Sync249: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV249ScreenshotSavePath249Toggle() {
    val current = BiliClient.prefs.v249screenshotSavePath249
    BiliClient.prefs.v249screenshotSavePath249 = !current
    AppToast.show(this, "Screenshot Save Path249: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV249VideoColorSpace249Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249videoColorSpace249).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space249",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249videoColorSpace249 = value
        AppToast.show(this, "Video Color Space249: $value")
    }
}

internal fun PlayerActivity.showV249DanmakuBottomMaxCount306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v249danmakuBottomMaxCount306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v249danmakuBottomMaxCount306 = value
        AppToast.show(this, "Danmaku Bottom Max Count306: $value")
    }
}

internal fun PlayerActivity.showV249SubtitleBgBorder313Toggle() {
    val current = BiliClient.prefs.v249subtitleBgBorder313
    BiliClient.prefs.v249subtitleBgBorder313 = !current
    AppToast.show(this, "Subtitle Bg Border313: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV250AudioEQCustom250Toggle() {
    val current = BiliClient.prefs.v250audioEQCustom250
    BiliClient.prefs.v250audioEQCustom250 = !current
    AppToast.show(this, "Audio EQ Custom250: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV250DanmakuBottomMaxCount307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250danmakuBottomMaxCount307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250danmakuBottomMaxCount307 = value
        AppToast.show(this, "Danmaku Bottom Max Count307: $value")
    }
}

internal fun PlayerActivity.showV250SubtitleBgBorder314Toggle() {
    val current = BiliClient.prefs.v250subtitleBgBorder314
    BiliClient.prefs.v250subtitleBgBorder314 = !current
    AppToast.show(this, "Subtitle Bg Border314: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV250GestureShakeAction250Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250gestureShakeAction250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250gestureShakeAction250 = value
        AppToast.show(this, "Gesture Shake Action250: $value")
    }
}

internal fun PlayerActivity.showV250CastAudioVolume250Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v250castAudioVolume250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250castAudioVolume250 = value
        AppToast.show(this, "Cast Audio Volume250: $value")
    }
}

internal fun PlayerActivity.showV250PlaylistAutoSkipOutro250Toggle() {
    val current = BiliClient.prefs.v250playlistAutoSkipOutro250
    BiliClient.prefs.v250playlistAutoSkipOutro250 = !current
    AppToast.show(this, "Playlist Auto Skip Outro250: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV250CacheDownloadSpeed251Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250cacheDownloadSpeed251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250cacheDownloadSpeed251 = value
        AppToast.show(this, "Cache Download Speed251: $value")
    }
}

internal fun PlayerActivity.showV250ProgressBarThumbBorder250Toggle() {
    val current = BiliClient.prefs.v250progressBarThumbBorder250
    BiliClient.prefs.v250progressBarThumbBorder250 = !current
    AppToast.show(this, "Progress Bar Thumb Border250: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV250VolumeBoostPeak250Toggle() {
    val current = BiliClient.prefs.v250volumeBoostPeak250
    BiliClient.prefs.v250volumeBoostPeak250 = !current
    AppToast.show(this, "Volume Boost Peak250: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV250HistoryBookmarkExport250Toggle() {
    val current = BiliClient.prefs.v250historyBookmarkExport250
    BiliClient.prefs.v250historyBookmarkExport250 = !current
    AppToast.show(this, "History Bookmark Export250: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV250PlaybackChapterSync250Toggle() {
    val current = BiliClient.prefs.v250playbackChapterSync250
    BiliClient.prefs.v250playbackChapterSync250 = !current
    AppToast.show(this, "Playback Chapter Sync250: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV250ScreenshotSavePath250Toggle() {
    val current = BiliClient.prefs.v250screenshotSavePath250
    BiliClient.prefs.v250screenshotSavePath250 = !current
    AppToast.show(this, "Screenshot Save Path250: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV250VideoColorSpace250Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250videoColorSpace250).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space250",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250videoColorSpace250 = value
        AppToast.show(this, "Video Color Space250: $value")
    }
}

internal fun PlayerActivity.showV250DanmakuBottomMaxCount308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v250danmakuBottomMaxCount308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v250danmakuBottomMaxCount308 = value
        AppToast.show(this, "Danmaku Bottom Max Count308: $value")
    }
}

internal fun PlayerActivity.showV250SubtitleBgBorder315Toggle() {
    val current = BiliClient.prefs.v250subtitleBgBorder315
    BiliClient.prefs.v250subtitleBgBorder315 = !current
    AppToast.show(this, "Subtitle Bg Border315: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV251AudioEQCustom251Toggle() {
    val current = BiliClient.prefs.v251audioEQCustom251
    BiliClient.prefs.v251audioEQCustom251 = !current
    AppToast.show(this, "Audio EQ Custom251: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV251DanmakuBottomMaxCount309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251danmakuBottomMaxCount309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251danmakuBottomMaxCount309 = value
        AppToast.show(this, "Danmaku Bottom Max Count309: $value")
    }
}

internal fun PlayerActivity.showV251SubtitleBgBorder316Toggle() {
    val current = BiliClient.prefs.v251subtitleBgBorder316
    BiliClient.prefs.v251subtitleBgBorder316 = !current
    AppToast.show(this, "Subtitle Bg Border316: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV251GestureShakeAction251Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251gestureShakeAction251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251gestureShakeAction251 = value
        AppToast.show(this, "Gesture Shake Action251: $value")
    }
}

internal fun PlayerActivity.showV251CastAudioVolume251Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v251castAudioVolume251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251castAudioVolume251 = value
        AppToast.show(this, "Cast Audio Volume251: $value")
    }
}

internal fun PlayerActivity.showV251PlaylistAutoSkipOutro251Toggle() {
    val current = BiliClient.prefs.v251playlistAutoSkipOutro251
    BiliClient.prefs.v251playlistAutoSkipOutro251 = !current
    AppToast.show(this, "Playlist Auto Skip Outro251: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV251CacheDownloadSpeed252Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251cacheDownloadSpeed252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251cacheDownloadSpeed252 = value
        AppToast.show(this, "Cache Download Speed252: $value")
    }
}

internal fun PlayerActivity.showV251ProgressBarThumbBorder251Toggle() {
    val current = BiliClient.prefs.v251progressBarThumbBorder251
    BiliClient.prefs.v251progressBarThumbBorder251 = !current
    AppToast.show(this, "Progress Bar Thumb Border251: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV251VolumeBoostPeak251Toggle() {
    val current = BiliClient.prefs.v251volumeBoostPeak251
    BiliClient.prefs.v251volumeBoostPeak251 = !current
    AppToast.show(this, "Volume Boost Peak251: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV251HistoryBookmarkExport251Toggle() {
    val current = BiliClient.prefs.v251historyBookmarkExport251
    BiliClient.prefs.v251historyBookmarkExport251 = !current
    AppToast.show(this, "History Bookmark Export251: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV251PlaybackChapterSync251Toggle() {
    val current = BiliClient.prefs.v251playbackChapterSync251
    BiliClient.prefs.v251playbackChapterSync251 = !current
    AppToast.show(this, "Playback Chapter Sync251: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV251ScreenshotSavePath251Toggle() {
    val current = BiliClient.prefs.v251screenshotSavePath251
    BiliClient.prefs.v251screenshotSavePath251 = !current
    AppToast.show(this, "Screenshot Save Path251: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV251VideoColorSpace251Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251videoColorSpace251).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space251",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251videoColorSpace251 = value
        AppToast.show(this, "Video Color Space251: $value")
    }
}

internal fun PlayerActivity.showV251DanmakuBottomMaxCount310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v251danmakuBottomMaxCount310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v251danmakuBottomMaxCount310 = value
        AppToast.show(this, "Danmaku Bottom Max Count310: $value")
    }
}

internal fun PlayerActivity.showV251SubtitleBgBorder317Toggle() {
    val current = BiliClient.prefs.v251subtitleBgBorder317
    BiliClient.prefs.v251subtitleBgBorder317 = !current
    AppToast.show(this, "Subtitle Bg Border317: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV252AudioEQCustom252Toggle() {
    val current = BiliClient.prefs.v252audioEQCustom252
    BiliClient.prefs.v252audioEQCustom252 = !current
    AppToast.show(this, "Audio EQ Custom252: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV252DanmakuBottomMaxCount311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252danmakuBottomMaxCount311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252danmakuBottomMaxCount311 = value
        AppToast.show(this, "Danmaku Bottom Max Count311: $value")
    }
}

internal fun PlayerActivity.showV252SubtitleBgBorder318Toggle() {
    val current = BiliClient.prefs.v252subtitleBgBorder318
    BiliClient.prefs.v252subtitleBgBorder318 = !current
    AppToast.show(this, "Subtitle Bg Border318: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV252GestureShakeAction252Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252gestureShakeAction252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252gestureShakeAction252 = value
        AppToast.show(this, "Gesture Shake Action252: $value")
    }
}

internal fun PlayerActivity.showV252CastAudioVolume252Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v252castAudioVolume252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252castAudioVolume252 = value
        AppToast.show(this, "Cast Audio Volume252: $value")
    }
}

internal fun PlayerActivity.showV252PlaylistAutoSkipOutro252Toggle() {
    val current = BiliClient.prefs.v252playlistAutoSkipOutro252
    BiliClient.prefs.v252playlistAutoSkipOutro252 = !current
    AppToast.show(this, "Playlist Auto Skip Outro252: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV252CacheDownloadSpeed253Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252cacheDownloadSpeed253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252cacheDownloadSpeed253 = value
        AppToast.show(this, "Cache Download Speed253: $value")
    }
}

internal fun PlayerActivity.showV252ProgressBarThumbBorder252Toggle() {
    val current = BiliClient.prefs.v252progressBarThumbBorder252
    BiliClient.prefs.v252progressBarThumbBorder252 = !current
    AppToast.show(this, "Progress Bar Thumb Border252: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV252VolumeBoostPeak252Toggle() {
    val current = BiliClient.prefs.v252volumeBoostPeak252
    BiliClient.prefs.v252volumeBoostPeak252 = !current
    AppToast.show(this, "Volume Boost Peak252: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV252HistoryBookmarkExport252Toggle() {
    val current = BiliClient.prefs.v252historyBookmarkExport252
    BiliClient.prefs.v252historyBookmarkExport252 = !current
    AppToast.show(this, "History Bookmark Export252: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV252PlaybackChapterSync252Toggle() {
    val current = BiliClient.prefs.v252playbackChapterSync252
    BiliClient.prefs.v252playbackChapterSync252 = !current
    AppToast.show(this, "Playback Chapter Sync252: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV252ScreenshotSavePath252Toggle() {
    val current = BiliClient.prefs.v252screenshotSavePath252
    BiliClient.prefs.v252screenshotSavePath252 = !current
    AppToast.show(this, "Screenshot Save Path252: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV252VideoColorSpace252Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252videoColorSpace252).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space252",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252videoColorSpace252 = value
        AppToast.show(this, "Video Color Space252: $value")
    }
}

internal fun PlayerActivity.showV252DanmakuBottomMaxCount312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v252danmakuBottomMaxCount312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v252danmakuBottomMaxCount312 = value
        AppToast.show(this, "Danmaku Bottom Max Count312: $value")
    }
}

internal fun PlayerActivity.showV252SubtitleBgBorder319Toggle() {
    val current = BiliClient.prefs.v252subtitleBgBorder319
    BiliClient.prefs.v252subtitleBgBorder319 = !current
    AppToast.show(this, "Subtitle Bg Border319: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV253AudioEQCustom253Toggle() {
    val current = BiliClient.prefs.v253audioEQCustom253
    BiliClient.prefs.v253audioEQCustom253 = !current
    AppToast.show(this, "Audio EQ Custom253: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV253DanmakuBottomMaxCount313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253danmakuBottomMaxCount313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253danmakuBottomMaxCount313 = value
        AppToast.show(this, "Danmaku Bottom Max Count313: $value")
    }
}

internal fun PlayerActivity.showV253SubtitleBgBorder320Toggle() {
    val current = BiliClient.prefs.v253subtitleBgBorder320
    BiliClient.prefs.v253subtitleBgBorder320 = !current
    AppToast.show(this, "Subtitle Bg Border320: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV253GestureShakeAction253Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253gestureShakeAction253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253gestureShakeAction253 = value
        AppToast.show(this, "Gesture Shake Action253: $value")
    }
}

internal fun PlayerActivity.showV253CastAudioVolume253Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v253castAudioVolume253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253castAudioVolume253 = value
        AppToast.show(this, "Cast Audio Volume253: $value")
    }
}

internal fun PlayerActivity.showV253PlaylistAutoSkipOutro253Toggle() {
    val current = BiliClient.prefs.v253playlistAutoSkipOutro253
    BiliClient.prefs.v253playlistAutoSkipOutro253 = !current
    AppToast.show(this, "Playlist Auto Skip Outro253: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV253CacheDownloadSpeed254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253cacheDownloadSpeed254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253cacheDownloadSpeed254 = value
        AppToast.show(this, "Cache Download Speed254: $value")
    }
}

internal fun PlayerActivity.showV253ProgressBarThumbBorder253Toggle() {
    val current = BiliClient.prefs.v253progressBarThumbBorder253
    BiliClient.prefs.v253progressBarThumbBorder253 = !current
    AppToast.show(this, "Progress Bar Thumb Border253: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV253VolumeBoostPeak253Toggle() {
    val current = BiliClient.prefs.v253volumeBoostPeak253
    BiliClient.prefs.v253volumeBoostPeak253 = !current
    AppToast.show(this, "Volume Boost Peak253: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV253HistoryBookmarkExport253Toggle() {
    val current = BiliClient.prefs.v253historyBookmarkExport253
    BiliClient.prefs.v253historyBookmarkExport253 = !current
    AppToast.show(this, "History Bookmark Export253: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV253PlaybackChapterSync253Toggle() {
    val current = BiliClient.prefs.v253playbackChapterSync253
    BiliClient.prefs.v253playbackChapterSync253 = !current
    AppToast.show(this, "Playback Chapter Sync253: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV253ScreenshotSavePath253Toggle() {
    val current = BiliClient.prefs.v253screenshotSavePath253
    BiliClient.prefs.v253screenshotSavePath253 = !current
    AppToast.show(this, "Screenshot Save Path253: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV253VideoColorSpace253Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253videoColorSpace253).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space253",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253videoColorSpace253 = value
        AppToast.show(this, "Video Color Space253: $value")
    }
}

internal fun PlayerActivity.showV253DanmakuBottomMaxCount314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v253danmakuBottomMaxCount314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v253danmakuBottomMaxCount314 = value
        AppToast.show(this, "Danmaku Bottom Max Count314: $value")
    }
}

internal fun PlayerActivity.showV253SubtitleBgBorder321Toggle() {
    val current = BiliClient.prefs.v253subtitleBgBorder321
    BiliClient.prefs.v253subtitleBgBorder321 = !current
    AppToast.show(this, "Subtitle Bg Border321: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV254AudioEQCustom254Toggle() {
    val current = BiliClient.prefs.v254audioEQCustom254
    BiliClient.prefs.v254audioEQCustom254 = !current
    AppToast.show(this, "Audio EQ Custom254: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV254DanmakuBottomMaxCount315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254danmakuBottomMaxCount315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254danmakuBottomMaxCount315 = value
        AppToast.show(this, "Danmaku Bottom Max Count315: $value")
    }
}

internal fun PlayerActivity.showV254SubtitleBgBorder322Toggle() {
    val current = BiliClient.prefs.v254subtitleBgBorder322
    BiliClient.prefs.v254subtitleBgBorder322 = !current
    AppToast.show(this, "Subtitle Bg Border322: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV254GestureShakeAction254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254gestureShakeAction254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254gestureShakeAction254 = value
        AppToast.show(this, "Gesture Shake Action254: $value")
    }
}

internal fun PlayerActivity.showV254CastAudioVolume254Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v254castAudioVolume254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254castAudioVolume254 = value
        AppToast.show(this, "Cast Audio Volume254: $value")
    }
}

internal fun PlayerActivity.showV254PlaylistAutoSkipOutro254Toggle() {
    val current = BiliClient.prefs.v254playlistAutoSkipOutro254
    BiliClient.prefs.v254playlistAutoSkipOutro254 = !current
    AppToast.show(this, "Playlist Auto Skip Outro254: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV254CacheDownloadSpeed255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254cacheDownloadSpeed255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254cacheDownloadSpeed255 = value
        AppToast.show(this, "Cache Download Speed255: $value")
    }
}

internal fun PlayerActivity.showV254ProgressBarThumbBorder254Toggle() {
    val current = BiliClient.prefs.v254progressBarThumbBorder254
    BiliClient.prefs.v254progressBarThumbBorder254 = !current
    AppToast.show(this, "Progress Bar Thumb Border254: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV254VolumeBoostPeak254Toggle() {
    val current = BiliClient.prefs.v254volumeBoostPeak254
    BiliClient.prefs.v254volumeBoostPeak254 = !current
    AppToast.show(this, "Volume Boost Peak254: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV254HistoryBookmarkExport254Toggle() {
    val current = BiliClient.prefs.v254historyBookmarkExport254
    BiliClient.prefs.v254historyBookmarkExport254 = !current
    AppToast.show(this, "History Bookmark Export254: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV254PlaybackChapterSync254Toggle() {
    val current = BiliClient.prefs.v254playbackChapterSync254
    BiliClient.prefs.v254playbackChapterSync254 = !current
    AppToast.show(this, "Playback Chapter Sync254: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV254ScreenshotSavePath254Toggle() {
    val current = BiliClient.prefs.v254screenshotSavePath254
    BiliClient.prefs.v254screenshotSavePath254 = !current
    AppToast.show(this, "Screenshot Save Path254: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV254VideoColorSpace254Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254videoColorSpace254).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space254",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254videoColorSpace254 = value
        AppToast.show(this, "Video Color Space254: $value")
    }
}

internal fun PlayerActivity.showV254DanmakuBottomMaxCount316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v254danmakuBottomMaxCount316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v254danmakuBottomMaxCount316 = value
        AppToast.show(this, "Danmaku Bottom Max Count316: $value")
    }
}

internal fun PlayerActivity.showV254SubtitleBgBorder323Toggle() {
    val current = BiliClient.prefs.v254subtitleBgBorder323
    BiliClient.prefs.v254subtitleBgBorder323 = !current
    AppToast.show(this, "Subtitle Bg Border323: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV255AudioEQCustom255Toggle() {
    val current = BiliClient.prefs.v255audioEQCustom255
    BiliClient.prefs.v255audioEQCustom255 = !current
    AppToast.show(this, "Audio EQ Custom255: ${if (!current) "ON" else "OFF"}")
}

