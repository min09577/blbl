package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v529: Row Auto Expand529
internal fun PlayerActivity.showV529RowAutoExpand529Toggle() {
    val current = BiliClient.prefs.v529rowAutoExpand529
    BiliClient.prefs.v529rowAutoExpand529 = !current
    AppToast.show(this, "Row Auto Expand529: ${if (!current) "ON" else "OFF"}")
}

// v529: Rule Auto Apply529
internal fun PlayerActivity.showV529RuleAutoApply529Toggle() {
    val current = BiliClient.prefs.v529ruleAutoApply529
    BiliClient.prefs.v529ruleAutoApply529 = !current
    AppToast.show(this, "Rule Auto Apply529: ${if (!current) "ON" else "OFF"}")
}

// v530: Remove Auto Confirm530
internal fun PlayerActivity.showV530RemoveAutoConfirm530Toggle() {
    val current = BiliClient.prefs.v530removeAutoConfirm530
    BiliClient.prefs.v530removeAutoConfirm530 = !current
    AppToast.show(this, "Remove Auto Confirm530: ${if (!current) "ON" else "OFF"}")
}

// v530: Render Auto Quality530
internal fun PlayerActivity.showV530RenderAutoQuality530Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v530renderAutoQuality530).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality530",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v530renderAutoQuality530 = value
        AppToast.show(this, "Render Auto Quality530: $value")
    }
}

// v530: Request Auto Retry530
internal fun PlayerActivity.showV530RequestAutoRetry530Toggle() {
    val current = BiliClient.prefs.v530requestAutoRetry530
    BiliClient.prefs.v530requestAutoRetry530 = !current
    AppToast.show(this, "Request Auto Retry530: ${if (!current) "ON" else "OFF"}")
}

// v530: Reset Auto Default530
internal fun PlayerActivity.showV530ResetAutoDefault530Toggle() {
    val current = BiliClient.prefs.v530resetAutoDefault530
    BiliClient.prefs.v530resetAutoDefault530 = !current
    AppToast.show(this, "Reset Auto Default530: ${if (!current) "ON" else "OFF"}")
}

// v530: Resize Auto Scale530
internal fun PlayerActivity.showV530ResizeAutoScale530Toggle() {
    val current = BiliClient.prefs.v530resizeAutoScale530
    BiliClient.prefs.v530resizeAutoScale530 = !current
    AppToast.show(this, "Resize Auto Scale530: ${if (!current) "ON" else "OFF"}")
}

// v530: Response Auto Cache530
internal fun PlayerActivity.showV530ResponseAutoCache530Toggle() {
    val current = BiliClient.prefs.v530responseAutoCache530
    BiliClient.prefs.v530responseAutoCache530 = !current
    AppToast.show(this, "Response Auto Cache530: ${if (!current) "ON" else "OFF"}")
}

// v530: Restore Auto State530
internal fun PlayerActivity.showV530RestoreAutoState530Toggle() {
    val current = BiliClient.prefs.v530restoreAutoState530
    BiliClient.prefs.v530restoreAutoState530 = !current
    AppToast.show(this, "Restore Auto State530: ${if (!current) "ON" else "OFF"}")
}

// v530: Result Auto Sort530
internal fun PlayerActivity.showV530ResultAutoSort530Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v530resultAutoSort530).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort530",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v530resultAutoSort530 = value
        AppToast.show(this, "Result Auto Sort530: $value")
    }
}

// v530: Return To Top530
internal fun PlayerActivity.showV530ReturnToTop530Toggle() {
    val current = BiliClient.prefs.v530returnToTop530
    BiliClient.prefs.v530returnToTop530 = !current
    AppToast.show(this, "Return To Top530: ${if (!current) "ON" else "OFF"}")
}

// v530: Rich Text Enabled530
internal fun PlayerActivity.showV530RichTextEnabled530Toggle() {
    val current = BiliClient.prefs.v530richTextEnabled530
    BiliClient.prefs.v530richTextEnabled530 = !current
    AppToast.show(this, "Rich Text Enabled530: ${if (!current) "ON" else "OFF"}")
}

// v530: Ring Auto Vibrate530
internal fun PlayerActivity.showV530RingAutoVibrate530Toggle() {
    val current = BiliClient.prefs.v530ringAutoVibrate530
    BiliClient.prefs.v530ringAutoVibrate530 = !current
    AppToast.show(this, "Ring Auto Vibrate530: ${if (!current) "ON" else "OFF"}")
}

// v530: Root Auto Detect530
internal fun PlayerActivity.showV530RootAutoDetect530Toggle() {
    val current = BiliClient.prefs.v530rootAutoDetect530
    BiliClient.prefs.v530rootAutoDetect530 = !current
    AppToast.show(this, "Root Auto Detect530: ${if (!current) "ON" else "OFF"}")
}

// v530: Round Corner Enabled530
internal fun PlayerActivity.showV530RoundCornerEnabled530Toggle() {
    val current = BiliClient.prefs.v530roundCornerEnabled530
    BiliClient.prefs.v530roundCornerEnabled530 = !current
    AppToast.show(this, "Round Corner Enabled530: ${if (!current) "ON" else "OFF"}")
}

// v530: Row Auto Expand530
internal fun PlayerActivity.showV530RowAutoExpand530Toggle() {
    val current = BiliClient.prefs.v530rowAutoExpand530
    BiliClient.prefs.v530rowAutoExpand530 = !current
    AppToast.show(this, "Row Auto Expand530: ${if (!current) "ON" else "OFF"}")
}

// v530: Rule Auto Apply530
internal fun PlayerActivity.showV530RuleAutoApply530Toggle() {
    val current = BiliClient.prefs.v530ruleAutoApply530
    BiliClient.prefs.v530ruleAutoApply530 = !current
    AppToast.show(this, "Rule Auto Apply530: ${if (!current) "ON" else "OFF"}")
}

// v531: Run In Background531
internal fun PlayerActivity.showV531RunInBackground531Toggle() {
    val current = BiliClient.prefs.v531runInBackground531
    BiliClient.prefs.v531runInBackground531 = !current
    AppToast.show(this, "Run In Background531: ${if (!current) "ON" else "OFF"}")
}

// v531: Sample Auto Collect531
internal fun PlayerActivity.showV531SampleAutoCollect531Toggle() {
    val current = BiliClient.prefs.v531sampleAutoCollect531
    BiliClient.prefs.v531sampleAutoCollect531 = !current
    AppToast.show(this, "Sample Auto Collect531: ${if (!current) "ON" else "OFF"}")
}

// v531: Save Auto Backup531
internal fun PlayerActivity.showV531SaveAutoBackup531Toggle() {
    val current = BiliClient.prefs.v531saveAutoBackup531
    BiliClient.prefs.v531saveAutoBackup531 = !current
    AppToast.show(this, "Save Auto Backup531: ${if (!current) "ON" else "OFF"}")
}

// v531: Scale Auto Fit531
internal fun PlayerActivity.showV531ScaleAutoFit531Toggle() {
    val current = BiliClient.prefs.v531scaleAutoFit531
    BiliClient.prefs.v531scaleAutoFit531 = !current
    AppToast.show(this, "Scale Auto Fit531: ${if (!current) "ON" else "OFF"}")
}

// v531: Scan Auto Start531
internal fun PlayerActivity.showV531ScanAutoStart531Toggle() {
    val current = BiliClient.prefs.v531scanAutoStart531
    BiliClient.prefs.v531scanAutoStart531 = !current
    AppToast.show(this, "Scan Auto Start531: ${if (!current) "ON" else "OFF"}")
}

// v531: Schedule Auto Run531
internal fun PlayerActivity.showV531ScheduleAutoRun531Toggle() {
    val current = BiliClient.prefs.v531scheduleAutoRun531
    BiliClient.prefs.v531scheduleAutoRun531 = !current
    AppToast.show(this, "Schedule Auto Run531: ${if (!current) "ON" else "OFF"}")
}

// v531: Score Auto Calculate531
internal fun PlayerActivity.showV531ScoreAutoCalculate531Toggle() {
    val current = BiliClient.prefs.v531scoreAutoCalculate531
    BiliClient.prefs.v531scoreAutoCalculate531 = !current
    AppToast.show(this, "Score Auto Calculate531: ${if (!current) "ON" else "OFF"}")
}

// v531: Scratch Auto Repair531
internal fun PlayerActivity.showV531ScratchAutoRepair531Toggle() {
    val current = BiliClient.prefs.v531scratchAutoRepair531
    BiliClient.prefs.v531scratchAutoRepair531 = !current
    AppToast.show(this, "Scratch Auto Repair531: ${if (!current) "ON" else "OFF"}")
}

// v531: Script Auto Execute531
internal fun PlayerActivity.showV531ScriptAutoExecute531Toggle() {
    val current = BiliClient.prefs.v531scriptAutoExecute531
    BiliClient.prefs.v531scriptAutoExecute531 = !current
    AppToast.show(this, "Script Auto Execute531: ${if (!current) "ON" else "OFF"}")
}

// v531: Scroll Auto Smooth531
internal fun PlayerActivity.showV531ScrollAutoSmooth531Toggle() {
    val current = BiliClient.prefs.v531scrollAutoSmooth531
    BiliClient.prefs.v531scrollAutoSmooth531 = !current
    AppToast.show(this, "Scroll Auto Smooth531: ${if (!current) "ON" else "OFF"}")
}

// v531: Seal Auto Encrypt531
internal fun PlayerActivity.showV531SealAutoEncrypt531Toggle() {
    val current = BiliClient.prefs.v531sealAutoEncrypt531
    BiliClient.prefs.v531sealAutoEncrypt531 = !current
    AppToast.show(this, "Seal Auto Encrypt531: ${if (!current) "ON" else "OFF"}")
}

// v531: Search Auto Complete531
internal fun PlayerActivity.showV531SearchAutoComplete531Toggle() {
    val current = BiliClient.prefs.v531searchAutoComplete531
    BiliClient.prefs.v531searchAutoComplete531 = !current
    AppToast.show(this, "Search Auto Complete531: ${if (!current) "ON" else "OFF"}")
}

// v531: Section Auto Group531
internal fun PlayerActivity.showV531SectionAutoGroup531Toggle() {
    val current = BiliClient.prefs.v531sectionAutoGroup531
    BiliClient.prefs.v531sectionAutoGroup531 = !current
    AppToast.show(this, "Section Auto Group531: ${if (!current) "ON" else "OFF"}")
}

// v531: Seek Auto Precision531
internal fun PlayerActivity.showV531SeekAutoPrecision531Toggle() {
    val current = BiliClient.prefs.v531seekAutoPrecision531
    BiliClient.prefs.v531seekAutoPrecision531 = !current
    AppToast.show(this, "Seek Auto Precision531: ${if (!current) "ON" else "OFF"}")
}

// v531: Select Auto Multi531
internal fun PlayerActivity.showV531SelectAutoMulti531Toggle() {
    val current = BiliClient.prefs.v531selectAutoMulti531
    BiliClient.prefs.v531selectAutoMulti531 = !current
    AppToast.show(this, "Select Auto Multi531: ${if (!current) "ON" else "OFF"}")
}

// v532: Run In Background532
internal fun PlayerActivity.showV532RunInBackground532Toggle() {
    val current = BiliClient.prefs.v532runInBackground532
    BiliClient.prefs.v532runInBackground532 = !current
    AppToast.show(this, "Run In Background532: ${if (!current) "ON" else "OFF"}")
}

// v532: Sample Auto Collect532
internal fun PlayerActivity.showV532SampleAutoCollect532Toggle() {
    val current = BiliClient.prefs.v532sampleAutoCollect532
    BiliClient.prefs.v532sampleAutoCollect532 = !current
    AppToast.show(this, "Sample Auto Collect532: ${if (!current) "ON" else "OFF"}")
}

// v532: Save Auto Backup532
internal fun PlayerActivity.showV532SaveAutoBackup532Toggle() {
    val current = BiliClient.prefs.v532saveAutoBackup532
    BiliClient.prefs.v532saveAutoBackup532 = !current
    AppToast.show(this, "Save Auto Backup532: ${if (!current) "ON" else "OFF"}")
}

// v532: Scale Auto Fit532
internal fun PlayerActivity.showV532ScaleAutoFit532Toggle() {
    val current = BiliClient.prefs.v532scaleAutoFit532
    BiliClient.prefs.v532scaleAutoFit532 = !current
    AppToast.show(this, "Scale Auto Fit532: ${if (!current) "ON" else "OFF"}")
}

// v532: Scan Auto Start532
internal fun PlayerActivity.showV532ScanAutoStart532Toggle() {
    val current = BiliClient.prefs.v532scanAutoStart532
    BiliClient.prefs.v532scanAutoStart532 = !current
    AppToast.show(this, "Scan Auto Start532: ${if (!current) "ON" else "OFF"}")
}

// v532: Schedule Auto Run532
internal fun PlayerActivity.showV532ScheduleAutoRun532Toggle() {
    val current = BiliClient.prefs.v532scheduleAutoRun532
    BiliClient.prefs.v532scheduleAutoRun532 = !current
    AppToast.show(this, "Schedule Auto Run532: ${if (!current) "ON" else "OFF"}")
}

// v532: Score Auto Calculate532
internal fun PlayerActivity.showV532ScoreAutoCalculate532Toggle() {
    val current = BiliClient.prefs.v532scoreAutoCalculate532
    BiliClient.prefs.v532scoreAutoCalculate532 = !current
    AppToast.show(this, "Score Auto Calculate532: ${if (!current) "ON" else "OFF"}")
}

// v532: Scratch Auto Repair532
internal fun PlayerActivity.showV532ScratchAutoRepair532Toggle() {
    val current = BiliClient.prefs.v532scratchAutoRepair532
    BiliClient.prefs.v532scratchAutoRepair532 = !current
    AppToast.show(this, "Scratch Auto Repair532: ${if (!current) "ON" else "OFF"}")
}

// v532: Script Auto Execute532
internal fun PlayerActivity.showV532ScriptAutoExecute532Toggle() {
    val current = BiliClient.prefs.v532scriptAutoExecute532
    BiliClient.prefs.v532scriptAutoExecute532 = !current
    AppToast.show(this, "Script Auto Execute532: ${if (!current) "ON" else "OFF"}")
}

// v532: Scroll Auto Smooth532
internal fun PlayerActivity.showV532ScrollAutoSmooth532Toggle() {
    val current = BiliClient.prefs.v532scrollAutoSmooth532
    BiliClient.prefs.v532scrollAutoSmooth532 = !current
    AppToast.show(this, "Scroll Auto Smooth532: ${if (!current) "ON" else "OFF"}")
}

// v532: Seal Auto Encrypt532
internal fun PlayerActivity.showV532SealAutoEncrypt532Toggle() {
    val current = BiliClient.prefs.v532sealAutoEncrypt532
    BiliClient.prefs.v532sealAutoEncrypt532 = !current
    AppToast.show(this, "Seal Auto Encrypt532: ${if (!current) "ON" else "OFF"}")
}

// v532: Search Auto Complete532
internal fun PlayerActivity.showV532SearchAutoComplete532Toggle() {
    val current = BiliClient.prefs.v532searchAutoComplete532
    BiliClient.prefs.v532searchAutoComplete532 = !current
    AppToast.show(this, "Search Auto Complete532: ${if (!current) "ON" else "OFF"}")
}

// v532: Section Auto Group532
internal fun PlayerActivity.showV532SectionAutoGroup532Toggle() {
    val current = BiliClient.prefs.v532sectionAutoGroup532
    BiliClient.prefs.v532sectionAutoGroup532 = !current
    AppToast.show(this, "Section Auto Group532: ${if (!current) "ON" else "OFF"}")
}

// v532: Seek Auto Precision532
internal fun PlayerActivity.showV532SeekAutoPrecision532Toggle() {
    val current = BiliClient.prefs.v532seekAutoPrecision532
    BiliClient.prefs.v532seekAutoPrecision532 = !current
    AppToast.show(this, "Seek Auto Precision532: ${if (!current) "ON" else "OFF"}")
}

// v532: Select Auto Multi532
internal fun PlayerActivity.showV532SelectAutoMulti532Toggle() {
    val current = BiliClient.prefs.v532selectAutoMulti532
    BiliClient.prefs.v532selectAutoMulti532 = !current
    AppToast.show(this, "Select Auto Multi532: ${if (!current) "ON" else "OFF"}")
}

// v533: Run In Background533
internal fun PlayerActivity.showV533RunInBackground533Toggle() {
    val current = BiliClient.prefs.v533runInBackground533
    BiliClient.prefs.v533runInBackground533 = !current
    AppToast.show(this, "Run In Background533: ${if (!current) "ON" else "OFF"}")
}

// v533: Sample Auto Collect533
internal fun PlayerActivity.showV533SampleAutoCollect533Toggle() {
    val current = BiliClient.prefs.v533sampleAutoCollect533
    BiliClient.prefs.v533sampleAutoCollect533 = !current
    AppToast.show(this, "Sample Auto Collect533: ${if (!current) "ON" else "OFF"}")
}

// v533: Save Auto Backup533
internal fun PlayerActivity.showV533SaveAutoBackup533Toggle() {
    val current = BiliClient.prefs.v533saveAutoBackup533
    BiliClient.prefs.v533saveAutoBackup533 = !current
    AppToast.show(this, "Save Auto Backup533: ${if (!current) "ON" else "OFF"}")
}

// v533: Scale Auto Fit533
internal fun PlayerActivity.showV533ScaleAutoFit533Toggle() {
    val current = BiliClient.prefs.v533scaleAutoFit533
    BiliClient.prefs.v533scaleAutoFit533 = !current
    AppToast.show(this, "Scale Auto Fit533: ${if (!current) "ON" else "OFF"}")
}

// v533: Scan Auto Start533
internal fun PlayerActivity.showV533ScanAutoStart533Toggle() {
    val current = BiliClient.prefs.v533scanAutoStart533
    BiliClient.prefs.v533scanAutoStart533 = !current
    AppToast.show(this, "Scan Auto Start533: ${if (!current) "ON" else "OFF"}")
}

// v533: Schedule Auto Run533
internal fun PlayerActivity.showV533ScheduleAutoRun533Toggle() {
    val current = BiliClient.prefs.v533scheduleAutoRun533
    BiliClient.prefs.v533scheduleAutoRun533 = !current
    AppToast.show(this, "Schedule Auto Run533: ${if (!current) "ON" else "OFF"}")
}

// v533: Score Auto Calculate533
internal fun PlayerActivity.showV533ScoreAutoCalculate533Toggle() {
    val current = BiliClient.prefs.v533scoreAutoCalculate533
    BiliClient.prefs.v533scoreAutoCalculate533 = !current
    AppToast.show(this, "Score Auto Calculate533: ${if (!current) "ON" else "OFF"}")
}

// v533: Scratch Auto Repair533
internal fun PlayerActivity.showV533ScratchAutoRepair533Toggle() {
    val current = BiliClient.prefs.v533scratchAutoRepair533
    BiliClient.prefs.v533scratchAutoRepair533 = !current
    AppToast.show(this, "Scratch Auto Repair533: ${if (!current) "ON" else "OFF"}")
}

// v533: Script Auto Execute533
internal fun PlayerActivity.showV533ScriptAutoExecute533Toggle() {
    val current = BiliClient.prefs.v533scriptAutoExecute533
    BiliClient.prefs.v533scriptAutoExecute533 = !current
    AppToast.show(this, "Script Auto Execute533: ${if (!current) "ON" else "OFF"}")
}

// v533: Scroll Auto Smooth533
internal fun PlayerActivity.showV533ScrollAutoSmooth533Toggle() {
    val current = BiliClient.prefs.v533scrollAutoSmooth533
    BiliClient.prefs.v533scrollAutoSmooth533 = !current
    AppToast.show(this, "Scroll Auto Smooth533: ${if (!current) "ON" else "OFF"}")
}

// v533: Seal Auto Encrypt533
internal fun PlayerActivity.showV533SealAutoEncrypt533Toggle() {
    val current = BiliClient.prefs.v533sealAutoEncrypt533
    BiliClient.prefs.v533sealAutoEncrypt533 = !current
    AppToast.show(this, "Seal Auto Encrypt533: ${if (!current) "ON" else "OFF"}")
}

// v533: Search Auto Complete533
internal fun PlayerActivity.showV533SearchAutoComplete533Toggle() {
    val current = BiliClient.prefs.v533searchAutoComplete533
    BiliClient.prefs.v533searchAutoComplete533 = !current
    AppToast.show(this, "Search Auto Complete533: ${if (!current) "ON" else "OFF"}")
}

// v533: Section Auto Group533
internal fun PlayerActivity.showV533SectionAutoGroup533Toggle() {
    val current = BiliClient.prefs.v533sectionAutoGroup533
    BiliClient.prefs.v533sectionAutoGroup533 = !current
    AppToast.show(this, "Section Auto Group533: ${if (!current) "ON" else "OFF"}")
}

// v533: Seek Auto Precision533
internal fun PlayerActivity.showV533SeekAutoPrecision533Toggle() {
    val current = BiliClient.prefs.v533seekAutoPrecision533
    BiliClient.prefs.v533seekAutoPrecision533 = !current
    AppToast.show(this, "Seek Auto Precision533: ${if (!current) "ON" else "OFF"}")
}

// v533: Select Auto Multi533
internal fun PlayerActivity.showV533SelectAutoMulti533Toggle() {
    val current = BiliClient.prefs.v533selectAutoMulti533
    BiliClient.prefs.v533selectAutoMulti533 = !current
    AppToast.show(this, "Select Auto Multi533: ${if (!current) "ON" else "OFF"}")
}

// v534: Run In Background534
internal fun PlayerActivity.showV534RunInBackground534Toggle() {
    val current = BiliClient.prefs.v534runInBackground534
    BiliClient.prefs.v534runInBackground534 = !current
    AppToast.show(this, "Run In Background534: ${if (!current) "ON" else "OFF"}")
}

// v534: Sample Auto Collect534
internal fun PlayerActivity.showV534SampleAutoCollect534Toggle() {
    val current = BiliClient.prefs.v534sampleAutoCollect534
    BiliClient.prefs.v534sampleAutoCollect534 = !current
    AppToast.show(this, "Sample Auto Collect534: ${if (!current) "ON" else "OFF"}")
}

// v534: Save Auto Backup534
internal fun PlayerActivity.showV534SaveAutoBackup534Toggle() {
    val current = BiliClient.prefs.v534saveAutoBackup534
    BiliClient.prefs.v534saveAutoBackup534 = !current
    AppToast.show(this, "Save Auto Backup534: ${if (!current) "ON" else "OFF"}")
}

// v534: Scale Auto Fit534
internal fun PlayerActivity.showV534ScaleAutoFit534Toggle() {
    val current = BiliClient.prefs.v534scaleAutoFit534
    BiliClient.prefs.v534scaleAutoFit534 = !current
    AppToast.show(this, "Scale Auto Fit534: ${if (!current) "ON" else "OFF"}")
}

// v534: Scan Auto Start534
internal fun PlayerActivity.showV534ScanAutoStart534Toggle() {
    val current = BiliClient.prefs.v534scanAutoStart534
    BiliClient.prefs.v534scanAutoStart534 = !current
    AppToast.show(this, "Scan Auto Start534: ${if (!current) "ON" else "OFF"}")
}

// v534: Schedule Auto Run534
internal fun PlayerActivity.showV534ScheduleAutoRun534Toggle() {
    val current = BiliClient.prefs.v534scheduleAutoRun534
    BiliClient.prefs.v534scheduleAutoRun534 = !current
    AppToast.show(this, "Schedule Auto Run534: ${if (!current) "ON" else "OFF"}")
}

// v534: Score Auto Calculate534
internal fun PlayerActivity.showV534ScoreAutoCalculate534Toggle() {
    val current = BiliClient.prefs.v534scoreAutoCalculate534
    BiliClient.prefs.v534scoreAutoCalculate534 = !current
    AppToast.show(this, "Score Auto Calculate534: ${if (!current) "ON" else "OFF"}")
}

// v534: Scratch Auto Repair534
internal fun PlayerActivity.showV534ScratchAutoRepair534Toggle() {
    val current = BiliClient.prefs.v534scratchAutoRepair534
    BiliClient.prefs.v534scratchAutoRepair534 = !current
    AppToast.show(this, "Scratch Auto Repair534: ${if (!current) "ON" else "OFF"}")
}

// v534: Script Auto Execute534
internal fun PlayerActivity.showV534ScriptAutoExecute534Toggle() {
    val current = BiliClient.prefs.v534scriptAutoExecute534
    BiliClient.prefs.v534scriptAutoExecute534 = !current
    AppToast.show(this, "Script Auto Execute534: ${if (!current) "ON" else "OFF"}")
}

// v534: Scroll Auto Smooth534
internal fun PlayerActivity.showV534ScrollAutoSmooth534Toggle() {
    val current = BiliClient.prefs.v534scrollAutoSmooth534
    BiliClient.prefs.v534scrollAutoSmooth534 = !current
    AppToast.show(this, "Scroll Auto Smooth534: ${if (!current) "ON" else "OFF"}")
}

// v534: Seal Auto Encrypt534
internal fun PlayerActivity.showV534SealAutoEncrypt534Toggle() {
    val current = BiliClient.prefs.v534sealAutoEncrypt534
    BiliClient.prefs.v534sealAutoEncrypt534 = !current
    AppToast.show(this, "Seal Auto Encrypt534: ${if (!current) "ON" else "OFF"}")
}

// v534: Search Auto Complete534
internal fun PlayerActivity.showV534SearchAutoComplete534Toggle() {
    val current = BiliClient.prefs.v534searchAutoComplete534
    BiliClient.prefs.v534searchAutoComplete534 = !current
    AppToast.show(this, "Search Auto Complete534: ${if (!current) "ON" else "OFF"}")
}

// v534: Section Auto Group534
internal fun PlayerActivity.showV534SectionAutoGroup534Toggle() {
    val current = BiliClient.prefs.v534sectionAutoGroup534
    BiliClient.prefs.v534sectionAutoGroup534 = !current
    AppToast.show(this, "Section Auto Group534: ${if (!current) "ON" else "OFF"}")
}

// v534: Seek Auto Precision534
internal fun PlayerActivity.showV534SeekAutoPrecision534Toggle() {
    val current = BiliClient.prefs.v534seekAutoPrecision534
    BiliClient.prefs.v534seekAutoPrecision534 = !current
    AppToast.show(this, "Seek Auto Precision534: ${if (!current) "ON" else "OFF"}")
}

// v534: Select Auto Multi534
internal fun PlayerActivity.showV534SelectAutoMulti534Toggle() {
    val current = BiliClient.prefs.v534selectAutoMulti534
    BiliClient.prefs.v534selectAutoMulti534 = !current
    AppToast.show(this, "Select Auto Multi534: ${if (!current) "ON" else "OFF"}")
}

// v535: Run In Background535
internal fun PlayerActivity.showV535RunInBackground535Toggle() {
    val current = BiliClient.prefs.v535runInBackground535
    BiliClient.prefs.v535runInBackground535 = !current
    AppToast.show(this, "Run In Background535: ${if (!current) "ON" else "OFF"}")
}

// v535: Sample Auto Collect535
internal fun PlayerActivity.showV535SampleAutoCollect535Toggle() {
    val current = BiliClient.prefs.v535sampleAutoCollect535
    BiliClient.prefs.v535sampleAutoCollect535 = !current
    AppToast.show(this, "Sample Auto Collect535: ${if (!current) "ON" else "OFF"}")
}

// v535: Save Auto Backup535
internal fun PlayerActivity.showV535SaveAutoBackup535Toggle() {
    val current = BiliClient.prefs.v535saveAutoBackup535
    BiliClient.prefs.v535saveAutoBackup535 = !current
    AppToast.show(this, "Save Auto Backup535: ${if (!current) "ON" else "OFF"}")
}

// v535: Scale Auto Fit535
internal fun PlayerActivity.showV535ScaleAutoFit535Toggle() {
    val current = BiliClient.prefs.v535scaleAutoFit535
    BiliClient.prefs.v535scaleAutoFit535 = !current
    AppToast.show(this, "Scale Auto Fit535: ${if (!current) "ON" else "OFF"}")
}

// v535: Scan Auto Start535
internal fun PlayerActivity.showV535ScanAutoStart535Toggle() {
    val current = BiliClient.prefs.v535scanAutoStart535
    BiliClient.prefs.v535scanAutoStart535 = !current
    AppToast.show(this, "Scan Auto Start535: ${if (!current) "ON" else "OFF"}")
}

// v535: Schedule Auto Run535
internal fun PlayerActivity.showV535ScheduleAutoRun535Toggle() {
    val current = BiliClient.prefs.v535scheduleAutoRun535
    BiliClient.prefs.v535scheduleAutoRun535 = !current
    AppToast.show(this, "Schedule Auto Run535: ${if (!current) "ON" else "OFF"}")
}

// v535: Score Auto Calculate535
internal fun PlayerActivity.showV535ScoreAutoCalculate535Toggle() {
    val current = BiliClient.prefs.v535scoreAutoCalculate535
    BiliClient.prefs.v535scoreAutoCalculate535 = !current
    AppToast.show(this, "Score Auto Calculate535: ${if (!current) "ON" else "OFF"}")
}

// v535: Scratch Auto Repair535
internal fun PlayerActivity.showV535ScratchAutoRepair535Toggle() {
    val current = BiliClient.prefs.v535scratchAutoRepair535
    BiliClient.prefs.v535scratchAutoRepair535 = !current
    AppToast.show(this, "Scratch Auto Repair535: ${if (!current) "ON" else "OFF"}")
}

// v535: Script Auto Execute535
internal fun PlayerActivity.showV535ScriptAutoExecute535Toggle() {
    val current = BiliClient.prefs.v535scriptAutoExecute535
    BiliClient.prefs.v535scriptAutoExecute535 = !current
    AppToast.show(this, "Script Auto Execute535: ${if (!current) "ON" else "OFF"}")
}

// v535: Scroll Auto Smooth535
internal fun PlayerActivity.showV535ScrollAutoSmooth535Toggle() {
    val current = BiliClient.prefs.v535scrollAutoSmooth535
    BiliClient.prefs.v535scrollAutoSmooth535 = !current
    AppToast.show(this, "Scroll Auto Smooth535: ${if (!current) "ON" else "OFF"}")
}

// v535: Seal Auto Encrypt535
internal fun PlayerActivity.showV535SealAutoEncrypt535Toggle() {
    val current = BiliClient.prefs.v535sealAutoEncrypt535
    BiliClient.prefs.v535sealAutoEncrypt535 = !current
    AppToast.show(this, "Seal Auto Encrypt535: ${if (!current) "ON" else "OFF"}")
}

// v535: Search Auto Complete535
internal fun PlayerActivity.showV535SearchAutoComplete535Toggle() {
    val current = BiliClient.prefs.v535searchAutoComplete535
    BiliClient.prefs.v535searchAutoComplete535 = !current
    AppToast.show(this, "Search Auto Complete535: ${if (!current) "ON" else "OFF"}")
}

// v535: Section Auto Group535
internal fun PlayerActivity.showV535SectionAutoGroup535Toggle() {
    val current = BiliClient.prefs.v535sectionAutoGroup535
    BiliClient.prefs.v535sectionAutoGroup535 = !current
    AppToast.show(this, "Section Auto Group535: ${if (!current) "ON" else "OFF"}")
}

// v535: Seek Auto Precision535
internal fun PlayerActivity.showV535SeekAutoPrecision535Toggle() {
    val current = BiliClient.prefs.v535seekAutoPrecision535
    BiliClient.prefs.v535seekAutoPrecision535 = !current
    AppToast.show(this, "Seek Auto Precision535: ${if (!current) "ON" else "OFF"}")
}

// v535: Select Auto Multi535
internal fun PlayerActivity.showV535SelectAutoMulti535Toggle() {
    val current = BiliClient.prefs.v535selectAutoMulti535
    BiliClient.prefs.v535selectAutoMulti535 = !current
    AppToast.show(this, "Select Auto Multi535: ${if (!current) "ON" else "OFF"}")
}

// v536: Run In Background536
internal fun PlayerActivity.showV536RunInBackground536Toggle() {
    val current = BiliClient.prefs.v536runInBackground536
    BiliClient.prefs.v536runInBackground536 = !current
    AppToast.show(this, "Run In Background536: ${if (!current) "ON" else "OFF"}")
}

// v536: Sample Auto Collect536
internal fun PlayerActivity.showV536SampleAutoCollect536Toggle() {
    val current = BiliClient.prefs.v536sampleAutoCollect536
    BiliClient.prefs.v536sampleAutoCollect536 = !current
    AppToast.show(this, "Sample Auto Collect536: ${if (!current) "ON" else "OFF"}")
}

// v536: Save Auto Backup536
internal fun PlayerActivity.showV536SaveAutoBackup536Toggle() {
    val current = BiliClient.prefs.v536saveAutoBackup536
    BiliClient.prefs.v536saveAutoBackup536 = !current
    AppToast.show(this, "Save Auto Backup536: ${if (!current) "ON" else "OFF"}")
}

// v536: Scale Auto Fit536
internal fun PlayerActivity.showV536ScaleAutoFit536Toggle() {
    val current = BiliClient.prefs.v536scaleAutoFit536
    BiliClient.prefs.v536scaleAutoFit536 = !current
    AppToast.show(this, "Scale Auto Fit536: ${if (!current) "ON" else "OFF"}")
}

// v536: Scan Auto Start536
internal fun PlayerActivity.showV536ScanAutoStart536Toggle() {
    val current = BiliClient.prefs.v536scanAutoStart536
    BiliClient.prefs.v536scanAutoStart536 = !current
    AppToast.show(this, "Scan Auto Start536: ${if (!current) "ON" else "OFF"}")
}

// v536: Schedule Auto Run536
internal fun PlayerActivity.showV536ScheduleAutoRun536Toggle() {
    val current = BiliClient.prefs.v536scheduleAutoRun536
    BiliClient.prefs.v536scheduleAutoRun536 = !current
    AppToast.show(this, "Schedule Auto Run536: ${if (!current) "ON" else "OFF"}")
}

// v536: Score Auto Calculate536
internal fun PlayerActivity.showV536ScoreAutoCalculate536Toggle() {
    val current = BiliClient.prefs.v536scoreAutoCalculate536
    BiliClient.prefs.v536scoreAutoCalculate536 = !current
    AppToast.show(this, "Score Auto Calculate536: ${if (!current) "ON" else "OFF"}")
}

// v536: Scratch Auto Repair536
internal fun PlayerActivity.showV536ScratchAutoRepair536Toggle() {
    val current = BiliClient.prefs.v536scratchAutoRepair536
    BiliClient.prefs.v536scratchAutoRepair536 = !current
    AppToast.show(this, "Scratch Auto Repair536: ${if (!current) "ON" else "OFF"}")
}

// v536: Script Auto Execute536
internal fun PlayerActivity.showV536ScriptAutoExecute536Toggle() {
    val current = BiliClient.prefs.v536scriptAutoExecute536
    BiliClient.prefs.v536scriptAutoExecute536 = !current
    AppToast.show(this, "Script Auto Execute536: ${if (!current) "ON" else "OFF"}")
}

// v536: Scroll Auto Smooth536
internal fun PlayerActivity.showV536ScrollAutoSmooth536Toggle() {
    val current = BiliClient.prefs.v536scrollAutoSmooth536
    BiliClient.prefs.v536scrollAutoSmooth536 = !current
    AppToast.show(this, "Scroll Auto Smooth536: ${if (!current) "ON" else "OFF"}")
}

// v536: Seal Auto Encrypt536
internal fun PlayerActivity.showV536SealAutoEncrypt536Toggle() {
    val current = BiliClient.prefs.v536sealAutoEncrypt536
    BiliClient.prefs.v536sealAutoEncrypt536 = !current
    AppToast.show(this, "Seal Auto Encrypt536: ${if (!current) "ON" else "OFF"}")
}

// v536: Search Auto Complete536
internal fun PlayerActivity.showV536SearchAutoComplete536Toggle() {
    val current = BiliClient.prefs.v536searchAutoComplete536
    BiliClient.prefs.v536searchAutoComplete536 = !current
    AppToast.show(this, "Search Auto Complete536: ${if (!current) "ON" else "OFF"}")
}

// v536: Section Auto Group536
internal fun PlayerActivity.showV536SectionAutoGroup536Toggle() {
    val current = BiliClient.prefs.v536sectionAutoGroup536
    BiliClient.prefs.v536sectionAutoGroup536 = !current
    AppToast.show(this, "Section Auto Group536: ${if (!current) "ON" else "OFF"}")
}

// v536: Seek Auto Precision536
internal fun PlayerActivity.showV536SeekAutoPrecision536Toggle() {
    val current = BiliClient.prefs.v536seekAutoPrecision536
    BiliClient.prefs.v536seekAutoPrecision536 = !current
    AppToast.show(this, "Seek Auto Precision536: ${if (!current) "ON" else "OFF"}")
}

// v536: Select Auto Multi536
internal fun PlayerActivity.showV536SelectAutoMulti536Toggle() {
    val current = BiliClient.prefs.v536selectAutoMulti536
    BiliClient.prefs.v536selectAutoMulti536 = !current
    AppToast.show(this, "Select Auto Multi536: ${if (!current) "ON" else "OFF"}")
}

// v537: Run In Background537
internal fun PlayerActivity.showV537RunInBackground537Toggle() {
    val current = BiliClient.prefs.v537runInBackground537
    BiliClient.prefs.v537runInBackground537 = !current
    AppToast.show(this, "Run In Background537: ${if (!current) "ON" else "OFF"}")
}

// v537: Sample Auto Collect537
internal fun PlayerActivity.showV537SampleAutoCollect537Toggle() {
    val current = BiliClient.prefs.v537sampleAutoCollect537
    BiliClient.prefs.v537sampleAutoCollect537 = !current
    AppToast.show(this, "Sample Auto Collect537: ${if (!current) "ON" else "OFF"}")
}

// v537: Save Auto Backup537
internal fun PlayerActivity.showV537SaveAutoBackup537Toggle() {
    val current = BiliClient.prefs.v537saveAutoBackup537
    BiliClient.prefs.v537saveAutoBackup537 = !current
    AppToast.show(this, "Save Auto Backup537: ${if (!current) "ON" else "OFF"}")
}

// v537: Scale Auto Fit537
internal fun PlayerActivity.showV537ScaleAutoFit537Toggle() {
    val current = BiliClient.prefs.v537scaleAutoFit537
    BiliClient.prefs.v537scaleAutoFit537 = !current
    AppToast.show(this, "Scale Auto Fit537: ${if (!current) "ON" else "OFF"}")
}

// v537: Scan Auto Start537
internal fun PlayerActivity.showV537ScanAutoStart537Toggle() {
    val current = BiliClient.prefs.v537scanAutoStart537
    BiliClient.prefs.v537scanAutoStart537 = !current
    AppToast.show(this, "Scan Auto Start537: ${if (!current) "ON" else "OFF"}")
}

// v537: Schedule Auto Run537
internal fun PlayerActivity.showV537ScheduleAutoRun537Toggle() {
    val current = BiliClient.prefs.v537scheduleAutoRun537
    BiliClient.prefs.v537scheduleAutoRun537 = !current
    AppToast.show(this, "Schedule Auto Run537: ${if (!current) "ON" else "OFF"}")
}

// v537: Score Auto Calculate537
internal fun PlayerActivity.showV537ScoreAutoCalculate537Toggle() {
    val current = BiliClient.prefs.v537scoreAutoCalculate537
    BiliClient.prefs.v537scoreAutoCalculate537 = !current
    AppToast.show(this, "Score Auto Calculate537: ${if (!current) "ON" else "OFF"}")
}

// v537: Scratch Auto Repair537
internal fun PlayerActivity.showV537ScratchAutoRepair537Toggle() {
    val current = BiliClient.prefs.v537scratchAutoRepair537
    BiliClient.prefs.v537scratchAutoRepair537 = !current
    AppToast.show(this, "Scratch Auto Repair537: ${if (!current) "ON" else "OFF"}")
}

// v537: Script Auto Execute537
internal fun PlayerActivity.showV537ScriptAutoExecute537Toggle() {
    val current = BiliClient.prefs.v537scriptAutoExecute537
    BiliClient.prefs.v537scriptAutoExecute537 = !current
    AppToast.show(this, "Script Auto Execute537: ${if (!current) "ON" else "OFF"}")
}

// v537: Scroll Auto Smooth537
internal fun PlayerActivity.showV537ScrollAutoSmooth537Toggle() {
    val current = BiliClient.prefs.v537scrollAutoSmooth537
    BiliClient.prefs.v537scrollAutoSmooth537 = !current
    AppToast.show(this, "Scroll Auto Smooth537: ${if (!current) "ON" else "OFF"}")
}

// v537: Seal Auto Encrypt537
internal fun PlayerActivity.showV537SealAutoEncrypt537Toggle() {
    val current = BiliClient.prefs.v537sealAutoEncrypt537
    BiliClient.prefs.v537sealAutoEncrypt537 = !current
    AppToast.show(this, "Seal Auto Encrypt537: ${if (!current) "ON" else "OFF"}")
}

// v537: Search Auto Complete537
internal fun PlayerActivity.showV537SearchAutoComplete537Toggle() {
    val current = BiliClient.prefs.v537searchAutoComplete537
    BiliClient.prefs.v537searchAutoComplete537 = !current
    AppToast.show(this, "Search Auto Complete537: ${if (!current) "ON" else "OFF"}")
}

// v537: Section Auto Group537
internal fun PlayerActivity.showV537SectionAutoGroup537Toggle() {
    val current = BiliClient.prefs.v537sectionAutoGroup537
    BiliClient.prefs.v537sectionAutoGroup537 = !current
    AppToast.show(this, "Section Auto Group537: ${if (!current) "ON" else "OFF"}")
}

// v537: Seek Auto Precision537
internal fun PlayerActivity.showV537SeekAutoPrecision537Toggle() {
    val current = BiliClient.prefs.v537seekAutoPrecision537
    BiliClient.prefs.v537seekAutoPrecision537 = !current
    AppToast.show(this, "Seek Auto Precision537: ${if (!current) "ON" else "OFF"}")
}

// v537: Select Auto Multi537
internal fun PlayerActivity.showV537SelectAutoMulti537Toggle() {
    val current = BiliClient.prefs.v537selectAutoMulti537
    BiliClient.prefs.v537selectAutoMulti537 = !current
    AppToast.show(this, "Select Auto Multi537: ${if (!current) "ON" else "OFF"}")
}

// v538: Run In Background538
internal fun PlayerActivity.showV538RunInBackground538Toggle() {
    val current = BiliClient.prefs.v538runInBackground538
    BiliClient.prefs.v538runInBackground538 = !current
    AppToast.show(this, "Run In Background538: ${if (!current) "ON" else "OFF"}")
}

// v538: Sample Auto Collect538
internal fun PlayerActivity.showV538SampleAutoCollect538Toggle() {
    val current = BiliClient.prefs.v538sampleAutoCollect538
    BiliClient.prefs.v538sampleAutoCollect538 = !current
    AppToast.show(this, "Sample Auto Collect538: ${if (!current) "ON" else "OFF"}")
}

// v538: Save Auto Backup538
internal fun PlayerActivity.showV538SaveAutoBackup538Toggle() {
    val current = BiliClient.prefs.v538saveAutoBackup538
    BiliClient.prefs.v538saveAutoBackup538 = !current
    AppToast.show(this, "Save Auto Backup538: ${if (!current) "ON" else "OFF"}")
}

// v538: Scale Auto Fit538
internal fun PlayerActivity.showV538ScaleAutoFit538Toggle() {
    val current = BiliClient.prefs.v538scaleAutoFit538
    BiliClient.prefs.v538scaleAutoFit538 = !current
    AppToast.show(this, "Scale Auto Fit538: ${if (!current) "ON" else "OFF"}")
}

// v538: Scan Auto Start538
internal fun PlayerActivity.showV538ScanAutoStart538Toggle() {
    val current = BiliClient.prefs.v538scanAutoStart538
    BiliClient.prefs.v538scanAutoStart538 = !current
    AppToast.show(this, "Scan Auto Start538: ${if (!current) "ON" else "OFF"}")
}

// v538: Schedule Auto Run538
internal fun PlayerActivity.showV538ScheduleAutoRun538Toggle() {
    val current = BiliClient.prefs.v538scheduleAutoRun538
    BiliClient.prefs.v538scheduleAutoRun538 = !current
    AppToast.show(this, "Schedule Auto Run538: ${if (!current) "ON" else "OFF"}")
}

// v538: Score Auto Calculate538
internal fun PlayerActivity.showV538ScoreAutoCalculate538Toggle() {
    val current = BiliClient.prefs.v538scoreAutoCalculate538
    BiliClient.prefs.v538scoreAutoCalculate538 = !current
    AppToast.show(this, "Score Auto Calculate538: ${if (!current) "ON" else "OFF"}")
}

// v538: Scratch Auto Repair538
internal fun PlayerActivity.showV538ScratchAutoRepair538Toggle() {
    val current = BiliClient.prefs.v538scratchAutoRepair538
    BiliClient.prefs.v538scratchAutoRepair538 = !current
    AppToast.show(this, "Scratch Auto Repair538: ${if (!current) "ON" else "OFF"}")
}

// v538: Script Auto Execute538
internal fun PlayerActivity.showV538ScriptAutoExecute538Toggle() {
    val current = BiliClient.prefs.v538scriptAutoExecute538
    BiliClient.prefs.v538scriptAutoExecute538 = !current
    AppToast.show(this, "Script Auto Execute538: ${if (!current) "ON" else "OFF"}")
}

// v538: Scroll Auto Smooth538
internal fun PlayerActivity.showV538ScrollAutoSmooth538Toggle() {
    val current = BiliClient.prefs.v538scrollAutoSmooth538
    BiliClient.prefs.v538scrollAutoSmooth538 = !current
    AppToast.show(this, "Scroll Auto Smooth538: ${if (!current) "ON" else "OFF"}")
}

// v538: Seal Auto Encrypt538
internal fun PlayerActivity.showV538SealAutoEncrypt538Toggle() {
    val current = BiliClient.prefs.v538sealAutoEncrypt538
    BiliClient.prefs.v538sealAutoEncrypt538 = !current
    AppToast.show(this, "Seal Auto Encrypt538: ${if (!current) "ON" else "OFF"}")
}

// v538: Search Auto Complete538
internal fun PlayerActivity.showV538SearchAutoComplete538Toggle() {
    val current = BiliClient.prefs.v538searchAutoComplete538
    BiliClient.prefs.v538searchAutoComplete538 = !current
    AppToast.show(this, "Search Auto Complete538: ${if (!current) "ON" else "OFF"}")
}

// v538: Section Auto Group538
internal fun PlayerActivity.showV538SectionAutoGroup538Toggle() {
    val current = BiliClient.prefs.v538sectionAutoGroup538
    BiliClient.prefs.v538sectionAutoGroup538 = !current
    AppToast.show(this, "Section Auto Group538: ${if (!current) "ON" else "OFF"}")
}

// v538: Seek Auto Precision538
internal fun PlayerActivity.showV538SeekAutoPrecision538Toggle() {
    val current = BiliClient.prefs.v538seekAutoPrecision538
    BiliClient.prefs.v538seekAutoPrecision538 = !current
    AppToast.show(this, "Seek Auto Precision538: ${if (!current) "ON" else "OFF"}")
}

// v538: Select Auto Multi538
internal fun PlayerActivity.showV538SelectAutoMulti538Toggle() {
    val current = BiliClient.prefs.v538selectAutoMulti538
    BiliClient.prefs.v538selectAutoMulti538 = !current
    AppToast.show(this, "Select Auto Multi538: ${if (!current) "ON" else "OFF"}")
}

// v539: Run In Background539
internal fun PlayerActivity.showV539RunInBackground539Toggle() {
    val current = BiliClient.prefs.v539runInBackground539
    BiliClient.prefs.v539runInBackground539 = !current
    AppToast.show(this, "Run In Background539: ${if (!current) "ON" else "OFF"}")
}

// v539: Sample Auto Collect539
internal fun PlayerActivity.showV539SampleAutoCollect539Toggle() {
    val current = BiliClient.prefs.v539sampleAutoCollect539
    BiliClient.prefs.v539sampleAutoCollect539 = !current
    AppToast.show(this, "Sample Auto Collect539: ${if (!current) "ON" else "OFF"}")
}

// v539: Save Auto Backup539
internal fun PlayerActivity.showV539SaveAutoBackup539Toggle() {
    val current = BiliClient.prefs.v539saveAutoBackup539
    BiliClient.prefs.v539saveAutoBackup539 = !current
    AppToast.show(this, "Save Auto Backup539: ${if (!current) "ON" else "OFF"}")
}

// v539: Scale Auto Fit539
internal fun PlayerActivity.showV539ScaleAutoFit539Toggle() {
    val current = BiliClient.prefs.v539scaleAutoFit539
    BiliClient.prefs.v539scaleAutoFit539 = !current
    AppToast.show(this, "Scale Auto Fit539: ${if (!current) "ON" else "OFF"}")
}

// v539: Scan Auto Start539
internal fun PlayerActivity.showV539ScanAutoStart539Toggle() {
    val current = BiliClient.prefs.v539scanAutoStart539
    BiliClient.prefs.v539scanAutoStart539 = !current
    AppToast.show(this, "Scan Auto Start539: ${if (!current) "ON" else "OFF"}")
}

// v539: Schedule Auto Run539
internal fun PlayerActivity.showV539ScheduleAutoRun539Toggle() {
    val current = BiliClient.prefs.v539scheduleAutoRun539
    BiliClient.prefs.v539scheduleAutoRun539 = !current
    AppToast.show(this, "Schedule Auto Run539: ${if (!current) "ON" else "OFF"}")
}

// v539: Score Auto Calculate539
internal fun PlayerActivity.showV539ScoreAutoCalculate539Toggle() {
    val current = BiliClient.prefs.v539scoreAutoCalculate539
    BiliClient.prefs.v539scoreAutoCalculate539 = !current
    AppToast.show(this, "Score Auto Calculate539: ${if (!current) "ON" else "OFF"}")
}

// v539: Scratch Auto Repair539
internal fun PlayerActivity.showV539ScratchAutoRepair539Toggle() {
    val current = BiliClient.prefs.v539scratchAutoRepair539
    BiliClient.prefs.v539scratchAutoRepair539 = !current
    AppToast.show(this, "Scratch Auto Repair539: ${if (!current) "ON" else "OFF"}")
}

// v539: Script Auto Execute539
internal fun PlayerActivity.showV539ScriptAutoExecute539Toggle() {
    val current = BiliClient.prefs.v539scriptAutoExecute539
    BiliClient.prefs.v539scriptAutoExecute539 = !current
    AppToast.show(this, "Script Auto Execute539: ${if (!current) "ON" else "OFF"}")
}

// v539: Scroll Auto Smooth539
internal fun PlayerActivity.showV539ScrollAutoSmooth539Toggle() {
    val current = BiliClient.prefs.v539scrollAutoSmooth539
    BiliClient.prefs.v539scrollAutoSmooth539 = !current
    AppToast.show(this, "Scroll Auto Smooth539: ${if (!current) "ON" else "OFF"}")
}

// v539: Seal Auto Encrypt539
internal fun PlayerActivity.showV539SealAutoEncrypt539Toggle() {
    val current = BiliClient.prefs.v539sealAutoEncrypt539
    BiliClient.prefs.v539sealAutoEncrypt539 = !current
    AppToast.show(this, "Seal Auto Encrypt539: ${if (!current) "ON" else "OFF"}")
}

// v539: Search Auto Complete539
internal fun PlayerActivity.showV539SearchAutoComplete539Toggle() {
    val current = BiliClient.prefs.v539searchAutoComplete539
    BiliClient.prefs.v539searchAutoComplete539 = !current
    AppToast.show(this, "Search Auto Complete539: ${if (!current) "ON" else "OFF"}")
}

// v539: Section Auto Group539
internal fun PlayerActivity.showV539SectionAutoGroup539Toggle() {
    val current = BiliClient.prefs.v539sectionAutoGroup539
    BiliClient.prefs.v539sectionAutoGroup539 = !current
    AppToast.show(this, "Section Auto Group539: ${if (!current) "ON" else "OFF"}")
}

// v539: Seek Auto Precision539
internal fun PlayerActivity.showV539SeekAutoPrecision539Toggle() {
    val current = BiliClient.prefs.v539seekAutoPrecision539
    BiliClient.prefs.v539seekAutoPrecision539 = !current
    AppToast.show(this, "Seek Auto Precision539: ${if (!current) "ON" else "OFF"}")
}

// v539: Select Auto Multi539
internal fun PlayerActivity.showV539SelectAutoMulti539Toggle() {
    val current = BiliClient.prefs.v539selectAutoMulti539
    BiliClient.prefs.v539selectAutoMulti539 = !current
    AppToast.show(this, "Select Auto Multi539: ${if (!current) "ON" else "OFF"}")
}

// v540: Run In Background540
internal fun PlayerActivity.showV540RunInBackground540Toggle() {
    val current = BiliClient.prefs.v540runInBackground540
    BiliClient.prefs.v540runInBackground540 = !current
    AppToast.show(this, "Run In Background540: ${if (!current) "ON" else "OFF"}")
}

// v540: Sample Auto Collect540
internal fun PlayerActivity.showV540SampleAutoCollect540Toggle() {
    val current = BiliClient.prefs.v540sampleAutoCollect540
    BiliClient.prefs.v540sampleAutoCollect540 = !current
    AppToast.show(this, "Sample Auto Collect540: ${if (!current) "ON" else "OFF"}")
}

// v540: Save Auto Backup540
internal fun PlayerActivity.showV540SaveAutoBackup540Toggle() {
    val current = BiliClient.prefs.v540saveAutoBackup540
    BiliClient.prefs.v540saveAutoBackup540 = !current
    AppToast.show(this, "Save Auto Backup540: ${if (!current) "ON" else "OFF"}")
}

// v540: Scale Auto Fit540
internal fun PlayerActivity.showV540ScaleAutoFit540Toggle() {
    val current = BiliClient.prefs.v540scaleAutoFit540
    BiliClient.prefs.v540scaleAutoFit540 = !current
    AppToast.show(this, "Scale Auto Fit540: ${if (!current) "ON" else "OFF"}")
}

// v540: Scan Auto Start540
internal fun PlayerActivity.showV540ScanAutoStart540Toggle() {
    val current = BiliClient.prefs.v540scanAutoStart540
    BiliClient.prefs.v540scanAutoStart540 = !current
    AppToast.show(this, "Scan Auto Start540: ${if (!current) "ON" else "OFF"}")
}

// v540: Schedule Auto Run540
internal fun PlayerActivity.showV540ScheduleAutoRun540Toggle() {
    val current = BiliClient.prefs.v540scheduleAutoRun540
    BiliClient.prefs.v540scheduleAutoRun540 = !current
    AppToast.show(this, "Schedule Auto Run540: ${if (!current) "ON" else "OFF"}")
}

// v540: Score Auto Calculate540
internal fun PlayerActivity.showV540ScoreAutoCalculate540Toggle() {
    val current = BiliClient.prefs.v540scoreAutoCalculate540
    BiliClient.prefs.v540scoreAutoCalculate540 = !current
    AppToast.show(this, "Score Auto Calculate540: ${if (!current) "ON" else "OFF"}")
}

// v540: Scratch Auto Repair540
internal fun PlayerActivity.showV540ScratchAutoRepair540Toggle() {
    val current = BiliClient.prefs.v540scratchAutoRepair540
    BiliClient.prefs.v540scratchAutoRepair540 = !current
    AppToast.show(this, "Scratch Auto Repair540: ${if (!current) "ON" else "OFF"}")
}

// v540: Script Auto Execute540
internal fun PlayerActivity.showV540ScriptAutoExecute540Toggle() {
    val current = BiliClient.prefs.v540scriptAutoExecute540
    BiliClient.prefs.v540scriptAutoExecute540 = !current
    AppToast.show(this, "Script Auto Execute540: ${if (!current) "ON" else "OFF"}")
}

// v540: Scroll Auto Smooth540
internal fun PlayerActivity.showV540ScrollAutoSmooth540Toggle() {
    val current = BiliClient.prefs.v540scrollAutoSmooth540
    BiliClient.prefs.v540scrollAutoSmooth540 = !current
    AppToast.show(this, "Scroll Auto Smooth540: ${if (!current) "ON" else "OFF"}")
}

// v540: Seal Auto Encrypt540
internal fun PlayerActivity.showV540SealAutoEncrypt540Toggle() {
    val current = BiliClient.prefs.v540sealAutoEncrypt540
    BiliClient.prefs.v540sealAutoEncrypt540 = !current
    AppToast.show(this, "Seal Auto Encrypt540: ${if (!current) "ON" else "OFF"}")
}

// v540: Search Auto Complete540
internal fun PlayerActivity.showV540SearchAutoComplete540Toggle() {
    val current = BiliClient.prefs.v540searchAutoComplete540
    BiliClient.prefs.v540searchAutoComplete540 = !current
    AppToast.show(this, "Search Auto Complete540: ${if (!current) "ON" else "OFF"}")
}

// v540: Section Auto Group540
internal fun PlayerActivity.showV540SectionAutoGroup540Toggle() {
    val current = BiliClient.prefs.v540sectionAutoGroup540
    BiliClient.prefs.v540sectionAutoGroup540 = !current
    AppToast.show(this, "Section Auto Group540: ${if (!current) "ON" else "OFF"}")
}

// v540: Seek Auto Precision540
internal fun PlayerActivity.showV540SeekAutoPrecision540Toggle() {
    val current = BiliClient.prefs.v540seekAutoPrecision540
    BiliClient.prefs.v540seekAutoPrecision540 = !current
    AppToast.show(this, "Seek Auto Precision540: ${if (!current) "ON" else "OFF"}")
}

// v540: Select Auto Multi540
internal fun PlayerActivity.showV540SelectAutoMulti540Toggle() {
    val current = BiliClient.prefs.v540selectAutoMulti540
    BiliClient.prefs.v540selectAutoMulti540 = !current
    AppToast.show(this, "Select Auto Multi540: ${if (!current) "ON" else "OFF"}")
}

// v541: Send Auto Confirm541
internal fun PlayerActivity.showV541SendAutoConfirm541Toggle() {
    val current = BiliClient.prefs.v541sendAutoConfirm541
    BiliClient.prefs.v541sendAutoConfirm541 = !current
    AppToast.show(this, "Send Auto Confirm541: ${if (!current) "ON" else "OFF"}")
}

// v541: Sensor Auto Calibrate541
internal fun PlayerActivity.showV541SensorAutoCalibrate541Toggle() {
    val current = BiliClient.prefs.v541sensorAutoCalibrate541
    BiliClient.prefs.v541sensorAutoCalibrate541 = !current
    AppToast.show(this, "Sensor Auto Calibrate541: ${if (!current) "ON" else "OFF"}")
}

// v541: Server Auto Switch541
internal fun PlayerActivity.showV541ServerAutoSwitch541Toggle() {
    val current = BiliClient.prefs.v541serverAutoSwitch541
    BiliClient.prefs.v541serverAutoSwitch541 = !current
    AppToast.show(this, "Server Auto Switch541: ${if (!current) "ON" else "OFF"}")
}

// v541: Session Auto Save541
internal fun PlayerActivity.showV541SessionAutoSave541Toggle() {
    val current = BiliClient.prefs.v541sessionAutoSave541
    BiliClient.prefs.v541sessionAutoSave541 = !current
    AppToast.show(this, "Session Auto Save541: ${if (!current) "ON" else "OFF"}")
}

// v541: Set Auto Default541
internal fun PlayerActivity.showV541SetAutoDefault541Toggle() {
    val current = BiliClient.prefs.v541setAutoDefault541
    BiliClient.prefs.v541setAutoDefault541 = !current
    AppToast.show(this, "Set Auto Default541: ${if (!current) "ON" else "OFF"}")
}

// v541: Shadow Auto Drop541
internal fun PlayerActivity.showV541ShadowAutoDrop541Toggle() {
    val current = BiliClient.prefs.v541shadowAutoDrop541
    BiliClient.prefs.v541shadowAutoDrop541 = !current
    AppToast.show(this, "Shadow Auto Drop541: ${if (!current) "ON" else "OFF"}")
}

// v541: Shape Auto Detect541
internal fun PlayerActivity.showV541ShapeAutoDetect541Toggle() {
    val current = BiliClient.prefs.v541shapeAutoDetect541
    BiliClient.prefs.v541shapeAutoDetect541 = !current
    AppToast.show(this, "Shape Auto Detect541: ${if (!current) "ON" else "OFF"}")
}

// v541: Sharp Auto Adjust541
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

// v541: Shell Auto Execute541
internal fun PlayerActivity.showV541ShellAutoExecute541Toggle() {
    val current = BiliClient.prefs.v541shellAutoExecute541
    BiliClient.prefs.v541shellAutoExecute541 = !current
    AppToast.show(this, "Shell Auto Execute541: ${if (!current) "ON" else "OFF"}")
}

// v541: Shift Auto Offset541
internal fun PlayerActivity.showV541ShiftAutoOffset541Toggle() {
    val current = BiliClient.prefs.v541shiftAutoOffset541
    BiliClient.prefs.v541shiftAutoOffset541 = !current
    AppToast.show(this, "Shift Auto Offset541: ${if (!current) "ON" else "OFF"}")
}

// v541: Short Cut Auto Bind541
internal fun PlayerActivity.showV541ShortCutAutoBind541Toggle() {
    val current = BiliClient.prefs.v541shortCutAutoBind541
    BiliClient.prefs.v541shortCutAutoBind541 = !current
    AppToast.show(this, "Short Cut Auto Bind541: ${if (!current) "ON" else "OFF"}")
}

// v541: Show Auto Toggle541
internal fun PlayerActivity.showV541ShowAutoToggle541Toggle() {
    val current = BiliClient.prefs.v541showAutoToggle541
    BiliClient.prefs.v541showAutoToggle541 = !current
    AppToast.show(this, "Show Auto Toggle541: ${if (!current) "ON" else "OFF"}")
}

// v541: Shuffle Auto Seed541
internal fun PlayerActivity.showV541ShuffleAutoSeed541Toggle() {
    val current = BiliClient.prefs.v541shuffleAutoSeed541
    BiliClient.prefs.v541shuffleAutoSeed541 = !current
    AppToast.show(this, "Shuffle Auto Seed541: ${if (!current) "ON" else "OFF"}")
}

// v541: Signal Auto Boost541
internal fun PlayerActivity.showV541SignalAutoBoost541Toggle() {
    val current = BiliClient.prefs.v541signalAutoBoost541
    BiliClient.prefs.v541signalAutoBoost541 = !current
    AppToast.show(this, "Signal Auto Boost541: ${if (!current) "ON" else "OFF"}")
}

// v541: Single Instance Mode541
internal fun PlayerActivity.showV541SingleInstanceMode541Toggle() {
    val current = BiliClient.prefs.v541singleInstanceMode541
    BiliClient.prefs.v541singleInstanceMode541 = !current
    AppToast.show(this, "Single Instance Mode541: ${if (!current) "ON" else "OFF"}")
}

// v542: Send Auto Confirm542
internal fun PlayerActivity.showV542SendAutoConfirm542Toggle() {
    val current = BiliClient.prefs.v542sendAutoConfirm542
    BiliClient.prefs.v542sendAutoConfirm542 = !current
    AppToast.show(this, "Send Auto Confirm542: ${if (!current) "ON" else "OFF"}")
}

// v542: Sensor Auto Calibrate542
internal fun PlayerActivity.showV542SensorAutoCalibrate542Toggle() {
    val current = BiliClient.prefs.v542sensorAutoCalibrate542
    BiliClient.prefs.v542sensorAutoCalibrate542 = !current
    AppToast.show(this, "Sensor Auto Calibrate542: ${if (!current) "ON" else "OFF"}")
}

// v542: Server Auto Switch542
internal fun PlayerActivity.showV542ServerAutoSwitch542Toggle() {
    val current = BiliClient.prefs.v542serverAutoSwitch542
    BiliClient.prefs.v542serverAutoSwitch542 = !current
    AppToast.show(this, "Server Auto Switch542: ${if (!current) "ON" else "OFF"}")
}

// v542: Session Auto Save542
internal fun PlayerActivity.showV542SessionAutoSave542Toggle() {
    val current = BiliClient.prefs.v542sessionAutoSave542
    BiliClient.prefs.v542sessionAutoSave542 = !current
    AppToast.show(this, "Session Auto Save542: ${if (!current) "ON" else "OFF"}")
}

// v542: Set Auto Default542
internal fun PlayerActivity.showV542SetAutoDefault542Toggle() {
    val current = BiliClient.prefs.v542setAutoDefault542
    BiliClient.prefs.v542setAutoDefault542 = !current
    AppToast.show(this, "Set Auto Default542: ${if (!current) "ON" else "OFF"}")
}

// v542: Shadow Auto Drop542
internal fun PlayerActivity.showV542ShadowAutoDrop542Toggle() {
    val current = BiliClient.prefs.v542shadowAutoDrop542
    BiliClient.prefs.v542shadowAutoDrop542 = !current
    AppToast.show(this, "Shadow Auto Drop542: ${if (!current) "ON" else "OFF"}")
}

// v542: Shape Auto Detect542
internal fun PlayerActivity.showV542ShapeAutoDetect542Toggle() {
    val current = BiliClient.prefs.v542shapeAutoDetect542
    BiliClient.prefs.v542shapeAutoDetect542 = !current
    AppToast.show(this, "Shape Auto Detect542: ${if (!current) "ON" else "OFF"}")
}

// v542: Sharp Auto Adjust542
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

// v542: Shell Auto Execute542
internal fun PlayerActivity.showV542ShellAutoExecute542Toggle() {
    val current = BiliClient.prefs.v542shellAutoExecute542
    BiliClient.prefs.v542shellAutoExecute542 = !current
    AppToast.show(this, "Shell Auto Execute542: ${if (!current) "ON" else "OFF"}")
}

// v542: Shift Auto Offset542
internal fun PlayerActivity.showV542ShiftAutoOffset542Toggle() {
    val current = BiliClient.prefs.v542shiftAutoOffset542
    BiliClient.prefs.v542shiftAutoOffset542 = !current
    AppToast.show(this, "Shift Auto Offset542: ${if (!current) "ON" else "OFF"}")
}

// v542: Short Cut Auto Bind542
internal fun PlayerActivity.showV542ShortCutAutoBind542Toggle() {
    val current = BiliClient.prefs.v542shortCutAutoBind542
    BiliClient.prefs.v542shortCutAutoBind542 = !current
    AppToast.show(this, "Short Cut Auto Bind542: ${if (!current) "ON" else "OFF"}")
}

// v542: Show Auto Toggle542
internal fun PlayerActivity.showV542ShowAutoToggle542Toggle() {
    val current = BiliClient.prefs.v542showAutoToggle542
    BiliClient.prefs.v542showAutoToggle542 = !current
    AppToast.show(this, "Show Auto Toggle542: ${if (!current) "ON" else "OFF"}")
}

// v542: Shuffle Auto Seed542
internal fun PlayerActivity.showV542ShuffleAutoSeed542Toggle() {
    val current = BiliClient.prefs.v542shuffleAutoSeed542
    BiliClient.prefs.v542shuffleAutoSeed542 = !current
    AppToast.show(this, "Shuffle Auto Seed542: ${if (!current) "ON" else "OFF"}")
}

// v542: Signal Auto Boost542
internal fun PlayerActivity.showV542SignalAutoBoost542Toggle() {
    val current = BiliClient.prefs.v542signalAutoBoost542
    BiliClient.prefs.v542signalAutoBoost542 = !current
    AppToast.show(this, "Signal Auto Boost542: ${if (!current) "ON" else "OFF"}")
}

// v542: Single Instance Mode542
internal fun PlayerActivity.showV542SingleInstanceMode542Toggle() {
    val current = BiliClient.prefs.v542singleInstanceMode542
    BiliClient.prefs.v542singleInstanceMode542 = !current
    AppToast.show(this, "Single Instance Mode542: ${if (!current) "ON" else "OFF"}")
}

// v543: Send Auto Confirm543
internal fun PlayerActivity.showV543SendAutoConfirm543Toggle() {
    val current = BiliClient.prefs.v543sendAutoConfirm543
    BiliClient.prefs.v543sendAutoConfirm543 = !current
    AppToast.show(this, "Send Auto Confirm543: ${if (!current) "ON" else "OFF"}")
}

// v543: Sensor Auto Calibrate543
internal fun PlayerActivity.showV543SensorAutoCalibrate543Toggle() {
    val current = BiliClient.prefs.v543sensorAutoCalibrate543
    BiliClient.prefs.v543sensorAutoCalibrate543 = !current
    AppToast.show(this, "Sensor Auto Calibrate543: ${if (!current) "ON" else "OFF"}")
}

// v543: Server Auto Switch543
internal fun PlayerActivity.showV543ServerAutoSwitch543Toggle() {
    val current = BiliClient.prefs.v543serverAutoSwitch543
    BiliClient.prefs.v543serverAutoSwitch543 = !current
    AppToast.show(this, "Server Auto Switch543: ${if (!current) "ON" else "OFF"}")
}

