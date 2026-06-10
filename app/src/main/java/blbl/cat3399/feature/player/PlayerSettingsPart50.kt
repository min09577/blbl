package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


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

