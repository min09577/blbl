package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1821: arranged mode
internal fun PlayerActivity.showV1821ArrangedToggle() {
    val current = FeaturePrefsStore.batch1821.v1821arranged
    FeaturePrefsStore.batch1821.v1821arranged = !current
    AppToast.show(this, "arranged: ${if (!current) "ON" else "OFF"}")
}

// v1821: assembled mode
internal fun PlayerActivity.showV1821AssembledToggle() {
    val current = FeaturePrefsStore.batch1821.v1821assembled
    FeaturePrefsStore.batch1821.v1821assembled = !current
    AppToast.show(this, "assembled: ${if (!current) "ON" else "OFF"}")
}

// v1821: assessed mode
internal fun PlayerActivity.showV1821AssessedToggle() {
    val current = FeaturePrefsStore.batch1821.v1821assessed
    FeaturePrefsStore.batch1821.v1821assessed = !current
    AppToast.show(this, "assessed: ${if (!current) "ON" else "OFF"}")
}

// v1821: assigned mode
internal fun PlayerActivity.showV1821AssignedToggle() {
    val current = FeaturePrefsStore.batch1821.v1821assigned
    FeaturePrefsStore.batch1821.v1821assigned = !current
    AppToast.show(this, "assigned: ${if (!current) "ON" else "OFF"}")
}

// v1821: assisted mode
internal fun PlayerActivity.showV1821AssistedToggle() {
    val current = FeaturePrefsStore.batch1821.v1821assisted
    FeaturePrefsStore.batch1821.v1821assisted = !current
    AppToast.show(this, "assisted: ${if (!current) "ON" else "OFF"}")
}

// v1821: assumed level
internal fun PlayerActivity.showV1821AssumedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1821assumed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "assumed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1821assumed = value
        AppToast.show(this, "assumed: $value")
    }
}

// v1821: attached level
internal fun PlayerActivity.showV1821AttachedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1821attached).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attached level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1821attached = value
        AppToast.show(this, "attached: $value")
    }
}

// v1821: attained level
internal fun PlayerActivity.showV1821AttainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1821attained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1821attained = value
        AppToast.show(this, "attained: $value")
    }
}

// v1821: attempted level
internal fun PlayerActivity.showV1821AttemptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1821attempted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attempted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1821attempted = value
        AppToast.show(this, "attempted: $value")
    }
}

// v1821: attended level
internal fun PlayerActivity.showV1821AttendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1821attended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1821attended = value
        AppToast.show(this, "attended: $value")
    }
}

// v1821: augmented mode
internal fun PlayerActivity.showV1821AugmentedToggle() {
    val current = FeaturePrefsStore.batch1821.v1821augmented
    FeaturePrefsStore.batch1821.v1821augmented = !current
    AppToast.show(this, "augmented: ${if (!current) "ON" else "OFF"}")
}

// v1821: authored mode
internal fun PlayerActivity.showV1821AuthoredToggle() {
    val current = FeaturePrefsStore.batch1821.v1821authored
    FeaturePrefsStore.batch1821.v1821authored = !current
    AppToast.show(this, "authored: ${if (!current) "ON" else "OFF"}")
}

// v1821: authorized mode
internal fun PlayerActivity.showV1821AuthorizedToggle() {
    val current = FeaturePrefsStore.batch1821.v1821authorized
    FeaturePrefsStore.batch1821.v1821authorized = !current
    AppToast.show(this, "authorized: ${if (!current) "ON" else "OFF"}")
}

// v1821: balanced mode
internal fun PlayerActivity.showV1821BalancedToggle() {
    val current = FeaturePrefsStore.batch1821.v1821balanced
    FeaturePrefsStore.batch1821.v1821balanced = !current
    AppToast.show(this, "balanced: ${if (!current) "ON" else "OFF"}")
}

// v1821: banded mode
internal fun PlayerActivity.showV1821BandedToggle() {
    val current = FeaturePrefsStore.batch1821.v1821banded
    FeaturePrefsStore.batch1821.v1821banded = !current
    AppToast.show(this, "banded: ${if (!current) "ON" else "OFF"}")
}

// v1822: arranged mode
internal fun PlayerActivity.showV1822ArrangedToggle() {
    val current = FeaturePrefsStore.batch1821.v1822arranged
    FeaturePrefsStore.batch1821.v1822arranged = !current
    AppToast.show(this, "arranged: ${if (!current) "ON" else "OFF"}")
}

// v1822: assembled mode
internal fun PlayerActivity.showV1822AssembledToggle() {
    val current = FeaturePrefsStore.batch1821.v1822assembled
    FeaturePrefsStore.batch1821.v1822assembled = !current
    AppToast.show(this, "assembled: ${if (!current) "ON" else "OFF"}")
}

// v1822: assessed mode
internal fun PlayerActivity.showV1822AssessedToggle() {
    val current = FeaturePrefsStore.batch1821.v1822assessed
    FeaturePrefsStore.batch1821.v1822assessed = !current
    AppToast.show(this, "assessed: ${if (!current) "ON" else "OFF"}")
}

// v1822: assigned mode
internal fun PlayerActivity.showV1822AssignedToggle() {
    val current = FeaturePrefsStore.batch1821.v1822assigned
    FeaturePrefsStore.batch1821.v1822assigned = !current
    AppToast.show(this, "assigned: ${if (!current) "ON" else "OFF"}")
}

// v1822: assisted mode
internal fun PlayerActivity.showV1822AssistedToggle() {
    val current = FeaturePrefsStore.batch1821.v1822assisted
    FeaturePrefsStore.batch1821.v1822assisted = !current
    AppToast.show(this, "assisted: ${if (!current) "ON" else "OFF"}")
}

// v1822: assumed level
internal fun PlayerActivity.showV1822AssumedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1822assumed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "assumed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1822assumed = value
        AppToast.show(this, "assumed: $value")
    }
}

// v1822: attached level
internal fun PlayerActivity.showV1822AttachedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1822attached).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attached level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1822attached = value
        AppToast.show(this, "attached: $value")
    }
}

// v1822: attained level
internal fun PlayerActivity.showV1822AttainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1822attained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1822attained = value
        AppToast.show(this, "attained: $value")
    }
}

// v1822: attempted level
internal fun PlayerActivity.showV1822AttemptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1822attempted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attempted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1822attempted = value
        AppToast.show(this, "attempted: $value")
    }
}

// v1822: attended level
internal fun PlayerActivity.showV1822AttendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1822attended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1822attended = value
        AppToast.show(this, "attended: $value")
    }
}

// v1822: augmented mode
internal fun PlayerActivity.showV1822AugmentedToggle() {
    val current = FeaturePrefsStore.batch1821.v1822augmented
    FeaturePrefsStore.batch1821.v1822augmented = !current
    AppToast.show(this, "augmented: ${if (!current) "ON" else "OFF"}")
}

// v1822: authored mode
internal fun PlayerActivity.showV1822AuthoredToggle() {
    val current = FeaturePrefsStore.batch1821.v1822authored
    FeaturePrefsStore.batch1821.v1822authored = !current
    AppToast.show(this, "authored: ${if (!current) "ON" else "OFF"}")
}

// v1822: authorized mode
internal fun PlayerActivity.showV1822AuthorizedToggle() {
    val current = FeaturePrefsStore.batch1821.v1822authorized
    FeaturePrefsStore.batch1821.v1822authorized = !current
    AppToast.show(this, "authorized: ${if (!current) "ON" else "OFF"}")
}

// v1822: balanced mode
internal fun PlayerActivity.showV1822BalancedToggle() {
    val current = FeaturePrefsStore.batch1821.v1822balanced
    FeaturePrefsStore.batch1821.v1822balanced = !current
    AppToast.show(this, "balanced: ${if (!current) "ON" else "OFF"}")
}

// v1822: banded mode
internal fun PlayerActivity.showV1822BandedToggle() {
    val current = FeaturePrefsStore.batch1821.v1822banded
    FeaturePrefsStore.batch1821.v1822banded = !current
    AppToast.show(this, "banded: ${if (!current) "ON" else "OFF"}")
}

// v1823: arranged mode
internal fun PlayerActivity.showV1823ArrangedToggle() {
    val current = FeaturePrefsStore.batch1821.v1823arranged
    FeaturePrefsStore.batch1821.v1823arranged = !current
    AppToast.show(this, "arranged: ${if (!current) "ON" else "OFF"}")
}

// v1823: assembled mode
internal fun PlayerActivity.showV1823AssembledToggle() {
    val current = FeaturePrefsStore.batch1821.v1823assembled
    FeaturePrefsStore.batch1821.v1823assembled = !current
    AppToast.show(this, "assembled: ${if (!current) "ON" else "OFF"}")
}

// v1823: assessed mode
internal fun PlayerActivity.showV1823AssessedToggle() {
    val current = FeaturePrefsStore.batch1821.v1823assessed
    FeaturePrefsStore.batch1821.v1823assessed = !current
    AppToast.show(this, "assessed: ${if (!current) "ON" else "OFF"}")
}

// v1823: assigned mode
internal fun PlayerActivity.showV1823AssignedToggle() {
    val current = FeaturePrefsStore.batch1821.v1823assigned
    FeaturePrefsStore.batch1821.v1823assigned = !current
    AppToast.show(this, "assigned: ${if (!current) "ON" else "OFF"}")
}

// v1823: assisted mode
internal fun PlayerActivity.showV1823AssistedToggle() {
    val current = FeaturePrefsStore.batch1821.v1823assisted
    FeaturePrefsStore.batch1821.v1823assisted = !current
    AppToast.show(this, "assisted: ${if (!current) "ON" else "OFF"}")
}

// v1823: assumed level
internal fun PlayerActivity.showV1823AssumedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1823assumed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "assumed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1823assumed = value
        AppToast.show(this, "assumed: $value")
    }
}

// v1823: attached level
internal fun PlayerActivity.showV1823AttachedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1823attached).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attached level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1823attached = value
        AppToast.show(this, "attached: $value")
    }
}

// v1823: attained level
internal fun PlayerActivity.showV1823AttainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1823attained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1823attained = value
        AppToast.show(this, "attained: $value")
    }
}

// v1823: attempted level
internal fun PlayerActivity.showV1823AttemptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1823attempted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attempted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1823attempted = value
        AppToast.show(this, "attempted: $value")
    }
}

// v1823: attended level
internal fun PlayerActivity.showV1823AttendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1823attended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1823attended = value
        AppToast.show(this, "attended: $value")
    }
}

// v1823: augmented mode
internal fun PlayerActivity.showV1823AugmentedToggle() {
    val current = FeaturePrefsStore.batch1821.v1823augmented
    FeaturePrefsStore.batch1821.v1823augmented = !current
    AppToast.show(this, "augmented: ${if (!current) "ON" else "OFF"}")
}

// v1823: authored mode
internal fun PlayerActivity.showV1823AuthoredToggle() {
    val current = FeaturePrefsStore.batch1821.v1823authored
    FeaturePrefsStore.batch1821.v1823authored = !current
    AppToast.show(this, "authored: ${if (!current) "ON" else "OFF"}")
}

// v1823: authorized mode
internal fun PlayerActivity.showV1823AuthorizedToggle() {
    val current = FeaturePrefsStore.batch1821.v1823authorized
    FeaturePrefsStore.batch1821.v1823authorized = !current
    AppToast.show(this, "authorized: ${if (!current) "ON" else "OFF"}")
}

// v1823: balanced mode
internal fun PlayerActivity.showV1823BalancedToggle() {
    val current = FeaturePrefsStore.batch1821.v1823balanced
    FeaturePrefsStore.batch1821.v1823balanced = !current
    AppToast.show(this, "balanced: ${if (!current) "ON" else "OFF"}")
}

// v1823: banded mode
internal fun PlayerActivity.showV1823BandedToggle() {
    val current = FeaturePrefsStore.batch1821.v1823banded
    FeaturePrefsStore.batch1821.v1823banded = !current
    AppToast.show(this, "banded: ${if (!current) "ON" else "OFF"}")
}

// v1824: arranged mode
internal fun PlayerActivity.showV1824ArrangedToggle() {
    val current = FeaturePrefsStore.batch1821.v1824arranged
    FeaturePrefsStore.batch1821.v1824arranged = !current
    AppToast.show(this, "arranged: ${if (!current) "ON" else "OFF"}")
}

// v1824: assembled mode
internal fun PlayerActivity.showV1824AssembledToggle() {
    val current = FeaturePrefsStore.batch1821.v1824assembled
    FeaturePrefsStore.batch1821.v1824assembled = !current
    AppToast.show(this, "assembled: ${if (!current) "ON" else "OFF"}")
}

// v1824: assessed mode
internal fun PlayerActivity.showV1824AssessedToggle() {
    val current = FeaturePrefsStore.batch1821.v1824assessed
    FeaturePrefsStore.batch1821.v1824assessed = !current
    AppToast.show(this, "assessed: ${if (!current) "ON" else "OFF"}")
}

// v1824: assigned mode
internal fun PlayerActivity.showV1824AssignedToggle() {
    val current = FeaturePrefsStore.batch1821.v1824assigned
    FeaturePrefsStore.batch1821.v1824assigned = !current
    AppToast.show(this, "assigned: ${if (!current) "ON" else "OFF"}")
}

// v1824: assisted mode
internal fun PlayerActivity.showV1824AssistedToggle() {
    val current = FeaturePrefsStore.batch1821.v1824assisted
    FeaturePrefsStore.batch1821.v1824assisted = !current
    AppToast.show(this, "assisted: ${if (!current) "ON" else "OFF"}")
}

// v1824: assumed level
internal fun PlayerActivity.showV1824AssumedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1824assumed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "assumed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1824assumed = value
        AppToast.show(this, "assumed: $value")
    }
}

// v1824: attached level
internal fun PlayerActivity.showV1824AttachedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1824attached).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attached level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1824attached = value
        AppToast.show(this, "attached: $value")
    }
}

// v1824: attained level
internal fun PlayerActivity.showV1824AttainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1824attained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1824attained = value
        AppToast.show(this, "attained: $value")
    }
}

// v1824: attempted level
internal fun PlayerActivity.showV1824AttemptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1824attempted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attempted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1824attempted = value
        AppToast.show(this, "attempted: $value")
    }
}

// v1824: attended level
internal fun PlayerActivity.showV1824AttendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1824attended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1824attended = value
        AppToast.show(this, "attended: $value")
    }
}

// v1824: augmented mode
internal fun PlayerActivity.showV1824AugmentedToggle() {
    val current = FeaturePrefsStore.batch1821.v1824augmented
    FeaturePrefsStore.batch1821.v1824augmented = !current
    AppToast.show(this, "augmented: ${if (!current) "ON" else "OFF"}")
}

// v1824: authored mode
internal fun PlayerActivity.showV1824AuthoredToggle() {
    val current = FeaturePrefsStore.batch1821.v1824authored
    FeaturePrefsStore.batch1821.v1824authored = !current
    AppToast.show(this, "authored: ${if (!current) "ON" else "OFF"}")
}

// v1824: authorized mode
internal fun PlayerActivity.showV1824AuthorizedToggle() {
    val current = FeaturePrefsStore.batch1821.v1824authorized
    FeaturePrefsStore.batch1821.v1824authorized = !current
    AppToast.show(this, "authorized: ${if (!current) "ON" else "OFF"}")
}

// v1824: balanced mode
internal fun PlayerActivity.showV1824BalancedToggle() {
    val current = FeaturePrefsStore.batch1821.v1824balanced
    FeaturePrefsStore.batch1821.v1824balanced = !current
    AppToast.show(this, "balanced: ${if (!current) "ON" else "OFF"}")
}

// v1824: banded mode
internal fun PlayerActivity.showV1824BandedToggle() {
    val current = FeaturePrefsStore.batch1821.v1824banded
    FeaturePrefsStore.batch1821.v1824banded = !current
    AppToast.show(this, "banded: ${if (!current) "ON" else "OFF"}")
}

// v1825: arranged mode
internal fun PlayerActivity.showV1825ArrangedToggle() {
    val current = FeaturePrefsStore.batch1821.v1825arranged
    FeaturePrefsStore.batch1821.v1825arranged = !current
    AppToast.show(this, "arranged: ${if (!current) "ON" else "OFF"}")
}

// v1825: assembled mode
internal fun PlayerActivity.showV1825AssembledToggle() {
    val current = FeaturePrefsStore.batch1821.v1825assembled
    FeaturePrefsStore.batch1821.v1825assembled = !current
    AppToast.show(this, "assembled: ${if (!current) "ON" else "OFF"}")
}

// v1825: assessed mode
internal fun PlayerActivity.showV1825AssessedToggle() {
    val current = FeaturePrefsStore.batch1821.v1825assessed
    FeaturePrefsStore.batch1821.v1825assessed = !current
    AppToast.show(this, "assessed: ${if (!current) "ON" else "OFF"}")
}

// v1825: assigned mode
internal fun PlayerActivity.showV1825AssignedToggle() {
    val current = FeaturePrefsStore.batch1821.v1825assigned
    FeaturePrefsStore.batch1821.v1825assigned = !current
    AppToast.show(this, "assigned: ${if (!current) "ON" else "OFF"}")
}

// v1825: assisted mode
internal fun PlayerActivity.showV1825AssistedToggle() {
    val current = FeaturePrefsStore.batch1821.v1825assisted
    FeaturePrefsStore.batch1821.v1825assisted = !current
    AppToast.show(this, "assisted: ${if (!current) "ON" else "OFF"}")
}

// v1825: assumed level
internal fun PlayerActivity.showV1825AssumedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1825assumed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "assumed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1825assumed = value
        AppToast.show(this, "assumed: $value")
    }
}

// v1825: attached level
internal fun PlayerActivity.showV1825AttachedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1825attached).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attached level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1825attached = value
        AppToast.show(this, "attached: $value")
    }
}

// v1825: attained level
internal fun PlayerActivity.showV1825AttainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1825attained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1825attained = value
        AppToast.show(this, "attained: $value")
    }
}

// v1825: attempted level
internal fun PlayerActivity.showV1825AttemptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1825attempted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attempted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1825attempted = value
        AppToast.show(this, "attempted: $value")
    }
}

// v1825: attended level
internal fun PlayerActivity.showV1825AttendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1825attended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1825attended = value
        AppToast.show(this, "attended: $value")
    }
}

// v1825: augmented mode
internal fun PlayerActivity.showV1825AugmentedToggle() {
    val current = FeaturePrefsStore.batch1821.v1825augmented
    FeaturePrefsStore.batch1821.v1825augmented = !current
    AppToast.show(this, "augmented: ${if (!current) "ON" else "OFF"}")
}

// v1825: authored mode
internal fun PlayerActivity.showV1825AuthoredToggle() {
    val current = FeaturePrefsStore.batch1821.v1825authored
    FeaturePrefsStore.batch1821.v1825authored = !current
    AppToast.show(this, "authored: ${if (!current) "ON" else "OFF"}")
}

// v1825: authorized mode
internal fun PlayerActivity.showV1825AuthorizedToggle() {
    val current = FeaturePrefsStore.batch1821.v1825authorized
    FeaturePrefsStore.batch1821.v1825authorized = !current
    AppToast.show(this, "authorized: ${if (!current) "ON" else "OFF"}")
}

// v1825: balanced mode
internal fun PlayerActivity.showV1825BalancedToggle() {
    val current = FeaturePrefsStore.batch1821.v1825balanced
    FeaturePrefsStore.batch1821.v1825balanced = !current
    AppToast.show(this, "balanced: ${if (!current) "ON" else "OFF"}")
}

// v1825: banded mode
internal fun PlayerActivity.showV1825BandedToggle() {
    val current = FeaturePrefsStore.batch1821.v1825banded
    FeaturePrefsStore.batch1821.v1825banded = !current
    AppToast.show(this, "banded: ${if (!current) "ON" else "OFF"}")
}

// v1826: arranged mode
internal fun PlayerActivity.showV1826ArrangedToggle() {
    val current = FeaturePrefsStore.batch1821.v1826arranged
    FeaturePrefsStore.batch1821.v1826arranged = !current
    AppToast.show(this, "arranged: ${if (!current) "ON" else "OFF"}")
}

// v1826: assembled mode
internal fun PlayerActivity.showV1826AssembledToggle() {
    val current = FeaturePrefsStore.batch1821.v1826assembled
    FeaturePrefsStore.batch1821.v1826assembled = !current
    AppToast.show(this, "assembled: ${if (!current) "ON" else "OFF"}")
}

// v1826: assessed mode
internal fun PlayerActivity.showV1826AssessedToggle() {
    val current = FeaturePrefsStore.batch1821.v1826assessed
    FeaturePrefsStore.batch1821.v1826assessed = !current
    AppToast.show(this, "assessed: ${if (!current) "ON" else "OFF"}")
}

// v1826: assigned mode
internal fun PlayerActivity.showV1826AssignedToggle() {
    val current = FeaturePrefsStore.batch1821.v1826assigned
    FeaturePrefsStore.batch1821.v1826assigned = !current
    AppToast.show(this, "assigned: ${if (!current) "ON" else "OFF"}")
}

// v1826: assisted mode
internal fun PlayerActivity.showV1826AssistedToggle() {
    val current = FeaturePrefsStore.batch1821.v1826assisted
    FeaturePrefsStore.batch1821.v1826assisted = !current
    AppToast.show(this, "assisted: ${if (!current) "ON" else "OFF"}")
}

// v1826: assumed level
internal fun PlayerActivity.showV1826AssumedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1826assumed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "assumed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1826assumed = value
        AppToast.show(this, "assumed: $value")
    }
}

// v1826: attached level
internal fun PlayerActivity.showV1826AttachedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1826attached).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attached level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1826attached = value
        AppToast.show(this, "attached: $value")
    }
}

// v1826: attained level
internal fun PlayerActivity.showV1826AttainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1826attained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1826attained = value
        AppToast.show(this, "attained: $value")
    }
}

// v1826: attempted level
internal fun PlayerActivity.showV1826AttemptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1826attempted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attempted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1826attempted = value
        AppToast.show(this, "attempted: $value")
    }
}

// v1826: attended level
internal fun PlayerActivity.showV1826AttendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1826attended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1826attended = value
        AppToast.show(this, "attended: $value")
    }
}

// v1826: augmented mode
internal fun PlayerActivity.showV1826AugmentedToggle() {
    val current = FeaturePrefsStore.batch1821.v1826augmented
    FeaturePrefsStore.batch1821.v1826augmented = !current
    AppToast.show(this, "augmented: ${if (!current) "ON" else "OFF"}")
}

// v1826: authored mode
internal fun PlayerActivity.showV1826AuthoredToggle() {
    val current = FeaturePrefsStore.batch1821.v1826authored
    FeaturePrefsStore.batch1821.v1826authored = !current
    AppToast.show(this, "authored: ${if (!current) "ON" else "OFF"}")
}

// v1826: authorized mode
internal fun PlayerActivity.showV1826AuthorizedToggle() {
    val current = FeaturePrefsStore.batch1821.v1826authorized
    FeaturePrefsStore.batch1821.v1826authorized = !current
    AppToast.show(this, "authorized: ${if (!current) "ON" else "OFF"}")
}

// v1826: balanced mode
internal fun PlayerActivity.showV1826BalancedToggle() {
    val current = FeaturePrefsStore.batch1821.v1826balanced
    FeaturePrefsStore.batch1821.v1826balanced = !current
    AppToast.show(this, "balanced: ${if (!current) "ON" else "OFF"}")
}

// v1826: banded mode
internal fun PlayerActivity.showV1826BandedToggle() {
    val current = FeaturePrefsStore.batch1821.v1826banded
    FeaturePrefsStore.batch1821.v1826banded = !current
    AppToast.show(this, "banded: ${if (!current) "ON" else "OFF"}")
}

// v1827: arranged mode
internal fun PlayerActivity.showV1827ArrangedToggle() {
    val current = FeaturePrefsStore.batch1821.v1827arranged
    FeaturePrefsStore.batch1821.v1827arranged = !current
    AppToast.show(this, "arranged: ${if (!current) "ON" else "OFF"}")
}

// v1827: assembled mode
internal fun PlayerActivity.showV1827AssembledToggle() {
    val current = FeaturePrefsStore.batch1821.v1827assembled
    FeaturePrefsStore.batch1821.v1827assembled = !current
    AppToast.show(this, "assembled: ${if (!current) "ON" else "OFF"}")
}

// v1827: assessed mode
internal fun PlayerActivity.showV1827AssessedToggle() {
    val current = FeaturePrefsStore.batch1821.v1827assessed
    FeaturePrefsStore.batch1821.v1827assessed = !current
    AppToast.show(this, "assessed: ${if (!current) "ON" else "OFF"}")
}

// v1827: assigned mode
internal fun PlayerActivity.showV1827AssignedToggle() {
    val current = FeaturePrefsStore.batch1821.v1827assigned
    FeaturePrefsStore.batch1821.v1827assigned = !current
    AppToast.show(this, "assigned: ${if (!current) "ON" else "OFF"}")
}

// v1827: assisted mode
internal fun PlayerActivity.showV1827AssistedToggle() {
    val current = FeaturePrefsStore.batch1821.v1827assisted
    FeaturePrefsStore.batch1821.v1827assisted = !current
    AppToast.show(this, "assisted: ${if (!current) "ON" else "OFF"}")
}

// v1827: assumed level
internal fun PlayerActivity.showV1827AssumedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1827assumed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "assumed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1827assumed = value
        AppToast.show(this, "assumed: $value")
    }
}

// v1827: attached level
internal fun PlayerActivity.showV1827AttachedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1827attached).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attached level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1827attached = value
        AppToast.show(this, "attached: $value")
    }
}

// v1827: attained level
internal fun PlayerActivity.showV1827AttainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1827attained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1827attained = value
        AppToast.show(this, "attained: $value")
    }
}

// v1827: attempted level
internal fun PlayerActivity.showV1827AttemptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1827attempted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attempted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1827attempted = value
        AppToast.show(this, "attempted: $value")
    }
}

// v1827: attended level
internal fun PlayerActivity.showV1827AttendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1827attended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1827attended = value
        AppToast.show(this, "attended: $value")
    }
}

// v1827: augmented mode
internal fun PlayerActivity.showV1827AugmentedToggle() {
    val current = FeaturePrefsStore.batch1821.v1827augmented
    FeaturePrefsStore.batch1821.v1827augmented = !current
    AppToast.show(this, "augmented: ${if (!current) "ON" else "OFF"}")
}

// v1827: authored mode
internal fun PlayerActivity.showV1827AuthoredToggle() {
    val current = FeaturePrefsStore.batch1821.v1827authored
    FeaturePrefsStore.batch1821.v1827authored = !current
    AppToast.show(this, "authored: ${if (!current) "ON" else "OFF"}")
}

// v1827: authorized mode
internal fun PlayerActivity.showV1827AuthorizedToggle() {
    val current = FeaturePrefsStore.batch1821.v1827authorized
    FeaturePrefsStore.batch1821.v1827authorized = !current
    AppToast.show(this, "authorized: ${if (!current) "ON" else "OFF"}")
}

// v1827: balanced mode
internal fun PlayerActivity.showV1827BalancedToggle() {
    val current = FeaturePrefsStore.batch1821.v1827balanced
    FeaturePrefsStore.batch1821.v1827balanced = !current
    AppToast.show(this, "balanced: ${if (!current) "ON" else "OFF"}")
}

// v1827: banded mode
internal fun PlayerActivity.showV1827BandedToggle() {
    val current = FeaturePrefsStore.batch1821.v1827banded
    FeaturePrefsStore.batch1821.v1827banded = !current
    AppToast.show(this, "banded: ${if (!current) "ON" else "OFF"}")
}

// v1828: arranged mode
internal fun PlayerActivity.showV1828ArrangedToggle() {
    val current = FeaturePrefsStore.batch1821.v1828arranged
    FeaturePrefsStore.batch1821.v1828arranged = !current
    AppToast.show(this, "arranged: ${if (!current) "ON" else "OFF"}")
}

// v1828: assembled mode
internal fun PlayerActivity.showV1828AssembledToggle() {
    val current = FeaturePrefsStore.batch1821.v1828assembled
    FeaturePrefsStore.batch1821.v1828assembled = !current
    AppToast.show(this, "assembled: ${if (!current) "ON" else "OFF"}")
}

// v1828: assessed mode
internal fun PlayerActivity.showV1828AssessedToggle() {
    val current = FeaturePrefsStore.batch1821.v1828assessed
    FeaturePrefsStore.batch1821.v1828assessed = !current
    AppToast.show(this, "assessed: ${if (!current) "ON" else "OFF"}")
}

// v1828: assigned mode
internal fun PlayerActivity.showV1828AssignedToggle() {
    val current = FeaturePrefsStore.batch1821.v1828assigned
    FeaturePrefsStore.batch1821.v1828assigned = !current
    AppToast.show(this, "assigned: ${if (!current) "ON" else "OFF"}")
}

// v1828: assisted mode
internal fun PlayerActivity.showV1828AssistedToggle() {
    val current = FeaturePrefsStore.batch1821.v1828assisted
    FeaturePrefsStore.batch1821.v1828assisted = !current
    AppToast.show(this, "assisted: ${if (!current) "ON" else "OFF"}")
}

// v1828: assumed level
internal fun PlayerActivity.showV1828AssumedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1828assumed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "assumed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1828assumed = value
        AppToast.show(this, "assumed: $value")
    }
}

// v1828: attached level
internal fun PlayerActivity.showV1828AttachedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1828attached).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attached level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1828attached = value
        AppToast.show(this, "attached: $value")
    }
}

// v1828: attained level
internal fun PlayerActivity.showV1828AttainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1828attained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1828attained = value
        AppToast.show(this, "attained: $value")
    }
}

// v1828: attempted level
internal fun PlayerActivity.showV1828AttemptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1828attempted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attempted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1828attempted = value
        AppToast.show(this, "attempted: $value")
    }
}

// v1828: attended level
internal fun PlayerActivity.showV1828AttendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1828attended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1828attended = value
        AppToast.show(this, "attended: $value")
    }
}

// v1828: augmented mode
internal fun PlayerActivity.showV1828AugmentedToggle() {
    val current = FeaturePrefsStore.batch1821.v1828augmented
    FeaturePrefsStore.batch1821.v1828augmented = !current
    AppToast.show(this, "augmented: ${if (!current) "ON" else "OFF"}")
}

// v1828: authored mode
internal fun PlayerActivity.showV1828AuthoredToggle() {
    val current = FeaturePrefsStore.batch1821.v1828authored
    FeaturePrefsStore.batch1821.v1828authored = !current
    AppToast.show(this, "authored: ${if (!current) "ON" else "OFF"}")
}

// v1828: authorized mode
internal fun PlayerActivity.showV1828AuthorizedToggle() {
    val current = FeaturePrefsStore.batch1821.v1828authorized
    FeaturePrefsStore.batch1821.v1828authorized = !current
    AppToast.show(this, "authorized: ${if (!current) "ON" else "OFF"}")
}

// v1828: balanced mode
internal fun PlayerActivity.showV1828BalancedToggle() {
    val current = FeaturePrefsStore.batch1821.v1828balanced
    FeaturePrefsStore.batch1821.v1828balanced = !current
    AppToast.show(this, "balanced: ${if (!current) "ON" else "OFF"}")
}

// v1828: banded mode
internal fun PlayerActivity.showV1828BandedToggle() {
    val current = FeaturePrefsStore.batch1821.v1828banded
    FeaturePrefsStore.batch1821.v1828banded = !current
    AppToast.show(this, "banded: ${if (!current) "ON" else "OFF"}")
}

// v1829: arranged mode
internal fun PlayerActivity.showV1829ArrangedToggle() {
    val current = FeaturePrefsStore.batch1821.v1829arranged
    FeaturePrefsStore.batch1821.v1829arranged = !current
    AppToast.show(this, "arranged: ${if (!current) "ON" else "OFF"}")
}

// v1829: assembled mode
internal fun PlayerActivity.showV1829AssembledToggle() {
    val current = FeaturePrefsStore.batch1821.v1829assembled
    FeaturePrefsStore.batch1821.v1829assembled = !current
    AppToast.show(this, "assembled: ${if (!current) "ON" else "OFF"}")
}

// v1829: assessed mode
internal fun PlayerActivity.showV1829AssessedToggle() {
    val current = FeaturePrefsStore.batch1821.v1829assessed
    FeaturePrefsStore.batch1821.v1829assessed = !current
    AppToast.show(this, "assessed: ${if (!current) "ON" else "OFF"}")
}

// v1829: assigned mode
internal fun PlayerActivity.showV1829AssignedToggle() {
    val current = FeaturePrefsStore.batch1821.v1829assigned
    FeaturePrefsStore.batch1821.v1829assigned = !current
    AppToast.show(this, "assigned: ${if (!current) "ON" else "OFF"}")
}

// v1829: assisted mode
internal fun PlayerActivity.showV1829AssistedToggle() {
    val current = FeaturePrefsStore.batch1821.v1829assisted
    FeaturePrefsStore.batch1821.v1829assisted = !current
    AppToast.show(this, "assisted: ${if (!current) "ON" else "OFF"}")
}

// v1829: assumed level
internal fun PlayerActivity.showV1829AssumedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1829assumed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "assumed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1829assumed = value
        AppToast.show(this, "assumed: $value")
    }
}

// v1829: attached level
internal fun PlayerActivity.showV1829AttachedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1829attached).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attached level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1829attached = value
        AppToast.show(this, "attached: $value")
    }
}

// v1829: attained level
internal fun PlayerActivity.showV1829AttainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1829attained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1829attained = value
        AppToast.show(this, "attained: $value")
    }
}

// v1829: attempted level
internal fun PlayerActivity.showV1829AttemptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1829attempted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attempted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1829attempted = value
        AppToast.show(this, "attempted: $value")
    }
}

// v1829: attended level
internal fun PlayerActivity.showV1829AttendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1829attended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1829attended = value
        AppToast.show(this, "attended: $value")
    }
}

// v1829: augmented mode
internal fun PlayerActivity.showV1829AugmentedToggle() {
    val current = FeaturePrefsStore.batch1821.v1829augmented
    FeaturePrefsStore.batch1821.v1829augmented = !current
    AppToast.show(this, "augmented: ${if (!current) "ON" else "OFF"}")
}

// v1829: authored mode
internal fun PlayerActivity.showV1829AuthoredToggle() {
    val current = FeaturePrefsStore.batch1821.v1829authored
    FeaturePrefsStore.batch1821.v1829authored = !current
    AppToast.show(this, "authored: ${if (!current) "ON" else "OFF"}")
}

// v1829: authorized mode
internal fun PlayerActivity.showV1829AuthorizedToggle() {
    val current = FeaturePrefsStore.batch1821.v1829authorized
    FeaturePrefsStore.batch1821.v1829authorized = !current
    AppToast.show(this, "authorized: ${if (!current) "ON" else "OFF"}")
}

// v1829: balanced mode
internal fun PlayerActivity.showV1829BalancedToggle() {
    val current = FeaturePrefsStore.batch1821.v1829balanced
    FeaturePrefsStore.batch1821.v1829balanced = !current
    AppToast.show(this, "balanced: ${if (!current) "ON" else "OFF"}")
}

// v1829: banded mode
internal fun PlayerActivity.showV1829BandedToggle() {
    val current = FeaturePrefsStore.batch1821.v1829banded
    FeaturePrefsStore.batch1821.v1829banded = !current
    AppToast.show(this, "banded: ${if (!current) "ON" else "OFF"}")
}

// v1830: arranged mode
internal fun PlayerActivity.showV1830ArrangedToggle() {
    val current = FeaturePrefsStore.batch1821.v1830arranged
    FeaturePrefsStore.batch1821.v1830arranged = !current
    AppToast.show(this, "arranged: ${if (!current) "ON" else "OFF"}")
}

// v1830: assembled mode
internal fun PlayerActivity.showV1830AssembledToggle() {
    val current = FeaturePrefsStore.batch1821.v1830assembled
    FeaturePrefsStore.batch1821.v1830assembled = !current
    AppToast.show(this, "assembled: ${if (!current) "ON" else "OFF"}")
}

// v1830: assessed mode
internal fun PlayerActivity.showV1830AssessedToggle() {
    val current = FeaturePrefsStore.batch1821.v1830assessed
    FeaturePrefsStore.batch1821.v1830assessed = !current
    AppToast.show(this, "assessed: ${if (!current) "ON" else "OFF"}")
}

// v1830: assigned mode
internal fun PlayerActivity.showV1830AssignedToggle() {
    val current = FeaturePrefsStore.batch1821.v1830assigned
    FeaturePrefsStore.batch1821.v1830assigned = !current
    AppToast.show(this, "assigned: ${if (!current) "ON" else "OFF"}")
}

// v1830: assisted mode
internal fun PlayerActivity.showV1830AssistedToggle() {
    val current = FeaturePrefsStore.batch1821.v1830assisted
    FeaturePrefsStore.batch1821.v1830assisted = !current
    AppToast.show(this, "assisted: ${if (!current) "ON" else "OFF"}")
}

// v1830: assumed level
internal fun PlayerActivity.showV1830AssumedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1830assumed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "assumed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1830assumed = value
        AppToast.show(this, "assumed: $value")
    }
}

// v1830: attached level
internal fun PlayerActivity.showV1830AttachedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1830attached).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attached level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1830attached = value
        AppToast.show(this, "attached: $value")
    }
}

// v1830: attained level
internal fun PlayerActivity.showV1830AttainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1830attained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1830attained = value
        AppToast.show(this, "attained: $value")
    }
}

// v1830: attempted level
internal fun PlayerActivity.showV1830AttemptedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1830attempted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attempted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1830attempted = value
        AppToast.show(this, "attempted: $value")
    }
}

// v1830: attended level
internal fun PlayerActivity.showV1830AttendedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1821.v1830attended).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "attended level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1821.v1830attended = value
        AppToast.show(this, "attended: $value")
    }
}

// v1830: augmented mode
internal fun PlayerActivity.showV1830AugmentedToggle() {
    val current = FeaturePrefsStore.batch1821.v1830augmented
    FeaturePrefsStore.batch1821.v1830augmented = !current
    AppToast.show(this, "augmented: ${if (!current) "ON" else "OFF"}")
}

// v1830: authored mode
internal fun PlayerActivity.showV1830AuthoredToggle() {
    val current = FeaturePrefsStore.batch1821.v1830authored
    FeaturePrefsStore.batch1821.v1830authored = !current
    AppToast.show(this, "authored: ${if (!current) "ON" else "OFF"}")
}

// v1830: authorized mode
internal fun PlayerActivity.showV1830AuthorizedToggle() {
    val current = FeaturePrefsStore.batch1821.v1830authorized
    FeaturePrefsStore.batch1821.v1830authorized = !current
    AppToast.show(this, "authorized: ${if (!current) "ON" else "OFF"}")
}

// v1830: balanced mode
internal fun PlayerActivity.showV1830BalancedToggle() {
    val current = FeaturePrefsStore.batch1821.v1830balanced
    FeaturePrefsStore.batch1821.v1830balanced = !current
    AppToast.show(this, "balanced: ${if (!current) "ON" else "OFF"}")
}

// v1830: banded mode
internal fun PlayerActivity.showV1830BandedToggle() {
    val current = FeaturePrefsStore.batch1821.v1830banded
    FeaturePrefsStore.batch1821.v1830banded = !current
    AppToast.show(this, "banded: ${if (!current) "ON" else "OFF"}")
}

