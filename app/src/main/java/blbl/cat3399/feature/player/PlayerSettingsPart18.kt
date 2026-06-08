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

internal fun PlayerActivity.showV255DanmakuBottomMaxCount317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255danmakuBottomMaxCount317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255danmakuBottomMaxCount317 = value
        AppToast.show(this, "Danmaku Bottom Max Count317: $value")
    }
}

internal fun PlayerActivity.showV255SubtitleBgBorder324Toggle() {
    val current = BiliClient.prefs.v255subtitleBgBorder324
    BiliClient.prefs.v255subtitleBgBorder324 = !current
    AppToast.show(this, "Subtitle Bg Border324: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV255GestureShakeAction255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255gestureShakeAction255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255gestureShakeAction255 = value
        AppToast.show(this, "Gesture Shake Action255: $value")
    }
}

internal fun PlayerActivity.showV255CastAudioVolume255Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v255castAudioVolume255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255castAudioVolume255 = value
        AppToast.show(this, "Cast Audio Volume255: $value")
    }
}

internal fun PlayerActivity.showV255PlaylistAutoSkipOutro255Toggle() {
    val current = BiliClient.prefs.v255playlistAutoSkipOutro255
    BiliClient.prefs.v255playlistAutoSkipOutro255 = !current
    AppToast.show(this, "Playlist Auto Skip Outro255: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV255CacheDownloadSpeed256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255cacheDownloadSpeed256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255cacheDownloadSpeed256 = value
        AppToast.show(this, "Cache Download Speed256: $value")
    }
}

internal fun PlayerActivity.showV255ProgressBarThumbBorder255Toggle() {
    val current = BiliClient.prefs.v255progressBarThumbBorder255
    BiliClient.prefs.v255progressBarThumbBorder255 = !current
    AppToast.show(this, "Progress Bar Thumb Border255: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV255VolumeBoostPeak255Toggle() {
    val current = BiliClient.prefs.v255volumeBoostPeak255
    BiliClient.prefs.v255volumeBoostPeak255 = !current
    AppToast.show(this, "Volume Boost Peak255: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV255HistoryBookmarkExport255Toggle() {
    val current = BiliClient.prefs.v255historyBookmarkExport255
    BiliClient.prefs.v255historyBookmarkExport255 = !current
    AppToast.show(this, "History Bookmark Export255: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV255PlaybackChapterSync255Toggle() {
    val current = BiliClient.prefs.v255playbackChapterSync255
    BiliClient.prefs.v255playbackChapterSync255 = !current
    AppToast.show(this, "Playback Chapter Sync255: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV255ScreenshotSavePath255Toggle() {
    val current = BiliClient.prefs.v255screenshotSavePath255
    BiliClient.prefs.v255screenshotSavePath255 = !current
    AppToast.show(this, "Screenshot Save Path255: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV255VideoColorSpace255Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255videoColorSpace255).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space255",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255videoColorSpace255 = value
        AppToast.show(this, "Video Color Space255: $value")
    }
}

internal fun PlayerActivity.showV255DanmakuBottomMaxCount318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v255danmakuBottomMaxCount318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v255danmakuBottomMaxCount318 = value
        AppToast.show(this, "Danmaku Bottom Max Count318: $value")
    }
}

internal fun PlayerActivity.showV255SubtitleBgBorder325Toggle() {
    val current = BiliClient.prefs.v255subtitleBgBorder325
    BiliClient.prefs.v255subtitleBgBorder325 = !current
    AppToast.show(this, "Subtitle Bg Border325: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV256AudioEQCustom256Toggle() {
    val current = BiliClient.prefs.v256audioEQCustom256
    BiliClient.prefs.v256audioEQCustom256 = !current
    AppToast.show(this, "Audio EQ Custom256: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV256DanmakuBottomMaxCount319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256danmakuBottomMaxCount319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256danmakuBottomMaxCount319 = value
        AppToast.show(this, "Danmaku Bottom Max Count319: $value")
    }
}

internal fun PlayerActivity.showV256SubtitleBgBorder326Toggle() {
    val current = BiliClient.prefs.v256subtitleBgBorder326
    BiliClient.prefs.v256subtitleBgBorder326 = !current
    AppToast.show(this, "Subtitle Bg Border326: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV256GestureShakeAction256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256gestureShakeAction256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256gestureShakeAction256 = value
        AppToast.show(this, "Gesture Shake Action256: $value")
    }
}

internal fun PlayerActivity.showV256CastAudioVolume256Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v256castAudioVolume256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256castAudioVolume256 = value
        AppToast.show(this, "Cast Audio Volume256: $value")
    }
}

internal fun PlayerActivity.showV256PlaylistAutoSkipOutro256Toggle() {
    val current = BiliClient.prefs.v256playlistAutoSkipOutro256
    BiliClient.prefs.v256playlistAutoSkipOutro256 = !current
    AppToast.show(this, "Playlist Auto Skip Outro256: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV256CacheDownloadSpeed257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256cacheDownloadSpeed257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256cacheDownloadSpeed257 = value
        AppToast.show(this, "Cache Download Speed257: $value")
    }
}

internal fun PlayerActivity.showV256ProgressBarThumbBorder256Toggle() {
    val current = BiliClient.prefs.v256progressBarThumbBorder256
    BiliClient.prefs.v256progressBarThumbBorder256 = !current
    AppToast.show(this, "Progress Bar Thumb Border256: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV256VolumeBoostPeak256Toggle() {
    val current = BiliClient.prefs.v256volumeBoostPeak256
    BiliClient.prefs.v256volumeBoostPeak256 = !current
    AppToast.show(this, "Volume Boost Peak256: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV256HistoryBookmarkExport256Toggle() {
    val current = BiliClient.prefs.v256historyBookmarkExport256
    BiliClient.prefs.v256historyBookmarkExport256 = !current
    AppToast.show(this, "History Bookmark Export256: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV256PlaybackChapterSync256Toggle() {
    val current = BiliClient.prefs.v256playbackChapterSync256
    BiliClient.prefs.v256playbackChapterSync256 = !current
    AppToast.show(this, "Playback Chapter Sync256: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV256ScreenshotSavePath256Toggle() {
    val current = BiliClient.prefs.v256screenshotSavePath256
    BiliClient.prefs.v256screenshotSavePath256 = !current
    AppToast.show(this, "Screenshot Save Path256: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV256VideoColorSpace256Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256videoColorSpace256).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space256",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256videoColorSpace256 = value
        AppToast.show(this, "Video Color Space256: $value")
    }
}

internal fun PlayerActivity.showV256DanmakuBottomMaxCount320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v256danmakuBottomMaxCount320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v256danmakuBottomMaxCount320 = value
        AppToast.show(this, "Danmaku Bottom Max Count320: $value")
    }
}

internal fun PlayerActivity.showV256SubtitleBgBorder327Toggle() {
    val current = BiliClient.prefs.v256subtitleBgBorder327
    BiliClient.prefs.v256subtitleBgBorder327 = !current
    AppToast.show(this, "Subtitle Bg Border327: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV257AudioEQCustom257Toggle() {
    val current = BiliClient.prefs.v257audioEQCustom257
    BiliClient.prefs.v257audioEQCustom257 = !current
    AppToast.show(this, "Audio EQ Custom257: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV257DanmakuBottomMaxCount321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257danmakuBottomMaxCount321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257danmakuBottomMaxCount321 = value
        AppToast.show(this, "Danmaku Bottom Max Count321: $value")
    }
}

internal fun PlayerActivity.showV257SubtitleBgBorder328Toggle() {
    val current = BiliClient.prefs.v257subtitleBgBorder328
    BiliClient.prefs.v257subtitleBgBorder328 = !current
    AppToast.show(this, "Subtitle Bg Border328: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV257GestureShakeAction257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257gestureShakeAction257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257gestureShakeAction257 = value
        AppToast.show(this, "Gesture Shake Action257: $value")
    }
}

internal fun PlayerActivity.showV257CastAudioVolume257Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v257castAudioVolume257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257castAudioVolume257 = value
        AppToast.show(this, "Cast Audio Volume257: $value")
    }
}

internal fun PlayerActivity.showV257PlaylistAutoSkipOutro257Toggle() {
    val current = BiliClient.prefs.v257playlistAutoSkipOutro257
    BiliClient.prefs.v257playlistAutoSkipOutro257 = !current
    AppToast.show(this, "Playlist Auto Skip Outro257: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV257CacheDownloadSpeed258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257cacheDownloadSpeed258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257cacheDownloadSpeed258 = value
        AppToast.show(this, "Cache Download Speed258: $value")
    }
}

internal fun PlayerActivity.showV257ProgressBarThumbBorder257Toggle() {
    val current = BiliClient.prefs.v257progressBarThumbBorder257
    BiliClient.prefs.v257progressBarThumbBorder257 = !current
    AppToast.show(this, "Progress Bar Thumb Border257: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV257VolumeBoostPeak257Toggle() {
    val current = BiliClient.prefs.v257volumeBoostPeak257
    BiliClient.prefs.v257volumeBoostPeak257 = !current
    AppToast.show(this, "Volume Boost Peak257: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV257HistoryBookmarkExport257Toggle() {
    val current = BiliClient.prefs.v257historyBookmarkExport257
    BiliClient.prefs.v257historyBookmarkExport257 = !current
    AppToast.show(this, "History Bookmark Export257: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV257PlaybackChapterSync257Toggle() {
    val current = BiliClient.prefs.v257playbackChapterSync257
    BiliClient.prefs.v257playbackChapterSync257 = !current
    AppToast.show(this, "Playback Chapter Sync257: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV257ScreenshotSavePath257Toggle() {
    val current = BiliClient.prefs.v257screenshotSavePath257
    BiliClient.prefs.v257screenshotSavePath257 = !current
    AppToast.show(this, "Screenshot Save Path257: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV257VideoColorSpace257Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257videoColorSpace257).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space257",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257videoColorSpace257 = value
        AppToast.show(this, "Video Color Space257: $value")
    }
}

internal fun PlayerActivity.showV257DanmakuBottomMaxCount322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v257danmakuBottomMaxCount322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v257danmakuBottomMaxCount322 = value
        AppToast.show(this, "Danmaku Bottom Max Count322: $value")
    }
}

internal fun PlayerActivity.showV257SubtitleBgBorder329Toggle() {
    val current = BiliClient.prefs.v257subtitleBgBorder329
    BiliClient.prefs.v257subtitleBgBorder329 = !current
    AppToast.show(this, "Subtitle Bg Border329: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV258AudioEQCustom258Toggle() {
    val current = BiliClient.prefs.v258audioEQCustom258
    BiliClient.prefs.v258audioEQCustom258 = !current
    AppToast.show(this, "Audio EQ Custom258: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV258DanmakuBottomMaxCount323Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258danmakuBottomMaxCount323).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count323",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258danmakuBottomMaxCount323 = value
        AppToast.show(this, "Danmaku Bottom Max Count323: $value")
    }
}

internal fun PlayerActivity.showV258SubtitleBgBorder330Toggle() {
    val current = BiliClient.prefs.v258subtitleBgBorder330
    BiliClient.prefs.v258subtitleBgBorder330 = !current
    AppToast.show(this, "Subtitle Bg Border330: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV258GestureShakeAction258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258gestureShakeAction258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258gestureShakeAction258 = value
        AppToast.show(this, "Gesture Shake Action258: $value")
    }
}

internal fun PlayerActivity.showV258CastAudioVolume258Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v258castAudioVolume258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258castAudioVolume258 = value
        AppToast.show(this, "Cast Audio Volume258: $value")
    }
}

internal fun PlayerActivity.showV258PlaylistAutoSkipOutro258Toggle() {
    val current = BiliClient.prefs.v258playlistAutoSkipOutro258
    BiliClient.prefs.v258playlistAutoSkipOutro258 = !current
    AppToast.show(this, "Playlist Auto Skip Outro258: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV258CacheDownloadSpeed259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258cacheDownloadSpeed259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258cacheDownloadSpeed259 = value
        AppToast.show(this, "Cache Download Speed259: $value")
    }
}

internal fun PlayerActivity.showV258ProgressBarThumbBorder258Toggle() {
    val current = BiliClient.prefs.v258progressBarThumbBorder258
    BiliClient.prefs.v258progressBarThumbBorder258 = !current
    AppToast.show(this, "Progress Bar Thumb Border258: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV258VolumeBoostPeak258Toggle() {
    val current = BiliClient.prefs.v258volumeBoostPeak258
    BiliClient.prefs.v258volumeBoostPeak258 = !current
    AppToast.show(this, "Volume Boost Peak258: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV258HistoryBookmarkExport258Toggle() {
    val current = BiliClient.prefs.v258historyBookmarkExport258
    BiliClient.prefs.v258historyBookmarkExport258 = !current
    AppToast.show(this, "History Bookmark Export258: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV258PlaybackChapterSync258Toggle() {
    val current = BiliClient.prefs.v258playbackChapterSync258
    BiliClient.prefs.v258playbackChapterSync258 = !current
    AppToast.show(this, "Playback Chapter Sync258: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV258ScreenshotSavePath258Toggle() {
    val current = BiliClient.prefs.v258screenshotSavePath258
    BiliClient.prefs.v258screenshotSavePath258 = !current
    AppToast.show(this, "Screenshot Save Path258: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV258VideoColorSpace258Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258videoColorSpace258).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space258",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258videoColorSpace258 = value
        AppToast.show(this, "Video Color Space258: $value")
    }
}

internal fun PlayerActivity.showV258DanmakuBottomMaxCount324Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v258danmakuBottomMaxCount324).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count324",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v258danmakuBottomMaxCount324 = value
        AppToast.show(this, "Danmaku Bottom Max Count324: $value")
    }
}

internal fun PlayerActivity.showV258SubtitleBgBorder331Toggle() {
    val current = BiliClient.prefs.v258subtitleBgBorder331
    BiliClient.prefs.v258subtitleBgBorder331 = !current
    AppToast.show(this, "Subtitle Bg Border331: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV259AudioEQCustom259Toggle() {
    val current = BiliClient.prefs.v259audioEQCustom259
    BiliClient.prefs.v259audioEQCustom259 = !current
    AppToast.show(this, "Audio EQ Custom259: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV259DanmakuBottomMaxCount325Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259danmakuBottomMaxCount325).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count325",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259danmakuBottomMaxCount325 = value
        AppToast.show(this, "Danmaku Bottom Max Count325: $value")
    }
}

internal fun PlayerActivity.showV259SubtitleBgBorder332Toggle() {
    val current = BiliClient.prefs.v259subtitleBgBorder332
    BiliClient.prefs.v259subtitleBgBorder332 = !current
    AppToast.show(this, "Subtitle Bg Border332: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV259GestureShakeAction259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259gestureShakeAction259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259gestureShakeAction259 = value
        AppToast.show(this, "Gesture Shake Action259: $value")
    }
}

internal fun PlayerActivity.showV259CastAudioVolume259Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v259castAudioVolume259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259castAudioVolume259 = value
        AppToast.show(this, "Cast Audio Volume259: $value")
    }
}

internal fun PlayerActivity.showV259PlaylistAutoSkipOutro259Toggle() {
    val current = BiliClient.prefs.v259playlistAutoSkipOutro259
    BiliClient.prefs.v259playlistAutoSkipOutro259 = !current
    AppToast.show(this, "Playlist Auto Skip Outro259: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV259CacheDownloadSpeed260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259cacheDownloadSpeed260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259cacheDownloadSpeed260 = value
        AppToast.show(this, "Cache Download Speed260: $value")
    }
}

internal fun PlayerActivity.showV259ProgressBarThumbBorder259Toggle() {
    val current = BiliClient.prefs.v259progressBarThumbBorder259
    BiliClient.prefs.v259progressBarThumbBorder259 = !current
    AppToast.show(this, "Progress Bar Thumb Border259: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV259VolumeBoostPeak259Toggle() {
    val current = BiliClient.prefs.v259volumeBoostPeak259
    BiliClient.prefs.v259volumeBoostPeak259 = !current
    AppToast.show(this, "Volume Boost Peak259: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV259HistoryBookmarkExport259Toggle() {
    val current = BiliClient.prefs.v259historyBookmarkExport259
    BiliClient.prefs.v259historyBookmarkExport259 = !current
    AppToast.show(this, "History Bookmark Export259: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV259PlaybackChapterSync259Toggle() {
    val current = BiliClient.prefs.v259playbackChapterSync259
    BiliClient.prefs.v259playbackChapterSync259 = !current
    AppToast.show(this, "Playback Chapter Sync259: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV259ScreenshotSavePath259Toggle() {
    val current = BiliClient.prefs.v259screenshotSavePath259
    BiliClient.prefs.v259screenshotSavePath259 = !current
    AppToast.show(this, "Screenshot Save Path259: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV259VideoColorSpace259Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259videoColorSpace259).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space259",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259videoColorSpace259 = value
        AppToast.show(this, "Video Color Space259: $value")
    }
}

internal fun PlayerActivity.showV259DanmakuBottomMaxCount326Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v259danmakuBottomMaxCount326).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count326",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v259danmakuBottomMaxCount326 = value
        AppToast.show(this, "Danmaku Bottom Max Count326: $value")
    }
}

internal fun PlayerActivity.showV259SubtitleBgBorder333Toggle() {
    val current = BiliClient.prefs.v259subtitleBgBorder333
    BiliClient.prefs.v259subtitleBgBorder333 = !current
    AppToast.show(this, "Subtitle Bg Border333: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV260AudioEQCustom260Toggle() {
    val current = BiliClient.prefs.v260audioEQCustom260
    BiliClient.prefs.v260audioEQCustom260 = !current
    AppToast.show(this, "Audio EQ Custom260: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV260DanmakuBottomMaxCount327Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260danmakuBottomMaxCount327).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count327",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260danmakuBottomMaxCount327 = value
        AppToast.show(this, "Danmaku Bottom Max Count327: $value")
    }
}

internal fun PlayerActivity.showV260SubtitleBgBorder334Toggle() {
    val current = BiliClient.prefs.v260subtitleBgBorder334
    BiliClient.prefs.v260subtitleBgBorder334 = !current
    AppToast.show(this, "Subtitle Bg Border334: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV260GestureShakeAction260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260gestureShakeAction260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260gestureShakeAction260 = value
        AppToast.show(this, "Gesture Shake Action260: $value")
    }
}

internal fun PlayerActivity.showV260CastAudioVolume260Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v260castAudioVolume260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260castAudioVolume260 = value
        AppToast.show(this, "Cast Audio Volume260: $value")
    }
}

internal fun PlayerActivity.showV260PlaylistAutoSkipOutro260Toggle() {
    val current = BiliClient.prefs.v260playlistAutoSkipOutro260
    BiliClient.prefs.v260playlistAutoSkipOutro260 = !current
    AppToast.show(this, "Playlist Auto Skip Outro260: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV260CacheDownloadSpeed261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260cacheDownloadSpeed261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260cacheDownloadSpeed261 = value
        AppToast.show(this, "Cache Download Speed261: $value")
    }
}

internal fun PlayerActivity.showV260ProgressBarThumbBorder260Toggle() {
    val current = BiliClient.prefs.v260progressBarThumbBorder260
    BiliClient.prefs.v260progressBarThumbBorder260 = !current
    AppToast.show(this, "Progress Bar Thumb Border260: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV260VolumeBoostPeak260Toggle() {
    val current = BiliClient.prefs.v260volumeBoostPeak260
    BiliClient.prefs.v260volumeBoostPeak260 = !current
    AppToast.show(this, "Volume Boost Peak260: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV260HistoryBookmarkExport260Toggle() {
    val current = BiliClient.prefs.v260historyBookmarkExport260
    BiliClient.prefs.v260historyBookmarkExport260 = !current
    AppToast.show(this, "History Bookmark Export260: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV260PlaybackChapterSync260Toggle() {
    val current = BiliClient.prefs.v260playbackChapterSync260
    BiliClient.prefs.v260playbackChapterSync260 = !current
    AppToast.show(this, "Playback Chapter Sync260: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV260ScreenshotSavePath260Toggle() {
    val current = BiliClient.prefs.v260screenshotSavePath260
    BiliClient.prefs.v260screenshotSavePath260 = !current
    AppToast.show(this, "Screenshot Save Path260: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV260VideoColorSpace260Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260videoColorSpace260).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space260",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260videoColorSpace260 = value
        AppToast.show(this, "Video Color Space260: $value")
    }
}

internal fun PlayerActivity.showV260DanmakuBottomMaxCount328Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v260danmakuBottomMaxCount328).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count328",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v260danmakuBottomMaxCount328 = value
        AppToast.show(this, "Danmaku Bottom Max Count328: $value")
    }
}

internal fun PlayerActivity.showV260SubtitleBgBorder335Toggle() {
    val current = BiliClient.prefs.v260subtitleBgBorder335
    BiliClient.prefs.v260subtitleBgBorder335 = !current
    AppToast.show(this, "Subtitle Bg Border335: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV261AudioEQCustom261Toggle() {
    val current = BiliClient.prefs.v261audioEQCustom261
    BiliClient.prefs.v261audioEQCustom261 = !current
    AppToast.show(this, "Audio EQ Custom261: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV261DanmakuBottomMaxCount329Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261danmakuBottomMaxCount329).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count329",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261danmakuBottomMaxCount329 = value
        AppToast.show(this, "Danmaku Bottom Max Count329: $value")
    }
}

internal fun PlayerActivity.showV261SubtitleBgBorder336Toggle() {
    val current = BiliClient.prefs.v261subtitleBgBorder336
    BiliClient.prefs.v261subtitleBgBorder336 = !current
    AppToast.show(this, "Subtitle Bg Border336: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV261GestureShakeAction261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261gestureShakeAction261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261gestureShakeAction261 = value
        AppToast.show(this, "Gesture Shake Action261: $value")
    }
}

internal fun PlayerActivity.showV261CastAudioVolume261Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v261castAudioVolume261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261castAudioVolume261 = value
        AppToast.show(this, "Cast Audio Volume261: $value")
    }
}

internal fun PlayerActivity.showV261PlaylistAutoSkipOutro261Toggle() {
    val current = BiliClient.prefs.v261playlistAutoSkipOutro261
    BiliClient.prefs.v261playlistAutoSkipOutro261 = !current
    AppToast.show(this, "Playlist Auto Skip Outro261: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV261CacheDownloadSpeed262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261cacheDownloadSpeed262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261cacheDownloadSpeed262 = value
        AppToast.show(this, "Cache Download Speed262: $value")
    }
}

internal fun PlayerActivity.showV261ProgressBarThumbBorder261Toggle() {
    val current = BiliClient.prefs.v261progressBarThumbBorder261
    BiliClient.prefs.v261progressBarThumbBorder261 = !current
    AppToast.show(this, "Progress Bar Thumb Border261: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV261VolumeBoostPeak261Toggle() {
    val current = BiliClient.prefs.v261volumeBoostPeak261
    BiliClient.prefs.v261volumeBoostPeak261 = !current
    AppToast.show(this, "Volume Boost Peak261: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV261HistoryBookmarkExport261Toggle() {
    val current = BiliClient.prefs.v261historyBookmarkExport261
    BiliClient.prefs.v261historyBookmarkExport261 = !current
    AppToast.show(this, "History Bookmark Export261: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV261PlaybackChapterSync261Toggle() {
    val current = BiliClient.prefs.v261playbackChapterSync261
    BiliClient.prefs.v261playbackChapterSync261 = !current
    AppToast.show(this, "Playback Chapter Sync261: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV261ScreenshotSavePath261Toggle() {
    val current = BiliClient.prefs.v261screenshotSavePath261
    BiliClient.prefs.v261screenshotSavePath261 = !current
    AppToast.show(this, "Screenshot Save Path261: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV261VideoColorSpace261Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261videoColorSpace261).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space261",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261videoColorSpace261 = value
        AppToast.show(this, "Video Color Space261: $value")
    }
}

internal fun PlayerActivity.showV261DanmakuBottomMaxCount330Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v261danmakuBottomMaxCount330).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count330",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v261danmakuBottomMaxCount330 = value
        AppToast.show(this, "Danmaku Bottom Max Count330: $value")
    }
}

internal fun PlayerActivity.showV261SubtitleBgBorder337Toggle() {
    val current = BiliClient.prefs.v261subtitleBgBorder337
    BiliClient.prefs.v261subtitleBgBorder337 = !current
    AppToast.show(this, "Subtitle Bg Border337: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV262AudioEQCustom262Toggle() {
    val current = BiliClient.prefs.v262audioEQCustom262
    BiliClient.prefs.v262audioEQCustom262 = !current
    AppToast.show(this, "Audio EQ Custom262: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV262DanmakuBottomMaxCount331Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262danmakuBottomMaxCount331).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count331",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262danmakuBottomMaxCount331 = value
        AppToast.show(this, "Danmaku Bottom Max Count331: $value")
    }
}

internal fun PlayerActivity.showV262SubtitleBgBorder338Toggle() {
    val current = BiliClient.prefs.v262subtitleBgBorder338
    BiliClient.prefs.v262subtitleBgBorder338 = !current
    AppToast.show(this, "Subtitle Bg Border338: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV262GestureShakeAction262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262gestureShakeAction262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262gestureShakeAction262 = value
        AppToast.show(this, "Gesture Shake Action262: $value")
    }
}

internal fun PlayerActivity.showV262CastAudioVolume262Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v262castAudioVolume262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262castAudioVolume262 = value
        AppToast.show(this, "Cast Audio Volume262: $value")
    }
}

internal fun PlayerActivity.showV262PlaylistAutoSkipOutro262Toggle() {
    val current = BiliClient.prefs.v262playlistAutoSkipOutro262
    BiliClient.prefs.v262playlistAutoSkipOutro262 = !current
    AppToast.show(this, "Playlist Auto Skip Outro262: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV262CacheDownloadSpeed263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262cacheDownloadSpeed263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262cacheDownloadSpeed263 = value
        AppToast.show(this, "Cache Download Speed263: $value")
    }
}

internal fun PlayerActivity.showV262ProgressBarThumbBorder262Toggle() {
    val current = BiliClient.prefs.v262progressBarThumbBorder262
    BiliClient.prefs.v262progressBarThumbBorder262 = !current
    AppToast.show(this, "Progress Bar Thumb Border262: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV262VolumeBoostPeak262Toggle() {
    val current = BiliClient.prefs.v262volumeBoostPeak262
    BiliClient.prefs.v262volumeBoostPeak262 = !current
    AppToast.show(this, "Volume Boost Peak262: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV262HistoryBookmarkExport262Toggle() {
    val current = BiliClient.prefs.v262historyBookmarkExport262
    BiliClient.prefs.v262historyBookmarkExport262 = !current
    AppToast.show(this, "History Bookmark Export262: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV262PlaybackChapterSync262Toggle() {
    val current = BiliClient.prefs.v262playbackChapterSync262
    BiliClient.prefs.v262playbackChapterSync262 = !current
    AppToast.show(this, "Playback Chapter Sync262: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV262ScreenshotSavePath262Toggle() {
    val current = BiliClient.prefs.v262screenshotSavePath262
    BiliClient.prefs.v262screenshotSavePath262 = !current
    AppToast.show(this, "Screenshot Save Path262: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV262VideoColorSpace262Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262videoColorSpace262).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space262",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262videoColorSpace262 = value
        AppToast.show(this, "Video Color Space262: $value")
    }
}

internal fun PlayerActivity.showV262DanmakuBottomMaxCount332Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v262danmakuBottomMaxCount332).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count332",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v262danmakuBottomMaxCount332 = value
        AppToast.show(this, "Danmaku Bottom Max Count332: $value")
    }
}

internal fun PlayerActivity.showV262SubtitleBgBorder339Toggle() {
    val current = BiliClient.prefs.v262subtitleBgBorder339
    BiliClient.prefs.v262subtitleBgBorder339 = !current
    AppToast.show(this, "Subtitle Bg Border339: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV263AudioEQCustom263Toggle() {
    val current = BiliClient.prefs.v263audioEQCustom263
    BiliClient.prefs.v263audioEQCustom263 = !current
    AppToast.show(this, "Audio EQ Custom263: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV263DanmakuBottomMaxCount333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263danmakuBottomMaxCount333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263danmakuBottomMaxCount333 = value
        AppToast.show(this, "Danmaku Bottom Max Count333: $value")
    }
}

internal fun PlayerActivity.showV263SubtitleBgBorder340Toggle() {
    val current = BiliClient.prefs.v263subtitleBgBorder340
    BiliClient.prefs.v263subtitleBgBorder340 = !current
    AppToast.show(this, "Subtitle Bg Border340: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV263GestureShakeAction263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263gestureShakeAction263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263gestureShakeAction263 = value
        AppToast.show(this, "Gesture Shake Action263: $value")
    }
}

internal fun PlayerActivity.showV263CastAudioVolume263Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v263castAudioVolume263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263castAudioVolume263 = value
        AppToast.show(this, "Cast Audio Volume263: $value")
    }
}

internal fun PlayerActivity.showV263PlaylistAutoSkipOutro263Toggle() {
    val current = BiliClient.prefs.v263playlistAutoSkipOutro263
    BiliClient.prefs.v263playlistAutoSkipOutro263 = !current
    AppToast.show(this, "Playlist Auto Skip Outro263: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV263CacheDownloadSpeed264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263cacheDownloadSpeed264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263cacheDownloadSpeed264 = value
        AppToast.show(this, "Cache Download Speed264: $value")
    }
}

internal fun PlayerActivity.showV263ProgressBarThumbBorder263Toggle() {
    val current = BiliClient.prefs.v263progressBarThumbBorder263
    BiliClient.prefs.v263progressBarThumbBorder263 = !current
    AppToast.show(this, "Progress Bar Thumb Border263: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV263VolumeBoostPeak263Toggle() {
    val current = BiliClient.prefs.v263volumeBoostPeak263
    BiliClient.prefs.v263volumeBoostPeak263 = !current
    AppToast.show(this, "Volume Boost Peak263: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV263HistoryBookmarkExport263Toggle() {
    val current = BiliClient.prefs.v263historyBookmarkExport263
    BiliClient.prefs.v263historyBookmarkExport263 = !current
    AppToast.show(this, "History Bookmark Export263: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV263PlaybackChapterSync263Toggle() {
    val current = BiliClient.prefs.v263playbackChapterSync263
    BiliClient.prefs.v263playbackChapterSync263 = !current
    AppToast.show(this, "Playback Chapter Sync263: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV263ScreenshotSavePath263Toggle() {
    val current = BiliClient.prefs.v263screenshotSavePath263
    BiliClient.prefs.v263screenshotSavePath263 = !current
    AppToast.show(this, "Screenshot Save Path263: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV263VideoColorSpace263Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263videoColorSpace263).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space263",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263videoColorSpace263 = value
        AppToast.show(this, "Video Color Space263: $value")
    }
}

internal fun PlayerActivity.showV263DanmakuBottomMaxCount334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v263danmakuBottomMaxCount334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v263danmakuBottomMaxCount334 = value
        AppToast.show(this, "Danmaku Bottom Max Count334: $value")
    }
}

internal fun PlayerActivity.showV263SubtitleBgBorder341Toggle() {
    val current = BiliClient.prefs.v263subtitleBgBorder341
    BiliClient.prefs.v263subtitleBgBorder341 = !current
    AppToast.show(this, "Subtitle Bg Border341: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV264AudioEQCustom264Toggle() {
    val current = BiliClient.prefs.v264audioEQCustom264
    BiliClient.prefs.v264audioEQCustom264 = !current
    AppToast.show(this, "Audio EQ Custom264: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV264DanmakuBottomMaxCount335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264danmakuBottomMaxCount335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264danmakuBottomMaxCount335 = value
        AppToast.show(this, "Danmaku Bottom Max Count335: $value")
    }
}

internal fun PlayerActivity.showV264SubtitleBgBorder342Toggle() {
    val current = BiliClient.prefs.v264subtitleBgBorder342
    BiliClient.prefs.v264subtitleBgBorder342 = !current
    AppToast.show(this, "Subtitle Bg Border342: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV264GestureShakeAction264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264gestureShakeAction264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264gestureShakeAction264 = value
        AppToast.show(this, "Gesture Shake Action264: $value")
    }
}

internal fun PlayerActivity.showV264CastAudioVolume264Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v264castAudioVolume264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264castAudioVolume264 = value
        AppToast.show(this, "Cast Audio Volume264: $value")
    }
}

internal fun PlayerActivity.showV264PlaylistAutoSkipOutro264Toggle() {
    val current = BiliClient.prefs.v264playlistAutoSkipOutro264
    BiliClient.prefs.v264playlistAutoSkipOutro264 = !current
    AppToast.show(this, "Playlist Auto Skip Outro264: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV264CacheDownloadSpeed265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264cacheDownloadSpeed265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264cacheDownloadSpeed265 = value
        AppToast.show(this, "Cache Download Speed265: $value")
    }
}

internal fun PlayerActivity.showV264ProgressBarThumbBorder264Toggle() {
    val current = BiliClient.prefs.v264progressBarThumbBorder264
    BiliClient.prefs.v264progressBarThumbBorder264 = !current
    AppToast.show(this, "Progress Bar Thumb Border264: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV264VolumeBoostPeak264Toggle() {
    val current = BiliClient.prefs.v264volumeBoostPeak264
    BiliClient.prefs.v264volumeBoostPeak264 = !current
    AppToast.show(this, "Volume Boost Peak264: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV264HistoryBookmarkExport264Toggle() {
    val current = BiliClient.prefs.v264historyBookmarkExport264
    BiliClient.prefs.v264historyBookmarkExport264 = !current
    AppToast.show(this, "History Bookmark Export264: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV264PlaybackChapterSync264Toggle() {
    val current = BiliClient.prefs.v264playbackChapterSync264
    BiliClient.prefs.v264playbackChapterSync264 = !current
    AppToast.show(this, "Playback Chapter Sync264: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV264ScreenshotSavePath264Toggle() {
    val current = BiliClient.prefs.v264screenshotSavePath264
    BiliClient.prefs.v264screenshotSavePath264 = !current
    AppToast.show(this, "Screenshot Save Path264: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV264VideoColorSpace264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264videoColorSpace264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264videoColorSpace264 = value
        AppToast.show(this, "Video Color Space264: $value")
    }
}

internal fun PlayerActivity.showV264DanmakuBottomMaxCount336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v264danmakuBottomMaxCount336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v264danmakuBottomMaxCount336 = value
        AppToast.show(this, "Danmaku Bottom Max Count336: $value")
    }
}

internal fun PlayerActivity.showV264SubtitleBgBorder343Toggle() {
    val current = BiliClient.prefs.v264subtitleBgBorder343
    BiliClient.prefs.v264subtitleBgBorder343 = !current
    AppToast.show(this, "Subtitle Bg Border343: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV265AudioEQCustom265Toggle() {
    val current = BiliClient.prefs.v265audioEQCustom265
    BiliClient.prefs.v265audioEQCustom265 = !current
    AppToast.show(this, "Audio EQ Custom265: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV265DanmakuBottomMaxCount337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265danmakuBottomMaxCount337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265danmakuBottomMaxCount337 = value
        AppToast.show(this, "Danmaku Bottom Max Count337: $value")
    }
}

internal fun PlayerActivity.showV265SubtitleBgBorder344Toggle() {
    val current = BiliClient.prefs.v265subtitleBgBorder344
    BiliClient.prefs.v265subtitleBgBorder344 = !current
    AppToast.show(this, "Subtitle Bg Border344: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV265GestureShakeAction265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265gestureShakeAction265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265gestureShakeAction265 = value
        AppToast.show(this, "Gesture Shake Action265: $value")
    }
}

internal fun PlayerActivity.showV265CastAudioVolume265Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v265castAudioVolume265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265castAudioVolume265 = value
        AppToast.show(this, "Cast Audio Volume265: $value")
    }
}

internal fun PlayerActivity.showV265PlaylistAutoSkipOutro265Toggle() {
    val current = BiliClient.prefs.v265playlistAutoSkipOutro265
    BiliClient.prefs.v265playlistAutoSkipOutro265 = !current
    AppToast.show(this, "Playlist Auto Skip Outro265: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV265CacheDownloadSpeed266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265cacheDownloadSpeed266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265cacheDownloadSpeed266 = value
        AppToast.show(this, "Cache Download Speed266: $value")
    }
}

internal fun PlayerActivity.showV265ProgressBarThumbBorder265Toggle() {
    val current = BiliClient.prefs.v265progressBarThumbBorder265
    BiliClient.prefs.v265progressBarThumbBorder265 = !current
    AppToast.show(this, "Progress Bar Thumb Border265: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV265VolumeBoostPeak265Toggle() {
    val current = BiliClient.prefs.v265volumeBoostPeak265
    BiliClient.prefs.v265volumeBoostPeak265 = !current
    AppToast.show(this, "Volume Boost Peak265: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV265HistoryBookmarkExport265Toggle() {
    val current = BiliClient.prefs.v265historyBookmarkExport265
    BiliClient.prefs.v265historyBookmarkExport265 = !current
    AppToast.show(this, "History Bookmark Export265: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV265PlaybackChapterSync265Toggle() {
    val current = BiliClient.prefs.v265playbackChapterSync265
    BiliClient.prefs.v265playbackChapterSync265 = !current
    AppToast.show(this, "Playback Chapter Sync265: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV265ScreenshotSavePath265Toggle() {
    val current = BiliClient.prefs.v265screenshotSavePath265
    BiliClient.prefs.v265screenshotSavePath265 = !current
    AppToast.show(this, "Screenshot Save Path265: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV265VideoColorSpace265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265videoColorSpace265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265videoColorSpace265 = value
        AppToast.show(this, "Video Color Space265: $value")
    }
}

internal fun PlayerActivity.showV265DanmakuBottomMaxCount338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v265danmakuBottomMaxCount338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v265danmakuBottomMaxCount338 = value
        AppToast.show(this, "Danmaku Bottom Max Count338: $value")
    }
}

internal fun PlayerActivity.showV265SubtitleBgBorder345Toggle() {
    val current = BiliClient.prefs.v265subtitleBgBorder345
    BiliClient.prefs.v265subtitleBgBorder345 = !current
    AppToast.show(this, "Subtitle Bg Border345: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV266AudioEQCustom266Toggle() {
    val current = BiliClient.prefs.v266audioEQCustom266
    BiliClient.prefs.v266audioEQCustom266 = !current
    AppToast.show(this, "Audio EQ Custom266: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV266DanmakuBottomMaxCount339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266danmakuBottomMaxCount339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266danmakuBottomMaxCount339 = value
        AppToast.show(this, "Danmaku Bottom Max Count339: $value")
    }
}

internal fun PlayerActivity.showV266SubtitleBgBorder346Toggle() {
    val current = BiliClient.prefs.v266subtitleBgBorder346
    BiliClient.prefs.v266subtitleBgBorder346 = !current
    AppToast.show(this, "Subtitle Bg Border346: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV266GestureShakeAction266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266gestureShakeAction266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266gestureShakeAction266 = value
        AppToast.show(this, "Gesture Shake Action266: $value")
    }
}

internal fun PlayerActivity.showV266CastAudioVolume266Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v266castAudioVolume266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266castAudioVolume266 = value
        AppToast.show(this, "Cast Audio Volume266: $value")
    }
}

internal fun PlayerActivity.showV266PlaylistAutoSkipOutro266Toggle() {
    val current = BiliClient.prefs.v266playlistAutoSkipOutro266
    BiliClient.prefs.v266playlistAutoSkipOutro266 = !current
    AppToast.show(this, "Playlist Auto Skip Outro266: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV266CacheDownloadSpeed267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266cacheDownloadSpeed267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266cacheDownloadSpeed267 = value
        AppToast.show(this, "Cache Download Speed267: $value")
    }
}

internal fun PlayerActivity.showV266ProgressBarThumbBorder266Toggle() {
    val current = BiliClient.prefs.v266progressBarThumbBorder266
    BiliClient.prefs.v266progressBarThumbBorder266 = !current
    AppToast.show(this, "Progress Bar Thumb Border266: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV266VolumeBoostPeak266Toggle() {
    val current = BiliClient.prefs.v266volumeBoostPeak266
    BiliClient.prefs.v266volumeBoostPeak266 = !current
    AppToast.show(this, "Volume Boost Peak266: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV266HistoryBookmarkExport266Toggle() {
    val current = BiliClient.prefs.v266historyBookmarkExport266
    BiliClient.prefs.v266historyBookmarkExport266 = !current
    AppToast.show(this, "History Bookmark Export266: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV266PlaybackChapterSync266Toggle() {
    val current = BiliClient.prefs.v266playbackChapterSync266
    BiliClient.prefs.v266playbackChapterSync266 = !current
    AppToast.show(this, "Playback Chapter Sync266: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV266ScreenshotSavePath266Toggle() {
    val current = BiliClient.prefs.v266screenshotSavePath266
    BiliClient.prefs.v266screenshotSavePath266 = !current
    AppToast.show(this, "Screenshot Save Path266: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV266VideoColorSpace266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266videoColorSpace266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266videoColorSpace266 = value
        AppToast.show(this, "Video Color Space266: $value")
    }
}

internal fun PlayerActivity.showV266DanmakuBottomMaxCount340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v266danmakuBottomMaxCount340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v266danmakuBottomMaxCount340 = value
        AppToast.show(this, "Danmaku Bottom Max Count340: $value")
    }
}

internal fun PlayerActivity.showV266SubtitleBgBorder347Toggle() {
    val current = BiliClient.prefs.v266subtitleBgBorder347
    BiliClient.prefs.v266subtitleBgBorder347 = !current
    AppToast.show(this, "Subtitle Bg Border347: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV267AudioEQCustom267Toggle() {
    val current = BiliClient.prefs.v267audioEQCustom267
    BiliClient.prefs.v267audioEQCustom267 = !current
    AppToast.show(this, "Audio EQ Custom267: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV267DanmakuBottomMaxCount341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267danmakuBottomMaxCount341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267danmakuBottomMaxCount341 = value
        AppToast.show(this, "Danmaku Bottom Max Count341: $value")
    }
}

internal fun PlayerActivity.showV267SubtitleBgBorder348Toggle() {
    val current = BiliClient.prefs.v267subtitleBgBorder348
    BiliClient.prefs.v267subtitleBgBorder348 = !current
    AppToast.show(this, "Subtitle Bg Border348: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV267GestureShakeAction267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267gestureShakeAction267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267gestureShakeAction267 = value
        AppToast.show(this, "Gesture Shake Action267: $value")
    }
}

internal fun PlayerActivity.showV267CastAudioVolume267Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v267castAudioVolume267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267castAudioVolume267 = value
        AppToast.show(this, "Cast Audio Volume267: $value")
    }
}

internal fun PlayerActivity.showV267PlaylistAutoSkipOutro267Toggle() {
    val current = BiliClient.prefs.v267playlistAutoSkipOutro267
    BiliClient.prefs.v267playlistAutoSkipOutro267 = !current
    AppToast.show(this, "Playlist Auto Skip Outro267: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV267CacheDownloadSpeed268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267cacheDownloadSpeed268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267cacheDownloadSpeed268 = value
        AppToast.show(this, "Cache Download Speed268: $value")
    }
}

internal fun PlayerActivity.showV267ProgressBarThumbBorder267Toggle() {
    val current = BiliClient.prefs.v267progressBarThumbBorder267
    BiliClient.prefs.v267progressBarThumbBorder267 = !current
    AppToast.show(this, "Progress Bar Thumb Border267: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV267VolumeBoostPeak267Toggle() {
    val current = BiliClient.prefs.v267volumeBoostPeak267
    BiliClient.prefs.v267volumeBoostPeak267 = !current
    AppToast.show(this, "Volume Boost Peak267: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV267HistoryBookmarkExport267Toggle() {
    val current = BiliClient.prefs.v267historyBookmarkExport267
    BiliClient.prefs.v267historyBookmarkExport267 = !current
    AppToast.show(this, "History Bookmark Export267: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV267PlaybackChapterSync267Toggle() {
    val current = BiliClient.prefs.v267playbackChapterSync267
    BiliClient.prefs.v267playbackChapterSync267 = !current
    AppToast.show(this, "Playback Chapter Sync267: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV267ScreenshotSavePath267Toggle() {
    val current = BiliClient.prefs.v267screenshotSavePath267
    BiliClient.prefs.v267screenshotSavePath267 = !current
    AppToast.show(this, "Screenshot Save Path267: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV267VideoColorSpace267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267videoColorSpace267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267videoColorSpace267 = value
        AppToast.show(this, "Video Color Space267: $value")
    }
}

internal fun PlayerActivity.showV267DanmakuBottomMaxCount342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v267danmakuBottomMaxCount342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v267danmakuBottomMaxCount342 = value
        AppToast.show(this, "Danmaku Bottom Max Count342: $value")
    }
}

internal fun PlayerActivity.showV267SubtitleBgBorder349Toggle() {
    val current = BiliClient.prefs.v267subtitleBgBorder349
    BiliClient.prefs.v267subtitleBgBorder349 = !current
    AppToast.show(this, "Subtitle Bg Border349: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV268AudioEQCustom268Toggle() {
    val current = BiliClient.prefs.v268audioEQCustom268
    BiliClient.prefs.v268audioEQCustom268 = !current
    AppToast.show(this, "Audio EQ Custom268: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV268DanmakuBottomMaxCount343Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268danmakuBottomMaxCount343).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count343",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268danmakuBottomMaxCount343 = value
        AppToast.show(this, "Danmaku Bottom Max Count343: $value")
    }
}

internal fun PlayerActivity.showV268SubtitleBgBorder350Toggle() {
    val current = BiliClient.prefs.v268subtitleBgBorder350
    BiliClient.prefs.v268subtitleBgBorder350 = !current
    AppToast.show(this, "Subtitle Bg Border350: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV268GestureShakeAction268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268gestureShakeAction268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268gestureShakeAction268 = value
        AppToast.show(this, "Gesture Shake Action268: $value")
    }
}

internal fun PlayerActivity.showV268CastAudioVolume268Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v268castAudioVolume268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268castAudioVolume268 = value
        AppToast.show(this, "Cast Audio Volume268: $value")
    }
}

internal fun PlayerActivity.showV268PlaylistAutoSkipOutro268Toggle() {
    val current = BiliClient.prefs.v268playlistAutoSkipOutro268
    BiliClient.prefs.v268playlistAutoSkipOutro268 = !current
    AppToast.show(this, "Playlist Auto Skip Outro268: ${if (!current) "ON" else "OFF"}")
}

