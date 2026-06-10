package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v409: Detect Motion Enabled409
internal fun PlayerActivity.showV409DetectMotionEnabled409Toggle() {
    val current = BiliClient.prefs.v409detectMotionEnabled409
    BiliClient.prefs.v409detectMotionEnabled409 = !current
    AppToast.show(this, "Detect Motion Enabled409: ${if (!current) "ON" else "OFF"}")
}

// v409: Dim Screen On Idle409
internal fun PlayerActivity.showV409DimScreenOnIdle409Toggle() {
    val current = BiliClient.prefs.v409dimScreenOnIdle409
    BiliClient.prefs.v409dimScreenOnIdle409 = !current
    AppToast.show(this, "Dim Screen On Idle409: ${if (!current) "ON" else "OFF"}")
}

// v410: Cloud Auto Sync410
internal fun PlayerActivity.showV410CloudAutoSync410Toggle() {
    val current = BiliClient.prefs.v410cloudAutoSync410
    BiliClient.prefs.v410cloudAutoSync410 = !current
    AppToast.show(this, "Cloud Auto Sync410: ${if (!current) "ON" else "OFF"}")
}

// v410: Cloud Storage Limit410
internal fun PlayerActivity.showV410CloudStorageLimit410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410cloudStorageLimit410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cloud Storage Limit410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410cloudStorageLimit410 = value
        AppToast.show(this, "Cloud Storage Limit410: $value")
    }
}

// v410: Collect Auto Categorize410
internal fun PlayerActivity.showV410CollectAutoCategorize410Toggle() {
    val current = BiliClient.prefs.v410collectAutoCategorize410
    BiliClient.prefs.v410collectAutoCategorize410 = !current
    AppToast.show(this, "Collect Auto Categorize410: ${if (!current) "ON" else "OFF"}")
}

// v410: Compact Mode Enabled410
internal fun PlayerActivity.showV410CompactModeEnabled410Toggle() {
    val current = BiliClient.prefs.v410compactModeEnabled410
    BiliClient.prefs.v410compactModeEnabled410 = !current
    AppToast.show(this, "Compact Mode Enabled410: ${if (!current) "ON" else "OFF"}")
}

// v410: Compress Auto Quality410
internal fun PlayerActivity.showV410CompressAutoQuality410Toggle() {
    val current = BiliClient.prefs.v410compressAutoQuality410
    BiliClient.prefs.v410compressAutoQuality410 = !current
    AppToast.show(this, "Compress Auto Quality410: ${if (!current) "ON" else "OFF"}")
}

// v410: Connect Auto Retry410
internal fun PlayerActivity.showV410ConnectAutoRetry410Toggle() {
    val current = BiliClient.prefs.v410connectAutoRetry410
    BiliClient.prefs.v410connectAutoRetry410 = !current
    AppToast.show(this, "Connect Auto Retry410: ${if (!current) "ON" else "OFF"}")
}

// v410: Dashboard Widget Layout410
internal fun PlayerActivity.showV410DashboardWidgetLayout410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410dashboardWidgetLayout410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Dashboard Widget Layout410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410dashboardWidgetLayout410 = value
        AppToast.show(this, "Dashboard Widget Layout410: $value")
    }
}

// v410: Debug Log Verbose410
internal fun PlayerActivity.showV410DebugLogVerbose410Toggle() {
    val current = BiliClient.prefs.v410debugLogVerbose410
    BiliClient.prefs.v410debugLogVerbose410 = !current
    AppToast.show(this, "Debug Log Verbose410: ${if (!current) "ON" else "OFF"}")
}

// v410: Deep Color Enabled410
internal fun PlayerActivity.showV410DeepColorEnabled410Toggle() {
    val current = BiliClient.prefs.v410deepColorEnabled410
    BiliClient.prefs.v410deepColorEnabled410 = !current
    AppToast.show(this, "Deep Color Enabled410: ${if (!current) "ON" else "OFF"}")
}

// v410: Default Player Engine410
internal fun PlayerActivity.showV410DefaultPlayerEngine410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410defaultPlayerEngine410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Default Player Engine410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410defaultPlayerEngine410 = value
        AppToast.show(this, "Default Player Engine410: $value")
    }
}

// v410: Delay Start Ms410
internal fun PlayerActivity.showV410DelayStartMs410Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v410delayStartMs410).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Delay Start Ms410",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v410delayStartMs410 = value
        AppToast.show(this, "Delay Start Ms410: $value")
    }
}

// v410: Density Auto Adjust410
internal fun PlayerActivity.showV410DensityAutoAdjust410Toggle() {
    val current = BiliClient.prefs.v410densityAutoAdjust410
    BiliClient.prefs.v410densityAutoAdjust410 = !current
    AppToast.show(this, "Density Auto Adjust410: ${if (!current) "ON" else "OFF"}")
}

// v410: Deploy Auto Update410
internal fun PlayerActivity.showV410DeployAutoUpdate410Toggle() {
    val current = BiliClient.prefs.v410deployAutoUpdate410
    BiliClient.prefs.v410deployAutoUpdate410 = !current
    AppToast.show(this, "Deploy Auto Update410: ${if (!current) "ON" else "OFF"}")
}

// v410: Detect Motion Enabled410
internal fun PlayerActivity.showV410DetectMotionEnabled410Toggle() {
    val current = BiliClient.prefs.v410detectMotionEnabled410
    BiliClient.prefs.v410detectMotionEnabled410 = !current
    AppToast.show(this, "Detect Motion Enabled410: ${if (!current) "ON" else "OFF"}")
}

// v410: Dim Screen On Idle410
internal fun PlayerActivity.showV410DimScreenOnIdle410Toggle() {
    val current = BiliClient.prefs.v410dimScreenOnIdle410
    BiliClient.prefs.v410dimScreenOnIdle410 = !current
    AppToast.show(this, "Dim Screen On Idle410: ${if (!current) "ON" else "OFF"}")
}

// v411: Display Refresh Rate411
internal fun PlayerActivity.showV411DisplayRefreshRate411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v411displayRefreshRate411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v411displayRefreshRate411 = value
        AppToast.show(this, "Display Refresh Rate411: $value")
    }
}

// v411: Display Color Temp411
internal fun PlayerActivity.showV411DisplayColorTemp411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v411displayColorTemp411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v411displayColorTemp411 = value
        AppToast.show(this, "Display Color Temp411: $value")
    }
}

// v411: Divider Auto Insert411
internal fun PlayerActivity.showV411DividerAutoInsert411Toggle() {
    val current = BiliClient.prefs.v411dividerAutoInsert411
    BiliClient.prefs.v411dividerAutoInsert411 = !current
    AppToast.show(this, "Divider Auto Insert411: ${if (!current) "ON" else "OFF"}")
}

// v411: Domain Auto Block411
internal fun PlayerActivity.showV411DomainAutoBlock411Toggle() {
    val current = BiliClient.prefs.v411domainAutoBlock411
    BiliClient.prefs.v411domainAutoBlock411 = !current
    AppToast.show(this, "Domain Auto Block411: ${if (!current) "ON" else "OFF"}")
}

// v411: Drag Drop Enabled411
internal fun PlayerActivity.showV411DragDropEnabled411Toggle() {
    val current = BiliClient.prefs.v411dragDropEnabled411
    BiliClient.prefs.v411dragDropEnabled411 = !current
    AppToast.show(this, "Drag Drop Enabled411: ${if (!current) "ON" else "OFF"}")
}

// v411: Drawer Auto Collapse411
internal fun PlayerActivity.showV411DrawerAutoCollapse411Toggle() {
    val current = BiliClient.prefs.v411drawerAutoCollapse411
    BiliClient.prefs.v411drawerAutoCollapse411 = !current
    AppToast.show(this, "Drawer Auto Collapse411: ${if (!current) "ON" else "OFF"}")
}

// v411: DRM Auto Detect411
internal fun PlayerActivity.showV411DrmAutoDetect411Toggle() {
    val current = BiliClient.prefs.v411drmAutoDetect411
    BiliClient.prefs.v411drmAutoDetect411 = !current
    AppToast.show(this, "DRM Auto Detect411: ${if (!current) "ON" else "OFF"}")
}

// v411: Duplicate Auto Remove411
internal fun PlayerActivity.showV411DuplicateAutoRemove411Toggle() {
    val current = BiliClient.prefs.v411duplicateAutoRemove411
    BiliClient.prefs.v411duplicateAutoRemove411 = !current
    AppToast.show(this, "Duplicate Auto Remove411: ${if (!current) "ON" else "OFF"}")
}

// v411: Dynamic Island411
internal fun PlayerActivity.showV411DynamicIsland411Toggle() {
    val current = BiliClient.prefs.v411dynamicIsland411
    BiliClient.prefs.v411dynamicIsland411 = !current
    AppToast.show(this, "Dynamic Island411: ${if (!current) "ON" else "OFF"}")
}

// v411: Dynamic Theme Color411
internal fun PlayerActivity.showV411DynamicThemeColor411Toggle() {
    val current = BiliClient.prefs.v411dynamicThemeColor411
    BiliClient.prefs.v411dynamicThemeColor411 = !current
    AppToast.show(this, "Dynamic Theme Color411: ${if (!current) "ON" else "OFF"}")
}

// v411: Edge Touch Reject411
internal fun PlayerActivity.showV411EdgeTouchReject411Toggle() {
    val current = BiliClient.prefs.v411edgeTouchReject411
    BiliClient.prefs.v411edgeTouchReject411 = !current
    AppToast.show(this, "Edge Touch Reject411: ${if (!current) "ON" else "OFF"}")
}

// v411: Embed Subtitle Track411
internal fun PlayerActivity.showV411EmbedSubtitleTrack411Toggle() {
    val current = BiliClient.prefs.v411embedSubtitleTrack411
    BiliClient.prefs.v411embedSubtitleTrack411 = !current
    AppToast.show(this, "Embed Subtitle Track411: ${if (!current) "ON" else "OFF"}")
}

// v411: Encode Auto Select411
internal fun PlayerActivity.showV411EncodeAutoSelect411Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v411encodeAutoSelect411).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select411",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v411encodeAutoSelect411 = value
        AppToast.show(this, "Encode Auto Select411: $value")
    }
}

// v411: Endpoint Auto Switch411
internal fun PlayerActivity.showV411EndpointAutoSwitch411Toggle() {
    val current = BiliClient.prefs.v411endpointAutoSwitch411
    BiliClient.prefs.v411endpointAutoSwitch411 = !current
    AppToast.show(this, "Endpoint Auto Switch411: ${if (!current) "ON" else "OFF"}")
}

// v411: Engine Auto Optimize411
internal fun PlayerActivity.showV411EngineAutoOptimize411Toggle() {
    val current = BiliClient.prefs.v411engineAutoOptimize411
    BiliClient.prefs.v411engineAutoOptimize411 = !current
    AppToast.show(this, "Engine Auto Optimize411: ${if (!current) "ON" else "OFF"}")
}

// v412: Display Refresh Rate412
internal fun PlayerActivity.showV412DisplayRefreshRate412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v412displayRefreshRate412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v412displayRefreshRate412 = value
        AppToast.show(this, "Display Refresh Rate412: $value")
    }
}

// v412: Display Color Temp412
internal fun PlayerActivity.showV412DisplayColorTemp412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v412displayColorTemp412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v412displayColorTemp412 = value
        AppToast.show(this, "Display Color Temp412: $value")
    }
}

// v412: Divider Auto Insert412
internal fun PlayerActivity.showV412DividerAutoInsert412Toggle() {
    val current = BiliClient.prefs.v412dividerAutoInsert412
    BiliClient.prefs.v412dividerAutoInsert412 = !current
    AppToast.show(this, "Divider Auto Insert412: ${if (!current) "ON" else "OFF"}")
}

// v412: Domain Auto Block412
internal fun PlayerActivity.showV412DomainAutoBlock412Toggle() {
    val current = BiliClient.prefs.v412domainAutoBlock412
    BiliClient.prefs.v412domainAutoBlock412 = !current
    AppToast.show(this, "Domain Auto Block412: ${if (!current) "ON" else "OFF"}")
}

// v412: Drag Drop Enabled412
internal fun PlayerActivity.showV412DragDropEnabled412Toggle() {
    val current = BiliClient.prefs.v412dragDropEnabled412
    BiliClient.prefs.v412dragDropEnabled412 = !current
    AppToast.show(this, "Drag Drop Enabled412: ${if (!current) "ON" else "OFF"}")
}

// v412: Drawer Auto Collapse412
internal fun PlayerActivity.showV412DrawerAutoCollapse412Toggle() {
    val current = BiliClient.prefs.v412drawerAutoCollapse412
    BiliClient.prefs.v412drawerAutoCollapse412 = !current
    AppToast.show(this, "Drawer Auto Collapse412: ${if (!current) "ON" else "OFF"}")
}

// v412: DRM Auto Detect412
internal fun PlayerActivity.showV412DrmAutoDetect412Toggle() {
    val current = BiliClient.prefs.v412drmAutoDetect412
    BiliClient.prefs.v412drmAutoDetect412 = !current
    AppToast.show(this, "DRM Auto Detect412: ${if (!current) "ON" else "OFF"}")
}

// v412: Duplicate Auto Remove412
internal fun PlayerActivity.showV412DuplicateAutoRemove412Toggle() {
    val current = BiliClient.prefs.v412duplicateAutoRemove412
    BiliClient.prefs.v412duplicateAutoRemove412 = !current
    AppToast.show(this, "Duplicate Auto Remove412: ${if (!current) "ON" else "OFF"}")
}

// v412: Dynamic Island412
internal fun PlayerActivity.showV412DynamicIsland412Toggle() {
    val current = BiliClient.prefs.v412dynamicIsland412
    BiliClient.prefs.v412dynamicIsland412 = !current
    AppToast.show(this, "Dynamic Island412: ${if (!current) "ON" else "OFF"}")
}

// v412: Dynamic Theme Color412
internal fun PlayerActivity.showV412DynamicThemeColor412Toggle() {
    val current = BiliClient.prefs.v412dynamicThemeColor412
    BiliClient.prefs.v412dynamicThemeColor412 = !current
    AppToast.show(this, "Dynamic Theme Color412: ${if (!current) "ON" else "OFF"}")
}

// v412: Edge Touch Reject412
internal fun PlayerActivity.showV412EdgeTouchReject412Toggle() {
    val current = BiliClient.prefs.v412edgeTouchReject412
    BiliClient.prefs.v412edgeTouchReject412 = !current
    AppToast.show(this, "Edge Touch Reject412: ${if (!current) "ON" else "OFF"}")
}

// v412: Embed Subtitle Track412
internal fun PlayerActivity.showV412EmbedSubtitleTrack412Toggle() {
    val current = BiliClient.prefs.v412embedSubtitleTrack412
    BiliClient.prefs.v412embedSubtitleTrack412 = !current
    AppToast.show(this, "Embed Subtitle Track412: ${if (!current) "ON" else "OFF"}")
}

// v412: Encode Auto Select412
internal fun PlayerActivity.showV412EncodeAutoSelect412Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v412encodeAutoSelect412).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select412",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v412encodeAutoSelect412 = value
        AppToast.show(this, "Encode Auto Select412: $value")
    }
}

// v412: Endpoint Auto Switch412
internal fun PlayerActivity.showV412EndpointAutoSwitch412Toggle() {
    val current = BiliClient.prefs.v412endpointAutoSwitch412
    BiliClient.prefs.v412endpointAutoSwitch412 = !current
    AppToast.show(this, "Endpoint Auto Switch412: ${if (!current) "ON" else "OFF"}")
}

// v412: Engine Auto Optimize412
internal fun PlayerActivity.showV412EngineAutoOptimize412Toggle() {
    val current = BiliClient.prefs.v412engineAutoOptimize412
    BiliClient.prefs.v412engineAutoOptimize412 = !current
    AppToast.show(this, "Engine Auto Optimize412: ${if (!current) "ON" else "OFF"}")
}

// v413: Display Refresh Rate413
internal fun PlayerActivity.showV413DisplayRefreshRate413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v413displayRefreshRate413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v413displayRefreshRate413 = value
        AppToast.show(this, "Display Refresh Rate413: $value")
    }
}

// v413: Display Color Temp413
internal fun PlayerActivity.showV413DisplayColorTemp413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v413displayColorTemp413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v413displayColorTemp413 = value
        AppToast.show(this, "Display Color Temp413: $value")
    }
}

// v413: Divider Auto Insert413
internal fun PlayerActivity.showV413DividerAutoInsert413Toggle() {
    val current = BiliClient.prefs.v413dividerAutoInsert413
    BiliClient.prefs.v413dividerAutoInsert413 = !current
    AppToast.show(this, "Divider Auto Insert413: ${if (!current) "ON" else "OFF"}")
}

// v413: Domain Auto Block413
internal fun PlayerActivity.showV413DomainAutoBlock413Toggle() {
    val current = BiliClient.prefs.v413domainAutoBlock413
    BiliClient.prefs.v413domainAutoBlock413 = !current
    AppToast.show(this, "Domain Auto Block413: ${if (!current) "ON" else "OFF"}")
}

// v413: Drag Drop Enabled413
internal fun PlayerActivity.showV413DragDropEnabled413Toggle() {
    val current = BiliClient.prefs.v413dragDropEnabled413
    BiliClient.prefs.v413dragDropEnabled413 = !current
    AppToast.show(this, "Drag Drop Enabled413: ${if (!current) "ON" else "OFF"}")
}

// v413: Drawer Auto Collapse413
internal fun PlayerActivity.showV413DrawerAutoCollapse413Toggle() {
    val current = BiliClient.prefs.v413drawerAutoCollapse413
    BiliClient.prefs.v413drawerAutoCollapse413 = !current
    AppToast.show(this, "Drawer Auto Collapse413: ${if (!current) "ON" else "OFF"}")
}

// v413: DRM Auto Detect413
internal fun PlayerActivity.showV413DrmAutoDetect413Toggle() {
    val current = BiliClient.prefs.v413drmAutoDetect413
    BiliClient.prefs.v413drmAutoDetect413 = !current
    AppToast.show(this, "DRM Auto Detect413: ${if (!current) "ON" else "OFF"}")
}

// v413: Duplicate Auto Remove413
internal fun PlayerActivity.showV413DuplicateAutoRemove413Toggle() {
    val current = BiliClient.prefs.v413duplicateAutoRemove413
    BiliClient.prefs.v413duplicateAutoRemove413 = !current
    AppToast.show(this, "Duplicate Auto Remove413: ${if (!current) "ON" else "OFF"}")
}

// v413: Dynamic Island413
internal fun PlayerActivity.showV413DynamicIsland413Toggle() {
    val current = BiliClient.prefs.v413dynamicIsland413
    BiliClient.prefs.v413dynamicIsland413 = !current
    AppToast.show(this, "Dynamic Island413: ${if (!current) "ON" else "OFF"}")
}

// v413: Dynamic Theme Color413
internal fun PlayerActivity.showV413DynamicThemeColor413Toggle() {
    val current = BiliClient.prefs.v413dynamicThemeColor413
    BiliClient.prefs.v413dynamicThemeColor413 = !current
    AppToast.show(this, "Dynamic Theme Color413: ${if (!current) "ON" else "OFF"}")
}

// v413: Edge Touch Reject413
internal fun PlayerActivity.showV413EdgeTouchReject413Toggle() {
    val current = BiliClient.prefs.v413edgeTouchReject413
    BiliClient.prefs.v413edgeTouchReject413 = !current
    AppToast.show(this, "Edge Touch Reject413: ${if (!current) "ON" else "OFF"}")
}

// v413: Embed Subtitle Track413
internal fun PlayerActivity.showV413EmbedSubtitleTrack413Toggle() {
    val current = BiliClient.prefs.v413embedSubtitleTrack413
    BiliClient.prefs.v413embedSubtitleTrack413 = !current
    AppToast.show(this, "Embed Subtitle Track413: ${if (!current) "ON" else "OFF"}")
}

// v413: Encode Auto Select413
internal fun PlayerActivity.showV413EncodeAutoSelect413Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v413encodeAutoSelect413).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select413",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v413encodeAutoSelect413 = value
        AppToast.show(this, "Encode Auto Select413: $value")
    }
}

// v413: Endpoint Auto Switch413
internal fun PlayerActivity.showV413EndpointAutoSwitch413Toggle() {
    val current = BiliClient.prefs.v413endpointAutoSwitch413
    BiliClient.prefs.v413endpointAutoSwitch413 = !current
    AppToast.show(this, "Endpoint Auto Switch413: ${if (!current) "ON" else "OFF"}")
}

// v413: Engine Auto Optimize413
internal fun PlayerActivity.showV413EngineAutoOptimize413Toggle() {
    val current = BiliClient.prefs.v413engineAutoOptimize413
    BiliClient.prefs.v413engineAutoOptimize413 = !current
    AppToast.show(this, "Engine Auto Optimize413: ${if (!current) "ON" else "OFF"}")
}

// v414: Display Refresh Rate414
internal fun PlayerActivity.showV414DisplayRefreshRate414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v414displayRefreshRate414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v414displayRefreshRate414 = value
        AppToast.show(this, "Display Refresh Rate414: $value")
    }
}

// v414: Display Color Temp414
internal fun PlayerActivity.showV414DisplayColorTemp414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v414displayColorTemp414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v414displayColorTemp414 = value
        AppToast.show(this, "Display Color Temp414: $value")
    }
}

// v414: Divider Auto Insert414
internal fun PlayerActivity.showV414DividerAutoInsert414Toggle() {
    val current = BiliClient.prefs.v414dividerAutoInsert414
    BiliClient.prefs.v414dividerAutoInsert414 = !current
    AppToast.show(this, "Divider Auto Insert414: ${if (!current) "ON" else "OFF"}")
}

// v414: Domain Auto Block414
internal fun PlayerActivity.showV414DomainAutoBlock414Toggle() {
    val current = BiliClient.prefs.v414domainAutoBlock414
    BiliClient.prefs.v414domainAutoBlock414 = !current
    AppToast.show(this, "Domain Auto Block414: ${if (!current) "ON" else "OFF"}")
}

// v414: Drag Drop Enabled414
internal fun PlayerActivity.showV414DragDropEnabled414Toggle() {
    val current = BiliClient.prefs.v414dragDropEnabled414
    BiliClient.prefs.v414dragDropEnabled414 = !current
    AppToast.show(this, "Drag Drop Enabled414: ${if (!current) "ON" else "OFF"}")
}

// v414: Drawer Auto Collapse414
internal fun PlayerActivity.showV414DrawerAutoCollapse414Toggle() {
    val current = BiliClient.prefs.v414drawerAutoCollapse414
    BiliClient.prefs.v414drawerAutoCollapse414 = !current
    AppToast.show(this, "Drawer Auto Collapse414: ${if (!current) "ON" else "OFF"}")
}

// v414: DRM Auto Detect414
internal fun PlayerActivity.showV414DrmAutoDetect414Toggle() {
    val current = BiliClient.prefs.v414drmAutoDetect414
    BiliClient.prefs.v414drmAutoDetect414 = !current
    AppToast.show(this, "DRM Auto Detect414: ${if (!current) "ON" else "OFF"}")
}

// v414: Duplicate Auto Remove414
internal fun PlayerActivity.showV414DuplicateAutoRemove414Toggle() {
    val current = BiliClient.prefs.v414duplicateAutoRemove414
    BiliClient.prefs.v414duplicateAutoRemove414 = !current
    AppToast.show(this, "Duplicate Auto Remove414: ${if (!current) "ON" else "OFF"}")
}

// v414: Dynamic Island414
internal fun PlayerActivity.showV414DynamicIsland414Toggle() {
    val current = BiliClient.prefs.v414dynamicIsland414
    BiliClient.prefs.v414dynamicIsland414 = !current
    AppToast.show(this, "Dynamic Island414: ${if (!current) "ON" else "OFF"}")
}

// v414: Dynamic Theme Color414
internal fun PlayerActivity.showV414DynamicThemeColor414Toggle() {
    val current = BiliClient.prefs.v414dynamicThemeColor414
    BiliClient.prefs.v414dynamicThemeColor414 = !current
    AppToast.show(this, "Dynamic Theme Color414: ${if (!current) "ON" else "OFF"}")
}

// v414: Edge Touch Reject414
internal fun PlayerActivity.showV414EdgeTouchReject414Toggle() {
    val current = BiliClient.prefs.v414edgeTouchReject414
    BiliClient.prefs.v414edgeTouchReject414 = !current
    AppToast.show(this, "Edge Touch Reject414: ${if (!current) "ON" else "OFF"}")
}

// v414: Embed Subtitle Track414
internal fun PlayerActivity.showV414EmbedSubtitleTrack414Toggle() {
    val current = BiliClient.prefs.v414embedSubtitleTrack414
    BiliClient.prefs.v414embedSubtitleTrack414 = !current
    AppToast.show(this, "Embed Subtitle Track414: ${if (!current) "ON" else "OFF"}")
}

// v414: Encode Auto Select414
internal fun PlayerActivity.showV414EncodeAutoSelect414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v414encodeAutoSelect414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v414encodeAutoSelect414 = value
        AppToast.show(this, "Encode Auto Select414: $value")
    }
}

// v414: Endpoint Auto Switch414
internal fun PlayerActivity.showV414EndpointAutoSwitch414Toggle() {
    val current = BiliClient.prefs.v414endpointAutoSwitch414
    BiliClient.prefs.v414endpointAutoSwitch414 = !current
    AppToast.show(this, "Endpoint Auto Switch414: ${if (!current) "ON" else "OFF"}")
}

// v414: Engine Auto Optimize414
internal fun PlayerActivity.showV414EngineAutoOptimize414Toggle() {
    val current = BiliClient.prefs.v414engineAutoOptimize414
    BiliClient.prefs.v414engineAutoOptimize414 = !current
    AppToast.show(this, "Engine Auto Optimize414: ${if (!current) "ON" else "OFF"}")
}

// v415: Display Refresh Rate415
internal fun PlayerActivity.showV415DisplayRefreshRate415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v415displayRefreshRate415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v415displayRefreshRate415 = value
        AppToast.show(this, "Display Refresh Rate415: $value")
    }
}

// v415: Display Color Temp415
internal fun PlayerActivity.showV415DisplayColorTemp415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v415displayColorTemp415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v415displayColorTemp415 = value
        AppToast.show(this, "Display Color Temp415: $value")
    }
}

// v415: Divider Auto Insert415
internal fun PlayerActivity.showV415DividerAutoInsert415Toggle() {
    val current = BiliClient.prefs.v415dividerAutoInsert415
    BiliClient.prefs.v415dividerAutoInsert415 = !current
    AppToast.show(this, "Divider Auto Insert415: ${if (!current) "ON" else "OFF"}")
}

// v415: Domain Auto Block415
internal fun PlayerActivity.showV415DomainAutoBlock415Toggle() {
    val current = BiliClient.prefs.v415domainAutoBlock415
    BiliClient.prefs.v415domainAutoBlock415 = !current
    AppToast.show(this, "Domain Auto Block415: ${if (!current) "ON" else "OFF"}")
}

// v415: Drag Drop Enabled415
internal fun PlayerActivity.showV415DragDropEnabled415Toggle() {
    val current = BiliClient.prefs.v415dragDropEnabled415
    BiliClient.prefs.v415dragDropEnabled415 = !current
    AppToast.show(this, "Drag Drop Enabled415: ${if (!current) "ON" else "OFF"}")
}

// v415: Drawer Auto Collapse415
internal fun PlayerActivity.showV415DrawerAutoCollapse415Toggle() {
    val current = BiliClient.prefs.v415drawerAutoCollapse415
    BiliClient.prefs.v415drawerAutoCollapse415 = !current
    AppToast.show(this, "Drawer Auto Collapse415: ${if (!current) "ON" else "OFF"}")
}

// v415: DRM Auto Detect415
internal fun PlayerActivity.showV415DrmAutoDetect415Toggle() {
    val current = BiliClient.prefs.v415drmAutoDetect415
    BiliClient.prefs.v415drmAutoDetect415 = !current
    AppToast.show(this, "DRM Auto Detect415: ${if (!current) "ON" else "OFF"}")
}

// v415: Duplicate Auto Remove415
internal fun PlayerActivity.showV415DuplicateAutoRemove415Toggle() {
    val current = BiliClient.prefs.v415duplicateAutoRemove415
    BiliClient.prefs.v415duplicateAutoRemove415 = !current
    AppToast.show(this, "Duplicate Auto Remove415: ${if (!current) "ON" else "OFF"}")
}

// v415: Dynamic Island415
internal fun PlayerActivity.showV415DynamicIsland415Toggle() {
    val current = BiliClient.prefs.v415dynamicIsland415
    BiliClient.prefs.v415dynamicIsland415 = !current
    AppToast.show(this, "Dynamic Island415: ${if (!current) "ON" else "OFF"}")
}

// v415: Dynamic Theme Color415
internal fun PlayerActivity.showV415DynamicThemeColor415Toggle() {
    val current = BiliClient.prefs.v415dynamicThemeColor415
    BiliClient.prefs.v415dynamicThemeColor415 = !current
    AppToast.show(this, "Dynamic Theme Color415: ${if (!current) "ON" else "OFF"}")
}

// v415: Edge Touch Reject415
internal fun PlayerActivity.showV415EdgeTouchReject415Toggle() {
    val current = BiliClient.prefs.v415edgeTouchReject415
    BiliClient.prefs.v415edgeTouchReject415 = !current
    AppToast.show(this, "Edge Touch Reject415: ${if (!current) "ON" else "OFF"}")
}

// v415: Embed Subtitle Track415
internal fun PlayerActivity.showV415EmbedSubtitleTrack415Toggle() {
    val current = BiliClient.prefs.v415embedSubtitleTrack415
    BiliClient.prefs.v415embedSubtitleTrack415 = !current
    AppToast.show(this, "Embed Subtitle Track415: ${if (!current) "ON" else "OFF"}")
}

// v415: Encode Auto Select415
internal fun PlayerActivity.showV415EncodeAutoSelect415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v415encodeAutoSelect415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v415encodeAutoSelect415 = value
        AppToast.show(this, "Encode Auto Select415: $value")
    }
}

// v415: Endpoint Auto Switch415
internal fun PlayerActivity.showV415EndpointAutoSwitch415Toggle() {
    val current = BiliClient.prefs.v415endpointAutoSwitch415
    BiliClient.prefs.v415endpointAutoSwitch415 = !current
    AppToast.show(this, "Endpoint Auto Switch415: ${if (!current) "ON" else "OFF"}")
}

// v415: Engine Auto Optimize415
internal fun PlayerActivity.showV415EngineAutoOptimize415Toggle() {
    val current = BiliClient.prefs.v415engineAutoOptimize415
    BiliClient.prefs.v415engineAutoOptimize415 = !current
    AppToast.show(this, "Engine Auto Optimize415: ${if (!current) "ON" else "OFF"}")
}

// v416: Display Refresh Rate416
internal fun PlayerActivity.showV416DisplayRefreshRate416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v416displayRefreshRate416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v416displayRefreshRate416 = value
        AppToast.show(this, "Display Refresh Rate416: $value")
    }
}

// v416: Display Color Temp416
internal fun PlayerActivity.showV416DisplayColorTemp416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v416displayColorTemp416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v416displayColorTemp416 = value
        AppToast.show(this, "Display Color Temp416: $value")
    }
}

// v416: Divider Auto Insert416
internal fun PlayerActivity.showV416DividerAutoInsert416Toggle() {
    val current = BiliClient.prefs.v416dividerAutoInsert416
    BiliClient.prefs.v416dividerAutoInsert416 = !current
    AppToast.show(this, "Divider Auto Insert416: ${if (!current) "ON" else "OFF"}")
}

// v416: Domain Auto Block416
internal fun PlayerActivity.showV416DomainAutoBlock416Toggle() {
    val current = BiliClient.prefs.v416domainAutoBlock416
    BiliClient.prefs.v416domainAutoBlock416 = !current
    AppToast.show(this, "Domain Auto Block416: ${if (!current) "ON" else "OFF"}")
}

// v416: Drag Drop Enabled416
internal fun PlayerActivity.showV416DragDropEnabled416Toggle() {
    val current = BiliClient.prefs.v416dragDropEnabled416
    BiliClient.prefs.v416dragDropEnabled416 = !current
    AppToast.show(this, "Drag Drop Enabled416: ${if (!current) "ON" else "OFF"}")
}

// v416: Drawer Auto Collapse416
internal fun PlayerActivity.showV416DrawerAutoCollapse416Toggle() {
    val current = BiliClient.prefs.v416drawerAutoCollapse416
    BiliClient.prefs.v416drawerAutoCollapse416 = !current
    AppToast.show(this, "Drawer Auto Collapse416: ${if (!current) "ON" else "OFF"}")
}

// v416: DRM Auto Detect416
internal fun PlayerActivity.showV416DrmAutoDetect416Toggle() {
    val current = BiliClient.prefs.v416drmAutoDetect416
    BiliClient.prefs.v416drmAutoDetect416 = !current
    AppToast.show(this, "DRM Auto Detect416: ${if (!current) "ON" else "OFF"}")
}

// v416: Duplicate Auto Remove416
internal fun PlayerActivity.showV416DuplicateAutoRemove416Toggle() {
    val current = BiliClient.prefs.v416duplicateAutoRemove416
    BiliClient.prefs.v416duplicateAutoRemove416 = !current
    AppToast.show(this, "Duplicate Auto Remove416: ${if (!current) "ON" else "OFF"}")
}

// v416: Dynamic Island416
internal fun PlayerActivity.showV416DynamicIsland416Toggle() {
    val current = BiliClient.prefs.v416dynamicIsland416
    BiliClient.prefs.v416dynamicIsland416 = !current
    AppToast.show(this, "Dynamic Island416: ${if (!current) "ON" else "OFF"}")
}

// v416: Dynamic Theme Color416
internal fun PlayerActivity.showV416DynamicThemeColor416Toggle() {
    val current = BiliClient.prefs.v416dynamicThemeColor416
    BiliClient.prefs.v416dynamicThemeColor416 = !current
    AppToast.show(this, "Dynamic Theme Color416: ${if (!current) "ON" else "OFF"}")
}

// v416: Edge Touch Reject416
internal fun PlayerActivity.showV416EdgeTouchReject416Toggle() {
    val current = BiliClient.prefs.v416edgeTouchReject416
    BiliClient.prefs.v416edgeTouchReject416 = !current
    AppToast.show(this, "Edge Touch Reject416: ${if (!current) "ON" else "OFF"}")
}

// v416: Embed Subtitle Track416
internal fun PlayerActivity.showV416EmbedSubtitleTrack416Toggle() {
    val current = BiliClient.prefs.v416embedSubtitleTrack416
    BiliClient.prefs.v416embedSubtitleTrack416 = !current
    AppToast.show(this, "Embed Subtitle Track416: ${if (!current) "ON" else "OFF"}")
}

// v416: Encode Auto Select416
internal fun PlayerActivity.showV416EncodeAutoSelect416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v416encodeAutoSelect416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v416encodeAutoSelect416 = value
        AppToast.show(this, "Encode Auto Select416: $value")
    }
}

// v416: Endpoint Auto Switch416
internal fun PlayerActivity.showV416EndpointAutoSwitch416Toggle() {
    val current = BiliClient.prefs.v416endpointAutoSwitch416
    BiliClient.prefs.v416endpointAutoSwitch416 = !current
    AppToast.show(this, "Endpoint Auto Switch416: ${if (!current) "ON" else "OFF"}")
}

// v416: Engine Auto Optimize416
internal fun PlayerActivity.showV416EngineAutoOptimize416Toggle() {
    val current = BiliClient.prefs.v416engineAutoOptimize416
    BiliClient.prefs.v416engineAutoOptimize416 = !current
    AppToast.show(this, "Engine Auto Optimize416: ${if (!current) "ON" else "OFF"}")
}

// v417: Display Refresh Rate417
internal fun PlayerActivity.showV417DisplayRefreshRate417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v417displayRefreshRate417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v417displayRefreshRate417 = value
        AppToast.show(this, "Display Refresh Rate417: $value")
    }
}

// v417: Display Color Temp417
internal fun PlayerActivity.showV417DisplayColorTemp417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v417displayColorTemp417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v417displayColorTemp417 = value
        AppToast.show(this, "Display Color Temp417: $value")
    }
}

// v417: Divider Auto Insert417
internal fun PlayerActivity.showV417DividerAutoInsert417Toggle() {
    val current = BiliClient.prefs.v417dividerAutoInsert417
    BiliClient.prefs.v417dividerAutoInsert417 = !current
    AppToast.show(this, "Divider Auto Insert417: ${if (!current) "ON" else "OFF"}")
}

// v417: Domain Auto Block417
internal fun PlayerActivity.showV417DomainAutoBlock417Toggle() {
    val current = BiliClient.prefs.v417domainAutoBlock417
    BiliClient.prefs.v417domainAutoBlock417 = !current
    AppToast.show(this, "Domain Auto Block417: ${if (!current) "ON" else "OFF"}")
}

// v417: Drag Drop Enabled417
internal fun PlayerActivity.showV417DragDropEnabled417Toggle() {
    val current = BiliClient.prefs.v417dragDropEnabled417
    BiliClient.prefs.v417dragDropEnabled417 = !current
    AppToast.show(this, "Drag Drop Enabled417: ${if (!current) "ON" else "OFF"}")
}

// v417: Drawer Auto Collapse417
internal fun PlayerActivity.showV417DrawerAutoCollapse417Toggle() {
    val current = BiliClient.prefs.v417drawerAutoCollapse417
    BiliClient.prefs.v417drawerAutoCollapse417 = !current
    AppToast.show(this, "Drawer Auto Collapse417: ${if (!current) "ON" else "OFF"}")
}

// v417: DRM Auto Detect417
internal fun PlayerActivity.showV417DrmAutoDetect417Toggle() {
    val current = BiliClient.prefs.v417drmAutoDetect417
    BiliClient.prefs.v417drmAutoDetect417 = !current
    AppToast.show(this, "DRM Auto Detect417: ${if (!current) "ON" else "OFF"}")
}

// v417: Duplicate Auto Remove417
internal fun PlayerActivity.showV417DuplicateAutoRemove417Toggle() {
    val current = BiliClient.prefs.v417duplicateAutoRemove417
    BiliClient.prefs.v417duplicateAutoRemove417 = !current
    AppToast.show(this, "Duplicate Auto Remove417: ${if (!current) "ON" else "OFF"}")
}

// v417: Dynamic Island417
internal fun PlayerActivity.showV417DynamicIsland417Toggle() {
    val current = BiliClient.prefs.v417dynamicIsland417
    BiliClient.prefs.v417dynamicIsland417 = !current
    AppToast.show(this, "Dynamic Island417: ${if (!current) "ON" else "OFF"}")
}

// v417: Dynamic Theme Color417
internal fun PlayerActivity.showV417DynamicThemeColor417Toggle() {
    val current = BiliClient.prefs.v417dynamicThemeColor417
    BiliClient.prefs.v417dynamicThemeColor417 = !current
    AppToast.show(this, "Dynamic Theme Color417: ${if (!current) "ON" else "OFF"}")
}

// v417: Edge Touch Reject417
internal fun PlayerActivity.showV417EdgeTouchReject417Toggle() {
    val current = BiliClient.prefs.v417edgeTouchReject417
    BiliClient.prefs.v417edgeTouchReject417 = !current
    AppToast.show(this, "Edge Touch Reject417: ${if (!current) "ON" else "OFF"}")
}

// v417: Embed Subtitle Track417
internal fun PlayerActivity.showV417EmbedSubtitleTrack417Toggle() {
    val current = BiliClient.prefs.v417embedSubtitleTrack417
    BiliClient.prefs.v417embedSubtitleTrack417 = !current
    AppToast.show(this, "Embed Subtitle Track417: ${if (!current) "ON" else "OFF"}")
}

// v417: Encode Auto Select417
internal fun PlayerActivity.showV417EncodeAutoSelect417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v417encodeAutoSelect417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v417encodeAutoSelect417 = value
        AppToast.show(this, "Encode Auto Select417: $value")
    }
}

// v417: Endpoint Auto Switch417
internal fun PlayerActivity.showV417EndpointAutoSwitch417Toggle() {
    val current = BiliClient.prefs.v417endpointAutoSwitch417
    BiliClient.prefs.v417endpointAutoSwitch417 = !current
    AppToast.show(this, "Endpoint Auto Switch417: ${if (!current) "ON" else "OFF"}")
}

// v417: Engine Auto Optimize417
internal fun PlayerActivity.showV417EngineAutoOptimize417Toggle() {
    val current = BiliClient.prefs.v417engineAutoOptimize417
    BiliClient.prefs.v417engineAutoOptimize417 = !current
    AppToast.show(this, "Engine Auto Optimize417: ${if (!current) "ON" else "OFF"}")
}

// v418: Display Refresh Rate418
internal fun PlayerActivity.showV418DisplayRefreshRate418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v418displayRefreshRate418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v418displayRefreshRate418 = value
        AppToast.show(this, "Display Refresh Rate418: $value")
    }
}

// v418: Display Color Temp418
internal fun PlayerActivity.showV418DisplayColorTemp418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v418displayColorTemp418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v418displayColorTemp418 = value
        AppToast.show(this, "Display Color Temp418: $value")
    }
}

// v418: Divider Auto Insert418
internal fun PlayerActivity.showV418DividerAutoInsert418Toggle() {
    val current = BiliClient.prefs.v418dividerAutoInsert418
    BiliClient.prefs.v418dividerAutoInsert418 = !current
    AppToast.show(this, "Divider Auto Insert418: ${if (!current) "ON" else "OFF"}")
}

// v418: Domain Auto Block418
internal fun PlayerActivity.showV418DomainAutoBlock418Toggle() {
    val current = BiliClient.prefs.v418domainAutoBlock418
    BiliClient.prefs.v418domainAutoBlock418 = !current
    AppToast.show(this, "Domain Auto Block418: ${if (!current) "ON" else "OFF"}")
}

// v418: Drag Drop Enabled418
internal fun PlayerActivity.showV418DragDropEnabled418Toggle() {
    val current = BiliClient.prefs.v418dragDropEnabled418
    BiliClient.prefs.v418dragDropEnabled418 = !current
    AppToast.show(this, "Drag Drop Enabled418: ${if (!current) "ON" else "OFF"}")
}

// v418: Drawer Auto Collapse418
internal fun PlayerActivity.showV418DrawerAutoCollapse418Toggle() {
    val current = BiliClient.prefs.v418drawerAutoCollapse418
    BiliClient.prefs.v418drawerAutoCollapse418 = !current
    AppToast.show(this, "Drawer Auto Collapse418: ${if (!current) "ON" else "OFF"}")
}

// v418: DRM Auto Detect418
internal fun PlayerActivity.showV418DrmAutoDetect418Toggle() {
    val current = BiliClient.prefs.v418drmAutoDetect418
    BiliClient.prefs.v418drmAutoDetect418 = !current
    AppToast.show(this, "DRM Auto Detect418: ${if (!current) "ON" else "OFF"}")
}

// v418: Duplicate Auto Remove418
internal fun PlayerActivity.showV418DuplicateAutoRemove418Toggle() {
    val current = BiliClient.prefs.v418duplicateAutoRemove418
    BiliClient.prefs.v418duplicateAutoRemove418 = !current
    AppToast.show(this, "Duplicate Auto Remove418: ${if (!current) "ON" else "OFF"}")
}

// v418: Dynamic Island418
internal fun PlayerActivity.showV418DynamicIsland418Toggle() {
    val current = BiliClient.prefs.v418dynamicIsland418
    BiliClient.prefs.v418dynamicIsland418 = !current
    AppToast.show(this, "Dynamic Island418: ${if (!current) "ON" else "OFF"}")
}

// v418: Dynamic Theme Color418
internal fun PlayerActivity.showV418DynamicThemeColor418Toggle() {
    val current = BiliClient.prefs.v418dynamicThemeColor418
    BiliClient.prefs.v418dynamicThemeColor418 = !current
    AppToast.show(this, "Dynamic Theme Color418: ${if (!current) "ON" else "OFF"}")
}

// v418: Edge Touch Reject418
internal fun PlayerActivity.showV418EdgeTouchReject418Toggle() {
    val current = BiliClient.prefs.v418edgeTouchReject418
    BiliClient.prefs.v418edgeTouchReject418 = !current
    AppToast.show(this, "Edge Touch Reject418: ${if (!current) "ON" else "OFF"}")
}

// v418: Embed Subtitle Track418
internal fun PlayerActivity.showV418EmbedSubtitleTrack418Toggle() {
    val current = BiliClient.prefs.v418embedSubtitleTrack418
    BiliClient.prefs.v418embedSubtitleTrack418 = !current
    AppToast.show(this, "Embed Subtitle Track418: ${if (!current) "ON" else "OFF"}")
}

// v418: Encode Auto Select418
internal fun PlayerActivity.showV418EncodeAutoSelect418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v418encodeAutoSelect418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v418encodeAutoSelect418 = value
        AppToast.show(this, "Encode Auto Select418: $value")
    }
}

// v418: Endpoint Auto Switch418
internal fun PlayerActivity.showV418EndpointAutoSwitch418Toggle() {
    val current = BiliClient.prefs.v418endpointAutoSwitch418
    BiliClient.prefs.v418endpointAutoSwitch418 = !current
    AppToast.show(this, "Endpoint Auto Switch418: ${if (!current) "ON" else "OFF"}")
}

// v418: Engine Auto Optimize418
internal fun PlayerActivity.showV418EngineAutoOptimize418Toggle() {
    val current = BiliClient.prefs.v418engineAutoOptimize418
    BiliClient.prefs.v418engineAutoOptimize418 = !current
    AppToast.show(this, "Engine Auto Optimize418: ${if (!current) "ON" else "OFF"}")
}

// v419: Display Refresh Rate419
internal fun PlayerActivity.showV419DisplayRefreshRate419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v419displayRefreshRate419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v419displayRefreshRate419 = value
        AppToast.show(this, "Display Refresh Rate419: $value")
    }
}

// v419: Display Color Temp419
internal fun PlayerActivity.showV419DisplayColorTemp419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v419displayColorTemp419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v419displayColorTemp419 = value
        AppToast.show(this, "Display Color Temp419: $value")
    }
}

// v419: Divider Auto Insert419
internal fun PlayerActivity.showV419DividerAutoInsert419Toggle() {
    val current = BiliClient.prefs.v419dividerAutoInsert419
    BiliClient.prefs.v419dividerAutoInsert419 = !current
    AppToast.show(this, "Divider Auto Insert419: ${if (!current) "ON" else "OFF"}")
}

// v419: Domain Auto Block419
internal fun PlayerActivity.showV419DomainAutoBlock419Toggle() {
    val current = BiliClient.prefs.v419domainAutoBlock419
    BiliClient.prefs.v419domainAutoBlock419 = !current
    AppToast.show(this, "Domain Auto Block419: ${if (!current) "ON" else "OFF"}")
}

// v419: Drag Drop Enabled419
internal fun PlayerActivity.showV419DragDropEnabled419Toggle() {
    val current = BiliClient.prefs.v419dragDropEnabled419
    BiliClient.prefs.v419dragDropEnabled419 = !current
    AppToast.show(this, "Drag Drop Enabled419: ${if (!current) "ON" else "OFF"}")
}

// v419: Drawer Auto Collapse419
internal fun PlayerActivity.showV419DrawerAutoCollapse419Toggle() {
    val current = BiliClient.prefs.v419drawerAutoCollapse419
    BiliClient.prefs.v419drawerAutoCollapse419 = !current
    AppToast.show(this, "Drawer Auto Collapse419: ${if (!current) "ON" else "OFF"}")
}

// v419: DRM Auto Detect419
internal fun PlayerActivity.showV419DrmAutoDetect419Toggle() {
    val current = BiliClient.prefs.v419drmAutoDetect419
    BiliClient.prefs.v419drmAutoDetect419 = !current
    AppToast.show(this, "DRM Auto Detect419: ${if (!current) "ON" else "OFF"}")
}

// v419: Duplicate Auto Remove419
internal fun PlayerActivity.showV419DuplicateAutoRemove419Toggle() {
    val current = BiliClient.prefs.v419duplicateAutoRemove419
    BiliClient.prefs.v419duplicateAutoRemove419 = !current
    AppToast.show(this, "Duplicate Auto Remove419: ${if (!current) "ON" else "OFF"}")
}

// v419: Dynamic Island419
internal fun PlayerActivity.showV419DynamicIsland419Toggle() {
    val current = BiliClient.prefs.v419dynamicIsland419
    BiliClient.prefs.v419dynamicIsland419 = !current
    AppToast.show(this, "Dynamic Island419: ${if (!current) "ON" else "OFF"}")
}

// v419: Dynamic Theme Color419
internal fun PlayerActivity.showV419DynamicThemeColor419Toggle() {
    val current = BiliClient.prefs.v419dynamicThemeColor419
    BiliClient.prefs.v419dynamicThemeColor419 = !current
    AppToast.show(this, "Dynamic Theme Color419: ${if (!current) "ON" else "OFF"}")
}

// v419: Edge Touch Reject419
internal fun PlayerActivity.showV419EdgeTouchReject419Toggle() {
    val current = BiliClient.prefs.v419edgeTouchReject419
    BiliClient.prefs.v419edgeTouchReject419 = !current
    AppToast.show(this, "Edge Touch Reject419: ${if (!current) "ON" else "OFF"}")
}

// v419: Embed Subtitle Track419
internal fun PlayerActivity.showV419EmbedSubtitleTrack419Toggle() {
    val current = BiliClient.prefs.v419embedSubtitleTrack419
    BiliClient.prefs.v419embedSubtitleTrack419 = !current
    AppToast.show(this, "Embed Subtitle Track419: ${if (!current) "ON" else "OFF"}")
}

// v419: Encode Auto Select419
internal fun PlayerActivity.showV419EncodeAutoSelect419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v419encodeAutoSelect419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v419encodeAutoSelect419 = value
        AppToast.show(this, "Encode Auto Select419: $value")
    }
}

// v419: Endpoint Auto Switch419
internal fun PlayerActivity.showV419EndpointAutoSwitch419Toggle() {
    val current = BiliClient.prefs.v419endpointAutoSwitch419
    BiliClient.prefs.v419endpointAutoSwitch419 = !current
    AppToast.show(this, "Endpoint Auto Switch419: ${if (!current) "ON" else "OFF"}")
}

// v419: Engine Auto Optimize419
internal fun PlayerActivity.showV419EngineAutoOptimize419Toggle() {
    val current = BiliClient.prefs.v419engineAutoOptimize419
    BiliClient.prefs.v419engineAutoOptimize419 = !current
    AppToast.show(this, "Engine Auto Optimize419: ${if (!current) "ON" else "OFF"}")
}

// v420: Display Refresh Rate420
internal fun PlayerActivity.showV420DisplayRefreshRate420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v420displayRefreshRate420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Refresh Rate420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v420displayRefreshRate420 = value
        AppToast.show(this, "Display Refresh Rate420: $value")
    }
}

// v420: Display Color Temp420
internal fun PlayerActivity.showV420DisplayColorTemp420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v420displayColorTemp420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Display Color Temp420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v420displayColorTemp420 = value
        AppToast.show(this, "Display Color Temp420: $value")
    }
}

// v420: Divider Auto Insert420
internal fun PlayerActivity.showV420DividerAutoInsert420Toggle() {
    val current = BiliClient.prefs.v420dividerAutoInsert420
    BiliClient.prefs.v420dividerAutoInsert420 = !current
    AppToast.show(this, "Divider Auto Insert420: ${if (!current) "ON" else "OFF"}")
}

// v420: Domain Auto Block420
internal fun PlayerActivity.showV420DomainAutoBlock420Toggle() {
    val current = BiliClient.prefs.v420domainAutoBlock420
    BiliClient.prefs.v420domainAutoBlock420 = !current
    AppToast.show(this, "Domain Auto Block420: ${if (!current) "ON" else "OFF"}")
}

// v420: Drag Drop Enabled420
internal fun PlayerActivity.showV420DragDropEnabled420Toggle() {
    val current = BiliClient.prefs.v420dragDropEnabled420
    BiliClient.prefs.v420dragDropEnabled420 = !current
    AppToast.show(this, "Drag Drop Enabled420: ${if (!current) "ON" else "OFF"}")
}

// v420: Drawer Auto Collapse420
internal fun PlayerActivity.showV420DrawerAutoCollapse420Toggle() {
    val current = BiliClient.prefs.v420drawerAutoCollapse420
    BiliClient.prefs.v420drawerAutoCollapse420 = !current
    AppToast.show(this, "Drawer Auto Collapse420: ${if (!current) "ON" else "OFF"}")
}

// v420: DRM Auto Detect420
internal fun PlayerActivity.showV420DrmAutoDetect420Toggle() {
    val current = BiliClient.prefs.v420drmAutoDetect420
    BiliClient.prefs.v420drmAutoDetect420 = !current
    AppToast.show(this, "DRM Auto Detect420: ${if (!current) "ON" else "OFF"}")
}

// v420: Duplicate Auto Remove420
internal fun PlayerActivity.showV420DuplicateAutoRemove420Toggle() {
    val current = BiliClient.prefs.v420duplicateAutoRemove420
    BiliClient.prefs.v420duplicateAutoRemove420 = !current
    AppToast.show(this, "Duplicate Auto Remove420: ${if (!current) "ON" else "OFF"}")
}

// v420: Dynamic Island420
internal fun PlayerActivity.showV420DynamicIsland420Toggle() {
    val current = BiliClient.prefs.v420dynamicIsland420
    BiliClient.prefs.v420dynamicIsland420 = !current
    AppToast.show(this, "Dynamic Island420: ${if (!current) "ON" else "OFF"}")
}

// v420: Dynamic Theme Color420
internal fun PlayerActivity.showV420DynamicThemeColor420Toggle() {
    val current = BiliClient.prefs.v420dynamicThemeColor420
    BiliClient.prefs.v420dynamicThemeColor420 = !current
    AppToast.show(this, "Dynamic Theme Color420: ${if (!current) "ON" else "OFF"}")
}

// v420: Edge Touch Reject420
internal fun PlayerActivity.showV420EdgeTouchReject420Toggle() {
    val current = BiliClient.prefs.v420edgeTouchReject420
    BiliClient.prefs.v420edgeTouchReject420 = !current
    AppToast.show(this, "Edge Touch Reject420: ${if (!current) "ON" else "OFF"}")
}

// v420: Embed Subtitle Track420
internal fun PlayerActivity.showV420EmbedSubtitleTrack420Toggle() {
    val current = BiliClient.prefs.v420embedSubtitleTrack420
    BiliClient.prefs.v420embedSubtitleTrack420 = !current
    AppToast.show(this, "Embed Subtitle Track420: ${if (!current) "ON" else "OFF"}")
}

// v420: Encode Auto Select420
internal fun PlayerActivity.showV420EncodeAutoSelect420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v420encodeAutoSelect420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Encode Auto Select420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v420encodeAutoSelect420 = value
        AppToast.show(this, "Encode Auto Select420: $value")
    }
}

// v420: Endpoint Auto Switch420
internal fun PlayerActivity.showV420EndpointAutoSwitch420Toggle() {
    val current = BiliClient.prefs.v420endpointAutoSwitch420
    BiliClient.prefs.v420endpointAutoSwitch420 = !current
    AppToast.show(this, "Endpoint Auto Switch420: ${if (!current) "ON" else "OFF"}")
}

// v420: Engine Auto Optimize420
internal fun PlayerActivity.showV420EngineAutoOptimize420Toggle() {
    val current = BiliClient.prefs.v420engineAutoOptimize420
    BiliClient.prefs.v420engineAutoOptimize420 = !current
    AppToast.show(this, "Engine Auto Optimize420: ${if (!current) "ON" else "OFF"}")
}

// v421: Enter Animation421
internal fun PlayerActivity.showV421EnterAnimation421Toggle() {
    val current = BiliClient.prefs.v421enterAnimation421
    BiliClient.prefs.v421enterAnimation421 = !current
    AppToast.show(this, "Enter Animation421: ${if (!current) "ON" else "OFF"}")
}

// v421: Environment Light Sensor421
internal fun PlayerActivity.showV421EnvironmentLightSensor421Toggle() {
    val current = BiliClient.prefs.v421environmentLightSensor421
    BiliClient.prefs.v421environmentLightSensor421 = !current
    AppToast.show(this, "Environment Light Sensor421: ${if (!current) "ON" else "OFF"}")
}

// v421: Error Auto Retry421
internal fun PlayerActivity.showV421ErrorAutoRetry421Toggle() {
    val current = BiliClient.prefs.v421errorAutoRetry421
    BiliClient.prefs.v421errorAutoRetry421 = !current
    AppToast.show(this, "Error Auto Retry421: ${if (!current) "ON" else "OFF"}")
}

// v421: Error Report Auto421
internal fun PlayerActivity.showV421ErrorReportAuto421Toggle() {
    val current = BiliClient.prefs.v421errorReportAuto421
    BiliClient.prefs.v421errorReportAuto421 = !current
    AppToast.show(this, "Error Report Auto421: ${if (!current) "ON" else "OFF"}")
}

// v421: Event Auto Notify421
internal fun PlayerActivity.showV421EventAutoNotify421Toggle() {
    val current = BiliClient.prefs.v421eventAutoNotify421
    BiliClient.prefs.v421eventAutoNotify421 = !current
    AppToast.show(this, "Event Auto Notify421: ${if (!current) "ON" else "OFF"}")
}

// v421: Exit Confirmation421
internal fun PlayerActivity.showV421ExitConfirmation421Toggle() {
    val current = BiliClient.prefs.v421exitConfirmation421
    BiliClient.prefs.v421exitConfirmation421 = !current
    AppToast.show(this, "Exit Confirmation421: ${if (!current) "ON" else "OFF"}")
}

// v421: Expand On Double Tap421
internal fun PlayerActivity.showV421ExpandOnDoubleTap421Toggle() {
    val current = BiliClient.prefs.v421expandOnDoubleTap421
    BiliClient.prefs.v421expandOnDoubleTap421 = !current
    AppToast.show(this, "Expand On Double Tap421: ${if (!current) "ON" else "OFF"}")
}

// v421: Export Format Default421
internal fun PlayerActivity.showV421ExportFormatDefault421Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v421exportFormatDefault421).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default421",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v421exportFormatDefault421 = value
        AppToast.show(this, "Export Format Default421: $value")
    }
}

// v421: Extract Audio Auto421
internal fun PlayerActivity.showV421ExtractAudioAuto421Toggle() {
    val current = BiliClient.prefs.v421extractAudioAuto421
    BiliClient.prefs.v421extractAudioAuto421 = !current
    AppToast.show(this, "Extract Audio Auto421: ${if (!current) "ON" else "OFF"}")
}

// v421: Fade Transition421
internal fun PlayerActivity.showV421FadeTransition421Toggle() {
    val current = BiliClient.prefs.v421fadeTransition421
    BiliClient.prefs.v421fadeTransition421 = !current
    AppToast.show(this, "Fade Transition421: ${if (!current) "ON" else "OFF"}")
}

// v421: Feed Auto Refresh421
internal fun PlayerActivity.showV421FeedAutoRefresh421Toggle() {
    val current = BiliClient.prefs.v421feedAutoRefresh421
    BiliClient.prefs.v421feedAutoRefresh421 = !current
    AppToast.show(this, "Feed Auto Refresh421: ${if (!current) "ON" else "OFF"}")
}

// v421: Feed Layout Style421
internal fun PlayerActivity.showV421FeedLayoutStyle421Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v421feedLayoutStyle421).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style421",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v421feedLayoutStyle421 = value
        AppToast.show(this, "Feed Layout Style421: $value")
    }
}

// v421: File Auto Organize421
internal fun PlayerActivity.showV421FileAutoOrganize421Toggle() {
    val current = BiliClient.prefs.v421fileAutoOrganize421
    BiliClient.prefs.v421fileAutoOrganize421 = !current
    AppToast.show(this, "File Auto Organize421: ${if (!current) "ON" else "OFF"}")
}

// v421: Find In Page Highlight421
internal fun PlayerActivity.showV421FindInPageHighlight421Toggle() {
    val current = BiliClient.prefs.v421findInPageHighlight421
    BiliClient.prefs.v421findInPageHighlight421 = !current
    AppToast.show(this, "Find In Page Highlight421: ${if (!current) "ON" else "OFF"}")
}

// v421: Fix Corrupt Auto421
internal fun PlayerActivity.showV421FixCorruptAuto421Toggle() {
    val current = BiliClient.prefs.v421fixCorruptAuto421
    BiliClient.prefs.v421fixCorruptAuto421 = !current
    AppToast.show(this, "Fix Corrupt Auto421: ${if (!current) "ON" else "OFF"}")
}

// v422: Enter Animation422
internal fun PlayerActivity.showV422EnterAnimation422Toggle() {
    val current = BiliClient.prefs.v422enterAnimation422
    BiliClient.prefs.v422enterAnimation422 = !current
    AppToast.show(this, "Enter Animation422: ${if (!current) "ON" else "OFF"}")
}

// v422: Environment Light Sensor422
internal fun PlayerActivity.showV422EnvironmentLightSensor422Toggle() {
    val current = BiliClient.prefs.v422environmentLightSensor422
    BiliClient.prefs.v422environmentLightSensor422 = !current
    AppToast.show(this, "Environment Light Sensor422: ${if (!current) "ON" else "OFF"}")
}

// v422: Error Auto Retry422
internal fun PlayerActivity.showV422ErrorAutoRetry422Toggle() {
    val current = BiliClient.prefs.v422errorAutoRetry422
    BiliClient.prefs.v422errorAutoRetry422 = !current
    AppToast.show(this, "Error Auto Retry422: ${if (!current) "ON" else "OFF"}")
}

// v422: Error Report Auto422
internal fun PlayerActivity.showV422ErrorReportAuto422Toggle() {
    val current = BiliClient.prefs.v422errorReportAuto422
    BiliClient.prefs.v422errorReportAuto422 = !current
    AppToast.show(this, "Error Report Auto422: ${if (!current) "ON" else "OFF"}")
}

// v422: Event Auto Notify422
internal fun PlayerActivity.showV422EventAutoNotify422Toggle() {
    val current = BiliClient.prefs.v422eventAutoNotify422
    BiliClient.prefs.v422eventAutoNotify422 = !current
    AppToast.show(this, "Event Auto Notify422: ${if (!current) "ON" else "OFF"}")
}

// v422: Exit Confirmation422
internal fun PlayerActivity.showV422ExitConfirmation422Toggle() {
    val current = BiliClient.prefs.v422exitConfirmation422
    BiliClient.prefs.v422exitConfirmation422 = !current
    AppToast.show(this, "Exit Confirmation422: ${if (!current) "ON" else "OFF"}")
}

// v422: Expand On Double Tap422
internal fun PlayerActivity.showV422ExpandOnDoubleTap422Toggle() {
    val current = BiliClient.prefs.v422expandOnDoubleTap422
    BiliClient.prefs.v422expandOnDoubleTap422 = !current
    AppToast.show(this, "Expand On Double Tap422: ${if (!current) "ON" else "OFF"}")
}

// v422: Export Format Default422
internal fun PlayerActivity.showV422ExportFormatDefault422Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v422exportFormatDefault422).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default422",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v422exportFormatDefault422 = value
        AppToast.show(this, "Export Format Default422: $value")
    }
}

// v422: Extract Audio Auto422
internal fun PlayerActivity.showV422ExtractAudioAuto422Toggle() {
    val current = BiliClient.prefs.v422extractAudioAuto422
    BiliClient.prefs.v422extractAudioAuto422 = !current
    AppToast.show(this, "Extract Audio Auto422: ${if (!current) "ON" else "OFF"}")
}

// v422: Fade Transition422
internal fun PlayerActivity.showV422FadeTransition422Toggle() {
    val current = BiliClient.prefs.v422fadeTransition422
    BiliClient.prefs.v422fadeTransition422 = !current
    AppToast.show(this, "Fade Transition422: ${if (!current) "ON" else "OFF"}")
}

// v422: Feed Auto Refresh422
internal fun PlayerActivity.showV422FeedAutoRefresh422Toggle() {
    val current = BiliClient.prefs.v422feedAutoRefresh422
    BiliClient.prefs.v422feedAutoRefresh422 = !current
    AppToast.show(this, "Feed Auto Refresh422: ${if (!current) "ON" else "OFF"}")
}

// v422: Feed Layout Style422
internal fun PlayerActivity.showV422FeedLayoutStyle422Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v422feedLayoutStyle422).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style422",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v422feedLayoutStyle422 = value
        AppToast.show(this, "Feed Layout Style422: $value")
    }
}

// v422: File Auto Organize422
internal fun PlayerActivity.showV422FileAutoOrganize422Toggle() {
    val current = BiliClient.prefs.v422fileAutoOrganize422
    BiliClient.prefs.v422fileAutoOrganize422 = !current
    AppToast.show(this, "File Auto Organize422: ${if (!current) "ON" else "OFF"}")
}

// v422: Find In Page Highlight422
internal fun PlayerActivity.showV422FindInPageHighlight422Toggle() {
    val current = BiliClient.prefs.v422findInPageHighlight422
    BiliClient.prefs.v422findInPageHighlight422 = !current
    AppToast.show(this, "Find In Page Highlight422: ${if (!current) "ON" else "OFF"}")
}

// v422: Fix Corrupt Auto422
internal fun PlayerActivity.showV422FixCorruptAuto422Toggle() {
    val current = BiliClient.prefs.v422fixCorruptAuto422
    BiliClient.prefs.v422fixCorruptAuto422 = !current
    AppToast.show(this, "Fix Corrupt Auto422: ${if (!current) "ON" else "OFF"}")
}

// v423: Enter Animation423
internal fun PlayerActivity.showV423EnterAnimation423Toggle() {
    val current = BiliClient.prefs.v423enterAnimation423
    BiliClient.prefs.v423enterAnimation423 = !current
    AppToast.show(this, "Enter Animation423: ${if (!current) "ON" else "OFF"}")
}

// v423: Environment Light Sensor423
internal fun PlayerActivity.showV423EnvironmentLightSensor423Toggle() {
    val current = BiliClient.prefs.v423environmentLightSensor423
    BiliClient.prefs.v423environmentLightSensor423 = !current
    AppToast.show(this, "Environment Light Sensor423: ${if (!current) "ON" else "OFF"}")
}

// v423: Error Auto Retry423
internal fun PlayerActivity.showV423ErrorAutoRetry423Toggle() {
    val current = BiliClient.prefs.v423errorAutoRetry423
    BiliClient.prefs.v423errorAutoRetry423 = !current
    AppToast.show(this, "Error Auto Retry423: ${if (!current) "ON" else "OFF"}")
}

