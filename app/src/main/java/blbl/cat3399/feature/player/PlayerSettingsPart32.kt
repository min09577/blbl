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

internal fun PlayerActivity.showV441HoldToFastForward441Toggle() {
    val current = BiliClient.prefs.v441holdToFastForward441
    BiliClient.prefs.v441holdToFastForward441 = !current
    AppToast.show(this, "Hold To Fast Forward441: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV441HookAutoRegister441Toggle() {
    val current = BiliClient.prefs.v441hookAutoRegister441
    BiliClient.prefs.v441hookAutoRegister441 = !current
    AppToast.show(this, "Hook Auto Register441: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV441HotReloadEnabled441Toggle() {
    val current = BiliClient.prefs.v441hotReloadEnabled441
    BiliClient.prefs.v441hotReloadEnabled441 = !current
    AppToast.show(this, "Hot Reload Enabled441: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV441HubAutoDiscover441Toggle() {
    val current = BiliClient.prefs.v441hubAutoDiscover441
    BiliClient.prefs.v441hubAutoDiscover441 = !current
    AppToast.show(this, "Hub Auto Discover441: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442GateAutoAuth442Toggle() {
    val current = BiliClient.prefs.v442gateAutoAuth442
    BiliClient.prefs.v442gateAutoAuth442 = !current
    AppToast.show(this, "Gate Auto Auth442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442GlobalSyncEnabled442Toggle() {
    val current = BiliClient.prefs.v442globalSyncEnabled442
    BiliClient.prefs.v442globalSyncEnabled442 = !current
    AppToast.show(this, "Global Sync Enabled442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442GroupAutoCreate442Toggle() {
    val current = BiliClient.prefs.v442groupAutoCreate442
    BiliClient.prefs.v442groupAutoCreate442 = !current
    AppToast.show(this, "Group Auto Create442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442GrowShrinkEnabled442Toggle() {
    val current = BiliClient.prefs.v442growShrinkEnabled442
    BiliClient.prefs.v442growShrinkEnabled442 = !current
    AppToast.show(this, "Grow Shrink Enabled442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442GuideAutoShow442Toggle() {
    val current = BiliClient.prefs.v442guideAutoShow442
    BiliClient.prefs.v442guideAutoShow442 = !current
    AppToast.show(this, "Guide Auto Show442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442HangDetectionMs442Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v442hangDetectionMs442).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms442",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v442hangDetectionMs442 = value
        AppToast.show(this, "Hang Detection Ms442: $value")
    }
}

internal fun PlayerActivity.showV442HashVerifyAuto442Toggle() {
    val current = BiliClient.prefs.v442hashVerifyAuto442
    BiliClient.prefs.v442hashVerifyAuto442 = !current
    AppToast.show(this, "Hash Verify Auto442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442HeadPhoneAutoPause442Toggle() {
    val current = BiliClient.prefs.v442headPhoneAutoPause442
    BiliClient.prefs.v442headPhoneAutoPause442 = !current
    AppToast.show(this, "HeadPhone Auto Pause442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442HeartBeatInterval442Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v442heartBeatInterval442).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval442",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v442heartBeatInterval442 = value
        AppToast.show(this, "Heart Beat Interval442: $value")
    }
}

internal fun PlayerActivity.showV442HeatMonitorEnabled442Toggle() {
    val current = BiliClient.prefs.v442heatMonitorEnabled442
    BiliClient.prefs.v442heatMonitorEnabled442 = !current
    AppToast.show(this, "Heat Monitor Enabled442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442HideOnScroll442Toggle() {
    val current = BiliClient.prefs.v442hideOnScroll442
    BiliClient.prefs.v442hideOnScroll442 = !current
    AppToast.show(this, "Hide On Scroll442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442HoldToFastForward442Toggle() {
    val current = BiliClient.prefs.v442holdToFastForward442
    BiliClient.prefs.v442holdToFastForward442 = !current
    AppToast.show(this, "Hold To Fast Forward442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442HookAutoRegister442Toggle() {
    val current = BiliClient.prefs.v442hookAutoRegister442
    BiliClient.prefs.v442hookAutoRegister442 = !current
    AppToast.show(this, "Hook Auto Register442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442HotReloadEnabled442Toggle() {
    val current = BiliClient.prefs.v442hotReloadEnabled442
    BiliClient.prefs.v442hotReloadEnabled442 = !current
    AppToast.show(this, "Hot Reload Enabled442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV442HubAutoDiscover442Toggle() {
    val current = BiliClient.prefs.v442hubAutoDiscover442
    BiliClient.prefs.v442hubAutoDiscover442 = !current
    AppToast.show(this, "Hub Auto Discover442: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443GateAutoAuth443Toggle() {
    val current = BiliClient.prefs.v443gateAutoAuth443
    BiliClient.prefs.v443gateAutoAuth443 = !current
    AppToast.show(this, "Gate Auto Auth443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443GlobalSyncEnabled443Toggle() {
    val current = BiliClient.prefs.v443globalSyncEnabled443
    BiliClient.prefs.v443globalSyncEnabled443 = !current
    AppToast.show(this, "Global Sync Enabled443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443GroupAutoCreate443Toggle() {
    val current = BiliClient.prefs.v443groupAutoCreate443
    BiliClient.prefs.v443groupAutoCreate443 = !current
    AppToast.show(this, "Group Auto Create443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443GrowShrinkEnabled443Toggle() {
    val current = BiliClient.prefs.v443growShrinkEnabled443
    BiliClient.prefs.v443growShrinkEnabled443 = !current
    AppToast.show(this, "Grow Shrink Enabled443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443GuideAutoShow443Toggle() {
    val current = BiliClient.prefs.v443guideAutoShow443
    BiliClient.prefs.v443guideAutoShow443 = !current
    AppToast.show(this, "Guide Auto Show443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443HangDetectionMs443Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v443hangDetectionMs443).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms443",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v443hangDetectionMs443 = value
        AppToast.show(this, "Hang Detection Ms443: $value")
    }
}

internal fun PlayerActivity.showV443HashVerifyAuto443Toggle() {
    val current = BiliClient.prefs.v443hashVerifyAuto443
    BiliClient.prefs.v443hashVerifyAuto443 = !current
    AppToast.show(this, "Hash Verify Auto443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443HeadPhoneAutoPause443Toggle() {
    val current = BiliClient.prefs.v443headPhoneAutoPause443
    BiliClient.prefs.v443headPhoneAutoPause443 = !current
    AppToast.show(this, "HeadPhone Auto Pause443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443HeartBeatInterval443Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v443heartBeatInterval443).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval443",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v443heartBeatInterval443 = value
        AppToast.show(this, "Heart Beat Interval443: $value")
    }
}

internal fun PlayerActivity.showV443HeatMonitorEnabled443Toggle() {
    val current = BiliClient.prefs.v443heatMonitorEnabled443
    BiliClient.prefs.v443heatMonitorEnabled443 = !current
    AppToast.show(this, "Heat Monitor Enabled443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443HideOnScroll443Toggle() {
    val current = BiliClient.prefs.v443hideOnScroll443
    BiliClient.prefs.v443hideOnScroll443 = !current
    AppToast.show(this, "Hide On Scroll443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443HoldToFastForward443Toggle() {
    val current = BiliClient.prefs.v443holdToFastForward443
    BiliClient.prefs.v443holdToFastForward443 = !current
    AppToast.show(this, "Hold To Fast Forward443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443HookAutoRegister443Toggle() {
    val current = BiliClient.prefs.v443hookAutoRegister443
    BiliClient.prefs.v443hookAutoRegister443 = !current
    AppToast.show(this, "Hook Auto Register443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443HotReloadEnabled443Toggle() {
    val current = BiliClient.prefs.v443hotReloadEnabled443
    BiliClient.prefs.v443hotReloadEnabled443 = !current
    AppToast.show(this, "Hot Reload Enabled443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV443HubAutoDiscover443Toggle() {
    val current = BiliClient.prefs.v443hubAutoDiscover443
    BiliClient.prefs.v443hubAutoDiscover443 = !current
    AppToast.show(this, "Hub Auto Discover443: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444GateAutoAuth444Toggle() {
    val current = BiliClient.prefs.v444gateAutoAuth444
    BiliClient.prefs.v444gateAutoAuth444 = !current
    AppToast.show(this, "Gate Auto Auth444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444GlobalSyncEnabled444Toggle() {
    val current = BiliClient.prefs.v444globalSyncEnabled444
    BiliClient.prefs.v444globalSyncEnabled444 = !current
    AppToast.show(this, "Global Sync Enabled444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444GroupAutoCreate444Toggle() {
    val current = BiliClient.prefs.v444groupAutoCreate444
    BiliClient.prefs.v444groupAutoCreate444 = !current
    AppToast.show(this, "Group Auto Create444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444GrowShrinkEnabled444Toggle() {
    val current = BiliClient.prefs.v444growShrinkEnabled444
    BiliClient.prefs.v444growShrinkEnabled444 = !current
    AppToast.show(this, "Grow Shrink Enabled444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444GuideAutoShow444Toggle() {
    val current = BiliClient.prefs.v444guideAutoShow444
    BiliClient.prefs.v444guideAutoShow444 = !current
    AppToast.show(this, "Guide Auto Show444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444HangDetectionMs444Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v444hangDetectionMs444).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms444",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v444hangDetectionMs444 = value
        AppToast.show(this, "Hang Detection Ms444: $value")
    }
}

internal fun PlayerActivity.showV444HashVerifyAuto444Toggle() {
    val current = BiliClient.prefs.v444hashVerifyAuto444
    BiliClient.prefs.v444hashVerifyAuto444 = !current
    AppToast.show(this, "Hash Verify Auto444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444HeadPhoneAutoPause444Toggle() {
    val current = BiliClient.prefs.v444headPhoneAutoPause444
    BiliClient.prefs.v444headPhoneAutoPause444 = !current
    AppToast.show(this, "HeadPhone Auto Pause444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444HeartBeatInterval444Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v444heartBeatInterval444).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval444",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v444heartBeatInterval444 = value
        AppToast.show(this, "Heart Beat Interval444: $value")
    }
}

internal fun PlayerActivity.showV444HeatMonitorEnabled444Toggle() {
    val current = BiliClient.prefs.v444heatMonitorEnabled444
    BiliClient.prefs.v444heatMonitorEnabled444 = !current
    AppToast.show(this, "Heat Monitor Enabled444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444HideOnScroll444Toggle() {
    val current = BiliClient.prefs.v444hideOnScroll444
    BiliClient.prefs.v444hideOnScroll444 = !current
    AppToast.show(this, "Hide On Scroll444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444HoldToFastForward444Toggle() {
    val current = BiliClient.prefs.v444holdToFastForward444
    BiliClient.prefs.v444holdToFastForward444 = !current
    AppToast.show(this, "Hold To Fast Forward444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444HookAutoRegister444Toggle() {
    val current = BiliClient.prefs.v444hookAutoRegister444
    BiliClient.prefs.v444hookAutoRegister444 = !current
    AppToast.show(this, "Hook Auto Register444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444HotReloadEnabled444Toggle() {
    val current = BiliClient.prefs.v444hotReloadEnabled444
    BiliClient.prefs.v444hotReloadEnabled444 = !current
    AppToast.show(this, "Hot Reload Enabled444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV444HubAutoDiscover444Toggle() {
    val current = BiliClient.prefs.v444hubAutoDiscover444
    BiliClient.prefs.v444hubAutoDiscover444 = !current
    AppToast.show(this, "Hub Auto Discover444: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445GateAutoAuth445Toggle() {
    val current = BiliClient.prefs.v445gateAutoAuth445
    BiliClient.prefs.v445gateAutoAuth445 = !current
    AppToast.show(this, "Gate Auto Auth445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445GlobalSyncEnabled445Toggle() {
    val current = BiliClient.prefs.v445globalSyncEnabled445
    BiliClient.prefs.v445globalSyncEnabled445 = !current
    AppToast.show(this, "Global Sync Enabled445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445GroupAutoCreate445Toggle() {
    val current = BiliClient.prefs.v445groupAutoCreate445
    BiliClient.prefs.v445groupAutoCreate445 = !current
    AppToast.show(this, "Group Auto Create445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445GrowShrinkEnabled445Toggle() {
    val current = BiliClient.prefs.v445growShrinkEnabled445
    BiliClient.prefs.v445growShrinkEnabled445 = !current
    AppToast.show(this, "Grow Shrink Enabled445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445GuideAutoShow445Toggle() {
    val current = BiliClient.prefs.v445guideAutoShow445
    BiliClient.prefs.v445guideAutoShow445 = !current
    AppToast.show(this, "Guide Auto Show445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445HangDetectionMs445Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v445hangDetectionMs445).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms445",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v445hangDetectionMs445 = value
        AppToast.show(this, "Hang Detection Ms445: $value")
    }
}

internal fun PlayerActivity.showV445HashVerifyAuto445Toggle() {
    val current = BiliClient.prefs.v445hashVerifyAuto445
    BiliClient.prefs.v445hashVerifyAuto445 = !current
    AppToast.show(this, "Hash Verify Auto445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445HeadPhoneAutoPause445Toggle() {
    val current = BiliClient.prefs.v445headPhoneAutoPause445
    BiliClient.prefs.v445headPhoneAutoPause445 = !current
    AppToast.show(this, "HeadPhone Auto Pause445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445HeartBeatInterval445Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v445heartBeatInterval445).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval445",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v445heartBeatInterval445 = value
        AppToast.show(this, "Heart Beat Interval445: $value")
    }
}

internal fun PlayerActivity.showV445HeatMonitorEnabled445Toggle() {
    val current = BiliClient.prefs.v445heatMonitorEnabled445
    BiliClient.prefs.v445heatMonitorEnabled445 = !current
    AppToast.show(this, "Heat Monitor Enabled445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445HideOnScroll445Toggle() {
    val current = BiliClient.prefs.v445hideOnScroll445
    BiliClient.prefs.v445hideOnScroll445 = !current
    AppToast.show(this, "Hide On Scroll445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445HoldToFastForward445Toggle() {
    val current = BiliClient.prefs.v445holdToFastForward445
    BiliClient.prefs.v445holdToFastForward445 = !current
    AppToast.show(this, "Hold To Fast Forward445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445HookAutoRegister445Toggle() {
    val current = BiliClient.prefs.v445hookAutoRegister445
    BiliClient.prefs.v445hookAutoRegister445 = !current
    AppToast.show(this, "Hook Auto Register445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445HotReloadEnabled445Toggle() {
    val current = BiliClient.prefs.v445hotReloadEnabled445
    BiliClient.prefs.v445hotReloadEnabled445 = !current
    AppToast.show(this, "Hot Reload Enabled445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV445HubAutoDiscover445Toggle() {
    val current = BiliClient.prefs.v445hubAutoDiscover445
    BiliClient.prefs.v445hubAutoDiscover445 = !current
    AppToast.show(this, "Hub Auto Discover445: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446GateAutoAuth446Toggle() {
    val current = BiliClient.prefs.v446gateAutoAuth446
    BiliClient.prefs.v446gateAutoAuth446 = !current
    AppToast.show(this, "Gate Auto Auth446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446GlobalSyncEnabled446Toggle() {
    val current = BiliClient.prefs.v446globalSyncEnabled446
    BiliClient.prefs.v446globalSyncEnabled446 = !current
    AppToast.show(this, "Global Sync Enabled446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446GroupAutoCreate446Toggle() {
    val current = BiliClient.prefs.v446groupAutoCreate446
    BiliClient.prefs.v446groupAutoCreate446 = !current
    AppToast.show(this, "Group Auto Create446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446GrowShrinkEnabled446Toggle() {
    val current = BiliClient.prefs.v446growShrinkEnabled446
    BiliClient.prefs.v446growShrinkEnabled446 = !current
    AppToast.show(this, "Grow Shrink Enabled446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446GuideAutoShow446Toggle() {
    val current = BiliClient.prefs.v446guideAutoShow446
    BiliClient.prefs.v446guideAutoShow446 = !current
    AppToast.show(this, "Guide Auto Show446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446HangDetectionMs446Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v446hangDetectionMs446).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms446",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v446hangDetectionMs446 = value
        AppToast.show(this, "Hang Detection Ms446: $value")
    }
}

internal fun PlayerActivity.showV446HashVerifyAuto446Toggle() {
    val current = BiliClient.prefs.v446hashVerifyAuto446
    BiliClient.prefs.v446hashVerifyAuto446 = !current
    AppToast.show(this, "Hash Verify Auto446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446HeadPhoneAutoPause446Toggle() {
    val current = BiliClient.prefs.v446headPhoneAutoPause446
    BiliClient.prefs.v446headPhoneAutoPause446 = !current
    AppToast.show(this, "HeadPhone Auto Pause446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446HeartBeatInterval446Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v446heartBeatInterval446).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval446",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v446heartBeatInterval446 = value
        AppToast.show(this, "Heart Beat Interval446: $value")
    }
}

internal fun PlayerActivity.showV446HeatMonitorEnabled446Toggle() {
    val current = BiliClient.prefs.v446heatMonitorEnabled446
    BiliClient.prefs.v446heatMonitorEnabled446 = !current
    AppToast.show(this, "Heat Monitor Enabled446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446HideOnScroll446Toggle() {
    val current = BiliClient.prefs.v446hideOnScroll446
    BiliClient.prefs.v446hideOnScroll446 = !current
    AppToast.show(this, "Hide On Scroll446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446HoldToFastForward446Toggle() {
    val current = BiliClient.prefs.v446holdToFastForward446
    BiliClient.prefs.v446holdToFastForward446 = !current
    AppToast.show(this, "Hold To Fast Forward446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446HookAutoRegister446Toggle() {
    val current = BiliClient.prefs.v446hookAutoRegister446
    BiliClient.prefs.v446hookAutoRegister446 = !current
    AppToast.show(this, "Hook Auto Register446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446HotReloadEnabled446Toggle() {
    val current = BiliClient.prefs.v446hotReloadEnabled446
    BiliClient.prefs.v446hotReloadEnabled446 = !current
    AppToast.show(this, "Hot Reload Enabled446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV446HubAutoDiscover446Toggle() {
    val current = BiliClient.prefs.v446hubAutoDiscover446
    BiliClient.prefs.v446hubAutoDiscover446 = !current
    AppToast.show(this, "Hub Auto Discover446: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447GateAutoAuth447Toggle() {
    val current = BiliClient.prefs.v447gateAutoAuth447
    BiliClient.prefs.v447gateAutoAuth447 = !current
    AppToast.show(this, "Gate Auto Auth447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447GlobalSyncEnabled447Toggle() {
    val current = BiliClient.prefs.v447globalSyncEnabled447
    BiliClient.prefs.v447globalSyncEnabled447 = !current
    AppToast.show(this, "Global Sync Enabled447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447GroupAutoCreate447Toggle() {
    val current = BiliClient.prefs.v447groupAutoCreate447
    BiliClient.prefs.v447groupAutoCreate447 = !current
    AppToast.show(this, "Group Auto Create447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447GrowShrinkEnabled447Toggle() {
    val current = BiliClient.prefs.v447growShrinkEnabled447
    BiliClient.prefs.v447growShrinkEnabled447 = !current
    AppToast.show(this, "Grow Shrink Enabled447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447GuideAutoShow447Toggle() {
    val current = BiliClient.prefs.v447guideAutoShow447
    BiliClient.prefs.v447guideAutoShow447 = !current
    AppToast.show(this, "Guide Auto Show447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447HangDetectionMs447Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v447hangDetectionMs447).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms447",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v447hangDetectionMs447 = value
        AppToast.show(this, "Hang Detection Ms447: $value")
    }
}

internal fun PlayerActivity.showV447HashVerifyAuto447Toggle() {
    val current = BiliClient.prefs.v447hashVerifyAuto447
    BiliClient.prefs.v447hashVerifyAuto447 = !current
    AppToast.show(this, "Hash Verify Auto447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447HeadPhoneAutoPause447Toggle() {
    val current = BiliClient.prefs.v447headPhoneAutoPause447
    BiliClient.prefs.v447headPhoneAutoPause447 = !current
    AppToast.show(this, "HeadPhone Auto Pause447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447HeartBeatInterval447Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v447heartBeatInterval447).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval447",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v447heartBeatInterval447 = value
        AppToast.show(this, "Heart Beat Interval447: $value")
    }
}

internal fun PlayerActivity.showV447HeatMonitorEnabled447Toggle() {
    val current = BiliClient.prefs.v447heatMonitorEnabled447
    BiliClient.prefs.v447heatMonitorEnabled447 = !current
    AppToast.show(this, "Heat Monitor Enabled447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447HideOnScroll447Toggle() {
    val current = BiliClient.prefs.v447hideOnScroll447
    BiliClient.prefs.v447hideOnScroll447 = !current
    AppToast.show(this, "Hide On Scroll447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447HoldToFastForward447Toggle() {
    val current = BiliClient.prefs.v447holdToFastForward447
    BiliClient.prefs.v447holdToFastForward447 = !current
    AppToast.show(this, "Hold To Fast Forward447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447HookAutoRegister447Toggle() {
    val current = BiliClient.prefs.v447hookAutoRegister447
    BiliClient.prefs.v447hookAutoRegister447 = !current
    AppToast.show(this, "Hook Auto Register447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447HotReloadEnabled447Toggle() {
    val current = BiliClient.prefs.v447hotReloadEnabled447
    BiliClient.prefs.v447hotReloadEnabled447 = !current
    AppToast.show(this, "Hot Reload Enabled447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV447HubAutoDiscover447Toggle() {
    val current = BiliClient.prefs.v447hubAutoDiscover447
    BiliClient.prefs.v447hubAutoDiscover447 = !current
    AppToast.show(this, "Hub Auto Discover447: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448GateAutoAuth448Toggle() {
    val current = BiliClient.prefs.v448gateAutoAuth448
    BiliClient.prefs.v448gateAutoAuth448 = !current
    AppToast.show(this, "Gate Auto Auth448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448GlobalSyncEnabled448Toggle() {
    val current = BiliClient.prefs.v448globalSyncEnabled448
    BiliClient.prefs.v448globalSyncEnabled448 = !current
    AppToast.show(this, "Global Sync Enabled448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448GroupAutoCreate448Toggle() {
    val current = BiliClient.prefs.v448groupAutoCreate448
    BiliClient.prefs.v448groupAutoCreate448 = !current
    AppToast.show(this, "Group Auto Create448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448GrowShrinkEnabled448Toggle() {
    val current = BiliClient.prefs.v448growShrinkEnabled448
    BiliClient.prefs.v448growShrinkEnabled448 = !current
    AppToast.show(this, "Grow Shrink Enabled448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448GuideAutoShow448Toggle() {
    val current = BiliClient.prefs.v448guideAutoShow448
    BiliClient.prefs.v448guideAutoShow448 = !current
    AppToast.show(this, "Guide Auto Show448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448HangDetectionMs448Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v448hangDetectionMs448).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms448",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v448hangDetectionMs448 = value
        AppToast.show(this, "Hang Detection Ms448: $value")
    }
}

internal fun PlayerActivity.showV448HashVerifyAuto448Toggle() {
    val current = BiliClient.prefs.v448hashVerifyAuto448
    BiliClient.prefs.v448hashVerifyAuto448 = !current
    AppToast.show(this, "Hash Verify Auto448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448HeadPhoneAutoPause448Toggle() {
    val current = BiliClient.prefs.v448headPhoneAutoPause448
    BiliClient.prefs.v448headPhoneAutoPause448 = !current
    AppToast.show(this, "HeadPhone Auto Pause448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448HeartBeatInterval448Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v448heartBeatInterval448).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval448",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v448heartBeatInterval448 = value
        AppToast.show(this, "Heart Beat Interval448: $value")
    }
}

internal fun PlayerActivity.showV448HeatMonitorEnabled448Toggle() {
    val current = BiliClient.prefs.v448heatMonitorEnabled448
    BiliClient.prefs.v448heatMonitorEnabled448 = !current
    AppToast.show(this, "Heat Monitor Enabled448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448HideOnScroll448Toggle() {
    val current = BiliClient.prefs.v448hideOnScroll448
    BiliClient.prefs.v448hideOnScroll448 = !current
    AppToast.show(this, "Hide On Scroll448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448HoldToFastForward448Toggle() {
    val current = BiliClient.prefs.v448holdToFastForward448
    BiliClient.prefs.v448holdToFastForward448 = !current
    AppToast.show(this, "Hold To Fast Forward448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448HookAutoRegister448Toggle() {
    val current = BiliClient.prefs.v448hookAutoRegister448
    BiliClient.prefs.v448hookAutoRegister448 = !current
    AppToast.show(this, "Hook Auto Register448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448HotReloadEnabled448Toggle() {
    val current = BiliClient.prefs.v448hotReloadEnabled448
    BiliClient.prefs.v448hotReloadEnabled448 = !current
    AppToast.show(this, "Hot Reload Enabled448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV448HubAutoDiscover448Toggle() {
    val current = BiliClient.prefs.v448hubAutoDiscover448
    BiliClient.prefs.v448hubAutoDiscover448 = !current
    AppToast.show(this, "Hub Auto Discover448: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449GateAutoAuth449Toggle() {
    val current = BiliClient.prefs.v449gateAutoAuth449
    BiliClient.prefs.v449gateAutoAuth449 = !current
    AppToast.show(this, "Gate Auto Auth449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449GlobalSyncEnabled449Toggle() {
    val current = BiliClient.prefs.v449globalSyncEnabled449
    BiliClient.prefs.v449globalSyncEnabled449 = !current
    AppToast.show(this, "Global Sync Enabled449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449GroupAutoCreate449Toggle() {
    val current = BiliClient.prefs.v449groupAutoCreate449
    BiliClient.prefs.v449groupAutoCreate449 = !current
    AppToast.show(this, "Group Auto Create449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449GrowShrinkEnabled449Toggle() {
    val current = BiliClient.prefs.v449growShrinkEnabled449
    BiliClient.prefs.v449growShrinkEnabled449 = !current
    AppToast.show(this, "Grow Shrink Enabled449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449GuideAutoShow449Toggle() {
    val current = BiliClient.prefs.v449guideAutoShow449
    BiliClient.prefs.v449guideAutoShow449 = !current
    AppToast.show(this, "Guide Auto Show449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449HangDetectionMs449Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v449hangDetectionMs449).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Hang Detection Ms449",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v449hangDetectionMs449 = value
        AppToast.show(this, "Hang Detection Ms449: $value")
    }
}

internal fun PlayerActivity.showV449HashVerifyAuto449Toggle() {
    val current = BiliClient.prefs.v449hashVerifyAuto449
    BiliClient.prefs.v449hashVerifyAuto449 = !current
    AppToast.show(this, "Hash Verify Auto449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449HeadPhoneAutoPause449Toggle() {
    val current = BiliClient.prefs.v449headPhoneAutoPause449
    BiliClient.prefs.v449headPhoneAutoPause449 = !current
    AppToast.show(this, "HeadPhone Auto Pause449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449HeartBeatInterval449Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v449heartBeatInterval449).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Heart Beat Interval449",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v449heartBeatInterval449 = value
        AppToast.show(this, "Heart Beat Interval449: $value")
    }
}

internal fun PlayerActivity.showV449HeatMonitorEnabled449Toggle() {
    val current = BiliClient.prefs.v449heatMonitorEnabled449
    BiliClient.prefs.v449heatMonitorEnabled449 = !current
    AppToast.show(this, "Heat Monitor Enabled449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449HideOnScroll449Toggle() {
    val current = BiliClient.prefs.v449hideOnScroll449
    BiliClient.prefs.v449hideOnScroll449 = !current
    AppToast.show(this, "Hide On Scroll449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449HoldToFastForward449Toggle() {
    val current = BiliClient.prefs.v449holdToFastForward449
    BiliClient.prefs.v449holdToFastForward449 = !current
    AppToast.show(this, "Hold To Fast Forward449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449HookAutoRegister449Toggle() {
    val current = BiliClient.prefs.v449hookAutoRegister449
    BiliClient.prefs.v449hookAutoRegister449 = !current
    AppToast.show(this, "Hook Auto Register449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449HotReloadEnabled449Toggle() {
    val current = BiliClient.prefs.v449hotReloadEnabled449
    BiliClient.prefs.v449hotReloadEnabled449 = !current
    AppToast.show(this, "Hot Reload Enabled449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV449HubAutoDiscover449Toggle() {
    val current = BiliClient.prefs.v449hubAutoDiscover449
    BiliClient.prefs.v449hubAutoDiscover449 = !current
    AppToast.show(this, "Hub Auto Discover449: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV450GateAutoAuth450Toggle() {
    val current = BiliClient.prefs.v450gateAutoAuth450
    BiliClient.prefs.v450gateAutoAuth450 = !current
    AppToast.show(this, "Gate Auto Auth450: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV450GlobalSyncEnabled450Toggle() {
    val current = BiliClient.prefs.v450globalSyncEnabled450
    BiliClient.prefs.v450globalSyncEnabled450 = !current
    AppToast.show(this, "Global Sync Enabled450: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV450GroupAutoCreate450Toggle() {
    val current = BiliClient.prefs.v450groupAutoCreate450
    BiliClient.prefs.v450groupAutoCreate450 = !current
    AppToast.show(this, "Group Auto Create450: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV450GrowShrinkEnabled450Toggle() {
    val current = BiliClient.prefs.v450growShrinkEnabled450
    BiliClient.prefs.v450growShrinkEnabled450 = !current
    AppToast.show(this, "Grow Shrink Enabled450: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV450GuideAutoShow450Toggle() {
    val current = BiliClient.prefs.v450guideAutoShow450
    BiliClient.prefs.v450guideAutoShow450 = !current
    AppToast.show(this, "Guide Auto Show450: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV450HashVerifyAuto450Toggle() {
    val current = BiliClient.prefs.v450hashVerifyAuto450
    BiliClient.prefs.v450hashVerifyAuto450 = !current
    AppToast.show(this, "Hash Verify Auto450: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV450HeadPhoneAutoPause450Toggle() {
    val current = BiliClient.prefs.v450headPhoneAutoPause450
    BiliClient.prefs.v450headPhoneAutoPause450 = !current
    AppToast.show(this, "HeadPhone Auto Pause450: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV450HeatMonitorEnabled450Toggle() {
    val current = BiliClient.prefs.v450heatMonitorEnabled450
    BiliClient.prefs.v450heatMonitorEnabled450 = !current
    AppToast.show(this, "Heat Monitor Enabled450: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV450HideOnScroll450Toggle() {
    val current = BiliClient.prefs.v450hideOnScroll450
    BiliClient.prefs.v450hideOnScroll450 = !current
    AppToast.show(this, "Hide On Scroll450: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV450HoldToFastForward450Toggle() {
    val current = BiliClient.prefs.v450holdToFastForward450
    BiliClient.prefs.v450holdToFastForward450 = !current
    AppToast.show(this, "Hold To Fast Forward450: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV450HookAutoRegister450Toggle() {
    val current = BiliClient.prefs.v450hookAutoRegister450
    BiliClient.prefs.v450hookAutoRegister450 = !current
    AppToast.show(this, "Hook Auto Register450: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV450HotReloadEnabled450Toggle() {
    val current = BiliClient.prefs.v450hotReloadEnabled450
    BiliClient.prefs.v450hotReloadEnabled450 = !current
    AppToast.show(this, "Hot Reload Enabled450: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV450HubAutoDiscover450Toggle() {
    val current = BiliClient.prefs.v450hubAutoDiscover450
    BiliClient.prefs.v450hubAutoDiscover450 = !current
    AppToast.show(this, "Hub Auto Discover450: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451HybridModeEnabled451Toggle() {
    val current = BiliClient.prefs.v451hybridModeEnabled451
    BiliClient.prefs.v451hybridModeEnabled451 = !current
    AppToast.show(this, "Hybrid Mode Enabled451: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV451IdleScreenSaver451Toggle() {
    val current = BiliClient.prefs.v451idleScreenSaver451
    BiliClient.prefs.v451idleScreenSaver451 = !current
    AppToast.show(this, "Idle Screen Saver451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451ImportAutoMerge451Toggle() {
    val current = BiliClient.prefs.v451importAutoMerge451
    BiliClient.prefs.v451importAutoMerge451 = !current
    AppToast.show(this, "Import Auto Merge451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451IndexAutoRebuild451Toggle() {
    val current = BiliClient.prefs.v451indexAutoRebuild451
    BiliClient.prefs.v451indexAutoRebuild451 = !current
    AppToast.show(this, "Index Auto Rebuild451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451InfoPanelAutoShow451Toggle() {
    val current = BiliClient.prefs.v451infoPanelAutoShow451
    BiliClient.prefs.v451infoPanelAutoShow451 = !current
    AppToast.show(this, "Info Panel Auto Show451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451InlineSubtitle451Toggle() {
    val current = BiliClient.prefs.v451inlineSubtitle451
    BiliClient.prefs.v451inlineSubtitle451 = !current
    AppToast.show(this, "Inline Subtitle451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451InnerLoopEnabled451Toggle() {
    val current = BiliClient.prefs.v451innerLoopEnabled451
    BiliClient.prefs.v451innerLoopEnabled451 = !current
    AppToast.show(this, "Inner Loop Enabled451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451InputAutoFocus451Toggle() {
    val current = BiliClient.prefs.v451inputAutoFocus451
    BiliClient.prefs.v451inputAutoFocus451 = !current
    AppToast.show(this, "Input Auto Focus451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451InsertAdSkip451Toggle() {
    val current = BiliClient.prefs.v451insertAdSkip451
    BiliClient.prefs.v451insertAdSkip451 = !current
    AppToast.show(this, "Insert Ad Skip451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451InstanceAutoSwitch451Toggle() {
    val current = BiliClient.prefs.v451instanceAutoSwitch451
    BiliClient.prefs.v451instanceAutoSwitch451 = !current
    AppToast.show(this, "Instance Auto Switch451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451InternalLinkOpen451Toggle() {
    val current = BiliClient.prefs.v451internalLinkOpen451
    BiliClient.prefs.v451internalLinkOpen451 = !current
    AppToast.show(this, "Internal Link Open451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451ItemAutoHighlight451Toggle() {
    val current = BiliClient.prefs.v451itemAutoHighlight451
    BiliClient.prefs.v451itemAutoHighlight451 = !current
    AppToast.show(this, "Item Auto Highlight451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451JoinRoomAuto451Toggle() {
    val current = BiliClient.prefs.v451joinRoomAuto451
    BiliClient.prefs.v451joinRoomAuto451 = !current
    AppToast.show(this, "Join Room Auto451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV451JumpToTimestamp451Toggle() {
    val current = BiliClient.prefs.v451jumpToTimestamp451
    BiliClient.prefs.v451jumpToTimestamp451 = !current
    AppToast.show(this, "Jump To Timestamp451: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452HybridModeEnabled452Toggle() {
    val current = BiliClient.prefs.v452hybridModeEnabled452
    BiliClient.prefs.v452hybridModeEnabled452 = !current
    AppToast.show(this, "Hybrid Mode Enabled452: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV452IdleScreenSaver452Toggle() {
    val current = BiliClient.prefs.v452idleScreenSaver452
    BiliClient.prefs.v452idleScreenSaver452 = !current
    AppToast.show(this, "Idle Screen Saver452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452ImportAutoMerge452Toggle() {
    val current = BiliClient.prefs.v452importAutoMerge452
    BiliClient.prefs.v452importAutoMerge452 = !current
    AppToast.show(this, "Import Auto Merge452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452IndexAutoRebuild452Toggle() {
    val current = BiliClient.prefs.v452indexAutoRebuild452
    BiliClient.prefs.v452indexAutoRebuild452 = !current
    AppToast.show(this, "Index Auto Rebuild452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452InfoPanelAutoShow452Toggle() {
    val current = BiliClient.prefs.v452infoPanelAutoShow452
    BiliClient.prefs.v452infoPanelAutoShow452 = !current
    AppToast.show(this, "Info Panel Auto Show452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452InlineSubtitle452Toggle() {
    val current = BiliClient.prefs.v452inlineSubtitle452
    BiliClient.prefs.v452inlineSubtitle452 = !current
    AppToast.show(this, "Inline Subtitle452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452InnerLoopEnabled452Toggle() {
    val current = BiliClient.prefs.v452innerLoopEnabled452
    BiliClient.prefs.v452innerLoopEnabled452 = !current
    AppToast.show(this, "Inner Loop Enabled452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452InputAutoFocus452Toggle() {
    val current = BiliClient.prefs.v452inputAutoFocus452
    BiliClient.prefs.v452inputAutoFocus452 = !current
    AppToast.show(this, "Input Auto Focus452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452InsertAdSkip452Toggle() {
    val current = BiliClient.prefs.v452insertAdSkip452
    BiliClient.prefs.v452insertAdSkip452 = !current
    AppToast.show(this, "Insert Ad Skip452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452InstanceAutoSwitch452Toggle() {
    val current = BiliClient.prefs.v452instanceAutoSwitch452
    BiliClient.prefs.v452instanceAutoSwitch452 = !current
    AppToast.show(this, "Instance Auto Switch452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452InternalLinkOpen452Toggle() {
    val current = BiliClient.prefs.v452internalLinkOpen452
    BiliClient.prefs.v452internalLinkOpen452 = !current
    AppToast.show(this, "Internal Link Open452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452ItemAutoHighlight452Toggle() {
    val current = BiliClient.prefs.v452itemAutoHighlight452
    BiliClient.prefs.v452itemAutoHighlight452 = !current
    AppToast.show(this, "Item Auto Highlight452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452JoinRoomAuto452Toggle() {
    val current = BiliClient.prefs.v452joinRoomAuto452
    BiliClient.prefs.v452joinRoomAuto452 = !current
    AppToast.show(this, "Join Room Auto452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV452JumpToTimestamp452Toggle() {
    val current = BiliClient.prefs.v452jumpToTimestamp452
    BiliClient.prefs.v452jumpToTimestamp452 = !current
    AppToast.show(this, "Jump To Timestamp452: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453HybridModeEnabled453Toggle() {
    val current = BiliClient.prefs.v453hybridModeEnabled453
    BiliClient.prefs.v453hybridModeEnabled453 = !current
    AppToast.show(this, "Hybrid Mode Enabled453: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV453IdleScreenSaver453Toggle() {
    val current = BiliClient.prefs.v453idleScreenSaver453
    BiliClient.prefs.v453idleScreenSaver453 = !current
    AppToast.show(this, "Idle Screen Saver453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453ImportAutoMerge453Toggle() {
    val current = BiliClient.prefs.v453importAutoMerge453
    BiliClient.prefs.v453importAutoMerge453 = !current
    AppToast.show(this, "Import Auto Merge453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453IndexAutoRebuild453Toggle() {
    val current = BiliClient.prefs.v453indexAutoRebuild453
    BiliClient.prefs.v453indexAutoRebuild453 = !current
    AppToast.show(this, "Index Auto Rebuild453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453InfoPanelAutoShow453Toggle() {
    val current = BiliClient.prefs.v453infoPanelAutoShow453
    BiliClient.prefs.v453infoPanelAutoShow453 = !current
    AppToast.show(this, "Info Panel Auto Show453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453InlineSubtitle453Toggle() {
    val current = BiliClient.prefs.v453inlineSubtitle453
    BiliClient.prefs.v453inlineSubtitle453 = !current
    AppToast.show(this, "Inline Subtitle453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453InnerLoopEnabled453Toggle() {
    val current = BiliClient.prefs.v453innerLoopEnabled453
    BiliClient.prefs.v453innerLoopEnabled453 = !current
    AppToast.show(this, "Inner Loop Enabled453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453InputAutoFocus453Toggle() {
    val current = BiliClient.prefs.v453inputAutoFocus453
    BiliClient.prefs.v453inputAutoFocus453 = !current
    AppToast.show(this, "Input Auto Focus453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453InsertAdSkip453Toggle() {
    val current = BiliClient.prefs.v453insertAdSkip453
    BiliClient.prefs.v453insertAdSkip453 = !current
    AppToast.show(this, "Insert Ad Skip453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453InstanceAutoSwitch453Toggle() {
    val current = BiliClient.prefs.v453instanceAutoSwitch453
    BiliClient.prefs.v453instanceAutoSwitch453 = !current
    AppToast.show(this, "Instance Auto Switch453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453InternalLinkOpen453Toggle() {
    val current = BiliClient.prefs.v453internalLinkOpen453
    BiliClient.prefs.v453internalLinkOpen453 = !current
    AppToast.show(this, "Internal Link Open453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453ItemAutoHighlight453Toggle() {
    val current = BiliClient.prefs.v453itemAutoHighlight453
    BiliClient.prefs.v453itemAutoHighlight453 = !current
    AppToast.show(this, "Item Auto Highlight453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453JoinRoomAuto453Toggle() {
    val current = BiliClient.prefs.v453joinRoomAuto453
    BiliClient.prefs.v453joinRoomAuto453 = !current
    AppToast.show(this, "Join Room Auto453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV453JumpToTimestamp453Toggle() {
    val current = BiliClient.prefs.v453jumpToTimestamp453
    BiliClient.prefs.v453jumpToTimestamp453 = !current
    AppToast.show(this, "Jump To Timestamp453: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454HybridModeEnabled454Toggle() {
    val current = BiliClient.prefs.v454hybridModeEnabled454
    BiliClient.prefs.v454hybridModeEnabled454 = !current
    AppToast.show(this, "Hybrid Mode Enabled454: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV454IdleScreenSaver454Toggle() {
    val current = BiliClient.prefs.v454idleScreenSaver454
    BiliClient.prefs.v454idleScreenSaver454 = !current
    AppToast.show(this, "Idle Screen Saver454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454ImportAutoMerge454Toggle() {
    val current = BiliClient.prefs.v454importAutoMerge454
    BiliClient.prefs.v454importAutoMerge454 = !current
    AppToast.show(this, "Import Auto Merge454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454IndexAutoRebuild454Toggle() {
    val current = BiliClient.prefs.v454indexAutoRebuild454
    BiliClient.prefs.v454indexAutoRebuild454 = !current
    AppToast.show(this, "Index Auto Rebuild454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454InfoPanelAutoShow454Toggle() {
    val current = BiliClient.prefs.v454infoPanelAutoShow454
    BiliClient.prefs.v454infoPanelAutoShow454 = !current
    AppToast.show(this, "Info Panel Auto Show454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454InlineSubtitle454Toggle() {
    val current = BiliClient.prefs.v454inlineSubtitle454
    BiliClient.prefs.v454inlineSubtitle454 = !current
    AppToast.show(this, "Inline Subtitle454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454InnerLoopEnabled454Toggle() {
    val current = BiliClient.prefs.v454innerLoopEnabled454
    BiliClient.prefs.v454innerLoopEnabled454 = !current
    AppToast.show(this, "Inner Loop Enabled454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454InputAutoFocus454Toggle() {
    val current = BiliClient.prefs.v454inputAutoFocus454
    BiliClient.prefs.v454inputAutoFocus454 = !current
    AppToast.show(this, "Input Auto Focus454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454InsertAdSkip454Toggle() {
    val current = BiliClient.prefs.v454insertAdSkip454
    BiliClient.prefs.v454insertAdSkip454 = !current
    AppToast.show(this, "Insert Ad Skip454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454InstanceAutoSwitch454Toggle() {
    val current = BiliClient.prefs.v454instanceAutoSwitch454
    BiliClient.prefs.v454instanceAutoSwitch454 = !current
    AppToast.show(this, "Instance Auto Switch454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454InternalLinkOpen454Toggle() {
    val current = BiliClient.prefs.v454internalLinkOpen454
    BiliClient.prefs.v454internalLinkOpen454 = !current
    AppToast.show(this, "Internal Link Open454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454ItemAutoHighlight454Toggle() {
    val current = BiliClient.prefs.v454itemAutoHighlight454
    BiliClient.prefs.v454itemAutoHighlight454 = !current
    AppToast.show(this, "Item Auto Highlight454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454JoinRoomAuto454Toggle() {
    val current = BiliClient.prefs.v454joinRoomAuto454
    BiliClient.prefs.v454joinRoomAuto454 = !current
    AppToast.show(this, "Join Room Auto454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV454JumpToTimestamp454Toggle() {
    val current = BiliClient.prefs.v454jumpToTimestamp454
    BiliClient.prefs.v454jumpToTimestamp454 = !current
    AppToast.show(this, "Jump To Timestamp454: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV455HybridModeEnabled455Toggle() {
    val current = BiliClient.prefs.v455hybridModeEnabled455
    BiliClient.prefs.v455hybridModeEnabled455 = !current
    AppToast.show(this, "Hybrid Mode Enabled455: ${if (!current) "ON" else "OFF"}")
}

