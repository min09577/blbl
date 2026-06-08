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

internal fun PlayerActivity.showV655CloseAutoSave655Toggle() {
    val current = BiliClient.prefs.v655closeAutoSave655
    BiliClient.prefs.v655closeAutoSave655 = !current
    AppToast.show(this, "Close Auto Save655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655ClusterAutoGroup655Toggle() {
    val current = BiliClient.prefs.v655clusterAutoGroup655
    BiliClient.prefs.v655clusterAutoGroup655 = !current
    AppToast.show(this, "Cluster Auto Group655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655CodeAutoHighlight655Toggle() {
    val current = BiliClient.prefs.v655codeAutoHighlight655
    BiliClient.prefs.v655codeAutoHighlight655 = !current
    AppToast.show(this, "Code Auto Highlight655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655CollapseAutoFold655Toggle() {
    val current = BiliClient.prefs.v655collapseAutoFold655
    BiliClient.prefs.v655collapseAutoFold655 = !current
    AppToast.show(this, "Collapse Auto Fold655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655ColumnAutoResize655Toggle() {
    val current = BiliClient.prefs.v655columnAutoResize655
    BiliClient.prefs.v655columnAutoResize655 = !current
    AppToast.show(this, "Column Auto Resize655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655CombineAutoMerge655Toggle() {
    val current = BiliClient.prefs.v655combineAutoMerge655
    BiliClient.prefs.v655combineAutoMerge655 = !current
    AppToast.show(this, "Combine Auto Merge655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655CommandAutoExec655Toggle() {
    val current = BiliClient.prefs.v655commandAutoExec655
    BiliClient.prefs.v655commandAutoExec655 = !current
    AppToast.show(this, "Command Auto Exec655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655CommitAutoPush655Toggle() {
    val current = BiliClient.prefs.v655commitAutoPush655
    BiliClient.prefs.v655commitAutoPush655 = !current
    AppToast.show(this, "Commit Auto Push655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655CompareAutoDiff655Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v655compareAutoDiff655).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff655",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v655compareAutoDiff655 = value
        AppToast.show(this, "Compare Auto Diff655: $value")
    }
}

internal fun PlayerActivity.showV655CompileAutoBuild655Toggle() {
    val current = BiliClient.prefs.v655compileAutoBuild655
    BiliClient.prefs.v655compileAutoBuild655 = !current
    AppToast.show(this, "Compile Auto Build655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655ComponentAutoLoad655Toggle() {
    val current = BiliClient.prefs.v655componentAutoLoad655
    BiliClient.prefs.v655componentAutoLoad655 = !current
    AppToast.show(this, "Component Auto Load655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655ComputeAutoCalc655Toggle() {
    val current = BiliClient.prefs.v655computeAutoCalc655
    BiliClient.prefs.v655computeAutoCalc655 = !current
    AppToast.show(this, "Compute Auto Calc655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655ConcatAutoJoin655Toggle() {
    val current = BiliClient.prefs.v655concatAutoJoin655
    BiliClient.prefs.v655concatAutoJoin655 = !current
    AppToast.show(this, "Concat Auto Join655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV655ConditionAutoEval655Toggle() {
    val current = BiliClient.prefs.v655conditionAutoEval655
    BiliClient.prefs.v655conditionAutoEval655 = !current
    AppToast.show(this, "Condition Auto Eval655: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656CloneAutoProfile656Toggle() {
    val current = BiliClient.prefs.v656cloneAutoProfile656
    BiliClient.prefs.v656cloneAutoProfile656 = !current
    AppToast.show(this, "Clone Auto Profile656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656CloseAutoSave656Toggle() {
    val current = BiliClient.prefs.v656closeAutoSave656
    BiliClient.prefs.v656closeAutoSave656 = !current
    AppToast.show(this, "Close Auto Save656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656ClusterAutoGroup656Toggle() {
    val current = BiliClient.prefs.v656clusterAutoGroup656
    BiliClient.prefs.v656clusterAutoGroup656 = !current
    AppToast.show(this, "Cluster Auto Group656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656CodeAutoHighlight656Toggle() {
    val current = BiliClient.prefs.v656codeAutoHighlight656
    BiliClient.prefs.v656codeAutoHighlight656 = !current
    AppToast.show(this, "Code Auto Highlight656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656CollapseAutoFold656Toggle() {
    val current = BiliClient.prefs.v656collapseAutoFold656
    BiliClient.prefs.v656collapseAutoFold656 = !current
    AppToast.show(this, "Collapse Auto Fold656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656ColumnAutoResize656Toggle() {
    val current = BiliClient.prefs.v656columnAutoResize656
    BiliClient.prefs.v656columnAutoResize656 = !current
    AppToast.show(this, "Column Auto Resize656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656CombineAutoMerge656Toggle() {
    val current = BiliClient.prefs.v656combineAutoMerge656
    BiliClient.prefs.v656combineAutoMerge656 = !current
    AppToast.show(this, "Combine Auto Merge656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656CommandAutoExec656Toggle() {
    val current = BiliClient.prefs.v656commandAutoExec656
    BiliClient.prefs.v656commandAutoExec656 = !current
    AppToast.show(this, "Command Auto Exec656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656CommitAutoPush656Toggle() {
    val current = BiliClient.prefs.v656commitAutoPush656
    BiliClient.prefs.v656commitAutoPush656 = !current
    AppToast.show(this, "Commit Auto Push656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656CompareAutoDiff656Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v656compareAutoDiff656).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff656",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v656compareAutoDiff656 = value
        AppToast.show(this, "Compare Auto Diff656: $value")
    }
}

internal fun PlayerActivity.showV656CompileAutoBuild656Toggle() {
    val current = BiliClient.prefs.v656compileAutoBuild656
    BiliClient.prefs.v656compileAutoBuild656 = !current
    AppToast.show(this, "Compile Auto Build656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656ComponentAutoLoad656Toggle() {
    val current = BiliClient.prefs.v656componentAutoLoad656
    BiliClient.prefs.v656componentAutoLoad656 = !current
    AppToast.show(this, "Component Auto Load656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656ComputeAutoCalc656Toggle() {
    val current = BiliClient.prefs.v656computeAutoCalc656
    BiliClient.prefs.v656computeAutoCalc656 = !current
    AppToast.show(this, "Compute Auto Calc656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656ConcatAutoJoin656Toggle() {
    val current = BiliClient.prefs.v656concatAutoJoin656
    BiliClient.prefs.v656concatAutoJoin656 = !current
    AppToast.show(this, "Concat Auto Join656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV656ConditionAutoEval656Toggle() {
    val current = BiliClient.prefs.v656conditionAutoEval656
    BiliClient.prefs.v656conditionAutoEval656 = !current
    AppToast.show(this, "Condition Auto Eval656: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657CloneAutoProfile657Toggle() {
    val current = BiliClient.prefs.v657cloneAutoProfile657
    BiliClient.prefs.v657cloneAutoProfile657 = !current
    AppToast.show(this, "Clone Auto Profile657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657CloseAutoSave657Toggle() {
    val current = BiliClient.prefs.v657closeAutoSave657
    BiliClient.prefs.v657closeAutoSave657 = !current
    AppToast.show(this, "Close Auto Save657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657ClusterAutoGroup657Toggle() {
    val current = BiliClient.prefs.v657clusterAutoGroup657
    BiliClient.prefs.v657clusterAutoGroup657 = !current
    AppToast.show(this, "Cluster Auto Group657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657CodeAutoHighlight657Toggle() {
    val current = BiliClient.prefs.v657codeAutoHighlight657
    BiliClient.prefs.v657codeAutoHighlight657 = !current
    AppToast.show(this, "Code Auto Highlight657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657CollapseAutoFold657Toggle() {
    val current = BiliClient.prefs.v657collapseAutoFold657
    BiliClient.prefs.v657collapseAutoFold657 = !current
    AppToast.show(this, "Collapse Auto Fold657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657ColumnAutoResize657Toggle() {
    val current = BiliClient.prefs.v657columnAutoResize657
    BiliClient.prefs.v657columnAutoResize657 = !current
    AppToast.show(this, "Column Auto Resize657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657CombineAutoMerge657Toggle() {
    val current = BiliClient.prefs.v657combineAutoMerge657
    BiliClient.prefs.v657combineAutoMerge657 = !current
    AppToast.show(this, "Combine Auto Merge657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657CommandAutoExec657Toggle() {
    val current = BiliClient.prefs.v657commandAutoExec657
    BiliClient.prefs.v657commandAutoExec657 = !current
    AppToast.show(this, "Command Auto Exec657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657CommitAutoPush657Toggle() {
    val current = BiliClient.prefs.v657commitAutoPush657
    BiliClient.prefs.v657commitAutoPush657 = !current
    AppToast.show(this, "Commit Auto Push657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657CompareAutoDiff657Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v657compareAutoDiff657).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff657",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v657compareAutoDiff657 = value
        AppToast.show(this, "Compare Auto Diff657: $value")
    }
}

internal fun PlayerActivity.showV657CompileAutoBuild657Toggle() {
    val current = BiliClient.prefs.v657compileAutoBuild657
    BiliClient.prefs.v657compileAutoBuild657 = !current
    AppToast.show(this, "Compile Auto Build657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657ComponentAutoLoad657Toggle() {
    val current = BiliClient.prefs.v657componentAutoLoad657
    BiliClient.prefs.v657componentAutoLoad657 = !current
    AppToast.show(this, "Component Auto Load657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657ComputeAutoCalc657Toggle() {
    val current = BiliClient.prefs.v657computeAutoCalc657
    BiliClient.prefs.v657computeAutoCalc657 = !current
    AppToast.show(this, "Compute Auto Calc657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657ConcatAutoJoin657Toggle() {
    val current = BiliClient.prefs.v657concatAutoJoin657
    BiliClient.prefs.v657concatAutoJoin657 = !current
    AppToast.show(this, "Concat Auto Join657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV657ConditionAutoEval657Toggle() {
    val current = BiliClient.prefs.v657conditionAutoEval657
    BiliClient.prefs.v657conditionAutoEval657 = !current
    AppToast.show(this, "Condition Auto Eval657: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658CloneAutoProfile658Toggle() {
    val current = BiliClient.prefs.v658cloneAutoProfile658
    BiliClient.prefs.v658cloneAutoProfile658 = !current
    AppToast.show(this, "Clone Auto Profile658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658CloseAutoSave658Toggle() {
    val current = BiliClient.prefs.v658closeAutoSave658
    BiliClient.prefs.v658closeAutoSave658 = !current
    AppToast.show(this, "Close Auto Save658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658ClusterAutoGroup658Toggle() {
    val current = BiliClient.prefs.v658clusterAutoGroup658
    BiliClient.prefs.v658clusterAutoGroup658 = !current
    AppToast.show(this, "Cluster Auto Group658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658CodeAutoHighlight658Toggle() {
    val current = BiliClient.prefs.v658codeAutoHighlight658
    BiliClient.prefs.v658codeAutoHighlight658 = !current
    AppToast.show(this, "Code Auto Highlight658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658CollapseAutoFold658Toggle() {
    val current = BiliClient.prefs.v658collapseAutoFold658
    BiliClient.prefs.v658collapseAutoFold658 = !current
    AppToast.show(this, "Collapse Auto Fold658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658ColumnAutoResize658Toggle() {
    val current = BiliClient.prefs.v658columnAutoResize658
    BiliClient.prefs.v658columnAutoResize658 = !current
    AppToast.show(this, "Column Auto Resize658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658CombineAutoMerge658Toggle() {
    val current = BiliClient.prefs.v658combineAutoMerge658
    BiliClient.prefs.v658combineAutoMerge658 = !current
    AppToast.show(this, "Combine Auto Merge658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658CommandAutoExec658Toggle() {
    val current = BiliClient.prefs.v658commandAutoExec658
    BiliClient.prefs.v658commandAutoExec658 = !current
    AppToast.show(this, "Command Auto Exec658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658CommitAutoPush658Toggle() {
    val current = BiliClient.prefs.v658commitAutoPush658
    BiliClient.prefs.v658commitAutoPush658 = !current
    AppToast.show(this, "Commit Auto Push658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658CompareAutoDiff658Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v658compareAutoDiff658).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff658",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v658compareAutoDiff658 = value
        AppToast.show(this, "Compare Auto Diff658: $value")
    }
}

internal fun PlayerActivity.showV658CompileAutoBuild658Toggle() {
    val current = BiliClient.prefs.v658compileAutoBuild658
    BiliClient.prefs.v658compileAutoBuild658 = !current
    AppToast.show(this, "Compile Auto Build658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658ComponentAutoLoad658Toggle() {
    val current = BiliClient.prefs.v658componentAutoLoad658
    BiliClient.prefs.v658componentAutoLoad658 = !current
    AppToast.show(this, "Component Auto Load658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658ComputeAutoCalc658Toggle() {
    val current = BiliClient.prefs.v658computeAutoCalc658
    BiliClient.prefs.v658computeAutoCalc658 = !current
    AppToast.show(this, "Compute Auto Calc658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658ConcatAutoJoin658Toggle() {
    val current = BiliClient.prefs.v658concatAutoJoin658
    BiliClient.prefs.v658concatAutoJoin658 = !current
    AppToast.show(this, "Concat Auto Join658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV658ConditionAutoEval658Toggle() {
    val current = BiliClient.prefs.v658conditionAutoEval658
    BiliClient.prefs.v658conditionAutoEval658 = !current
    AppToast.show(this, "Condition Auto Eval658: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659CloneAutoProfile659Toggle() {
    val current = BiliClient.prefs.v659cloneAutoProfile659
    BiliClient.prefs.v659cloneAutoProfile659 = !current
    AppToast.show(this, "Clone Auto Profile659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659CloseAutoSave659Toggle() {
    val current = BiliClient.prefs.v659closeAutoSave659
    BiliClient.prefs.v659closeAutoSave659 = !current
    AppToast.show(this, "Close Auto Save659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659ClusterAutoGroup659Toggle() {
    val current = BiliClient.prefs.v659clusterAutoGroup659
    BiliClient.prefs.v659clusterAutoGroup659 = !current
    AppToast.show(this, "Cluster Auto Group659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659CodeAutoHighlight659Toggle() {
    val current = BiliClient.prefs.v659codeAutoHighlight659
    BiliClient.prefs.v659codeAutoHighlight659 = !current
    AppToast.show(this, "Code Auto Highlight659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659CollapseAutoFold659Toggle() {
    val current = BiliClient.prefs.v659collapseAutoFold659
    BiliClient.prefs.v659collapseAutoFold659 = !current
    AppToast.show(this, "Collapse Auto Fold659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659ColumnAutoResize659Toggle() {
    val current = BiliClient.prefs.v659columnAutoResize659
    BiliClient.prefs.v659columnAutoResize659 = !current
    AppToast.show(this, "Column Auto Resize659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659CombineAutoMerge659Toggle() {
    val current = BiliClient.prefs.v659combineAutoMerge659
    BiliClient.prefs.v659combineAutoMerge659 = !current
    AppToast.show(this, "Combine Auto Merge659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659CommandAutoExec659Toggle() {
    val current = BiliClient.prefs.v659commandAutoExec659
    BiliClient.prefs.v659commandAutoExec659 = !current
    AppToast.show(this, "Command Auto Exec659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659CommitAutoPush659Toggle() {
    val current = BiliClient.prefs.v659commitAutoPush659
    BiliClient.prefs.v659commitAutoPush659 = !current
    AppToast.show(this, "Commit Auto Push659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659CompareAutoDiff659Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v659compareAutoDiff659).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff659",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v659compareAutoDiff659 = value
        AppToast.show(this, "Compare Auto Diff659: $value")
    }
}

internal fun PlayerActivity.showV659CompileAutoBuild659Toggle() {
    val current = BiliClient.prefs.v659compileAutoBuild659
    BiliClient.prefs.v659compileAutoBuild659 = !current
    AppToast.show(this, "Compile Auto Build659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659ComponentAutoLoad659Toggle() {
    val current = BiliClient.prefs.v659componentAutoLoad659
    BiliClient.prefs.v659componentAutoLoad659 = !current
    AppToast.show(this, "Component Auto Load659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659ComputeAutoCalc659Toggle() {
    val current = BiliClient.prefs.v659computeAutoCalc659
    BiliClient.prefs.v659computeAutoCalc659 = !current
    AppToast.show(this, "Compute Auto Calc659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659ConcatAutoJoin659Toggle() {
    val current = BiliClient.prefs.v659concatAutoJoin659
    BiliClient.prefs.v659concatAutoJoin659 = !current
    AppToast.show(this, "Concat Auto Join659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV659ConditionAutoEval659Toggle() {
    val current = BiliClient.prefs.v659conditionAutoEval659
    BiliClient.prefs.v659conditionAutoEval659 = !current
    AppToast.show(this, "Condition Auto Eval659: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660CloneAutoProfile660Toggle() {
    val current = BiliClient.prefs.v660cloneAutoProfile660
    BiliClient.prefs.v660cloneAutoProfile660 = !current
    AppToast.show(this, "Clone Auto Profile660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660CloseAutoSave660Toggle() {
    val current = BiliClient.prefs.v660closeAutoSave660
    BiliClient.prefs.v660closeAutoSave660 = !current
    AppToast.show(this, "Close Auto Save660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660ClusterAutoGroup660Toggle() {
    val current = BiliClient.prefs.v660clusterAutoGroup660
    BiliClient.prefs.v660clusterAutoGroup660 = !current
    AppToast.show(this, "Cluster Auto Group660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660CodeAutoHighlight660Toggle() {
    val current = BiliClient.prefs.v660codeAutoHighlight660
    BiliClient.prefs.v660codeAutoHighlight660 = !current
    AppToast.show(this, "Code Auto Highlight660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660CollapseAutoFold660Toggle() {
    val current = BiliClient.prefs.v660collapseAutoFold660
    BiliClient.prefs.v660collapseAutoFold660 = !current
    AppToast.show(this, "Collapse Auto Fold660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660ColumnAutoResize660Toggle() {
    val current = BiliClient.prefs.v660columnAutoResize660
    BiliClient.prefs.v660columnAutoResize660 = !current
    AppToast.show(this, "Column Auto Resize660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660CombineAutoMerge660Toggle() {
    val current = BiliClient.prefs.v660combineAutoMerge660
    BiliClient.prefs.v660combineAutoMerge660 = !current
    AppToast.show(this, "Combine Auto Merge660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660CommandAutoExec660Toggle() {
    val current = BiliClient.prefs.v660commandAutoExec660
    BiliClient.prefs.v660commandAutoExec660 = !current
    AppToast.show(this, "Command Auto Exec660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660CommitAutoPush660Toggle() {
    val current = BiliClient.prefs.v660commitAutoPush660
    BiliClient.prefs.v660commitAutoPush660 = !current
    AppToast.show(this, "Commit Auto Push660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660CompareAutoDiff660Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v660compareAutoDiff660).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff660",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v660compareAutoDiff660 = value
        AppToast.show(this, "Compare Auto Diff660: $value")
    }
}

internal fun PlayerActivity.showV660CompileAutoBuild660Toggle() {
    val current = BiliClient.prefs.v660compileAutoBuild660
    BiliClient.prefs.v660compileAutoBuild660 = !current
    AppToast.show(this, "Compile Auto Build660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660ComponentAutoLoad660Toggle() {
    val current = BiliClient.prefs.v660componentAutoLoad660
    BiliClient.prefs.v660componentAutoLoad660 = !current
    AppToast.show(this, "Component Auto Load660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660ComputeAutoCalc660Toggle() {
    val current = BiliClient.prefs.v660computeAutoCalc660
    BiliClient.prefs.v660computeAutoCalc660 = !current
    AppToast.show(this, "Compute Auto Calc660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660ConcatAutoJoin660Toggle() {
    val current = BiliClient.prefs.v660concatAutoJoin660
    BiliClient.prefs.v660concatAutoJoin660 = !current
    AppToast.show(this, "Concat Auto Join660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV660ConditionAutoEval660Toggle() {
    val current = BiliClient.prefs.v660conditionAutoEval660
    BiliClient.prefs.v660conditionAutoEval660 = !current
    AppToast.show(this, "Condition Auto Eval660: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661ConfigAutoSave661Toggle() {
    val current = BiliClient.prefs.v661configAutoSave661
    BiliClient.prefs.v661configAutoSave661 = !current
    AppToast.show(this, "Config Auto Save661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661ConfirmAutoDialog661Toggle() {
    val current = BiliClient.prefs.v661confirmAutoDialog661
    BiliClient.prefs.v661confirmAutoDialog661 = !current
    AppToast.show(this, "Confirm Auto Dialog661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661ConsoleAutoOpen661Toggle() {
    val current = BiliClient.prefs.v661consoleAutoOpen661
    BiliClient.prefs.v661consoleAutoOpen661 = !current
    AppToast.show(this, "Console Auto Open661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661ConstraintAutoLayout661Toggle() {
    val current = BiliClient.prefs.v661constraintAutoLayout661
    BiliClient.prefs.v661constraintAutoLayout661 = !current
    AppToast.show(this, "Constraint Auto Layout661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661ContentAutoCache661Toggle() {
    val current = BiliClient.prefs.v661contentAutoCache661
    BiliClient.prefs.v661contentAutoCache661 = !current
    AppToast.show(this, "Content Auto Cache661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661ContextAutoMenu661Toggle() {
    val current = BiliClient.prefs.v661contextAutoMenu661
    BiliClient.prefs.v661contextAutoMenu661 = !current
    AppToast.show(this, "Context Auto Menu661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661ControlAutoHide661Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v661controlAutoHide661).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide661",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v661controlAutoHide661 = value
        AppToast.show(this, "Control Auto Hide661: $value")
    }
}

internal fun PlayerActivity.showV661ConvertAutoFormat661Toggle() {
    val current = BiliClient.prefs.v661convertAutoFormat661
    BiliClient.prefs.v661convertAutoFormat661 = !current
    AppToast.show(this, "Convert Auto Format661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661CopyAutoClipboard661Toggle() {
    val current = BiliClient.prefs.v661copyAutoClipboard661
    BiliClient.prefs.v661copyAutoClipboard661 = !current
    AppToast.show(this, "Copy Auto Clipboard661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661CoreAutoAffinity661Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v661coreAutoAffinity661).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity661",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v661coreAutoAffinity661 = value
        AppToast.show(this, "Core Auto Affinity661: $value")
    }
}

internal fun PlayerActivity.showV661CountAutoIncrement661Toggle() {
    val current = BiliClient.prefs.v661countAutoIncrement661
    BiliClient.prefs.v661countAutoIncrement661 = !current
    AppToast.show(this, "Count Auto Increment661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661CoverAutoGenerate661Toggle() {
    val current = BiliClient.prefs.v661coverAutoGenerate661
    BiliClient.prefs.v661coverAutoGenerate661 = !current
    AppToast.show(this, "Cover Auto Generate661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661CrashAutoReport661Toggle() {
    val current = BiliClient.prefs.v661crashAutoReport661
    BiliClient.prefs.v661crashAutoReport661 = !current
    AppToast.show(this, "Crash Auto Report661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661CreateAutoBackup661Toggle() {
    val current = BiliClient.prefs.v661createAutoBackup661
    BiliClient.prefs.v661createAutoBackup661 = !current
    AppToast.show(this, "Create Auto Backup661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV661CropAutoRegion661Toggle() {
    val current = BiliClient.prefs.v661cropAutoRegion661
    BiliClient.prefs.v661cropAutoRegion661 = !current
    AppToast.show(this, "Crop Auto Region661: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662ConfigAutoSave662Toggle() {
    val current = BiliClient.prefs.v662configAutoSave662
    BiliClient.prefs.v662configAutoSave662 = !current
    AppToast.show(this, "Config Auto Save662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662ConfirmAutoDialog662Toggle() {
    val current = BiliClient.prefs.v662confirmAutoDialog662
    BiliClient.prefs.v662confirmAutoDialog662 = !current
    AppToast.show(this, "Confirm Auto Dialog662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662ConsoleAutoOpen662Toggle() {
    val current = BiliClient.prefs.v662consoleAutoOpen662
    BiliClient.prefs.v662consoleAutoOpen662 = !current
    AppToast.show(this, "Console Auto Open662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662ConstraintAutoLayout662Toggle() {
    val current = BiliClient.prefs.v662constraintAutoLayout662
    BiliClient.prefs.v662constraintAutoLayout662 = !current
    AppToast.show(this, "Constraint Auto Layout662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662ContentAutoCache662Toggle() {
    val current = BiliClient.prefs.v662contentAutoCache662
    BiliClient.prefs.v662contentAutoCache662 = !current
    AppToast.show(this, "Content Auto Cache662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662ContextAutoMenu662Toggle() {
    val current = BiliClient.prefs.v662contextAutoMenu662
    BiliClient.prefs.v662contextAutoMenu662 = !current
    AppToast.show(this, "Context Auto Menu662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662ControlAutoHide662Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v662controlAutoHide662).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide662",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v662controlAutoHide662 = value
        AppToast.show(this, "Control Auto Hide662: $value")
    }
}

internal fun PlayerActivity.showV662ConvertAutoFormat662Toggle() {
    val current = BiliClient.prefs.v662convertAutoFormat662
    BiliClient.prefs.v662convertAutoFormat662 = !current
    AppToast.show(this, "Convert Auto Format662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662CopyAutoClipboard662Toggle() {
    val current = BiliClient.prefs.v662copyAutoClipboard662
    BiliClient.prefs.v662copyAutoClipboard662 = !current
    AppToast.show(this, "Copy Auto Clipboard662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662CoreAutoAffinity662Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v662coreAutoAffinity662).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity662",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v662coreAutoAffinity662 = value
        AppToast.show(this, "Core Auto Affinity662: $value")
    }
}

internal fun PlayerActivity.showV662CountAutoIncrement662Toggle() {
    val current = BiliClient.prefs.v662countAutoIncrement662
    BiliClient.prefs.v662countAutoIncrement662 = !current
    AppToast.show(this, "Count Auto Increment662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662CoverAutoGenerate662Toggle() {
    val current = BiliClient.prefs.v662coverAutoGenerate662
    BiliClient.prefs.v662coverAutoGenerate662 = !current
    AppToast.show(this, "Cover Auto Generate662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662CrashAutoReport662Toggle() {
    val current = BiliClient.prefs.v662crashAutoReport662
    BiliClient.prefs.v662crashAutoReport662 = !current
    AppToast.show(this, "Crash Auto Report662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662CreateAutoBackup662Toggle() {
    val current = BiliClient.prefs.v662createAutoBackup662
    BiliClient.prefs.v662createAutoBackup662 = !current
    AppToast.show(this, "Create Auto Backup662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV662CropAutoRegion662Toggle() {
    val current = BiliClient.prefs.v662cropAutoRegion662
    BiliClient.prefs.v662cropAutoRegion662 = !current
    AppToast.show(this, "Crop Auto Region662: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663ConfigAutoSave663Toggle() {
    val current = BiliClient.prefs.v663configAutoSave663
    BiliClient.prefs.v663configAutoSave663 = !current
    AppToast.show(this, "Config Auto Save663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663ConfirmAutoDialog663Toggle() {
    val current = BiliClient.prefs.v663confirmAutoDialog663
    BiliClient.prefs.v663confirmAutoDialog663 = !current
    AppToast.show(this, "Confirm Auto Dialog663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663ConsoleAutoOpen663Toggle() {
    val current = BiliClient.prefs.v663consoleAutoOpen663
    BiliClient.prefs.v663consoleAutoOpen663 = !current
    AppToast.show(this, "Console Auto Open663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663ConstraintAutoLayout663Toggle() {
    val current = BiliClient.prefs.v663constraintAutoLayout663
    BiliClient.prefs.v663constraintAutoLayout663 = !current
    AppToast.show(this, "Constraint Auto Layout663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663ContentAutoCache663Toggle() {
    val current = BiliClient.prefs.v663contentAutoCache663
    BiliClient.prefs.v663contentAutoCache663 = !current
    AppToast.show(this, "Content Auto Cache663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663ContextAutoMenu663Toggle() {
    val current = BiliClient.prefs.v663contextAutoMenu663
    BiliClient.prefs.v663contextAutoMenu663 = !current
    AppToast.show(this, "Context Auto Menu663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663ControlAutoHide663Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v663controlAutoHide663).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide663",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v663controlAutoHide663 = value
        AppToast.show(this, "Control Auto Hide663: $value")
    }
}

internal fun PlayerActivity.showV663ConvertAutoFormat663Toggle() {
    val current = BiliClient.prefs.v663convertAutoFormat663
    BiliClient.prefs.v663convertAutoFormat663 = !current
    AppToast.show(this, "Convert Auto Format663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663CopyAutoClipboard663Toggle() {
    val current = BiliClient.prefs.v663copyAutoClipboard663
    BiliClient.prefs.v663copyAutoClipboard663 = !current
    AppToast.show(this, "Copy Auto Clipboard663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663CoreAutoAffinity663Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v663coreAutoAffinity663).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity663",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v663coreAutoAffinity663 = value
        AppToast.show(this, "Core Auto Affinity663: $value")
    }
}

internal fun PlayerActivity.showV663CountAutoIncrement663Toggle() {
    val current = BiliClient.prefs.v663countAutoIncrement663
    BiliClient.prefs.v663countAutoIncrement663 = !current
    AppToast.show(this, "Count Auto Increment663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663CoverAutoGenerate663Toggle() {
    val current = BiliClient.prefs.v663coverAutoGenerate663
    BiliClient.prefs.v663coverAutoGenerate663 = !current
    AppToast.show(this, "Cover Auto Generate663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663CrashAutoReport663Toggle() {
    val current = BiliClient.prefs.v663crashAutoReport663
    BiliClient.prefs.v663crashAutoReport663 = !current
    AppToast.show(this, "Crash Auto Report663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663CreateAutoBackup663Toggle() {
    val current = BiliClient.prefs.v663createAutoBackup663
    BiliClient.prefs.v663createAutoBackup663 = !current
    AppToast.show(this, "Create Auto Backup663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV663CropAutoRegion663Toggle() {
    val current = BiliClient.prefs.v663cropAutoRegion663
    BiliClient.prefs.v663cropAutoRegion663 = !current
    AppToast.show(this, "Crop Auto Region663: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664ConfigAutoSave664Toggle() {
    val current = BiliClient.prefs.v664configAutoSave664
    BiliClient.prefs.v664configAutoSave664 = !current
    AppToast.show(this, "Config Auto Save664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664ConfirmAutoDialog664Toggle() {
    val current = BiliClient.prefs.v664confirmAutoDialog664
    BiliClient.prefs.v664confirmAutoDialog664 = !current
    AppToast.show(this, "Confirm Auto Dialog664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664ConsoleAutoOpen664Toggle() {
    val current = BiliClient.prefs.v664consoleAutoOpen664
    BiliClient.prefs.v664consoleAutoOpen664 = !current
    AppToast.show(this, "Console Auto Open664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664ConstraintAutoLayout664Toggle() {
    val current = BiliClient.prefs.v664constraintAutoLayout664
    BiliClient.prefs.v664constraintAutoLayout664 = !current
    AppToast.show(this, "Constraint Auto Layout664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664ContentAutoCache664Toggle() {
    val current = BiliClient.prefs.v664contentAutoCache664
    BiliClient.prefs.v664contentAutoCache664 = !current
    AppToast.show(this, "Content Auto Cache664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664ContextAutoMenu664Toggle() {
    val current = BiliClient.prefs.v664contextAutoMenu664
    BiliClient.prefs.v664contextAutoMenu664 = !current
    AppToast.show(this, "Context Auto Menu664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664ControlAutoHide664Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v664controlAutoHide664).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide664",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v664controlAutoHide664 = value
        AppToast.show(this, "Control Auto Hide664: $value")
    }
}

internal fun PlayerActivity.showV664ConvertAutoFormat664Toggle() {
    val current = BiliClient.prefs.v664convertAutoFormat664
    BiliClient.prefs.v664convertAutoFormat664 = !current
    AppToast.show(this, "Convert Auto Format664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664CopyAutoClipboard664Toggle() {
    val current = BiliClient.prefs.v664copyAutoClipboard664
    BiliClient.prefs.v664copyAutoClipboard664 = !current
    AppToast.show(this, "Copy Auto Clipboard664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664CoreAutoAffinity664Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v664coreAutoAffinity664).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity664",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v664coreAutoAffinity664 = value
        AppToast.show(this, "Core Auto Affinity664: $value")
    }
}

internal fun PlayerActivity.showV664CountAutoIncrement664Toggle() {
    val current = BiliClient.prefs.v664countAutoIncrement664
    BiliClient.prefs.v664countAutoIncrement664 = !current
    AppToast.show(this, "Count Auto Increment664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664CoverAutoGenerate664Toggle() {
    val current = BiliClient.prefs.v664coverAutoGenerate664
    BiliClient.prefs.v664coverAutoGenerate664 = !current
    AppToast.show(this, "Cover Auto Generate664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664CrashAutoReport664Toggle() {
    val current = BiliClient.prefs.v664crashAutoReport664
    BiliClient.prefs.v664crashAutoReport664 = !current
    AppToast.show(this, "Crash Auto Report664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664CreateAutoBackup664Toggle() {
    val current = BiliClient.prefs.v664createAutoBackup664
    BiliClient.prefs.v664createAutoBackup664 = !current
    AppToast.show(this, "Create Auto Backup664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV664CropAutoRegion664Toggle() {
    val current = BiliClient.prefs.v664cropAutoRegion664
    BiliClient.prefs.v664cropAutoRegion664 = !current
    AppToast.show(this, "Crop Auto Region664: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665ConfigAutoSave665Toggle() {
    val current = BiliClient.prefs.v665configAutoSave665
    BiliClient.prefs.v665configAutoSave665 = !current
    AppToast.show(this, "Config Auto Save665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665ConfirmAutoDialog665Toggle() {
    val current = BiliClient.prefs.v665confirmAutoDialog665
    BiliClient.prefs.v665confirmAutoDialog665 = !current
    AppToast.show(this, "Confirm Auto Dialog665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665ConsoleAutoOpen665Toggle() {
    val current = BiliClient.prefs.v665consoleAutoOpen665
    BiliClient.prefs.v665consoleAutoOpen665 = !current
    AppToast.show(this, "Console Auto Open665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665ConstraintAutoLayout665Toggle() {
    val current = BiliClient.prefs.v665constraintAutoLayout665
    BiliClient.prefs.v665constraintAutoLayout665 = !current
    AppToast.show(this, "Constraint Auto Layout665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665ContentAutoCache665Toggle() {
    val current = BiliClient.prefs.v665contentAutoCache665
    BiliClient.prefs.v665contentAutoCache665 = !current
    AppToast.show(this, "Content Auto Cache665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665ContextAutoMenu665Toggle() {
    val current = BiliClient.prefs.v665contextAutoMenu665
    BiliClient.prefs.v665contextAutoMenu665 = !current
    AppToast.show(this, "Context Auto Menu665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665ControlAutoHide665Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v665controlAutoHide665).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide665",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v665controlAutoHide665 = value
        AppToast.show(this, "Control Auto Hide665: $value")
    }
}

internal fun PlayerActivity.showV665ConvertAutoFormat665Toggle() {
    val current = BiliClient.prefs.v665convertAutoFormat665
    BiliClient.prefs.v665convertAutoFormat665 = !current
    AppToast.show(this, "Convert Auto Format665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665CopyAutoClipboard665Toggle() {
    val current = BiliClient.prefs.v665copyAutoClipboard665
    BiliClient.prefs.v665copyAutoClipboard665 = !current
    AppToast.show(this, "Copy Auto Clipboard665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665CoreAutoAffinity665Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v665coreAutoAffinity665).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity665",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v665coreAutoAffinity665 = value
        AppToast.show(this, "Core Auto Affinity665: $value")
    }
}

internal fun PlayerActivity.showV665CountAutoIncrement665Toggle() {
    val current = BiliClient.prefs.v665countAutoIncrement665
    BiliClient.prefs.v665countAutoIncrement665 = !current
    AppToast.show(this, "Count Auto Increment665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665CoverAutoGenerate665Toggle() {
    val current = BiliClient.prefs.v665coverAutoGenerate665
    BiliClient.prefs.v665coverAutoGenerate665 = !current
    AppToast.show(this, "Cover Auto Generate665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665CrashAutoReport665Toggle() {
    val current = BiliClient.prefs.v665crashAutoReport665
    BiliClient.prefs.v665crashAutoReport665 = !current
    AppToast.show(this, "Crash Auto Report665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665CreateAutoBackup665Toggle() {
    val current = BiliClient.prefs.v665createAutoBackup665
    BiliClient.prefs.v665createAutoBackup665 = !current
    AppToast.show(this, "Create Auto Backup665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV665CropAutoRegion665Toggle() {
    val current = BiliClient.prefs.v665cropAutoRegion665
    BiliClient.prefs.v665cropAutoRegion665 = !current
    AppToast.show(this, "Crop Auto Region665: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666ConfigAutoSave666Toggle() {
    val current = BiliClient.prefs.v666configAutoSave666
    BiliClient.prefs.v666configAutoSave666 = !current
    AppToast.show(this, "Config Auto Save666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666ConfirmAutoDialog666Toggle() {
    val current = BiliClient.prefs.v666confirmAutoDialog666
    BiliClient.prefs.v666confirmAutoDialog666 = !current
    AppToast.show(this, "Confirm Auto Dialog666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666ConsoleAutoOpen666Toggle() {
    val current = BiliClient.prefs.v666consoleAutoOpen666
    BiliClient.prefs.v666consoleAutoOpen666 = !current
    AppToast.show(this, "Console Auto Open666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666ConstraintAutoLayout666Toggle() {
    val current = BiliClient.prefs.v666constraintAutoLayout666
    BiliClient.prefs.v666constraintAutoLayout666 = !current
    AppToast.show(this, "Constraint Auto Layout666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666ContentAutoCache666Toggle() {
    val current = BiliClient.prefs.v666contentAutoCache666
    BiliClient.prefs.v666contentAutoCache666 = !current
    AppToast.show(this, "Content Auto Cache666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666ContextAutoMenu666Toggle() {
    val current = BiliClient.prefs.v666contextAutoMenu666
    BiliClient.prefs.v666contextAutoMenu666 = !current
    AppToast.show(this, "Context Auto Menu666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666ControlAutoHide666Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v666controlAutoHide666).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide666",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v666controlAutoHide666 = value
        AppToast.show(this, "Control Auto Hide666: $value")
    }
}

internal fun PlayerActivity.showV666ConvertAutoFormat666Toggle() {
    val current = BiliClient.prefs.v666convertAutoFormat666
    BiliClient.prefs.v666convertAutoFormat666 = !current
    AppToast.show(this, "Convert Auto Format666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666CopyAutoClipboard666Toggle() {
    val current = BiliClient.prefs.v666copyAutoClipboard666
    BiliClient.prefs.v666copyAutoClipboard666 = !current
    AppToast.show(this, "Copy Auto Clipboard666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666CoreAutoAffinity666Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v666coreAutoAffinity666).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity666",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v666coreAutoAffinity666 = value
        AppToast.show(this, "Core Auto Affinity666: $value")
    }
}

internal fun PlayerActivity.showV666CountAutoIncrement666Toggle() {
    val current = BiliClient.prefs.v666countAutoIncrement666
    BiliClient.prefs.v666countAutoIncrement666 = !current
    AppToast.show(this, "Count Auto Increment666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666CoverAutoGenerate666Toggle() {
    val current = BiliClient.prefs.v666coverAutoGenerate666
    BiliClient.prefs.v666coverAutoGenerate666 = !current
    AppToast.show(this, "Cover Auto Generate666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666CrashAutoReport666Toggle() {
    val current = BiliClient.prefs.v666crashAutoReport666
    BiliClient.prefs.v666crashAutoReport666 = !current
    AppToast.show(this, "Crash Auto Report666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666CreateAutoBackup666Toggle() {
    val current = BiliClient.prefs.v666createAutoBackup666
    BiliClient.prefs.v666createAutoBackup666 = !current
    AppToast.show(this, "Create Auto Backup666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV666CropAutoRegion666Toggle() {
    val current = BiliClient.prefs.v666cropAutoRegion666
    BiliClient.prefs.v666cropAutoRegion666 = !current
    AppToast.show(this, "Crop Auto Region666: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667ConfigAutoSave667Toggle() {
    val current = BiliClient.prefs.v667configAutoSave667
    BiliClient.prefs.v667configAutoSave667 = !current
    AppToast.show(this, "Config Auto Save667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667ConfirmAutoDialog667Toggle() {
    val current = BiliClient.prefs.v667confirmAutoDialog667
    BiliClient.prefs.v667confirmAutoDialog667 = !current
    AppToast.show(this, "Confirm Auto Dialog667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667ConsoleAutoOpen667Toggle() {
    val current = BiliClient.prefs.v667consoleAutoOpen667
    BiliClient.prefs.v667consoleAutoOpen667 = !current
    AppToast.show(this, "Console Auto Open667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667ConstraintAutoLayout667Toggle() {
    val current = BiliClient.prefs.v667constraintAutoLayout667
    BiliClient.prefs.v667constraintAutoLayout667 = !current
    AppToast.show(this, "Constraint Auto Layout667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667ContentAutoCache667Toggle() {
    val current = BiliClient.prefs.v667contentAutoCache667
    BiliClient.prefs.v667contentAutoCache667 = !current
    AppToast.show(this, "Content Auto Cache667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667ContextAutoMenu667Toggle() {
    val current = BiliClient.prefs.v667contextAutoMenu667
    BiliClient.prefs.v667contextAutoMenu667 = !current
    AppToast.show(this, "Context Auto Menu667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667ControlAutoHide667Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v667controlAutoHide667).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide667",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v667controlAutoHide667 = value
        AppToast.show(this, "Control Auto Hide667: $value")
    }
}

internal fun PlayerActivity.showV667ConvertAutoFormat667Toggle() {
    val current = BiliClient.prefs.v667convertAutoFormat667
    BiliClient.prefs.v667convertAutoFormat667 = !current
    AppToast.show(this, "Convert Auto Format667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667CopyAutoClipboard667Toggle() {
    val current = BiliClient.prefs.v667copyAutoClipboard667
    BiliClient.prefs.v667copyAutoClipboard667 = !current
    AppToast.show(this, "Copy Auto Clipboard667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667CoreAutoAffinity667Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v667coreAutoAffinity667).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity667",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v667coreAutoAffinity667 = value
        AppToast.show(this, "Core Auto Affinity667: $value")
    }
}

internal fun PlayerActivity.showV667CountAutoIncrement667Toggle() {
    val current = BiliClient.prefs.v667countAutoIncrement667
    BiliClient.prefs.v667countAutoIncrement667 = !current
    AppToast.show(this, "Count Auto Increment667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667CoverAutoGenerate667Toggle() {
    val current = BiliClient.prefs.v667coverAutoGenerate667
    BiliClient.prefs.v667coverAutoGenerate667 = !current
    AppToast.show(this, "Cover Auto Generate667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667CrashAutoReport667Toggle() {
    val current = BiliClient.prefs.v667crashAutoReport667
    BiliClient.prefs.v667crashAutoReport667 = !current
    AppToast.show(this, "Crash Auto Report667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667CreateAutoBackup667Toggle() {
    val current = BiliClient.prefs.v667createAutoBackup667
    BiliClient.prefs.v667createAutoBackup667 = !current
    AppToast.show(this, "Create Auto Backup667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV667CropAutoRegion667Toggle() {
    val current = BiliClient.prefs.v667cropAutoRegion667
    BiliClient.prefs.v667cropAutoRegion667 = !current
    AppToast.show(this, "Crop Auto Region667: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV668ConfigAutoSave668Toggle() {
    val current = BiliClient.prefs.v668configAutoSave668
    BiliClient.prefs.v668configAutoSave668 = !current
    AppToast.show(this, "Config Auto Save668: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV668ConfirmAutoDialog668Toggle() {
    val current = BiliClient.prefs.v668confirmAutoDialog668
    BiliClient.prefs.v668confirmAutoDialog668 = !current
    AppToast.show(this, "Confirm Auto Dialog668: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV668ConsoleAutoOpen668Toggle() {
    val current = BiliClient.prefs.v668consoleAutoOpen668
    BiliClient.prefs.v668consoleAutoOpen668 = !current
    AppToast.show(this, "Console Auto Open668: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV668ConstraintAutoLayout668Toggle() {
    val current = BiliClient.prefs.v668constraintAutoLayout668
    BiliClient.prefs.v668constraintAutoLayout668 = !current
    AppToast.show(this, "Constraint Auto Layout668: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV668ContentAutoCache668Toggle() {
    val current = BiliClient.prefs.v668contentAutoCache668
    BiliClient.prefs.v668contentAutoCache668 = !current
    AppToast.show(this, "Content Auto Cache668: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV668ContextAutoMenu668Toggle() {
    val current = BiliClient.prefs.v668contextAutoMenu668
    BiliClient.prefs.v668contextAutoMenu668 = !current
    AppToast.show(this, "Context Auto Menu668: ${if (!current) "ON" else "OFF"}")
}

