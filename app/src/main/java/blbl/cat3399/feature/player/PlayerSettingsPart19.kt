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

internal fun PlayerActivity.showV268CacheDownloadSpeed269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268cacheDownloadSpeed269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268cacheDownloadSpeed269 = value
        AppToast.show(this, "Cache Download Speed269: $value")
    }
}

internal fun PlayerActivity.showV268ProgressBarThumbBorder268Toggle() {
    val current = BiliClient.prefs.v268progressBarThumbBorder268
    BiliClient.prefs.v268progressBarThumbBorder268 = !current
    AppToast.show(this, "Progress Bar Thumb Border268: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV268VolumeBoostPeak268Toggle() {
    val current = BiliClient.prefs.v268volumeBoostPeak268
    BiliClient.prefs.v268volumeBoostPeak268 = !current
    AppToast.show(this, "Volume Boost Peak268: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV268HistoryBookmarkExport268Toggle() {
    val current = BiliClient.prefs.v268historyBookmarkExport268
    BiliClient.prefs.v268historyBookmarkExport268 = !current
    AppToast.show(this, "History Bookmark Export268: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV268PlaybackChapterSync268Toggle() {
    val current = BiliClient.prefs.v268playbackChapterSync268
    BiliClient.prefs.v268playbackChapterSync268 = !current
    AppToast.show(this, "Playback Chapter Sync268: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV268ScreenshotSavePath268Toggle() {
    val current = BiliClient.prefs.v268screenshotSavePath268
    BiliClient.prefs.v268screenshotSavePath268 = !current
    AppToast.show(this, "Screenshot Save Path268: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV268VideoColorSpace268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268videoColorSpace268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268videoColorSpace268 = value
        AppToast.show(this, "Video Color Space268: $value")
    }
}

internal fun PlayerActivity.showV268DanmakuBottomMaxCount344Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v268danmakuBottomMaxCount344).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count344",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v268danmakuBottomMaxCount344 = value
        AppToast.show(this, "Danmaku Bottom Max Count344: $value")
    }
}

internal fun PlayerActivity.showV268SubtitleBgBorder351Toggle() {
    val current = BiliClient.prefs.v268subtitleBgBorder351
    BiliClient.prefs.v268subtitleBgBorder351 = !current
    AppToast.show(this, "Subtitle Bg Border351: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV269AudioEQCustom269Toggle() {
    val current = BiliClient.prefs.v269audioEQCustom269
    BiliClient.prefs.v269audioEQCustom269 = !current
    AppToast.show(this, "Audio EQ Custom269: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV269DanmakuBottomMaxCount345Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269danmakuBottomMaxCount345).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count345",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269danmakuBottomMaxCount345 = value
        AppToast.show(this, "Danmaku Bottom Max Count345: $value")
    }
}

internal fun PlayerActivity.showV269SubtitleBgBorder352Toggle() {
    val current = BiliClient.prefs.v269subtitleBgBorder352
    BiliClient.prefs.v269subtitleBgBorder352 = !current
    AppToast.show(this, "Subtitle Bg Border352: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV269GestureShakeAction269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269gestureShakeAction269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269gestureShakeAction269 = value
        AppToast.show(this, "Gesture Shake Action269: $value")
    }
}

internal fun PlayerActivity.showV269CastAudioVolume269Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v269castAudioVolume269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269castAudioVolume269 = value
        AppToast.show(this, "Cast Audio Volume269: $value")
    }
}

internal fun PlayerActivity.showV269PlaylistAutoSkipOutro269Toggle() {
    val current = BiliClient.prefs.v269playlistAutoSkipOutro269
    BiliClient.prefs.v269playlistAutoSkipOutro269 = !current
    AppToast.show(this, "Playlist Auto Skip Outro269: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV269CacheDownloadSpeed270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269cacheDownloadSpeed270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269cacheDownloadSpeed270 = value
        AppToast.show(this, "Cache Download Speed270: $value")
    }
}

internal fun PlayerActivity.showV269ProgressBarThumbBorder269Toggle() {
    val current = BiliClient.prefs.v269progressBarThumbBorder269
    BiliClient.prefs.v269progressBarThumbBorder269 = !current
    AppToast.show(this, "Progress Bar Thumb Border269: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV269VolumeBoostPeak269Toggle() {
    val current = BiliClient.prefs.v269volumeBoostPeak269
    BiliClient.prefs.v269volumeBoostPeak269 = !current
    AppToast.show(this, "Volume Boost Peak269: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV269HistoryBookmarkExport269Toggle() {
    val current = BiliClient.prefs.v269historyBookmarkExport269
    BiliClient.prefs.v269historyBookmarkExport269 = !current
    AppToast.show(this, "History Bookmark Export269: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV269PlaybackChapterSync269Toggle() {
    val current = BiliClient.prefs.v269playbackChapterSync269
    BiliClient.prefs.v269playbackChapterSync269 = !current
    AppToast.show(this, "Playback Chapter Sync269: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV269ScreenshotSavePath269Toggle() {
    val current = BiliClient.prefs.v269screenshotSavePath269
    BiliClient.prefs.v269screenshotSavePath269 = !current
    AppToast.show(this, "Screenshot Save Path269: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV269VideoColorSpace269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269videoColorSpace269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269videoColorSpace269 = value
        AppToast.show(this, "Video Color Space269: $value")
    }
}

internal fun PlayerActivity.showV269DanmakuBottomMaxCount346Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v269danmakuBottomMaxCount346).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count346",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v269danmakuBottomMaxCount346 = value
        AppToast.show(this, "Danmaku Bottom Max Count346: $value")
    }
}

internal fun PlayerActivity.showV269SubtitleBgBorder353Toggle() {
    val current = BiliClient.prefs.v269subtitleBgBorder353
    BiliClient.prefs.v269subtitleBgBorder353 = !current
    AppToast.show(this, "Subtitle Bg Border353: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV270AudioEQCustom270Toggle() {
    val current = BiliClient.prefs.v270audioEQCustom270
    BiliClient.prefs.v270audioEQCustom270 = !current
    AppToast.show(this, "Audio EQ Custom270: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV270DanmakuBottomMaxCount347Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270danmakuBottomMaxCount347).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count347",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270danmakuBottomMaxCount347 = value
        AppToast.show(this, "Danmaku Bottom Max Count347: $value")
    }
}

internal fun PlayerActivity.showV270SubtitleBgBorder354Toggle() {
    val current = BiliClient.prefs.v270subtitleBgBorder354
    BiliClient.prefs.v270subtitleBgBorder354 = !current
    AppToast.show(this, "Subtitle Bg Border354: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV270GestureShakeAction270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270gestureShakeAction270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270gestureShakeAction270 = value
        AppToast.show(this, "Gesture Shake Action270: $value")
    }
}

internal fun PlayerActivity.showV270CastAudioVolume270Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v270castAudioVolume270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270castAudioVolume270 = value
        AppToast.show(this, "Cast Audio Volume270: $value")
    }
}

internal fun PlayerActivity.showV270PlaylistAutoSkipOutro270Toggle() {
    val current = BiliClient.prefs.v270playlistAutoSkipOutro270
    BiliClient.prefs.v270playlistAutoSkipOutro270 = !current
    AppToast.show(this, "Playlist Auto Skip Outro270: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV270CacheDownloadSpeed271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270cacheDownloadSpeed271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270cacheDownloadSpeed271 = value
        AppToast.show(this, "Cache Download Speed271: $value")
    }
}

internal fun PlayerActivity.showV270ProgressBarThumbBorder270Toggle() {
    val current = BiliClient.prefs.v270progressBarThumbBorder270
    BiliClient.prefs.v270progressBarThumbBorder270 = !current
    AppToast.show(this, "Progress Bar Thumb Border270: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV270VolumeBoostPeak270Toggle() {
    val current = BiliClient.prefs.v270volumeBoostPeak270
    BiliClient.prefs.v270volumeBoostPeak270 = !current
    AppToast.show(this, "Volume Boost Peak270: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV270HistoryBookmarkExport270Toggle() {
    val current = BiliClient.prefs.v270historyBookmarkExport270
    BiliClient.prefs.v270historyBookmarkExport270 = !current
    AppToast.show(this, "History Bookmark Export270: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV270PlaybackChapterSync270Toggle() {
    val current = BiliClient.prefs.v270playbackChapterSync270
    BiliClient.prefs.v270playbackChapterSync270 = !current
    AppToast.show(this, "Playback Chapter Sync270: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV270ScreenshotSavePath270Toggle() {
    val current = BiliClient.prefs.v270screenshotSavePath270
    BiliClient.prefs.v270screenshotSavePath270 = !current
    AppToast.show(this, "Screenshot Save Path270: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV270VideoColorSpace270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270videoColorSpace270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270videoColorSpace270 = value
        AppToast.show(this, "Video Color Space270: $value")
    }
}

internal fun PlayerActivity.showV270DanmakuBottomMaxCount348Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v270danmakuBottomMaxCount348).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count348",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v270danmakuBottomMaxCount348 = value
        AppToast.show(this, "Danmaku Bottom Max Count348: $value")
    }
}

internal fun PlayerActivity.showV270SubtitleBgBorder355Toggle() {
    val current = BiliClient.prefs.v270subtitleBgBorder355
    BiliClient.prefs.v270subtitleBgBorder355 = !current
    AppToast.show(this, "Subtitle Bg Border355: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV271AudioEQCustom271Toggle() {
    val current = BiliClient.prefs.v271audioEQCustom271
    BiliClient.prefs.v271audioEQCustom271 = !current
    AppToast.show(this, "Audio EQ Custom271: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV271DanmakuBottomMaxCount349Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271danmakuBottomMaxCount349).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count349",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271danmakuBottomMaxCount349 = value
        AppToast.show(this, "Danmaku Bottom Max Count349: $value")
    }
}

internal fun PlayerActivity.showV271SubtitleBgBorder356Toggle() {
    val current = BiliClient.prefs.v271subtitleBgBorder356
    BiliClient.prefs.v271subtitleBgBorder356 = !current
    AppToast.show(this, "Subtitle Bg Border356: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV271GestureShakeAction271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271gestureShakeAction271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271gestureShakeAction271 = value
        AppToast.show(this, "Gesture Shake Action271: $value")
    }
}

internal fun PlayerActivity.showV271CastAudioVolume271Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v271castAudioVolume271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271castAudioVolume271 = value
        AppToast.show(this, "Cast Audio Volume271: $value")
    }
}

internal fun PlayerActivity.showV271PlaylistAutoSkipOutro271Toggle() {
    val current = BiliClient.prefs.v271playlistAutoSkipOutro271
    BiliClient.prefs.v271playlistAutoSkipOutro271 = !current
    AppToast.show(this, "Playlist Auto Skip Outro271: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV271CacheDownloadSpeed272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271cacheDownloadSpeed272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271cacheDownloadSpeed272 = value
        AppToast.show(this, "Cache Download Speed272: $value")
    }
}

internal fun PlayerActivity.showV271ProgressBarThumbBorder271Toggle() {
    val current = BiliClient.prefs.v271progressBarThumbBorder271
    BiliClient.prefs.v271progressBarThumbBorder271 = !current
    AppToast.show(this, "Progress Bar Thumb Border271: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV271VolumeBoostPeak271Toggle() {
    val current = BiliClient.prefs.v271volumeBoostPeak271
    BiliClient.prefs.v271volumeBoostPeak271 = !current
    AppToast.show(this, "Volume Boost Peak271: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV271HistoryBookmarkExport271Toggle() {
    val current = BiliClient.prefs.v271historyBookmarkExport271
    BiliClient.prefs.v271historyBookmarkExport271 = !current
    AppToast.show(this, "History Bookmark Export271: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV271PlaybackChapterSync271Toggle() {
    val current = BiliClient.prefs.v271playbackChapterSync271
    BiliClient.prefs.v271playbackChapterSync271 = !current
    AppToast.show(this, "Playback Chapter Sync271: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV271ScreenshotSavePath271Toggle() {
    val current = BiliClient.prefs.v271screenshotSavePath271
    BiliClient.prefs.v271screenshotSavePath271 = !current
    AppToast.show(this, "Screenshot Save Path271: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV271VideoColorSpace271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271videoColorSpace271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271videoColorSpace271 = value
        AppToast.show(this, "Video Color Space271: $value")
    }
}

internal fun PlayerActivity.showV271DanmakuBottomMaxCount350Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v271danmakuBottomMaxCount350).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count350",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v271danmakuBottomMaxCount350 = value
        AppToast.show(this, "Danmaku Bottom Max Count350: $value")
    }
}

internal fun PlayerActivity.showV271SubtitleBgBorder357Toggle() {
    val current = BiliClient.prefs.v271subtitleBgBorder357
    BiliClient.prefs.v271subtitleBgBorder357 = !current
    AppToast.show(this, "Subtitle Bg Border357: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV272AudioEQCustom272Toggle() {
    val current = BiliClient.prefs.v272audioEQCustom272
    BiliClient.prefs.v272audioEQCustom272 = !current
    AppToast.show(this, "Audio EQ Custom272: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV272DanmakuBottomMaxCount351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272danmakuBottomMaxCount351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272danmakuBottomMaxCount351 = value
        AppToast.show(this, "Danmaku Bottom Max Count351: $value")
    }
}

internal fun PlayerActivity.showV272SubtitleBgBorder358Toggle() {
    val current = BiliClient.prefs.v272subtitleBgBorder358
    BiliClient.prefs.v272subtitleBgBorder358 = !current
    AppToast.show(this, "Subtitle Bg Border358: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV272GestureShakeAction272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272gestureShakeAction272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272gestureShakeAction272 = value
        AppToast.show(this, "Gesture Shake Action272: $value")
    }
}

internal fun PlayerActivity.showV272CastAudioVolume272Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v272castAudioVolume272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272castAudioVolume272 = value
        AppToast.show(this, "Cast Audio Volume272: $value")
    }
}

internal fun PlayerActivity.showV272PlaylistAutoSkipOutro272Toggle() {
    val current = BiliClient.prefs.v272playlistAutoSkipOutro272
    BiliClient.prefs.v272playlistAutoSkipOutro272 = !current
    AppToast.show(this, "Playlist Auto Skip Outro272: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV272CacheDownloadSpeed273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272cacheDownloadSpeed273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272cacheDownloadSpeed273 = value
        AppToast.show(this, "Cache Download Speed273: $value")
    }
}

internal fun PlayerActivity.showV272ProgressBarThumbBorder272Toggle() {
    val current = BiliClient.prefs.v272progressBarThumbBorder272
    BiliClient.prefs.v272progressBarThumbBorder272 = !current
    AppToast.show(this, "Progress Bar Thumb Border272: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV272VolumeBoostPeak272Toggle() {
    val current = BiliClient.prefs.v272volumeBoostPeak272
    BiliClient.prefs.v272volumeBoostPeak272 = !current
    AppToast.show(this, "Volume Boost Peak272: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV272HistoryBookmarkExport272Toggle() {
    val current = BiliClient.prefs.v272historyBookmarkExport272
    BiliClient.prefs.v272historyBookmarkExport272 = !current
    AppToast.show(this, "History Bookmark Export272: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV272PlaybackChapterSync272Toggle() {
    val current = BiliClient.prefs.v272playbackChapterSync272
    BiliClient.prefs.v272playbackChapterSync272 = !current
    AppToast.show(this, "Playback Chapter Sync272: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV272ScreenshotSavePath272Toggle() {
    val current = BiliClient.prefs.v272screenshotSavePath272
    BiliClient.prefs.v272screenshotSavePath272 = !current
    AppToast.show(this, "Screenshot Save Path272: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV272VideoColorSpace272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272videoColorSpace272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272videoColorSpace272 = value
        AppToast.show(this, "Video Color Space272: $value")
    }
}

internal fun PlayerActivity.showV272DanmakuBottomMaxCount352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v272danmakuBottomMaxCount352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v272danmakuBottomMaxCount352 = value
        AppToast.show(this, "Danmaku Bottom Max Count352: $value")
    }
}

internal fun PlayerActivity.showV272SubtitleBgBorder359Toggle() {
    val current = BiliClient.prefs.v272subtitleBgBorder359
    BiliClient.prefs.v272subtitleBgBorder359 = !current
    AppToast.show(this, "Subtitle Bg Border359: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV273AudioEQCustom273Toggle() {
    val current = BiliClient.prefs.v273audioEQCustom273
    BiliClient.prefs.v273audioEQCustom273 = !current
    AppToast.show(this, "Audio EQ Custom273: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV273DanmakuBottomMaxCount353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273danmakuBottomMaxCount353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273danmakuBottomMaxCount353 = value
        AppToast.show(this, "Danmaku Bottom Max Count353: $value")
    }
}

internal fun PlayerActivity.showV273SubtitleBgBorder360Toggle() {
    val current = BiliClient.prefs.v273subtitleBgBorder360
    BiliClient.prefs.v273subtitleBgBorder360 = !current
    AppToast.show(this, "Subtitle Bg Border360: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV273GestureShakeAction273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273gestureShakeAction273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273gestureShakeAction273 = value
        AppToast.show(this, "Gesture Shake Action273: $value")
    }
}

internal fun PlayerActivity.showV273CastAudioVolume273Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v273castAudioVolume273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273castAudioVolume273 = value
        AppToast.show(this, "Cast Audio Volume273: $value")
    }
}

internal fun PlayerActivity.showV273PlaylistAutoSkipOutro273Toggle() {
    val current = BiliClient.prefs.v273playlistAutoSkipOutro273
    BiliClient.prefs.v273playlistAutoSkipOutro273 = !current
    AppToast.show(this, "Playlist Auto Skip Outro273: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV273CacheDownloadSpeed274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273cacheDownloadSpeed274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273cacheDownloadSpeed274 = value
        AppToast.show(this, "Cache Download Speed274: $value")
    }
}

internal fun PlayerActivity.showV273ProgressBarThumbBorder273Toggle() {
    val current = BiliClient.prefs.v273progressBarThumbBorder273
    BiliClient.prefs.v273progressBarThumbBorder273 = !current
    AppToast.show(this, "Progress Bar Thumb Border273: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV273VolumeBoostPeak273Toggle() {
    val current = BiliClient.prefs.v273volumeBoostPeak273
    BiliClient.prefs.v273volumeBoostPeak273 = !current
    AppToast.show(this, "Volume Boost Peak273: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV273HistoryBookmarkExport273Toggle() {
    val current = BiliClient.prefs.v273historyBookmarkExport273
    BiliClient.prefs.v273historyBookmarkExport273 = !current
    AppToast.show(this, "History Bookmark Export273: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV273PlaybackChapterSync273Toggle() {
    val current = BiliClient.prefs.v273playbackChapterSync273
    BiliClient.prefs.v273playbackChapterSync273 = !current
    AppToast.show(this, "Playback Chapter Sync273: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV273ScreenshotSavePath273Toggle() {
    val current = BiliClient.prefs.v273screenshotSavePath273
    BiliClient.prefs.v273screenshotSavePath273 = !current
    AppToast.show(this, "Screenshot Save Path273: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV273VideoColorSpace273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273videoColorSpace273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273videoColorSpace273 = value
        AppToast.show(this, "Video Color Space273: $value")
    }
}

internal fun PlayerActivity.showV273DanmakuBottomMaxCount354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v273danmakuBottomMaxCount354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v273danmakuBottomMaxCount354 = value
        AppToast.show(this, "Danmaku Bottom Max Count354: $value")
    }
}

internal fun PlayerActivity.showV273SubtitleBgBorder361Toggle() {
    val current = BiliClient.prefs.v273subtitleBgBorder361
    BiliClient.prefs.v273subtitleBgBorder361 = !current
    AppToast.show(this, "Subtitle Bg Border361: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV274AudioEQCustom274Toggle() {
    val current = BiliClient.prefs.v274audioEQCustom274
    BiliClient.prefs.v274audioEQCustom274 = !current
    AppToast.show(this, "Audio EQ Custom274: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV274DanmakuBottomMaxCount355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274danmakuBottomMaxCount355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274danmakuBottomMaxCount355 = value
        AppToast.show(this, "Danmaku Bottom Max Count355: $value")
    }
}

internal fun PlayerActivity.showV274SubtitleBgBorder362Toggle() {
    val current = BiliClient.prefs.v274subtitleBgBorder362
    BiliClient.prefs.v274subtitleBgBorder362 = !current
    AppToast.show(this, "Subtitle Bg Border362: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV274GestureShakeAction274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274gestureShakeAction274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274gestureShakeAction274 = value
        AppToast.show(this, "Gesture Shake Action274: $value")
    }
}

internal fun PlayerActivity.showV274CastAudioVolume274Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v274castAudioVolume274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274castAudioVolume274 = value
        AppToast.show(this, "Cast Audio Volume274: $value")
    }
}

internal fun PlayerActivity.showV274PlaylistAutoSkipOutro274Toggle() {
    val current = BiliClient.prefs.v274playlistAutoSkipOutro274
    BiliClient.prefs.v274playlistAutoSkipOutro274 = !current
    AppToast.show(this, "Playlist Auto Skip Outro274: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV274CacheDownloadSpeed275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274cacheDownloadSpeed275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274cacheDownloadSpeed275 = value
        AppToast.show(this, "Cache Download Speed275: $value")
    }
}

internal fun PlayerActivity.showV274ProgressBarThumbBorder274Toggle() {
    val current = BiliClient.prefs.v274progressBarThumbBorder274
    BiliClient.prefs.v274progressBarThumbBorder274 = !current
    AppToast.show(this, "Progress Bar Thumb Border274: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV274VolumeBoostPeak274Toggle() {
    val current = BiliClient.prefs.v274volumeBoostPeak274
    BiliClient.prefs.v274volumeBoostPeak274 = !current
    AppToast.show(this, "Volume Boost Peak274: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV274HistoryBookmarkExport274Toggle() {
    val current = BiliClient.prefs.v274historyBookmarkExport274
    BiliClient.prefs.v274historyBookmarkExport274 = !current
    AppToast.show(this, "History Bookmark Export274: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV274PlaybackChapterSync274Toggle() {
    val current = BiliClient.prefs.v274playbackChapterSync274
    BiliClient.prefs.v274playbackChapterSync274 = !current
    AppToast.show(this, "Playback Chapter Sync274: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV274ScreenshotSavePath274Toggle() {
    val current = BiliClient.prefs.v274screenshotSavePath274
    BiliClient.prefs.v274screenshotSavePath274 = !current
    AppToast.show(this, "Screenshot Save Path274: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV274VideoColorSpace274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274videoColorSpace274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274videoColorSpace274 = value
        AppToast.show(this, "Video Color Space274: $value")
    }
}

internal fun PlayerActivity.showV274DanmakuBottomMaxCount356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v274danmakuBottomMaxCount356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v274danmakuBottomMaxCount356 = value
        AppToast.show(this, "Danmaku Bottom Max Count356: $value")
    }
}

internal fun PlayerActivity.showV274SubtitleBgBorder363Toggle() {
    val current = BiliClient.prefs.v274subtitleBgBorder363
    BiliClient.prefs.v274subtitleBgBorder363 = !current
    AppToast.show(this, "Subtitle Bg Border363: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV275AudioEQCustom275Toggle() {
    val current = BiliClient.prefs.v275audioEQCustom275
    BiliClient.prefs.v275audioEQCustom275 = !current
    AppToast.show(this, "Audio EQ Custom275: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV275DanmakuBottomMaxCount357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275danmakuBottomMaxCount357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275danmakuBottomMaxCount357 = value
        AppToast.show(this, "Danmaku Bottom Max Count357: $value")
    }
}

internal fun PlayerActivity.showV275SubtitleBgBorder364Toggle() {
    val current = BiliClient.prefs.v275subtitleBgBorder364
    BiliClient.prefs.v275subtitleBgBorder364 = !current
    AppToast.show(this, "Subtitle Bg Border364: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV275GestureShakeAction275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275gestureShakeAction275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275gestureShakeAction275 = value
        AppToast.show(this, "Gesture Shake Action275: $value")
    }
}

internal fun PlayerActivity.showV275CastAudioVolume275Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v275castAudioVolume275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275castAudioVolume275 = value
        AppToast.show(this, "Cast Audio Volume275: $value")
    }
}

internal fun PlayerActivity.showV275PlaylistAutoSkipOutro275Toggle() {
    val current = BiliClient.prefs.v275playlistAutoSkipOutro275
    BiliClient.prefs.v275playlistAutoSkipOutro275 = !current
    AppToast.show(this, "Playlist Auto Skip Outro275: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV275CacheDownloadSpeed276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275cacheDownloadSpeed276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275cacheDownloadSpeed276 = value
        AppToast.show(this, "Cache Download Speed276: $value")
    }
}

internal fun PlayerActivity.showV275ProgressBarThumbBorder275Toggle() {
    val current = BiliClient.prefs.v275progressBarThumbBorder275
    BiliClient.prefs.v275progressBarThumbBorder275 = !current
    AppToast.show(this, "Progress Bar Thumb Border275: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV275VolumeBoostPeak275Toggle() {
    val current = BiliClient.prefs.v275volumeBoostPeak275
    BiliClient.prefs.v275volumeBoostPeak275 = !current
    AppToast.show(this, "Volume Boost Peak275: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV275HistoryBookmarkExport275Toggle() {
    val current = BiliClient.prefs.v275historyBookmarkExport275
    BiliClient.prefs.v275historyBookmarkExport275 = !current
    AppToast.show(this, "History Bookmark Export275: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV275PlaybackChapterSync275Toggle() {
    val current = BiliClient.prefs.v275playbackChapterSync275
    BiliClient.prefs.v275playbackChapterSync275 = !current
    AppToast.show(this, "Playback Chapter Sync275: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV275ScreenshotSavePath275Toggle() {
    val current = BiliClient.prefs.v275screenshotSavePath275
    BiliClient.prefs.v275screenshotSavePath275 = !current
    AppToast.show(this, "Screenshot Save Path275: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV275VideoColorSpace275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275videoColorSpace275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275videoColorSpace275 = value
        AppToast.show(this, "Video Color Space275: $value")
    }
}

internal fun PlayerActivity.showV275DanmakuBottomMaxCount358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v275danmakuBottomMaxCount358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v275danmakuBottomMaxCount358 = value
        AppToast.show(this, "Danmaku Bottom Max Count358: $value")
    }
}

internal fun PlayerActivity.showV275SubtitleBgBorder365Toggle() {
    val current = BiliClient.prefs.v275subtitleBgBorder365
    BiliClient.prefs.v275subtitleBgBorder365 = !current
    AppToast.show(this, "Subtitle Bg Border365: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV276AudioEQCustom276Toggle() {
    val current = BiliClient.prefs.v276audioEQCustom276
    BiliClient.prefs.v276audioEQCustom276 = !current
    AppToast.show(this, "Audio EQ Custom276: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV276DanmakuBottomMaxCount359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276danmakuBottomMaxCount359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276danmakuBottomMaxCount359 = value
        AppToast.show(this, "Danmaku Bottom Max Count359: $value")
    }
}

internal fun PlayerActivity.showV276SubtitleBgBorder366Toggle() {
    val current = BiliClient.prefs.v276subtitleBgBorder366
    BiliClient.prefs.v276subtitleBgBorder366 = !current
    AppToast.show(this, "Subtitle Bg Border366: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV276GestureShakeAction276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276gestureShakeAction276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276gestureShakeAction276 = value
        AppToast.show(this, "Gesture Shake Action276: $value")
    }
}

internal fun PlayerActivity.showV276CastAudioVolume276Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v276castAudioVolume276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276castAudioVolume276 = value
        AppToast.show(this, "Cast Audio Volume276: $value")
    }
}

internal fun PlayerActivity.showV276PlaylistAutoSkipOutro276Toggle() {
    val current = BiliClient.prefs.v276playlistAutoSkipOutro276
    BiliClient.prefs.v276playlistAutoSkipOutro276 = !current
    AppToast.show(this, "Playlist Auto Skip Outro276: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV276CacheDownloadSpeed277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276cacheDownloadSpeed277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276cacheDownloadSpeed277 = value
        AppToast.show(this, "Cache Download Speed277: $value")
    }
}

internal fun PlayerActivity.showV276ProgressBarThumbBorder276Toggle() {
    val current = BiliClient.prefs.v276progressBarThumbBorder276
    BiliClient.prefs.v276progressBarThumbBorder276 = !current
    AppToast.show(this, "Progress Bar Thumb Border276: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV276VolumeBoostPeak276Toggle() {
    val current = BiliClient.prefs.v276volumeBoostPeak276
    BiliClient.prefs.v276volumeBoostPeak276 = !current
    AppToast.show(this, "Volume Boost Peak276: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV276HistoryBookmarkExport276Toggle() {
    val current = BiliClient.prefs.v276historyBookmarkExport276
    BiliClient.prefs.v276historyBookmarkExport276 = !current
    AppToast.show(this, "History Bookmark Export276: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV276PlaybackChapterSync276Toggle() {
    val current = BiliClient.prefs.v276playbackChapterSync276
    BiliClient.prefs.v276playbackChapterSync276 = !current
    AppToast.show(this, "Playback Chapter Sync276: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV276ScreenshotSavePath276Toggle() {
    val current = BiliClient.prefs.v276screenshotSavePath276
    BiliClient.prefs.v276screenshotSavePath276 = !current
    AppToast.show(this, "Screenshot Save Path276: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV276VideoColorSpace276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276videoColorSpace276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276videoColorSpace276 = value
        AppToast.show(this, "Video Color Space276: $value")
    }
}

internal fun PlayerActivity.showV276DanmakuBottomMaxCount360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v276danmakuBottomMaxCount360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v276danmakuBottomMaxCount360 = value
        AppToast.show(this, "Danmaku Bottom Max Count360: $value")
    }
}

internal fun PlayerActivity.showV276SubtitleBgBorder367Toggle() {
    val current = BiliClient.prefs.v276subtitleBgBorder367
    BiliClient.prefs.v276subtitleBgBorder367 = !current
    AppToast.show(this, "Subtitle Bg Border367: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV277AudioEQCustom277Toggle() {
    val current = BiliClient.prefs.v277audioEQCustom277
    BiliClient.prefs.v277audioEQCustom277 = !current
    AppToast.show(this, "Audio EQ Custom277: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV277DanmakuBottomMaxCount361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277danmakuBottomMaxCount361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277danmakuBottomMaxCount361 = value
        AppToast.show(this, "Danmaku Bottom Max Count361: $value")
    }
}

internal fun PlayerActivity.showV277SubtitleBgBorder368Toggle() {
    val current = BiliClient.prefs.v277subtitleBgBorder368
    BiliClient.prefs.v277subtitleBgBorder368 = !current
    AppToast.show(this, "Subtitle Bg Border368: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV277GestureShakeAction277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277gestureShakeAction277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277gestureShakeAction277 = value
        AppToast.show(this, "Gesture Shake Action277: $value")
    }
}

internal fun PlayerActivity.showV277CastAudioVolume277Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v277castAudioVolume277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277castAudioVolume277 = value
        AppToast.show(this, "Cast Audio Volume277: $value")
    }
}

internal fun PlayerActivity.showV277PlaylistAutoSkipOutro277Toggle() {
    val current = BiliClient.prefs.v277playlistAutoSkipOutro277
    BiliClient.prefs.v277playlistAutoSkipOutro277 = !current
    AppToast.show(this, "Playlist Auto Skip Outro277: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV277CacheDownloadSpeed278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277cacheDownloadSpeed278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277cacheDownloadSpeed278 = value
        AppToast.show(this, "Cache Download Speed278: $value")
    }
}

internal fun PlayerActivity.showV277ProgressBarThumbBorder277Toggle() {
    val current = BiliClient.prefs.v277progressBarThumbBorder277
    BiliClient.prefs.v277progressBarThumbBorder277 = !current
    AppToast.show(this, "Progress Bar Thumb Border277: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV277VolumeBoostPeak277Toggle() {
    val current = BiliClient.prefs.v277volumeBoostPeak277
    BiliClient.prefs.v277volumeBoostPeak277 = !current
    AppToast.show(this, "Volume Boost Peak277: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV277HistoryBookmarkExport277Toggle() {
    val current = BiliClient.prefs.v277historyBookmarkExport277
    BiliClient.prefs.v277historyBookmarkExport277 = !current
    AppToast.show(this, "History Bookmark Export277: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV277PlaybackChapterSync277Toggle() {
    val current = BiliClient.prefs.v277playbackChapterSync277
    BiliClient.prefs.v277playbackChapterSync277 = !current
    AppToast.show(this, "Playback Chapter Sync277: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV277ScreenshotSavePath277Toggle() {
    val current = BiliClient.prefs.v277screenshotSavePath277
    BiliClient.prefs.v277screenshotSavePath277 = !current
    AppToast.show(this, "Screenshot Save Path277: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV277VideoColorSpace277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277videoColorSpace277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277videoColorSpace277 = value
        AppToast.show(this, "Video Color Space277: $value")
    }
}

internal fun PlayerActivity.showV277DanmakuBottomMaxCount362Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v277danmakuBottomMaxCount362).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count362",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v277danmakuBottomMaxCount362 = value
        AppToast.show(this, "Danmaku Bottom Max Count362: $value")
    }
}

internal fun PlayerActivity.showV277SubtitleBgBorder369Toggle() {
    val current = BiliClient.prefs.v277subtitleBgBorder369
    BiliClient.prefs.v277subtitleBgBorder369 = !current
    AppToast.show(this, "Subtitle Bg Border369: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV278AudioEQCustom278Toggle() {
    val current = BiliClient.prefs.v278audioEQCustom278
    BiliClient.prefs.v278audioEQCustom278 = !current
    AppToast.show(this, "Audio EQ Custom278: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV278DanmakuBottomMaxCount363Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278danmakuBottomMaxCount363).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count363",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278danmakuBottomMaxCount363 = value
        AppToast.show(this, "Danmaku Bottom Max Count363: $value")
    }
}

internal fun PlayerActivity.showV278SubtitleBgBorder370Toggle() {
    val current = BiliClient.prefs.v278subtitleBgBorder370
    BiliClient.prefs.v278subtitleBgBorder370 = !current
    AppToast.show(this, "Subtitle Bg Border370: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV278GestureShakeAction278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278gestureShakeAction278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278gestureShakeAction278 = value
        AppToast.show(this, "Gesture Shake Action278: $value")
    }
}

internal fun PlayerActivity.showV278CastAudioVolume278Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v278castAudioVolume278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278castAudioVolume278 = value
        AppToast.show(this, "Cast Audio Volume278: $value")
    }
}

internal fun PlayerActivity.showV278PlaylistAutoSkipOutro278Toggle() {
    val current = BiliClient.prefs.v278playlistAutoSkipOutro278
    BiliClient.prefs.v278playlistAutoSkipOutro278 = !current
    AppToast.show(this, "Playlist Auto Skip Outro278: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV278CacheDownloadSpeed279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278cacheDownloadSpeed279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278cacheDownloadSpeed279 = value
        AppToast.show(this, "Cache Download Speed279: $value")
    }
}

internal fun PlayerActivity.showV278ProgressBarThumbBorder278Toggle() {
    val current = BiliClient.prefs.v278progressBarThumbBorder278
    BiliClient.prefs.v278progressBarThumbBorder278 = !current
    AppToast.show(this, "Progress Bar Thumb Border278: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV278VolumeBoostPeak278Toggle() {
    val current = BiliClient.prefs.v278volumeBoostPeak278
    BiliClient.prefs.v278volumeBoostPeak278 = !current
    AppToast.show(this, "Volume Boost Peak278: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV278HistoryBookmarkExport278Toggle() {
    val current = BiliClient.prefs.v278historyBookmarkExport278
    BiliClient.prefs.v278historyBookmarkExport278 = !current
    AppToast.show(this, "History Bookmark Export278: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV278PlaybackChapterSync278Toggle() {
    val current = BiliClient.prefs.v278playbackChapterSync278
    BiliClient.prefs.v278playbackChapterSync278 = !current
    AppToast.show(this, "Playback Chapter Sync278: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV278ScreenshotSavePath278Toggle() {
    val current = BiliClient.prefs.v278screenshotSavePath278
    BiliClient.prefs.v278screenshotSavePath278 = !current
    AppToast.show(this, "Screenshot Save Path278: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV278VideoColorSpace278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278videoColorSpace278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278videoColorSpace278 = value
        AppToast.show(this, "Video Color Space278: $value")
    }
}

internal fun PlayerActivity.showV278DanmakuBottomMaxCount364Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v278danmakuBottomMaxCount364).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count364",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v278danmakuBottomMaxCount364 = value
        AppToast.show(this, "Danmaku Bottom Max Count364: $value")
    }
}

internal fun PlayerActivity.showV278SubtitleBgBorder371Toggle() {
    val current = BiliClient.prefs.v278subtitleBgBorder371
    BiliClient.prefs.v278subtitleBgBorder371 = !current
    AppToast.show(this, "Subtitle Bg Border371: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV279AudioEQCustom279Toggle() {
    val current = BiliClient.prefs.v279audioEQCustom279
    BiliClient.prefs.v279audioEQCustom279 = !current
    AppToast.show(this, "Audio EQ Custom279: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV279DanmakuBottomMaxCount365Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279danmakuBottomMaxCount365).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count365",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279danmakuBottomMaxCount365 = value
        AppToast.show(this, "Danmaku Bottom Max Count365: $value")
    }
}

internal fun PlayerActivity.showV279SubtitleBgBorder372Toggle() {
    val current = BiliClient.prefs.v279subtitleBgBorder372
    BiliClient.prefs.v279subtitleBgBorder372 = !current
    AppToast.show(this, "Subtitle Bg Border372: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV279GestureShakeAction279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279gestureShakeAction279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279gestureShakeAction279 = value
        AppToast.show(this, "Gesture Shake Action279: $value")
    }
}

internal fun PlayerActivity.showV279CastAudioVolume279Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v279castAudioVolume279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279castAudioVolume279 = value
        AppToast.show(this, "Cast Audio Volume279: $value")
    }
}

internal fun PlayerActivity.showV279PlaylistAutoSkipOutro279Toggle() {
    val current = BiliClient.prefs.v279playlistAutoSkipOutro279
    BiliClient.prefs.v279playlistAutoSkipOutro279 = !current
    AppToast.show(this, "Playlist Auto Skip Outro279: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV279CacheDownloadSpeed280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279cacheDownloadSpeed280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279cacheDownloadSpeed280 = value
        AppToast.show(this, "Cache Download Speed280: $value")
    }
}

internal fun PlayerActivity.showV279ProgressBarThumbBorder279Toggle() {
    val current = BiliClient.prefs.v279progressBarThumbBorder279
    BiliClient.prefs.v279progressBarThumbBorder279 = !current
    AppToast.show(this, "Progress Bar Thumb Border279: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV279VolumeBoostPeak279Toggle() {
    val current = BiliClient.prefs.v279volumeBoostPeak279
    BiliClient.prefs.v279volumeBoostPeak279 = !current
    AppToast.show(this, "Volume Boost Peak279: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV279HistoryBookmarkExport279Toggle() {
    val current = BiliClient.prefs.v279historyBookmarkExport279
    BiliClient.prefs.v279historyBookmarkExport279 = !current
    AppToast.show(this, "History Bookmark Export279: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV279PlaybackChapterSync279Toggle() {
    val current = BiliClient.prefs.v279playbackChapterSync279
    BiliClient.prefs.v279playbackChapterSync279 = !current
    AppToast.show(this, "Playback Chapter Sync279: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV279ScreenshotSavePath279Toggle() {
    val current = BiliClient.prefs.v279screenshotSavePath279
    BiliClient.prefs.v279screenshotSavePath279 = !current
    AppToast.show(this, "Screenshot Save Path279: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV279VideoColorSpace279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279videoColorSpace279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279videoColorSpace279 = value
        AppToast.show(this, "Video Color Space279: $value")
    }
}

internal fun PlayerActivity.showV279DanmakuBottomMaxCount366Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v279danmakuBottomMaxCount366).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count366",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v279danmakuBottomMaxCount366 = value
        AppToast.show(this, "Danmaku Bottom Max Count366: $value")
    }
}

internal fun PlayerActivity.showV279SubtitleBgBorder373Toggle() {
    val current = BiliClient.prefs.v279subtitleBgBorder373
    BiliClient.prefs.v279subtitleBgBorder373 = !current
    AppToast.show(this, "Subtitle Bg Border373: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV280AudioEQCustom280Toggle() {
    val current = BiliClient.prefs.v280audioEQCustom280
    BiliClient.prefs.v280audioEQCustom280 = !current
    AppToast.show(this, "Audio EQ Custom280: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV280DanmakuBottomMaxCount367Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280danmakuBottomMaxCount367).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count367",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280danmakuBottomMaxCount367 = value
        AppToast.show(this, "Danmaku Bottom Max Count367: $value")
    }
}

internal fun PlayerActivity.showV280SubtitleBgBorder374Toggle() {
    val current = BiliClient.prefs.v280subtitleBgBorder374
    BiliClient.prefs.v280subtitleBgBorder374 = !current
    AppToast.show(this, "Subtitle Bg Border374: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV280GestureShakeAction280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280gestureShakeAction280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280gestureShakeAction280 = value
        AppToast.show(this, "Gesture Shake Action280: $value")
    }
}

internal fun PlayerActivity.showV280CastAudioVolume280Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v280castAudioVolume280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280castAudioVolume280 = value
        AppToast.show(this, "Cast Audio Volume280: $value")
    }
}

internal fun PlayerActivity.showV280PlaylistAutoSkipOutro280Toggle() {
    val current = BiliClient.prefs.v280playlistAutoSkipOutro280
    BiliClient.prefs.v280playlistAutoSkipOutro280 = !current
    AppToast.show(this, "Playlist Auto Skip Outro280: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV280CacheDownloadSpeed281Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280cacheDownloadSpeed281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280cacheDownloadSpeed281 = value
        AppToast.show(this, "Cache Download Speed281: $value")
    }
}

internal fun PlayerActivity.showV280ProgressBarThumbBorder280Toggle() {
    val current = BiliClient.prefs.v280progressBarThumbBorder280
    BiliClient.prefs.v280progressBarThumbBorder280 = !current
    AppToast.show(this, "Progress Bar Thumb Border280: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV280VolumeBoostPeak280Toggle() {
    val current = BiliClient.prefs.v280volumeBoostPeak280
    BiliClient.prefs.v280volumeBoostPeak280 = !current
    AppToast.show(this, "Volume Boost Peak280: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV280HistoryBookmarkExport280Toggle() {
    val current = BiliClient.prefs.v280historyBookmarkExport280
    BiliClient.prefs.v280historyBookmarkExport280 = !current
    AppToast.show(this, "History Bookmark Export280: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV280PlaybackChapterSync280Toggle() {
    val current = BiliClient.prefs.v280playbackChapterSync280
    BiliClient.prefs.v280playbackChapterSync280 = !current
    AppToast.show(this, "Playback Chapter Sync280: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV280ScreenshotSavePath280Toggle() {
    val current = BiliClient.prefs.v280screenshotSavePath280
    BiliClient.prefs.v280screenshotSavePath280 = !current
    AppToast.show(this, "Screenshot Save Path280: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV280VideoColorSpace280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280videoColorSpace280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280videoColorSpace280 = value
        AppToast.show(this, "Video Color Space280: $value")
    }
}

internal fun PlayerActivity.showV280DanmakuBottomMaxCount368Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v280danmakuBottomMaxCount368).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count368",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v280danmakuBottomMaxCount368 = value
        AppToast.show(this, "Danmaku Bottom Max Count368: $value")
    }
}

internal fun PlayerActivity.showV280SubtitleBgBorder375Toggle() {
    val current = BiliClient.prefs.v280subtitleBgBorder375
    BiliClient.prefs.v280subtitleBgBorder375 = !current
    AppToast.show(this, "Subtitle Bg Border375: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV281AudioEQCustom281Toggle() {
    val current = BiliClient.prefs.v281audioEQCustom281
    BiliClient.prefs.v281audioEQCustom281 = !current
    AppToast.show(this, "Audio EQ Custom281: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV281DanmakuBottomMaxCount369Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281danmakuBottomMaxCount369).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count369",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281danmakuBottomMaxCount369 = value
        AppToast.show(this, "Danmaku Bottom Max Count369: $value")
    }
}

internal fun PlayerActivity.showV281SubtitleBgBorder376Toggle() {
    val current = BiliClient.prefs.v281subtitleBgBorder376
    BiliClient.prefs.v281subtitleBgBorder376 = !current
    AppToast.show(this, "Subtitle Bg Border376: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV281GestureShakeAction281Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281gestureShakeAction281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281gestureShakeAction281 = value
        AppToast.show(this, "Gesture Shake Action281: $value")
    }
}

internal fun PlayerActivity.showV281CastAudioVolume281Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v281castAudioVolume281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281castAudioVolume281 = value
        AppToast.show(this, "Cast Audio Volume281: $value")
    }
}

internal fun PlayerActivity.showV281PlaylistAutoSkipOutro281Toggle() {
    val current = BiliClient.prefs.v281playlistAutoSkipOutro281
    BiliClient.prefs.v281playlistAutoSkipOutro281 = !current
    AppToast.show(this, "Playlist Auto Skip Outro281: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV281CacheDownloadSpeed282Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v281cacheDownloadSpeed282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v281cacheDownloadSpeed282 = value
        AppToast.show(this, "Cache Download Speed282: $value")
    }
}

internal fun PlayerActivity.showV281ProgressBarThumbBorder281Toggle() {
    val current = BiliClient.prefs.v281progressBarThumbBorder281
    BiliClient.prefs.v281progressBarThumbBorder281 = !current
    AppToast.show(this, "Progress Bar Thumb Border281: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV281VolumeBoostPeak281Toggle() {
    val current = BiliClient.prefs.v281volumeBoostPeak281
    BiliClient.prefs.v281volumeBoostPeak281 = !current
    AppToast.show(this, "Volume Boost Peak281: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV281HistoryBookmarkExport281Toggle() {
    val current = BiliClient.prefs.v281historyBookmarkExport281
    BiliClient.prefs.v281historyBookmarkExport281 = !current
    AppToast.show(this, "History Bookmark Export281: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV281PlaybackChapterSync281Toggle() {
    val current = BiliClient.prefs.v281playbackChapterSync281
    BiliClient.prefs.v281playbackChapterSync281 = !current
    AppToast.show(this, "Playback Chapter Sync281: ${if (!current) "ON" else "OFF"}")
}

