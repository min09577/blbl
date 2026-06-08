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

internal fun PlayerActivity.showV321ScreenshotFormat303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321screenshotFormat303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321screenshotFormat303 = value
        AppToast.show(this, "Screenshot Format303: $value")
    }
}

internal fun PlayerActivity.showV321VideoDeinterlace303Toggle() {
    val current = BiliClient.prefs.v321videoDeinterlace303
    BiliClient.prefs.v321videoDeinterlace303 = !current
    AppToast.show(this, "Video Deinterlace303: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV321DanmakuTopCountMax304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321danmakuTopCountMax304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321danmakuTopCountMax304 = value
        AppToast.show(this, "Danmaku Top Count Max304: $value")
    }
}

internal fun PlayerActivity.showV321SubtitleStrokeWidth304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321subtitleStrokeWidth304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321subtitleStrokeWidth304 = value
        AppToast.show(this, "Subtitle Stroke Width304: $value")
    }
}

internal fun PlayerActivity.showV322AudioDynamicRange304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322audioDynamicRange304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322audioDynamicRange304 = value
        AppToast.show(this, "Audio Dynamic Range304: $value")
    }
}

internal fun PlayerActivity.showV322DanmakuTopCountMax305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322danmakuTopCountMax305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322danmakuTopCountMax305 = value
        AppToast.show(this, "Danmaku Top Count Max305: $value")
    }
}

internal fun PlayerActivity.showV322SubtitleStrokeWidth305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322subtitleStrokeWidth305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322subtitleStrokeWidth305 = value
        AppToast.show(this, "Subtitle Stroke Width305: $value")
    }
}

internal fun PlayerActivity.showV322GestureLongPressAction304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322gestureLongPressAction304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322gestureLongPressAction304 = value
        AppToast.show(this, "Gesture Long Press Action304: $value")
    }
}

internal fun PlayerActivity.showV322CastQuality304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322castQuality304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322castQuality304 = value
        AppToast.show(this, "Cast Quality304: $value")
    }
}

internal fun PlayerActivity.showV322PlaylistRepeatMode304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322playlistRepeatMode304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322playlistRepeatMode304 = value
        AppToast.show(this, "Playlist Repeat Mode304: $value")
    }
}

internal fun PlayerActivity.showV322CacheMaxSize304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322cacheMaxSize304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322cacheMaxSize304 = value
        AppToast.show(this, "Cache Max Size304: $value")
    }
}

internal fun PlayerActivity.showV322ProgressBarHeight304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322progressBarHeight304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322progressBarHeight304 = value
        AppToast.show(this, "Progress Bar Height304: $value")
    }
}

internal fun PlayerActivity.showV322VolumeLevelIndicator304Toggle() {
    val current = BiliClient.prefs.v322volumeLevelIndicator304
    BiliClient.prefs.v322volumeLevelIndicator304 = !current
    AppToast.show(this, "Volume Level Indicator304: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV322HistorySearchEnabled304Toggle() {
    val current = BiliClient.prefs.v322historySearchEnabled304
    BiliClient.prefs.v322historySearchEnabled304 = !current
    AppToast.show(this, "History Search Enabled304: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV322PlaybackSpeedMemory304Toggle() {
    val current = BiliClient.prefs.v322playbackSpeedMemory304
    BiliClient.prefs.v322playbackSpeedMemory304 = !current
    AppToast.show(this, "Playback Speed Memory304: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV322ScreenshotFormat304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322screenshotFormat304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322screenshotFormat304 = value
        AppToast.show(this, "Screenshot Format304: $value")
    }
}

internal fun PlayerActivity.showV322VideoDeinterlace304Toggle() {
    val current = BiliClient.prefs.v322videoDeinterlace304
    BiliClient.prefs.v322videoDeinterlace304 = !current
    AppToast.show(this, "Video Deinterlace304: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV322DanmakuTopCountMax306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322danmakuTopCountMax306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322danmakuTopCountMax306 = value
        AppToast.show(this, "Danmaku Top Count Max306: $value")
    }
}

internal fun PlayerActivity.showV322SubtitleStrokeWidth306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322subtitleStrokeWidth306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322subtitleStrokeWidth306 = value
        AppToast.show(this, "Subtitle Stroke Width306: $value")
    }
}

internal fun PlayerActivity.showV323AudioDynamicRange305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323audioDynamicRange305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323audioDynamicRange305 = value
        AppToast.show(this, "Audio Dynamic Range305: $value")
    }
}

internal fun PlayerActivity.showV323DanmakuTopCountMax307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323danmakuTopCountMax307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323danmakuTopCountMax307 = value
        AppToast.show(this, "Danmaku Top Count Max307: $value")
    }
}

internal fun PlayerActivity.showV323SubtitleStrokeWidth307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323subtitleStrokeWidth307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323subtitleStrokeWidth307 = value
        AppToast.show(this, "Subtitle Stroke Width307: $value")
    }
}

internal fun PlayerActivity.showV323GestureLongPressAction305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323gestureLongPressAction305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323gestureLongPressAction305 = value
        AppToast.show(this, "Gesture Long Press Action305: $value")
    }
}

internal fun PlayerActivity.showV323CastQuality305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323castQuality305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323castQuality305 = value
        AppToast.show(this, "Cast Quality305: $value")
    }
}

internal fun PlayerActivity.showV323PlaylistRepeatMode305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323playlistRepeatMode305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323playlistRepeatMode305 = value
        AppToast.show(this, "Playlist Repeat Mode305: $value")
    }
}

internal fun PlayerActivity.showV323CacheMaxSize305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323cacheMaxSize305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323cacheMaxSize305 = value
        AppToast.show(this, "Cache Max Size305: $value")
    }
}

internal fun PlayerActivity.showV323ProgressBarHeight305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323progressBarHeight305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323progressBarHeight305 = value
        AppToast.show(this, "Progress Bar Height305: $value")
    }
}

internal fun PlayerActivity.showV323VolumeLevelIndicator305Toggle() {
    val current = BiliClient.prefs.v323volumeLevelIndicator305
    BiliClient.prefs.v323volumeLevelIndicator305 = !current
    AppToast.show(this, "Volume Level Indicator305: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV323HistorySearchEnabled305Toggle() {
    val current = BiliClient.prefs.v323historySearchEnabled305
    BiliClient.prefs.v323historySearchEnabled305 = !current
    AppToast.show(this, "History Search Enabled305: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV323PlaybackSpeedMemory305Toggle() {
    val current = BiliClient.prefs.v323playbackSpeedMemory305
    BiliClient.prefs.v323playbackSpeedMemory305 = !current
    AppToast.show(this, "Playback Speed Memory305: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV323ScreenshotFormat305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323screenshotFormat305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323screenshotFormat305 = value
        AppToast.show(this, "Screenshot Format305: $value")
    }
}

internal fun PlayerActivity.showV323VideoDeinterlace305Toggle() {
    val current = BiliClient.prefs.v323videoDeinterlace305
    BiliClient.prefs.v323videoDeinterlace305 = !current
    AppToast.show(this, "Video Deinterlace305: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV323DanmakuTopCountMax308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323danmakuTopCountMax308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323danmakuTopCountMax308 = value
        AppToast.show(this, "Danmaku Top Count Max308: $value")
    }
}

internal fun PlayerActivity.showV323SubtitleStrokeWidth308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323subtitleStrokeWidth308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323subtitleStrokeWidth308 = value
        AppToast.show(this, "Subtitle Stroke Width308: $value")
    }
}

internal fun PlayerActivity.showV324AudioDynamicRange306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324audioDynamicRange306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324audioDynamicRange306 = value
        AppToast.show(this, "Audio Dynamic Range306: $value")
    }
}

internal fun PlayerActivity.showV324DanmakuTopCountMax309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324danmakuTopCountMax309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324danmakuTopCountMax309 = value
        AppToast.show(this, "Danmaku Top Count Max309: $value")
    }
}

internal fun PlayerActivity.showV324SubtitleStrokeWidth309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324subtitleStrokeWidth309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324subtitleStrokeWidth309 = value
        AppToast.show(this, "Subtitle Stroke Width309: $value")
    }
}

internal fun PlayerActivity.showV324GestureLongPressAction306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324gestureLongPressAction306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324gestureLongPressAction306 = value
        AppToast.show(this, "Gesture Long Press Action306: $value")
    }
}

internal fun PlayerActivity.showV324CastQuality306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324castQuality306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324castQuality306 = value
        AppToast.show(this, "Cast Quality306: $value")
    }
}

internal fun PlayerActivity.showV324PlaylistRepeatMode306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324playlistRepeatMode306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324playlistRepeatMode306 = value
        AppToast.show(this, "Playlist Repeat Mode306: $value")
    }
}

internal fun PlayerActivity.showV324CacheMaxSize306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324cacheMaxSize306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324cacheMaxSize306 = value
        AppToast.show(this, "Cache Max Size306: $value")
    }
}

internal fun PlayerActivity.showV324ProgressBarHeight306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324progressBarHeight306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324progressBarHeight306 = value
        AppToast.show(this, "Progress Bar Height306: $value")
    }
}

internal fun PlayerActivity.showV324VolumeLevelIndicator306Toggle() {
    val current = BiliClient.prefs.v324volumeLevelIndicator306
    BiliClient.prefs.v324volumeLevelIndicator306 = !current
    AppToast.show(this, "Volume Level Indicator306: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV324HistorySearchEnabled306Toggle() {
    val current = BiliClient.prefs.v324historySearchEnabled306
    BiliClient.prefs.v324historySearchEnabled306 = !current
    AppToast.show(this, "History Search Enabled306: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV324PlaybackSpeedMemory306Toggle() {
    val current = BiliClient.prefs.v324playbackSpeedMemory306
    BiliClient.prefs.v324playbackSpeedMemory306 = !current
    AppToast.show(this, "Playback Speed Memory306: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV324ScreenshotFormat306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324screenshotFormat306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324screenshotFormat306 = value
        AppToast.show(this, "Screenshot Format306: $value")
    }
}

internal fun PlayerActivity.showV324VideoDeinterlace306Toggle() {
    val current = BiliClient.prefs.v324videoDeinterlace306
    BiliClient.prefs.v324videoDeinterlace306 = !current
    AppToast.show(this, "Video Deinterlace306: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV324DanmakuTopCountMax310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324danmakuTopCountMax310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324danmakuTopCountMax310 = value
        AppToast.show(this, "Danmaku Top Count Max310: $value")
    }
}

internal fun PlayerActivity.showV324SubtitleStrokeWidth310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324subtitleStrokeWidth310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324subtitleStrokeWidth310 = value
        AppToast.show(this, "Subtitle Stroke Width310: $value")
    }
}

internal fun PlayerActivity.showV325AudioDynamicRange307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325audioDynamicRange307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325audioDynamicRange307 = value
        AppToast.show(this, "Audio Dynamic Range307: $value")
    }
}

internal fun PlayerActivity.showV325DanmakuTopCountMax311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325danmakuTopCountMax311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325danmakuTopCountMax311 = value
        AppToast.show(this, "Danmaku Top Count Max311: $value")
    }
}

internal fun PlayerActivity.showV325SubtitleStrokeWidth311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325subtitleStrokeWidth311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325subtitleStrokeWidth311 = value
        AppToast.show(this, "Subtitle Stroke Width311: $value")
    }
}

internal fun PlayerActivity.showV325GestureLongPressAction307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325gestureLongPressAction307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325gestureLongPressAction307 = value
        AppToast.show(this, "Gesture Long Press Action307: $value")
    }
}

internal fun PlayerActivity.showV325CastQuality307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325castQuality307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325castQuality307 = value
        AppToast.show(this, "Cast Quality307: $value")
    }
}

internal fun PlayerActivity.showV325PlaylistRepeatMode307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325playlistRepeatMode307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325playlistRepeatMode307 = value
        AppToast.show(this, "Playlist Repeat Mode307: $value")
    }
}

internal fun PlayerActivity.showV325CacheMaxSize307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325cacheMaxSize307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325cacheMaxSize307 = value
        AppToast.show(this, "Cache Max Size307: $value")
    }
}

internal fun PlayerActivity.showV325ProgressBarHeight307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325progressBarHeight307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325progressBarHeight307 = value
        AppToast.show(this, "Progress Bar Height307: $value")
    }
}

internal fun PlayerActivity.showV325VolumeLevelIndicator307Toggle() {
    val current = BiliClient.prefs.v325volumeLevelIndicator307
    BiliClient.prefs.v325volumeLevelIndicator307 = !current
    AppToast.show(this, "Volume Level Indicator307: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV325HistorySearchEnabled307Toggle() {
    val current = BiliClient.prefs.v325historySearchEnabled307
    BiliClient.prefs.v325historySearchEnabled307 = !current
    AppToast.show(this, "History Search Enabled307: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV325PlaybackSpeedMemory307Toggle() {
    val current = BiliClient.prefs.v325playbackSpeedMemory307
    BiliClient.prefs.v325playbackSpeedMemory307 = !current
    AppToast.show(this, "Playback Speed Memory307: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV325ScreenshotFormat307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325screenshotFormat307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325screenshotFormat307 = value
        AppToast.show(this, "Screenshot Format307: $value")
    }
}

internal fun PlayerActivity.showV325VideoDeinterlace307Toggle() {
    val current = BiliClient.prefs.v325videoDeinterlace307
    BiliClient.prefs.v325videoDeinterlace307 = !current
    AppToast.show(this, "Video Deinterlace307: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV325DanmakuTopCountMax312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325danmakuTopCountMax312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325danmakuTopCountMax312 = value
        AppToast.show(this, "Danmaku Top Count Max312: $value")
    }
}

internal fun PlayerActivity.showV325SubtitleStrokeWidth312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325subtitleStrokeWidth312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325subtitleStrokeWidth312 = value
        AppToast.show(this, "Subtitle Stroke Width312: $value")
    }
}

internal fun PlayerActivity.showV326AudioDynamicRange308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326audioDynamicRange308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326audioDynamicRange308 = value
        AppToast.show(this, "Audio Dynamic Range308: $value")
    }
}

internal fun PlayerActivity.showV326DanmakuTopCountMax313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326danmakuTopCountMax313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326danmakuTopCountMax313 = value
        AppToast.show(this, "Danmaku Top Count Max313: $value")
    }
}

internal fun PlayerActivity.showV326SubtitleStrokeWidth313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326subtitleStrokeWidth313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326subtitleStrokeWidth313 = value
        AppToast.show(this, "Subtitle Stroke Width313: $value")
    }
}

internal fun PlayerActivity.showV326GestureLongPressAction308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326gestureLongPressAction308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326gestureLongPressAction308 = value
        AppToast.show(this, "Gesture Long Press Action308: $value")
    }
}

internal fun PlayerActivity.showV326CastQuality308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326castQuality308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326castQuality308 = value
        AppToast.show(this, "Cast Quality308: $value")
    }
}

internal fun PlayerActivity.showV326PlaylistRepeatMode308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326playlistRepeatMode308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326playlistRepeatMode308 = value
        AppToast.show(this, "Playlist Repeat Mode308: $value")
    }
}

internal fun PlayerActivity.showV326CacheMaxSize308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326cacheMaxSize308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326cacheMaxSize308 = value
        AppToast.show(this, "Cache Max Size308: $value")
    }
}

internal fun PlayerActivity.showV326ProgressBarHeight308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326progressBarHeight308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326progressBarHeight308 = value
        AppToast.show(this, "Progress Bar Height308: $value")
    }
}

internal fun PlayerActivity.showV326VolumeLevelIndicator308Toggle() {
    val current = BiliClient.prefs.v326volumeLevelIndicator308
    BiliClient.prefs.v326volumeLevelIndicator308 = !current
    AppToast.show(this, "Volume Level Indicator308: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV326HistorySearchEnabled308Toggle() {
    val current = BiliClient.prefs.v326historySearchEnabled308
    BiliClient.prefs.v326historySearchEnabled308 = !current
    AppToast.show(this, "History Search Enabled308: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV326PlaybackSpeedMemory308Toggle() {
    val current = BiliClient.prefs.v326playbackSpeedMemory308
    BiliClient.prefs.v326playbackSpeedMemory308 = !current
    AppToast.show(this, "Playback Speed Memory308: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV326ScreenshotFormat308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326screenshotFormat308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326screenshotFormat308 = value
        AppToast.show(this, "Screenshot Format308: $value")
    }
}

internal fun PlayerActivity.showV326VideoDeinterlace308Toggle() {
    val current = BiliClient.prefs.v326videoDeinterlace308
    BiliClient.prefs.v326videoDeinterlace308 = !current
    AppToast.show(this, "Video Deinterlace308: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV326DanmakuTopCountMax314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326danmakuTopCountMax314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326danmakuTopCountMax314 = value
        AppToast.show(this, "Danmaku Top Count Max314: $value")
    }
}

internal fun PlayerActivity.showV326SubtitleStrokeWidth314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326subtitleStrokeWidth314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326subtitleStrokeWidth314 = value
        AppToast.show(this, "Subtitle Stroke Width314: $value")
    }
}

internal fun PlayerActivity.showV327AudioDynamicRange309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327audioDynamicRange309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327audioDynamicRange309 = value
        AppToast.show(this, "Audio Dynamic Range309: $value")
    }
}

internal fun PlayerActivity.showV327DanmakuTopCountMax315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327danmakuTopCountMax315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327danmakuTopCountMax315 = value
        AppToast.show(this, "Danmaku Top Count Max315: $value")
    }
}

internal fun PlayerActivity.showV327SubtitleStrokeWidth315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327subtitleStrokeWidth315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327subtitleStrokeWidth315 = value
        AppToast.show(this, "Subtitle Stroke Width315: $value")
    }
}

internal fun PlayerActivity.showV327GestureLongPressAction309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327gestureLongPressAction309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327gestureLongPressAction309 = value
        AppToast.show(this, "Gesture Long Press Action309: $value")
    }
}

internal fun PlayerActivity.showV327CastQuality309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327castQuality309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327castQuality309 = value
        AppToast.show(this, "Cast Quality309: $value")
    }
}

internal fun PlayerActivity.showV327PlaylistRepeatMode309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327playlistRepeatMode309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327playlistRepeatMode309 = value
        AppToast.show(this, "Playlist Repeat Mode309: $value")
    }
}

internal fun PlayerActivity.showV327CacheMaxSize309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327cacheMaxSize309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327cacheMaxSize309 = value
        AppToast.show(this, "Cache Max Size309: $value")
    }
}

internal fun PlayerActivity.showV327ProgressBarHeight309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327progressBarHeight309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327progressBarHeight309 = value
        AppToast.show(this, "Progress Bar Height309: $value")
    }
}

internal fun PlayerActivity.showV327VolumeLevelIndicator309Toggle() {
    val current = BiliClient.prefs.v327volumeLevelIndicator309
    BiliClient.prefs.v327volumeLevelIndicator309 = !current
    AppToast.show(this, "Volume Level Indicator309: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV327HistorySearchEnabled309Toggle() {
    val current = BiliClient.prefs.v327historySearchEnabled309
    BiliClient.prefs.v327historySearchEnabled309 = !current
    AppToast.show(this, "History Search Enabled309: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV327PlaybackSpeedMemory309Toggle() {
    val current = BiliClient.prefs.v327playbackSpeedMemory309
    BiliClient.prefs.v327playbackSpeedMemory309 = !current
    AppToast.show(this, "Playback Speed Memory309: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV327ScreenshotFormat309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327screenshotFormat309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327screenshotFormat309 = value
        AppToast.show(this, "Screenshot Format309: $value")
    }
}

internal fun PlayerActivity.showV327VideoDeinterlace309Toggle() {
    val current = BiliClient.prefs.v327videoDeinterlace309
    BiliClient.prefs.v327videoDeinterlace309 = !current
    AppToast.show(this, "Video Deinterlace309: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV327DanmakuTopCountMax316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327danmakuTopCountMax316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327danmakuTopCountMax316 = value
        AppToast.show(this, "Danmaku Top Count Max316: $value")
    }
}

internal fun PlayerActivity.showV327SubtitleStrokeWidth316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327subtitleStrokeWidth316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327subtitleStrokeWidth316 = value
        AppToast.show(this, "Subtitle Stroke Width316: $value")
    }
}

internal fun PlayerActivity.showV328AudioDynamicRange310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328audioDynamicRange310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328audioDynamicRange310 = value
        AppToast.show(this, "Audio Dynamic Range310: $value")
    }
}

internal fun PlayerActivity.showV328DanmakuTopCountMax317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328danmakuTopCountMax317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328danmakuTopCountMax317 = value
        AppToast.show(this, "Danmaku Top Count Max317: $value")
    }
}

internal fun PlayerActivity.showV328SubtitleStrokeWidth317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328subtitleStrokeWidth317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328subtitleStrokeWidth317 = value
        AppToast.show(this, "Subtitle Stroke Width317: $value")
    }
}

internal fun PlayerActivity.showV328GestureLongPressAction310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328gestureLongPressAction310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328gestureLongPressAction310 = value
        AppToast.show(this, "Gesture Long Press Action310: $value")
    }
}

internal fun PlayerActivity.showV328CastQuality310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328castQuality310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328castQuality310 = value
        AppToast.show(this, "Cast Quality310: $value")
    }
}

internal fun PlayerActivity.showV328PlaylistRepeatMode310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328playlistRepeatMode310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328playlistRepeatMode310 = value
        AppToast.show(this, "Playlist Repeat Mode310: $value")
    }
}

internal fun PlayerActivity.showV328CacheMaxSize310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328cacheMaxSize310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328cacheMaxSize310 = value
        AppToast.show(this, "Cache Max Size310: $value")
    }
}

internal fun PlayerActivity.showV328ProgressBarHeight310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328progressBarHeight310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328progressBarHeight310 = value
        AppToast.show(this, "Progress Bar Height310: $value")
    }
}

internal fun PlayerActivity.showV328VolumeLevelIndicator310Toggle() {
    val current = BiliClient.prefs.v328volumeLevelIndicator310
    BiliClient.prefs.v328volumeLevelIndicator310 = !current
    AppToast.show(this, "Volume Level Indicator310: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV328HistorySearchEnabled310Toggle() {
    val current = BiliClient.prefs.v328historySearchEnabled310
    BiliClient.prefs.v328historySearchEnabled310 = !current
    AppToast.show(this, "History Search Enabled310: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV328PlaybackSpeedMemory310Toggle() {
    val current = BiliClient.prefs.v328playbackSpeedMemory310
    BiliClient.prefs.v328playbackSpeedMemory310 = !current
    AppToast.show(this, "Playback Speed Memory310: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV328ScreenshotFormat310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328screenshotFormat310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328screenshotFormat310 = value
        AppToast.show(this, "Screenshot Format310: $value")
    }
}

internal fun PlayerActivity.showV328VideoDeinterlace310Toggle() {
    val current = BiliClient.prefs.v328videoDeinterlace310
    BiliClient.prefs.v328videoDeinterlace310 = !current
    AppToast.show(this, "Video Deinterlace310: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV328DanmakuTopCountMax318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328danmakuTopCountMax318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328danmakuTopCountMax318 = value
        AppToast.show(this, "Danmaku Top Count Max318: $value")
    }
}

internal fun PlayerActivity.showV328SubtitleStrokeWidth318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328subtitleStrokeWidth318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328subtitleStrokeWidth318 = value
        AppToast.show(this, "Subtitle Stroke Width318: $value")
    }
}

internal fun PlayerActivity.showV329AudioDynamicRange311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329audioDynamicRange311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329audioDynamicRange311 = value
        AppToast.show(this, "Audio Dynamic Range311: $value")
    }
}

internal fun PlayerActivity.showV329DanmakuTopCountMax319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329danmakuTopCountMax319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329danmakuTopCountMax319 = value
        AppToast.show(this, "Danmaku Top Count Max319: $value")
    }
}

internal fun PlayerActivity.showV329SubtitleStrokeWidth319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329subtitleStrokeWidth319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329subtitleStrokeWidth319 = value
        AppToast.show(this, "Subtitle Stroke Width319: $value")
    }
}

internal fun PlayerActivity.showV329GestureLongPressAction311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329gestureLongPressAction311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329gestureLongPressAction311 = value
        AppToast.show(this, "Gesture Long Press Action311: $value")
    }
}

internal fun PlayerActivity.showV329CastQuality311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329castQuality311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329castQuality311 = value
        AppToast.show(this, "Cast Quality311: $value")
    }
}

internal fun PlayerActivity.showV329PlaylistRepeatMode311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329playlistRepeatMode311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329playlistRepeatMode311 = value
        AppToast.show(this, "Playlist Repeat Mode311: $value")
    }
}

internal fun PlayerActivity.showV329CacheMaxSize311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329cacheMaxSize311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329cacheMaxSize311 = value
        AppToast.show(this, "Cache Max Size311: $value")
    }
}

internal fun PlayerActivity.showV329ProgressBarHeight311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329progressBarHeight311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329progressBarHeight311 = value
        AppToast.show(this, "Progress Bar Height311: $value")
    }
}

internal fun PlayerActivity.showV329VolumeLevelIndicator311Toggle() {
    val current = BiliClient.prefs.v329volumeLevelIndicator311
    BiliClient.prefs.v329volumeLevelIndicator311 = !current
    AppToast.show(this, "Volume Level Indicator311: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV329HistorySearchEnabled311Toggle() {
    val current = BiliClient.prefs.v329historySearchEnabled311
    BiliClient.prefs.v329historySearchEnabled311 = !current
    AppToast.show(this, "History Search Enabled311: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV329PlaybackSpeedMemory311Toggle() {
    val current = BiliClient.prefs.v329playbackSpeedMemory311
    BiliClient.prefs.v329playbackSpeedMemory311 = !current
    AppToast.show(this, "Playback Speed Memory311: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV329ScreenshotFormat311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329screenshotFormat311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329screenshotFormat311 = value
        AppToast.show(this, "Screenshot Format311: $value")
    }
}

internal fun PlayerActivity.showV329VideoDeinterlace311Toggle() {
    val current = BiliClient.prefs.v329videoDeinterlace311
    BiliClient.prefs.v329videoDeinterlace311 = !current
    AppToast.show(this, "Video Deinterlace311: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV329DanmakuTopCountMax320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329danmakuTopCountMax320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329danmakuTopCountMax320 = value
        AppToast.show(this, "Danmaku Top Count Max320: $value")
    }
}

internal fun PlayerActivity.showV329SubtitleStrokeWidth320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329subtitleStrokeWidth320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329subtitleStrokeWidth320 = value
        AppToast.show(this, "Subtitle Stroke Width320: $value")
    }
}

internal fun PlayerActivity.showV330AudioDynamicRange312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330audioDynamicRange312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330audioDynamicRange312 = value
        AppToast.show(this, "Audio Dynamic Range312: $value")
    }
}

internal fun PlayerActivity.showV330DanmakuTopCountMax321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330danmakuTopCountMax321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330danmakuTopCountMax321 = value
        AppToast.show(this, "Danmaku Top Count Max321: $value")
    }
}

internal fun PlayerActivity.showV330SubtitleStrokeWidth321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330subtitleStrokeWidth321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330subtitleStrokeWidth321 = value
        AppToast.show(this, "Subtitle Stroke Width321: $value")
    }
}

internal fun PlayerActivity.showV330GestureLongPressAction312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330gestureLongPressAction312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330gestureLongPressAction312 = value
        AppToast.show(this, "Gesture Long Press Action312: $value")
    }
}

internal fun PlayerActivity.showV330CastQuality312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330castQuality312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330castQuality312 = value
        AppToast.show(this, "Cast Quality312: $value")
    }
}

internal fun PlayerActivity.showV330PlaylistRepeatMode312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330playlistRepeatMode312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330playlistRepeatMode312 = value
        AppToast.show(this, "Playlist Repeat Mode312: $value")
    }
}

internal fun PlayerActivity.showV330CacheMaxSize312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330cacheMaxSize312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330cacheMaxSize312 = value
        AppToast.show(this, "Cache Max Size312: $value")
    }
}

internal fun PlayerActivity.showV330ProgressBarHeight312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330progressBarHeight312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330progressBarHeight312 = value
        AppToast.show(this, "Progress Bar Height312: $value")
    }
}

internal fun PlayerActivity.showV330VolumeLevelIndicator312Toggle() {
    val current = BiliClient.prefs.v330volumeLevelIndicator312
    BiliClient.prefs.v330volumeLevelIndicator312 = !current
    AppToast.show(this, "Volume Level Indicator312: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV330HistorySearchEnabled312Toggle() {
    val current = BiliClient.prefs.v330historySearchEnabled312
    BiliClient.prefs.v330historySearchEnabled312 = !current
    AppToast.show(this, "History Search Enabled312: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV330PlaybackSpeedMemory312Toggle() {
    val current = BiliClient.prefs.v330playbackSpeedMemory312
    BiliClient.prefs.v330playbackSpeedMemory312 = !current
    AppToast.show(this, "Playback Speed Memory312: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV330ScreenshotFormat312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330screenshotFormat312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330screenshotFormat312 = value
        AppToast.show(this, "Screenshot Format312: $value")
    }
}

internal fun PlayerActivity.showV330VideoDeinterlace312Toggle() {
    val current = BiliClient.prefs.v330videoDeinterlace312
    BiliClient.prefs.v330videoDeinterlace312 = !current
    AppToast.show(this, "Video Deinterlace312: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV330DanmakuTopCountMax322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330danmakuTopCountMax322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330danmakuTopCountMax322 = value
        AppToast.show(this, "Danmaku Top Count Max322: $value")
    }
}

internal fun PlayerActivity.showV330SubtitleStrokeWidth322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330subtitleStrokeWidth322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330subtitleStrokeWidth322 = value
        AppToast.show(this, "Subtitle Stroke Width322: $value")
    }
}

internal fun PlayerActivity.showV331AudioStereoWidth313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331audioStereoWidth313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331audioStereoWidth313 = value
        AppToast.show(this, "Audio Stereo Width313: $value")
    }
}

internal fun PlayerActivity.showV331DanmakuScrollSpeed313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331danmakuScrollSpeed313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331danmakuScrollSpeed313 = value
        AppToast.show(this, "Danmaku Scroll Speed313: $value")
    }
}

internal fun PlayerActivity.showV331SubtitleDelaySync313Toggle() {
    val current = BiliClient.prefs.v331subtitleDelaySync313
    BiliClient.prefs.v331subtitleDelaySync313 = !current
    AppToast.show(this, "Subtitle Delay Sync313: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV331GestureSwipeUpAction313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331gestureSwipeUpAction313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331gestureSwipeUpAction313 = value
        AppToast.show(this, "Gesture Swipe Up Action313: $value")
    }
}

internal fun PlayerActivity.showV331CastSubtitles313Toggle() {
    val current = BiliClient.prefs.v331castSubtitles313
    BiliClient.prefs.v331castSubtitles313 = !current
    AppToast.show(this, "Cast Subtitles313: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV331PlaylistShuffleMode313Toggle() {
    val current = BiliClient.prefs.v331playlistShuffleMode313
    BiliClient.prefs.v331playlistShuffleMode313 = !current
    AppToast.show(this, "Playlist Shuffle Mode313: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV331CacheCleanupInterval313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331cacheCleanupInterval313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331cacheCleanupInterval313 = value
        AppToast.show(this, "Cache Cleanup Interval313: $value")
    }
}

internal fun PlayerActivity.showV331ProgressBarBufferedColor313Toggle() {
    val current = BiliClient.prefs.v331progressBarBufferedColor313
    BiliClient.prefs.v331progressBarBufferedColor313 = !current
    AppToast.show(this, "Progress Bar Buffered Color313: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV331VolumeStepSize313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331volumeStepSize313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331volumeStepSize313 = value
        AppToast.show(this, "Volume Step Size313: $value")
    }
}

internal fun PlayerActivity.showV331HistoryGroupByDate313Toggle() {
    val current = BiliClient.prefs.v331historyGroupByDate313
    BiliClient.prefs.v331historyGroupByDate313 = !current
    AppToast.show(this, "History Group By Date313: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV331PlaybackAutoResume313Toggle() {
    val current = BiliClient.prefs.v331playbackAutoResume313
    BiliClient.prefs.v331playbackAutoResume313 = !current
    AppToast.show(this, "Playback Auto Resume313: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV331ScreenshotNotification313Toggle() {
    val current = BiliClient.prefs.v331screenshotNotification313
    BiliClient.prefs.v331screenshotNotification313 = !current
    AppToast.show(this, "Screenshot Notification313: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV331VideoCropRatio313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331videoCropRatio313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331videoCropRatio313 = value
        AppToast.show(this, "Video Crop Ratio313: $value")
    }
}

internal fun PlayerActivity.showV331DanmakuScrollSpeed314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331danmakuScrollSpeed314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331danmakuScrollSpeed314 = value
        AppToast.show(this, "Danmaku Scroll Speed314: $value")
    }
}

internal fun PlayerActivity.showV331SubtitleDelaySync314Toggle() {
    val current = BiliClient.prefs.v331subtitleDelaySync314
    BiliClient.prefs.v331subtitleDelaySync314 = !current
    AppToast.show(this, "Subtitle Delay Sync314: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV332AudioStereoWidth314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332audioStereoWidth314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332audioStereoWidth314 = value
        AppToast.show(this, "Audio Stereo Width314: $value")
    }
}

internal fun PlayerActivity.showV332DanmakuScrollSpeed315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332danmakuScrollSpeed315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332danmakuScrollSpeed315 = value
        AppToast.show(this, "Danmaku Scroll Speed315: $value")
    }
}

internal fun PlayerActivity.showV332SubtitleDelaySync315Toggle() {
    val current = BiliClient.prefs.v332subtitleDelaySync315
    BiliClient.prefs.v332subtitleDelaySync315 = !current
    AppToast.show(this, "Subtitle Delay Sync315: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV332GestureSwipeUpAction314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332gestureSwipeUpAction314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332gestureSwipeUpAction314 = value
        AppToast.show(this, "Gesture Swipe Up Action314: $value")
    }
}

internal fun PlayerActivity.showV332CastSubtitles314Toggle() {
    val current = BiliClient.prefs.v332castSubtitles314
    BiliClient.prefs.v332castSubtitles314 = !current
    AppToast.show(this, "Cast Subtitles314: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV332PlaylistShuffleMode314Toggle() {
    val current = BiliClient.prefs.v332playlistShuffleMode314
    BiliClient.prefs.v332playlistShuffleMode314 = !current
    AppToast.show(this, "Playlist Shuffle Mode314: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV332CacheCleanupInterval314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332cacheCleanupInterval314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332cacheCleanupInterval314 = value
        AppToast.show(this, "Cache Cleanup Interval314: $value")
    }
}

internal fun PlayerActivity.showV332ProgressBarBufferedColor314Toggle() {
    val current = BiliClient.prefs.v332progressBarBufferedColor314
    BiliClient.prefs.v332progressBarBufferedColor314 = !current
    AppToast.show(this, "Progress Bar Buffered Color314: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV332VolumeStepSize314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332volumeStepSize314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332volumeStepSize314 = value
        AppToast.show(this, "Volume Step Size314: $value")
    }
}

internal fun PlayerActivity.showV332HistoryGroupByDate314Toggle() {
    val current = BiliClient.prefs.v332historyGroupByDate314
    BiliClient.prefs.v332historyGroupByDate314 = !current
    AppToast.show(this, "History Group By Date314: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV332PlaybackAutoResume314Toggle() {
    val current = BiliClient.prefs.v332playbackAutoResume314
    BiliClient.prefs.v332playbackAutoResume314 = !current
    AppToast.show(this, "Playback Auto Resume314: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV332ScreenshotNotification314Toggle() {
    val current = BiliClient.prefs.v332screenshotNotification314
    BiliClient.prefs.v332screenshotNotification314 = !current
    AppToast.show(this, "Screenshot Notification314: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV332VideoCropRatio314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332videoCropRatio314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332videoCropRatio314 = value
        AppToast.show(this, "Video Crop Ratio314: $value")
    }
}

internal fun PlayerActivity.showV332DanmakuScrollSpeed316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332danmakuScrollSpeed316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332danmakuScrollSpeed316 = value
        AppToast.show(this, "Danmaku Scroll Speed316: $value")
    }
}

internal fun PlayerActivity.showV332SubtitleDelaySync316Toggle() {
    val current = BiliClient.prefs.v332subtitleDelaySync316
    BiliClient.prefs.v332subtitleDelaySync316 = !current
    AppToast.show(this, "Subtitle Delay Sync316: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV333AudioStereoWidth315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333audioStereoWidth315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333audioStereoWidth315 = value
        AppToast.show(this, "Audio Stereo Width315: $value")
    }
}

internal fun PlayerActivity.showV333DanmakuScrollSpeed317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333danmakuScrollSpeed317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333danmakuScrollSpeed317 = value
        AppToast.show(this, "Danmaku Scroll Speed317: $value")
    }
}

internal fun PlayerActivity.showV333SubtitleDelaySync317Toggle() {
    val current = BiliClient.prefs.v333subtitleDelaySync317
    BiliClient.prefs.v333subtitleDelaySync317 = !current
    AppToast.show(this, "Subtitle Delay Sync317: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV333GestureSwipeUpAction315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333gestureSwipeUpAction315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333gestureSwipeUpAction315 = value
        AppToast.show(this, "Gesture Swipe Up Action315: $value")
    }
}

internal fun PlayerActivity.showV333CastSubtitles315Toggle() {
    val current = BiliClient.prefs.v333castSubtitles315
    BiliClient.prefs.v333castSubtitles315 = !current
    AppToast.show(this, "Cast Subtitles315: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV333PlaylistShuffleMode315Toggle() {
    val current = BiliClient.prefs.v333playlistShuffleMode315
    BiliClient.prefs.v333playlistShuffleMode315 = !current
    AppToast.show(this, "Playlist Shuffle Mode315: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV333CacheCleanupInterval315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333cacheCleanupInterval315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333cacheCleanupInterval315 = value
        AppToast.show(this, "Cache Cleanup Interval315: $value")
    }
}

internal fun PlayerActivity.showV333ProgressBarBufferedColor315Toggle() {
    val current = BiliClient.prefs.v333progressBarBufferedColor315
    BiliClient.prefs.v333progressBarBufferedColor315 = !current
    AppToast.show(this, "Progress Bar Buffered Color315: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV333VolumeStepSize315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333volumeStepSize315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333volumeStepSize315 = value
        AppToast.show(this, "Volume Step Size315: $value")
    }
}

internal fun PlayerActivity.showV333HistoryGroupByDate315Toggle() {
    val current = BiliClient.prefs.v333historyGroupByDate315
    BiliClient.prefs.v333historyGroupByDate315 = !current
    AppToast.show(this, "History Group By Date315: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV333PlaybackAutoResume315Toggle() {
    val current = BiliClient.prefs.v333playbackAutoResume315
    BiliClient.prefs.v333playbackAutoResume315 = !current
    AppToast.show(this, "Playback Auto Resume315: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV333ScreenshotNotification315Toggle() {
    val current = BiliClient.prefs.v333screenshotNotification315
    BiliClient.prefs.v333screenshotNotification315 = !current
    AppToast.show(this, "Screenshot Notification315: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV333VideoCropRatio315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333videoCropRatio315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333videoCropRatio315 = value
        AppToast.show(this, "Video Crop Ratio315: $value")
    }
}

internal fun PlayerActivity.showV333DanmakuScrollSpeed318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333danmakuScrollSpeed318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333danmakuScrollSpeed318 = value
        AppToast.show(this, "Danmaku Scroll Speed318: $value")
    }
}

internal fun PlayerActivity.showV333SubtitleDelaySync318Toggle() {
    val current = BiliClient.prefs.v333subtitleDelaySync318
    BiliClient.prefs.v333subtitleDelaySync318 = !current
    AppToast.show(this, "Subtitle Delay Sync318: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV334AudioStereoWidth316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334audioStereoWidth316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334audioStereoWidth316 = value
        AppToast.show(this, "Audio Stereo Width316: $value")
    }
}

internal fun PlayerActivity.showV334DanmakuScrollSpeed319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334danmakuScrollSpeed319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334danmakuScrollSpeed319 = value
        AppToast.show(this, "Danmaku Scroll Speed319: $value")
    }
}

internal fun PlayerActivity.showV334SubtitleDelaySync319Toggle() {
    val current = BiliClient.prefs.v334subtitleDelaySync319
    BiliClient.prefs.v334subtitleDelaySync319 = !current
    AppToast.show(this, "Subtitle Delay Sync319: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV334GestureSwipeUpAction316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334gestureSwipeUpAction316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334gestureSwipeUpAction316 = value
        AppToast.show(this, "Gesture Swipe Up Action316: $value")
    }
}

internal fun PlayerActivity.showV334CastSubtitles316Toggle() {
    val current = BiliClient.prefs.v334castSubtitles316
    BiliClient.prefs.v334castSubtitles316 = !current
    AppToast.show(this, "Cast Subtitles316: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV334PlaylistShuffleMode316Toggle() {
    val current = BiliClient.prefs.v334playlistShuffleMode316
    BiliClient.prefs.v334playlistShuffleMode316 = !current
    AppToast.show(this, "Playlist Shuffle Mode316: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV334CacheCleanupInterval316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334cacheCleanupInterval316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334cacheCleanupInterval316 = value
        AppToast.show(this, "Cache Cleanup Interval316: $value")
    }
}

internal fun PlayerActivity.showV334ProgressBarBufferedColor316Toggle() {
    val current = BiliClient.prefs.v334progressBarBufferedColor316
    BiliClient.prefs.v334progressBarBufferedColor316 = !current
    AppToast.show(this, "Progress Bar Buffered Color316: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV334VolumeStepSize316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334volumeStepSize316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334volumeStepSize316 = value
        AppToast.show(this, "Volume Step Size316: $value")
    }
}

internal fun PlayerActivity.showV334HistoryGroupByDate316Toggle() {
    val current = BiliClient.prefs.v334historyGroupByDate316
    BiliClient.prefs.v334historyGroupByDate316 = !current
    AppToast.show(this, "History Group By Date316: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV334PlaybackAutoResume316Toggle() {
    val current = BiliClient.prefs.v334playbackAutoResume316
    BiliClient.prefs.v334playbackAutoResume316 = !current
    AppToast.show(this, "Playback Auto Resume316: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV334ScreenshotNotification316Toggle() {
    val current = BiliClient.prefs.v334screenshotNotification316
    BiliClient.prefs.v334screenshotNotification316 = !current
    AppToast.show(this, "Screenshot Notification316: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV334VideoCropRatio316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334videoCropRatio316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334videoCropRatio316 = value
        AppToast.show(this, "Video Crop Ratio316: $value")
    }
}

internal fun PlayerActivity.showV334DanmakuScrollSpeed320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334danmakuScrollSpeed320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334danmakuScrollSpeed320 = value
        AppToast.show(this, "Danmaku Scroll Speed320: $value")
    }
}

internal fun PlayerActivity.showV334SubtitleDelaySync320Toggle() {
    val current = BiliClient.prefs.v334subtitleDelaySync320
    BiliClient.prefs.v334subtitleDelaySync320 = !current
    AppToast.show(this, "Subtitle Delay Sync320: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV335AudioStereoWidth317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335audioStereoWidth317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335audioStereoWidth317 = value
        AppToast.show(this, "Audio Stereo Width317: $value")
    }
}

