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

// v609: Area Auto Detect609
internal fun PlayerActivity.showV609AreaAutoDetect609Toggle() {
    val current = BiliClient.prefs.v609areaAutoDetect609
    BiliClient.prefs.v609areaAutoDetect609 = !current
    AppToast.show(this, "Area Auto Detect609: ${if (!current) "ON" else "OFF"}")
}

// v609: Array Auto Sort609
internal fun PlayerActivity.showV609ArrayAutoSort609Toggle() {
    val current = BiliClient.prefs.v609arrayAutoSort609
    BiliClient.prefs.v609arrayAutoSort609 = !current
    AppToast.show(this, "Array Auto Sort609: ${if (!current) "ON" else "OFF"}")
}

// v610: Action Auto Repeat610
internal fun PlayerActivity.showV610ActionAutoRepeat610Toggle() {
    val current = BiliClient.prefs.v610actionAutoRepeat610
    BiliClient.prefs.v610actionAutoRepeat610 = !current
    AppToast.show(this, "Action Auto Repeat610: ${if (!current) "ON" else "OFF"}")
}

// v610: Adapter Auto Switch610
internal fun PlayerActivity.showV610AdapterAutoSwitch610Toggle() {
    val current = BiliClient.prefs.v610adapterAutoSwitch610
    BiliClient.prefs.v610adapterAutoSwitch610 = !current
    AppToast.show(this, "Adapter Auto Switch610: ${if (!current) "ON" else "OFF"}")
}

// v610: Agent Auto Connect610
internal fun PlayerActivity.showV610AgentAutoConnect610Toggle() {
    val current = BiliClient.prefs.v610agentAutoConnect610
    BiliClient.prefs.v610agentAutoConnect610 = !current
    AppToast.show(this, "Agent Auto Connect610: ${if (!current) "ON" else "OFF"}")
}

// v610: Alias Auto Resolve610
internal fun PlayerActivity.showV610AliasAutoResolve610Toggle() {
    val current = BiliClient.prefs.v610aliasAutoResolve610
    BiliClient.prefs.v610aliasAutoResolve610 = !current
    AppToast.show(this, "Alias Auto Resolve610: ${if (!current) "ON" else "OFF"}")
}

// v610: Align Auto Center610
internal fun PlayerActivity.showV610AlignAutoCenter610Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v610alignAutoCenter610).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center610",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v610alignAutoCenter610 = value
        AppToast.show(this, "Align Auto Center610: $value")
    }
}

// v610: Alive Auto Keep610
internal fun PlayerActivity.showV610AliveAutoKeep610Toggle() {
    val current = BiliClient.prefs.v610aliveAutoKeep610
    BiliClient.prefs.v610aliveAutoKeep610 = !current
    AppToast.show(this, "Alive Auto Keep610: ${if (!current) "ON" else "OFF"}")
}

// v610: Alpha Auto Fade610
internal fun PlayerActivity.showV610AlphaAutoFade610Toggle() {
    val current = BiliClient.prefs.v610alphaAutoFade610
    BiliClient.prefs.v610alphaAutoFade610 = !current
    AppToast.show(this, "Alpha Auto Fade610: ${if (!current) "ON" else "OFF"}")
}

// v610: Ambient Auto Light610
internal fun PlayerActivity.showV610AmbientAutoLight610Toggle() {
    val current = BiliClient.prefs.v610ambientAutoLight610
    BiliClient.prefs.v610ambientAutoLight610 = !current
    AppToast.show(this, "Ambient Auto Light610: ${if (!current) "ON" else "OFF"}")
}

// v610: Amount Auto Limit610
internal fun PlayerActivity.showV610AmountAutoLimit610Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v610amountAutoLimit610).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit610",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v610amountAutoLimit610 = value
        AppToast.show(this, "Amount Auto Limit610: $value")
    }
}

// v610: Angle Auto Rotate610
internal fun PlayerActivity.showV610AngleAutoRotate610Toggle() {
    val current = BiliClient.prefs.v610angleAutoRotate610
    BiliClient.prefs.v610angleAutoRotate610 = !current
    AppToast.show(this, "Angle Auto Rotate610: ${if (!current) "ON" else "OFF"}")
}

// v610: Answer Auto Reply610
internal fun PlayerActivity.showV610AnswerAutoReply610Toggle() {
    val current = BiliClient.prefs.v610answerAutoReply610
    BiliClient.prefs.v610answerAutoReply610 = !current
    AppToast.show(this, "Answer Auto Reply610: ${if (!current) "ON" else "OFF"}")
}

// v610: API Auto Call610
internal fun PlayerActivity.showV610ApiAutoCall610Toggle() {
    val current = BiliClient.prefs.v610apiAutoCall610
    BiliClient.prefs.v610apiAutoCall610 = !current
    AppToast.show(this, "API Auto Call610: ${if (!current) "ON" else "OFF"}")
}

// v610: Archive Auto Save610
internal fun PlayerActivity.showV610ArchiveAutoSave610Toggle() {
    val current = BiliClient.prefs.v610archiveAutoSave610
    BiliClient.prefs.v610archiveAutoSave610 = !current
    AppToast.show(this, "Archive Auto Save610: ${if (!current) "ON" else "OFF"}")
}

// v610: Area Auto Detect610
internal fun PlayerActivity.showV610AreaAutoDetect610Toggle() {
    val current = BiliClient.prefs.v610areaAutoDetect610
    BiliClient.prefs.v610areaAutoDetect610 = !current
    AppToast.show(this, "Area Auto Detect610: ${if (!current) "ON" else "OFF"}")
}

// v610: Array Auto Sort610
internal fun PlayerActivity.showV610ArrayAutoSort610Toggle() {
    val current = BiliClient.prefs.v610arrayAutoSort610
    BiliClient.prefs.v610arrayAutoSort610 = !current
    AppToast.show(this, "Array Auto Sort610: ${if (!current) "ON" else "OFF"}")
}

// v611: Arrow Auto Navigate611
internal fun PlayerActivity.showV611ArrowAutoNavigate611Toggle() {
    val current = BiliClient.prefs.v611arrowAutoNavigate611
    BiliClient.prefs.v611arrowAutoNavigate611 = !current
    AppToast.show(this, "Arrow Auto Navigate611: ${if (!current) "ON" else "OFF"}")
}

// v611: Asset Auto Load611
internal fun PlayerActivity.showV611AssetAutoLoad611Toggle() {
    val current = BiliClient.prefs.v611assetAutoLoad611
    BiliClient.prefs.v611assetAutoLoad611 = !current
    AppToast.show(this, "Asset Auto Load611: ${if (!current) "ON" else "OFF"}")
}

// v611: Assign Auto Task611
internal fun PlayerActivity.showV611AssignAutoTask611Toggle() {
    val current = BiliClient.prefs.v611assignAutoTask611
    BiliClient.prefs.v611assignAutoTask611 = !current
    AppToast.show(this, "Assign Auto Task611: ${if (!current) "ON" else "OFF"}")
}

// v611: Async Auto Execute611
internal fun PlayerActivity.showV611AsyncAutoExecute611Toggle() {
    val current = BiliClient.prefs.v611asyncAutoExecute611
    BiliClient.prefs.v611asyncAutoExecute611 = !current
    AppToast.show(this, "Async Auto Execute611: ${if (!current) "ON" else "OFF"}")
}

// v611: Attack Auto Block611
internal fun PlayerActivity.showV611AttackAutoBlock611Toggle() {
    val current = BiliClient.prefs.v611attackAutoBlock611
    BiliClient.prefs.v611attackAutoBlock611 = !current
    AppToast.show(this, "Attack Auto Block611: ${if (!current) "ON" else "OFF"}")
}

// v611: Avatar Auto Update611
internal fun PlayerActivity.showV611AvatarAutoUpdate611Toggle() {
    val current = BiliClient.prefs.v611avatarAutoUpdate611
    BiliClient.prefs.v611avatarAutoUpdate611 = !current
    AppToast.show(this, "Avatar Auto Update611: ${if (!current) "ON" else "OFF"}")
}

// v611: Back Auto Save611
internal fun PlayerActivity.showV611BackAutoSave611Toggle() {
    val current = BiliClient.prefs.v611backAutoSave611
    BiliClient.prefs.v611backAutoSave611 = !current
    AppToast.show(this, "Back Auto Save611: ${if (!current) "ON" else "OFF"}")
}

// v611: Balance Auto Load611
internal fun PlayerActivity.showV611BalanceAutoLoad611Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v611balanceAutoLoad611).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load611",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v611balanceAutoLoad611 = value
        AppToast.show(this, "Balance Auto Load611: $value")
    }
}

// v611: Band Auto Width611
internal fun PlayerActivity.showV611BandAutoWidth611Toggle() {
    val current = BiliClient.prefs.v611bandAutoWidth611
    BiliClient.prefs.v611bandAutoWidth611 = !current
    AppToast.show(this, "Band Auto Width611: ${if (!current) "ON" else "OFF"}")
}

// v611: Bar Auto Scroll611
internal fun PlayerActivity.showV611BarAutoScroll611Toggle() {
    val current = BiliClient.prefs.v611barAutoScroll611
    BiliClient.prefs.v611barAutoScroll611 = !current
    AppToast.show(this, "Bar Auto Scroll611: ${if (!current) "ON" else "OFF"}")
}

// v611: Beacon Auto Ping611
internal fun PlayerActivity.showV611BeaconAutoPing611Toggle() {
    val current = BiliClient.prefs.v611beaconAutoPing611
    BiliClient.prefs.v611beaconAutoPing611 = !current
    AppToast.show(this, "Beacon Auto Ping611: ${if (!current) "ON" else "OFF"}")
}

// v611: Beam Auto Form611
internal fun PlayerActivity.showV611BeamAutoForm611Toggle() {
    val current = BiliClient.prefs.v611beamAutoForm611
    BiliClient.prefs.v611beamAutoForm611 = !current
    AppToast.show(this, "Beam Auto Form611: ${if (!current) "ON" else "OFF"}")
}

// v611: Before Auto Hook611
internal fun PlayerActivity.showV611BeforeAutoHook611Toggle() {
    val current = BiliClient.prefs.v611beforeAutoHook611
    BiliClient.prefs.v611beforeAutoHook611 = !current
    AppToast.show(this, "Before Auto Hook611: ${if (!current) "ON" else "OFF"}")
}

// v611: Begin Auto Init611
internal fun PlayerActivity.showV611BeginAutoInit611Toggle() {
    val current = BiliClient.prefs.v611beginAutoInit611
    BiliClient.prefs.v611beginAutoInit611 = !current
    AppToast.show(this, "Begin Auto Init611: ${if (!current) "ON" else "OFF"}")
}

// v611: Behavior Auto Track611
internal fun PlayerActivity.showV611BehaviorAutoTrack611Toggle() {
    val current = BiliClient.prefs.v611behaviorAutoTrack611
    BiliClient.prefs.v611behaviorAutoTrack611 = !current
    AppToast.show(this, "Behavior Auto Track611: ${if (!current) "ON" else "OFF"}")
}

// v612: Arrow Auto Navigate612
internal fun PlayerActivity.showV612ArrowAutoNavigate612Toggle() {
    val current = BiliClient.prefs.v612arrowAutoNavigate612
    BiliClient.prefs.v612arrowAutoNavigate612 = !current
    AppToast.show(this, "Arrow Auto Navigate612: ${if (!current) "ON" else "OFF"}")
}

// v612: Asset Auto Load612
internal fun PlayerActivity.showV612AssetAutoLoad612Toggle() {
    val current = BiliClient.prefs.v612assetAutoLoad612
    BiliClient.prefs.v612assetAutoLoad612 = !current
    AppToast.show(this, "Asset Auto Load612: ${if (!current) "ON" else "OFF"}")
}

// v612: Assign Auto Task612
internal fun PlayerActivity.showV612AssignAutoTask612Toggle() {
    val current = BiliClient.prefs.v612assignAutoTask612
    BiliClient.prefs.v612assignAutoTask612 = !current
    AppToast.show(this, "Assign Auto Task612: ${if (!current) "ON" else "OFF"}")
}

// v612: Async Auto Execute612
internal fun PlayerActivity.showV612AsyncAutoExecute612Toggle() {
    val current = BiliClient.prefs.v612asyncAutoExecute612
    BiliClient.prefs.v612asyncAutoExecute612 = !current
    AppToast.show(this, "Async Auto Execute612: ${if (!current) "ON" else "OFF"}")
}

// v612: Attack Auto Block612
internal fun PlayerActivity.showV612AttackAutoBlock612Toggle() {
    val current = BiliClient.prefs.v612attackAutoBlock612
    BiliClient.prefs.v612attackAutoBlock612 = !current
    AppToast.show(this, "Attack Auto Block612: ${if (!current) "ON" else "OFF"}")
}

// v612: Avatar Auto Update612
internal fun PlayerActivity.showV612AvatarAutoUpdate612Toggle() {
    val current = BiliClient.prefs.v612avatarAutoUpdate612
    BiliClient.prefs.v612avatarAutoUpdate612 = !current
    AppToast.show(this, "Avatar Auto Update612: ${if (!current) "ON" else "OFF"}")
}

// v612: Back Auto Save612
internal fun PlayerActivity.showV612BackAutoSave612Toggle() {
    val current = BiliClient.prefs.v612backAutoSave612
    BiliClient.prefs.v612backAutoSave612 = !current
    AppToast.show(this, "Back Auto Save612: ${if (!current) "ON" else "OFF"}")
}

// v612: Balance Auto Load612
internal fun PlayerActivity.showV612BalanceAutoLoad612Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v612balanceAutoLoad612).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load612",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v612balanceAutoLoad612 = value
        AppToast.show(this, "Balance Auto Load612: $value")
    }
}

// v612: Band Auto Width612
internal fun PlayerActivity.showV612BandAutoWidth612Toggle() {
    val current = BiliClient.prefs.v612bandAutoWidth612
    BiliClient.prefs.v612bandAutoWidth612 = !current
    AppToast.show(this, "Band Auto Width612: ${if (!current) "ON" else "OFF"}")
}

// v612: Bar Auto Scroll612
internal fun PlayerActivity.showV612BarAutoScroll612Toggle() {
    val current = BiliClient.prefs.v612barAutoScroll612
    BiliClient.prefs.v612barAutoScroll612 = !current
    AppToast.show(this, "Bar Auto Scroll612: ${if (!current) "ON" else "OFF"}")
}

// v612: Beacon Auto Ping612
internal fun PlayerActivity.showV612BeaconAutoPing612Toggle() {
    val current = BiliClient.prefs.v612beaconAutoPing612
    BiliClient.prefs.v612beaconAutoPing612 = !current
    AppToast.show(this, "Beacon Auto Ping612: ${if (!current) "ON" else "OFF"}")
}

// v612: Beam Auto Form612
internal fun PlayerActivity.showV612BeamAutoForm612Toggle() {
    val current = BiliClient.prefs.v612beamAutoForm612
    BiliClient.prefs.v612beamAutoForm612 = !current
    AppToast.show(this, "Beam Auto Form612: ${if (!current) "ON" else "OFF"}")
}

// v612: Before Auto Hook612
internal fun PlayerActivity.showV612BeforeAutoHook612Toggle() {
    val current = BiliClient.prefs.v612beforeAutoHook612
    BiliClient.prefs.v612beforeAutoHook612 = !current
    AppToast.show(this, "Before Auto Hook612: ${if (!current) "ON" else "OFF"}")
}

// v612: Begin Auto Init612
internal fun PlayerActivity.showV612BeginAutoInit612Toggle() {
    val current = BiliClient.prefs.v612beginAutoInit612
    BiliClient.prefs.v612beginAutoInit612 = !current
    AppToast.show(this, "Begin Auto Init612: ${if (!current) "ON" else "OFF"}")
}

// v612: Behavior Auto Track612
internal fun PlayerActivity.showV612BehaviorAutoTrack612Toggle() {
    val current = BiliClient.prefs.v612behaviorAutoTrack612
    BiliClient.prefs.v612behaviorAutoTrack612 = !current
    AppToast.show(this, "Behavior Auto Track612: ${if (!current) "ON" else "OFF"}")
}

// v613: Arrow Auto Navigate613
internal fun PlayerActivity.showV613ArrowAutoNavigate613Toggle() {
    val current = BiliClient.prefs.v613arrowAutoNavigate613
    BiliClient.prefs.v613arrowAutoNavigate613 = !current
    AppToast.show(this, "Arrow Auto Navigate613: ${if (!current) "ON" else "OFF"}")
}

// v613: Asset Auto Load613
internal fun PlayerActivity.showV613AssetAutoLoad613Toggle() {
    val current = BiliClient.prefs.v613assetAutoLoad613
    BiliClient.prefs.v613assetAutoLoad613 = !current
    AppToast.show(this, "Asset Auto Load613: ${if (!current) "ON" else "OFF"}")
}

// v613: Assign Auto Task613
internal fun PlayerActivity.showV613AssignAutoTask613Toggle() {
    val current = BiliClient.prefs.v613assignAutoTask613
    BiliClient.prefs.v613assignAutoTask613 = !current
    AppToast.show(this, "Assign Auto Task613: ${if (!current) "ON" else "OFF"}")
}

// v613: Async Auto Execute613
internal fun PlayerActivity.showV613AsyncAutoExecute613Toggle() {
    val current = BiliClient.prefs.v613asyncAutoExecute613
    BiliClient.prefs.v613asyncAutoExecute613 = !current
    AppToast.show(this, "Async Auto Execute613: ${if (!current) "ON" else "OFF"}")
}

// v613: Attack Auto Block613
internal fun PlayerActivity.showV613AttackAutoBlock613Toggle() {
    val current = BiliClient.prefs.v613attackAutoBlock613
    BiliClient.prefs.v613attackAutoBlock613 = !current
    AppToast.show(this, "Attack Auto Block613: ${if (!current) "ON" else "OFF"}")
}

// v613: Avatar Auto Update613
internal fun PlayerActivity.showV613AvatarAutoUpdate613Toggle() {
    val current = BiliClient.prefs.v613avatarAutoUpdate613
    BiliClient.prefs.v613avatarAutoUpdate613 = !current
    AppToast.show(this, "Avatar Auto Update613: ${if (!current) "ON" else "OFF"}")
}

// v613: Back Auto Save613
internal fun PlayerActivity.showV613BackAutoSave613Toggle() {
    val current = BiliClient.prefs.v613backAutoSave613
    BiliClient.prefs.v613backAutoSave613 = !current
    AppToast.show(this, "Back Auto Save613: ${if (!current) "ON" else "OFF"}")
}

// v613: Balance Auto Load613
internal fun PlayerActivity.showV613BalanceAutoLoad613Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v613balanceAutoLoad613).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load613",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v613balanceAutoLoad613 = value
        AppToast.show(this, "Balance Auto Load613: $value")
    }
}

// v613: Band Auto Width613
internal fun PlayerActivity.showV613BandAutoWidth613Toggle() {
    val current = BiliClient.prefs.v613bandAutoWidth613
    BiliClient.prefs.v613bandAutoWidth613 = !current
    AppToast.show(this, "Band Auto Width613: ${if (!current) "ON" else "OFF"}")
}

// v613: Bar Auto Scroll613
internal fun PlayerActivity.showV613BarAutoScroll613Toggle() {
    val current = BiliClient.prefs.v613barAutoScroll613
    BiliClient.prefs.v613barAutoScroll613 = !current
    AppToast.show(this, "Bar Auto Scroll613: ${if (!current) "ON" else "OFF"}")
}

// v613: Beacon Auto Ping613
internal fun PlayerActivity.showV613BeaconAutoPing613Toggle() {
    val current = BiliClient.prefs.v613beaconAutoPing613
    BiliClient.prefs.v613beaconAutoPing613 = !current
    AppToast.show(this, "Beacon Auto Ping613: ${if (!current) "ON" else "OFF"}")
}

// v613: Beam Auto Form613
internal fun PlayerActivity.showV613BeamAutoForm613Toggle() {
    val current = BiliClient.prefs.v613beamAutoForm613
    BiliClient.prefs.v613beamAutoForm613 = !current
    AppToast.show(this, "Beam Auto Form613: ${if (!current) "ON" else "OFF"}")
}

// v613: Before Auto Hook613
internal fun PlayerActivity.showV613BeforeAutoHook613Toggle() {
    val current = BiliClient.prefs.v613beforeAutoHook613
    BiliClient.prefs.v613beforeAutoHook613 = !current
    AppToast.show(this, "Before Auto Hook613: ${if (!current) "ON" else "OFF"}")
}

// v613: Begin Auto Init613
internal fun PlayerActivity.showV613BeginAutoInit613Toggle() {
    val current = BiliClient.prefs.v613beginAutoInit613
    BiliClient.prefs.v613beginAutoInit613 = !current
    AppToast.show(this, "Begin Auto Init613: ${if (!current) "ON" else "OFF"}")
}

// v613: Behavior Auto Track613
internal fun PlayerActivity.showV613BehaviorAutoTrack613Toggle() {
    val current = BiliClient.prefs.v613behaviorAutoTrack613
    BiliClient.prefs.v613behaviorAutoTrack613 = !current
    AppToast.show(this, "Behavior Auto Track613: ${if (!current) "ON" else "OFF"}")
}

// v614: Arrow Auto Navigate614
internal fun PlayerActivity.showV614ArrowAutoNavigate614Toggle() {
    val current = BiliClient.prefs.v614arrowAutoNavigate614
    BiliClient.prefs.v614arrowAutoNavigate614 = !current
    AppToast.show(this, "Arrow Auto Navigate614: ${if (!current) "ON" else "OFF"}")
}

// v614: Asset Auto Load614
internal fun PlayerActivity.showV614AssetAutoLoad614Toggle() {
    val current = BiliClient.prefs.v614assetAutoLoad614
    BiliClient.prefs.v614assetAutoLoad614 = !current
    AppToast.show(this, "Asset Auto Load614: ${if (!current) "ON" else "OFF"}")
}

// v614: Assign Auto Task614
internal fun PlayerActivity.showV614AssignAutoTask614Toggle() {
    val current = BiliClient.prefs.v614assignAutoTask614
    BiliClient.prefs.v614assignAutoTask614 = !current
    AppToast.show(this, "Assign Auto Task614: ${if (!current) "ON" else "OFF"}")
}

// v614: Async Auto Execute614
internal fun PlayerActivity.showV614AsyncAutoExecute614Toggle() {
    val current = BiliClient.prefs.v614asyncAutoExecute614
    BiliClient.prefs.v614asyncAutoExecute614 = !current
    AppToast.show(this, "Async Auto Execute614: ${if (!current) "ON" else "OFF"}")
}

// v614: Attack Auto Block614
internal fun PlayerActivity.showV614AttackAutoBlock614Toggle() {
    val current = BiliClient.prefs.v614attackAutoBlock614
    BiliClient.prefs.v614attackAutoBlock614 = !current
    AppToast.show(this, "Attack Auto Block614: ${if (!current) "ON" else "OFF"}")
}

// v614: Avatar Auto Update614
internal fun PlayerActivity.showV614AvatarAutoUpdate614Toggle() {
    val current = BiliClient.prefs.v614avatarAutoUpdate614
    BiliClient.prefs.v614avatarAutoUpdate614 = !current
    AppToast.show(this, "Avatar Auto Update614: ${if (!current) "ON" else "OFF"}")
}

// v614: Back Auto Save614
internal fun PlayerActivity.showV614BackAutoSave614Toggle() {
    val current = BiliClient.prefs.v614backAutoSave614
    BiliClient.prefs.v614backAutoSave614 = !current
    AppToast.show(this, "Back Auto Save614: ${if (!current) "ON" else "OFF"}")
}

// v614: Balance Auto Load614
internal fun PlayerActivity.showV614BalanceAutoLoad614Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v614balanceAutoLoad614).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load614",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v614balanceAutoLoad614 = value
        AppToast.show(this, "Balance Auto Load614: $value")
    }
}

// v614: Band Auto Width614
internal fun PlayerActivity.showV614BandAutoWidth614Toggle() {
    val current = BiliClient.prefs.v614bandAutoWidth614
    BiliClient.prefs.v614bandAutoWidth614 = !current
    AppToast.show(this, "Band Auto Width614: ${if (!current) "ON" else "OFF"}")
}

// v614: Bar Auto Scroll614
internal fun PlayerActivity.showV614BarAutoScroll614Toggle() {
    val current = BiliClient.prefs.v614barAutoScroll614
    BiliClient.prefs.v614barAutoScroll614 = !current
    AppToast.show(this, "Bar Auto Scroll614: ${if (!current) "ON" else "OFF"}")
}

// v614: Beacon Auto Ping614
internal fun PlayerActivity.showV614BeaconAutoPing614Toggle() {
    val current = BiliClient.prefs.v614beaconAutoPing614
    BiliClient.prefs.v614beaconAutoPing614 = !current
    AppToast.show(this, "Beacon Auto Ping614: ${if (!current) "ON" else "OFF"}")
}

// v614: Beam Auto Form614
internal fun PlayerActivity.showV614BeamAutoForm614Toggle() {
    val current = BiliClient.prefs.v614beamAutoForm614
    BiliClient.prefs.v614beamAutoForm614 = !current
    AppToast.show(this, "Beam Auto Form614: ${if (!current) "ON" else "OFF"}")
}

// v614: Before Auto Hook614
internal fun PlayerActivity.showV614BeforeAutoHook614Toggle() {
    val current = BiliClient.prefs.v614beforeAutoHook614
    BiliClient.prefs.v614beforeAutoHook614 = !current
    AppToast.show(this, "Before Auto Hook614: ${if (!current) "ON" else "OFF"}")
}

// v614: Begin Auto Init614
internal fun PlayerActivity.showV614BeginAutoInit614Toggle() {
    val current = BiliClient.prefs.v614beginAutoInit614
    BiliClient.prefs.v614beginAutoInit614 = !current
    AppToast.show(this, "Begin Auto Init614: ${if (!current) "ON" else "OFF"}")
}

// v614: Behavior Auto Track614
internal fun PlayerActivity.showV614BehaviorAutoTrack614Toggle() {
    val current = BiliClient.prefs.v614behaviorAutoTrack614
    BiliClient.prefs.v614behaviorAutoTrack614 = !current
    AppToast.show(this, "Behavior Auto Track614: ${if (!current) "ON" else "OFF"}")
}

// v615: Arrow Auto Navigate615
internal fun PlayerActivity.showV615ArrowAutoNavigate615Toggle() {
    val current = BiliClient.prefs.v615arrowAutoNavigate615
    BiliClient.prefs.v615arrowAutoNavigate615 = !current
    AppToast.show(this, "Arrow Auto Navigate615: ${if (!current) "ON" else "OFF"}")
}

// v615: Asset Auto Load615
internal fun PlayerActivity.showV615AssetAutoLoad615Toggle() {
    val current = BiliClient.prefs.v615assetAutoLoad615
    BiliClient.prefs.v615assetAutoLoad615 = !current
    AppToast.show(this, "Asset Auto Load615: ${if (!current) "ON" else "OFF"}")
}

// v615: Assign Auto Task615
internal fun PlayerActivity.showV615AssignAutoTask615Toggle() {
    val current = BiliClient.prefs.v615assignAutoTask615
    BiliClient.prefs.v615assignAutoTask615 = !current
    AppToast.show(this, "Assign Auto Task615: ${if (!current) "ON" else "OFF"}")
}

// v615: Async Auto Execute615
internal fun PlayerActivity.showV615AsyncAutoExecute615Toggle() {
    val current = BiliClient.prefs.v615asyncAutoExecute615
    BiliClient.prefs.v615asyncAutoExecute615 = !current
    AppToast.show(this, "Async Auto Execute615: ${if (!current) "ON" else "OFF"}")
}

// v615: Attack Auto Block615
internal fun PlayerActivity.showV615AttackAutoBlock615Toggle() {
    val current = BiliClient.prefs.v615attackAutoBlock615
    BiliClient.prefs.v615attackAutoBlock615 = !current
    AppToast.show(this, "Attack Auto Block615: ${if (!current) "ON" else "OFF"}")
}

// v615: Avatar Auto Update615
internal fun PlayerActivity.showV615AvatarAutoUpdate615Toggle() {
    val current = BiliClient.prefs.v615avatarAutoUpdate615
    BiliClient.prefs.v615avatarAutoUpdate615 = !current
    AppToast.show(this, "Avatar Auto Update615: ${if (!current) "ON" else "OFF"}")
}

// v615: Back Auto Save615
internal fun PlayerActivity.showV615BackAutoSave615Toggle() {
    val current = BiliClient.prefs.v615backAutoSave615
    BiliClient.prefs.v615backAutoSave615 = !current
    AppToast.show(this, "Back Auto Save615: ${if (!current) "ON" else "OFF"}")
}

// v615: Balance Auto Load615
internal fun PlayerActivity.showV615BalanceAutoLoad615Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v615balanceAutoLoad615).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load615",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v615balanceAutoLoad615 = value
        AppToast.show(this, "Balance Auto Load615: $value")
    }
}

// v615: Band Auto Width615
internal fun PlayerActivity.showV615BandAutoWidth615Toggle() {
    val current = BiliClient.prefs.v615bandAutoWidth615
    BiliClient.prefs.v615bandAutoWidth615 = !current
    AppToast.show(this, "Band Auto Width615: ${if (!current) "ON" else "OFF"}")
}

// v615: Bar Auto Scroll615
internal fun PlayerActivity.showV615BarAutoScroll615Toggle() {
    val current = BiliClient.prefs.v615barAutoScroll615
    BiliClient.prefs.v615barAutoScroll615 = !current
    AppToast.show(this, "Bar Auto Scroll615: ${if (!current) "ON" else "OFF"}")
}

// v615: Beacon Auto Ping615
internal fun PlayerActivity.showV615BeaconAutoPing615Toggle() {
    val current = BiliClient.prefs.v615beaconAutoPing615
    BiliClient.prefs.v615beaconAutoPing615 = !current
    AppToast.show(this, "Beacon Auto Ping615: ${if (!current) "ON" else "OFF"}")
}

// v615: Beam Auto Form615
internal fun PlayerActivity.showV615BeamAutoForm615Toggle() {
    val current = BiliClient.prefs.v615beamAutoForm615
    BiliClient.prefs.v615beamAutoForm615 = !current
    AppToast.show(this, "Beam Auto Form615: ${if (!current) "ON" else "OFF"}")
}

// v615: Before Auto Hook615
internal fun PlayerActivity.showV615BeforeAutoHook615Toggle() {
    val current = BiliClient.prefs.v615beforeAutoHook615
    BiliClient.prefs.v615beforeAutoHook615 = !current
    AppToast.show(this, "Before Auto Hook615: ${if (!current) "ON" else "OFF"}")
}

// v615: Begin Auto Init615
internal fun PlayerActivity.showV615BeginAutoInit615Toggle() {
    val current = BiliClient.prefs.v615beginAutoInit615
    BiliClient.prefs.v615beginAutoInit615 = !current
    AppToast.show(this, "Begin Auto Init615: ${if (!current) "ON" else "OFF"}")
}

// v615: Behavior Auto Track615
internal fun PlayerActivity.showV615BehaviorAutoTrack615Toggle() {
    val current = BiliClient.prefs.v615behaviorAutoTrack615
    BiliClient.prefs.v615behaviorAutoTrack615 = !current
    AppToast.show(this, "Behavior Auto Track615: ${if (!current) "ON" else "OFF"}")
}

// v616: Arrow Auto Navigate616
internal fun PlayerActivity.showV616ArrowAutoNavigate616Toggle() {
    val current = BiliClient.prefs.v616arrowAutoNavigate616
    BiliClient.prefs.v616arrowAutoNavigate616 = !current
    AppToast.show(this, "Arrow Auto Navigate616: ${if (!current) "ON" else "OFF"}")
}

// v616: Asset Auto Load616
internal fun PlayerActivity.showV616AssetAutoLoad616Toggle() {
    val current = BiliClient.prefs.v616assetAutoLoad616
    BiliClient.prefs.v616assetAutoLoad616 = !current
    AppToast.show(this, "Asset Auto Load616: ${if (!current) "ON" else "OFF"}")
}

// v616: Assign Auto Task616
internal fun PlayerActivity.showV616AssignAutoTask616Toggle() {
    val current = BiliClient.prefs.v616assignAutoTask616
    BiliClient.prefs.v616assignAutoTask616 = !current
    AppToast.show(this, "Assign Auto Task616: ${if (!current) "ON" else "OFF"}")
}

// v616: Async Auto Execute616
internal fun PlayerActivity.showV616AsyncAutoExecute616Toggle() {
    val current = BiliClient.prefs.v616asyncAutoExecute616
    BiliClient.prefs.v616asyncAutoExecute616 = !current
    AppToast.show(this, "Async Auto Execute616: ${if (!current) "ON" else "OFF"}")
}

// v616: Attack Auto Block616
internal fun PlayerActivity.showV616AttackAutoBlock616Toggle() {
    val current = BiliClient.prefs.v616attackAutoBlock616
    BiliClient.prefs.v616attackAutoBlock616 = !current
    AppToast.show(this, "Attack Auto Block616: ${if (!current) "ON" else "OFF"}")
}

// v616: Avatar Auto Update616
internal fun PlayerActivity.showV616AvatarAutoUpdate616Toggle() {
    val current = BiliClient.prefs.v616avatarAutoUpdate616
    BiliClient.prefs.v616avatarAutoUpdate616 = !current
    AppToast.show(this, "Avatar Auto Update616: ${if (!current) "ON" else "OFF"}")
}

// v616: Back Auto Save616
internal fun PlayerActivity.showV616BackAutoSave616Toggle() {
    val current = BiliClient.prefs.v616backAutoSave616
    BiliClient.prefs.v616backAutoSave616 = !current
    AppToast.show(this, "Back Auto Save616: ${if (!current) "ON" else "OFF"}")
}

// v616: Balance Auto Load616
internal fun PlayerActivity.showV616BalanceAutoLoad616Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v616balanceAutoLoad616).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load616",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v616balanceAutoLoad616 = value
        AppToast.show(this, "Balance Auto Load616: $value")
    }
}

// v616: Band Auto Width616
internal fun PlayerActivity.showV616BandAutoWidth616Toggle() {
    val current = BiliClient.prefs.v616bandAutoWidth616
    BiliClient.prefs.v616bandAutoWidth616 = !current
    AppToast.show(this, "Band Auto Width616: ${if (!current) "ON" else "OFF"}")
}

// v616: Bar Auto Scroll616
internal fun PlayerActivity.showV616BarAutoScroll616Toggle() {
    val current = BiliClient.prefs.v616barAutoScroll616
    BiliClient.prefs.v616barAutoScroll616 = !current
    AppToast.show(this, "Bar Auto Scroll616: ${if (!current) "ON" else "OFF"}")
}

// v616: Beacon Auto Ping616
internal fun PlayerActivity.showV616BeaconAutoPing616Toggle() {
    val current = BiliClient.prefs.v616beaconAutoPing616
    BiliClient.prefs.v616beaconAutoPing616 = !current
    AppToast.show(this, "Beacon Auto Ping616: ${if (!current) "ON" else "OFF"}")
}

// v616: Beam Auto Form616
internal fun PlayerActivity.showV616BeamAutoForm616Toggle() {
    val current = BiliClient.prefs.v616beamAutoForm616
    BiliClient.prefs.v616beamAutoForm616 = !current
    AppToast.show(this, "Beam Auto Form616: ${if (!current) "ON" else "OFF"}")
}

// v616: Before Auto Hook616
internal fun PlayerActivity.showV616BeforeAutoHook616Toggle() {
    val current = BiliClient.prefs.v616beforeAutoHook616
    BiliClient.prefs.v616beforeAutoHook616 = !current
    AppToast.show(this, "Before Auto Hook616: ${if (!current) "ON" else "OFF"}")
}

// v616: Begin Auto Init616
internal fun PlayerActivity.showV616BeginAutoInit616Toggle() {
    val current = BiliClient.prefs.v616beginAutoInit616
    BiliClient.prefs.v616beginAutoInit616 = !current
    AppToast.show(this, "Begin Auto Init616: ${if (!current) "ON" else "OFF"}")
}

// v616: Behavior Auto Track616
internal fun PlayerActivity.showV616BehaviorAutoTrack616Toggle() {
    val current = BiliClient.prefs.v616behaviorAutoTrack616
    BiliClient.prefs.v616behaviorAutoTrack616 = !current
    AppToast.show(this, "Behavior Auto Track616: ${if (!current) "ON" else "OFF"}")
}

// v617: Arrow Auto Navigate617
internal fun PlayerActivity.showV617ArrowAutoNavigate617Toggle() {
    val current = BiliClient.prefs.v617arrowAutoNavigate617
    BiliClient.prefs.v617arrowAutoNavigate617 = !current
    AppToast.show(this, "Arrow Auto Navigate617: ${if (!current) "ON" else "OFF"}")
}

// v617: Asset Auto Load617
internal fun PlayerActivity.showV617AssetAutoLoad617Toggle() {
    val current = BiliClient.prefs.v617assetAutoLoad617
    BiliClient.prefs.v617assetAutoLoad617 = !current
    AppToast.show(this, "Asset Auto Load617: ${if (!current) "ON" else "OFF"}")
}

// v617: Assign Auto Task617
internal fun PlayerActivity.showV617AssignAutoTask617Toggle() {
    val current = BiliClient.prefs.v617assignAutoTask617
    BiliClient.prefs.v617assignAutoTask617 = !current
    AppToast.show(this, "Assign Auto Task617: ${if (!current) "ON" else "OFF"}")
}

// v617: Async Auto Execute617
internal fun PlayerActivity.showV617AsyncAutoExecute617Toggle() {
    val current = BiliClient.prefs.v617asyncAutoExecute617
    BiliClient.prefs.v617asyncAutoExecute617 = !current
    AppToast.show(this, "Async Auto Execute617: ${if (!current) "ON" else "OFF"}")
}

// v617: Attack Auto Block617
internal fun PlayerActivity.showV617AttackAutoBlock617Toggle() {
    val current = BiliClient.prefs.v617attackAutoBlock617
    BiliClient.prefs.v617attackAutoBlock617 = !current
    AppToast.show(this, "Attack Auto Block617: ${if (!current) "ON" else "OFF"}")
}

// v617: Avatar Auto Update617
internal fun PlayerActivity.showV617AvatarAutoUpdate617Toggle() {
    val current = BiliClient.prefs.v617avatarAutoUpdate617
    BiliClient.prefs.v617avatarAutoUpdate617 = !current
    AppToast.show(this, "Avatar Auto Update617: ${if (!current) "ON" else "OFF"}")
}

// v617: Back Auto Save617
internal fun PlayerActivity.showV617BackAutoSave617Toggle() {
    val current = BiliClient.prefs.v617backAutoSave617
    BiliClient.prefs.v617backAutoSave617 = !current
    AppToast.show(this, "Back Auto Save617: ${if (!current) "ON" else "OFF"}")
}

// v617: Balance Auto Load617
internal fun PlayerActivity.showV617BalanceAutoLoad617Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v617balanceAutoLoad617).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load617",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v617balanceAutoLoad617 = value
        AppToast.show(this, "Balance Auto Load617: $value")
    }
}

// v617: Band Auto Width617
internal fun PlayerActivity.showV617BandAutoWidth617Toggle() {
    val current = BiliClient.prefs.v617bandAutoWidth617
    BiliClient.prefs.v617bandAutoWidth617 = !current
    AppToast.show(this, "Band Auto Width617: ${if (!current) "ON" else "OFF"}")
}

// v617: Bar Auto Scroll617
internal fun PlayerActivity.showV617BarAutoScroll617Toggle() {
    val current = BiliClient.prefs.v617barAutoScroll617
    BiliClient.prefs.v617barAutoScroll617 = !current
    AppToast.show(this, "Bar Auto Scroll617: ${if (!current) "ON" else "OFF"}")
}

// v617: Beacon Auto Ping617
internal fun PlayerActivity.showV617BeaconAutoPing617Toggle() {
    val current = BiliClient.prefs.v617beaconAutoPing617
    BiliClient.prefs.v617beaconAutoPing617 = !current
    AppToast.show(this, "Beacon Auto Ping617: ${if (!current) "ON" else "OFF"}")
}

// v617: Beam Auto Form617
internal fun PlayerActivity.showV617BeamAutoForm617Toggle() {
    val current = BiliClient.prefs.v617beamAutoForm617
    BiliClient.prefs.v617beamAutoForm617 = !current
    AppToast.show(this, "Beam Auto Form617: ${if (!current) "ON" else "OFF"}")
}

// v617: Before Auto Hook617
internal fun PlayerActivity.showV617BeforeAutoHook617Toggle() {
    val current = BiliClient.prefs.v617beforeAutoHook617
    BiliClient.prefs.v617beforeAutoHook617 = !current
    AppToast.show(this, "Before Auto Hook617: ${if (!current) "ON" else "OFF"}")
}

// v617: Begin Auto Init617
internal fun PlayerActivity.showV617BeginAutoInit617Toggle() {
    val current = BiliClient.prefs.v617beginAutoInit617
    BiliClient.prefs.v617beginAutoInit617 = !current
    AppToast.show(this, "Begin Auto Init617: ${if (!current) "ON" else "OFF"}")
}

// v617: Behavior Auto Track617
internal fun PlayerActivity.showV617BehaviorAutoTrack617Toggle() {
    val current = BiliClient.prefs.v617behaviorAutoTrack617
    BiliClient.prefs.v617behaviorAutoTrack617 = !current
    AppToast.show(this, "Behavior Auto Track617: ${if (!current) "ON" else "OFF"}")
}

// v618: Arrow Auto Navigate618
internal fun PlayerActivity.showV618ArrowAutoNavigate618Toggle() {
    val current = BiliClient.prefs.v618arrowAutoNavigate618
    BiliClient.prefs.v618arrowAutoNavigate618 = !current
    AppToast.show(this, "Arrow Auto Navigate618: ${if (!current) "ON" else "OFF"}")
}

// v618: Asset Auto Load618
internal fun PlayerActivity.showV618AssetAutoLoad618Toggle() {
    val current = BiliClient.prefs.v618assetAutoLoad618
    BiliClient.prefs.v618assetAutoLoad618 = !current
    AppToast.show(this, "Asset Auto Load618: ${if (!current) "ON" else "OFF"}")
}

// v618: Assign Auto Task618
internal fun PlayerActivity.showV618AssignAutoTask618Toggle() {
    val current = BiliClient.prefs.v618assignAutoTask618
    BiliClient.prefs.v618assignAutoTask618 = !current
    AppToast.show(this, "Assign Auto Task618: ${if (!current) "ON" else "OFF"}")
}

// v618: Async Auto Execute618
internal fun PlayerActivity.showV618AsyncAutoExecute618Toggle() {
    val current = BiliClient.prefs.v618asyncAutoExecute618
    BiliClient.prefs.v618asyncAutoExecute618 = !current
    AppToast.show(this, "Async Auto Execute618: ${if (!current) "ON" else "OFF"}")
}

// v618: Attack Auto Block618
internal fun PlayerActivity.showV618AttackAutoBlock618Toggle() {
    val current = BiliClient.prefs.v618attackAutoBlock618
    BiliClient.prefs.v618attackAutoBlock618 = !current
    AppToast.show(this, "Attack Auto Block618: ${if (!current) "ON" else "OFF"}")
}

// v618: Avatar Auto Update618
internal fun PlayerActivity.showV618AvatarAutoUpdate618Toggle() {
    val current = BiliClient.prefs.v618avatarAutoUpdate618
    BiliClient.prefs.v618avatarAutoUpdate618 = !current
    AppToast.show(this, "Avatar Auto Update618: ${if (!current) "ON" else "OFF"}")
}

// v618: Back Auto Save618
internal fun PlayerActivity.showV618BackAutoSave618Toggle() {
    val current = BiliClient.prefs.v618backAutoSave618
    BiliClient.prefs.v618backAutoSave618 = !current
    AppToast.show(this, "Back Auto Save618: ${if (!current) "ON" else "OFF"}")
}

// v618: Balance Auto Load618
internal fun PlayerActivity.showV618BalanceAutoLoad618Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v618balanceAutoLoad618).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load618",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v618balanceAutoLoad618 = value
        AppToast.show(this, "Balance Auto Load618: $value")
    }
}

// v618: Band Auto Width618
internal fun PlayerActivity.showV618BandAutoWidth618Toggle() {
    val current = BiliClient.prefs.v618bandAutoWidth618
    BiliClient.prefs.v618bandAutoWidth618 = !current
    AppToast.show(this, "Band Auto Width618: ${if (!current) "ON" else "OFF"}")
}

// v618: Bar Auto Scroll618
internal fun PlayerActivity.showV618BarAutoScroll618Toggle() {
    val current = BiliClient.prefs.v618barAutoScroll618
    BiliClient.prefs.v618barAutoScroll618 = !current
    AppToast.show(this, "Bar Auto Scroll618: ${if (!current) "ON" else "OFF"}")
}

// v618: Beacon Auto Ping618
internal fun PlayerActivity.showV618BeaconAutoPing618Toggle() {
    val current = BiliClient.prefs.v618beaconAutoPing618
    BiliClient.prefs.v618beaconAutoPing618 = !current
    AppToast.show(this, "Beacon Auto Ping618: ${if (!current) "ON" else "OFF"}")
}

// v618: Beam Auto Form618
internal fun PlayerActivity.showV618BeamAutoForm618Toggle() {
    val current = BiliClient.prefs.v618beamAutoForm618
    BiliClient.prefs.v618beamAutoForm618 = !current
    AppToast.show(this, "Beam Auto Form618: ${if (!current) "ON" else "OFF"}")
}

// v618: Before Auto Hook618
internal fun PlayerActivity.showV618BeforeAutoHook618Toggle() {
    val current = BiliClient.prefs.v618beforeAutoHook618
    BiliClient.prefs.v618beforeAutoHook618 = !current
    AppToast.show(this, "Before Auto Hook618: ${if (!current) "ON" else "OFF"}")
}

// v618: Begin Auto Init618
internal fun PlayerActivity.showV618BeginAutoInit618Toggle() {
    val current = BiliClient.prefs.v618beginAutoInit618
    BiliClient.prefs.v618beginAutoInit618 = !current
    AppToast.show(this, "Begin Auto Init618: ${if (!current) "ON" else "OFF"}")
}

// v618: Behavior Auto Track618
internal fun PlayerActivity.showV618BehaviorAutoTrack618Toggle() {
    val current = BiliClient.prefs.v618behaviorAutoTrack618
    BiliClient.prefs.v618behaviorAutoTrack618 = !current
    AppToast.show(this, "Behavior Auto Track618: ${if (!current) "ON" else "OFF"}")
}

// v619: Arrow Auto Navigate619
internal fun PlayerActivity.showV619ArrowAutoNavigate619Toggle() {
    val current = BiliClient.prefs.v619arrowAutoNavigate619
    BiliClient.prefs.v619arrowAutoNavigate619 = !current
    AppToast.show(this, "Arrow Auto Navigate619: ${if (!current) "ON" else "OFF"}")
}

// v619: Asset Auto Load619
internal fun PlayerActivity.showV619AssetAutoLoad619Toggle() {
    val current = BiliClient.prefs.v619assetAutoLoad619
    BiliClient.prefs.v619assetAutoLoad619 = !current
    AppToast.show(this, "Asset Auto Load619: ${if (!current) "ON" else "OFF"}")
}

// v619: Assign Auto Task619
internal fun PlayerActivity.showV619AssignAutoTask619Toggle() {
    val current = BiliClient.prefs.v619assignAutoTask619
    BiliClient.prefs.v619assignAutoTask619 = !current
    AppToast.show(this, "Assign Auto Task619: ${if (!current) "ON" else "OFF"}")
}

// v619: Async Auto Execute619
internal fun PlayerActivity.showV619AsyncAutoExecute619Toggle() {
    val current = BiliClient.prefs.v619asyncAutoExecute619
    BiliClient.prefs.v619asyncAutoExecute619 = !current
    AppToast.show(this, "Async Auto Execute619: ${if (!current) "ON" else "OFF"}")
}

// v619: Attack Auto Block619
internal fun PlayerActivity.showV619AttackAutoBlock619Toggle() {
    val current = BiliClient.prefs.v619attackAutoBlock619
    BiliClient.prefs.v619attackAutoBlock619 = !current
    AppToast.show(this, "Attack Auto Block619: ${if (!current) "ON" else "OFF"}")
}

// v619: Avatar Auto Update619
internal fun PlayerActivity.showV619AvatarAutoUpdate619Toggle() {
    val current = BiliClient.prefs.v619avatarAutoUpdate619
    BiliClient.prefs.v619avatarAutoUpdate619 = !current
    AppToast.show(this, "Avatar Auto Update619: ${if (!current) "ON" else "OFF"}")
}

// v619: Back Auto Save619
internal fun PlayerActivity.showV619BackAutoSave619Toggle() {
    val current = BiliClient.prefs.v619backAutoSave619
    BiliClient.prefs.v619backAutoSave619 = !current
    AppToast.show(this, "Back Auto Save619: ${if (!current) "ON" else "OFF"}")
}

// v619: Balance Auto Load619
internal fun PlayerActivity.showV619BalanceAutoLoad619Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v619balanceAutoLoad619).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load619",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v619balanceAutoLoad619 = value
        AppToast.show(this, "Balance Auto Load619: $value")
    }
}

// v619: Band Auto Width619
internal fun PlayerActivity.showV619BandAutoWidth619Toggle() {
    val current = BiliClient.prefs.v619bandAutoWidth619
    BiliClient.prefs.v619bandAutoWidth619 = !current
    AppToast.show(this, "Band Auto Width619: ${if (!current) "ON" else "OFF"}")
}

// v619: Bar Auto Scroll619
internal fun PlayerActivity.showV619BarAutoScroll619Toggle() {
    val current = BiliClient.prefs.v619barAutoScroll619
    BiliClient.prefs.v619barAutoScroll619 = !current
    AppToast.show(this, "Bar Auto Scroll619: ${if (!current) "ON" else "OFF"}")
}

// v619: Beacon Auto Ping619
internal fun PlayerActivity.showV619BeaconAutoPing619Toggle() {
    val current = BiliClient.prefs.v619beaconAutoPing619
    BiliClient.prefs.v619beaconAutoPing619 = !current
    AppToast.show(this, "Beacon Auto Ping619: ${if (!current) "ON" else "OFF"}")
}

// v619: Beam Auto Form619
internal fun PlayerActivity.showV619BeamAutoForm619Toggle() {
    val current = BiliClient.prefs.v619beamAutoForm619
    BiliClient.prefs.v619beamAutoForm619 = !current
    AppToast.show(this, "Beam Auto Form619: ${if (!current) "ON" else "OFF"}")
}

// v619: Before Auto Hook619
internal fun PlayerActivity.showV619BeforeAutoHook619Toggle() {
    val current = BiliClient.prefs.v619beforeAutoHook619
    BiliClient.prefs.v619beforeAutoHook619 = !current
    AppToast.show(this, "Before Auto Hook619: ${if (!current) "ON" else "OFF"}")
}

// v619: Begin Auto Init619
internal fun PlayerActivity.showV619BeginAutoInit619Toggle() {
    val current = BiliClient.prefs.v619beginAutoInit619
    BiliClient.prefs.v619beginAutoInit619 = !current
    AppToast.show(this, "Begin Auto Init619: ${if (!current) "ON" else "OFF"}")
}

// v619: Behavior Auto Track619
internal fun PlayerActivity.showV619BehaviorAutoTrack619Toggle() {
    val current = BiliClient.prefs.v619behaviorAutoTrack619
    BiliClient.prefs.v619behaviorAutoTrack619 = !current
    AppToast.show(this, "Behavior Auto Track619: ${if (!current) "ON" else "OFF"}")
}

// v620: Arrow Auto Navigate620
internal fun PlayerActivity.showV620ArrowAutoNavigate620Toggle() {
    val current = BiliClient.prefs.v620arrowAutoNavigate620
    BiliClient.prefs.v620arrowAutoNavigate620 = !current
    AppToast.show(this, "Arrow Auto Navigate620: ${if (!current) "ON" else "OFF"}")
}

// v620: Asset Auto Load620
internal fun PlayerActivity.showV620AssetAutoLoad620Toggle() {
    val current = BiliClient.prefs.v620assetAutoLoad620
    BiliClient.prefs.v620assetAutoLoad620 = !current
    AppToast.show(this, "Asset Auto Load620: ${if (!current) "ON" else "OFF"}")
}

// v620: Assign Auto Task620
internal fun PlayerActivity.showV620AssignAutoTask620Toggle() {
    val current = BiliClient.prefs.v620assignAutoTask620
    BiliClient.prefs.v620assignAutoTask620 = !current
    AppToast.show(this, "Assign Auto Task620: ${if (!current) "ON" else "OFF"}")
}

// v620: Async Auto Execute620
internal fun PlayerActivity.showV620AsyncAutoExecute620Toggle() {
    val current = BiliClient.prefs.v620asyncAutoExecute620
    BiliClient.prefs.v620asyncAutoExecute620 = !current
    AppToast.show(this, "Async Auto Execute620: ${if (!current) "ON" else "OFF"}")
}

// v620: Attack Auto Block620
internal fun PlayerActivity.showV620AttackAutoBlock620Toggle() {
    val current = BiliClient.prefs.v620attackAutoBlock620
    BiliClient.prefs.v620attackAutoBlock620 = !current
    AppToast.show(this, "Attack Auto Block620: ${if (!current) "ON" else "OFF"}")
}

// v620: Avatar Auto Update620
internal fun PlayerActivity.showV620AvatarAutoUpdate620Toggle() {
    val current = BiliClient.prefs.v620avatarAutoUpdate620
    BiliClient.prefs.v620avatarAutoUpdate620 = !current
    AppToast.show(this, "Avatar Auto Update620: ${if (!current) "ON" else "OFF"}")
}

// v620: Back Auto Save620
internal fun PlayerActivity.showV620BackAutoSave620Toggle() {
    val current = BiliClient.prefs.v620backAutoSave620
    BiliClient.prefs.v620backAutoSave620 = !current
    AppToast.show(this, "Back Auto Save620: ${if (!current) "ON" else "OFF"}")
}

// v620: Balance Auto Load620
internal fun PlayerActivity.showV620BalanceAutoLoad620Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v620balanceAutoLoad620).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Balance Auto Load620",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v620balanceAutoLoad620 = value
        AppToast.show(this, "Balance Auto Load620: $value")
    }
}

// v620: Band Auto Width620
internal fun PlayerActivity.showV620BandAutoWidth620Toggle() {
    val current = BiliClient.prefs.v620bandAutoWidth620
    BiliClient.prefs.v620bandAutoWidth620 = !current
    AppToast.show(this, "Band Auto Width620: ${if (!current) "ON" else "OFF"}")
}

// v620: Bar Auto Scroll620
internal fun PlayerActivity.showV620BarAutoScroll620Toggle() {
    val current = BiliClient.prefs.v620barAutoScroll620
    BiliClient.prefs.v620barAutoScroll620 = !current
    AppToast.show(this, "Bar Auto Scroll620: ${if (!current) "ON" else "OFF"}")
}

// v620: Beacon Auto Ping620
internal fun PlayerActivity.showV620BeaconAutoPing620Toggle() {
    val current = BiliClient.prefs.v620beaconAutoPing620
    BiliClient.prefs.v620beaconAutoPing620 = !current
    AppToast.show(this, "Beacon Auto Ping620: ${if (!current) "ON" else "OFF"}")
}

// v620: Beam Auto Form620
internal fun PlayerActivity.showV620BeamAutoForm620Toggle() {
    val current = BiliClient.prefs.v620beamAutoForm620
    BiliClient.prefs.v620beamAutoForm620 = !current
    AppToast.show(this, "Beam Auto Form620: ${if (!current) "ON" else "OFF"}")
}

// v620: Before Auto Hook620
internal fun PlayerActivity.showV620BeforeAutoHook620Toggle() {
    val current = BiliClient.prefs.v620beforeAutoHook620
    BiliClient.prefs.v620beforeAutoHook620 = !current
    AppToast.show(this, "Before Auto Hook620: ${if (!current) "ON" else "OFF"}")
}

// v620: Begin Auto Init620
internal fun PlayerActivity.showV620BeginAutoInit620Toggle() {
    val current = BiliClient.prefs.v620beginAutoInit620
    BiliClient.prefs.v620beginAutoInit620 = !current
    AppToast.show(this, "Begin Auto Init620: ${if (!current) "ON" else "OFF"}")
}

// v620: Behavior Auto Track620
internal fun PlayerActivity.showV620BehaviorAutoTrack620Toggle() {
    val current = BiliClient.prefs.v620behaviorAutoTrack620
    BiliClient.prefs.v620behaviorAutoTrack620 = !current
    AppToast.show(this, "Behavior Auto Track620: ${if (!current) "ON" else "OFF"}")
}

// v621: Benchmark Auto Run621
internal fun PlayerActivity.showV621BenchmarkAutoRun621Toggle() {
    val current = BiliClient.prefs.v621benchmarkAutoRun621
    BiliClient.prefs.v621benchmarkAutoRun621 = !current
    AppToast.show(this, "Benchmark Auto Run621: ${if (!current) "ON" else "OFF"}")
}

// v621: Beta Auto Update621
internal fun PlayerActivity.showV621BetaAutoUpdate621Toggle() {
    val current = BiliClient.prefs.v621betaAutoUpdate621
    BiliClient.prefs.v621betaAutoUpdate621 = !current
    AppToast.show(this, "Beta Auto Update621: ${if (!current) "ON" else "OFF"}")
}

// v621: Binary Auto Decode621
internal fun PlayerActivity.showV621BinaryAutoDecode621Toggle() {
    val current = BiliClient.prefs.v621binaryAutoDecode621
    BiliClient.prefs.v621binaryAutoDecode621 = !current
    AppToast.show(this, "Binary Auto Decode621: ${if (!current) "ON" else "OFF"}")
}

// v621: Blank Auto Fill621
internal fun PlayerActivity.showV621BlankAutoFill621Toggle() {
    val current = BiliClient.prefs.v621blankAutoFill621
    BiliClient.prefs.v621blankAutoFill621 = !current
    AppToast.show(this, "Blank Auto Fill621: ${if (!current) "ON" else "OFF"}")
}

// v621: Body Auto Parse621
internal fun PlayerActivity.showV621BodyAutoParse621Toggle() {
    val current = BiliClient.prefs.v621bodyAutoParse621
    BiliClient.prefs.v621bodyAutoParse621 = !current
    AppToast.show(this, "Body Auto Parse621: ${if (!current) "ON" else "OFF"}")
}

// v621: Bold Auto Detect621
internal fun PlayerActivity.showV621BoldAutoDetect621Toggle() {
    val current = BiliClient.prefs.v621boldAutoDetect621
    BiliClient.prefs.v621boldAutoDetect621 = !current
    AppToast.show(this, "Bold Auto Detect621: ${if (!current) "ON" else "OFF"}")
}

// v621: Boot Auto Start621
internal fun PlayerActivity.showV621BootAutoStart621Toggle() {
    val current = BiliClient.prefs.v621bootAutoStart621
    BiliClient.prefs.v621bootAutoStart621 = !current
    AppToast.show(this, "Boot Auto Start621: ${if (!current) "ON" else "OFF"}")
}

// v621: Border Auto Draw621
internal fun PlayerActivity.showV621BorderAutoDraw621Toggle() {
    val current = BiliClient.prefs.v621borderAutoDraw621
    BiliClient.prefs.v621borderAutoDraw621 = !current
    AppToast.show(this, "Border Auto Draw621: ${if (!current) "ON" else "OFF"}")
}

// v621: Bottom Auto Nav621
internal fun PlayerActivity.showV621BottomAutoNav621Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v621bottomAutoNav621).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav621",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v621bottomAutoNav621 = value
        AppToast.show(this, "Bottom Auto Nav621: $value")
    }
}

// v621: Bounce Auto Effect621
internal fun PlayerActivity.showV621BounceAutoEffect621Toggle() {
    val current = BiliClient.prefs.v621bounceAutoEffect621
    BiliClient.prefs.v621bounceAutoEffect621 = !current
    AppToast.show(this, "Bounce Auto Effect621: ${if (!current) "ON" else "OFF"}")
}

// v621: Box Auto Shadow621
internal fun PlayerActivity.showV621BoxAutoShadow621Toggle() {
    val current = BiliClient.prefs.v621boxAutoShadow621
    BiliClient.prefs.v621boxAutoShadow621 = !current
    AppToast.show(this, "Box Auto Shadow621: ${if (!current) "ON" else "OFF"}")
}

// v621: Branch Auto Merge621
internal fun PlayerActivity.showV621BranchAutoMerge621Toggle() {
    val current = BiliClient.prefs.v621branchAutoMerge621
    BiliClient.prefs.v621branchAutoMerge621 = !current
    AppToast.show(this, "Branch Auto Merge621: ${if (!current) "ON" else "OFF"}")
}

// v621: Brand Auto Logo621
internal fun PlayerActivity.showV621BrandAutoLogo621Toggle() {
    val current = BiliClient.prefs.v621brandAutoLogo621
    BiliClient.prefs.v621brandAutoLogo621 = !current
    AppToast.show(this, "Brand Auto Logo621: ${if (!current) "ON" else "OFF"}")
}

// v621: Break Auto Resume621
internal fun PlayerActivity.showV621BreakAutoResume621Toggle() {
    val current = BiliClient.prefs.v621breakAutoResume621
    BiliClient.prefs.v621breakAutoResume621 = !current
    AppToast.show(this, "Break Auto Resume621: ${if (!current) "ON" else "OFF"}")
}

// v621: Bridge Auto Connect621
internal fun PlayerActivity.showV621BridgeAutoConnect621Toggle() {
    val current = BiliClient.prefs.v621bridgeAutoConnect621
    BiliClient.prefs.v621bridgeAutoConnect621 = !current
    AppToast.show(this, "Bridge Auto Connect621: ${if (!current) "ON" else "OFF"}")
}

// v622: Benchmark Auto Run622
internal fun PlayerActivity.showV622BenchmarkAutoRun622Toggle() {
    val current = BiliClient.prefs.v622benchmarkAutoRun622
    BiliClient.prefs.v622benchmarkAutoRun622 = !current
    AppToast.show(this, "Benchmark Auto Run622: ${if (!current) "ON" else "OFF"}")
}

// v622: Beta Auto Update622
internal fun PlayerActivity.showV622BetaAutoUpdate622Toggle() {
    val current = BiliClient.prefs.v622betaAutoUpdate622
    BiliClient.prefs.v622betaAutoUpdate622 = !current
    AppToast.show(this, "Beta Auto Update622: ${if (!current) "ON" else "OFF"}")
}

// v622: Binary Auto Decode622
internal fun PlayerActivity.showV622BinaryAutoDecode622Toggle() {
    val current = BiliClient.prefs.v622binaryAutoDecode622
    BiliClient.prefs.v622binaryAutoDecode622 = !current
    AppToast.show(this, "Binary Auto Decode622: ${if (!current) "ON" else "OFF"}")
}

// v622: Blank Auto Fill622
internal fun PlayerActivity.showV622BlankAutoFill622Toggle() {
    val current = BiliClient.prefs.v622blankAutoFill622
    BiliClient.prefs.v622blankAutoFill622 = !current
    AppToast.show(this, "Blank Auto Fill622: ${if (!current) "ON" else "OFF"}")
}

// v622: Body Auto Parse622
internal fun PlayerActivity.showV622BodyAutoParse622Toggle() {
    val current = BiliClient.prefs.v622bodyAutoParse622
    BiliClient.prefs.v622bodyAutoParse622 = !current
    AppToast.show(this, "Body Auto Parse622: ${if (!current) "ON" else "OFF"}")
}

// v622: Bold Auto Detect622
internal fun PlayerActivity.showV622BoldAutoDetect622Toggle() {
    val current = BiliClient.prefs.v622boldAutoDetect622
    BiliClient.prefs.v622boldAutoDetect622 = !current
    AppToast.show(this, "Bold Auto Detect622: ${if (!current) "ON" else "OFF"}")
}

// v622: Boot Auto Start622
internal fun PlayerActivity.showV622BootAutoStart622Toggle() {
    val current = BiliClient.prefs.v622bootAutoStart622
    BiliClient.prefs.v622bootAutoStart622 = !current
    AppToast.show(this, "Boot Auto Start622: ${if (!current) "ON" else "OFF"}")
}

// v622: Border Auto Draw622
internal fun PlayerActivity.showV622BorderAutoDraw622Toggle() {
    val current = BiliClient.prefs.v622borderAutoDraw622
    BiliClient.prefs.v622borderAutoDraw622 = !current
    AppToast.show(this, "Border Auto Draw622: ${if (!current) "ON" else "OFF"}")
}

// v622: Bottom Auto Nav622
internal fun PlayerActivity.showV622BottomAutoNav622Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v622bottomAutoNav622).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bottom Auto Nav622",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v622bottomAutoNav622 = value
        AppToast.show(this, "Bottom Auto Nav622: $value")
    }
}

// v622: Bounce Auto Effect622
internal fun PlayerActivity.showV622BounceAutoEffect622Toggle() {
    val current = BiliClient.prefs.v622bounceAutoEffect622
    BiliClient.prefs.v622bounceAutoEffect622 = !current
    AppToast.show(this, "Bounce Auto Effect622: ${if (!current) "ON" else "OFF"}")
}

// v622: Box Auto Shadow622
internal fun PlayerActivity.showV622BoxAutoShadow622Toggle() {
    val current = BiliClient.prefs.v622boxAutoShadow622
    BiliClient.prefs.v622boxAutoShadow622 = !current
    AppToast.show(this, "Box Auto Shadow622: ${if (!current) "ON" else "OFF"}")
}

// v622: Branch Auto Merge622
internal fun PlayerActivity.showV622BranchAutoMerge622Toggle() {
    val current = BiliClient.prefs.v622branchAutoMerge622
    BiliClient.prefs.v622branchAutoMerge622 = !current
    AppToast.show(this, "Branch Auto Merge622: ${if (!current) "ON" else "OFF"}")
}

// v622: Brand Auto Logo622
internal fun PlayerActivity.showV622BrandAutoLogo622Toggle() {
    val current = BiliClient.prefs.v622brandAutoLogo622
    BiliClient.prefs.v622brandAutoLogo622 = !current
    AppToast.show(this, "Brand Auto Logo622: ${if (!current) "ON" else "OFF"}")
}

// v622: Break Auto Resume622
internal fun PlayerActivity.showV622BreakAutoResume622Toggle() {
    val current = BiliClient.prefs.v622breakAutoResume622
    BiliClient.prefs.v622breakAutoResume622 = !current
    AppToast.show(this, "Break Auto Resume622: ${if (!current) "ON" else "OFF"}")
}

// v622: Bridge Auto Connect622
internal fun PlayerActivity.showV622BridgeAutoConnect622Toggle() {
    val current = BiliClient.prefs.v622bridgeAutoConnect622
    BiliClient.prefs.v622bridgeAutoConnect622 = !current
    AppToast.show(this, "Bridge Auto Connect622: ${if (!current) "ON" else "OFF"}")
}

// v623: Benchmark Auto Run623
internal fun PlayerActivity.showV623BenchmarkAutoRun623Toggle() {
    val current = BiliClient.prefs.v623benchmarkAutoRun623
    BiliClient.prefs.v623benchmarkAutoRun623 = !current
    AppToast.show(this, "Benchmark Auto Run623: ${if (!current) "ON" else "OFF"}")
}

// v623: Beta Auto Update623
internal fun PlayerActivity.showV623BetaAutoUpdate623Toggle() {
    val current = BiliClient.prefs.v623betaAutoUpdate623
    BiliClient.prefs.v623betaAutoUpdate623 = !current
    AppToast.show(this, "Beta Auto Update623: ${if (!current) "ON" else "OFF"}")
}

// v623: Binary Auto Decode623
internal fun PlayerActivity.showV623BinaryAutoDecode623Toggle() {
    val current = BiliClient.prefs.v623binaryAutoDecode623
    BiliClient.prefs.v623binaryAutoDecode623 = !current
    AppToast.show(this, "Binary Auto Decode623: ${if (!current) "ON" else "OFF"}")
}

