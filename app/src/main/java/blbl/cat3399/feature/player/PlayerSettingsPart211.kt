package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v2291: tested mode
internal fun PlayerActivity.showV2291TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291tested
    FeaturePrefsStore.batch2291.v2291tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2291: threatened mode
internal fun PlayerActivity.showV2291ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291threatened
    FeaturePrefsStore.batch2291.v2291threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2291: tightened mode
internal fun PlayerActivity.showV2291TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291tightened
    FeaturePrefsStore.batch2291.v2291tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2291: tolerated mode
internal fun PlayerActivity.showV2291ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291tolerated
    FeaturePrefsStore.batch2291.v2291tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2291: traced mode
internal fun PlayerActivity.showV2291TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291traced
    FeaturePrefsStore.batch2291.v2291traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2291: tracked level
internal fun PlayerActivity.showV2291TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2291tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2291tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2291: traded level
internal fun PlayerActivity.showV2291TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2291traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2291traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2291: trained level
internal fun PlayerActivity.showV2291TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2291trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2291trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2291: transferred level
internal fun PlayerActivity.showV2291TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2291transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2291transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2291: transformed level
internal fun PlayerActivity.showV2291TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2291transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2291transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2291: translated mode
internal fun PlayerActivity.showV2291TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291translated
    FeaturePrefsStore.batch2291.v2291translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2291: transmitted mode
internal fun PlayerActivity.showV2291TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291transmitted
    FeaturePrefsStore.batch2291.v2291transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2291: transported mode
internal fun PlayerActivity.showV2291TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291transported
    FeaturePrefsStore.batch2291.v2291transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2291: trapped mode
internal fun PlayerActivity.showV2291TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291trapped
    FeaturePrefsStore.batch2291.v2291trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2291: traveled mode
internal fun PlayerActivity.showV2291TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2291traveled
    FeaturePrefsStore.batch2291.v2291traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2292: tested mode
internal fun PlayerActivity.showV2292TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292tested
    FeaturePrefsStore.batch2291.v2292tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2292: threatened mode
internal fun PlayerActivity.showV2292ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292threatened
    FeaturePrefsStore.batch2291.v2292threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2292: tightened mode
internal fun PlayerActivity.showV2292TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292tightened
    FeaturePrefsStore.batch2291.v2292tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2292: tolerated mode
internal fun PlayerActivity.showV2292ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292tolerated
    FeaturePrefsStore.batch2291.v2292tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2292: traced mode
internal fun PlayerActivity.showV2292TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292traced
    FeaturePrefsStore.batch2291.v2292traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2292: tracked level
internal fun PlayerActivity.showV2292TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2292tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2292tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2292: traded level
internal fun PlayerActivity.showV2292TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2292traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2292traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2292: trained level
internal fun PlayerActivity.showV2292TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2292trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2292trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2292: transferred level
internal fun PlayerActivity.showV2292TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2292transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2292transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2292: transformed level
internal fun PlayerActivity.showV2292TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2292transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2292transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2292: translated mode
internal fun PlayerActivity.showV2292TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292translated
    FeaturePrefsStore.batch2291.v2292translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2292: transmitted mode
internal fun PlayerActivity.showV2292TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292transmitted
    FeaturePrefsStore.batch2291.v2292transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2292: transported mode
internal fun PlayerActivity.showV2292TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292transported
    FeaturePrefsStore.batch2291.v2292transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2292: trapped mode
internal fun PlayerActivity.showV2292TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292trapped
    FeaturePrefsStore.batch2291.v2292trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2292: traveled mode
internal fun PlayerActivity.showV2292TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2292traveled
    FeaturePrefsStore.batch2291.v2292traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2293: tested mode
internal fun PlayerActivity.showV2293TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293tested
    FeaturePrefsStore.batch2291.v2293tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2293: threatened mode
internal fun PlayerActivity.showV2293ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293threatened
    FeaturePrefsStore.batch2291.v2293threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2293: tightened mode
internal fun PlayerActivity.showV2293TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293tightened
    FeaturePrefsStore.batch2291.v2293tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2293: tolerated mode
internal fun PlayerActivity.showV2293ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293tolerated
    FeaturePrefsStore.batch2291.v2293tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2293: traced mode
internal fun PlayerActivity.showV2293TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293traced
    FeaturePrefsStore.batch2291.v2293traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2293: tracked level
internal fun PlayerActivity.showV2293TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2293tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2293tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2293: traded level
internal fun PlayerActivity.showV2293TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2293traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2293traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2293: trained level
internal fun PlayerActivity.showV2293TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2293trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2293trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2293: transferred level
internal fun PlayerActivity.showV2293TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2293transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2293transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2293: transformed level
internal fun PlayerActivity.showV2293TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2293transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2293transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2293: translated mode
internal fun PlayerActivity.showV2293TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293translated
    FeaturePrefsStore.batch2291.v2293translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2293: transmitted mode
internal fun PlayerActivity.showV2293TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293transmitted
    FeaturePrefsStore.batch2291.v2293transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2293: transported mode
internal fun PlayerActivity.showV2293TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293transported
    FeaturePrefsStore.batch2291.v2293transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2293: trapped mode
internal fun PlayerActivity.showV2293TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293trapped
    FeaturePrefsStore.batch2291.v2293trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2293: traveled mode
internal fun PlayerActivity.showV2293TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2293traveled
    FeaturePrefsStore.batch2291.v2293traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2294: tested mode
internal fun PlayerActivity.showV2294TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294tested
    FeaturePrefsStore.batch2291.v2294tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2294: threatened mode
internal fun PlayerActivity.showV2294ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294threatened
    FeaturePrefsStore.batch2291.v2294threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2294: tightened mode
internal fun PlayerActivity.showV2294TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294tightened
    FeaturePrefsStore.batch2291.v2294tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2294: tolerated mode
internal fun PlayerActivity.showV2294ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294tolerated
    FeaturePrefsStore.batch2291.v2294tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2294: traced mode
internal fun PlayerActivity.showV2294TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294traced
    FeaturePrefsStore.batch2291.v2294traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2294: tracked level
internal fun PlayerActivity.showV2294TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2294tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2294tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2294: traded level
internal fun PlayerActivity.showV2294TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2294traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2294traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2294: trained level
internal fun PlayerActivity.showV2294TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2294trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2294trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2294: transferred level
internal fun PlayerActivity.showV2294TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2294transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2294transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2294: transformed level
internal fun PlayerActivity.showV2294TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2294transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2294transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2294: translated mode
internal fun PlayerActivity.showV2294TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294translated
    FeaturePrefsStore.batch2291.v2294translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2294: transmitted mode
internal fun PlayerActivity.showV2294TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294transmitted
    FeaturePrefsStore.batch2291.v2294transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2294: transported mode
internal fun PlayerActivity.showV2294TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294transported
    FeaturePrefsStore.batch2291.v2294transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2294: trapped mode
internal fun PlayerActivity.showV2294TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294trapped
    FeaturePrefsStore.batch2291.v2294trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2294: traveled mode
internal fun PlayerActivity.showV2294TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2294traveled
    FeaturePrefsStore.batch2291.v2294traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2295: tested mode
internal fun PlayerActivity.showV2295TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295tested
    FeaturePrefsStore.batch2291.v2295tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2295: threatened mode
internal fun PlayerActivity.showV2295ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295threatened
    FeaturePrefsStore.batch2291.v2295threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2295: tightened mode
internal fun PlayerActivity.showV2295TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295tightened
    FeaturePrefsStore.batch2291.v2295tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2295: tolerated mode
internal fun PlayerActivity.showV2295ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295tolerated
    FeaturePrefsStore.batch2291.v2295tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2295: traced mode
internal fun PlayerActivity.showV2295TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295traced
    FeaturePrefsStore.batch2291.v2295traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2295: tracked level
internal fun PlayerActivity.showV2295TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2295tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2295tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2295: traded level
internal fun PlayerActivity.showV2295TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2295traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2295traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2295: trained level
internal fun PlayerActivity.showV2295TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2295trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2295trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2295: transferred level
internal fun PlayerActivity.showV2295TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2295transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2295transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2295: transformed level
internal fun PlayerActivity.showV2295TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2295transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2295transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2295: translated mode
internal fun PlayerActivity.showV2295TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295translated
    FeaturePrefsStore.batch2291.v2295translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2295: transmitted mode
internal fun PlayerActivity.showV2295TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295transmitted
    FeaturePrefsStore.batch2291.v2295transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2295: transported mode
internal fun PlayerActivity.showV2295TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295transported
    FeaturePrefsStore.batch2291.v2295transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2295: trapped mode
internal fun PlayerActivity.showV2295TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295trapped
    FeaturePrefsStore.batch2291.v2295trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2295: traveled mode
internal fun PlayerActivity.showV2295TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2295traveled
    FeaturePrefsStore.batch2291.v2295traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2296: tested mode
internal fun PlayerActivity.showV2296TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296tested
    FeaturePrefsStore.batch2291.v2296tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2296: threatened mode
internal fun PlayerActivity.showV2296ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296threatened
    FeaturePrefsStore.batch2291.v2296threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2296: tightened mode
internal fun PlayerActivity.showV2296TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296tightened
    FeaturePrefsStore.batch2291.v2296tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2296: tolerated mode
internal fun PlayerActivity.showV2296ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296tolerated
    FeaturePrefsStore.batch2291.v2296tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2296: traced mode
internal fun PlayerActivity.showV2296TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296traced
    FeaturePrefsStore.batch2291.v2296traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2296: tracked level
internal fun PlayerActivity.showV2296TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2296tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2296tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2296: traded level
internal fun PlayerActivity.showV2296TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2296traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2296traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2296: trained level
internal fun PlayerActivity.showV2296TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2296trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2296trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2296: transferred level
internal fun PlayerActivity.showV2296TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2296transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2296transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2296: transformed level
internal fun PlayerActivity.showV2296TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2296transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2296transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2296: translated mode
internal fun PlayerActivity.showV2296TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296translated
    FeaturePrefsStore.batch2291.v2296translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2296: transmitted mode
internal fun PlayerActivity.showV2296TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296transmitted
    FeaturePrefsStore.batch2291.v2296transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2296: transported mode
internal fun PlayerActivity.showV2296TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296transported
    FeaturePrefsStore.batch2291.v2296transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2296: trapped mode
internal fun PlayerActivity.showV2296TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296trapped
    FeaturePrefsStore.batch2291.v2296trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2296: traveled mode
internal fun PlayerActivity.showV2296TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2296traveled
    FeaturePrefsStore.batch2291.v2296traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2297: tested mode
internal fun PlayerActivity.showV2297TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297tested
    FeaturePrefsStore.batch2291.v2297tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2297: threatened mode
internal fun PlayerActivity.showV2297ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297threatened
    FeaturePrefsStore.batch2291.v2297threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2297: tightened mode
internal fun PlayerActivity.showV2297TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297tightened
    FeaturePrefsStore.batch2291.v2297tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2297: tolerated mode
internal fun PlayerActivity.showV2297ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297tolerated
    FeaturePrefsStore.batch2291.v2297tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2297: traced mode
internal fun PlayerActivity.showV2297TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297traced
    FeaturePrefsStore.batch2291.v2297traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2297: tracked level
internal fun PlayerActivity.showV2297TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2297tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2297tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2297: traded level
internal fun PlayerActivity.showV2297TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2297traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2297traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2297: trained level
internal fun PlayerActivity.showV2297TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2297trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2297trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2297: transferred level
internal fun PlayerActivity.showV2297TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2297transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2297transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2297: transformed level
internal fun PlayerActivity.showV2297TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2297transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2297transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2297: translated mode
internal fun PlayerActivity.showV2297TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297translated
    FeaturePrefsStore.batch2291.v2297translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2297: transmitted mode
internal fun PlayerActivity.showV2297TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297transmitted
    FeaturePrefsStore.batch2291.v2297transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2297: transported mode
internal fun PlayerActivity.showV2297TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297transported
    FeaturePrefsStore.batch2291.v2297transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2297: trapped mode
internal fun PlayerActivity.showV2297TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297trapped
    FeaturePrefsStore.batch2291.v2297trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2297: traveled mode
internal fun PlayerActivity.showV2297TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2297traveled
    FeaturePrefsStore.batch2291.v2297traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2298: tested mode
internal fun PlayerActivity.showV2298TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298tested
    FeaturePrefsStore.batch2291.v2298tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2298: threatened mode
internal fun PlayerActivity.showV2298ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298threatened
    FeaturePrefsStore.batch2291.v2298threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2298: tightened mode
internal fun PlayerActivity.showV2298TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298tightened
    FeaturePrefsStore.batch2291.v2298tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2298: tolerated mode
internal fun PlayerActivity.showV2298ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298tolerated
    FeaturePrefsStore.batch2291.v2298tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2298: traced mode
internal fun PlayerActivity.showV2298TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298traced
    FeaturePrefsStore.batch2291.v2298traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2298: tracked level
internal fun PlayerActivity.showV2298TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2298tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2298tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2298: traded level
internal fun PlayerActivity.showV2298TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2298traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2298traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2298: trained level
internal fun PlayerActivity.showV2298TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2298trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2298trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2298: transferred level
internal fun PlayerActivity.showV2298TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2298transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2298transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2298: transformed level
internal fun PlayerActivity.showV2298TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2298transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2298transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2298: translated mode
internal fun PlayerActivity.showV2298TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298translated
    FeaturePrefsStore.batch2291.v2298translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2298: transmitted mode
internal fun PlayerActivity.showV2298TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298transmitted
    FeaturePrefsStore.batch2291.v2298transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2298: transported mode
internal fun PlayerActivity.showV2298TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298transported
    FeaturePrefsStore.batch2291.v2298transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2298: trapped mode
internal fun PlayerActivity.showV2298TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298trapped
    FeaturePrefsStore.batch2291.v2298trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2298: traveled mode
internal fun PlayerActivity.showV2298TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2298traveled
    FeaturePrefsStore.batch2291.v2298traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2299: tested mode
internal fun PlayerActivity.showV2299TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299tested
    FeaturePrefsStore.batch2291.v2299tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2299: threatened mode
internal fun PlayerActivity.showV2299ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299threatened
    FeaturePrefsStore.batch2291.v2299threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2299: tightened mode
internal fun PlayerActivity.showV2299TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299tightened
    FeaturePrefsStore.batch2291.v2299tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2299: tolerated mode
internal fun PlayerActivity.showV2299ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299tolerated
    FeaturePrefsStore.batch2291.v2299tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2299: traced mode
internal fun PlayerActivity.showV2299TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299traced
    FeaturePrefsStore.batch2291.v2299traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2299: tracked level
internal fun PlayerActivity.showV2299TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2299tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2299tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2299: traded level
internal fun PlayerActivity.showV2299TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2299traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2299traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2299: trained level
internal fun PlayerActivity.showV2299TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2299trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2299trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2299: transferred level
internal fun PlayerActivity.showV2299TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2299transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2299transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2299: transformed level
internal fun PlayerActivity.showV2299TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2299transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2299transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2299: translated mode
internal fun PlayerActivity.showV2299TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299translated
    FeaturePrefsStore.batch2291.v2299translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2299: transmitted mode
internal fun PlayerActivity.showV2299TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299transmitted
    FeaturePrefsStore.batch2291.v2299transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2299: transported mode
internal fun PlayerActivity.showV2299TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299transported
    FeaturePrefsStore.batch2291.v2299transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2299: trapped mode
internal fun PlayerActivity.showV2299TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299trapped
    FeaturePrefsStore.batch2291.v2299trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2299: traveled mode
internal fun PlayerActivity.showV2299TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2299traveled
    FeaturePrefsStore.batch2291.v2299traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2300: tested mode
internal fun PlayerActivity.showV2300TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300tested
    FeaturePrefsStore.batch2291.v2300tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2300: threatened mode
internal fun PlayerActivity.showV2300ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300threatened
    FeaturePrefsStore.batch2291.v2300threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2300: tightened mode
internal fun PlayerActivity.showV2300TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300tightened
    FeaturePrefsStore.batch2291.v2300tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2300: tolerated mode
internal fun PlayerActivity.showV2300ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300tolerated
    FeaturePrefsStore.batch2291.v2300tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2300: traced mode
internal fun PlayerActivity.showV2300TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300traced
    FeaturePrefsStore.batch2291.v2300traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2300: tracked level
internal fun PlayerActivity.showV2300TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2300tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2300tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2300: traded level
internal fun PlayerActivity.showV2300TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2300traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2300traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2300: trained level
internal fun PlayerActivity.showV2300TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2300trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2300trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2300: transferred level
internal fun PlayerActivity.showV2300TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2300transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2300transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2300: transformed level
internal fun PlayerActivity.showV2300TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2300transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2300transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2300: translated mode
internal fun PlayerActivity.showV2300TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300translated
    FeaturePrefsStore.batch2291.v2300translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2300: transmitted mode
internal fun PlayerActivity.showV2300TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300transmitted
    FeaturePrefsStore.batch2291.v2300transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2300: transported mode
internal fun PlayerActivity.showV2300TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300transported
    FeaturePrefsStore.batch2291.v2300transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2300: trapped mode
internal fun PlayerActivity.showV2300TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300trapped
    FeaturePrefsStore.batch2291.v2300trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2300: traveled mode
internal fun PlayerActivity.showV2300TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2300traveled
    FeaturePrefsStore.batch2291.v2300traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

