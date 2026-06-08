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

internal fun PlayerActivity.showV508PostAutoShare508Toggle() {
    val current = BiliClient.prefs.v508postAutoShare508
    BiliClient.prefs.v508postAutoShare508 = !current
    AppToast.show(this, "Post Auto Share508: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV508PowerSaveMode508Toggle() {
    val current = BiliClient.prefs.v508powerSaveMode508
    BiliClient.prefs.v508powerSaveMode508 = !current
    AppToast.show(this, "Power Save Mode508: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV508PreBufferEnabled508Toggle() {
    val current = BiliClient.prefs.v508preBufferEnabled508
    BiliClient.prefs.v508preBufferEnabled508 = !current
    AppToast.show(this, "Pre Buffer Enabled508: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV508PrefixAutoTrim508Toggle() {
    val current = BiliClient.prefs.v508prefixAutoTrim508
    BiliClient.prefs.v508prefixAutoTrim508 = !current
    AppToast.show(this, "Prefix Auto Trim508: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV508PressAndHoldAction508Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v508pressAndHoldAction508).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action508",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v508pressAndHoldAction508 = value
        AppToast.show(this, "Press And Hold Action508: $value")
    }
}

internal fun PlayerActivity.showV508PrimaryAudioTrack508Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v508primaryAudioTrack508).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track508",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v508primaryAudioTrack508 = value
        AppToast.show(this, "Primary Audio Track508: $value")
    }
}

internal fun PlayerActivity.showV508PrintAutoFormat508Toggle() {
    val current = BiliClient.prefs.v508printAutoFormat508
    BiliClient.prefs.v508printAutoFormat508 = !current
    AppToast.show(this, "Print Auto Format508: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV508PriorityQueueEnabled508Toggle() {
    val current = BiliClient.prefs.v508priorityQueueEnabled508
    BiliClient.prefs.v508priorityQueueEnabled508 = !current
    AppToast.show(this, "Priority Queue Enabled508: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV508PrivateModeAuto508Toggle() {
    val current = BiliClient.prefs.v508privateModeAuto508
    BiliClient.prefs.v508privateModeAuto508 = !current
    AppToast.show(this, "Private Mode Auto508: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PlaceAutoDetect509Toggle() {
    val current = BiliClient.prefs.v509placeAutoDetect509
    BiliClient.prefs.v509placeAutoDetect509 = !current
    AppToast.show(this, "Place Auto Detect509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PlatformAutoAdapt509Toggle() {
    val current = BiliClient.prefs.v509platformAutoAdapt509
    BiliClient.prefs.v509platformAutoAdapt509 = !current
    AppToast.show(this, "Platform Auto Adapt509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PlayAutoResume509Toggle() {
    val current = BiliClient.prefs.v509playAutoResume509
    BiliClient.prefs.v509playAutoResume509 = !current
    AppToast.show(this, "Play Auto Resume509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PluginAutoUpdate509Toggle() {
    val current = BiliClient.prefs.v509pluginAutoUpdate509
    BiliClient.prefs.v509pluginAutoUpdate509 = !current
    AppToast.show(this, "Plugin Auto Update509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PopUpAutoDismiss509Toggle() {
    val current = BiliClient.prefs.v509popUpAutoDismiss509
    BiliClient.prefs.v509popUpAutoDismiss509 = !current
    AppToast.show(this, "Pop Up Auto Dismiss509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PortAutoScan509Toggle() {
    val current = BiliClient.prefs.v509portAutoScan509
    BiliClient.prefs.v509portAutoScan509 = !current
    AppToast.show(this, "Port Auto Scan509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PostAutoShare509Toggle() {
    val current = BiliClient.prefs.v509postAutoShare509
    BiliClient.prefs.v509postAutoShare509 = !current
    AppToast.show(this, "Post Auto Share509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PowerSaveMode509Toggle() {
    val current = BiliClient.prefs.v509powerSaveMode509
    BiliClient.prefs.v509powerSaveMode509 = !current
    AppToast.show(this, "Power Save Mode509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PreBufferEnabled509Toggle() {
    val current = BiliClient.prefs.v509preBufferEnabled509
    BiliClient.prefs.v509preBufferEnabled509 = !current
    AppToast.show(this, "Pre Buffer Enabled509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PrefixAutoTrim509Toggle() {
    val current = BiliClient.prefs.v509prefixAutoTrim509
    BiliClient.prefs.v509prefixAutoTrim509 = !current
    AppToast.show(this, "Prefix Auto Trim509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PressAndHoldAction509Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v509pressAndHoldAction509).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action509",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v509pressAndHoldAction509 = value
        AppToast.show(this, "Press And Hold Action509: $value")
    }
}

internal fun PlayerActivity.showV509PrimaryAudioTrack509Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v509primaryAudioTrack509).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track509",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v509primaryAudioTrack509 = value
        AppToast.show(this, "Primary Audio Track509: $value")
    }
}

internal fun PlayerActivity.showV509PrintAutoFormat509Toggle() {
    val current = BiliClient.prefs.v509printAutoFormat509
    BiliClient.prefs.v509printAutoFormat509 = !current
    AppToast.show(this, "Print Auto Format509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PriorityQueueEnabled509Toggle() {
    val current = BiliClient.prefs.v509priorityQueueEnabled509
    BiliClient.prefs.v509priorityQueueEnabled509 = !current
    AppToast.show(this, "Priority Queue Enabled509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV509PrivateModeAuto509Toggle() {
    val current = BiliClient.prefs.v509privateModeAuto509
    BiliClient.prefs.v509privateModeAuto509 = !current
    AppToast.show(this, "Private Mode Auto509: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PlaceAutoDetect510Toggle() {
    val current = BiliClient.prefs.v510placeAutoDetect510
    BiliClient.prefs.v510placeAutoDetect510 = !current
    AppToast.show(this, "Place Auto Detect510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PlatformAutoAdapt510Toggle() {
    val current = BiliClient.prefs.v510platformAutoAdapt510
    BiliClient.prefs.v510platformAutoAdapt510 = !current
    AppToast.show(this, "Platform Auto Adapt510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PlayAutoResume510Toggle() {
    val current = BiliClient.prefs.v510playAutoResume510
    BiliClient.prefs.v510playAutoResume510 = !current
    AppToast.show(this, "Play Auto Resume510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PluginAutoUpdate510Toggle() {
    val current = BiliClient.prefs.v510pluginAutoUpdate510
    BiliClient.prefs.v510pluginAutoUpdate510 = !current
    AppToast.show(this, "Plugin Auto Update510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PopUpAutoDismiss510Toggle() {
    val current = BiliClient.prefs.v510popUpAutoDismiss510
    BiliClient.prefs.v510popUpAutoDismiss510 = !current
    AppToast.show(this, "Pop Up Auto Dismiss510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PortAutoScan510Toggle() {
    val current = BiliClient.prefs.v510portAutoScan510
    BiliClient.prefs.v510portAutoScan510 = !current
    AppToast.show(this, "Port Auto Scan510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PostAutoShare510Toggle() {
    val current = BiliClient.prefs.v510postAutoShare510
    BiliClient.prefs.v510postAutoShare510 = !current
    AppToast.show(this, "Post Auto Share510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PowerSaveMode510Toggle() {
    val current = BiliClient.prefs.v510powerSaveMode510
    BiliClient.prefs.v510powerSaveMode510 = !current
    AppToast.show(this, "Power Save Mode510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PreBufferEnabled510Toggle() {
    val current = BiliClient.prefs.v510preBufferEnabled510
    BiliClient.prefs.v510preBufferEnabled510 = !current
    AppToast.show(this, "Pre Buffer Enabled510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PrefixAutoTrim510Toggle() {
    val current = BiliClient.prefs.v510prefixAutoTrim510
    BiliClient.prefs.v510prefixAutoTrim510 = !current
    AppToast.show(this, "Prefix Auto Trim510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PressAndHoldAction510Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v510pressAndHoldAction510).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action510",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v510pressAndHoldAction510 = value
        AppToast.show(this, "Press And Hold Action510: $value")
    }
}

internal fun PlayerActivity.showV510PrimaryAudioTrack510Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v510primaryAudioTrack510).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track510",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v510primaryAudioTrack510 = value
        AppToast.show(this, "Primary Audio Track510: $value")
    }
}

internal fun PlayerActivity.showV510PrintAutoFormat510Toggle() {
    val current = BiliClient.prefs.v510printAutoFormat510
    BiliClient.prefs.v510printAutoFormat510 = !current
    AppToast.show(this, "Print Auto Format510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PriorityQueueEnabled510Toggle() {
    val current = BiliClient.prefs.v510priorityQueueEnabled510
    BiliClient.prefs.v510priorityQueueEnabled510 = !current
    AppToast.show(this, "Priority Queue Enabled510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV510PrivateModeAuto510Toggle() {
    val current = BiliClient.prefs.v510privateModeAuto510
    BiliClient.prefs.v510privateModeAuto510 = !current
    AppToast.show(this, "Private Mode Auto510: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511ProgressAutoSave511Toggle() {
    val current = BiliClient.prefs.v511progressAutoSave511
    BiliClient.prefs.v511progressAutoSave511 = !current
    AppToast.show(this, "Progress Auto Save511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511ProjectAutoSync511Toggle() {
    val current = BiliClient.prefs.v511projectAutoSync511
    BiliClient.prefs.v511projectAutoSync511 = !current
    AppToast.show(this, "Project Auto Sync511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511PromptAutoShow511Toggle() {
    val current = BiliClient.prefs.v511promptAutoShow511
    BiliClient.prefs.v511promptAutoShow511 = !current
    AppToast.show(this, "Prompt Auto Show511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511PushNotificationAuto511Toggle() {
    val current = BiliClient.prefs.v511pushNotificationAuto511
    BiliClient.prefs.v511pushNotificationAuto511 = !current
    AppToast.show(this, "Push Notification Auto511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511RangeAutoDetect511Toggle() {
    val current = BiliClient.prefs.v511rangeAutoDetect511
    BiliClient.prefs.v511rangeAutoDetect511 = !current
    AppToast.show(this, "Range Auto Detect511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511RateAutoAdjust511Toggle() {
    val current = BiliClient.prefs.v511rateAutoAdjust511
    BiliClient.prefs.v511rateAutoAdjust511 = !current
    AppToast.show(this, "Rate Auto Adjust511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511RawFormatEnabled511Toggle() {
    val current = BiliClient.prefs.v511rawFormatEnabled511
    BiliClient.prefs.v511rawFormatEnabled511 = !current
    AppToast.show(this, "Raw Format Enabled511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511ReadAutoScroll511Toggle() {
    val current = BiliClient.prefs.v511readAutoScroll511
    BiliClient.prefs.v511readAutoScroll511 = !current
    AppToast.show(this, "Read Auto Scroll511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511ReadyStateAuto511Toggle() {
    val current = BiliClient.prefs.v511readyStateAuto511
    BiliClient.prefs.v511readyStateAuto511 = !current
    AppToast.show(this, "Ready State Auto511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511RealTimeSync511Toggle() {
    val current = BiliClient.prefs.v511realTimeSync511
    BiliClient.prefs.v511realTimeSync511 = !current
    AppToast.show(this, "Real Time Sync511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511RebuildAutoIndex511Toggle() {
    val current = BiliClient.prefs.v511rebuildAutoIndex511
    BiliClient.prefs.v511rebuildAutoIndex511 = !current
    AppToast.show(this, "Rebuild Auto Index511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511RecentAutoClean511Toggle() {
    val current = BiliClient.prefs.v511recentAutoClean511
    BiliClient.prefs.v511recentAutoClean511 = !current
    AppToast.show(this, "Recent Auto Clean511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511RecoverAutoBackup511Toggle() {
    val current = BiliClient.prefs.v511recoverAutoBackup511
    BiliClient.prefs.v511recoverAutoBackup511 = !current
    AppToast.show(this, "Recover Auto Backup511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV511RegionAutoSelect511Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v511regionAutoSelect511).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select511",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v511regionAutoSelect511 = value
        AppToast.show(this, "Region Auto Select511: $value")
    }
}

internal fun PlayerActivity.showV511RemoteAutoConnect511Toggle() {
    val current = BiliClient.prefs.v511remoteAutoConnect511
    BiliClient.prefs.v511remoteAutoConnect511 = !current
    AppToast.show(this, "Remote Auto Connect511: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512ProgressAutoSave512Toggle() {
    val current = BiliClient.prefs.v512progressAutoSave512
    BiliClient.prefs.v512progressAutoSave512 = !current
    AppToast.show(this, "Progress Auto Save512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512ProjectAutoSync512Toggle() {
    val current = BiliClient.prefs.v512projectAutoSync512
    BiliClient.prefs.v512projectAutoSync512 = !current
    AppToast.show(this, "Project Auto Sync512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512PromptAutoShow512Toggle() {
    val current = BiliClient.prefs.v512promptAutoShow512
    BiliClient.prefs.v512promptAutoShow512 = !current
    AppToast.show(this, "Prompt Auto Show512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512PushNotificationAuto512Toggle() {
    val current = BiliClient.prefs.v512pushNotificationAuto512
    BiliClient.prefs.v512pushNotificationAuto512 = !current
    AppToast.show(this, "Push Notification Auto512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512RangeAutoDetect512Toggle() {
    val current = BiliClient.prefs.v512rangeAutoDetect512
    BiliClient.prefs.v512rangeAutoDetect512 = !current
    AppToast.show(this, "Range Auto Detect512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512RateAutoAdjust512Toggle() {
    val current = BiliClient.prefs.v512rateAutoAdjust512
    BiliClient.prefs.v512rateAutoAdjust512 = !current
    AppToast.show(this, "Rate Auto Adjust512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512RawFormatEnabled512Toggle() {
    val current = BiliClient.prefs.v512rawFormatEnabled512
    BiliClient.prefs.v512rawFormatEnabled512 = !current
    AppToast.show(this, "Raw Format Enabled512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512ReadAutoScroll512Toggle() {
    val current = BiliClient.prefs.v512readAutoScroll512
    BiliClient.prefs.v512readAutoScroll512 = !current
    AppToast.show(this, "Read Auto Scroll512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512ReadyStateAuto512Toggle() {
    val current = BiliClient.prefs.v512readyStateAuto512
    BiliClient.prefs.v512readyStateAuto512 = !current
    AppToast.show(this, "Ready State Auto512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512RealTimeSync512Toggle() {
    val current = BiliClient.prefs.v512realTimeSync512
    BiliClient.prefs.v512realTimeSync512 = !current
    AppToast.show(this, "Real Time Sync512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512RebuildAutoIndex512Toggle() {
    val current = BiliClient.prefs.v512rebuildAutoIndex512
    BiliClient.prefs.v512rebuildAutoIndex512 = !current
    AppToast.show(this, "Rebuild Auto Index512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512RecentAutoClean512Toggle() {
    val current = BiliClient.prefs.v512recentAutoClean512
    BiliClient.prefs.v512recentAutoClean512 = !current
    AppToast.show(this, "Recent Auto Clean512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512RecoverAutoBackup512Toggle() {
    val current = BiliClient.prefs.v512recoverAutoBackup512
    BiliClient.prefs.v512recoverAutoBackup512 = !current
    AppToast.show(this, "Recover Auto Backup512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV512RegionAutoSelect512Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v512regionAutoSelect512).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select512",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v512regionAutoSelect512 = value
        AppToast.show(this, "Region Auto Select512: $value")
    }
}

internal fun PlayerActivity.showV512RemoteAutoConnect512Toggle() {
    val current = BiliClient.prefs.v512remoteAutoConnect512
    BiliClient.prefs.v512remoteAutoConnect512 = !current
    AppToast.show(this, "Remote Auto Connect512: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513ProgressAutoSave513Toggle() {
    val current = BiliClient.prefs.v513progressAutoSave513
    BiliClient.prefs.v513progressAutoSave513 = !current
    AppToast.show(this, "Progress Auto Save513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513ProjectAutoSync513Toggle() {
    val current = BiliClient.prefs.v513projectAutoSync513
    BiliClient.prefs.v513projectAutoSync513 = !current
    AppToast.show(this, "Project Auto Sync513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513PromptAutoShow513Toggle() {
    val current = BiliClient.prefs.v513promptAutoShow513
    BiliClient.prefs.v513promptAutoShow513 = !current
    AppToast.show(this, "Prompt Auto Show513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513PushNotificationAuto513Toggle() {
    val current = BiliClient.prefs.v513pushNotificationAuto513
    BiliClient.prefs.v513pushNotificationAuto513 = !current
    AppToast.show(this, "Push Notification Auto513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513RangeAutoDetect513Toggle() {
    val current = BiliClient.prefs.v513rangeAutoDetect513
    BiliClient.prefs.v513rangeAutoDetect513 = !current
    AppToast.show(this, "Range Auto Detect513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513RateAutoAdjust513Toggle() {
    val current = BiliClient.prefs.v513rateAutoAdjust513
    BiliClient.prefs.v513rateAutoAdjust513 = !current
    AppToast.show(this, "Rate Auto Adjust513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513RawFormatEnabled513Toggle() {
    val current = BiliClient.prefs.v513rawFormatEnabled513
    BiliClient.prefs.v513rawFormatEnabled513 = !current
    AppToast.show(this, "Raw Format Enabled513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513ReadAutoScroll513Toggle() {
    val current = BiliClient.prefs.v513readAutoScroll513
    BiliClient.prefs.v513readAutoScroll513 = !current
    AppToast.show(this, "Read Auto Scroll513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513ReadyStateAuto513Toggle() {
    val current = BiliClient.prefs.v513readyStateAuto513
    BiliClient.prefs.v513readyStateAuto513 = !current
    AppToast.show(this, "Ready State Auto513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513RealTimeSync513Toggle() {
    val current = BiliClient.prefs.v513realTimeSync513
    BiliClient.prefs.v513realTimeSync513 = !current
    AppToast.show(this, "Real Time Sync513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513RebuildAutoIndex513Toggle() {
    val current = BiliClient.prefs.v513rebuildAutoIndex513
    BiliClient.prefs.v513rebuildAutoIndex513 = !current
    AppToast.show(this, "Rebuild Auto Index513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513RecentAutoClean513Toggle() {
    val current = BiliClient.prefs.v513recentAutoClean513
    BiliClient.prefs.v513recentAutoClean513 = !current
    AppToast.show(this, "Recent Auto Clean513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513RecoverAutoBackup513Toggle() {
    val current = BiliClient.prefs.v513recoverAutoBackup513
    BiliClient.prefs.v513recoverAutoBackup513 = !current
    AppToast.show(this, "Recover Auto Backup513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV513RegionAutoSelect513Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v513regionAutoSelect513).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select513",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v513regionAutoSelect513 = value
        AppToast.show(this, "Region Auto Select513: $value")
    }
}

internal fun PlayerActivity.showV513RemoteAutoConnect513Toggle() {
    val current = BiliClient.prefs.v513remoteAutoConnect513
    BiliClient.prefs.v513remoteAutoConnect513 = !current
    AppToast.show(this, "Remote Auto Connect513: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514ProgressAutoSave514Toggle() {
    val current = BiliClient.prefs.v514progressAutoSave514
    BiliClient.prefs.v514progressAutoSave514 = !current
    AppToast.show(this, "Progress Auto Save514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514ProjectAutoSync514Toggle() {
    val current = BiliClient.prefs.v514projectAutoSync514
    BiliClient.prefs.v514projectAutoSync514 = !current
    AppToast.show(this, "Project Auto Sync514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514PromptAutoShow514Toggle() {
    val current = BiliClient.prefs.v514promptAutoShow514
    BiliClient.prefs.v514promptAutoShow514 = !current
    AppToast.show(this, "Prompt Auto Show514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514PushNotificationAuto514Toggle() {
    val current = BiliClient.prefs.v514pushNotificationAuto514
    BiliClient.prefs.v514pushNotificationAuto514 = !current
    AppToast.show(this, "Push Notification Auto514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514RangeAutoDetect514Toggle() {
    val current = BiliClient.prefs.v514rangeAutoDetect514
    BiliClient.prefs.v514rangeAutoDetect514 = !current
    AppToast.show(this, "Range Auto Detect514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514RateAutoAdjust514Toggle() {
    val current = BiliClient.prefs.v514rateAutoAdjust514
    BiliClient.prefs.v514rateAutoAdjust514 = !current
    AppToast.show(this, "Rate Auto Adjust514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514RawFormatEnabled514Toggle() {
    val current = BiliClient.prefs.v514rawFormatEnabled514
    BiliClient.prefs.v514rawFormatEnabled514 = !current
    AppToast.show(this, "Raw Format Enabled514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514ReadAutoScroll514Toggle() {
    val current = BiliClient.prefs.v514readAutoScroll514
    BiliClient.prefs.v514readAutoScroll514 = !current
    AppToast.show(this, "Read Auto Scroll514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514ReadyStateAuto514Toggle() {
    val current = BiliClient.prefs.v514readyStateAuto514
    BiliClient.prefs.v514readyStateAuto514 = !current
    AppToast.show(this, "Ready State Auto514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514RealTimeSync514Toggle() {
    val current = BiliClient.prefs.v514realTimeSync514
    BiliClient.prefs.v514realTimeSync514 = !current
    AppToast.show(this, "Real Time Sync514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514RebuildAutoIndex514Toggle() {
    val current = BiliClient.prefs.v514rebuildAutoIndex514
    BiliClient.prefs.v514rebuildAutoIndex514 = !current
    AppToast.show(this, "Rebuild Auto Index514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514RecentAutoClean514Toggle() {
    val current = BiliClient.prefs.v514recentAutoClean514
    BiliClient.prefs.v514recentAutoClean514 = !current
    AppToast.show(this, "Recent Auto Clean514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514RecoverAutoBackup514Toggle() {
    val current = BiliClient.prefs.v514recoverAutoBackup514
    BiliClient.prefs.v514recoverAutoBackup514 = !current
    AppToast.show(this, "Recover Auto Backup514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV514RegionAutoSelect514Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v514regionAutoSelect514).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select514",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v514regionAutoSelect514 = value
        AppToast.show(this, "Region Auto Select514: $value")
    }
}

internal fun PlayerActivity.showV514RemoteAutoConnect514Toggle() {
    val current = BiliClient.prefs.v514remoteAutoConnect514
    BiliClient.prefs.v514remoteAutoConnect514 = !current
    AppToast.show(this, "Remote Auto Connect514: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515ProgressAutoSave515Toggle() {
    val current = BiliClient.prefs.v515progressAutoSave515
    BiliClient.prefs.v515progressAutoSave515 = !current
    AppToast.show(this, "Progress Auto Save515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515ProjectAutoSync515Toggle() {
    val current = BiliClient.prefs.v515projectAutoSync515
    BiliClient.prefs.v515projectAutoSync515 = !current
    AppToast.show(this, "Project Auto Sync515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515PromptAutoShow515Toggle() {
    val current = BiliClient.prefs.v515promptAutoShow515
    BiliClient.prefs.v515promptAutoShow515 = !current
    AppToast.show(this, "Prompt Auto Show515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515PushNotificationAuto515Toggle() {
    val current = BiliClient.prefs.v515pushNotificationAuto515
    BiliClient.prefs.v515pushNotificationAuto515 = !current
    AppToast.show(this, "Push Notification Auto515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515RangeAutoDetect515Toggle() {
    val current = BiliClient.prefs.v515rangeAutoDetect515
    BiliClient.prefs.v515rangeAutoDetect515 = !current
    AppToast.show(this, "Range Auto Detect515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515RateAutoAdjust515Toggle() {
    val current = BiliClient.prefs.v515rateAutoAdjust515
    BiliClient.prefs.v515rateAutoAdjust515 = !current
    AppToast.show(this, "Rate Auto Adjust515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515RawFormatEnabled515Toggle() {
    val current = BiliClient.prefs.v515rawFormatEnabled515
    BiliClient.prefs.v515rawFormatEnabled515 = !current
    AppToast.show(this, "Raw Format Enabled515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515ReadAutoScroll515Toggle() {
    val current = BiliClient.prefs.v515readAutoScroll515
    BiliClient.prefs.v515readAutoScroll515 = !current
    AppToast.show(this, "Read Auto Scroll515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515ReadyStateAuto515Toggle() {
    val current = BiliClient.prefs.v515readyStateAuto515
    BiliClient.prefs.v515readyStateAuto515 = !current
    AppToast.show(this, "Ready State Auto515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515RealTimeSync515Toggle() {
    val current = BiliClient.prefs.v515realTimeSync515
    BiliClient.prefs.v515realTimeSync515 = !current
    AppToast.show(this, "Real Time Sync515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515RebuildAutoIndex515Toggle() {
    val current = BiliClient.prefs.v515rebuildAutoIndex515
    BiliClient.prefs.v515rebuildAutoIndex515 = !current
    AppToast.show(this, "Rebuild Auto Index515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515RecentAutoClean515Toggle() {
    val current = BiliClient.prefs.v515recentAutoClean515
    BiliClient.prefs.v515recentAutoClean515 = !current
    AppToast.show(this, "Recent Auto Clean515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515RecoverAutoBackup515Toggle() {
    val current = BiliClient.prefs.v515recoverAutoBackup515
    BiliClient.prefs.v515recoverAutoBackup515 = !current
    AppToast.show(this, "Recover Auto Backup515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV515RegionAutoSelect515Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v515regionAutoSelect515).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select515",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v515regionAutoSelect515 = value
        AppToast.show(this, "Region Auto Select515: $value")
    }
}

internal fun PlayerActivity.showV515RemoteAutoConnect515Toggle() {
    val current = BiliClient.prefs.v515remoteAutoConnect515
    BiliClient.prefs.v515remoteAutoConnect515 = !current
    AppToast.show(this, "Remote Auto Connect515: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516ProgressAutoSave516Toggle() {
    val current = BiliClient.prefs.v516progressAutoSave516
    BiliClient.prefs.v516progressAutoSave516 = !current
    AppToast.show(this, "Progress Auto Save516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516ProjectAutoSync516Toggle() {
    val current = BiliClient.prefs.v516projectAutoSync516
    BiliClient.prefs.v516projectAutoSync516 = !current
    AppToast.show(this, "Project Auto Sync516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516PromptAutoShow516Toggle() {
    val current = BiliClient.prefs.v516promptAutoShow516
    BiliClient.prefs.v516promptAutoShow516 = !current
    AppToast.show(this, "Prompt Auto Show516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516PushNotificationAuto516Toggle() {
    val current = BiliClient.prefs.v516pushNotificationAuto516
    BiliClient.prefs.v516pushNotificationAuto516 = !current
    AppToast.show(this, "Push Notification Auto516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516RangeAutoDetect516Toggle() {
    val current = BiliClient.prefs.v516rangeAutoDetect516
    BiliClient.prefs.v516rangeAutoDetect516 = !current
    AppToast.show(this, "Range Auto Detect516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516RateAutoAdjust516Toggle() {
    val current = BiliClient.prefs.v516rateAutoAdjust516
    BiliClient.prefs.v516rateAutoAdjust516 = !current
    AppToast.show(this, "Rate Auto Adjust516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516RawFormatEnabled516Toggle() {
    val current = BiliClient.prefs.v516rawFormatEnabled516
    BiliClient.prefs.v516rawFormatEnabled516 = !current
    AppToast.show(this, "Raw Format Enabled516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516ReadAutoScroll516Toggle() {
    val current = BiliClient.prefs.v516readAutoScroll516
    BiliClient.prefs.v516readAutoScroll516 = !current
    AppToast.show(this, "Read Auto Scroll516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516ReadyStateAuto516Toggle() {
    val current = BiliClient.prefs.v516readyStateAuto516
    BiliClient.prefs.v516readyStateAuto516 = !current
    AppToast.show(this, "Ready State Auto516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516RealTimeSync516Toggle() {
    val current = BiliClient.prefs.v516realTimeSync516
    BiliClient.prefs.v516realTimeSync516 = !current
    AppToast.show(this, "Real Time Sync516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516RebuildAutoIndex516Toggle() {
    val current = BiliClient.prefs.v516rebuildAutoIndex516
    BiliClient.prefs.v516rebuildAutoIndex516 = !current
    AppToast.show(this, "Rebuild Auto Index516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516RecentAutoClean516Toggle() {
    val current = BiliClient.prefs.v516recentAutoClean516
    BiliClient.prefs.v516recentAutoClean516 = !current
    AppToast.show(this, "Recent Auto Clean516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516RecoverAutoBackup516Toggle() {
    val current = BiliClient.prefs.v516recoverAutoBackup516
    BiliClient.prefs.v516recoverAutoBackup516 = !current
    AppToast.show(this, "Recover Auto Backup516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV516RegionAutoSelect516Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v516regionAutoSelect516).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select516",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v516regionAutoSelect516 = value
        AppToast.show(this, "Region Auto Select516: $value")
    }
}

internal fun PlayerActivity.showV516RemoteAutoConnect516Toggle() {
    val current = BiliClient.prefs.v516remoteAutoConnect516
    BiliClient.prefs.v516remoteAutoConnect516 = !current
    AppToast.show(this, "Remote Auto Connect516: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517ProgressAutoSave517Toggle() {
    val current = BiliClient.prefs.v517progressAutoSave517
    BiliClient.prefs.v517progressAutoSave517 = !current
    AppToast.show(this, "Progress Auto Save517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517ProjectAutoSync517Toggle() {
    val current = BiliClient.prefs.v517projectAutoSync517
    BiliClient.prefs.v517projectAutoSync517 = !current
    AppToast.show(this, "Project Auto Sync517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517PromptAutoShow517Toggle() {
    val current = BiliClient.prefs.v517promptAutoShow517
    BiliClient.prefs.v517promptAutoShow517 = !current
    AppToast.show(this, "Prompt Auto Show517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517PushNotificationAuto517Toggle() {
    val current = BiliClient.prefs.v517pushNotificationAuto517
    BiliClient.prefs.v517pushNotificationAuto517 = !current
    AppToast.show(this, "Push Notification Auto517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517RangeAutoDetect517Toggle() {
    val current = BiliClient.prefs.v517rangeAutoDetect517
    BiliClient.prefs.v517rangeAutoDetect517 = !current
    AppToast.show(this, "Range Auto Detect517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517RateAutoAdjust517Toggle() {
    val current = BiliClient.prefs.v517rateAutoAdjust517
    BiliClient.prefs.v517rateAutoAdjust517 = !current
    AppToast.show(this, "Rate Auto Adjust517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517RawFormatEnabled517Toggle() {
    val current = BiliClient.prefs.v517rawFormatEnabled517
    BiliClient.prefs.v517rawFormatEnabled517 = !current
    AppToast.show(this, "Raw Format Enabled517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517ReadAutoScroll517Toggle() {
    val current = BiliClient.prefs.v517readAutoScroll517
    BiliClient.prefs.v517readAutoScroll517 = !current
    AppToast.show(this, "Read Auto Scroll517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517ReadyStateAuto517Toggle() {
    val current = BiliClient.prefs.v517readyStateAuto517
    BiliClient.prefs.v517readyStateAuto517 = !current
    AppToast.show(this, "Ready State Auto517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517RealTimeSync517Toggle() {
    val current = BiliClient.prefs.v517realTimeSync517
    BiliClient.prefs.v517realTimeSync517 = !current
    AppToast.show(this, "Real Time Sync517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517RebuildAutoIndex517Toggle() {
    val current = BiliClient.prefs.v517rebuildAutoIndex517
    BiliClient.prefs.v517rebuildAutoIndex517 = !current
    AppToast.show(this, "Rebuild Auto Index517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517RecentAutoClean517Toggle() {
    val current = BiliClient.prefs.v517recentAutoClean517
    BiliClient.prefs.v517recentAutoClean517 = !current
    AppToast.show(this, "Recent Auto Clean517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517RecoverAutoBackup517Toggle() {
    val current = BiliClient.prefs.v517recoverAutoBackup517
    BiliClient.prefs.v517recoverAutoBackup517 = !current
    AppToast.show(this, "Recover Auto Backup517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV517RegionAutoSelect517Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v517regionAutoSelect517).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select517",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v517regionAutoSelect517 = value
        AppToast.show(this, "Region Auto Select517: $value")
    }
}

internal fun PlayerActivity.showV517RemoteAutoConnect517Toggle() {
    val current = BiliClient.prefs.v517remoteAutoConnect517
    BiliClient.prefs.v517remoteAutoConnect517 = !current
    AppToast.show(this, "Remote Auto Connect517: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518ProgressAutoSave518Toggle() {
    val current = BiliClient.prefs.v518progressAutoSave518
    BiliClient.prefs.v518progressAutoSave518 = !current
    AppToast.show(this, "Progress Auto Save518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518ProjectAutoSync518Toggle() {
    val current = BiliClient.prefs.v518projectAutoSync518
    BiliClient.prefs.v518projectAutoSync518 = !current
    AppToast.show(this, "Project Auto Sync518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518PromptAutoShow518Toggle() {
    val current = BiliClient.prefs.v518promptAutoShow518
    BiliClient.prefs.v518promptAutoShow518 = !current
    AppToast.show(this, "Prompt Auto Show518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518PushNotificationAuto518Toggle() {
    val current = BiliClient.prefs.v518pushNotificationAuto518
    BiliClient.prefs.v518pushNotificationAuto518 = !current
    AppToast.show(this, "Push Notification Auto518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518RangeAutoDetect518Toggle() {
    val current = BiliClient.prefs.v518rangeAutoDetect518
    BiliClient.prefs.v518rangeAutoDetect518 = !current
    AppToast.show(this, "Range Auto Detect518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518RateAutoAdjust518Toggle() {
    val current = BiliClient.prefs.v518rateAutoAdjust518
    BiliClient.prefs.v518rateAutoAdjust518 = !current
    AppToast.show(this, "Rate Auto Adjust518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518RawFormatEnabled518Toggle() {
    val current = BiliClient.prefs.v518rawFormatEnabled518
    BiliClient.prefs.v518rawFormatEnabled518 = !current
    AppToast.show(this, "Raw Format Enabled518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518ReadAutoScroll518Toggle() {
    val current = BiliClient.prefs.v518readAutoScroll518
    BiliClient.prefs.v518readAutoScroll518 = !current
    AppToast.show(this, "Read Auto Scroll518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518ReadyStateAuto518Toggle() {
    val current = BiliClient.prefs.v518readyStateAuto518
    BiliClient.prefs.v518readyStateAuto518 = !current
    AppToast.show(this, "Ready State Auto518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518RealTimeSync518Toggle() {
    val current = BiliClient.prefs.v518realTimeSync518
    BiliClient.prefs.v518realTimeSync518 = !current
    AppToast.show(this, "Real Time Sync518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518RebuildAutoIndex518Toggle() {
    val current = BiliClient.prefs.v518rebuildAutoIndex518
    BiliClient.prefs.v518rebuildAutoIndex518 = !current
    AppToast.show(this, "Rebuild Auto Index518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518RecentAutoClean518Toggle() {
    val current = BiliClient.prefs.v518recentAutoClean518
    BiliClient.prefs.v518recentAutoClean518 = !current
    AppToast.show(this, "Recent Auto Clean518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518RecoverAutoBackup518Toggle() {
    val current = BiliClient.prefs.v518recoverAutoBackup518
    BiliClient.prefs.v518recoverAutoBackup518 = !current
    AppToast.show(this, "Recover Auto Backup518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV518RegionAutoSelect518Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v518regionAutoSelect518).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select518",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v518regionAutoSelect518 = value
        AppToast.show(this, "Region Auto Select518: $value")
    }
}

internal fun PlayerActivity.showV518RemoteAutoConnect518Toggle() {
    val current = BiliClient.prefs.v518remoteAutoConnect518
    BiliClient.prefs.v518remoteAutoConnect518 = !current
    AppToast.show(this, "Remote Auto Connect518: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519ProgressAutoSave519Toggle() {
    val current = BiliClient.prefs.v519progressAutoSave519
    BiliClient.prefs.v519progressAutoSave519 = !current
    AppToast.show(this, "Progress Auto Save519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519ProjectAutoSync519Toggle() {
    val current = BiliClient.prefs.v519projectAutoSync519
    BiliClient.prefs.v519projectAutoSync519 = !current
    AppToast.show(this, "Project Auto Sync519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519PromptAutoShow519Toggle() {
    val current = BiliClient.prefs.v519promptAutoShow519
    BiliClient.prefs.v519promptAutoShow519 = !current
    AppToast.show(this, "Prompt Auto Show519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519PushNotificationAuto519Toggle() {
    val current = BiliClient.prefs.v519pushNotificationAuto519
    BiliClient.prefs.v519pushNotificationAuto519 = !current
    AppToast.show(this, "Push Notification Auto519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519RangeAutoDetect519Toggle() {
    val current = BiliClient.prefs.v519rangeAutoDetect519
    BiliClient.prefs.v519rangeAutoDetect519 = !current
    AppToast.show(this, "Range Auto Detect519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519RateAutoAdjust519Toggle() {
    val current = BiliClient.prefs.v519rateAutoAdjust519
    BiliClient.prefs.v519rateAutoAdjust519 = !current
    AppToast.show(this, "Rate Auto Adjust519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519RawFormatEnabled519Toggle() {
    val current = BiliClient.prefs.v519rawFormatEnabled519
    BiliClient.prefs.v519rawFormatEnabled519 = !current
    AppToast.show(this, "Raw Format Enabled519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519ReadAutoScroll519Toggle() {
    val current = BiliClient.prefs.v519readAutoScroll519
    BiliClient.prefs.v519readAutoScroll519 = !current
    AppToast.show(this, "Read Auto Scroll519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519ReadyStateAuto519Toggle() {
    val current = BiliClient.prefs.v519readyStateAuto519
    BiliClient.prefs.v519readyStateAuto519 = !current
    AppToast.show(this, "Ready State Auto519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519RealTimeSync519Toggle() {
    val current = BiliClient.prefs.v519realTimeSync519
    BiliClient.prefs.v519realTimeSync519 = !current
    AppToast.show(this, "Real Time Sync519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519RebuildAutoIndex519Toggle() {
    val current = BiliClient.prefs.v519rebuildAutoIndex519
    BiliClient.prefs.v519rebuildAutoIndex519 = !current
    AppToast.show(this, "Rebuild Auto Index519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519RecentAutoClean519Toggle() {
    val current = BiliClient.prefs.v519recentAutoClean519
    BiliClient.prefs.v519recentAutoClean519 = !current
    AppToast.show(this, "Recent Auto Clean519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519RecoverAutoBackup519Toggle() {
    val current = BiliClient.prefs.v519recoverAutoBackup519
    BiliClient.prefs.v519recoverAutoBackup519 = !current
    AppToast.show(this, "Recover Auto Backup519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV519RegionAutoSelect519Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v519regionAutoSelect519).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select519",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v519regionAutoSelect519 = value
        AppToast.show(this, "Region Auto Select519: $value")
    }
}

internal fun PlayerActivity.showV519RemoteAutoConnect519Toggle() {
    val current = BiliClient.prefs.v519remoteAutoConnect519
    BiliClient.prefs.v519remoteAutoConnect519 = !current
    AppToast.show(this, "Remote Auto Connect519: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520ProgressAutoSave520Toggle() {
    val current = BiliClient.prefs.v520progressAutoSave520
    BiliClient.prefs.v520progressAutoSave520 = !current
    AppToast.show(this, "Progress Auto Save520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520ProjectAutoSync520Toggle() {
    val current = BiliClient.prefs.v520projectAutoSync520
    BiliClient.prefs.v520projectAutoSync520 = !current
    AppToast.show(this, "Project Auto Sync520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520PromptAutoShow520Toggle() {
    val current = BiliClient.prefs.v520promptAutoShow520
    BiliClient.prefs.v520promptAutoShow520 = !current
    AppToast.show(this, "Prompt Auto Show520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520PushNotificationAuto520Toggle() {
    val current = BiliClient.prefs.v520pushNotificationAuto520
    BiliClient.prefs.v520pushNotificationAuto520 = !current
    AppToast.show(this, "Push Notification Auto520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520RangeAutoDetect520Toggle() {
    val current = BiliClient.prefs.v520rangeAutoDetect520
    BiliClient.prefs.v520rangeAutoDetect520 = !current
    AppToast.show(this, "Range Auto Detect520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520RateAutoAdjust520Toggle() {
    val current = BiliClient.prefs.v520rateAutoAdjust520
    BiliClient.prefs.v520rateAutoAdjust520 = !current
    AppToast.show(this, "Rate Auto Adjust520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520RawFormatEnabled520Toggle() {
    val current = BiliClient.prefs.v520rawFormatEnabled520
    BiliClient.prefs.v520rawFormatEnabled520 = !current
    AppToast.show(this, "Raw Format Enabled520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520ReadAutoScroll520Toggle() {
    val current = BiliClient.prefs.v520readAutoScroll520
    BiliClient.prefs.v520readAutoScroll520 = !current
    AppToast.show(this, "Read Auto Scroll520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520ReadyStateAuto520Toggle() {
    val current = BiliClient.prefs.v520readyStateAuto520
    BiliClient.prefs.v520readyStateAuto520 = !current
    AppToast.show(this, "Ready State Auto520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520RealTimeSync520Toggle() {
    val current = BiliClient.prefs.v520realTimeSync520
    BiliClient.prefs.v520realTimeSync520 = !current
    AppToast.show(this, "Real Time Sync520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520RebuildAutoIndex520Toggle() {
    val current = BiliClient.prefs.v520rebuildAutoIndex520
    BiliClient.prefs.v520rebuildAutoIndex520 = !current
    AppToast.show(this, "Rebuild Auto Index520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520RecentAutoClean520Toggle() {
    val current = BiliClient.prefs.v520recentAutoClean520
    BiliClient.prefs.v520recentAutoClean520 = !current
    AppToast.show(this, "Recent Auto Clean520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520RecoverAutoBackup520Toggle() {
    val current = BiliClient.prefs.v520recoverAutoBackup520
    BiliClient.prefs.v520recoverAutoBackup520 = !current
    AppToast.show(this, "Recover Auto Backup520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV520RegionAutoSelect520Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v520regionAutoSelect520).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select520",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v520regionAutoSelect520 = value
        AppToast.show(this, "Region Auto Select520: $value")
    }
}

internal fun PlayerActivity.showV520RemoteAutoConnect520Toggle() {
    val current = BiliClient.prefs.v520remoteAutoConnect520
    BiliClient.prefs.v520remoteAutoConnect520 = !current
    AppToast.show(this, "Remote Auto Connect520: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV521RemoveAutoConfirm521Toggle() {
    val current = BiliClient.prefs.v521removeAutoConfirm521
    BiliClient.prefs.v521removeAutoConfirm521 = !current
    AppToast.show(this, "Remove Auto Confirm521: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV521RenderAutoQuality521Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v521renderAutoQuality521).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality521",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v521renderAutoQuality521 = value
        AppToast.show(this, "Render Auto Quality521: $value")
    }
}

internal fun PlayerActivity.showV521RequestAutoRetry521Toggle() {
    val current = BiliClient.prefs.v521requestAutoRetry521
    BiliClient.prefs.v521requestAutoRetry521 = !current
    AppToast.show(this, "Request Auto Retry521: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV521ResetAutoDefault521Toggle() {
    val current = BiliClient.prefs.v521resetAutoDefault521
    BiliClient.prefs.v521resetAutoDefault521 = !current
    AppToast.show(this, "Reset Auto Default521: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV521ResizeAutoScale521Toggle() {
    val current = BiliClient.prefs.v521resizeAutoScale521
    BiliClient.prefs.v521resizeAutoScale521 = !current
    AppToast.show(this, "Resize Auto Scale521: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV521ResponseAutoCache521Toggle() {
    val current = BiliClient.prefs.v521responseAutoCache521
    BiliClient.prefs.v521responseAutoCache521 = !current
    AppToast.show(this, "Response Auto Cache521: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV521RestoreAutoState521Toggle() {
    val current = BiliClient.prefs.v521restoreAutoState521
    BiliClient.prefs.v521restoreAutoState521 = !current
    AppToast.show(this, "Restore Auto State521: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV521ResultAutoSort521Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v521resultAutoSort521).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort521",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v521resultAutoSort521 = value
        AppToast.show(this, "Result Auto Sort521: $value")
    }
}

internal fun PlayerActivity.showV521ReturnToTop521Toggle() {
    val current = BiliClient.prefs.v521returnToTop521
    BiliClient.prefs.v521returnToTop521 = !current
    AppToast.show(this, "Return To Top521: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV521RichTextEnabled521Toggle() {
    val current = BiliClient.prefs.v521richTextEnabled521
    BiliClient.prefs.v521richTextEnabled521 = !current
    AppToast.show(this, "Rich Text Enabled521: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV521RingAutoVibrate521Toggle() {
    val current = BiliClient.prefs.v521ringAutoVibrate521
    BiliClient.prefs.v521ringAutoVibrate521 = !current
    AppToast.show(this, "Ring Auto Vibrate521: ${if (!current) "ON" else "OFF"}")
}

