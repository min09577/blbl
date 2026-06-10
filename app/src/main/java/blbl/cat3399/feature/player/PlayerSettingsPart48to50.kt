package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

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

// v663: Constraint Auto Layout663
internal fun PlayerActivity.showV663ConstraintAutoLayout663Toggle() {
    val current = BiliClient.prefs.v663constraintAutoLayout663
    BiliClient.prefs.v663constraintAutoLayout663 = !current
    AppToast.show(this, "Constraint Auto Layout663: ${if (!current) "ON" else "OFF"}")
}

// v663: Content Auto Cache663
internal fun PlayerActivity.showV663ContentAutoCache663Toggle() {
    val current = BiliClient.prefs.v663contentAutoCache663
    BiliClient.prefs.v663contentAutoCache663 = !current
    AppToast.show(this, "Content Auto Cache663: ${if (!current) "ON" else "OFF"}")
}

// v663: Context Auto Menu663
internal fun PlayerActivity.showV663ContextAutoMenu663Toggle() {
    val current = BiliClient.prefs.v663contextAutoMenu663
    BiliClient.prefs.v663contextAutoMenu663 = !current
    AppToast.show(this, "Context Auto Menu663: ${if (!current) "ON" else "OFF"}")
}

// v663: Control Auto Hide663
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

// v663: Convert Auto Format663
internal fun PlayerActivity.showV663ConvertAutoFormat663Toggle() {
    val current = BiliClient.prefs.v663convertAutoFormat663
    BiliClient.prefs.v663convertAutoFormat663 = !current
    AppToast.show(this, "Convert Auto Format663: ${if (!current) "ON" else "OFF"}")
}

// v663: Copy Auto Clipboard663
internal fun PlayerActivity.showV663CopyAutoClipboard663Toggle() {
    val current = BiliClient.prefs.v663copyAutoClipboard663
    BiliClient.prefs.v663copyAutoClipboard663 = !current
    AppToast.show(this, "Copy Auto Clipboard663: ${if (!current) "ON" else "OFF"}")
}

// v663: Core Auto Affinity663
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

// v663: Count Auto Increment663
internal fun PlayerActivity.showV663CountAutoIncrement663Toggle() {
    val current = BiliClient.prefs.v663countAutoIncrement663
    BiliClient.prefs.v663countAutoIncrement663 = !current
    AppToast.show(this, "Count Auto Increment663: ${if (!current) "ON" else "OFF"}")
}

// v663: Cover Auto Generate663
internal fun PlayerActivity.showV663CoverAutoGenerate663Toggle() {
    val current = BiliClient.prefs.v663coverAutoGenerate663
    BiliClient.prefs.v663coverAutoGenerate663 = !current
    AppToast.show(this, "Cover Auto Generate663: ${if (!current) "ON" else "OFF"}")
}

// v663: Crash Auto Report663
internal fun PlayerActivity.showV663CrashAutoReport663Toggle() {
    val current = BiliClient.prefs.v663crashAutoReport663
    BiliClient.prefs.v663crashAutoReport663 = !current
    AppToast.show(this, "Crash Auto Report663: ${if (!current) "ON" else "OFF"}")
}

// v663: Create Auto Backup663
internal fun PlayerActivity.showV663CreateAutoBackup663Toggle() {
    val current = BiliClient.prefs.v663createAutoBackup663
    BiliClient.prefs.v663createAutoBackup663 = !current
    AppToast.show(this, "Create Auto Backup663: ${if (!current) "ON" else "OFF"}")
}

// v663: Crop Auto Region663
internal fun PlayerActivity.showV663CropAutoRegion663Toggle() {
    val current = BiliClient.prefs.v663cropAutoRegion663
    BiliClient.prefs.v663cropAutoRegion663 = !current
    AppToast.show(this, "Crop Auto Region663: ${if (!current) "ON" else "OFF"}")
}

// v664: Config Auto Save664
internal fun PlayerActivity.showV664ConfigAutoSave664Toggle() {
    val current = BiliClient.prefs.v664configAutoSave664
    BiliClient.prefs.v664configAutoSave664 = !current
    AppToast.show(this, "Config Auto Save664: ${if (!current) "ON" else "OFF"}")
}

// v664: Confirm Auto Dialog664
internal fun PlayerActivity.showV664ConfirmAutoDialog664Toggle() {
    val current = BiliClient.prefs.v664confirmAutoDialog664
    BiliClient.prefs.v664confirmAutoDialog664 = !current
    AppToast.show(this, "Confirm Auto Dialog664: ${if (!current) "ON" else "OFF"}")
}

// v664: Console Auto Open664
internal fun PlayerActivity.showV664ConsoleAutoOpen664Toggle() {
    val current = BiliClient.prefs.v664consoleAutoOpen664
    BiliClient.prefs.v664consoleAutoOpen664 = !current
    AppToast.show(this, "Console Auto Open664: ${if (!current) "ON" else "OFF"}")
}

// v664: Constraint Auto Layout664
internal fun PlayerActivity.showV664ConstraintAutoLayout664Toggle() {
    val current = BiliClient.prefs.v664constraintAutoLayout664
    BiliClient.prefs.v664constraintAutoLayout664 = !current
    AppToast.show(this, "Constraint Auto Layout664: ${if (!current) "ON" else "OFF"}")
}

// v664: Content Auto Cache664
internal fun PlayerActivity.showV664ContentAutoCache664Toggle() {
    val current = BiliClient.prefs.v664contentAutoCache664
    BiliClient.prefs.v664contentAutoCache664 = !current
    AppToast.show(this, "Content Auto Cache664: ${if (!current) "ON" else "OFF"}")
}

// v664: Context Auto Menu664
internal fun PlayerActivity.showV664ContextAutoMenu664Toggle() {
    val current = BiliClient.prefs.v664contextAutoMenu664
    BiliClient.prefs.v664contextAutoMenu664 = !current
    AppToast.show(this, "Context Auto Menu664: ${if (!current) "ON" else "OFF"}")
}

// v664: Control Auto Hide664
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

// v664: Convert Auto Format664
internal fun PlayerActivity.showV664ConvertAutoFormat664Toggle() {
    val current = BiliClient.prefs.v664convertAutoFormat664
    BiliClient.prefs.v664convertAutoFormat664 = !current
    AppToast.show(this, "Convert Auto Format664: ${if (!current) "ON" else "OFF"}")
}

// v664: Copy Auto Clipboard664
internal fun PlayerActivity.showV664CopyAutoClipboard664Toggle() {
    val current = BiliClient.prefs.v664copyAutoClipboard664
    BiliClient.prefs.v664copyAutoClipboard664 = !current
    AppToast.show(this, "Copy Auto Clipboard664: ${if (!current) "ON" else "OFF"}")
}

// v664: Core Auto Affinity664
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

// v664: Count Auto Increment664
internal fun PlayerActivity.showV664CountAutoIncrement664Toggle() {
    val current = BiliClient.prefs.v664countAutoIncrement664
    BiliClient.prefs.v664countAutoIncrement664 = !current
    AppToast.show(this, "Count Auto Increment664: ${if (!current) "ON" else "OFF"}")
}

// v664: Cover Auto Generate664
internal fun PlayerActivity.showV664CoverAutoGenerate664Toggle() {
    val current = BiliClient.prefs.v664coverAutoGenerate664
    BiliClient.prefs.v664coverAutoGenerate664 = !current
    AppToast.show(this, "Cover Auto Generate664: ${if (!current) "ON" else "OFF"}")
}

// v664: Crash Auto Report664
internal fun PlayerActivity.showV664CrashAutoReport664Toggle() {
    val current = BiliClient.prefs.v664crashAutoReport664
    BiliClient.prefs.v664crashAutoReport664 = !current
    AppToast.show(this, "Crash Auto Report664: ${if (!current) "ON" else "OFF"}")
}

// v664: Create Auto Backup664
internal fun PlayerActivity.showV664CreateAutoBackup664Toggle() {
    val current = BiliClient.prefs.v664createAutoBackup664
    BiliClient.prefs.v664createAutoBackup664 = !current
    AppToast.show(this, "Create Auto Backup664: ${if (!current) "ON" else "OFF"}")
}

// v664: Crop Auto Region664
internal fun PlayerActivity.showV664CropAutoRegion664Toggle() {
    val current = BiliClient.prefs.v664cropAutoRegion664
    BiliClient.prefs.v664cropAutoRegion664 = !current
    AppToast.show(this, "Crop Auto Region664: ${if (!current) "ON" else "OFF"}")
}

// v665: Config Auto Save665
internal fun PlayerActivity.showV665ConfigAutoSave665Toggle() {
    val current = BiliClient.prefs.v665configAutoSave665
    BiliClient.prefs.v665configAutoSave665 = !current
    AppToast.show(this, "Config Auto Save665: ${if (!current) "ON" else "OFF"}")
}

// v665: Confirm Auto Dialog665
internal fun PlayerActivity.showV665ConfirmAutoDialog665Toggle() {
    val current = BiliClient.prefs.v665confirmAutoDialog665
    BiliClient.prefs.v665confirmAutoDialog665 = !current
    AppToast.show(this, "Confirm Auto Dialog665: ${if (!current) "ON" else "OFF"}")
}

// v665: Console Auto Open665
internal fun PlayerActivity.showV665ConsoleAutoOpen665Toggle() {
    val current = BiliClient.prefs.v665consoleAutoOpen665
    BiliClient.prefs.v665consoleAutoOpen665 = !current
    AppToast.show(this, "Console Auto Open665: ${if (!current) "ON" else "OFF"}")
}

// v665: Constraint Auto Layout665
internal fun PlayerActivity.showV665ConstraintAutoLayout665Toggle() {
    val current = BiliClient.prefs.v665constraintAutoLayout665
    BiliClient.prefs.v665constraintAutoLayout665 = !current
    AppToast.show(this, "Constraint Auto Layout665: ${if (!current) "ON" else "OFF"}")
}

// v665: Content Auto Cache665
internal fun PlayerActivity.showV665ContentAutoCache665Toggle() {
    val current = BiliClient.prefs.v665contentAutoCache665
    BiliClient.prefs.v665contentAutoCache665 = !current
    AppToast.show(this, "Content Auto Cache665: ${if (!current) "ON" else "OFF"}")
}

// v665: Context Auto Menu665
internal fun PlayerActivity.showV665ContextAutoMenu665Toggle() {
    val current = BiliClient.prefs.v665contextAutoMenu665
    BiliClient.prefs.v665contextAutoMenu665 = !current
    AppToast.show(this, "Context Auto Menu665: ${if (!current) "ON" else "OFF"}")
}

// v665: Control Auto Hide665
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

// v665: Convert Auto Format665
internal fun PlayerActivity.showV665ConvertAutoFormat665Toggle() {
    val current = BiliClient.prefs.v665convertAutoFormat665
    BiliClient.prefs.v665convertAutoFormat665 = !current
    AppToast.show(this, "Convert Auto Format665: ${if (!current) "ON" else "OFF"}")
}

// v665: Copy Auto Clipboard665
internal fun PlayerActivity.showV665CopyAutoClipboard665Toggle() {
    val current = BiliClient.prefs.v665copyAutoClipboard665
    BiliClient.prefs.v665copyAutoClipboard665 = !current
    AppToast.show(this, "Copy Auto Clipboard665: ${if (!current) "ON" else "OFF"}")
}

// v665: Core Auto Affinity665
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

// v665: Count Auto Increment665
internal fun PlayerActivity.showV665CountAutoIncrement665Toggle() {
    val current = BiliClient.prefs.v665countAutoIncrement665
    BiliClient.prefs.v665countAutoIncrement665 = !current
    AppToast.show(this, "Count Auto Increment665: ${if (!current) "ON" else "OFF"}")
}

// v665: Cover Auto Generate665
internal fun PlayerActivity.showV665CoverAutoGenerate665Toggle() {
    val current = BiliClient.prefs.v665coverAutoGenerate665
    BiliClient.prefs.v665coverAutoGenerate665 = !current
    AppToast.show(this, "Cover Auto Generate665: ${if (!current) "ON" else "OFF"}")
}

// v665: Crash Auto Report665
internal fun PlayerActivity.showV665CrashAutoReport665Toggle() {
    val current = BiliClient.prefs.v665crashAutoReport665
    BiliClient.prefs.v665crashAutoReport665 = !current
    AppToast.show(this, "Crash Auto Report665: ${if (!current) "ON" else "OFF"}")
}

// v665: Create Auto Backup665
internal fun PlayerActivity.showV665CreateAutoBackup665Toggle() {
    val current = BiliClient.prefs.v665createAutoBackup665
    BiliClient.prefs.v665createAutoBackup665 = !current
    AppToast.show(this, "Create Auto Backup665: ${if (!current) "ON" else "OFF"}")
}

// v665: Crop Auto Region665
internal fun PlayerActivity.showV665CropAutoRegion665Toggle() {
    val current = BiliClient.prefs.v665cropAutoRegion665
    BiliClient.prefs.v665cropAutoRegion665 = !current
    AppToast.show(this, "Crop Auto Region665: ${if (!current) "ON" else "OFF"}")
}

// v666: Config Auto Save666
internal fun PlayerActivity.showV666ConfigAutoSave666Toggle() {
    val current = BiliClient.prefs.v666configAutoSave666
    BiliClient.prefs.v666configAutoSave666 = !current
    AppToast.show(this, "Config Auto Save666: ${if (!current) "ON" else "OFF"}")
}

// v666: Confirm Auto Dialog666
internal fun PlayerActivity.showV666ConfirmAutoDialog666Toggle() {
    val current = BiliClient.prefs.v666confirmAutoDialog666
    BiliClient.prefs.v666confirmAutoDialog666 = !current
    AppToast.show(this, "Confirm Auto Dialog666: ${if (!current) "ON" else "OFF"}")
}

// v666: Console Auto Open666
internal fun PlayerActivity.showV666ConsoleAutoOpen666Toggle() {
    val current = BiliClient.prefs.v666consoleAutoOpen666
    BiliClient.prefs.v666consoleAutoOpen666 = !current
    AppToast.show(this, "Console Auto Open666: ${if (!current) "ON" else "OFF"}")
}

// v666: Constraint Auto Layout666
internal fun PlayerActivity.showV666ConstraintAutoLayout666Toggle() {
    val current = BiliClient.prefs.v666constraintAutoLayout666
    BiliClient.prefs.v666constraintAutoLayout666 = !current
    AppToast.show(this, "Constraint Auto Layout666: ${if (!current) "ON" else "OFF"}")
}

// v666: Content Auto Cache666
internal fun PlayerActivity.showV666ContentAutoCache666Toggle() {
    val current = BiliClient.prefs.v666contentAutoCache666
    BiliClient.prefs.v666contentAutoCache666 = !current
    AppToast.show(this, "Content Auto Cache666: ${if (!current) "ON" else "OFF"}")
}

// v666: Context Auto Menu666
internal fun PlayerActivity.showV666ContextAutoMenu666Toggle() {
    val current = BiliClient.prefs.v666contextAutoMenu666
    BiliClient.prefs.v666contextAutoMenu666 = !current
    AppToast.show(this, "Context Auto Menu666: ${if (!current) "ON" else "OFF"}")
}

// v666: Control Auto Hide666
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

// v666: Convert Auto Format666
internal fun PlayerActivity.showV666ConvertAutoFormat666Toggle() {
    val current = BiliClient.prefs.v666convertAutoFormat666
    BiliClient.prefs.v666convertAutoFormat666 = !current
    AppToast.show(this, "Convert Auto Format666: ${if (!current) "ON" else "OFF"}")
}

// v666: Copy Auto Clipboard666
internal fun PlayerActivity.showV666CopyAutoClipboard666Toggle() {
    val current = BiliClient.prefs.v666copyAutoClipboard666
    BiliClient.prefs.v666copyAutoClipboard666 = !current
    AppToast.show(this, "Copy Auto Clipboard666: ${if (!current) "ON" else "OFF"}")
}

// v666: Core Auto Affinity666
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

// v666: Count Auto Increment666
internal fun PlayerActivity.showV666CountAutoIncrement666Toggle() {
    val current = BiliClient.prefs.v666countAutoIncrement666
    BiliClient.prefs.v666countAutoIncrement666 = !current
    AppToast.show(this, "Count Auto Increment666: ${if (!current) "ON" else "OFF"}")
}

// v666: Cover Auto Generate666
internal fun PlayerActivity.showV666CoverAutoGenerate666Toggle() {
    val current = BiliClient.prefs.v666coverAutoGenerate666
    BiliClient.prefs.v666coverAutoGenerate666 = !current
    AppToast.show(this, "Cover Auto Generate666: ${if (!current) "ON" else "OFF"}")
}

// v666: Crash Auto Report666
internal fun PlayerActivity.showV666CrashAutoReport666Toggle() {
    val current = BiliClient.prefs.v666crashAutoReport666
    BiliClient.prefs.v666crashAutoReport666 = !current
    AppToast.show(this, "Crash Auto Report666: ${if (!current) "ON" else "OFF"}")
}

// v666: Create Auto Backup666
internal fun PlayerActivity.showV666CreateAutoBackup666Toggle() {
    val current = BiliClient.prefs.v666createAutoBackup666
    BiliClient.prefs.v666createAutoBackup666 = !current
    AppToast.show(this, "Create Auto Backup666: ${if (!current) "ON" else "OFF"}")
}

// v666: Crop Auto Region666
internal fun PlayerActivity.showV666CropAutoRegion666Toggle() {
    val current = BiliClient.prefs.v666cropAutoRegion666
    BiliClient.prefs.v666cropAutoRegion666 = !current
    AppToast.show(this, "Crop Auto Region666: ${if (!current) "ON" else "OFF"}")
}

// v667: Config Auto Save667
internal fun PlayerActivity.showV667ConfigAutoSave667Toggle() {
    val current = BiliClient.prefs.v667configAutoSave667
    BiliClient.prefs.v667configAutoSave667 = !current
    AppToast.show(this, "Config Auto Save667: ${if (!current) "ON" else "OFF"}")
}

// v667: Confirm Auto Dialog667
internal fun PlayerActivity.showV667ConfirmAutoDialog667Toggle() {
    val current = BiliClient.prefs.v667confirmAutoDialog667
    BiliClient.prefs.v667confirmAutoDialog667 = !current
    AppToast.show(this, "Confirm Auto Dialog667: ${if (!current) "ON" else "OFF"}")
}

// v667: Console Auto Open667
internal fun PlayerActivity.showV667ConsoleAutoOpen667Toggle() {
    val current = BiliClient.prefs.v667consoleAutoOpen667
    BiliClient.prefs.v667consoleAutoOpen667 = !current
    AppToast.show(this, "Console Auto Open667: ${if (!current) "ON" else "OFF"}")
}

// v667: Constraint Auto Layout667
internal fun PlayerActivity.showV667ConstraintAutoLayout667Toggle() {
    val current = BiliClient.prefs.v667constraintAutoLayout667
    BiliClient.prefs.v667constraintAutoLayout667 = !current
    AppToast.show(this, "Constraint Auto Layout667: ${if (!current) "ON" else "OFF"}")
}

// v667: Content Auto Cache667
internal fun PlayerActivity.showV667ContentAutoCache667Toggle() {
    val current = BiliClient.prefs.v667contentAutoCache667
    BiliClient.prefs.v667contentAutoCache667 = !current
    AppToast.show(this, "Content Auto Cache667: ${if (!current) "ON" else "OFF"}")
}

// v667: Context Auto Menu667
internal fun PlayerActivity.showV667ContextAutoMenu667Toggle() {
    val current = BiliClient.prefs.v667contextAutoMenu667
    BiliClient.prefs.v667contextAutoMenu667 = !current
    AppToast.show(this, "Context Auto Menu667: ${if (!current) "ON" else "OFF"}")
}

// v667: Control Auto Hide667
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

// v667: Convert Auto Format667
internal fun PlayerActivity.showV667ConvertAutoFormat667Toggle() {
    val current = BiliClient.prefs.v667convertAutoFormat667
    BiliClient.prefs.v667convertAutoFormat667 = !current
    AppToast.show(this, "Convert Auto Format667: ${if (!current) "ON" else "OFF"}")
}

// v667: Copy Auto Clipboard667
internal fun PlayerActivity.showV667CopyAutoClipboard667Toggle() {
    val current = BiliClient.prefs.v667copyAutoClipboard667
    BiliClient.prefs.v667copyAutoClipboard667 = !current
    AppToast.show(this, "Copy Auto Clipboard667: ${if (!current) "ON" else "OFF"}")
}

// v667: Core Auto Affinity667
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

// v667: Count Auto Increment667
internal fun PlayerActivity.showV667CountAutoIncrement667Toggle() {
    val current = BiliClient.prefs.v667countAutoIncrement667
    BiliClient.prefs.v667countAutoIncrement667 = !current
    AppToast.show(this, "Count Auto Increment667: ${if (!current) "ON" else "OFF"}")
}

// v667: Cover Auto Generate667
internal fun PlayerActivity.showV667CoverAutoGenerate667Toggle() {
    val current = BiliClient.prefs.v667coverAutoGenerate667
    BiliClient.prefs.v667coverAutoGenerate667 = !current
    AppToast.show(this, "Cover Auto Generate667: ${if (!current) "ON" else "OFF"}")
}

// v667: Crash Auto Report667
internal fun PlayerActivity.showV667CrashAutoReport667Toggle() {
    val current = BiliClient.prefs.v667crashAutoReport667
    BiliClient.prefs.v667crashAutoReport667 = !current
    AppToast.show(this, "Crash Auto Report667: ${if (!current) "ON" else "OFF"}")
}

// v667: Create Auto Backup667
internal fun PlayerActivity.showV667CreateAutoBackup667Toggle() {
    val current = BiliClient.prefs.v667createAutoBackup667
    BiliClient.prefs.v667createAutoBackup667 = !current
    AppToast.show(this, "Create Auto Backup667: ${if (!current) "ON" else "OFF"}")
}

// v667: Crop Auto Region667
internal fun PlayerActivity.showV667CropAutoRegion667Toggle() {
    val current = BiliClient.prefs.v667cropAutoRegion667
    BiliClient.prefs.v667cropAutoRegion667 = !current
    AppToast.show(this, "Crop Auto Region667: ${if (!current) "ON" else "OFF"}")
}

// v668: Config Auto Save668
internal fun PlayerActivity.showV668ConfigAutoSave668Toggle() {
    val current = BiliClient.prefs.v668configAutoSave668
    BiliClient.prefs.v668configAutoSave668 = !current
    AppToast.show(this, "Config Auto Save668: ${if (!current) "ON" else "OFF"}")
}

// v668: Confirm Auto Dialog668
internal fun PlayerActivity.showV668ConfirmAutoDialog668Toggle() {
    val current = BiliClient.prefs.v668confirmAutoDialog668
    BiliClient.prefs.v668confirmAutoDialog668 = !current
    AppToast.show(this, "Confirm Auto Dialog668: ${if (!current) "ON" else "OFF"}")
}

// v668: Console Auto Open668
internal fun PlayerActivity.showV668ConsoleAutoOpen668Toggle() {
    val current = BiliClient.prefs.v668consoleAutoOpen668
    BiliClient.prefs.v668consoleAutoOpen668 = !current
    AppToast.show(this, "Console Auto Open668: ${if (!current) "ON" else "OFF"}")
}

// v668: Constraint Auto Layout668
internal fun PlayerActivity.showV668ConstraintAutoLayout668Toggle() {
    val current = BiliClient.prefs.v668constraintAutoLayout668
    BiliClient.prefs.v668constraintAutoLayout668 = !current
    AppToast.show(this, "Constraint Auto Layout668: ${if (!current) "ON" else "OFF"}")
}

// v668: Content Auto Cache668
internal fun PlayerActivity.showV668ContentAutoCache668Toggle() {
    val current = BiliClient.prefs.v668contentAutoCache668
    BiliClient.prefs.v668contentAutoCache668 = !current
    AppToast.show(this, "Content Auto Cache668: ${if (!current) "ON" else "OFF"}")
}

// v668: Context Auto Menu668
internal fun PlayerActivity.showV668ContextAutoMenu668Toggle() {
    val current = BiliClient.prefs.v668contextAutoMenu668
    BiliClient.prefs.v668contextAutoMenu668 = !current
    AppToast.show(this, "Context Auto Menu668: ${if (!current) "ON" else "OFF"}")
}

// v668: Control Auto Hide668
internal fun PlayerActivity.showV668ControlAutoHide668Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v668controlAutoHide668).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide668",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v668controlAutoHide668 = value
        AppToast.show(this, "Control Auto Hide668: $value")
    }
}

// v668: Convert Auto Format668
internal fun PlayerActivity.showV668ConvertAutoFormat668Toggle() {
    val current = BiliClient.prefs.v668convertAutoFormat668
    BiliClient.prefs.v668convertAutoFormat668 = !current
    AppToast.show(this, "Convert Auto Format668: ${if (!current) "ON" else "OFF"}")
}

// v668: Copy Auto Clipboard668
internal fun PlayerActivity.showV668CopyAutoClipboard668Toggle() {
    val current = BiliClient.prefs.v668copyAutoClipboard668
    BiliClient.prefs.v668copyAutoClipboard668 = !current
    AppToast.show(this, "Copy Auto Clipboard668: ${if (!current) "ON" else "OFF"}")
}

// v668: Core Auto Affinity668
internal fun PlayerActivity.showV668CoreAutoAffinity668Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v668coreAutoAffinity668).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity668",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v668coreAutoAffinity668 = value
        AppToast.show(this, "Core Auto Affinity668: $value")
    }
}

// v668: Count Auto Increment668
internal fun PlayerActivity.showV668CountAutoIncrement668Toggle() {
    val current = BiliClient.prefs.v668countAutoIncrement668
    BiliClient.prefs.v668countAutoIncrement668 = !current
    AppToast.show(this, "Count Auto Increment668: ${if (!current) "ON" else "OFF"}")
}

// v668: Cover Auto Generate668
internal fun PlayerActivity.showV668CoverAutoGenerate668Toggle() {
    val current = BiliClient.prefs.v668coverAutoGenerate668
    BiliClient.prefs.v668coverAutoGenerate668 = !current
    AppToast.show(this, "Cover Auto Generate668: ${if (!current) "ON" else "OFF"}")
}

// v668: Crash Auto Report668
internal fun PlayerActivity.showV668CrashAutoReport668Toggle() {
    val current = BiliClient.prefs.v668crashAutoReport668
    BiliClient.prefs.v668crashAutoReport668 = !current
    AppToast.show(this, "Crash Auto Report668: ${if (!current) "ON" else "OFF"}")
}

// v668: Create Auto Backup668
internal fun PlayerActivity.showV668CreateAutoBackup668Toggle() {
    val current = BiliClient.prefs.v668createAutoBackup668
    BiliClient.prefs.v668createAutoBackup668 = !current
    AppToast.show(this, "Create Auto Backup668: ${if (!current) "ON" else "OFF"}")
}

// v668: Crop Auto Region668
internal fun PlayerActivity.showV668CropAutoRegion668Toggle() {
    val current = BiliClient.prefs.v668cropAutoRegion668
    BiliClient.prefs.v668cropAutoRegion668 = !current
    AppToast.show(this, "Crop Auto Region668: ${if (!current) "ON" else "OFF"}")
}

// v669: Config Auto Save669
internal fun PlayerActivity.showV669ConfigAutoSave669Toggle() {
    val current = BiliClient.prefs.v669configAutoSave669
    BiliClient.prefs.v669configAutoSave669 = !current
    AppToast.show(this, "Config Auto Save669: ${if (!current) "ON" else "OFF"}")
}

// v669: Confirm Auto Dialog669
internal fun PlayerActivity.showV669ConfirmAutoDialog669Toggle() {
    val current = BiliClient.prefs.v669confirmAutoDialog669
    BiliClient.prefs.v669confirmAutoDialog669 = !current
    AppToast.show(this, "Confirm Auto Dialog669: ${if (!current) "ON" else "OFF"}")
}

// v669: Console Auto Open669
internal fun PlayerActivity.showV669ConsoleAutoOpen669Toggle() {
    val current = BiliClient.prefs.v669consoleAutoOpen669
    BiliClient.prefs.v669consoleAutoOpen669 = !current
    AppToast.show(this, "Console Auto Open669: ${if (!current) "ON" else "OFF"}")
}

// v669: Constraint Auto Layout669
internal fun PlayerActivity.showV669ConstraintAutoLayout669Toggle() {
    val current = BiliClient.prefs.v669constraintAutoLayout669
    BiliClient.prefs.v669constraintAutoLayout669 = !current
    AppToast.show(this, "Constraint Auto Layout669: ${if (!current) "ON" else "OFF"}")
}

// v669: Content Auto Cache669
internal fun PlayerActivity.showV669ContentAutoCache669Toggle() {
    val current = BiliClient.prefs.v669contentAutoCache669
    BiliClient.prefs.v669contentAutoCache669 = !current
    AppToast.show(this, "Content Auto Cache669: ${if (!current) "ON" else "OFF"}")
}

// v669: Context Auto Menu669
internal fun PlayerActivity.showV669ContextAutoMenu669Toggle() {
    val current = BiliClient.prefs.v669contextAutoMenu669
    BiliClient.prefs.v669contextAutoMenu669 = !current
    AppToast.show(this, "Context Auto Menu669: ${if (!current) "ON" else "OFF"}")
}

// v669: Control Auto Hide669
internal fun PlayerActivity.showV669ControlAutoHide669Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v669controlAutoHide669).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide669",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v669controlAutoHide669 = value
        AppToast.show(this, "Control Auto Hide669: $value")
    }
}

// v669: Convert Auto Format669
internal fun PlayerActivity.showV669ConvertAutoFormat669Toggle() {
    val current = BiliClient.prefs.v669convertAutoFormat669
    BiliClient.prefs.v669convertAutoFormat669 = !current
    AppToast.show(this, "Convert Auto Format669: ${if (!current) "ON" else "OFF"}")
}

// v669: Copy Auto Clipboard669
internal fun PlayerActivity.showV669CopyAutoClipboard669Toggle() {
    val current = BiliClient.prefs.v669copyAutoClipboard669
    BiliClient.prefs.v669copyAutoClipboard669 = !current
    AppToast.show(this, "Copy Auto Clipboard669: ${if (!current) "ON" else "OFF"}")
}

// v669: Core Auto Affinity669
internal fun PlayerActivity.showV669CoreAutoAffinity669Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v669coreAutoAffinity669).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity669",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v669coreAutoAffinity669 = value
        AppToast.show(this, "Core Auto Affinity669: $value")
    }
}

// v669: Count Auto Increment669
internal fun PlayerActivity.showV669CountAutoIncrement669Toggle() {
    val current = BiliClient.prefs.v669countAutoIncrement669
    BiliClient.prefs.v669countAutoIncrement669 = !current
    AppToast.show(this, "Count Auto Increment669: ${if (!current) "ON" else "OFF"}")
}

// v669: Cover Auto Generate669
internal fun PlayerActivity.showV669CoverAutoGenerate669Toggle() {
    val current = BiliClient.prefs.v669coverAutoGenerate669
    BiliClient.prefs.v669coverAutoGenerate669 = !current
    AppToast.show(this, "Cover Auto Generate669: ${if (!current) "ON" else "OFF"}")
}

// v669: Crash Auto Report669
internal fun PlayerActivity.showV669CrashAutoReport669Toggle() {
    val current = BiliClient.prefs.v669crashAutoReport669
    BiliClient.prefs.v669crashAutoReport669 = !current
    AppToast.show(this, "Crash Auto Report669: ${if (!current) "ON" else "OFF"}")
}

// v669: Create Auto Backup669
internal fun PlayerActivity.showV669CreateAutoBackup669Toggle() {
    val current = BiliClient.prefs.v669createAutoBackup669
    BiliClient.prefs.v669createAutoBackup669 = !current
    AppToast.show(this, "Create Auto Backup669: ${if (!current) "ON" else "OFF"}")
}

// v669: Crop Auto Region669
internal fun PlayerActivity.showV669CropAutoRegion669Toggle() {
    val current = BiliClient.prefs.v669cropAutoRegion669
    BiliClient.prefs.v669cropAutoRegion669 = !current
    AppToast.show(this, "Crop Auto Region669: ${if (!current) "ON" else "OFF"}")
}

// v670: Config Auto Save670
internal fun PlayerActivity.showV670ConfigAutoSave670Toggle() {
    val current = BiliClient.prefs.v670configAutoSave670
    BiliClient.prefs.v670configAutoSave670 = !current
    AppToast.show(this, "Config Auto Save670: ${if (!current) "ON" else "OFF"}")
}

// v670: Confirm Auto Dialog670
internal fun PlayerActivity.showV670ConfirmAutoDialog670Toggle() {
    val current = BiliClient.prefs.v670confirmAutoDialog670
    BiliClient.prefs.v670confirmAutoDialog670 = !current
    AppToast.show(this, "Confirm Auto Dialog670: ${if (!current) "ON" else "OFF"}")
}

// v670: Console Auto Open670
internal fun PlayerActivity.showV670ConsoleAutoOpen670Toggle() {
    val current = BiliClient.prefs.v670consoleAutoOpen670
    BiliClient.prefs.v670consoleAutoOpen670 = !current
    AppToast.show(this, "Console Auto Open670: ${if (!current) "ON" else "OFF"}")
}

// v670: Constraint Auto Layout670
internal fun PlayerActivity.showV670ConstraintAutoLayout670Toggle() {
    val current = BiliClient.prefs.v670constraintAutoLayout670
    BiliClient.prefs.v670constraintAutoLayout670 = !current
    AppToast.show(this, "Constraint Auto Layout670: ${if (!current) "ON" else "OFF"}")
}

// v670: Content Auto Cache670
internal fun PlayerActivity.showV670ContentAutoCache670Toggle() {
    val current = BiliClient.prefs.v670contentAutoCache670
    BiliClient.prefs.v670contentAutoCache670 = !current
    AppToast.show(this, "Content Auto Cache670: ${if (!current) "ON" else "OFF"}")
}

// v670: Context Auto Menu670
internal fun PlayerActivity.showV670ContextAutoMenu670Toggle() {
    val current = BiliClient.prefs.v670contextAutoMenu670
    BiliClient.prefs.v670contextAutoMenu670 = !current
    AppToast.show(this, "Context Auto Menu670: ${if (!current) "ON" else "OFF"}")
}

// v670: Control Auto Hide670
internal fun PlayerActivity.showV670ControlAutoHide670Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v670controlAutoHide670).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Control Auto Hide670",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v670controlAutoHide670 = value
        AppToast.show(this, "Control Auto Hide670: $value")
    }
}

// v670: Convert Auto Format670
internal fun PlayerActivity.showV670ConvertAutoFormat670Toggle() {
    val current = BiliClient.prefs.v670convertAutoFormat670
    BiliClient.prefs.v670convertAutoFormat670 = !current
    AppToast.show(this, "Convert Auto Format670: ${if (!current) "ON" else "OFF"}")
}

// v670: Copy Auto Clipboard670
internal fun PlayerActivity.showV670CopyAutoClipboard670Toggle() {
    val current = BiliClient.prefs.v670copyAutoClipboard670
    BiliClient.prefs.v670copyAutoClipboard670 = !current
    AppToast.show(this, "Copy Auto Clipboard670: ${if (!current) "ON" else "OFF"}")
}

// v670: Core Auto Affinity670
internal fun PlayerActivity.showV670CoreAutoAffinity670Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v670coreAutoAffinity670).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Core Auto Affinity670",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v670coreAutoAffinity670 = value
        AppToast.show(this, "Core Auto Affinity670: $value")
    }
}

// v670: Count Auto Increment670
internal fun PlayerActivity.showV670CountAutoIncrement670Toggle() {
    val current = BiliClient.prefs.v670countAutoIncrement670
    BiliClient.prefs.v670countAutoIncrement670 = !current
    AppToast.show(this, "Count Auto Increment670: ${if (!current) "ON" else "OFF"}")
}

// v670: Cover Auto Generate670
internal fun PlayerActivity.showV670CoverAutoGenerate670Toggle() {
    val current = BiliClient.prefs.v670coverAutoGenerate670
    BiliClient.prefs.v670coverAutoGenerate670 = !current
    AppToast.show(this, "Cover Auto Generate670: ${if (!current) "ON" else "OFF"}")
}

// v670: Crash Auto Report670
internal fun PlayerActivity.showV670CrashAutoReport670Toggle() {
    val current = BiliClient.prefs.v670crashAutoReport670
    BiliClient.prefs.v670crashAutoReport670 = !current
    AppToast.show(this, "Crash Auto Report670: ${if (!current) "ON" else "OFF"}")
}

// v670: Create Auto Backup670
internal fun PlayerActivity.showV670CreateAutoBackup670Toggle() {
    val current = BiliClient.prefs.v670createAutoBackup670
    BiliClient.prefs.v670createAutoBackup670 = !current
    AppToast.show(this, "Create Auto Backup670: ${if (!current) "ON" else "OFF"}")
}

// v670: Crop Auto Region670
internal fun PlayerActivity.showV670CropAutoRegion670Toggle() {
    val current = BiliClient.prefs.v670cropAutoRegion670
    BiliClient.prefs.v670cropAutoRegion670 = !current
    AppToast.show(this, "Crop Auto Region670: ${if (!current) "ON" else "OFF"}")
}

// v671: Cross Auto Fade671
internal fun PlayerActivity.showV671CrossAutoFade671Toggle() {
    val current = BiliClient.prefs.v671crossAutoFade671
    BiliClient.prefs.v671crossAutoFade671 = !current
    AppToast.show(this, "Cross Auto Fade671: ${if (!current) "ON" else "OFF"}")
}

// v671: Crypto Auto Hash671
internal fun PlayerActivity.showV671CryptoAutoHash671Toggle() {
    val current = BiliClient.prefs.v671cryptoAutoHash671
    BiliClient.prefs.v671cryptoAutoHash671 = !current
    AppToast.show(this, "Crypto Auto Hash671: ${if (!current) "ON" else "OFF"}")
}

// v671: Cursor Auto Hide671
internal fun PlayerActivity.showV671CursorAutoHide671Toggle() {
    val current = BiliClient.prefs.v671cursorAutoHide671
    BiliClient.prefs.v671cursorAutoHide671 = !current
    AppToast.show(this, "Cursor Auto Hide671: ${if (!current) "ON" else "OFF"}")
}

// v671: Curve Auto Smooth671
internal fun PlayerActivity.showV671CurveAutoSmooth671Toggle() {
    val current = BiliClient.prefs.v671curveAutoSmooth671
    BiliClient.prefs.v671curveAutoSmooth671 = !current
    AppToast.show(this, "Curve Auto Smooth671: ${if (!current) "ON" else "OFF"}")
}

// v671: Custom Auto Theme671
internal fun PlayerActivity.showV671CustomAutoTheme671Toggle() {
    val current = BiliClient.prefs.v671customAutoTheme671
    BiliClient.prefs.v671customAutoTheme671 = !current
    AppToast.show(this, "Custom Auto Theme671: ${if (!current) "ON" else "OFF"}")
}

// v671: Cycle Auto Repeat671
internal fun PlayerActivity.showV671CycleAutoRepeat671Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v671cycleAutoRepeat671).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat671",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v671cycleAutoRepeat671 = value
        AppToast.show(this, "Cycle Auto Repeat671: $value")
    }
}

// v671: Data Auto Compress671
internal fun PlayerActivity.showV671DataAutoCompress671Toggle() {
    val current = BiliClient.prefs.v671dataAutoCompress671
    BiliClient.prefs.v671dataAutoCompress671 = !current
    AppToast.show(this, "Data Auto Compress671: ${if (!current) "ON" else "OFF"}")
}

// v671: Database Auto Index671
internal fun PlayerActivity.showV671DatabaseAutoIndex671Toggle() {
    val current = BiliClient.prefs.v671databaseAutoIndex671
    BiliClient.prefs.v671databaseAutoIndex671 = !current
    AppToast.show(this, "Database Auto Index671: ${if (!current) "ON" else "OFF"}")
}

// v671: Date Auto Format671
internal fun PlayerActivity.showV671DateAutoFormat671Toggle() {
    val current = BiliClient.prefs.v671dateAutoFormat671
    BiliClient.prefs.v671dateAutoFormat671 = !current
    AppToast.show(this, "Date Auto Format671: ${if (!current) "ON" else "OFF"}")
}

// v671: Debug Auto Verbose671
internal fun PlayerActivity.showV671DebugAutoVerbose671Toggle() {
    val current = BiliClient.prefs.v671debugAutoVerbose671
    BiliClient.prefs.v671debugAutoVerbose671 = !current
    AppToast.show(this, "Debug Auto Verbose671: ${if (!current) "ON" else "OFF"}")
}

// v671: Decay Auto Fadeout671
internal fun PlayerActivity.showV671DecayAutoFadeout671Toggle() {
    val current = BiliClient.prefs.v671decayAutoFadeout671
    BiliClient.prefs.v671decayAutoFadeout671 = !current
    AppToast.show(this, "Decay Auto Fadeout671: ${if (!current) "ON" else "OFF"}")
}

// v671: Decimal Auto Round671
internal fun PlayerActivity.showV671DecimalAutoRound671Toggle() {
    val current = BiliClient.prefs.v671decimalAutoRound671
    BiliClient.prefs.v671decimalAutoRound671 = !current
    AppToast.show(this, "Decimal Auto Round671: ${if (!current) "ON" else "OFF"}")
}

// v671: Decode Auto Codec671
internal fun PlayerActivity.showV671DecodeAutoCodec671Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v671decodeAutoCodec671).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec671",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v671decodeAutoCodec671 = value
        AppToast.show(this, "Decode Auto Codec671: $value")
    }
}

// v671: Default Auto Restore671
internal fun PlayerActivity.showV671DefaultAutoRestore671Toggle() {
    val current = BiliClient.prefs.v671defaultAutoRestore671
    BiliClient.prefs.v671defaultAutoRestore671 = !current
    AppToast.show(this, "Default Auto Restore671: ${if (!current) "ON" else "OFF"}")
}

// v671: Delay Auto Buffer671
internal fun PlayerActivity.showV671DelayAutoBuffer671Toggle() {
    val current = BiliClient.prefs.v671delayAutoBuffer671
    BiliClient.prefs.v671delayAutoBuffer671 = !current
    AppToast.show(this, "Delay Auto Buffer671: ${if (!current) "ON" else "OFF"}")
}

// v672: Cross Auto Fade672
internal fun PlayerActivity.showV672CrossAutoFade672Toggle() {
    val current = BiliClient.prefs.v672crossAutoFade672
    BiliClient.prefs.v672crossAutoFade672 = !current
    AppToast.show(this, "Cross Auto Fade672: ${if (!current) "ON" else "OFF"}")
}

// v672: Crypto Auto Hash672
internal fun PlayerActivity.showV672CryptoAutoHash672Toggle() {
    val current = BiliClient.prefs.v672cryptoAutoHash672
    BiliClient.prefs.v672cryptoAutoHash672 = !current
    AppToast.show(this, "Crypto Auto Hash672: ${if (!current) "ON" else "OFF"}")
}

// v672: Cursor Auto Hide672
internal fun PlayerActivity.showV672CursorAutoHide672Toggle() {
    val current = BiliClient.prefs.v672cursorAutoHide672
    BiliClient.prefs.v672cursorAutoHide672 = !current
    AppToast.show(this, "Cursor Auto Hide672: ${if (!current) "ON" else "OFF"}")
}

// v672: Curve Auto Smooth672
internal fun PlayerActivity.showV672CurveAutoSmooth672Toggle() {
    val current = BiliClient.prefs.v672curveAutoSmooth672
    BiliClient.prefs.v672curveAutoSmooth672 = !current
    AppToast.show(this, "Curve Auto Smooth672: ${if (!current) "ON" else "OFF"}")
}

// v672: Custom Auto Theme672
internal fun PlayerActivity.showV672CustomAutoTheme672Toggle() {
    val current = BiliClient.prefs.v672customAutoTheme672
    BiliClient.prefs.v672customAutoTheme672 = !current
    AppToast.show(this, "Custom Auto Theme672: ${if (!current) "ON" else "OFF"}")
}

// v672: Cycle Auto Repeat672
internal fun PlayerActivity.showV672CycleAutoRepeat672Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v672cycleAutoRepeat672).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat672",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v672cycleAutoRepeat672 = value
        AppToast.show(this, "Cycle Auto Repeat672: $value")
    }
}

// v672: Data Auto Compress672
internal fun PlayerActivity.showV672DataAutoCompress672Toggle() {
    val current = BiliClient.prefs.v672dataAutoCompress672
    BiliClient.prefs.v672dataAutoCompress672 = !current
    AppToast.show(this, "Data Auto Compress672: ${if (!current) "ON" else "OFF"}")
}

// v672: Database Auto Index672
internal fun PlayerActivity.showV672DatabaseAutoIndex672Toggle() {
    val current = BiliClient.prefs.v672databaseAutoIndex672
    BiliClient.prefs.v672databaseAutoIndex672 = !current
    AppToast.show(this, "Database Auto Index672: ${if (!current) "ON" else "OFF"}")
}

// v672: Date Auto Format672
internal fun PlayerActivity.showV672DateAutoFormat672Toggle() {
    val current = BiliClient.prefs.v672dateAutoFormat672
    BiliClient.prefs.v672dateAutoFormat672 = !current
    AppToast.show(this, "Date Auto Format672: ${if (!current) "ON" else "OFF"}")
}

// v672: Debug Auto Verbose672
internal fun PlayerActivity.showV672DebugAutoVerbose672Toggle() {
    val current = BiliClient.prefs.v672debugAutoVerbose672
    BiliClient.prefs.v672debugAutoVerbose672 = !current
    AppToast.show(this, "Debug Auto Verbose672: ${if (!current) "ON" else "OFF"}")
}

// v672: Decay Auto Fadeout672
internal fun PlayerActivity.showV672DecayAutoFadeout672Toggle() {
    val current = BiliClient.prefs.v672decayAutoFadeout672
    BiliClient.prefs.v672decayAutoFadeout672 = !current
    AppToast.show(this, "Decay Auto Fadeout672: ${if (!current) "ON" else "OFF"}")
}

// v672: Decimal Auto Round672
internal fun PlayerActivity.showV672DecimalAutoRound672Toggle() {
    val current = BiliClient.prefs.v672decimalAutoRound672
    BiliClient.prefs.v672decimalAutoRound672 = !current
    AppToast.show(this, "Decimal Auto Round672: ${if (!current) "ON" else "OFF"}")
}

// v672: Decode Auto Codec672
internal fun PlayerActivity.showV672DecodeAutoCodec672Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v672decodeAutoCodec672).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec672",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v672decodeAutoCodec672 = value
        AppToast.show(this, "Decode Auto Codec672: $value")
    }
}

// v672: Default Auto Restore672
internal fun PlayerActivity.showV672DefaultAutoRestore672Toggle() {
    val current = BiliClient.prefs.v672defaultAutoRestore672
    BiliClient.prefs.v672defaultAutoRestore672 = !current
    AppToast.show(this, "Default Auto Restore672: ${if (!current) "ON" else "OFF"}")
}

// v672: Delay Auto Buffer672
internal fun PlayerActivity.showV672DelayAutoBuffer672Toggle() {
    val current = BiliClient.prefs.v672delayAutoBuffer672
    BiliClient.prefs.v672delayAutoBuffer672 = !current
    AppToast.show(this, "Delay Auto Buffer672: ${if (!current) "ON" else "OFF"}")
}

// v673: Cross Auto Fade673
internal fun PlayerActivity.showV673CrossAutoFade673Toggle() {
    val current = BiliClient.prefs.v673crossAutoFade673
    BiliClient.prefs.v673crossAutoFade673 = !current
    AppToast.show(this, "Cross Auto Fade673: ${if (!current) "ON" else "OFF"}")
}

// v673: Crypto Auto Hash673
internal fun PlayerActivity.showV673CryptoAutoHash673Toggle() {
    val current = BiliClient.prefs.v673cryptoAutoHash673
    BiliClient.prefs.v673cryptoAutoHash673 = !current
    AppToast.show(this, "Crypto Auto Hash673: ${if (!current) "ON" else "OFF"}")
}

// v673: Cursor Auto Hide673
internal fun PlayerActivity.showV673CursorAutoHide673Toggle() {
    val current = BiliClient.prefs.v673cursorAutoHide673
    BiliClient.prefs.v673cursorAutoHide673 = !current
    AppToast.show(this, "Cursor Auto Hide673: ${if (!current) "ON" else "OFF"}")
}

// v673: Curve Auto Smooth673
internal fun PlayerActivity.showV673CurveAutoSmooth673Toggle() {
    val current = BiliClient.prefs.v673curveAutoSmooth673
    BiliClient.prefs.v673curveAutoSmooth673 = !current
    AppToast.show(this, "Curve Auto Smooth673: ${if (!current) "ON" else "OFF"}")
}

// v673: Custom Auto Theme673
internal fun PlayerActivity.showV673CustomAutoTheme673Toggle() {
    val current = BiliClient.prefs.v673customAutoTheme673
    BiliClient.prefs.v673customAutoTheme673 = !current
    AppToast.show(this, "Custom Auto Theme673: ${if (!current) "ON" else "OFF"}")
}

// v673: Cycle Auto Repeat673
internal fun PlayerActivity.showV673CycleAutoRepeat673Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v673cycleAutoRepeat673).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat673",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v673cycleAutoRepeat673 = value
        AppToast.show(this, "Cycle Auto Repeat673: $value")
    }
}

// v673: Data Auto Compress673
internal fun PlayerActivity.showV673DataAutoCompress673Toggle() {
    val current = BiliClient.prefs.v673dataAutoCompress673
    BiliClient.prefs.v673dataAutoCompress673 = !current
    AppToast.show(this, "Data Auto Compress673: ${if (!current) "ON" else "OFF"}")
}

// v673: Database Auto Index673
internal fun PlayerActivity.showV673DatabaseAutoIndex673Toggle() {
    val current = BiliClient.prefs.v673databaseAutoIndex673
    BiliClient.prefs.v673databaseAutoIndex673 = !current
    AppToast.show(this, "Database Auto Index673: ${if (!current) "ON" else "OFF"}")
}

// v673: Date Auto Format673
internal fun PlayerActivity.showV673DateAutoFormat673Toggle() {
    val current = BiliClient.prefs.v673dateAutoFormat673
    BiliClient.prefs.v673dateAutoFormat673 = !current
    AppToast.show(this, "Date Auto Format673: ${if (!current) "ON" else "OFF"}")
}

// v673: Debug Auto Verbose673
internal fun PlayerActivity.showV673DebugAutoVerbose673Toggle() {
    val current = BiliClient.prefs.v673debugAutoVerbose673
    BiliClient.prefs.v673debugAutoVerbose673 = !current
    AppToast.show(this, "Debug Auto Verbose673: ${if (!current) "ON" else "OFF"}")
}

// v673: Decay Auto Fadeout673
internal fun PlayerActivity.showV673DecayAutoFadeout673Toggle() {
    val current = BiliClient.prefs.v673decayAutoFadeout673
    BiliClient.prefs.v673decayAutoFadeout673 = !current
    AppToast.show(this, "Decay Auto Fadeout673: ${if (!current) "ON" else "OFF"}")
}

// v673: Decimal Auto Round673
internal fun PlayerActivity.showV673DecimalAutoRound673Toggle() {
    val current = BiliClient.prefs.v673decimalAutoRound673
    BiliClient.prefs.v673decimalAutoRound673 = !current
    AppToast.show(this, "Decimal Auto Round673: ${if (!current) "ON" else "OFF"}")
}

// v673: Decode Auto Codec673
internal fun PlayerActivity.showV673DecodeAutoCodec673Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v673decodeAutoCodec673).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec673",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v673decodeAutoCodec673 = value
        AppToast.show(this, "Decode Auto Codec673: $value")
    }
}

// v673: Default Auto Restore673
internal fun PlayerActivity.showV673DefaultAutoRestore673Toggle() {
    val current = BiliClient.prefs.v673defaultAutoRestore673
    BiliClient.prefs.v673defaultAutoRestore673 = !current
    AppToast.show(this, "Default Auto Restore673: ${if (!current) "ON" else "OFF"}")
}

// v673: Delay Auto Buffer673
internal fun PlayerActivity.showV673DelayAutoBuffer673Toggle() {
    val current = BiliClient.prefs.v673delayAutoBuffer673
    BiliClient.prefs.v673delayAutoBuffer673 = !current
    AppToast.show(this, "Delay Auto Buffer673: ${if (!current) "ON" else "OFF"}")
}

// v674: Cross Auto Fade674
internal fun PlayerActivity.showV674CrossAutoFade674Toggle() {
    val current = BiliClient.prefs.v674crossAutoFade674
    BiliClient.prefs.v674crossAutoFade674 = !current
    AppToast.show(this, "Cross Auto Fade674: ${if (!current) "ON" else "OFF"}")
}

// v674: Crypto Auto Hash674
internal fun PlayerActivity.showV674CryptoAutoHash674Toggle() {
    val current = BiliClient.prefs.v674cryptoAutoHash674
    BiliClient.prefs.v674cryptoAutoHash674 = !current
    AppToast.show(this, "Crypto Auto Hash674: ${if (!current) "ON" else "OFF"}")
}

// v674: Cursor Auto Hide674
internal fun PlayerActivity.showV674CursorAutoHide674Toggle() {
    val current = BiliClient.prefs.v674cursorAutoHide674
    BiliClient.prefs.v674cursorAutoHide674 = !current
    AppToast.show(this, "Cursor Auto Hide674: ${if (!current) "ON" else "OFF"}")
}

// v674: Curve Auto Smooth674
internal fun PlayerActivity.showV674CurveAutoSmooth674Toggle() {
    val current = BiliClient.prefs.v674curveAutoSmooth674
    BiliClient.prefs.v674curveAutoSmooth674 = !current
    AppToast.show(this, "Curve Auto Smooth674: ${if (!current) "ON" else "OFF"}")
}

// v674: Custom Auto Theme674
internal fun PlayerActivity.showV674CustomAutoTheme674Toggle() {
    val current = BiliClient.prefs.v674customAutoTheme674
    BiliClient.prefs.v674customAutoTheme674 = !current
    AppToast.show(this, "Custom Auto Theme674: ${if (!current) "ON" else "OFF"}")
}

// v674: Cycle Auto Repeat674
internal fun PlayerActivity.showV674CycleAutoRepeat674Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v674cycleAutoRepeat674).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat674",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v674cycleAutoRepeat674 = value
        AppToast.show(this, "Cycle Auto Repeat674: $value")
    }
}

// v674: Data Auto Compress674
internal fun PlayerActivity.showV674DataAutoCompress674Toggle() {
    val current = BiliClient.prefs.v674dataAutoCompress674
    BiliClient.prefs.v674dataAutoCompress674 = !current
    AppToast.show(this, "Data Auto Compress674: ${if (!current) "ON" else "OFF"}")
}

// v674: Database Auto Index674
internal fun PlayerActivity.showV674DatabaseAutoIndex674Toggle() {
    val current = BiliClient.prefs.v674databaseAutoIndex674
    BiliClient.prefs.v674databaseAutoIndex674 = !current
    AppToast.show(this, "Database Auto Index674: ${if (!current) "ON" else "OFF"}")
}

// v674: Date Auto Format674
internal fun PlayerActivity.showV674DateAutoFormat674Toggle() {
    val current = BiliClient.prefs.v674dateAutoFormat674
    BiliClient.prefs.v674dateAutoFormat674 = !current
    AppToast.show(this, "Date Auto Format674: ${if (!current) "ON" else "OFF"}")
}

// v674: Debug Auto Verbose674
internal fun PlayerActivity.showV674DebugAutoVerbose674Toggle() {
    val current = BiliClient.prefs.v674debugAutoVerbose674
    BiliClient.prefs.v674debugAutoVerbose674 = !current
    AppToast.show(this, "Debug Auto Verbose674: ${if (!current) "ON" else "OFF"}")
}

// v674: Decay Auto Fadeout674
internal fun PlayerActivity.showV674DecayAutoFadeout674Toggle() {
    val current = BiliClient.prefs.v674decayAutoFadeout674
    BiliClient.prefs.v674decayAutoFadeout674 = !current
    AppToast.show(this, "Decay Auto Fadeout674: ${if (!current) "ON" else "OFF"}")
}

// v674: Decimal Auto Round674
internal fun PlayerActivity.showV674DecimalAutoRound674Toggle() {
    val current = BiliClient.prefs.v674decimalAutoRound674
    BiliClient.prefs.v674decimalAutoRound674 = !current
    AppToast.show(this, "Decimal Auto Round674: ${if (!current) "ON" else "OFF"}")
}

// v674: Decode Auto Codec674
internal fun PlayerActivity.showV674DecodeAutoCodec674Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v674decodeAutoCodec674).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec674",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v674decodeAutoCodec674 = value
        AppToast.show(this, "Decode Auto Codec674: $value")
    }
}

// v674: Default Auto Restore674
internal fun PlayerActivity.showV674DefaultAutoRestore674Toggle() {
    val current = BiliClient.prefs.v674defaultAutoRestore674
    BiliClient.prefs.v674defaultAutoRestore674 = !current
    AppToast.show(this, "Default Auto Restore674: ${if (!current) "ON" else "OFF"}")
}

// v674: Delay Auto Buffer674
internal fun PlayerActivity.showV674DelayAutoBuffer674Toggle() {
    val current = BiliClient.prefs.v674delayAutoBuffer674
    BiliClient.prefs.v674delayAutoBuffer674 = !current
    AppToast.show(this, "Delay Auto Buffer674: ${if (!current) "ON" else "OFF"}")
}

// v675: Cross Auto Fade675
internal fun PlayerActivity.showV675CrossAutoFade675Toggle() {
    val current = BiliClient.prefs.v675crossAutoFade675
    BiliClient.prefs.v675crossAutoFade675 = !current
    AppToast.show(this, "Cross Auto Fade675: ${if (!current) "ON" else "OFF"}")
}

// v675: Crypto Auto Hash675
internal fun PlayerActivity.showV675CryptoAutoHash675Toggle() {
    val current = BiliClient.prefs.v675cryptoAutoHash675
    BiliClient.prefs.v675cryptoAutoHash675 = !current
    AppToast.show(this, "Crypto Auto Hash675: ${if (!current) "ON" else "OFF"}")
}

// v675: Cursor Auto Hide675
internal fun PlayerActivity.showV675CursorAutoHide675Toggle() {
    val current = BiliClient.prefs.v675cursorAutoHide675
    BiliClient.prefs.v675cursorAutoHide675 = !current
    AppToast.show(this, "Cursor Auto Hide675: ${if (!current) "ON" else "OFF"}")
}

// v675: Curve Auto Smooth675
internal fun PlayerActivity.showV675CurveAutoSmooth675Toggle() {
    val current = BiliClient.prefs.v675curveAutoSmooth675
    BiliClient.prefs.v675curveAutoSmooth675 = !current
    AppToast.show(this, "Curve Auto Smooth675: ${if (!current) "ON" else "OFF"}")
}

// v675: Custom Auto Theme675
internal fun PlayerActivity.showV675CustomAutoTheme675Toggle() {
    val current = BiliClient.prefs.v675customAutoTheme675
    BiliClient.prefs.v675customAutoTheme675 = !current
    AppToast.show(this, "Custom Auto Theme675: ${if (!current) "ON" else "OFF"}")
}

// v675: Cycle Auto Repeat675
internal fun PlayerActivity.showV675CycleAutoRepeat675Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v675cycleAutoRepeat675).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat675",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v675cycleAutoRepeat675 = value
        AppToast.show(this, "Cycle Auto Repeat675: $value")
    }
}

// v675: Data Auto Compress675
internal fun PlayerActivity.showV675DataAutoCompress675Toggle() {
    val current = BiliClient.prefs.v675dataAutoCompress675
    BiliClient.prefs.v675dataAutoCompress675 = !current
    AppToast.show(this, "Data Auto Compress675: ${if (!current) "ON" else "OFF"}")
}

// v675: Database Auto Index675
internal fun PlayerActivity.showV675DatabaseAutoIndex675Toggle() {
    val current = BiliClient.prefs.v675databaseAutoIndex675
    BiliClient.prefs.v675databaseAutoIndex675 = !current
    AppToast.show(this, "Database Auto Index675: ${if (!current) "ON" else "OFF"}")
}

// v675: Date Auto Format675
internal fun PlayerActivity.showV675DateAutoFormat675Toggle() {
    val current = BiliClient.prefs.v675dateAutoFormat675
    BiliClient.prefs.v675dateAutoFormat675 = !current
    AppToast.show(this, "Date Auto Format675: ${if (!current) "ON" else "OFF"}")
}

// v675: Debug Auto Verbose675
internal fun PlayerActivity.showV675DebugAutoVerbose675Toggle() {
    val current = BiliClient.prefs.v675debugAutoVerbose675
    BiliClient.prefs.v675debugAutoVerbose675 = !current
    AppToast.show(this, "Debug Auto Verbose675: ${if (!current) "ON" else "OFF"}")
}

// v675: Decay Auto Fadeout675
internal fun PlayerActivity.showV675DecayAutoFadeout675Toggle() {
    val current = BiliClient.prefs.v675decayAutoFadeout675
    BiliClient.prefs.v675decayAutoFadeout675 = !current
    AppToast.show(this, "Decay Auto Fadeout675: ${if (!current) "ON" else "OFF"}")
}

// v675: Decimal Auto Round675
internal fun PlayerActivity.showV675DecimalAutoRound675Toggle() {
    val current = BiliClient.prefs.v675decimalAutoRound675
    BiliClient.prefs.v675decimalAutoRound675 = !current
    AppToast.show(this, "Decimal Auto Round675: ${if (!current) "ON" else "OFF"}")
}

// v675: Decode Auto Codec675
internal fun PlayerActivity.showV675DecodeAutoCodec675Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v675decodeAutoCodec675).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec675",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v675decodeAutoCodec675 = value
        AppToast.show(this, "Decode Auto Codec675: $value")
    }
}

// v675: Default Auto Restore675
internal fun PlayerActivity.showV675DefaultAutoRestore675Toggle() {
    val current = BiliClient.prefs.v675defaultAutoRestore675
    BiliClient.prefs.v675defaultAutoRestore675 = !current
    AppToast.show(this, "Default Auto Restore675: ${if (!current) "ON" else "OFF"}")
}

// v675: Delay Auto Buffer675
internal fun PlayerActivity.showV675DelayAutoBuffer675Toggle() {
    val current = BiliClient.prefs.v675delayAutoBuffer675
    BiliClient.prefs.v675delayAutoBuffer675 = !current
    AppToast.show(this, "Delay Auto Buffer675: ${if (!current) "ON" else "OFF"}")
}

// v676: Cross Auto Fade676
internal fun PlayerActivity.showV676CrossAutoFade676Toggle() {
    val current = BiliClient.prefs.v676crossAutoFade676
    BiliClient.prefs.v676crossAutoFade676 = !current
    AppToast.show(this, "Cross Auto Fade676: ${if (!current) "ON" else "OFF"}")
}

// v676: Crypto Auto Hash676
internal fun PlayerActivity.showV676CryptoAutoHash676Toggle() {
    val current = BiliClient.prefs.v676cryptoAutoHash676
    BiliClient.prefs.v676cryptoAutoHash676 = !current
    AppToast.show(this, "Crypto Auto Hash676: ${if (!current) "ON" else "OFF"}")
}

// v676: Cursor Auto Hide676
internal fun PlayerActivity.showV676CursorAutoHide676Toggle() {
    val current = BiliClient.prefs.v676cursorAutoHide676
    BiliClient.prefs.v676cursorAutoHide676 = !current
    AppToast.show(this, "Cursor Auto Hide676: ${if (!current) "ON" else "OFF"}")
}

// v676: Curve Auto Smooth676
internal fun PlayerActivity.showV676CurveAutoSmooth676Toggle() {
    val current = BiliClient.prefs.v676curveAutoSmooth676
    BiliClient.prefs.v676curveAutoSmooth676 = !current
    AppToast.show(this, "Curve Auto Smooth676: ${if (!current) "ON" else "OFF"}")
}

// v676: Custom Auto Theme676
internal fun PlayerActivity.showV676CustomAutoTheme676Toggle() {
    val current = BiliClient.prefs.v676customAutoTheme676
    BiliClient.prefs.v676customAutoTheme676 = !current
    AppToast.show(this, "Custom Auto Theme676: ${if (!current) "ON" else "OFF"}")
}

// v676: Cycle Auto Repeat676
internal fun PlayerActivity.showV676CycleAutoRepeat676Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v676cycleAutoRepeat676).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat676",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v676cycleAutoRepeat676 = value
        AppToast.show(this, "Cycle Auto Repeat676: $value")
    }
}

// v676: Data Auto Compress676
internal fun PlayerActivity.showV676DataAutoCompress676Toggle() {
    val current = BiliClient.prefs.v676dataAutoCompress676
    BiliClient.prefs.v676dataAutoCompress676 = !current
    AppToast.show(this, "Data Auto Compress676: ${if (!current) "ON" else "OFF"}")
}

// v676: Database Auto Index676
internal fun PlayerActivity.showV676DatabaseAutoIndex676Toggle() {
    val current = BiliClient.prefs.v676databaseAutoIndex676
    BiliClient.prefs.v676databaseAutoIndex676 = !current
    AppToast.show(this, "Database Auto Index676: ${if (!current) "ON" else "OFF"}")
}

// v76.9: Volume 3D Audio
internal fun PlayerActivity.showV76Volume3DAudioToggle() {
    val enabled = !BiliClient.prefs.v76Volume3DAudio
    BiliClient.prefs.v76Volume3DAudio = enabled
    AppToast.show(this, "Volume 3D Audio: ${if (enabled) "ON" else "OFF"}")
}

// v76.10: History Auto Sync Source
internal fun PlayerActivity.showV76HistoryAutoSyncSourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76HistoryAutoSyncSource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Sync Source",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76HistoryAutoSyncSource = value
        AppToast.show(this, "History Auto Sync Source: $value")
    }
}

// v76.11: Playback Auto Skip Silence
internal fun PlayerActivity.showV76PlaybackAutoSkipSilenceToggle() {
    val enabled = !BiliClient.prefs.v76PlaybackAutoSkipSilence
    BiliClient.prefs.v76PlaybackAutoSkipSilence = enabled
    AppToast.show(this, "Playback Auto Skip Silence: ${if (enabled) "ON" else "OFF"}")
}

// v76.12: Screenshot Auto Annotate Mode
internal fun PlayerActivity.showV76ScreenshotAutoAnnotateModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v76ScreenshotAutoAnnotateMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Annotate Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76ScreenshotAutoAnnotateMode = value
        AppToast.show(this, "Screenshot Auto Annotate Mode: $value")
    }
}

// v76.13: Video LUT Custom
internal fun PlayerActivity.showV76VideoLUTCustomToggle() {
    val enabled = !BiliClient.prefs.v76VideoLUTCustom
    BiliClient.prefs.v76VideoLUTCustom = enabled
    AppToast.show(this, "Video LUT Custom: ${if (enabled) "ON" else "OFF"}")
}

// v76.14: Danmaku Font Custom Path
internal fun PlayerActivity.showV76DanmakuFontCustomPathToggle() {
    val enabled = !BiliClient.prefs.v76DanmakuFontCustomPath
    BiliClient.prefs.v76DanmakuFontCustomPath = enabled
    AppToast.show(this, "Danmaku Font Custom Path: ${if (enabled) "ON" else "OFF"}")
}

// v76.15: Subtitle Font Weight Custom
internal fun PlayerActivity.showV76SubtitleFontWeightCustomDialog() {
    val options = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v76SubtitleFontWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Weight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v76SubtitleFontWeightCustom = value
        AppToast.show(this, "Subtitle Font Weight Custom: $value")
    }
}

// v77.1: Video Frame Interpolation
internal fun PlayerActivity.showV77VideoFrameInterpolationToggle() {
    val enabled = !BiliClient.prefs.v77VideoFrameInterpolation
    BiliClient.prefs.v77VideoFrameInterpolation = enabled
    AppToast.show(this, "Video Frame Interpolation: ${if (enabled) "ON" else "OFF"}")
}

// v77.2: Danmaku Priority Custom
internal fun PlayerActivity.showV77DanmakuPriorityCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77DanmakuPriorityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Priority Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77DanmakuPriorityCustom = value
        AppToast.show(this, "Danmaku Priority Custom: $value")
    }
}

// v77.3: Subtitle Kerning Custom
internal fun PlayerActivity.showV77SubtitleKerningCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v77SubtitleKerningCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Kerning Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77SubtitleKerningCustom = value
        AppToast.show(this, "Subtitle Kerning Custom: $value")
    }
}

// v77.4: Gesture Visual Feedback
internal fun PlayerActivity.showV77GestureVisualFeedbackToggle() {
    val enabled = !BiliClient.prefs.v77GestureVisualFeedback
    BiliClient.prefs.v77GestureVisualFeedback = enabled
    AppToast.show(this, "Gesture Visual Feedback: ${if (enabled) "ON" else "OFF"}")
}

// v77.5: Cast Audio 3D
internal fun PlayerActivity.showV77CastAudio3DToggle() {
    val enabled = !BiliClient.prefs.v77CastAudio3D
    BiliClient.prefs.v77CastAudio3D = enabled
    AppToast.show(this, "Cast Audio 3D: ${if (enabled) "ON" else "OFF"}")
}

// v77.6: Playlist Auto Recover Limit
internal fun PlayerActivity.showV77PlaylistAutoRecoverLimitDialog() {
    val options = listOf(5, 10, 15, 20, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v77PlaylistAutoRecoverLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77PlaylistAutoRecoverLimit = value
        AppToast.show(this, "Playlist Auto Recover Limit: $value")
    }
}

// v77.7: Cache Priority Mode
internal fun PlayerActivity.showV77CachePriorityModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77CachePriorityMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Priority Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77CachePriorityMode = value
        AppToast.show(this, "Cache Priority Mode: $value")
    }
}

// v77.8: Progress Bar Thumb Color
internal fun PlayerActivity.showV77ProgressBarThumbColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77ProgressBarThumbColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77ProgressBarThumbColor = value
        AppToast.show(this, "Progress Bar Thumb Color: $value")
    }
}

// v77.9: Volume Auto Leveling
internal fun PlayerActivity.showV77VolumeAutoLevelingToggle() {
    val enabled = !BiliClient.prefs.v77VolumeAutoLeveling
    BiliClient.prefs.v77VolumeAutoLeveling = enabled
    AppToast.show(this, "Volume Auto Leveling: ${if (enabled) "ON" else "OFF"}")
}

// v77.10: History Auto Backup Source
internal fun PlayerActivity.showV77HistoryAutoBackupSourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77HistoryAutoBackupSource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Backup Source",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77HistoryAutoBackupSource = value
        AppToast.show(this, "History Auto Backup Source: $value")
    }
}

// v77.11: Playback Auto Skip Intro Custom
internal fun PlayerActivity.showV77PlaybackAutoSkipIntroCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77PlaybackAutoSkipIntroCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Skip Intro Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77PlaybackAutoSkipIntroCustom = value
        AppToast.show(this, "Playback Auto Skip Intro Custom: $value")
    }
}

// v77.12: Screenshot Auto Share Mode
internal fun PlayerActivity.showV77ScreenshotAutoShareModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77ScreenshotAutoShareMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Share Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77ScreenshotAutoShareMode = value
        AppToast.show(this, "Screenshot Auto Share Mode: $value")
    }
}

// v77.13: Video Motion Blur
internal fun PlayerActivity.showV77VideoMotionBlurToggle() {
    val enabled = !BiliClient.prefs.v77VideoMotionBlur
    BiliClient.prefs.v77VideoMotionBlur = enabled
    AppToast.show(this, "Video Motion Blur: ${if (enabled) "ON" else "OFF"}")
}

// v77.14: Danmaku Layer Custom
internal fun PlayerActivity.showV77DanmakuLayerCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v77DanmakuLayerCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Layer Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77DanmakuLayerCustom = value
        AppToast.show(this, "Danmaku Layer Custom: $value")
    }
}

// v77.15: Subtitle Letter Spacing Custom
internal fun PlayerActivity.showV77SubtitleLetterSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v77SubtitleLetterSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Letter Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v77SubtitleLetterSpacingCustom = value
        AppToast.show(this, "Subtitle Letter Spacing Custom: $value")
    }
}

// v78.1: Video Adaptive Resolution
internal fun PlayerActivity.showV78VideoAdaptiveResolutionToggle() {
    val enabled = !BiliClient.prefs.v78VideoAdaptiveResolution
    BiliClient.prefs.v78VideoAdaptiveResolution = enabled
    AppToast.show(this, "Video Adaptive Resolution: ${if (enabled) "ON" else "OFF"}")
}

// v78.2: Danmaku Collision Mode
internal fun PlayerActivity.showV78DanmakuCollisionModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78DanmakuCollisionMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Collision Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78DanmakuCollisionMode = value
        AppToast.show(this, "Danmaku Collision Mode: $value")
    }
}

// v78.3: Subtitle Animation Delay
internal fun PlayerActivity.showV78SubtitleAnimationDelayDialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v78SubtitleAnimationDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78SubtitleAnimationDelay = value
        AppToast.show(this, "Subtitle Animation Delay: $value")
    }
}

// v78.4: Gesture Long Press Duration
internal fun PlayerActivity.showV78GestureLongPressDurationDialog() {
    val options = listOf(300, 400, 500, 600, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v78GestureLongPressDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78GestureLongPressDuration = value
        AppToast.show(this, "Gesture Long Press Duration: $value")
    }
}

// v78.5: Cast Video Dolby Vision IQ
internal fun PlayerActivity.showV78CastVideoDolbyVisionIQToggle() {
    val enabled = !BiliClient.prefs.v78CastVideoDolbyVisionIQ
    BiliClient.prefs.v78CastVideoDolbyVisionIQ = enabled
    AppToast.show(this, "Cast Video Dolby Vision IQ: ${if (enabled) "ON" else "OFF"}")
}

// v78.6: Playlist Auto Recover Time Limit
internal fun PlayerActivity.showV78PlaylistAutoRecoverTimeLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78PlaylistAutoRecoverTimeLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Time Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78PlaylistAutoRecoverTimeLimit = value
        AppToast.show(this, "Playlist Auto Recover Time Limit: $value")
    }
}

// v78.7: Cache Size Limit Custom
internal fun PlayerActivity.showV78CacheSizeLimitCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78CacheSizeLimitCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Size Limit Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78CacheSizeLimitCustom = value
        AppToast.show(this, "Cache Size Limit Custom: $value")
    }
}

// v78.8: Progress Bar Thumb Opacity
internal fun PlayerActivity.showV78ProgressBarThumbOpacityDialog() {
    val options = listOf(50, 60, 70, 80, 90, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v78ProgressBarThumbOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78ProgressBarThumbOpacity = value
        AppToast.show(this, "Progress Bar Thumb Opacity: $value")
    }
}

// v78.9: Volume Auto Leveling Mode
internal fun PlayerActivity.showV78VolumeAutoLevelingModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78VolumeAutoLevelingMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Auto Leveling Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78VolumeAutoLevelingMode = value
        AppToast.show(this, "Volume Auto Leveling Mode: $value")
    }
}

// v78.10: History Auto Sync Time
internal fun PlayerActivity.showV78HistoryAutoSyncTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78HistoryAutoSyncTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Sync Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78HistoryAutoSyncTime = value
        AppToast.show(this, "History Auto Sync Time: $value")
    }
}

// v78.11: Playback Auto Skip Outro Custom
internal fun PlayerActivity.showV78PlaybackAutoSkipOutroCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78PlaybackAutoSkipOutroCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Skip Outro Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78PlaybackAutoSkipOutroCustom = value
        AppToast.show(this, "Playback Auto Skip Outro Custom: $value")
    }
}

// v78.12: Screenshot Auto Edit Mode
internal fun PlayerActivity.showV78ScreenshotAutoEditModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v78ScreenshotAutoEditMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Edit Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78ScreenshotAutoEditMode = value
        AppToast.show(this, "Screenshot Auto Edit Mode: $value")
    }
}

// v78.13: Video Adaptive Bitrate
internal fun PlayerActivity.showV78VideoAdaptiveBitrateToggle() {
    val enabled = !BiliClient.prefs.v78VideoAdaptiveBitrate
    BiliClient.prefs.v78VideoAdaptiveBitrate = enabled
    AppToast.show(this, "Video Adaptive Bitrate: ${if (enabled) "ON" else "OFF"}")
}

// v78.14: Danmaku Scroll Speed Adaptive
internal fun PlayerActivity.showV78DanmakuScrollSpeedAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v78DanmakuScrollSpeedAdaptive
    BiliClient.prefs.v78DanmakuScrollSpeedAdaptive = enabled
    AppToast.show(this, "Danmaku Scroll Speed Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v78.15: Subtitle Font Stretch Custom
internal fun PlayerActivity.showV78SubtitleFontStretchCustomDialog() {
    val options = listOf(75, 80, 90, 100, 110, 120, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v78SubtitleFontStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v78SubtitleFontStretchCustom = value
        AppToast.show(this, "Subtitle Font Stretch Custom: $value")
    }
}

// v79.1: Video Color Grading Custom
internal fun PlayerActivity.showV79VideoColorGradingCustomToggle() {
    val enabled = !BiliClient.prefs.v79VideoColorGradingCustom
    BiliClient.prefs.v79VideoColorGradingCustom = enabled
    AppToast.show(this, "Video Color Grading Custom: ${if (enabled) "ON" else "OFF"}")
}

// v79.2: Danmaku Font Spacing Adaptive
internal fun PlayerActivity.showV79DanmakuFontSpacingAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v79DanmakuFontSpacingAdaptive
    BiliClient.prefs.v79DanmakuFontSpacingAdaptive = enabled
    AppToast.show(this, "Danmaku Font Spacing Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v79.3: Subtitle Animation Type
internal fun PlayerActivity.showV79SubtitleAnimationTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79SubtitleAnimationType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79SubtitleAnimationType = value
        AppToast.show(this, "Subtitle Animation Type: $value")
    }
}

// v79.4: Gesture Swipe Velocity
internal fun PlayerActivity.showV79GestureSwipeVelocityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v79GestureSwipeVelocity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Velocity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79GestureSwipeVelocity = value
        AppToast.show(this, "Gesture Swipe Velocity: $value")
    }
}

// v79.5: Cast Audio Spatial Custom
internal fun PlayerActivity.showV79CastAudioSpatialCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79CastAudioSpatialCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Spatial Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79CastAudioSpatialCustom = value
        AppToast.show(this, "Cast Audio Spatial Custom: $value")
    }
}

// v79.6: Playlist Auto Recover Source Mode
internal fun PlayerActivity.showV79PlaylistAutoRecoverSourceModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79PlaylistAutoRecoverSourceMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Source Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79PlaylistAutoRecoverSourceMode = value
        AppToast.show(this, "Playlist Auto Recover Source Mode: $value")
    }
}

// v79.7: Cache Cleanup Strategy Custom
internal fun PlayerActivity.showV79CacheCleanupStrategyCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79CacheCleanupStrategyCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Strategy Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79CacheCleanupStrategyCustom = value
        AppToast.show(this, "Cache Cleanup Strategy Custom: $value")
    }
}

// v79.8: Progress Bar Thumb Animation
internal fun PlayerActivity.showV79ProgressBarThumbAnimationToggle() {
    val enabled = !BiliClient.prefs.v79ProgressBarThumbAnimation
    BiliClient.prefs.v79ProgressBarThumbAnimation = enabled
    AppToast.show(this, "Progress Bar Thumb Animation: ${if (enabled) "ON" else "OFF"}")
}

// v79.9: Volume Auto Leveling Strength
internal fun PlayerActivity.showV79VolumeAutoLevelingStrengthDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v79VolumeAutoLevelingStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Auto Leveling Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79VolumeAutoLevelingStrength = value
        AppToast.show(this, "Volume Auto Leveling Strength: $value")
    }
}

// v79.10: History Auto Backup Time
internal fun PlayerActivity.showV79HistoryAutoBackupTimeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79HistoryAutoBackupTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Backup Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79HistoryAutoBackupTime = value
        AppToast.show(this, "History Auto Backup Time: $value")
    }
}

// v79.11: Playback Auto Bookmark Custom
internal fun PlayerActivity.showV79PlaybackAutoBookmarkCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79PlaybackAutoBookmarkCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Bookmark Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79PlaybackAutoBookmarkCustom = value
        AppToast.show(this, "Playback Auto Bookmark Custom: $value")
    }
}

// v79.12: Screenshot Auto Crop Mode
internal fun PlayerActivity.showV79ScreenshotAutoCropModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v79ScreenshotAutoCropMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Crop Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79ScreenshotAutoCropMode = value
        AppToast.show(this, "Screenshot Auto Crop Mode: $value")
    }
}

// v79.13: Video Adaptive Frame Rate
internal fun PlayerActivity.showV79VideoAdaptiveFrameRateToggle() {
    val enabled = !BiliClient.prefs.v79VideoAdaptiveFrameRate
    BiliClient.prefs.v79VideoAdaptiveFrameRate = enabled
    AppToast.show(this, "Video Adaptive Frame Rate: ${if (enabled) "ON" else "OFF"}")
}

// v79.14: Danmaku Font Weight Custom
internal fun PlayerActivity.showV79DanmakuFontWeightCustomDialog() {
    val options = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v79DanmakuFontWeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Weight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79DanmakuFontWeightCustom = value
        AppToast.show(this, "Danmaku Font Weight Custom: $value")
    }
}

// v79.15: Subtitle Animation Duration
internal fun PlayerActivity.showV79SubtitleAnimationDurationDialog() {
    val options = listOf(100, 200, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v79SubtitleAnimationDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v79SubtitleAnimationDuration = value
        AppToast.show(this, "Subtitle Animation Duration: $value")
    }
}

// v80.1: Video Adaptive Color Grading
internal fun PlayerActivity.showV80VideoAdaptiveColorGradingToggle() {
    val enabled = !BiliClient.prefs.v80VideoAdaptiveColorGrading
    BiliClient.prefs.v80VideoAdaptiveColorGrading = enabled
    AppToast.show(this, "Video Adaptive Color Grading: ${if (enabled) "ON" else "OFF"}")
}

// v80.2: Danmaku Collision Strength
internal fun PlayerActivity.showV80DanmakuCollisionStrengthDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v80DanmakuCollisionStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Collision Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80DanmakuCollisionStrength = value
        AppToast.show(this, "Danmaku Collision Strength: $value")
    }
}

// v80.3: Subtitle Animation Easing
internal fun PlayerActivity.showV80SubtitleAnimationEasingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v80SubtitleAnimationEasing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Easing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80SubtitleAnimationEasing = value
        AppToast.show(this, "Subtitle Animation Easing: $value")
    }
}

// v80.4: Gesture Swipe Acceleration Custom
internal fun PlayerActivity.showV80GestureSwipeAccelerationCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v80GestureSwipeAccelerationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Acceleration Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80GestureSwipeAccelerationCustom = value
        AppToast.show(this, "Gesture Swipe Acceleration Custom: $value")
    }
}

// v80.5: Cast Video Dolby Vision Custom
internal fun PlayerActivity.showV80CastVideoDolbyVisionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v80CastVideoDolbyVisionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Dolby Vision Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80CastVideoDolbyVisionCustom = value
        AppToast.show(this, "Cast Video Dolby Vision Custom: $value")
    }
}

// v80.6: Playlist Auto Recover Strategy Custom
internal fun PlayerActivity.showV80PlaylistAutoRecoverStrategyCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v80PlaylistAutoRecoverStrategyCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Recover Strategy Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80PlaylistAutoRecoverStrategyCustom = value
        AppToast.show(this, "Playlist Auto Recover Strategy Custom: $value")
    }
}

// v80.7: Cache Encryption Custom
internal fun PlayerActivity.showV80CacheEncryptionCustomToggle() {
    val enabled = !BiliClient.prefs.v80CacheEncryptionCustom
    BiliClient.prefs.v80CacheEncryptionCustom = enabled
    AppToast.show(this, "Cache Encryption Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.8: Progress Bar Thumb Size Custom
internal fun PlayerActivity.showV80ProgressBarThumbSizeCustomDialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v80ProgressBarThumbSizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80ProgressBarThumbSizeCustom = value
        AppToast.show(this, "Progress Bar Thumb Size Custom: $value")
    }
}

// v80.9: Volume Auto Leveling Custom
internal fun PlayerActivity.showV80VolumeAutoLevelingCustomToggle() {
    val enabled = !BiliClient.prefs.v80VolumeAutoLevelingCustom
    BiliClient.prefs.v80VolumeAutoLevelingCustom = enabled
    AppToast.show(this, "Volume Auto Leveling Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.10: History Auto Sync Custom
internal fun PlayerActivity.showV80HistoryAutoSyncCustomToggle() {
    val enabled = !BiliClient.prefs.v80HistoryAutoSyncCustom
    BiliClient.prefs.v80HistoryAutoSyncCustom = enabled
    AppToast.show(this, "History Auto Sync Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.11: Playback Auto Resume Custom
internal fun PlayerActivity.showV80PlaybackAutoResumeCustomToggle() {
    val enabled = !BiliClient.prefs.v80PlaybackAutoResumeCustom
    BiliClient.prefs.v80PlaybackAutoResumeCustom = enabled
    AppToast.show(this, "Playback Auto Resume Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.12: Screenshot Auto Share Custom
internal fun PlayerActivity.showV80ScreenshotAutoShareCustomToggle() {
    val enabled = !BiliClient.prefs.v80ScreenshotAutoShareCustom
    BiliClient.prefs.v80ScreenshotAutoShareCustom = enabled
    AppToast.show(this, "Screenshot Auto Share Custom: ${if (enabled) "ON" else "OFF"}")
}

// v80.13: Video Adaptive Motion Blur
internal fun PlayerActivity.showV80VideoAdaptiveMotionBlurToggle() {
    val enabled = !BiliClient.prefs.v80VideoAdaptiveMotionBlur
    BiliClient.prefs.v80VideoAdaptiveMotionBlur = enabled
    AppToast.show(this, "Video Adaptive Motion Blur: ${if (enabled) "ON" else "OFF"}")
}

// v80.14: Danmaku Font Spacing Custom
internal fun PlayerActivity.showV80DanmakuFontSpacingCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v80DanmakuFontSpacingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Spacing Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v80DanmakuFontSpacingCustom = value
        AppToast.show(this, "Danmaku Font Spacing Custom: $value")
    }
}

// v80.15: Subtitle Animation Loop
internal fun PlayerActivity.showV80SubtitleAnimationLoopToggle() {
    val enabled = !BiliClient.prefs.v80SubtitleAnimationLoop
    BiliClient.prefs.v80SubtitleAnimationLoop = enabled
    AppToast.show(this, "Subtitle Animation Loop: ${if (enabled) "ON" else "OFF"}")
}

// v81.1: Network Bandwidth Adapt
internal fun PlayerActivity.showV81NetworkBandwidthAdaptToggle() {
    val enabled = !BiliClient.prefs.v81NetworkBandwidthAdapt
    BiliClient.prefs.v81NetworkBandwidthAdapt = enabled
    AppToast.show(this, "Network Bandwidth Adapt: ${if (enabled) "ON" else "OFF"}")
}

// v81.2: Danmaku Opacity Curve Custom
internal fun PlayerActivity.showV81DanmakuOpacityCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v81DanmakuOpacityCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Opacity Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81DanmakuOpacityCurveCustom = value
        AppToast.show(this, "Danmaku Opacity Curve Custom: $value")
    }
}

// v81.3: Subtitle Position Lock
internal fun PlayerActivity.showV81SubtitlePositionLockToggle() {
    val enabled = !BiliClient.prefs.v81SubtitlePositionLock
    BiliClient.prefs.v81SubtitlePositionLock = enabled
    AppToast.show(this, "Subtitle Position Lock: ${if (enabled) "ON" else "OFF"}")
}

// v81.4: Gesture Pinch Zoom Speed
internal fun PlayerActivity.showV81GesturePinchZoomSpeedDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v81GesturePinchZoomSpeed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Zoom Speed",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81GesturePinchZoomSpeed = value
        AppToast.show(this, "Gesture Pinch Zoom Speed: $value")
    }
}

// v81.5: Cast Reconnect Auto
internal fun PlayerActivity.showV81CastReconnectAutoToggle() {
    val enabled = !BiliClient.prefs.v81CastReconnectAuto
    BiliClient.prefs.v81CastReconnectAuto = enabled
    AppToast.show(this, "Cast Reconnect Auto: ${if (enabled) "ON" else "OFF"}")
}

// v81.6: Playlist Bookmark Sync
internal fun PlayerActivity.showV81PlaylistBookmarkSyncToggle() {
    val enabled = !BiliClient.prefs.v81PlaylistBookmarkSync
    BiliClient.prefs.v81PlaylistBookmarkSync = enabled
    AppToast.show(this, "Playlist Bookmark Sync: ${if (enabled) "ON" else "OFF"}")
}

// v81.7: Cache Prebuffer Size
internal fun PlayerActivity.showV81CachePrebufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v81CachePrebufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Prebuffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81CachePrebufferSize = value
        AppToast.show(this, "Cache Prebuffer Size: $value")
    }
}

// v81.8: Progress Bar Double Tap Seek
internal fun PlayerActivity.showV81ProgressBarDoubleTapSeekDialog() {
    val options = listOf(5, 10, 15, 30, 60)
    val currentIndex = options.indexOf(BiliClient.prefs.v81ProgressBarDoubleTapSeek).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Double Tap Seek",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81ProgressBarDoubleTapSeek = value
        AppToast.show(this, "Progress Bar Double Tap Seek: $value")
    }
}

// v81.9: Volume Loudness Normalize
internal fun PlayerActivity.showV81VolumeLoudnessNormalizeToggle() {
    val enabled = !BiliClient.prefs.v81VolumeLoudnessNormalize
    BiliClient.prefs.v81VolumeLoudnessNormalize = enabled
    AppToast.show(this, "Volume Loudness Normalize: ${if (enabled) "ON" else "OFF"}")
}

// v81.10: History Search Filter
internal fun PlayerActivity.showV81HistorySearchFilterToggle() {
    val enabled = !BiliClient.prefs.v81HistorySearchFilter
    BiliClient.prefs.v81HistorySearchFilter = enabled
    AppToast.show(this, "History Search Filter: ${if (enabled) "ON" else "OFF"}")
}

// v81.11: Playback Skip Ad Auto
internal fun PlayerActivity.showV81PlaybackSkipAdAutoToggle() {
    val enabled = !BiliClient.prefs.v81PlaybackSkipAdAuto
    BiliClient.prefs.v81PlaybackSkipAdAuto = enabled
    AppToast.show(this, "Playback Skip Ad Auto: ${if (enabled) "ON" else "OFF"}")
}

// v81.12: Screenshot Count Display
internal fun PlayerActivity.showV81ScreenshotCountDisplayToggle() {
    val enabled = !BiliClient.prefs.v81ScreenshotCountDisplay
    BiliClient.prefs.v81ScreenshotCountDisplay = enabled
    AppToast.show(this, "Screenshot Count Display: ${if (enabled) "ON" else "OFF"}")
}

// v81.13: Video Upscale AI
internal fun PlayerActivity.showV81VideoUpscaleAIToggle() {
    val enabled = !BiliClient.prefs.v81VideoUpscaleAI
    BiliClient.prefs.v81VideoUpscaleAI = enabled
    AppToast.show(this, "Video Upscale AI: ${if (enabled) "ON" else "OFF"}")
}

// v81.14: Danmaku Send Rate Limit
internal fun PlayerActivity.showV81DanmakuSendRateLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v81DanmakuSendRateLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Rate Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81DanmakuSendRateLimit = value
        AppToast.show(this, "Danmaku Send Rate Limit: $value")
    }
}

// v81.15: Subtitle Timing Offset
internal fun PlayerActivity.showV81SubtitleTimingOffsetDialog() {
    val options = listOf(-500, -250, 0, 250, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v81SubtitleTimingOffset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Timing Offset",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v81SubtitleTimingOffset = value
        AppToast.show(this, "Subtitle Timing Offset: $value")
    }
}

// v82.1: Video Deinterlace Mode
internal fun PlayerActivity.showV82VideoDeinterlaceModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82VideoDeinterlaceMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Deinterlace Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82VideoDeinterlaceMode = value
        AppToast.show(this, "Video Deinterlace Mode: $value")
    }
}

// v82.2: Danmaku Font Size Auto Range
internal fun PlayerActivity.showV82DanmakuFontSizeAutoRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82DanmakuFontSizeAutoRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Auto Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82DanmakuFontSizeAutoRange = value
        AppToast.show(this, "Danmaku Font Size Auto Range: $value")
    }
}

// v82.3: Subtitle BG Blur Custom
internal fun PlayerActivity.showV82SubtitleBgBlurCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v82SubtitleBgBlurCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Blur Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82SubtitleBgBlurCustom = value
        AppToast.show(this, "Subtitle BG Blur Custom: $value")
    }
}

// v82.4: Gesture Edge Swipe Action
internal fun PlayerActivity.showV82GestureEdgeSwipeActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82GestureEdgeSwipeAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Swipe Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82GestureEdgeSwipeAction = value
        AppToast.show(this, "Gesture Edge Swipe Action: $value")
    }
}

// v82.5: Cast Video Bitrate Limit
internal fun PlayerActivity.showV82CastVideoBitrateLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82CastVideoBitrateLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Bitrate Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82CastVideoBitrateLimit = value
        AppToast.show(this, "Cast Video Bitrate Limit: $value")
    }
}

// v82.6: Playlist Duplicate Detect
internal fun PlayerActivity.showV82PlaylistDuplicateDetectToggle() {
    val enabled = !BiliClient.prefs.v82PlaylistDuplicateDetect
    BiliClient.prefs.v82PlaylistDuplicateDetect = enabled
    AppToast.show(this, "Playlist Duplicate Detect: ${if (enabled) "ON" else "OFF"}")
}

// v82.7: Cache Smart Prefetch
internal fun PlayerActivity.showV82CacheSmartPrefetchToggle() {
    val enabled = !BiliClient.prefs.v82CacheSmartPrefetch
    BiliClient.prefs.v82CacheSmartPrefetch = enabled
    AppToast.show(this, "Cache Smart Prefetch: ${if (enabled) "ON" else "OFF"}")
}

// v82.8: Progress Bar Swipe Seek
internal fun PlayerActivity.showV82ProgressBarSwipeSeekToggle() {
    val enabled = !BiliClient.prefs.v82ProgressBarSwipeSeek
    BiliClient.prefs.v82ProgressBarSwipeSeek = enabled
    AppToast.show(this, "Progress Bar Swipe Seek: ${if (enabled) "ON" else "OFF"}")
}

// v82.9: Volume Night Mode
internal fun PlayerActivity.showV82VolumeNightModeToggle() {
    val enabled = !BiliClient.prefs.v82VolumeNightMode
    BiliClient.prefs.v82VolumeNightMode = enabled
    AppToast.show(this, "Volume Night Mode: ${if (enabled) "ON" else "OFF"}")
}

// v82.10: History Group By Date
internal fun PlayerActivity.showV82HistoryGroupByDateToggle() {
    val enabled = !BiliClient.prefs.v82HistoryGroupByDate
    BiliClient.prefs.v82HistoryGroupByDate = enabled
    AppToast.show(this, "History Group By Date: ${if (enabled) "ON" else "OFF"}")
}

// v82.11: Playback Speed Memory
internal fun PlayerActivity.showV82PlaybackSpeedMemoryToggle() {
    val enabled = !BiliClient.prefs.v82PlaybackSpeedMemory
    BiliClient.prefs.v82PlaybackSpeedMemory = enabled
    AppToast.show(this, "Playback Speed Memory: ${if (enabled) "ON" else "OFF"}")
}

// v82.12: Screenshot Timestamp
internal fun PlayerActivity.showV82ScreenshotTimestampToggle() {
    val enabled = !BiliClient.prefs.v82ScreenshotTimestamp
    BiliClient.prefs.v82ScreenshotTimestamp = enabled
    AppToast.show(this, "Screenshot Timestamp: ${if (enabled) "ON" else "OFF"}")
}

// v82.13: Video Color Temperature Custom
internal fun PlayerActivity.showV82VideoColorTemperatureCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v82VideoColorTemperatureCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Temperature Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82VideoColorTemperatureCustom = value
        AppToast.show(this, "Video Color Temperature Custom: $value")
    }
}

// v82.14: Danmaku Merge Algorithm
internal fun PlayerActivity.showV82DanmakuMergeAlgorithmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v82DanmakuMergeAlgorithm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Algorithm",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v82DanmakuMergeAlgorithm = value
        AppToast.show(this, "Danmaku Merge Algorithm: $value")
    }
}

// v82.15: Subtitle Sync Auto
internal fun PlayerActivity.showV82SubtitleSyncAutoToggle() {
    val enabled = !BiliClient.prefs.v82SubtitleSyncAuto
    BiliClient.prefs.v82SubtitleSyncAuto = enabled
    AppToast.show(this, "Subtitle Sync Auto: ${if (enabled) "ON" else "OFF"}")
}

// v83.1: Video Noise Gate Custom
internal fun PlayerActivity.showV83VideoNoiseGateCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v83VideoNoiseGateCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Noise Gate Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83VideoNoiseGateCustom = value
        AppToast.show(this, "Video Noise Gate Custom: $value")
    }
}

// v83.2: Danmaku Scroll Momentum
internal fun PlayerActivity.showV83DanmakuScrollMomentumDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v83DanmakuScrollMomentum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Momentum",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83DanmakuScrollMomentum = value
        AppToast.show(this, "Danmaku Scroll Momentum: $value")
    }
}

// v83.3: Subtitle Karaoke Highlight
internal fun PlayerActivity.showV83SubtitleKaraokeHighlightToggle() {
    val enabled = !BiliClient.prefs.v83SubtitleKaraokeHighlight
    BiliClient.prefs.v83SubtitleKaraokeHighlight = enabled
    AppToast.show(this, "Subtitle Karaoke Highlight: ${if (enabled) "ON" else "OFF"}")
}

// v83.4: Gesture Three Finger Action
internal fun PlayerActivity.showV83GestureThreeFingerActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83GestureThreeFingerAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Three Finger Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83GestureThreeFingerAction = value
        AppToast.show(this, "Gesture Three Finger Action: $value")
    }
}

// v83.5: Cast Audio Delay
internal fun PlayerActivity.showV83CastAudioDelayDialog() {
    val options = listOf(-500, -250, 0, 250, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v83CastAudioDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83CastAudioDelay = value
        AppToast.show(this, "Cast Audio Delay: $value")
    }
}

// v83.6: Playlist Smart Sort
internal fun PlayerActivity.showV83PlaylistSmartSortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83PlaylistSmartSort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Smart Sort",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83PlaylistSmartSort = value
        AppToast.show(this, "Playlist Smart Sort: $value")
    }
}

// v83.7: Cache WiFi Priority
internal fun PlayerActivity.showV83CacheWIFIPriorityToggle() {
    val enabled = !BiliClient.prefs.v83CacheWIFIPriority
    BiliClient.prefs.v83CacheWIFIPriority = enabled
    AppToast.show(this, "Cache WiFi Priority: ${if (enabled) "ON" else "OFF"}")
}

// v83.8: Progress Bar Gesture Area
internal fun PlayerActivity.showV83ProgressBarGestureAreaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83ProgressBarGestureArea).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Gesture Area",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83ProgressBarGestureArea = value
        AppToast.show(this, "Progress Bar Gesture Area: $value")
    }
}

// v83.9: Volume Balance L-R
internal fun PlayerActivity.showV83VolumeBalanceLRDialog() {
    val options = listOf(-50, -25, 0, 25, 50)
    val currentIndex = options.indexOf(BiliClient.prefs.v83VolumeBalanceLR).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Balance L-R",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83VolumeBalanceLR = value
        AppToast.show(this, "Volume Balance L-R: $value")
    }
}

// v83.10: History Max Items
internal fun PlayerActivity.showV83HistoryMaxItemsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83HistoryMaxItems).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83HistoryMaxItems = value
        AppToast.show(this, "History Max Items: $value")
    }
}

// v83.11: Playback Auto Next Episode
internal fun PlayerActivity.showV83PlaybackAutoNextEpisodeToggle() {
    val enabled = !BiliClient.prefs.v83PlaybackAutoNextEpisode
    BiliClient.prefs.v83PlaybackAutoNextEpisode = enabled
    AppToast.show(this, "Playback Auto Next Episode: ${if (enabled) "ON" else "OFF"}")
}

// v83.12: Screenshot Overlay Info
internal fun PlayerActivity.showV83ScreenshotOverlayInfoToggle() {
    val enabled = !BiliClient.prefs.v83ScreenshotOverlayInfo
    BiliClient.prefs.v83ScreenshotOverlayInfo = enabled
    AppToast.show(this, "Screenshot Overlay Info: ${if (enabled) "ON" else "OFF"}")
}

// v83.13: VideoImageSharp Custom
internal fun PlayerActivity.showV83VideoImageSharpCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v83VideoImageSharpCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "VideoImageSharp Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83VideoImageSharpCustom = value
        AppToast.show(this, "VideoImageSharp Custom: $value")
    }
}

// v83.14: Danmaku Color Palette
internal fun PlayerActivity.showV83DanmakuColorPaletteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v83DanmakuColorPalette).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Color Palette",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83DanmakuColorPalette = value
        AppToast.show(this, "Danmaku Color Palette: $value")
    }
}

// v83.15: Subtitle BG Opacity Custom
internal fun PlayerActivity.showV83SubtitleBgOpacityCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v83SubtitleBgOpacityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Opacity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v83SubtitleBgOpacityCustom = value
        AppToast.show(this, "Subtitle BG Opacity Custom: $value")
    }
}

// v84.1: Video Detail Enhance Custom
internal fun PlayerActivity.showV84VideoDetailEnhanceCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v84VideoDetailEnhanceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Detail Enhance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84VideoDetailEnhanceCustom = value
        AppToast.show(this, "Video Detail Enhance Custom: $value")
    }
}

// v84.2: Danmaku Scroll Friction
internal fun PlayerActivity.showV84DanmakuScrollFrictionDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v84DanmakuScrollFriction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Friction",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84DanmakuScrollFriction = value
        AppToast.show(this, "Danmaku Scroll Friction: $value")
    }
}

// v84.3: Subtitle Bilingual Display
internal fun PlayerActivity.showV84SubtitleBilingualDisplayToggle() {
    val enabled = !BiliClient.prefs.v84SubtitleBilingualDisplay
    BiliClient.prefs.v84SubtitleBilingualDisplay = enabled
    AppToast.show(this, "Subtitle Bilingual Display: ${if (enabled) "ON" else "OFF"}")
}

// v84.4: Gesture Four Finger Action
internal fun PlayerActivity.showV84GestureFourFingerActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v84GestureFourFingerAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Four Finger Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84GestureFourFingerAction = value
        AppToast.show(this, "Gesture Four Finger Action: $value")
    }
}

// v84.5: Cast Video HDR10 Custom
internal fun PlayerActivity.showV84CastVideoHDR10CustomToggle() {
    val enabled = !BiliClient.prefs.v84CastVideoHDR10Custom
    BiliClient.prefs.v84CastVideoHDR10Custom = enabled
    AppToast.show(this, "Cast Video HDR10 Custom: ${if (enabled) "ON" else "OFF"}")
}

// v84.6: Playlist Auto Play Next
internal fun PlayerActivity.showV84PlaylistAutoPlayNextToggle() {
    val enabled = !BiliClient.prefs.v84PlaylistAutoPlayNext
    BiliClient.prefs.v84PlaylistAutoPlayNext = enabled
    AppToast.show(this, "Playlist Auto Play Next: ${if (enabled) "ON" else "OFF"}")
}

// v84.7: Cache Storage Analyze
internal fun PlayerActivity.showV84CacheStorageAnalyzeToggle() {
    val enabled = !BiliClient.prefs.v84CacheStorageAnalyze
    BiliClient.prefs.v84CacheStorageAnalyze = enabled
    AppToast.show(this, "Cache Storage Analyze: ${if (enabled) "ON" else "OFF"}")
}

// v84.8: Progress Bar Haptic Feedback
internal fun PlayerActivity.showV84ProgressBarHapticFeedbackToggle() {
    val enabled = !BiliClient.prefs.v84ProgressBarHapticFeedback
    BiliClient.prefs.v84ProgressBarHapticFeedback = enabled
    AppToast.show(this, "Progress Bar Haptic Feedback: ${if (enabled) "ON" else "OFF"}")
}

// v84.9: Volume Fade In Duration
internal fun PlayerActivity.showV84VolumeFadeInDurationDialog() {
    val options = listOf(0, 500, 1000, 2000, 3000)
    val currentIndex = options.indexOf(BiliClient.prefs.v84VolumeFadeInDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade In Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84VolumeFadeInDuration = value
        AppToast.show(this, "Volume Fade In Duration: $value")
    }
}

// v84.10: History Auto Cleanup
internal fun PlayerActivity.showV84HistoryAutoCleanupToggle() {
    val enabled = !BiliClient.prefs.v84HistoryAutoCleanup
    BiliClient.prefs.v84HistoryAutoCleanup = enabled
    AppToast.show(this, "History Auto Cleanup: ${if (enabled) "ON" else "OFF"}")
}

// v84.11: Playback Auto Play On Open
internal fun PlayerActivity.showV84PlaybackAutoPlayOnOpenToggle() {
    val enabled = !BiliClient.prefs.v84PlaybackAutoPlayOnOpen
    BiliClient.prefs.v84PlaybackAutoPlayOnOpen = enabled
    AppToast.show(this, "Playback Auto Play On Open: ${if (enabled) "ON" else "OFF"}")
}

// v84.12: Screenshot Folder Path
internal fun PlayerActivity.showV84ScreenshotFolderPathDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v84ScreenshotFolderPath).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Folder Path",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84ScreenshotFolderPath = value
        AppToast.show(this, "Screenshot Folder Path: $value")
    }
}

// v84.13: Video Vividness Custom
internal fun PlayerActivity.showV84VideoVividnessCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v84VideoVividnessCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Vividness Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84VideoVividnessCustom = value
        AppToast.show(this, "Video Vividness Custom: $value")
    }
}

// v84.14: Danmaku Font Italic Toggle
internal fun PlayerActivity.showV84DanmakuFontItalicToggleToggle() {
    val enabled = !BiliClient.prefs.v84DanmakuFontItalicToggle
    BiliClient.prefs.v84DanmakuFontItalicToggle = enabled
    AppToast.show(this, "Danmaku Font Italic Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v84.15: Subtitle Position Custom
internal fun PlayerActivity.showV84SubtitlePositionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v84SubtitlePositionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v84SubtitlePositionCustom = value
        AppToast.show(this, "Subtitle Position Custom: $value")
    }
}

// v85.1: Video Luma Sharpen Custom
internal fun PlayerActivity.showV85VideoLumaSharpenCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v85VideoLumaSharpenCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Luma Sharpen Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85VideoLumaSharpenCustom = value
        AppToast.show(this, "Video Luma Sharpen Custom: $value")
    }
}

// v85.2: Danmaku BG Padding Custom
internal fun PlayerActivity.showV85DanmakuBgPaddingCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v85DanmakuBgPaddingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Padding Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85DanmakuBgPaddingCustom = value
        AppToast.show(this, "Danmaku BG Padding Custom: $value")
    }
}

// v85.3: Subtitle BG Color Custom
internal fun PlayerActivity.showV85SubtitleBgColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85SubtitleBgColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85SubtitleBgColorCustom = value
        AppToast.show(this, "Subtitle BG Color Custom: $value")
    }
}

// v85.4: Gesture Long Press Action
internal fun PlayerActivity.showV85GestureLongPressActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85GestureLongPressAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85GestureLongPressAction = value
        AppToast.show(this, "Gesture Long Press Action: $value")
    }
}

// v85.5: Cast Audio Codec Custom
internal fun PlayerActivity.showV85CastAudioCodecCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85CastAudioCodecCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Codec Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85CastAudioCodecCustom = value
        AppToast.show(this, "Cast Audio Codec Custom: $value")
    }
}

// v85.6: Playlist Auto Load More
internal fun PlayerActivity.showV85PlaylistAutoLoadMoreToggle() {
    val enabled = !BiliClient.prefs.v85PlaylistAutoLoadMore
    BiliClient.prefs.v85PlaylistAutoLoadMore = enabled
    AppToast.show(this, "Playlist Auto Load More: ${if (enabled) "ON" else "OFF"}")
}

// v85.7: Cache Cleanup On Low Storage
internal fun PlayerActivity.showV85CacheCleanupOnLowStorageToggle() {
    val enabled = !BiliClient.prefs.v85CacheCleanupOnLowStorage
    BiliClient.prefs.v85CacheCleanupOnLowStorage = enabled
    AppToast.show(this, "Cache Cleanup On Low Storage: ${if (enabled) "ON" else "OFF"}")
}

// v85.8: Progress Bar Tooltip
internal fun PlayerActivity.showV85ProgressBarTooltipToggle() {
    val enabled = !BiliClient.prefs.v85ProgressBarTooltip
    BiliClient.prefs.v85ProgressBarTooltip = enabled
    AppToast.show(this, "Progress Bar Tooltip: ${if (enabled) "ON" else "OFF"}")
}

// v85.9: Volume Fade Out Duration
internal fun PlayerActivity.showV85VolumeFadeOutDurationDialog() {
    val options = listOf(0, 500, 1000, 2000, 3000)
    val currentIndex = options.indexOf(BiliClient.prefs.v85VolumeFadeOutDuration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Out Duration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85VolumeFadeOutDuration = value
        AppToast.show(this, "Volume Fade Out Duration: $value")
    }
}

// v85.10: History Export Format
internal fun PlayerActivity.showV85HistoryExportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85HistoryExportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Export Format",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85HistoryExportFormat = value
        AppToast.show(this, "History Export Format: $value")
    }
}

// v85.11: Playback Auto Loop Single
internal fun PlayerActivity.showV85PlaybackAutoLoopSingleToggle() {
    val enabled = !BiliClient.prefs.v85PlaybackAutoLoopSingle
    BiliClient.prefs.v85PlaybackAutoLoopSingle = enabled
    AppToast.show(this, "Playback Auto Loop Single: ${if (enabled) "ON" else "OFF"}")
}

// v85.12: Screenshot Naming Rule
internal fun PlayerActivity.showV85ScreenshotNamingRuleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v85ScreenshotNamingRule).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Naming Rule",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85ScreenshotNamingRule = value
        AppToast.show(this, "Screenshot Naming Rule: $value")
    }
}

// v85.13: Video Chroma Sharpen Custom
internal fun PlayerActivity.showV85VideoChromaSharpenCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v85VideoChromaSharpenCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Chroma Sharpen Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v85VideoChromaSharpenCustom = value
        AppToast.show(this, "Video Chroma Sharpen Custom: $value")
    }
}

// v85.14: Danmaku BG Border Toggle
internal fun PlayerActivity.showV85DanmakuBgBorderToggleToggle() {
    val enabled = !BiliClient.prefs.v85DanmakuBgBorderToggle
    BiliClient.prefs.v85DanmakuBgBorderToggle = enabled
    AppToast.show(this, "Danmaku BG Border Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v85.15: Subtitle Font Size Auto
internal fun PlayerActivity.showV85SubtitleFontSizeAutoToggle() {
    val enabled = !BiliClient.prefs.v85SubtitleFontSizeAuto
    BiliClient.prefs.v85SubtitleFontSizeAuto = enabled
    AppToast.show(this, "Subtitle Font Size Auto: ${if (enabled) "ON" else "OFF"}")
}

// v86.1: Video Contrast Curve Custom
internal fun PlayerActivity.showV86VideoContrastCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86VideoContrastCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Contrast Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86VideoContrastCurveCustom = value
        AppToast.show(this, "Video Contrast Curve Custom: $value")
    }
}

// v86.2: Danmaku Font Stretch Custom
internal fun PlayerActivity.showV86DanmakuFontStretchCustomDialog() {
    val options = listOf(75, 80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v86DanmakuFontStretchCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Stretch Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86DanmakuFontStretchCustom = value
        AppToast.show(this, "Danmaku Font Stretch Custom: $value")
    }
}

// v86.3: Subtitle BG Radius Custom
internal fun PlayerActivity.showV86SubtitleBgRadiusCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v86SubtitleBgRadiusCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Radius Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86SubtitleBgRadiusCustom = value
        AppToast.show(this, "Subtitle BG Radius Custom: $value")
    }
}

// v86.4: Gesture Double Tap Action
internal fun PlayerActivity.showV86GestureDoubleTapActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86GestureDoubleTapAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86GestureDoubleTapAction = value
        AppToast.show(this, "Gesture Double Tap Action: $value")
    }
}

// v86.5: Cast Video Protocol
internal fun PlayerActivity.showV86CastVideoProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86CastVideoProtocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Protocol",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86CastVideoProtocol = value
        AppToast.show(this, "Cast Video Protocol: $value")
    }
}

// v86.6: Playlist Auto Refresh
internal fun PlayerActivity.showV86PlaylistAutoRefreshToggle() {
    val enabled = !BiliClient.prefs.v86PlaylistAutoRefresh
    BiliClient.prefs.v86PlaylistAutoRefresh = enabled
    AppToast.show(this, "Playlist Auto Refresh: ${if (enabled) "ON" else "OFF"}")
}

// v86.7: Cache Max Size Custom
internal fun PlayerActivity.showV86CacheMaxSizeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86CacheMaxSizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86CacheMaxSizeCustom = value
        AppToast.show(this, "Cache Max Size Custom: $value")
    }
}

// v86.8: Progress Bar Live Edge
internal fun PlayerActivity.showV86ProgressBarLiveEdgeToggle() {
    val enabled = !BiliClient.prefs.v86ProgressBarLiveEdge
    BiliClient.prefs.v86ProgressBarLiveEdge = enabled
    AppToast.show(this, "Progress Bar Live Edge: ${if (enabled) "ON" else "OFF"}")
}

// v86.9: Volume Boost Strength
internal fun PlayerActivity.showV86VolumeBoostStrengthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v86VolumeBoostStrength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Boost Strength",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86VolumeBoostStrength = value
        AppToast.show(this, "Volume Boost Strength: $value")
    }
}

// v86.10: History Import Format
internal fun PlayerActivity.showV86HistoryImportFormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86HistoryImportFormat).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Import Format",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86HistoryImportFormat = value
        AppToast.show(this, "History Import Format: $value")
    }
}

// v86.11: Playback Auto Quality Switch
internal fun PlayerActivity.showV86PlaybackAutoQualitySwitchToggle() {
    val enabled = !BiliClient.prefs.v86PlaybackAutoQualitySwitch
    BiliClient.prefs.v86PlaybackAutoQualitySwitch = enabled
    AppToast.show(this, "Playback Auto Quality Switch: ${if (enabled) "ON" else "OFF"}")
}

// v86.12: Screenshot Auto Upload
internal fun PlayerActivity.showV86ScreenshotAutoUploadToggle() {
    val enabled = !BiliClient.prefs.v86ScreenshotAutoUpload
    BiliClient.prefs.v86ScreenshotAutoUpload = enabled
    AppToast.show(this, "Screenshot Auto Upload: ${if (enabled) "ON" else "OFF"}")
}

// v86.13: Video Saturation Curve Custom
internal fun PlayerActivity.showV86VideoSaturationCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86VideoSaturationCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Saturation Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86VideoSaturationCurveCustom = value
        AppToast.show(this, "Video Saturation Curve Custom: $value")
    }
}

// v86.14: Danmaku Send Cooldown
internal fun PlayerActivity.showV86DanmakuSendCooldownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v86DanmakuSendCooldown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Cooldown",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86DanmakuSendCooldown = value
        AppToast.show(this, "Danmaku Send Cooldown: $value")
    }
}

// v86.15: Subtitle Outline Width
internal fun PlayerActivity.showV86SubtitleOutlineWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v86SubtitleOutlineWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v86SubtitleOutlineWidth = value
        AppToast.show(this, "Subtitle Outline Width: $value")
    }
}

// v87.1: Video Brightness Curve Custom
internal fun PlayerActivity.showV87VideoBrightnessCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87VideoBrightnessCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Brightness Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87VideoBrightnessCurveCustom = value
        AppToast.show(this, "Video Brightness Curve Custom: $value")
    }
}

// v87.2: Danmaku Line Height Custom
internal fun PlayerActivity.showV87DanmakuLineHeightCustomDialog() {
    val options = listOf(80, 90, 100, 110, 120)
    val currentIndex = options.indexOf(BiliClient.prefs.v87DanmakuLineHeightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Line Height Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87DanmakuLineHeightCustom = value
        AppToast.show(this, "Danmaku Line Height Custom: $value")
    }
}

// v87.3: Subtitle Shadow Offset X
internal fun PlayerActivity.showV87SubtitleShadowOffsetXDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v87SubtitleShadowOffsetX).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset X",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87SubtitleShadowOffsetX = value
        AppToast.show(this, "Subtitle Shadow Offset X: $value")
    }
}

// v87.4: Gesture Swipe Threshold
internal fun PlayerActivity.showV87GestureSwipeThresholdDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v87GestureSwipeThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87GestureSwipeThreshold = value
        AppToast.show(this, "Gesture Swipe Threshold: $value")
    }
}

// v87.5: Cast Audio Sample Rate
internal fun PlayerActivity.showV87CastAudioSampleRateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87CastAudioSampleRate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Sample Rate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87CastAudioSampleRate = value
        AppToast.show(this, "Cast Audio Sample Rate: $value")
    }
}

// v87.6: Playlist Auto Download
internal fun PlayerActivity.showV87PlaylistAutoDownloadToggle() {
    val enabled = !BiliClient.prefs.v87PlaylistAutoDownload
    BiliClient.prefs.v87PlaylistAutoDownload = enabled
    AppToast.show(this, "Playlist Auto Download: ${if (enabled) "ON" else "OFF"}")
}

// v87.7: Cache Cleanup Schedule
internal fun PlayerActivity.showV87CacheCleanupScheduleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87CacheCleanupSchedule).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Schedule",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87CacheCleanupSchedule = value
        AppToast.show(this, "Cache Cleanup Schedule: $value")
    }
}

// v87.8: Progress Bar Snap To Chapter
internal fun PlayerActivity.showV87ProgressBarSnapToChapterToggle() {
    val enabled = !BiliClient.prefs.v87ProgressBarSnapToChapter
    BiliClient.prefs.v87ProgressBarSnapToChapter = enabled
    AppToast.show(this, "Progress Bar Snap To Chapter: ${if (enabled) "ON" else "OFF"}")
}

// v87.9: Volume Limit Max
internal fun PlayerActivity.showV87VolumeLimitMaxDialog() {
    val options = listOf(50, 60, 70, 80, 90, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v87VolumeLimitMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Limit Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87VolumeLimitMax = value
        AppToast.show(this, "Volume Limit Max: $value")
    }
}

// v87.10: History Auto Delete Expired
internal fun PlayerActivity.showV87HistoryAutoDeleteExpiredToggle() {
    val enabled = !BiliClient.prefs.v87HistoryAutoDeleteExpired
    BiliClient.prefs.v87HistoryAutoDeleteExpired = enabled
    AppToast.show(this, "History Auto Delete Expired: ${if (enabled) "ON" else "OFF"}")
}

// v87.11: Playback Auto Skip Filler
internal fun PlayerActivity.showV87PlaybackAutoSkipFillerToggle() {
    val enabled = !BiliClient.prefs.v87PlaybackAutoSkipFiller
    BiliClient.prefs.v87PlaybackAutoSkipFiller = enabled
    AppToast.show(this, "Playback Auto Skip Filler: ${if (enabled) "ON" else "OFF"}")
}

// v87.12: Screenshot Cloud Sync
internal fun PlayerActivity.showV87ScreenshotCloudSyncToggle() {
    val enabled = !BiliClient.prefs.v87ScreenshotCloudSync
    BiliClient.prefs.v87ScreenshotCloudSync = enabled
    AppToast.show(this, "Screenshot Cloud Sync: ${if (enabled) "ON" else "OFF"}")
}

// v87.13: Video Gamma Curve Custom
internal fun PlayerActivity.showV87VideoGammaCurveCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87VideoGammaCurveCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Gamma Curve Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87VideoGammaCurveCustom = value
        AppToast.show(this, "Video Gamma Curve Custom: $value")
    }
}

// v87.14: Danmaku Max On Screen
internal fun PlayerActivity.showV87DanmakuMaxOnScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v87DanmakuMaxOnScreen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Max On Screen",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87DanmakuMaxOnScreen = value
        AppToast.show(this, "Danmaku Max On Screen: $value")
    }
}

// v87.15: Subtitle Shadow Offset Y
internal fun PlayerActivity.showV87SubtitleShadowOffsetYDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v87SubtitleShadowOffsetY).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Offset Y",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v87SubtitleShadowOffsetY = value
        AppToast.show(this, "Subtitle Shadow Offset Y: $value")
    }
}

// v88.1: Video White Balance Custom
internal fun PlayerActivity.showV88VideoWhiteBalanceCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v88VideoWhiteBalanceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video White Balance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88VideoWhiteBalanceCustom = value
        AppToast.show(this, "Video White Balance Custom: $value")
    }
}

// v88.2: Danmaku Send Animation
internal fun PlayerActivity.showV88DanmakuSendAnimationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88DanmakuSendAnimation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Animation",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88DanmakuSendAnimation = value
        AppToast.show(this, "Danmaku Send Animation: $value")
    }
}

// v88.3: Subtitle Outline Color
internal fun PlayerActivity.showV88SubtitleOutlineColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88SubtitleOutlineColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Outline Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88SubtitleOutlineColor = value
        AppToast.show(this, "Subtitle Outline Color: $value")
    }
}

// v88.4: Gesture Tap Action
internal fun PlayerActivity.showV88GestureTapActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88GestureTapAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88GestureTapAction = value
        AppToast.show(this, "Gesture Tap Action: $value")
    }
}

// v88.5: Cast Video Resolution
internal fun PlayerActivity.showV88CastVideoResolutionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88CastVideoResolution).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Resolution",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88CastVideoResolution = value
        AppToast.show(this, "Cast Video Resolution: $value")
    }
}

// v88.6: Playlist Auto Mark Watched
internal fun PlayerActivity.showV88PlaylistAutoMarkWatchedToggle() {
    val enabled = !BiliClient.prefs.v88PlaylistAutoMarkWatched
    BiliClient.prefs.v88PlaylistAutoMarkWatched = enabled
    AppToast.show(this, "Playlist Auto Mark Watched: ${if (enabled) "ON" else "OFF"}")
}

// v88.7: Cache Preload Next Episode
internal fun PlayerActivity.showV88CachePreloadNextEpisodeToggle() {
    val enabled = !BiliClient.prefs.v88CachePreloadNextEpisode
    BiliClient.prefs.v88CachePreloadNextEpisode = enabled
    AppToast.show(this, "Cache Preload Next Episode: ${if (enabled) "ON" else "OFF"}")
}

// v88.8: Progress Bar Custom Label
internal fun PlayerActivity.showV88ProgressBarCustomLabelToggle() {
    val enabled = !BiliClient.prefs.v88ProgressBarCustomLabel
    BiliClient.prefs.v88ProgressBarCustomLabel = enabled
    AppToast.show(this, "Progress Bar Custom Label: ${if (enabled) "ON" else "OFF"}")
}

// v88.9: Volume Auto Mute On Call
internal fun PlayerActivity.showV88VolumeAutoMuteOnCallToggle() {
    val enabled = !BiliClient.prefs.v88VolumeAutoMuteOnCall
    BiliClient.prefs.v88VolumeAutoMuteOnCall = enabled
    AppToast.show(this, "Volume Auto Mute On Call: ${if (enabled) "ON" else "OFF"}")
}

// v88.10: History Show Thumbnails
internal fun PlayerActivity.showV88HistoryShowThumbnailsToggle() {
    val enabled = !BiliClient.prefs.v88HistoryShowThumbnails
    BiliClient.prefs.v88HistoryShowThumbnails = enabled
    AppToast.show(this, "History Show Thumbnails: ${if (enabled) "ON" else "OFF"}")
}

// v88.11: Playback Auto Resume Position
internal fun PlayerActivity.showV88PlaybackAutoResumePositionToggle() {
    val enabled = !BiliClient.prefs.v88PlaybackAutoResumePosition
    BiliClient.prefs.v88PlaybackAutoResumePosition = enabled
    AppToast.show(this, "Playback Auto Resume Position: ${if (enabled) "ON" else "OFF"}")
}

// v88.12: Screenshot Format Custom
internal fun PlayerActivity.showV88ScreenshotFormatCustomDialog() {
    val options = listOf(0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v88ScreenshotFormatCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88ScreenshotFormatCustom = value
        AppToast.show(this, "Screenshot Format Custom: $value")
    }
}

// v88.13: Video Tint Custom
internal fun PlayerActivity.showV88VideoTintCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v88VideoTintCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Tint Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88VideoTintCustom = value
        AppToast.show(this, "Video Tint Custom: $value")
    }
}

// v88.14: Danmaku Scroll Speed Curve
internal fun PlayerActivity.showV88DanmakuScrollSpeedCurveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v88DanmakuScrollSpeedCurve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed Curve",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88DanmakuScrollSpeedCurve = value
        AppToast.show(this, "Danmaku Scroll Speed Curve: $value")
    }
}

// v88.15: Subtitle Shadow Blur
internal fun PlayerActivity.showV88SubtitleShadowBlurDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v88SubtitleShadowBlur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Blur",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v88SubtitleShadowBlur = value
        AppToast.show(this, "Subtitle Shadow Blur: $value")
    }
}

// v89.1: Video Black Level Custom
internal fun PlayerActivity.showV89VideoBlackLevelCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v89VideoBlackLevelCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Black Level Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89VideoBlackLevelCustom = value
        AppToast.show(this, "Video Black Level Custom: $value")
    }
}

// v89.2: Danmaku Font Kerning Custom
internal fun PlayerActivity.showV89DanmakuFontKerningCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v89DanmakuFontKerningCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Kerning Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89DanmakuFontKerningCustom = value
        AppToast.show(this, "Danmaku Font Kerning Custom: $value")
    }
}

// v89.3: Subtitle Animation Loop Count
internal fun PlayerActivity.showV89SubtitleAnimationLoopCountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89SubtitleAnimationLoopCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Loop Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89SubtitleAnimationLoopCount = value
        AppToast.show(this, "Subtitle Animation Loop Count: $value")
    }
}

// v89.4: Gesture Pinch Action
internal fun PlayerActivity.showV89GesturePinchActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89GesturePinchAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89GesturePinchAction = value
        AppToast.show(this, "Gesture Pinch Action: $value")
    }
}

// v89.5: Cast Audio Bitrate
internal fun PlayerActivity.showV89CastAudioBitrateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89CastAudioBitrate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Bitrate",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89CastAudioBitrate = value
        AppToast.show(this, "Cast Audio Bitrate: $value")
    }
}

// v89.6: Playlist Auto Group By Series
internal fun PlayerActivity.showV89PlaylistAutoGroupBySeriesToggle() {
    val enabled = !BiliClient.prefs.v89PlaylistAutoGroupBySeries
    BiliClient.prefs.v89PlaylistAutoGroupBySeries = enabled
    AppToast.show(this, "Playlist Auto Group By Series: ${if (enabled) "ON" else "OFF"}")
}

// v89.7: Cache Verify On Start
internal fun PlayerActivity.showV89CacheVerifyOnStartToggle() {
    val enabled = !BiliClient.prefs.v89CacheVerifyOnStart
    BiliClient.prefs.v89CacheVerifyOnStart = enabled
    AppToast.show(this, "Cache Verify On Start: ${if (enabled) "ON" else "OFF"}")
}

// v89.8: Progress Bar Midpoint Indicator
internal fun PlayerActivity.showV89ProgressBarMidpointIndicatorToggle() {
    val enabled = !BiliClient.prefs.v89ProgressBarMidpointIndicator
    BiliClient.prefs.v89ProgressBarMidpointIndicator = enabled
    AppToast.show(this, "Progress Bar Midpoint Indicator: ${if (enabled) "ON" else "OFF"}")
}

// v89.9: Volume Auto Lower On Notification
internal fun PlayerActivity.showV89VolumeAutoLowerOnNotificationToggle() {
    val enabled = !BiliClient.prefs.v89VolumeAutoLowerOnNotification
    BiliClient.prefs.v89VolumeAutoLowerOnNotification = enabled
    AppToast.show(this, "Volume Auto Lower On Notification: ${if (enabled) "ON" else "OFF"}")
}

// v89.10: History Sort Order
internal fun PlayerActivity.showV89HistorySortOrderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89HistorySortOrder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Sort Order",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89HistorySortOrder = value
        AppToast.show(this, "History Sort Order: $value")
    }
}

// v89.11: Playback Auto Skip Preview
internal fun PlayerActivity.showV89PlaybackAutoSkipPreviewToggle() {
    val enabled = !BiliClient.prefs.v89PlaybackAutoSkipPreview
    BiliClient.prefs.v89PlaybackAutoSkipPreview = enabled
    AppToast.show(this, "Playback Auto Skip Preview: ${if (enabled) "ON" else "OFF"}")
}

// v89.12: Screenshot Quality Custom
internal fun PlayerActivity.showV89ScreenshotQualityCustomDialog() {
    val options = listOf(50, 60, 70, 80, 90, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v89ScreenshotQualityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Quality Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89ScreenshotQualityCustom = value
        AppToast.show(this, "Screenshot Quality Custom: $value")
    }
}

// v89.13: Video White Point Custom
internal fun PlayerActivity.showV89VideoWhitePointCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v89VideoWhitePointCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video White Point Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89VideoWhitePointCustom = value
        AppToast.show(this, "Video White Point Custom: $value")
    }
}

// v676: Date Auto Format676
internal fun PlayerActivity.showV676DateAutoFormat676Toggle() {
    val current = BiliClient.prefs.v676dateAutoFormat676
    BiliClient.prefs.v676dateAutoFormat676 = !current
    AppToast.show(this, "Date Auto Format676: ${if (!current) "ON" else "OFF"}")
}

// v676: Debug Auto Verbose676
internal fun PlayerActivity.showV676DebugAutoVerbose676Toggle() {
    val current = BiliClient.prefs.v676debugAutoVerbose676
    BiliClient.prefs.v676debugAutoVerbose676 = !current
    AppToast.show(this, "Debug Auto Verbose676: ${if (!current) "ON" else "OFF"}")
}

// v676: Decay Auto Fadeout676
internal fun PlayerActivity.showV676DecayAutoFadeout676Toggle() {
    val current = BiliClient.prefs.v676decayAutoFadeout676
    BiliClient.prefs.v676decayAutoFadeout676 = !current
    AppToast.show(this, "Decay Auto Fadeout676: ${if (!current) "ON" else "OFF"}")
}

// v676: Decimal Auto Round676
internal fun PlayerActivity.showV676DecimalAutoRound676Toggle() {
    val current = BiliClient.prefs.v676decimalAutoRound676
    BiliClient.prefs.v676decimalAutoRound676 = !current
    AppToast.show(this, "Decimal Auto Round676: ${if (!current) "ON" else "OFF"}")
}

// v676: Decode Auto Codec676
internal fun PlayerActivity.showV676DecodeAutoCodec676Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v676decodeAutoCodec676).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec676",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v676decodeAutoCodec676 = value
        AppToast.show(this, "Decode Auto Codec676: $value")
    }
}

// v676: Default Auto Restore676
internal fun PlayerActivity.showV676DefaultAutoRestore676Toggle() {
    val current = BiliClient.prefs.v676defaultAutoRestore676
    BiliClient.prefs.v676defaultAutoRestore676 = !current
    AppToast.show(this, "Default Auto Restore676: ${if (!current) "ON" else "OFF"}")
}

// v676: Delay Auto Buffer676
internal fun PlayerActivity.showV676DelayAutoBuffer676Toggle() {
    val current = BiliClient.prefs.v676delayAutoBuffer676
    BiliClient.prefs.v676delayAutoBuffer676 = !current
    AppToast.show(this, "Delay Auto Buffer676: ${if (!current) "ON" else "OFF"}")
}

// v677: Cross Auto Fade677
internal fun PlayerActivity.showV677CrossAutoFade677Toggle() {
    val current = BiliClient.prefs.v677crossAutoFade677
    BiliClient.prefs.v677crossAutoFade677 = !current
    AppToast.show(this, "Cross Auto Fade677: ${if (!current) "ON" else "OFF"}")
}

// v677: Crypto Auto Hash677
internal fun PlayerActivity.showV677CryptoAutoHash677Toggle() {
    val current = BiliClient.prefs.v677cryptoAutoHash677
    BiliClient.prefs.v677cryptoAutoHash677 = !current
    AppToast.show(this, "Crypto Auto Hash677: ${if (!current) "ON" else "OFF"}")
}

// v677: Cursor Auto Hide677
internal fun PlayerActivity.showV677CursorAutoHide677Toggle() {
    val current = BiliClient.prefs.v677cursorAutoHide677
    BiliClient.prefs.v677cursorAutoHide677 = !current
    AppToast.show(this, "Cursor Auto Hide677: ${if (!current) "ON" else "OFF"}")
}

// v677: Curve Auto Smooth677
internal fun PlayerActivity.showV677CurveAutoSmooth677Toggle() {
    val current = BiliClient.prefs.v677curveAutoSmooth677
    BiliClient.prefs.v677curveAutoSmooth677 = !current
    AppToast.show(this, "Curve Auto Smooth677: ${if (!current) "ON" else "OFF"}")
}

// v677: Custom Auto Theme677
internal fun PlayerActivity.showV677CustomAutoTheme677Toggle() {
    val current = BiliClient.prefs.v677customAutoTheme677
    BiliClient.prefs.v677customAutoTheme677 = !current
    AppToast.show(this, "Custom Auto Theme677: ${if (!current) "ON" else "OFF"}")
}

// v677: Cycle Auto Repeat677
internal fun PlayerActivity.showV677CycleAutoRepeat677Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v677cycleAutoRepeat677).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat677",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v677cycleAutoRepeat677 = value
        AppToast.show(this, "Cycle Auto Repeat677: $value")
    }
}

// v677: Data Auto Compress677
internal fun PlayerActivity.showV677DataAutoCompress677Toggle() {
    val current = BiliClient.prefs.v677dataAutoCompress677
    BiliClient.prefs.v677dataAutoCompress677 = !current
    AppToast.show(this, "Data Auto Compress677: ${if (!current) "ON" else "OFF"}")
}

// v677: Database Auto Index677
internal fun PlayerActivity.showV677DatabaseAutoIndex677Toggle() {
    val current = BiliClient.prefs.v677databaseAutoIndex677
    BiliClient.prefs.v677databaseAutoIndex677 = !current
    AppToast.show(this, "Database Auto Index677: ${if (!current) "ON" else "OFF"}")
}

// v677: Date Auto Format677
internal fun PlayerActivity.showV677DateAutoFormat677Toggle() {
    val current = BiliClient.prefs.v677dateAutoFormat677
    BiliClient.prefs.v677dateAutoFormat677 = !current
    AppToast.show(this, "Date Auto Format677: ${if (!current) "ON" else "OFF"}")
}

// v677: Debug Auto Verbose677
internal fun PlayerActivity.showV677DebugAutoVerbose677Toggle() {
    val current = BiliClient.prefs.v677debugAutoVerbose677
    BiliClient.prefs.v677debugAutoVerbose677 = !current
    AppToast.show(this, "Debug Auto Verbose677: ${if (!current) "ON" else "OFF"}")
}

// v677: Decay Auto Fadeout677
internal fun PlayerActivity.showV677DecayAutoFadeout677Toggle() {
    val current = BiliClient.prefs.v677decayAutoFadeout677
    BiliClient.prefs.v677decayAutoFadeout677 = !current
    AppToast.show(this, "Decay Auto Fadeout677: ${if (!current) "ON" else "OFF"}")
}

// v677: Decimal Auto Round677
internal fun PlayerActivity.showV677DecimalAutoRound677Toggle() {
    val current = BiliClient.prefs.v677decimalAutoRound677
    BiliClient.prefs.v677decimalAutoRound677 = !current
    AppToast.show(this, "Decimal Auto Round677: ${if (!current) "ON" else "OFF"}")
}

// v677: Decode Auto Codec677
internal fun PlayerActivity.showV677DecodeAutoCodec677Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v677decodeAutoCodec677).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec677",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v677decodeAutoCodec677 = value
        AppToast.show(this, "Decode Auto Codec677: $value")
    }
}

// v677: Default Auto Restore677
internal fun PlayerActivity.showV677DefaultAutoRestore677Toggle() {
    val current = BiliClient.prefs.v677defaultAutoRestore677
    BiliClient.prefs.v677defaultAutoRestore677 = !current
    AppToast.show(this, "Default Auto Restore677: ${if (!current) "ON" else "OFF"}")
}

// v677: Delay Auto Buffer677
internal fun PlayerActivity.showV677DelayAutoBuffer677Toggle() {
    val current = BiliClient.prefs.v677delayAutoBuffer677
    BiliClient.prefs.v677delayAutoBuffer677 = !current
    AppToast.show(this, "Delay Auto Buffer677: ${if (!current) "ON" else "OFF"}")
}

// v678: Cross Auto Fade678
internal fun PlayerActivity.showV678CrossAutoFade678Toggle() {
    val current = BiliClient.prefs.v678crossAutoFade678
    BiliClient.prefs.v678crossAutoFade678 = !current
    AppToast.show(this, "Cross Auto Fade678: ${if (!current) "ON" else "OFF"}")
}

// v678: Crypto Auto Hash678
internal fun PlayerActivity.showV678CryptoAutoHash678Toggle() {
    val current = BiliClient.prefs.v678cryptoAutoHash678
    BiliClient.prefs.v678cryptoAutoHash678 = !current
    AppToast.show(this, "Crypto Auto Hash678: ${if (!current) "ON" else "OFF"}")
}

// v678: Cursor Auto Hide678
internal fun PlayerActivity.showV678CursorAutoHide678Toggle() {
    val current = BiliClient.prefs.v678cursorAutoHide678
    BiliClient.prefs.v678cursorAutoHide678 = !current
    AppToast.show(this, "Cursor Auto Hide678: ${if (!current) "ON" else "OFF"}")
}

// v678: Curve Auto Smooth678
internal fun PlayerActivity.showV678CurveAutoSmooth678Toggle() {
    val current = BiliClient.prefs.v678curveAutoSmooth678
    BiliClient.prefs.v678curveAutoSmooth678 = !current
    AppToast.show(this, "Curve Auto Smooth678: ${if (!current) "ON" else "OFF"}")
}

// v678: Custom Auto Theme678
internal fun PlayerActivity.showV678CustomAutoTheme678Toggle() {
    val current = BiliClient.prefs.v678customAutoTheme678
    BiliClient.prefs.v678customAutoTheme678 = !current
    AppToast.show(this, "Custom Auto Theme678: ${if (!current) "ON" else "OFF"}")
}

// v678: Cycle Auto Repeat678
internal fun PlayerActivity.showV678CycleAutoRepeat678Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v678cycleAutoRepeat678).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat678",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v678cycleAutoRepeat678 = value
        AppToast.show(this, "Cycle Auto Repeat678: $value")
    }
}

// v678: Data Auto Compress678
internal fun PlayerActivity.showV678DataAutoCompress678Toggle() {
    val current = BiliClient.prefs.v678dataAutoCompress678
    BiliClient.prefs.v678dataAutoCompress678 = !current
    AppToast.show(this, "Data Auto Compress678: ${if (!current) "ON" else "OFF"}")
}

// v678: Database Auto Index678
internal fun PlayerActivity.showV678DatabaseAutoIndex678Toggle() {
    val current = BiliClient.prefs.v678databaseAutoIndex678
    BiliClient.prefs.v678databaseAutoIndex678 = !current
    AppToast.show(this, "Database Auto Index678: ${if (!current) "ON" else "OFF"}")
}

// v678: Date Auto Format678
internal fun PlayerActivity.showV678DateAutoFormat678Toggle() {
    val current = BiliClient.prefs.v678dateAutoFormat678
    BiliClient.prefs.v678dateAutoFormat678 = !current
    AppToast.show(this, "Date Auto Format678: ${if (!current) "ON" else "OFF"}")
}

// v678: Debug Auto Verbose678
internal fun PlayerActivity.showV678DebugAutoVerbose678Toggle() {
    val current = BiliClient.prefs.v678debugAutoVerbose678
    BiliClient.prefs.v678debugAutoVerbose678 = !current
    AppToast.show(this, "Debug Auto Verbose678: ${if (!current) "ON" else "OFF"}")
}

// v678: Decay Auto Fadeout678
internal fun PlayerActivity.showV678DecayAutoFadeout678Toggle() {
    val current = BiliClient.prefs.v678decayAutoFadeout678
    BiliClient.prefs.v678decayAutoFadeout678 = !current
    AppToast.show(this, "Decay Auto Fadeout678: ${if (!current) "ON" else "OFF"}")
}

// v678: Decimal Auto Round678
internal fun PlayerActivity.showV678DecimalAutoRound678Toggle() {
    val current = BiliClient.prefs.v678decimalAutoRound678
    BiliClient.prefs.v678decimalAutoRound678 = !current
    AppToast.show(this, "Decimal Auto Round678: ${if (!current) "ON" else "OFF"}")
}

// v678: Decode Auto Codec678
internal fun PlayerActivity.showV678DecodeAutoCodec678Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v678decodeAutoCodec678).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec678",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v678decodeAutoCodec678 = value
        AppToast.show(this, "Decode Auto Codec678: $value")
    }
}

// v678: Default Auto Restore678
internal fun PlayerActivity.showV678DefaultAutoRestore678Toggle() {
    val current = BiliClient.prefs.v678defaultAutoRestore678
    BiliClient.prefs.v678defaultAutoRestore678 = !current
    AppToast.show(this, "Default Auto Restore678: ${if (!current) "ON" else "OFF"}")
}

// v678: Delay Auto Buffer678
internal fun PlayerActivity.showV678DelayAutoBuffer678Toggle() {
    val current = BiliClient.prefs.v678delayAutoBuffer678
    BiliClient.prefs.v678delayAutoBuffer678 = !current
    AppToast.show(this, "Delay Auto Buffer678: ${if (!current) "ON" else "OFF"}")
}

// v679: Cross Auto Fade679
internal fun PlayerActivity.showV679CrossAutoFade679Toggle() {
    val current = BiliClient.prefs.v679crossAutoFade679
    BiliClient.prefs.v679crossAutoFade679 = !current
    AppToast.show(this, "Cross Auto Fade679: ${if (!current) "ON" else "OFF"}")
}

// v679: Crypto Auto Hash679
internal fun PlayerActivity.showV679CryptoAutoHash679Toggle() {
    val current = BiliClient.prefs.v679cryptoAutoHash679
    BiliClient.prefs.v679cryptoAutoHash679 = !current
    AppToast.show(this, "Crypto Auto Hash679: ${if (!current) "ON" else "OFF"}")
}

// v679: Cursor Auto Hide679
internal fun PlayerActivity.showV679CursorAutoHide679Toggle() {
    val current = BiliClient.prefs.v679cursorAutoHide679
    BiliClient.prefs.v679cursorAutoHide679 = !current
    AppToast.show(this, "Cursor Auto Hide679: ${if (!current) "ON" else "OFF"}")
}

// v679: Curve Auto Smooth679
internal fun PlayerActivity.showV679CurveAutoSmooth679Toggle() {
    val current = BiliClient.prefs.v679curveAutoSmooth679
    BiliClient.prefs.v679curveAutoSmooth679 = !current
    AppToast.show(this, "Curve Auto Smooth679: ${if (!current) "ON" else "OFF"}")
}

// v679: Custom Auto Theme679
internal fun PlayerActivity.showV679CustomAutoTheme679Toggle() {
    val current = BiliClient.prefs.v679customAutoTheme679
    BiliClient.prefs.v679customAutoTheme679 = !current
    AppToast.show(this, "Custom Auto Theme679: ${if (!current) "ON" else "OFF"}")
}

// v679: Cycle Auto Repeat679
internal fun PlayerActivity.showV679CycleAutoRepeat679Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v679cycleAutoRepeat679).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat679",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v679cycleAutoRepeat679 = value
        AppToast.show(this, "Cycle Auto Repeat679: $value")
    }
}

// v679: Data Auto Compress679
internal fun PlayerActivity.showV679DataAutoCompress679Toggle() {
    val current = BiliClient.prefs.v679dataAutoCompress679
    BiliClient.prefs.v679dataAutoCompress679 = !current
    AppToast.show(this, "Data Auto Compress679: ${if (!current) "ON" else "OFF"}")
}

// v679: Database Auto Index679
internal fun PlayerActivity.showV679DatabaseAutoIndex679Toggle() {
    val current = BiliClient.prefs.v679databaseAutoIndex679
    BiliClient.prefs.v679databaseAutoIndex679 = !current
    AppToast.show(this, "Database Auto Index679: ${if (!current) "ON" else "OFF"}")
}

// v679: Date Auto Format679
internal fun PlayerActivity.showV679DateAutoFormat679Toggle() {
    val current = BiliClient.prefs.v679dateAutoFormat679
    BiliClient.prefs.v679dateAutoFormat679 = !current
    AppToast.show(this, "Date Auto Format679: ${if (!current) "ON" else "OFF"}")
}

// v679: Debug Auto Verbose679
internal fun PlayerActivity.showV679DebugAutoVerbose679Toggle() {
    val current = BiliClient.prefs.v679debugAutoVerbose679
    BiliClient.prefs.v679debugAutoVerbose679 = !current
    AppToast.show(this, "Debug Auto Verbose679: ${if (!current) "ON" else "OFF"}")
}

// v679: Decay Auto Fadeout679
internal fun PlayerActivity.showV679DecayAutoFadeout679Toggle() {
    val current = BiliClient.prefs.v679decayAutoFadeout679
    BiliClient.prefs.v679decayAutoFadeout679 = !current
    AppToast.show(this, "Decay Auto Fadeout679: ${if (!current) "ON" else "OFF"}")
}

// v679: Decimal Auto Round679
internal fun PlayerActivity.showV679DecimalAutoRound679Toggle() {
    val current = BiliClient.prefs.v679decimalAutoRound679
    BiliClient.prefs.v679decimalAutoRound679 = !current
    AppToast.show(this, "Decimal Auto Round679: ${if (!current) "ON" else "OFF"}")
}

// v679: Decode Auto Codec679
internal fun PlayerActivity.showV679DecodeAutoCodec679Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v679decodeAutoCodec679).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec679",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v679decodeAutoCodec679 = value
        AppToast.show(this, "Decode Auto Codec679: $value")
    }
}

// v679: Default Auto Restore679
internal fun PlayerActivity.showV679DefaultAutoRestore679Toggle() {
    val current = BiliClient.prefs.v679defaultAutoRestore679
    BiliClient.prefs.v679defaultAutoRestore679 = !current
    AppToast.show(this, "Default Auto Restore679: ${if (!current) "ON" else "OFF"}")
}

// v679: Delay Auto Buffer679
internal fun PlayerActivity.showV679DelayAutoBuffer679Toggle() {
    val current = BiliClient.prefs.v679delayAutoBuffer679
    BiliClient.prefs.v679delayAutoBuffer679 = !current
    AppToast.show(this, "Delay Auto Buffer679: ${if (!current) "ON" else "OFF"}")
}

// v680: Cross Auto Fade680
internal fun PlayerActivity.showV680CrossAutoFade680Toggle() {
    val current = BiliClient.prefs.v680crossAutoFade680
    BiliClient.prefs.v680crossAutoFade680 = !current
    AppToast.show(this, "Cross Auto Fade680: ${if (!current) "ON" else "OFF"}")
}

// v680: Crypto Auto Hash680
internal fun PlayerActivity.showV680CryptoAutoHash680Toggle() {
    val current = BiliClient.prefs.v680cryptoAutoHash680
    BiliClient.prefs.v680cryptoAutoHash680 = !current
    AppToast.show(this, "Crypto Auto Hash680: ${if (!current) "ON" else "OFF"}")
}

// v680: Cursor Auto Hide680
internal fun PlayerActivity.showV680CursorAutoHide680Toggle() {
    val current = BiliClient.prefs.v680cursorAutoHide680
    BiliClient.prefs.v680cursorAutoHide680 = !current
    AppToast.show(this, "Cursor Auto Hide680: ${if (!current) "ON" else "OFF"}")
}

// v680: Curve Auto Smooth680
internal fun PlayerActivity.showV680CurveAutoSmooth680Toggle() {
    val current = BiliClient.prefs.v680curveAutoSmooth680
    BiliClient.prefs.v680curveAutoSmooth680 = !current
    AppToast.show(this, "Curve Auto Smooth680: ${if (!current) "ON" else "OFF"}")
}

// v680: Custom Auto Theme680
internal fun PlayerActivity.showV680CustomAutoTheme680Toggle() {
    val current = BiliClient.prefs.v680customAutoTheme680
    BiliClient.prefs.v680customAutoTheme680 = !current
    AppToast.show(this, "Custom Auto Theme680: ${if (!current) "ON" else "OFF"}")
}

// v680: Cycle Auto Repeat680
internal fun PlayerActivity.showV680CycleAutoRepeat680Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v680cycleAutoRepeat680).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cycle Auto Repeat680",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v680cycleAutoRepeat680 = value
        AppToast.show(this, "Cycle Auto Repeat680: $value")
    }
}

// v680: Data Auto Compress680
internal fun PlayerActivity.showV680DataAutoCompress680Toggle() {
    val current = BiliClient.prefs.v680dataAutoCompress680
    BiliClient.prefs.v680dataAutoCompress680 = !current
    AppToast.show(this, "Data Auto Compress680: ${if (!current) "ON" else "OFF"}")
}

// v680: Database Auto Index680
internal fun PlayerActivity.showV680DatabaseAutoIndex680Toggle() {
    val current = BiliClient.prefs.v680databaseAutoIndex680
    BiliClient.prefs.v680databaseAutoIndex680 = !current
    AppToast.show(this, "Database Auto Index680: ${if (!current) "ON" else "OFF"}")
}

// v680: Date Auto Format680
internal fun PlayerActivity.showV680DateAutoFormat680Toggle() {
    val current = BiliClient.prefs.v680dateAutoFormat680
    BiliClient.prefs.v680dateAutoFormat680 = !current
    AppToast.show(this, "Date Auto Format680: ${if (!current) "ON" else "OFF"}")
}

// v680: Debug Auto Verbose680
internal fun PlayerActivity.showV680DebugAutoVerbose680Toggle() {
    val current = BiliClient.prefs.v680debugAutoVerbose680
    BiliClient.prefs.v680debugAutoVerbose680 = !current
    AppToast.show(this, "Debug Auto Verbose680: ${if (!current) "ON" else "OFF"}")
}

// v680: Decay Auto Fadeout680
internal fun PlayerActivity.showV680DecayAutoFadeout680Toggle() {
    val current = BiliClient.prefs.v680decayAutoFadeout680
    BiliClient.prefs.v680decayAutoFadeout680 = !current
    AppToast.show(this, "Decay Auto Fadeout680: ${if (!current) "ON" else "OFF"}")
}

// v680: Decimal Auto Round680
internal fun PlayerActivity.showV680DecimalAutoRound680Toggle() {
    val current = BiliClient.prefs.v680decimalAutoRound680
    BiliClient.prefs.v680decimalAutoRound680 = !current
    AppToast.show(this, "Decimal Auto Round680: ${if (!current) "ON" else "OFF"}")
}

// v680: Decode Auto Codec680
internal fun PlayerActivity.showV680DecodeAutoCodec680Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v680decodeAutoCodec680).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Decode Auto Codec680",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v680decodeAutoCodec680 = value
        AppToast.show(this, "Decode Auto Codec680: $value")
    }
}

// v680: Default Auto Restore680
internal fun PlayerActivity.showV680DefaultAutoRestore680Toggle() {
    val current = BiliClient.prefs.v680defaultAutoRestore680
    BiliClient.prefs.v680defaultAutoRestore680 = !current
    AppToast.show(this, "Default Auto Restore680: ${if (!current) "ON" else "OFF"}")
}

// v680: Delay Auto Buffer680
internal fun PlayerActivity.showV680DelayAutoBuffer680Toggle() {
    val current = BiliClient.prefs.v680delayAutoBuffer680
    BiliClient.prefs.v680delayAutoBuffer680 = !current
    AppToast.show(this, "Delay Auto Buffer680: ${if (!current) "ON" else "OFF"}")
}

// v681: Delete Auto Confirm681
internal fun PlayerActivity.showV681DeleteAutoConfirm681Toggle() {
    val current = BiliClient.prefs.v681deleteAutoConfirm681
    BiliClient.prefs.v681deleteAutoConfirm681 = !current
    AppToast.show(this, "Delete Auto Confirm681: ${if (!current) "ON" else "OFF"}")
}

// v681: Delta Auto Update681
internal fun PlayerActivity.showV681DeltaAutoUpdate681Toggle() {
    val current = BiliClient.prefs.v681deltaAutoUpdate681
    BiliClient.prefs.v681deltaAutoUpdate681 = !current
    AppToast.show(this, "Delta Auto Update681: ${if (!current) "ON" else "OFF"}")
}

// v681: Demo Auto Play681
internal fun PlayerActivity.showV681DemoAutoPlay681Toggle() {
    val current = BiliClient.prefs.v681demoAutoPlay681
    BiliClient.prefs.v681demoAutoPlay681 = !current
    AppToast.show(this, "Demo Auto Play681: ${if (!current) "ON" else "OFF"}")
}

// v681: Deploy Auto Push681
internal fun PlayerActivity.showV681DeployAutoPush681Toggle() {
    val current = BiliClient.prefs.v681deployAutoPush681
    BiliClient.prefs.v681deployAutoPush681 = !current
    AppToast.show(this, "Deploy Auto Push681: ${if (!current) "ON" else "OFF"}")
}

// v681: Depth Auto Map681
internal fun PlayerActivity.showV681DepthAutoMap681Toggle() {
    val current = BiliClient.prefs.v681depthAutoMap681
    BiliClient.prefs.v681depthAutoMap681 = !current
    AppToast.show(this, "Depth Auto Map681: ${if (!current) "ON" else "OFF"}")
}

// v681: Derive Auto Calc681
internal fun PlayerActivity.showV681DeriveAutoCalc681Toggle() {
    val current = BiliClient.prefs.v681deriveAutoCalc681
    BiliClient.prefs.v681deriveAutoCalc681 = !current
    AppToast.show(this, "Derive Auto Calc681: ${if (!current) "ON" else "OFF"}")
}

// v681: Design Auto Token681
internal fun PlayerActivity.showV681DesignAutoToken681Toggle() {
    val current = BiliClient.prefs.v681designAutoToken681
    BiliClient.prefs.v681designAutoToken681 = !current
    AppToast.show(this, "Design Auto Token681: ${if (!current) "ON" else "OFF"}")
}

// v681: Desktop Auto Mode681
internal fun PlayerActivity.showV681DesktopAutoMode681Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v681desktopAutoMode681).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode681",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v681desktopAutoMode681 = value
        AppToast.show(this, "Desktop Auto Mode681: $value")
    }
}

// v681: Detect Auto Motion681
internal fun PlayerActivity.showV681DetectAutoMotion681Toggle() {
    val current = BiliClient.prefs.v681detectAutoMotion681
    BiliClient.prefs.v681detectAutoMotion681 = !current
    AppToast.show(this, "Detect Auto Motion681: ${if (!current) "ON" else "OFF"}")
}

// v681: Device Auto Pair681
internal fun PlayerActivity.showV681DeviceAutoPair681Toggle() {
    val current = BiliClient.prefs.v681deviceAutoPair681
    BiliClient.prefs.v681deviceAutoPair681 = !current
    AppToast.show(this, "Device Auto Pair681: ${if (!current) "ON" else "OFF"}")
}

// v681: Dialog Auto Theme681
internal fun PlayerActivity.showV681DialogAutoTheme681Toggle() {
    val current = BiliClient.prefs.v681dialogAutoTheme681
    BiliClient.prefs.v681dialogAutoTheme681 = !current
    AppToast.show(this, "Dialog Auto Theme681: ${if (!current) "ON" else "OFF"}")
}

// v681: Diff Auto Highlight681
internal fun PlayerActivity.showV681DiffAutoHighlight681Toggle() {
    val current = BiliClient.prefs.v681diffAutoHighlight681
    BiliClient.prefs.v681diffAutoHighlight681 = !current
    AppToast.show(this, "Diff Auto Highlight681: ${if (!current) "ON" else "OFF"}")
}

// v681: Digest Auto Check681
internal fun PlayerActivity.showV681DigestAutoCheck681Toggle() {
    val current = BiliClient.prefs.v681digestAutoCheck681
    BiliClient.prefs.v681digestAutoCheck681 = !current
    AppToast.show(this, "Digest Auto Check681: ${if (!current) "ON" else "OFF"}")
}

// v681: Digital Auto Sign681
internal fun PlayerActivity.showV681DigitalAutoSign681Toggle() {
    val current = BiliClient.prefs.v681digitalAutoSign681
    BiliClient.prefs.v681digitalAutoSign681 = !current
    AppToast.show(this, "Digital Auto Sign681: ${if (!current) "ON" else "OFF"}")
}

// v681: Direct Auto Route681
internal fun PlayerActivity.showV681DirectAutoRoute681Toggle() {
    val current = BiliClient.prefs.v681directAutoRoute681
    BiliClient.prefs.v681directAutoRoute681 = !current
    AppToast.show(this, "Direct Auto Route681: ${if (!current) "ON" else "OFF"}")
}

// v682: Delete Auto Confirm682
internal fun PlayerActivity.showV682DeleteAutoConfirm682Toggle() {
    val current = BiliClient.prefs.v682deleteAutoConfirm682
    BiliClient.prefs.v682deleteAutoConfirm682 = !current
    AppToast.show(this, "Delete Auto Confirm682: ${if (!current) "ON" else "OFF"}")
}

// v682: Delta Auto Update682
internal fun PlayerActivity.showV682DeltaAutoUpdate682Toggle() {
    val current = BiliClient.prefs.v682deltaAutoUpdate682
    BiliClient.prefs.v682deltaAutoUpdate682 = !current
    AppToast.show(this, "Delta Auto Update682: ${if (!current) "ON" else "OFF"}")
}

// v682: Demo Auto Play682
internal fun PlayerActivity.showV682DemoAutoPlay682Toggle() {
    val current = BiliClient.prefs.v682demoAutoPlay682
    BiliClient.prefs.v682demoAutoPlay682 = !current
    AppToast.show(this, "Demo Auto Play682: ${if (!current) "ON" else "OFF"}")
}

// v682: Deploy Auto Push682
internal fun PlayerActivity.showV682DeployAutoPush682Toggle() {
    val current = BiliClient.prefs.v682deployAutoPush682
    BiliClient.prefs.v682deployAutoPush682 = !current
    AppToast.show(this, "Deploy Auto Push682: ${if (!current) "ON" else "OFF"}")
}

// v682: Depth Auto Map682
internal fun PlayerActivity.showV682DepthAutoMap682Toggle() {
    val current = BiliClient.prefs.v682depthAutoMap682
    BiliClient.prefs.v682depthAutoMap682 = !current
    AppToast.show(this, "Depth Auto Map682: ${if (!current) "ON" else "OFF"}")
}

// v682: Derive Auto Calc682
internal fun PlayerActivity.showV682DeriveAutoCalc682Toggle() {
    val current = BiliClient.prefs.v682deriveAutoCalc682
    BiliClient.prefs.v682deriveAutoCalc682 = !current
    AppToast.show(this, "Derive Auto Calc682: ${if (!current) "ON" else "OFF"}")
}

// v682: Design Auto Token682
internal fun PlayerActivity.showV682DesignAutoToken682Toggle() {
    val current = BiliClient.prefs.v682designAutoToken682
    BiliClient.prefs.v682designAutoToken682 = !current
    AppToast.show(this, "Design Auto Token682: ${if (!current) "ON" else "OFF"}")
}

// v682: Desktop Auto Mode682
internal fun PlayerActivity.showV682DesktopAutoMode682Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v682desktopAutoMode682).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode682",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v682desktopAutoMode682 = value
        AppToast.show(this, "Desktop Auto Mode682: $value")
    }
}

// v682: Detect Auto Motion682
internal fun PlayerActivity.showV682DetectAutoMotion682Toggle() {
    val current = BiliClient.prefs.v682detectAutoMotion682
    BiliClient.prefs.v682detectAutoMotion682 = !current
    AppToast.show(this, "Detect Auto Motion682: ${if (!current) "ON" else "OFF"}")
}

// v682: Device Auto Pair682
internal fun PlayerActivity.showV682DeviceAutoPair682Toggle() {
    val current = BiliClient.prefs.v682deviceAutoPair682
    BiliClient.prefs.v682deviceAutoPair682 = !current
    AppToast.show(this, "Device Auto Pair682: ${if (!current) "ON" else "OFF"}")
}

// v682: Dialog Auto Theme682
internal fun PlayerActivity.showV682DialogAutoTheme682Toggle() {
    val current = BiliClient.prefs.v682dialogAutoTheme682
    BiliClient.prefs.v682dialogAutoTheme682 = !current
    AppToast.show(this, "Dialog Auto Theme682: ${if (!current) "ON" else "OFF"}")
}

// v682: Diff Auto Highlight682
internal fun PlayerActivity.showV682DiffAutoHighlight682Toggle() {
    val current = BiliClient.prefs.v682diffAutoHighlight682
    BiliClient.prefs.v682diffAutoHighlight682 = !current
    AppToast.show(this, "Diff Auto Highlight682: ${if (!current) "ON" else "OFF"}")
}

// v682: Digest Auto Check682
internal fun PlayerActivity.showV682DigestAutoCheck682Toggle() {
    val current = BiliClient.prefs.v682digestAutoCheck682
    BiliClient.prefs.v682digestAutoCheck682 = !current
    AppToast.show(this, "Digest Auto Check682: ${if (!current) "ON" else "OFF"}")
}

// v682: Digital Auto Sign682
internal fun PlayerActivity.showV682DigitalAutoSign682Toggle() {
    val current = BiliClient.prefs.v682digitalAutoSign682
    BiliClient.prefs.v682digitalAutoSign682 = !current
    AppToast.show(this, "Digital Auto Sign682: ${if (!current) "ON" else "OFF"}")
}

// v682: Direct Auto Route682
internal fun PlayerActivity.showV682DirectAutoRoute682Toggle() {
    val current = BiliClient.prefs.v682directAutoRoute682
    BiliClient.prefs.v682directAutoRoute682 = !current
    AppToast.show(this, "Direct Auto Route682: ${if (!current) "ON" else "OFF"}")
}

// v683: Delete Auto Confirm683
internal fun PlayerActivity.showV683DeleteAutoConfirm683Toggle() {
    val current = BiliClient.prefs.v683deleteAutoConfirm683
    BiliClient.prefs.v683deleteAutoConfirm683 = !current
    AppToast.show(this, "Delete Auto Confirm683: ${if (!current) "ON" else "OFF"}")
}

// v683: Delta Auto Update683
internal fun PlayerActivity.showV683DeltaAutoUpdate683Toggle() {
    val current = BiliClient.prefs.v683deltaAutoUpdate683
    BiliClient.prefs.v683deltaAutoUpdate683 = !current
    AppToast.show(this, "Delta Auto Update683: ${if (!current) "ON" else "OFF"}")
}

// v683: Demo Auto Play683
internal fun PlayerActivity.showV683DemoAutoPlay683Toggle() {
    val current = BiliClient.prefs.v683demoAutoPlay683
    BiliClient.prefs.v683demoAutoPlay683 = !current
    AppToast.show(this, "Demo Auto Play683: ${if (!current) "ON" else "OFF"}")
}

// v683: Deploy Auto Push683
internal fun PlayerActivity.showV683DeployAutoPush683Toggle() {
    val current = BiliClient.prefs.v683deployAutoPush683
    BiliClient.prefs.v683deployAutoPush683 = !current
    AppToast.show(this, "Deploy Auto Push683: ${if (!current) "ON" else "OFF"}")
}

// v683: Depth Auto Map683
internal fun PlayerActivity.showV683DepthAutoMap683Toggle() {
    val current = BiliClient.prefs.v683depthAutoMap683
    BiliClient.prefs.v683depthAutoMap683 = !current
    AppToast.show(this, "Depth Auto Map683: ${if (!current) "ON" else "OFF"}")
}

// v683: Derive Auto Calc683
internal fun PlayerActivity.showV683DeriveAutoCalc683Toggle() {
    val current = BiliClient.prefs.v683deriveAutoCalc683
    BiliClient.prefs.v683deriveAutoCalc683 = !current
    AppToast.show(this, "Derive Auto Calc683: ${if (!current) "ON" else "OFF"}")
}

// v683: Design Auto Token683
internal fun PlayerActivity.showV683DesignAutoToken683Toggle() {
    val current = BiliClient.prefs.v683designAutoToken683
    BiliClient.prefs.v683designAutoToken683 = !current
    AppToast.show(this, "Design Auto Token683: ${if (!current) "ON" else "OFF"}")
}

// v683: Desktop Auto Mode683
internal fun PlayerActivity.showV683DesktopAutoMode683Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v683desktopAutoMode683).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode683",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v683desktopAutoMode683 = value
        AppToast.show(this, "Desktop Auto Mode683: $value")
    }
}

// v683: Detect Auto Motion683
internal fun PlayerActivity.showV683DetectAutoMotion683Toggle() {
    val current = BiliClient.prefs.v683detectAutoMotion683
    BiliClient.prefs.v683detectAutoMotion683 = !current
    AppToast.show(this, "Detect Auto Motion683: ${if (!current) "ON" else "OFF"}")
}

// v683: Device Auto Pair683
internal fun PlayerActivity.showV683DeviceAutoPair683Toggle() {
    val current = BiliClient.prefs.v683deviceAutoPair683
    BiliClient.prefs.v683deviceAutoPair683 = !current
    AppToast.show(this, "Device Auto Pair683: ${if (!current) "ON" else "OFF"}")
}

// v683: Dialog Auto Theme683
internal fun PlayerActivity.showV683DialogAutoTheme683Toggle() {
    val current = BiliClient.prefs.v683dialogAutoTheme683
    BiliClient.prefs.v683dialogAutoTheme683 = !current
    AppToast.show(this, "Dialog Auto Theme683: ${if (!current) "ON" else "OFF"}")
}

// v683: Diff Auto Highlight683
internal fun PlayerActivity.showV683DiffAutoHighlight683Toggle() {
    val current = BiliClient.prefs.v683diffAutoHighlight683
    BiliClient.prefs.v683diffAutoHighlight683 = !current
    AppToast.show(this, "Diff Auto Highlight683: ${if (!current) "ON" else "OFF"}")
}

// v683: Digest Auto Check683
internal fun PlayerActivity.showV683DigestAutoCheck683Toggle() {
    val current = BiliClient.prefs.v683digestAutoCheck683
    BiliClient.prefs.v683digestAutoCheck683 = !current
    AppToast.show(this, "Digest Auto Check683: ${if (!current) "ON" else "OFF"}")
}

// v683: Digital Auto Sign683
internal fun PlayerActivity.showV683DigitalAutoSign683Toggle() {
    val current = BiliClient.prefs.v683digitalAutoSign683
    BiliClient.prefs.v683digitalAutoSign683 = !current
    AppToast.show(this, "Digital Auto Sign683: ${if (!current) "ON" else "OFF"}")
}

// v683: Direct Auto Route683
internal fun PlayerActivity.showV683DirectAutoRoute683Toggle() {
    val current = BiliClient.prefs.v683directAutoRoute683
    BiliClient.prefs.v683directAutoRoute683 = !current
    AppToast.show(this, "Direct Auto Route683: ${if (!current) "ON" else "OFF"}")
}

// v684: Delete Auto Confirm684
internal fun PlayerActivity.showV684DeleteAutoConfirm684Toggle() {
    val current = BiliClient.prefs.v684deleteAutoConfirm684
    BiliClient.prefs.v684deleteAutoConfirm684 = !current
    AppToast.show(this, "Delete Auto Confirm684: ${if (!current) "ON" else "OFF"}")
}

// v684: Delta Auto Update684
internal fun PlayerActivity.showV684DeltaAutoUpdate684Toggle() {
    val current = BiliClient.prefs.v684deltaAutoUpdate684
    BiliClient.prefs.v684deltaAutoUpdate684 = !current
    AppToast.show(this, "Delta Auto Update684: ${if (!current) "ON" else "OFF"}")
}

// v684: Demo Auto Play684
internal fun PlayerActivity.showV684DemoAutoPlay684Toggle() {
    val current = BiliClient.prefs.v684demoAutoPlay684
    BiliClient.prefs.v684demoAutoPlay684 = !current
    AppToast.show(this, "Demo Auto Play684: ${if (!current) "ON" else "OFF"}")
}

// v684: Deploy Auto Push684
internal fun PlayerActivity.showV684DeployAutoPush684Toggle() {
    val current = BiliClient.prefs.v684deployAutoPush684
    BiliClient.prefs.v684deployAutoPush684 = !current
    AppToast.show(this, "Deploy Auto Push684: ${if (!current) "ON" else "OFF"}")
}

// v684: Depth Auto Map684
internal fun PlayerActivity.showV684DepthAutoMap684Toggle() {
    val current = BiliClient.prefs.v684depthAutoMap684
    BiliClient.prefs.v684depthAutoMap684 = !current
    AppToast.show(this, "Depth Auto Map684: ${if (!current) "ON" else "OFF"}")
}

// v684: Derive Auto Calc684
internal fun PlayerActivity.showV684DeriveAutoCalc684Toggle() {
    val current = BiliClient.prefs.v684deriveAutoCalc684
    BiliClient.prefs.v684deriveAutoCalc684 = !current
    AppToast.show(this, "Derive Auto Calc684: ${if (!current) "ON" else "OFF"}")
}

// v684: Design Auto Token684
internal fun PlayerActivity.showV684DesignAutoToken684Toggle() {
    val current = BiliClient.prefs.v684designAutoToken684
    BiliClient.prefs.v684designAutoToken684 = !current
    AppToast.show(this, "Design Auto Token684: ${if (!current) "ON" else "OFF"}")
}

// v684: Desktop Auto Mode684
internal fun PlayerActivity.showV684DesktopAutoMode684Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v684desktopAutoMode684).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode684",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v684desktopAutoMode684 = value
        AppToast.show(this, "Desktop Auto Mode684: $value")
    }
}

// v684: Detect Auto Motion684
internal fun PlayerActivity.showV684DetectAutoMotion684Toggle() {
    val current = BiliClient.prefs.v684detectAutoMotion684
    BiliClient.prefs.v684detectAutoMotion684 = !current
    AppToast.show(this, "Detect Auto Motion684: ${if (!current) "ON" else "OFF"}")
}

// v684: Device Auto Pair684
internal fun PlayerActivity.showV684DeviceAutoPair684Toggle() {
    val current = BiliClient.prefs.v684deviceAutoPair684
    BiliClient.prefs.v684deviceAutoPair684 = !current
    AppToast.show(this, "Device Auto Pair684: ${if (!current) "ON" else "OFF"}")
}

// v684: Dialog Auto Theme684
internal fun PlayerActivity.showV684DialogAutoTheme684Toggle() {
    val current = BiliClient.prefs.v684dialogAutoTheme684
    BiliClient.prefs.v684dialogAutoTheme684 = !current
    AppToast.show(this, "Dialog Auto Theme684: ${if (!current) "ON" else "OFF"}")
}

// v684: Diff Auto Highlight684
internal fun PlayerActivity.showV684DiffAutoHighlight684Toggle() {
    val current = BiliClient.prefs.v684diffAutoHighlight684
    BiliClient.prefs.v684diffAutoHighlight684 = !current
    AppToast.show(this, "Diff Auto Highlight684: ${if (!current) "ON" else "OFF"}")
}

// v684: Digest Auto Check684
internal fun PlayerActivity.showV684DigestAutoCheck684Toggle() {
    val current = BiliClient.prefs.v684digestAutoCheck684
    BiliClient.prefs.v684digestAutoCheck684 = !current
    AppToast.show(this, "Digest Auto Check684: ${if (!current) "ON" else "OFF"}")
}

// v684: Digital Auto Sign684
internal fun PlayerActivity.showV684DigitalAutoSign684Toggle() {
    val current = BiliClient.prefs.v684digitalAutoSign684
    BiliClient.prefs.v684digitalAutoSign684 = !current
    AppToast.show(this, "Digital Auto Sign684: ${if (!current) "ON" else "OFF"}")
}

// v684: Direct Auto Route684
internal fun PlayerActivity.showV684DirectAutoRoute684Toggle() {
    val current = BiliClient.prefs.v684directAutoRoute684
    BiliClient.prefs.v684directAutoRoute684 = !current
    AppToast.show(this, "Direct Auto Route684: ${if (!current) "ON" else "OFF"}")
}

// v685: Delete Auto Confirm685
internal fun PlayerActivity.showV685DeleteAutoConfirm685Toggle() {
    val current = BiliClient.prefs.v685deleteAutoConfirm685
    BiliClient.prefs.v685deleteAutoConfirm685 = !current
    AppToast.show(this, "Delete Auto Confirm685: ${if (!current) "ON" else "OFF"}")
}

// v685: Delta Auto Update685
internal fun PlayerActivity.showV685DeltaAutoUpdate685Toggle() {
    val current = BiliClient.prefs.v685deltaAutoUpdate685
    BiliClient.prefs.v685deltaAutoUpdate685 = !current
    AppToast.show(this, "Delta Auto Update685: ${if (!current) "ON" else "OFF"}")
}

// v685: Demo Auto Play685
internal fun PlayerActivity.showV685DemoAutoPlay685Toggle() {
    val current = BiliClient.prefs.v685demoAutoPlay685
    BiliClient.prefs.v685demoAutoPlay685 = !current
    AppToast.show(this, "Demo Auto Play685: ${if (!current) "ON" else "OFF"}")
}

// v685: Deploy Auto Push685
internal fun PlayerActivity.showV685DeployAutoPush685Toggle() {
    val current = BiliClient.prefs.v685deployAutoPush685
    BiliClient.prefs.v685deployAutoPush685 = !current
    AppToast.show(this, "Deploy Auto Push685: ${if (!current) "ON" else "OFF"}")
}

// v685: Depth Auto Map685
internal fun PlayerActivity.showV685DepthAutoMap685Toggle() {
    val current = BiliClient.prefs.v685depthAutoMap685
    BiliClient.prefs.v685depthAutoMap685 = !current
    AppToast.show(this, "Depth Auto Map685: ${if (!current) "ON" else "OFF"}")
}

// v685: Derive Auto Calc685
internal fun PlayerActivity.showV685DeriveAutoCalc685Toggle() {
    val current = BiliClient.prefs.v685deriveAutoCalc685
    BiliClient.prefs.v685deriveAutoCalc685 = !current
    AppToast.show(this, "Derive Auto Calc685: ${if (!current) "ON" else "OFF"}")
}

// v685: Design Auto Token685
internal fun PlayerActivity.showV685DesignAutoToken685Toggle() {
    val current = BiliClient.prefs.v685designAutoToken685
    BiliClient.prefs.v685designAutoToken685 = !current
    AppToast.show(this, "Design Auto Token685: ${if (!current) "ON" else "OFF"}")
}

// v685: Desktop Auto Mode685
internal fun PlayerActivity.showV685DesktopAutoMode685Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v685desktopAutoMode685).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode685",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v685desktopAutoMode685 = value
        AppToast.show(this, "Desktop Auto Mode685: $value")
    }
}

// v685: Detect Auto Motion685
internal fun PlayerActivity.showV685DetectAutoMotion685Toggle() {
    val current = BiliClient.prefs.v685detectAutoMotion685
    BiliClient.prefs.v685detectAutoMotion685 = !current
    AppToast.show(this, "Detect Auto Motion685: ${if (!current) "ON" else "OFF"}")
}

// v685: Device Auto Pair685
internal fun PlayerActivity.showV685DeviceAutoPair685Toggle() {
    val current = BiliClient.prefs.v685deviceAutoPair685
    BiliClient.prefs.v685deviceAutoPair685 = !current
    AppToast.show(this, "Device Auto Pair685: ${if (!current) "ON" else "OFF"}")
}

// v685: Dialog Auto Theme685
internal fun PlayerActivity.showV685DialogAutoTheme685Toggle() {
    val current = BiliClient.prefs.v685dialogAutoTheme685
    BiliClient.prefs.v685dialogAutoTheme685 = !current
    AppToast.show(this, "Dialog Auto Theme685: ${if (!current) "ON" else "OFF"}")
}

// v685: Diff Auto Highlight685
internal fun PlayerActivity.showV685DiffAutoHighlight685Toggle() {
    val current = BiliClient.prefs.v685diffAutoHighlight685
    BiliClient.prefs.v685diffAutoHighlight685 = !current
    AppToast.show(this, "Diff Auto Highlight685: ${if (!current) "ON" else "OFF"}")
}

// v685: Digest Auto Check685
internal fun PlayerActivity.showV685DigestAutoCheck685Toggle() {
    val current = BiliClient.prefs.v685digestAutoCheck685
    BiliClient.prefs.v685digestAutoCheck685 = !current
    AppToast.show(this, "Digest Auto Check685: ${if (!current) "ON" else "OFF"}")
}

// v685: Digital Auto Sign685
internal fun PlayerActivity.showV685DigitalAutoSign685Toggle() {
    val current = BiliClient.prefs.v685digitalAutoSign685
    BiliClient.prefs.v685digitalAutoSign685 = !current
    AppToast.show(this, "Digital Auto Sign685: ${if (!current) "ON" else "OFF"}")
}

// v685: Direct Auto Route685
internal fun PlayerActivity.showV685DirectAutoRoute685Toggle() {
    val current = BiliClient.prefs.v685directAutoRoute685
    BiliClient.prefs.v685directAutoRoute685 = !current
    AppToast.show(this, "Direct Auto Route685: ${if (!current) "ON" else "OFF"}")
}

// v686: Delete Auto Confirm686
internal fun PlayerActivity.showV686DeleteAutoConfirm686Toggle() {
    val current = BiliClient.prefs.v686deleteAutoConfirm686
    BiliClient.prefs.v686deleteAutoConfirm686 = !current
    AppToast.show(this, "Delete Auto Confirm686: ${if (!current) "ON" else "OFF"}")
}

// v686: Delta Auto Update686
internal fun PlayerActivity.showV686DeltaAutoUpdate686Toggle() {
    val current = BiliClient.prefs.v686deltaAutoUpdate686
    BiliClient.prefs.v686deltaAutoUpdate686 = !current
    AppToast.show(this, "Delta Auto Update686: ${if (!current) "ON" else "OFF"}")
}

// v686: Demo Auto Play686
internal fun PlayerActivity.showV686DemoAutoPlay686Toggle() {
    val current = BiliClient.prefs.v686demoAutoPlay686
    BiliClient.prefs.v686demoAutoPlay686 = !current
    AppToast.show(this, "Demo Auto Play686: ${if (!current) "ON" else "OFF"}")
}

// v686: Deploy Auto Push686
internal fun PlayerActivity.showV686DeployAutoPush686Toggle() {
    val current = BiliClient.prefs.v686deployAutoPush686
    BiliClient.prefs.v686deployAutoPush686 = !current
    AppToast.show(this, "Deploy Auto Push686: ${if (!current) "ON" else "OFF"}")
}

// v686: Depth Auto Map686
internal fun PlayerActivity.showV686DepthAutoMap686Toggle() {
    val current = BiliClient.prefs.v686depthAutoMap686
    BiliClient.prefs.v686depthAutoMap686 = !current
    AppToast.show(this, "Depth Auto Map686: ${if (!current) "ON" else "OFF"}")
}

// v686: Derive Auto Calc686
internal fun PlayerActivity.showV686DeriveAutoCalc686Toggle() {
    val current = BiliClient.prefs.v686deriveAutoCalc686
    BiliClient.prefs.v686deriveAutoCalc686 = !current
    AppToast.show(this, "Derive Auto Calc686: ${if (!current) "ON" else "OFF"}")
}

// v686: Design Auto Token686
internal fun PlayerActivity.showV686DesignAutoToken686Toggle() {
    val current = BiliClient.prefs.v686designAutoToken686
    BiliClient.prefs.v686designAutoToken686 = !current
    AppToast.show(this, "Design Auto Token686: ${if (!current) "ON" else "OFF"}")
}

// v686: Desktop Auto Mode686
internal fun PlayerActivity.showV686DesktopAutoMode686Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v686desktopAutoMode686).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode686",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v686desktopAutoMode686 = value
        AppToast.show(this, "Desktop Auto Mode686: $value")
    }
}

// v686: Detect Auto Motion686
internal fun PlayerActivity.showV686DetectAutoMotion686Toggle() {
    val current = BiliClient.prefs.v686detectAutoMotion686
    BiliClient.prefs.v686detectAutoMotion686 = !current
    AppToast.show(this, "Detect Auto Motion686: ${if (!current) "ON" else "OFF"}")
}

// v686: Device Auto Pair686
internal fun PlayerActivity.showV686DeviceAutoPair686Toggle() {
    val current = BiliClient.prefs.v686deviceAutoPair686
    BiliClient.prefs.v686deviceAutoPair686 = !current
    AppToast.show(this, "Device Auto Pair686: ${if (!current) "ON" else "OFF"}")
}

// v686: Dialog Auto Theme686
internal fun PlayerActivity.showV686DialogAutoTheme686Toggle() {
    val current = BiliClient.prefs.v686dialogAutoTheme686
    BiliClient.prefs.v686dialogAutoTheme686 = !current
    AppToast.show(this, "Dialog Auto Theme686: ${if (!current) "ON" else "OFF"}")
}

// v686: Diff Auto Highlight686
internal fun PlayerActivity.showV686DiffAutoHighlight686Toggle() {
    val current = BiliClient.prefs.v686diffAutoHighlight686
    BiliClient.prefs.v686diffAutoHighlight686 = !current
    AppToast.show(this, "Diff Auto Highlight686: ${if (!current) "ON" else "OFF"}")
}

// v686: Digest Auto Check686
internal fun PlayerActivity.showV686DigestAutoCheck686Toggle() {
    val current = BiliClient.prefs.v686digestAutoCheck686
    BiliClient.prefs.v686digestAutoCheck686 = !current
    AppToast.show(this, "Digest Auto Check686: ${if (!current) "ON" else "OFF"}")
}

// v686: Digital Auto Sign686
internal fun PlayerActivity.showV686DigitalAutoSign686Toggle() {
    val current = BiliClient.prefs.v686digitalAutoSign686
    BiliClient.prefs.v686digitalAutoSign686 = !current
    AppToast.show(this, "Digital Auto Sign686: ${if (!current) "ON" else "OFF"}")
}

// v686: Direct Auto Route686
internal fun PlayerActivity.showV686DirectAutoRoute686Toggle() {
    val current = BiliClient.prefs.v686directAutoRoute686
    BiliClient.prefs.v686directAutoRoute686 = !current
    AppToast.show(this, "Direct Auto Route686: ${if (!current) "ON" else "OFF"}")
}

// v687: Delete Auto Confirm687
internal fun PlayerActivity.showV687DeleteAutoConfirm687Toggle() {
    val current = BiliClient.prefs.v687deleteAutoConfirm687
    BiliClient.prefs.v687deleteAutoConfirm687 = !current
    AppToast.show(this, "Delete Auto Confirm687: ${if (!current) "ON" else "OFF"}")
}

// v687: Delta Auto Update687
internal fun PlayerActivity.showV687DeltaAutoUpdate687Toggle() {
    val current = BiliClient.prefs.v687deltaAutoUpdate687
    BiliClient.prefs.v687deltaAutoUpdate687 = !current
    AppToast.show(this, "Delta Auto Update687: ${if (!current) "ON" else "OFF"}")
}

// v687: Demo Auto Play687
internal fun PlayerActivity.showV687DemoAutoPlay687Toggle() {
    val current = BiliClient.prefs.v687demoAutoPlay687
    BiliClient.prefs.v687demoAutoPlay687 = !current
    AppToast.show(this, "Demo Auto Play687: ${if (!current) "ON" else "OFF"}")
}

// v687: Deploy Auto Push687
internal fun PlayerActivity.showV687DeployAutoPush687Toggle() {
    val current = BiliClient.prefs.v687deployAutoPush687
    BiliClient.prefs.v687deployAutoPush687 = !current
    AppToast.show(this, "Deploy Auto Push687: ${if (!current) "ON" else "OFF"}")
}

// v687: Depth Auto Map687
internal fun PlayerActivity.showV687DepthAutoMap687Toggle() {
    val current = BiliClient.prefs.v687depthAutoMap687
    BiliClient.prefs.v687depthAutoMap687 = !current
    AppToast.show(this, "Depth Auto Map687: ${if (!current) "ON" else "OFF"}")
}

// v687: Derive Auto Calc687
internal fun PlayerActivity.showV687DeriveAutoCalc687Toggle() {
    val current = BiliClient.prefs.v687deriveAutoCalc687
    BiliClient.prefs.v687deriveAutoCalc687 = !current
    AppToast.show(this, "Derive Auto Calc687: ${if (!current) "ON" else "OFF"}")
}

// v687: Design Auto Token687
internal fun PlayerActivity.showV687DesignAutoToken687Toggle() {
    val current = BiliClient.prefs.v687designAutoToken687
    BiliClient.prefs.v687designAutoToken687 = !current
    AppToast.show(this, "Design Auto Token687: ${if (!current) "ON" else "OFF"}")
}

// v687: Desktop Auto Mode687
internal fun PlayerActivity.showV687DesktopAutoMode687Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v687desktopAutoMode687).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode687",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v687desktopAutoMode687 = value
        AppToast.show(this, "Desktop Auto Mode687: $value")
    }
}

// v687: Detect Auto Motion687
internal fun PlayerActivity.showV687DetectAutoMotion687Toggle() {
    val current = BiliClient.prefs.v687detectAutoMotion687
    BiliClient.prefs.v687detectAutoMotion687 = !current
    AppToast.show(this, "Detect Auto Motion687: ${if (!current) "ON" else "OFF"}")
}

// v687: Device Auto Pair687
internal fun PlayerActivity.showV687DeviceAutoPair687Toggle() {
    val current = BiliClient.prefs.v687deviceAutoPair687
    BiliClient.prefs.v687deviceAutoPair687 = !current
    AppToast.show(this, "Device Auto Pair687: ${if (!current) "ON" else "OFF"}")
}

// v687: Dialog Auto Theme687
internal fun PlayerActivity.showV687DialogAutoTheme687Toggle() {
    val current = BiliClient.prefs.v687dialogAutoTheme687
    BiliClient.prefs.v687dialogAutoTheme687 = !current
    AppToast.show(this, "Dialog Auto Theme687: ${if (!current) "ON" else "OFF"}")
}

// v687: Diff Auto Highlight687
internal fun PlayerActivity.showV687DiffAutoHighlight687Toggle() {
    val current = BiliClient.prefs.v687diffAutoHighlight687
    BiliClient.prefs.v687diffAutoHighlight687 = !current
    AppToast.show(this, "Diff Auto Highlight687: ${if (!current) "ON" else "OFF"}")
}

// v687: Digest Auto Check687
internal fun PlayerActivity.showV687DigestAutoCheck687Toggle() {
    val current = BiliClient.prefs.v687digestAutoCheck687
    BiliClient.prefs.v687digestAutoCheck687 = !current
    AppToast.show(this, "Digest Auto Check687: ${if (!current) "ON" else "OFF"}")
}

// v687: Digital Auto Sign687
internal fun PlayerActivity.showV687DigitalAutoSign687Toggle() {
    val current = BiliClient.prefs.v687digitalAutoSign687
    BiliClient.prefs.v687digitalAutoSign687 = !current
    AppToast.show(this, "Digital Auto Sign687: ${if (!current) "ON" else "OFF"}")
}

// v687: Direct Auto Route687
internal fun PlayerActivity.showV687DirectAutoRoute687Toggle() {
    val current = BiliClient.prefs.v687directAutoRoute687
    BiliClient.prefs.v687directAutoRoute687 = !current
    AppToast.show(this, "Direct Auto Route687: ${if (!current) "ON" else "OFF"}")
}

// v688: Delete Auto Confirm688
internal fun PlayerActivity.showV688DeleteAutoConfirm688Toggle() {
    val current = BiliClient.prefs.v688deleteAutoConfirm688
    BiliClient.prefs.v688deleteAutoConfirm688 = !current
    AppToast.show(this, "Delete Auto Confirm688: ${if (!current) "ON" else "OFF"}")
}

// v688: Delta Auto Update688
internal fun PlayerActivity.showV688DeltaAutoUpdate688Toggle() {
    val current = BiliClient.prefs.v688deltaAutoUpdate688
    BiliClient.prefs.v688deltaAutoUpdate688 = !current
    AppToast.show(this, "Delta Auto Update688: ${if (!current) "ON" else "OFF"}")
}

// v688: Demo Auto Play688
internal fun PlayerActivity.showV688DemoAutoPlay688Toggle() {
    val current = BiliClient.prefs.v688demoAutoPlay688
    BiliClient.prefs.v688demoAutoPlay688 = !current
    AppToast.show(this, "Demo Auto Play688: ${if (!current) "ON" else "OFF"}")
}

// v688: Deploy Auto Push688
internal fun PlayerActivity.showV688DeployAutoPush688Toggle() {
    val current = BiliClient.prefs.v688deployAutoPush688
    BiliClient.prefs.v688deployAutoPush688 = !current
    AppToast.show(this, "Deploy Auto Push688: ${if (!current) "ON" else "OFF"}")
}

// v688: Depth Auto Map688
internal fun PlayerActivity.showV688DepthAutoMap688Toggle() {
    val current = BiliClient.prefs.v688depthAutoMap688
    BiliClient.prefs.v688depthAutoMap688 = !current
    AppToast.show(this, "Depth Auto Map688: ${if (!current) "ON" else "OFF"}")
}

// v688: Derive Auto Calc688
internal fun PlayerActivity.showV688DeriveAutoCalc688Toggle() {
    val current = BiliClient.prefs.v688deriveAutoCalc688
    BiliClient.prefs.v688deriveAutoCalc688 = !current
    AppToast.show(this, "Derive Auto Calc688: ${if (!current) "ON" else "OFF"}")
}

// v688: Design Auto Token688
internal fun PlayerActivity.showV688DesignAutoToken688Toggle() {
    val current = BiliClient.prefs.v688designAutoToken688
    BiliClient.prefs.v688designAutoToken688 = !current
    AppToast.show(this, "Design Auto Token688: ${if (!current) "ON" else "OFF"}")
}

// v688: Desktop Auto Mode688
internal fun PlayerActivity.showV688DesktopAutoMode688Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v688desktopAutoMode688).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode688",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v688desktopAutoMode688 = value
        AppToast.show(this, "Desktop Auto Mode688: $value")
    }
}

// v688: Detect Auto Motion688
internal fun PlayerActivity.showV688DetectAutoMotion688Toggle() {
    val current = BiliClient.prefs.v688detectAutoMotion688
    BiliClient.prefs.v688detectAutoMotion688 = !current
    AppToast.show(this, "Detect Auto Motion688: ${if (!current) "ON" else "OFF"}")
}

// v688: Device Auto Pair688
internal fun PlayerActivity.showV688DeviceAutoPair688Toggle() {
    val current = BiliClient.prefs.v688deviceAutoPair688
    BiliClient.prefs.v688deviceAutoPair688 = !current
    AppToast.show(this, "Device Auto Pair688: ${if (!current) "ON" else "OFF"}")
}

// v688: Dialog Auto Theme688
internal fun PlayerActivity.showV688DialogAutoTheme688Toggle() {
    val current = BiliClient.prefs.v688dialogAutoTheme688
    BiliClient.prefs.v688dialogAutoTheme688 = !current
    AppToast.show(this, "Dialog Auto Theme688: ${if (!current) "ON" else "OFF"}")
}

// v688: Diff Auto Highlight688
internal fun PlayerActivity.showV688DiffAutoHighlight688Toggle() {
    val current = BiliClient.prefs.v688diffAutoHighlight688
    BiliClient.prefs.v688diffAutoHighlight688 = !current
    AppToast.show(this, "Diff Auto Highlight688: ${if (!current) "ON" else "OFF"}")
}

// v688: Digest Auto Check688
internal fun PlayerActivity.showV688DigestAutoCheck688Toggle() {
    val current = BiliClient.prefs.v688digestAutoCheck688
    BiliClient.prefs.v688digestAutoCheck688 = !current
    AppToast.show(this, "Digest Auto Check688: ${if (!current) "ON" else "OFF"}")
}

// v688: Digital Auto Sign688
internal fun PlayerActivity.showV688DigitalAutoSign688Toggle() {
    val current = BiliClient.prefs.v688digitalAutoSign688
    BiliClient.prefs.v688digitalAutoSign688 = !current
    AppToast.show(this, "Digital Auto Sign688: ${if (!current) "ON" else "OFF"}")
}

// v688: Direct Auto Route688
internal fun PlayerActivity.showV688DirectAutoRoute688Toggle() {
    val current = BiliClient.prefs.v688directAutoRoute688
    BiliClient.prefs.v688directAutoRoute688 = !current
    AppToast.show(this, "Direct Auto Route688: ${if (!current) "ON" else "OFF"}")
}

// v689: Delete Auto Confirm689
internal fun PlayerActivity.showV689DeleteAutoConfirm689Toggle() {
    val current = BiliClient.prefs.v689deleteAutoConfirm689
    BiliClient.prefs.v689deleteAutoConfirm689 = !current
    AppToast.show(this, "Delete Auto Confirm689: ${if (!current) "ON" else "OFF"}")
}

// v689: Delta Auto Update689
internal fun PlayerActivity.showV689DeltaAutoUpdate689Toggle() {
    val current = BiliClient.prefs.v689deltaAutoUpdate689
    BiliClient.prefs.v689deltaAutoUpdate689 = !current
    AppToast.show(this, "Delta Auto Update689: ${if (!current) "ON" else "OFF"}")
}

// v689: Demo Auto Play689
internal fun PlayerActivity.showV689DemoAutoPlay689Toggle() {
    val current = BiliClient.prefs.v689demoAutoPlay689
    BiliClient.prefs.v689demoAutoPlay689 = !current
    AppToast.show(this, "Demo Auto Play689: ${if (!current) "ON" else "OFF"}")
}

// v689: Deploy Auto Push689
internal fun PlayerActivity.showV689DeployAutoPush689Toggle() {
    val current = BiliClient.prefs.v689deployAutoPush689
    BiliClient.prefs.v689deployAutoPush689 = !current
    AppToast.show(this, "Deploy Auto Push689: ${if (!current) "ON" else "OFF"}")
}

// v689: Depth Auto Map689
internal fun PlayerActivity.showV689DepthAutoMap689Toggle() {
    val current = BiliClient.prefs.v689depthAutoMap689
    BiliClient.prefs.v689depthAutoMap689 = !current
    AppToast.show(this, "Depth Auto Map689: ${if (!current) "ON" else "OFF"}")
}

// v689: Derive Auto Calc689
internal fun PlayerActivity.showV689DeriveAutoCalc689Toggle() {
    val current = BiliClient.prefs.v689deriveAutoCalc689
    BiliClient.prefs.v689deriveAutoCalc689 = !current
    AppToast.show(this, "Derive Auto Calc689: ${if (!current) "ON" else "OFF"}")
}

// v689: Design Auto Token689
internal fun PlayerActivity.showV689DesignAutoToken689Toggle() {
    val current = BiliClient.prefs.v689designAutoToken689
    BiliClient.prefs.v689designAutoToken689 = !current
    AppToast.show(this, "Design Auto Token689: ${if (!current) "ON" else "OFF"}")
}

// v689: Desktop Auto Mode689
internal fun PlayerActivity.showV689DesktopAutoMode689Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v689desktopAutoMode689).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Desktop Auto Mode689",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v689desktopAutoMode689 = value
        AppToast.show(this, "Desktop Auto Mode689: $value")
    }
}

// v689: Detect Auto Motion689
internal fun PlayerActivity.showV689DetectAutoMotion689Toggle() {
    val current = BiliClient.prefs.v689detectAutoMotion689
    BiliClient.prefs.v689detectAutoMotion689 = !current
    AppToast.show(this, "Detect Auto Motion689: ${if (!current) "ON" else "OFF"}")
}

// v689: Device Auto Pair689
internal fun PlayerActivity.showV689DeviceAutoPair689Toggle() {
    val current = BiliClient.prefs.v689deviceAutoPair689
    BiliClient.prefs.v689deviceAutoPair689 = !current
    AppToast.show(this, "Device Auto Pair689: ${if (!current) "ON" else "OFF"}")
}

// v689: Dialog Auto Theme689
internal fun PlayerActivity.showV689DialogAutoTheme689Toggle() {
    val current = BiliClient.prefs.v689dialogAutoTheme689
    BiliClient.prefs.v689dialogAutoTheme689 = !current
    AppToast.show(this, "Dialog Auto Theme689: ${if (!current) "ON" else "OFF"}")
}

// v689: Diff Auto Highlight689
internal fun PlayerActivity.showV689DiffAutoHighlight689Toggle() {
    val current = BiliClient.prefs.v689diffAutoHighlight689
    BiliClient.prefs.v689diffAutoHighlight689 = !current
    AppToast.show(this, "Diff Auto Highlight689: ${if (!current) "ON" else "OFF"}")
}

// v689: Digest Auto Check689
internal fun PlayerActivity.showV689DigestAutoCheck689Toggle() {
    val current = BiliClient.prefs.v689digestAutoCheck689
    BiliClient.prefs.v689digestAutoCheck689 = !current
    AppToast.show(this, "Digest Auto Check689: ${if (!current) "ON" else "OFF"}")
}
