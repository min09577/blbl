package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

// v449: Hot Reload Enabled449
internal fun PlayerActivity.showV449HotReloadEnabled449Toggle() {
    val current = BiliClient.prefs.v449hotReloadEnabled449
    BiliClient.prefs.v449hotReloadEnabled449 = !current
    AppToast.show(this, "Hot Reload Enabled449: ${if (!current) "ON" else "OFF"}")
}

// v449: Hub Auto Discover449
internal fun PlayerActivity.showV449HubAutoDiscover449Toggle() {
    val current = BiliClient.prefs.v449hubAutoDiscover449
    BiliClient.prefs.v449hubAutoDiscover449 = !current
    AppToast.show(this, "Hub Auto Discover449: ${if (!current) "ON" else "OFF"}")
}

// v450: Gate Auto Auth450
internal fun PlayerActivity.showV450GateAutoAuth450Toggle() {
    val current = BiliClient.prefs.v450gateAutoAuth450
    BiliClient.prefs.v450gateAutoAuth450 = !current
    AppToast.show(this, "Gate Auto Auth450: ${if (!current) "ON" else "OFF"}")
}

// v450: Global Sync Enabled450
internal fun PlayerActivity.showV450GlobalSyncEnabled450Toggle() {
    val current = BiliClient.prefs.v450globalSyncEnabled450
    BiliClient.prefs.v450globalSyncEnabled450 = !current
    AppToast.show(this, "Global Sync Enabled450: ${if (!current) "ON" else "OFF"}")
}

// v450: Group Auto Create450
internal fun PlayerActivity.showV450GroupAutoCreate450Toggle() {
    val current = BiliClient.prefs.v450groupAutoCreate450
    BiliClient.prefs.v450groupAutoCreate450 = !current
    AppToast.show(this, "Group Auto Create450: ${if (!current) "ON" else "OFF"}")
}

// v450: Grow Shrink Enabled450
internal fun PlayerActivity.showV450GrowShrinkEnabled450Toggle() {
    val current = BiliClient.prefs.v450growShrinkEnabled450
    BiliClient.prefs.v450growShrinkEnabled450 = !current
    AppToast.show(this, "Grow Shrink Enabled450: ${if (!current) "ON" else "OFF"}")
}

// v450: Guide Auto Show450
internal fun PlayerActivity.showV450GuideAutoShow450Toggle() {
    val current = BiliClient.prefs.v450guideAutoShow450
    BiliClient.prefs.v450guideAutoShow450 = !current
    AppToast.show(this, "Guide Auto Show450: ${if (!current) "ON" else "OFF"}")
}

// v450: Hang Detection Ms450
internal fun PlayerActivity.showV450HangDetectionMs450Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v450hangDetectionMs450).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms450",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v450hangDetectionMs450 = value
        AppToast.show(this, "Hang Detection Ms450: $value")
    }
}

// v450: Hash Verify Auto450
internal fun PlayerActivity.showV450HashVerifyAuto450Toggle() {
    val current = BiliClient.prefs.v450hashVerifyAuto450
    BiliClient.prefs.v450hashVerifyAuto450 = !current
    AppToast.show(this, "Hash Verify Auto450: ${if (!current) "ON" else "OFF"}")
}

// v450: HeadPhone Auto Pause450
internal fun PlayerActivity.showV450HeadPhoneAutoPause450Toggle() {
    val current = BiliClient.prefs.v450headPhoneAutoPause450
    BiliClient.prefs.v450headPhoneAutoPause450 = !current
    AppToast.show(this, "HeadPhone Auto Pause450: ${if (!current) "ON" else "OFF"}")
}

// v450: Heart Beat Interval450
internal fun PlayerActivity.showV450HeartBeatInterval450Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v450heartBeatInterval450).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval450",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v450heartBeatInterval450 = value
        AppToast.show(this, "Heart Beat Interval450: $value")
    }
}

// v450: Heat Monitor Enabled450
internal fun PlayerActivity.showV450HeatMonitorEnabled450Toggle() {
    val current = BiliClient.prefs.v450heatMonitorEnabled450
    BiliClient.prefs.v450heatMonitorEnabled450 = !current
    AppToast.show(this, "Heat Monitor Enabled450: ${if (!current) "ON" else "OFF"}")
}

// v450: Hide On Scroll450
internal fun PlayerActivity.showV450HideOnScroll450Toggle() {
    val current = BiliClient.prefs.v450hideOnScroll450
    BiliClient.prefs.v450hideOnScroll450 = !current
    AppToast.show(this, "Hide On Scroll450: ${if (!current) "ON" else "OFF"}")
}

// v450: Hold To Fast Forward450
internal fun PlayerActivity.showV450HoldToFastForward450Toggle() {
    val current = BiliClient.prefs.v450holdToFastForward450
    BiliClient.prefs.v450holdToFastForward450 = !current
    AppToast.show(this, "Hold To Fast Forward450: ${if (!current) "ON" else "OFF"}")
}

// v450: Hook Auto Register450
internal fun PlayerActivity.showV450HookAutoRegister450Toggle() {
    val current = BiliClient.prefs.v450hookAutoRegister450
    BiliClient.prefs.v450hookAutoRegister450 = !current
    AppToast.show(this, "Hook Auto Register450: ${if (!current) "ON" else "OFF"}")
}

// v450: Hot Reload Enabled450
internal fun PlayerActivity.showV450HotReloadEnabled450Toggle() {
    val current = BiliClient.prefs.v450hotReloadEnabled450
    BiliClient.prefs.v450hotReloadEnabled450 = !current
    AppToast.show(this, "Hot Reload Enabled450: ${if (!current) "ON" else "OFF"}")
}

// v450: Hub Auto Discover450
internal fun PlayerActivity.showV450HubAutoDiscover450Toggle() {
    val current = BiliClient.prefs.v450hubAutoDiscover450
    BiliClient.prefs.v450hubAutoDiscover450 = !current
    AppToast.show(this, "Hub Auto Discover450: ${if (!current) "ON" else "OFF"}")
}

// v451: Hybrid Mode Enabled451
internal fun PlayerActivity.showV451HybridModeEnabled451Toggle() {
    val current = BiliClient.prefs.v451hybridModeEnabled451
    BiliClient.prefs.v451hybridModeEnabled451 = !current
    AppToast.show(this, "Hybrid Mode Enabled451: ${if (!current) "ON" else "OFF"}")
}

// v451: Icon Pack Custom451
internal fun PlayerActivity.showV451IconPackCustom451Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v451iconPackCustom451).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom451",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v451iconPackCustom451 = value
        AppToast.show(this, "Icon Pack Custom451: $value")
    }
}

// v451: Idle Screen Saver451
internal fun PlayerActivity.showV451IdleScreenSaver451Toggle() {
    val current = BiliClient.prefs.v451idleScreenSaver451
    BiliClient.prefs.v451idleScreenSaver451 = !current
    AppToast.show(this, "Idle Screen Saver451: ${if (!current) "ON" else "OFF"}")
}

// v451: Import Auto Merge451
internal fun PlayerActivity.showV451ImportAutoMerge451Toggle() {
    val current = BiliClient.prefs.v451importAutoMerge451
    BiliClient.prefs.v451importAutoMerge451 = !current
    AppToast.show(this, "Import Auto Merge451: ${if (!current) "ON" else "OFF"}")
}

// v451: Index Auto Rebuild451
internal fun PlayerActivity.showV451IndexAutoRebuild451Toggle() {
    val current = BiliClient.prefs.v451indexAutoRebuild451
    BiliClient.prefs.v451indexAutoRebuild451 = !current
    AppToast.show(this, "Index Auto Rebuild451: ${if (!current) "ON" else "OFF"}")
}

// v451: Info Panel Auto Show451
internal fun PlayerActivity.showV451InfoPanelAutoShow451Toggle() {
    val current = BiliClient.prefs.v451infoPanelAutoShow451
    BiliClient.prefs.v451infoPanelAutoShow451 = !current
    AppToast.show(this, "Info Panel Auto Show451: ${if (!current) "ON" else "OFF"}")
}

// v451: Inline Subtitle451
internal fun PlayerActivity.showV451InlineSubtitle451Toggle() {
    val current = BiliClient.prefs.v451inlineSubtitle451
    BiliClient.prefs.v451inlineSubtitle451 = !current
    AppToast.show(this, "Inline Subtitle451: ${if (!current) "ON" else "OFF"}")
}

// v451: Inner Loop Enabled451
internal fun PlayerActivity.showV451InnerLoopEnabled451Toggle() {
    val current = BiliClient.prefs.v451innerLoopEnabled451
    BiliClient.prefs.v451innerLoopEnabled451 = !current
    AppToast.show(this, "Inner Loop Enabled451: ${if (!current) "ON" else "OFF"}")
}

// v451: Input Auto Focus451
internal fun PlayerActivity.showV451InputAutoFocus451Toggle() {
    val current = BiliClient.prefs.v451inputAutoFocus451
    BiliClient.prefs.v451inputAutoFocus451 = !current
    AppToast.show(this, "Input Auto Focus451: ${if (!current) "ON" else "OFF"}")
}

// v451: Insert Ad Skip451
internal fun PlayerActivity.showV451InsertAdSkip451Toggle() {
    val current = BiliClient.prefs.v451insertAdSkip451
    BiliClient.prefs.v451insertAdSkip451 = !current
    AppToast.show(this, "Insert Ad Skip451: ${if (!current) "ON" else "OFF"}")
}

// v451: Instance Auto Switch451
internal fun PlayerActivity.showV451InstanceAutoSwitch451Toggle() {
    val current = BiliClient.prefs.v451instanceAutoSwitch451
    BiliClient.prefs.v451instanceAutoSwitch451 = !current
    AppToast.show(this, "Instance Auto Switch451: ${if (!current) "ON" else "OFF"}")
}

// v451: Internal Link Open451
internal fun PlayerActivity.showV451InternalLinkOpen451Toggle() {
    val current = BiliClient.prefs.v451internalLinkOpen451
    BiliClient.prefs.v451internalLinkOpen451 = !current
    AppToast.show(this, "Internal Link Open451: ${if (!current) "ON" else "OFF"}")
}

// v451: Item Auto Highlight451
internal fun PlayerActivity.showV451ItemAutoHighlight451Toggle() {
    val current = BiliClient.prefs.v451itemAutoHighlight451
    BiliClient.prefs.v451itemAutoHighlight451 = !current
    AppToast.show(this, "Item Auto Highlight451: ${if (!current) "ON" else "OFF"}")
}

// v451: Join Room Auto451
internal fun PlayerActivity.showV451JoinRoomAuto451Toggle() {
    val current = BiliClient.prefs.v451joinRoomAuto451
    BiliClient.prefs.v451joinRoomAuto451 = !current
    AppToast.show(this, "Join Room Auto451: ${if (!current) "ON" else "OFF"}")
}

// v451: Jump To Timestamp451
internal fun PlayerActivity.showV451JumpToTimestamp451Toggle() {
    val current = BiliClient.prefs.v451jumpToTimestamp451
    BiliClient.prefs.v451jumpToTimestamp451 = !current
    AppToast.show(this, "Jump To Timestamp451: ${if (!current) "ON" else "OFF"}")
}

// v452: Hybrid Mode Enabled452
internal fun PlayerActivity.showV452HybridModeEnabled452Toggle() {
    val current = BiliClient.prefs.v452hybridModeEnabled452
    BiliClient.prefs.v452hybridModeEnabled452 = !current
    AppToast.show(this, "Hybrid Mode Enabled452: ${if (!current) "ON" else "OFF"}")
}

// v452: Icon Pack Custom452
internal fun PlayerActivity.showV452IconPackCustom452Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v452iconPackCustom452).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom452",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v452iconPackCustom452 = value
        AppToast.show(this, "Icon Pack Custom452: $value")
    }
}

// v452: Idle Screen Saver452
internal fun PlayerActivity.showV452IdleScreenSaver452Toggle() {
    val current = BiliClient.prefs.v452idleScreenSaver452
    BiliClient.prefs.v452idleScreenSaver452 = !current
    AppToast.show(this, "Idle Screen Saver452: ${if (!current) "ON" else "OFF"}")
}

// v452: Import Auto Merge452
internal fun PlayerActivity.showV452ImportAutoMerge452Toggle() {
    val current = BiliClient.prefs.v452importAutoMerge452
    BiliClient.prefs.v452importAutoMerge452 = !current
    AppToast.show(this, "Import Auto Merge452: ${if (!current) "ON" else "OFF"}")
}

// v452: Index Auto Rebuild452
internal fun PlayerActivity.showV452IndexAutoRebuild452Toggle() {
    val current = BiliClient.prefs.v452indexAutoRebuild452
    BiliClient.prefs.v452indexAutoRebuild452 = !current
    AppToast.show(this, "Index Auto Rebuild452: ${if (!current) "ON" else "OFF"}")
}

// v452: Info Panel Auto Show452
internal fun PlayerActivity.showV452InfoPanelAutoShow452Toggle() {
    val current = BiliClient.prefs.v452infoPanelAutoShow452
    BiliClient.prefs.v452infoPanelAutoShow452 = !current
    AppToast.show(this, "Info Panel Auto Show452: ${if (!current) "ON" else "OFF"}")
}

// v452: Inline Subtitle452
internal fun PlayerActivity.showV452InlineSubtitle452Toggle() {
    val current = BiliClient.prefs.v452inlineSubtitle452
    BiliClient.prefs.v452inlineSubtitle452 = !current
    AppToast.show(this, "Inline Subtitle452: ${if (!current) "ON" else "OFF"}")
}

// v452: Inner Loop Enabled452
internal fun PlayerActivity.showV452InnerLoopEnabled452Toggle() {
    val current = BiliClient.prefs.v452innerLoopEnabled452
    BiliClient.prefs.v452innerLoopEnabled452 = !current
    AppToast.show(this, "Inner Loop Enabled452: ${if (!current) "ON" else "OFF"}")
}

// v452: Input Auto Focus452
internal fun PlayerActivity.showV452InputAutoFocus452Toggle() {
    val current = BiliClient.prefs.v452inputAutoFocus452
    BiliClient.prefs.v452inputAutoFocus452 = !current
    AppToast.show(this, "Input Auto Focus452: ${if (!current) "ON" else "OFF"}")
}

// v452: Insert Ad Skip452
internal fun PlayerActivity.showV452InsertAdSkip452Toggle() {
    val current = BiliClient.prefs.v452insertAdSkip452
    BiliClient.prefs.v452insertAdSkip452 = !current
    AppToast.show(this, "Insert Ad Skip452: ${if (!current) "ON" else "OFF"}")
}

// v452: Instance Auto Switch452
internal fun PlayerActivity.showV452InstanceAutoSwitch452Toggle() {
    val current = BiliClient.prefs.v452instanceAutoSwitch452
    BiliClient.prefs.v452instanceAutoSwitch452 = !current
    AppToast.show(this, "Instance Auto Switch452: ${if (!current) "ON" else "OFF"}")
}

// v452: Internal Link Open452
internal fun PlayerActivity.showV452InternalLinkOpen452Toggle() {
    val current = BiliClient.prefs.v452internalLinkOpen452
    BiliClient.prefs.v452internalLinkOpen452 = !current
    AppToast.show(this, "Internal Link Open452: ${if (!current) "ON" else "OFF"}")
}

// v452: Item Auto Highlight452
internal fun PlayerActivity.showV452ItemAutoHighlight452Toggle() {
    val current = BiliClient.prefs.v452itemAutoHighlight452
    BiliClient.prefs.v452itemAutoHighlight452 = !current
    AppToast.show(this, "Item Auto Highlight452: ${if (!current) "ON" else "OFF"}")
}

// v452: Join Room Auto452
internal fun PlayerActivity.showV452JoinRoomAuto452Toggle() {
    val current = BiliClient.prefs.v452joinRoomAuto452
    BiliClient.prefs.v452joinRoomAuto452 = !current
    AppToast.show(this, "Join Room Auto452: ${if (!current) "ON" else "OFF"}")
}

// v452: Jump To Timestamp452
internal fun PlayerActivity.showV452JumpToTimestamp452Toggle() {
    val current = BiliClient.prefs.v452jumpToTimestamp452
    BiliClient.prefs.v452jumpToTimestamp452 = !current
    AppToast.show(this, "Jump To Timestamp452: ${if (!current) "ON" else "OFF"}")
}

// v453: Hybrid Mode Enabled453
internal fun PlayerActivity.showV453HybridModeEnabled453Toggle() {
    val current = BiliClient.prefs.v453hybridModeEnabled453
    BiliClient.prefs.v453hybridModeEnabled453 = !current
    AppToast.show(this, "Hybrid Mode Enabled453: ${if (!current) "ON" else "OFF"}")
}

// v453: Icon Pack Custom453
internal fun PlayerActivity.showV453IconPackCustom453Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v453iconPackCustom453).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom453",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v453iconPackCustom453 = value
        AppToast.show(this, "Icon Pack Custom453: $value")
    }
}

// v453: Idle Screen Saver453
internal fun PlayerActivity.showV453IdleScreenSaver453Toggle() {
    val current = BiliClient.prefs.v453idleScreenSaver453
    BiliClient.prefs.v453idleScreenSaver453 = !current
    AppToast.show(this, "Idle Screen Saver453: ${if (!current) "ON" else "OFF"}")
}

// v453: Import Auto Merge453
internal fun PlayerActivity.showV453ImportAutoMerge453Toggle() {
    val current = BiliClient.prefs.v453importAutoMerge453
    BiliClient.prefs.v453importAutoMerge453 = !current
    AppToast.show(this, "Import Auto Merge453: ${if (!current) "ON" else "OFF"}")
}

// v453: Index Auto Rebuild453
internal fun PlayerActivity.showV453IndexAutoRebuild453Toggle() {
    val current = BiliClient.prefs.v453indexAutoRebuild453
    BiliClient.prefs.v453indexAutoRebuild453 = !current
    AppToast.show(this, "Index Auto Rebuild453: ${if (!current) "ON" else "OFF"}")
}

// v453: Info Panel Auto Show453
internal fun PlayerActivity.showV453InfoPanelAutoShow453Toggle() {
    val current = BiliClient.prefs.v453infoPanelAutoShow453
    BiliClient.prefs.v453infoPanelAutoShow453 = !current
    AppToast.show(this, "Info Panel Auto Show453: ${if (!current) "ON" else "OFF"}")
}

// v453: Inline Subtitle453
internal fun PlayerActivity.showV453InlineSubtitle453Toggle() {
    val current = BiliClient.prefs.v453inlineSubtitle453
    BiliClient.prefs.v453inlineSubtitle453 = !current
    AppToast.show(this, "Inline Subtitle453: ${if (!current) "ON" else "OFF"}")
}

// v453: Inner Loop Enabled453
internal fun PlayerActivity.showV453InnerLoopEnabled453Toggle() {
    val current = BiliClient.prefs.v453innerLoopEnabled453
    BiliClient.prefs.v453innerLoopEnabled453 = !current
    AppToast.show(this, "Inner Loop Enabled453: ${if (!current) "ON" else "OFF"}")
}

// v453: Input Auto Focus453
internal fun PlayerActivity.showV453InputAutoFocus453Toggle() {
    val current = BiliClient.prefs.v453inputAutoFocus453
    BiliClient.prefs.v453inputAutoFocus453 = !current
    AppToast.show(this, "Input Auto Focus453: ${if (!current) "ON" else "OFF"}")
}

// v453: Insert Ad Skip453
internal fun PlayerActivity.showV453InsertAdSkip453Toggle() {
    val current = BiliClient.prefs.v453insertAdSkip453
    BiliClient.prefs.v453insertAdSkip453 = !current
    AppToast.show(this, "Insert Ad Skip453: ${if (!current) "ON" else "OFF"}")
}

// v453: Instance Auto Switch453
internal fun PlayerActivity.showV453InstanceAutoSwitch453Toggle() {
    val current = BiliClient.prefs.v453instanceAutoSwitch453
    BiliClient.prefs.v453instanceAutoSwitch453 = !current
    AppToast.show(this, "Instance Auto Switch453: ${if (!current) "ON" else "OFF"}")
}

// v453: Internal Link Open453
internal fun PlayerActivity.showV453InternalLinkOpen453Toggle() {
    val current = BiliClient.prefs.v453internalLinkOpen453
    BiliClient.prefs.v453internalLinkOpen453 = !current
    AppToast.show(this, "Internal Link Open453: ${if (!current) "ON" else "OFF"}")
}

// v453: Item Auto Highlight453
internal fun PlayerActivity.showV453ItemAutoHighlight453Toggle() {
    val current = BiliClient.prefs.v453itemAutoHighlight453
    BiliClient.prefs.v453itemAutoHighlight453 = !current
    AppToast.show(this, "Item Auto Highlight453: ${if (!current) "ON" else "OFF"}")
}

// v453: Join Room Auto453
internal fun PlayerActivity.showV453JoinRoomAuto453Toggle() {
    val current = BiliClient.prefs.v453joinRoomAuto453
    BiliClient.prefs.v453joinRoomAuto453 = !current
    AppToast.show(this, "Join Room Auto453: ${if (!current) "ON" else "OFF"}")
}

// v453: Jump To Timestamp453
internal fun PlayerActivity.showV453JumpToTimestamp453Toggle() {
    val current = BiliClient.prefs.v453jumpToTimestamp453
    BiliClient.prefs.v453jumpToTimestamp453 = !current
    AppToast.show(this, "Jump To Timestamp453: ${if (!current) "ON" else "OFF"}")
}

// v454: Hybrid Mode Enabled454
internal fun PlayerActivity.showV454HybridModeEnabled454Toggle() {
    val current = BiliClient.prefs.v454hybridModeEnabled454
    BiliClient.prefs.v454hybridModeEnabled454 = !current
    AppToast.show(this, "Hybrid Mode Enabled454: ${if (!current) "ON" else "OFF"}")
}

// v454: Icon Pack Custom454
internal fun PlayerActivity.showV454IconPackCustom454Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v454iconPackCustom454).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom454",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v454iconPackCustom454 = value
        AppToast.show(this, "Icon Pack Custom454: $value")
    }
}

// v454: Idle Screen Saver454
internal fun PlayerActivity.showV454IdleScreenSaver454Toggle() {
    val current = BiliClient.prefs.v454idleScreenSaver454
    BiliClient.prefs.v454idleScreenSaver454 = !current
    AppToast.show(this, "Idle Screen Saver454: ${if (!current) "ON" else "OFF"}")
}

// v454: Import Auto Merge454
internal fun PlayerActivity.showV454ImportAutoMerge454Toggle() {
    val current = BiliClient.prefs.v454importAutoMerge454
    BiliClient.prefs.v454importAutoMerge454 = !current
    AppToast.show(this, "Import Auto Merge454: ${if (!current) "ON" else "OFF"}")
}

// v454: Index Auto Rebuild454
internal fun PlayerActivity.showV454IndexAutoRebuild454Toggle() {
    val current = BiliClient.prefs.v454indexAutoRebuild454
    BiliClient.prefs.v454indexAutoRebuild454 = !current
    AppToast.show(this, "Index Auto Rebuild454: ${if (!current) "ON" else "OFF"}")
}

// v454: Info Panel Auto Show454
internal fun PlayerActivity.showV454InfoPanelAutoShow454Toggle() {
    val current = BiliClient.prefs.v454infoPanelAutoShow454
    BiliClient.prefs.v454infoPanelAutoShow454 = !current
    AppToast.show(this, "Info Panel Auto Show454: ${if (!current) "ON" else "OFF"}")
}

// v454: Inline Subtitle454
internal fun PlayerActivity.showV454InlineSubtitle454Toggle() {
    val current = BiliClient.prefs.v454inlineSubtitle454
    BiliClient.prefs.v454inlineSubtitle454 = !current
    AppToast.show(this, "Inline Subtitle454: ${if (!current) "ON" else "OFF"}")
}

// v454: Inner Loop Enabled454
internal fun PlayerActivity.showV454InnerLoopEnabled454Toggle() {
    val current = BiliClient.prefs.v454innerLoopEnabled454
    BiliClient.prefs.v454innerLoopEnabled454 = !current
    AppToast.show(this, "Inner Loop Enabled454: ${if (!current) "ON" else "OFF"}")
}

// v454: Input Auto Focus454
internal fun PlayerActivity.showV454InputAutoFocus454Toggle() {
    val current = BiliClient.prefs.v454inputAutoFocus454
    BiliClient.prefs.v454inputAutoFocus454 = !current
    AppToast.show(this, "Input Auto Focus454: ${if (!current) "ON" else "OFF"}")
}

// v454: Insert Ad Skip454
internal fun PlayerActivity.showV454InsertAdSkip454Toggle() {
    val current = BiliClient.prefs.v454insertAdSkip454
    BiliClient.prefs.v454insertAdSkip454 = !current
    AppToast.show(this, "Insert Ad Skip454: ${if (!current) "ON" else "OFF"}")
}

// v454: Instance Auto Switch454
internal fun PlayerActivity.showV454InstanceAutoSwitch454Toggle() {
    val current = BiliClient.prefs.v454instanceAutoSwitch454
    BiliClient.prefs.v454instanceAutoSwitch454 = !current
    AppToast.show(this, "Instance Auto Switch454: ${if (!current) "ON" else "OFF"}")
}

// v454: Internal Link Open454
internal fun PlayerActivity.showV454InternalLinkOpen454Toggle() {
    val current = BiliClient.prefs.v454internalLinkOpen454
    BiliClient.prefs.v454internalLinkOpen454 = !current
    AppToast.show(this, "Internal Link Open454: ${if (!current) "ON" else "OFF"}")
}

// v454: Item Auto Highlight454
internal fun PlayerActivity.showV454ItemAutoHighlight454Toggle() {
    val current = BiliClient.prefs.v454itemAutoHighlight454
    BiliClient.prefs.v454itemAutoHighlight454 = !current
    AppToast.show(this, "Item Auto Highlight454: ${if (!current) "ON" else "OFF"}")
}

// v454: Join Room Auto454
internal fun PlayerActivity.showV454JoinRoomAuto454Toggle() {
    val current = BiliClient.prefs.v454joinRoomAuto454
    BiliClient.prefs.v454joinRoomAuto454 = !current
    AppToast.show(this, "Join Room Auto454: ${if (!current) "ON" else "OFF"}")
}

// v454: Jump To Timestamp454
internal fun PlayerActivity.showV454JumpToTimestamp454Toggle() {
    val current = BiliClient.prefs.v454jumpToTimestamp454
    BiliClient.prefs.v454jumpToTimestamp454 = !current
    AppToast.show(this, "Jump To Timestamp454: ${if (!current) "ON" else "OFF"}")
}

// v455: Hybrid Mode Enabled455
internal fun PlayerActivity.showV455HybridModeEnabled455Toggle() {
    val current = BiliClient.prefs.v455hybridModeEnabled455
    BiliClient.prefs.v455hybridModeEnabled455 = !current
    AppToast.show(this, "Hybrid Mode Enabled455: ${if (!current) "ON" else "OFF"}")
}

// v455: Icon Pack Custom455
internal fun PlayerActivity.showV455IconPackCustom455Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v455iconPackCustom455).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom455",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v455iconPackCustom455 = value
        AppToast.show(this, "Icon Pack Custom455: $value")
    }
}

// v455: Idle Screen Saver455
internal fun PlayerActivity.showV455IdleScreenSaver455Toggle() {
    val current = BiliClient.prefs.v455idleScreenSaver455
    BiliClient.prefs.v455idleScreenSaver455 = !current
    AppToast.show(this, "Idle Screen Saver455: ${if (!current) "ON" else "OFF"}")
}

// v455: Import Auto Merge455
internal fun PlayerActivity.showV455ImportAutoMerge455Toggle() {
    val current = BiliClient.prefs.v455importAutoMerge455
    BiliClient.prefs.v455importAutoMerge455 = !current
    AppToast.show(this, "Import Auto Merge455: ${if (!current) "ON" else "OFF"}")
}

// v455: Index Auto Rebuild455
internal fun PlayerActivity.showV455IndexAutoRebuild455Toggle() {
    val current = BiliClient.prefs.v455indexAutoRebuild455
    BiliClient.prefs.v455indexAutoRebuild455 = !current
    AppToast.show(this, "Index Auto Rebuild455: ${if (!current) "ON" else "OFF"}")
}

// v455: Info Panel Auto Show455
internal fun PlayerActivity.showV455InfoPanelAutoShow455Toggle() {
    val current = BiliClient.prefs.v455infoPanelAutoShow455
    BiliClient.prefs.v455infoPanelAutoShow455 = !current
    AppToast.show(this, "Info Panel Auto Show455: ${if (!current) "ON" else "OFF"}")
}

// v455: Inline Subtitle455
internal fun PlayerActivity.showV455InlineSubtitle455Toggle() {
    val current = BiliClient.prefs.v455inlineSubtitle455
    BiliClient.prefs.v455inlineSubtitle455 = !current
    AppToast.show(this, "Inline Subtitle455: ${if (!current) "ON" else "OFF"}")
}

// v455: Inner Loop Enabled455
internal fun PlayerActivity.showV455InnerLoopEnabled455Toggle() {
    val current = BiliClient.prefs.v455innerLoopEnabled455
    BiliClient.prefs.v455innerLoopEnabled455 = !current
    AppToast.show(this, "Inner Loop Enabled455: ${if (!current) "ON" else "OFF"}")
}

// v455: Input Auto Focus455
internal fun PlayerActivity.showV455InputAutoFocus455Toggle() {
    val current = BiliClient.prefs.v455inputAutoFocus455
    BiliClient.prefs.v455inputAutoFocus455 = !current
    AppToast.show(this, "Input Auto Focus455: ${if (!current) "ON" else "OFF"}")
}

// v455: Insert Ad Skip455
internal fun PlayerActivity.showV455InsertAdSkip455Toggle() {
    val current = BiliClient.prefs.v455insertAdSkip455
    BiliClient.prefs.v455insertAdSkip455 = !current
    AppToast.show(this, "Insert Ad Skip455: ${if (!current) "ON" else "OFF"}")
}

// v455: Instance Auto Switch455
internal fun PlayerActivity.showV455InstanceAutoSwitch455Toggle() {
    val current = BiliClient.prefs.v455instanceAutoSwitch455
    BiliClient.prefs.v455instanceAutoSwitch455 = !current
    AppToast.show(this, "Instance Auto Switch455: ${if (!current) "ON" else "OFF"}")
}

// v455: Internal Link Open455
internal fun PlayerActivity.showV455InternalLinkOpen455Toggle() {
    val current = BiliClient.prefs.v455internalLinkOpen455
    BiliClient.prefs.v455internalLinkOpen455 = !current
    AppToast.show(this, "Internal Link Open455: ${if (!current) "ON" else "OFF"}")
}

// v455: Item Auto Highlight455
internal fun PlayerActivity.showV455ItemAutoHighlight455Toggle() {
    val current = BiliClient.prefs.v455itemAutoHighlight455
    BiliClient.prefs.v455itemAutoHighlight455 = !current
    AppToast.show(this, "Item Auto Highlight455: ${if (!current) "ON" else "OFF"}")
}

// v455: Join Room Auto455
internal fun PlayerActivity.showV455JoinRoomAuto455Toggle() {
    val current = BiliClient.prefs.v455joinRoomAuto455
    BiliClient.prefs.v455joinRoomAuto455 = !current
    AppToast.show(this, "Join Room Auto455: ${if (!current) "ON" else "OFF"}")
}

// v455: Jump To Timestamp455
internal fun PlayerActivity.showV455JumpToTimestamp455Toggle() {
    val current = BiliClient.prefs.v455jumpToTimestamp455
    BiliClient.prefs.v455jumpToTimestamp455 = !current
    AppToast.show(this, "Jump To Timestamp455: ${if (!current) "ON" else "OFF"}")
}

// v456: Hybrid Mode Enabled456
internal fun PlayerActivity.showV456HybridModeEnabled456Toggle() {
    val current = BiliClient.prefs.v456hybridModeEnabled456
    BiliClient.prefs.v456hybridModeEnabled456 = !current
    AppToast.show(this, "Hybrid Mode Enabled456: ${if (!current) "ON" else "OFF"}")
}

// v456: Icon Pack Custom456
internal fun PlayerActivity.showV456IconPackCustom456Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v456iconPackCustom456).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom456",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v456iconPackCustom456 = value
        AppToast.show(this, "Icon Pack Custom456: $value")
    }
}

// v456: Idle Screen Saver456
internal fun PlayerActivity.showV456IdleScreenSaver456Toggle() {
    val current = BiliClient.prefs.v456idleScreenSaver456
    BiliClient.prefs.v456idleScreenSaver456 = !current
    AppToast.show(this, "Idle Screen Saver456: ${if (!current) "ON" else "OFF"}")
}

// v456: Import Auto Merge456
internal fun PlayerActivity.showV456ImportAutoMerge456Toggle() {
    val current = BiliClient.prefs.v456importAutoMerge456
    BiliClient.prefs.v456importAutoMerge456 = !current
    AppToast.show(this, "Import Auto Merge456: ${if (!current) "ON" else "OFF"}")
}

// v456: Index Auto Rebuild456
internal fun PlayerActivity.showV456IndexAutoRebuild456Toggle() {
    val current = BiliClient.prefs.v456indexAutoRebuild456
    BiliClient.prefs.v456indexAutoRebuild456 = !current
    AppToast.show(this, "Index Auto Rebuild456: ${if (!current) "ON" else "OFF"}")
}

// v456: Info Panel Auto Show456
internal fun PlayerActivity.showV456InfoPanelAutoShow456Toggle() {
    val current = BiliClient.prefs.v456infoPanelAutoShow456
    BiliClient.prefs.v456infoPanelAutoShow456 = !current
    AppToast.show(this, "Info Panel Auto Show456: ${if (!current) "ON" else "OFF"}")
}

// v456: Inline Subtitle456
internal fun PlayerActivity.showV456InlineSubtitle456Toggle() {
    val current = BiliClient.prefs.v456inlineSubtitle456
    BiliClient.prefs.v456inlineSubtitle456 = !current
    AppToast.show(this, "Inline Subtitle456: ${if (!current) "ON" else "OFF"}")
}

// v456: Inner Loop Enabled456
internal fun PlayerActivity.showV456InnerLoopEnabled456Toggle() {
    val current = BiliClient.prefs.v456innerLoopEnabled456
    BiliClient.prefs.v456innerLoopEnabled456 = !current
    AppToast.show(this, "Inner Loop Enabled456: ${if (!current) "ON" else "OFF"}")
}

// v456: Input Auto Focus456
internal fun PlayerActivity.showV456InputAutoFocus456Toggle() {
    val current = BiliClient.prefs.v456inputAutoFocus456
    BiliClient.prefs.v456inputAutoFocus456 = !current
    AppToast.show(this, "Input Auto Focus456: ${if (!current) "ON" else "OFF"}")
}

// v456: Insert Ad Skip456
internal fun PlayerActivity.showV456InsertAdSkip456Toggle() {
    val current = BiliClient.prefs.v456insertAdSkip456
    BiliClient.prefs.v456insertAdSkip456 = !current
    AppToast.show(this, "Insert Ad Skip456: ${if (!current) "ON" else "OFF"}")
}

// v456: Instance Auto Switch456
internal fun PlayerActivity.showV456InstanceAutoSwitch456Toggle() {
    val current = BiliClient.prefs.v456instanceAutoSwitch456
    BiliClient.prefs.v456instanceAutoSwitch456 = !current
    AppToast.show(this, "Instance Auto Switch456: ${if (!current) "ON" else "OFF"}")
}

// v456: Internal Link Open456
internal fun PlayerActivity.showV456InternalLinkOpen456Toggle() {
    val current = BiliClient.prefs.v456internalLinkOpen456
    BiliClient.prefs.v456internalLinkOpen456 = !current
    AppToast.show(this, "Internal Link Open456: ${if (!current) "ON" else "OFF"}")
}

// v456: Item Auto Highlight456
internal fun PlayerActivity.showV456ItemAutoHighlight456Toggle() {
    val current = BiliClient.prefs.v456itemAutoHighlight456
    BiliClient.prefs.v456itemAutoHighlight456 = !current
    AppToast.show(this, "Item Auto Highlight456: ${if (!current) "ON" else "OFF"}")
}

// v456: Join Room Auto456
internal fun PlayerActivity.showV456JoinRoomAuto456Toggle() {
    val current = BiliClient.prefs.v456joinRoomAuto456
    BiliClient.prefs.v456joinRoomAuto456 = !current
    AppToast.show(this, "Join Room Auto456: ${if (!current) "ON" else "OFF"}")
}

// v456: Jump To Timestamp456
internal fun PlayerActivity.showV456JumpToTimestamp456Toggle() {
    val current = BiliClient.prefs.v456jumpToTimestamp456
    BiliClient.prefs.v456jumpToTimestamp456 = !current
    AppToast.show(this, "Jump To Timestamp456: ${if (!current) "ON" else "OFF"}")
}

// v457: Hybrid Mode Enabled457
internal fun PlayerActivity.showV457HybridModeEnabled457Toggle() {
    val current = BiliClient.prefs.v457hybridModeEnabled457
    BiliClient.prefs.v457hybridModeEnabled457 = !current
    AppToast.show(this, "Hybrid Mode Enabled457: ${if (!current) "ON" else "OFF"}")
}

// v457: Icon Pack Custom457
internal fun PlayerActivity.showV457IconPackCustom457Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v457iconPackCustom457).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom457",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v457iconPackCustom457 = value
        AppToast.show(this, "Icon Pack Custom457: $value")
    }
}

// v457: Idle Screen Saver457
internal fun PlayerActivity.showV457IdleScreenSaver457Toggle() {
    val current = BiliClient.prefs.v457idleScreenSaver457
    BiliClient.prefs.v457idleScreenSaver457 = !current
    AppToast.show(this, "Idle Screen Saver457: ${if (!current) "ON" else "OFF"}")
}

// v457: Import Auto Merge457
internal fun PlayerActivity.showV457ImportAutoMerge457Toggle() {
    val current = BiliClient.prefs.v457importAutoMerge457
    BiliClient.prefs.v457importAutoMerge457 = !current
    AppToast.show(this, "Import Auto Merge457: ${if (!current) "ON" else "OFF"}")
}

// v457: Index Auto Rebuild457
internal fun PlayerActivity.showV457IndexAutoRebuild457Toggle() {
    val current = BiliClient.prefs.v457indexAutoRebuild457
    BiliClient.prefs.v457indexAutoRebuild457 = !current
    AppToast.show(this, "Index Auto Rebuild457: ${if (!current) "ON" else "OFF"}")
}

// v457: Info Panel Auto Show457
internal fun PlayerActivity.showV457InfoPanelAutoShow457Toggle() {
    val current = BiliClient.prefs.v457infoPanelAutoShow457
    BiliClient.prefs.v457infoPanelAutoShow457 = !current
    AppToast.show(this, "Info Panel Auto Show457: ${if (!current) "ON" else "OFF"}")
}

// v457: Inline Subtitle457
internal fun PlayerActivity.showV457InlineSubtitle457Toggle() {
    val current = BiliClient.prefs.v457inlineSubtitle457
    BiliClient.prefs.v457inlineSubtitle457 = !current
    AppToast.show(this, "Inline Subtitle457: ${if (!current) "ON" else "OFF"}")
}

// v457: Inner Loop Enabled457
internal fun PlayerActivity.showV457InnerLoopEnabled457Toggle() {
    val current = BiliClient.prefs.v457innerLoopEnabled457
    BiliClient.prefs.v457innerLoopEnabled457 = !current
    AppToast.show(this, "Inner Loop Enabled457: ${if (!current) "ON" else "OFF"}")
}

// v457: Input Auto Focus457
internal fun PlayerActivity.showV457InputAutoFocus457Toggle() {
    val current = BiliClient.prefs.v457inputAutoFocus457
    BiliClient.prefs.v457inputAutoFocus457 = !current
    AppToast.show(this, "Input Auto Focus457: ${if (!current) "ON" else "OFF"}")
}

// v457: Insert Ad Skip457
internal fun PlayerActivity.showV457InsertAdSkip457Toggle() {
    val current = BiliClient.prefs.v457insertAdSkip457
    BiliClient.prefs.v457insertAdSkip457 = !current
    AppToast.show(this, "Insert Ad Skip457: ${if (!current) "ON" else "OFF"}")
}

// v457: Instance Auto Switch457
internal fun PlayerActivity.showV457InstanceAutoSwitch457Toggle() {
    val current = BiliClient.prefs.v457instanceAutoSwitch457
    BiliClient.prefs.v457instanceAutoSwitch457 = !current
    AppToast.show(this, "Instance Auto Switch457: ${if (!current) "ON" else "OFF"}")
}

// v457: Internal Link Open457
internal fun PlayerActivity.showV457InternalLinkOpen457Toggle() {
    val current = BiliClient.prefs.v457internalLinkOpen457
    BiliClient.prefs.v457internalLinkOpen457 = !current
    AppToast.show(this, "Internal Link Open457: ${if (!current) "ON" else "OFF"}")
}

// v457: Item Auto Highlight457
internal fun PlayerActivity.showV457ItemAutoHighlight457Toggle() {
    val current = BiliClient.prefs.v457itemAutoHighlight457
    BiliClient.prefs.v457itemAutoHighlight457 = !current
    AppToast.show(this, "Item Auto Highlight457: ${if (!current) "ON" else "OFF"}")
}

// v457: Join Room Auto457
internal fun PlayerActivity.showV457JoinRoomAuto457Toggle() {
    val current = BiliClient.prefs.v457joinRoomAuto457
    BiliClient.prefs.v457joinRoomAuto457 = !current
    AppToast.show(this, "Join Room Auto457: ${if (!current) "ON" else "OFF"}")
}

// v457: Jump To Timestamp457
internal fun PlayerActivity.showV457JumpToTimestamp457Toggle() {
    val current = BiliClient.prefs.v457jumpToTimestamp457
    BiliClient.prefs.v457jumpToTimestamp457 = !current
    AppToast.show(this, "Jump To Timestamp457: ${if (!current) "ON" else "OFF"}")
}

// v458: Hybrid Mode Enabled458
internal fun PlayerActivity.showV458HybridModeEnabled458Toggle() {
    val current = BiliClient.prefs.v458hybridModeEnabled458
    BiliClient.prefs.v458hybridModeEnabled458 = !current
    AppToast.show(this, "Hybrid Mode Enabled458: ${if (!current) "ON" else "OFF"}")
}

// v458: Icon Pack Custom458
internal fun PlayerActivity.showV458IconPackCustom458Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v458iconPackCustom458).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom458",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v458iconPackCustom458 = value
        AppToast.show(this, "Icon Pack Custom458: $value")
    }
}

// v458: Idle Screen Saver458
internal fun PlayerActivity.showV458IdleScreenSaver458Toggle() {
    val current = BiliClient.prefs.v458idleScreenSaver458
    BiliClient.prefs.v458idleScreenSaver458 = !current
    AppToast.show(this, "Idle Screen Saver458: ${if (!current) "ON" else "OFF"}")
}

// v458: Import Auto Merge458
internal fun PlayerActivity.showV458ImportAutoMerge458Toggle() {
    val current = BiliClient.prefs.v458importAutoMerge458
    BiliClient.prefs.v458importAutoMerge458 = !current
    AppToast.show(this, "Import Auto Merge458: ${if (!current) "ON" else "OFF"}")
}

// v458: Index Auto Rebuild458
internal fun PlayerActivity.showV458IndexAutoRebuild458Toggle() {
    val current = BiliClient.prefs.v458indexAutoRebuild458
    BiliClient.prefs.v458indexAutoRebuild458 = !current
    AppToast.show(this, "Index Auto Rebuild458: ${if (!current) "ON" else "OFF"}")
}

// v458: Info Panel Auto Show458
internal fun PlayerActivity.showV458InfoPanelAutoShow458Toggle() {
    val current = BiliClient.prefs.v458infoPanelAutoShow458
    BiliClient.prefs.v458infoPanelAutoShow458 = !current
    AppToast.show(this, "Info Panel Auto Show458: ${if (!current) "ON" else "OFF"}")
}

// v458: Inline Subtitle458
internal fun PlayerActivity.showV458InlineSubtitle458Toggle() {
    val current = BiliClient.prefs.v458inlineSubtitle458
    BiliClient.prefs.v458inlineSubtitle458 = !current
    AppToast.show(this, "Inline Subtitle458: ${if (!current) "ON" else "OFF"}")
}

// v458: Inner Loop Enabled458
internal fun PlayerActivity.showV458InnerLoopEnabled458Toggle() {
    val current = BiliClient.prefs.v458innerLoopEnabled458
    BiliClient.prefs.v458innerLoopEnabled458 = !current
    AppToast.show(this, "Inner Loop Enabled458: ${if (!current) "ON" else "OFF"}")
}

// v458: Input Auto Focus458
internal fun PlayerActivity.showV458InputAutoFocus458Toggle() {
    val current = BiliClient.prefs.v458inputAutoFocus458
    BiliClient.prefs.v458inputAutoFocus458 = !current
    AppToast.show(this, "Input Auto Focus458: ${if (!current) "ON" else "OFF"}")
}

// v458: Insert Ad Skip458
internal fun PlayerActivity.showV458InsertAdSkip458Toggle() {
    val current = BiliClient.prefs.v458insertAdSkip458
    BiliClient.prefs.v458insertAdSkip458 = !current
    AppToast.show(this, "Insert Ad Skip458: ${if (!current) "ON" else "OFF"}")
}

// v458: Instance Auto Switch458
internal fun PlayerActivity.showV458InstanceAutoSwitch458Toggle() {
    val current = BiliClient.prefs.v458instanceAutoSwitch458
    BiliClient.prefs.v458instanceAutoSwitch458 = !current
    AppToast.show(this, "Instance Auto Switch458: ${if (!current) "ON" else "OFF"}")
}

// v458: Internal Link Open458
internal fun PlayerActivity.showV458InternalLinkOpen458Toggle() {
    val current = BiliClient.prefs.v458internalLinkOpen458
    BiliClient.prefs.v458internalLinkOpen458 = !current
    AppToast.show(this, "Internal Link Open458: ${if (!current) "ON" else "OFF"}")
}

// v458: Item Auto Highlight458
internal fun PlayerActivity.showV458ItemAutoHighlight458Toggle() {
    val current = BiliClient.prefs.v458itemAutoHighlight458
    BiliClient.prefs.v458itemAutoHighlight458 = !current
    AppToast.show(this, "Item Auto Highlight458: ${if (!current) "ON" else "OFF"}")
}

// v458: Join Room Auto458
internal fun PlayerActivity.showV458JoinRoomAuto458Toggle() {
    val current = BiliClient.prefs.v458joinRoomAuto458
    BiliClient.prefs.v458joinRoomAuto458 = !current
    AppToast.show(this, "Join Room Auto458: ${if (!current) "ON" else "OFF"}")
}

// v458: Jump To Timestamp458
internal fun PlayerActivity.showV458JumpToTimestamp458Toggle() {
    val current = BiliClient.prefs.v458jumpToTimestamp458
    BiliClient.prefs.v458jumpToTimestamp458 = !current
    AppToast.show(this, "Jump To Timestamp458: ${if (!current) "ON" else "OFF"}")
}

// v459: Hybrid Mode Enabled459
internal fun PlayerActivity.showV459HybridModeEnabled459Toggle() {
    val current = BiliClient.prefs.v459hybridModeEnabled459
    BiliClient.prefs.v459hybridModeEnabled459 = !current
    AppToast.show(this, "Hybrid Mode Enabled459: ${if (!current) "ON" else "OFF"}")
}

// v459: Icon Pack Custom459
internal fun PlayerActivity.showV459IconPackCustom459Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v459iconPackCustom459).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom459",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v459iconPackCustom459 = value
        AppToast.show(this, "Icon Pack Custom459: $value")
    }
}

// v459: Idle Screen Saver459
internal fun PlayerActivity.showV459IdleScreenSaver459Toggle() {
    val current = BiliClient.prefs.v459idleScreenSaver459
    BiliClient.prefs.v459idleScreenSaver459 = !current
    AppToast.show(this, "Idle Screen Saver459: ${if (!current) "ON" else "OFF"}")
}

// v459: Import Auto Merge459
internal fun PlayerActivity.showV459ImportAutoMerge459Toggle() {
    val current = BiliClient.prefs.v459importAutoMerge459
    BiliClient.prefs.v459importAutoMerge459 = !current
    AppToast.show(this, "Import Auto Merge459: ${if (!current) "ON" else "OFF"}")
}

// v459: Index Auto Rebuild459
internal fun PlayerActivity.showV459IndexAutoRebuild459Toggle() {
    val current = BiliClient.prefs.v459indexAutoRebuild459
    BiliClient.prefs.v459indexAutoRebuild459 = !current
    AppToast.show(this, "Index Auto Rebuild459: ${if (!current) "ON" else "OFF"}")
}

// v459: Info Panel Auto Show459
internal fun PlayerActivity.showV459InfoPanelAutoShow459Toggle() {
    val current = BiliClient.prefs.v459infoPanelAutoShow459
    BiliClient.prefs.v459infoPanelAutoShow459 = !current
    AppToast.show(this, "Info Panel Auto Show459: ${if (!current) "ON" else "OFF"}")
}

// v459: Inline Subtitle459
internal fun PlayerActivity.showV459InlineSubtitle459Toggle() {
    val current = BiliClient.prefs.v459inlineSubtitle459
    BiliClient.prefs.v459inlineSubtitle459 = !current
    AppToast.show(this, "Inline Subtitle459: ${if (!current) "ON" else "OFF"}")
}

// v459: Inner Loop Enabled459
internal fun PlayerActivity.showV459InnerLoopEnabled459Toggle() {
    val current = BiliClient.prefs.v459innerLoopEnabled459
    BiliClient.prefs.v459innerLoopEnabled459 = !current
    AppToast.show(this, "Inner Loop Enabled459: ${if (!current) "ON" else "OFF"}")
}

// v459: Input Auto Focus459
internal fun PlayerActivity.showV459InputAutoFocus459Toggle() {
    val current = BiliClient.prefs.v459inputAutoFocus459
    BiliClient.prefs.v459inputAutoFocus459 = !current
    AppToast.show(this, "Input Auto Focus459: ${if (!current) "ON" else "OFF"}")
}

// v459: Insert Ad Skip459
internal fun PlayerActivity.showV459InsertAdSkip459Toggle() {
    val current = BiliClient.prefs.v459insertAdSkip459
    BiliClient.prefs.v459insertAdSkip459 = !current
    AppToast.show(this, "Insert Ad Skip459: ${if (!current) "ON" else "OFF"}")
}

// v459: Instance Auto Switch459
internal fun PlayerActivity.showV459InstanceAutoSwitch459Toggle() {
    val current = BiliClient.prefs.v459instanceAutoSwitch459
    BiliClient.prefs.v459instanceAutoSwitch459 = !current
    AppToast.show(this, "Instance Auto Switch459: ${if (!current) "ON" else "OFF"}")
}

// v459: Internal Link Open459
internal fun PlayerActivity.showV459InternalLinkOpen459Toggle() {
    val current = BiliClient.prefs.v459internalLinkOpen459
    BiliClient.prefs.v459internalLinkOpen459 = !current
    AppToast.show(this, "Internal Link Open459: ${if (!current) "ON" else "OFF"}")
}

// v459: Item Auto Highlight459
internal fun PlayerActivity.showV459ItemAutoHighlight459Toggle() {
    val current = BiliClient.prefs.v459itemAutoHighlight459
    BiliClient.prefs.v459itemAutoHighlight459 = !current
    AppToast.show(this, "Item Auto Highlight459: ${if (!current) "ON" else "OFF"}")
}

// v459: Join Room Auto459
internal fun PlayerActivity.showV459JoinRoomAuto459Toggle() {
    val current = BiliClient.prefs.v459joinRoomAuto459
    BiliClient.prefs.v459joinRoomAuto459 = !current
    AppToast.show(this, "Join Room Auto459: ${if (!current) "ON" else "OFF"}")
}

// v459: Jump To Timestamp459
internal fun PlayerActivity.showV459JumpToTimestamp459Toggle() {
    val current = BiliClient.prefs.v459jumpToTimestamp459
    BiliClient.prefs.v459jumpToTimestamp459 = !current
    AppToast.show(this, "Jump To Timestamp459: ${if (!current) "ON" else "OFF"}")
}

// v460: Hybrid Mode Enabled460
internal fun PlayerActivity.showV460HybridModeEnabled460Toggle() {
    val current = BiliClient.prefs.v460hybridModeEnabled460
    BiliClient.prefs.v460hybridModeEnabled460 = !current
    AppToast.show(this, "Hybrid Mode Enabled460: ${if (!current) "ON" else "OFF"}")
}

// v460: Icon Pack Custom460
internal fun PlayerActivity.showV460IconPackCustom460Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v460iconPackCustom460).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Icon Pack Custom460",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v460iconPackCustom460 = value
        AppToast.show(this, "Icon Pack Custom460: $value")
    }
}

// v460: Idle Screen Saver460
internal fun PlayerActivity.showV460IdleScreenSaver460Toggle() {
    val current = BiliClient.prefs.v460idleScreenSaver460
    BiliClient.prefs.v460idleScreenSaver460 = !current
    AppToast.show(this, "Idle Screen Saver460: ${if (!current) "ON" else "OFF"}")
}

// v460: Import Auto Merge460
internal fun PlayerActivity.showV460ImportAutoMerge460Toggle() {
    val current = BiliClient.prefs.v460importAutoMerge460
    BiliClient.prefs.v460importAutoMerge460 = !current
    AppToast.show(this, "Import Auto Merge460: ${if (!current) "ON" else "OFF"}")
}

// v460: Index Auto Rebuild460
internal fun PlayerActivity.showV460IndexAutoRebuild460Toggle() {
    val current = BiliClient.prefs.v460indexAutoRebuild460
    BiliClient.prefs.v460indexAutoRebuild460 = !current
    AppToast.show(this, "Index Auto Rebuild460: ${if (!current) "ON" else "OFF"}")
}

// v460: Info Panel Auto Show460
internal fun PlayerActivity.showV460InfoPanelAutoShow460Toggle() {
    val current = BiliClient.prefs.v460infoPanelAutoShow460
    BiliClient.prefs.v460infoPanelAutoShow460 = !current
    AppToast.show(this, "Info Panel Auto Show460: ${if (!current) "ON" else "OFF"}")
}

// v460: Inline Subtitle460
internal fun PlayerActivity.showV460InlineSubtitle460Toggle() {
    val current = BiliClient.prefs.v460inlineSubtitle460
    BiliClient.prefs.v460inlineSubtitle460 = !current
    AppToast.show(this, "Inline Subtitle460: ${if (!current) "ON" else "OFF"}")
}

// v460: Inner Loop Enabled460
internal fun PlayerActivity.showV460InnerLoopEnabled460Toggle() {
    val current = BiliClient.prefs.v460innerLoopEnabled460
    BiliClient.prefs.v460innerLoopEnabled460 = !current
    AppToast.show(this, "Inner Loop Enabled460: ${if (!current) "ON" else "OFF"}")
}

// v460: Input Auto Focus460
internal fun PlayerActivity.showV460InputAutoFocus460Toggle() {
    val current = BiliClient.prefs.v460inputAutoFocus460
    BiliClient.prefs.v460inputAutoFocus460 = !current
    AppToast.show(this, "Input Auto Focus460: ${if (!current) "ON" else "OFF"}")
}

// v460: Insert Ad Skip460
internal fun PlayerActivity.showV460InsertAdSkip460Toggle() {
    val current = BiliClient.prefs.v460insertAdSkip460
    BiliClient.prefs.v460insertAdSkip460 = !current
    AppToast.show(this, "Insert Ad Skip460: ${if (!current) "ON" else "OFF"}")
}

// v460: Instance Auto Switch460
internal fun PlayerActivity.showV460InstanceAutoSwitch460Toggle() {
    val current = BiliClient.prefs.v460instanceAutoSwitch460
    BiliClient.prefs.v460instanceAutoSwitch460 = !current
    AppToast.show(this, "Instance Auto Switch460: ${if (!current) "ON" else "OFF"}")
}

// v460: Internal Link Open460
internal fun PlayerActivity.showV460InternalLinkOpen460Toggle() {
    val current = BiliClient.prefs.v460internalLinkOpen460
    BiliClient.prefs.v460internalLinkOpen460 = !current
    AppToast.show(this, "Internal Link Open460: ${if (!current) "ON" else "OFF"}")
}

// v460: Item Auto Highlight460
internal fun PlayerActivity.showV460ItemAutoHighlight460Toggle() {
    val current = BiliClient.prefs.v460itemAutoHighlight460
    BiliClient.prefs.v460itemAutoHighlight460 = !current
    AppToast.show(this, "Item Auto Highlight460: ${if (!current) "ON" else "OFF"}")
}

// v460: Join Room Auto460
internal fun PlayerActivity.showV460JoinRoomAuto460Toggle() {
    val current = BiliClient.prefs.v460joinRoomAuto460
    BiliClient.prefs.v460joinRoomAuto460 = !current
    AppToast.show(this, "Join Room Auto460: ${if (!current) "ON" else "OFF"}")
}

// v460: Jump To Timestamp460
internal fun PlayerActivity.showV460JumpToTimestamp460Toggle() {
    val current = BiliClient.prefs.v460jumpToTimestamp460
    BiliClient.prefs.v460jumpToTimestamp460 = !current
    AppToast.show(this, "Jump To Timestamp460: ${if (!current) "ON" else "OFF"}")
}

// v461: Key Mapping Custom461
internal fun PlayerActivity.showV461KeyMappingCustom461Toggle() {
    val current = BiliClient.prefs.v461keyMappingCustom461
    BiliClient.prefs.v461keyMappingCustom461 = !current
    AppToast.show(this, "Key Mapping Custom461: ${if (!current) "ON" else "OFF"}")
}

// v461: Label Auto Generate461
internal fun PlayerActivity.showV461LabelAutoGenerate461Toggle() {
    val current = BiliClient.prefs.v461labelAutoGenerate461
    BiliClient.prefs.v461labelAutoGenerate461 = !current
    AppToast.show(this, "Label Auto Generate461: ${if (!current) "ON" else "OFF"}")
}

// v461: Layer Auto Composite461
internal fun PlayerActivity.showV461LayerAutoComposite461Toggle() {
    val current = BiliClient.prefs.v461layerAutoComposite461
    BiliClient.prefs.v461layerAutoComposite461 = !current
    AppToast.show(this, "Layer Auto Composite461: ${if (!current) "ON" else "OFF"}")
}

// v461: Lazy Load Enabled461
internal fun PlayerActivity.showV461LazyLoadEnabled461Toggle() {
    val current = BiliClient.prefs.v461lazyLoadEnabled461
    BiliClient.prefs.v461lazyLoadEnabled461 = !current
    AppToast.show(this, "Lazy Load Enabled461: ${if (!current) "ON" else "OFF"}")
}

// v461: Lead In Auto Skip461
internal fun PlayerActivity.showV461LeadInAutoSkip461Toggle() {
    val current = BiliClient.prefs.v461leadInAutoSkip461
    BiliClient.prefs.v461leadInAutoSkip461 = !current
    AppToast.show(this, "Lead In Auto Skip461: ${if (!current) "ON" else "OFF"}")
}

// v461: Lens Correction461
internal fun PlayerActivity.showV461LensCorrection461Toggle() {
    val current = BiliClient.prefs.v461lensCorrection461
    BiliClient.prefs.v461lensCorrection461 = !current
    AppToast.show(this, "Lens Correction461: ${if (!current) "ON" else "OFF"}")
}

// v461: Level Auto Adjust461
internal fun PlayerActivity.showV461LevelAutoAdjust461Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v461levelAutoAdjust461).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust461",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v461levelAutoAdjust461 = value
        AppToast.show(this, "Level Auto Adjust461: $value")
    }
}

// v461: Light Adaptive461
internal fun PlayerActivity.showV461LightAdaptive461Toggle() {
    val current = BiliClient.prefs.v461lightAdaptive461
    BiliClient.prefs.v461lightAdaptive461 = !current
    AppToast.show(this, "Light Adaptive461: ${if (!current) "ON" else "OFF"}")
}

// v461: Limit Bandwidth Auto461
internal fun PlayerActivity.showV461LimitBandwidthAuto461Toggle() {
    val current = BiliClient.prefs.v461limitBandwidthAuto461
    BiliClient.prefs.v461limitBandwidthAuto461 = !current
    AppToast.show(this, "Limit Bandwidth Auto461: ${if (!current) "ON" else "OFF"}")
}

// v461: Line Spacing Adjust461
internal fun PlayerActivity.showV461LineSpacingAdjust461Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v461lineSpacingAdjust461).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust461",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v461lineSpacingAdjust461 = value
        AppToast.show(this, "Line Spacing Adjust461: $value")
    }
}

// v461: Link Preview Auto461
internal fun PlayerActivity.showV461LinkPreviewAuto461Toggle() {
    val current = BiliClient.prefs.v461linkPreviewAuto461
    BiliClient.prefs.v461linkPreviewAuto461 = !current
    AppToast.show(this, "Link Preview Auto461: ${if (!current) "ON" else "OFF"}")
}

// v461: List Animation461
internal fun PlayerActivity.showV461ListAnimation461Toggle() {
    val current = BiliClient.prefs.v461listAnimation461
    BiliClient.prefs.v461listAnimation461 = !current
    AppToast.show(this, "List Animation461: ${if (!current) "ON" else "OFF"}")
}

// v461: Load Priority High461
internal fun PlayerActivity.showV461LoadPriorityHigh461Toggle() {
    val current = BiliClient.prefs.v461loadPriorityHigh461
    BiliClient.prefs.v461loadPriorityHigh461 = !current
    AppToast.show(this, "Load Priority High461: ${if (!current) "ON" else "OFF"}")
}

// v461: Local Cache Enabled461
internal fun PlayerActivity.showV461LocalCacheEnabled461Toggle() {
    val current = BiliClient.prefs.v461localCacheEnabled461
    BiliClient.prefs.v461localCacheEnabled461 = !current
    AppToast.show(this, "Local Cache Enabled461: ${if (!current) "ON" else "OFF"}")
}

// v461: Location Based Rec461
internal fun PlayerActivity.showV461LocationBasedRec461Toggle() {
    val current = BiliClient.prefs.v461locationBasedRec461
    BiliClient.prefs.v461locationBasedRec461 = !current
    AppToast.show(this, "Location Based Rec461: ${if (!current) "ON" else "OFF"}")
}

// v462: Key Mapping Custom462
internal fun PlayerActivity.showV462KeyMappingCustom462Toggle() {
    val current = BiliClient.prefs.v462keyMappingCustom462
    BiliClient.prefs.v462keyMappingCustom462 = !current
    AppToast.show(this, "Key Mapping Custom462: ${if (!current) "ON" else "OFF"}")
}

// v462: Label Auto Generate462
internal fun PlayerActivity.showV462LabelAutoGenerate462Toggle() {
    val current = BiliClient.prefs.v462labelAutoGenerate462
    BiliClient.prefs.v462labelAutoGenerate462 = !current
    AppToast.show(this, "Label Auto Generate462: ${if (!current) "ON" else "OFF"}")
}

// v462: Layer Auto Composite462
internal fun PlayerActivity.showV462LayerAutoComposite462Toggle() {
    val current = BiliClient.prefs.v462layerAutoComposite462
    BiliClient.prefs.v462layerAutoComposite462 = !current
    AppToast.show(this, "Layer Auto Composite462: ${if (!current) "ON" else "OFF"}")
}

// v462: Lazy Load Enabled462
internal fun PlayerActivity.showV462LazyLoadEnabled462Toggle() {
    val current = BiliClient.prefs.v462lazyLoadEnabled462
    BiliClient.prefs.v462lazyLoadEnabled462 = !current
    AppToast.show(this, "Lazy Load Enabled462: ${if (!current) "ON" else "OFF"}")
}

// v462: Lead In Auto Skip462
internal fun PlayerActivity.showV462LeadInAutoSkip462Toggle() {
    val current = BiliClient.prefs.v462leadInAutoSkip462
    BiliClient.prefs.v462leadInAutoSkip462 = !current
    AppToast.show(this, "Lead In Auto Skip462: ${if (!current) "ON" else "OFF"}")
}

// v462: Lens Correction462
internal fun PlayerActivity.showV462LensCorrection462Toggle() {
    val current = BiliClient.prefs.v462lensCorrection462
    BiliClient.prefs.v462lensCorrection462 = !current
    AppToast.show(this, "Lens Correction462: ${if (!current) "ON" else "OFF"}")
}

// v462: Level Auto Adjust462
internal fun PlayerActivity.showV462LevelAutoAdjust462Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v462levelAutoAdjust462).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust462",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v462levelAutoAdjust462 = value
        AppToast.show(this, "Level Auto Adjust462: $value")
    }
}

// v462: Light Adaptive462
internal fun PlayerActivity.showV462LightAdaptive462Toggle() {
    val current = BiliClient.prefs.v462lightAdaptive462
    BiliClient.prefs.v462lightAdaptive462 = !current
    AppToast.show(this, "Light Adaptive462: ${if (!current) "ON" else "OFF"}")
}

// v462: Limit Bandwidth Auto462
internal fun PlayerActivity.showV462LimitBandwidthAuto462Toggle() {
    val current = BiliClient.prefs.v462limitBandwidthAuto462
    BiliClient.prefs.v462limitBandwidthAuto462 = !current
    AppToast.show(this, "Limit Bandwidth Auto462: ${if (!current) "ON" else "OFF"}")
}

// v462: Line Spacing Adjust462
internal fun PlayerActivity.showV462LineSpacingAdjust462Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v462lineSpacingAdjust462).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust462",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v462lineSpacingAdjust462 = value
        AppToast.show(this, "Line Spacing Adjust462: $value")
    }
}

// v462: Link Preview Auto462
internal fun PlayerActivity.showV462LinkPreviewAuto462Toggle() {
    val current = BiliClient.prefs.v462linkPreviewAuto462
    BiliClient.prefs.v462linkPreviewAuto462 = !current
    AppToast.show(this, "Link Preview Auto462: ${if (!current) "ON" else "OFF"}")
}

// v462: List Animation462
internal fun PlayerActivity.showV462ListAnimation462Toggle() {
    val current = BiliClient.prefs.v462listAnimation462
    BiliClient.prefs.v462listAnimation462 = !current
    AppToast.show(this, "List Animation462: ${if (!current) "ON" else "OFF"}")
}

// v462: Load Priority High462
internal fun PlayerActivity.showV462LoadPriorityHigh462Toggle() {
    val current = BiliClient.prefs.v462loadPriorityHigh462
    BiliClient.prefs.v462loadPriorityHigh462 = !current
    AppToast.show(this, "Load Priority High462: ${if (!current) "ON" else "OFF"}")
}

// v462: Local Cache Enabled462
internal fun PlayerActivity.showV462LocalCacheEnabled462Toggle() {
    val current = BiliClient.prefs.v462localCacheEnabled462
    BiliClient.prefs.v462localCacheEnabled462 = !current
    AppToast.show(this, "Local Cache Enabled462: ${if (!current) "ON" else "OFF"}")
}

// v462: Location Based Rec462
internal fun PlayerActivity.showV462LocationBasedRec462Toggle() {
    val current = BiliClient.prefs.v462locationBasedRec462
    BiliClient.prefs.v462locationBasedRec462 = !current
    AppToast.show(this, "Location Based Rec462: ${if (!current) "ON" else "OFF"}")
}

// v463: Key Mapping Custom463
internal fun PlayerActivity.showV463KeyMappingCustom463Toggle() {
    val current = BiliClient.prefs.v463keyMappingCustom463
    BiliClient.prefs.v463keyMappingCustom463 = !current
    AppToast.show(this, "Key Mapping Custom463: ${if (!current) "ON" else "OFF"}")
}

// v463: Label Auto Generate463
internal fun PlayerActivity.showV463LabelAutoGenerate463Toggle() {
    val current = BiliClient.prefs.v463labelAutoGenerate463
    BiliClient.prefs.v463labelAutoGenerate463 = !current
    AppToast.show(this, "Label Auto Generate463: ${if (!current) "ON" else "OFF"}")
}

// v463: Layer Auto Composite463
internal fun PlayerActivity.showV463LayerAutoComposite463Toggle() {
    val current = BiliClient.prefs.v463layerAutoComposite463
    BiliClient.prefs.v463layerAutoComposite463 = !current
    AppToast.show(this, "Layer Auto Composite463: ${if (!current) "ON" else "OFF"}")
}

// v463: Lazy Load Enabled463
internal fun PlayerActivity.showV463LazyLoadEnabled463Toggle() {
    val current = BiliClient.prefs.v463lazyLoadEnabled463
    BiliClient.prefs.v463lazyLoadEnabled463 = !current
    AppToast.show(this, "Lazy Load Enabled463: ${if (!current) "ON" else "OFF"}")
}

// v463: Lead In Auto Skip463
internal fun PlayerActivity.showV463LeadInAutoSkip463Toggle() {
    val current = BiliClient.prefs.v463leadInAutoSkip463
    BiliClient.prefs.v463leadInAutoSkip463 = !current
    AppToast.show(this, "Lead In Auto Skip463: ${if (!current) "ON" else "OFF"}")
}

// v463: Lens Correction463
internal fun PlayerActivity.showV463LensCorrection463Toggle() {
    val current = BiliClient.prefs.v463lensCorrection463
    BiliClient.prefs.v463lensCorrection463 = !current
    AppToast.show(this, "Lens Correction463: ${if (!current) "ON" else "OFF"}")
}

// v463: Level Auto Adjust463
internal fun PlayerActivity.showV463LevelAutoAdjust463Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v463levelAutoAdjust463).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust463",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v463levelAutoAdjust463 = value
        AppToast.show(this, "Level Auto Adjust463: $value")
    }
}

// v463: Light Adaptive463
internal fun PlayerActivity.showV463LightAdaptive463Toggle() {
    val current = BiliClient.prefs.v463lightAdaptive463
    BiliClient.prefs.v463lightAdaptive463 = !current
    AppToast.show(this, "Light Adaptive463: ${if (!current) "ON" else "OFF"}")
}

// v463: Limit Bandwidth Auto463
internal fun PlayerActivity.showV463LimitBandwidthAuto463Toggle() {
    val current = BiliClient.prefs.v463limitBandwidthAuto463
    BiliClient.prefs.v463limitBandwidthAuto463 = !current
    AppToast.show(this, "Limit Bandwidth Auto463: ${if (!current) "ON" else "OFF"}")
}

// v463: Line Spacing Adjust463
internal fun PlayerActivity.showV463LineSpacingAdjust463Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v463lineSpacingAdjust463).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust463",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v463lineSpacingAdjust463 = value
        AppToast.show(this, "Line Spacing Adjust463: $value")
    }
}

// v463: Link Preview Auto463
internal fun PlayerActivity.showV463LinkPreviewAuto463Toggle() {
    val current = BiliClient.prefs.v463linkPreviewAuto463
    BiliClient.prefs.v463linkPreviewAuto463 = !current
    AppToast.show(this, "Link Preview Auto463: ${if (!current) "ON" else "OFF"}")
}

// v463: List Animation463
internal fun PlayerActivity.showV463ListAnimation463Toggle() {
    val current = BiliClient.prefs.v463listAnimation463
    BiliClient.prefs.v463listAnimation463 = !current
    AppToast.show(this, "List Animation463: ${if (!current) "ON" else "OFF"}")
}

// v463: Load Priority High463
internal fun PlayerActivity.showV463LoadPriorityHigh463Toggle() {
    val current = BiliClient.prefs.v463loadPriorityHigh463
    BiliClient.prefs.v463loadPriorityHigh463 = !current
    AppToast.show(this, "Load Priority High463: ${if (!current) "ON" else "OFF"}")
}

// v463: Local Cache Enabled463
internal fun PlayerActivity.showV463LocalCacheEnabled463Toggle() {
    val current = BiliClient.prefs.v463localCacheEnabled463
    BiliClient.prefs.v463localCacheEnabled463 = !current
    AppToast.show(this, "Local Cache Enabled463: ${if (!current) "ON" else "OFF"}")
}

// v463: Location Based Rec463
internal fun PlayerActivity.showV463LocationBasedRec463Toggle() {
    val current = BiliClient.prefs.v463locationBasedRec463
    BiliClient.prefs.v463locationBasedRec463 = !current
    AppToast.show(this, "Location Based Rec463: ${if (!current) "ON" else "OFF"}")
}

// v464: Key Mapping Custom464
internal fun PlayerActivity.showV464KeyMappingCustom464Toggle() {
    val current = BiliClient.prefs.v464keyMappingCustom464
    BiliClient.prefs.v464keyMappingCustom464 = !current
    AppToast.show(this, "Key Mapping Custom464: ${if (!current) "ON" else "OFF"}")
}

// v464: Label Auto Generate464
internal fun PlayerActivity.showV464LabelAutoGenerate464Toggle() {
    val current = BiliClient.prefs.v464labelAutoGenerate464
    BiliClient.prefs.v464labelAutoGenerate464 = !current
    AppToast.show(this, "Label Auto Generate464: ${if (!current) "ON" else "OFF"}")
}

// v464: Layer Auto Composite464
internal fun PlayerActivity.showV464LayerAutoComposite464Toggle() {
    val current = BiliClient.prefs.v464layerAutoComposite464
    BiliClient.prefs.v464layerAutoComposite464 = !current
    AppToast.show(this, "Layer Auto Composite464: ${if (!current) "ON" else "OFF"}")
}

// v464: Lazy Load Enabled464
internal fun PlayerActivity.showV464LazyLoadEnabled464Toggle() {
    val current = BiliClient.prefs.v464lazyLoadEnabled464
    BiliClient.prefs.v464lazyLoadEnabled464 = !current
    AppToast.show(this, "Lazy Load Enabled464: ${if (!current) "ON" else "OFF"}")
}

// v464: Lead In Auto Skip464
internal fun PlayerActivity.showV464LeadInAutoSkip464Toggle() {
    val current = BiliClient.prefs.v464leadInAutoSkip464
    BiliClient.prefs.v464leadInAutoSkip464 = !current
    AppToast.show(this, "Lead In Auto Skip464: ${if (!current) "ON" else "OFF"}")
}

// v464: Lens Correction464
internal fun PlayerActivity.showV464LensCorrection464Toggle() {
    val current = BiliClient.prefs.v464lensCorrection464
    BiliClient.prefs.v464lensCorrection464 = !current
    AppToast.show(this, "Lens Correction464: ${if (!current) "ON" else "OFF"}")
}

// v464: Level Auto Adjust464
internal fun PlayerActivity.showV464LevelAutoAdjust464Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v464levelAutoAdjust464).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust464",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v464levelAutoAdjust464 = value
        AppToast.show(this, "Level Auto Adjust464: $value")
    }
}

// v464: Light Adaptive464
internal fun PlayerActivity.showV464LightAdaptive464Toggle() {
    val current = BiliClient.prefs.v464lightAdaptive464
    BiliClient.prefs.v464lightAdaptive464 = !current
    AppToast.show(this, "Light Adaptive464: ${if (!current) "ON" else "OFF"}")
}

// v464: Limit Bandwidth Auto464
internal fun PlayerActivity.showV464LimitBandwidthAuto464Toggle() {
    val current = BiliClient.prefs.v464limitBandwidthAuto464
    BiliClient.prefs.v464limitBandwidthAuto464 = !current
    AppToast.show(this, "Limit Bandwidth Auto464: ${if (!current) "ON" else "OFF"}")
}

// v464: Line Spacing Adjust464
internal fun PlayerActivity.showV464LineSpacingAdjust464Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v464lineSpacingAdjust464).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust464",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v464lineSpacingAdjust464 = value
        AppToast.show(this, "Line Spacing Adjust464: $value")
    }
}

// v464: Link Preview Auto464
internal fun PlayerActivity.showV464LinkPreviewAuto464Toggle() {
    val current = BiliClient.prefs.v464linkPreviewAuto464
    BiliClient.prefs.v464linkPreviewAuto464 = !current
    AppToast.show(this, "Link Preview Auto464: ${if (!current) "ON" else "OFF"}")
}

// v464: List Animation464
internal fun PlayerActivity.showV464ListAnimation464Toggle() {
    val current = BiliClient.prefs.v464listAnimation464
    BiliClient.prefs.v464listAnimation464 = !current
    AppToast.show(this, "List Animation464: ${if (!current) "ON" else "OFF"}")
}

// v464: Load Priority High464
internal fun PlayerActivity.showV464LoadPriorityHigh464Toggle() {
    val current = BiliClient.prefs.v464loadPriorityHigh464
    BiliClient.prefs.v464loadPriorityHigh464 = !current
    AppToast.show(this, "Load Priority High464: ${if (!current) "ON" else "OFF"}")
}

// v464: Local Cache Enabled464
internal fun PlayerActivity.showV464LocalCacheEnabled464Toggle() {
    val current = BiliClient.prefs.v464localCacheEnabled464
    BiliClient.prefs.v464localCacheEnabled464 = !current
    AppToast.show(this, "Local Cache Enabled464: ${if (!current) "ON" else "OFF"}")
}

// v464: Location Based Rec464
internal fun PlayerActivity.showV464LocationBasedRec464Toggle() {
    val current = BiliClient.prefs.v464locationBasedRec464
    BiliClient.prefs.v464locationBasedRec464 = !current
    AppToast.show(this, "Location Based Rec464: ${if (!current) "ON" else "OFF"}")
}

// v465: Key Mapping Custom465
internal fun PlayerActivity.showV465KeyMappingCustom465Toggle() {
    val current = BiliClient.prefs.v465keyMappingCustom465
    BiliClient.prefs.v465keyMappingCustom465 = !current
    AppToast.show(this, "Key Mapping Custom465: ${if (!current) "ON" else "OFF"}")
}

// v465: Label Auto Generate465
internal fun PlayerActivity.showV465LabelAutoGenerate465Toggle() {
    val current = BiliClient.prefs.v465labelAutoGenerate465
    BiliClient.prefs.v465labelAutoGenerate465 = !current
    AppToast.show(this, "Label Auto Generate465: ${if (!current) "ON" else "OFF"}")
}

// v465: Layer Auto Composite465
internal fun PlayerActivity.showV465LayerAutoComposite465Toggle() {
    val current = BiliClient.prefs.v465layerAutoComposite465
    BiliClient.prefs.v465layerAutoComposite465 = !current
    AppToast.show(this, "Layer Auto Composite465: ${if (!current) "ON" else "OFF"}")
}

// v465: Lazy Load Enabled465
internal fun PlayerActivity.showV465LazyLoadEnabled465Toggle() {
    val current = BiliClient.prefs.v465lazyLoadEnabled465
    BiliClient.prefs.v465lazyLoadEnabled465 = !current
    AppToast.show(this, "Lazy Load Enabled465: ${if (!current) "ON" else "OFF"}")
}

// v465: Lead In Auto Skip465
internal fun PlayerActivity.showV465LeadInAutoSkip465Toggle() {
    val current = BiliClient.prefs.v465leadInAutoSkip465
    BiliClient.prefs.v465leadInAutoSkip465 = !current
    AppToast.show(this, "Lead In Auto Skip465: ${if (!current) "ON" else "OFF"}")
}

// v465: Lens Correction465
internal fun PlayerActivity.showV465LensCorrection465Toggle() {
    val current = BiliClient.prefs.v465lensCorrection465
    BiliClient.prefs.v465lensCorrection465 = !current
    AppToast.show(this, "Lens Correction465: ${if (!current) "ON" else "OFF"}")
}

// v465: Level Auto Adjust465
internal fun PlayerActivity.showV465LevelAutoAdjust465Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v465levelAutoAdjust465).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust465",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v465levelAutoAdjust465 = value
        AppToast.show(this, "Level Auto Adjust465: $value")
    }
}

// v465: Light Adaptive465
internal fun PlayerActivity.showV465LightAdaptive465Toggle() {
    val current = BiliClient.prefs.v465lightAdaptive465
    BiliClient.prefs.v465lightAdaptive465 = !current
    AppToast.show(this, "Light Adaptive465: ${if (!current) "ON" else "OFF"}")
}

// v465: Limit Bandwidth Auto465
internal fun PlayerActivity.showV465LimitBandwidthAuto465Toggle() {
    val current = BiliClient.prefs.v465limitBandwidthAuto465
    BiliClient.prefs.v465limitBandwidthAuto465 = !current
    AppToast.show(this, "Limit Bandwidth Auto465: ${if (!current) "ON" else "OFF"}")
}

// v465: Line Spacing Adjust465
internal fun PlayerActivity.showV465LineSpacingAdjust465Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v465lineSpacingAdjust465).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust465",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v465lineSpacingAdjust465 = value
        AppToast.show(this, "Line Spacing Adjust465: $value")
    }
}

// v465: Link Preview Auto465
internal fun PlayerActivity.showV465LinkPreviewAuto465Toggle() {
    val current = BiliClient.prefs.v465linkPreviewAuto465
    BiliClient.prefs.v465linkPreviewAuto465 = !current
    AppToast.show(this, "Link Preview Auto465: ${if (!current) "ON" else "OFF"}")
}

// v465: List Animation465
internal fun PlayerActivity.showV465ListAnimation465Toggle() {
    val current = BiliClient.prefs.v465listAnimation465
    BiliClient.prefs.v465listAnimation465 = !current
    AppToast.show(this, "List Animation465: ${if (!current) "ON" else "OFF"}")
}

// v465: Load Priority High465
internal fun PlayerActivity.showV465LoadPriorityHigh465Toggle() {
    val current = BiliClient.prefs.v465loadPriorityHigh465
    BiliClient.prefs.v465loadPriorityHigh465 = !current
    AppToast.show(this, "Load Priority High465: ${if (!current) "ON" else "OFF"}")
}

// v465: Local Cache Enabled465
internal fun PlayerActivity.showV465LocalCacheEnabled465Toggle() {
    val current = BiliClient.prefs.v465localCacheEnabled465
    BiliClient.prefs.v465localCacheEnabled465 = !current
    AppToast.show(this, "Local Cache Enabled465: ${if (!current) "ON" else "OFF"}")
}

// v465: Location Based Rec465
internal fun PlayerActivity.showV465LocationBasedRec465Toggle() {
    val current = BiliClient.prefs.v465locationBasedRec465
    BiliClient.prefs.v465locationBasedRec465 = !current
    AppToast.show(this, "Location Based Rec465: ${if (!current) "ON" else "OFF"}")
}

// v466: Key Mapping Custom466
internal fun PlayerActivity.showV466KeyMappingCustom466Toggle() {
    val current = BiliClient.prefs.v466keyMappingCustom466
    BiliClient.prefs.v466keyMappingCustom466 = !current
    AppToast.show(this, "Key Mapping Custom466: ${if (!current) "ON" else "OFF"}")
}

// v466: Label Auto Generate466
internal fun PlayerActivity.showV466LabelAutoGenerate466Toggle() {
    val current = BiliClient.prefs.v466labelAutoGenerate466
    BiliClient.prefs.v466labelAutoGenerate466 = !current
    AppToast.show(this, "Label Auto Generate466: ${if (!current) "ON" else "OFF"}")
}

// v466: Layer Auto Composite466
internal fun PlayerActivity.showV466LayerAutoComposite466Toggle() {
    val current = BiliClient.prefs.v466layerAutoComposite466
    BiliClient.prefs.v466layerAutoComposite466 = !current
    AppToast.show(this, "Layer Auto Composite466: ${if (!current) "ON" else "OFF"}")
}

// v466: Lazy Load Enabled466
internal fun PlayerActivity.showV466LazyLoadEnabled466Toggle() {
    val current = BiliClient.prefs.v466lazyLoadEnabled466
    BiliClient.prefs.v466lazyLoadEnabled466 = !current
    AppToast.show(this, "Lazy Load Enabled466: ${if (!current) "ON" else "OFF"}")
}

// v466: Lead In Auto Skip466
internal fun PlayerActivity.showV466LeadInAutoSkip466Toggle() {
    val current = BiliClient.prefs.v466leadInAutoSkip466
    BiliClient.prefs.v466leadInAutoSkip466 = !current
    AppToast.show(this, "Lead In Auto Skip466: ${if (!current) "ON" else "OFF"}")
}

// v466: Lens Correction466
internal fun PlayerActivity.showV466LensCorrection466Toggle() {
    val current = BiliClient.prefs.v466lensCorrection466
    BiliClient.prefs.v466lensCorrection466 = !current
    AppToast.show(this, "Lens Correction466: ${if (!current) "ON" else "OFF"}")
}

// v466: Level Auto Adjust466
internal fun PlayerActivity.showV466LevelAutoAdjust466Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v466levelAutoAdjust466).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust466",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v466levelAutoAdjust466 = value
        AppToast.show(this, "Level Auto Adjust466: $value")
    }
}

// v466: Light Adaptive466
internal fun PlayerActivity.showV466LightAdaptive466Toggle() {
    val current = BiliClient.prefs.v466lightAdaptive466
    BiliClient.prefs.v466lightAdaptive466 = !current
    AppToast.show(this, "Light Adaptive466: ${if (!current) "ON" else "OFF"}")
}

// v466: Limit Bandwidth Auto466
internal fun PlayerActivity.showV466LimitBandwidthAuto466Toggle() {
    val current = BiliClient.prefs.v466limitBandwidthAuto466
    BiliClient.prefs.v466limitBandwidthAuto466 = !current
    AppToast.show(this, "Limit Bandwidth Auto466: ${if (!current) "ON" else "OFF"}")
}

// v466: Line Spacing Adjust466
internal fun PlayerActivity.showV466LineSpacingAdjust466Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v466lineSpacingAdjust466).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust466",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v466lineSpacingAdjust466 = value
        AppToast.show(this, "Line Spacing Adjust466: $value")
    }
}

// v466: Link Preview Auto466
internal fun PlayerActivity.showV466LinkPreviewAuto466Toggle() {
    val current = BiliClient.prefs.v466linkPreviewAuto466
    BiliClient.prefs.v466linkPreviewAuto466 = !current
    AppToast.show(this, "Link Preview Auto466: ${if (!current) "ON" else "OFF"}")
}

// v466: List Animation466
internal fun PlayerActivity.showV466ListAnimation466Toggle() {
    val current = BiliClient.prefs.v466listAnimation466
    BiliClient.prefs.v466listAnimation466 = !current
    AppToast.show(this, "List Animation466: ${if (!current) "ON" else "OFF"}")
}

// v466: Load Priority High466
internal fun PlayerActivity.showV466LoadPriorityHigh466Toggle() {
    val current = BiliClient.prefs.v466loadPriorityHigh466
    BiliClient.prefs.v466loadPriorityHigh466 = !current
    AppToast.show(this, "Load Priority High466: ${if (!current) "ON" else "OFF"}")
}

// v466: Local Cache Enabled466
internal fun PlayerActivity.showV466LocalCacheEnabled466Toggle() {
    val current = BiliClient.prefs.v466localCacheEnabled466
    BiliClient.prefs.v466localCacheEnabled466 = !current
    AppToast.show(this, "Local Cache Enabled466: ${if (!current) "ON" else "OFF"}")
}

// v466: Location Based Rec466
internal fun PlayerActivity.showV466LocationBasedRec466Toggle() {
    val current = BiliClient.prefs.v466locationBasedRec466
    BiliClient.prefs.v466locationBasedRec466 = !current
    AppToast.show(this, "Location Based Rec466: ${if (!current) "ON" else "OFF"}")
}

// v467: Key Mapping Custom467
internal fun PlayerActivity.showV467KeyMappingCustom467Toggle() {
    val current = BiliClient.prefs.v467keyMappingCustom467
    BiliClient.prefs.v467keyMappingCustom467 = !current
    AppToast.show(this, "Key Mapping Custom467: ${if (!current) "ON" else "OFF"}")
}

// v467: Label Auto Generate467
internal fun PlayerActivity.showV467LabelAutoGenerate467Toggle() {
    val current = BiliClient.prefs.v467labelAutoGenerate467
    BiliClient.prefs.v467labelAutoGenerate467 = !current
    AppToast.show(this, "Label Auto Generate467: ${if (!current) "ON" else "OFF"}")
}

// v467: Layer Auto Composite467
internal fun PlayerActivity.showV467LayerAutoComposite467Toggle() {
    val current = BiliClient.prefs.v467layerAutoComposite467
    BiliClient.prefs.v467layerAutoComposite467 = !current
    AppToast.show(this, "Layer Auto Composite467: ${if (!current) "ON" else "OFF"}")
}

// v467: Lazy Load Enabled467
internal fun PlayerActivity.showV467LazyLoadEnabled467Toggle() {
    val current = BiliClient.prefs.v467lazyLoadEnabled467
    BiliClient.prefs.v467lazyLoadEnabled467 = !current
    AppToast.show(this, "Lazy Load Enabled467: ${if (!current) "ON" else "OFF"}")
}

// v467: Lead In Auto Skip467
internal fun PlayerActivity.showV467LeadInAutoSkip467Toggle() {
    val current = BiliClient.prefs.v467leadInAutoSkip467
    BiliClient.prefs.v467leadInAutoSkip467 = !current
    AppToast.show(this, "Lead In Auto Skip467: ${if (!current) "ON" else "OFF"}")
}

// v467: Lens Correction467
internal fun PlayerActivity.showV467LensCorrection467Toggle() {
    val current = BiliClient.prefs.v467lensCorrection467
    BiliClient.prefs.v467lensCorrection467 = !current
    AppToast.show(this, "Lens Correction467: ${if (!current) "ON" else "OFF"}")
}

// v467: Level Auto Adjust467
internal fun PlayerActivity.showV467LevelAutoAdjust467Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v467levelAutoAdjust467).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust467",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v467levelAutoAdjust467 = value
        AppToast.show(this, "Level Auto Adjust467: $value")
    }
}

// v467: Light Adaptive467
internal fun PlayerActivity.showV467LightAdaptive467Toggle() {
    val current = BiliClient.prefs.v467lightAdaptive467
    BiliClient.prefs.v467lightAdaptive467 = !current
    AppToast.show(this, "Light Adaptive467: ${if (!current) "ON" else "OFF"}")
}

// v467: Limit Bandwidth Auto467
internal fun PlayerActivity.showV467LimitBandwidthAuto467Toggle() {
    val current = BiliClient.prefs.v467limitBandwidthAuto467
    BiliClient.prefs.v467limitBandwidthAuto467 = !current
    AppToast.show(this, "Limit Bandwidth Auto467: ${if (!current) "ON" else "OFF"}")
}

// v467: Line Spacing Adjust467
internal fun PlayerActivity.showV467LineSpacingAdjust467Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v467lineSpacingAdjust467).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust467",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v467lineSpacingAdjust467 = value
        AppToast.show(this, "Line Spacing Adjust467: $value")
    }
}

// v467: Link Preview Auto467
internal fun PlayerActivity.showV467LinkPreviewAuto467Toggle() {
    val current = BiliClient.prefs.v467linkPreviewAuto467
    BiliClient.prefs.v467linkPreviewAuto467 = !current
    AppToast.show(this, "Link Preview Auto467: ${if (!current) "ON" else "OFF"}")
}

// v467: List Animation467
internal fun PlayerActivity.showV467ListAnimation467Toggle() {
    val current = BiliClient.prefs.v467listAnimation467
    BiliClient.prefs.v467listAnimation467 = !current
    AppToast.show(this, "List Animation467: ${if (!current) "ON" else "OFF"}")
}

// v467: Load Priority High467
internal fun PlayerActivity.showV467LoadPriorityHigh467Toggle() {
    val current = BiliClient.prefs.v467loadPriorityHigh467
    BiliClient.prefs.v467loadPriorityHigh467 = !current
    AppToast.show(this, "Load Priority High467: ${if (!current) "ON" else "OFF"}")
}

// v467: Local Cache Enabled467
internal fun PlayerActivity.showV467LocalCacheEnabled467Toggle() {
    val current = BiliClient.prefs.v467localCacheEnabled467
    BiliClient.prefs.v467localCacheEnabled467 = !current
    AppToast.show(this, "Local Cache Enabled467: ${if (!current) "ON" else "OFF"}")
}

// v467: Location Based Rec467
internal fun PlayerActivity.showV467LocationBasedRec467Toggle() {
    val current = BiliClient.prefs.v467locationBasedRec467
    BiliClient.prefs.v467locationBasedRec467 = !current
    AppToast.show(this, "Location Based Rec467: ${if (!current) "ON" else "OFF"}")
}

// v468: Key Mapping Custom468
internal fun PlayerActivity.showV468KeyMappingCustom468Toggle() {
    val current = BiliClient.prefs.v468keyMappingCustom468
    BiliClient.prefs.v468keyMappingCustom468 = !current
    AppToast.show(this, "Key Mapping Custom468: ${if (!current) "ON" else "OFF"}")
}

// v468: Label Auto Generate468
internal fun PlayerActivity.showV468LabelAutoGenerate468Toggle() {
    val current = BiliClient.prefs.v468labelAutoGenerate468
    BiliClient.prefs.v468labelAutoGenerate468 = !current
    AppToast.show(this, "Label Auto Generate468: ${if (!current) "ON" else "OFF"}")
}

// v468: Layer Auto Composite468
internal fun PlayerActivity.showV468LayerAutoComposite468Toggle() {
    val current = BiliClient.prefs.v468layerAutoComposite468
    BiliClient.prefs.v468layerAutoComposite468 = !current
    AppToast.show(this, "Layer Auto Composite468: ${if (!current) "ON" else "OFF"}")
}

// v468: Lazy Load Enabled468
internal fun PlayerActivity.showV468LazyLoadEnabled468Toggle() {
    val current = BiliClient.prefs.v468lazyLoadEnabled468
    BiliClient.prefs.v468lazyLoadEnabled468 = !current
    AppToast.show(this, "Lazy Load Enabled468: ${if (!current) "ON" else "OFF"}")
}

// v468: Lead In Auto Skip468
internal fun PlayerActivity.showV468LeadInAutoSkip468Toggle() {
    val current = BiliClient.prefs.v468leadInAutoSkip468
    BiliClient.prefs.v468leadInAutoSkip468 = !current
    AppToast.show(this, "Lead In Auto Skip468: ${if (!current) "ON" else "OFF"}")
}

// v468: Lens Correction468
internal fun PlayerActivity.showV468LensCorrection468Toggle() {
    val current = BiliClient.prefs.v468lensCorrection468
    BiliClient.prefs.v468lensCorrection468 = !current
    AppToast.show(this, "Lens Correction468: ${if (!current) "ON" else "OFF"}")
}

// v468: Level Auto Adjust468
internal fun PlayerActivity.showV468LevelAutoAdjust468Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v468levelAutoAdjust468).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust468",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v468levelAutoAdjust468 = value
        AppToast.show(this, "Level Auto Adjust468: $value")
    }
}

// v468: Light Adaptive468
internal fun PlayerActivity.showV468LightAdaptive468Toggle() {
    val current = BiliClient.prefs.v468lightAdaptive468
    BiliClient.prefs.v468lightAdaptive468 = !current
    AppToast.show(this, "Light Adaptive468: ${if (!current) "ON" else "OFF"}")
}

// v468: Limit Bandwidth Auto468
internal fun PlayerActivity.showV468LimitBandwidthAuto468Toggle() {
    val current = BiliClient.prefs.v468limitBandwidthAuto468
    BiliClient.prefs.v468limitBandwidthAuto468 = !current
    AppToast.show(this, "Limit Bandwidth Auto468: ${if (!current) "ON" else "OFF"}")
}

// v468: Line Spacing Adjust468
internal fun PlayerActivity.showV468LineSpacingAdjust468Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v468lineSpacingAdjust468).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust468",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v468lineSpacingAdjust468 = value
        AppToast.show(this, "Line Spacing Adjust468: $value")
    }
}

// v468: Link Preview Auto468
internal fun PlayerActivity.showV468LinkPreviewAuto468Toggle() {
    val current = BiliClient.prefs.v468linkPreviewAuto468
    BiliClient.prefs.v468linkPreviewAuto468 = !current
    AppToast.show(this, "Link Preview Auto468: ${if (!current) "ON" else "OFF"}")
}

// v468: List Animation468
internal fun PlayerActivity.showV468ListAnimation468Toggle() {
    val current = BiliClient.prefs.v468listAnimation468
    BiliClient.prefs.v468listAnimation468 = !current
    AppToast.show(this, "List Animation468: ${if (!current) "ON" else "OFF"}")
}

// v468: Load Priority High468
internal fun PlayerActivity.showV468LoadPriorityHigh468Toggle() {
    val current = BiliClient.prefs.v468loadPriorityHigh468
    BiliClient.prefs.v468loadPriorityHigh468 = !current
    AppToast.show(this, "Load Priority High468: ${if (!current) "ON" else "OFF"}")
}

// v468: Local Cache Enabled468
internal fun PlayerActivity.showV468LocalCacheEnabled468Toggle() {
    val current = BiliClient.prefs.v468localCacheEnabled468
    BiliClient.prefs.v468localCacheEnabled468 = !current
    AppToast.show(this, "Local Cache Enabled468: ${if (!current) "ON" else "OFF"}")
}

// v468: Location Based Rec468
internal fun PlayerActivity.showV468LocationBasedRec468Toggle() {
    val current = BiliClient.prefs.v468locationBasedRec468
    BiliClient.prefs.v468locationBasedRec468 = !current
    AppToast.show(this, "Location Based Rec468: ${if (!current) "ON" else "OFF"}")
}

// v469: Key Mapping Custom469
internal fun PlayerActivity.showV469KeyMappingCustom469Toggle() {
    val current = BiliClient.prefs.v469keyMappingCustom469
    BiliClient.prefs.v469keyMappingCustom469 = !current
    AppToast.show(this, "Key Mapping Custom469: ${if (!current) "ON" else "OFF"}")
}

// v469: Label Auto Generate469
internal fun PlayerActivity.showV469LabelAutoGenerate469Toggle() {
    val current = BiliClient.prefs.v469labelAutoGenerate469
    BiliClient.prefs.v469labelAutoGenerate469 = !current
    AppToast.show(this, "Label Auto Generate469: ${if (!current) "ON" else "OFF"}")
}

// v469: Layer Auto Composite469
internal fun PlayerActivity.showV469LayerAutoComposite469Toggle() {
    val current = BiliClient.prefs.v469layerAutoComposite469
    BiliClient.prefs.v469layerAutoComposite469 = !current
    AppToast.show(this, "Layer Auto Composite469: ${if (!current) "ON" else "OFF"}")
}

// v469: Lazy Load Enabled469
internal fun PlayerActivity.showV469LazyLoadEnabled469Toggle() {
    val current = BiliClient.prefs.v469lazyLoadEnabled469
    BiliClient.prefs.v469lazyLoadEnabled469 = !current
    AppToast.show(this, "Lazy Load Enabled469: ${if (!current) "ON" else "OFF"}")
}

// v469: Lead In Auto Skip469
internal fun PlayerActivity.showV469LeadInAutoSkip469Toggle() {
    val current = BiliClient.prefs.v469leadInAutoSkip469
    BiliClient.prefs.v469leadInAutoSkip469 = !current
    AppToast.show(this, "Lead In Auto Skip469: ${if (!current) "ON" else "OFF"}")
}

// v469: Lens Correction469
internal fun PlayerActivity.showV469LensCorrection469Toggle() {
    val current = BiliClient.prefs.v469lensCorrection469
    BiliClient.prefs.v469lensCorrection469 = !current
    AppToast.show(this, "Lens Correction469: ${if (!current) "ON" else "OFF"}")
}

// v469: Level Auto Adjust469
internal fun PlayerActivity.showV469LevelAutoAdjust469Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v469levelAutoAdjust469).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust469",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v469levelAutoAdjust469 = value
        AppToast.show(this, "Level Auto Adjust469: $value")
    }
}

// v469: Light Adaptive469
internal fun PlayerActivity.showV469LightAdaptive469Toggle() {
    val current = BiliClient.prefs.v469lightAdaptive469
    BiliClient.prefs.v469lightAdaptive469 = !current
    AppToast.show(this, "Light Adaptive469: ${if (!current) "ON" else "OFF"}")
}

// v469: Limit Bandwidth Auto469
internal fun PlayerActivity.showV469LimitBandwidthAuto469Toggle() {
    val current = BiliClient.prefs.v469limitBandwidthAuto469
    BiliClient.prefs.v469limitBandwidthAuto469 = !current
    AppToast.show(this, "Limit Bandwidth Auto469: ${if (!current) "ON" else "OFF"}")
}

// v469: Line Spacing Adjust469
internal fun PlayerActivity.showV469LineSpacingAdjust469Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v469lineSpacingAdjust469).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust469",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v469lineSpacingAdjust469 = value
        AppToast.show(this, "Line Spacing Adjust469: $value")
    }
}

// v469: Link Preview Auto469
internal fun PlayerActivity.showV469LinkPreviewAuto469Toggle() {
    val current = BiliClient.prefs.v469linkPreviewAuto469
    BiliClient.prefs.v469linkPreviewAuto469 = !current
    AppToast.show(this, "Link Preview Auto469: ${if (!current) "ON" else "OFF"}")
}

// v469: List Animation469
internal fun PlayerActivity.showV469ListAnimation469Toggle() {
    val current = BiliClient.prefs.v469listAnimation469
    BiliClient.prefs.v469listAnimation469 = !current
    AppToast.show(this, "List Animation469: ${if (!current) "ON" else "OFF"}")
}

// v469: Load Priority High469
internal fun PlayerActivity.showV469LoadPriorityHigh469Toggle() {
    val current = BiliClient.prefs.v469loadPriorityHigh469
    BiliClient.prefs.v469loadPriorityHigh469 = !current
    AppToast.show(this, "Load Priority High469: ${if (!current) "ON" else "OFF"}")
}

// v469: Local Cache Enabled469
internal fun PlayerActivity.showV469LocalCacheEnabled469Toggle() {
    val current = BiliClient.prefs.v469localCacheEnabled469
    BiliClient.prefs.v469localCacheEnabled469 = !current
    AppToast.show(this, "Local Cache Enabled469: ${if (!current) "ON" else "OFF"}")
}

// v469: Location Based Rec469
internal fun PlayerActivity.showV469LocationBasedRec469Toggle() {
    val current = BiliClient.prefs.v469locationBasedRec469
    BiliClient.prefs.v469locationBasedRec469 = !current
    AppToast.show(this, "Location Based Rec469: ${if (!current) "ON" else "OFF"}")
}

// v470: Key Mapping Custom470
internal fun PlayerActivity.showV470KeyMappingCustom470Toggle() {
    val current = BiliClient.prefs.v470keyMappingCustom470
    BiliClient.prefs.v470keyMappingCustom470 = !current
    AppToast.show(this, "Key Mapping Custom470: ${if (!current) "ON" else "OFF"}")
}

// v470: Label Auto Generate470
internal fun PlayerActivity.showV470LabelAutoGenerate470Toggle() {
    val current = BiliClient.prefs.v470labelAutoGenerate470
    BiliClient.prefs.v470labelAutoGenerate470 = !current
    AppToast.show(this, "Label Auto Generate470: ${if (!current) "ON" else "OFF"}")
}

// v470: Layer Auto Composite470
internal fun PlayerActivity.showV470LayerAutoComposite470Toggle() {
    val current = BiliClient.prefs.v470layerAutoComposite470
    BiliClient.prefs.v470layerAutoComposite470 = !current
    AppToast.show(this, "Layer Auto Composite470: ${if (!current) "ON" else "OFF"}")
}

// v470: Lazy Load Enabled470
internal fun PlayerActivity.showV470LazyLoadEnabled470Toggle() {
    val current = BiliClient.prefs.v470lazyLoadEnabled470
    BiliClient.prefs.v470lazyLoadEnabled470 = !current
    AppToast.show(this, "Lazy Load Enabled470: ${if (!current) "ON" else "OFF"}")
}

// v470: Lead In Auto Skip470
internal fun PlayerActivity.showV470LeadInAutoSkip470Toggle() {
    val current = BiliClient.prefs.v470leadInAutoSkip470
    BiliClient.prefs.v470leadInAutoSkip470 = !current
    AppToast.show(this, "Lead In Auto Skip470: ${if (!current) "ON" else "OFF"}")
}

// v470: Lens Correction470
internal fun PlayerActivity.showV470LensCorrection470Toggle() {
    val current = BiliClient.prefs.v470lensCorrection470
    BiliClient.prefs.v470lensCorrection470 = !current
    AppToast.show(this, "Lens Correction470: ${if (!current) "ON" else "OFF"}")
}

// v470: Level Auto Adjust470
internal fun PlayerActivity.showV470LevelAutoAdjust470Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v470levelAutoAdjust470).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust470",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v470levelAutoAdjust470 = value
        AppToast.show(this, "Level Auto Adjust470: $value")
    }
}

// v470: Light Adaptive470
internal fun PlayerActivity.showV470LightAdaptive470Toggle() {
    val current = BiliClient.prefs.v470lightAdaptive470
    BiliClient.prefs.v470lightAdaptive470 = !current
    AppToast.show(this, "Light Adaptive470: ${if (!current) "ON" else "OFF"}")
}

// v470: Limit Bandwidth Auto470
internal fun PlayerActivity.showV470LimitBandwidthAuto470Toggle() {
    val current = BiliClient.prefs.v470limitBandwidthAuto470
    BiliClient.prefs.v470limitBandwidthAuto470 = !current
    AppToast.show(this, "Limit Bandwidth Auto470: ${if (!current) "ON" else "OFF"}")
}

// v470: Line Spacing Adjust470
internal fun PlayerActivity.showV470LineSpacingAdjust470Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v470lineSpacingAdjust470).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust470",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v470lineSpacingAdjust470 = value
        AppToast.show(this, "Line Spacing Adjust470: $value")
    }
}

// v470: Link Preview Auto470
internal fun PlayerActivity.showV470LinkPreviewAuto470Toggle() {
    val current = BiliClient.prefs.v470linkPreviewAuto470
    BiliClient.prefs.v470linkPreviewAuto470 = !current
    AppToast.show(this, "Link Preview Auto470: ${if (!current) "ON" else "OFF"}")
}

// v470: List Animation470
internal fun PlayerActivity.showV470ListAnimation470Toggle() {
    val current = BiliClient.prefs.v470listAnimation470
    BiliClient.prefs.v470listAnimation470 = !current
    AppToast.show(this, "List Animation470: ${if (!current) "ON" else "OFF"}")
}

// v470: Load Priority High470
internal fun PlayerActivity.showV470LoadPriorityHigh470Toggle() {
    val current = BiliClient.prefs.v470loadPriorityHigh470
    BiliClient.prefs.v470loadPriorityHigh470 = !current
    AppToast.show(this, "Load Priority High470: ${if (!current) "ON" else "OFF"}")
}

// v470: Local Cache Enabled470
internal fun PlayerActivity.showV470LocalCacheEnabled470Toggle() {
    val current = BiliClient.prefs.v470localCacheEnabled470
    BiliClient.prefs.v470localCacheEnabled470 = !current
    AppToast.show(this, "Local Cache Enabled470: ${if (!current) "ON" else "OFF"}")
}

// v470: Location Based Rec470
internal fun PlayerActivity.showV470LocationBasedRec470Toggle() {
    val current = BiliClient.prefs.v470locationBasedRec470
    BiliClient.prefs.v470locationBasedRec470 = !current
    AppToast.show(this, "Location Based Rec470: ${if (!current) "ON" else "OFF"}")
}

// v471: Mark Auto Highlight471
internal fun PlayerActivity.showV471MarkAutoHighlight471Toggle() {
    val current = BiliClient.prefs.v471markAutoHighlight471
    BiliClient.prefs.v471markAutoHighlight471 = !current
    AppToast.show(this, "Mark Auto Highlight471: ${if (!current) "ON" else "OFF"}")
}

// v471: Mask Auto Apply471
internal fun PlayerActivity.showV471MaskAutoApply471Toggle() {
    val current = BiliClient.prefs.v471maskAutoApply471
    BiliClient.prefs.v471maskAutoApply471 = !current
    AppToast.show(this, "Mask Auto Apply471: ${if (!current) "ON" else "OFF"}")
}

// v471: Match Auto Start471
internal fun PlayerActivity.showV471MatchAutoStart471Toggle() {
    val current = BiliClient.prefs.v471matchAutoStart471
    BiliClient.prefs.v471matchAutoStart471 = !current
    AppToast.show(this, "Match Auto Start471: ${if (!current) "ON" else "OFF"}")
}

// v471: Matrix Transform471
internal fun PlayerActivity.showV471MatrixTransform471Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v471matrixTransform471).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform471",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v471matrixTransform471 = value
        AppToast.show(this, "Matrix Transform471: $value")
    }
}

// v471: Max Concurrent Load471
internal fun PlayerActivity.showV471MaxConcurrentLoad471Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v471maxConcurrentLoad471).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load471",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v471maxConcurrentLoad471 = value
        AppToast.show(this, "Max Concurrent Load471: $value")
    }
}

// v471: Measure Auto Calibrate471
internal fun PlayerActivity.showV471MeasureAutoCalibrate471Toggle() {
    val current = BiliClient.prefs.v471measureAutoCalibrate471
    BiliClient.prefs.v471measureAutoCalibrate471 = !current
    AppToast.show(this, "Measure Auto Calibrate471: ${if (!current) "ON" else "OFF"}")
}

// v471: Media Auto Detect471
internal fun PlayerActivity.showV471MediaAutoDetect471Toggle() {
    val current = BiliClient.prefs.v471mediaAutoDetect471
    BiliClient.prefs.v471mediaAutoDetect471 = !current
    AppToast.show(this, "Media Auto Detect471: ${if (!current) "ON" else "OFF"}")
}

// v471: Memory Optimize Auto471
internal fun PlayerActivity.showV471MemoryOptimizeAuto471Toggle() {
    val current = BiliClient.prefs.v471memoryOptimizeAuto471
    BiliClient.prefs.v471memoryOptimizeAuto471 = !current
    AppToast.show(this, "Memory Optimize Auto471: ${if (!current) "ON" else "OFF"}")
}

// v471: Merge Auto Resolve471
internal fun PlayerActivity.showV471MergeAutoResolve471Toggle() {
    val current = BiliClient.prefs.v471mergeAutoResolve471
    BiliClient.prefs.v471mergeAutoResolve471 = !current
    AppToast.show(this, "Merge Auto Resolve471: ${if (!current) "ON" else "OFF"}")
}

// v471: Message Auto Reply471
internal fun PlayerActivity.showV471MessageAutoReply471Toggle() {
    val current = BiliClient.prefs.v471messageAutoReply471
    BiliClient.prefs.v471messageAutoReply471 = !current
    AppToast.show(this, "Message Auto Reply471: ${if (!current) "ON" else "OFF"}")
}

// v471: Method Auto Invoke471
internal fun PlayerActivity.showV471MethodAutoInvoke471Toggle() {
    val current = BiliClient.prefs.v471methodAutoInvoke471
    BiliClient.prefs.v471methodAutoInvoke471 = !current
    AppToast.show(this, "Method Auto Invoke471: ${if (!current) "ON" else "OFF"}")
}

// v471: Mic Auto Mute471
internal fun PlayerActivity.showV471MicAutoMute471Toggle() {
    val current = BiliClient.prefs.v471micAutoMute471
    BiliClient.prefs.v471micAutoMute471 = !current
    AppToast.show(this, "Mic Auto Mute471: ${if (!current) "ON" else "OFF"}")
}

// v471: Min Bitrate Auto471
internal fun PlayerActivity.showV471MinBitrateAuto471Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v471minBitrateAuto471).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto471",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v471minBitrateAuto471 = value
        AppToast.show(this, "Min Bitrate Auto471: $value")
    }
}

// v471: Mode Auto Switch471
internal fun PlayerActivity.showV471ModeAutoSwitch471Toggle() {
    val current = BiliClient.prefs.v471modeAutoSwitch471
    BiliClient.prefs.v471modeAutoSwitch471 = !current
    AppToast.show(this, "Mode Auto Switch471: ${if (!current) "ON" else "OFF"}")
}

// v471: Model Auto Load471
internal fun PlayerActivity.showV471ModelAutoLoad471Toggle() {
    val current = BiliClient.prefs.v471modelAutoLoad471
    BiliClient.prefs.v471modelAutoLoad471 = !current
    AppToast.show(this, "Model Auto Load471: ${if (!current) "ON" else "OFF"}")
}

// v472: Mark Auto Highlight472
internal fun PlayerActivity.showV472MarkAutoHighlight472Toggle() {
    val current = BiliClient.prefs.v472markAutoHighlight472
    BiliClient.prefs.v472markAutoHighlight472 = !current
    AppToast.show(this, "Mark Auto Highlight472: ${if (!current) "ON" else "OFF"}")
}

// v472: Mask Auto Apply472
internal fun PlayerActivity.showV472MaskAutoApply472Toggle() {
    val current = BiliClient.prefs.v472maskAutoApply472
    BiliClient.prefs.v472maskAutoApply472 = !current
    AppToast.show(this, "Mask Auto Apply472: ${if (!current) "ON" else "OFF"}")
}

// v472: Match Auto Start472
internal fun PlayerActivity.showV472MatchAutoStart472Toggle() {
    val current = BiliClient.prefs.v472matchAutoStart472
    BiliClient.prefs.v472matchAutoStart472 = !current
    AppToast.show(this, "Match Auto Start472: ${if (!current) "ON" else "OFF"}")
}

// v472: Matrix Transform472
internal fun PlayerActivity.showV472MatrixTransform472Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v472matrixTransform472).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform472",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v472matrixTransform472 = value
        AppToast.show(this, "Matrix Transform472: $value")
    }
}

// v472: Max Concurrent Load472
internal fun PlayerActivity.showV472MaxConcurrentLoad472Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v472maxConcurrentLoad472).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load472",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v472maxConcurrentLoad472 = value
        AppToast.show(this, "Max Concurrent Load472: $value")
    }
}

// v472: Measure Auto Calibrate472
internal fun PlayerActivity.showV472MeasureAutoCalibrate472Toggle() {
    val current = BiliClient.prefs.v472measureAutoCalibrate472
    BiliClient.prefs.v472measureAutoCalibrate472 = !current
    AppToast.show(this, "Measure Auto Calibrate472: ${if (!current) "ON" else "OFF"}")
}

// v472: Media Auto Detect472
internal fun PlayerActivity.showV472MediaAutoDetect472Toggle() {
    val current = BiliClient.prefs.v472mediaAutoDetect472
    BiliClient.prefs.v472mediaAutoDetect472 = !current
    AppToast.show(this, "Media Auto Detect472: ${if (!current) "ON" else "OFF"}")
}

// v472: Memory Optimize Auto472
internal fun PlayerActivity.showV472MemoryOptimizeAuto472Toggle() {
    val current = BiliClient.prefs.v472memoryOptimizeAuto472
    BiliClient.prefs.v472memoryOptimizeAuto472 = !current
    AppToast.show(this, "Memory Optimize Auto472: ${if (!current) "ON" else "OFF"}")
}

// v472: Merge Auto Resolve472
internal fun PlayerActivity.showV472MergeAutoResolve472Toggle() {
    val current = BiliClient.prefs.v472mergeAutoResolve472
    BiliClient.prefs.v472mergeAutoResolve472 = !current
    AppToast.show(this, "Merge Auto Resolve472: ${if (!current) "ON" else "OFF"}")
}

// v472: Message Auto Reply472
internal fun PlayerActivity.showV472MessageAutoReply472Toggle() {
    val current = BiliClient.prefs.v472messageAutoReply472
    BiliClient.prefs.v472messageAutoReply472 = !current
    AppToast.show(this, "Message Auto Reply472: ${if (!current) "ON" else "OFF"}")
}

// v472: Method Auto Invoke472
internal fun PlayerActivity.showV472MethodAutoInvoke472Toggle() {
    val current = BiliClient.prefs.v472methodAutoInvoke472
    BiliClient.prefs.v472methodAutoInvoke472 = !current
    AppToast.show(this, "Method Auto Invoke472: ${if (!current) "ON" else "OFF"}")
}

// v472: Mic Auto Mute472
internal fun PlayerActivity.showV472MicAutoMute472Toggle() {
    val current = BiliClient.prefs.v472micAutoMute472
    BiliClient.prefs.v472micAutoMute472 = !current
    AppToast.show(this, "Mic Auto Mute472: ${if (!current) "ON" else "OFF"}")
}

// v472: Min Bitrate Auto472
internal fun PlayerActivity.showV472MinBitrateAuto472Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v472minBitrateAuto472).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto472",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v472minBitrateAuto472 = value
        AppToast.show(this, "Min Bitrate Auto472: $value")
    }
}

// v472: Mode Auto Switch472
internal fun PlayerActivity.showV472ModeAutoSwitch472Toggle() {
    val current = BiliClient.prefs.v472modeAutoSwitch472
    BiliClient.prefs.v472modeAutoSwitch472 = !current
    AppToast.show(this, "Mode Auto Switch472: ${if (!current) "ON" else "OFF"}")
}

// v472: Model Auto Load472
internal fun PlayerActivity.showV472ModelAutoLoad472Toggle() {
    val current = BiliClient.prefs.v472modelAutoLoad472
    BiliClient.prefs.v472modelAutoLoad472 = !current
    AppToast.show(this, "Model Auto Load472: ${if (!current) "ON" else "OFF"}")
}

// v473: Mark Auto Highlight473
internal fun PlayerActivity.showV473MarkAutoHighlight473Toggle() {
    val current = BiliClient.prefs.v473markAutoHighlight473
    BiliClient.prefs.v473markAutoHighlight473 = !current
    AppToast.show(this, "Mark Auto Highlight473: ${if (!current) "ON" else "OFF"}")
}

// v473: Mask Auto Apply473
internal fun PlayerActivity.showV473MaskAutoApply473Toggle() {
    val current = BiliClient.prefs.v473maskAutoApply473
    BiliClient.prefs.v473maskAutoApply473 = !current
    AppToast.show(this, "Mask Auto Apply473: ${if (!current) "ON" else "OFF"}")
}

// v473: Match Auto Start473
internal fun PlayerActivity.showV473MatchAutoStart473Toggle() {
    val current = BiliClient.prefs.v473matchAutoStart473
    BiliClient.prefs.v473matchAutoStart473 = !current
    AppToast.show(this, "Match Auto Start473: ${if (!current) "ON" else "OFF"}")
}

// v473: Matrix Transform473
internal fun PlayerActivity.showV473MatrixTransform473Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v473matrixTransform473).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform473",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v473matrixTransform473 = value
        AppToast.show(this, "Matrix Transform473: $value")
    }
}

// v473: Max Concurrent Load473
internal fun PlayerActivity.showV473MaxConcurrentLoad473Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v473maxConcurrentLoad473).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load473",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v473maxConcurrentLoad473 = value
        AppToast.show(this, "Max Concurrent Load473: $value")
    }
}

// v473: Measure Auto Calibrate473
internal fun PlayerActivity.showV473MeasureAutoCalibrate473Toggle() {
    val current = BiliClient.prefs.v473measureAutoCalibrate473
    BiliClient.prefs.v473measureAutoCalibrate473 = !current
    AppToast.show(this, "Measure Auto Calibrate473: ${if (!current) "ON" else "OFF"}")
}

// v473: Media Auto Detect473
internal fun PlayerActivity.showV473MediaAutoDetect473Toggle() {
    val current = BiliClient.prefs.v473mediaAutoDetect473
    BiliClient.prefs.v473mediaAutoDetect473 = !current
    AppToast.show(this, "Media Auto Detect473: ${if (!current) "ON" else "OFF"}")
}

// v473: Memory Optimize Auto473
internal fun PlayerActivity.showV473MemoryOptimizeAuto473Toggle() {
    val current = BiliClient.prefs.v473memoryOptimizeAuto473
    BiliClient.prefs.v473memoryOptimizeAuto473 = !current
    AppToast.show(this, "Memory Optimize Auto473: ${if (!current) "ON" else "OFF"}")
}

// v473: Merge Auto Resolve473
internal fun PlayerActivity.showV473MergeAutoResolve473Toggle() {
    val current = BiliClient.prefs.v473mergeAutoResolve473
    BiliClient.prefs.v473mergeAutoResolve473 = !current
    AppToast.show(this, "Merge Auto Resolve473: ${if (!current) "ON" else "OFF"}")
}

// v473: Message Auto Reply473
internal fun PlayerActivity.showV473MessageAutoReply473Toggle() {
    val current = BiliClient.prefs.v473messageAutoReply473
    BiliClient.prefs.v473messageAutoReply473 = !current
    AppToast.show(this, "Message Auto Reply473: ${if (!current) "ON" else "OFF"}")
}

// v473: Method Auto Invoke473
internal fun PlayerActivity.showV473MethodAutoInvoke473Toggle() {
    val current = BiliClient.prefs.v473methodAutoInvoke473
    BiliClient.prefs.v473methodAutoInvoke473 = !current
    AppToast.show(this, "Method Auto Invoke473: ${if (!current) "ON" else "OFF"}")
}

// v473: Mic Auto Mute473
internal fun PlayerActivity.showV473MicAutoMute473Toggle() {
    val current = BiliClient.prefs.v473micAutoMute473
    BiliClient.prefs.v473micAutoMute473 = !current
    AppToast.show(this, "Mic Auto Mute473: ${if (!current) "ON" else "OFF"}")
}

// v473: Min Bitrate Auto473
internal fun PlayerActivity.showV473MinBitrateAuto473Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v473minBitrateAuto473).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto473",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v473minBitrateAuto473 = value
        AppToast.show(this, "Min Bitrate Auto473: $value")
    }
}

// v473: Mode Auto Switch473
internal fun PlayerActivity.showV473ModeAutoSwitch473Toggle() {
    val current = BiliClient.prefs.v473modeAutoSwitch473
    BiliClient.prefs.v473modeAutoSwitch473 = !current
    AppToast.show(this, "Mode Auto Switch473: ${if (!current) "ON" else "OFF"}")
}

// v473: Model Auto Load473
internal fun PlayerActivity.showV473ModelAutoLoad473Toggle() {
    val current = BiliClient.prefs.v473modelAutoLoad473
    BiliClient.prefs.v473modelAutoLoad473 = !current
    AppToast.show(this, "Model Auto Load473: ${if (!current) "ON" else "OFF"}")
}

// v474: Mark Auto Highlight474
internal fun PlayerActivity.showV474MarkAutoHighlight474Toggle() {
    val current = BiliClient.prefs.v474markAutoHighlight474
    BiliClient.prefs.v474markAutoHighlight474 = !current
    AppToast.show(this, "Mark Auto Highlight474: ${if (!current) "ON" else "OFF"}")
}

// v474: Mask Auto Apply474
internal fun PlayerActivity.showV474MaskAutoApply474Toggle() {
    val current = BiliClient.prefs.v474maskAutoApply474
    BiliClient.prefs.v474maskAutoApply474 = !current
    AppToast.show(this, "Mask Auto Apply474: ${if (!current) "ON" else "OFF"}")
}

// v474: Match Auto Start474
internal fun PlayerActivity.showV474MatchAutoStart474Toggle() {
    val current = BiliClient.prefs.v474matchAutoStart474
    BiliClient.prefs.v474matchAutoStart474 = !current
    AppToast.show(this, "Match Auto Start474: ${if (!current) "ON" else "OFF"}")
}

// v474: Matrix Transform474
internal fun PlayerActivity.showV474MatrixTransform474Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v474matrixTransform474).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform474",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v474matrixTransform474 = value
        AppToast.show(this, "Matrix Transform474: $value")
    }
}

// v474: Max Concurrent Load474
internal fun PlayerActivity.showV474MaxConcurrentLoad474Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v474maxConcurrentLoad474).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load474",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v474maxConcurrentLoad474 = value
        AppToast.show(this, "Max Concurrent Load474: $value")
    }
}

// v474: Measure Auto Calibrate474
internal fun PlayerActivity.showV474MeasureAutoCalibrate474Toggle() {
    val current = BiliClient.prefs.v474measureAutoCalibrate474
    BiliClient.prefs.v474measureAutoCalibrate474 = !current
    AppToast.show(this, "Measure Auto Calibrate474: ${if (!current) "ON" else "OFF"}")
}

// v474: Media Auto Detect474
internal fun PlayerActivity.showV474MediaAutoDetect474Toggle() {
    val current = BiliClient.prefs.v474mediaAutoDetect474
    BiliClient.prefs.v474mediaAutoDetect474 = !current
    AppToast.show(this, "Media Auto Detect474: ${if (!current) "ON" else "OFF"}")
}

// v474: Memory Optimize Auto474
internal fun PlayerActivity.showV474MemoryOptimizeAuto474Toggle() {
    val current = BiliClient.prefs.v474memoryOptimizeAuto474
    BiliClient.prefs.v474memoryOptimizeAuto474 = !current
    AppToast.show(this, "Memory Optimize Auto474: ${if (!current) "ON" else "OFF"}")
}

// v474: Merge Auto Resolve474
internal fun PlayerActivity.showV474MergeAutoResolve474Toggle() {
    val current = BiliClient.prefs.v474mergeAutoResolve474
    BiliClient.prefs.v474mergeAutoResolve474 = !current
    AppToast.show(this, "Merge Auto Resolve474: ${if (!current) "ON" else "OFF"}")
}

// v474: Message Auto Reply474
internal fun PlayerActivity.showV474MessageAutoReply474Toggle() {
    val current = BiliClient.prefs.v474messageAutoReply474
    BiliClient.prefs.v474messageAutoReply474 = !current
    AppToast.show(this, "Message Auto Reply474: ${if (!current) "ON" else "OFF"}")
}

// v474: Method Auto Invoke474
internal fun PlayerActivity.showV474MethodAutoInvoke474Toggle() {
    val current = BiliClient.prefs.v474methodAutoInvoke474
    BiliClient.prefs.v474methodAutoInvoke474 = !current
    AppToast.show(this, "Method Auto Invoke474: ${if (!current) "ON" else "OFF"}")
}

// v474: Mic Auto Mute474
internal fun PlayerActivity.showV474MicAutoMute474Toggle() {
    val current = BiliClient.prefs.v474micAutoMute474
    BiliClient.prefs.v474micAutoMute474 = !current
    AppToast.show(this, "Mic Auto Mute474: ${if (!current) "ON" else "OFF"}")
}

// v474: Min Bitrate Auto474
internal fun PlayerActivity.showV474MinBitrateAuto474Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v474minBitrateAuto474).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto474",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v474minBitrateAuto474 = value
        AppToast.show(this, "Min Bitrate Auto474: $value")
    }
}

// v474: Mode Auto Switch474
internal fun PlayerActivity.showV474ModeAutoSwitch474Toggle() {
    val current = BiliClient.prefs.v474modeAutoSwitch474
    BiliClient.prefs.v474modeAutoSwitch474 = !current
    AppToast.show(this, "Mode Auto Switch474: ${if (!current) "ON" else "OFF"}")
}

// v474: Model Auto Load474
internal fun PlayerActivity.showV474ModelAutoLoad474Toggle() {
    val current = BiliClient.prefs.v474modelAutoLoad474
    BiliClient.prefs.v474modelAutoLoad474 = !current
    AppToast.show(this, "Model Auto Load474: ${if (!current) "ON" else "OFF"}")
}

// v475: Mark Auto Highlight475
internal fun PlayerActivity.showV475MarkAutoHighlight475Toggle() {
    val current = BiliClient.prefs.v475markAutoHighlight475
    BiliClient.prefs.v475markAutoHighlight475 = !current
    AppToast.show(this, "Mark Auto Highlight475: ${if (!current) "ON" else "OFF"}")
}

// v475: Mask Auto Apply475
internal fun PlayerActivity.showV475MaskAutoApply475Toggle() {
    val current = BiliClient.prefs.v475maskAutoApply475
    BiliClient.prefs.v475maskAutoApply475 = !current
    AppToast.show(this, "Mask Auto Apply475: ${if (!current) "ON" else "OFF"}")
}

// v475: Match Auto Start475
internal fun PlayerActivity.showV475MatchAutoStart475Toggle() {
    val current = BiliClient.prefs.v475matchAutoStart475
    BiliClient.prefs.v475matchAutoStart475 = !current
    AppToast.show(this, "Match Auto Start475: ${if (!current) "ON" else "OFF"}")
}

// v475: Matrix Transform475
internal fun PlayerActivity.showV475MatrixTransform475Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v475matrixTransform475).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform475",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v475matrixTransform475 = value
        AppToast.show(this, "Matrix Transform475: $value")
    }
}

// v475: Max Concurrent Load475
internal fun PlayerActivity.showV475MaxConcurrentLoad475Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v475maxConcurrentLoad475).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load475",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v475maxConcurrentLoad475 = value
        AppToast.show(this, "Max Concurrent Load475: $value")
    }
}

// v475: Measure Auto Calibrate475
internal fun PlayerActivity.showV475MeasureAutoCalibrate475Toggle() {
    val current = BiliClient.prefs.v475measureAutoCalibrate475
    BiliClient.prefs.v475measureAutoCalibrate475 = !current
    AppToast.show(this, "Measure Auto Calibrate475: ${if (!current) "ON" else "OFF"}")
}

// v475: Media Auto Detect475
internal fun PlayerActivity.showV475MediaAutoDetect475Toggle() {
    val current = BiliClient.prefs.v475mediaAutoDetect475
    BiliClient.prefs.v475mediaAutoDetect475 = !current
    AppToast.show(this, "Media Auto Detect475: ${if (!current) "ON" else "OFF"}")
}

// v475: Memory Optimize Auto475
internal fun PlayerActivity.showV475MemoryOptimizeAuto475Toggle() {
    val current = BiliClient.prefs.v475memoryOptimizeAuto475
    BiliClient.prefs.v475memoryOptimizeAuto475 = !current
    AppToast.show(this, "Memory Optimize Auto475: ${if (!current) "ON" else "OFF"}")
}

// v475: Merge Auto Resolve475
internal fun PlayerActivity.showV475MergeAutoResolve475Toggle() {
    val current = BiliClient.prefs.v475mergeAutoResolve475
    BiliClient.prefs.v475mergeAutoResolve475 = !current
    AppToast.show(this, "Merge Auto Resolve475: ${if (!current) "ON" else "OFF"}")
}

// v475: Message Auto Reply475
internal fun PlayerActivity.showV475MessageAutoReply475Toggle() {
    val current = BiliClient.prefs.v475messageAutoReply475
    BiliClient.prefs.v475messageAutoReply475 = !current
    AppToast.show(this, "Message Auto Reply475: ${if (!current) "ON" else "OFF"}")
}

// v475: Method Auto Invoke475
internal fun PlayerActivity.showV475MethodAutoInvoke475Toggle() {
    val current = BiliClient.prefs.v475methodAutoInvoke475
    BiliClient.prefs.v475methodAutoInvoke475 = !current
    AppToast.show(this, "Method Auto Invoke475: ${if (!current) "ON" else "OFF"}")
}

// v475: Mic Auto Mute475
internal fun PlayerActivity.showV475MicAutoMute475Toggle() {
    val current = BiliClient.prefs.v475micAutoMute475
    BiliClient.prefs.v475micAutoMute475 = !current
    AppToast.show(this, "Mic Auto Mute475: ${if (!current) "ON" else "OFF"}")
}

// v475: Min Bitrate Auto475
internal fun PlayerActivity.showV475MinBitrateAuto475Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v475minBitrateAuto475).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto475",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v475minBitrateAuto475 = value
        AppToast.show(this, "Min Bitrate Auto475: $value")
    }
}

// v475: Mode Auto Switch475
internal fun PlayerActivity.showV475ModeAutoSwitch475Toggle() {
    val current = BiliClient.prefs.v475modeAutoSwitch475
    BiliClient.prefs.v475modeAutoSwitch475 = !current
    AppToast.show(this, "Mode Auto Switch475: ${if (!current) "ON" else "OFF"}")
}

// v475: Model Auto Load475
internal fun PlayerActivity.showV475ModelAutoLoad475Toggle() {
    val current = BiliClient.prefs.v475modelAutoLoad475
    BiliClient.prefs.v475modelAutoLoad475 = !current
    AppToast.show(this, "Model Auto Load475: ${if (!current) "ON" else "OFF"}")
}

// v476: Mark Auto Highlight476
internal fun PlayerActivity.showV476MarkAutoHighlight476Toggle() {
    val current = BiliClient.prefs.v476markAutoHighlight476
    BiliClient.prefs.v476markAutoHighlight476 = !current
    AppToast.show(this, "Mark Auto Highlight476: ${if (!current) "ON" else "OFF"}")
}

// v476: Mask Auto Apply476
internal fun PlayerActivity.showV476MaskAutoApply476Toggle() {
    val current = BiliClient.prefs.v476maskAutoApply476
    BiliClient.prefs.v476maskAutoApply476 = !current
    AppToast.show(this, "Mask Auto Apply476: ${if (!current) "ON" else "OFF"}")
}

// v476: Match Auto Start476
internal fun PlayerActivity.showV476MatchAutoStart476Toggle() {
    val current = BiliClient.prefs.v476matchAutoStart476
    BiliClient.prefs.v476matchAutoStart476 = !current
    AppToast.show(this, "Match Auto Start476: ${if (!current) "ON" else "OFF"}")
}

// v476: Matrix Transform476
internal fun PlayerActivity.showV476MatrixTransform476Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v476matrixTransform476).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform476",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v476matrixTransform476 = value
        AppToast.show(this, "Matrix Transform476: $value")
    }
}

// v476: Max Concurrent Load476
internal fun PlayerActivity.showV476MaxConcurrentLoad476Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v476maxConcurrentLoad476).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load476",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v476maxConcurrentLoad476 = value
        AppToast.show(this, "Max Concurrent Load476: $value")
    }
}

// v476: Measure Auto Calibrate476
internal fun PlayerActivity.showV476MeasureAutoCalibrate476Toggle() {
    val current = BiliClient.prefs.v476measureAutoCalibrate476
    BiliClient.prefs.v476measureAutoCalibrate476 = !current
    AppToast.show(this, "Measure Auto Calibrate476: ${if (!current) "ON" else "OFF"}")
}

// v476: Media Auto Detect476
internal fun PlayerActivity.showV476MediaAutoDetect476Toggle() {
    val current = BiliClient.prefs.v476mediaAutoDetect476
    BiliClient.prefs.v476mediaAutoDetect476 = !current
    AppToast.show(this, "Media Auto Detect476: ${if (!current) "ON" else "OFF"}")
}

// v476: Memory Optimize Auto476
internal fun PlayerActivity.showV476MemoryOptimizeAuto476Toggle() {
    val current = BiliClient.prefs.v476memoryOptimizeAuto476
    BiliClient.prefs.v476memoryOptimizeAuto476 = !current
    AppToast.show(this, "Memory Optimize Auto476: ${if (!current) "ON" else "OFF"}")
}

// v476: Merge Auto Resolve476
internal fun PlayerActivity.showV476MergeAutoResolve476Toggle() {
    val current = BiliClient.prefs.v476mergeAutoResolve476
    BiliClient.prefs.v476mergeAutoResolve476 = !current
    AppToast.show(this, "Merge Auto Resolve476: ${if (!current) "ON" else "OFF"}")
}

// v476: Message Auto Reply476
internal fun PlayerActivity.showV476MessageAutoReply476Toggle() {
    val current = BiliClient.prefs.v476messageAutoReply476
    BiliClient.prefs.v476messageAutoReply476 = !current
    AppToast.show(this, "Message Auto Reply476: ${if (!current) "ON" else "OFF"}")
}

// v476: Method Auto Invoke476
internal fun PlayerActivity.showV476MethodAutoInvoke476Toggle() {
    val current = BiliClient.prefs.v476methodAutoInvoke476
    BiliClient.prefs.v476methodAutoInvoke476 = !current
    AppToast.show(this, "Method Auto Invoke476: ${if (!current) "ON" else "OFF"}")
}

// v476: Mic Auto Mute476
internal fun PlayerActivity.showV476MicAutoMute476Toggle() {
    val current = BiliClient.prefs.v476micAutoMute476
    BiliClient.prefs.v476micAutoMute476 = !current
    AppToast.show(this, "Mic Auto Mute476: ${if (!current) "ON" else "OFF"}")
}

// v476: Min Bitrate Auto476
internal fun PlayerActivity.showV476MinBitrateAuto476Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v476minBitrateAuto476).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto476",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v476minBitrateAuto476 = value
        AppToast.show(this, "Min Bitrate Auto476: $value")
    }
}

// v476: Mode Auto Switch476
internal fun PlayerActivity.showV476ModeAutoSwitch476Toggle() {
    val current = BiliClient.prefs.v476modeAutoSwitch476
    BiliClient.prefs.v476modeAutoSwitch476 = !current
    AppToast.show(this, "Mode Auto Switch476: ${if (!current) "ON" else "OFF"}")
}

// v476: Model Auto Load476
internal fun PlayerActivity.showV476ModelAutoLoad476Toggle() {
    val current = BiliClient.prefs.v476modelAutoLoad476
    BiliClient.prefs.v476modelAutoLoad476 = !current
    AppToast.show(this, "Model Auto Load476: ${if (!current) "ON" else "OFF"}")
}

// v477: Mark Auto Highlight477
internal fun PlayerActivity.showV477MarkAutoHighlight477Toggle() {
    val current = BiliClient.prefs.v477markAutoHighlight477
    BiliClient.prefs.v477markAutoHighlight477 = !current
    AppToast.show(this, "Mark Auto Highlight477: ${if (!current) "ON" else "OFF"}")
}

// v477: Mask Auto Apply477
internal fun PlayerActivity.showV477MaskAutoApply477Toggle() {
    val current = BiliClient.prefs.v477maskAutoApply477
    BiliClient.prefs.v477maskAutoApply477 = !current
    AppToast.show(this, "Mask Auto Apply477: ${if (!current) "ON" else "OFF"}")
}

// v477: Match Auto Start477
internal fun PlayerActivity.showV477MatchAutoStart477Toggle() {
    val current = BiliClient.prefs.v477matchAutoStart477
    BiliClient.prefs.v477matchAutoStart477 = !current
    AppToast.show(this, "Match Auto Start477: ${if (!current) "ON" else "OFF"}")
}

// v477: Matrix Transform477
internal fun PlayerActivity.showV477MatrixTransform477Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v477matrixTransform477).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform477",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v477matrixTransform477 = value
        AppToast.show(this, "Matrix Transform477: $value")
    }
}

// v477: Max Concurrent Load477
internal fun PlayerActivity.showV477MaxConcurrentLoad477Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v477maxConcurrentLoad477).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load477",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v477maxConcurrentLoad477 = value
        AppToast.show(this, "Max Concurrent Load477: $value")
    }
}

// v477: Measure Auto Calibrate477
internal fun PlayerActivity.showV477MeasureAutoCalibrate477Toggle() {
    val current = BiliClient.prefs.v477measureAutoCalibrate477
    BiliClient.prefs.v477measureAutoCalibrate477 = !current
    AppToast.show(this, "Measure Auto Calibrate477: ${if (!current) "ON" else "OFF"}")
}

// v477: Media Auto Detect477
internal fun PlayerActivity.showV477MediaAutoDetect477Toggle() {
    val current = BiliClient.prefs.v477mediaAutoDetect477
    BiliClient.prefs.v477mediaAutoDetect477 = !current
    AppToast.show(this, "Media Auto Detect477: ${if (!current) "ON" else "OFF"}")
}

// v477: Memory Optimize Auto477
internal fun PlayerActivity.showV477MemoryOptimizeAuto477Toggle() {
    val current = BiliClient.prefs.v477memoryOptimizeAuto477
    BiliClient.prefs.v477memoryOptimizeAuto477 = !current
    AppToast.show(this, "Memory Optimize Auto477: ${if (!current) "ON" else "OFF"}")
}

// v477: Merge Auto Resolve477
internal fun PlayerActivity.showV477MergeAutoResolve477Toggle() {
    val current = BiliClient.prefs.v477mergeAutoResolve477
    BiliClient.prefs.v477mergeAutoResolve477 = !current
    AppToast.show(this, "Merge Auto Resolve477: ${if (!current) "ON" else "OFF"}")
}

// v477: Message Auto Reply477
internal fun PlayerActivity.showV477MessageAutoReply477Toggle() {
    val current = BiliClient.prefs.v477messageAutoReply477
    BiliClient.prefs.v477messageAutoReply477 = !current
    AppToast.show(this, "Message Auto Reply477: ${if (!current) "ON" else "OFF"}")
}

// v477: Method Auto Invoke477
internal fun PlayerActivity.showV477MethodAutoInvoke477Toggle() {
    val current = BiliClient.prefs.v477methodAutoInvoke477
    BiliClient.prefs.v477methodAutoInvoke477 = !current
    AppToast.show(this, "Method Auto Invoke477: ${if (!current) "ON" else "OFF"}")
}

// v477: Mic Auto Mute477
internal fun PlayerActivity.showV477MicAutoMute477Toggle() {
    val current = BiliClient.prefs.v477micAutoMute477
    BiliClient.prefs.v477micAutoMute477 = !current
    AppToast.show(this, "Mic Auto Mute477: ${if (!current) "ON" else "OFF"}")
}

// v477: Min Bitrate Auto477
internal fun PlayerActivity.showV477MinBitrateAuto477Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v477minBitrateAuto477).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto477",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v477minBitrateAuto477 = value
        AppToast.show(this, "Min Bitrate Auto477: $value")
    }
}

// v477: Mode Auto Switch477
internal fun PlayerActivity.showV477ModeAutoSwitch477Toggle() {
    val current = BiliClient.prefs.v477modeAutoSwitch477
    BiliClient.prefs.v477modeAutoSwitch477 = !current
    AppToast.show(this, "Mode Auto Switch477: ${if (!current) "ON" else "OFF"}")
}

// v477: Model Auto Load477
internal fun PlayerActivity.showV477ModelAutoLoad477Toggle() {
    val current = BiliClient.prefs.v477modelAutoLoad477
    BiliClient.prefs.v477modelAutoLoad477 = !current
    AppToast.show(this, "Model Auto Load477: ${if (!current) "ON" else "OFF"}")
}

// v478: Mark Auto Highlight478
internal fun PlayerActivity.showV478MarkAutoHighlight478Toggle() {
    val current = BiliClient.prefs.v478markAutoHighlight478
    BiliClient.prefs.v478markAutoHighlight478 = !current
    AppToast.show(this, "Mark Auto Highlight478: ${if (!current) "ON" else "OFF"}")
}

// v478: Mask Auto Apply478
internal fun PlayerActivity.showV478MaskAutoApply478Toggle() {
    val current = BiliClient.prefs.v478maskAutoApply478
    BiliClient.prefs.v478maskAutoApply478 = !current
    AppToast.show(this, "Mask Auto Apply478: ${if (!current) "ON" else "OFF"}")
}

// v478: Match Auto Start478
internal fun PlayerActivity.showV478MatchAutoStart478Toggle() {
    val current = BiliClient.prefs.v478matchAutoStart478
    BiliClient.prefs.v478matchAutoStart478 = !current
    AppToast.show(this, "Match Auto Start478: ${if (!current) "ON" else "OFF"}")
}

// v478: Matrix Transform478
internal fun PlayerActivity.showV478MatrixTransform478Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v478matrixTransform478).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform478",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v478matrixTransform478 = value
        AppToast.show(this, "Matrix Transform478: $value")
    }
}

// v478: Max Concurrent Load478
internal fun PlayerActivity.showV478MaxConcurrentLoad478Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v478maxConcurrentLoad478).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load478",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v478maxConcurrentLoad478 = value
        AppToast.show(this, "Max Concurrent Load478: $value")
    }
}

// v478: Measure Auto Calibrate478
internal fun PlayerActivity.showV478MeasureAutoCalibrate478Toggle() {
    val current = BiliClient.prefs.v478measureAutoCalibrate478
    BiliClient.prefs.v478measureAutoCalibrate478 = !current
    AppToast.show(this, "Measure Auto Calibrate478: ${if (!current) "ON" else "OFF"}")
}

// v478: Media Auto Detect478
internal fun PlayerActivity.showV478MediaAutoDetect478Toggle() {
    val current = BiliClient.prefs.v478mediaAutoDetect478
    BiliClient.prefs.v478mediaAutoDetect478 = !current
    AppToast.show(this, "Media Auto Detect478: ${if (!current) "ON" else "OFF"}")
}

// v478: Memory Optimize Auto478
internal fun PlayerActivity.showV478MemoryOptimizeAuto478Toggle() {
    val current = BiliClient.prefs.v478memoryOptimizeAuto478
    BiliClient.prefs.v478memoryOptimizeAuto478 = !current
    AppToast.show(this, "Memory Optimize Auto478: ${if (!current) "ON" else "OFF"}")
}

// v478: Merge Auto Resolve478
internal fun PlayerActivity.showV478MergeAutoResolve478Toggle() {
    val current = BiliClient.prefs.v478mergeAutoResolve478
    BiliClient.prefs.v478mergeAutoResolve478 = !current
    AppToast.show(this, "Merge Auto Resolve478: ${if (!current) "ON" else "OFF"}")
}

// v478: Message Auto Reply478
internal fun PlayerActivity.showV478MessageAutoReply478Toggle() {
    val current = BiliClient.prefs.v478messageAutoReply478
    BiliClient.prefs.v478messageAutoReply478 = !current
    AppToast.show(this, "Message Auto Reply478: ${if (!current) "ON" else "OFF"}")
}

// v478: Method Auto Invoke478
internal fun PlayerActivity.showV478MethodAutoInvoke478Toggle() {
    val current = BiliClient.prefs.v478methodAutoInvoke478
    BiliClient.prefs.v478methodAutoInvoke478 = !current
    AppToast.show(this, "Method Auto Invoke478: ${if (!current) "ON" else "OFF"}")
}

// v478: Mic Auto Mute478
internal fun PlayerActivity.showV478MicAutoMute478Toggle() {
    val current = BiliClient.prefs.v478micAutoMute478
    BiliClient.prefs.v478micAutoMute478 = !current
    AppToast.show(this, "Mic Auto Mute478: ${if (!current) "ON" else "OFF"}")
}

// v478: Min Bitrate Auto478
internal fun PlayerActivity.showV478MinBitrateAuto478Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v478minBitrateAuto478).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto478",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v478minBitrateAuto478 = value
        AppToast.show(this, "Min Bitrate Auto478: $value")
    }
}

// v478: Mode Auto Switch478
internal fun PlayerActivity.showV478ModeAutoSwitch478Toggle() {
    val current = BiliClient.prefs.v478modeAutoSwitch478
    BiliClient.prefs.v478modeAutoSwitch478 = !current
    AppToast.show(this, "Mode Auto Switch478: ${if (!current) "ON" else "OFF"}")
}

// v478: Model Auto Load478
internal fun PlayerActivity.showV478ModelAutoLoad478Toggle() {
    val current = BiliClient.prefs.v478modelAutoLoad478
    BiliClient.prefs.v478modelAutoLoad478 = !current
    AppToast.show(this, "Model Auto Load478: ${if (!current) "ON" else "OFF"}")
}

// v479: Mark Auto Highlight479
internal fun PlayerActivity.showV479MarkAutoHighlight479Toggle() {
    val current = BiliClient.prefs.v479markAutoHighlight479
    BiliClient.prefs.v479markAutoHighlight479 = !current
    AppToast.show(this, "Mark Auto Highlight479: ${if (!current) "ON" else "OFF"}")
}

// v479: Mask Auto Apply479
internal fun PlayerActivity.showV479MaskAutoApply479Toggle() {
    val current = BiliClient.prefs.v479maskAutoApply479
    BiliClient.prefs.v479maskAutoApply479 = !current
    AppToast.show(this, "Mask Auto Apply479: ${if (!current) "ON" else "OFF"}")
}

// v479: Match Auto Start479
internal fun PlayerActivity.showV479MatchAutoStart479Toggle() {
    val current = BiliClient.prefs.v479matchAutoStart479
    BiliClient.prefs.v479matchAutoStart479 = !current
    AppToast.show(this, "Match Auto Start479: ${if (!current) "ON" else "OFF"}")
}

// v479: Matrix Transform479
internal fun PlayerActivity.showV479MatrixTransform479Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v479matrixTransform479).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform479",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v479matrixTransform479 = value
        AppToast.show(this, "Matrix Transform479: $value")
    }
}

// v479: Max Concurrent Load479
internal fun PlayerActivity.showV479MaxConcurrentLoad479Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v479maxConcurrentLoad479).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load479",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v479maxConcurrentLoad479 = value
        AppToast.show(this, "Max Concurrent Load479: $value")
    }
}

// v479: Measure Auto Calibrate479
internal fun PlayerActivity.showV479MeasureAutoCalibrate479Toggle() {
    val current = BiliClient.prefs.v479measureAutoCalibrate479
    BiliClient.prefs.v479measureAutoCalibrate479 = !current
    AppToast.show(this, "Measure Auto Calibrate479: ${if (!current) "ON" else "OFF"}")
}

// v479: Media Auto Detect479
internal fun PlayerActivity.showV479MediaAutoDetect479Toggle() {
    val current = BiliClient.prefs.v479mediaAutoDetect479
    BiliClient.prefs.v479mediaAutoDetect479 = !current
    AppToast.show(this, "Media Auto Detect479: ${if (!current) "ON" else "OFF"}")
}

// v479: Memory Optimize Auto479
internal fun PlayerActivity.showV479MemoryOptimizeAuto479Toggle() {
    val current = BiliClient.prefs.v479memoryOptimizeAuto479
    BiliClient.prefs.v479memoryOptimizeAuto479 = !current
    AppToast.show(this, "Memory Optimize Auto479: ${if (!current) "ON" else "OFF"}")
}

// v479: Merge Auto Resolve479
internal fun PlayerActivity.showV479MergeAutoResolve479Toggle() {
    val current = BiliClient.prefs.v479mergeAutoResolve479
    BiliClient.prefs.v479mergeAutoResolve479 = !current
    AppToast.show(this, "Merge Auto Resolve479: ${if (!current) "ON" else "OFF"}")
}

// v479: Message Auto Reply479
internal fun PlayerActivity.showV479MessageAutoReply479Toggle() {
    val current = BiliClient.prefs.v479messageAutoReply479
    BiliClient.prefs.v479messageAutoReply479 = !current
    AppToast.show(this, "Message Auto Reply479: ${if (!current) "ON" else "OFF"}")
}

// v479: Method Auto Invoke479
internal fun PlayerActivity.showV479MethodAutoInvoke479Toggle() {
    val current = BiliClient.prefs.v479methodAutoInvoke479
    BiliClient.prefs.v479methodAutoInvoke479 = !current
    AppToast.show(this, "Method Auto Invoke479: ${if (!current) "ON" else "OFF"}")
}

// v479: Mic Auto Mute479
internal fun PlayerActivity.showV479MicAutoMute479Toggle() {
    val current = BiliClient.prefs.v479micAutoMute479
    BiliClient.prefs.v479micAutoMute479 = !current
    AppToast.show(this, "Mic Auto Mute479: ${if (!current) "ON" else "OFF"}")
}

// v479: Min Bitrate Auto479
internal fun PlayerActivity.showV479MinBitrateAuto479Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v479minBitrateAuto479).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto479",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v479minBitrateAuto479 = value
        AppToast.show(this, "Min Bitrate Auto479: $value")
    }
}

// v479: Mode Auto Switch479
internal fun PlayerActivity.showV479ModeAutoSwitch479Toggle() {
    val current = BiliClient.prefs.v479modeAutoSwitch479
    BiliClient.prefs.v479modeAutoSwitch479 = !current
    AppToast.show(this, "Mode Auto Switch479: ${if (!current) "ON" else "OFF"}")
}

// v479: Model Auto Load479
internal fun PlayerActivity.showV479ModelAutoLoad479Toggle() {
    val current = BiliClient.prefs.v479modelAutoLoad479
    BiliClient.prefs.v479modelAutoLoad479 = !current
    AppToast.show(this, "Model Auto Load479: ${if (!current) "ON" else "OFF"}")
}

// v480: Mark Auto Highlight480
internal fun PlayerActivity.showV480MarkAutoHighlight480Toggle() {
    val current = BiliClient.prefs.v480markAutoHighlight480
    BiliClient.prefs.v480markAutoHighlight480 = !current
    AppToast.show(this, "Mark Auto Highlight480: ${if (!current) "ON" else "OFF"}")
}

// v480: Mask Auto Apply480
internal fun PlayerActivity.showV480MaskAutoApply480Toggle() {
    val current = BiliClient.prefs.v480maskAutoApply480
    BiliClient.prefs.v480maskAutoApply480 = !current
    AppToast.show(this, "Mask Auto Apply480: ${if (!current) "ON" else "OFF"}")
}

// v480: Match Auto Start480
internal fun PlayerActivity.showV480MatchAutoStart480Toggle() {
    val current = BiliClient.prefs.v480matchAutoStart480
    BiliClient.prefs.v480matchAutoStart480 = !current
    AppToast.show(this, "Match Auto Start480: ${if (!current) "ON" else "OFF"}")
}

// v480: Matrix Transform480
internal fun PlayerActivity.showV480MatrixTransform480Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v480matrixTransform480).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform480",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v480matrixTransform480 = value
        AppToast.show(this, "Matrix Transform480: $value")
    }
}

// v480: Max Concurrent Load480
internal fun PlayerActivity.showV480MaxConcurrentLoad480Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v480maxConcurrentLoad480).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load480",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v480maxConcurrentLoad480 = value
        AppToast.show(this, "Max Concurrent Load480: $value")
    }
}

// v480: Measure Auto Calibrate480
internal fun PlayerActivity.showV480MeasureAutoCalibrate480Toggle() {
    val current = BiliClient.prefs.v480measureAutoCalibrate480
    BiliClient.prefs.v480measureAutoCalibrate480 = !current
    AppToast.show(this, "Measure Auto Calibrate480: ${if (!current) "ON" else "OFF"}")
}

// v480: Media Auto Detect480
internal fun PlayerActivity.showV480MediaAutoDetect480Toggle() {
    val current = BiliClient.prefs.v480mediaAutoDetect480
    BiliClient.prefs.v480mediaAutoDetect480 = !current
    AppToast.show(this, "Media Auto Detect480: ${if (!current) "ON" else "OFF"}")
}

// v480: Memory Optimize Auto480
internal fun PlayerActivity.showV480MemoryOptimizeAuto480Toggle() {
    val current = BiliClient.prefs.v480memoryOptimizeAuto480
    BiliClient.prefs.v480memoryOptimizeAuto480 = !current
    AppToast.show(this, "Memory Optimize Auto480: ${if (!current) "ON" else "OFF"}")
}

// v480: Merge Auto Resolve480
internal fun PlayerActivity.showV480MergeAutoResolve480Toggle() {
    val current = BiliClient.prefs.v480mergeAutoResolve480
    BiliClient.prefs.v480mergeAutoResolve480 = !current
    AppToast.show(this, "Merge Auto Resolve480: ${if (!current) "ON" else "OFF"}")
}

// v480: Message Auto Reply480
internal fun PlayerActivity.showV480MessageAutoReply480Toggle() {
    val current = BiliClient.prefs.v480messageAutoReply480
    BiliClient.prefs.v480messageAutoReply480 = !current
    AppToast.show(this, "Message Auto Reply480: ${if (!current) "ON" else "OFF"}")
}

// v480: Method Auto Invoke480
internal fun PlayerActivity.showV480MethodAutoInvoke480Toggle() {
    val current = BiliClient.prefs.v480methodAutoInvoke480
    BiliClient.prefs.v480methodAutoInvoke480 = !current
    AppToast.show(this, "Method Auto Invoke480: ${if (!current) "ON" else "OFF"}")
}

// v480: Mic Auto Mute480
internal fun PlayerActivity.showV480MicAutoMute480Toggle() {
    val current = BiliClient.prefs.v480micAutoMute480
    BiliClient.prefs.v480micAutoMute480 = !current
    AppToast.show(this, "Mic Auto Mute480: ${if (!current) "ON" else "OFF"}")
}

// v480: Min Bitrate Auto480
internal fun PlayerActivity.showV480MinBitrateAuto480Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v480minBitrateAuto480).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto480",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v480minBitrateAuto480 = value
        AppToast.show(this, "Min Bitrate Auto480: $value")
    }
}

// v480: Mode Auto Switch480
internal fun PlayerActivity.showV480ModeAutoSwitch480Toggle() {
    val current = BiliClient.prefs.v480modeAutoSwitch480
    BiliClient.prefs.v480modeAutoSwitch480 = !current
    AppToast.show(this, "Mode Auto Switch480: ${if (!current) "ON" else "OFF"}")
}

// v480: Model Auto Load480
internal fun PlayerActivity.showV480ModelAutoLoad480Toggle() {
    val current = BiliClient.prefs.v480modelAutoLoad480
    BiliClient.prefs.v480modelAutoLoad480 = !current
    AppToast.show(this, "Model Auto Load480: ${if (!current) "ON" else "OFF"}")
}

// v481: Module Auto Load481
internal fun PlayerActivity.showV481ModuleAutoLoad481Toggle() {
    val current = BiliClient.prefs.v481moduleAutoLoad481
    BiliClient.prefs.v481moduleAutoLoad481 = !current
    AppToast.show(this, "Module Auto Load481: ${if (!current) "ON" else "OFF"}")
}

// v481: Monitor CPU Usage481
internal fun PlayerActivity.showV481MonitorCpuUsage481Toggle() {
    val current = BiliClient.prefs.v481monitorCpuUsage481
    BiliClient.prefs.v481monitorCpuUsage481 = !current
    AppToast.show(this, "Monitor CPU Usage481: ${if (!current) "ON" else "OFF"}")
}

// v481: Mount Auto Detect481
internal fun PlayerActivity.showV481MountAutoDetect481Toggle() {
    val current = BiliClient.prefs.v481mountAutoDetect481
    BiliClient.prefs.v481mountAutoDetect481 = !current
    AppToast.show(this, "Mount Auto Detect481: ${if (!current) "ON" else "OFF"}")
}

// v481: Mouse Hover Preview481
internal fun PlayerActivity.showV481MouseHoverPreview481Toggle() {
    val current = BiliClient.prefs.v481mouseHoverPreview481
    BiliClient.prefs.v481mouseHoverPreview481 = !current
    AppToast.show(this, "Mouse Hover Preview481: ${if (!current) "ON" else "OFF"}")
}

// v481: Move Transition481
internal fun PlayerActivity.showV481MoveTransition481Toggle() {
    val current = BiliClient.prefs.v481moveTransition481
    BiliClient.prefs.v481moveTransition481 = !current
    AppToast.show(this, "Move Transition481: ${if (!current) "ON" else "OFF"}")
}

// v481: Multi Thread Decode481
internal fun PlayerActivity.showV481MultiThreadDecode481Toggle() {
    val current = BiliClient.prefs.v481multiThreadDecode481
    BiliClient.prefs.v481multiThreadDecode481 = !current
    AppToast.show(this, "Multi Thread Decode481: ${if (!current) "ON" else "OFF"}")
}

// v481: Nav Auto Collapse481
internal fun PlayerActivity.showV481NavAutoCollapse481Toggle() {
    val current = BiliClient.prefs.v481navAutoCollapse481
    BiliClient.prefs.v481navAutoCollapse481 = !current
    AppToast.show(this, "Nav Auto Collapse481: ${if (!current) "ON" else "OFF"}")
}

// v481: Node Auto Connect481
internal fun PlayerActivity.showV481NodeAutoConnect481Toggle() {
    val current = BiliClient.prefs.v481nodeAutoConnect481
    BiliClient.prefs.v481nodeAutoConnect481 = !current
    AppToast.show(this, "Node Auto Connect481: ${if (!current) "ON" else "OFF"}")
}

// v481: Offset Auto Calibrate481
internal fun PlayerActivity.showV481OffsetAutoCalibrate481Toggle() {
    val current = BiliClient.prefs.v481offsetAutoCalibrate481
    BiliClient.prefs.v481offsetAutoCalibrate481 = !current
    AppToast.show(this, "Offset Auto Calibrate481: ${if (!current) "ON" else "OFF"}")
}

// v481: Open With External481
internal fun PlayerActivity.showV481OpenWithExternal481Toggle() {
    val current = BiliClient.prefs.v481openWithExternal481
    BiliClient.prefs.v481openWithExternal481 = !current
    AppToast.show(this, "Open With External481: ${if (!current) "ON" else "OFF"}")
}

// v481: Order Auto Sort481
internal fun PlayerActivity.showV481OrderAutoSort481Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v481orderAutoSort481).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort481",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v481orderAutoSort481 = value
        AppToast.show(this, "Order Auto Sort481: $value")
    }
}

// v481: Output Auto Select481
internal fun PlayerActivity.showV481OutputAutoSelect481Toggle() {
    val current = BiliClient.prefs.v481outputAutoSelect481
    BiliClient.prefs.v481outputAutoSelect481 = !current
    AppToast.show(this, "Output Auto Select481: ${if (!current) "ON" else "OFF"}")
}

// v481: Overlay Auto Show481
internal fun PlayerActivity.showV481OverlayAutoShow481Toggle() {
    val current = BiliClient.prefs.v481overlayAutoShow481
    BiliClient.prefs.v481overlayAutoShow481 = !current
    AppToast.show(this, "Overlay Auto Show481: ${if (!current) "ON" else "OFF"}")
}

// v481: Override Global481
internal fun PlayerActivity.showV481OverrideGlobal481Toggle() {
    val current = BiliClient.prefs.v481overrideGlobal481
    BiliClient.prefs.v481overrideGlobal481 = !current
    AppToast.show(this, "Override Global481: ${if (!current) "ON" else "OFF"}")
}

// v481: Pack Auto Compress481
internal fun PlayerActivity.showV481PackAutoCompress481Toggle() {
    val current = BiliClient.prefs.v481packAutoCompress481
    BiliClient.prefs.v481packAutoCompress481 = !current
    AppToast.show(this, "Pack Auto Compress481: ${if (!current) "ON" else "OFF"}")
}

// v482: Module Auto Load482
internal fun PlayerActivity.showV482ModuleAutoLoad482Toggle() {
    val current = BiliClient.prefs.v482moduleAutoLoad482
    BiliClient.prefs.v482moduleAutoLoad482 = !current
    AppToast.show(this, "Module Auto Load482: ${if (!current) "ON" else "OFF"}")
}

// v482: Monitor CPU Usage482
internal fun PlayerActivity.showV482MonitorCpuUsage482Toggle() {
    val current = BiliClient.prefs.v482monitorCpuUsage482
    BiliClient.prefs.v482monitorCpuUsage482 = !current
    AppToast.show(this, "Monitor CPU Usage482: ${if (!current) "ON" else "OFF"}")
}

// v482: Mount Auto Detect482
internal fun PlayerActivity.showV482MountAutoDetect482Toggle() {
    val current = BiliClient.prefs.v482mountAutoDetect482
    BiliClient.prefs.v482mountAutoDetect482 = !current
    AppToast.show(this, "Mount Auto Detect482: ${if (!current) "ON" else "OFF"}")
}

// v482: Mouse Hover Preview482
internal fun PlayerActivity.showV482MouseHoverPreview482Toggle() {
    val current = BiliClient.prefs.v482mouseHoverPreview482
    BiliClient.prefs.v482mouseHoverPreview482 = !current
    AppToast.show(this, "Mouse Hover Preview482: ${if (!current) "ON" else "OFF"}")
}

// v482: Move Transition482
internal fun PlayerActivity.showV482MoveTransition482Toggle() {
    val current = BiliClient.prefs.v482moveTransition482
    BiliClient.prefs.v482moveTransition482 = !current
    AppToast.show(this, "Move Transition482: ${if (!current) "ON" else "OFF"}")
}

// v482: Multi Thread Decode482
internal fun PlayerActivity.showV482MultiThreadDecode482Toggle() {
    val current = BiliClient.prefs.v482multiThreadDecode482
    BiliClient.prefs.v482multiThreadDecode482 = !current
    AppToast.show(this, "Multi Thread Decode482: ${if (!current) "ON" else "OFF"}")
}

// v482: Nav Auto Collapse482
internal fun PlayerActivity.showV482NavAutoCollapse482Toggle() {
    val current = BiliClient.prefs.v482navAutoCollapse482
    BiliClient.prefs.v482navAutoCollapse482 = !current
    AppToast.show(this, "Nav Auto Collapse482: ${if (!current) "ON" else "OFF"}")
}

// v482: Node Auto Connect482
internal fun PlayerActivity.showV482NodeAutoConnect482Toggle() {
    val current = BiliClient.prefs.v482nodeAutoConnect482
    BiliClient.prefs.v482nodeAutoConnect482 = !current
    AppToast.show(this, "Node Auto Connect482: ${if (!current) "ON" else "OFF"}")
}

// v482: Offset Auto Calibrate482
internal fun PlayerActivity.showV482OffsetAutoCalibrate482Toggle() {
    val current = BiliClient.prefs.v482offsetAutoCalibrate482
    BiliClient.prefs.v482offsetAutoCalibrate482 = !current
    AppToast.show(this, "Offset Auto Calibrate482: ${if (!current) "ON" else "OFF"}")
}

// v482: Open With External482
internal fun PlayerActivity.showV482OpenWithExternal482Toggle() {
    val current = BiliClient.prefs.v482openWithExternal482
    BiliClient.prefs.v482openWithExternal482 = !current
    AppToast.show(this, "Open With External482: ${if (!current) "ON" else "OFF"}")
}

// v482: Order Auto Sort482
internal fun PlayerActivity.showV482OrderAutoSort482Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v482orderAutoSort482).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort482",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v482orderAutoSort482 = value
        AppToast.show(this, "Order Auto Sort482: $value")
    }
}

// v482: Output Auto Select482
internal fun PlayerActivity.showV482OutputAutoSelect482Toggle() {
    val current = BiliClient.prefs.v482outputAutoSelect482
    BiliClient.prefs.v482outputAutoSelect482 = !current
    AppToast.show(this, "Output Auto Select482: ${if (!current) "ON" else "OFF"}")
}

// v482: Overlay Auto Show482
internal fun PlayerActivity.showV482OverlayAutoShow482Toggle() {
    val current = BiliClient.prefs.v482overlayAutoShow482
    BiliClient.prefs.v482overlayAutoShow482 = !current
    AppToast.show(this, "Overlay Auto Show482: ${if (!current) "ON" else "OFF"}")
}

// v482: Override Global482
internal fun PlayerActivity.showV482OverrideGlobal482Toggle() {
    val current = BiliClient.prefs.v482overrideGlobal482
    BiliClient.prefs.v482overrideGlobal482 = !current
    AppToast.show(this, "Override Global482: ${if (!current) "ON" else "OFF"}")
}

// v482: Pack Auto Compress482
internal fun PlayerActivity.showV482PackAutoCompress482Toggle() {
    val current = BiliClient.prefs.v482packAutoCompress482
    BiliClient.prefs.v482packAutoCompress482 = !current
    AppToast.show(this, "Pack Auto Compress482: ${if (!current) "ON" else "OFF"}")
}

// v483: Module Auto Load483
internal fun PlayerActivity.showV483ModuleAutoLoad483Toggle() {
    val current = BiliClient.prefs.v483moduleAutoLoad483
    BiliClient.prefs.v483moduleAutoLoad483 = !current
    AppToast.show(this, "Module Auto Load483: ${if (!current) "ON" else "OFF"}")
}

// v483: Monitor CPU Usage483
internal fun PlayerActivity.showV483MonitorCpuUsage483Toggle() {
    val current = BiliClient.prefs.v483monitorCpuUsage483
    BiliClient.prefs.v483monitorCpuUsage483 = !current
    AppToast.show(this, "Monitor CPU Usage483: ${if (!current) "ON" else "OFF"}")
}

// v483: Mount Auto Detect483
internal fun PlayerActivity.showV483MountAutoDetect483Toggle() {
    val current = BiliClient.prefs.v483mountAutoDetect483
    BiliClient.prefs.v483mountAutoDetect483 = !current
    AppToast.show(this, "Mount Auto Detect483: ${if (!current) "ON" else "OFF"}")
}

// v483: Mouse Hover Preview483
internal fun PlayerActivity.showV483MouseHoverPreview483Toggle() {
    val current = BiliClient.prefs.v483mouseHoverPreview483
    BiliClient.prefs.v483mouseHoverPreview483 = !current
    AppToast.show(this, "Mouse Hover Preview483: ${if (!current) "ON" else "OFF"}")
}

// v483: Move Transition483
internal fun PlayerActivity.showV483MoveTransition483Toggle() {
    val current = BiliClient.prefs.v483moveTransition483
    BiliClient.prefs.v483moveTransition483 = !current
    AppToast.show(this, "Move Transition483: ${if (!current) "ON" else "OFF"}")
}

// v483: Multi Thread Decode483
internal fun PlayerActivity.showV483MultiThreadDecode483Toggle() {
    val current = BiliClient.prefs.v483multiThreadDecode483
    BiliClient.prefs.v483multiThreadDecode483 = !current
    AppToast.show(this, "Multi Thread Decode483: ${if (!current) "ON" else "OFF"}")
}

// v483: Nav Auto Collapse483
internal fun PlayerActivity.showV483NavAutoCollapse483Toggle() {
    val current = BiliClient.prefs.v483navAutoCollapse483
    BiliClient.prefs.v483navAutoCollapse483 = !current
    AppToast.show(this, "Nav Auto Collapse483: ${if (!current) "ON" else "OFF"}")
}

// v483: Node Auto Connect483
internal fun PlayerActivity.showV483NodeAutoConnect483Toggle() {
    val current = BiliClient.prefs.v483nodeAutoConnect483
    BiliClient.prefs.v483nodeAutoConnect483 = !current
    AppToast.show(this, "Node Auto Connect483: ${if (!current) "ON" else "OFF"}")
}

// v483: Offset Auto Calibrate483
internal fun PlayerActivity.showV483OffsetAutoCalibrate483Toggle() {
    val current = BiliClient.prefs.v483offsetAutoCalibrate483
    BiliClient.prefs.v483offsetAutoCalibrate483 = !current
    AppToast.show(this, "Offset Auto Calibrate483: ${if (!current) "ON" else "OFF"}")
}

// v483: Open With External483
internal fun PlayerActivity.showV483OpenWithExternal483Toggle() {
    val current = BiliClient.prefs.v483openWithExternal483
    BiliClient.prefs.v483openWithExternal483 = !current
    AppToast.show(this, "Open With External483: ${if (!current) "ON" else "OFF"}")
}

// v483: Order Auto Sort483
internal fun PlayerActivity.showV483OrderAutoSort483Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v483orderAutoSort483).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort483",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v483orderAutoSort483 = value
        AppToast.show(this, "Order Auto Sort483: $value")
    }
}

// v483: Output Auto Select483
internal fun PlayerActivity.showV483OutputAutoSelect483Toggle() {
    val current = BiliClient.prefs.v483outputAutoSelect483
    BiliClient.prefs.v483outputAutoSelect483 = !current
    AppToast.show(this, "Output Auto Select483: ${if (!current) "ON" else "OFF"}")
}

// v483: Overlay Auto Show483
internal fun PlayerActivity.showV483OverlayAutoShow483Toggle() {
    val current = BiliClient.prefs.v483overlayAutoShow483
    BiliClient.prefs.v483overlayAutoShow483 = !current
    AppToast.show(this, "Overlay Auto Show483: ${if (!current) "ON" else "OFF"}")
}

// v483: Override Global483
internal fun PlayerActivity.showV483OverrideGlobal483Toggle() {
    val current = BiliClient.prefs.v483overrideGlobal483
    BiliClient.prefs.v483overrideGlobal483 = !current
    AppToast.show(this, "Override Global483: ${if (!current) "ON" else "OFF"}")
}

// v483: Pack Auto Compress483
internal fun PlayerActivity.showV483PackAutoCompress483Toggle() {
    val current = BiliClient.prefs.v483packAutoCompress483
    BiliClient.prefs.v483packAutoCompress483 = !current
    AppToast.show(this, "Pack Auto Compress483: ${if (!current) "ON" else "OFF"}")
}

// v484: Module Auto Load484
internal fun PlayerActivity.showV484ModuleAutoLoad484Toggle() {
    val current = BiliClient.prefs.v484moduleAutoLoad484
    BiliClient.prefs.v484moduleAutoLoad484 = !current
    AppToast.show(this, "Module Auto Load484: ${if (!current) "ON" else "OFF"}")
}

// v484: Monitor CPU Usage484
internal fun PlayerActivity.showV484MonitorCpuUsage484Toggle() {
    val current = BiliClient.prefs.v484monitorCpuUsage484
    BiliClient.prefs.v484monitorCpuUsage484 = !current
    AppToast.show(this, "Monitor CPU Usage484: ${if (!current) "ON" else "OFF"}")
}

// v484: Mount Auto Detect484
internal fun PlayerActivity.showV484MountAutoDetect484Toggle() {
    val current = BiliClient.prefs.v484mountAutoDetect484
    BiliClient.prefs.v484mountAutoDetect484 = !current
    AppToast.show(this, "Mount Auto Detect484: ${if (!current) "ON" else "OFF"}")
}

// v484: Mouse Hover Preview484
internal fun PlayerActivity.showV484MouseHoverPreview484Toggle() {
    val current = BiliClient.prefs.v484mouseHoverPreview484
    BiliClient.prefs.v484mouseHoverPreview484 = !current
    AppToast.show(this, "Mouse Hover Preview484: ${if (!current) "ON" else "OFF"}")
}

// v484: Move Transition484
internal fun PlayerActivity.showV484MoveTransition484Toggle() {
    val current = BiliClient.prefs.v484moveTransition484
    BiliClient.prefs.v484moveTransition484 = !current
    AppToast.show(this, "Move Transition484: ${if (!current) "ON" else "OFF"}")
}

// v484: Multi Thread Decode484
internal fun PlayerActivity.showV484MultiThreadDecode484Toggle() {
    val current = BiliClient.prefs.v484multiThreadDecode484
    BiliClient.prefs.v484multiThreadDecode484 = !current
    AppToast.show(this, "Multi Thread Decode484: ${if (!current) "ON" else "OFF"}")
}

// v484: Nav Auto Collapse484
internal fun PlayerActivity.showV484NavAutoCollapse484Toggle() {
    val current = BiliClient.prefs.v484navAutoCollapse484
    BiliClient.prefs.v484navAutoCollapse484 = !current
    AppToast.show(this, "Nav Auto Collapse484: ${if (!current) "ON" else "OFF"}")
}

// v484: Node Auto Connect484
internal fun PlayerActivity.showV484NodeAutoConnect484Toggle() {
    val current = BiliClient.prefs.v484nodeAutoConnect484
    BiliClient.prefs.v484nodeAutoConnect484 = !current
    AppToast.show(this, "Node Auto Connect484: ${if (!current) "ON" else "OFF"}")
}

// v484: Offset Auto Calibrate484
internal fun PlayerActivity.showV484OffsetAutoCalibrate484Toggle() {
    val current = BiliClient.prefs.v484offsetAutoCalibrate484
    BiliClient.prefs.v484offsetAutoCalibrate484 = !current
    AppToast.show(this, "Offset Auto Calibrate484: ${if (!current) "ON" else "OFF"}")
}

// v484: Open With External484
internal fun PlayerActivity.showV484OpenWithExternal484Toggle() {
    val current = BiliClient.prefs.v484openWithExternal484
    BiliClient.prefs.v484openWithExternal484 = !current
    AppToast.show(this, "Open With External484: ${if (!current) "ON" else "OFF"}")
}

// v484: Order Auto Sort484
internal fun PlayerActivity.showV484OrderAutoSort484Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v484orderAutoSort484).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort484",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v484orderAutoSort484 = value
        AppToast.show(this, "Order Auto Sort484: $value")
    }
}

// v484: Output Auto Select484
internal fun PlayerActivity.showV484OutputAutoSelect484Toggle() {
    val current = BiliClient.prefs.v484outputAutoSelect484
    BiliClient.prefs.v484outputAutoSelect484 = !current
    AppToast.show(this, "Output Auto Select484: ${if (!current) "ON" else "OFF"}")
}

// v484: Overlay Auto Show484
internal fun PlayerActivity.showV484OverlayAutoShow484Toggle() {
    val current = BiliClient.prefs.v484overlayAutoShow484
    BiliClient.prefs.v484overlayAutoShow484 = !current
    AppToast.show(this, "Overlay Auto Show484: ${if (!current) "ON" else "OFF"}")
}

// v484: Override Global484
internal fun PlayerActivity.showV484OverrideGlobal484Toggle() {
    val current = BiliClient.prefs.v484overrideGlobal484
    BiliClient.prefs.v484overrideGlobal484 = !current
    AppToast.show(this, "Override Global484: ${if (!current) "ON" else "OFF"}")
}

// v484: Pack Auto Compress484
internal fun PlayerActivity.showV484PackAutoCompress484Toggle() {
    val current = BiliClient.prefs.v484packAutoCompress484
    BiliClient.prefs.v484packAutoCompress484 = !current
    AppToast.show(this, "Pack Auto Compress484: ${if (!current) "ON" else "OFF"}")
}

// v485: Module Auto Load485
internal fun PlayerActivity.showV485ModuleAutoLoad485Toggle() {
    val current = BiliClient.prefs.v485moduleAutoLoad485
    BiliClient.prefs.v485moduleAutoLoad485 = !current
    AppToast.show(this, "Module Auto Load485: ${if (!current) "ON" else "OFF"}")
}

// v485: Monitor CPU Usage485
internal fun PlayerActivity.showV485MonitorCpuUsage485Toggle() {
    val current = BiliClient.prefs.v485monitorCpuUsage485
    BiliClient.prefs.v485monitorCpuUsage485 = !current
    AppToast.show(this, "Monitor CPU Usage485: ${if (!current) "ON" else "OFF"}")
}

// v485: Mount Auto Detect485
internal fun PlayerActivity.showV485MountAutoDetect485Toggle() {
    val current = BiliClient.prefs.v485mountAutoDetect485
    BiliClient.prefs.v485mountAutoDetect485 = !current
    AppToast.show(this, "Mount Auto Detect485: ${if (!current) "ON" else "OFF"}")
}

// v485: Mouse Hover Preview485
internal fun PlayerActivity.showV485MouseHoverPreview485Toggle() {
    val current = BiliClient.prefs.v485mouseHoverPreview485
    BiliClient.prefs.v485mouseHoverPreview485 = !current
    AppToast.show(this, "Mouse Hover Preview485: ${if (!current) "ON" else "OFF"}")
}

// v485: Move Transition485
internal fun PlayerActivity.showV485MoveTransition485Toggle() {
    val current = BiliClient.prefs.v485moveTransition485
    BiliClient.prefs.v485moveTransition485 = !current
    AppToast.show(this, "Move Transition485: ${if (!current) "ON" else "OFF"}")
}

// v485: Multi Thread Decode485
internal fun PlayerActivity.showV485MultiThreadDecode485Toggle() {
    val current = BiliClient.prefs.v485multiThreadDecode485
    BiliClient.prefs.v485multiThreadDecode485 = !current
    AppToast.show(this, "Multi Thread Decode485: ${if (!current) "ON" else "OFF"}")
}

// v485: Nav Auto Collapse485
internal fun PlayerActivity.showV485NavAutoCollapse485Toggle() {
    val current = BiliClient.prefs.v485navAutoCollapse485
    BiliClient.prefs.v485navAutoCollapse485 = !current
    AppToast.show(this, "Nav Auto Collapse485: ${if (!current) "ON" else "OFF"}")
}

// v485: Node Auto Connect485
internal fun PlayerActivity.showV485NodeAutoConnect485Toggle() {
    val current = BiliClient.prefs.v485nodeAutoConnect485
    BiliClient.prefs.v485nodeAutoConnect485 = !current
    AppToast.show(this, "Node Auto Connect485: ${if (!current) "ON" else "OFF"}")
}

// v485: Offset Auto Calibrate485
internal fun PlayerActivity.showV485OffsetAutoCalibrate485Toggle() {
    val current = BiliClient.prefs.v485offsetAutoCalibrate485
    BiliClient.prefs.v485offsetAutoCalibrate485 = !current
    AppToast.show(this, "Offset Auto Calibrate485: ${if (!current) "ON" else "OFF"}")
}

// v485: Open With External485
internal fun PlayerActivity.showV485OpenWithExternal485Toggle() {
    val current = BiliClient.prefs.v485openWithExternal485
    BiliClient.prefs.v485openWithExternal485 = !current
    AppToast.show(this, "Open With External485: ${if (!current) "ON" else "OFF"}")
}

// v485: Order Auto Sort485
internal fun PlayerActivity.showV485OrderAutoSort485Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v485orderAutoSort485).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort485",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v485orderAutoSort485 = value
        AppToast.show(this, "Order Auto Sort485: $value")
    }
}

// v485: Output Auto Select485
internal fun PlayerActivity.showV485OutputAutoSelect485Toggle() {
    val current = BiliClient.prefs.v485outputAutoSelect485
    BiliClient.prefs.v485outputAutoSelect485 = !current
    AppToast.show(this, "Output Auto Select485: ${if (!current) "ON" else "OFF"}")
}

// v485: Overlay Auto Show485
internal fun PlayerActivity.showV485OverlayAutoShow485Toggle() {
    val current = BiliClient.prefs.v485overlayAutoShow485
    BiliClient.prefs.v485overlayAutoShow485 = !current
    AppToast.show(this, "Overlay Auto Show485: ${if (!current) "ON" else "OFF"}")
}

// v485: Override Global485
internal fun PlayerActivity.showV485OverrideGlobal485Toggle() {
    val current = BiliClient.prefs.v485overrideGlobal485
    BiliClient.prefs.v485overrideGlobal485 = !current
    AppToast.show(this, "Override Global485: ${if (!current) "ON" else "OFF"}")
}

// v485: Pack Auto Compress485
internal fun PlayerActivity.showV485PackAutoCompress485Toggle() {
    val current = BiliClient.prefs.v485packAutoCompress485
    BiliClient.prefs.v485packAutoCompress485 = !current
    AppToast.show(this, "Pack Auto Compress485: ${if (!current) "ON" else "OFF"}")
}

// v486: Module Auto Load486
internal fun PlayerActivity.showV486ModuleAutoLoad486Toggle() {
    val current = BiliClient.prefs.v486moduleAutoLoad486
    BiliClient.prefs.v486moduleAutoLoad486 = !current
    AppToast.show(this, "Module Auto Load486: ${if (!current) "ON" else "OFF"}")
}

// v486: Monitor CPU Usage486
internal fun PlayerActivity.showV486MonitorCpuUsage486Toggle() {
    val current = BiliClient.prefs.v486monitorCpuUsage486
    BiliClient.prefs.v486monitorCpuUsage486 = !current
    AppToast.show(this, "Monitor CPU Usage486: ${if (!current) "ON" else "OFF"}")
}

// v486: Mount Auto Detect486
internal fun PlayerActivity.showV486MountAutoDetect486Toggle() {
    val current = BiliClient.prefs.v486mountAutoDetect486
    BiliClient.prefs.v486mountAutoDetect486 = !current
    AppToast.show(this, "Mount Auto Detect486: ${if (!current) "ON" else "OFF"}")
}

// v486: Mouse Hover Preview486
internal fun PlayerActivity.showV486MouseHoverPreview486Toggle() {
    val current = BiliClient.prefs.v486mouseHoverPreview486
    BiliClient.prefs.v486mouseHoverPreview486 = !current
    AppToast.show(this, "Mouse Hover Preview486: ${if (!current) "ON" else "OFF"}")
}

// v486: Move Transition486
internal fun PlayerActivity.showV486MoveTransition486Toggle() {
    val current = BiliClient.prefs.v486moveTransition486
    BiliClient.prefs.v486moveTransition486 = !current
    AppToast.show(this, "Move Transition486: ${if (!current) "ON" else "OFF"}")
}

// v486: Multi Thread Decode486
internal fun PlayerActivity.showV486MultiThreadDecode486Toggle() {
    val current = BiliClient.prefs.v486multiThreadDecode486
    BiliClient.prefs.v486multiThreadDecode486 = !current
    AppToast.show(this, "Multi Thread Decode486: ${if (!current) "ON" else "OFF"}")
}

// v486: Nav Auto Collapse486
internal fun PlayerActivity.showV486NavAutoCollapse486Toggle() {
    val current = BiliClient.prefs.v486navAutoCollapse486
    BiliClient.prefs.v486navAutoCollapse486 = !current
    AppToast.show(this, "Nav Auto Collapse486: ${if (!current) "ON" else "OFF"}")
}

// v486: Node Auto Connect486
internal fun PlayerActivity.showV486NodeAutoConnect486Toggle() {
    val current = BiliClient.prefs.v486nodeAutoConnect486
    BiliClient.prefs.v486nodeAutoConnect486 = !current
    AppToast.show(this, "Node Auto Connect486: ${if (!current) "ON" else "OFF"}")
}

// v486: Offset Auto Calibrate486
internal fun PlayerActivity.showV486OffsetAutoCalibrate486Toggle() {
    val current = BiliClient.prefs.v486offsetAutoCalibrate486
    BiliClient.prefs.v486offsetAutoCalibrate486 = !current
    AppToast.show(this, "Offset Auto Calibrate486: ${if (!current) "ON" else "OFF"}")
}

// v486: Open With External486
internal fun PlayerActivity.showV486OpenWithExternal486Toggle() {
    val current = BiliClient.prefs.v486openWithExternal486
    BiliClient.prefs.v486openWithExternal486 = !current
    AppToast.show(this, "Open With External486: ${if (!current) "ON" else "OFF"}")
}

// v486: Order Auto Sort486
internal fun PlayerActivity.showV486OrderAutoSort486Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v486orderAutoSort486).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort486",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v486orderAutoSort486 = value
        AppToast.show(this, "Order Auto Sort486: $value")
    }
}

// v486: Output Auto Select486
internal fun PlayerActivity.showV486OutputAutoSelect486Toggle() {
    val current = BiliClient.prefs.v486outputAutoSelect486
    BiliClient.prefs.v486outputAutoSelect486 = !current
    AppToast.show(this, "Output Auto Select486: ${if (!current) "ON" else "OFF"}")
}

// v486: Overlay Auto Show486
internal fun PlayerActivity.showV486OverlayAutoShow486Toggle() {
    val current = BiliClient.prefs.v486overlayAutoShow486
    BiliClient.prefs.v486overlayAutoShow486 = !current
    AppToast.show(this, "Overlay Auto Show486: ${if (!current) "ON" else "OFF"}")
}

// v486: Override Global486
internal fun PlayerActivity.showV486OverrideGlobal486Toggle() {
    val current = BiliClient.prefs.v486overrideGlobal486
    BiliClient.prefs.v486overrideGlobal486 = !current
    AppToast.show(this, "Override Global486: ${if (!current) "ON" else "OFF"}")
}

// v486: Pack Auto Compress486
internal fun PlayerActivity.showV486PackAutoCompress486Toggle() {
    val current = BiliClient.prefs.v486packAutoCompress486
    BiliClient.prefs.v486packAutoCompress486 = !current
    AppToast.show(this, "Pack Auto Compress486: ${if (!current) "ON" else "OFF"}")
}

// v487: Module Auto Load487
internal fun PlayerActivity.showV487ModuleAutoLoad487Toggle() {
    val current = BiliClient.prefs.v487moduleAutoLoad487
    BiliClient.prefs.v487moduleAutoLoad487 = !current
    AppToast.show(this, "Module Auto Load487: ${if (!current) "ON" else "OFF"}")
}

// v487: Monitor CPU Usage487
internal fun PlayerActivity.showV487MonitorCpuUsage487Toggle() {
    val current = BiliClient.prefs.v487monitorCpuUsage487
    BiliClient.prefs.v487monitorCpuUsage487 = !current
    AppToast.show(this, "Monitor CPU Usage487: ${if (!current) "ON" else "OFF"}")
}

// v487: Mount Auto Detect487
internal fun PlayerActivity.showV487MountAutoDetect487Toggle() {
    val current = BiliClient.prefs.v487mountAutoDetect487
    BiliClient.prefs.v487mountAutoDetect487 = !current
    AppToast.show(this, "Mount Auto Detect487: ${if (!current) "ON" else "OFF"}")
}

// v487: Mouse Hover Preview487
internal fun PlayerActivity.showV487MouseHoverPreview487Toggle() {
    val current = BiliClient.prefs.v487mouseHoverPreview487
    BiliClient.prefs.v487mouseHoverPreview487 = !current
    AppToast.show(this, "Mouse Hover Preview487: ${if (!current) "ON" else "OFF"}")
}

// v487: Move Transition487
internal fun PlayerActivity.showV487MoveTransition487Toggle() {
    val current = BiliClient.prefs.v487moveTransition487
    BiliClient.prefs.v487moveTransition487 = !current
    AppToast.show(this, "Move Transition487: ${if (!current) "ON" else "OFF"}")
}

// v487: Multi Thread Decode487
internal fun PlayerActivity.showV487MultiThreadDecode487Toggle() {
    val current = BiliClient.prefs.v487multiThreadDecode487
    BiliClient.prefs.v487multiThreadDecode487 = !current
    AppToast.show(this, "Multi Thread Decode487: ${if (!current) "ON" else "OFF"}")
}

// v487: Nav Auto Collapse487
internal fun PlayerActivity.showV487NavAutoCollapse487Toggle() {
    val current = BiliClient.prefs.v487navAutoCollapse487
    BiliClient.prefs.v487navAutoCollapse487 = !current
    AppToast.show(this, "Nav Auto Collapse487: ${if (!current) "ON" else "OFF"}")
}

// v487: Node Auto Connect487
internal fun PlayerActivity.showV487NodeAutoConnect487Toggle() {
    val current = BiliClient.prefs.v487nodeAutoConnect487
    BiliClient.prefs.v487nodeAutoConnect487 = !current
    AppToast.show(this, "Node Auto Connect487: ${if (!current) "ON" else "OFF"}")
}

// v487: Offset Auto Calibrate487
internal fun PlayerActivity.showV487OffsetAutoCalibrate487Toggle() {
    val current = BiliClient.prefs.v487offsetAutoCalibrate487
    BiliClient.prefs.v487offsetAutoCalibrate487 = !current
    AppToast.show(this, "Offset Auto Calibrate487: ${if (!current) "ON" else "OFF"}")
}

// v487: Open With External487
internal fun PlayerActivity.showV487OpenWithExternal487Toggle() {
    val current = BiliClient.prefs.v487openWithExternal487
    BiliClient.prefs.v487openWithExternal487 = !current
    AppToast.show(this, "Open With External487: ${if (!current) "ON" else "OFF"}")
}

// v487: Order Auto Sort487
internal fun PlayerActivity.showV487OrderAutoSort487Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v487orderAutoSort487).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort487",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v487orderAutoSort487 = value
        AppToast.show(this, "Order Auto Sort487: $value")
    }
}

// v487: Output Auto Select487
internal fun PlayerActivity.showV487OutputAutoSelect487Toggle() {
    val current = BiliClient.prefs.v487outputAutoSelect487
    BiliClient.prefs.v487outputAutoSelect487 = !current
    AppToast.show(this, "Output Auto Select487: ${if (!current) "ON" else "OFF"}")
}

// v487: Overlay Auto Show487
internal fun PlayerActivity.showV487OverlayAutoShow487Toggle() {
    val current = BiliClient.prefs.v487overlayAutoShow487
    BiliClient.prefs.v487overlayAutoShow487 = !current
    AppToast.show(this, "Overlay Auto Show487: ${if (!current) "ON" else "OFF"}")
}

// v487: Override Global487
internal fun PlayerActivity.showV487OverrideGlobal487Toggle() {
    val current = BiliClient.prefs.v487overrideGlobal487
    BiliClient.prefs.v487overrideGlobal487 = !current
    AppToast.show(this, "Override Global487: ${if (!current) "ON" else "OFF"}")
}

// v487: Pack Auto Compress487
internal fun PlayerActivity.showV487PackAutoCompress487Toggle() {
    val current = BiliClient.prefs.v487packAutoCompress487
    BiliClient.prefs.v487packAutoCompress487 = !current
    AppToast.show(this, "Pack Auto Compress487: ${if (!current) "ON" else "OFF"}")
}

// v488: Module Auto Load488
internal fun PlayerActivity.showV488ModuleAutoLoad488Toggle() {
    val current = BiliClient.prefs.v488moduleAutoLoad488
    BiliClient.prefs.v488moduleAutoLoad488 = !current
    AppToast.show(this, "Module Auto Load488: ${if (!current) "ON" else "OFF"}")
}

// v488: Monitor CPU Usage488
internal fun PlayerActivity.showV488MonitorCpuUsage488Toggle() {
    val current = BiliClient.prefs.v488monitorCpuUsage488
    BiliClient.prefs.v488monitorCpuUsage488 = !current
    AppToast.show(this, "Monitor CPU Usage488: ${if (!current) "ON" else "OFF"}")
}

// v488: Mount Auto Detect488
internal fun PlayerActivity.showV488MountAutoDetect488Toggle() {
    val current = BiliClient.prefs.v488mountAutoDetect488
    BiliClient.prefs.v488mountAutoDetect488 = !current
    AppToast.show(this, "Mount Auto Detect488: ${if (!current) "ON" else "OFF"}")
}

// v488: Mouse Hover Preview488
internal fun PlayerActivity.showV488MouseHoverPreview488Toggle() {
    val current = BiliClient.prefs.v488mouseHoverPreview488
    BiliClient.prefs.v488mouseHoverPreview488 = !current
    AppToast.show(this, "Mouse Hover Preview488: ${if (!current) "ON" else "OFF"}")
}

// v488: Move Transition488
internal fun PlayerActivity.showV488MoveTransition488Toggle() {
    val current = BiliClient.prefs.v488moveTransition488
    BiliClient.prefs.v488moveTransition488 = !current
    AppToast.show(this, "Move Transition488: ${if (!current) "ON" else "OFF"}")
}

// v488: Multi Thread Decode488
internal fun PlayerActivity.showV488MultiThreadDecode488Toggle() {
    val current = BiliClient.prefs.v488multiThreadDecode488
    BiliClient.prefs.v488multiThreadDecode488 = !current
    AppToast.show(this, "Multi Thread Decode488: ${if (!current) "ON" else "OFF"}")
}

// v488: Nav Auto Collapse488
internal fun PlayerActivity.showV488NavAutoCollapse488Toggle() {
    val current = BiliClient.prefs.v488navAutoCollapse488
    BiliClient.prefs.v488navAutoCollapse488 = !current
    AppToast.show(this, "Nav Auto Collapse488: ${if (!current) "ON" else "OFF"}")
}

// v488: Node Auto Connect488
internal fun PlayerActivity.showV488NodeAutoConnect488Toggle() {
    val current = BiliClient.prefs.v488nodeAutoConnect488
    BiliClient.prefs.v488nodeAutoConnect488 = !current
    AppToast.show(this, "Node Auto Connect488: ${if (!current) "ON" else "OFF"}")
}

// v488: Offset Auto Calibrate488
internal fun PlayerActivity.showV488OffsetAutoCalibrate488Toggle() {
    val current = BiliClient.prefs.v488offsetAutoCalibrate488
    BiliClient.prefs.v488offsetAutoCalibrate488 = !current
    AppToast.show(this, "Offset Auto Calibrate488: ${if (!current) "ON" else "OFF"}")
}

// v488: Open With External488
internal fun PlayerActivity.showV488OpenWithExternal488Toggle() {
    val current = BiliClient.prefs.v488openWithExternal488
    BiliClient.prefs.v488openWithExternal488 = !current
    AppToast.show(this, "Open With External488: ${if (!current) "ON" else "OFF"}")
}

// v488: Order Auto Sort488
internal fun PlayerActivity.showV488OrderAutoSort488Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v488orderAutoSort488).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort488",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v488orderAutoSort488 = value
        AppToast.show(this, "Order Auto Sort488: $value")
    }
}

// v488: Output Auto Select488
internal fun PlayerActivity.showV488OutputAutoSelect488Toggle() {
    val current = BiliClient.prefs.v488outputAutoSelect488
    BiliClient.prefs.v488outputAutoSelect488 = !current
    AppToast.show(this, "Output Auto Select488: ${if (!current) "ON" else "OFF"}")
}

// v488: Overlay Auto Show488
internal fun PlayerActivity.showV488OverlayAutoShow488Toggle() {
    val current = BiliClient.prefs.v488overlayAutoShow488
    BiliClient.prefs.v488overlayAutoShow488 = !current
    AppToast.show(this, "Overlay Auto Show488: ${if (!current) "ON" else "OFF"}")
}

// v488: Override Global488
internal fun PlayerActivity.showV488OverrideGlobal488Toggle() {
    val current = BiliClient.prefs.v488overrideGlobal488
    BiliClient.prefs.v488overrideGlobal488 = !current
    AppToast.show(this, "Override Global488: ${if (!current) "ON" else "OFF"}")
}

// v488: Pack Auto Compress488
internal fun PlayerActivity.showV488PackAutoCompress488Toggle() {
    val current = BiliClient.prefs.v488packAutoCompress488
    BiliClient.prefs.v488packAutoCompress488 = !current
    AppToast.show(this, "Pack Auto Compress488: ${if (!current) "ON" else "OFF"}")
}

// v489: Module Auto Load489
internal fun PlayerActivity.showV489ModuleAutoLoad489Toggle() {
    val current = BiliClient.prefs.v489moduleAutoLoad489
    BiliClient.prefs.v489moduleAutoLoad489 = !current
    AppToast.show(this, "Module Auto Load489: ${if (!current) "ON" else "OFF"}")
}

// v489: Monitor CPU Usage489
internal fun PlayerActivity.showV489MonitorCpuUsage489Toggle() {
    val current = BiliClient.prefs.v489monitorCpuUsage489
    BiliClient.prefs.v489monitorCpuUsage489 = !current
    AppToast.show(this, "Monitor CPU Usage489: ${if (!current) "ON" else "OFF"}")
}

// v489: Mount Auto Detect489
internal fun PlayerActivity.showV489MountAutoDetect489Toggle() {
    val current = BiliClient.prefs.v489mountAutoDetect489
    BiliClient.prefs.v489mountAutoDetect489 = !current
    AppToast.show(this, "Mount Auto Detect489: ${if (!current) "ON" else "OFF"}")
}

// v489: Mouse Hover Preview489
internal fun PlayerActivity.showV489MouseHoverPreview489Toggle() {
    val current = BiliClient.prefs.v489mouseHoverPreview489
    BiliClient.prefs.v489mouseHoverPreview489 = !current
    AppToast.show(this, "Mouse Hover Preview489: ${if (!current) "ON" else "OFF"}")
}

// v489: Move Transition489
internal fun PlayerActivity.showV489MoveTransition489Toggle() {
    val current = BiliClient.prefs.v489moveTransition489
    BiliClient.prefs.v489moveTransition489 = !current
    AppToast.show(this, "Move Transition489: ${if (!current) "ON" else "OFF"}")
}

// v489: Multi Thread Decode489
internal fun PlayerActivity.showV489MultiThreadDecode489Toggle() {
    val current = BiliClient.prefs.v489multiThreadDecode489
    BiliClient.prefs.v489multiThreadDecode489 = !current
    AppToast.show(this, "Multi Thread Decode489: ${if (!current) "ON" else "OFF"}")
}

// v489: Nav Auto Collapse489
internal fun PlayerActivity.showV489NavAutoCollapse489Toggle() {
    val current = BiliClient.prefs.v489navAutoCollapse489
    BiliClient.prefs.v489navAutoCollapse489 = !current
    AppToast.show(this, "Nav Auto Collapse489: ${if (!current) "ON" else "OFF"}")
}

// v489: Node Auto Connect489
internal fun PlayerActivity.showV489NodeAutoConnect489Toggle() {
    val current = BiliClient.prefs.v489nodeAutoConnect489
    BiliClient.prefs.v489nodeAutoConnect489 = !current
    AppToast.show(this, "Node Auto Connect489: ${if (!current) "ON" else "OFF"}")
}

// v489: Offset Auto Calibrate489
internal fun PlayerActivity.showV489OffsetAutoCalibrate489Toggle() {
    val current = BiliClient.prefs.v489offsetAutoCalibrate489
    BiliClient.prefs.v489offsetAutoCalibrate489 = !current
    AppToast.show(this, "Offset Auto Calibrate489: ${if (!current) "ON" else "OFF"}")
}

// v489: Open With External489
internal fun PlayerActivity.showV489OpenWithExternal489Toggle() {
    val current = BiliClient.prefs.v489openWithExternal489
    BiliClient.prefs.v489openWithExternal489 = !current
    AppToast.show(this, "Open With External489: ${if (!current) "ON" else "OFF"}")
}

// v489: Order Auto Sort489
internal fun PlayerActivity.showV489OrderAutoSort489Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v489orderAutoSort489).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort489",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v489orderAutoSort489 = value
        AppToast.show(this, "Order Auto Sort489: $value")
    }
}

// v489: Output Auto Select489
internal fun PlayerActivity.showV489OutputAutoSelect489Toggle() {
    val current = BiliClient.prefs.v489outputAutoSelect489
    BiliClient.prefs.v489outputAutoSelect489 = !current
    AppToast.show(this, "Output Auto Select489: ${if (!current) "ON" else "OFF"}")
}

// v489: Overlay Auto Show489
internal fun PlayerActivity.showV489OverlayAutoShow489Toggle() {
    val current = BiliClient.prefs.v489overlayAutoShow489
    BiliClient.prefs.v489overlayAutoShow489 = !current
    AppToast.show(this, "Overlay Auto Show489: ${if (!current) "ON" else "OFF"}")
}

// v489: Override Global489
internal fun PlayerActivity.showV489OverrideGlobal489Toggle() {
    val current = BiliClient.prefs.v489overrideGlobal489
    BiliClient.prefs.v489overrideGlobal489 = !current
    AppToast.show(this, "Override Global489: ${if (!current) "ON" else "OFF"}")
}

// v489: Pack Auto Compress489
internal fun PlayerActivity.showV489PackAutoCompress489Toggle() {
    val current = BiliClient.prefs.v489packAutoCompress489
    BiliClient.prefs.v489packAutoCompress489 = !current
    AppToast.show(this, "Pack Auto Compress489: ${if (!current) "ON" else "OFF"}")
}

// v490: Module Auto Load490
internal fun PlayerActivity.showV490ModuleAutoLoad490Toggle() {
    val current = BiliClient.prefs.v490moduleAutoLoad490
    BiliClient.prefs.v490moduleAutoLoad490 = !current
    AppToast.show(this, "Module Auto Load490: ${if (!current) "ON" else "OFF"}")
}

// v490: Monitor CPU Usage490
internal fun PlayerActivity.showV490MonitorCpuUsage490Toggle() {
    val current = BiliClient.prefs.v490monitorCpuUsage490
    BiliClient.prefs.v490monitorCpuUsage490 = !current
    AppToast.show(this, "Monitor CPU Usage490: ${if (!current) "ON" else "OFF"}")
}

// v490: Mount Auto Detect490
internal fun PlayerActivity.showV490MountAutoDetect490Toggle() {
    val current = BiliClient.prefs.v490mountAutoDetect490
    BiliClient.prefs.v490mountAutoDetect490 = !current
    AppToast.show(this, "Mount Auto Detect490: ${if (!current) "ON" else "OFF"}")
}

// v490: Mouse Hover Preview490
internal fun PlayerActivity.showV490MouseHoverPreview490Toggle() {
    val current = BiliClient.prefs.v490mouseHoverPreview490
    BiliClient.prefs.v490mouseHoverPreview490 = !current
    AppToast.show(this, "Mouse Hover Preview490: ${if (!current) "ON" else "OFF"}")
}

// v490: Move Transition490
internal fun PlayerActivity.showV490MoveTransition490Toggle() {
    val current = BiliClient.prefs.v490moveTransition490
    BiliClient.prefs.v490moveTransition490 = !current
    AppToast.show(this, "Move Transition490: ${if (!current) "ON" else "OFF"}")
}

// v490: Multi Thread Decode490
internal fun PlayerActivity.showV490MultiThreadDecode490Toggle() {
    val current = BiliClient.prefs.v490multiThreadDecode490
    BiliClient.prefs.v490multiThreadDecode490 = !current
    AppToast.show(this, "Multi Thread Decode490: ${if (!current) "ON" else "OFF"}")
}

// v490: Nav Auto Collapse490
internal fun PlayerActivity.showV490NavAutoCollapse490Toggle() {
    val current = BiliClient.prefs.v490navAutoCollapse490
    BiliClient.prefs.v490navAutoCollapse490 = !current
    AppToast.show(this, "Nav Auto Collapse490: ${if (!current) "ON" else "OFF"}")
}

// v490: Node Auto Connect490
internal fun PlayerActivity.showV490NodeAutoConnect490Toggle() {
    val current = BiliClient.prefs.v490nodeAutoConnect490
    BiliClient.prefs.v490nodeAutoConnect490 = !current
    AppToast.show(this, "Node Auto Connect490: ${if (!current) "ON" else "OFF"}")
}

// v490: Offset Auto Calibrate490
internal fun PlayerActivity.showV490OffsetAutoCalibrate490Toggle() {
    val current = BiliClient.prefs.v490offsetAutoCalibrate490
    BiliClient.prefs.v490offsetAutoCalibrate490 = !current
    AppToast.show(this, "Offset Auto Calibrate490: ${if (!current) "ON" else "OFF"}")
}

// v490: Open With External490
internal fun PlayerActivity.showV490OpenWithExternal490Toggle() {
    val current = BiliClient.prefs.v490openWithExternal490
    BiliClient.prefs.v490openWithExternal490 = !current
    AppToast.show(this, "Open With External490: ${if (!current) "ON" else "OFF"}")
}

// v490: Order Auto Sort490
internal fun PlayerActivity.showV490OrderAutoSort490Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v490orderAutoSort490).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Order Auto Sort490",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v490orderAutoSort490 = value
        AppToast.show(this, "Order Auto Sort490: $value")
    }
}

// v490: Output Auto Select490
internal fun PlayerActivity.showV490OutputAutoSelect490Toggle() {
    val current = BiliClient.prefs.v490outputAutoSelect490
    BiliClient.prefs.v490outputAutoSelect490 = !current
    AppToast.show(this, "Output Auto Select490: ${if (!current) "ON" else "OFF"}")
}

// v490: Overlay Auto Show490
internal fun PlayerActivity.showV490OverlayAutoShow490Toggle() {
    val current = BiliClient.prefs.v490overlayAutoShow490
    BiliClient.prefs.v490overlayAutoShow490 = !current
    AppToast.show(this, "Overlay Auto Show490: ${if (!current) "ON" else "OFF"}")
}

// v490: Override Global490
internal fun PlayerActivity.showV490OverrideGlobal490Toggle() {
    val current = BiliClient.prefs.v490overrideGlobal490
    BiliClient.prefs.v490overrideGlobal490 = !current
    AppToast.show(this, "Override Global490: ${if (!current) "ON" else "OFF"}")
}

// v490: Pack Auto Compress490
internal fun PlayerActivity.showV490PackAutoCompress490Toggle() {
    val current = BiliClient.prefs.v490packAutoCompress490
    BiliClient.prefs.v490packAutoCompress490 = !current
    AppToast.show(this, "Pack Auto Compress490: ${if (!current) "ON" else "OFF"}")
}

// v491: Pad Auto Detect491
internal fun PlayerActivity.showV491PadAutoDetect491Toggle() {
    val current = BiliClient.prefs.v491padAutoDetect491
    BiliClient.prefs.v491padAutoDetect491 = !current
    AppToast.show(this, "Pad Auto Detect491: ${if (!current) "ON" else "OFF"}")
}

// v491: Parent Control Pin491
internal fun PlayerActivity.showV491ParentControlPin491Toggle() {
    val current = BiliClient.prefs.v491parentControlPin491
    BiliClient.prefs.v491parentControlPin491 = !current
    AppToast.show(this, "Parent Control Pin491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pass Through Audio491
internal fun PlayerActivity.showV491PassThroughAudio491Toggle() {
    val current = BiliClient.prefs.v491passThroughAudio491
    BiliClient.prefs.v491passThroughAudio491 = !current
    AppToast.show(this, "Pass Through Audio491: ${if (!current) "ON" else "OFF"}")
}

// v491: Path Auto Resolve491
internal fun PlayerActivity.showV491PathAutoResolve491Toggle() {
    val current = BiliClient.prefs.v491pathAutoResolve491
    BiliClient.prefs.v491pathAutoResolve491 = !current
    AppToast.show(this, "Path Auto Resolve491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pattern Auto Match491
internal fun PlayerActivity.showV491PatternAutoMatch491Toggle() {
    val current = BiliClient.prefs.v491patternAutoMatch491
    BiliClient.prefs.v491patternAutoMatch491 = !current
    AppToast.show(this, "Pattern Auto Match491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pause On Headset491
internal fun PlayerActivity.showV491PauseOnHeadset491Toggle() {
    val current = BiliClient.prefs.v491pauseOnHeadset491
    BiliClient.prefs.v491pauseOnHeadset491 = !current
    AppToast.show(this, "Pause On Headset491: ${if (!current) "ON" else "OFF"}")
}

// v491: Peak Auto Detect491
internal fun PlayerActivity.showV491PeakAutoDetect491Toggle() {
    val current = BiliClient.prefs.v491peakAutoDetect491
    BiliClient.prefs.v491peakAutoDetect491 = !current
    AppToast.show(this, "Peak Auto Detect491: ${if (!current) "ON" else "OFF"}")
}

// v491: Period Auto Extend491
internal fun PlayerActivity.showV491PeriodAutoExtend491Toggle() {
    val current = BiliClient.prefs.v491periodAutoExtend491
    BiliClient.prefs.v491periodAutoExtend491 = !current
    AppToast.show(this, "Period Auto Extend491: ${if (!current) "ON" else "OFF"}")
}

// v491: Permission Auto Grant491
internal fun PlayerActivity.showV491PermissionAutoGrant491Toggle() {
    val current = BiliClient.prefs.v491permissionAutoGrant491
    BiliClient.prefs.v491permissionAutoGrant491 = !current
    AppToast.show(this, "Permission Auto Grant491: ${if (!current) "ON" else "OFF"}")
}

// v491: Phase Auto Align491
internal fun PlayerActivity.showV491PhaseAutoAlign491Toggle() {
    val current = BiliClient.prefs.v491phaseAutoAlign491
    BiliClient.prefs.v491phaseAutoAlign491 = !current
    AppToast.show(this, "Phase Auto Align491: ${if (!current) "ON" else "OFF"}")
}

// v491: Phone Auto Answer491
internal fun PlayerActivity.showV491PhoneAutoAnswer491Toggle() {
    val current = BiliClient.prefs.v491phoneAutoAnswer491
    BiliClient.prefs.v491phoneAutoAnswer491 = !current
    AppToast.show(this, "Phone Auto Answer491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pick Auto Confirm491
internal fun PlayerActivity.showV491PickAutoConfirm491Toggle() {
    val current = BiliClient.prefs.v491pickAutoConfirm491
    BiliClient.prefs.v491pickAutoConfirm491 = !current
    AppToast.show(this, "Pick Auto Confirm491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pin To Top491
internal fun PlayerActivity.showV491PinToTop491Toggle() {
    val current = BiliClient.prefs.v491pinToTop491
    BiliClient.prefs.v491pinToTop491 = !current
    AppToast.show(this, "Pin To Top491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pipe Auto Route491
internal fun PlayerActivity.showV491PipeAutoRoute491Toggle() {
    val current = BiliClient.prefs.v491pipeAutoRoute491
    BiliClient.prefs.v491pipeAutoRoute491 = !current
    AppToast.show(this, "Pipe Auto Route491: ${if (!current) "ON" else "OFF"}")
}

// v491: Pixel Auto Correct491
internal fun PlayerActivity.showV491PixelAutoCorrect491Toggle() {
    val current = BiliClient.prefs.v491pixelAutoCorrect491
    BiliClient.prefs.v491pixelAutoCorrect491 = !current
    AppToast.show(this, "Pixel Auto Correct491: ${if (!current) "ON" else "OFF"}")
}

// v492: Pad Auto Detect492
internal fun PlayerActivity.showV492PadAutoDetect492Toggle() {
    val current = BiliClient.prefs.v492padAutoDetect492
    BiliClient.prefs.v492padAutoDetect492 = !current
    AppToast.show(this, "Pad Auto Detect492: ${if (!current) "ON" else "OFF"}")
}

// v492: Parent Control Pin492
internal fun PlayerActivity.showV492ParentControlPin492Toggle() {
    val current = BiliClient.prefs.v492parentControlPin492
    BiliClient.prefs.v492parentControlPin492 = !current
    AppToast.show(this, "Parent Control Pin492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pass Through Audio492
internal fun PlayerActivity.showV492PassThroughAudio492Toggle() {
    val current = BiliClient.prefs.v492passThroughAudio492
    BiliClient.prefs.v492passThroughAudio492 = !current
    AppToast.show(this, "Pass Through Audio492: ${if (!current) "ON" else "OFF"}")
}

// v492: Path Auto Resolve492
internal fun PlayerActivity.showV492PathAutoResolve492Toggle() {
    val current = BiliClient.prefs.v492pathAutoResolve492
    BiliClient.prefs.v492pathAutoResolve492 = !current
    AppToast.show(this, "Path Auto Resolve492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pattern Auto Match492
internal fun PlayerActivity.showV492PatternAutoMatch492Toggle() {
    val current = BiliClient.prefs.v492patternAutoMatch492
    BiliClient.prefs.v492patternAutoMatch492 = !current
    AppToast.show(this, "Pattern Auto Match492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pause On Headset492
internal fun PlayerActivity.showV492PauseOnHeadset492Toggle() {
    val current = BiliClient.prefs.v492pauseOnHeadset492
    BiliClient.prefs.v492pauseOnHeadset492 = !current
    AppToast.show(this, "Pause On Headset492: ${if (!current) "ON" else "OFF"}")
}

// v492: Peak Auto Detect492
internal fun PlayerActivity.showV492PeakAutoDetect492Toggle() {
    val current = BiliClient.prefs.v492peakAutoDetect492
    BiliClient.prefs.v492peakAutoDetect492 = !current
    AppToast.show(this, "Peak Auto Detect492: ${if (!current) "ON" else "OFF"}")
}

// v492: Period Auto Extend492
internal fun PlayerActivity.showV492PeriodAutoExtend492Toggle() {
    val current = BiliClient.prefs.v492periodAutoExtend492
    BiliClient.prefs.v492periodAutoExtend492 = !current
    AppToast.show(this, "Period Auto Extend492: ${if (!current) "ON" else "OFF"}")
}

// v492: Permission Auto Grant492
internal fun PlayerActivity.showV492PermissionAutoGrant492Toggle() {
    val current = BiliClient.prefs.v492permissionAutoGrant492
    BiliClient.prefs.v492permissionAutoGrant492 = !current
    AppToast.show(this, "Permission Auto Grant492: ${if (!current) "ON" else "OFF"}")
}

// v492: Phase Auto Align492
internal fun PlayerActivity.showV492PhaseAutoAlign492Toggle() {
    val current = BiliClient.prefs.v492phaseAutoAlign492
    BiliClient.prefs.v492phaseAutoAlign492 = !current
    AppToast.show(this, "Phase Auto Align492: ${if (!current) "ON" else "OFF"}")
}

// v492: Phone Auto Answer492
internal fun PlayerActivity.showV492PhoneAutoAnswer492Toggle() {
    val current = BiliClient.prefs.v492phoneAutoAnswer492
    BiliClient.prefs.v492phoneAutoAnswer492 = !current
    AppToast.show(this, "Phone Auto Answer492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pick Auto Confirm492
internal fun PlayerActivity.showV492PickAutoConfirm492Toggle() {
    val current = BiliClient.prefs.v492pickAutoConfirm492
    BiliClient.prefs.v492pickAutoConfirm492 = !current
    AppToast.show(this, "Pick Auto Confirm492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pin To Top492
internal fun PlayerActivity.showV492PinToTop492Toggle() {
    val current = BiliClient.prefs.v492pinToTop492
    BiliClient.prefs.v492pinToTop492 = !current
    AppToast.show(this, "Pin To Top492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pipe Auto Route492
internal fun PlayerActivity.showV492PipeAutoRoute492Toggle() {
    val current = BiliClient.prefs.v492pipeAutoRoute492
    BiliClient.prefs.v492pipeAutoRoute492 = !current
    AppToast.show(this, "Pipe Auto Route492: ${if (!current) "ON" else "OFF"}")
}

// v492: Pixel Auto Correct492
internal fun PlayerActivity.showV492PixelAutoCorrect492Toggle() {
    val current = BiliClient.prefs.v492pixelAutoCorrect492
    BiliClient.prefs.v492pixelAutoCorrect492 = !current
    AppToast.show(this, "Pixel Auto Correct492: ${if (!current) "ON" else "OFF"}")
}

// v493: Pad Auto Detect493
internal fun PlayerActivity.showV493PadAutoDetect493Toggle() {
    val current = BiliClient.prefs.v493padAutoDetect493
    BiliClient.prefs.v493padAutoDetect493 = !current
    AppToast.show(this, "Pad Auto Detect493: ${if (!current) "ON" else "OFF"}")
}

// v493: Parent Control Pin493
internal fun PlayerActivity.showV493ParentControlPin493Toggle() {
    val current = BiliClient.prefs.v493parentControlPin493
    BiliClient.prefs.v493parentControlPin493 = !current
    AppToast.show(this, "Parent Control Pin493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pass Through Audio493
internal fun PlayerActivity.showV493PassThroughAudio493Toggle() {
    val current = BiliClient.prefs.v493passThroughAudio493
    BiliClient.prefs.v493passThroughAudio493 = !current
    AppToast.show(this, "Pass Through Audio493: ${if (!current) "ON" else "OFF"}")
}

// v493: Path Auto Resolve493
internal fun PlayerActivity.showV493PathAutoResolve493Toggle() {
    val current = BiliClient.prefs.v493pathAutoResolve493
    BiliClient.prefs.v493pathAutoResolve493 = !current
    AppToast.show(this, "Path Auto Resolve493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pattern Auto Match493
internal fun PlayerActivity.showV493PatternAutoMatch493Toggle() {
    val current = BiliClient.prefs.v493patternAutoMatch493
    BiliClient.prefs.v493patternAutoMatch493 = !current
    AppToast.show(this, "Pattern Auto Match493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pause On Headset493
internal fun PlayerActivity.showV493PauseOnHeadset493Toggle() {
    val current = BiliClient.prefs.v493pauseOnHeadset493
    BiliClient.prefs.v493pauseOnHeadset493 = !current
    AppToast.show(this, "Pause On Headset493: ${if (!current) "ON" else "OFF"}")
}

// v493: Peak Auto Detect493
internal fun PlayerActivity.showV493PeakAutoDetect493Toggle() {
    val current = BiliClient.prefs.v493peakAutoDetect493
    BiliClient.prefs.v493peakAutoDetect493 = !current
    AppToast.show(this, "Peak Auto Detect493: ${if (!current) "ON" else "OFF"}")
}

// v493: Period Auto Extend493
internal fun PlayerActivity.showV493PeriodAutoExtend493Toggle() {
    val current = BiliClient.prefs.v493periodAutoExtend493
    BiliClient.prefs.v493periodAutoExtend493 = !current
    AppToast.show(this, "Period Auto Extend493: ${if (!current) "ON" else "OFF"}")
}

// v493: Permission Auto Grant493
internal fun PlayerActivity.showV493PermissionAutoGrant493Toggle() {
    val current = BiliClient.prefs.v493permissionAutoGrant493
    BiliClient.prefs.v493permissionAutoGrant493 = !current
    AppToast.show(this, "Permission Auto Grant493: ${if (!current) "ON" else "OFF"}")
}

// v493: Phase Auto Align493
internal fun PlayerActivity.showV493PhaseAutoAlign493Toggle() {
    val current = BiliClient.prefs.v493phaseAutoAlign493
    BiliClient.prefs.v493phaseAutoAlign493 = !current
    AppToast.show(this, "Phase Auto Align493: ${if (!current) "ON" else "OFF"}")
}

// v493: Phone Auto Answer493
internal fun PlayerActivity.showV493PhoneAutoAnswer493Toggle() {
    val current = BiliClient.prefs.v493phoneAutoAnswer493
    BiliClient.prefs.v493phoneAutoAnswer493 = !current
    AppToast.show(this, "Phone Auto Answer493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pick Auto Confirm493
internal fun PlayerActivity.showV493PickAutoConfirm493Toggle() {
    val current = BiliClient.prefs.v493pickAutoConfirm493
    BiliClient.prefs.v493pickAutoConfirm493 = !current
    AppToast.show(this, "Pick Auto Confirm493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pin To Top493
internal fun PlayerActivity.showV493PinToTop493Toggle() {
    val current = BiliClient.prefs.v493pinToTop493
    BiliClient.prefs.v493pinToTop493 = !current
    AppToast.show(this, "Pin To Top493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pipe Auto Route493
internal fun PlayerActivity.showV493PipeAutoRoute493Toggle() {
    val current = BiliClient.prefs.v493pipeAutoRoute493
    BiliClient.prefs.v493pipeAutoRoute493 = !current
    AppToast.show(this, "Pipe Auto Route493: ${if (!current) "ON" else "OFF"}")
}

// v493: Pixel Auto Correct493
internal fun PlayerActivity.showV493PixelAutoCorrect493Toggle() {
    val current = BiliClient.prefs.v493pixelAutoCorrect493
    BiliClient.prefs.v493pixelAutoCorrect493 = !current
    AppToast.show(this, "Pixel Auto Correct493: ${if (!current) "ON" else "OFF"}")
}

// v494: Pad Auto Detect494
internal fun PlayerActivity.showV494PadAutoDetect494Toggle() {
    val current = BiliClient.prefs.v494padAutoDetect494
    BiliClient.prefs.v494padAutoDetect494 = !current
    AppToast.show(this, "Pad Auto Detect494: ${if (!current) "ON" else "OFF"}")
}

// v494: Parent Control Pin494
internal fun PlayerActivity.showV494ParentControlPin494Toggle() {
    val current = BiliClient.prefs.v494parentControlPin494
    BiliClient.prefs.v494parentControlPin494 = !current
    AppToast.show(this, "Parent Control Pin494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pass Through Audio494
internal fun PlayerActivity.showV494PassThroughAudio494Toggle() {
    val current = BiliClient.prefs.v494passThroughAudio494
    BiliClient.prefs.v494passThroughAudio494 = !current
    AppToast.show(this, "Pass Through Audio494: ${if (!current) "ON" else "OFF"}")
}

// v494: Path Auto Resolve494
internal fun PlayerActivity.showV494PathAutoResolve494Toggle() {
    val current = BiliClient.prefs.v494pathAutoResolve494
    BiliClient.prefs.v494pathAutoResolve494 = !current
    AppToast.show(this, "Path Auto Resolve494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pattern Auto Match494
internal fun PlayerActivity.showV494PatternAutoMatch494Toggle() {
    val current = BiliClient.prefs.v494patternAutoMatch494
    BiliClient.prefs.v494patternAutoMatch494 = !current
    AppToast.show(this, "Pattern Auto Match494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pause On Headset494
internal fun PlayerActivity.showV494PauseOnHeadset494Toggle() {
    val current = BiliClient.prefs.v494pauseOnHeadset494
    BiliClient.prefs.v494pauseOnHeadset494 = !current
    AppToast.show(this, "Pause On Headset494: ${if (!current) "ON" else "OFF"}")
}

// v494: Peak Auto Detect494
internal fun PlayerActivity.showV494PeakAutoDetect494Toggle() {
    val current = BiliClient.prefs.v494peakAutoDetect494
    BiliClient.prefs.v494peakAutoDetect494 = !current
    AppToast.show(this, "Peak Auto Detect494: ${if (!current) "ON" else "OFF"}")
}

// v494: Period Auto Extend494
internal fun PlayerActivity.showV494PeriodAutoExtend494Toggle() {
    val current = BiliClient.prefs.v494periodAutoExtend494
    BiliClient.prefs.v494periodAutoExtend494 = !current
    AppToast.show(this, "Period Auto Extend494: ${if (!current) "ON" else "OFF"}")
}

// v494: Permission Auto Grant494
internal fun PlayerActivity.showV494PermissionAutoGrant494Toggle() {
    val current = BiliClient.prefs.v494permissionAutoGrant494
    BiliClient.prefs.v494permissionAutoGrant494 = !current
    AppToast.show(this, "Permission Auto Grant494: ${if (!current) "ON" else "OFF"}")
}

// v494: Phase Auto Align494
internal fun PlayerActivity.showV494PhaseAutoAlign494Toggle() {
    val current = BiliClient.prefs.v494phaseAutoAlign494
    BiliClient.prefs.v494phaseAutoAlign494 = !current
    AppToast.show(this, "Phase Auto Align494: ${if (!current) "ON" else "OFF"}")
}

// v494: Phone Auto Answer494
internal fun PlayerActivity.showV494PhoneAutoAnswer494Toggle() {
    val current = BiliClient.prefs.v494phoneAutoAnswer494
    BiliClient.prefs.v494phoneAutoAnswer494 = !current
    AppToast.show(this, "Phone Auto Answer494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pick Auto Confirm494
internal fun PlayerActivity.showV494PickAutoConfirm494Toggle() {
    val current = BiliClient.prefs.v494pickAutoConfirm494
    BiliClient.prefs.v494pickAutoConfirm494 = !current
    AppToast.show(this, "Pick Auto Confirm494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pin To Top494
internal fun PlayerActivity.showV494PinToTop494Toggle() {
    val current = BiliClient.prefs.v494pinToTop494
    BiliClient.prefs.v494pinToTop494 = !current
    AppToast.show(this, "Pin To Top494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pipe Auto Route494
internal fun PlayerActivity.showV494PipeAutoRoute494Toggle() {
    val current = BiliClient.prefs.v494pipeAutoRoute494
    BiliClient.prefs.v494pipeAutoRoute494 = !current
    AppToast.show(this, "Pipe Auto Route494: ${if (!current) "ON" else "OFF"}")
}

// v494: Pixel Auto Correct494
internal fun PlayerActivity.showV494PixelAutoCorrect494Toggle() {
    val current = BiliClient.prefs.v494pixelAutoCorrect494
    BiliClient.prefs.v494pixelAutoCorrect494 = !current
    AppToast.show(this, "Pixel Auto Correct494: ${if (!current) "ON" else "OFF"}")
}

// v495: Pad Auto Detect495
internal fun PlayerActivity.showV495PadAutoDetect495Toggle() {
    val current = BiliClient.prefs.v495padAutoDetect495
    BiliClient.prefs.v495padAutoDetect495 = !current
    AppToast.show(this, "Pad Auto Detect495: ${if (!current) "ON" else "OFF"}")
}

// v495: Parent Control Pin495
internal fun PlayerActivity.showV495ParentControlPin495Toggle() {
    val current = BiliClient.prefs.v495parentControlPin495
    BiliClient.prefs.v495parentControlPin495 = !current
    AppToast.show(this, "Parent Control Pin495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pass Through Audio495
internal fun PlayerActivity.showV495PassThroughAudio495Toggle() {
    val current = BiliClient.prefs.v495passThroughAudio495
    BiliClient.prefs.v495passThroughAudio495 = !current
    AppToast.show(this, "Pass Through Audio495: ${if (!current) "ON" else "OFF"}")
}

// v495: Path Auto Resolve495
internal fun PlayerActivity.showV495PathAutoResolve495Toggle() {
    val current = BiliClient.prefs.v495pathAutoResolve495
    BiliClient.prefs.v495pathAutoResolve495 = !current
    AppToast.show(this, "Path Auto Resolve495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pattern Auto Match495
internal fun PlayerActivity.showV495PatternAutoMatch495Toggle() {
    val current = BiliClient.prefs.v495patternAutoMatch495
    BiliClient.prefs.v495patternAutoMatch495 = !current
    AppToast.show(this, "Pattern Auto Match495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pause On Headset495
internal fun PlayerActivity.showV495PauseOnHeadset495Toggle() {
    val current = BiliClient.prefs.v495pauseOnHeadset495
    BiliClient.prefs.v495pauseOnHeadset495 = !current
    AppToast.show(this, "Pause On Headset495: ${if (!current) "ON" else "OFF"}")
}

// v495: Peak Auto Detect495
internal fun PlayerActivity.showV495PeakAutoDetect495Toggle() {
    val current = BiliClient.prefs.v495peakAutoDetect495
    BiliClient.prefs.v495peakAutoDetect495 = !current
    AppToast.show(this, "Peak Auto Detect495: ${if (!current) "ON" else "OFF"}")
}

// v495: Period Auto Extend495
internal fun PlayerActivity.showV495PeriodAutoExtend495Toggle() {
    val current = BiliClient.prefs.v495periodAutoExtend495
    BiliClient.prefs.v495periodAutoExtend495 = !current
    AppToast.show(this, "Period Auto Extend495: ${if (!current) "ON" else "OFF"}")
}

// v495: Permission Auto Grant495
internal fun PlayerActivity.showV495PermissionAutoGrant495Toggle() {
    val current = BiliClient.prefs.v495permissionAutoGrant495
    BiliClient.prefs.v495permissionAutoGrant495 = !current
    AppToast.show(this, "Permission Auto Grant495: ${if (!current) "ON" else "OFF"}")
}

// v495: Phase Auto Align495
internal fun PlayerActivity.showV495PhaseAutoAlign495Toggle() {
    val current = BiliClient.prefs.v495phaseAutoAlign495
    BiliClient.prefs.v495phaseAutoAlign495 = !current
    AppToast.show(this, "Phase Auto Align495: ${if (!current) "ON" else "OFF"}")
}

// v495: Phone Auto Answer495
internal fun PlayerActivity.showV495PhoneAutoAnswer495Toggle() {
    val current = BiliClient.prefs.v495phoneAutoAnswer495
    BiliClient.prefs.v495phoneAutoAnswer495 = !current
    AppToast.show(this, "Phone Auto Answer495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pick Auto Confirm495
internal fun PlayerActivity.showV495PickAutoConfirm495Toggle() {
    val current = BiliClient.prefs.v495pickAutoConfirm495
    BiliClient.prefs.v495pickAutoConfirm495 = !current
    AppToast.show(this, "Pick Auto Confirm495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pin To Top495
internal fun PlayerActivity.showV495PinToTop495Toggle() {
    val current = BiliClient.prefs.v495pinToTop495
    BiliClient.prefs.v495pinToTop495 = !current
    AppToast.show(this, "Pin To Top495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pipe Auto Route495
internal fun PlayerActivity.showV495PipeAutoRoute495Toggle() {
    val current = BiliClient.prefs.v495pipeAutoRoute495
    BiliClient.prefs.v495pipeAutoRoute495 = !current
    AppToast.show(this, "Pipe Auto Route495: ${if (!current) "ON" else "OFF"}")
}

// v495: Pixel Auto Correct495
internal fun PlayerActivity.showV495PixelAutoCorrect495Toggle() {
    val current = BiliClient.prefs.v495pixelAutoCorrect495
    BiliClient.prefs.v495pixelAutoCorrect495 = !current
    AppToast.show(this, "Pixel Auto Correct495: ${if (!current) "ON" else "OFF"}")
}

// v496: Pad Auto Detect496
internal fun PlayerActivity.showV496PadAutoDetect496Toggle() {
    val current = BiliClient.prefs.v496padAutoDetect496
    BiliClient.prefs.v496padAutoDetect496 = !current
    AppToast.show(this, "Pad Auto Detect496: ${if (!current) "ON" else "OFF"}")
}

// v496: Parent Control Pin496
internal fun PlayerActivity.showV496ParentControlPin496Toggle() {
    val current = BiliClient.prefs.v496parentControlPin496
    BiliClient.prefs.v496parentControlPin496 = !current
    AppToast.show(this, "Parent Control Pin496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pass Through Audio496
internal fun PlayerActivity.showV496PassThroughAudio496Toggle() {
    val current = BiliClient.prefs.v496passThroughAudio496
    BiliClient.prefs.v496passThroughAudio496 = !current
    AppToast.show(this, "Pass Through Audio496: ${if (!current) "ON" else "OFF"}")
}

// v496: Path Auto Resolve496
internal fun PlayerActivity.showV496PathAutoResolve496Toggle() {
    val current = BiliClient.prefs.v496pathAutoResolve496
    BiliClient.prefs.v496pathAutoResolve496 = !current
    AppToast.show(this, "Path Auto Resolve496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pattern Auto Match496
internal fun PlayerActivity.showV496PatternAutoMatch496Toggle() {
    val current = BiliClient.prefs.v496patternAutoMatch496
    BiliClient.prefs.v496patternAutoMatch496 = !current
    AppToast.show(this, "Pattern Auto Match496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pause On Headset496
internal fun PlayerActivity.showV496PauseOnHeadset496Toggle() {
    val current = BiliClient.prefs.v496pauseOnHeadset496
    BiliClient.prefs.v496pauseOnHeadset496 = !current
    AppToast.show(this, "Pause On Headset496: ${if (!current) "ON" else "OFF"}")
}

// v496: Peak Auto Detect496
internal fun PlayerActivity.showV496PeakAutoDetect496Toggle() {
    val current = BiliClient.prefs.v496peakAutoDetect496
    BiliClient.prefs.v496peakAutoDetect496 = !current
    AppToast.show(this, "Peak Auto Detect496: ${if (!current) "ON" else "OFF"}")
}

// v496: Period Auto Extend496
internal fun PlayerActivity.showV496PeriodAutoExtend496Toggle() {
    val current = BiliClient.prefs.v496periodAutoExtend496
    BiliClient.prefs.v496periodAutoExtend496 = !current
    AppToast.show(this, "Period Auto Extend496: ${if (!current) "ON" else "OFF"}")
}

// v496: Permission Auto Grant496
internal fun PlayerActivity.showV496PermissionAutoGrant496Toggle() {
    val current = BiliClient.prefs.v496permissionAutoGrant496
    BiliClient.prefs.v496permissionAutoGrant496 = !current
    AppToast.show(this, "Permission Auto Grant496: ${if (!current) "ON" else "OFF"}")
}

// v496: Phase Auto Align496
internal fun PlayerActivity.showV496PhaseAutoAlign496Toggle() {
    val current = BiliClient.prefs.v496phaseAutoAlign496
    BiliClient.prefs.v496phaseAutoAlign496 = !current
    AppToast.show(this, "Phase Auto Align496: ${if (!current) "ON" else "OFF"}")
}

// v496: Phone Auto Answer496
internal fun PlayerActivity.showV496PhoneAutoAnswer496Toggle() {
    val current = BiliClient.prefs.v496phoneAutoAnswer496
    BiliClient.prefs.v496phoneAutoAnswer496 = !current
    AppToast.show(this, "Phone Auto Answer496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pick Auto Confirm496
internal fun PlayerActivity.showV496PickAutoConfirm496Toggle() {
    val current = BiliClient.prefs.v496pickAutoConfirm496
    BiliClient.prefs.v496pickAutoConfirm496 = !current
    AppToast.show(this, "Pick Auto Confirm496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pin To Top496
internal fun PlayerActivity.showV496PinToTop496Toggle() {
    val current = BiliClient.prefs.v496pinToTop496
    BiliClient.prefs.v496pinToTop496 = !current
    AppToast.show(this, "Pin To Top496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pipe Auto Route496
internal fun PlayerActivity.showV496PipeAutoRoute496Toggle() {
    val current = BiliClient.prefs.v496pipeAutoRoute496
    BiliClient.prefs.v496pipeAutoRoute496 = !current
    AppToast.show(this, "Pipe Auto Route496: ${if (!current) "ON" else "OFF"}")
}

// v496: Pixel Auto Correct496
internal fun PlayerActivity.showV496PixelAutoCorrect496Toggle() {
    val current = BiliClient.prefs.v496pixelAutoCorrect496
    BiliClient.prefs.v496pixelAutoCorrect496 = !current
    AppToast.show(this, "Pixel Auto Correct496: ${if (!current) "ON" else "OFF"}")
}

// v497: Pad Auto Detect497
internal fun PlayerActivity.showV497PadAutoDetect497Toggle() {
    val current = BiliClient.prefs.v497padAutoDetect497
    BiliClient.prefs.v497padAutoDetect497 = !current
    AppToast.show(this, "Pad Auto Detect497: ${if (!current) "ON" else "OFF"}")
}

// v497: Parent Control Pin497
internal fun PlayerActivity.showV497ParentControlPin497Toggle() {
    val current = BiliClient.prefs.v497parentControlPin497
    BiliClient.prefs.v497parentControlPin497 = !current
    AppToast.show(this, "Parent Control Pin497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pass Through Audio497
internal fun PlayerActivity.showV497PassThroughAudio497Toggle() {
    val current = BiliClient.prefs.v497passThroughAudio497
    BiliClient.prefs.v497passThroughAudio497 = !current
    AppToast.show(this, "Pass Through Audio497: ${if (!current) "ON" else "OFF"}")
}

// v497: Path Auto Resolve497
internal fun PlayerActivity.showV497PathAutoResolve497Toggle() {
    val current = BiliClient.prefs.v497pathAutoResolve497
    BiliClient.prefs.v497pathAutoResolve497 = !current
    AppToast.show(this, "Path Auto Resolve497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pattern Auto Match497
internal fun PlayerActivity.showV497PatternAutoMatch497Toggle() {
    val current = BiliClient.prefs.v497patternAutoMatch497
    BiliClient.prefs.v497patternAutoMatch497 = !current
    AppToast.show(this, "Pattern Auto Match497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pause On Headset497
internal fun PlayerActivity.showV497PauseOnHeadset497Toggle() {
    val current = BiliClient.prefs.v497pauseOnHeadset497
    BiliClient.prefs.v497pauseOnHeadset497 = !current
    AppToast.show(this, "Pause On Headset497: ${if (!current) "ON" else "OFF"}")
}

// v497: Peak Auto Detect497
internal fun PlayerActivity.showV497PeakAutoDetect497Toggle() {
    val current = BiliClient.prefs.v497peakAutoDetect497
    BiliClient.prefs.v497peakAutoDetect497 = !current
    AppToast.show(this, "Peak Auto Detect497: ${if (!current) "ON" else "OFF"}")
}

// v497: Period Auto Extend497
internal fun PlayerActivity.showV497PeriodAutoExtend497Toggle() {
    val current = BiliClient.prefs.v497periodAutoExtend497
    BiliClient.prefs.v497periodAutoExtend497 = !current
    AppToast.show(this, "Period Auto Extend497: ${if (!current) "ON" else "OFF"}")
}

// v497: Permission Auto Grant497
internal fun PlayerActivity.showV497PermissionAutoGrant497Toggle() {
    val current = BiliClient.prefs.v497permissionAutoGrant497
    BiliClient.prefs.v497permissionAutoGrant497 = !current
    AppToast.show(this, "Permission Auto Grant497: ${if (!current) "ON" else "OFF"}")
}

// v497: Phase Auto Align497
internal fun PlayerActivity.showV497PhaseAutoAlign497Toggle() {
    val current = BiliClient.prefs.v497phaseAutoAlign497
    BiliClient.prefs.v497phaseAutoAlign497 = !current
    AppToast.show(this, "Phase Auto Align497: ${if (!current) "ON" else "OFF"}")
}

// v497: Phone Auto Answer497
internal fun PlayerActivity.showV497PhoneAutoAnswer497Toggle() {
    val current = BiliClient.prefs.v497phoneAutoAnswer497
    BiliClient.prefs.v497phoneAutoAnswer497 = !current
    AppToast.show(this, "Phone Auto Answer497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pick Auto Confirm497
internal fun PlayerActivity.showV497PickAutoConfirm497Toggle() {
    val current = BiliClient.prefs.v497pickAutoConfirm497
    BiliClient.prefs.v497pickAutoConfirm497 = !current
    AppToast.show(this, "Pick Auto Confirm497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pin To Top497
internal fun PlayerActivity.showV497PinToTop497Toggle() {
    val current = BiliClient.prefs.v497pinToTop497
    BiliClient.prefs.v497pinToTop497 = !current
    AppToast.show(this, "Pin To Top497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pipe Auto Route497
internal fun PlayerActivity.showV497PipeAutoRoute497Toggle() {
    val current = BiliClient.prefs.v497pipeAutoRoute497
    BiliClient.prefs.v497pipeAutoRoute497 = !current
    AppToast.show(this, "Pipe Auto Route497: ${if (!current) "ON" else "OFF"}")
}

// v497: Pixel Auto Correct497
internal fun PlayerActivity.showV497PixelAutoCorrect497Toggle() {
    val current = BiliClient.prefs.v497pixelAutoCorrect497
    BiliClient.prefs.v497pixelAutoCorrect497 = !current
    AppToast.show(this, "Pixel Auto Correct497: ${if (!current) "ON" else "OFF"}")
}

// v498: Pad Auto Detect498
internal fun PlayerActivity.showV498PadAutoDetect498Toggle() {
    val current = BiliClient.prefs.v498padAutoDetect498
    BiliClient.prefs.v498padAutoDetect498 = !current
    AppToast.show(this, "Pad Auto Detect498: ${if (!current) "ON" else "OFF"}")
}

// v498: Parent Control Pin498
internal fun PlayerActivity.showV498ParentControlPin498Toggle() {
    val current = BiliClient.prefs.v498parentControlPin498
    BiliClient.prefs.v498parentControlPin498 = !current
    AppToast.show(this, "Parent Control Pin498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pass Through Audio498
internal fun PlayerActivity.showV498PassThroughAudio498Toggle() {
    val current = BiliClient.prefs.v498passThroughAudio498
    BiliClient.prefs.v498passThroughAudio498 = !current
    AppToast.show(this, "Pass Through Audio498: ${if (!current) "ON" else "OFF"}")
}

// v498: Path Auto Resolve498
internal fun PlayerActivity.showV498PathAutoResolve498Toggle() {
    val current = BiliClient.prefs.v498pathAutoResolve498
    BiliClient.prefs.v498pathAutoResolve498 = !current
    AppToast.show(this, "Path Auto Resolve498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pattern Auto Match498
internal fun PlayerActivity.showV498PatternAutoMatch498Toggle() {
    val current = BiliClient.prefs.v498patternAutoMatch498
    BiliClient.prefs.v498patternAutoMatch498 = !current
    AppToast.show(this, "Pattern Auto Match498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pause On Headset498
internal fun PlayerActivity.showV498PauseOnHeadset498Toggle() {
    val current = BiliClient.prefs.v498pauseOnHeadset498
    BiliClient.prefs.v498pauseOnHeadset498 = !current
    AppToast.show(this, "Pause On Headset498: ${if (!current) "ON" else "OFF"}")
}

// v498: Peak Auto Detect498
internal fun PlayerActivity.showV498PeakAutoDetect498Toggle() {
    val current = BiliClient.prefs.v498peakAutoDetect498
    BiliClient.prefs.v498peakAutoDetect498 = !current
    AppToast.show(this, "Peak Auto Detect498: ${if (!current) "ON" else "OFF"}")
}

// v498: Period Auto Extend498
internal fun PlayerActivity.showV498PeriodAutoExtend498Toggle() {
    val current = BiliClient.prefs.v498periodAutoExtend498
    BiliClient.prefs.v498periodAutoExtend498 = !current
    AppToast.show(this, "Period Auto Extend498: ${if (!current) "ON" else "OFF"}")
}

// v498: Permission Auto Grant498
internal fun PlayerActivity.showV498PermissionAutoGrant498Toggle() {
    val current = BiliClient.prefs.v498permissionAutoGrant498
    BiliClient.prefs.v498permissionAutoGrant498 = !current
    AppToast.show(this, "Permission Auto Grant498: ${if (!current) "ON" else "OFF"}")
}

// v498: Phase Auto Align498
internal fun PlayerActivity.showV498PhaseAutoAlign498Toggle() {
    val current = BiliClient.prefs.v498phaseAutoAlign498
    BiliClient.prefs.v498phaseAutoAlign498 = !current
    AppToast.show(this, "Phase Auto Align498: ${if (!current) "ON" else "OFF"}")
}

// v498: Phone Auto Answer498
internal fun PlayerActivity.showV498PhoneAutoAnswer498Toggle() {
    val current = BiliClient.prefs.v498phoneAutoAnswer498
    BiliClient.prefs.v498phoneAutoAnswer498 = !current
    AppToast.show(this, "Phone Auto Answer498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pick Auto Confirm498
internal fun PlayerActivity.showV498PickAutoConfirm498Toggle() {
    val current = BiliClient.prefs.v498pickAutoConfirm498
    BiliClient.prefs.v498pickAutoConfirm498 = !current
    AppToast.show(this, "Pick Auto Confirm498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pin To Top498
internal fun PlayerActivity.showV498PinToTop498Toggle() {
    val current = BiliClient.prefs.v498pinToTop498
    BiliClient.prefs.v498pinToTop498 = !current
    AppToast.show(this, "Pin To Top498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pipe Auto Route498
internal fun PlayerActivity.showV498PipeAutoRoute498Toggle() {
    val current = BiliClient.prefs.v498pipeAutoRoute498
    BiliClient.prefs.v498pipeAutoRoute498 = !current
    AppToast.show(this, "Pipe Auto Route498: ${if (!current) "ON" else "OFF"}")
}

// v498: Pixel Auto Correct498
internal fun PlayerActivity.showV498PixelAutoCorrect498Toggle() {
    val current = BiliClient.prefs.v498pixelAutoCorrect498
    BiliClient.prefs.v498pixelAutoCorrect498 = !current
    AppToast.show(this, "Pixel Auto Correct498: ${if (!current) "ON" else "OFF"}")
}

// v499: Pad Auto Detect499
internal fun PlayerActivity.showV499PadAutoDetect499Toggle() {
    val current = BiliClient.prefs.v499padAutoDetect499
    BiliClient.prefs.v499padAutoDetect499 = !current
    AppToast.show(this, "Pad Auto Detect499: ${if (!current) "ON" else "OFF"}")
}

// v499: Parent Control Pin499
internal fun PlayerActivity.showV499ParentControlPin499Toggle() {
    val current = BiliClient.prefs.v499parentControlPin499
    BiliClient.prefs.v499parentControlPin499 = !current
    AppToast.show(this, "Parent Control Pin499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pass Through Audio499
internal fun PlayerActivity.showV499PassThroughAudio499Toggle() {
    val current = BiliClient.prefs.v499passThroughAudio499
    BiliClient.prefs.v499passThroughAudio499 = !current
    AppToast.show(this, "Pass Through Audio499: ${if (!current) "ON" else "OFF"}")
}

// v499: Path Auto Resolve499
internal fun PlayerActivity.showV499PathAutoResolve499Toggle() {
    val current = BiliClient.prefs.v499pathAutoResolve499
    BiliClient.prefs.v499pathAutoResolve499 = !current
    AppToast.show(this, "Path Auto Resolve499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pattern Auto Match499
internal fun PlayerActivity.showV499PatternAutoMatch499Toggle() {
    val current = BiliClient.prefs.v499patternAutoMatch499
    BiliClient.prefs.v499patternAutoMatch499 = !current
    AppToast.show(this, "Pattern Auto Match499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pause On Headset499
internal fun PlayerActivity.showV499PauseOnHeadset499Toggle() {
    val current = BiliClient.prefs.v499pauseOnHeadset499
    BiliClient.prefs.v499pauseOnHeadset499 = !current
    AppToast.show(this, "Pause On Headset499: ${if (!current) "ON" else "OFF"}")
}

// v499: Peak Auto Detect499
internal fun PlayerActivity.showV499PeakAutoDetect499Toggle() {
    val current = BiliClient.prefs.v499peakAutoDetect499
    BiliClient.prefs.v499peakAutoDetect499 = !current
    AppToast.show(this, "Peak Auto Detect499: ${if (!current) "ON" else "OFF"}")
}

// v499: Period Auto Extend499
internal fun PlayerActivity.showV499PeriodAutoExtend499Toggle() {
    val current = BiliClient.prefs.v499periodAutoExtend499
    BiliClient.prefs.v499periodAutoExtend499 = !current
    AppToast.show(this, "Period Auto Extend499: ${if (!current) "ON" else "OFF"}")
}

// v499: Permission Auto Grant499
internal fun PlayerActivity.showV499PermissionAutoGrant499Toggle() {
    val current = BiliClient.prefs.v499permissionAutoGrant499
    BiliClient.prefs.v499permissionAutoGrant499 = !current
    AppToast.show(this, "Permission Auto Grant499: ${if (!current) "ON" else "OFF"}")
}

// v499: Phase Auto Align499
internal fun PlayerActivity.showV499PhaseAutoAlign499Toggle() {
    val current = BiliClient.prefs.v499phaseAutoAlign499
    BiliClient.prefs.v499phaseAutoAlign499 = !current
    AppToast.show(this, "Phase Auto Align499: ${if (!current) "ON" else "OFF"}")
}

// v499: Phone Auto Answer499
internal fun PlayerActivity.showV499PhoneAutoAnswer499Toggle() {
    val current = BiliClient.prefs.v499phoneAutoAnswer499
    BiliClient.prefs.v499phoneAutoAnswer499 = !current
    AppToast.show(this, "Phone Auto Answer499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pick Auto Confirm499
internal fun PlayerActivity.showV499PickAutoConfirm499Toggle() {
    val current = BiliClient.prefs.v499pickAutoConfirm499
    BiliClient.prefs.v499pickAutoConfirm499 = !current
    AppToast.show(this, "Pick Auto Confirm499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pin To Top499
internal fun PlayerActivity.showV499PinToTop499Toggle() {
    val current = BiliClient.prefs.v499pinToTop499
    BiliClient.prefs.v499pinToTop499 = !current
    AppToast.show(this, "Pin To Top499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pipe Auto Route499
internal fun PlayerActivity.showV499PipeAutoRoute499Toggle() {
    val current = BiliClient.prefs.v499pipeAutoRoute499
    BiliClient.prefs.v499pipeAutoRoute499 = !current
    AppToast.show(this, "Pipe Auto Route499: ${if (!current) "ON" else "OFF"}")
}

// v499: Pixel Auto Correct499
internal fun PlayerActivity.showV499PixelAutoCorrect499Toggle() {
    val current = BiliClient.prefs.v499pixelAutoCorrect499
    BiliClient.prefs.v499pixelAutoCorrect499 = !current
    AppToast.show(this, "Pixel Auto Correct499: ${if (!current) "ON" else "OFF"}")
}

// v500: Pad Auto Detect500
internal fun PlayerActivity.showV500PadAutoDetect500Toggle() {
    val current = BiliClient.prefs.v500padAutoDetect500
    BiliClient.prefs.v500padAutoDetect500 = !current
    AppToast.show(this, "Pad Auto Detect500: ${if (!current) "ON" else "OFF"}")
}

// v500: Parent Control Pin500
internal fun PlayerActivity.showV500ParentControlPin500Toggle() {
    val current = BiliClient.prefs.v500parentControlPin500
    BiliClient.prefs.v500parentControlPin500 = !current
    AppToast.show(this, "Parent Control Pin500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pass Through Audio500
internal fun PlayerActivity.showV500PassThroughAudio500Toggle() {
    val current = BiliClient.prefs.v500passThroughAudio500
    BiliClient.prefs.v500passThroughAudio500 = !current
    AppToast.show(this, "Pass Through Audio500: ${if (!current) "ON" else "OFF"}")
}

// v500: Path Auto Resolve500
internal fun PlayerActivity.showV500PathAutoResolve500Toggle() {
    val current = BiliClient.prefs.v500pathAutoResolve500
    BiliClient.prefs.v500pathAutoResolve500 = !current
    AppToast.show(this, "Path Auto Resolve500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pattern Auto Match500
internal fun PlayerActivity.showV500PatternAutoMatch500Toggle() {
    val current = BiliClient.prefs.v500patternAutoMatch500
    BiliClient.prefs.v500patternAutoMatch500 = !current
    AppToast.show(this, "Pattern Auto Match500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pause On Headset500
internal fun PlayerActivity.showV500PauseOnHeadset500Toggle() {
    val current = BiliClient.prefs.v500pauseOnHeadset500
    BiliClient.prefs.v500pauseOnHeadset500 = !current
    AppToast.show(this, "Pause On Headset500: ${if (!current) "ON" else "OFF"}")
}

// v500: Peak Auto Detect500
internal fun PlayerActivity.showV500PeakAutoDetect500Toggle() {
    val current = BiliClient.prefs.v500peakAutoDetect500
    BiliClient.prefs.v500peakAutoDetect500 = !current
    AppToast.show(this, "Peak Auto Detect500: ${if (!current) "ON" else "OFF"}")
}

// v500: Period Auto Extend500
internal fun PlayerActivity.showV500PeriodAutoExtend500Toggle() {
    val current = BiliClient.prefs.v500periodAutoExtend500
    BiliClient.prefs.v500periodAutoExtend500 = !current
    AppToast.show(this, "Period Auto Extend500: ${if (!current) "ON" else "OFF"}")
}

// v500: Permission Auto Grant500
internal fun PlayerActivity.showV500PermissionAutoGrant500Toggle() {
    val current = BiliClient.prefs.v500permissionAutoGrant500
    BiliClient.prefs.v500permissionAutoGrant500 = !current
    AppToast.show(this, "Permission Auto Grant500: ${if (!current) "ON" else "OFF"}")
}

// v500: Phase Auto Align500
internal fun PlayerActivity.showV500PhaseAutoAlign500Toggle() {
    val current = BiliClient.prefs.v500phaseAutoAlign500
    BiliClient.prefs.v500phaseAutoAlign500 = !current
    AppToast.show(this, "Phase Auto Align500: ${if (!current) "ON" else "OFF"}")
}

// v500: Phone Auto Answer500
internal fun PlayerActivity.showV500PhoneAutoAnswer500Toggle() {
    val current = BiliClient.prefs.v500phoneAutoAnswer500
    BiliClient.prefs.v500phoneAutoAnswer500 = !current
    AppToast.show(this, "Phone Auto Answer500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pick Auto Confirm500
internal fun PlayerActivity.showV500PickAutoConfirm500Toggle() {
    val current = BiliClient.prefs.v500pickAutoConfirm500
    BiliClient.prefs.v500pickAutoConfirm500 = !current
    AppToast.show(this, "Pick Auto Confirm500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pin To Top500
internal fun PlayerActivity.showV500PinToTop500Toggle() {
    val current = BiliClient.prefs.v500pinToTop500
    BiliClient.prefs.v500pinToTop500 = !current
    AppToast.show(this, "Pin To Top500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pipe Auto Route500
internal fun PlayerActivity.showV500PipeAutoRoute500Toggle() {
    val current = BiliClient.prefs.v500pipeAutoRoute500
    BiliClient.prefs.v500pipeAutoRoute500 = !current
    AppToast.show(this, "Pipe Auto Route500: ${if (!current) "ON" else "OFF"}")
}

// v500: Pixel Auto Correct500
internal fun PlayerActivity.showV500PixelAutoCorrect500Toggle() {
    val current = BiliClient.prefs.v500pixelAutoCorrect500
    BiliClient.prefs.v500pixelAutoCorrect500 = !current
    AppToast.show(this, "Pixel Auto Correct500: ${if (!current) "ON" else "OFF"}")
}

// v501: Place Auto Detect501
internal fun PlayerActivity.showV501PlaceAutoDetect501Toggle() {
    val current = BiliClient.prefs.v501placeAutoDetect501
    BiliClient.prefs.v501placeAutoDetect501 = !current
    AppToast.show(this, "Place Auto Detect501: ${if (!current) "ON" else "OFF"}")
}

// v501: Platform Auto Adapt501
internal fun PlayerActivity.showV501PlatformAutoAdapt501Toggle() {
    val current = BiliClient.prefs.v501platformAutoAdapt501
    BiliClient.prefs.v501platformAutoAdapt501 = !current
    AppToast.show(this, "Platform Auto Adapt501: ${if (!current) "ON" else "OFF"}")
}

// v501: Play Auto Resume501
internal fun PlayerActivity.showV501PlayAutoResume501Toggle() {
    val current = BiliClient.prefs.v501playAutoResume501
    BiliClient.prefs.v501playAutoResume501 = !current
    AppToast.show(this, "Play Auto Resume501: ${if (!current) "ON" else "OFF"}")
}

// v501: Plugin Auto Update501
internal fun PlayerActivity.showV501PluginAutoUpdate501Toggle() {
    val current = BiliClient.prefs.v501pluginAutoUpdate501
    BiliClient.prefs.v501pluginAutoUpdate501 = !current
    AppToast.show(this, "Plugin Auto Update501: ${if (!current) "ON" else "OFF"}")
}

// v501: Pop Up Auto Dismiss501
internal fun PlayerActivity.showV501PopUpAutoDismiss501Toggle() {
    val current = BiliClient.prefs.v501popUpAutoDismiss501
    BiliClient.prefs.v501popUpAutoDismiss501 = !current
    AppToast.show(this, "Pop Up Auto Dismiss501: ${if (!current) "ON" else "OFF"}")
}

// v501: Port Auto Scan501
internal fun PlayerActivity.showV501PortAutoScan501Toggle() {
    val current = BiliClient.prefs.v501portAutoScan501
    BiliClient.prefs.v501portAutoScan501 = !current
    AppToast.show(this, "Port Auto Scan501: ${if (!current) "ON" else "OFF"}")
}

// v501: Post Auto Share501
internal fun PlayerActivity.showV501PostAutoShare501Toggle() {
    val current = BiliClient.prefs.v501postAutoShare501
    BiliClient.prefs.v501postAutoShare501 = !current
    AppToast.show(this, "Post Auto Share501: ${if (!current) "ON" else "OFF"}")
}

// v501: Power Save Mode501
internal fun PlayerActivity.showV501PowerSaveMode501Toggle() {
    val current = BiliClient.prefs.v501powerSaveMode501
    BiliClient.prefs.v501powerSaveMode501 = !current
    AppToast.show(this, "Power Save Mode501: ${if (!current) "ON" else "OFF"}")
}

// v501: Pre Buffer Enabled501
internal fun PlayerActivity.showV501PreBufferEnabled501Toggle() {
    val current = BiliClient.prefs.v501preBufferEnabled501
    BiliClient.prefs.v501preBufferEnabled501 = !current
    AppToast.show(this, "Pre Buffer Enabled501: ${if (!current) "ON" else "OFF"}")
}

// v501: Prefix Auto Trim501
internal fun PlayerActivity.showV501PrefixAutoTrim501Toggle() {
    val current = BiliClient.prefs.v501prefixAutoTrim501
    BiliClient.prefs.v501prefixAutoTrim501 = !current
    AppToast.show(this, "Prefix Auto Trim501: ${if (!current) "ON" else "OFF"}")
}

// v501: Press And Hold Action501
internal fun PlayerActivity.showV501PressAndHoldAction501Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v501pressAndHoldAction501).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action501",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v501pressAndHoldAction501 = value
        AppToast.show(this, "Press And Hold Action501: $value")
    }
}

// v501: Primary Audio Track501
internal fun PlayerActivity.showV501PrimaryAudioTrack501Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v501primaryAudioTrack501).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track501",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v501primaryAudioTrack501 = value
        AppToast.show(this, "Primary Audio Track501: $value")
    }
}

// v501: Print Auto Format501
internal fun PlayerActivity.showV501PrintAutoFormat501Toggle() {
    val current = BiliClient.prefs.v501printAutoFormat501
    BiliClient.prefs.v501printAutoFormat501 = !current
    AppToast.show(this, "Print Auto Format501: ${if (!current) "ON" else "OFF"}")
}

// v501: Priority Queue Enabled501
internal fun PlayerActivity.showV501PriorityQueueEnabled501Toggle() {
    val current = BiliClient.prefs.v501priorityQueueEnabled501
    BiliClient.prefs.v501priorityQueueEnabled501 = !current
    AppToast.show(this, "Priority Queue Enabled501: ${if (!current) "ON" else "OFF"}")
}

// v501: Private Mode Auto501
internal fun PlayerActivity.showV501PrivateModeAuto501Toggle() {
    val current = BiliClient.prefs.v501privateModeAuto501
    BiliClient.prefs.v501privateModeAuto501 = !current
    AppToast.show(this, "Private Mode Auto501: ${if (!current) "ON" else "OFF"}")
}

// v502: Place Auto Detect502
internal fun PlayerActivity.showV502PlaceAutoDetect502Toggle() {
    val current = BiliClient.prefs.v502placeAutoDetect502
    BiliClient.prefs.v502placeAutoDetect502 = !current
    AppToast.show(this, "Place Auto Detect502: ${if (!current) "ON" else "OFF"}")
}

// v502: Platform Auto Adapt502
internal fun PlayerActivity.showV502PlatformAutoAdapt502Toggle() {
    val current = BiliClient.prefs.v502platformAutoAdapt502
    BiliClient.prefs.v502platformAutoAdapt502 = !current
    AppToast.show(this, "Platform Auto Adapt502: ${if (!current) "ON" else "OFF"}")
}

// v502: Play Auto Resume502
internal fun PlayerActivity.showV502PlayAutoResume502Toggle() {
    val current = BiliClient.prefs.v502playAutoResume502
    BiliClient.prefs.v502playAutoResume502 = !current
    AppToast.show(this, "Play Auto Resume502: ${if (!current) "ON" else "OFF"}")
}

// v502: Plugin Auto Update502
internal fun PlayerActivity.showV502PluginAutoUpdate502Toggle() {
    val current = BiliClient.prefs.v502pluginAutoUpdate502
    BiliClient.prefs.v502pluginAutoUpdate502 = !current
    AppToast.show(this, "Plugin Auto Update502: ${if (!current) "ON" else "OFF"}")
}

// v502: Pop Up Auto Dismiss502
internal fun PlayerActivity.showV502PopUpAutoDismiss502Toggle() {
    val current = BiliClient.prefs.v502popUpAutoDismiss502
    BiliClient.prefs.v502popUpAutoDismiss502 = !current
    AppToast.show(this, "Pop Up Auto Dismiss502: ${if (!current) "ON" else "OFF"}")
}

// v502: Port Auto Scan502
internal fun PlayerActivity.showV502PortAutoScan502Toggle() {
    val current = BiliClient.prefs.v502portAutoScan502
    BiliClient.prefs.v502portAutoScan502 = !current
    AppToast.show(this, "Port Auto Scan502: ${if (!current) "ON" else "OFF"}")
}

// v502: Post Auto Share502
internal fun PlayerActivity.showV502PostAutoShare502Toggle() {
    val current = BiliClient.prefs.v502postAutoShare502
    BiliClient.prefs.v502postAutoShare502 = !current
    AppToast.show(this, "Post Auto Share502: ${if (!current) "ON" else "OFF"}")
}

// v502: Power Save Mode502
internal fun PlayerActivity.showV502PowerSaveMode502Toggle() {
    val current = BiliClient.prefs.v502powerSaveMode502
    BiliClient.prefs.v502powerSaveMode502 = !current
    AppToast.show(this, "Power Save Mode502: ${if (!current) "ON" else "OFF"}")
}

// v502: Pre Buffer Enabled502
internal fun PlayerActivity.showV502PreBufferEnabled502Toggle() {
    val current = BiliClient.prefs.v502preBufferEnabled502
    BiliClient.prefs.v502preBufferEnabled502 = !current
    AppToast.show(this, "Pre Buffer Enabled502: ${if (!current) "ON" else "OFF"}")
}

// v502: Prefix Auto Trim502
internal fun PlayerActivity.showV502PrefixAutoTrim502Toggle() {
    val current = BiliClient.prefs.v502prefixAutoTrim502
    BiliClient.prefs.v502prefixAutoTrim502 = !current
    AppToast.show(this, "Prefix Auto Trim502: ${if (!current) "ON" else "OFF"}")
}

// v502: Press And Hold Action502
internal fun PlayerActivity.showV502PressAndHoldAction502Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v502pressAndHoldAction502).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Press And Hold Action502",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v502pressAndHoldAction502 = value
        AppToast.show(this, "Press And Hold Action502: $value")
    }
}

// v502: Primary Audio Track502
internal fun PlayerActivity.showV502PrimaryAudioTrack502Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v502primaryAudioTrack502).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Primary Audio Track502",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v502primaryAudioTrack502 = value
        AppToast.show(this, "Primary Audio Track502: $value")
    }
}

// v502: Print Auto Format502
internal fun PlayerActivity.showV502PrintAutoFormat502Toggle() {
    val current = BiliClient.prefs.v502printAutoFormat502
    BiliClient.prefs.v502printAutoFormat502 = !current
    AppToast.show(this, "Print Auto Format502: ${if (!current) "ON" else "OFF"}")
}

// v502: Priority Queue Enabled502
internal fun PlayerActivity.showV502PriorityQueueEnabled502Toggle() {
    val current = BiliClient.prefs.v502priorityQueueEnabled502
    BiliClient.prefs.v502priorityQueueEnabled502 = !current
    AppToast.show(this, "Priority Queue Enabled502: ${if (!current) "ON" else "OFF"}")
}

// v502: Private Mode Auto502
internal fun PlayerActivity.showV502PrivateModeAuto502Toggle() {
    val current = BiliClient.prefs.v502privateModeAuto502
    BiliClient.prefs.v502privateModeAuto502 = !current
    AppToast.show(this, "Private Mode Auto502: ${if (!current) "ON" else "OFF"}")
}

// v503: Place Auto Detect503
internal fun PlayerActivity.showV503PlaceAutoDetect503Toggle() {
    val current = BiliClient.prefs.v503placeAutoDetect503
    BiliClient.prefs.v503placeAutoDetect503 = !current
    AppToast.show(this, "Place Auto Detect503: ${if (!current) "ON" else "OFF"}")
}

// v503: Platform Auto Adapt503
internal fun PlayerActivity.showV503PlatformAutoAdapt503Toggle() {
    val current = BiliClient.prefs.v503platformAutoAdapt503
    BiliClient.prefs.v503platformAutoAdapt503 = !current
    AppToast.show(this, "Platform Auto Adapt503: ${if (!current) "ON" else "OFF"}")
}

// v503: Play Auto Resume503
internal fun PlayerActivity.showV503PlayAutoResume503Toggle() {
    val current = BiliClient.prefs.v503playAutoResume503
    BiliClient.prefs.v503playAutoResume503 = !current
    AppToast.show(this, "Play Auto Resume503: ${if (!current) "ON" else "OFF"}")
}
