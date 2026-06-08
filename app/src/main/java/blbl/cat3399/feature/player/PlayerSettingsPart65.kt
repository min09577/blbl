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

// v831: New Auto Instance831
internal fun PlayerActivity.showV831NewAutoInstance831Toggle() {
    val current = BiliClient.prefs.v831newAutoInstance831
    BiliClient.prefs.v831newAutoInstance831 = !current
    AppToast.show(this, "New Auto Instance831: ${if (!current) "ON" else "OFF"}")
}

// v831: Next Auto Play831
internal fun PlayerActivity.showV831NextAutoPlay831Toggle() {
    val current = BiliClient.prefs.v831nextAutoPlay831
    BiliClient.prefs.v831nextAutoPlay831 = !current
    AppToast.show(this, "Next Auto Play831: ${if (!current) "ON" else "OFF"}")
}

// v831: Node Auto Cluster831
internal fun PlayerActivity.showV831NodeAutoCluster831Toggle() {
    val current = BiliClient.prefs.v831nodeAutoCluster831
    BiliClient.prefs.v831nodeAutoCluster831 = !current
    AppToast.show(this, "Node Auto Cluster831: ${if (!current) "ON" else "OFF"}")
}

// v831: None Auto Fallback831
internal fun PlayerActivity.showV831NoneAutoFallback831Toggle() {
    val current = BiliClient.prefs.v831noneAutoFallback831
    BiliClient.prefs.v831noneAutoFallback831 = !current
    AppToast.show(this, "None Auto Fallback831: ${if (!current) "ON" else "OFF"}")
}

// v831: Normal Auto Distribute831
internal fun PlayerActivity.showV831NormalAutoDistribute831Toggle() {
    val current = BiliClient.prefs.v831normalAutoDistribute831
    BiliClient.prefs.v831normalAutoDistribute831 = !current
    AppToast.show(this, "Normal Auto Distribute831: ${if (!current) "ON" else "OFF"}")
}

// v831: Notify Auto Badge831
internal fun PlayerActivity.showV831NotifyAutoBadge831Toggle() {
    val current = BiliClient.prefs.v831notifyAutoBadge831
    BiliClient.prefs.v831notifyAutoBadge831 = !current
    AppToast.show(this, "Notify Auto Badge831: ${if (!current) "ON" else "OFF"}")
}

// v831: Null Auto Safety831
internal fun PlayerActivity.showV831NullAutoSafety831Toggle() {
    val current = BiliClient.prefs.v831nullAutoSafety831
    BiliClient.prefs.v831nullAutoSafety831 = !current
    AppToast.show(this, "Null Auto Safety831: ${if (!current) "ON" else "OFF"}")
}

// v831: Number Auto Format831
internal fun PlayerActivity.showV831NumberAutoFormat831Toggle() {
    val current = BiliClient.prefs.v831numberAutoFormat831
    BiliClient.prefs.v831numberAutoFormat831 = !current
    AppToast.show(this, "Number Auto Format831: ${if (!current) "ON" else "OFF"}")
}

// v831: Object Auto Pool831
internal fun PlayerActivity.showV831ObjectAutoPool831Toggle() {
    val current = BiliClient.prefs.v831objectAutoPool831
    BiliClient.prefs.v831objectAutoPool831 = !current
    AppToast.show(this, "Object Auto Pool831: ${if (!current) "ON" else "OFF"}")
}

// v831: Observe Auto Watch831
internal fun PlayerActivity.showV831ObserveAutoWatch831Toggle() {
    val current = BiliClient.prefs.v831observeAutoWatch831
    BiliClient.prefs.v831observeAutoWatch831 = !current
    AppToast.show(this, "Observe Auto Watch831: ${if (!current) "ON" else "OFF"}")
}

// v831: Offset Auto Calc831
internal fun PlayerActivity.showV831OffsetAutoCalc831Toggle() {
    val current = BiliClient.prefs.v831offsetAutoCalc831
    BiliClient.prefs.v831offsetAutoCalc831 = !current
    AppToast.show(this, "Offset Auto Calc831: ${if (!current) "ON" else "OFF"}")
}

// v831: Old Auto Migrate831
internal fun PlayerActivity.showV831OldAutoMigrate831Toggle() {
    val current = BiliClient.prefs.v831oldAutoMigrate831
    BiliClient.prefs.v831oldAutoMigrate831 = !current
    AppToast.show(this, "Old Auto Migrate831: ${if (!current) "ON" else "OFF"}")
}

// v831: Open Auto Link831
internal fun PlayerActivity.showV831OpenAutoLink831Toggle() {
    val current = BiliClient.prefs.v831openAutoLink831
    BiliClient.prefs.v831openAutoLink831 = !current
    AppToast.show(this, "Open Auto Link831: ${if (!current) "ON" else "OFF"}")
}

// v831: Operate Auto Batch831
internal fun PlayerActivity.showV831OperateAutoBatch831Toggle() {
    val current = BiliClient.prefs.v831operateAutoBatch831
    BiliClient.prefs.v831operateAutoBatch831 = !current
    AppToast.show(this, "Operate Auto Batch831: ${if (!current) "ON" else "OFF"}")
}

// v831: Option Auto Persist831
internal fun PlayerActivity.showV831OptionAutoPersist831Toggle() {
    val current = BiliClient.prefs.v831optionAutoPersist831
    BiliClient.prefs.v831optionAutoPersist831 = !current
    AppToast.show(this, "Option Auto Persist831: ${if (!current) "ON" else "OFF"}")
}

// v832: New Auto Instance832
internal fun PlayerActivity.showV832NewAutoInstance832Toggle() {
    val current = BiliClient.prefs.v832newAutoInstance832
    BiliClient.prefs.v832newAutoInstance832 = !current
    AppToast.show(this, "New Auto Instance832: ${if (!current) "ON" else "OFF"}")
}

// v832: Next Auto Play832
internal fun PlayerActivity.showV832NextAutoPlay832Toggle() {
    val current = BiliClient.prefs.v832nextAutoPlay832
    BiliClient.prefs.v832nextAutoPlay832 = !current
    AppToast.show(this, "Next Auto Play832: ${if (!current) "ON" else "OFF"}")
}

// v832: Node Auto Cluster832
internal fun PlayerActivity.showV832NodeAutoCluster832Toggle() {
    val current = BiliClient.prefs.v832nodeAutoCluster832
    BiliClient.prefs.v832nodeAutoCluster832 = !current
    AppToast.show(this, "Node Auto Cluster832: ${if (!current) "ON" else "OFF"}")
}

// v832: None Auto Fallback832
internal fun PlayerActivity.showV832NoneAutoFallback832Toggle() {
    val current = BiliClient.prefs.v832noneAutoFallback832
    BiliClient.prefs.v832noneAutoFallback832 = !current
    AppToast.show(this, "None Auto Fallback832: ${if (!current) "ON" else "OFF"}")
}

// v832: Normal Auto Distribute832
internal fun PlayerActivity.showV832NormalAutoDistribute832Toggle() {
    val current = BiliClient.prefs.v832normalAutoDistribute832
    BiliClient.prefs.v832normalAutoDistribute832 = !current
    AppToast.show(this, "Normal Auto Distribute832: ${if (!current) "ON" else "OFF"}")
}

// v832: Notify Auto Badge832
internal fun PlayerActivity.showV832NotifyAutoBadge832Toggle() {
    val current = BiliClient.prefs.v832notifyAutoBadge832
    BiliClient.prefs.v832notifyAutoBadge832 = !current
    AppToast.show(this, "Notify Auto Badge832: ${if (!current) "ON" else "OFF"}")
}

// v832: Null Auto Safety832
internal fun PlayerActivity.showV832NullAutoSafety832Toggle() {
    val current = BiliClient.prefs.v832nullAutoSafety832
    BiliClient.prefs.v832nullAutoSafety832 = !current
    AppToast.show(this, "Null Auto Safety832: ${if (!current) "ON" else "OFF"}")
}

// v832: Number Auto Format832
internal fun PlayerActivity.showV832NumberAutoFormat832Toggle() {
    val current = BiliClient.prefs.v832numberAutoFormat832
    BiliClient.prefs.v832numberAutoFormat832 = !current
    AppToast.show(this, "Number Auto Format832: ${if (!current) "ON" else "OFF"}")
}

// v832: Object Auto Pool832
internal fun PlayerActivity.showV832ObjectAutoPool832Toggle() {
    val current = BiliClient.prefs.v832objectAutoPool832
    BiliClient.prefs.v832objectAutoPool832 = !current
    AppToast.show(this, "Object Auto Pool832: ${if (!current) "ON" else "OFF"}")
}

// v832: Observe Auto Watch832
internal fun PlayerActivity.showV832ObserveAutoWatch832Toggle() {
    val current = BiliClient.prefs.v832observeAutoWatch832
    BiliClient.prefs.v832observeAutoWatch832 = !current
    AppToast.show(this, "Observe Auto Watch832: ${if (!current) "ON" else "OFF"}")
}

// v832: Offset Auto Calc832
internal fun PlayerActivity.showV832OffsetAutoCalc832Toggle() {
    val current = BiliClient.prefs.v832offsetAutoCalc832
    BiliClient.prefs.v832offsetAutoCalc832 = !current
    AppToast.show(this, "Offset Auto Calc832: ${if (!current) "ON" else "OFF"}")
}

// v832: Old Auto Migrate832
internal fun PlayerActivity.showV832OldAutoMigrate832Toggle() {
    val current = BiliClient.prefs.v832oldAutoMigrate832
    BiliClient.prefs.v832oldAutoMigrate832 = !current
    AppToast.show(this, "Old Auto Migrate832: ${if (!current) "ON" else "OFF"}")
}

// v832: Open Auto Link832
internal fun PlayerActivity.showV832OpenAutoLink832Toggle() {
    val current = BiliClient.prefs.v832openAutoLink832
    BiliClient.prefs.v832openAutoLink832 = !current
    AppToast.show(this, "Open Auto Link832: ${if (!current) "ON" else "OFF"}")
}

// v832: Operate Auto Batch832
internal fun PlayerActivity.showV832OperateAutoBatch832Toggle() {
    val current = BiliClient.prefs.v832operateAutoBatch832
    BiliClient.prefs.v832operateAutoBatch832 = !current
    AppToast.show(this, "Operate Auto Batch832: ${if (!current) "ON" else "OFF"}")
}

// v832: Option Auto Persist832
internal fun PlayerActivity.showV832OptionAutoPersist832Toggle() {
    val current = BiliClient.prefs.v832optionAutoPersist832
    BiliClient.prefs.v832optionAutoPersist832 = !current
    AppToast.show(this, "Option Auto Persist832: ${if (!current) "ON" else "OFF"}")
}

// v833: New Auto Instance833
internal fun PlayerActivity.showV833NewAutoInstance833Toggle() {
    val current = BiliClient.prefs.v833newAutoInstance833
    BiliClient.prefs.v833newAutoInstance833 = !current
    AppToast.show(this, "New Auto Instance833: ${if (!current) "ON" else "OFF"}")
}

// v833: Next Auto Play833
internal fun PlayerActivity.showV833NextAutoPlay833Toggle() {
    val current = BiliClient.prefs.v833nextAutoPlay833
    BiliClient.prefs.v833nextAutoPlay833 = !current
    AppToast.show(this, "Next Auto Play833: ${if (!current) "ON" else "OFF"}")
}

// v833: Node Auto Cluster833
internal fun PlayerActivity.showV833NodeAutoCluster833Toggle() {
    val current = BiliClient.prefs.v833nodeAutoCluster833
    BiliClient.prefs.v833nodeAutoCluster833 = !current
    AppToast.show(this, "Node Auto Cluster833: ${if (!current) "ON" else "OFF"}")
}

// v833: None Auto Fallback833
internal fun PlayerActivity.showV833NoneAutoFallback833Toggle() {
    val current = BiliClient.prefs.v833noneAutoFallback833
    BiliClient.prefs.v833noneAutoFallback833 = !current
    AppToast.show(this, "None Auto Fallback833: ${if (!current) "ON" else "OFF"}")
}

// v833: Normal Auto Distribute833
internal fun PlayerActivity.showV833NormalAutoDistribute833Toggle() {
    val current = BiliClient.prefs.v833normalAutoDistribute833
    BiliClient.prefs.v833normalAutoDistribute833 = !current
    AppToast.show(this, "Normal Auto Distribute833: ${if (!current) "ON" else "OFF"}")
}

// v833: Notify Auto Badge833
internal fun PlayerActivity.showV833NotifyAutoBadge833Toggle() {
    val current = BiliClient.prefs.v833notifyAutoBadge833
    BiliClient.prefs.v833notifyAutoBadge833 = !current
    AppToast.show(this, "Notify Auto Badge833: ${if (!current) "ON" else "OFF"}")
}

// v833: Null Auto Safety833
internal fun PlayerActivity.showV833NullAutoSafety833Toggle() {
    val current = BiliClient.prefs.v833nullAutoSafety833
    BiliClient.prefs.v833nullAutoSafety833 = !current
    AppToast.show(this, "Null Auto Safety833: ${if (!current) "ON" else "OFF"}")
}

// v833: Number Auto Format833
internal fun PlayerActivity.showV833NumberAutoFormat833Toggle() {
    val current = BiliClient.prefs.v833numberAutoFormat833
    BiliClient.prefs.v833numberAutoFormat833 = !current
    AppToast.show(this, "Number Auto Format833: ${if (!current) "ON" else "OFF"}")
}

// v833: Object Auto Pool833
internal fun PlayerActivity.showV833ObjectAutoPool833Toggle() {
    val current = BiliClient.prefs.v833objectAutoPool833
    BiliClient.prefs.v833objectAutoPool833 = !current
    AppToast.show(this, "Object Auto Pool833: ${if (!current) "ON" else "OFF"}")
}

// v833: Observe Auto Watch833
internal fun PlayerActivity.showV833ObserveAutoWatch833Toggle() {
    val current = BiliClient.prefs.v833observeAutoWatch833
    BiliClient.prefs.v833observeAutoWatch833 = !current
    AppToast.show(this, "Observe Auto Watch833: ${if (!current) "ON" else "OFF"}")
}

// v833: Offset Auto Calc833
internal fun PlayerActivity.showV833OffsetAutoCalc833Toggle() {
    val current = BiliClient.prefs.v833offsetAutoCalc833
    BiliClient.prefs.v833offsetAutoCalc833 = !current
    AppToast.show(this, "Offset Auto Calc833: ${if (!current) "ON" else "OFF"}")
}

// v833: Old Auto Migrate833
internal fun PlayerActivity.showV833OldAutoMigrate833Toggle() {
    val current = BiliClient.prefs.v833oldAutoMigrate833
    BiliClient.prefs.v833oldAutoMigrate833 = !current
    AppToast.show(this, "Old Auto Migrate833: ${if (!current) "ON" else "OFF"}")
}

// v833: Open Auto Link833
internal fun PlayerActivity.showV833OpenAutoLink833Toggle() {
    val current = BiliClient.prefs.v833openAutoLink833
    BiliClient.prefs.v833openAutoLink833 = !current
    AppToast.show(this, "Open Auto Link833: ${if (!current) "ON" else "OFF"}")
}

// v833: Operate Auto Batch833
internal fun PlayerActivity.showV833OperateAutoBatch833Toggle() {
    val current = BiliClient.prefs.v833operateAutoBatch833
    BiliClient.prefs.v833operateAutoBatch833 = !current
    AppToast.show(this, "Operate Auto Batch833: ${if (!current) "ON" else "OFF"}")
}

// v833: Option Auto Persist833
internal fun PlayerActivity.showV833OptionAutoPersist833Toggle() {
    val current = BiliClient.prefs.v833optionAutoPersist833
    BiliClient.prefs.v833optionAutoPersist833 = !current
    AppToast.show(this, "Option Auto Persist833: ${if (!current) "ON" else "OFF"}")
}

// v834: New Auto Instance834
internal fun PlayerActivity.showV834NewAutoInstance834Toggle() {
    val current = BiliClient.prefs.v834newAutoInstance834
    BiliClient.prefs.v834newAutoInstance834 = !current
    AppToast.show(this, "New Auto Instance834: ${if (!current) "ON" else "OFF"}")
}

// v834: Next Auto Play834
internal fun PlayerActivity.showV834NextAutoPlay834Toggle() {
    val current = BiliClient.prefs.v834nextAutoPlay834
    BiliClient.prefs.v834nextAutoPlay834 = !current
    AppToast.show(this, "Next Auto Play834: ${if (!current) "ON" else "OFF"}")
}

// v834: Node Auto Cluster834
internal fun PlayerActivity.showV834NodeAutoCluster834Toggle() {
    val current = BiliClient.prefs.v834nodeAutoCluster834
    BiliClient.prefs.v834nodeAutoCluster834 = !current
    AppToast.show(this, "Node Auto Cluster834: ${if (!current) "ON" else "OFF"}")
}

// v834: None Auto Fallback834
internal fun PlayerActivity.showV834NoneAutoFallback834Toggle() {
    val current = BiliClient.prefs.v834noneAutoFallback834
    BiliClient.prefs.v834noneAutoFallback834 = !current
    AppToast.show(this, "None Auto Fallback834: ${if (!current) "ON" else "OFF"}")
}

// v834: Normal Auto Distribute834
internal fun PlayerActivity.showV834NormalAutoDistribute834Toggle() {
    val current = BiliClient.prefs.v834normalAutoDistribute834
    BiliClient.prefs.v834normalAutoDistribute834 = !current
    AppToast.show(this, "Normal Auto Distribute834: ${if (!current) "ON" else "OFF"}")
}

// v834: Notify Auto Badge834
internal fun PlayerActivity.showV834NotifyAutoBadge834Toggle() {
    val current = BiliClient.prefs.v834notifyAutoBadge834
    BiliClient.prefs.v834notifyAutoBadge834 = !current
    AppToast.show(this, "Notify Auto Badge834: ${if (!current) "ON" else "OFF"}")
}

// v834: Null Auto Safety834
internal fun PlayerActivity.showV834NullAutoSafety834Toggle() {
    val current = BiliClient.prefs.v834nullAutoSafety834
    BiliClient.prefs.v834nullAutoSafety834 = !current
    AppToast.show(this, "Null Auto Safety834: ${if (!current) "ON" else "OFF"}")
}

// v834: Number Auto Format834
internal fun PlayerActivity.showV834NumberAutoFormat834Toggle() {
    val current = BiliClient.prefs.v834numberAutoFormat834
    BiliClient.prefs.v834numberAutoFormat834 = !current
    AppToast.show(this, "Number Auto Format834: ${if (!current) "ON" else "OFF"}")
}

// v834: Object Auto Pool834
internal fun PlayerActivity.showV834ObjectAutoPool834Toggle() {
    val current = BiliClient.prefs.v834objectAutoPool834
    BiliClient.prefs.v834objectAutoPool834 = !current
    AppToast.show(this, "Object Auto Pool834: ${if (!current) "ON" else "OFF"}")
}

// v834: Observe Auto Watch834
internal fun PlayerActivity.showV834ObserveAutoWatch834Toggle() {
    val current = BiliClient.prefs.v834observeAutoWatch834
    BiliClient.prefs.v834observeAutoWatch834 = !current
    AppToast.show(this, "Observe Auto Watch834: ${if (!current) "ON" else "OFF"}")
}

// v834: Offset Auto Calc834
internal fun PlayerActivity.showV834OffsetAutoCalc834Toggle() {
    val current = BiliClient.prefs.v834offsetAutoCalc834
    BiliClient.prefs.v834offsetAutoCalc834 = !current
    AppToast.show(this, "Offset Auto Calc834: ${if (!current) "ON" else "OFF"}")
}

// v834: Old Auto Migrate834
internal fun PlayerActivity.showV834OldAutoMigrate834Toggle() {
    val current = BiliClient.prefs.v834oldAutoMigrate834
    BiliClient.prefs.v834oldAutoMigrate834 = !current
    AppToast.show(this, "Old Auto Migrate834: ${if (!current) "ON" else "OFF"}")
}

// v834: Open Auto Link834
internal fun PlayerActivity.showV834OpenAutoLink834Toggle() {
    val current = BiliClient.prefs.v834openAutoLink834
    BiliClient.prefs.v834openAutoLink834 = !current
    AppToast.show(this, "Open Auto Link834: ${if (!current) "ON" else "OFF"}")
}

// v834: Operate Auto Batch834
internal fun PlayerActivity.showV834OperateAutoBatch834Toggle() {
    val current = BiliClient.prefs.v834operateAutoBatch834
    BiliClient.prefs.v834operateAutoBatch834 = !current
    AppToast.show(this, "Operate Auto Batch834: ${if (!current) "ON" else "OFF"}")
}

// v834: Option Auto Persist834
internal fun PlayerActivity.showV834OptionAutoPersist834Toggle() {
    val current = BiliClient.prefs.v834optionAutoPersist834
    BiliClient.prefs.v834optionAutoPersist834 = !current
    AppToast.show(this, "Option Auto Persist834: ${if (!current) "ON" else "OFF"}")
}

// v835: New Auto Instance835
internal fun PlayerActivity.showV835NewAutoInstance835Toggle() {
    val current = BiliClient.prefs.v835newAutoInstance835
    BiliClient.prefs.v835newAutoInstance835 = !current
    AppToast.show(this, "New Auto Instance835: ${if (!current) "ON" else "OFF"}")
}

// v835: Next Auto Play835
internal fun PlayerActivity.showV835NextAutoPlay835Toggle() {
    val current = BiliClient.prefs.v835nextAutoPlay835
    BiliClient.prefs.v835nextAutoPlay835 = !current
    AppToast.show(this, "Next Auto Play835: ${if (!current) "ON" else "OFF"}")
}

// v835: Node Auto Cluster835
internal fun PlayerActivity.showV835NodeAutoCluster835Toggle() {
    val current = BiliClient.prefs.v835nodeAutoCluster835
    BiliClient.prefs.v835nodeAutoCluster835 = !current
    AppToast.show(this, "Node Auto Cluster835: ${if (!current) "ON" else "OFF"}")
}

// v835: None Auto Fallback835
internal fun PlayerActivity.showV835NoneAutoFallback835Toggle() {
    val current = BiliClient.prefs.v835noneAutoFallback835
    BiliClient.prefs.v835noneAutoFallback835 = !current
    AppToast.show(this, "None Auto Fallback835: ${if (!current) "ON" else "OFF"}")
}

// v835: Normal Auto Distribute835
internal fun PlayerActivity.showV835NormalAutoDistribute835Toggle() {
    val current = BiliClient.prefs.v835normalAutoDistribute835
    BiliClient.prefs.v835normalAutoDistribute835 = !current
    AppToast.show(this, "Normal Auto Distribute835: ${if (!current) "ON" else "OFF"}")
}

// v835: Notify Auto Badge835
internal fun PlayerActivity.showV835NotifyAutoBadge835Toggle() {
    val current = BiliClient.prefs.v835notifyAutoBadge835
    BiliClient.prefs.v835notifyAutoBadge835 = !current
    AppToast.show(this, "Notify Auto Badge835: ${if (!current) "ON" else "OFF"}")
}

// v835: Null Auto Safety835
internal fun PlayerActivity.showV835NullAutoSafety835Toggle() {
    val current = BiliClient.prefs.v835nullAutoSafety835
    BiliClient.prefs.v835nullAutoSafety835 = !current
    AppToast.show(this, "Null Auto Safety835: ${if (!current) "ON" else "OFF"}")
}

// v835: Number Auto Format835
internal fun PlayerActivity.showV835NumberAutoFormat835Toggle() {
    val current = BiliClient.prefs.v835numberAutoFormat835
    BiliClient.prefs.v835numberAutoFormat835 = !current
    AppToast.show(this, "Number Auto Format835: ${if (!current) "ON" else "OFF"}")
}

// v835: Object Auto Pool835
internal fun PlayerActivity.showV835ObjectAutoPool835Toggle() {
    val current = BiliClient.prefs.v835objectAutoPool835
    BiliClient.prefs.v835objectAutoPool835 = !current
    AppToast.show(this, "Object Auto Pool835: ${if (!current) "ON" else "OFF"}")
}

// v835: Observe Auto Watch835
internal fun PlayerActivity.showV835ObserveAutoWatch835Toggle() {
    val current = BiliClient.prefs.v835observeAutoWatch835
    BiliClient.prefs.v835observeAutoWatch835 = !current
    AppToast.show(this, "Observe Auto Watch835: ${if (!current) "ON" else "OFF"}")
}

// v835: Offset Auto Calc835
internal fun PlayerActivity.showV835OffsetAutoCalc835Toggle() {
    val current = BiliClient.prefs.v835offsetAutoCalc835
    BiliClient.prefs.v835offsetAutoCalc835 = !current
    AppToast.show(this, "Offset Auto Calc835: ${if (!current) "ON" else "OFF"}")
}

// v835: Old Auto Migrate835
internal fun PlayerActivity.showV835OldAutoMigrate835Toggle() {
    val current = BiliClient.prefs.v835oldAutoMigrate835
    BiliClient.prefs.v835oldAutoMigrate835 = !current
    AppToast.show(this, "Old Auto Migrate835: ${if (!current) "ON" else "OFF"}")
}

// v835: Open Auto Link835
internal fun PlayerActivity.showV835OpenAutoLink835Toggle() {
    val current = BiliClient.prefs.v835openAutoLink835
    BiliClient.prefs.v835openAutoLink835 = !current
    AppToast.show(this, "Open Auto Link835: ${if (!current) "ON" else "OFF"}")
}

// v835: Operate Auto Batch835
internal fun PlayerActivity.showV835OperateAutoBatch835Toggle() {
    val current = BiliClient.prefs.v835operateAutoBatch835
    BiliClient.prefs.v835operateAutoBatch835 = !current
    AppToast.show(this, "Operate Auto Batch835: ${if (!current) "ON" else "OFF"}")
}

// v835: Option Auto Persist835
internal fun PlayerActivity.showV835OptionAutoPersist835Toggle() {
    val current = BiliClient.prefs.v835optionAutoPersist835
    BiliClient.prefs.v835optionAutoPersist835 = !current
    AppToast.show(this, "Option Auto Persist835: ${if (!current) "ON" else "OFF"}")
}

// v836: New Auto Instance836
internal fun PlayerActivity.showV836NewAutoInstance836Toggle() {
    val current = BiliClient.prefs.v836newAutoInstance836
    BiliClient.prefs.v836newAutoInstance836 = !current
    AppToast.show(this, "New Auto Instance836: ${if (!current) "ON" else "OFF"}")
}

// v836: Next Auto Play836
internal fun PlayerActivity.showV836NextAutoPlay836Toggle() {
    val current = BiliClient.prefs.v836nextAutoPlay836
    BiliClient.prefs.v836nextAutoPlay836 = !current
    AppToast.show(this, "Next Auto Play836: ${if (!current) "ON" else "OFF"}")
}

// v836: Node Auto Cluster836
internal fun PlayerActivity.showV836NodeAutoCluster836Toggle() {
    val current = BiliClient.prefs.v836nodeAutoCluster836
    BiliClient.prefs.v836nodeAutoCluster836 = !current
    AppToast.show(this, "Node Auto Cluster836: ${if (!current) "ON" else "OFF"}")
}

// v836: None Auto Fallback836
internal fun PlayerActivity.showV836NoneAutoFallback836Toggle() {
    val current = BiliClient.prefs.v836noneAutoFallback836
    BiliClient.prefs.v836noneAutoFallback836 = !current
    AppToast.show(this, "None Auto Fallback836: ${if (!current) "ON" else "OFF"}")
}

// v836: Normal Auto Distribute836
internal fun PlayerActivity.showV836NormalAutoDistribute836Toggle() {
    val current = BiliClient.prefs.v836normalAutoDistribute836
    BiliClient.prefs.v836normalAutoDistribute836 = !current
    AppToast.show(this, "Normal Auto Distribute836: ${if (!current) "ON" else "OFF"}")
}

// v836: Notify Auto Badge836
internal fun PlayerActivity.showV836NotifyAutoBadge836Toggle() {
    val current = BiliClient.prefs.v836notifyAutoBadge836
    BiliClient.prefs.v836notifyAutoBadge836 = !current
    AppToast.show(this, "Notify Auto Badge836: ${if (!current) "ON" else "OFF"}")
}

// v836: Null Auto Safety836
internal fun PlayerActivity.showV836NullAutoSafety836Toggle() {
    val current = BiliClient.prefs.v836nullAutoSafety836
    BiliClient.prefs.v836nullAutoSafety836 = !current
    AppToast.show(this, "Null Auto Safety836: ${if (!current) "ON" else "OFF"}")
}

// v836: Number Auto Format836
internal fun PlayerActivity.showV836NumberAutoFormat836Toggle() {
    val current = BiliClient.prefs.v836numberAutoFormat836
    BiliClient.prefs.v836numberAutoFormat836 = !current
    AppToast.show(this, "Number Auto Format836: ${if (!current) "ON" else "OFF"}")
}

// v836: Object Auto Pool836
internal fun PlayerActivity.showV836ObjectAutoPool836Toggle() {
    val current = BiliClient.prefs.v836objectAutoPool836
    BiliClient.prefs.v836objectAutoPool836 = !current
    AppToast.show(this, "Object Auto Pool836: ${if (!current) "ON" else "OFF"}")
}

// v836: Observe Auto Watch836
internal fun PlayerActivity.showV836ObserveAutoWatch836Toggle() {
    val current = BiliClient.prefs.v836observeAutoWatch836
    BiliClient.prefs.v836observeAutoWatch836 = !current
    AppToast.show(this, "Observe Auto Watch836: ${if (!current) "ON" else "OFF"}")
}

// v836: Offset Auto Calc836
internal fun PlayerActivity.showV836OffsetAutoCalc836Toggle() {
    val current = BiliClient.prefs.v836offsetAutoCalc836
    BiliClient.prefs.v836offsetAutoCalc836 = !current
    AppToast.show(this, "Offset Auto Calc836: ${if (!current) "ON" else "OFF"}")
}

// v836: Old Auto Migrate836
internal fun PlayerActivity.showV836OldAutoMigrate836Toggle() {
    val current = BiliClient.prefs.v836oldAutoMigrate836
    BiliClient.prefs.v836oldAutoMigrate836 = !current
    AppToast.show(this, "Old Auto Migrate836: ${if (!current) "ON" else "OFF"}")
}

// v836: Open Auto Link836
internal fun PlayerActivity.showV836OpenAutoLink836Toggle() {
    val current = BiliClient.prefs.v836openAutoLink836
    BiliClient.prefs.v836openAutoLink836 = !current
    AppToast.show(this, "Open Auto Link836: ${if (!current) "ON" else "OFF"}")
}

// v836: Operate Auto Batch836
internal fun PlayerActivity.showV836OperateAutoBatch836Toggle() {
    val current = BiliClient.prefs.v836operateAutoBatch836
    BiliClient.prefs.v836operateAutoBatch836 = !current
    AppToast.show(this, "Operate Auto Batch836: ${if (!current) "ON" else "OFF"}")
}

// v836: Option Auto Persist836
internal fun PlayerActivity.showV836OptionAutoPersist836Toggle() {
    val current = BiliClient.prefs.v836optionAutoPersist836
    BiliClient.prefs.v836optionAutoPersist836 = !current
    AppToast.show(this, "Option Auto Persist836: ${if (!current) "ON" else "OFF"}")
}

// v837: New Auto Instance837
internal fun PlayerActivity.showV837NewAutoInstance837Toggle() {
    val current = BiliClient.prefs.v837newAutoInstance837
    BiliClient.prefs.v837newAutoInstance837 = !current
    AppToast.show(this, "New Auto Instance837: ${if (!current) "ON" else "OFF"}")
}

// v837: Next Auto Play837
internal fun PlayerActivity.showV837NextAutoPlay837Toggle() {
    val current = BiliClient.prefs.v837nextAutoPlay837
    BiliClient.prefs.v837nextAutoPlay837 = !current
    AppToast.show(this, "Next Auto Play837: ${if (!current) "ON" else "OFF"}")
}

// v837: Node Auto Cluster837
internal fun PlayerActivity.showV837NodeAutoCluster837Toggle() {
    val current = BiliClient.prefs.v837nodeAutoCluster837
    BiliClient.prefs.v837nodeAutoCluster837 = !current
    AppToast.show(this, "Node Auto Cluster837: ${if (!current) "ON" else "OFF"}")
}

// v837: None Auto Fallback837
internal fun PlayerActivity.showV837NoneAutoFallback837Toggle() {
    val current = BiliClient.prefs.v837noneAutoFallback837
    BiliClient.prefs.v837noneAutoFallback837 = !current
    AppToast.show(this, "None Auto Fallback837: ${if (!current) "ON" else "OFF"}")
}

// v837: Normal Auto Distribute837
internal fun PlayerActivity.showV837NormalAutoDistribute837Toggle() {
    val current = BiliClient.prefs.v837normalAutoDistribute837
    BiliClient.prefs.v837normalAutoDistribute837 = !current
    AppToast.show(this, "Normal Auto Distribute837: ${if (!current) "ON" else "OFF"}")
}

// v837: Notify Auto Badge837
internal fun PlayerActivity.showV837NotifyAutoBadge837Toggle() {
    val current = BiliClient.prefs.v837notifyAutoBadge837
    BiliClient.prefs.v837notifyAutoBadge837 = !current
    AppToast.show(this, "Notify Auto Badge837: ${if (!current) "ON" else "OFF"}")
}

// v837: Null Auto Safety837
internal fun PlayerActivity.showV837NullAutoSafety837Toggle() {
    val current = BiliClient.prefs.v837nullAutoSafety837
    BiliClient.prefs.v837nullAutoSafety837 = !current
    AppToast.show(this, "Null Auto Safety837: ${if (!current) "ON" else "OFF"}")
}

// v837: Number Auto Format837
internal fun PlayerActivity.showV837NumberAutoFormat837Toggle() {
    val current = BiliClient.prefs.v837numberAutoFormat837
    BiliClient.prefs.v837numberAutoFormat837 = !current
    AppToast.show(this, "Number Auto Format837: ${if (!current) "ON" else "OFF"}")
}

// v837: Object Auto Pool837
internal fun PlayerActivity.showV837ObjectAutoPool837Toggle() {
    val current = BiliClient.prefs.v837objectAutoPool837
    BiliClient.prefs.v837objectAutoPool837 = !current
    AppToast.show(this, "Object Auto Pool837: ${if (!current) "ON" else "OFF"}")
}

// v837: Observe Auto Watch837
internal fun PlayerActivity.showV837ObserveAutoWatch837Toggle() {
    val current = BiliClient.prefs.v837observeAutoWatch837
    BiliClient.prefs.v837observeAutoWatch837 = !current
    AppToast.show(this, "Observe Auto Watch837: ${if (!current) "ON" else "OFF"}")
}

// v837: Offset Auto Calc837
internal fun PlayerActivity.showV837OffsetAutoCalc837Toggle() {
    val current = BiliClient.prefs.v837offsetAutoCalc837
    BiliClient.prefs.v837offsetAutoCalc837 = !current
    AppToast.show(this, "Offset Auto Calc837: ${if (!current) "ON" else "OFF"}")
}

// v837: Old Auto Migrate837
internal fun PlayerActivity.showV837OldAutoMigrate837Toggle() {
    val current = BiliClient.prefs.v837oldAutoMigrate837
    BiliClient.prefs.v837oldAutoMigrate837 = !current
    AppToast.show(this, "Old Auto Migrate837: ${if (!current) "ON" else "OFF"}")
}

// v837: Open Auto Link837
internal fun PlayerActivity.showV837OpenAutoLink837Toggle() {
    val current = BiliClient.prefs.v837openAutoLink837
    BiliClient.prefs.v837openAutoLink837 = !current
    AppToast.show(this, "Open Auto Link837: ${if (!current) "ON" else "OFF"}")
}

// v837: Operate Auto Batch837
internal fun PlayerActivity.showV837OperateAutoBatch837Toggle() {
    val current = BiliClient.prefs.v837operateAutoBatch837
    BiliClient.prefs.v837operateAutoBatch837 = !current
    AppToast.show(this, "Operate Auto Batch837: ${if (!current) "ON" else "OFF"}")
}

// v837: Option Auto Persist837
internal fun PlayerActivity.showV837OptionAutoPersist837Toggle() {
    val current = BiliClient.prefs.v837optionAutoPersist837
    BiliClient.prefs.v837optionAutoPersist837 = !current
    AppToast.show(this, "Option Auto Persist837: ${if (!current) "ON" else "OFF"}")
}

// v838: New Auto Instance838
internal fun PlayerActivity.showV838NewAutoInstance838Toggle() {
    val current = BiliClient.prefs.v838newAutoInstance838
    BiliClient.prefs.v838newAutoInstance838 = !current
    AppToast.show(this, "New Auto Instance838: ${if (!current) "ON" else "OFF"}")
}

// v838: Next Auto Play838
internal fun PlayerActivity.showV838NextAutoPlay838Toggle() {
    val current = BiliClient.prefs.v838nextAutoPlay838
    BiliClient.prefs.v838nextAutoPlay838 = !current
    AppToast.show(this, "Next Auto Play838: ${if (!current) "ON" else "OFF"}")
}

// v838: Node Auto Cluster838
internal fun PlayerActivity.showV838NodeAutoCluster838Toggle() {
    val current = BiliClient.prefs.v838nodeAutoCluster838
    BiliClient.prefs.v838nodeAutoCluster838 = !current
    AppToast.show(this, "Node Auto Cluster838: ${if (!current) "ON" else "OFF"}")
}

// v838: None Auto Fallback838
internal fun PlayerActivity.showV838NoneAutoFallback838Toggle() {
    val current = BiliClient.prefs.v838noneAutoFallback838
    BiliClient.prefs.v838noneAutoFallback838 = !current
    AppToast.show(this, "None Auto Fallback838: ${if (!current) "ON" else "OFF"}")
}

// v838: Normal Auto Distribute838
internal fun PlayerActivity.showV838NormalAutoDistribute838Toggle() {
    val current = BiliClient.prefs.v838normalAutoDistribute838
    BiliClient.prefs.v838normalAutoDistribute838 = !current
    AppToast.show(this, "Normal Auto Distribute838: ${if (!current) "ON" else "OFF"}")
}

// v838: Notify Auto Badge838
internal fun PlayerActivity.showV838NotifyAutoBadge838Toggle() {
    val current = BiliClient.prefs.v838notifyAutoBadge838
    BiliClient.prefs.v838notifyAutoBadge838 = !current
    AppToast.show(this, "Notify Auto Badge838: ${if (!current) "ON" else "OFF"}")
}

// v838: Null Auto Safety838
internal fun PlayerActivity.showV838NullAutoSafety838Toggle() {
    val current = BiliClient.prefs.v838nullAutoSafety838
    BiliClient.prefs.v838nullAutoSafety838 = !current
    AppToast.show(this, "Null Auto Safety838: ${if (!current) "ON" else "OFF"}")
}

// v838: Number Auto Format838
internal fun PlayerActivity.showV838NumberAutoFormat838Toggle() {
    val current = BiliClient.prefs.v838numberAutoFormat838
    BiliClient.prefs.v838numberAutoFormat838 = !current
    AppToast.show(this, "Number Auto Format838: ${if (!current) "ON" else "OFF"}")
}

// v838: Object Auto Pool838
internal fun PlayerActivity.showV838ObjectAutoPool838Toggle() {
    val current = BiliClient.prefs.v838objectAutoPool838
    BiliClient.prefs.v838objectAutoPool838 = !current
    AppToast.show(this, "Object Auto Pool838: ${if (!current) "ON" else "OFF"}")
}

// v838: Observe Auto Watch838
internal fun PlayerActivity.showV838ObserveAutoWatch838Toggle() {
    val current = BiliClient.prefs.v838observeAutoWatch838
    BiliClient.prefs.v838observeAutoWatch838 = !current
    AppToast.show(this, "Observe Auto Watch838: ${if (!current) "ON" else "OFF"}")
}

// v838: Offset Auto Calc838
internal fun PlayerActivity.showV838OffsetAutoCalc838Toggle() {
    val current = BiliClient.prefs.v838offsetAutoCalc838
    BiliClient.prefs.v838offsetAutoCalc838 = !current
    AppToast.show(this, "Offset Auto Calc838: ${if (!current) "ON" else "OFF"}")
}

// v838: Old Auto Migrate838
internal fun PlayerActivity.showV838OldAutoMigrate838Toggle() {
    val current = BiliClient.prefs.v838oldAutoMigrate838
    BiliClient.prefs.v838oldAutoMigrate838 = !current
    AppToast.show(this, "Old Auto Migrate838: ${if (!current) "ON" else "OFF"}")
}

// v838: Open Auto Link838
internal fun PlayerActivity.showV838OpenAutoLink838Toggle() {
    val current = BiliClient.prefs.v838openAutoLink838
    BiliClient.prefs.v838openAutoLink838 = !current
    AppToast.show(this, "Open Auto Link838: ${if (!current) "ON" else "OFF"}")
}

// v838: Operate Auto Batch838
internal fun PlayerActivity.showV838OperateAutoBatch838Toggle() {
    val current = BiliClient.prefs.v838operateAutoBatch838
    BiliClient.prefs.v838operateAutoBatch838 = !current
    AppToast.show(this, "Operate Auto Batch838: ${if (!current) "ON" else "OFF"}")
}

// v838: Option Auto Persist838
internal fun PlayerActivity.showV838OptionAutoPersist838Toggle() {
    val current = BiliClient.prefs.v838optionAutoPersist838
    BiliClient.prefs.v838optionAutoPersist838 = !current
    AppToast.show(this, "Option Auto Persist838: ${if (!current) "ON" else "OFF"}")
}

// v839: New Auto Instance839
internal fun PlayerActivity.showV839NewAutoInstance839Toggle() {
    val current = BiliClient.prefs.v839newAutoInstance839
    BiliClient.prefs.v839newAutoInstance839 = !current
    AppToast.show(this, "New Auto Instance839: ${if (!current) "ON" else "OFF"}")
}

// v839: Next Auto Play839
internal fun PlayerActivity.showV839NextAutoPlay839Toggle() {
    val current = BiliClient.prefs.v839nextAutoPlay839
    BiliClient.prefs.v839nextAutoPlay839 = !current
    AppToast.show(this, "Next Auto Play839: ${if (!current) "ON" else "OFF"}")
}

// v839: Node Auto Cluster839
internal fun PlayerActivity.showV839NodeAutoCluster839Toggle() {
    val current = BiliClient.prefs.v839nodeAutoCluster839
    BiliClient.prefs.v839nodeAutoCluster839 = !current
    AppToast.show(this, "Node Auto Cluster839: ${if (!current) "ON" else "OFF"}")
}

// v839: None Auto Fallback839
internal fun PlayerActivity.showV839NoneAutoFallback839Toggle() {
    val current = BiliClient.prefs.v839noneAutoFallback839
    BiliClient.prefs.v839noneAutoFallback839 = !current
    AppToast.show(this, "None Auto Fallback839: ${if (!current) "ON" else "OFF"}")
}

// v839: Normal Auto Distribute839
internal fun PlayerActivity.showV839NormalAutoDistribute839Toggle() {
    val current = BiliClient.prefs.v839normalAutoDistribute839
    BiliClient.prefs.v839normalAutoDistribute839 = !current
    AppToast.show(this, "Normal Auto Distribute839: ${if (!current) "ON" else "OFF"}")
}

// v839: Notify Auto Badge839
internal fun PlayerActivity.showV839NotifyAutoBadge839Toggle() {
    val current = BiliClient.prefs.v839notifyAutoBadge839
    BiliClient.prefs.v839notifyAutoBadge839 = !current
    AppToast.show(this, "Notify Auto Badge839: ${if (!current) "ON" else "OFF"}")
}

// v839: Null Auto Safety839
internal fun PlayerActivity.showV839NullAutoSafety839Toggle() {
    val current = BiliClient.prefs.v839nullAutoSafety839
    BiliClient.prefs.v839nullAutoSafety839 = !current
    AppToast.show(this, "Null Auto Safety839: ${if (!current) "ON" else "OFF"}")
}

// v839: Number Auto Format839
internal fun PlayerActivity.showV839NumberAutoFormat839Toggle() {
    val current = BiliClient.prefs.v839numberAutoFormat839
    BiliClient.prefs.v839numberAutoFormat839 = !current
    AppToast.show(this, "Number Auto Format839: ${if (!current) "ON" else "OFF"}")
}

// v839: Object Auto Pool839
internal fun PlayerActivity.showV839ObjectAutoPool839Toggle() {
    val current = BiliClient.prefs.v839objectAutoPool839
    BiliClient.prefs.v839objectAutoPool839 = !current
    AppToast.show(this, "Object Auto Pool839: ${if (!current) "ON" else "OFF"}")
}

// v839: Observe Auto Watch839
internal fun PlayerActivity.showV839ObserveAutoWatch839Toggle() {
    val current = BiliClient.prefs.v839observeAutoWatch839
    BiliClient.prefs.v839observeAutoWatch839 = !current
    AppToast.show(this, "Observe Auto Watch839: ${if (!current) "ON" else "OFF"}")
}

// v839: Offset Auto Calc839
internal fun PlayerActivity.showV839OffsetAutoCalc839Toggle() {
    val current = BiliClient.prefs.v839offsetAutoCalc839
    BiliClient.prefs.v839offsetAutoCalc839 = !current
    AppToast.show(this, "Offset Auto Calc839: ${if (!current) "ON" else "OFF"}")
}

// v839: Old Auto Migrate839
internal fun PlayerActivity.showV839OldAutoMigrate839Toggle() {
    val current = BiliClient.prefs.v839oldAutoMigrate839
    BiliClient.prefs.v839oldAutoMigrate839 = !current
    AppToast.show(this, "Old Auto Migrate839: ${if (!current) "ON" else "OFF"}")
}

// v839: Open Auto Link839
internal fun PlayerActivity.showV839OpenAutoLink839Toggle() {
    val current = BiliClient.prefs.v839openAutoLink839
    BiliClient.prefs.v839openAutoLink839 = !current
    AppToast.show(this, "Open Auto Link839: ${if (!current) "ON" else "OFF"}")
}

// v839: Operate Auto Batch839
internal fun PlayerActivity.showV839OperateAutoBatch839Toggle() {
    val current = BiliClient.prefs.v839operateAutoBatch839
    BiliClient.prefs.v839operateAutoBatch839 = !current
    AppToast.show(this, "Operate Auto Batch839: ${if (!current) "ON" else "OFF"}")
}

// v839: Option Auto Persist839
internal fun PlayerActivity.showV839OptionAutoPersist839Toggle() {
    val current = BiliClient.prefs.v839optionAutoPersist839
    BiliClient.prefs.v839optionAutoPersist839 = !current
    AppToast.show(this, "Option Auto Persist839: ${if (!current) "ON" else "OFF"}")
}

// v840: New Auto Instance840
internal fun PlayerActivity.showV840NewAutoInstance840Toggle() {
    val current = BiliClient.prefs.v840newAutoInstance840
    BiliClient.prefs.v840newAutoInstance840 = !current
    AppToast.show(this, "New Auto Instance840: ${if (!current) "ON" else "OFF"}")
}

// v840: Next Auto Play840
internal fun PlayerActivity.showV840NextAutoPlay840Toggle() {
    val current = BiliClient.prefs.v840nextAutoPlay840
    BiliClient.prefs.v840nextAutoPlay840 = !current
    AppToast.show(this, "Next Auto Play840: ${if (!current) "ON" else "OFF"}")
}

// v840: Node Auto Cluster840
internal fun PlayerActivity.showV840NodeAutoCluster840Toggle() {
    val current = BiliClient.prefs.v840nodeAutoCluster840
    BiliClient.prefs.v840nodeAutoCluster840 = !current
    AppToast.show(this, "Node Auto Cluster840: ${if (!current) "ON" else "OFF"}")
}

// v840: None Auto Fallback840
internal fun PlayerActivity.showV840NoneAutoFallback840Toggle() {
    val current = BiliClient.prefs.v840noneAutoFallback840
    BiliClient.prefs.v840noneAutoFallback840 = !current
    AppToast.show(this, "None Auto Fallback840: ${if (!current) "ON" else "OFF"}")
}

// v840: Normal Auto Distribute840
internal fun PlayerActivity.showV840NormalAutoDistribute840Toggle() {
    val current = BiliClient.prefs.v840normalAutoDistribute840
    BiliClient.prefs.v840normalAutoDistribute840 = !current
    AppToast.show(this, "Normal Auto Distribute840: ${if (!current) "ON" else "OFF"}")
}

// v840: Notify Auto Badge840
internal fun PlayerActivity.showV840NotifyAutoBadge840Toggle() {
    val current = BiliClient.prefs.v840notifyAutoBadge840
    BiliClient.prefs.v840notifyAutoBadge840 = !current
    AppToast.show(this, "Notify Auto Badge840: ${if (!current) "ON" else "OFF"}")
}

// v840: Null Auto Safety840
internal fun PlayerActivity.showV840NullAutoSafety840Toggle() {
    val current = BiliClient.prefs.v840nullAutoSafety840
    BiliClient.prefs.v840nullAutoSafety840 = !current
    AppToast.show(this, "Null Auto Safety840: ${if (!current) "ON" else "OFF"}")
}

// v840: Number Auto Format840
internal fun PlayerActivity.showV840NumberAutoFormat840Toggle() {
    val current = BiliClient.prefs.v840numberAutoFormat840
    BiliClient.prefs.v840numberAutoFormat840 = !current
    AppToast.show(this, "Number Auto Format840: ${if (!current) "ON" else "OFF"}")
}

// v840: Object Auto Pool840
internal fun PlayerActivity.showV840ObjectAutoPool840Toggle() {
    val current = BiliClient.prefs.v840objectAutoPool840
    BiliClient.prefs.v840objectAutoPool840 = !current
    AppToast.show(this, "Object Auto Pool840: ${if (!current) "ON" else "OFF"}")
}

// v840: Observe Auto Watch840
internal fun PlayerActivity.showV840ObserveAutoWatch840Toggle() {
    val current = BiliClient.prefs.v840observeAutoWatch840
    BiliClient.prefs.v840observeAutoWatch840 = !current
    AppToast.show(this, "Observe Auto Watch840: ${if (!current) "ON" else "OFF"}")
}

// v840: Offset Auto Calc840
internal fun PlayerActivity.showV840OffsetAutoCalc840Toggle() {
    val current = BiliClient.prefs.v840offsetAutoCalc840
    BiliClient.prefs.v840offsetAutoCalc840 = !current
    AppToast.show(this, "Offset Auto Calc840: ${if (!current) "ON" else "OFF"}")
}

// v840: Old Auto Migrate840
internal fun PlayerActivity.showV840OldAutoMigrate840Toggle() {
    val current = BiliClient.prefs.v840oldAutoMigrate840
    BiliClient.prefs.v840oldAutoMigrate840 = !current
    AppToast.show(this, "Old Auto Migrate840: ${if (!current) "ON" else "OFF"}")
}

// v840: Open Auto Link840
internal fun PlayerActivity.showV840OpenAutoLink840Toggle() {
    val current = BiliClient.prefs.v840openAutoLink840
    BiliClient.prefs.v840openAutoLink840 = !current
    AppToast.show(this, "Open Auto Link840: ${if (!current) "ON" else "OFF"}")
}

// v840: Operate Auto Batch840
internal fun PlayerActivity.showV840OperateAutoBatch840Toggle() {
    val current = BiliClient.prefs.v840operateAutoBatch840
    BiliClient.prefs.v840operateAutoBatch840 = !current
    AppToast.show(this, "Operate Auto Batch840: ${if (!current) "ON" else "OFF"}")
}

// v840: Option Auto Persist840
internal fun PlayerActivity.showV840OptionAutoPersist840Toggle() {
    val current = BiliClient.prefs.v840optionAutoPersist840
    BiliClient.prefs.v840optionAutoPersist840 = !current
    AppToast.show(this, "Option Auto Persist840: ${if (!current) "ON" else "OFF"}")
}

