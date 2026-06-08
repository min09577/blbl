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

// v649: Clamp Auto Value649
internal fun PlayerActivity.showV649ClampAutoValue649Toggle() {
    val current = BiliClient.prefs.v649clampAutoValue649
    BiliClient.prefs.v649clampAutoValue649 = !current
    AppToast.show(this, "Clamp Auto Value649: ${if (!current) "ON" else "OFF"}")
}

// v649: Class Auto Load649
internal fun PlayerActivity.showV649ClassAutoLoad649Toggle() {
    val current = BiliClient.prefs.v649classAutoLoad649
    BiliClient.prefs.v649classAutoLoad649 = !current
    AppToast.show(this, "Class Auto Load649: ${if (!current) "ON" else "OFF"}")
}

// v650: Cell Auto Merge650
internal fun PlayerActivity.showV650CellAutoMerge650Toggle() {
    val current = BiliClient.prefs.v650cellAutoMerge650
    BiliClient.prefs.v650cellAutoMerge650 = !current
    AppToast.show(this, "Cell Auto Merge650: ${if (!current) "ON" else "OFF"}")
}

// v650: Center Auto Gravity650
internal fun PlayerActivity.showV650CenterAutoGravity650Toggle() {
    val current = BiliClient.prefs.v650centerAutoGravity650
    BiliClient.prefs.v650centerAutoGravity650 = !current
    AppToast.show(this, "Center Auto Gravity650: ${if (!current) "ON" else "OFF"}")
}

// v650: Chain Auto Link650
internal fun PlayerActivity.showV650ChainAutoLink650Toggle() {
    val current = BiliClient.prefs.v650chainAutoLink650
    BiliClient.prefs.v650chainAutoLink650 = !current
    AppToast.show(this, "Chain Auto Link650: ${if (!current) "ON" else "OFF"}")
}

// v650: Challenge Auto Join650
internal fun PlayerActivity.showV650ChallengeAutoJoin650Toggle() {
    val current = BiliClient.prefs.v650challengeAutoJoin650
    BiliClient.prefs.v650challengeAutoJoin650 = !current
    AppToast.show(this, "Challenge Auto Join650: ${if (!current) "ON" else "OFF"}")
}

// v650: Change Auto Track650
internal fun PlayerActivity.showV650ChangeAutoTrack650Toggle() {
    val current = BiliClient.prefs.v650changeAutoTrack650
    BiliClient.prefs.v650changeAutoTrack650 = !current
    AppToast.show(this, "Change Auto Track650: ${if (!current) "ON" else "OFF"}")
}

// v650: Channel Auto Switch650
internal fun PlayerActivity.showV650ChannelAutoSwitch650Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v650channelAutoSwitch650).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Channel Auto Switch650",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v650channelAutoSwitch650 = value
        AppToast.show(this, "Channel Auto Switch650: $value")
    }
}

// v650: Chapter Auto Mark650
internal fun PlayerActivity.showV650ChapterAutoMark650Toggle() {
    val current = BiliClient.prefs.v650chapterAutoMark650
    BiliClient.prefs.v650chapterAutoMark650 = !current
    AppToast.show(this, "Chapter Auto Mark650: ${if (!current) "ON" else "OFF"}")
}

// v650: Chart Auto Render650
internal fun PlayerActivity.showV650ChartAutoRender650Toggle() {
    val current = BiliClient.prefs.v650chartAutoRender650
    BiliClient.prefs.v650chartAutoRender650 = !current
    AppToast.show(this, "Chart Auto Render650: ${if (!current) "ON" else "OFF"}")
}

// v650: Check Auto Verify650
internal fun PlayerActivity.showV650CheckAutoVerify650Toggle() {
    val current = BiliClient.prefs.v650checkAutoVerify650
    BiliClient.prefs.v650checkAutoVerify650 = !current
    AppToast.show(this, "Check Auto Verify650: ${if (!current) "ON" else "OFF"}")
}

// v650: Chip Auto Tag650
internal fun PlayerActivity.showV650ChipAutoTag650Toggle() {
    val current = BiliClient.prefs.v650chipAutoTag650
    BiliClient.prefs.v650chipAutoTag650 = !current
    AppToast.show(this, "Chip Auto Tag650: ${if (!current) "ON" else "OFF"}")
}

// v650: Chunk Auto Split650
internal fun PlayerActivity.showV650ChunkAutoSplit650Toggle() {
    val current = BiliClient.prefs.v650chunkAutoSplit650
    BiliClient.prefs.v650chunkAutoSplit650 = !current
    AppToast.show(this, "Chunk Auto Split650: ${if (!current) "ON" else "OFF"}")
}

// v650: Cipher Auto Encrypt650
internal fun PlayerActivity.showV650CipherAutoEncrypt650Toggle() {
    val current = BiliClient.prefs.v650cipherAutoEncrypt650
    BiliClient.prefs.v650cipherAutoEncrypt650 = !current
    AppToast.show(this, "Cipher Auto Encrypt650: ${if (!current) "ON" else "OFF"}")
}

// v650: Circle Auto Clip650
internal fun PlayerActivity.showV650CircleAutoClip650Toggle() {
    val current = BiliClient.prefs.v650circleAutoClip650
    BiliClient.prefs.v650circleAutoClip650 = !current
    AppToast.show(this, "Circle Auto Clip650: ${if (!current) "ON" else "OFF"}")
}

// v650: Clamp Auto Value650
internal fun PlayerActivity.showV650ClampAutoValue650Toggle() {
    val current = BiliClient.prefs.v650clampAutoValue650
    BiliClient.prefs.v650clampAutoValue650 = !current
    AppToast.show(this, "Clamp Auto Value650: ${if (!current) "ON" else "OFF"}")
}

// v650: Class Auto Load650
internal fun PlayerActivity.showV650ClassAutoLoad650Toggle() {
    val current = BiliClient.prefs.v650classAutoLoad650
    BiliClient.prefs.v650classAutoLoad650 = !current
    AppToast.show(this, "Class Auto Load650: ${if (!current) "ON" else "OFF"}")
}

// v651: Clone Auto Profile651
internal fun PlayerActivity.showV651CloneAutoProfile651Toggle() {
    val current = BiliClient.prefs.v651cloneAutoProfile651
    BiliClient.prefs.v651cloneAutoProfile651 = !current
    AppToast.show(this, "Clone Auto Profile651: ${if (!current) "ON" else "OFF"}")
}

// v651: Close Auto Save651
internal fun PlayerActivity.showV651CloseAutoSave651Toggle() {
    val current = BiliClient.prefs.v651closeAutoSave651
    BiliClient.prefs.v651closeAutoSave651 = !current
    AppToast.show(this, "Close Auto Save651: ${if (!current) "ON" else "OFF"}")
}

// v651: Cluster Auto Group651
internal fun PlayerActivity.showV651ClusterAutoGroup651Toggle() {
    val current = BiliClient.prefs.v651clusterAutoGroup651
    BiliClient.prefs.v651clusterAutoGroup651 = !current
    AppToast.show(this, "Cluster Auto Group651: ${if (!current) "ON" else "OFF"}")
}

// v651: Code Auto Highlight651
internal fun PlayerActivity.showV651CodeAutoHighlight651Toggle() {
    val current = BiliClient.prefs.v651codeAutoHighlight651
    BiliClient.prefs.v651codeAutoHighlight651 = !current
    AppToast.show(this, "Code Auto Highlight651: ${if (!current) "ON" else "OFF"}")
}

// v651: Collapse Auto Fold651
internal fun PlayerActivity.showV651CollapseAutoFold651Toggle() {
    val current = BiliClient.prefs.v651collapseAutoFold651
    BiliClient.prefs.v651collapseAutoFold651 = !current
    AppToast.show(this, "Collapse Auto Fold651: ${if (!current) "ON" else "OFF"}")
}

// v651: Column Auto Resize651
internal fun PlayerActivity.showV651ColumnAutoResize651Toggle() {
    val current = BiliClient.prefs.v651columnAutoResize651
    BiliClient.prefs.v651columnAutoResize651 = !current
    AppToast.show(this, "Column Auto Resize651: ${if (!current) "ON" else "OFF"}")
}

// v651: Combine Auto Merge651
internal fun PlayerActivity.showV651CombineAutoMerge651Toggle() {
    val current = BiliClient.prefs.v651combineAutoMerge651
    BiliClient.prefs.v651combineAutoMerge651 = !current
    AppToast.show(this, "Combine Auto Merge651: ${if (!current) "ON" else "OFF"}")
}

// v651: Command Auto Exec651
internal fun PlayerActivity.showV651CommandAutoExec651Toggle() {
    val current = BiliClient.prefs.v651commandAutoExec651
    BiliClient.prefs.v651commandAutoExec651 = !current
    AppToast.show(this, "Command Auto Exec651: ${if (!current) "ON" else "OFF"}")
}

// v651: Commit Auto Push651
internal fun PlayerActivity.showV651CommitAutoPush651Toggle() {
    val current = BiliClient.prefs.v651commitAutoPush651
    BiliClient.prefs.v651commitAutoPush651 = !current
    AppToast.show(this, "Commit Auto Push651: ${if (!current) "ON" else "OFF"}")
}

// v651: Compare Auto Diff651
internal fun PlayerActivity.showV651CompareAutoDiff651Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v651compareAutoDiff651).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff651",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v651compareAutoDiff651 = value
        AppToast.show(this, "Compare Auto Diff651: $value")
    }
}

// v651: Compile Auto Build651
internal fun PlayerActivity.showV651CompileAutoBuild651Toggle() {
    val current = BiliClient.prefs.v651compileAutoBuild651
    BiliClient.prefs.v651compileAutoBuild651 = !current
    AppToast.show(this, "Compile Auto Build651: ${if (!current) "ON" else "OFF"}")
}

// v651: Component Auto Load651
internal fun PlayerActivity.showV651ComponentAutoLoad651Toggle() {
    val current = BiliClient.prefs.v651componentAutoLoad651
    BiliClient.prefs.v651componentAutoLoad651 = !current
    AppToast.show(this, "Component Auto Load651: ${if (!current) "ON" else "OFF"}")
}

// v651: Compute Auto Calc651
internal fun PlayerActivity.showV651ComputeAutoCalc651Toggle() {
    val current = BiliClient.prefs.v651computeAutoCalc651
    BiliClient.prefs.v651computeAutoCalc651 = !current
    AppToast.show(this, "Compute Auto Calc651: ${if (!current) "ON" else "OFF"}")
}

// v651: Concat Auto Join651
internal fun PlayerActivity.showV651ConcatAutoJoin651Toggle() {
    val current = BiliClient.prefs.v651concatAutoJoin651
    BiliClient.prefs.v651concatAutoJoin651 = !current
    AppToast.show(this, "Concat Auto Join651: ${if (!current) "ON" else "OFF"}")
}

// v651: Condition Auto Eval651
internal fun PlayerActivity.showV651ConditionAutoEval651Toggle() {
    val current = BiliClient.prefs.v651conditionAutoEval651
    BiliClient.prefs.v651conditionAutoEval651 = !current
    AppToast.show(this, "Condition Auto Eval651: ${if (!current) "ON" else "OFF"}")
}

// v652: Clone Auto Profile652
internal fun PlayerActivity.showV652CloneAutoProfile652Toggle() {
    val current = BiliClient.prefs.v652cloneAutoProfile652
    BiliClient.prefs.v652cloneAutoProfile652 = !current
    AppToast.show(this, "Clone Auto Profile652: ${if (!current) "ON" else "OFF"}")
}

// v652: Close Auto Save652
internal fun PlayerActivity.showV652CloseAutoSave652Toggle() {
    val current = BiliClient.prefs.v652closeAutoSave652
    BiliClient.prefs.v652closeAutoSave652 = !current
    AppToast.show(this, "Close Auto Save652: ${if (!current) "ON" else "OFF"}")
}

// v652: Cluster Auto Group652
internal fun PlayerActivity.showV652ClusterAutoGroup652Toggle() {
    val current = BiliClient.prefs.v652clusterAutoGroup652
    BiliClient.prefs.v652clusterAutoGroup652 = !current
    AppToast.show(this, "Cluster Auto Group652: ${if (!current) "ON" else "OFF"}")
}

// v652: Code Auto Highlight652
internal fun PlayerActivity.showV652CodeAutoHighlight652Toggle() {
    val current = BiliClient.prefs.v652codeAutoHighlight652
    BiliClient.prefs.v652codeAutoHighlight652 = !current
    AppToast.show(this, "Code Auto Highlight652: ${if (!current) "ON" else "OFF"}")
}

// v652: Collapse Auto Fold652
internal fun PlayerActivity.showV652CollapseAutoFold652Toggle() {
    val current = BiliClient.prefs.v652collapseAutoFold652
    BiliClient.prefs.v652collapseAutoFold652 = !current
    AppToast.show(this, "Collapse Auto Fold652: ${if (!current) "ON" else "OFF"}")
}

// v652: Column Auto Resize652
internal fun PlayerActivity.showV652ColumnAutoResize652Toggle() {
    val current = BiliClient.prefs.v652columnAutoResize652
    BiliClient.prefs.v652columnAutoResize652 = !current
    AppToast.show(this, "Column Auto Resize652: ${if (!current) "ON" else "OFF"}")
}

// v652: Combine Auto Merge652
internal fun PlayerActivity.showV652CombineAutoMerge652Toggle() {
    val current = BiliClient.prefs.v652combineAutoMerge652
    BiliClient.prefs.v652combineAutoMerge652 = !current
    AppToast.show(this, "Combine Auto Merge652: ${if (!current) "ON" else "OFF"}")
}

// v652: Command Auto Exec652
internal fun PlayerActivity.showV652CommandAutoExec652Toggle() {
    val current = BiliClient.prefs.v652commandAutoExec652
    BiliClient.prefs.v652commandAutoExec652 = !current
    AppToast.show(this, "Command Auto Exec652: ${if (!current) "ON" else "OFF"}")
}

// v652: Commit Auto Push652
internal fun PlayerActivity.showV652CommitAutoPush652Toggle() {
    val current = BiliClient.prefs.v652commitAutoPush652
    BiliClient.prefs.v652commitAutoPush652 = !current
    AppToast.show(this, "Commit Auto Push652: ${if (!current) "ON" else "OFF"}")
}

// v652: Compare Auto Diff652
internal fun PlayerActivity.showV652CompareAutoDiff652Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v652compareAutoDiff652).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff652",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v652compareAutoDiff652 = value
        AppToast.show(this, "Compare Auto Diff652: $value")
    }
}

// v652: Compile Auto Build652
internal fun PlayerActivity.showV652CompileAutoBuild652Toggle() {
    val current = BiliClient.prefs.v652compileAutoBuild652
    BiliClient.prefs.v652compileAutoBuild652 = !current
    AppToast.show(this, "Compile Auto Build652: ${if (!current) "ON" else "OFF"}")
}

// v652: Component Auto Load652
internal fun PlayerActivity.showV652ComponentAutoLoad652Toggle() {
    val current = BiliClient.prefs.v652componentAutoLoad652
    BiliClient.prefs.v652componentAutoLoad652 = !current
    AppToast.show(this, "Component Auto Load652: ${if (!current) "ON" else "OFF"}")
}

// v652: Compute Auto Calc652
internal fun PlayerActivity.showV652ComputeAutoCalc652Toggle() {
    val current = BiliClient.prefs.v652computeAutoCalc652
    BiliClient.prefs.v652computeAutoCalc652 = !current
    AppToast.show(this, "Compute Auto Calc652: ${if (!current) "ON" else "OFF"}")
}

// v652: Concat Auto Join652
internal fun PlayerActivity.showV652ConcatAutoJoin652Toggle() {
    val current = BiliClient.prefs.v652concatAutoJoin652
    BiliClient.prefs.v652concatAutoJoin652 = !current
    AppToast.show(this, "Concat Auto Join652: ${if (!current) "ON" else "OFF"}")
}

// v652: Condition Auto Eval652
internal fun PlayerActivity.showV652ConditionAutoEval652Toggle() {
    val current = BiliClient.prefs.v652conditionAutoEval652
    BiliClient.prefs.v652conditionAutoEval652 = !current
    AppToast.show(this, "Condition Auto Eval652: ${if (!current) "ON" else "OFF"}")
}

// v653: Clone Auto Profile653
internal fun PlayerActivity.showV653CloneAutoProfile653Toggle() {
    val current = BiliClient.prefs.v653cloneAutoProfile653
    BiliClient.prefs.v653cloneAutoProfile653 = !current
    AppToast.show(this, "Clone Auto Profile653: ${if (!current) "ON" else "OFF"}")
}

// v653: Close Auto Save653
internal fun PlayerActivity.showV653CloseAutoSave653Toggle() {
    val current = BiliClient.prefs.v653closeAutoSave653
    BiliClient.prefs.v653closeAutoSave653 = !current
    AppToast.show(this, "Close Auto Save653: ${if (!current) "ON" else "OFF"}")
}

// v653: Cluster Auto Group653
internal fun PlayerActivity.showV653ClusterAutoGroup653Toggle() {
    val current = BiliClient.prefs.v653clusterAutoGroup653
    BiliClient.prefs.v653clusterAutoGroup653 = !current
    AppToast.show(this, "Cluster Auto Group653: ${if (!current) "ON" else "OFF"}")
}

// v653: Code Auto Highlight653
internal fun PlayerActivity.showV653CodeAutoHighlight653Toggle() {
    val current = BiliClient.prefs.v653codeAutoHighlight653
    BiliClient.prefs.v653codeAutoHighlight653 = !current
    AppToast.show(this, "Code Auto Highlight653: ${if (!current) "ON" else "OFF"}")
}

// v653: Collapse Auto Fold653
internal fun PlayerActivity.showV653CollapseAutoFold653Toggle() {
    val current = BiliClient.prefs.v653collapseAutoFold653
    BiliClient.prefs.v653collapseAutoFold653 = !current
    AppToast.show(this, "Collapse Auto Fold653: ${if (!current) "ON" else "OFF"}")
}

// v653: Column Auto Resize653
internal fun PlayerActivity.showV653ColumnAutoResize653Toggle() {
    val current = BiliClient.prefs.v653columnAutoResize653
    BiliClient.prefs.v653columnAutoResize653 = !current
    AppToast.show(this, "Column Auto Resize653: ${if (!current) "ON" else "OFF"}")
}

// v653: Combine Auto Merge653
internal fun PlayerActivity.showV653CombineAutoMerge653Toggle() {
    val current = BiliClient.prefs.v653combineAutoMerge653
    BiliClient.prefs.v653combineAutoMerge653 = !current
    AppToast.show(this, "Combine Auto Merge653: ${if (!current) "ON" else "OFF"}")
}

// v653: Command Auto Exec653
internal fun PlayerActivity.showV653CommandAutoExec653Toggle() {
    val current = BiliClient.prefs.v653commandAutoExec653
    BiliClient.prefs.v653commandAutoExec653 = !current
    AppToast.show(this, "Command Auto Exec653: ${if (!current) "ON" else "OFF"}")
}

// v653: Commit Auto Push653
internal fun PlayerActivity.showV653CommitAutoPush653Toggle() {
    val current = BiliClient.prefs.v653commitAutoPush653
    BiliClient.prefs.v653commitAutoPush653 = !current
    AppToast.show(this, "Commit Auto Push653: ${if (!current) "ON" else "OFF"}")
}

// v653: Compare Auto Diff653
internal fun PlayerActivity.showV653CompareAutoDiff653Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v653compareAutoDiff653).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff653",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v653compareAutoDiff653 = value
        AppToast.show(this, "Compare Auto Diff653: $value")
    }
}

// v653: Compile Auto Build653
internal fun PlayerActivity.showV653CompileAutoBuild653Toggle() {
    val current = BiliClient.prefs.v653compileAutoBuild653
    BiliClient.prefs.v653compileAutoBuild653 = !current
    AppToast.show(this, "Compile Auto Build653: ${if (!current) "ON" else "OFF"}")
}

// v653: Component Auto Load653
internal fun PlayerActivity.showV653ComponentAutoLoad653Toggle() {
    val current = BiliClient.prefs.v653componentAutoLoad653
    BiliClient.prefs.v653componentAutoLoad653 = !current
    AppToast.show(this, "Component Auto Load653: ${if (!current) "ON" else "OFF"}")
}

// v653: Compute Auto Calc653
internal fun PlayerActivity.showV653ComputeAutoCalc653Toggle() {
    val current = BiliClient.prefs.v653computeAutoCalc653
    BiliClient.prefs.v653computeAutoCalc653 = !current
    AppToast.show(this, "Compute Auto Calc653: ${if (!current) "ON" else "OFF"}")
}

// v653: Concat Auto Join653
internal fun PlayerActivity.showV653ConcatAutoJoin653Toggle() {
    val current = BiliClient.prefs.v653concatAutoJoin653
    BiliClient.prefs.v653concatAutoJoin653 = !current
    AppToast.show(this, "Concat Auto Join653: ${if (!current) "ON" else "OFF"}")
}

// v653: Condition Auto Eval653
internal fun PlayerActivity.showV653ConditionAutoEval653Toggle() {
    val current = BiliClient.prefs.v653conditionAutoEval653
    BiliClient.prefs.v653conditionAutoEval653 = !current
    AppToast.show(this, "Condition Auto Eval653: ${if (!current) "ON" else "OFF"}")
}

// v654: Clone Auto Profile654
internal fun PlayerActivity.showV654CloneAutoProfile654Toggle() {
    val current = BiliClient.prefs.v654cloneAutoProfile654
    BiliClient.prefs.v654cloneAutoProfile654 = !current
    AppToast.show(this, "Clone Auto Profile654: ${if (!current) "ON" else "OFF"}")
}

// v654: Close Auto Save654
internal fun PlayerActivity.showV654CloseAutoSave654Toggle() {
    val current = BiliClient.prefs.v654closeAutoSave654
    BiliClient.prefs.v654closeAutoSave654 = !current
    AppToast.show(this, "Close Auto Save654: ${if (!current) "ON" else "OFF"}")
}

// v654: Cluster Auto Group654
internal fun PlayerActivity.showV654ClusterAutoGroup654Toggle() {
    val current = BiliClient.prefs.v654clusterAutoGroup654
    BiliClient.prefs.v654clusterAutoGroup654 = !current
    AppToast.show(this, "Cluster Auto Group654: ${if (!current) "ON" else "OFF"}")
}

// v654: Code Auto Highlight654
internal fun PlayerActivity.showV654CodeAutoHighlight654Toggle() {
    val current = BiliClient.prefs.v654codeAutoHighlight654
    BiliClient.prefs.v654codeAutoHighlight654 = !current
    AppToast.show(this, "Code Auto Highlight654: ${if (!current) "ON" else "OFF"}")
}

// v654: Collapse Auto Fold654
internal fun PlayerActivity.showV654CollapseAutoFold654Toggle() {
    val current = BiliClient.prefs.v654collapseAutoFold654
    BiliClient.prefs.v654collapseAutoFold654 = !current
    AppToast.show(this, "Collapse Auto Fold654: ${if (!current) "ON" else "OFF"}")
}

// v654: Column Auto Resize654
internal fun PlayerActivity.showV654ColumnAutoResize654Toggle() {
    val current = BiliClient.prefs.v654columnAutoResize654
    BiliClient.prefs.v654columnAutoResize654 = !current
    AppToast.show(this, "Column Auto Resize654: ${if (!current) "ON" else "OFF"}")
}

// v654: Combine Auto Merge654
internal fun PlayerActivity.showV654CombineAutoMerge654Toggle() {
    val current = BiliClient.prefs.v654combineAutoMerge654
    BiliClient.prefs.v654combineAutoMerge654 = !current
    AppToast.show(this, "Combine Auto Merge654: ${if (!current) "ON" else "OFF"}")
}

// v654: Command Auto Exec654
internal fun PlayerActivity.showV654CommandAutoExec654Toggle() {
    val current = BiliClient.prefs.v654commandAutoExec654
    BiliClient.prefs.v654commandAutoExec654 = !current
    AppToast.show(this, "Command Auto Exec654: ${if (!current) "ON" else "OFF"}")
}

// v654: Commit Auto Push654
internal fun PlayerActivity.showV654CommitAutoPush654Toggle() {
    val current = BiliClient.prefs.v654commitAutoPush654
    BiliClient.prefs.v654commitAutoPush654 = !current
    AppToast.show(this, "Commit Auto Push654: ${if (!current) "ON" else "OFF"}")
}

// v654: Compare Auto Diff654
internal fun PlayerActivity.showV654CompareAutoDiff654Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v654compareAutoDiff654).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Compare Auto Diff654",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v654compareAutoDiff654 = value
        AppToast.show(this, "Compare Auto Diff654: $value")
    }
}

// v654: Compile Auto Build654
internal fun PlayerActivity.showV654CompileAutoBuild654Toggle() {
    val current = BiliClient.prefs.v654compileAutoBuild654
    BiliClient.prefs.v654compileAutoBuild654 = !current
    AppToast.show(this, "Compile Auto Build654: ${if (!current) "ON" else "OFF"}")
}

// v654: Component Auto Load654
internal fun PlayerActivity.showV654ComponentAutoLoad654Toggle() {
    val current = BiliClient.prefs.v654componentAutoLoad654
    BiliClient.prefs.v654componentAutoLoad654 = !current
    AppToast.show(this, "Component Auto Load654: ${if (!current) "ON" else "OFF"}")
}

// v654: Compute Auto Calc654
internal fun PlayerActivity.showV654ComputeAutoCalc654Toggle() {
    val current = BiliClient.prefs.v654computeAutoCalc654
    BiliClient.prefs.v654computeAutoCalc654 = !current
    AppToast.show(this, "Compute Auto Calc654: ${if (!current) "ON" else "OFF"}")
}

// v654: Concat Auto Join654
internal fun PlayerActivity.showV654ConcatAutoJoin654Toggle() {
    val current = BiliClient.prefs.v654concatAutoJoin654
    BiliClient.prefs.v654concatAutoJoin654 = !current
    AppToast.show(this, "Concat Auto Join654: ${if (!current) "ON" else "OFF"}")
}

// v654: Condition Auto Eval654
internal fun PlayerActivity.showV654ConditionAutoEval654Toggle() {
    val current = BiliClient.prefs.v654conditionAutoEval654
    BiliClient.prefs.v654conditionAutoEval654 = !current
    AppToast.show(this, "Condition Auto Eval654: ${if (!current) "ON" else "OFF"}")
}

// v655: Clone Auto Profile655
internal fun PlayerActivity.showV655CloneAutoProfile655Toggle() {
    val current = BiliClient.prefs.v655cloneAutoProfile655
    BiliClient.prefs.v655cloneAutoProfile655 = !current
    AppToast.show(this, "Clone Auto Profile655: ${if (!current) "ON" else "OFF"}")
}

// v655: Close Auto Save655
internal fun PlayerActivity.showV655CloseAutoSave655Toggle() {
    val current = BiliClient.prefs.v655closeAutoSave655
    BiliClient.prefs.v655closeAutoSave655 = !current
    AppToast.show(this, "Close Auto Save655: ${if (!current) "ON" else "OFF"}")
}

// v655: Cluster Auto Group655
internal fun PlayerActivity.showV655ClusterAutoGroup655Toggle() {
    val current = BiliClient.prefs.v655clusterAutoGroup655
    BiliClient.prefs.v655clusterAutoGroup655 = !current
    AppToast.show(this, "Cluster Auto Group655: ${if (!current) "ON" else "OFF"}")
}

// v655: Code Auto Highlight655
internal fun PlayerActivity.showV655CodeAutoHighlight655Toggle() {
    val current = BiliClient.prefs.v655codeAutoHighlight655
    BiliClient.prefs.v655codeAutoHighlight655 = !current
    AppToast.show(this, "Code Auto Highlight655: ${if (!current) "ON" else "OFF"}")
}

// v655: Collapse Auto Fold655
internal fun PlayerActivity.showV655CollapseAutoFold655Toggle() {
    val current = BiliClient.prefs.v655collapseAutoFold655
    BiliClient.prefs.v655collapseAutoFold655 = !current
    AppToast.show(this, "Collapse Auto Fold655: ${if (!current) "ON" else "OFF"}")
}

// v655: Column Auto Resize655
internal fun PlayerActivity.showV655ColumnAutoResize655Toggle() {
    val current = BiliClient.prefs.v655columnAutoResize655
    BiliClient.prefs.v655columnAutoResize655 = !current
    AppToast.show(this, "Column Auto Resize655: ${if (!current) "ON" else "OFF"}")
}

// v655: Combine Auto Merge655
internal fun PlayerActivity.showV655CombineAutoMerge655Toggle() {
    val current = BiliClient.prefs.v655combineAutoMerge655
    BiliClient.prefs.v655combineAutoMerge655 = !current
    AppToast.show(this, "Combine Auto Merge655: ${if (!current) "ON" else "OFF"}")
}

// v655: Command Auto Exec655
internal fun PlayerActivity.showV655CommandAutoExec655Toggle() {
    val current = BiliClient.prefs.v655commandAutoExec655
    BiliClient.prefs.v655commandAutoExec655 = !current
    AppToast.show(this, "Command Auto Exec655: ${if (!current) "ON" else "OFF"}")
}

// v655: Commit Auto Push655
internal fun PlayerActivity.showV655CommitAutoPush655Toggle() {
    val current = BiliClient.prefs.v655commitAutoPush655
    BiliClient.prefs.v655commitAutoPush655 = !current
    AppToast.show(this, "Commit Auto Push655: ${if (!current) "ON" else "OFF"}")
}

// v655: Compare Auto Diff655
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

// v655: Compile Auto Build655
internal fun PlayerActivity.showV655CompileAutoBuild655Toggle() {
    val current = BiliClient.prefs.v655compileAutoBuild655
    BiliClient.prefs.v655compileAutoBuild655 = !current
    AppToast.show(this, "Compile Auto Build655: ${if (!current) "ON" else "OFF"}")
}

// v655: Component Auto Load655
internal fun PlayerActivity.showV655ComponentAutoLoad655Toggle() {
    val current = BiliClient.prefs.v655componentAutoLoad655
    BiliClient.prefs.v655componentAutoLoad655 = !current
    AppToast.show(this, "Component Auto Load655: ${if (!current) "ON" else "OFF"}")
}

// v655: Compute Auto Calc655
internal fun PlayerActivity.showV655ComputeAutoCalc655Toggle() {
    val current = BiliClient.prefs.v655computeAutoCalc655
    BiliClient.prefs.v655computeAutoCalc655 = !current
    AppToast.show(this, "Compute Auto Calc655: ${if (!current) "ON" else "OFF"}")
}

// v655: Concat Auto Join655
internal fun PlayerActivity.showV655ConcatAutoJoin655Toggle() {
    val current = BiliClient.prefs.v655concatAutoJoin655
    BiliClient.prefs.v655concatAutoJoin655 = !current
    AppToast.show(this, "Concat Auto Join655: ${if (!current) "ON" else "OFF"}")
}

// v655: Condition Auto Eval655
internal fun PlayerActivity.showV655ConditionAutoEval655Toggle() {
    val current = BiliClient.prefs.v655conditionAutoEval655
    BiliClient.prefs.v655conditionAutoEval655 = !current
    AppToast.show(this, "Condition Auto Eval655: ${if (!current) "ON" else "OFF"}")
}

// v656: Clone Auto Profile656
internal fun PlayerActivity.showV656CloneAutoProfile656Toggle() {
    val current = BiliClient.prefs.v656cloneAutoProfile656
    BiliClient.prefs.v656cloneAutoProfile656 = !current
    AppToast.show(this, "Clone Auto Profile656: ${if (!current) "ON" else "OFF"}")
}

// v656: Close Auto Save656
internal fun PlayerActivity.showV656CloseAutoSave656Toggle() {
    val current = BiliClient.prefs.v656closeAutoSave656
    BiliClient.prefs.v656closeAutoSave656 = !current
    AppToast.show(this, "Close Auto Save656: ${if (!current) "ON" else "OFF"}")
}

// v656: Cluster Auto Group656
internal fun PlayerActivity.showV656ClusterAutoGroup656Toggle() {
    val current = BiliClient.prefs.v656clusterAutoGroup656
    BiliClient.prefs.v656clusterAutoGroup656 = !current
    AppToast.show(this, "Cluster Auto Group656: ${if (!current) "ON" else "OFF"}")
}

// v656: Code Auto Highlight656
internal fun PlayerActivity.showV656CodeAutoHighlight656Toggle() {
    val current = BiliClient.prefs.v656codeAutoHighlight656
    BiliClient.prefs.v656codeAutoHighlight656 = !current
    AppToast.show(this, "Code Auto Highlight656: ${if (!current) "ON" else "OFF"}")
}

// v656: Collapse Auto Fold656
internal fun PlayerActivity.showV656CollapseAutoFold656Toggle() {
    val current = BiliClient.prefs.v656collapseAutoFold656
    BiliClient.prefs.v656collapseAutoFold656 = !current
    AppToast.show(this, "Collapse Auto Fold656: ${if (!current) "ON" else "OFF"}")
}

// v656: Column Auto Resize656
internal fun PlayerActivity.showV656ColumnAutoResize656Toggle() {
    val current = BiliClient.prefs.v656columnAutoResize656
    BiliClient.prefs.v656columnAutoResize656 = !current
    AppToast.show(this, "Column Auto Resize656: ${if (!current) "ON" else "OFF"}")
}

// v656: Combine Auto Merge656
internal fun PlayerActivity.showV656CombineAutoMerge656Toggle() {
    val current = BiliClient.prefs.v656combineAutoMerge656
    BiliClient.prefs.v656combineAutoMerge656 = !current
    AppToast.show(this, "Combine Auto Merge656: ${if (!current) "ON" else "OFF"}")
}

// v656: Command Auto Exec656
internal fun PlayerActivity.showV656CommandAutoExec656Toggle() {
    val current = BiliClient.prefs.v656commandAutoExec656
    BiliClient.prefs.v656commandAutoExec656 = !current
    AppToast.show(this, "Command Auto Exec656: ${if (!current) "ON" else "OFF"}")
}

// v656: Commit Auto Push656
internal fun PlayerActivity.showV656CommitAutoPush656Toggle() {
    val current = BiliClient.prefs.v656commitAutoPush656
    BiliClient.prefs.v656commitAutoPush656 = !current
    AppToast.show(this, "Commit Auto Push656: ${if (!current) "ON" else "OFF"}")
}

// v656: Compare Auto Diff656
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

// v656: Compile Auto Build656
internal fun PlayerActivity.showV656CompileAutoBuild656Toggle() {
    val current = BiliClient.prefs.v656compileAutoBuild656
    BiliClient.prefs.v656compileAutoBuild656 = !current
    AppToast.show(this, "Compile Auto Build656: ${if (!current) "ON" else "OFF"}")
}

// v656: Component Auto Load656
internal fun PlayerActivity.showV656ComponentAutoLoad656Toggle() {
    val current = BiliClient.prefs.v656componentAutoLoad656
    BiliClient.prefs.v656componentAutoLoad656 = !current
    AppToast.show(this, "Component Auto Load656: ${if (!current) "ON" else "OFF"}")
}

// v656: Compute Auto Calc656
internal fun PlayerActivity.showV656ComputeAutoCalc656Toggle() {
    val current = BiliClient.prefs.v656computeAutoCalc656
    BiliClient.prefs.v656computeAutoCalc656 = !current
    AppToast.show(this, "Compute Auto Calc656: ${if (!current) "ON" else "OFF"}")
}

// v656: Concat Auto Join656
internal fun PlayerActivity.showV656ConcatAutoJoin656Toggle() {
    val current = BiliClient.prefs.v656concatAutoJoin656
    BiliClient.prefs.v656concatAutoJoin656 = !current
    AppToast.show(this, "Concat Auto Join656: ${if (!current) "ON" else "OFF"}")
}

// v656: Condition Auto Eval656
internal fun PlayerActivity.showV656ConditionAutoEval656Toggle() {
    val current = BiliClient.prefs.v656conditionAutoEval656
    BiliClient.prefs.v656conditionAutoEval656 = !current
    AppToast.show(this, "Condition Auto Eval656: ${if (!current) "ON" else "OFF"}")
}

// v657: Clone Auto Profile657
internal fun PlayerActivity.showV657CloneAutoProfile657Toggle() {
    val current = BiliClient.prefs.v657cloneAutoProfile657
    BiliClient.prefs.v657cloneAutoProfile657 = !current
    AppToast.show(this, "Clone Auto Profile657: ${if (!current) "ON" else "OFF"}")
}

// v657: Close Auto Save657
internal fun PlayerActivity.showV657CloseAutoSave657Toggle() {
    val current = BiliClient.prefs.v657closeAutoSave657
    BiliClient.prefs.v657closeAutoSave657 = !current
    AppToast.show(this, "Close Auto Save657: ${if (!current) "ON" else "OFF"}")
}

// v657: Cluster Auto Group657
internal fun PlayerActivity.showV657ClusterAutoGroup657Toggle() {
    val current = BiliClient.prefs.v657clusterAutoGroup657
    BiliClient.prefs.v657clusterAutoGroup657 = !current
    AppToast.show(this, "Cluster Auto Group657: ${if (!current) "ON" else "OFF"}")
}

// v657: Code Auto Highlight657
internal fun PlayerActivity.showV657CodeAutoHighlight657Toggle() {
    val current = BiliClient.prefs.v657codeAutoHighlight657
    BiliClient.prefs.v657codeAutoHighlight657 = !current
    AppToast.show(this, "Code Auto Highlight657: ${if (!current) "ON" else "OFF"}")
}

// v657: Collapse Auto Fold657
internal fun PlayerActivity.showV657CollapseAutoFold657Toggle() {
    val current = BiliClient.prefs.v657collapseAutoFold657
    BiliClient.prefs.v657collapseAutoFold657 = !current
    AppToast.show(this, "Collapse Auto Fold657: ${if (!current) "ON" else "OFF"}")
}

// v657: Column Auto Resize657
internal fun PlayerActivity.showV657ColumnAutoResize657Toggle() {
    val current = BiliClient.prefs.v657columnAutoResize657
    BiliClient.prefs.v657columnAutoResize657 = !current
    AppToast.show(this, "Column Auto Resize657: ${if (!current) "ON" else "OFF"}")
}

// v657: Combine Auto Merge657
internal fun PlayerActivity.showV657CombineAutoMerge657Toggle() {
    val current = BiliClient.prefs.v657combineAutoMerge657
    BiliClient.prefs.v657combineAutoMerge657 = !current
    AppToast.show(this, "Combine Auto Merge657: ${if (!current) "ON" else "OFF"}")
}

// v657: Command Auto Exec657
internal fun PlayerActivity.showV657CommandAutoExec657Toggle() {
    val current = BiliClient.prefs.v657commandAutoExec657
    BiliClient.prefs.v657commandAutoExec657 = !current
    AppToast.show(this, "Command Auto Exec657: ${if (!current) "ON" else "OFF"}")
}

// v657: Commit Auto Push657
internal fun PlayerActivity.showV657CommitAutoPush657Toggle() {
    val current = BiliClient.prefs.v657commitAutoPush657
    BiliClient.prefs.v657commitAutoPush657 = !current
    AppToast.show(this, "Commit Auto Push657: ${if (!current) "ON" else "OFF"}")
}

// v657: Compare Auto Diff657
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

// v657: Compile Auto Build657
internal fun PlayerActivity.showV657CompileAutoBuild657Toggle() {
    val current = BiliClient.prefs.v657compileAutoBuild657
    BiliClient.prefs.v657compileAutoBuild657 = !current
    AppToast.show(this, "Compile Auto Build657: ${if (!current) "ON" else "OFF"}")
}

// v657: Component Auto Load657
internal fun PlayerActivity.showV657ComponentAutoLoad657Toggle() {
    val current = BiliClient.prefs.v657componentAutoLoad657
    BiliClient.prefs.v657componentAutoLoad657 = !current
    AppToast.show(this, "Component Auto Load657: ${if (!current) "ON" else "OFF"}")
}

// v657: Compute Auto Calc657
internal fun PlayerActivity.showV657ComputeAutoCalc657Toggle() {
    val current = BiliClient.prefs.v657computeAutoCalc657
    BiliClient.prefs.v657computeAutoCalc657 = !current
    AppToast.show(this, "Compute Auto Calc657: ${if (!current) "ON" else "OFF"}")
}

// v657: Concat Auto Join657
internal fun PlayerActivity.showV657ConcatAutoJoin657Toggle() {
    val current = BiliClient.prefs.v657concatAutoJoin657
    BiliClient.prefs.v657concatAutoJoin657 = !current
    AppToast.show(this, "Concat Auto Join657: ${if (!current) "ON" else "OFF"}")
}

// v657: Condition Auto Eval657
internal fun PlayerActivity.showV657ConditionAutoEval657Toggle() {
    val current = BiliClient.prefs.v657conditionAutoEval657
    BiliClient.prefs.v657conditionAutoEval657 = !current
    AppToast.show(this, "Condition Auto Eval657: ${if (!current) "ON" else "OFF"}")
}

// v658: Clone Auto Profile658
internal fun PlayerActivity.showV658CloneAutoProfile658Toggle() {
    val current = BiliClient.prefs.v658cloneAutoProfile658
    BiliClient.prefs.v658cloneAutoProfile658 = !current
    AppToast.show(this, "Clone Auto Profile658: ${if (!current) "ON" else "OFF"}")
}

// v658: Close Auto Save658
internal fun PlayerActivity.showV658CloseAutoSave658Toggle() {
    val current = BiliClient.prefs.v658closeAutoSave658
    BiliClient.prefs.v658closeAutoSave658 = !current
    AppToast.show(this, "Close Auto Save658: ${if (!current) "ON" else "OFF"}")
}

// v658: Cluster Auto Group658
internal fun PlayerActivity.showV658ClusterAutoGroup658Toggle() {
    val current = BiliClient.prefs.v658clusterAutoGroup658
    BiliClient.prefs.v658clusterAutoGroup658 = !current
    AppToast.show(this, "Cluster Auto Group658: ${if (!current) "ON" else "OFF"}")
}

// v658: Code Auto Highlight658
internal fun PlayerActivity.showV658CodeAutoHighlight658Toggle() {
    val current = BiliClient.prefs.v658codeAutoHighlight658
    BiliClient.prefs.v658codeAutoHighlight658 = !current
    AppToast.show(this, "Code Auto Highlight658: ${if (!current) "ON" else "OFF"}")
}

// v658: Collapse Auto Fold658
internal fun PlayerActivity.showV658CollapseAutoFold658Toggle() {
    val current = BiliClient.prefs.v658collapseAutoFold658
    BiliClient.prefs.v658collapseAutoFold658 = !current
    AppToast.show(this, "Collapse Auto Fold658: ${if (!current) "ON" else "OFF"}")
}

// v658: Column Auto Resize658
internal fun PlayerActivity.showV658ColumnAutoResize658Toggle() {
    val current = BiliClient.prefs.v658columnAutoResize658
    BiliClient.prefs.v658columnAutoResize658 = !current
    AppToast.show(this, "Column Auto Resize658: ${if (!current) "ON" else "OFF"}")
}

// v658: Combine Auto Merge658
internal fun PlayerActivity.showV658CombineAutoMerge658Toggle() {
    val current = BiliClient.prefs.v658combineAutoMerge658
    BiliClient.prefs.v658combineAutoMerge658 = !current
    AppToast.show(this, "Combine Auto Merge658: ${if (!current) "ON" else "OFF"}")
}

// v658: Command Auto Exec658
internal fun PlayerActivity.showV658CommandAutoExec658Toggle() {
    val current = BiliClient.prefs.v658commandAutoExec658
    BiliClient.prefs.v658commandAutoExec658 = !current
    AppToast.show(this, "Command Auto Exec658: ${if (!current) "ON" else "OFF"}")
}

// v658: Commit Auto Push658
internal fun PlayerActivity.showV658CommitAutoPush658Toggle() {
    val current = BiliClient.prefs.v658commitAutoPush658
    BiliClient.prefs.v658commitAutoPush658 = !current
    AppToast.show(this, "Commit Auto Push658: ${if (!current) "ON" else "OFF"}")
}

// v658: Compare Auto Diff658
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

// v658: Compile Auto Build658
internal fun PlayerActivity.showV658CompileAutoBuild658Toggle() {
    val current = BiliClient.prefs.v658compileAutoBuild658
    BiliClient.prefs.v658compileAutoBuild658 = !current
    AppToast.show(this, "Compile Auto Build658: ${if (!current) "ON" else "OFF"}")
}

// v658: Component Auto Load658
internal fun PlayerActivity.showV658ComponentAutoLoad658Toggle() {
    val current = BiliClient.prefs.v658componentAutoLoad658
    BiliClient.prefs.v658componentAutoLoad658 = !current
    AppToast.show(this, "Component Auto Load658: ${if (!current) "ON" else "OFF"}")
}

// v658: Compute Auto Calc658
internal fun PlayerActivity.showV658ComputeAutoCalc658Toggle() {
    val current = BiliClient.prefs.v658computeAutoCalc658
    BiliClient.prefs.v658computeAutoCalc658 = !current
    AppToast.show(this, "Compute Auto Calc658: ${if (!current) "ON" else "OFF"}")
}

// v658: Concat Auto Join658
internal fun PlayerActivity.showV658ConcatAutoJoin658Toggle() {
    val current = BiliClient.prefs.v658concatAutoJoin658
    BiliClient.prefs.v658concatAutoJoin658 = !current
    AppToast.show(this, "Concat Auto Join658: ${if (!current) "ON" else "OFF"}")
}

// v658: Condition Auto Eval658
internal fun PlayerActivity.showV658ConditionAutoEval658Toggle() {
    val current = BiliClient.prefs.v658conditionAutoEval658
    BiliClient.prefs.v658conditionAutoEval658 = !current
    AppToast.show(this, "Condition Auto Eval658: ${if (!current) "ON" else "OFF"}")
}

// v659: Clone Auto Profile659
internal fun PlayerActivity.showV659CloneAutoProfile659Toggle() {
    val current = BiliClient.prefs.v659cloneAutoProfile659
    BiliClient.prefs.v659cloneAutoProfile659 = !current
    AppToast.show(this, "Clone Auto Profile659: ${if (!current) "ON" else "OFF"}")
}

// v659: Close Auto Save659
internal fun PlayerActivity.showV659CloseAutoSave659Toggle() {
    val current = BiliClient.prefs.v659closeAutoSave659
    BiliClient.prefs.v659closeAutoSave659 = !current
    AppToast.show(this, "Close Auto Save659: ${if (!current) "ON" else "OFF"}")
}

// v659: Cluster Auto Group659
internal fun PlayerActivity.showV659ClusterAutoGroup659Toggle() {
    val current = BiliClient.prefs.v659clusterAutoGroup659
    BiliClient.prefs.v659clusterAutoGroup659 = !current
    AppToast.show(this, "Cluster Auto Group659: ${if (!current) "ON" else "OFF"}")
}

// v659: Code Auto Highlight659
internal fun PlayerActivity.showV659CodeAutoHighlight659Toggle() {
    val current = BiliClient.prefs.v659codeAutoHighlight659
    BiliClient.prefs.v659codeAutoHighlight659 = !current
    AppToast.show(this, "Code Auto Highlight659: ${if (!current) "ON" else "OFF"}")
}

// v659: Collapse Auto Fold659
internal fun PlayerActivity.showV659CollapseAutoFold659Toggle() {
    val current = BiliClient.prefs.v659collapseAutoFold659
    BiliClient.prefs.v659collapseAutoFold659 = !current
    AppToast.show(this, "Collapse Auto Fold659: ${if (!current) "ON" else "OFF"}")
}

// v659: Column Auto Resize659
internal fun PlayerActivity.showV659ColumnAutoResize659Toggle() {
    val current = BiliClient.prefs.v659columnAutoResize659
    BiliClient.prefs.v659columnAutoResize659 = !current
    AppToast.show(this, "Column Auto Resize659: ${if (!current) "ON" else "OFF"}")
}

// v659: Combine Auto Merge659
internal fun PlayerActivity.showV659CombineAutoMerge659Toggle() {
    val current = BiliClient.prefs.v659combineAutoMerge659
    BiliClient.prefs.v659combineAutoMerge659 = !current
    AppToast.show(this, "Combine Auto Merge659: ${if (!current) "ON" else "OFF"}")
}

// v659: Command Auto Exec659
internal fun PlayerActivity.showV659CommandAutoExec659Toggle() {
    val current = BiliClient.prefs.v659commandAutoExec659
    BiliClient.prefs.v659commandAutoExec659 = !current
    AppToast.show(this, "Command Auto Exec659: ${if (!current) "ON" else "OFF"}")
}

// v659: Commit Auto Push659
internal fun PlayerActivity.showV659CommitAutoPush659Toggle() {
    val current = BiliClient.prefs.v659commitAutoPush659
    BiliClient.prefs.v659commitAutoPush659 = !current
    AppToast.show(this, "Commit Auto Push659: ${if (!current) "ON" else "OFF"}")
}

// v659: Compare Auto Diff659
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

// v659: Compile Auto Build659
internal fun PlayerActivity.showV659CompileAutoBuild659Toggle() {
    val current = BiliClient.prefs.v659compileAutoBuild659
    BiliClient.prefs.v659compileAutoBuild659 = !current
    AppToast.show(this, "Compile Auto Build659: ${if (!current) "ON" else "OFF"}")
}

// v659: Component Auto Load659
internal fun PlayerActivity.showV659ComponentAutoLoad659Toggle() {
    val current = BiliClient.prefs.v659componentAutoLoad659
    BiliClient.prefs.v659componentAutoLoad659 = !current
    AppToast.show(this, "Component Auto Load659: ${if (!current) "ON" else "OFF"}")
}

// v659: Compute Auto Calc659
internal fun PlayerActivity.showV659ComputeAutoCalc659Toggle() {
    val current = BiliClient.prefs.v659computeAutoCalc659
    BiliClient.prefs.v659computeAutoCalc659 = !current
    AppToast.show(this, "Compute Auto Calc659: ${if (!current) "ON" else "OFF"}")
}

// v659: Concat Auto Join659
internal fun PlayerActivity.showV659ConcatAutoJoin659Toggle() {
    val current = BiliClient.prefs.v659concatAutoJoin659
    BiliClient.prefs.v659concatAutoJoin659 = !current
    AppToast.show(this, "Concat Auto Join659: ${if (!current) "ON" else "OFF"}")
}

// v659: Condition Auto Eval659
internal fun PlayerActivity.showV659ConditionAutoEval659Toggle() {
    val current = BiliClient.prefs.v659conditionAutoEval659
    BiliClient.prefs.v659conditionAutoEval659 = !current
    AppToast.show(this, "Condition Auto Eval659: ${if (!current) "ON" else "OFF"}")
}

// v660: Clone Auto Profile660
internal fun PlayerActivity.showV660CloneAutoProfile660Toggle() {
    val current = BiliClient.prefs.v660cloneAutoProfile660
    BiliClient.prefs.v660cloneAutoProfile660 = !current
    AppToast.show(this, "Clone Auto Profile660: ${if (!current) "ON" else "OFF"}")
}

// v660: Close Auto Save660
internal fun PlayerActivity.showV660CloseAutoSave660Toggle() {
    val current = BiliClient.prefs.v660closeAutoSave660
    BiliClient.prefs.v660closeAutoSave660 = !current
    AppToast.show(this, "Close Auto Save660: ${if (!current) "ON" else "OFF"}")
}

// v660: Cluster Auto Group660
internal fun PlayerActivity.showV660ClusterAutoGroup660Toggle() {
    val current = BiliClient.prefs.v660clusterAutoGroup660
    BiliClient.prefs.v660clusterAutoGroup660 = !current
    AppToast.show(this, "Cluster Auto Group660: ${if (!current) "ON" else "OFF"}")
}

// v660: Code Auto Highlight660
internal fun PlayerActivity.showV660CodeAutoHighlight660Toggle() {
    val current = BiliClient.prefs.v660codeAutoHighlight660
    BiliClient.prefs.v660codeAutoHighlight660 = !current
    AppToast.show(this, "Code Auto Highlight660: ${if (!current) "ON" else "OFF"}")
}

// v660: Collapse Auto Fold660
internal fun PlayerActivity.showV660CollapseAutoFold660Toggle() {
    val current = BiliClient.prefs.v660collapseAutoFold660
    BiliClient.prefs.v660collapseAutoFold660 = !current
    AppToast.show(this, "Collapse Auto Fold660: ${if (!current) "ON" else "OFF"}")
}

// v660: Column Auto Resize660
internal fun PlayerActivity.showV660ColumnAutoResize660Toggle() {
    val current = BiliClient.prefs.v660columnAutoResize660
    BiliClient.prefs.v660columnAutoResize660 = !current
    AppToast.show(this, "Column Auto Resize660: ${if (!current) "ON" else "OFF"}")
}

// v660: Combine Auto Merge660
internal fun PlayerActivity.showV660CombineAutoMerge660Toggle() {
    val current = BiliClient.prefs.v660combineAutoMerge660
    BiliClient.prefs.v660combineAutoMerge660 = !current
    AppToast.show(this, "Combine Auto Merge660: ${if (!current) "ON" else "OFF"}")
}

// v660: Command Auto Exec660
internal fun PlayerActivity.showV660CommandAutoExec660Toggle() {
    val current = BiliClient.prefs.v660commandAutoExec660
    BiliClient.prefs.v660commandAutoExec660 = !current
    AppToast.show(this, "Command Auto Exec660: ${if (!current) "ON" else "OFF"}")
}

// v660: Commit Auto Push660
internal fun PlayerActivity.showV660CommitAutoPush660Toggle() {
    val current = BiliClient.prefs.v660commitAutoPush660
    BiliClient.prefs.v660commitAutoPush660 = !current
    AppToast.show(this, "Commit Auto Push660: ${if (!current) "ON" else "OFF"}")
}

// v660: Compare Auto Diff660
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

// v660: Compile Auto Build660
internal fun PlayerActivity.showV660CompileAutoBuild660Toggle() {
    val current = BiliClient.prefs.v660compileAutoBuild660
    BiliClient.prefs.v660compileAutoBuild660 = !current
    AppToast.show(this, "Compile Auto Build660: ${if (!current) "ON" else "OFF"}")
}

// v660: Component Auto Load660
internal fun PlayerActivity.showV660ComponentAutoLoad660Toggle() {
    val current = BiliClient.prefs.v660componentAutoLoad660
    BiliClient.prefs.v660componentAutoLoad660 = !current
    AppToast.show(this, "Component Auto Load660: ${if (!current) "ON" else "OFF"}")
}

// v660: Compute Auto Calc660
internal fun PlayerActivity.showV660ComputeAutoCalc660Toggle() {
    val current = BiliClient.prefs.v660computeAutoCalc660
    BiliClient.prefs.v660computeAutoCalc660 = !current
    AppToast.show(this, "Compute Auto Calc660: ${if (!current) "ON" else "OFF"}")
}

// v660: Concat Auto Join660
internal fun PlayerActivity.showV660ConcatAutoJoin660Toggle() {
    val current = BiliClient.prefs.v660concatAutoJoin660
    BiliClient.prefs.v660concatAutoJoin660 = !current
    AppToast.show(this, "Concat Auto Join660: ${if (!current) "ON" else "OFF"}")
}

// v660: Condition Auto Eval660
internal fun PlayerActivity.showV660ConditionAutoEval660Toggle() {
    val current = BiliClient.prefs.v660conditionAutoEval660
    BiliClient.prefs.v660conditionAutoEval660 = !current
    AppToast.show(this, "Condition Auto Eval660: ${if (!current) "ON" else "OFF"}")
}

// v661: Config Auto Save661
internal fun PlayerActivity.showV661ConfigAutoSave661Toggle() {
    val current = BiliClient.prefs.v661configAutoSave661
    BiliClient.prefs.v661configAutoSave661 = !current
    AppToast.show(this, "Config Auto Save661: ${if (!current) "ON" else "OFF"}")
}

// v661: Confirm Auto Dialog661
internal fun PlayerActivity.showV661ConfirmAutoDialog661Toggle() {
    val current = BiliClient.prefs.v661confirmAutoDialog661
    BiliClient.prefs.v661confirmAutoDialog661 = !current
    AppToast.show(this, "Confirm Auto Dialog661: ${if (!current) "ON" else "OFF"}")
}

// v661: Console Auto Open661
internal fun PlayerActivity.showV661ConsoleAutoOpen661Toggle() {
    val current = BiliClient.prefs.v661consoleAutoOpen661
    BiliClient.prefs.v661consoleAutoOpen661 = !current
    AppToast.show(this, "Console Auto Open661: ${if (!current) "ON" else "OFF"}")
}

// v661: Constraint Auto Layout661
internal fun PlayerActivity.showV661ConstraintAutoLayout661Toggle() {
    val current = BiliClient.prefs.v661constraintAutoLayout661
    BiliClient.prefs.v661constraintAutoLayout661 = !current
    AppToast.show(this, "Constraint Auto Layout661: ${if (!current) "ON" else "OFF"}")
}

// v661: Content Auto Cache661
internal fun PlayerActivity.showV661ContentAutoCache661Toggle() {
    val current = BiliClient.prefs.v661contentAutoCache661
    BiliClient.prefs.v661contentAutoCache661 = !current
    AppToast.show(this, "Content Auto Cache661: ${if (!current) "ON" else "OFF"}")
}

// v661: Context Auto Menu661
internal fun PlayerActivity.showV661ContextAutoMenu661Toggle() {
    val current = BiliClient.prefs.v661contextAutoMenu661
    BiliClient.prefs.v661contextAutoMenu661 = !current
    AppToast.show(this, "Context Auto Menu661: ${if (!current) "ON" else "OFF"}")
}

// v661: Control Auto Hide661
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

// v661: Convert Auto Format661
internal fun PlayerActivity.showV661ConvertAutoFormat661Toggle() {
    val current = BiliClient.prefs.v661convertAutoFormat661
    BiliClient.prefs.v661convertAutoFormat661 = !current
    AppToast.show(this, "Convert Auto Format661: ${if (!current) "ON" else "OFF"}")
}

// v661: Copy Auto Clipboard661
internal fun PlayerActivity.showV661CopyAutoClipboard661Toggle() {
    val current = BiliClient.prefs.v661copyAutoClipboard661
    BiliClient.prefs.v661copyAutoClipboard661 = !current
    AppToast.show(this, "Copy Auto Clipboard661: ${if (!current) "ON" else "OFF"}")
}

// v661: Core Auto Affinity661
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

// v661: Count Auto Increment661
internal fun PlayerActivity.showV661CountAutoIncrement661Toggle() {
    val current = BiliClient.prefs.v661countAutoIncrement661
    BiliClient.prefs.v661countAutoIncrement661 = !current
    AppToast.show(this, "Count Auto Increment661: ${if (!current) "ON" else "OFF"}")
}

// v661: Cover Auto Generate661
internal fun PlayerActivity.showV661CoverAutoGenerate661Toggle() {
    val current = BiliClient.prefs.v661coverAutoGenerate661
    BiliClient.prefs.v661coverAutoGenerate661 = !current
    AppToast.show(this, "Cover Auto Generate661: ${if (!current) "ON" else "OFF"}")
}

// v661: Crash Auto Report661
internal fun PlayerActivity.showV661CrashAutoReport661Toggle() {
    val current = BiliClient.prefs.v661crashAutoReport661
    BiliClient.prefs.v661crashAutoReport661 = !current
    AppToast.show(this, "Crash Auto Report661: ${if (!current) "ON" else "OFF"}")
}

// v661: Create Auto Backup661
internal fun PlayerActivity.showV661CreateAutoBackup661Toggle() {
    val current = BiliClient.prefs.v661createAutoBackup661
    BiliClient.prefs.v661createAutoBackup661 = !current
    AppToast.show(this, "Create Auto Backup661: ${if (!current) "ON" else "OFF"}")
}

// v661: Crop Auto Region661
internal fun PlayerActivity.showV661CropAutoRegion661Toggle() {
    val current = BiliClient.prefs.v661cropAutoRegion661
    BiliClient.prefs.v661cropAutoRegion661 = !current
    AppToast.show(this, "Crop Auto Region661: ${if (!current) "ON" else "OFF"}")
}

// v662: Config Auto Save662
internal fun PlayerActivity.showV662ConfigAutoSave662Toggle() {
    val current = BiliClient.prefs.v662configAutoSave662
    BiliClient.prefs.v662configAutoSave662 = !current
    AppToast.show(this, "Config Auto Save662: ${if (!current) "ON" else "OFF"}")
}

// v662: Confirm Auto Dialog662
internal fun PlayerActivity.showV662ConfirmAutoDialog662Toggle() {
    val current = BiliClient.prefs.v662confirmAutoDialog662
    BiliClient.prefs.v662confirmAutoDialog662 = !current
    AppToast.show(this, "Confirm Auto Dialog662: ${if (!current) "ON" else "OFF"}")
}

// v662: Console Auto Open662
internal fun PlayerActivity.showV662ConsoleAutoOpen662Toggle() {
    val current = BiliClient.prefs.v662consoleAutoOpen662
    BiliClient.prefs.v662consoleAutoOpen662 = !current
    AppToast.show(this, "Console Auto Open662: ${if (!current) "ON" else "OFF"}")
}

// v662: Constraint Auto Layout662
internal fun PlayerActivity.showV662ConstraintAutoLayout662Toggle() {
    val current = BiliClient.prefs.v662constraintAutoLayout662
    BiliClient.prefs.v662constraintAutoLayout662 = !current
    AppToast.show(this, "Constraint Auto Layout662: ${if (!current) "ON" else "OFF"}")
}

// v662: Content Auto Cache662
internal fun PlayerActivity.showV662ContentAutoCache662Toggle() {
    val current = BiliClient.prefs.v662contentAutoCache662
    BiliClient.prefs.v662contentAutoCache662 = !current
    AppToast.show(this, "Content Auto Cache662: ${if (!current) "ON" else "OFF"}")
}

// v662: Context Auto Menu662
internal fun PlayerActivity.showV662ContextAutoMenu662Toggle() {
    val current = BiliClient.prefs.v662contextAutoMenu662
    BiliClient.prefs.v662contextAutoMenu662 = !current
    AppToast.show(this, "Context Auto Menu662: ${if (!current) "ON" else "OFF"}")
}

// v662: Control Auto Hide662
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

// v662: Convert Auto Format662
internal fun PlayerActivity.showV662ConvertAutoFormat662Toggle() {
    val current = BiliClient.prefs.v662convertAutoFormat662
    BiliClient.prefs.v662convertAutoFormat662 = !current
    AppToast.show(this, "Convert Auto Format662: ${if (!current) "ON" else "OFF"}")
}

// v662: Copy Auto Clipboard662
internal fun PlayerActivity.showV662CopyAutoClipboard662Toggle() {
    val current = BiliClient.prefs.v662copyAutoClipboard662
    BiliClient.prefs.v662copyAutoClipboard662 = !current
    AppToast.show(this, "Copy Auto Clipboard662: ${if (!current) "ON" else "OFF"}")
}

// v662: Core Auto Affinity662
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

// v662: Count Auto Increment662
internal fun PlayerActivity.showV662CountAutoIncrement662Toggle() {
    val current = BiliClient.prefs.v662countAutoIncrement662
    BiliClient.prefs.v662countAutoIncrement662 = !current
    AppToast.show(this, "Count Auto Increment662: ${if (!current) "ON" else "OFF"}")
}

// v662: Cover Auto Generate662
internal fun PlayerActivity.showV662CoverAutoGenerate662Toggle() {
    val current = BiliClient.prefs.v662coverAutoGenerate662
    BiliClient.prefs.v662coverAutoGenerate662 = !current
    AppToast.show(this, "Cover Auto Generate662: ${if (!current) "ON" else "OFF"}")
}

// v662: Crash Auto Report662
internal fun PlayerActivity.showV662CrashAutoReport662Toggle() {
    val current = BiliClient.prefs.v662crashAutoReport662
    BiliClient.prefs.v662crashAutoReport662 = !current
    AppToast.show(this, "Crash Auto Report662: ${if (!current) "ON" else "OFF"}")
}

// v662: Create Auto Backup662
internal fun PlayerActivity.showV662CreateAutoBackup662Toggle() {
    val current = BiliClient.prefs.v662createAutoBackup662
    BiliClient.prefs.v662createAutoBackup662 = !current
    AppToast.show(this, "Create Auto Backup662: ${if (!current) "ON" else "OFF"}")
}

// v662: Crop Auto Region662
internal fun PlayerActivity.showV662CropAutoRegion662Toggle() {
    val current = BiliClient.prefs.v662cropAutoRegion662
    BiliClient.prefs.v662cropAutoRegion662 = !current
    AppToast.show(this, "Crop Auto Region662: ${if (!current) "ON" else "OFF"}")
}

// v663: Config Auto Save663
internal fun PlayerActivity.showV663ConfigAutoSave663Toggle() {
    val current = BiliClient.prefs.v663configAutoSave663
    BiliClient.prefs.v663configAutoSave663 = !current
    AppToast.show(this, "Config Auto Save663: ${if (!current) "ON" else "OFF"}")
}

// v663: Confirm Auto Dialog663
internal fun PlayerActivity.showV663ConfirmAutoDialog663Toggle() {
    val current = BiliClient.prefs.v663confirmAutoDialog663
    BiliClient.prefs.v663confirmAutoDialog663 = !current
    AppToast.show(this, "Confirm Auto Dialog663: ${if (!current) "ON" else "OFF"}")
}

// v663: Console Auto Open663
internal fun PlayerActivity.showV663ConsoleAutoOpen663Toggle() {
    val current = BiliClient.prefs.v663consoleAutoOpen663
    BiliClient.prefs.v663consoleAutoOpen663 = !current
    AppToast.show(this, "Console Auto Open663: ${if (!current) "ON" else "OFF"}")
}

