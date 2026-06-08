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

internal fun PlayerActivity.showV348CachePreloadOnWifi340Toggle() {
    val current = BiliClient.prefs.v348cachePreloadOnWifi340
    BiliClient.prefs.v348cachePreloadOnWifi340 = !current
    AppToast.show(this, "Cache Preload On Wifi340: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV348ProgressBarShowChapter340Toggle() {
    val current = BiliClient.prefs.v348progressBarShowChapter340
    BiliClient.prefs.v348progressBarShowChapter340 = !current
    AppToast.show(this, "Progress Bar Show Chapter340: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV348VolumeBalanceLR340Toggle() {
    val current = BiliClient.prefs.v348volumeBalanceLR340
    BiliClient.prefs.v348volumeBalanceLR340 = !current
    AppToast.show(this, "Volume Balance LR340: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV348HistoryMaxItems340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348historyMaxItems340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348historyMaxItems340 = value
        AppToast.show(this, "History Max Items340: $value")
    }
}

internal fun PlayerActivity.showV348PlaybackABRepeat340Toggle() {
    val current = BiliClient.prefs.v348playbackABRepeat340
    BiliClient.prefs.v348playbackABRepeat340 = !current
    AppToast.show(this, "Playback AB Repeat340: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV348ScreenshotShareTarget340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348screenshotShareTarget340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348screenshotShareTarget340 = value
        AppToast.show(this, "Screenshot Share Target340: $value")
    }
}

internal fun PlayerActivity.showV348VideoRotateAngle340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348videoRotateAngle340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348videoRotateAngle340 = value
        AppToast.show(this, "Video Rotate Angle340: $value")
    }
}

internal fun PlayerActivity.showV348DanmakuMergeThreshold348Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348danmakuMergeThreshold348).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold348",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348danmakuMergeThreshold348 = value
        AppToast.show(this, "Danmaku Merge Threshold348: $value")
    }
}

internal fun PlayerActivity.showV348SubtitleFontSize348Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348subtitleFontSize348).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size348",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348subtitleFontSize348 = value
        AppToast.show(this, "Subtitle Font Size348: $value")
    }
}

internal fun PlayerActivity.showV349AudioBassExtract331Toggle() {
    val current = BiliClient.prefs.v349audioBassExtract331
    BiliClient.prefs.v349audioBassExtract331 = !current
    AppToast.show(this, "Audio Bass Extract331: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV349DanmakuMergeThreshold349Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349danmakuMergeThreshold349).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold349",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349danmakuMergeThreshold349 = value
        AppToast.show(this, "Danmaku Merge Threshold349: $value")
    }
}

internal fun PlayerActivity.showV349SubtitleFontSize349Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349subtitleFontSize349).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size349",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349subtitleFontSize349 = value
        AppToast.show(this, "Subtitle Font Size349: $value")
    }
}

internal fun PlayerActivity.showV349GestureDoubleTapRewind341Toggle() {
    val current = BiliClient.prefs.v349gestureDoubleTapRewind341
    BiliClient.prefs.v349gestureDoubleTapRewind341 = !current
    AppToast.show(this, "Gesture Double Tap Rewind341: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV349CastAudioDelay341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349castAudioDelay341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349castAudioDelay341 = value
        AppToast.show(this, "Cast Audio Delay341: $value")
    }
}

internal fun PlayerActivity.showV349PlaylistAutoMarkWatched341Toggle() {
    val current = BiliClient.prefs.v349playlistAutoMarkWatched341
    BiliClient.prefs.v349playlistAutoMarkWatched341 = !current
    AppToast.show(this, "Playlist Auto Mark Watched341: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV349CachePreloadOnWifi341Toggle() {
    val current = BiliClient.prefs.v349cachePreloadOnWifi341
    BiliClient.prefs.v349cachePreloadOnWifi341 = !current
    AppToast.show(this, "Cache Preload On Wifi341: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV349ProgressBarShowChapter341Toggle() {
    val current = BiliClient.prefs.v349progressBarShowChapter341
    BiliClient.prefs.v349progressBarShowChapter341 = !current
    AppToast.show(this, "Progress Bar Show Chapter341: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV349VolumeBalanceLR341Toggle() {
    val current = BiliClient.prefs.v349volumeBalanceLR341
    BiliClient.prefs.v349volumeBalanceLR341 = !current
    AppToast.show(this, "Volume Balance LR341: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV349HistoryMaxItems341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349historyMaxItems341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349historyMaxItems341 = value
        AppToast.show(this, "History Max Items341: $value")
    }
}

internal fun PlayerActivity.showV349PlaybackABRepeat341Toggle() {
    val current = BiliClient.prefs.v349playbackABRepeat341
    BiliClient.prefs.v349playbackABRepeat341 = !current
    AppToast.show(this, "Playback AB Repeat341: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV349ScreenshotShareTarget341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349screenshotShareTarget341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349screenshotShareTarget341 = value
        AppToast.show(this, "Screenshot Share Target341: $value")
    }
}

internal fun PlayerActivity.showV349VideoRotateAngle341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349videoRotateAngle341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349videoRotateAngle341 = value
        AppToast.show(this, "Video Rotate Angle341: $value")
    }
}

internal fun PlayerActivity.showV349DanmakuMergeThreshold350Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349danmakuMergeThreshold350).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold350",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349danmakuMergeThreshold350 = value
        AppToast.show(this, "Danmaku Merge Threshold350: $value")
    }
}

internal fun PlayerActivity.showV349SubtitleFontSize350Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349subtitleFontSize350).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size350",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349subtitleFontSize350 = value
        AppToast.show(this, "Subtitle Font Size350: $value")
    }
}

internal fun PlayerActivity.showV350AudioBassExtract332Toggle() {
    val current = BiliClient.prefs.v350audioBassExtract332
    BiliClient.prefs.v350audioBassExtract332 = !current
    AppToast.show(this, "Audio Bass Extract332: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV350DanmakuMergeThreshold351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350danmakuMergeThreshold351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350danmakuMergeThreshold351 = value
        AppToast.show(this, "Danmaku Merge Threshold351: $value")
    }
}

internal fun PlayerActivity.showV350SubtitleFontSize351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350subtitleFontSize351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350subtitleFontSize351 = value
        AppToast.show(this, "Subtitle Font Size351: $value")
    }
}

internal fun PlayerActivity.showV350GestureDoubleTapRewind342Toggle() {
    val current = BiliClient.prefs.v350gestureDoubleTapRewind342
    BiliClient.prefs.v350gestureDoubleTapRewind342 = !current
    AppToast.show(this, "Gesture Double Tap Rewind342: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV350CastAudioDelay342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350castAudioDelay342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350castAudioDelay342 = value
        AppToast.show(this, "Cast Audio Delay342: $value")
    }
}

internal fun PlayerActivity.showV350PlaylistAutoMarkWatched342Toggle() {
    val current = BiliClient.prefs.v350playlistAutoMarkWatched342
    BiliClient.prefs.v350playlistAutoMarkWatched342 = !current
    AppToast.show(this, "Playlist Auto Mark Watched342: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV350CachePreloadOnWifi342Toggle() {
    val current = BiliClient.prefs.v350cachePreloadOnWifi342
    BiliClient.prefs.v350cachePreloadOnWifi342 = !current
    AppToast.show(this, "Cache Preload On Wifi342: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV350ProgressBarShowChapter342Toggle() {
    val current = BiliClient.prefs.v350progressBarShowChapter342
    BiliClient.prefs.v350progressBarShowChapter342 = !current
    AppToast.show(this, "Progress Bar Show Chapter342: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV350VolumeBalanceLR342Toggle() {
    val current = BiliClient.prefs.v350volumeBalanceLR342
    BiliClient.prefs.v350volumeBalanceLR342 = !current
    AppToast.show(this, "Volume Balance LR342: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV350HistoryMaxItems342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350historyMaxItems342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350historyMaxItems342 = value
        AppToast.show(this, "History Max Items342: $value")
    }
}

internal fun PlayerActivity.showV350PlaybackABRepeat342Toggle() {
    val current = BiliClient.prefs.v350playbackABRepeat342
    BiliClient.prefs.v350playbackABRepeat342 = !current
    AppToast.show(this, "Playback AB Repeat342: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV350ScreenshotShareTarget342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350screenshotShareTarget342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350screenshotShareTarget342 = value
        AppToast.show(this, "Screenshot Share Target342: $value")
    }
}

internal fun PlayerActivity.showV350VideoRotateAngle342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350videoRotateAngle342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350videoRotateAngle342 = value
        AppToast.show(this, "Video Rotate Angle342: $value")
    }
}

internal fun PlayerActivity.showV350DanmakuMergeThreshold352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350danmakuMergeThreshold352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350danmakuMergeThreshold352 = value
        AppToast.show(this, "Danmaku Merge Threshold352: $value")
    }
}

internal fun PlayerActivity.showV350SubtitleFontSize352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350subtitleFontSize352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350subtitleFontSize352 = value
        AppToast.show(this, "Subtitle Font Size352: $value")
    }
}

internal fun PlayerActivity.showV351NetworkQualityIndicator351Toggle() {
    val current = BiliClient.prefs.v351networkQualityIndicator351
    BiliClient.prefs.v351networkQualityIndicator351 = !current
    AppToast.show(this, "Network Quality Indicator351: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV351NetworkAutoSwitch351Toggle() {
    val current = BiliClient.prefs.v351networkAutoSwitch351
    BiliClient.prefs.v351networkAutoSwitch351 = !current
    AppToast.show(this, "Network Auto Switch351: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV351NetworkBandwidthLimit351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkBandwidthLimit351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkBandwidthLimit351 = value
        AppToast.show(this, "Network Bandwidth Limit351: $value")
    }
}

internal fun PlayerActivity.showV351NetworkLatencyDisplay351Toggle() {
    val current = BiliClient.prefs.v351networkLatencyDisplay351
    BiliClient.prefs.v351networkLatencyDisplay351 = !current
    AppToast.show(this, "Network Latency Display351: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV351NetworkPacketLossAlert351Toggle() {
    val current = BiliClient.prefs.v351networkPacketLossAlert351
    BiliClient.prefs.v351networkPacketLossAlert351 = !current
    AppToast.show(this, "Network Packet Loss Alert351: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV351NetworkRetryStrategy351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkRetryStrategy351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkRetryStrategy351 = value
        AppToast.show(this, "Network Retry Strategy351: $value")
    }
}

internal fun PlayerActivity.showV351NetworkTimeoutCustom351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkTimeoutCustom351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkTimeoutCustom351 = value
        AppToast.show(this, "Network Timeout Custom351: $value")
    }
}

internal fun PlayerActivity.showV351NetworkDNS优选351Toggle() {
    val current = BiliClient.prefs.v351networkDNS优选351
    BiliClient.prefs.v351networkDNS优选351 = !current
    AppToast.show(this, "Network DNS优选351: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV351NetworkIPv6优先351Toggle() {
    val current = BiliClient.prefs.v351networkIPv6优先351
    BiliClient.prefs.v351networkIPv6优先351 = !current
    AppToast.show(this, "Network IPv6优先351: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV351NetworkProxyCustom351Toggle() {
    val current = BiliClient.prefs.v351networkProxyCustom351
    BiliClient.prefs.v351networkProxyCustom351 = !current
    AppToast.show(this, "Network Proxy Custom351: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV351NetworkCacheStrategy351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkCacheStrategy351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkCacheStrategy351 = value
        AppToast.show(this, "Network Cache Strategy351: $value")
    }
}

internal fun PlayerActivity.showV351NetworkConnectionPool351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkConnectionPool351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkConnectionPool351 = value
        AppToast.show(this, "Network Connection Pool351: $value")
    }
}

internal fun PlayerActivity.showV351NetworkKeepAlive351Toggle() {
    val current = BiliClient.prefs.v351networkKeepAlive351
    BiliClient.prefs.v351networkKeepAlive351 = !current
    AppToast.show(this, "Network Keep Alive351: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV351NetworkCompression351Toggle() {
    val current = BiliClient.prefs.v351networkCompression351
    BiliClient.prefs.v351networkCompression351 = !current
    AppToast.show(this, "Network Compression351: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV351NetworkEncryption351Toggle() {
    val current = BiliClient.prefs.v351networkEncryption351
    BiliClient.prefs.v351networkEncryption351 = !current
    AppToast.show(this, "Network Encryption351: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV352NetworkQualityIndicator352Toggle() {
    val current = BiliClient.prefs.v352networkQualityIndicator352
    BiliClient.prefs.v352networkQualityIndicator352 = !current
    AppToast.show(this, "Network Quality Indicator352: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV352NetworkAutoSwitch352Toggle() {
    val current = BiliClient.prefs.v352networkAutoSwitch352
    BiliClient.prefs.v352networkAutoSwitch352 = !current
    AppToast.show(this, "Network Auto Switch352: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV352NetworkBandwidthLimit352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkBandwidthLimit352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkBandwidthLimit352 = value
        AppToast.show(this, "Network Bandwidth Limit352: $value")
    }
}

internal fun PlayerActivity.showV352NetworkLatencyDisplay352Toggle() {
    val current = BiliClient.prefs.v352networkLatencyDisplay352
    BiliClient.prefs.v352networkLatencyDisplay352 = !current
    AppToast.show(this, "Network Latency Display352: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV352NetworkPacketLossAlert352Toggle() {
    val current = BiliClient.prefs.v352networkPacketLossAlert352
    BiliClient.prefs.v352networkPacketLossAlert352 = !current
    AppToast.show(this, "Network Packet Loss Alert352: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV352NetworkRetryStrategy352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkRetryStrategy352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkRetryStrategy352 = value
        AppToast.show(this, "Network Retry Strategy352: $value")
    }
}

internal fun PlayerActivity.showV352NetworkTimeoutCustom352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkTimeoutCustom352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkTimeoutCustom352 = value
        AppToast.show(this, "Network Timeout Custom352: $value")
    }
}

internal fun PlayerActivity.showV352NetworkDNS优选352Toggle() {
    val current = BiliClient.prefs.v352networkDNS优选352
    BiliClient.prefs.v352networkDNS优选352 = !current
    AppToast.show(this, "Network DNS优选352: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV352NetworkIPv6优先352Toggle() {
    val current = BiliClient.prefs.v352networkIPv6优先352
    BiliClient.prefs.v352networkIPv6优先352 = !current
    AppToast.show(this, "Network IPv6优先352: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV352NetworkProxyCustom352Toggle() {
    val current = BiliClient.prefs.v352networkProxyCustom352
    BiliClient.prefs.v352networkProxyCustom352 = !current
    AppToast.show(this, "Network Proxy Custom352: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV352NetworkCacheStrategy352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkCacheStrategy352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkCacheStrategy352 = value
        AppToast.show(this, "Network Cache Strategy352: $value")
    }
}

internal fun PlayerActivity.showV352NetworkConnectionPool352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkConnectionPool352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkConnectionPool352 = value
        AppToast.show(this, "Network Connection Pool352: $value")
    }
}

internal fun PlayerActivity.showV352NetworkKeepAlive352Toggle() {
    val current = BiliClient.prefs.v352networkKeepAlive352
    BiliClient.prefs.v352networkKeepAlive352 = !current
    AppToast.show(this, "Network Keep Alive352: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV352NetworkCompression352Toggle() {
    val current = BiliClient.prefs.v352networkCompression352
    BiliClient.prefs.v352networkCompression352 = !current
    AppToast.show(this, "Network Compression352: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV352NetworkEncryption352Toggle() {
    val current = BiliClient.prefs.v352networkEncryption352
    BiliClient.prefs.v352networkEncryption352 = !current
    AppToast.show(this, "Network Encryption352: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV353NetworkQualityIndicator353Toggle() {
    val current = BiliClient.prefs.v353networkQualityIndicator353
    BiliClient.prefs.v353networkQualityIndicator353 = !current
    AppToast.show(this, "Network Quality Indicator353: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV353NetworkAutoSwitch353Toggle() {
    val current = BiliClient.prefs.v353networkAutoSwitch353
    BiliClient.prefs.v353networkAutoSwitch353 = !current
    AppToast.show(this, "Network Auto Switch353: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV353NetworkBandwidthLimit353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkBandwidthLimit353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkBandwidthLimit353 = value
        AppToast.show(this, "Network Bandwidth Limit353: $value")
    }
}

internal fun PlayerActivity.showV353NetworkLatencyDisplay353Toggle() {
    val current = BiliClient.prefs.v353networkLatencyDisplay353
    BiliClient.prefs.v353networkLatencyDisplay353 = !current
    AppToast.show(this, "Network Latency Display353: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV353NetworkPacketLossAlert353Toggle() {
    val current = BiliClient.prefs.v353networkPacketLossAlert353
    BiliClient.prefs.v353networkPacketLossAlert353 = !current
    AppToast.show(this, "Network Packet Loss Alert353: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV353NetworkRetryStrategy353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkRetryStrategy353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkRetryStrategy353 = value
        AppToast.show(this, "Network Retry Strategy353: $value")
    }
}

internal fun PlayerActivity.showV353NetworkTimeoutCustom353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkTimeoutCustom353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkTimeoutCustom353 = value
        AppToast.show(this, "Network Timeout Custom353: $value")
    }
}

internal fun PlayerActivity.showV353NetworkDNS优选353Toggle() {
    val current = BiliClient.prefs.v353networkDNS优选353
    BiliClient.prefs.v353networkDNS优选353 = !current
    AppToast.show(this, "Network DNS优选353: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV353NetworkIPv6优先353Toggle() {
    val current = BiliClient.prefs.v353networkIPv6优先353
    BiliClient.prefs.v353networkIPv6优先353 = !current
    AppToast.show(this, "Network IPv6优先353: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV353NetworkProxyCustom353Toggle() {
    val current = BiliClient.prefs.v353networkProxyCustom353
    BiliClient.prefs.v353networkProxyCustom353 = !current
    AppToast.show(this, "Network Proxy Custom353: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV353NetworkCacheStrategy353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkCacheStrategy353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkCacheStrategy353 = value
        AppToast.show(this, "Network Cache Strategy353: $value")
    }
}

internal fun PlayerActivity.showV353NetworkConnectionPool353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkConnectionPool353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkConnectionPool353 = value
        AppToast.show(this, "Network Connection Pool353: $value")
    }
}

internal fun PlayerActivity.showV353NetworkKeepAlive353Toggle() {
    val current = BiliClient.prefs.v353networkKeepAlive353
    BiliClient.prefs.v353networkKeepAlive353 = !current
    AppToast.show(this, "Network Keep Alive353: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV353NetworkCompression353Toggle() {
    val current = BiliClient.prefs.v353networkCompression353
    BiliClient.prefs.v353networkCompression353 = !current
    AppToast.show(this, "Network Compression353: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV353NetworkEncryption353Toggle() {
    val current = BiliClient.prefs.v353networkEncryption353
    BiliClient.prefs.v353networkEncryption353 = !current
    AppToast.show(this, "Network Encryption353: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV354NetworkQualityIndicator354Toggle() {
    val current = BiliClient.prefs.v354networkQualityIndicator354
    BiliClient.prefs.v354networkQualityIndicator354 = !current
    AppToast.show(this, "Network Quality Indicator354: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV354NetworkAutoSwitch354Toggle() {
    val current = BiliClient.prefs.v354networkAutoSwitch354
    BiliClient.prefs.v354networkAutoSwitch354 = !current
    AppToast.show(this, "Network Auto Switch354: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV354NetworkBandwidthLimit354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkBandwidthLimit354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkBandwidthLimit354 = value
        AppToast.show(this, "Network Bandwidth Limit354: $value")
    }
}

internal fun PlayerActivity.showV354NetworkLatencyDisplay354Toggle() {
    val current = BiliClient.prefs.v354networkLatencyDisplay354
    BiliClient.prefs.v354networkLatencyDisplay354 = !current
    AppToast.show(this, "Network Latency Display354: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV354NetworkPacketLossAlert354Toggle() {
    val current = BiliClient.prefs.v354networkPacketLossAlert354
    BiliClient.prefs.v354networkPacketLossAlert354 = !current
    AppToast.show(this, "Network Packet Loss Alert354: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV354NetworkRetryStrategy354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkRetryStrategy354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkRetryStrategy354 = value
        AppToast.show(this, "Network Retry Strategy354: $value")
    }
}

internal fun PlayerActivity.showV354NetworkTimeoutCustom354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkTimeoutCustom354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkTimeoutCustom354 = value
        AppToast.show(this, "Network Timeout Custom354: $value")
    }
}

internal fun PlayerActivity.showV354NetworkDNS优选354Toggle() {
    val current = BiliClient.prefs.v354networkDNS优选354
    BiliClient.prefs.v354networkDNS优选354 = !current
    AppToast.show(this, "Network DNS优选354: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV354NetworkIPv6优先354Toggle() {
    val current = BiliClient.prefs.v354networkIPv6优先354
    BiliClient.prefs.v354networkIPv6优先354 = !current
    AppToast.show(this, "Network IPv6优先354: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV354NetworkProxyCustom354Toggle() {
    val current = BiliClient.prefs.v354networkProxyCustom354
    BiliClient.prefs.v354networkProxyCustom354 = !current
    AppToast.show(this, "Network Proxy Custom354: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV354NetworkCacheStrategy354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkCacheStrategy354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkCacheStrategy354 = value
        AppToast.show(this, "Network Cache Strategy354: $value")
    }
}

internal fun PlayerActivity.showV354NetworkConnectionPool354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkConnectionPool354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkConnectionPool354 = value
        AppToast.show(this, "Network Connection Pool354: $value")
    }
}

internal fun PlayerActivity.showV354NetworkKeepAlive354Toggle() {
    val current = BiliClient.prefs.v354networkKeepAlive354
    BiliClient.prefs.v354networkKeepAlive354 = !current
    AppToast.show(this, "Network Keep Alive354: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV354NetworkCompression354Toggle() {
    val current = BiliClient.prefs.v354networkCompression354
    BiliClient.prefs.v354networkCompression354 = !current
    AppToast.show(this, "Network Compression354: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV354NetworkEncryption354Toggle() {
    val current = BiliClient.prefs.v354networkEncryption354
    BiliClient.prefs.v354networkEncryption354 = !current
    AppToast.show(this, "Network Encryption354: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV355NetworkQualityIndicator355Toggle() {
    val current = BiliClient.prefs.v355networkQualityIndicator355
    BiliClient.prefs.v355networkQualityIndicator355 = !current
    AppToast.show(this, "Network Quality Indicator355: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV355NetworkAutoSwitch355Toggle() {
    val current = BiliClient.prefs.v355networkAutoSwitch355
    BiliClient.prefs.v355networkAutoSwitch355 = !current
    AppToast.show(this, "Network Auto Switch355: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV355NetworkBandwidthLimit355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkBandwidthLimit355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkBandwidthLimit355 = value
        AppToast.show(this, "Network Bandwidth Limit355: $value")
    }
}

internal fun PlayerActivity.showV355NetworkLatencyDisplay355Toggle() {
    val current = BiliClient.prefs.v355networkLatencyDisplay355
    BiliClient.prefs.v355networkLatencyDisplay355 = !current
    AppToast.show(this, "Network Latency Display355: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV355NetworkPacketLossAlert355Toggle() {
    val current = BiliClient.prefs.v355networkPacketLossAlert355
    BiliClient.prefs.v355networkPacketLossAlert355 = !current
    AppToast.show(this, "Network Packet Loss Alert355: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV355NetworkRetryStrategy355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkRetryStrategy355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkRetryStrategy355 = value
        AppToast.show(this, "Network Retry Strategy355: $value")
    }
}

internal fun PlayerActivity.showV355NetworkTimeoutCustom355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkTimeoutCustom355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkTimeoutCustom355 = value
        AppToast.show(this, "Network Timeout Custom355: $value")
    }
}

internal fun PlayerActivity.showV355NetworkDNS优选355Toggle() {
    val current = BiliClient.prefs.v355networkDNS优选355
    BiliClient.prefs.v355networkDNS优选355 = !current
    AppToast.show(this, "Network DNS优选355: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV355NetworkIPv6优先355Toggle() {
    val current = BiliClient.prefs.v355networkIPv6优先355
    BiliClient.prefs.v355networkIPv6优先355 = !current
    AppToast.show(this, "Network IPv6优先355: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV355NetworkProxyCustom355Toggle() {
    val current = BiliClient.prefs.v355networkProxyCustom355
    BiliClient.prefs.v355networkProxyCustom355 = !current
    AppToast.show(this, "Network Proxy Custom355: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV355NetworkCacheStrategy355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkCacheStrategy355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkCacheStrategy355 = value
        AppToast.show(this, "Network Cache Strategy355: $value")
    }
}

internal fun PlayerActivity.showV355NetworkConnectionPool355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkConnectionPool355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkConnectionPool355 = value
        AppToast.show(this, "Network Connection Pool355: $value")
    }
}

internal fun PlayerActivity.showV355NetworkKeepAlive355Toggle() {
    val current = BiliClient.prefs.v355networkKeepAlive355
    BiliClient.prefs.v355networkKeepAlive355 = !current
    AppToast.show(this, "Network Keep Alive355: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV355NetworkCompression355Toggle() {
    val current = BiliClient.prefs.v355networkCompression355
    BiliClient.prefs.v355networkCompression355 = !current
    AppToast.show(this, "Network Compression355: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV355NetworkEncryption355Toggle() {
    val current = BiliClient.prefs.v355networkEncryption355
    BiliClient.prefs.v355networkEncryption355 = !current
    AppToast.show(this, "Network Encryption355: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV356NetworkQualityIndicator356Toggle() {
    val current = BiliClient.prefs.v356networkQualityIndicator356
    BiliClient.prefs.v356networkQualityIndicator356 = !current
    AppToast.show(this, "Network Quality Indicator356: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV356NetworkAutoSwitch356Toggle() {
    val current = BiliClient.prefs.v356networkAutoSwitch356
    BiliClient.prefs.v356networkAutoSwitch356 = !current
    AppToast.show(this, "Network Auto Switch356: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV356NetworkBandwidthLimit356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkBandwidthLimit356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkBandwidthLimit356 = value
        AppToast.show(this, "Network Bandwidth Limit356: $value")
    }
}

internal fun PlayerActivity.showV356NetworkLatencyDisplay356Toggle() {
    val current = BiliClient.prefs.v356networkLatencyDisplay356
    BiliClient.prefs.v356networkLatencyDisplay356 = !current
    AppToast.show(this, "Network Latency Display356: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV356NetworkPacketLossAlert356Toggle() {
    val current = BiliClient.prefs.v356networkPacketLossAlert356
    BiliClient.prefs.v356networkPacketLossAlert356 = !current
    AppToast.show(this, "Network Packet Loss Alert356: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV356NetworkRetryStrategy356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkRetryStrategy356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkRetryStrategy356 = value
        AppToast.show(this, "Network Retry Strategy356: $value")
    }
}

internal fun PlayerActivity.showV356NetworkTimeoutCustom356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkTimeoutCustom356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkTimeoutCustom356 = value
        AppToast.show(this, "Network Timeout Custom356: $value")
    }
}

internal fun PlayerActivity.showV356NetworkDNS优选356Toggle() {
    val current = BiliClient.prefs.v356networkDNS优选356
    BiliClient.prefs.v356networkDNS优选356 = !current
    AppToast.show(this, "Network DNS优选356: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV356NetworkIPv6优先356Toggle() {
    val current = BiliClient.prefs.v356networkIPv6优先356
    BiliClient.prefs.v356networkIPv6优先356 = !current
    AppToast.show(this, "Network IPv6优先356: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV356NetworkProxyCustom356Toggle() {
    val current = BiliClient.prefs.v356networkProxyCustom356
    BiliClient.prefs.v356networkProxyCustom356 = !current
    AppToast.show(this, "Network Proxy Custom356: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV356NetworkCacheStrategy356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkCacheStrategy356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkCacheStrategy356 = value
        AppToast.show(this, "Network Cache Strategy356: $value")
    }
}

internal fun PlayerActivity.showV356NetworkConnectionPool356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkConnectionPool356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkConnectionPool356 = value
        AppToast.show(this, "Network Connection Pool356: $value")
    }
}

internal fun PlayerActivity.showV356NetworkKeepAlive356Toggle() {
    val current = BiliClient.prefs.v356networkKeepAlive356
    BiliClient.prefs.v356networkKeepAlive356 = !current
    AppToast.show(this, "Network Keep Alive356: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV356NetworkCompression356Toggle() {
    val current = BiliClient.prefs.v356networkCompression356
    BiliClient.prefs.v356networkCompression356 = !current
    AppToast.show(this, "Network Compression356: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV356NetworkEncryption356Toggle() {
    val current = BiliClient.prefs.v356networkEncryption356
    BiliClient.prefs.v356networkEncryption356 = !current
    AppToast.show(this, "Network Encryption356: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV357NetworkQualityIndicator357Toggle() {
    val current = BiliClient.prefs.v357networkQualityIndicator357
    BiliClient.prefs.v357networkQualityIndicator357 = !current
    AppToast.show(this, "Network Quality Indicator357: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV357NetworkAutoSwitch357Toggle() {
    val current = BiliClient.prefs.v357networkAutoSwitch357
    BiliClient.prefs.v357networkAutoSwitch357 = !current
    AppToast.show(this, "Network Auto Switch357: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV357NetworkBandwidthLimit357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkBandwidthLimit357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkBandwidthLimit357 = value
        AppToast.show(this, "Network Bandwidth Limit357: $value")
    }
}

internal fun PlayerActivity.showV357NetworkLatencyDisplay357Toggle() {
    val current = BiliClient.prefs.v357networkLatencyDisplay357
    BiliClient.prefs.v357networkLatencyDisplay357 = !current
    AppToast.show(this, "Network Latency Display357: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV357NetworkPacketLossAlert357Toggle() {
    val current = BiliClient.prefs.v357networkPacketLossAlert357
    BiliClient.prefs.v357networkPacketLossAlert357 = !current
    AppToast.show(this, "Network Packet Loss Alert357: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV357NetworkRetryStrategy357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkRetryStrategy357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkRetryStrategy357 = value
        AppToast.show(this, "Network Retry Strategy357: $value")
    }
}

internal fun PlayerActivity.showV357NetworkTimeoutCustom357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkTimeoutCustom357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkTimeoutCustom357 = value
        AppToast.show(this, "Network Timeout Custom357: $value")
    }
}

internal fun PlayerActivity.showV357NetworkDNS优选357Toggle() {
    val current = BiliClient.prefs.v357networkDNS优选357
    BiliClient.prefs.v357networkDNS优选357 = !current
    AppToast.show(this, "Network DNS优选357: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV357NetworkIPv6优先357Toggle() {
    val current = BiliClient.prefs.v357networkIPv6优先357
    BiliClient.prefs.v357networkIPv6优先357 = !current
    AppToast.show(this, "Network IPv6优先357: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV357NetworkProxyCustom357Toggle() {
    val current = BiliClient.prefs.v357networkProxyCustom357
    BiliClient.prefs.v357networkProxyCustom357 = !current
    AppToast.show(this, "Network Proxy Custom357: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV357NetworkCacheStrategy357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkCacheStrategy357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkCacheStrategy357 = value
        AppToast.show(this, "Network Cache Strategy357: $value")
    }
}

internal fun PlayerActivity.showV357NetworkConnectionPool357Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v357networkConnectionPool357).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool357",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v357networkConnectionPool357 = value
        AppToast.show(this, "Network Connection Pool357: $value")
    }
}

internal fun PlayerActivity.showV357NetworkKeepAlive357Toggle() {
    val current = BiliClient.prefs.v357networkKeepAlive357
    BiliClient.prefs.v357networkKeepAlive357 = !current
    AppToast.show(this, "Network Keep Alive357: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV357NetworkCompression357Toggle() {
    val current = BiliClient.prefs.v357networkCompression357
    BiliClient.prefs.v357networkCompression357 = !current
    AppToast.show(this, "Network Compression357: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV357NetworkEncryption357Toggle() {
    val current = BiliClient.prefs.v357networkEncryption357
    BiliClient.prefs.v357networkEncryption357 = !current
    AppToast.show(this, "Network Encryption357: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV358NetworkQualityIndicator358Toggle() {
    val current = BiliClient.prefs.v358networkQualityIndicator358
    BiliClient.prefs.v358networkQualityIndicator358 = !current
    AppToast.show(this, "Network Quality Indicator358: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV358NetworkAutoSwitch358Toggle() {
    val current = BiliClient.prefs.v358networkAutoSwitch358
    BiliClient.prefs.v358networkAutoSwitch358 = !current
    AppToast.show(this, "Network Auto Switch358: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV358NetworkBandwidthLimit358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkBandwidthLimit358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkBandwidthLimit358 = value
        AppToast.show(this, "Network Bandwidth Limit358: $value")
    }
}

internal fun PlayerActivity.showV358NetworkLatencyDisplay358Toggle() {
    val current = BiliClient.prefs.v358networkLatencyDisplay358
    BiliClient.prefs.v358networkLatencyDisplay358 = !current
    AppToast.show(this, "Network Latency Display358: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV358NetworkPacketLossAlert358Toggle() {
    val current = BiliClient.prefs.v358networkPacketLossAlert358
    BiliClient.prefs.v358networkPacketLossAlert358 = !current
    AppToast.show(this, "Network Packet Loss Alert358: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV358NetworkRetryStrategy358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkRetryStrategy358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkRetryStrategy358 = value
        AppToast.show(this, "Network Retry Strategy358: $value")
    }
}

internal fun PlayerActivity.showV358NetworkTimeoutCustom358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkTimeoutCustom358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkTimeoutCustom358 = value
        AppToast.show(this, "Network Timeout Custom358: $value")
    }
}

internal fun PlayerActivity.showV358NetworkDNS优选358Toggle() {
    val current = BiliClient.prefs.v358networkDNS优选358
    BiliClient.prefs.v358networkDNS优选358 = !current
    AppToast.show(this, "Network DNS优选358: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV358NetworkIPv6优先358Toggle() {
    val current = BiliClient.prefs.v358networkIPv6优先358
    BiliClient.prefs.v358networkIPv6优先358 = !current
    AppToast.show(this, "Network IPv6优先358: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV358NetworkProxyCustom358Toggle() {
    val current = BiliClient.prefs.v358networkProxyCustom358
    BiliClient.prefs.v358networkProxyCustom358 = !current
    AppToast.show(this, "Network Proxy Custom358: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV358NetworkCacheStrategy358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkCacheStrategy358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkCacheStrategy358 = value
        AppToast.show(this, "Network Cache Strategy358: $value")
    }
}

internal fun PlayerActivity.showV358NetworkConnectionPool358Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v358networkConnectionPool358).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool358",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v358networkConnectionPool358 = value
        AppToast.show(this, "Network Connection Pool358: $value")
    }
}

internal fun PlayerActivity.showV358NetworkKeepAlive358Toggle() {
    val current = BiliClient.prefs.v358networkKeepAlive358
    BiliClient.prefs.v358networkKeepAlive358 = !current
    AppToast.show(this, "Network Keep Alive358: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV358NetworkCompression358Toggle() {
    val current = BiliClient.prefs.v358networkCompression358
    BiliClient.prefs.v358networkCompression358 = !current
    AppToast.show(this, "Network Compression358: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV358NetworkEncryption358Toggle() {
    val current = BiliClient.prefs.v358networkEncryption358
    BiliClient.prefs.v358networkEncryption358 = !current
    AppToast.show(this, "Network Encryption358: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV359NetworkQualityIndicator359Toggle() {
    val current = BiliClient.prefs.v359networkQualityIndicator359
    BiliClient.prefs.v359networkQualityIndicator359 = !current
    AppToast.show(this, "Network Quality Indicator359: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV359NetworkAutoSwitch359Toggle() {
    val current = BiliClient.prefs.v359networkAutoSwitch359
    BiliClient.prefs.v359networkAutoSwitch359 = !current
    AppToast.show(this, "Network Auto Switch359: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV359NetworkBandwidthLimit359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkBandwidthLimit359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkBandwidthLimit359 = value
        AppToast.show(this, "Network Bandwidth Limit359: $value")
    }
}

internal fun PlayerActivity.showV359NetworkLatencyDisplay359Toggle() {
    val current = BiliClient.prefs.v359networkLatencyDisplay359
    BiliClient.prefs.v359networkLatencyDisplay359 = !current
    AppToast.show(this, "Network Latency Display359: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV359NetworkPacketLossAlert359Toggle() {
    val current = BiliClient.prefs.v359networkPacketLossAlert359
    BiliClient.prefs.v359networkPacketLossAlert359 = !current
    AppToast.show(this, "Network Packet Loss Alert359: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV359NetworkRetryStrategy359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkRetryStrategy359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkRetryStrategy359 = value
        AppToast.show(this, "Network Retry Strategy359: $value")
    }
}

internal fun PlayerActivity.showV359NetworkTimeoutCustom359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkTimeoutCustom359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkTimeoutCustom359 = value
        AppToast.show(this, "Network Timeout Custom359: $value")
    }
}

internal fun PlayerActivity.showV359NetworkDNS优选359Toggle() {
    val current = BiliClient.prefs.v359networkDNS优选359
    BiliClient.prefs.v359networkDNS优选359 = !current
    AppToast.show(this, "Network DNS优选359: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV359NetworkIPv6优先359Toggle() {
    val current = BiliClient.prefs.v359networkIPv6优先359
    BiliClient.prefs.v359networkIPv6优先359 = !current
    AppToast.show(this, "Network IPv6优先359: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV359NetworkProxyCustom359Toggle() {
    val current = BiliClient.prefs.v359networkProxyCustom359
    BiliClient.prefs.v359networkProxyCustom359 = !current
    AppToast.show(this, "Network Proxy Custom359: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV359NetworkCacheStrategy359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkCacheStrategy359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkCacheStrategy359 = value
        AppToast.show(this, "Network Cache Strategy359: $value")
    }
}

internal fun PlayerActivity.showV359NetworkConnectionPool359Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v359networkConnectionPool359).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool359",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v359networkConnectionPool359 = value
        AppToast.show(this, "Network Connection Pool359: $value")
    }
}

internal fun PlayerActivity.showV359NetworkKeepAlive359Toggle() {
    val current = BiliClient.prefs.v359networkKeepAlive359
    BiliClient.prefs.v359networkKeepAlive359 = !current
    AppToast.show(this, "Network Keep Alive359: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV359NetworkCompression359Toggle() {
    val current = BiliClient.prefs.v359networkCompression359
    BiliClient.prefs.v359networkCompression359 = !current
    AppToast.show(this, "Network Compression359: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV359NetworkEncryption359Toggle() {
    val current = BiliClient.prefs.v359networkEncryption359
    BiliClient.prefs.v359networkEncryption359 = !current
    AppToast.show(this, "Network Encryption359: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV360NetworkQualityIndicator360Toggle() {
    val current = BiliClient.prefs.v360networkQualityIndicator360
    BiliClient.prefs.v360networkQualityIndicator360 = !current
    AppToast.show(this, "Network Quality Indicator360: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV360NetworkAutoSwitch360Toggle() {
    val current = BiliClient.prefs.v360networkAutoSwitch360
    BiliClient.prefs.v360networkAutoSwitch360 = !current
    AppToast.show(this, "Network Auto Switch360: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV360NetworkBandwidthLimit360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkBandwidthLimit360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkBandwidthLimit360 = value
        AppToast.show(this, "Network Bandwidth Limit360: $value")
    }
}

internal fun PlayerActivity.showV360NetworkLatencyDisplay360Toggle() {
    val current = BiliClient.prefs.v360networkLatencyDisplay360
    BiliClient.prefs.v360networkLatencyDisplay360 = !current
    AppToast.show(this, "Network Latency Display360: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV360NetworkPacketLossAlert360Toggle() {
    val current = BiliClient.prefs.v360networkPacketLossAlert360
    BiliClient.prefs.v360networkPacketLossAlert360 = !current
    AppToast.show(this, "Network Packet Loss Alert360: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV360NetworkRetryStrategy360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkRetryStrategy360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkRetryStrategy360 = value
        AppToast.show(this, "Network Retry Strategy360: $value")
    }
}

internal fun PlayerActivity.showV360NetworkTimeoutCustom360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkTimeoutCustom360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkTimeoutCustom360 = value
        AppToast.show(this, "Network Timeout Custom360: $value")
    }
}

internal fun PlayerActivity.showV360NetworkDNS优选360Toggle() {
    val current = BiliClient.prefs.v360networkDNS优选360
    BiliClient.prefs.v360networkDNS优选360 = !current
    AppToast.show(this, "Network DNS优选360: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV360NetworkIPv6优先360Toggle() {
    val current = BiliClient.prefs.v360networkIPv6优先360
    BiliClient.prefs.v360networkIPv6优先360 = !current
    AppToast.show(this, "Network IPv6优先360: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV360NetworkProxyCustom360Toggle() {
    val current = BiliClient.prefs.v360networkProxyCustom360
    BiliClient.prefs.v360networkProxyCustom360 = !current
    AppToast.show(this, "Network Proxy Custom360: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV360NetworkCacheStrategy360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkCacheStrategy360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkCacheStrategy360 = value
        AppToast.show(this, "Network Cache Strategy360: $value")
    }
}

internal fun PlayerActivity.showV360NetworkConnectionPool360Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v360networkConnectionPool360).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool360",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v360networkConnectionPool360 = value
        AppToast.show(this, "Network Connection Pool360: $value")
    }
}

internal fun PlayerActivity.showV360NetworkKeepAlive360Toggle() {
    val current = BiliClient.prefs.v360networkKeepAlive360
    BiliClient.prefs.v360networkKeepAlive360 = !current
    AppToast.show(this, "Network Keep Alive360: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV360NetworkCompression360Toggle() {
    val current = BiliClient.prefs.v360networkCompression360
    BiliClient.prefs.v360networkCompression360 = !current
    AppToast.show(this, "Network Compression360: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV360NetworkEncryption360Toggle() {
    val current = BiliClient.prefs.v360networkEncryption360
    BiliClient.prefs.v360networkEncryption360 = !current
    AppToast.show(this, "Network Encryption360: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV361SleepTimerDuration361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361sleepTimerDuration361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sleep Timer Duration361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361sleepTimerDuration361 = value
        AppToast.show(this, "Sleep Timer Duration361: $value")
    }
}

internal fun PlayerActivity.showV361SleepTimerFadeOut361Toggle() {
    val current = BiliClient.prefs.v361sleepTimerFadeOut361
    BiliClient.prefs.v361sleepTimerFadeOut361 = !current
    AppToast.show(this, "Sleep Timer Fade Out361: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV361SleepTimerShake361Toggle() {
    val current = BiliClient.prefs.v361sleepTimerShake361
    BiliClient.prefs.v361sleepTimerShake361 = !current
    AppToast.show(this, "Sleep Timer Shake361: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV361ParentalPinLock361Toggle() {
    val current = BiliClient.prefs.v361parentalPinLock361
    BiliClient.prefs.v361parentalPinLock361 = !current
    AppToast.show(this, "Parental Pin Lock361: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV361ParentalTimeLimit361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361parentalTimeLimit361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Parental Time Limit361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361parentalTimeLimit361 = value
        AppToast.show(this, "Parental Time Limit361: $value")
    }
}

internal fun PlayerActivity.showV361ParentalContentFilter361Toggle() {
    val current = BiliClient.prefs.v361parentalContentFilter361
    BiliClient.prefs.v361parentalContentFilter361 = !current
    AppToast.show(this, "Parental Content Filter361: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV361PrivacyAutoClearHistory361Toggle() {
    val current = BiliClient.prefs.v361privacyAutoClearHistory361
    BiliClient.prefs.v361privacyAutoClearHistory361 = !current
    AppToast.show(this, "Privacy Auto Clear History361: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV361PrivacyHideWatchRecord361Toggle() {
    val current = BiliClient.prefs.v361privacyHideWatchRecord361
    BiliClient.prefs.v361privacyHideWatchRecord361 = !current
    AppToast.show(this, "Privacy Hide Watch Record361: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV361PrivacyDisableAnalytics361Toggle() {
    val current = BiliClient.prefs.v361privacyDisableAnalytics361
    BiliClient.prefs.v361privacyDisableAnalytics361 = !current
    AppToast.show(this, "Privacy Disable Analytics361: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV361ThemeAccentColor361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361themeAccentColor361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Accent Color361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361themeAccentColor361 = value
        AppToast.show(this, "Theme Accent Color361: $value")
    }
}

internal fun PlayerActivity.showV361ThemeDarkMode361Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v361themeDarkMode361).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Theme Dark Mode361",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v361themeDarkMode361 = value
        AppToast.show(this, "Theme Dark Mode361: $value")
    }
}

