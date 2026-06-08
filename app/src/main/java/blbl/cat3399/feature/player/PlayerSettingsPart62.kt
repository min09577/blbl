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

// v801: Log Auto Rotate801
internal fun PlayerActivity.showV801LogAutoRotate801Toggle() {
    val current = BiliClient.prefs.v801logAutoRotate801
    BiliClient.prefs.v801logAutoRotate801 = !current
    AppToast.show(this, "Log Auto Rotate801: ${if (!current) "ON" else "OFF"}")
}

// v801: Logic Auto Branch801
internal fun PlayerActivity.showV801LogicAutoBranch801Toggle() {
    val current = BiliClient.prefs.v801logicAutoBranch801
    BiliClient.prefs.v801logicAutoBranch801 = !current
    AppToast.show(this, "Logic Auto Branch801: ${if (!current) "ON" else "OFF"}")
}

// v801: Login Auto Token801
internal fun PlayerActivity.showV801LoginAutoToken801Toggle() {
    val current = BiliClient.prefs.v801loginAutoToken801
    BiliClient.prefs.v801loginAutoToken801 = !current
    AppToast.show(this, "Login Auto Token801: ${if (!current) "ON" else "OFF"}")
}

// v801: Long Auto Press801
internal fun PlayerActivity.showV801LongAutoPress801Toggle() {
    val current = BiliClient.prefs.v801longAutoPress801
    BiliClient.prefs.v801longAutoPress801 = !current
    AppToast.show(this, "Long Auto Press801: ${if (!current) "ON" else "OFF"}")
}

// v801: Loop Auto Repeat801
internal fun PlayerActivity.showV801LoopAutoRepeat801Toggle() {
    val current = BiliClient.prefs.v801loopAutoRepeat801
    BiliClient.prefs.v801loopAutoRepeat801 = !current
    AppToast.show(this, "Loop Auto Repeat801: ${if (!current) "ON" else "OFF"}")
}

// v801: Low Auto Power801
internal fun PlayerActivity.showV801LowAutoPower801Toggle() {
    val current = BiliClient.prefs.v801lowAutoPower801
    BiliClient.prefs.v801lowAutoPower801 = !current
    AppToast.show(this, "Low Auto Power801: ${if (!current) "ON" else "OFF"}")
}

// v801: Lower Auto Bound801
internal fun PlayerActivity.showV801LowerAutoBound801Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v801lowerAutoBound801).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Lower Auto Bound801",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v801lowerAutoBound801 = value
        AppToast.show(this, "Lower Auto Bound801: $value")
    }
}

// v801: Main Auto Focus801
internal fun PlayerActivity.showV801MainAutoFocus801Toggle() {
    val current = BiliClient.prefs.v801mainAutoFocus801
    BiliClient.prefs.v801mainAutoFocus801 = !current
    AppToast.show(this, "Main Auto Focus801: ${if (!current) "ON" else "OFF"}")
}

// v801: Make Auto Build801
internal fun PlayerActivity.showV801MakeAutoBuild801Toggle() {
    val current = BiliClient.prefs.v801makeAutoBuild801
    BiliClient.prefs.v801makeAutoBuild801 = !current
    AppToast.show(this, "Make Auto Build801: ${if (!current) "ON" else "OFF"}")
}

// v801: Manage Auto Queue801
internal fun PlayerActivity.showV801ManageAutoQueue801Toggle() {
    val current = BiliClient.prefs.v801manageAutoQueue801
    BiliClient.prefs.v801manageAutoQueue801 = !current
    AppToast.show(this, "Manage Auto Queue801: ${if (!current) "ON" else "OFF"}")
}

// v801: Manifest Auto Parse801
internal fun PlayerActivity.showV801ManifestAutoParse801Toggle() {
    val current = BiliClient.prefs.v801manifestAutoParse801
    BiliClient.prefs.v801manifestAutoParse801 = !current
    AppToast.show(this, "Manifest Auto Parse801: ${if (!current) "ON" else "OFF"}")
}

// v801: Map Auto Bind801
internal fun PlayerActivity.showV801MapAutoBind801Toggle() {
    val current = BiliClient.prefs.v801mapAutoBind801
    BiliClient.prefs.v801mapAutoBind801 = !current
    AppToast.show(this, "Map Auto Bind801: ${if (!current) "ON" else "OFF"}")
}

// v801: Margin Auto Adjust801
internal fun PlayerActivity.showV801MarginAutoAdjust801Toggle() {
    val current = BiliClient.prefs.v801marginAutoAdjust801
    BiliClient.prefs.v801marginAutoAdjust801 = !current
    AppToast.show(this, "Margin Auto Adjust801: ${if (!current) "ON" else "OFF"}")
}

// v801: Mark Auto Highlight801
internal fun PlayerActivity.showV801MarkAutoHighlight801Toggle() {
    val current = BiliClient.prefs.v801markAutoHighlight801
    BiliClient.prefs.v801markAutoHighlight801 = !current
    AppToast.show(this, "Mark Auto Highlight801: ${if (!current) "ON" else "OFF"}")
}

// v801: Mask Auto Apply801
internal fun PlayerActivity.showV801MaskAutoApply801Toggle() {
    val current = BiliClient.prefs.v801maskAutoApply801
    BiliClient.prefs.v801maskAutoApply801 = !current
    AppToast.show(this, "Mask Auto Apply801: ${if (!current) "ON" else "OFF"}")
}

// v802: Log Auto Rotate802
internal fun PlayerActivity.showV802LogAutoRotate802Toggle() {
    val current = BiliClient.prefs.v802logAutoRotate802
    BiliClient.prefs.v802logAutoRotate802 = !current
    AppToast.show(this, "Log Auto Rotate802: ${if (!current) "ON" else "OFF"}")
}

// v802: Logic Auto Branch802
internal fun PlayerActivity.showV802LogicAutoBranch802Toggle() {
    val current = BiliClient.prefs.v802logicAutoBranch802
    BiliClient.prefs.v802logicAutoBranch802 = !current
    AppToast.show(this, "Logic Auto Branch802: ${if (!current) "ON" else "OFF"}")
}

// v802: Login Auto Token802
internal fun PlayerActivity.showV802LoginAutoToken802Toggle() {
    val current = BiliClient.prefs.v802loginAutoToken802
    BiliClient.prefs.v802loginAutoToken802 = !current
    AppToast.show(this, "Login Auto Token802: ${if (!current) "ON" else "OFF"}")
}

// v802: Long Auto Press802
internal fun PlayerActivity.showV802LongAutoPress802Toggle() {
    val current = BiliClient.prefs.v802longAutoPress802
    BiliClient.prefs.v802longAutoPress802 = !current
    AppToast.show(this, "Long Auto Press802: ${if (!current) "ON" else "OFF"}")
}

// v802: Loop Auto Repeat802
internal fun PlayerActivity.showV802LoopAutoRepeat802Toggle() {
    val current = BiliClient.prefs.v802loopAutoRepeat802
    BiliClient.prefs.v802loopAutoRepeat802 = !current
    AppToast.show(this, "Loop Auto Repeat802: ${if (!current) "ON" else "OFF"}")
}

// v802: Low Auto Power802
internal fun PlayerActivity.showV802LowAutoPower802Toggle() {
    val current = BiliClient.prefs.v802lowAutoPower802
    BiliClient.prefs.v802lowAutoPower802 = !current
    AppToast.show(this, "Low Auto Power802: ${if (!current) "ON" else "OFF"}")
}

// v802: Lower Auto Bound802
internal fun PlayerActivity.showV802LowerAutoBound802Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v802lowerAutoBound802).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Lower Auto Bound802",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v802lowerAutoBound802 = value
        AppToast.show(this, "Lower Auto Bound802: $value")
    }
}

// v802: Main Auto Focus802
internal fun PlayerActivity.showV802MainAutoFocus802Toggle() {
    val current = BiliClient.prefs.v802mainAutoFocus802
    BiliClient.prefs.v802mainAutoFocus802 = !current
    AppToast.show(this, "Main Auto Focus802: ${if (!current) "ON" else "OFF"}")
}

// v802: Make Auto Build802
internal fun PlayerActivity.showV802MakeAutoBuild802Toggle() {
    val current = BiliClient.prefs.v802makeAutoBuild802
    BiliClient.prefs.v802makeAutoBuild802 = !current
    AppToast.show(this, "Make Auto Build802: ${if (!current) "ON" else "OFF"}")
}

// v802: Manage Auto Queue802
internal fun PlayerActivity.showV802ManageAutoQueue802Toggle() {
    val current = BiliClient.prefs.v802manageAutoQueue802
    BiliClient.prefs.v802manageAutoQueue802 = !current
    AppToast.show(this, "Manage Auto Queue802: ${if (!current) "ON" else "OFF"}")
}

// v802: Manifest Auto Parse802
internal fun PlayerActivity.showV802ManifestAutoParse802Toggle() {
    val current = BiliClient.prefs.v802manifestAutoParse802
    BiliClient.prefs.v802manifestAutoParse802 = !current
    AppToast.show(this, "Manifest Auto Parse802: ${if (!current) "ON" else "OFF"}")
}

// v802: Map Auto Bind802
internal fun PlayerActivity.showV802MapAutoBind802Toggle() {
    val current = BiliClient.prefs.v802mapAutoBind802
    BiliClient.prefs.v802mapAutoBind802 = !current
    AppToast.show(this, "Map Auto Bind802: ${if (!current) "ON" else "OFF"}")
}

// v802: Margin Auto Adjust802
internal fun PlayerActivity.showV802MarginAutoAdjust802Toggle() {
    val current = BiliClient.prefs.v802marginAutoAdjust802
    BiliClient.prefs.v802marginAutoAdjust802 = !current
    AppToast.show(this, "Margin Auto Adjust802: ${if (!current) "ON" else "OFF"}")
}

// v802: Mark Auto Highlight802
internal fun PlayerActivity.showV802MarkAutoHighlight802Toggle() {
    val current = BiliClient.prefs.v802markAutoHighlight802
    BiliClient.prefs.v802markAutoHighlight802 = !current
    AppToast.show(this, "Mark Auto Highlight802: ${if (!current) "ON" else "OFF"}")
}

// v802: Mask Auto Apply802
internal fun PlayerActivity.showV802MaskAutoApply802Toggle() {
    val current = BiliClient.prefs.v802maskAutoApply802
    BiliClient.prefs.v802maskAutoApply802 = !current
    AppToast.show(this, "Mask Auto Apply802: ${if (!current) "ON" else "OFF"}")
}

// v803: Log Auto Rotate803
internal fun PlayerActivity.showV803LogAutoRotate803Toggle() {
    val current = BiliClient.prefs.v803logAutoRotate803
    BiliClient.prefs.v803logAutoRotate803 = !current
    AppToast.show(this, "Log Auto Rotate803: ${if (!current) "ON" else "OFF"}")
}

// v803: Logic Auto Branch803
internal fun PlayerActivity.showV803LogicAutoBranch803Toggle() {
    val current = BiliClient.prefs.v803logicAutoBranch803
    BiliClient.prefs.v803logicAutoBranch803 = !current
    AppToast.show(this, "Logic Auto Branch803: ${if (!current) "ON" else "OFF"}")
}

// v803: Login Auto Token803
internal fun PlayerActivity.showV803LoginAutoToken803Toggle() {
    val current = BiliClient.prefs.v803loginAutoToken803
    BiliClient.prefs.v803loginAutoToken803 = !current
    AppToast.show(this, "Login Auto Token803: ${if (!current) "ON" else "OFF"}")
}

// v803: Long Auto Press803
internal fun PlayerActivity.showV803LongAutoPress803Toggle() {
    val current = BiliClient.prefs.v803longAutoPress803
    BiliClient.prefs.v803longAutoPress803 = !current
    AppToast.show(this, "Long Auto Press803: ${if (!current) "ON" else "OFF"}")
}

// v803: Loop Auto Repeat803
internal fun PlayerActivity.showV803LoopAutoRepeat803Toggle() {
    val current = BiliClient.prefs.v803loopAutoRepeat803
    BiliClient.prefs.v803loopAutoRepeat803 = !current
    AppToast.show(this, "Loop Auto Repeat803: ${if (!current) "ON" else "OFF"}")
}

// v803: Low Auto Power803
internal fun PlayerActivity.showV803LowAutoPower803Toggle() {
    val current = BiliClient.prefs.v803lowAutoPower803
    BiliClient.prefs.v803lowAutoPower803 = !current
    AppToast.show(this, "Low Auto Power803: ${if (!current) "ON" else "OFF"}")
}

// v803: Lower Auto Bound803
internal fun PlayerActivity.showV803LowerAutoBound803Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v803lowerAutoBound803).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Lower Auto Bound803",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v803lowerAutoBound803 = value
        AppToast.show(this, "Lower Auto Bound803: $value")
    }
}

// v803: Main Auto Focus803
internal fun PlayerActivity.showV803MainAutoFocus803Toggle() {
    val current = BiliClient.prefs.v803mainAutoFocus803
    BiliClient.prefs.v803mainAutoFocus803 = !current
    AppToast.show(this, "Main Auto Focus803: ${if (!current) "ON" else "OFF"}")
}

// v803: Make Auto Build803
internal fun PlayerActivity.showV803MakeAutoBuild803Toggle() {
    val current = BiliClient.prefs.v803makeAutoBuild803
    BiliClient.prefs.v803makeAutoBuild803 = !current
    AppToast.show(this, "Make Auto Build803: ${if (!current) "ON" else "OFF"}")
}

// v803: Manage Auto Queue803
internal fun PlayerActivity.showV803ManageAutoQueue803Toggle() {
    val current = BiliClient.prefs.v803manageAutoQueue803
    BiliClient.prefs.v803manageAutoQueue803 = !current
    AppToast.show(this, "Manage Auto Queue803: ${if (!current) "ON" else "OFF"}")
}

// v803: Manifest Auto Parse803
internal fun PlayerActivity.showV803ManifestAutoParse803Toggle() {
    val current = BiliClient.prefs.v803manifestAutoParse803
    BiliClient.prefs.v803manifestAutoParse803 = !current
    AppToast.show(this, "Manifest Auto Parse803: ${if (!current) "ON" else "OFF"}")
}

// v803: Map Auto Bind803
internal fun PlayerActivity.showV803MapAutoBind803Toggle() {
    val current = BiliClient.prefs.v803mapAutoBind803
    BiliClient.prefs.v803mapAutoBind803 = !current
    AppToast.show(this, "Map Auto Bind803: ${if (!current) "ON" else "OFF"}")
}

// v803: Margin Auto Adjust803
internal fun PlayerActivity.showV803MarginAutoAdjust803Toggle() {
    val current = BiliClient.prefs.v803marginAutoAdjust803
    BiliClient.prefs.v803marginAutoAdjust803 = !current
    AppToast.show(this, "Margin Auto Adjust803: ${if (!current) "ON" else "OFF"}")
}

// v803: Mark Auto Highlight803
internal fun PlayerActivity.showV803MarkAutoHighlight803Toggle() {
    val current = BiliClient.prefs.v803markAutoHighlight803
    BiliClient.prefs.v803markAutoHighlight803 = !current
    AppToast.show(this, "Mark Auto Highlight803: ${if (!current) "ON" else "OFF"}")
}

// v803: Mask Auto Apply803
internal fun PlayerActivity.showV803MaskAutoApply803Toggle() {
    val current = BiliClient.prefs.v803maskAutoApply803
    BiliClient.prefs.v803maskAutoApply803 = !current
    AppToast.show(this, "Mask Auto Apply803: ${if (!current) "ON" else "OFF"}")
}

// v804: Log Auto Rotate804
internal fun PlayerActivity.showV804LogAutoRotate804Toggle() {
    val current = BiliClient.prefs.v804logAutoRotate804
    BiliClient.prefs.v804logAutoRotate804 = !current
    AppToast.show(this, "Log Auto Rotate804: ${if (!current) "ON" else "OFF"}")
}

// v804: Logic Auto Branch804
internal fun PlayerActivity.showV804LogicAutoBranch804Toggle() {
    val current = BiliClient.prefs.v804logicAutoBranch804
    BiliClient.prefs.v804logicAutoBranch804 = !current
    AppToast.show(this, "Logic Auto Branch804: ${if (!current) "ON" else "OFF"}")
}

// v804: Login Auto Token804
internal fun PlayerActivity.showV804LoginAutoToken804Toggle() {
    val current = BiliClient.prefs.v804loginAutoToken804
    BiliClient.prefs.v804loginAutoToken804 = !current
    AppToast.show(this, "Login Auto Token804: ${if (!current) "ON" else "OFF"}")
}

// v804: Long Auto Press804
internal fun PlayerActivity.showV804LongAutoPress804Toggle() {
    val current = BiliClient.prefs.v804longAutoPress804
    BiliClient.prefs.v804longAutoPress804 = !current
    AppToast.show(this, "Long Auto Press804: ${if (!current) "ON" else "OFF"}")
}

// v804: Loop Auto Repeat804
internal fun PlayerActivity.showV804LoopAutoRepeat804Toggle() {
    val current = BiliClient.prefs.v804loopAutoRepeat804
    BiliClient.prefs.v804loopAutoRepeat804 = !current
    AppToast.show(this, "Loop Auto Repeat804: ${if (!current) "ON" else "OFF"}")
}

// v804: Low Auto Power804
internal fun PlayerActivity.showV804LowAutoPower804Toggle() {
    val current = BiliClient.prefs.v804lowAutoPower804
    BiliClient.prefs.v804lowAutoPower804 = !current
    AppToast.show(this, "Low Auto Power804: ${if (!current) "ON" else "OFF"}")
}

// v804: Lower Auto Bound804
internal fun PlayerActivity.showV804LowerAutoBound804Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v804lowerAutoBound804).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Lower Auto Bound804",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v804lowerAutoBound804 = value
        AppToast.show(this, "Lower Auto Bound804: $value")
    }
}

// v804: Main Auto Focus804
internal fun PlayerActivity.showV804MainAutoFocus804Toggle() {
    val current = BiliClient.prefs.v804mainAutoFocus804
    BiliClient.prefs.v804mainAutoFocus804 = !current
    AppToast.show(this, "Main Auto Focus804: ${if (!current) "ON" else "OFF"}")
}

// v804: Make Auto Build804
internal fun PlayerActivity.showV804MakeAutoBuild804Toggle() {
    val current = BiliClient.prefs.v804makeAutoBuild804
    BiliClient.prefs.v804makeAutoBuild804 = !current
    AppToast.show(this, "Make Auto Build804: ${if (!current) "ON" else "OFF"}")
}

// v804: Manage Auto Queue804
internal fun PlayerActivity.showV804ManageAutoQueue804Toggle() {
    val current = BiliClient.prefs.v804manageAutoQueue804
    BiliClient.prefs.v804manageAutoQueue804 = !current
    AppToast.show(this, "Manage Auto Queue804: ${if (!current) "ON" else "OFF"}")
}

// v804: Manifest Auto Parse804
internal fun PlayerActivity.showV804ManifestAutoParse804Toggle() {
    val current = BiliClient.prefs.v804manifestAutoParse804
    BiliClient.prefs.v804manifestAutoParse804 = !current
    AppToast.show(this, "Manifest Auto Parse804: ${if (!current) "ON" else "OFF"}")
}

// v804: Map Auto Bind804
internal fun PlayerActivity.showV804MapAutoBind804Toggle() {
    val current = BiliClient.prefs.v804mapAutoBind804
    BiliClient.prefs.v804mapAutoBind804 = !current
    AppToast.show(this, "Map Auto Bind804: ${if (!current) "ON" else "OFF"}")
}

// v804: Margin Auto Adjust804
internal fun PlayerActivity.showV804MarginAutoAdjust804Toggle() {
    val current = BiliClient.prefs.v804marginAutoAdjust804
    BiliClient.prefs.v804marginAutoAdjust804 = !current
    AppToast.show(this, "Margin Auto Adjust804: ${if (!current) "ON" else "OFF"}")
}

// v804: Mark Auto Highlight804
internal fun PlayerActivity.showV804MarkAutoHighlight804Toggle() {
    val current = BiliClient.prefs.v804markAutoHighlight804
    BiliClient.prefs.v804markAutoHighlight804 = !current
    AppToast.show(this, "Mark Auto Highlight804: ${if (!current) "ON" else "OFF"}")
}

// v804: Mask Auto Apply804
internal fun PlayerActivity.showV804MaskAutoApply804Toggle() {
    val current = BiliClient.prefs.v804maskAutoApply804
    BiliClient.prefs.v804maskAutoApply804 = !current
    AppToast.show(this, "Mask Auto Apply804: ${if (!current) "ON" else "OFF"}")
}

// v805: Log Auto Rotate805
internal fun PlayerActivity.showV805LogAutoRotate805Toggle() {
    val current = BiliClient.prefs.v805logAutoRotate805
    BiliClient.prefs.v805logAutoRotate805 = !current
    AppToast.show(this, "Log Auto Rotate805: ${if (!current) "ON" else "OFF"}")
}

// v805: Logic Auto Branch805
internal fun PlayerActivity.showV805LogicAutoBranch805Toggle() {
    val current = BiliClient.prefs.v805logicAutoBranch805
    BiliClient.prefs.v805logicAutoBranch805 = !current
    AppToast.show(this, "Logic Auto Branch805: ${if (!current) "ON" else "OFF"}")
}

// v805: Login Auto Token805
internal fun PlayerActivity.showV805LoginAutoToken805Toggle() {
    val current = BiliClient.prefs.v805loginAutoToken805
    BiliClient.prefs.v805loginAutoToken805 = !current
    AppToast.show(this, "Login Auto Token805: ${if (!current) "ON" else "OFF"}")
}

// v805: Long Auto Press805
internal fun PlayerActivity.showV805LongAutoPress805Toggle() {
    val current = BiliClient.prefs.v805longAutoPress805
    BiliClient.prefs.v805longAutoPress805 = !current
    AppToast.show(this, "Long Auto Press805: ${if (!current) "ON" else "OFF"}")
}

// v805: Loop Auto Repeat805
internal fun PlayerActivity.showV805LoopAutoRepeat805Toggle() {
    val current = BiliClient.prefs.v805loopAutoRepeat805
    BiliClient.prefs.v805loopAutoRepeat805 = !current
    AppToast.show(this, "Loop Auto Repeat805: ${if (!current) "ON" else "OFF"}")
}

// v805: Low Auto Power805
internal fun PlayerActivity.showV805LowAutoPower805Toggle() {
    val current = BiliClient.prefs.v805lowAutoPower805
    BiliClient.prefs.v805lowAutoPower805 = !current
    AppToast.show(this, "Low Auto Power805: ${if (!current) "ON" else "OFF"}")
}

// v805: Lower Auto Bound805
internal fun PlayerActivity.showV805LowerAutoBound805Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v805lowerAutoBound805).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Lower Auto Bound805",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v805lowerAutoBound805 = value
        AppToast.show(this, "Lower Auto Bound805: $value")
    }
}

// v805: Main Auto Focus805
internal fun PlayerActivity.showV805MainAutoFocus805Toggle() {
    val current = BiliClient.prefs.v805mainAutoFocus805
    BiliClient.prefs.v805mainAutoFocus805 = !current
    AppToast.show(this, "Main Auto Focus805: ${if (!current) "ON" else "OFF"}")
}

// v805: Make Auto Build805
internal fun PlayerActivity.showV805MakeAutoBuild805Toggle() {
    val current = BiliClient.prefs.v805makeAutoBuild805
    BiliClient.prefs.v805makeAutoBuild805 = !current
    AppToast.show(this, "Make Auto Build805: ${if (!current) "ON" else "OFF"}")
}

// v805: Manage Auto Queue805
internal fun PlayerActivity.showV805ManageAutoQueue805Toggle() {
    val current = BiliClient.prefs.v805manageAutoQueue805
    BiliClient.prefs.v805manageAutoQueue805 = !current
    AppToast.show(this, "Manage Auto Queue805: ${if (!current) "ON" else "OFF"}")
}

// v805: Manifest Auto Parse805
internal fun PlayerActivity.showV805ManifestAutoParse805Toggle() {
    val current = BiliClient.prefs.v805manifestAutoParse805
    BiliClient.prefs.v805manifestAutoParse805 = !current
    AppToast.show(this, "Manifest Auto Parse805: ${if (!current) "ON" else "OFF"}")
}

// v805: Map Auto Bind805
internal fun PlayerActivity.showV805MapAutoBind805Toggle() {
    val current = BiliClient.prefs.v805mapAutoBind805
    BiliClient.prefs.v805mapAutoBind805 = !current
    AppToast.show(this, "Map Auto Bind805: ${if (!current) "ON" else "OFF"}")
}

// v805: Margin Auto Adjust805
internal fun PlayerActivity.showV805MarginAutoAdjust805Toggle() {
    val current = BiliClient.prefs.v805marginAutoAdjust805
    BiliClient.prefs.v805marginAutoAdjust805 = !current
    AppToast.show(this, "Margin Auto Adjust805: ${if (!current) "ON" else "OFF"}")
}

// v805: Mark Auto Highlight805
internal fun PlayerActivity.showV805MarkAutoHighlight805Toggle() {
    val current = BiliClient.prefs.v805markAutoHighlight805
    BiliClient.prefs.v805markAutoHighlight805 = !current
    AppToast.show(this, "Mark Auto Highlight805: ${if (!current) "ON" else "OFF"}")
}

// v805: Mask Auto Apply805
internal fun PlayerActivity.showV805MaskAutoApply805Toggle() {
    val current = BiliClient.prefs.v805maskAutoApply805
    BiliClient.prefs.v805maskAutoApply805 = !current
    AppToast.show(this, "Mask Auto Apply805: ${if (!current) "ON" else "OFF"}")
}

// v806: Log Auto Rotate806
internal fun PlayerActivity.showV806LogAutoRotate806Toggle() {
    val current = BiliClient.prefs.v806logAutoRotate806
    BiliClient.prefs.v806logAutoRotate806 = !current
    AppToast.show(this, "Log Auto Rotate806: ${if (!current) "ON" else "OFF"}")
}

// v806: Logic Auto Branch806
internal fun PlayerActivity.showV806LogicAutoBranch806Toggle() {
    val current = BiliClient.prefs.v806logicAutoBranch806
    BiliClient.prefs.v806logicAutoBranch806 = !current
    AppToast.show(this, "Logic Auto Branch806: ${if (!current) "ON" else "OFF"}")
}

// v806: Login Auto Token806
internal fun PlayerActivity.showV806LoginAutoToken806Toggle() {
    val current = BiliClient.prefs.v806loginAutoToken806
    BiliClient.prefs.v806loginAutoToken806 = !current
    AppToast.show(this, "Login Auto Token806: ${if (!current) "ON" else "OFF"}")
}

// v806: Long Auto Press806
internal fun PlayerActivity.showV806LongAutoPress806Toggle() {
    val current = BiliClient.prefs.v806longAutoPress806
    BiliClient.prefs.v806longAutoPress806 = !current
    AppToast.show(this, "Long Auto Press806: ${if (!current) "ON" else "OFF"}")
}

// v806: Loop Auto Repeat806
internal fun PlayerActivity.showV806LoopAutoRepeat806Toggle() {
    val current = BiliClient.prefs.v806loopAutoRepeat806
    BiliClient.prefs.v806loopAutoRepeat806 = !current
    AppToast.show(this, "Loop Auto Repeat806: ${if (!current) "ON" else "OFF"}")
}

// v806: Low Auto Power806
internal fun PlayerActivity.showV806LowAutoPower806Toggle() {
    val current = BiliClient.prefs.v806lowAutoPower806
    BiliClient.prefs.v806lowAutoPower806 = !current
    AppToast.show(this, "Low Auto Power806: ${if (!current) "ON" else "OFF"}")
}

// v806: Lower Auto Bound806
internal fun PlayerActivity.showV806LowerAutoBound806Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v806lowerAutoBound806).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Lower Auto Bound806",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v806lowerAutoBound806 = value
        AppToast.show(this, "Lower Auto Bound806: $value")
    }
}

// v806: Main Auto Focus806
internal fun PlayerActivity.showV806MainAutoFocus806Toggle() {
    val current = BiliClient.prefs.v806mainAutoFocus806
    BiliClient.prefs.v806mainAutoFocus806 = !current
    AppToast.show(this, "Main Auto Focus806: ${if (!current) "ON" else "OFF"}")
}

// v806: Make Auto Build806
internal fun PlayerActivity.showV806MakeAutoBuild806Toggle() {
    val current = BiliClient.prefs.v806makeAutoBuild806
    BiliClient.prefs.v806makeAutoBuild806 = !current
    AppToast.show(this, "Make Auto Build806: ${if (!current) "ON" else "OFF"}")
}

// v806: Manage Auto Queue806
internal fun PlayerActivity.showV806ManageAutoQueue806Toggle() {
    val current = BiliClient.prefs.v806manageAutoQueue806
    BiliClient.prefs.v806manageAutoQueue806 = !current
    AppToast.show(this, "Manage Auto Queue806: ${if (!current) "ON" else "OFF"}")
}

// v806: Manifest Auto Parse806
internal fun PlayerActivity.showV806ManifestAutoParse806Toggle() {
    val current = BiliClient.prefs.v806manifestAutoParse806
    BiliClient.prefs.v806manifestAutoParse806 = !current
    AppToast.show(this, "Manifest Auto Parse806: ${if (!current) "ON" else "OFF"}")
}

// v806: Map Auto Bind806
internal fun PlayerActivity.showV806MapAutoBind806Toggle() {
    val current = BiliClient.prefs.v806mapAutoBind806
    BiliClient.prefs.v806mapAutoBind806 = !current
    AppToast.show(this, "Map Auto Bind806: ${if (!current) "ON" else "OFF"}")
}

// v806: Margin Auto Adjust806
internal fun PlayerActivity.showV806MarginAutoAdjust806Toggle() {
    val current = BiliClient.prefs.v806marginAutoAdjust806
    BiliClient.prefs.v806marginAutoAdjust806 = !current
    AppToast.show(this, "Margin Auto Adjust806: ${if (!current) "ON" else "OFF"}")
}

// v806: Mark Auto Highlight806
internal fun PlayerActivity.showV806MarkAutoHighlight806Toggle() {
    val current = BiliClient.prefs.v806markAutoHighlight806
    BiliClient.prefs.v806markAutoHighlight806 = !current
    AppToast.show(this, "Mark Auto Highlight806: ${if (!current) "ON" else "OFF"}")
}

// v806: Mask Auto Apply806
internal fun PlayerActivity.showV806MaskAutoApply806Toggle() {
    val current = BiliClient.prefs.v806maskAutoApply806
    BiliClient.prefs.v806maskAutoApply806 = !current
    AppToast.show(this, "Mask Auto Apply806: ${if (!current) "ON" else "OFF"}")
}

// v807: Log Auto Rotate807
internal fun PlayerActivity.showV807LogAutoRotate807Toggle() {
    val current = BiliClient.prefs.v807logAutoRotate807
    BiliClient.prefs.v807logAutoRotate807 = !current
    AppToast.show(this, "Log Auto Rotate807: ${if (!current) "ON" else "OFF"}")
}

// v807: Logic Auto Branch807
internal fun PlayerActivity.showV807LogicAutoBranch807Toggle() {
    val current = BiliClient.prefs.v807logicAutoBranch807
    BiliClient.prefs.v807logicAutoBranch807 = !current
    AppToast.show(this, "Logic Auto Branch807: ${if (!current) "ON" else "OFF"}")
}

// v807: Login Auto Token807
internal fun PlayerActivity.showV807LoginAutoToken807Toggle() {
    val current = BiliClient.prefs.v807loginAutoToken807
    BiliClient.prefs.v807loginAutoToken807 = !current
    AppToast.show(this, "Login Auto Token807: ${if (!current) "ON" else "OFF"}")
}

// v807: Long Auto Press807
internal fun PlayerActivity.showV807LongAutoPress807Toggle() {
    val current = BiliClient.prefs.v807longAutoPress807
    BiliClient.prefs.v807longAutoPress807 = !current
    AppToast.show(this, "Long Auto Press807: ${if (!current) "ON" else "OFF"}")
}

// v807: Loop Auto Repeat807
internal fun PlayerActivity.showV807LoopAutoRepeat807Toggle() {
    val current = BiliClient.prefs.v807loopAutoRepeat807
    BiliClient.prefs.v807loopAutoRepeat807 = !current
    AppToast.show(this, "Loop Auto Repeat807: ${if (!current) "ON" else "OFF"}")
}

// v807: Low Auto Power807
internal fun PlayerActivity.showV807LowAutoPower807Toggle() {
    val current = BiliClient.prefs.v807lowAutoPower807
    BiliClient.prefs.v807lowAutoPower807 = !current
    AppToast.show(this, "Low Auto Power807: ${if (!current) "ON" else "OFF"}")
}

// v807: Lower Auto Bound807
internal fun PlayerActivity.showV807LowerAutoBound807Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v807lowerAutoBound807).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Lower Auto Bound807",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v807lowerAutoBound807 = value
        AppToast.show(this, "Lower Auto Bound807: $value")
    }
}

// v807: Main Auto Focus807
internal fun PlayerActivity.showV807MainAutoFocus807Toggle() {
    val current = BiliClient.prefs.v807mainAutoFocus807
    BiliClient.prefs.v807mainAutoFocus807 = !current
    AppToast.show(this, "Main Auto Focus807: ${if (!current) "ON" else "OFF"}")
}

// v807: Make Auto Build807
internal fun PlayerActivity.showV807MakeAutoBuild807Toggle() {
    val current = BiliClient.prefs.v807makeAutoBuild807
    BiliClient.prefs.v807makeAutoBuild807 = !current
    AppToast.show(this, "Make Auto Build807: ${if (!current) "ON" else "OFF"}")
}

// v807: Manage Auto Queue807
internal fun PlayerActivity.showV807ManageAutoQueue807Toggle() {
    val current = BiliClient.prefs.v807manageAutoQueue807
    BiliClient.prefs.v807manageAutoQueue807 = !current
    AppToast.show(this, "Manage Auto Queue807: ${if (!current) "ON" else "OFF"}")
}

// v807: Manifest Auto Parse807
internal fun PlayerActivity.showV807ManifestAutoParse807Toggle() {
    val current = BiliClient.prefs.v807manifestAutoParse807
    BiliClient.prefs.v807manifestAutoParse807 = !current
    AppToast.show(this, "Manifest Auto Parse807: ${if (!current) "ON" else "OFF"}")
}

// v807: Map Auto Bind807
internal fun PlayerActivity.showV807MapAutoBind807Toggle() {
    val current = BiliClient.prefs.v807mapAutoBind807
    BiliClient.prefs.v807mapAutoBind807 = !current
    AppToast.show(this, "Map Auto Bind807: ${if (!current) "ON" else "OFF"}")
}

// v807: Margin Auto Adjust807
internal fun PlayerActivity.showV807MarginAutoAdjust807Toggle() {
    val current = BiliClient.prefs.v807marginAutoAdjust807
    BiliClient.prefs.v807marginAutoAdjust807 = !current
    AppToast.show(this, "Margin Auto Adjust807: ${if (!current) "ON" else "OFF"}")
}

// v807: Mark Auto Highlight807
internal fun PlayerActivity.showV807MarkAutoHighlight807Toggle() {
    val current = BiliClient.prefs.v807markAutoHighlight807
    BiliClient.prefs.v807markAutoHighlight807 = !current
    AppToast.show(this, "Mark Auto Highlight807: ${if (!current) "ON" else "OFF"}")
}

// v807: Mask Auto Apply807
internal fun PlayerActivity.showV807MaskAutoApply807Toggle() {
    val current = BiliClient.prefs.v807maskAutoApply807
    BiliClient.prefs.v807maskAutoApply807 = !current
    AppToast.show(this, "Mask Auto Apply807: ${if (!current) "ON" else "OFF"}")
}

// v808: Log Auto Rotate808
internal fun PlayerActivity.showV808LogAutoRotate808Toggle() {
    val current = BiliClient.prefs.v808logAutoRotate808
    BiliClient.prefs.v808logAutoRotate808 = !current
    AppToast.show(this, "Log Auto Rotate808: ${if (!current) "ON" else "OFF"}")
}

// v808: Logic Auto Branch808
internal fun PlayerActivity.showV808LogicAutoBranch808Toggle() {
    val current = BiliClient.prefs.v808logicAutoBranch808
    BiliClient.prefs.v808logicAutoBranch808 = !current
    AppToast.show(this, "Logic Auto Branch808: ${if (!current) "ON" else "OFF"}")
}

// v808: Login Auto Token808
internal fun PlayerActivity.showV808LoginAutoToken808Toggle() {
    val current = BiliClient.prefs.v808loginAutoToken808
    BiliClient.prefs.v808loginAutoToken808 = !current
    AppToast.show(this, "Login Auto Token808: ${if (!current) "ON" else "OFF"}")
}

// v808: Long Auto Press808
internal fun PlayerActivity.showV808LongAutoPress808Toggle() {
    val current = BiliClient.prefs.v808longAutoPress808
    BiliClient.prefs.v808longAutoPress808 = !current
    AppToast.show(this, "Long Auto Press808: ${if (!current) "ON" else "OFF"}")
}

// v808: Loop Auto Repeat808
internal fun PlayerActivity.showV808LoopAutoRepeat808Toggle() {
    val current = BiliClient.prefs.v808loopAutoRepeat808
    BiliClient.prefs.v808loopAutoRepeat808 = !current
    AppToast.show(this, "Loop Auto Repeat808: ${if (!current) "ON" else "OFF"}")
}

// v808: Low Auto Power808
internal fun PlayerActivity.showV808LowAutoPower808Toggle() {
    val current = BiliClient.prefs.v808lowAutoPower808
    BiliClient.prefs.v808lowAutoPower808 = !current
    AppToast.show(this, "Low Auto Power808: ${if (!current) "ON" else "OFF"}")
}

// v808: Lower Auto Bound808
internal fun PlayerActivity.showV808LowerAutoBound808Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v808lowerAutoBound808).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Lower Auto Bound808",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v808lowerAutoBound808 = value
        AppToast.show(this, "Lower Auto Bound808: $value")
    }
}

// v808: Main Auto Focus808
internal fun PlayerActivity.showV808MainAutoFocus808Toggle() {
    val current = BiliClient.prefs.v808mainAutoFocus808
    BiliClient.prefs.v808mainAutoFocus808 = !current
    AppToast.show(this, "Main Auto Focus808: ${if (!current) "ON" else "OFF"}")
}

// v808: Make Auto Build808
internal fun PlayerActivity.showV808MakeAutoBuild808Toggle() {
    val current = BiliClient.prefs.v808makeAutoBuild808
    BiliClient.prefs.v808makeAutoBuild808 = !current
    AppToast.show(this, "Make Auto Build808: ${if (!current) "ON" else "OFF"}")
}

// v808: Manage Auto Queue808
internal fun PlayerActivity.showV808ManageAutoQueue808Toggle() {
    val current = BiliClient.prefs.v808manageAutoQueue808
    BiliClient.prefs.v808manageAutoQueue808 = !current
    AppToast.show(this, "Manage Auto Queue808: ${if (!current) "ON" else "OFF"}")
}

// v808: Manifest Auto Parse808
internal fun PlayerActivity.showV808ManifestAutoParse808Toggle() {
    val current = BiliClient.prefs.v808manifestAutoParse808
    BiliClient.prefs.v808manifestAutoParse808 = !current
    AppToast.show(this, "Manifest Auto Parse808: ${if (!current) "ON" else "OFF"}")
}

// v808: Map Auto Bind808
internal fun PlayerActivity.showV808MapAutoBind808Toggle() {
    val current = BiliClient.prefs.v808mapAutoBind808
    BiliClient.prefs.v808mapAutoBind808 = !current
    AppToast.show(this, "Map Auto Bind808: ${if (!current) "ON" else "OFF"}")
}

// v808: Margin Auto Adjust808
internal fun PlayerActivity.showV808MarginAutoAdjust808Toggle() {
    val current = BiliClient.prefs.v808marginAutoAdjust808
    BiliClient.prefs.v808marginAutoAdjust808 = !current
    AppToast.show(this, "Margin Auto Adjust808: ${if (!current) "ON" else "OFF"}")
}

// v808: Mark Auto Highlight808
internal fun PlayerActivity.showV808MarkAutoHighlight808Toggle() {
    val current = BiliClient.prefs.v808markAutoHighlight808
    BiliClient.prefs.v808markAutoHighlight808 = !current
    AppToast.show(this, "Mark Auto Highlight808: ${if (!current) "ON" else "OFF"}")
}

// v808: Mask Auto Apply808
internal fun PlayerActivity.showV808MaskAutoApply808Toggle() {
    val current = BiliClient.prefs.v808maskAutoApply808
    BiliClient.prefs.v808maskAutoApply808 = !current
    AppToast.show(this, "Mask Auto Apply808: ${if (!current) "ON" else "OFF"}")
}

// v809: Log Auto Rotate809
internal fun PlayerActivity.showV809LogAutoRotate809Toggle() {
    val current = BiliClient.prefs.v809logAutoRotate809
    BiliClient.prefs.v809logAutoRotate809 = !current
    AppToast.show(this, "Log Auto Rotate809: ${if (!current) "ON" else "OFF"}")
}

// v809: Logic Auto Branch809
internal fun PlayerActivity.showV809LogicAutoBranch809Toggle() {
    val current = BiliClient.prefs.v809logicAutoBranch809
    BiliClient.prefs.v809logicAutoBranch809 = !current
    AppToast.show(this, "Logic Auto Branch809: ${if (!current) "ON" else "OFF"}")
}

// v809: Login Auto Token809
internal fun PlayerActivity.showV809LoginAutoToken809Toggle() {
    val current = BiliClient.prefs.v809loginAutoToken809
    BiliClient.prefs.v809loginAutoToken809 = !current
    AppToast.show(this, "Login Auto Token809: ${if (!current) "ON" else "OFF"}")
}

// v809: Long Auto Press809
internal fun PlayerActivity.showV809LongAutoPress809Toggle() {
    val current = BiliClient.prefs.v809longAutoPress809
    BiliClient.prefs.v809longAutoPress809 = !current
    AppToast.show(this, "Long Auto Press809: ${if (!current) "ON" else "OFF"}")
}

// v809: Loop Auto Repeat809
internal fun PlayerActivity.showV809LoopAutoRepeat809Toggle() {
    val current = BiliClient.prefs.v809loopAutoRepeat809
    BiliClient.prefs.v809loopAutoRepeat809 = !current
    AppToast.show(this, "Loop Auto Repeat809: ${if (!current) "ON" else "OFF"}")
}

// v809: Low Auto Power809
internal fun PlayerActivity.showV809LowAutoPower809Toggle() {
    val current = BiliClient.prefs.v809lowAutoPower809
    BiliClient.prefs.v809lowAutoPower809 = !current
    AppToast.show(this, "Low Auto Power809: ${if (!current) "ON" else "OFF"}")
}

// v809: Lower Auto Bound809
internal fun PlayerActivity.showV809LowerAutoBound809Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v809lowerAutoBound809).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Lower Auto Bound809",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v809lowerAutoBound809 = value
        AppToast.show(this, "Lower Auto Bound809: $value")
    }
}

// v809: Main Auto Focus809
internal fun PlayerActivity.showV809MainAutoFocus809Toggle() {
    val current = BiliClient.prefs.v809mainAutoFocus809
    BiliClient.prefs.v809mainAutoFocus809 = !current
    AppToast.show(this, "Main Auto Focus809: ${if (!current) "ON" else "OFF"}")
}

// v809: Make Auto Build809
internal fun PlayerActivity.showV809MakeAutoBuild809Toggle() {
    val current = BiliClient.prefs.v809makeAutoBuild809
    BiliClient.prefs.v809makeAutoBuild809 = !current
    AppToast.show(this, "Make Auto Build809: ${if (!current) "ON" else "OFF"}")
}

// v809: Manage Auto Queue809
internal fun PlayerActivity.showV809ManageAutoQueue809Toggle() {
    val current = BiliClient.prefs.v809manageAutoQueue809
    BiliClient.prefs.v809manageAutoQueue809 = !current
    AppToast.show(this, "Manage Auto Queue809: ${if (!current) "ON" else "OFF"}")
}

// v809: Manifest Auto Parse809
internal fun PlayerActivity.showV809ManifestAutoParse809Toggle() {
    val current = BiliClient.prefs.v809manifestAutoParse809
    BiliClient.prefs.v809manifestAutoParse809 = !current
    AppToast.show(this, "Manifest Auto Parse809: ${if (!current) "ON" else "OFF"}")
}

// v809: Map Auto Bind809
internal fun PlayerActivity.showV809MapAutoBind809Toggle() {
    val current = BiliClient.prefs.v809mapAutoBind809
    BiliClient.prefs.v809mapAutoBind809 = !current
    AppToast.show(this, "Map Auto Bind809: ${if (!current) "ON" else "OFF"}")
}

// v809: Margin Auto Adjust809
internal fun PlayerActivity.showV809MarginAutoAdjust809Toggle() {
    val current = BiliClient.prefs.v809marginAutoAdjust809
    BiliClient.prefs.v809marginAutoAdjust809 = !current
    AppToast.show(this, "Margin Auto Adjust809: ${if (!current) "ON" else "OFF"}")
}

// v809: Mark Auto Highlight809
internal fun PlayerActivity.showV809MarkAutoHighlight809Toggle() {
    val current = BiliClient.prefs.v809markAutoHighlight809
    BiliClient.prefs.v809markAutoHighlight809 = !current
    AppToast.show(this, "Mark Auto Highlight809: ${if (!current) "ON" else "OFF"}")
}

// v809: Mask Auto Apply809
internal fun PlayerActivity.showV809MaskAutoApply809Toggle() {
    val current = BiliClient.prefs.v809maskAutoApply809
    BiliClient.prefs.v809maskAutoApply809 = !current
    AppToast.show(this, "Mask Auto Apply809: ${if (!current) "ON" else "OFF"}")
}

// v810: Log Auto Rotate810
internal fun PlayerActivity.showV810LogAutoRotate810Toggle() {
    val current = BiliClient.prefs.v810logAutoRotate810
    BiliClient.prefs.v810logAutoRotate810 = !current
    AppToast.show(this, "Log Auto Rotate810: ${if (!current) "ON" else "OFF"}")
}

// v810: Logic Auto Branch810
internal fun PlayerActivity.showV810LogicAutoBranch810Toggle() {
    val current = BiliClient.prefs.v810logicAutoBranch810
    BiliClient.prefs.v810logicAutoBranch810 = !current
    AppToast.show(this, "Logic Auto Branch810: ${if (!current) "ON" else "OFF"}")
}

// v810: Login Auto Token810
internal fun PlayerActivity.showV810LoginAutoToken810Toggle() {
    val current = BiliClient.prefs.v810loginAutoToken810
    BiliClient.prefs.v810loginAutoToken810 = !current
    AppToast.show(this, "Login Auto Token810: ${if (!current) "ON" else "OFF"}")
}

// v810: Long Auto Press810
internal fun PlayerActivity.showV810LongAutoPress810Toggle() {
    val current = BiliClient.prefs.v810longAutoPress810
    BiliClient.prefs.v810longAutoPress810 = !current
    AppToast.show(this, "Long Auto Press810: ${if (!current) "ON" else "OFF"}")
}

// v810: Loop Auto Repeat810
internal fun PlayerActivity.showV810LoopAutoRepeat810Toggle() {
    val current = BiliClient.prefs.v810loopAutoRepeat810
    BiliClient.prefs.v810loopAutoRepeat810 = !current
    AppToast.show(this, "Loop Auto Repeat810: ${if (!current) "ON" else "OFF"}")
}

// v810: Low Auto Power810
internal fun PlayerActivity.showV810LowAutoPower810Toggle() {
    val current = BiliClient.prefs.v810lowAutoPower810
    BiliClient.prefs.v810lowAutoPower810 = !current
    AppToast.show(this, "Low Auto Power810: ${if (!current) "ON" else "OFF"}")
}

// v810: Lower Auto Bound810
internal fun PlayerActivity.showV810LowerAutoBound810Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v810lowerAutoBound810).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Lower Auto Bound810",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v810lowerAutoBound810 = value
        AppToast.show(this, "Lower Auto Bound810: $value")
    }
}

// v810: Main Auto Focus810
internal fun PlayerActivity.showV810MainAutoFocus810Toggle() {
    val current = BiliClient.prefs.v810mainAutoFocus810
    BiliClient.prefs.v810mainAutoFocus810 = !current
    AppToast.show(this, "Main Auto Focus810: ${if (!current) "ON" else "OFF"}")
}

// v810: Make Auto Build810
internal fun PlayerActivity.showV810MakeAutoBuild810Toggle() {
    val current = BiliClient.prefs.v810makeAutoBuild810
    BiliClient.prefs.v810makeAutoBuild810 = !current
    AppToast.show(this, "Make Auto Build810: ${if (!current) "ON" else "OFF"}")
}

// v810: Manage Auto Queue810
internal fun PlayerActivity.showV810ManageAutoQueue810Toggle() {
    val current = BiliClient.prefs.v810manageAutoQueue810
    BiliClient.prefs.v810manageAutoQueue810 = !current
    AppToast.show(this, "Manage Auto Queue810: ${if (!current) "ON" else "OFF"}")
}

// v810: Manifest Auto Parse810
internal fun PlayerActivity.showV810ManifestAutoParse810Toggle() {
    val current = BiliClient.prefs.v810manifestAutoParse810
    BiliClient.prefs.v810manifestAutoParse810 = !current
    AppToast.show(this, "Manifest Auto Parse810: ${if (!current) "ON" else "OFF"}")
}

// v810: Map Auto Bind810
internal fun PlayerActivity.showV810MapAutoBind810Toggle() {
    val current = BiliClient.prefs.v810mapAutoBind810
    BiliClient.prefs.v810mapAutoBind810 = !current
    AppToast.show(this, "Map Auto Bind810: ${if (!current) "ON" else "OFF"}")
}

// v810: Margin Auto Adjust810
internal fun PlayerActivity.showV810MarginAutoAdjust810Toggle() {
    val current = BiliClient.prefs.v810marginAutoAdjust810
    BiliClient.prefs.v810marginAutoAdjust810 = !current
    AppToast.show(this, "Margin Auto Adjust810: ${if (!current) "ON" else "OFF"}")
}

// v810: Mark Auto Highlight810
internal fun PlayerActivity.showV810MarkAutoHighlight810Toggle() {
    val current = BiliClient.prefs.v810markAutoHighlight810
    BiliClient.prefs.v810markAutoHighlight810 = !current
    AppToast.show(this, "Mark Auto Highlight810: ${if (!current) "ON" else "OFF"}")
}

// v810: Mask Auto Apply810
internal fun PlayerActivity.showV810MaskAutoApply810Toggle() {
    val current = BiliClient.prefs.v810maskAutoApply810
    BiliClient.prefs.v810maskAutoApply810 = !current
    AppToast.show(this, "Mask Auto Apply810: ${if (!current) "ON" else "OFF"}")
}

