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

