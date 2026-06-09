package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2221: ruined mode
internal fun PlayerActivity.showV2221RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221ruined
    FeaturePrefsStore.batch2221.v2221ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2221: sacrificed mode
internal fun PlayerActivity.showV2221SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221sacrificed
    FeaturePrefsStore.batch2221.v2221sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2221: safeguarded mode
internal fun PlayerActivity.showV2221SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221safeguarded
    FeaturePrefsStore.batch2221.v2221safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2221: sampled mode
internal fun PlayerActivity.showV2221SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2221sampled
    FeaturePrefsStore.batch2221.v2221sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2221: satisfied mode
internal fun PlayerActivity.showV2221SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221satisfied
    FeaturePrefsStore.batch2221.v2221satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2221: saved level
internal fun PlayerActivity.showV2221SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2221saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2221saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2221: scaled level
internal fun PlayerActivity.showV2221ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2221scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2221scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2221: scanned level
internal fun PlayerActivity.showV2221ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2221scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2221scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2221: scared level
internal fun PlayerActivity.showV2221ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2221scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2221scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2221: scheduled level
internal fun PlayerActivity.showV2221ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2221scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2221scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2221: scattered mode
internal fun PlayerActivity.showV2221ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2221scattered
    FeaturePrefsStore.batch2221.v2221scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2221: sculpted mode
internal fun PlayerActivity.showV2221SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221sculpted
    FeaturePrefsStore.batch2221.v2221sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2221: searched mode
internal fun PlayerActivity.showV2221SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221searched
    FeaturePrefsStore.batch2221.v2221searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2221: seasoned mode
internal fun PlayerActivity.showV2221SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2221seasoned
    FeaturePrefsStore.batch2221.v2221seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2221: secured mode
internal fun PlayerActivity.showV2221SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2221secured
    FeaturePrefsStore.batch2221.v2221secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2222: ruined mode
internal fun PlayerActivity.showV2222RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222ruined
    FeaturePrefsStore.batch2221.v2222ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2222: sacrificed mode
internal fun PlayerActivity.showV2222SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222sacrificed
    FeaturePrefsStore.batch2221.v2222sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2222: safeguarded mode
internal fun PlayerActivity.showV2222SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222safeguarded
    FeaturePrefsStore.batch2221.v2222safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2222: sampled mode
internal fun PlayerActivity.showV2222SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2222sampled
    FeaturePrefsStore.batch2221.v2222sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2222: satisfied mode
internal fun PlayerActivity.showV2222SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222satisfied
    FeaturePrefsStore.batch2221.v2222satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2222: saved level
internal fun PlayerActivity.showV2222SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2222saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2222saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2222: scaled level
internal fun PlayerActivity.showV2222ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2222scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2222scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2222: scanned level
internal fun PlayerActivity.showV2222ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2222scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2222scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2222: scared level
internal fun PlayerActivity.showV2222ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2222scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2222scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2222: scheduled level
internal fun PlayerActivity.showV2222ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2222scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2222scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2222: scattered mode
internal fun PlayerActivity.showV2222ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2222scattered
    FeaturePrefsStore.batch2221.v2222scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2222: sculpted mode
internal fun PlayerActivity.showV2222SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222sculpted
    FeaturePrefsStore.batch2221.v2222sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2222: searched mode
internal fun PlayerActivity.showV2222SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222searched
    FeaturePrefsStore.batch2221.v2222searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2222: seasoned mode
internal fun PlayerActivity.showV2222SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2222seasoned
    FeaturePrefsStore.batch2221.v2222seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2222: secured mode
internal fun PlayerActivity.showV2222SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2222secured
    FeaturePrefsStore.batch2221.v2222secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2223: ruined mode
internal fun PlayerActivity.showV2223RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223ruined
    FeaturePrefsStore.batch2221.v2223ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2223: sacrificed mode
internal fun PlayerActivity.showV2223SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223sacrificed
    FeaturePrefsStore.batch2221.v2223sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2223: safeguarded mode
internal fun PlayerActivity.showV2223SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223safeguarded
    FeaturePrefsStore.batch2221.v2223safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2223: sampled mode
internal fun PlayerActivity.showV2223SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2223sampled
    FeaturePrefsStore.batch2221.v2223sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2223: satisfied mode
internal fun PlayerActivity.showV2223SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223satisfied
    FeaturePrefsStore.batch2221.v2223satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2223: saved level
internal fun PlayerActivity.showV2223SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2223saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2223saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2223: scaled level
internal fun PlayerActivity.showV2223ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2223scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2223scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2223: scanned level
internal fun PlayerActivity.showV2223ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2223scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2223scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2223: scared level
internal fun PlayerActivity.showV2223ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2223scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2223scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2223: scheduled level
internal fun PlayerActivity.showV2223ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2223scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2223scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2223: scattered mode
internal fun PlayerActivity.showV2223ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2223scattered
    FeaturePrefsStore.batch2221.v2223scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2223: sculpted mode
internal fun PlayerActivity.showV2223SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223sculpted
    FeaturePrefsStore.batch2221.v2223sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2223: searched mode
internal fun PlayerActivity.showV2223SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223searched
    FeaturePrefsStore.batch2221.v2223searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2223: seasoned mode
internal fun PlayerActivity.showV2223SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2223seasoned
    FeaturePrefsStore.batch2221.v2223seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2223: secured mode
internal fun PlayerActivity.showV2223SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2223secured
    FeaturePrefsStore.batch2221.v2223secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2224: ruined mode
internal fun PlayerActivity.showV2224RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224ruined
    FeaturePrefsStore.batch2221.v2224ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2224: sacrificed mode
internal fun PlayerActivity.showV2224SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224sacrificed
    FeaturePrefsStore.batch2221.v2224sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2224: safeguarded mode
internal fun PlayerActivity.showV2224SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224safeguarded
    FeaturePrefsStore.batch2221.v2224safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2224: sampled mode
internal fun PlayerActivity.showV2224SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2224sampled
    FeaturePrefsStore.batch2221.v2224sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2224: satisfied mode
internal fun PlayerActivity.showV2224SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224satisfied
    FeaturePrefsStore.batch2221.v2224satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2224: saved level
internal fun PlayerActivity.showV2224SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2224saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2224saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2224: scaled level
internal fun PlayerActivity.showV2224ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2224scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2224scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2224: scanned level
internal fun PlayerActivity.showV2224ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2224scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2224scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2224: scared level
internal fun PlayerActivity.showV2224ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2224scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2224scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2224: scheduled level
internal fun PlayerActivity.showV2224ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2224scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2224scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2224: scattered mode
internal fun PlayerActivity.showV2224ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2224scattered
    FeaturePrefsStore.batch2221.v2224scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2224: sculpted mode
internal fun PlayerActivity.showV2224SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224sculpted
    FeaturePrefsStore.batch2221.v2224sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2224: searched mode
internal fun PlayerActivity.showV2224SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224searched
    FeaturePrefsStore.batch2221.v2224searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2224: seasoned mode
internal fun PlayerActivity.showV2224SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2224seasoned
    FeaturePrefsStore.batch2221.v2224seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2224: secured mode
internal fun PlayerActivity.showV2224SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2224secured
    FeaturePrefsStore.batch2221.v2224secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2225: ruined mode
internal fun PlayerActivity.showV2225RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225ruined
    FeaturePrefsStore.batch2221.v2225ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2225: sacrificed mode
internal fun PlayerActivity.showV2225SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225sacrificed
    FeaturePrefsStore.batch2221.v2225sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2225: safeguarded mode
internal fun PlayerActivity.showV2225SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225safeguarded
    FeaturePrefsStore.batch2221.v2225safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2225: sampled mode
internal fun PlayerActivity.showV2225SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2225sampled
    FeaturePrefsStore.batch2221.v2225sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2225: satisfied mode
internal fun PlayerActivity.showV2225SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225satisfied
    FeaturePrefsStore.batch2221.v2225satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2225: saved level
internal fun PlayerActivity.showV2225SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2225saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2225saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2225: scaled level
internal fun PlayerActivity.showV2225ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2225scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2225scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2225: scanned level
internal fun PlayerActivity.showV2225ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2225scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2225scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2225: scared level
internal fun PlayerActivity.showV2225ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2225scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2225scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2225: scheduled level
internal fun PlayerActivity.showV2225ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2225scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2225scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2225: scattered mode
internal fun PlayerActivity.showV2225ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2225scattered
    FeaturePrefsStore.batch2221.v2225scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2225: sculpted mode
internal fun PlayerActivity.showV2225SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225sculpted
    FeaturePrefsStore.batch2221.v2225sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2225: searched mode
internal fun PlayerActivity.showV2225SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225searched
    FeaturePrefsStore.batch2221.v2225searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2225: seasoned mode
internal fun PlayerActivity.showV2225SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2225seasoned
    FeaturePrefsStore.batch2221.v2225seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2225: secured mode
internal fun PlayerActivity.showV2225SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2225secured
    FeaturePrefsStore.batch2221.v2225secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2226: ruined mode
internal fun PlayerActivity.showV2226RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226ruined
    FeaturePrefsStore.batch2221.v2226ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2226: sacrificed mode
internal fun PlayerActivity.showV2226SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226sacrificed
    FeaturePrefsStore.batch2221.v2226sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2226: safeguarded mode
internal fun PlayerActivity.showV2226SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226safeguarded
    FeaturePrefsStore.batch2221.v2226safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2226: sampled mode
internal fun PlayerActivity.showV2226SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2226sampled
    FeaturePrefsStore.batch2221.v2226sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2226: satisfied mode
internal fun PlayerActivity.showV2226SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226satisfied
    FeaturePrefsStore.batch2221.v2226satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2226: saved level
internal fun PlayerActivity.showV2226SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2226saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2226saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2226: scaled level
internal fun PlayerActivity.showV2226ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2226scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2226scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2226: scanned level
internal fun PlayerActivity.showV2226ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2226scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2226scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2226: scared level
internal fun PlayerActivity.showV2226ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2226scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2226scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2226: scheduled level
internal fun PlayerActivity.showV2226ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2226scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2226scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2226: scattered mode
internal fun PlayerActivity.showV2226ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2226scattered
    FeaturePrefsStore.batch2221.v2226scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2226: sculpted mode
internal fun PlayerActivity.showV2226SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226sculpted
    FeaturePrefsStore.batch2221.v2226sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2226: searched mode
internal fun PlayerActivity.showV2226SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226searched
    FeaturePrefsStore.batch2221.v2226searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2226: seasoned mode
internal fun PlayerActivity.showV2226SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2226seasoned
    FeaturePrefsStore.batch2221.v2226seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2226: secured mode
internal fun PlayerActivity.showV2226SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2226secured
    FeaturePrefsStore.batch2221.v2226secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2227: ruined mode
internal fun PlayerActivity.showV2227RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227ruined
    FeaturePrefsStore.batch2221.v2227ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2227: sacrificed mode
internal fun PlayerActivity.showV2227SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227sacrificed
    FeaturePrefsStore.batch2221.v2227sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2227: safeguarded mode
internal fun PlayerActivity.showV2227SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227safeguarded
    FeaturePrefsStore.batch2221.v2227safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2227: sampled mode
internal fun PlayerActivity.showV2227SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2227sampled
    FeaturePrefsStore.batch2221.v2227sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2227: satisfied mode
internal fun PlayerActivity.showV2227SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227satisfied
    FeaturePrefsStore.batch2221.v2227satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2227: saved level
internal fun PlayerActivity.showV2227SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2227saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2227saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2227: scaled level
internal fun PlayerActivity.showV2227ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2227scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2227scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2227: scanned level
internal fun PlayerActivity.showV2227ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2227scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2227scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2227: scared level
internal fun PlayerActivity.showV2227ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2227scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2227scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2227: scheduled level
internal fun PlayerActivity.showV2227ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2227scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2227scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2227: scattered mode
internal fun PlayerActivity.showV2227ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2227scattered
    FeaturePrefsStore.batch2221.v2227scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2227: sculpted mode
internal fun PlayerActivity.showV2227SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227sculpted
    FeaturePrefsStore.batch2221.v2227sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2227: searched mode
internal fun PlayerActivity.showV2227SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227searched
    FeaturePrefsStore.batch2221.v2227searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2227: seasoned mode
internal fun PlayerActivity.showV2227SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2227seasoned
    FeaturePrefsStore.batch2221.v2227seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2227: secured mode
internal fun PlayerActivity.showV2227SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2227secured
    FeaturePrefsStore.batch2221.v2227secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2228: ruined mode
internal fun PlayerActivity.showV2228RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228ruined
    FeaturePrefsStore.batch2221.v2228ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2228: sacrificed mode
internal fun PlayerActivity.showV2228SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228sacrificed
    FeaturePrefsStore.batch2221.v2228sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2228: safeguarded mode
internal fun PlayerActivity.showV2228SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228safeguarded
    FeaturePrefsStore.batch2221.v2228safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2228: sampled mode
internal fun PlayerActivity.showV2228SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2228sampled
    FeaturePrefsStore.batch2221.v2228sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2228: satisfied mode
internal fun PlayerActivity.showV2228SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228satisfied
    FeaturePrefsStore.batch2221.v2228satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2228: saved level
internal fun PlayerActivity.showV2228SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2228saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2228saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2228: scaled level
internal fun PlayerActivity.showV2228ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2228scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2228scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2228: scanned level
internal fun PlayerActivity.showV2228ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2228scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2228scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2228: scared level
internal fun PlayerActivity.showV2228ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2228scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2228scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2228: scheduled level
internal fun PlayerActivity.showV2228ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2228scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2228scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2228: scattered mode
internal fun PlayerActivity.showV2228ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2228scattered
    FeaturePrefsStore.batch2221.v2228scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2228: sculpted mode
internal fun PlayerActivity.showV2228SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228sculpted
    FeaturePrefsStore.batch2221.v2228sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2228: searched mode
internal fun PlayerActivity.showV2228SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228searched
    FeaturePrefsStore.batch2221.v2228searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2228: seasoned mode
internal fun PlayerActivity.showV2228SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2228seasoned
    FeaturePrefsStore.batch2221.v2228seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2228: secured mode
internal fun PlayerActivity.showV2228SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2228secured
    FeaturePrefsStore.batch2221.v2228secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2229: ruined mode
internal fun PlayerActivity.showV2229RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229ruined
    FeaturePrefsStore.batch2221.v2229ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2229: sacrificed mode
internal fun PlayerActivity.showV2229SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229sacrificed
    FeaturePrefsStore.batch2221.v2229sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2229: safeguarded mode
internal fun PlayerActivity.showV2229SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229safeguarded
    FeaturePrefsStore.batch2221.v2229safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2229: sampled mode
internal fun PlayerActivity.showV2229SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2229sampled
    FeaturePrefsStore.batch2221.v2229sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2229: satisfied mode
internal fun PlayerActivity.showV2229SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229satisfied
    FeaturePrefsStore.batch2221.v2229satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2229: saved level
internal fun PlayerActivity.showV2229SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2229saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2229saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2229: scaled level
internal fun PlayerActivity.showV2229ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2229scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2229scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2229: scanned level
internal fun PlayerActivity.showV2229ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2229scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2229scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2229: scared level
internal fun PlayerActivity.showV2229ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2229scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2229scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2229: scheduled level
internal fun PlayerActivity.showV2229ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2229scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2229scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2229: scattered mode
internal fun PlayerActivity.showV2229ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2229scattered
    FeaturePrefsStore.batch2221.v2229scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2229: sculpted mode
internal fun PlayerActivity.showV2229SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229sculpted
    FeaturePrefsStore.batch2221.v2229sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2229: searched mode
internal fun PlayerActivity.showV2229SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229searched
    FeaturePrefsStore.batch2221.v2229searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2229: seasoned mode
internal fun PlayerActivity.showV2229SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2229seasoned
    FeaturePrefsStore.batch2221.v2229seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2229: secured mode
internal fun PlayerActivity.showV2229SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2229secured
    FeaturePrefsStore.batch2221.v2229secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

// v2230: ruined mode
internal fun PlayerActivity.showV2230RuinedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230ruined
    FeaturePrefsStore.batch2221.v2230ruined = !current
    AppToast.show(this, "ruined: ${if (!current) "ON" else "OFF"}")
}

// v2230: sacrificed mode
internal fun PlayerActivity.showV2230SacrificedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230sacrificed
    FeaturePrefsStore.batch2221.v2230sacrificed = !current
    AppToast.show(this, "sacrificed: ${if (!current) "ON" else "OFF"}")
}

// v2230: safeguarded mode
internal fun PlayerActivity.showV2230SafeguardedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230safeguarded
    FeaturePrefsStore.batch2221.v2230safeguarded = !current
    AppToast.show(this, "safeguarded: ${if (!current) "ON" else "OFF"}")
}

// v2230: sampled mode
internal fun PlayerActivity.showV2230SampledToggle() {
    val current = FeaturePrefsStore.batch2221.v2230sampled
    FeaturePrefsStore.batch2221.v2230sampled = !current
    AppToast.show(this, "sampled: ${if (!current) "ON" else "OFF"}")
}

// v2230: satisfied mode
internal fun PlayerActivity.showV2230SatisfiedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230satisfied
    FeaturePrefsStore.batch2221.v2230satisfied = !current
    AppToast.show(this, "satisfied: ${if (!current) "ON" else "OFF"}")
}

// v2230: saved level
internal fun PlayerActivity.showV2230SavedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2230saved).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saved level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2230saved = value
        AppToast.show(this, "saved: $value")
    }
}

// v2230: scaled level
internal fun PlayerActivity.showV2230ScaledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2230scaled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scaled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2230scaled = value
        AppToast.show(this, "scaled: $value")
    }
}

// v2230: scanned level
internal fun PlayerActivity.showV2230ScannedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2230scanned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scanned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2230scanned = value
        AppToast.show(this, "scanned: $value")
    }
}

// v2230: scared level
internal fun PlayerActivity.showV2230ScaredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2230scared).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scared level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2230scared = value
        AppToast.show(this, "scared: $value")
    }
}

// v2230: scheduled level
internal fun PlayerActivity.showV2230ScheduledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2221.v2230scheduled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scheduled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2221.v2230scheduled = value
        AppToast.show(this, "scheduled: $value")
    }
}

// v2230: scattered mode
internal fun PlayerActivity.showV2230ScatteredToggle() {
    val current = FeaturePrefsStore.batch2221.v2230scattered
    FeaturePrefsStore.batch2221.v2230scattered = !current
    AppToast.show(this, "scattered: ${if (!current) "ON" else "OFF"}")
}

// v2230: sculpted mode
internal fun PlayerActivity.showV2230SculptedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230sculpted
    FeaturePrefsStore.batch2221.v2230sculpted = !current
    AppToast.show(this, "sculpted: ${if (!current) "ON" else "OFF"}")
}

// v2230: searched mode
internal fun PlayerActivity.showV2230SearchedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230searched
    FeaturePrefsStore.batch2221.v2230searched = !current
    AppToast.show(this, "searched: ${if (!current) "ON" else "OFF"}")
}

// v2230: seasoned mode
internal fun PlayerActivity.showV2230SeasonedToggle() {
    val current = FeaturePrefsStore.batch2221.v2230seasoned
    FeaturePrefsStore.batch2221.v2230seasoned = !current
    AppToast.show(this, "seasoned: ${if (!current) "ON" else "OFF"}")
}

// v2230: secured mode
internal fun PlayerActivity.showV2230SecuredToggle() {
    val current = FeaturePrefsStore.batch2221.v2230secured
    FeaturePrefsStore.batch2221.v2230secured = !current
    AppToast.show(this, "secured: ${if (!current) "ON" else "OFF"}")
}

