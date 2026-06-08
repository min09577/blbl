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

internal fun PlayerActivity.showV535SampleAutoCollect535Toggle() {
    val current = BiliClient.prefs.v535sampleAutoCollect535
    BiliClient.prefs.v535sampleAutoCollect535 = !current
    AppToast.show(this, "Sample Auto Collect535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535SaveAutoBackup535Toggle() {
    val current = BiliClient.prefs.v535saveAutoBackup535
    BiliClient.prefs.v535saveAutoBackup535 = !current
    AppToast.show(this, "Save Auto Backup535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535ScaleAutoFit535Toggle() {
    val current = BiliClient.prefs.v535scaleAutoFit535
    BiliClient.prefs.v535scaleAutoFit535 = !current
    AppToast.show(this, "Scale Auto Fit535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535ScanAutoStart535Toggle() {
    val current = BiliClient.prefs.v535scanAutoStart535
    BiliClient.prefs.v535scanAutoStart535 = !current
    AppToast.show(this, "Scan Auto Start535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535ScheduleAutoRun535Toggle() {
    val current = BiliClient.prefs.v535scheduleAutoRun535
    BiliClient.prefs.v535scheduleAutoRun535 = !current
    AppToast.show(this, "Schedule Auto Run535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535ScoreAutoCalculate535Toggle() {
    val current = BiliClient.prefs.v535scoreAutoCalculate535
    BiliClient.prefs.v535scoreAutoCalculate535 = !current
    AppToast.show(this, "Score Auto Calculate535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535ScratchAutoRepair535Toggle() {
    val current = BiliClient.prefs.v535scratchAutoRepair535
    BiliClient.prefs.v535scratchAutoRepair535 = !current
    AppToast.show(this, "Scratch Auto Repair535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535ScriptAutoExecute535Toggle() {
    val current = BiliClient.prefs.v535scriptAutoExecute535
    BiliClient.prefs.v535scriptAutoExecute535 = !current
    AppToast.show(this, "Script Auto Execute535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535ScrollAutoSmooth535Toggle() {
    val current = BiliClient.prefs.v535scrollAutoSmooth535
    BiliClient.prefs.v535scrollAutoSmooth535 = !current
    AppToast.show(this, "Scroll Auto Smooth535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535SealAutoEncrypt535Toggle() {
    val current = BiliClient.prefs.v535sealAutoEncrypt535
    BiliClient.prefs.v535sealAutoEncrypt535 = !current
    AppToast.show(this, "Seal Auto Encrypt535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535SearchAutoComplete535Toggle() {
    val current = BiliClient.prefs.v535searchAutoComplete535
    BiliClient.prefs.v535searchAutoComplete535 = !current
    AppToast.show(this, "Search Auto Complete535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535SectionAutoGroup535Toggle() {
    val current = BiliClient.prefs.v535sectionAutoGroup535
    BiliClient.prefs.v535sectionAutoGroup535 = !current
    AppToast.show(this, "Section Auto Group535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535SeekAutoPrecision535Toggle() {
    val current = BiliClient.prefs.v535seekAutoPrecision535
    BiliClient.prefs.v535seekAutoPrecision535 = !current
    AppToast.show(this, "Seek Auto Precision535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV535SelectAutoMulti535Toggle() {
    val current = BiliClient.prefs.v535selectAutoMulti535
    BiliClient.prefs.v535selectAutoMulti535 = !current
    AppToast.show(this, "Select Auto Multi535: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536RunInBackground536Toggle() {
    val current = BiliClient.prefs.v536runInBackground536
    BiliClient.prefs.v536runInBackground536 = !current
    AppToast.show(this, "Run In Background536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536SampleAutoCollect536Toggle() {
    val current = BiliClient.prefs.v536sampleAutoCollect536
    BiliClient.prefs.v536sampleAutoCollect536 = !current
    AppToast.show(this, "Sample Auto Collect536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536SaveAutoBackup536Toggle() {
    val current = BiliClient.prefs.v536saveAutoBackup536
    BiliClient.prefs.v536saveAutoBackup536 = !current
    AppToast.show(this, "Save Auto Backup536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536ScaleAutoFit536Toggle() {
    val current = BiliClient.prefs.v536scaleAutoFit536
    BiliClient.prefs.v536scaleAutoFit536 = !current
    AppToast.show(this, "Scale Auto Fit536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536ScanAutoStart536Toggle() {
    val current = BiliClient.prefs.v536scanAutoStart536
    BiliClient.prefs.v536scanAutoStart536 = !current
    AppToast.show(this, "Scan Auto Start536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536ScheduleAutoRun536Toggle() {
    val current = BiliClient.prefs.v536scheduleAutoRun536
    BiliClient.prefs.v536scheduleAutoRun536 = !current
    AppToast.show(this, "Schedule Auto Run536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536ScoreAutoCalculate536Toggle() {
    val current = BiliClient.prefs.v536scoreAutoCalculate536
    BiliClient.prefs.v536scoreAutoCalculate536 = !current
    AppToast.show(this, "Score Auto Calculate536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536ScratchAutoRepair536Toggle() {
    val current = BiliClient.prefs.v536scratchAutoRepair536
    BiliClient.prefs.v536scratchAutoRepair536 = !current
    AppToast.show(this, "Scratch Auto Repair536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536ScriptAutoExecute536Toggle() {
    val current = BiliClient.prefs.v536scriptAutoExecute536
    BiliClient.prefs.v536scriptAutoExecute536 = !current
    AppToast.show(this, "Script Auto Execute536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536ScrollAutoSmooth536Toggle() {
    val current = BiliClient.prefs.v536scrollAutoSmooth536
    BiliClient.prefs.v536scrollAutoSmooth536 = !current
    AppToast.show(this, "Scroll Auto Smooth536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536SealAutoEncrypt536Toggle() {
    val current = BiliClient.prefs.v536sealAutoEncrypt536
    BiliClient.prefs.v536sealAutoEncrypt536 = !current
    AppToast.show(this, "Seal Auto Encrypt536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536SearchAutoComplete536Toggle() {
    val current = BiliClient.prefs.v536searchAutoComplete536
    BiliClient.prefs.v536searchAutoComplete536 = !current
    AppToast.show(this, "Search Auto Complete536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536SectionAutoGroup536Toggle() {
    val current = BiliClient.prefs.v536sectionAutoGroup536
    BiliClient.prefs.v536sectionAutoGroup536 = !current
    AppToast.show(this, "Section Auto Group536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536SeekAutoPrecision536Toggle() {
    val current = BiliClient.prefs.v536seekAutoPrecision536
    BiliClient.prefs.v536seekAutoPrecision536 = !current
    AppToast.show(this, "Seek Auto Precision536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV536SelectAutoMulti536Toggle() {
    val current = BiliClient.prefs.v536selectAutoMulti536
    BiliClient.prefs.v536selectAutoMulti536 = !current
    AppToast.show(this, "Select Auto Multi536: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537RunInBackground537Toggle() {
    val current = BiliClient.prefs.v537runInBackground537
    BiliClient.prefs.v537runInBackground537 = !current
    AppToast.show(this, "Run In Background537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537SampleAutoCollect537Toggle() {
    val current = BiliClient.prefs.v537sampleAutoCollect537
    BiliClient.prefs.v537sampleAutoCollect537 = !current
    AppToast.show(this, "Sample Auto Collect537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537SaveAutoBackup537Toggle() {
    val current = BiliClient.prefs.v537saveAutoBackup537
    BiliClient.prefs.v537saveAutoBackup537 = !current
    AppToast.show(this, "Save Auto Backup537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537ScaleAutoFit537Toggle() {
    val current = BiliClient.prefs.v537scaleAutoFit537
    BiliClient.prefs.v537scaleAutoFit537 = !current
    AppToast.show(this, "Scale Auto Fit537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537ScanAutoStart537Toggle() {
    val current = BiliClient.prefs.v537scanAutoStart537
    BiliClient.prefs.v537scanAutoStart537 = !current
    AppToast.show(this, "Scan Auto Start537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537ScheduleAutoRun537Toggle() {
    val current = BiliClient.prefs.v537scheduleAutoRun537
    BiliClient.prefs.v537scheduleAutoRun537 = !current
    AppToast.show(this, "Schedule Auto Run537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537ScoreAutoCalculate537Toggle() {
    val current = BiliClient.prefs.v537scoreAutoCalculate537
    BiliClient.prefs.v537scoreAutoCalculate537 = !current
    AppToast.show(this, "Score Auto Calculate537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537ScratchAutoRepair537Toggle() {
    val current = BiliClient.prefs.v537scratchAutoRepair537
    BiliClient.prefs.v537scratchAutoRepair537 = !current
    AppToast.show(this, "Scratch Auto Repair537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537ScriptAutoExecute537Toggle() {
    val current = BiliClient.prefs.v537scriptAutoExecute537
    BiliClient.prefs.v537scriptAutoExecute537 = !current
    AppToast.show(this, "Script Auto Execute537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537ScrollAutoSmooth537Toggle() {
    val current = BiliClient.prefs.v537scrollAutoSmooth537
    BiliClient.prefs.v537scrollAutoSmooth537 = !current
    AppToast.show(this, "Scroll Auto Smooth537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537SealAutoEncrypt537Toggle() {
    val current = BiliClient.prefs.v537sealAutoEncrypt537
    BiliClient.prefs.v537sealAutoEncrypt537 = !current
    AppToast.show(this, "Seal Auto Encrypt537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537SearchAutoComplete537Toggle() {
    val current = BiliClient.prefs.v537searchAutoComplete537
    BiliClient.prefs.v537searchAutoComplete537 = !current
    AppToast.show(this, "Search Auto Complete537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537SectionAutoGroup537Toggle() {
    val current = BiliClient.prefs.v537sectionAutoGroup537
    BiliClient.prefs.v537sectionAutoGroup537 = !current
    AppToast.show(this, "Section Auto Group537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537SeekAutoPrecision537Toggle() {
    val current = BiliClient.prefs.v537seekAutoPrecision537
    BiliClient.prefs.v537seekAutoPrecision537 = !current
    AppToast.show(this, "Seek Auto Precision537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV537SelectAutoMulti537Toggle() {
    val current = BiliClient.prefs.v537selectAutoMulti537
    BiliClient.prefs.v537selectAutoMulti537 = !current
    AppToast.show(this, "Select Auto Multi537: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538RunInBackground538Toggle() {
    val current = BiliClient.prefs.v538runInBackground538
    BiliClient.prefs.v538runInBackground538 = !current
    AppToast.show(this, "Run In Background538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538SampleAutoCollect538Toggle() {
    val current = BiliClient.prefs.v538sampleAutoCollect538
    BiliClient.prefs.v538sampleAutoCollect538 = !current
    AppToast.show(this, "Sample Auto Collect538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538SaveAutoBackup538Toggle() {
    val current = BiliClient.prefs.v538saveAutoBackup538
    BiliClient.prefs.v538saveAutoBackup538 = !current
    AppToast.show(this, "Save Auto Backup538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538ScaleAutoFit538Toggle() {
    val current = BiliClient.prefs.v538scaleAutoFit538
    BiliClient.prefs.v538scaleAutoFit538 = !current
    AppToast.show(this, "Scale Auto Fit538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538ScanAutoStart538Toggle() {
    val current = BiliClient.prefs.v538scanAutoStart538
    BiliClient.prefs.v538scanAutoStart538 = !current
    AppToast.show(this, "Scan Auto Start538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538ScheduleAutoRun538Toggle() {
    val current = BiliClient.prefs.v538scheduleAutoRun538
    BiliClient.prefs.v538scheduleAutoRun538 = !current
    AppToast.show(this, "Schedule Auto Run538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538ScoreAutoCalculate538Toggle() {
    val current = BiliClient.prefs.v538scoreAutoCalculate538
    BiliClient.prefs.v538scoreAutoCalculate538 = !current
    AppToast.show(this, "Score Auto Calculate538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538ScratchAutoRepair538Toggle() {
    val current = BiliClient.prefs.v538scratchAutoRepair538
    BiliClient.prefs.v538scratchAutoRepair538 = !current
    AppToast.show(this, "Scratch Auto Repair538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538ScriptAutoExecute538Toggle() {
    val current = BiliClient.prefs.v538scriptAutoExecute538
    BiliClient.prefs.v538scriptAutoExecute538 = !current
    AppToast.show(this, "Script Auto Execute538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538ScrollAutoSmooth538Toggle() {
    val current = BiliClient.prefs.v538scrollAutoSmooth538
    BiliClient.prefs.v538scrollAutoSmooth538 = !current
    AppToast.show(this, "Scroll Auto Smooth538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538SealAutoEncrypt538Toggle() {
    val current = BiliClient.prefs.v538sealAutoEncrypt538
    BiliClient.prefs.v538sealAutoEncrypt538 = !current
    AppToast.show(this, "Seal Auto Encrypt538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538SearchAutoComplete538Toggle() {
    val current = BiliClient.prefs.v538searchAutoComplete538
    BiliClient.prefs.v538searchAutoComplete538 = !current
    AppToast.show(this, "Search Auto Complete538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538SectionAutoGroup538Toggle() {
    val current = BiliClient.prefs.v538sectionAutoGroup538
    BiliClient.prefs.v538sectionAutoGroup538 = !current
    AppToast.show(this, "Section Auto Group538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538SeekAutoPrecision538Toggle() {
    val current = BiliClient.prefs.v538seekAutoPrecision538
    BiliClient.prefs.v538seekAutoPrecision538 = !current
    AppToast.show(this, "Seek Auto Precision538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV538SelectAutoMulti538Toggle() {
    val current = BiliClient.prefs.v538selectAutoMulti538
    BiliClient.prefs.v538selectAutoMulti538 = !current
    AppToast.show(this, "Select Auto Multi538: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539RunInBackground539Toggle() {
    val current = BiliClient.prefs.v539runInBackground539
    BiliClient.prefs.v539runInBackground539 = !current
    AppToast.show(this, "Run In Background539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539SampleAutoCollect539Toggle() {
    val current = BiliClient.prefs.v539sampleAutoCollect539
    BiliClient.prefs.v539sampleAutoCollect539 = !current
    AppToast.show(this, "Sample Auto Collect539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539SaveAutoBackup539Toggle() {
    val current = BiliClient.prefs.v539saveAutoBackup539
    BiliClient.prefs.v539saveAutoBackup539 = !current
    AppToast.show(this, "Save Auto Backup539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539ScaleAutoFit539Toggle() {
    val current = BiliClient.prefs.v539scaleAutoFit539
    BiliClient.prefs.v539scaleAutoFit539 = !current
    AppToast.show(this, "Scale Auto Fit539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539ScanAutoStart539Toggle() {
    val current = BiliClient.prefs.v539scanAutoStart539
    BiliClient.prefs.v539scanAutoStart539 = !current
    AppToast.show(this, "Scan Auto Start539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539ScheduleAutoRun539Toggle() {
    val current = BiliClient.prefs.v539scheduleAutoRun539
    BiliClient.prefs.v539scheduleAutoRun539 = !current
    AppToast.show(this, "Schedule Auto Run539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539ScoreAutoCalculate539Toggle() {
    val current = BiliClient.prefs.v539scoreAutoCalculate539
    BiliClient.prefs.v539scoreAutoCalculate539 = !current
    AppToast.show(this, "Score Auto Calculate539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539ScratchAutoRepair539Toggle() {
    val current = BiliClient.prefs.v539scratchAutoRepair539
    BiliClient.prefs.v539scratchAutoRepair539 = !current
    AppToast.show(this, "Scratch Auto Repair539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539ScriptAutoExecute539Toggle() {
    val current = BiliClient.prefs.v539scriptAutoExecute539
    BiliClient.prefs.v539scriptAutoExecute539 = !current
    AppToast.show(this, "Script Auto Execute539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539ScrollAutoSmooth539Toggle() {
    val current = BiliClient.prefs.v539scrollAutoSmooth539
    BiliClient.prefs.v539scrollAutoSmooth539 = !current
    AppToast.show(this, "Scroll Auto Smooth539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539SealAutoEncrypt539Toggle() {
    val current = BiliClient.prefs.v539sealAutoEncrypt539
    BiliClient.prefs.v539sealAutoEncrypt539 = !current
    AppToast.show(this, "Seal Auto Encrypt539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539SearchAutoComplete539Toggle() {
    val current = BiliClient.prefs.v539searchAutoComplete539
    BiliClient.prefs.v539searchAutoComplete539 = !current
    AppToast.show(this, "Search Auto Complete539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539SectionAutoGroup539Toggle() {
    val current = BiliClient.prefs.v539sectionAutoGroup539
    BiliClient.prefs.v539sectionAutoGroup539 = !current
    AppToast.show(this, "Section Auto Group539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539SeekAutoPrecision539Toggle() {
    val current = BiliClient.prefs.v539seekAutoPrecision539
    BiliClient.prefs.v539seekAutoPrecision539 = !current
    AppToast.show(this, "Seek Auto Precision539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV539SelectAutoMulti539Toggle() {
    val current = BiliClient.prefs.v539selectAutoMulti539
    BiliClient.prefs.v539selectAutoMulti539 = !current
    AppToast.show(this, "Select Auto Multi539: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540RunInBackground540Toggle() {
    val current = BiliClient.prefs.v540runInBackground540
    BiliClient.prefs.v540runInBackground540 = !current
    AppToast.show(this, "Run In Background540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540SampleAutoCollect540Toggle() {
    val current = BiliClient.prefs.v540sampleAutoCollect540
    BiliClient.prefs.v540sampleAutoCollect540 = !current
    AppToast.show(this, "Sample Auto Collect540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540SaveAutoBackup540Toggle() {
    val current = BiliClient.prefs.v540saveAutoBackup540
    BiliClient.prefs.v540saveAutoBackup540 = !current
    AppToast.show(this, "Save Auto Backup540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540ScaleAutoFit540Toggle() {
    val current = BiliClient.prefs.v540scaleAutoFit540
    BiliClient.prefs.v540scaleAutoFit540 = !current
    AppToast.show(this, "Scale Auto Fit540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540ScanAutoStart540Toggle() {
    val current = BiliClient.prefs.v540scanAutoStart540
    BiliClient.prefs.v540scanAutoStart540 = !current
    AppToast.show(this, "Scan Auto Start540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540ScheduleAutoRun540Toggle() {
    val current = BiliClient.prefs.v540scheduleAutoRun540
    BiliClient.prefs.v540scheduleAutoRun540 = !current
    AppToast.show(this, "Schedule Auto Run540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540ScoreAutoCalculate540Toggle() {
    val current = BiliClient.prefs.v540scoreAutoCalculate540
    BiliClient.prefs.v540scoreAutoCalculate540 = !current
    AppToast.show(this, "Score Auto Calculate540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540ScratchAutoRepair540Toggle() {
    val current = BiliClient.prefs.v540scratchAutoRepair540
    BiliClient.prefs.v540scratchAutoRepair540 = !current
    AppToast.show(this, "Scratch Auto Repair540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540ScriptAutoExecute540Toggle() {
    val current = BiliClient.prefs.v540scriptAutoExecute540
    BiliClient.prefs.v540scriptAutoExecute540 = !current
    AppToast.show(this, "Script Auto Execute540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540ScrollAutoSmooth540Toggle() {
    val current = BiliClient.prefs.v540scrollAutoSmooth540
    BiliClient.prefs.v540scrollAutoSmooth540 = !current
    AppToast.show(this, "Scroll Auto Smooth540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540SealAutoEncrypt540Toggle() {
    val current = BiliClient.prefs.v540sealAutoEncrypt540
    BiliClient.prefs.v540sealAutoEncrypt540 = !current
    AppToast.show(this, "Seal Auto Encrypt540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540SearchAutoComplete540Toggle() {
    val current = BiliClient.prefs.v540searchAutoComplete540
    BiliClient.prefs.v540searchAutoComplete540 = !current
    AppToast.show(this, "Search Auto Complete540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540SectionAutoGroup540Toggle() {
    val current = BiliClient.prefs.v540sectionAutoGroup540
    BiliClient.prefs.v540sectionAutoGroup540 = !current
    AppToast.show(this, "Section Auto Group540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540SeekAutoPrecision540Toggle() {
    val current = BiliClient.prefs.v540seekAutoPrecision540
    BiliClient.prefs.v540seekAutoPrecision540 = !current
    AppToast.show(this, "Seek Auto Precision540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV540SelectAutoMulti540Toggle() {
    val current = BiliClient.prefs.v540selectAutoMulti540
    BiliClient.prefs.v540selectAutoMulti540 = !current
    AppToast.show(this, "Select Auto Multi540: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541SendAutoConfirm541Toggle() {
    val current = BiliClient.prefs.v541sendAutoConfirm541
    BiliClient.prefs.v541sendAutoConfirm541 = !current
    AppToast.show(this, "Send Auto Confirm541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541SensorAutoCalibrate541Toggle() {
    val current = BiliClient.prefs.v541sensorAutoCalibrate541
    BiliClient.prefs.v541sensorAutoCalibrate541 = !current
    AppToast.show(this, "Sensor Auto Calibrate541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541ServerAutoSwitch541Toggle() {
    val current = BiliClient.prefs.v541serverAutoSwitch541
    BiliClient.prefs.v541serverAutoSwitch541 = !current
    AppToast.show(this, "Server Auto Switch541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541SessionAutoSave541Toggle() {
    val current = BiliClient.prefs.v541sessionAutoSave541
    BiliClient.prefs.v541sessionAutoSave541 = !current
    AppToast.show(this, "Session Auto Save541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541SetAutoDefault541Toggle() {
    val current = BiliClient.prefs.v541setAutoDefault541
    BiliClient.prefs.v541setAutoDefault541 = !current
    AppToast.show(this, "Set Auto Default541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541ShadowAutoDrop541Toggle() {
    val current = BiliClient.prefs.v541shadowAutoDrop541
    BiliClient.prefs.v541shadowAutoDrop541 = !current
    AppToast.show(this, "Shadow Auto Drop541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541ShapeAutoDetect541Toggle() {
    val current = BiliClient.prefs.v541shapeAutoDetect541
    BiliClient.prefs.v541shapeAutoDetect541 = !current
    AppToast.show(this, "Shape Auto Detect541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541SharpAutoAdjust541Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v541sharpAutoAdjust541).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust541",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v541sharpAutoAdjust541 = value
        AppToast.show(this, "Sharp Auto Adjust541: $value")
    }
}

internal fun PlayerActivity.showV541ShellAutoExecute541Toggle() {
    val current = BiliClient.prefs.v541shellAutoExecute541
    BiliClient.prefs.v541shellAutoExecute541 = !current
    AppToast.show(this, "Shell Auto Execute541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541ShiftAutoOffset541Toggle() {
    val current = BiliClient.prefs.v541shiftAutoOffset541
    BiliClient.prefs.v541shiftAutoOffset541 = !current
    AppToast.show(this, "Shift Auto Offset541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541ShortCutAutoBind541Toggle() {
    val current = BiliClient.prefs.v541shortCutAutoBind541
    BiliClient.prefs.v541shortCutAutoBind541 = !current
    AppToast.show(this, "Short Cut Auto Bind541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541ShowAutoToggle541Toggle() {
    val current = BiliClient.prefs.v541showAutoToggle541
    BiliClient.prefs.v541showAutoToggle541 = !current
    AppToast.show(this, "Show Auto Toggle541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541ShuffleAutoSeed541Toggle() {
    val current = BiliClient.prefs.v541shuffleAutoSeed541
    BiliClient.prefs.v541shuffleAutoSeed541 = !current
    AppToast.show(this, "Shuffle Auto Seed541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541SignalAutoBoost541Toggle() {
    val current = BiliClient.prefs.v541signalAutoBoost541
    BiliClient.prefs.v541signalAutoBoost541 = !current
    AppToast.show(this, "Signal Auto Boost541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV541SingleInstanceMode541Toggle() {
    val current = BiliClient.prefs.v541singleInstanceMode541
    BiliClient.prefs.v541singleInstanceMode541 = !current
    AppToast.show(this, "Single Instance Mode541: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542SendAutoConfirm542Toggle() {
    val current = BiliClient.prefs.v542sendAutoConfirm542
    BiliClient.prefs.v542sendAutoConfirm542 = !current
    AppToast.show(this, "Send Auto Confirm542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542SensorAutoCalibrate542Toggle() {
    val current = BiliClient.prefs.v542sensorAutoCalibrate542
    BiliClient.prefs.v542sensorAutoCalibrate542 = !current
    AppToast.show(this, "Sensor Auto Calibrate542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542ServerAutoSwitch542Toggle() {
    val current = BiliClient.prefs.v542serverAutoSwitch542
    BiliClient.prefs.v542serverAutoSwitch542 = !current
    AppToast.show(this, "Server Auto Switch542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542SessionAutoSave542Toggle() {
    val current = BiliClient.prefs.v542sessionAutoSave542
    BiliClient.prefs.v542sessionAutoSave542 = !current
    AppToast.show(this, "Session Auto Save542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542SetAutoDefault542Toggle() {
    val current = BiliClient.prefs.v542setAutoDefault542
    BiliClient.prefs.v542setAutoDefault542 = !current
    AppToast.show(this, "Set Auto Default542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542ShadowAutoDrop542Toggle() {
    val current = BiliClient.prefs.v542shadowAutoDrop542
    BiliClient.prefs.v542shadowAutoDrop542 = !current
    AppToast.show(this, "Shadow Auto Drop542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542ShapeAutoDetect542Toggle() {
    val current = BiliClient.prefs.v542shapeAutoDetect542
    BiliClient.prefs.v542shapeAutoDetect542 = !current
    AppToast.show(this, "Shape Auto Detect542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542SharpAutoAdjust542Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v542sharpAutoAdjust542).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust542",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v542sharpAutoAdjust542 = value
        AppToast.show(this, "Sharp Auto Adjust542: $value")
    }
}

internal fun PlayerActivity.showV542ShellAutoExecute542Toggle() {
    val current = BiliClient.prefs.v542shellAutoExecute542
    BiliClient.prefs.v542shellAutoExecute542 = !current
    AppToast.show(this, "Shell Auto Execute542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542ShiftAutoOffset542Toggle() {
    val current = BiliClient.prefs.v542shiftAutoOffset542
    BiliClient.prefs.v542shiftAutoOffset542 = !current
    AppToast.show(this, "Shift Auto Offset542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542ShortCutAutoBind542Toggle() {
    val current = BiliClient.prefs.v542shortCutAutoBind542
    BiliClient.prefs.v542shortCutAutoBind542 = !current
    AppToast.show(this, "Short Cut Auto Bind542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542ShowAutoToggle542Toggle() {
    val current = BiliClient.prefs.v542showAutoToggle542
    BiliClient.prefs.v542showAutoToggle542 = !current
    AppToast.show(this, "Show Auto Toggle542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542ShuffleAutoSeed542Toggle() {
    val current = BiliClient.prefs.v542shuffleAutoSeed542
    BiliClient.prefs.v542shuffleAutoSeed542 = !current
    AppToast.show(this, "Shuffle Auto Seed542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542SignalAutoBoost542Toggle() {
    val current = BiliClient.prefs.v542signalAutoBoost542
    BiliClient.prefs.v542signalAutoBoost542 = !current
    AppToast.show(this, "Signal Auto Boost542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV542SingleInstanceMode542Toggle() {
    val current = BiliClient.prefs.v542singleInstanceMode542
    BiliClient.prefs.v542singleInstanceMode542 = !current
    AppToast.show(this, "Single Instance Mode542: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543SendAutoConfirm543Toggle() {
    val current = BiliClient.prefs.v543sendAutoConfirm543
    BiliClient.prefs.v543sendAutoConfirm543 = !current
    AppToast.show(this, "Send Auto Confirm543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543SensorAutoCalibrate543Toggle() {
    val current = BiliClient.prefs.v543sensorAutoCalibrate543
    BiliClient.prefs.v543sensorAutoCalibrate543 = !current
    AppToast.show(this, "Sensor Auto Calibrate543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543ServerAutoSwitch543Toggle() {
    val current = BiliClient.prefs.v543serverAutoSwitch543
    BiliClient.prefs.v543serverAutoSwitch543 = !current
    AppToast.show(this, "Server Auto Switch543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543SessionAutoSave543Toggle() {
    val current = BiliClient.prefs.v543sessionAutoSave543
    BiliClient.prefs.v543sessionAutoSave543 = !current
    AppToast.show(this, "Session Auto Save543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543SetAutoDefault543Toggle() {
    val current = BiliClient.prefs.v543setAutoDefault543
    BiliClient.prefs.v543setAutoDefault543 = !current
    AppToast.show(this, "Set Auto Default543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543ShadowAutoDrop543Toggle() {
    val current = BiliClient.prefs.v543shadowAutoDrop543
    BiliClient.prefs.v543shadowAutoDrop543 = !current
    AppToast.show(this, "Shadow Auto Drop543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543ShapeAutoDetect543Toggle() {
    val current = BiliClient.prefs.v543shapeAutoDetect543
    BiliClient.prefs.v543shapeAutoDetect543 = !current
    AppToast.show(this, "Shape Auto Detect543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543SharpAutoAdjust543Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v543sharpAutoAdjust543).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust543",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v543sharpAutoAdjust543 = value
        AppToast.show(this, "Sharp Auto Adjust543: $value")
    }
}

internal fun PlayerActivity.showV543ShellAutoExecute543Toggle() {
    val current = BiliClient.prefs.v543shellAutoExecute543
    BiliClient.prefs.v543shellAutoExecute543 = !current
    AppToast.show(this, "Shell Auto Execute543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543ShiftAutoOffset543Toggle() {
    val current = BiliClient.prefs.v543shiftAutoOffset543
    BiliClient.prefs.v543shiftAutoOffset543 = !current
    AppToast.show(this, "Shift Auto Offset543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543ShortCutAutoBind543Toggle() {
    val current = BiliClient.prefs.v543shortCutAutoBind543
    BiliClient.prefs.v543shortCutAutoBind543 = !current
    AppToast.show(this, "Short Cut Auto Bind543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543ShowAutoToggle543Toggle() {
    val current = BiliClient.prefs.v543showAutoToggle543
    BiliClient.prefs.v543showAutoToggle543 = !current
    AppToast.show(this, "Show Auto Toggle543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543ShuffleAutoSeed543Toggle() {
    val current = BiliClient.prefs.v543shuffleAutoSeed543
    BiliClient.prefs.v543shuffleAutoSeed543 = !current
    AppToast.show(this, "Shuffle Auto Seed543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543SignalAutoBoost543Toggle() {
    val current = BiliClient.prefs.v543signalAutoBoost543
    BiliClient.prefs.v543signalAutoBoost543 = !current
    AppToast.show(this, "Signal Auto Boost543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV543SingleInstanceMode543Toggle() {
    val current = BiliClient.prefs.v543singleInstanceMode543
    BiliClient.prefs.v543singleInstanceMode543 = !current
    AppToast.show(this, "Single Instance Mode543: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544SendAutoConfirm544Toggle() {
    val current = BiliClient.prefs.v544sendAutoConfirm544
    BiliClient.prefs.v544sendAutoConfirm544 = !current
    AppToast.show(this, "Send Auto Confirm544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544SensorAutoCalibrate544Toggle() {
    val current = BiliClient.prefs.v544sensorAutoCalibrate544
    BiliClient.prefs.v544sensorAutoCalibrate544 = !current
    AppToast.show(this, "Sensor Auto Calibrate544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544ServerAutoSwitch544Toggle() {
    val current = BiliClient.prefs.v544serverAutoSwitch544
    BiliClient.prefs.v544serverAutoSwitch544 = !current
    AppToast.show(this, "Server Auto Switch544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544SessionAutoSave544Toggle() {
    val current = BiliClient.prefs.v544sessionAutoSave544
    BiliClient.prefs.v544sessionAutoSave544 = !current
    AppToast.show(this, "Session Auto Save544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544SetAutoDefault544Toggle() {
    val current = BiliClient.prefs.v544setAutoDefault544
    BiliClient.prefs.v544setAutoDefault544 = !current
    AppToast.show(this, "Set Auto Default544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544ShadowAutoDrop544Toggle() {
    val current = BiliClient.prefs.v544shadowAutoDrop544
    BiliClient.prefs.v544shadowAutoDrop544 = !current
    AppToast.show(this, "Shadow Auto Drop544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544ShapeAutoDetect544Toggle() {
    val current = BiliClient.prefs.v544shapeAutoDetect544
    BiliClient.prefs.v544shapeAutoDetect544 = !current
    AppToast.show(this, "Shape Auto Detect544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544SharpAutoAdjust544Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v544sharpAutoAdjust544).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust544",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v544sharpAutoAdjust544 = value
        AppToast.show(this, "Sharp Auto Adjust544: $value")
    }
}

internal fun PlayerActivity.showV544ShellAutoExecute544Toggle() {
    val current = BiliClient.prefs.v544shellAutoExecute544
    BiliClient.prefs.v544shellAutoExecute544 = !current
    AppToast.show(this, "Shell Auto Execute544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544ShiftAutoOffset544Toggle() {
    val current = BiliClient.prefs.v544shiftAutoOffset544
    BiliClient.prefs.v544shiftAutoOffset544 = !current
    AppToast.show(this, "Shift Auto Offset544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544ShortCutAutoBind544Toggle() {
    val current = BiliClient.prefs.v544shortCutAutoBind544
    BiliClient.prefs.v544shortCutAutoBind544 = !current
    AppToast.show(this, "Short Cut Auto Bind544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544ShowAutoToggle544Toggle() {
    val current = BiliClient.prefs.v544showAutoToggle544
    BiliClient.prefs.v544showAutoToggle544 = !current
    AppToast.show(this, "Show Auto Toggle544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544ShuffleAutoSeed544Toggle() {
    val current = BiliClient.prefs.v544shuffleAutoSeed544
    BiliClient.prefs.v544shuffleAutoSeed544 = !current
    AppToast.show(this, "Shuffle Auto Seed544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544SignalAutoBoost544Toggle() {
    val current = BiliClient.prefs.v544signalAutoBoost544
    BiliClient.prefs.v544signalAutoBoost544 = !current
    AppToast.show(this, "Signal Auto Boost544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV544SingleInstanceMode544Toggle() {
    val current = BiliClient.prefs.v544singleInstanceMode544
    BiliClient.prefs.v544singleInstanceMode544 = !current
    AppToast.show(this, "Single Instance Mode544: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545SendAutoConfirm545Toggle() {
    val current = BiliClient.prefs.v545sendAutoConfirm545
    BiliClient.prefs.v545sendAutoConfirm545 = !current
    AppToast.show(this, "Send Auto Confirm545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545SensorAutoCalibrate545Toggle() {
    val current = BiliClient.prefs.v545sensorAutoCalibrate545
    BiliClient.prefs.v545sensorAutoCalibrate545 = !current
    AppToast.show(this, "Sensor Auto Calibrate545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545ServerAutoSwitch545Toggle() {
    val current = BiliClient.prefs.v545serverAutoSwitch545
    BiliClient.prefs.v545serverAutoSwitch545 = !current
    AppToast.show(this, "Server Auto Switch545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545SessionAutoSave545Toggle() {
    val current = BiliClient.prefs.v545sessionAutoSave545
    BiliClient.prefs.v545sessionAutoSave545 = !current
    AppToast.show(this, "Session Auto Save545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545SetAutoDefault545Toggle() {
    val current = BiliClient.prefs.v545setAutoDefault545
    BiliClient.prefs.v545setAutoDefault545 = !current
    AppToast.show(this, "Set Auto Default545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545ShadowAutoDrop545Toggle() {
    val current = BiliClient.prefs.v545shadowAutoDrop545
    BiliClient.prefs.v545shadowAutoDrop545 = !current
    AppToast.show(this, "Shadow Auto Drop545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545ShapeAutoDetect545Toggle() {
    val current = BiliClient.prefs.v545shapeAutoDetect545
    BiliClient.prefs.v545shapeAutoDetect545 = !current
    AppToast.show(this, "Shape Auto Detect545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545SharpAutoAdjust545Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v545sharpAutoAdjust545).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust545",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v545sharpAutoAdjust545 = value
        AppToast.show(this, "Sharp Auto Adjust545: $value")
    }
}

internal fun PlayerActivity.showV545ShellAutoExecute545Toggle() {
    val current = BiliClient.prefs.v545shellAutoExecute545
    BiliClient.prefs.v545shellAutoExecute545 = !current
    AppToast.show(this, "Shell Auto Execute545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545ShiftAutoOffset545Toggle() {
    val current = BiliClient.prefs.v545shiftAutoOffset545
    BiliClient.prefs.v545shiftAutoOffset545 = !current
    AppToast.show(this, "Shift Auto Offset545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545ShortCutAutoBind545Toggle() {
    val current = BiliClient.prefs.v545shortCutAutoBind545
    BiliClient.prefs.v545shortCutAutoBind545 = !current
    AppToast.show(this, "Short Cut Auto Bind545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545ShowAutoToggle545Toggle() {
    val current = BiliClient.prefs.v545showAutoToggle545
    BiliClient.prefs.v545showAutoToggle545 = !current
    AppToast.show(this, "Show Auto Toggle545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545ShuffleAutoSeed545Toggle() {
    val current = BiliClient.prefs.v545shuffleAutoSeed545
    BiliClient.prefs.v545shuffleAutoSeed545 = !current
    AppToast.show(this, "Shuffle Auto Seed545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545SignalAutoBoost545Toggle() {
    val current = BiliClient.prefs.v545signalAutoBoost545
    BiliClient.prefs.v545signalAutoBoost545 = !current
    AppToast.show(this, "Signal Auto Boost545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV545SingleInstanceMode545Toggle() {
    val current = BiliClient.prefs.v545singleInstanceMode545
    BiliClient.prefs.v545singleInstanceMode545 = !current
    AppToast.show(this, "Single Instance Mode545: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546SendAutoConfirm546Toggle() {
    val current = BiliClient.prefs.v546sendAutoConfirm546
    BiliClient.prefs.v546sendAutoConfirm546 = !current
    AppToast.show(this, "Send Auto Confirm546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546SensorAutoCalibrate546Toggle() {
    val current = BiliClient.prefs.v546sensorAutoCalibrate546
    BiliClient.prefs.v546sensorAutoCalibrate546 = !current
    AppToast.show(this, "Sensor Auto Calibrate546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546ServerAutoSwitch546Toggle() {
    val current = BiliClient.prefs.v546serverAutoSwitch546
    BiliClient.prefs.v546serverAutoSwitch546 = !current
    AppToast.show(this, "Server Auto Switch546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546SessionAutoSave546Toggle() {
    val current = BiliClient.prefs.v546sessionAutoSave546
    BiliClient.prefs.v546sessionAutoSave546 = !current
    AppToast.show(this, "Session Auto Save546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546SetAutoDefault546Toggle() {
    val current = BiliClient.prefs.v546setAutoDefault546
    BiliClient.prefs.v546setAutoDefault546 = !current
    AppToast.show(this, "Set Auto Default546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546ShadowAutoDrop546Toggle() {
    val current = BiliClient.prefs.v546shadowAutoDrop546
    BiliClient.prefs.v546shadowAutoDrop546 = !current
    AppToast.show(this, "Shadow Auto Drop546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546ShapeAutoDetect546Toggle() {
    val current = BiliClient.prefs.v546shapeAutoDetect546
    BiliClient.prefs.v546shapeAutoDetect546 = !current
    AppToast.show(this, "Shape Auto Detect546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546SharpAutoAdjust546Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v546sharpAutoAdjust546).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust546",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v546sharpAutoAdjust546 = value
        AppToast.show(this, "Sharp Auto Adjust546: $value")
    }
}

internal fun PlayerActivity.showV546ShellAutoExecute546Toggle() {
    val current = BiliClient.prefs.v546shellAutoExecute546
    BiliClient.prefs.v546shellAutoExecute546 = !current
    AppToast.show(this, "Shell Auto Execute546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546ShiftAutoOffset546Toggle() {
    val current = BiliClient.prefs.v546shiftAutoOffset546
    BiliClient.prefs.v546shiftAutoOffset546 = !current
    AppToast.show(this, "Shift Auto Offset546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546ShortCutAutoBind546Toggle() {
    val current = BiliClient.prefs.v546shortCutAutoBind546
    BiliClient.prefs.v546shortCutAutoBind546 = !current
    AppToast.show(this, "Short Cut Auto Bind546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546ShowAutoToggle546Toggle() {
    val current = BiliClient.prefs.v546showAutoToggle546
    BiliClient.prefs.v546showAutoToggle546 = !current
    AppToast.show(this, "Show Auto Toggle546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546ShuffleAutoSeed546Toggle() {
    val current = BiliClient.prefs.v546shuffleAutoSeed546
    BiliClient.prefs.v546shuffleAutoSeed546 = !current
    AppToast.show(this, "Shuffle Auto Seed546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546SignalAutoBoost546Toggle() {
    val current = BiliClient.prefs.v546signalAutoBoost546
    BiliClient.prefs.v546signalAutoBoost546 = !current
    AppToast.show(this, "Signal Auto Boost546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV546SingleInstanceMode546Toggle() {
    val current = BiliClient.prefs.v546singleInstanceMode546
    BiliClient.prefs.v546singleInstanceMode546 = !current
    AppToast.show(this, "Single Instance Mode546: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547SendAutoConfirm547Toggle() {
    val current = BiliClient.prefs.v547sendAutoConfirm547
    BiliClient.prefs.v547sendAutoConfirm547 = !current
    AppToast.show(this, "Send Auto Confirm547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547SensorAutoCalibrate547Toggle() {
    val current = BiliClient.prefs.v547sensorAutoCalibrate547
    BiliClient.prefs.v547sensorAutoCalibrate547 = !current
    AppToast.show(this, "Sensor Auto Calibrate547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547ServerAutoSwitch547Toggle() {
    val current = BiliClient.prefs.v547serverAutoSwitch547
    BiliClient.prefs.v547serverAutoSwitch547 = !current
    AppToast.show(this, "Server Auto Switch547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547SessionAutoSave547Toggle() {
    val current = BiliClient.prefs.v547sessionAutoSave547
    BiliClient.prefs.v547sessionAutoSave547 = !current
    AppToast.show(this, "Session Auto Save547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547SetAutoDefault547Toggle() {
    val current = BiliClient.prefs.v547setAutoDefault547
    BiliClient.prefs.v547setAutoDefault547 = !current
    AppToast.show(this, "Set Auto Default547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547ShadowAutoDrop547Toggle() {
    val current = BiliClient.prefs.v547shadowAutoDrop547
    BiliClient.prefs.v547shadowAutoDrop547 = !current
    AppToast.show(this, "Shadow Auto Drop547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547ShapeAutoDetect547Toggle() {
    val current = BiliClient.prefs.v547shapeAutoDetect547
    BiliClient.prefs.v547shapeAutoDetect547 = !current
    AppToast.show(this, "Shape Auto Detect547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547SharpAutoAdjust547Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v547sharpAutoAdjust547).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust547",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v547sharpAutoAdjust547 = value
        AppToast.show(this, "Sharp Auto Adjust547: $value")
    }
}

internal fun PlayerActivity.showV547ShellAutoExecute547Toggle() {
    val current = BiliClient.prefs.v547shellAutoExecute547
    BiliClient.prefs.v547shellAutoExecute547 = !current
    AppToast.show(this, "Shell Auto Execute547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547ShiftAutoOffset547Toggle() {
    val current = BiliClient.prefs.v547shiftAutoOffset547
    BiliClient.prefs.v547shiftAutoOffset547 = !current
    AppToast.show(this, "Shift Auto Offset547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547ShortCutAutoBind547Toggle() {
    val current = BiliClient.prefs.v547shortCutAutoBind547
    BiliClient.prefs.v547shortCutAutoBind547 = !current
    AppToast.show(this, "Short Cut Auto Bind547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547ShowAutoToggle547Toggle() {
    val current = BiliClient.prefs.v547showAutoToggle547
    BiliClient.prefs.v547showAutoToggle547 = !current
    AppToast.show(this, "Show Auto Toggle547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547ShuffleAutoSeed547Toggle() {
    val current = BiliClient.prefs.v547shuffleAutoSeed547
    BiliClient.prefs.v547shuffleAutoSeed547 = !current
    AppToast.show(this, "Shuffle Auto Seed547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547SignalAutoBoost547Toggle() {
    val current = BiliClient.prefs.v547signalAutoBoost547
    BiliClient.prefs.v547signalAutoBoost547 = !current
    AppToast.show(this, "Signal Auto Boost547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV547SingleInstanceMode547Toggle() {
    val current = BiliClient.prefs.v547singleInstanceMode547
    BiliClient.prefs.v547singleInstanceMode547 = !current
    AppToast.show(this, "Single Instance Mode547: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548SendAutoConfirm548Toggle() {
    val current = BiliClient.prefs.v548sendAutoConfirm548
    BiliClient.prefs.v548sendAutoConfirm548 = !current
    AppToast.show(this, "Send Auto Confirm548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548SensorAutoCalibrate548Toggle() {
    val current = BiliClient.prefs.v548sensorAutoCalibrate548
    BiliClient.prefs.v548sensorAutoCalibrate548 = !current
    AppToast.show(this, "Sensor Auto Calibrate548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548ServerAutoSwitch548Toggle() {
    val current = BiliClient.prefs.v548serverAutoSwitch548
    BiliClient.prefs.v548serverAutoSwitch548 = !current
    AppToast.show(this, "Server Auto Switch548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548SessionAutoSave548Toggle() {
    val current = BiliClient.prefs.v548sessionAutoSave548
    BiliClient.prefs.v548sessionAutoSave548 = !current
    AppToast.show(this, "Session Auto Save548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548SetAutoDefault548Toggle() {
    val current = BiliClient.prefs.v548setAutoDefault548
    BiliClient.prefs.v548setAutoDefault548 = !current
    AppToast.show(this, "Set Auto Default548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548ShadowAutoDrop548Toggle() {
    val current = BiliClient.prefs.v548shadowAutoDrop548
    BiliClient.prefs.v548shadowAutoDrop548 = !current
    AppToast.show(this, "Shadow Auto Drop548: ${if (!current) "ON" else "OFF"}")
}

