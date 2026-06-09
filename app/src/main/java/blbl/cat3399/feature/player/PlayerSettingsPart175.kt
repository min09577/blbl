package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1931: depressed mode
internal fun PlayerActivity.showV1931DepressedToggle() {
    val current = FeaturePrefsStore.batch1931.v1931depressed
    FeaturePrefsStore.batch1931.v1931depressed = !current
    AppToast.show(this, "depressed: ${if (!current) "ON" else "OFF"}")
}

// v1931: deprived mode
internal fun PlayerActivity.showV1931DeprivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1931deprived
    FeaturePrefsStore.batch1931.v1931deprived = !current
    AppToast.show(this, "deprived: ${if (!current) "ON" else "OFF"}")
}

// v1931: derived mode
internal fun PlayerActivity.showV1931DerivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1931derived
    FeaturePrefsStore.batch1931.v1931derived = !current
    AppToast.show(this, "derived: ${if (!current) "ON" else "OFF"}")
}

// v1931: described mode
internal fun PlayerActivity.showV1931DescribedToggle() {
    val current = FeaturePrefsStore.batch1931.v1931described
    FeaturePrefsStore.batch1931.v1931described = !current
    AppToast.show(this, "described: ${if (!current) "ON" else "OFF"}")
}

// v1931: deserved mode
internal fun PlayerActivity.showV1931DeservedToggle() {
    val current = FeaturePrefsStore.batch1931.v1931deserved
    FeaturePrefsStore.batch1931.v1931deserved = !current
    AppToast.show(this, "deserved: ${if (!current) "ON" else "OFF"}")
}

// v1931: desired level
internal fun PlayerActivity.showV1931DesiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1931desired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1931desired = value
        AppToast.show(this, "desired: $value")
    }
}

// v1931: destroyed level
internal fun PlayerActivity.showV1931DestroyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1931destroyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "destroyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1931destroyed = value
        AppToast.show(this, "destroyed: $value")
    }
}

// v1931: detected level
internal fun PlayerActivity.showV1931DetectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1931detected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1931detected = value
        AppToast.show(this, "detected: $value")
    }
}

// v1931: determined level
internal fun PlayerActivity.showV1931DeterminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1931determined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "determined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1931determined = value
        AppToast.show(this, "determined: $value")
    }
}

// v1931: developed level
internal fun PlayerActivity.showV1931DevelopedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1931developed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "developed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1931developed = value
        AppToast.show(this, "developed: $value")
    }
}

// v1931: devised mode
internal fun PlayerActivity.showV1931DevisedToggle() {
    val current = FeaturePrefsStore.batch1931.v1931devised
    FeaturePrefsStore.batch1931.v1931devised = !current
    AppToast.show(this, "devised: ${if (!current) "ON" else "OFF"}")
}

// v1931: differed mode
internal fun PlayerActivity.showV1931DifferedToggle() {
    val current = FeaturePrefsStore.batch1931.v1931differed
    FeaturePrefsStore.batch1931.v1931differed = !current
    AppToast.show(this, "differed: ${if (!current) "ON" else "OFF"}")
}

// v1931: digested mode
internal fun PlayerActivity.showV1931DigestedToggle() {
    val current = FeaturePrefsStore.batch1931.v1931digested
    FeaturePrefsStore.batch1931.v1931digested = !current
    AppToast.show(this, "digested: ${if (!current) "ON" else "OFF"}")
}

// v1931: directed mode
internal fun PlayerActivity.showV1931DirectedToggle() {
    val current = FeaturePrefsStore.batch1931.v1931directed
    FeaturePrefsStore.batch1931.v1931directed = !current
    AppToast.show(this, "directed: ${if (!current) "ON" else "OFF"}")
}

// v1931: disabled mode
internal fun PlayerActivity.showV1931DisabledToggle() {
    val current = FeaturePrefsStore.batch1931.v1931disabled
    FeaturePrefsStore.batch1931.v1931disabled = !current
    AppToast.show(this, "disabled: ${if (!current) "ON" else "OFF"}")
}

// v1932: depressed mode
internal fun PlayerActivity.showV1932DepressedToggle() {
    val current = FeaturePrefsStore.batch1931.v1932depressed
    FeaturePrefsStore.batch1931.v1932depressed = !current
    AppToast.show(this, "depressed: ${if (!current) "ON" else "OFF"}")
}

// v1932: deprived mode
internal fun PlayerActivity.showV1932DeprivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1932deprived
    FeaturePrefsStore.batch1931.v1932deprived = !current
    AppToast.show(this, "deprived: ${if (!current) "ON" else "OFF"}")
}

// v1932: derived mode
internal fun PlayerActivity.showV1932DerivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1932derived
    FeaturePrefsStore.batch1931.v1932derived = !current
    AppToast.show(this, "derived: ${if (!current) "ON" else "OFF"}")
}

// v1932: described mode
internal fun PlayerActivity.showV1932DescribedToggle() {
    val current = FeaturePrefsStore.batch1931.v1932described
    FeaturePrefsStore.batch1931.v1932described = !current
    AppToast.show(this, "described: ${if (!current) "ON" else "OFF"}")
}

// v1932: deserved mode
internal fun PlayerActivity.showV1932DeservedToggle() {
    val current = FeaturePrefsStore.batch1931.v1932deserved
    FeaturePrefsStore.batch1931.v1932deserved = !current
    AppToast.show(this, "deserved: ${if (!current) "ON" else "OFF"}")
}

// v1932: desired level
internal fun PlayerActivity.showV1932DesiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1932desired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1932desired = value
        AppToast.show(this, "desired: $value")
    }
}

// v1932: destroyed level
internal fun PlayerActivity.showV1932DestroyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1932destroyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "destroyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1932destroyed = value
        AppToast.show(this, "destroyed: $value")
    }
}

// v1932: detected level
internal fun PlayerActivity.showV1932DetectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1932detected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1932detected = value
        AppToast.show(this, "detected: $value")
    }
}

// v1932: determined level
internal fun PlayerActivity.showV1932DeterminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1932determined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "determined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1932determined = value
        AppToast.show(this, "determined: $value")
    }
}

// v1932: developed level
internal fun PlayerActivity.showV1932DevelopedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1932developed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "developed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1932developed = value
        AppToast.show(this, "developed: $value")
    }
}

// v1932: devised mode
internal fun PlayerActivity.showV1932DevisedToggle() {
    val current = FeaturePrefsStore.batch1931.v1932devised
    FeaturePrefsStore.batch1931.v1932devised = !current
    AppToast.show(this, "devised: ${if (!current) "ON" else "OFF"}")
}

// v1932: differed mode
internal fun PlayerActivity.showV1932DifferedToggle() {
    val current = FeaturePrefsStore.batch1931.v1932differed
    FeaturePrefsStore.batch1931.v1932differed = !current
    AppToast.show(this, "differed: ${if (!current) "ON" else "OFF"}")
}

// v1932: digested mode
internal fun PlayerActivity.showV1932DigestedToggle() {
    val current = FeaturePrefsStore.batch1931.v1932digested
    FeaturePrefsStore.batch1931.v1932digested = !current
    AppToast.show(this, "digested: ${if (!current) "ON" else "OFF"}")
}

// v1932: directed mode
internal fun PlayerActivity.showV1932DirectedToggle() {
    val current = FeaturePrefsStore.batch1931.v1932directed
    FeaturePrefsStore.batch1931.v1932directed = !current
    AppToast.show(this, "directed: ${if (!current) "ON" else "OFF"}")
}

// v1932: disabled mode
internal fun PlayerActivity.showV1932DisabledToggle() {
    val current = FeaturePrefsStore.batch1931.v1932disabled
    FeaturePrefsStore.batch1931.v1932disabled = !current
    AppToast.show(this, "disabled: ${if (!current) "ON" else "OFF"}")
}

// v1933: depressed mode
internal fun PlayerActivity.showV1933DepressedToggle() {
    val current = FeaturePrefsStore.batch1931.v1933depressed
    FeaturePrefsStore.batch1931.v1933depressed = !current
    AppToast.show(this, "depressed: ${if (!current) "ON" else "OFF"}")
}

// v1933: deprived mode
internal fun PlayerActivity.showV1933DeprivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1933deprived
    FeaturePrefsStore.batch1931.v1933deprived = !current
    AppToast.show(this, "deprived: ${if (!current) "ON" else "OFF"}")
}

// v1933: derived mode
internal fun PlayerActivity.showV1933DerivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1933derived
    FeaturePrefsStore.batch1931.v1933derived = !current
    AppToast.show(this, "derived: ${if (!current) "ON" else "OFF"}")
}

// v1933: described mode
internal fun PlayerActivity.showV1933DescribedToggle() {
    val current = FeaturePrefsStore.batch1931.v1933described
    FeaturePrefsStore.batch1931.v1933described = !current
    AppToast.show(this, "described: ${if (!current) "ON" else "OFF"}")
}

// v1933: deserved mode
internal fun PlayerActivity.showV1933DeservedToggle() {
    val current = FeaturePrefsStore.batch1931.v1933deserved
    FeaturePrefsStore.batch1931.v1933deserved = !current
    AppToast.show(this, "deserved: ${if (!current) "ON" else "OFF"}")
}

// v1933: desired level
internal fun PlayerActivity.showV1933DesiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1933desired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1933desired = value
        AppToast.show(this, "desired: $value")
    }
}

// v1933: destroyed level
internal fun PlayerActivity.showV1933DestroyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1933destroyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "destroyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1933destroyed = value
        AppToast.show(this, "destroyed: $value")
    }
}

// v1933: detected level
internal fun PlayerActivity.showV1933DetectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1933detected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1933detected = value
        AppToast.show(this, "detected: $value")
    }
}

// v1933: determined level
internal fun PlayerActivity.showV1933DeterminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1933determined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "determined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1933determined = value
        AppToast.show(this, "determined: $value")
    }
}

// v1933: developed level
internal fun PlayerActivity.showV1933DevelopedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1933developed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "developed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1933developed = value
        AppToast.show(this, "developed: $value")
    }
}

// v1933: devised mode
internal fun PlayerActivity.showV1933DevisedToggle() {
    val current = FeaturePrefsStore.batch1931.v1933devised
    FeaturePrefsStore.batch1931.v1933devised = !current
    AppToast.show(this, "devised: ${if (!current) "ON" else "OFF"}")
}

// v1933: differed mode
internal fun PlayerActivity.showV1933DifferedToggle() {
    val current = FeaturePrefsStore.batch1931.v1933differed
    FeaturePrefsStore.batch1931.v1933differed = !current
    AppToast.show(this, "differed: ${if (!current) "ON" else "OFF"}")
}

// v1933: digested mode
internal fun PlayerActivity.showV1933DigestedToggle() {
    val current = FeaturePrefsStore.batch1931.v1933digested
    FeaturePrefsStore.batch1931.v1933digested = !current
    AppToast.show(this, "digested: ${if (!current) "ON" else "OFF"}")
}

// v1933: directed mode
internal fun PlayerActivity.showV1933DirectedToggle() {
    val current = FeaturePrefsStore.batch1931.v1933directed
    FeaturePrefsStore.batch1931.v1933directed = !current
    AppToast.show(this, "directed: ${if (!current) "ON" else "OFF"}")
}

// v1933: disabled mode
internal fun PlayerActivity.showV1933DisabledToggle() {
    val current = FeaturePrefsStore.batch1931.v1933disabled
    FeaturePrefsStore.batch1931.v1933disabled = !current
    AppToast.show(this, "disabled: ${if (!current) "ON" else "OFF"}")
}

// v1934: depressed mode
internal fun PlayerActivity.showV1934DepressedToggle() {
    val current = FeaturePrefsStore.batch1931.v1934depressed
    FeaturePrefsStore.batch1931.v1934depressed = !current
    AppToast.show(this, "depressed: ${if (!current) "ON" else "OFF"}")
}

// v1934: deprived mode
internal fun PlayerActivity.showV1934DeprivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1934deprived
    FeaturePrefsStore.batch1931.v1934deprived = !current
    AppToast.show(this, "deprived: ${if (!current) "ON" else "OFF"}")
}

// v1934: derived mode
internal fun PlayerActivity.showV1934DerivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1934derived
    FeaturePrefsStore.batch1931.v1934derived = !current
    AppToast.show(this, "derived: ${if (!current) "ON" else "OFF"}")
}

// v1934: described mode
internal fun PlayerActivity.showV1934DescribedToggle() {
    val current = FeaturePrefsStore.batch1931.v1934described
    FeaturePrefsStore.batch1931.v1934described = !current
    AppToast.show(this, "described: ${if (!current) "ON" else "OFF"}")
}

// v1934: deserved mode
internal fun PlayerActivity.showV1934DeservedToggle() {
    val current = FeaturePrefsStore.batch1931.v1934deserved
    FeaturePrefsStore.batch1931.v1934deserved = !current
    AppToast.show(this, "deserved: ${if (!current) "ON" else "OFF"}")
}

// v1934: desired level
internal fun PlayerActivity.showV1934DesiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1934desired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1934desired = value
        AppToast.show(this, "desired: $value")
    }
}

// v1934: destroyed level
internal fun PlayerActivity.showV1934DestroyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1934destroyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "destroyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1934destroyed = value
        AppToast.show(this, "destroyed: $value")
    }
}

// v1934: detected level
internal fun PlayerActivity.showV1934DetectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1934detected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1934detected = value
        AppToast.show(this, "detected: $value")
    }
}

// v1934: determined level
internal fun PlayerActivity.showV1934DeterminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1934determined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "determined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1934determined = value
        AppToast.show(this, "determined: $value")
    }
}

// v1934: developed level
internal fun PlayerActivity.showV1934DevelopedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1934developed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "developed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1934developed = value
        AppToast.show(this, "developed: $value")
    }
}

// v1934: devised mode
internal fun PlayerActivity.showV1934DevisedToggle() {
    val current = FeaturePrefsStore.batch1931.v1934devised
    FeaturePrefsStore.batch1931.v1934devised = !current
    AppToast.show(this, "devised: ${if (!current) "ON" else "OFF"}")
}

// v1934: differed mode
internal fun PlayerActivity.showV1934DifferedToggle() {
    val current = FeaturePrefsStore.batch1931.v1934differed
    FeaturePrefsStore.batch1931.v1934differed = !current
    AppToast.show(this, "differed: ${if (!current) "ON" else "OFF"}")
}

// v1934: digested mode
internal fun PlayerActivity.showV1934DigestedToggle() {
    val current = FeaturePrefsStore.batch1931.v1934digested
    FeaturePrefsStore.batch1931.v1934digested = !current
    AppToast.show(this, "digested: ${if (!current) "ON" else "OFF"}")
}

// v1934: directed mode
internal fun PlayerActivity.showV1934DirectedToggle() {
    val current = FeaturePrefsStore.batch1931.v1934directed
    FeaturePrefsStore.batch1931.v1934directed = !current
    AppToast.show(this, "directed: ${if (!current) "ON" else "OFF"}")
}

// v1934: disabled mode
internal fun PlayerActivity.showV1934DisabledToggle() {
    val current = FeaturePrefsStore.batch1931.v1934disabled
    FeaturePrefsStore.batch1931.v1934disabled = !current
    AppToast.show(this, "disabled: ${if (!current) "ON" else "OFF"}")
}

// v1935: depressed mode
internal fun PlayerActivity.showV1935DepressedToggle() {
    val current = FeaturePrefsStore.batch1931.v1935depressed
    FeaturePrefsStore.batch1931.v1935depressed = !current
    AppToast.show(this, "depressed: ${if (!current) "ON" else "OFF"}")
}

// v1935: deprived mode
internal fun PlayerActivity.showV1935DeprivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1935deprived
    FeaturePrefsStore.batch1931.v1935deprived = !current
    AppToast.show(this, "deprived: ${if (!current) "ON" else "OFF"}")
}

// v1935: derived mode
internal fun PlayerActivity.showV1935DerivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1935derived
    FeaturePrefsStore.batch1931.v1935derived = !current
    AppToast.show(this, "derived: ${if (!current) "ON" else "OFF"}")
}

// v1935: described mode
internal fun PlayerActivity.showV1935DescribedToggle() {
    val current = FeaturePrefsStore.batch1931.v1935described
    FeaturePrefsStore.batch1931.v1935described = !current
    AppToast.show(this, "described: ${if (!current) "ON" else "OFF"}")
}

// v1935: deserved mode
internal fun PlayerActivity.showV1935DeservedToggle() {
    val current = FeaturePrefsStore.batch1931.v1935deserved
    FeaturePrefsStore.batch1931.v1935deserved = !current
    AppToast.show(this, "deserved: ${if (!current) "ON" else "OFF"}")
}

// v1935: desired level
internal fun PlayerActivity.showV1935DesiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1935desired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1935desired = value
        AppToast.show(this, "desired: $value")
    }
}

// v1935: destroyed level
internal fun PlayerActivity.showV1935DestroyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1935destroyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "destroyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1935destroyed = value
        AppToast.show(this, "destroyed: $value")
    }
}

// v1935: detected level
internal fun PlayerActivity.showV1935DetectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1935detected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1935detected = value
        AppToast.show(this, "detected: $value")
    }
}

// v1935: determined level
internal fun PlayerActivity.showV1935DeterminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1935determined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "determined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1935determined = value
        AppToast.show(this, "determined: $value")
    }
}

// v1935: developed level
internal fun PlayerActivity.showV1935DevelopedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1935developed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "developed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1935developed = value
        AppToast.show(this, "developed: $value")
    }
}

// v1935: devised mode
internal fun PlayerActivity.showV1935DevisedToggle() {
    val current = FeaturePrefsStore.batch1931.v1935devised
    FeaturePrefsStore.batch1931.v1935devised = !current
    AppToast.show(this, "devised: ${if (!current) "ON" else "OFF"}")
}

// v1935: differed mode
internal fun PlayerActivity.showV1935DifferedToggle() {
    val current = FeaturePrefsStore.batch1931.v1935differed
    FeaturePrefsStore.batch1931.v1935differed = !current
    AppToast.show(this, "differed: ${if (!current) "ON" else "OFF"}")
}

// v1935: digested mode
internal fun PlayerActivity.showV1935DigestedToggle() {
    val current = FeaturePrefsStore.batch1931.v1935digested
    FeaturePrefsStore.batch1931.v1935digested = !current
    AppToast.show(this, "digested: ${if (!current) "ON" else "OFF"}")
}

// v1935: directed mode
internal fun PlayerActivity.showV1935DirectedToggle() {
    val current = FeaturePrefsStore.batch1931.v1935directed
    FeaturePrefsStore.batch1931.v1935directed = !current
    AppToast.show(this, "directed: ${if (!current) "ON" else "OFF"}")
}

// v1935: disabled mode
internal fun PlayerActivity.showV1935DisabledToggle() {
    val current = FeaturePrefsStore.batch1931.v1935disabled
    FeaturePrefsStore.batch1931.v1935disabled = !current
    AppToast.show(this, "disabled: ${if (!current) "ON" else "OFF"}")
}

// v1936: depressed mode
internal fun PlayerActivity.showV1936DepressedToggle() {
    val current = FeaturePrefsStore.batch1931.v1936depressed
    FeaturePrefsStore.batch1931.v1936depressed = !current
    AppToast.show(this, "depressed: ${if (!current) "ON" else "OFF"}")
}

// v1936: deprived mode
internal fun PlayerActivity.showV1936DeprivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1936deprived
    FeaturePrefsStore.batch1931.v1936deprived = !current
    AppToast.show(this, "deprived: ${if (!current) "ON" else "OFF"}")
}

// v1936: derived mode
internal fun PlayerActivity.showV1936DerivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1936derived
    FeaturePrefsStore.batch1931.v1936derived = !current
    AppToast.show(this, "derived: ${if (!current) "ON" else "OFF"}")
}

// v1936: described mode
internal fun PlayerActivity.showV1936DescribedToggle() {
    val current = FeaturePrefsStore.batch1931.v1936described
    FeaturePrefsStore.batch1931.v1936described = !current
    AppToast.show(this, "described: ${if (!current) "ON" else "OFF"}")
}

// v1936: deserved mode
internal fun PlayerActivity.showV1936DeservedToggle() {
    val current = FeaturePrefsStore.batch1931.v1936deserved
    FeaturePrefsStore.batch1931.v1936deserved = !current
    AppToast.show(this, "deserved: ${if (!current) "ON" else "OFF"}")
}

// v1936: desired level
internal fun PlayerActivity.showV1936DesiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1936desired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1936desired = value
        AppToast.show(this, "desired: $value")
    }
}

// v1936: destroyed level
internal fun PlayerActivity.showV1936DestroyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1936destroyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "destroyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1936destroyed = value
        AppToast.show(this, "destroyed: $value")
    }
}

// v1936: detected level
internal fun PlayerActivity.showV1936DetectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1936detected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1936detected = value
        AppToast.show(this, "detected: $value")
    }
}

// v1936: determined level
internal fun PlayerActivity.showV1936DeterminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1936determined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "determined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1936determined = value
        AppToast.show(this, "determined: $value")
    }
}

// v1936: developed level
internal fun PlayerActivity.showV1936DevelopedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1936developed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "developed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1936developed = value
        AppToast.show(this, "developed: $value")
    }
}

// v1936: devised mode
internal fun PlayerActivity.showV1936DevisedToggle() {
    val current = FeaturePrefsStore.batch1931.v1936devised
    FeaturePrefsStore.batch1931.v1936devised = !current
    AppToast.show(this, "devised: ${if (!current) "ON" else "OFF"}")
}

// v1936: differed mode
internal fun PlayerActivity.showV1936DifferedToggle() {
    val current = FeaturePrefsStore.batch1931.v1936differed
    FeaturePrefsStore.batch1931.v1936differed = !current
    AppToast.show(this, "differed: ${if (!current) "ON" else "OFF"}")
}

// v1936: digested mode
internal fun PlayerActivity.showV1936DigestedToggle() {
    val current = FeaturePrefsStore.batch1931.v1936digested
    FeaturePrefsStore.batch1931.v1936digested = !current
    AppToast.show(this, "digested: ${if (!current) "ON" else "OFF"}")
}

// v1936: directed mode
internal fun PlayerActivity.showV1936DirectedToggle() {
    val current = FeaturePrefsStore.batch1931.v1936directed
    FeaturePrefsStore.batch1931.v1936directed = !current
    AppToast.show(this, "directed: ${if (!current) "ON" else "OFF"}")
}

// v1936: disabled mode
internal fun PlayerActivity.showV1936DisabledToggle() {
    val current = FeaturePrefsStore.batch1931.v1936disabled
    FeaturePrefsStore.batch1931.v1936disabled = !current
    AppToast.show(this, "disabled: ${if (!current) "ON" else "OFF"}")
}

// v1937: depressed mode
internal fun PlayerActivity.showV1937DepressedToggle() {
    val current = FeaturePrefsStore.batch1931.v1937depressed
    FeaturePrefsStore.batch1931.v1937depressed = !current
    AppToast.show(this, "depressed: ${if (!current) "ON" else "OFF"}")
}

// v1937: deprived mode
internal fun PlayerActivity.showV1937DeprivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1937deprived
    FeaturePrefsStore.batch1931.v1937deprived = !current
    AppToast.show(this, "deprived: ${if (!current) "ON" else "OFF"}")
}

// v1937: derived mode
internal fun PlayerActivity.showV1937DerivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1937derived
    FeaturePrefsStore.batch1931.v1937derived = !current
    AppToast.show(this, "derived: ${if (!current) "ON" else "OFF"}")
}

// v1937: described mode
internal fun PlayerActivity.showV1937DescribedToggle() {
    val current = FeaturePrefsStore.batch1931.v1937described
    FeaturePrefsStore.batch1931.v1937described = !current
    AppToast.show(this, "described: ${if (!current) "ON" else "OFF"}")
}

// v1937: deserved mode
internal fun PlayerActivity.showV1937DeservedToggle() {
    val current = FeaturePrefsStore.batch1931.v1937deserved
    FeaturePrefsStore.batch1931.v1937deserved = !current
    AppToast.show(this, "deserved: ${if (!current) "ON" else "OFF"}")
}

// v1937: desired level
internal fun PlayerActivity.showV1937DesiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1937desired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1937desired = value
        AppToast.show(this, "desired: $value")
    }
}

// v1937: destroyed level
internal fun PlayerActivity.showV1937DestroyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1937destroyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "destroyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1937destroyed = value
        AppToast.show(this, "destroyed: $value")
    }
}

// v1937: detected level
internal fun PlayerActivity.showV1937DetectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1937detected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1937detected = value
        AppToast.show(this, "detected: $value")
    }
}

// v1937: determined level
internal fun PlayerActivity.showV1937DeterminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1937determined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "determined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1937determined = value
        AppToast.show(this, "determined: $value")
    }
}

// v1937: developed level
internal fun PlayerActivity.showV1937DevelopedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1937developed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "developed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1937developed = value
        AppToast.show(this, "developed: $value")
    }
}

// v1937: devised mode
internal fun PlayerActivity.showV1937DevisedToggle() {
    val current = FeaturePrefsStore.batch1931.v1937devised
    FeaturePrefsStore.batch1931.v1937devised = !current
    AppToast.show(this, "devised: ${if (!current) "ON" else "OFF"}")
}

// v1937: differed mode
internal fun PlayerActivity.showV1937DifferedToggle() {
    val current = FeaturePrefsStore.batch1931.v1937differed
    FeaturePrefsStore.batch1931.v1937differed = !current
    AppToast.show(this, "differed: ${if (!current) "ON" else "OFF"}")
}

// v1937: digested mode
internal fun PlayerActivity.showV1937DigestedToggle() {
    val current = FeaturePrefsStore.batch1931.v1937digested
    FeaturePrefsStore.batch1931.v1937digested = !current
    AppToast.show(this, "digested: ${if (!current) "ON" else "OFF"}")
}

// v1937: directed mode
internal fun PlayerActivity.showV1937DirectedToggle() {
    val current = FeaturePrefsStore.batch1931.v1937directed
    FeaturePrefsStore.batch1931.v1937directed = !current
    AppToast.show(this, "directed: ${if (!current) "ON" else "OFF"}")
}

// v1937: disabled mode
internal fun PlayerActivity.showV1937DisabledToggle() {
    val current = FeaturePrefsStore.batch1931.v1937disabled
    FeaturePrefsStore.batch1931.v1937disabled = !current
    AppToast.show(this, "disabled: ${if (!current) "ON" else "OFF"}")
}

// v1938: depressed mode
internal fun PlayerActivity.showV1938DepressedToggle() {
    val current = FeaturePrefsStore.batch1931.v1938depressed
    FeaturePrefsStore.batch1931.v1938depressed = !current
    AppToast.show(this, "depressed: ${if (!current) "ON" else "OFF"}")
}

// v1938: deprived mode
internal fun PlayerActivity.showV1938DeprivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1938deprived
    FeaturePrefsStore.batch1931.v1938deprived = !current
    AppToast.show(this, "deprived: ${if (!current) "ON" else "OFF"}")
}

// v1938: derived mode
internal fun PlayerActivity.showV1938DerivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1938derived
    FeaturePrefsStore.batch1931.v1938derived = !current
    AppToast.show(this, "derived: ${if (!current) "ON" else "OFF"}")
}

// v1938: described mode
internal fun PlayerActivity.showV1938DescribedToggle() {
    val current = FeaturePrefsStore.batch1931.v1938described
    FeaturePrefsStore.batch1931.v1938described = !current
    AppToast.show(this, "described: ${if (!current) "ON" else "OFF"}")
}

// v1938: deserved mode
internal fun PlayerActivity.showV1938DeservedToggle() {
    val current = FeaturePrefsStore.batch1931.v1938deserved
    FeaturePrefsStore.batch1931.v1938deserved = !current
    AppToast.show(this, "deserved: ${if (!current) "ON" else "OFF"}")
}

// v1938: desired level
internal fun PlayerActivity.showV1938DesiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1938desired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1938desired = value
        AppToast.show(this, "desired: $value")
    }
}

// v1938: destroyed level
internal fun PlayerActivity.showV1938DestroyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1938destroyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "destroyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1938destroyed = value
        AppToast.show(this, "destroyed: $value")
    }
}

// v1938: detected level
internal fun PlayerActivity.showV1938DetectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1938detected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1938detected = value
        AppToast.show(this, "detected: $value")
    }
}

// v1938: determined level
internal fun PlayerActivity.showV1938DeterminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1938determined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "determined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1938determined = value
        AppToast.show(this, "determined: $value")
    }
}

// v1938: developed level
internal fun PlayerActivity.showV1938DevelopedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1938developed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "developed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1938developed = value
        AppToast.show(this, "developed: $value")
    }
}

// v1938: devised mode
internal fun PlayerActivity.showV1938DevisedToggle() {
    val current = FeaturePrefsStore.batch1931.v1938devised
    FeaturePrefsStore.batch1931.v1938devised = !current
    AppToast.show(this, "devised: ${if (!current) "ON" else "OFF"}")
}

// v1938: differed mode
internal fun PlayerActivity.showV1938DifferedToggle() {
    val current = FeaturePrefsStore.batch1931.v1938differed
    FeaturePrefsStore.batch1931.v1938differed = !current
    AppToast.show(this, "differed: ${if (!current) "ON" else "OFF"}")
}

// v1938: digested mode
internal fun PlayerActivity.showV1938DigestedToggle() {
    val current = FeaturePrefsStore.batch1931.v1938digested
    FeaturePrefsStore.batch1931.v1938digested = !current
    AppToast.show(this, "digested: ${if (!current) "ON" else "OFF"}")
}

// v1938: directed mode
internal fun PlayerActivity.showV1938DirectedToggle() {
    val current = FeaturePrefsStore.batch1931.v1938directed
    FeaturePrefsStore.batch1931.v1938directed = !current
    AppToast.show(this, "directed: ${if (!current) "ON" else "OFF"}")
}

// v1938: disabled mode
internal fun PlayerActivity.showV1938DisabledToggle() {
    val current = FeaturePrefsStore.batch1931.v1938disabled
    FeaturePrefsStore.batch1931.v1938disabled = !current
    AppToast.show(this, "disabled: ${if (!current) "ON" else "OFF"}")
}

// v1939: depressed mode
internal fun PlayerActivity.showV1939DepressedToggle() {
    val current = FeaturePrefsStore.batch1931.v1939depressed
    FeaturePrefsStore.batch1931.v1939depressed = !current
    AppToast.show(this, "depressed: ${if (!current) "ON" else "OFF"}")
}

// v1939: deprived mode
internal fun PlayerActivity.showV1939DeprivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1939deprived
    FeaturePrefsStore.batch1931.v1939deprived = !current
    AppToast.show(this, "deprived: ${if (!current) "ON" else "OFF"}")
}

// v1939: derived mode
internal fun PlayerActivity.showV1939DerivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1939derived
    FeaturePrefsStore.batch1931.v1939derived = !current
    AppToast.show(this, "derived: ${if (!current) "ON" else "OFF"}")
}

// v1939: described mode
internal fun PlayerActivity.showV1939DescribedToggle() {
    val current = FeaturePrefsStore.batch1931.v1939described
    FeaturePrefsStore.batch1931.v1939described = !current
    AppToast.show(this, "described: ${if (!current) "ON" else "OFF"}")
}

// v1939: deserved mode
internal fun PlayerActivity.showV1939DeservedToggle() {
    val current = FeaturePrefsStore.batch1931.v1939deserved
    FeaturePrefsStore.batch1931.v1939deserved = !current
    AppToast.show(this, "deserved: ${if (!current) "ON" else "OFF"}")
}

// v1939: desired level
internal fun PlayerActivity.showV1939DesiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1939desired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1939desired = value
        AppToast.show(this, "desired: $value")
    }
}

// v1939: destroyed level
internal fun PlayerActivity.showV1939DestroyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1939destroyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "destroyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1939destroyed = value
        AppToast.show(this, "destroyed: $value")
    }
}

// v1939: detected level
internal fun PlayerActivity.showV1939DetectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1939detected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1939detected = value
        AppToast.show(this, "detected: $value")
    }
}

// v1939: determined level
internal fun PlayerActivity.showV1939DeterminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1939determined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "determined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1939determined = value
        AppToast.show(this, "determined: $value")
    }
}

// v1939: developed level
internal fun PlayerActivity.showV1939DevelopedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1939developed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "developed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1939developed = value
        AppToast.show(this, "developed: $value")
    }
}

// v1939: devised mode
internal fun PlayerActivity.showV1939DevisedToggle() {
    val current = FeaturePrefsStore.batch1931.v1939devised
    FeaturePrefsStore.batch1931.v1939devised = !current
    AppToast.show(this, "devised: ${if (!current) "ON" else "OFF"}")
}

// v1939: differed mode
internal fun PlayerActivity.showV1939DifferedToggle() {
    val current = FeaturePrefsStore.batch1931.v1939differed
    FeaturePrefsStore.batch1931.v1939differed = !current
    AppToast.show(this, "differed: ${if (!current) "ON" else "OFF"}")
}

// v1939: digested mode
internal fun PlayerActivity.showV1939DigestedToggle() {
    val current = FeaturePrefsStore.batch1931.v1939digested
    FeaturePrefsStore.batch1931.v1939digested = !current
    AppToast.show(this, "digested: ${if (!current) "ON" else "OFF"}")
}

// v1939: directed mode
internal fun PlayerActivity.showV1939DirectedToggle() {
    val current = FeaturePrefsStore.batch1931.v1939directed
    FeaturePrefsStore.batch1931.v1939directed = !current
    AppToast.show(this, "directed: ${if (!current) "ON" else "OFF"}")
}

// v1939: disabled mode
internal fun PlayerActivity.showV1939DisabledToggle() {
    val current = FeaturePrefsStore.batch1931.v1939disabled
    FeaturePrefsStore.batch1931.v1939disabled = !current
    AppToast.show(this, "disabled: ${if (!current) "ON" else "OFF"}")
}

// v1940: depressed mode
internal fun PlayerActivity.showV1940DepressedToggle() {
    val current = FeaturePrefsStore.batch1931.v1940depressed
    FeaturePrefsStore.batch1931.v1940depressed = !current
    AppToast.show(this, "depressed: ${if (!current) "ON" else "OFF"}")
}

// v1940: deprived mode
internal fun PlayerActivity.showV1940DeprivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1940deprived
    FeaturePrefsStore.batch1931.v1940deprived = !current
    AppToast.show(this, "deprived: ${if (!current) "ON" else "OFF"}")
}

// v1940: derived mode
internal fun PlayerActivity.showV1940DerivedToggle() {
    val current = FeaturePrefsStore.batch1931.v1940derived
    FeaturePrefsStore.batch1931.v1940derived = !current
    AppToast.show(this, "derived: ${if (!current) "ON" else "OFF"}")
}

// v1940: described mode
internal fun PlayerActivity.showV1940DescribedToggle() {
    val current = FeaturePrefsStore.batch1931.v1940described
    FeaturePrefsStore.batch1931.v1940described = !current
    AppToast.show(this, "described: ${if (!current) "ON" else "OFF"}")
}

// v1940: deserved mode
internal fun PlayerActivity.showV1940DeservedToggle() {
    val current = FeaturePrefsStore.batch1931.v1940deserved
    FeaturePrefsStore.batch1931.v1940deserved = !current
    AppToast.show(this, "deserved: ${if (!current) "ON" else "OFF"}")
}

// v1940: desired level
internal fun PlayerActivity.showV1940DesiredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1940desired).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desired level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1940desired = value
        AppToast.show(this, "desired: $value")
    }
}

// v1940: destroyed level
internal fun PlayerActivity.showV1940DestroyedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1940destroyed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "destroyed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1940destroyed = value
        AppToast.show(this, "destroyed: $value")
    }
}

// v1940: detected level
internal fun PlayerActivity.showV1940DetectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1940detected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1940detected = value
        AppToast.show(this, "detected: $value")
    }
}

// v1940: determined level
internal fun PlayerActivity.showV1940DeterminedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1940determined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "determined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1940determined = value
        AppToast.show(this, "determined: $value")
    }
}

// v1940: developed level
internal fun PlayerActivity.showV1940DevelopedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1931.v1940developed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "developed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1931.v1940developed = value
        AppToast.show(this, "developed: $value")
    }
}

// v1940: devised mode
internal fun PlayerActivity.showV1940DevisedToggle() {
    val current = FeaturePrefsStore.batch1931.v1940devised
    FeaturePrefsStore.batch1931.v1940devised = !current
    AppToast.show(this, "devised: ${if (!current) "ON" else "OFF"}")
}

// v1940: differed mode
internal fun PlayerActivity.showV1940DifferedToggle() {
    val current = FeaturePrefsStore.batch1931.v1940differed
    FeaturePrefsStore.batch1931.v1940differed = !current
    AppToast.show(this, "differed: ${if (!current) "ON" else "OFF"}")
}

// v1940: digested mode
internal fun PlayerActivity.showV1940DigestedToggle() {
    val current = FeaturePrefsStore.batch1931.v1940digested
    FeaturePrefsStore.batch1931.v1940digested = !current
    AppToast.show(this, "digested: ${if (!current) "ON" else "OFF"}")
}

// v1940: directed mode
internal fun PlayerActivity.showV1940DirectedToggle() {
    val current = FeaturePrefsStore.batch1931.v1940directed
    FeaturePrefsStore.batch1931.v1940directed = !current
    AppToast.show(this, "directed: ${if (!current) "ON" else "OFF"}")
}

// v1940: disabled mode
internal fun PlayerActivity.showV1940DisabledToggle() {
    val current = FeaturePrefsStore.batch1931.v1940disabled
    FeaturePrefsStore.batch1931.v1940disabled = !current
    AppToast.show(this, "disabled: ${if (!current) "ON" else "OFF"}")
}

