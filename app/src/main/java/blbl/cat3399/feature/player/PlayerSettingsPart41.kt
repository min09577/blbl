package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v556: Source Auto Select556
internal fun PlayerActivity.showV556SourceAutoSelect556Toggle() {
    val current = BiliClient.prefs.v556sourceAutoSelect556
    BiliClient.prefs.v556sourceAutoSelect556 = !current
    AppToast.show(this, "Source Auto Select556: ${if (!current) "ON" else "OFF"}")
}

// v556: Span Auto Adjust556
internal fun PlayerActivity.showV556SpanAutoAdjust556Toggle() {
    val current = BiliClient.prefs.v556spanAutoAdjust556
    BiliClient.prefs.v556spanAutoAdjust556 = !current
    AppToast.show(this, "Span Auto Adjust556: ${if (!current) "ON" else "OFF"}")
}

// v556: Split Auto View556
internal fun PlayerActivity.showV556SplitAutoView556Toggle() {
    val current = BiliClient.prefs.v556splitAutoView556
    BiliClient.prefs.v556splitAutoView556 = !current
    AppToast.show(this, "Split Auto View556: ${if (!current) "ON" else "OFF"}")
}

// v556: Stack Auto Layer556
internal fun PlayerActivity.showV556StackAutoLayer556Toggle() {
    val current = BiliClient.prefs.v556stackAutoLayer556
    BiliClient.prefs.v556stackAutoLayer556 = !current
    AppToast.show(this, "Stack Auto Layer556: ${if (!current) "ON" else "OFF"}")
}

// v556: Stage Auto Advance556
internal fun PlayerActivity.showV556StageAutoAdvance556Toggle() {
    val current = BiliClient.prefs.v556stageAutoAdvance556
    BiliClient.prefs.v556stageAutoAdvance556 = !current
    AppToast.show(this, "Stage Auto Advance556: ${if (!current) "ON" else "OFF"}")
}

// v556: Start Auto Play556
internal fun PlayerActivity.showV556StartAutoPlay556Toggle() {
    val current = BiliClient.prefs.v556startAutoPlay556
    BiliClient.prefs.v556startAutoPlay556 = !current
    AppToast.show(this, "Start Auto Play556: ${if (!current) "ON" else "OFF"}")
}

// v556: State Auto Persist556
internal fun PlayerActivity.showV556StateAutoPersist556Toggle() {
    val current = BiliClient.prefs.v556stateAutoPersist556
    BiliClient.prefs.v556stateAutoPersist556 = !current
    AppToast.show(this, "State Auto Persist556: ${if (!current) "ON" else "OFF"}")
}

// v557: Skip Silence Auto557
internal fun PlayerActivity.showV557SkipSilenceAuto557Toggle() {
    val current = BiliClient.prefs.v557skipSilenceAuto557
    BiliClient.prefs.v557skipSilenceAuto557 = !current
    AppToast.show(this, "Skip Silence Auto557: ${if (!current) "ON" else "OFF"}")
}

// v557: Slice Auto Segment557
internal fun PlayerActivity.showV557SliceAutoSegment557Toggle() {
    val current = BiliClient.prefs.v557sliceAutoSegment557
    BiliClient.prefs.v557sliceAutoSegment557 = !current
    AppToast.show(this, "Slice Auto Segment557: ${if (!current) "ON" else "OFF"}")
}

// v557: Slide Auto Transition557
internal fun PlayerActivity.showV557SlideAutoTransition557Toggle() {
    val current = BiliClient.prefs.v557slideAutoTransition557
    BiliClient.prefs.v557slideAutoTransition557 = !current
    AppToast.show(this, "Slide Auto Transition557: ${if (!current) "ON" else "OFF"}")
}

// v557: Slot Auto Manage557
internal fun PlayerActivity.showV557SlotAutoManage557Toggle() {
    val current = BiliClient.prefs.v557slotAutoManage557
    BiliClient.prefs.v557slotAutoManage557 = !current
    AppToast.show(this, "Slot Auto Manage557: ${if (!current) "ON" else "OFF"}")
}

// v557: Smart Auto Quality557
internal fun PlayerActivity.showV557SmartAutoQuality557Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v557smartAutoQuality557).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality557",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v557smartAutoQuality557 = value
        AppToast.show(this, "Smart Auto Quality557: $value")
    }
}

// v557: Smooth Scroll Enabled557
internal fun PlayerActivity.showV557SmoothScrollEnabled557Toggle() {
    val current = BiliClient.prefs.v557smoothScrollEnabled557
    BiliClient.prefs.v557smoothScrollEnabled557 = !current
    AppToast.show(this, "Smooth Scroll Enabled557: ${if (!current) "ON" else "OFF"}")
}

// v557: Snap Auto Align557
internal fun PlayerActivity.showV557SnapAutoAlign557Toggle() {
    val current = BiliClient.prefs.v557snapAutoAlign557
    BiliClient.prefs.v557snapAutoAlign557 = !current
    AppToast.show(this, "Snap Auto Align557: ${if (!current) "ON" else "OFF"}")
}

// v557: Sort Auto Algorithm557
internal fun PlayerActivity.showV557SortAutoAlgorithm557Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v557sortAutoAlgorithm557).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm557",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v557sortAutoAlgorithm557 = value
        AppToast.show(this, "Sort Auto Algorithm557: $value")
    }
}

// v557: Source Auto Select557
internal fun PlayerActivity.showV557SourceAutoSelect557Toggle() {
    val current = BiliClient.prefs.v557sourceAutoSelect557
    BiliClient.prefs.v557sourceAutoSelect557 = !current
    AppToast.show(this, "Source Auto Select557: ${if (!current) "ON" else "OFF"}")
}

// v557: Span Auto Adjust557
internal fun PlayerActivity.showV557SpanAutoAdjust557Toggle() {
    val current = BiliClient.prefs.v557spanAutoAdjust557
    BiliClient.prefs.v557spanAutoAdjust557 = !current
    AppToast.show(this, "Span Auto Adjust557: ${if (!current) "ON" else "OFF"}")
}

// v557: Split Auto View557
internal fun PlayerActivity.showV557SplitAutoView557Toggle() {
    val current = BiliClient.prefs.v557splitAutoView557
    BiliClient.prefs.v557splitAutoView557 = !current
    AppToast.show(this, "Split Auto View557: ${if (!current) "ON" else "OFF"}")
}

// v557: Stack Auto Layer557
internal fun PlayerActivity.showV557StackAutoLayer557Toggle() {
    val current = BiliClient.prefs.v557stackAutoLayer557
    BiliClient.prefs.v557stackAutoLayer557 = !current
    AppToast.show(this, "Stack Auto Layer557: ${if (!current) "ON" else "OFF"}")
}

// v557: Stage Auto Advance557
internal fun PlayerActivity.showV557StageAutoAdvance557Toggle() {
    val current = BiliClient.prefs.v557stageAutoAdvance557
    BiliClient.prefs.v557stageAutoAdvance557 = !current
    AppToast.show(this, "Stage Auto Advance557: ${if (!current) "ON" else "OFF"}")
}

// v557: Start Auto Play557
internal fun PlayerActivity.showV557StartAutoPlay557Toggle() {
    val current = BiliClient.prefs.v557startAutoPlay557
    BiliClient.prefs.v557startAutoPlay557 = !current
    AppToast.show(this, "Start Auto Play557: ${if (!current) "ON" else "OFF"}")
}

// v557: State Auto Persist557
internal fun PlayerActivity.showV557StateAutoPersist557Toggle() {
    val current = BiliClient.prefs.v557stateAutoPersist557
    BiliClient.prefs.v557stateAutoPersist557 = !current
    AppToast.show(this, "State Auto Persist557: ${if (!current) "ON" else "OFF"}")
}

// v558: Skip Silence Auto558
internal fun PlayerActivity.showV558SkipSilenceAuto558Toggle() {
    val current = BiliClient.prefs.v558skipSilenceAuto558
    BiliClient.prefs.v558skipSilenceAuto558 = !current
    AppToast.show(this, "Skip Silence Auto558: ${if (!current) "ON" else "OFF"}")
}

// v558: Slice Auto Segment558
internal fun PlayerActivity.showV558SliceAutoSegment558Toggle() {
    val current = BiliClient.prefs.v558sliceAutoSegment558
    BiliClient.prefs.v558sliceAutoSegment558 = !current
    AppToast.show(this, "Slice Auto Segment558: ${if (!current) "ON" else "OFF"}")
}

// v558: Slide Auto Transition558
internal fun PlayerActivity.showV558SlideAutoTransition558Toggle() {
    val current = BiliClient.prefs.v558slideAutoTransition558
    BiliClient.prefs.v558slideAutoTransition558 = !current
    AppToast.show(this, "Slide Auto Transition558: ${if (!current) "ON" else "OFF"}")
}

// v558: Slot Auto Manage558
internal fun PlayerActivity.showV558SlotAutoManage558Toggle() {
    val current = BiliClient.prefs.v558slotAutoManage558
    BiliClient.prefs.v558slotAutoManage558 = !current
    AppToast.show(this, "Slot Auto Manage558: ${if (!current) "ON" else "OFF"}")
}

// v558: Smart Auto Quality558
internal fun PlayerActivity.showV558SmartAutoQuality558Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v558smartAutoQuality558).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality558",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v558smartAutoQuality558 = value
        AppToast.show(this, "Smart Auto Quality558: $value")
    }
}

// v558: Smooth Scroll Enabled558
internal fun PlayerActivity.showV558SmoothScrollEnabled558Toggle() {
    val current = BiliClient.prefs.v558smoothScrollEnabled558
    BiliClient.prefs.v558smoothScrollEnabled558 = !current
    AppToast.show(this, "Smooth Scroll Enabled558: ${if (!current) "ON" else "OFF"}")
}

// v558: Snap Auto Align558
internal fun PlayerActivity.showV558SnapAutoAlign558Toggle() {
    val current = BiliClient.prefs.v558snapAutoAlign558
    BiliClient.prefs.v558snapAutoAlign558 = !current
    AppToast.show(this, "Snap Auto Align558: ${if (!current) "ON" else "OFF"}")
}

// v558: Sort Auto Algorithm558
internal fun PlayerActivity.showV558SortAutoAlgorithm558Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v558sortAutoAlgorithm558).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm558",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v558sortAutoAlgorithm558 = value
        AppToast.show(this, "Sort Auto Algorithm558: $value")
    }
}

// v558: Source Auto Select558
internal fun PlayerActivity.showV558SourceAutoSelect558Toggle() {
    val current = BiliClient.prefs.v558sourceAutoSelect558
    BiliClient.prefs.v558sourceAutoSelect558 = !current
    AppToast.show(this, "Source Auto Select558: ${if (!current) "ON" else "OFF"}")
}

// v558: Span Auto Adjust558
internal fun PlayerActivity.showV558SpanAutoAdjust558Toggle() {
    val current = BiliClient.prefs.v558spanAutoAdjust558
    BiliClient.prefs.v558spanAutoAdjust558 = !current
    AppToast.show(this, "Span Auto Adjust558: ${if (!current) "ON" else "OFF"}")
}

// v558: Split Auto View558
internal fun PlayerActivity.showV558SplitAutoView558Toggle() {
    val current = BiliClient.prefs.v558splitAutoView558
    BiliClient.prefs.v558splitAutoView558 = !current
    AppToast.show(this, "Split Auto View558: ${if (!current) "ON" else "OFF"}")
}

// v558: Stack Auto Layer558
internal fun PlayerActivity.showV558StackAutoLayer558Toggle() {
    val current = BiliClient.prefs.v558stackAutoLayer558
    BiliClient.prefs.v558stackAutoLayer558 = !current
    AppToast.show(this, "Stack Auto Layer558: ${if (!current) "ON" else "OFF"}")
}

// v558: Stage Auto Advance558
internal fun PlayerActivity.showV558StageAutoAdvance558Toggle() {
    val current = BiliClient.prefs.v558stageAutoAdvance558
    BiliClient.prefs.v558stageAutoAdvance558 = !current
    AppToast.show(this, "Stage Auto Advance558: ${if (!current) "ON" else "OFF"}")
}

// v558: Start Auto Play558
internal fun PlayerActivity.showV558StartAutoPlay558Toggle() {
    val current = BiliClient.prefs.v558startAutoPlay558
    BiliClient.prefs.v558startAutoPlay558 = !current
    AppToast.show(this, "Start Auto Play558: ${if (!current) "ON" else "OFF"}")
}

// v558: State Auto Persist558
internal fun PlayerActivity.showV558StateAutoPersist558Toggle() {
    val current = BiliClient.prefs.v558stateAutoPersist558
    BiliClient.prefs.v558stateAutoPersist558 = !current
    AppToast.show(this, "State Auto Persist558: ${if (!current) "ON" else "OFF"}")
}

// v559: Skip Silence Auto559
internal fun PlayerActivity.showV559SkipSilenceAuto559Toggle() {
    val current = BiliClient.prefs.v559skipSilenceAuto559
    BiliClient.prefs.v559skipSilenceAuto559 = !current
    AppToast.show(this, "Skip Silence Auto559: ${if (!current) "ON" else "OFF"}")
}

// v559: Slice Auto Segment559
internal fun PlayerActivity.showV559SliceAutoSegment559Toggle() {
    val current = BiliClient.prefs.v559sliceAutoSegment559
    BiliClient.prefs.v559sliceAutoSegment559 = !current
    AppToast.show(this, "Slice Auto Segment559: ${if (!current) "ON" else "OFF"}")
}

// v559: Slide Auto Transition559
internal fun PlayerActivity.showV559SlideAutoTransition559Toggle() {
    val current = BiliClient.prefs.v559slideAutoTransition559
    BiliClient.prefs.v559slideAutoTransition559 = !current
    AppToast.show(this, "Slide Auto Transition559: ${if (!current) "ON" else "OFF"}")
}

// v559: Slot Auto Manage559
internal fun PlayerActivity.showV559SlotAutoManage559Toggle() {
    val current = BiliClient.prefs.v559slotAutoManage559
    BiliClient.prefs.v559slotAutoManage559 = !current
    AppToast.show(this, "Slot Auto Manage559: ${if (!current) "ON" else "OFF"}")
}

// v559: Smart Auto Quality559
internal fun PlayerActivity.showV559SmartAutoQuality559Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v559smartAutoQuality559).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality559",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v559smartAutoQuality559 = value
        AppToast.show(this, "Smart Auto Quality559: $value")
    }
}

// v559: Smooth Scroll Enabled559
internal fun PlayerActivity.showV559SmoothScrollEnabled559Toggle() {
    val current = BiliClient.prefs.v559smoothScrollEnabled559
    BiliClient.prefs.v559smoothScrollEnabled559 = !current
    AppToast.show(this, "Smooth Scroll Enabled559: ${if (!current) "ON" else "OFF"}")
}

// v559: Snap Auto Align559
internal fun PlayerActivity.showV559SnapAutoAlign559Toggle() {
    val current = BiliClient.prefs.v559snapAutoAlign559
    BiliClient.prefs.v559snapAutoAlign559 = !current
    AppToast.show(this, "Snap Auto Align559: ${if (!current) "ON" else "OFF"}")
}

// v559: Sort Auto Algorithm559
internal fun PlayerActivity.showV559SortAutoAlgorithm559Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v559sortAutoAlgorithm559).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm559",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v559sortAutoAlgorithm559 = value
        AppToast.show(this, "Sort Auto Algorithm559: $value")
    }
}

// v559: Source Auto Select559
internal fun PlayerActivity.showV559SourceAutoSelect559Toggle() {
    val current = BiliClient.prefs.v559sourceAutoSelect559
    BiliClient.prefs.v559sourceAutoSelect559 = !current
    AppToast.show(this, "Source Auto Select559: ${if (!current) "ON" else "OFF"}")
}

// v559: Span Auto Adjust559
internal fun PlayerActivity.showV559SpanAutoAdjust559Toggle() {
    val current = BiliClient.prefs.v559spanAutoAdjust559
    BiliClient.prefs.v559spanAutoAdjust559 = !current
    AppToast.show(this, "Span Auto Adjust559: ${if (!current) "ON" else "OFF"}")
}

// v559: Split Auto View559
internal fun PlayerActivity.showV559SplitAutoView559Toggle() {
    val current = BiliClient.prefs.v559splitAutoView559
    BiliClient.prefs.v559splitAutoView559 = !current
    AppToast.show(this, "Split Auto View559: ${if (!current) "ON" else "OFF"}")
}

// v559: Stack Auto Layer559
internal fun PlayerActivity.showV559StackAutoLayer559Toggle() {
    val current = BiliClient.prefs.v559stackAutoLayer559
    BiliClient.prefs.v559stackAutoLayer559 = !current
    AppToast.show(this, "Stack Auto Layer559: ${if (!current) "ON" else "OFF"}")
}

// v559: Stage Auto Advance559
internal fun PlayerActivity.showV559StageAutoAdvance559Toggle() {
    val current = BiliClient.prefs.v559stageAutoAdvance559
    BiliClient.prefs.v559stageAutoAdvance559 = !current
    AppToast.show(this, "Stage Auto Advance559: ${if (!current) "ON" else "OFF"}")
}

// v559: Start Auto Play559
internal fun PlayerActivity.showV559StartAutoPlay559Toggle() {
    val current = BiliClient.prefs.v559startAutoPlay559
    BiliClient.prefs.v559startAutoPlay559 = !current
    AppToast.show(this, "Start Auto Play559: ${if (!current) "ON" else "OFF"}")
}

// v559: State Auto Persist559
internal fun PlayerActivity.showV559StateAutoPersist559Toggle() {
    val current = BiliClient.prefs.v559stateAutoPersist559
    BiliClient.prefs.v559stateAutoPersist559 = !current
    AppToast.show(this, "State Auto Persist559: ${if (!current) "ON" else "OFF"}")
}

// v560: Skip Silence Auto560
internal fun PlayerActivity.showV560SkipSilenceAuto560Toggle() {
    val current = BiliClient.prefs.v560skipSilenceAuto560
    BiliClient.prefs.v560skipSilenceAuto560 = !current
    AppToast.show(this, "Skip Silence Auto560: ${if (!current) "ON" else "OFF"}")
}

// v560: Slice Auto Segment560
internal fun PlayerActivity.showV560SliceAutoSegment560Toggle() {
    val current = BiliClient.prefs.v560sliceAutoSegment560
    BiliClient.prefs.v560sliceAutoSegment560 = !current
    AppToast.show(this, "Slice Auto Segment560: ${if (!current) "ON" else "OFF"}")
}

// v560: Slide Auto Transition560
internal fun PlayerActivity.showV560SlideAutoTransition560Toggle() {
    val current = BiliClient.prefs.v560slideAutoTransition560
    BiliClient.prefs.v560slideAutoTransition560 = !current
    AppToast.show(this, "Slide Auto Transition560: ${if (!current) "ON" else "OFF"}")
}

// v560: Slot Auto Manage560
internal fun PlayerActivity.showV560SlotAutoManage560Toggle() {
    val current = BiliClient.prefs.v560slotAutoManage560
    BiliClient.prefs.v560slotAutoManage560 = !current
    AppToast.show(this, "Slot Auto Manage560: ${if (!current) "ON" else "OFF"}")
}

// v560: Smart Auto Quality560
internal fun PlayerActivity.showV560SmartAutoQuality560Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v560smartAutoQuality560).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality560",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v560smartAutoQuality560 = value
        AppToast.show(this, "Smart Auto Quality560: $value")
    }
}

// v560: Smooth Scroll Enabled560
internal fun PlayerActivity.showV560SmoothScrollEnabled560Toggle() {
    val current = BiliClient.prefs.v560smoothScrollEnabled560
    BiliClient.prefs.v560smoothScrollEnabled560 = !current
    AppToast.show(this, "Smooth Scroll Enabled560: ${if (!current) "ON" else "OFF"}")
}

// v560: Snap Auto Align560
internal fun PlayerActivity.showV560SnapAutoAlign560Toggle() {
    val current = BiliClient.prefs.v560snapAutoAlign560
    BiliClient.prefs.v560snapAutoAlign560 = !current
    AppToast.show(this, "Snap Auto Align560: ${if (!current) "ON" else "OFF"}")
}

// v560: Sort Auto Algorithm560
internal fun PlayerActivity.showV560SortAutoAlgorithm560Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v560sortAutoAlgorithm560).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm560",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v560sortAutoAlgorithm560 = value
        AppToast.show(this, "Sort Auto Algorithm560: $value")
    }
}

// v560: Source Auto Select560
internal fun PlayerActivity.showV560SourceAutoSelect560Toggle() {
    val current = BiliClient.prefs.v560sourceAutoSelect560
    BiliClient.prefs.v560sourceAutoSelect560 = !current
    AppToast.show(this, "Source Auto Select560: ${if (!current) "ON" else "OFF"}")
}

// v560: Span Auto Adjust560
internal fun PlayerActivity.showV560SpanAutoAdjust560Toggle() {
    val current = BiliClient.prefs.v560spanAutoAdjust560
    BiliClient.prefs.v560spanAutoAdjust560 = !current
    AppToast.show(this, "Span Auto Adjust560: ${if (!current) "ON" else "OFF"}")
}

// v560: Split Auto View560
internal fun PlayerActivity.showV560SplitAutoView560Toggle() {
    val current = BiliClient.prefs.v560splitAutoView560
    BiliClient.prefs.v560splitAutoView560 = !current
    AppToast.show(this, "Split Auto View560: ${if (!current) "ON" else "OFF"}")
}

// v560: Stack Auto Layer560
internal fun PlayerActivity.showV560StackAutoLayer560Toggle() {
    val current = BiliClient.prefs.v560stackAutoLayer560
    BiliClient.prefs.v560stackAutoLayer560 = !current
    AppToast.show(this, "Stack Auto Layer560: ${if (!current) "ON" else "OFF"}")
}

// v560: Stage Auto Advance560
internal fun PlayerActivity.showV560StageAutoAdvance560Toggle() {
    val current = BiliClient.prefs.v560stageAutoAdvance560
    BiliClient.prefs.v560stageAutoAdvance560 = !current
    AppToast.show(this, "Stage Auto Advance560: ${if (!current) "ON" else "OFF"}")
}

// v560: Start Auto Play560
internal fun PlayerActivity.showV560StartAutoPlay560Toggle() {
    val current = BiliClient.prefs.v560startAutoPlay560
    BiliClient.prefs.v560startAutoPlay560 = !current
    AppToast.show(this, "Start Auto Play560: ${if (!current) "ON" else "OFF"}")
}

// v560: State Auto Persist560
internal fun PlayerActivity.showV560StateAutoPersist560Toggle() {
    val current = BiliClient.prefs.v560stateAutoPersist560
    BiliClient.prefs.v560stateAutoPersist560 = !current
    AppToast.show(this, "State Auto Persist560: ${if (!current) "ON" else "OFF"}")
}

// v561: Static IP Auto Detect561
internal fun PlayerActivity.showV561StaticIpAutoDetect561Toggle() {
    val current = BiliClient.prefs.v561staticIpAutoDetect561
    BiliClient.prefs.v561staticIpAutoDetect561 = !current
    AppToast.show(this, "Static IP Auto Detect561: ${if (!current) "ON" else "OFF"}")
}

// v561: Step Auto Increment561
internal fun PlayerActivity.showV561StepAutoIncrement561Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v561stepAutoIncrement561).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment561",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v561stepAutoIncrement561 = value
        AppToast.show(this, "Step Auto Increment561: $value")
    }
}

// v561: Stop Auto Confirm561
internal fun PlayerActivity.showV561StopAutoConfirm561Toggle() {
    val current = BiliClient.prefs.v561stopAutoConfirm561
    BiliClient.prefs.v561stopAutoConfirm561 = !current
    AppToast.show(this, "Stop Auto Confirm561: ${if (!current) "ON" else "OFF"}")
}

// v561: Store Auto Sync561
internal fun PlayerActivity.showV561StoreAutoSync561Toggle() {
    val current = BiliClient.prefs.v561storeAutoSync561
    BiliClient.prefs.v561storeAutoSync561 = !current
    AppToast.show(this, "Store Auto Sync561: ${if (!current) "ON" else "OFF"}")
}

// v561: Style Auto Theme561
internal fun PlayerActivity.showV561StyleAutoTheme561Toggle() {
    val current = BiliClient.prefs.v561styleAutoTheme561
    BiliClient.prefs.v561styleAutoTheme561 = !current
    AppToast.show(this, "Style Auto Theme561: ${if (!current) "ON" else "OFF"}")
}

// v561: Submit Auto Validate561
internal fun PlayerActivity.showV561SubmitAutoValidate561Toggle() {
    val current = BiliClient.prefs.v561submitAutoValidate561
    BiliClient.prefs.v561submitAutoValidate561 = !current
    AppToast.show(this, "Submit Auto Validate561: ${if (!current) "ON" else "OFF"}")
}

// v561: Suffix Auto Append561
internal fun PlayerActivity.showV561SuffixAutoAppend561Toggle() {
    val current = BiliClient.prefs.v561suffixAutoAppend561
    BiliClient.prefs.v561suffixAutoAppend561 = !current
    AppToast.show(this, "Suffix Auto Append561: ${if (!current) "ON" else "OFF"}")
}

// v561: Summary Auto Generate561
internal fun PlayerActivity.showV561SummaryAutoGenerate561Toggle() {
    val current = BiliClient.prefs.v561summaryAutoGenerate561
    BiliClient.prefs.v561summaryAutoGenerate561 = !current
    AppToast.show(this, "Summary Auto Generate561: ${if (!current) "ON" else "OFF"}")
}

// v561: Swap Auto Channel561
internal fun PlayerActivity.showV561SwapAutoChannel561Toggle() {
    val current = BiliClient.prefs.v561swapAutoChannel561
    BiliClient.prefs.v561swapAutoChannel561 = !current
    AppToast.show(this, "Swap Auto Channel561: ${if (!current) "ON" else "OFF"}")
}

// v561: Switch Auto Profile561
internal fun PlayerActivity.showV561SwitchAutoProfile561Toggle() {
    val current = BiliClient.prefs.v561switchAutoProfile561
    BiliClient.prefs.v561switchAutoProfile561 = !current
    AppToast.show(this, "Switch Auto Profile561: ${if (!current) "ON" else "OFF"}")
}

// v561: Tab Auto Restore561
internal fun PlayerActivity.showV561TabAutoRestore561Toggle() {
    val current = BiliClient.prefs.v561tabAutoRestore561
    BiliClient.prefs.v561tabAutoRestore561 = !current
    AppToast.show(this, "Tab Auto Restore561: ${if (!current) "ON" else "OFF"}")
}

// v561: Tag Auto Extract561
internal fun PlayerActivity.showV561TagAutoExtract561Toggle() {
    val current = BiliClient.prefs.v561tagAutoExtract561
    BiliClient.prefs.v561tagAutoExtract561 = !current
    AppToast.show(this, "Tag Auto Extract561: ${if (!current) "ON" else "OFF"}")
}

// v561: Target Auto Lock561
internal fun PlayerActivity.showV561TargetAutoLock561Toggle() {
    val current = BiliClient.prefs.v561targetAutoLock561
    BiliClient.prefs.v561targetAutoLock561 = !current
    AppToast.show(this, "Target Auto Lock561: ${if (!current) "ON" else "OFF"}")
}

// v561: Template Auto Fill561
internal fun PlayerActivity.showV561TemplateAutoFill561Toggle() {
    val current = BiliClient.prefs.v561templateAutoFill561
    BiliClient.prefs.v561templateAutoFill561 = !current
    AppToast.show(this, "Template Auto Fill561: ${if (!current) "ON" else "OFF"}")
}

// v561: Test Auto Run561
internal fun PlayerActivity.showV561TestAutoRun561Toggle() {
    val current = BiliClient.prefs.v561testAutoRun561
    BiliClient.prefs.v561testAutoRun561 = !current
    AppToast.show(this, "Test Auto Run561: ${if (!current) "ON" else "OFF"}")
}

// v562: Static IP Auto Detect562
internal fun PlayerActivity.showV562StaticIpAutoDetect562Toggle() {
    val current = BiliClient.prefs.v562staticIpAutoDetect562
    BiliClient.prefs.v562staticIpAutoDetect562 = !current
    AppToast.show(this, "Static IP Auto Detect562: ${if (!current) "ON" else "OFF"}")
}

// v562: Step Auto Increment562
internal fun PlayerActivity.showV562StepAutoIncrement562Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v562stepAutoIncrement562).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment562",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v562stepAutoIncrement562 = value
        AppToast.show(this, "Step Auto Increment562: $value")
    }
}

// v562: Stop Auto Confirm562
internal fun PlayerActivity.showV562StopAutoConfirm562Toggle() {
    val current = BiliClient.prefs.v562stopAutoConfirm562
    BiliClient.prefs.v562stopAutoConfirm562 = !current
    AppToast.show(this, "Stop Auto Confirm562: ${if (!current) "ON" else "OFF"}")
}

// v562: Store Auto Sync562
internal fun PlayerActivity.showV562StoreAutoSync562Toggle() {
    val current = BiliClient.prefs.v562storeAutoSync562
    BiliClient.prefs.v562storeAutoSync562 = !current
    AppToast.show(this, "Store Auto Sync562: ${if (!current) "ON" else "OFF"}")
}

// v562: Style Auto Theme562
internal fun PlayerActivity.showV562StyleAutoTheme562Toggle() {
    val current = BiliClient.prefs.v562styleAutoTheme562
    BiliClient.prefs.v562styleAutoTheme562 = !current
    AppToast.show(this, "Style Auto Theme562: ${if (!current) "ON" else "OFF"}")
}

// v562: Submit Auto Validate562
internal fun PlayerActivity.showV562SubmitAutoValidate562Toggle() {
    val current = BiliClient.prefs.v562submitAutoValidate562
    BiliClient.prefs.v562submitAutoValidate562 = !current
    AppToast.show(this, "Submit Auto Validate562: ${if (!current) "ON" else "OFF"}")
}

// v562: Suffix Auto Append562
internal fun PlayerActivity.showV562SuffixAutoAppend562Toggle() {
    val current = BiliClient.prefs.v562suffixAutoAppend562
    BiliClient.prefs.v562suffixAutoAppend562 = !current
    AppToast.show(this, "Suffix Auto Append562: ${if (!current) "ON" else "OFF"}")
}

// v562: Summary Auto Generate562
internal fun PlayerActivity.showV562SummaryAutoGenerate562Toggle() {
    val current = BiliClient.prefs.v562summaryAutoGenerate562
    BiliClient.prefs.v562summaryAutoGenerate562 = !current
    AppToast.show(this, "Summary Auto Generate562: ${if (!current) "ON" else "OFF"}")
}

// v562: Swap Auto Channel562
internal fun PlayerActivity.showV562SwapAutoChannel562Toggle() {
    val current = BiliClient.prefs.v562swapAutoChannel562
    BiliClient.prefs.v562swapAutoChannel562 = !current
    AppToast.show(this, "Swap Auto Channel562: ${if (!current) "ON" else "OFF"}")
}

// v562: Switch Auto Profile562
internal fun PlayerActivity.showV562SwitchAutoProfile562Toggle() {
    val current = BiliClient.prefs.v562switchAutoProfile562
    BiliClient.prefs.v562switchAutoProfile562 = !current
    AppToast.show(this, "Switch Auto Profile562: ${if (!current) "ON" else "OFF"}")
}

// v562: Tab Auto Restore562
internal fun PlayerActivity.showV562TabAutoRestore562Toggle() {
    val current = BiliClient.prefs.v562tabAutoRestore562
    BiliClient.prefs.v562tabAutoRestore562 = !current
    AppToast.show(this, "Tab Auto Restore562: ${if (!current) "ON" else "OFF"}")
}

// v562: Tag Auto Extract562
internal fun PlayerActivity.showV562TagAutoExtract562Toggle() {
    val current = BiliClient.prefs.v562tagAutoExtract562
    BiliClient.prefs.v562tagAutoExtract562 = !current
    AppToast.show(this, "Tag Auto Extract562: ${if (!current) "ON" else "OFF"}")
}

// v562: Target Auto Lock562
internal fun PlayerActivity.showV562TargetAutoLock562Toggle() {
    val current = BiliClient.prefs.v562targetAutoLock562
    BiliClient.prefs.v562targetAutoLock562 = !current
    AppToast.show(this, "Target Auto Lock562: ${if (!current) "ON" else "OFF"}")
}

// v562: Template Auto Fill562
internal fun PlayerActivity.showV562TemplateAutoFill562Toggle() {
    val current = BiliClient.prefs.v562templateAutoFill562
    BiliClient.prefs.v562templateAutoFill562 = !current
    AppToast.show(this, "Template Auto Fill562: ${if (!current) "ON" else "OFF"}")
}

// v562: Test Auto Run562
internal fun PlayerActivity.showV562TestAutoRun562Toggle() {
    val current = BiliClient.prefs.v562testAutoRun562
    BiliClient.prefs.v562testAutoRun562 = !current
    AppToast.show(this, "Test Auto Run562: ${if (!current) "ON" else "OFF"}")
}

// v563: Static IP Auto Detect563
internal fun PlayerActivity.showV563StaticIpAutoDetect563Toggle() {
    val current = BiliClient.prefs.v563staticIpAutoDetect563
    BiliClient.prefs.v563staticIpAutoDetect563 = !current
    AppToast.show(this, "Static IP Auto Detect563: ${if (!current) "ON" else "OFF"}")
}

// v563: Step Auto Increment563
internal fun PlayerActivity.showV563StepAutoIncrement563Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v563stepAutoIncrement563).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment563",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v563stepAutoIncrement563 = value
        AppToast.show(this, "Step Auto Increment563: $value")
    }
}

// v563: Stop Auto Confirm563
internal fun PlayerActivity.showV563StopAutoConfirm563Toggle() {
    val current = BiliClient.prefs.v563stopAutoConfirm563
    BiliClient.prefs.v563stopAutoConfirm563 = !current
    AppToast.show(this, "Stop Auto Confirm563: ${if (!current) "ON" else "OFF"}")
}

// v563: Store Auto Sync563
internal fun PlayerActivity.showV563StoreAutoSync563Toggle() {
    val current = BiliClient.prefs.v563storeAutoSync563
    BiliClient.prefs.v563storeAutoSync563 = !current
    AppToast.show(this, "Store Auto Sync563: ${if (!current) "ON" else "OFF"}")
}

// v563: Style Auto Theme563
internal fun PlayerActivity.showV563StyleAutoTheme563Toggle() {
    val current = BiliClient.prefs.v563styleAutoTheme563
    BiliClient.prefs.v563styleAutoTheme563 = !current
    AppToast.show(this, "Style Auto Theme563: ${if (!current) "ON" else "OFF"}")
}

// v563: Submit Auto Validate563
internal fun PlayerActivity.showV563SubmitAutoValidate563Toggle() {
    val current = BiliClient.prefs.v563submitAutoValidate563
    BiliClient.prefs.v563submitAutoValidate563 = !current
    AppToast.show(this, "Submit Auto Validate563: ${if (!current) "ON" else "OFF"}")
}

// v563: Suffix Auto Append563
internal fun PlayerActivity.showV563SuffixAutoAppend563Toggle() {
    val current = BiliClient.prefs.v563suffixAutoAppend563
    BiliClient.prefs.v563suffixAutoAppend563 = !current
    AppToast.show(this, "Suffix Auto Append563: ${if (!current) "ON" else "OFF"}")
}

// v563: Summary Auto Generate563
internal fun PlayerActivity.showV563SummaryAutoGenerate563Toggle() {
    val current = BiliClient.prefs.v563summaryAutoGenerate563
    BiliClient.prefs.v563summaryAutoGenerate563 = !current
    AppToast.show(this, "Summary Auto Generate563: ${if (!current) "ON" else "OFF"}")
}

// v563: Swap Auto Channel563
internal fun PlayerActivity.showV563SwapAutoChannel563Toggle() {
    val current = BiliClient.prefs.v563swapAutoChannel563
    BiliClient.prefs.v563swapAutoChannel563 = !current
    AppToast.show(this, "Swap Auto Channel563: ${if (!current) "ON" else "OFF"}")
}

// v563: Switch Auto Profile563
internal fun PlayerActivity.showV563SwitchAutoProfile563Toggle() {
    val current = BiliClient.prefs.v563switchAutoProfile563
    BiliClient.prefs.v563switchAutoProfile563 = !current
    AppToast.show(this, "Switch Auto Profile563: ${if (!current) "ON" else "OFF"}")
}

// v563: Tab Auto Restore563
internal fun PlayerActivity.showV563TabAutoRestore563Toggle() {
    val current = BiliClient.prefs.v563tabAutoRestore563
    BiliClient.prefs.v563tabAutoRestore563 = !current
    AppToast.show(this, "Tab Auto Restore563: ${if (!current) "ON" else "OFF"}")
}

// v563: Tag Auto Extract563
internal fun PlayerActivity.showV563TagAutoExtract563Toggle() {
    val current = BiliClient.prefs.v563tagAutoExtract563
    BiliClient.prefs.v563tagAutoExtract563 = !current
    AppToast.show(this, "Tag Auto Extract563: ${if (!current) "ON" else "OFF"}")
}

// v563: Target Auto Lock563
internal fun PlayerActivity.showV563TargetAutoLock563Toggle() {
    val current = BiliClient.prefs.v563targetAutoLock563
    BiliClient.prefs.v563targetAutoLock563 = !current
    AppToast.show(this, "Target Auto Lock563: ${if (!current) "ON" else "OFF"}")
}

// v563: Template Auto Fill563
internal fun PlayerActivity.showV563TemplateAutoFill563Toggle() {
    val current = BiliClient.prefs.v563templateAutoFill563
    BiliClient.prefs.v563templateAutoFill563 = !current
    AppToast.show(this, "Template Auto Fill563: ${if (!current) "ON" else "OFF"}")
}

// v563: Test Auto Run563
internal fun PlayerActivity.showV563TestAutoRun563Toggle() {
    val current = BiliClient.prefs.v563testAutoRun563
    BiliClient.prefs.v563testAutoRun563 = !current
    AppToast.show(this, "Test Auto Run563: ${if (!current) "ON" else "OFF"}")
}

// v564: Static IP Auto Detect564
internal fun PlayerActivity.showV564StaticIpAutoDetect564Toggle() {
    val current = BiliClient.prefs.v564staticIpAutoDetect564
    BiliClient.prefs.v564staticIpAutoDetect564 = !current
    AppToast.show(this, "Static IP Auto Detect564: ${if (!current) "ON" else "OFF"}")
}

// v564: Step Auto Increment564
internal fun PlayerActivity.showV564StepAutoIncrement564Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v564stepAutoIncrement564).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment564",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v564stepAutoIncrement564 = value
        AppToast.show(this, "Step Auto Increment564: $value")
    }
}

// v564: Stop Auto Confirm564
internal fun PlayerActivity.showV564StopAutoConfirm564Toggle() {
    val current = BiliClient.prefs.v564stopAutoConfirm564
    BiliClient.prefs.v564stopAutoConfirm564 = !current
    AppToast.show(this, "Stop Auto Confirm564: ${if (!current) "ON" else "OFF"}")
}

// v564: Store Auto Sync564
internal fun PlayerActivity.showV564StoreAutoSync564Toggle() {
    val current = BiliClient.prefs.v564storeAutoSync564
    BiliClient.prefs.v564storeAutoSync564 = !current
    AppToast.show(this, "Store Auto Sync564: ${if (!current) "ON" else "OFF"}")
}

// v564: Style Auto Theme564
internal fun PlayerActivity.showV564StyleAutoTheme564Toggle() {
    val current = BiliClient.prefs.v564styleAutoTheme564
    BiliClient.prefs.v564styleAutoTheme564 = !current
    AppToast.show(this, "Style Auto Theme564: ${if (!current) "ON" else "OFF"}")
}

// v564: Submit Auto Validate564
internal fun PlayerActivity.showV564SubmitAutoValidate564Toggle() {
    val current = BiliClient.prefs.v564submitAutoValidate564
    BiliClient.prefs.v564submitAutoValidate564 = !current
    AppToast.show(this, "Submit Auto Validate564: ${if (!current) "ON" else "OFF"}")
}

// v564: Suffix Auto Append564
internal fun PlayerActivity.showV564SuffixAutoAppend564Toggle() {
    val current = BiliClient.prefs.v564suffixAutoAppend564
    BiliClient.prefs.v564suffixAutoAppend564 = !current
    AppToast.show(this, "Suffix Auto Append564: ${if (!current) "ON" else "OFF"}")
}

// v564: Summary Auto Generate564
internal fun PlayerActivity.showV564SummaryAutoGenerate564Toggle() {
    val current = BiliClient.prefs.v564summaryAutoGenerate564
    BiliClient.prefs.v564summaryAutoGenerate564 = !current
    AppToast.show(this, "Summary Auto Generate564: ${if (!current) "ON" else "OFF"}")
}

// v564: Swap Auto Channel564
internal fun PlayerActivity.showV564SwapAutoChannel564Toggle() {
    val current = BiliClient.prefs.v564swapAutoChannel564
    BiliClient.prefs.v564swapAutoChannel564 = !current
    AppToast.show(this, "Swap Auto Channel564: ${if (!current) "ON" else "OFF"}")
}

// v564: Switch Auto Profile564
internal fun PlayerActivity.showV564SwitchAutoProfile564Toggle() {
    val current = BiliClient.prefs.v564switchAutoProfile564
    BiliClient.prefs.v564switchAutoProfile564 = !current
    AppToast.show(this, "Switch Auto Profile564: ${if (!current) "ON" else "OFF"}")
}

// v564: Tab Auto Restore564
internal fun PlayerActivity.showV564TabAutoRestore564Toggle() {
    val current = BiliClient.prefs.v564tabAutoRestore564
    BiliClient.prefs.v564tabAutoRestore564 = !current
    AppToast.show(this, "Tab Auto Restore564: ${if (!current) "ON" else "OFF"}")
}

// v564: Tag Auto Extract564
internal fun PlayerActivity.showV564TagAutoExtract564Toggle() {
    val current = BiliClient.prefs.v564tagAutoExtract564
    BiliClient.prefs.v564tagAutoExtract564 = !current
    AppToast.show(this, "Tag Auto Extract564: ${if (!current) "ON" else "OFF"}")
}

// v564: Target Auto Lock564
internal fun PlayerActivity.showV564TargetAutoLock564Toggle() {
    val current = BiliClient.prefs.v564targetAutoLock564
    BiliClient.prefs.v564targetAutoLock564 = !current
    AppToast.show(this, "Target Auto Lock564: ${if (!current) "ON" else "OFF"}")
}

// v564: Template Auto Fill564
internal fun PlayerActivity.showV564TemplateAutoFill564Toggle() {
    val current = BiliClient.prefs.v564templateAutoFill564
    BiliClient.prefs.v564templateAutoFill564 = !current
    AppToast.show(this, "Template Auto Fill564: ${if (!current) "ON" else "OFF"}")
}

// v564: Test Auto Run564
internal fun PlayerActivity.showV564TestAutoRun564Toggle() {
    val current = BiliClient.prefs.v564testAutoRun564
    BiliClient.prefs.v564testAutoRun564 = !current
    AppToast.show(this, "Test Auto Run564: ${if (!current) "ON" else "OFF"}")
}

// v565: Static IP Auto Detect565
internal fun PlayerActivity.showV565StaticIpAutoDetect565Toggle() {
    val current = BiliClient.prefs.v565staticIpAutoDetect565
    BiliClient.prefs.v565staticIpAutoDetect565 = !current
    AppToast.show(this, "Static IP Auto Detect565: ${if (!current) "ON" else "OFF"}")
}

// v565: Step Auto Increment565
internal fun PlayerActivity.showV565StepAutoIncrement565Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v565stepAutoIncrement565).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment565",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v565stepAutoIncrement565 = value
        AppToast.show(this, "Step Auto Increment565: $value")
    }
}

// v565: Stop Auto Confirm565
internal fun PlayerActivity.showV565StopAutoConfirm565Toggle() {
    val current = BiliClient.prefs.v565stopAutoConfirm565
    BiliClient.prefs.v565stopAutoConfirm565 = !current
    AppToast.show(this, "Stop Auto Confirm565: ${if (!current) "ON" else "OFF"}")
}

// v565: Store Auto Sync565
internal fun PlayerActivity.showV565StoreAutoSync565Toggle() {
    val current = BiliClient.prefs.v565storeAutoSync565
    BiliClient.prefs.v565storeAutoSync565 = !current
    AppToast.show(this, "Store Auto Sync565: ${if (!current) "ON" else "OFF"}")
}

// v565: Style Auto Theme565
internal fun PlayerActivity.showV565StyleAutoTheme565Toggle() {
    val current = BiliClient.prefs.v565styleAutoTheme565
    BiliClient.prefs.v565styleAutoTheme565 = !current
    AppToast.show(this, "Style Auto Theme565: ${if (!current) "ON" else "OFF"}")
}

// v565: Submit Auto Validate565
internal fun PlayerActivity.showV565SubmitAutoValidate565Toggle() {
    val current = BiliClient.prefs.v565submitAutoValidate565
    BiliClient.prefs.v565submitAutoValidate565 = !current
    AppToast.show(this, "Submit Auto Validate565: ${if (!current) "ON" else "OFF"}")
}

// v565: Suffix Auto Append565
internal fun PlayerActivity.showV565SuffixAutoAppend565Toggle() {
    val current = BiliClient.prefs.v565suffixAutoAppend565
    BiliClient.prefs.v565suffixAutoAppend565 = !current
    AppToast.show(this, "Suffix Auto Append565: ${if (!current) "ON" else "OFF"}")
}

// v565: Summary Auto Generate565
internal fun PlayerActivity.showV565SummaryAutoGenerate565Toggle() {
    val current = BiliClient.prefs.v565summaryAutoGenerate565
    BiliClient.prefs.v565summaryAutoGenerate565 = !current
    AppToast.show(this, "Summary Auto Generate565: ${if (!current) "ON" else "OFF"}")
}

// v565: Swap Auto Channel565
internal fun PlayerActivity.showV565SwapAutoChannel565Toggle() {
    val current = BiliClient.prefs.v565swapAutoChannel565
    BiliClient.prefs.v565swapAutoChannel565 = !current
    AppToast.show(this, "Swap Auto Channel565: ${if (!current) "ON" else "OFF"}")
}

// v565: Switch Auto Profile565
internal fun PlayerActivity.showV565SwitchAutoProfile565Toggle() {
    val current = BiliClient.prefs.v565switchAutoProfile565
    BiliClient.prefs.v565switchAutoProfile565 = !current
    AppToast.show(this, "Switch Auto Profile565: ${if (!current) "ON" else "OFF"}")
}

// v565: Tab Auto Restore565
internal fun PlayerActivity.showV565TabAutoRestore565Toggle() {
    val current = BiliClient.prefs.v565tabAutoRestore565
    BiliClient.prefs.v565tabAutoRestore565 = !current
    AppToast.show(this, "Tab Auto Restore565: ${if (!current) "ON" else "OFF"}")
}

// v565: Tag Auto Extract565
internal fun PlayerActivity.showV565TagAutoExtract565Toggle() {
    val current = BiliClient.prefs.v565tagAutoExtract565
    BiliClient.prefs.v565tagAutoExtract565 = !current
    AppToast.show(this, "Tag Auto Extract565: ${if (!current) "ON" else "OFF"}")
}

// v565: Target Auto Lock565
internal fun PlayerActivity.showV565TargetAutoLock565Toggle() {
    val current = BiliClient.prefs.v565targetAutoLock565
    BiliClient.prefs.v565targetAutoLock565 = !current
    AppToast.show(this, "Target Auto Lock565: ${if (!current) "ON" else "OFF"}")
}

// v565: Template Auto Fill565
internal fun PlayerActivity.showV565TemplateAutoFill565Toggle() {
    val current = BiliClient.prefs.v565templateAutoFill565
    BiliClient.prefs.v565templateAutoFill565 = !current
    AppToast.show(this, "Template Auto Fill565: ${if (!current) "ON" else "OFF"}")
}

// v565: Test Auto Run565
internal fun PlayerActivity.showV565TestAutoRun565Toggle() {
    val current = BiliClient.prefs.v565testAutoRun565
    BiliClient.prefs.v565testAutoRun565 = !current
    AppToast.show(this, "Test Auto Run565: ${if (!current) "ON" else "OFF"}")
}

// v566: Static IP Auto Detect566
internal fun PlayerActivity.showV566StaticIpAutoDetect566Toggle() {
    val current = BiliClient.prefs.v566staticIpAutoDetect566
    BiliClient.prefs.v566staticIpAutoDetect566 = !current
    AppToast.show(this, "Static IP Auto Detect566: ${if (!current) "ON" else "OFF"}")
}

// v566: Step Auto Increment566
internal fun PlayerActivity.showV566StepAutoIncrement566Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v566stepAutoIncrement566).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment566",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v566stepAutoIncrement566 = value
        AppToast.show(this, "Step Auto Increment566: $value")
    }
}

// v566: Stop Auto Confirm566
internal fun PlayerActivity.showV566StopAutoConfirm566Toggle() {
    val current = BiliClient.prefs.v566stopAutoConfirm566
    BiliClient.prefs.v566stopAutoConfirm566 = !current
    AppToast.show(this, "Stop Auto Confirm566: ${if (!current) "ON" else "OFF"}")
}

// v566: Store Auto Sync566
internal fun PlayerActivity.showV566StoreAutoSync566Toggle() {
    val current = BiliClient.prefs.v566storeAutoSync566
    BiliClient.prefs.v566storeAutoSync566 = !current
    AppToast.show(this, "Store Auto Sync566: ${if (!current) "ON" else "OFF"}")
}

// v566: Style Auto Theme566
internal fun PlayerActivity.showV566StyleAutoTheme566Toggle() {
    val current = BiliClient.prefs.v566styleAutoTheme566
    BiliClient.prefs.v566styleAutoTheme566 = !current
    AppToast.show(this, "Style Auto Theme566: ${if (!current) "ON" else "OFF"}")
}

// v566: Submit Auto Validate566
internal fun PlayerActivity.showV566SubmitAutoValidate566Toggle() {
    val current = BiliClient.prefs.v566submitAutoValidate566
    BiliClient.prefs.v566submitAutoValidate566 = !current
    AppToast.show(this, "Submit Auto Validate566: ${if (!current) "ON" else "OFF"}")
}

// v566: Suffix Auto Append566
internal fun PlayerActivity.showV566SuffixAutoAppend566Toggle() {
    val current = BiliClient.prefs.v566suffixAutoAppend566
    BiliClient.prefs.v566suffixAutoAppend566 = !current
    AppToast.show(this, "Suffix Auto Append566: ${if (!current) "ON" else "OFF"}")
}

// v566: Summary Auto Generate566
internal fun PlayerActivity.showV566SummaryAutoGenerate566Toggle() {
    val current = BiliClient.prefs.v566summaryAutoGenerate566
    BiliClient.prefs.v566summaryAutoGenerate566 = !current
    AppToast.show(this, "Summary Auto Generate566: ${if (!current) "ON" else "OFF"}")
}

// v566: Swap Auto Channel566
internal fun PlayerActivity.showV566SwapAutoChannel566Toggle() {
    val current = BiliClient.prefs.v566swapAutoChannel566
    BiliClient.prefs.v566swapAutoChannel566 = !current
    AppToast.show(this, "Swap Auto Channel566: ${if (!current) "ON" else "OFF"}")
}

// v566: Switch Auto Profile566
internal fun PlayerActivity.showV566SwitchAutoProfile566Toggle() {
    val current = BiliClient.prefs.v566switchAutoProfile566
    BiliClient.prefs.v566switchAutoProfile566 = !current
    AppToast.show(this, "Switch Auto Profile566: ${if (!current) "ON" else "OFF"}")
}

// v566: Tab Auto Restore566
internal fun PlayerActivity.showV566TabAutoRestore566Toggle() {
    val current = BiliClient.prefs.v566tabAutoRestore566
    BiliClient.prefs.v566tabAutoRestore566 = !current
    AppToast.show(this, "Tab Auto Restore566: ${if (!current) "ON" else "OFF"}")
}

// v566: Tag Auto Extract566
internal fun PlayerActivity.showV566TagAutoExtract566Toggle() {
    val current = BiliClient.prefs.v566tagAutoExtract566
    BiliClient.prefs.v566tagAutoExtract566 = !current
    AppToast.show(this, "Tag Auto Extract566: ${if (!current) "ON" else "OFF"}")
}

// v566: Target Auto Lock566
internal fun PlayerActivity.showV566TargetAutoLock566Toggle() {
    val current = BiliClient.prefs.v566targetAutoLock566
    BiliClient.prefs.v566targetAutoLock566 = !current
    AppToast.show(this, "Target Auto Lock566: ${if (!current) "ON" else "OFF"}")
}

// v566: Template Auto Fill566
internal fun PlayerActivity.showV566TemplateAutoFill566Toggle() {
    val current = BiliClient.prefs.v566templateAutoFill566
    BiliClient.prefs.v566templateAutoFill566 = !current
    AppToast.show(this, "Template Auto Fill566: ${if (!current) "ON" else "OFF"}")
}

// v566: Test Auto Run566
internal fun PlayerActivity.showV566TestAutoRun566Toggle() {
    val current = BiliClient.prefs.v566testAutoRun566
    BiliClient.prefs.v566testAutoRun566 = !current
    AppToast.show(this, "Test Auto Run566: ${if (!current) "ON" else "OFF"}")
}

// v567: Static IP Auto Detect567
internal fun PlayerActivity.showV567StaticIpAutoDetect567Toggle() {
    val current = BiliClient.prefs.v567staticIpAutoDetect567
    BiliClient.prefs.v567staticIpAutoDetect567 = !current
    AppToast.show(this, "Static IP Auto Detect567: ${if (!current) "ON" else "OFF"}")
}

// v567: Step Auto Increment567
internal fun PlayerActivity.showV567StepAutoIncrement567Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v567stepAutoIncrement567).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment567",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v567stepAutoIncrement567 = value
        AppToast.show(this, "Step Auto Increment567: $value")
    }
}

// v567: Stop Auto Confirm567
internal fun PlayerActivity.showV567StopAutoConfirm567Toggle() {
    val current = BiliClient.prefs.v567stopAutoConfirm567
    BiliClient.prefs.v567stopAutoConfirm567 = !current
    AppToast.show(this, "Stop Auto Confirm567: ${if (!current) "ON" else "OFF"}")
}

// v567: Store Auto Sync567
internal fun PlayerActivity.showV567StoreAutoSync567Toggle() {
    val current = BiliClient.prefs.v567storeAutoSync567
    BiliClient.prefs.v567storeAutoSync567 = !current
    AppToast.show(this, "Store Auto Sync567: ${if (!current) "ON" else "OFF"}")
}

// v567: Style Auto Theme567
internal fun PlayerActivity.showV567StyleAutoTheme567Toggle() {
    val current = BiliClient.prefs.v567styleAutoTheme567
    BiliClient.prefs.v567styleAutoTheme567 = !current
    AppToast.show(this, "Style Auto Theme567: ${if (!current) "ON" else "OFF"}")
}

// v567: Submit Auto Validate567
internal fun PlayerActivity.showV567SubmitAutoValidate567Toggle() {
    val current = BiliClient.prefs.v567submitAutoValidate567
    BiliClient.prefs.v567submitAutoValidate567 = !current
    AppToast.show(this, "Submit Auto Validate567: ${if (!current) "ON" else "OFF"}")
}

// v567: Suffix Auto Append567
internal fun PlayerActivity.showV567SuffixAutoAppend567Toggle() {
    val current = BiliClient.prefs.v567suffixAutoAppend567
    BiliClient.prefs.v567suffixAutoAppend567 = !current
    AppToast.show(this, "Suffix Auto Append567: ${if (!current) "ON" else "OFF"}")
}

// v567: Summary Auto Generate567
internal fun PlayerActivity.showV567SummaryAutoGenerate567Toggle() {
    val current = BiliClient.prefs.v567summaryAutoGenerate567
    BiliClient.prefs.v567summaryAutoGenerate567 = !current
    AppToast.show(this, "Summary Auto Generate567: ${if (!current) "ON" else "OFF"}")
}

// v567: Swap Auto Channel567
internal fun PlayerActivity.showV567SwapAutoChannel567Toggle() {
    val current = BiliClient.prefs.v567swapAutoChannel567
    BiliClient.prefs.v567swapAutoChannel567 = !current
    AppToast.show(this, "Swap Auto Channel567: ${if (!current) "ON" else "OFF"}")
}

// v567: Switch Auto Profile567
internal fun PlayerActivity.showV567SwitchAutoProfile567Toggle() {
    val current = BiliClient.prefs.v567switchAutoProfile567
    BiliClient.prefs.v567switchAutoProfile567 = !current
    AppToast.show(this, "Switch Auto Profile567: ${if (!current) "ON" else "OFF"}")
}

// v567: Tab Auto Restore567
internal fun PlayerActivity.showV567TabAutoRestore567Toggle() {
    val current = BiliClient.prefs.v567tabAutoRestore567
    BiliClient.prefs.v567tabAutoRestore567 = !current
    AppToast.show(this, "Tab Auto Restore567: ${if (!current) "ON" else "OFF"}")
}

// v567: Tag Auto Extract567
internal fun PlayerActivity.showV567TagAutoExtract567Toggle() {
    val current = BiliClient.prefs.v567tagAutoExtract567
    BiliClient.prefs.v567tagAutoExtract567 = !current
    AppToast.show(this, "Tag Auto Extract567: ${if (!current) "ON" else "OFF"}")
}

// v567: Target Auto Lock567
internal fun PlayerActivity.showV567TargetAutoLock567Toggle() {
    val current = BiliClient.prefs.v567targetAutoLock567
    BiliClient.prefs.v567targetAutoLock567 = !current
    AppToast.show(this, "Target Auto Lock567: ${if (!current) "ON" else "OFF"}")
}

// v567: Template Auto Fill567
internal fun PlayerActivity.showV567TemplateAutoFill567Toggle() {
    val current = BiliClient.prefs.v567templateAutoFill567
    BiliClient.prefs.v567templateAutoFill567 = !current
    AppToast.show(this, "Template Auto Fill567: ${if (!current) "ON" else "OFF"}")
}

// v567: Test Auto Run567
internal fun PlayerActivity.showV567TestAutoRun567Toggle() {
    val current = BiliClient.prefs.v567testAutoRun567
    BiliClient.prefs.v567testAutoRun567 = !current
    AppToast.show(this, "Test Auto Run567: ${if (!current) "ON" else "OFF"}")
}

// v568: Static IP Auto Detect568
internal fun PlayerActivity.showV568StaticIpAutoDetect568Toggle() {
    val current = BiliClient.prefs.v568staticIpAutoDetect568
    BiliClient.prefs.v568staticIpAutoDetect568 = !current
    AppToast.show(this, "Static IP Auto Detect568: ${if (!current) "ON" else "OFF"}")
}

// v568: Step Auto Increment568
internal fun PlayerActivity.showV568StepAutoIncrement568Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v568stepAutoIncrement568).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment568",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v568stepAutoIncrement568 = value
        AppToast.show(this, "Step Auto Increment568: $value")
    }
}

// v568: Stop Auto Confirm568
internal fun PlayerActivity.showV568StopAutoConfirm568Toggle() {
    val current = BiliClient.prefs.v568stopAutoConfirm568
    BiliClient.prefs.v568stopAutoConfirm568 = !current
    AppToast.show(this, "Stop Auto Confirm568: ${if (!current) "ON" else "OFF"}")
}

// v568: Store Auto Sync568
internal fun PlayerActivity.showV568StoreAutoSync568Toggle() {
    val current = BiliClient.prefs.v568storeAutoSync568
    BiliClient.prefs.v568storeAutoSync568 = !current
    AppToast.show(this, "Store Auto Sync568: ${if (!current) "ON" else "OFF"}")
}

// v568: Style Auto Theme568
internal fun PlayerActivity.showV568StyleAutoTheme568Toggle() {
    val current = BiliClient.prefs.v568styleAutoTheme568
    BiliClient.prefs.v568styleAutoTheme568 = !current
    AppToast.show(this, "Style Auto Theme568: ${if (!current) "ON" else "OFF"}")
}

// v568: Submit Auto Validate568
internal fun PlayerActivity.showV568SubmitAutoValidate568Toggle() {
    val current = BiliClient.prefs.v568submitAutoValidate568
    BiliClient.prefs.v568submitAutoValidate568 = !current
    AppToast.show(this, "Submit Auto Validate568: ${if (!current) "ON" else "OFF"}")
}

// v568: Suffix Auto Append568
internal fun PlayerActivity.showV568SuffixAutoAppend568Toggle() {
    val current = BiliClient.prefs.v568suffixAutoAppend568
    BiliClient.prefs.v568suffixAutoAppend568 = !current
    AppToast.show(this, "Suffix Auto Append568: ${if (!current) "ON" else "OFF"}")
}

// v568: Summary Auto Generate568
internal fun PlayerActivity.showV568SummaryAutoGenerate568Toggle() {
    val current = BiliClient.prefs.v568summaryAutoGenerate568
    BiliClient.prefs.v568summaryAutoGenerate568 = !current
    AppToast.show(this, "Summary Auto Generate568: ${if (!current) "ON" else "OFF"}")
}

// v568: Swap Auto Channel568
internal fun PlayerActivity.showV568SwapAutoChannel568Toggle() {
    val current = BiliClient.prefs.v568swapAutoChannel568
    BiliClient.prefs.v568swapAutoChannel568 = !current
    AppToast.show(this, "Swap Auto Channel568: ${if (!current) "ON" else "OFF"}")
}

// v568: Switch Auto Profile568
internal fun PlayerActivity.showV568SwitchAutoProfile568Toggle() {
    val current = BiliClient.prefs.v568switchAutoProfile568
    BiliClient.prefs.v568switchAutoProfile568 = !current
    AppToast.show(this, "Switch Auto Profile568: ${if (!current) "ON" else "OFF"}")
}

// v568: Tab Auto Restore568
internal fun PlayerActivity.showV568TabAutoRestore568Toggle() {
    val current = BiliClient.prefs.v568tabAutoRestore568
    BiliClient.prefs.v568tabAutoRestore568 = !current
    AppToast.show(this, "Tab Auto Restore568: ${if (!current) "ON" else "OFF"}")
}

// v568: Tag Auto Extract568
internal fun PlayerActivity.showV568TagAutoExtract568Toggle() {
    val current = BiliClient.prefs.v568tagAutoExtract568
    BiliClient.prefs.v568tagAutoExtract568 = !current
    AppToast.show(this, "Tag Auto Extract568: ${if (!current) "ON" else "OFF"}")
}

// v568: Target Auto Lock568
internal fun PlayerActivity.showV568TargetAutoLock568Toggle() {
    val current = BiliClient.prefs.v568targetAutoLock568
    BiliClient.prefs.v568targetAutoLock568 = !current
    AppToast.show(this, "Target Auto Lock568: ${if (!current) "ON" else "OFF"}")
}

// v568: Template Auto Fill568
internal fun PlayerActivity.showV568TemplateAutoFill568Toggle() {
    val current = BiliClient.prefs.v568templateAutoFill568
    BiliClient.prefs.v568templateAutoFill568 = !current
    AppToast.show(this, "Template Auto Fill568: ${if (!current) "ON" else "OFF"}")
}

// v568: Test Auto Run568
internal fun PlayerActivity.showV568TestAutoRun568Toggle() {
    val current = BiliClient.prefs.v568testAutoRun568
    BiliClient.prefs.v568testAutoRun568 = !current
    AppToast.show(this, "Test Auto Run568: ${if (!current) "ON" else "OFF"}")
}

// v569: Static IP Auto Detect569
internal fun PlayerActivity.showV569StaticIpAutoDetect569Toggle() {
    val current = BiliClient.prefs.v569staticIpAutoDetect569
    BiliClient.prefs.v569staticIpAutoDetect569 = !current
    AppToast.show(this, "Static IP Auto Detect569: ${if (!current) "ON" else "OFF"}")
}

// v569: Step Auto Increment569
internal fun PlayerActivity.showV569StepAutoIncrement569Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v569stepAutoIncrement569).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment569",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v569stepAutoIncrement569 = value
        AppToast.show(this, "Step Auto Increment569: $value")
    }
}

// v569: Stop Auto Confirm569
internal fun PlayerActivity.showV569StopAutoConfirm569Toggle() {
    val current = BiliClient.prefs.v569stopAutoConfirm569
    BiliClient.prefs.v569stopAutoConfirm569 = !current
    AppToast.show(this, "Stop Auto Confirm569: ${if (!current) "ON" else "OFF"}")
}

// v569: Store Auto Sync569
internal fun PlayerActivity.showV569StoreAutoSync569Toggle() {
    val current = BiliClient.prefs.v569storeAutoSync569
    BiliClient.prefs.v569storeAutoSync569 = !current
    AppToast.show(this, "Store Auto Sync569: ${if (!current) "ON" else "OFF"}")
}

// v569: Style Auto Theme569
internal fun PlayerActivity.showV569StyleAutoTheme569Toggle() {
    val current = BiliClient.prefs.v569styleAutoTheme569
    BiliClient.prefs.v569styleAutoTheme569 = !current
    AppToast.show(this, "Style Auto Theme569: ${if (!current) "ON" else "OFF"}")
}

// v569: Submit Auto Validate569
internal fun PlayerActivity.showV569SubmitAutoValidate569Toggle() {
    val current = BiliClient.prefs.v569submitAutoValidate569
    BiliClient.prefs.v569submitAutoValidate569 = !current
    AppToast.show(this, "Submit Auto Validate569: ${if (!current) "ON" else "OFF"}")
}

// v569: Suffix Auto Append569
internal fun PlayerActivity.showV569SuffixAutoAppend569Toggle() {
    val current = BiliClient.prefs.v569suffixAutoAppend569
    BiliClient.prefs.v569suffixAutoAppend569 = !current
    AppToast.show(this, "Suffix Auto Append569: ${if (!current) "ON" else "OFF"}")
}

// v569: Summary Auto Generate569
internal fun PlayerActivity.showV569SummaryAutoGenerate569Toggle() {
    val current = BiliClient.prefs.v569summaryAutoGenerate569
    BiliClient.prefs.v569summaryAutoGenerate569 = !current
    AppToast.show(this, "Summary Auto Generate569: ${if (!current) "ON" else "OFF"}")
}

// v569: Swap Auto Channel569
internal fun PlayerActivity.showV569SwapAutoChannel569Toggle() {
    val current = BiliClient.prefs.v569swapAutoChannel569
    BiliClient.prefs.v569swapAutoChannel569 = !current
    AppToast.show(this, "Swap Auto Channel569: ${if (!current) "ON" else "OFF"}")
}

// v569: Switch Auto Profile569
internal fun PlayerActivity.showV569SwitchAutoProfile569Toggle() {
    val current = BiliClient.prefs.v569switchAutoProfile569
    BiliClient.prefs.v569switchAutoProfile569 = !current
    AppToast.show(this, "Switch Auto Profile569: ${if (!current) "ON" else "OFF"}")
}

// v569: Tab Auto Restore569
internal fun PlayerActivity.showV569TabAutoRestore569Toggle() {
    val current = BiliClient.prefs.v569tabAutoRestore569
    BiliClient.prefs.v569tabAutoRestore569 = !current
    AppToast.show(this, "Tab Auto Restore569: ${if (!current) "ON" else "OFF"}")
}

// v569: Tag Auto Extract569
internal fun PlayerActivity.showV569TagAutoExtract569Toggle() {
    val current = BiliClient.prefs.v569tagAutoExtract569
    BiliClient.prefs.v569tagAutoExtract569 = !current
    AppToast.show(this, "Tag Auto Extract569: ${if (!current) "ON" else "OFF"}")
}

// v569: Target Auto Lock569
internal fun PlayerActivity.showV569TargetAutoLock569Toggle() {
    val current = BiliClient.prefs.v569targetAutoLock569
    BiliClient.prefs.v569targetAutoLock569 = !current
    AppToast.show(this, "Target Auto Lock569: ${if (!current) "ON" else "OFF"}")
}

