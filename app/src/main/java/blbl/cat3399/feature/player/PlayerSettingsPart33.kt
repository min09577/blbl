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

internal fun PlayerActivity.showV455IdleScreenSaver455Toggle() {
    val current = BiliClient.prefs.v455idleScreenSaver455
    BiliClient.prefs.v455idleScreenSaver455 = !current
    AppToast.show(this, "Idle Screen Saver455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455ImportAutoMerge455Toggle() {
    val current = BiliClient.prefs.v455importAutoMerge455
    BiliClient.prefs.v455importAutoMerge455 = !current
    AppToast.show(this, "Import Auto Merge455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455IndexAutoRebuild455Toggle() {
    val current = BiliClient.prefs.v455indexAutoRebuild455
    BiliClient.prefs.v455indexAutoRebuild455 = !current
    AppToast.show(this, "Index Auto Rebuild455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455InfoPanelAutoShow455Toggle() {
    val current = BiliClient.prefs.v455infoPanelAutoShow455
    BiliClient.prefs.v455infoPanelAutoShow455 = !current
    AppToast.show(this, "Info Panel Auto Show455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455InlineSubtitle455Toggle() {
    val current = BiliClient.prefs.v455inlineSubtitle455
    BiliClient.prefs.v455inlineSubtitle455 = !current
    AppToast.show(this, "Inline Subtitle455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455InnerLoopEnabled455Toggle() {
    val current = BiliClient.prefs.v455innerLoopEnabled455
    BiliClient.prefs.v455innerLoopEnabled455 = !current
    AppToast.show(this, "Inner Loop Enabled455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455InputAutoFocus455Toggle() {
    val current = BiliClient.prefs.v455inputAutoFocus455
    BiliClient.prefs.v455inputAutoFocus455 = !current
    AppToast.show(this, "Input Auto Focus455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455InsertAdSkip455Toggle() {
    val current = BiliClient.prefs.v455insertAdSkip455
    BiliClient.prefs.v455insertAdSkip455 = !current
    AppToast.show(this, "Insert Ad Skip455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455InstanceAutoSwitch455Toggle() {
    val current = BiliClient.prefs.v455instanceAutoSwitch455
    BiliClient.prefs.v455instanceAutoSwitch455 = !current
    AppToast.show(this, "Instance Auto Switch455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455InternalLinkOpen455Toggle() {
    val current = BiliClient.prefs.v455internalLinkOpen455
    BiliClient.prefs.v455internalLinkOpen455 = !current
    AppToast.show(this, "Internal Link Open455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455ItemAutoHighlight455Toggle() {
    val current = BiliClient.prefs.v455itemAutoHighlight455
    BiliClient.prefs.v455itemAutoHighlight455 = !current
    AppToast.show(this, "Item Auto Highlight455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455JoinRoomAuto455Toggle() {
    val current = BiliClient.prefs.v455joinRoomAuto455
    BiliClient.prefs.v455joinRoomAuto455 = !current
    AppToast.show(this, "Join Room Auto455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455JumpToTimestamp455Toggle() {
    val current = BiliClient.prefs.v455jumpToTimestamp455
    BiliClient.prefs.v455jumpToTimestamp455 = !current
    AppToast.show(this, "Jump To Timestamp455: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456HybridModeEnabled456Toggle() {
    val current = BiliClient.prefs.v456hybridModeEnabled456
    BiliClient.prefs.v456hybridModeEnabled456 = !current
    AppToast.show(this, "Hybrid Mode Enabled456: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV456IdleScreenSaver456Toggle() {
    val current = BiliClient.prefs.v456idleScreenSaver456
    BiliClient.prefs.v456idleScreenSaver456 = !current
    AppToast.show(this, "Idle Screen Saver456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456ImportAutoMerge456Toggle() {
    val current = BiliClient.prefs.v456importAutoMerge456
    BiliClient.prefs.v456importAutoMerge456 = !current
    AppToast.show(this, "Import Auto Merge456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456IndexAutoRebuild456Toggle() {
    val current = BiliClient.prefs.v456indexAutoRebuild456
    BiliClient.prefs.v456indexAutoRebuild456 = !current
    AppToast.show(this, "Index Auto Rebuild456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456InfoPanelAutoShow456Toggle() {
    val current = BiliClient.prefs.v456infoPanelAutoShow456
    BiliClient.prefs.v456infoPanelAutoShow456 = !current
    AppToast.show(this, "Info Panel Auto Show456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456InlineSubtitle456Toggle() {
    val current = BiliClient.prefs.v456inlineSubtitle456
    BiliClient.prefs.v456inlineSubtitle456 = !current
    AppToast.show(this, "Inline Subtitle456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456InnerLoopEnabled456Toggle() {
    val current = BiliClient.prefs.v456innerLoopEnabled456
    BiliClient.prefs.v456innerLoopEnabled456 = !current
    AppToast.show(this, "Inner Loop Enabled456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456InputAutoFocus456Toggle() {
    val current = BiliClient.prefs.v456inputAutoFocus456
    BiliClient.prefs.v456inputAutoFocus456 = !current
    AppToast.show(this, "Input Auto Focus456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456InsertAdSkip456Toggle() {
    val current = BiliClient.prefs.v456insertAdSkip456
    BiliClient.prefs.v456insertAdSkip456 = !current
    AppToast.show(this, "Insert Ad Skip456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456InstanceAutoSwitch456Toggle() {
    val current = BiliClient.prefs.v456instanceAutoSwitch456
    BiliClient.prefs.v456instanceAutoSwitch456 = !current
    AppToast.show(this, "Instance Auto Switch456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456InternalLinkOpen456Toggle() {
    val current = BiliClient.prefs.v456internalLinkOpen456
    BiliClient.prefs.v456internalLinkOpen456 = !current
    AppToast.show(this, "Internal Link Open456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456ItemAutoHighlight456Toggle() {
    val current = BiliClient.prefs.v456itemAutoHighlight456
    BiliClient.prefs.v456itemAutoHighlight456 = !current
    AppToast.show(this, "Item Auto Highlight456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456JoinRoomAuto456Toggle() {
    val current = BiliClient.prefs.v456joinRoomAuto456
    BiliClient.prefs.v456joinRoomAuto456 = !current
    AppToast.show(this, "Join Room Auto456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV456JumpToTimestamp456Toggle() {
    val current = BiliClient.prefs.v456jumpToTimestamp456
    BiliClient.prefs.v456jumpToTimestamp456 = !current
    AppToast.show(this, "Jump To Timestamp456: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457HybridModeEnabled457Toggle() {
    val current = BiliClient.prefs.v457hybridModeEnabled457
    BiliClient.prefs.v457hybridModeEnabled457 = !current
    AppToast.show(this, "Hybrid Mode Enabled457: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV457IdleScreenSaver457Toggle() {
    val current = BiliClient.prefs.v457idleScreenSaver457
    BiliClient.prefs.v457idleScreenSaver457 = !current
    AppToast.show(this, "Idle Screen Saver457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457ImportAutoMerge457Toggle() {
    val current = BiliClient.prefs.v457importAutoMerge457
    BiliClient.prefs.v457importAutoMerge457 = !current
    AppToast.show(this, "Import Auto Merge457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457IndexAutoRebuild457Toggle() {
    val current = BiliClient.prefs.v457indexAutoRebuild457
    BiliClient.prefs.v457indexAutoRebuild457 = !current
    AppToast.show(this, "Index Auto Rebuild457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457InfoPanelAutoShow457Toggle() {
    val current = BiliClient.prefs.v457infoPanelAutoShow457
    BiliClient.prefs.v457infoPanelAutoShow457 = !current
    AppToast.show(this, "Info Panel Auto Show457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457InlineSubtitle457Toggle() {
    val current = BiliClient.prefs.v457inlineSubtitle457
    BiliClient.prefs.v457inlineSubtitle457 = !current
    AppToast.show(this, "Inline Subtitle457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457InnerLoopEnabled457Toggle() {
    val current = BiliClient.prefs.v457innerLoopEnabled457
    BiliClient.prefs.v457innerLoopEnabled457 = !current
    AppToast.show(this, "Inner Loop Enabled457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457InputAutoFocus457Toggle() {
    val current = BiliClient.prefs.v457inputAutoFocus457
    BiliClient.prefs.v457inputAutoFocus457 = !current
    AppToast.show(this, "Input Auto Focus457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457InsertAdSkip457Toggle() {
    val current = BiliClient.prefs.v457insertAdSkip457
    BiliClient.prefs.v457insertAdSkip457 = !current
    AppToast.show(this, "Insert Ad Skip457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457InstanceAutoSwitch457Toggle() {
    val current = BiliClient.prefs.v457instanceAutoSwitch457
    BiliClient.prefs.v457instanceAutoSwitch457 = !current
    AppToast.show(this, "Instance Auto Switch457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457InternalLinkOpen457Toggle() {
    val current = BiliClient.prefs.v457internalLinkOpen457
    BiliClient.prefs.v457internalLinkOpen457 = !current
    AppToast.show(this, "Internal Link Open457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457ItemAutoHighlight457Toggle() {
    val current = BiliClient.prefs.v457itemAutoHighlight457
    BiliClient.prefs.v457itemAutoHighlight457 = !current
    AppToast.show(this, "Item Auto Highlight457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457JoinRoomAuto457Toggle() {
    val current = BiliClient.prefs.v457joinRoomAuto457
    BiliClient.prefs.v457joinRoomAuto457 = !current
    AppToast.show(this, "Join Room Auto457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV457JumpToTimestamp457Toggle() {
    val current = BiliClient.prefs.v457jumpToTimestamp457
    BiliClient.prefs.v457jumpToTimestamp457 = !current
    AppToast.show(this, "Jump To Timestamp457: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458HybridModeEnabled458Toggle() {
    val current = BiliClient.prefs.v458hybridModeEnabled458
    BiliClient.prefs.v458hybridModeEnabled458 = !current
    AppToast.show(this, "Hybrid Mode Enabled458: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV458IdleScreenSaver458Toggle() {
    val current = BiliClient.prefs.v458idleScreenSaver458
    BiliClient.prefs.v458idleScreenSaver458 = !current
    AppToast.show(this, "Idle Screen Saver458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458ImportAutoMerge458Toggle() {
    val current = BiliClient.prefs.v458importAutoMerge458
    BiliClient.prefs.v458importAutoMerge458 = !current
    AppToast.show(this, "Import Auto Merge458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458IndexAutoRebuild458Toggle() {
    val current = BiliClient.prefs.v458indexAutoRebuild458
    BiliClient.prefs.v458indexAutoRebuild458 = !current
    AppToast.show(this, "Index Auto Rebuild458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458InfoPanelAutoShow458Toggle() {
    val current = BiliClient.prefs.v458infoPanelAutoShow458
    BiliClient.prefs.v458infoPanelAutoShow458 = !current
    AppToast.show(this, "Info Panel Auto Show458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458InlineSubtitle458Toggle() {
    val current = BiliClient.prefs.v458inlineSubtitle458
    BiliClient.prefs.v458inlineSubtitle458 = !current
    AppToast.show(this, "Inline Subtitle458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458InnerLoopEnabled458Toggle() {
    val current = BiliClient.prefs.v458innerLoopEnabled458
    BiliClient.prefs.v458innerLoopEnabled458 = !current
    AppToast.show(this, "Inner Loop Enabled458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458InputAutoFocus458Toggle() {
    val current = BiliClient.prefs.v458inputAutoFocus458
    BiliClient.prefs.v458inputAutoFocus458 = !current
    AppToast.show(this, "Input Auto Focus458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458InsertAdSkip458Toggle() {
    val current = BiliClient.prefs.v458insertAdSkip458
    BiliClient.prefs.v458insertAdSkip458 = !current
    AppToast.show(this, "Insert Ad Skip458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458InstanceAutoSwitch458Toggle() {
    val current = BiliClient.prefs.v458instanceAutoSwitch458
    BiliClient.prefs.v458instanceAutoSwitch458 = !current
    AppToast.show(this, "Instance Auto Switch458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458InternalLinkOpen458Toggle() {
    val current = BiliClient.prefs.v458internalLinkOpen458
    BiliClient.prefs.v458internalLinkOpen458 = !current
    AppToast.show(this, "Internal Link Open458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458ItemAutoHighlight458Toggle() {
    val current = BiliClient.prefs.v458itemAutoHighlight458
    BiliClient.prefs.v458itemAutoHighlight458 = !current
    AppToast.show(this, "Item Auto Highlight458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458JoinRoomAuto458Toggle() {
    val current = BiliClient.prefs.v458joinRoomAuto458
    BiliClient.prefs.v458joinRoomAuto458 = !current
    AppToast.show(this, "Join Room Auto458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV458JumpToTimestamp458Toggle() {
    val current = BiliClient.prefs.v458jumpToTimestamp458
    BiliClient.prefs.v458jumpToTimestamp458 = !current
    AppToast.show(this, "Jump To Timestamp458: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459HybridModeEnabled459Toggle() {
    val current = BiliClient.prefs.v459hybridModeEnabled459
    BiliClient.prefs.v459hybridModeEnabled459 = !current
    AppToast.show(this, "Hybrid Mode Enabled459: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV459IdleScreenSaver459Toggle() {
    val current = BiliClient.prefs.v459idleScreenSaver459
    BiliClient.prefs.v459idleScreenSaver459 = !current
    AppToast.show(this, "Idle Screen Saver459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459ImportAutoMerge459Toggle() {
    val current = BiliClient.prefs.v459importAutoMerge459
    BiliClient.prefs.v459importAutoMerge459 = !current
    AppToast.show(this, "Import Auto Merge459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459IndexAutoRebuild459Toggle() {
    val current = BiliClient.prefs.v459indexAutoRebuild459
    BiliClient.prefs.v459indexAutoRebuild459 = !current
    AppToast.show(this, "Index Auto Rebuild459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459InfoPanelAutoShow459Toggle() {
    val current = BiliClient.prefs.v459infoPanelAutoShow459
    BiliClient.prefs.v459infoPanelAutoShow459 = !current
    AppToast.show(this, "Info Panel Auto Show459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459InlineSubtitle459Toggle() {
    val current = BiliClient.prefs.v459inlineSubtitle459
    BiliClient.prefs.v459inlineSubtitle459 = !current
    AppToast.show(this, "Inline Subtitle459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459InnerLoopEnabled459Toggle() {
    val current = BiliClient.prefs.v459innerLoopEnabled459
    BiliClient.prefs.v459innerLoopEnabled459 = !current
    AppToast.show(this, "Inner Loop Enabled459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459InputAutoFocus459Toggle() {
    val current = BiliClient.prefs.v459inputAutoFocus459
    BiliClient.prefs.v459inputAutoFocus459 = !current
    AppToast.show(this, "Input Auto Focus459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459InsertAdSkip459Toggle() {
    val current = BiliClient.prefs.v459insertAdSkip459
    BiliClient.prefs.v459insertAdSkip459 = !current
    AppToast.show(this, "Insert Ad Skip459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459InstanceAutoSwitch459Toggle() {
    val current = BiliClient.prefs.v459instanceAutoSwitch459
    BiliClient.prefs.v459instanceAutoSwitch459 = !current
    AppToast.show(this, "Instance Auto Switch459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459InternalLinkOpen459Toggle() {
    val current = BiliClient.prefs.v459internalLinkOpen459
    BiliClient.prefs.v459internalLinkOpen459 = !current
    AppToast.show(this, "Internal Link Open459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459ItemAutoHighlight459Toggle() {
    val current = BiliClient.prefs.v459itemAutoHighlight459
    BiliClient.prefs.v459itemAutoHighlight459 = !current
    AppToast.show(this, "Item Auto Highlight459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459JoinRoomAuto459Toggle() {
    val current = BiliClient.prefs.v459joinRoomAuto459
    BiliClient.prefs.v459joinRoomAuto459 = !current
    AppToast.show(this, "Join Room Auto459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV459JumpToTimestamp459Toggle() {
    val current = BiliClient.prefs.v459jumpToTimestamp459
    BiliClient.prefs.v459jumpToTimestamp459 = !current
    AppToast.show(this, "Jump To Timestamp459: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460HybridModeEnabled460Toggle() {
    val current = BiliClient.prefs.v460hybridModeEnabled460
    BiliClient.prefs.v460hybridModeEnabled460 = !current
    AppToast.show(this, "Hybrid Mode Enabled460: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV460IdleScreenSaver460Toggle() {
    val current = BiliClient.prefs.v460idleScreenSaver460
    BiliClient.prefs.v460idleScreenSaver460 = !current
    AppToast.show(this, "Idle Screen Saver460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460ImportAutoMerge460Toggle() {
    val current = BiliClient.prefs.v460importAutoMerge460
    BiliClient.prefs.v460importAutoMerge460 = !current
    AppToast.show(this, "Import Auto Merge460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460IndexAutoRebuild460Toggle() {
    val current = BiliClient.prefs.v460indexAutoRebuild460
    BiliClient.prefs.v460indexAutoRebuild460 = !current
    AppToast.show(this, "Index Auto Rebuild460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460InfoPanelAutoShow460Toggle() {
    val current = BiliClient.prefs.v460infoPanelAutoShow460
    BiliClient.prefs.v460infoPanelAutoShow460 = !current
    AppToast.show(this, "Info Panel Auto Show460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460InlineSubtitle460Toggle() {
    val current = BiliClient.prefs.v460inlineSubtitle460
    BiliClient.prefs.v460inlineSubtitle460 = !current
    AppToast.show(this, "Inline Subtitle460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460InnerLoopEnabled460Toggle() {
    val current = BiliClient.prefs.v460innerLoopEnabled460
    BiliClient.prefs.v460innerLoopEnabled460 = !current
    AppToast.show(this, "Inner Loop Enabled460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460InputAutoFocus460Toggle() {
    val current = BiliClient.prefs.v460inputAutoFocus460
    BiliClient.prefs.v460inputAutoFocus460 = !current
    AppToast.show(this, "Input Auto Focus460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460InsertAdSkip460Toggle() {
    val current = BiliClient.prefs.v460insertAdSkip460
    BiliClient.prefs.v460insertAdSkip460 = !current
    AppToast.show(this, "Insert Ad Skip460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460InstanceAutoSwitch460Toggle() {
    val current = BiliClient.prefs.v460instanceAutoSwitch460
    BiliClient.prefs.v460instanceAutoSwitch460 = !current
    AppToast.show(this, "Instance Auto Switch460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460InternalLinkOpen460Toggle() {
    val current = BiliClient.prefs.v460internalLinkOpen460
    BiliClient.prefs.v460internalLinkOpen460 = !current
    AppToast.show(this, "Internal Link Open460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460ItemAutoHighlight460Toggle() {
    val current = BiliClient.prefs.v460itemAutoHighlight460
    BiliClient.prefs.v460itemAutoHighlight460 = !current
    AppToast.show(this, "Item Auto Highlight460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460JoinRoomAuto460Toggle() {
    val current = BiliClient.prefs.v460joinRoomAuto460
    BiliClient.prefs.v460joinRoomAuto460 = !current
    AppToast.show(this, "Join Room Auto460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV460JumpToTimestamp460Toggle() {
    val current = BiliClient.prefs.v460jumpToTimestamp460
    BiliClient.prefs.v460jumpToTimestamp460 = !current
    AppToast.show(this, "Jump To Timestamp460: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV461KeyMappingCustom461Toggle() {
    val current = BiliClient.prefs.v461keyMappingCustom461
    BiliClient.prefs.v461keyMappingCustom461 = !current
    AppToast.show(this, "Key Mapping Custom461: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV461LabelAutoGenerate461Toggle() {
    val current = BiliClient.prefs.v461labelAutoGenerate461
    BiliClient.prefs.v461labelAutoGenerate461 = !current
    AppToast.show(this, "Label Auto Generate461: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV461LayerAutoComposite461Toggle() {
    val current = BiliClient.prefs.v461layerAutoComposite461
    BiliClient.prefs.v461layerAutoComposite461 = !current
    AppToast.show(this, "Layer Auto Composite461: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV461LazyLoadEnabled461Toggle() {
    val current = BiliClient.prefs.v461lazyLoadEnabled461
    BiliClient.prefs.v461lazyLoadEnabled461 = !current
    AppToast.show(this, "Lazy Load Enabled461: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV461LeadInAutoSkip461Toggle() {
    val current = BiliClient.prefs.v461leadInAutoSkip461
    BiliClient.prefs.v461leadInAutoSkip461 = !current
    AppToast.show(this, "Lead In Auto Skip461: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV461LensCorrection461Toggle() {
    val current = BiliClient.prefs.v461lensCorrection461
    BiliClient.prefs.v461lensCorrection461 = !current
    AppToast.show(this, "Lens Correction461: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV461LightAdaptive461Toggle() {
    val current = BiliClient.prefs.v461lightAdaptive461
    BiliClient.prefs.v461lightAdaptive461 = !current
    AppToast.show(this, "Light Adaptive461: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV461LimitBandwidthAuto461Toggle() {
    val current = BiliClient.prefs.v461limitBandwidthAuto461
    BiliClient.prefs.v461limitBandwidthAuto461 = !current
    AppToast.show(this, "Limit Bandwidth Auto461: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV461LinkPreviewAuto461Toggle() {
    val current = BiliClient.prefs.v461linkPreviewAuto461
    BiliClient.prefs.v461linkPreviewAuto461 = !current
    AppToast.show(this, "Link Preview Auto461: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV461ListAnimation461Toggle() {
    val current = BiliClient.prefs.v461listAnimation461
    BiliClient.prefs.v461listAnimation461 = !current
    AppToast.show(this, "List Animation461: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV461LoadPriorityHigh461Toggle() {
    val current = BiliClient.prefs.v461loadPriorityHigh461
    BiliClient.prefs.v461loadPriorityHigh461 = !current
    AppToast.show(this, "Load Priority High461: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV461LocalCacheEnabled461Toggle() {
    val current = BiliClient.prefs.v461localCacheEnabled461
    BiliClient.prefs.v461localCacheEnabled461 = !current
    AppToast.show(this, "Local Cache Enabled461: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV461LocationBasedRec461Toggle() {
    val current = BiliClient.prefs.v461locationBasedRec461
    BiliClient.prefs.v461locationBasedRec461 = !current
    AppToast.show(this, "Location Based Rec461: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV462KeyMappingCustom462Toggle() {
    val current = BiliClient.prefs.v462keyMappingCustom462
    BiliClient.prefs.v462keyMappingCustom462 = !current
    AppToast.show(this, "Key Mapping Custom462: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV462LabelAutoGenerate462Toggle() {
    val current = BiliClient.prefs.v462labelAutoGenerate462
    BiliClient.prefs.v462labelAutoGenerate462 = !current
    AppToast.show(this, "Label Auto Generate462: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV462LayerAutoComposite462Toggle() {
    val current = BiliClient.prefs.v462layerAutoComposite462
    BiliClient.prefs.v462layerAutoComposite462 = !current
    AppToast.show(this, "Layer Auto Composite462: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV462LazyLoadEnabled462Toggle() {
    val current = BiliClient.prefs.v462lazyLoadEnabled462
    BiliClient.prefs.v462lazyLoadEnabled462 = !current
    AppToast.show(this, "Lazy Load Enabled462: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV462LeadInAutoSkip462Toggle() {
    val current = BiliClient.prefs.v462leadInAutoSkip462
    BiliClient.prefs.v462leadInAutoSkip462 = !current
    AppToast.show(this, "Lead In Auto Skip462: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV462LensCorrection462Toggle() {
    val current = BiliClient.prefs.v462lensCorrection462
    BiliClient.prefs.v462lensCorrection462 = !current
    AppToast.show(this, "Lens Correction462: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV462LightAdaptive462Toggle() {
    val current = BiliClient.prefs.v462lightAdaptive462
    BiliClient.prefs.v462lightAdaptive462 = !current
    AppToast.show(this, "Light Adaptive462: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV462LimitBandwidthAuto462Toggle() {
    val current = BiliClient.prefs.v462limitBandwidthAuto462
    BiliClient.prefs.v462limitBandwidthAuto462 = !current
    AppToast.show(this, "Limit Bandwidth Auto462: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV462LinkPreviewAuto462Toggle() {
    val current = BiliClient.prefs.v462linkPreviewAuto462
    BiliClient.prefs.v462linkPreviewAuto462 = !current
    AppToast.show(this, "Link Preview Auto462: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV462ListAnimation462Toggle() {
    val current = BiliClient.prefs.v462listAnimation462
    BiliClient.prefs.v462listAnimation462 = !current
    AppToast.show(this, "List Animation462: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV462LoadPriorityHigh462Toggle() {
    val current = BiliClient.prefs.v462loadPriorityHigh462
    BiliClient.prefs.v462loadPriorityHigh462 = !current
    AppToast.show(this, "Load Priority High462: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV462LocalCacheEnabled462Toggle() {
    val current = BiliClient.prefs.v462localCacheEnabled462
    BiliClient.prefs.v462localCacheEnabled462 = !current
    AppToast.show(this, "Local Cache Enabled462: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV462LocationBasedRec462Toggle() {
    val current = BiliClient.prefs.v462locationBasedRec462
    BiliClient.prefs.v462locationBasedRec462 = !current
    AppToast.show(this, "Location Based Rec462: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV463KeyMappingCustom463Toggle() {
    val current = BiliClient.prefs.v463keyMappingCustom463
    BiliClient.prefs.v463keyMappingCustom463 = !current
    AppToast.show(this, "Key Mapping Custom463: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV463LabelAutoGenerate463Toggle() {
    val current = BiliClient.prefs.v463labelAutoGenerate463
    BiliClient.prefs.v463labelAutoGenerate463 = !current
    AppToast.show(this, "Label Auto Generate463: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV463LayerAutoComposite463Toggle() {
    val current = BiliClient.prefs.v463layerAutoComposite463
    BiliClient.prefs.v463layerAutoComposite463 = !current
    AppToast.show(this, "Layer Auto Composite463: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV463LazyLoadEnabled463Toggle() {
    val current = BiliClient.prefs.v463lazyLoadEnabled463
    BiliClient.prefs.v463lazyLoadEnabled463 = !current
    AppToast.show(this, "Lazy Load Enabled463: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV463LeadInAutoSkip463Toggle() {
    val current = BiliClient.prefs.v463leadInAutoSkip463
    BiliClient.prefs.v463leadInAutoSkip463 = !current
    AppToast.show(this, "Lead In Auto Skip463: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV463LensCorrection463Toggle() {
    val current = BiliClient.prefs.v463lensCorrection463
    BiliClient.prefs.v463lensCorrection463 = !current
    AppToast.show(this, "Lens Correction463: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV463LightAdaptive463Toggle() {
    val current = BiliClient.prefs.v463lightAdaptive463
    BiliClient.prefs.v463lightAdaptive463 = !current
    AppToast.show(this, "Light Adaptive463: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV463LimitBandwidthAuto463Toggle() {
    val current = BiliClient.prefs.v463limitBandwidthAuto463
    BiliClient.prefs.v463limitBandwidthAuto463 = !current
    AppToast.show(this, "Limit Bandwidth Auto463: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV463LinkPreviewAuto463Toggle() {
    val current = BiliClient.prefs.v463linkPreviewAuto463
    BiliClient.prefs.v463linkPreviewAuto463 = !current
    AppToast.show(this, "Link Preview Auto463: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV463ListAnimation463Toggle() {
    val current = BiliClient.prefs.v463listAnimation463
    BiliClient.prefs.v463listAnimation463 = !current
    AppToast.show(this, "List Animation463: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV463LoadPriorityHigh463Toggle() {
    val current = BiliClient.prefs.v463loadPriorityHigh463
    BiliClient.prefs.v463loadPriorityHigh463 = !current
    AppToast.show(this, "Load Priority High463: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV463LocalCacheEnabled463Toggle() {
    val current = BiliClient.prefs.v463localCacheEnabled463
    BiliClient.prefs.v463localCacheEnabled463 = !current
    AppToast.show(this, "Local Cache Enabled463: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV463LocationBasedRec463Toggle() {
    val current = BiliClient.prefs.v463locationBasedRec463
    BiliClient.prefs.v463locationBasedRec463 = !current
    AppToast.show(this, "Location Based Rec463: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV464KeyMappingCustom464Toggle() {
    val current = BiliClient.prefs.v464keyMappingCustom464
    BiliClient.prefs.v464keyMappingCustom464 = !current
    AppToast.show(this, "Key Mapping Custom464: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV464LabelAutoGenerate464Toggle() {
    val current = BiliClient.prefs.v464labelAutoGenerate464
    BiliClient.prefs.v464labelAutoGenerate464 = !current
    AppToast.show(this, "Label Auto Generate464: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV464LayerAutoComposite464Toggle() {
    val current = BiliClient.prefs.v464layerAutoComposite464
    BiliClient.prefs.v464layerAutoComposite464 = !current
    AppToast.show(this, "Layer Auto Composite464: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV464LazyLoadEnabled464Toggle() {
    val current = BiliClient.prefs.v464lazyLoadEnabled464
    BiliClient.prefs.v464lazyLoadEnabled464 = !current
    AppToast.show(this, "Lazy Load Enabled464: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV464LeadInAutoSkip464Toggle() {
    val current = BiliClient.prefs.v464leadInAutoSkip464
    BiliClient.prefs.v464leadInAutoSkip464 = !current
    AppToast.show(this, "Lead In Auto Skip464: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV464LensCorrection464Toggle() {
    val current = BiliClient.prefs.v464lensCorrection464
    BiliClient.prefs.v464lensCorrection464 = !current
    AppToast.show(this, "Lens Correction464: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV464LightAdaptive464Toggle() {
    val current = BiliClient.prefs.v464lightAdaptive464
    BiliClient.prefs.v464lightAdaptive464 = !current
    AppToast.show(this, "Light Adaptive464: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV464LimitBandwidthAuto464Toggle() {
    val current = BiliClient.prefs.v464limitBandwidthAuto464
    BiliClient.prefs.v464limitBandwidthAuto464 = !current
    AppToast.show(this, "Limit Bandwidth Auto464: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV464LinkPreviewAuto464Toggle() {
    val current = BiliClient.prefs.v464linkPreviewAuto464
    BiliClient.prefs.v464linkPreviewAuto464 = !current
    AppToast.show(this, "Link Preview Auto464: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV464ListAnimation464Toggle() {
    val current = BiliClient.prefs.v464listAnimation464
    BiliClient.prefs.v464listAnimation464 = !current
    AppToast.show(this, "List Animation464: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV464LoadPriorityHigh464Toggle() {
    val current = BiliClient.prefs.v464loadPriorityHigh464
    BiliClient.prefs.v464loadPriorityHigh464 = !current
    AppToast.show(this, "Load Priority High464: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV464LocalCacheEnabled464Toggle() {
    val current = BiliClient.prefs.v464localCacheEnabled464
    BiliClient.prefs.v464localCacheEnabled464 = !current
    AppToast.show(this, "Local Cache Enabled464: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV464LocationBasedRec464Toggle() {
    val current = BiliClient.prefs.v464locationBasedRec464
    BiliClient.prefs.v464locationBasedRec464 = !current
    AppToast.show(this, "Location Based Rec464: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV465KeyMappingCustom465Toggle() {
    val current = BiliClient.prefs.v465keyMappingCustom465
    BiliClient.prefs.v465keyMappingCustom465 = !current
    AppToast.show(this, "Key Mapping Custom465: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV465LabelAutoGenerate465Toggle() {
    val current = BiliClient.prefs.v465labelAutoGenerate465
    BiliClient.prefs.v465labelAutoGenerate465 = !current
    AppToast.show(this, "Label Auto Generate465: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV465LayerAutoComposite465Toggle() {
    val current = BiliClient.prefs.v465layerAutoComposite465
    BiliClient.prefs.v465layerAutoComposite465 = !current
    AppToast.show(this, "Layer Auto Composite465: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV465LazyLoadEnabled465Toggle() {
    val current = BiliClient.prefs.v465lazyLoadEnabled465
    BiliClient.prefs.v465lazyLoadEnabled465 = !current
    AppToast.show(this, "Lazy Load Enabled465: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV465LeadInAutoSkip465Toggle() {
    val current = BiliClient.prefs.v465leadInAutoSkip465
    BiliClient.prefs.v465leadInAutoSkip465 = !current
    AppToast.show(this, "Lead In Auto Skip465: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV465LensCorrection465Toggle() {
    val current = BiliClient.prefs.v465lensCorrection465
    BiliClient.prefs.v465lensCorrection465 = !current
    AppToast.show(this, "Lens Correction465: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV465LightAdaptive465Toggle() {
    val current = BiliClient.prefs.v465lightAdaptive465
    BiliClient.prefs.v465lightAdaptive465 = !current
    AppToast.show(this, "Light Adaptive465: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV465LimitBandwidthAuto465Toggle() {
    val current = BiliClient.prefs.v465limitBandwidthAuto465
    BiliClient.prefs.v465limitBandwidthAuto465 = !current
    AppToast.show(this, "Limit Bandwidth Auto465: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV465LinkPreviewAuto465Toggle() {
    val current = BiliClient.prefs.v465linkPreviewAuto465
    BiliClient.prefs.v465linkPreviewAuto465 = !current
    AppToast.show(this, "Link Preview Auto465: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV465ListAnimation465Toggle() {
    val current = BiliClient.prefs.v465listAnimation465
    BiliClient.prefs.v465listAnimation465 = !current
    AppToast.show(this, "List Animation465: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV465LoadPriorityHigh465Toggle() {
    val current = BiliClient.prefs.v465loadPriorityHigh465
    BiliClient.prefs.v465loadPriorityHigh465 = !current
    AppToast.show(this, "Load Priority High465: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV465LocalCacheEnabled465Toggle() {
    val current = BiliClient.prefs.v465localCacheEnabled465
    BiliClient.prefs.v465localCacheEnabled465 = !current
    AppToast.show(this, "Local Cache Enabled465: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV465LocationBasedRec465Toggle() {
    val current = BiliClient.prefs.v465locationBasedRec465
    BiliClient.prefs.v465locationBasedRec465 = !current
    AppToast.show(this, "Location Based Rec465: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV466KeyMappingCustom466Toggle() {
    val current = BiliClient.prefs.v466keyMappingCustom466
    BiliClient.prefs.v466keyMappingCustom466 = !current
    AppToast.show(this, "Key Mapping Custom466: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV466LabelAutoGenerate466Toggle() {
    val current = BiliClient.prefs.v466labelAutoGenerate466
    BiliClient.prefs.v466labelAutoGenerate466 = !current
    AppToast.show(this, "Label Auto Generate466: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV466LayerAutoComposite466Toggle() {
    val current = BiliClient.prefs.v466layerAutoComposite466
    BiliClient.prefs.v466layerAutoComposite466 = !current
    AppToast.show(this, "Layer Auto Composite466: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV466LazyLoadEnabled466Toggle() {
    val current = BiliClient.prefs.v466lazyLoadEnabled466
    BiliClient.prefs.v466lazyLoadEnabled466 = !current
    AppToast.show(this, "Lazy Load Enabled466: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV466LeadInAutoSkip466Toggle() {
    val current = BiliClient.prefs.v466leadInAutoSkip466
    BiliClient.prefs.v466leadInAutoSkip466 = !current
    AppToast.show(this, "Lead In Auto Skip466: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV466LensCorrection466Toggle() {
    val current = BiliClient.prefs.v466lensCorrection466
    BiliClient.prefs.v466lensCorrection466 = !current
    AppToast.show(this, "Lens Correction466: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV466LightAdaptive466Toggle() {
    val current = BiliClient.prefs.v466lightAdaptive466
    BiliClient.prefs.v466lightAdaptive466 = !current
    AppToast.show(this, "Light Adaptive466: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV466LimitBandwidthAuto466Toggle() {
    val current = BiliClient.prefs.v466limitBandwidthAuto466
    BiliClient.prefs.v466limitBandwidthAuto466 = !current
    AppToast.show(this, "Limit Bandwidth Auto466: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV466LinkPreviewAuto466Toggle() {
    val current = BiliClient.prefs.v466linkPreviewAuto466
    BiliClient.prefs.v466linkPreviewAuto466 = !current
    AppToast.show(this, "Link Preview Auto466: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV466ListAnimation466Toggle() {
    val current = BiliClient.prefs.v466listAnimation466
    BiliClient.prefs.v466listAnimation466 = !current
    AppToast.show(this, "List Animation466: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV466LoadPriorityHigh466Toggle() {
    val current = BiliClient.prefs.v466loadPriorityHigh466
    BiliClient.prefs.v466loadPriorityHigh466 = !current
    AppToast.show(this, "Load Priority High466: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV466LocalCacheEnabled466Toggle() {
    val current = BiliClient.prefs.v466localCacheEnabled466
    BiliClient.prefs.v466localCacheEnabled466 = !current
    AppToast.show(this, "Local Cache Enabled466: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV466LocationBasedRec466Toggle() {
    val current = BiliClient.prefs.v466locationBasedRec466
    BiliClient.prefs.v466locationBasedRec466 = !current
    AppToast.show(this, "Location Based Rec466: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV467KeyMappingCustom467Toggle() {
    val current = BiliClient.prefs.v467keyMappingCustom467
    BiliClient.prefs.v467keyMappingCustom467 = !current
    AppToast.show(this, "Key Mapping Custom467: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV467LabelAutoGenerate467Toggle() {
    val current = BiliClient.prefs.v467labelAutoGenerate467
    BiliClient.prefs.v467labelAutoGenerate467 = !current
    AppToast.show(this, "Label Auto Generate467: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV467LayerAutoComposite467Toggle() {
    val current = BiliClient.prefs.v467layerAutoComposite467
    BiliClient.prefs.v467layerAutoComposite467 = !current
    AppToast.show(this, "Layer Auto Composite467: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV467LazyLoadEnabled467Toggle() {
    val current = BiliClient.prefs.v467lazyLoadEnabled467
    BiliClient.prefs.v467lazyLoadEnabled467 = !current
    AppToast.show(this, "Lazy Load Enabled467: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV467LeadInAutoSkip467Toggle() {
    val current = BiliClient.prefs.v467leadInAutoSkip467
    BiliClient.prefs.v467leadInAutoSkip467 = !current
    AppToast.show(this, "Lead In Auto Skip467: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV467LensCorrection467Toggle() {
    val current = BiliClient.prefs.v467lensCorrection467
    BiliClient.prefs.v467lensCorrection467 = !current
    AppToast.show(this, "Lens Correction467: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV467LightAdaptive467Toggle() {
    val current = BiliClient.prefs.v467lightAdaptive467
    BiliClient.prefs.v467lightAdaptive467 = !current
    AppToast.show(this, "Light Adaptive467: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV467LimitBandwidthAuto467Toggle() {
    val current = BiliClient.prefs.v467limitBandwidthAuto467
    BiliClient.prefs.v467limitBandwidthAuto467 = !current
    AppToast.show(this, "Limit Bandwidth Auto467: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV467LinkPreviewAuto467Toggle() {
    val current = BiliClient.prefs.v467linkPreviewAuto467
    BiliClient.prefs.v467linkPreviewAuto467 = !current
    AppToast.show(this, "Link Preview Auto467: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV467ListAnimation467Toggle() {
    val current = BiliClient.prefs.v467listAnimation467
    BiliClient.prefs.v467listAnimation467 = !current
    AppToast.show(this, "List Animation467: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV467LoadPriorityHigh467Toggle() {
    val current = BiliClient.prefs.v467loadPriorityHigh467
    BiliClient.prefs.v467loadPriorityHigh467 = !current
    AppToast.show(this, "Load Priority High467: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV467LocalCacheEnabled467Toggle() {
    val current = BiliClient.prefs.v467localCacheEnabled467
    BiliClient.prefs.v467localCacheEnabled467 = !current
    AppToast.show(this, "Local Cache Enabled467: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV467LocationBasedRec467Toggle() {
    val current = BiliClient.prefs.v467locationBasedRec467
    BiliClient.prefs.v467locationBasedRec467 = !current
    AppToast.show(this, "Location Based Rec467: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV468KeyMappingCustom468Toggle() {
    val current = BiliClient.prefs.v468keyMappingCustom468
    BiliClient.prefs.v468keyMappingCustom468 = !current
    AppToast.show(this, "Key Mapping Custom468: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV468LabelAutoGenerate468Toggle() {
    val current = BiliClient.prefs.v468labelAutoGenerate468
    BiliClient.prefs.v468labelAutoGenerate468 = !current
    AppToast.show(this, "Label Auto Generate468: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV468LayerAutoComposite468Toggle() {
    val current = BiliClient.prefs.v468layerAutoComposite468
    BiliClient.prefs.v468layerAutoComposite468 = !current
    AppToast.show(this, "Layer Auto Composite468: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV468LazyLoadEnabled468Toggle() {
    val current = BiliClient.prefs.v468lazyLoadEnabled468
    BiliClient.prefs.v468lazyLoadEnabled468 = !current
    AppToast.show(this, "Lazy Load Enabled468: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV468LeadInAutoSkip468Toggle() {
    val current = BiliClient.prefs.v468leadInAutoSkip468
    BiliClient.prefs.v468leadInAutoSkip468 = !current
    AppToast.show(this, "Lead In Auto Skip468: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV468LensCorrection468Toggle() {
    val current = BiliClient.prefs.v468lensCorrection468
    BiliClient.prefs.v468lensCorrection468 = !current
    AppToast.show(this, "Lens Correction468: ${if (!current) "ON" else "OFF"}")
}

