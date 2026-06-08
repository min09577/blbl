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

// v503: Plugin Auto Update503
internal fun PlayerActivity.showV503PluginAutoUpdate503Toggle() {
    val current = BiliClient.prefs.v503pluginAutoUpdate503
    BiliClient.prefs.v503pluginAutoUpdate503 = !current
    AppToast.show(this, "Plugin Auto Update503: ${if (!current) "ON" else "OFF"}")
}

// v503: Pop Up Auto Dismiss503
internal fun PlayerActivity.showV503PopUpAutoDismiss503Toggle() {
    val current = BiliClient.prefs.v503popUpAutoDismiss503
    BiliClient.prefs.v503popUpAutoDismiss503 = !current
    AppToast.show(this, "Pop Up Auto Dismiss503: ${if (!current) "ON" else "OFF"}")
}

// v503: Port Auto Scan503
internal fun PlayerActivity.showV503PortAutoScan503Toggle() {
    val current = BiliClient.prefs.v503portAutoScan503
    BiliClient.prefs.v503portAutoScan503 = !current
    AppToast.show(this, "Port Auto Scan503: ${if (!current) "ON" else "OFF"}")
}

// v503: Post Auto Share503
internal fun PlayerActivity.showV503PostAutoShare503Toggle() {
    val current = BiliClient.prefs.v503postAutoShare503
    BiliClient.prefs.v503postAutoShare503 = !current
    AppToast.show(this, "Post Auto Share503: ${if (!current) "ON" else "OFF"}")
}

// v503: Power Save Mode503
internal fun PlayerActivity.showV503PowerSaveMode503Toggle() {
    val current = BiliClient.prefs.v503powerSaveMode503
    BiliClient.prefs.v503powerSaveMode503 = !current
    AppToast.show(this, "Power Save Mode503: ${if (!current) "ON" else "OFF"}")
}

// v503: Pre Buffer Enabled503
internal fun PlayerActivity.showV503PreBufferEnabled503Toggle() {
    val current = BiliClient.prefs.v503preBufferEnabled503
    BiliClient.prefs.v503preBufferEnabled503 = !current
    AppToast.show(this, "Pre Buffer Enabled503: ${if (!current) "ON" else "OFF"}")
}

// v503: Prefix Auto Trim503
internal fun PlayerActivity.showV503PrefixAutoTrim503Toggle() {
    val current = BiliClient.prefs.v503prefixAutoTrim503
    BiliClient.prefs.v503prefixAutoTrim503 = !current
    AppToast.show(this, "Prefix Auto Trim503: ${if (!current) "ON" else "OFF"}")
}

// v503: Press And Hold Action503
internal fun PlayerActivity.showV503PressAndHoldAction503Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v503pressAndHoldAction503).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action503",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v503pressAndHoldAction503 = value
        AppToast.show(this, "Press And Hold Action503: $value")
    }
}

// v503: Primary Audio Track503
internal fun PlayerActivity.showV503PrimaryAudioTrack503Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v503primaryAudioTrack503).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track503",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v503primaryAudioTrack503 = value
        AppToast.show(this, "Primary Audio Track503: $value")
    }
}

// v503: Print Auto Format503
internal fun PlayerActivity.showV503PrintAutoFormat503Toggle() {
    val current = BiliClient.prefs.v503printAutoFormat503
    BiliClient.prefs.v503printAutoFormat503 = !current
    AppToast.show(this, "Print Auto Format503: ${if (!current) "ON" else "OFF"}")
}

// v503: Priority Queue Enabled503
internal fun PlayerActivity.showV503PriorityQueueEnabled503Toggle() {
    val current = BiliClient.prefs.v503priorityQueueEnabled503
    BiliClient.prefs.v503priorityQueueEnabled503 = !current
    AppToast.show(this, "Priority Queue Enabled503: ${if (!current) "ON" else "OFF"}")
}

// v503: Private Mode Auto503
internal fun PlayerActivity.showV503PrivateModeAuto503Toggle() {
    val current = BiliClient.prefs.v503privateModeAuto503
    BiliClient.prefs.v503privateModeAuto503 = !current
    AppToast.show(this, "Private Mode Auto503: ${if (!current) "ON" else "OFF"}")
}

// v504: Place Auto Detect504
internal fun PlayerActivity.showV504PlaceAutoDetect504Toggle() {
    val current = BiliClient.prefs.v504placeAutoDetect504
    BiliClient.prefs.v504placeAutoDetect504 = !current
    AppToast.show(this, "Place Auto Detect504: ${if (!current) "ON" else "OFF"}")
}

// v504: Platform Auto Adapt504
internal fun PlayerActivity.showV504PlatformAutoAdapt504Toggle() {
    val current = BiliClient.prefs.v504platformAutoAdapt504
    BiliClient.prefs.v504platformAutoAdapt504 = !current
    AppToast.show(this, "Platform Auto Adapt504: ${if (!current) "ON" else "OFF"}")
}

// v504: Play Auto Resume504
internal fun PlayerActivity.showV504PlayAutoResume504Toggle() {
    val current = BiliClient.prefs.v504playAutoResume504
    BiliClient.prefs.v504playAutoResume504 = !current
    AppToast.show(this, "Play Auto Resume504: ${if (!current) "ON" else "OFF"}")
}

// v504: Plugin Auto Update504
internal fun PlayerActivity.showV504PluginAutoUpdate504Toggle() {
    val current = BiliClient.prefs.v504pluginAutoUpdate504
    BiliClient.prefs.v504pluginAutoUpdate504 = !current
    AppToast.show(this, "Plugin Auto Update504: ${if (!current) "ON" else "OFF"}")
}

// v504: Pop Up Auto Dismiss504
internal fun PlayerActivity.showV504PopUpAutoDismiss504Toggle() {
    val current = BiliClient.prefs.v504popUpAutoDismiss504
    BiliClient.prefs.v504popUpAutoDismiss504 = !current
    AppToast.show(this, "Pop Up Auto Dismiss504: ${if (!current) "ON" else "OFF"}")
}

// v504: Port Auto Scan504
internal fun PlayerActivity.showV504PortAutoScan504Toggle() {
    val current = BiliClient.prefs.v504portAutoScan504
    BiliClient.prefs.v504portAutoScan504 = !current
    AppToast.show(this, "Port Auto Scan504: ${if (!current) "ON" else "OFF"}")
}

// v504: Post Auto Share504
internal fun PlayerActivity.showV504PostAutoShare504Toggle() {
    val current = BiliClient.prefs.v504postAutoShare504
    BiliClient.prefs.v504postAutoShare504 = !current
    AppToast.show(this, "Post Auto Share504: ${if (!current) "ON" else "OFF"}")
}

// v504: Power Save Mode504
internal fun PlayerActivity.showV504PowerSaveMode504Toggle() {
    val current = BiliClient.prefs.v504powerSaveMode504
    BiliClient.prefs.v504powerSaveMode504 = !current
    AppToast.show(this, "Power Save Mode504: ${if (!current) "ON" else "OFF"}")
}

// v504: Pre Buffer Enabled504
internal fun PlayerActivity.showV504PreBufferEnabled504Toggle() {
    val current = BiliClient.prefs.v504preBufferEnabled504
    BiliClient.prefs.v504preBufferEnabled504 = !current
    AppToast.show(this, "Pre Buffer Enabled504: ${if (!current) "ON" else "OFF"}")
}

// v504: Prefix Auto Trim504
internal fun PlayerActivity.showV504PrefixAutoTrim504Toggle() {
    val current = BiliClient.prefs.v504prefixAutoTrim504
    BiliClient.prefs.v504prefixAutoTrim504 = !current
    AppToast.show(this, "Prefix Auto Trim504: ${if (!current) "ON" else "OFF"}")
}

// v504: Press And Hold Action504
internal fun PlayerActivity.showV504PressAndHoldAction504Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v504pressAndHoldAction504).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action504",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v504pressAndHoldAction504 = value
        AppToast.show(this, "Press And Hold Action504: $value")
    }
}

// v504: Primary Audio Track504
internal fun PlayerActivity.showV504PrimaryAudioTrack504Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v504primaryAudioTrack504).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track504",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v504primaryAudioTrack504 = value
        AppToast.show(this, "Primary Audio Track504: $value")
    }
}

// v504: Print Auto Format504
internal fun PlayerActivity.showV504PrintAutoFormat504Toggle() {
    val current = BiliClient.prefs.v504printAutoFormat504
    BiliClient.prefs.v504printAutoFormat504 = !current
    AppToast.show(this, "Print Auto Format504: ${if (!current) "ON" else "OFF"}")
}

// v504: Priority Queue Enabled504
internal fun PlayerActivity.showV504PriorityQueueEnabled504Toggle() {
    val current = BiliClient.prefs.v504priorityQueueEnabled504
    BiliClient.prefs.v504priorityQueueEnabled504 = !current
    AppToast.show(this, "Priority Queue Enabled504: ${if (!current) "ON" else "OFF"}")
}

// v504: Private Mode Auto504
internal fun PlayerActivity.showV504PrivateModeAuto504Toggle() {
    val current = BiliClient.prefs.v504privateModeAuto504
    BiliClient.prefs.v504privateModeAuto504 = !current
    AppToast.show(this, "Private Mode Auto504: ${if (!current) "ON" else "OFF"}")
}

// v505: Place Auto Detect505
internal fun PlayerActivity.showV505PlaceAutoDetect505Toggle() {
    val current = BiliClient.prefs.v505placeAutoDetect505
    BiliClient.prefs.v505placeAutoDetect505 = !current
    AppToast.show(this, "Place Auto Detect505: ${if (!current) "ON" else "OFF"}")
}

// v505: Platform Auto Adapt505
internal fun PlayerActivity.showV505PlatformAutoAdapt505Toggle() {
    val current = BiliClient.prefs.v505platformAutoAdapt505
    BiliClient.prefs.v505platformAutoAdapt505 = !current
    AppToast.show(this, "Platform Auto Adapt505: ${if (!current) "ON" else "OFF"}")
}

// v505: Play Auto Resume505
internal fun PlayerActivity.showV505PlayAutoResume505Toggle() {
    val current = BiliClient.prefs.v505playAutoResume505
    BiliClient.prefs.v505playAutoResume505 = !current
    AppToast.show(this, "Play Auto Resume505: ${if (!current) "ON" else "OFF"}")
}

// v505: Plugin Auto Update505
internal fun PlayerActivity.showV505PluginAutoUpdate505Toggle() {
    val current = BiliClient.prefs.v505pluginAutoUpdate505
    BiliClient.prefs.v505pluginAutoUpdate505 = !current
    AppToast.show(this, "Plugin Auto Update505: ${if (!current) "ON" else "OFF"}")
}

// v505: Pop Up Auto Dismiss505
internal fun PlayerActivity.showV505PopUpAutoDismiss505Toggle() {
    val current = BiliClient.prefs.v505popUpAutoDismiss505
    BiliClient.prefs.v505popUpAutoDismiss505 = !current
    AppToast.show(this, "Pop Up Auto Dismiss505: ${if (!current) "ON" else "OFF"}")
}

// v505: Port Auto Scan505
internal fun PlayerActivity.showV505PortAutoScan505Toggle() {
    val current = BiliClient.prefs.v505portAutoScan505
    BiliClient.prefs.v505portAutoScan505 = !current
    AppToast.show(this, "Port Auto Scan505: ${if (!current) "ON" else "OFF"}")
}

// v505: Post Auto Share505
internal fun PlayerActivity.showV505PostAutoShare505Toggle() {
    val current = BiliClient.prefs.v505postAutoShare505
    BiliClient.prefs.v505postAutoShare505 = !current
    AppToast.show(this, "Post Auto Share505: ${if (!current) "ON" else "OFF"}")
}

// v505: Power Save Mode505
internal fun PlayerActivity.showV505PowerSaveMode505Toggle() {
    val current = BiliClient.prefs.v505powerSaveMode505
    BiliClient.prefs.v505powerSaveMode505 = !current
    AppToast.show(this, "Power Save Mode505: ${if (!current) "ON" else "OFF"}")
}

// v505: Pre Buffer Enabled505
internal fun PlayerActivity.showV505PreBufferEnabled505Toggle() {
    val current = BiliClient.prefs.v505preBufferEnabled505
    BiliClient.prefs.v505preBufferEnabled505 = !current
    AppToast.show(this, "Pre Buffer Enabled505: ${if (!current) "ON" else "OFF"}")
}

// v505: Prefix Auto Trim505
internal fun PlayerActivity.showV505PrefixAutoTrim505Toggle() {
    val current = BiliClient.prefs.v505prefixAutoTrim505
    BiliClient.prefs.v505prefixAutoTrim505 = !current
    AppToast.show(this, "Prefix Auto Trim505: ${if (!current) "ON" else "OFF"}")
}

// v505: Press And Hold Action505
internal fun PlayerActivity.showV505PressAndHoldAction505Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v505pressAndHoldAction505).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action505",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v505pressAndHoldAction505 = value
        AppToast.show(this, "Press And Hold Action505: $value")
    }
}

// v505: Primary Audio Track505
internal fun PlayerActivity.showV505PrimaryAudioTrack505Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v505primaryAudioTrack505).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track505",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v505primaryAudioTrack505 = value
        AppToast.show(this, "Primary Audio Track505: $value")
    }
}

// v505: Print Auto Format505
internal fun PlayerActivity.showV505PrintAutoFormat505Toggle() {
    val current = BiliClient.prefs.v505printAutoFormat505
    BiliClient.prefs.v505printAutoFormat505 = !current
    AppToast.show(this, "Print Auto Format505: ${if (!current) "ON" else "OFF"}")
}

// v505: Priority Queue Enabled505
internal fun PlayerActivity.showV505PriorityQueueEnabled505Toggle() {
    val current = BiliClient.prefs.v505priorityQueueEnabled505
    BiliClient.prefs.v505priorityQueueEnabled505 = !current
    AppToast.show(this, "Priority Queue Enabled505: ${if (!current) "ON" else "OFF"}")
}

// v505: Private Mode Auto505
internal fun PlayerActivity.showV505PrivateModeAuto505Toggle() {
    val current = BiliClient.prefs.v505privateModeAuto505
    BiliClient.prefs.v505privateModeAuto505 = !current
    AppToast.show(this, "Private Mode Auto505: ${if (!current) "ON" else "OFF"}")
}

// v506: Place Auto Detect506
internal fun PlayerActivity.showV506PlaceAutoDetect506Toggle() {
    val current = BiliClient.prefs.v506placeAutoDetect506
    BiliClient.prefs.v506placeAutoDetect506 = !current
    AppToast.show(this, "Place Auto Detect506: ${if (!current) "ON" else "OFF"}")
}

// v506: Platform Auto Adapt506
internal fun PlayerActivity.showV506PlatformAutoAdapt506Toggle() {
    val current = BiliClient.prefs.v506platformAutoAdapt506
    BiliClient.prefs.v506platformAutoAdapt506 = !current
    AppToast.show(this, "Platform Auto Adapt506: ${if (!current) "ON" else "OFF"}")
}

// v506: Play Auto Resume506
internal fun PlayerActivity.showV506PlayAutoResume506Toggle() {
    val current = BiliClient.prefs.v506playAutoResume506
    BiliClient.prefs.v506playAutoResume506 = !current
    AppToast.show(this, "Play Auto Resume506: ${if (!current) "ON" else "OFF"}")
}

// v506: Plugin Auto Update506
internal fun PlayerActivity.showV506PluginAutoUpdate506Toggle() {
    val current = BiliClient.prefs.v506pluginAutoUpdate506
    BiliClient.prefs.v506pluginAutoUpdate506 = !current
    AppToast.show(this, "Plugin Auto Update506: ${if (!current) "ON" else "OFF"}")
}

// v506: Pop Up Auto Dismiss506
internal fun PlayerActivity.showV506PopUpAutoDismiss506Toggle() {
    val current = BiliClient.prefs.v506popUpAutoDismiss506
    BiliClient.prefs.v506popUpAutoDismiss506 = !current
    AppToast.show(this, "Pop Up Auto Dismiss506: ${if (!current) "ON" else "OFF"}")
}

// v506: Port Auto Scan506
internal fun PlayerActivity.showV506PortAutoScan506Toggle() {
    val current = BiliClient.prefs.v506portAutoScan506
    BiliClient.prefs.v506portAutoScan506 = !current
    AppToast.show(this, "Port Auto Scan506: ${if (!current) "ON" else "OFF"}")
}

// v506: Post Auto Share506
internal fun PlayerActivity.showV506PostAutoShare506Toggle() {
    val current = BiliClient.prefs.v506postAutoShare506
    BiliClient.prefs.v506postAutoShare506 = !current
    AppToast.show(this, "Post Auto Share506: ${if (!current) "ON" else "OFF"}")
}

// v506: Power Save Mode506
internal fun PlayerActivity.showV506PowerSaveMode506Toggle() {
    val current = BiliClient.prefs.v506powerSaveMode506
    BiliClient.prefs.v506powerSaveMode506 = !current
    AppToast.show(this, "Power Save Mode506: ${if (!current) "ON" else "OFF"}")
}

// v506: Pre Buffer Enabled506
internal fun PlayerActivity.showV506PreBufferEnabled506Toggle() {
    val current = BiliClient.prefs.v506preBufferEnabled506
    BiliClient.prefs.v506preBufferEnabled506 = !current
    AppToast.show(this, "Pre Buffer Enabled506: ${if (!current) "ON" else "OFF"}")
}

// v506: Prefix Auto Trim506
internal fun PlayerActivity.showV506PrefixAutoTrim506Toggle() {
    val current = BiliClient.prefs.v506prefixAutoTrim506
    BiliClient.prefs.v506prefixAutoTrim506 = !current
    AppToast.show(this, "Prefix Auto Trim506: ${if (!current) "ON" else "OFF"}")
}

// v506: Press And Hold Action506
internal fun PlayerActivity.showV506PressAndHoldAction506Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v506pressAndHoldAction506).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action506",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v506pressAndHoldAction506 = value
        AppToast.show(this, "Press And Hold Action506: $value")
    }
}

// v506: Primary Audio Track506
internal fun PlayerActivity.showV506PrimaryAudioTrack506Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v506primaryAudioTrack506).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track506",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v506primaryAudioTrack506 = value
        AppToast.show(this, "Primary Audio Track506: $value")
    }
}

// v506: Print Auto Format506
internal fun PlayerActivity.showV506PrintAutoFormat506Toggle() {
    val current = BiliClient.prefs.v506printAutoFormat506
    BiliClient.prefs.v506printAutoFormat506 = !current
    AppToast.show(this, "Print Auto Format506: ${if (!current) "ON" else "OFF"}")
}

// v506: Priority Queue Enabled506
internal fun PlayerActivity.showV506PriorityQueueEnabled506Toggle() {
    val current = BiliClient.prefs.v506priorityQueueEnabled506
    BiliClient.prefs.v506priorityQueueEnabled506 = !current
    AppToast.show(this, "Priority Queue Enabled506: ${if (!current) "ON" else "OFF"}")
}

// v506: Private Mode Auto506
internal fun PlayerActivity.showV506PrivateModeAuto506Toggle() {
    val current = BiliClient.prefs.v506privateModeAuto506
    BiliClient.prefs.v506privateModeAuto506 = !current
    AppToast.show(this, "Private Mode Auto506: ${if (!current) "ON" else "OFF"}")
}

// v507: Place Auto Detect507
internal fun PlayerActivity.showV507PlaceAutoDetect507Toggle() {
    val current = BiliClient.prefs.v507placeAutoDetect507
    BiliClient.prefs.v507placeAutoDetect507 = !current
    AppToast.show(this, "Place Auto Detect507: ${if (!current) "ON" else "OFF"}")
}

// v507: Platform Auto Adapt507
internal fun PlayerActivity.showV507PlatformAutoAdapt507Toggle() {
    val current = BiliClient.prefs.v507platformAutoAdapt507
    BiliClient.prefs.v507platformAutoAdapt507 = !current
    AppToast.show(this, "Platform Auto Adapt507: ${if (!current) "ON" else "OFF"}")
}

// v507: Play Auto Resume507
internal fun PlayerActivity.showV507PlayAutoResume507Toggle() {
    val current = BiliClient.prefs.v507playAutoResume507
    BiliClient.prefs.v507playAutoResume507 = !current
    AppToast.show(this, "Play Auto Resume507: ${if (!current) "ON" else "OFF"}")
}

// v507: Plugin Auto Update507
internal fun PlayerActivity.showV507PluginAutoUpdate507Toggle() {
    val current = BiliClient.prefs.v507pluginAutoUpdate507
    BiliClient.prefs.v507pluginAutoUpdate507 = !current
    AppToast.show(this, "Plugin Auto Update507: ${if (!current) "ON" else "OFF"}")
}

// v507: Pop Up Auto Dismiss507
internal fun PlayerActivity.showV507PopUpAutoDismiss507Toggle() {
    val current = BiliClient.prefs.v507popUpAutoDismiss507
    BiliClient.prefs.v507popUpAutoDismiss507 = !current
    AppToast.show(this, "Pop Up Auto Dismiss507: ${if (!current) "ON" else "OFF"}")
}

// v507: Port Auto Scan507
internal fun PlayerActivity.showV507PortAutoScan507Toggle() {
    val current = BiliClient.prefs.v507portAutoScan507
    BiliClient.prefs.v507portAutoScan507 = !current
    AppToast.show(this, "Port Auto Scan507: ${if (!current) "ON" else "OFF"}")
}

// v507: Post Auto Share507
internal fun PlayerActivity.showV507PostAutoShare507Toggle() {
    val current = BiliClient.prefs.v507postAutoShare507
    BiliClient.prefs.v507postAutoShare507 = !current
    AppToast.show(this, "Post Auto Share507: ${if (!current) "ON" else "OFF"}")
}

// v507: Power Save Mode507
internal fun PlayerActivity.showV507PowerSaveMode507Toggle() {
    val current = BiliClient.prefs.v507powerSaveMode507
    BiliClient.prefs.v507powerSaveMode507 = !current
    AppToast.show(this, "Power Save Mode507: ${if (!current) "ON" else "OFF"}")
}

// v507: Pre Buffer Enabled507
internal fun PlayerActivity.showV507PreBufferEnabled507Toggle() {
    val current = BiliClient.prefs.v507preBufferEnabled507
    BiliClient.prefs.v507preBufferEnabled507 = !current
    AppToast.show(this, "Pre Buffer Enabled507: ${if (!current) "ON" else "OFF"}")
}

// v507: Prefix Auto Trim507
internal fun PlayerActivity.showV507PrefixAutoTrim507Toggle() {
    val current = BiliClient.prefs.v507prefixAutoTrim507
    BiliClient.prefs.v507prefixAutoTrim507 = !current
    AppToast.show(this, "Prefix Auto Trim507: ${if (!current) "ON" else "OFF"}")
}

// v507: Press And Hold Action507
internal fun PlayerActivity.showV507PressAndHoldAction507Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v507pressAndHoldAction507).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action507",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v507pressAndHoldAction507 = value
        AppToast.show(this, "Press And Hold Action507: $value")
    }
}

// v507: Primary Audio Track507
internal fun PlayerActivity.showV507PrimaryAudioTrack507Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v507primaryAudioTrack507).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track507",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v507primaryAudioTrack507 = value
        AppToast.show(this, "Primary Audio Track507: $value")
    }
}

// v507: Print Auto Format507
internal fun PlayerActivity.showV507PrintAutoFormat507Toggle() {
    val current = BiliClient.prefs.v507printAutoFormat507
    BiliClient.prefs.v507printAutoFormat507 = !current
    AppToast.show(this, "Print Auto Format507: ${if (!current) "ON" else "OFF"}")
}

// v507: Priority Queue Enabled507
internal fun PlayerActivity.showV507PriorityQueueEnabled507Toggle() {
    val current = BiliClient.prefs.v507priorityQueueEnabled507
    BiliClient.prefs.v507priorityQueueEnabled507 = !current
    AppToast.show(this, "Priority Queue Enabled507: ${if (!current) "ON" else "OFF"}")
}

// v507: Private Mode Auto507
internal fun PlayerActivity.showV507PrivateModeAuto507Toggle() {
    val current = BiliClient.prefs.v507privateModeAuto507
    BiliClient.prefs.v507privateModeAuto507 = !current
    AppToast.show(this, "Private Mode Auto507: ${if (!current) "ON" else "OFF"}")
}

// v508: Place Auto Detect508
internal fun PlayerActivity.showV508PlaceAutoDetect508Toggle() {
    val current = BiliClient.prefs.v508placeAutoDetect508
    BiliClient.prefs.v508placeAutoDetect508 = !current
    AppToast.show(this, "Place Auto Detect508: ${if (!current) "ON" else "OFF"}")
}

// v508: Platform Auto Adapt508
internal fun PlayerActivity.showV508PlatformAutoAdapt508Toggle() {
    val current = BiliClient.prefs.v508platformAutoAdapt508
    BiliClient.prefs.v508platformAutoAdapt508 = !current
    AppToast.show(this, "Platform Auto Adapt508: ${if (!current) "ON" else "OFF"}")
}

// v508: Play Auto Resume508
internal fun PlayerActivity.showV508PlayAutoResume508Toggle() {
    val current = BiliClient.prefs.v508playAutoResume508
    BiliClient.prefs.v508playAutoResume508 = !current
    AppToast.show(this, "Play Auto Resume508: ${if (!current) "ON" else "OFF"}")
}

// v508: Plugin Auto Update508
internal fun PlayerActivity.showV508PluginAutoUpdate508Toggle() {
    val current = BiliClient.prefs.v508pluginAutoUpdate508
    BiliClient.prefs.v508pluginAutoUpdate508 = !current
    AppToast.show(this, "Plugin Auto Update508: ${if (!current) "ON" else "OFF"}")
}

// v508: Pop Up Auto Dismiss508
internal fun PlayerActivity.showV508PopUpAutoDismiss508Toggle() {
    val current = BiliClient.prefs.v508popUpAutoDismiss508
    BiliClient.prefs.v508popUpAutoDismiss508 = !current
    AppToast.show(this, "Pop Up Auto Dismiss508: ${if (!current) "ON" else "OFF"}")
}

// v508: Port Auto Scan508
internal fun PlayerActivity.showV508PortAutoScan508Toggle() {
    val current = BiliClient.prefs.v508portAutoScan508
    BiliClient.prefs.v508portAutoScan508 = !current
    AppToast.show(this, "Port Auto Scan508: ${if (!current) "ON" else "OFF"}")
}

// v508: Post Auto Share508
internal fun PlayerActivity.showV508PostAutoShare508Toggle() {
    val current = BiliClient.prefs.v508postAutoShare508
    BiliClient.prefs.v508postAutoShare508 = !current
    AppToast.show(this, "Post Auto Share508: ${if (!current) "ON" else "OFF"}")
}

// v508: Power Save Mode508
internal fun PlayerActivity.showV508PowerSaveMode508Toggle() {
    val current = BiliClient.prefs.v508powerSaveMode508
    BiliClient.prefs.v508powerSaveMode508 = !current
    AppToast.show(this, "Power Save Mode508: ${if (!current) "ON" else "OFF"}")
}

// v508: Pre Buffer Enabled508
internal fun PlayerActivity.showV508PreBufferEnabled508Toggle() {
    val current = BiliClient.prefs.v508preBufferEnabled508
    BiliClient.prefs.v508preBufferEnabled508 = !current
    AppToast.show(this, "Pre Buffer Enabled508: ${if (!current) "ON" else "OFF"}")
}

// v508: Prefix Auto Trim508
internal fun PlayerActivity.showV508PrefixAutoTrim508Toggle() {
    val current = BiliClient.prefs.v508prefixAutoTrim508
    BiliClient.prefs.v508prefixAutoTrim508 = !current
    AppToast.show(this, "Prefix Auto Trim508: ${if (!current) "ON" else "OFF"}")
}

// v508: Press And Hold Action508
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

// v508: Primary Audio Track508
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

// v508: Print Auto Format508
internal fun PlayerActivity.showV508PrintAutoFormat508Toggle() {
    val current = BiliClient.prefs.v508printAutoFormat508
    BiliClient.prefs.v508printAutoFormat508 = !current
    AppToast.show(this, "Print Auto Format508: ${if (!current) "ON" else "OFF"}")
}

// v508: Priority Queue Enabled508
internal fun PlayerActivity.showV508PriorityQueueEnabled508Toggle() {
    val current = BiliClient.prefs.v508priorityQueueEnabled508
    BiliClient.prefs.v508priorityQueueEnabled508 = !current
    AppToast.show(this, "Priority Queue Enabled508: ${if (!current) "ON" else "OFF"}")
}

// v508: Private Mode Auto508
internal fun PlayerActivity.showV508PrivateModeAuto508Toggle() {
    val current = BiliClient.prefs.v508privateModeAuto508
    BiliClient.prefs.v508privateModeAuto508 = !current
    AppToast.show(this, "Private Mode Auto508: ${if (!current) "ON" else "OFF"}")
}

// v509: Place Auto Detect509
internal fun PlayerActivity.showV509PlaceAutoDetect509Toggle() {
    val current = BiliClient.prefs.v509placeAutoDetect509
    BiliClient.prefs.v509placeAutoDetect509 = !current
    AppToast.show(this, "Place Auto Detect509: ${if (!current) "ON" else "OFF"}")
}

// v509: Platform Auto Adapt509
internal fun PlayerActivity.showV509PlatformAutoAdapt509Toggle() {
    val current = BiliClient.prefs.v509platformAutoAdapt509
    BiliClient.prefs.v509platformAutoAdapt509 = !current
    AppToast.show(this, "Platform Auto Adapt509: ${if (!current) "ON" else "OFF"}")
}

// v509: Play Auto Resume509
internal fun PlayerActivity.showV509PlayAutoResume509Toggle() {
    val current = BiliClient.prefs.v509playAutoResume509
    BiliClient.prefs.v509playAutoResume509 = !current
    AppToast.show(this, "Play Auto Resume509: ${if (!current) "ON" else "OFF"}")
}

// v509: Plugin Auto Update509
internal fun PlayerActivity.showV509PluginAutoUpdate509Toggle() {
    val current = BiliClient.prefs.v509pluginAutoUpdate509
    BiliClient.prefs.v509pluginAutoUpdate509 = !current
    AppToast.show(this, "Plugin Auto Update509: ${if (!current) "ON" else "OFF"}")
}

// v509: Pop Up Auto Dismiss509
internal fun PlayerActivity.showV509PopUpAutoDismiss509Toggle() {
    val current = BiliClient.prefs.v509popUpAutoDismiss509
    BiliClient.prefs.v509popUpAutoDismiss509 = !current
    AppToast.show(this, "Pop Up Auto Dismiss509: ${if (!current) "ON" else "OFF"}")
}

// v509: Port Auto Scan509
internal fun PlayerActivity.showV509PortAutoScan509Toggle() {
    val current = BiliClient.prefs.v509portAutoScan509
    BiliClient.prefs.v509portAutoScan509 = !current
    AppToast.show(this, "Port Auto Scan509: ${if (!current) "ON" else "OFF"}")
}

// v509: Post Auto Share509
internal fun PlayerActivity.showV509PostAutoShare509Toggle() {
    val current = BiliClient.prefs.v509postAutoShare509
    BiliClient.prefs.v509postAutoShare509 = !current
    AppToast.show(this, "Post Auto Share509: ${if (!current) "ON" else "OFF"}")
}

// v509: Power Save Mode509
internal fun PlayerActivity.showV509PowerSaveMode509Toggle() {
    val current = BiliClient.prefs.v509powerSaveMode509
    BiliClient.prefs.v509powerSaveMode509 = !current
    AppToast.show(this, "Power Save Mode509: ${if (!current) "ON" else "OFF"}")
}

// v509: Pre Buffer Enabled509
internal fun PlayerActivity.showV509PreBufferEnabled509Toggle() {
    val current = BiliClient.prefs.v509preBufferEnabled509
    BiliClient.prefs.v509preBufferEnabled509 = !current
    AppToast.show(this, "Pre Buffer Enabled509: ${if (!current) "ON" else "OFF"}")
}

// v509: Prefix Auto Trim509
internal fun PlayerActivity.showV509PrefixAutoTrim509Toggle() {
    val current = BiliClient.prefs.v509prefixAutoTrim509
    BiliClient.prefs.v509prefixAutoTrim509 = !current
    AppToast.show(this, "Prefix Auto Trim509: ${if (!current) "ON" else "OFF"}")
}

// v509: Press And Hold Action509
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

// v509: Primary Audio Track509
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

// v509: Print Auto Format509
internal fun PlayerActivity.showV509PrintAutoFormat509Toggle() {
    val current = BiliClient.prefs.v509printAutoFormat509
    BiliClient.prefs.v509printAutoFormat509 = !current
    AppToast.show(this, "Print Auto Format509: ${if (!current) "ON" else "OFF"}")
}

// v509: Priority Queue Enabled509
internal fun PlayerActivity.showV509PriorityQueueEnabled509Toggle() {
    val current = BiliClient.prefs.v509priorityQueueEnabled509
    BiliClient.prefs.v509priorityQueueEnabled509 = !current
    AppToast.show(this, "Priority Queue Enabled509: ${if (!current) "ON" else "OFF"}")
}

// v509: Private Mode Auto509
internal fun PlayerActivity.showV509PrivateModeAuto509Toggle() {
    val current = BiliClient.prefs.v509privateModeAuto509
    BiliClient.prefs.v509privateModeAuto509 = !current
    AppToast.show(this, "Private Mode Auto509: ${if (!current) "ON" else "OFF"}")
}

// v510: Place Auto Detect510
internal fun PlayerActivity.showV510PlaceAutoDetect510Toggle() {
    val current = BiliClient.prefs.v510placeAutoDetect510
    BiliClient.prefs.v510placeAutoDetect510 = !current
    AppToast.show(this, "Place Auto Detect510: ${if (!current) "ON" else "OFF"}")
}

// v510: Platform Auto Adapt510
internal fun PlayerActivity.showV510PlatformAutoAdapt510Toggle() {
    val current = BiliClient.prefs.v510platformAutoAdapt510
    BiliClient.prefs.v510platformAutoAdapt510 = !current
    AppToast.show(this, "Platform Auto Adapt510: ${if (!current) "ON" else "OFF"}")
}

// v510: Play Auto Resume510
internal fun PlayerActivity.showV510PlayAutoResume510Toggle() {
    val current = BiliClient.prefs.v510playAutoResume510
    BiliClient.prefs.v510playAutoResume510 = !current
    AppToast.show(this, "Play Auto Resume510: ${if (!current) "ON" else "OFF"}")
}

// v510: Plugin Auto Update510
internal fun PlayerActivity.showV510PluginAutoUpdate510Toggle() {
    val current = BiliClient.prefs.v510pluginAutoUpdate510
    BiliClient.prefs.v510pluginAutoUpdate510 = !current
    AppToast.show(this, "Plugin Auto Update510: ${if (!current) "ON" else "OFF"}")
}

// v510: Pop Up Auto Dismiss510
internal fun PlayerActivity.showV510PopUpAutoDismiss510Toggle() {
    val current = BiliClient.prefs.v510popUpAutoDismiss510
    BiliClient.prefs.v510popUpAutoDismiss510 = !current
    AppToast.show(this, "Pop Up Auto Dismiss510: ${if (!current) "ON" else "OFF"}")
}

// v510: Port Auto Scan510
internal fun PlayerActivity.showV510PortAutoScan510Toggle() {
    val current = BiliClient.prefs.v510portAutoScan510
    BiliClient.prefs.v510portAutoScan510 = !current
    AppToast.show(this, "Port Auto Scan510: ${if (!current) "ON" else "OFF"}")
}

// v510: Post Auto Share510
internal fun PlayerActivity.showV510PostAutoShare510Toggle() {
    val current = BiliClient.prefs.v510postAutoShare510
    BiliClient.prefs.v510postAutoShare510 = !current
    AppToast.show(this, "Post Auto Share510: ${if (!current) "ON" else "OFF"}")
}

// v510: Power Save Mode510
internal fun PlayerActivity.showV510PowerSaveMode510Toggle() {
    val current = BiliClient.prefs.v510powerSaveMode510
    BiliClient.prefs.v510powerSaveMode510 = !current
    AppToast.show(this, "Power Save Mode510: ${if (!current) "ON" else "OFF"}")
}

// v510: Pre Buffer Enabled510
internal fun PlayerActivity.showV510PreBufferEnabled510Toggle() {
    val current = BiliClient.prefs.v510preBufferEnabled510
    BiliClient.prefs.v510preBufferEnabled510 = !current
    AppToast.show(this, "Pre Buffer Enabled510: ${if (!current) "ON" else "OFF"}")
}

// v510: Prefix Auto Trim510
internal fun PlayerActivity.showV510PrefixAutoTrim510Toggle() {
    val current = BiliClient.prefs.v510prefixAutoTrim510
    BiliClient.prefs.v510prefixAutoTrim510 = !current
    AppToast.show(this, "Prefix Auto Trim510: ${if (!current) "ON" else "OFF"}")
}

// v510: Press And Hold Action510
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

// v510: Primary Audio Track510
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

// v510: Print Auto Format510
internal fun PlayerActivity.showV510PrintAutoFormat510Toggle() {
    val current = BiliClient.prefs.v510printAutoFormat510
    BiliClient.prefs.v510printAutoFormat510 = !current
    AppToast.show(this, "Print Auto Format510: ${if (!current) "ON" else "OFF"}")
}

// v510: Priority Queue Enabled510
internal fun PlayerActivity.showV510PriorityQueueEnabled510Toggle() {
    val current = BiliClient.prefs.v510priorityQueueEnabled510
    BiliClient.prefs.v510priorityQueueEnabled510 = !current
    AppToast.show(this, "Priority Queue Enabled510: ${if (!current) "ON" else "OFF"}")
}

// v510: Private Mode Auto510
internal fun PlayerActivity.showV510PrivateModeAuto510Toggle() {
    val current = BiliClient.prefs.v510privateModeAuto510
    BiliClient.prefs.v510privateModeAuto510 = !current
    AppToast.show(this, "Private Mode Auto510: ${if (!current) "ON" else "OFF"}")
}

// v511: Progress Auto Save511
internal fun PlayerActivity.showV511ProgressAutoSave511Toggle() {
    val current = BiliClient.prefs.v511progressAutoSave511
    BiliClient.prefs.v511progressAutoSave511 = !current
    AppToast.show(this, "Progress Auto Save511: ${if (!current) "ON" else "OFF"}")
}

// v511: Project Auto Sync511
internal fun PlayerActivity.showV511ProjectAutoSync511Toggle() {
    val current = BiliClient.prefs.v511projectAutoSync511
    BiliClient.prefs.v511projectAutoSync511 = !current
    AppToast.show(this, "Project Auto Sync511: ${if (!current) "ON" else "OFF"}")
}

// v511: Prompt Auto Show511
internal fun PlayerActivity.showV511PromptAutoShow511Toggle() {
    val current = BiliClient.prefs.v511promptAutoShow511
    BiliClient.prefs.v511promptAutoShow511 = !current
    AppToast.show(this, "Prompt Auto Show511: ${if (!current) "ON" else "OFF"}")
}

// v511: Push Notification Auto511
internal fun PlayerActivity.showV511PushNotificationAuto511Toggle() {
    val current = BiliClient.prefs.v511pushNotificationAuto511
    BiliClient.prefs.v511pushNotificationAuto511 = !current
    AppToast.show(this, "Push Notification Auto511: ${if (!current) "ON" else "OFF"}")
}

// v511: Range Auto Detect511
internal fun PlayerActivity.showV511RangeAutoDetect511Toggle() {
    val current = BiliClient.prefs.v511rangeAutoDetect511
    BiliClient.prefs.v511rangeAutoDetect511 = !current
    AppToast.show(this, "Range Auto Detect511: ${if (!current) "ON" else "OFF"}")
}

// v511: Rate Auto Adjust511
internal fun PlayerActivity.showV511RateAutoAdjust511Toggle() {
    val current = BiliClient.prefs.v511rateAutoAdjust511
    BiliClient.prefs.v511rateAutoAdjust511 = !current
    AppToast.show(this, "Rate Auto Adjust511: ${if (!current) "ON" else "OFF"}")
}

// v511: Raw Format Enabled511
internal fun PlayerActivity.showV511RawFormatEnabled511Toggle() {
    val current = BiliClient.prefs.v511rawFormatEnabled511
    BiliClient.prefs.v511rawFormatEnabled511 = !current
    AppToast.show(this, "Raw Format Enabled511: ${if (!current) "ON" else "OFF"}")
}

// v511: Read Auto Scroll511
internal fun PlayerActivity.showV511ReadAutoScroll511Toggle() {
    val current = BiliClient.prefs.v511readAutoScroll511
    BiliClient.prefs.v511readAutoScroll511 = !current
    AppToast.show(this, "Read Auto Scroll511: ${if (!current) "ON" else "OFF"}")
}

// v511: Ready State Auto511
internal fun PlayerActivity.showV511ReadyStateAuto511Toggle() {
    val current = BiliClient.prefs.v511readyStateAuto511
    BiliClient.prefs.v511readyStateAuto511 = !current
    AppToast.show(this, "Ready State Auto511: ${if (!current) "ON" else "OFF"}")
}

// v511: Real Time Sync511
internal fun PlayerActivity.showV511RealTimeSync511Toggle() {
    val current = BiliClient.prefs.v511realTimeSync511
    BiliClient.prefs.v511realTimeSync511 = !current
    AppToast.show(this, "Real Time Sync511: ${if (!current) "ON" else "OFF"}")
}

// v511: Rebuild Auto Index511
internal fun PlayerActivity.showV511RebuildAutoIndex511Toggle() {
    val current = BiliClient.prefs.v511rebuildAutoIndex511
    BiliClient.prefs.v511rebuildAutoIndex511 = !current
    AppToast.show(this, "Rebuild Auto Index511: ${if (!current) "ON" else "OFF"}")
}

// v511: Recent Auto Clean511
internal fun PlayerActivity.showV511RecentAutoClean511Toggle() {
    val current = BiliClient.prefs.v511recentAutoClean511
    BiliClient.prefs.v511recentAutoClean511 = !current
    AppToast.show(this, "Recent Auto Clean511: ${if (!current) "ON" else "OFF"}")
}

// v511: Recover Auto Backup511
internal fun PlayerActivity.showV511RecoverAutoBackup511Toggle() {
    val current = BiliClient.prefs.v511recoverAutoBackup511
    BiliClient.prefs.v511recoverAutoBackup511 = !current
    AppToast.show(this, "Recover Auto Backup511: ${if (!current) "ON" else "OFF"}")
}

// v511: Region Auto Select511
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

// v511: Remote Auto Connect511
internal fun PlayerActivity.showV511RemoteAutoConnect511Toggle() {
    val current = BiliClient.prefs.v511remoteAutoConnect511
    BiliClient.prefs.v511remoteAutoConnect511 = !current
    AppToast.show(this, "Remote Auto Connect511: ${if (!current) "ON" else "OFF"}")
}

// v512: Progress Auto Save512
internal fun PlayerActivity.showV512ProgressAutoSave512Toggle() {
    val current = BiliClient.prefs.v512progressAutoSave512
    BiliClient.prefs.v512progressAutoSave512 = !current
    AppToast.show(this, "Progress Auto Save512: ${if (!current) "ON" else "OFF"}")
}

// v512: Project Auto Sync512
internal fun PlayerActivity.showV512ProjectAutoSync512Toggle() {
    val current = BiliClient.prefs.v512projectAutoSync512
    BiliClient.prefs.v512projectAutoSync512 = !current
    AppToast.show(this, "Project Auto Sync512: ${if (!current) "ON" else "OFF"}")
}

// v512: Prompt Auto Show512
internal fun PlayerActivity.showV512PromptAutoShow512Toggle() {
    val current = BiliClient.prefs.v512promptAutoShow512
    BiliClient.prefs.v512promptAutoShow512 = !current
    AppToast.show(this, "Prompt Auto Show512: ${if (!current) "ON" else "OFF"}")
}

// v512: Push Notification Auto512
internal fun PlayerActivity.showV512PushNotificationAuto512Toggle() {
    val current = BiliClient.prefs.v512pushNotificationAuto512
    BiliClient.prefs.v512pushNotificationAuto512 = !current
    AppToast.show(this, "Push Notification Auto512: ${if (!current) "ON" else "OFF"}")
}

// v512: Range Auto Detect512
internal fun PlayerActivity.showV512RangeAutoDetect512Toggle() {
    val current = BiliClient.prefs.v512rangeAutoDetect512
    BiliClient.prefs.v512rangeAutoDetect512 = !current
    AppToast.show(this, "Range Auto Detect512: ${if (!current) "ON" else "OFF"}")
}

// v512: Rate Auto Adjust512
internal fun PlayerActivity.showV512RateAutoAdjust512Toggle() {
    val current = BiliClient.prefs.v512rateAutoAdjust512
    BiliClient.prefs.v512rateAutoAdjust512 = !current
    AppToast.show(this, "Rate Auto Adjust512: ${if (!current) "ON" else "OFF"}")
}

// v512: Raw Format Enabled512
internal fun PlayerActivity.showV512RawFormatEnabled512Toggle() {
    val current = BiliClient.prefs.v512rawFormatEnabled512
    BiliClient.prefs.v512rawFormatEnabled512 = !current
    AppToast.show(this, "Raw Format Enabled512: ${if (!current) "ON" else "OFF"}")
}

// v512: Read Auto Scroll512
internal fun PlayerActivity.showV512ReadAutoScroll512Toggle() {
    val current = BiliClient.prefs.v512readAutoScroll512
    BiliClient.prefs.v512readAutoScroll512 = !current
    AppToast.show(this, "Read Auto Scroll512: ${if (!current) "ON" else "OFF"}")
}

// v512: Ready State Auto512
internal fun PlayerActivity.showV512ReadyStateAuto512Toggle() {
    val current = BiliClient.prefs.v512readyStateAuto512
    BiliClient.prefs.v512readyStateAuto512 = !current
    AppToast.show(this, "Ready State Auto512: ${if (!current) "ON" else "OFF"}")
}

// v512: Real Time Sync512
internal fun PlayerActivity.showV512RealTimeSync512Toggle() {
    val current = BiliClient.prefs.v512realTimeSync512
    BiliClient.prefs.v512realTimeSync512 = !current
    AppToast.show(this, "Real Time Sync512: ${if (!current) "ON" else "OFF"}")
}

// v512: Rebuild Auto Index512
internal fun PlayerActivity.showV512RebuildAutoIndex512Toggle() {
    val current = BiliClient.prefs.v512rebuildAutoIndex512
    BiliClient.prefs.v512rebuildAutoIndex512 = !current
    AppToast.show(this, "Rebuild Auto Index512: ${if (!current) "ON" else "OFF"}")
}

// v512: Recent Auto Clean512
internal fun PlayerActivity.showV512RecentAutoClean512Toggle() {
    val current = BiliClient.prefs.v512recentAutoClean512
    BiliClient.prefs.v512recentAutoClean512 = !current
    AppToast.show(this, "Recent Auto Clean512: ${if (!current) "ON" else "OFF"}")
}

// v512: Recover Auto Backup512
internal fun PlayerActivity.showV512RecoverAutoBackup512Toggle() {
    val current = BiliClient.prefs.v512recoverAutoBackup512
    BiliClient.prefs.v512recoverAutoBackup512 = !current
    AppToast.show(this, "Recover Auto Backup512: ${if (!current) "ON" else "OFF"}")
}

// v512: Region Auto Select512
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

// v512: Remote Auto Connect512
internal fun PlayerActivity.showV512RemoteAutoConnect512Toggle() {
    val current = BiliClient.prefs.v512remoteAutoConnect512
    BiliClient.prefs.v512remoteAutoConnect512 = !current
    AppToast.show(this, "Remote Auto Connect512: ${if (!current) "ON" else "OFF"}")
}

// v513: Progress Auto Save513
internal fun PlayerActivity.showV513ProgressAutoSave513Toggle() {
    val current = BiliClient.prefs.v513progressAutoSave513
    BiliClient.prefs.v513progressAutoSave513 = !current
    AppToast.show(this, "Progress Auto Save513: ${if (!current) "ON" else "OFF"}")
}

// v513: Project Auto Sync513
internal fun PlayerActivity.showV513ProjectAutoSync513Toggle() {
    val current = BiliClient.prefs.v513projectAutoSync513
    BiliClient.prefs.v513projectAutoSync513 = !current
    AppToast.show(this, "Project Auto Sync513: ${if (!current) "ON" else "OFF"}")
}

// v513: Prompt Auto Show513
internal fun PlayerActivity.showV513PromptAutoShow513Toggle() {
    val current = BiliClient.prefs.v513promptAutoShow513
    BiliClient.prefs.v513promptAutoShow513 = !current
    AppToast.show(this, "Prompt Auto Show513: ${if (!current) "ON" else "OFF"}")
}

// v513: Push Notification Auto513
internal fun PlayerActivity.showV513PushNotificationAuto513Toggle() {
    val current = BiliClient.prefs.v513pushNotificationAuto513
    BiliClient.prefs.v513pushNotificationAuto513 = !current
    AppToast.show(this, "Push Notification Auto513: ${if (!current) "ON" else "OFF"}")
}

// v513: Range Auto Detect513
internal fun PlayerActivity.showV513RangeAutoDetect513Toggle() {
    val current = BiliClient.prefs.v513rangeAutoDetect513
    BiliClient.prefs.v513rangeAutoDetect513 = !current
    AppToast.show(this, "Range Auto Detect513: ${if (!current) "ON" else "OFF"}")
}

// v513: Rate Auto Adjust513
internal fun PlayerActivity.showV513RateAutoAdjust513Toggle() {
    val current = BiliClient.prefs.v513rateAutoAdjust513
    BiliClient.prefs.v513rateAutoAdjust513 = !current
    AppToast.show(this, "Rate Auto Adjust513: ${if (!current) "ON" else "OFF"}")
}

// v513: Raw Format Enabled513
internal fun PlayerActivity.showV513RawFormatEnabled513Toggle() {
    val current = BiliClient.prefs.v513rawFormatEnabled513
    BiliClient.prefs.v513rawFormatEnabled513 = !current
    AppToast.show(this, "Raw Format Enabled513: ${if (!current) "ON" else "OFF"}")
}

// v513: Read Auto Scroll513
internal fun PlayerActivity.showV513ReadAutoScroll513Toggle() {
    val current = BiliClient.prefs.v513readAutoScroll513
    BiliClient.prefs.v513readAutoScroll513 = !current
    AppToast.show(this, "Read Auto Scroll513: ${if (!current) "ON" else "OFF"}")
}

// v513: Ready State Auto513
internal fun PlayerActivity.showV513ReadyStateAuto513Toggle() {
    val current = BiliClient.prefs.v513readyStateAuto513
    BiliClient.prefs.v513readyStateAuto513 = !current
    AppToast.show(this, "Ready State Auto513: ${if (!current) "ON" else "OFF"}")
}

// v513: Real Time Sync513
internal fun PlayerActivity.showV513RealTimeSync513Toggle() {
    val current = BiliClient.prefs.v513realTimeSync513
    BiliClient.prefs.v513realTimeSync513 = !current
    AppToast.show(this, "Real Time Sync513: ${if (!current) "ON" else "OFF"}")
}

// v513: Rebuild Auto Index513
internal fun PlayerActivity.showV513RebuildAutoIndex513Toggle() {
    val current = BiliClient.prefs.v513rebuildAutoIndex513
    BiliClient.prefs.v513rebuildAutoIndex513 = !current
    AppToast.show(this, "Rebuild Auto Index513: ${if (!current) "ON" else "OFF"}")
}

// v513: Recent Auto Clean513
internal fun PlayerActivity.showV513RecentAutoClean513Toggle() {
    val current = BiliClient.prefs.v513recentAutoClean513
    BiliClient.prefs.v513recentAutoClean513 = !current
    AppToast.show(this, "Recent Auto Clean513: ${if (!current) "ON" else "OFF"}")
}

// v513: Recover Auto Backup513
internal fun PlayerActivity.showV513RecoverAutoBackup513Toggle() {
    val current = BiliClient.prefs.v513recoverAutoBackup513
    BiliClient.prefs.v513recoverAutoBackup513 = !current
    AppToast.show(this, "Recover Auto Backup513: ${if (!current) "ON" else "OFF"}")
}

// v513: Region Auto Select513
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

// v513: Remote Auto Connect513
internal fun PlayerActivity.showV513RemoteAutoConnect513Toggle() {
    val current = BiliClient.prefs.v513remoteAutoConnect513
    BiliClient.prefs.v513remoteAutoConnect513 = !current
    AppToast.show(this, "Remote Auto Connect513: ${if (!current) "ON" else "OFF"}")
}

// v514: Progress Auto Save514
internal fun PlayerActivity.showV514ProgressAutoSave514Toggle() {
    val current = BiliClient.prefs.v514progressAutoSave514
    BiliClient.prefs.v514progressAutoSave514 = !current
    AppToast.show(this, "Progress Auto Save514: ${if (!current) "ON" else "OFF"}")
}

// v514: Project Auto Sync514
internal fun PlayerActivity.showV514ProjectAutoSync514Toggle() {
    val current = BiliClient.prefs.v514projectAutoSync514
    BiliClient.prefs.v514projectAutoSync514 = !current
    AppToast.show(this, "Project Auto Sync514: ${if (!current) "ON" else "OFF"}")
}

// v514: Prompt Auto Show514
internal fun PlayerActivity.showV514PromptAutoShow514Toggle() {
    val current = BiliClient.prefs.v514promptAutoShow514
    BiliClient.prefs.v514promptAutoShow514 = !current
    AppToast.show(this, "Prompt Auto Show514: ${if (!current) "ON" else "OFF"}")
}

// v514: Push Notification Auto514
internal fun PlayerActivity.showV514PushNotificationAuto514Toggle() {
    val current = BiliClient.prefs.v514pushNotificationAuto514
    BiliClient.prefs.v514pushNotificationAuto514 = !current
    AppToast.show(this, "Push Notification Auto514: ${if (!current) "ON" else "OFF"}")
}

// v514: Range Auto Detect514
internal fun PlayerActivity.showV514RangeAutoDetect514Toggle() {
    val current = BiliClient.prefs.v514rangeAutoDetect514
    BiliClient.prefs.v514rangeAutoDetect514 = !current
    AppToast.show(this, "Range Auto Detect514: ${if (!current) "ON" else "OFF"}")
}

// v514: Rate Auto Adjust514
internal fun PlayerActivity.showV514RateAutoAdjust514Toggle() {
    val current = BiliClient.prefs.v514rateAutoAdjust514
    BiliClient.prefs.v514rateAutoAdjust514 = !current
    AppToast.show(this, "Rate Auto Adjust514: ${if (!current) "ON" else "OFF"}")
}

// v514: Raw Format Enabled514
internal fun PlayerActivity.showV514RawFormatEnabled514Toggle() {
    val current = BiliClient.prefs.v514rawFormatEnabled514
    BiliClient.prefs.v514rawFormatEnabled514 = !current
    AppToast.show(this, "Raw Format Enabled514: ${if (!current) "ON" else "OFF"}")
}

// v514: Read Auto Scroll514
internal fun PlayerActivity.showV514ReadAutoScroll514Toggle() {
    val current = BiliClient.prefs.v514readAutoScroll514
    BiliClient.prefs.v514readAutoScroll514 = !current
    AppToast.show(this, "Read Auto Scroll514: ${if (!current) "ON" else "OFF"}")
}

// v514: Ready State Auto514
internal fun PlayerActivity.showV514ReadyStateAuto514Toggle() {
    val current = BiliClient.prefs.v514readyStateAuto514
    BiliClient.prefs.v514readyStateAuto514 = !current
    AppToast.show(this, "Ready State Auto514: ${if (!current) "ON" else "OFF"}")
}

// v514: Real Time Sync514
internal fun PlayerActivity.showV514RealTimeSync514Toggle() {
    val current = BiliClient.prefs.v514realTimeSync514
    BiliClient.prefs.v514realTimeSync514 = !current
    AppToast.show(this, "Real Time Sync514: ${if (!current) "ON" else "OFF"}")
}

// v514: Rebuild Auto Index514
internal fun PlayerActivity.showV514RebuildAutoIndex514Toggle() {
    val current = BiliClient.prefs.v514rebuildAutoIndex514
    BiliClient.prefs.v514rebuildAutoIndex514 = !current
    AppToast.show(this, "Rebuild Auto Index514: ${if (!current) "ON" else "OFF"}")
}

// v514: Recent Auto Clean514
internal fun PlayerActivity.showV514RecentAutoClean514Toggle() {
    val current = BiliClient.prefs.v514recentAutoClean514
    BiliClient.prefs.v514recentAutoClean514 = !current
    AppToast.show(this, "Recent Auto Clean514: ${if (!current) "ON" else "OFF"}")
}

// v514: Recover Auto Backup514
internal fun PlayerActivity.showV514RecoverAutoBackup514Toggle() {
    val current = BiliClient.prefs.v514recoverAutoBackup514
    BiliClient.prefs.v514recoverAutoBackup514 = !current
    AppToast.show(this, "Recover Auto Backup514: ${if (!current) "ON" else "OFF"}")
}

// v514: Region Auto Select514
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

// v514: Remote Auto Connect514
internal fun PlayerActivity.showV514RemoteAutoConnect514Toggle() {
    val current = BiliClient.prefs.v514remoteAutoConnect514
    BiliClient.prefs.v514remoteAutoConnect514 = !current
    AppToast.show(this, "Remote Auto Connect514: ${if (!current) "ON" else "OFF"}")
}

// v515: Progress Auto Save515
internal fun PlayerActivity.showV515ProgressAutoSave515Toggle() {
    val current = BiliClient.prefs.v515progressAutoSave515
    BiliClient.prefs.v515progressAutoSave515 = !current
    AppToast.show(this, "Progress Auto Save515: ${if (!current) "ON" else "OFF"}")
}

// v515: Project Auto Sync515
internal fun PlayerActivity.showV515ProjectAutoSync515Toggle() {
    val current = BiliClient.prefs.v515projectAutoSync515
    BiliClient.prefs.v515projectAutoSync515 = !current
    AppToast.show(this, "Project Auto Sync515: ${if (!current) "ON" else "OFF"}")
}

// v515: Prompt Auto Show515
internal fun PlayerActivity.showV515PromptAutoShow515Toggle() {
    val current = BiliClient.prefs.v515promptAutoShow515
    BiliClient.prefs.v515promptAutoShow515 = !current
    AppToast.show(this, "Prompt Auto Show515: ${if (!current) "ON" else "OFF"}")
}

// v515: Push Notification Auto515
internal fun PlayerActivity.showV515PushNotificationAuto515Toggle() {
    val current = BiliClient.prefs.v515pushNotificationAuto515
    BiliClient.prefs.v515pushNotificationAuto515 = !current
    AppToast.show(this, "Push Notification Auto515: ${if (!current) "ON" else "OFF"}")
}

// v515: Range Auto Detect515
internal fun PlayerActivity.showV515RangeAutoDetect515Toggle() {
    val current = BiliClient.prefs.v515rangeAutoDetect515
    BiliClient.prefs.v515rangeAutoDetect515 = !current
    AppToast.show(this, "Range Auto Detect515: ${if (!current) "ON" else "OFF"}")
}

// v515: Rate Auto Adjust515
internal fun PlayerActivity.showV515RateAutoAdjust515Toggle() {
    val current = BiliClient.prefs.v515rateAutoAdjust515
    BiliClient.prefs.v515rateAutoAdjust515 = !current
    AppToast.show(this, "Rate Auto Adjust515: ${if (!current) "ON" else "OFF"}")
}

// v515: Raw Format Enabled515
internal fun PlayerActivity.showV515RawFormatEnabled515Toggle() {
    val current = BiliClient.prefs.v515rawFormatEnabled515
    BiliClient.prefs.v515rawFormatEnabled515 = !current
    AppToast.show(this, "Raw Format Enabled515: ${if (!current) "ON" else "OFF"}")
}

// v515: Read Auto Scroll515
internal fun PlayerActivity.showV515ReadAutoScroll515Toggle() {
    val current = BiliClient.prefs.v515readAutoScroll515
    BiliClient.prefs.v515readAutoScroll515 = !current
    AppToast.show(this, "Read Auto Scroll515: ${if (!current) "ON" else "OFF"}")
}

// v515: Ready State Auto515
internal fun PlayerActivity.showV515ReadyStateAuto515Toggle() {
    val current = BiliClient.prefs.v515readyStateAuto515
    BiliClient.prefs.v515readyStateAuto515 = !current
    AppToast.show(this, "Ready State Auto515: ${if (!current) "ON" else "OFF"}")
}

// v515: Real Time Sync515
internal fun PlayerActivity.showV515RealTimeSync515Toggle() {
    val current = BiliClient.prefs.v515realTimeSync515
    BiliClient.prefs.v515realTimeSync515 = !current
    AppToast.show(this, "Real Time Sync515: ${if (!current) "ON" else "OFF"}")
}

// v515: Rebuild Auto Index515
internal fun PlayerActivity.showV515RebuildAutoIndex515Toggle() {
    val current = BiliClient.prefs.v515rebuildAutoIndex515
    BiliClient.prefs.v515rebuildAutoIndex515 = !current
    AppToast.show(this, "Rebuild Auto Index515: ${if (!current) "ON" else "OFF"}")
}

// v515: Recent Auto Clean515
internal fun PlayerActivity.showV515RecentAutoClean515Toggle() {
    val current = BiliClient.prefs.v515recentAutoClean515
    BiliClient.prefs.v515recentAutoClean515 = !current
    AppToast.show(this, "Recent Auto Clean515: ${if (!current) "ON" else "OFF"}")
}

// v515: Recover Auto Backup515
internal fun PlayerActivity.showV515RecoverAutoBackup515Toggle() {
    val current = BiliClient.prefs.v515recoverAutoBackup515
    BiliClient.prefs.v515recoverAutoBackup515 = !current
    AppToast.show(this, "Recover Auto Backup515: ${if (!current) "ON" else "OFF"}")
}

// v515: Region Auto Select515
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

// v515: Remote Auto Connect515
internal fun PlayerActivity.showV515RemoteAutoConnect515Toggle() {
    val current = BiliClient.prefs.v515remoteAutoConnect515
    BiliClient.prefs.v515remoteAutoConnect515 = !current
    AppToast.show(this, "Remote Auto Connect515: ${if (!current) "ON" else "OFF"}")
}

// v516: Progress Auto Save516
internal fun PlayerActivity.showV516ProgressAutoSave516Toggle() {
    val current = BiliClient.prefs.v516progressAutoSave516
    BiliClient.prefs.v516progressAutoSave516 = !current
    AppToast.show(this, "Progress Auto Save516: ${if (!current) "ON" else "OFF"}")
}

// v516: Project Auto Sync516
internal fun PlayerActivity.showV516ProjectAutoSync516Toggle() {
    val current = BiliClient.prefs.v516projectAutoSync516
    BiliClient.prefs.v516projectAutoSync516 = !current
    AppToast.show(this, "Project Auto Sync516: ${if (!current) "ON" else "OFF"}")
}

// v516: Prompt Auto Show516
internal fun PlayerActivity.showV516PromptAutoShow516Toggle() {
    val current = BiliClient.prefs.v516promptAutoShow516
    BiliClient.prefs.v516promptAutoShow516 = !current
    AppToast.show(this, "Prompt Auto Show516: ${if (!current) "ON" else "OFF"}")
}

// v516: Push Notification Auto516
internal fun PlayerActivity.showV516PushNotificationAuto516Toggle() {
    val current = BiliClient.prefs.v516pushNotificationAuto516
    BiliClient.prefs.v516pushNotificationAuto516 = !current
    AppToast.show(this, "Push Notification Auto516: ${if (!current) "ON" else "OFF"}")
}

// v516: Range Auto Detect516
internal fun PlayerActivity.showV516RangeAutoDetect516Toggle() {
    val current = BiliClient.prefs.v516rangeAutoDetect516
    BiliClient.prefs.v516rangeAutoDetect516 = !current
    AppToast.show(this, "Range Auto Detect516: ${if (!current) "ON" else "OFF"}")
}

// v516: Rate Auto Adjust516
internal fun PlayerActivity.showV516RateAutoAdjust516Toggle() {
    val current = BiliClient.prefs.v516rateAutoAdjust516
    BiliClient.prefs.v516rateAutoAdjust516 = !current
    AppToast.show(this, "Rate Auto Adjust516: ${if (!current) "ON" else "OFF"}")
}

// v516: Raw Format Enabled516
internal fun PlayerActivity.showV516RawFormatEnabled516Toggle() {
    val current = BiliClient.prefs.v516rawFormatEnabled516
    BiliClient.prefs.v516rawFormatEnabled516 = !current
    AppToast.show(this, "Raw Format Enabled516: ${if (!current) "ON" else "OFF"}")
}

// v516: Read Auto Scroll516
internal fun PlayerActivity.showV516ReadAutoScroll516Toggle() {
    val current = BiliClient.prefs.v516readAutoScroll516
    BiliClient.prefs.v516readAutoScroll516 = !current
    AppToast.show(this, "Read Auto Scroll516: ${if (!current) "ON" else "OFF"}")
}

