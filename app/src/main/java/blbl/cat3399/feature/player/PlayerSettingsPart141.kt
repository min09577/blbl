package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1591: kite mode
internal fun PlayerActivity.showV1591KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1591kite
    FeaturePrefsStore.batch1591.v1591kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1591: knee mode
internal fun PlayerActivity.showV1591KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1591knee
    FeaturePrefsStore.batch1591.v1591knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1591: knife mode
internal fun PlayerActivity.showV1591KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1591knife
    FeaturePrefsStore.batch1591.v1591knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1591: knock mode
internal fun PlayerActivity.showV1591KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1591knock
    FeaturePrefsStore.batch1591.v1591knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1591: know mode
internal fun PlayerActivity.showV1591KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1591know
    FeaturePrefsStore.batch1591.v1591know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1591: lab level
internal fun PlayerActivity.showV1591LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1591lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1591lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1591: labor level
internal fun PlayerActivity.showV1591LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1591labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1591labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1591: ladder level
internal fun PlayerActivity.showV1591LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1591ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1591ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1591: lake level
internal fun PlayerActivity.showV1591LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1591lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1591lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1591: lamp level
internal fun PlayerActivity.showV1591LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1591lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1591lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1591: laptop mode
internal fun PlayerActivity.showV1591LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1591laptop
    FeaturePrefsStore.batch1591.v1591laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1591: large mode
internal fun PlayerActivity.showV1591LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1591large
    FeaturePrefsStore.batch1591.v1591large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1591: laser mode
internal fun PlayerActivity.showV1591LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1591laser
    FeaturePrefsStore.batch1591.v1591laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1591: later mode
internal fun PlayerActivity.showV1591LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1591later
    FeaturePrefsStore.batch1591.v1591later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1591: laugh mode
internal fun PlayerActivity.showV1591LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1591laugh
    FeaturePrefsStore.batch1591.v1591laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1592: kite mode
internal fun PlayerActivity.showV1592KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1592kite
    FeaturePrefsStore.batch1591.v1592kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1592: knee mode
internal fun PlayerActivity.showV1592KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1592knee
    FeaturePrefsStore.batch1591.v1592knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1592: knife mode
internal fun PlayerActivity.showV1592KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1592knife
    FeaturePrefsStore.batch1591.v1592knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1592: knock mode
internal fun PlayerActivity.showV1592KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1592knock
    FeaturePrefsStore.batch1591.v1592knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1592: know mode
internal fun PlayerActivity.showV1592KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1592know
    FeaturePrefsStore.batch1591.v1592know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1592: lab level
internal fun PlayerActivity.showV1592LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1592lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1592lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1592: labor level
internal fun PlayerActivity.showV1592LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1592labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1592labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1592: ladder level
internal fun PlayerActivity.showV1592LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1592ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1592ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1592: lake level
internal fun PlayerActivity.showV1592LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1592lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1592lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1592: lamp level
internal fun PlayerActivity.showV1592LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1592lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1592lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1592: laptop mode
internal fun PlayerActivity.showV1592LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1592laptop
    FeaturePrefsStore.batch1591.v1592laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1592: large mode
internal fun PlayerActivity.showV1592LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1592large
    FeaturePrefsStore.batch1591.v1592large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1592: laser mode
internal fun PlayerActivity.showV1592LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1592laser
    FeaturePrefsStore.batch1591.v1592laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1592: later mode
internal fun PlayerActivity.showV1592LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1592later
    FeaturePrefsStore.batch1591.v1592later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1592: laugh mode
internal fun PlayerActivity.showV1592LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1592laugh
    FeaturePrefsStore.batch1591.v1592laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1593: kite mode
internal fun PlayerActivity.showV1593KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1593kite
    FeaturePrefsStore.batch1591.v1593kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1593: knee mode
internal fun PlayerActivity.showV1593KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1593knee
    FeaturePrefsStore.batch1591.v1593knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1593: knife mode
internal fun PlayerActivity.showV1593KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1593knife
    FeaturePrefsStore.batch1591.v1593knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1593: knock mode
internal fun PlayerActivity.showV1593KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1593knock
    FeaturePrefsStore.batch1591.v1593knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1593: know mode
internal fun PlayerActivity.showV1593KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1593know
    FeaturePrefsStore.batch1591.v1593know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1593: lab level
internal fun PlayerActivity.showV1593LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1593lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1593lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1593: labor level
internal fun PlayerActivity.showV1593LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1593labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1593labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1593: ladder level
internal fun PlayerActivity.showV1593LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1593ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1593ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1593: lake level
internal fun PlayerActivity.showV1593LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1593lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1593lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1593: lamp level
internal fun PlayerActivity.showV1593LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1593lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1593lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1593: laptop mode
internal fun PlayerActivity.showV1593LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1593laptop
    FeaturePrefsStore.batch1591.v1593laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1593: large mode
internal fun PlayerActivity.showV1593LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1593large
    FeaturePrefsStore.batch1591.v1593large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1593: laser mode
internal fun PlayerActivity.showV1593LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1593laser
    FeaturePrefsStore.batch1591.v1593laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1593: later mode
internal fun PlayerActivity.showV1593LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1593later
    FeaturePrefsStore.batch1591.v1593later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1593: laugh mode
internal fun PlayerActivity.showV1593LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1593laugh
    FeaturePrefsStore.batch1591.v1593laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1594: kite mode
internal fun PlayerActivity.showV1594KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1594kite
    FeaturePrefsStore.batch1591.v1594kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1594: knee mode
internal fun PlayerActivity.showV1594KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1594knee
    FeaturePrefsStore.batch1591.v1594knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1594: knife mode
internal fun PlayerActivity.showV1594KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1594knife
    FeaturePrefsStore.batch1591.v1594knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1594: knock mode
internal fun PlayerActivity.showV1594KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1594knock
    FeaturePrefsStore.batch1591.v1594knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1594: know mode
internal fun PlayerActivity.showV1594KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1594know
    FeaturePrefsStore.batch1591.v1594know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1594: lab level
internal fun PlayerActivity.showV1594LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1594lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1594lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1594: labor level
internal fun PlayerActivity.showV1594LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1594labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1594labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1594: ladder level
internal fun PlayerActivity.showV1594LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1594ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1594ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1594: lake level
internal fun PlayerActivity.showV1594LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1594lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1594lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1594: lamp level
internal fun PlayerActivity.showV1594LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1594lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1594lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1594: laptop mode
internal fun PlayerActivity.showV1594LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1594laptop
    FeaturePrefsStore.batch1591.v1594laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1594: large mode
internal fun PlayerActivity.showV1594LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1594large
    FeaturePrefsStore.batch1591.v1594large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1594: laser mode
internal fun PlayerActivity.showV1594LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1594laser
    FeaturePrefsStore.batch1591.v1594laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1594: later mode
internal fun PlayerActivity.showV1594LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1594later
    FeaturePrefsStore.batch1591.v1594later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1594: laugh mode
internal fun PlayerActivity.showV1594LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1594laugh
    FeaturePrefsStore.batch1591.v1594laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1595: kite mode
internal fun PlayerActivity.showV1595KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1595kite
    FeaturePrefsStore.batch1591.v1595kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1595: knee mode
internal fun PlayerActivity.showV1595KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1595knee
    FeaturePrefsStore.batch1591.v1595knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1595: knife mode
internal fun PlayerActivity.showV1595KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1595knife
    FeaturePrefsStore.batch1591.v1595knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1595: knock mode
internal fun PlayerActivity.showV1595KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1595knock
    FeaturePrefsStore.batch1591.v1595knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1595: know mode
internal fun PlayerActivity.showV1595KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1595know
    FeaturePrefsStore.batch1591.v1595know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1595: lab level
internal fun PlayerActivity.showV1595LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1595lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1595lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1595: labor level
internal fun PlayerActivity.showV1595LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1595labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1595labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1595: ladder level
internal fun PlayerActivity.showV1595LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1595ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1595ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1595: lake level
internal fun PlayerActivity.showV1595LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1595lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1595lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1595: lamp level
internal fun PlayerActivity.showV1595LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1595lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1595lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1595: laptop mode
internal fun PlayerActivity.showV1595LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1595laptop
    FeaturePrefsStore.batch1591.v1595laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1595: large mode
internal fun PlayerActivity.showV1595LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1595large
    FeaturePrefsStore.batch1591.v1595large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1595: laser mode
internal fun PlayerActivity.showV1595LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1595laser
    FeaturePrefsStore.batch1591.v1595laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1595: later mode
internal fun PlayerActivity.showV1595LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1595later
    FeaturePrefsStore.batch1591.v1595later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1595: laugh mode
internal fun PlayerActivity.showV1595LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1595laugh
    FeaturePrefsStore.batch1591.v1595laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1596: kite mode
internal fun PlayerActivity.showV1596KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1596kite
    FeaturePrefsStore.batch1591.v1596kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1596: knee mode
internal fun PlayerActivity.showV1596KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1596knee
    FeaturePrefsStore.batch1591.v1596knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1596: knife mode
internal fun PlayerActivity.showV1596KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1596knife
    FeaturePrefsStore.batch1591.v1596knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1596: knock mode
internal fun PlayerActivity.showV1596KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1596knock
    FeaturePrefsStore.batch1591.v1596knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1596: know mode
internal fun PlayerActivity.showV1596KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1596know
    FeaturePrefsStore.batch1591.v1596know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1596: lab level
internal fun PlayerActivity.showV1596LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1596lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1596lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1596: labor level
internal fun PlayerActivity.showV1596LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1596labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1596labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1596: ladder level
internal fun PlayerActivity.showV1596LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1596ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1596ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1596: lake level
internal fun PlayerActivity.showV1596LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1596lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1596lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1596: lamp level
internal fun PlayerActivity.showV1596LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1596lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1596lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1596: laptop mode
internal fun PlayerActivity.showV1596LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1596laptop
    FeaturePrefsStore.batch1591.v1596laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1596: large mode
internal fun PlayerActivity.showV1596LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1596large
    FeaturePrefsStore.batch1591.v1596large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1596: laser mode
internal fun PlayerActivity.showV1596LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1596laser
    FeaturePrefsStore.batch1591.v1596laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1596: later mode
internal fun PlayerActivity.showV1596LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1596later
    FeaturePrefsStore.batch1591.v1596later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1596: laugh mode
internal fun PlayerActivity.showV1596LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1596laugh
    FeaturePrefsStore.batch1591.v1596laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1597: kite mode
internal fun PlayerActivity.showV1597KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1597kite
    FeaturePrefsStore.batch1591.v1597kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1597: knee mode
internal fun PlayerActivity.showV1597KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1597knee
    FeaturePrefsStore.batch1591.v1597knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1597: knife mode
internal fun PlayerActivity.showV1597KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1597knife
    FeaturePrefsStore.batch1591.v1597knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1597: knock mode
internal fun PlayerActivity.showV1597KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1597knock
    FeaturePrefsStore.batch1591.v1597knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1597: know mode
internal fun PlayerActivity.showV1597KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1597know
    FeaturePrefsStore.batch1591.v1597know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1597: lab level
internal fun PlayerActivity.showV1597LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1597lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1597lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1597: labor level
internal fun PlayerActivity.showV1597LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1597labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1597labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1597: ladder level
internal fun PlayerActivity.showV1597LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1597ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1597ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1597: lake level
internal fun PlayerActivity.showV1597LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1597lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1597lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1597: lamp level
internal fun PlayerActivity.showV1597LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1597lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1597lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1597: laptop mode
internal fun PlayerActivity.showV1597LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1597laptop
    FeaturePrefsStore.batch1591.v1597laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1597: large mode
internal fun PlayerActivity.showV1597LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1597large
    FeaturePrefsStore.batch1591.v1597large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1597: laser mode
internal fun PlayerActivity.showV1597LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1597laser
    FeaturePrefsStore.batch1591.v1597laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1597: later mode
internal fun PlayerActivity.showV1597LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1597later
    FeaturePrefsStore.batch1591.v1597later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1597: laugh mode
internal fun PlayerActivity.showV1597LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1597laugh
    FeaturePrefsStore.batch1591.v1597laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1598: kite mode
internal fun PlayerActivity.showV1598KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1598kite
    FeaturePrefsStore.batch1591.v1598kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1598: knee mode
internal fun PlayerActivity.showV1598KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1598knee
    FeaturePrefsStore.batch1591.v1598knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1598: knife mode
internal fun PlayerActivity.showV1598KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1598knife
    FeaturePrefsStore.batch1591.v1598knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1598: knock mode
internal fun PlayerActivity.showV1598KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1598knock
    FeaturePrefsStore.batch1591.v1598knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1598: know mode
internal fun PlayerActivity.showV1598KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1598know
    FeaturePrefsStore.batch1591.v1598know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1598: lab level
internal fun PlayerActivity.showV1598LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1598lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1598lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1598: labor level
internal fun PlayerActivity.showV1598LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1598labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1598labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1598: ladder level
internal fun PlayerActivity.showV1598LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1598ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1598ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1598: lake level
internal fun PlayerActivity.showV1598LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1598lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1598lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1598: lamp level
internal fun PlayerActivity.showV1598LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1598lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1598lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1598: laptop mode
internal fun PlayerActivity.showV1598LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1598laptop
    FeaturePrefsStore.batch1591.v1598laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1598: large mode
internal fun PlayerActivity.showV1598LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1598large
    FeaturePrefsStore.batch1591.v1598large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1598: laser mode
internal fun PlayerActivity.showV1598LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1598laser
    FeaturePrefsStore.batch1591.v1598laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1598: later mode
internal fun PlayerActivity.showV1598LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1598later
    FeaturePrefsStore.batch1591.v1598later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1598: laugh mode
internal fun PlayerActivity.showV1598LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1598laugh
    FeaturePrefsStore.batch1591.v1598laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1599: kite mode
internal fun PlayerActivity.showV1599KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1599kite
    FeaturePrefsStore.batch1591.v1599kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1599: knee mode
internal fun PlayerActivity.showV1599KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1599knee
    FeaturePrefsStore.batch1591.v1599knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1599: knife mode
internal fun PlayerActivity.showV1599KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1599knife
    FeaturePrefsStore.batch1591.v1599knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1599: knock mode
internal fun PlayerActivity.showV1599KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1599knock
    FeaturePrefsStore.batch1591.v1599knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1599: know mode
internal fun PlayerActivity.showV1599KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1599know
    FeaturePrefsStore.batch1591.v1599know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1599: lab level
internal fun PlayerActivity.showV1599LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1599lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1599lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1599: labor level
internal fun PlayerActivity.showV1599LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1599labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1599labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1599: ladder level
internal fun PlayerActivity.showV1599LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1599ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1599ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1599: lake level
internal fun PlayerActivity.showV1599LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1599lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1599lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1599: lamp level
internal fun PlayerActivity.showV1599LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1599lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1599lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1599: laptop mode
internal fun PlayerActivity.showV1599LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1599laptop
    FeaturePrefsStore.batch1591.v1599laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1599: large mode
internal fun PlayerActivity.showV1599LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1599large
    FeaturePrefsStore.batch1591.v1599large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1599: laser mode
internal fun PlayerActivity.showV1599LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1599laser
    FeaturePrefsStore.batch1591.v1599laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1599: later mode
internal fun PlayerActivity.showV1599LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1599later
    FeaturePrefsStore.batch1591.v1599later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1599: laugh mode
internal fun PlayerActivity.showV1599LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1599laugh
    FeaturePrefsStore.batch1591.v1599laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

// v1600: kite mode
internal fun PlayerActivity.showV1600KiteToggle() {
    val current = FeaturePrefsStore.batch1591.v1600kite
    FeaturePrefsStore.batch1591.v1600kite = !current
    AppToast.show(this, "kite: ${if (!current) "ON" else "OFF"}")
}

// v1600: knee mode
internal fun PlayerActivity.showV1600KneeToggle() {
    val current = FeaturePrefsStore.batch1591.v1600knee
    FeaturePrefsStore.batch1591.v1600knee = !current
    AppToast.show(this, "knee: ${if (!current) "ON" else "OFF"}")
}

// v1600: knife mode
internal fun PlayerActivity.showV1600KnifeToggle() {
    val current = FeaturePrefsStore.batch1591.v1600knife
    FeaturePrefsStore.batch1591.v1600knife = !current
    AppToast.show(this, "knife: ${if (!current) "ON" else "OFF"}")
}

// v1600: knock mode
internal fun PlayerActivity.showV1600KnockToggle() {
    val current = FeaturePrefsStore.batch1591.v1600knock
    FeaturePrefsStore.batch1591.v1600knock = !current
    AppToast.show(this, "knock: ${if (!current) "ON" else "OFF"}")
}

// v1600: know mode
internal fun PlayerActivity.showV1600KnowToggle() {
    val current = FeaturePrefsStore.batch1591.v1600know
    FeaturePrefsStore.batch1591.v1600know = !current
    AppToast.show(this, "know: ${if (!current) "ON" else "OFF"}")
}

// v1600: lab level
internal fun PlayerActivity.showV1600LabDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1600lab).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lab level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1600lab = value
        AppToast.show(this, "lab: $value")
    }
}

// v1600: labor level
internal fun PlayerActivity.showV1600LaborDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1600labor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "labor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1600labor = value
        AppToast.show(this, "labor: $value")
    }
}

// v1600: ladder level
internal fun PlayerActivity.showV1600LadderDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1600ladder).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "ladder level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1600ladder = value
        AppToast.show(this, "ladder: $value")
    }
}

// v1600: lake level
internal fun PlayerActivity.showV1600LakeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1600lake).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lake level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1600lake = value
        AppToast.show(this, "lake: $value")
    }
}

// v1600: lamp level
internal fun PlayerActivity.showV1600LampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1591.v1600lamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "lamp level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1591.v1600lamp = value
        AppToast.show(this, "lamp: $value")
    }
}

// v1600: laptop mode
internal fun PlayerActivity.showV1600LaptopToggle() {
    val current = FeaturePrefsStore.batch1591.v1600laptop
    FeaturePrefsStore.batch1591.v1600laptop = !current
    AppToast.show(this, "laptop: ${if (!current) "ON" else "OFF"}")
}

// v1600: large mode
internal fun PlayerActivity.showV1600LargeToggle() {
    val current = FeaturePrefsStore.batch1591.v1600large
    FeaturePrefsStore.batch1591.v1600large = !current
    AppToast.show(this, "large: ${if (!current) "ON" else "OFF"}")
}

// v1600: laser mode
internal fun PlayerActivity.showV1600LaserToggle() {
    val current = FeaturePrefsStore.batch1591.v1600laser
    FeaturePrefsStore.batch1591.v1600laser = !current
    AppToast.show(this, "laser: ${if (!current) "ON" else "OFF"}")
}

// v1600: later mode
internal fun PlayerActivity.showV1600LaterToggle() {
    val current = FeaturePrefsStore.batch1591.v1600later
    FeaturePrefsStore.batch1591.v1600later = !current
    AppToast.show(this, "later: ${if (!current) "ON" else "OFF"}")
}

// v1600: laugh mode
internal fun PlayerActivity.showV1600LaughToggle() {
    val current = FeaturePrefsStore.batch1591.v1600laugh
    FeaturePrefsStore.batch1591.v1600laugh = !current
    AppToast.show(this, "laugh: ${if (!current) "ON" else "OFF"}")
}

