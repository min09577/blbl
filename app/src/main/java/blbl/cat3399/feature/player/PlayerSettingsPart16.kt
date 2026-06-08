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

internal fun PlayerActivity.showV228CacheDownloadSpeed229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228cacheDownloadSpeed229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228cacheDownloadSpeed229 = value
        AppToast.show(this, "Cache Download Speed229: $value")
    }
}

internal fun PlayerActivity.showV228ProgressBarThumbBorder228Toggle() {
    val current = BiliClient.prefs.v228progressBarThumbBorder228
    BiliClient.prefs.v228progressBarThumbBorder228 = !current
    AppToast.show(this, "Progress Bar Thumb Border228: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV228VolumeBoostPeak228Toggle() {
    val current = BiliClient.prefs.v228volumeBoostPeak228
    BiliClient.prefs.v228volumeBoostPeak228 = !current
    AppToast.show(this, "Volume Boost Peak228: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV228HistoryBookmarkExport228Toggle() {
    val current = BiliClient.prefs.v228historyBookmarkExport228
    BiliClient.prefs.v228historyBookmarkExport228 = !current
    AppToast.show(this, "History Bookmark Export228: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV228PlaybackChapterSync228Toggle() {
    val current = BiliClient.prefs.v228playbackChapterSync228
    BiliClient.prefs.v228playbackChapterSync228 = !current
    AppToast.show(this, "Playback Chapter Sync228: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV228ScreenshotSavePath228Toggle() {
    val current = BiliClient.prefs.v228screenshotSavePath228
    BiliClient.prefs.v228screenshotSavePath228 = !current
    AppToast.show(this, "Screenshot Save Path228: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV228VideoColorSpace228Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228videoColorSpace228).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space228",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228videoColorSpace228 = value
        AppToast.show(this, "Video Color Space228: $value")
    }
}

internal fun PlayerActivity.showV228DanmakuBottomMaxCount264Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v228danmakuBottomMaxCount264).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count264",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v228danmakuBottomMaxCount264 = value
        AppToast.show(this, "Danmaku Bottom Max Count264: $value")
    }
}

internal fun PlayerActivity.showV228SubtitleBgBorder271Toggle() {
    val current = BiliClient.prefs.v228subtitleBgBorder271
    BiliClient.prefs.v228subtitleBgBorder271 = !current
    AppToast.show(this, "Subtitle Bg Border271: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV229AudioEQCustom229Toggle() {
    val current = BiliClient.prefs.v229audioEQCustom229
    BiliClient.prefs.v229audioEQCustom229 = !current
    AppToast.show(this, "Audio EQ Custom229: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV229DanmakuBottomMaxCount265Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229danmakuBottomMaxCount265).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count265",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229danmakuBottomMaxCount265 = value
        AppToast.show(this, "Danmaku Bottom Max Count265: $value")
    }
}

internal fun PlayerActivity.showV229SubtitleBgBorder272Toggle() {
    val current = BiliClient.prefs.v229subtitleBgBorder272
    BiliClient.prefs.v229subtitleBgBorder272 = !current
    AppToast.show(this, "Subtitle Bg Border272: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV229GestureShakeAction229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229gestureShakeAction229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229gestureShakeAction229 = value
        AppToast.show(this, "Gesture Shake Action229: $value")
    }
}

internal fun PlayerActivity.showV229CastAudioVolume229Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v229castAudioVolume229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229castAudioVolume229 = value
        AppToast.show(this, "Cast Audio Volume229: $value")
    }
}

internal fun PlayerActivity.showV229PlaylistAutoSkipOutro229Toggle() {
    val current = BiliClient.prefs.v229playlistAutoSkipOutro229
    BiliClient.prefs.v229playlistAutoSkipOutro229 = !current
    AppToast.show(this, "Playlist Auto Skip Outro229: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV229CacheDownloadSpeed230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229cacheDownloadSpeed230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229cacheDownloadSpeed230 = value
        AppToast.show(this, "Cache Download Speed230: $value")
    }
}

internal fun PlayerActivity.showV229ProgressBarThumbBorder229Toggle() {
    val current = BiliClient.prefs.v229progressBarThumbBorder229
    BiliClient.prefs.v229progressBarThumbBorder229 = !current
    AppToast.show(this, "Progress Bar Thumb Border229: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV229VolumeBoostPeak229Toggle() {
    val current = BiliClient.prefs.v229volumeBoostPeak229
    BiliClient.prefs.v229volumeBoostPeak229 = !current
    AppToast.show(this, "Volume Boost Peak229: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV229HistoryBookmarkExport229Toggle() {
    val current = BiliClient.prefs.v229historyBookmarkExport229
    BiliClient.prefs.v229historyBookmarkExport229 = !current
    AppToast.show(this, "History Bookmark Export229: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV229PlaybackChapterSync229Toggle() {
    val current = BiliClient.prefs.v229playbackChapterSync229
    BiliClient.prefs.v229playbackChapterSync229 = !current
    AppToast.show(this, "Playback Chapter Sync229: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV229ScreenshotSavePath229Toggle() {
    val current = BiliClient.prefs.v229screenshotSavePath229
    BiliClient.prefs.v229screenshotSavePath229 = !current
    AppToast.show(this, "Screenshot Save Path229: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV229VideoColorSpace229Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229videoColorSpace229).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space229",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229videoColorSpace229 = value
        AppToast.show(this, "Video Color Space229: $value")
    }
}

internal fun PlayerActivity.showV229DanmakuBottomMaxCount266Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v229danmakuBottomMaxCount266).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count266",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v229danmakuBottomMaxCount266 = value
        AppToast.show(this, "Danmaku Bottom Max Count266: $value")
    }
}

internal fun PlayerActivity.showV229SubtitleBgBorder273Toggle() {
    val current = BiliClient.prefs.v229subtitleBgBorder273
    BiliClient.prefs.v229subtitleBgBorder273 = !current
    AppToast.show(this, "Subtitle Bg Border273: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV230AudioEQCustom230Toggle() {
    val current = BiliClient.prefs.v230audioEQCustom230
    BiliClient.prefs.v230audioEQCustom230 = !current
    AppToast.show(this, "Audio EQ Custom230: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV230DanmakuBottomMaxCount267Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230danmakuBottomMaxCount267).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count267",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230danmakuBottomMaxCount267 = value
        AppToast.show(this, "Danmaku Bottom Max Count267: $value")
    }
}

internal fun PlayerActivity.showV230SubtitleBgBorder274Toggle() {
    val current = BiliClient.prefs.v230subtitleBgBorder274
    BiliClient.prefs.v230subtitleBgBorder274 = !current
    AppToast.show(this, "Subtitle Bg Border274: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV230GestureShakeAction230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230gestureShakeAction230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230gestureShakeAction230 = value
        AppToast.show(this, "Gesture Shake Action230: $value")
    }
}

internal fun PlayerActivity.showV230CastAudioVolume230Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v230castAudioVolume230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230castAudioVolume230 = value
        AppToast.show(this, "Cast Audio Volume230: $value")
    }
}

internal fun PlayerActivity.showV230PlaylistAutoSkipOutro230Toggle() {
    val current = BiliClient.prefs.v230playlistAutoSkipOutro230
    BiliClient.prefs.v230playlistAutoSkipOutro230 = !current
    AppToast.show(this, "Playlist Auto Skip Outro230: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV230CacheDownloadSpeed231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230cacheDownloadSpeed231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230cacheDownloadSpeed231 = value
        AppToast.show(this, "Cache Download Speed231: $value")
    }
}

internal fun PlayerActivity.showV230ProgressBarThumbBorder230Toggle() {
    val current = BiliClient.prefs.v230progressBarThumbBorder230
    BiliClient.prefs.v230progressBarThumbBorder230 = !current
    AppToast.show(this, "Progress Bar Thumb Border230: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV230VolumeBoostPeak230Toggle() {
    val current = BiliClient.prefs.v230volumeBoostPeak230
    BiliClient.prefs.v230volumeBoostPeak230 = !current
    AppToast.show(this, "Volume Boost Peak230: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV230HistoryBookmarkExport230Toggle() {
    val current = BiliClient.prefs.v230historyBookmarkExport230
    BiliClient.prefs.v230historyBookmarkExport230 = !current
    AppToast.show(this, "History Bookmark Export230: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV230PlaybackChapterSync230Toggle() {
    val current = BiliClient.prefs.v230playbackChapterSync230
    BiliClient.prefs.v230playbackChapterSync230 = !current
    AppToast.show(this, "Playback Chapter Sync230: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV230ScreenshotSavePath230Toggle() {
    val current = BiliClient.prefs.v230screenshotSavePath230
    BiliClient.prefs.v230screenshotSavePath230 = !current
    AppToast.show(this, "Screenshot Save Path230: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV230VideoColorSpace230Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230videoColorSpace230).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space230",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230videoColorSpace230 = value
        AppToast.show(this, "Video Color Space230: $value")
    }
}

internal fun PlayerActivity.showV230DanmakuBottomMaxCount268Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v230danmakuBottomMaxCount268).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count268",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v230danmakuBottomMaxCount268 = value
        AppToast.show(this, "Danmaku Bottom Max Count268: $value")
    }
}

internal fun PlayerActivity.showV230SubtitleBgBorder275Toggle() {
    val current = BiliClient.prefs.v230subtitleBgBorder275
    BiliClient.prefs.v230subtitleBgBorder275 = !current
    AppToast.show(this, "Subtitle Bg Border275: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV231AudioEQCustom231Toggle() {
    val current = BiliClient.prefs.v231audioEQCustom231
    BiliClient.prefs.v231audioEQCustom231 = !current
    AppToast.show(this, "Audio EQ Custom231: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV231DanmakuBottomMaxCount269Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231danmakuBottomMaxCount269).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count269",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231danmakuBottomMaxCount269 = value
        AppToast.show(this, "Danmaku Bottom Max Count269: $value")
    }
}

internal fun PlayerActivity.showV231SubtitleBgBorder276Toggle() {
    val current = BiliClient.prefs.v231subtitleBgBorder276
    BiliClient.prefs.v231subtitleBgBorder276 = !current
    AppToast.show(this, "Subtitle Bg Border276: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV231GestureShakeAction231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231gestureShakeAction231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231gestureShakeAction231 = value
        AppToast.show(this, "Gesture Shake Action231: $value")
    }
}

internal fun PlayerActivity.showV231CastAudioVolume231Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v231castAudioVolume231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231castAudioVolume231 = value
        AppToast.show(this, "Cast Audio Volume231: $value")
    }
}

internal fun PlayerActivity.showV231PlaylistAutoSkipOutro231Toggle() {
    val current = BiliClient.prefs.v231playlistAutoSkipOutro231
    BiliClient.prefs.v231playlistAutoSkipOutro231 = !current
    AppToast.show(this, "Playlist Auto Skip Outro231: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV231CacheDownloadSpeed232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231cacheDownloadSpeed232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231cacheDownloadSpeed232 = value
        AppToast.show(this, "Cache Download Speed232: $value")
    }
}

internal fun PlayerActivity.showV231ProgressBarThumbBorder231Toggle() {
    val current = BiliClient.prefs.v231progressBarThumbBorder231
    BiliClient.prefs.v231progressBarThumbBorder231 = !current
    AppToast.show(this, "Progress Bar Thumb Border231: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV231VolumeBoostPeak231Toggle() {
    val current = BiliClient.prefs.v231volumeBoostPeak231
    BiliClient.prefs.v231volumeBoostPeak231 = !current
    AppToast.show(this, "Volume Boost Peak231: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV231HistoryBookmarkExport231Toggle() {
    val current = BiliClient.prefs.v231historyBookmarkExport231
    BiliClient.prefs.v231historyBookmarkExport231 = !current
    AppToast.show(this, "History Bookmark Export231: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV231PlaybackChapterSync231Toggle() {
    val current = BiliClient.prefs.v231playbackChapterSync231
    BiliClient.prefs.v231playbackChapterSync231 = !current
    AppToast.show(this, "Playback Chapter Sync231: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV231ScreenshotSavePath231Toggle() {
    val current = BiliClient.prefs.v231screenshotSavePath231
    BiliClient.prefs.v231screenshotSavePath231 = !current
    AppToast.show(this, "Screenshot Save Path231: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV231VideoColorSpace231Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231videoColorSpace231).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space231",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231videoColorSpace231 = value
        AppToast.show(this, "Video Color Space231: $value")
    }
}

internal fun PlayerActivity.showV231DanmakuBottomMaxCount270Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v231danmakuBottomMaxCount270).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count270",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v231danmakuBottomMaxCount270 = value
        AppToast.show(this, "Danmaku Bottom Max Count270: $value")
    }
}

internal fun PlayerActivity.showV231SubtitleBgBorder277Toggle() {
    val current = BiliClient.prefs.v231subtitleBgBorder277
    BiliClient.prefs.v231subtitleBgBorder277 = !current
    AppToast.show(this, "Subtitle Bg Border277: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV232AudioEQCustom232Toggle() {
    val current = BiliClient.prefs.v232audioEQCustom232
    BiliClient.prefs.v232audioEQCustom232 = !current
    AppToast.show(this, "Audio EQ Custom232: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV232DanmakuBottomMaxCount271Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232danmakuBottomMaxCount271).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count271",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232danmakuBottomMaxCount271 = value
        AppToast.show(this, "Danmaku Bottom Max Count271: $value")
    }
}

internal fun PlayerActivity.showV232SubtitleBgBorder278Toggle() {
    val current = BiliClient.prefs.v232subtitleBgBorder278
    BiliClient.prefs.v232subtitleBgBorder278 = !current
    AppToast.show(this, "Subtitle Bg Border278: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV232GestureShakeAction232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232gestureShakeAction232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232gestureShakeAction232 = value
        AppToast.show(this, "Gesture Shake Action232: $value")
    }
}

internal fun PlayerActivity.showV232CastAudioVolume232Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v232castAudioVolume232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232castAudioVolume232 = value
        AppToast.show(this, "Cast Audio Volume232: $value")
    }
}

internal fun PlayerActivity.showV232PlaylistAutoSkipOutro232Toggle() {
    val current = BiliClient.prefs.v232playlistAutoSkipOutro232
    BiliClient.prefs.v232playlistAutoSkipOutro232 = !current
    AppToast.show(this, "Playlist Auto Skip Outro232: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV232CacheDownloadSpeed233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232cacheDownloadSpeed233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232cacheDownloadSpeed233 = value
        AppToast.show(this, "Cache Download Speed233: $value")
    }
}

internal fun PlayerActivity.showV232ProgressBarThumbBorder232Toggle() {
    val current = BiliClient.prefs.v232progressBarThumbBorder232
    BiliClient.prefs.v232progressBarThumbBorder232 = !current
    AppToast.show(this, "Progress Bar Thumb Border232: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV232VolumeBoostPeak232Toggle() {
    val current = BiliClient.prefs.v232volumeBoostPeak232
    BiliClient.prefs.v232volumeBoostPeak232 = !current
    AppToast.show(this, "Volume Boost Peak232: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV232HistoryBookmarkExport232Toggle() {
    val current = BiliClient.prefs.v232historyBookmarkExport232
    BiliClient.prefs.v232historyBookmarkExport232 = !current
    AppToast.show(this, "History Bookmark Export232: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV232PlaybackChapterSync232Toggle() {
    val current = BiliClient.prefs.v232playbackChapterSync232
    BiliClient.prefs.v232playbackChapterSync232 = !current
    AppToast.show(this, "Playback Chapter Sync232: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV232ScreenshotSavePath232Toggle() {
    val current = BiliClient.prefs.v232screenshotSavePath232
    BiliClient.prefs.v232screenshotSavePath232 = !current
    AppToast.show(this, "Screenshot Save Path232: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV232VideoColorSpace232Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232videoColorSpace232).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space232",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232videoColorSpace232 = value
        AppToast.show(this, "Video Color Space232: $value")
    }
}

internal fun PlayerActivity.showV232DanmakuBottomMaxCount272Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v232danmakuBottomMaxCount272).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count272",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v232danmakuBottomMaxCount272 = value
        AppToast.show(this, "Danmaku Bottom Max Count272: $value")
    }
}

internal fun PlayerActivity.showV232SubtitleBgBorder279Toggle() {
    val current = BiliClient.prefs.v232subtitleBgBorder279
    BiliClient.prefs.v232subtitleBgBorder279 = !current
    AppToast.show(this, "Subtitle Bg Border279: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV233AudioEQCustom233Toggle() {
    val current = BiliClient.prefs.v233audioEQCustom233
    BiliClient.prefs.v233audioEQCustom233 = !current
    AppToast.show(this, "Audio EQ Custom233: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV233DanmakuBottomMaxCount273Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233danmakuBottomMaxCount273).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count273",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233danmakuBottomMaxCount273 = value
        AppToast.show(this, "Danmaku Bottom Max Count273: $value")
    }
}

internal fun PlayerActivity.showV233SubtitleBgBorder280Toggle() {
    val current = BiliClient.prefs.v233subtitleBgBorder280
    BiliClient.prefs.v233subtitleBgBorder280 = !current
    AppToast.show(this, "Subtitle Bg Border280: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV233GestureShakeAction233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233gestureShakeAction233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233gestureShakeAction233 = value
        AppToast.show(this, "Gesture Shake Action233: $value")
    }
}

internal fun PlayerActivity.showV233CastAudioVolume233Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v233castAudioVolume233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233castAudioVolume233 = value
        AppToast.show(this, "Cast Audio Volume233: $value")
    }
}

internal fun PlayerActivity.showV233PlaylistAutoSkipOutro233Toggle() {
    val current = BiliClient.prefs.v233playlistAutoSkipOutro233
    BiliClient.prefs.v233playlistAutoSkipOutro233 = !current
    AppToast.show(this, "Playlist Auto Skip Outro233: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV233CacheDownloadSpeed234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233cacheDownloadSpeed234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233cacheDownloadSpeed234 = value
        AppToast.show(this, "Cache Download Speed234: $value")
    }
}

internal fun PlayerActivity.showV233ProgressBarThumbBorder233Toggle() {
    val current = BiliClient.prefs.v233progressBarThumbBorder233
    BiliClient.prefs.v233progressBarThumbBorder233 = !current
    AppToast.show(this, "Progress Bar Thumb Border233: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV233VolumeBoostPeak233Toggle() {
    val current = BiliClient.prefs.v233volumeBoostPeak233
    BiliClient.prefs.v233volumeBoostPeak233 = !current
    AppToast.show(this, "Volume Boost Peak233: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV233HistoryBookmarkExport233Toggle() {
    val current = BiliClient.prefs.v233historyBookmarkExport233
    BiliClient.prefs.v233historyBookmarkExport233 = !current
    AppToast.show(this, "History Bookmark Export233: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV233PlaybackChapterSync233Toggle() {
    val current = BiliClient.prefs.v233playbackChapterSync233
    BiliClient.prefs.v233playbackChapterSync233 = !current
    AppToast.show(this, "Playback Chapter Sync233: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV233ScreenshotSavePath233Toggle() {
    val current = BiliClient.prefs.v233screenshotSavePath233
    BiliClient.prefs.v233screenshotSavePath233 = !current
    AppToast.show(this, "Screenshot Save Path233: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV233VideoColorSpace233Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233videoColorSpace233).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space233",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233videoColorSpace233 = value
        AppToast.show(this, "Video Color Space233: $value")
    }
}

internal fun PlayerActivity.showV233DanmakuBottomMaxCount274Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v233danmakuBottomMaxCount274).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count274",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v233danmakuBottomMaxCount274 = value
        AppToast.show(this, "Danmaku Bottom Max Count274: $value")
    }
}

internal fun PlayerActivity.showV233SubtitleBgBorder281Toggle() {
    val current = BiliClient.prefs.v233subtitleBgBorder281
    BiliClient.prefs.v233subtitleBgBorder281 = !current
    AppToast.show(this, "Subtitle Bg Border281: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV234AudioEQCustom234Toggle() {
    val current = BiliClient.prefs.v234audioEQCustom234
    BiliClient.prefs.v234audioEQCustom234 = !current
    AppToast.show(this, "Audio EQ Custom234: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV234DanmakuBottomMaxCount275Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234danmakuBottomMaxCount275).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count275",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234danmakuBottomMaxCount275 = value
        AppToast.show(this, "Danmaku Bottom Max Count275: $value")
    }
}

internal fun PlayerActivity.showV234SubtitleBgBorder282Toggle() {
    val current = BiliClient.prefs.v234subtitleBgBorder282
    BiliClient.prefs.v234subtitleBgBorder282 = !current
    AppToast.show(this, "Subtitle Bg Border282: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV234GestureShakeAction234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234gestureShakeAction234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234gestureShakeAction234 = value
        AppToast.show(this, "Gesture Shake Action234: $value")
    }
}

internal fun PlayerActivity.showV234CastAudioVolume234Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v234castAudioVolume234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234castAudioVolume234 = value
        AppToast.show(this, "Cast Audio Volume234: $value")
    }
}

internal fun PlayerActivity.showV234PlaylistAutoSkipOutro234Toggle() {
    val current = BiliClient.prefs.v234playlistAutoSkipOutro234
    BiliClient.prefs.v234playlistAutoSkipOutro234 = !current
    AppToast.show(this, "Playlist Auto Skip Outro234: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV234CacheDownloadSpeed235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234cacheDownloadSpeed235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234cacheDownloadSpeed235 = value
        AppToast.show(this, "Cache Download Speed235: $value")
    }
}

internal fun PlayerActivity.showV234ProgressBarThumbBorder234Toggle() {
    val current = BiliClient.prefs.v234progressBarThumbBorder234
    BiliClient.prefs.v234progressBarThumbBorder234 = !current
    AppToast.show(this, "Progress Bar Thumb Border234: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV234VolumeBoostPeak234Toggle() {
    val current = BiliClient.prefs.v234volumeBoostPeak234
    BiliClient.prefs.v234volumeBoostPeak234 = !current
    AppToast.show(this, "Volume Boost Peak234: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV234HistoryBookmarkExport234Toggle() {
    val current = BiliClient.prefs.v234historyBookmarkExport234
    BiliClient.prefs.v234historyBookmarkExport234 = !current
    AppToast.show(this, "History Bookmark Export234: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV234PlaybackChapterSync234Toggle() {
    val current = BiliClient.prefs.v234playbackChapterSync234
    BiliClient.prefs.v234playbackChapterSync234 = !current
    AppToast.show(this, "Playback Chapter Sync234: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV234ScreenshotSavePath234Toggle() {
    val current = BiliClient.prefs.v234screenshotSavePath234
    BiliClient.prefs.v234screenshotSavePath234 = !current
    AppToast.show(this, "Screenshot Save Path234: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV234VideoColorSpace234Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234videoColorSpace234).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space234",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234videoColorSpace234 = value
        AppToast.show(this, "Video Color Space234: $value")
    }
}

internal fun PlayerActivity.showV234DanmakuBottomMaxCount276Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v234danmakuBottomMaxCount276).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count276",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v234danmakuBottomMaxCount276 = value
        AppToast.show(this, "Danmaku Bottom Max Count276: $value")
    }
}

internal fun PlayerActivity.showV234SubtitleBgBorder283Toggle() {
    val current = BiliClient.prefs.v234subtitleBgBorder283
    BiliClient.prefs.v234subtitleBgBorder283 = !current
    AppToast.show(this, "Subtitle Bg Border283: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV235AudioEQCustom235Toggle() {
    val current = BiliClient.prefs.v235audioEQCustom235
    BiliClient.prefs.v235audioEQCustom235 = !current
    AppToast.show(this, "Audio EQ Custom235: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV235DanmakuBottomMaxCount277Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235danmakuBottomMaxCount277).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count277",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235danmakuBottomMaxCount277 = value
        AppToast.show(this, "Danmaku Bottom Max Count277: $value")
    }
}

internal fun PlayerActivity.showV235SubtitleBgBorder284Toggle() {
    val current = BiliClient.prefs.v235subtitleBgBorder284
    BiliClient.prefs.v235subtitleBgBorder284 = !current
    AppToast.show(this, "Subtitle Bg Border284: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV235GestureShakeAction235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235gestureShakeAction235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235gestureShakeAction235 = value
        AppToast.show(this, "Gesture Shake Action235: $value")
    }
}

internal fun PlayerActivity.showV235CastAudioVolume235Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v235castAudioVolume235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235castAudioVolume235 = value
        AppToast.show(this, "Cast Audio Volume235: $value")
    }
}

internal fun PlayerActivity.showV235PlaylistAutoSkipOutro235Toggle() {
    val current = BiliClient.prefs.v235playlistAutoSkipOutro235
    BiliClient.prefs.v235playlistAutoSkipOutro235 = !current
    AppToast.show(this, "Playlist Auto Skip Outro235: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV235CacheDownloadSpeed236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235cacheDownloadSpeed236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235cacheDownloadSpeed236 = value
        AppToast.show(this, "Cache Download Speed236: $value")
    }
}

internal fun PlayerActivity.showV235ProgressBarThumbBorder235Toggle() {
    val current = BiliClient.prefs.v235progressBarThumbBorder235
    BiliClient.prefs.v235progressBarThumbBorder235 = !current
    AppToast.show(this, "Progress Bar Thumb Border235: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV235VolumeBoostPeak235Toggle() {
    val current = BiliClient.prefs.v235volumeBoostPeak235
    BiliClient.prefs.v235volumeBoostPeak235 = !current
    AppToast.show(this, "Volume Boost Peak235: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV235HistoryBookmarkExport235Toggle() {
    val current = BiliClient.prefs.v235historyBookmarkExport235
    BiliClient.prefs.v235historyBookmarkExport235 = !current
    AppToast.show(this, "History Bookmark Export235: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV235PlaybackChapterSync235Toggle() {
    val current = BiliClient.prefs.v235playbackChapterSync235
    BiliClient.prefs.v235playbackChapterSync235 = !current
    AppToast.show(this, "Playback Chapter Sync235: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV235ScreenshotSavePath235Toggle() {
    val current = BiliClient.prefs.v235screenshotSavePath235
    BiliClient.prefs.v235screenshotSavePath235 = !current
    AppToast.show(this, "Screenshot Save Path235: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV235VideoColorSpace235Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235videoColorSpace235).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space235",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235videoColorSpace235 = value
        AppToast.show(this, "Video Color Space235: $value")
    }
}

internal fun PlayerActivity.showV235DanmakuBottomMaxCount278Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v235danmakuBottomMaxCount278).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count278",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v235danmakuBottomMaxCount278 = value
        AppToast.show(this, "Danmaku Bottom Max Count278: $value")
    }
}

internal fun PlayerActivity.showV235SubtitleBgBorder285Toggle() {
    val current = BiliClient.prefs.v235subtitleBgBorder285
    BiliClient.prefs.v235subtitleBgBorder285 = !current
    AppToast.show(this, "Subtitle Bg Border285: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV236AudioEQCustom236Toggle() {
    val current = BiliClient.prefs.v236audioEQCustom236
    BiliClient.prefs.v236audioEQCustom236 = !current
    AppToast.show(this, "Audio EQ Custom236: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV236DanmakuBottomMaxCount279Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236danmakuBottomMaxCount279).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count279",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236danmakuBottomMaxCount279 = value
        AppToast.show(this, "Danmaku Bottom Max Count279: $value")
    }
}

internal fun PlayerActivity.showV236SubtitleBgBorder286Toggle() {
    val current = BiliClient.prefs.v236subtitleBgBorder286
    BiliClient.prefs.v236subtitleBgBorder286 = !current
    AppToast.show(this, "Subtitle Bg Border286: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV236GestureShakeAction236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236gestureShakeAction236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236gestureShakeAction236 = value
        AppToast.show(this, "Gesture Shake Action236: $value")
    }
}

internal fun PlayerActivity.showV236CastAudioVolume236Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v236castAudioVolume236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236castAudioVolume236 = value
        AppToast.show(this, "Cast Audio Volume236: $value")
    }
}

internal fun PlayerActivity.showV236PlaylistAutoSkipOutro236Toggle() {
    val current = BiliClient.prefs.v236playlistAutoSkipOutro236
    BiliClient.prefs.v236playlistAutoSkipOutro236 = !current
    AppToast.show(this, "Playlist Auto Skip Outro236: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV236CacheDownloadSpeed237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236cacheDownloadSpeed237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236cacheDownloadSpeed237 = value
        AppToast.show(this, "Cache Download Speed237: $value")
    }
}

internal fun PlayerActivity.showV236ProgressBarThumbBorder236Toggle() {
    val current = BiliClient.prefs.v236progressBarThumbBorder236
    BiliClient.prefs.v236progressBarThumbBorder236 = !current
    AppToast.show(this, "Progress Bar Thumb Border236: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV236VolumeBoostPeak236Toggle() {
    val current = BiliClient.prefs.v236volumeBoostPeak236
    BiliClient.prefs.v236volumeBoostPeak236 = !current
    AppToast.show(this, "Volume Boost Peak236: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV236HistoryBookmarkExport236Toggle() {
    val current = BiliClient.prefs.v236historyBookmarkExport236
    BiliClient.prefs.v236historyBookmarkExport236 = !current
    AppToast.show(this, "History Bookmark Export236: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV236PlaybackChapterSync236Toggle() {
    val current = BiliClient.prefs.v236playbackChapterSync236
    BiliClient.prefs.v236playbackChapterSync236 = !current
    AppToast.show(this, "Playback Chapter Sync236: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV236ScreenshotSavePath236Toggle() {
    val current = BiliClient.prefs.v236screenshotSavePath236
    BiliClient.prefs.v236screenshotSavePath236 = !current
    AppToast.show(this, "Screenshot Save Path236: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV236VideoColorSpace236Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236videoColorSpace236).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space236",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236videoColorSpace236 = value
        AppToast.show(this, "Video Color Space236: $value")
    }
}

internal fun PlayerActivity.showV236DanmakuBottomMaxCount280Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v236danmakuBottomMaxCount280).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count280",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v236danmakuBottomMaxCount280 = value
        AppToast.show(this, "Danmaku Bottom Max Count280: $value")
    }
}

internal fun PlayerActivity.showV236SubtitleBgBorder287Toggle() {
    val current = BiliClient.prefs.v236subtitleBgBorder287
    BiliClient.prefs.v236subtitleBgBorder287 = !current
    AppToast.show(this, "Subtitle Bg Border287: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV237AudioEQCustom237Toggle() {
    val current = BiliClient.prefs.v237audioEQCustom237
    BiliClient.prefs.v237audioEQCustom237 = !current
    AppToast.show(this, "Audio EQ Custom237: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV237DanmakuBottomMaxCount281Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237danmakuBottomMaxCount281).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count281",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237danmakuBottomMaxCount281 = value
        AppToast.show(this, "Danmaku Bottom Max Count281: $value")
    }
}

internal fun PlayerActivity.showV237SubtitleBgBorder288Toggle() {
    val current = BiliClient.prefs.v237subtitleBgBorder288
    BiliClient.prefs.v237subtitleBgBorder288 = !current
    AppToast.show(this, "Subtitle Bg Border288: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV237GestureShakeAction237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237gestureShakeAction237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237gestureShakeAction237 = value
        AppToast.show(this, "Gesture Shake Action237: $value")
    }
}

internal fun PlayerActivity.showV237CastAudioVolume237Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v237castAudioVolume237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237castAudioVolume237 = value
        AppToast.show(this, "Cast Audio Volume237: $value")
    }
}

internal fun PlayerActivity.showV237PlaylistAutoSkipOutro237Toggle() {
    val current = BiliClient.prefs.v237playlistAutoSkipOutro237
    BiliClient.prefs.v237playlistAutoSkipOutro237 = !current
    AppToast.show(this, "Playlist Auto Skip Outro237: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV237CacheDownloadSpeed238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237cacheDownloadSpeed238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237cacheDownloadSpeed238 = value
        AppToast.show(this, "Cache Download Speed238: $value")
    }
}

internal fun PlayerActivity.showV237ProgressBarThumbBorder237Toggle() {
    val current = BiliClient.prefs.v237progressBarThumbBorder237
    BiliClient.prefs.v237progressBarThumbBorder237 = !current
    AppToast.show(this, "Progress Bar Thumb Border237: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV237VolumeBoostPeak237Toggle() {
    val current = BiliClient.prefs.v237volumeBoostPeak237
    BiliClient.prefs.v237volumeBoostPeak237 = !current
    AppToast.show(this, "Volume Boost Peak237: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV237HistoryBookmarkExport237Toggle() {
    val current = BiliClient.prefs.v237historyBookmarkExport237
    BiliClient.prefs.v237historyBookmarkExport237 = !current
    AppToast.show(this, "History Bookmark Export237: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV237PlaybackChapterSync237Toggle() {
    val current = BiliClient.prefs.v237playbackChapterSync237
    BiliClient.prefs.v237playbackChapterSync237 = !current
    AppToast.show(this, "Playback Chapter Sync237: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV237ScreenshotSavePath237Toggle() {
    val current = BiliClient.prefs.v237screenshotSavePath237
    BiliClient.prefs.v237screenshotSavePath237 = !current
    AppToast.show(this, "Screenshot Save Path237: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV237VideoColorSpace237Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237videoColorSpace237).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space237",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237videoColorSpace237 = value
        AppToast.show(this, "Video Color Space237: $value")
    }
}

internal fun PlayerActivity.showV237DanmakuBottomMaxCount282Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v237danmakuBottomMaxCount282).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count282",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v237danmakuBottomMaxCount282 = value
        AppToast.show(this, "Danmaku Bottom Max Count282: $value")
    }
}

internal fun PlayerActivity.showV237SubtitleBgBorder289Toggle() {
    val current = BiliClient.prefs.v237subtitleBgBorder289
    BiliClient.prefs.v237subtitleBgBorder289 = !current
    AppToast.show(this, "Subtitle Bg Border289: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV238AudioEQCustom238Toggle() {
    val current = BiliClient.prefs.v238audioEQCustom238
    BiliClient.prefs.v238audioEQCustom238 = !current
    AppToast.show(this, "Audio EQ Custom238: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV238DanmakuBottomMaxCount283Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238danmakuBottomMaxCount283).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count283",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238danmakuBottomMaxCount283 = value
        AppToast.show(this, "Danmaku Bottom Max Count283: $value")
    }
}

internal fun PlayerActivity.showV238SubtitleBgBorder290Toggle() {
    val current = BiliClient.prefs.v238subtitleBgBorder290
    BiliClient.prefs.v238subtitleBgBorder290 = !current
    AppToast.show(this, "Subtitle Bg Border290: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV238GestureShakeAction238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238gestureShakeAction238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238gestureShakeAction238 = value
        AppToast.show(this, "Gesture Shake Action238: $value")
    }
}

internal fun PlayerActivity.showV238CastAudioVolume238Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v238castAudioVolume238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238castAudioVolume238 = value
        AppToast.show(this, "Cast Audio Volume238: $value")
    }
}

internal fun PlayerActivity.showV238PlaylistAutoSkipOutro238Toggle() {
    val current = BiliClient.prefs.v238playlistAutoSkipOutro238
    BiliClient.prefs.v238playlistAutoSkipOutro238 = !current
    AppToast.show(this, "Playlist Auto Skip Outro238: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV238CacheDownloadSpeed239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238cacheDownloadSpeed239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238cacheDownloadSpeed239 = value
        AppToast.show(this, "Cache Download Speed239: $value")
    }
}

internal fun PlayerActivity.showV238ProgressBarThumbBorder238Toggle() {
    val current = BiliClient.prefs.v238progressBarThumbBorder238
    BiliClient.prefs.v238progressBarThumbBorder238 = !current
    AppToast.show(this, "Progress Bar Thumb Border238: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV238VolumeBoostPeak238Toggle() {
    val current = BiliClient.prefs.v238volumeBoostPeak238
    BiliClient.prefs.v238volumeBoostPeak238 = !current
    AppToast.show(this, "Volume Boost Peak238: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV238HistoryBookmarkExport238Toggle() {
    val current = BiliClient.prefs.v238historyBookmarkExport238
    BiliClient.prefs.v238historyBookmarkExport238 = !current
    AppToast.show(this, "History Bookmark Export238: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV238PlaybackChapterSync238Toggle() {
    val current = BiliClient.prefs.v238playbackChapterSync238
    BiliClient.prefs.v238playbackChapterSync238 = !current
    AppToast.show(this, "Playback Chapter Sync238: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV238ScreenshotSavePath238Toggle() {
    val current = BiliClient.prefs.v238screenshotSavePath238
    BiliClient.prefs.v238screenshotSavePath238 = !current
    AppToast.show(this, "Screenshot Save Path238: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV238VideoColorSpace238Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238videoColorSpace238).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space238",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238videoColorSpace238 = value
        AppToast.show(this, "Video Color Space238: $value")
    }
}

internal fun PlayerActivity.showV238DanmakuBottomMaxCount284Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v238danmakuBottomMaxCount284).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count284",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v238danmakuBottomMaxCount284 = value
        AppToast.show(this, "Danmaku Bottom Max Count284: $value")
    }
}

internal fun PlayerActivity.showV238SubtitleBgBorder291Toggle() {
    val current = BiliClient.prefs.v238subtitleBgBorder291
    BiliClient.prefs.v238subtitleBgBorder291 = !current
    AppToast.show(this, "Subtitle Bg Border291: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV239AudioEQCustom239Toggle() {
    val current = BiliClient.prefs.v239audioEQCustom239
    BiliClient.prefs.v239audioEQCustom239 = !current
    AppToast.show(this, "Audio EQ Custom239: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV239DanmakuBottomMaxCount285Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239danmakuBottomMaxCount285).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count285",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239danmakuBottomMaxCount285 = value
        AppToast.show(this, "Danmaku Bottom Max Count285: $value")
    }
}

internal fun PlayerActivity.showV239SubtitleBgBorder292Toggle() {
    val current = BiliClient.prefs.v239subtitleBgBorder292
    BiliClient.prefs.v239subtitleBgBorder292 = !current
    AppToast.show(this, "Subtitle Bg Border292: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV239GestureShakeAction239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239gestureShakeAction239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239gestureShakeAction239 = value
        AppToast.show(this, "Gesture Shake Action239: $value")
    }
}

internal fun PlayerActivity.showV239CastAudioVolume239Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v239castAudioVolume239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239castAudioVolume239 = value
        AppToast.show(this, "Cast Audio Volume239: $value")
    }
}

internal fun PlayerActivity.showV239PlaylistAutoSkipOutro239Toggle() {
    val current = BiliClient.prefs.v239playlistAutoSkipOutro239
    BiliClient.prefs.v239playlistAutoSkipOutro239 = !current
    AppToast.show(this, "Playlist Auto Skip Outro239: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV239CacheDownloadSpeed240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239cacheDownloadSpeed240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239cacheDownloadSpeed240 = value
        AppToast.show(this, "Cache Download Speed240: $value")
    }
}

internal fun PlayerActivity.showV239ProgressBarThumbBorder239Toggle() {
    val current = BiliClient.prefs.v239progressBarThumbBorder239
    BiliClient.prefs.v239progressBarThumbBorder239 = !current
    AppToast.show(this, "Progress Bar Thumb Border239: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV239VolumeBoostPeak239Toggle() {
    val current = BiliClient.prefs.v239volumeBoostPeak239
    BiliClient.prefs.v239volumeBoostPeak239 = !current
    AppToast.show(this, "Volume Boost Peak239: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV239HistoryBookmarkExport239Toggle() {
    val current = BiliClient.prefs.v239historyBookmarkExport239
    BiliClient.prefs.v239historyBookmarkExport239 = !current
    AppToast.show(this, "History Bookmark Export239: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV239PlaybackChapterSync239Toggle() {
    val current = BiliClient.prefs.v239playbackChapterSync239
    BiliClient.prefs.v239playbackChapterSync239 = !current
    AppToast.show(this, "Playback Chapter Sync239: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV239ScreenshotSavePath239Toggle() {
    val current = BiliClient.prefs.v239screenshotSavePath239
    BiliClient.prefs.v239screenshotSavePath239 = !current
    AppToast.show(this, "Screenshot Save Path239: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV239VideoColorSpace239Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239videoColorSpace239).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space239",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239videoColorSpace239 = value
        AppToast.show(this, "Video Color Space239: $value")
    }
}

internal fun PlayerActivity.showV239DanmakuBottomMaxCount286Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v239danmakuBottomMaxCount286).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count286",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v239danmakuBottomMaxCount286 = value
        AppToast.show(this, "Danmaku Bottom Max Count286: $value")
    }
}

internal fun PlayerActivity.showV239SubtitleBgBorder293Toggle() {
    val current = BiliClient.prefs.v239subtitleBgBorder293
    BiliClient.prefs.v239subtitleBgBorder293 = !current
    AppToast.show(this, "Subtitle Bg Border293: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV240AudioEQCustom240Toggle() {
    val current = BiliClient.prefs.v240audioEQCustom240
    BiliClient.prefs.v240audioEQCustom240 = !current
    AppToast.show(this, "Audio EQ Custom240: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV240DanmakuBottomMaxCount287Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240danmakuBottomMaxCount287).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count287",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240danmakuBottomMaxCount287 = value
        AppToast.show(this, "Danmaku Bottom Max Count287: $value")
    }
}

internal fun PlayerActivity.showV240SubtitleBgBorder294Toggle() {
    val current = BiliClient.prefs.v240subtitleBgBorder294
    BiliClient.prefs.v240subtitleBgBorder294 = !current
    AppToast.show(this, "Subtitle Bg Border294: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV240GestureShakeAction240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240gestureShakeAction240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240gestureShakeAction240 = value
        AppToast.show(this, "Gesture Shake Action240: $value")
    }
}

internal fun PlayerActivity.showV240CastAudioVolume240Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v240castAudioVolume240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240castAudioVolume240 = value
        AppToast.show(this, "Cast Audio Volume240: $value")
    }
}

internal fun PlayerActivity.showV240PlaylistAutoSkipOutro240Toggle() {
    val current = BiliClient.prefs.v240playlistAutoSkipOutro240
    BiliClient.prefs.v240playlistAutoSkipOutro240 = !current
    AppToast.show(this, "Playlist Auto Skip Outro240: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV240CacheDownloadSpeed241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240cacheDownloadSpeed241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240cacheDownloadSpeed241 = value
        AppToast.show(this, "Cache Download Speed241: $value")
    }
}

internal fun PlayerActivity.showV240ProgressBarThumbBorder240Toggle() {
    val current = BiliClient.prefs.v240progressBarThumbBorder240
    BiliClient.prefs.v240progressBarThumbBorder240 = !current
    AppToast.show(this, "Progress Bar Thumb Border240: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV240VolumeBoostPeak240Toggle() {
    val current = BiliClient.prefs.v240volumeBoostPeak240
    BiliClient.prefs.v240volumeBoostPeak240 = !current
    AppToast.show(this, "Volume Boost Peak240: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV240HistoryBookmarkExport240Toggle() {
    val current = BiliClient.prefs.v240historyBookmarkExport240
    BiliClient.prefs.v240historyBookmarkExport240 = !current
    AppToast.show(this, "History Bookmark Export240: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV240PlaybackChapterSync240Toggle() {
    val current = BiliClient.prefs.v240playbackChapterSync240
    BiliClient.prefs.v240playbackChapterSync240 = !current
    AppToast.show(this, "Playback Chapter Sync240: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV240ScreenshotSavePath240Toggle() {
    val current = BiliClient.prefs.v240screenshotSavePath240
    BiliClient.prefs.v240screenshotSavePath240 = !current
    AppToast.show(this, "Screenshot Save Path240: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV240VideoColorSpace240Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240videoColorSpace240).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space240",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240videoColorSpace240 = value
        AppToast.show(this, "Video Color Space240: $value")
    }
}

internal fun PlayerActivity.showV240DanmakuBottomMaxCount288Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v240danmakuBottomMaxCount288).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count288",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v240danmakuBottomMaxCount288 = value
        AppToast.show(this, "Danmaku Bottom Max Count288: $value")
    }
}

internal fun PlayerActivity.showV240SubtitleBgBorder295Toggle() {
    val current = BiliClient.prefs.v240subtitleBgBorder295
    BiliClient.prefs.v240subtitleBgBorder295 = !current
    AppToast.show(this, "Subtitle Bg Border295: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV241AudioEQCustom241Toggle() {
    val current = BiliClient.prefs.v241audioEQCustom241
    BiliClient.prefs.v241audioEQCustom241 = !current
    AppToast.show(this, "Audio EQ Custom241: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV241DanmakuBottomMaxCount289Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241danmakuBottomMaxCount289).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count289",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241danmakuBottomMaxCount289 = value
        AppToast.show(this, "Danmaku Bottom Max Count289: $value")
    }
}

internal fun PlayerActivity.showV241SubtitleBgBorder296Toggle() {
    val current = BiliClient.prefs.v241subtitleBgBorder296
    BiliClient.prefs.v241subtitleBgBorder296 = !current
    AppToast.show(this, "Subtitle Bg Border296: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV241GestureShakeAction241Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241gestureShakeAction241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241gestureShakeAction241 = value
        AppToast.show(this, "Gesture Shake Action241: $value")
    }
}

internal fun PlayerActivity.showV241CastAudioVolume241Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v241castAudioVolume241).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume241",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241castAudioVolume241 = value
        AppToast.show(this, "Cast Audio Volume241: $value")
    }
}

internal fun PlayerActivity.showV241PlaylistAutoSkipOutro241Toggle() {
    val current = BiliClient.prefs.v241playlistAutoSkipOutro241
    BiliClient.prefs.v241playlistAutoSkipOutro241 = !current
    AppToast.show(this, "Playlist Auto Skip Outro241: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV241CacheDownloadSpeed242Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v241cacheDownloadSpeed242).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed242",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v241cacheDownloadSpeed242 = value
        AppToast.show(this, "Cache Download Speed242: $value")
    }
}

internal fun PlayerActivity.showV241ProgressBarThumbBorder241Toggle() {
    val current = BiliClient.prefs.v241progressBarThumbBorder241
    BiliClient.prefs.v241progressBarThumbBorder241 = !current
    AppToast.show(this, "Progress Bar Thumb Border241: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV241VolumeBoostPeak241Toggle() {
    val current = BiliClient.prefs.v241volumeBoostPeak241
    BiliClient.prefs.v241volumeBoostPeak241 = !current
    AppToast.show(this, "Volume Boost Peak241: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV241HistoryBookmarkExport241Toggle() {
    val current = BiliClient.prefs.v241historyBookmarkExport241
    BiliClient.prefs.v241historyBookmarkExport241 = !current
    AppToast.show(this, "History Bookmark Export241: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV241PlaybackChapterSync241Toggle() {
    val current = BiliClient.prefs.v241playbackChapterSync241
    BiliClient.prefs.v241playbackChapterSync241 = !current
    AppToast.show(this, "Playback Chapter Sync241: ${if (!current) "ON" else "OFF"}")
}

