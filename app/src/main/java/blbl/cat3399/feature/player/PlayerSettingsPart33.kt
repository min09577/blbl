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

