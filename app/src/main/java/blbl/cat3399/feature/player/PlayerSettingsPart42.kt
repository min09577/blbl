package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v569: Template Auto Fill569
internal fun PlayerActivity.showV569TemplateAutoFill569Toggle() {
    val current = BiliClient.prefs.v569templateAutoFill569
    BiliClient.prefs.v569templateAutoFill569 = !current
    AppToast.show(this, "Template Auto Fill569: ${if (!current) "ON" else "OFF"}")
}

// v569: Test Auto Run569
internal fun PlayerActivity.showV569TestAutoRun569Toggle() {
    val current = BiliClient.prefs.v569testAutoRun569
    BiliClient.prefs.v569testAutoRun569 = !current
    AppToast.show(this, "Test Auto Run569: ${if (!current) "ON" else "OFF"}")
}

// v570: Static IP Auto Detect570
internal fun PlayerActivity.showV570StaticIpAutoDetect570Toggle() {
    val current = BiliClient.prefs.v570staticIpAutoDetect570
    BiliClient.prefs.v570staticIpAutoDetect570 = !current
    AppToast.show(this, "Static IP Auto Detect570: ${if (!current) "ON" else "OFF"}")
}

// v570: Step Auto Increment570
internal fun PlayerActivity.showV570StepAutoIncrement570Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v570stepAutoIncrement570).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment570",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v570stepAutoIncrement570 = value
        AppToast.show(this, "Step Auto Increment570: $value")
    }
}

// v570: Stop Auto Confirm570
internal fun PlayerActivity.showV570StopAutoConfirm570Toggle() {
    val current = BiliClient.prefs.v570stopAutoConfirm570
    BiliClient.prefs.v570stopAutoConfirm570 = !current
    AppToast.show(this, "Stop Auto Confirm570: ${if (!current) "ON" else "OFF"}")
}

// v570: Store Auto Sync570
internal fun PlayerActivity.showV570StoreAutoSync570Toggle() {
    val current = BiliClient.prefs.v570storeAutoSync570
    BiliClient.prefs.v570storeAutoSync570 = !current
    AppToast.show(this, "Store Auto Sync570: ${if (!current) "ON" else "OFF"}")
}

// v570: Style Auto Theme570
internal fun PlayerActivity.showV570StyleAutoTheme570Toggle() {
    val current = BiliClient.prefs.v570styleAutoTheme570
    BiliClient.prefs.v570styleAutoTheme570 = !current
    AppToast.show(this, "Style Auto Theme570: ${if (!current) "ON" else "OFF"}")
}

// v570: Submit Auto Validate570
internal fun PlayerActivity.showV570SubmitAutoValidate570Toggle() {
    val current = BiliClient.prefs.v570submitAutoValidate570
    BiliClient.prefs.v570submitAutoValidate570 = !current
    AppToast.show(this, "Submit Auto Validate570: ${if (!current) "ON" else "OFF"}")
}

// v570: Suffix Auto Append570
internal fun PlayerActivity.showV570SuffixAutoAppend570Toggle() {
    val current = BiliClient.prefs.v570suffixAutoAppend570
    BiliClient.prefs.v570suffixAutoAppend570 = !current
    AppToast.show(this, "Suffix Auto Append570: ${if (!current) "ON" else "OFF"}")
}

// v570: Summary Auto Generate570
internal fun PlayerActivity.showV570SummaryAutoGenerate570Toggle() {
    val current = BiliClient.prefs.v570summaryAutoGenerate570
    BiliClient.prefs.v570summaryAutoGenerate570 = !current
    AppToast.show(this, "Summary Auto Generate570: ${if (!current) "ON" else "OFF"}")
}

// v570: Swap Auto Channel570
internal fun PlayerActivity.showV570SwapAutoChannel570Toggle() {
    val current = BiliClient.prefs.v570swapAutoChannel570
    BiliClient.prefs.v570swapAutoChannel570 = !current
    AppToast.show(this, "Swap Auto Channel570: ${if (!current) "ON" else "OFF"}")
}

// v570: Switch Auto Profile570
internal fun PlayerActivity.showV570SwitchAutoProfile570Toggle() {
    val current = BiliClient.prefs.v570switchAutoProfile570
    BiliClient.prefs.v570switchAutoProfile570 = !current
    AppToast.show(this, "Switch Auto Profile570: ${if (!current) "ON" else "OFF"}")
}

// v570: Tab Auto Restore570
internal fun PlayerActivity.showV570TabAutoRestore570Toggle() {
    val current = BiliClient.prefs.v570tabAutoRestore570
    BiliClient.prefs.v570tabAutoRestore570 = !current
    AppToast.show(this, "Tab Auto Restore570: ${if (!current) "ON" else "OFF"}")
}

// v570: Tag Auto Extract570
internal fun PlayerActivity.showV570TagAutoExtract570Toggle() {
    val current = BiliClient.prefs.v570tagAutoExtract570
    BiliClient.prefs.v570tagAutoExtract570 = !current
    AppToast.show(this, "Tag Auto Extract570: ${if (!current) "ON" else "OFF"}")
}

// v570: Target Auto Lock570
internal fun PlayerActivity.showV570TargetAutoLock570Toggle() {
    val current = BiliClient.prefs.v570targetAutoLock570
    BiliClient.prefs.v570targetAutoLock570 = !current
    AppToast.show(this, "Target Auto Lock570: ${if (!current) "ON" else "OFF"}")
}

// v570: Template Auto Fill570
internal fun PlayerActivity.showV570TemplateAutoFill570Toggle() {
    val current = BiliClient.prefs.v570templateAutoFill570
    BiliClient.prefs.v570templateAutoFill570 = !current
    AppToast.show(this, "Template Auto Fill570: ${if (!current) "ON" else "OFF"}")
}

// v570: Test Auto Run570
internal fun PlayerActivity.showV570TestAutoRun570Toggle() {
    val current = BiliClient.prefs.v570testAutoRun570
    BiliClient.prefs.v570testAutoRun570 = !current
    AppToast.show(this, "Test Auto Run570: ${if (!current) "ON" else "OFF"}")
}

// v571: Text Auto Detect571
internal fun PlayerActivity.showV571TextAutoDetect571Toggle() {
    val current = BiliClient.prefs.v571textAutoDetect571
    BiliClient.prefs.v571textAutoDetect571 = !current
    AppToast.show(this, "Text Auto Detect571: ${if (!current) "ON" else "OFF"}")
}

// v571: Theme Auto Switch571
internal fun PlayerActivity.showV571ThemeAutoSwitch571Toggle() {
    val current = BiliClient.prefs.v571themeAutoSwitch571
    BiliClient.prefs.v571themeAutoSwitch571 = !current
    AppToast.show(this, "Theme Auto Switch571: ${if (!current) "ON" else "OFF"}")
}

// v571: Threshold Auto Set571
internal fun PlayerActivity.showV571ThresholdAutoSet571Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v571thresholdAutoSet571).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set571",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v571thresholdAutoSet571 = value
        AppToast.show(this, "Threshold Auto Set571: $value")
    }
}

// v571: Tile Auto Layout571
internal fun PlayerActivity.showV571TileAutoLayout571Toggle() {
    val current = BiliClient.prefs.v571tileAutoLayout571
    BiliClient.prefs.v571tileAutoLayout571 = !current
    AppToast.show(this, "Tile Auto Layout571: ${if (!current) "ON" else "OFF"}")
}

// v571: Tip Auto Show571
internal fun PlayerActivity.showV571TipAutoShow571Toggle() {
    val current = BiliClient.prefs.v571tipAutoShow571
    BiliClient.prefs.v571tipAutoShow571 = !current
    AppToast.show(this, "Tip Auto Show571: ${if (!current) "ON" else "OFF"}")
}

// v571: Token Auto Refresh571
internal fun PlayerActivity.showV571TokenAutoRefresh571Toggle() {
    val current = BiliClient.prefs.v571tokenAutoRefresh571
    BiliClient.prefs.v571tokenAutoRefresh571 = !current
    AppToast.show(this, "Token Auto Refresh571: ${if (!current) "ON" else "OFF"}")
}

// v571: Top Auto Rank571
internal fun PlayerActivity.showV571TopAutoRank571Toggle() {
    val current = BiliClient.prefs.v571topAutoRank571
    BiliClient.prefs.v571topAutoRank571 = !current
    AppToast.show(this, "Top Auto Rank571: ${if (!current) "ON" else "OFF"}")
}

// v571: Trace Auto Log571
internal fun PlayerActivity.showV571TraceAutoLog571Toggle() {
    val current = BiliClient.prefs.v571traceAutoLog571
    BiliClient.prefs.v571traceAutoLog571 = !current
    AppToast.show(this, "Trace Auto Log571: ${if (!current) "ON" else "OFF"}")
}

// v571: Transfer Auto Resume571
internal fun PlayerActivity.showV571TransferAutoResume571Toggle() {
    val current = BiliClient.prefs.v571transferAutoResume571
    BiliClient.prefs.v571transferAutoResume571 = !current
    AppToast.show(this, "Transfer Auto Resume571: ${if (!current) "ON" else "OFF"}")
}

// v571: Transform Auto Crop571
internal fun PlayerActivity.showV571TransformAutoCrop571Toggle() {
    val current = BiliClient.prefs.v571transformAutoCrop571
    BiliClient.prefs.v571transformAutoCrop571 = !current
    AppToast.show(this, "Transform Auto Crop571: ${if (!current) "ON" else "OFF"}")
}

// v571: Translate Auto Detect571
internal fun PlayerActivity.showV571TranslateAutoDetect571Toggle() {
    val current = BiliClient.prefs.v571translateAutoDetect571
    BiliClient.prefs.v571translateAutoDetect571 = !current
    AppToast.show(this, "Translate Auto Detect571: ${if (!current) "ON" else "OFF"}")
}

// v571: Trigger Auto Fire571
internal fun PlayerActivity.showV571TriggerAutoFire571Toggle() {
    val current = BiliClient.prefs.v571triggerAutoFire571
    BiliClient.prefs.v571triggerAutoFire571 = !current
    AppToast.show(this, "Trigger Auto Fire571: ${if (!current) "ON" else "OFF"}")
}

// v571: Trim Auto Clean571
internal fun PlayerActivity.showV571TrimAutoClean571Toggle() {
    val current = BiliClient.prefs.v571trimAutoClean571
    BiliClient.prefs.v571trimAutoClean571 = !current
    AppToast.show(this, "Trim Auto Clean571: ${if (!current) "ON" else "OFF"}")
}

// v571: Tune Auto Equalizer571
internal fun PlayerActivity.showV571TuneAutoEqualizer571Toggle() {
    val current = BiliClient.prefs.v571tuneAutoEqualizer571
    BiliClient.prefs.v571tuneAutoEqualizer571 = !current
    AppToast.show(this, "Tune Auto Equalizer571: ${if (!current) "ON" else "OFF"}")
}

// v571: Type Auto Infer571
internal fun PlayerActivity.showV571TypeAutoInfer571Toggle() {
    val current = BiliClient.prefs.v571typeAutoInfer571
    BiliClient.prefs.v571typeAutoInfer571 = !current
    AppToast.show(this, "Type Auto Infer571: ${if (!current) "ON" else "OFF"}")
}

// v572: Text Auto Detect572
internal fun PlayerActivity.showV572TextAutoDetect572Toggle() {
    val current = BiliClient.prefs.v572textAutoDetect572
    BiliClient.prefs.v572textAutoDetect572 = !current
    AppToast.show(this, "Text Auto Detect572: ${if (!current) "ON" else "OFF"}")
}

// v572: Theme Auto Switch572
internal fun PlayerActivity.showV572ThemeAutoSwitch572Toggle() {
    val current = BiliClient.prefs.v572themeAutoSwitch572
    BiliClient.prefs.v572themeAutoSwitch572 = !current
    AppToast.show(this, "Theme Auto Switch572: ${if (!current) "ON" else "OFF"}")
}

// v572: Threshold Auto Set572
internal fun PlayerActivity.showV572ThresholdAutoSet572Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v572thresholdAutoSet572).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set572",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v572thresholdAutoSet572 = value
        AppToast.show(this, "Threshold Auto Set572: $value")
    }
}

// v572: Tile Auto Layout572
internal fun PlayerActivity.showV572TileAutoLayout572Toggle() {
    val current = BiliClient.prefs.v572tileAutoLayout572
    BiliClient.prefs.v572tileAutoLayout572 = !current
    AppToast.show(this, "Tile Auto Layout572: ${if (!current) "ON" else "OFF"}")
}

// v572: Tip Auto Show572
internal fun PlayerActivity.showV572TipAutoShow572Toggle() {
    val current = BiliClient.prefs.v572tipAutoShow572
    BiliClient.prefs.v572tipAutoShow572 = !current
    AppToast.show(this, "Tip Auto Show572: ${if (!current) "ON" else "OFF"}")
}

// v572: Token Auto Refresh572
internal fun PlayerActivity.showV572TokenAutoRefresh572Toggle() {
    val current = BiliClient.prefs.v572tokenAutoRefresh572
    BiliClient.prefs.v572tokenAutoRefresh572 = !current
    AppToast.show(this, "Token Auto Refresh572: ${if (!current) "ON" else "OFF"}")
}

// v572: Top Auto Rank572
internal fun PlayerActivity.showV572TopAutoRank572Toggle() {
    val current = BiliClient.prefs.v572topAutoRank572
    BiliClient.prefs.v572topAutoRank572 = !current
    AppToast.show(this, "Top Auto Rank572: ${if (!current) "ON" else "OFF"}")
}

// v572: Trace Auto Log572
internal fun PlayerActivity.showV572TraceAutoLog572Toggle() {
    val current = BiliClient.prefs.v572traceAutoLog572
    BiliClient.prefs.v572traceAutoLog572 = !current
    AppToast.show(this, "Trace Auto Log572: ${if (!current) "ON" else "OFF"}")
}

// v572: Transfer Auto Resume572
internal fun PlayerActivity.showV572TransferAutoResume572Toggle() {
    val current = BiliClient.prefs.v572transferAutoResume572
    BiliClient.prefs.v572transferAutoResume572 = !current
    AppToast.show(this, "Transfer Auto Resume572: ${if (!current) "ON" else "OFF"}")
}

// v572: Transform Auto Crop572
internal fun PlayerActivity.showV572TransformAutoCrop572Toggle() {
    val current = BiliClient.prefs.v572transformAutoCrop572
    BiliClient.prefs.v572transformAutoCrop572 = !current
    AppToast.show(this, "Transform Auto Crop572: ${if (!current) "ON" else "OFF"}")
}

// v572: Translate Auto Detect572
internal fun PlayerActivity.showV572TranslateAutoDetect572Toggle() {
    val current = BiliClient.prefs.v572translateAutoDetect572
    BiliClient.prefs.v572translateAutoDetect572 = !current
    AppToast.show(this, "Translate Auto Detect572: ${if (!current) "ON" else "OFF"}")
}

// v572: Trigger Auto Fire572
internal fun PlayerActivity.showV572TriggerAutoFire572Toggle() {
    val current = BiliClient.prefs.v572triggerAutoFire572
    BiliClient.prefs.v572triggerAutoFire572 = !current
    AppToast.show(this, "Trigger Auto Fire572: ${if (!current) "ON" else "OFF"}")
}

// v572: Trim Auto Clean572
internal fun PlayerActivity.showV572TrimAutoClean572Toggle() {
    val current = BiliClient.prefs.v572trimAutoClean572
    BiliClient.prefs.v572trimAutoClean572 = !current
    AppToast.show(this, "Trim Auto Clean572: ${if (!current) "ON" else "OFF"}")
}

// v572: Tune Auto Equalizer572
internal fun PlayerActivity.showV572TuneAutoEqualizer572Toggle() {
    val current = BiliClient.prefs.v572tuneAutoEqualizer572
    BiliClient.prefs.v572tuneAutoEqualizer572 = !current
    AppToast.show(this, "Tune Auto Equalizer572: ${if (!current) "ON" else "OFF"}")
}

// v572: Type Auto Infer572
internal fun PlayerActivity.showV572TypeAutoInfer572Toggle() {
    val current = BiliClient.prefs.v572typeAutoInfer572
    BiliClient.prefs.v572typeAutoInfer572 = !current
    AppToast.show(this, "Type Auto Infer572: ${if (!current) "ON" else "OFF"}")
}

// v573: Text Auto Detect573
internal fun PlayerActivity.showV573TextAutoDetect573Toggle() {
    val current = BiliClient.prefs.v573textAutoDetect573
    BiliClient.prefs.v573textAutoDetect573 = !current
    AppToast.show(this, "Text Auto Detect573: ${if (!current) "ON" else "OFF"}")
}

// v573: Theme Auto Switch573
internal fun PlayerActivity.showV573ThemeAutoSwitch573Toggle() {
    val current = BiliClient.prefs.v573themeAutoSwitch573
    BiliClient.prefs.v573themeAutoSwitch573 = !current
    AppToast.show(this, "Theme Auto Switch573: ${if (!current) "ON" else "OFF"}")
}

// v573: Threshold Auto Set573
internal fun PlayerActivity.showV573ThresholdAutoSet573Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v573thresholdAutoSet573).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set573",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v573thresholdAutoSet573 = value
        AppToast.show(this, "Threshold Auto Set573: $value")
    }
}

// v573: Tile Auto Layout573
internal fun PlayerActivity.showV573TileAutoLayout573Toggle() {
    val current = BiliClient.prefs.v573tileAutoLayout573
    BiliClient.prefs.v573tileAutoLayout573 = !current
    AppToast.show(this, "Tile Auto Layout573: ${if (!current) "ON" else "OFF"}")
}

// v573: Tip Auto Show573
internal fun PlayerActivity.showV573TipAutoShow573Toggle() {
    val current = BiliClient.prefs.v573tipAutoShow573
    BiliClient.prefs.v573tipAutoShow573 = !current
    AppToast.show(this, "Tip Auto Show573: ${if (!current) "ON" else "OFF"}")
}

// v573: Token Auto Refresh573
internal fun PlayerActivity.showV573TokenAutoRefresh573Toggle() {
    val current = BiliClient.prefs.v573tokenAutoRefresh573
    BiliClient.prefs.v573tokenAutoRefresh573 = !current
    AppToast.show(this, "Token Auto Refresh573: ${if (!current) "ON" else "OFF"}")
}

// v573: Top Auto Rank573
internal fun PlayerActivity.showV573TopAutoRank573Toggle() {
    val current = BiliClient.prefs.v573topAutoRank573
    BiliClient.prefs.v573topAutoRank573 = !current
    AppToast.show(this, "Top Auto Rank573: ${if (!current) "ON" else "OFF"}")
}

// v573: Trace Auto Log573
internal fun PlayerActivity.showV573TraceAutoLog573Toggle() {
    val current = BiliClient.prefs.v573traceAutoLog573
    BiliClient.prefs.v573traceAutoLog573 = !current
    AppToast.show(this, "Trace Auto Log573: ${if (!current) "ON" else "OFF"}")
}

// v573: Transfer Auto Resume573
internal fun PlayerActivity.showV573TransferAutoResume573Toggle() {
    val current = BiliClient.prefs.v573transferAutoResume573
    BiliClient.prefs.v573transferAutoResume573 = !current
    AppToast.show(this, "Transfer Auto Resume573: ${if (!current) "ON" else "OFF"}")
}

// v573: Transform Auto Crop573
internal fun PlayerActivity.showV573TransformAutoCrop573Toggle() {
    val current = BiliClient.prefs.v573transformAutoCrop573
    BiliClient.prefs.v573transformAutoCrop573 = !current
    AppToast.show(this, "Transform Auto Crop573: ${if (!current) "ON" else "OFF"}")
}

// v573: Translate Auto Detect573
internal fun PlayerActivity.showV573TranslateAutoDetect573Toggle() {
    val current = BiliClient.prefs.v573translateAutoDetect573
    BiliClient.prefs.v573translateAutoDetect573 = !current
    AppToast.show(this, "Translate Auto Detect573: ${if (!current) "ON" else "OFF"}")
}

// v573: Trigger Auto Fire573
internal fun PlayerActivity.showV573TriggerAutoFire573Toggle() {
    val current = BiliClient.prefs.v573triggerAutoFire573
    BiliClient.prefs.v573triggerAutoFire573 = !current
    AppToast.show(this, "Trigger Auto Fire573: ${if (!current) "ON" else "OFF"}")
}

// v573: Trim Auto Clean573
internal fun PlayerActivity.showV573TrimAutoClean573Toggle() {
    val current = BiliClient.prefs.v573trimAutoClean573
    BiliClient.prefs.v573trimAutoClean573 = !current
    AppToast.show(this, "Trim Auto Clean573: ${if (!current) "ON" else "OFF"}")
}

// v573: Tune Auto Equalizer573
internal fun PlayerActivity.showV573TuneAutoEqualizer573Toggle() {
    val current = BiliClient.prefs.v573tuneAutoEqualizer573
    BiliClient.prefs.v573tuneAutoEqualizer573 = !current
    AppToast.show(this, "Tune Auto Equalizer573: ${if (!current) "ON" else "OFF"}")
}

// v573: Type Auto Infer573
internal fun PlayerActivity.showV573TypeAutoInfer573Toggle() {
    val current = BiliClient.prefs.v573typeAutoInfer573
    BiliClient.prefs.v573typeAutoInfer573 = !current
    AppToast.show(this, "Type Auto Infer573: ${if (!current) "ON" else "OFF"}")
}

// v574: Text Auto Detect574
internal fun PlayerActivity.showV574TextAutoDetect574Toggle() {
    val current = BiliClient.prefs.v574textAutoDetect574
    BiliClient.prefs.v574textAutoDetect574 = !current
    AppToast.show(this, "Text Auto Detect574: ${if (!current) "ON" else "OFF"}")
}

// v574: Theme Auto Switch574
internal fun PlayerActivity.showV574ThemeAutoSwitch574Toggle() {
    val current = BiliClient.prefs.v574themeAutoSwitch574
    BiliClient.prefs.v574themeAutoSwitch574 = !current
    AppToast.show(this, "Theme Auto Switch574: ${if (!current) "ON" else "OFF"}")
}

// v574: Threshold Auto Set574
internal fun PlayerActivity.showV574ThresholdAutoSet574Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v574thresholdAutoSet574).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set574",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v574thresholdAutoSet574 = value
        AppToast.show(this, "Threshold Auto Set574: $value")
    }
}

// v574: Tile Auto Layout574
internal fun PlayerActivity.showV574TileAutoLayout574Toggle() {
    val current = BiliClient.prefs.v574tileAutoLayout574
    BiliClient.prefs.v574tileAutoLayout574 = !current
    AppToast.show(this, "Tile Auto Layout574: ${if (!current) "ON" else "OFF"}")
}

// v574: Tip Auto Show574
internal fun PlayerActivity.showV574TipAutoShow574Toggle() {
    val current = BiliClient.prefs.v574tipAutoShow574
    BiliClient.prefs.v574tipAutoShow574 = !current
    AppToast.show(this, "Tip Auto Show574: ${if (!current) "ON" else "OFF"}")
}

// v574: Token Auto Refresh574
internal fun PlayerActivity.showV574TokenAutoRefresh574Toggle() {
    val current = BiliClient.prefs.v574tokenAutoRefresh574
    BiliClient.prefs.v574tokenAutoRefresh574 = !current
    AppToast.show(this, "Token Auto Refresh574: ${if (!current) "ON" else "OFF"}")
}

// v574: Top Auto Rank574
internal fun PlayerActivity.showV574TopAutoRank574Toggle() {
    val current = BiliClient.prefs.v574topAutoRank574
    BiliClient.prefs.v574topAutoRank574 = !current
    AppToast.show(this, "Top Auto Rank574: ${if (!current) "ON" else "OFF"}")
}

// v574: Trace Auto Log574
internal fun PlayerActivity.showV574TraceAutoLog574Toggle() {
    val current = BiliClient.prefs.v574traceAutoLog574
    BiliClient.prefs.v574traceAutoLog574 = !current
    AppToast.show(this, "Trace Auto Log574: ${if (!current) "ON" else "OFF"}")
}

// v574: Transfer Auto Resume574
internal fun PlayerActivity.showV574TransferAutoResume574Toggle() {
    val current = BiliClient.prefs.v574transferAutoResume574
    BiliClient.prefs.v574transferAutoResume574 = !current
    AppToast.show(this, "Transfer Auto Resume574: ${if (!current) "ON" else "OFF"}")
}

// v574: Transform Auto Crop574
internal fun PlayerActivity.showV574TransformAutoCrop574Toggle() {
    val current = BiliClient.prefs.v574transformAutoCrop574
    BiliClient.prefs.v574transformAutoCrop574 = !current
    AppToast.show(this, "Transform Auto Crop574: ${if (!current) "ON" else "OFF"}")
}

// v574: Translate Auto Detect574
internal fun PlayerActivity.showV574TranslateAutoDetect574Toggle() {
    val current = BiliClient.prefs.v574translateAutoDetect574
    BiliClient.prefs.v574translateAutoDetect574 = !current
    AppToast.show(this, "Translate Auto Detect574: ${if (!current) "ON" else "OFF"}")
}

// v574: Trigger Auto Fire574
internal fun PlayerActivity.showV574TriggerAutoFire574Toggle() {
    val current = BiliClient.prefs.v574triggerAutoFire574
    BiliClient.prefs.v574triggerAutoFire574 = !current
    AppToast.show(this, "Trigger Auto Fire574: ${if (!current) "ON" else "OFF"}")
}

// v574: Trim Auto Clean574
internal fun PlayerActivity.showV574TrimAutoClean574Toggle() {
    val current = BiliClient.prefs.v574trimAutoClean574
    BiliClient.prefs.v574trimAutoClean574 = !current
    AppToast.show(this, "Trim Auto Clean574: ${if (!current) "ON" else "OFF"}")
}

// v574: Tune Auto Equalizer574
internal fun PlayerActivity.showV574TuneAutoEqualizer574Toggle() {
    val current = BiliClient.prefs.v574tuneAutoEqualizer574
    BiliClient.prefs.v574tuneAutoEqualizer574 = !current
    AppToast.show(this, "Tune Auto Equalizer574: ${if (!current) "ON" else "OFF"}")
}

// v574: Type Auto Infer574
internal fun PlayerActivity.showV574TypeAutoInfer574Toggle() {
    val current = BiliClient.prefs.v574typeAutoInfer574
    BiliClient.prefs.v574typeAutoInfer574 = !current
    AppToast.show(this, "Type Auto Infer574: ${if (!current) "ON" else "OFF"}")
}

// v575: Text Auto Detect575
internal fun PlayerActivity.showV575TextAutoDetect575Toggle() {
    val current = BiliClient.prefs.v575textAutoDetect575
    BiliClient.prefs.v575textAutoDetect575 = !current
    AppToast.show(this, "Text Auto Detect575: ${if (!current) "ON" else "OFF"}")
}

// v575: Theme Auto Switch575
internal fun PlayerActivity.showV575ThemeAutoSwitch575Toggle() {
    val current = BiliClient.prefs.v575themeAutoSwitch575
    BiliClient.prefs.v575themeAutoSwitch575 = !current
    AppToast.show(this, "Theme Auto Switch575: ${if (!current) "ON" else "OFF"}")
}

// v575: Threshold Auto Set575
internal fun PlayerActivity.showV575ThresholdAutoSet575Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v575thresholdAutoSet575).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set575",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v575thresholdAutoSet575 = value
        AppToast.show(this, "Threshold Auto Set575: $value")
    }
}

// v575: Tile Auto Layout575
internal fun PlayerActivity.showV575TileAutoLayout575Toggle() {
    val current = BiliClient.prefs.v575tileAutoLayout575
    BiliClient.prefs.v575tileAutoLayout575 = !current
    AppToast.show(this, "Tile Auto Layout575: ${if (!current) "ON" else "OFF"}")
}

// v575: Tip Auto Show575
internal fun PlayerActivity.showV575TipAutoShow575Toggle() {
    val current = BiliClient.prefs.v575tipAutoShow575
    BiliClient.prefs.v575tipAutoShow575 = !current
    AppToast.show(this, "Tip Auto Show575: ${if (!current) "ON" else "OFF"}")
}

// v575: Token Auto Refresh575
internal fun PlayerActivity.showV575TokenAutoRefresh575Toggle() {
    val current = BiliClient.prefs.v575tokenAutoRefresh575
    BiliClient.prefs.v575tokenAutoRefresh575 = !current
    AppToast.show(this, "Token Auto Refresh575: ${if (!current) "ON" else "OFF"}")
}

// v575: Top Auto Rank575
internal fun PlayerActivity.showV575TopAutoRank575Toggle() {
    val current = BiliClient.prefs.v575topAutoRank575
    BiliClient.prefs.v575topAutoRank575 = !current
    AppToast.show(this, "Top Auto Rank575: ${if (!current) "ON" else "OFF"}")
}

// v575: Trace Auto Log575
internal fun PlayerActivity.showV575TraceAutoLog575Toggle() {
    val current = BiliClient.prefs.v575traceAutoLog575
    BiliClient.prefs.v575traceAutoLog575 = !current
    AppToast.show(this, "Trace Auto Log575: ${if (!current) "ON" else "OFF"}")
}

// v575: Transfer Auto Resume575
internal fun PlayerActivity.showV575TransferAutoResume575Toggle() {
    val current = BiliClient.prefs.v575transferAutoResume575
    BiliClient.prefs.v575transferAutoResume575 = !current
    AppToast.show(this, "Transfer Auto Resume575: ${if (!current) "ON" else "OFF"}")
}

// v575: Transform Auto Crop575
internal fun PlayerActivity.showV575TransformAutoCrop575Toggle() {
    val current = BiliClient.prefs.v575transformAutoCrop575
    BiliClient.prefs.v575transformAutoCrop575 = !current
    AppToast.show(this, "Transform Auto Crop575: ${if (!current) "ON" else "OFF"}")
}

// v575: Translate Auto Detect575
internal fun PlayerActivity.showV575TranslateAutoDetect575Toggle() {
    val current = BiliClient.prefs.v575translateAutoDetect575
    BiliClient.prefs.v575translateAutoDetect575 = !current
    AppToast.show(this, "Translate Auto Detect575: ${if (!current) "ON" else "OFF"}")
}

// v575: Trigger Auto Fire575
internal fun PlayerActivity.showV575TriggerAutoFire575Toggle() {
    val current = BiliClient.prefs.v575triggerAutoFire575
    BiliClient.prefs.v575triggerAutoFire575 = !current
    AppToast.show(this, "Trigger Auto Fire575: ${if (!current) "ON" else "OFF"}")
}

// v575: Trim Auto Clean575
internal fun PlayerActivity.showV575TrimAutoClean575Toggle() {
    val current = BiliClient.prefs.v575trimAutoClean575
    BiliClient.prefs.v575trimAutoClean575 = !current
    AppToast.show(this, "Trim Auto Clean575: ${if (!current) "ON" else "OFF"}")
}

// v575: Tune Auto Equalizer575
internal fun PlayerActivity.showV575TuneAutoEqualizer575Toggle() {
    val current = BiliClient.prefs.v575tuneAutoEqualizer575
    BiliClient.prefs.v575tuneAutoEqualizer575 = !current
    AppToast.show(this, "Tune Auto Equalizer575: ${if (!current) "ON" else "OFF"}")
}

// v575: Type Auto Infer575
internal fun PlayerActivity.showV575TypeAutoInfer575Toggle() {
    val current = BiliClient.prefs.v575typeAutoInfer575
    BiliClient.prefs.v575typeAutoInfer575 = !current
    AppToast.show(this, "Type Auto Infer575: ${if (!current) "ON" else "OFF"}")
}

// v576: Text Auto Detect576
internal fun PlayerActivity.showV576TextAutoDetect576Toggle() {
    val current = BiliClient.prefs.v576textAutoDetect576
    BiliClient.prefs.v576textAutoDetect576 = !current
    AppToast.show(this, "Text Auto Detect576: ${if (!current) "ON" else "OFF"}")
}

// v576: Theme Auto Switch576
internal fun PlayerActivity.showV576ThemeAutoSwitch576Toggle() {
    val current = BiliClient.prefs.v576themeAutoSwitch576
    BiliClient.prefs.v576themeAutoSwitch576 = !current
    AppToast.show(this, "Theme Auto Switch576: ${if (!current) "ON" else "OFF"}")
}

// v576: Threshold Auto Set576
internal fun PlayerActivity.showV576ThresholdAutoSet576Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v576thresholdAutoSet576).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set576",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v576thresholdAutoSet576 = value
        AppToast.show(this, "Threshold Auto Set576: $value")
    }
}

// v576: Tile Auto Layout576
internal fun PlayerActivity.showV576TileAutoLayout576Toggle() {
    val current = BiliClient.prefs.v576tileAutoLayout576
    BiliClient.prefs.v576tileAutoLayout576 = !current
    AppToast.show(this, "Tile Auto Layout576: ${if (!current) "ON" else "OFF"}")
}

// v576: Tip Auto Show576
internal fun PlayerActivity.showV576TipAutoShow576Toggle() {
    val current = BiliClient.prefs.v576tipAutoShow576
    BiliClient.prefs.v576tipAutoShow576 = !current
    AppToast.show(this, "Tip Auto Show576: ${if (!current) "ON" else "OFF"}")
}

// v576: Token Auto Refresh576
internal fun PlayerActivity.showV576TokenAutoRefresh576Toggle() {
    val current = BiliClient.prefs.v576tokenAutoRefresh576
    BiliClient.prefs.v576tokenAutoRefresh576 = !current
    AppToast.show(this, "Token Auto Refresh576: ${if (!current) "ON" else "OFF"}")
}

// v576: Top Auto Rank576
internal fun PlayerActivity.showV576TopAutoRank576Toggle() {
    val current = BiliClient.prefs.v576topAutoRank576
    BiliClient.prefs.v576topAutoRank576 = !current
    AppToast.show(this, "Top Auto Rank576: ${if (!current) "ON" else "OFF"}")
}

// v576: Trace Auto Log576
internal fun PlayerActivity.showV576TraceAutoLog576Toggle() {
    val current = BiliClient.prefs.v576traceAutoLog576
    BiliClient.prefs.v576traceAutoLog576 = !current
    AppToast.show(this, "Trace Auto Log576: ${if (!current) "ON" else "OFF"}")
}

// v576: Transfer Auto Resume576
internal fun PlayerActivity.showV576TransferAutoResume576Toggle() {
    val current = BiliClient.prefs.v576transferAutoResume576
    BiliClient.prefs.v576transferAutoResume576 = !current
    AppToast.show(this, "Transfer Auto Resume576: ${if (!current) "ON" else "OFF"}")
}

// v576: Transform Auto Crop576
internal fun PlayerActivity.showV576TransformAutoCrop576Toggle() {
    val current = BiliClient.prefs.v576transformAutoCrop576
    BiliClient.prefs.v576transformAutoCrop576 = !current
    AppToast.show(this, "Transform Auto Crop576: ${if (!current) "ON" else "OFF"}")
}

// v576: Translate Auto Detect576
internal fun PlayerActivity.showV576TranslateAutoDetect576Toggle() {
    val current = BiliClient.prefs.v576translateAutoDetect576
    BiliClient.prefs.v576translateAutoDetect576 = !current
    AppToast.show(this, "Translate Auto Detect576: ${if (!current) "ON" else "OFF"}")
}

// v576: Trigger Auto Fire576
internal fun PlayerActivity.showV576TriggerAutoFire576Toggle() {
    val current = BiliClient.prefs.v576triggerAutoFire576
    BiliClient.prefs.v576triggerAutoFire576 = !current
    AppToast.show(this, "Trigger Auto Fire576: ${if (!current) "ON" else "OFF"}")
}

// v576: Trim Auto Clean576
internal fun PlayerActivity.showV576TrimAutoClean576Toggle() {
    val current = BiliClient.prefs.v576trimAutoClean576
    BiliClient.prefs.v576trimAutoClean576 = !current
    AppToast.show(this, "Trim Auto Clean576: ${if (!current) "ON" else "OFF"}")
}

// v576: Tune Auto Equalizer576
internal fun PlayerActivity.showV576TuneAutoEqualizer576Toggle() {
    val current = BiliClient.prefs.v576tuneAutoEqualizer576
    BiliClient.prefs.v576tuneAutoEqualizer576 = !current
    AppToast.show(this, "Tune Auto Equalizer576: ${if (!current) "ON" else "OFF"}")
}

// v576: Type Auto Infer576
internal fun PlayerActivity.showV576TypeAutoInfer576Toggle() {
    val current = BiliClient.prefs.v576typeAutoInfer576
    BiliClient.prefs.v576typeAutoInfer576 = !current
    AppToast.show(this, "Type Auto Infer576: ${if (!current) "ON" else "OFF"}")
}

// v577: Text Auto Detect577
internal fun PlayerActivity.showV577TextAutoDetect577Toggle() {
    val current = BiliClient.prefs.v577textAutoDetect577
    BiliClient.prefs.v577textAutoDetect577 = !current
    AppToast.show(this, "Text Auto Detect577: ${if (!current) "ON" else "OFF"}")
}

// v577: Theme Auto Switch577
internal fun PlayerActivity.showV577ThemeAutoSwitch577Toggle() {
    val current = BiliClient.prefs.v577themeAutoSwitch577
    BiliClient.prefs.v577themeAutoSwitch577 = !current
    AppToast.show(this, "Theme Auto Switch577: ${if (!current) "ON" else "OFF"}")
}

// v577: Threshold Auto Set577
internal fun PlayerActivity.showV577ThresholdAutoSet577Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v577thresholdAutoSet577).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set577",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v577thresholdAutoSet577 = value
        AppToast.show(this, "Threshold Auto Set577: $value")
    }
}

// v577: Tile Auto Layout577
internal fun PlayerActivity.showV577TileAutoLayout577Toggle() {
    val current = BiliClient.prefs.v577tileAutoLayout577
    BiliClient.prefs.v577tileAutoLayout577 = !current
    AppToast.show(this, "Tile Auto Layout577: ${if (!current) "ON" else "OFF"}")
}

// v577: Tip Auto Show577
internal fun PlayerActivity.showV577TipAutoShow577Toggle() {
    val current = BiliClient.prefs.v577tipAutoShow577
    BiliClient.prefs.v577tipAutoShow577 = !current
    AppToast.show(this, "Tip Auto Show577: ${if (!current) "ON" else "OFF"}")
}

// v577: Token Auto Refresh577
internal fun PlayerActivity.showV577TokenAutoRefresh577Toggle() {
    val current = BiliClient.prefs.v577tokenAutoRefresh577
    BiliClient.prefs.v577tokenAutoRefresh577 = !current
    AppToast.show(this, "Token Auto Refresh577: ${if (!current) "ON" else "OFF"}")
}

// v577: Top Auto Rank577
internal fun PlayerActivity.showV577TopAutoRank577Toggle() {
    val current = BiliClient.prefs.v577topAutoRank577
    BiliClient.prefs.v577topAutoRank577 = !current
    AppToast.show(this, "Top Auto Rank577: ${if (!current) "ON" else "OFF"}")
}

// v577: Trace Auto Log577
internal fun PlayerActivity.showV577TraceAutoLog577Toggle() {
    val current = BiliClient.prefs.v577traceAutoLog577
    BiliClient.prefs.v577traceAutoLog577 = !current
    AppToast.show(this, "Trace Auto Log577: ${if (!current) "ON" else "OFF"}")
}

// v577: Transfer Auto Resume577
internal fun PlayerActivity.showV577TransferAutoResume577Toggle() {
    val current = BiliClient.prefs.v577transferAutoResume577
    BiliClient.prefs.v577transferAutoResume577 = !current
    AppToast.show(this, "Transfer Auto Resume577: ${if (!current) "ON" else "OFF"}")
}

// v577: Transform Auto Crop577
internal fun PlayerActivity.showV577TransformAutoCrop577Toggle() {
    val current = BiliClient.prefs.v577transformAutoCrop577
    BiliClient.prefs.v577transformAutoCrop577 = !current
    AppToast.show(this, "Transform Auto Crop577: ${if (!current) "ON" else "OFF"}")
}

// v577: Translate Auto Detect577
internal fun PlayerActivity.showV577TranslateAutoDetect577Toggle() {
    val current = BiliClient.prefs.v577translateAutoDetect577
    BiliClient.prefs.v577translateAutoDetect577 = !current
    AppToast.show(this, "Translate Auto Detect577: ${if (!current) "ON" else "OFF"}")
}

// v577: Trigger Auto Fire577
internal fun PlayerActivity.showV577TriggerAutoFire577Toggle() {
    val current = BiliClient.prefs.v577triggerAutoFire577
    BiliClient.prefs.v577triggerAutoFire577 = !current
    AppToast.show(this, "Trigger Auto Fire577: ${if (!current) "ON" else "OFF"}")
}

// v577: Trim Auto Clean577
internal fun PlayerActivity.showV577TrimAutoClean577Toggle() {
    val current = BiliClient.prefs.v577trimAutoClean577
    BiliClient.prefs.v577trimAutoClean577 = !current
    AppToast.show(this, "Trim Auto Clean577: ${if (!current) "ON" else "OFF"}")
}

// v577: Tune Auto Equalizer577
internal fun PlayerActivity.showV577TuneAutoEqualizer577Toggle() {
    val current = BiliClient.prefs.v577tuneAutoEqualizer577
    BiliClient.prefs.v577tuneAutoEqualizer577 = !current
    AppToast.show(this, "Tune Auto Equalizer577: ${if (!current) "ON" else "OFF"}")
}

// v577: Type Auto Infer577
internal fun PlayerActivity.showV577TypeAutoInfer577Toggle() {
    val current = BiliClient.prefs.v577typeAutoInfer577
    BiliClient.prefs.v577typeAutoInfer577 = !current
    AppToast.show(this, "Type Auto Infer577: ${if (!current) "ON" else "OFF"}")
}

// v578: Text Auto Detect578
internal fun PlayerActivity.showV578TextAutoDetect578Toggle() {
    val current = BiliClient.prefs.v578textAutoDetect578
    BiliClient.prefs.v578textAutoDetect578 = !current
    AppToast.show(this, "Text Auto Detect578: ${if (!current) "ON" else "OFF"}")
}

// v578: Theme Auto Switch578
internal fun PlayerActivity.showV578ThemeAutoSwitch578Toggle() {
    val current = BiliClient.prefs.v578themeAutoSwitch578
    BiliClient.prefs.v578themeAutoSwitch578 = !current
    AppToast.show(this, "Theme Auto Switch578: ${if (!current) "ON" else "OFF"}")
}

// v578: Threshold Auto Set578
internal fun PlayerActivity.showV578ThresholdAutoSet578Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v578thresholdAutoSet578).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set578",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v578thresholdAutoSet578 = value
        AppToast.show(this, "Threshold Auto Set578: $value")
    }
}

// v578: Tile Auto Layout578
internal fun PlayerActivity.showV578TileAutoLayout578Toggle() {
    val current = BiliClient.prefs.v578tileAutoLayout578
    BiliClient.prefs.v578tileAutoLayout578 = !current
    AppToast.show(this, "Tile Auto Layout578: ${if (!current) "ON" else "OFF"}")
}

// v578: Tip Auto Show578
internal fun PlayerActivity.showV578TipAutoShow578Toggle() {
    val current = BiliClient.prefs.v578tipAutoShow578
    BiliClient.prefs.v578tipAutoShow578 = !current
    AppToast.show(this, "Tip Auto Show578: ${if (!current) "ON" else "OFF"}")
}

// v578: Token Auto Refresh578
internal fun PlayerActivity.showV578TokenAutoRefresh578Toggle() {
    val current = BiliClient.prefs.v578tokenAutoRefresh578
    BiliClient.prefs.v578tokenAutoRefresh578 = !current
    AppToast.show(this, "Token Auto Refresh578: ${if (!current) "ON" else "OFF"}")
}

// v578: Top Auto Rank578
internal fun PlayerActivity.showV578TopAutoRank578Toggle() {
    val current = BiliClient.prefs.v578topAutoRank578
    BiliClient.prefs.v578topAutoRank578 = !current
    AppToast.show(this, "Top Auto Rank578: ${if (!current) "ON" else "OFF"}")
}

// v578: Trace Auto Log578
internal fun PlayerActivity.showV578TraceAutoLog578Toggle() {
    val current = BiliClient.prefs.v578traceAutoLog578
    BiliClient.prefs.v578traceAutoLog578 = !current
    AppToast.show(this, "Trace Auto Log578: ${if (!current) "ON" else "OFF"}")
}

// v578: Transfer Auto Resume578
internal fun PlayerActivity.showV578TransferAutoResume578Toggle() {
    val current = BiliClient.prefs.v578transferAutoResume578
    BiliClient.prefs.v578transferAutoResume578 = !current
    AppToast.show(this, "Transfer Auto Resume578: ${if (!current) "ON" else "OFF"}")
}

// v578: Transform Auto Crop578
internal fun PlayerActivity.showV578TransformAutoCrop578Toggle() {
    val current = BiliClient.prefs.v578transformAutoCrop578
    BiliClient.prefs.v578transformAutoCrop578 = !current
    AppToast.show(this, "Transform Auto Crop578: ${if (!current) "ON" else "OFF"}")
}

// v578: Translate Auto Detect578
internal fun PlayerActivity.showV578TranslateAutoDetect578Toggle() {
    val current = BiliClient.prefs.v578translateAutoDetect578
    BiliClient.prefs.v578translateAutoDetect578 = !current
    AppToast.show(this, "Translate Auto Detect578: ${if (!current) "ON" else "OFF"}")
}

// v578: Trigger Auto Fire578
internal fun PlayerActivity.showV578TriggerAutoFire578Toggle() {
    val current = BiliClient.prefs.v578triggerAutoFire578
    BiliClient.prefs.v578triggerAutoFire578 = !current
    AppToast.show(this, "Trigger Auto Fire578: ${if (!current) "ON" else "OFF"}")
}

// v578: Trim Auto Clean578
internal fun PlayerActivity.showV578TrimAutoClean578Toggle() {
    val current = BiliClient.prefs.v578trimAutoClean578
    BiliClient.prefs.v578trimAutoClean578 = !current
    AppToast.show(this, "Trim Auto Clean578: ${if (!current) "ON" else "OFF"}")
}

// v578: Tune Auto Equalizer578
internal fun PlayerActivity.showV578TuneAutoEqualizer578Toggle() {
    val current = BiliClient.prefs.v578tuneAutoEqualizer578
    BiliClient.prefs.v578tuneAutoEqualizer578 = !current
    AppToast.show(this, "Tune Auto Equalizer578: ${if (!current) "ON" else "OFF"}")
}

// v578: Type Auto Infer578
internal fun PlayerActivity.showV578TypeAutoInfer578Toggle() {
    val current = BiliClient.prefs.v578typeAutoInfer578
    BiliClient.prefs.v578typeAutoInfer578 = !current
    AppToast.show(this, "Type Auto Infer578: ${if (!current) "ON" else "OFF"}")
}

// v579: Text Auto Detect579
internal fun PlayerActivity.showV579TextAutoDetect579Toggle() {
    val current = BiliClient.prefs.v579textAutoDetect579
    BiliClient.prefs.v579textAutoDetect579 = !current
    AppToast.show(this, "Text Auto Detect579: ${if (!current) "ON" else "OFF"}")
}

// v579: Theme Auto Switch579
internal fun PlayerActivity.showV579ThemeAutoSwitch579Toggle() {
    val current = BiliClient.prefs.v579themeAutoSwitch579
    BiliClient.prefs.v579themeAutoSwitch579 = !current
    AppToast.show(this, "Theme Auto Switch579: ${if (!current) "ON" else "OFF"}")
}

// v579: Threshold Auto Set579
internal fun PlayerActivity.showV579ThresholdAutoSet579Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v579thresholdAutoSet579).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set579",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v579thresholdAutoSet579 = value
        AppToast.show(this, "Threshold Auto Set579: $value")
    }
}

// v579: Tile Auto Layout579
internal fun PlayerActivity.showV579TileAutoLayout579Toggle() {
    val current = BiliClient.prefs.v579tileAutoLayout579
    BiliClient.prefs.v579tileAutoLayout579 = !current
    AppToast.show(this, "Tile Auto Layout579: ${if (!current) "ON" else "OFF"}")
}

// v579: Tip Auto Show579
internal fun PlayerActivity.showV579TipAutoShow579Toggle() {
    val current = BiliClient.prefs.v579tipAutoShow579
    BiliClient.prefs.v579tipAutoShow579 = !current
    AppToast.show(this, "Tip Auto Show579: ${if (!current) "ON" else "OFF"}")
}

// v579: Token Auto Refresh579
internal fun PlayerActivity.showV579TokenAutoRefresh579Toggle() {
    val current = BiliClient.prefs.v579tokenAutoRefresh579
    BiliClient.prefs.v579tokenAutoRefresh579 = !current
    AppToast.show(this, "Token Auto Refresh579: ${if (!current) "ON" else "OFF"}")
}

// v579: Top Auto Rank579
internal fun PlayerActivity.showV579TopAutoRank579Toggle() {
    val current = BiliClient.prefs.v579topAutoRank579
    BiliClient.prefs.v579topAutoRank579 = !current
    AppToast.show(this, "Top Auto Rank579: ${if (!current) "ON" else "OFF"}")
}

// v579: Trace Auto Log579
internal fun PlayerActivity.showV579TraceAutoLog579Toggle() {
    val current = BiliClient.prefs.v579traceAutoLog579
    BiliClient.prefs.v579traceAutoLog579 = !current
    AppToast.show(this, "Trace Auto Log579: ${if (!current) "ON" else "OFF"}")
}

// v579: Transfer Auto Resume579
internal fun PlayerActivity.showV579TransferAutoResume579Toggle() {
    val current = BiliClient.prefs.v579transferAutoResume579
    BiliClient.prefs.v579transferAutoResume579 = !current
    AppToast.show(this, "Transfer Auto Resume579: ${if (!current) "ON" else "OFF"}")
}

// v579: Transform Auto Crop579
internal fun PlayerActivity.showV579TransformAutoCrop579Toggle() {
    val current = BiliClient.prefs.v579transformAutoCrop579
    BiliClient.prefs.v579transformAutoCrop579 = !current
    AppToast.show(this, "Transform Auto Crop579: ${if (!current) "ON" else "OFF"}")
}

// v579: Translate Auto Detect579
internal fun PlayerActivity.showV579TranslateAutoDetect579Toggle() {
    val current = BiliClient.prefs.v579translateAutoDetect579
    BiliClient.prefs.v579translateAutoDetect579 = !current
    AppToast.show(this, "Translate Auto Detect579: ${if (!current) "ON" else "OFF"}")
}

// v579: Trigger Auto Fire579
internal fun PlayerActivity.showV579TriggerAutoFire579Toggle() {
    val current = BiliClient.prefs.v579triggerAutoFire579
    BiliClient.prefs.v579triggerAutoFire579 = !current
    AppToast.show(this, "Trigger Auto Fire579: ${if (!current) "ON" else "OFF"}")
}

// v579: Trim Auto Clean579
internal fun PlayerActivity.showV579TrimAutoClean579Toggle() {
    val current = BiliClient.prefs.v579trimAutoClean579
    BiliClient.prefs.v579trimAutoClean579 = !current
    AppToast.show(this, "Trim Auto Clean579: ${if (!current) "ON" else "OFF"}")
}

// v579: Tune Auto Equalizer579
internal fun PlayerActivity.showV579TuneAutoEqualizer579Toggle() {
    val current = BiliClient.prefs.v579tuneAutoEqualizer579
    BiliClient.prefs.v579tuneAutoEqualizer579 = !current
    AppToast.show(this, "Tune Auto Equalizer579: ${if (!current) "ON" else "OFF"}")
}

// v579: Type Auto Infer579
internal fun PlayerActivity.showV579TypeAutoInfer579Toggle() {
    val current = BiliClient.prefs.v579typeAutoInfer579
    BiliClient.prefs.v579typeAutoInfer579 = !current
    AppToast.show(this, "Type Auto Infer579: ${if (!current) "ON" else "OFF"}")
}

// v580: Text Auto Detect580
internal fun PlayerActivity.showV580TextAutoDetect580Toggle() {
    val current = BiliClient.prefs.v580textAutoDetect580
    BiliClient.prefs.v580textAutoDetect580 = !current
    AppToast.show(this, "Text Auto Detect580: ${if (!current) "ON" else "OFF"}")
}

// v580: Theme Auto Switch580
internal fun PlayerActivity.showV580ThemeAutoSwitch580Toggle() {
    val current = BiliClient.prefs.v580themeAutoSwitch580
    BiliClient.prefs.v580themeAutoSwitch580 = !current
    AppToast.show(this, "Theme Auto Switch580: ${if (!current) "ON" else "OFF"}")
}

// v580: Threshold Auto Set580
internal fun PlayerActivity.showV580ThresholdAutoSet580Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v580thresholdAutoSet580).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set580",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v580thresholdAutoSet580 = value
        AppToast.show(this, "Threshold Auto Set580: $value")
    }
}

// v580: Tile Auto Layout580
internal fun PlayerActivity.showV580TileAutoLayout580Toggle() {
    val current = BiliClient.prefs.v580tileAutoLayout580
    BiliClient.prefs.v580tileAutoLayout580 = !current
    AppToast.show(this, "Tile Auto Layout580: ${if (!current) "ON" else "OFF"}")
}

// v580: Tip Auto Show580
internal fun PlayerActivity.showV580TipAutoShow580Toggle() {
    val current = BiliClient.prefs.v580tipAutoShow580
    BiliClient.prefs.v580tipAutoShow580 = !current
    AppToast.show(this, "Tip Auto Show580: ${if (!current) "ON" else "OFF"}")
}

// v580: Token Auto Refresh580
internal fun PlayerActivity.showV580TokenAutoRefresh580Toggle() {
    val current = BiliClient.prefs.v580tokenAutoRefresh580
    BiliClient.prefs.v580tokenAutoRefresh580 = !current
    AppToast.show(this, "Token Auto Refresh580: ${if (!current) "ON" else "OFF"}")
}

// v580: Top Auto Rank580
internal fun PlayerActivity.showV580TopAutoRank580Toggle() {
    val current = BiliClient.prefs.v580topAutoRank580
    BiliClient.prefs.v580topAutoRank580 = !current
    AppToast.show(this, "Top Auto Rank580: ${if (!current) "ON" else "OFF"}")
}

// v580: Trace Auto Log580
internal fun PlayerActivity.showV580TraceAutoLog580Toggle() {
    val current = BiliClient.prefs.v580traceAutoLog580
    BiliClient.prefs.v580traceAutoLog580 = !current
    AppToast.show(this, "Trace Auto Log580: ${if (!current) "ON" else "OFF"}")
}

// v580: Transfer Auto Resume580
internal fun PlayerActivity.showV580TransferAutoResume580Toggle() {
    val current = BiliClient.prefs.v580transferAutoResume580
    BiliClient.prefs.v580transferAutoResume580 = !current
    AppToast.show(this, "Transfer Auto Resume580: ${if (!current) "ON" else "OFF"}")
}

// v580: Transform Auto Crop580
internal fun PlayerActivity.showV580TransformAutoCrop580Toggle() {
    val current = BiliClient.prefs.v580transformAutoCrop580
    BiliClient.prefs.v580transformAutoCrop580 = !current
    AppToast.show(this, "Transform Auto Crop580: ${if (!current) "ON" else "OFF"}")
}

// v580: Translate Auto Detect580
internal fun PlayerActivity.showV580TranslateAutoDetect580Toggle() {
    val current = BiliClient.prefs.v580translateAutoDetect580
    BiliClient.prefs.v580translateAutoDetect580 = !current
    AppToast.show(this, "Translate Auto Detect580: ${if (!current) "ON" else "OFF"}")
}

// v580: Trigger Auto Fire580
internal fun PlayerActivity.showV580TriggerAutoFire580Toggle() {
    val current = BiliClient.prefs.v580triggerAutoFire580
    BiliClient.prefs.v580triggerAutoFire580 = !current
    AppToast.show(this, "Trigger Auto Fire580: ${if (!current) "ON" else "OFF"}")
}

// v580: Trim Auto Clean580
internal fun PlayerActivity.showV580TrimAutoClean580Toggle() {
    val current = BiliClient.prefs.v580trimAutoClean580
    BiliClient.prefs.v580trimAutoClean580 = !current
    AppToast.show(this, "Trim Auto Clean580: ${if (!current) "ON" else "OFF"}")
}

// v580: Tune Auto Equalizer580
internal fun PlayerActivity.showV580TuneAutoEqualizer580Toggle() {
    val current = BiliClient.prefs.v580tuneAutoEqualizer580
    BiliClient.prefs.v580tuneAutoEqualizer580 = !current
    AppToast.show(this, "Tune Auto Equalizer580: ${if (!current) "ON" else "OFF"}")
}

// v580: Type Auto Infer580
internal fun PlayerActivity.showV580TypeAutoInfer580Toggle() {
    val current = BiliClient.prefs.v580typeAutoInfer580
    BiliClient.prefs.v580typeAutoInfer580 = !current
    AppToast.show(this, "Type Auto Infer580: ${if (!current) "ON" else "OFF"}")
}

// v581: Update Auto Download581
internal fun PlayerActivity.showV581UpdateAutoDownload581Toggle() {
    val current = BiliClient.prefs.v581updateAutoDownload581
    BiliClient.prefs.v581updateAutoDownload581 = !current
    AppToast.show(this, "Update Auto Download581: ${if (!current) "ON" else "OFF"}")
}

// v581: Upload Auto Retry581
internal fun PlayerActivity.showV581UploadAutoRetry581Toggle() {
    val current = BiliClient.prefs.v581uploadAutoRetry581
    BiliClient.prefs.v581uploadAutoRetry581 = !current
    AppToast.show(this, "Upload Auto Retry581: ${if (!current) "ON" else "OFF"}")
}

// v581: Upscale Auto Enhance581
internal fun PlayerActivity.showV581UpscaleAutoEnhance581Toggle() {
    val current = BiliClient.prefs.v581upscaleAutoEnhance581
    BiliClient.prefs.v581upscaleAutoEnhance581 = !current
    AppToast.show(this, "Upscale Auto Enhance581: ${if (!current) "ON" else "OFF"}")
}

// v581: Use Auto Optimize581
internal fun PlayerActivity.showV581UseAutoOptimize581Toggle() {
    val current = BiliClient.prefs.v581useAutoOptimize581
    BiliClient.prefs.v581useAutoOptimize581 = !current
    AppToast.show(this, "Use Auto Optimize581: ${if (!current) "ON" else "OFF"}")
}

// v581: Value Auto Bind581
internal fun PlayerActivity.showV581ValueAutoBind581Toggle() {
    val current = BiliClient.prefs.v581valueAutoBind581
    BiliClient.prefs.v581valueAutoBind581 = !current
    AppToast.show(this, "Value Auto Bind581: ${if (!current) "ON" else "OFF"}")
}

// v581: Verify Auto Checksum581
internal fun PlayerActivity.showV581VerifyAutoChecksum581Toggle() {
    val current = BiliClient.prefs.v581verifyAutoChecksum581
    BiliClient.prefs.v581verifyAutoChecksum581 = !current
    AppToast.show(this, "Verify Auto Checksum581: ${if (!current) "ON" else "OFF"}")
}

// v581: Version Auto Check581
internal fun PlayerActivity.showV581VersionAutoCheck581Toggle() {
    val current = BiliClient.prefs.v581versionAutoCheck581
    BiliClient.prefs.v581versionAutoCheck581 = !current
    AppToast.show(this, "Version Auto Check581: ${if (!current) "ON" else "OFF"}")
}

// v581: View Auto Switch581
internal fun PlayerActivity.showV581ViewAutoSwitch581Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v581viewAutoSwitch581).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch581",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v581viewAutoSwitch581 = value
        AppToast.show(this, "View Auto Switch581: $value")
    }
}

// v581: Virtual Display581
internal fun PlayerActivity.showV581VirtualDisplay581Toggle() {
    val current = BiliClient.prefs.v581virtualDisplay581
    BiliClient.prefs.v581virtualDisplay581 = !current
    AppToast.show(this, "Virtual Display581: ${if (!current) "ON" else "OFF"}")
}

// v581: Visible Auto Toggle581
internal fun PlayerActivity.showV581VisibleAutoToggle581Toggle() {
    val current = BiliClient.prefs.v581visibleAutoToggle581
    BiliClient.prefs.v581visibleAutoToggle581 = !current
    AppToast.show(this, "Visible Auto Toggle581: ${if (!current) "ON" else "OFF"}")
}

// v581: Voice Auto Recognize581
internal fun PlayerActivity.showV581VoiceAutoRecognize581Toggle() {
    val current = BiliClient.prefs.v581voiceAutoRecognize581
    BiliClient.prefs.v581voiceAutoRecognize581 = !current
    AppToast.show(this, "Voice Auto Recognize581: ${if (!current) "ON" else "OFF"}")
}

// v581: Wait Auto Timeout581
internal fun PlayerActivity.showV581WaitAutoTimeout581Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v581waitAutoTimeout581).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout581",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v581waitAutoTimeout581 = value
        AppToast.show(this, "Wait Auto Timeout581: $value")
    }
}

// v581: Warm Auto Start581
internal fun PlayerActivity.showV581WarmAutoStart581Toggle() {
    val current = BiliClient.prefs.v581warmAutoStart581
    BiliClient.prefs.v581warmAutoStart581 = !current
    AppToast.show(this, "Warm Auto Start581: ${if (!current) "ON" else "OFF"}")
}

// v581: Warning Auto Alert581
internal fun PlayerActivity.showV581WarningAutoAlert581Toggle() {
    val current = BiliClient.prefs.v581warningAutoAlert581
    BiliClient.prefs.v581warningAutoAlert581 = !current
    AppToast.show(this, "Warning Auto Alert581: ${if (!current) "ON" else "OFF"}")
}

// v581: Watch Auto Sync581
internal fun PlayerActivity.showV581WatchAutoSync581Toggle() {
    val current = BiliClient.prefs.v581watchAutoSync581
    BiliClient.prefs.v581watchAutoSync581 = !current
    AppToast.show(this, "Watch Auto Sync581: ${if (!current) "ON" else "OFF"}")
}

// v582: Update Auto Download582
internal fun PlayerActivity.showV582UpdateAutoDownload582Toggle() {
    val current = BiliClient.prefs.v582updateAutoDownload582
    BiliClient.prefs.v582updateAutoDownload582 = !current
    AppToast.show(this, "Update Auto Download582: ${if (!current) "ON" else "OFF"}")
}

// v582: Upload Auto Retry582
internal fun PlayerActivity.showV582UploadAutoRetry582Toggle() {
    val current = BiliClient.prefs.v582uploadAutoRetry582
    BiliClient.prefs.v582uploadAutoRetry582 = !current
    AppToast.show(this, "Upload Auto Retry582: ${if (!current) "ON" else "OFF"}")
}

// v582: Upscale Auto Enhance582
internal fun PlayerActivity.showV582UpscaleAutoEnhance582Toggle() {
    val current = BiliClient.prefs.v582upscaleAutoEnhance582
    BiliClient.prefs.v582upscaleAutoEnhance582 = !current
    AppToast.show(this, "Upscale Auto Enhance582: ${if (!current) "ON" else "OFF"}")
}

// v582: Use Auto Optimize582
internal fun PlayerActivity.showV582UseAutoOptimize582Toggle() {
    val current = BiliClient.prefs.v582useAutoOptimize582
    BiliClient.prefs.v582useAutoOptimize582 = !current
    AppToast.show(this, "Use Auto Optimize582: ${if (!current) "ON" else "OFF"}")
}

// v582: Value Auto Bind582
internal fun PlayerActivity.showV582ValueAutoBind582Toggle() {
    val current = BiliClient.prefs.v582valueAutoBind582
    BiliClient.prefs.v582valueAutoBind582 = !current
    AppToast.show(this, "Value Auto Bind582: ${if (!current) "ON" else "OFF"}")
}

// v582: Verify Auto Checksum582
internal fun PlayerActivity.showV582VerifyAutoChecksum582Toggle() {
    val current = BiliClient.prefs.v582verifyAutoChecksum582
    BiliClient.prefs.v582verifyAutoChecksum582 = !current
    AppToast.show(this, "Verify Auto Checksum582: ${if (!current) "ON" else "OFF"}")
}

// v582: Version Auto Check582
internal fun PlayerActivity.showV582VersionAutoCheck582Toggle() {
    val current = BiliClient.prefs.v582versionAutoCheck582
    BiliClient.prefs.v582versionAutoCheck582 = !current
    AppToast.show(this, "Version Auto Check582: ${if (!current) "ON" else "OFF"}")
}

// v582: View Auto Switch582
internal fun PlayerActivity.showV582ViewAutoSwitch582Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v582viewAutoSwitch582).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch582",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v582viewAutoSwitch582 = value
        AppToast.show(this, "View Auto Switch582: $value")
    }
}

// v582: Virtual Display582
internal fun PlayerActivity.showV582VirtualDisplay582Toggle() {
    val current = BiliClient.prefs.v582virtualDisplay582
    BiliClient.prefs.v582virtualDisplay582 = !current
    AppToast.show(this, "Virtual Display582: ${if (!current) "ON" else "OFF"}")
}

// v582: Visible Auto Toggle582
internal fun PlayerActivity.showV582VisibleAutoToggle582Toggle() {
    val current = BiliClient.prefs.v582visibleAutoToggle582
    BiliClient.prefs.v582visibleAutoToggle582 = !current
    AppToast.show(this, "Visible Auto Toggle582: ${if (!current) "ON" else "OFF"}")
}

// v582: Voice Auto Recognize582
internal fun PlayerActivity.showV582VoiceAutoRecognize582Toggle() {
    val current = BiliClient.prefs.v582voiceAutoRecognize582
    BiliClient.prefs.v582voiceAutoRecognize582 = !current
    AppToast.show(this, "Voice Auto Recognize582: ${if (!current) "ON" else "OFF"}")
}

// v582: Wait Auto Timeout582
internal fun PlayerActivity.showV582WaitAutoTimeout582Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v582waitAutoTimeout582).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout582",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v582waitAutoTimeout582 = value
        AppToast.show(this, "Wait Auto Timeout582: $value")
    }
}

// v582: Warm Auto Start582
internal fun PlayerActivity.showV582WarmAutoStart582Toggle() {
    val current = BiliClient.prefs.v582warmAutoStart582
    BiliClient.prefs.v582warmAutoStart582 = !current
    AppToast.show(this, "Warm Auto Start582: ${if (!current) "ON" else "OFF"}")
}

// v582: Warning Auto Alert582
internal fun PlayerActivity.showV582WarningAutoAlert582Toggle() {
    val current = BiliClient.prefs.v582warningAutoAlert582
    BiliClient.prefs.v582warningAutoAlert582 = !current
    AppToast.show(this, "Warning Auto Alert582: ${if (!current) "ON" else "OFF"}")
}

// v582: Watch Auto Sync582
internal fun PlayerActivity.showV582WatchAutoSync582Toggle() {
    val current = BiliClient.prefs.v582watchAutoSync582
    BiliClient.prefs.v582watchAutoSync582 = !current
    AppToast.show(this, "Watch Auto Sync582: ${if (!current) "ON" else "OFF"}")
}

// v583: Update Auto Download583
internal fun PlayerActivity.showV583UpdateAutoDownload583Toggle() {
    val current = BiliClient.prefs.v583updateAutoDownload583
    BiliClient.prefs.v583updateAutoDownload583 = !current
    AppToast.show(this, "Update Auto Download583: ${if (!current) "ON" else "OFF"}")
}

// v583: Upload Auto Retry583
internal fun PlayerActivity.showV583UploadAutoRetry583Toggle() {
    val current = BiliClient.prefs.v583uploadAutoRetry583
    BiliClient.prefs.v583uploadAutoRetry583 = !current
    AppToast.show(this, "Upload Auto Retry583: ${if (!current) "ON" else "OFF"}")
}

// v583: Upscale Auto Enhance583
internal fun PlayerActivity.showV583UpscaleAutoEnhance583Toggle() {
    val current = BiliClient.prefs.v583upscaleAutoEnhance583
    BiliClient.prefs.v583upscaleAutoEnhance583 = !current
    AppToast.show(this, "Upscale Auto Enhance583: ${if (!current) "ON" else "OFF"}")
}

