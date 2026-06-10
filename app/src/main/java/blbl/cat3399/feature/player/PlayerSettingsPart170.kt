package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1881: compensated mode
internal fun PlayerActivity.showV1881CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881compensated
    FeaturePrefsStore.batch1881.v1881compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1881: compiled mode
internal fun PlayerActivity.showV1881CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1881compiled
    FeaturePrefsStore.batch1881.v1881compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1881: completed mode
internal fun PlayerActivity.showV1881CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881completed
    FeaturePrefsStore.batch1881.v1881completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1881: composed mode
internal fun PlayerActivity.showV1881ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881composed
    FeaturePrefsStore.batch1881.v1881composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1881: computed mode
internal fun PlayerActivity.showV1881ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881computed
    FeaturePrefsStore.batch1881.v1881computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1881: concentrated level
internal fun PlayerActivity.showV1881ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1881concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1881concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1881: concluded level
internal fun PlayerActivity.showV1881ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1881concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1881concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1881: conducted level
internal fun PlayerActivity.showV1881ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1881conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1881conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1881: confined level
internal fun PlayerActivity.showV1881ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1881confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1881confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1881: confirmed level
internal fun PlayerActivity.showV1881ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1881confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1881confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1881: connected mode
internal fun PlayerActivity.showV1881ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881connected
    FeaturePrefsStore.batch1881.v1881connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1881: conquered mode
internal fun PlayerActivity.showV1881ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1881conquered
    FeaturePrefsStore.batch1881.v1881conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1881: considered mode
internal fun PlayerActivity.showV1881ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1881considered
    FeaturePrefsStore.batch1881.v1881considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1881: consisted mode
internal fun PlayerActivity.showV1881ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881consisted
    FeaturePrefsStore.batch1881.v1881consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1881: constructed mode
internal fun PlayerActivity.showV1881ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1881constructed
    FeaturePrefsStore.batch1881.v1881constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1882: compensated mode
internal fun PlayerActivity.showV1882CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882compensated
    FeaturePrefsStore.batch1881.v1882compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1882: compiled mode
internal fun PlayerActivity.showV1882CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1882compiled
    FeaturePrefsStore.batch1881.v1882compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1882: completed mode
internal fun PlayerActivity.showV1882CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882completed
    FeaturePrefsStore.batch1881.v1882completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1882: composed mode
internal fun PlayerActivity.showV1882ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882composed
    FeaturePrefsStore.batch1881.v1882composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1882: computed mode
internal fun PlayerActivity.showV1882ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882computed
    FeaturePrefsStore.batch1881.v1882computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1882: concentrated level
internal fun PlayerActivity.showV1882ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1882concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1882concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1882: concluded level
internal fun PlayerActivity.showV1882ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1882concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1882concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1882: conducted level
internal fun PlayerActivity.showV1882ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1882conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1882conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1882: confined level
internal fun PlayerActivity.showV1882ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1882confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1882confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1882: confirmed level
internal fun PlayerActivity.showV1882ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1882confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1882confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1882: connected mode
internal fun PlayerActivity.showV1882ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882connected
    FeaturePrefsStore.batch1881.v1882connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1882: conquered mode
internal fun PlayerActivity.showV1882ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1882conquered
    FeaturePrefsStore.batch1881.v1882conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1882: considered mode
internal fun PlayerActivity.showV1882ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1882considered
    FeaturePrefsStore.batch1881.v1882considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1882: consisted mode
internal fun PlayerActivity.showV1882ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882consisted
    FeaturePrefsStore.batch1881.v1882consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1882: constructed mode
internal fun PlayerActivity.showV1882ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1882constructed
    FeaturePrefsStore.batch1881.v1882constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1883: compensated mode
internal fun PlayerActivity.showV1883CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883compensated
    FeaturePrefsStore.batch1881.v1883compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1883: compiled mode
internal fun PlayerActivity.showV1883CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1883compiled
    FeaturePrefsStore.batch1881.v1883compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1883: completed mode
internal fun PlayerActivity.showV1883CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883completed
    FeaturePrefsStore.batch1881.v1883completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1883: composed mode
internal fun PlayerActivity.showV1883ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883composed
    FeaturePrefsStore.batch1881.v1883composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1883: computed mode
internal fun PlayerActivity.showV1883ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883computed
    FeaturePrefsStore.batch1881.v1883computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1883: concentrated level
internal fun PlayerActivity.showV1883ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1883concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1883concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1883: concluded level
internal fun PlayerActivity.showV1883ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1883concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1883concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1883: conducted level
internal fun PlayerActivity.showV1883ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1883conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1883conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1883: confined level
internal fun PlayerActivity.showV1883ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1883confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1883confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1883: confirmed level
internal fun PlayerActivity.showV1883ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1883confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1883confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1883: connected mode
internal fun PlayerActivity.showV1883ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883connected
    FeaturePrefsStore.batch1881.v1883connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1883: conquered mode
internal fun PlayerActivity.showV1883ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1883conquered
    FeaturePrefsStore.batch1881.v1883conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1883: considered mode
internal fun PlayerActivity.showV1883ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1883considered
    FeaturePrefsStore.batch1881.v1883considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1883: consisted mode
internal fun PlayerActivity.showV1883ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883consisted
    FeaturePrefsStore.batch1881.v1883consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1883: constructed mode
internal fun PlayerActivity.showV1883ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1883constructed
    FeaturePrefsStore.batch1881.v1883constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1884: compensated mode
internal fun PlayerActivity.showV1884CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884compensated
    FeaturePrefsStore.batch1881.v1884compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1884: compiled mode
internal fun PlayerActivity.showV1884CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1884compiled
    FeaturePrefsStore.batch1881.v1884compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1884: completed mode
internal fun PlayerActivity.showV1884CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884completed
    FeaturePrefsStore.batch1881.v1884completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1884: composed mode
internal fun PlayerActivity.showV1884ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884composed
    FeaturePrefsStore.batch1881.v1884composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1884: computed mode
internal fun PlayerActivity.showV1884ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884computed
    FeaturePrefsStore.batch1881.v1884computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1884: concentrated level
internal fun PlayerActivity.showV1884ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1884concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1884concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1884: concluded level
internal fun PlayerActivity.showV1884ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1884concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1884concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1884: conducted level
internal fun PlayerActivity.showV1884ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1884conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1884conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1884: confined level
internal fun PlayerActivity.showV1884ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1884confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1884confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1884: confirmed level
internal fun PlayerActivity.showV1884ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1884confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1884confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1884: connected mode
internal fun PlayerActivity.showV1884ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884connected
    FeaturePrefsStore.batch1881.v1884connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1884: conquered mode
internal fun PlayerActivity.showV1884ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1884conquered
    FeaturePrefsStore.batch1881.v1884conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1884: considered mode
internal fun PlayerActivity.showV1884ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1884considered
    FeaturePrefsStore.batch1881.v1884considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1884: consisted mode
internal fun PlayerActivity.showV1884ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884consisted
    FeaturePrefsStore.batch1881.v1884consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1884: constructed mode
internal fun PlayerActivity.showV1884ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1884constructed
    FeaturePrefsStore.batch1881.v1884constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1885: compensated mode
internal fun PlayerActivity.showV1885CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885compensated
    FeaturePrefsStore.batch1881.v1885compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1885: compiled mode
internal fun PlayerActivity.showV1885CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1885compiled
    FeaturePrefsStore.batch1881.v1885compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1885: completed mode
internal fun PlayerActivity.showV1885CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885completed
    FeaturePrefsStore.batch1881.v1885completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1885: composed mode
internal fun PlayerActivity.showV1885ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885composed
    FeaturePrefsStore.batch1881.v1885composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1885: computed mode
internal fun PlayerActivity.showV1885ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885computed
    FeaturePrefsStore.batch1881.v1885computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1885: concentrated level
internal fun PlayerActivity.showV1885ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1885concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1885concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1885: concluded level
internal fun PlayerActivity.showV1885ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1885concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1885concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1885: conducted level
internal fun PlayerActivity.showV1885ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1885conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1885conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1885: confined level
internal fun PlayerActivity.showV1885ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1885confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1885confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1885: confirmed level
internal fun PlayerActivity.showV1885ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1885confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1885confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1885: connected mode
internal fun PlayerActivity.showV1885ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885connected
    FeaturePrefsStore.batch1881.v1885connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1885: conquered mode
internal fun PlayerActivity.showV1885ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1885conquered
    FeaturePrefsStore.batch1881.v1885conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1885: considered mode
internal fun PlayerActivity.showV1885ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1885considered
    FeaturePrefsStore.batch1881.v1885considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1885: consisted mode
internal fun PlayerActivity.showV1885ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885consisted
    FeaturePrefsStore.batch1881.v1885consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1885: constructed mode
internal fun PlayerActivity.showV1885ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1885constructed
    FeaturePrefsStore.batch1881.v1885constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1886: compensated mode
internal fun PlayerActivity.showV1886CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886compensated
    FeaturePrefsStore.batch1881.v1886compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1886: compiled mode
internal fun PlayerActivity.showV1886CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1886compiled
    FeaturePrefsStore.batch1881.v1886compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1886: completed mode
internal fun PlayerActivity.showV1886CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886completed
    FeaturePrefsStore.batch1881.v1886completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1886: composed mode
internal fun PlayerActivity.showV1886ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886composed
    FeaturePrefsStore.batch1881.v1886composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1886: computed mode
internal fun PlayerActivity.showV1886ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886computed
    FeaturePrefsStore.batch1881.v1886computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1886: concentrated level
internal fun PlayerActivity.showV1886ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1886concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1886concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1886: concluded level
internal fun PlayerActivity.showV1886ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1886concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1886concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1886: conducted level
internal fun PlayerActivity.showV1886ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1886conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1886conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1886: confined level
internal fun PlayerActivity.showV1886ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1886confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1886confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1886: confirmed level
internal fun PlayerActivity.showV1886ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1886confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1886confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1886: connected mode
internal fun PlayerActivity.showV1886ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886connected
    FeaturePrefsStore.batch1881.v1886connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1886: conquered mode
internal fun PlayerActivity.showV1886ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1886conquered
    FeaturePrefsStore.batch1881.v1886conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1886: considered mode
internal fun PlayerActivity.showV1886ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1886considered
    FeaturePrefsStore.batch1881.v1886considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1886: consisted mode
internal fun PlayerActivity.showV1886ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886consisted
    FeaturePrefsStore.batch1881.v1886consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1886: constructed mode
internal fun PlayerActivity.showV1886ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1886constructed
    FeaturePrefsStore.batch1881.v1886constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1887: compensated mode
internal fun PlayerActivity.showV1887CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887compensated
    FeaturePrefsStore.batch1881.v1887compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1887: compiled mode
internal fun PlayerActivity.showV1887CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1887compiled
    FeaturePrefsStore.batch1881.v1887compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1887: completed mode
internal fun PlayerActivity.showV1887CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887completed
    FeaturePrefsStore.batch1881.v1887completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1887: composed mode
internal fun PlayerActivity.showV1887ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887composed
    FeaturePrefsStore.batch1881.v1887composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1887: computed mode
internal fun PlayerActivity.showV1887ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887computed
    FeaturePrefsStore.batch1881.v1887computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1887: concentrated level
internal fun PlayerActivity.showV1887ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1887concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1887concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1887: concluded level
internal fun PlayerActivity.showV1887ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1887concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1887concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1887: conducted level
internal fun PlayerActivity.showV1887ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1887conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1887conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1887: confined level
internal fun PlayerActivity.showV1887ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1887confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1887confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1887: confirmed level
internal fun PlayerActivity.showV1887ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1887confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1887confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1887: connected mode
internal fun PlayerActivity.showV1887ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887connected
    FeaturePrefsStore.batch1881.v1887connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1887: conquered mode
internal fun PlayerActivity.showV1887ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1887conquered
    FeaturePrefsStore.batch1881.v1887conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1887: considered mode
internal fun PlayerActivity.showV1887ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1887considered
    FeaturePrefsStore.batch1881.v1887considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1887: consisted mode
internal fun PlayerActivity.showV1887ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887consisted
    FeaturePrefsStore.batch1881.v1887consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1887: constructed mode
internal fun PlayerActivity.showV1887ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1887constructed
    FeaturePrefsStore.batch1881.v1887constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1888: compensated mode
internal fun PlayerActivity.showV1888CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888compensated
    FeaturePrefsStore.batch1881.v1888compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1888: compiled mode
internal fun PlayerActivity.showV1888CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1888compiled
    FeaturePrefsStore.batch1881.v1888compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1888: completed mode
internal fun PlayerActivity.showV1888CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888completed
    FeaturePrefsStore.batch1881.v1888completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1888: composed mode
internal fun PlayerActivity.showV1888ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888composed
    FeaturePrefsStore.batch1881.v1888composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1888: computed mode
internal fun PlayerActivity.showV1888ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888computed
    FeaturePrefsStore.batch1881.v1888computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1888: concentrated level
internal fun PlayerActivity.showV1888ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1888concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1888concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1888: concluded level
internal fun PlayerActivity.showV1888ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1888concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1888concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1888: conducted level
internal fun PlayerActivity.showV1888ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1888conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1888conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1888: confined level
internal fun PlayerActivity.showV1888ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1888confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1888confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1888: confirmed level
internal fun PlayerActivity.showV1888ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1888confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1888confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1888: connected mode
internal fun PlayerActivity.showV1888ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888connected
    FeaturePrefsStore.batch1881.v1888connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1888: conquered mode
internal fun PlayerActivity.showV1888ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1888conquered
    FeaturePrefsStore.batch1881.v1888conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1888: considered mode
internal fun PlayerActivity.showV1888ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1888considered
    FeaturePrefsStore.batch1881.v1888considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1888: consisted mode
internal fun PlayerActivity.showV1888ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888consisted
    FeaturePrefsStore.batch1881.v1888consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1888: constructed mode
internal fun PlayerActivity.showV1888ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1888constructed
    FeaturePrefsStore.batch1881.v1888constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1889: compensated mode
internal fun PlayerActivity.showV1889CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889compensated
    FeaturePrefsStore.batch1881.v1889compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1889: compiled mode
internal fun PlayerActivity.showV1889CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1889compiled
    FeaturePrefsStore.batch1881.v1889compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1889: completed mode
internal fun PlayerActivity.showV1889CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889completed
    FeaturePrefsStore.batch1881.v1889completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1889: composed mode
internal fun PlayerActivity.showV1889ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889composed
    FeaturePrefsStore.batch1881.v1889composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1889: computed mode
internal fun PlayerActivity.showV1889ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889computed
    FeaturePrefsStore.batch1881.v1889computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1889: concentrated level
internal fun PlayerActivity.showV1889ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1889concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1889concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1889: concluded level
internal fun PlayerActivity.showV1889ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1889concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1889concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1889: conducted level
internal fun PlayerActivity.showV1889ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1889conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1889conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1889: confined level
internal fun PlayerActivity.showV1889ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1889confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1889confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1889: confirmed level
internal fun PlayerActivity.showV1889ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1889confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1889confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1889: connected mode
internal fun PlayerActivity.showV1889ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889connected
    FeaturePrefsStore.batch1881.v1889connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1889: conquered mode
internal fun PlayerActivity.showV1889ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1889conquered
    FeaturePrefsStore.batch1881.v1889conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1889: considered mode
internal fun PlayerActivity.showV1889ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1889considered
    FeaturePrefsStore.batch1881.v1889considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1889: consisted mode
internal fun PlayerActivity.showV1889ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889consisted
    FeaturePrefsStore.batch1881.v1889consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1889: constructed mode
internal fun PlayerActivity.showV1889ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1889constructed
    FeaturePrefsStore.batch1881.v1889constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

// v1890: compensated mode
internal fun PlayerActivity.showV1890CompensatedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890compensated
    FeaturePrefsStore.batch1881.v1890compensated = !current
    AppToast.show(this, "compensated: ${if (!current) "ON" else "OFF"}")
}

// v1890: compiled mode
internal fun PlayerActivity.showV1890CompiledToggle() {
    val current = FeaturePrefsStore.batch1881.v1890compiled
    FeaturePrefsStore.batch1881.v1890compiled = !current
    AppToast.show(this, "compiled: ${if (!current) "ON" else "OFF"}")
}

// v1890: completed mode
internal fun PlayerActivity.showV1890CompletedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890completed
    FeaturePrefsStore.batch1881.v1890completed = !current
    AppToast.show(this, "completed: ${if (!current) "ON" else "OFF"}")
}

// v1890: composed mode
internal fun PlayerActivity.showV1890ComposedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890composed
    FeaturePrefsStore.batch1881.v1890composed = !current
    AppToast.show(this, "composed: ${if (!current) "ON" else "OFF"}")
}

// v1890: computed mode
internal fun PlayerActivity.showV1890ComputedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890computed
    FeaturePrefsStore.batch1881.v1890computed = !current
    AppToast.show(this, "computed: ${if (!current) "ON" else "OFF"}")
}

// v1890: concentrated level
internal fun PlayerActivity.showV1890ConcentratedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1890concentrated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concentrated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1890concentrated = value
        AppToast.show(this, "concentrated: $value")
    }
}

// v1890: concluded level
internal fun PlayerActivity.showV1890ConcludedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1890concluded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "concluded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1890concluded = value
        AppToast.show(this, "concluded: $value")
    }
}

// v1890: conducted level
internal fun PlayerActivity.showV1890ConductedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1890conducted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conducted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1890conducted = value
        AppToast.show(this, "conducted: $value")
    }
}

// v1890: confined level
internal fun PlayerActivity.showV1890ConfinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1890confined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1890confined = value
        AppToast.show(this, "confined: $value")
    }
}

// v1890: confirmed level
internal fun PlayerActivity.showV1890ConfirmedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1881.v1890confirmed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirmed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1881.v1890confirmed = value
        AppToast.show(this, "confirmed: $value")
    }
}

// v1890: connected mode
internal fun PlayerActivity.showV1890ConnectedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890connected
    FeaturePrefsStore.batch1881.v1890connected = !current
    AppToast.show(this, "connected: ${if (!current) "ON" else "OFF"}")
}

// v1890: conquered mode
internal fun PlayerActivity.showV1890ConqueredToggle() {
    val current = FeaturePrefsStore.batch1881.v1890conquered
    FeaturePrefsStore.batch1881.v1890conquered = !current
    AppToast.show(this, "conquered: ${if (!current) "ON" else "OFF"}")
}

// v1890: considered mode
internal fun PlayerActivity.showV1890ConsideredToggle() {
    val current = FeaturePrefsStore.batch1881.v1890considered
    FeaturePrefsStore.batch1881.v1890considered = !current
    AppToast.show(this, "considered: ${if (!current) "ON" else "OFF"}")
}

// v1890: consisted mode
internal fun PlayerActivity.showV1890ConsistedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890consisted
    FeaturePrefsStore.batch1881.v1890consisted = !current
    AppToast.show(this, "consisted: ${if (!current) "ON" else "OFF"}")
}

// v1890: constructed mode
internal fun PlayerActivity.showV1890ConstructedToggle() {
    val current = FeaturePrefsStore.batch1881.v1890constructed
    FeaturePrefsStore.batch1881.v1890constructed = !current
    AppToast.show(this, "constructed: ${if (!current) "ON" else "OFF"}")
}

