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

internal fun PlayerActivity.showV601ApiAutoCall601Toggle() {
    val current = BiliClient.prefs.v601apiAutoCall601
    BiliClient.prefs.v601apiAutoCall601 = !current
    AppToast.show(this, "API Auto Call601: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV601ArchiveAutoSave601Toggle() {
    val current = BiliClient.prefs.v601archiveAutoSave601
    BiliClient.prefs.v601archiveAutoSave601 = !current
    AppToast.show(this, "Archive Auto Save601: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV601AreaAutoDetect601Toggle() {
    val current = BiliClient.prefs.v601areaAutoDetect601
    BiliClient.prefs.v601areaAutoDetect601 = !current
    AppToast.show(this, "Area Auto Detect601: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV601ArrayAutoSort601Toggle() {
    val current = BiliClient.prefs.v601arrayAutoSort601
    BiliClient.prefs.v601arrayAutoSort601 = !current
    AppToast.show(this, "Array Auto Sort601: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602ActionAutoRepeat602Toggle() {
    val current = BiliClient.prefs.v602actionAutoRepeat602
    BiliClient.prefs.v602actionAutoRepeat602 = !current
    AppToast.show(this, "Action Auto Repeat602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602AdapterAutoSwitch602Toggle() {
    val current = BiliClient.prefs.v602adapterAutoSwitch602
    BiliClient.prefs.v602adapterAutoSwitch602 = !current
    AppToast.show(this, "Adapter Auto Switch602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602AgentAutoConnect602Toggle() {
    val current = BiliClient.prefs.v602agentAutoConnect602
    BiliClient.prefs.v602agentAutoConnect602 = !current
    AppToast.show(this, "Agent Auto Connect602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602AliasAutoResolve602Toggle() {
    val current = BiliClient.prefs.v602aliasAutoResolve602
    BiliClient.prefs.v602aliasAutoResolve602 = !current
    AppToast.show(this, "Alias Auto Resolve602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602AlignAutoCenter602Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v602alignAutoCenter602).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center602",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v602alignAutoCenter602 = value
        AppToast.show(this, "Align Auto Center602: $value")
    }
}

internal fun PlayerActivity.showV602AliveAutoKeep602Toggle() {
    val current = BiliClient.prefs.v602aliveAutoKeep602
    BiliClient.prefs.v602aliveAutoKeep602 = !current
    AppToast.show(this, "Alive Auto Keep602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602AlphaAutoFade602Toggle() {
    val current = BiliClient.prefs.v602alphaAutoFade602
    BiliClient.prefs.v602alphaAutoFade602 = !current
    AppToast.show(this, "Alpha Auto Fade602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602AmbientAutoLight602Toggle() {
    val current = BiliClient.prefs.v602ambientAutoLight602
    BiliClient.prefs.v602ambientAutoLight602 = !current
    AppToast.show(this, "Ambient Auto Light602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602AmountAutoLimit602Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v602amountAutoLimit602).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit602",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v602amountAutoLimit602 = value
        AppToast.show(this, "Amount Auto Limit602: $value")
    }
}

internal fun PlayerActivity.showV602AngleAutoRotate602Toggle() {
    val current = BiliClient.prefs.v602angleAutoRotate602
    BiliClient.prefs.v602angleAutoRotate602 = !current
    AppToast.show(this, "Angle Auto Rotate602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602AnswerAutoReply602Toggle() {
    val current = BiliClient.prefs.v602answerAutoReply602
    BiliClient.prefs.v602answerAutoReply602 = !current
    AppToast.show(this, "Answer Auto Reply602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602ApiAutoCall602Toggle() {
    val current = BiliClient.prefs.v602apiAutoCall602
    BiliClient.prefs.v602apiAutoCall602 = !current
    AppToast.show(this, "API Auto Call602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602ArchiveAutoSave602Toggle() {
    val current = BiliClient.prefs.v602archiveAutoSave602
    BiliClient.prefs.v602archiveAutoSave602 = !current
    AppToast.show(this, "Archive Auto Save602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602AreaAutoDetect602Toggle() {
    val current = BiliClient.prefs.v602areaAutoDetect602
    BiliClient.prefs.v602areaAutoDetect602 = !current
    AppToast.show(this, "Area Auto Detect602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV602ArrayAutoSort602Toggle() {
    val current = BiliClient.prefs.v602arrayAutoSort602
    BiliClient.prefs.v602arrayAutoSort602 = !current
    AppToast.show(this, "Array Auto Sort602: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603ActionAutoRepeat603Toggle() {
    val current = BiliClient.prefs.v603actionAutoRepeat603
    BiliClient.prefs.v603actionAutoRepeat603 = !current
    AppToast.show(this, "Action Auto Repeat603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603AdapterAutoSwitch603Toggle() {
    val current = BiliClient.prefs.v603adapterAutoSwitch603
    BiliClient.prefs.v603adapterAutoSwitch603 = !current
    AppToast.show(this, "Adapter Auto Switch603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603AgentAutoConnect603Toggle() {
    val current = BiliClient.prefs.v603agentAutoConnect603
    BiliClient.prefs.v603agentAutoConnect603 = !current
    AppToast.show(this, "Agent Auto Connect603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603AliasAutoResolve603Toggle() {
    val current = BiliClient.prefs.v603aliasAutoResolve603
    BiliClient.prefs.v603aliasAutoResolve603 = !current
    AppToast.show(this, "Alias Auto Resolve603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603AlignAutoCenter603Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v603alignAutoCenter603).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center603",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v603alignAutoCenter603 = value
        AppToast.show(this, "Align Auto Center603: $value")
    }
}

internal fun PlayerActivity.showV603AliveAutoKeep603Toggle() {
    val current = BiliClient.prefs.v603aliveAutoKeep603
    BiliClient.prefs.v603aliveAutoKeep603 = !current
    AppToast.show(this, "Alive Auto Keep603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603AlphaAutoFade603Toggle() {
    val current = BiliClient.prefs.v603alphaAutoFade603
    BiliClient.prefs.v603alphaAutoFade603 = !current
    AppToast.show(this, "Alpha Auto Fade603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603AmbientAutoLight603Toggle() {
    val current = BiliClient.prefs.v603ambientAutoLight603
    BiliClient.prefs.v603ambientAutoLight603 = !current
    AppToast.show(this, "Ambient Auto Light603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603AmountAutoLimit603Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v603amountAutoLimit603).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit603",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v603amountAutoLimit603 = value
        AppToast.show(this, "Amount Auto Limit603: $value")
    }
}

internal fun PlayerActivity.showV603AngleAutoRotate603Toggle() {
    val current = BiliClient.prefs.v603angleAutoRotate603
    BiliClient.prefs.v603angleAutoRotate603 = !current
    AppToast.show(this, "Angle Auto Rotate603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603AnswerAutoReply603Toggle() {
    val current = BiliClient.prefs.v603answerAutoReply603
    BiliClient.prefs.v603answerAutoReply603 = !current
    AppToast.show(this, "Answer Auto Reply603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603ApiAutoCall603Toggle() {
    val current = BiliClient.prefs.v603apiAutoCall603
    BiliClient.prefs.v603apiAutoCall603 = !current
    AppToast.show(this, "API Auto Call603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603ArchiveAutoSave603Toggle() {
    val current = BiliClient.prefs.v603archiveAutoSave603
    BiliClient.prefs.v603archiveAutoSave603 = !current
    AppToast.show(this, "Archive Auto Save603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603AreaAutoDetect603Toggle() {
    val current = BiliClient.prefs.v603areaAutoDetect603
    BiliClient.prefs.v603areaAutoDetect603 = !current
    AppToast.show(this, "Area Auto Detect603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV603ArrayAutoSort603Toggle() {
    val current = BiliClient.prefs.v603arrayAutoSort603
    BiliClient.prefs.v603arrayAutoSort603 = !current
    AppToast.show(this, "Array Auto Sort603: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604ActionAutoRepeat604Toggle() {
    val current = BiliClient.prefs.v604actionAutoRepeat604
    BiliClient.prefs.v604actionAutoRepeat604 = !current
    AppToast.show(this, "Action Auto Repeat604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604AdapterAutoSwitch604Toggle() {
    val current = BiliClient.prefs.v604adapterAutoSwitch604
    BiliClient.prefs.v604adapterAutoSwitch604 = !current
    AppToast.show(this, "Adapter Auto Switch604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604AgentAutoConnect604Toggle() {
    val current = BiliClient.prefs.v604agentAutoConnect604
    BiliClient.prefs.v604agentAutoConnect604 = !current
    AppToast.show(this, "Agent Auto Connect604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604AliasAutoResolve604Toggle() {
    val current = BiliClient.prefs.v604aliasAutoResolve604
    BiliClient.prefs.v604aliasAutoResolve604 = !current
    AppToast.show(this, "Alias Auto Resolve604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604AlignAutoCenter604Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v604alignAutoCenter604).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center604",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v604alignAutoCenter604 = value
        AppToast.show(this, "Align Auto Center604: $value")
    }
}

internal fun PlayerActivity.showV604AliveAutoKeep604Toggle() {
    val current = BiliClient.prefs.v604aliveAutoKeep604
    BiliClient.prefs.v604aliveAutoKeep604 = !current
    AppToast.show(this, "Alive Auto Keep604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604AlphaAutoFade604Toggle() {
    val current = BiliClient.prefs.v604alphaAutoFade604
    BiliClient.prefs.v604alphaAutoFade604 = !current
    AppToast.show(this, "Alpha Auto Fade604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604AmbientAutoLight604Toggle() {
    val current = BiliClient.prefs.v604ambientAutoLight604
    BiliClient.prefs.v604ambientAutoLight604 = !current
    AppToast.show(this, "Ambient Auto Light604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604AmountAutoLimit604Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v604amountAutoLimit604).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit604",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v604amountAutoLimit604 = value
        AppToast.show(this, "Amount Auto Limit604: $value")
    }
}

internal fun PlayerActivity.showV604AngleAutoRotate604Toggle() {
    val current = BiliClient.prefs.v604angleAutoRotate604
    BiliClient.prefs.v604angleAutoRotate604 = !current
    AppToast.show(this, "Angle Auto Rotate604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604AnswerAutoReply604Toggle() {
    val current = BiliClient.prefs.v604answerAutoReply604
    BiliClient.prefs.v604answerAutoReply604 = !current
    AppToast.show(this, "Answer Auto Reply604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604ApiAutoCall604Toggle() {
    val current = BiliClient.prefs.v604apiAutoCall604
    BiliClient.prefs.v604apiAutoCall604 = !current
    AppToast.show(this, "API Auto Call604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604ArchiveAutoSave604Toggle() {
    val current = BiliClient.prefs.v604archiveAutoSave604
    BiliClient.prefs.v604archiveAutoSave604 = !current
    AppToast.show(this, "Archive Auto Save604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604AreaAutoDetect604Toggle() {
    val current = BiliClient.prefs.v604areaAutoDetect604
    BiliClient.prefs.v604areaAutoDetect604 = !current
    AppToast.show(this, "Area Auto Detect604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV604ArrayAutoSort604Toggle() {
    val current = BiliClient.prefs.v604arrayAutoSort604
    BiliClient.prefs.v604arrayAutoSort604 = !current
    AppToast.show(this, "Array Auto Sort604: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605ActionAutoRepeat605Toggle() {
    val current = BiliClient.prefs.v605actionAutoRepeat605
    BiliClient.prefs.v605actionAutoRepeat605 = !current
    AppToast.show(this, "Action Auto Repeat605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605AdapterAutoSwitch605Toggle() {
    val current = BiliClient.prefs.v605adapterAutoSwitch605
    BiliClient.prefs.v605adapterAutoSwitch605 = !current
    AppToast.show(this, "Adapter Auto Switch605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605AgentAutoConnect605Toggle() {
    val current = BiliClient.prefs.v605agentAutoConnect605
    BiliClient.prefs.v605agentAutoConnect605 = !current
    AppToast.show(this, "Agent Auto Connect605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605AliasAutoResolve605Toggle() {
    val current = BiliClient.prefs.v605aliasAutoResolve605
    BiliClient.prefs.v605aliasAutoResolve605 = !current
    AppToast.show(this, "Alias Auto Resolve605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605AlignAutoCenter605Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v605alignAutoCenter605).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center605",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v605alignAutoCenter605 = value
        AppToast.show(this, "Align Auto Center605: $value")
    }
}

internal fun PlayerActivity.showV605AliveAutoKeep605Toggle() {
    val current = BiliClient.prefs.v605aliveAutoKeep605
    BiliClient.prefs.v605aliveAutoKeep605 = !current
    AppToast.show(this, "Alive Auto Keep605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605AlphaAutoFade605Toggle() {
    val current = BiliClient.prefs.v605alphaAutoFade605
    BiliClient.prefs.v605alphaAutoFade605 = !current
    AppToast.show(this, "Alpha Auto Fade605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605AmbientAutoLight605Toggle() {
    val current = BiliClient.prefs.v605ambientAutoLight605
    BiliClient.prefs.v605ambientAutoLight605 = !current
    AppToast.show(this, "Ambient Auto Light605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605AmountAutoLimit605Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v605amountAutoLimit605).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit605",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v605amountAutoLimit605 = value
        AppToast.show(this, "Amount Auto Limit605: $value")
    }
}

internal fun PlayerActivity.showV605AngleAutoRotate605Toggle() {
    val current = BiliClient.prefs.v605angleAutoRotate605
    BiliClient.prefs.v605angleAutoRotate605 = !current
    AppToast.show(this, "Angle Auto Rotate605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605AnswerAutoReply605Toggle() {
    val current = BiliClient.prefs.v605answerAutoReply605
    BiliClient.prefs.v605answerAutoReply605 = !current
    AppToast.show(this, "Answer Auto Reply605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605ApiAutoCall605Toggle() {
    val current = BiliClient.prefs.v605apiAutoCall605
    BiliClient.prefs.v605apiAutoCall605 = !current
    AppToast.show(this, "API Auto Call605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605ArchiveAutoSave605Toggle() {
    val current = BiliClient.prefs.v605archiveAutoSave605
    BiliClient.prefs.v605archiveAutoSave605 = !current
    AppToast.show(this, "Archive Auto Save605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605AreaAutoDetect605Toggle() {
    val current = BiliClient.prefs.v605areaAutoDetect605
    BiliClient.prefs.v605areaAutoDetect605 = !current
    AppToast.show(this, "Area Auto Detect605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV605ArrayAutoSort605Toggle() {
    val current = BiliClient.prefs.v605arrayAutoSort605
    BiliClient.prefs.v605arrayAutoSort605 = !current
    AppToast.show(this, "Array Auto Sort605: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606ActionAutoRepeat606Toggle() {
    val current = BiliClient.prefs.v606actionAutoRepeat606
    BiliClient.prefs.v606actionAutoRepeat606 = !current
    AppToast.show(this, "Action Auto Repeat606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606AdapterAutoSwitch606Toggle() {
    val current = BiliClient.prefs.v606adapterAutoSwitch606
    BiliClient.prefs.v606adapterAutoSwitch606 = !current
    AppToast.show(this, "Adapter Auto Switch606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606AgentAutoConnect606Toggle() {
    val current = BiliClient.prefs.v606agentAutoConnect606
    BiliClient.prefs.v606agentAutoConnect606 = !current
    AppToast.show(this, "Agent Auto Connect606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606AliasAutoResolve606Toggle() {
    val current = BiliClient.prefs.v606aliasAutoResolve606
    BiliClient.prefs.v606aliasAutoResolve606 = !current
    AppToast.show(this, "Alias Auto Resolve606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606AlignAutoCenter606Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v606alignAutoCenter606).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center606",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v606alignAutoCenter606 = value
        AppToast.show(this, "Align Auto Center606: $value")
    }
}

internal fun PlayerActivity.showV606AliveAutoKeep606Toggle() {
    val current = BiliClient.prefs.v606aliveAutoKeep606
    BiliClient.prefs.v606aliveAutoKeep606 = !current
    AppToast.show(this, "Alive Auto Keep606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606AlphaAutoFade606Toggle() {
    val current = BiliClient.prefs.v606alphaAutoFade606
    BiliClient.prefs.v606alphaAutoFade606 = !current
    AppToast.show(this, "Alpha Auto Fade606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606AmbientAutoLight606Toggle() {
    val current = BiliClient.prefs.v606ambientAutoLight606
    BiliClient.prefs.v606ambientAutoLight606 = !current
    AppToast.show(this, "Ambient Auto Light606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606AmountAutoLimit606Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v606amountAutoLimit606).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit606",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v606amountAutoLimit606 = value
        AppToast.show(this, "Amount Auto Limit606: $value")
    }
}

internal fun PlayerActivity.showV606AngleAutoRotate606Toggle() {
    val current = BiliClient.prefs.v606angleAutoRotate606
    BiliClient.prefs.v606angleAutoRotate606 = !current
    AppToast.show(this, "Angle Auto Rotate606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606AnswerAutoReply606Toggle() {
    val current = BiliClient.prefs.v606answerAutoReply606
    BiliClient.prefs.v606answerAutoReply606 = !current
    AppToast.show(this, "Answer Auto Reply606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606ApiAutoCall606Toggle() {
    val current = BiliClient.prefs.v606apiAutoCall606
    BiliClient.prefs.v606apiAutoCall606 = !current
    AppToast.show(this, "API Auto Call606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606ArchiveAutoSave606Toggle() {
    val current = BiliClient.prefs.v606archiveAutoSave606
    BiliClient.prefs.v606archiveAutoSave606 = !current
    AppToast.show(this, "Archive Auto Save606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606AreaAutoDetect606Toggle() {
    val current = BiliClient.prefs.v606areaAutoDetect606
    BiliClient.prefs.v606areaAutoDetect606 = !current
    AppToast.show(this, "Area Auto Detect606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV606ArrayAutoSort606Toggle() {
    val current = BiliClient.prefs.v606arrayAutoSort606
    BiliClient.prefs.v606arrayAutoSort606 = !current
    AppToast.show(this, "Array Auto Sort606: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607ActionAutoRepeat607Toggle() {
    val current = BiliClient.prefs.v607actionAutoRepeat607
    BiliClient.prefs.v607actionAutoRepeat607 = !current
    AppToast.show(this, "Action Auto Repeat607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607AdapterAutoSwitch607Toggle() {
    val current = BiliClient.prefs.v607adapterAutoSwitch607
    BiliClient.prefs.v607adapterAutoSwitch607 = !current
    AppToast.show(this, "Adapter Auto Switch607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607AgentAutoConnect607Toggle() {
    val current = BiliClient.prefs.v607agentAutoConnect607
    BiliClient.prefs.v607agentAutoConnect607 = !current
    AppToast.show(this, "Agent Auto Connect607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607AliasAutoResolve607Toggle() {
    val current = BiliClient.prefs.v607aliasAutoResolve607
    BiliClient.prefs.v607aliasAutoResolve607 = !current
    AppToast.show(this, "Alias Auto Resolve607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607AlignAutoCenter607Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v607alignAutoCenter607).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center607",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v607alignAutoCenter607 = value
        AppToast.show(this, "Align Auto Center607: $value")
    }
}

internal fun PlayerActivity.showV607AliveAutoKeep607Toggle() {
    val current = BiliClient.prefs.v607aliveAutoKeep607
    BiliClient.prefs.v607aliveAutoKeep607 = !current
    AppToast.show(this, "Alive Auto Keep607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607AlphaAutoFade607Toggle() {
    val current = BiliClient.prefs.v607alphaAutoFade607
    BiliClient.prefs.v607alphaAutoFade607 = !current
    AppToast.show(this, "Alpha Auto Fade607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607AmbientAutoLight607Toggle() {
    val current = BiliClient.prefs.v607ambientAutoLight607
    BiliClient.prefs.v607ambientAutoLight607 = !current
    AppToast.show(this, "Ambient Auto Light607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607AmountAutoLimit607Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v607amountAutoLimit607).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit607",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v607amountAutoLimit607 = value
        AppToast.show(this, "Amount Auto Limit607: $value")
    }
}

internal fun PlayerActivity.showV607AngleAutoRotate607Toggle() {
    val current = BiliClient.prefs.v607angleAutoRotate607
    BiliClient.prefs.v607angleAutoRotate607 = !current
    AppToast.show(this, "Angle Auto Rotate607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607AnswerAutoReply607Toggle() {
    val current = BiliClient.prefs.v607answerAutoReply607
    BiliClient.prefs.v607answerAutoReply607 = !current
    AppToast.show(this, "Answer Auto Reply607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607ApiAutoCall607Toggle() {
    val current = BiliClient.prefs.v607apiAutoCall607
    BiliClient.prefs.v607apiAutoCall607 = !current
    AppToast.show(this, "API Auto Call607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607ArchiveAutoSave607Toggle() {
    val current = BiliClient.prefs.v607archiveAutoSave607
    BiliClient.prefs.v607archiveAutoSave607 = !current
    AppToast.show(this, "Archive Auto Save607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607AreaAutoDetect607Toggle() {
    val current = BiliClient.prefs.v607areaAutoDetect607
    BiliClient.prefs.v607areaAutoDetect607 = !current
    AppToast.show(this, "Area Auto Detect607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV607ArrayAutoSort607Toggle() {
    val current = BiliClient.prefs.v607arrayAutoSort607
    BiliClient.prefs.v607arrayAutoSort607 = !current
    AppToast.show(this, "Array Auto Sort607: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608ActionAutoRepeat608Toggle() {
    val current = BiliClient.prefs.v608actionAutoRepeat608
    BiliClient.prefs.v608actionAutoRepeat608 = !current
    AppToast.show(this, "Action Auto Repeat608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608AdapterAutoSwitch608Toggle() {
    val current = BiliClient.prefs.v608adapterAutoSwitch608
    BiliClient.prefs.v608adapterAutoSwitch608 = !current
    AppToast.show(this, "Adapter Auto Switch608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608AgentAutoConnect608Toggle() {
    val current = BiliClient.prefs.v608agentAutoConnect608
    BiliClient.prefs.v608agentAutoConnect608 = !current
    AppToast.show(this, "Agent Auto Connect608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608AliasAutoResolve608Toggle() {
    val current = BiliClient.prefs.v608aliasAutoResolve608
    BiliClient.prefs.v608aliasAutoResolve608 = !current
    AppToast.show(this, "Alias Auto Resolve608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608AlignAutoCenter608Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v608alignAutoCenter608).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center608",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v608alignAutoCenter608 = value
        AppToast.show(this, "Align Auto Center608: $value")
    }
}

internal fun PlayerActivity.showV608AliveAutoKeep608Toggle() {
    val current = BiliClient.prefs.v608aliveAutoKeep608
    BiliClient.prefs.v608aliveAutoKeep608 = !current
    AppToast.show(this, "Alive Auto Keep608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608AlphaAutoFade608Toggle() {
    val current = BiliClient.prefs.v608alphaAutoFade608
    BiliClient.prefs.v608alphaAutoFade608 = !current
    AppToast.show(this, "Alpha Auto Fade608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608AmbientAutoLight608Toggle() {
    val current = BiliClient.prefs.v608ambientAutoLight608
    BiliClient.prefs.v608ambientAutoLight608 = !current
    AppToast.show(this, "Ambient Auto Light608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608AmountAutoLimit608Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v608amountAutoLimit608).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit608",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v608amountAutoLimit608 = value
        AppToast.show(this, "Amount Auto Limit608: $value")
    }
}

internal fun PlayerActivity.showV608AngleAutoRotate608Toggle() {
    val current = BiliClient.prefs.v608angleAutoRotate608
    BiliClient.prefs.v608angleAutoRotate608 = !current
    AppToast.show(this, "Angle Auto Rotate608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608AnswerAutoReply608Toggle() {
    val current = BiliClient.prefs.v608answerAutoReply608
    BiliClient.prefs.v608answerAutoReply608 = !current
    AppToast.show(this, "Answer Auto Reply608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608ApiAutoCall608Toggle() {
    val current = BiliClient.prefs.v608apiAutoCall608
    BiliClient.prefs.v608apiAutoCall608 = !current
    AppToast.show(this, "API Auto Call608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608ArchiveAutoSave608Toggle() {
    val current = BiliClient.prefs.v608archiveAutoSave608
    BiliClient.prefs.v608archiveAutoSave608 = !current
    AppToast.show(this, "Archive Auto Save608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608AreaAutoDetect608Toggle() {
    val current = BiliClient.prefs.v608areaAutoDetect608
    BiliClient.prefs.v608areaAutoDetect608 = !current
    AppToast.show(this, "Area Auto Detect608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV608ArrayAutoSort608Toggle() {
    val current = BiliClient.prefs.v608arrayAutoSort608
    BiliClient.prefs.v608arrayAutoSort608 = !current
    AppToast.show(this, "Array Auto Sort608: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609ActionAutoRepeat609Toggle() {
    val current = BiliClient.prefs.v609actionAutoRepeat609
    BiliClient.prefs.v609actionAutoRepeat609 = !current
    AppToast.show(this, "Action Auto Repeat609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609AdapterAutoSwitch609Toggle() {
    val current = BiliClient.prefs.v609adapterAutoSwitch609
    BiliClient.prefs.v609adapterAutoSwitch609 = !current
    AppToast.show(this, "Adapter Auto Switch609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609AgentAutoConnect609Toggle() {
    val current = BiliClient.prefs.v609agentAutoConnect609
    BiliClient.prefs.v609agentAutoConnect609 = !current
    AppToast.show(this, "Agent Auto Connect609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609AliasAutoResolve609Toggle() {
    val current = BiliClient.prefs.v609aliasAutoResolve609
    BiliClient.prefs.v609aliasAutoResolve609 = !current
    AppToast.show(this, "Alias Auto Resolve609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609AlignAutoCenter609Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v609alignAutoCenter609).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Align Auto Center609",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v609alignAutoCenter609 = value
        AppToast.show(this, "Align Auto Center609: $value")
    }
}

internal fun PlayerActivity.showV609AliveAutoKeep609Toggle() {
    val current = BiliClient.prefs.v609aliveAutoKeep609
    BiliClient.prefs.v609aliveAutoKeep609 = !current
    AppToast.show(this, "Alive Auto Keep609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609AlphaAutoFade609Toggle() {
    val current = BiliClient.prefs.v609alphaAutoFade609
    BiliClient.prefs.v609alphaAutoFade609 = !current
    AppToast.show(this, "Alpha Auto Fade609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609AmbientAutoLight609Toggle() {
    val current = BiliClient.prefs.v609ambientAutoLight609
    BiliClient.prefs.v609ambientAutoLight609 = !current
    AppToast.show(this, "Ambient Auto Light609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609AmountAutoLimit609Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v609amountAutoLimit609).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Amount Auto Limit609",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v609amountAutoLimit609 = value
        AppToast.show(this, "Amount Auto Limit609: $value")
    }
}

internal fun PlayerActivity.showV609AngleAutoRotate609Toggle() {
    val current = BiliClient.prefs.v609angleAutoRotate609
    BiliClient.prefs.v609angleAutoRotate609 = !current
    AppToast.show(this, "Angle Auto Rotate609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609AnswerAutoReply609Toggle() {
    val current = BiliClient.prefs.v609answerAutoReply609
    BiliClient.prefs.v609answerAutoReply609 = !current
    AppToast.show(this, "Answer Auto Reply609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609ApiAutoCall609Toggle() {
    val current = BiliClient.prefs.v609apiAutoCall609
    BiliClient.prefs.v609apiAutoCall609 = !current
    AppToast.show(this, "API Auto Call609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609ArchiveAutoSave609Toggle() {
    val current = BiliClient.prefs.v609archiveAutoSave609
    BiliClient.prefs.v609archiveAutoSave609 = !current
    AppToast.show(this, "Archive Auto Save609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609AreaAutoDetect609Toggle() {
    val current = BiliClient.prefs.v609areaAutoDetect609
    BiliClient.prefs.v609areaAutoDetect609 = !current
    AppToast.show(this, "Area Auto Detect609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV609ArrayAutoSort609Toggle() {
    val current = BiliClient.prefs.v609arrayAutoSort609
    BiliClient.prefs.v609arrayAutoSort609 = !current
    AppToast.show(this, "Array Auto Sort609: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV610ActionAutoRepeat610Toggle() {
    val current = BiliClient.prefs.v610actionAutoRepeat610
    BiliClient.prefs.v610actionAutoRepeat610 = !current
    AppToast.show(this, "Action Auto Repeat610: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV610AdapterAutoSwitch610Toggle() {
    val current = BiliClient.prefs.v610adapterAutoSwitch610
    BiliClient.prefs.v610adapterAutoSwitch610 = !current
    AppToast.show(this, "Adapter Auto Switch610: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV610AgentAutoConnect610Toggle() {
    val current = BiliClient.prefs.v610agentAutoConnect610
    BiliClient.prefs.v610agentAutoConnect610 = !current
    AppToast.show(this, "Agent Auto Connect610: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV610AliasAutoResolve610Toggle() {
    val current = BiliClient.prefs.v610aliasAutoResolve610
    BiliClient.prefs.v610aliasAutoResolve610 = !current
    AppToast.show(this, "Alias Auto Resolve610: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV610AliveAutoKeep610Toggle() {
    val current = BiliClient.prefs.v610aliveAutoKeep610
    BiliClient.prefs.v610aliveAutoKeep610 = !current
    AppToast.show(this, "Alive Auto Keep610: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV610AlphaAutoFade610Toggle() {
    val current = BiliClient.prefs.v610alphaAutoFade610
    BiliClient.prefs.v610alphaAutoFade610 = !current
    AppToast.show(this, "Alpha Auto Fade610: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV610AmbientAutoLight610Toggle() {
    val current = BiliClient.prefs.v610ambientAutoLight610
    BiliClient.prefs.v610ambientAutoLight610 = !current
    AppToast.show(this, "Ambient Auto Light610: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV610AngleAutoRotate610Toggle() {
    val current = BiliClient.prefs.v610angleAutoRotate610
    BiliClient.prefs.v610angleAutoRotate610 = !current
    AppToast.show(this, "Angle Auto Rotate610: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV610AnswerAutoReply610Toggle() {
    val current = BiliClient.prefs.v610answerAutoReply610
    BiliClient.prefs.v610answerAutoReply610 = !current
    AppToast.show(this, "Answer Auto Reply610: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV610ApiAutoCall610Toggle() {
    val current = BiliClient.prefs.v610apiAutoCall610
    BiliClient.prefs.v610apiAutoCall610 = !current
    AppToast.show(this, "API Auto Call610: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV610ArchiveAutoSave610Toggle() {
    val current = BiliClient.prefs.v610archiveAutoSave610
    BiliClient.prefs.v610archiveAutoSave610 = !current
    AppToast.show(this, "Archive Auto Save610: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV610AreaAutoDetect610Toggle() {
    val current = BiliClient.prefs.v610areaAutoDetect610
    BiliClient.prefs.v610areaAutoDetect610 = !current
    AppToast.show(this, "Area Auto Detect610: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV610ArrayAutoSort610Toggle() {
    val current = BiliClient.prefs.v610arrayAutoSort610
    BiliClient.prefs.v610arrayAutoSort610 = !current
    AppToast.show(this, "Array Auto Sort610: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611ArrowAutoNavigate611Toggle() {
    val current = BiliClient.prefs.v611arrowAutoNavigate611
    BiliClient.prefs.v611arrowAutoNavigate611 = !current
    AppToast.show(this, "Arrow Auto Navigate611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611AssetAutoLoad611Toggle() {
    val current = BiliClient.prefs.v611assetAutoLoad611
    BiliClient.prefs.v611assetAutoLoad611 = !current
    AppToast.show(this, "Asset Auto Load611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611AssignAutoTask611Toggle() {
    val current = BiliClient.prefs.v611assignAutoTask611
    BiliClient.prefs.v611assignAutoTask611 = !current
    AppToast.show(this, "Assign Auto Task611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611AsyncAutoExecute611Toggle() {
    val current = BiliClient.prefs.v611asyncAutoExecute611
    BiliClient.prefs.v611asyncAutoExecute611 = !current
    AppToast.show(this, "Async Auto Execute611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611AttackAutoBlock611Toggle() {
    val current = BiliClient.prefs.v611attackAutoBlock611
    BiliClient.prefs.v611attackAutoBlock611 = !current
    AppToast.show(this, "Attack Auto Block611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611AvatarAutoUpdate611Toggle() {
    val current = BiliClient.prefs.v611avatarAutoUpdate611
    BiliClient.prefs.v611avatarAutoUpdate611 = !current
    AppToast.show(this, "Avatar Auto Update611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611BackAutoSave611Toggle() {
    val current = BiliClient.prefs.v611backAutoSave611
    BiliClient.prefs.v611backAutoSave611 = !current
    AppToast.show(this, "Back Auto Save611: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV611BandAutoWidth611Toggle() {
    val current = BiliClient.prefs.v611bandAutoWidth611
    BiliClient.prefs.v611bandAutoWidth611 = !current
    AppToast.show(this, "Band Auto Width611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611BarAutoScroll611Toggle() {
    val current = BiliClient.prefs.v611barAutoScroll611
    BiliClient.prefs.v611barAutoScroll611 = !current
    AppToast.show(this, "Bar Auto Scroll611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611BeaconAutoPing611Toggle() {
    val current = BiliClient.prefs.v611beaconAutoPing611
    BiliClient.prefs.v611beaconAutoPing611 = !current
    AppToast.show(this, "Beacon Auto Ping611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611BeamAutoForm611Toggle() {
    val current = BiliClient.prefs.v611beamAutoForm611
    BiliClient.prefs.v611beamAutoForm611 = !current
    AppToast.show(this, "Beam Auto Form611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611BeforeAutoHook611Toggle() {
    val current = BiliClient.prefs.v611beforeAutoHook611
    BiliClient.prefs.v611beforeAutoHook611 = !current
    AppToast.show(this, "Before Auto Hook611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611BeginAutoInit611Toggle() {
    val current = BiliClient.prefs.v611beginAutoInit611
    BiliClient.prefs.v611beginAutoInit611 = !current
    AppToast.show(this, "Begin Auto Init611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV611BehaviorAutoTrack611Toggle() {
    val current = BiliClient.prefs.v611behaviorAutoTrack611
    BiliClient.prefs.v611behaviorAutoTrack611 = !current
    AppToast.show(this, "Behavior Auto Track611: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612ArrowAutoNavigate612Toggle() {
    val current = BiliClient.prefs.v612arrowAutoNavigate612
    BiliClient.prefs.v612arrowAutoNavigate612 = !current
    AppToast.show(this, "Arrow Auto Navigate612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612AssetAutoLoad612Toggle() {
    val current = BiliClient.prefs.v612assetAutoLoad612
    BiliClient.prefs.v612assetAutoLoad612 = !current
    AppToast.show(this, "Asset Auto Load612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612AssignAutoTask612Toggle() {
    val current = BiliClient.prefs.v612assignAutoTask612
    BiliClient.prefs.v612assignAutoTask612 = !current
    AppToast.show(this, "Assign Auto Task612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612AsyncAutoExecute612Toggle() {
    val current = BiliClient.prefs.v612asyncAutoExecute612
    BiliClient.prefs.v612asyncAutoExecute612 = !current
    AppToast.show(this, "Async Auto Execute612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612AttackAutoBlock612Toggle() {
    val current = BiliClient.prefs.v612attackAutoBlock612
    BiliClient.prefs.v612attackAutoBlock612 = !current
    AppToast.show(this, "Attack Auto Block612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612AvatarAutoUpdate612Toggle() {
    val current = BiliClient.prefs.v612avatarAutoUpdate612
    BiliClient.prefs.v612avatarAutoUpdate612 = !current
    AppToast.show(this, "Avatar Auto Update612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612BackAutoSave612Toggle() {
    val current = BiliClient.prefs.v612backAutoSave612
    BiliClient.prefs.v612backAutoSave612 = !current
    AppToast.show(this, "Back Auto Save612: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV612BandAutoWidth612Toggle() {
    val current = BiliClient.prefs.v612bandAutoWidth612
    BiliClient.prefs.v612bandAutoWidth612 = !current
    AppToast.show(this, "Band Auto Width612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612BarAutoScroll612Toggle() {
    val current = BiliClient.prefs.v612barAutoScroll612
    BiliClient.prefs.v612barAutoScroll612 = !current
    AppToast.show(this, "Bar Auto Scroll612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612BeaconAutoPing612Toggle() {
    val current = BiliClient.prefs.v612beaconAutoPing612
    BiliClient.prefs.v612beaconAutoPing612 = !current
    AppToast.show(this, "Beacon Auto Ping612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612BeamAutoForm612Toggle() {
    val current = BiliClient.prefs.v612beamAutoForm612
    BiliClient.prefs.v612beamAutoForm612 = !current
    AppToast.show(this, "Beam Auto Form612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612BeforeAutoHook612Toggle() {
    val current = BiliClient.prefs.v612beforeAutoHook612
    BiliClient.prefs.v612beforeAutoHook612 = !current
    AppToast.show(this, "Before Auto Hook612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612BeginAutoInit612Toggle() {
    val current = BiliClient.prefs.v612beginAutoInit612
    BiliClient.prefs.v612beginAutoInit612 = !current
    AppToast.show(this, "Begin Auto Init612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV612BehaviorAutoTrack612Toggle() {
    val current = BiliClient.prefs.v612behaviorAutoTrack612
    BiliClient.prefs.v612behaviorAutoTrack612 = !current
    AppToast.show(this, "Behavior Auto Track612: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613ArrowAutoNavigate613Toggle() {
    val current = BiliClient.prefs.v613arrowAutoNavigate613
    BiliClient.prefs.v613arrowAutoNavigate613 = !current
    AppToast.show(this, "Arrow Auto Navigate613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613AssetAutoLoad613Toggle() {
    val current = BiliClient.prefs.v613assetAutoLoad613
    BiliClient.prefs.v613assetAutoLoad613 = !current
    AppToast.show(this, "Asset Auto Load613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613AssignAutoTask613Toggle() {
    val current = BiliClient.prefs.v613assignAutoTask613
    BiliClient.prefs.v613assignAutoTask613 = !current
    AppToast.show(this, "Assign Auto Task613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613AsyncAutoExecute613Toggle() {
    val current = BiliClient.prefs.v613asyncAutoExecute613
    BiliClient.prefs.v613asyncAutoExecute613 = !current
    AppToast.show(this, "Async Auto Execute613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613AttackAutoBlock613Toggle() {
    val current = BiliClient.prefs.v613attackAutoBlock613
    BiliClient.prefs.v613attackAutoBlock613 = !current
    AppToast.show(this, "Attack Auto Block613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613AvatarAutoUpdate613Toggle() {
    val current = BiliClient.prefs.v613avatarAutoUpdate613
    BiliClient.prefs.v613avatarAutoUpdate613 = !current
    AppToast.show(this, "Avatar Auto Update613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613BackAutoSave613Toggle() {
    val current = BiliClient.prefs.v613backAutoSave613
    BiliClient.prefs.v613backAutoSave613 = !current
    AppToast.show(this, "Back Auto Save613: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV613BandAutoWidth613Toggle() {
    val current = BiliClient.prefs.v613bandAutoWidth613
    BiliClient.prefs.v613bandAutoWidth613 = !current
    AppToast.show(this, "Band Auto Width613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613BarAutoScroll613Toggle() {
    val current = BiliClient.prefs.v613barAutoScroll613
    BiliClient.prefs.v613barAutoScroll613 = !current
    AppToast.show(this, "Bar Auto Scroll613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613BeaconAutoPing613Toggle() {
    val current = BiliClient.prefs.v613beaconAutoPing613
    BiliClient.prefs.v613beaconAutoPing613 = !current
    AppToast.show(this, "Beacon Auto Ping613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613BeamAutoForm613Toggle() {
    val current = BiliClient.prefs.v613beamAutoForm613
    BiliClient.prefs.v613beamAutoForm613 = !current
    AppToast.show(this, "Beam Auto Form613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613BeforeAutoHook613Toggle() {
    val current = BiliClient.prefs.v613beforeAutoHook613
    BiliClient.prefs.v613beforeAutoHook613 = !current
    AppToast.show(this, "Before Auto Hook613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613BeginAutoInit613Toggle() {
    val current = BiliClient.prefs.v613beginAutoInit613
    BiliClient.prefs.v613beginAutoInit613 = !current
    AppToast.show(this, "Begin Auto Init613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV613BehaviorAutoTrack613Toggle() {
    val current = BiliClient.prefs.v613behaviorAutoTrack613
    BiliClient.prefs.v613behaviorAutoTrack613 = !current
    AppToast.show(this, "Behavior Auto Track613: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614ArrowAutoNavigate614Toggle() {
    val current = BiliClient.prefs.v614arrowAutoNavigate614
    BiliClient.prefs.v614arrowAutoNavigate614 = !current
    AppToast.show(this, "Arrow Auto Navigate614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614AssetAutoLoad614Toggle() {
    val current = BiliClient.prefs.v614assetAutoLoad614
    BiliClient.prefs.v614assetAutoLoad614 = !current
    AppToast.show(this, "Asset Auto Load614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614AssignAutoTask614Toggle() {
    val current = BiliClient.prefs.v614assignAutoTask614
    BiliClient.prefs.v614assignAutoTask614 = !current
    AppToast.show(this, "Assign Auto Task614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614AsyncAutoExecute614Toggle() {
    val current = BiliClient.prefs.v614asyncAutoExecute614
    BiliClient.prefs.v614asyncAutoExecute614 = !current
    AppToast.show(this, "Async Auto Execute614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614AttackAutoBlock614Toggle() {
    val current = BiliClient.prefs.v614attackAutoBlock614
    BiliClient.prefs.v614attackAutoBlock614 = !current
    AppToast.show(this, "Attack Auto Block614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614AvatarAutoUpdate614Toggle() {
    val current = BiliClient.prefs.v614avatarAutoUpdate614
    BiliClient.prefs.v614avatarAutoUpdate614 = !current
    AppToast.show(this, "Avatar Auto Update614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614BackAutoSave614Toggle() {
    val current = BiliClient.prefs.v614backAutoSave614
    BiliClient.prefs.v614backAutoSave614 = !current
    AppToast.show(this, "Back Auto Save614: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV614BandAutoWidth614Toggle() {
    val current = BiliClient.prefs.v614bandAutoWidth614
    BiliClient.prefs.v614bandAutoWidth614 = !current
    AppToast.show(this, "Band Auto Width614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614BarAutoScroll614Toggle() {
    val current = BiliClient.prefs.v614barAutoScroll614
    BiliClient.prefs.v614barAutoScroll614 = !current
    AppToast.show(this, "Bar Auto Scroll614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614BeaconAutoPing614Toggle() {
    val current = BiliClient.prefs.v614beaconAutoPing614
    BiliClient.prefs.v614beaconAutoPing614 = !current
    AppToast.show(this, "Beacon Auto Ping614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614BeamAutoForm614Toggle() {
    val current = BiliClient.prefs.v614beamAutoForm614
    BiliClient.prefs.v614beamAutoForm614 = !current
    AppToast.show(this, "Beam Auto Form614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614BeforeAutoHook614Toggle() {
    val current = BiliClient.prefs.v614beforeAutoHook614
    BiliClient.prefs.v614beforeAutoHook614 = !current
    AppToast.show(this, "Before Auto Hook614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614BeginAutoInit614Toggle() {
    val current = BiliClient.prefs.v614beginAutoInit614
    BiliClient.prefs.v614beginAutoInit614 = !current
    AppToast.show(this, "Begin Auto Init614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV614BehaviorAutoTrack614Toggle() {
    val current = BiliClient.prefs.v614behaviorAutoTrack614
    BiliClient.prefs.v614behaviorAutoTrack614 = !current
    AppToast.show(this, "Behavior Auto Track614: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV615ArrowAutoNavigate615Toggle() {
    val current = BiliClient.prefs.v615arrowAutoNavigate615
    BiliClient.prefs.v615arrowAutoNavigate615 = !current
    AppToast.show(this, "Arrow Auto Navigate615: ${if (!current) "ON" else "OFF"}")
}

