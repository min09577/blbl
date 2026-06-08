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

internal fun PlayerActivity.showV548ShapeAutoDetect548Toggle() {
    val current = BiliClient.prefs.v548shapeAutoDetect548
    BiliClient.prefs.v548shapeAutoDetect548 = !current
    AppToast.show(this, "Shape Auto Detect548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548SharpAutoAdjust548Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v548sharpAutoAdjust548).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust548",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v548sharpAutoAdjust548 = value
        AppToast.show(this, "Sharp Auto Adjust548: $value")
    }
}

internal fun PlayerActivity.showV548ShellAutoExecute548Toggle() {
    val current = BiliClient.prefs.v548shellAutoExecute548
    BiliClient.prefs.v548shellAutoExecute548 = !current
    AppToast.show(this, "Shell Auto Execute548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548ShiftAutoOffset548Toggle() {
    val current = BiliClient.prefs.v548shiftAutoOffset548
    BiliClient.prefs.v548shiftAutoOffset548 = !current
    AppToast.show(this, "Shift Auto Offset548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548ShortCutAutoBind548Toggle() {
    val current = BiliClient.prefs.v548shortCutAutoBind548
    BiliClient.prefs.v548shortCutAutoBind548 = !current
    AppToast.show(this, "Short Cut Auto Bind548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548ShowAutoToggle548Toggle() {
    val current = BiliClient.prefs.v548showAutoToggle548
    BiliClient.prefs.v548showAutoToggle548 = !current
    AppToast.show(this, "Show Auto Toggle548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548ShuffleAutoSeed548Toggle() {
    val current = BiliClient.prefs.v548shuffleAutoSeed548
    BiliClient.prefs.v548shuffleAutoSeed548 = !current
    AppToast.show(this, "Shuffle Auto Seed548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548SignalAutoBoost548Toggle() {
    val current = BiliClient.prefs.v548signalAutoBoost548
    BiliClient.prefs.v548signalAutoBoost548 = !current
    AppToast.show(this, "Signal Auto Boost548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV548SingleInstanceMode548Toggle() {
    val current = BiliClient.prefs.v548singleInstanceMode548
    BiliClient.prefs.v548singleInstanceMode548 = !current
    AppToast.show(this, "Single Instance Mode548: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549SendAutoConfirm549Toggle() {
    val current = BiliClient.prefs.v549sendAutoConfirm549
    BiliClient.prefs.v549sendAutoConfirm549 = !current
    AppToast.show(this, "Send Auto Confirm549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549SensorAutoCalibrate549Toggle() {
    val current = BiliClient.prefs.v549sensorAutoCalibrate549
    BiliClient.prefs.v549sensorAutoCalibrate549 = !current
    AppToast.show(this, "Sensor Auto Calibrate549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549ServerAutoSwitch549Toggle() {
    val current = BiliClient.prefs.v549serverAutoSwitch549
    BiliClient.prefs.v549serverAutoSwitch549 = !current
    AppToast.show(this, "Server Auto Switch549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549SessionAutoSave549Toggle() {
    val current = BiliClient.prefs.v549sessionAutoSave549
    BiliClient.prefs.v549sessionAutoSave549 = !current
    AppToast.show(this, "Session Auto Save549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549SetAutoDefault549Toggle() {
    val current = BiliClient.prefs.v549setAutoDefault549
    BiliClient.prefs.v549setAutoDefault549 = !current
    AppToast.show(this, "Set Auto Default549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549ShadowAutoDrop549Toggle() {
    val current = BiliClient.prefs.v549shadowAutoDrop549
    BiliClient.prefs.v549shadowAutoDrop549 = !current
    AppToast.show(this, "Shadow Auto Drop549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549ShapeAutoDetect549Toggle() {
    val current = BiliClient.prefs.v549shapeAutoDetect549
    BiliClient.prefs.v549shapeAutoDetect549 = !current
    AppToast.show(this, "Shape Auto Detect549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549SharpAutoAdjust549Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v549sharpAutoAdjust549).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust549",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v549sharpAutoAdjust549 = value
        AppToast.show(this, "Sharp Auto Adjust549: $value")
    }
}

internal fun PlayerActivity.showV549ShellAutoExecute549Toggle() {
    val current = BiliClient.prefs.v549shellAutoExecute549
    BiliClient.prefs.v549shellAutoExecute549 = !current
    AppToast.show(this, "Shell Auto Execute549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549ShiftAutoOffset549Toggle() {
    val current = BiliClient.prefs.v549shiftAutoOffset549
    BiliClient.prefs.v549shiftAutoOffset549 = !current
    AppToast.show(this, "Shift Auto Offset549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549ShortCutAutoBind549Toggle() {
    val current = BiliClient.prefs.v549shortCutAutoBind549
    BiliClient.prefs.v549shortCutAutoBind549 = !current
    AppToast.show(this, "Short Cut Auto Bind549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549ShowAutoToggle549Toggle() {
    val current = BiliClient.prefs.v549showAutoToggle549
    BiliClient.prefs.v549showAutoToggle549 = !current
    AppToast.show(this, "Show Auto Toggle549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549ShuffleAutoSeed549Toggle() {
    val current = BiliClient.prefs.v549shuffleAutoSeed549
    BiliClient.prefs.v549shuffleAutoSeed549 = !current
    AppToast.show(this, "Shuffle Auto Seed549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549SignalAutoBoost549Toggle() {
    val current = BiliClient.prefs.v549signalAutoBoost549
    BiliClient.prefs.v549signalAutoBoost549 = !current
    AppToast.show(this, "Signal Auto Boost549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV549SingleInstanceMode549Toggle() {
    val current = BiliClient.prefs.v549singleInstanceMode549
    BiliClient.prefs.v549singleInstanceMode549 = !current
    AppToast.show(this, "Single Instance Mode549: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550SendAutoConfirm550Toggle() {
    val current = BiliClient.prefs.v550sendAutoConfirm550
    BiliClient.prefs.v550sendAutoConfirm550 = !current
    AppToast.show(this, "Send Auto Confirm550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550SensorAutoCalibrate550Toggle() {
    val current = BiliClient.prefs.v550sensorAutoCalibrate550
    BiliClient.prefs.v550sensorAutoCalibrate550 = !current
    AppToast.show(this, "Sensor Auto Calibrate550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550ServerAutoSwitch550Toggle() {
    val current = BiliClient.prefs.v550serverAutoSwitch550
    BiliClient.prefs.v550serverAutoSwitch550 = !current
    AppToast.show(this, "Server Auto Switch550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550SessionAutoSave550Toggle() {
    val current = BiliClient.prefs.v550sessionAutoSave550
    BiliClient.prefs.v550sessionAutoSave550 = !current
    AppToast.show(this, "Session Auto Save550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550SetAutoDefault550Toggle() {
    val current = BiliClient.prefs.v550setAutoDefault550
    BiliClient.prefs.v550setAutoDefault550 = !current
    AppToast.show(this, "Set Auto Default550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550ShadowAutoDrop550Toggle() {
    val current = BiliClient.prefs.v550shadowAutoDrop550
    BiliClient.prefs.v550shadowAutoDrop550 = !current
    AppToast.show(this, "Shadow Auto Drop550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550ShapeAutoDetect550Toggle() {
    val current = BiliClient.prefs.v550shapeAutoDetect550
    BiliClient.prefs.v550shapeAutoDetect550 = !current
    AppToast.show(this, "Shape Auto Detect550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550SharpAutoAdjust550Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v550sharpAutoAdjust550).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sharp Auto Adjust550",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v550sharpAutoAdjust550 = value
        AppToast.show(this, "Sharp Auto Adjust550: $value")
    }
}

internal fun PlayerActivity.showV550ShellAutoExecute550Toggle() {
    val current = BiliClient.prefs.v550shellAutoExecute550
    BiliClient.prefs.v550shellAutoExecute550 = !current
    AppToast.show(this, "Shell Auto Execute550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550ShiftAutoOffset550Toggle() {
    val current = BiliClient.prefs.v550shiftAutoOffset550
    BiliClient.prefs.v550shiftAutoOffset550 = !current
    AppToast.show(this, "Shift Auto Offset550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550ShortCutAutoBind550Toggle() {
    val current = BiliClient.prefs.v550shortCutAutoBind550
    BiliClient.prefs.v550shortCutAutoBind550 = !current
    AppToast.show(this, "Short Cut Auto Bind550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550ShowAutoToggle550Toggle() {
    val current = BiliClient.prefs.v550showAutoToggle550
    BiliClient.prefs.v550showAutoToggle550 = !current
    AppToast.show(this, "Show Auto Toggle550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550ShuffleAutoSeed550Toggle() {
    val current = BiliClient.prefs.v550shuffleAutoSeed550
    BiliClient.prefs.v550shuffleAutoSeed550 = !current
    AppToast.show(this, "Shuffle Auto Seed550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550SignalAutoBoost550Toggle() {
    val current = BiliClient.prefs.v550signalAutoBoost550
    BiliClient.prefs.v550signalAutoBoost550 = !current
    AppToast.show(this, "Signal Auto Boost550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV550SingleInstanceMode550Toggle() {
    val current = BiliClient.prefs.v550singleInstanceMode550
    BiliClient.prefs.v550singleInstanceMode550 = !current
    AppToast.show(this, "Single Instance Mode550: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551SkipSilenceAuto551Toggle() {
    val current = BiliClient.prefs.v551skipSilenceAuto551
    BiliClient.prefs.v551skipSilenceAuto551 = !current
    AppToast.show(this, "Skip Silence Auto551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551SliceAutoSegment551Toggle() {
    val current = BiliClient.prefs.v551sliceAutoSegment551
    BiliClient.prefs.v551sliceAutoSegment551 = !current
    AppToast.show(this, "Slice Auto Segment551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551SlideAutoTransition551Toggle() {
    val current = BiliClient.prefs.v551slideAutoTransition551
    BiliClient.prefs.v551slideAutoTransition551 = !current
    AppToast.show(this, "Slide Auto Transition551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551SlotAutoManage551Toggle() {
    val current = BiliClient.prefs.v551slotAutoManage551
    BiliClient.prefs.v551slotAutoManage551 = !current
    AppToast.show(this, "Slot Auto Manage551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551SmartAutoQuality551Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v551smartAutoQuality551).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality551",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v551smartAutoQuality551 = value
        AppToast.show(this, "Smart Auto Quality551: $value")
    }
}

internal fun PlayerActivity.showV551SmoothScrollEnabled551Toggle() {
    val current = BiliClient.prefs.v551smoothScrollEnabled551
    BiliClient.prefs.v551smoothScrollEnabled551 = !current
    AppToast.show(this, "Smooth Scroll Enabled551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551SnapAutoAlign551Toggle() {
    val current = BiliClient.prefs.v551snapAutoAlign551
    BiliClient.prefs.v551snapAutoAlign551 = !current
    AppToast.show(this, "Snap Auto Align551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551SortAutoAlgorithm551Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v551sortAutoAlgorithm551).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm551",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v551sortAutoAlgorithm551 = value
        AppToast.show(this, "Sort Auto Algorithm551: $value")
    }
}

internal fun PlayerActivity.showV551SourceAutoSelect551Toggle() {
    val current = BiliClient.prefs.v551sourceAutoSelect551
    BiliClient.prefs.v551sourceAutoSelect551 = !current
    AppToast.show(this, "Source Auto Select551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551SpanAutoAdjust551Toggle() {
    val current = BiliClient.prefs.v551spanAutoAdjust551
    BiliClient.prefs.v551spanAutoAdjust551 = !current
    AppToast.show(this, "Span Auto Adjust551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551SplitAutoView551Toggle() {
    val current = BiliClient.prefs.v551splitAutoView551
    BiliClient.prefs.v551splitAutoView551 = !current
    AppToast.show(this, "Split Auto View551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551StackAutoLayer551Toggle() {
    val current = BiliClient.prefs.v551stackAutoLayer551
    BiliClient.prefs.v551stackAutoLayer551 = !current
    AppToast.show(this, "Stack Auto Layer551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551StageAutoAdvance551Toggle() {
    val current = BiliClient.prefs.v551stageAutoAdvance551
    BiliClient.prefs.v551stageAutoAdvance551 = !current
    AppToast.show(this, "Stage Auto Advance551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551StartAutoPlay551Toggle() {
    val current = BiliClient.prefs.v551startAutoPlay551
    BiliClient.prefs.v551startAutoPlay551 = !current
    AppToast.show(this, "Start Auto Play551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV551StateAutoPersist551Toggle() {
    val current = BiliClient.prefs.v551stateAutoPersist551
    BiliClient.prefs.v551stateAutoPersist551 = !current
    AppToast.show(this, "State Auto Persist551: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552SkipSilenceAuto552Toggle() {
    val current = BiliClient.prefs.v552skipSilenceAuto552
    BiliClient.prefs.v552skipSilenceAuto552 = !current
    AppToast.show(this, "Skip Silence Auto552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552SliceAutoSegment552Toggle() {
    val current = BiliClient.prefs.v552sliceAutoSegment552
    BiliClient.prefs.v552sliceAutoSegment552 = !current
    AppToast.show(this, "Slice Auto Segment552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552SlideAutoTransition552Toggle() {
    val current = BiliClient.prefs.v552slideAutoTransition552
    BiliClient.prefs.v552slideAutoTransition552 = !current
    AppToast.show(this, "Slide Auto Transition552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552SlotAutoManage552Toggle() {
    val current = BiliClient.prefs.v552slotAutoManage552
    BiliClient.prefs.v552slotAutoManage552 = !current
    AppToast.show(this, "Slot Auto Manage552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552SmartAutoQuality552Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v552smartAutoQuality552).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality552",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v552smartAutoQuality552 = value
        AppToast.show(this, "Smart Auto Quality552: $value")
    }
}

internal fun PlayerActivity.showV552SmoothScrollEnabled552Toggle() {
    val current = BiliClient.prefs.v552smoothScrollEnabled552
    BiliClient.prefs.v552smoothScrollEnabled552 = !current
    AppToast.show(this, "Smooth Scroll Enabled552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552SnapAutoAlign552Toggle() {
    val current = BiliClient.prefs.v552snapAutoAlign552
    BiliClient.prefs.v552snapAutoAlign552 = !current
    AppToast.show(this, "Snap Auto Align552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552SortAutoAlgorithm552Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v552sortAutoAlgorithm552).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm552",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v552sortAutoAlgorithm552 = value
        AppToast.show(this, "Sort Auto Algorithm552: $value")
    }
}

internal fun PlayerActivity.showV552SourceAutoSelect552Toggle() {
    val current = BiliClient.prefs.v552sourceAutoSelect552
    BiliClient.prefs.v552sourceAutoSelect552 = !current
    AppToast.show(this, "Source Auto Select552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552SpanAutoAdjust552Toggle() {
    val current = BiliClient.prefs.v552spanAutoAdjust552
    BiliClient.prefs.v552spanAutoAdjust552 = !current
    AppToast.show(this, "Span Auto Adjust552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552SplitAutoView552Toggle() {
    val current = BiliClient.prefs.v552splitAutoView552
    BiliClient.prefs.v552splitAutoView552 = !current
    AppToast.show(this, "Split Auto View552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552StackAutoLayer552Toggle() {
    val current = BiliClient.prefs.v552stackAutoLayer552
    BiliClient.prefs.v552stackAutoLayer552 = !current
    AppToast.show(this, "Stack Auto Layer552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552StageAutoAdvance552Toggle() {
    val current = BiliClient.prefs.v552stageAutoAdvance552
    BiliClient.prefs.v552stageAutoAdvance552 = !current
    AppToast.show(this, "Stage Auto Advance552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552StartAutoPlay552Toggle() {
    val current = BiliClient.prefs.v552startAutoPlay552
    BiliClient.prefs.v552startAutoPlay552 = !current
    AppToast.show(this, "Start Auto Play552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV552StateAutoPersist552Toggle() {
    val current = BiliClient.prefs.v552stateAutoPersist552
    BiliClient.prefs.v552stateAutoPersist552 = !current
    AppToast.show(this, "State Auto Persist552: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553SkipSilenceAuto553Toggle() {
    val current = BiliClient.prefs.v553skipSilenceAuto553
    BiliClient.prefs.v553skipSilenceAuto553 = !current
    AppToast.show(this, "Skip Silence Auto553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553SliceAutoSegment553Toggle() {
    val current = BiliClient.prefs.v553sliceAutoSegment553
    BiliClient.prefs.v553sliceAutoSegment553 = !current
    AppToast.show(this, "Slice Auto Segment553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553SlideAutoTransition553Toggle() {
    val current = BiliClient.prefs.v553slideAutoTransition553
    BiliClient.prefs.v553slideAutoTransition553 = !current
    AppToast.show(this, "Slide Auto Transition553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553SlotAutoManage553Toggle() {
    val current = BiliClient.prefs.v553slotAutoManage553
    BiliClient.prefs.v553slotAutoManage553 = !current
    AppToast.show(this, "Slot Auto Manage553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553SmartAutoQuality553Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v553smartAutoQuality553).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality553",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v553smartAutoQuality553 = value
        AppToast.show(this, "Smart Auto Quality553: $value")
    }
}

internal fun PlayerActivity.showV553SmoothScrollEnabled553Toggle() {
    val current = BiliClient.prefs.v553smoothScrollEnabled553
    BiliClient.prefs.v553smoothScrollEnabled553 = !current
    AppToast.show(this, "Smooth Scroll Enabled553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553SnapAutoAlign553Toggle() {
    val current = BiliClient.prefs.v553snapAutoAlign553
    BiliClient.prefs.v553snapAutoAlign553 = !current
    AppToast.show(this, "Snap Auto Align553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553SortAutoAlgorithm553Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v553sortAutoAlgorithm553).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm553",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v553sortAutoAlgorithm553 = value
        AppToast.show(this, "Sort Auto Algorithm553: $value")
    }
}

internal fun PlayerActivity.showV553SourceAutoSelect553Toggle() {
    val current = BiliClient.prefs.v553sourceAutoSelect553
    BiliClient.prefs.v553sourceAutoSelect553 = !current
    AppToast.show(this, "Source Auto Select553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553SpanAutoAdjust553Toggle() {
    val current = BiliClient.prefs.v553spanAutoAdjust553
    BiliClient.prefs.v553spanAutoAdjust553 = !current
    AppToast.show(this, "Span Auto Adjust553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553SplitAutoView553Toggle() {
    val current = BiliClient.prefs.v553splitAutoView553
    BiliClient.prefs.v553splitAutoView553 = !current
    AppToast.show(this, "Split Auto View553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553StackAutoLayer553Toggle() {
    val current = BiliClient.prefs.v553stackAutoLayer553
    BiliClient.prefs.v553stackAutoLayer553 = !current
    AppToast.show(this, "Stack Auto Layer553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553StageAutoAdvance553Toggle() {
    val current = BiliClient.prefs.v553stageAutoAdvance553
    BiliClient.prefs.v553stageAutoAdvance553 = !current
    AppToast.show(this, "Stage Auto Advance553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553StartAutoPlay553Toggle() {
    val current = BiliClient.prefs.v553startAutoPlay553
    BiliClient.prefs.v553startAutoPlay553 = !current
    AppToast.show(this, "Start Auto Play553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV553StateAutoPersist553Toggle() {
    val current = BiliClient.prefs.v553stateAutoPersist553
    BiliClient.prefs.v553stateAutoPersist553 = !current
    AppToast.show(this, "State Auto Persist553: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554SkipSilenceAuto554Toggle() {
    val current = BiliClient.prefs.v554skipSilenceAuto554
    BiliClient.prefs.v554skipSilenceAuto554 = !current
    AppToast.show(this, "Skip Silence Auto554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554SliceAutoSegment554Toggle() {
    val current = BiliClient.prefs.v554sliceAutoSegment554
    BiliClient.prefs.v554sliceAutoSegment554 = !current
    AppToast.show(this, "Slice Auto Segment554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554SlideAutoTransition554Toggle() {
    val current = BiliClient.prefs.v554slideAutoTransition554
    BiliClient.prefs.v554slideAutoTransition554 = !current
    AppToast.show(this, "Slide Auto Transition554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554SlotAutoManage554Toggle() {
    val current = BiliClient.prefs.v554slotAutoManage554
    BiliClient.prefs.v554slotAutoManage554 = !current
    AppToast.show(this, "Slot Auto Manage554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554SmartAutoQuality554Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v554smartAutoQuality554).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality554",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v554smartAutoQuality554 = value
        AppToast.show(this, "Smart Auto Quality554: $value")
    }
}

internal fun PlayerActivity.showV554SmoothScrollEnabled554Toggle() {
    val current = BiliClient.prefs.v554smoothScrollEnabled554
    BiliClient.prefs.v554smoothScrollEnabled554 = !current
    AppToast.show(this, "Smooth Scroll Enabled554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554SnapAutoAlign554Toggle() {
    val current = BiliClient.prefs.v554snapAutoAlign554
    BiliClient.prefs.v554snapAutoAlign554 = !current
    AppToast.show(this, "Snap Auto Align554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554SortAutoAlgorithm554Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v554sortAutoAlgorithm554).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm554",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v554sortAutoAlgorithm554 = value
        AppToast.show(this, "Sort Auto Algorithm554: $value")
    }
}

internal fun PlayerActivity.showV554SourceAutoSelect554Toggle() {
    val current = BiliClient.prefs.v554sourceAutoSelect554
    BiliClient.prefs.v554sourceAutoSelect554 = !current
    AppToast.show(this, "Source Auto Select554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554SpanAutoAdjust554Toggle() {
    val current = BiliClient.prefs.v554spanAutoAdjust554
    BiliClient.prefs.v554spanAutoAdjust554 = !current
    AppToast.show(this, "Span Auto Adjust554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554SplitAutoView554Toggle() {
    val current = BiliClient.prefs.v554splitAutoView554
    BiliClient.prefs.v554splitAutoView554 = !current
    AppToast.show(this, "Split Auto View554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554StackAutoLayer554Toggle() {
    val current = BiliClient.prefs.v554stackAutoLayer554
    BiliClient.prefs.v554stackAutoLayer554 = !current
    AppToast.show(this, "Stack Auto Layer554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554StageAutoAdvance554Toggle() {
    val current = BiliClient.prefs.v554stageAutoAdvance554
    BiliClient.prefs.v554stageAutoAdvance554 = !current
    AppToast.show(this, "Stage Auto Advance554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554StartAutoPlay554Toggle() {
    val current = BiliClient.prefs.v554startAutoPlay554
    BiliClient.prefs.v554startAutoPlay554 = !current
    AppToast.show(this, "Start Auto Play554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV554StateAutoPersist554Toggle() {
    val current = BiliClient.prefs.v554stateAutoPersist554
    BiliClient.prefs.v554stateAutoPersist554 = !current
    AppToast.show(this, "State Auto Persist554: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555SkipSilenceAuto555Toggle() {
    val current = BiliClient.prefs.v555skipSilenceAuto555
    BiliClient.prefs.v555skipSilenceAuto555 = !current
    AppToast.show(this, "Skip Silence Auto555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555SliceAutoSegment555Toggle() {
    val current = BiliClient.prefs.v555sliceAutoSegment555
    BiliClient.prefs.v555sliceAutoSegment555 = !current
    AppToast.show(this, "Slice Auto Segment555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555SlideAutoTransition555Toggle() {
    val current = BiliClient.prefs.v555slideAutoTransition555
    BiliClient.prefs.v555slideAutoTransition555 = !current
    AppToast.show(this, "Slide Auto Transition555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555SlotAutoManage555Toggle() {
    val current = BiliClient.prefs.v555slotAutoManage555
    BiliClient.prefs.v555slotAutoManage555 = !current
    AppToast.show(this, "Slot Auto Manage555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555SmartAutoQuality555Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v555smartAutoQuality555).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality555",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v555smartAutoQuality555 = value
        AppToast.show(this, "Smart Auto Quality555: $value")
    }
}

internal fun PlayerActivity.showV555SmoothScrollEnabled555Toggle() {
    val current = BiliClient.prefs.v555smoothScrollEnabled555
    BiliClient.prefs.v555smoothScrollEnabled555 = !current
    AppToast.show(this, "Smooth Scroll Enabled555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555SnapAutoAlign555Toggle() {
    val current = BiliClient.prefs.v555snapAutoAlign555
    BiliClient.prefs.v555snapAutoAlign555 = !current
    AppToast.show(this, "Snap Auto Align555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555SortAutoAlgorithm555Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v555sortAutoAlgorithm555).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm555",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v555sortAutoAlgorithm555 = value
        AppToast.show(this, "Sort Auto Algorithm555: $value")
    }
}

internal fun PlayerActivity.showV555SourceAutoSelect555Toggle() {
    val current = BiliClient.prefs.v555sourceAutoSelect555
    BiliClient.prefs.v555sourceAutoSelect555 = !current
    AppToast.show(this, "Source Auto Select555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555SpanAutoAdjust555Toggle() {
    val current = BiliClient.prefs.v555spanAutoAdjust555
    BiliClient.prefs.v555spanAutoAdjust555 = !current
    AppToast.show(this, "Span Auto Adjust555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555SplitAutoView555Toggle() {
    val current = BiliClient.prefs.v555splitAutoView555
    BiliClient.prefs.v555splitAutoView555 = !current
    AppToast.show(this, "Split Auto View555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555StackAutoLayer555Toggle() {
    val current = BiliClient.prefs.v555stackAutoLayer555
    BiliClient.prefs.v555stackAutoLayer555 = !current
    AppToast.show(this, "Stack Auto Layer555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555StageAutoAdvance555Toggle() {
    val current = BiliClient.prefs.v555stageAutoAdvance555
    BiliClient.prefs.v555stageAutoAdvance555 = !current
    AppToast.show(this, "Stage Auto Advance555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555StartAutoPlay555Toggle() {
    val current = BiliClient.prefs.v555startAutoPlay555
    BiliClient.prefs.v555startAutoPlay555 = !current
    AppToast.show(this, "Start Auto Play555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV555StateAutoPersist555Toggle() {
    val current = BiliClient.prefs.v555stateAutoPersist555
    BiliClient.prefs.v555stateAutoPersist555 = !current
    AppToast.show(this, "State Auto Persist555: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556SkipSilenceAuto556Toggle() {
    val current = BiliClient.prefs.v556skipSilenceAuto556
    BiliClient.prefs.v556skipSilenceAuto556 = !current
    AppToast.show(this, "Skip Silence Auto556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556SliceAutoSegment556Toggle() {
    val current = BiliClient.prefs.v556sliceAutoSegment556
    BiliClient.prefs.v556sliceAutoSegment556 = !current
    AppToast.show(this, "Slice Auto Segment556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556SlideAutoTransition556Toggle() {
    val current = BiliClient.prefs.v556slideAutoTransition556
    BiliClient.prefs.v556slideAutoTransition556 = !current
    AppToast.show(this, "Slide Auto Transition556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556SlotAutoManage556Toggle() {
    val current = BiliClient.prefs.v556slotAutoManage556
    BiliClient.prefs.v556slotAutoManage556 = !current
    AppToast.show(this, "Slot Auto Manage556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556SmartAutoQuality556Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v556smartAutoQuality556).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Smart Auto Quality556",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v556smartAutoQuality556 = value
        AppToast.show(this, "Smart Auto Quality556: $value")
    }
}

internal fun PlayerActivity.showV556SmoothScrollEnabled556Toggle() {
    val current = BiliClient.prefs.v556smoothScrollEnabled556
    BiliClient.prefs.v556smoothScrollEnabled556 = !current
    AppToast.show(this, "Smooth Scroll Enabled556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556SnapAutoAlign556Toggle() {
    val current = BiliClient.prefs.v556snapAutoAlign556
    BiliClient.prefs.v556snapAutoAlign556 = !current
    AppToast.show(this, "Snap Auto Align556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556SortAutoAlgorithm556Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v556sortAutoAlgorithm556).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Sort Auto Algorithm556",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v556sortAutoAlgorithm556 = value
        AppToast.show(this, "Sort Auto Algorithm556: $value")
    }
}

internal fun PlayerActivity.showV556SourceAutoSelect556Toggle() {
    val current = BiliClient.prefs.v556sourceAutoSelect556
    BiliClient.prefs.v556sourceAutoSelect556 = !current
    AppToast.show(this, "Source Auto Select556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556SpanAutoAdjust556Toggle() {
    val current = BiliClient.prefs.v556spanAutoAdjust556
    BiliClient.prefs.v556spanAutoAdjust556 = !current
    AppToast.show(this, "Span Auto Adjust556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556SplitAutoView556Toggle() {
    val current = BiliClient.prefs.v556splitAutoView556
    BiliClient.prefs.v556splitAutoView556 = !current
    AppToast.show(this, "Split Auto View556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556StackAutoLayer556Toggle() {
    val current = BiliClient.prefs.v556stackAutoLayer556
    BiliClient.prefs.v556stackAutoLayer556 = !current
    AppToast.show(this, "Stack Auto Layer556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556StageAutoAdvance556Toggle() {
    val current = BiliClient.prefs.v556stageAutoAdvance556
    BiliClient.prefs.v556stageAutoAdvance556 = !current
    AppToast.show(this, "Stage Auto Advance556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556StartAutoPlay556Toggle() {
    val current = BiliClient.prefs.v556startAutoPlay556
    BiliClient.prefs.v556startAutoPlay556 = !current
    AppToast.show(this, "Start Auto Play556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV556StateAutoPersist556Toggle() {
    val current = BiliClient.prefs.v556stateAutoPersist556
    BiliClient.prefs.v556stateAutoPersist556 = !current
    AppToast.show(this, "State Auto Persist556: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV557SkipSilenceAuto557Toggle() {
    val current = BiliClient.prefs.v557skipSilenceAuto557
    BiliClient.prefs.v557skipSilenceAuto557 = !current
    AppToast.show(this, "Skip Silence Auto557: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV557SliceAutoSegment557Toggle() {
    val current = BiliClient.prefs.v557sliceAutoSegment557
    BiliClient.prefs.v557sliceAutoSegment557 = !current
    AppToast.show(this, "Slice Auto Segment557: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV557SlideAutoTransition557Toggle() {
    val current = BiliClient.prefs.v557slideAutoTransition557
    BiliClient.prefs.v557slideAutoTransition557 = !current
    AppToast.show(this, "Slide Auto Transition557: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV557SlotAutoManage557Toggle() {
    val current = BiliClient.prefs.v557slotAutoManage557
    BiliClient.prefs.v557slotAutoManage557 = !current
    AppToast.show(this, "Slot Auto Manage557: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV557SmoothScrollEnabled557Toggle() {
    val current = BiliClient.prefs.v557smoothScrollEnabled557
    BiliClient.prefs.v557smoothScrollEnabled557 = !current
    AppToast.show(this, "Smooth Scroll Enabled557: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV557SnapAutoAlign557Toggle() {
    val current = BiliClient.prefs.v557snapAutoAlign557
    BiliClient.prefs.v557snapAutoAlign557 = !current
    AppToast.show(this, "Snap Auto Align557: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV557SourceAutoSelect557Toggle() {
    val current = BiliClient.prefs.v557sourceAutoSelect557
    BiliClient.prefs.v557sourceAutoSelect557 = !current
    AppToast.show(this, "Source Auto Select557: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV557SpanAutoAdjust557Toggle() {
    val current = BiliClient.prefs.v557spanAutoAdjust557
    BiliClient.prefs.v557spanAutoAdjust557 = !current
    AppToast.show(this, "Span Auto Adjust557: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV557SplitAutoView557Toggle() {
    val current = BiliClient.prefs.v557splitAutoView557
    BiliClient.prefs.v557splitAutoView557 = !current
    AppToast.show(this, "Split Auto View557: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV557StackAutoLayer557Toggle() {
    val current = BiliClient.prefs.v557stackAutoLayer557
    BiliClient.prefs.v557stackAutoLayer557 = !current
    AppToast.show(this, "Stack Auto Layer557: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV557StageAutoAdvance557Toggle() {
    val current = BiliClient.prefs.v557stageAutoAdvance557
    BiliClient.prefs.v557stageAutoAdvance557 = !current
    AppToast.show(this, "Stage Auto Advance557: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV557StartAutoPlay557Toggle() {
    val current = BiliClient.prefs.v557startAutoPlay557
    BiliClient.prefs.v557startAutoPlay557 = !current
    AppToast.show(this, "Start Auto Play557: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV557StateAutoPersist557Toggle() {
    val current = BiliClient.prefs.v557stateAutoPersist557
    BiliClient.prefs.v557stateAutoPersist557 = !current
    AppToast.show(this, "State Auto Persist557: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV558SkipSilenceAuto558Toggle() {
    val current = BiliClient.prefs.v558skipSilenceAuto558
    BiliClient.prefs.v558skipSilenceAuto558 = !current
    AppToast.show(this, "Skip Silence Auto558: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV558SliceAutoSegment558Toggle() {
    val current = BiliClient.prefs.v558sliceAutoSegment558
    BiliClient.prefs.v558sliceAutoSegment558 = !current
    AppToast.show(this, "Slice Auto Segment558: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV558SlideAutoTransition558Toggle() {
    val current = BiliClient.prefs.v558slideAutoTransition558
    BiliClient.prefs.v558slideAutoTransition558 = !current
    AppToast.show(this, "Slide Auto Transition558: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV558SlotAutoManage558Toggle() {
    val current = BiliClient.prefs.v558slotAutoManage558
    BiliClient.prefs.v558slotAutoManage558 = !current
    AppToast.show(this, "Slot Auto Manage558: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV558SmoothScrollEnabled558Toggle() {
    val current = BiliClient.prefs.v558smoothScrollEnabled558
    BiliClient.prefs.v558smoothScrollEnabled558 = !current
    AppToast.show(this, "Smooth Scroll Enabled558: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV558SnapAutoAlign558Toggle() {
    val current = BiliClient.prefs.v558snapAutoAlign558
    BiliClient.prefs.v558snapAutoAlign558 = !current
    AppToast.show(this, "Snap Auto Align558: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV558SourceAutoSelect558Toggle() {
    val current = BiliClient.prefs.v558sourceAutoSelect558
    BiliClient.prefs.v558sourceAutoSelect558 = !current
    AppToast.show(this, "Source Auto Select558: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV558SpanAutoAdjust558Toggle() {
    val current = BiliClient.prefs.v558spanAutoAdjust558
    BiliClient.prefs.v558spanAutoAdjust558 = !current
    AppToast.show(this, "Span Auto Adjust558: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV558SplitAutoView558Toggle() {
    val current = BiliClient.prefs.v558splitAutoView558
    BiliClient.prefs.v558splitAutoView558 = !current
    AppToast.show(this, "Split Auto View558: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV558StackAutoLayer558Toggle() {
    val current = BiliClient.prefs.v558stackAutoLayer558
    BiliClient.prefs.v558stackAutoLayer558 = !current
    AppToast.show(this, "Stack Auto Layer558: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV558StageAutoAdvance558Toggle() {
    val current = BiliClient.prefs.v558stageAutoAdvance558
    BiliClient.prefs.v558stageAutoAdvance558 = !current
    AppToast.show(this, "Stage Auto Advance558: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV558StartAutoPlay558Toggle() {
    val current = BiliClient.prefs.v558startAutoPlay558
    BiliClient.prefs.v558startAutoPlay558 = !current
    AppToast.show(this, "Start Auto Play558: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV558StateAutoPersist558Toggle() {
    val current = BiliClient.prefs.v558stateAutoPersist558
    BiliClient.prefs.v558stateAutoPersist558 = !current
    AppToast.show(this, "State Auto Persist558: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV559SkipSilenceAuto559Toggle() {
    val current = BiliClient.prefs.v559skipSilenceAuto559
    BiliClient.prefs.v559skipSilenceAuto559 = !current
    AppToast.show(this, "Skip Silence Auto559: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV559SliceAutoSegment559Toggle() {
    val current = BiliClient.prefs.v559sliceAutoSegment559
    BiliClient.prefs.v559sliceAutoSegment559 = !current
    AppToast.show(this, "Slice Auto Segment559: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV559SlideAutoTransition559Toggle() {
    val current = BiliClient.prefs.v559slideAutoTransition559
    BiliClient.prefs.v559slideAutoTransition559 = !current
    AppToast.show(this, "Slide Auto Transition559: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV559SlotAutoManage559Toggle() {
    val current = BiliClient.prefs.v559slotAutoManage559
    BiliClient.prefs.v559slotAutoManage559 = !current
    AppToast.show(this, "Slot Auto Manage559: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV559SmoothScrollEnabled559Toggle() {
    val current = BiliClient.prefs.v559smoothScrollEnabled559
    BiliClient.prefs.v559smoothScrollEnabled559 = !current
    AppToast.show(this, "Smooth Scroll Enabled559: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV559SnapAutoAlign559Toggle() {
    val current = BiliClient.prefs.v559snapAutoAlign559
    BiliClient.prefs.v559snapAutoAlign559 = !current
    AppToast.show(this, "Snap Auto Align559: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV559SourceAutoSelect559Toggle() {
    val current = BiliClient.prefs.v559sourceAutoSelect559
    BiliClient.prefs.v559sourceAutoSelect559 = !current
    AppToast.show(this, "Source Auto Select559: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV559SpanAutoAdjust559Toggle() {
    val current = BiliClient.prefs.v559spanAutoAdjust559
    BiliClient.prefs.v559spanAutoAdjust559 = !current
    AppToast.show(this, "Span Auto Adjust559: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV559SplitAutoView559Toggle() {
    val current = BiliClient.prefs.v559splitAutoView559
    BiliClient.prefs.v559splitAutoView559 = !current
    AppToast.show(this, "Split Auto View559: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV559StackAutoLayer559Toggle() {
    val current = BiliClient.prefs.v559stackAutoLayer559
    BiliClient.prefs.v559stackAutoLayer559 = !current
    AppToast.show(this, "Stack Auto Layer559: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV559StageAutoAdvance559Toggle() {
    val current = BiliClient.prefs.v559stageAutoAdvance559
    BiliClient.prefs.v559stageAutoAdvance559 = !current
    AppToast.show(this, "Stage Auto Advance559: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV559StartAutoPlay559Toggle() {
    val current = BiliClient.prefs.v559startAutoPlay559
    BiliClient.prefs.v559startAutoPlay559 = !current
    AppToast.show(this, "Start Auto Play559: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV559StateAutoPersist559Toggle() {
    val current = BiliClient.prefs.v559stateAutoPersist559
    BiliClient.prefs.v559stateAutoPersist559 = !current
    AppToast.show(this, "State Auto Persist559: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV560SkipSilenceAuto560Toggle() {
    val current = BiliClient.prefs.v560skipSilenceAuto560
    BiliClient.prefs.v560skipSilenceAuto560 = !current
    AppToast.show(this, "Skip Silence Auto560: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV560SliceAutoSegment560Toggle() {
    val current = BiliClient.prefs.v560sliceAutoSegment560
    BiliClient.prefs.v560sliceAutoSegment560 = !current
    AppToast.show(this, "Slice Auto Segment560: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV560SlideAutoTransition560Toggle() {
    val current = BiliClient.prefs.v560slideAutoTransition560
    BiliClient.prefs.v560slideAutoTransition560 = !current
    AppToast.show(this, "Slide Auto Transition560: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV560SlotAutoManage560Toggle() {
    val current = BiliClient.prefs.v560slotAutoManage560
    BiliClient.prefs.v560slotAutoManage560 = !current
    AppToast.show(this, "Slot Auto Manage560: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV560SmoothScrollEnabled560Toggle() {
    val current = BiliClient.prefs.v560smoothScrollEnabled560
    BiliClient.prefs.v560smoothScrollEnabled560 = !current
    AppToast.show(this, "Smooth Scroll Enabled560: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV560SnapAutoAlign560Toggle() {
    val current = BiliClient.prefs.v560snapAutoAlign560
    BiliClient.prefs.v560snapAutoAlign560 = !current
    AppToast.show(this, "Snap Auto Align560: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV560SourceAutoSelect560Toggle() {
    val current = BiliClient.prefs.v560sourceAutoSelect560
    BiliClient.prefs.v560sourceAutoSelect560 = !current
    AppToast.show(this, "Source Auto Select560: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV560SpanAutoAdjust560Toggle() {
    val current = BiliClient.prefs.v560spanAutoAdjust560
    BiliClient.prefs.v560spanAutoAdjust560 = !current
    AppToast.show(this, "Span Auto Adjust560: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV560SplitAutoView560Toggle() {
    val current = BiliClient.prefs.v560splitAutoView560
    BiliClient.prefs.v560splitAutoView560 = !current
    AppToast.show(this, "Split Auto View560: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV560StackAutoLayer560Toggle() {
    val current = BiliClient.prefs.v560stackAutoLayer560
    BiliClient.prefs.v560stackAutoLayer560 = !current
    AppToast.show(this, "Stack Auto Layer560: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV560StageAutoAdvance560Toggle() {
    val current = BiliClient.prefs.v560stageAutoAdvance560
    BiliClient.prefs.v560stageAutoAdvance560 = !current
    AppToast.show(this, "Stage Auto Advance560: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV560StartAutoPlay560Toggle() {
    val current = BiliClient.prefs.v560startAutoPlay560
    BiliClient.prefs.v560startAutoPlay560 = !current
    AppToast.show(this, "Start Auto Play560: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV560StateAutoPersist560Toggle() {
    val current = BiliClient.prefs.v560stateAutoPersist560
    BiliClient.prefs.v560stateAutoPersist560 = !current
    AppToast.show(this, "State Auto Persist560: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV561StaticIpAutoDetect561Toggle() {
    val current = BiliClient.prefs.v561staticIpAutoDetect561
    BiliClient.prefs.v561staticIpAutoDetect561 = !current
    AppToast.show(this, "Static IP Auto Detect561: ${if (!current) "ON" else "OFF"}")
}

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

internal fun PlayerActivity.showV561StopAutoConfirm561Toggle() {
    val current = BiliClient.prefs.v561stopAutoConfirm561
    BiliClient.prefs.v561stopAutoConfirm561 = !current
    AppToast.show(this, "Stop Auto Confirm561: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV561StoreAutoSync561Toggle() {
    val current = BiliClient.prefs.v561storeAutoSync561
    BiliClient.prefs.v561storeAutoSync561 = !current
    AppToast.show(this, "Store Auto Sync561: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV561StyleAutoTheme561Toggle() {
    val current = BiliClient.prefs.v561styleAutoTheme561
    BiliClient.prefs.v561styleAutoTheme561 = !current
    AppToast.show(this, "Style Auto Theme561: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV561SubmitAutoValidate561Toggle() {
    val current = BiliClient.prefs.v561submitAutoValidate561
    BiliClient.prefs.v561submitAutoValidate561 = !current
    AppToast.show(this, "Submit Auto Validate561: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV561SuffixAutoAppend561Toggle() {
    val current = BiliClient.prefs.v561suffixAutoAppend561
    BiliClient.prefs.v561suffixAutoAppend561 = !current
    AppToast.show(this, "Suffix Auto Append561: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV561SummaryAutoGenerate561Toggle() {
    val current = BiliClient.prefs.v561summaryAutoGenerate561
    BiliClient.prefs.v561summaryAutoGenerate561 = !current
    AppToast.show(this, "Summary Auto Generate561: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV561SwapAutoChannel561Toggle() {
    val current = BiliClient.prefs.v561swapAutoChannel561
    BiliClient.prefs.v561swapAutoChannel561 = !current
    AppToast.show(this, "Swap Auto Channel561: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV561SwitchAutoProfile561Toggle() {
    val current = BiliClient.prefs.v561switchAutoProfile561
    BiliClient.prefs.v561switchAutoProfile561 = !current
    AppToast.show(this, "Switch Auto Profile561: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV561TabAutoRestore561Toggle() {
    val current = BiliClient.prefs.v561tabAutoRestore561
    BiliClient.prefs.v561tabAutoRestore561 = !current
    AppToast.show(this, "Tab Auto Restore561: ${if (!current) "ON" else "OFF"}")
}

