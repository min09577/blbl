package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1131: trade mode
internal fun PlayerActivity.showV1131TradeToggle() {
    val current = FeaturePrefsStore.batch1131.v1131trade
    FeaturePrefsStore.batch1131.v1131trade = !current
    AppToast.show(this, "trade: ${if (!current) "ON" else "OFF"}")
}

// v1131: trail mode
internal fun PlayerActivity.showV1131TrailToggle() {
    val current = FeaturePrefsStore.batch1131.v1131trail
    FeaturePrefsStore.batch1131.v1131trail = !current
    AppToast.show(this, "trail: ${if (!current) "ON" else "OFF"}")
}

// v1131: train mode
internal fun PlayerActivity.showV1131TrainToggle() {
    val current = FeaturePrefsStore.batch1131.v1131train
    FeaturePrefsStore.batch1131.v1131train = !current
    AppToast.show(this, "train: ${if (!current) "ON" else "OFF"}")
}

// v1131: transfer mode
internal fun PlayerActivity.showV1131TransferToggle() {
    val current = FeaturePrefsStore.batch1131.v1131transfer
    FeaturePrefsStore.batch1131.v1131transfer = !current
    AppToast.show(this, "transfer: ${if (!current) "ON" else "OFF"}")
}

// v1131: transform mode
internal fun PlayerActivity.showV1131TransformToggle() {
    val current = FeaturePrefsStore.batch1131.v1131transform
    FeaturePrefsStore.batch1131.v1131transform = !current
    AppToast.show(this, "transform: ${if (!current) "ON" else "OFF"}")
}

// v1131: translate level
internal fun PlayerActivity.showV1131TranslateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1131translate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "translate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1131translate = value
        AppToast.show(this, "translate: $value")
    }
}

// v1131: transport level
internal fun PlayerActivity.showV1131TransportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1131transport).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transport level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1131transport = value
        AppToast.show(this, "transport: $value")
    }
}

// v1131: trap level
internal fun PlayerActivity.showV1131TrapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1131trap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1131trap = value
        AppToast.show(this, "trap: $value")
    }
}

// v1131: travel level
internal fun PlayerActivity.showV1131TravelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1131travel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "travel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1131travel = value
        AppToast.show(this, "travel: $value")
    }
}

// v1131: trigger level
internal fun PlayerActivity.showV1131TriggerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1131trigger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trigger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1131trigger = value
        AppToast.show(this, "trigger: $value")
    }
}

// v1131: trim mode
internal fun PlayerActivity.showV1131TrimToggle() {
    val current = FeaturePrefsStore.batch1131.v1131trim
    FeaturePrefsStore.batch1131.v1131trim = !current
    AppToast.show(this, "trim: ${if (!current) "ON" else "OFF"}")
}

// v1131: trip mode
internal fun PlayerActivity.showV1131TripToggle() {
    val current = FeaturePrefsStore.batch1131.v1131trip
    FeaturePrefsStore.batch1131.v1131trip = !current
    AppToast.show(this, "trip: ${if (!current) "ON" else "OFF"}")
}

// v1131: truncate mode
internal fun PlayerActivity.showV1131TruncateToggle() {
    val current = FeaturePrefsStore.batch1131.v1131truncate
    FeaturePrefsStore.batch1131.v1131truncate = !current
    AppToast.show(this, "truncate: ${if (!current) "ON" else "OFF"}")
}

// v1131: trust mode
internal fun PlayerActivity.showV1131TrustToggle() {
    val current = FeaturePrefsStore.batch1131.v1131trust
    FeaturePrefsStore.batch1131.v1131trust = !current
    AppToast.show(this, "trust: ${if (!current) "ON" else "OFF"}")
}

// v1131: tune mode
internal fun PlayerActivity.showV1131TuneToggle() {
    val current = FeaturePrefsStore.batch1131.v1131tune
    FeaturePrefsStore.batch1131.v1131tune = !current
    AppToast.show(this, "tune: ${if (!current) "ON" else "OFF"}")
}

// v1132: trade mode
internal fun PlayerActivity.showV1132TradeToggle() {
    val current = FeaturePrefsStore.batch1131.v1132trade
    FeaturePrefsStore.batch1131.v1132trade = !current
    AppToast.show(this, "trade: ${if (!current) "ON" else "OFF"}")
}

// v1132: trail mode
internal fun PlayerActivity.showV1132TrailToggle() {
    val current = FeaturePrefsStore.batch1131.v1132trail
    FeaturePrefsStore.batch1131.v1132trail = !current
    AppToast.show(this, "trail: ${if (!current) "ON" else "OFF"}")
}

// v1132: train mode
internal fun PlayerActivity.showV1132TrainToggle() {
    val current = FeaturePrefsStore.batch1131.v1132train
    FeaturePrefsStore.batch1131.v1132train = !current
    AppToast.show(this, "train: ${if (!current) "ON" else "OFF"}")
}

// v1132: transfer mode
internal fun PlayerActivity.showV1132TransferToggle() {
    val current = FeaturePrefsStore.batch1131.v1132transfer
    FeaturePrefsStore.batch1131.v1132transfer = !current
    AppToast.show(this, "transfer: ${if (!current) "ON" else "OFF"}")
}

// v1132: transform mode
internal fun PlayerActivity.showV1132TransformToggle() {
    val current = FeaturePrefsStore.batch1131.v1132transform
    FeaturePrefsStore.batch1131.v1132transform = !current
    AppToast.show(this, "transform: ${if (!current) "ON" else "OFF"}")
}

// v1132: translate level
internal fun PlayerActivity.showV1132TranslateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1132translate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "translate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1132translate = value
        AppToast.show(this, "translate: $value")
    }
}

// v1132: transport level
internal fun PlayerActivity.showV1132TransportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1132transport).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transport level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1132transport = value
        AppToast.show(this, "transport: $value")
    }
}

// v1132: trap level
internal fun PlayerActivity.showV1132TrapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1132trap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1132trap = value
        AppToast.show(this, "trap: $value")
    }
}

// v1132: travel level
internal fun PlayerActivity.showV1132TravelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1132travel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "travel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1132travel = value
        AppToast.show(this, "travel: $value")
    }
}

// v1132: trigger level
internal fun PlayerActivity.showV1132TriggerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1132trigger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trigger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1132trigger = value
        AppToast.show(this, "trigger: $value")
    }
}

// v1132: trim mode
internal fun PlayerActivity.showV1132TrimToggle() {
    val current = FeaturePrefsStore.batch1131.v1132trim
    FeaturePrefsStore.batch1131.v1132trim = !current
    AppToast.show(this, "trim: ${if (!current) "ON" else "OFF"}")
}

// v1132: trip mode
internal fun PlayerActivity.showV1132TripToggle() {
    val current = FeaturePrefsStore.batch1131.v1132trip
    FeaturePrefsStore.batch1131.v1132trip = !current
    AppToast.show(this, "trip: ${if (!current) "ON" else "OFF"}")
}

// v1132: truncate mode
internal fun PlayerActivity.showV1132TruncateToggle() {
    val current = FeaturePrefsStore.batch1131.v1132truncate
    FeaturePrefsStore.batch1131.v1132truncate = !current
    AppToast.show(this, "truncate: ${if (!current) "ON" else "OFF"}")
}

// v1132: trust mode
internal fun PlayerActivity.showV1132TrustToggle() {
    val current = FeaturePrefsStore.batch1131.v1132trust
    FeaturePrefsStore.batch1131.v1132trust = !current
    AppToast.show(this, "trust: ${if (!current) "ON" else "OFF"}")
}

// v1132: tune mode
internal fun PlayerActivity.showV1132TuneToggle() {
    val current = FeaturePrefsStore.batch1131.v1132tune
    FeaturePrefsStore.batch1131.v1132tune = !current
    AppToast.show(this, "tune: ${if (!current) "ON" else "OFF"}")
}

// v1133: trade mode
internal fun PlayerActivity.showV1133TradeToggle() {
    val current = FeaturePrefsStore.batch1131.v1133trade
    FeaturePrefsStore.batch1131.v1133trade = !current
    AppToast.show(this, "trade: ${if (!current) "ON" else "OFF"}")
}

// v1133: trail mode
internal fun PlayerActivity.showV1133TrailToggle() {
    val current = FeaturePrefsStore.batch1131.v1133trail
    FeaturePrefsStore.batch1131.v1133trail = !current
    AppToast.show(this, "trail: ${if (!current) "ON" else "OFF"}")
}

// v1133: train mode
internal fun PlayerActivity.showV1133TrainToggle() {
    val current = FeaturePrefsStore.batch1131.v1133train
    FeaturePrefsStore.batch1131.v1133train = !current
    AppToast.show(this, "train: ${if (!current) "ON" else "OFF"}")
}

// v1133: transfer mode
internal fun PlayerActivity.showV1133TransferToggle() {
    val current = FeaturePrefsStore.batch1131.v1133transfer
    FeaturePrefsStore.batch1131.v1133transfer = !current
    AppToast.show(this, "transfer: ${if (!current) "ON" else "OFF"}")
}

// v1133: transform mode
internal fun PlayerActivity.showV1133TransformToggle() {
    val current = FeaturePrefsStore.batch1131.v1133transform
    FeaturePrefsStore.batch1131.v1133transform = !current
    AppToast.show(this, "transform: ${if (!current) "ON" else "OFF"}")
}

// v1133: translate level
internal fun PlayerActivity.showV1133TranslateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1133translate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "translate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1133translate = value
        AppToast.show(this, "translate: $value")
    }
}

// v1133: transport level
internal fun PlayerActivity.showV1133TransportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1133transport).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transport level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1133transport = value
        AppToast.show(this, "transport: $value")
    }
}

// v1133: trap level
internal fun PlayerActivity.showV1133TrapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1133trap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1133trap = value
        AppToast.show(this, "trap: $value")
    }
}

// v1133: travel level
internal fun PlayerActivity.showV1133TravelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1133travel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "travel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1133travel = value
        AppToast.show(this, "travel: $value")
    }
}

// v1133: trigger level
internal fun PlayerActivity.showV1133TriggerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1133trigger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trigger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1133trigger = value
        AppToast.show(this, "trigger: $value")
    }
}

// v1133: trim mode
internal fun PlayerActivity.showV1133TrimToggle() {
    val current = FeaturePrefsStore.batch1131.v1133trim
    FeaturePrefsStore.batch1131.v1133trim = !current
    AppToast.show(this, "trim: ${if (!current) "ON" else "OFF"}")
}

// v1133: trip mode
internal fun PlayerActivity.showV1133TripToggle() {
    val current = FeaturePrefsStore.batch1131.v1133trip
    FeaturePrefsStore.batch1131.v1133trip = !current
    AppToast.show(this, "trip: ${if (!current) "ON" else "OFF"}")
}

// v1133: truncate mode
internal fun PlayerActivity.showV1133TruncateToggle() {
    val current = FeaturePrefsStore.batch1131.v1133truncate
    FeaturePrefsStore.batch1131.v1133truncate = !current
    AppToast.show(this, "truncate: ${if (!current) "ON" else "OFF"}")
}

// v1133: trust mode
internal fun PlayerActivity.showV1133TrustToggle() {
    val current = FeaturePrefsStore.batch1131.v1133trust
    FeaturePrefsStore.batch1131.v1133trust = !current
    AppToast.show(this, "trust: ${if (!current) "ON" else "OFF"}")
}

// v1133: tune mode
internal fun PlayerActivity.showV1133TuneToggle() {
    val current = FeaturePrefsStore.batch1131.v1133tune
    FeaturePrefsStore.batch1131.v1133tune = !current
    AppToast.show(this, "tune: ${if (!current) "ON" else "OFF"}")
}

// v1134: trade mode
internal fun PlayerActivity.showV1134TradeToggle() {
    val current = FeaturePrefsStore.batch1131.v1134trade
    FeaturePrefsStore.batch1131.v1134trade = !current
    AppToast.show(this, "trade: ${if (!current) "ON" else "OFF"}")
}

// v1134: trail mode
internal fun PlayerActivity.showV1134TrailToggle() {
    val current = FeaturePrefsStore.batch1131.v1134trail
    FeaturePrefsStore.batch1131.v1134trail = !current
    AppToast.show(this, "trail: ${if (!current) "ON" else "OFF"}")
}

// v1134: train mode
internal fun PlayerActivity.showV1134TrainToggle() {
    val current = FeaturePrefsStore.batch1131.v1134train
    FeaturePrefsStore.batch1131.v1134train = !current
    AppToast.show(this, "train: ${if (!current) "ON" else "OFF"}")
}

// v1134: transfer mode
internal fun PlayerActivity.showV1134TransferToggle() {
    val current = FeaturePrefsStore.batch1131.v1134transfer
    FeaturePrefsStore.batch1131.v1134transfer = !current
    AppToast.show(this, "transfer: ${if (!current) "ON" else "OFF"}")
}

// v1134: transform mode
internal fun PlayerActivity.showV1134TransformToggle() {
    val current = FeaturePrefsStore.batch1131.v1134transform
    FeaturePrefsStore.batch1131.v1134transform = !current
    AppToast.show(this, "transform: ${if (!current) "ON" else "OFF"}")
}

// v1134: translate level
internal fun PlayerActivity.showV1134TranslateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1134translate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "translate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1134translate = value
        AppToast.show(this, "translate: $value")
    }
}

// v1134: transport level
internal fun PlayerActivity.showV1134TransportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1134transport).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transport level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1134transport = value
        AppToast.show(this, "transport: $value")
    }
}

// v1134: trap level
internal fun PlayerActivity.showV1134TrapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1134trap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1134trap = value
        AppToast.show(this, "trap: $value")
    }
}

// v1134: travel level
internal fun PlayerActivity.showV1134TravelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1134travel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "travel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1134travel = value
        AppToast.show(this, "travel: $value")
    }
}

// v1134: trigger level
internal fun PlayerActivity.showV1134TriggerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1134trigger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trigger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1134trigger = value
        AppToast.show(this, "trigger: $value")
    }
}

// v1134: trim mode
internal fun PlayerActivity.showV1134TrimToggle() {
    val current = FeaturePrefsStore.batch1131.v1134trim
    FeaturePrefsStore.batch1131.v1134trim = !current
    AppToast.show(this, "trim: ${if (!current) "ON" else "OFF"}")
}

// v1134: trip mode
internal fun PlayerActivity.showV1134TripToggle() {
    val current = FeaturePrefsStore.batch1131.v1134trip
    FeaturePrefsStore.batch1131.v1134trip = !current
    AppToast.show(this, "trip: ${if (!current) "ON" else "OFF"}")
}

// v1134: truncate mode
internal fun PlayerActivity.showV1134TruncateToggle() {
    val current = FeaturePrefsStore.batch1131.v1134truncate
    FeaturePrefsStore.batch1131.v1134truncate = !current
    AppToast.show(this, "truncate: ${if (!current) "ON" else "OFF"}")
}

// v1134: trust mode
internal fun PlayerActivity.showV1134TrustToggle() {
    val current = FeaturePrefsStore.batch1131.v1134trust
    FeaturePrefsStore.batch1131.v1134trust = !current
    AppToast.show(this, "trust: ${if (!current) "ON" else "OFF"}")
}

// v1134: tune mode
internal fun PlayerActivity.showV1134TuneToggle() {
    val current = FeaturePrefsStore.batch1131.v1134tune
    FeaturePrefsStore.batch1131.v1134tune = !current
    AppToast.show(this, "tune: ${if (!current) "ON" else "OFF"}")
}

// v1135: trade mode
internal fun PlayerActivity.showV1135TradeToggle() {
    val current = FeaturePrefsStore.batch1131.v1135trade
    FeaturePrefsStore.batch1131.v1135trade = !current
    AppToast.show(this, "trade: ${if (!current) "ON" else "OFF"}")
}

// v1135: trail mode
internal fun PlayerActivity.showV1135TrailToggle() {
    val current = FeaturePrefsStore.batch1131.v1135trail
    FeaturePrefsStore.batch1131.v1135trail = !current
    AppToast.show(this, "trail: ${if (!current) "ON" else "OFF"}")
}

// v1135: train mode
internal fun PlayerActivity.showV1135TrainToggle() {
    val current = FeaturePrefsStore.batch1131.v1135train
    FeaturePrefsStore.batch1131.v1135train = !current
    AppToast.show(this, "train: ${if (!current) "ON" else "OFF"}")
}

// v1135: transfer mode
internal fun PlayerActivity.showV1135TransferToggle() {
    val current = FeaturePrefsStore.batch1131.v1135transfer
    FeaturePrefsStore.batch1131.v1135transfer = !current
    AppToast.show(this, "transfer: ${if (!current) "ON" else "OFF"}")
}

// v1135: transform mode
internal fun PlayerActivity.showV1135TransformToggle() {
    val current = FeaturePrefsStore.batch1131.v1135transform
    FeaturePrefsStore.batch1131.v1135transform = !current
    AppToast.show(this, "transform: ${if (!current) "ON" else "OFF"}")
}

// v1135: translate level
internal fun PlayerActivity.showV1135TranslateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1135translate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "translate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1135translate = value
        AppToast.show(this, "translate: $value")
    }
}

// v1135: transport level
internal fun PlayerActivity.showV1135TransportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1135transport).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transport level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1135transport = value
        AppToast.show(this, "transport: $value")
    }
}

// v1135: trap level
internal fun PlayerActivity.showV1135TrapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1135trap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1135trap = value
        AppToast.show(this, "trap: $value")
    }
}

// v1135: travel level
internal fun PlayerActivity.showV1135TravelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1135travel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "travel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1135travel = value
        AppToast.show(this, "travel: $value")
    }
}

// v1135: trigger level
internal fun PlayerActivity.showV1135TriggerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1135trigger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trigger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1135trigger = value
        AppToast.show(this, "trigger: $value")
    }
}

// v1135: trim mode
internal fun PlayerActivity.showV1135TrimToggle() {
    val current = FeaturePrefsStore.batch1131.v1135trim
    FeaturePrefsStore.batch1131.v1135trim = !current
    AppToast.show(this, "trim: ${if (!current) "ON" else "OFF"}")
}

// v1135: trip mode
internal fun PlayerActivity.showV1135TripToggle() {
    val current = FeaturePrefsStore.batch1131.v1135trip
    FeaturePrefsStore.batch1131.v1135trip = !current
    AppToast.show(this, "trip: ${if (!current) "ON" else "OFF"}")
}

// v1135: truncate mode
internal fun PlayerActivity.showV1135TruncateToggle() {
    val current = FeaturePrefsStore.batch1131.v1135truncate
    FeaturePrefsStore.batch1131.v1135truncate = !current
    AppToast.show(this, "truncate: ${if (!current) "ON" else "OFF"}")
}

// v1135: trust mode
internal fun PlayerActivity.showV1135TrustToggle() {
    val current = FeaturePrefsStore.batch1131.v1135trust
    FeaturePrefsStore.batch1131.v1135trust = !current
    AppToast.show(this, "trust: ${if (!current) "ON" else "OFF"}")
}

// v1135: tune mode
internal fun PlayerActivity.showV1135TuneToggle() {
    val current = FeaturePrefsStore.batch1131.v1135tune
    FeaturePrefsStore.batch1131.v1135tune = !current
    AppToast.show(this, "tune: ${if (!current) "ON" else "OFF"}")
}

// v1136: trade mode
internal fun PlayerActivity.showV1136TradeToggle() {
    val current = FeaturePrefsStore.batch1131.v1136trade
    FeaturePrefsStore.batch1131.v1136trade = !current
    AppToast.show(this, "trade: ${if (!current) "ON" else "OFF"}")
}

// v1136: trail mode
internal fun PlayerActivity.showV1136TrailToggle() {
    val current = FeaturePrefsStore.batch1131.v1136trail
    FeaturePrefsStore.batch1131.v1136trail = !current
    AppToast.show(this, "trail: ${if (!current) "ON" else "OFF"}")
}

// v1136: train mode
internal fun PlayerActivity.showV1136TrainToggle() {
    val current = FeaturePrefsStore.batch1131.v1136train
    FeaturePrefsStore.batch1131.v1136train = !current
    AppToast.show(this, "train: ${if (!current) "ON" else "OFF"}")
}

// v1136: transfer mode
internal fun PlayerActivity.showV1136TransferToggle() {
    val current = FeaturePrefsStore.batch1131.v1136transfer
    FeaturePrefsStore.batch1131.v1136transfer = !current
    AppToast.show(this, "transfer: ${if (!current) "ON" else "OFF"}")
}

// v1136: transform mode
internal fun PlayerActivity.showV1136TransformToggle() {
    val current = FeaturePrefsStore.batch1131.v1136transform
    FeaturePrefsStore.batch1131.v1136transform = !current
    AppToast.show(this, "transform: ${if (!current) "ON" else "OFF"}")
}

// v1136: translate level
internal fun PlayerActivity.showV1136TranslateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1136translate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "translate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1136translate = value
        AppToast.show(this, "translate: $value")
    }
}

// v1136: transport level
internal fun PlayerActivity.showV1136TransportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1136transport).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transport level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1136transport = value
        AppToast.show(this, "transport: $value")
    }
}

// v1136: trap level
internal fun PlayerActivity.showV1136TrapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1136trap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1136trap = value
        AppToast.show(this, "trap: $value")
    }
}

// v1136: travel level
internal fun PlayerActivity.showV1136TravelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1136travel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "travel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1136travel = value
        AppToast.show(this, "travel: $value")
    }
}

// v1136: trigger level
internal fun PlayerActivity.showV1136TriggerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1136trigger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trigger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1136trigger = value
        AppToast.show(this, "trigger: $value")
    }
}

// v1136: trim mode
internal fun PlayerActivity.showV1136TrimToggle() {
    val current = FeaturePrefsStore.batch1131.v1136trim
    FeaturePrefsStore.batch1131.v1136trim = !current
    AppToast.show(this, "trim: ${if (!current) "ON" else "OFF"}")
}

// v1136: trip mode
internal fun PlayerActivity.showV1136TripToggle() {
    val current = FeaturePrefsStore.batch1131.v1136trip
    FeaturePrefsStore.batch1131.v1136trip = !current
    AppToast.show(this, "trip: ${if (!current) "ON" else "OFF"}")
}

// v1136: truncate mode
internal fun PlayerActivity.showV1136TruncateToggle() {
    val current = FeaturePrefsStore.batch1131.v1136truncate
    FeaturePrefsStore.batch1131.v1136truncate = !current
    AppToast.show(this, "truncate: ${if (!current) "ON" else "OFF"}")
}

// v1136: trust mode
internal fun PlayerActivity.showV1136TrustToggle() {
    val current = FeaturePrefsStore.batch1131.v1136trust
    FeaturePrefsStore.batch1131.v1136trust = !current
    AppToast.show(this, "trust: ${if (!current) "ON" else "OFF"}")
}

// v1136: tune mode
internal fun PlayerActivity.showV1136TuneToggle() {
    val current = FeaturePrefsStore.batch1131.v1136tune
    FeaturePrefsStore.batch1131.v1136tune = !current
    AppToast.show(this, "tune: ${if (!current) "ON" else "OFF"}")
}

// v1137: trade mode
internal fun PlayerActivity.showV1137TradeToggle() {
    val current = FeaturePrefsStore.batch1131.v1137trade
    FeaturePrefsStore.batch1131.v1137trade = !current
    AppToast.show(this, "trade: ${if (!current) "ON" else "OFF"}")
}

// v1137: trail mode
internal fun PlayerActivity.showV1137TrailToggle() {
    val current = FeaturePrefsStore.batch1131.v1137trail
    FeaturePrefsStore.batch1131.v1137trail = !current
    AppToast.show(this, "trail: ${if (!current) "ON" else "OFF"}")
}

// v1137: train mode
internal fun PlayerActivity.showV1137TrainToggle() {
    val current = FeaturePrefsStore.batch1131.v1137train
    FeaturePrefsStore.batch1131.v1137train = !current
    AppToast.show(this, "train: ${if (!current) "ON" else "OFF"}")
}

// v1137: transfer mode
internal fun PlayerActivity.showV1137TransferToggle() {
    val current = FeaturePrefsStore.batch1131.v1137transfer
    FeaturePrefsStore.batch1131.v1137transfer = !current
    AppToast.show(this, "transfer: ${if (!current) "ON" else "OFF"}")
}

// v1137: transform mode
internal fun PlayerActivity.showV1137TransformToggle() {
    val current = FeaturePrefsStore.batch1131.v1137transform
    FeaturePrefsStore.batch1131.v1137transform = !current
    AppToast.show(this, "transform: ${if (!current) "ON" else "OFF"}")
}

// v1137: translate level
internal fun PlayerActivity.showV1137TranslateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1137translate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "translate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1137translate = value
        AppToast.show(this, "translate: $value")
    }
}

// v1137: transport level
internal fun PlayerActivity.showV1137TransportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1137transport).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transport level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1137transport = value
        AppToast.show(this, "transport: $value")
    }
}

// v1137: trap level
internal fun PlayerActivity.showV1137TrapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1137trap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1137trap = value
        AppToast.show(this, "trap: $value")
    }
}

// v1137: travel level
internal fun PlayerActivity.showV1137TravelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1137travel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "travel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1137travel = value
        AppToast.show(this, "travel: $value")
    }
}

// v1137: trigger level
internal fun PlayerActivity.showV1137TriggerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1137trigger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trigger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1137trigger = value
        AppToast.show(this, "trigger: $value")
    }
}

// v1137: trim mode
internal fun PlayerActivity.showV1137TrimToggle() {
    val current = FeaturePrefsStore.batch1131.v1137trim
    FeaturePrefsStore.batch1131.v1137trim = !current
    AppToast.show(this, "trim: ${if (!current) "ON" else "OFF"}")
}

// v1137: trip mode
internal fun PlayerActivity.showV1137TripToggle() {
    val current = FeaturePrefsStore.batch1131.v1137trip
    FeaturePrefsStore.batch1131.v1137trip = !current
    AppToast.show(this, "trip: ${if (!current) "ON" else "OFF"}")
}

// v1137: truncate mode
internal fun PlayerActivity.showV1137TruncateToggle() {
    val current = FeaturePrefsStore.batch1131.v1137truncate
    FeaturePrefsStore.batch1131.v1137truncate = !current
    AppToast.show(this, "truncate: ${if (!current) "ON" else "OFF"}")
}

// v1137: trust mode
internal fun PlayerActivity.showV1137TrustToggle() {
    val current = FeaturePrefsStore.batch1131.v1137trust
    FeaturePrefsStore.batch1131.v1137trust = !current
    AppToast.show(this, "trust: ${if (!current) "ON" else "OFF"}")
}

// v1137: tune mode
internal fun PlayerActivity.showV1137TuneToggle() {
    val current = FeaturePrefsStore.batch1131.v1137tune
    FeaturePrefsStore.batch1131.v1137tune = !current
    AppToast.show(this, "tune: ${if (!current) "ON" else "OFF"}")
}

// v1138: trade mode
internal fun PlayerActivity.showV1138TradeToggle() {
    val current = FeaturePrefsStore.batch1131.v1138trade
    FeaturePrefsStore.batch1131.v1138trade = !current
    AppToast.show(this, "trade: ${if (!current) "ON" else "OFF"}")
}

// v1138: trail mode
internal fun PlayerActivity.showV1138TrailToggle() {
    val current = FeaturePrefsStore.batch1131.v1138trail
    FeaturePrefsStore.batch1131.v1138trail = !current
    AppToast.show(this, "trail: ${if (!current) "ON" else "OFF"}")
}

// v1138: train mode
internal fun PlayerActivity.showV1138TrainToggle() {
    val current = FeaturePrefsStore.batch1131.v1138train
    FeaturePrefsStore.batch1131.v1138train = !current
    AppToast.show(this, "train: ${if (!current) "ON" else "OFF"}")
}

// v1138: transfer mode
internal fun PlayerActivity.showV1138TransferToggle() {
    val current = FeaturePrefsStore.batch1131.v1138transfer
    FeaturePrefsStore.batch1131.v1138transfer = !current
    AppToast.show(this, "transfer: ${if (!current) "ON" else "OFF"}")
}

// v1138: transform mode
internal fun PlayerActivity.showV1138TransformToggle() {
    val current = FeaturePrefsStore.batch1131.v1138transform
    FeaturePrefsStore.batch1131.v1138transform = !current
    AppToast.show(this, "transform: ${if (!current) "ON" else "OFF"}")
}

// v1138: translate level
internal fun PlayerActivity.showV1138TranslateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1138translate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "translate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1138translate = value
        AppToast.show(this, "translate: $value")
    }
}

// v1138: transport level
internal fun PlayerActivity.showV1138TransportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1138transport).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transport level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1138transport = value
        AppToast.show(this, "transport: $value")
    }
}

// v1138: trap level
internal fun PlayerActivity.showV1138TrapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1138trap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1138trap = value
        AppToast.show(this, "trap: $value")
    }
}

// v1138: travel level
internal fun PlayerActivity.showV1138TravelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1138travel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "travel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1138travel = value
        AppToast.show(this, "travel: $value")
    }
}

// v1138: trigger level
internal fun PlayerActivity.showV1138TriggerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1138trigger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trigger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1138trigger = value
        AppToast.show(this, "trigger: $value")
    }
}

// v1138: trim mode
internal fun PlayerActivity.showV1138TrimToggle() {
    val current = FeaturePrefsStore.batch1131.v1138trim
    FeaturePrefsStore.batch1131.v1138trim = !current
    AppToast.show(this, "trim: ${if (!current) "ON" else "OFF"}")
}

// v1138: trip mode
internal fun PlayerActivity.showV1138TripToggle() {
    val current = FeaturePrefsStore.batch1131.v1138trip
    FeaturePrefsStore.batch1131.v1138trip = !current
    AppToast.show(this, "trip: ${if (!current) "ON" else "OFF"}")
}

// v1138: truncate mode
internal fun PlayerActivity.showV1138TruncateToggle() {
    val current = FeaturePrefsStore.batch1131.v1138truncate
    FeaturePrefsStore.batch1131.v1138truncate = !current
    AppToast.show(this, "truncate: ${if (!current) "ON" else "OFF"}")
}

// v1138: trust mode
internal fun PlayerActivity.showV1138TrustToggle() {
    val current = FeaturePrefsStore.batch1131.v1138trust
    FeaturePrefsStore.batch1131.v1138trust = !current
    AppToast.show(this, "trust: ${if (!current) "ON" else "OFF"}")
}

// v1138: tune mode
internal fun PlayerActivity.showV1138TuneToggle() {
    val current = FeaturePrefsStore.batch1131.v1138tune
    FeaturePrefsStore.batch1131.v1138tune = !current
    AppToast.show(this, "tune: ${if (!current) "ON" else "OFF"}")
}

// v1139: trade mode
internal fun PlayerActivity.showV1139TradeToggle() {
    val current = FeaturePrefsStore.batch1131.v1139trade
    FeaturePrefsStore.batch1131.v1139trade = !current
    AppToast.show(this, "trade: ${if (!current) "ON" else "OFF"}")
}

// v1139: trail mode
internal fun PlayerActivity.showV1139TrailToggle() {
    val current = FeaturePrefsStore.batch1131.v1139trail
    FeaturePrefsStore.batch1131.v1139trail = !current
    AppToast.show(this, "trail: ${if (!current) "ON" else "OFF"}")
}

// v1139: train mode
internal fun PlayerActivity.showV1139TrainToggle() {
    val current = FeaturePrefsStore.batch1131.v1139train
    FeaturePrefsStore.batch1131.v1139train = !current
    AppToast.show(this, "train: ${if (!current) "ON" else "OFF"}")
}

// v1139: transfer mode
internal fun PlayerActivity.showV1139TransferToggle() {
    val current = FeaturePrefsStore.batch1131.v1139transfer
    FeaturePrefsStore.batch1131.v1139transfer = !current
    AppToast.show(this, "transfer: ${if (!current) "ON" else "OFF"}")
}

// v1139: transform mode
internal fun PlayerActivity.showV1139TransformToggle() {
    val current = FeaturePrefsStore.batch1131.v1139transform
    FeaturePrefsStore.batch1131.v1139transform = !current
    AppToast.show(this, "transform: ${if (!current) "ON" else "OFF"}")
}

// v1139: translate level
internal fun PlayerActivity.showV1139TranslateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1139translate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "translate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1139translate = value
        AppToast.show(this, "translate: $value")
    }
}

// v1139: transport level
internal fun PlayerActivity.showV1139TransportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1139transport).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transport level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1139transport = value
        AppToast.show(this, "transport: $value")
    }
}

// v1139: trap level
internal fun PlayerActivity.showV1139TrapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1139trap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1139trap = value
        AppToast.show(this, "trap: $value")
    }
}

// v1139: travel level
internal fun PlayerActivity.showV1139TravelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1139travel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "travel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1139travel = value
        AppToast.show(this, "travel: $value")
    }
}

// v1139: trigger level
internal fun PlayerActivity.showV1139TriggerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1139trigger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trigger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1139trigger = value
        AppToast.show(this, "trigger: $value")
    }
}

// v1139: trim mode
internal fun PlayerActivity.showV1139TrimToggle() {
    val current = FeaturePrefsStore.batch1131.v1139trim
    FeaturePrefsStore.batch1131.v1139trim = !current
    AppToast.show(this, "trim: ${if (!current) "ON" else "OFF"}")
}

// v1139: trip mode
internal fun PlayerActivity.showV1139TripToggle() {
    val current = FeaturePrefsStore.batch1131.v1139trip
    FeaturePrefsStore.batch1131.v1139trip = !current
    AppToast.show(this, "trip: ${if (!current) "ON" else "OFF"}")
}

// v1139: truncate mode
internal fun PlayerActivity.showV1139TruncateToggle() {
    val current = FeaturePrefsStore.batch1131.v1139truncate
    FeaturePrefsStore.batch1131.v1139truncate = !current
    AppToast.show(this, "truncate: ${if (!current) "ON" else "OFF"}")
}

// v1139: trust mode
internal fun PlayerActivity.showV1139TrustToggle() {
    val current = FeaturePrefsStore.batch1131.v1139trust
    FeaturePrefsStore.batch1131.v1139trust = !current
    AppToast.show(this, "trust: ${if (!current) "ON" else "OFF"}")
}

// v1139: tune mode
internal fun PlayerActivity.showV1139TuneToggle() {
    val current = FeaturePrefsStore.batch1131.v1139tune
    FeaturePrefsStore.batch1131.v1139tune = !current
    AppToast.show(this, "tune: ${if (!current) "ON" else "OFF"}")
}

// v1140: trade mode
internal fun PlayerActivity.showV1140TradeToggle() {
    val current = FeaturePrefsStore.batch1131.v1140trade
    FeaturePrefsStore.batch1131.v1140trade = !current
    AppToast.show(this, "trade: ${if (!current) "ON" else "OFF"}")
}

// v1140: trail mode
internal fun PlayerActivity.showV1140TrailToggle() {
    val current = FeaturePrefsStore.batch1131.v1140trail
    FeaturePrefsStore.batch1131.v1140trail = !current
    AppToast.show(this, "trail: ${if (!current) "ON" else "OFF"}")
}

// v1140: train mode
internal fun PlayerActivity.showV1140TrainToggle() {
    val current = FeaturePrefsStore.batch1131.v1140train
    FeaturePrefsStore.batch1131.v1140train = !current
    AppToast.show(this, "train: ${if (!current) "ON" else "OFF"}")
}

// v1140: transfer mode
internal fun PlayerActivity.showV1140TransferToggle() {
    val current = FeaturePrefsStore.batch1131.v1140transfer
    FeaturePrefsStore.batch1131.v1140transfer = !current
    AppToast.show(this, "transfer: ${if (!current) "ON" else "OFF"}")
}

// v1140: transform mode
internal fun PlayerActivity.showV1140TransformToggle() {
    val current = FeaturePrefsStore.batch1131.v1140transform
    FeaturePrefsStore.batch1131.v1140transform = !current
    AppToast.show(this, "transform: ${if (!current) "ON" else "OFF"}")
}

// v1140: translate level
internal fun PlayerActivity.showV1140TranslateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1140translate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "translate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1140translate = value
        AppToast.show(this, "translate: $value")
    }
}

// v1140: transport level
internal fun PlayerActivity.showV1140TransportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1140transport).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transport level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1140transport = value
        AppToast.show(this, "transport: $value")
    }
}

// v1140: trap level
internal fun PlayerActivity.showV1140TrapDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1140trap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trap level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1140trap = value
        AppToast.show(this, "trap: $value")
    }
}

// v1140: travel level
internal fun PlayerActivity.showV1140TravelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1140travel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "travel level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1140travel = value
        AppToast.show(this, "travel: $value")
    }
}

// v1140: trigger level
internal fun PlayerActivity.showV1140TriggerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1131.v1140trigger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trigger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1131.v1140trigger = value
        AppToast.show(this, "trigger: $value")
    }
}

// v1140: trim mode
internal fun PlayerActivity.showV1140TrimToggle() {
    val current = FeaturePrefsStore.batch1131.v1140trim
    FeaturePrefsStore.batch1131.v1140trim = !current
    AppToast.show(this, "trim: ${if (!current) "ON" else "OFF"}")
}

// v1140: trip mode
internal fun PlayerActivity.showV1140TripToggle() {
    val current = FeaturePrefsStore.batch1131.v1140trip
    FeaturePrefsStore.batch1131.v1140trip = !current
    AppToast.show(this, "trip: ${if (!current) "ON" else "OFF"}")
}

// v1140: truncate mode
internal fun PlayerActivity.showV1140TruncateToggle() {
    val current = FeaturePrefsStore.batch1131.v1140truncate
    FeaturePrefsStore.batch1131.v1140truncate = !current
    AppToast.show(this, "truncate: ${if (!current) "ON" else "OFF"}")
}

// v1140: trust mode
internal fun PlayerActivity.showV1140TrustToggle() {
    val current = FeaturePrefsStore.batch1131.v1140trust
    FeaturePrefsStore.batch1131.v1140trust = !current
    AppToast.show(this, "trust: ${if (!current) "ON" else "OFF"}")
}

// v1140: tune mode
internal fun PlayerActivity.showV1140TuneToggle() {
    val current = FeaturePrefsStore.batch1131.v1140tune
    FeaturePrefsStore.batch1131.v1140tune = !current
    AppToast.show(this, "tune: ${if (!current) "ON" else "OFF"}")
}

