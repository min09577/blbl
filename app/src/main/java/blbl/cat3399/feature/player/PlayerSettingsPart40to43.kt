package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast

// v543: Session Auto Save543
internal fun PlayerActivity.showV543SessionAutoSave543Toggle() {
    val current = BiliClient.prefs.v543sessionAutoSave543
    BiliClient.prefs.v543sessionAutoSave543 = !current
    AppToast.show(this, "Session Auto Save543: ${if (!current) "ON" else "OFF"}")
}

// v543: Set Auto Default543
internal fun PlayerActivity.showV543SetAutoDefault543Toggle() {
    val current = BiliClient.prefs.v543setAutoDefault543
    BiliClient.prefs.v543setAutoDefault543 = !current
    AppToast.show(this, "Set Auto Default543: ${if (!current) "ON" else "OFF"}")
}

// v543: Shadow Auto Drop543
internal fun PlayerActivity.showV543ShadowAutoDrop543Toggle() {
    val current = BiliClient.prefs.v543shadowAutoDrop543
    BiliClient.prefs.v543shadowAutoDrop543 = !current
    AppToast.show(this, "Shadow Auto Drop543: ${if (!current) "ON" else "OFF"}")
}

// v543: Shape Auto Detect543
internal fun PlayerActivity.showV543ShapeAutoDetect543Toggle() {
    val current = BiliClient.prefs.v543shapeAutoDetect543
    BiliClient.prefs.v543shapeAutoDetect543 = !current
    AppToast.show(this, "Shape Auto Detect543: ${if (!current) "ON" else "OFF"}")
}

// v543: Sharp Auto Adjust543
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

// v543: Shell Auto Execute543
internal fun PlayerActivity.showV543ShellAutoExecute543Toggle() {
    val current = BiliClient.prefs.v543shellAutoExecute543
    BiliClient.prefs.v543shellAutoExecute543 = !current
    AppToast.show(this, "Shell Auto Execute543: ${if (!current) "ON" else "OFF"}")
}

// v543: Shift Auto Offset543
internal fun PlayerActivity.showV543ShiftAutoOffset543Toggle() {
    val current = BiliClient.prefs.v543shiftAutoOffset543
    BiliClient.prefs.v543shiftAutoOffset543 = !current
    AppToast.show(this, "Shift Auto Offset543: ${if (!current) "ON" else "OFF"}")
}

// v543: Short Cut Auto Bind543
internal fun PlayerActivity.showV543ShortCutAutoBind543Toggle() {
    val current = BiliClient.prefs.v543shortCutAutoBind543
    BiliClient.prefs.v543shortCutAutoBind543 = !current
    AppToast.show(this, "Short Cut Auto Bind543: ${if (!current) "ON" else "OFF"}")
}

// v543: Show Auto Toggle543
internal fun PlayerActivity.showV543ShowAutoToggle543Toggle() {
    val current = BiliClient.prefs.v543showAutoToggle543
    BiliClient.prefs.v543showAutoToggle543 = !current
    AppToast.show(this, "Show Auto Toggle543: ${if (!current) "ON" else "OFF"}")
}

// v543: Shuffle Auto Seed543
internal fun PlayerActivity.showV543ShuffleAutoSeed543Toggle() {
    val current = BiliClient.prefs.v543shuffleAutoSeed543
    BiliClient.prefs.v543shuffleAutoSeed543 = !current
    AppToast.show(this, "Shuffle Auto Seed543: ${if (!current) "ON" else "OFF"}")
}

// v543: Signal Auto Boost543
internal fun PlayerActivity.showV543SignalAutoBoost543Toggle() {
    val current = BiliClient.prefs.v543signalAutoBoost543
    BiliClient.prefs.v543signalAutoBoost543 = !current
    AppToast.show(this, "Signal Auto Boost543: ${if (!current) "ON" else "OFF"}")
}

// v543: Single Instance Mode543
internal fun PlayerActivity.showV543SingleInstanceMode543Toggle() {
    val current = BiliClient.prefs.v543singleInstanceMode543
    BiliClient.prefs.v543singleInstanceMode543 = !current
    AppToast.show(this, "Single Instance Mode543: ${if (!current) "ON" else "OFF"}")
}

// v544: Send Auto Confirm544
internal fun PlayerActivity.showV544SendAutoConfirm544Toggle() {
    val current = BiliClient.prefs.v544sendAutoConfirm544
    BiliClient.prefs.v544sendAutoConfirm544 = !current
    AppToast.show(this, "Send Auto Confirm544: ${if (!current) "ON" else "OFF"}")
}

// v544: Sensor Auto Calibrate544
internal fun PlayerActivity.showV544SensorAutoCalibrate544Toggle() {
    val current = BiliClient.prefs.v544sensorAutoCalibrate544
    BiliClient.prefs.v544sensorAutoCalibrate544 = !current
    AppToast.show(this, "Sensor Auto Calibrate544: ${if (!current) "ON" else "OFF"}")
}

// v544: Server Auto Switch544
internal fun PlayerActivity.showV544ServerAutoSwitch544Toggle() {
    val current = BiliClient.prefs.v544serverAutoSwitch544
    BiliClient.prefs.v544serverAutoSwitch544 = !current
    AppToast.show(this, "Server Auto Switch544: ${if (!current) "ON" else "OFF"}")
}

// v544: Session Auto Save544
internal fun PlayerActivity.showV544SessionAutoSave544Toggle() {
    val current = BiliClient.prefs.v544sessionAutoSave544
    BiliClient.prefs.v544sessionAutoSave544 = !current
    AppToast.show(this, "Session Auto Save544: ${if (!current) "ON" else "OFF"}")
}

// v544: Set Auto Default544
internal fun PlayerActivity.showV544SetAutoDefault544Toggle() {
    val current = BiliClient.prefs.v544setAutoDefault544
    BiliClient.prefs.v544setAutoDefault544 = !current
    AppToast.show(this, "Set Auto Default544: ${if (!current) "ON" else "OFF"}")
}

// v544: Shadow Auto Drop544
internal fun PlayerActivity.showV544ShadowAutoDrop544Toggle() {
    val current = BiliClient.prefs.v544shadowAutoDrop544
    BiliClient.prefs.v544shadowAutoDrop544 = !current
    AppToast.show(this, "Shadow Auto Drop544: ${if (!current) "ON" else "OFF"}")
}

// v544: Shape Auto Detect544
internal fun PlayerActivity.showV544ShapeAutoDetect544Toggle() {
    val current = BiliClient.prefs.v544shapeAutoDetect544
    BiliClient.prefs.v544shapeAutoDetect544 = !current
    AppToast.show(this, "Shape Auto Detect544: ${if (!current) "ON" else "OFF"}")
}

// v544: Sharp Auto Adjust544
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

// v544: Shell Auto Execute544
internal fun PlayerActivity.showV544ShellAutoExecute544Toggle() {
    val current = BiliClient.prefs.v544shellAutoExecute544
    BiliClient.prefs.v544shellAutoExecute544 = !current
    AppToast.show(this, "Shell Auto Execute544: ${if (!current) "ON" else "OFF"}")
}

// v544: Shift Auto Offset544
internal fun PlayerActivity.showV544ShiftAutoOffset544Toggle() {
    val current = BiliClient.prefs.v544shiftAutoOffset544
    BiliClient.prefs.v544shiftAutoOffset544 = !current
    AppToast.show(this, "Shift Auto Offset544: ${if (!current) "ON" else "OFF"}")
}

// v544: Short Cut Auto Bind544
internal fun PlayerActivity.showV544ShortCutAutoBind544Toggle() {
    val current = BiliClient.prefs.v544shortCutAutoBind544
    BiliClient.prefs.v544shortCutAutoBind544 = !current
    AppToast.show(this, "Short Cut Auto Bind544: ${if (!current) "ON" else "OFF"}")
}

// v544: Show Auto Toggle544
internal fun PlayerActivity.showV544ShowAutoToggle544Toggle() {
    val current = BiliClient.prefs.v544showAutoToggle544
    BiliClient.prefs.v544showAutoToggle544 = !current
    AppToast.show(this, "Show Auto Toggle544: ${if (!current) "ON" else "OFF"}")
}

// v544: Shuffle Auto Seed544
internal fun PlayerActivity.showV544ShuffleAutoSeed544Toggle() {
    val current = BiliClient.prefs.v544shuffleAutoSeed544
    BiliClient.prefs.v544shuffleAutoSeed544 = !current
    AppToast.show(this, "Shuffle Auto Seed544: ${if (!current) "ON" else "OFF"}")
}

// v544: Signal Auto Boost544
internal fun PlayerActivity.showV544SignalAutoBoost544Toggle() {
    val current = BiliClient.prefs.v544signalAutoBoost544
    BiliClient.prefs.v544signalAutoBoost544 = !current
    AppToast.show(this, "Signal Auto Boost544: ${if (!current) "ON" else "OFF"}")
}

// v544: Single Instance Mode544
internal fun PlayerActivity.showV544SingleInstanceMode544Toggle() {
    val current = BiliClient.prefs.v544singleInstanceMode544
    BiliClient.prefs.v544singleInstanceMode544 = !current
    AppToast.show(this, "Single Instance Mode544: ${if (!current) "ON" else "OFF"}")
}

// v545: Send Auto Confirm545
internal fun PlayerActivity.showV545SendAutoConfirm545Toggle() {
    val current = BiliClient.prefs.v545sendAutoConfirm545
    BiliClient.prefs.v545sendAutoConfirm545 = !current
    AppToast.show(this, "Send Auto Confirm545: ${if (!current) "ON" else "OFF"}")
}

// v545: Sensor Auto Calibrate545
internal fun PlayerActivity.showV545SensorAutoCalibrate545Toggle() {
    val current = BiliClient.prefs.v545sensorAutoCalibrate545
    BiliClient.prefs.v545sensorAutoCalibrate545 = !current
    AppToast.show(this, "Sensor Auto Calibrate545: ${if (!current) "ON" else "OFF"}")
}

// v545: Server Auto Switch545
internal fun PlayerActivity.showV545ServerAutoSwitch545Toggle() {
    val current = BiliClient.prefs.v545serverAutoSwitch545
    BiliClient.prefs.v545serverAutoSwitch545 = !current
    AppToast.show(this, "Server Auto Switch545: ${if (!current) "ON" else "OFF"}")
}

// v545: Session Auto Save545
internal fun PlayerActivity.showV545SessionAutoSave545Toggle() {
    val current = BiliClient.prefs.v545sessionAutoSave545
    BiliClient.prefs.v545sessionAutoSave545 = !current
    AppToast.show(this, "Session Auto Save545: ${if (!current) "ON" else "OFF"}")
}

// v545: Set Auto Default545
internal fun PlayerActivity.showV545SetAutoDefault545Toggle() {
    val current = BiliClient.prefs.v545setAutoDefault545
    BiliClient.prefs.v545setAutoDefault545 = !current
    AppToast.show(this, "Set Auto Default545: ${if (!current) "ON" else "OFF"}")
}

// v545: Shadow Auto Drop545
internal fun PlayerActivity.showV545ShadowAutoDrop545Toggle() {
    val current = BiliClient.prefs.v545shadowAutoDrop545
    BiliClient.prefs.v545shadowAutoDrop545 = !current
    AppToast.show(this, "Shadow Auto Drop545: ${if (!current) "ON" else "OFF"}")
}

// v545: Shape Auto Detect545
internal fun PlayerActivity.showV545ShapeAutoDetect545Toggle() {
    val current = BiliClient.prefs.v545shapeAutoDetect545
    BiliClient.prefs.v545shapeAutoDetect545 = !current
    AppToast.show(this, "Shape Auto Detect545: ${if (!current) "ON" else "OFF"}")
}

// v545: Sharp Auto Adjust545
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

// v545: Shell Auto Execute545
internal fun PlayerActivity.showV545ShellAutoExecute545Toggle() {
    val current = BiliClient.prefs.v545shellAutoExecute545
    BiliClient.prefs.v545shellAutoExecute545 = !current
    AppToast.show(this, "Shell Auto Execute545: ${if (!current) "ON" else "OFF"}")
}

// v545: Shift Auto Offset545
internal fun PlayerActivity.showV545ShiftAutoOffset545Toggle() {
    val current = BiliClient.prefs.v545shiftAutoOffset545
    BiliClient.prefs.v545shiftAutoOffset545 = !current
    AppToast.show(this, "Shift Auto Offset545: ${if (!current) "ON" else "OFF"}")
}

// v545: Short Cut Auto Bind545
internal fun PlayerActivity.showV545ShortCutAutoBind545Toggle() {
    val current = BiliClient.prefs.v545shortCutAutoBind545
    BiliClient.prefs.v545shortCutAutoBind545 = !current
    AppToast.show(this, "Short Cut Auto Bind545: ${if (!current) "ON" else "OFF"}")
}

// v545: Show Auto Toggle545
internal fun PlayerActivity.showV545ShowAutoToggle545Toggle() {
    val current = BiliClient.prefs.v545showAutoToggle545
    BiliClient.prefs.v545showAutoToggle545 = !current
    AppToast.show(this, "Show Auto Toggle545: ${if (!current) "ON" else "OFF"}")
}

// v545: Shuffle Auto Seed545
internal fun PlayerActivity.showV545ShuffleAutoSeed545Toggle() {
    val current = BiliClient.prefs.v545shuffleAutoSeed545
    BiliClient.prefs.v545shuffleAutoSeed545 = !current
    AppToast.show(this, "Shuffle Auto Seed545: ${if (!current) "ON" else "OFF"}")
}

// v545: Signal Auto Boost545
internal fun PlayerActivity.showV545SignalAutoBoost545Toggle() {
    val current = BiliClient.prefs.v545signalAutoBoost545
    BiliClient.prefs.v545signalAutoBoost545 = !current
    AppToast.show(this, "Signal Auto Boost545: ${if (!current) "ON" else "OFF"}")
}

// v545: Single Instance Mode545
internal fun PlayerActivity.showV545SingleInstanceMode545Toggle() {
    val current = BiliClient.prefs.v545singleInstanceMode545
    BiliClient.prefs.v545singleInstanceMode545 = !current
    AppToast.show(this, "Single Instance Mode545: ${if (!current) "ON" else "OFF"}")
}

// v546: Send Auto Confirm546
internal fun PlayerActivity.showV546SendAutoConfirm546Toggle() {
    val current = BiliClient.prefs.v546sendAutoConfirm546
    BiliClient.prefs.v546sendAutoConfirm546 = !current
    AppToast.show(this, "Send Auto Confirm546: ${if (!current) "ON" else "OFF"}")
}

// v546: Sensor Auto Calibrate546
internal fun PlayerActivity.showV546SensorAutoCalibrate546Toggle() {
    val current = BiliClient.prefs.v546sensorAutoCalibrate546
    BiliClient.prefs.v546sensorAutoCalibrate546 = !current
    AppToast.show(this, "Sensor Auto Calibrate546: ${if (!current) "ON" else "OFF"}")
}

// v546: Server Auto Switch546
internal fun PlayerActivity.showV546ServerAutoSwitch546Toggle() {
    val current = BiliClient.prefs.v546serverAutoSwitch546
    BiliClient.prefs.v546serverAutoSwitch546 = !current
    AppToast.show(this, "Server Auto Switch546: ${if (!current) "ON" else "OFF"}")
}

// v546: Session Auto Save546
internal fun PlayerActivity.showV546SessionAutoSave546Toggle() {
    val current = BiliClient.prefs.v546sessionAutoSave546
    BiliClient.prefs.v546sessionAutoSave546 = !current
    AppToast.show(this, "Session Auto Save546: ${if (!current) "ON" else "OFF"}")
}

// v546: Set Auto Default546
internal fun PlayerActivity.showV546SetAutoDefault546Toggle() {
    val current = BiliClient.prefs.v546setAutoDefault546
    BiliClient.prefs.v546setAutoDefault546 = !current
    AppToast.show(this, "Set Auto Default546: ${if (!current) "ON" else "OFF"}")
}

// v546: Shadow Auto Drop546
internal fun PlayerActivity.showV546ShadowAutoDrop546Toggle() {
    val current = BiliClient.prefs.v546shadowAutoDrop546
    BiliClient.prefs.v546shadowAutoDrop546 = !current
    AppToast.show(this, "Shadow Auto Drop546: ${if (!current) "ON" else "OFF"}")
}

// v546: Shape Auto Detect546
internal fun PlayerActivity.showV546ShapeAutoDetect546Toggle() {
    val current = BiliClient.prefs.v546shapeAutoDetect546
    BiliClient.prefs.v546shapeAutoDetect546 = !current
    AppToast.show(this, "Shape Auto Detect546: ${if (!current) "ON" else "OFF"}")
}

// v546: Sharp Auto Adjust546
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

// v546: Shell Auto Execute546
internal fun PlayerActivity.showV546ShellAutoExecute546Toggle() {
    val current = BiliClient.prefs.v546shellAutoExecute546
    BiliClient.prefs.v546shellAutoExecute546 = !current
    AppToast.show(this, "Shell Auto Execute546: ${if (!current) "ON" else "OFF"}")
}

// v546: Shift Auto Offset546
internal fun PlayerActivity.showV546ShiftAutoOffset546Toggle() {
    val current = BiliClient.prefs.v546shiftAutoOffset546
    BiliClient.prefs.v546shiftAutoOffset546 = !current
    AppToast.show(this, "Shift Auto Offset546: ${if (!current) "ON" else "OFF"}")
}

// v546: Short Cut Auto Bind546
internal fun PlayerActivity.showV546ShortCutAutoBind546Toggle() {
    val current = BiliClient.prefs.v546shortCutAutoBind546
    BiliClient.prefs.v546shortCutAutoBind546 = !current
    AppToast.show(this, "Short Cut Auto Bind546: ${if (!current) "ON" else "OFF"}")
}

// v546: Show Auto Toggle546
internal fun PlayerActivity.showV546ShowAutoToggle546Toggle() {
    val current = BiliClient.prefs.v546showAutoToggle546
    BiliClient.prefs.v546showAutoToggle546 = !current
    AppToast.show(this, "Show Auto Toggle546: ${if (!current) "ON" else "OFF"}")
}

// v546: Shuffle Auto Seed546
internal fun PlayerActivity.showV546ShuffleAutoSeed546Toggle() {
    val current = BiliClient.prefs.v546shuffleAutoSeed546
    BiliClient.prefs.v546shuffleAutoSeed546 = !current
    AppToast.show(this, "Shuffle Auto Seed546: ${if (!current) "ON" else "OFF"}")
}

// v546: Signal Auto Boost546
internal fun PlayerActivity.showV546SignalAutoBoost546Toggle() {
    val current = BiliClient.prefs.v546signalAutoBoost546
    BiliClient.prefs.v546signalAutoBoost546 = !current
    AppToast.show(this, "Signal Auto Boost546: ${if (!current) "ON" else "OFF"}")
}

// v546: Single Instance Mode546
internal fun PlayerActivity.showV546SingleInstanceMode546Toggle() {
    val current = BiliClient.prefs.v546singleInstanceMode546
    BiliClient.prefs.v546singleInstanceMode546 = !current
    AppToast.show(this, "Single Instance Mode546: ${if (!current) "ON" else "OFF"}")
}

// v547: Send Auto Confirm547
internal fun PlayerActivity.showV547SendAutoConfirm547Toggle() {
    val current = BiliClient.prefs.v547sendAutoConfirm547
    BiliClient.prefs.v547sendAutoConfirm547 = !current
    AppToast.show(this, "Send Auto Confirm547: ${if (!current) "ON" else "OFF"}")
}

// v547: Sensor Auto Calibrate547
internal fun PlayerActivity.showV547SensorAutoCalibrate547Toggle() {
    val current = BiliClient.prefs.v547sensorAutoCalibrate547
    BiliClient.prefs.v547sensorAutoCalibrate547 = !current
    AppToast.show(this, "Sensor Auto Calibrate547: ${if (!current) "ON" else "OFF"}")
}

// v547: Server Auto Switch547
internal fun PlayerActivity.showV547ServerAutoSwitch547Toggle() {
    val current = BiliClient.prefs.v547serverAutoSwitch547
    BiliClient.prefs.v547serverAutoSwitch547 = !current
    AppToast.show(this, "Server Auto Switch547: ${if (!current) "ON" else "OFF"}")
}

// v547: Session Auto Save547
internal fun PlayerActivity.showV547SessionAutoSave547Toggle() {
    val current = BiliClient.prefs.v547sessionAutoSave547
    BiliClient.prefs.v547sessionAutoSave547 = !current
    AppToast.show(this, "Session Auto Save547: ${if (!current) "ON" else "OFF"}")
}

// v547: Set Auto Default547
internal fun PlayerActivity.showV547SetAutoDefault547Toggle() {
    val current = BiliClient.prefs.v547setAutoDefault547
    BiliClient.prefs.v547setAutoDefault547 = !current
    AppToast.show(this, "Set Auto Default547: ${if (!current) "ON" else "OFF"}")
}

// v547: Shadow Auto Drop547
internal fun PlayerActivity.showV547ShadowAutoDrop547Toggle() {
    val current = BiliClient.prefs.v547shadowAutoDrop547
    BiliClient.prefs.v547shadowAutoDrop547 = !current
    AppToast.show(this, "Shadow Auto Drop547: ${if (!current) "ON" else "OFF"}")
}

// v547: Shape Auto Detect547
internal fun PlayerActivity.showV547ShapeAutoDetect547Toggle() {
    val current = BiliClient.prefs.v547shapeAutoDetect547
    BiliClient.prefs.v547shapeAutoDetect547 = !current
    AppToast.show(this, "Shape Auto Detect547: ${if (!current) "ON" else "OFF"}")
}

// v547: Sharp Auto Adjust547
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

// v547: Shell Auto Execute547
internal fun PlayerActivity.showV547ShellAutoExecute547Toggle() {
    val current = BiliClient.prefs.v547shellAutoExecute547
    BiliClient.prefs.v547shellAutoExecute547 = !current
    AppToast.show(this, "Shell Auto Execute547: ${if (!current) "ON" else "OFF"}")
}

// v547: Shift Auto Offset547
internal fun PlayerActivity.showV547ShiftAutoOffset547Toggle() {
    val current = BiliClient.prefs.v547shiftAutoOffset547
    BiliClient.prefs.v547shiftAutoOffset547 = !current
    AppToast.show(this, "Shift Auto Offset547: ${if (!current) "ON" else "OFF"}")
}

// v547: Short Cut Auto Bind547
internal fun PlayerActivity.showV547ShortCutAutoBind547Toggle() {
    val current = BiliClient.prefs.v547shortCutAutoBind547
    BiliClient.prefs.v547shortCutAutoBind547 = !current
    AppToast.show(this, "Short Cut Auto Bind547: ${if (!current) "ON" else "OFF"}")
}

// v547: Show Auto Toggle547
internal fun PlayerActivity.showV547ShowAutoToggle547Toggle() {
    val current = BiliClient.prefs.v547showAutoToggle547
    BiliClient.prefs.v547showAutoToggle547 = !current
    AppToast.show(this, "Show Auto Toggle547: ${if (!current) "ON" else "OFF"}")
}

// v547: Shuffle Auto Seed547
internal fun PlayerActivity.showV547ShuffleAutoSeed547Toggle() {
    val current = BiliClient.prefs.v547shuffleAutoSeed547
    BiliClient.prefs.v547shuffleAutoSeed547 = !current
    AppToast.show(this, "Shuffle Auto Seed547: ${if (!current) "ON" else "OFF"}")
}

// v547: Signal Auto Boost547
internal fun PlayerActivity.showV547SignalAutoBoost547Toggle() {
    val current = BiliClient.prefs.v547signalAutoBoost547
    BiliClient.prefs.v547signalAutoBoost547 = !current
    AppToast.show(this, "Signal Auto Boost547: ${if (!current) "ON" else "OFF"}")
}

// v547: Single Instance Mode547
internal fun PlayerActivity.showV547SingleInstanceMode547Toggle() {
    val current = BiliClient.prefs.v547singleInstanceMode547
    BiliClient.prefs.v547singleInstanceMode547 = !current
    AppToast.show(this, "Single Instance Mode547: ${if (!current) "ON" else "OFF"}")
}

// v548: Send Auto Confirm548
internal fun PlayerActivity.showV548SendAutoConfirm548Toggle() {
    val current = BiliClient.prefs.v548sendAutoConfirm548
    BiliClient.prefs.v548sendAutoConfirm548 = !current
    AppToast.show(this, "Send Auto Confirm548: ${if (!current) "ON" else "OFF"}")
}

// v548: Sensor Auto Calibrate548
internal fun PlayerActivity.showV548SensorAutoCalibrate548Toggle() {
    val current = BiliClient.prefs.v548sensorAutoCalibrate548
    BiliClient.prefs.v548sensorAutoCalibrate548 = !current
    AppToast.show(this, "Sensor Auto Calibrate548: ${if (!current) "ON" else "OFF"}")
}

// v548: Server Auto Switch548
internal fun PlayerActivity.showV548ServerAutoSwitch548Toggle() {
    val current = BiliClient.prefs.v548serverAutoSwitch548
    BiliClient.prefs.v548serverAutoSwitch548 = !current
    AppToast.show(this, "Server Auto Switch548: ${if (!current) "ON" else "OFF"}")
}

// v548: Session Auto Save548
internal fun PlayerActivity.showV548SessionAutoSave548Toggle() {
    val current = BiliClient.prefs.v548sessionAutoSave548
    BiliClient.prefs.v548sessionAutoSave548 = !current
    AppToast.show(this, "Session Auto Save548: ${if (!current) "ON" else "OFF"}")
}

// v548: Set Auto Default548
internal fun PlayerActivity.showV548SetAutoDefault548Toggle() {
    val current = BiliClient.prefs.v548setAutoDefault548
    BiliClient.prefs.v548setAutoDefault548 = !current
    AppToast.show(this, "Set Auto Default548: ${if (!current) "ON" else "OFF"}")
}

// v548: Shadow Auto Drop548
internal fun PlayerActivity.showV548ShadowAutoDrop548Toggle() {
    val current = BiliClient.prefs.v548shadowAutoDrop548
    BiliClient.prefs.v548shadowAutoDrop548 = !current
    AppToast.show(this, "Shadow Auto Drop548: ${if (!current) "ON" else "OFF"}")
}

// v548: Shape Auto Detect548
internal fun PlayerActivity.showV548ShapeAutoDetect548Toggle() {
    val current = BiliClient.prefs.v548shapeAutoDetect548
    BiliClient.prefs.v548shapeAutoDetect548 = !current
    AppToast.show(this, "Shape Auto Detect548: ${if (!current) "ON" else "OFF"}")
}

// v548: Sharp Auto Adjust548
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

// v548: Shell Auto Execute548
internal fun PlayerActivity.showV548ShellAutoExecute548Toggle() {
    val current = BiliClient.prefs.v548shellAutoExecute548
    BiliClient.prefs.v548shellAutoExecute548 = !current
    AppToast.show(this, "Shell Auto Execute548: ${if (!current) "ON" else "OFF"}")
}

// v548: Shift Auto Offset548
internal fun PlayerActivity.showV548ShiftAutoOffset548Toggle() {
    val current = BiliClient.prefs.v548shiftAutoOffset548
    BiliClient.prefs.v548shiftAutoOffset548 = !current
    AppToast.show(this, "Shift Auto Offset548: ${if (!current) "ON" else "OFF"}")
}

// v548: Short Cut Auto Bind548
internal fun PlayerActivity.showV548ShortCutAutoBind548Toggle() {
    val current = BiliClient.prefs.v548shortCutAutoBind548
    BiliClient.prefs.v548shortCutAutoBind548 = !current
    AppToast.show(this, "Short Cut Auto Bind548: ${if (!current) "ON" else "OFF"}")
}

// v548: Show Auto Toggle548
internal fun PlayerActivity.showV548ShowAutoToggle548Toggle() {
    val current = BiliClient.prefs.v548showAutoToggle548
    BiliClient.prefs.v548showAutoToggle548 = !current
    AppToast.show(this, "Show Auto Toggle548: ${if (!current) "ON" else "OFF"}")
}

// v548: Shuffle Auto Seed548
internal fun PlayerActivity.showV548ShuffleAutoSeed548Toggle() {
    val current = BiliClient.prefs.v548shuffleAutoSeed548
    BiliClient.prefs.v548shuffleAutoSeed548 = !current
    AppToast.show(this, "Shuffle Auto Seed548: ${if (!current) "ON" else "OFF"}")
}

// v548: Signal Auto Boost548
internal fun PlayerActivity.showV548SignalAutoBoost548Toggle() {
    val current = BiliClient.prefs.v548signalAutoBoost548
    BiliClient.prefs.v548signalAutoBoost548 = !current
    AppToast.show(this, "Signal Auto Boost548: ${if (!current) "ON" else "OFF"}")
}

// v548: Single Instance Mode548
internal fun PlayerActivity.showV548SingleInstanceMode548Toggle() {
    val current = BiliClient.prefs.v548singleInstanceMode548
    BiliClient.prefs.v548singleInstanceMode548 = !current
    AppToast.show(this, "Single Instance Mode548: ${if (!current) "ON" else "OFF"}")
}

// v549: Send Auto Confirm549
internal fun PlayerActivity.showV549SendAutoConfirm549Toggle() {
    val current = BiliClient.prefs.v549sendAutoConfirm549
    BiliClient.prefs.v549sendAutoConfirm549 = !current
    AppToast.show(this, "Send Auto Confirm549: ${if (!current) "ON" else "OFF"}")
}

// v549: Sensor Auto Calibrate549
internal fun PlayerActivity.showV549SensorAutoCalibrate549Toggle() {
    val current = BiliClient.prefs.v549sensorAutoCalibrate549
    BiliClient.prefs.v549sensorAutoCalibrate549 = !current
    AppToast.show(this, "Sensor Auto Calibrate549: ${if (!current) "ON" else "OFF"}")
}

// v549: Server Auto Switch549
internal fun PlayerActivity.showV549ServerAutoSwitch549Toggle() {
    val current = BiliClient.prefs.v549serverAutoSwitch549
    BiliClient.prefs.v549serverAutoSwitch549 = !current
    AppToast.show(this, "Server Auto Switch549: ${if (!current) "ON" else "OFF"}")
}

// v549: Session Auto Save549
internal fun PlayerActivity.showV549SessionAutoSave549Toggle() {
    val current = BiliClient.prefs.v549sessionAutoSave549
    BiliClient.prefs.v549sessionAutoSave549 = !current
    AppToast.show(this, "Session Auto Save549: ${if (!current) "ON" else "OFF"}")
}

// v549: Set Auto Default549
internal fun PlayerActivity.showV549SetAutoDefault549Toggle() {
    val current = BiliClient.prefs.v549setAutoDefault549
    BiliClient.prefs.v549setAutoDefault549 = !current
    AppToast.show(this, "Set Auto Default549: ${if (!current) "ON" else "OFF"}")
}

// v549: Shadow Auto Drop549
internal fun PlayerActivity.showV549ShadowAutoDrop549Toggle() {
    val current = BiliClient.prefs.v549shadowAutoDrop549
    BiliClient.prefs.v549shadowAutoDrop549 = !current
    AppToast.show(this, "Shadow Auto Drop549: ${if (!current) "ON" else "OFF"}")
}

// v549: Shape Auto Detect549
internal fun PlayerActivity.showV549ShapeAutoDetect549Toggle() {
    val current = BiliClient.prefs.v549shapeAutoDetect549
    BiliClient.prefs.v549shapeAutoDetect549 = !current
    AppToast.show(this, "Shape Auto Detect549: ${if (!current) "ON" else "OFF"}")
}

// v549: Sharp Auto Adjust549
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

// v549: Shell Auto Execute549
internal fun PlayerActivity.showV549ShellAutoExecute549Toggle() {
    val current = BiliClient.prefs.v549shellAutoExecute549
    BiliClient.prefs.v549shellAutoExecute549 = !current
    AppToast.show(this, "Shell Auto Execute549: ${if (!current) "ON" else "OFF"}")
}

// v549: Shift Auto Offset549
internal fun PlayerActivity.showV549ShiftAutoOffset549Toggle() {
    val current = BiliClient.prefs.v549shiftAutoOffset549
    BiliClient.prefs.v549shiftAutoOffset549 = !current
    AppToast.show(this, "Shift Auto Offset549: ${if (!current) "ON" else "OFF"}")
}

// v549: Short Cut Auto Bind549
internal fun PlayerActivity.showV549ShortCutAutoBind549Toggle() {
    val current = BiliClient.prefs.v549shortCutAutoBind549
    BiliClient.prefs.v549shortCutAutoBind549 = !current
    AppToast.show(this, "Short Cut Auto Bind549: ${if (!current) "ON" else "OFF"}")
}

// v549: Show Auto Toggle549
internal fun PlayerActivity.showV549ShowAutoToggle549Toggle() {
    val current = BiliClient.prefs.v549showAutoToggle549
    BiliClient.prefs.v549showAutoToggle549 = !current
    AppToast.show(this, "Show Auto Toggle549: ${if (!current) "ON" else "OFF"}")
}

// v549: Shuffle Auto Seed549
internal fun PlayerActivity.showV549ShuffleAutoSeed549Toggle() {
    val current = BiliClient.prefs.v549shuffleAutoSeed549
    BiliClient.prefs.v549shuffleAutoSeed549 = !current
    AppToast.show(this, "Shuffle Auto Seed549: ${if (!current) "ON" else "OFF"}")
}

// v549: Signal Auto Boost549
internal fun PlayerActivity.showV549SignalAutoBoost549Toggle() {
    val current = BiliClient.prefs.v549signalAutoBoost549
    BiliClient.prefs.v549signalAutoBoost549 = !current
    AppToast.show(this, "Signal Auto Boost549: ${if (!current) "ON" else "OFF"}")
}

// v549: Single Instance Mode549
internal fun PlayerActivity.showV549SingleInstanceMode549Toggle() {
    val current = BiliClient.prefs.v549singleInstanceMode549
    BiliClient.prefs.v549singleInstanceMode549 = !current
    AppToast.show(this, "Single Instance Mode549: ${if (!current) "ON" else "OFF"}")
}

// v550: Send Auto Confirm550
internal fun PlayerActivity.showV550SendAutoConfirm550Toggle() {
    val current = BiliClient.prefs.v550sendAutoConfirm550
    BiliClient.prefs.v550sendAutoConfirm550 = !current
    AppToast.show(this, "Send Auto Confirm550: ${if (!current) "ON" else "OFF"}")
}

// v550: Sensor Auto Calibrate550
internal fun PlayerActivity.showV550SensorAutoCalibrate550Toggle() {
    val current = BiliClient.prefs.v550sensorAutoCalibrate550
    BiliClient.prefs.v550sensorAutoCalibrate550 = !current
    AppToast.show(this, "Sensor Auto Calibrate550: ${if (!current) "ON" else "OFF"}")
}

// v550: Server Auto Switch550
internal fun PlayerActivity.showV550ServerAutoSwitch550Toggle() {
    val current = BiliClient.prefs.v550serverAutoSwitch550
    BiliClient.prefs.v550serverAutoSwitch550 = !current
    AppToast.show(this, "Server Auto Switch550: ${if (!current) "ON" else "OFF"}")
}

// v550: Session Auto Save550
internal fun PlayerActivity.showV550SessionAutoSave550Toggle() {
    val current = BiliClient.prefs.v550sessionAutoSave550
    BiliClient.prefs.v550sessionAutoSave550 = !current
    AppToast.show(this, "Session Auto Save550: ${if (!current) "ON" else "OFF"}")
}

// v550: Set Auto Default550
internal fun PlayerActivity.showV550SetAutoDefault550Toggle() {
    val current = BiliClient.prefs.v550setAutoDefault550
    BiliClient.prefs.v550setAutoDefault550 = !current
    AppToast.show(this, "Set Auto Default550: ${if (!current) "ON" else "OFF"}")
}

// v550: Shadow Auto Drop550
internal fun PlayerActivity.showV550ShadowAutoDrop550Toggle() {
    val current = BiliClient.prefs.v550shadowAutoDrop550
    BiliClient.prefs.v550shadowAutoDrop550 = !current
    AppToast.show(this, "Shadow Auto Drop550: ${if (!current) "ON" else "OFF"}")
}

// v550: Shape Auto Detect550
internal fun PlayerActivity.showV550ShapeAutoDetect550Toggle() {
    val current = BiliClient.prefs.v550shapeAutoDetect550
    BiliClient.prefs.v550shapeAutoDetect550 = !current
    AppToast.show(this, "Shape Auto Detect550: ${if (!current) "ON" else "OFF"}")
}

// v550: Sharp Auto Adjust550
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

// v550: Shell Auto Execute550
internal fun PlayerActivity.showV550ShellAutoExecute550Toggle() {
    val current = BiliClient.prefs.v550shellAutoExecute550
    BiliClient.prefs.v550shellAutoExecute550 = !current
    AppToast.show(this, "Shell Auto Execute550: ${if (!current) "ON" else "OFF"}")
}

// v550: Shift Auto Offset550
internal fun PlayerActivity.showV550ShiftAutoOffset550Toggle() {
    val current = BiliClient.prefs.v550shiftAutoOffset550
    BiliClient.prefs.v550shiftAutoOffset550 = !current
    AppToast.show(this, "Shift Auto Offset550: ${if (!current) "ON" else "OFF"}")
}

// v550: Short Cut Auto Bind550
internal fun PlayerActivity.showV550ShortCutAutoBind550Toggle() {
    val current = BiliClient.prefs.v550shortCutAutoBind550
    BiliClient.prefs.v550shortCutAutoBind550 = !current
    AppToast.show(this, "Short Cut Auto Bind550: ${if (!current) "ON" else "OFF"}")
}

// v550: Show Auto Toggle550
internal fun PlayerActivity.showV550ShowAutoToggle550Toggle() {
    val current = BiliClient.prefs.v550showAutoToggle550
    BiliClient.prefs.v550showAutoToggle550 = !current
    AppToast.show(this, "Show Auto Toggle550: ${if (!current) "ON" else "OFF"}")
}

// v550: Shuffle Auto Seed550
internal fun PlayerActivity.showV550ShuffleAutoSeed550Toggle() {
    val current = BiliClient.prefs.v550shuffleAutoSeed550
    BiliClient.prefs.v550shuffleAutoSeed550 = !current
    AppToast.show(this, "Shuffle Auto Seed550: ${if (!current) "ON" else "OFF"}")
}

// v550: Signal Auto Boost550
internal fun PlayerActivity.showV550SignalAutoBoost550Toggle() {
    val current = BiliClient.prefs.v550signalAutoBoost550
    BiliClient.prefs.v550signalAutoBoost550 = !current
    AppToast.show(this, "Signal Auto Boost550: ${if (!current) "ON" else "OFF"}")
}

// v550: Single Instance Mode550
internal fun PlayerActivity.showV550SingleInstanceMode550Toggle() {
    val current = BiliClient.prefs.v550singleInstanceMode550
    BiliClient.prefs.v550singleInstanceMode550 = !current
    AppToast.show(this, "Single Instance Mode550: ${if (!current) "ON" else "OFF"}")
}

// v551: Skip Silence Auto551
internal fun PlayerActivity.showV551SkipSilenceAuto551Toggle() {
    val current = BiliClient.prefs.v551skipSilenceAuto551
    BiliClient.prefs.v551skipSilenceAuto551 = !current
    AppToast.show(this, "Skip Silence Auto551: ${if (!current) "ON" else "OFF"}")
}

// v551: Slice Auto Segment551
internal fun PlayerActivity.showV551SliceAutoSegment551Toggle() {
    val current = BiliClient.prefs.v551sliceAutoSegment551
    BiliClient.prefs.v551sliceAutoSegment551 = !current
    AppToast.show(this, "Slice Auto Segment551: ${if (!current) "ON" else "OFF"}")
}

// v551: Slide Auto Transition551
internal fun PlayerActivity.showV551SlideAutoTransition551Toggle() {
    val current = BiliClient.prefs.v551slideAutoTransition551
    BiliClient.prefs.v551slideAutoTransition551 = !current
    AppToast.show(this, "Slide Auto Transition551: ${if (!current) "ON" else "OFF"}")
}

// v551: Slot Auto Manage551
internal fun PlayerActivity.showV551SlotAutoManage551Toggle() {
    val current = BiliClient.prefs.v551slotAutoManage551
    BiliClient.prefs.v551slotAutoManage551 = !current
    AppToast.show(this, "Slot Auto Manage551: ${if (!current) "ON" else "OFF"}")
}

// v551: Smart Auto Quality551
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

// v551: Smooth Scroll Enabled551
internal fun PlayerActivity.showV551SmoothScrollEnabled551Toggle() {
    val current = BiliClient.prefs.v551smoothScrollEnabled551
    BiliClient.prefs.v551smoothScrollEnabled551 = !current
    AppToast.show(this, "Smooth Scroll Enabled551: ${if (!current) "ON" else "OFF"}")
}

// v551: Snap Auto Align551
internal fun PlayerActivity.showV551SnapAutoAlign551Toggle() {
    val current = BiliClient.prefs.v551snapAutoAlign551
    BiliClient.prefs.v551snapAutoAlign551 = !current
    AppToast.show(this, "Snap Auto Align551: ${if (!current) "ON" else "OFF"}")
}

// v551: Sort Auto Algorithm551
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

// v551: Source Auto Select551
internal fun PlayerActivity.showV551SourceAutoSelect551Toggle() {
    val current = BiliClient.prefs.v551sourceAutoSelect551
    BiliClient.prefs.v551sourceAutoSelect551 = !current
    AppToast.show(this, "Source Auto Select551: ${if (!current) "ON" else "OFF"}")
}

// v551: Span Auto Adjust551
internal fun PlayerActivity.showV551SpanAutoAdjust551Toggle() {
    val current = BiliClient.prefs.v551spanAutoAdjust551
    BiliClient.prefs.v551spanAutoAdjust551 = !current
    AppToast.show(this, "Span Auto Adjust551: ${if (!current) "ON" else "OFF"}")
}

// v551: Split Auto View551
internal fun PlayerActivity.showV551SplitAutoView551Toggle() {
    val current = BiliClient.prefs.v551splitAutoView551
    BiliClient.prefs.v551splitAutoView551 = !current
    AppToast.show(this, "Split Auto View551: ${if (!current) "ON" else "OFF"}")
}

// v551: Stack Auto Layer551
internal fun PlayerActivity.showV551StackAutoLayer551Toggle() {
    val current = BiliClient.prefs.v551stackAutoLayer551
    BiliClient.prefs.v551stackAutoLayer551 = !current
    AppToast.show(this, "Stack Auto Layer551: ${if (!current) "ON" else "OFF"}")
}

// v551: Stage Auto Advance551
internal fun PlayerActivity.showV551StageAutoAdvance551Toggle() {
    val current = BiliClient.prefs.v551stageAutoAdvance551
    BiliClient.prefs.v551stageAutoAdvance551 = !current
    AppToast.show(this, "Stage Auto Advance551: ${if (!current) "ON" else "OFF"}")
}

// v551: Start Auto Play551
internal fun PlayerActivity.showV551StartAutoPlay551Toggle() {
    val current = BiliClient.prefs.v551startAutoPlay551
    BiliClient.prefs.v551startAutoPlay551 = !current
    AppToast.show(this, "Start Auto Play551: ${if (!current) "ON" else "OFF"}")
}

// v551: State Auto Persist551
internal fun PlayerActivity.showV551StateAutoPersist551Toggle() {
    val current = BiliClient.prefs.v551stateAutoPersist551
    BiliClient.prefs.v551stateAutoPersist551 = !current
    AppToast.show(this, "State Auto Persist551: ${if (!current) "ON" else "OFF"}")
}

// v552: Skip Silence Auto552
internal fun PlayerActivity.showV552SkipSilenceAuto552Toggle() {
    val current = BiliClient.prefs.v552skipSilenceAuto552
    BiliClient.prefs.v552skipSilenceAuto552 = !current
    AppToast.show(this, "Skip Silence Auto552: ${if (!current) "ON" else "OFF"}")
}

// v552: Slice Auto Segment552
internal fun PlayerActivity.showV552SliceAutoSegment552Toggle() {
    val current = BiliClient.prefs.v552sliceAutoSegment552
    BiliClient.prefs.v552sliceAutoSegment552 = !current
    AppToast.show(this, "Slice Auto Segment552: ${if (!current) "ON" else "OFF"}")
}

// v552: Slide Auto Transition552
internal fun PlayerActivity.showV552SlideAutoTransition552Toggle() {
    val current = BiliClient.prefs.v552slideAutoTransition552
    BiliClient.prefs.v552slideAutoTransition552 = !current
    AppToast.show(this, "Slide Auto Transition552: ${if (!current) "ON" else "OFF"}")
}

// v552: Slot Auto Manage552
internal fun PlayerActivity.showV552SlotAutoManage552Toggle() {
    val current = BiliClient.prefs.v552slotAutoManage552
    BiliClient.prefs.v552slotAutoManage552 = !current
    AppToast.show(this, "Slot Auto Manage552: ${if (!current) "ON" else "OFF"}")
}

// v552: Smart Auto Quality552
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

// v552: Smooth Scroll Enabled552
internal fun PlayerActivity.showV552SmoothScrollEnabled552Toggle() {
    val current = BiliClient.prefs.v552smoothScrollEnabled552
    BiliClient.prefs.v552smoothScrollEnabled552 = !current
    AppToast.show(this, "Smooth Scroll Enabled552: ${if (!current) "ON" else "OFF"}")
}

// v552: Snap Auto Align552
internal fun PlayerActivity.showV552SnapAutoAlign552Toggle() {
    val current = BiliClient.prefs.v552snapAutoAlign552
    BiliClient.prefs.v552snapAutoAlign552 = !current
    AppToast.show(this, "Snap Auto Align552: ${if (!current) "ON" else "OFF"}")
}

// v552: Sort Auto Algorithm552
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

// v552: Source Auto Select552
internal fun PlayerActivity.showV552SourceAutoSelect552Toggle() {
    val current = BiliClient.prefs.v552sourceAutoSelect552
    BiliClient.prefs.v552sourceAutoSelect552 = !current
    AppToast.show(this, "Source Auto Select552: ${if (!current) "ON" else "OFF"}")
}

// v552: Span Auto Adjust552
internal fun PlayerActivity.showV552SpanAutoAdjust552Toggle() {
    val current = BiliClient.prefs.v552spanAutoAdjust552
    BiliClient.prefs.v552spanAutoAdjust552 = !current
    AppToast.show(this, "Span Auto Adjust552: ${if (!current) "ON" else "OFF"}")
}

// v552: Split Auto View552
internal fun PlayerActivity.showV552SplitAutoView552Toggle() {
    val current = BiliClient.prefs.v552splitAutoView552
    BiliClient.prefs.v552splitAutoView552 = !current
    AppToast.show(this, "Split Auto View552: ${if (!current) "ON" else "OFF"}")
}

// v552: Stack Auto Layer552
internal fun PlayerActivity.showV552StackAutoLayer552Toggle() {
    val current = BiliClient.prefs.v552stackAutoLayer552
    BiliClient.prefs.v552stackAutoLayer552 = !current
    AppToast.show(this, "Stack Auto Layer552: ${if (!current) "ON" else "OFF"}")
}

// v552: Stage Auto Advance552
internal fun PlayerActivity.showV552StageAutoAdvance552Toggle() {
    val current = BiliClient.prefs.v552stageAutoAdvance552
    BiliClient.prefs.v552stageAutoAdvance552 = !current
    AppToast.show(this, "Stage Auto Advance552: ${if (!current) "ON" else "OFF"}")
}

// v552: Start Auto Play552
internal fun PlayerActivity.showV552StartAutoPlay552Toggle() {
    val current = BiliClient.prefs.v552startAutoPlay552
    BiliClient.prefs.v552startAutoPlay552 = !current
    AppToast.show(this, "Start Auto Play552: ${if (!current) "ON" else "OFF"}")
}

// v552: State Auto Persist552
internal fun PlayerActivity.showV552StateAutoPersist552Toggle() {
    val current = BiliClient.prefs.v552stateAutoPersist552
    BiliClient.prefs.v552stateAutoPersist552 = !current
    AppToast.show(this, "State Auto Persist552: ${if (!current) "ON" else "OFF"}")
}

// v553: Skip Silence Auto553
internal fun PlayerActivity.showV553SkipSilenceAuto553Toggle() {
    val current = BiliClient.prefs.v553skipSilenceAuto553
    BiliClient.prefs.v553skipSilenceAuto553 = !current
    AppToast.show(this, "Skip Silence Auto553: ${if (!current) "ON" else "OFF"}")
}

// v553: Slice Auto Segment553
internal fun PlayerActivity.showV553SliceAutoSegment553Toggle() {
    val current = BiliClient.prefs.v553sliceAutoSegment553
    BiliClient.prefs.v553sliceAutoSegment553 = !current
    AppToast.show(this, "Slice Auto Segment553: ${if (!current) "ON" else "OFF"}")
}

// v553: Slide Auto Transition553
internal fun PlayerActivity.showV553SlideAutoTransition553Toggle() {
    val current = BiliClient.prefs.v553slideAutoTransition553
    BiliClient.prefs.v553slideAutoTransition553 = !current
    AppToast.show(this, "Slide Auto Transition553: ${if (!current) "ON" else "OFF"}")
}

// v553: Slot Auto Manage553
internal fun PlayerActivity.showV553SlotAutoManage553Toggle() {
    val current = BiliClient.prefs.v553slotAutoManage553
    BiliClient.prefs.v553slotAutoManage553 = !current
    AppToast.show(this, "Slot Auto Manage553: ${if (!current) "ON" else "OFF"}")
}

// v553: Smart Auto Quality553
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

// v553: Smooth Scroll Enabled553
internal fun PlayerActivity.showV553SmoothScrollEnabled553Toggle() {
    val current = BiliClient.prefs.v553smoothScrollEnabled553
    BiliClient.prefs.v553smoothScrollEnabled553 = !current
    AppToast.show(this, "Smooth Scroll Enabled553: ${if (!current) "ON" else "OFF"}")
}

// v553: Snap Auto Align553
internal fun PlayerActivity.showV553SnapAutoAlign553Toggle() {
    val current = BiliClient.prefs.v553snapAutoAlign553
    BiliClient.prefs.v553snapAutoAlign553 = !current
    AppToast.show(this, "Snap Auto Align553: ${if (!current) "ON" else "OFF"}")
}

// v553: Sort Auto Algorithm553
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

// v553: Source Auto Select553
internal fun PlayerActivity.showV553SourceAutoSelect553Toggle() {
    val current = BiliClient.prefs.v553sourceAutoSelect553
    BiliClient.prefs.v553sourceAutoSelect553 = !current
    AppToast.show(this, "Source Auto Select553: ${if (!current) "ON" else "OFF"}")
}

// v553: Span Auto Adjust553
internal fun PlayerActivity.showV553SpanAutoAdjust553Toggle() {
    val current = BiliClient.prefs.v553spanAutoAdjust553
    BiliClient.prefs.v553spanAutoAdjust553 = !current
    AppToast.show(this, "Span Auto Adjust553: ${if (!current) "ON" else "OFF"}")
}

// v553: Split Auto View553
internal fun PlayerActivity.showV553SplitAutoView553Toggle() {
    val current = BiliClient.prefs.v553splitAutoView553
    BiliClient.prefs.v553splitAutoView553 = !current
    AppToast.show(this, "Split Auto View553: ${if (!current) "ON" else "OFF"}")
}

// v553: Stack Auto Layer553
internal fun PlayerActivity.showV553StackAutoLayer553Toggle() {
    val current = BiliClient.prefs.v553stackAutoLayer553
    BiliClient.prefs.v553stackAutoLayer553 = !current
    AppToast.show(this, "Stack Auto Layer553: ${if (!current) "ON" else "OFF"}")
}

// v553: Stage Auto Advance553
internal fun PlayerActivity.showV553StageAutoAdvance553Toggle() {
    val current = BiliClient.prefs.v553stageAutoAdvance553
    BiliClient.prefs.v553stageAutoAdvance553 = !current
    AppToast.show(this, "Stage Auto Advance553: ${if (!current) "ON" else "OFF"}")
}

// v553: Start Auto Play553
internal fun PlayerActivity.showV553StartAutoPlay553Toggle() {
    val current = BiliClient.prefs.v553startAutoPlay553
    BiliClient.prefs.v553startAutoPlay553 = !current
    AppToast.show(this, "Start Auto Play553: ${if (!current) "ON" else "OFF"}")
}

// v553: State Auto Persist553
internal fun PlayerActivity.showV553StateAutoPersist553Toggle() {
    val current = BiliClient.prefs.v553stateAutoPersist553
    BiliClient.prefs.v553stateAutoPersist553 = !current
    AppToast.show(this, "State Auto Persist553: ${if (!current) "ON" else "OFF"}")
}

// v554: Skip Silence Auto554
internal fun PlayerActivity.showV554SkipSilenceAuto554Toggle() {
    val current = BiliClient.prefs.v554skipSilenceAuto554
    BiliClient.prefs.v554skipSilenceAuto554 = !current
    AppToast.show(this, "Skip Silence Auto554: ${if (!current) "ON" else "OFF"}")
}

// v554: Slice Auto Segment554
internal fun PlayerActivity.showV554SliceAutoSegment554Toggle() {
    val current = BiliClient.prefs.v554sliceAutoSegment554
    BiliClient.prefs.v554sliceAutoSegment554 = !current
    AppToast.show(this, "Slice Auto Segment554: ${if (!current) "ON" else "OFF"}")
}

// v554: Slide Auto Transition554
internal fun PlayerActivity.showV554SlideAutoTransition554Toggle() {
    val current = BiliClient.prefs.v554slideAutoTransition554
    BiliClient.prefs.v554slideAutoTransition554 = !current
    AppToast.show(this, "Slide Auto Transition554: ${if (!current) "ON" else "OFF"}")
}

// v554: Slot Auto Manage554
internal fun PlayerActivity.showV554SlotAutoManage554Toggle() {
    val current = BiliClient.prefs.v554slotAutoManage554
    BiliClient.prefs.v554slotAutoManage554 = !current
    AppToast.show(this, "Slot Auto Manage554: ${if (!current) "ON" else "OFF"}")
}

// v554: Smart Auto Quality554
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

// v554: Smooth Scroll Enabled554
internal fun PlayerActivity.showV554SmoothScrollEnabled554Toggle() {
    val current = BiliClient.prefs.v554smoothScrollEnabled554
    BiliClient.prefs.v554smoothScrollEnabled554 = !current
    AppToast.show(this, "Smooth Scroll Enabled554: ${if (!current) "ON" else "OFF"}")
}

// v554: Snap Auto Align554
internal fun PlayerActivity.showV554SnapAutoAlign554Toggle() {
    val current = BiliClient.prefs.v554snapAutoAlign554
    BiliClient.prefs.v554snapAutoAlign554 = !current
    AppToast.show(this, "Snap Auto Align554: ${if (!current) "ON" else "OFF"}")
}

// v554: Sort Auto Algorithm554
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

// v554: Source Auto Select554
internal fun PlayerActivity.showV554SourceAutoSelect554Toggle() {
    val current = BiliClient.prefs.v554sourceAutoSelect554
    BiliClient.prefs.v554sourceAutoSelect554 = !current
    AppToast.show(this, "Source Auto Select554: ${if (!current) "ON" else "OFF"}")
}

// v554: Span Auto Adjust554
internal fun PlayerActivity.showV554SpanAutoAdjust554Toggle() {
    val current = BiliClient.prefs.v554spanAutoAdjust554
    BiliClient.prefs.v554spanAutoAdjust554 = !current
    AppToast.show(this, "Span Auto Adjust554: ${if (!current) "ON" else "OFF"}")
}

// v554: Split Auto View554
internal fun PlayerActivity.showV554SplitAutoView554Toggle() {
    val current = BiliClient.prefs.v554splitAutoView554
    BiliClient.prefs.v554splitAutoView554 = !current
    AppToast.show(this, "Split Auto View554: ${if (!current) "ON" else "OFF"}")
}

// v554: Stack Auto Layer554
internal fun PlayerActivity.showV554StackAutoLayer554Toggle() {
    val current = BiliClient.prefs.v554stackAutoLayer554
    BiliClient.prefs.v554stackAutoLayer554 = !current
    AppToast.show(this, "Stack Auto Layer554: ${if (!current) "ON" else "OFF"}")
}

// v554: Stage Auto Advance554
internal fun PlayerActivity.showV554StageAutoAdvance554Toggle() {
    val current = BiliClient.prefs.v554stageAutoAdvance554
    BiliClient.prefs.v554stageAutoAdvance554 = !current
    AppToast.show(this, "Stage Auto Advance554: ${if (!current) "ON" else "OFF"}")
}

// v554: Start Auto Play554
internal fun PlayerActivity.showV554StartAutoPlay554Toggle() {
    val current = BiliClient.prefs.v554startAutoPlay554
    BiliClient.prefs.v554startAutoPlay554 = !current
    AppToast.show(this, "Start Auto Play554: ${if (!current) "ON" else "OFF"}")
}

// v554: State Auto Persist554
internal fun PlayerActivity.showV554StateAutoPersist554Toggle() {
    val current = BiliClient.prefs.v554stateAutoPersist554
    BiliClient.prefs.v554stateAutoPersist554 = !current
    AppToast.show(this, "State Auto Persist554: ${if (!current) "ON" else "OFF"}")
}

// v555: Skip Silence Auto555
internal fun PlayerActivity.showV555SkipSilenceAuto555Toggle() {
    val current = BiliClient.prefs.v555skipSilenceAuto555
    BiliClient.prefs.v555skipSilenceAuto555 = !current
    AppToast.show(this, "Skip Silence Auto555: ${if (!current) "ON" else "OFF"}")
}

// v555: Slice Auto Segment555
internal fun PlayerActivity.showV555SliceAutoSegment555Toggle() {
    val current = BiliClient.prefs.v555sliceAutoSegment555
    BiliClient.prefs.v555sliceAutoSegment555 = !current
    AppToast.show(this, "Slice Auto Segment555: ${if (!current) "ON" else "OFF"}")
}

// v555: Slide Auto Transition555
internal fun PlayerActivity.showV555SlideAutoTransition555Toggle() {
    val current = BiliClient.prefs.v555slideAutoTransition555
    BiliClient.prefs.v555slideAutoTransition555 = !current
    AppToast.show(this, "Slide Auto Transition555: ${if (!current) "ON" else "OFF"}")
}

// v555: Slot Auto Manage555
internal fun PlayerActivity.showV555SlotAutoManage555Toggle() {
    val current = BiliClient.prefs.v555slotAutoManage555
    BiliClient.prefs.v555slotAutoManage555 = !current
    AppToast.show(this, "Slot Auto Manage555: ${if (!current) "ON" else "OFF"}")
}

// v555: Smart Auto Quality555
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

// v555: Smooth Scroll Enabled555
internal fun PlayerActivity.showV555SmoothScrollEnabled555Toggle() {
    val current = BiliClient.prefs.v555smoothScrollEnabled555
    BiliClient.prefs.v555smoothScrollEnabled555 = !current
    AppToast.show(this, "Smooth Scroll Enabled555: ${if (!current) "ON" else "OFF"}")
}

// v555: Snap Auto Align555
internal fun PlayerActivity.showV555SnapAutoAlign555Toggle() {
    val current = BiliClient.prefs.v555snapAutoAlign555
    BiliClient.prefs.v555snapAutoAlign555 = !current
    AppToast.show(this, "Snap Auto Align555: ${if (!current) "ON" else "OFF"}")
}

// v555: Sort Auto Algorithm555
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

// v555: Source Auto Select555
internal fun PlayerActivity.showV555SourceAutoSelect555Toggle() {
    val current = BiliClient.prefs.v555sourceAutoSelect555
    BiliClient.prefs.v555sourceAutoSelect555 = !current
    AppToast.show(this, "Source Auto Select555: ${if (!current) "ON" else "OFF"}")
}

// v555: Span Auto Adjust555
internal fun PlayerActivity.showV555SpanAutoAdjust555Toggle() {
    val current = BiliClient.prefs.v555spanAutoAdjust555
    BiliClient.prefs.v555spanAutoAdjust555 = !current
    AppToast.show(this, "Span Auto Adjust555: ${if (!current) "ON" else "OFF"}")
}

// v555: Split Auto View555
internal fun PlayerActivity.showV555SplitAutoView555Toggle() {
    val current = BiliClient.prefs.v555splitAutoView555
    BiliClient.prefs.v555splitAutoView555 = !current
    AppToast.show(this, "Split Auto View555: ${if (!current) "ON" else "OFF"}")
}

// v555: Stack Auto Layer555
internal fun PlayerActivity.showV555StackAutoLayer555Toggle() {
    val current = BiliClient.prefs.v555stackAutoLayer555
    BiliClient.prefs.v555stackAutoLayer555 = !current
    AppToast.show(this, "Stack Auto Layer555: ${if (!current) "ON" else "OFF"}")
}

// v555: Stage Auto Advance555
internal fun PlayerActivity.showV555StageAutoAdvance555Toggle() {
    val current = BiliClient.prefs.v555stageAutoAdvance555
    BiliClient.prefs.v555stageAutoAdvance555 = !current
    AppToast.show(this, "Stage Auto Advance555: ${if (!current) "ON" else "OFF"}")
}

// v555: Start Auto Play555
internal fun PlayerActivity.showV555StartAutoPlay555Toggle() {
    val current = BiliClient.prefs.v555startAutoPlay555
    BiliClient.prefs.v555startAutoPlay555 = !current
    AppToast.show(this, "Start Auto Play555: ${if (!current) "ON" else "OFF"}")
}

// v555: State Auto Persist555
internal fun PlayerActivity.showV555StateAutoPersist555Toggle() {
    val current = BiliClient.prefs.v555stateAutoPersist555
    BiliClient.prefs.v555stateAutoPersist555 = !current
    AppToast.show(this, "State Auto Persist555: ${if (!current) "ON" else "OFF"}")
}

// v556: Skip Silence Auto556
internal fun PlayerActivity.showV556SkipSilenceAuto556Toggle() {
    val current = BiliClient.prefs.v556skipSilenceAuto556
    BiliClient.prefs.v556skipSilenceAuto556 = !current
    AppToast.show(this, "Skip Silence Auto556: ${if (!current) "ON" else "OFF"}")
}

// v556: Slice Auto Segment556
internal fun PlayerActivity.showV556SliceAutoSegment556Toggle() {
    val current = BiliClient.prefs.v556sliceAutoSegment556
    BiliClient.prefs.v556sliceAutoSegment556 = !current
    AppToast.show(this, "Slice Auto Segment556: ${if (!current) "ON" else "OFF"}")
}

// v556: Slide Auto Transition556
internal fun PlayerActivity.showV556SlideAutoTransition556Toggle() {
    val current = BiliClient.prefs.v556slideAutoTransition556
    BiliClient.prefs.v556slideAutoTransition556 = !current
    AppToast.show(this, "Slide Auto Transition556: ${if (!current) "ON" else "OFF"}")
}

// v556: Slot Auto Manage556
internal fun PlayerActivity.showV556SlotAutoManage556Toggle() {
    val current = BiliClient.prefs.v556slotAutoManage556
    BiliClient.prefs.v556slotAutoManage556 = !current
    AppToast.show(this, "Slot Auto Manage556: ${if (!current) "ON" else "OFF"}")
}

// v556: Smart Auto Quality556
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

// v556: Smooth Scroll Enabled556
internal fun PlayerActivity.showV556SmoothScrollEnabled556Toggle() {
    val current = BiliClient.prefs.v556smoothScrollEnabled556
    BiliClient.prefs.v556smoothScrollEnabled556 = !current
    AppToast.show(this, "Smooth Scroll Enabled556: ${if (!current) "ON" else "OFF"}")
}

// v556: Snap Auto Align556
internal fun PlayerActivity.showV556SnapAutoAlign556Toggle() {
    val current = BiliClient.prefs.v556snapAutoAlign556
    BiliClient.prefs.v556snapAutoAlign556 = !current
    AppToast.show(this, "Snap Auto Align556: ${if (!current) "ON" else "OFF"}")
}

// v556: Sort Auto Algorithm556
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

// v583: Use Auto Optimize583
internal fun PlayerActivity.showV583UseAutoOptimize583Toggle() {
    val current = BiliClient.prefs.v583useAutoOptimize583
    BiliClient.prefs.v583useAutoOptimize583 = !current
    AppToast.show(this, "Use Auto Optimize583: ${if (!current) "ON" else "OFF"}")
}

// v583: Value Auto Bind583
internal fun PlayerActivity.showV583ValueAutoBind583Toggle() {
    val current = BiliClient.prefs.v583valueAutoBind583
    BiliClient.prefs.v583valueAutoBind583 = !current
    AppToast.show(this, "Value Auto Bind583: ${if (!current) "ON" else "OFF"}")
}

// v583: Verify Auto Checksum583
internal fun PlayerActivity.showV583VerifyAutoChecksum583Toggle() {
    val current = BiliClient.prefs.v583verifyAutoChecksum583
    BiliClient.prefs.v583verifyAutoChecksum583 = !current
    AppToast.show(this, "Verify Auto Checksum583: ${if (!current) "ON" else "OFF"}")
}

// v583: Version Auto Check583
internal fun PlayerActivity.showV583VersionAutoCheck583Toggle() {
    val current = BiliClient.prefs.v583versionAutoCheck583
    BiliClient.prefs.v583versionAutoCheck583 = !current
    AppToast.show(this, "Version Auto Check583: ${if (!current) "ON" else "OFF"}")
}

// v583: View Auto Switch583
internal fun PlayerActivity.showV583ViewAutoSwitch583Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v583viewAutoSwitch583).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch583",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v583viewAutoSwitch583 = value
        AppToast.show(this, "View Auto Switch583: $value")
    }
}

// v583: Virtual Display583
internal fun PlayerActivity.showV583VirtualDisplay583Toggle() {
    val current = BiliClient.prefs.v583virtualDisplay583
    BiliClient.prefs.v583virtualDisplay583 = !current
    AppToast.show(this, "Virtual Display583: ${if (!current) "ON" else "OFF"}")
}

// v583: Visible Auto Toggle583
internal fun PlayerActivity.showV583VisibleAutoToggle583Toggle() {
    val current = BiliClient.prefs.v583visibleAutoToggle583
    BiliClient.prefs.v583visibleAutoToggle583 = !current
    AppToast.show(this, "Visible Auto Toggle583: ${if (!current) "ON" else "OFF"}")
}

// v583: Voice Auto Recognize583
internal fun PlayerActivity.showV583VoiceAutoRecognize583Toggle() {
    val current = BiliClient.prefs.v583voiceAutoRecognize583
    BiliClient.prefs.v583voiceAutoRecognize583 = !current
    AppToast.show(this, "Voice Auto Recognize583: ${if (!current) "ON" else "OFF"}")
}

// v583: Wait Auto Timeout583
internal fun PlayerActivity.showV583WaitAutoTimeout583Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v583waitAutoTimeout583).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout583",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v583waitAutoTimeout583 = value
        AppToast.show(this, "Wait Auto Timeout583: $value")
    }
}

// v583: Warm Auto Start583
internal fun PlayerActivity.showV583WarmAutoStart583Toggle() {
    val current = BiliClient.prefs.v583warmAutoStart583
    BiliClient.prefs.v583warmAutoStart583 = !current
    AppToast.show(this, "Warm Auto Start583: ${if (!current) "ON" else "OFF"}")
}

// v583: Warning Auto Alert583
internal fun PlayerActivity.showV583WarningAutoAlert583Toggle() {
    val current = BiliClient.prefs.v583warningAutoAlert583
    BiliClient.prefs.v583warningAutoAlert583 = !current
    AppToast.show(this, "Warning Auto Alert583: ${if (!current) "ON" else "OFF"}")
}

// v583: Watch Auto Sync583
internal fun PlayerActivity.showV583WatchAutoSync583Toggle() {
    val current = BiliClient.prefs.v583watchAutoSync583
    BiliClient.prefs.v583watchAutoSync583 = !current
    AppToast.show(this, "Watch Auto Sync583: ${if (!current) "ON" else "OFF"}")
}

// v584: Update Auto Download584
internal fun PlayerActivity.showV584UpdateAutoDownload584Toggle() {
    val current = BiliClient.prefs.v584updateAutoDownload584
    BiliClient.prefs.v584updateAutoDownload584 = !current
    AppToast.show(this, "Update Auto Download584: ${if (!current) "ON" else "OFF"}")
}

// v584: Upload Auto Retry584
internal fun PlayerActivity.showV584UploadAutoRetry584Toggle() {
    val current = BiliClient.prefs.v584uploadAutoRetry584
    BiliClient.prefs.v584uploadAutoRetry584 = !current
    AppToast.show(this, "Upload Auto Retry584: ${if (!current) "ON" else "OFF"}")
}

// v584: Upscale Auto Enhance584
internal fun PlayerActivity.showV584UpscaleAutoEnhance584Toggle() {
    val current = BiliClient.prefs.v584upscaleAutoEnhance584
    BiliClient.prefs.v584upscaleAutoEnhance584 = !current
    AppToast.show(this, "Upscale Auto Enhance584: ${if (!current) "ON" else "OFF"}")
}

// v584: Use Auto Optimize584
internal fun PlayerActivity.showV584UseAutoOptimize584Toggle() {
    val current = BiliClient.prefs.v584useAutoOptimize584
    BiliClient.prefs.v584useAutoOptimize584 = !current
    AppToast.show(this, "Use Auto Optimize584: ${if (!current) "ON" else "OFF"}")
}

// v584: Value Auto Bind584
internal fun PlayerActivity.showV584ValueAutoBind584Toggle() {
    val current = BiliClient.prefs.v584valueAutoBind584
    BiliClient.prefs.v584valueAutoBind584 = !current
    AppToast.show(this, "Value Auto Bind584: ${if (!current) "ON" else "OFF"}")
}

// v584: Verify Auto Checksum584
internal fun PlayerActivity.showV584VerifyAutoChecksum584Toggle() {
    val current = BiliClient.prefs.v584verifyAutoChecksum584
    BiliClient.prefs.v584verifyAutoChecksum584 = !current
    AppToast.show(this, "Verify Auto Checksum584: ${if (!current) "ON" else "OFF"}")
}

// v584: Version Auto Check584
internal fun PlayerActivity.showV584VersionAutoCheck584Toggle() {
    val current = BiliClient.prefs.v584versionAutoCheck584
    BiliClient.prefs.v584versionAutoCheck584 = !current
    AppToast.show(this, "Version Auto Check584: ${if (!current) "ON" else "OFF"}")
}

// v584: View Auto Switch584
internal fun PlayerActivity.showV584ViewAutoSwitch584Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v584viewAutoSwitch584).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch584",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v584viewAutoSwitch584 = value
        AppToast.show(this, "View Auto Switch584: $value")
    }
}

// v584: Virtual Display584
internal fun PlayerActivity.showV584VirtualDisplay584Toggle() {
    val current = BiliClient.prefs.v584virtualDisplay584
    BiliClient.prefs.v584virtualDisplay584 = !current
    AppToast.show(this, "Virtual Display584: ${if (!current) "ON" else "OFF"}")
}

// v584: Visible Auto Toggle584
internal fun PlayerActivity.showV584VisibleAutoToggle584Toggle() {
    val current = BiliClient.prefs.v584visibleAutoToggle584
    BiliClient.prefs.v584visibleAutoToggle584 = !current
    AppToast.show(this, "Visible Auto Toggle584: ${if (!current) "ON" else "OFF"}")
}

// v584: Voice Auto Recognize584
internal fun PlayerActivity.showV584VoiceAutoRecognize584Toggle() {
    val current = BiliClient.prefs.v584voiceAutoRecognize584
    BiliClient.prefs.v584voiceAutoRecognize584 = !current
    AppToast.show(this, "Voice Auto Recognize584: ${if (!current) "ON" else "OFF"}")
}

// v584: Wait Auto Timeout584
internal fun PlayerActivity.showV584WaitAutoTimeout584Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v584waitAutoTimeout584).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout584",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v584waitAutoTimeout584 = value
        AppToast.show(this, "Wait Auto Timeout584: $value")
    }
}

// v584: Warm Auto Start584
internal fun PlayerActivity.showV584WarmAutoStart584Toggle() {
    val current = BiliClient.prefs.v584warmAutoStart584
    BiliClient.prefs.v584warmAutoStart584 = !current
    AppToast.show(this, "Warm Auto Start584: ${if (!current) "ON" else "OFF"}")
}

// v584: Warning Auto Alert584
internal fun PlayerActivity.showV584WarningAutoAlert584Toggle() {
    val current = BiliClient.prefs.v584warningAutoAlert584
    BiliClient.prefs.v584warningAutoAlert584 = !current
    AppToast.show(this, "Warning Auto Alert584: ${if (!current) "ON" else "OFF"}")
}

// v584: Watch Auto Sync584
internal fun PlayerActivity.showV584WatchAutoSync584Toggle() {
    val current = BiliClient.prefs.v584watchAutoSync584
    BiliClient.prefs.v584watchAutoSync584 = !current
    AppToast.show(this, "Watch Auto Sync584: ${if (!current) "ON" else "OFF"}")
}

// v585: Update Auto Download585
internal fun PlayerActivity.showV585UpdateAutoDownload585Toggle() {
    val current = BiliClient.prefs.v585updateAutoDownload585
    BiliClient.prefs.v585updateAutoDownload585 = !current
    AppToast.show(this, "Update Auto Download585: ${if (!current) "ON" else "OFF"}")
}

// v585: Upload Auto Retry585
internal fun PlayerActivity.showV585UploadAutoRetry585Toggle() {
    val current = BiliClient.prefs.v585uploadAutoRetry585
    BiliClient.prefs.v585uploadAutoRetry585 = !current
    AppToast.show(this, "Upload Auto Retry585: ${if (!current) "ON" else "OFF"}")
}

// v585: Upscale Auto Enhance585
internal fun PlayerActivity.showV585UpscaleAutoEnhance585Toggle() {
    val current = BiliClient.prefs.v585upscaleAutoEnhance585
    BiliClient.prefs.v585upscaleAutoEnhance585 = !current
    AppToast.show(this, "Upscale Auto Enhance585: ${if (!current) "ON" else "OFF"}")
}

// v585: Use Auto Optimize585
internal fun PlayerActivity.showV585UseAutoOptimize585Toggle() {
    val current = BiliClient.prefs.v585useAutoOptimize585
    BiliClient.prefs.v585useAutoOptimize585 = !current
    AppToast.show(this, "Use Auto Optimize585: ${if (!current) "ON" else "OFF"}")
}

// v585: Value Auto Bind585
internal fun PlayerActivity.showV585ValueAutoBind585Toggle() {
    val current = BiliClient.prefs.v585valueAutoBind585
    BiliClient.prefs.v585valueAutoBind585 = !current
    AppToast.show(this, "Value Auto Bind585: ${if (!current) "ON" else "OFF"}")
}

// v585: Verify Auto Checksum585
internal fun PlayerActivity.showV585VerifyAutoChecksum585Toggle() {
    val current = BiliClient.prefs.v585verifyAutoChecksum585
    BiliClient.prefs.v585verifyAutoChecksum585 = !current
    AppToast.show(this, "Verify Auto Checksum585: ${if (!current) "ON" else "OFF"}")
}

// v585: Version Auto Check585
internal fun PlayerActivity.showV585VersionAutoCheck585Toggle() {
    val current = BiliClient.prefs.v585versionAutoCheck585
    BiliClient.prefs.v585versionAutoCheck585 = !current
    AppToast.show(this, "Version Auto Check585: ${if (!current) "ON" else "OFF"}")
}

// v585: View Auto Switch585
internal fun PlayerActivity.showV585ViewAutoSwitch585Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v585viewAutoSwitch585).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch585",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v585viewAutoSwitch585 = value
        AppToast.show(this, "View Auto Switch585: $value")
    }
}

// v585: Virtual Display585
internal fun PlayerActivity.showV585VirtualDisplay585Toggle() {
    val current = BiliClient.prefs.v585virtualDisplay585
    BiliClient.prefs.v585virtualDisplay585 = !current
    AppToast.show(this, "Virtual Display585: ${if (!current) "ON" else "OFF"}")
}

// v585: Visible Auto Toggle585
internal fun PlayerActivity.showV585VisibleAutoToggle585Toggle() {
    val current = BiliClient.prefs.v585visibleAutoToggle585
    BiliClient.prefs.v585visibleAutoToggle585 = !current
    AppToast.show(this, "Visible Auto Toggle585: ${if (!current) "ON" else "OFF"}")
}

// v585: Voice Auto Recognize585
internal fun PlayerActivity.showV585VoiceAutoRecognize585Toggle() {
    val current = BiliClient.prefs.v585voiceAutoRecognize585
    BiliClient.prefs.v585voiceAutoRecognize585 = !current
    AppToast.show(this, "Voice Auto Recognize585: ${if (!current) "ON" else "OFF"}")
}

// v585: Wait Auto Timeout585
internal fun PlayerActivity.showV585WaitAutoTimeout585Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v585waitAutoTimeout585).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout585",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v585waitAutoTimeout585 = value
        AppToast.show(this, "Wait Auto Timeout585: $value")
    }
}

// v585: Warm Auto Start585
internal fun PlayerActivity.showV585WarmAutoStart585Toggle() {
    val current = BiliClient.prefs.v585warmAutoStart585
    BiliClient.prefs.v585warmAutoStart585 = !current
    AppToast.show(this, "Warm Auto Start585: ${if (!current) "ON" else "OFF"}")
}

// v585: Warning Auto Alert585
internal fun PlayerActivity.showV585WarningAutoAlert585Toggle() {
    val current = BiliClient.prefs.v585warningAutoAlert585
    BiliClient.prefs.v585warningAutoAlert585 = !current
    AppToast.show(this, "Warning Auto Alert585: ${if (!current) "ON" else "OFF"}")
}

// v585: Watch Auto Sync585
internal fun PlayerActivity.showV585WatchAutoSync585Toggle() {
    val current = BiliClient.prefs.v585watchAutoSync585
    BiliClient.prefs.v585watchAutoSync585 = !current
    AppToast.show(this, "Watch Auto Sync585: ${if (!current) "ON" else "OFF"}")
}

// v586: Update Auto Download586
internal fun PlayerActivity.showV586UpdateAutoDownload586Toggle() {
    val current = BiliClient.prefs.v586updateAutoDownload586
    BiliClient.prefs.v586updateAutoDownload586 = !current
    AppToast.show(this, "Update Auto Download586: ${if (!current) "ON" else "OFF"}")
}

// v586: Upload Auto Retry586
internal fun PlayerActivity.showV586UploadAutoRetry586Toggle() {
    val current = BiliClient.prefs.v586uploadAutoRetry586
    BiliClient.prefs.v586uploadAutoRetry586 = !current
    AppToast.show(this, "Upload Auto Retry586: ${if (!current) "ON" else "OFF"}")
}

// v586: Upscale Auto Enhance586
internal fun PlayerActivity.showV586UpscaleAutoEnhance586Toggle() {
    val current = BiliClient.prefs.v586upscaleAutoEnhance586
    BiliClient.prefs.v586upscaleAutoEnhance586 = !current
    AppToast.show(this, "Upscale Auto Enhance586: ${if (!current) "ON" else "OFF"}")
}

// v586: Use Auto Optimize586
internal fun PlayerActivity.showV586UseAutoOptimize586Toggle() {
    val current = BiliClient.prefs.v586useAutoOptimize586
    BiliClient.prefs.v586useAutoOptimize586 = !current
    AppToast.show(this, "Use Auto Optimize586: ${if (!current) "ON" else "OFF"}")
}

// v586: Value Auto Bind586
internal fun PlayerActivity.showV586ValueAutoBind586Toggle() {
    val current = BiliClient.prefs.v586valueAutoBind586
    BiliClient.prefs.v586valueAutoBind586 = !current
    AppToast.show(this, "Value Auto Bind586: ${if (!current) "ON" else "OFF"}")
}

// v586: Verify Auto Checksum586
internal fun PlayerActivity.showV586VerifyAutoChecksum586Toggle() {
    val current = BiliClient.prefs.v586verifyAutoChecksum586
    BiliClient.prefs.v586verifyAutoChecksum586 = !current
    AppToast.show(this, "Verify Auto Checksum586: ${if (!current) "ON" else "OFF"}")
}

// v586: Version Auto Check586
internal fun PlayerActivity.showV586VersionAutoCheck586Toggle() {
    val current = BiliClient.prefs.v586versionAutoCheck586
    BiliClient.prefs.v586versionAutoCheck586 = !current
    AppToast.show(this, "Version Auto Check586: ${if (!current) "ON" else "OFF"}")
}

// v586: View Auto Switch586
internal fun PlayerActivity.showV586ViewAutoSwitch586Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v586viewAutoSwitch586).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch586",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v586viewAutoSwitch586 = value
        AppToast.show(this, "View Auto Switch586: $value")
    }
}

// v586: Virtual Display586
internal fun PlayerActivity.showV586VirtualDisplay586Toggle() {
    val current = BiliClient.prefs.v586virtualDisplay586
    BiliClient.prefs.v586virtualDisplay586 = !current
    AppToast.show(this, "Virtual Display586: ${if (!current) "ON" else "OFF"}")
}

// v586: Visible Auto Toggle586
internal fun PlayerActivity.showV586VisibleAutoToggle586Toggle() {
    val current = BiliClient.prefs.v586visibleAutoToggle586
    BiliClient.prefs.v586visibleAutoToggle586 = !current
    AppToast.show(this, "Visible Auto Toggle586: ${if (!current) "ON" else "OFF"}")
}

// v586: Voice Auto Recognize586
internal fun PlayerActivity.showV586VoiceAutoRecognize586Toggle() {
    val current = BiliClient.prefs.v586voiceAutoRecognize586
    BiliClient.prefs.v586voiceAutoRecognize586 = !current
    AppToast.show(this, "Voice Auto Recognize586: ${if (!current) "ON" else "OFF"}")
}

// v586: Wait Auto Timeout586
internal fun PlayerActivity.showV586WaitAutoTimeout586Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v586waitAutoTimeout586).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout586",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v586waitAutoTimeout586 = value
        AppToast.show(this, "Wait Auto Timeout586: $value")
    }
}

// v586: Warm Auto Start586
internal fun PlayerActivity.showV586WarmAutoStart586Toggle() {
    val current = BiliClient.prefs.v586warmAutoStart586
    BiliClient.prefs.v586warmAutoStart586 = !current
    AppToast.show(this, "Warm Auto Start586: ${if (!current) "ON" else "OFF"}")
}

// v586: Warning Auto Alert586
internal fun PlayerActivity.showV586WarningAutoAlert586Toggle() {
    val current = BiliClient.prefs.v586warningAutoAlert586
    BiliClient.prefs.v586warningAutoAlert586 = !current
    AppToast.show(this, "Warning Auto Alert586: ${if (!current) "ON" else "OFF"}")
}

// v586: Watch Auto Sync586
internal fun PlayerActivity.showV586WatchAutoSync586Toggle() {
    val current = BiliClient.prefs.v586watchAutoSync586
    BiliClient.prefs.v586watchAutoSync586 = !current
    AppToast.show(this, "Watch Auto Sync586: ${if (!current) "ON" else "OFF"}")
}

// v587: Update Auto Download587
internal fun PlayerActivity.showV587UpdateAutoDownload587Toggle() {
    val current = BiliClient.prefs.v587updateAutoDownload587
    BiliClient.prefs.v587updateAutoDownload587 = !current
    AppToast.show(this, "Update Auto Download587: ${if (!current) "ON" else "OFF"}")
}

// v587: Upload Auto Retry587
internal fun PlayerActivity.showV587UploadAutoRetry587Toggle() {
    val current = BiliClient.prefs.v587uploadAutoRetry587
    BiliClient.prefs.v587uploadAutoRetry587 = !current
    AppToast.show(this, "Upload Auto Retry587: ${if (!current) "ON" else "OFF"}")
}

// v587: Upscale Auto Enhance587
internal fun PlayerActivity.showV587UpscaleAutoEnhance587Toggle() {
    val current = BiliClient.prefs.v587upscaleAutoEnhance587
    BiliClient.prefs.v587upscaleAutoEnhance587 = !current
    AppToast.show(this, "Upscale Auto Enhance587: ${if (!current) "ON" else "OFF"}")
}

// v587: Use Auto Optimize587
internal fun PlayerActivity.showV587UseAutoOptimize587Toggle() {
    val current = BiliClient.prefs.v587useAutoOptimize587
    BiliClient.prefs.v587useAutoOptimize587 = !current
    AppToast.show(this, "Use Auto Optimize587: ${if (!current) "ON" else "OFF"}")
}

// v587: Value Auto Bind587
internal fun PlayerActivity.showV587ValueAutoBind587Toggle() {
    val current = BiliClient.prefs.v587valueAutoBind587
    BiliClient.prefs.v587valueAutoBind587 = !current
    AppToast.show(this, "Value Auto Bind587: ${if (!current) "ON" else "OFF"}")
}

// v587: Verify Auto Checksum587
internal fun PlayerActivity.showV587VerifyAutoChecksum587Toggle() {
    val current = BiliClient.prefs.v587verifyAutoChecksum587
    BiliClient.prefs.v587verifyAutoChecksum587 = !current
    AppToast.show(this, "Verify Auto Checksum587: ${if (!current) "ON" else "OFF"}")
}

// v587: Version Auto Check587
internal fun PlayerActivity.showV587VersionAutoCheck587Toggle() {
    val current = BiliClient.prefs.v587versionAutoCheck587
    BiliClient.prefs.v587versionAutoCheck587 = !current
    AppToast.show(this, "Version Auto Check587: ${if (!current) "ON" else "OFF"}")
}

// v587: View Auto Switch587
internal fun PlayerActivity.showV587ViewAutoSwitch587Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v587viewAutoSwitch587).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch587",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v587viewAutoSwitch587 = value
        AppToast.show(this, "View Auto Switch587: $value")
    }
}

// v587: Virtual Display587
internal fun PlayerActivity.showV587VirtualDisplay587Toggle() {
    val current = BiliClient.prefs.v587virtualDisplay587
    BiliClient.prefs.v587virtualDisplay587 = !current
    AppToast.show(this, "Virtual Display587: ${if (!current) "ON" else "OFF"}")
}

// v587: Visible Auto Toggle587
internal fun PlayerActivity.showV587VisibleAutoToggle587Toggle() {
    val current = BiliClient.prefs.v587visibleAutoToggle587
    BiliClient.prefs.v587visibleAutoToggle587 = !current
    AppToast.show(this, "Visible Auto Toggle587: ${if (!current) "ON" else "OFF"}")
}

// v587: Voice Auto Recognize587
internal fun PlayerActivity.showV587VoiceAutoRecognize587Toggle() {
    val current = BiliClient.prefs.v587voiceAutoRecognize587
    BiliClient.prefs.v587voiceAutoRecognize587 = !current
    AppToast.show(this, "Voice Auto Recognize587: ${if (!current) "ON" else "OFF"}")
}

// v587: Wait Auto Timeout587
internal fun PlayerActivity.showV587WaitAutoTimeout587Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v587waitAutoTimeout587).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout587",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v587waitAutoTimeout587 = value
        AppToast.show(this, "Wait Auto Timeout587: $value")
    }
}

// v587: Warm Auto Start587
internal fun PlayerActivity.showV587WarmAutoStart587Toggle() {
    val current = BiliClient.prefs.v587warmAutoStart587
    BiliClient.prefs.v587warmAutoStart587 = !current
    AppToast.show(this, "Warm Auto Start587: ${if (!current) "ON" else "OFF"}")
}

// v587: Warning Auto Alert587
internal fun PlayerActivity.showV587WarningAutoAlert587Toggle() {
    val current = BiliClient.prefs.v587warningAutoAlert587
    BiliClient.prefs.v587warningAutoAlert587 = !current
    AppToast.show(this, "Warning Auto Alert587: ${if (!current) "ON" else "OFF"}")
}

// v587: Watch Auto Sync587
internal fun PlayerActivity.showV587WatchAutoSync587Toggle() {
    val current = BiliClient.prefs.v587watchAutoSync587
    BiliClient.prefs.v587watchAutoSync587 = !current
    AppToast.show(this, "Watch Auto Sync587: ${if (!current) "ON" else "OFF"}")
}

// v588: Update Auto Download588
internal fun PlayerActivity.showV588UpdateAutoDownload588Toggle() {
    val current = BiliClient.prefs.v588updateAutoDownload588
    BiliClient.prefs.v588updateAutoDownload588 = !current
    AppToast.show(this, "Update Auto Download588: ${if (!current) "ON" else "OFF"}")
}

// v588: Upload Auto Retry588
internal fun PlayerActivity.showV588UploadAutoRetry588Toggle() {
    val current = BiliClient.prefs.v588uploadAutoRetry588
    BiliClient.prefs.v588uploadAutoRetry588 = !current
    AppToast.show(this, "Upload Auto Retry588: ${if (!current) "ON" else "OFF"}")
}

// v588: Upscale Auto Enhance588
internal fun PlayerActivity.showV588UpscaleAutoEnhance588Toggle() {
    val current = BiliClient.prefs.v588upscaleAutoEnhance588
    BiliClient.prefs.v588upscaleAutoEnhance588 = !current
    AppToast.show(this, "Upscale Auto Enhance588: ${if (!current) "ON" else "OFF"}")
}

// v588: Use Auto Optimize588
internal fun PlayerActivity.showV588UseAutoOptimize588Toggle() {
    val current = BiliClient.prefs.v588useAutoOptimize588
    BiliClient.prefs.v588useAutoOptimize588 = !current
    AppToast.show(this, "Use Auto Optimize588: ${if (!current) "ON" else "OFF"}")
}

// v588: Value Auto Bind588
internal fun PlayerActivity.showV588ValueAutoBind588Toggle() {
    val current = BiliClient.prefs.v588valueAutoBind588
    BiliClient.prefs.v588valueAutoBind588 = !current
    AppToast.show(this, "Value Auto Bind588: ${if (!current) "ON" else "OFF"}")
}

// v588: Verify Auto Checksum588
internal fun PlayerActivity.showV588VerifyAutoChecksum588Toggle() {
    val current = BiliClient.prefs.v588verifyAutoChecksum588
    BiliClient.prefs.v588verifyAutoChecksum588 = !current
    AppToast.show(this, "Verify Auto Checksum588: ${if (!current) "ON" else "OFF"}")
}

// v588: Version Auto Check588
internal fun PlayerActivity.showV588VersionAutoCheck588Toggle() {
    val current = BiliClient.prefs.v588versionAutoCheck588
    BiliClient.prefs.v588versionAutoCheck588 = !current
    AppToast.show(this, "Version Auto Check588: ${if (!current) "ON" else "OFF"}")
}

// v588: View Auto Switch588
internal fun PlayerActivity.showV588ViewAutoSwitch588Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v588viewAutoSwitch588).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch588",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v588viewAutoSwitch588 = value
        AppToast.show(this, "View Auto Switch588: $value")
    }
}

// v588: Virtual Display588
internal fun PlayerActivity.showV588VirtualDisplay588Toggle() {
    val current = BiliClient.prefs.v588virtualDisplay588
    BiliClient.prefs.v588virtualDisplay588 = !current
    AppToast.show(this, "Virtual Display588: ${if (!current) "ON" else "OFF"}")
}

// v588: Visible Auto Toggle588
internal fun PlayerActivity.showV588VisibleAutoToggle588Toggle() {
    val current = BiliClient.prefs.v588visibleAutoToggle588
    BiliClient.prefs.v588visibleAutoToggle588 = !current
    AppToast.show(this, "Visible Auto Toggle588: ${if (!current) "ON" else "OFF"}")
}

// v588: Voice Auto Recognize588
internal fun PlayerActivity.showV588VoiceAutoRecognize588Toggle() {
    val current = BiliClient.prefs.v588voiceAutoRecognize588
    BiliClient.prefs.v588voiceAutoRecognize588 = !current
    AppToast.show(this, "Voice Auto Recognize588: ${if (!current) "ON" else "OFF"}")
}

// v588: Wait Auto Timeout588
internal fun PlayerActivity.showV588WaitAutoTimeout588Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v588waitAutoTimeout588).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout588",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v588waitAutoTimeout588 = value
        AppToast.show(this, "Wait Auto Timeout588: $value")
    }
}

// v588: Warm Auto Start588
internal fun PlayerActivity.showV588WarmAutoStart588Toggle() {
    val current = BiliClient.prefs.v588warmAutoStart588
    BiliClient.prefs.v588warmAutoStart588 = !current
    AppToast.show(this, "Warm Auto Start588: ${if (!current) "ON" else "OFF"}")
}

// v588: Warning Auto Alert588
internal fun PlayerActivity.showV588WarningAutoAlert588Toggle() {
    val current = BiliClient.prefs.v588warningAutoAlert588
    BiliClient.prefs.v588warningAutoAlert588 = !current
    AppToast.show(this, "Warning Auto Alert588: ${if (!current) "ON" else "OFF"}")
}

// v588: Watch Auto Sync588
internal fun PlayerActivity.showV588WatchAutoSync588Toggle() {
    val current = BiliClient.prefs.v588watchAutoSync588
    BiliClient.prefs.v588watchAutoSync588 = !current
    AppToast.show(this, "Watch Auto Sync588: ${if (!current) "ON" else "OFF"}")
}

// v589: Update Auto Download589
internal fun PlayerActivity.showV589UpdateAutoDownload589Toggle() {
    val current = BiliClient.prefs.v589updateAutoDownload589
    BiliClient.prefs.v589updateAutoDownload589 = !current
    AppToast.show(this, "Update Auto Download589: ${if (!current) "ON" else "OFF"}")
}

// v589: Upload Auto Retry589
internal fun PlayerActivity.showV589UploadAutoRetry589Toggle() {
    val current = BiliClient.prefs.v589uploadAutoRetry589
    BiliClient.prefs.v589uploadAutoRetry589 = !current
    AppToast.show(this, "Upload Auto Retry589: ${if (!current) "ON" else "OFF"}")
}

// v589: Upscale Auto Enhance589
internal fun PlayerActivity.showV589UpscaleAutoEnhance589Toggle() {
    val current = BiliClient.prefs.v589upscaleAutoEnhance589
    BiliClient.prefs.v589upscaleAutoEnhance589 = !current
    AppToast.show(this, "Upscale Auto Enhance589: ${if (!current) "ON" else "OFF"}")
}

// v589: Use Auto Optimize589
internal fun PlayerActivity.showV589UseAutoOptimize589Toggle() {
    val current = BiliClient.prefs.v589useAutoOptimize589
    BiliClient.prefs.v589useAutoOptimize589 = !current
    AppToast.show(this, "Use Auto Optimize589: ${if (!current) "ON" else "OFF"}")
}

// v589: Value Auto Bind589
internal fun PlayerActivity.showV589ValueAutoBind589Toggle() {
    val current = BiliClient.prefs.v589valueAutoBind589
    BiliClient.prefs.v589valueAutoBind589 = !current
    AppToast.show(this, "Value Auto Bind589: ${if (!current) "ON" else "OFF"}")
}

// v589: Verify Auto Checksum589
internal fun PlayerActivity.showV589VerifyAutoChecksum589Toggle() {
    val current = BiliClient.prefs.v589verifyAutoChecksum589
    BiliClient.prefs.v589verifyAutoChecksum589 = !current
    AppToast.show(this, "Verify Auto Checksum589: ${if (!current) "ON" else "OFF"}")
}

// v589: Version Auto Check589
internal fun PlayerActivity.showV589VersionAutoCheck589Toggle() {
    val current = BiliClient.prefs.v589versionAutoCheck589
    BiliClient.prefs.v589versionAutoCheck589 = !current
    AppToast.show(this, "Version Auto Check589: ${if (!current) "ON" else "OFF"}")
}

// v589: View Auto Switch589
internal fun PlayerActivity.showV589ViewAutoSwitch589Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v589viewAutoSwitch589).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch589",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v589viewAutoSwitch589 = value
        AppToast.show(this, "View Auto Switch589: $value")
    }
}

// v589: Virtual Display589
internal fun PlayerActivity.showV589VirtualDisplay589Toggle() {
    val current = BiliClient.prefs.v589virtualDisplay589
    BiliClient.prefs.v589virtualDisplay589 = !current
    AppToast.show(this, "Virtual Display589: ${if (!current) "ON" else "OFF"}")
}

// v589: Visible Auto Toggle589
internal fun PlayerActivity.showV589VisibleAutoToggle589Toggle() {
    val current = BiliClient.prefs.v589visibleAutoToggle589
    BiliClient.prefs.v589visibleAutoToggle589 = !current
    AppToast.show(this, "Visible Auto Toggle589: ${if (!current) "ON" else "OFF"}")
}

// v589: Voice Auto Recognize589
internal fun PlayerActivity.showV589VoiceAutoRecognize589Toggle() {
    val current = BiliClient.prefs.v589voiceAutoRecognize589
    BiliClient.prefs.v589voiceAutoRecognize589 = !current
    AppToast.show(this, "Voice Auto Recognize589: ${if (!current) "ON" else "OFF"}")
}

// v589: Wait Auto Timeout589
internal fun PlayerActivity.showV589WaitAutoTimeout589Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v589waitAutoTimeout589).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout589",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v589waitAutoTimeout589 = value
        AppToast.show(this, "Wait Auto Timeout589: $value")
    }
}

// v589: Warm Auto Start589
internal fun PlayerActivity.showV589WarmAutoStart589Toggle() {
    val current = BiliClient.prefs.v589warmAutoStart589
    BiliClient.prefs.v589warmAutoStart589 = !current
    AppToast.show(this, "Warm Auto Start589: ${if (!current) "ON" else "OFF"}")
}

// v589: Warning Auto Alert589
internal fun PlayerActivity.showV589WarningAutoAlert589Toggle() {
    val current = BiliClient.prefs.v589warningAutoAlert589
    BiliClient.prefs.v589warningAutoAlert589 = !current
    AppToast.show(this, "Warning Auto Alert589: ${if (!current) "ON" else "OFF"}")
}

// v589: Watch Auto Sync589
internal fun PlayerActivity.showV589WatchAutoSync589Toggle() {
    val current = BiliClient.prefs.v589watchAutoSync589
    BiliClient.prefs.v589watchAutoSync589 = !current
    AppToast.show(this, "Watch Auto Sync589: ${if (!current) "ON" else "OFF"}")
}

// v590: Update Auto Download590
internal fun PlayerActivity.showV590UpdateAutoDownload590Toggle() {
    val current = BiliClient.prefs.v590updateAutoDownload590
    BiliClient.prefs.v590updateAutoDownload590 = !current
    AppToast.show(this, "Update Auto Download590: ${if (!current) "ON" else "OFF"}")
}

// v590: Upload Auto Retry590
internal fun PlayerActivity.showV590UploadAutoRetry590Toggle() {
    val current = BiliClient.prefs.v590uploadAutoRetry590
    BiliClient.prefs.v590uploadAutoRetry590 = !current
    AppToast.show(this, "Upload Auto Retry590: ${if (!current) "ON" else "OFF"}")
}

// v590: Upscale Auto Enhance590
internal fun PlayerActivity.showV590UpscaleAutoEnhance590Toggle() {
    val current = BiliClient.prefs.v590upscaleAutoEnhance590
    BiliClient.prefs.v590upscaleAutoEnhance590 = !current
    AppToast.show(this, "Upscale Auto Enhance590: ${if (!current) "ON" else "OFF"}")
}

// v590: Use Auto Optimize590
internal fun PlayerActivity.showV590UseAutoOptimize590Toggle() {
    val current = BiliClient.prefs.v590useAutoOptimize590
    BiliClient.prefs.v590useAutoOptimize590 = !current
    AppToast.show(this, "Use Auto Optimize590: ${if (!current) "ON" else "OFF"}")
}

// v590: Value Auto Bind590
internal fun PlayerActivity.showV590ValueAutoBind590Toggle() {
    val current = BiliClient.prefs.v590valueAutoBind590
    BiliClient.prefs.v590valueAutoBind590 = !current
    AppToast.show(this, "Value Auto Bind590: ${if (!current) "ON" else "OFF"}")
}

// v590: Verify Auto Checksum590
internal fun PlayerActivity.showV590VerifyAutoChecksum590Toggle() {
    val current = BiliClient.prefs.v590verifyAutoChecksum590
    BiliClient.prefs.v590verifyAutoChecksum590 = !current
    AppToast.show(this, "Verify Auto Checksum590: ${if (!current) "ON" else "OFF"}")
}

// v590: Version Auto Check590
internal fun PlayerActivity.showV590VersionAutoCheck590Toggle() {
    val current = BiliClient.prefs.v590versionAutoCheck590
    BiliClient.prefs.v590versionAutoCheck590 = !current
    AppToast.show(this, "Version Auto Check590: ${if (!current) "ON" else "OFF"}")
}

// v590: View Auto Switch590
internal fun PlayerActivity.showV590ViewAutoSwitch590Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v590viewAutoSwitch590).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "View Auto Switch590",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v590viewAutoSwitch590 = value
        AppToast.show(this, "View Auto Switch590: $value")
    }
}

// v590: Virtual Display590
internal fun PlayerActivity.showV590VirtualDisplay590Toggle() {
    val current = BiliClient.prefs.v590virtualDisplay590
    BiliClient.prefs.v590virtualDisplay590 = !current
    AppToast.show(this, "Virtual Display590: ${if (!current) "ON" else "OFF"}")
}

// v590: Visible Auto Toggle590
internal fun PlayerActivity.showV590VisibleAutoToggle590Toggle() {
    val current = BiliClient.prefs.v590visibleAutoToggle590
    BiliClient.prefs.v590visibleAutoToggle590 = !current
    AppToast.show(this, "Visible Auto Toggle590: ${if (!current) "ON" else "OFF"}")
}

// v590: Voice Auto Recognize590
internal fun PlayerActivity.showV590VoiceAutoRecognize590Toggle() {
    val current = BiliClient.prefs.v590voiceAutoRecognize590
    BiliClient.prefs.v590voiceAutoRecognize590 = !current
    AppToast.show(this, "Voice Auto Recognize590: ${if (!current) "ON" else "OFF"}")
}

// v590: Wait Auto Timeout590
internal fun PlayerActivity.showV590WaitAutoTimeout590Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v590waitAutoTimeout590).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Wait Auto Timeout590",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v590waitAutoTimeout590 = value
        AppToast.show(this, "Wait Auto Timeout590: $value")
    }
}

// v590: Warm Auto Start590
internal fun PlayerActivity.showV590WarmAutoStart590Toggle() {
    val current = BiliClient.prefs.v590warmAutoStart590
    BiliClient.prefs.v590warmAutoStart590 = !current
    AppToast.show(this, "Warm Auto Start590: ${if (!current) "ON" else "OFF"}")
}

// v590: Warning Auto Alert590
internal fun PlayerActivity.showV590WarningAutoAlert590Toggle() {
    val current = BiliClient.prefs.v590warningAutoAlert590
    BiliClient.prefs.v590warningAutoAlert590 = !current
    AppToast.show(this, "Warning Auto Alert590: ${if (!current) "ON" else "OFF"}")
}

// v590: Watch Auto Sync590
internal fun PlayerActivity.showV590WatchAutoSync590Toggle() {
    val current = BiliClient.prefs.v590watchAutoSync590
    BiliClient.prefs.v590watchAutoSync590 = !current
    AppToast.show(this, "Watch Auto Sync590: ${if (!current) "ON" else "OFF"}")
}

// v591: Web Auto Redirect591
internal fun PlayerActivity.showV591WebAutoRedirect591Toggle() {
    val current = BiliClient.prefs.v591webAutoRedirect591
    BiliClient.prefs.v591webAutoRedirect591 = !current
    AppToast.show(this, "Web Auto Redirect591: ${if (!current) "ON" else "OFF"}")
}

// v591: Widget Auto Refresh591
internal fun PlayerActivity.showV591WidgetAutoRefresh591Toggle() {
    val current = BiliClient.prefs.v591widgetAutoRefresh591
    BiliClient.prefs.v591widgetAutoRefresh591 = !current
    AppToast.show(this, "Widget Auto Refresh591: ${if (!current) "ON" else "OFF"}")
}

// v591: Window Auto Snap591
internal fun PlayerActivity.showV591WindowAutoSnap591Toggle() {
    val current = BiliClient.prefs.v591windowAutoSnap591
    BiliClient.prefs.v591windowAutoSnap591 = !current
    AppToast.show(this, "Window Auto Snap591: ${if (!current) "ON" else "OFF"}")
}

// v591: Wrap Auto Break591
internal fun PlayerActivity.showV591WrapAutoBreak591Toggle() {
    val current = BiliClient.prefs.v591wrapAutoBreak591
    BiliClient.prefs.v591wrapAutoBreak591 = !current
    AppToast.show(this, "Wrap Auto Break591: ${if (!current) "ON" else "OFF"}")
}

// v591: Zone Auto Detect591
internal fun PlayerActivity.showV591ZoneAutoDetect591Toggle() {
    val current = BiliClient.prefs.v591zoneAutoDetect591
    BiliClient.prefs.v591zoneAutoDetect591 = !current
    AppToast.show(this, "Zone Auto Detect591: ${if (!current) "ON" else "OFF"}")
}

// v591: Anchor Auto Pin591
internal fun PlayerActivity.showV591AnchorAutoPin591Toggle() {
    val current = BiliClient.prefs.v591anchorAutoPin591
    BiliClient.prefs.v591anchorAutoPin591 = !current
    AppToast.show(this, "Anchor Auto Pin591: ${if (!current) "ON" else "OFF"}")
}

// v591: Aspect Auto Ratio591
internal fun PlayerActivity.showV591AspectAutoRatio591Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v591aspectAutoRatio591).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio591",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v591aspectAutoRatio591 = value
        AppToast.show(this, "Aspect Auto Ratio591: $value")
    }
}

// v591: Attach Auto Embed591
internal fun PlayerActivity.showV591AttachAutoEmbed591Toggle() {
    val current = BiliClient.prefs.v591attachAutoEmbed591
    BiliClient.prefs.v591attachAutoEmbed591 = !current
    AppToast.show(this, "Attach Auto Embed591: ${if (!current) "ON" else "OFF"}")
}

// v591: Audio Auto Normalize591
internal fun PlayerActivity.showV591AudioAutoNormalize591Toggle() {
    val current = BiliClient.prefs.v591audioAutoNormalize591
    BiliClient.prefs.v591audioAutoNormalize591 = !current
    AppToast.show(this, "Audio Auto Normalize591: ${if (!current) "ON" else "OFF"}")
}

// v591: Axis Auto Align591
internal fun PlayerActivity.showV591AxisAutoAlign591Toggle() {
    val current = BiliClient.prefs.v591axisAutoAlign591
    BiliClient.prefs.v591axisAutoAlign591 = !current
    AppToast.show(this, "Axis Auto Align591: ${if (!current) "ON" else "OFF"}")
}

// v591: Badge Auto Count591
internal fun PlayerActivity.showV591BadgeAutoCount591Toggle() {
    val current = BiliClient.prefs.v591badgeAutoCount591
    BiliClient.prefs.v591badgeAutoCount591 = !current
    AppToast.show(this, "Badge Auto Count591: ${if (!current) "ON" else "OFF"}")
}

// v591: Baseline Auto Sync591
internal fun PlayerActivity.showV591BaselineAutoSync591Toggle() {
    val current = BiliClient.prefs.v591baselineAutoSync591
    BiliClient.prefs.v591baselineAutoSync591 = !current
    AppToast.show(this, "Baseline Auto Sync591: ${if (!current) "ON" else "OFF"}")
}

// v591: Bind Auto Link591
internal fun PlayerActivity.showV591BindAutoLink591Toggle() {
    val current = BiliClient.prefs.v591bindAutoLink591
    BiliClient.prefs.v591bindAutoLink591 = !current
    AppToast.show(this, "Bind Auto Link591: ${if (!current) "ON" else "OFF"}")
}

// v591: Bitrate Auto Scale591
internal fun PlayerActivity.showV591BitrateAutoScale591Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v591bitrateAutoScale591).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale591",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v591bitrateAutoScale591 = value
        AppToast.show(this, "Bitrate Auto Scale591: $value")
    }
}

// v591: Blend Auto Mode591
internal fun PlayerActivity.showV591BlendAutoMode591Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v591blendAutoMode591).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode591",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v591blendAutoMode591 = value
        AppToast.show(this, "Blend Auto Mode591: $value")
    }
}

// v592: Web Auto Redirect592
internal fun PlayerActivity.showV592WebAutoRedirect592Toggle() {
    val current = BiliClient.prefs.v592webAutoRedirect592
    BiliClient.prefs.v592webAutoRedirect592 = !current
    AppToast.show(this, "Web Auto Redirect592: ${if (!current) "ON" else "OFF"}")
}

// v592: Widget Auto Refresh592
internal fun PlayerActivity.showV592WidgetAutoRefresh592Toggle() {
    val current = BiliClient.prefs.v592widgetAutoRefresh592
    BiliClient.prefs.v592widgetAutoRefresh592 = !current
    AppToast.show(this, "Widget Auto Refresh592: ${if (!current) "ON" else "OFF"}")
}

// v592: Window Auto Snap592
internal fun PlayerActivity.showV592WindowAutoSnap592Toggle() {
    val current = BiliClient.prefs.v592windowAutoSnap592
    BiliClient.prefs.v592windowAutoSnap592 = !current
    AppToast.show(this, "Window Auto Snap592: ${if (!current) "ON" else "OFF"}")
}

// v592: Wrap Auto Break592
internal fun PlayerActivity.showV592WrapAutoBreak592Toggle() {
    val current = BiliClient.prefs.v592wrapAutoBreak592
    BiliClient.prefs.v592wrapAutoBreak592 = !current
    AppToast.show(this, "Wrap Auto Break592: ${if (!current) "ON" else "OFF"}")
}

// v592: Zone Auto Detect592
internal fun PlayerActivity.showV592ZoneAutoDetect592Toggle() {
    val current = BiliClient.prefs.v592zoneAutoDetect592
    BiliClient.prefs.v592zoneAutoDetect592 = !current
    AppToast.show(this, "Zone Auto Detect592: ${if (!current) "ON" else "OFF"}")
}

// v592: Anchor Auto Pin592
internal fun PlayerActivity.showV592AnchorAutoPin592Toggle() {
    val current = BiliClient.prefs.v592anchorAutoPin592
    BiliClient.prefs.v592anchorAutoPin592 = !current
    AppToast.show(this, "Anchor Auto Pin592: ${if (!current) "ON" else "OFF"}")
}

// v592: Aspect Auto Ratio592
internal fun PlayerActivity.showV592AspectAutoRatio592Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v592aspectAutoRatio592).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio592",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v592aspectAutoRatio592 = value
        AppToast.show(this, "Aspect Auto Ratio592: $value")
    }
}

// v592: Attach Auto Embed592
internal fun PlayerActivity.showV592AttachAutoEmbed592Toggle() {
    val current = BiliClient.prefs.v592attachAutoEmbed592
    BiliClient.prefs.v592attachAutoEmbed592 = !current
    AppToast.show(this, "Attach Auto Embed592: ${if (!current) "ON" else "OFF"}")
}

// v592: Audio Auto Normalize592
internal fun PlayerActivity.showV592AudioAutoNormalize592Toggle() {
    val current = BiliClient.prefs.v592audioAutoNormalize592
    BiliClient.prefs.v592audioAutoNormalize592 = !current
    AppToast.show(this, "Audio Auto Normalize592: ${if (!current) "ON" else "OFF"}")
}

// v592: Axis Auto Align592
internal fun PlayerActivity.showV592AxisAutoAlign592Toggle() {
    val current = BiliClient.prefs.v592axisAutoAlign592
    BiliClient.prefs.v592axisAutoAlign592 = !current
    AppToast.show(this, "Axis Auto Align592: ${if (!current) "ON" else "OFF"}")
}

// v592: Badge Auto Count592
internal fun PlayerActivity.showV592BadgeAutoCount592Toggle() {
    val current = BiliClient.prefs.v592badgeAutoCount592
    BiliClient.prefs.v592badgeAutoCount592 = !current
    AppToast.show(this, "Badge Auto Count592: ${if (!current) "ON" else "OFF"}")
}

// v592: Baseline Auto Sync592
internal fun PlayerActivity.showV592BaselineAutoSync592Toggle() {
    val current = BiliClient.prefs.v592baselineAutoSync592
    BiliClient.prefs.v592baselineAutoSync592 = !current
    AppToast.show(this, "Baseline Auto Sync592: ${if (!current) "ON" else "OFF"}")
}

// v592: Bind Auto Link592
internal fun PlayerActivity.showV592BindAutoLink592Toggle() {
    val current = BiliClient.prefs.v592bindAutoLink592
    BiliClient.prefs.v592bindAutoLink592 = !current
    AppToast.show(this, "Bind Auto Link592: ${if (!current) "ON" else "OFF"}")
}

// v592: Bitrate Auto Scale592
internal fun PlayerActivity.showV592BitrateAutoScale592Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v592bitrateAutoScale592).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale592",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v592bitrateAutoScale592 = value
        AppToast.show(this, "Bitrate Auto Scale592: $value")
    }
}

// v592: Blend Auto Mode592
internal fun PlayerActivity.showV592BlendAutoMode592Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v592blendAutoMode592).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode592",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v592blendAutoMode592 = value
        AppToast.show(this, "Blend Auto Mode592: $value")
    }
}

// v593: Web Auto Redirect593
internal fun PlayerActivity.showV593WebAutoRedirect593Toggle() {
    val current = BiliClient.prefs.v593webAutoRedirect593
    BiliClient.prefs.v593webAutoRedirect593 = !current
    AppToast.show(this, "Web Auto Redirect593: ${if (!current) "ON" else "OFF"}")
}

// v593: Widget Auto Refresh593
internal fun PlayerActivity.showV593WidgetAutoRefresh593Toggle() {
    val current = BiliClient.prefs.v593widgetAutoRefresh593
    BiliClient.prefs.v593widgetAutoRefresh593 = !current
    AppToast.show(this, "Widget Auto Refresh593: ${if (!current) "ON" else "OFF"}")
}

// v593: Window Auto Snap593
internal fun PlayerActivity.showV593WindowAutoSnap593Toggle() {
    val current = BiliClient.prefs.v593windowAutoSnap593
    BiliClient.prefs.v593windowAutoSnap593 = !current
    AppToast.show(this, "Window Auto Snap593: ${if (!current) "ON" else "OFF"}")
}

// v593: Wrap Auto Break593
internal fun PlayerActivity.showV593WrapAutoBreak593Toggle() {
    val current = BiliClient.prefs.v593wrapAutoBreak593
    BiliClient.prefs.v593wrapAutoBreak593 = !current
    AppToast.show(this, "Wrap Auto Break593: ${if (!current) "ON" else "OFF"}")
}

// v593: Zone Auto Detect593
internal fun PlayerActivity.showV593ZoneAutoDetect593Toggle() {
    val current = BiliClient.prefs.v593zoneAutoDetect593
    BiliClient.prefs.v593zoneAutoDetect593 = !current
    AppToast.show(this, "Zone Auto Detect593: ${if (!current) "ON" else "OFF"}")
}

// v593: Anchor Auto Pin593
internal fun PlayerActivity.showV593AnchorAutoPin593Toggle() {
    val current = BiliClient.prefs.v593anchorAutoPin593
    BiliClient.prefs.v593anchorAutoPin593 = !current
    AppToast.show(this, "Anchor Auto Pin593: ${if (!current) "ON" else "OFF"}")
}

// v593: Aspect Auto Ratio593
internal fun PlayerActivity.showV593AspectAutoRatio593Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v593aspectAutoRatio593).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio593",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v593aspectAutoRatio593 = value
        AppToast.show(this, "Aspect Auto Ratio593: $value")
    }
}

// v593: Attach Auto Embed593
internal fun PlayerActivity.showV593AttachAutoEmbed593Toggle() {
    val current = BiliClient.prefs.v593attachAutoEmbed593
    BiliClient.prefs.v593attachAutoEmbed593 = !current
    AppToast.show(this, "Attach Auto Embed593: ${if (!current) "ON" else "OFF"}")
}

// v593: Audio Auto Normalize593
internal fun PlayerActivity.showV593AudioAutoNormalize593Toggle() {
    val current = BiliClient.prefs.v593audioAutoNormalize593
    BiliClient.prefs.v593audioAutoNormalize593 = !current
    AppToast.show(this, "Audio Auto Normalize593: ${if (!current) "ON" else "OFF"}")
}

// v593: Axis Auto Align593
internal fun PlayerActivity.showV593AxisAutoAlign593Toggle() {
    val current = BiliClient.prefs.v593axisAutoAlign593
    BiliClient.prefs.v593axisAutoAlign593 = !current
    AppToast.show(this, "Axis Auto Align593: ${if (!current) "ON" else "OFF"}")
}

// v593: Badge Auto Count593
internal fun PlayerActivity.showV593BadgeAutoCount593Toggle() {
    val current = BiliClient.prefs.v593badgeAutoCount593
    BiliClient.prefs.v593badgeAutoCount593 = !current
    AppToast.show(this, "Badge Auto Count593: ${if (!current) "ON" else "OFF"}")
}

// v593: Baseline Auto Sync593
internal fun PlayerActivity.showV593BaselineAutoSync593Toggle() {
    val current = BiliClient.prefs.v593baselineAutoSync593
    BiliClient.prefs.v593baselineAutoSync593 = !current
    AppToast.show(this, "Baseline Auto Sync593: ${if (!current) "ON" else "OFF"}")
}

// v593: Bind Auto Link593
internal fun PlayerActivity.showV593BindAutoLink593Toggle() {
    val current = BiliClient.prefs.v593bindAutoLink593
    BiliClient.prefs.v593bindAutoLink593 = !current
    AppToast.show(this, "Bind Auto Link593: ${if (!current) "ON" else "OFF"}")
}

// v593: Bitrate Auto Scale593
internal fun PlayerActivity.showV593BitrateAutoScale593Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v593bitrateAutoScale593).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale593",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v593bitrateAutoScale593 = value
        AppToast.show(this, "Bitrate Auto Scale593: $value")
    }
}

// v593: Blend Auto Mode593
internal fun PlayerActivity.showV593BlendAutoMode593Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v593blendAutoMode593).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode593",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v593blendAutoMode593 = value
        AppToast.show(this, "Blend Auto Mode593: $value")
    }
}

// v594: Web Auto Redirect594
internal fun PlayerActivity.showV594WebAutoRedirect594Toggle() {
    val current = BiliClient.prefs.v594webAutoRedirect594
    BiliClient.prefs.v594webAutoRedirect594 = !current
    AppToast.show(this, "Web Auto Redirect594: ${if (!current) "ON" else "OFF"}")
}

// v594: Widget Auto Refresh594
internal fun PlayerActivity.showV594WidgetAutoRefresh594Toggle() {
    val current = BiliClient.prefs.v594widgetAutoRefresh594
    BiliClient.prefs.v594widgetAutoRefresh594 = !current
    AppToast.show(this, "Widget Auto Refresh594: ${if (!current) "ON" else "OFF"}")
}

// v594: Window Auto Snap594
internal fun PlayerActivity.showV594WindowAutoSnap594Toggle() {
    val current = BiliClient.prefs.v594windowAutoSnap594
    BiliClient.prefs.v594windowAutoSnap594 = !current
    AppToast.show(this, "Window Auto Snap594: ${if (!current) "ON" else "OFF"}")
}

// v594: Wrap Auto Break594
internal fun PlayerActivity.showV594WrapAutoBreak594Toggle() {
    val current = BiliClient.prefs.v594wrapAutoBreak594
    BiliClient.prefs.v594wrapAutoBreak594 = !current
    AppToast.show(this, "Wrap Auto Break594: ${if (!current) "ON" else "OFF"}")
}

// v594: Zone Auto Detect594
internal fun PlayerActivity.showV594ZoneAutoDetect594Toggle() {
    val current = BiliClient.prefs.v594zoneAutoDetect594
    BiliClient.prefs.v594zoneAutoDetect594 = !current
    AppToast.show(this, "Zone Auto Detect594: ${if (!current) "ON" else "OFF"}")
}

// v594: Anchor Auto Pin594
internal fun PlayerActivity.showV594AnchorAutoPin594Toggle() {
    val current = BiliClient.prefs.v594anchorAutoPin594
    BiliClient.prefs.v594anchorAutoPin594 = !current
    AppToast.show(this, "Anchor Auto Pin594: ${if (!current) "ON" else "OFF"}")
}

// v594: Aspect Auto Ratio594
internal fun PlayerActivity.showV594AspectAutoRatio594Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v594aspectAutoRatio594).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio594",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v594aspectAutoRatio594 = value
        AppToast.show(this, "Aspect Auto Ratio594: $value")
    }
}

// v594: Attach Auto Embed594
internal fun PlayerActivity.showV594AttachAutoEmbed594Toggle() {
    val current = BiliClient.prefs.v594attachAutoEmbed594
    BiliClient.prefs.v594attachAutoEmbed594 = !current
    AppToast.show(this, "Attach Auto Embed594: ${if (!current) "ON" else "OFF"}")
}

// v594: Audio Auto Normalize594
internal fun PlayerActivity.showV594AudioAutoNormalize594Toggle() {
    val current = BiliClient.prefs.v594audioAutoNormalize594
    BiliClient.prefs.v594audioAutoNormalize594 = !current
    AppToast.show(this, "Audio Auto Normalize594: ${if (!current) "ON" else "OFF"}")
}

// v594: Axis Auto Align594
internal fun PlayerActivity.showV594AxisAutoAlign594Toggle() {
    val current = BiliClient.prefs.v594axisAutoAlign594
    BiliClient.prefs.v594axisAutoAlign594 = !current
    AppToast.show(this, "Axis Auto Align594: ${if (!current) "ON" else "OFF"}")
}

// v594: Badge Auto Count594
internal fun PlayerActivity.showV594BadgeAutoCount594Toggle() {
    val current = BiliClient.prefs.v594badgeAutoCount594
    BiliClient.prefs.v594badgeAutoCount594 = !current
    AppToast.show(this, "Badge Auto Count594: ${if (!current) "ON" else "OFF"}")
}

// v594: Baseline Auto Sync594
internal fun PlayerActivity.showV594BaselineAutoSync594Toggle() {
    val current = BiliClient.prefs.v594baselineAutoSync594
    BiliClient.prefs.v594baselineAutoSync594 = !current
    AppToast.show(this, "Baseline Auto Sync594: ${if (!current) "ON" else "OFF"}")
}

// v594: Bind Auto Link594
internal fun PlayerActivity.showV594BindAutoLink594Toggle() {
    val current = BiliClient.prefs.v594bindAutoLink594
    BiliClient.prefs.v594bindAutoLink594 = !current
    AppToast.show(this, "Bind Auto Link594: ${if (!current) "ON" else "OFF"}")
}

// v594: Bitrate Auto Scale594
internal fun PlayerActivity.showV594BitrateAutoScale594Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v594bitrateAutoScale594).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale594",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v594bitrateAutoScale594 = value
        AppToast.show(this, "Bitrate Auto Scale594: $value")
    }
}

// v594: Blend Auto Mode594
internal fun PlayerActivity.showV594BlendAutoMode594Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v594blendAutoMode594).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode594",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v594blendAutoMode594 = value
        AppToast.show(this, "Blend Auto Mode594: $value")
    }
}

// v595: Web Auto Redirect595
internal fun PlayerActivity.showV595WebAutoRedirect595Toggle() {
    val current = BiliClient.prefs.v595webAutoRedirect595
    BiliClient.prefs.v595webAutoRedirect595 = !current
    AppToast.show(this, "Web Auto Redirect595: ${if (!current) "ON" else "OFF"}")
}

// v595: Widget Auto Refresh595
internal fun PlayerActivity.showV595WidgetAutoRefresh595Toggle() {
    val current = BiliClient.prefs.v595widgetAutoRefresh595
    BiliClient.prefs.v595widgetAutoRefresh595 = !current
    AppToast.show(this, "Widget Auto Refresh595: ${if (!current) "ON" else "OFF"}")
}

// v595: Window Auto Snap595
internal fun PlayerActivity.showV595WindowAutoSnap595Toggle() {
    val current = BiliClient.prefs.v595windowAutoSnap595
    BiliClient.prefs.v595windowAutoSnap595 = !current
    AppToast.show(this, "Window Auto Snap595: ${if (!current) "ON" else "OFF"}")
}

// v595: Wrap Auto Break595
internal fun PlayerActivity.showV595WrapAutoBreak595Toggle() {
    val current = BiliClient.prefs.v595wrapAutoBreak595
    BiliClient.prefs.v595wrapAutoBreak595 = !current
    AppToast.show(this, "Wrap Auto Break595: ${if (!current) "ON" else "OFF"}")
}

// v595: Zone Auto Detect595
internal fun PlayerActivity.showV595ZoneAutoDetect595Toggle() {
    val current = BiliClient.prefs.v595zoneAutoDetect595
    BiliClient.prefs.v595zoneAutoDetect595 = !current
    AppToast.show(this, "Zone Auto Detect595: ${if (!current) "ON" else "OFF"}")
}

// v595: Anchor Auto Pin595
internal fun PlayerActivity.showV595AnchorAutoPin595Toggle() {
    val current = BiliClient.prefs.v595anchorAutoPin595
    BiliClient.prefs.v595anchorAutoPin595 = !current
    AppToast.show(this, "Anchor Auto Pin595: ${if (!current) "ON" else "OFF"}")
}

// v595: Aspect Auto Ratio595
internal fun PlayerActivity.showV595AspectAutoRatio595Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v595aspectAutoRatio595).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio595",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v595aspectAutoRatio595 = value
        AppToast.show(this, "Aspect Auto Ratio595: $value")
    }
}

// v595: Attach Auto Embed595
internal fun PlayerActivity.showV595AttachAutoEmbed595Toggle() {
    val current = BiliClient.prefs.v595attachAutoEmbed595
    BiliClient.prefs.v595attachAutoEmbed595 = !current
    AppToast.show(this, "Attach Auto Embed595: ${if (!current) "ON" else "OFF"}")
}

// v595: Audio Auto Normalize595
internal fun PlayerActivity.showV595AudioAutoNormalize595Toggle() {
    val current = BiliClient.prefs.v595audioAutoNormalize595
    BiliClient.prefs.v595audioAutoNormalize595 = !current
    AppToast.show(this, "Audio Auto Normalize595: ${if (!current) "ON" else "OFF"}")
}

// v595: Axis Auto Align595
internal fun PlayerActivity.showV595AxisAutoAlign595Toggle() {
    val current = BiliClient.prefs.v595axisAutoAlign595
    BiliClient.prefs.v595axisAutoAlign595 = !current
    AppToast.show(this, "Axis Auto Align595: ${if (!current) "ON" else "OFF"}")
}

// v595: Badge Auto Count595
internal fun PlayerActivity.showV595BadgeAutoCount595Toggle() {
    val current = BiliClient.prefs.v595badgeAutoCount595
    BiliClient.prefs.v595badgeAutoCount595 = !current
    AppToast.show(this, "Badge Auto Count595: ${if (!current) "ON" else "OFF"}")
}

// v595: Baseline Auto Sync595
internal fun PlayerActivity.showV595BaselineAutoSync595Toggle() {
    val current = BiliClient.prefs.v595baselineAutoSync595
    BiliClient.prefs.v595baselineAutoSync595 = !current
    AppToast.show(this, "Baseline Auto Sync595: ${if (!current) "ON" else "OFF"}")
}

// v595: Bind Auto Link595
internal fun PlayerActivity.showV595BindAutoLink595Toggle() {
    val current = BiliClient.prefs.v595bindAutoLink595
    BiliClient.prefs.v595bindAutoLink595 = !current
    AppToast.show(this, "Bind Auto Link595: ${if (!current) "ON" else "OFF"}")
}

// v595: Bitrate Auto Scale595
internal fun PlayerActivity.showV595BitrateAutoScale595Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v595bitrateAutoScale595).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Bitrate Auto Scale595",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v595bitrateAutoScale595 = value
        AppToast.show(this, "Bitrate Auto Scale595: $value")
    }
}

// v595: Blend Auto Mode595
internal fun PlayerActivity.showV595BlendAutoMode595Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v595blendAutoMode595).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Blend Auto Mode595",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v595blendAutoMode595 = value
        AppToast.show(this, "Blend Auto Mode595: $value")
    }
}

// v596: Web Auto Redirect596
internal fun PlayerActivity.showV596WebAutoRedirect596Toggle() {
    val current = BiliClient.prefs.v596webAutoRedirect596
    BiliClient.prefs.v596webAutoRedirect596 = !current
    AppToast.show(this, "Web Auto Redirect596: ${if (!current) "ON" else "OFF"}")
}

// v596: Widget Auto Refresh596
internal fun PlayerActivity.showV596WidgetAutoRefresh596Toggle() {
    val current = BiliClient.prefs.v596widgetAutoRefresh596
    BiliClient.prefs.v596widgetAutoRefresh596 = !current
    AppToast.show(this, "Widget Auto Refresh596: ${if (!current) "ON" else "OFF"}")
}

// v596: Window Auto Snap596
internal fun PlayerActivity.showV596WindowAutoSnap596Toggle() {
    val current = BiliClient.prefs.v596windowAutoSnap596
    BiliClient.prefs.v596windowAutoSnap596 = !current
    AppToast.show(this, "Window Auto Snap596: ${if (!current) "ON" else "OFF"}")
}

// v596: Wrap Auto Break596
internal fun PlayerActivity.showV596WrapAutoBreak596Toggle() {
    val current = BiliClient.prefs.v596wrapAutoBreak596
    BiliClient.prefs.v596wrapAutoBreak596 = !current
    AppToast.show(this, "Wrap Auto Break596: ${if (!current) "ON" else "OFF"}")
}

// v596: Zone Auto Detect596
internal fun PlayerActivity.showV596ZoneAutoDetect596Toggle() {
    val current = BiliClient.prefs.v596zoneAutoDetect596
    BiliClient.prefs.v596zoneAutoDetect596 = !current
    AppToast.show(this, "Zone Auto Detect596: ${if (!current) "ON" else "OFF"}")
}

// v596: Anchor Auto Pin596
internal fun PlayerActivity.showV596AnchorAutoPin596Toggle() {
    val current = BiliClient.prefs.v596anchorAutoPin596
    BiliClient.prefs.v596anchorAutoPin596 = !current
    AppToast.show(this, "Anchor Auto Pin596: ${if (!current) "ON" else "OFF"}")
}

// v596: Aspect Auto Ratio596
internal fun PlayerActivity.showV596AspectAutoRatio596Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v596aspectAutoRatio596).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Aspect Auto Ratio596",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v596aspectAutoRatio596 = value
        AppToast.show(this, "Aspect Auto Ratio596: $value")
    }
}

// v596: Attach Auto Embed596
internal fun PlayerActivity.showV596AttachAutoEmbed596Toggle() {
    val current = BiliClient.prefs.v596attachAutoEmbed596
    BiliClient.prefs.v596attachAutoEmbed596 = !current
    AppToast.show(this, "Attach Auto Embed596: ${if (!current) "ON" else "OFF"}")
}
