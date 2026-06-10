package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1701: pumpkin mode
internal fun PlayerActivity.showV1701PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1701pumpkin
    FeaturePrefsStore.batch1701.v1701pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1701: punch mode
internal fun PlayerActivity.showV1701PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1701punch
    FeaturePrefsStore.batch1701.v1701punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1701: pupil mode
internal fun PlayerActivity.showV1701PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1701pupil
    FeaturePrefsStore.batch1701.v1701pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1701: puppy mode
internal fun PlayerActivity.showV1701PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1701puppy
    FeaturePrefsStore.batch1701.v1701puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1701: purchase mode
internal fun PlayerActivity.showV1701PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1701purchase
    FeaturePrefsStore.batch1701.v1701purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1701: purity level
internal fun PlayerActivity.showV1701PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1701purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1701purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1701: purpose level
internal fun PlayerActivity.showV1701PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1701purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1701purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1701: purse level
internal fun PlayerActivity.showV1701PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1701purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1701purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1701: put level
internal fun PlayerActivity.showV1701PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1701put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1701put = value
        AppToast.show(this, "put: $value")
    }
}

// v1701: puzzle level
internal fun PlayerActivity.showV1701PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1701puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1701puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1701: quality mode
internal fun PlayerActivity.showV1701QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1701quality
    FeaturePrefsStore.batch1701.v1701quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1701: quantum mode
internal fun PlayerActivity.showV1701QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1701quantum
    FeaturePrefsStore.batch1701.v1701quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1701: quarter mode
internal fun PlayerActivity.showV1701QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1701quarter
    FeaturePrefsStore.batch1701.v1701quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1701: queen mode
internal fun PlayerActivity.showV1701QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1701queen
    FeaturePrefsStore.batch1701.v1701queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1701: quest mode
internal fun PlayerActivity.showV1701QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1701quest
    FeaturePrefsStore.batch1701.v1701quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1702: pumpkin mode
internal fun PlayerActivity.showV1702PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1702pumpkin
    FeaturePrefsStore.batch1701.v1702pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1702: punch mode
internal fun PlayerActivity.showV1702PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1702punch
    FeaturePrefsStore.batch1701.v1702punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1702: pupil mode
internal fun PlayerActivity.showV1702PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1702pupil
    FeaturePrefsStore.batch1701.v1702pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1702: puppy mode
internal fun PlayerActivity.showV1702PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1702puppy
    FeaturePrefsStore.batch1701.v1702puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1702: purchase mode
internal fun PlayerActivity.showV1702PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1702purchase
    FeaturePrefsStore.batch1701.v1702purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1702: purity level
internal fun PlayerActivity.showV1702PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1702purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1702purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1702: purpose level
internal fun PlayerActivity.showV1702PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1702purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1702purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1702: purse level
internal fun PlayerActivity.showV1702PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1702purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1702purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1702: put level
internal fun PlayerActivity.showV1702PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1702put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1702put = value
        AppToast.show(this, "put: $value")
    }
}

// v1702: puzzle level
internal fun PlayerActivity.showV1702PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1702puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1702puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1702: quality mode
internal fun PlayerActivity.showV1702QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1702quality
    FeaturePrefsStore.batch1701.v1702quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1702: quantum mode
internal fun PlayerActivity.showV1702QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1702quantum
    FeaturePrefsStore.batch1701.v1702quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1702: quarter mode
internal fun PlayerActivity.showV1702QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1702quarter
    FeaturePrefsStore.batch1701.v1702quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1702: queen mode
internal fun PlayerActivity.showV1702QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1702queen
    FeaturePrefsStore.batch1701.v1702queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1702: quest mode
internal fun PlayerActivity.showV1702QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1702quest
    FeaturePrefsStore.batch1701.v1702quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1703: pumpkin mode
internal fun PlayerActivity.showV1703PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1703pumpkin
    FeaturePrefsStore.batch1701.v1703pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1703: punch mode
internal fun PlayerActivity.showV1703PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1703punch
    FeaturePrefsStore.batch1701.v1703punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1703: pupil mode
internal fun PlayerActivity.showV1703PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1703pupil
    FeaturePrefsStore.batch1701.v1703pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1703: puppy mode
internal fun PlayerActivity.showV1703PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1703puppy
    FeaturePrefsStore.batch1701.v1703puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1703: purchase mode
internal fun PlayerActivity.showV1703PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1703purchase
    FeaturePrefsStore.batch1701.v1703purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1703: purity level
internal fun PlayerActivity.showV1703PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1703purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1703purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1703: purpose level
internal fun PlayerActivity.showV1703PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1703purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1703purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1703: purse level
internal fun PlayerActivity.showV1703PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1703purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1703purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1703: put level
internal fun PlayerActivity.showV1703PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1703put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1703put = value
        AppToast.show(this, "put: $value")
    }
}

// v1703: puzzle level
internal fun PlayerActivity.showV1703PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1703puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1703puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1703: quality mode
internal fun PlayerActivity.showV1703QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1703quality
    FeaturePrefsStore.batch1701.v1703quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1703: quantum mode
internal fun PlayerActivity.showV1703QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1703quantum
    FeaturePrefsStore.batch1701.v1703quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1703: quarter mode
internal fun PlayerActivity.showV1703QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1703quarter
    FeaturePrefsStore.batch1701.v1703quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1703: queen mode
internal fun PlayerActivity.showV1703QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1703queen
    FeaturePrefsStore.batch1701.v1703queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1703: quest mode
internal fun PlayerActivity.showV1703QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1703quest
    FeaturePrefsStore.batch1701.v1703quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1704: pumpkin mode
internal fun PlayerActivity.showV1704PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1704pumpkin
    FeaturePrefsStore.batch1701.v1704pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1704: punch mode
internal fun PlayerActivity.showV1704PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1704punch
    FeaturePrefsStore.batch1701.v1704punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1704: pupil mode
internal fun PlayerActivity.showV1704PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1704pupil
    FeaturePrefsStore.batch1701.v1704pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1704: puppy mode
internal fun PlayerActivity.showV1704PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1704puppy
    FeaturePrefsStore.batch1701.v1704puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1704: purchase mode
internal fun PlayerActivity.showV1704PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1704purchase
    FeaturePrefsStore.batch1701.v1704purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1704: purity level
internal fun PlayerActivity.showV1704PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1704purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1704purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1704: purpose level
internal fun PlayerActivity.showV1704PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1704purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1704purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1704: purse level
internal fun PlayerActivity.showV1704PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1704purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1704purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1704: put level
internal fun PlayerActivity.showV1704PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1704put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1704put = value
        AppToast.show(this, "put: $value")
    }
}

// v1704: puzzle level
internal fun PlayerActivity.showV1704PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1704puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1704puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1704: quality mode
internal fun PlayerActivity.showV1704QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1704quality
    FeaturePrefsStore.batch1701.v1704quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1704: quantum mode
internal fun PlayerActivity.showV1704QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1704quantum
    FeaturePrefsStore.batch1701.v1704quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1704: quarter mode
internal fun PlayerActivity.showV1704QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1704quarter
    FeaturePrefsStore.batch1701.v1704quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1704: queen mode
internal fun PlayerActivity.showV1704QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1704queen
    FeaturePrefsStore.batch1701.v1704queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1704: quest mode
internal fun PlayerActivity.showV1704QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1704quest
    FeaturePrefsStore.batch1701.v1704quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1705: pumpkin mode
internal fun PlayerActivity.showV1705PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1705pumpkin
    FeaturePrefsStore.batch1701.v1705pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1705: punch mode
internal fun PlayerActivity.showV1705PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1705punch
    FeaturePrefsStore.batch1701.v1705punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1705: pupil mode
internal fun PlayerActivity.showV1705PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1705pupil
    FeaturePrefsStore.batch1701.v1705pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1705: puppy mode
internal fun PlayerActivity.showV1705PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1705puppy
    FeaturePrefsStore.batch1701.v1705puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1705: purchase mode
internal fun PlayerActivity.showV1705PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1705purchase
    FeaturePrefsStore.batch1701.v1705purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1705: purity level
internal fun PlayerActivity.showV1705PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1705purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1705purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1705: purpose level
internal fun PlayerActivity.showV1705PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1705purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1705purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1705: purse level
internal fun PlayerActivity.showV1705PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1705purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1705purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1705: put level
internal fun PlayerActivity.showV1705PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1705put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1705put = value
        AppToast.show(this, "put: $value")
    }
}

// v1705: puzzle level
internal fun PlayerActivity.showV1705PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1705puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1705puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1705: quality mode
internal fun PlayerActivity.showV1705QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1705quality
    FeaturePrefsStore.batch1701.v1705quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1705: quantum mode
internal fun PlayerActivity.showV1705QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1705quantum
    FeaturePrefsStore.batch1701.v1705quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1705: quarter mode
internal fun PlayerActivity.showV1705QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1705quarter
    FeaturePrefsStore.batch1701.v1705quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1705: queen mode
internal fun PlayerActivity.showV1705QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1705queen
    FeaturePrefsStore.batch1701.v1705queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1705: quest mode
internal fun PlayerActivity.showV1705QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1705quest
    FeaturePrefsStore.batch1701.v1705quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1706: pumpkin mode
internal fun PlayerActivity.showV1706PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1706pumpkin
    FeaturePrefsStore.batch1701.v1706pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1706: punch mode
internal fun PlayerActivity.showV1706PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1706punch
    FeaturePrefsStore.batch1701.v1706punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1706: pupil mode
internal fun PlayerActivity.showV1706PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1706pupil
    FeaturePrefsStore.batch1701.v1706pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1706: puppy mode
internal fun PlayerActivity.showV1706PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1706puppy
    FeaturePrefsStore.batch1701.v1706puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1706: purchase mode
internal fun PlayerActivity.showV1706PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1706purchase
    FeaturePrefsStore.batch1701.v1706purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1706: purity level
internal fun PlayerActivity.showV1706PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1706purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1706purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1706: purpose level
internal fun PlayerActivity.showV1706PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1706purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1706purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1706: purse level
internal fun PlayerActivity.showV1706PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1706purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1706purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1706: put level
internal fun PlayerActivity.showV1706PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1706put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1706put = value
        AppToast.show(this, "put: $value")
    }
}

// v1706: puzzle level
internal fun PlayerActivity.showV1706PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1706puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1706puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1706: quality mode
internal fun PlayerActivity.showV1706QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1706quality
    FeaturePrefsStore.batch1701.v1706quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1706: quantum mode
internal fun PlayerActivity.showV1706QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1706quantum
    FeaturePrefsStore.batch1701.v1706quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1706: quarter mode
internal fun PlayerActivity.showV1706QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1706quarter
    FeaturePrefsStore.batch1701.v1706quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1706: queen mode
internal fun PlayerActivity.showV1706QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1706queen
    FeaturePrefsStore.batch1701.v1706queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1706: quest mode
internal fun PlayerActivity.showV1706QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1706quest
    FeaturePrefsStore.batch1701.v1706quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1707: pumpkin mode
internal fun PlayerActivity.showV1707PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1707pumpkin
    FeaturePrefsStore.batch1701.v1707pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1707: punch mode
internal fun PlayerActivity.showV1707PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1707punch
    FeaturePrefsStore.batch1701.v1707punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1707: pupil mode
internal fun PlayerActivity.showV1707PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1707pupil
    FeaturePrefsStore.batch1701.v1707pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1707: puppy mode
internal fun PlayerActivity.showV1707PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1707puppy
    FeaturePrefsStore.batch1701.v1707puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1707: purchase mode
internal fun PlayerActivity.showV1707PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1707purchase
    FeaturePrefsStore.batch1701.v1707purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1707: purity level
internal fun PlayerActivity.showV1707PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1707purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1707purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1707: purpose level
internal fun PlayerActivity.showV1707PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1707purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1707purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1707: purse level
internal fun PlayerActivity.showV1707PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1707purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1707purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1707: put level
internal fun PlayerActivity.showV1707PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1707put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1707put = value
        AppToast.show(this, "put: $value")
    }
}

// v1707: puzzle level
internal fun PlayerActivity.showV1707PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1707puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1707puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1707: quality mode
internal fun PlayerActivity.showV1707QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1707quality
    FeaturePrefsStore.batch1701.v1707quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1707: quantum mode
internal fun PlayerActivity.showV1707QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1707quantum
    FeaturePrefsStore.batch1701.v1707quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1707: quarter mode
internal fun PlayerActivity.showV1707QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1707quarter
    FeaturePrefsStore.batch1701.v1707quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1707: queen mode
internal fun PlayerActivity.showV1707QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1707queen
    FeaturePrefsStore.batch1701.v1707queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1707: quest mode
internal fun PlayerActivity.showV1707QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1707quest
    FeaturePrefsStore.batch1701.v1707quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1708: pumpkin mode
internal fun PlayerActivity.showV1708PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1708pumpkin
    FeaturePrefsStore.batch1701.v1708pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1708: punch mode
internal fun PlayerActivity.showV1708PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1708punch
    FeaturePrefsStore.batch1701.v1708punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1708: pupil mode
internal fun PlayerActivity.showV1708PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1708pupil
    FeaturePrefsStore.batch1701.v1708pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1708: puppy mode
internal fun PlayerActivity.showV1708PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1708puppy
    FeaturePrefsStore.batch1701.v1708puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1708: purchase mode
internal fun PlayerActivity.showV1708PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1708purchase
    FeaturePrefsStore.batch1701.v1708purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1708: purity level
internal fun PlayerActivity.showV1708PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1708purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1708purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1708: purpose level
internal fun PlayerActivity.showV1708PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1708purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1708purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1708: purse level
internal fun PlayerActivity.showV1708PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1708purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1708purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1708: put level
internal fun PlayerActivity.showV1708PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1708put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1708put = value
        AppToast.show(this, "put: $value")
    }
}

// v1708: puzzle level
internal fun PlayerActivity.showV1708PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1708puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1708puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1708: quality mode
internal fun PlayerActivity.showV1708QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1708quality
    FeaturePrefsStore.batch1701.v1708quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1708: quantum mode
internal fun PlayerActivity.showV1708QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1708quantum
    FeaturePrefsStore.batch1701.v1708quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1708: quarter mode
internal fun PlayerActivity.showV1708QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1708quarter
    FeaturePrefsStore.batch1701.v1708quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1708: queen mode
internal fun PlayerActivity.showV1708QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1708queen
    FeaturePrefsStore.batch1701.v1708queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1708: quest mode
internal fun PlayerActivity.showV1708QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1708quest
    FeaturePrefsStore.batch1701.v1708quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1709: pumpkin mode
internal fun PlayerActivity.showV1709PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1709pumpkin
    FeaturePrefsStore.batch1701.v1709pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1709: punch mode
internal fun PlayerActivity.showV1709PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1709punch
    FeaturePrefsStore.batch1701.v1709punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1709: pupil mode
internal fun PlayerActivity.showV1709PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1709pupil
    FeaturePrefsStore.batch1701.v1709pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1709: puppy mode
internal fun PlayerActivity.showV1709PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1709puppy
    FeaturePrefsStore.batch1701.v1709puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1709: purchase mode
internal fun PlayerActivity.showV1709PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1709purchase
    FeaturePrefsStore.batch1701.v1709purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1709: purity level
internal fun PlayerActivity.showV1709PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1709purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1709purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1709: purpose level
internal fun PlayerActivity.showV1709PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1709purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1709purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1709: purse level
internal fun PlayerActivity.showV1709PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1709purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1709purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1709: put level
internal fun PlayerActivity.showV1709PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1709put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1709put = value
        AppToast.show(this, "put: $value")
    }
}

// v1709: puzzle level
internal fun PlayerActivity.showV1709PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1709puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1709puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1709: quality mode
internal fun PlayerActivity.showV1709QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1709quality
    FeaturePrefsStore.batch1701.v1709quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1709: quantum mode
internal fun PlayerActivity.showV1709QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1709quantum
    FeaturePrefsStore.batch1701.v1709quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1709: quarter mode
internal fun PlayerActivity.showV1709QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1709quarter
    FeaturePrefsStore.batch1701.v1709quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1709: queen mode
internal fun PlayerActivity.showV1709QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1709queen
    FeaturePrefsStore.batch1701.v1709queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1709: quest mode
internal fun PlayerActivity.showV1709QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1709quest
    FeaturePrefsStore.batch1701.v1709quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

// v1710: pumpkin mode
internal fun PlayerActivity.showV1710PumpkinToggle() {
    val current = FeaturePrefsStore.batch1701.v1710pumpkin
    FeaturePrefsStore.batch1701.v1710pumpkin = !current
    AppToast.show(this, "pumpkin: ${if (!current) "ON" else "OFF"}")
}

// v1710: punch mode
internal fun PlayerActivity.showV1710PunchToggle() {
    val current = FeaturePrefsStore.batch1701.v1710punch
    FeaturePrefsStore.batch1701.v1710punch = !current
    AppToast.show(this, "punch: ${if (!current) "ON" else "OFF"}")
}

// v1710: pupil mode
internal fun PlayerActivity.showV1710PupilToggle() {
    val current = FeaturePrefsStore.batch1701.v1710pupil
    FeaturePrefsStore.batch1701.v1710pupil = !current
    AppToast.show(this, "pupil: ${if (!current) "ON" else "OFF"}")
}

// v1710: puppy mode
internal fun PlayerActivity.showV1710PuppyToggle() {
    val current = FeaturePrefsStore.batch1701.v1710puppy
    FeaturePrefsStore.batch1701.v1710puppy = !current
    AppToast.show(this, "puppy: ${if (!current) "ON" else "OFF"}")
}

// v1710: purchase mode
internal fun PlayerActivity.showV1710PurchaseToggle() {
    val current = FeaturePrefsStore.batch1701.v1710purchase
    FeaturePrefsStore.batch1701.v1710purchase = !current
    AppToast.show(this, "purchase: ${if (!current) "ON" else "OFF"}")
}

// v1710: purity level
internal fun PlayerActivity.showV1710PurityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1710purity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purity level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1710purity = value
        AppToast.show(this, "purity: $value")
    }
}

// v1710: purpose level
internal fun PlayerActivity.showV1710PurposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1710purpose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purpose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1710purpose = value
        AppToast.show(this, "purpose: $value")
    }
}

// v1710: purse level
internal fun PlayerActivity.showV1710PurseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1710purse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "purse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1710purse = value
        AppToast.show(this, "purse: $value")
    }
}

// v1710: put level
internal fun PlayerActivity.showV1710PutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1710put).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "put level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1710put = value
        AppToast.show(this, "put: $value")
    }
}

// v1710: puzzle level
internal fun PlayerActivity.showV1710PuzzleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1701.v1710puzzle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "puzzle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1701.v1710puzzle = value
        AppToast.show(this, "puzzle: $value")
    }
}

// v1710: quality mode
internal fun PlayerActivity.showV1710QualityToggle() {
    val current = FeaturePrefsStore.batch1701.v1710quality
    FeaturePrefsStore.batch1701.v1710quality = !current
    AppToast.show(this, "quality: ${if (!current) "ON" else "OFF"}")
}

// v1710: quantum mode
internal fun PlayerActivity.showV1710QuantumToggle() {
    val current = FeaturePrefsStore.batch1701.v1710quantum
    FeaturePrefsStore.batch1701.v1710quantum = !current
    AppToast.show(this, "quantum: ${if (!current) "ON" else "OFF"}")
}

// v1710: quarter mode
internal fun PlayerActivity.showV1710QuarterToggle() {
    val current = FeaturePrefsStore.batch1701.v1710quarter
    FeaturePrefsStore.batch1701.v1710quarter = !current
    AppToast.show(this, "quarter: ${if (!current) "ON" else "OFF"}")
}

// v1710: queen mode
internal fun PlayerActivity.showV1710QueenToggle() {
    val current = FeaturePrefsStore.batch1701.v1710queen
    FeaturePrefsStore.batch1701.v1710queen = !current
    AppToast.show(this, "queen: ${if (!current) "ON" else "OFF"}")
}

// v1710: quest mode
internal fun PlayerActivity.showV1710QuestToggle() {
    val current = FeaturePrefsStore.batch1701.v1710quest
    FeaturePrefsStore.batch1701.v1710quest = !current
    AppToast.show(this, "quest: ${if (!current) "ON" else "OFF"}")
}

