package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

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

// v1681: police mode
internal fun PlayerActivity.showV1681PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1681police
    FeaturePrefsStore.batch1681.v1681police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1681: pond mode
internal fun PlayerActivity.showV1681PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1681pond
    FeaturePrefsStore.batch1681.v1681pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1681: pony mode
internal fun PlayerActivity.showV1681PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1681pony
    FeaturePrefsStore.batch1681.v1681pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1681: popular mode
internal fun PlayerActivity.showV1681PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1681popular
    FeaturePrefsStore.batch1681.v1681popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1681: portion mode
internal fun PlayerActivity.showV1681PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1681portion
    FeaturePrefsStore.batch1681.v1681portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1681: pose level
internal fun PlayerActivity.showV1681PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1681pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1681pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1681: possible level
internal fun PlayerActivity.showV1681PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1681possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1681possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1681: potato level
internal fun PlayerActivity.showV1681PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1681potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1681potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1681: pottery level
internal fun PlayerActivity.showV1681PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1681pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1681pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1681: poverty level
internal fun PlayerActivity.showV1681PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1681poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1681poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1681: powder mode
internal fun PlayerActivity.showV1681PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1681powder
    FeaturePrefsStore.batch1681.v1681powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1681: practice mode
internal fun PlayerActivity.showV1681PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1681practice
    FeaturePrefsStore.batch1681.v1681practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1681: praise mode
internal fun PlayerActivity.showV1681PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1681praise
    FeaturePrefsStore.batch1681.v1681praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1681: prefer mode
internal fun PlayerActivity.showV1681PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1681prefer
    FeaturePrefsStore.batch1681.v1681prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1681: pretty mode
internal fun PlayerActivity.showV1681PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1681pretty
    FeaturePrefsStore.batch1681.v1681pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1682: police mode
internal fun PlayerActivity.showV1682PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1682police
    FeaturePrefsStore.batch1681.v1682police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1682: pond mode
internal fun PlayerActivity.showV1682PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1682pond
    FeaturePrefsStore.batch1681.v1682pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1682: pony mode
internal fun PlayerActivity.showV1682PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1682pony
    FeaturePrefsStore.batch1681.v1682pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1682: popular mode
internal fun PlayerActivity.showV1682PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1682popular
    FeaturePrefsStore.batch1681.v1682popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1682: portion mode
internal fun PlayerActivity.showV1682PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1682portion
    FeaturePrefsStore.batch1681.v1682portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1682: pose level
internal fun PlayerActivity.showV1682PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1682pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1682pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1682: possible level
internal fun PlayerActivity.showV1682PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1682possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1682possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1682: potato level
internal fun PlayerActivity.showV1682PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1682potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1682potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1682: pottery level
internal fun PlayerActivity.showV1682PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1682pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1682pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1682: poverty level
internal fun PlayerActivity.showV1682PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1682poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1682poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1682: powder mode
internal fun PlayerActivity.showV1682PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1682powder
    FeaturePrefsStore.batch1681.v1682powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1682: practice mode
internal fun PlayerActivity.showV1682PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1682practice
    FeaturePrefsStore.batch1681.v1682practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1682: praise mode
internal fun PlayerActivity.showV1682PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1682praise
    FeaturePrefsStore.batch1681.v1682praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1682: prefer mode
internal fun PlayerActivity.showV1682PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1682prefer
    FeaturePrefsStore.batch1681.v1682prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1682: pretty mode
internal fun PlayerActivity.showV1682PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1682pretty
    FeaturePrefsStore.batch1681.v1682pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1683: police mode
internal fun PlayerActivity.showV1683PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1683police
    FeaturePrefsStore.batch1681.v1683police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1683: pond mode
internal fun PlayerActivity.showV1683PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1683pond
    FeaturePrefsStore.batch1681.v1683pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1683: pony mode
internal fun PlayerActivity.showV1683PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1683pony
    FeaturePrefsStore.batch1681.v1683pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1683: popular mode
internal fun PlayerActivity.showV1683PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1683popular
    FeaturePrefsStore.batch1681.v1683popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1683: portion mode
internal fun PlayerActivity.showV1683PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1683portion
    FeaturePrefsStore.batch1681.v1683portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1683: pose level
internal fun PlayerActivity.showV1683PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1683pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1683pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1683: possible level
internal fun PlayerActivity.showV1683PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1683possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1683possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1683: potato level
internal fun PlayerActivity.showV1683PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1683potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1683potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1683: pottery level
internal fun PlayerActivity.showV1683PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1683pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1683pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1683: poverty level
internal fun PlayerActivity.showV1683PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1683poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1683poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1683: powder mode
internal fun PlayerActivity.showV1683PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1683powder
    FeaturePrefsStore.batch1681.v1683powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1683: practice mode
internal fun PlayerActivity.showV1683PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1683practice
    FeaturePrefsStore.batch1681.v1683practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1683: praise mode
internal fun PlayerActivity.showV1683PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1683praise
    FeaturePrefsStore.batch1681.v1683praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1683: prefer mode
internal fun PlayerActivity.showV1683PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1683prefer
    FeaturePrefsStore.batch1681.v1683prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1683: pretty mode
internal fun PlayerActivity.showV1683PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1683pretty
    FeaturePrefsStore.batch1681.v1683pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1684: police mode
internal fun PlayerActivity.showV1684PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1684police
    FeaturePrefsStore.batch1681.v1684police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1684: pond mode
internal fun PlayerActivity.showV1684PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1684pond
    FeaturePrefsStore.batch1681.v1684pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1684: pony mode
internal fun PlayerActivity.showV1684PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1684pony
    FeaturePrefsStore.batch1681.v1684pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1684: popular mode
internal fun PlayerActivity.showV1684PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1684popular
    FeaturePrefsStore.batch1681.v1684popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1684: portion mode
internal fun PlayerActivity.showV1684PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1684portion
    FeaturePrefsStore.batch1681.v1684portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1684: pose level
internal fun PlayerActivity.showV1684PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1684pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1684pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1684: possible level
internal fun PlayerActivity.showV1684PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1684possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1684possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1684: potato level
internal fun PlayerActivity.showV1684PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1684potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1684potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1684: pottery level
internal fun PlayerActivity.showV1684PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1684pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1684pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1684: poverty level
internal fun PlayerActivity.showV1684PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1684poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1684poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1684: powder mode
internal fun PlayerActivity.showV1684PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1684powder
    FeaturePrefsStore.batch1681.v1684powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1684: practice mode
internal fun PlayerActivity.showV1684PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1684practice
    FeaturePrefsStore.batch1681.v1684practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1684: praise mode
internal fun PlayerActivity.showV1684PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1684praise
    FeaturePrefsStore.batch1681.v1684praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1684: prefer mode
internal fun PlayerActivity.showV1684PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1684prefer
    FeaturePrefsStore.batch1681.v1684prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1684: pretty mode
internal fun PlayerActivity.showV1684PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1684pretty
    FeaturePrefsStore.batch1681.v1684pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1685: police mode
internal fun PlayerActivity.showV1685PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1685police
    FeaturePrefsStore.batch1681.v1685police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1685: pond mode
internal fun PlayerActivity.showV1685PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1685pond
    FeaturePrefsStore.batch1681.v1685pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1685: pony mode
internal fun PlayerActivity.showV1685PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1685pony
    FeaturePrefsStore.batch1681.v1685pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1685: popular mode
internal fun PlayerActivity.showV1685PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1685popular
    FeaturePrefsStore.batch1681.v1685popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1685: portion mode
internal fun PlayerActivity.showV1685PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1685portion
    FeaturePrefsStore.batch1681.v1685portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1685: pose level
internal fun PlayerActivity.showV1685PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1685pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1685pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1685: possible level
internal fun PlayerActivity.showV1685PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1685possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1685possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1685: potato level
internal fun PlayerActivity.showV1685PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1685potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1685potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1685: pottery level
internal fun PlayerActivity.showV1685PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1685pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1685pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1685: poverty level
internal fun PlayerActivity.showV1685PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1685poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1685poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1685: powder mode
internal fun PlayerActivity.showV1685PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1685powder
    FeaturePrefsStore.batch1681.v1685powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1685: practice mode
internal fun PlayerActivity.showV1685PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1685practice
    FeaturePrefsStore.batch1681.v1685practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1685: praise mode
internal fun PlayerActivity.showV1685PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1685praise
    FeaturePrefsStore.batch1681.v1685praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1685: prefer mode
internal fun PlayerActivity.showV1685PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1685prefer
    FeaturePrefsStore.batch1681.v1685prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1685: pretty mode
internal fun PlayerActivity.showV1685PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1685pretty
    FeaturePrefsStore.batch1681.v1685pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1686: police mode
internal fun PlayerActivity.showV1686PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1686police
    FeaturePrefsStore.batch1681.v1686police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1686: pond mode
internal fun PlayerActivity.showV1686PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1686pond
    FeaturePrefsStore.batch1681.v1686pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1686: pony mode
internal fun PlayerActivity.showV1686PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1686pony
    FeaturePrefsStore.batch1681.v1686pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1686: popular mode
internal fun PlayerActivity.showV1686PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1686popular
    FeaturePrefsStore.batch1681.v1686popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1686: portion mode
internal fun PlayerActivity.showV1686PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1686portion
    FeaturePrefsStore.batch1681.v1686portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1686: pose level
internal fun PlayerActivity.showV1686PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1686pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1686pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1686: possible level
internal fun PlayerActivity.showV1686PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1686possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1686possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1686: potato level
internal fun PlayerActivity.showV1686PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1686potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1686potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1686: pottery level
internal fun PlayerActivity.showV1686PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1686pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1686pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1686: poverty level
internal fun PlayerActivity.showV1686PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1686poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1686poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1686: powder mode
internal fun PlayerActivity.showV1686PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1686powder
    FeaturePrefsStore.batch1681.v1686powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1686: practice mode
internal fun PlayerActivity.showV1686PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1686practice
    FeaturePrefsStore.batch1681.v1686practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1686: praise mode
internal fun PlayerActivity.showV1686PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1686praise
    FeaturePrefsStore.batch1681.v1686praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1686: prefer mode
internal fun PlayerActivity.showV1686PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1686prefer
    FeaturePrefsStore.batch1681.v1686prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1686: pretty mode
internal fun PlayerActivity.showV1686PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1686pretty
    FeaturePrefsStore.batch1681.v1686pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1687: police mode
internal fun PlayerActivity.showV1687PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1687police
    FeaturePrefsStore.batch1681.v1687police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1687: pond mode
internal fun PlayerActivity.showV1687PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1687pond
    FeaturePrefsStore.batch1681.v1687pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1687: pony mode
internal fun PlayerActivity.showV1687PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1687pony
    FeaturePrefsStore.batch1681.v1687pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1687: popular mode
internal fun PlayerActivity.showV1687PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1687popular
    FeaturePrefsStore.batch1681.v1687popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1687: portion mode
internal fun PlayerActivity.showV1687PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1687portion
    FeaturePrefsStore.batch1681.v1687portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1687: pose level
internal fun PlayerActivity.showV1687PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1687pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1687pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1687: possible level
internal fun PlayerActivity.showV1687PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1687possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1687possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1687: potato level
internal fun PlayerActivity.showV1687PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1687potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1687potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1687: pottery level
internal fun PlayerActivity.showV1687PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1687pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1687pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1687: poverty level
internal fun PlayerActivity.showV1687PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1687poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1687poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1687: powder mode
internal fun PlayerActivity.showV1687PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1687powder
    FeaturePrefsStore.batch1681.v1687powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1687: practice mode
internal fun PlayerActivity.showV1687PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1687practice
    FeaturePrefsStore.batch1681.v1687practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1687: praise mode
internal fun PlayerActivity.showV1687PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1687praise
    FeaturePrefsStore.batch1681.v1687praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1687: prefer mode
internal fun PlayerActivity.showV1687PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1687prefer
    FeaturePrefsStore.batch1681.v1687prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1687: pretty mode
internal fun PlayerActivity.showV1687PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1687pretty
    FeaturePrefsStore.batch1681.v1687pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1688: police mode
internal fun PlayerActivity.showV1688PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1688police
    FeaturePrefsStore.batch1681.v1688police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1688: pond mode
internal fun PlayerActivity.showV1688PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1688pond
    FeaturePrefsStore.batch1681.v1688pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1688: pony mode
internal fun PlayerActivity.showV1688PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1688pony
    FeaturePrefsStore.batch1681.v1688pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1688: popular mode
internal fun PlayerActivity.showV1688PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1688popular
    FeaturePrefsStore.batch1681.v1688popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1688: portion mode
internal fun PlayerActivity.showV1688PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1688portion
    FeaturePrefsStore.batch1681.v1688portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1688: pose level
internal fun PlayerActivity.showV1688PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1688pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1688pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1688: possible level
internal fun PlayerActivity.showV1688PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1688possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1688possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1688: potato level
internal fun PlayerActivity.showV1688PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1688potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1688potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1688: pottery level
internal fun PlayerActivity.showV1688PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1688pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1688pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1688: poverty level
internal fun PlayerActivity.showV1688PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1688poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1688poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1688: powder mode
internal fun PlayerActivity.showV1688PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1688powder
    FeaturePrefsStore.batch1681.v1688powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1688: practice mode
internal fun PlayerActivity.showV1688PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1688practice
    FeaturePrefsStore.batch1681.v1688practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1688: praise mode
internal fun PlayerActivity.showV1688PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1688praise
    FeaturePrefsStore.batch1681.v1688praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1688: prefer mode
internal fun PlayerActivity.showV1688PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1688prefer
    FeaturePrefsStore.batch1681.v1688prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1688: pretty mode
internal fun PlayerActivity.showV1688PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1688pretty
    FeaturePrefsStore.batch1681.v1688pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1689: police mode
internal fun PlayerActivity.showV1689PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1689police
    FeaturePrefsStore.batch1681.v1689police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1689: pond mode
internal fun PlayerActivity.showV1689PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1689pond
    FeaturePrefsStore.batch1681.v1689pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1689: pony mode
internal fun PlayerActivity.showV1689PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1689pony
    FeaturePrefsStore.batch1681.v1689pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1689: popular mode
internal fun PlayerActivity.showV1689PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1689popular
    FeaturePrefsStore.batch1681.v1689popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1689: portion mode
internal fun PlayerActivity.showV1689PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1689portion
    FeaturePrefsStore.batch1681.v1689portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1689: pose level
internal fun PlayerActivity.showV1689PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1689pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1689pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1689: possible level
internal fun PlayerActivity.showV1689PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1689possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1689possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1689: potato level
internal fun PlayerActivity.showV1689PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1689potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1689potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1689: pottery level
internal fun PlayerActivity.showV1689PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1689pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1689pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1689: poverty level
internal fun PlayerActivity.showV1689PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1689poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1689poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1689: powder mode
internal fun PlayerActivity.showV1689PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1689powder
    FeaturePrefsStore.batch1681.v1689powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1689: practice mode
internal fun PlayerActivity.showV1689PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1689practice
    FeaturePrefsStore.batch1681.v1689practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1689: praise mode
internal fun PlayerActivity.showV1689PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1689praise
    FeaturePrefsStore.batch1681.v1689praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1689: prefer mode
internal fun PlayerActivity.showV1689PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1689prefer
    FeaturePrefsStore.batch1681.v1689prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1689: pretty mode
internal fun PlayerActivity.showV1689PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1689pretty
    FeaturePrefsStore.batch1681.v1689pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1690: police mode
internal fun PlayerActivity.showV1690PoliceToggle() {
    val current = FeaturePrefsStore.batch1681.v1690police
    FeaturePrefsStore.batch1681.v1690police = !current
    AppToast.show(this, "police: ${if (!current) "ON" else "OFF"}")
}

// v1690: pond mode
internal fun PlayerActivity.showV1690PondToggle() {
    val current = FeaturePrefsStore.batch1681.v1690pond
    FeaturePrefsStore.batch1681.v1690pond = !current
    AppToast.show(this, "pond: ${if (!current) "ON" else "OFF"}")
}

// v1690: pony mode
internal fun PlayerActivity.showV1690PonyToggle() {
    val current = FeaturePrefsStore.batch1681.v1690pony
    FeaturePrefsStore.batch1681.v1690pony = !current
    AppToast.show(this, "pony: ${if (!current) "ON" else "OFF"}")
}

// v1690: popular mode
internal fun PlayerActivity.showV1690PopularToggle() {
    val current = FeaturePrefsStore.batch1681.v1690popular
    FeaturePrefsStore.batch1681.v1690popular = !current
    AppToast.show(this, "popular: ${if (!current) "ON" else "OFF"}")
}

// v1690: portion mode
internal fun PlayerActivity.showV1690PortionToggle() {
    val current = FeaturePrefsStore.batch1681.v1690portion
    FeaturePrefsStore.batch1681.v1690portion = !current
    AppToast.show(this, "portion: ${if (!current) "ON" else "OFF"}")
}

// v1690: pose level
internal fun PlayerActivity.showV1690PoseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1690pose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1690pose = value
        AppToast.show(this, "pose: $value")
    }
}

// v1690: possible level
internal fun PlayerActivity.showV1690PossibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1690possible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "possible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1690possible = value
        AppToast.show(this, "possible: $value")
    }
}

// v1690: potato level
internal fun PlayerActivity.showV1690PotatoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1690potato).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "potato level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1690potato = value
        AppToast.show(this, "potato: $value")
    }
}

// v1690: pottery level
internal fun PlayerActivity.showV1690PotteryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1690pottery).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pottery level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1690pottery = value
        AppToast.show(this, "pottery: $value")
    }
}

// v1690: poverty level
internal fun PlayerActivity.showV1690PovertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1681.v1690poverty).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poverty level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1681.v1690poverty = value
        AppToast.show(this, "poverty: $value")
    }
}

// v1690: powder mode
internal fun PlayerActivity.showV1690PowderToggle() {
    val current = FeaturePrefsStore.batch1681.v1690powder
    FeaturePrefsStore.batch1681.v1690powder = !current
    AppToast.show(this, "powder: ${if (!current) "ON" else "OFF"}")
}

// v1690: practice mode
internal fun PlayerActivity.showV1690PracticeToggle() {
    val current = FeaturePrefsStore.batch1681.v1690practice
    FeaturePrefsStore.batch1681.v1690practice = !current
    AppToast.show(this, "practice: ${if (!current) "ON" else "OFF"}")
}

// v1690: praise mode
internal fun PlayerActivity.showV1690PraiseToggle() {
    val current = FeaturePrefsStore.batch1681.v1690praise
    FeaturePrefsStore.batch1681.v1690praise = !current
    AppToast.show(this, "praise: ${if (!current) "ON" else "OFF"}")
}

// v1690: prefer mode
internal fun PlayerActivity.showV1690PreferToggle() {
    val current = FeaturePrefsStore.batch1681.v1690prefer
    FeaturePrefsStore.batch1681.v1690prefer = !current
    AppToast.show(this, "prefer: ${if (!current) "ON" else "OFF"}")
}

// v1690: pretty mode
internal fun PlayerActivity.showV1690PrettyToggle() {
    val current = FeaturePrefsStore.batch1681.v1690pretty
    FeaturePrefsStore.batch1681.v1690pretty = !current
    AppToast.show(this, "pretty: ${if (!current) "ON" else "OFF"}")
}

// v1691: price mode
internal fun PlayerActivity.showV1691PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1691price
    FeaturePrefsStore.batch1691.v1691price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1691: pride mode
internal fun PlayerActivity.showV1691PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1691pride
    FeaturePrefsStore.batch1691.v1691pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1691: prison mode
internal fun PlayerActivity.showV1691PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1691prison
    FeaturePrefsStore.batch1691.v1691prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1691: private mode
internal fun PlayerActivity.showV1691PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1691private
    FeaturePrefsStore.batch1691.v1691private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1691: prize mode
internal fun PlayerActivity.showV1691PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1691prize
    FeaturePrefsStore.batch1691.v1691prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1691: problem level
internal fun PlayerActivity.showV1691ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1691problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1691problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1691: profit level
internal fun PlayerActivity.showV1691ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1691profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1691profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1691: promote level
internal fun PlayerActivity.showV1691PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1691promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1691promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1691: proof level
internal fun PlayerActivity.showV1691ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1691proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1691proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1691: prosper level
internal fun PlayerActivity.showV1691ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1691prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1691prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1691: proud mode
internal fun PlayerActivity.showV1691ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1691proud
    FeaturePrefsStore.batch1691.v1691proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1691: public mode
internal fun PlayerActivity.showV1691PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1691public
    FeaturePrefsStore.batch1691.v1691public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1691: pudding mode
internal fun PlayerActivity.showV1691PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1691pudding
    FeaturePrefsStore.batch1691.v1691pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1691: pulp mode
internal fun PlayerActivity.showV1691PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1691pulp
    FeaturePrefsStore.batch1691.v1691pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1691: pulse mode
internal fun PlayerActivity.showV1691PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1691pulse
    FeaturePrefsStore.batch1691.v1691pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1692: price mode
internal fun PlayerActivity.showV1692PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1692price
    FeaturePrefsStore.batch1691.v1692price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1692: pride mode
internal fun PlayerActivity.showV1692PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1692pride
    FeaturePrefsStore.batch1691.v1692pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1692: prison mode
internal fun PlayerActivity.showV1692PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1692prison
    FeaturePrefsStore.batch1691.v1692prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1692: private mode
internal fun PlayerActivity.showV1692PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1692private
    FeaturePrefsStore.batch1691.v1692private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1692: prize mode
internal fun PlayerActivity.showV1692PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1692prize
    FeaturePrefsStore.batch1691.v1692prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1692: problem level
internal fun PlayerActivity.showV1692ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1692problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1692problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1692: profit level
internal fun PlayerActivity.showV1692ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1692profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1692profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1692: promote level
internal fun PlayerActivity.showV1692PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1692promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1692promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1692: proof level
internal fun PlayerActivity.showV1692ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1692proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1692proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1692: prosper level
internal fun PlayerActivity.showV1692ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1692prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1692prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1692: proud mode
internal fun PlayerActivity.showV1692ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1692proud
    FeaturePrefsStore.batch1691.v1692proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1692: public mode
internal fun PlayerActivity.showV1692PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1692public
    FeaturePrefsStore.batch1691.v1692public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1692: pudding mode
internal fun PlayerActivity.showV1692PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1692pudding
    FeaturePrefsStore.batch1691.v1692pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1692: pulp mode
internal fun PlayerActivity.showV1692PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1692pulp
    FeaturePrefsStore.batch1691.v1692pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1692: pulse mode
internal fun PlayerActivity.showV1692PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1692pulse
    FeaturePrefsStore.batch1691.v1692pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1693: price mode
internal fun PlayerActivity.showV1693PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1693price
    FeaturePrefsStore.batch1691.v1693price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1693: pride mode
internal fun PlayerActivity.showV1693PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1693pride
    FeaturePrefsStore.batch1691.v1693pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1693: prison mode
internal fun PlayerActivity.showV1693PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1693prison
    FeaturePrefsStore.batch1691.v1693prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1693: private mode
internal fun PlayerActivity.showV1693PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1693private
    FeaturePrefsStore.batch1691.v1693private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1693: prize mode
internal fun PlayerActivity.showV1693PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1693prize
    FeaturePrefsStore.batch1691.v1693prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1693: problem level
internal fun PlayerActivity.showV1693ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1693problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1693problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1693: profit level
internal fun PlayerActivity.showV1693ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1693profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1693profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1693: promote level
internal fun PlayerActivity.showV1693PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1693promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1693promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1693: proof level
internal fun PlayerActivity.showV1693ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1693proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1693proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1693: prosper level
internal fun PlayerActivity.showV1693ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1693prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1693prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1693: proud mode
internal fun PlayerActivity.showV1693ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1693proud
    FeaturePrefsStore.batch1691.v1693proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1693: public mode
internal fun PlayerActivity.showV1693PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1693public
    FeaturePrefsStore.batch1691.v1693public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1693: pudding mode
internal fun PlayerActivity.showV1693PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1693pudding
    FeaturePrefsStore.batch1691.v1693pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1693: pulp mode
internal fun PlayerActivity.showV1693PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1693pulp
    FeaturePrefsStore.batch1691.v1693pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1693: pulse mode
internal fun PlayerActivity.showV1693PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1693pulse
    FeaturePrefsStore.batch1691.v1693pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1694: price mode
internal fun PlayerActivity.showV1694PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1694price
    FeaturePrefsStore.batch1691.v1694price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1694: pride mode
internal fun PlayerActivity.showV1694PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1694pride
    FeaturePrefsStore.batch1691.v1694pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1694: prison mode
internal fun PlayerActivity.showV1694PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1694prison
    FeaturePrefsStore.batch1691.v1694prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1694: private mode
internal fun PlayerActivity.showV1694PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1694private
    FeaturePrefsStore.batch1691.v1694private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1694: prize mode
internal fun PlayerActivity.showV1694PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1694prize
    FeaturePrefsStore.batch1691.v1694prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1694: problem level
internal fun PlayerActivity.showV1694ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1694problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1694problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1694: profit level
internal fun PlayerActivity.showV1694ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1694profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1694profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1694: promote level
internal fun PlayerActivity.showV1694PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1694promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1694promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1694: proof level
internal fun PlayerActivity.showV1694ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1694proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1694proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1694: prosper level
internal fun PlayerActivity.showV1694ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1694prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1694prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1694: proud mode
internal fun PlayerActivity.showV1694ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1694proud
    FeaturePrefsStore.batch1691.v1694proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1694: public mode
internal fun PlayerActivity.showV1694PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1694public
    FeaturePrefsStore.batch1691.v1694public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1694: pudding mode
internal fun PlayerActivity.showV1694PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1694pudding
    FeaturePrefsStore.batch1691.v1694pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1694: pulp mode
internal fun PlayerActivity.showV1694PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1694pulp
    FeaturePrefsStore.batch1691.v1694pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1694: pulse mode
internal fun PlayerActivity.showV1694PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1694pulse
    FeaturePrefsStore.batch1691.v1694pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1695: price mode
internal fun PlayerActivity.showV1695PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1695price
    FeaturePrefsStore.batch1691.v1695price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1695: pride mode
internal fun PlayerActivity.showV1695PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1695pride
    FeaturePrefsStore.batch1691.v1695pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1695: prison mode
internal fun PlayerActivity.showV1695PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1695prison
    FeaturePrefsStore.batch1691.v1695prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1695: private mode
internal fun PlayerActivity.showV1695PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1695private
    FeaturePrefsStore.batch1691.v1695private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1695: prize mode
internal fun PlayerActivity.showV1695PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1695prize
    FeaturePrefsStore.batch1691.v1695prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1695: problem level
internal fun PlayerActivity.showV1695ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1695problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1695problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1695: profit level
internal fun PlayerActivity.showV1695ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1695profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1695profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1695: promote level
internal fun PlayerActivity.showV1695PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1695promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1695promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1695: proof level
internal fun PlayerActivity.showV1695ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1695proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1695proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1695: prosper level
internal fun PlayerActivity.showV1695ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1695prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1695prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1695: proud mode
internal fun PlayerActivity.showV1695ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1695proud
    FeaturePrefsStore.batch1691.v1695proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1695: public mode
internal fun PlayerActivity.showV1695PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1695public
    FeaturePrefsStore.batch1691.v1695public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1695: pudding mode
internal fun PlayerActivity.showV1695PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1695pudding
    FeaturePrefsStore.batch1691.v1695pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1695: pulp mode
internal fun PlayerActivity.showV1695PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1695pulp
    FeaturePrefsStore.batch1691.v1695pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1695: pulse mode
internal fun PlayerActivity.showV1695PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1695pulse
    FeaturePrefsStore.batch1691.v1695pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1696: price mode
internal fun PlayerActivity.showV1696PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1696price
    FeaturePrefsStore.batch1691.v1696price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1696: pride mode
internal fun PlayerActivity.showV1696PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1696pride
    FeaturePrefsStore.batch1691.v1696pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1696: prison mode
internal fun PlayerActivity.showV1696PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1696prison
    FeaturePrefsStore.batch1691.v1696prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1696: private mode
internal fun PlayerActivity.showV1696PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1696private
    FeaturePrefsStore.batch1691.v1696private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1696: prize mode
internal fun PlayerActivity.showV1696PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1696prize
    FeaturePrefsStore.batch1691.v1696prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1696: problem level
internal fun PlayerActivity.showV1696ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1696problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1696problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1696: profit level
internal fun PlayerActivity.showV1696ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1696profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1696profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1696: promote level
internal fun PlayerActivity.showV1696PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1696promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1696promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1696: proof level
internal fun PlayerActivity.showV1696ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1696proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1696proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1696: prosper level
internal fun PlayerActivity.showV1696ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1696prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1696prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1696: proud mode
internal fun PlayerActivity.showV1696ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1696proud
    FeaturePrefsStore.batch1691.v1696proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1696: public mode
internal fun PlayerActivity.showV1696PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1696public
    FeaturePrefsStore.batch1691.v1696public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1696: pudding mode
internal fun PlayerActivity.showV1696PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1696pudding
    FeaturePrefsStore.batch1691.v1696pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1696: pulp mode
internal fun PlayerActivity.showV1696PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1696pulp
    FeaturePrefsStore.batch1691.v1696pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1696: pulse mode
internal fun PlayerActivity.showV1696PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1696pulse
    FeaturePrefsStore.batch1691.v1696pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1697: price mode
internal fun PlayerActivity.showV1697PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1697price
    FeaturePrefsStore.batch1691.v1697price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1697: pride mode
internal fun PlayerActivity.showV1697PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1697pride
    FeaturePrefsStore.batch1691.v1697pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1697: prison mode
internal fun PlayerActivity.showV1697PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1697prison
    FeaturePrefsStore.batch1691.v1697prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1697: private mode
internal fun PlayerActivity.showV1697PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1697private
    FeaturePrefsStore.batch1691.v1697private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1697: prize mode
internal fun PlayerActivity.showV1697PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1697prize
    FeaturePrefsStore.batch1691.v1697prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1697: problem level
internal fun PlayerActivity.showV1697ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1697problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1697problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1697: profit level
internal fun PlayerActivity.showV1697ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1697profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1697profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1697: promote level
internal fun PlayerActivity.showV1697PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1697promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1697promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1697: proof level
internal fun PlayerActivity.showV1697ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1697proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1697proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1697: prosper level
internal fun PlayerActivity.showV1697ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1697prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1697prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1697: proud mode
internal fun PlayerActivity.showV1697ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1697proud
    FeaturePrefsStore.batch1691.v1697proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1697: public mode
internal fun PlayerActivity.showV1697PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1697public
    FeaturePrefsStore.batch1691.v1697public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1697: pudding mode
internal fun PlayerActivity.showV1697PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1697pudding
    FeaturePrefsStore.batch1691.v1697pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1697: pulp mode
internal fun PlayerActivity.showV1697PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1697pulp
    FeaturePrefsStore.batch1691.v1697pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1697: pulse mode
internal fun PlayerActivity.showV1697PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1697pulse
    FeaturePrefsStore.batch1691.v1697pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1698: price mode
internal fun PlayerActivity.showV1698PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1698price
    FeaturePrefsStore.batch1691.v1698price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1698: pride mode
internal fun PlayerActivity.showV1698PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1698pride
    FeaturePrefsStore.batch1691.v1698pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1698: prison mode
internal fun PlayerActivity.showV1698PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1698prison
    FeaturePrefsStore.batch1691.v1698prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1698: private mode
internal fun PlayerActivity.showV1698PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1698private
    FeaturePrefsStore.batch1691.v1698private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1698: prize mode
internal fun PlayerActivity.showV1698PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1698prize
    FeaturePrefsStore.batch1691.v1698prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1698: problem level
internal fun PlayerActivity.showV1698ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1698problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1698problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1698: profit level
internal fun PlayerActivity.showV1698ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1698profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1698profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1698: promote level
internal fun PlayerActivity.showV1698PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1698promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1698promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1698: proof level
internal fun PlayerActivity.showV1698ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1698proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1698proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1698: prosper level
internal fun PlayerActivity.showV1698ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1698prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1698prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1698: proud mode
internal fun PlayerActivity.showV1698ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1698proud
    FeaturePrefsStore.batch1691.v1698proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1698: public mode
internal fun PlayerActivity.showV1698PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1698public
    FeaturePrefsStore.batch1691.v1698public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1698: pudding mode
internal fun PlayerActivity.showV1698PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1698pudding
    FeaturePrefsStore.batch1691.v1698pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1698: pulp mode
internal fun PlayerActivity.showV1698PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1698pulp
    FeaturePrefsStore.batch1691.v1698pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1698: pulse mode
internal fun PlayerActivity.showV1698PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1698pulse
    FeaturePrefsStore.batch1691.v1698pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1699: price mode
internal fun PlayerActivity.showV1699PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1699price
    FeaturePrefsStore.batch1691.v1699price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1699: pride mode
internal fun PlayerActivity.showV1699PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1699pride
    FeaturePrefsStore.batch1691.v1699pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1699: prison mode
internal fun PlayerActivity.showV1699PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1699prison
    FeaturePrefsStore.batch1691.v1699prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1699: private mode
internal fun PlayerActivity.showV1699PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1699private
    FeaturePrefsStore.batch1691.v1699private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1699: prize mode
internal fun PlayerActivity.showV1699PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1699prize
    FeaturePrefsStore.batch1691.v1699prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1699: problem level
internal fun PlayerActivity.showV1699ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1699problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1699problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1699: profit level
internal fun PlayerActivity.showV1699ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1699profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1699profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1699: promote level
internal fun PlayerActivity.showV1699PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1699promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1699promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1699: proof level
internal fun PlayerActivity.showV1699ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1699proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1699proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1699: prosper level
internal fun PlayerActivity.showV1699ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1699prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1699prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1699: proud mode
internal fun PlayerActivity.showV1699ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1699proud
    FeaturePrefsStore.batch1691.v1699proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1699: public mode
internal fun PlayerActivity.showV1699PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1699public
    FeaturePrefsStore.batch1691.v1699public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1699: pudding mode
internal fun PlayerActivity.showV1699PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1699pudding
    FeaturePrefsStore.batch1691.v1699pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1699: pulp mode
internal fun PlayerActivity.showV1699PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1699pulp
    FeaturePrefsStore.batch1691.v1699pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1699: pulse mode
internal fun PlayerActivity.showV1699PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1699pulse
    FeaturePrefsStore.batch1691.v1699pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1700: price mode
internal fun PlayerActivity.showV1700PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1700price
    FeaturePrefsStore.batch1691.v1700price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1700: pride mode
internal fun PlayerActivity.showV1700PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1700pride
    FeaturePrefsStore.batch1691.v1700pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1700: prison mode
internal fun PlayerActivity.showV1700PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1700prison
    FeaturePrefsStore.batch1691.v1700prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1700: private mode
internal fun PlayerActivity.showV1700PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1700private
    FeaturePrefsStore.batch1691.v1700private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1700: prize mode
internal fun PlayerActivity.showV1700PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1700prize
    FeaturePrefsStore.batch1691.v1700prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1700: problem level
internal fun PlayerActivity.showV1700ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1700problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1700problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1700: profit level
internal fun PlayerActivity.showV1700ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1700profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1700profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1700: promote level
internal fun PlayerActivity.showV1700PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1700promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1700promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1700: proof level
internal fun PlayerActivity.showV1700ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1700proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1700proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1700: prosper level
internal fun PlayerActivity.showV1700ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1700prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1700prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1700: proud mode
internal fun PlayerActivity.showV1700ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1700proud
    FeaturePrefsStore.batch1691.v1700proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1700: public mode
internal fun PlayerActivity.showV1700PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1700public
    FeaturePrefsStore.batch1691.v1700public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1700: pudding mode
internal fun PlayerActivity.showV1700PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1700pudding
    FeaturePrefsStore.batch1691.v1700pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1700: pulp mode
internal fun PlayerActivity.showV1700PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1700pulp
    FeaturePrefsStore.batch1691.v1700pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1700: pulse mode
internal fun PlayerActivity.showV1700PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1700pulse
    FeaturePrefsStore.batch1691.v1700pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1701: pumpkin mode
internal fun PlayerActivity.showV1701PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1701pumpkin
    FeaturePrefsStore.batch1701.v1701pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1701: punch mode
internal fun PlayerActivity.showV1701PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1701punch
    FeaturePrefsStore.batch1701.v1701punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1701: pupil mode
internal fun PlayerActivity.showV1701PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1701pupil
    FeaturePrefsStore.batch1701.v1701pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1701: puppy mode
internal fun PlayerActivity.showV1701PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1701puppy
    FeaturePrefsStore.batch1701.v1701puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1701: purchase mode
internal fun PlayerActivity.showV1701PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1701purchase
    FeaturePrefsStore.batch1701.v1701purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1701: purity level
internal fun PlayerActivity.showV1701PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1701purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1701purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1701: purpose level
internal fun PlayerActivity.showV1701PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1701purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1701purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1701: purse level
internal fun PlayerActivity.showV1701PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1701purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1701purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1701: put level
internal fun PlayerActivity.showV1701PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1701put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1701put = value
        AppToast.show(this, "put: $value")
    }
}

// v1701: puzzle level
internal fun PlayerActivity.showV1701PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1701puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1701puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1701: quality mode
internal fun PlayerActivity.showV1701QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1701quality
    FeaturePrefsStore.batch1701.v1701quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1701: quantum mode
internal fun PlayerActivity.showV1701QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1701quantum
    FeaturePrefsStore.batch1701.v1701quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1701: quarter mode
internal fun PlayerActivity.showV1701QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1701quarter
    FeaturePrefsStore.batch1701.v1701quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1701: queen mode
internal fun PlayerActivity.showV1701QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1701queen
    FeaturePrefsStore.batch1701.v1701queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1701: quest mode
internal fun PlayerActivity.showV1701QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1701quest
    FeaturePrefsStore.batch1701.v1701quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1702: pumpkin mode
internal fun PlayerActivity.showV1702PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1702pumpkin
    FeaturePrefsStore.batch1701.v1702pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1702: punch mode
internal fun PlayerActivity.showV1702PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1702punch
    FeaturePrefsStore.batch1701.v1702punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1702: pupil mode
internal fun PlayerActivity.showV1702PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1702pupil
    FeaturePrefsStore.batch1701.v1702pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1702: puppy mode
internal fun PlayerActivity.showV1702PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1702puppy
    FeaturePrefsStore.batch1701.v1702puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1702: purchase mode
internal fun PlayerActivity.showV1702PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1702purchase
    FeaturePrefsStore.batch1701.v1702purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1702: purity level
internal fun PlayerActivity.showV1702PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1702purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1702purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1702: purpose level
internal fun PlayerActivity.showV1702PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1702purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1702purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1702: purse level
internal fun PlayerActivity.showV1702PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1702purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1702purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1702: put level
internal fun PlayerActivity.showV1702PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1702put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1702put = value
        AppToast.show(this, "put: $value")
    }
}

// v1702: puzzle level
internal fun PlayerActivity.showV1702PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1702puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1702puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1702: quality mode
internal fun PlayerActivity.showV1702QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1702quality
    FeaturePrefsStore.batch1701.v1702quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1702: quantum mode
internal fun PlayerActivity.showV1702QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1702quantum
    FeaturePrefsStore.batch1701.v1702quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1702: quarter mode
internal fun PlayerActivity.showV1702QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1702quarter
    FeaturePrefsStore.batch1701.v1702quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1702: queen mode
internal fun PlayerActivity.showV1702QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1702queen
    FeaturePrefsStore.batch1701.v1702queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1702: quest mode
internal fun PlayerActivity.showV1702QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1702quest
    FeaturePrefsStore.batch1701.v1702quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1703: pumpkin mode
internal fun PlayerActivity.showV1703PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1703pumpkin
    FeaturePrefsStore.batch1701.v1703pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1703: punch mode
internal fun PlayerActivity.showV1703PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1703punch
    FeaturePrefsStore.batch1701.v1703punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1703: pupil mode
internal fun PlayerActivity.showV1703PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1703pupil
    FeaturePrefsStore.batch1701.v1703pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1703: puppy mode
internal fun PlayerActivity.showV1703PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1703puppy
    FeaturePrefsStore.batch1701.v1703puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1703: purchase mode
internal fun PlayerActivity.showV1703PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1703purchase
    FeaturePrefsStore.batch1701.v1703purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1703: purity level
internal fun PlayerActivity.showV1703PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1703purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1703purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1703: purpose level
internal fun PlayerActivity.showV1703PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1703purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1703purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1703: purse level
internal fun PlayerActivity.showV1703PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1703purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1703purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1703: put level
internal fun PlayerActivity.showV1703PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1703put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1703put = value
        AppToast.show(this, "put: $value")
    }
}

// v1703: puzzle level
internal fun PlayerActivity.showV1703PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1703puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1703puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1703: quality mode
internal fun PlayerActivity.showV1703QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1703quality
    FeaturePrefsStore.batch1701.v1703quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1703: quantum mode
internal fun PlayerActivity.showV1703QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1703quantum
    FeaturePrefsStore.batch1701.v1703quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1703: quarter mode
internal fun PlayerActivity.showV1703QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1703quarter
    FeaturePrefsStore.batch1701.v1703quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1703: queen mode
internal fun PlayerActivity.showV1703QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1703queen
    FeaturePrefsStore.batch1701.v1703queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1703: quest mode
internal fun PlayerActivity.showV1703QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1703quest
    FeaturePrefsStore.batch1701.v1703quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1704: pumpkin mode
internal fun PlayerActivity.showV1704PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1704pumpkin
    FeaturePrefsStore.batch1701.v1704pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1704: punch mode
internal fun PlayerActivity.showV1704PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1704punch
    FeaturePrefsStore.batch1701.v1704punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1704: pupil mode
internal fun PlayerActivity.showV1704PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1704pupil
    FeaturePrefsStore.batch1701.v1704pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1704: puppy mode
internal fun PlayerActivity.showV1704PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1704puppy
    FeaturePrefsStore.batch1701.v1704puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1704: purchase mode
internal fun PlayerActivity.showV1704PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1704purchase
    FeaturePrefsStore.batch1701.v1704purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1704: purity level
internal fun PlayerActivity.showV1704PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1704purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1704purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1704: purpose level
internal fun PlayerActivity.showV1704PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1704purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1704purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1704: purse level
internal fun PlayerActivity.showV1704PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1704purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1704purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1704: put level
internal fun PlayerActivity.showV1704PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1704put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1704put = value
        AppToast.show(this, "put: $value")
    }
}

// v1704: puzzle level
internal fun PlayerActivity.showV1704PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1704puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1704puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1704: quality mode
internal fun PlayerActivity.showV1704QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1704quality
    FeaturePrefsStore.batch1701.v1704quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1704: quantum mode
internal fun PlayerActivity.showV1704QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1704quantum
    FeaturePrefsStore.batch1701.v1704quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1704: quarter mode
internal fun PlayerActivity.showV1704QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1704quarter
    FeaturePrefsStore.batch1701.v1704quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1704: queen mode
internal fun PlayerActivity.showV1704QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1704queen
    FeaturePrefsStore.batch1701.v1704queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1704: quest mode
internal fun PlayerActivity.showV1704QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1704quest
    FeaturePrefsStore.batch1701.v1704quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1705: pumpkin mode
internal fun PlayerActivity.showV1705PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1705pumpkin
    FeaturePrefsStore.batch1701.v1705pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1705: punch mode
internal fun PlayerActivity.showV1705PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1705punch
    FeaturePrefsStore.batch1701.v1705punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1705: pupil mode
internal fun PlayerActivity.showV1705PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1705pupil
    FeaturePrefsStore.batch1701.v1705pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1705: puppy mode
internal fun PlayerActivity.showV1705PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1705puppy
    FeaturePrefsStore.batch1701.v1705puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1705: purchase mode
internal fun PlayerActivity.showV1705PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1705purchase
    FeaturePrefsStore.batch1701.v1705purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1705: purity level
internal fun PlayerActivity.showV1705PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1705purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1705purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1705: purpose level
internal fun PlayerActivity.showV1705PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1705purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1705purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1705: purse level
internal fun PlayerActivity.showV1705PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1705purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1705purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1705: put level
internal fun PlayerActivity.showV1705PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1705put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1705put = value
        AppToast.show(this, "put: $value")
    }
}

// v1705: puzzle level
internal fun PlayerActivity.showV1705PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1705puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1705puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1705: quality mode
internal fun PlayerActivity.showV1705QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1705quality
    FeaturePrefsStore.batch1701.v1705quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1705: quantum mode
internal fun PlayerActivity.showV1705QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1705quantum
    FeaturePrefsStore.batch1701.v1705quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1705: quarter mode
internal fun PlayerActivity.showV1705QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1705quarter
    FeaturePrefsStore.batch1701.v1705quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1705: queen mode
internal fun PlayerActivity.showV1705QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1705queen
    FeaturePrefsStore.batch1701.v1705queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1705: quest mode
internal fun PlayerActivity.showV1705QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1705quest
    FeaturePrefsStore.batch1701.v1705quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1706: pumpkin mode
internal fun PlayerActivity.showV1706PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1706pumpkin
    FeaturePrefsStore.batch1701.v1706pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1706: punch mode
internal fun PlayerActivity.showV1706PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1706punch
    FeaturePrefsStore.batch1701.v1706punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1706: pupil mode
internal fun PlayerActivity.showV1706PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1706pupil
    FeaturePrefsStore.batch1701.v1706pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1706: puppy mode
internal fun PlayerActivity.showV1706PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1706puppy
    FeaturePrefsStore.batch1701.v1706puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1706: purchase mode
internal fun PlayerActivity.showV1706PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1706purchase
    FeaturePrefsStore.batch1701.v1706purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1706: purity level
internal fun PlayerActivity.showV1706PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1706purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1706purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1706: purpose level
internal fun PlayerActivity.showV1706PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1706purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1706purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1706: purse level
internal fun PlayerActivity.showV1706PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1706purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1706purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1706: put level
internal fun PlayerActivity.showV1706PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1706put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1706put = value
        AppToast.show(this, "put: $value")
    }
}

// v1706: puzzle level
internal fun PlayerActivity.showV1706PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1706puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1706puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1706: quality mode
internal fun PlayerActivity.showV1706QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1706quality
    FeaturePrefsStore.batch1701.v1706quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1706: quantum mode
internal fun PlayerActivity.showV1706QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1706quantum
    FeaturePrefsStore.batch1701.v1706quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1706: quarter mode
internal fun PlayerActivity.showV1706QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1706quarter
    FeaturePrefsStore.batch1701.v1706quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1706: queen mode
internal fun PlayerActivity.showV1706QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1706queen
    FeaturePrefsStore.batch1701.v1706queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1706: quest mode
internal fun PlayerActivity.showV1706QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1706quest
    FeaturePrefsStore.batch1701.v1706quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1707: pumpkin mode
internal fun PlayerActivity.showV1707PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1707pumpkin
    FeaturePrefsStore.batch1701.v1707pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1707: punch mode
internal fun PlayerActivity.showV1707PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1707punch
    FeaturePrefsStore.batch1701.v1707punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1707: pupil mode
internal fun PlayerActivity.showV1707PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1707pupil
    FeaturePrefsStore.batch1701.v1707pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1707: puppy mode
internal fun PlayerActivity.showV1707PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1707puppy
    FeaturePrefsStore.batch1701.v1707puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1707: purchase mode
internal fun PlayerActivity.showV1707PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1707purchase
    FeaturePrefsStore.batch1701.v1707purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1707: purity level
internal fun PlayerActivity.showV1707PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1707purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1707purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1707: purpose level
internal fun PlayerActivity.showV1707PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1707purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1707purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1707: purse level
internal fun PlayerActivity.showV1707PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1707purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1707purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1707: put level
internal fun PlayerActivity.showV1707PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1707put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1707put = value
        AppToast.show(this, "put: $value")
    }
}

// v1707: puzzle level
internal fun PlayerActivity.showV1707PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1707puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1707puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1707: quality mode
internal fun PlayerActivity.showV1707QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1707quality
    FeaturePrefsStore.batch1701.v1707quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1707: quantum mode
internal fun PlayerActivity.showV1707QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1707quantum
    FeaturePrefsStore.batch1701.v1707quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1707: quarter mode
internal fun PlayerActivity.showV1707QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1707quarter
    FeaturePrefsStore.batch1701.v1707quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1707: queen mode
internal fun PlayerActivity.showV1707QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1707queen
    FeaturePrefsStore.batch1701.v1707queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1707: quest mode
internal fun PlayerActivity.showV1707QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1707quest
    FeaturePrefsStore.batch1701.v1707quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1708: pumpkin mode
internal fun PlayerActivity.showV1708PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1708pumpkin
    FeaturePrefsStore.batch1701.v1708pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1708: punch mode
internal fun PlayerActivity.showV1708PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1708punch
    FeaturePrefsStore.batch1701.v1708punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1708: pupil mode
internal fun PlayerActivity.showV1708PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1708pupil
    FeaturePrefsStore.batch1701.v1708pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1708: puppy mode
internal fun PlayerActivity.showV1708PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1708puppy
    FeaturePrefsStore.batch1701.v1708puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1708: purchase mode
internal fun PlayerActivity.showV1708PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1708purchase
    FeaturePrefsStore.batch1701.v1708purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1708: purity level
internal fun PlayerActivity.showV1708PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1708purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1708purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1708: purpose level
internal fun PlayerActivity.showV1708PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1708purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1708purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1708: purse level
internal fun PlayerActivity.showV1708PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1708purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1708purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1708: put level
internal fun PlayerActivity.showV1708PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1708put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1708put = value
        AppToast.show(this, "put: $value")
    }
}

// v1708: puzzle level
internal fun PlayerActivity.showV1708PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1708puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1708puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1708: quality mode
internal fun PlayerActivity.showV1708QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1708quality
    FeaturePrefsStore.batch1701.v1708quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1708: quantum mode
internal fun PlayerActivity.showV1708QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1708quantum
    FeaturePrefsStore.batch1701.v1708quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1708: quarter mode
internal fun PlayerActivity.showV1708QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1708quarter
    FeaturePrefsStore.batch1701.v1708quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1708: queen mode
internal fun PlayerActivity.showV1708QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1708queen
    FeaturePrefsStore.batch1701.v1708queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1708: quest mode
internal fun PlayerActivity.showV1708QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1708quest
    FeaturePrefsStore.batch1701.v1708quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1709: pumpkin mode
internal fun PlayerActivity.showV1709PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1709pumpkin
    FeaturePrefsStore.batch1701.v1709pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1709: punch mode
internal fun PlayerActivity.showV1709PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1709punch
    FeaturePrefsStore.batch1701.v1709punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1709: pupil mode
internal fun PlayerActivity.showV1709PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1709pupil
    FeaturePrefsStore.batch1701.v1709pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1709: puppy mode
internal fun PlayerActivity.showV1709PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1709puppy
    FeaturePrefsStore.batch1701.v1709puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1709: purchase mode
internal fun PlayerActivity.showV1709PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1709purchase
    FeaturePrefsStore.batch1701.v1709purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1709: purity level
internal fun PlayerActivity.showV1709PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1709purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1709purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1709: purpose level
internal fun PlayerActivity.showV1709PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1709purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1709purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1709: purse level
internal fun PlayerActivity.showV1709PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1709purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1709purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1709: put level
internal fun PlayerActivity.showV1709PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1709put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1709put = value
        AppToast.show(this, "put: $value")
    }
}

// v1709: puzzle level
internal fun PlayerActivity.showV1709PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1709puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1709puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1709: quality mode
internal fun PlayerActivity.showV1709QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1709quality
    FeaturePrefsStore.batch1701.v1709quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1709: quantum mode
internal fun PlayerActivity.showV1709QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1709quantum
    FeaturePrefsStore.batch1701.v1709quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1709: quarter mode
internal fun PlayerActivity.showV1709QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1709quarter
    FeaturePrefsStore.batch1701.v1709quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1709: queen mode
internal fun PlayerActivity.showV1709QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1709queen
    FeaturePrefsStore.batch1701.v1709queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1709: quest mode
internal fun PlayerActivity.showV1709QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1709quest
    FeaturePrefsStore.batch1701.v1709quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1710: pumpkin mode
internal fun PlayerActivity.showV1710PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1710pumpkin
    FeaturePrefsStore.batch1701.v1710pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1710: punch mode
internal fun PlayerActivity.showV1710PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1710punch
    FeaturePrefsStore.batch1701.v1710punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1710: pupil mode
internal fun PlayerActivity.showV1710PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1710pupil
    FeaturePrefsStore.batch1701.v1710pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1710: puppy mode
internal fun PlayerActivity.showV1710PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1710puppy
    FeaturePrefsStore.batch1701.v1710puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1710: purchase mode
internal fun PlayerActivity.showV1710PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1710purchase
    FeaturePrefsStore.batch1701.v1710purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1710: purity level
internal fun PlayerActivity.showV1710PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1710purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1710purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1710: purpose level
internal fun PlayerActivity.showV1710PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1710purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1710purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1710: purse level
internal fun PlayerActivity.showV1710PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1710purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1710purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1710: put level
internal fun PlayerActivity.showV1710PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1710put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1710put = value
        AppToast.show(this, "put: $value")
    }
}

// v1710: puzzle level
internal fun PlayerActivity.showV1710PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1710puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1710puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1710: quality mode
internal fun PlayerActivity.showV1710QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1710quality
    FeaturePrefsStore.batch1701.v1710quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1710: quantum mode
internal fun PlayerActivity.showV1710QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1710quantum
    FeaturePrefsStore.batch1701.v1710quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1710: quarter mode
internal fun PlayerActivity.showV1710QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1710quarter
    FeaturePrefsStore.batch1701.v1710quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1710: queen mode
internal fun PlayerActivity.showV1710QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1710queen
    FeaturePrefsStore.batch1701.v1710queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1710: quest mode
internal fun PlayerActivity.showV1710QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1710quest
    FeaturePrefsStore.batch1701.v1710quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}
