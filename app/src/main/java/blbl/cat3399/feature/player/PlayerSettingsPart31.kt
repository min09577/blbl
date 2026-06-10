package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v423: Error Report Auto423
internal fun PlayerActivity.showV423ErrorReportAuto423Toggle() {
    val current = BiliClient.prefs.v423errorReportAuto423
    BiliClient.prefs.v423errorReportAuto423 = !current
    AppToast.show(this, "Error Report Auto423: ${if (!current) "ON" else "OFF"}")
}

// v423: Event Auto Notify423
internal fun PlayerActivity.showV423EventAutoNotify423Toggle() {
    val current = BiliClient.prefs.v423eventAutoNotify423
    BiliClient.prefs.v423eventAutoNotify423 = !current
    AppToast.show(this, "Event Auto Notify423: ${if (!current) "ON" else "OFF"}")
}

// v423: Exit Confirmation423
internal fun PlayerActivity.showV423ExitConfirmation423Toggle() {
    val current = BiliClient.prefs.v423exitConfirmation423
    BiliClient.prefs.v423exitConfirmation423 = !current
    AppToast.show(this, "Exit Confirmation423: ${if (!current) "ON" else "OFF"}")
}

// v423: Expand On Double Tap423
internal fun PlayerActivity.showV423ExpandOnDoubleTap423Toggle() {
    val current = BiliClient.prefs.v423expandOnDoubleTap423
    BiliClient.prefs.v423expandOnDoubleTap423 = !current
    AppToast.show(this, "Expand On Double Tap423: ${if (!current) "ON" else "OFF"}")
}

// v423: Export Format Default423
internal fun PlayerActivity.showV423ExportFormatDefault423Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v423exportFormatDefault423).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default423",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v423exportFormatDefault423 = value
        AppToast.show(this, "Export Format Default423: $value")
    }
}

// v423: Extract Audio Auto423
internal fun PlayerActivity.showV423ExtractAudioAuto423Toggle() {
    val current = BiliClient.prefs.v423extractAudioAuto423
    BiliClient.prefs.v423extractAudioAuto423 = !current
    AppToast.show(this, "Extract Audio Auto423: ${if (!current) "ON" else "OFF"}")
}

// v423: Fade Transition423
internal fun PlayerActivity.showV423FadeTransition423Toggle() {
    val current = BiliClient.prefs.v423fadeTransition423
    BiliClient.prefs.v423fadeTransition423 = !current
    AppToast.show(this, "Fade Transition423: ${if (!current) "ON" else "OFF"}")
}

// v423: Feed Auto Refresh423
internal fun PlayerActivity.showV423FeedAutoRefresh423Toggle() {
    val current = BiliClient.prefs.v423feedAutoRefresh423
    BiliClient.prefs.v423feedAutoRefresh423 = !current
    AppToast.show(this, "Feed Auto Refresh423: ${if (!current) "ON" else "OFF"}")
}

// v423: Feed Layout Style423
internal fun PlayerActivity.showV423FeedLayoutStyle423Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v423feedLayoutStyle423).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style423",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v423feedLayoutStyle423 = value
        AppToast.show(this, "Feed Layout Style423: $value")
    }
}

// v423: File Auto Organize423
internal fun PlayerActivity.showV423FileAutoOrganize423Toggle() {
    val current = BiliClient.prefs.v423fileAutoOrganize423
    BiliClient.prefs.v423fileAutoOrganize423 = !current
    AppToast.show(this, "File Auto Organize423: ${if (!current) "ON" else "OFF"}")
}

// v423: Find In Page Highlight423
internal fun PlayerActivity.showV423FindInPageHighlight423Toggle() {
    val current = BiliClient.prefs.v423findInPageHighlight423
    BiliClient.prefs.v423findInPageHighlight423 = !current
    AppToast.show(this, "Find In Page Highlight423: ${if (!current) "ON" else "OFF"}")
}

// v423: Fix Corrupt Auto423
internal fun PlayerActivity.showV423FixCorruptAuto423Toggle() {
    val current = BiliClient.prefs.v423fixCorruptAuto423
    BiliClient.prefs.v423fixCorruptAuto423 = !current
    AppToast.show(this, "Fix Corrupt Auto423: ${if (!current) "ON" else "OFF"}")
}

// v424: Enter Animation424
internal fun PlayerActivity.showV424EnterAnimation424Toggle() {
    val current = BiliClient.prefs.v424enterAnimation424
    BiliClient.prefs.v424enterAnimation424 = !current
    AppToast.show(this, "Enter Animation424: ${if (!current) "ON" else "OFF"}")
}

// v424: Environment Light Sensor424
internal fun PlayerActivity.showV424EnvironmentLightSensor424Toggle() {
    val current = BiliClient.prefs.v424environmentLightSensor424
    BiliClient.prefs.v424environmentLightSensor424 = !current
    AppToast.show(this, "Environment Light Sensor424: ${if (!current) "ON" else "OFF"}")
}

// v424: Error Auto Retry424
internal fun PlayerActivity.showV424ErrorAutoRetry424Toggle() {
    val current = BiliClient.prefs.v424errorAutoRetry424
    BiliClient.prefs.v424errorAutoRetry424 = !current
    AppToast.show(this, "Error Auto Retry424: ${if (!current) "ON" else "OFF"}")
}

// v424: Error Report Auto424
internal fun PlayerActivity.showV424ErrorReportAuto424Toggle() {
    val current = BiliClient.prefs.v424errorReportAuto424
    BiliClient.prefs.v424errorReportAuto424 = !current
    AppToast.show(this, "Error Report Auto424: ${if (!current) "ON" else "OFF"}")
}

// v424: Event Auto Notify424
internal fun PlayerActivity.showV424EventAutoNotify424Toggle() {
    val current = BiliClient.prefs.v424eventAutoNotify424
    BiliClient.prefs.v424eventAutoNotify424 = !current
    AppToast.show(this, "Event Auto Notify424: ${if (!current) "ON" else "OFF"}")
}

// v424: Exit Confirmation424
internal fun PlayerActivity.showV424ExitConfirmation424Toggle() {
    val current = BiliClient.prefs.v424exitConfirmation424
    BiliClient.prefs.v424exitConfirmation424 = !current
    AppToast.show(this, "Exit Confirmation424: ${if (!current) "ON" else "OFF"}")
}

// v424: Expand On Double Tap424
internal fun PlayerActivity.showV424ExpandOnDoubleTap424Toggle() {
    val current = BiliClient.prefs.v424expandOnDoubleTap424
    BiliClient.prefs.v424expandOnDoubleTap424 = !current
    AppToast.show(this, "Expand On Double Tap424: ${if (!current) "ON" else "OFF"}")
}

// v424: Export Format Default424
internal fun PlayerActivity.showV424ExportFormatDefault424Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v424exportFormatDefault424).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default424",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v424exportFormatDefault424 = value
        AppToast.show(this, "Export Format Default424: $value")
    }
}

// v424: Extract Audio Auto424
internal fun PlayerActivity.showV424ExtractAudioAuto424Toggle() {
    val current = BiliClient.prefs.v424extractAudioAuto424
    BiliClient.prefs.v424extractAudioAuto424 = !current
    AppToast.show(this, "Extract Audio Auto424: ${if (!current) "ON" else "OFF"}")
}

// v424: Fade Transition424
internal fun PlayerActivity.showV424FadeTransition424Toggle() {
    val current = BiliClient.prefs.v424fadeTransition424
    BiliClient.prefs.v424fadeTransition424 = !current
    AppToast.show(this, "Fade Transition424: ${if (!current) "ON" else "OFF"}")
}

// v424: Feed Auto Refresh424
internal fun PlayerActivity.showV424FeedAutoRefresh424Toggle() {
    val current = BiliClient.prefs.v424feedAutoRefresh424
    BiliClient.prefs.v424feedAutoRefresh424 = !current
    AppToast.show(this, "Feed Auto Refresh424: ${if (!current) "ON" else "OFF"}")
}

// v424: Feed Layout Style424
internal fun PlayerActivity.showV424FeedLayoutStyle424Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v424feedLayoutStyle424).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style424",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v424feedLayoutStyle424 = value
        AppToast.show(this, "Feed Layout Style424: $value")
    }
}

// v424: File Auto Organize424
internal fun PlayerActivity.showV424FileAutoOrganize424Toggle() {
    val current = BiliClient.prefs.v424fileAutoOrganize424
    BiliClient.prefs.v424fileAutoOrganize424 = !current
    AppToast.show(this, "File Auto Organize424: ${if (!current) "ON" else "OFF"}")
}

// v424: Find In Page Highlight424
internal fun PlayerActivity.showV424FindInPageHighlight424Toggle() {
    val current = BiliClient.prefs.v424findInPageHighlight424
    BiliClient.prefs.v424findInPageHighlight424 = !current
    AppToast.show(this, "Find In Page Highlight424: ${if (!current) "ON" else "OFF"}")
}

// v424: Fix Corrupt Auto424
internal fun PlayerActivity.showV424FixCorruptAuto424Toggle() {
    val current = BiliClient.prefs.v424fixCorruptAuto424
    BiliClient.prefs.v424fixCorruptAuto424 = !current
    AppToast.show(this, "Fix Corrupt Auto424: ${if (!current) "ON" else "OFF"}")
}

// v425: Enter Animation425
internal fun PlayerActivity.showV425EnterAnimation425Toggle() {
    val current = BiliClient.prefs.v425enterAnimation425
    BiliClient.prefs.v425enterAnimation425 = !current
    AppToast.show(this, "Enter Animation425: ${if (!current) "ON" else "OFF"}")
}

// v425: Environment Light Sensor425
internal fun PlayerActivity.showV425EnvironmentLightSensor425Toggle() {
    val current = BiliClient.prefs.v425environmentLightSensor425
    BiliClient.prefs.v425environmentLightSensor425 = !current
    AppToast.show(this, "Environment Light Sensor425: ${if (!current) "ON" else "OFF"}")
}

// v425: Error Auto Retry425
internal fun PlayerActivity.showV425ErrorAutoRetry425Toggle() {
    val current = BiliClient.prefs.v425errorAutoRetry425
    BiliClient.prefs.v425errorAutoRetry425 = !current
    AppToast.show(this, "Error Auto Retry425: ${if (!current) "ON" else "OFF"}")
}

// v425: Error Report Auto425
internal fun PlayerActivity.showV425ErrorReportAuto425Toggle() {
    val current = BiliClient.prefs.v425errorReportAuto425
    BiliClient.prefs.v425errorReportAuto425 = !current
    AppToast.show(this, "Error Report Auto425: ${if (!current) "ON" else "OFF"}")
}

// v425: Event Auto Notify425
internal fun PlayerActivity.showV425EventAutoNotify425Toggle() {
    val current = BiliClient.prefs.v425eventAutoNotify425
    BiliClient.prefs.v425eventAutoNotify425 = !current
    AppToast.show(this, "Event Auto Notify425: ${if (!current) "ON" else "OFF"}")
}

// v425: Exit Confirmation425
internal fun PlayerActivity.showV425ExitConfirmation425Toggle() {
    val current = BiliClient.prefs.v425exitConfirmation425
    BiliClient.prefs.v425exitConfirmation425 = !current
    AppToast.show(this, "Exit Confirmation425: ${if (!current) "ON" else "OFF"}")
}

// v425: Expand On Double Tap425
internal fun PlayerActivity.showV425ExpandOnDoubleTap425Toggle() {
    val current = BiliClient.prefs.v425expandOnDoubleTap425
    BiliClient.prefs.v425expandOnDoubleTap425 = !current
    AppToast.show(this, "Expand On Double Tap425: ${if (!current) "ON" else "OFF"}")
}

// v425: Export Format Default425
internal fun PlayerActivity.showV425ExportFormatDefault425Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v425exportFormatDefault425).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default425",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v425exportFormatDefault425 = value
        AppToast.show(this, "Export Format Default425: $value")
    }
}

// v425: Extract Audio Auto425
internal fun PlayerActivity.showV425ExtractAudioAuto425Toggle() {
    val current = BiliClient.prefs.v425extractAudioAuto425
    BiliClient.prefs.v425extractAudioAuto425 = !current
    AppToast.show(this, "Extract Audio Auto425: ${if (!current) "ON" else "OFF"}")
}

// v425: Fade Transition425
internal fun PlayerActivity.showV425FadeTransition425Toggle() {
    val current = BiliClient.prefs.v425fadeTransition425
    BiliClient.prefs.v425fadeTransition425 = !current
    AppToast.show(this, "Fade Transition425: ${if (!current) "ON" else "OFF"}")
}

// v425: Feed Auto Refresh425
internal fun PlayerActivity.showV425FeedAutoRefresh425Toggle() {
    val current = BiliClient.prefs.v425feedAutoRefresh425
    BiliClient.prefs.v425feedAutoRefresh425 = !current
    AppToast.show(this, "Feed Auto Refresh425: ${if (!current) "ON" else "OFF"}")
}

// v425: Feed Layout Style425
internal fun PlayerActivity.showV425FeedLayoutStyle425Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v425feedLayoutStyle425).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style425",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v425feedLayoutStyle425 = value
        AppToast.show(this, "Feed Layout Style425: $value")
    }
}

// v425: File Auto Organize425
internal fun PlayerActivity.showV425FileAutoOrganize425Toggle() {
    val current = BiliClient.prefs.v425fileAutoOrganize425
    BiliClient.prefs.v425fileAutoOrganize425 = !current
    AppToast.show(this, "File Auto Organize425: ${if (!current) "ON" else "OFF"}")
}

// v425: Find In Page Highlight425
internal fun PlayerActivity.showV425FindInPageHighlight425Toggle() {
    val current = BiliClient.prefs.v425findInPageHighlight425
    BiliClient.prefs.v425findInPageHighlight425 = !current
    AppToast.show(this, "Find In Page Highlight425: ${if (!current) "ON" else "OFF"}")
}

// v425: Fix Corrupt Auto425
internal fun PlayerActivity.showV425FixCorruptAuto425Toggle() {
    val current = BiliClient.prefs.v425fixCorruptAuto425
    BiliClient.prefs.v425fixCorruptAuto425 = !current
    AppToast.show(this, "Fix Corrupt Auto425: ${if (!current) "ON" else "OFF"}")
}

// v426: Enter Animation426
internal fun PlayerActivity.showV426EnterAnimation426Toggle() {
    val current = BiliClient.prefs.v426enterAnimation426
    BiliClient.prefs.v426enterAnimation426 = !current
    AppToast.show(this, "Enter Animation426: ${if (!current) "ON" else "OFF"}")
}

// v426: Environment Light Sensor426
internal fun PlayerActivity.showV426EnvironmentLightSensor426Toggle() {
    val current = BiliClient.prefs.v426environmentLightSensor426
    BiliClient.prefs.v426environmentLightSensor426 = !current
    AppToast.show(this, "Environment Light Sensor426: ${if (!current) "ON" else "OFF"}")
}

// v426: Error Auto Retry426
internal fun PlayerActivity.showV426ErrorAutoRetry426Toggle() {
    val current = BiliClient.prefs.v426errorAutoRetry426
    BiliClient.prefs.v426errorAutoRetry426 = !current
    AppToast.show(this, "Error Auto Retry426: ${if (!current) "ON" else "OFF"}")
}

// v426: Error Report Auto426
internal fun PlayerActivity.showV426ErrorReportAuto426Toggle() {
    val current = BiliClient.prefs.v426errorReportAuto426
    BiliClient.prefs.v426errorReportAuto426 = !current
    AppToast.show(this, "Error Report Auto426: ${if (!current) "ON" else "OFF"}")
}

// v426: Event Auto Notify426
internal fun PlayerActivity.showV426EventAutoNotify426Toggle() {
    val current = BiliClient.prefs.v426eventAutoNotify426
    BiliClient.prefs.v426eventAutoNotify426 = !current
    AppToast.show(this, "Event Auto Notify426: ${if (!current) "ON" else "OFF"}")
}

// v426: Exit Confirmation426
internal fun PlayerActivity.showV426ExitConfirmation426Toggle() {
    val current = BiliClient.prefs.v426exitConfirmation426
    BiliClient.prefs.v426exitConfirmation426 = !current
    AppToast.show(this, "Exit Confirmation426: ${if (!current) "ON" else "OFF"}")
}

// v426: Expand On Double Tap426
internal fun PlayerActivity.showV426ExpandOnDoubleTap426Toggle() {
    val current = BiliClient.prefs.v426expandOnDoubleTap426
    BiliClient.prefs.v426expandOnDoubleTap426 = !current
    AppToast.show(this, "Expand On Double Tap426: ${if (!current) "ON" else "OFF"}")
}

// v426: Export Format Default426
internal fun PlayerActivity.showV426ExportFormatDefault426Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v426exportFormatDefault426).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default426",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v426exportFormatDefault426 = value
        AppToast.show(this, "Export Format Default426: $value")
    }
}

// v426: Extract Audio Auto426
internal fun PlayerActivity.showV426ExtractAudioAuto426Toggle() {
    val current = BiliClient.prefs.v426extractAudioAuto426
    BiliClient.prefs.v426extractAudioAuto426 = !current
    AppToast.show(this, "Extract Audio Auto426: ${if (!current) "ON" else "OFF"}")
}

// v426: Fade Transition426
internal fun PlayerActivity.showV426FadeTransition426Toggle() {
    val current = BiliClient.prefs.v426fadeTransition426
    BiliClient.prefs.v426fadeTransition426 = !current
    AppToast.show(this, "Fade Transition426: ${if (!current) "ON" else "OFF"}")
}

// v426: Feed Auto Refresh426
internal fun PlayerActivity.showV426FeedAutoRefresh426Toggle() {
    val current = BiliClient.prefs.v426feedAutoRefresh426
    BiliClient.prefs.v426feedAutoRefresh426 = !current
    AppToast.show(this, "Feed Auto Refresh426: ${if (!current) "ON" else "OFF"}")
}

// v426: Feed Layout Style426
internal fun PlayerActivity.showV426FeedLayoutStyle426Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v426feedLayoutStyle426).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style426",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v426feedLayoutStyle426 = value
        AppToast.show(this, "Feed Layout Style426: $value")
    }
}

// v426: File Auto Organize426
internal fun PlayerActivity.showV426FileAutoOrganize426Toggle() {
    val current = BiliClient.prefs.v426fileAutoOrganize426
    BiliClient.prefs.v426fileAutoOrganize426 = !current
    AppToast.show(this, "File Auto Organize426: ${if (!current) "ON" else "OFF"}")
}

// v426: Find In Page Highlight426
internal fun PlayerActivity.showV426FindInPageHighlight426Toggle() {
    val current = BiliClient.prefs.v426findInPageHighlight426
    BiliClient.prefs.v426findInPageHighlight426 = !current
    AppToast.show(this, "Find In Page Highlight426: ${if (!current) "ON" else "OFF"}")
}

// v426: Fix Corrupt Auto426
internal fun PlayerActivity.showV426FixCorruptAuto426Toggle() {
    val current = BiliClient.prefs.v426fixCorruptAuto426
    BiliClient.prefs.v426fixCorruptAuto426 = !current
    AppToast.show(this, "Fix Corrupt Auto426: ${if (!current) "ON" else "OFF"}")
}

// v427: Enter Animation427
internal fun PlayerActivity.showV427EnterAnimation427Toggle() {
    val current = BiliClient.prefs.v427enterAnimation427
    BiliClient.prefs.v427enterAnimation427 = !current
    AppToast.show(this, "Enter Animation427: ${if (!current) "ON" else "OFF"}")
}

// v427: Environment Light Sensor427
internal fun PlayerActivity.showV427EnvironmentLightSensor427Toggle() {
    val current = BiliClient.prefs.v427environmentLightSensor427
    BiliClient.prefs.v427environmentLightSensor427 = !current
    AppToast.show(this, "Environment Light Sensor427: ${if (!current) "ON" else "OFF"}")
}

// v427: Error Auto Retry427
internal fun PlayerActivity.showV427ErrorAutoRetry427Toggle() {
    val current = BiliClient.prefs.v427errorAutoRetry427
    BiliClient.prefs.v427errorAutoRetry427 = !current
    AppToast.show(this, "Error Auto Retry427: ${if (!current) "ON" else "OFF"}")
}

// v427: Error Report Auto427
internal fun PlayerActivity.showV427ErrorReportAuto427Toggle() {
    val current = BiliClient.prefs.v427errorReportAuto427
    BiliClient.prefs.v427errorReportAuto427 = !current
    AppToast.show(this, "Error Report Auto427: ${if (!current) "ON" else "OFF"}")
}

// v427: Event Auto Notify427
internal fun PlayerActivity.showV427EventAutoNotify427Toggle() {
    val current = BiliClient.prefs.v427eventAutoNotify427
    BiliClient.prefs.v427eventAutoNotify427 = !current
    AppToast.show(this, "Event Auto Notify427: ${if (!current) "ON" else "OFF"}")
}

// v427: Exit Confirmation427
internal fun PlayerActivity.showV427ExitConfirmation427Toggle() {
    val current = BiliClient.prefs.v427exitConfirmation427
    BiliClient.prefs.v427exitConfirmation427 = !current
    AppToast.show(this, "Exit Confirmation427: ${if (!current) "ON" else "OFF"}")
}

// v427: Expand On Double Tap427
internal fun PlayerActivity.showV427ExpandOnDoubleTap427Toggle() {
    val current = BiliClient.prefs.v427expandOnDoubleTap427
    BiliClient.prefs.v427expandOnDoubleTap427 = !current
    AppToast.show(this, "Expand On Double Tap427: ${if (!current) "ON" else "OFF"}")
}

// v427: Export Format Default427
internal fun PlayerActivity.showV427ExportFormatDefault427Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v427exportFormatDefault427).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default427",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v427exportFormatDefault427 = value
        AppToast.show(this, "Export Format Default427: $value")
    }
}

// v427: Extract Audio Auto427
internal fun PlayerActivity.showV427ExtractAudioAuto427Toggle() {
    val current = BiliClient.prefs.v427extractAudioAuto427
    BiliClient.prefs.v427extractAudioAuto427 = !current
    AppToast.show(this, "Extract Audio Auto427: ${if (!current) "ON" else "OFF"}")
}

// v427: Fade Transition427
internal fun PlayerActivity.showV427FadeTransition427Toggle() {
    val current = BiliClient.prefs.v427fadeTransition427
    BiliClient.prefs.v427fadeTransition427 = !current
    AppToast.show(this, "Fade Transition427: ${if (!current) "ON" else "OFF"}")
}

// v427: Feed Auto Refresh427
internal fun PlayerActivity.showV427FeedAutoRefresh427Toggle() {
    val current = BiliClient.prefs.v427feedAutoRefresh427
    BiliClient.prefs.v427feedAutoRefresh427 = !current
    AppToast.show(this, "Feed Auto Refresh427: ${if (!current) "ON" else "OFF"}")
}

// v427: Feed Layout Style427
internal fun PlayerActivity.showV427FeedLayoutStyle427Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v427feedLayoutStyle427).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style427",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v427feedLayoutStyle427 = value
        AppToast.show(this, "Feed Layout Style427: $value")
    }
}

// v427: File Auto Organize427
internal fun PlayerActivity.showV427FileAutoOrganize427Toggle() {
    val current = BiliClient.prefs.v427fileAutoOrganize427
    BiliClient.prefs.v427fileAutoOrganize427 = !current
    AppToast.show(this, "File Auto Organize427: ${if (!current) "ON" else "OFF"}")
}

// v427: Find In Page Highlight427
internal fun PlayerActivity.showV427FindInPageHighlight427Toggle() {
    val current = BiliClient.prefs.v427findInPageHighlight427
    BiliClient.prefs.v427findInPageHighlight427 = !current
    AppToast.show(this, "Find In Page Highlight427: ${if (!current) "ON" else "OFF"}")
}

// v427: Fix Corrupt Auto427
internal fun PlayerActivity.showV427FixCorruptAuto427Toggle() {
    val current = BiliClient.prefs.v427fixCorruptAuto427
    BiliClient.prefs.v427fixCorruptAuto427 = !current
    AppToast.show(this, "Fix Corrupt Auto427: ${if (!current) "ON" else "OFF"}")
}

// v428: Enter Animation428
internal fun PlayerActivity.showV428EnterAnimation428Toggle() {
    val current = BiliClient.prefs.v428enterAnimation428
    BiliClient.prefs.v428enterAnimation428 = !current
    AppToast.show(this, "Enter Animation428: ${if (!current) "ON" else "OFF"}")
}

// v428: Environment Light Sensor428
internal fun PlayerActivity.showV428EnvironmentLightSensor428Toggle() {
    val current = BiliClient.prefs.v428environmentLightSensor428
    BiliClient.prefs.v428environmentLightSensor428 = !current
    AppToast.show(this, "Environment Light Sensor428: ${if (!current) "ON" else "OFF"}")
}

// v428: Error Auto Retry428
internal fun PlayerActivity.showV428ErrorAutoRetry428Toggle() {
    val current = BiliClient.prefs.v428errorAutoRetry428
    BiliClient.prefs.v428errorAutoRetry428 = !current
    AppToast.show(this, "Error Auto Retry428: ${if (!current) "ON" else "OFF"}")
}

// v428: Error Report Auto428
internal fun PlayerActivity.showV428ErrorReportAuto428Toggle() {
    val current = BiliClient.prefs.v428errorReportAuto428
    BiliClient.prefs.v428errorReportAuto428 = !current
    AppToast.show(this, "Error Report Auto428: ${if (!current) "ON" else "OFF"}")
}

// v428: Event Auto Notify428
internal fun PlayerActivity.showV428EventAutoNotify428Toggle() {
    val current = BiliClient.prefs.v428eventAutoNotify428
    BiliClient.prefs.v428eventAutoNotify428 = !current
    AppToast.show(this, "Event Auto Notify428: ${if (!current) "ON" else "OFF"}")
}

// v428: Exit Confirmation428
internal fun PlayerActivity.showV428ExitConfirmation428Toggle() {
    val current = BiliClient.prefs.v428exitConfirmation428
    BiliClient.prefs.v428exitConfirmation428 = !current
    AppToast.show(this, "Exit Confirmation428: ${if (!current) "ON" else "OFF"}")
}

// v428: Expand On Double Tap428
internal fun PlayerActivity.showV428ExpandOnDoubleTap428Toggle() {
    val current = BiliClient.prefs.v428expandOnDoubleTap428
    BiliClient.prefs.v428expandOnDoubleTap428 = !current
    AppToast.show(this, "Expand On Double Tap428: ${if (!current) "ON" else "OFF"}")
}

// v428: Export Format Default428
internal fun PlayerActivity.showV428ExportFormatDefault428Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v428exportFormatDefault428).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default428",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v428exportFormatDefault428 = value
        AppToast.show(this, "Export Format Default428: $value")
    }
}

// v428: Extract Audio Auto428
internal fun PlayerActivity.showV428ExtractAudioAuto428Toggle() {
    val current = BiliClient.prefs.v428extractAudioAuto428
    BiliClient.prefs.v428extractAudioAuto428 = !current
    AppToast.show(this, "Extract Audio Auto428: ${if (!current) "ON" else "OFF"}")
}

// v428: Fade Transition428
internal fun PlayerActivity.showV428FadeTransition428Toggle() {
    val current = BiliClient.prefs.v428fadeTransition428
    BiliClient.prefs.v428fadeTransition428 = !current
    AppToast.show(this, "Fade Transition428: ${if (!current) "ON" else "OFF"}")
}

// v428: Feed Auto Refresh428
internal fun PlayerActivity.showV428FeedAutoRefresh428Toggle() {
    val current = BiliClient.prefs.v428feedAutoRefresh428
    BiliClient.prefs.v428feedAutoRefresh428 = !current
    AppToast.show(this, "Feed Auto Refresh428: ${if (!current) "ON" else "OFF"}")
}

// v428: Feed Layout Style428
internal fun PlayerActivity.showV428FeedLayoutStyle428Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v428feedLayoutStyle428).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style428",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v428feedLayoutStyle428 = value
        AppToast.show(this, "Feed Layout Style428: $value")
    }
}

// v428: File Auto Organize428
internal fun PlayerActivity.showV428FileAutoOrganize428Toggle() {
    val current = BiliClient.prefs.v428fileAutoOrganize428
    BiliClient.prefs.v428fileAutoOrganize428 = !current
    AppToast.show(this, "File Auto Organize428: ${if (!current) "ON" else "OFF"}")
}

// v428: Find In Page Highlight428
internal fun PlayerActivity.showV428FindInPageHighlight428Toggle() {
    val current = BiliClient.prefs.v428findInPageHighlight428
    BiliClient.prefs.v428findInPageHighlight428 = !current
    AppToast.show(this, "Find In Page Highlight428: ${if (!current) "ON" else "OFF"}")
}

// v428: Fix Corrupt Auto428
internal fun PlayerActivity.showV428FixCorruptAuto428Toggle() {
    val current = BiliClient.prefs.v428fixCorruptAuto428
    BiliClient.prefs.v428fixCorruptAuto428 = !current
    AppToast.show(this, "Fix Corrupt Auto428: ${if (!current) "ON" else "OFF"}")
}

// v429: Enter Animation429
internal fun PlayerActivity.showV429EnterAnimation429Toggle() {
    val current = BiliClient.prefs.v429enterAnimation429
    BiliClient.prefs.v429enterAnimation429 = !current
    AppToast.show(this, "Enter Animation429: ${if (!current) "ON" else "OFF"}")
}

// v429: Environment Light Sensor429
internal fun PlayerActivity.showV429EnvironmentLightSensor429Toggle() {
    val current = BiliClient.prefs.v429environmentLightSensor429
    BiliClient.prefs.v429environmentLightSensor429 = !current
    AppToast.show(this, "Environment Light Sensor429: ${if (!current) "ON" else "OFF"}")
}

// v429: Error Auto Retry429
internal fun PlayerActivity.showV429ErrorAutoRetry429Toggle() {
    val current = BiliClient.prefs.v429errorAutoRetry429
    BiliClient.prefs.v429errorAutoRetry429 = !current
    AppToast.show(this, "Error Auto Retry429: ${if (!current) "ON" else "OFF"}")
}

// v429: Error Report Auto429
internal fun PlayerActivity.showV429ErrorReportAuto429Toggle() {
    val current = BiliClient.prefs.v429errorReportAuto429
    BiliClient.prefs.v429errorReportAuto429 = !current
    AppToast.show(this, "Error Report Auto429: ${if (!current) "ON" else "OFF"}")
}

// v429: Event Auto Notify429
internal fun PlayerActivity.showV429EventAutoNotify429Toggle() {
    val current = BiliClient.prefs.v429eventAutoNotify429
    BiliClient.prefs.v429eventAutoNotify429 = !current
    AppToast.show(this, "Event Auto Notify429: ${if (!current) "ON" else "OFF"}")
}

// v429: Exit Confirmation429
internal fun PlayerActivity.showV429ExitConfirmation429Toggle() {
    val current = BiliClient.prefs.v429exitConfirmation429
    BiliClient.prefs.v429exitConfirmation429 = !current
    AppToast.show(this, "Exit Confirmation429: ${if (!current) "ON" else "OFF"}")
}

// v429: Expand On Double Tap429
internal fun PlayerActivity.showV429ExpandOnDoubleTap429Toggle() {
    val current = BiliClient.prefs.v429expandOnDoubleTap429
    BiliClient.prefs.v429expandOnDoubleTap429 = !current
    AppToast.show(this, "Expand On Double Tap429: ${if (!current) "ON" else "OFF"}")
}

// v429: Export Format Default429
internal fun PlayerActivity.showV429ExportFormatDefault429Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v429exportFormatDefault429).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default429",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v429exportFormatDefault429 = value
        AppToast.show(this, "Export Format Default429: $value")
    }
}

// v429: Extract Audio Auto429
internal fun PlayerActivity.showV429ExtractAudioAuto429Toggle() {
    val current = BiliClient.prefs.v429extractAudioAuto429
    BiliClient.prefs.v429extractAudioAuto429 = !current
    AppToast.show(this, "Extract Audio Auto429: ${if (!current) "ON" else "OFF"}")
}

// v429: Fade Transition429
internal fun PlayerActivity.showV429FadeTransition429Toggle() {
    val current = BiliClient.prefs.v429fadeTransition429
    BiliClient.prefs.v429fadeTransition429 = !current
    AppToast.show(this, "Fade Transition429: ${if (!current) "ON" else "OFF"}")
}

// v429: Feed Auto Refresh429
internal fun PlayerActivity.showV429FeedAutoRefresh429Toggle() {
    val current = BiliClient.prefs.v429feedAutoRefresh429
    BiliClient.prefs.v429feedAutoRefresh429 = !current
    AppToast.show(this, "Feed Auto Refresh429: ${if (!current) "ON" else "OFF"}")
}

// v429: Feed Layout Style429
internal fun PlayerActivity.showV429FeedLayoutStyle429Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v429feedLayoutStyle429).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style429",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v429feedLayoutStyle429 = value
        AppToast.show(this, "Feed Layout Style429: $value")
    }
}

// v429: File Auto Organize429
internal fun PlayerActivity.showV429FileAutoOrganize429Toggle() {
    val current = BiliClient.prefs.v429fileAutoOrganize429
    BiliClient.prefs.v429fileAutoOrganize429 = !current
    AppToast.show(this, "File Auto Organize429: ${if (!current) "ON" else "OFF"}")
}

// v429: Find In Page Highlight429
internal fun PlayerActivity.showV429FindInPageHighlight429Toggle() {
    val current = BiliClient.prefs.v429findInPageHighlight429
    BiliClient.prefs.v429findInPageHighlight429 = !current
    AppToast.show(this, "Find In Page Highlight429: ${if (!current) "ON" else "OFF"}")
}

// v429: Fix Corrupt Auto429
internal fun PlayerActivity.showV429FixCorruptAuto429Toggle() {
    val current = BiliClient.prefs.v429fixCorruptAuto429
    BiliClient.prefs.v429fixCorruptAuto429 = !current
    AppToast.show(this, "Fix Corrupt Auto429: ${if (!current) "ON" else "OFF"}")
}

// v430: Enter Animation430
internal fun PlayerActivity.showV430EnterAnimation430Toggle() {
    val current = BiliClient.prefs.v430enterAnimation430
    BiliClient.prefs.v430enterAnimation430 = !current
    AppToast.show(this, "Enter Animation430: ${if (!current) "ON" else "OFF"}")
}

// v430: Environment Light Sensor430
internal fun PlayerActivity.showV430EnvironmentLightSensor430Toggle() {
    val current = BiliClient.prefs.v430environmentLightSensor430
    BiliClient.prefs.v430environmentLightSensor430 = !current
    AppToast.show(this, "Environment Light Sensor430: ${if (!current) "ON" else "OFF"}")
}

// v430: Error Auto Retry430
internal fun PlayerActivity.showV430ErrorAutoRetry430Toggle() {
    val current = BiliClient.prefs.v430errorAutoRetry430
    BiliClient.prefs.v430errorAutoRetry430 = !current
    AppToast.show(this, "Error Auto Retry430: ${if (!current) "ON" else "OFF"}")
}

// v430: Error Report Auto430
internal fun PlayerActivity.showV430ErrorReportAuto430Toggle() {
    val current = BiliClient.prefs.v430errorReportAuto430
    BiliClient.prefs.v430errorReportAuto430 = !current
    AppToast.show(this, "Error Report Auto430: ${if (!current) "ON" else "OFF"}")
}

// v430: Event Auto Notify430
internal fun PlayerActivity.showV430EventAutoNotify430Toggle() {
    val current = BiliClient.prefs.v430eventAutoNotify430
    BiliClient.prefs.v430eventAutoNotify430 = !current
    AppToast.show(this, "Event Auto Notify430: ${if (!current) "ON" else "OFF"}")
}

// v430: Exit Confirmation430
internal fun PlayerActivity.showV430ExitConfirmation430Toggle() {
    val current = BiliClient.prefs.v430exitConfirmation430
    BiliClient.prefs.v430exitConfirmation430 = !current
    AppToast.show(this, "Exit Confirmation430: ${if (!current) "ON" else "OFF"}")
}

// v430: Expand On Double Tap430
internal fun PlayerActivity.showV430ExpandOnDoubleTap430Toggle() {
    val current = BiliClient.prefs.v430expandOnDoubleTap430
    BiliClient.prefs.v430expandOnDoubleTap430 = !current
    AppToast.show(this, "Expand On Double Tap430: ${if (!current) "ON" else "OFF"}")
}

// v430: Export Format Default430
internal fun PlayerActivity.showV430ExportFormatDefault430Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v430exportFormatDefault430).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Export Format Default430",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v430exportFormatDefault430 = value
        AppToast.show(this, "Export Format Default430: $value")
    }
}

// v430: Extract Audio Auto430
internal fun PlayerActivity.showV430ExtractAudioAuto430Toggle() {
    val current = BiliClient.prefs.v430extractAudioAuto430
    BiliClient.prefs.v430extractAudioAuto430 = !current
    AppToast.show(this, "Extract Audio Auto430: ${if (!current) "ON" else "OFF"}")
}

// v430: Fade Transition430
internal fun PlayerActivity.showV430FadeTransition430Toggle() {
    val current = BiliClient.prefs.v430fadeTransition430
    BiliClient.prefs.v430fadeTransition430 = !current
    AppToast.show(this, "Fade Transition430: ${if (!current) "ON" else "OFF"}")
}

// v430: Feed Auto Refresh430
internal fun PlayerActivity.showV430FeedAutoRefresh430Toggle() {
    val current = BiliClient.prefs.v430feedAutoRefresh430
    BiliClient.prefs.v430feedAutoRefresh430 = !current
    AppToast.show(this, "Feed Auto Refresh430: ${if (!current) "ON" else "OFF"}")
}

// v430: Feed Layout Style430
internal fun PlayerActivity.showV430FeedLayoutStyle430Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v430feedLayoutStyle430).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Feed Layout Style430",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v430feedLayoutStyle430 = value
        AppToast.show(this, "Feed Layout Style430: $value")
    }
}

// v430: File Auto Organize430
internal fun PlayerActivity.showV430FileAutoOrganize430Toggle() {
    val current = BiliClient.prefs.v430fileAutoOrganize430
    BiliClient.prefs.v430fileAutoOrganize430 = !current
    AppToast.show(this, "File Auto Organize430: ${if (!current) "ON" else "OFF"}")
}

// v430: Find In Page Highlight430
internal fun PlayerActivity.showV430FindInPageHighlight430Toggle() {
    val current = BiliClient.prefs.v430findInPageHighlight430
    BiliClient.prefs.v430findInPageHighlight430 = !current
    AppToast.show(this, "Find In Page Highlight430: ${if (!current) "ON" else "OFF"}")
}

// v430: Fix Corrupt Auto430
internal fun PlayerActivity.showV430FixCorruptAuto430Toggle() {
    val current = BiliClient.prefs.v430fixCorruptAuto430
    BiliClient.prefs.v430fixCorruptAuto430 = !current
    AppToast.show(this, "Fix Corrupt Auto430: ${if (!current) "ON" else "OFF"}")
}

// v431: Flash Screen On Notify431
internal fun PlayerActivity.showV431FlashScreenOnNotify431Toggle() {
    val current = BiliClient.prefs.v431flashScreenOnNotify431
    BiliClient.prefs.v431flashScreenOnNotify431 = !current
    AppToast.show(this, "Flash Screen On Notify431: ${if (!current) "ON" else "OFF"}")
}

// v431: Flex Layout Enabled431
internal fun PlayerActivity.showV431FlexLayoutEnabled431Toggle() {
    val current = BiliClient.prefs.v431flexLayoutEnabled431
    BiliClient.prefs.v431flexLayoutEnabled431 = !current
    AppToast.show(this, "Flex Layout Enabled431: ${if (!current) "ON" else "OFF"}")
}

// v431: Flip Gesture Enabled431
internal fun PlayerActivity.showV431FlipGestureEnabled431Toggle() {
    val current = BiliClient.prefs.v431flipGestureEnabled431
    BiliClient.prefs.v431flipGestureEnabled431 = !current
    AppToast.show(this, "Flip Gesture Enabled431: ${if (!current) "ON" else "OFF"}")
}

// v431: Flow Auto Redirect431
internal fun PlayerActivity.showV431FlowAutoRedirect431Toggle() {
    val current = BiliClient.prefs.v431flowAutoRedirect431
    BiliClient.prefs.v431flowAutoRedirect431 = !current
    AppToast.show(this, "Flow Auto Redirect431: ${if (!current) "ON" else "OFF"}")
}

// v431: Fly Mode Speed431
internal fun PlayerActivity.showV431FlyModeSpeed431Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v431flyModeSpeed431).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed431",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v431flyModeSpeed431 = value
        AppToast.show(this, "Fly Mode Speed431: $value")
    }
}

// v431: Focus Auto Enhance431
internal fun PlayerActivity.showV431FocusAutoEnhance431Toggle() {
    val current = BiliClient.prefs.v431focusAutoEnhance431
    BiliClient.prefs.v431focusAutoEnhance431 = !current
    AppToast.show(this, "Focus Auto Enhance431: ${if (!current) "ON" else "OFF"}")
}

// v431: Follow Auto Subscribe431
internal fun PlayerActivity.showV431FollowAutoSubscribe431Toggle() {
    val current = BiliClient.prefs.v431followAutoSubscribe431
    BiliClient.prefs.v431followAutoSubscribe431 = !current
    AppToast.show(this, "Follow Auto Subscribe431: ${if (!current) "ON" else "OFF"}")
}

// v431: Force Decode HW431
internal fun PlayerActivity.showV431ForceDecodeHw431Toggle() {
    val current = BiliClient.prefs.v431forceDecodeHw431
    BiliClient.prefs.v431forceDecodeHw431 = !current
    AppToast.show(this, "Force Decode HW431: ${if (!current) "ON" else "OFF"}")
}

// v431: Format Auto Convert431
internal fun PlayerActivity.showV431FormatAutoConvert431Toggle() {
    val current = BiliClient.prefs.v431formatAutoConvert431
    BiliClient.prefs.v431formatAutoConvert431 = !current
    AppToast.show(this, "Format Auto Convert431: ${if (!current) "ON" else "OFF"}")
}

// v431: Frame Interpolation431
internal fun PlayerActivity.showV431FrameInterpolation431Toggle() {
    val current = BiliClient.prefs.v431frameInterpolation431
    BiliClient.prefs.v431frameInterpolation431 = !current
    AppToast.show(this, "Frame Interpolation431: ${if (!current) "ON" else "OFF"}")
}

// v431: Free Memory Auto431
internal fun PlayerActivity.showV431FreeMemoryAuto431Toggle() {
    val current = BiliClient.prefs.v431freeMemoryAuto431
    BiliClient.prefs.v431freeMemoryAuto431 = !current
    AppToast.show(this, "Free Memory Auto431: ${if (!current) "ON" else "OFF"}")
}

// v431: Freeze On Buffering431
internal fun PlayerActivity.showV431FreezeOnBuffering431Toggle() {
    val current = BiliClient.prefs.v431freezeOnBuffering431
    BiliClient.prefs.v431freezeOnBuffering431 = !current
    AppToast.show(this, "Freeze On Buffering431: ${if (!current) "ON" else "OFF"}")
}

// v431: Fullscreen Auto Rotate431
internal fun PlayerActivity.showV431FullscreenAutoRotate431Toggle() {
    val current = BiliClient.prefs.v431fullscreenAutoRotate431
    BiliClient.prefs.v431fullscreenAutoRotate431 = !current
    AppToast.show(this, "Fullscreen Auto Rotate431: ${if (!current) "ON" else "OFF"}")
}

// v431: Gain Auto Balance431
internal fun PlayerActivity.showV431GainAutoBalance431Toggle() {
    val current = BiliClient.prefs.v431gainAutoBalance431
    BiliClient.prefs.v431gainAutoBalance431 = !current
    AppToast.show(this, "Gain Auto Balance431: ${if (!current) "ON" else "OFF"}")
}

// v431: Gallery Auto Layout431
internal fun PlayerActivity.showV431GalleryAutoLayout431Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v431galleryAutoLayout431).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout431",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v431galleryAutoLayout431 = value
        AppToast.show(this, "Gallery Auto Layout431: $value")
    }
}

// v432: Flash Screen On Notify432
internal fun PlayerActivity.showV432FlashScreenOnNotify432Toggle() {
    val current = BiliClient.prefs.v432flashScreenOnNotify432
    BiliClient.prefs.v432flashScreenOnNotify432 = !current
    AppToast.show(this, "Flash Screen On Notify432: ${if (!current) "ON" else "OFF"}")
}

// v432: Flex Layout Enabled432
internal fun PlayerActivity.showV432FlexLayoutEnabled432Toggle() {
    val current = BiliClient.prefs.v432flexLayoutEnabled432
    BiliClient.prefs.v432flexLayoutEnabled432 = !current
    AppToast.show(this, "Flex Layout Enabled432: ${if (!current) "ON" else "OFF"}")
}

// v432: Flip Gesture Enabled432
internal fun PlayerActivity.showV432FlipGestureEnabled432Toggle() {
    val current = BiliClient.prefs.v432flipGestureEnabled432
    BiliClient.prefs.v432flipGestureEnabled432 = !current
    AppToast.show(this, "Flip Gesture Enabled432: ${if (!current) "ON" else "OFF"}")
}

// v432: Flow Auto Redirect432
internal fun PlayerActivity.showV432FlowAutoRedirect432Toggle() {
    val current = BiliClient.prefs.v432flowAutoRedirect432
    BiliClient.prefs.v432flowAutoRedirect432 = !current
    AppToast.show(this, "Flow Auto Redirect432: ${if (!current) "ON" else "OFF"}")
}

// v432: Fly Mode Speed432
internal fun PlayerActivity.showV432FlyModeSpeed432Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v432flyModeSpeed432).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed432",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v432flyModeSpeed432 = value
        AppToast.show(this, "Fly Mode Speed432: $value")
    }
}

// v432: Focus Auto Enhance432
internal fun PlayerActivity.showV432FocusAutoEnhance432Toggle() {
    val current = BiliClient.prefs.v432focusAutoEnhance432
    BiliClient.prefs.v432focusAutoEnhance432 = !current
    AppToast.show(this, "Focus Auto Enhance432: ${if (!current) "ON" else "OFF"}")
}

// v432: Follow Auto Subscribe432
internal fun PlayerActivity.showV432FollowAutoSubscribe432Toggle() {
    val current = BiliClient.prefs.v432followAutoSubscribe432
    BiliClient.prefs.v432followAutoSubscribe432 = !current
    AppToast.show(this, "Follow Auto Subscribe432: ${if (!current) "ON" else "OFF"}")
}

// v432: Force Decode HW432
internal fun PlayerActivity.showV432ForceDecodeHw432Toggle() {
    val current = BiliClient.prefs.v432forceDecodeHw432
    BiliClient.prefs.v432forceDecodeHw432 = !current
    AppToast.show(this, "Force Decode HW432: ${if (!current) "ON" else "OFF"}")
}

// v432: Format Auto Convert432
internal fun PlayerActivity.showV432FormatAutoConvert432Toggle() {
    val current = BiliClient.prefs.v432formatAutoConvert432
    BiliClient.prefs.v432formatAutoConvert432 = !current
    AppToast.show(this, "Format Auto Convert432: ${if (!current) "ON" else "OFF"}")
}

// v432: Frame Interpolation432
internal fun PlayerActivity.showV432FrameInterpolation432Toggle() {
    val current = BiliClient.prefs.v432frameInterpolation432
    BiliClient.prefs.v432frameInterpolation432 = !current
    AppToast.show(this, "Frame Interpolation432: ${if (!current) "ON" else "OFF"}")
}

// v432: Free Memory Auto432
internal fun PlayerActivity.showV432FreeMemoryAuto432Toggle() {
    val current = BiliClient.prefs.v432freeMemoryAuto432
    BiliClient.prefs.v432freeMemoryAuto432 = !current
    AppToast.show(this, "Free Memory Auto432: ${if (!current) "ON" else "OFF"}")
}

// v432: Freeze On Buffering432
internal fun PlayerActivity.showV432FreezeOnBuffering432Toggle() {
    val current = BiliClient.prefs.v432freezeOnBuffering432
    BiliClient.prefs.v432freezeOnBuffering432 = !current
    AppToast.show(this, "Freeze On Buffering432: ${if (!current) "ON" else "OFF"}")
}

// v432: Fullscreen Auto Rotate432
internal fun PlayerActivity.showV432FullscreenAutoRotate432Toggle() {
    val current = BiliClient.prefs.v432fullscreenAutoRotate432
    BiliClient.prefs.v432fullscreenAutoRotate432 = !current
    AppToast.show(this, "Fullscreen Auto Rotate432: ${if (!current) "ON" else "OFF"}")
}

// v432: Gain Auto Balance432
internal fun PlayerActivity.showV432GainAutoBalance432Toggle() {
    val current = BiliClient.prefs.v432gainAutoBalance432
    BiliClient.prefs.v432gainAutoBalance432 = !current
    AppToast.show(this, "Gain Auto Balance432: ${if (!current) "ON" else "OFF"}")
}

// v432: Gallery Auto Layout432
internal fun PlayerActivity.showV432GalleryAutoLayout432Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v432galleryAutoLayout432).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout432",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v432galleryAutoLayout432 = value
        AppToast.show(this, "Gallery Auto Layout432: $value")
    }
}

// v433: Flash Screen On Notify433
internal fun PlayerActivity.showV433FlashScreenOnNotify433Toggle() {
    val current = BiliClient.prefs.v433flashScreenOnNotify433
    BiliClient.prefs.v433flashScreenOnNotify433 = !current
    AppToast.show(this, "Flash Screen On Notify433: ${if (!current) "ON" else "OFF"}")
}

// v433: Flex Layout Enabled433
internal fun PlayerActivity.showV433FlexLayoutEnabled433Toggle() {
    val current = BiliClient.prefs.v433flexLayoutEnabled433
    BiliClient.prefs.v433flexLayoutEnabled433 = !current
    AppToast.show(this, "Flex Layout Enabled433: ${if (!current) "ON" else "OFF"}")
}

// v433: Flip Gesture Enabled433
internal fun PlayerActivity.showV433FlipGestureEnabled433Toggle() {
    val current = BiliClient.prefs.v433flipGestureEnabled433
    BiliClient.prefs.v433flipGestureEnabled433 = !current
    AppToast.show(this, "Flip Gesture Enabled433: ${if (!current) "ON" else "OFF"}")
}

// v433: Flow Auto Redirect433
internal fun PlayerActivity.showV433FlowAutoRedirect433Toggle() {
    val current = BiliClient.prefs.v433flowAutoRedirect433
    BiliClient.prefs.v433flowAutoRedirect433 = !current
    AppToast.show(this, "Flow Auto Redirect433: ${if (!current) "ON" else "OFF"}")
}

// v433: Fly Mode Speed433
internal fun PlayerActivity.showV433FlyModeSpeed433Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v433flyModeSpeed433).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed433",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v433flyModeSpeed433 = value
        AppToast.show(this, "Fly Mode Speed433: $value")
    }
}

// v433: Focus Auto Enhance433
internal fun PlayerActivity.showV433FocusAutoEnhance433Toggle() {
    val current = BiliClient.prefs.v433focusAutoEnhance433
    BiliClient.prefs.v433focusAutoEnhance433 = !current
    AppToast.show(this, "Focus Auto Enhance433: ${if (!current) "ON" else "OFF"}")
}

// v433: Follow Auto Subscribe433
internal fun PlayerActivity.showV433FollowAutoSubscribe433Toggle() {
    val current = BiliClient.prefs.v433followAutoSubscribe433
    BiliClient.prefs.v433followAutoSubscribe433 = !current
    AppToast.show(this, "Follow Auto Subscribe433: ${if (!current) "ON" else "OFF"}")
}

// v433: Force Decode HW433
internal fun PlayerActivity.showV433ForceDecodeHw433Toggle() {
    val current = BiliClient.prefs.v433forceDecodeHw433
    BiliClient.prefs.v433forceDecodeHw433 = !current
    AppToast.show(this, "Force Decode HW433: ${if (!current) "ON" else "OFF"}")
}

// v433: Format Auto Convert433
internal fun PlayerActivity.showV433FormatAutoConvert433Toggle() {
    val current = BiliClient.prefs.v433formatAutoConvert433
    BiliClient.prefs.v433formatAutoConvert433 = !current
    AppToast.show(this, "Format Auto Convert433: ${if (!current) "ON" else "OFF"}")
}

// v433: Frame Interpolation433
internal fun PlayerActivity.showV433FrameInterpolation433Toggle() {
    val current = BiliClient.prefs.v433frameInterpolation433
    BiliClient.prefs.v433frameInterpolation433 = !current
    AppToast.show(this, "Frame Interpolation433: ${if (!current) "ON" else "OFF"}")
}

// v433: Free Memory Auto433
internal fun PlayerActivity.showV433FreeMemoryAuto433Toggle() {
    val current = BiliClient.prefs.v433freeMemoryAuto433
    BiliClient.prefs.v433freeMemoryAuto433 = !current
    AppToast.show(this, "Free Memory Auto433: ${if (!current) "ON" else "OFF"}")
}

// v433: Freeze On Buffering433
internal fun PlayerActivity.showV433FreezeOnBuffering433Toggle() {
    val current = BiliClient.prefs.v433freezeOnBuffering433
    BiliClient.prefs.v433freezeOnBuffering433 = !current
    AppToast.show(this, "Freeze On Buffering433: ${if (!current) "ON" else "OFF"}")
}

// v433: Fullscreen Auto Rotate433
internal fun PlayerActivity.showV433FullscreenAutoRotate433Toggle() {
    val current = BiliClient.prefs.v433fullscreenAutoRotate433
    BiliClient.prefs.v433fullscreenAutoRotate433 = !current
    AppToast.show(this, "Fullscreen Auto Rotate433: ${if (!current) "ON" else "OFF"}")
}

// v433: Gain Auto Balance433
internal fun PlayerActivity.showV433GainAutoBalance433Toggle() {
    val current = BiliClient.prefs.v433gainAutoBalance433
    BiliClient.prefs.v433gainAutoBalance433 = !current
    AppToast.show(this, "Gain Auto Balance433: ${if (!current) "ON" else "OFF"}")
}

// v433: Gallery Auto Layout433
internal fun PlayerActivity.showV433GalleryAutoLayout433Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v433galleryAutoLayout433).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout433",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v433galleryAutoLayout433 = value
        AppToast.show(this, "Gallery Auto Layout433: $value")
    }
}

// v434: Flash Screen On Notify434
internal fun PlayerActivity.showV434FlashScreenOnNotify434Toggle() {
    val current = BiliClient.prefs.v434flashScreenOnNotify434
    BiliClient.prefs.v434flashScreenOnNotify434 = !current
    AppToast.show(this, "Flash Screen On Notify434: ${if (!current) "ON" else "OFF"}")
}

// v434: Flex Layout Enabled434
internal fun PlayerActivity.showV434FlexLayoutEnabled434Toggle() {
    val current = BiliClient.prefs.v434flexLayoutEnabled434
    BiliClient.prefs.v434flexLayoutEnabled434 = !current
    AppToast.show(this, "Flex Layout Enabled434: ${if (!current) "ON" else "OFF"}")
}

// v434: Flip Gesture Enabled434
internal fun PlayerActivity.showV434FlipGestureEnabled434Toggle() {
    val current = BiliClient.prefs.v434flipGestureEnabled434
    BiliClient.prefs.v434flipGestureEnabled434 = !current
    AppToast.show(this, "Flip Gesture Enabled434: ${if (!current) "ON" else "OFF"}")
}

// v434: Flow Auto Redirect434
internal fun PlayerActivity.showV434FlowAutoRedirect434Toggle() {
    val current = BiliClient.prefs.v434flowAutoRedirect434
    BiliClient.prefs.v434flowAutoRedirect434 = !current
    AppToast.show(this, "Flow Auto Redirect434: ${if (!current) "ON" else "OFF"}")
}

// v434: Fly Mode Speed434
internal fun PlayerActivity.showV434FlyModeSpeed434Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v434flyModeSpeed434).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed434",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v434flyModeSpeed434 = value
        AppToast.show(this, "Fly Mode Speed434: $value")
    }
}

// v434: Focus Auto Enhance434
internal fun PlayerActivity.showV434FocusAutoEnhance434Toggle() {
    val current = BiliClient.prefs.v434focusAutoEnhance434
    BiliClient.prefs.v434focusAutoEnhance434 = !current
    AppToast.show(this, "Focus Auto Enhance434: ${if (!current) "ON" else "OFF"}")
}

// v434: Follow Auto Subscribe434
internal fun PlayerActivity.showV434FollowAutoSubscribe434Toggle() {
    val current = BiliClient.prefs.v434followAutoSubscribe434
    BiliClient.prefs.v434followAutoSubscribe434 = !current
    AppToast.show(this, "Follow Auto Subscribe434: ${if (!current) "ON" else "OFF"}")
}

// v434: Force Decode HW434
internal fun PlayerActivity.showV434ForceDecodeHw434Toggle() {
    val current = BiliClient.prefs.v434forceDecodeHw434
    BiliClient.prefs.v434forceDecodeHw434 = !current
    AppToast.show(this, "Force Decode HW434: ${if (!current) "ON" else "OFF"}")
}

// v434: Format Auto Convert434
internal fun PlayerActivity.showV434FormatAutoConvert434Toggle() {
    val current = BiliClient.prefs.v434formatAutoConvert434
    BiliClient.prefs.v434formatAutoConvert434 = !current
    AppToast.show(this, "Format Auto Convert434: ${if (!current) "ON" else "OFF"}")
}

// v434: Frame Interpolation434
internal fun PlayerActivity.showV434FrameInterpolation434Toggle() {
    val current = BiliClient.prefs.v434frameInterpolation434
    BiliClient.prefs.v434frameInterpolation434 = !current
    AppToast.show(this, "Frame Interpolation434: ${if (!current) "ON" else "OFF"}")
}

// v434: Free Memory Auto434
internal fun PlayerActivity.showV434FreeMemoryAuto434Toggle() {
    val current = BiliClient.prefs.v434freeMemoryAuto434
    BiliClient.prefs.v434freeMemoryAuto434 = !current
    AppToast.show(this, "Free Memory Auto434: ${if (!current) "ON" else "OFF"}")
}

// v434: Freeze On Buffering434
internal fun PlayerActivity.showV434FreezeOnBuffering434Toggle() {
    val current = BiliClient.prefs.v434freezeOnBuffering434
    BiliClient.prefs.v434freezeOnBuffering434 = !current
    AppToast.show(this, "Freeze On Buffering434: ${if (!current) "ON" else "OFF"}")
}

// v434: Fullscreen Auto Rotate434
internal fun PlayerActivity.showV434FullscreenAutoRotate434Toggle() {
    val current = BiliClient.prefs.v434fullscreenAutoRotate434
    BiliClient.prefs.v434fullscreenAutoRotate434 = !current
    AppToast.show(this, "Fullscreen Auto Rotate434: ${if (!current) "ON" else "OFF"}")
}

// v434: Gain Auto Balance434
internal fun PlayerActivity.showV434GainAutoBalance434Toggle() {
    val current = BiliClient.prefs.v434gainAutoBalance434
    BiliClient.prefs.v434gainAutoBalance434 = !current
    AppToast.show(this, "Gain Auto Balance434: ${if (!current) "ON" else "OFF"}")
}

// v434: Gallery Auto Layout434
internal fun PlayerActivity.showV434GalleryAutoLayout434Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v434galleryAutoLayout434).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout434",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v434galleryAutoLayout434 = value
        AppToast.show(this, "Gallery Auto Layout434: $value")
    }
}

// v435: Flash Screen On Notify435
internal fun PlayerActivity.showV435FlashScreenOnNotify435Toggle() {
    val current = BiliClient.prefs.v435flashScreenOnNotify435
    BiliClient.prefs.v435flashScreenOnNotify435 = !current
    AppToast.show(this, "Flash Screen On Notify435: ${if (!current) "ON" else "OFF"}")
}

// v435: Flex Layout Enabled435
internal fun PlayerActivity.showV435FlexLayoutEnabled435Toggle() {
    val current = BiliClient.prefs.v435flexLayoutEnabled435
    BiliClient.prefs.v435flexLayoutEnabled435 = !current
    AppToast.show(this, "Flex Layout Enabled435: ${if (!current) "ON" else "OFF"}")
}

// v435: Flip Gesture Enabled435
internal fun PlayerActivity.showV435FlipGestureEnabled435Toggle() {
    val current = BiliClient.prefs.v435flipGestureEnabled435
    BiliClient.prefs.v435flipGestureEnabled435 = !current
    AppToast.show(this, "Flip Gesture Enabled435: ${if (!current) "ON" else "OFF"}")
}

// v435: Flow Auto Redirect435
internal fun PlayerActivity.showV435FlowAutoRedirect435Toggle() {
    val current = BiliClient.prefs.v435flowAutoRedirect435
    BiliClient.prefs.v435flowAutoRedirect435 = !current
    AppToast.show(this, "Flow Auto Redirect435: ${if (!current) "ON" else "OFF"}")
}

// v435: Fly Mode Speed435
internal fun PlayerActivity.showV435FlyModeSpeed435Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v435flyModeSpeed435).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed435",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v435flyModeSpeed435 = value
        AppToast.show(this, "Fly Mode Speed435: $value")
    }
}

// v435: Focus Auto Enhance435
internal fun PlayerActivity.showV435FocusAutoEnhance435Toggle() {
    val current = BiliClient.prefs.v435focusAutoEnhance435
    BiliClient.prefs.v435focusAutoEnhance435 = !current
    AppToast.show(this, "Focus Auto Enhance435: ${if (!current) "ON" else "OFF"}")
}

// v435: Follow Auto Subscribe435
internal fun PlayerActivity.showV435FollowAutoSubscribe435Toggle() {
    val current = BiliClient.prefs.v435followAutoSubscribe435
    BiliClient.prefs.v435followAutoSubscribe435 = !current
    AppToast.show(this, "Follow Auto Subscribe435: ${if (!current) "ON" else "OFF"}")
}

// v435: Force Decode HW435
internal fun PlayerActivity.showV435ForceDecodeHw435Toggle() {
    val current = BiliClient.prefs.v435forceDecodeHw435
    BiliClient.prefs.v435forceDecodeHw435 = !current
    AppToast.show(this, "Force Decode HW435: ${if (!current) "ON" else "OFF"}")
}

// v435: Format Auto Convert435
internal fun PlayerActivity.showV435FormatAutoConvert435Toggle() {
    val current = BiliClient.prefs.v435formatAutoConvert435
    BiliClient.prefs.v435formatAutoConvert435 = !current
    AppToast.show(this, "Format Auto Convert435: ${if (!current) "ON" else "OFF"}")
}

// v435: Frame Interpolation435
internal fun PlayerActivity.showV435FrameInterpolation435Toggle() {
    val current = BiliClient.prefs.v435frameInterpolation435
    BiliClient.prefs.v435frameInterpolation435 = !current
    AppToast.show(this, "Frame Interpolation435: ${if (!current) "ON" else "OFF"}")
}

// v435: Free Memory Auto435
internal fun PlayerActivity.showV435FreeMemoryAuto435Toggle() {
    val current = BiliClient.prefs.v435freeMemoryAuto435
    BiliClient.prefs.v435freeMemoryAuto435 = !current
    AppToast.show(this, "Free Memory Auto435: ${if (!current) "ON" else "OFF"}")
}

// v435: Freeze On Buffering435
internal fun PlayerActivity.showV435FreezeOnBuffering435Toggle() {
    val current = BiliClient.prefs.v435freezeOnBuffering435
    BiliClient.prefs.v435freezeOnBuffering435 = !current
    AppToast.show(this, "Freeze On Buffering435: ${if (!current) "ON" else "OFF"}")
}

// v435: Fullscreen Auto Rotate435
internal fun PlayerActivity.showV435FullscreenAutoRotate435Toggle() {
    val current = BiliClient.prefs.v435fullscreenAutoRotate435
    BiliClient.prefs.v435fullscreenAutoRotate435 = !current
    AppToast.show(this, "Fullscreen Auto Rotate435: ${if (!current) "ON" else "OFF"}")
}

// v435: Gain Auto Balance435
internal fun PlayerActivity.showV435GainAutoBalance435Toggle() {
    val current = BiliClient.prefs.v435gainAutoBalance435
    BiliClient.prefs.v435gainAutoBalance435 = !current
    AppToast.show(this, "Gain Auto Balance435: ${if (!current) "ON" else "OFF"}")
}

// v435: Gallery Auto Layout435
internal fun PlayerActivity.showV435GalleryAutoLayout435Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v435galleryAutoLayout435).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gallery Auto Layout435",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v435galleryAutoLayout435 = value
        AppToast.show(this, "Gallery Auto Layout435: $value")
    }
}

// v436: Flash Screen On Notify436
internal fun PlayerActivity.showV436FlashScreenOnNotify436Toggle() {
    val current = BiliClient.prefs.v436flashScreenOnNotify436
    BiliClient.prefs.v436flashScreenOnNotify436 = !current
    AppToast.show(this, "Flash Screen On Notify436: ${if (!current) "ON" else "OFF"}")
}

// v436: Flex Layout Enabled436
internal fun PlayerActivity.showV436FlexLayoutEnabled436Toggle() {
    val current = BiliClient.prefs.v436flexLayoutEnabled436
    BiliClient.prefs.v436flexLayoutEnabled436 = !current
    AppToast.show(this, "Flex Layout Enabled436: ${if (!current) "ON" else "OFF"}")
}

// v436: Flip Gesture Enabled436
internal fun PlayerActivity.showV436FlipGestureEnabled436Toggle() {
    val current = BiliClient.prefs.v436flipGestureEnabled436
    BiliClient.prefs.v436flipGestureEnabled436 = !current
    AppToast.show(this, "Flip Gesture Enabled436: ${if (!current) "ON" else "OFF"}")
}

// v436: Flow Auto Redirect436
internal fun PlayerActivity.showV436FlowAutoRedirect436Toggle() {
    val current = BiliClient.prefs.v436flowAutoRedirect436
    BiliClient.prefs.v436flowAutoRedirect436 = !current
    AppToast.show(this, "Flow Auto Redirect436: ${if (!current) "ON" else "OFF"}")
}

// v436: Fly Mode Speed436
internal fun PlayerActivity.showV436FlyModeSpeed436Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v436flyModeSpeed436).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Fly Mode Speed436",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v436flyModeSpeed436 = value
        AppToast.show(this, "Fly Mode Speed436: $value")
    }
}

// v436: Focus Auto Enhance436
internal fun PlayerActivity.showV436FocusAutoEnhance436Toggle() {
    val current = BiliClient.prefs.v436focusAutoEnhance436
    BiliClient.prefs.v436focusAutoEnhance436 = !current
    AppToast.show(this, "Focus Auto Enhance436: ${if (!current) "ON" else "OFF"}")
}

// v436: Follow Auto Subscribe436
internal fun PlayerActivity.showV436FollowAutoSubscribe436Toggle() {
    val current = BiliClient.prefs.v436followAutoSubscribe436
    BiliClient.prefs.v436followAutoSubscribe436 = !current
    AppToast.show(this, "Follow Auto Subscribe436: ${if (!current) "ON" else "OFF"}")
}

// v436: Force Decode HW436
internal fun PlayerActivity.showV436ForceDecodeHw436Toggle() {
    val current = BiliClient.prefs.v436forceDecodeHw436
    BiliClient.prefs.v436forceDecodeHw436 = !current
    AppToast.show(this, "Force Decode HW436: ${if (!current) "ON" else "OFF"}")
}

