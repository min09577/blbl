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

// v209: Danmaku Bottom Max Count226
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

// v209: Subtitle Bg Border233
internal fun PlayerActivity.showV209SubtitleBgBorder233Toggle() {
    val current = BiliClient.prefs.v209subtitleBgBorder233
    BiliClient.prefs.v209subtitleBgBorder233 = !current
    AppToast.show(this, "Subtitle Bg Border233: ${if (!current) "ON" else "OFF"}")
}

// v210: Audio EQ Custom210
internal fun PlayerActivity.showV210AudioEQCustom210Toggle() {
    val current = BiliClient.prefs.v210audioEQCustom210
    BiliClient.prefs.v210audioEQCustom210 = !current
    AppToast.show(this, "Audio EQ Custom210: ${if (!current) "ON" else "OFF"}")
}

// v210: Danmaku Bottom Max Count227
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

// v210: Subtitle Bg Border234
internal fun PlayerActivity.showV210SubtitleBgBorder234Toggle() {
    val current = BiliClient.prefs.v210subtitleBgBorder234
    BiliClient.prefs.v210subtitleBgBorder234 = !current
    AppToast.show(this, "Subtitle Bg Border234: ${if (!current) "ON" else "OFF"}")
}

// v210: Gesture Shake Action210
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

// v210: Cast Audio Volume210
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

// v210: Playlist Auto Skip Outro210
internal fun PlayerActivity.showV210PlaylistAutoSkipOutro210Toggle() {
    val current = BiliClient.prefs.v210playlistAutoSkipOutro210
    BiliClient.prefs.v210playlistAutoSkipOutro210 = !current
    AppToast.show(this, "Playlist Auto Skip Outro210: ${if (!current) "ON" else "OFF"}")
}

// v210: Cache Download Speed211
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

// v210: Progress Bar Thumb Border210
internal fun PlayerActivity.showV210ProgressBarThumbBorder210Toggle() {
    val current = BiliClient.prefs.v210progressBarThumbBorder210
    BiliClient.prefs.v210progressBarThumbBorder210 = !current
    AppToast.show(this, "Progress Bar Thumb Border210: ${if (!current) "ON" else "OFF"}")
}

// v210: Volume Boost Peak210
internal fun PlayerActivity.showV210VolumeBoostPeak210Toggle() {
    val current = BiliClient.prefs.v210volumeBoostPeak210
    BiliClient.prefs.v210volumeBoostPeak210 = !current
    AppToast.show(this, "Volume Boost Peak210: ${if (!current) "ON" else "OFF"}")
}

// v210: History Bookmark Export210
internal fun PlayerActivity.showV210HistoryBookmarkExport210Toggle() {
    val current = BiliClient.prefs.v210historyBookmarkExport210
    BiliClient.prefs.v210historyBookmarkExport210 = !current
    AppToast.show(this, "History Bookmark Export210: ${if (!current) "ON" else "OFF"}")
}

// v210: Playback Chapter Sync210
internal fun PlayerActivity.showV210PlaybackChapterSync210Toggle() {
    val current = BiliClient.prefs.v210playbackChapterSync210
    BiliClient.prefs.v210playbackChapterSync210 = !current
    AppToast.show(this, "Playback Chapter Sync210: ${if (!current) "ON" else "OFF"}")
}

// v210: Screenshot Save Path210
internal fun PlayerActivity.showV210ScreenshotSavePath210Toggle() {
    val current = BiliClient.prefs.v210screenshotSavePath210
    BiliClient.prefs.v210screenshotSavePath210 = !current
    AppToast.show(this, "Screenshot Save Path210: ${if (!current) "ON" else "OFF"}")
}

// v210: Video Color Space210
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

// v210: Danmaku Bottom Max Count228
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

// v210: Subtitle Bg Border235
internal fun PlayerActivity.showV210SubtitleBgBorder235Toggle() {
    val current = BiliClient.prefs.v210subtitleBgBorder235
    BiliClient.prefs.v210subtitleBgBorder235 = !current
    AppToast.show(this, "Subtitle Bg Border235: ${if (!current) "ON" else "OFF"}")
}

// v211: Audio EQ Custom211
internal fun PlayerActivity.showV211AudioEQCustom211Toggle() {
    val current = BiliClient.prefs.v211audioEQCustom211
    BiliClient.prefs.v211audioEQCustom211 = !current
    AppToast.show(this, "Audio EQ Custom211: ${if (!current) "ON" else "OFF"}")
}

// v211: Danmaku Bottom Max Count229
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

// v211: Subtitle Bg Border236
internal fun PlayerActivity.showV211SubtitleBgBorder236Toggle() {
    val current = BiliClient.prefs.v211subtitleBgBorder236
    BiliClient.prefs.v211subtitleBgBorder236 = !current
    AppToast.show(this, "Subtitle Bg Border236: ${if (!current) "ON" else "OFF"}")
}

// v211: Gesture Shake Action211
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

// v211: Cast Audio Volume211
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

// v211: Playlist Auto Skip Outro211
internal fun PlayerActivity.showV211PlaylistAutoSkipOutro211Toggle() {
    val current = BiliClient.prefs.v211playlistAutoSkipOutro211
    BiliClient.prefs.v211playlistAutoSkipOutro211 = !current
    AppToast.show(this, "Playlist Auto Skip Outro211: ${if (!current) "ON" else "OFF"}")
}

// v211: Cache Download Speed212
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

// v211: Progress Bar Thumb Border211
internal fun PlayerActivity.showV211ProgressBarThumbBorder211Toggle() {
    val current = BiliClient.prefs.v211progressBarThumbBorder211
    BiliClient.prefs.v211progressBarThumbBorder211 = !current
    AppToast.show(this, "Progress Bar Thumb Border211: ${if (!current) "ON" else "OFF"}")
}

// v211: Volume Boost Peak211
internal fun PlayerActivity.showV211VolumeBoostPeak211Toggle() {
    val current = BiliClient.prefs.v211volumeBoostPeak211
    BiliClient.prefs.v211volumeBoostPeak211 = !current
    AppToast.show(this, "Volume Boost Peak211: ${if (!current) "ON" else "OFF"}")
}

// v211: History Bookmark Export211
internal fun PlayerActivity.showV211HistoryBookmarkExport211Toggle() {
    val current = BiliClient.prefs.v211historyBookmarkExport211
    BiliClient.prefs.v211historyBookmarkExport211 = !current
    AppToast.show(this, "History Bookmark Export211: ${if (!current) "ON" else "OFF"}")
}

// v211: Playback Chapter Sync211
internal fun PlayerActivity.showV211PlaybackChapterSync211Toggle() {
    val current = BiliClient.prefs.v211playbackChapterSync211
    BiliClient.prefs.v211playbackChapterSync211 = !current
    AppToast.show(this, "Playback Chapter Sync211: ${if (!current) "ON" else "OFF"}")
}

// v211: Screenshot Save Path211
internal fun PlayerActivity.showV211ScreenshotSavePath211Toggle() {
    val current = BiliClient.prefs.v211screenshotSavePath211
    BiliClient.prefs.v211screenshotSavePath211 = !current
    AppToast.show(this, "Screenshot Save Path211: ${if (!current) "ON" else "OFF"}")
}

// v211: Video Color Space211
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

// v211: Danmaku Bottom Max Count230
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

// v211: Subtitle Bg Border237
internal fun PlayerActivity.showV211SubtitleBgBorder237Toggle() {
    val current = BiliClient.prefs.v211subtitleBgBorder237
    BiliClient.prefs.v211subtitleBgBorder237 = !current
    AppToast.show(this, "Subtitle Bg Border237: ${if (!current) "ON" else "OFF"}")
}

// v212: Audio EQ Custom212
internal fun PlayerActivity.showV212AudioEQCustom212Toggle() {
    val current = BiliClient.prefs.v212audioEQCustom212
    BiliClient.prefs.v212audioEQCustom212 = !current
    AppToast.show(this, "Audio EQ Custom212: ${if (!current) "ON" else "OFF"}")
}

// v212: Danmaku Bottom Max Count231
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

// v212: Subtitle Bg Border238
internal fun PlayerActivity.showV212SubtitleBgBorder238Toggle() {
    val current = BiliClient.prefs.v212subtitleBgBorder238
    BiliClient.prefs.v212subtitleBgBorder238 = !current
    AppToast.show(this, "Subtitle Bg Border238: ${if (!current) "ON" else "OFF"}")
}

// v212: Gesture Shake Action212
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

// v212: Cast Audio Volume212
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

// v212: Playlist Auto Skip Outro212
internal fun PlayerActivity.showV212PlaylistAutoSkipOutro212Toggle() {
    val current = BiliClient.prefs.v212playlistAutoSkipOutro212
    BiliClient.prefs.v212playlistAutoSkipOutro212 = !current
    AppToast.show(this, "Playlist Auto Skip Outro212: ${if (!current) "ON" else "OFF"}")
}

// v212: Cache Download Speed213
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

// v212: Progress Bar Thumb Border212
internal fun PlayerActivity.showV212ProgressBarThumbBorder212Toggle() {
    val current = BiliClient.prefs.v212progressBarThumbBorder212
    BiliClient.prefs.v212progressBarThumbBorder212 = !current
    AppToast.show(this, "Progress Bar Thumb Border212: ${if (!current) "ON" else "OFF"}")
}

// v212: Volume Boost Peak212
internal fun PlayerActivity.showV212VolumeBoostPeak212Toggle() {
    val current = BiliClient.prefs.v212volumeBoostPeak212
    BiliClient.prefs.v212volumeBoostPeak212 = !current
    AppToast.show(this, "Volume Boost Peak212: ${if (!current) "ON" else "OFF"}")
}

// v212: History Bookmark Export212
internal fun PlayerActivity.showV212HistoryBookmarkExport212Toggle() {
    val current = BiliClient.prefs.v212historyBookmarkExport212
    BiliClient.prefs.v212historyBookmarkExport212 = !current
    AppToast.show(this, "History Bookmark Export212: ${if (!current) "ON" else "OFF"}")
}

// v212: Playback Chapter Sync212
internal fun PlayerActivity.showV212PlaybackChapterSync212Toggle() {
    val current = BiliClient.prefs.v212playbackChapterSync212
    BiliClient.prefs.v212playbackChapterSync212 = !current
    AppToast.show(this, "Playback Chapter Sync212: ${if (!current) "ON" else "OFF"}")
}

// v212: Screenshot Save Path212
internal fun PlayerActivity.showV212ScreenshotSavePath212Toggle() {
    val current = BiliClient.prefs.v212screenshotSavePath212
    BiliClient.prefs.v212screenshotSavePath212 = !current
    AppToast.show(this, "Screenshot Save Path212: ${if (!current) "ON" else "OFF"}")
}

// v212: Video Color Space212
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

// v212: Danmaku Bottom Max Count232
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

// v212: Subtitle Bg Border239
internal fun PlayerActivity.showV212SubtitleBgBorder239Toggle() {
    val current = BiliClient.prefs.v212subtitleBgBorder239
    BiliClient.prefs.v212subtitleBgBorder239 = !current
    AppToast.show(this, "Subtitle Bg Border239: ${if (!current) "ON" else "OFF"}")
}

// v213: Audio EQ Custom213
internal fun PlayerActivity.showV213AudioEQCustom213Toggle() {
    val current = BiliClient.prefs.v213audioEQCustom213
    BiliClient.prefs.v213audioEQCustom213 = !current
    AppToast.show(this, "Audio EQ Custom213: ${if (!current) "ON" else "OFF"}")
}

// v213: Danmaku Bottom Max Count233
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

// v213: Subtitle Bg Border240
internal fun PlayerActivity.showV213SubtitleBgBorder240Toggle() {
    val current = BiliClient.prefs.v213subtitleBgBorder240
    BiliClient.prefs.v213subtitleBgBorder240 = !current
    AppToast.show(this, "Subtitle Bg Border240: ${if (!current) "ON" else "OFF"}")
}

// v213: Gesture Shake Action213
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

// v213: Cast Audio Volume213
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

// v213: Playlist Auto Skip Outro213
internal fun PlayerActivity.showV213PlaylistAutoSkipOutro213Toggle() {
    val current = BiliClient.prefs.v213playlistAutoSkipOutro213
    BiliClient.prefs.v213playlistAutoSkipOutro213 = !current
    AppToast.show(this, "Playlist Auto Skip Outro213: ${if (!current) "ON" else "OFF"}")
}

// v213: Cache Download Speed214
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

// v213: Progress Bar Thumb Border213
internal fun PlayerActivity.showV213ProgressBarThumbBorder213Toggle() {
    val current = BiliClient.prefs.v213progressBarThumbBorder213
    BiliClient.prefs.v213progressBarThumbBorder213 = !current
    AppToast.show(this, "Progress Bar Thumb Border213: ${if (!current) "ON" else "OFF"}")
}

// v213: Volume Boost Peak213
internal fun PlayerActivity.showV213VolumeBoostPeak213Toggle() {
    val current = BiliClient.prefs.v213volumeBoostPeak213
    BiliClient.prefs.v213volumeBoostPeak213 = !current
    AppToast.show(this, "Volume Boost Peak213: ${if (!current) "ON" else "OFF"}")
}

// v213: History Bookmark Export213
internal fun PlayerActivity.showV213HistoryBookmarkExport213Toggle() {
    val current = BiliClient.prefs.v213historyBookmarkExport213
    BiliClient.prefs.v213historyBookmarkExport213 = !current
    AppToast.show(this, "History Bookmark Export213: ${if (!current) "ON" else "OFF"}")
}

// v213: Playback Chapter Sync213
internal fun PlayerActivity.showV213PlaybackChapterSync213Toggle() {
    val current = BiliClient.prefs.v213playbackChapterSync213
    BiliClient.prefs.v213playbackChapterSync213 = !current
    AppToast.show(this, "Playback Chapter Sync213: ${if (!current) "ON" else "OFF"}")
}

// v213: Screenshot Save Path213
internal fun PlayerActivity.showV213ScreenshotSavePath213Toggle() {
    val current = BiliClient.prefs.v213screenshotSavePath213
    BiliClient.prefs.v213screenshotSavePath213 = !current
    AppToast.show(this, "Screenshot Save Path213: ${if (!current) "ON" else "OFF"}")
}

// v213: Video Color Space213
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

// v213: Danmaku Bottom Max Count234
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

// v213: Subtitle Bg Border241
internal fun PlayerActivity.showV213SubtitleBgBorder241Toggle() {
    val current = BiliClient.prefs.v213subtitleBgBorder241
    BiliClient.prefs.v213subtitleBgBorder241 = !current
    AppToast.show(this, "Subtitle Bg Border241: ${if (!current) "ON" else "OFF"}")
}

// v214: Audio EQ Custom214
internal fun PlayerActivity.showV214AudioEQCustom214Toggle() {
    val current = BiliClient.prefs.v214audioEQCustom214
    BiliClient.prefs.v214audioEQCustom214 = !current
    AppToast.show(this, "Audio EQ Custom214: ${if (!current) "ON" else "OFF"}")
}

// v214: Danmaku Bottom Max Count235
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

// v214: Subtitle Bg Border242
internal fun PlayerActivity.showV214SubtitleBgBorder242Toggle() {
    val current = BiliClient.prefs.v214subtitleBgBorder242
    BiliClient.prefs.v214subtitleBgBorder242 = !current
    AppToast.show(this, "Subtitle Bg Border242: ${if (!current) "ON" else "OFF"}")
}

// v214: Gesture Shake Action214
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

// v214: Cast Audio Volume214
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

// v214: Playlist Auto Skip Outro214
internal fun PlayerActivity.showV214PlaylistAutoSkipOutro214Toggle() {
    val current = BiliClient.prefs.v214playlistAutoSkipOutro214
    BiliClient.prefs.v214playlistAutoSkipOutro214 = !current
    AppToast.show(this, "Playlist Auto Skip Outro214: ${if (!current) "ON" else "OFF"}")
}

// v214: Cache Download Speed215
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

// v214: Progress Bar Thumb Border214
internal fun PlayerActivity.showV214ProgressBarThumbBorder214Toggle() {
    val current = BiliClient.prefs.v214progressBarThumbBorder214
    BiliClient.prefs.v214progressBarThumbBorder214 = !current
    AppToast.show(this, "Progress Bar Thumb Border214: ${if (!current) "ON" else "OFF"}")
}

// v214: Volume Boost Peak214
internal fun PlayerActivity.showV214VolumeBoostPeak214Toggle() {
    val current = BiliClient.prefs.v214volumeBoostPeak214
    BiliClient.prefs.v214volumeBoostPeak214 = !current
    AppToast.show(this, "Volume Boost Peak214: ${if (!current) "ON" else "OFF"}")
}

// v214: History Bookmark Export214
internal fun PlayerActivity.showV214HistoryBookmarkExport214Toggle() {
    val current = BiliClient.prefs.v214historyBookmarkExport214
    BiliClient.prefs.v214historyBookmarkExport214 = !current
    AppToast.show(this, "History Bookmark Export214: ${if (!current) "ON" else "OFF"}")
}

// v214: Playback Chapter Sync214
internal fun PlayerActivity.showV214PlaybackChapterSync214Toggle() {
    val current = BiliClient.prefs.v214playbackChapterSync214
    BiliClient.prefs.v214playbackChapterSync214 = !current
    AppToast.show(this, "Playback Chapter Sync214: ${if (!current) "ON" else "OFF"}")
}

// v214: Screenshot Save Path214
internal fun PlayerActivity.showV214ScreenshotSavePath214Toggle() {
    val current = BiliClient.prefs.v214screenshotSavePath214
    BiliClient.prefs.v214screenshotSavePath214 = !current
    AppToast.show(this, "Screenshot Save Path214: ${if (!current) "ON" else "OFF"}")
}

// v214: Video Color Space214
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

// v214: Danmaku Bottom Max Count236
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

// v214: Subtitle Bg Border243
internal fun PlayerActivity.showV214SubtitleBgBorder243Toggle() {
    val current = BiliClient.prefs.v214subtitleBgBorder243
    BiliClient.prefs.v214subtitleBgBorder243 = !current
    AppToast.show(this, "Subtitle Bg Border243: ${if (!current) "ON" else "OFF"}")
}

// v215: Audio EQ Custom215
internal fun PlayerActivity.showV215AudioEQCustom215Toggle() {
    val current = BiliClient.prefs.v215audioEQCustom215
    BiliClient.prefs.v215audioEQCustom215 = !current
    AppToast.show(this, "Audio EQ Custom215: ${if (!current) "ON" else "OFF"}")
}

// v215: Danmaku Bottom Max Count237
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

// v215: Subtitle Bg Border244
internal fun PlayerActivity.showV215SubtitleBgBorder244Toggle() {
    val current = BiliClient.prefs.v215subtitleBgBorder244
    BiliClient.prefs.v215subtitleBgBorder244 = !current
    AppToast.show(this, "Subtitle Bg Border244: ${if (!current) "ON" else "OFF"}")
}

// v215: Gesture Shake Action215
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

// v215: Cast Audio Volume215
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

// v215: Playlist Auto Skip Outro215
internal fun PlayerActivity.showV215PlaylistAutoSkipOutro215Toggle() {
    val current = BiliClient.prefs.v215playlistAutoSkipOutro215
    BiliClient.prefs.v215playlistAutoSkipOutro215 = !current
    AppToast.show(this, "Playlist Auto Skip Outro215: ${if (!current) "ON" else "OFF"}")
}

// v215: Cache Download Speed216
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

// v215: Progress Bar Thumb Border215
internal fun PlayerActivity.showV215ProgressBarThumbBorder215Toggle() {
    val current = BiliClient.prefs.v215progressBarThumbBorder215
    BiliClient.prefs.v215progressBarThumbBorder215 = !current
    AppToast.show(this, "Progress Bar Thumb Border215: ${if (!current) "ON" else "OFF"}")
}

// v215: Volume Boost Peak215
internal fun PlayerActivity.showV215VolumeBoostPeak215Toggle() {
    val current = BiliClient.prefs.v215volumeBoostPeak215
    BiliClient.prefs.v215volumeBoostPeak215 = !current
    AppToast.show(this, "Volume Boost Peak215: ${if (!current) "ON" else "OFF"}")
}

// v215: History Bookmark Export215
internal fun PlayerActivity.showV215HistoryBookmarkExport215Toggle() {
    val current = BiliClient.prefs.v215historyBookmarkExport215
    BiliClient.prefs.v215historyBookmarkExport215 = !current
    AppToast.show(this, "History Bookmark Export215: ${if (!current) "ON" else "OFF"}")
}

// v215: Playback Chapter Sync215
internal fun PlayerActivity.showV215PlaybackChapterSync215Toggle() {
    val current = BiliClient.prefs.v215playbackChapterSync215
    BiliClient.prefs.v215playbackChapterSync215 = !current
    AppToast.show(this, "Playback Chapter Sync215: ${if (!current) "ON" else "OFF"}")
}

// v215: Screenshot Save Path215
internal fun PlayerActivity.showV215ScreenshotSavePath215Toggle() {
    val current = BiliClient.prefs.v215screenshotSavePath215
    BiliClient.prefs.v215screenshotSavePath215 = !current
    AppToast.show(this, "Screenshot Save Path215: ${if (!current) "ON" else "OFF"}")
}

// v215: Video Color Space215
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

// v215: Danmaku Bottom Max Count238
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

// v215: Subtitle Bg Border245
internal fun PlayerActivity.showV215SubtitleBgBorder245Toggle() {
    val current = BiliClient.prefs.v215subtitleBgBorder245
    BiliClient.prefs.v215subtitleBgBorder245 = !current
    AppToast.show(this, "Subtitle Bg Border245: ${if (!current) "ON" else "OFF"}")
}

// v216: Audio EQ Custom216
internal fun PlayerActivity.showV216AudioEQCustom216Toggle() {
    val current = BiliClient.prefs.v216audioEQCustom216
    BiliClient.prefs.v216audioEQCustom216 = !current
    AppToast.show(this, "Audio EQ Custom216: ${if (!current) "ON" else "OFF"}")
}

// v216: Danmaku Bottom Max Count239
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

// v216: Subtitle Bg Border246
internal fun PlayerActivity.showV216SubtitleBgBorder246Toggle() {
    val current = BiliClient.prefs.v216subtitleBgBorder246
    BiliClient.prefs.v216subtitleBgBorder246 = !current
    AppToast.show(this, "Subtitle Bg Border246: ${if (!current) "ON" else "OFF"}")
}

// v216: Gesture Shake Action216
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

// v216: Cast Audio Volume216
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

// v216: Playlist Auto Skip Outro216
internal fun PlayerActivity.showV216PlaylistAutoSkipOutro216Toggle() {
    val current = BiliClient.prefs.v216playlistAutoSkipOutro216
    BiliClient.prefs.v216playlistAutoSkipOutro216 = !current
    AppToast.show(this, "Playlist Auto Skip Outro216: ${if (!current) "ON" else "OFF"}")
}

// v216: Cache Download Speed217
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

// v216: Progress Bar Thumb Border216
internal fun PlayerActivity.showV216ProgressBarThumbBorder216Toggle() {
    val current = BiliClient.prefs.v216progressBarThumbBorder216
    BiliClient.prefs.v216progressBarThumbBorder216 = !current
    AppToast.show(this, "Progress Bar Thumb Border216: ${if (!current) "ON" else "OFF"}")
}

// v216: Volume Boost Peak216
internal fun PlayerActivity.showV216VolumeBoostPeak216Toggle() {
    val current = BiliClient.prefs.v216volumeBoostPeak216
    BiliClient.prefs.v216volumeBoostPeak216 = !current
    AppToast.show(this, "Volume Boost Peak216: ${if (!current) "ON" else "OFF"}")
}

// v216: History Bookmark Export216
internal fun PlayerActivity.showV216HistoryBookmarkExport216Toggle() {
    val current = BiliClient.prefs.v216historyBookmarkExport216
    BiliClient.prefs.v216historyBookmarkExport216 = !current
    AppToast.show(this, "History Bookmark Export216: ${if (!current) "ON" else "OFF"}")
}

// v216: Playback Chapter Sync216
internal fun PlayerActivity.showV216PlaybackChapterSync216Toggle() {
    val current = BiliClient.prefs.v216playbackChapterSync216
    BiliClient.prefs.v216playbackChapterSync216 = !current
    AppToast.show(this, "Playback Chapter Sync216: ${if (!current) "ON" else "OFF"}")
}

// v216: Screenshot Save Path216
internal fun PlayerActivity.showV216ScreenshotSavePath216Toggle() {
    val current = BiliClient.prefs.v216screenshotSavePath216
    BiliClient.prefs.v216screenshotSavePath216 = !current
    AppToast.show(this, "Screenshot Save Path216: ${if (!current) "ON" else "OFF"}")
}

// v216: Video Color Space216
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

// v216: Danmaku Bottom Max Count240
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

// v216: Subtitle Bg Border247
internal fun PlayerActivity.showV216SubtitleBgBorder247Toggle() {
    val current = BiliClient.prefs.v216subtitleBgBorder247
    BiliClient.prefs.v216subtitleBgBorder247 = !current
    AppToast.show(this, "Subtitle Bg Border247: ${if (!current) "ON" else "OFF"}")
}

// v217: Audio EQ Custom217
internal fun PlayerActivity.showV217AudioEQCustom217Toggle() {
    val current = BiliClient.prefs.v217audioEQCustom217
    BiliClient.prefs.v217audioEQCustom217 = !current
    AppToast.show(this, "Audio EQ Custom217: ${if (!current) "ON" else "OFF"}")
}

// v217: Danmaku Bottom Max Count241
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

// v217: Subtitle Bg Border248
internal fun PlayerActivity.showV217SubtitleBgBorder248Toggle() {
    val current = BiliClient.prefs.v217subtitleBgBorder248
    BiliClient.prefs.v217subtitleBgBorder248 = !current
    AppToast.show(this, "Subtitle Bg Border248: ${if (!current) "ON" else "OFF"}")
}

// v217: Gesture Shake Action217
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

// v217: Cast Audio Volume217
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

// v217: Playlist Auto Skip Outro217
internal fun PlayerActivity.showV217PlaylistAutoSkipOutro217Toggle() {
    val current = BiliClient.prefs.v217playlistAutoSkipOutro217
    BiliClient.prefs.v217playlistAutoSkipOutro217 = !current
    AppToast.show(this, "Playlist Auto Skip Outro217: ${if (!current) "ON" else "OFF"}")
}

// v217: Cache Download Speed218
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

// v217: Progress Bar Thumb Border217
internal fun PlayerActivity.showV217ProgressBarThumbBorder217Toggle() {
    val current = BiliClient.prefs.v217progressBarThumbBorder217
    BiliClient.prefs.v217progressBarThumbBorder217 = !current
    AppToast.show(this, "Progress Bar Thumb Border217: ${if (!current) "ON" else "OFF"}")
}

// v217: Volume Boost Peak217
internal fun PlayerActivity.showV217VolumeBoostPeak217Toggle() {
    val current = BiliClient.prefs.v217volumeBoostPeak217
    BiliClient.prefs.v217volumeBoostPeak217 = !current
    AppToast.show(this, "Volume Boost Peak217: ${if (!current) "ON" else "OFF"}")
}

// v217: History Bookmark Export217
internal fun PlayerActivity.showV217HistoryBookmarkExport217Toggle() {
    val current = BiliClient.prefs.v217historyBookmarkExport217
    BiliClient.prefs.v217historyBookmarkExport217 = !current
    AppToast.show(this, "History Bookmark Export217: ${if (!current) "ON" else "OFF"}")
}

// v217: Playback Chapter Sync217
internal fun PlayerActivity.showV217PlaybackChapterSync217Toggle() {
    val current = BiliClient.prefs.v217playbackChapterSync217
    BiliClient.prefs.v217playbackChapterSync217 = !current
    AppToast.show(this, "Playback Chapter Sync217: ${if (!current) "ON" else "OFF"}")
}

// v217: Screenshot Save Path217
internal fun PlayerActivity.showV217ScreenshotSavePath217Toggle() {
    val current = BiliClient.prefs.v217screenshotSavePath217
    BiliClient.prefs.v217screenshotSavePath217 = !current
    AppToast.show(this, "Screenshot Save Path217: ${if (!current) "ON" else "OFF"}")
}

// v217: Video Color Space217
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

// v217: Danmaku Bottom Max Count242
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

// v217: Subtitle Bg Border249
internal fun PlayerActivity.showV217SubtitleBgBorder249Toggle() {
    val current = BiliClient.prefs.v217subtitleBgBorder249
    BiliClient.prefs.v217subtitleBgBorder249 = !current
    AppToast.show(this, "Subtitle Bg Border249: ${if (!current) "ON" else "OFF"}")
}

// v218: Audio EQ Custom218
internal fun PlayerActivity.showV218AudioEQCustom218Toggle() {
    val current = BiliClient.prefs.v218audioEQCustom218
    BiliClient.prefs.v218audioEQCustom218 = !current
    AppToast.show(this, "Audio EQ Custom218: ${if (!current) "ON" else "OFF"}")
}

// v218: Danmaku Bottom Max Count243
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

// v218: Subtitle Bg Border250
internal fun PlayerActivity.showV218SubtitleBgBorder250Toggle() {
    val current = BiliClient.prefs.v218subtitleBgBorder250
    BiliClient.prefs.v218subtitleBgBorder250 = !current
    AppToast.show(this, "Subtitle Bg Border250: ${if (!current) "ON" else "OFF"}")
}

// v218: Gesture Shake Action218
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

// v218: Cast Audio Volume218
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

// v218: Playlist Auto Skip Outro218
internal fun PlayerActivity.showV218PlaylistAutoSkipOutro218Toggle() {
    val current = BiliClient.prefs.v218playlistAutoSkipOutro218
    BiliClient.prefs.v218playlistAutoSkipOutro218 = !current
    AppToast.show(this, "Playlist Auto Skip Outro218: ${if (!current) "ON" else "OFF"}")
}

// v218: Cache Download Speed219
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

// v218: Progress Bar Thumb Border218
internal fun PlayerActivity.showV218ProgressBarThumbBorder218Toggle() {
    val current = BiliClient.prefs.v218progressBarThumbBorder218
    BiliClient.prefs.v218progressBarThumbBorder218 = !current
    AppToast.show(this, "Progress Bar Thumb Border218: ${if (!current) "ON" else "OFF"}")
}

// v218: Volume Boost Peak218
internal fun PlayerActivity.showV218VolumeBoostPeak218Toggle() {
    val current = BiliClient.prefs.v218volumeBoostPeak218
    BiliClient.prefs.v218volumeBoostPeak218 = !current
    AppToast.show(this, "Volume Boost Peak218: ${if (!current) "ON" else "OFF"}")
}

// v218: History Bookmark Export218
internal fun PlayerActivity.showV218HistoryBookmarkExport218Toggle() {
    val current = BiliClient.prefs.v218historyBookmarkExport218
    BiliClient.prefs.v218historyBookmarkExport218 = !current
    AppToast.show(this, "History Bookmark Export218: ${if (!current) "ON" else "OFF"}")
}

// v218: Playback Chapter Sync218
internal fun PlayerActivity.showV218PlaybackChapterSync218Toggle() {
    val current = BiliClient.prefs.v218playbackChapterSync218
    BiliClient.prefs.v218playbackChapterSync218 = !current
    AppToast.show(this, "Playback Chapter Sync218: ${if (!current) "ON" else "OFF"}")
}

// v218: Screenshot Save Path218
internal fun PlayerActivity.showV218ScreenshotSavePath218Toggle() {
    val current = BiliClient.prefs.v218screenshotSavePath218
    BiliClient.prefs.v218screenshotSavePath218 = !current
    AppToast.show(this, "Screenshot Save Path218: ${if (!current) "ON" else "OFF"}")
}

// v218: Video Color Space218
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

// v218: Danmaku Bottom Max Count244
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

// v218: Subtitle Bg Border251
internal fun PlayerActivity.showV218SubtitleBgBorder251Toggle() {
    val current = BiliClient.prefs.v218subtitleBgBorder251
    BiliClient.prefs.v218subtitleBgBorder251 = !current
    AppToast.show(this, "Subtitle Bg Border251: ${if (!current) "ON" else "OFF"}")
}

// v219: Audio EQ Custom219
internal fun PlayerActivity.showV219AudioEQCustom219Toggle() {
    val current = BiliClient.prefs.v219audioEQCustom219
    BiliClient.prefs.v219audioEQCustom219 = !current
    AppToast.show(this, "Audio EQ Custom219: ${if (!current) "ON" else "OFF"}")
}

// v219: Danmaku Bottom Max Count245
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

// v219: Subtitle Bg Border252
internal fun PlayerActivity.showV219SubtitleBgBorder252Toggle() {
    val current = BiliClient.prefs.v219subtitleBgBorder252
    BiliClient.prefs.v219subtitleBgBorder252 = !current
    AppToast.show(this, "Subtitle Bg Border252: ${if (!current) "ON" else "OFF"}")
}

// v219: Gesture Shake Action219
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

// v219: Cast Audio Volume219
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

// v219: Playlist Auto Skip Outro219
internal fun PlayerActivity.showV219PlaylistAutoSkipOutro219Toggle() {
    val current = BiliClient.prefs.v219playlistAutoSkipOutro219
    BiliClient.prefs.v219playlistAutoSkipOutro219 = !current
    AppToast.show(this, "Playlist Auto Skip Outro219: ${if (!current) "ON" else "OFF"}")
}

// v219: Cache Download Speed220
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

// v219: Progress Bar Thumb Border219
internal fun PlayerActivity.showV219ProgressBarThumbBorder219Toggle() {
    val current = BiliClient.prefs.v219progressBarThumbBorder219
    BiliClient.prefs.v219progressBarThumbBorder219 = !current
    AppToast.show(this, "Progress Bar Thumb Border219: ${if (!current) "ON" else "OFF"}")
}

// v219: Volume Boost Peak219
internal fun PlayerActivity.showV219VolumeBoostPeak219Toggle() {
    val current = BiliClient.prefs.v219volumeBoostPeak219
    BiliClient.prefs.v219volumeBoostPeak219 = !current
    AppToast.show(this, "Volume Boost Peak219: ${if (!current) "ON" else "OFF"}")
}

// v219: History Bookmark Export219
internal fun PlayerActivity.showV219HistoryBookmarkExport219Toggle() {
    val current = BiliClient.prefs.v219historyBookmarkExport219
    BiliClient.prefs.v219historyBookmarkExport219 = !current
    AppToast.show(this, "History Bookmark Export219: ${if (!current) "ON" else "OFF"}")
}

// v219: Playback Chapter Sync219
internal fun PlayerActivity.showV219PlaybackChapterSync219Toggle() {
    val current = BiliClient.prefs.v219playbackChapterSync219
    BiliClient.prefs.v219playbackChapterSync219 = !current
    AppToast.show(this, "Playback Chapter Sync219: ${if (!current) "ON" else "OFF"}")
}

// v219: Screenshot Save Path219
internal fun PlayerActivity.showV219ScreenshotSavePath219Toggle() {
    val current = BiliClient.prefs.v219screenshotSavePath219
    BiliClient.prefs.v219screenshotSavePath219 = !current
    AppToast.show(this, "Screenshot Save Path219: ${if (!current) "ON" else "OFF"}")
}

// v219: Video Color Space219
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

// v219: Danmaku Bottom Max Count246
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

// v219: Subtitle Bg Border253
internal fun PlayerActivity.showV219SubtitleBgBorder253Toggle() {
    val current = BiliClient.prefs.v219subtitleBgBorder253
    BiliClient.prefs.v219subtitleBgBorder253 = !current
    AppToast.show(this, "Subtitle Bg Border253: ${if (!current) "ON" else "OFF"}")
}

// v220: Audio EQ Custom220
internal fun PlayerActivity.showV220AudioEQCustom220Toggle() {
    val current = BiliClient.prefs.v220audioEQCustom220
    BiliClient.prefs.v220audioEQCustom220 = !current
    AppToast.show(this, "Audio EQ Custom220: ${if (!current) "ON" else "OFF"}")
}

// v220: Danmaku Bottom Max Count247
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

// v220: Subtitle Bg Border254
internal fun PlayerActivity.showV220SubtitleBgBorder254Toggle() {
    val current = BiliClient.prefs.v220subtitleBgBorder254
    BiliClient.prefs.v220subtitleBgBorder254 = !current
    AppToast.show(this, "Subtitle Bg Border254: ${if (!current) "ON" else "OFF"}")
}

// v220: Gesture Shake Action220
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

// v220: Cast Audio Volume220
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

// v220: Playlist Auto Skip Outro220
internal fun PlayerActivity.showV220PlaylistAutoSkipOutro220Toggle() {
    val current = BiliClient.prefs.v220playlistAutoSkipOutro220
    BiliClient.prefs.v220playlistAutoSkipOutro220 = !current
    AppToast.show(this, "Playlist Auto Skip Outro220: ${if (!current) "ON" else "OFF"}")
}

// v220: Cache Download Speed221
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

// v220: Progress Bar Thumb Border220
internal fun PlayerActivity.showV220ProgressBarThumbBorder220Toggle() {
    val current = BiliClient.prefs.v220progressBarThumbBorder220
    BiliClient.prefs.v220progressBarThumbBorder220 = !current
    AppToast.show(this, "Progress Bar Thumb Border220: ${if (!current) "ON" else "OFF"}")
}

// v220: Volume Boost Peak220
internal fun PlayerActivity.showV220VolumeBoostPeak220Toggle() {
    val current = BiliClient.prefs.v220volumeBoostPeak220
    BiliClient.prefs.v220volumeBoostPeak220 = !current
    AppToast.show(this, "Volume Boost Peak220: ${if (!current) "ON" else "OFF"}")
}

// v220: History Bookmark Export220
internal fun PlayerActivity.showV220HistoryBookmarkExport220Toggle() {
    val current = BiliClient.prefs.v220historyBookmarkExport220
    BiliClient.prefs.v220historyBookmarkExport220 = !current
    AppToast.show(this, "History Bookmark Export220: ${if (!current) "ON" else "OFF"}")
}

// v220: Playback Chapter Sync220
internal fun PlayerActivity.showV220PlaybackChapterSync220Toggle() {
    val current = BiliClient.prefs.v220playbackChapterSync220
    BiliClient.prefs.v220playbackChapterSync220 = !current
    AppToast.show(this, "Playback Chapter Sync220: ${if (!current) "ON" else "OFF"}")
}

// v220: Screenshot Save Path220
internal fun PlayerActivity.showV220ScreenshotSavePath220Toggle() {
    val current = BiliClient.prefs.v220screenshotSavePath220
    BiliClient.prefs.v220screenshotSavePath220 = !current
    AppToast.show(this, "Screenshot Save Path220: ${if (!current) "ON" else "OFF"}")
}

// v220: Video Color Space220
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

// v220: Danmaku Bottom Max Count248
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

// v220: Subtitle Bg Border255
internal fun PlayerActivity.showV220SubtitleBgBorder255Toggle() {
    val current = BiliClient.prefs.v220subtitleBgBorder255
    BiliClient.prefs.v220subtitleBgBorder255 = !current
    AppToast.show(this, "Subtitle Bg Border255: ${if (!current) "ON" else "OFF"}")
}

// v221: Audio EQ Custom221
internal fun PlayerActivity.showV221AudioEQCustom221Toggle() {
    val current = BiliClient.prefs.v221audioEQCustom221
    BiliClient.prefs.v221audioEQCustom221 = !current
    AppToast.show(this, "Audio EQ Custom221: ${if (!current) "ON" else "OFF"}")
}

// v221: Danmaku Bottom Max Count249
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

// v221: Subtitle Bg Border256
internal fun PlayerActivity.showV221SubtitleBgBorder256Toggle() {
    val current = BiliClient.prefs.v221subtitleBgBorder256
    BiliClient.prefs.v221subtitleBgBorder256 = !current
    AppToast.show(this, "Subtitle Bg Border256: ${if (!current) "ON" else "OFF"}")
}

// v221: Gesture Shake Action221
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

// v221: Cast Audio Volume221
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

// v221: Playlist Auto Skip Outro221
internal fun PlayerActivity.showV221PlaylistAutoSkipOutro221Toggle() {
    val current = BiliClient.prefs.v221playlistAutoSkipOutro221
    BiliClient.prefs.v221playlistAutoSkipOutro221 = !current
    AppToast.show(this, "Playlist Auto Skip Outro221: ${if (!current) "ON" else "OFF"}")
}

// v221: Cache Download Speed222
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

// v221: Progress Bar Thumb Border221
internal fun PlayerActivity.showV221ProgressBarThumbBorder221Toggle() {
    val current = BiliClient.prefs.v221progressBarThumbBorder221
    BiliClient.prefs.v221progressBarThumbBorder221 = !current
    AppToast.show(this, "Progress Bar Thumb Border221: ${if (!current) "ON" else "OFF"}")
}

// v221: Volume Boost Peak221
internal fun PlayerActivity.showV221VolumeBoostPeak221Toggle() {
    val current = BiliClient.prefs.v221volumeBoostPeak221
    BiliClient.prefs.v221volumeBoostPeak221 = !current
    AppToast.show(this, "Volume Boost Peak221: ${if (!current) "ON" else "OFF"}")
}

// v221: History Bookmark Export221
internal fun PlayerActivity.showV221HistoryBookmarkExport221Toggle() {
    val current = BiliClient.prefs.v221historyBookmarkExport221
    BiliClient.prefs.v221historyBookmarkExport221 = !current
    AppToast.show(this, "History Bookmark Export221: ${if (!current) "ON" else "OFF"}")
}

// v221: Playback Chapter Sync221
internal fun PlayerActivity.showV221PlaybackChapterSync221Toggle() {
    val current = BiliClient.prefs.v221playbackChapterSync221
    BiliClient.prefs.v221playbackChapterSync221 = !current
    AppToast.show(this, "Playback Chapter Sync221: ${if (!current) "ON" else "OFF"}")
}

// v221: Screenshot Save Path221
internal fun PlayerActivity.showV221ScreenshotSavePath221Toggle() {
    val current = BiliClient.prefs.v221screenshotSavePath221
    BiliClient.prefs.v221screenshotSavePath221 = !current
    AppToast.show(this, "Screenshot Save Path221: ${if (!current) "ON" else "OFF"}")
}

// v221: Video Color Space221
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

// v221: Danmaku Bottom Max Count250
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

// v221: Subtitle Bg Border257
internal fun PlayerActivity.showV221SubtitleBgBorder257Toggle() {
    val current = BiliClient.prefs.v221subtitleBgBorder257
    BiliClient.prefs.v221subtitleBgBorder257 = !current
    AppToast.show(this, "Subtitle Bg Border257: ${if (!current) "ON" else "OFF"}")
}

// v222: Audio EQ Custom222
internal fun PlayerActivity.showV222AudioEQCustom222Toggle() {
    val current = BiliClient.prefs.v222audioEQCustom222
    BiliClient.prefs.v222audioEQCustom222 = !current
    AppToast.show(this, "Audio EQ Custom222: ${if (!current) "ON" else "OFF"}")
}

// v222: Danmaku Bottom Max Count251
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

// v222: Subtitle Bg Border258
internal fun PlayerActivity.showV222SubtitleBgBorder258Toggle() {
    val current = BiliClient.prefs.v222subtitleBgBorder258
    BiliClient.prefs.v222subtitleBgBorder258 = !current
    AppToast.show(this, "Subtitle Bg Border258: ${if (!current) "ON" else "OFF"}")
}

// v222: Gesture Shake Action222
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

// v222: Cast Audio Volume222
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

// v222: Playlist Auto Skip Outro222
internal fun PlayerActivity.showV222PlaylistAutoSkipOutro222Toggle() {
    val current = BiliClient.prefs.v222playlistAutoSkipOutro222
    BiliClient.prefs.v222playlistAutoSkipOutro222 = !current
    AppToast.show(this, "Playlist Auto Skip Outro222: ${if (!current) "ON" else "OFF"}")
}

// v222: Cache Download Speed223
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

// v222: Progress Bar Thumb Border222
internal fun PlayerActivity.showV222ProgressBarThumbBorder222Toggle() {
    val current = BiliClient.prefs.v222progressBarThumbBorder222
    BiliClient.prefs.v222progressBarThumbBorder222 = !current
    AppToast.show(this, "Progress Bar Thumb Border222: ${if (!current) "ON" else "OFF"}")
}

// v222: Volume Boost Peak222
internal fun PlayerActivity.showV222VolumeBoostPeak222Toggle() {
    val current = BiliClient.prefs.v222volumeBoostPeak222
    BiliClient.prefs.v222volumeBoostPeak222 = !current
    AppToast.show(this, "Volume Boost Peak222: ${if (!current) "ON" else "OFF"}")
}

// v222: History Bookmark Export222
internal fun PlayerActivity.showV222HistoryBookmarkExport222Toggle() {
    val current = BiliClient.prefs.v222historyBookmarkExport222
    BiliClient.prefs.v222historyBookmarkExport222 = !current
    AppToast.show(this, "History Bookmark Export222: ${if (!current) "ON" else "OFF"}")
}

// v222: Playback Chapter Sync222
internal fun PlayerActivity.showV222PlaybackChapterSync222Toggle() {
    val current = BiliClient.prefs.v222playbackChapterSync222
    BiliClient.prefs.v222playbackChapterSync222 = !current
    AppToast.show(this, "Playback Chapter Sync222: ${if (!current) "ON" else "OFF"}")
}

// v222: Screenshot Save Path222
internal fun PlayerActivity.showV222ScreenshotSavePath222Toggle() {
    val current = BiliClient.prefs.v222screenshotSavePath222
    BiliClient.prefs.v222screenshotSavePath222 = !current
    AppToast.show(this, "Screenshot Save Path222: ${if (!current) "ON" else "OFF"}")
}

// v222: Video Color Space222
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

// v222: Danmaku Bottom Max Count252
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

// v222: Subtitle Bg Border259
internal fun PlayerActivity.showV222SubtitleBgBorder259Toggle() {
    val current = BiliClient.prefs.v222subtitleBgBorder259
    BiliClient.prefs.v222subtitleBgBorder259 = !current
    AppToast.show(this, "Subtitle Bg Border259: ${if (!current) "ON" else "OFF"}")
}

// v223: Audio EQ Custom223
internal fun PlayerActivity.showV223AudioEQCustom223Toggle() {
    val current = BiliClient.prefs.v223audioEQCustom223
    BiliClient.prefs.v223audioEQCustom223 = !current
    AppToast.show(this, "Audio EQ Custom223: ${if (!current) "ON" else "OFF"}")
}

// v223: Danmaku Bottom Max Count253
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

// v223: Subtitle Bg Border260
internal fun PlayerActivity.showV223SubtitleBgBorder260Toggle() {
    val current = BiliClient.prefs.v223subtitleBgBorder260
    BiliClient.prefs.v223subtitleBgBorder260 = !current
    AppToast.show(this, "Subtitle Bg Border260: ${if (!current) "ON" else "OFF"}")
}

