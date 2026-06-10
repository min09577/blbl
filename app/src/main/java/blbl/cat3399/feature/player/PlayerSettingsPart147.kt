package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1651: party mode
internal fun PlayerActivity.showV1651PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1651party
    FeaturePrefsStore.batch1651.v1651party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1651: patient mode
internal fun PlayerActivity.showV1651PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1651patient
    FeaturePrefsStore.batch1651.v1651patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1651: patrol mode
internal fun PlayerActivity.showV1651PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1651patrol
    FeaturePrefsStore.batch1651.v1651patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1651: pave mode
internal fun PlayerActivity.showV1651PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1651pave
    FeaturePrefsStore.batch1651.v1651pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1651: payment mode
internal fun PlayerActivity.showV1651PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1651payment
    FeaturePrefsStore.batch1651.v1651payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1651: peace level
internal fun PlayerActivity.showV1651PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1651peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1651peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1651: peanut level
internal fun PlayerActivity.showV1651PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1651peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1651peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1651: pear level
internal fun PlayerActivity.showV1651PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1651pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1651pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1651: pearl level
internal fun PlayerActivity.showV1651PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1651pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1651pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1651: peasant level
internal fun PlayerActivity.showV1651PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1651peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1651peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1651: pelican mode
internal fun PlayerActivity.showV1651PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1651pelican
    FeaturePrefsStore.batch1651.v1651pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1651: pen mode
internal fun PlayerActivity.showV1651PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1651pen
    FeaturePrefsStore.batch1651.v1651pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1651: penalty mode
internal fun PlayerActivity.showV1651PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1651penalty
    FeaturePrefsStore.batch1651.v1651penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1651: pencil mode
internal fun PlayerActivity.showV1651PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1651pencil
    FeaturePrefsStore.batch1651.v1651pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1651: people mode
internal fun PlayerActivity.showV1651PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1651people
    FeaturePrefsStore.batch1651.v1651people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1652: party mode
internal fun PlayerActivity.showV1652PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1652party
    FeaturePrefsStore.batch1651.v1652party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1652: patient mode
internal fun PlayerActivity.showV1652PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1652patient
    FeaturePrefsStore.batch1651.v1652patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1652: patrol mode
internal fun PlayerActivity.showV1652PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1652patrol
    FeaturePrefsStore.batch1651.v1652patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1652: pave mode
internal fun PlayerActivity.showV1652PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1652pave
    FeaturePrefsStore.batch1651.v1652pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1652: payment mode
internal fun PlayerActivity.showV1652PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1652payment
    FeaturePrefsStore.batch1651.v1652payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1652: peace level
internal fun PlayerActivity.showV1652PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1652peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1652peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1652: peanut level
internal fun PlayerActivity.showV1652PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1652peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1652peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1652: pear level
internal fun PlayerActivity.showV1652PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1652pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1652pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1652: pearl level
internal fun PlayerActivity.showV1652PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1652pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1652pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1652: peasant level
internal fun PlayerActivity.showV1652PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1652peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1652peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1652: pelican mode
internal fun PlayerActivity.showV1652PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1652pelican
    FeaturePrefsStore.batch1651.v1652pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1652: pen mode
internal fun PlayerActivity.showV1652PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1652pen
    FeaturePrefsStore.batch1651.v1652pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1652: penalty mode
internal fun PlayerActivity.showV1652PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1652penalty
    FeaturePrefsStore.batch1651.v1652penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1652: pencil mode
internal fun PlayerActivity.showV1652PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1652pencil
    FeaturePrefsStore.batch1651.v1652pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1652: people mode
internal fun PlayerActivity.showV1652PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1652people
    FeaturePrefsStore.batch1651.v1652people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1653: party mode
internal fun PlayerActivity.showV1653PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1653party
    FeaturePrefsStore.batch1651.v1653party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1653: patient mode
internal fun PlayerActivity.showV1653PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1653patient
    FeaturePrefsStore.batch1651.v1653patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1653: patrol mode
internal fun PlayerActivity.showV1653PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1653patrol
    FeaturePrefsStore.batch1651.v1653patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1653: pave mode
internal fun PlayerActivity.showV1653PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1653pave
    FeaturePrefsStore.batch1651.v1653pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1653: payment mode
internal fun PlayerActivity.showV1653PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1653payment
    FeaturePrefsStore.batch1651.v1653payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1653: peace level
internal fun PlayerActivity.showV1653PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1653peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1653peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1653: peanut level
internal fun PlayerActivity.showV1653PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1653peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1653peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1653: pear level
internal fun PlayerActivity.showV1653PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1653pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1653pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1653: pearl level
internal fun PlayerActivity.showV1653PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1653pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1653pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1653: peasant level
internal fun PlayerActivity.showV1653PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1653peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1653peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1653: pelican mode
internal fun PlayerActivity.showV1653PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1653pelican
    FeaturePrefsStore.batch1651.v1653pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1653: pen mode
internal fun PlayerActivity.showV1653PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1653pen
    FeaturePrefsStore.batch1651.v1653pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1653: penalty mode
internal fun PlayerActivity.showV1653PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1653penalty
    FeaturePrefsStore.batch1651.v1653penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1653: pencil mode
internal fun PlayerActivity.showV1653PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1653pencil
    FeaturePrefsStore.batch1651.v1653pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1653: people mode
internal fun PlayerActivity.showV1653PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1653people
    FeaturePrefsStore.batch1651.v1653people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1654: party mode
internal fun PlayerActivity.showV1654PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1654party
    FeaturePrefsStore.batch1651.v1654party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1654: patient mode
internal fun PlayerActivity.showV1654PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1654patient
    FeaturePrefsStore.batch1651.v1654patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1654: patrol mode
internal fun PlayerActivity.showV1654PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1654patrol
    FeaturePrefsStore.batch1651.v1654patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1654: pave mode
internal fun PlayerActivity.showV1654PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1654pave
    FeaturePrefsStore.batch1651.v1654pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1654: payment mode
internal fun PlayerActivity.showV1654PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1654payment
    FeaturePrefsStore.batch1651.v1654payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1654: peace level
internal fun PlayerActivity.showV1654PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1654peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1654peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1654: peanut level
internal fun PlayerActivity.showV1654PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1654peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1654peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1654: pear level
internal fun PlayerActivity.showV1654PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1654pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1654pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1654: pearl level
internal fun PlayerActivity.showV1654PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1654pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1654pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1654: peasant level
internal fun PlayerActivity.showV1654PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1654peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1654peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1654: pelican mode
internal fun PlayerActivity.showV1654PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1654pelican
    FeaturePrefsStore.batch1651.v1654pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1654: pen mode
internal fun PlayerActivity.showV1654PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1654pen
    FeaturePrefsStore.batch1651.v1654pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1654: penalty mode
internal fun PlayerActivity.showV1654PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1654penalty
    FeaturePrefsStore.batch1651.v1654penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1654: pencil mode
internal fun PlayerActivity.showV1654PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1654pencil
    FeaturePrefsStore.batch1651.v1654pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1654: people mode
internal fun PlayerActivity.showV1654PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1654people
    FeaturePrefsStore.batch1651.v1654people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1655: party mode
internal fun PlayerActivity.showV1655PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1655party
    FeaturePrefsStore.batch1651.v1655party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1655: patient mode
internal fun PlayerActivity.showV1655PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1655patient
    FeaturePrefsStore.batch1651.v1655patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1655: patrol mode
internal fun PlayerActivity.showV1655PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1655patrol
    FeaturePrefsStore.batch1651.v1655patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1655: pave mode
internal fun PlayerActivity.showV1655PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1655pave
    FeaturePrefsStore.batch1651.v1655pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1655: payment mode
internal fun PlayerActivity.showV1655PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1655payment
    FeaturePrefsStore.batch1651.v1655payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1655: peace level
internal fun PlayerActivity.showV1655PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1655peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1655peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1655: peanut level
internal fun PlayerActivity.showV1655PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1655peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1655peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1655: pear level
internal fun PlayerActivity.showV1655PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1655pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1655pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1655: pearl level
internal fun PlayerActivity.showV1655PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1655pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1655pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1655: peasant level
internal fun PlayerActivity.showV1655PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1655peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1655peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1655: pelican mode
internal fun PlayerActivity.showV1655PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1655pelican
    FeaturePrefsStore.batch1651.v1655pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1655: pen mode
internal fun PlayerActivity.showV1655PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1655pen
    FeaturePrefsStore.batch1651.v1655pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1655: penalty mode
internal fun PlayerActivity.showV1655PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1655penalty
    FeaturePrefsStore.batch1651.v1655penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1655: pencil mode
internal fun PlayerActivity.showV1655PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1655pencil
    FeaturePrefsStore.batch1651.v1655pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1655: people mode
internal fun PlayerActivity.showV1655PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1655people
    FeaturePrefsStore.batch1651.v1655people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1656: party mode
internal fun PlayerActivity.showV1656PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1656party
    FeaturePrefsStore.batch1651.v1656party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1656: patient mode
internal fun PlayerActivity.showV1656PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1656patient
    FeaturePrefsStore.batch1651.v1656patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1656: patrol mode
internal fun PlayerActivity.showV1656PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1656patrol
    FeaturePrefsStore.batch1651.v1656patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1656: pave mode
internal fun PlayerActivity.showV1656PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1656pave
    FeaturePrefsStore.batch1651.v1656pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1656: payment mode
internal fun PlayerActivity.showV1656PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1656payment
    FeaturePrefsStore.batch1651.v1656payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1656: peace level
internal fun PlayerActivity.showV1656PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1656peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1656peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1656: peanut level
internal fun PlayerActivity.showV1656PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1656peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1656peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1656: pear level
internal fun PlayerActivity.showV1656PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1656pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1656pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1656: pearl level
internal fun PlayerActivity.showV1656PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1656pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1656pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1656: peasant level
internal fun PlayerActivity.showV1656PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1656peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1656peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1656: pelican mode
internal fun PlayerActivity.showV1656PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1656pelican
    FeaturePrefsStore.batch1651.v1656pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1656: pen mode
internal fun PlayerActivity.showV1656PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1656pen
    FeaturePrefsStore.batch1651.v1656pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1656: penalty mode
internal fun PlayerActivity.showV1656PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1656penalty
    FeaturePrefsStore.batch1651.v1656penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1656: pencil mode
internal fun PlayerActivity.showV1656PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1656pencil
    FeaturePrefsStore.batch1651.v1656pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1656: people mode
internal fun PlayerActivity.showV1656PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1656people
    FeaturePrefsStore.batch1651.v1656people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1657: party mode
internal fun PlayerActivity.showV1657PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1657party
    FeaturePrefsStore.batch1651.v1657party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1657: patient mode
internal fun PlayerActivity.showV1657PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1657patient
    FeaturePrefsStore.batch1651.v1657patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1657: patrol mode
internal fun PlayerActivity.showV1657PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1657patrol
    FeaturePrefsStore.batch1651.v1657patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1657: pave mode
internal fun PlayerActivity.showV1657PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1657pave
    FeaturePrefsStore.batch1651.v1657pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1657: payment mode
internal fun PlayerActivity.showV1657PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1657payment
    FeaturePrefsStore.batch1651.v1657payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1657: peace level
internal fun PlayerActivity.showV1657PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1657peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1657peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1657: peanut level
internal fun PlayerActivity.showV1657PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1657peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1657peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1657: pear level
internal fun PlayerActivity.showV1657PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1657pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1657pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1657: pearl level
internal fun PlayerActivity.showV1657PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1657pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1657pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1657: peasant level
internal fun PlayerActivity.showV1657PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1657peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1657peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1657: pelican mode
internal fun PlayerActivity.showV1657PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1657pelican
    FeaturePrefsStore.batch1651.v1657pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1657: pen mode
internal fun PlayerActivity.showV1657PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1657pen
    FeaturePrefsStore.batch1651.v1657pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1657: penalty mode
internal fun PlayerActivity.showV1657PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1657penalty
    FeaturePrefsStore.batch1651.v1657penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1657: pencil mode
internal fun PlayerActivity.showV1657PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1657pencil
    FeaturePrefsStore.batch1651.v1657pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1657: people mode
internal fun PlayerActivity.showV1657PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1657people
    FeaturePrefsStore.batch1651.v1657people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1658: party mode
internal fun PlayerActivity.showV1658PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1658party
    FeaturePrefsStore.batch1651.v1658party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1658: patient mode
internal fun PlayerActivity.showV1658PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1658patient
    FeaturePrefsStore.batch1651.v1658patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1658: patrol mode
internal fun PlayerActivity.showV1658PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1658patrol
    FeaturePrefsStore.batch1651.v1658patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1658: pave mode
internal fun PlayerActivity.showV1658PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1658pave
    FeaturePrefsStore.batch1651.v1658pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1658: payment mode
internal fun PlayerActivity.showV1658PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1658payment
    FeaturePrefsStore.batch1651.v1658payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1658: peace level
internal fun PlayerActivity.showV1658PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1658peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1658peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1658: peanut level
internal fun PlayerActivity.showV1658PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1658peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1658peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1658: pear level
internal fun PlayerActivity.showV1658PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1658pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1658pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1658: pearl level
internal fun PlayerActivity.showV1658PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1658pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1658pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1658: peasant level
internal fun PlayerActivity.showV1658PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1658peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1658peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1658: pelican mode
internal fun PlayerActivity.showV1658PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1658pelican
    FeaturePrefsStore.batch1651.v1658pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1658: pen mode
internal fun PlayerActivity.showV1658PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1658pen
    FeaturePrefsStore.batch1651.v1658pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1658: penalty mode
internal fun PlayerActivity.showV1658PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1658penalty
    FeaturePrefsStore.batch1651.v1658penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1658: pencil mode
internal fun PlayerActivity.showV1658PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1658pencil
    FeaturePrefsStore.batch1651.v1658pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1658: people mode
internal fun PlayerActivity.showV1658PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1658people
    FeaturePrefsStore.batch1651.v1658people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1659: party mode
internal fun PlayerActivity.showV1659PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1659party
    FeaturePrefsStore.batch1651.v1659party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1659: patient mode
internal fun PlayerActivity.showV1659PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1659patient
    FeaturePrefsStore.batch1651.v1659patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1659: patrol mode
internal fun PlayerActivity.showV1659PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1659patrol
    FeaturePrefsStore.batch1651.v1659patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1659: pave mode
internal fun PlayerActivity.showV1659PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1659pave
    FeaturePrefsStore.batch1651.v1659pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1659: payment mode
internal fun PlayerActivity.showV1659PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1659payment
    FeaturePrefsStore.batch1651.v1659payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1659: peace level
internal fun PlayerActivity.showV1659PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1659peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1659peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1659: peanut level
internal fun PlayerActivity.showV1659PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1659peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1659peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1659: pear level
internal fun PlayerActivity.showV1659PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1659pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1659pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1659: pearl level
internal fun PlayerActivity.showV1659PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1659pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1659pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1659: peasant level
internal fun PlayerActivity.showV1659PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1659peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1659peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1659: pelican mode
internal fun PlayerActivity.showV1659PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1659pelican
    FeaturePrefsStore.batch1651.v1659pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1659: pen mode
internal fun PlayerActivity.showV1659PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1659pen
    FeaturePrefsStore.batch1651.v1659pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1659: penalty mode
internal fun PlayerActivity.showV1659PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1659penalty
    FeaturePrefsStore.batch1651.v1659penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1659: pencil mode
internal fun PlayerActivity.showV1659PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1659pencil
    FeaturePrefsStore.batch1651.v1659pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1659: people mode
internal fun PlayerActivity.showV1659PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1659people
    FeaturePrefsStore.batch1651.v1659people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

// v1660: party mode
internal fun PlayerActivity.showV1660PartyToggle() {
    val current = FeaturePrefsStore.batch1651.v1660party
    FeaturePrefsStore.batch1651.v1660party = !current
    AppToast.show(this, "party: ${if (!current) "ON" else "OFF"}")
}

// v1660: patient mode
internal fun PlayerActivity.showV1660PatientToggle() {
    val current = FeaturePrefsStore.batch1651.v1660patient
    FeaturePrefsStore.batch1651.v1660patient = !current
    AppToast.show(this, "patient: ${if (!current) "ON" else "OFF"}")
}

// v1660: patrol mode
internal fun PlayerActivity.showV1660PatrolToggle() {
    val current = FeaturePrefsStore.batch1651.v1660patrol
    FeaturePrefsStore.batch1651.v1660patrol = !current
    AppToast.show(this, "patrol: ${if (!current) "ON" else "OFF"}")
}

// v1660: pave mode
internal fun PlayerActivity.showV1660PaveToggle() {
    val current = FeaturePrefsStore.batch1651.v1660pave
    FeaturePrefsStore.batch1651.v1660pave = !current
    AppToast.show(this, "pave: ${if (!current) "ON" else "OFF"}")
}

// v1660: payment mode
internal fun PlayerActivity.showV1660PaymentToggle() {
    val current = FeaturePrefsStore.batch1651.v1660payment
    FeaturePrefsStore.batch1651.v1660payment = !current
    AppToast.show(this, "payment: ${if (!current) "ON" else "OFF"}")
}

// v1660: peace level
internal fun PlayerActivity.showV1660PeaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1660peace).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peace level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1660peace = value
        AppToast.show(this, "peace: $value")
    }
}

// v1660: peanut level
internal fun PlayerActivity.showV1660PeanutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1660peanut).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peanut level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1660peanut = value
        AppToast.show(this, "peanut: $value")
    }
}

// v1660: pear level
internal fun PlayerActivity.showV1660PearDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1660pear).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pear level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1660pear = value
        AppToast.show(this, "pear: $value")
    }
}

// v1660: pearl level
internal fun PlayerActivity.showV1660PearlDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1660pearl).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pearl level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1660pearl = value
        AppToast.show(this, "pearl: $value")
    }
}

// v1660: peasant level
internal fun PlayerActivity.showV1660PeasantDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1651.v1660peasant).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "peasant level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1651.v1660peasant = value
        AppToast.show(this, "peasant: $value")
    }
}

// v1660: pelican mode
internal fun PlayerActivity.showV1660PelicanToggle() {
    val current = FeaturePrefsStore.batch1651.v1660pelican
    FeaturePrefsStore.batch1651.v1660pelican = !current
    AppToast.show(this, "pelican: ${if (!current) "ON" else "OFF"}")
}

// v1660: pen mode
internal fun PlayerActivity.showV1660PenToggle() {
    val current = FeaturePrefsStore.batch1651.v1660pen
    FeaturePrefsStore.batch1651.v1660pen = !current
    AppToast.show(this, "pen: ${if (!current) "ON" else "OFF"}")
}

// v1660: penalty mode
internal fun PlayerActivity.showV1660PenaltyToggle() {
    val current = FeaturePrefsStore.batch1651.v1660penalty
    FeaturePrefsStore.batch1651.v1660penalty = !current
    AppToast.show(this, "penalty: ${if (!current) "ON" else "OFF"}")
}

// v1660: pencil mode
internal fun PlayerActivity.showV1660PencilToggle() {
    val current = FeaturePrefsStore.batch1651.v1660pencil
    FeaturePrefsStore.batch1651.v1660pencil = !current
    AppToast.show(this, "pencil: ${if (!current) "ON" else "OFF"}")
}

// v1660: people mode
internal fun PlayerActivity.showV1660PeopleToggle() {
    val current = FeaturePrefsStore.batch1651.v1660people
    FeaturePrefsStore.batch1651.v1660people = !current
    AppToast.show(this, "people: ${if (!current) "ON" else "OFF"}")
}

