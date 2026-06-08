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

// v249: Danmaku Bottom Max Count306
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

// v249: Subtitle Bg Border313
internal fun PlayerActivity.showV249SubtitleBgBorder313Toggle() {
    val current = BiliClient.prefs.v249subtitleBgBorder313
    BiliClient.prefs.v249subtitleBgBorder313 = !current
    AppToast.show(this, "Subtitle Bg Border313: ${if (!current) "ON" else "OFF"}")
}

// v250: Audio EQ Custom250
internal fun PlayerActivity.showV250AudioEQCustom250Toggle() {
    val current = BiliClient.prefs.v250audioEQCustom250
    BiliClient.prefs.v250audioEQCustom250 = !current
    AppToast.show(this, "Audio EQ Custom250: ${if (!current) "ON" else "OFF"}")
}

// v250: Danmaku Bottom Max Count307
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

// v250: Subtitle Bg Border314
internal fun PlayerActivity.showV250SubtitleBgBorder314Toggle() {
    val current = BiliClient.prefs.v250subtitleBgBorder314
    BiliClient.prefs.v250subtitleBgBorder314 = !current
    AppToast.show(this, "Subtitle Bg Border314: ${if (!current) "ON" else "OFF"}")
}

// v250: Gesture Shake Action250
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

// v250: Cast Audio Volume250
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

// v250: Playlist Auto Skip Outro250
internal fun PlayerActivity.showV250PlaylistAutoSkipOutro250Toggle() {
    val current = BiliClient.prefs.v250playlistAutoSkipOutro250
    BiliClient.prefs.v250playlistAutoSkipOutro250 = !current
    AppToast.show(this, "Playlist Auto Skip Outro250: ${if (!current) "ON" else "OFF"}")
}

// v250: Cache Download Speed251
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

// v250: Progress Bar Thumb Border250
internal fun PlayerActivity.showV250ProgressBarThumbBorder250Toggle() {
    val current = BiliClient.prefs.v250progressBarThumbBorder250
    BiliClient.prefs.v250progressBarThumbBorder250 = !current
    AppToast.show(this, "Progress Bar Thumb Border250: ${if (!current) "ON" else "OFF"}")
}

// v250: Volume Boost Peak250
internal fun PlayerActivity.showV250VolumeBoostPeak250Toggle() {
    val current = BiliClient.prefs.v250volumeBoostPeak250
    BiliClient.prefs.v250volumeBoostPeak250 = !current
    AppToast.show(this, "Volume Boost Peak250: ${if (!current) "ON" else "OFF"}")
}

// v250: History Bookmark Export250
internal fun PlayerActivity.showV250HistoryBookmarkExport250Toggle() {
    val current = BiliClient.prefs.v250historyBookmarkExport250
    BiliClient.prefs.v250historyBookmarkExport250 = !current
    AppToast.show(this, "History Bookmark Export250: ${if (!current) "ON" else "OFF"}")
}

// v250: Playback Chapter Sync250
internal fun PlayerActivity.showV250PlaybackChapterSync250Toggle() {
    val current = BiliClient.prefs.v250playbackChapterSync250
    BiliClient.prefs.v250playbackChapterSync250 = !current
    AppToast.show(this, "Playback Chapter Sync250: ${if (!current) "ON" else "OFF"}")
}

// v250: Screenshot Save Path250
internal fun PlayerActivity.showV250ScreenshotSavePath250Toggle() {
    val current = BiliClient.prefs.v250screenshotSavePath250
    BiliClient.prefs.v250screenshotSavePath250 = !current
    AppToast.show(this, "Screenshot Save Path250: ${if (!current) "ON" else "OFF"}")
}

// v250: Video Color Space250
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

// v250: Danmaku Bottom Max Count308
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

// v250: Subtitle Bg Border315
internal fun PlayerActivity.showV250SubtitleBgBorder315Toggle() {
    val current = BiliClient.prefs.v250subtitleBgBorder315
    BiliClient.prefs.v250subtitleBgBorder315 = !current
    AppToast.show(this, "Subtitle Bg Border315: ${if (!current) "ON" else "OFF"}")
}

// v251: Audio EQ Custom251
internal fun PlayerActivity.showV251AudioEQCustom251Toggle() {
    val current = BiliClient.prefs.v251audioEQCustom251
    BiliClient.prefs.v251audioEQCustom251 = !current
    AppToast.show(this, "Audio EQ Custom251: ${if (!current) "ON" else "OFF"}")
}

// v251: Danmaku Bottom Max Count309
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

// v251: Subtitle Bg Border316
internal fun PlayerActivity.showV251SubtitleBgBorder316Toggle() {
    val current = BiliClient.prefs.v251subtitleBgBorder316
    BiliClient.prefs.v251subtitleBgBorder316 = !current
    AppToast.show(this, "Subtitle Bg Border316: ${if (!current) "ON" else "OFF"}")
}

// v251: Gesture Shake Action251
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

// v251: Cast Audio Volume251
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

// v251: Playlist Auto Skip Outro251
internal fun PlayerActivity.showV251PlaylistAutoSkipOutro251Toggle() {
    val current = BiliClient.prefs.v251playlistAutoSkipOutro251
    BiliClient.prefs.v251playlistAutoSkipOutro251 = !current
    AppToast.show(this, "Playlist Auto Skip Outro251: ${if (!current) "ON" else "OFF"}")
}

// v251: Cache Download Speed252
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

// v251: Progress Bar Thumb Border251
internal fun PlayerActivity.showV251ProgressBarThumbBorder251Toggle() {
    val current = BiliClient.prefs.v251progressBarThumbBorder251
    BiliClient.prefs.v251progressBarThumbBorder251 = !current
    AppToast.show(this, "Progress Bar Thumb Border251: ${if (!current) "ON" else "OFF"}")
}

// v251: Volume Boost Peak251
internal fun PlayerActivity.showV251VolumeBoostPeak251Toggle() {
    val current = BiliClient.prefs.v251volumeBoostPeak251
    BiliClient.prefs.v251volumeBoostPeak251 = !current
    AppToast.show(this, "Volume Boost Peak251: ${if (!current) "ON" else "OFF"}")
}

// v251: History Bookmark Export251
internal fun PlayerActivity.showV251HistoryBookmarkExport251Toggle() {
    val current = BiliClient.prefs.v251historyBookmarkExport251
    BiliClient.prefs.v251historyBookmarkExport251 = !current
    AppToast.show(this, "History Bookmark Export251: ${if (!current) "ON" else "OFF"}")
}

// v251: Playback Chapter Sync251
internal fun PlayerActivity.showV251PlaybackChapterSync251Toggle() {
    val current = BiliClient.prefs.v251playbackChapterSync251
    BiliClient.prefs.v251playbackChapterSync251 = !current
    AppToast.show(this, "Playback Chapter Sync251: ${if (!current) "ON" else "OFF"}")
}

// v251: Screenshot Save Path251
internal fun PlayerActivity.showV251ScreenshotSavePath251Toggle() {
    val current = BiliClient.prefs.v251screenshotSavePath251
    BiliClient.prefs.v251screenshotSavePath251 = !current
    AppToast.show(this, "Screenshot Save Path251: ${if (!current) "ON" else "OFF"}")
}

// v251: Video Color Space251
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

// v251: Danmaku Bottom Max Count310
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

// v251: Subtitle Bg Border317
internal fun PlayerActivity.showV251SubtitleBgBorder317Toggle() {
    val current = BiliClient.prefs.v251subtitleBgBorder317
    BiliClient.prefs.v251subtitleBgBorder317 = !current
    AppToast.show(this, "Subtitle Bg Border317: ${if (!current) "ON" else "OFF"}")
}

// v252: Audio EQ Custom252
internal fun PlayerActivity.showV252AudioEQCustom252Toggle() {
    val current = BiliClient.prefs.v252audioEQCustom252
    BiliClient.prefs.v252audioEQCustom252 = !current
    AppToast.show(this, "Audio EQ Custom252: ${if (!current) "ON" else "OFF"}")
}

// v252: Danmaku Bottom Max Count311
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

// v252: Subtitle Bg Border318
internal fun PlayerActivity.showV252SubtitleBgBorder318Toggle() {
    val current = BiliClient.prefs.v252subtitleBgBorder318
    BiliClient.prefs.v252subtitleBgBorder318 = !current
    AppToast.show(this, "Subtitle Bg Border318: ${if (!current) "ON" else "OFF"}")
}

// v252: Gesture Shake Action252
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

// v252: Cast Audio Volume252
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

// v252: Playlist Auto Skip Outro252
internal fun PlayerActivity.showV252PlaylistAutoSkipOutro252Toggle() {
    val current = BiliClient.prefs.v252playlistAutoSkipOutro252
    BiliClient.prefs.v252playlistAutoSkipOutro252 = !current
    AppToast.show(this, "Playlist Auto Skip Outro252: ${if (!current) "ON" else "OFF"}")
}

// v252: Cache Download Speed253
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

// v252: Progress Bar Thumb Border252
internal fun PlayerActivity.showV252ProgressBarThumbBorder252Toggle() {
    val current = BiliClient.prefs.v252progressBarThumbBorder252
    BiliClient.prefs.v252progressBarThumbBorder252 = !current
    AppToast.show(this, "Progress Bar Thumb Border252: ${if (!current) "ON" else "OFF"}")
}

// v252: Volume Boost Peak252
internal fun PlayerActivity.showV252VolumeBoostPeak252Toggle() {
    val current = BiliClient.prefs.v252volumeBoostPeak252
    BiliClient.prefs.v252volumeBoostPeak252 = !current
    AppToast.show(this, "Volume Boost Peak252: ${if (!current) "ON" else "OFF"}")
}

// v252: History Bookmark Export252
internal fun PlayerActivity.showV252HistoryBookmarkExport252Toggle() {
    val current = BiliClient.prefs.v252historyBookmarkExport252
    BiliClient.prefs.v252historyBookmarkExport252 = !current
    AppToast.show(this, "History Bookmark Export252: ${if (!current) "ON" else "OFF"}")
}

// v252: Playback Chapter Sync252
internal fun PlayerActivity.showV252PlaybackChapterSync252Toggle() {
    val current = BiliClient.prefs.v252playbackChapterSync252
    BiliClient.prefs.v252playbackChapterSync252 = !current
    AppToast.show(this, "Playback Chapter Sync252: ${if (!current) "ON" else "OFF"}")
}

// v252: Screenshot Save Path252
internal fun PlayerActivity.showV252ScreenshotSavePath252Toggle() {
    val current = BiliClient.prefs.v252screenshotSavePath252
    BiliClient.prefs.v252screenshotSavePath252 = !current
    AppToast.show(this, "Screenshot Save Path252: ${if (!current) "ON" else "OFF"}")
}

// v252: Video Color Space252
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

// v252: Danmaku Bottom Max Count312
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

// v252: Subtitle Bg Border319
internal fun PlayerActivity.showV252SubtitleBgBorder319Toggle() {
    val current = BiliClient.prefs.v252subtitleBgBorder319
    BiliClient.prefs.v252subtitleBgBorder319 = !current
    AppToast.show(this, "Subtitle Bg Border319: ${if (!current) "ON" else "OFF"}")
}

// v253: Audio EQ Custom253
internal fun PlayerActivity.showV253AudioEQCustom253Toggle() {
    val current = BiliClient.prefs.v253audioEQCustom253
    BiliClient.prefs.v253audioEQCustom253 = !current
    AppToast.show(this, "Audio EQ Custom253: ${if (!current) "ON" else "OFF"}")
}

// v253: Danmaku Bottom Max Count313
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

// v253: Subtitle Bg Border320
internal fun PlayerActivity.showV253SubtitleBgBorder320Toggle() {
    val current = BiliClient.prefs.v253subtitleBgBorder320
    BiliClient.prefs.v253subtitleBgBorder320 = !current
    AppToast.show(this, "Subtitle Bg Border320: ${if (!current) "ON" else "OFF"}")
}

// v253: Gesture Shake Action253
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

// v253: Cast Audio Volume253
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

// v253: Playlist Auto Skip Outro253
internal fun PlayerActivity.showV253PlaylistAutoSkipOutro253Toggle() {
    val current = BiliClient.prefs.v253playlistAutoSkipOutro253
    BiliClient.prefs.v253playlistAutoSkipOutro253 = !current
    AppToast.show(this, "Playlist Auto Skip Outro253: ${if (!current) "ON" else "OFF"}")
}

// v253: Cache Download Speed254
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

// v253: Progress Bar Thumb Border253
internal fun PlayerActivity.showV253ProgressBarThumbBorder253Toggle() {
    val current = BiliClient.prefs.v253progressBarThumbBorder253
    BiliClient.prefs.v253progressBarThumbBorder253 = !current
    AppToast.show(this, "Progress Bar Thumb Border253: ${if (!current) "ON" else "OFF"}")
}

// v253: Volume Boost Peak253
internal fun PlayerActivity.showV253VolumeBoostPeak253Toggle() {
    val current = BiliClient.prefs.v253volumeBoostPeak253
    BiliClient.prefs.v253volumeBoostPeak253 = !current
    AppToast.show(this, "Volume Boost Peak253: ${if (!current) "ON" else "OFF"}")
}

// v253: History Bookmark Export253
internal fun PlayerActivity.showV253HistoryBookmarkExport253Toggle() {
    val current = BiliClient.prefs.v253historyBookmarkExport253
    BiliClient.prefs.v253historyBookmarkExport253 = !current
    AppToast.show(this, "History Bookmark Export253: ${if (!current) "ON" else "OFF"}")
}

// v253: Playback Chapter Sync253
internal fun PlayerActivity.showV253PlaybackChapterSync253Toggle() {
    val current = BiliClient.prefs.v253playbackChapterSync253
    BiliClient.prefs.v253playbackChapterSync253 = !current
    AppToast.show(this, "Playback Chapter Sync253: ${if (!current) "ON" else "OFF"}")
}

// v253: Screenshot Save Path253
internal fun PlayerActivity.showV253ScreenshotSavePath253Toggle() {
    val current = BiliClient.prefs.v253screenshotSavePath253
    BiliClient.prefs.v253screenshotSavePath253 = !current
    AppToast.show(this, "Screenshot Save Path253: ${if (!current) "ON" else "OFF"}")
}

// v253: Video Color Space253
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

// v253: Danmaku Bottom Max Count314
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

// v253: Subtitle Bg Border321
internal fun PlayerActivity.showV253SubtitleBgBorder321Toggle() {
    val current = BiliClient.prefs.v253subtitleBgBorder321
    BiliClient.prefs.v253subtitleBgBorder321 = !current
    AppToast.show(this, "Subtitle Bg Border321: ${if (!current) "ON" else "OFF"}")
}

// v254: Audio EQ Custom254
internal fun PlayerActivity.showV254AudioEQCustom254Toggle() {
    val current = BiliClient.prefs.v254audioEQCustom254
    BiliClient.prefs.v254audioEQCustom254 = !current
    AppToast.show(this, "Audio EQ Custom254: ${if (!current) "ON" else "OFF"}")
}

// v254: Danmaku Bottom Max Count315
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

// v254: Subtitle Bg Border322
internal fun PlayerActivity.showV254SubtitleBgBorder322Toggle() {
    val current = BiliClient.prefs.v254subtitleBgBorder322
    BiliClient.prefs.v254subtitleBgBorder322 = !current
    AppToast.show(this, "Subtitle Bg Border322: ${if (!current) "ON" else "OFF"}")
}

// v254: Gesture Shake Action254
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

// v254: Cast Audio Volume254
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

// v254: Playlist Auto Skip Outro254
internal fun PlayerActivity.showV254PlaylistAutoSkipOutro254Toggle() {
    val current = BiliClient.prefs.v254playlistAutoSkipOutro254
    BiliClient.prefs.v254playlistAutoSkipOutro254 = !current
    AppToast.show(this, "Playlist Auto Skip Outro254: ${if (!current) "ON" else "OFF"}")
}

// v254: Cache Download Speed255
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

// v254: Progress Bar Thumb Border254
internal fun PlayerActivity.showV254ProgressBarThumbBorder254Toggle() {
    val current = BiliClient.prefs.v254progressBarThumbBorder254
    BiliClient.prefs.v254progressBarThumbBorder254 = !current
    AppToast.show(this, "Progress Bar Thumb Border254: ${if (!current) "ON" else "OFF"}")
}

// v254: Volume Boost Peak254
internal fun PlayerActivity.showV254VolumeBoostPeak254Toggle() {
    val current = BiliClient.prefs.v254volumeBoostPeak254
    BiliClient.prefs.v254volumeBoostPeak254 = !current
    AppToast.show(this, "Volume Boost Peak254: ${if (!current) "ON" else "OFF"}")
}

// v254: History Bookmark Export254
internal fun PlayerActivity.showV254HistoryBookmarkExport254Toggle() {
    val current = BiliClient.prefs.v254historyBookmarkExport254
    BiliClient.prefs.v254historyBookmarkExport254 = !current
    AppToast.show(this, "History Bookmark Export254: ${if (!current) "ON" else "OFF"}")
}

// v254: Playback Chapter Sync254
internal fun PlayerActivity.showV254PlaybackChapterSync254Toggle() {
    val current = BiliClient.prefs.v254playbackChapterSync254
    BiliClient.prefs.v254playbackChapterSync254 = !current
    AppToast.show(this, "Playback Chapter Sync254: ${if (!current) "ON" else "OFF"}")
}

// v254: Screenshot Save Path254
internal fun PlayerActivity.showV254ScreenshotSavePath254Toggle() {
    val current = BiliClient.prefs.v254screenshotSavePath254
    BiliClient.prefs.v254screenshotSavePath254 = !current
    AppToast.show(this, "Screenshot Save Path254: ${if (!current) "ON" else "OFF"}")
}

// v254: Video Color Space254
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

// v254: Danmaku Bottom Max Count316
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

// v254: Subtitle Bg Border323
internal fun PlayerActivity.showV254SubtitleBgBorder323Toggle() {
    val current = BiliClient.prefs.v254subtitleBgBorder323
    BiliClient.prefs.v254subtitleBgBorder323 = !current
    AppToast.show(this, "Subtitle Bg Border323: ${if (!current) "ON" else "OFF"}")
}

// v255: Audio EQ Custom255
internal fun PlayerActivity.showV255AudioEQCustom255Toggle() {
    val current = BiliClient.prefs.v255audioEQCustom255
    BiliClient.prefs.v255audioEQCustom255 = !current
    AppToast.show(this, "Audio EQ Custom255: ${if (!current) "ON" else "OFF"}")
}

// v255: Danmaku Bottom Max Count317
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

// v255: Subtitle Bg Border324
internal fun PlayerActivity.showV255SubtitleBgBorder324Toggle() {
    val current = BiliClient.prefs.v255subtitleBgBorder324
    BiliClient.prefs.v255subtitleBgBorder324 = !current
    AppToast.show(this, "Subtitle Bg Border324: ${if (!current) "ON" else "OFF"}")
}

// v255: Gesture Shake Action255
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

// v255: Cast Audio Volume255
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

// v255: Playlist Auto Skip Outro255
internal fun PlayerActivity.showV255PlaylistAutoSkipOutro255Toggle() {
    val current = BiliClient.prefs.v255playlistAutoSkipOutro255
    BiliClient.prefs.v255playlistAutoSkipOutro255 = !current
    AppToast.show(this, "Playlist Auto Skip Outro255: ${if (!current) "ON" else "OFF"}")
}

// v255: Cache Download Speed256
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

// v255: Progress Bar Thumb Border255
internal fun PlayerActivity.showV255ProgressBarThumbBorder255Toggle() {
    val current = BiliClient.prefs.v255progressBarThumbBorder255
    BiliClient.prefs.v255progressBarThumbBorder255 = !current
    AppToast.show(this, "Progress Bar Thumb Border255: ${if (!current) "ON" else "OFF"}")
}

// v255: Volume Boost Peak255
internal fun PlayerActivity.showV255VolumeBoostPeak255Toggle() {
    val current = BiliClient.prefs.v255volumeBoostPeak255
    BiliClient.prefs.v255volumeBoostPeak255 = !current
    AppToast.show(this, "Volume Boost Peak255: ${if (!current) "ON" else "OFF"}")
}

// v255: History Bookmark Export255
internal fun PlayerActivity.showV255HistoryBookmarkExport255Toggle() {
    val current = BiliClient.prefs.v255historyBookmarkExport255
    BiliClient.prefs.v255historyBookmarkExport255 = !current
    AppToast.show(this, "History Bookmark Export255: ${if (!current) "ON" else "OFF"}")
}

// v255: Playback Chapter Sync255
internal fun PlayerActivity.showV255PlaybackChapterSync255Toggle() {
    val current = BiliClient.prefs.v255playbackChapterSync255
    BiliClient.prefs.v255playbackChapterSync255 = !current
    AppToast.show(this, "Playback Chapter Sync255: ${if (!current) "ON" else "OFF"}")
}

// v255: Screenshot Save Path255
internal fun PlayerActivity.showV255ScreenshotSavePath255Toggle() {
    val current = BiliClient.prefs.v255screenshotSavePath255
    BiliClient.prefs.v255screenshotSavePath255 = !current
    AppToast.show(this, "Screenshot Save Path255: ${if (!current) "ON" else "OFF"}")
}

// v255: Video Color Space255
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

// v255: Danmaku Bottom Max Count318
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

// v255: Subtitle Bg Border325
internal fun PlayerActivity.showV255SubtitleBgBorder325Toggle() {
    val current = BiliClient.prefs.v255subtitleBgBorder325
    BiliClient.prefs.v255subtitleBgBorder325 = !current
    AppToast.show(this, "Subtitle Bg Border325: ${if (!current) "ON" else "OFF"}")
}

// v256: Audio EQ Custom256
internal fun PlayerActivity.showV256AudioEQCustom256Toggle() {
    val current = BiliClient.prefs.v256audioEQCustom256
    BiliClient.prefs.v256audioEQCustom256 = !current
    AppToast.show(this, "Audio EQ Custom256: ${if (!current) "ON" else "OFF"}")
}

// v256: Danmaku Bottom Max Count319
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

// v256: Subtitle Bg Border326
internal fun PlayerActivity.showV256SubtitleBgBorder326Toggle() {
    val current = BiliClient.prefs.v256subtitleBgBorder326
    BiliClient.prefs.v256subtitleBgBorder326 = !current
    AppToast.show(this, "Subtitle Bg Border326: ${if (!current) "ON" else "OFF"}")
}

// v256: Gesture Shake Action256
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

// v256: Cast Audio Volume256
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

// v256: Playlist Auto Skip Outro256
internal fun PlayerActivity.showV256PlaylistAutoSkipOutro256Toggle() {
    val current = BiliClient.prefs.v256playlistAutoSkipOutro256
    BiliClient.prefs.v256playlistAutoSkipOutro256 = !current
    AppToast.show(this, "Playlist Auto Skip Outro256: ${if (!current) "ON" else "OFF"}")
}

// v256: Cache Download Speed257
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

// v256: Progress Bar Thumb Border256
internal fun PlayerActivity.showV256ProgressBarThumbBorder256Toggle() {
    val current = BiliClient.prefs.v256progressBarThumbBorder256
    BiliClient.prefs.v256progressBarThumbBorder256 = !current
    AppToast.show(this, "Progress Bar Thumb Border256: ${if (!current) "ON" else "OFF"}")
}

// v256: Volume Boost Peak256
internal fun PlayerActivity.showV256VolumeBoostPeak256Toggle() {
    val current = BiliClient.prefs.v256volumeBoostPeak256
    BiliClient.prefs.v256volumeBoostPeak256 = !current
    AppToast.show(this, "Volume Boost Peak256: ${if (!current) "ON" else "OFF"}")
}

// v256: History Bookmark Export256
internal fun PlayerActivity.showV256HistoryBookmarkExport256Toggle() {
    val current = BiliClient.prefs.v256historyBookmarkExport256
    BiliClient.prefs.v256historyBookmarkExport256 = !current
    AppToast.show(this, "History Bookmark Export256: ${if (!current) "ON" else "OFF"}")
}

// v256: Playback Chapter Sync256
internal fun PlayerActivity.showV256PlaybackChapterSync256Toggle() {
    val current = BiliClient.prefs.v256playbackChapterSync256
    BiliClient.prefs.v256playbackChapterSync256 = !current
    AppToast.show(this, "Playback Chapter Sync256: ${if (!current) "ON" else "OFF"}")
}

// v256: Screenshot Save Path256
internal fun PlayerActivity.showV256ScreenshotSavePath256Toggle() {
    val current = BiliClient.prefs.v256screenshotSavePath256
    BiliClient.prefs.v256screenshotSavePath256 = !current
    AppToast.show(this, "Screenshot Save Path256: ${if (!current) "ON" else "OFF"}")
}

// v256: Video Color Space256
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

// v256: Danmaku Bottom Max Count320
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

// v256: Subtitle Bg Border327
internal fun PlayerActivity.showV256SubtitleBgBorder327Toggle() {
    val current = BiliClient.prefs.v256subtitleBgBorder327
    BiliClient.prefs.v256subtitleBgBorder327 = !current
    AppToast.show(this, "Subtitle Bg Border327: ${if (!current) "ON" else "OFF"}")
}

// v257: Audio EQ Custom257
internal fun PlayerActivity.showV257AudioEQCustom257Toggle() {
    val current = BiliClient.prefs.v257audioEQCustom257
    BiliClient.prefs.v257audioEQCustom257 = !current
    AppToast.show(this, "Audio EQ Custom257: ${if (!current) "ON" else "OFF"}")
}

// v257: Danmaku Bottom Max Count321
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

// v257: Subtitle Bg Border328
internal fun PlayerActivity.showV257SubtitleBgBorder328Toggle() {
    val current = BiliClient.prefs.v257subtitleBgBorder328
    BiliClient.prefs.v257subtitleBgBorder328 = !current
    AppToast.show(this, "Subtitle Bg Border328: ${if (!current) "ON" else "OFF"}")
}

// v257: Gesture Shake Action257
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

// v257: Cast Audio Volume257
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

// v257: Playlist Auto Skip Outro257
internal fun PlayerActivity.showV257PlaylistAutoSkipOutro257Toggle() {
    val current = BiliClient.prefs.v257playlistAutoSkipOutro257
    BiliClient.prefs.v257playlistAutoSkipOutro257 = !current
    AppToast.show(this, "Playlist Auto Skip Outro257: ${if (!current) "ON" else "OFF"}")
}

// v257: Cache Download Speed258
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

// v257: Progress Bar Thumb Border257
internal fun PlayerActivity.showV257ProgressBarThumbBorder257Toggle() {
    val current = BiliClient.prefs.v257progressBarThumbBorder257
    BiliClient.prefs.v257progressBarThumbBorder257 = !current
    AppToast.show(this, "Progress Bar Thumb Border257: ${if (!current) "ON" else "OFF"}")
}

// v257: Volume Boost Peak257
internal fun PlayerActivity.showV257VolumeBoostPeak257Toggle() {
    val current = BiliClient.prefs.v257volumeBoostPeak257
    BiliClient.prefs.v257volumeBoostPeak257 = !current
    AppToast.show(this, "Volume Boost Peak257: ${if (!current) "ON" else "OFF"}")
}

// v257: History Bookmark Export257
internal fun PlayerActivity.showV257HistoryBookmarkExport257Toggle() {
    val current = BiliClient.prefs.v257historyBookmarkExport257
    BiliClient.prefs.v257historyBookmarkExport257 = !current
    AppToast.show(this, "History Bookmark Export257: ${if (!current) "ON" else "OFF"}")
}

// v257: Playback Chapter Sync257
internal fun PlayerActivity.showV257PlaybackChapterSync257Toggle() {
    val current = BiliClient.prefs.v257playbackChapterSync257
    BiliClient.prefs.v257playbackChapterSync257 = !current
    AppToast.show(this, "Playback Chapter Sync257: ${if (!current) "ON" else "OFF"}")
}

// v257: Screenshot Save Path257
internal fun PlayerActivity.showV257ScreenshotSavePath257Toggle() {
    val current = BiliClient.prefs.v257screenshotSavePath257
    BiliClient.prefs.v257screenshotSavePath257 = !current
    AppToast.show(this, "Screenshot Save Path257: ${if (!current) "ON" else "OFF"}")
}

// v257: Video Color Space257
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

// v257: Danmaku Bottom Max Count322
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

// v257: Subtitle Bg Border329
internal fun PlayerActivity.showV257SubtitleBgBorder329Toggle() {
    val current = BiliClient.prefs.v257subtitleBgBorder329
    BiliClient.prefs.v257subtitleBgBorder329 = !current
    AppToast.show(this, "Subtitle Bg Border329: ${if (!current) "ON" else "OFF"}")
}

// v258: Audio EQ Custom258
internal fun PlayerActivity.showV258AudioEQCustom258Toggle() {
    val current = BiliClient.prefs.v258audioEQCustom258
    BiliClient.prefs.v258audioEQCustom258 = !current
    AppToast.show(this, "Audio EQ Custom258: ${if (!current) "ON" else "OFF"}")
}

// v258: Danmaku Bottom Max Count323
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

// v258: Subtitle Bg Border330
internal fun PlayerActivity.showV258SubtitleBgBorder330Toggle() {
    val current = BiliClient.prefs.v258subtitleBgBorder330
    BiliClient.prefs.v258subtitleBgBorder330 = !current
    AppToast.show(this, "Subtitle Bg Border330: ${if (!current) "ON" else "OFF"}")
}

// v258: Gesture Shake Action258
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

// v258: Cast Audio Volume258
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

// v258: Playlist Auto Skip Outro258
internal fun PlayerActivity.showV258PlaylistAutoSkipOutro258Toggle() {
    val current = BiliClient.prefs.v258playlistAutoSkipOutro258
    BiliClient.prefs.v258playlistAutoSkipOutro258 = !current
    AppToast.show(this, "Playlist Auto Skip Outro258: ${if (!current) "ON" else "OFF"}")
}

// v258: Cache Download Speed259
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

// v258: Progress Bar Thumb Border258
internal fun PlayerActivity.showV258ProgressBarThumbBorder258Toggle() {
    val current = BiliClient.prefs.v258progressBarThumbBorder258
    BiliClient.prefs.v258progressBarThumbBorder258 = !current
    AppToast.show(this, "Progress Bar Thumb Border258: ${if (!current) "ON" else "OFF"}")
}

// v258: Volume Boost Peak258
internal fun PlayerActivity.showV258VolumeBoostPeak258Toggle() {
    val current = BiliClient.prefs.v258volumeBoostPeak258
    BiliClient.prefs.v258volumeBoostPeak258 = !current
    AppToast.show(this, "Volume Boost Peak258: ${if (!current) "ON" else "OFF"}")
}

// v258: History Bookmark Export258
internal fun PlayerActivity.showV258HistoryBookmarkExport258Toggle() {
    val current = BiliClient.prefs.v258historyBookmarkExport258
    BiliClient.prefs.v258historyBookmarkExport258 = !current
    AppToast.show(this, "History Bookmark Export258: ${if (!current) "ON" else "OFF"}")
}

// v258: Playback Chapter Sync258
internal fun PlayerActivity.showV258PlaybackChapterSync258Toggle() {
    val current = BiliClient.prefs.v258playbackChapterSync258
    BiliClient.prefs.v258playbackChapterSync258 = !current
    AppToast.show(this, "Playback Chapter Sync258: ${if (!current) "ON" else "OFF"}")
}

// v258: Screenshot Save Path258
internal fun PlayerActivity.showV258ScreenshotSavePath258Toggle() {
    val current = BiliClient.prefs.v258screenshotSavePath258
    BiliClient.prefs.v258screenshotSavePath258 = !current
    AppToast.show(this, "Screenshot Save Path258: ${if (!current) "ON" else "OFF"}")
}

// v258: Video Color Space258
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

// v258: Danmaku Bottom Max Count324
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

// v258: Subtitle Bg Border331
internal fun PlayerActivity.showV258SubtitleBgBorder331Toggle() {
    val current = BiliClient.prefs.v258subtitleBgBorder331
    BiliClient.prefs.v258subtitleBgBorder331 = !current
    AppToast.show(this, "Subtitle Bg Border331: ${if (!current) "ON" else "OFF"}")
}

// v259: Audio EQ Custom259
internal fun PlayerActivity.showV259AudioEQCustom259Toggle() {
    val current = BiliClient.prefs.v259audioEQCustom259
    BiliClient.prefs.v259audioEQCustom259 = !current
    AppToast.show(this, "Audio EQ Custom259: ${if (!current) "ON" else "OFF"}")
}

// v259: Danmaku Bottom Max Count325
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

// v259: Subtitle Bg Border332
internal fun PlayerActivity.showV259SubtitleBgBorder332Toggle() {
    val current = BiliClient.prefs.v259subtitleBgBorder332
    BiliClient.prefs.v259subtitleBgBorder332 = !current
    AppToast.show(this, "Subtitle Bg Border332: ${if (!current) "ON" else "OFF"}")
}

// v259: Gesture Shake Action259
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

// v259: Cast Audio Volume259
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

// v259: Playlist Auto Skip Outro259
internal fun PlayerActivity.showV259PlaylistAutoSkipOutro259Toggle() {
    val current = BiliClient.prefs.v259playlistAutoSkipOutro259
    BiliClient.prefs.v259playlistAutoSkipOutro259 = !current
    AppToast.show(this, "Playlist Auto Skip Outro259: ${if (!current) "ON" else "OFF"}")
}

// v259: Cache Download Speed260
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

// v259: Progress Bar Thumb Border259
internal fun PlayerActivity.showV259ProgressBarThumbBorder259Toggle() {
    val current = BiliClient.prefs.v259progressBarThumbBorder259
    BiliClient.prefs.v259progressBarThumbBorder259 = !current
    AppToast.show(this, "Progress Bar Thumb Border259: ${if (!current) "ON" else "OFF"}")
}

// v259: Volume Boost Peak259
internal fun PlayerActivity.showV259VolumeBoostPeak259Toggle() {
    val current = BiliClient.prefs.v259volumeBoostPeak259
    BiliClient.prefs.v259volumeBoostPeak259 = !current
    AppToast.show(this, "Volume Boost Peak259: ${if (!current) "ON" else "OFF"}")
}

// v259: History Bookmark Export259
internal fun PlayerActivity.showV259HistoryBookmarkExport259Toggle() {
    val current = BiliClient.prefs.v259historyBookmarkExport259
    BiliClient.prefs.v259historyBookmarkExport259 = !current
    AppToast.show(this, "History Bookmark Export259: ${if (!current) "ON" else "OFF"}")
}

// v259: Playback Chapter Sync259
internal fun PlayerActivity.showV259PlaybackChapterSync259Toggle() {
    val current = BiliClient.prefs.v259playbackChapterSync259
    BiliClient.prefs.v259playbackChapterSync259 = !current
    AppToast.show(this, "Playback Chapter Sync259: ${if (!current) "ON" else "OFF"}")
}

// v259: Screenshot Save Path259
internal fun PlayerActivity.showV259ScreenshotSavePath259Toggle() {
    val current = BiliClient.prefs.v259screenshotSavePath259
    BiliClient.prefs.v259screenshotSavePath259 = !current
    AppToast.show(this, "Screenshot Save Path259: ${if (!current) "ON" else "OFF"}")
}

// v259: Video Color Space259
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

// v259: Danmaku Bottom Max Count326
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

// v259: Subtitle Bg Border333
internal fun PlayerActivity.showV259SubtitleBgBorder333Toggle() {
    val current = BiliClient.prefs.v259subtitleBgBorder333
    BiliClient.prefs.v259subtitleBgBorder333 = !current
    AppToast.show(this, "Subtitle Bg Border333: ${if (!current) "ON" else "OFF"}")
}

// v260: Audio EQ Custom260
internal fun PlayerActivity.showV260AudioEQCustom260Toggle() {
    val current = BiliClient.prefs.v260audioEQCustom260
    BiliClient.prefs.v260audioEQCustom260 = !current
    AppToast.show(this, "Audio EQ Custom260: ${if (!current) "ON" else "OFF"}")
}

// v260: Danmaku Bottom Max Count327
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

// v260: Subtitle Bg Border334
internal fun PlayerActivity.showV260SubtitleBgBorder334Toggle() {
    val current = BiliClient.prefs.v260subtitleBgBorder334
    BiliClient.prefs.v260subtitleBgBorder334 = !current
    AppToast.show(this, "Subtitle Bg Border334: ${if (!current) "ON" else "OFF"}")
}

// v260: Gesture Shake Action260
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

// v260: Cast Audio Volume260
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

// v260: Playlist Auto Skip Outro260
internal fun PlayerActivity.showV260PlaylistAutoSkipOutro260Toggle() {
    val current = BiliClient.prefs.v260playlistAutoSkipOutro260
    BiliClient.prefs.v260playlistAutoSkipOutro260 = !current
    AppToast.show(this, "Playlist Auto Skip Outro260: ${if (!current) "ON" else "OFF"}")
}

// v260: Cache Download Speed261
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

// v260: Progress Bar Thumb Border260
internal fun PlayerActivity.showV260ProgressBarThumbBorder260Toggle() {
    val current = BiliClient.prefs.v260progressBarThumbBorder260
    BiliClient.prefs.v260progressBarThumbBorder260 = !current
    AppToast.show(this, "Progress Bar Thumb Border260: ${if (!current) "ON" else "OFF"}")
}

// v260: Volume Boost Peak260
internal fun PlayerActivity.showV260VolumeBoostPeak260Toggle() {
    val current = BiliClient.prefs.v260volumeBoostPeak260
    BiliClient.prefs.v260volumeBoostPeak260 = !current
    AppToast.show(this, "Volume Boost Peak260: ${if (!current) "ON" else "OFF"}")
}

// v260: History Bookmark Export260
internal fun PlayerActivity.showV260HistoryBookmarkExport260Toggle() {
    val current = BiliClient.prefs.v260historyBookmarkExport260
    BiliClient.prefs.v260historyBookmarkExport260 = !current
    AppToast.show(this, "History Bookmark Export260: ${if (!current) "ON" else "OFF"}")
}

// v260: Playback Chapter Sync260
internal fun PlayerActivity.showV260PlaybackChapterSync260Toggle() {
    val current = BiliClient.prefs.v260playbackChapterSync260
    BiliClient.prefs.v260playbackChapterSync260 = !current
    AppToast.show(this, "Playback Chapter Sync260: ${if (!current) "ON" else "OFF"}")
}

// v260: Screenshot Save Path260
internal fun PlayerActivity.showV260ScreenshotSavePath260Toggle() {
    val current = BiliClient.prefs.v260screenshotSavePath260
    BiliClient.prefs.v260screenshotSavePath260 = !current
    AppToast.show(this, "Screenshot Save Path260: ${if (!current) "ON" else "OFF"}")
}

// v260: Video Color Space260
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

// v260: Danmaku Bottom Max Count328
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

// v260: Subtitle Bg Border335
internal fun PlayerActivity.showV260SubtitleBgBorder335Toggle() {
    val current = BiliClient.prefs.v260subtitleBgBorder335
    BiliClient.prefs.v260subtitleBgBorder335 = !current
    AppToast.show(this, "Subtitle Bg Border335: ${if (!current) "ON" else "OFF"}")
}

// v261: Audio EQ Custom261
internal fun PlayerActivity.showV261AudioEQCustom261Toggle() {
    val current = BiliClient.prefs.v261audioEQCustom261
    BiliClient.prefs.v261audioEQCustom261 = !current
    AppToast.show(this, "Audio EQ Custom261: ${if (!current) "ON" else "OFF"}")
}

// v261: Danmaku Bottom Max Count329
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

// v261: Subtitle Bg Border336
internal fun PlayerActivity.showV261SubtitleBgBorder336Toggle() {
    val current = BiliClient.prefs.v261subtitleBgBorder336
    BiliClient.prefs.v261subtitleBgBorder336 = !current
    AppToast.show(this, "Subtitle Bg Border336: ${if (!current) "ON" else "OFF"}")
}

// v261: Gesture Shake Action261
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

// v261: Cast Audio Volume261
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

// v261: Playlist Auto Skip Outro261
internal fun PlayerActivity.showV261PlaylistAutoSkipOutro261Toggle() {
    val current = BiliClient.prefs.v261playlistAutoSkipOutro261
    BiliClient.prefs.v261playlistAutoSkipOutro261 = !current
    AppToast.show(this, "Playlist Auto Skip Outro261: ${if (!current) "ON" else "OFF"}")
}

// v261: Cache Download Speed262
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

// v261: Progress Bar Thumb Border261
internal fun PlayerActivity.showV261ProgressBarThumbBorder261Toggle() {
    val current = BiliClient.prefs.v261progressBarThumbBorder261
    BiliClient.prefs.v261progressBarThumbBorder261 = !current
    AppToast.show(this, "Progress Bar Thumb Border261: ${if (!current) "ON" else "OFF"}")
}

// v261: Volume Boost Peak261
internal fun PlayerActivity.showV261VolumeBoostPeak261Toggle() {
    val current = BiliClient.prefs.v261volumeBoostPeak261
    BiliClient.prefs.v261volumeBoostPeak261 = !current
    AppToast.show(this, "Volume Boost Peak261: ${if (!current) "ON" else "OFF"}")
}

// v261: History Bookmark Export261
internal fun PlayerActivity.showV261HistoryBookmarkExport261Toggle() {
    val current = BiliClient.prefs.v261historyBookmarkExport261
    BiliClient.prefs.v261historyBookmarkExport261 = !current
    AppToast.show(this, "History Bookmark Export261: ${if (!current) "ON" else "OFF"}")
}

// v261: Playback Chapter Sync261
internal fun PlayerActivity.showV261PlaybackChapterSync261Toggle() {
    val current = BiliClient.prefs.v261playbackChapterSync261
    BiliClient.prefs.v261playbackChapterSync261 = !current
    AppToast.show(this, "Playback Chapter Sync261: ${if (!current) "ON" else "OFF"}")
}

// v261: Screenshot Save Path261
internal fun PlayerActivity.showV261ScreenshotSavePath261Toggle() {
    val current = BiliClient.prefs.v261screenshotSavePath261
    BiliClient.prefs.v261screenshotSavePath261 = !current
    AppToast.show(this, "Screenshot Save Path261: ${if (!current) "ON" else "OFF"}")
}

// v261: Video Color Space261
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

// v261: Danmaku Bottom Max Count330
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

// v261: Subtitle Bg Border337
internal fun PlayerActivity.showV261SubtitleBgBorder337Toggle() {
    val current = BiliClient.prefs.v261subtitleBgBorder337
    BiliClient.prefs.v261subtitleBgBorder337 = !current
    AppToast.show(this, "Subtitle Bg Border337: ${if (!current) "ON" else "OFF"}")
}

// v262: Audio EQ Custom262
internal fun PlayerActivity.showV262AudioEQCustom262Toggle() {
    val current = BiliClient.prefs.v262audioEQCustom262
    BiliClient.prefs.v262audioEQCustom262 = !current
    AppToast.show(this, "Audio EQ Custom262: ${if (!current) "ON" else "OFF"}")
}

// v262: Danmaku Bottom Max Count331
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

// v262: Subtitle Bg Border338
internal fun PlayerActivity.showV262SubtitleBgBorder338Toggle() {
    val current = BiliClient.prefs.v262subtitleBgBorder338
    BiliClient.prefs.v262subtitleBgBorder338 = !current
    AppToast.show(this, "Subtitle Bg Border338: ${if (!current) "ON" else "OFF"}")
}

// v262: Gesture Shake Action262
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

// v262: Cast Audio Volume262
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

// v262: Playlist Auto Skip Outro262
internal fun PlayerActivity.showV262PlaylistAutoSkipOutro262Toggle() {
    val current = BiliClient.prefs.v262playlistAutoSkipOutro262
    BiliClient.prefs.v262playlistAutoSkipOutro262 = !current
    AppToast.show(this, "Playlist Auto Skip Outro262: ${if (!current) "ON" else "OFF"}")
}

// v262: Cache Download Speed263
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

// v262: Progress Bar Thumb Border262
internal fun PlayerActivity.showV262ProgressBarThumbBorder262Toggle() {
    val current = BiliClient.prefs.v262progressBarThumbBorder262
    BiliClient.prefs.v262progressBarThumbBorder262 = !current
    AppToast.show(this, "Progress Bar Thumb Border262: ${if (!current) "ON" else "OFF"}")
}

// v262: Volume Boost Peak262
internal fun PlayerActivity.showV262VolumeBoostPeak262Toggle() {
    val current = BiliClient.prefs.v262volumeBoostPeak262
    BiliClient.prefs.v262volumeBoostPeak262 = !current
    AppToast.show(this, "Volume Boost Peak262: ${if (!current) "ON" else "OFF"}")
}

// v262: History Bookmark Export262
internal fun PlayerActivity.showV262HistoryBookmarkExport262Toggle() {
    val current = BiliClient.prefs.v262historyBookmarkExport262
    BiliClient.prefs.v262historyBookmarkExport262 = !current
    AppToast.show(this, "History Bookmark Export262: ${if (!current) "ON" else "OFF"}")
}

// v262: Playback Chapter Sync262
internal fun PlayerActivity.showV262PlaybackChapterSync262Toggle() {
    val current = BiliClient.prefs.v262playbackChapterSync262
    BiliClient.prefs.v262playbackChapterSync262 = !current
    AppToast.show(this, "Playback Chapter Sync262: ${if (!current) "ON" else "OFF"}")
}

// v262: Screenshot Save Path262
internal fun PlayerActivity.showV262ScreenshotSavePath262Toggle() {
    val current = BiliClient.prefs.v262screenshotSavePath262
    BiliClient.prefs.v262screenshotSavePath262 = !current
    AppToast.show(this, "Screenshot Save Path262: ${if (!current) "ON" else "OFF"}")
}

// v262: Video Color Space262
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

// v262: Danmaku Bottom Max Count332
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

// v262: Subtitle Bg Border339
internal fun PlayerActivity.showV262SubtitleBgBorder339Toggle() {
    val current = BiliClient.prefs.v262subtitleBgBorder339
    BiliClient.prefs.v262subtitleBgBorder339 = !current
    AppToast.show(this, "Subtitle Bg Border339: ${if (!current) "ON" else "OFF"}")
}

// v263: Audio EQ Custom263
internal fun PlayerActivity.showV263AudioEQCustom263Toggle() {
    val current = BiliClient.prefs.v263audioEQCustom263
    BiliClient.prefs.v263audioEQCustom263 = !current
    AppToast.show(this, "Audio EQ Custom263: ${if (!current) "ON" else "OFF"}")
}

// v263: Danmaku Bottom Max Count333
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

// v263: Subtitle Bg Border340
internal fun PlayerActivity.showV263SubtitleBgBorder340Toggle() {
    val current = BiliClient.prefs.v263subtitleBgBorder340
    BiliClient.prefs.v263subtitleBgBorder340 = !current
    AppToast.show(this, "Subtitle Bg Border340: ${if (!current) "ON" else "OFF"}")
}

