package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

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

// v516: Ready State Auto516
internal fun PlayerActivity.showV516ReadyStateAuto516Toggle() {
    val current = BiliClient.prefs.v516readyStateAuto516
    BiliClient.prefs.v516readyStateAuto516 = !current
    AppToast.show(this, "Ready State Auto516: ${if (!current) "ON" else "OFF"}")
}

// v516: Real Time Sync516
internal fun PlayerActivity.showV516RealTimeSync516Toggle() {
    val current = BiliClient.prefs.v516realTimeSync516
    BiliClient.prefs.v516realTimeSync516 = !current
    AppToast.show(this, "Real Time Sync516: ${if (!current) "ON" else "OFF"}")
}

// v516: Rebuild Auto Index516
internal fun PlayerActivity.showV516RebuildAutoIndex516Toggle() {
    val current = BiliClient.prefs.v516rebuildAutoIndex516
    BiliClient.prefs.v516rebuildAutoIndex516 = !current
    AppToast.show(this, "Rebuild Auto Index516: ${if (!current) "ON" else "OFF"}")
}

// v516: Recent Auto Clean516
internal fun PlayerActivity.showV516RecentAutoClean516Toggle() {
    val current = BiliClient.prefs.v516recentAutoClean516
    BiliClient.prefs.v516recentAutoClean516 = !current
    AppToast.show(this, "Recent Auto Clean516: ${if (!current) "ON" else "OFF"}")
}

// v516: Recover Auto Backup516
internal fun PlayerActivity.showV516RecoverAutoBackup516Toggle() {
    val current = BiliClient.prefs.v516recoverAutoBackup516
    BiliClient.prefs.v516recoverAutoBackup516 = !current
    AppToast.show(this, "Recover Auto Backup516: ${if (!current) "ON" else "OFF"}")
}

// v516: Region Auto Select516
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

// v516: Remote Auto Connect516
internal fun PlayerActivity.showV516RemoteAutoConnect516Toggle() {
    val current = BiliClient.prefs.v516remoteAutoConnect516
    BiliClient.prefs.v516remoteAutoConnect516 = !current
    AppToast.show(this, "Remote Auto Connect516: ${if (!current) "ON" else "OFF"}")
}

// v517: Progress Auto Save517
internal fun PlayerActivity.showV517ProgressAutoSave517Toggle() {
    val current = BiliClient.prefs.v517progressAutoSave517
    BiliClient.prefs.v517progressAutoSave517 = !current
    AppToast.show(this, "Progress Auto Save517: ${if (!current) "ON" else "OFF"}")
}

// v517: Project Auto Sync517
internal fun PlayerActivity.showV517ProjectAutoSync517Toggle() {
    val current = BiliClient.prefs.v517projectAutoSync517
    BiliClient.prefs.v517projectAutoSync517 = !current
    AppToast.show(this, "Project Auto Sync517: ${if (!current) "ON" else "OFF"}")
}

// v517: Prompt Auto Show517
internal fun PlayerActivity.showV517PromptAutoShow517Toggle() {
    val current = BiliClient.prefs.v517promptAutoShow517
    BiliClient.prefs.v517promptAutoShow517 = !current
    AppToast.show(this, "Prompt Auto Show517: ${if (!current) "ON" else "OFF"}")
}

// v517: Push Notification Auto517
internal fun PlayerActivity.showV517PushNotificationAuto517Toggle() {
    val current = BiliClient.prefs.v517pushNotificationAuto517
    BiliClient.prefs.v517pushNotificationAuto517 = !current
    AppToast.show(this, "Push Notification Auto517: ${if (!current) "ON" else "OFF"}")
}

// v517: Range Auto Detect517
internal fun PlayerActivity.showV517RangeAutoDetect517Toggle() {
    val current = BiliClient.prefs.v517rangeAutoDetect517
    BiliClient.prefs.v517rangeAutoDetect517 = !current
    AppToast.show(this, "Range Auto Detect517: ${if (!current) "ON" else "OFF"}")
}

// v517: Rate Auto Adjust517
internal fun PlayerActivity.showV517RateAutoAdjust517Toggle() {
    val current = BiliClient.prefs.v517rateAutoAdjust517
    BiliClient.prefs.v517rateAutoAdjust517 = !current
    AppToast.show(this, "Rate Auto Adjust517: ${if (!current) "ON" else "OFF"}")
}

// v517: Raw Format Enabled517
internal fun PlayerActivity.showV517RawFormatEnabled517Toggle() {
    val current = BiliClient.prefs.v517rawFormatEnabled517
    BiliClient.prefs.v517rawFormatEnabled517 = !current
    AppToast.show(this, "Raw Format Enabled517: ${if (!current) "ON" else "OFF"}")
}

// v517: Read Auto Scroll517
internal fun PlayerActivity.showV517ReadAutoScroll517Toggle() {
    val current = BiliClient.prefs.v517readAutoScroll517
    BiliClient.prefs.v517readAutoScroll517 = !current
    AppToast.show(this, "Read Auto Scroll517: ${if (!current) "ON" else "OFF"}")
}

// v517: Ready State Auto517
internal fun PlayerActivity.showV517ReadyStateAuto517Toggle() {
    val current = BiliClient.prefs.v517readyStateAuto517
    BiliClient.prefs.v517readyStateAuto517 = !current
    AppToast.show(this, "Ready State Auto517: ${if (!current) "ON" else "OFF"}")
}

// v517: Real Time Sync517
internal fun PlayerActivity.showV517RealTimeSync517Toggle() {
    val current = BiliClient.prefs.v517realTimeSync517
    BiliClient.prefs.v517realTimeSync517 = !current
    AppToast.show(this, "Real Time Sync517: ${if (!current) "ON" else "OFF"}")
}

// v517: Rebuild Auto Index517
internal fun PlayerActivity.showV517RebuildAutoIndex517Toggle() {
    val current = BiliClient.prefs.v517rebuildAutoIndex517
    BiliClient.prefs.v517rebuildAutoIndex517 = !current
    AppToast.show(this, "Rebuild Auto Index517: ${if (!current) "ON" else "OFF"}")
}

// v517: Recent Auto Clean517
internal fun PlayerActivity.showV517RecentAutoClean517Toggle() {
    val current = BiliClient.prefs.v517recentAutoClean517
    BiliClient.prefs.v517recentAutoClean517 = !current
    AppToast.show(this, "Recent Auto Clean517: ${if (!current) "ON" else "OFF"}")
}

// v517: Recover Auto Backup517
internal fun PlayerActivity.showV517RecoverAutoBackup517Toggle() {
    val current = BiliClient.prefs.v517recoverAutoBackup517
    BiliClient.prefs.v517recoverAutoBackup517 = !current
    AppToast.show(this, "Recover Auto Backup517: ${if (!current) "ON" else "OFF"}")
}

// v517: Region Auto Select517
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

// v517: Remote Auto Connect517
internal fun PlayerActivity.showV517RemoteAutoConnect517Toggle() {
    val current = BiliClient.prefs.v517remoteAutoConnect517
    BiliClient.prefs.v517remoteAutoConnect517 = !current
    AppToast.show(this, "Remote Auto Connect517: ${if (!current) "ON" else "OFF"}")
}

// v518: Progress Auto Save518
internal fun PlayerActivity.showV518ProgressAutoSave518Toggle() {
    val current = BiliClient.prefs.v518progressAutoSave518
    BiliClient.prefs.v518progressAutoSave518 = !current
    AppToast.show(this, "Progress Auto Save518: ${if (!current) "ON" else "OFF"}")
}

// v518: Project Auto Sync518
internal fun PlayerActivity.showV518ProjectAutoSync518Toggle() {
    val current = BiliClient.prefs.v518projectAutoSync518
    BiliClient.prefs.v518projectAutoSync518 = !current
    AppToast.show(this, "Project Auto Sync518: ${if (!current) "ON" else "OFF"}")
}

// v518: Prompt Auto Show518
internal fun PlayerActivity.showV518PromptAutoShow518Toggle() {
    val current = BiliClient.prefs.v518promptAutoShow518
    BiliClient.prefs.v518promptAutoShow518 = !current
    AppToast.show(this, "Prompt Auto Show518: ${if (!current) "ON" else "OFF"}")
}

// v518: Push Notification Auto518
internal fun PlayerActivity.showV518PushNotificationAuto518Toggle() {
    val current = BiliClient.prefs.v518pushNotificationAuto518
    BiliClient.prefs.v518pushNotificationAuto518 = !current
    AppToast.show(this, "Push Notification Auto518: ${if (!current) "ON" else "OFF"}")
}

// v518: Range Auto Detect518
internal fun PlayerActivity.showV518RangeAutoDetect518Toggle() {
    val current = BiliClient.prefs.v518rangeAutoDetect518
    BiliClient.prefs.v518rangeAutoDetect518 = !current
    AppToast.show(this, "Range Auto Detect518: ${if (!current) "ON" else "OFF"}")
}

// v518: Rate Auto Adjust518
internal fun PlayerActivity.showV518RateAutoAdjust518Toggle() {
    val current = BiliClient.prefs.v518rateAutoAdjust518
    BiliClient.prefs.v518rateAutoAdjust518 = !current
    AppToast.show(this, "Rate Auto Adjust518: ${if (!current) "ON" else "OFF"}")
}

// v518: Raw Format Enabled518
internal fun PlayerActivity.showV518RawFormatEnabled518Toggle() {
    val current = BiliClient.prefs.v518rawFormatEnabled518
    BiliClient.prefs.v518rawFormatEnabled518 = !current
    AppToast.show(this, "Raw Format Enabled518: ${if (!current) "ON" else "OFF"}")
}

// v518: Read Auto Scroll518
internal fun PlayerActivity.showV518ReadAutoScroll518Toggle() {
    val current = BiliClient.prefs.v518readAutoScroll518
    BiliClient.prefs.v518readAutoScroll518 = !current
    AppToast.show(this, "Read Auto Scroll518: ${if (!current) "ON" else "OFF"}")
}

// v518: Ready State Auto518
internal fun PlayerActivity.showV518ReadyStateAuto518Toggle() {
    val current = BiliClient.prefs.v518readyStateAuto518
    BiliClient.prefs.v518readyStateAuto518 = !current
    AppToast.show(this, "Ready State Auto518: ${if (!current) "ON" else "OFF"}")
}

// v518: Real Time Sync518
internal fun PlayerActivity.showV518RealTimeSync518Toggle() {
    val current = BiliClient.prefs.v518realTimeSync518
    BiliClient.prefs.v518realTimeSync518 = !current
    AppToast.show(this, "Real Time Sync518: ${if (!current) "ON" else "OFF"}")
}

// v518: Rebuild Auto Index518
internal fun PlayerActivity.showV518RebuildAutoIndex518Toggle() {
    val current = BiliClient.prefs.v518rebuildAutoIndex518
    BiliClient.prefs.v518rebuildAutoIndex518 = !current
    AppToast.show(this, "Rebuild Auto Index518: ${if (!current) "ON" else "OFF"}")
}

// v518: Recent Auto Clean518
internal fun PlayerActivity.showV518RecentAutoClean518Toggle() {
    val current = BiliClient.prefs.v518recentAutoClean518
    BiliClient.prefs.v518recentAutoClean518 = !current
    AppToast.show(this, "Recent Auto Clean518: ${if (!current) "ON" else "OFF"}")
}

// v518: Recover Auto Backup518
internal fun PlayerActivity.showV518RecoverAutoBackup518Toggle() {
    val current = BiliClient.prefs.v518recoverAutoBackup518
    BiliClient.prefs.v518recoverAutoBackup518 = !current
    AppToast.show(this, "Recover Auto Backup518: ${if (!current) "ON" else "OFF"}")
}

// v518: Region Auto Select518
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

// v518: Remote Auto Connect518
internal fun PlayerActivity.showV518RemoteAutoConnect518Toggle() {
    val current = BiliClient.prefs.v518remoteAutoConnect518
    BiliClient.prefs.v518remoteAutoConnect518 = !current
    AppToast.show(this, "Remote Auto Connect518: ${if (!current) "ON" else "OFF"}")
}

// v519: Progress Auto Save519
internal fun PlayerActivity.showV519ProgressAutoSave519Toggle() {
    val current = BiliClient.prefs.v519progressAutoSave519
    BiliClient.prefs.v519progressAutoSave519 = !current
    AppToast.show(this, "Progress Auto Save519: ${if (!current) "ON" else "OFF"}")
}

// v519: Project Auto Sync519
internal fun PlayerActivity.showV519ProjectAutoSync519Toggle() {
    val current = BiliClient.prefs.v519projectAutoSync519
    BiliClient.prefs.v519projectAutoSync519 = !current
    AppToast.show(this, "Project Auto Sync519: ${if (!current) "ON" else "OFF"}")
}

// v519: Prompt Auto Show519
internal fun PlayerActivity.showV519PromptAutoShow519Toggle() {
    val current = BiliClient.prefs.v519promptAutoShow519
    BiliClient.prefs.v519promptAutoShow519 = !current
    AppToast.show(this, "Prompt Auto Show519: ${if (!current) "ON" else "OFF"}")
}

// v519: Push Notification Auto519
internal fun PlayerActivity.showV519PushNotificationAuto519Toggle() {
    val current = BiliClient.prefs.v519pushNotificationAuto519
    BiliClient.prefs.v519pushNotificationAuto519 = !current
    AppToast.show(this, "Push Notification Auto519: ${if (!current) "ON" else "OFF"}")
}

// v519: Range Auto Detect519
internal fun PlayerActivity.showV519RangeAutoDetect519Toggle() {
    val current = BiliClient.prefs.v519rangeAutoDetect519
    BiliClient.prefs.v519rangeAutoDetect519 = !current
    AppToast.show(this, "Range Auto Detect519: ${if (!current) "ON" else "OFF"}")
}

// v519: Rate Auto Adjust519
internal fun PlayerActivity.showV519RateAutoAdjust519Toggle() {
    val current = BiliClient.prefs.v519rateAutoAdjust519
    BiliClient.prefs.v519rateAutoAdjust519 = !current
    AppToast.show(this, "Rate Auto Adjust519: ${if (!current) "ON" else "OFF"}")
}

// v519: Raw Format Enabled519
internal fun PlayerActivity.showV519RawFormatEnabled519Toggle() {
    val current = BiliClient.prefs.v519rawFormatEnabled519
    BiliClient.prefs.v519rawFormatEnabled519 = !current
    AppToast.show(this, "Raw Format Enabled519: ${if (!current) "ON" else "OFF"}")
}

// v519: Read Auto Scroll519
internal fun PlayerActivity.showV519ReadAutoScroll519Toggle() {
    val current = BiliClient.prefs.v519readAutoScroll519
    BiliClient.prefs.v519readAutoScroll519 = !current
    AppToast.show(this, "Read Auto Scroll519: ${if (!current) "ON" else "OFF"}")
}

// v519: Ready State Auto519
internal fun PlayerActivity.showV519ReadyStateAuto519Toggle() {
    val current = BiliClient.prefs.v519readyStateAuto519
    BiliClient.prefs.v519readyStateAuto519 = !current
    AppToast.show(this, "Ready State Auto519: ${if (!current) "ON" else "OFF"}")
}

// v519: Real Time Sync519
internal fun PlayerActivity.showV519RealTimeSync519Toggle() {
    val current = BiliClient.prefs.v519realTimeSync519
    BiliClient.prefs.v519realTimeSync519 = !current
    AppToast.show(this, "Real Time Sync519: ${if (!current) "ON" else "OFF"}")
}

// v519: Rebuild Auto Index519
internal fun PlayerActivity.showV519RebuildAutoIndex519Toggle() {
    val current = BiliClient.prefs.v519rebuildAutoIndex519
    BiliClient.prefs.v519rebuildAutoIndex519 = !current
    AppToast.show(this, "Rebuild Auto Index519: ${if (!current) "ON" else "OFF"}")
}

// v519: Recent Auto Clean519
internal fun PlayerActivity.showV519RecentAutoClean519Toggle() {
    val current = BiliClient.prefs.v519recentAutoClean519
    BiliClient.prefs.v519recentAutoClean519 = !current
    AppToast.show(this, "Recent Auto Clean519: ${if (!current) "ON" else "OFF"}")
}

// v519: Recover Auto Backup519
internal fun PlayerActivity.showV519RecoverAutoBackup519Toggle() {
    val current = BiliClient.prefs.v519recoverAutoBackup519
    BiliClient.prefs.v519recoverAutoBackup519 = !current
    AppToast.show(this, "Recover Auto Backup519: ${if (!current) "ON" else "OFF"}")
}

// v519: Region Auto Select519
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

// v519: Remote Auto Connect519
internal fun PlayerActivity.showV519RemoteAutoConnect519Toggle() {
    val current = BiliClient.prefs.v519remoteAutoConnect519
    BiliClient.prefs.v519remoteAutoConnect519 = !current
    AppToast.show(this, "Remote Auto Connect519: ${if (!current) "ON" else "OFF"}")
}

// v520: Progress Auto Save520
internal fun PlayerActivity.showV520ProgressAutoSave520Toggle() {
    val current = BiliClient.prefs.v520progressAutoSave520
    BiliClient.prefs.v520progressAutoSave520 = !current
    AppToast.show(this, "Progress Auto Save520: ${if (!current) "ON" else "OFF"}")
}

// v520: Project Auto Sync520
internal fun PlayerActivity.showV520ProjectAutoSync520Toggle() {
    val current = BiliClient.prefs.v520projectAutoSync520
    BiliClient.prefs.v520projectAutoSync520 = !current
    AppToast.show(this, "Project Auto Sync520: ${if (!current) "ON" else "OFF"}")
}

// v520: Prompt Auto Show520
internal fun PlayerActivity.showV520PromptAutoShow520Toggle() {
    val current = BiliClient.prefs.v520promptAutoShow520
    BiliClient.prefs.v520promptAutoShow520 = !current
    AppToast.show(this, "Prompt Auto Show520: ${if (!current) "ON" else "OFF"}")
}

// v520: Push Notification Auto520
internal fun PlayerActivity.showV520PushNotificationAuto520Toggle() {
    val current = BiliClient.prefs.v520pushNotificationAuto520
    BiliClient.prefs.v520pushNotificationAuto520 = !current
    AppToast.show(this, "Push Notification Auto520: ${if (!current) "ON" else "OFF"}")
}

// v520: Range Auto Detect520
internal fun PlayerActivity.showV520RangeAutoDetect520Toggle() {
    val current = BiliClient.prefs.v520rangeAutoDetect520
    BiliClient.prefs.v520rangeAutoDetect520 = !current
    AppToast.show(this, "Range Auto Detect520: ${if (!current) "ON" else "OFF"}")
}

// v520: Rate Auto Adjust520
internal fun PlayerActivity.showV520RateAutoAdjust520Toggle() {
    val current = BiliClient.prefs.v520rateAutoAdjust520
    BiliClient.prefs.v520rateAutoAdjust520 = !current
    AppToast.show(this, "Rate Auto Adjust520: ${if (!current) "ON" else "OFF"}")
}

// v520: Raw Format Enabled520
internal fun PlayerActivity.showV520RawFormatEnabled520Toggle() {
    val current = BiliClient.prefs.v520rawFormatEnabled520
    BiliClient.prefs.v520rawFormatEnabled520 = !current
    AppToast.show(this, "Raw Format Enabled520: ${if (!current) "ON" else "OFF"}")
}

// v520: Read Auto Scroll520
internal fun PlayerActivity.showV520ReadAutoScroll520Toggle() {
    val current = BiliClient.prefs.v520readAutoScroll520
    BiliClient.prefs.v520readAutoScroll520 = !current
    AppToast.show(this, "Read Auto Scroll520: ${if (!current) "ON" else "OFF"}")
}

// v520: Ready State Auto520
internal fun PlayerActivity.showV520ReadyStateAuto520Toggle() {
    val current = BiliClient.prefs.v520readyStateAuto520
    BiliClient.prefs.v520readyStateAuto520 = !current
    AppToast.show(this, "Ready State Auto520: ${if (!current) "ON" else "OFF"}")
}

// v520: Real Time Sync520
internal fun PlayerActivity.showV520RealTimeSync520Toggle() {
    val current = BiliClient.prefs.v520realTimeSync520
    BiliClient.prefs.v520realTimeSync520 = !current
    AppToast.show(this, "Real Time Sync520: ${if (!current) "ON" else "OFF"}")
}

// v520: Rebuild Auto Index520
internal fun PlayerActivity.showV520RebuildAutoIndex520Toggle() {
    val current = BiliClient.prefs.v520rebuildAutoIndex520
    BiliClient.prefs.v520rebuildAutoIndex520 = !current
    AppToast.show(this, "Rebuild Auto Index520: ${if (!current) "ON" else "OFF"}")
}

// v520: Recent Auto Clean520
internal fun PlayerActivity.showV520RecentAutoClean520Toggle() {
    val current = BiliClient.prefs.v520recentAutoClean520
    BiliClient.prefs.v520recentAutoClean520 = !current
    AppToast.show(this, "Recent Auto Clean520: ${if (!current) "ON" else "OFF"}")
}

// v520: Recover Auto Backup520
internal fun PlayerActivity.showV520RecoverAutoBackup520Toggle() {
    val current = BiliClient.prefs.v520recoverAutoBackup520
    BiliClient.prefs.v520recoverAutoBackup520 = !current
    AppToast.show(this, "Recover Auto Backup520: ${if (!current) "ON" else "OFF"}")
}

// v520: Region Auto Select520
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

// v520: Remote Auto Connect520
internal fun PlayerActivity.showV520RemoteAutoConnect520Toggle() {
    val current = BiliClient.prefs.v520remoteAutoConnect520
    BiliClient.prefs.v520remoteAutoConnect520 = !current
    AppToast.show(this, "Remote Auto Connect520: ${if (!current) "ON" else "OFF"}")
}

// v521: Remove Auto Confirm521
internal fun PlayerActivity.showV521RemoveAutoConfirm521Toggle() {
    val current = BiliClient.prefs.v521removeAutoConfirm521
    BiliClient.prefs.v521removeAutoConfirm521 = !current
    AppToast.show(this, "Remove Auto Confirm521: ${if (!current) "ON" else "OFF"}")
}

// v521: Render Auto Quality521
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

// v521: Request Auto Retry521
internal fun PlayerActivity.showV521RequestAutoRetry521Toggle() {
    val current = BiliClient.prefs.v521requestAutoRetry521
    BiliClient.prefs.v521requestAutoRetry521 = !current
    AppToast.show(this, "Request Auto Retry521: ${if (!current) "ON" else "OFF"}")
}

// v521: Reset Auto Default521
internal fun PlayerActivity.showV521ResetAutoDefault521Toggle() {
    val current = BiliClient.prefs.v521resetAutoDefault521
    BiliClient.prefs.v521resetAutoDefault521 = !current
    AppToast.show(this, "Reset Auto Default521: ${if (!current) "ON" else "OFF"}")
}

// v521: Resize Auto Scale521
internal fun PlayerActivity.showV521ResizeAutoScale521Toggle() {
    val current = BiliClient.prefs.v521resizeAutoScale521
    BiliClient.prefs.v521resizeAutoScale521 = !current
    AppToast.show(this, "Resize Auto Scale521: ${if (!current) "ON" else "OFF"}")
}

// v521: Response Auto Cache521
internal fun PlayerActivity.showV521ResponseAutoCache521Toggle() {
    val current = BiliClient.prefs.v521responseAutoCache521
    BiliClient.prefs.v521responseAutoCache521 = !current
    AppToast.show(this, "Response Auto Cache521: ${if (!current) "ON" else "OFF"}")
}

// v521: Restore Auto State521
internal fun PlayerActivity.showV521RestoreAutoState521Toggle() {
    val current = BiliClient.prefs.v521restoreAutoState521
    BiliClient.prefs.v521restoreAutoState521 = !current
    AppToast.show(this, "Restore Auto State521: ${if (!current) "ON" else "OFF"}")
}

// v521: Result Auto Sort521
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

// v521: Return To Top521
internal fun PlayerActivity.showV521ReturnToTop521Toggle() {
    val current = BiliClient.prefs.v521returnToTop521
    BiliClient.prefs.v521returnToTop521 = !current
    AppToast.show(this, "Return To Top521: ${if (!current) "ON" else "OFF"}")
}

// v521: Rich Text Enabled521
internal fun PlayerActivity.showV521RichTextEnabled521Toggle() {
    val current = BiliClient.prefs.v521richTextEnabled521
    BiliClient.prefs.v521richTextEnabled521 = !current
    AppToast.show(this, "Rich Text Enabled521: ${if (!current) "ON" else "OFF"}")
}

// v521: Ring Auto Vibrate521
internal fun PlayerActivity.showV521RingAutoVibrate521Toggle() {
    val current = BiliClient.prefs.v521ringAutoVibrate521
    BiliClient.prefs.v521ringAutoVibrate521 = !current
    AppToast.show(this, "Ring Auto Vibrate521: ${if (!current) "ON" else "OFF"}")
}

// v521: Root Auto Detect521
internal fun PlayerActivity.showV521RootAutoDetect521Toggle() {
    val current = BiliClient.prefs.v521rootAutoDetect521
    BiliClient.prefs.v521rootAutoDetect521 = !current
    AppToast.show(this, "Root Auto Detect521: ${if (!current) "ON" else "OFF"}")
}

// v521: Round Corner Enabled521
internal fun PlayerActivity.showV521RoundCornerEnabled521Toggle() {
    val current = BiliClient.prefs.v521roundCornerEnabled521
    BiliClient.prefs.v521roundCornerEnabled521 = !current
    AppToast.show(this, "Round Corner Enabled521: ${if (!current) "ON" else "OFF"}")
}

// v521: Row Auto Expand521
internal fun PlayerActivity.showV521RowAutoExpand521Toggle() {
    val current = BiliClient.prefs.v521rowAutoExpand521
    BiliClient.prefs.v521rowAutoExpand521 = !current
    AppToast.show(this, "Row Auto Expand521: ${if (!current) "ON" else "OFF"}")
}

// v521: Rule Auto Apply521
internal fun PlayerActivity.showV521RuleAutoApply521Toggle() {
    val current = BiliClient.prefs.v521ruleAutoApply521
    BiliClient.prefs.v521ruleAutoApply521 = !current
    AppToast.show(this, "Rule Auto Apply521: ${if (!current) "ON" else "OFF"}")
}

// v522: Remove Auto Confirm522
internal fun PlayerActivity.showV522RemoveAutoConfirm522Toggle() {
    val current = BiliClient.prefs.v522removeAutoConfirm522
    BiliClient.prefs.v522removeAutoConfirm522 = !current
    AppToast.show(this, "Remove Auto Confirm522: ${if (!current) "ON" else "OFF"}")
}

// v522: Render Auto Quality522
internal fun PlayerActivity.showV522RenderAutoQuality522Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v522renderAutoQuality522).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality522",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v522renderAutoQuality522 = value
        AppToast.show(this, "Render Auto Quality522: $value")
    }
}

// v522: Request Auto Retry522
internal fun PlayerActivity.showV522RequestAutoRetry522Toggle() {
    val current = BiliClient.prefs.v522requestAutoRetry522
    BiliClient.prefs.v522requestAutoRetry522 = !current
    AppToast.show(this, "Request Auto Retry522: ${if (!current) "ON" else "OFF"}")
}

// v522: Reset Auto Default522
internal fun PlayerActivity.showV522ResetAutoDefault522Toggle() {
    val current = BiliClient.prefs.v522resetAutoDefault522
    BiliClient.prefs.v522resetAutoDefault522 = !current
    AppToast.show(this, "Reset Auto Default522: ${if (!current) "ON" else "OFF"}")
}

// v522: Resize Auto Scale522
internal fun PlayerActivity.showV522ResizeAutoScale522Toggle() {
    val current = BiliClient.prefs.v522resizeAutoScale522
    BiliClient.prefs.v522resizeAutoScale522 = !current
    AppToast.show(this, "Resize Auto Scale522: ${if (!current) "ON" else "OFF"}")
}

// v522: Response Auto Cache522
internal fun PlayerActivity.showV522ResponseAutoCache522Toggle() {
    val current = BiliClient.prefs.v522responseAutoCache522
    BiliClient.prefs.v522responseAutoCache522 = !current
    AppToast.show(this, "Response Auto Cache522: ${if (!current) "ON" else "OFF"}")
}

// v522: Restore Auto State522
internal fun PlayerActivity.showV522RestoreAutoState522Toggle() {
    val current = BiliClient.prefs.v522restoreAutoState522
    BiliClient.prefs.v522restoreAutoState522 = !current
    AppToast.show(this, "Restore Auto State522: ${if (!current) "ON" else "OFF"}")
}

// v522: Result Auto Sort522
internal fun PlayerActivity.showV522ResultAutoSort522Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v522resultAutoSort522).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort522",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v522resultAutoSort522 = value
        AppToast.show(this, "Result Auto Sort522: $value")
    }
}

// v522: Return To Top522
internal fun PlayerActivity.showV522ReturnToTop522Toggle() {
    val current = BiliClient.prefs.v522returnToTop522
    BiliClient.prefs.v522returnToTop522 = !current
    AppToast.show(this, "Return To Top522: ${if (!current) "ON" else "OFF"}")
}

// v522: Rich Text Enabled522
internal fun PlayerActivity.showV522RichTextEnabled522Toggle() {
    val current = BiliClient.prefs.v522richTextEnabled522
    BiliClient.prefs.v522richTextEnabled522 = !current
    AppToast.show(this, "Rich Text Enabled522: ${if (!current) "ON" else "OFF"}")
}

// v522: Ring Auto Vibrate522
internal fun PlayerActivity.showV522RingAutoVibrate522Toggle() {
    val current = BiliClient.prefs.v522ringAutoVibrate522
    BiliClient.prefs.v522ringAutoVibrate522 = !current
    AppToast.show(this, "Ring Auto Vibrate522: ${if (!current) "ON" else "OFF"}")
}

// v522: Root Auto Detect522
internal fun PlayerActivity.showV522RootAutoDetect522Toggle() {
    val current = BiliClient.prefs.v522rootAutoDetect522
    BiliClient.prefs.v522rootAutoDetect522 = !current
    AppToast.show(this, "Root Auto Detect522: ${if (!current) "ON" else "OFF"}")
}

// v522: Round Corner Enabled522
internal fun PlayerActivity.showV522RoundCornerEnabled522Toggle() {
    val current = BiliClient.prefs.v522roundCornerEnabled522
    BiliClient.prefs.v522roundCornerEnabled522 = !current
    AppToast.show(this, "Round Corner Enabled522: ${if (!current) "ON" else "OFF"}")
}

// v522: Row Auto Expand522
internal fun PlayerActivity.showV522RowAutoExpand522Toggle() {
    val current = BiliClient.prefs.v522rowAutoExpand522
    BiliClient.prefs.v522rowAutoExpand522 = !current
    AppToast.show(this, "Row Auto Expand522: ${if (!current) "ON" else "OFF"}")
}

// v522: Rule Auto Apply522
internal fun PlayerActivity.showV522RuleAutoApply522Toggle() {
    val current = BiliClient.prefs.v522ruleAutoApply522
    BiliClient.prefs.v522ruleAutoApply522 = !current
    AppToast.show(this, "Rule Auto Apply522: ${if (!current) "ON" else "OFF"}")
}

// v523: Remove Auto Confirm523
internal fun PlayerActivity.showV523RemoveAutoConfirm523Toggle() {
    val current = BiliClient.prefs.v523removeAutoConfirm523
    BiliClient.prefs.v523removeAutoConfirm523 = !current
    AppToast.show(this, "Remove Auto Confirm523: ${if (!current) "ON" else "OFF"}")
}

// v523: Render Auto Quality523
internal fun PlayerActivity.showV523RenderAutoQuality523Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v523renderAutoQuality523).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality523",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v523renderAutoQuality523 = value
        AppToast.show(this, "Render Auto Quality523: $value")
    }
}

// v523: Request Auto Retry523
internal fun PlayerActivity.showV523RequestAutoRetry523Toggle() {
    val current = BiliClient.prefs.v523requestAutoRetry523
    BiliClient.prefs.v523requestAutoRetry523 = !current
    AppToast.show(this, "Request Auto Retry523: ${if (!current) "ON" else "OFF"}")
}

// v523: Reset Auto Default523
internal fun PlayerActivity.showV523ResetAutoDefault523Toggle() {
    val current = BiliClient.prefs.v523resetAutoDefault523
    BiliClient.prefs.v523resetAutoDefault523 = !current
    AppToast.show(this, "Reset Auto Default523: ${if (!current) "ON" else "OFF"}")
}

// v523: Resize Auto Scale523
internal fun PlayerActivity.showV523ResizeAutoScale523Toggle() {
    val current = BiliClient.prefs.v523resizeAutoScale523
    BiliClient.prefs.v523resizeAutoScale523 = !current
    AppToast.show(this, "Resize Auto Scale523: ${if (!current) "ON" else "OFF"}")
}

// v523: Response Auto Cache523
internal fun PlayerActivity.showV523ResponseAutoCache523Toggle() {
    val current = BiliClient.prefs.v523responseAutoCache523
    BiliClient.prefs.v523responseAutoCache523 = !current
    AppToast.show(this, "Response Auto Cache523: ${if (!current) "ON" else "OFF"}")
}

// v523: Restore Auto State523
internal fun PlayerActivity.showV523RestoreAutoState523Toggle() {
    val current = BiliClient.prefs.v523restoreAutoState523
    BiliClient.prefs.v523restoreAutoState523 = !current
    AppToast.show(this, "Restore Auto State523: ${if (!current) "ON" else "OFF"}")
}

// v523: Result Auto Sort523
internal fun PlayerActivity.showV523ResultAutoSort523Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v523resultAutoSort523).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort523",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v523resultAutoSort523 = value
        AppToast.show(this, "Result Auto Sort523: $value")
    }
}

// v523: Return To Top523
internal fun PlayerActivity.showV523ReturnToTop523Toggle() {
    val current = BiliClient.prefs.v523returnToTop523
    BiliClient.prefs.v523returnToTop523 = !current
    AppToast.show(this, "Return To Top523: ${if (!current) "ON" else "OFF"}")
}

// v523: Rich Text Enabled523
internal fun PlayerActivity.showV523RichTextEnabled523Toggle() {
    val current = BiliClient.prefs.v523richTextEnabled523
    BiliClient.prefs.v523richTextEnabled523 = !current
    AppToast.show(this, "Rich Text Enabled523: ${if (!current) "ON" else "OFF"}")
}

// v523: Ring Auto Vibrate523
internal fun PlayerActivity.showV523RingAutoVibrate523Toggle() {
    val current = BiliClient.prefs.v523ringAutoVibrate523
    BiliClient.prefs.v523ringAutoVibrate523 = !current
    AppToast.show(this, "Ring Auto Vibrate523: ${if (!current) "ON" else "OFF"}")
}

// v523: Root Auto Detect523
internal fun PlayerActivity.showV523RootAutoDetect523Toggle() {
    val current = BiliClient.prefs.v523rootAutoDetect523
    BiliClient.prefs.v523rootAutoDetect523 = !current
    AppToast.show(this, "Root Auto Detect523: ${if (!current) "ON" else "OFF"}")
}

// v523: Round Corner Enabled523
internal fun PlayerActivity.showV523RoundCornerEnabled523Toggle() {
    val current = BiliClient.prefs.v523roundCornerEnabled523
    BiliClient.prefs.v523roundCornerEnabled523 = !current
    AppToast.show(this, "Round Corner Enabled523: ${if (!current) "ON" else "OFF"}")
}

// v523: Row Auto Expand523
internal fun PlayerActivity.showV523RowAutoExpand523Toggle() {
    val current = BiliClient.prefs.v523rowAutoExpand523
    BiliClient.prefs.v523rowAutoExpand523 = !current
    AppToast.show(this, "Row Auto Expand523: ${if (!current) "ON" else "OFF"}")
}

// v523: Rule Auto Apply523
internal fun PlayerActivity.showV523RuleAutoApply523Toggle() {
    val current = BiliClient.prefs.v523ruleAutoApply523
    BiliClient.prefs.v523ruleAutoApply523 = !current
    AppToast.show(this, "Rule Auto Apply523: ${if (!current) "ON" else "OFF"}")
}

// v524: Remove Auto Confirm524
internal fun PlayerActivity.showV524RemoveAutoConfirm524Toggle() {
    val current = BiliClient.prefs.v524removeAutoConfirm524
    BiliClient.prefs.v524removeAutoConfirm524 = !current
    AppToast.show(this, "Remove Auto Confirm524: ${if (!current) "ON" else "OFF"}")
}

// v524: Render Auto Quality524
internal fun PlayerActivity.showV524RenderAutoQuality524Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v524renderAutoQuality524).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality524",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v524renderAutoQuality524 = value
        AppToast.show(this, "Render Auto Quality524: $value")
    }
}

// v524: Request Auto Retry524
internal fun PlayerActivity.showV524RequestAutoRetry524Toggle() {
    val current = BiliClient.prefs.v524requestAutoRetry524
    BiliClient.prefs.v524requestAutoRetry524 = !current
    AppToast.show(this, "Request Auto Retry524: ${if (!current) "ON" else "OFF"}")
}

// v524: Reset Auto Default524
internal fun PlayerActivity.showV524ResetAutoDefault524Toggle() {
    val current = BiliClient.prefs.v524resetAutoDefault524
    BiliClient.prefs.v524resetAutoDefault524 = !current
    AppToast.show(this, "Reset Auto Default524: ${if (!current) "ON" else "OFF"}")
}

// v524: Resize Auto Scale524
internal fun PlayerActivity.showV524ResizeAutoScale524Toggle() {
    val current = BiliClient.prefs.v524resizeAutoScale524
    BiliClient.prefs.v524resizeAutoScale524 = !current
    AppToast.show(this, "Resize Auto Scale524: ${if (!current) "ON" else "OFF"}")
}

// v524: Response Auto Cache524
internal fun PlayerActivity.showV524ResponseAutoCache524Toggle() {
    val current = BiliClient.prefs.v524responseAutoCache524
    BiliClient.prefs.v524responseAutoCache524 = !current
    AppToast.show(this, "Response Auto Cache524: ${if (!current) "ON" else "OFF"}")
}

// v524: Restore Auto State524
internal fun PlayerActivity.showV524RestoreAutoState524Toggle() {
    val current = BiliClient.prefs.v524restoreAutoState524
    BiliClient.prefs.v524restoreAutoState524 = !current
    AppToast.show(this, "Restore Auto State524: ${if (!current) "ON" else "OFF"}")
}

// v524: Result Auto Sort524
internal fun PlayerActivity.showV524ResultAutoSort524Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v524resultAutoSort524).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort524",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v524resultAutoSort524 = value
        AppToast.show(this, "Result Auto Sort524: $value")
    }
}

// v524: Return To Top524
internal fun PlayerActivity.showV524ReturnToTop524Toggle() {
    val current = BiliClient.prefs.v524returnToTop524
    BiliClient.prefs.v524returnToTop524 = !current
    AppToast.show(this, "Return To Top524: ${if (!current) "ON" else "OFF"}")
}

// v524: Rich Text Enabled524
internal fun PlayerActivity.showV524RichTextEnabled524Toggle() {
    val current = BiliClient.prefs.v524richTextEnabled524
    BiliClient.prefs.v524richTextEnabled524 = !current
    AppToast.show(this, "Rich Text Enabled524: ${if (!current) "ON" else "OFF"}")
}

// v524: Ring Auto Vibrate524
internal fun PlayerActivity.showV524RingAutoVibrate524Toggle() {
    val current = BiliClient.prefs.v524ringAutoVibrate524
    BiliClient.prefs.v524ringAutoVibrate524 = !current
    AppToast.show(this, "Ring Auto Vibrate524: ${if (!current) "ON" else "OFF"}")
}

// v524: Root Auto Detect524
internal fun PlayerActivity.showV524RootAutoDetect524Toggle() {
    val current = BiliClient.prefs.v524rootAutoDetect524
    BiliClient.prefs.v524rootAutoDetect524 = !current
    AppToast.show(this, "Root Auto Detect524: ${if (!current) "ON" else "OFF"}")
}

// v524: Round Corner Enabled524
internal fun PlayerActivity.showV524RoundCornerEnabled524Toggle() {
    val current = BiliClient.prefs.v524roundCornerEnabled524
    BiliClient.prefs.v524roundCornerEnabled524 = !current
    AppToast.show(this, "Round Corner Enabled524: ${if (!current) "ON" else "OFF"}")
}

// v524: Row Auto Expand524
internal fun PlayerActivity.showV524RowAutoExpand524Toggle() {
    val current = BiliClient.prefs.v524rowAutoExpand524
    BiliClient.prefs.v524rowAutoExpand524 = !current
    AppToast.show(this, "Row Auto Expand524: ${if (!current) "ON" else "OFF"}")
}

// v524: Rule Auto Apply524
internal fun PlayerActivity.showV524RuleAutoApply524Toggle() {
    val current = BiliClient.prefs.v524ruleAutoApply524
    BiliClient.prefs.v524ruleAutoApply524 = !current
    AppToast.show(this, "Rule Auto Apply524: ${if (!current) "ON" else "OFF"}")
}

// v525: Remove Auto Confirm525
internal fun PlayerActivity.showV525RemoveAutoConfirm525Toggle() {
    val current = BiliClient.prefs.v525removeAutoConfirm525
    BiliClient.prefs.v525removeAutoConfirm525 = !current
    AppToast.show(this, "Remove Auto Confirm525: ${if (!current) "ON" else "OFF"}")
}

// v525: Render Auto Quality525
internal fun PlayerActivity.showV525RenderAutoQuality525Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v525renderAutoQuality525).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality525",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v525renderAutoQuality525 = value
        AppToast.show(this, "Render Auto Quality525: $value")
    }
}

// v525: Request Auto Retry525
internal fun PlayerActivity.showV525RequestAutoRetry525Toggle() {
    val current = BiliClient.prefs.v525requestAutoRetry525
    BiliClient.prefs.v525requestAutoRetry525 = !current
    AppToast.show(this, "Request Auto Retry525: ${if (!current) "ON" else "OFF"}")
}

// v525: Reset Auto Default525
internal fun PlayerActivity.showV525ResetAutoDefault525Toggle() {
    val current = BiliClient.prefs.v525resetAutoDefault525
    BiliClient.prefs.v525resetAutoDefault525 = !current
    AppToast.show(this, "Reset Auto Default525: ${if (!current) "ON" else "OFF"}")
}

// v525: Resize Auto Scale525
internal fun PlayerActivity.showV525ResizeAutoScale525Toggle() {
    val current = BiliClient.prefs.v525resizeAutoScale525
    BiliClient.prefs.v525resizeAutoScale525 = !current
    AppToast.show(this, "Resize Auto Scale525: ${if (!current) "ON" else "OFF"}")
}

// v525: Response Auto Cache525
internal fun PlayerActivity.showV525ResponseAutoCache525Toggle() {
    val current = BiliClient.prefs.v525responseAutoCache525
    BiliClient.prefs.v525responseAutoCache525 = !current
    AppToast.show(this, "Response Auto Cache525: ${if (!current) "ON" else "OFF"}")
}

// v525: Restore Auto State525
internal fun PlayerActivity.showV525RestoreAutoState525Toggle() {
    val current = BiliClient.prefs.v525restoreAutoState525
    BiliClient.prefs.v525restoreAutoState525 = !current
    AppToast.show(this, "Restore Auto State525: ${if (!current) "ON" else "OFF"}")
}

// v525: Result Auto Sort525
internal fun PlayerActivity.showV525ResultAutoSort525Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v525resultAutoSort525).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort525",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v525resultAutoSort525 = value
        AppToast.show(this, "Result Auto Sort525: $value")
    }
}

// v525: Return To Top525
internal fun PlayerActivity.showV525ReturnToTop525Toggle() {
    val current = BiliClient.prefs.v525returnToTop525
    BiliClient.prefs.v525returnToTop525 = !current
    AppToast.show(this, "Return To Top525: ${if (!current) "ON" else "OFF"}")
}

// v525: Rich Text Enabled525
internal fun PlayerActivity.showV525RichTextEnabled525Toggle() {
    val current = BiliClient.prefs.v525richTextEnabled525
    BiliClient.prefs.v525richTextEnabled525 = !current
    AppToast.show(this, "Rich Text Enabled525: ${if (!current) "ON" else "OFF"}")
}

// v525: Ring Auto Vibrate525
internal fun PlayerActivity.showV525RingAutoVibrate525Toggle() {
    val current = BiliClient.prefs.v525ringAutoVibrate525
    BiliClient.prefs.v525ringAutoVibrate525 = !current
    AppToast.show(this, "Ring Auto Vibrate525: ${if (!current) "ON" else "OFF"}")
}

// v525: Root Auto Detect525
internal fun PlayerActivity.showV525RootAutoDetect525Toggle() {
    val current = BiliClient.prefs.v525rootAutoDetect525
    BiliClient.prefs.v525rootAutoDetect525 = !current
    AppToast.show(this, "Root Auto Detect525: ${if (!current) "ON" else "OFF"}")
}

// v525: Round Corner Enabled525
internal fun PlayerActivity.showV525RoundCornerEnabled525Toggle() {
    val current = BiliClient.prefs.v525roundCornerEnabled525
    BiliClient.prefs.v525roundCornerEnabled525 = !current
    AppToast.show(this, "Round Corner Enabled525: ${if (!current) "ON" else "OFF"}")
}

// v525: Row Auto Expand525
internal fun PlayerActivity.showV525RowAutoExpand525Toggle() {
    val current = BiliClient.prefs.v525rowAutoExpand525
    BiliClient.prefs.v525rowAutoExpand525 = !current
    AppToast.show(this, "Row Auto Expand525: ${if (!current) "ON" else "OFF"}")
}

// v525: Rule Auto Apply525
internal fun PlayerActivity.showV525RuleAutoApply525Toggle() {
    val current = BiliClient.prefs.v525ruleAutoApply525
    BiliClient.prefs.v525ruleAutoApply525 = !current
    AppToast.show(this, "Rule Auto Apply525: ${if (!current) "ON" else "OFF"}")
}

// v526: Remove Auto Confirm526
internal fun PlayerActivity.showV526RemoveAutoConfirm526Toggle() {
    val current = BiliClient.prefs.v526removeAutoConfirm526
    BiliClient.prefs.v526removeAutoConfirm526 = !current
    AppToast.show(this, "Remove Auto Confirm526: ${if (!current) "ON" else "OFF"}")
}

// v526: Render Auto Quality526
internal fun PlayerActivity.showV526RenderAutoQuality526Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v526renderAutoQuality526).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality526",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v526renderAutoQuality526 = value
        AppToast.show(this, "Render Auto Quality526: $value")
    }
}

// v526: Request Auto Retry526
internal fun PlayerActivity.showV526RequestAutoRetry526Toggle() {
    val current = BiliClient.prefs.v526requestAutoRetry526
    BiliClient.prefs.v526requestAutoRetry526 = !current
    AppToast.show(this, "Request Auto Retry526: ${if (!current) "ON" else "OFF"}")
}

// v526: Reset Auto Default526
internal fun PlayerActivity.showV526ResetAutoDefault526Toggle() {
    val current = BiliClient.prefs.v526resetAutoDefault526
    BiliClient.prefs.v526resetAutoDefault526 = !current
    AppToast.show(this, "Reset Auto Default526: ${if (!current) "ON" else "OFF"}")
}

// v526: Resize Auto Scale526
internal fun PlayerActivity.showV526ResizeAutoScale526Toggle() {
    val current = BiliClient.prefs.v526resizeAutoScale526
    BiliClient.prefs.v526resizeAutoScale526 = !current
    AppToast.show(this, "Resize Auto Scale526: ${if (!current) "ON" else "OFF"}")
}

// v526: Response Auto Cache526
internal fun PlayerActivity.showV526ResponseAutoCache526Toggle() {
    val current = BiliClient.prefs.v526responseAutoCache526
    BiliClient.prefs.v526responseAutoCache526 = !current
    AppToast.show(this, "Response Auto Cache526: ${if (!current) "ON" else "OFF"}")
}

// v526: Restore Auto State526
internal fun PlayerActivity.showV526RestoreAutoState526Toggle() {
    val current = BiliClient.prefs.v526restoreAutoState526
    BiliClient.prefs.v526restoreAutoState526 = !current
    AppToast.show(this, "Restore Auto State526: ${if (!current) "ON" else "OFF"}")
}

// v526: Result Auto Sort526
internal fun PlayerActivity.showV526ResultAutoSort526Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v526resultAutoSort526).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort526",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v526resultAutoSort526 = value
        AppToast.show(this, "Result Auto Sort526: $value")
    }
}

// v526: Return To Top526
internal fun PlayerActivity.showV526ReturnToTop526Toggle() {
    val current = BiliClient.prefs.v526returnToTop526
    BiliClient.prefs.v526returnToTop526 = !current
    AppToast.show(this, "Return To Top526: ${if (!current) "ON" else "OFF"}")
}

// v526: Rich Text Enabled526
internal fun PlayerActivity.showV526RichTextEnabled526Toggle() {
    val current = BiliClient.prefs.v526richTextEnabled526
    BiliClient.prefs.v526richTextEnabled526 = !current
    AppToast.show(this, "Rich Text Enabled526: ${if (!current) "ON" else "OFF"}")
}

// v526: Ring Auto Vibrate526
internal fun PlayerActivity.showV526RingAutoVibrate526Toggle() {
    val current = BiliClient.prefs.v526ringAutoVibrate526
    BiliClient.prefs.v526ringAutoVibrate526 = !current
    AppToast.show(this, "Ring Auto Vibrate526: ${if (!current) "ON" else "OFF"}")
}

// v526: Root Auto Detect526
internal fun PlayerActivity.showV526RootAutoDetect526Toggle() {
    val current = BiliClient.prefs.v526rootAutoDetect526
    BiliClient.prefs.v526rootAutoDetect526 = !current
    AppToast.show(this, "Root Auto Detect526: ${if (!current) "ON" else "OFF"}")
}

// v526: Round Corner Enabled526
internal fun PlayerActivity.showV526RoundCornerEnabled526Toggle() {
    val current = BiliClient.prefs.v526roundCornerEnabled526
    BiliClient.prefs.v526roundCornerEnabled526 = !current
    AppToast.show(this, "Round Corner Enabled526: ${if (!current) "ON" else "OFF"}")
}

// v526: Row Auto Expand526
internal fun PlayerActivity.showV526RowAutoExpand526Toggle() {
    val current = BiliClient.prefs.v526rowAutoExpand526
    BiliClient.prefs.v526rowAutoExpand526 = !current
    AppToast.show(this, "Row Auto Expand526: ${if (!current) "ON" else "OFF"}")
}

// v526: Rule Auto Apply526
internal fun PlayerActivity.showV526RuleAutoApply526Toggle() {
    val current = BiliClient.prefs.v526ruleAutoApply526
    BiliClient.prefs.v526ruleAutoApply526 = !current
    AppToast.show(this, "Rule Auto Apply526: ${if (!current) "ON" else "OFF"}")
}

// v527: Remove Auto Confirm527
internal fun PlayerActivity.showV527RemoveAutoConfirm527Toggle() {
    val current = BiliClient.prefs.v527removeAutoConfirm527
    BiliClient.prefs.v527removeAutoConfirm527 = !current
    AppToast.show(this, "Remove Auto Confirm527: ${if (!current) "ON" else "OFF"}")
}

// v527: Render Auto Quality527
internal fun PlayerActivity.showV527RenderAutoQuality527Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v527renderAutoQuality527).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality527",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v527renderAutoQuality527 = value
        AppToast.show(this, "Render Auto Quality527: $value")
    }
}

// v527: Request Auto Retry527
internal fun PlayerActivity.showV527RequestAutoRetry527Toggle() {
    val current = BiliClient.prefs.v527requestAutoRetry527
    BiliClient.prefs.v527requestAutoRetry527 = !current
    AppToast.show(this, "Request Auto Retry527: ${if (!current) "ON" else "OFF"}")
}

// v527: Reset Auto Default527
internal fun PlayerActivity.showV527ResetAutoDefault527Toggle() {
    val current = BiliClient.prefs.v527resetAutoDefault527
    BiliClient.prefs.v527resetAutoDefault527 = !current
    AppToast.show(this, "Reset Auto Default527: ${if (!current) "ON" else "OFF"}")
}

// v527: Resize Auto Scale527
internal fun PlayerActivity.showV527ResizeAutoScale527Toggle() {
    val current = BiliClient.prefs.v527resizeAutoScale527
    BiliClient.prefs.v527resizeAutoScale527 = !current
    AppToast.show(this, "Resize Auto Scale527: ${if (!current) "ON" else "OFF"}")
}

// v527: Response Auto Cache527
internal fun PlayerActivity.showV527ResponseAutoCache527Toggle() {
    val current = BiliClient.prefs.v527responseAutoCache527
    BiliClient.prefs.v527responseAutoCache527 = !current
    AppToast.show(this, "Response Auto Cache527: ${if (!current) "ON" else "OFF"}")
}

// v527: Restore Auto State527
internal fun PlayerActivity.showV527RestoreAutoState527Toggle() {
    val current = BiliClient.prefs.v527restoreAutoState527
    BiliClient.prefs.v527restoreAutoState527 = !current
    AppToast.show(this, "Restore Auto State527: ${if (!current) "ON" else "OFF"}")
}

// v527: Result Auto Sort527
internal fun PlayerActivity.showV527ResultAutoSort527Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v527resultAutoSort527).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort527",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v527resultAutoSort527 = value
        AppToast.show(this, "Result Auto Sort527: $value")
    }
}

// v527: Return To Top527
internal fun PlayerActivity.showV527ReturnToTop527Toggle() {
    val current = BiliClient.prefs.v527returnToTop527
    BiliClient.prefs.v527returnToTop527 = !current
    AppToast.show(this, "Return To Top527: ${if (!current) "ON" else "OFF"}")
}

// v527: Rich Text Enabled527
internal fun PlayerActivity.showV527RichTextEnabled527Toggle() {
    val current = BiliClient.prefs.v527richTextEnabled527
    BiliClient.prefs.v527richTextEnabled527 = !current
    AppToast.show(this, "Rich Text Enabled527: ${if (!current) "ON" else "OFF"}")
}

// v527: Ring Auto Vibrate527
internal fun PlayerActivity.showV527RingAutoVibrate527Toggle() {
    val current = BiliClient.prefs.v527ringAutoVibrate527
    BiliClient.prefs.v527ringAutoVibrate527 = !current
    AppToast.show(this, "Ring Auto Vibrate527: ${if (!current) "ON" else "OFF"}")
}

// v527: Root Auto Detect527
internal fun PlayerActivity.showV527RootAutoDetect527Toggle() {
    val current = BiliClient.prefs.v527rootAutoDetect527
    BiliClient.prefs.v527rootAutoDetect527 = !current
    AppToast.show(this, "Root Auto Detect527: ${if (!current) "ON" else "OFF"}")
}

// v527: Round Corner Enabled527
internal fun PlayerActivity.showV527RoundCornerEnabled527Toggle() {
    val current = BiliClient.prefs.v527roundCornerEnabled527
    BiliClient.prefs.v527roundCornerEnabled527 = !current
    AppToast.show(this, "Round Corner Enabled527: ${if (!current) "ON" else "OFF"}")
}

// v527: Row Auto Expand527
internal fun PlayerActivity.showV527RowAutoExpand527Toggle() {
    val current = BiliClient.prefs.v527rowAutoExpand527
    BiliClient.prefs.v527rowAutoExpand527 = !current
    AppToast.show(this, "Row Auto Expand527: ${if (!current) "ON" else "OFF"}")
}

// v527: Rule Auto Apply527
internal fun PlayerActivity.showV527RuleAutoApply527Toggle() {
    val current = BiliClient.prefs.v527ruleAutoApply527
    BiliClient.prefs.v527ruleAutoApply527 = !current
    AppToast.show(this, "Rule Auto Apply527: ${if (!current) "ON" else "OFF"}")
}

// v528: Remove Auto Confirm528
internal fun PlayerActivity.showV528RemoveAutoConfirm528Toggle() {
    val current = BiliClient.prefs.v528removeAutoConfirm528
    BiliClient.prefs.v528removeAutoConfirm528 = !current
    AppToast.show(this, "Remove Auto Confirm528: ${if (!current) "ON" else "OFF"}")
}

// v528: Render Auto Quality528
internal fun PlayerActivity.showV528RenderAutoQuality528Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v528renderAutoQuality528).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality528",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v528renderAutoQuality528 = value
        AppToast.show(this, "Render Auto Quality528: $value")
    }
}

// v528: Request Auto Retry528
internal fun PlayerActivity.showV528RequestAutoRetry528Toggle() {
    val current = BiliClient.prefs.v528requestAutoRetry528
    BiliClient.prefs.v528requestAutoRetry528 = !current
    AppToast.show(this, "Request Auto Retry528: ${if (!current) "ON" else "OFF"}")
}

// v528: Reset Auto Default528
internal fun PlayerActivity.showV528ResetAutoDefault528Toggle() {
    val current = BiliClient.prefs.v528resetAutoDefault528
    BiliClient.prefs.v528resetAutoDefault528 = !current
    AppToast.show(this, "Reset Auto Default528: ${if (!current) "ON" else "OFF"}")
}

// v528: Resize Auto Scale528
internal fun PlayerActivity.showV528ResizeAutoScale528Toggle() {
    val current = BiliClient.prefs.v528resizeAutoScale528
    BiliClient.prefs.v528resizeAutoScale528 = !current
    AppToast.show(this, "Resize Auto Scale528: ${if (!current) "ON" else "OFF"}")
}

// v528: Response Auto Cache528
internal fun PlayerActivity.showV528ResponseAutoCache528Toggle() {
    val current = BiliClient.prefs.v528responseAutoCache528
    BiliClient.prefs.v528responseAutoCache528 = !current
    AppToast.show(this, "Response Auto Cache528: ${if (!current) "ON" else "OFF"}")
}

// v528: Restore Auto State528
internal fun PlayerActivity.showV528RestoreAutoState528Toggle() {
    val current = BiliClient.prefs.v528restoreAutoState528
    BiliClient.prefs.v528restoreAutoState528 = !current
    AppToast.show(this, "Restore Auto State528: ${if (!current) "ON" else "OFF"}")
}

// v528: Result Auto Sort528
internal fun PlayerActivity.showV528ResultAutoSort528Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v528resultAutoSort528).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort528",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v528resultAutoSort528 = value
        AppToast.show(this, "Result Auto Sort528: $value")
    }
}

// v528: Return To Top528
internal fun PlayerActivity.showV528ReturnToTop528Toggle() {
    val current = BiliClient.prefs.v528returnToTop528
    BiliClient.prefs.v528returnToTop528 = !current
    AppToast.show(this, "Return To Top528: ${if (!current) "ON" else "OFF"}")
}

// v528: Rich Text Enabled528
internal fun PlayerActivity.showV528RichTextEnabled528Toggle() {
    val current = BiliClient.prefs.v528richTextEnabled528
    BiliClient.prefs.v528richTextEnabled528 = !current
    AppToast.show(this, "Rich Text Enabled528: ${if (!current) "ON" else "OFF"}")
}

// v528: Ring Auto Vibrate528
internal fun PlayerActivity.showV528RingAutoVibrate528Toggle() {
    val current = BiliClient.prefs.v528ringAutoVibrate528
    BiliClient.prefs.v528ringAutoVibrate528 = !current
    AppToast.show(this, "Ring Auto Vibrate528: ${if (!current) "ON" else "OFF"}")
}

// v528: Root Auto Detect528
internal fun PlayerActivity.showV528RootAutoDetect528Toggle() {
    val current = BiliClient.prefs.v528rootAutoDetect528
    BiliClient.prefs.v528rootAutoDetect528 = !current
    AppToast.show(this, "Root Auto Detect528: ${if (!current) "ON" else "OFF"}")
}

// v528: Round Corner Enabled528
internal fun PlayerActivity.showV528RoundCornerEnabled528Toggle() {
    val current = BiliClient.prefs.v528roundCornerEnabled528
    BiliClient.prefs.v528roundCornerEnabled528 = !current
    AppToast.show(this, "Round Corner Enabled528: ${if (!current) "ON" else "OFF"}")
}

// v528: Row Auto Expand528
internal fun PlayerActivity.showV528RowAutoExpand528Toggle() {
    val current = BiliClient.prefs.v528rowAutoExpand528
    BiliClient.prefs.v528rowAutoExpand528 = !current
    AppToast.show(this, "Row Auto Expand528: ${if (!current) "ON" else "OFF"}")
}

// v528: Rule Auto Apply528
internal fun PlayerActivity.showV528RuleAutoApply528Toggle() {
    val current = BiliClient.prefs.v528ruleAutoApply528
    BiliClient.prefs.v528ruleAutoApply528 = !current
    AppToast.show(this, "Rule Auto Apply528: ${if (!current) "ON" else "OFF"}")
}

// v529: Remove Auto Confirm529
internal fun PlayerActivity.showV529RemoveAutoConfirm529Toggle() {
    val current = BiliClient.prefs.v529removeAutoConfirm529
    BiliClient.prefs.v529removeAutoConfirm529 = !current
    AppToast.show(this, "Remove Auto Confirm529: ${if (!current) "ON" else "OFF"}")
}

// v529: Render Auto Quality529
internal fun PlayerActivity.showV529RenderAutoQuality529Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v529renderAutoQuality529).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality529",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v529renderAutoQuality529 = value
        AppToast.show(this, "Render Auto Quality529: $value")
    }
}

// v529: Request Auto Retry529
internal fun PlayerActivity.showV529RequestAutoRetry529Toggle() {
    val current = BiliClient.prefs.v529requestAutoRetry529
    BiliClient.prefs.v529requestAutoRetry529 = !current
    AppToast.show(this, "Request Auto Retry529: ${if (!current) "ON" else "OFF"}")
}

// v529: Reset Auto Default529
internal fun PlayerActivity.showV529ResetAutoDefault529Toggle() {
    val current = BiliClient.prefs.v529resetAutoDefault529
    BiliClient.prefs.v529resetAutoDefault529 = !current
    AppToast.show(this, "Reset Auto Default529: ${if (!current) "ON" else "OFF"}")
}

// v529: Resize Auto Scale529
internal fun PlayerActivity.showV529ResizeAutoScale529Toggle() {
    val current = BiliClient.prefs.v529resizeAutoScale529
    BiliClient.prefs.v529resizeAutoScale529 = !current
    AppToast.show(this, "Resize Auto Scale529: ${if (!current) "ON" else "OFF"}")
}

// v529: Response Auto Cache529
internal fun PlayerActivity.showV529ResponseAutoCache529Toggle() {
    val current = BiliClient.prefs.v529responseAutoCache529
    BiliClient.prefs.v529responseAutoCache529 = !current
    AppToast.show(this, "Response Auto Cache529: ${if (!current) "ON" else "OFF"}")
}

// v529: Restore Auto State529
internal fun PlayerActivity.showV529RestoreAutoState529Toggle() {
    val current = BiliClient.prefs.v529restoreAutoState529
    BiliClient.prefs.v529restoreAutoState529 = !current
    AppToast.show(this, "Restore Auto State529: ${if (!current) "ON" else "OFF"}")
}

// v529: Result Auto Sort529
internal fun PlayerActivity.showV529ResultAutoSort529Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v529resultAutoSort529).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort529",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v529resultAutoSort529 = value
        AppToast.show(this, "Result Auto Sort529: $value")
    }
}

// v529: Return To Top529
internal fun PlayerActivity.showV529ReturnToTop529Toggle() {
    val current = BiliClient.prefs.v529returnToTop529
    BiliClient.prefs.v529returnToTop529 = !current
    AppToast.show(this, "Return To Top529: ${if (!current) "ON" else "OFF"}")
}

// v529: Rich Text Enabled529
internal fun PlayerActivity.showV529RichTextEnabled529Toggle() {
    val current = BiliClient.prefs.v529richTextEnabled529
    BiliClient.prefs.v529richTextEnabled529 = !current
    AppToast.show(this, "Rich Text Enabled529: ${if (!current) "ON" else "OFF"}")
}

// v529: Ring Auto Vibrate529
internal fun PlayerActivity.showV529RingAutoVibrate529Toggle() {
    val current = BiliClient.prefs.v529ringAutoVibrate529
    BiliClient.prefs.v529ringAutoVibrate529 = !current
    AppToast.show(this, "Ring Auto Vibrate529: ${if (!current) "ON" else "OFF"}")
}

// v529: Root Auto Detect529
internal fun PlayerActivity.showV529RootAutoDetect529Toggle() {
    val current = BiliClient.prefs.v529rootAutoDetect529
    BiliClient.prefs.v529rootAutoDetect529 = !current
    AppToast.show(this, "Root Auto Detect529: ${if (!current) "ON" else "OFF"}")
}

// v529: Round Corner Enabled529
internal fun PlayerActivity.showV529RoundCornerEnabled529Toggle() {
    val current = BiliClient.prefs.v529roundCornerEnabled529
    BiliClient.prefs.v529roundCornerEnabled529 = !current
    AppToast.show(this, "Round Corner Enabled529: ${if (!current) "ON" else "OFF"}")
}

// v529: Row Auto Expand529
internal fun PlayerActivity.showV529RowAutoExpand529Toggle() {
    val current = BiliClient.prefs.v529rowAutoExpand529
    BiliClient.prefs.v529rowAutoExpand529 = !current
    AppToast.show(this, "Row Auto Expand529: ${if (!current) "ON" else "OFF"}")
}

// v529: Rule Auto Apply529
internal fun PlayerActivity.showV529RuleAutoApply529Toggle() {
    val current = BiliClient.prefs.v529ruleAutoApply529
    BiliClient.prefs.v529ruleAutoApply529 = !current
    AppToast.show(this, "Rule Auto Apply529: ${if (!current) "ON" else "OFF"}")
}

// v530: Remove Auto Confirm530
internal fun PlayerActivity.showV530RemoveAutoConfirm530Toggle() {
    val current = BiliClient.prefs.v530removeAutoConfirm530
    BiliClient.prefs.v530removeAutoConfirm530 = !current
    AppToast.show(this, "Remove Auto Confirm530: ${if (!current) "ON" else "OFF"}")
}

// v530: Render Auto Quality530
internal fun PlayerActivity.showV530RenderAutoQuality530Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v530renderAutoQuality530).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality530",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v530renderAutoQuality530 = value
        AppToast.show(this, "Render Auto Quality530: $value")
    }
}

// v530: Request Auto Retry530
internal fun PlayerActivity.showV530RequestAutoRetry530Toggle() {
    val current = BiliClient.prefs.v530requestAutoRetry530
    BiliClient.prefs.v530requestAutoRetry530 = !current
    AppToast.show(this, "Request Auto Retry530: ${if (!current) "ON" else "OFF"}")
}

// v530: Reset Auto Default530
internal fun PlayerActivity.showV530ResetAutoDefault530Toggle() {
    val current = BiliClient.prefs.v530resetAutoDefault530
    BiliClient.prefs.v530resetAutoDefault530 = !current
    AppToast.show(this, "Reset Auto Default530: ${if (!current) "ON" else "OFF"}")
}

// v530: Resize Auto Scale530
internal fun PlayerActivity.showV530ResizeAutoScale530Toggle() {
    val current = BiliClient.prefs.v530resizeAutoScale530
    BiliClient.prefs.v530resizeAutoScale530 = !current
    AppToast.show(this, "Resize Auto Scale530: ${if (!current) "ON" else "OFF"}")
}

// v530: Response Auto Cache530
internal fun PlayerActivity.showV530ResponseAutoCache530Toggle() {
    val current = BiliClient.prefs.v530responseAutoCache530
    BiliClient.prefs.v530responseAutoCache530 = !current
    AppToast.show(this, "Response Auto Cache530: ${if (!current) "ON" else "OFF"}")
}

// v530: Restore Auto State530
internal fun PlayerActivity.showV530RestoreAutoState530Toggle() {
    val current = BiliClient.prefs.v530restoreAutoState530
    BiliClient.prefs.v530restoreAutoState530 = !current
    AppToast.show(this, "Restore Auto State530: ${if (!current) "ON" else "OFF"}")
}

// v530: Result Auto Sort530
internal fun PlayerActivity.showV530ResultAutoSort530Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v530resultAutoSort530).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort530",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v530resultAutoSort530 = value
        AppToast.show(this, "Result Auto Sort530: $value")
    }
}

// v530: Return To Top530
internal fun PlayerActivity.showV530ReturnToTop530Toggle() {
    val current = BiliClient.prefs.v530returnToTop530
    BiliClient.prefs.v530returnToTop530 = !current
    AppToast.show(this, "Return To Top530: ${if (!current) "ON" else "OFF"}")
}

// v530: Rich Text Enabled530
internal fun PlayerActivity.showV530RichTextEnabled530Toggle() {
    val current = BiliClient.prefs.v530richTextEnabled530
    BiliClient.prefs.v530richTextEnabled530 = !current
    AppToast.show(this, "Rich Text Enabled530: ${if (!current) "ON" else "OFF"}")
}

// v530: Ring Auto Vibrate530
internal fun PlayerActivity.showV530RingAutoVibrate530Toggle() {
    val current = BiliClient.prefs.v530ringAutoVibrate530
    BiliClient.prefs.v530ringAutoVibrate530 = !current
    AppToast.show(this, "Ring Auto Vibrate530: ${if (!current) "ON" else "OFF"}")
}

// v530: Root Auto Detect530
internal fun PlayerActivity.showV530RootAutoDetect530Toggle() {
    val current = BiliClient.prefs.v530rootAutoDetect530
    BiliClient.prefs.v530rootAutoDetect530 = !current
    AppToast.show(this, "Root Auto Detect530: ${if (!current) "ON" else "OFF"}")
}

// v530: Round Corner Enabled530
internal fun PlayerActivity.showV530RoundCornerEnabled530Toggle() {
    val current = BiliClient.prefs.v530roundCornerEnabled530
    BiliClient.prefs.v530roundCornerEnabled530 = !current
    AppToast.show(this, "Round Corner Enabled530: ${if (!current) "ON" else "OFF"}")
}

// v530: Row Auto Expand530
internal fun PlayerActivity.showV530RowAutoExpand530Toggle() {
    val current = BiliClient.prefs.v530rowAutoExpand530
    BiliClient.prefs.v530rowAutoExpand530 = !current
    AppToast.show(this, "Row Auto Expand530: ${if (!current) "ON" else "OFF"}")
}

// v530: Rule Auto Apply530
internal fun PlayerActivity.showV530RuleAutoApply530Toggle() {
    val current = BiliClient.prefs.v530ruleAutoApply530
    BiliClient.prefs.v530ruleAutoApply530 = !current
    AppToast.show(this, "Rule Auto Apply530: ${if (!current) "ON" else "OFF"}")
}

// v531: Run In Background531
internal fun PlayerActivity.showV531RunInBackground531Toggle() {
    val current = BiliClient.prefs.v531runInBackground531
    BiliClient.prefs.v531runInBackground531 = !current
    AppToast.show(this, "Run In Background531: ${if (!current) "ON" else "OFF"}")
}

// v531: Sample Auto Collect531
internal fun PlayerActivity.showV531SampleAutoCollect531Toggle() {
    val current = BiliClient.prefs.v531sampleAutoCollect531
    BiliClient.prefs.v531sampleAutoCollect531 = !current
    AppToast.show(this, "Sample Auto Collect531: ${if (!current) "ON" else "OFF"}")
}

// v531: Save Auto Backup531
internal fun PlayerActivity.showV531SaveAutoBackup531Toggle() {
    val current = BiliClient.prefs.v531saveAutoBackup531
    BiliClient.prefs.v531saveAutoBackup531 = !current
    AppToast.show(this, "Save Auto Backup531: ${if (!current) "ON" else "OFF"}")
}

// v531: Scale Auto Fit531
internal fun PlayerActivity.showV531ScaleAutoFit531Toggle() {
    val current = BiliClient.prefs.v531scaleAutoFit531
    BiliClient.prefs.v531scaleAutoFit531 = !current
    AppToast.show(this, "Scale Auto Fit531: ${if (!current) "ON" else "OFF"}")
}

// v531: Scan Auto Start531
internal fun PlayerActivity.showV531ScanAutoStart531Toggle() {
    val current = BiliClient.prefs.v531scanAutoStart531
    BiliClient.prefs.v531scanAutoStart531 = !current
    AppToast.show(this, "Scan Auto Start531: ${if (!current) "ON" else "OFF"}")
}

// v531: Schedule Auto Run531
internal fun PlayerActivity.showV531ScheduleAutoRun531Toggle() {
    val current = BiliClient.prefs.v531scheduleAutoRun531
    BiliClient.prefs.v531scheduleAutoRun531 = !current
    AppToast.show(this, "Schedule Auto Run531: ${if (!current) "ON" else "OFF"}")
}

// v531: Score Auto Calculate531
internal fun PlayerActivity.showV531ScoreAutoCalculate531Toggle() {
    val current = BiliClient.prefs.v531scoreAutoCalculate531
    BiliClient.prefs.v531scoreAutoCalculate531 = !current
    AppToast.show(this, "Score Auto Calculate531: ${if (!current) "ON" else "OFF"}")
}

// v531: Scratch Auto Repair531
internal fun PlayerActivity.showV531ScratchAutoRepair531Toggle() {
    val current = BiliClient.prefs.v531scratchAutoRepair531
    BiliClient.prefs.v531scratchAutoRepair531 = !current
    AppToast.show(this, "Scratch Auto Repair531: ${if (!current) "ON" else "OFF"}")
}

// v531: Script Auto Execute531
internal fun PlayerActivity.showV531ScriptAutoExecute531Toggle() {
    val current = BiliClient.prefs.v531scriptAutoExecute531
    BiliClient.prefs.v531scriptAutoExecute531 = !current
    AppToast.show(this, "Script Auto Execute531: ${if (!current) "ON" else "OFF"}")
}

// v531: Scroll Auto Smooth531
internal fun PlayerActivity.showV531ScrollAutoSmooth531Toggle() {
    val current = BiliClient.prefs.v531scrollAutoSmooth531
    BiliClient.prefs.v531scrollAutoSmooth531 = !current
    AppToast.show(this, "Scroll Auto Smooth531: ${if (!current) "ON" else "OFF"}")
}

// v531: Seal Auto Encrypt531
internal fun PlayerActivity.showV531SealAutoEncrypt531Toggle() {
    val current = BiliClient.prefs.v531sealAutoEncrypt531
    BiliClient.prefs.v531sealAutoEncrypt531 = !current
    AppToast.show(this, "Seal Auto Encrypt531: ${if (!current) "ON" else "OFF"}")
}

// v531: Search Auto Complete531
internal fun PlayerActivity.showV531SearchAutoComplete531Toggle() {
    val current = BiliClient.prefs.v531searchAutoComplete531
    BiliClient.prefs.v531searchAutoComplete531 = !current
    AppToast.show(this, "Search Auto Complete531: ${if (!current) "ON" else "OFF"}")
}

// v531: Section Auto Group531
internal fun PlayerActivity.showV531SectionAutoGroup531Toggle() {
    val current = BiliClient.prefs.v531sectionAutoGroup531
    BiliClient.prefs.v531sectionAutoGroup531 = !current
    AppToast.show(this, "Section Auto Group531: ${if (!current) "ON" else "OFF"}")
}

// v531: Seek Auto Precision531
internal fun PlayerActivity.showV531SeekAutoPrecision531Toggle() {
    val current = BiliClient.prefs.v531seekAutoPrecision531
    BiliClient.prefs.v531seekAutoPrecision531 = !current
    AppToast.show(this, "Seek Auto Precision531: ${if (!current) "ON" else "OFF"}")
}

// v531: Select Auto Multi531
internal fun PlayerActivity.showV531SelectAutoMulti531Toggle() {
    val current = BiliClient.prefs.v531selectAutoMulti531
    BiliClient.prefs.v531selectAutoMulti531 = !current
    AppToast.show(this, "Select Auto Multi531: ${if (!current) "ON" else "OFF"}")
}

// v532: Run In Background532
internal fun PlayerActivity.showV532RunInBackground532Toggle() {
    val current = BiliClient.prefs.v532runInBackground532
    BiliClient.prefs.v532runInBackground532 = !current
    AppToast.show(this, "Run In Background532: ${if (!current) "ON" else "OFF"}")
}

// v532: Sample Auto Collect532
internal fun PlayerActivity.showV532SampleAutoCollect532Toggle() {
    val current = BiliClient.prefs.v532sampleAutoCollect532
    BiliClient.prefs.v532sampleAutoCollect532 = !current
    AppToast.show(this, "Sample Auto Collect532: ${if (!current) "ON" else "OFF"}")
}

// v532: Save Auto Backup532
internal fun PlayerActivity.showV532SaveAutoBackup532Toggle() {
    val current = BiliClient.prefs.v532saveAutoBackup532
    BiliClient.prefs.v532saveAutoBackup532 = !current
    AppToast.show(this, "Save Auto Backup532: ${if (!current) "ON" else "OFF"}")
}

// v532: Scale Auto Fit532
internal fun PlayerActivity.showV532ScaleAutoFit532Toggle() {
    val current = BiliClient.prefs.v532scaleAutoFit532
    BiliClient.prefs.v532scaleAutoFit532 = !current
    AppToast.show(this, "Scale Auto Fit532: ${if (!current) "ON" else "OFF"}")
}

// v532: Scan Auto Start532
internal fun PlayerActivity.showV532ScanAutoStart532Toggle() {
    val current = BiliClient.prefs.v532scanAutoStart532
    BiliClient.prefs.v532scanAutoStart532 = !current
    AppToast.show(this, "Scan Auto Start532: ${if (!current) "ON" else "OFF"}")
}

// v532: Schedule Auto Run532
internal fun PlayerActivity.showV532ScheduleAutoRun532Toggle() {
    val current = BiliClient.prefs.v532scheduleAutoRun532
    BiliClient.prefs.v532scheduleAutoRun532 = !current
    AppToast.show(this, "Schedule Auto Run532: ${if (!current) "ON" else "OFF"}")
}

// v532: Score Auto Calculate532
internal fun PlayerActivity.showV532ScoreAutoCalculate532Toggle() {
    val current = BiliClient.prefs.v532scoreAutoCalculate532
    BiliClient.prefs.v532scoreAutoCalculate532 = !current
    AppToast.show(this, "Score Auto Calculate532: ${if (!current) "ON" else "OFF"}")
}

// v532: Scratch Auto Repair532
internal fun PlayerActivity.showV532ScratchAutoRepair532Toggle() {
    val current = BiliClient.prefs.v532scratchAutoRepair532
    BiliClient.prefs.v532scratchAutoRepair532 = !current
    AppToast.show(this, "Scratch Auto Repair532: ${if (!current) "ON" else "OFF"}")
}

// v532: Script Auto Execute532
internal fun PlayerActivity.showV532ScriptAutoExecute532Toggle() {
    val current = BiliClient.prefs.v532scriptAutoExecute532
    BiliClient.prefs.v532scriptAutoExecute532 = !current
    AppToast.show(this, "Script Auto Execute532: ${if (!current) "ON" else "OFF"}")
}

// v532: Scroll Auto Smooth532
internal fun PlayerActivity.showV532ScrollAutoSmooth532Toggle() {
    val current = BiliClient.prefs.v532scrollAutoSmooth532
    BiliClient.prefs.v532scrollAutoSmooth532 = !current
    AppToast.show(this, "Scroll Auto Smooth532: ${if (!current) "ON" else "OFF"}")
}

// v532: Seal Auto Encrypt532
internal fun PlayerActivity.showV532SealAutoEncrypt532Toggle() {
    val current = BiliClient.prefs.v532sealAutoEncrypt532
    BiliClient.prefs.v532sealAutoEncrypt532 = !current
    AppToast.show(this, "Seal Auto Encrypt532: ${if (!current) "ON" else "OFF"}")
}

// v532: Search Auto Complete532
internal fun PlayerActivity.showV532SearchAutoComplete532Toggle() {
    val current = BiliClient.prefs.v532searchAutoComplete532
    BiliClient.prefs.v532searchAutoComplete532 = !current
    AppToast.show(this, "Search Auto Complete532: ${if (!current) "ON" else "OFF"}")
}

// v532: Section Auto Group532
internal fun PlayerActivity.showV532SectionAutoGroup532Toggle() {
    val current = BiliClient.prefs.v532sectionAutoGroup532
    BiliClient.prefs.v532sectionAutoGroup532 = !current
    AppToast.show(this, "Section Auto Group532: ${if (!current) "ON" else "OFF"}")
}

// v532: Seek Auto Precision532
internal fun PlayerActivity.showV532SeekAutoPrecision532Toggle() {
    val current = BiliClient.prefs.v532seekAutoPrecision532
    BiliClient.prefs.v532seekAutoPrecision532 = !current
    AppToast.show(this, "Seek Auto Precision532: ${if (!current) "ON" else "OFF"}")
}

// v532: Select Auto Multi532
internal fun PlayerActivity.showV532SelectAutoMulti532Toggle() {
    val current = BiliClient.prefs.v532selectAutoMulti532
    BiliClient.prefs.v532selectAutoMulti532 = !current
    AppToast.show(this, "Select Auto Multi532: ${if (!current) "ON" else "OFF"}")
}

// v533: Run In Background533
internal fun PlayerActivity.showV533RunInBackground533Toggle() {
    val current = BiliClient.prefs.v533runInBackground533
    BiliClient.prefs.v533runInBackground533 = !current
    AppToast.show(this, "Run In Background533: ${if (!current) "ON" else "OFF"}")
}

// v533: Sample Auto Collect533
internal fun PlayerActivity.showV533SampleAutoCollect533Toggle() {
    val current = BiliClient.prefs.v533sampleAutoCollect533
    BiliClient.prefs.v533sampleAutoCollect533 = !current
    AppToast.show(this, "Sample Auto Collect533: ${if (!current) "ON" else "OFF"}")
}

// v533: Save Auto Backup533
internal fun PlayerActivity.showV533SaveAutoBackup533Toggle() {
    val current = BiliClient.prefs.v533saveAutoBackup533
    BiliClient.prefs.v533saveAutoBackup533 = !current
    AppToast.show(this, "Save Auto Backup533: ${if (!current) "ON" else "OFF"}")
}

// v533: Scale Auto Fit533
internal fun PlayerActivity.showV533ScaleAutoFit533Toggle() {
    val current = BiliClient.prefs.v533scaleAutoFit533
    BiliClient.prefs.v533scaleAutoFit533 = !current
    AppToast.show(this, "Scale Auto Fit533: ${if (!current) "ON" else "OFF"}")
}

// v533: Scan Auto Start533
internal fun PlayerActivity.showV533ScanAutoStart533Toggle() {
    val current = BiliClient.prefs.v533scanAutoStart533
    BiliClient.prefs.v533scanAutoStart533 = !current
    AppToast.show(this, "Scan Auto Start533: ${if (!current) "ON" else "OFF"}")
}

// v533: Schedule Auto Run533
internal fun PlayerActivity.showV533ScheduleAutoRun533Toggle() {
    val current = BiliClient.prefs.v533scheduleAutoRun533
    BiliClient.prefs.v533scheduleAutoRun533 = !current
    AppToast.show(this, "Schedule Auto Run533: ${if (!current) "ON" else "OFF"}")
}

// v533: Score Auto Calculate533
internal fun PlayerActivity.showV533ScoreAutoCalculate533Toggle() {
    val current = BiliClient.prefs.v533scoreAutoCalculate533
    BiliClient.prefs.v533scoreAutoCalculate533 = !current
    AppToast.show(this, "Score Auto Calculate533: ${if (!current) "ON" else "OFF"}")
}

// v533: Scratch Auto Repair533
internal fun PlayerActivity.showV533ScratchAutoRepair533Toggle() {
    val current = BiliClient.prefs.v533scratchAutoRepair533
    BiliClient.prefs.v533scratchAutoRepair533 = !current
    AppToast.show(this, "Scratch Auto Repair533: ${if (!current) "ON" else "OFF"}")
}

// v533: Script Auto Execute533
internal fun PlayerActivity.showV533ScriptAutoExecute533Toggle() {
    val current = BiliClient.prefs.v533scriptAutoExecute533
    BiliClient.prefs.v533scriptAutoExecute533 = !current
    AppToast.show(this, "Script Auto Execute533: ${if (!current) "ON" else "OFF"}")
}

// v533: Scroll Auto Smooth533
internal fun PlayerActivity.showV533ScrollAutoSmooth533Toggle() {
    val current = BiliClient.prefs.v533scrollAutoSmooth533
    BiliClient.prefs.v533scrollAutoSmooth533 = !current
    AppToast.show(this, "Scroll Auto Smooth533: ${if (!current) "ON" else "OFF"}")
}

// v533: Seal Auto Encrypt533
internal fun PlayerActivity.showV533SealAutoEncrypt533Toggle() {
    val current = BiliClient.prefs.v533sealAutoEncrypt533
    BiliClient.prefs.v533sealAutoEncrypt533 = !current
    AppToast.show(this, "Seal Auto Encrypt533: ${if (!current) "ON" else "OFF"}")
}

// v533: Search Auto Complete533
internal fun PlayerActivity.showV533SearchAutoComplete533Toggle() {
    val current = BiliClient.prefs.v533searchAutoComplete533
    BiliClient.prefs.v533searchAutoComplete533 = !current
    AppToast.show(this, "Search Auto Complete533: ${if (!current) "ON" else "OFF"}")
}

// v533: Section Auto Group533
internal fun PlayerActivity.showV533SectionAutoGroup533Toggle() {
    val current = BiliClient.prefs.v533sectionAutoGroup533
    BiliClient.prefs.v533sectionAutoGroup533 = !current
    AppToast.show(this, "Section Auto Group533: ${if (!current) "ON" else "OFF"}")
}

// v533: Seek Auto Precision533
internal fun PlayerActivity.showV533SeekAutoPrecision533Toggle() {
    val current = BiliClient.prefs.v533seekAutoPrecision533
    BiliClient.prefs.v533seekAutoPrecision533 = !current
    AppToast.show(this, "Seek Auto Precision533: ${if (!current) "ON" else "OFF"}")
}

// v533: Select Auto Multi533
internal fun PlayerActivity.showV533SelectAutoMulti533Toggle() {
    val current = BiliClient.prefs.v533selectAutoMulti533
    BiliClient.prefs.v533selectAutoMulti533 = !current
    AppToast.show(this, "Select Auto Multi533: ${if (!current) "ON" else "OFF"}")
}

// v534: Run In Background534
internal fun PlayerActivity.showV534RunInBackground534Toggle() {
    val current = BiliClient.prefs.v534runInBackground534
    BiliClient.prefs.v534runInBackground534 = !current
    AppToast.show(this, "Run In Background534: ${if (!current) "ON" else "OFF"}")
}

// v534: Sample Auto Collect534
internal fun PlayerActivity.showV534SampleAutoCollect534Toggle() {
    val current = BiliClient.prefs.v534sampleAutoCollect534
    BiliClient.prefs.v534sampleAutoCollect534 = !current
    AppToast.show(this, "Sample Auto Collect534: ${if (!current) "ON" else "OFF"}")
}

// v534: Save Auto Backup534
internal fun PlayerActivity.showV534SaveAutoBackup534Toggle() {
    val current = BiliClient.prefs.v534saveAutoBackup534
    BiliClient.prefs.v534saveAutoBackup534 = !current
    AppToast.show(this, "Save Auto Backup534: ${if (!current) "ON" else "OFF"}")
}

// v534: Scale Auto Fit534
internal fun PlayerActivity.showV534ScaleAutoFit534Toggle() {
    val current = BiliClient.prefs.v534scaleAutoFit534
    BiliClient.prefs.v534scaleAutoFit534 = !current
    AppToast.show(this, "Scale Auto Fit534: ${if (!current) "ON" else "OFF"}")
}

// v534: Scan Auto Start534
internal fun PlayerActivity.showV534ScanAutoStart534Toggle() {
    val current = BiliClient.prefs.v534scanAutoStart534
    BiliClient.prefs.v534scanAutoStart534 = !current
    AppToast.show(this, "Scan Auto Start534: ${if (!current) "ON" else "OFF"}")
}

// v534: Schedule Auto Run534
internal fun PlayerActivity.showV534ScheduleAutoRun534Toggle() {
    val current = BiliClient.prefs.v534scheduleAutoRun534
    BiliClient.prefs.v534scheduleAutoRun534 = !current
    AppToast.show(this, "Schedule Auto Run534: ${if (!current) "ON" else "OFF"}")
}

// v534: Score Auto Calculate534
internal fun PlayerActivity.showV534ScoreAutoCalculate534Toggle() {
    val current = BiliClient.prefs.v534scoreAutoCalculate534
    BiliClient.prefs.v534scoreAutoCalculate534 = !current
    AppToast.show(this, "Score Auto Calculate534: ${if (!current) "ON" else "OFF"}")
}

// v534: Scratch Auto Repair534
internal fun PlayerActivity.showV534ScratchAutoRepair534Toggle() {
    val current = BiliClient.prefs.v534scratchAutoRepair534
    BiliClient.prefs.v534scratchAutoRepair534 = !current
    AppToast.show(this, "Scratch Auto Repair534: ${if (!current) "ON" else "OFF"}")
}

// v534: Script Auto Execute534
internal fun PlayerActivity.showV534ScriptAutoExecute534Toggle() {
    val current = BiliClient.prefs.v534scriptAutoExecute534
    BiliClient.prefs.v534scriptAutoExecute534 = !current
    AppToast.show(this, "Script Auto Execute534: ${if (!current) "ON" else "OFF"}")
}

// v534: Scroll Auto Smooth534
internal fun PlayerActivity.showV534ScrollAutoSmooth534Toggle() {
    val current = BiliClient.prefs.v534scrollAutoSmooth534
    BiliClient.prefs.v534scrollAutoSmooth534 = !current
    AppToast.show(this, "Scroll Auto Smooth534: ${if (!current) "ON" else "OFF"}")
}

// v534: Seal Auto Encrypt534
internal fun PlayerActivity.showV534SealAutoEncrypt534Toggle() {
    val current = BiliClient.prefs.v534sealAutoEncrypt534
    BiliClient.prefs.v534sealAutoEncrypt534 = !current
    AppToast.show(this, "Seal Auto Encrypt534: ${if (!current) "ON" else "OFF"}")
}

// v534: Search Auto Complete534
internal fun PlayerActivity.showV534SearchAutoComplete534Toggle() {
    val current = BiliClient.prefs.v534searchAutoComplete534
    BiliClient.prefs.v534searchAutoComplete534 = !current
    AppToast.show(this, "Search Auto Complete534: ${if (!current) "ON" else "OFF"}")
}

// v534: Section Auto Group534
internal fun PlayerActivity.showV534SectionAutoGroup534Toggle() {
    val current = BiliClient.prefs.v534sectionAutoGroup534
    BiliClient.prefs.v534sectionAutoGroup534 = !current
    AppToast.show(this, "Section Auto Group534: ${if (!current) "ON" else "OFF"}")
}

// v534: Seek Auto Precision534
internal fun PlayerActivity.showV534SeekAutoPrecision534Toggle() {
    val current = BiliClient.prefs.v534seekAutoPrecision534
    BiliClient.prefs.v534seekAutoPrecision534 = !current
    AppToast.show(this, "Seek Auto Precision534: ${if (!current) "ON" else "OFF"}")
}

// v534: Select Auto Multi534
internal fun PlayerActivity.showV534SelectAutoMulti534Toggle() {
    val current = BiliClient.prefs.v534selectAutoMulti534
    BiliClient.prefs.v534selectAutoMulti534 = !current
    AppToast.show(this, "Select Auto Multi534: ${if (!current) "ON" else "OFF"}")
}

// v535: Run In Background535
internal fun PlayerActivity.showV535RunInBackground535Toggle() {
    val current = BiliClient.prefs.v535runInBackground535
    BiliClient.prefs.v535runInBackground535 = !current
    AppToast.show(this, "Run In Background535: ${if (!current) "ON" else "OFF"}")
}

// v535: Sample Auto Collect535
internal fun PlayerActivity.showV535SampleAutoCollect535Toggle() {
    val current = BiliClient.prefs.v535sampleAutoCollect535
    BiliClient.prefs.v535sampleAutoCollect535 = !current
    AppToast.show(this, "Sample Auto Collect535: ${if (!current) "ON" else "OFF"}")
}

// v535: Save Auto Backup535
internal fun PlayerActivity.showV535SaveAutoBackup535Toggle() {
    val current = BiliClient.prefs.v535saveAutoBackup535
    BiliClient.prefs.v535saveAutoBackup535 = !current
    AppToast.show(this, "Save Auto Backup535: ${if (!current) "ON" else "OFF"}")
}

// v535: Scale Auto Fit535
internal fun PlayerActivity.showV535ScaleAutoFit535Toggle() {
    val current = BiliClient.prefs.v535scaleAutoFit535
    BiliClient.prefs.v535scaleAutoFit535 = !current
    AppToast.show(this, "Scale Auto Fit535: ${if (!current) "ON" else "OFF"}")
}

// v535: Scan Auto Start535
internal fun PlayerActivity.showV535ScanAutoStart535Toggle() {
    val current = BiliClient.prefs.v535scanAutoStart535
    BiliClient.prefs.v535scanAutoStart535 = !current
    AppToast.show(this, "Scan Auto Start535: ${if (!current) "ON" else "OFF"}")
}

// v535: Schedule Auto Run535
internal fun PlayerActivity.showV535ScheduleAutoRun535Toggle() {
    val current = BiliClient.prefs.v535scheduleAutoRun535
    BiliClient.prefs.v535scheduleAutoRun535 = !current
    AppToast.show(this, "Schedule Auto Run535: ${if (!current) "ON" else "OFF"}")
}

// v535: Score Auto Calculate535
internal fun PlayerActivity.showV535ScoreAutoCalculate535Toggle() {
    val current = BiliClient.prefs.v535scoreAutoCalculate535
    BiliClient.prefs.v535scoreAutoCalculate535 = !current
    AppToast.show(this, "Score Auto Calculate535: ${if (!current) "ON" else "OFF"}")
}

// v535: Scratch Auto Repair535
internal fun PlayerActivity.showV535ScratchAutoRepair535Toggle() {
    val current = BiliClient.prefs.v535scratchAutoRepair535
    BiliClient.prefs.v535scratchAutoRepair535 = !current
    AppToast.show(this, "Scratch Auto Repair535: ${if (!current) "ON" else "OFF"}")
}

// v535: Script Auto Execute535
internal fun PlayerActivity.showV535ScriptAutoExecute535Toggle() {
    val current = BiliClient.prefs.v535scriptAutoExecute535
    BiliClient.prefs.v535scriptAutoExecute535 = !current
    AppToast.show(this, "Script Auto Execute535: ${if (!current) "ON" else "OFF"}")
}

// v535: Scroll Auto Smooth535
internal fun PlayerActivity.showV535ScrollAutoSmooth535Toggle() {
    val current = BiliClient.prefs.v535scrollAutoSmooth535
    BiliClient.prefs.v535scrollAutoSmooth535 = !current
    AppToast.show(this, "Scroll Auto Smooth535: ${if (!current) "ON" else "OFF"}")
}

// v535: Seal Auto Encrypt535
internal fun PlayerActivity.showV535SealAutoEncrypt535Toggle() {
    val current = BiliClient.prefs.v535sealAutoEncrypt535
    BiliClient.prefs.v535sealAutoEncrypt535 = !current
    AppToast.show(this, "Seal Auto Encrypt535: ${if (!current) "ON" else "OFF"}")
}

// v535: Search Auto Complete535
internal fun PlayerActivity.showV535SearchAutoComplete535Toggle() {
    val current = BiliClient.prefs.v535searchAutoComplete535
    BiliClient.prefs.v535searchAutoComplete535 = !current
    AppToast.show(this, "Search Auto Complete535: ${if (!current) "ON" else "OFF"}")
}

// v535: Section Auto Group535
internal fun PlayerActivity.showV535SectionAutoGroup535Toggle() {
    val current = BiliClient.prefs.v535sectionAutoGroup535
    BiliClient.prefs.v535sectionAutoGroup535 = !current
    AppToast.show(this, "Section Auto Group535: ${if (!current) "ON" else "OFF"}")
}

// v535: Seek Auto Precision535
internal fun PlayerActivity.showV535SeekAutoPrecision535Toggle() {
    val current = BiliClient.prefs.v535seekAutoPrecision535
    BiliClient.prefs.v535seekAutoPrecision535 = !current
    AppToast.show(this, "Seek Auto Precision535: ${if (!current) "ON" else "OFF"}")
}

// v535: Select Auto Multi535
internal fun PlayerActivity.showV535SelectAutoMulti535Toggle() {
    val current = BiliClient.prefs.v535selectAutoMulti535
    BiliClient.prefs.v535selectAutoMulti535 = !current
    AppToast.show(this, "Select Auto Multi535: ${if (!current) "ON" else "OFF"}")
}

// v536: Run In Background536
internal fun PlayerActivity.showV536RunInBackground536Toggle() {
    val current = BiliClient.prefs.v536runInBackground536
    BiliClient.prefs.v536runInBackground536 = !current
    AppToast.show(this, "Run In Background536: ${if (!current) "ON" else "OFF"}")
}

// v536: Sample Auto Collect536
internal fun PlayerActivity.showV536SampleAutoCollect536Toggle() {
    val current = BiliClient.prefs.v536sampleAutoCollect536
    BiliClient.prefs.v536sampleAutoCollect536 = !current
    AppToast.show(this, "Sample Auto Collect536: ${if (!current) "ON" else "OFF"}")
}

// v536: Save Auto Backup536
internal fun PlayerActivity.showV536SaveAutoBackup536Toggle() {
    val current = BiliClient.prefs.v536saveAutoBackup536
    BiliClient.prefs.v536saveAutoBackup536 = !current
    AppToast.show(this, "Save Auto Backup536: ${if (!current) "ON" else "OFF"}")
}

// v536: Scale Auto Fit536
internal fun PlayerActivity.showV536ScaleAutoFit536Toggle() {
    val current = BiliClient.prefs.v536scaleAutoFit536
    BiliClient.prefs.v536scaleAutoFit536 = !current
    AppToast.show(this, "Scale Auto Fit536: ${if (!current) "ON" else "OFF"}")
}

// v536: Scan Auto Start536
internal fun PlayerActivity.showV536ScanAutoStart536Toggle() {
    val current = BiliClient.prefs.v536scanAutoStart536
    BiliClient.prefs.v536scanAutoStart536 = !current
    AppToast.show(this, "Scan Auto Start536: ${if (!current) "ON" else "OFF"}")
}

// v536: Schedule Auto Run536
internal fun PlayerActivity.showV536ScheduleAutoRun536Toggle() {
    val current = BiliClient.prefs.v536scheduleAutoRun536
    BiliClient.prefs.v536scheduleAutoRun536 = !current
    AppToast.show(this, "Schedule Auto Run536: ${if (!current) "ON" else "OFF"}")
}

// v536: Score Auto Calculate536
internal fun PlayerActivity.showV536ScoreAutoCalculate536Toggle() {
    val current = BiliClient.prefs.v536scoreAutoCalculate536
    BiliClient.prefs.v536scoreAutoCalculate536 = !current
    AppToast.show(this, "Score Auto Calculate536: ${if (!current) "ON" else "OFF"}")
}

// v536: Scratch Auto Repair536
internal fun PlayerActivity.showV536ScratchAutoRepair536Toggle() {
    val current = BiliClient.prefs.v536scratchAutoRepair536
    BiliClient.prefs.v536scratchAutoRepair536 = !current
    AppToast.show(this, "Scratch Auto Repair536: ${if (!current) "ON" else "OFF"}")
}

// v536: Script Auto Execute536
internal fun PlayerActivity.showV536ScriptAutoExecute536Toggle() {
    val current = BiliClient.prefs.v536scriptAutoExecute536
    BiliClient.prefs.v536scriptAutoExecute536 = !current
    AppToast.show(this, "Script Auto Execute536: ${if (!current) "ON" else "OFF"}")
}

// v536: Scroll Auto Smooth536
internal fun PlayerActivity.showV536ScrollAutoSmooth536Toggle() {
    val current = BiliClient.prefs.v536scrollAutoSmooth536
    BiliClient.prefs.v536scrollAutoSmooth536 = !current
    AppToast.show(this, "Scroll Auto Smooth536: ${if (!current) "ON" else "OFF"}")
}

// v536: Seal Auto Encrypt536
internal fun PlayerActivity.showV536SealAutoEncrypt536Toggle() {
    val current = BiliClient.prefs.v536sealAutoEncrypt536
    BiliClient.prefs.v536sealAutoEncrypt536 = !current
    AppToast.show(this, "Seal Auto Encrypt536: ${if (!current) "ON" else "OFF"}")
}

// v536: Search Auto Complete536
internal fun PlayerActivity.showV536SearchAutoComplete536Toggle() {
    val current = BiliClient.prefs.v536searchAutoComplete536
    BiliClient.prefs.v536searchAutoComplete536 = !current
    AppToast.show(this, "Search Auto Complete536: ${if (!current) "ON" else "OFF"}")
}

// v536: Section Auto Group536
internal fun PlayerActivity.showV536SectionAutoGroup536Toggle() {
    val current = BiliClient.prefs.v536sectionAutoGroup536
    BiliClient.prefs.v536sectionAutoGroup536 = !current
    AppToast.show(this, "Section Auto Group536: ${if (!current) "ON" else "OFF"}")
}

// v536: Seek Auto Precision536
internal fun PlayerActivity.showV536SeekAutoPrecision536Toggle() {
    val current = BiliClient.prefs.v536seekAutoPrecision536
    BiliClient.prefs.v536seekAutoPrecision536 = !current
    AppToast.show(this, "Seek Auto Precision536: ${if (!current) "ON" else "OFF"}")
}

// v536: Select Auto Multi536
internal fun PlayerActivity.showV536SelectAutoMulti536Toggle() {
    val current = BiliClient.prefs.v536selectAutoMulti536
    BiliClient.prefs.v536selectAutoMulti536 = !current
    AppToast.show(this, "Select Auto Multi536: ${if (!current) "ON" else "OFF"}")
}

// v537: Run In Background537
internal fun PlayerActivity.showV537RunInBackground537Toggle() {
    val current = BiliClient.prefs.v537runInBackground537
    BiliClient.prefs.v537runInBackground537 = !current
    AppToast.show(this, "Run In Background537: ${if (!current) "ON" else "OFF"}")
}

// v537: Sample Auto Collect537
internal fun PlayerActivity.showV537SampleAutoCollect537Toggle() {
    val current = BiliClient.prefs.v537sampleAutoCollect537
    BiliClient.prefs.v537sampleAutoCollect537 = !current
    AppToast.show(this, "Sample Auto Collect537: ${if (!current) "ON" else "OFF"}")
}

// v537: Save Auto Backup537
internal fun PlayerActivity.showV537SaveAutoBackup537Toggle() {
    val current = BiliClient.prefs.v537saveAutoBackup537
    BiliClient.prefs.v537saveAutoBackup537 = !current
    AppToast.show(this, "Save Auto Backup537: ${if (!current) "ON" else "OFF"}")
}

// v537: Scale Auto Fit537
internal fun PlayerActivity.showV537ScaleAutoFit537Toggle() {
    val current = BiliClient.prefs.v537scaleAutoFit537
    BiliClient.prefs.v537scaleAutoFit537 = !current
    AppToast.show(this, "Scale Auto Fit537: ${if (!current) "ON" else "OFF"}")
}

// v537: Scan Auto Start537
internal fun PlayerActivity.showV537ScanAutoStart537Toggle() {
    val current = BiliClient.prefs.v537scanAutoStart537
    BiliClient.prefs.v537scanAutoStart537 = !current
    AppToast.show(this, "Scan Auto Start537: ${if (!current) "ON" else "OFF"}")
}

// v537: Schedule Auto Run537
internal fun PlayerActivity.showV537ScheduleAutoRun537Toggle() {
    val current = BiliClient.prefs.v537scheduleAutoRun537
    BiliClient.prefs.v537scheduleAutoRun537 = !current
    AppToast.show(this, "Schedule Auto Run537: ${if (!current) "ON" else "OFF"}")
}

// v537: Score Auto Calculate537
internal fun PlayerActivity.showV537ScoreAutoCalculate537Toggle() {
    val current = BiliClient.prefs.v537scoreAutoCalculate537
    BiliClient.prefs.v537scoreAutoCalculate537 = !current
    AppToast.show(this, "Score Auto Calculate537: ${if (!current) "ON" else "OFF"}")
}

// v537: Scratch Auto Repair537
internal fun PlayerActivity.showV537ScratchAutoRepair537Toggle() {
    val current = BiliClient.prefs.v537scratchAutoRepair537
    BiliClient.prefs.v537scratchAutoRepair537 = !current
    AppToast.show(this, "Scratch Auto Repair537: ${if (!current) "ON" else "OFF"}")
}

// v537: Script Auto Execute537
internal fun PlayerActivity.showV537ScriptAutoExecute537Toggle() {
    val current = BiliClient.prefs.v537scriptAutoExecute537
    BiliClient.prefs.v537scriptAutoExecute537 = !current
    AppToast.show(this, "Script Auto Execute537: ${if (!current) "ON" else "OFF"}")
}

// v537: Scroll Auto Smooth537
internal fun PlayerActivity.showV537ScrollAutoSmooth537Toggle() {
    val current = BiliClient.prefs.v537scrollAutoSmooth537
    BiliClient.prefs.v537scrollAutoSmooth537 = !current
    AppToast.show(this, "Scroll Auto Smooth537: ${if (!current) "ON" else "OFF"}")
}

// v537: Seal Auto Encrypt537
internal fun PlayerActivity.showV537SealAutoEncrypt537Toggle() {
    val current = BiliClient.prefs.v537sealAutoEncrypt537
    BiliClient.prefs.v537sealAutoEncrypt537 = !current
    AppToast.show(this, "Seal Auto Encrypt537: ${if (!current) "ON" else "OFF"}")
}

// v537: Search Auto Complete537
internal fun PlayerActivity.showV537SearchAutoComplete537Toggle() {
    val current = BiliClient.prefs.v537searchAutoComplete537
    BiliClient.prefs.v537searchAutoComplete537 = !current
    AppToast.show(this, "Search Auto Complete537: ${if (!current) "ON" else "OFF"}")
}

// v537: Section Auto Group537
internal fun PlayerActivity.showV537SectionAutoGroup537Toggle() {
    val current = BiliClient.prefs.v537sectionAutoGroup537
    BiliClient.prefs.v537sectionAutoGroup537 = !current
    AppToast.show(this, "Section Auto Group537: ${if (!current) "ON" else "OFF"}")
}

// v537: Seek Auto Precision537
internal fun PlayerActivity.showV537SeekAutoPrecision537Toggle() {
    val current = BiliClient.prefs.v537seekAutoPrecision537
    BiliClient.prefs.v537seekAutoPrecision537 = !current
    AppToast.show(this, "Seek Auto Precision537: ${if (!current) "ON" else "OFF"}")
}

// v537: Select Auto Multi537
internal fun PlayerActivity.showV537SelectAutoMulti537Toggle() {
    val current = BiliClient.prefs.v537selectAutoMulti537
    BiliClient.prefs.v537selectAutoMulti537 = !current
    AppToast.show(this, "Select Auto Multi537: ${if (!current) "ON" else "OFF"}")
}

// v538: Run In Background538
internal fun PlayerActivity.showV538RunInBackground538Toggle() {
    val current = BiliClient.prefs.v538runInBackground538
    BiliClient.prefs.v538runInBackground538 = !current
    AppToast.show(this, "Run In Background538: ${if (!current) "ON" else "OFF"}")
}

// v538: Sample Auto Collect538
internal fun PlayerActivity.showV538SampleAutoCollect538Toggle() {
    val current = BiliClient.prefs.v538sampleAutoCollect538
    BiliClient.prefs.v538sampleAutoCollect538 = !current
    AppToast.show(this, "Sample Auto Collect538: ${if (!current) "ON" else "OFF"}")
}

// v538: Save Auto Backup538
internal fun PlayerActivity.showV538SaveAutoBackup538Toggle() {
    val current = BiliClient.prefs.v538saveAutoBackup538
    BiliClient.prefs.v538saveAutoBackup538 = !current
    AppToast.show(this, "Save Auto Backup538: ${if (!current) "ON" else "OFF"}")
}

// v538: Scale Auto Fit538
internal fun PlayerActivity.showV538ScaleAutoFit538Toggle() {
    val current = BiliClient.prefs.v538scaleAutoFit538
    BiliClient.prefs.v538scaleAutoFit538 = !current
    AppToast.show(this, "Scale Auto Fit538: ${if (!current) "ON" else "OFF"}")
}

// v538: Scan Auto Start538
internal fun PlayerActivity.showV538ScanAutoStart538Toggle() {
    val current = BiliClient.prefs.v538scanAutoStart538
    BiliClient.prefs.v538scanAutoStart538 = !current
    AppToast.show(this, "Scan Auto Start538: ${if (!current) "ON" else "OFF"}")
}

// v538: Schedule Auto Run538
internal fun PlayerActivity.showV538ScheduleAutoRun538Toggle() {
    val current = BiliClient.prefs.v538scheduleAutoRun538
    BiliClient.prefs.v538scheduleAutoRun538 = !current
    AppToast.show(this, "Schedule Auto Run538: ${if (!current) "ON" else "OFF"}")
}

// v538: Score Auto Calculate538
internal fun PlayerActivity.showV538ScoreAutoCalculate538Toggle() {
    val current = BiliClient.prefs.v538scoreAutoCalculate538
    BiliClient.prefs.v538scoreAutoCalculate538 = !current
    AppToast.show(this, "Score Auto Calculate538: ${if (!current) "ON" else "OFF"}")
}

// v538: Scratch Auto Repair538
internal fun PlayerActivity.showV538ScratchAutoRepair538Toggle() {
    val current = BiliClient.prefs.v538scratchAutoRepair538
    BiliClient.prefs.v538scratchAutoRepair538 = !current
    AppToast.show(this, "Scratch Auto Repair538: ${if (!current) "ON" else "OFF"}")
}

// v538: Script Auto Execute538
internal fun PlayerActivity.showV538ScriptAutoExecute538Toggle() {
    val current = BiliClient.prefs.v538scriptAutoExecute538
    BiliClient.prefs.v538scriptAutoExecute538 = !current
    AppToast.show(this, "Script Auto Execute538: ${if (!current) "ON" else "OFF"}")
}

// v538: Scroll Auto Smooth538
internal fun PlayerActivity.showV538ScrollAutoSmooth538Toggle() {
    val current = BiliClient.prefs.v538scrollAutoSmooth538
    BiliClient.prefs.v538scrollAutoSmooth538 = !current
    AppToast.show(this, "Scroll Auto Smooth538: ${if (!current) "ON" else "OFF"}")
}

// v538: Seal Auto Encrypt538
internal fun PlayerActivity.showV538SealAutoEncrypt538Toggle() {
    val current = BiliClient.prefs.v538sealAutoEncrypt538
    BiliClient.prefs.v538sealAutoEncrypt538 = !current
    AppToast.show(this, "Seal Auto Encrypt538: ${if (!current) "ON" else "OFF"}")
}

// v538: Search Auto Complete538
internal fun PlayerActivity.showV538SearchAutoComplete538Toggle() {
    val current = BiliClient.prefs.v538searchAutoComplete538
    BiliClient.prefs.v538searchAutoComplete538 = !current
    AppToast.show(this, "Search Auto Complete538: ${if (!current) "ON" else "OFF"}")
}

// v538: Section Auto Group538
internal fun PlayerActivity.showV538SectionAutoGroup538Toggle() {
    val current = BiliClient.prefs.v538sectionAutoGroup538
    BiliClient.prefs.v538sectionAutoGroup538 = !current
    AppToast.show(this, "Section Auto Group538: ${if (!current) "ON" else "OFF"}")
}

// v538: Seek Auto Precision538
internal fun PlayerActivity.showV538SeekAutoPrecision538Toggle() {
    val current = BiliClient.prefs.v538seekAutoPrecision538
    BiliClient.prefs.v538seekAutoPrecision538 = !current
    AppToast.show(this, "Seek Auto Precision538: ${if (!current) "ON" else "OFF"}")
}

// v538: Select Auto Multi538
internal fun PlayerActivity.showV538SelectAutoMulti538Toggle() {
    val current = BiliClient.prefs.v538selectAutoMulti538
    BiliClient.prefs.v538selectAutoMulti538 = !current
    AppToast.show(this, "Select Auto Multi538: ${if (!current) "ON" else "OFF"}")
}

// v539: Run In Background539
internal fun PlayerActivity.showV539RunInBackground539Toggle() {
    val current = BiliClient.prefs.v539runInBackground539
    BiliClient.prefs.v539runInBackground539 = !current
    AppToast.show(this, "Run In Background539: ${if (!current) "ON" else "OFF"}")
}

// v539: Sample Auto Collect539
internal fun PlayerActivity.showV539SampleAutoCollect539Toggle() {
    val current = BiliClient.prefs.v539sampleAutoCollect539
    BiliClient.prefs.v539sampleAutoCollect539 = !current
    AppToast.show(this, "Sample Auto Collect539: ${if (!current) "ON" else "OFF"}")
}

// v539: Save Auto Backup539
internal fun PlayerActivity.showV539SaveAutoBackup539Toggle() {
    val current = BiliClient.prefs.v539saveAutoBackup539
    BiliClient.prefs.v539saveAutoBackup539 = !current
    AppToast.show(this, "Save Auto Backup539: ${if (!current) "ON" else "OFF"}")
}

// v539: Scale Auto Fit539
internal fun PlayerActivity.showV539ScaleAutoFit539Toggle() {
    val current = BiliClient.prefs.v539scaleAutoFit539
    BiliClient.prefs.v539scaleAutoFit539 = !current
    AppToast.show(this, "Scale Auto Fit539: ${if (!current) "ON" else "OFF"}")
}

// v539: Scan Auto Start539
internal fun PlayerActivity.showV539ScanAutoStart539Toggle() {
    val current = BiliClient.prefs.v539scanAutoStart539
    BiliClient.prefs.v539scanAutoStart539 = !current
    AppToast.show(this, "Scan Auto Start539: ${if (!current) "ON" else "OFF"}")
}

// v539: Schedule Auto Run539
internal fun PlayerActivity.showV539ScheduleAutoRun539Toggle() {
    val current = BiliClient.prefs.v539scheduleAutoRun539
    BiliClient.prefs.v539scheduleAutoRun539 = !current
    AppToast.show(this, "Schedule Auto Run539: ${if (!current) "ON" else "OFF"}")
}

// v539: Score Auto Calculate539
internal fun PlayerActivity.showV539ScoreAutoCalculate539Toggle() {
    val current = BiliClient.prefs.v539scoreAutoCalculate539
    BiliClient.prefs.v539scoreAutoCalculate539 = !current
    AppToast.show(this, "Score Auto Calculate539: ${if (!current) "ON" else "OFF"}")
}

// v539: Scratch Auto Repair539
internal fun PlayerActivity.showV539ScratchAutoRepair539Toggle() {
    val current = BiliClient.prefs.v539scratchAutoRepair539
    BiliClient.prefs.v539scratchAutoRepair539 = !current
    AppToast.show(this, "Scratch Auto Repair539: ${if (!current) "ON" else "OFF"}")
}

// v539: Script Auto Execute539
internal fun PlayerActivity.showV539ScriptAutoExecute539Toggle() {
    val current = BiliClient.prefs.v539scriptAutoExecute539
    BiliClient.prefs.v539scriptAutoExecute539 = !current
    AppToast.show(this, "Script Auto Execute539: ${if (!current) "ON" else "OFF"}")
}

// v539: Scroll Auto Smooth539
internal fun PlayerActivity.showV539ScrollAutoSmooth539Toggle() {
    val current = BiliClient.prefs.v539scrollAutoSmooth539
    BiliClient.prefs.v539scrollAutoSmooth539 = !current
    AppToast.show(this, "Scroll Auto Smooth539: ${if (!current) "ON" else "OFF"}")
}

// v539: Seal Auto Encrypt539
internal fun PlayerActivity.showV539SealAutoEncrypt539Toggle() {
    val current = BiliClient.prefs.v539sealAutoEncrypt539
    BiliClient.prefs.v539sealAutoEncrypt539 = !current
    AppToast.show(this, "Seal Auto Encrypt539: ${if (!current) "ON" else "OFF"}")
}

// v539: Search Auto Complete539
internal fun PlayerActivity.showV539SearchAutoComplete539Toggle() {
    val current = BiliClient.prefs.v539searchAutoComplete539
    BiliClient.prefs.v539searchAutoComplete539 = !current
    AppToast.show(this, "Search Auto Complete539: ${if (!current) "ON" else "OFF"}")
}

// v539: Section Auto Group539
internal fun PlayerActivity.showV539SectionAutoGroup539Toggle() {
    val current = BiliClient.prefs.v539sectionAutoGroup539
    BiliClient.prefs.v539sectionAutoGroup539 = !current
    AppToast.show(this, "Section Auto Group539: ${if (!current) "ON" else "OFF"}")
}

// v539: Seek Auto Precision539
internal fun PlayerActivity.showV539SeekAutoPrecision539Toggle() {
    val current = BiliClient.prefs.v539seekAutoPrecision539
    BiliClient.prefs.v539seekAutoPrecision539 = !current
    AppToast.show(this, "Seek Auto Precision539: ${if (!current) "ON" else "OFF"}")
}

// v539: Select Auto Multi539
internal fun PlayerActivity.showV539SelectAutoMulti539Toggle() {
    val current = BiliClient.prefs.v539selectAutoMulti539
    BiliClient.prefs.v539selectAutoMulti539 = !current
    AppToast.show(this, "Select Auto Multi539: ${if (!current) "ON" else "OFF"}")
}

// v540: Run In Background540
internal fun PlayerActivity.showV540RunInBackground540Toggle() {
    val current = BiliClient.prefs.v540runInBackground540
    BiliClient.prefs.v540runInBackground540 = !current
    AppToast.show(this, "Run In Background540: ${if (!current) "ON" else "OFF"}")
}

// v540: Sample Auto Collect540
internal fun PlayerActivity.showV540SampleAutoCollect540Toggle() {
    val current = BiliClient.prefs.v540sampleAutoCollect540
    BiliClient.prefs.v540sampleAutoCollect540 = !current
    AppToast.show(this, "Sample Auto Collect540: ${if (!current) "ON" else "OFF"}")
}

// v540: Save Auto Backup540
internal fun PlayerActivity.showV540SaveAutoBackup540Toggle() {
    val current = BiliClient.prefs.v540saveAutoBackup540
    BiliClient.prefs.v540saveAutoBackup540 = !current
    AppToast.show(this, "Save Auto Backup540: ${if (!current) "ON" else "OFF"}")
}

// v540: Scale Auto Fit540
internal fun PlayerActivity.showV540ScaleAutoFit540Toggle() {
    val current = BiliClient.prefs.v540scaleAutoFit540
    BiliClient.prefs.v540scaleAutoFit540 = !current
    AppToast.show(this, "Scale Auto Fit540: ${if (!current) "ON" else "OFF"}")
}

// v540: Scan Auto Start540
internal fun PlayerActivity.showV540ScanAutoStart540Toggle() {
    val current = BiliClient.prefs.v540scanAutoStart540
    BiliClient.prefs.v540scanAutoStart540 = !current
    AppToast.show(this, "Scan Auto Start540: ${if (!current) "ON" else "OFF"}")
}

// v540: Schedule Auto Run540
internal fun PlayerActivity.showV540ScheduleAutoRun540Toggle() {
    val current = BiliClient.prefs.v540scheduleAutoRun540
    BiliClient.prefs.v540scheduleAutoRun540 = !current
    AppToast.show(this, "Schedule Auto Run540: ${if (!current) "ON" else "OFF"}")
}

// v540: Score Auto Calculate540
internal fun PlayerActivity.showV540ScoreAutoCalculate540Toggle() {
    val current = BiliClient.prefs.v540scoreAutoCalculate540
    BiliClient.prefs.v540scoreAutoCalculate540 = !current
    AppToast.show(this, "Score Auto Calculate540: ${if (!current) "ON" else "OFF"}")
}

// v540: Scratch Auto Repair540
internal fun PlayerActivity.showV540ScratchAutoRepair540Toggle() {
    val current = BiliClient.prefs.v540scratchAutoRepair540
    BiliClient.prefs.v540scratchAutoRepair540 = !current
    AppToast.show(this, "Scratch Auto Repair540: ${if (!current) "ON" else "OFF"}")
}

// v540: Script Auto Execute540
internal fun PlayerActivity.showV540ScriptAutoExecute540Toggle() {
    val current = BiliClient.prefs.v540scriptAutoExecute540
    BiliClient.prefs.v540scriptAutoExecute540 = !current
    AppToast.show(this, "Script Auto Execute540: ${if (!current) "ON" else "OFF"}")
}

// v540: Scroll Auto Smooth540
internal fun PlayerActivity.showV540ScrollAutoSmooth540Toggle() {
    val current = BiliClient.prefs.v540scrollAutoSmooth540
    BiliClient.prefs.v540scrollAutoSmooth540 = !current
    AppToast.show(this, "Scroll Auto Smooth540: ${if (!current) "ON" else "OFF"}")
}

// v540: Seal Auto Encrypt540
internal fun PlayerActivity.showV540SealAutoEncrypt540Toggle() {
    val current = BiliClient.prefs.v540sealAutoEncrypt540
    BiliClient.prefs.v540sealAutoEncrypt540 = !current
    AppToast.show(this, "Seal Auto Encrypt540: ${if (!current) "ON" else "OFF"}")
}

// v540: Search Auto Complete540
internal fun PlayerActivity.showV540SearchAutoComplete540Toggle() {
    val current = BiliClient.prefs.v540searchAutoComplete540
    BiliClient.prefs.v540searchAutoComplete540 = !current
    AppToast.show(this, "Search Auto Complete540: ${if (!current) "ON" else "OFF"}")
}

// v540: Section Auto Group540
internal fun PlayerActivity.showV540SectionAutoGroup540Toggle() {
    val current = BiliClient.prefs.v540sectionAutoGroup540
    BiliClient.prefs.v540sectionAutoGroup540 = !current
    AppToast.show(this, "Section Auto Group540: ${if (!current) "ON" else "OFF"}")
}

// v540: Seek Auto Precision540
internal fun PlayerActivity.showV540SeekAutoPrecision540Toggle() {
    val current = BiliClient.prefs.v540seekAutoPrecision540
    BiliClient.prefs.v540seekAutoPrecision540 = !current
    AppToast.show(this, "Seek Auto Precision540: ${if (!current) "ON" else "OFF"}")
}

// v540: Select Auto Multi540
internal fun PlayerActivity.showV540SelectAutoMulti540Toggle() {
    val current = BiliClient.prefs.v540selectAutoMulti540
    BiliClient.prefs.v540selectAutoMulti540 = !current
    AppToast.show(this, "Select Auto Multi540: ${if (!current) "ON" else "OFF"}")
}

// v541: Send Auto Confirm541
internal fun PlayerActivity.showV541SendAutoConfirm541Toggle() {
    val current = BiliClient.prefs.v541sendAutoConfirm541
    BiliClient.prefs.v541sendAutoConfirm541 = !current
    AppToast.show(this, "Send Auto Confirm541: ${if (!current) "ON" else "OFF"}")
}

// v541: Sensor Auto Calibrate541
internal fun PlayerActivity.showV541SensorAutoCalibrate541Toggle() {
    val current = BiliClient.prefs.v541sensorAutoCalibrate541
    BiliClient.prefs.v541sensorAutoCalibrate541 = !current
    AppToast.show(this, "Sensor Auto Calibrate541: ${if (!current) "ON" else "OFF"}")
}

// v541: Server Auto Switch541
internal fun PlayerActivity.showV541ServerAutoSwitch541Toggle() {
    val current = BiliClient.prefs.v541serverAutoSwitch541
    BiliClient.prefs.v541serverAutoSwitch541 = !current
    AppToast.show(this, "Server Auto Switch541: ${if (!current) "ON" else "OFF"}")
}

// v541: Session Auto Save541
internal fun PlayerActivity.showV541SessionAutoSave541Toggle() {
    val current = BiliClient.prefs.v541sessionAutoSave541
    BiliClient.prefs.v541sessionAutoSave541 = !current
    AppToast.show(this, "Session Auto Save541: ${if (!current) "ON" else "OFF"}")
}

// v541: Set Auto Default541
internal fun PlayerActivity.showV541SetAutoDefault541Toggle() {
    val current = BiliClient.prefs.v541setAutoDefault541
    BiliClient.prefs.v541setAutoDefault541 = !current
    AppToast.show(this, "Set Auto Default541: ${if (!current) "ON" else "OFF"}")
}

// v541: Shadow Auto Drop541
internal fun PlayerActivity.showV541ShadowAutoDrop541Toggle() {
    val current = BiliClient.prefs.v541shadowAutoDrop541
    BiliClient.prefs.v541shadowAutoDrop541 = !current
    AppToast.show(this, "Shadow Auto Drop541: ${if (!current) "ON" else "OFF"}")
}

// v541: Shape Auto Detect541
internal fun PlayerActivity.showV541ShapeAutoDetect541Toggle() {
    val current = BiliClient.prefs.v541shapeAutoDetect541
    BiliClient.prefs.v541shapeAutoDetect541 = !current
    AppToast.show(this, "Shape Auto Detect541: ${if (!current) "ON" else "OFF"}")
}

// v541: Sharp Auto Adjust541
internal fun PlayerActivity.showV541SharpAutoAdjust541Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v541sharpAutoAdjust541).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust541",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v541sharpAutoAdjust541 = value
        AppToast.show(this, "Sharp Auto Adjust541: $value")
    }
}

// v541: Shell Auto Execute541
internal fun PlayerActivity.showV541ShellAutoExecute541Toggle() {
    val current = BiliClient.prefs.v541shellAutoExecute541
    BiliClient.prefs.v541shellAutoExecute541 = !current
    AppToast.show(this, "Shell Auto Execute541: ${if (!current) "ON" else "OFF"}")
}

// v541: Shift Auto Offset541
internal fun PlayerActivity.showV541ShiftAutoOffset541Toggle() {
    val current = BiliClient.prefs.v541shiftAutoOffset541
    BiliClient.prefs.v541shiftAutoOffset541 = !current
    AppToast.show(this, "Shift Auto Offset541: ${if (!current) "ON" else "OFF"}")
}

// v541: Short Cut Auto Bind541
internal fun PlayerActivity.showV541ShortCutAutoBind541Toggle() {
    val current = BiliClient.prefs.v541shortCutAutoBind541
    BiliClient.prefs.v541shortCutAutoBind541 = !current
    AppToast.show(this, "Short Cut Auto Bind541: ${if (!current) "ON" else "OFF"}")
}

// v541: Show Auto Toggle541
internal fun PlayerActivity.showV541ShowAutoToggle541Toggle() {
    val current = BiliClient.prefs.v541showAutoToggle541
    BiliClient.prefs.v541showAutoToggle541 = !current
    AppToast.show(this, "Show Auto Toggle541: ${if (!current) "ON" else "OFF"}")
}

// v541: Shuffle Auto Seed541
internal fun PlayerActivity.showV541ShuffleAutoSeed541Toggle() {
    val current = BiliClient.prefs.v541shuffleAutoSeed541
    BiliClient.prefs.v541shuffleAutoSeed541 = !current
    AppToast.show(this, "Shuffle Auto Seed541: ${if (!current) "ON" else "OFF"}")
}

// v541: Signal Auto Boost541
internal fun PlayerActivity.showV541SignalAutoBoost541Toggle() {
    val current = BiliClient.prefs.v541signalAutoBoost541
    BiliClient.prefs.v541signalAutoBoost541 = !current
    AppToast.show(this, "Signal Auto Boost541: ${if (!current) "ON" else "OFF"}")
}

// v541: Single Instance Mode541
internal fun PlayerActivity.showV541SingleInstanceMode541Toggle() {
    val current = BiliClient.prefs.v541singleInstanceMode541
    BiliClient.prefs.v541singleInstanceMode541 = !current
    AppToast.show(this, "Single Instance Mode541: ${if (!current) "ON" else "OFF"}")
}

// v542: Send Auto Confirm542
internal fun PlayerActivity.showV542SendAutoConfirm542Toggle() {
    val current = BiliClient.prefs.v542sendAutoConfirm542
    BiliClient.prefs.v542sendAutoConfirm542 = !current
    AppToast.show(this, "Send Auto Confirm542: ${if (!current) "ON" else "OFF"}")
}

// v542: Sensor Auto Calibrate542
internal fun PlayerActivity.showV542SensorAutoCalibrate542Toggle() {
    val current = BiliClient.prefs.v542sensorAutoCalibrate542
    BiliClient.prefs.v542sensorAutoCalibrate542 = !current
    AppToast.show(this, "Sensor Auto Calibrate542: ${if (!current) "ON" else "OFF"}")
}

// v542: Server Auto Switch542
internal fun PlayerActivity.showV542ServerAutoSwitch542Toggle() {
    val current = BiliClient.prefs.v542serverAutoSwitch542
    BiliClient.prefs.v542serverAutoSwitch542 = !current
    AppToast.show(this, "Server Auto Switch542: ${if (!current) "ON" else "OFF"}")
}

// v542: Session Auto Save542
internal fun PlayerActivity.showV542SessionAutoSave542Toggle() {
    val current = BiliClient.prefs.v542sessionAutoSave542
    BiliClient.prefs.v542sessionAutoSave542 = !current
    AppToast.show(this, "Session Auto Save542: ${if (!current) "ON" else "OFF"}")
}

// v542: Set Auto Default542
internal fun PlayerActivity.showV542SetAutoDefault542Toggle() {
    val current = BiliClient.prefs.v542setAutoDefault542
    BiliClient.prefs.v542setAutoDefault542 = !current
    AppToast.show(this, "Set Auto Default542: ${if (!current) "ON" else "OFF"}")
}

// v542: Shadow Auto Drop542
internal fun PlayerActivity.showV542ShadowAutoDrop542Toggle() {
    val current = BiliClient.prefs.v542shadowAutoDrop542
    BiliClient.prefs.v542shadowAutoDrop542 = !current
    AppToast.show(this, "Shadow Auto Drop542: ${if (!current) "ON" else "OFF"}")
}

// v542: Shape Auto Detect542
internal fun PlayerActivity.showV542ShapeAutoDetect542Toggle() {
    val current = BiliClient.prefs.v542shapeAutoDetect542
    BiliClient.prefs.v542shapeAutoDetect542 = !current
    AppToast.show(this, "Shape Auto Detect542: ${if (!current) "ON" else "OFF"}")
}

// v542: Sharp Auto Adjust542
internal fun PlayerActivity.showV542SharpAutoAdjust542Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v542sharpAutoAdjust542).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust542",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v542sharpAutoAdjust542 = value
        AppToast.show(this, "Sharp Auto Adjust542: $value")
    }
}

// v542: Shell Auto Execute542
internal fun PlayerActivity.showV542ShellAutoExecute542Toggle() {
    val current = BiliClient.prefs.v542shellAutoExecute542
    BiliClient.prefs.v542shellAutoExecute542 = !current
    AppToast.show(this, "Shell Auto Execute542: ${if (!current) "ON" else "OFF"}")
}

// v542: Shift Auto Offset542
internal fun PlayerActivity.showV542ShiftAutoOffset542Toggle() {
    val current = BiliClient.prefs.v542shiftAutoOffset542
    BiliClient.prefs.v542shiftAutoOffset542 = !current
    AppToast.show(this, "Shift Auto Offset542: ${if (!current) "ON" else "OFF"}")
}

// v542: Short Cut Auto Bind542
internal fun PlayerActivity.showV542ShortCutAutoBind542Toggle() {
    val current = BiliClient.prefs.v542shortCutAutoBind542
    BiliClient.prefs.v542shortCutAutoBind542 = !current
    AppToast.show(this, "Short Cut Auto Bind542: ${if (!current) "ON" else "OFF"}")
}

// v542: Show Auto Toggle542
internal fun PlayerActivity.showV542ShowAutoToggle542Toggle() {
    val current = BiliClient.prefs.v542showAutoToggle542
    BiliClient.prefs.v542showAutoToggle542 = !current
    AppToast.show(this, "Show Auto Toggle542: ${if (!current) "ON" else "OFF"}")
}

// v542: Shuffle Auto Seed542
internal fun PlayerActivity.showV542ShuffleAutoSeed542Toggle() {
    val current = BiliClient.prefs.v542shuffleAutoSeed542
    BiliClient.prefs.v542shuffleAutoSeed542 = !current
    AppToast.show(this, "Shuffle Auto Seed542: ${if (!current) "ON" else "OFF"}")
}

// v542: Signal Auto Boost542
internal fun PlayerActivity.showV542SignalAutoBoost542Toggle() {
    val current = BiliClient.prefs.v542signalAutoBoost542
    BiliClient.prefs.v542signalAutoBoost542 = !current
    AppToast.show(this, "Signal Auto Boost542: ${if (!current) "ON" else "OFF"}")
}

// v542: Single Instance Mode542
internal fun PlayerActivity.showV542SingleInstanceMode542Toggle() {
    val current = BiliClient.prefs.v542singleInstanceMode542
    BiliClient.prefs.v542singleInstanceMode542 = !current
    AppToast.show(this, "Single Instance Mode542: ${if (!current) "ON" else "OFF"}")
}

// v543: Send Auto Confirm543
internal fun PlayerActivity.showV543SendAutoConfirm543Toggle() {
    val current = BiliClient.prefs.v543sendAutoConfirm543
    BiliClient.prefs.v543sendAutoConfirm543 = !current
    AppToast.show(this, "Send Auto Confirm543: ${if (!current) "ON" else "OFF"}")
}

// v543: Sensor Auto Calibrate543
internal fun PlayerActivity.showV543SensorAutoCalibrate543Toggle() {
    val current = BiliClient.prefs.v543sensorAutoCalibrate543
    BiliClient.prefs.v543sensorAutoCalibrate543 = !current
    AppToast.show(this, "Sensor Auto Calibrate543: ${if (!current) "ON" else "OFF"}")
}

// v543: Server Auto Switch543
internal fun PlayerActivity.showV543ServerAutoSwitch543Toggle() {
    val current = BiliClient.prefs.v543serverAutoSwitch543
    BiliClient.prefs.v543serverAutoSwitch543 = !current
    AppToast.show(this, "Server Auto Switch543: ${if (!current) "ON" else "OFF"}")
}

// v63.4: Gesture Long Press Vibration
internal fun PlayerActivity.showV63GestureLongPressVibrationToggle() {
    val enabled = !BiliClient.prefs.v63GestureLongPressVibration
    BiliClient.prefs.v63GestureLongPressVibration = enabled
    AppToast.show(this, "Gesture Long Press Vibration: ${if (enabled) "ON" else "OFF"}")
}

// v63.5: Video Adaptive Saturation Curve
internal fun PlayerActivity.showV63VideoAdaptiveSaturationCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63VideoAdaptiveSaturationCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Saturation Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63VideoAdaptiveSaturationCurve = value
        AppToast.show(this, "Video Adaptive Saturation Curve: $value")
    }
}

// v63.6: Danmaku Send Queue Size
internal fun PlayerActivity.showV63DanmakuSendQueueSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuSendQueueSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Queue Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63DanmakuSendQueueSize = value
        AppToast.show(this, "Danmaku Send Queue Size: $value")
    }
}

// v63.7: Cast Video Render Mode
internal fun PlayerActivity.showV63CastVideoRenderModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63CastVideoRenderMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Render Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63CastVideoRenderMode = value
        AppToast.show(this, "Cast Video Render Mode: $value")
    }
}

// v63.8: Subtitle BG Border Width
internal fun PlayerActivity.showV63SubtitleBgBorderWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v63SubtitleBgBorderWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63SubtitleBgBorderWidth = value
        AppToast.show(this, "Subtitle BG Border Width: $value")
    }
}

// v63.9: Video Adaptive Gamma Curve
internal fun PlayerActivity.showV63VideoAdaptiveGammaCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63VideoAdaptiveGammaCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Gamma Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63VideoAdaptiveGammaCurve = value
        AppToast.show(this, "Video Adaptive Gamma Curve: $value")
    }
}

// v63.10: Danmaku Filter By Type
internal fun PlayerActivity.showV63DanmakuFilterByTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuFilterByType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63DanmakuFilterByType = value
        AppToast.show(this, "Danmaku Filter By Type: $value")
    }
}

// v63.11: Playlist Auto Merge
internal fun PlayerActivity.showV63PlaylistAutoMergeToggle() {
    val enabled = !BiliClient.prefs.v63PlaylistAutoMerge
    BiliClient.prefs.v63PlaylistAutoMerge = enabled
    AppToast.show(this, "Playlist Auto Merge: ${if (enabled) "ON" else "OFF"}")
}

// v63.12: Gesture Swipe Deceleration Custom
internal fun PlayerActivity.showV63GestureSwipeDecelerationCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v63GestureSwipeDecelerationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Deceleration Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63GestureSwipeDecelerationCustom = value
        AppToast.show(this, "Gesture Swipe Deceleration Custom: $value")
    }
}

// v63.13: Video Color Invert
internal fun PlayerActivity.showV63VideoColorInvertToggle() {
    val enabled = !BiliClient.prefs.v63VideoColorInvert
    BiliClient.prefs.v63VideoColorInvert = enabled
    AppToast.show(this, "Video Color Invert: ${if (enabled) "ON" else "OFF"}")
}

// v63.14: Danmaku History Sort Order
internal fun PlayerActivity.showV63DanmakuHistorySortOrderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63DanmakuHistorySortOrder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku History Sort Order",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63DanmakuHistorySortOrder = value
        AppToast.show(this, "Danmaku History Sort Order: $value")
    }
}

// v63.15: Cast Audio Render Mode
internal fun PlayerActivity.showV63CastAudioRenderModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v63CastAudioRenderMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Render Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v63CastAudioRenderMode = value
        AppToast.show(this, "Cast Audio Render Mode: $value")
    }
}

// v64.1: Video Adaptive Edge Preserve
internal fun PlayerActivity.showV64VideoAdaptiveEdgePreserveToggle() {
    val enabled = !BiliClient.prefs.v64VideoAdaptiveEdgePreserve
    BiliClient.prefs.v64VideoAdaptiveEdgePreserve = enabled
    AppToast.show(this, "Video Adaptive Edge Preserve: ${if (enabled) "ON" else "OFF"}")
}

// v64.2: Danmaku Fixed Position
internal fun PlayerActivity.showV64DanmakuFixedPositionDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuFixedPosition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Fixed Position",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64DanmakuFixedPosition = value
        AppToast.show(this, "Danmaku Fixed Position: $value")
    }
}

// v64.3: Subtitle Animation Fade Out
internal fun PlayerActivity.showV64SubtitleAnimationFadeOutToggle() {
    val enabled = !BiliClient.prefs.v64SubtitleAnimationFadeOut
    BiliClient.prefs.v64SubtitleAnimationFadeOut = enabled
    AppToast.show(this, "Subtitle Animation Fade Out: ${if (enabled) "ON" else "OFF"}")
}

// v64.4: Gesture Multi Finger Gesture
internal fun PlayerActivity.showV64GestureMultiFingerGestureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v64GestureMultiFingerGesture).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Multi Finger Gesture",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64GestureMultiFingerGesture = value
        AppToast.show(this, "Gesture Multi Finger Gesture: $value")
    }
}

// v64.5: Video Color Grayscale
internal fun PlayerActivity.showV64VideoColorGrayscaleToggle() {
    val enabled = !BiliClient.prefs.v64VideoColorGrayscale
    BiliClient.prefs.v64VideoColorGrayscale = enabled
    AppToast.show(this, "Video Color Grayscale: ${if (enabled) "ON" else "OFF"}")
}

// v64.6: Danmaku Send Delay
internal fun PlayerActivity.showV64DanmakuSendDelayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuSendDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64DanmakuSendDelay = value
        AppToast.show(this, "Danmaku Send Delay: $value")
    }
}

// v64.7: Cast Video Post Process
internal fun PlayerActivity.showV64CastVideoPostProcessToggle() {
    val enabled = !BiliClient.prefs.v64CastVideoPostProcess
    BiliClient.prefs.v64CastVideoPostProcess = enabled
    AppToast.show(this, "Cast Video Post Process: ${if (enabled) "ON" else "OFF"}")
}

// v64.8: Subtitle BG Border Color
internal fun PlayerActivity.showV64SubtitleBgBorderColorDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v64SubtitleBgBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64SubtitleBgBorderColor = value
        AppToast.show(this, "Subtitle BG Border Color: $value")
    }
}

// v64.9: Video Adaptive Detail Curve
internal fun PlayerActivity.showV64VideoAdaptiveDetailCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v64VideoAdaptiveDetailCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Detail Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64VideoAdaptiveDetailCurve = value
        AppToast.show(this, "Video Adaptive Detail Curve: $value")
    }
}

// v64.10: Danmaku Filter By User Level
internal fun PlayerActivity.showV64DanmakuFilterByUserLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuFilterByUserLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By User Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64DanmakuFilterByUserLevel = value
        AppToast.show(this, "Danmaku Filter By User Level: $value")
    }
}

// v64.11: Playlist Auto Split
internal fun PlayerActivity.showV64PlaylistAutoSplitToggle() {
    val enabled = !BiliClient.prefs.v64PlaylistAutoSplit
    BiliClient.prefs.v64PlaylistAutoSplit = enabled
    AppToast.show(this, "Playlist Auto Split: ${if (enabled) "ON" else "OFF"}")
}

// v64.12: Gesture Swipe Friction
internal fun PlayerActivity.showV64GestureSwipeFrictionDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v64GestureSwipeFriction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Friction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64GestureSwipeFriction = value
        AppToast.show(this, "Gesture Swipe Friction: $value")
    }
}

// v64.13: Video Color Sepia Strength
internal fun PlayerActivity.showV64VideoColorSepiaStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v64VideoColorSepiaStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Sepia Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64VideoColorSepiaStrength = value
        AppToast.show(this, "Video Color Sepia Strength: $value")
    }
}

// v64.14: Danmaku History Max Items
internal fun PlayerActivity.showV64DanmakuHistoryMaxItemsDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v64DanmakuHistoryMaxItems).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku History Max Items",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v64DanmakuHistoryMaxItems = value
        AppToast.show(this, "Danmaku History Max Items: $value")
    }
}

// v64.15: Cast Audio Post Process
internal fun PlayerActivity.showV64CastAudioPostProcessToggle() {
    val enabled = !BiliClient.prefs.v64CastAudioPostProcess
    BiliClient.prefs.v64CastAudioPostProcess = enabled
    AppToast.show(this, "Cast Audio Post Process: ${if (enabled) "ON" else "OFF"}")
}

// v65.1: Video Adaptive Motion Blur
internal fun PlayerActivity.showV65VideoAdaptiveMotionBlurToggle() {
    val enabled = !BiliClient.prefs.v65VideoAdaptiveMotionBlur
    BiliClient.prefs.v65VideoAdaptiveMotionBlur = enabled
    AppToast.show(this, "Video Adaptive Motion Blur: ${if (enabled) "ON" else "OFF"}")
}

// v65.2: Danmaku Scroll Direction
internal fun PlayerActivity.showV65DanmakuScrollDirectionDialog() {
    val options = listOf(0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v65DanmakuScrollDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Direction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65DanmakuScrollDirection = value
        AppToast.show(this, "Danmaku Scroll Direction: $value")
    }
}

// v65.3: Subtitle Animation Slide
internal fun PlayerActivity.showV65SubtitleAnimationSlideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v65SubtitleAnimationSlide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Slide",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65SubtitleAnimationSlide = value
        AppToast.show(this, "Subtitle Animation Slide: $value")
    }
}

// v65.4: Gesture Custom Gesture 1
internal fun PlayerActivity.showV65GestureCustomGesture1Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v65GestureCustomGesture1).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Gesture 1",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65GestureCustomGesture1 = value
        AppToast.show(this, "Gesture Custom Gesture 1: $value")
    }
}

// v65.5: Video Color Posterize Level
internal fun PlayerActivity.showV65VideoColorPosterizeLevelDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v65VideoColorPosterizeLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Posterize Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65VideoColorPosterizeLevel = value
        AppToast.show(this, "Video Color Posterize Level: $value")
    }
}

// v65.6: Danmaku Send Priority Level
internal fun PlayerActivity.showV65DanmakuSendPriorityLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v65DanmakuSendPriorityLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Priority Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65DanmakuSendPriorityLevel = value
        AppToast.show(this, "Danmaku Send Priority Level: $value")
    }
}

// v65.7: Cast Video HDR
internal fun PlayerActivity.showV65CastVideoHDRToggle() {
    val enabled = !BiliClient.prefs.v65CastVideoHDR
    BiliClient.prefs.v65CastVideoHDR = enabled
    AppToast.show(this, "Cast Video HDR: ${if (enabled) "ON" else "OFF"}")
}

// v65.8: Subtitle BG Blur Strength
internal fun PlayerActivity.showV65SubtitleBgBlurStrengthDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v65SubtitleBgBlurStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Blur Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65SubtitleBgBlurStrength = value
        AppToast.show(this, "Subtitle BG Blur Strength: $value")
    }
}

// v65.9: Video Adaptive Luma Curve
internal fun PlayerActivity.showV65VideoAdaptiveLumaCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v65VideoAdaptiveLumaCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Luma Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65VideoAdaptiveLumaCurve = value
        AppToast.show(this, "Video Adaptive Luma Curve: $value")
    }
}

// v65.10: Danmaku Filter By Badge
internal fun PlayerActivity.showV65DanmakuFilterByBadgeToggle() {
    val enabled = !BiliClient.prefs.v65DanmakuFilterByBadge
    BiliClient.prefs.v65DanmakuFilterByBadge = enabled
    AppToast.show(this, "Danmaku Filter By Badge: ${if (enabled) "ON" else "OFF"}")
}

// v65.11: Playlist Auto Deduplicate
internal fun PlayerActivity.showV65PlaylistAutoDeduplicateToggle() {
    val enabled = !BiliClient.prefs.v65PlaylistAutoDeduplicate
    BiliClient.prefs.v65PlaylistAutoDeduplicate = enabled
    AppToast.show(this, "Playlist Auto Deduplicate: ${if (enabled) "ON" else "OFF"}")
}

// v65.12: Gesture Swipe Sensitivity Custom
internal fun PlayerActivity.showV65GestureSwipeSensitivityCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v65GestureSwipeSensitivityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Sensitivity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65GestureSwipeSensitivityCustom = value
        AppToast.show(this, "Gesture Swipe Sensitivity Custom: $value")
    }
}

// v65.13: Video Color Solarize Strength
internal fun PlayerActivity.showV65VideoColorSolarizeStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v65VideoColorSolarizeStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Solarize Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v65VideoColorSolarizeStrength = value
        AppToast.show(this, "Video Color Solarize Strength: $value")
    }
}

// v65.14: Danmaku History Auto Export
internal fun PlayerActivity.showV65DanmakuHistoryAutoExportToggle() {
    val enabled = !BiliClient.prefs.v65DanmakuHistoryAutoExport
    BiliClient.prefs.v65DanmakuHistoryAutoExport = enabled
    AppToast.show(this, "Danmaku History Auto Export: ${if (enabled) "ON" else "OFF"}")
}

// v65.15: Cast Audio HDR
internal fun PlayerActivity.showV65CastAudioHDRToggle() {
    val enabled = !BiliClient.prefs.v65CastAudioHDR
    BiliClient.prefs.v65CastAudioHDR = enabled
    AppToast.show(this, "Cast Audio HDR: ${if (enabled) "ON" else "OFF"}")
}

// v66.1: Video Adaptive Frame Blend
internal fun PlayerActivity.showV66VideoAdaptiveFrameBlendToggle() {
    val enabled = !BiliClient.prefs.v66VideoAdaptiveFrameBlend
    BiliClient.prefs.v66VideoAdaptiveFrameBlend = enabled
    AppToast.show(this, "Video Adaptive Frame Blend: ${if (enabled) "ON" else "OFF"}")
}

// v66.2: Danmaku Top Margin
internal fun PlayerActivity.showV66DanmakuTopMarginDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v66DanmakuTopMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66DanmakuTopMargin = value
        AppToast.show(this, "Danmaku Top Margin: $value")
    }
}

// v66.3: Subtitle Animation Bounce
internal fun PlayerActivity.showV66SubtitleAnimationBounceToggle() {
    val enabled = !BiliClient.prefs.v66SubtitleAnimationBounce
    BiliClient.prefs.v66SubtitleAnimationBounce = enabled
    AppToast.show(this, "Subtitle Animation Bounce: ${if (enabled) "ON" else "OFF"}")
}

// v66.4: Gesture Custom Gesture 2
internal fun PlayerActivity.showV66GestureCustomGesture2Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v66GestureCustomGesture2).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Gesture 2",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66GestureCustomGesture2 = value
        AppToast.show(this, "Gesture Custom Gesture 2: $value")
    }
}

// v66.5: Video Color Vignette
internal fun PlayerActivity.showV66VideoColorVignetteDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v66VideoColorVignette).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Vignette",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66VideoColorVignette = value
        AppToast.show(this, "Video Color Vignette: $value")
    }
}

// v66.6: Danmaku Send Max Length Per Second
internal fun PlayerActivity.showV66DanmakuSendMaxLengthPerSecondDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v66DanmakuSendMaxLengthPerSecond).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Per Second",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66DanmakuSendMaxLengthPerSecond = value
        AppToast.show(this, "Danmaku Send Max Length Per Second: $value")
    }
}

// v66.7: Cast Video Dolby Vision
internal fun PlayerActivity.showV66CastVideoDolbyVisionToggle() {
    val enabled = !BiliClient.prefs.v66CastVideoDolbyVision
    BiliClient.prefs.v66CastVideoDolbyVision = enabled
    AppToast.show(this, "Cast Video Dolby Vision: ${if (enabled) "ON" else "OFF"}")
}

// v66.8: Subtitle BG Border Radius
internal fun PlayerActivity.showV66SubtitleBgBorderRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v66SubtitleBgBorderRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66SubtitleBgBorderRadius = value
        AppToast.show(this, "Subtitle BG Border Radius: $value")
    }
}

// v66.9: Video Adaptive Color Curve
internal fun PlayerActivity.showV66VideoAdaptiveColorCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v66VideoAdaptiveColorCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Color Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66VideoAdaptiveColorCurve = value
        AppToast.show(this, "Video Adaptive Color Curve: $value")
    }
}

// v66.10: Danmaku Filter By Medal
internal fun PlayerActivity.showV66DanmakuFilterByMedalToggle() {
    val enabled = !BiliClient.prefs.v66DanmakuFilterByMedal
    BiliClient.prefs.v66DanmakuFilterByMedal = enabled
    AppToast.show(this, "Danmaku Filter By Medal: ${if (enabled) "ON" else "OFF"}")
}

// v66.11: Playlist Auto Shuffle On Start
internal fun PlayerActivity.showV66PlaylistAutoShuffleOnStartToggle() {
    val enabled = !BiliClient.prefs.v66PlaylistAutoShuffleOnStart
    BiliClient.prefs.v66PlaylistAutoShuffleOnStart = enabled
    AppToast.show(this, "Playlist Auto Shuffle On Start: ${if (enabled) "ON" else "OFF"}")
}

// v66.12: Gesture Swipe Momentum
internal fun PlayerActivity.showV66GestureSwipeMomentumDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v66GestureSwipeMomentum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Momentum",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66GestureSwipeMomentum = value
        AppToast.show(this, "Gesture Swipe Momentum: $value")
    }
}

// v66.13: Video Color Duotone
internal fun PlayerActivity.showV66VideoColorDuotoneDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v66VideoColorDuotone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Duotone",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66VideoColorDuotone = value
        AppToast.show(this, "Video Color Duotone: $value")
    }
}

// v66.14: Danmaku History Search Mode
internal fun PlayerActivity.showV66DanmakuHistorySearchModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v66DanmakuHistorySearchMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku History Search Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v66DanmakuHistorySearchMode = value
        AppToast.show(this, "Danmaku History Search Mode: $value")
    }
}

// v66.15: Cast Audio Dolby Atmos
internal fun PlayerActivity.showV66CastAudioDolbyAtmosToggle() {
    val enabled = !BiliClient.prefs.v66CastAudioDolbyAtmos
    BiliClient.prefs.v66CastAudioDolbyAtmos = enabled
    AppToast.show(this, "Cast Audio Dolby Atmos: ${if (enabled) "ON" else "OFF"}")
}

// v67.1: Video Adaptive Temporal Blend
internal fun PlayerActivity.showV67VideoAdaptiveTemporalBlendToggle() {
    val enabled = !BiliClient.prefs.v67VideoAdaptiveTemporalBlend
    BiliClient.prefs.v67VideoAdaptiveTemporalBlend = enabled
    AppToast.show(this, "Video Adaptive Temporal Blend: ${if (enabled) "ON" else "OFF"}")
}

// v67.2: Danmaku Bottom Margin
internal fun PlayerActivity.showV67DanmakuBottomMarginDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuBottomMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67DanmakuBottomMargin = value
        AppToast.show(this, "Danmaku Bottom Margin: $value")
    }
}

// v67.3: Subtitle Animation Zoom
internal fun PlayerActivity.showV67SubtitleAnimationZoomToggle() {
    val enabled = !BiliClient.prefs.v67SubtitleAnimationZoom
    BiliClient.prefs.v67SubtitleAnimationZoom = enabled
    AppToast.show(this, "Subtitle Animation Zoom: ${if (enabled) "ON" else "OFF"}")
}

// v67.4: Gesture Custom Gesture 3
internal fun PlayerActivity.showV67GestureCustomGesture3Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67GestureCustomGesture3).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Gesture 3",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67GestureCustomGesture3 = value
        AppToast.show(this, "Gesture Custom Gesture 3: $value")
    }
}

// v67.5: Video Color Tilt Shift
internal fun PlayerActivity.showV67VideoColorTiltShiftToggle() {
    val enabled = !BiliClient.prefs.v67VideoColorTiltShift
    BiliClient.prefs.v67VideoColorTiltShift = enabled
    AppToast.show(this, "Video Color Tilt Shift: ${if (enabled) "ON" else "OFF"}")
}

// v67.6: Danmaku Send Rate Per User
internal fun PlayerActivity.showV67DanmakuSendRatePerUserDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuSendRatePerUser).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Rate Per User",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67DanmakuSendRatePerUser = value
        AppToast.show(this, "Danmaku Send Rate Per User: $value")
    }
}

// v67.7: Cast Video 3D
internal fun PlayerActivity.showV67CastVideo3DToggle() {
    val enabled = !BiliClient.prefs.v67CastVideo3D
    BiliClient.prefs.v67CastVideo3D = enabled
    AppToast.show(this, "Cast Video 3D: ${if (enabled) "ON" else "OFF"}")
}

// v67.8: Subtitle BG Gradient Direction
internal fun PlayerActivity.showV67SubtitleBgGradientDirectionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67SubtitleBgGradientDirection).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Direction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67SubtitleBgGradientDirection = value
        AppToast.show(this, "Subtitle BG Gradient Direction: $value")
    }
}

// v67.9: Video Adaptive Spatial Blend
internal fun PlayerActivity.showV67VideoAdaptiveSpatialBlendToggle() {
    val enabled = !BiliClient.prefs.v67VideoAdaptiveSpatialBlend
    BiliClient.prefs.v67VideoAdaptiveSpatialBlend = enabled
    AppToast.show(this, "Video Adaptive Spatial Blend: ${if (enabled) "ON" else "OFF"}")
}

// v67.10: Danmaku Filter By Level
internal fun PlayerActivity.showV67DanmakuFilterByLevelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67DanmakuFilterByLevel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Filter By Level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67DanmakuFilterByLevel = value
        AppToast.show(this, "Danmaku Filter By Level: $value")
    }
}

// v67.11: Playlist Auto Repeat Mode
internal fun PlayerActivity.showV67PlaylistAutoRepeatModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v67PlaylistAutoRepeatMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Repeat Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67PlaylistAutoRepeatMode = value
        AppToast.show(this, "Playlist Auto Repeat Mode: $value")
    }
}

// v67.12: Gesture Swipe Bounce
internal fun PlayerActivity.showV67GestureSwipeBounceDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v67GestureSwipeBounce).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Bounce",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v67GestureSwipeBounce = value
        AppToast.show(this, "Gesture Swipe Bounce: $value")
    }
}

// v67.13: Video Color Cross Process
internal fun PlayerActivity.showV67VideoColorCrossProcessToggle() {
    val enabled = !BiliClient.prefs.v67VideoColorCrossProcess
    BiliClient.prefs.v67VideoColorCrossProcess = enabled
    AppToast.show(this, "Video Color Cross Process: ${if (enabled) "ON" else "OFF"}")
}

// v67.14: Danmaku History Export Auto
internal fun PlayerActivity.showV67DanmakuHistoryExportAutoToggle() {
    val enabled = !BiliClient.prefs.v67DanmakuHistoryExportAuto
    BiliClient.prefs.v67DanmakuHistoryExportAuto = enabled
    AppToast.show(this, "Danmaku History Export Auto: ${if (enabled) "ON" else "OFF"}")
}

// v67.15: Cast Audio Spatial
internal fun PlayerActivity.showV67CastAudioSpatialToggle() {
    val enabled = !BiliClient.prefs.v67CastAudioSpatial
    BiliClient.prefs.v67CastAudioSpatial = enabled
    AppToast.show(this, "Cast Audio Spatial: ${if (enabled) "ON" else "OFF"}")
}

// v68.1: Video Adaptive Color Balance
internal fun PlayerActivity.showV68VideoAdaptiveColorBalanceToggle() {
    val enabled = !BiliClient.prefs.v68VideoAdaptiveColorBalance
    BiliClient.prefs.v68VideoAdaptiveColorBalance = enabled
    AppToast.show(this, "Video Adaptive Color Balance: ${if (enabled) "ON" else "OFF"}")
}

// v68.2: Danmaku Left Right Margin
internal fun PlayerActivity.showV68DanmakuLeftRightMarginDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v68DanmakuLeftRightMargin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Left Right Margin",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68DanmakuLeftRightMargin = value
        AppToast.show(this, "Danmaku Left Right Margin: $value")
    }
}

// v68.3: Subtitle Animation Rotate
internal fun PlayerActivity.showV68SubtitleAnimationRotateToggle() {
    val enabled = !BiliClient.prefs.v68SubtitleAnimationRotate
    BiliClient.prefs.v68SubtitleAnimationRotate = enabled
    AppToast.show(this, "Subtitle Animation Rotate: ${if (enabled) "ON" else "OFF"}")
}

// v68.4: Gesture Custom Gesture 4
internal fun PlayerActivity.showV68GestureCustomGesture4Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v68GestureCustomGesture4).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Gesture 4",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68GestureCustomGesture4 = value
        AppToast.show(this, "Gesture Custom Gesture 4: $value")
    }
}

// v68.5: Video Color Fisheye
internal fun PlayerActivity.showV68VideoColorFisheyeDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v68VideoColorFisheye).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Fisheye",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68VideoColorFisheye = value
        AppToast.show(this, "Video Color Fisheye: $value")
    }
}

// v68.6: Danmaku Send Max Length Per Minute
internal fun PlayerActivity.showV68DanmakuSendMaxLengthPerMinuteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v68DanmakuSendMaxLengthPerMinute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Per Minute",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68DanmakuSendMaxLengthPerMinute = value
        AppToast.show(this, "Danmaku Send Max Length Per Minute: $value")
    }
}

// v68.7: Cast Video Surround
internal fun PlayerActivity.showV68CastVideoSurroundToggle() {
    val enabled = !BiliClient.prefs.v68CastVideoSurround
    BiliClient.prefs.v68CastVideoSurround = enabled
    AppToast.show(this, "Cast Video Surround: ${if (enabled) "ON" else "OFF"}")
}

// v68.8: Subtitle BG Gradient Color
internal fun PlayerActivity.showV68SubtitleBgGradientColorDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v68SubtitleBgGradientColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68SubtitleBgGradientColor = value
        AppToast.show(this, "Subtitle BG Gradient Color: $value")
    }
}

// v68.9: Video Adaptive Noise Reduce
internal fun PlayerActivity.showV68VideoAdaptiveNoiseReduceToggle() {
    val enabled = !BiliClient.prefs.v68VideoAdaptiveNoiseReduce
    BiliClient.prefs.v68VideoAdaptiveNoiseReduce = enabled
    AppToast.show(this, "Video Adaptive Noise Reduce: ${if (enabled) "ON" else "OFF"}")
}

// v68.10: Danmaku Filter By Title
internal fun PlayerActivity.showV68DanmakuFilterByTitleToggle() {
    val enabled = !BiliClient.prefs.v68DanmakuFilterByTitle
    BiliClient.prefs.v68DanmakuFilterByTitle = enabled
    AppToast.show(this, "Danmaku Filter By Title: ${if (enabled) "ON" else "OFF"}")
}

// v68.11: Playlist Auto Next On End
internal fun PlayerActivity.showV68PlaylistAutoNextOnEndToggle() {
    val enabled = !BiliClient.prefs.v68PlaylistAutoNextOnEnd
    BiliClient.prefs.v68PlaylistAutoNextOnEnd = enabled
    AppToast.show(this, "Playlist Auto Next On End: ${if (enabled) "ON" else "OFF"}")
}

// v68.12: Gesture Swipe Elastic
internal fun PlayerActivity.showV68GestureSwipeElasticDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v68GestureSwipeElastic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Elastic",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68GestureSwipeElastic = value
        AppToast.show(this, "Gesture Swipe Elastic: $value")
    }
}

// v68.13: Video Color Chromatic Aberration
internal fun PlayerActivity.showV68VideoColorChromaticAberrationDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v68VideoColorChromaticAberration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Chromatic Aberration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v68VideoColorChromaticAberration = value
        AppToast.show(this, "Video Color Chromatic Aberration: $value")
    }
}

// v68.14: Danmaku History Import
internal fun PlayerActivity.showV68DanmakuHistoryImportToggle() {
    val enabled = !BiliClient.prefs.v68DanmakuHistoryImport
    BiliClient.prefs.v68DanmakuHistoryImport = enabled
    AppToast.show(this, "Danmaku History Import: ${if (enabled) "ON" else "OFF"}")
}

// v68.15: Cast Audio Surround
internal fun PlayerActivity.showV68CastAudioSurroundToggle() {
    val enabled = !BiliClient.prefs.v68CastAudioSurround
    BiliClient.prefs.v68CastAudioSurround = enabled
    AppToast.show(this, "Cast Audio Surround: ${if (enabled) "ON" else "OFF"}")
}

// v69.1: Video Adaptive Detail Enhance
internal fun PlayerActivity.showV69VideoAdaptiveDetailEnhanceToggle() {
    val enabled = !BiliClient.prefs.v69VideoAdaptiveDetailEnhance
    BiliClient.prefs.v69VideoAdaptiveDetailEnhance = enabled
    AppToast.show(this, "Video Adaptive Detail Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v69.2: Danmaku Line Spacing
internal fun PlayerActivity.showV69DanmakuLineSpacingDialog() {
    val options = listOf(80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v69DanmakuLineSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Line Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69DanmakuLineSpacing = value
        AppToast.show(this, "Danmaku Line Spacing: $value")
    }
}

// v69.3: Subtitle Animation Typewriter
internal fun PlayerActivity.showV69SubtitleAnimationTypewriterToggle() {
    val enabled = !BiliClient.prefs.v69SubtitleAnimationTypewriter
    BiliClient.prefs.v69SubtitleAnimationTypewriter = enabled
    AppToast.show(this, "Subtitle Animation Typewriter: ${if (enabled) "ON" else "OFF"}")
}

// v69.4: Gesture Custom Action 5
internal fun PlayerActivity.showV69GestureCustomAction5Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v69GestureCustomAction5).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Action 5",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69GestureCustomAction5 = value
        AppToast.show(this, "Gesture Custom Action 5: $value")
    }
}

// v69.5: Video Color Barrel Distortion
internal fun PlayerActivity.showV69VideoColorBarrelDistortionDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v69VideoColorBarrelDistortion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Barrel Distortion",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69VideoColorBarrelDistortion = value
        AppToast.show(this, "Video Color Barrel Distortion: $value")
    }
}

// v69.6: Danmaku Send Max Length Total
internal fun PlayerActivity.showV69DanmakuSendMaxLengthTotalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v69DanmakuSendMaxLengthTotal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Total",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69DanmakuSendMaxLengthTotal = value
        AppToast.show(this, "Danmaku Send Max Length Total: $value")
    }
}

// v69.7: Cast Video Multi View
internal fun PlayerActivity.showV69CastVideoMultiViewToggle() {
    val enabled = !BiliClient.prefs.v69CastVideoMultiView
    BiliClient.prefs.v69CastVideoMultiView = enabled
    AppToast.show(this, "Cast Video Multi View: ${if (enabled) "ON" else "OFF"}")
}

// v69.8: Subtitle BG Padding X
internal fun PlayerActivity.showV69SubtitleBgPaddingXDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v69SubtitleBgPaddingX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Padding X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69SubtitleBgPaddingX = value
        AppToast.show(this, "Subtitle BG Padding X: $value")
    }
}

// v69.9: Video Adaptive Chroma Enhance
internal fun PlayerActivity.showV69VideoAdaptiveChromaEnhanceToggle() {
    val enabled = !BiliClient.prefs.v69VideoAdaptiveChromaEnhance
    BiliClient.prefs.v69VideoAdaptiveChromaEnhance = enabled
    AppToast.show(this, "Video Adaptive Chroma Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v69.10: Danmaku Filter By Content
internal fun PlayerActivity.showV69DanmakuFilterByContentToggle() {
    val enabled = !BiliClient.prefs.v69DanmakuFilterByContent
    BiliClient.prefs.v69DanmakuFilterByContent = enabled
    AppToast.show(this, "Danmaku Filter By Content: ${if (enabled) "ON" else "OFF"}")
}

// v69.11: Playlist Auto Resume
internal fun PlayerActivity.showV69PlaylistAutoResumeToggle() {
    val enabled = !BiliClient.prefs.v69PlaylistAutoResume
    BiliClient.prefs.v69PlaylistAutoResume = enabled
    AppToast.show(this, "Playlist Auto Resume: ${if (enabled) "ON" else "OFF"}")
}

// v69.12: Gesture Swipe Rubber Band
internal fun PlayerActivity.showV69GestureSwipeRubberBandDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v69GestureSwipeRubberBand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Rubber Band",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69GestureSwipeRubberBand = value
        AppToast.show(this, "Gesture Swipe Rubber Band: $value")
    }
}

// v69.13: Video Color Pincushion
internal fun PlayerActivity.showV69VideoColorPincushionDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v69VideoColorPincushion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Pincushion",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v69VideoColorPincushion = value
        AppToast.show(this, "Video Color Pincushion: $value")
    }
}

// v69.14: Danmaku History Clear
internal fun PlayerActivity.showV69DanmakuHistoryClearToggle() {
    val enabled = !BiliClient.prefs.v69DanmakuHistoryClear
    BiliClient.prefs.v69DanmakuHistoryClear = enabled
    AppToast.show(this, "Danmaku History Clear: ${if (enabled) "ON" else "OFF"}")
}

// v69.15: Cast Audio Multi View
internal fun PlayerActivity.showV69CastAudioMultiViewToggle() {
    val enabled = !BiliClient.prefs.v69CastAudioMultiView
    BiliClient.prefs.v69CastAudioMultiView = enabled
    AppToast.show(this, "Cast Audio Multi View: ${if (enabled) "ON" else "OFF"}")
}

// v70.1: Video Adaptive Luma Enhance
internal fun PlayerActivity.showV70VideoAdaptiveLumaEnhanceToggle() {
    val enabled = !BiliClient.prefs.v70VideoAdaptiveLumaEnhance
    BiliClient.prefs.v70VideoAdaptiveLumaEnhance = enabled
    AppToast.show(this, "Video Adaptive Luma Enhance: ${if (enabled) "ON" else "OFF"}")
}

// v70.2: Danmaku Character Spacing
internal fun PlayerActivity.showV70DanmakuCharacterSpacingDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v70DanmakuCharacterSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Character Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70DanmakuCharacterSpacing = value
        AppToast.show(this, "Danmaku Character Spacing: $value")
    }
}

// v70.3: Subtitle Animation Highlight
internal fun PlayerActivity.showV70SubtitleAnimationHighlightToggle() {
    val enabled = !BiliClient.prefs.v70SubtitleAnimationHighlight
    BiliClient.prefs.v70SubtitleAnimationHighlight = enabled
    AppToast.show(this, "Subtitle Animation Highlight: ${if (enabled) "ON" else "OFF"}")
}

// v70.4: Gesture Custom Action 6
internal fun PlayerActivity.showV70GestureCustomAction6Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v70GestureCustomAction6).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Custom Action 6",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70GestureCustomAction6 = value
        AppToast.show(this, "Gesture Custom Action 6: $value")
    }
}

// v70.5: Video Color Wave Distortion
internal fun PlayerActivity.showV70VideoColorWaveDistortionDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v70VideoColorWaveDistortion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Wave Distortion",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70VideoColorWaveDistortion = value
        AppToast.show(this, "Video Color Wave Distortion: $value")
    }
}

// v70.6: Danmaku Send Max Length VIP
internal fun PlayerActivity.showV70DanmakuSendMaxLengthVIPDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v70DanmakuSendMaxLengthVIP).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length VIP",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70DanmakuSendMaxLengthVIP = value
        AppToast.show(this, "Danmaku Send Max Length VIP: $value")
    }
}

// v70.7: Cast Video Multi Screen
internal fun PlayerActivity.showV70CastVideoMultiScreenToggle() {
    val enabled = !BiliClient.prefs.v70CastVideoMultiScreen
    BiliClient.prefs.v70CastVideoMultiScreen = enabled
    AppToast.show(this, "Cast Video Multi Screen: ${if (enabled) "ON" else "OFF"}")
}

// v70.8: Subtitle BG Padding Y
internal fun PlayerActivity.showV70SubtitleBgPaddingYDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v70SubtitleBgPaddingY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Padding Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70SubtitleBgPaddingY = value
        AppToast.show(this, "Subtitle BG Padding Y: $value")
    }
}

// v70.9: Video Adaptive Color Enhance Curve
internal fun PlayerActivity.showV70VideoAdaptiveColorEnhanceCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v70VideoAdaptiveColorEnhanceCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Adaptive Color Enhance Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70VideoAdaptiveColorEnhanceCurve = value
        AppToast.show(this, "Video Adaptive Color Enhance Curve: $value")
    }
}

// v70.10: Danmaku Filter By Gift
internal fun PlayerActivity.showV70DanmakuFilterByGiftToggle() {
    val enabled = !BiliClient.prefs.v70DanmakuFilterByGift
    BiliClient.prefs.v70DanmakuFilterByGift = enabled
    AppToast.show(this, "Danmaku Filter By Gift: ${if (enabled) "ON" else "OFF"}")
}

// v70.11: Playlist Auto Create
internal fun PlayerActivity.showV70PlaylistAutoCreateToggle() {
    val enabled = !BiliClient.prefs.v70PlaylistAutoCreate
    BiliClient.prefs.v70PlaylistAutoCreate = enabled
    AppToast.show(this, "Playlist Auto Create: ${if (enabled) "ON" else "OFF"}")
}

// v70.12: Gesture Swipe Spring
internal fun PlayerActivity.showV70GestureSwipeSpringDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v70GestureSwipeSpring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Spring",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70GestureSwipeSpring = value
        AppToast.show(this, "Gesture Swipe Spring: $value")
    }
}

// v70.13: Video Color Glitch
internal fun PlayerActivity.showV70VideoColorGlitchDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v70VideoColorGlitch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Glitch",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v70VideoColorGlitch = value
        AppToast.show(this, "Video Color Glitch: $value")
    }
}

// v70.14: Danmaku History Stats
internal fun PlayerActivity.showV70DanmakuHistoryStatsToggle() {
    val enabled = !BiliClient.prefs.v70DanmakuHistoryStats
    BiliClient.prefs.v70DanmakuHistoryStats = enabled
    AppToast.show(this, "Danmaku History Stats: ${if (enabled) "ON" else "OFF"}")
}

// v70.15: Cast Audio Multi Screen
internal fun PlayerActivity.showV70CastAudioMultiScreenToggle() {
    val enabled = !BiliClient.prefs.v70CastAudioMultiScreen
    BiliClient.prefs.v70CastAudioMultiScreen = enabled
    AppToast.show(this, "Cast Audio Multi Screen: ${if (enabled) "ON" else "OFF"}")
}

// v71.1: Video Stabilization Strength
internal fun PlayerActivity.showV71VideoStabilizationStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v71VideoStabilizationStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Stabilization Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71VideoStabilizationStrength = value
        AppToast.show(this, "Video Stabilization Strength: $value")
    }
}

// v71.2: Danmaku Collision Avoidance
internal fun PlayerActivity.showV71DanmakuCollisionAvoidanceToggle() {
    val enabled = !BiliClient.prefs.v71DanmakuCollisionAvoidance
    BiliClient.prefs.v71DanmakuCollisionAvoidance = enabled
    AppToast.show(this, "Danmaku Collision Avoidance: ${if (enabled) "ON" else "OFF"}")
}

// v71.3: Subtitle Word Wrap Mode
internal fun PlayerActivity.showV71SubtitleWordWrapModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v71SubtitleWordWrapMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Word Wrap Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71SubtitleWordWrapMode = value
        AppToast.show(this, "Subtitle Word Wrap Mode: $value")
    }
}

// v71.4: Gesture Sensitivity Profile
internal fun PlayerActivity.showV71GestureSensitivityProfileDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v71GestureSensitivityProfile).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Sensitivity Profile",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71GestureSensitivityProfile = value
        AppToast.show(this, "Gesture Sensitivity Profile: $value")
    }
}

// v71.5: Cast Video Stabilization
internal fun PlayerActivity.showV71CastVideoStabilizationToggle() {
    val enabled = !BiliClient.prefs.v71CastVideoStabilization
    BiliClient.prefs.v71CastVideoStabilization = enabled
    AppToast.show(this, "Cast Video Stabilization: ${if (enabled) "ON" else "OFF"}")
}

// v71.6: Playlist Auto Recover
internal fun PlayerActivity.showV71PlaylistAutoRecoverToggle() {
    val enabled = !BiliClient.prefs.v71PlaylistAutoRecover
    BiliClient.prefs.v71PlaylistAutoRecover = enabled
    AppToast.show(this, "Playlist Auto Recover: ${if (enabled) "ON" else "OFF"}")
}

// v71.7: Cache Integrity Check
internal fun PlayerActivity.showV71CacheIntegrityCheckToggle() {
    val enabled = !BiliClient.prefs.v71CacheIntegrityCheck
    BiliClient.prefs.v71CacheIntegrityCheck = enabled
    AppToast.show(this, "Cache Integrity Check: ${if (enabled) "ON" else "OFF"}")
}

// v71.8: Progress Bar Chapter Marks
internal fun PlayerActivity.showV71ProgressBarChapterMarksToggle() {
    val enabled = !BiliClient.prefs.v71ProgressBarChapterMarks
    BiliClient.prefs.v71ProgressBarChapterMarks = enabled
    AppToast.show(this, "Progress Bar Chapter Marks: ${if (enabled) "ON" else "OFF"}")
}

// v71.9: Volume Normalization Auto
internal fun PlayerActivity.showV71VolumeNormalizationAutoToggle() {
    val enabled = !BiliClient.prefs.v71VolumeNormalizationAuto
    BiliClient.prefs.v71VolumeNormalizationAuto = enabled
    AppToast.show(this, "Volume Normalization Auto: ${if (enabled) "ON" else "OFF"}")
}

// v71.10: History Auto Sync
internal fun PlayerActivity.showV71HistoryAutoSyncToggle() {
    val enabled = !BiliClient.prefs.v71HistoryAutoSync
    BiliClient.prefs.v71HistoryAutoSync = enabled
    AppToast.show(this, "History Auto Sync: ${if (enabled) "ON" else "OFF"}")
}

// v71.11: Playback Resume From Bookmark
internal fun PlayerActivity.showV71PlaybackResumeFromBookmarkToggle() {
    val enabled = !BiliClient.prefs.v71PlaybackResumeFromBookmark
    BiliClient.prefs.v71PlaybackResumeFromBookmark = enabled
    AppToast.show(this, "Playback Resume From Bookmark: ${if (enabled) "ON" else "OFF"}")
}

// v71.12: Screenshot Auto Annotate
internal fun PlayerActivity.showV71ScreenshotAutoAnnotateToggle() {
    val enabled = !BiliClient.prefs.v71ScreenshotAutoAnnotate
    BiliClient.prefs.v71ScreenshotAutoAnnotate = enabled
    AppToast.show(this, "Screenshot Auto Annotate: ${if (enabled) "ON" else "OFF"}")
}

// v71.13: Video HDR10+
internal fun PlayerActivity.showV71VideoHDR10PlusToggle() {
    val enabled = !BiliClient.prefs.v71VideoHDR10Plus
    BiliClient.prefs.v71VideoHDR10Plus = enabled
    AppToast.show(this, "Video HDR10+: ${if (enabled) "ON" else "OFF"}")
}

// v71.14: Danmaku Layer Management
internal fun PlayerActivity.showV71DanmakuLayerManagementDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v71DanmakuLayerManagement).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Layer Management",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71DanmakuLayerManagement = value
        AppToast.show(this, "Danmaku Layer Management: $value")
    }
}

// v71.15: Subtitle Line Spacing Custom
internal fun PlayerActivity.showV71SubtitleLineSpacingCustomDialog() {
    val options = listOf(80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v71SubtitleLineSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Line Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v71SubtitleLineSpacingCustom = value
        AppToast.show(this, "Subtitle Line Spacing Custom: $value")
    }
}

// v72.1: Video Frame Rate Convert
internal fun PlayerActivity.showV72VideoFrameRateConvertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72VideoFrameRateConvert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Frame Rate Convert",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72VideoFrameRateConvert = value
        AppToast.show(this, "Video Frame Rate Convert: $value")
    }
}

// v72.2: Danmaku Priority System
internal fun PlayerActivity.showV72DanmakuPrioritySystemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72DanmakuPrioritySystem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Priority System",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72DanmakuPrioritySystem = value
        AppToast.show(this, "Danmaku Priority System: $value")
    }
}

// v72.3: Subtitle Char Spacing Custom
internal fun PlayerActivity.showV72SubtitleCharSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v72SubtitleCharSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Char Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72SubtitleCharSpacingCustom = value
        AppToast.show(this, "Subtitle Char Spacing Custom: $value")
    }
}

// v72.4: Gesture Dead Zone Custom
internal fun PlayerActivity.showV72GestureDeadZoneCustomDialog() {
    val options = listOf(5, 10, 15, 20, 25)
    val currentIndex = options.indexOf(BiliClient.prefs.v72GestureDeadZoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Dead Zone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72GestureDeadZoneCustom = value
        AppToast.show(this, "Gesture Dead Zone Custom: $value")
    }
}

// v72.5: Cast Audio Normalization
internal fun PlayerActivity.showV72CastAudioNormalizationToggle() {
    val enabled = !BiliClient.prefs.v72CastAudioNormalization
    BiliClient.prefs.v72CastAudioNormalization = enabled
    AppToast.show(this, "Cast Audio Normalization: ${if (enabled) "ON" else "OFF"}")
}

// v72.6: Playlist Auto Recover Mode
internal fun PlayerActivity.showV72PlaylistAutoRecoverModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72PlaylistAutoRecoverMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72PlaylistAutoRecoverMode = value
        AppToast.show(this, "Playlist Auto Recover Mode: $value")
    }
}

// v72.7: Cache Deduplication
internal fun PlayerActivity.showV72CacheDeduplicationToggle() {
    val enabled = !BiliClient.prefs.v72CacheDeduplication
    BiliClient.prefs.v72CacheDeduplication = enabled
    AppToast.show(this, "Cache Deduplication: ${if (enabled) "ON" else "OFF"}")
}

// v72.8: Progress Bar Buffer Indicator
internal fun PlayerActivity.showV72ProgressBarBufferIndicatorToggle() {
    val enabled = !BiliClient.prefs.v72ProgressBarBufferIndicator
    BiliClient.prefs.v72ProgressBarBufferIndicator = enabled
    AppToast.show(this, "Progress Bar Buffer Indicator: ${if (enabled) "ON" else "OFF"}")
}

// v72.9: Volume Compression Strength
internal fun PlayerActivity.showV72VolumeCompressionStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v72VolumeCompressionStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Compression Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72VolumeCompressionStrength = value
        AppToast.show(this, "Volume Compression Strength: $value")
    }
}

// v72.10: History Auto Backup
internal fun PlayerActivity.showV72HistoryAutoBackupToggle() {
    val enabled = !BiliClient.prefs.v72HistoryAutoBackup
    BiliClient.prefs.v72HistoryAutoBackup = enabled
    AppToast.show(this, "History Auto Backup: ${if (enabled) "ON" else "OFF"}")
}

// v72.11: Playback Auto Bookmark
internal fun PlayerActivity.showV72PlaybackAutoBookmarkToggle() {
    val enabled = !BiliClient.prefs.v72PlaybackAutoBookmark
    BiliClient.prefs.v72PlaybackAutoBookmark = enabled
    AppToast.show(this, "Playback Auto Bookmark: ${if (enabled) "ON" else "OFF"}")
}

// v72.12: Screenshot Auto Share
internal fun PlayerActivity.showV72ScreenshotAutoShareToggle() {
    val enabled = !BiliClient.prefs.v72ScreenshotAutoShare
    BiliClient.prefs.v72ScreenshotAutoShare = enabled
    AppToast.show(this, "Screenshot Auto Share: ${if (enabled) "ON" else "OFF"}")
}

// v72.13: Video Dolby Vision Profile
internal fun PlayerActivity.showV72VideoDolbyVisionProfileDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72VideoDolbyVisionProfile).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Dolby Vision Profile",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72VideoDolbyVisionProfile = value
        AppToast.show(this, "Video Dolby Vision Profile: $value")
    }
}

// v72.14: Danmaku Animation Effects
internal fun PlayerActivity.showV72DanmakuAnimationEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v72DanmakuAnimationEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Animation Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v72DanmakuAnimationEffects = value
        AppToast.show(this, "Danmaku Animation Effects: $value")
    }
}

// v72.15: Subtitle BG Gradient Custom
internal fun PlayerActivity.showV72SubtitleBgGradientCustomToggle() {
    val enabled = !BiliClient.prefs.v72SubtitleBgGradientCustom
    BiliClient.prefs.v72SubtitleBgGradientCustom = enabled
    AppToast.show(this, "Subtitle BG Gradient Custom: ${if (enabled) "ON" else "OFF"}")
}

// v73.1: Video Color Space Convert
internal fun PlayerActivity.showV73VideoColorSpaceConvertDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73VideoColorSpaceConvert).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space Convert",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73VideoColorSpaceConvert = value
        AppToast.show(this, "Video Color Space Convert: $value")
    }
}

// v73.2: Danmaku Scroll Direction Custom
internal fun PlayerActivity.showV73DanmakuScrollDirectionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73DanmakuScrollDirectionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Direction Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73DanmakuScrollDirectionCustom = value
        AppToast.show(this, "Danmaku Scroll Direction Custom: $value")
    }
}

// v73.3: Subtitle Animation Custom
internal fun PlayerActivity.showV73SubtitleAnimationCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73SubtitleAnimationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73SubtitleAnimationCustom = value
        AppToast.show(this, "Subtitle Animation Custom: $value")
    }
}

// v73.4: Gesture Feedback Mode
internal fun PlayerActivity.showV73GestureFeedbackModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73GestureFeedbackMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Feedback Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73GestureFeedbackMode = value
        AppToast.show(this, "Gesture Feedback Mode: $value")
    }
}

// v73.5: Cast Video Color Space
internal fun PlayerActivity.showV73CastVideoColorSpaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73CastVideoColorSpace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Color Space",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73CastVideoColorSpace = value
        AppToast.show(this, "Cast Video Color Space: $value")
    }
}

// v73.6: Playlist Auto Recover Priority
internal fun PlayerActivity.showV73PlaylistAutoRecoverPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73PlaylistAutoRecoverPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73PlaylistAutoRecoverPriority = value
        AppToast.show(this, "Playlist Auto Recover Priority: $value")
    }
}

// v73.7: Cache Verification Mode
internal fun PlayerActivity.showV73CacheVerificationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73CacheVerificationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Verification Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73CacheVerificationMode = value
        AppToast.show(this, "Cache Verification Mode: $value")
    }
}

// v73.8: Progress Bar Thumb Style
internal fun PlayerActivity.showV73ProgressBarThumbStyleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73ProgressBarThumbStyle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Style",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73ProgressBarThumbStyle = value
        AppToast.show(this, "Progress Bar Thumb Style: $value")
    }
}

// v73.9: Volume Expansion Strength
internal fun PlayerActivity.showV73VolumeExpansionStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v73VolumeExpansionStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Expansion Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73VolumeExpansionStrength = value
        AppToast.show(this, "Volume Expansion Strength: $value")
    }
}

// v73.10: History Auto Sync Mode
internal fun PlayerActivity.showV73HistoryAutoSyncModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73HistoryAutoSyncMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Sync Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73HistoryAutoSyncMode = value
        AppToast.show(this, "History Auto Sync Mode: $value")
    }
}

// v73.11: Playback Auto Bookmark Mode
internal fun PlayerActivity.showV73PlaybackAutoBookmarkModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73PlaybackAutoBookmarkMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Bookmark Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73PlaybackAutoBookmarkMode = value
        AppToast.show(this, "Playback Auto Bookmark Mode: $value")
    }
}

// v73.12: Screenshot Auto Edit
internal fun PlayerActivity.showV73ScreenshotAutoEditToggle() {
    val enabled = !BiliClient.prefs.v73ScreenshotAutoEdit
    BiliClient.prefs.v73ScreenshotAutoEdit = enabled
    AppToast.show(this, "Screenshot Auto Edit: ${if (enabled) "ON" else "OFF"}")
}

// v73.13: Video Alpha Channel
internal fun PlayerActivity.showV73VideoAlphaChannelToggle() {
    val enabled = !BiliClient.prefs.v73VideoAlphaChannel
    BiliClient.prefs.v73VideoAlphaChannel = enabled
    AppToast.show(this, "Video Alpha Channel: ${if (enabled) "ON" else "OFF"}")
}

// v73.14: Danmaku Font Weight Adaptive
internal fun PlayerActivity.showV73DanmakuFontWeightAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v73DanmakuFontWeightAdaptive
    BiliClient.prefs.v73DanmakuFontWeightAdaptive = enabled
    AppToast.show(this, "Danmaku Font Weight Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v73.15: Subtitle Outline Effects
internal fun PlayerActivity.showV73SubtitleOutlineEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v73SubtitleOutlineEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v73SubtitleOutlineEffects = value
        AppToast.show(this, "Subtitle Outline Effects: $value")
    }
}

// v74.1: Video Depth Of Field
internal fun PlayerActivity.showV74VideoDepthOfFieldToggle() {
    val enabled = !BiliClient.prefs.v74VideoDepthOfField
    BiliClient.prefs.v74VideoDepthOfField = enabled
    AppToast.show(this, "Video Depth Of Field: ${if (enabled) "ON" else "OFF"}")
}

// v74.2: Danmaku Background Blur
internal fun PlayerActivity.showV74DanmakuBackgroundBlurDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v74DanmakuBackgroundBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Background Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74DanmakuBackgroundBlur = value
        AppToast.show(this, "Danmaku Background Blur: $value")
    }
}

// v74.3: Subtitle Shadow Effects
internal fun PlayerActivity.showV74SubtitleShadowEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74SubtitleShadowEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74SubtitleShadowEffects = value
        AppToast.show(this, "Subtitle Shadow Effects: $value")
    }
}

// v74.4: Gesture Animation Mode
internal fun PlayerActivity.showV74GestureAnimationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74GestureAnimationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Animation Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74GestureAnimationMode = value
        AppToast.show(this, "Gesture Animation Mode: $value")
    }
}

// v74.5: Cast Video HDR10+
internal fun PlayerActivity.showV74CastVideoHDR10PlusToggle() {
    val enabled = !BiliClient.prefs.v74CastVideoHDR10Plus
    BiliClient.prefs.v74CastVideoHDR10Plus = enabled
    AppToast.show(this, "Cast Video HDR10+: ${if (enabled) "ON" else "OFF"}")
}

// v74.6: Playlist Auto Recover Time
internal fun PlayerActivity.showV74PlaylistAutoRecoverTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74PlaylistAutoRecoverTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74PlaylistAutoRecoverTime = value
        AppToast.show(this, "Playlist Auto Recover Time: $value")
    }
}

// v74.7: Cache Compression Mode
internal fun PlayerActivity.showV74CacheCompressionModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74CacheCompressionMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Compression Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74CacheCompressionMode = value
        AppToast.show(this, "Cache Compression Mode: $value")
    }
}

// v74.8: Progress Bar Seek Preview
internal fun PlayerActivity.showV74ProgressBarSeekPreviewToggle() {
    val enabled = !BiliClient.prefs.v74ProgressBarSeekPreview
    BiliClient.prefs.v74ProgressBarSeekPreview = enabled
    AppToast.show(this, "Progress Bar Seek Preview: ${if (enabled) "ON" else "OFF"}")
}

// v74.9: Volume Equalizer Preset
internal fun PlayerActivity.showV74VolumeEqualizerPresetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74VolumeEqualizerPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Equalizer Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74VolumeEqualizerPreset = value
        AppToast.show(this, "Volume Equalizer Preset: $value")
    }
}

// v74.10: History Auto Backup Mode
internal fun PlayerActivity.showV74HistoryAutoBackupModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74HistoryAutoBackupMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Backup Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74HistoryAutoBackupMode = value
        AppToast.show(this, "History Auto Backup Mode: $value")
    }
}

// v74.11: Playback Auto Pause On Focus
internal fun PlayerActivity.showV74PlaybackAutoPauseOnFocusToggle() {
    val enabled = !BiliClient.prefs.v74PlaybackAutoPauseOnFocus
    BiliClient.prefs.v74PlaybackAutoPauseOnFocus = enabled
    AppToast.show(this, "Playback Auto Pause On Focus: ${if (enabled) "ON" else "OFF"}")
}

// v74.12: Screenshot Auto Crop
internal fun PlayerActivity.showV74ScreenshotAutoCropToggle() {
    val enabled = !BiliClient.prefs.v74ScreenshotAutoCrop
    BiliClient.prefs.v74ScreenshotAutoCrop = enabled
    AppToast.show(this, "Screenshot Auto Crop: ${if (enabled) "ON" else "OFF"}")
}

// v74.13: Video Bokeh Effect
internal fun PlayerActivity.showV74VideoBokehEffectToggle() {
    val enabled = !BiliClient.prefs.v74VideoBokehEffect
    BiliClient.prefs.v74VideoBokehEffect = enabled
    AppToast.show(this, "Video Bokeh Effect: ${if (enabled) "ON" else "OFF"}")
}

// v74.14: Danmaku Shadow Effects
internal fun PlayerActivity.showV74DanmakuShadowEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74DanmakuShadowEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Shadow Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74DanmakuShadowEffects = value
        AppToast.show(this, "Danmaku Shadow Effects: $value")
    }
}

// v74.15: Subtitle Glow Effects
internal fun PlayerActivity.showV74SubtitleGlowEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v74SubtitleGlowEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Glow Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v74SubtitleGlowEffects = value
        AppToast.show(this, "Subtitle Glow Effects: $value")
    }
}

// v75.1: Video Chroma Key
internal fun PlayerActivity.showV75VideoChromaKeyToggle() {
    val enabled = !BiliClient.prefs.v75VideoChromaKey
    BiliClient.prefs.v75VideoChromaKey = enabled
    AppToast.show(this, "Video Chroma Key: ${if (enabled) "ON" else "OFF"}")
}

// v75.2: Danmaku Glow Effects
internal fun PlayerActivity.showV75DanmakuGlowEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75DanmakuGlowEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Glow Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75DanmakuGlowEffects = value
        AppToast.show(this, "Danmaku Glow Effects: $value")
    }
}

// v75.3: Subtitle Border Effects
internal fun PlayerActivity.showV75SubtitleBorderEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75SubtitleBorderEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Border Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75SubtitleBorderEffects = value
        AppToast.show(this, "Subtitle Border Effects: $value")
    }
}

// v75.4: Gesture Sound Feedback
internal fun PlayerActivity.showV75GestureSoundFeedbackToggle() {
    val enabled = !BiliClient.prefs.v75GestureSoundFeedback
    BiliClient.prefs.v75GestureSoundFeedback = enabled
    AppToast.show(this, "Gesture Sound Feedback: ${if (enabled) "ON" else "OFF"}")
}

// v75.5: Cast Audio Spatial
internal fun PlayerActivity.showV75CastAudioSpatialToggle() {
    val enabled = !BiliClient.prefs.v75CastAudioSpatial
    BiliClient.prefs.v75CastAudioSpatial = enabled
    AppToast.show(this, "Cast Audio Spatial: ${if (enabled) "ON" else "OFF"}")
}

// v75.6: Playlist Auto Recover Source
internal fun PlayerActivity.showV75PlaylistAutoRecoverSourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75PlaylistAutoRecoverSource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Source",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75PlaylistAutoRecoverSource = value
        AppToast.show(this, "Playlist Auto Recover Source: $value")
    }
}

// v75.7: Cache Encryption Mode
internal fun PlayerActivity.showV75CacheEncryptionModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75CacheEncryptionMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Encryption Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75CacheEncryptionMode = value
        AppToast.show(this, "Cache Encryption Mode: $value")
    }
}

// v75.8: Progress Bar Chapter Preview
internal fun PlayerActivity.showV75ProgressBarChapterPreviewToggle() {
    val enabled = !BiliClient.prefs.v75ProgressBarChapterPreview
    BiliClient.prefs.v75ProgressBarChapterPreview = enabled
    AppToast.show(this, "Progress Bar Chapter Preview: ${if (enabled) "ON" else "OFF"}")
}

// v75.9: Volume Spatial Audio
internal fun PlayerActivity.showV75VolumeSpatialAudioToggle() {
    val enabled = !BiliClient.prefs.v75VolumeSpatialAudio
    BiliClient.prefs.v75VolumeSpatialAudio = enabled
    AppToast.show(this, "Volume Spatial Audio: ${if (enabled) "ON" else "OFF"}")
}

// v75.10: History Auto Restore
internal fun PlayerActivity.showV75HistoryAutoRestoreToggle() {
    val enabled = !BiliClient.prefs.v75HistoryAutoRestore
    BiliClient.prefs.v75HistoryAutoRestore = enabled
    AppToast.show(this, "History Auto Restore: ${if (enabled) "ON" else "OFF"}")
}

// v75.11: Playback Auto Resume On Return
internal fun PlayerActivity.showV75PlaybackAutoResumeOnReturnToggle() {
    val enabled = !BiliClient.prefs.v75PlaybackAutoResumeOnReturn
    BiliClient.prefs.v75PlaybackAutoResumeOnReturn = enabled
    AppToast.show(this, "Playback Auto Resume On Return: ${if (enabled) "ON" else "OFF"}")
}

// v75.12: Screenshot Auto Filter
internal fun PlayerActivity.showV75ScreenshotAutoFilterToggle() {
    val enabled = !BiliClient.prefs.v75ScreenshotAutoFilter
    BiliClient.prefs.v75ScreenshotAutoFilter = enabled
    AppToast.show(this, "Screenshot Auto Filter: ${if (enabled) "ON" else "OFF"}")
}

// v75.13: Video Frame Blend
internal fun PlayerActivity.showV75VideoFrameBlendToggle() {
    val enabled = !BiliClient.prefs.v75VideoFrameBlend
    BiliClient.prefs.v75VideoFrameBlend = enabled
    AppToast.show(this, "Video Frame Blend: ${if (enabled) "ON" else "OFF"}")
}

// v75.14: Danmaku Border Effects
internal fun PlayerActivity.showV75DanmakuBorderEffectsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v75DanmakuBorderEffects).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Border Effects",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75DanmakuBorderEffects = value
        AppToast.show(this, "Danmaku Border Effects: $value")
    }
}

// v75.15: Subtitle Animation Speed
internal fun PlayerActivity.showV75SubtitleAnimationSpeedDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v75SubtitleAnimationSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v75SubtitleAnimationSpeed = value
        AppToast.show(this, "Subtitle Animation Speed: $value")
    }
}

// v76.1: Video Color Grading Preset
internal fun PlayerActivity.showV76VideoColorGradingPresetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76VideoColorGradingPreset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Grading Preset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76VideoColorGradingPreset = value
        AppToast.show(this, "Video Color Grading Preset: $value")
    }
}

// v76.2: Danmaku Font Style Custom
internal fun PlayerActivity.showV76DanmakuFontStyleCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76DanmakuFontStyleCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Style Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76DanmakuFontStyleCustom = value
        AppToast.show(this, "Danmaku Font Style Custom: $value")
    }
}

// v76.3: Subtitle Font Style Custom
internal fun PlayerActivity.showV76SubtitleFontStyleCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76SubtitleFontStyleCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Style Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76SubtitleFontStyleCustom = value
        AppToast.show(this, "Subtitle Font Style Custom: $value")
    }
}

// v76.4: Gesture Vibration Feedback
internal fun PlayerActivity.showV76GestureVibrationFeedbackToggle() {
    val enabled = !BiliClient.prefs.v76GestureVibrationFeedback
    BiliClient.prefs.v76GestureVibrationFeedback = enabled
    AppToast.show(this, "Gesture Vibration Feedback: ${if (enabled) "ON" else "OFF"}")
}

// v76.5: Cast Video Dolby Atmos
internal fun PlayerActivity.showV76CastVideoDolbyAtmosToggle() {
    val enabled = !BiliClient.prefs.v76CastVideoDolbyAtmos
    BiliClient.prefs.v76CastVideoDolbyAtmos = enabled
    AppToast.show(this, "Cast Video Dolby Atmos: ${if (enabled) "ON" else "OFF"}")
}

// v76.6: Playlist Auto Recover Strategy
internal fun PlayerActivity.showV76PlaylistAutoRecoverStrategyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76PlaylistAutoRecoverStrategy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Strategy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76PlaylistAutoRecoverStrategy = value
        AppToast.show(this, "Playlist Auto Recover Strategy: $value")
    }
}

// v76.7: Cache Location Mode
internal fun PlayerActivity.showV76CacheLocationModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76CacheLocationMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Location Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76CacheLocationMode = value
        AppToast.show(this, "Cache Location Mode: $value")
    }
}

// v76.8: Progress Bar Buffer Color
internal fun PlayerActivity.showV76ProgressBarBufferColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76ProgressBarBufferColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffer Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76ProgressBarBufferColor = value
        AppToast.show(this, "Progress Bar Buffer Color: $value")
    }
}
