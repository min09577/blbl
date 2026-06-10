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

// v1141: turn mode
internal fun PlayerActivity.showV1141TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1141turn
    FeaturePrefsStore.batch1141.v1141turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1141: type mode
internal fun PlayerActivity.showV1141TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1141type
    FeaturePrefsStore.batch1141.v1141type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1141: unbind mode
internal fun PlayerActivity.showV1141UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1141unbind
    FeaturePrefsStore.batch1141.v1141unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1141: undo mode
internal fun PlayerActivity.showV1141UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1141undo
    FeaturePrefsStore.batch1141.v1141undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1141: union mode
internal fun PlayerActivity.showV1141UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1141union
    FeaturePrefsStore.batch1141.v1141union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1141: unit level
internal fun PlayerActivity.showV1141UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1141unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1141unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1141: unknown level
internal fun PlayerActivity.showV1141UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1141unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1141unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1141: unlock level
internal fun PlayerActivity.showV1141UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1141unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1141unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1141: unmount level
internal fun PlayerActivity.showV1141UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1141unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1141unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1141: unsafe level
internal fun PlayerActivity.showV1141UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1141unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1141unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1141: update mode
internal fun PlayerActivity.showV1141UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1141update
    FeaturePrefsStore.batch1141.v1141update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1141: upgrade mode
internal fun PlayerActivity.showV1141UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1141upgrade
    FeaturePrefsStore.batch1141.v1141upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1141: upload mode
internal fun PlayerActivity.showV1141UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1141upload
    FeaturePrefsStore.batch1141.v1141upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1141: upper mode
internal fun PlayerActivity.showV1141UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1141upper
    FeaturePrefsStore.batch1141.v1141upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1141: upscale mode
internal fun PlayerActivity.showV1141UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1141upscale
    FeaturePrefsStore.batch1141.v1141upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1142: turn mode
internal fun PlayerActivity.showV1142TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1142turn
    FeaturePrefsStore.batch1141.v1142turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1142: type mode
internal fun PlayerActivity.showV1142TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1142type
    FeaturePrefsStore.batch1141.v1142type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1142: unbind mode
internal fun PlayerActivity.showV1142UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1142unbind
    FeaturePrefsStore.batch1141.v1142unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1142: undo mode
internal fun PlayerActivity.showV1142UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1142undo
    FeaturePrefsStore.batch1141.v1142undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1142: union mode
internal fun PlayerActivity.showV1142UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1142union
    FeaturePrefsStore.batch1141.v1142union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1142: unit level
internal fun PlayerActivity.showV1142UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1142unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1142unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1142: unknown level
internal fun PlayerActivity.showV1142UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1142unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1142unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1142: unlock level
internal fun PlayerActivity.showV1142UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1142unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1142unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1142: unmount level
internal fun PlayerActivity.showV1142UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1142unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1142unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1142: unsafe level
internal fun PlayerActivity.showV1142UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1142unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1142unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1142: update mode
internal fun PlayerActivity.showV1142UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1142update
    FeaturePrefsStore.batch1141.v1142update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1142: upgrade mode
internal fun PlayerActivity.showV1142UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1142upgrade
    FeaturePrefsStore.batch1141.v1142upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1142: upload mode
internal fun PlayerActivity.showV1142UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1142upload
    FeaturePrefsStore.batch1141.v1142upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1142: upper mode
internal fun PlayerActivity.showV1142UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1142upper
    FeaturePrefsStore.batch1141.v1142upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1142: upscale mode
internal fun PlayerActivity.showV1142UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1142upscale
    FeaturePrefsStore.batch1141.v1142upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1143: turn mode
internal fun PlayerActivity.showV1143TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1143turn
    FeaturePrefsStore.batch1141.v1143turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1143: type mode
internal fun PlayerActivity.showV1143TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1143type
    FeaturePrefsStore.batch1141.v1143type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1143: unbind mode
internal fun PlayerActivity.showV1143UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1143unbind
    FeaturePrefsStore.batch1141.v1143unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1143: undo mode
internal fun PlayerActivity.showV1143UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1143undo
    FeaturePrefsStore.batch1141.v1143undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1143: union mode
internal fun PlayerActivity.showV1143UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1143union
    FeaturePrefsStore.batch1141.v1143union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1143: unit level
internal fun PlayerActivity.showV1143UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1143unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1143unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1143: unknown level
internal fun PlayerActivity.showV1143UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1143unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1143unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1143: unlock level
internal fun PlayerActivity.showV1143UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1143unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1143unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1143: unmount level
internal fun PlayerActivity.showV1143UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1143unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1143unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1143: unsafe level
internal fun PlayerActivity.showV1143UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1143unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1143unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1143: update mode
internal fun PlayerActivity.showV1143UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1143update
    FeaturePrefsStore.batch1141.v1143update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1143: upgrade mode
internal fun PlayerActivity.showV1143UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1143upgrade
    FeaturePrefsStore.batch1141.v1143upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1143: upload mode
internal fun PlayerActivity.showV1143UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1143upload
    FeaturePrefsStore.batch1141.v1143upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1143: upper mode
internal fun PlayerActivity.showV1143UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1143upper
    FeaturePrefsStore.batch1141.v1143upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1143: upscale mode
internal fun PlayerActivity.showV1143UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1143upscale
    FeaturePrefsStore.batch1141.v1143upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1144: turn mode
internal fun PlayerActivity.showV1144TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1144turn
    FeaturePrefsStore.batch1141.v1144turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1144: type mode
internal fun PlayerActivity.showV1144TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1144type
    FeaturePrefsStore.batch1141.v1144type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1144: unbind mode
internal fun PlayerActivity.showV1144UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1144unbind
    FeaturePrefsStore.batch1141.v1144unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1144: undo mode
internal fun PlayerActivity.showV1144UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1144undo
    FeaturePrefsStore.batch1141.v1144undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1144: union mode
internal fun PlayerActivity.showV1144UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1144union
    FeaturePrefsStore.batch1141.v1144union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1144: unit level
internal fun PlayerActivity.showV1144UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1144unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1144unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1144: unknown level
internal fun PlayerActivity.showV1144UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1144unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1144unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1144: unlock level
internal fun PlayerActivity.showV1144UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1144unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1144unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1144: unmount level
internal fun PlayerActivity.showV1144UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1144unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1144unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1144: unsafe level
internal fun PlayerActivity.showV1144UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1144unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1144unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1144: update mode
internal fun PlayerActivity.showV1144UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1144update
    FeaturePrefsStore.batch1141.v1144update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1144: upgrade mode
internal fun PlayerActivity.showV1144UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1144upgrade
    FeaturePrefsStore.batch1141.v1144upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1144: upload mode
internal fun PlayerActivity.showV1144UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1144upload
    FeaturePrefsStore.batch1141.v1144upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1144: upper mode
internal fun PlayerActivity.showV1144UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1144upper
    FeaturePrefsStore.batch1141.v1144upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1144: upscale mode
internal fun PlayerActivity.showV1144UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1144upscale
    FeaturePrefsStore.batch1141.v1144upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1145: turn mode
internal fun PlayerActivity.showV1145TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1145turn
    FeaturePrefsStore.batch1141.v1145turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1145: type mode
internal fun PlayerActivity.showV1145TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1145type
    FeaturePrefsStore.batch1141.v1145type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1145: unbind mode
internal fun PlayerActivity.showV1145UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1145unbind
    FeaturePrefsStore.batch1141.v1145unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1145: undo mode
internal fun PlayerActivity.showV1145UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1145undo
    FeaturePrefsStore.batch1141.v1145undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1145: union mode
internal fun PlayerActivity.showV1145UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1145union
    FeaturePrefsStore.batch1141.v1145union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1145: unit level
internal fun PlayerActivity.showV1145UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1145unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1145unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1145: unknown level
internal fun PlayerActivity.showV1145UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1145unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1145unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1145: unlock level
internal fun PlayerActivity.showV1145UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1145unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1145unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1145: unmount level
internal fun PlayerActivity.showV1145UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1145unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1145unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1145: unsafe level
internal fun PlayerActivity.showV1145UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1145unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1145unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1145: update mode
internal fun PlayerActivity.showV1145UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1145update
    FeaturePrefsStore.batch1141.v1145update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1145: upgrade mode
internal fun PlayerActivity.showV1145UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1145upgrade
    FeaturePrefsStore.batch1141.v1145upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1145: upload mode
internal fun PlayerActivity.showV1145UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1145upload
    FeaturePrefsStore.batch1141.v1145upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1145: upper mode
internal fun PlayerActivity.showV1145UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1145upper
    FeaturePrefsStore.batch1141.v1145upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1145: upscale mode
internal fun PlayerActivity.showV1145UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1145upscale
    FeaturePrefsStore.batch1141.v1145upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1146: turn mode
internal fun PlayerActivity.showV1146TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1146turn
    FeaturePrefsStore.batch1141.v1146turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1146: type mode
internal fun PlayerActivity.showV1146TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1146type
    FeaturePrefsStore.batch1141.v1146type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1146: unbind mode
internal fun PlayerActivity.showV1146UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1146unbind
    FeaturePrefsStore.batch1141.v1146unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1146: undo mode
internal fun PlayerActivity.showV1146UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1146undo
    FeaturePrefsStore.batch1141.v1146undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1146: union mode
internal fun PlayerActivity.showV1146UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1146union
    FeaturePrefsStore.batch1141.v1146union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1146: unit level
internal fun PlayerActivity.showV1146UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1146unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1146unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1146: unknown level
internal fun PlayerActivity.showV1146UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1146unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1146unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1146: unlock level
internal fun PlayerActivity.showV1146UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1146unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1146unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1146: unmount level
internal fun PlayerActivity.showV1146UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1146unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1146unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1146: unsafe level
internal fun PlayerActivity.showV1146UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1146unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1146unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1146: update mode
internal fun PlayerActivity.showV1146UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1146update
    FeaturePrefsStore.batch1141.v1146update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1146: upgrade mode
internal fun PlayerActivity.showV1146UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1146upgrade
    FeaturePrefsStore.batch1141.v1146upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1146: upload mode
internal fun PlayerActivity.showV1146UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1146upload
    FeaturePrefsStore.batch1141.v1146upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1146: upper mode
internal fun PlayerActivity.showV1146UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1146upper
    FeaturePrefsStore.batch1141.v1146upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1146: upscale mode
internal fun PlayerActivity.showV1146UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1146upscale
    FeaturePrefsStore.batch1141.v1146upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1147: turn mode
internal fun PlayerActivity.showV1147TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1147turn
    FeaturePrefsStore.batch1141.v1147turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1147: type mode
internal fun PlayerActivity.showV1147TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1147type
    FeaturePrefsStore.batch1141.v1147type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1147: unbind mode
internal fun PlayerActivity.showV1147UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1147unbind
    FeaturePrefsStore.batch1141.v1147unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1147: undo mode
internal fun PlayerActivity.showV1147UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1147undo
    FeaturePrefsStore.batch1141.v1147undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1147: union mode
internal fun PlayerActivity.showV1147UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1147union
    FeaturePrefsStore.batch1141.v1147union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1147: unit level
internal fun PlayerActivity.showV1147UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1147unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1147unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1147: unknown level
internal fun PlayerActivity.showV1147UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1147unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1147unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1147: unlock level
internal fun PlayerActivity.showV1147UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1147unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1147unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1147: unmount level
internal fun PlayerActivity.showV1147UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1147unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1147unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1147: unsafe level
internal fun PlayerActivity.showV1147UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1147unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1147unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1147: update mode
internal fun PlayerActivity.showV1147UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1147update
    FeaturePrefsStore.batch1141.v1147update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1147: upgrade mode
internal fun PlayerActivity.showV1147UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1147upgrade
    FeaturePrefsStore.batch1141.v1147upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1147: upload mode
internal fun PlayerActivity.showV1147UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1147upload
    FeaturePrefsStore.batch1141.v1147upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1147: upper mode
internal fun PlayerActivity.showV1147UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1147upper
    FeaturePrefsStore.batch1141.v1147upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1147: upscale mode
internal fun PlayerActivity.showV1147UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1147upscale
    FeaturePrefsStore.batch1141.v1147upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1148: turn mode
internal fun PlayerActivity.showV1148TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1148turn
    FeaturePrefsStore.batch1141.v1148turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1148: type mode
internal fun PlayerActivity.showV1148TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1148type
    FeaturePrefsStore.batch1141.v1148type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1148: unbind mode
internal fun PlayerActivity.showV1148UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1148unbind
    FeaturePrefsStore.batch1141.v1148unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1148: undo mode
internal fun PlayerActivity.showV1148UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1148undo
    FeaturePrefsStore.batch1141.v1148undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1148: union mode
internal fun PlayerActivity.showV1148UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1148union
    FeaturePrefsStore.batch1141.v1148union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1148: unit level
internal fun PlayerActivity.showV1148UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1148unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1148unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1148: unknown level
internal fun PlayerActivity.showV1148UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1148unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1148unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1148: unlock level
internal fun PlayerActivity.showV1148UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1148unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1148unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1148: unmount level
internal fun PlayerActivity.showV1148UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1148unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1148unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1148: unsafe level
internal fun PlayerActivity.showV1148UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1148unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1148unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1148: update mode
internal fun PlayerActivity.showV1148UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1148update
    FeaturePrefsStore.batch1141.v1148update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1148: upgrade mode
internal fun PlayerActivity.showV1148UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1148upgrade
    FeaturePrefsStore.batch1141.v1148upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1148: upload mode
internal fun PlayerActivity.showV1148UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1148upload
    FeaturePrefsStore.batch1141.v1148upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1148: upper mode
internal fun PlayerActivity.showV1148UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1148upper
    FeaturePrefsStore.batch1141.v1148upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1148: upscale mode
internal fun PlayerActivity.showV1148UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1148upscale
    FeaturePrefsStore.batch1141.v1148upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1149: turn mode
internal fun PlayerActivity.showV1149TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1149turn
    FeaturePrefsStore.batch1141.v1149turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1149: type mode
internal fun PlayerActivity.showV1149TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1149type
    FeaturePrefsStore.batch1141.v1149type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1149: unbind mode
internal fun PlayerActivity.showV1149UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1149unbind
    FeaturePrefsStore.batch1141.v1149unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1149: undo mode
internal fun PlayerActivity.showV1149UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1149undo
    FeaturePrefsStore.batch1141.v1149undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1149: union mode
internal fun PlayerActivity.showV1149UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1149union
    FeaturePrefsStore.batch1141.v1149union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1149: unit level
internal fun PlayerActivity.showV1149UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1149unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1149unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1149: unknown level
internal fun PlayerActivity.showV1149UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1149unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1149unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1149: unlock level
internal fun PlayerActivity.showV1149UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1149unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1149unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1149: unmount level
internal fun PlayerActivity.showV1149UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1149unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1149unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1149: unsafe level
internal fun PlayerActivity.showV1149UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1149unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1149unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1149: update mode
internal fun PlayerActivity.showV1149UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1149update
    FeaturePrefsStore.batch1141.v1149update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1149: upgrade mode
internal fun PlayerActivity.showV1149UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1149upgrade
    FeaturePrefsStore.batch1141.v1149upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1149: upload mode
internal fun PlayerActivity.showV1149UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1149upload
    FeaturePrefsStore.batch1141.v1149upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1149: upper mode
internal fun PlayerActivity.showV1149UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1149upper
    FeaturePrefsStore.batch1141.v1149upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1149: upscale mode
internal fun PlayerActivity.showV1149UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1149upscale
    FeaturePrefsStore.batch1141.v1149upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1150: turn mode
internal fun PlayerActivity.showV1150TurnToggle() {
    val current = FeaturePrefsStore.batch1141.v1150turn
    FeaturePrefsStore.batch1141.v1150turn = !current
    AppToast.show(this, "turn: ${if (!current) "ON" else "OFF"}")
}

// v1150: type mode
internal fun PlayerActivity.showV1150TypeToggle() {
    val current = FeaturePrefsStore.batch1141.v1150type
    FeaturePrefsStore.batch1141.v1150type = !current
    AppToast.show(this, "type: ${if (!current) "ON" else "OFF"}")
}

// v1150: unbind mode
internal fun PlayerActivity.showV1150UnbindToggle() {
    val current = FeaturePrefsStore.batch1141.v1150unbind
    FeaturePrefsStore.batch1141.v1150unbind = !current
    AppToast.show(this, "unbind: ${if (!current) "ON" else "OFF"}")
}

// v1150: undo mode
internal fun PlayerActivity.showV1150UndoToggle() {
    val current = FeaturePrefsStore.batch1141.v1150undo
    FeaturePrefsStore.batch1141.v1150undo = !current
    AppToast.show(this, "undo: ${if (!current) "ON" else "OFF"}")
}

// v1150: union mode
internal fun PlayerActivity.showV1150UnionToggle() {
    val current = FeaturePrefsStore.batch1141.v1150union
    FeaturePrefsStore.batch1141.v1150union = !current
    AppToast.show(this, "union: ${if (!current) "ON" else "OFF"}")
}

// v1150: unit level
internal fun PlayerActivity.showV1150UnitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1150unit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1150unit = value
        AppToast.show(this, "unit: $value")
    }
}

// v1150: unknown level
internal fun PlayerActivity.showV1150UnknownDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1150unknown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unknown level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1150unknown = value
        AppToast.show(this, "unknown: $value")
    }
}

// v1150: unlock level
internal fun PlayerActivity.showV1150UnlockDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1150unlock).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unlock level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1150unlock = value
        AppToast.show(this, "unlock: $value")
    }
}

// v1150: unmount level
internal fun PlayerActivity.showV1150UnmountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1150unmount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unmount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1150unmount = value
        AppToast.show(this, "unmount: $value")
    }
}

// v1150: unsafe level
internal fun PlayerActivity.showV1150UnsafeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1141.v1150unsafe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "unsafe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1141.v1150unsafe = value
        AppToast.show(this, "unsafe: $value")
    }
}

// v1150: update mode
internal fun PlayerActivity.showV1150UpdateToggle() {
    val current = FeaturePrefsStore.batch1141.v1150update
    FeaturePrefsStore.batch1141.v1150update = !current
    AppToast.show(this, "update: ${if (!current) "ON" else "OFF"}")
}

// v1150: upgrade mode
internal fun PlayerActivity.showV1150UpgradeToggle() {
    val current = FeaturePrefsStore.batch1141.v1150upgrade
    FeaturePrefsStore.batch1141.v1150upgrade = !current
    AppToast.show(this, "upgrade: ${if (!current) "ON" else "OFF"}")
}

// v1150: upload mode
internal fun PlayerActivity.showV1150UploadToggle() {
    val current = FeaturePrefsStore.batch1141.v1150upload
    FeaturePrefsStore.batch1141.v1150upload = !current
    AppToast.show(this, "upload: ${if (!current) "ON" else "OFF"}")
}

// v1150: upper mode
internal fun PlayerActivity.showV1150UpperToggle() {
    val current = FeaturePrefsStore.batch1141.v1150upper
    FeaturePrefsStore.batch1141.v1150upper = !current
    AppToast.show(this, "upper: ${if (!current) "ON" else "OFF"}")
}

// v1150: upscale mode
internal fun PlayerActivity.showV1150UpscaleToggle() {
    val current = FeaturePrefsStore.batch1141.v1150upscale
    FeaturePrefsStore.batch1141.v1150upscale = !current
    AppToast.show(this, "upscale: ${if (!current) "ON" else "OFF"}")
}

// v1151: usage mode
internal fun PlayerActivity.showV1151UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1151usage
    FeaturePrefsStore.batch1151.v1151usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1151: user mode
internal fun PlayerActivity.showV1151UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1151user
    FeaturePrefsStore.batch1151.v1151user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1151: valid mode
internal fun PlayerActivity.showV1151ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1151valid
    FeaturePrefsStore.batch1151.v1151valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1151: value mode
internal fun PlayerActivity.showV1151ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1151value
    FeaturePrefsStore.batch1151.v1151value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1151: variable mode
internal fun PlayerActivity.showV1151VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1151variable
    FeaturePrefsStore.batch1151.v1151variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1151: version level
internal fun PlayerActivity.showV1151VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1151version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1151version = value
        AppToast.show(this, "version: $value")
    }
}

// v1151: video level
internal fun PlayerActivity.showV1151VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1151video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1151video = value
        AppToast.show(this, "video: $value")
    }
}

// v1151: view level
internal fun PlayerActivity.showV1151ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1151view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1151view = value
        AppToast.show(this, "view: $value")
    }
}

// v1151: virtual level
internal fun PlayerActivity.showV1151VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1151virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1151virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1151: visible level
internal fun PlayerActivity.showV1151VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1151visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1151visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1151: void mode
internal fun PlayerActivity.showV1151VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1151void
    FeaturePrefsStore.batch1151.v1151void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1151: voice mode
internal fun PlayerActivity.showV1151VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1151voice
    FeaturePrefsStore.batch1151.v1151voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1151: volume mode
internal fun PlayerActivity.showV1151VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1151volume
    FeaturePrefsStore.batch1151.v1151volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1151: wait mode
internal fun PlayerActivity.showV1151WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1151wait
    FeaturePrefsStore.batch1151.v1151wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1151: wake mode
internal fun PlayerActivity.showV1151WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1151wake
    FeaturePrefsStore.batch1151.v1151wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1152: usage mode
internal fun PlayerActivity.showV1152UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1152usage
    FeaturePrefsStore.batch1151.v1152usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1152: user mode
internal fun PlayerActivity.showV1152UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1152user
    FeaturePrefsStore.batch1151.v1152user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1152: valid mode
internal fun PlayerActivity.showV1152ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1152valid
    FeaturePrefsStore.batch1151.v1152valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1152: value mode
internal fun PlayerActivity.showV1152ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1152value
    FeaturePrefsStore.batch1151.v1152value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1152: variable mode
internal fun PlayerActivity.showV1152VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1152variable
    FeaturePrefsStore.batch1151.v1152variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1152: version level
internal fun PlayerActivity.showV1152VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1152version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1152version = value
        AppToast.show(this, "version: $value")
    }
}

// v1152: video level
internal fun PlayerActivity.showV1152VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1152video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1152video = value
        AppToast.show(this, "video: $value")
    }
}

// v1152: view level
internal fun PlayerActivity.showV1152ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1152view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1152view = value
        AppToast.show(this, "view: $value")
    }
}

// v1152: virtual level
internal fun PlayerActivity.showV1152VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1152virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1152virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1152: visible level
internal fun PlayerActivity.showV1152VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1152visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1152visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1152: void mode
internal fun PlayerActivity.showV1152VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1152void
    FeaturePrefsStore.batch1151.v1152void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1152: voice mode
internal fun PlayerActivity.showV1152VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1152voice
    FeaturePrefsStore.batch1151.v1152voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1152: volume mode
internal fun PlayerActivity.showV1152VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1152volume
    FeaturePrefsStore.batch1151.v1152volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1152: wait mode
internal fun PlayerActivity.showV1152WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1152wait
    FeaturePrefsStore.batch1151.v1152wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1152: wake mode
internal fun PlayerActivity.showV1152WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1152wake
    FeaturePrefsStore.batch1151.v1152wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1153: usage mode
internal fun PlayerActivity.showV1153UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1153usage
    FeaturePrefsStore.batch1151.v1153usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1153: user mode
internal fun PlayerActivity.showV1153UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1153user
    FeaturePrefsStore.batch1151.v1153user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1153: valid mode
internal fun PlayerActivity.showV1153ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1153valid
    FeaturePrefsStore.batch1151.v1153valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1153: value mode
internal fun PlayerActivity.showV1153ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1153value
    FeaturePrefsStore.batch1151.v1153value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1153: variable mode
internal fun PlayerActivity.showV1153VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1153variable
    FeaturePrefsStore.batch1151.v1153variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1153: version level
internal fun PlayerActivity.showV1153VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1153version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1153version = value
        AppToast.show(this, "version: $value")
    }
}

// v1153: video level
internal fun PlayerActivity.showV1153VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1153video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1153video = value
        AppToast.show(this, "video: $value")
    }
}

// v1153: view level
internal fun PlayerActivity.showV1153ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1153view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1153view = value
        AppToast.show(this, "view: $value")
    }
}

// v1153: virtual level
internal fun PlayerActivity.showV1153VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1153virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1153virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1153: visible level
internal fun PlayerActivity.showV1153VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1153visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1153visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1153: void mode
internal fun PlayerActivity.showV1153VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1153void
    FeaturePrefsStore.batch1151.v1153void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1153: voice mode
internal fun PlayerActivity.showV1153VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1153voice
    FeaturePrefsStore.batch1151.v1153voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1153: volume mode
internal fun PlayerActivity.showV1153VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1153volume
    FeaturePrefsStore.batch1151.v1153volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1153: wait mode
internal fun PlayerActivity.showV1153WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1153wait
    FeaturePrefsStore.batch1151.v1153wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1153: wake mode
internal fun PlayerActivity.showV1153WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1153wake
    FeaturePrefsStore.batch1151.v1153wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1154: usage mode
internal fun PlayerActivity.showV1154UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1154usage
    FeaturePrefsStore.batch1151.v1154usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1154: user mode
internal fun PlayerActivity.showV1154UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1154user
    FeaturePrefsStore.batch1151.v1154user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1154: valid mode
internal fun PlayerActivity.showV1154ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1154valid
    FeaturePrefsStore.batch1151.v1154valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1154: value mode
internal fun PlayerActivity.showV1154ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1154value
    FeaturePrefsStore.batch1151.v1154value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1154: variable mode
internal fun PlayerActivity.showV1154VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1154variable
    FeaturePrefsStore.batch1151.v1154variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1154: version level
internal fun PlayerActivity.showV1154VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1154version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1154version = value
        AppToast.show(this, "version: $value")
    }
}

// v1154: video level
internal fun PlayerActivity.showV1154VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1154video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1154video = value
        AppToast.show(this, "video: $value")
    }
}

// v1154: view level
internal fun PlayerActivity.showV1154ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1154view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1154view = value
        AppToast.show(this, "view: $value")
    }
}

// v1154: virtual level
internal fun PlayerActivity.showV1154VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1154virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1154virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1154: visible level
internal fun PlayerActivity.showV1154VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1154visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1154visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1154: void mode
internal fun PlayerActivity.showV1154VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1154void
    FeaturePrefsStore.batch1151.v1154void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1154: voice mode
internal fun PlayerActivity.showV1154VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1154voice
    FeaturePrefsStore.batch1151.v1154voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1154: volume mode
internal fun PlayerActivity.showV1154VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1154volume
    FeaturePrefsStore.batch1151.v1154volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1154: wait mode
internal fun PlayerActivity.showV1154WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1154wait
    FeaturePrefsStore.batch1151.v1154wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1154: wake mode
internal fun PlayerActivity.showV1154WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1154wake
    FeaturePrefsStore.batch1151.v1154wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1155: usage mode
internal fun PlayerActivity.showV1155UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1155usage
    FeaturePrefsStore.batch1151.v1155usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1155: user mode
internal fun PlayerActivity.showV1155UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1155user
    FeaturePrefsStore.batch1151.v1155user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1155: valid mode
internal fun PlayerActivity.showV1155ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1155valid
    FeaturePrefsStore.batch1151.v1155valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1155: value mode
internal fun PlayerActivity.showV1155ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1155value
    FeaturePrefsStore.batch1151.v1155value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1155: variable mode
internal fun PlayerActivity.showV1155VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1155variable
    FeaturePrefsStore.batch1151.v1155variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1155: version level
internal fun PlayerActivity.showV1155VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1155version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1155version = value
        AppToast.show(this, "version: $value")
    }
}

// v1155: video level
internal fun PlayerActivity.showV1155VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1155video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1155video = value
        AppToast.show(this, "video: $value")
    }
}

// v1155: view level
internal fun PlayerActivity.showV1155ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1155view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1155view = value
        AppToast.show(this, "view: $value")
    }
}

// v1155: virtual level
internal fun PlayerActivity.showV1155VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1155virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1155virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1155: visible level
internal fun PlayerActivity.showV1155VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1155visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1155visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1155: void mode
internal fun PlayerActivity.showV1155VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1155void
    FeaturePrefsStore.batch1151.v1155void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1155: voice mode
internal fun PlayerActivity.showV1155VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1155voice
    FeaturePrefsStore.batch1151.v1155voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1155: volume mode
internal fun PlayerActivity.showV1155VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1155volume
    FeaturePrefsStore.batch1151.v1155volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1155: wait mode
internal fun PlayerActivity.showV1155WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1155wait
    FeaturePrefsStore.batch1151.v1155wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1155: wake mode
internal fun PlayerActivity.showV1155WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1155wake
    FeaturePrefsStore.batch1151.v1155wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1156: usage mode
internal fun PlayerActivity.showV1156UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1156usage
    FeaturePrefsStore.batch1151.v1156usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1156: user mode
internal fun PlayerActivity.showV1156UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1156user
    FeaturePrefsStore.batch1151.v1156user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1156: valid mode
internal fun PlayerActivity.showV1156ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1156valid
    FeaturePrefsStore.batch1151.v1156valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1156: value mode
internal fun PlayerActivity.showV1156ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1156value
    FeaturePrefsStore.batch1151.v1156value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1156: variable mode
internal fun PlayerActivity.showV1156VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1156variable
    FeaturePrefsStore.batch1151.v1156variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1156: version level
internal fun PlayerActivity.showV1156VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1156version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1156version = value
        AppToast.show(this, "version: $value")
    }
}

// v1156: video level
internal fun PlayerActivity.showV1156VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1156video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1156video = value
        AppToast.show(this, "video: $value")
    }
}

// v1156: view level
internal fun PlayerActivity.showV1156ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1156view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1156view = value
        AppToast.show(this, "view: $value")
    }
}

// v1156: virtual level
internal fun PlayerActivity.showV1156VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1156virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1156virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1156: visible level
internal fun PlayerActivity.showV1156VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1156visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1156visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1156: void mode
internal fun PlayerActivity.showV1156VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1156void
    FeaturePrefsStore.batch1151.v1156void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1156: voice mode
internal fun PlayerActivity.showV1156VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1156voice
    FeaturePrefsStore.batch1151.v1156voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1156: volume mode
internal fun PlayerActivity.showV1156VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1156volume
    FeaturePrefsStore.batch1151.v1156volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1156: wait mode
internal fun PlayerActivity.showV1156WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1156wait
    FeaturePrefsStore.batch1151.v1156wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1156: wake mode
internal fun PlayerActivity.showV1156WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1156wake
    FeaturePrefsStore.batch1151.v1156wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1157: usage mode
internal fun PlayerActivity.showV1157UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1157usage
    FeaturePrefsStore.batch1151.v1157usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1157: user mode
internal fun PlayerActivity.showV1157UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1157user
    FeaturePrefsStore.batch1151.v1157user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1157: valid mode
internal fun PlayerActivity.showV1157ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1157valid
    FeaturePrefsStore.batch1151.v1157valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1157: value mode
internal fun PlayerActivity.showV1157ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1157value
    FeaturePrefsStore.batch1151.v1157value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1157: variable mode
internal fun PlayerActivity.showV1157VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1157variable
    FeaturePrefsStore.batch1151.v1157variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1157: version level
internal fun PlayerActivity.showV1157VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1157version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1157version = value
        AppToast.show(this, "version: $value")
    }
}

// v1157: video level
internal fun PlayerActivity.showV1157VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1157video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1157video = value
        AppToast.show(this, "video: $value")
    }
}

// v1157: view level
internal fun PlayerActivity.showV1157ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1157view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1157view = value
        AppToast.show(this, "view: $value")
    }
}

// v1157: virtual level
internal fun PlayerActivity.showV1157VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1157virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1157virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1157: visible level
internal fun PlayerActivity.showV1157VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1157visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1157visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1157: void mode
internal fun PlayerActivity.showV1157VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1157void
    FeaturePrefsStore.batch1151.v1157void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1157: voice mode
internal fun PlayerActivity.showV1157VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1157voice
    FeaturePrefsStore.batch1151.v1157voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1157: volume mode
internal fun PlayerActivity.showV1157VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1157volume
    FeaturePrefsStore.batch1151.v1157volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1157: wait mode
internal fun PlayerActivity.showV1157WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1157wait
    FeaturePrefsStore.batch1151.v1157wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1157: wake mode
internal fun PlayerActivity.showV1157WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1157wake
    FeaturePrefsStore.batch1151.v1157wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1158: usage mode
internal fun PlayerActivity.showV1158UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1158usage
    FeaturePrefsStore.batch1151.v1158usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1158: user mode
internal fun PlayerActivity.showV1158UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1158user
    FeaturePrefsStore.batch1151.v1158user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1158: valid mode
internal fun PlayerActivity.showV1158ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1158valid
    FeaturePrefsStore.batch1151.v1158valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1158: value mode
internal fun PlayerActivity.showV1158ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1158value
    FeaturePrefsStore.batch1151.v1158value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1158: variable mode
internal fun PlayerActivity.showV1158VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1158variable
    FeaturePrefsStore.batch1151.v1158variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1158: version level
internal fun PlayerActivity.showV1158VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1158version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1158version = value
        AppToast.show(this, "version: $value")
    }
}

// v1158: video level
internal fun PlayerActivity.showV1158VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1158video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1158video = value
        AppToast.show(this, "video: $value")
    }
}

// v1158: view level
internal fun PlayerActivity.showV1158ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1158view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1158view = value
        AppToast.show(this, "view: $value")
    }
}

// v1158: virtual level
internal fun PlayerActivity.showV1158VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1158virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1158virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1158: visible level
internal fun PlayerActivity.showV1158VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1158visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1158visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1158: void mode
internal fun PlayerActivity.showV1158VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1158void
    FeaturePrefsStore.batch1151.v1158void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1158: voice mode
internal fun PlayerActivity.showV1158VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1158voice
    FeaturePrefsStore.batch1151.v1158voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1158: volume mode
internal fun PlayerActivity.showV1158VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1158volume
    FeaturePrefsStore.batch1151.v1158volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1158: wait mode
internal fun PlayerActivity.showV1158WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1158wait
    FeaturePrefsStore.batch1151.v1158wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1158: wake mode
internal fun PlayerActivity.showV1158WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1158wake
    FeaturePrefsStore.batch1151.v1158wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1159: usage mode
internal fun PlayerActivity.showV1159UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1159usage
    FeaturePrefsStore.batch1151.v1159usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1159: user mode
internal fun PlayerActivity.showV1159UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1159user
    FeaturePrefsStore.batch1151.v1159user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1159: valid mode
internal fun PlayerActivity.showV1159ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1159valid
    FeaturePrefsStore.batch1151.v1159valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1159: value mode
internal fun PlayerActivity.showV1159ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1159value
    FeaturePrefsStore.batch1151.v1159value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1159: variable mode
internal fun PlayerActivity.showV1159VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1159variable
    FeaturePrefsStore.batch1151.v1159variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1159: version level
internal fun PlayerActivity.showV1159VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1159version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1159version = value
        AppToast.show(this, "version: $value")
    }
}

// v1159: video level
internal fun PlayerActivity.showV1159VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1159video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1159video = value
        AppToast.show(this, "video: $value")
    }
}

// v1159: view level
internal fun PlayerActivity.showV1159ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1159view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1159view = value
        AppToast.show(this, "view: $value")
    }
}

// v1159: virtual level
internal fun PlayerActivity.showV1159VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1159virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1159virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1159: visible level
internal fun PlayerActivity.showV1159VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1159visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1159visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1159: void mode
internal fun PlayerActivity.showV1159VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1159void
    FeaturePrefsStore.batch1151.v1159void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1159: voice mode
internal fun PlayerActivity.showV1159VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1159voice
    FeaturePrefsStore.batch1151.v1159voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1159: volume mode
internal fun PlayerActivity.showV1159VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1159volume
    FeaturePrefsStore.batch1151.v1159volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1159: wait mode
internal fun PlayerActivity.showV1159WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1159wait
    FeaturePrefsStore.batch1151.v1159wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1159: wake mode
internal fun PlayerActivity.showV1159WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1159wake
    FeaturePrefsStore.batch1151.v1159wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1160: usage mode
internal fun PlayerActivity.showV1160UsageToggle() {
    val current = FeaturePrefsStore.batch1151.v1160usage
    FeaturePrefsStore.batch1151.v1160usage = !current
    AppToast.show(this, "usage: ${if (!current) "ON" else "OFF"}")
}

// v1160: user mode
internal fun PlayerActivity.showV1160UserToggle() {
    val current = FeaturePrefsStore.batch1151.v1160user
    FeaturePrefsStore.batch1151.v1160user = !current
    AppToast.show(this, "user: ${if (!current) "ON" else "OFF"}")
}

// v1160: valid mode
internal fun PlayerActivity.showV1160ValidToggle() {
    val current = FeaturePrefsStore.batch1151.v1160valid
    FeaturePrefsStore.batch1151.v1160valid = !current
    AppToast.show(this, "valid: ${if (!current) "ON" else "OFF"}")
}

// v1160: value mode
internal fun PlayerActivity.showV1160ValueToggle() {
    val current = FeaturePrefsStore.batch1151.v1160value
    FeaturePrefsStore.batch1151.v1160value = !current
    AppToast.show(this, "value: ${if (!current) "ON" else "OFF"}")
}

// v1160: variable mode
internal fun PlayerActivity.showV1160VariableToggle() {
    val current = FeaturePrefsStore.batch1151.v1160variable
    FeaturePrefsStore.batch1151.v1160variable = !current
    AppToast.show(this, "variable: ${if (!current) "ON" else "OFF"}")
}

// v1160: version level
internal fun PlayerActivity.showV1160VersionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1160version).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "version level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1160version = value
        AppToast.show(this, "version: $value")
    }
}

// v1160: video level
internal fun PlayerActivity.showV1160VideoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1160video).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "video level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1160video = value
        AppToast.show(this, "video: $value")
    }
}

// v1160: view level
internal fun PlayerActivity.showV1160ViewDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1160view).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "view level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1160view = value
        AppToast.show(this, "view: $value")
    }
}

// v1160: virtual level
internal fun PlayerActivity.showV1160VirtualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1160virtual).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "virtual level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1160virtual = value
        AppToast.show(this, "virtual: $value")
    }
}

// v1160: visible level
internal fun PlayerActivity.showV1160VisibleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1151.v1160visible).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visible level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1151.v1160visible = value
        AppToast.show(this, "visible: $value")
    }
}

// v1160: void mode
internal fun PlayerActivity.showV1160VoidToggle() {
    val current = FeaturePrefsStore.batch1151.v1160void
    FeaturePrefsStore.batch1151.v1160void = !current
    AppToast.show(this, "void: ${if (!current) "ON" else "OFF"}")
}

// v1160: voice mode
internal fun PlayerActivity.showV1160VoiceToggle() {
    val current = FeaturePrefsStore.batch1151.v1160voice
    FeaturePrefsStore.batch1151.v1160voice = !current
    AppToast.show(this, "voice: ${if (!current) "ON" else "OFF"}")
}

// v1160: volume mode
internal fun PlayerActivity.showV1160VolumeToggle() {
    val current = FeaturePrefsStore.batch1151.v1160volume
    FeaturePrefsStore.batch1151.v1160volume = !current
    AppToast.show(this, "volume: ${if (!current) "ON" else "OFF"}")
}

// v1160: wait mode
internal fun PlayerActivity.showV1160WaitToggle() {
    val current = FeaturePrefsStore.batch1151.v1160wait
    FeaturePrefsStore.batch1151.v1160wait = !current
    AppToast.show(this, "wait: ${if (!current) "ON" else "OFF"}")
}

// v1160: wake mode
internal fun PlayerActivity.showV1160WakeToggle() {
    val current = FeaturePrefsStore.batch1151.v1160wake
    FeaturePrefsStore.batch1151.v1160wake = !current
    AppToast.show(this, "wake: ${if (!current) "ON" else "OFF"}")
}

// v1161: walk mode
internal fun PlayerActivity.showV1161WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1161walk
    FeaturePrefsStore.batch1161.v1161walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1161: warm mode
internal fun PlayerActivity.showV1161WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1161warm
    FeaturePrefsStore.batch1161.v1161warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1161: warn mode
internal fun PlayerActivity.showV1161WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1161warn
    FeaturePrefsStore.batch1161.v1161warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1161: warning mode
internal fun PlayerActivity.showV1161WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1161warning
    FeaturePrefsStore.batch1161.v1161warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1161: watch mode
internal fun PlayerActivity.showV1161WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1161watch
    FeaturePrefsStore.batch1161.v1161watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1161: weak level
internal fun PlayerActivity.showV1161WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1161weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1161weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1161: web level
internal fun PlayerActivity.showV1161WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1161web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1161web = value
        AppToast.show(this, "web: $value")
    }
}

// v1161: weight level
internal fun PlayerActivity.showV1161WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1161weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1161weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1161: where level
internal fun PlayerActivity.showV1161WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1161where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1161where = value
        AppToast.show(this, "where: $value")
    }
}

// v1161: widget level
internal fun PlayerActivity.showV1161WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1161widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1161widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1161: width mode
internal fun PlayerActivity.showV1161WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1161width
    FeaturePrefsStore.batch1161.v1161width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1161: wildcard mode
internal fun PlayerActivity.showV1161WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1161wildcard
    FeaturePrefsStore.batch1161.v1161wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1161: window mode
internal fun PlayerActivity.showV1161WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1161window
    FeaturePrefsStore.batch1161.v1161window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1161: wire mode
internal fun PlayerActivity.showV1161WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1161wire
    FeaturePrefsStore.batch1161.v1161wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1161: word mode
internal fun PlayerActivity.showV1161WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1161word
    FeaturePrefsStore.batch1161.v1161word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1162: walk mode
internal fun PlayerActivity.showV1162WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1162walk
    FeaturePrefsStore.batch1161.v1162walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1162: warm mode
internal fun PlayerActivity.showV1162WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1162warm
    FeaturePrefsStore.batch1161.v1162warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1162: warn mode
internal fun PlayerActivity.showV1162WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1162warn
    FeaturePrefsStore.batch1161.v1162warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1162: warning mode
internal fun PlayerActivity.showV1162WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1162warning
    FeaturePrefsStore.batch1161.v1162warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1162: watch mode
internal fun PlayerActivity.showV1162WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1162watch
    FeaturePrefsStore.batch1161.v1162watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1162: weak level
internal fun PlayerActivity.showV1162WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1162weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1162weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1162: web level
internal fun PlayerActivity.showV1162WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1162web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1162web = value
        AppToast.show(this, "web: $value")
    }
}

// v1162: weight level
internal fun PlayerActivity.showV1162WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1162weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1162weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1162: where level
internal fun PlayerActivity.showV1162WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1162where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1162where = value
        AppToast.show(this, "where: $value")
    }
}

// v1162: widget level
internal fun PlayerActivity.showV1162WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1162widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1162widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1162: width mode
internal fun PlayerActivity.showV1162WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1162width
    FeaturePrefsStore.batch1161.v1162width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1162: wildcard mode
internal fun PlayerActivity.showV1162WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1162wildcard
    FeaturePrefsStore.batch1161.v1162wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1162: window mode
internal fun PlayerActivity.showV1162WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1162window
    FeaturePrefsStore.batch1161.v1162window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1162: wire mode
internal fun PlayerActivity.showV1162WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1162wire
    FeaturePrefsStore.batch1161.v1162wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1162: word mode
internal fun PlayerActivity.showV1162WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1162word
    FeaturePrefsStore.batch1161.v1162word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1163: walk mode
internal fun PlayerActivity.showV1163WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1163walk
    FeaturePrefsStore.batch1161.v1163walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1163: warm mode
internal fun PlayerActivity.showV1163WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1163warm
    FeaturePrefsStore.batch1161.v1163warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1163: warn mode
internal fun PlayerActivity.showV1163WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1163warn
    FeaturePrefsStore.batch1161.v1163warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1163: warning mode
internal fun PlayerActivity.showV1163WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1163warning
    FeaturePrefsStore.batch1161.v1163warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1163: watch mode
internal fun PlayerActivity.showV1163WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1163watch
    FeaturePrefsStore.batch1161.v1163watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1163: weak level
internal fun PlayerActivity.showV1163WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1163weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1163weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1163: web level
internal fun PlayerActivity.showV1163WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1163web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1163web = value
        AppToast.show(this, "web: $value")
    }
}

// v1163: weight level
internal fun PlayerActivity.showV1163WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1163weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1163weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1163: where level
internal fun PlayerActivity.showV1163WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1163where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1163where = value
        AppToast.show(this, "where: $value")
    }
}

// v1163: widget level
internal fun PlayerActivity.showV1163WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1163widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1163widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1163: width mode
internal fun PlayerActivity.showV1163WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1163width
    FeaturePrefsStore.batch1161.v1163width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1163: wildcard mode
internal fun PlayerActivity.showV1163WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1163wildcard
    FeaturePrefsStore.batch1161.v1163wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1163: window mode
internal fun PlayerActivity.showV1163WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1163window
    FeaturePrefsStore.batch1161.v1163window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1163: wire mode
internal fun PlayerActivity.showV1163WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1163wire
    FeaturePrefsStore.batch1161.v1163wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1163: word mode
internal fun PlayerActivity.showV1163WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1163word
    FeaturePrefsStore.batch1161.v1163word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1164: walk mode
internal fun PlayerActivity.showV1164WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1164walk
    FeaturePrefsStore.batch1161.v1164walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1164: warm mode
internal fun PlayerActivity.showV1164WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1164warm
    FeaturePrefsStore.batch1161.v1164warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1164: warn mode
internal fun PlayerActivity.showV1164WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1164warn
    FeaturePrefsStore.batch1161.v1164warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1164: warning mode
internal fun PlayerActivity.showV1164WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1164warning
    FeaturePrefsStore.batch1161.v1164warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1164: watch mode
internal fun PlayerActivity.showV1164WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1164watch
    FeaturePrefsStore.batch1161.v1164watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1164: weak level
internal fun PlayerActivity.showV1164WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1164weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1164weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1164: web level
internal fun PlayerActivity.showV1164WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1164web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1164web = value
        AppToast.show(this, "web: $value")
    }
}

// v1164: weight level
internal fun PlayerActivity.showV1164WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1164weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1164weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1164: where level
internal fun PlayerActivity.showV1164WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1164where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1164where = value
        AppToast.show(this, "where: $value")
    }
}

// v1164: widget level
internal fun PlayerActivity.showV1164WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1164widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1164widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1164: width mode
internal fun PlayerActivity.showV1164WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1164width
    FeaturePrefsStore.batch1161.v1164width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1164: wildcard mode
internal fun PlayerActivity.showV1164WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1164wildcard
    FeaturePrefsStore.batch1161.v1164wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1164: window mode
internal fun PlayerActivity.showV1164WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1164window
    FeaturePrefsStore.batch1161.v1164window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1164: wire mode
internal fun PlayerActivity.showV1164WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1164wire
    FeaturePrefsStore.batch1161.v1164wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1164: word mode
internal fun PlayerActivity.showV1164WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1164word
    FeaturePrefsStore.batch1161.v1164word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1165: walk mode
internal fun PlayerActivity.showV1165WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1165walk
    FeaturePrefsStore.batch1161.v1165walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1165: warm mode
internal fun PlayerActivity.showV1165WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1165warm
    FeaturePrefsStore.batch1161.v1165warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1165: warn mode
internal fun PlayerActivity.showV1165WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1165warn
    FeaturePrefsStore.batch1161.v1165warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1165: warning mode
internal fun PlayerActivity.showV1165WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1165warning
    FeaturePrefsStore.batch1161.v1165warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1165: watch mode
internal fun PlayerActivity.showV1165WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1165watch
    FeaturePrefsStore.batch1161.v1165watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1165: weak level
internal fun PlayerActivity.showV1165WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1165weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1165weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1165: web level
internal fun PlayerActivity.showV1165WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1165web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1165web = value
        AppToast.show(this, "web: $value")
    }
}

// v1165: weight level
internal fun PlayerActivity.showV1165WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1165weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1165weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1165: where level
internal fun PlayerActivity.showV1165WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1165where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1165where = value
        AppToast.show(this, "where: $value")
    }
}

// v1165: widget level
internal fun PlayerActivity.showV1165WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1165widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1165widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1165: width mode
internal fun PlayerActivity.showV1165WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1165width
    FeaturePrefsStore.batch1161.v1165width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1165: wildcard mode
internal fun PlayerActivity.showV1165WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1165wildcard
    FeaturePrefsStore.batch1161.v1165wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1165: window mode
internal fun PlayerActivity.showV1165WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1165window
    FeaturePrefsStore.batch1161.v1165window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1165: wire mode
internal fun PlayerActivity.showV1165WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1165wire
    FeaturePrefsStore.batch1161.v1165wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1165: word mode
internal fun PlayerActivity.showV1165WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1165word
    FeaturePrefsStore.batch1161.v1165word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1166: walk mode
internal fun PlayerActivity.showV1166WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1166walk
    FeaturePrefsStore.batch1161.v1166walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1166: warm mode
internal fun PlayerActivity.showV1166WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1166warm
    FeaturePrefsStore.batch1161.v1166warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1166: warn mode
internal fun PlayerActivity.showV1166WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1166warn
    FeaturePrefsStore.batch1161.v1166warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1166: warning mode
internal fun PlayerActivity.showV1166WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1166warning
    FeaturePrefsStore.batch1161.v1166warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1166: watch mode
internal fun PlayerActivity.showV1166WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1166watch
    FeaturePrefsStore.batch1161.v1166watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1166: weak level
internal fun PlayerActivity.showV1166WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1166weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1166weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1166: web level
internal fun PlayerActivity.showV1166WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1166web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1166web = value
        AppToast.show(this, "web: $value")
    }
}

// v1166: weight level
internal fun PlayerActivity.showV1166WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1166weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1166weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1166: where level
internal fun PlayerActivity.showV1166WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1166where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1166where = value
        AppToast.show(this, "where: $value")
    }
}

// v1166: widget level
internal fun PlayerActivity.showV1166WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1166widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1166widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1166: width mode
internal fun PlayerActivity.showV1166WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1166width
    FeaturePrefsStore.batch1161.v1166width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1166: wildcard mode
internal fun PlayerActivity.showV1166WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1166wildcard
    FeaturePrefsStore.batch1161.v1166wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1166: window mode
internal fun PlayerActivity.showV1166WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1166window
    FeaturePrefsStore.batch1161.v1166window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1166: wire mode
internal fun PlayerActivity.showV1166WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1166wire
    FeaturePrefsStore.batch1161.v1166wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1166: word mode
internal fun PlayerActivity.showV1166WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1166word
    FeaturePrefsStore.batch1161.v1166word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1167: walk mode
internal fun PlayerActivity.showV1167WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1167walk
    FeaturePrefsStore.batch1161.v1167walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1167: warm mode
internal fun PlayerActivity.showV1167WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1167warm
    FeaturePrefsStore.batch1161.v1167warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1167: warn mode
internal fun PlayerActivity.showV1167WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1167warn
    FeaturePrefsStore.batch1161.v1167warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1167: warning mode
internal fun PlayerActivity.showV1167WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1167warning
    FeaturePrefsStore.batch1161.v1167warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1167: watch mode
internal fun PlayerActivity.showV1167WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1167watch
    FeaturePrefsStore.batch1161.v1167watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1167: weak level
internal fun PlayerActivity.showV1167WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1167weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1167weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1167: web level
internal fun PlayerActivity.showV1167WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1167web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1167web = value
        AppToast.show(this, "web: $value")
    }
}

// v1167: weight level
internal fun PlayerActivity.showV1167WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1167weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1167weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1167: where level
internal fun PlayerActivity.showV1167WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1167where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1167where = value
        AppToast.show(this, "where: $value")
    }
}

// v1167: widget level
internal fun PlayerActivity.showV1167WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1167widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1167widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1167: width mode
internal fun PlayerActivity.showV1167WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1167width
    FeaturePrefsStore.batch1161.v1167width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1167: wildcard mode
internal fun PlayerActivity.showV1167WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1167wildcard
    FeaturePrefsStore.batch1161.v1167wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1167: window mode
internal fun PlayerActivity.showV1167WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1167window
    FeaturePrefsStore.batch1161.v1167window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1167: wire mode
internal fun PlayerActivity.showV1167WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1167wire
    FeaturePrefsStore.batch1161.v1167wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1167: word mode
internal fun PlayerActivity.showV1167WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1167word
    FeaturePrefsStore.batch1161.v1167word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1168: walk mode
internal fun PlayerActivity.showV1168WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1168walk
    FeaturePrefsStore.batch1161.v1168walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1168: warm mode
internal fun PlayerActivity.showV1168WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1168warm
    FeaturePrefsStore.batch1161.v1168warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1168: warn mode
internal fun PlayerActivity.showV1168WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1168warn
    FeaturePrefsStore.batch1161.v1168warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1168: warning mode
internal fun PlayerActivity.showV1168WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1168warning
    FeaturePrefsStore.batch1161.v1168warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1168: watch mode
internal fun PlayerActivity.showV1168WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1168watch
    FeaturePrefsStore.batch1161.v1168watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1168: weak level
internal fun PlayerActivity.showV1168WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1168weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1168weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1168: web level
internal fun PlayerActivity.showV1168WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1168web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1168web = value
        AppToast.show(this, "web: $value")
    }
}

// v1168: weight level
internal fun PlayerActivity.showV1168WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1168weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1168weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1168: where level
internal fun PlayerActivity.showV1168WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1168where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1168where = value
        AppToast.show(this, "where: $value")
    }
}

// v1168: widget level
internal fun PlayerActivity.showV1168WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1168widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1168widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1168: width mode
internal fun PlayerActivity.showV1168WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1168width
    FeaturePrefsStore.batch1161.v1168width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1168: wildcard mode
internal fun PlayerActivity.showV1168WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1168wildcard
    FeaturePrefsStore.batch1161.v1168wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1168: window mode
internal fun PlayerActivity.showV1168WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1168window
    FeaturePrefsStore.batch1161.v1168window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1168: wire mode
internal fun PlayerActivity.showV1168WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1168wire
    FeaturePrefsStore.batch1161.v1168wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1168: word mode
internal fun PlayerActivity.showV1168WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1168word
    FeaturePrefsStore.batch1161.v1168word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1169: walk mode
internal fun PlayerActivity.showV1169WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1169walk
    FeaturePrefsStore.batch1161.v1169walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1169: warm mode
internal fun PlayerActivity.showV1169WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1169warm
    FeaturePrefsStore.batch1161.v1169warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1169: warn mode
internal fun PlayerActivity.showV1169WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1169warn
    FeaturePrefsStore.batch1161.v1169warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1169: warning mode
internal fun PlayerActivity.showV1169WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1169warning
    FeaturePrefsStore.batch1161.v1169warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1169: watch mode
internal fun PlayerActivity.showV1169WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1169watch
    FeaturePrefsStore.batch1161.v1169watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1169: weak level
internal fun PlayerActivity.showV1169WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1169weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1169weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1169: web level
internal fun PlayerActivity.showV1169WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1169web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1169web = value
        AppToast.show(this, "web: $value")
    }
}

// v1169: weight level
internal fun PlayerActivity.showV1169WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1169weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1169weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1169: where level
internal fun PlayerActivity.showV1169WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1169where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1169where = value
        AppToast.show(this, "where: $value")
    }
}

// v1169: widget level
internal fun PlayerActivity.showV1169WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1169widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1169widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1169: width mode
internal fun PlayerActivity.showV1169WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1169width
    FeaturePrefsStore.batch1161.v1169width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1169: wildcard mode
internal fun PlayerActivity.showV1169WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1169wildcard
    FeaturePrefsStore.batch1161.v1169wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1169: window mode
internal fun PlayerActivity.showV1169WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1169window
    FeaturePrefsStore.batch1161.v1169window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1169: wire mode
internal fun PlayerActivity.showV1169WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1169wire
    FeaturePrefsStore.batch1161.v1169wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1169: word mode
internal fun PlayerActivity.showV1169WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1169word
    FeaturePrefsStore.batch1161.v1169word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1170: walk mode
internal fun PlayerActivity.showV1170WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1170walk
    FeaturePrefsStore.batch1161.v1170walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1170: warm mode
internal fun PlayerActivity.showV1170WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1170warm
    FeaturePrefsStore.batch1161.v1170warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1170: warn mode
internal fun PlayerActivity.showV1170WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1170warn
    FeaturePrefsStore.batch1161.v1170warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1170: warning mode
internal fun PlayerActivity.showV1170WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1170warning
    FeaturePrefsStore.batch1161.v1170warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1170: watch mode
internal fun PlayerActivity.showV1170WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1170watch
    FeaturePrefsStore.batch1161.v1170watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1170: weak level
internal fun PlayerActivity.showV1170WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1170weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1170weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1170: web level
internal fun PlayerActivity.showV1170WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1170web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1170web = value
        AppToast.show(this, "web: $value")
    }
}

// v1170: weight level
internal fun PlayerActivity.showV1170WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1170weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1170weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1170: where level
internal fun PlayerActivity.showV1170WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1170where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1170where = value
        AppToast.show(this, "where: $value")
    }
}

// v1170: widget level
internal fun PlayerActivity.showV1170WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1170widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1170widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1170: width mode
internal fun PlayerActivity.showV1170WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1170width
    FeaturePrefsStore.batch1161.v1170width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1170: wildcard mode
internal fun PlayerActivity.showV1170WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1170wildcard
    FeaturePrefsStore.batch1161.v1170wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1170: window mode
internal fun PlayerActivity.showV1170WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1170window
    FeaturePrefsStore.batch1161.v1170window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1170: wire mode
internal fun PlayerActivity.showV1170WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1170wire
    FeaturePrefsStore.batch1161.v1170wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1170: word mode
internal fun PlayerActivity.showV1170WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1170word
    FeaturePrefsStore.batch1161.v1170word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}
