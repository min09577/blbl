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

// v1831: banned mode
internal fun PlayerActivity.showV1831BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1831banned
    FeaturePrefsStore.batch1831.v1831banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1831: barred mode
internal fun PlayerActivity.showV1831BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1831barred
    FeaturePrefsStore.batch1831.v1831barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1831: batched mode
internal fun PlayerActivity.showV1831BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1831batched
    FeaturePrefsStore.batch1831.v1831batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1831: beamed mode
internal fun PlayerActivity.showV1831BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1831beamed
    FeaturePrefsStore.batch1831.v1831beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1831: bearing mode
internal fun PlayerActivity.showV1831BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1831bearing
    FeaturePrefsStore.batch1831.v1831bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1831: beating level
internal fun PlayerActivity.showV1831BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1831beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1831beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1831: becoming level
internal fun PlayerActivity.showV1831BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1831becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1831becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1831: beginning level
internal fun PlayerActivity.showV1831BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1831beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1831beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1831: belonging level
internal fun PlayerActivity.showV1831BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1831belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1831belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1831: bending level
internal fun PlayerActivity.showV1831BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1831bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1831bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1831: binding mode
internal fun PlayerActivity.showV1831BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1831binding
    FeaturePrefsStore.batch1831.v1831binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1831: biting mode
internal fun PlayerActivity.showV1831BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1831biting
    FeaturePrefsStore.batch1831.v1831biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1831: blending mode
internal fun PlayerActivity.showV1831BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1831blending
    FeaturePrefsStore.batch1831.v1831blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1831: blessing mode
internal fun PlayerActivity.showV1831BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1831blessing
    FeaturePrefsStore.batch1831.v1831blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1831: blinding mode
internal fun PlayerActivity.showV1831BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1831blinding
    FeaturePrefsStore.batch1831.v1831blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1832: banned mode
internal fun PlayerActivity.showV1832BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1832banned
    FeaturePrefsStore.batch1831.v1832banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1832: barred mode
internal fun PlayerActivity.showV1832BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1832barred
    FeaturePrefsStore.batch1831.v1832barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1832: batched mode
internal fun PlayerActivity.showV1832BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1832batched
    FeaturePrefsStore.batch1831.v1832batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1832: beamed mode
internal fun PlayerActivity.showV1832BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1832beamed
    FeaturePrefsStore.batch1831.v1832beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1832: bearing mode
internal fun PlayerActivity.showV1832BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1832bearing
    FeaturePrefsStore.batch1831.v1832bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1832: beating level
internal fun PlayerActivity.showV1832BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1832beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1832beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1832: becoming level
internal fun PlayerActivity.showV1832BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1832becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1832becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1832: beginning level
internal fun PlayerActivity.showV1832BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1832beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1832beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1832: belonging level
internal fun PlayerActivity.showV1832BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1832belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1832belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1832: bending level
internal fun PlayerActivity.showV1832BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1832bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1832bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1832: binding mode
internal fun PlayerActivity.showV1832BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1832binding
    FeaturePrefsStore.batch1831.v1832binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1832: biting mode
internal fun PlayerActivity.showV1832BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1832biting
    FeaturePrefsStore.batch1831.v1832biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1832: blending mode
internal fun PlayerActivity.showV1832BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1832blending
    FeaturePrefsStore.batch1831.v1832blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1832: blessing mode
internal fun PlayerActivity.showV1832BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1832blessing
    FeaturePrefsStore.batch1831.v1832blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1832: blinding mode
internal fun PlayerActivity.showV1832BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1832blinding
    FeaturePrefsStore.batch1831.v1832blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1833: banned mode
internal fun PlayerActivity.showV1833BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1833banned
    FeaturePrefsStore.batch1831.v1833banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1833: barred mode
internal fun PlayerActivity.showV1833BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1833barred
    FeaturePrefsStore.batch1831.v1833barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1833: batched mode
internal fun PlayerActivity.showV1833BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1833batched
    FeaturePrefsStore.batch1831.v1833batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1833: beamed mode
internal fun PlayerActivity.showV1833BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1833beamed
    FeaturePrefsStore.batch1831.v1833beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1833: bearing mode
internal fun PlayerActivity.showV1833BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1833bearing
    FeaturePrefsStore.batch1831.v1833bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1833: beating level
internal fun PlayerActivity.showV1833BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1833beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1833beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1833: becoming level
internal fun PlayerActivity.showV1833BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1833becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1833becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1833: beginning level
internal fun PlayerActivity.showV1833BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1833beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1833beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1833: belonging level
internal fun PlayerActivity.showV1833BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1833belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1833belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1833: bending level
internal fun PlayerActivity.showV1833BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1833bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1833bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1833: binding mode
internal fun PlayerActivity.showV1833BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1833binding
    FeaturePrefsStore.batch1831.v1833binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1833: biting mode
internal fun PlayerActivity.showV1833BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1833biting
    FeaturePrefsStore.batch1831.v1833biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1833: blending mode
internal fun PlayerActivity.showV1833BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1833blending
    FeaturePrefsStore.batch1831.v1833blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1833: blessing mode
internal fun PlayerActivity.showV1833BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1833blessing
    FeaturePrefsStore.batch1831.v1833blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1833: blinding mode
internal fun PlayerActivity.showV1833BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1833blinding
    FeaturePrefsStore.batch1831.v1833blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1834: banned mode
internal fun PlayerActivity.showV1834BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1834banned
    FeaturePrefsStore.batch1831.v1834banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1834: barred mode
internal fun PlayerActivity.showV1834BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1834barred
    FeaturePrefsStore.batch1831.v1834barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1834: batched mode
internal fun PlayerActivity.showV1834BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1834batched
    FeaturePrefsStore.batch1831.v1834batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1834: beamed mode
internal fun PlayerActivity.showV1834BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1834beamed
    FeaturePrefsStore.batch1831.v1834beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1834: bearing mode
internal fun PlayerActivity.showV1834BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1834bearing
    FeaturePrefsStore.batch1831.v1834bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1834: beating level
internal fun PlayerActivity.showV1834BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1834beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1834beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1834: becoming level
internal fun PlayerActivity.showV1834BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1834becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1834becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1834: beginning level
internal fun PlayerActivity.showV1834BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1834beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1834beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1834: belonging level
internal fun PlayerActivity.showV1834BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1834belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1834belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1834: bending level
internal fun PlayerActivity.showV1834BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1834bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1834bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1834: binding mode
internal fun PlayerActivity.showV1834BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1834binding
    FeaturePrefsStore.batch1831.v1834binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1834: biting mode
internal fun PlayerActivity.showV1834BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1834biting
    FeaturePrefsStore.batch1831.v1834biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1834: blending mode
internal fun PlayerActivity.showV1834BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1834blending
    FeaturePrefsStore.batch1831.v1834blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1834: blessing mode
internal fun PlayerActivity.showV1834BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1834blessing
    FeaturePrefsStore.batch1831.v1834blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1834: blinding mode
internal fun PlayerActivity.showV1834BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1834blinding
    FeaturePrefsStore.batch1831.v1834blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1835: banned mode
internal fun PlayerActivity.showV1835BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1835banned
    FeaturePrefsStore.batch1831.v1835banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1835: barred mode
internal fun PlayerActivity.showV1835BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1835barred
    FeaturePrefsStore.batch1831.v1835barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1835: batched mode
internal fun PlayerActivity.showV1835BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1835batched
    FeaturePrefsStore.batch1831.v1835batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1835: beamed mode
internal fun PlayerActivity.showV1835BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1835beamed
    FeaturePrefsStore.batch1831.v1835beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1835: bearing mode
internal fun PlayerActivity.showV1835BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1835bearing
    FeaturePrefsStore.batch1831.v1835bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1835: beating level
internal fun PlayerActivity.showV1835BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1835beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1835beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1835: becoming level
internal fun PlayerActivity.showV1835BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1835becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1835becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1835: beginning level
internal fun PlayerActivity.showV1835BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1835beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1835beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1835: belonging level
internal fun PlayerActivity.showV1835BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1835belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1835belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1835: bending level
internal fun PlayerActivity.showV1835BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1835bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1835bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1835: binding mode
internal fun PlayerActivity.showV1835BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1835binding
    FeaturePrefsStore.batch1831.v1835binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1835: biting mode
internal fun PlayerActivity.showV1835BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1835biting
    FeaturePrefsStore.batch1831.v1835biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1835: blending mode
internal fun PlayerActivity.showV1835BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1835blending
    FeaturePrefsStore.batch1831.v1835blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1835: blessing mode
internal fun PlayerActivity.showV1835BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1835blessing
    FeaturePrefsStore.batch1831.v1835blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1835: blinding mode
internal fun PlayerActivity.showV1835BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1835blinding
    FeaturePrefsStore.batch1831.v1835blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1836: banned mode
internal fun PlayerActivity.showV1836BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1836banned
    FeaturePrefsStore.batch1831.v1836banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1836: barred mode
internal fun PlayerActivity.showV1836BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1836barred
    FeaturePrefsStore.batch1831.v1836barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1836: batched mode
internal fun PlayerActivity.showV1836BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1836batched
    FeaturePrefsStore.batch1831.v1836batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1836: beamed mode
internal fun PlayerActivity.showV1836BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1836beamed
    FeaturePrefsStore.batch1831.v1836beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1836: bearing mode
internal fun PlayerActivity.showV1836BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1836bearing
    FeaturePrefsStore.batch1831.v1836bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1836: beating level
internal fun PlayerActivity.showV1836BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1836beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1836beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1836: becoming level
internal fun PlayerActivity.showV1836BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1836becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1836becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1836: beginning level
internal fun PlayerActivity.showV1836BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1836beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1836beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1836: belonging level
internal fun PlayerActivity.showV1836BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1836belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1836belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1836: bending level
internal fun PlayerActivity.showV1836BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1836bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1836bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1836: binding mode
internal fun PlayerActivity.showV1836BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1836binding
    FeaturePrefsStore.batch1831.v1836binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1836: biting mode
internal fun PlayerActivity.showV1836BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1836biting
    FeaturePrefsStore.batch1831.v1836biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1836: blending mode
internal fun PlayerActivity.showV1836BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1836blending
    FeaturePrefsStore.batch1831.v1836blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1836: blessing mode
internal fun PlayerActivity.showV1836BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1836blessing
    FeaturePrefsStore.batch1831.v1836blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1836: blinding mode
internal fun PlayerActivity.showV1836BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1836blinding
    FeaturePrefsStore.batch1831.v1836blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1837: banned mode
internal fun PlayerActivity.showV1837BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1837banned
    FeaturePrefsStore.batch1831.v1837banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1837: barred mode
internal fun PlayerActivity.showV1837BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1837barred
    FeaturePrefsStore.batch1831.v1837barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1837: batched mode
internal fun PlayerActivity.showV1837BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1837batched
    FeaturePrefsStore.batch1831.v1837batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1837: beamed mode
internal fun PlayerActivity.showV1837BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1837beamed
    FeaturePrefsStore.batch1831.v1837beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1837: bearing mode
internal fun PlayerActivity.showV1837BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1837bearing
    FeaturePrefsStore.batch1831.v1837bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1837: beating level
internal fun PlayerActivity.showV1837BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1837beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1837beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1837: becoming level
internal fun PlayerActivity.showV1837BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1837becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1837becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1837: beginning level
internal fun PlayerActivity.showV1837BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1837beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1837beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1837: belonging level
internal fun PlayerActivity.showV1837BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1837belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1837belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1837: bending level
internal fun PlayerActivity.showV1837BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1837bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1837bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1837: binding mode
internal fun PlayerActivity.showV1837BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1837binding
    FeaturePrefsStore.batch1831.v1837binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1837: biting mode
internal fun PlayerActivity.showV1837BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1837biting
    FeaturePrefsStore.batch1831.v1837biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1837: blending mode
internal fun PlayerActivity.showV1837BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1837blending
    FeaturePrefsStore.batch1831.v1837blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1837: blessing mode
internal fun PlayerActivity.showV1837BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1837blessing
    FeaturePrefsStore.batch1831.v1837blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1837: blinding mode
internal fun PlayerActivity.showV1837BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1837blinding
    FeaturePrefsStore.batch1831.v1837blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1838: banned mode
internal fun PlayerActivity.showV1838BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1838banned
    FeaturePrefsStore.batch1831.v1838banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1838: barred mode
internal fun PlayerActivity.showV1838BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1838barred
    FeaturePrefsStore.batch1831.v1838barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1838: batched mode
internal fun PlayerActivity.showV1838BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1838batched
    FeaturePrefsStore.batch1831.v1838batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1838: beamed mode
internal fun PlayerActivity.showV1838BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1838beamed
    FeaturePrefsStore.batch1831.v1838beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1838: bearing mode
internal fun PlayerActivity.showV1838BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1838bearing
    FeaturePrefsStore.batch1831.v1838bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1838: beating level
internal fun PlayerActivity.showV1838BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1838beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1838beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1838: becoming level
internal fun PlayerActivity.showV1838BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1838becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1838becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1838: beginning level
internal fun PlayerActivity.showV1838BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1838beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1838beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1838: belonging level
internal fun PlayerActivity.showV1838BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1838belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1838belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1838: bending level
internal fun PlayerActivity.showV1838BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1838bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1838bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1838: binding mode
internal fun PlayerActivity.showV1838BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1838binding
    FeaturePrefsStore.batch1831.v1838binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1838: biting mode
internal fun PlayerActivity.showV1838BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1838biting
    FeaturePrefsStore.batch1831.v1838biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1838: blending mode
internal fun PlayerActivity.showV1838BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1838blending
    FeaturePrefsStore.batch1831.v1838blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1838: blessing mode
internal fun PlayerActivity.showV1838BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1838blessing
    FeaturePrefsStore.batch1831.v1838blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1838: blinding mode
internal fun PlayerActivity.showV1838BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1838blinding
    FeaturePrefsStore.batch1831.v1838blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1839: banned mode
internal fun PlayerActivity.showV1839BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1839banned
    FeaturePrefsStore.batch1831.v1839banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1839: barred mode
internal fun PlayerActivity.showV1839BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1839barred
    FeaturePrefsStore.batch1831.v1839barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1839: batched mode
internal fun PlayerActivity.showV1839BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1839batched
    FeaturePrefsStore.batch1831.v1839batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1839: beamed mode
internal fun PlayerActivity.showV1839BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1839beamed
    FeaturePrefsStore.batch1831.v1839beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1839: bearing mode
internal fun PlayerActivity.showV1839BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1839bearing
    FeaturePrefsStore.batch1831.v1839bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1839: beating level
internal fun PlayerActivity.showV1839BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1839beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1839beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1839: becoming level
internal fun PlayerActivity.showV1839BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1839becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1839becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1839: beginning level
internal fun PlayerActivity.showV1839BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1839beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1839beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1839: belonging level
internal fun PlayerActivity.showV1839BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1839belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1839belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1839: bending level
internal fun PlayerActivity.showV1839BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1839bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1839bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1839: binding mode
internal fun PlayerActivity.showV1839BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1839binding
    FeaturePrefsStore.batch1831.v1839binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1839: biting mode
internal fun PlayerActivity.showV1839BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1839biting
    FeaturePrefsStore.batch1831.v1839biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1839: blending mode
internal fun PlayerActivity.showV1839BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1839blending
    FeaturePrefsStore.batch1831.v1839blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1839: blessing mode
internal fun PlayerActivity.showV1839BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1839blessing
    FeaturePrefsStore.batch1831.v1839blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1839: blinding mode
internal fun PlayerActivity.showV1839BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1839blinding
    FeaturePrefsStore.batch1831.v1839blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1840: banned mode
internal fun PlayerActivity.showV1840BannedToggle() {
    val current = FeaturePrefsStore.batch1831.v1840banned
    FeaturePrefsStore.batch1831.v1840banned = !current
    AppToast.show(this, "banned: ${if (!current) "ON" else "OFF"}")
}

// v1840: barred mode
internal fun PlayerActivity.showV1840BarredToggle() {
    val current = FeaturePrefsStore.batch1831.v1840barred
    FeaturePrefsStore.batch1831.v1840barred = !current
    AppToast.show(this, "barred: ${if (!current) "ON" else "OFF"}")
}

// v1840: batched mode
internal fun PlayerActivity.showV1840BatchedToggle() {
    val current = FeaturePrefsStore.batch1831.v1840batched
    FeaturePrefsStore.batch1831.v1840batched = !current
    AppToast.show(this, "batched: ${if (!current) "ON" else "OFF"}")
}

// v1840: beamed mode
internal fun PlayerActivity.showV1840BeamedToggle() {
    val current = FeaturePrefsStore.batch1831.v1840beamed
    FeaturePrefsStore.batch1831.v1840beamed = !current
    AppToast.show(this, "beamed: ${if (!current) "ON" else "OFF"}")
}

// v1840: bearing mode
internal fun PlayerActivity.showV1840BearingToggle() {
    val current = FeaturePrefsStore.batch1831.v1840bearing
    FeaturePrefsStore.batch1831.v1840bearing = !current
    AppToast.show(this, "bearing: ${if (!current) "ON" else "OFF"}")
}

// v1840: beating level
internal fun PlayerActivity.showV1840BeatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1840beating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1840beating = value
        AppToast.show(this, "beating: $value")
    }
}

// v1840: becoming level
internal fun PlayerActivity.showV1840BecomingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1840becoming).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "becoming level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1840becoming = value
        AppToast.show(this, "becoming: $value")
    }
}

// v1840: beginning level
internal fun PlayerActivity.showV1840BeginningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1840beginning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "beginning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1840beginning = value
        AppToast.show(this, "beginning: $value")
    }
}

// v1840: belonging level
internal fun PlayerActivity.showV1840BelongingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1840belonging).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "belonging level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1840belonging = value
        AppToast.show(this, "belonging: $value")
    }
}

// v1840: bending level
internal fun PlayerActivity.showV1840BendingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1831.v1840bending).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bending level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1831.v1840bending = value
        AppToast.show(this, "bending: $value")
    }
}

// v1840: binding mode
internal fun PlayerActivity.showV1840BindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1840binding
    FeaturePrefsStore.batch1831.v1840binding = !current
    AppToast.show(this, "binding: ${if (!current) "ON" else "OFF"}")
}

// v1840: biting mode
internal fun PlayerActivity.showV1840BitingToggle() {
    val current = FeaturePrefsStore.batch1831.v1840biting
    FeaturePrefsStore.batch1831.v1840biting = !current
    AppToast.show(this, "biting: ${if (!current) "ON" else "OFF"}")
}

// v1840: blending mode
internal fun PlayerActivity.showV1840BlendingToggle() {
    val current = FeaturePrefsStore.batch1831.v1840blending
    FeaturePrefsStore.batch1831.v1840blending = !current
    AppToast.show(this, "blending: ${if (!current) "ON" else "OFF"}")
}

// v1840: blessing mode
internal fun PlayerActivity.showV1840BlessingToggle() {
    val current = FeaturePrefsStore.batch1831.v1840blessing
    FeaturePrefsStore.batch1831.v1840blessing = !current
    AppToast.show(this, "blessing: ${if (!current) "ON" else "OFF"}")
}

// v1840: blinding mode
internal fun PlayerActivity.showV1840BlindingToggle() {
    val current = FeaturePrefsStore.batch1831.v1840blinding
    FeaturePrefsStore.batch1831.v1840blinding = !current
    AppToast.show(this, "blinding: ${if (!current) "ON" else "OFF"}")
}

// v1841: blocking mode
internal fun PlayerActivity.showV1841BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841blocking
    FeaturePrefsStore.batch1841.v1841blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1841: blooming mode
internal fun PlayerActivity.showV1841BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841blooming
    FeaturePrefsStore.batch1841.v1841blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1841: boiling mode
internal fun PlayerActivity.showV1841BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841boiling
    FeaturePrefsStore.batch1841.v1841boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1841: bolster mode
internal fun PlayerActivity.showV1841BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1841bolster
    FeaturePrefsStore.batch1841.v1841bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1841: booking mode
internal fun PlayerActivity.showV1841BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841booking
    FeaturePrefsStore.batch1841.v1841booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1841: boosted level
internal fun PlayerActivity.showV1841BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1841boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1841boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1841: borrowed level
internal fun PlayerActivity.showV1841BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1841borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1841borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1841: bothered level
internal fun PlayerActivity.showV1841BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1841bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1841bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1841: bouncing level
internal fun PlayerActivity.showV1841BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1841bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1841bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1841: branching level
internal fun PlayerActivity.showV1841BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1841branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1841branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1841: breathing mode
internal fun PlayerActivity.showV1841BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841breathing
    FeaturePrefsStore.batch1841.v1841breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1841: bridging mode
internal fun PlayerActivity.showV1841BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841bridging
    FeaturePrefsStore.batch1841.v1841bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1841: brighten mode
internal fun PlayerActivity.showV1841BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1841brighten
    FeaturePrefsStore.batch1841.v1841brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1841: bringing mode
internal fun PlayerActivity.showV1841BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841bringing
    FeaturePrefsStore.batch1841.v1841bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1841: broadcasting mode
internal fun PlayerActivity.showV1841BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1841broadcasting
    FeaturePrefsStore.batch1841.v1841broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1842: blocking mode
internal fun PlayerActivity.showV1842BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842blocking
    FeaturePrefsStore.batch1841.v1842blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1842: blooming mode
internal fun PlayerActivity.showV1842BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842blooming
    FeaturePrefsStore.batch1841.v1842blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1842: boiling mode
internal fun PlayerActivity.showV1842BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842boiling
    FeaturePrefsStore.batch1841.v1842boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1842: bolster mode
internal fun PlayerActivity.showV1842BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1842bolster
    FeaturePrefsStore.batch1841.v1842bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1842: booking mode
internal fun PlayerActivity.showV1842BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842booking
    FeaturePrefsStore.batch1841.v1842booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1842: boosted level
internal fun PlayerActivity.showV1842BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1842boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1842boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1842: borrowed level
internal fun PlayerActivity.showV1842BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1842borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1842borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1842: bothered level
internal fun PlayerActivity.showV1842BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1842bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1842bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1842: bouncing level
internal fun PlayerActivity.showV1842BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1842bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1842bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1842: branching level
internal fun PlayerActivity.showV1842BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1842branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1842branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1842: breathing mode
internal fun PlayerActivity.showV1842BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842breathing
    FeaturePrefsStore.batch1841.v1842breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1842: bridging mode
internal fun PlayerActivity.showV1842BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842bridging
    FeaturePrefsStore.batch1841.v1842bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1842: brighten mode
internal fun PlayerActivity.showV1842BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1842brighten
    FeaturePrefsStore.batch1841.v1842brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1842: bringing mode
internal fun PlayerActivity.showV1842BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842bringing
    FeaturePrefsStore.batch1841.v1842bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1842: broadcasting mode
internal fun PlayerActivity.showV1842BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1842broadcasting
    FeaturePrefsStore.batch1841.v1842broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1843: blocking mode
internal fun PlayerActivity.showV1843BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843blocking
    FeaturePrefsStore.batch1841.v1843blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1843: blooming mode
internal fun PlayerActivity.showV1843BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843blooming
    FeaturePrefsStore.batch1841.v1843blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1843: boiling mode
internal fun PlayerActivity.showV1843BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843boiling
    FeaturePrefsStore.batch1841.v1843boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1843: bolster mode
internal fun PlayerActivity.showV1843BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1843bolster
    FeaturePrefsStore.batch1841.v1843bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1843: booking mode
internal fun PlayerActivity.showV1843BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843booking
    FeaturePrefsStore.batch1841.v1843booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1843: boosted level
internal fun PlayerActivity.showV1843BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1843boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1843boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1843: borrowed level
internal fun PlayerActivity.showV1843BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1843borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1843borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1843: bothered level
internal fun PlayerActivity.showV1843BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1843bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1843bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1843: bouncing level
internal fun PlayerActivity.showV1843BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1843bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1843bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1843: branching level
internal fun PlayerActivity.showV1843BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1843branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1843branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1843: breathing mode
internal fun PlayerActivity.showV1843BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843breathing
    FeaturePrefsStore.batch1841.v1843breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1843: bridging mode
internal fun PlayerActivity.showV1843BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843bridging
    FeaturePrefsStore.batch1841.v1843bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1843: brighten mode
internal fun PlayerActivity.showV1843BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1843brighten
    FeaturePrefsStore.batch1841.v1843brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1843: bringing mode
internal fun PlayerActivity.showV1843BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843bringing
    FeaturePrefsStore.batch1841.v1843bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1843: broadcasting mode
internal fun PlayerActivity.showV1843BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1843broadcasting
    FeaturePrefsStore.batch1841.v1843broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1844: blocking mode
internal fun PlayerActivity.showV1844BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844blocking
    FeaturePrefsStore.batch1841.v1844blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1844: blooming mode
internal fun PlayerActivity.showV1844BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844blooming
    FeaturePrefsStore.batch1841.v1844blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1844: boiling mode
internal fun PlayerActivity.showV1844BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844boiling
    FeaturePrefsStore.batch1841.v1844boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1844: bolster mode
internal fun PlayerActivity.showV1844BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1844bolster
    FeaturePrefsStore.batch1841.v1844bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1844: booking mode
internal fun PlayerActivity.showV1844BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844booking
    FeaturePrefsStore.batch1841.v1844booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1844: boosted level
internal fun PlayerActivity.showV1844BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1844boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1844boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1844: borrowed level
internal fun PlayerActivity.showV1844BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1844borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1844borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1844: bothered level
internal fun PlayerActivity.showV1844BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1844bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1844bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1844: bouncing level
internal fun PlayerActivity.showV1844BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1844bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1844bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1844: branching level
internal fun PlayerActivity.showV1844BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1844branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1844branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1844: breathing mode
internal fun PlayerActivity.showV1844BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844breathing
    FeaturePrefsStore.batch1841.v1844breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1844: bridging mode
internal fun PlayerActivity.showV1844BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844bridging
    FeaturePrefsStore.batch1841.v1844bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1844: brighten mode
internal fun PlayerActivity.showV1844BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1844brighten
    FeaturePrefsStore.batch1841.v1844brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1844: bringing mode
internal fun PlayerActivity.showV1844BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844bringing
    FeaturePrefsStore.batch1841.v1844bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1844: broadcasting mode
internal fun PlayerActivity.showV1844BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1844broadcasting
    FeaturePrefsStore.batch1841.v1844broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1845: blocking mode
internal fun PlayerActivity.showV1845BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845blocking
    FeaturePrefsStore.batch1841.v1845blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1845: blooming mode
internal fun PlayerActivity.showV1845BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845blooming
    FeaturePrefsStore.batch1841.v1845blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1845: boiling mode
internal fun PlayerActivity.showV1845BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845boiling
    FeaturePrefsStore.batch1841.v1845boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1845: bolster mode
internal fun PlayerActivity.showV1845BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1845bolster
    FeaturePrefsStore.batch1841.v1845bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1845: booking mode
internal fun PlayerActivity.showV1845BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845booking
    FeaturePrefsStore.batch1841.v1845booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1845: boosted level
internal fun PlayerActivity.showV1845BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1845boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1845boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1845: borrowed level
internal fun PlayerActivity.showV1845BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1845borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1845borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1845: bothered level
internal fun PlayerActivity.showV1845BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1845bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1845bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1845: bouncing level
internal fun PlayerActivity.showV1845BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1845bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1845bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1845: branching level
internal fun PlayerActivity.showV1845BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1845branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1845branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1845: breathing mode
internal fun PlayerActivity.showV1845BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845breathing
    FeaturePrefsStore.batch1841.v1845breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1845: bridging mode
internal fun PlayerActivity.showV1845BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845bridging
    FeaturePrefsStore.batch1841.v1845bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1845: brighten mode
internal fun PlayerActivity.showV1845BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1845brighten
    FeaturePrefsStore.batch1841.v1845brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1845: bringing mode
internal fun PlayerActivity.showV1845BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845bringing
    FeaturePrefsStore.batch1841.v1845bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1845: broadcasting mode
internal fun PlayerActivity.showV1845BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1845broadcasting
    FeaturePrefsStore.batch1841.v1845broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1846: blocking mode
internal fun PlayerActivity.showV1846BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846blocking
    FeaturePrefsStore.batch1841.v1846blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1846: blooming mode
internal fun PlayerActivity.showV1846BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846blooming
    FeaturePrefsStore.batch1841.v1846blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1846: boiling mode
internal fun PlayerActivity.showV1846BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846boiling
    FeaturePrefsStore.batch1841.v1846boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1846: bolster mode
internal fun PlayerActivity.showV1846BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1846bolster
    FeaturePrefsStore.batch1841.v1846bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1846: booking mode
internal fun PlayerActivity.showV1846BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846booking
    FeaturePrefsStore.batch1841.v1846booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1846: boosted level
internal fun PlayerActivity.showV1846BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1846boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1846boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1846: borrowed level
internal fun PlayerActivity.showV1846BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1846borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1846borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1846: bothered level
internal fun PlayerActivity.showV1846BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1846bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1846bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1846: bouncing level
internal fun PlayerActivity.showV1846BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1846bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1846bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1846: branching level
internal fun PlayerActivity.showV1846BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1846branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1846branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1846: breathing mode
internal fun PlayerActivity.showV1846BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846breathing
    FeaturePrefsStore.batch1841.v1846breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1846: bridging mode
internal fun PlayerActivity.showV1846BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846bridging
    FeaturePrefsStore.batch1841.v1846bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1846: brighten mode
internal fun PlayerActivity.showV1846BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1846brighten
    FeaturePrefsStore.batch1841.v1846brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1846: bringing mode
internal fun PlayerActivity.showV1846BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846bringing
    FeaturePrefsStore.batch1841.v1846bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1846: broadcasting mode
internal fun PlayerActivity.showV1846BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1846broadcasting
    FeaturePrefsStore.batch1841.v1846broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1847: blocking mode
internal fun PlayerActivity.showV1847BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847blocking
    FeaturePrefsStore.batch1841.v1847blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1847: blooming mode
internal fun PlayerActivity.showV1847BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847blooming
    FeaturePrefsStore.batch1841.v1847blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1847: boiling mode
internal fun PlayerActivity.showV1847BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847boiling
    FeaturePrefsStore.batch1841.v1847boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1847: bolster mode
internal fun PlayerActivity.showV1847BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1847bolster
    FeaturePrefsStore.batch1841.v1847bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1847: booking mode
internal fun PlayerActivity.showV1847BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847booking
    FeaturePrefsStore.batch1841.v1847booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1847: boosted level
internal fun PlayerActivity.showV1847BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1847boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1847boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1847: borrowed level
internal fun PlayerActivity.showV1847BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1847borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1847borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1847: bothered level
internal fun PlayerActivity.showV1847BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1847bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1847bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1847: bouncing level
internal fun PlayerActivity.showV1847BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1847bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1847bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1847: branching level
internal fun PlayerActivity.showV1847BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1847branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1847branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1847: breathing mode
internal fun PlayerActivity.showV1847BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847breathing
    FeaturePrefsStore.batch1841.v1847breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1847: bridging mode
internal fun PlayerActivity.showV1847BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847bridging
    FeaturePrefsStore.batch1841.v1847bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1847: brighten mode
internal fun PlayerActivity.showV1847BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1847brighten
    FeaturePrefsStore.batch1841.v1847brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1847: bringing mode
internal fun PlayerActivity.showV1847BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847bringing
    FeaturePrefsStore.batch1841.v1847bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1847: broadcasting mode
internal fun PlayerActivity.showV1847BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1847broadcasting
    FeaturePrefsStore.batch1841.v1847broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1848: blocking mode
internal fun PlayerActivity.showV1848BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848blocking
    FeaturePrefsStore.batch1841.v1848blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1848: blooming mode
internal fun PlayerActivity.showV1848BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848blooming
    FeaturePrefsStore.batch1841.v1848blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1848: boiling mode
internal fun PlayerActivity.showV1848BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848boiling
    FeaturePrefsStore.batch1841.v1848boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1848: bolster mode
internal fun PlayerActivity.showV1848BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1848bolster
    FeaturePrefsStore.batch1841.v1848bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1848: booking mode
internal fun PlayerActivity.showV1848BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848booking
    FeaturePrefsStore.batch1841.v1848booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1848: boosted level
internal fun PlayerActivity.showV1848BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1848boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1848boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1848: borrowed level
internal fun PlayerActivity.showV1848BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1848borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1848borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1848: bothered level
internal fun PlayerActivity.showV1848BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1848bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1848bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1848: bouncing level
internal fun PlayerActivity.showV1848BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1848bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1848bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1848: branching level
internal fun PlayerActivity.showV1848BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1848branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1848branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1848: breathing mode
internal fun PlayerActivity.showV1848BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848breathing
    FeaturePrefsStore.batch1841.v1848breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1848: bridging mode
internal fun PlayerActivity.showV1848BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848bridging
    FeaturePrefsStore.batch1841.v1848bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1848: brighten mode
internal fun PlayerActivity.showV1848BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1848brighten
    FeaturePrefsStore.batch1841.v1848brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1848: bringing mode
internal fun PlayerActivity.showV1848BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848bringing
    FeaturePrefsStore.batch1841.v1848bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1848: broadcasting mode
internal fun PlayerActivity.showV1848BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1848broadcasting
    FeaturePrefsStore.batch1841.v1848broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1849: blocking mode
internal fun PlayerActivity.showV1849BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849blocking
    FeaturePrefsStore.batch1841.v1849blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1849: blooming mode
internal fun PlayerActivity.showV1849BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849blooming
    FeaturePrefsStore.batch1841.v1849blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1849: boiling mode
internal fun PlayerActivity.showV1849BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849boiling
    FeaturePrefsStore.batch1841.v1849boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1849: bolster mode
internal fun PlayerActivity.showV1849BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1849bolster
    FeaturePrefsStore.batch1841.v1849bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1849: booking mode
internal fun PlayerActivity.showV1849BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849booking
    FeaturePrefsStore.batch1841.v1849booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1849: boosted level
internal fun PlayerActivity.showV1849BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1849boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1849boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1849: borrowed level
internal fun PlayerActivity.showV1849BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1849borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1849borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1849: bothered level
internal fun PlayerActivity.showV1849BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1849bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1849bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1849: bouncing level
internal fun PlayerActivity.showV1849BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1849bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1849bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1849: branching level
internal fun PlayerActivity.showV1849BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1849branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1849branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1849: breathing mode
internal fun PlayerActivity.showV1849BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849breathing
    FeaturePrefsStore.batch1841.v1849breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1849: bridging mode
internal fun PlayerActivity.showV1849BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849bridging
    FeaturePrefsStore.batch1841.v1849bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1849: brighten mode
internal fun PlayerActivity.showV1849BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1849brighten
    FeaturePrefsStore.batch1841.v1849brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1849: bringing mode
internal fun PlayerActivity.showV1849BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849bringing
    FeaturePrefsStore.batch1841.v1849bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1849: broadcasting mode
internal fun PlayerActivity.showV1849BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1849broadcasting
    FeaturePrefsStore.batch1841.v1849broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1850: blocking mode
internal fun PlayerActivity.showV1850BlockingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850blocking
    FeaturePrefsStore.batch1841.v1850blocking = !current
    AppToast.show(this, "blocking: ${if (!current) "ON" else "OFF"}")
}

// v1850: blooming mode
internal fun PlayerActivity.showV1850BloomingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850blooming
    FeaturePrefsStore.batch1841.v1850blooming = !current
    AppToast.show(this, "blooming: ${if (!current) "ON" else "OFF"}")
}

// v1850: boiling mode
internal fun PlayerActivity.showV1850BoilingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850boiling
    FeaturePrefsStore.batch1841.v1850boiling = !current
    AppToast.show(this, "boiling: ${if (!current) "ON" else "OFF"}")
}

// v1850: bolster mode
internal fun PlayerActivity.showV1850BolsterToggle() {
    val current = FeaturePrefsStore.batch1841.v1850bolster
    FeaturePrefsStore.batch1841.v1850bolster = !current
    AppToast.show(this, "bolster: ${if (!current) "ON" else "OFF"}")
}

// v1850: booking mode
internal fun PlayerActivity.showV1850BookingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850booking
    FeaturePrefsStore.batch1841.v1850booking = !current
    AppToast.show(this, "booking: ${if (!current) "ON" else "OFF"}")
}

// v1850: boosted level
internal fun PlayerActivity.showV1850BoostedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1850boosted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boosted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1850boosted = value
        AppToast.show(this, "boosted: $value")
    }
}

// v1850: borrowed level
internal fun PlayerActivity.showV1850BorrowedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1850borrowed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "borrowed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1850borrowed = value
        AppToast.show(this, "borrowed: $value")
    }
}

// v1850: bothered level
internal fun PlayerActivity.showV1850BotheredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1850bothered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bothered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1850bothered = value
        AppToast.show(this, "bothered: $value")
    }
}

// v1850: bouncing level
internal fun PlayerActivity.showV1850BouncingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1850bouncing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bouncing level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1850bouncing = value
        AppToast.show(this, "bouncing: $value")
    }
}

// v1850: branching level
internal fun PlayerActivity.showV1850BranchingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1841.v1850branching).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "branching level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1841.v1850branching = value
        AppToast.show(this, "branching: $value")
    }
}

// v1850: breathing mode
internal fun PlayerActivity.showV1850BreathingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850breathing
    FeaturePrefsStore.batch1841.v1850breathing = !current
    AppToast.show(this, "breathing: ${if (!current) "ON" else "OFF"}")
}

// v1850: bridging mode
internal fun PlayerActivity.showV1850BridgingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850bridging
    FeaturePrefsStore.batch1841.v1850bridging = !current
    AppToast.show(this, "bridging: ${if (!current) "ON" else "OFF"}")
}

// v1850: brighten mode
internal fun PlayerActivity.showV1850BrightenToggle() {
    val current = FeaturePrefsStore.batch1841.v1850brighten
    FeaturePrefsStore.batch1841.v1850brighten = !current
    AppToast.show(this, "brighten: ${if (!current) "ON" else "OFF"}")
}

// v1850: bringing mode
internal fun PlayerActivity.showV1850BringingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850bringing
    FeaturePrefsStore.batch1841.v1850bringing = !current
    AppToast.show(this, "bringing: ${if (!current) "ON" else "OFF"}")
}

// v1850: broadcasting mode
internal fun PlayerActivity.showV1850BroadcastingToggle() {
    val current = FeaturePrefsStore.batch1841.v1850broadcasting
    FeaturePrefsStore.batch1841.v1850broadcasting = !current
    AppToast.show(this, "broadcasting: ${if (!current) "ON" else "OFF"}")
}

// v1851: broadening mode
internal fun PlayerActivity.showV1851BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1851broadening
    FeaturePrefsStore.batch1851.v1851broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1851: brushing mode
internal fun PlayerActivity.showV1851BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1851brushing
    FeaturePrefsStore.batch1851.v1851brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1851: bubbling mode
internal fun PlayerActivity.showV1851BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1851bubbling
    FeaturePrefsStore.batch1851.v1851bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1851: budgeted mode
internal fun PlayerActivity.showV1851BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1851budgeted
    FeaturePrefsStore.batch1851.v1851budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1851: buffered mode
internal fun PlayerActivity.showV1851BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1851buffered
    FeaturePrefsStore.batch1851.v1851buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1851: building level
internal fun PlayerActivity.showV1851BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1851building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1851building = value
        AppToast.show(this, "building: $value")
    }
}

// v1851: bundled level
internal fun PlayerActivity.showV1851BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1851bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1851bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1851: burning level
internal fun PlayerActivity.showV1851BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1851burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1851burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1851: bursting level
internal fun PlayerActivity.showV1851BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1851bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1851bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1851: calculating level
internal fun PlayerActivity.showV1851CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1851calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1851calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1851: calibrated mode
internal fun PlayerActivity.showV1851CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1851calibrated
    FeaturePrefsStore.batch1851.v1851calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1851: calling mode
internal fun PlayerActivity.showV1851CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1851calling
    FeaturePrefsStore.batch1851.v1851calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1851: camping mode
internal fun PlayerActivity.showV1851CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1851camping
    FeaturePrefsStore.batch1851.v1851camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1851: canceled mode
internal fun PlayerActivity.showV1851CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1851canceled
    FeaturePrefsStore.batch1851.v1851canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1851: captured mode
internal fun PlayerActivity.showV1851CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1851captured
    FeaturePrefsStore.batch1851.v1851captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1852: broadening mode
internal fun PlayerActivity.showV1852BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1852broadening
    FeaturePrefsStore.batch1851.v1852broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1852: brushing mode
internal fun PlayerActivity.showV1852BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1852brushing
    FeaturePrefsStore.batch1851.v1852brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1852: bubbling mode
internal fun PlayerActivity.showV1852BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1852bubbling
    FeaturePrefsStore.batch1851.v1852bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1852: budgeted mode
internal fun PlayerActivity.showV1852BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1852budgeted
    FeaturePrefsStore.batch1851.v1852budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1852: buffered mode
internal fun PlayerActivity.showV1852BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1852buffered
    FeaturePrefsStore.batch1851.v1852buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1852: building level
internal fun PlayerActivity.showV1852BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1852building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1852building = value
        AppToast.show(this, "building: $value")
    }
}

// v1852: bundled level
internal fun PlayerActivity.showV1852BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1852bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1852bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1852: burning level
internal fun PlayerActivity.showV1852BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1852burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1852burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1852: bursting level
internal fun PlayerActivity.showV1852BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1852bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1852bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1852: calculating level
internal fun PlayerActivity.showV1852CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1852calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1852calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1852: calibrated mode
internal fun PlayerActivity.showV1852CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1852calibrated
    FeaturePrefsStore.batch1851.v1852calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1852: calling mode
internal fun PlayerActivity.showV1852CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1852calling
    FeaturePrefsStore.batch1851.v1852calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1852: camping mode
internal fun PlayerActivity.showV1852CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1852camping
    FeaturePrefsStore.batch1851.v1852camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1852: canceled mode
internal fun PlayerActivity.showV1852CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1852canceled
    FeaturePrefsStore.batch1851.v1852canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1852: captured mode
internal fun PlayerActivity.showV1852CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1852captured
    FeaturePrefsStore.batch1851.v1852captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1853: broadening mode
internal fun PlayerActivity.showV1853BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1853broadening
    FeaturePrefsStore.batch1851.v1853broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1853: brushing mode
internal fun PlayerActivity.showV1853BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1853brushing
    FeaturePrefsStore.batch1851.v1853brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1853: bubbling mode
internal fun PlayerActivity.showV1853BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1853bubbling
    FeaturePrefsStore.batch1851.v1853bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1853: budgeted mode
internal fun PlayerActivity.showV1853BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1853budgeted
    FeaturePrefsStore.batch1851.v1853budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1853: buffered mode
internal fun PlayerActivity.showV1853BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1853buffered
    FeaturePrefsStore.batch1851.v1853buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1853: building level
internal fun PlayerActivity.showV1853BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1853building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1853building = value
        AppToast.show(this, "building: $value")
    }
}

// v1853: bundled level
internal fun PlayerActivity.showV1853BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1853bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1853bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1853: burning level
internal fun PlayerActivity.showV1853BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1853burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1853burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1853: bursting level
internal fun PlayerActivity.showV1853BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1853bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1853bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1853: calculating level
internal fun PlayerActivity.showV1853CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1853calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1853calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1853: calibrated mode
internal fun PlayerActivity.showV1853CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1853calibrated
    FeaturePrefsStore.batch1851.v1853calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1853: calling mode
internal fun PlayerActivity.showV1853CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1853calling
    FeaturePrefsStore.batch1851.v1853calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1853: camping mode
internal fun PlayerActivity.showV1853CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1853camping
    FeaturePrefsStore.batch1851.v1853camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1853: canceled mode
internal fun PlayerActivity.showV1853CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1853canceled
    FeaturePrefsStore.batch1851.v1853canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1853: captured mode
internal fun PlayerActivity.showV1853CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1853captured
    FeaturePrefsStore.batch1851.v1853captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1854: broadening mode
internal fun PlayerActivity.showV1854BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1854broadening
    FeaturePrefsStore.batch1851.v1854broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1854: brushing mode
internal fun PlayerActivity.showV1854BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1854brushing
    FeaturePrefsStore.batch1851.v1854brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1854: bubbling mode
internal fun PlayerActivity.showV1854BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1854bubbling
    FeaturePrefsStore.batch1851.v1854bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1854: budgeted mode
internal fun PlayerActivity.showV1854BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1854budgeted
    FeaturePrefsStore.batch1851.v1854budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1854: buffered mode
internal fun PlayerActivity.showV1854BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1854buffered
    FeaturePrefsStore.batch1851.v1854buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1854: building level
internal fun PlayerActivity.showV1854BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1854building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1854building = value
        AppToast.show(this, "building: $value")
    }
}

// v1854: bundled level
internal fun PlayerActivity.showV1854BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1854bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1854bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1854: burning level
internal fun PlayerActivity.showV1854BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1854burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1854burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1854: bursting level
internal fun PlayerActivity.showV1854BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1854bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1854bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1854: calculating level
internal fun PlayerActivity.showV1854CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1854calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1854calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1854: calibrated mode
internal fun PlayerActivity.showV1854CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1854calibrated
    FeaturePrefsStore.batch1851.v1854calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1854: calling mode
internal fun PlayerActivity.showV1854CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1854calling
    FeaturePrefsStore.batch1851.v1854calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1854: camping mode
internal fun PlayerActivity.showV1854CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1854camping
    FeaturePrefsStore.batch1851.v1854camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1854: canceled mode
internal fun PlayerActivity.showV1854CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1854canceled
    FeaturePrefsStore.batch1851.v1854canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1854: captured mode
internal fun PlayerActivity.showV1854CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1854captured
    FeaturePrefsStore.batch1851.v1854captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1855: broadening mode
internal fun PlayerActivity.showV1855BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1855broadening
    FeaturePrefsStore.batch1851.v1855broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1855: brushing mode
internal fun PlayerActivity.showV1855BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1855brushing
    FeaturePrefsStore.batch1851.v1855brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1855: bubbling mode
internal fun PlayerActivity.showV1855BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1855bubbling
    FeaturePrefsStore.batch1851.v1855bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1855: budgeted mode
internal fun PlayerActivity.showV1855BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1855budgeted
    FeaturePrefsStore.batch1851.v1855budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1855: buffered mode
internal fun PlayerActivity.showV1855BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1855buffered
    FeaturePrefsStore.batch1851.v1855buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1855: building level
internal fun PlayerActivity.showV1855BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1855building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1855building = value
        AppToast.show(this, "building: $value")
    }
}

// v1855: bundled level
internal fun PlayerActivity.showV1855BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1855bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1855bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1855: burning level
internal fun PlayerActivity.showV1855BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1855burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1855burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1855: bursting level
internal fun PlayerActivity.showV1855BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1855bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1855bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1855: calculating level
internal fun PlayerActivity.showV1855CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1855calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1855calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1855: calibrated mode
internal fun PlayerActivity.showV1855CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1855calibrated
    FeaturePrefsStore.batch1851.v1855calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1855: calling mode
internal fun PlayerActivity.showV1855CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1855calling
    FeaturePrefsStore.batch1851.v1855calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1855: camping mode
internal fun PlayerActivity.showV1855CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1855camping
    FeaturePrefsStore.batch1851.v1855camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1855: canceled mode
internal fun PlayerActivity.showV1855CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1855canceled
    FeaturePrefsStore.batch1851.v1855canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1855: captured mode
internal fun PlayerActivity.showV1855CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1855captured
    FeaturePrefsStore.batch1851.v1855captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1856: broadening mode
internal fun PlayerActivity.showV1856BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1856broadening
    FeaturePrefsStore.batch1851.v1856broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1856: brushing mode
internal fun PlayerActivity.showV1856BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1856brushing
    FeaturePrefsStore.batch1851.v1856brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1856: bubbling mode
internal fun PlayerActivity.showV1856BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1856bubbling
    FeaturePrefsStore.batch1851.v1856bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1856: budgeted mode
internal fun PlayerActivity.showV1856BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1856budgeted
    FeaturePrefsStore.batch1851.v1856budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1856: buffered mode
internal fun PlayerActivity.showV1856BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1856buffered
    FeaturePrefsStore.batch1851.v1856buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1856: building level
internal fun PlayerActivity.showV1856BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1856building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1856building = value
        AppToast.show(this, "building: $value")
    }
}

// v1856: bundled level
internal fun PlayerActivity.showV1856BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1856bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1856bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1856: burning level
internal fun PlayerActivity.showV1856BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1856burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1856burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1856: bursting level
internal fun PlayerActivity.showV1856BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1856bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1856bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1856: calculating level
internal fun PlayerActivity.showV1856CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1856calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1856calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1856: calibrated mode
internal fun PlayerActivity.showV1856CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1856calibrated
    FeaturePrefsStore.batch1851.v1856calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1856: calling mode
internal fun PlayerActivity.showV1856CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1856calling
    FeaturePrefsStore.batch1851.v1856calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1856: camping mode
internal fun PlayerActivity.showV1856CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1856camping
    FeaturePrefsStore.batch1851.v1856camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1856: canceled mode
internal fun PlayerActivity.showV1856CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1856canceled
    FeaturePrefsStore.batch1851.v1856canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1856: captured mode
internal fun PlayerActivity.showV1856CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1856captured
    FeaturePrefsStore.batch1851.v1856captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1857: broadening mode
internal fun PlayerActivity.showV1857BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1857broadening
    FeaturePrefsStore.batch1851.v1857broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1857: brushing mode
internal fun PlayerActivity.showV1857BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1857brushing
    FeaturePrefsStore.batch1851.v1857brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1857: bubbling mode
internal fun PlayerActivity.showV1857BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1857bubbling
    FeaturePrefsStore.batch1851.v1857bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1857: budgeted mode
internal fun PlayerActivity.showV1857BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1857budgeted
    FeaturePrefsStore.batch1851.v1857budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1857: buffered mode
internal fun PlayerActivity.showV1857BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1857buffered
    FeaturePrefsStore.batch1851.v1857buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1857: building level
internal fun PlayerActivity.showV1857BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1857building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1857building = value
        AppToast.show(this, "building: $value")
    }
}

// v1857: bundled level
internal fun PlayerActivity.showV1857BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1857bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1857bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1857: burning level
internal fun PlayerActivity.showV1857BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1857burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1857burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1857: bursting level
internal fun PlayerActivity.showV1857BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1857bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1857bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1857: calculating level
internal fun PlayerActivity.showV1857CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1857calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1857calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1857: calibrated mode
internal fun PlayerActivity.showV1857CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1857calibrated
    FeaturePrefsStore.batch1851.v1857calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1857: calling mode
internal fun PlayerActivity.showV1857CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1857calling
    FeaturePrefsStore.batch1851.v1857calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1857: camping mode
internal fun PlayerActivity.showV1857CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1857camping
    FeaturePrefsStore.batch1851.v1857camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1857: canceled mode
internal fun PlayerActivity.showV1857CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1857canceled
    FeaturePrefsStore.batch1851.v1857canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1857: captured mode
internal fun PlayerActivity.showV1857CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1857captured
    FeaturePrefsStore.batch1851.v1857captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1858: broadening mode
internal fun PlayerActivity.showV1858BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1858broadening
    FeaturePrefsStore.batch1851.v1858broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1858: brushing mode
internal fun PlayerActivity.showV1858BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1858brushing
    FeaturePrefsStore.batch1851.v1858brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1858: bubbling mode
internal fun PlayerActivity.showV1858BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1858bubbling
    FeaturePrefsStore.batch1851.v1858bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1858: budgeted mode
internal fun PlayerActivity.showV1858BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1858budgeted
    FeaturePrefsStore.batch1851.v1858budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1858: buffered mode
internal fun PlayerActivity.showV1858BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1858buffered
    FeaturePrefsStore.batch1851.v1858buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1858: building level
internal fun PlayerActivity.showV1858BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1858building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1858building = value
        AppToast.show(this, "building: $value")
    }
}

// v1858: bundled level
internal fun PlayerActivity.showV1858BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1858bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1858bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1858: burning level
internal fun PlayerActivity.showV1858BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1858burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1858burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1858: bursting level
internal fun PlayerActivity.showV1858BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1858bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1858bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1858: calculating level
internal fun PlayerActivity.showV1858CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1858calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1858calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1858: calibrated mode
internal fun PlayerActivity.showV1858CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1858calibrated
    FeaturePrefsStore.batch1851.v1858calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1858: calling mode
internal fun PlayerActivity.showV1858CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1858calling
    FeaturePrefsStore.batch1851.v1858calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1858: camping mode
internal fun PlayerActivity.showV1858CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1858camping
    FeaturePrefsStore.batch1851.v1858camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1858: canceled mode
internal fun PlayerActivity.showV1858CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1858canceled
    FeaturePrefsStore.batch1851.v1858canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1858: captured mode
internal fun PlayerActivity.showV1858CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1858captured
    FeaturePrefsStore.batch1851.v1858captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1859: broadening mode
internal fun PlayerActivity.showV1859BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1859broadening
    FeaturePrefsStore.batch1851.v1859broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1859: brushing mode
internal fun PlayerActivity.showV1859BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1859brushing
    FeaturePrefsStore.batch1851.v1859brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1859: bubbling mode
internal fun PlayerActivity.showV1859BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1859bubbling
    FeaturePrefsStore.batch1851.v1859bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1859: budgeted mode
internal fun PlayerActivity.showV1859BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1859budgeted
    FeaturePrefsStore.batch1851.v1859budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1859: buffered mode
internal fun PlayerActivity.showV1859BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1859buffered
    FeaturePrefsStore.batch1851.v1859buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1859: building level
internal fun PlayerActivity.showV1859BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1859building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1859building = value
        AppToast.show(this, "building: $value")
    }
}

// v1859: bundled level
internal fun PlayerActivity.showV1859BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1859bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1859bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1859: burning level
internal fun PlayerActivity.showV1859BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1859burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1859burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1859: bursting level
internal fun PlayerActivity.showV1859BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1859bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1859bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1859: calculating level
internal fun PlayerActivity.showV1859CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1859calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1859calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1859: calibrated mode
internal fun PlayerActivity.showV1859CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1859calibrated
    FeaturePrefsStore.batch1851.v1859calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1859: calling mode
internal fun PlayerActivity.showV1859CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1859calling
    FeaturePrefsStore.batch1851.v1859calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1859: camping mode
internal fun PlayerActivity.showV1859CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1859camping
    FeaturePrefsStore.batch1851.v1859camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1859: canceled mode
internal fun PlayerActivity.showV1859CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1859canceled
    FeaturePrefsStore.batch1851.v1859canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1859: captured mode
internal fun PlayerActivity.showV1859CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1859captured
    FeaturePrefsStore.batch1851.v1859captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}

// v1860: broadening mode
internal fun PlayerActivity.showV1860BroadeningToggle() {
    val current = FeaturePrefsStore.batch1851.v1860broadening
    FeaturePrefsStore.batch1851.v1860broadening = !current
    AppToast.show(this, "broadening: ${if (!current) "ON" else "OFF"}")
}

// v1860: brushing mode
internal fun PlayerActivity.showV1860BrushingToggle() {
    val current = FeaturePrefsStore.batch1851.v1860brushing
    FeaturePrefsStore.batch1851.v1860brushing = !current
    AppToast.show(this, "brushing: ${if (!current) "ON" else "OFF"}")
}

// v1860: bubbling mode
internal fun PlayerActivity.showV1860BubblingToggle() {
    val current = FeaturePrefsStore.batch1851.v1860bubbling
    FeaturePrefsStore.batch1851.v1860bubbling = !current
    AppToast.show(this, "bubbling: ${if (!current) "ON" else "OFF"}")
}

// v1860: budgeted mode
internal fun PlayerActivity.showV1860BudgetedToggle() {
    val current = FeaturePrefsStore.batch1851.v1860budgeted
    FeaturePrefsStore.batch1851.v1860budgeted = !current
    AppToast.show(this, "budgeted: ${if (!current) "ON" else "OFF"}")
}

// v1860: buffered mode
internal fun PlayerActivity.showV1860BufferedToggle() {
    val current = FeaturePrefsStore.batch1851.v1860buffered
    FeaturePrefsStore.batch1851.v1860buffered = !current
    AppToast.show(this, "buffered: ${if (!current) "ON" else "OFF"}")
}

// v1860: building level
internal fun PlayerActivity.showV1860BuildingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1860building).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "building level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1860building = value
        AppToast.show(this, "building: $value")
    }
}

// v1860: bundled level
internal fun PlayerActivity.showV1860BundledDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1860bundled).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bundled level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1860bundled = value
        AppToast.show(this, "bundled: $value")
    }
}

// v1860: burning level
internal fun PlayerActivity.showV1860BurningDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1860burning).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "burning level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1860burning = value
        AppToast.show(this, "burning: $value")
    }
}

// v1860: bursting level
internal fun PlayerActivity.showV1860BurstingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1860bursting).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bursting level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1860bursting = value
        AppToast.show(this, "bursting: $value")
    }
}

// v1860: calculating level
internal fun PlayerActivity.showV1860CalculatingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1851.v1860calculating).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "calculating level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1851.v1860calculating = value
        AppToast.show(this, "calculating: $value")
    }
}

// v1860: calibrated mode
internal fun PlayerActivity.showV1860CalibratedToggle() {
    val current = FeaturePrefsStore.batch1851.v1860calibrated
    FeaturePrefsStore.batch1851.v1860calibrated = !current
    AppToast.show(this, "calibrated: ${if (!current) "ON" else "OFF"}")
}

// v1860: calling mode
internal fun PlayerActivity.showV1860CallingToggle() {
    val current = FeaturePrefsStore.batch1851.v1860calling
    FeaturePrefsStore.batch1851.v1860calling = !current
    AppToast.show(this, "calling: ${if (!current) "ON" else "OFF"}")
}

// v1860: camping mode
internal fun PlayerActivity.showV1860CampingToggle() {
    val current = FeaturePrefsStore.batch1851.v1860camping
    FeaturePrefsStore.batch1851.v1860camping = !current
    AppToast.show(this, "camping: ${if (!current) "ON" else "OFF"}")
}

// v1860: canceled mode
internal fun PlayerActivity.showV1860CanceledToggle() {
    val current = FeaturePrefsStore.batch1851.v1860canceled
    FeaturePrefsStore.batch1851.v1860canceled = !current
    AppToast.show(this, "canceled: ${if (!current) "ON" else "OFF"}")
}

// v1860: captured mode
internal fun PlayerActivity.showV1860CapturedToggle() {
    val current = FeaturePrefsStore.batch1851.v1860captured
    FeaturePrefsStore.batch1851.v1860captured = !current
    AppToast.show(this, "captured: ${if (!current) "ON" else "OFF"}")
}
